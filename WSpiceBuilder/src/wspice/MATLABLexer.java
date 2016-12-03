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
		ELSE=8, WHILE=9, SWITCH=10, CASE=11, OTHERWISE=12, EQUALS=13, EQUALTO=14, 
		NOTEQUALTO=15, GT=16, LT=17, GE=18, LE=19, PLUS=20, MINUS=21, DOT=22, 
		VECAND=23, VECOR=24, SCALAND=25, SCALOR=26, LPAREN=27, RPAREN=28, LBRACE=29, 
		LBRACK=30, MTIMES=31, TIMES=32, RDIVIDE=33, LDIVIDE=34, MRDIVIDE=35, MLDIVIDE=36, 
		POW=37, MPOW=38, NOT=39, COLON=40, TRANS=41, CTRANS=42, NL=43, COMMENT=44, 
		INT=45, FLOAT=46, SCI=47, ID=48, STRING=49, RBRACK=50, RBRACE=51, COMMA=52, 
		SEMI=53, WS=54;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FUNCTION", "CLASSDEF", "PROPERTIES", "METHODS", "END", "IF", "ELSEIF", 
		"ELSE", "WHILE", "SWITCH", "CASE", "OTHERWISE", "EQUALS", "EQUALTO", "NOTEQUALTO", 
		"GT", "LT", "GE", "LE", "PLUS", "MINUS", "DOT", "VECAND", "VECOR", "SCALAND", 
		"SCALOR", "LPAREN", "RPAREN", "LBRACE", "LBRACK", "MTIMES", "TIMES", "RDIVIDE", 
		"LDIVIDE", "MRDIVIDE", "MLDIVIDE", "POW", "MPOW", "NOT", "COLON", "TRANS", 
		"CTRANS", "NL", "LINECONTINUE", "COMMENT", "LETTER", "DIGIT", "ESC", "INT", 
		"FLOAT", "SCI", "ID", "STRING", "RBRACK", "RBRACE", "COMMA", "SEMI", "WS", 
		"SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'classdef'", "'properties'", "'methods'", "'end'", 
		"'if'", "'elseif'", "'else'", "'while'", "'switch'", "'case'", "'otherwise'", 
		"'='", "'=='", "'~='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'.'", 
		"'&'", "'|'", "'&&'", "'||'", "'('", "')'", "'{'", "'['", "'*'", "'.*'", 
		"'/'", "'\\'", "'./'", "'.\\'", "'.^'", "'^'", "'~'", "':'", "'.@'", "'@'", 
		null, null, null, null, null, null, null, "']'", "'}'", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCTION", "CLASSDEF", "PROPERTIES", "METHODS", "END", "IF", "ELSEIF", 
		"ELSE", "WHILE", "SWITCH", "CASE", "OTHERWISE", "EQUALS", "EQUALTO", "NOTEQUALTO", 
		"GT", "LT", "GE", "LE", "PLUS", "MINUS", "DOT", "VECAND", "VECOR", "SCALAND", 
		"SCALOR", "LPAREN", "RPAREN", "LBRACE", "LBRACK", "MTIMES", "TIMES", "RDIVIDE", 
		"LDIVIDE", "MRDIVIDE", "MLDIVIDE", "POW", "MPOW", "NOT", "COLON", "TRANS", 
		"CTRANS", "NL", "COMMENT", "INT", "FLOAT", "SCI", "ID", "STRING", "RBRACK", 
		"RBRACE", "COMMA", "SEMI", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\28\u0188\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3*\3+\3+\3,\5,\u0116\n,\3,\3,\3-\3-\3-\3-\3.\3.\5.\u0120\n.\3.\7.\u0123"+
		"\n.\f.\16.\u0126\13.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\6"+
		"\62\u0134\n\62\r\62\16\62\u0135\3\63\6\63\u0139\n\63\r\63\16\63\u013a"+
		"\3\63\3\63\7\63\u013f\n\63\f\63\16\63\u0142\13\63\3\63\3\63\6\63\u0146"+
		"\n\63\r\63\16\63\u0147\5\63\u014a\n\63\3\64\3\64\5\64\u014e\n\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u0155\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u015d\n\64\3\64\3\64\3\64\3\64\5\64\u0163\n\64\3\65\3\65\3\65\3\65\7"+
		"\65\u0169\n\65\f\65\16\65\u016c\13\65\3\66\3\66\3\66\7\66\u0171\n\66\f"+
		"\66\16\66\u0174\13\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\6;\u0181"+
		"\n;\r;\16;\u0182\3;\3;\3<\3<\4\u0124\u0172\2=\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y\2[.]\2_\2a\2c/e\60g\61i\62k\63m\64o\65q\66s\67u8w\2\3\2\5\4\2C"+
		"\\c|\3\2\62;\4\2\13\13\"\"\u0195\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2[\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3y\3\2\2\2\5\u0082\3\2\2\2\7\u008b\3"+
		"\2\2\2\t\u0096\3\2\2\2\13\u009e\3\2\2\2\r\u00a2\3\2\2\2\17\u00a5\3\2\2"+
		"\2\21\u00ac\3\2\2\2\23\u00b1\3\2\2\2\25\u00b7\3\2\2\2\27\u00be\3\2\2\2"+
		"\31\u00c3\3\2\2\2\33\u00cd\3\2\2\2\35\u00cf\3\2\2\2\37\u00d2\3\2\2\2!"+
		"\u00d5\3\2\2\2#\u00d7\3\2\2\2%\u00d9\3\2\2\2\'\u00dc\3\2\2\2)\u00df\3"+
		"\2\2\2+\u00e1\3\2\2\2-\u00e3\3\2\2\2/\u00e5\3\2\2\2\61\u00e7\3\2\2\2\63"+
		"\u00e9\3\2\2\2\65\u00ec\3\2\2\2\67\u00ef\3\2\2\29\u00f1\3\2\2\2;\u00f3"+
		"\3\2\2\2=\u00f5\3\2\2\2?\u00f7\3\2\2\2A\u00f9\3\2\2\2C\u00fc\3\2\2\2E"+
		"\u00fe\3\2\2\2G\u0100\3\2\2\2I\u0103\3\2\2\2K\u0106\3\2\2\2M\u0109\3\2"+
		"\2\2O\u010b\3\2\2\2Q\u010d\3\2\2\2S\u010f\3\2\2\2U\u0112\3\2\2\2W\u0115"+
		"\3\2\2\2Y\u0119\3\2\2\2[\u011f\3\2\2\2]\u012b\3\2\2\2_\u012d\3\2\2\2a"+
		"\u012f\3\2\2\2c\u0133\3\2\2\2e\u0149\3\2\2\2g\u0162\3\2\2\2i\u0164\3\2"+
		"\2\2k\u016d\3\2\2\2m\u0177\3\2\2\2o\u0179\3\2\2\2q\u017b\3\2\2\2s\u017d"+
		"\3\2\2\2u\u0180\3\2\2\2w\u0186\3\2\2\2yz\7h\2\2z{\7w\2\2{|\7p\2\2|}\7"+
		"e\2\2}~\7v\2\2~\177\7k\2\2\177\u0080\7q\2\2\u0080\u0081\7p\2\2\u0081\4"+
		"\3\2\2\2\u0082\u0083\7e\2\2\u0083\u0084\7n\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7u\2\2\u0086\u0087\7u\2\2\u0087\u0088\7f\2\2\u0088\u0089\7g\2\2"+
		"\u0089\u008a\7h\2\2\u008a\6\3\2\2\2\u008b\u008c\7r\2\2\u008c\u008d\7t"+
		"\2\2\u008d\u008e\7q\2\2\u008e\u008f\7r\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7t\2\2\u0091\u0092\7v\2\2\u0092\u0093\7k\2\2\u0093\u0094\7g\2\2\u0094"+
		"\u0095\7u\2\2\u0095\b\3\2\2\2\u0096\u0097\7o\2\2\u0097\u0098\7g\2\2\u0098"+
		"\u0099\7v\2\2\u0099\u009a\7j\2\2\u009a\u009b\7q\2\2\u009b\u009c\7f\2\2"+
		"\u009c\u009d\7u\2\2\u009d\n\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p"+
		"\2\2\u00a0\u00a1\7f\2\2\u00a1\f\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4"+
		"\7h\2\2\u00a4\16\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8"+
		"\7u\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7h\2\2\u00ab"+
		"\20\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\22\3\2\2\2\u00b1\u00b2\7y\2\2\u00b2\u00b3\7j\2\2\u00b3"+
		"\u00b4\7k\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\24\3\2\2\2\u00b7"+
		"\u00b8\7u\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7v\2\2"+
		"\u00bb\u00bc\7e\2\2\u00bc\u00bd\7j\2\2\u00bd\26\3\2\2\2\u00be\u00bf\7"+
		"e\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7g\2\2\u00c2\30"+
		"\3\2\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7j\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc\32\3\2\2\2\u00cd\u00ce\7"+
		"?\2\2\u00ce\34\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d1\7?\2\2\u00d1\36"+
		"\3\2\2\2\u00d2\u00d3\7\u0080\2\2\u00d3\u00d4\7?\2\2\u00d4 \3\2\2\2\u00d5"+
		"\u00d6\7@\2\2\u00d6\"\3\2\2\2\u00d7\u00d8\7>\2\2\u00d8$\3\2\2\2\u00d9"+
		"\u00da\7@\2\2\u00da\u00db\7?\2\2\u00db&\3\2\2\2\u00dc\u00dd\7>\2\2\u00dd"+
		"\u00de\7?\2\2\u00de(\3\2\2\2\u00df\u00e0\7-\2\2\u00e0*\3\2\2\2\u00e1\u00e2"+
		"\7/\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7\60\2\2\u00e4.\3\2\2\2\u00e5\u00e6"+
		"\7(\2\2\u00e6\60\3\2\2\2\u00e7\u00e8\7~\2\2\u00e8\62\3\2\2\2\u00e9\u00ea"+
		"\7(\2\2\u00ea\u00eb\7(\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7~\2\2\u00ed\u00ee"+
		"\7~\2\2\u00ee\66\3\2\2\2\u00ef\u00f0\7*\2\2\u00f08\3\2\2\2\u00f1\u00f2"+
		"\7+\2\2\u00f2:\3\2\2\2\u00f3\u00f4\7}\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7"+
		"]\2\2\u00f6>\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7\60"+
		"\2\2\u00fa\u00fb\7,\2\2\u00fbB\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fdD\3\2"+
		"\2\2\u00fe\u00ff\7^\2\2\u00ffF\3\2\2\2\u0100\u0101\7\60\2\2\u0101\u0102"+
		"\7\61\2\2\u0102H\3\2\2\2\u0103\u0104\7\60\2\2\u0104\u0105\7^\2\2\u0105"+
		"J\3\2\2\2\u0106\u0107\7\60\2\2\u0107\u0108\7`\2\2\u0108L\3\2\2\2\u0109"+
		"\u010a\7`\2\2\u010aN\3\2\2\2\u010b\u010c\7\u0080\2\2\u010cP\3\2\2\2\u010d"+
		"\u010e\7<\2\2\u010eR\3\2\2\2\u010f\u0110\7\60\2\2\u0110\u0111\7B\2\2\u0111"+
		"T\3\2\2\2\u0112\u0113\7B\2\2\u0113V\3\2\2\2\u0114\u0116\7\17\2\2\u0115"+
		"\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\f"+
		"\2\2\u0118X\3\2\2\2\u0119\u011a\7\60\2\2\u011a\u011b\7\60\2\2\u011b\u011c"+
		"\7\60\2\2\u011cZ\3\2\2\2\u011d\u0120\7\'\2\2\u011e\u0120\5Y-\2\u011f\u011d"+
		"\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0124\3\2\2\2\u0121\u0123\13\2\2\2"+
		"\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0125\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\5W,\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\b.\2\2\u012a\\\3\2\2\2\u012b\u012c\t\2\2\2"+
		"\u012c^\3\2\2\2\u012d\u012e\t\3\2\2\u012e`\3\2\2\2\u012f\u0130\7)\2\2"+
		"\u0130\u0131\7)\2\2\u0131b\3\2\2\2\u0132\u0134\5_\60\2\u0133\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"d\3\2\2\2\u0137\u0139\5_\60\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0140"+
		"\7\60\2\2\u013d\u013f\5_\60\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2"+
		"\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u014a\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0143\u0145\7\60\2\2\u0144\u0146\5_\60\2\u0145\u0144\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a"+
		"\3\2\2\2\u0149\u0138\3\2\2\2\u0149\u0143\3\2\2\2\u014af\3\2\2\2\u014b"+
		"\u014e\5c\62\2\u014c\u014e\5e\63\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7g\2\2\u0150\u0151\5c\62\2\u0151"+
		"\u0163\3\2\2\2\u0152\u0155\5c\62\2\u0153\u0155\5e\63\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7g\2\2\u0157"+
		"\u0158\5)\25\2\u0158\u0159\5c\62\2\u0159\u0163\3\2\2\2\u015a\u015d\5c"+
		"\62\2\u015b\u015d\5e\63\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\7g\2\2\u015f\u0160\5+\26\2\u0160\u0161\5c\62"+
		"\2\u0161\u0163\3\2\2\2\u0162\u014d\3\2\2\2\u0162\u0154\3\2\2\2\u0162\u015c"+
		"\3\2\2\2\u0163h\3\2\2\2\u0164\u016a\5]/\2\u0165\u0169\5]/\2\u0166\u0169"+
		"\5_\60\2\u0167\u0169\7a\2\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016bj\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0172\7)\2\2\u016e\u0171"+
		"\5a\61\2\u016f\u0171\13\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2"+
		"\u0171\u0174\3\2\2\2\u0172\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7)\2\2\u0176l\3\2\2\2\u0177\u0178"+
		"\7_\2\2\u0178n\3\2\2\2\u0179\u017a\7\177\2\2\u017ap\3\2\2\2\u017b\u017c"+
		"\7.\2\2\u017cr\3\2\2\2\u017d\u017e\7=\2\2\u017et\3\2\2\2\u017f\u0181\5"+
		"w<\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\b;\2\2\u0185v\3\2\2\2\u0186"+
		"\u0187\t\4\2\2\u0187x\3\2\2\2\24\2\u0115\u011f\u0124\u0135\u013a\u0140"+
		"\u0147\u0149\u014d\u0154\u015c\u0162\u0168\u016a\u0170\u0172\u0182\3\b"+
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