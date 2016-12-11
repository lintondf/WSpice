#include "wspicePrint.h"

/* tstlgr.f -- translated by f2c (version 19980913).
   You must link the resulting object file with the libraries:
	-lf2c -lm   (in that order)
*/

#include "f2c.h"

/* Table of constant values */

static integer c__2 = 2;
static integer c__14 = 14;

/* $Procedure TSTLGR (Test utilities log files manager) */
/* Subroutine */ int tstlgr_0_(int n__, char *messge, logical *errlog, char *
	gstyle, char *fstyle, char *marker, integer *int__, doublereal *dp, 
	ftnlen messge_len, ftnlen gstyle_len, ftnlen fstyle_len, ftnlen 
	marker_len)
{
	int i;
	char buf[4096];
	switch (n__) {
	case 1:
		//sprintf(buf, "%d, %d, %d, %d, %d", n__, messge_len, gstyle_len, fstyle_len, marker_len);
		//wsMessage(buf);
		if (messge_len <= 1)
			break;
		strncpy(buf, messge, messge_len );
		char* pCh = (buf + messge_len - 1);
		while (pCh != buf && pCh[0] == ' ') {
			pCh[0] = '\0';
			pCh--;
		}
		if (strlen(buf) != 0)
			i = 0;

			while(buf[i]){
			    if (!(pCh = strstr(buf+i,"/cr")))
			    	break;
			    *pCh = '\n';
			    strcpy( pCh+1, pCh+3);
			    i++;
			}

			wsMessage( buf );
		break;
	}
    return 0;
} /* tstlgr_ */

/* Subroutine */ int tstlgr_(char *messge, logical *errlog, char *gstyle, 
	char *fstyle, char *marker, integer *int__, doublereal *dp, ftnlen 
	messge_len, ftnlen gstyle_len, ftnlen fstyle_len, ftnlen marker_len)
{
    return tstlgr_0_(0, messge, errlog, gstyle, fstyle, marker, int__, dp, 
	    messge_len, gstyle_len, fstyle_len, marker_len);
    }

/* Subroutine */ int tstlog_(char *messge, logical *errlog, ftnlen messge_len)
{
    return tstlgr_0_(1, messge, errlog, (char *)0, (char *)0, (char *)0, (
	    integer *)0, (doublereal *)0, messge_len, (ftnint)0, (ftnint)0, (
	    ftnint)0);
    }

/* Subroutine */ int tstlgs_(char *gstyle, char *fstyle, ftnlen gstyle_len, 
	ftnlen fstyle_len)
{
    return tstlgr_0_(2, (char *)0, (logical *)0, gstyle, fstyle, (char *)0, (
	    integer *)0, (doublereal *)0, (ftnint)0, gstyle_len, fstyle_len, (
	    ftnint)0);
    }

/* Subroutine */ int tststy_(char *gstyle, char *fstyle, ftnlen gstyle_len, 
	ftnlen fstyle_len)
{
    return tstlgr_0_(3, (char *)0, (logical *)0, gstyle, fstyle, (char *)0, (
	    integer *)0, (doublereal *)0, (ftnint)0, gstyle_len, fstyle_len, (
	    ftnint)0);
    }

/* Subroutine */ int vrblog_(char *messge, logical *errlog, ftnlen messge_len)
{
    return tstlgr_0_(4, messge, errlog, (char *)0, (char *)0, (char *)0, (
	    integer *)0, (doublereal *)0, messge_len, (ftnint)0, (ftnint)0, (
	    ftnint)0);
    }

/* Subroutine */ int tstmsg_(char *marker, char *messge, ftnlen marker_len, 
	ftnlen messge_len)
{
    return tstlgr_0_(5, messge, (logical *)0, (char *)0, (char *)0, marker, (
	    integer *)0, (doublereal *)0, messge_len, (ftnint)0, (ftnint)0, 
	    marker_len);
    }

/* Subroutine */ int tstmsi_(integer *int__)
{
    return tstlgr_0_(6, (char *)0, (logical *)0, (char *)0, (char *)0, (char *
	    )0, int__, (doublereal *)0, (ftnint)0, (ftnint)0, (ftnint)0, (
	    ftnint)0);
    }

/* Subroutine */ int tstmsd_(doublereal *dp)
{
    return tstlgr_0_(7, (char *)0, (logical *)0, (char *)0, (char *)0, (char *
	    )0, (integer *)0, dp, (ftnint)0, (ftnint)0, (ftnint)0, (ftnint)0);
    }

/* Subroutine */ int tstmsf_(doublereal *dp)
{
    return tstlgr_0_(8, (char *)0, (logical *)0, (char *)0, (char *)0, (char *
	    )0, (integer *)0, dp, (ftnint)0, (ftnint)0, (ftnint)0, (ftnint)0);
    }

/* Subroutine */ int tstmsc_(char *messge, ftnlen messge_len)
{
    return tstlgr_0_(9, messge, (logical *)0, (char *)0, (char *)0, (char *)0,
	     (integer *)0, (doublereal *)0, messge_len, (ftnint)0, (ftnint)0, 
	    (ftnint)0);
    }

/* Subroutine */ int tstmso_(integer *int__, char *marker, ftnlen marker_len)
{
    return tstlgr_0_(10, (char *)0, (logical *)0, (char *)0, (char *)0, 
	    marker, int__, (doublereal *)0, (ftnint)0, (ftnint)0, (ftnint)0, 
	    marker_len);
    }

/* Subroutine */ int tstmst_(integer *int__, char *marker, ftnlen marker_len)
{
    return tstlgr_0_(11, (char *)0, (logical *)0, (char *)0, (char *)0, 
	    marker, int__, (doublereal *)0, (ftnint)0, (ftnint)0, (ftnint)0, 
	    marker_len);
    }

/* Subroutine */ int tstmof_(void)
{
    return tstlgr_0_(12, (char *)0, (logical *)0, (char *)0, (char *)0, (char 
	    *)0, (integer *)0, (doublereal *)0, (ftnint)0, (ftnint)0, (ftnint)
	    0, (ftnint)0);
    }

/* Subroutine */ int zztstre_(void)
{
    return tstlgr_0_(13, (char *)0, (logical *)0, (char *)0, (char *)0, (char 
	    *)0, (integer *)0, (doublereal *)0, (ftnint)0, (ftnint)0, (ftnint)
	    0, (ftnint)0);
    }

