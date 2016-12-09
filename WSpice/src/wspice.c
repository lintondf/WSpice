/*
 * wspice.c
 *
 *  Created on: Oct 25, 2016
 *      Author: lintondf
 */

#include <mathlink.h>
#include <WolframLibrary.h>
#include <string.h>
#include <stdlib.h>
#include "SpiceUsr.h"
#include "SpiceZmc.h"
#include "SpiceZfc.h"

#include "wspicePrint.h"

//TODO get from mice.h mock
typedef struct M_TENSOR_STRUCT       mxArray;

void wsMessage(const char* str );
void mice_fail( int cnt );
void wsSetLibraryData( WolframLibraryData _libData );

void cspice_axisar(int nlhs, mxArray *plhs[], int nrhs, const mxArray *prhs[]);

//

#include "wspice.h"
#include "zzerror.h"
#include "zzalloc.h"

#ifndef DLLEXPORT
#define DLLEXPORT
#endif

#include <stdio.h>

void loadTestData() {
	furnsh_c("/Users/lintondf/Google Drive/cspice/data/naif0011.tls.pc");
	furnsh_c("/Users/lintondf/Google Drive/cspice/data/pck00010.tpc");
	furnsh_c("/Users/lintondf/Google Drive/cspice/data/moon_080317.tf");
	furnsh_c("/Users/lintondf/Google Drive/cspice/data/de430.bsp");
	furnsh_c("/Users/lintondf/Google Drive/cspice/data/geophysical.ker");
	furnsh_c("/Users/lintondf/Google Drive/cspice/data/moon_pa_de421_1900-2050.bpc");
}


static char smsg[1800];
static char msg[1800];

static char* cleanErrorMessage(WolframLibraryData libData) {
	getmsg_c("SHORT", sizeof(smsg), smsg);
	char* out = smsg + 6;  // skip SPICE(
	int n = strlen(out);
	out[n - 1] = '\0'; // drop final )
	strcpy(msg, out);
	strcat(msg, " : ");
	n = strlen(msg);
	getmsg_c("LONG", sizeof(msg) - n, msg + n);
	strcat(msg, " : ");
	n = strlen(msg);
	getmsg_c("EXPLAIN", sizeof(msg) - n, msg + n);
	strcat(msg, "\n");
	reportErrorToMathematica(libData, out, msg);
	return out;
}

#define RETURN_IF_CSPICE_ERROR         if (failed_c()) { \
                libData->Message(cleanErrorMessage(libData)); \
                reset_c(); \
                return LIBRARY_FUNCTION_ERROR; \
        }

#define RETURN_IF_MATHEMATICA_FALSE(tf, msg) \
		if (!(tf)) { \
			reportErrorToMathematica( libData, "mathematica", msg ); \
			libData->Message("mathematica"); \
		}


/*

Calculate/assign common values, size of the default string length.
Note, find the DEFAULT_STR_LENGTH definitions in mice.h.

*/
//SpiceInt default_str_size = DEFAULT_STR_LENGTH * sizeof(SpiceChar);
extern SpiceInt default_str_size;

static const int true = 1;
static const int false = 0;
static mint scalarDims[] = {1};

void mxDestroyArray( void* p ) {
}

MTensor wspice_MTensor_new(WolframLibraryData libData, mint type, mint ndims, mint dims[] ) {
	MTensor t;
	if (libData->MTensor_new( type, ndims, dims, &t) != LIBRARY_NO_ERROR)
		return NULL;
	return t;
}

MTensor wspice_Integer_new(WolframLibraryData libData, mint value) {
	MTensor t = wspice_MTensor_new(libData, MType_Integer, 1, scalarDims );
	libData->MTensor_setInteger( t, scalarDims, value );
	return t;
}


#define zzmice_CreateIntScalar( n ) \
		wspice_Integer_new( libData, n )


typedef struct Association_ {
	const char*  field;
	void*        value;
} Association;

void* mxGetField( void* p, mint index, const char* field ) {
	Association* pa = (Association*) p;
	for (int ia = 0; pa[ia].field != NULL; ia++) {
		if (strcmp( field, pa[ia].field) == 0) {
			return pa[ia].value;
		}
	}
	return NULL;
}
void mxSetField( void* p, mint index, const char* field, void* pv ) {
	Association* pa = (Association*) p;
	for (int ia = 0; pa[ia].field != NULL; ia++) {
		if (strcmp( field, pa[ia].field) == 0) {
			pa[ia].value = pv;
		}
	}
}

#define mxCreateLogicalScalar(value) \
	wspice_Integer_new( libData, value)

#define mxCreateString( str ) \
	str



