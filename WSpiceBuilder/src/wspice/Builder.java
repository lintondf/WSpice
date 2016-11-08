package wspice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import org.apache.commons.io.FileUtils;

public class Builder {

	static final String FUNCTION_TOKEN1 = "void cspice_";
	static final String FUNCTION_TOKEN2 = "void mice_";
	static final String EXTRA_DECL = "struct extra_dims";
	static final String CAN_REF = "check_arg_num";
	static final String ARGCHECK_TOKEN = "struct argcheck";
	static final String CHECK_EXTRA_TOKEN = "extra = mice_checkargs";
	static final String MEMSET_TOKEN = "memset(";
	static final String ONE_LINE_TOKEN = "plhs[0] = mxCreate";
	
	static final String packageTemplate = "BeginPackage[\"WSpice`\", {\"CCompilerDriver`\"}]\n" + 
			"\n" + 
			"(* External Interface Declarations *)\n\n" + 
			"%s\n" +
			"Begin[\"`Private`\"]\n\n" + 
			"    sourcePath = \"/Users/lintondf/workspace/WSpice/src/wspice.c\";\n" + 
			"    libraryName = \"wspice\";\n" + 
			"    \n" + 
			"    sharedLibraryPath := CreateLibrary[File[sourcePath], libraryName,\n" + 
			"\"CompileOptions\"->\"-fPIC\" , \"IncludeDirectories\"->{\"/Users/lintondf/cspice/include\"},\n" + 
			"\"LibraryDirectories\"->{\"/Users/lintondf/cspice/lib\"},\n" + 
			"\"Libraries\"->{\"cspice\"}]\n" + 
			"\n" + 
			"     LibraryLoad[sharedLibraryPath]; Print[\"Startup Complete\"]\n" + 
			"     	      \n" + 
			"shutdown[] :=\n" + 
			"	Module[ {},\n" + 
			"	      LibraryUnload[sharedLibraryPath]]\n" + 
			"	      \n" + 
			"%s\n\n" + 
			"\"WSpice Loaded\";\n" + 
			"\n" + 
			"End[]\n" + 
			"EndPackage[]\n";
	StringBuffer packageUsages = new StringBuffer();
	StringBuffer packageDeclarations = new StringBuffer();

	protected int indent = 0;

	protected String nextLine(ListIterator<String> it) {
		if (it.hasNext()) {
			String line = it.next().trim();
			indent += line.length() - line.replace("{", "").length();
			indent -= line.length() - line.replace("}", "").length();
			line = line.replaceAll("          ", " ");
			line = line.replaceAll("         ", " ");
			line = line.replaceAll("        ", " ");
			line = line.replaceAll("       ", " ");
			line = line.replaceAll("      ", " ");
			line = line.replaceAll("     ", " ");
			line = line.replaceAll("    ", " ");
			line = line.replaceAll("   ", " ");
			return line.replaceAll("  ", " ");
		}
		return null;
	}
	
	protected String priorNonBlank(ListIterator<String> it) {
		while (it.hasPrevious()) {
			String line = it.previous().trim();
			if (line.isEmpty())
				continue;
			it.previous();
			return nextLine(it);
		}
		return null;
	}

	protected String nextNonBlank(ListIterator<String> it) {
		while (it.hasNext()) {
			String line = nextLine(it);
			if (!line.isEmpty())
				return line;
		}
		return null;
	}

	public class Variable {
		public String name;
		public int pointer;
		public String type;
		public Vector<Integer> dims;

		public Variable() {
			pointer = 0;
			dims = new Vector<Integer>();
		}

		public String toString() {
			return name + " " + type + " " + pointer + " " + dims.size();
		}

