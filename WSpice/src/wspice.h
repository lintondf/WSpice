// wspice.h


// Matlab Mex Interface Replacement

typedef MTensor       mxArray;

#define mxINT32_CLASS MType_Integer
#define mxREAL        MType_Double

/*

-Abstract

   Define and assign the Mice particular variable types.

   Do not edit, touch, or in any way alter the code within this file.

-Disclaimer

   THIS SOFTWARE AND ANY RELATED MATERIALS WERE CREATED BY THE
   CALIFORNIA INSTITUTE OF TECHNOLOGY (CALTECH) UNDER A U.S.
   GOVERNMENT CONTRACT WITH THE NATIONAL AERONAUTICS AND SPACE
   ADMINISTRATION (NASA). THE SOFTWARE IS TECHNOLOGY AND SOFTWARE
   PUBLICLY AVAILABLE UNDER U.S. EXPORT LAWS AND IS PROVIDED "AS-IS"
   TO THE RECIPIENT WITHOUT WARRANTY OF ANY KIND, INCLUDING ANY
   WARRANTIES OF PERFORMANCE OR MERCHANTABILITY OR FITNESS FOR A
   PARTICULAR USE OR PURPOSE (AS SET FORTH IN UNITED STATES UCC
   SECTIONS 2312-2313) OR FOR ANY PURPOSE WHATSOEVER, FOR THE
   SOFTWARE AND RELATED MATERIALS, HOWEVER USED.

   IN NO EVENT SHALL CALTECH, ITS JET PROPULSION LABORATORY, OR NASA
   BE LIABLE FOR ANY DAMAGES AND/OR COSTS, INCLUDING, BUT NOT
   LIMITED TO, INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND,
   INCLUDING ECONOMIC DAMAGE OR INJURY TO PROPERTY AND LOST PROFITS,
   REGARDLESS OF WHETHER CALTECH, JPL, OR NASA BE ADVISED, HAVE
   REASON TO KNOW, OR, IN FACT, SHALL KNOW OF THE POSSIBILITY.

   RECIPIENT BEARS ALL RISK RELATING TO QUALITY AND PERFORMANCE OF
   THE SOFTWARE AND ANY RELATED MATERIALS, AND AGREES TO INDEMNIFY
   CALTECH AND NASA FOR ALL THIRD-PARTY CLAIMS RESULTING FROM THE
   ACTIONS OF RECIPIENT IN THE USE OF THE SOFTWARE.

-Required_Reading

   MICE.REQ

-Keywords

-Brief_I/O

   None.

-Detailed_Input

   None.

-Detailed_Output

   None.

-Parameters
*/

#ifndef mice_h
#define mice_h

/*
   Define needed globals.

   1) Size for temporary strings in interface calls.

   2) SCALAR has value -2 to compensate for the difference between array index
      bases in MATLAB (base 1) and C (base 0). The zzerror routine determines
      whether to return a vector based error string or a scalar base string
      based on the value of 'cnt' as less than zero. The expression
      'cnt + INDEX_BASE' passes to zzerror, INDEX_BASE having value either
      0 or 1. If 1, SCALAR requires a value less than -1 to satisfy zzerror
      logic.

*/

#define DEFAULT_STR_LENGTH   1024
#define SCALAR               -2

/*
   Note, MATLAB uses base 1 indexing (as is proper), while C uses base 0
   (corresponding to an offset). Add 1 to 'cnt'.
*/

#define INDEX_BASE          1L

/*
-Exceptions

   None.

-Files

   None.

-Particulars

   None.

-Examples

   None.

-Restrictions

   None.

-Literature_References

   MICE.REQ

-Author_and_Institution

   E.D. Wright        (JPL)
   G. Chinn           (JPL)

-Version


   -Mice Version 1.0.2 18-JUN-2012 (EDW)

      Removed unused macro S_DBL_RET_ARGV.

   -Mice Version 1.0.1 23-FEB-2009 (EDW)

      Added the *_OFF, *_IN, *_OUT, index aliases.

   -Mice Version 1.0.0 31-JAN-2008 (EDW)

-Index_Entries

   MATLAB

-&
*/



