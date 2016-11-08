#include <stdio.h>
#include <stdlib.h>
#include "SpiceUsr.h"


void MLGetInteger() {}
void MLGetLongInteger() {}
void MLNewPacket() {}
void MLNextPacket() {}
void MLPutFunction() {}
void MLPutInteger() {}
void MLPutString() {}
void MLPutSymbol() {}
void MLTestHead() {}
void mice_fail() {}
void loadTestData();

int main( int argc, char* argv[]) {
	loadTestData();
	SpiceChar    name[1024];
	SpiceBoolean found;
	bodc2n_c( 10, sizeof(name), name, &found);
	printf("%d : %s\n", found, name );
	return 0;
}
