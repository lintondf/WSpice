package wspice;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;

import org.apache.commons.io.FileUtils;

public class TestTranslator {
	
	protected File testSource;
	protected List<String> reduced;
	protected List<Integer> lineNumbers;
	ListIterator<String> rit;
	protected Lexer lexer = new Lexer();
	
	protected String line;
	
	protected String nextLine() {
		line = lexer.nextLine(rit);
		if (line == null) return null;
		if (line.startsWith("for") || 
				line.startsWith("if") || 
				line.startsWith("try") || 
				line.startsWith("while")) {
			module.blockLevel++;
		} else if (line.startsWith("end")) {
			module.blockLevel--;
		}
//		System.out.print( lineNumbers.get( rit.previousIndex() ));
//		System.out.print(",");
//		if (module != null)
//			System.out.print(module.blockLevel);
//		System.out.print(",");
//		System.out.print( parseState );
//		System.out.print(" : ");
//		System.out.println(line);
		return line;
	}
	
	TestTranslator( String path ) {
		testSource = new File(path);
	}
	
	protected enum ParseState {
		HEADER,
		PREAMBLE,
		TEST_CASE,
		TEST_SUBCASES,
		ERROR
	};
	protected ParseState parseState = ParseState.HEADER;
	
	public static class Module {
		Module(String name) {
			this.name = name;
			preamble = new Vector<String>();
			cases = new Vector<Case>();
			blockLevel = 0;
		}
		
		String name;
		int  blockLevel;
		
		Vector<String>  preamble;
		String   disp;
		String   topen;
		
		public class Subcase {
			Subcase() {
				this.setup = new Vector<String>();
				this.steps = new Vector<String>();
				this.checks = new Vector<String>();
			}
			Vector<String>  setup;
			Vector<String>  steps;
			String catcher;
			Vector<String>  checks;
			
			public String reportEmbedded() {
				int nFor = 0;
				int nWhile = 0;
				int nIf = 0;
				for (String s : setup ) {
					if (s.startsWith("for")) nFor++;
					if (s.startsWith("while")) nWhile++;
					if (s.startsWith("if")) nIf++;
				}
				for (String s : steps) {
					if (s.startsWith("for")) nFor++;
					if (s.startsWith("while")) nWhile++;
					if (s.startsWith("if")) nIf++;
				}
				for (String s : checks) {
					if (s.startsWith("for")) nFor++;
					if (s.startsWith("while")) nWhile++;
					if (s.startsWith("if")) nIf++;
				}
				StringBuffer sb = new StringBuffer();
				if (nFor > 0)
					sb.append(String.format("%d for;", nFor ));
				if (nWhile > 0)
					sb.append(String.format("%d while;", nWhile ));
				if (nIf > 0)
					sb.append(String.format("%d if;", nIf ));
				return sb.toString();
			}
			
			public String toString() {
				StringBuffer sb = new StringBuffer();
				sb.append("   setup\n");
				for (String s : setup ) {
					sb.append("     ");
					sb.append(s);
					sb.append('\n');						
				}
				if (catcher != null) {
					sb.append("   try\n");
					for (String s : steps) {
						sb.append("     ");
						sb.append(s);
						sb.append('\n');						
					}
					sb.append("   catch\n");
					sb.append("     ");
					sb.append(catcher);
					sb.append('\n');
				} else {
					sb.append("   inline\n");
					for (String s : steps) {
						sb.append("     ");
						sb.append(s);
						sb.append('\n');						
					}					
				}
				sb.append("   checks\n");
				for (String s : checks) {
					sb.append("     ");
					sb.append(s);
					sb.append('\n');						
				}
				return sb.toString();
			}
		}
		
		public class Case {
			public Case(String title) {
				this.title = title;
				this.forStatement = new Vector<String>();
				this.forEnds = false;
				this.subcases = new Vector<Subcase>();
			}
			String title;
			Vector<String>  forStatement;
			boolean         forEnds;
			Vector<Subcase> subcases;
			
			public String reportEmbedded() {
				StringBuffer sb = new StringBuffer();
				for (Subcase s : subcases) {
					sb.append(s.reportEmbedded());
				}
				return sb.toString();
			}
			