/*
Prototypes.
*/
mxArray * zzmice_CreateIntScalar( SpiceInt n);


#define mxGetData(pt) libData->MTensor_getRealData(*pt)


/*
Variable's macros.
*/
#define       S_INT_ARGV(x)         *(SpiceInt*)libData->MTensor_getIntegerData(prhs[x])

#define       A_INT_ARGV(x)          (SpiceInt*)libData->MTensor_getIntegerData(prhs[x])

#define       S_DBL_ARGV(x)         *(SpiceDouble*)libData->MTensor_getRealData(prhs[x])

#define       A_DBL_ARGV(x)          (SpiceDouble*)libData->MTensor_getRealData(prhs[x])

#define       A_DBL_RET_ARGV(x)      (SpiceDouble*)libData->MTensor_getRealData(plhs[x])

#define       A_BOOL_RET_ARGV(x)     (SpiceBoolean*)libData->MTensor_getIntegerData(plhs[x])

#define       A_INT_RET_ARGV(x)      (SpiceInt*)libData->MTensor_getIntegerData(plhs[x])


/*
Index aliases.
*/
#define       ONE_OFF            0
#define       TWO_OFF            1
#define       THREE_OFF          2
#define       FOUR_OFF           3
#define       FIVE_OFF           4
#define       SIX_OFF            5
#define       SEVEN_OFF          6
#define       EIGHT_OFF          7

#define       ONE_IN             1
#define       TWO_IN             2
#define       THREE_IN           3
#define       FOUR_IN            4
#define       FIVE_IN            5
#define       SIX_IN             6
#define       SEVEN_IN           7
#define       EIGHT_IN           8

#define       ONE_OUT            0
#define       TWO_OUT            1
#define       THREE_OUT          2
#define       FOUR_OUT           3
#define       FIVE_OUT           4
#define       SIX_OUT            5
#define       SEVEN_OUT          6
#define       EIGHT_OUT          7



/*
Simple macro based on ALLOC_CHECK to ensure a zero value alloc count
at end of routine, if not, pass the error message to the MATLAB interpreter.
Note, the need to use this macro exists only in those routines
allocating/deallocating memory.
*/
#define MICE_ALLOC_CHECK                                                   \
             if ( alloc_count() != 0 )                                     \
                {                                                          \
                setmsg_c ( "MICE(BUG): Malloc/Free count not zero at end " \
                           "of routine. Malloc count = #. Contact NAIF." );\
                errint_c ( "#", alloc_count ()    );                       \
                sigerr_c ( "SPICE(MALLOCCOUNT)"        );                  \
                mice_fail(SCALAR);                                         \
                }



/*
This checks failed_c to detect a SPICE error signal.

Code should call this macro after a call to any subroutine or function
that might signal a SPICE error.
*/
#define CHECK_CALL_FAILURE(cnt)  \
             if ( failed_c())    \
                {                \
                mice_fail((mint)cnt);  \
                }


/*
CHECK_CALL_FAILURE_MEM(n,arr) performs the same functions as in
CHECK_CALL_FAILURE but also frees memory blocks allocated by the
alloc_SpiceString_C_array routines.
*/
#define CHECK_CALL_FAILURE_MEM(n,arr)                \
             if ( failed_c())                        \
                {                                    \
                free_SpiceString_C_array ( n, arr ); \
                mice_fail((mint)SCALAR);                   \
                }


/*
CHECK_CALL_FAILURE_MEM1(cnt,n,arr,pntr) performs the same functions as in
CHECK_CALL_FAILURE but also frees memory blocks allocated by the
alloc_SpiceString_C_array/alloc_SpiceString_Pointer_array routines.
*/
#define CHECK_CALL_FAILURE_MEM1(cnt,n,arr,pntr)      \
             if ( failed_c())                        \
                {                                    \
                free_SpiceString_C_array ( n, arr ); \
                free_SpiceMemory         ( pntr   ); \
                mice_fail((mint)cnt);                      \
                }


#endif