DLLEXPORT mint WolframLibrary_getVersion() {
	return WolframLibraryVersion;
}

DLLEXPORT int WolframLibrary_initialize(WolframLibraryData libData) {
	wsSetLibraryData( libData );
	erract_c("SET", 0, "RETURN");
	flushDebug();
	loadTestData();
	return 0;
}

DLLEXPORT void WolframLibrary_uninitialize(WolframLibraryData libData) {
	wsSetLibraryData( libData );
	return;
}

DLLEXPORT int wspice_furnsh(WolframLibraryData libData, mint Argc,
		MArgument *Args, MArgument Res) {
	char *instring = MArgument_getUTF8String(Args[0]);
	furnsh_c(instring);
	libData->UTF8String_disown(instring);
	RETURN_IF_CSPICE_ERROR
	return LIBRARY_NO_ERROR;
}

void check_arg_num( int a, int b, int c, int d ) {
}

struct         extra_dims  * mice_checkargs(int                 nlhs,
                                            void           * plhs[],
                                            int                 nrhs,
                                            void     * prhs[],
                                            struct argcheck   * argcheck) {
	static struct extra_dims extra;
	extra.count = 1;
	return &extra;
}

//mxArray * zzmice_CreateIntScalar( SpiceInt n)
//   {
//
//   int                     sizearray[] = {1,1};
//   mxArray               * mx_n;
//
////   mx_n = mxCreateNumericArray( 2, sizearray, mxINT32_CLASS, mxREAL);
////
////   *(SpiceInt*)mxGetData(mx_n) = n;
//
//   return mx_n;
//   }

/*{{Real,2,"Constant"}, Real}, {Real,2}*/
DLLEXPORT int wspice_axisar(WolframLibraryData libData, mint Argc,
		MArgument *Args, MArgument Res) {
	wsSetLibraryData( libData );
	MTensor axis = MArgument_getMTensor(Args[0]);
	double angle = MArgument_getReal(Args[1]);

	mint dims[2] = {3,3};
	MTensor r;
	RETURN_IF_MATHEMATICA_FALSE(libData->MTensor_new(MType_Real, 2, dims, &r) == LIBRARY_NO_ERROR, "Unable to allocate output matrix");

	/* Scalar arguments are passed as pointers to the native type;
	 * Array arguments are passed as MTensor (which is a pointer)
	 */
	int nrhs = 2;
	const mxArray*  prhs[2+1];
	prhs[0] = (const mxArray*)libData;  // in mice the first parameter was the function name string; we use it to make
	                    // the WolframLibraryData pointer available
	prhs[1] = (const mxArray*)axis; // (const mxArray*)libData->MTensor_getRealData(axis);
	prhs[2] = (const mxArray*)&angle;
	fprintf(debug, "axisar 1 %lg %lg %lg  %lg",
			libData->MTensor_getRealData(axis)[0],
			libData->MTensor_getRealData(axis)[1],
			libData->MTensor_getRealData(axis)[2],
			angle );
	flushDebug();

	int nlhs = 1;
	mxArray*  plhs[1];
	plhs[0] = (mxArray*) r; /*(mxArray*)libData->MTensor_getRealData(r);*/
	cspice_axisar( nlhs, plhs, nrhs, prhs );
	RETURN_IF_CSPICE_ERROR
	MArgument_setMTensor(Res, r);

	return LIBRARY_NO_ERROR;
}

DLLEXPORT int wspice_str2et(WolframLibraryData libData, mint Argc,
		MArgument *Args, MArgument Res) {
	char *instring = MArgument_getUTF8String(Args[0]);
	double v;
	str2et_c(instring, &v);
	libData->UTF8String_disown(instring);
	RETURN_IF_CSPICE_ERROR
	MArgument_setReal(Res, v);
	return LIBRARY_NO_ERROR;
}

DLLEXPORT int wspice_b1900(WolframLibraryData libData, mint Argc,
		MArgument *Args, MArgument Res) {
	//fprintf(debug, "hello from b1900"); fflush(debug);
	double v = b1900_c();
	//fprintf(debug, "b1900 %lf", v ); fflush(debug);
	MArgument_setReal(Res, v);
	return LIBRARY_NO_ERROR;
}

DLLEXPORT int wspice_kclear(WolframLibraryData libData, mint Argc,
		MArgument *Args, MArgument Res) {
	kclear_c();
	return LIBRARY_NO_ERROR;
}