			public String toString() {
				StringBuffer sb = new StringBuffer();
				sb.append("  Case: ");
				sb.append( title );	
				sb.append('\n');
				if (!forStatement.isEmpty()) {
					sb.append("   for statements:\n");
					for (String s : forStatement ) {
						sb.append("      ");
						sb.append(s);
						sb.append('\n');					
					}
				}
				if (forEnds) {
					sb.append("   for end\n");
				}
				for (Subcase s : subcases ) {
					sb.append( s );
				}
				return sb.toString();
			}
		}
		
		Vector<Case> cases;
		
		public String reportEmbedded() {
			StringBuffer sb = new StringBuffer();
			for (Case c : cases) {
				sb.append(c.reportEmbedded());
			}
			return sb.toString();
		}
		
		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append( name ); sb.append('\n');
			for (String a : preamble) {
				sb.append("  Preamble: "); 
				sb.append( a );
				sb.append('\n');
			}
			for (Case tcase : cases) {
				sb.append( tcase );
			}
			return sb.toString();
		}
	}
	
	protected Module module;
	
	protected ParseState parseHeader() {
		String[] tokens = lexer.splitNoEmpties(line, " ");
		if (tokens.length != 2 || !tokens[0].equals("function"))
			return ParseState.ERROR;
		module = new Module( tokens[1] );
		line = nextLine();
		return ParseState.PREAMBLE;
	}
	
	protected ParseState parsePreamble() {
		while (line.indexOf('=') >= 0) {
			module.preamble.add( "P1:"+line );
			line = nextLine();
		}
		if (line.startsWith("disp(")) {
			module.disp = line;
			line = nextLine();			
		}
		if (line.startsWith("tutils_topen(")) {
			module.topen = line;
			line = nextLine();
		}
		return ParseState.TEST_CASE;
	}
	
	protected ParseState parseTestCase() {
		System.out.println(line);
		while (! (line.startsWith("tutils_tcase") || line.startsWith("for")) ) {
			module.preamble.add( "P2:"+line );
			line = nextLine();
			if (line == null) return ParseState.ERROR;
		}
		if (line.startsWith("for")) {
			System.out.println(line);
			Vector<String> forStatement = new Vector<String>();
			forStatement.add("F1:"+line);
			line = nextLine();
			while (line != null && ! line.startsWith("tutils_tcase")) {
				forStatement.add("F2:"+line);
				line = nextLine();				
			}
			Module.Case testCase = module.new Case( line );
			testCase.forStatement = forStatement;
			module.cases.add( testCase );
			line = nextLine();
			return ParseState.TEST_SUBCASES;			
		} else if (line.startsWith("tutils_tcase")) {
			Module.Case testCase = module.new Case( line );
			module.cases.add( testCase );
			line = nextLine();
			return ParseState.TEST_SUBCASES;			
		}
		return ParseState.ERROR;
	}
	
	protected boolean endOfCheckSequence() {
		if (line == null)
			return true;
		if (line.startsWith("tutils_tcase"))
			return true;
		if (line.startsWith("for")) {
//			module.cases.lastElement().forLevel++;
			return module.blockLevel == 1;
		}
		if (line.startsWith("end")) {
//			module.cases.lastElement().forLevel--;
			return module.blockLevel <= 0;
		}
		return false;
	}
	
	protected boolean isFunctionUnderTest() {
		if (line.indexOf("cspice_") >= 0) {
			if (line.indexOf("cspice_kclear") >= 0) return false;
			return true;
		} else if (line.indexOf("mice_") >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	protected ParseState parseSubcases() {
		Module.Subcase subcase = module.new Subcase();
		while (line.indexOf('=') >= 0) {
			if (isFunctionUnderTest()) {
				break;
			} else {
				if (line.startsWith("if")) {
					while (line != null && !line.equals("end")) {
						subcase.setup.add("S1:"+line);
						line = nextLine();
					}
				} 
				subcase.setup.add( "S2:"+line );
				line = nextLine();
			}
		}
		if (line.startsWith("for")) {
			System.out.println(line);
			return ParseState.ERROR;
		} else if (line.equals("try")) {
			while (line != null && line.equals("try")) {
				line = nextLine();
				while (! line.equals("catch")) {
					subcase.steps.add("S3:"+line);
					line = nextLine();
				}
				line = nextLine();
				while (! line.equals("end")) {
					subcase.catcher = line;
					line = nextLine();
				}
				line = nextLine();
				while (line != null) {
					if ( endOfCheckSequence() )
						break;
					if ( line.equals("try"))
						break;
					if (line.startsWith("if")) {
						while (line != null && !line.equals("end")) {
							subcase.checks.add("S4:"+line);
							line = nextLine();
						}
						continue;
					}
					subcase.checks.add("S5:"+module.blockLevel+":"+line);
					if (rit.hasNext()) {
						line = nextLine();
					} else {
						line = null; 
					}
				}
				module.cases.lastElement().subcases.add(subcase);
				if (line != null && line.equals("try")) {
					subcase = module.new Subcase();
				}
			}
			return ParseState.TEST_CASE;
		} else { // naked invocation
//			System.out.println(rit.previousIndex());
//			System.out.print( lineNumbers.get( rit.previousIndex() ));
//			System.out.print(" : ");
//			System.out.println(line);
			while (rit.hasNext()) {
				subcase.steps.add(line);
				line = nextLine();
				boolean emptySubcase = false;
				while (line != null && ! endOfCheckSequence() ) {
					if (line.indexOf("cspice_") >= 0 || line.indexOf("mice_") >= 0) {
						module.cases.lastElement().subcases.add(subcase);
						subcase = module.new Subcase();
						emptySubcase = true;
						break;
					}
					subcase.checks.add("S6:"+line);
					if (rit.hasNext()) {
						line = nextLine();
					} else {
						line = null; 
					}
				}
				if (!emptySubcase ) {
					module.cases.lastElement().subcases.add(subcase);
				}
				if (endOfCheckSequence())
					break;
			}
			return ParseState.TEST_CASE;
		}
	}
	
	protected void cleanup() {
		for (Module.Case testCase : module.cases) {
			int n = testCase.subcases.size();
			for (int i = 0; i < n-1; i++) {
				Module.Subcase thisSubcase = testCase.subcases.get(i);
				Module.Subcase nextSubcase = testCase.subcases.get(i+1);
				if (thisSubcase.checks != null && !thisSubcase.checks.isEmpty() ) {
					String check = thisSubcase.checks.lastElement();
					while (! check.startsWith("MATLAB_check_error")) {
						thisSubcase.checks.remove(check);
						nextSubcase.setup.insertElementAt(check, 0);
						if (thisSubcase.checks.isEmpty())
							break;
						check = thisSubcase.checks.lastElement();
					}
				}
			}
		}
	}
	
	public boolean translate() {
		reduce();
		rit = reduced.listIterator();
		line = nextLine();
		ParseState lastState = parseState;
		while (line != null) {
			switch (parseState) {
			case HEADER:
				lastState = parseState;
				parseState = parseHeader();
				break;
			case PREAMBLE:
				lastState = parseState;
				parseState = parsePreamble();
				break;
			case TEST_CASE:
				lastState = parseState;
				parseState = parseTestCase();
				break;
			case TEST_SUBCASES:
				lastState = parseState;
				parseState = parseSubcases();
				if (line != null && line.equals("end")) {
					module.cases.lastElement().forEnds = true;
					line = nextLine();
				}
				break;
			case ERROR:
				System.out.println( module );
				System.err.print( lineNumbers.get( rit.previousIndex() ));
				System.err.print(" : ");
				System.err.println(line);
				System.err.println( lastState.toString() );
				return false;
			}
		}
		cleanup();
		System.out.println(module);
		System.out.println(module.reportEmbedded());
		return true;
	}
	
	public boolean reduce() {
		try {
			List<String> lines = FileUtils.readLines(testSource, "UTF-8");
			ListIterator<String> it = lines.listIterator();
		    reduced = new Vector<String>();
		    lineNumbers = new Vector<Integer>();
			while (it.hasNext()) {
				int ln = it.nextIndex();
				line = lexer.nextLine(it);
				if (line == null)
					break;
				if (line.isEmpty())
					continue;
				if (line.startsWith("%"))
					continue;
				StringBuffer fullLine = new StringBuffer();
				while( line.endsWith("...")) {
					fullLine.append( line.substring(0, line.length()-3) );
					line = lexer.nextLine(it);
				}
				fullLine.append( line );
				line = fullLine.toString();
				line = line.replaceAll("cspice_halfpi", "0.5*pi");

				if (line.startsWith("for")) {
					System.out.println("FOR " + ln + " : " + line);
				}
				reduced.add( line );
				lineNumbers.add(ln);
			}
		} catch (Exception x) {
			x.printStackTrace();
			return false;
		}
		return true;
	}
}
