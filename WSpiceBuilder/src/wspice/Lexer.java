package wspice;

import java.util.ListIterator;
import java.util.Vector;

public class Lexer {
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
			line = line.replaceAll("  ", " ");
			//System.out.println(line);
			return line;
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

	public String[] splitNoEmpties(String line, String pattern) {
		String[] allTokens = line.split(pattern);
		Vector<String> tokens = new Vector<String>();
		for (String token : allTokens) {
			if (!token.isEmpty())
				tokens.add(token);
		}
		return tokens.toArray( new String[tokens.size()] );
	}
}