DLLEXPORT int wspice_bodc2n(WolframLibraryData libData, MLINK mlp) {
	int  inLen;
	MTensor code;
	RETURN_IF_MATHEMATICA_FALSE( MLTestHead( mlp, "List", &inLen), "Expecting List[]");
	RETURN_IF_MATHEMATICA_FALSE( inLen == 1, "Expecting length=1");
	RETURN_IF_MATHEMATICA_FALSE(libData->MTensor_new(MType_Integer, 1, scalarDims, &code) == LIBRARY_NO_ERROR, "Unable to allocate parameter matrix");
	RETURN_IF_MATHEMATICA_FALSE( MLGetLongInteger(mlp, libData->MTensor_getIntegerData(code)), "Expecting integer member" );
	RETURN_IF_MATHEMATICA_FALSE( MLNewPacket(mlp), "Expecting single argument");

	int nrhs = 2;
	void* prhs[2];
	prhs[0] = 0;
	prhs[1] = code;

	int nlhs = 2;
	void* plhs[2];
	Association results[] = {
			{"name", 0},
			{"code", 0},
			{"found", 0},
			{NULL,0}
	};
	plhs[0] = results;
	{

	   SpiceChar            name [DEFAULT_STR_LENGTH+1];
	   SpiceInt             code;
	   SpiceInt           * vec_code;
	   SpiceBoolean         found;

	   SpiceInt             i;

	   struct extra_dims  * extra;
	   struct argcheck ArgCheck[] =
	      {
	      { "code", MiceInt,    0, {0}, 1},
	      { "name", MiceNameID, 0, {0}, 1},
	      };

	   check_arg_num( nrhs, nlhs, 1, 1 );

	   memset( name, 0, default_str_size );

	   extra    = mice_checkargs(nlhs,plhs,nrhs,prhs,ArgCheck);

	   vec_code = A_INT_ARGV(1);
	   code     = *vec_code;
	   if (extra->count>1)
	      {

	      for (i=0;i<extra->count;i++)
	         {

	         code = *(vec_code  + i*extra->offset[0]);

	         bodc2n_c( code, DEFAULT_STR_LENGTH, name, &found );
	         CHECK_CALL_FAILURE(i);

	          mxDestroyArray( mxGetField( plhs[0], i, "name" ) );
	          if ( found )
	             {
	             mxSetField( plhs[0], i, "name", mxCreateString(name)   );
	             }
	          else
	             {
	             mxSetField(plhs[0], i, "name", mxCreateString("\0") );
	             code = 0;
	             }

	          mxDestroyArray( mxGetField( plhs[0], i, "code" ) );
	          mxSetField( plhs[0], i, "code", zzmice_CreateIntScalar(code) );

	          mxDestroyArray( mxGetField( plhs[0], i, "found" ) );
	          mxSetField( plhs[0], i, "found",
	                            mxCreateLogicalScalar(found ? true: false));
	         }

	      }
	   else
	      {

	      bodc2n_c( code, DEFAULT_STR_LENGTH, name, &found );
	      CHECK_CALL_FAILURE(SCALAR);

	      mxDestroyArray( mxGetField( plhs[0], 0, "name" ) );
	      if ( found )
	         {
	         mxSetField(plhs[0], 0, "name", mxCreateString(name)   );
	         }
	      else
	         {
	         mxSetField(plhs[0], 0, "name", mxCreateString("\0") );
	         code = 0;
	         }

	      mxDestroyArray( mxGetField( plhs[0], 0, "code" ) );
	      mxSetField( plhs[0], 0, "code", zzmice_CreateIntScalar(code)  );

	      mxDestroyArray( mxGetField( plhs[0], 0, "found" ) );
	      mxSetField( plhs[0], 0, "found",
	                  mxCreateLogicalScalar(found ? true: false));
	      }

	   }

	MLPutFunction(mlp, "Association", 1); {
		MLPutFunction( mlp, "List", 3 ); {
			MLPutFunction( mlp, "Rule", 2); {
				MLPutSymbol( mlp, "name");
				const char* v = (const char*) mxGetField(results, 0, "name");
				MLPutString( mlp, v);
			}
			MLPutFunction( mlp, "Rule", 2); {
				MLPutSymbol( mlp, "code");
				MTensor vt = (MTensor) mxGetField(results, 0, "code");
				mint v;
				libData->MTensor_getInteger(vt, scalarDims, &v);
				MLPutInteger( mlp, v);
			}
			MLPutFunction( mlp, "Rule", 2); {
				MLPutSymbol( mlp, "found");
				MTensor vt = (MTensor) mxGetField(results, 0, "found");
				mint v;
				libData->MTensor_getInteger(vt, scalarDims, &v);
				MLPutInteger( mlp, v );
			}
		}
	}
	return LIBRARY_NO_ERROR;
}

