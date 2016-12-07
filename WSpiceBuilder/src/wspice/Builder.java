package wspice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

import wspice.MATLABParser.ScriptContext;
import wspice.MATLABParser.StatBlockContext;
import wspice.TranslateMiceTest.Module;

public class Builder {

	public static final boolean isMacOS = System.getProperty("os.name").startsWith("Mac");

	static final String FUNCTION_TOKEN1 = "void cspice_";
	static final String FUNCTION_TOKEN2 = "void mice_";
	static final String EXTRA_DECL = "struct extra_dims";
	static final String CAN_REF = "check_arg_num";
	static final String ARGCHECK_TOKEN = "struct argcheck";
	static final String CHECK_EXTRA_TOKEN = "extra = mice_checkargs";
	static final String MEMSET_TOKEN = "memset(";
	static final String ONE_LINE_TOKEN = "plhs[0] = mxCreate";

	static final String packageTemplate = "BeginPackage[\"WSpice`\", {\"CCompilerDriver`\"}]\n" + "\n"
			+ "(* External Interface Declarations *)\n\n" + "%s\n" + "Begin[\"`Private`\"]\n\n"
			+ "    sourcePath = \"/Users/lintondf/workspace/WSpice/src/wspice.c\";\n"
			+ "    libraryName = \"wspice\";\n" + "    \n"
			+ "    sharedLibraryPath := CreateLibrary[File[sourcePath], libraryName,\n"
			+ "\"CompileOptions\"->\"-fPIC\" , \"IncludeDirectories\"->{\"/Users/lintondf/cspice/include\"},\n"
			+ "\"LibraryDirectories\"->{\"/Users/lintondf/cspice/lib\"},\n" + "\"Libraries\"->{\"cspice\"}]\n" + "\n"
			+ "     LibraryLoad[sharedLibraryPath]; Print[\"Startup Complete\"]\n" + "     	      \n"
			+ "shutdown[] :=\n" + "	Module[ {},\n" + "	      LibraryUnload[sharedLibraryPath]]\n" + "	      \n"
			+ "%s\n\n" + "\"WSpice Loaded\";\n" + "\n" + "End[]\n" + "EndPackage[]\n";
	StringBuffer packageUsages = new StringBuffer();
	StringBuffer packageDeclarations = new StringBuffer();

	protected static PrintStream log = System.out;