/*

-Abstract

   The structure and protype definitions corresponding to the argument
   check code in zzmice.c.

   Do not edit, touch, or in any way alter the code within this file.

-Disclaimer

   THIS SOFTWARE AND ANY RELATED MATERIALS WERE CREATED BY THE
   CALIFORNIA INSTITUTE OF TECHNOLOGY (CALTECH) UNDER A U.S.
   GOVERNMENT CONTRACT WITH THE NATIONAL AERONAUTICS AND SPACE
   ADMINISTRATION (NASA). THE SOFTWARE IS TECHNOLOGY AND SOFTWARE
   PUBLICLY AVAILABLE UNDER U.S. EXPORT LAWS AND IS PROVIDED "AS-IS"
   TO THE RECIPIENT WITHOUT WARRANTY OF ANY KIND, INCLUDING ANY
   WARRANTIES OF PERFORMANCE OR MERCHANTABILITY OR FITNESS FOR A
   PARTICULAR USE OR PURPOSE (AS SET FORTH IN UNITED STATES UCC
   SECTIONS 2312-2313) OR FOR ANY PURPOSE WHATSOEVER, FOR THE
   SOFTWARE AND RELATED MATERIALS, HOWEVER USED.

   IN NO EVENT SHALL CALTECH, ITS JET PROPULSION LABORATORY, OR NASA
   BE LIABLE FOR ANY DAMAGES AND/OR COSTS, INCLUDING, BUT NOT
   LIMITED TO, INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND,
   INCLUDING ECONOMIC DAMAGE OR INJURY TO PROPERTY AND LOST PROFITS,
   REGARDLESS OF WHETHER CALTECH, JPL, OR NASA BE ADVISED, HAVE
   REASON TO KNOW, OR, IN FACT, SHALL KNOW OF THE POSSIBILITY.

   RECIPIENT BEARS ALL RISK RELATING TO QUALITY AND PERFORMANCE OF
   THE SOFTWARE AND ANY RELATED MATERIALS, AND AGREES TO INDEMNIFY
   CALTECH AND NASA FOR ALL THIRD-PARTY CLAIMS RESULTING FROM THE
   ACTIONS OF RECIPIENT IN THE USE OF THE SOFTWARE.

-Required_Reading

   MICE.REQ

-Keywords

-Brief_I/O

   None.

-Detailed_Input

   None.

-Detailed_Output

   None.

-Parameters
*/

