#include <mathlink.h>
#include <WolframLibrary.h>
#include <string.h>
#include <stdlib.h>

#include "SpiceUsr.h"
#include "SpiceZfc.h"
#include "SpiceZmc.h"
#include "tutils_c.h"



#ifndef DLLEXPORT
#define DLLEXPORT
#endif

#include <stdio.h>

DLLEXPORT int wst_chckad(WolframLibraryData libData, mint Argc, MArgument *Args,
		MArgument Res) {
	SpiceChar * name = MArgument_getUTF8String(Args[0]);;
	MTensor arrayTensor = MArgument_getMTensor(Args[1]);
	SpiceDouble * array = libData->MTensor_getRealData(arrayTensor);
	SpiceChar * comp = MArgument_getUTF8String(Args[2]);;
	MTensor expTensor = MArgument_getMTensor(Args[3]);
	SpiceDouble * exp = libData->MTensor_getRealData(expTensor);
	SpiceInt size = MArgument_getInteger(Args[4]);
	SpiceDouble tol = MArgument_getReal(Args[4]);
	SpiceBoolean ok;

	chckad_c( name, array, comp, exp, size, tol, &ok );

	libData->UTF8String_disown(name);
	libData->UTF8String_disown(comp);
	MArgument_setBoolean(Res, ok);
	return LIBRARY_NO_ERROR;
}

DLLEXPORT int wst_zztstckcov(WolframLibraryData libData, mint Argc,
		MArgument *Args, MArgument Res) {
	char *p = MArgument_getUTF8String(Args[0]);
	zztstckcov(p);
	libData->UTF8String_disown(p);
	return LIBRARY_NO_ERROR;
}

DLLEXPORT mint WolframLibrary_getVersion() {
	return WolframLibraryVersion;
}

extern void f_init();
extern void f_exit();

DLLEXPORT int WolframLibrary_initialize(WolframLibraryData libData) {
	f_init();
	return 0;
}

DLLEXPORT void WolframLibrary_uninitialize(WolframLibraryData libData) {
	f_exit();
	return;
}