	protected Lexer lexer = new Lexer();

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
			// log.print("<" + token + "> " );
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
							} else if (tokens[i].startsWith("SIDLEN")) {
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
			return name + " " + type + " " + rank + " " + dims.size() + " " + isVectorizable;
		}

		boolean parse(String line) {
			String[] tokens = line.split(" |,");
			// for (String token : tokens ) {
			// if (!token.isEmpty()) {
			// log.print("<" + token + "> ");
			// }
			// }
			// log.println();
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
							dims.add(Integer.parseInt(t.substring(0, t.length() - 1)));
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
			return name + " " + position + " " + isOutput + " " + isArray + " " + type + " " + argCheck + " "
					+ variable;
		}

		public boolean parse(HashMap<String, ArgCheck> args, HashMap<String, Variable> vars, String line) {
			if (line.startsWith("mxGetString")) {
				type = "String";
				isOutput = false;
				isArray = false;
				String[] tokens = lexer.splitNoEmpties(line, ",| |\\(|\\)|\\[|\\]");
				if (!tokens[1].equals("prhs"))
					return false;
				position = Integer.parseInt(tokens[2]);
				name = tokens[3];
			} else {
				String[] tokens = lexer.splitNoEmpties(line, " ");
				int i = 0;
				name = tokens[i];
				i++;
				if (!tokens[i].equals("="))
					return false;
				i++;
				tokens = lexer.splitNoEmpties(tokens[2], "\\(|\\)");
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
					tokens = lexer.splitNoEmpties(tokens[i], "\\[|\\]");
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
		log.println(name);
		boolean hasExtra = false;
		boolean hasCheckNum = false;
		boolean hasArgCheck = false;
		boolean hasMemset = false;
		Documentation doc = new Documentation();
		doc.load(name);
		String[] mfunc = lexer.splitNoEmpties(doc.mfunc.toString(), " |\\[|\\]|\\(|\\)");
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
		String line = lexer.nextLine(it);
		if (!line.startsWith("{"))
			return false;
		while (it.hasNext()) {
			line = lexer.nextLine(it);
			if (line.startsWith(EXTRA_DECL))
				break;
			if (line.startsWith(CAN_REF))
				break;
			if (line.startsWith("/*")) {
				while (it.hasNext()) {
					line = lexer.nextLine(it);
					if (line.startsWith("*/")) {
						line = lexer.nextNonBlank(it);
						break;
					}
				}
				break;
			}
			if (!line.isEmpty()) {
				Variable var = new Variable();
				var.parse(line);
				// log.println(" >" + var);
				vars.put(var.name, var);
			}
		}
		boolean inChecks = true;
		while (inChecks) {
			inChecks = false;
			if (line.startsWith("/*")) {
				inChecks = true;
				while (!line.endsWith("*/")) {
					line = lexer.nextLine(it);
				}
				line = lexer.nextNonBlank(it);
			} else if (line.startsWith(ARGCHECK_TOKEN)) {
				hasArgCheck = true;
				inChecks = true;
				while (it.hasNext()) {
					line = lexer.nextLine(it);
					if (line.startsWith("};")) {
						line = lexer.nextNonBlank(it);
						break;
					} else if (line.endsWith(",")) {
						// log.println(" -" + line );
						ArgCheck ac = new ArgCheck();
						ac.parse(line);
						args.put(ac.name, ac);
					}
				}
			} else if (line.startsWith(MEMSET_TOKEN)) {
				hasMemset = true;
				inChecks = true;
				line = lexer.nextNonBlank(it);
			} else if (line.startsWith(CHECK_EXTRA_TOKEN)) {
				hasExtra = true;
				inChecks = true;
				line = lexer.nextNonBlank(it);
			} else if (line.startsWith(EXTRA_DECL)) {
				hasExtra = true;
				inChecks = true;
				line = lexer.nextNonBlank(it);
			} else if (line.startsWith(CAN_REF)) {
				hasCheckNum = true;
				inChecks = true;
				line = lexer.nextNonBlank(it);
				// } else {
				// log.println("? " + line);
				// line = nextNonBlank( it );
			}
		}
		if (line.startsWith(ONE_LINE_TOKEN)) {
			if (line.indexOf("mxCreateDoubleScalar") >= 0) {
				Parameter param = new Parameter("lhs", "Real", 0);
				output.add(param);
			} else {
				log.println("  !" + line.substring(ONE_LINE_TOKEN.length()));
			}
		} else {
			// scan up to C function invocation
			if (target != null)
				log.println("? " + line);
			String baseName = name;
			int idx = baseName.indexOf("_");
			if (idx >= 0) {
				baseName = baseName.substring(0, idx);
			}
			while (line != null && line.indexOf(baseName) == -1) {
				if (target != null)
					log.println("  @" + line);
				if (line.startsWith("/*")) {
					while (!line.endsWith("*/")) {
						line = lexer.nextNonBlank(it);
					}
					line = lexer.nextNonBlank(it);
					continue;
				}
				if (line.indexOf("mxGetString") >= 0) {
					String[] tokens = lexer.splitNoEmpties(line, "\\(|\\)|\\[|\\]|\\,| ");
					if (tokens.length >= 4 && tokens[0].equals("mxGetString") && tokens[1].equals("prhs")) {
						Parameter param = new Parameter();
						try {
							param.name = tokens[3];
							param.position = Integer.parseInt(tokens[2]);
							param.type = "String";
							input.add(param);
						} catch (Exception x) {
							System.err.println(x);
							System.err.println("  @??? " + line);
						}
					} else {
						System.err.println("  @??? " + line);
					}
				} else if (line.indexOf("mxGetNumberOfElements") == -1) {
					String[] tokens = lexer.splitNoEmpties(line, " ");
					if (args.containsKey(tokens[0])) {
						Parameter param = new Parameter();
						if (!param.parse(args, vars, line)) {
							log.println(" @? " + line);
							break;
						}
						if (param.isOutput) {
							output.add(param);
						} else {
							input.add(param);
						}
					}
				}
				line = lexer.nextNonBlank(it);
			}
		}
		// log.println(" ." + line);
		HashMap<String, Parameter> fields = new HashMap<String, Parameter>();
		StringBuffer call = new StringBuffer();
		Vector<String> sizearray = new Vector<String>();

		// scan remaining C code body extracting c function invocation and
		// outputs

		while (it.hasNext()) {
			line = lexer.nextLine(it);
			if (line == null || lexer.indent == 0)
				break;
			// skip comment blocks
			if (line.startsWith("/*")) {
				while (!line.endsWith("*/")) {
					line = lexer.nextNonBlank(it);
				}
				line = lexer.nextNonBlank(it);
			}
			// capture invocation
			if (call.length() == 0 && line.startsWith(name + "_c(")) {
				call.append(line);
				while (!line.endsWith(");")) {
					line = lexer.nextLine(it);
					call.append(line);
				}
				line = lexer.nextNonBlank(it);
			}
			// if (call != null) {
			// if (line.indexOf("mxSetField") >= 0) {
			// StringBuffer fline = new StringBuffer();
			// fline.append(line);
			// while (!line.endsWith(");")) {
			// line = nextLine(it);
			// fline.append(line);
			// }
			// Parameter field = parseField(fline.toString());
			// fields.put(field.name, field);
			// } else {
			// log.println(line);
			// if (line.startsWith("sizearray[")) {
			// sizearray.add(line);
			// }
			// if (line.startsWith("plhs[")) {
			// Parameter result = parseResult( it, line, outputNames, sizearray,
			// output, vars, args );
			// line = nextNonBlank(it); // parseResults backs to last used line
			// output.addElement( result );
			// sizearray.clear();
			// }
			// }
			// } else if (call.length() > 0) {
			// if (!line.isEmpty())
			// log.println("[" + name + "]: " + line );
			// }
		}

		StringBuffer sb;
		outputMathematicaFunctionDefinition(name, doc, output, input, fields);

		// Output usage block

		packageUsages.append(name + "::usage = ");
		packageUsages.append(String.format("\"%s\";\n", doc.usage.toString()));
		// Output expected block
		packageUsages.append("  " + name + "::expected = ");
		sb = new StringBuffer();
		inputSignature(name, input, sb, true, false);
		packageUsages.append(String.format("\"%s]\";\n", sb.toString()));
		if (!input.isEmpty()) {
			sb = new StringBuffer();
			inputSignature(name, input, sb, false, false);
			packageUsages.append(String.format("  %s] := Message[%s::expected];\n", sb.toString(), name));
		}
		packageUsages.append(String.format("  %s[___] := Message[%s::expected];\n", name, name));

		if (target != null) {
			log.println("I " + input.size());
			for (Parameter p : input) {
				log.println("I: " + p);
			}
			log.println("O " + output.size());
			for (Parameter p : output) {
				log.println("O: " + p);
			}
			log.println("V " + vars.size());
			for (String key : vars.keySet()) {
				log.println("V: " + vars.get(key));
			}
			log.println("A " + args.size());
			for (String key : args.keySet()) {
				log.println("A: " + args.get(key));
			}
		}
		return true;
	}

	protected void outputMathematicaFunctionDefinition(String name, Documentation doc, Vector<Parameter> output,
			Vector<Parameter> input, HashMap<String, Parameter> fields) {
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
		// sb.append(doc.io.toString());
		// sb.append(doc.reading.toString());
		sb.append(" *)\n");
		if (output.isEmpty() && !fields.isEmpty()) {
			// for (String var : vars.keySet()) {
			// log.println( " :v: " + vars.get(var));
			// }
			// for (String var : fields.keySet()) {
			// log.println( " :f: " + fields.get(var));
			// }
			// log.println();
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
	}

	// called for lines starting with plhs
	/*
	 * Interior blank lines are ignored Handled idioms: 1------------------
	 * plhs[0] = mxCreateDoubleMatrix( dim, 1, mxREAL ); values =
	 * A_DBL_RET_ARGV(0); MOVED( ret_values, dim, values ); 2------------------
	 */
	private Parameter parseResult(ListIterator<String> it, String line, Vector<String> outputNames,
			Vector<String> sizearray, Vector<Parameter> output, HashMap<String, Variable> vars,
			HashMap<String, ArgCheck> args) throws Exception {
		log.println("parseResult: " + line);
		String[] tokens = lexer.splitNoEmpties(line, " |,|\\[|\\]|\\(|\\)");
		if (tokens[0].equals("plhs") && tokens[2].equals("=")) {
			int position = Integer.parseInt(tokens[1]);
			String name = outputNames.get(position);
			if (tokens[3].startsWith("mxCreateDoubleMatrix")) {
				Parameter p = new Parameter(name, "Real", position);
				p.isArray = true;
				p.isOutput = true;
				p.allocation = new Vector<String>();
				p.allocation.add(tokens[4]);
				p.allocation.add(tokens[5]);
				String l1 = lexer.nextNonBlank(it);
				String l2 = lexer.nextNonBlank(it);
				if (l1.indexOf("A_DBL_RET_ARGV") >= 0 && l2.startsWith("MOVED")) {
					tokens = lexer.splitNoEmpties(l1, " |=");
					String pointerName = tokens[0];
					l2 = l2.replaceAll(pointerName, "*");
					p.copy = l2;
					return p;
				} else {
					lexer.priorNonBlank(it);
					lexer.priorNonBlank(it);
				}
				return null;
			} else {
				System.err.println("parseResult? " + line);
				throw new Exception("Unrecognized idiom");
			}
		} else {
			lexer.priorNonBlank(it);
			return null;
		}
	}

	private Parameter parseField(String line) {
		String[] tokens = lexer.splitNoEmpties(line, ",| |\"|\\(|\\)");
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

	protected void inputSignature(String name, Vector<Parameter> input, StringBuffer sb, boolean document,
			boolean pattern) {
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
						sb.append(String.format("List /; Length[%s] == %d", name, param.argCheck.dims.get(0)));
					} else {
						StringBuffer dsb = new StringBuffer();
						boolean f = true;
						for (Integer d : param.argCheck.dims) {
							if (!f)
								dsb.append(",");
							f = false;
							dsb.append(d.toString());
						}
						sb.append(String.format("List /; Dimensions[%s] == {%s}", name, dsb.toString()));
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
				(isMacOS) ? "/Users/lintondf/Library/Mathematica/Applications/DFL/" : "C:\\Users\\Barbara\\GIT\\WSpice",
				"index.txt");
		try {
			List<String> lines = FileUtils.readLines(txt, "UTF-8");
			ListIterator<String> it = lines.listIterator();
			while (it.hasNext()) {
				String line = lexer.nextNonBlank(it);
				if (line == null || line.isEmpty())
					break;
				String[] tokens = line.split("-|\t");
				if (tokens[0].length() == 1)
					continue;
				// for (String token : tokens) {
				// log.print("<"+token.trim()+">");
				// }
				// log.println();
				index.put(tokens[0].trim().substring(0, tokens[0].length() - 3).toLowerCase(), tokens[1].trim());
			}
			// for (String name : index.keySet()) {
			// log.println(name + " - " + index.get(name));
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
									if (decl.length == 1) {
										if (decl[0].equals("None.")) {
											continue;
										} else if (decl[0].endsWith(",")) {
											// log.println(name +":" +"R, " +
											// decl[0]);
											continue; // TODO accumlate variable
														// list
										}
									} else {
										System.err.println(name + ":" + "R! " + line);
									}
									break;
								}
								// log.println(name +":" +"R; " + decl[0]);
								// log.println(name +":" +"R: " + decl[1].trim()
								// );
								line = decl[1].trim();
								if (line.startsWith("a ") || line.startsWith("the ")) {

								} else {
									// log.println(name +":" + "R? " + line );
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
										// log.println(name +":" +"R# " + line
										// );
									}
								}
							}
						}
					}
					break;
				}
			}
			if (results == null) {
				log.println(name + ":Missing return block");
			}
		}

		public void load(String name) {
			File dotm = new File((isMacOS) ? "/Users/lintondf/Google Drive/cspice/mice/"
					: "C:\\Users\\Barbara\\Google Drive\\cspice\\mice", "cspice_" + name + ".m");
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
						line = line.replaceAll("\\s{2,}", " ").trim();
						// line = line.replaceAll(" ", " ");
						// line = line.replaceAll(" ", " ");
						// line = line.replaceAll(" ", " ");
						// line = line.replaceAll(" ", " ");
						// line = line.replaceAll(" ", " ");
						// line = line.replaceAll(" ", " ");
						// line = line.replaceAll(" ", " ");
						// line = line.replaceAll(" ", " ");
						// line = line.replaceAll(" ", " ");
						mfunc.append(line.replaceAll("\\.\\.\\.", ""));
						while (line != null && line.endsWith("...")) {
							line = nextDocLine(it, name);
							mfunc.append(line.replaceAll("\\.\\.\\.", ""));
						}
						log.println("% " + mfunc.toString().replaceAll("\\s{2,}", " ").trim());
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private final String target = null;
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
		File mice = new File((isMacOS) ? "/Users/lintondf/Google Drive/cspice/mice/"
				: "C:\\Users\\Barbara\\Google Drive\\cspice\\mice", "mice.c");
		try {
			List<String> lines = FileUtils.readLines(mice, "UTF-8");
			ListIterator<String> it = lines.listIterator();
			while (it.hasNext()) {
				String line = lexer.nextLine(it);
				if (line.startsWith(FUNCTION_TOKEN1)) { // cspice_
					name = line.substring(FUNCTION_TOKEN1.length());
					name = name.substring(0, name.indexOf('('));
					// log.println( name );
					while (!line.endsWith(")")) {
						line = lexer.nextLine(it);
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
						line = lexer.nextLine(it);
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
			PrintStream packageFile = new PrintStream(new FileOutputStream(new File("wspice.wl")));
			packageFile.printf(packageTemplate, packageUsages.toString().substring(0, 1),
					packageDeclarations.toString());
			packageFile.close();
		} catch (Exception e) {
			System.err.printf("		exclude.add(\"%s\");\n", name);
			e.printStackTrace();
		}
	}

	static class Result {
		String name;
		String type;
		String dims;
		boolean isVectorizable;

		public String toString() {
			String dimsString = "scalar";
			if (dims != null) {
				if (dims.equals("()"))
					dimsString = "*";
				else
					dimsString = dims;
			}
			return name + ":" + type + ":" + dimsString + ((isVectorizable) ? "[]" : "");
		}

		protected String removeDims(String decl) {
			int i = decl.indexOf('(');
			if (i >= 0) {
				int j = decl.indexOf(')');
				if (j >= 0) {
					dims = decl.substring(i, j + 1);
				} else {
					log.println(decl);
				}
				decl = decl.substring(0, i);
			}
			return decl;
		}

		public Result(String decl) {
			type = "Number";
			if (decl.startsWith("_")) {
				decl = decl.substring(1, decl.length() - 1);
				isVectorizable = true;
				if (decl.startsWith("`")) {
					decl = decl.substring(1, decl.length() - 1);
					type = "String";
				}
				name = removeDims(decl);
			} else if (decl.startsWith("`")) {
				decl = decl.substring(1, decl.length() - 1);
				type = "String";
				name = removeDims(decl);
			} else {
				name = removeDims(decl);
			}
		}

		public static Vector<Result> parseDeclaration(String[] tokens) {
			Vector<Result> results = new Vector<Result>();
			for (int i = 1; i < tokens.length; i++) {
				if (tokens[i].equals("="))
					break;
				String t = tokens[i];
				if (t.endsWith(","))
					t.substring(0, t.length() - 1);
				Result r = new Result(t);
				results.add(r);
			}
			return results;
		}
	}

	HashMap<String, Vector<Result>> outputSequences = new HashMap<String, Vector<Result>>();

	public void scanCallSequenceIndex(String filename) {
		File mice = new File((isMacOS) ? "/Users/lintondf/GIT/WSpice/" : "C:\\Users\\Barbara\\GIT\\WSpice", filename);
		try {
			List<String> lines = FileUtils.readLines(mice, "UTF-8");
			ListIterator<String> it = lines.listIterator();
			while (it.hasNext()) {
				String line = lexer.nextLine(it);
				// log.println(line.length() + " [" + line + "]");
				if (line.equals("A"))
					break;
			}
			while (it.hasNext()) {
				String line = lexer.nextLine(it);
				if (line.endsWith("\tTop"))
					continue;
				if (line.indexOf("=") == -1) {
					continue;
				}
				String[] tokens = lexer.splitNoEmpties(line, ":| |\\[|\\]");
				if (tokens.length < 3) {
					for (String token : tokens) {
						log.print("<" + token + ">");
					}
					log.println();
					continue;
				}
				String allCapsName = tokens[0];
				Vector<Result> results = Result.parseDeclaration(tokens);
				outputSequences.put(allCapsName.toLowerCase(), results);
			}

			ArrayList<String> keys = new ArrayList<String>();
			if (target == null) {
				keys.addAll(outputSequences.keySet());
			} else {
				keys.add(target);
			}
			Collections.sort(keys);
			for (String key : keys) {
				log.print(key + " : ");
				Vector<Result> results = outputSequences.get(key);
				for (Result r : results) {
					log.print("{" + r + "} ");
				}
				log.println();
			}
			for (String key : keys) {
				Vector<Result> results = outputSequences.get(key);
				if (results == null)
					log.println(key + " Null Results");
			}
			for (String key : keys) {
				Vector<Result> results = outputSequences.get(key);
				if (results != null && results.isEmpty())
					log.println(key + " Empty Results");
			}
			for (String key : keys) {
				Vector<Result> results = outputSequences.get(key);
				if (results != null && results.size() == 1)
					log.println(key + " One Result " + results.get(0));
			}
			for (String key : keys) {
				Vector<Result> results = outputSequences.get(key);
				if (results != null && results.size() > 1)
					log.println(key + " Many Results");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int countOccurrences(String haystack, char needle)
	{
	    int count = 0;
	    for (int i=0; i < haystack.length(); i++)
	    {
	        if (haystack.charAt(i) == needle)
	        {
	             count++;
	        }
	    }
	    return count;
	}
	
	
	protected static String indentString( int indent ) {
		return "                     ".substring(0, indent);
	}
	
	private static String translateMatlabBlock(Module module, String line, int indent) {
		Vector<String> block = new Vector<String>();
		block.add(line);
		return translateMatlabBlock( module, block, indent );
	}
	
	public static String translateMatlabBlock( Module module, List<String> block, int indent) {
		String prefix = indentString(indent);
		StringBuffer sb = new StringBuffer();
		int lineNumber = 1;
		for (String s : block ) {
			if (s.charAt(2) == ':')
				s = s.substring(3);
			int quotes = countOccurrences( s, '\'' );
			if (quotes == 1) {
				s = s.replace('\'', '@');
			} else if ((quotes %2) == 1) { // more than 1 odd number of single quotes
				//System.err.println("Fancy Transpose: " + s);
				s = handleFancyTransposes(s);
			}
			sb.append(s); sb.append("\n");
			System.out.printf("%5d : %s\n", lineNumber++, s );
		}
		ANTLRInputStream input = new ANTLRInputStream(sb.toString());
		MATLABLexer lexer = new MATLABLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MATLABParser parser = new MATLABParser(tokens);
		ScriptContext tree = parser.script(); // parse a compilationUnit
		//System.out.println(tree.toStringTree(parser));
		//System.out.println( TreeUtils.printTree(tree, parser) );
		MatlabListener listener = new MatlabListener(module, parser, tree, prefix);
		ParseTreeWalker.DEFAULT.walk(listener, tree);
		String wout = listener.getMathematica();
		return wout;
	}

	private static String handleFancyTransposes(String s) {
		// more than 1 odd number of single quotes
		char out[] = s.toCharArray();
		for (int i = 0; i < out.length; i++) {
			if (out[i] == '\'') {
				for (int k = i-1; k >= 0; k--) {
					Character ch = out[k];
					if (ch.isWhitespace(ch)) continue;
					if (ch.isLetter(ch) || ch.isDigit(ch) || ch == ')' || ch == ']') {
						out[i] = '@';
					}
					break;
				}
			}
			if (out[i] == '\'') { // unchanged; find match
				for (i++; i < out.length; i++) {
					if (out[i] == '\'') {
						break;
					}
				}
			}
		}
		return new String(out);
	}

	public static void main(String[] args) {
		MatlabListener.functionRemap.put("check", "WSpiceTest`check");
		MatlabListener.functionRemap.put("delete", "DeleteFile");
		MatlabListener.functionRemap.put("false", "False");
		MatlabListener.functionRemap.put("lasterr", "Head[$MessageList]" );
		MatlabListener.functionRemap.put("lasterror", "Head[$MessageList]" );
		MatlabListener.functionRemap.put("max", "Max");
		MatlabListener.functionRemap.put("MATLAB$check$error", "WSpiceTest`checkError");
		MatlabListener.functionRemap.put("min", "Min");			
		MatlabListener.functionRemap.put("numel", "Length");
		MatlabListener.functionRemap.put("regexp", "wsuRegExp"); //	wsuRegExp[H_, N_] := StringCases[H,RegularExpression[N]]		
		MatlabListener.functionRemap.put("size", "wsuSize"); // wsuSize[A_, d_] := Dimensions[A][[d]]; wsuSize[A] := Dimensions[A]			
		MatlabListener.functionRemap.put("true", "True");
		MatlabListener.functionRemap.put("sprintf", "MathPrintF`sprintf"); // GPL https://github.com/vlsd/MathPrintF
		MatlabListener.functionRemap.put("unique", "DeleteDuplicates");
		MatlabListener.functionRemap.put("zeros", "wsuZeros"); // wsuZeros[m_, n_] := ConstantArray[0, {m, n}];

		try {
			log = new PrintStream(new FileOutputStream(new File("log.txt")));
			// Builder builder = new Builder();
			// builder.scanCallSequenceIndex("mice_index.txt");
			// builder.translate();

			if (args.length == 0) {
				TranslateMiceTest translator = new TranslateMiceTest(
						((isMacOS) ? "/Users/lintondf/Google Drive/cspice/tmice/src/tmice/"
								: "C:\\Users\\NOOK\\Google Drive\\cspice\\tmice\\src\\tmice//")
						+ "ckcov_matlab.m");
				
				if (translator.translate()) {
					Stack<String>  forEnds = new Stack<String>();
					int indent = 4;
					String preamble = translateMatlabBlock(translator.module, translator.module.preamble, indent);
					indent += 2;
					StringBuffer caseTranslations = new StringBuffer();
					for (Module.Case testCase : translator.module.cases) {
						caseTranslations.append( String.format("%sModule[{}, (* %s *)\n", indentString(indent), testCase.title) );
						String forBlock = translateMatlabBlock(translator.module, testCase.forStatement, indent);
						if (!forBlock.trim().isEmpty()) {
							String[] forPieces = forBlock.split("\\(\\*\\@\\*\\)");
//							System.out.println("<"+forBlock.trim()+">");
//							System.out.println(forPieces.length);
//							System.out.printf("<%s> <%s>\n", forPieces[0], forPieces[1] );
							caseTranslations.append(forPieces[0]);
							forEnds.push(forPieces[1]);
						}
						indent += 2;
						for (Module.Subcase subCase : testCase.subcases) {
							caseTranslations.append( String.format("%s(* subcase *)\n", indentString(indent) ));
							if (subCase.catcher != null) { // in try/catch
								caseTranslations.append( String.format("%sCheckAbort[\n", indentString(indent)) );
								indent += 2;
								String steps = translateMatlabBlock(translator.module, subCase.steps, indent);
								caseTranslations.append(steps);
								indent -= 2;
								caseTranslations.append( String.format("%s,\n", indentString(indent)) );
								indent += 2;
								String check = translateMatlabBlock(translator.module, subCase.catcher, indent);
								caseTranslations.append(check);
								indent -= 2;
								caseTranslations.append( String.format("%s]; (*CatchAbort*)\n", indentString(indent)) );
							} else {
								String steps = translateMatlabBlock(translator.module, subCase.steps, indent);
								caseTranslations.append(steps);
							}
							String checks = translateMatlabBlock(translator.module, subCase.checks, indent);
							caseTranslations.append(checks);
							String setup = translateMatlabBlock(translator.module, subCase.setup, indent);
							caseTranslations.append(setup);
						}
						indent -= 2;
						if (testCase.forEnds) {
							caseTranslations.append( String.format("%s(* For *) %s", indentString(indent), 
									forEnds.pop() ));							
						}
						String cleanup = translateMatlabBlock(translator.module, testCase.cleanup, indent);
						caseTranslations.append(cleanup);
						caseTranslations.append( String.format("%s] (* Module %s *)\n\n", indentString(indent), testCase.title ));							
					}
					indent -= 2;
					PrintStream tests = new PrintStream(new FileOutputStream(new File("wspiceTests.wl")));
					tests.println("wsuZeros[m_, n_] := ConstantArray[0, {m, n}];");
					StringBuffer localVariableList = new StringBuffer();
					boolean first = true;
					for (String symbol : translator.module.variables) {
						if (!first)
							localVariableList.append(",");
						localVariableList.append( symbol );
						first = false;
					}
					
					tests.printf("%s = Module[{%s},\n", 
							MatlabListener.rewriteSymbol(translator.module.name), 
							localVariableList.toString() );
					// remove any unused FOR block markers
					tests.print(preamble.replaceAll("\\(\\*\\@\\*\\)", "" ));
					tests.print(caseTranslations.toString().replaceAll("\\(\\*\\@\\*\\)", "" ));
					tests.println("];");
					tests.close();
					
					System.out.println("Variables:");
					for (String symbol : translator.module.variables) {
						System.out.printf("  %s\n", symbol );
					}
					System.out.println("Functions:");
					for (String symbol : translator.module.functions) {
						System.out.printf("  %s\n", symbol );
					}
					return;
				}
			} else {
				File dir = new File("C:/Users/NOOK/Google Drive/cspice/tmice/src/tmice");
				File[] list = dir.listFiles(new FilenameFilter() {
					@Override
					public boolean accept(File dir, String name) {
						return name.endsWith("_matlab.m");
					}
				});

				Vector<String> forExcludes = new Vector<String>();
				// forExcludes.add("ckcov_matlab.m");
				// forExcludes.add("ck_matlab.m");
				// forExcludes.add("cnst_matlab.m");
				// forExcludes.add("daf_matlab.m");
				// forExcludes.add("dvops_matlab.m"); // three cases inside one
				// for
				// forExcludes.add("dvsep_matlab.m");
				// forExcludes.add("edln_matlab.m"); // if else end in setup
				// forExcludes.add("ek01_matlab.m");
				// forExcludes.add("fovray_matlab.m");
				// forExcludes.add("fovtrg_matlab.m");
				// forExcludes.add("gfdist_matlab.m");
				// forExcludes.add("gfilum_matlab.m");
				// forExcludes.add("gfoclt_matlab.m");
				// forExcludes.add("gfpa_matlab.m");
				// forExcludes.add("gfposc_matlab.m");
				// forExcludes.add("gfrfov_matlab.m");
				forExcludes.add("gfrr_matlab.m"); /// TODO header missed P2
				// forExcludes.add("gfsep_matlab.m");
				// forExcludes.add("gfsntc_matlab.m");
				// forExcludes.add("gfsubc_matlab.m");
				// forExcludes.add("gftfov_matlab.m");
				// forExcludes.add("inry_matlab.m");
				forExcludes.add("keep_matlab.m"); // TODO excess preamble file
													// io
				// forExcludes.add("phaseq_matlab.m");
				// forExcludes.add("pln_matlab.m");
				forExcludes.add("pool_matlab.m"); // TODO excess preamb
				// forExcludes.add("prjp_matlab.m");
				// forExcludes.add("pxfrm2_matlab.m");
				// forExcludes.add("spkcov_matlab.m");
				forExcludes.add("spkcpv_matlab.m");/// TODO file io
				// forExcludes.add("spk_matlab.m");
				// forExcludes.add("wind_matlab.m");
				forExcludes.add("xfmsta_matlab.m"); // TODO end in preamble

				Vector<TranslateMiceTest.Module> modules = new Vector<TranslateMiceTest.Module>();
				for (File f : list) {
					System.out.println(f);
					// exclude master test runner
					if (f.getName().equals("tspice_matlab.m"))
						continue;
					// exclude tests with nested for statement; hand translate
					// these
					if (forExcludes.contains(f.getName()))
						continue;
					TranslateMiceTest translator = new TranslateMiceTest(f.getAbsolutePath());
					if (!translator.translate())
						break;
					modules.add(translator.module);
				}
				for (TranslateMiceTest.Module module : modules) {
					String report = module.reportEmbedded();
					if (report != null && !report.isEmpty())
						System.out.println(module.name + " : " + report);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