/*
-Procedure

   cspice_params.h

-Abstract

    Parameter values from SPICELIB code for use in CSPICE.

    KEEP THE ASSIGNMENTS DEFINED IN THIS FILE SYNCHED WITH
    THE CORRESPONDING ASSIGNMENTS IN POOL.F, ZZRVAR.F, DAFFA.F,
    ERRHND.INC.

-Disclaimer

   THIS SOFTWARE AND ANY RELATED MATERIALS WERE CREATED BY THE
   CALIFORNIA  INSTITUTE OF TECHNOLOGY (CALTECH) UNDER A U.S.
   GOVERNMENT CONTRACT WITH THE NATIONAL AERONAUTICS AND SPACE
   ADMINISTRATION (NASA). THE SOFTWARE IS TECHNOLOGY AND SOFTWARE
   PUBLICLY AVAILABLE UNDER U.S. EXPORT LAWS AND IS PROVIDED
   "AS-IS" TO THE RECIPIENT WITHOUT WARRANTY OF ANY KIND, INCLUDING
   ANY WARRANTIES OF PERFORMANCE OR MERCHANTABILITY OR FITNESS FOR
   A PARTICULAR USE OR PURPOSE (AS SET FORTH IN UNITED STATES UCC
   SECTIONS 2312-2313) OR FOR ANY PURPOSE WHATSOEVER, FOR THE
   SOFTWARE AND RELATED MATERIALS, HOWEVER USED.

   IN NO EVENT SHALL CALTECH, ITS JET PROPULSION LABORATORY,
   OR NASA BE LIABLE FOR ANY DAMAGES AND/OR COSTS, INCLUDING,
   BUT NOT LIMITED TO, INCIDENTAL OR CONSEQUENTIAL DAMAGES OF
   ANY KIND, INCLUDING ECONOMIC DAMAGE OR INJURY TO PROPERTY
   AND LOST PROFITS, REGARDLESS OF WHETHER CALTECH, JPL, OR
   NASA BE ADVISED, HAVE REASON TO KNOW, OR, IN FACT, SHALL
   KNOW OF THE POSSIBILITY.

   RECIPIENT BEARS ALL RISK RELATING TO QUALITY AND PERFORMANCE
   OF THE SOFTWARE AND ANY RELATED MATERIALS, AND AGREES TO
   INDEMNIFY CALTECH AND NASA FOR ALL THIRD-PARTY CLAIMS RESULTING
   FROM THE ACTIONS OF RECIPIENT IN THE USE OF THE SOFTWARE.

-Required_Reading

   None.

-Keywords

   Paramters

-Brief_I/O

    None.

-Detailed_Input

    None.

-Detailed_Output

    None.

-Parameters

    None.

-Exceptions

    None.

-Files

    None.

-Particulars

   -Paramter values taken from pool.f version:

       SPICELIB Version 10.1.0, 20-JUN-2013 (BVS)

         MAXVAR      is the maximum number of variables that the
                     kernel pool may contain at any one time.
                     MAXVAR should be a prime number.

         MAXLEN      is the maximum length of the variable names
                     that can be stored in the kernel pool.

         MAXVAL      is the maximum number of distinct values that
                     may belong to the variables in the kernel pool.
                     Each variable must have at least one value, and
                     may have any number, so long as the total number
                     does not exceed MAXVAL. MAXVAL must be at least
                     as large as MAXVAR.

         MXNOTE      is the maximum number of distinct variable-agents
                     pairs that can be maintained by the kernel pool.
                     (A variable is "paired" with an agent, if that agent
                     is to be notified whenever the variable is updated.)

         MAXAGT      is the maximum number of agents that can be kept
                     on the distribution list for notification of updates
                     to kernel variables.

         MAXCHR      is the maximum number of characters that can be
                     stored in a component of a string valued kernel
                     variable.

         MAXLIN      is the maximum number of character strings that
                     can be stored as data for kernel pool variables.

   -Paramter values taken from zzrvar.f version:

      SPICELIB Version 1.6.0, 06-AUG-2002 (BVS)

         LINLEN      is the maximum length of a line in the kernel file.

   -Paramter values taken from daffa.f version:

      SPICELIB Version 3.0.0, 16-NOV-2001 (FST)

         MAXNDC

         MAXNIC

   -Paramter values taken from dafah.f version:

      SPICELIB Version 9.0.0, 09-NOV-2006 (NJB)

         MAXSUM

      Paramter SIDLEN derived from:

                             (NI + 1)
         SIDLEN = 8 * ( ND + -------- )     (Note that this is
                                2           integer division.)

          with ND = 2, and NI = 6 for SPKs.

   -Parameter values take from errhnd.h version:

      SPICELIB Version 3.0.0, 14-JAN-2013 (EDW)

         LMSGLN

         SMSGLN

-Examples

    None.

-Restrictions

    None.

-Literature_References

    DAF.REQ
    ERROR.REQ
    POOL.REQ

-Author_and_Institution

    E. D. Wright    (JPL)

-Version

   -CSPICE Version 1.3.0, 18-NOV-2013 (EDW) (BVS)

      Added parameters:

         MAXNDC
         MAXNIC
         MAXSUM
         SIDLEN
         LMSGLN
         SMSGLN

      Updated to parameter values to match those defined
      in pool.f:

         MAXVAR to 26003
         MAXVAL to 400000
         MAXLIN to 15000
         MXNOTE to (MAXVAR * 5)

   -CSPICE Version 1.2.0, 24-MAY-2010 (EDW) (NJB)

      Increased MAXVAL to 200000.

   -CSPICE Version 1.1.0, 23-FEB-2009 (EDW)

      Added LINLEN parameter.

   -CSPICE Version 1.0.0, 27-APR-2006 (EDW)

-Index_Entries

   parameter definitions

-&
*/