		public boolean parse(String decl) {
			String[] tokens = decl.split("[ |\\[|\\]|;]");
			// for (String token : tokens) {
			// if (!token.isEmpty()) {
			// System.out.print("<" + token + "> " );
			// }
			// }
			try {
				int i = 0;
				while (i < tokens.length && tokens[i].isEmpty())
					i++;
				type = tokens[i++];
				while (i < tokens.length && tokens[i].isEmpty())
					i++;
				if (tokens[i].equals("*")) {
					pointer = 1;
					i++;
					while (i < tokens.length && tokens[i].isEmpty())
						i++;
				} else if (tokens[i].equals("**")) {
					pointer = 2;
					i++;
					while (i < tokens.length && tokens[i].isEmpty())
						i++;
				}
				name = tokens[i++];
				while (i < tokens.length && tokens[i].isEmpty())
					i++;
				if (i < tokens.length) {
					for (; i < tokens.length; i++) {
						if (!tokens[i].isEmpty()) {
							if (tokens[i].equals("DEFAULT_STR_LENGTH+1")) {
								dims.add(1025);
								break;
							} else if (tokens[i].startsWith("MAXLEN")) {
								dims.add(512);
								break;
							} else if (tokens[i].equals("MAXNDC")) {
								dims.add(513);
								break;
							} else if (tokens[i].equals("MAXNIC")) {
								dims.add(513);
								break;
							} else if (tokens[i].equals("MAXSUM")) {
								dims.add(513);
								break;
							} else if (tokens[i].equals("MAXVAL")) {
								dims.add(514);
								break;
							} else if (tokens[i].equals("=")) {
								dims.add(-1);
								break;
							} else {
								dims.add(Integer.parseInt(tokens[i]));
								break;
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(decl);
			}
			return true;
		}
	};

	public class ArgCheck {
		public String name;
		public String type;
		public int rank;
		public Vector<Integer> dims;
		public boolean isVectorizable;

		public ArgCheck() {
		}

		public String toString() {
			return name + " " + type + " " + rank + " " + dims.size() + " "
					+ isVectorizable;
		}

		boolean parse(String line) {
			String[] tokens = line.split(" |,");
			// for (String token : tokens ) {
			// if (!token.isEmpty()) {
			// System.out.print("<" + token + "> ");
			// }
			// }
			// System.out.println();
			int i = 1;
			while (i < tokens.length && tokens[i].isEmpty())
				i++;
			name = tokens[i].substring(1, tokens[i].length() - 1);
			i++;
			while (i < tokens.length && tokens[i].isEmpty())
				i++;
			type = tokens[i];
			i++;
			while (i < tokens.length && tokens[i].isEmpty())
				i++;
			rank = Integer.parseInt(tokens[i]);
			i++;
			while (i < tokens.length && tokens[i].isEmpty())
				i++;
			dims = new Vector<Integer>();
			String t = tokens[i];
			if (rank == 0) {
				i++;
				while (i < tokens.length && tokens[i].isEmpty())
					i++;
			} else {
				if (t.startsWith("{") && t.endsWith("}")) {
					dims.add(Integer.parseInt(t.substring(1, t.length() - 1)));
					i++;
				} else {
					while (i < tokens.length) {
						if (t.startsWith("{")) {
							t = t.substring(1);
						}
						if (t.endsWith("}")) {
							dims.add(Integer.parseInt(t.substring(0,
									t.length() - 1)));
							break;
						} else {
							dims.add(Integer.parseInt(t));
						}
						i++;
						while (i < tokens.length && tokens[i].isEmpty())
							i++;
						t = tokens[i];
					}
				}
			}
			while (i < tokens.length && tokens[i].isEmpty())
				i++;
			t = tokens[i];
			isVectorizable = t.equals("1");
			return true;
		}
	}

	public class Parameter {
		public String name;
		public ArgCheck argCheck;
		public Variable variable;
		public int position;
		public boolean isOutput;
		public boolean isArray;
		public String type;
		public Vector<String> allocation;
		public String copy;

		public Parameter() {
		}

		public Parameter(String name, String type, int position) {
			this.name = name;
			this.isArray = false;
			this.isOutput = true;
			this.position = position;
			this.type = type;
			this.argCheck = new ArgCheck();
			this.variable = new Variable();
			this.variable.name = this.name;
			this.variable.dims = new Vector<Integer>();
			this.variable.pointer = 0;
			this.variable.type = this.type;
			this.argCheck.name = this.name;
			this.argCheck.dims = this.variable.dims;
			this.argCheck.isVectorizable = false;
			this.argCheck.rank = 0;
		}

		public String toString() {
			return name + " " + position + " " + isOutput + " " + isArray + " "
					+ type + " " + argCheck + " " + variable;
		}

		public boolean parse(HashMap<String, ArgCheck> args,
				HashMap<String, Variable> vars, String line) {
			if (line.startsWith("mxGetString")) {
				type = "String";
				isOutput = false;
				isArray = false;
				String[] tokens = splitNoEmpties(line,
						",| |\\(|\\)|\\[|\\]");
				if (!tokens[1].equals("prhs"))
					return false;
				position = Integer.parseInt(tokens[2]);
				name = tokens[3];
			} else {
				String[] tokens = splitNoEmpties(line, " ");
				int i = 0;
				name = tokens[i];
				i++;
				if (!tokens[i].equals("="))
					return false;
				i++;
				tokens = splitNoEmpties(tokens[2], "\\(|\\)");
				i = 0;
				if (tokens[i].startsWith("SpiceDouble")) {
					i++;
					type = "Real";
				}
				switch (tokens[i]) {
				case "S_INT_ARGV":
					type = "Integer";
					isOutput = false;
					isArray = false;
					break;
				case "A_INT_ARGV":
					type = "Integer";
					isOutput = false;
					isArray = true;
					break;
				case "S_DBL_ARGV":
					type = "Real";
					isOutput = false;
					isArray = false;
					break;
				case "A_DBL_ARGV":
					type = "Real";
					isOutput = false;
					isArray = true;
					break;
				case "A_DBL_RET_ARGV":
					type = "Real";
					isOutput = true;
					isArray = true;
					break;
				case "A_BOOL_RET_ARGV":
					type = "Boolean";
					isOutput = true;
					isArray = true;
					break;
				case "A_INT_RET_ARGV":
					type = "Integer";
					isOutput = true;
					isArray = true;
					break;
				case "mxGetData":
					isOutput = false;
					isArray = false;
					break;
				default:
					return false;
				}
				i++;
				if (tokens[i].startsWith("prhs")) {
					tokens = splitNoEmpties(tokens[i], "\\[|\\]");
					position = Integer.parseInt(tokens[1]);
				} else {
					position = Integer.parseInt(tokens[i]);
				}
			}
			this.variable = vars.get(name);
			this.argCheck = args.get(name);
			if (this.argCheck == null && name.startsWith("vec_")) {
				this.argCheck = args.get(name.substring(4));
				if (this.argCheck != null) {
					if (this.argCheck.rank == 0) {
						isArray = false;
						this.name = name.substring(4);
					}
				}
			}
			return true;
		}
	}

	public String toOutputDecl(Vector<Parameter> output) {
		if (output.isEmpty()) {
			return "Void";
		}
		StringBuffer sb = new StringBuffer();
		if (output.size() > 1)
			sb.append("{");
		boolean first = true;
		for (Parameter param : output) {
			if (param == null)
				continue;
			if (!first)
				sb.append(", ");
			first = false;
			if (param.isArray) {
				sb.append("{");
				sb.append(param.type);
				sb.append(", ");
				sb.append(param.argCheck.rank);
				sb.append("}");
			} else {
				sb.append(param.type);
			}
		}
		if (output.size() > 1)
			sb.append("}");
		return sb.toString();
	}

	public String toInputDecl(Vector<Parameter> input) {
		if (input.isEmpty()) {
			return "{}";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		boolean first = true;
		for (Parameter param : input) {
			if (!first)
				sb.append(", ");
			first = false;
			if (param.isArray) {
				sb.append("{");
				sb.append(param.type);
				sb.append(", ");
				sb.append(param.argCheck.rank);
				sb.append("}");
			} else {
				sb.append(param.type);
			}
		}
		sb.append("}");
		return sb.toString();
	}

	public String toOutputDoc(Vector<Parameter> output) {
		if (output.isEmpty()) {
			return "Void";
		}
		StringBuffer sb = new StringBuffer();
		if (output.size() > 1)
			sb.append("{");
		boolean first = true;
		for (Parameter param : output) {
			if (param == null)
				continue;
			if (!first)
				sb.append(", ");
			first = false;
			if (param.isArray) {
				sb.append(param.name);
				sb.append(" : ");
				sb.append(param.type);
				sb.append("{");
				boolean f = true;
				for (Integer dim : param.argCheck.dims) {
					if (!f)
						sb.append(", ");
					f = false;
					sb.append(Integer.toString(dim));
				}
				sb.append("}");
			} else {
				sb.append(param.name);
				sb.append(" : ");
				sb.append(param.type);
			}
		}
		if (output.size() > 1)
			sb.append("}");
		return sb.toString();
	}

	public String toInputDoc(Parameter param) {
		StringBuffer sb = new StringBuffer();
		sb.append("(* ");
		if (param.isArray) {
			sb.append(param.type);
			sb.append("{");
			boolean f = true;
			for (Integer dim : param.argCheck.dims) {
				if (!f)
					sb.append(", ");
				f = false;
				sb.append(Integer.toString(dim));
			}
			sb.append("}");
		} else {
			sb.append(param.type);
		}
		sb.append(" *)");
		return sb.toString();
	}

	public boolean scanFunction(ListIterator<String> it, String name) throws Exception {
		System.out.println(name);
		boolean hasExtra = false;
		boolean hasCheckNum = false;
		boolean hasArgCheck = false;
		boolean hasMemset = false;
		Documentation doc = new Documentation();
		doc.load(name);
		String[] mfunc = splitNoEmpties( doc.mfunc.toString(), " |\\[|\\]|\\(|\\)");
		if (!mfunc[0].equals("function"))
			throw new Exception("Bad matlab function def in .m file");
		Vector<String> outputNames = new Vector<String>();
		Vector<String> inputNames = new Vector<String>();
		int i = 1; 
		while (!mfunc[i].equals(name)) {
			if (mfunc[i].equals("=")) {
				i++;
				break;
			}
			outputNames.add(mfunc[i++]);
		}
		if (!mfunc[i].equals(name))
			throw new Exception("Bad matlab function def in .m file");
		i++;
		while (i < mfunc.length) {
			inputNames.add(mfunc[i++]);
		}
		Vector<Parameter> output = new Vector<Parameter>();
		Vector<Parameter> input = new Vector<Parameter>();
		HashMap<String, Variable> vars = new HashMap<String, Variable>();
		HashMap<String, ArgCheck> args = new HashMap<String, ArgCheck>();
		String line = nextLine(it);
		if (!line.startsWith("{"))
			return false;
		while (it.hasNext()) {
			line = nextLine(it);
			if (line.startsWith(EXTRA_DECL))
				break;
			if (line.startsWith(CAN_REF))
				break;
			if (line.startsWith("/*")) {
				while (it.hasNext()) {
					line = nextLine(it);
					if (line.startsWith("*/")) {
						line = nextNonBlank(it);
						break;
					}
				}
				break;
			}
			if (!line.isEmpty()) {
				Variable var = new Variable();
				var.parse(line);
				// System.out.println("  >" + var);
				vars.put(var.name, var);
			}
		}
		boolean inChecks = true;
		while (inChecks) {
			inChecks = false;
			if (line.startsWith("/*")) {
				inChecks = true;
				while (!line.endsWith("*/")) {
					line = nextLine(it);
				}
				line = nextNonBlank(it);
			} else if (line.startsWith(ARGCHECK_TOKEN)) {
				hasArgCheck = true;
				inChecks = true;
				while (it.hasNext()) {
					line = nextLine(it);
					if (line.startsWith("};")) {
						line = nextNonBlank(it);
						break;
					} else if (line.endsWith(",")) {
						// System.out.println("  -" + line );
						ArgCheck ac = new ArgCheck();
						ac.parse(line);
						args.put(ac.name, ac);
					}
				}
			} else if (line.startsWith(MEMSET_TOKEN)) {
				hasMemset = true;
				inChecks = true;
				line = nextNonBlank(it);
			} else if (line.startsWith(CHECK_EXTRA_TOKEN)) {
				hasExtra = true;
				inChecks = true;
				line = nextNonBlank(it);
			} else if (line.startsWith(EXTRA_DECL)) {
				hasExtra = true;
				inChecks = true;
				line = nextNonBlank(it);
			} else if (line.startsWith(CAN_REF)) {
				hasCheckNum = true;
				inChecks = true;
				line = nextNonBlank(it);
				// } else {
				// System.out.println("? " + line);
				// line = nextNonBlank( it );
			}
		}
		if (line.startsWith(ONE_LINE_TOKEN)) {
			if (line.indexOf("mxCreateDoubleScalar") >= 0) {
				Parameter param = new Parameter("lhs", "Real", 0);
				output.add(param);
			} else {
				System.out.println("  !"
						+ line.substring(ONE_LINE_TOKEN.length()));
			}
		} else {
			// scan up to C function invocation
			if (target != null) System.out.println("? " + line);
			String baseName = name;
			int idx = baseName.indexOf("_");
			if (idx >= 0) {
				baseName = baseName.substring(0,idx);
			}
			while (line != null && line.indexOf(baseName) == -1) {
				if (target != null) System.out.println("  @" + line);
				if (line.startsWith("/*")) {
					while(!line.endsWith("*/")) {
						line = nextNonBlank(it);
					}
					line = nextNonBlank(it);
					continue;
				}
				if (line.indexOf("mxGetNumberOfElements") == -1) {
					String[] tokens = splitNoEmpties(line, " ");
					if (args.containsKey(tokens[0])) {
						Parameter param = new Parameter();
						if (!param.parse(args, vars, line)) {
							System.out.println(" @? " + line);
							break;
						}
						if (param.isOutput) {
							output.add(param);
						} else {
							input.add(param);
						}
					}
				}
				line = nextNonBlank(it);
			}
		}
		// System.out.println("  ." + line);
		HashMap<String, Parameter> fields = new HashMap<String, Parameter>();
		StringBuffer call = new StringBuffer();
		Vector<String> sizearray = new Vector<String>();
		
		// scan remaining C code body extracting c function invocation and outputs
		
		while (it.hasNext()) {
			line = nextLine(it);
			if (line == null || indent == 0)
				break;
			// skip comment blocks
			if (line.startsWith("/*")) {
				while(!line.endsWith("*/")) {
					line = nextNonBlank(it);
				}
				line = nextNonBlank(it);
			}
			// capture invocation
			if (call.length() == 0 && line.startsWith(name + "_c(")) {
				call.append(line);
				while (!line.endsWith(");")) {
					line = nextLine(it);
					call.append(line);
				}
				line = nextNonBlank(it);
			}
//			if (call != null) {
//				if (line.indexOf("mxSetField") >= 0) {
//					StringBuffer fline = new StringBuffer();
//					fline.append(line);
//					while (!line.endsWith(");")) {
//						line = nextLine(it);
//						fline.append(line);
//					}
//					Parameter field = parseField(fline.toString());
//					fields.put(field.name, field);
//				} else {
//					System.out.println(line);
//					if (line.startsWith("sizearray[")) {
//						sizearray.add(line);
//					}
//					if (line.startsWith("plhs[")) {
//						Parameter result = parseResult( it, line, outputNames, sizearray, output, vars, args );
//						line = nextNonBlank(it);  // parseResults backs to last used line
//						output.addElement( result );
//						sizearray.clear();
//					}
//				}
//			} else if (call.length() > 0) {
//				if (!line.isEmpty())
//					System.out.println("[" + name + "]: " + line );
//			}
		}
		
		
		// Output Mathematica function declaration
		StringBuffer sb = new StringBuffer();
		sb.append("(* ");
		sb.append(name);
		sb.append(" - ");
		sb.append(index.get(name));
		sb.append("\n");
		sb.append(" *\n");
		sb.append(doc.abstrakt.toString());
		sb.append(" *  " + doc.mfunc.toString() + "\n");
		//sb.append(doc.io.toString());
		//sb.append(doc.reading.toString());
		sb.append(" *)\n");
		if (output.isEmpty() && !fields.isEmpty()) {
			// for (String var : vars.keySet()) {
			// System.out.println( "  :v: " + vars.get(var));
			// }
			// for (String var : fields.keySet()) {
			// System.out.println( "  :f: " + fields.get(var));
			// }
			// System.out.println();
			sb.append("$");
			sb.append(name);
			sb.append(" = ");
			sb.append("LibraryFunctionLoad[libraryName,");
			sb.append('"');
			sb.append("wspice_");
			sb.append(name);
			sb.append('"');
			sb.append(", ");
			sb.append("\n");
			sb.append("\t");
			sb.append("LinkObject");
			sb.append(", ");
			sb.append("LinkObject");
			sb.append("];\n");
		} else {
			sb.append("$");
			sb.append(name);
			sb.append(" = ");
			sb.append("LibraryFunctionLoad[libraryName,");
			sb.append('"');
			sb.append("wspice_");
			sb.append(name);
			sb.append('"');
			sb.append(", ");
			sb.append("\n");
			sb.append("\t");
			sb.append(toInputDecl(input));
			sb.append(", ");
			sb.append(toOutputDecl(output));
			sb.append("];\n");
		}

		sb.append("(*");
		sb.append(toOutputDoc(output));
		sb.append("*) ");
		inputSignature(name, input, sb, true, true);
		sb.append("] := Module[");
		sb.append("{},");
		sb.append("\n");
		sb.append("\t");
		sb.append(generateCheckCode());
		sb.append("\n");
		sb.append("\t");
		sb.append("$");
		sb.append(name);
		sb.append("[");
		boolean first = true;
		for (Parameter param : input) {
			if (!first)
				sb.append(", ");
			first = false;
			sb.append(param.name);
		}
		sb.append("]");
		sb.append(" ];");
		sb.append("\n");
		packageDeclarations.append(sb.toString());
		
		// Output usage block
		
		packageUsages.append(name + "::usage = ");
		packageUsages.append( String.format("\"%s\";\n", doc.usage.toString()) );
		// Output expected block
		packageUsages.append("  " + name + "::expected = ");
		sb = new StringBuffer();
		inputSignature(name, input, sb, true, false);
		packageUsages.append( String.format("\"%s]\";\n", sb.toString()) );
		if (!input.isEmpty()) {
			sb = new StringBuffer();
			inputSignature(name, input, sb, false, false);
			packageUsages.append( String.format("  %s] := Message[%s::expected];\n",
					sb.toString(), name ));
		}
		packageUsages.append( String.format("  %s[___] := Message[%s::expected];\n", name,
				name) );
		
		if (target != null) {
			System.out.println("I " + input.size());
			for (Parameter p : input) {
				System.out.println( "I: " + p );
			}
			System.out.println("O " + output.size());
			for (Parameter p : output) {
				System.out.println( "O: " + p );
			}
			System.out.println("V " + vars.size());
			for (String key : vars.keySet()) {
				System.out.println("V: " + vars.get(key));
			}
			System.out.println("A " + args.size());
			for (String key : args.keySet()) {
				System.out.println("A: " + args.get(key));
			}
		}
		return true;
	}

	// called for lines starting with plhs
	/* Interior blank lines are ignored
	 * Handled idioms:
	 * 1------------------
	 *  plhs[0]  = mxCreateDoubleMatrix( dim, 1, mxREAL );
	 *  values   = A_DBL_RET_ARGV(0);
	 *  MOVED( ret_values, dim, values );
	 * 2------------------
	 */
	private Parameter parseResult(ListIterator<String> it, String line,
			Vector<String> outputNames,
			Vector<String> sizearray, Vector<Parameter> output, HashMap<String, Variable> vars,
			HashMap<String, ArgCheck> args) throws Exception {
		System.out.println("parseResult: " + line);
		String[] tokens = splitNoEmpties( line, " |,|\\[|\\]|\\(|\\)" );
		if (tokens[0].equals("plhs") && tokens[2].equals("=")) {
			int position = Integer.parseInt(tokens[1]);
			String name = outputNames.get(position);
			if (tokens[3].startsWith("mxCreateDoubleMatrix")) {
				Parameter p = new Parameter(name, "Real", position);
				p.isArray = true;
				p.isOutput = true;
				p.allocation = new Vector<String>();
				p.allocation.add( tokens[4] );
				p.allocation.add( tokens[5] );
				String l1 = nextNonBlank(it);
				String l2 = nextNonBlank(it);
				if (l1.indexOf("A_DBL_RET_ARGV") >= 0 && l2.startsWith("MOVED")) {
					tokens = splitNoEmpties( l1, " |=");
					String pointerName = tokens[0];
					l2 = l2.replaceAll(pointerName, "*");
					p.copy = l2;
					return p;
				} else {
					priorNonBlank(it);
					priorNonBlank(it);
				}
				return null;
			} else {
				System.err.println("parseResult? " + line);
				throw new Exception("Unrecognized idiom");
			}
		} else {
			priorNonBlank(it);
			return null;
		}
	}

	private String[] splitNoEmpties(String line, String pattern) {
		String[] allTokens = line.split(pattern);
		Vector<String> tokens = new Vector<String>();
		for (String token : allTokens) {
			if (!token.isEmpty())
				tokens.add(token);
		}
		return tokens.toArray( new String[tokens.size()] );
	}

	private Parameter parseField(String line) {
		String[] tokens = splitNoEmpties(line, ",| |\"|\\(|\\)");
		String name = tokens[3];
		String type = null;
		switch (tokens[4]) {
		case "mxCreateDoubleScalar":
			type = "Real";
			break;
		case "mxCreateString":
			type = "String";
			break;
		case "zzmice_CreateIntScalar":
			type = "Integer";
			break;
		case "mxCreateLogicalScalar":
			type = "Boolean";
			break;
		default:
			break;
		}
		Parameter field = new Parameter(name, type, 0);
		return field;
	}

	protected void inputSignature(String name, Vector<Parameter> input,
			StringBuffer sb, boolean document, boolean pattern) {
		sb.append(name);
		sb.append("[");
		boolean first = true;
		for (Parameter param : input) {
			if (!first)
				sb.append(", ");
			first = false;
			sb.append(param.name);
			sb.append("_");
			if (pattern) {
				if (param.isArray) {
					if (param.argCheck.rank == 1) {
						sb.append(String.format("List /; Length[%s] == %d",
								name, param.argCheck.dims.get(0)));
					} else {
						StringBuffer dsb = new StringBuffer();
						boolean f = true;
						for (Integer d : param.argCheck.dims) {
							if (!f)
								dsb.append(",");
							f = false;
							dsb.append(d.toString());
						}
						sb.append(String.format(
								"List /; Dimensions[%s] == {%s}", name,
								dsb.toString()));
					}
				} else {
					switch (param.type) {
					case "Real":
						sb.append("?NumberQ");
						break;
					case "Integer":
						sb.append("?IntegerQ");
						break;
					default:
						break;
					}
				}
			}
			if (document) {
				sb.append(" ");
				sb.append(toInputDoc(param));
			}
		}
	}

	private Object generateCheckCode() {
		return "(* check arguments *)";
	}

	HashMap<String, String> index = new HashMap<String, String>();

	protected void loadIndex() {
		File txt = new File(
				"/Users/lintondf/Library/Mathematica/Applications/DFL/index.txt");
		try {
			List<String> lines = FileUtils.readLines(txt, "UTF-8");
			ListIterator<String> it = lines.listIterator();
			while (it.hasNext()) {
				String line = nextNonBlank(it);
				if (line == null || line.isEmpty())
					break;
				String[] tokens = line.split("-|\t");
				if (tokens[0].length() == 1)
					continue;
				// for (String token : tokens) {
				// System.out.print("<"+token.trim()+">");
				// }
				// System.out.println();
				index.put(tokens[0].trim().substring(0, tokens[0].length() - 3)
						.toLowerCase(), tokens[1].trim());
			}
			// for (String name : index.keySet()) {
			// System.out.println(name + " - " + index.get(name));
			// }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected class Documentation {
		public StringBuffer abstrakt;
		public StringBuffer io;
		public StringBuffer reading;
		public StringBuffer usage;
		public StringBuffer mfunc;

		public Documentation() {
			abstrakt = new StringBuffer();
			io = new StringBuffer();
			reading = new StringBuffer();
			usage = new StringBuffer();
		}

		protected String nextDocLine(ListIterator<String> it, String name) {
			String line = it.next();
			if (line == null)
				return line;
			line = line.replaceAll("CSPICE_", "");
			line = line.replaceAll("cspice_", "");
			line = line.replaceAll(name.toUpperCase(), name);
			return line;
		}
		
		protected void parseIO(String name) {
			String[] linesArray = io.toString().split("\n");
			List<String> lines = Arrays.asList(linesArray);
			ListIterator<String> lit = lines.listIterator();
			Vector<Variable> results = null;
			while (lit.hasNext()) {
				String line = lit.next();
				if (line.indexOf("returns:") >= 0) {
					results = new Vector<Variable>();
					while (lit.hasNext()) {
						line = lit.next();
						if (line.length() > 8) {
							if (line.startsWith(" *      ") && line.charAt(8) != ' ') {
								String[] decl = line.substring(8).split(" ", 2);
								if (decl.length < 2) {
									System.err.println(name +":" +"R! " + line );
									break;
								}
								System.out.println(name +":" +"R; " + decl[0]);
								System.out.println(name +":" +"R: " + decl[1].trim() );
								line = decl[1].trim();
								if (line.startsWith("a ") || line.startsWith("the ")) {
									
								} else {
									System.out.println(name +":" + "R? " + line );
								}
								while (lit.hasNext()) {
									line = lit.next();
									if (line.startsWith(" *      ") && line.charAt(8) != ' ') {
										lit.previous();
										break;
									}
									if (line.substring(2).indexOf("= size(") >= 0) {
										line = line.substring(2).trim();
										String next = lit.next();
										if (next.trim().indexOf("= class(") >= 0) {
											line = line + "; " + next.substring(2).trim();
										} else {
											lit.previous();
										}
										System.out.println(name +":" +"R# " + line );
									}
								}
							}
						}
					}
					break;
				}
			}
			if (results == null) {
				System.err.println("Missing return block: " + name );
			}
		}

		public void load(String name) {
			File dotm = new File(
					"/Users/lintondf/Google Drive/cspice/mice/cspice_" + name
							+ ".m");
			try {
				List<String> lines = FileUtils.readLines(dotm, "UTF-8");
				ListIterator<String> it = lines.listIterator();
				String line = nextDocLine(it, name);
				while (it.hasNext()) {
					if (line == null)
						break;
					switch (line) {
					case "%-Abstract":
						abstrakt.append(" *- Abstract");
						abstrakt.append("\n");
						line = nextDocLine(it, name);
						while (!line.startsWith("%-")) {
							line = line.replaceAll("%", " *");
							abstrakt.append(line);
							abstrakt.append("\n");
							usage.append(line.replaceAll(" \\*", ""));
							usage.append("\n");
							line = nextDocLine(it, name);
						}
						break;
					case "%-I/O":
						io.append(" *- I/O");
						io.append("\n");
						line = nextDocLine(it, name);
						while (!line.startsWith("%-")) {
							line = line.replaceAll("%", " *");
							io.append(line);
							io.append("\n");
							usage.append(line.replaceAll(" \\*", ""));
							usage.append("\n");
							line = nextDocLine(it, name);
						}
						parseIO(name);
						break;
					case "%-Required Reading":
						reading.append(" *- Required Reading");
						reading.append("\n");
						line = nextDocLine(it, name);
						while (!line.startsWith("%-")) {
							line = line.replaceAll("%", " *");
							reading.append(line);
							reading.append("\n");
							line = nextDocLine(it, name);
						}
						break;
					default:
						line = nextDocLine(it, name);
						break;
					}
					if (line != null && line.startsWith("function")) {
						mfunc = new StringBuffer();
						line = line.replaceAll("          ", " ");
						line = line.replaceAll("         ", " ");
						line = line.replaceAll("        ", " ");
						line = line.replaceAll("       ", " ");
						line = line.replaceAll("      ", " ");
						line = line.replaceAll("     ", " ");
						line = line.replaceAll("    ", " ");
						line = line.replaceAll("   ", " ");
						line = line.replaceAll("  ", " ");
						mfunc.append(line.replaceAll("\\.\\.\\.", ""));
						while (line != null && line.endsWith("...")) {
							line = nextDocLine(it, name);
							mfunc.append(line.replaceAll("\\.\\.\\.", ""));
						}
						System.out.println("% " + mfunc.toString());
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private final String target = null; //"bodvcd"; // "bodn2c";
	private HashSet<String> exclude = new HashSet<String>();

	public void translate() {
		// these modules crash the translator
		exclude.add("ckw01");
		exclude.add("ckw02");
		exclude.add("ckw03");
		exclude.add("dafgs");
		exclude.add("ducrss");
		exclude.add("dvcrss");
		exclude.add("dvdot");
		exclude.add("dvnorm");
		exclude.add("dvsep");
		exclude.add("edterm");
		exclude.add("frmnam");
		exclude.add("gcpool");
		exclude.add("gdpool");
		exclude.add("gipool");
		exclude.add("gnpool");
		exclude.add("inedpl");
		exclude.add("inrypl");
		exclude.add("kdata");
		exclude.add("kinfo");
		exclude.add("latsph");
		exclude.add("phaseq");
		exclude.add("raxisa");
		exclude.add("spkcov");
		exclude.add("spkcpo");
		exclude.add("spkcpt");
		exclude.add("spkcvo");
		exclude.add("spkcvt");
		exclude.add("spkw08");
		exclude.add("stpool");
		exclude.add("vdist");
		exclude.add("vperp");
		exclude.add("vnorm");
		exclude.add("vprjp");
		exclude.add("vprjpi");
		exclude.add("vproj");
		exclude.add("vsep");
		exclude.add("wninsd");
		exclude.add("xf2eul");
		
		loadIndex();
		String name = null;
		File mice = new File("/Users/lintondf/Google Drive/cspice/mice/mice.c");
		try {
			List<String> lines = FileUtils.readLines(mice, "UTF-8");
			ListIterator<String> it = lines.listIterator();
			while (it.hasNext()) {
				String line = nextLine(it);
				if (line.startsWith(FUNCTION_TOKEN1)) { // cspice_
					name = line.substring(FUNCTION_TOKEN1.length());
					name = name.substring(0, name.indexOf('('));
					// System.out.println( name );
					while (!line.endsWith(")")) {
						line = nextLine(it);
					}
					// always exclude housekeeping
					if (name.equals("mice") || name.equals("cleanup"))
						continue;
					if (target == null) {
						if (exclude.contains(name))
							continue;						
					} else if (!name.equals(target))
						continue;
					if (!scanFunction(it, name)) {
						System.err.println("Scan error on: " + name);
						System.err.println(it.next());
					}
				} else if (line.startsWith(FUNCTION_TOKEN2)) { // mice_
				    name = line.substring(FUNCTION_TOKEN2.length());
					name = name.substring(0, name.indexOf('('));
					while (!line.endsWith(")")) {
						line = nextLine(it);
					}
					// always exclude housekeeping
					if (name.equals("mice") || name.equals("cleanup"))
						continue;
					if (target == null) {
						if (exclude.contains(name))
							continue;						
					} else if (!name.equals(target))
						continue;
					if (!scanFunction(it, name)) {
						System.err.println("Scan error on: " + name);
						System.err.println(it.next());
					}
				}
			}
//			System.out.printf(packageTemplate, 
//					packageUsages.toString().substring(0, 1), 
//					packageDeclarations.toString() );
		} catch (Exception e) {
			System.err.printf("		exclude.add(\"%s\");\n", name );
			e.printStackTrace();
		}
	}
	
	static class Result {
		String  name;
		String  type;
		String  dims;
		boolean isVectorizable;
		
		public String toString() {
			String dimsString = "0";
			if (dims != null) {
				if (dims.equals("()"))
					dimsString = "*";
				else
					dimsString = dims;
			}
			return name +":"+ type +":"+ dimsString + ((isVectorizable) ? "[]" : "");
		}
		
		protected String removeDims( String decl ) {
			int i = decl.indexOf('(');
			if (i >= 0) {
				int j = decl.indexOf(')');
				if (j >= 0) {
					dims = decl.substring(i, j+1);
				} else {
					System.out.println(decl);
				}
				decl = decl.substring(0, i);
			}
			return decl;
		}
 		
		public Result( String decl ) {
			type = "Number";
			if (decl.startsWith("_")) {
				decl = decl.substring(1, decl.length()-1);
				isVectorizable = true;
				if (decl.startsWith("`")) {
					decl = decl.substring(1, decl.length()-1);
					type = "String";
				}
				name = removeDims( decl );
			} else if (decl.startsWith("`")) {
				decl = decl.substring(1, decl.length()-1);
				type = "String";
				name = removeDims( decl );
			} else {
				name = removeDims( decl );
			}
		}

		public static Vector<Result> parseDeclaration(String[] tokens) {
			Vector<Result> results = new Vector<Result> ();
			for (int i = 1; i < tokens.length; i++) {
				if (tokens[i].equals("=")) 
					break;
				String t = tokens[i];
				if (t.endsWith(","))
					t.substring(0, t.length()-1);
				Result r = new Result(t);
				results.add(r);
			}
			return results;
		}
	}
	
	HashMap<String, Vector<Result>> callingSequences = new HashMap<String, Vector<Result>>();
	
	public void scanCallSequenceIndex(String path) {
		File mice = new File(path);
		try {
			List<String> lines = FileUtils.readLines(mice, "UTF-8");
			ListIterator<String> it = lines.listIterator();
			while (it.hasNext()) {
				String line = nextLine(it);
				//System.out.println(line.length() + " [" + line + "]");
				if (line.equals("A"))
					break;
			}
			while (it.hasNext()) {
				String line = nextLine(it);
				if (line.endsWith("\tTop"))
					continue;
				if (line.indexOf("=") == -1) {
					continue;
				}
				String[] tokens = splitNoEmpties(line, ":| |\\[|\\]");
				if (tokens.length < 3) {
					for (String token : tokens) {
						System.out.print("<"+ token + ">");
					}
					System.out.println();
					continue;
				}
				String allCapsName = tokens[0];
				Vector<Result> results = Result.parseDeclaration( tokens );
				callingSequences.put( allCapsName.toLowerCase(), results );
			}
			
			ArrayList<String> keys = new ArrayList<String>();
			keys.addAll(callingSequences.keySet());
			Collections.sort( keys );
			for (String key : keys ) {
				System.out.print(key + " : ");
				Vector<Result> results = callingSequences.get(key);
				for (Result r : results) {
					System.out.print("{" + r +"} " );
				}
				System.out.println();
			}
			for (String key : keys ) {
				Vector<Result> results = callingSequences.get(key);
				if (results == null)
					System.out.println(key + " Null Results");
			}
			for (String key : keys ) {
				Vector<Result> results = callingSequences.get(key);
				if (results != null && results.isEmpty())
					System.out.println(key + " Empty Results");
			}
			for (String key : keys ) {
				Vector<Result> results = callingSequences.get(key);
				if (results != null && results.size() == 1)
					System.out.println(key + " One Result " + results.get(0) );
			}
			for (String key : keys ) {
				Vector<Result> results = callingSequences.get(key);
				if (results != null && results.size() > 1)
					System.out.println(key + " Many Results");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.scanCallSequenceIndex("mice_index.txt");
		builder.translate();
	}
}
