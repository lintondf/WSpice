(* ::Package:: *)

BeginPackage["WSpice`", {"CCompilerDriver`"}]

(* External Interface Declarations *)
bodc2n::usage = "bodc2n[]";
startup::usage = "startup";
shutdown::usage = "shutdown";
furnsh::usage = "furnsh[path-to-kernel] loads a data kernel file";
axisar::usage = "
  axisar returns a 3x3 double rotation matrix that rotates
  vectors by a specified angle about a specified axis.
b1

  Given:

   axis  an arbitrary, non-zero, double precision 3x1 array
       defining a rotation axis

   angle  the double precision scalar angle in radians
       defining the measure of rotation about 'axis'

  the call:

   r = axisar( axis, angle)

  returns:

   r  a double precision 3x3 array representing the coordinate
     transformation determined by 'axis' and 'angle', i.e. the
     application of 'r' to a 3x1 array returns the result
     of rotating the vector about 'axis' through 'angle' radians

  Please note raxisa is not guaranteed to invert the
  operation of axisar.

";
b1900::usage = "
  b1900 returns the of the Julian Date corresponding to
  Besselian Date 1900.0: 2415020.31352.


  Given:

   No input required.

  the call:

   b1900 = b1900

  returns:

   b1900  the value 2415020.31352, the Julian Date corresponding
       to Besselian Date 1900.0.

       [1,1] = size(b1900); double = class(b1900)

";

Begin["`Private`"]
(*
	sharedLibraryPath := "/Users/lintondf/Library/Mathematica/SystemFiles/LibraryResources/MacOSX-x86-64/wspice.dylib";
*)
    sourcePath = "/Users/lintondf/workspace/WSpice/src/wspice.c";
    libraryName = "wspice";
    
    sharedLibraryPath := CreateLibrary[File[sourcePath], libraryName,
"CompileOptions"->"-fPIC" , "Debug"->True,
"IncludeDirectories"->{"/Users/lintondf/cspice/mice", "/Users/lintondf/cspice/include"},
"LibraryDirectories"->{"/Users/lintondf/cspice/lib"},
"Libraries"->{"cspice"}]

     LibraryLoad[sharedLibraryPath]; Print["Startup Complete"]
     	      
shutdown[] :=
	Module[ {},
	      LibraryUnload[sharedLibraryPath]]
	      
furnsh = LibraryFunctionLoad[sharedLibraryPath, 
          "wspice_furnsh", {String}, Void]
          	      
str2et = LibraryFunctionLoad[sharedLibraryPath, 
          "wspice_str2et", {String}, Real];
          
$axisar = LibraryFunctionLoad[libraryName, 
          "wspice_axisar", {{Real,1,"Constant"}, Real}, {Real,2}]
        
axisar[axis_List /; Length[axis] == 3, angle_?NumberQ] := Module[{},
			$axisar[axis, angle]
           ];
 axisar::arguments = "Expected: axisar[axis, angle] where axis is a 3-vector and angle is a scalar";
 axisar[axis_, angle_] := Message[axisar::arguments]; 
 axisar[args___] := Message[axisar::arguments]; 
   	      
   	      
(* b1900 - Besselian Date 1900.0
 *
 *- Abstract
 *
 *  b1900 returns the of the Julian Date corresponding to
 *  Besselian Date 1900.0: 2415020.31352.
 *
 *- I/O
 *
 *  Given:
 *
 *   No input required.
 *
 *  the call:
 *
 *   b1900 = b1900
 *
 *  returns:
 *
 *   b1900  the value 2415020.31352, the Julian Date corresponding
 *       to Besselian Date 1900.0.
 *
 *       [1,1] = size(b1900); double = class(b1900)
 *
 *- Required Reading
 *
 *  For important details concerning this module's function, please refer to
 *  the CSPICE routine b1900_c.
 *
 *  MICE.REQ
 *  TIME.REQ
 *
 *)
$b1900 = LibraryFunctionLoad[libraryName,"wspice_b1900", 
	{}, Real];
(*lhs : Real*) b1900[] := Module[{},
	(* check arguments *)
	$b1900[] ];

  b1900::expected = "b1900[]";
  b1900[___] := Message[b1900::expected];   
  
$bodc2n = LibraryFunctionLoad[libraryName, "wspice_bodc2n", 
	LinkObject, LinkObject ];
(*Void*) bodc2n[code_] := Module[{},
	(* check arguments *)
	$bodc2n[code] ];  	      	      
"WSpice Loaded";

End[]
EndPackage[]