#define         MAXVAR         26003

#define         MAXVAL         400000

#define         MAXLIN         15000

#define         MAXCHR         80

#define         MXNOTE         (MAXVAR * 5)

#define         MAXLEN         32

#define         MAXAGT         1000

#define         LINLEN         132

#define         MAXNDC         124

#define         MAXNIC         250

#define         MAXSUM         125

#define         SIDLEN         40

#define         LMSGLN         23 * 80

#define         SMSGLN         25


#ifndef zzmice_h
#define zzmice_h


/*
-Exceptions

   None.

-Files

   None.

-Particulars

   None.

-Examples

   None.

-Restrictions

   None.

-Literature_References

   MICE.REQ

-Author_and_Institution

   E.D. Wright        (JPL)
   G. Chinn           (JPL)

-Version

   -Mice Version 1.0.2 31-OCT-2012 (EDW)

      Added MiceFrinfo, MiceSFS, MicePVN enums.

   -Mice Version 1.0.1 17-DEC-2008 (EDW)

      Addition of MiceWnsumd enum.

   -Mice Version 1.0.0 14-FEB-2008 (EDW)

-Index_Entries

*/


/*

The structure defining the argument check information, ArgCheck.

-Examples

   Declaration of ArgCheck for the subsol_c interface.

   struct argcheck ArgCheck[] =
      {
      { "method", MiceChar  , 0, {0}, 0},
      { "target", MiceChar  , 0, {0}, 0},
      { "et"    , MiceDouble, 0, {0}, 1},
      { "abcorr", MiceChar  , 0, {0}, 0},
      { "obsrvr", MiceChar  , 0, {0}, 0},
      { "spoint", MiceDouble, 1, {3}, 1},
      };

*/

/*
Enums used to tag argument data types in the ArgCheck arrays. Use
"MiceIgnore"  to prevent allocation to an output pointer (plhs), when
used, the interface needs to peform memory allocation to the pointer.
*/
enum MiceType
   {
   MiceInvalidType,
   MiceNameID,
   MiceFrinfo,
   MiceState,
   MicePos,
   MiceNear,
   MiceSurf,
   MicePlane,
   MiceEllipse,
   MicePool,
   MiceChar,
   MiceDouble,
   MiceInt,
   MiceBoolean,
   MiceWin,
   MiceSub_PS,
   MiceSurf_PS,
   MiceIlum,
   MiceWnsumd,
   MiceSFS,
   MicePVN,
   MiceIgnore,
   };


struct argcheck {
                char             * name;      /* Variable name. */

                enum MiceType      type;      /*
                                                 Variable type identifier,
                                                 an enum.
                                              */

                int            min_dims;      /*
                                                 The dimensinality of the
                                                 variable.

                                                    0 for a scalar
                                                    1 for a Nx1 array,
                                                    2 for a NxM array.
                                              */

                SpiceInt           dims[4];   /* The expected dimension and
                                                 corresponding size of each
                                                 dimension.
                                              */

                SpiceInt   is_vectorizable;   /* Flag to mark if the variable
                                                 may pass in a vectorized state.

                                                    1 to indicate yes
                                                    0 to indicate no
                                              */
                };


/*

The structure defining the vectorization state. Returned by 'mice_checkargs'.

*/
struct           extra_dims {
                            SpiceInt  count;
                            SpiceInt  first_vector_arg_index;
                            SpiceInt  vectorized [32];
                            SpiceInt  offset     [32];
                            };


void           check_arg_num( int x_nrhs, int x_nlhs, int nrhs, int nlhs );

//void           mice_fail( long cnt );

void           struct_fields( enum   MiceType        type ,
                             SpiceInt              * n    ,
                             const  char         *** names,
                             const  enum MiceType ** types,
                             const       int      ** sizes );

struct         extra_dims  * mice_checkargs(int                 nlhs,
                                            void           * plhs[],
                                            int                 nrhs,
                                            void     * prhs[],
                                            struct argcheck   * argcheck);


#endif

