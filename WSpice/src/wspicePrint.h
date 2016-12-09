/* wspicePrint.h */
#include <mathlink.h>
#include <WolframLibrary.h>
#include <string.h>
#include <stdlib.h>
#include <stdio.h>

extern FILE* debug;
void flushDebug();
WolframLibraryData wsGetLibraryData();
void wsSetLibraryData( WolframLibraryData _libData );
void wsMessage(const char* str );

void reportErrorToMathematica(WolframLibraryData libData, const char* out, const char* msg);
