// Generated from MATLABLexer.g4 by ANTLR 4.5.3
package wspice;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MATLABLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, CLASSDEF=2, PROPERTIES=3, METHODS=4, END=5, IF=6, ELSEIF=7, 
		ELSE=8, FOR=9, WHILE=10, SWITCH=11, CASE=12, OTHERWISE=13, EQUALS=14, 
		EQUALTO=15, NOTEQUALTO=16, GT=17, LT=18, GE=19, LE=20, PLUS=21, MINUS=22, 
		DOT=23, VECAND=24, VECOR=25, SCALAND=26, SCALOR=27, LPAREN=28, RPAREN=29, 
		LBRACE=30, LBRACK=31, MTIMES=32, TIMES=33, RDIVIDE=34, LDIVIDE=35, MRDIVIDE=36, 
		MLDIVIDE=37, POW=38, MPOW=39, NOT=40, COLON=41, TRANS=42, CTRANS=43, NL=44, 
		COMMENT=45, INT=46, FLOAT=47, SCI=48, ID=49, STRING=50, RBRACK=51, RBRACE=52, 
		COMMA=53, SEMI=54, WS=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FUNCTION", "CLASSDEF", "PROPERTIES", "METHODS", "END", "IF", "ELSEIF", 
		"ELSE", "FOR", "WHILE", "SWITCH", "CASE", "OTHERWISE", "EQUALS", "EQUALTO", 
		"NOTEQUALTO", "GT", "LT", "GE", "LE", "PLUS", "MINUS", "DOT", "VECAND", 
		"VECOR", "SCALAND", "SCALOR", "LPAREN", "RPAREN", "LBRACE", "LBRACK", 
		"MTIMES", "TIMES", "RDIVIDE", "LDIVIDE", "MRDIVIDE", "MLDIVIDE", "POW", 
		"MPOW", "NOT", "COLON", "TRANS", "CTRANS", "NL", "LINECONTINUE", "COMMENT", 
		"LETTER", "DIGIT", "ESC", "INT", "FLOAT", "SCI", "ID", "STRING", "RBRACK", 
		"RBRACE", "COMMA", "SEMI", "WS", "SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'classdef'", "'properties'", "'methods'", "'end'", 
		"'if'", "'elseif'", "'else'", "'for'", "'while'", "'switch'", "'case'", 
		"'otherwise'", "'='", "'=='", "'~='", "'>'", "'<'", "'>='", "'<='", "'+'", 
		"'-'", "'.'", "'&'", "'|'", "'&&'", "'||'", "'('", "')'", "'{'", "'['", 
		"'*'", "'.*'", "'/'", "'\\'", "'./'", "'.\\'", "'.^'", "'^'", "'~'", "':'", 
		"'.@'", "'@'", null, null, null, null, null, null, null, "']'", "'}'", 
		"','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCTION", "CLASSDEF", "PROPERTIES", "METHODS", "END", "IF", "ELSEIF", 
		"ELSE", "FOR", "WHILE", "SWITCH", "CASE", "OTHERWISE", "EQUALS", "EQUALTO", 
		"NOTEQUALTO", "GT", "LT", "GE", "LE", "PLUS", "MINUS", "DOT", "VECAND", 
		"VECOR", "SCALAND", "SCALOR", "LPAREN", "RPAREN", "LBRACE", "LBRACK", 
		"MTIMES", "TIMES", "RDIVIDE", "LDIVIDE", "MRDIVIDE", "MLDIVIDE", "POW", 
		"MPOW", "NOT", "COLON", "TRANS", "CTRANS", "NL", "COMMENT", "INT", "FLOAT", 
		"SCI", "ID", "STRING", "RBRACK", "RBRACE", "COMMA", "SEMI", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MATLABLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MATLABLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u018e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\5-\u011c\n-\3-\3-\3.\3.\3.\3"+
		".\3/\3/\5/\u0126\n/\3/\7/\u0129\n/\f/\16/\u012c\13/\3/\3/\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\62\3\63\6\63\u013a\n\63\r\63\16\63\u013b\3\64"+
		"\6\64\u013f\n\64\r\64\16\64\u0140\3\64\3\64\7\64\u0145\n\64\f\64\16\64"+
		"\u0148\13\64\3\64\3\64\6\64\u014c\n\64\r\64\16\64\u014d\5\64\u0150\n\64"+
		"\3\65\3\65\5\65\u0154\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u015b\n\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\5\65\u0163\n\65\3\65\3\65\3\65\3\65\5\65"+
		"\u0169\n\65\3\66\3\66\3\66\3\66\7\66\u016f\n\66\f\66\16\66\u0172\13\66"+
		"\3\67\3\67\3\67\7\67\u0177\n\67\f\67\16\67\u017a\13\67\3\67\3\67\38\3"+
		"8\39\39\3:\3:\3;\3;\3<\6<\u0187\n<\r<\16<\u0188\3<\3<\3=\3=\4\u012a\u0178"+
		"\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]/_\2a\2c\2e\60g\61i\62k\63m\64"+
		"o\65q\66s\67u8w9y\2\3\2\5\4\2C\\c|\3\2\62;\4\2\13\13\"\"\u019b\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2]\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2"+
		"k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3"+
		"\2\2\2\3{\3\2\2\2\5\u0084\3\2\2\2\7\u008d\3\2\2\2\t\u0098\3\2\2\2\13\u00a0"+
		"\3\2\2\2\r\u00a4\3\2\2\2\17\u00a7\3\2\2\2\21\u00ae\3\2\2\2\23\u00b3\3"+
		"\2\2\2\25\u00b7\3\2\2\2\27\u00bd\3\2\2\2\31\u00c4\3\2\2\2\33\u00c9\3\2"+
		"\2\2\35\u00d3\3\2\2\2\37\u00d5\3\2\2\2!\u00d8\3\2\2\2#\u00db\3\2\2\2%"+
		"\u00dd\3\2\2\2\'\u00df\3\2\2\2)\u00e2\3\2\2\2+\u00e5\3\2\2\2-\u00e7\3"+
		"\2\2\2/\u00e9\3\2\2\2\61\u00eb\3\2\2\2\63\u00ed\3\2\2\2\65\u00ef\3\2\2"+
		"\2\67\u00f2\3\2\2\29\u00f5\3\2\2\2;\u00f7\3\2\2\2=\u00f9\3\2\2\2?\u00fb"+
		"\3\2\2\2A\u00fd\3\2\2\2C\u00ff\3\2\2\2E\u0102\3\2\2\2G\u0104\3\2\2\2I"+
		"\u0106\3\2\2\2K\u0109\3\2\2\2M\u010c\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2"+
		"\2\2S\u0113\3\2\2\2U\u0115\3\2\2\2W\u0118\3\2\2\2Y\u011b\3\2\2\2[\u011f"+
		"\3\2\2\2]\u0125\3\2\2\2_\u0131\3\2\2\2a\u0133\3\2\2\2c\u0135\3\2\2\2e"+
		"\u0139\3\2\2\2g\u014f\3\2\2\2i\u0168\3\2\2\2k\u016a\3\2\2\2m\u0173\3\2"+
		"\2\2o\u017d\3\2\2\2q\u017f\3\2\2\2s\u0181\3\2\2\2u\u0183\3\2\2\2w\u0186"+
		"\3\2\2\2y\u018c\3\2\2\2{|\7h\2\2|}\7w\2\2}~\7p\2\2~\177\7e\2\2\177\u0080"+
		"\7v\2\2\u0080\u0081\7k\2\2\u0081\u0082\7q\2\2\u0082\u0083\7p\2\2\u0083"+
		"\4\3\2\2\2\u0084\u0085\7e\2\2\u0085\u0086\7n\2\2\u0086\u0087\7c\2\2\u0087"+
		"\u0088\7u\2\2\u0088\u0089\7u\2\2\u0089\u008a\7f\2\2\u008a\u008b\7g\2\2"+
		"\u008b\u008c\7h\2\2\u008c\6\3\2\2\2\u008d\u008e\7r\2\2\u008e\u008f\7t"+
		"\2\2\u008f\u0090\7q\2\2\u0090\u0091\7r\2\2\u0091\u0092\7g\2\2\u0092\u0093"+
		"\7t\2\2\u0093\u0094\7v\2\2\u0094\u0095\7k\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7u\2\2\u0097\b\3\2\2\2\u0098\u0099\7o\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7v\2\2\u009b\u009c\7j\2\2\u009c\u009d\7q\2\2\u009d\u009e\7f\2\2"+
		"\u009e\u009f\7u\2\2\u009f\n\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7p"+
		"\2\2\u00a2\u00a3\7f\2\2\u00a3\f\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7h\2\2\u00a6\16\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa"+
		"\7u\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7h\2\2\u00ad"+
		"\20\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7u\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\22\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7q\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7j\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7g\2\2\u00bc\26\3\2\2\2\u00bd"+
		"\u00be\7u\2\2\u00be\u00bf\7y\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7v\2\2"+
		"\u00c1\u00c2\7e\2\2\u00c2\u00c3\7j\2\2\u00c3\30\3\2\2\2\u00c4\u00c5\7"+
		"e\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8\32"+
		"\3\2\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7j\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7y\2\2\u00cf\u00d0\7k\2\2"+
		"\u00d0\u00d1\7u\2\2\u00d1\u00d2\7g\2\2\u00d2\34\3\2\2\2\u00d3\u00d4\7"+
		"?\2\2\u00d4\36\3\2\2\2\u00d5\u00d6\7?\2\2\u00d6\u00d7\7?\2\2\u00d7 \3"+
		"\2\2\2\u00d8\u00d9\7\u0080\2\2\u00d9\u00da\7?\2\2\u00da\"\3\2\2\2\u00db"+
		"\u00dc\7@\2\2\u00dc$\3\2\2\2\u00dd\u00de\7>\2\2\u00de&\3\2\2\2\u00df\u00e0"+
		"\7@\2\2\u00e0\u00e1\7?\2\2\u00e1(\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3\u00e4"+
		"\7?\2\2\u00e4*\3\2\2\2\u00e5\u00e6\7-\2\2\u00e6,\3\2\2\2\u00e7\u00e8\7"+
		"/\2\2\u00e8.\3\2\2\2\u00e9\u00ea\7\60\2\2\u00ea\60\3\2\2\2\u00eb\u00ec"+
		"\7(\2\2\u00ec\62\3\2\2\2\u00ed\u00ee\7~\2\2\u00ee\64\3\2\2\2\u00ef\u00f0"+
		"\7(\2\2\u00f0\u00f1\7(\2\2\u00f1\66\3\2\2\2\u00f2\u00f3\7~\2\2\u00f3\u00f4"+
		"\7~\2\2\u00f48\3\2\2\2\u00f5\u00f6\7*\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7"+
		"+\2\2\u00f8<\3\2\2\2\u00f9\u00fa\7}\2\2\u00fa>\3\2\2\2\u00fb\u00fc\7]"+
		"\2\2\u00fc@\3\2\2\2\u00fd\u00fe\7,\2\2\u00feB\3\2\2\2\u00ff\u0100\7\60"+
		"\2\2\u0100\u0101\7,\2\2\u0101D\3\2\2\2\u0102\u0103\7\61\2\2\u0103F\3\2"+
		"\2\2\u0104\u0105\7^\2\2\u0105H\3\2\2\2\u0106\u0107\7\60\2\2\u0107\u0108"+
		"\7\61\2\2\u0108J\3\2\2\2\u0109\u010a\7\60\2\2\u010a\u010b\7^\2\2\u010b"+
		"L\3\2\2\2\u010c\u010d\7\60\2\2\u010d\u010e\7`\2\2\u010eN\3\2\2\2\u010f"+
		"\u0110\7`\2\2\u0110P\3\2\2\2\u0111\u0112\7\u0080\2\2\u0112R\3\2\2\2\u0113"+
		"\u0114\7<\2\2\u0114T\3\2\2\2\u0115\u0116\7\60\2\2\u0116\u0117\7B\2\2\u0117"+
		"V\3\2\2\2\u0118\u0119\7B\2\2\u0119X\3\2\2\2\u011a\u011c\7\17\2\2\u011b"+
		"\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\f"+
		"\2\2\u011eZ\3\2\2\2\u011f\u0120\7\60\2\2\u0120\u0121\7\60\2\2\u0121\u0122"+
		"\7\60\2\2\u0122\\\3\2\2\2\u0123\u0126\7\'\2\2\u0124\u0126\5[.\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u012a\3\2\2\2\u0127\u0129\13"+
		"\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\5Y"+
		"-\2\u012e\u012f\3\2\2\2\u012f\u0130\b/\2\2\u0130^\3\2\2\2\u0131\u0132"+
		"\t\2\2\2\u0132`\3\2\2\2\u0133\u0134\t\3\2\2\u0134b\3\2\2\2\u0135\u0136"+
		"\7)\2\2\u0136\u0137\7)\2\2\u0137d\3\2\2\2\u0138\u013a\5a\61\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"f\3\2\2\2\u013d\u013f\5a\61\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2"+
		"\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0146"+
		"\7\60\2\2\u0143\u0145\5a\61\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2"+
		"\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0150\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0149\u014b\7\60\2\2\u014a\u014c\5a\61\2\u014b\u014a\3\2\2\2"+
		"\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150"+
		"\3\2\2\2\u014f\u013e\3\2\2\2\u014f\u0149\3\2\2\2\u0150h\3\2\2\2\u0151"+
		"\u0154\5e\63\2\u0152\u0154\5g\64\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7g\2\2\u0156\u0157\5e\63\2\u0157"+
		"\u0169\3\2\2\2\u0158\u015b\5e\63\2\u0159\u015b\5g\64\2\u015a\u0158\3\2"+
		"\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\7g\2\2\u015d"+
		"\u015e\5+\26\2\u015e\u015f\5e\63\2\u015f\u0169\3\2\2\2\u0160\u0163\5e"+
		"\63\2\u0161\u0163\5g\64\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\7g\2\2\u0165\u0166\5-\27\2\u0166\u0167\5e\63"+
		"\2\u0167\u0169\3\2\2\2\u0168\u0153\3\2\2\2\u0168\u015a\3\2\2\2\u0168\u0162"+
		"\3\2\2\2\u0169j\3\2\2\2\u016a\u0170\5_\60\2\u016b\u016f\5_\60\2\u016c"+
		"\u016f\5a\61\2\u016d\u016f\7a\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171l\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0178\7)\2\2\u0174"+
		"\u0177\5c\62\2\u0175\u0177\13\2\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3"+
		"\2\2\2\u0177\u017a\3\2\2\2\u0178\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7)\2\2\u017cn\3\2\2\2\u017d"+
		"\u017e\7_\2\2\u017ep\3\2\2\2\u017f\u0180\7\177\2\2\u0180r\3\2\2\2\u0181"+
		"\u0182\7.\2\2\u0182t\3\2\2\2\u0183\u0184\7=\2\2\u0184v\3\2\2\2\u0185\u0187"+
		"\5y=\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\b<\2\2\u018bx\3\2\2\2\u018c"+
		"\u018d\t\4\2\2\u018dz\3\2\2\2\24\2\u011b\u0125\u012a\u013b\u0140\u0146"+
		"\u014d\u014f\u0153\u015a\u0162\u0168\u016e\u0170\u0176\u0178\u0188\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}