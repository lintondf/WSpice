package wspice;

import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import org.apache.commons.io.FileUtils;

public class TestTranslator {
	
	protected File testSource;
	protected Lexer lexer = new Lexer();

	TestTranslator( String path ) {
		testSource = new File(path);
	}
	
	public boolean translate() {
		try {
			List<String> lines = FileUtils.readLines(testSource, "UTF-8");
			ListIterator<String> it = lines.listIterator();
			List<String> reduced = new Vector<String>();
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
