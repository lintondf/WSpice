package wspice;

import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import org.apache.commons.io.FileUtils;

public class TestTranslator {
	
	protected File testSource;
	protected List<String> reduced;
	ListIterator<String> rit;
	protected Lexer lexer = new Lexer();

	TestTranslator( String path ) {
		testSource = new File(path);
	}
	
	protected enum ParseState {
		HEADER,
		TRAILER,
		ERROR
	};
	protected ParseState parseState = ParseState.HEADER;
	protected String testName;
	
	protected ParseState parseHeader(String line) {
		String[] tokens = lexer.splitNoEmpties(line, " ");
		if (tokens.length != 2 || !tokens[0].equals("function"))
			return ParseState.ERROR;
		testName = tokens[1];
		return ParseState.TRAILER;
	}
	
	public boolean translate() {
		reduce();
		rit = reduced.listIterator();
		while (rit.hasNext()) {
			String line = lexer.nextLine(rit);
			switch (parseState) {
			case HEADER:
				parseState = parseHeader( line );
				break;
			default:
				return false;
			}
		}
		return true;
	}
	
	public boolean reduce() {
		try {
			List<String> lines = FileUtils.readLines(testSource, "UTF-8");
			ListIterator<String> it = lines.listIterator();
		    reduced = new Vector<String>();
			while (it.hasNext()) {
				String line = lexer.nextLine(it);
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
			}
		} catch (Exception x) {
			x.printStackTrace();
			return false;
		}
		return true;
	}
}
