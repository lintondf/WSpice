#include <mathlink.h>
#include <WolframLibrary.h>
#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include "SpiceUsr.h"
#include "mice.h"

static WolframLibraryData libData = NULL;
extern FILE* debug;
extern void flushDebug( WolframLibraryData libData );

void wsSetLibraryData( WolframLibraryData _libData ) {
	libData = _libData;
}

void mice_fail( long cnt ) {
	fprintf(debug, "mice_fail: %ld", cnt );
	flushDebug(libData);
}

void reportErrorToMathematica(WolframLibraryData libData, const char* out, const char* msg);

void mexAtExit( void* f) {
}

void mexErrMsgTxt( const char* msg ) {
	reportErrorToMathematica( libData, "wspice", msg );
	libData->Message("wspice");
}

void* mxMalloc( int  bytes ) {
	return malloc( bytes );
}

void* mxCalloc( int n, int bytes ) {
	return calloc( n, bytes );
}

void mxFree( void* p ) {
	free(p);
}

mxArray* mxCreateCharMatrixFromStrings( int n, const char** strs) {
	return NULL;
}

mxArray* mxCreateString( const char* str ) {
	return NULL;
}

mxArray* mxCreateDoubleScalar( double v ) {
	return NULL;
}

mxArray* mxCreateLogicalScalar( BOOLEAN v) {
	return NULL;
}

mxArray * zzmice_CreateIntScalar( SpiceInt n) {
	return NULL;
}

mxArray* mxCreateDoubleMatrix( int a, int b , int c) {
	return NULL;
}

mxArray* mxCreateNumericArray( int n, int dims[], int c, int t ) {
	return NULL;
}

const char* mxGetChars( const mxArray* p) {
	return (const char*) p;
}

int mxGetNumberOfElements( const mxArray* p) {
	return 0;
}

int mxGetN( const mxArray* p ) {
	return 0;
}

int mxGetM( const mxArray* p ) {
	return 0;
}

int mxGetString( const mxArray* p, char* buf, int buflen ) {
	strncpy( buf, (const char*) p, buflen );
	return 0;
}

