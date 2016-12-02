// Generated from MATLABParser.g4 by ANTLR 4.5.3

    package wspice;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MATLABParser extends Parser {
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
	public static final int
		RULE_fileDecl = 0, RULE_script = 1, RULE_endStat = 2, RULE_endStatNL = 3, 
		RULE_partialFunctionDecl = 4, RULE_functionDecl = 5, RULE_methodDecl = 6, 
		RULE_classDecl = 7, RULE_propBlockDecl = 8, RULE_methodBlockDecl = 9, 
		RULE_outArgs = 10, RULE_inArgs = 11, RULE_prop = 12, RULE_dotRef = 13, 
		RULE_statBlock = 14, RULE_ifStat = 15, RULE_whileStat = 16, RULE_caseStat = 17, 
		RULE_stat = 18, RULE_arrayRef = 19, RULE_arrayExpr = 20, RULE_cellExpr = 21, 
		RULE_expr = 22, RULE_exprList = 23, RULE_exprArrayList = 24;
	public static final String[] ruleNames = {
		"fileDecl", "script", "endStat", "endStatNL", "partialFunctionDecl", "functionDecl", 
		"methodDecl", "classDecl", "propBlockDecl", "methodBlockDecl", "outArgs", 
		"inArgs", "prop", "dotRef", "statBlock", "ifStat", "whileStat", "caseStat", 
		"stat", "arrayRef", "arrayExpr", "cellExpr", "expr", "exprList", "exprArrayList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'classdef'", "'properties'", "'methods'", "'end'", 
		"'if'", "'elseif'", "'else'", "'while'", "'switch'", "'case'", "'otherwise'", 
		"'='", "'=='", "'~='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'.'", 
		"'&'", "'|'", "'&&'", "'||'", "'('", "')'", "'{'", "'['", "'*'", "'.*'", 
		"'/'", "'\\'", "'./'", "'.\\'", "'.^'", "'^'", "'~'", "':'", "'.''", "'''", 
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

	@Override
	public String getGrammarFileName() { return "MATLABParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MATLABParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileDeclContext extends ParserRuleContext {
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public List<PartialFunctionDeclContext> partialFunctionDecl() {
			return getRuleContexts(PartialFunctionDeclContext.class);
		}
		public PartialFunctionDeclContext partialFunctionDecl(int i) {
			return getRuleContext(PartialFunctionDeclContext.class,i);
		}
		public List<StatBlockContext> statBlock() {
			return getRuleContexts(StatBlockContext.class);
		}
		public StatBlockContext statBlock(int i) {
			return getRuleContext(StatBlockContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MATLABParser.EOF, 0); }
		public FileDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterFileDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitFileDecl(this);
		}
	}

	public final FileDeclContext fileDecl() throws RecognitionException {
		FileDeclContext _localctx = new FileDeclContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fileDecl);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(50);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(51);
					classDecl();
					}
					break;
				}
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==FUNCTION) {
						{
						{
						setState(54);
						functionDecl();
						}
						}
						setState(59);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==FUNCTION) {
						{
						{
						setState(60);
						partialFunctionDecl();
						}
						}
						setState(65);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68);
					partialFunctionDecl();
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FUNCTION );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					statBlock();
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0) );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public List<StatBlockContext> statBlock() {
			return getRuleContexts(StatBlockContext.class);
		}
		public StatBlockContext statBlock(int i) {
			return getRuleContext(StatBlockContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(81);
				statBlock();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndStatContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(MATLABParser.NL, 0); }
		public TerminalNode COMMA() { return getToken(MATLABParser.COMMA, 0); }
		public TerminalNode SEMI() { return getToken(MATLABParser.SEMI, 0); }
		public EndStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterEndStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitEndStat(this);
		}
	}

	public final EndStatContext endStat() throws RecognitionException {
		EndStatContext _localctx = new EndStatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_endStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << COMMA) | (1L << SEMI))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndStatNLContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(MATLABParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MATLABParser.NL, i);
		}
		public EndStatNLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStatNL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterEndStatNL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitEndStatNL(this);
		}
	}

	public final EndStatNLContext endStatNL() throws RecognitionException {
		EndStatNLContext _localctx = new EndStatNLContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_endStatNL);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(89);
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(92); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartialFunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MATLABParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public EndStatContext endStat() {
			return getRuleContext(EndStatContext.class,0);
		}
		public OutArgsContext outArgs() {
			return getRuleContext(OutArgsContext.class,0);
		}
		public InArgsContext inArgs() {
			return getRuleContext(InArgsContext.class,0);
		}
		public List<StatBlockContext> statBlock() {
			return getRuleContexts(StatBlockContext.class);
		}
		public StatBlockContext statBlock(int i) {
			return getRuleContext(StatBlockContext.class,i);
		}
		public PartialFunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialFunctionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterPartialFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitPartialFunctionDecl(this);
		}
	}

	public final PartialFunctionDeclContext partialFunctionDecl() throws RecognitionException {
		PartialFunctionDeclContext _localctx = new PartialFunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_partialFunctionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(FUNCTION);
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(95);
				outArgs();
				}
				break;
			}
			setState(98);
			match(ID);
			setState(100);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(99);
				inArgs();
				}
			}

			setState(102);
			endStat();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(103);
				statBlock();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public PartialFunctionDeclContext partialFunctionDecl() {
			return getRuleContext(PartialFunctionDeclContext.class,0);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public EndStatNLContext endStatNL() {
			return getRuleContext(EndStatNLContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(MATLABParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MATLABParser.NL, i);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			partialFunctionDecl();
			setState(110);
			match(END);
			setState(111);
			endStatNL();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(112);
				match(NL);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public PartialFunctionDeclContext partialFunctionDecl() {
			return getRuleContext(PartialFunctionDeclContext.class,0);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public EndStatContext endStat() {
			return getRuleContext(EndStatContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			partialFunctionDecl();
			setState(119);
			match(END);
			setState(120);
			endStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode CLASSDEF() { return getToken(MATLABParser.CLASSDEF, 0); }
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public List<EndStatContext> endStat() {
			return getRuleContexts(EndStatContext.class);
		}
		public EndStatContext endStat(int i) {
			return getRuleContext(EndStatContext.class,i);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public TerminalNode EOF() { return getToken(MATLABParser.EOF, 0); }
		public List<PropBlockDeclContext> propBlockDecl() {
			return getRuleContexts(PropBlockDeclContext.class);
		}
		public PropBlockDeclContext propBlockDecl(int i) {
			return getRuleContext(PropBlockDeclContext.class,i);
		}
		public List<MethodBlockDeclContext> methodBlockDecl() {
			return getRuleContexts(MethodBlockDeclContext.class);
		}
		public MethodBlockDeclContext methodBlockDecl(int i) {
			return getRuleContext(MethodBlockDeclContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(MATLABParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MATLABParser.NL, i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(CLASSDEF);
			setState(123);
			match(ID);
			setState(124);
			endStat();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROPERTIES || _la==METHODS) {
				{
				setState(127);
				switch (_input.LA(1)) {
				case PROPERTIES:
					{
					setState(125);
					propBlockDecl();
					}
					break;
				case METHODS:
					{
					setState(126);
					methodBlockDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(END);
			setState(135);
			switch (_input.LA(1)) {
			case EOF:
				{
				setState(133);
				match(EOF);
				}
				break;
			case NL:
			case COMMA:
			case SEMI:
				{
				setState(134);
				endStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(137);
				match(NL);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropBlockDeclContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(MATLABParser.PROPERTIES, 0); }
		public List<EndStatContext> endStat() {
			return getRuleContexts(EndStatContext.class);
		}
		public EndStatContext endStat(int i) {
			return getRuleContext(EndStatContext.class,i);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public PropBlockDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propBlockDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterPropBlockDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitPropBlockDecl(this);
		}
	}

	public final PropBlockDeclContext propBlockDecl() throws RecognitionException {
		PropBlockDeclContext _localctx = new PropBlockDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_propBlockDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(PROPERTIES);
			setState(144);
			endStat();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(145);
				prop();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(END);
			setState(152);
			endStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBlockDeclContext extends ParserRuleContext {
		public TerminalNode METHODS() { return getToken(MATLABParser.METHODS, 0); }
		public List<EndStatContext> endStat() {
			return getRuleContexts(EndStatContext.class);
		}
		public EndStatContext endStat(int i) {
			return getRuleContext(EndStatContext.class,i);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public MethodBlockDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBlockDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterMethodBlockDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitMethodBlockDecl(this);
		}
	}

	public final MethodBlockDeclContext methodBlockDecl() throws RecognitionException {
		MethodBlockDeclContext _localctx = new MethodBlockDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodBlockDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(METHODS);
			setState(155);
			endStat();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(156);
				methodDecl();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(END);
			setState(163);
			endStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutArgsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MATLABParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MATLABParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(MATLABParser.EQUALS, 0); }
		public TerminalNode LBRACK() { return getToken(MATLABParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MATLABParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MATLABParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MATLABParser.COMMA, i);
		}
		public OutArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterOutArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitOutArgs(this);
		}
	}

	public final OutArgsContext outArgs() throws RecognitionException {
		OutArgsContext _localctx = new OutArgsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_outArgs);
		int _la;
		try {
			setState(178);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(ID);
				setState(166);
				match(EQUALS);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(LBRACK);
				setState(168);
				match(ID);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(169);
					match(COMMA);
					setState(170);
					match(ID);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(RBRACK);
				setState(177);
				match(EQUALS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InArgsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MATLABParser.LPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(MATLABParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MATLABParser.ID, i);
		}
		public TerminalNode RPAREN() { return getToken(MATLABParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MATLABParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MATLABParser.COMMA, i);
		}
		public InArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterInArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitInArgs(this);
		}
	}

	public final InArgsContext inArgs() throws RecognitionException {
		InArgsContext _localctx = new InArgsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inArgs);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(LPAREN);
				setState(181);
				match(ID);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(182);
					match(COMMA);
					setState(183);
					match(ID);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(LPAREN);
				setState(191);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public EndStatContext endStat() {
			return getRuleContext(EndStatContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(MATLABParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitProp(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(197);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(195);
				match(EQUALS);
				setState(196);
				expr(0);
				}
			}

			setState(199);
			endStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotRefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MATLABParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MATLABParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MATLABParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MATLABParser.DOT, i);
		}
		public DotRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterDotRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitDotRef(this);
		}
	}

	public final DotRefContext dotRef() throws RecognitionException {
		DotRefContext _localctx = new DotRefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dotRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					match(DOT);
					setState(203);
					match(ID);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatBlockContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public List<EndStatContext> endStat() {
			return getRuleContexts(EndStatContext.class);
		}
		public EndStatContext endStat(int i) {
			return getRuleContext(EndStatContext.class,i);
		}
		public StatBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterStatBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitStatBlock(this);
		}
	}

	public final StatBlockContext statBlock() throws RecognitionException {
		StatBlockContext _localctx = new StatBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			stat();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << COMMA) | (1L << SEMI))) != 0)) {
				{
				{
				setState(210);
				endStat();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MATLABParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<EndStatContext> endStat() {
			return getRuleContexts(EndStatContext.class);
		}
		public EndStatContext endStat(int i) {
			return getRuleContext(EndStatContext.class,i);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public List<StatBlockContext> statBlock() {
			return getRuleContexts(StatBlockContext.class);
		}
		public StatBlockContext statBlock(int i) {
			return getRuleContext(StatBlockContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(MATLABParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(MATLABParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(MATLABParser.ELSE, 0); }
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitIfStat(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(IF);
			setState(217);
			expr(0);
			setState(218);
			endStat();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(219);
				statBlock();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(225);
				match(ELSEIF);
				setState(226);
				expr(0);
				setState(227);
				endStat();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(228);
					statBlock();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(239);
				match(ELSE);
				setState(241);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << COMMA) | (1L << SEMI))) != 0)) {
					{
					setState(240);
					endStat();
					}
				}

				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(243);
					statBlock();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(251);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MATLABParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EndStatContext endStat() {
			return getRuleContext(EndStatContext.class,0);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public List<StatBlockContext> statBlock() {
			return getRuleContexts(StatBlockContext.class);
		}
		public StatBlockContext statBlock(int i) {
			return getRuleContext(StatBlockContext.class,i);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitWhileStat(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(WHILE);
			setState(254);
			expr(0);
			setState(255);
			endStat();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(256);
				statBlock();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(MATLABParser.SWITCH, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<EndStatContext> endStat() {
			return getRuleContexts(EndStatContext.class);
		}
		public EndStatContext endStat(int i) {
			return getRuleContext(EndStatContext.class,i);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public List<TerminalNode> CASE() { return getTokens(MATLABParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(MATLABParser.CASE, i);
		}
		public TerminalNode OTHERWISE() { return getToken(MATLABParser.OTHERWISE, 0); }
		public List<StatBlockContext> statBlock() {
			return getRuleContexts(StatBlockContext.class);
		}
		public StatBlockContext statBlock(int i) {
			return getRuleContext(StatBlockContext.class,i);
		}
		public CaseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterCaseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitCaseStat(this);
		}
	}

	public final CaseStatContext caseStat() throws RecognitionException {
		CaseStatContext _localctx = new CaseStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_caseStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(SWITCH);
			setState(265);
			expr(0);
			setState(266);
			endStat();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(267);
				match(CASE);
				setState(268);
				expr(0);
				setState(269);
				endStat();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(270);
					statBlock();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(281);
				match(OTHERWISE);
				setState(282);
				endStat();
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(283);
					statBlock();
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(291);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public DotRefContext dotRef() {
			return getRuleContext(DotRefContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(MATLABParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public CaseStatContext caseStat() {
			return getRuleContext(CaseStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stat);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				dotRef();
				setState(294);
				match(EQUALS);
				setState(295);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				dotRef();
				setState(298);
				arrayRef();
				setState(299);
				match(EQUALS);
				setState(300);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				ifStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				whileStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				caseStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayRefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MATLABParser.LPAREN, 0); }
		public ExprArrayListContext exprArrayList() {
			return getRuleContext(ExprArrayListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MATLABParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(MATLABParser.COLON, 0); }
		public ArrayRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterArrayRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitArrayRef(this);
		}
	}

	public final ArrayRefContext arrayRef() throws RecognitionException {
		ArrayRefContext _localctx = new ArrayRefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayRef);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(LPAREN);
				setState(309);
				exprArrayList();
				setState(310);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(LPAREN);
				setState(313);
				match(COLON);
				setState(314);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(LPAREN);
				setState(316);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(MATLABParser.LBRACK, 0); }
		public ExprArrayListContext exprArrayList() {
			return getRuleContext(ExprArrayListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(MATLABParser.RBRACK, 0); }
		public ArrayExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitArrayExpr(this);
		}
	}

	public final ArrayExprContext arrayExpr() throws RecognitionException {
		ArrayExprContext _localctx = new ArrayExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayExpr);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(LBRACK);
				setState(320);
				exprArrayList();
				setState(321);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(LBRACK);
				setState(324);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CellExprContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MATLABParser.LBRACE, 0); }
		public ExprArrayListContext exprArrayList() {
			return getRuleContext(ExprArrayListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MATLABParser.RBRACE, 0); }
		public CellExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cellExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterCellExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitCellExpr(this);
		}
	}

	public final CellExprContext cellExpr() throws RecognitionException {
		CellExprContext _localctx = new CellExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cellExpr);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(LBRACE);
				setState(328);
				exprArrayList();
				setState(329);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(LBRACE);
				setState(332);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MATLABParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MATLABParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(MATLABParser.NOT, 0); }
		public DotRefContext dotRef() {
			return getRuleContext(DotRefContext.class,0);
		}
		public TerminalNode INT() { return getToken(MATLABParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MATLABParser.FLOAT, 0); }
		public TerminalNode SCI() { return getToken(MATLABParser.SCI, 0); }
		public TerminalNode STRING() { return getToken(MATLABParser.STRING, 0); }
		public ArrayExprContext arrayExpr() {
			return getRuleContext(ArrayExprContext.class,0);
		}
		public CellExprContext cellExpr() {
			return getRuleContext(CellExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MATLABParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MATLABParser.RPAREN, 0); }
		public TerminalNode MPOW() { return getToken(MATLABParser.MPOW, 0); }
		public TerminalNode POW() { return getToken(MATLABParser.POW, 0); }
		public TerminalNode MTIMES() { return getToken(MATLABParser.MTIMES, 0); }
		public TerminalNode TIMES() { return getToken(MATLABParser.TIMES, 0); }
		public TerminalNode MLDIVIDE() { return getToken(MATLABParser.MLDIVIDE, 0); }
		public TerminalNode LDIVIDE() { return getToken(MATLABParser.LDIVIDE, 0); }
		public TerminalNode MRDIVIDE() { return getToken(MATLABParser.MRDIVIDE, 0); }
		public TerminalNode RDIVIDE() { return getToken(MATLABParser.RDIVIDE, 0); }
		public TerminalNode COLON() { return getToken(MATLABParser.COLON, 0); }
		public TerminalNode EQUALTO() { return getToken(MATLABParser.EQUALTO, 0); }
		public TerminalNode NOTEQUALTO() { return getToken(MATLABParser.NOTEQUALTO, 0); }
		public TerminalNode GT() { return getToken(MATLABParser.GT, 0); }
		public TerminalNode LT() { return getToken(MATLABParser.LT, 0); }
		public TerminalNode GE() { return getToken(MATLABParser.GE, 0); }
		public TerminalNode LE() { return getToken(MATLABParser.LE, 0); }
		public TerminalNode VECAND() { return getToken(MATLABParser.VECAND, 0); }
		public TerminalNode VECOR() { return getToken(MATLABParser.VECOR, 0); }
		public TerminalNode SCALAND() { return getToken(MATLABParser.SCALAND, 0); }
		public TerminalNode SCALOR() { return getToken(MATLABParser.SCALOR, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode TRANS() { return getToken(MATLABParser.TRANS, 0); }
		public TerminalNode CTRANS() { return getToken(MATLABParser.CTRANS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
				{
				setState(336);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(337);
				expr(17);
				}
				break;
			case ID:
				{
				setState(338);
				dotRef();
				}
				break;
			case INT:
				{
				setState(339);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(340);
				match(FLOAT);
				}
				break;
			case SCI:
				{
				setState(341);
				match(SCI);
				}
				break;
			case STRING:
				{
				setState(342);
				match(STRING);
				}
				break;
			case LBRACK:
				{
				setState(343);
				arrayExpr();
				}
				break;
			case LBRACE:
				{
				setState(344);
				cellExpr();
				}
				break;
			case LPAREN:
				{
				setState(345);
				match(LPAREN);
				setState(346);
				expr(0);
				setState(347);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(385);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(351);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(352);
						_la = _input.LA(1);
						if ( !(_la==POW || _la==MPOW) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(353);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(354);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(355);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MTIMES) | (1L << TIMES) | (1L << RDIVIDE) | (1L << LDIVIDE) | (1L << MRDIVIDE) | (1L << MLDIVIDE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(356);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(357);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(358);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(359);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(361);
						match(COLON);
						setState(362);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(363);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(364);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALTO) | (1L << NOTEQUALTO) | (1L << GT) | (1L << LT) | (1L << GE) | (1L << LE) | (1L << NOT))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(365);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(366);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(367);
						match(VECAND);
						setState(368);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(369);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(370);
						match(VECOR);
						setState(371);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(372);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(373);
						match(SCALAND);
						setState(374);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(375);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(376);
						match(SCALOR);
						setState(377);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(378);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(379);
						match(LPAREN);
						setState(380);
						exprList();
						setState(381);
						match(RPAREN);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(383);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(384);
						_la = _input.LA(1);
						if ( !(_la==TRANS || _la==CTRANS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			expr(0);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(391);
				match(COMMA);
				setState(392);
				expr(0);
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprArrayListContext extends ParserRuleContext {
		public ExprArrayListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprArrayList; }
	 
		public ExprArrayListContext() { }
		public void copyFrom(ExprArrayListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VcatContext extends ExprArrayListContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ExprArrayListContext> exprArrayList() {
			return getRuleContexts(ExprArrayListContext.class);
		}
		public ExprArrayListContext exprArrayList(int i) {
			return getRuleContext(ExprArrayListContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MATLABParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MATLABParser.SEMI, i);
		}
		public List<TerminalNode> NL() { return getTokens(MATLABParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MATLABParser.NL, i);
		}
		public VcatContext(ExprArrayListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterVcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitVcat(this);
		}
	}
	public static class HcatContext extends ExprArrayListContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ExprArrayListContext> exprArrayList() {
			return getRuleContexts(ExprArrayListContext.class);
		}
		public ExprArrayListContext exprArrayList(int i) {
			return getRuleContext(ExprArrayListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MATLABParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MATLABParser.COMMA, i);
		}
		public HcatContext(ExprArrayListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterHcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitHcat(this);
		}
	}

	public final ExprArrayListContext exprArrayList() throws RecognitionException {
		ExprArrayListContext _localctx = new ExprArrayListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exprArrayList);
		int _la;
		try {
			int _alt;
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new HcatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				expr(0);
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(400);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(399);
							match(COMMA);
							}
						}

						setState(402);
						exprArrayList();
						}
						} 
					}
					setState(407);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new VcatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				expr(0);
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(409);
						_la = _input.LA(1);
						if ( !(_la==NL || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(410);
						exprArrayList();
						}
						} 
					}
					setState(415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 20);
		case 10:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u01a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\5\2\67\n\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\5\2E\n\2\3\2\6\2H\n\2\r\2\16\2I\3\2\6\2M\n\2\r\2\16\2"+
		"N\3\2\5\2R\n\2\3\3\7\3U\n\3\f\3\16\3X\13\3\3\4\3\4\3\5\6\5]\n\5\r\5\16"+
		"\5^\3\6\3\6\5\6c\n\6\3\6\3\6\5\6g\n\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6"+
		"\3\7\3\7\3\7\3\7\7\7t\n\7\f\7\16\7w\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u0082\n\t\f\t\16\t\u0085\13\t\3\t\3\t\3\t\5\t\u008a\n\t\3\t"+
		"\7\t\u008d\n\t\f\t\16\t\u0090\13\t\3\n\3\n\3\n\7\n\u0095\n\n\f\n\16\n"+
		"\u0098\13\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00a0\n\13\f\13\16\13\u00a3"+
		"\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ae\n\f\f\f\16\f\u00b1"+
		"\13\f\3\f\3\f\5\f\u00b5\n\f\3\r\3\r\3\r\3\r\7\r\u00bb\n\r\f\r\16\r\u00be"+
		"\13\r\3\r\3\r\3\r\5\r\u00c3\n\r\3\16\3\16\3\16\5\16\u00c8\n\16\3\16\3"+
		"\16\3\17\3\17\3\17\7\17\u00cf\n\17\f\17\16\17\u00d2\13\17\3\20\3\20\7"+
		"\20\u00d6\n\20\f\20\16\20\u00d9\13\20\3\21\3\21\3\21\3\21\7\21\u00df\n"+
		"\21\f\21\16\21\u00e2\13\21\3\21\3\21\3\21\3\21\7\21\u00e8\n\21\f\21\16"+
		"\21\u00eb\13\21\7\21\u00ed\n\21\f\21\16\21\u00f0\13\21\3\21\3\21\5\21"+
		"\u00f4\n\21\3\21\7\21\u00f7\n\21\f\21\16\21\u00fa\13\21\5\21\u00fc\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0104\n\22\f\22\16\22\u0107\13\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0112\n\23\f\23\16"+
		"\23\u0115\13\23\7\23\u0117\n\23\f\23\16\23\u011a\13\23\3\23\3\23\3\23"+
		"\7\23\u011f\n\23\f\23\16\23\u0122\13\23\5\23\u0124\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0135"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0140\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0148\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0150\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0160\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0184"+
		"\n\30\f\30\16\30\u0187\13\30\3\31\3\31\3\31\7\31\u018c\n\31\f\31\16\31"+
		"\u018f\13\31\3\32\3\32\5\32\u0193\n\32\3\32\7\32\u0196\n\32\f\32\16\32"+
		"\u0199\13\32\3\32\3\32\3\32\7\32\u019e\n\32\f\32\16\32\u01a1\13\32\5\32"+
		"\u01a3\n\32\3\32\2\3.\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\2\n\4\2--\66\67\4\2\26\27))\3\2\'(\3\2!&\3\2\26\27\4\2\20\25"+
		"))\3\2+,\4\2--\67\67\u01d4\2Q\3\2\2\2\4V\3\2\2\2\6Y\3\2\2\2\b\\\3\2\2"+
		"\2\n`\3\2\2\2\fo\3\2\2\2\16x\3\2\2\2\20|\3\2\2\2\22\u0091\3\2\2\2\24\u009c"+
		"\3\2\2\2\26\u00b4\3\2\2\2\30\u00c2\3\2\2\2\32\u00c4\3\2\2\2\34\u00cb\3"+
		"\2\2\2\36\u00d3\3\2\2\2 \u00da\3\2\2\2\"\u00ff\3\2\2\2$\u010a\3\2\2\2"+
		"&\u0134\3\2\2\2(\u013f\3\2\2\2*\u0147\3\2\2\2,\u014f\3\2\2\2.\u015f\3"+
		"\2\2\2\60\u0188\3\2\2\2\62\u01a2\3\2\2\2\64\67\5\f\7\2\65\67\5\20\t\2"+
		"\66\64\3\2\2\2\66\65\3\2\2\2\66\67\3\2\2\2\67D\3\2\2\28:\5\f\7\298\3\2"+
		"\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<E\3\2\2\2=;\3\2\2\2>@\5\n\6\2?>\3\2"+
		"\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2\2\2D;\3\2\2\2DA\3\2"+
		"\2\2ER\3\2\2\2FH\5\n\6\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JR\3\2"+
		"\2\2KM\5\36\20\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PR\7"+
		"\2\2\3Q\66\3\2\2\2QG\3\2\2\2QL\3\2\2\2QP\3\2\2\2R\3\3\2\2\2SU\5\36\20"+
		"\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\5\3\2\2\2XV\3\2\2\2YZ\t\2"+
		"\2\2Z\7\3\2\2\2[]\7-\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\t"+
		"\3\2\2\2`b\7\3\2\2ac\5\26\f\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2df\7\62\2\2"+
		"eg\5\30\r\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hl\5\6\4\2ik\5\36\20\2ji\3\2"+
		"\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\13\3\2\2\2nl\3\2\2\2op\5\n\6\2pq\7"+
		"\7\2\2qu\5\b\5\2rt\7-\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\r\3"+
		"\2\2\2wu\3\2\2\2xy\5\n\6\2yz\7\7\2\2z{\5\6\4\2{\17\3\2\2\2|}\7\4\2\2}"+
		"~\7\62\2\2~\u0083\5\6\4\2\177\u0082\5\22\n\2\u0080\u0082\5\24\13\2\u0081"+
		"\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0089"+
		"\7\7\2\2\u0087\u008a\7\2\2\3\u0088\u008a\5\6\4\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008e\3\2\2\2\u008b\u008d\7-\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\21\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\5\2\2\u0092\u0096\5\6\4"+
		"\2\u0093\u0095\5\32\16\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\7\7\2\2\u009a\u009b\5\6\4\2\u009b\23\3\2\2\2\u009c\u009d"+
		"\7\6\2\2\u009d\u00a1\5\6\4\2\u009e\u00a0\5\16\b\2\u009f\u009e\3\2\2\2"+
		"\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6\5\6\4\2\u00a6"+
		"\25\3\2\2\2\u00a7\u00a8\7\62\2\2\u00a8\u00b5\7\17\2\2\u00a9\u00aa\7 \2"+
		"\2\u00aa\u00af\7\62\2\2\u00ab\u00ac\7\66\2\2\u00ac\u00ae\7\62\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\64\2\2\u00b3"+
		"\u00b5\7\17\2\2\u00b4\u00a7\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b5\27\3\2\2"+
		"\2\u00b6\u00b7\7\35\2\2\u00b7\u00bc\7\62\2\2\u00b8\u00b9\7\66\2\2\u00b9"+
		"\u00bb\7\62\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c3\7\36\2\2\u00c0\u00c1\7\35\2\2\u00c1\u00c3\7\36\2\2\u00c2\u00b6"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c7\7\62\2\2\u00c5"+
		"\u00c6\7\17\2\2\u00c6\u00c8\5.\30\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\5\6\4\2\u00ca\33\3\2\2\2\u00cb"+
		"\u00d0\7\62\2\2\u00cc\u00cd\7\30\2\2\u00cd\u00cf\7\62\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\35\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d7\5&\24\2\u00d4\u00d6\5\6\4"+
		"\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\37\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\b\2\2\u00db"+
		"\u00dc\5.\30\2\u00dc\u00e0\5\6\4\2\u00dd\u00df\5\36\20\2\u00de\u00dd\3"+
		"\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00ee\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\t\2\2\u00e4\u00e5\5."+
		"\30\2\u00e5\u00e9\5\6\4\2\u00e6\u00e8\5\36\20\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00fb\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f3\7\n\2\2\u00f2\u00f4\5\6\4\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f8\3\2\2\2\u00f5\u00f7\5\36\20\2\u00f6\u00f5\3"+
		"\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\7\2\2\u00fe!\3\2\2\2\u00ff\u0100"+
		"\7\13\2\2\u0100\u0101\5.\30\2\u0101\u0105\5\6\4\2\u0102\u0104\5\36\20"+
		"\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\7\2\2\u0109"+
		"#\3\2\2\2\u010a\u010b\7\f\2\2\u010b\u010c\5.\30\2\u010c\u0118\5\6\4\2"+
		"\u010d\u010e\7\r\2\2\u010e\u010f\5.\30\2\u010f\u0113\5\6\4\2\u0110\u0112"+
		"\5\36\20\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2"+
		"\u0113\u0114\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u010d"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u0123\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\16\2\2\u011c\u0120\5"+
		"\6\4\2\u011d\u011f\5\36\20\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u011b\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\7\7\2\2\u0126%\3\2\2\2\u0127\u0128\5\34\17\2\u0128\u0129\7\17\2"+
		"\2\u0129\u012a\5.\30\2\u012a\u0135\3\2\2\2\u012b\u012c\5\34\17\2\u012c"+
		"\u012d\5(\25\2\u012d\u012e\7\17\2\2\u012e\u012f\5.\30\2\u012f\u0135\3"+
		"\2\2\2\u0130\u0135\5 \21\2\u0131\u0135\5\"\22\2\u0132\u0135\5$\23\2\u0133"+
		"\u0135\5.\30\2\u0134\u0127\3\2\2\2\u0134\u012b\3\2\2\2\u0134\u0130\3\2"+
		"\2\2\u0134\u0131\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135"+
		"\'\3\2\2\2\u0136\u0137\7\35\2\2\u0137\u0138\5\62\32\2\u0138\u0139\7\36"+
		"\2\2\u0139\u0140\3\2\2\2\u013a\u013b\7\35\2\2\u013b\u013c\7*\2\2\u013c"+
		"\u0140\7\36\2\2\u013d\u013e\7\35\2\2\u013e\u0140\7\36\2\2\u013f\u0136"+
		"\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u013d\3\2\2\2\u0140)\3\2\2\2\u0141"+
		"\u0142\7 \2\2\u0142\u0143\5\62\32\2\u0143\u0144\7\64\2\2\u0144\u0148\3"+
		"\2\2\2\u0145\u0146\7 \2\2\u0146\u0148\7\64\2\2\u0147\u0141\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148+\3\2\2\2\u0149\u014a\7\37\2\2\u014a\u014b\5\62\32"+
		"\2\u014b\u014c\7\65\2\2\u014c\u0150\3\2\2\2\u014d\u014e\7\37\2\2\u014e"+
		"\u0150\7\65\2\2\u014f\u0149\3\2\2\2\u014f\u014d\3\2\2\2\u0150-\3\2\2\2"+
		"\u0151\u0152\b\30\1\2\u0152\u0153\t\3\2\2\u0153\u0160\5.\30\23\u0154\u0160"+
		"\5\34\17\2\u0155\u0160\7/\2\2\u0156\u0160\7\60\2\2\u0157\u0160\7\61\2"+
		"\2\u0158\u0160\7\63\2\2\u0159\u0160\5*\26\2\u015a\u0160\5,\27\2\u015b"+
		"\u015c\7\35\2\2\u015c\u015d\5.\30\2\u015d\u015e\7\36\2\2\u015e\u0160\3"+
		"\2\2\2\u015f\u0151\3\2\2\2\u015f\u0154\3\2\2\2\u015f\u0155\3\2\2\2\u015f"+
		"\u0156\3\2\2\2\u015f\u0157\3\2\2\2\u015f\u0158\3\2\2\2\u015f\u0159\3\2"+
		"\2\2\u015f\u015a\3\2\2\2\u015f\u015b\3\2\2\2\u0160\u0185\3\2\2\2\u0161"+
		"\u0162\f\24\2\2\u0162\u0163\t\4\2\2\u0163\u0184\5.\30\25\u0164\u0165\f"+
		"\22\2\2\u0165\u0166\t\5\2\2\u0166\u0184\5.\30\23\u0167\u0168\f\21\2\2"+
		"\u0168\u0169\t\6\2\2\u0169\u0184\5.\30\22\u016a\u016b\f\20\2\2\u016b\u016c"+
		"\7*\2\2\u016c\u0184\5.\30\21\u016d\u016e\f\17\2\2\u016e\u016f\t\7\2\2"+
		"\u016f\u0184\5.\30\20\u0170\u0171\f\16\2\2\u0171\u0172\7\31\2\2\u0172"+
		"\u0184\5.\30\17\u0173\u0174\f\r\2\2\u0174\u0175\7\32\2\2\u0175\u0184\5"+
		".\30\16\u0176\u0177\f\f\2\2\u0177\u0178\7\33\2\2\u0178\u0184\5.\30\r\u0179"+
		"\u017a\f\13\2\2\u017a\u017b\7\34\2\2\u017b\u0184\5.\30\f\u017c\u017d\f"+
		"\26\2\2\u017d\u017e\7\35\2\2\u017e\u017f\5\60\31\2\u017f\u0180\7\36\2"+
		"\2\u0180\u0184\3\2\2\2\u0181\u0182\f\25\2\2\u0182\u0184\t\b\2\2\u0183"+
		"\u0161\3\2\2\2\u0183\u0164\3\2\2\2\u0183\u0167\3\2\2\2\u0183\u016a\3\2"+
		"\2\2\u0183\u016d\3\2\2\2\u0183\u0170\3\2\2\2\u0183\u0173\3\2\2\2\u0183"+
		"\u0176\3\2\2\2\u0183\u0179\3\2\2\2\u0183\u017c\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"/\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018d\5.\30\2\u0189\u018a\7\66\2\2"+
		"\u018a\u018c\5.\30\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\61\3\2\2\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0197\5.\30\2\u0191\u0193\7\66\2\2\u0192\u0191\3\2\2\2\u0192\u0193\3"+
		"\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\5\62\32\2\u0195\u0192\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u01a3\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019f\5.\30\2\u019b\u019c\t\t\2\2\u019c"+
		"\u019e\5\62\32\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u0190\3\2\2\2\u01a2\u019a\3\2\2\2\u01a3\63\3\2\2\2\63\66;ADINQV^bflu"+
		"\u0081\u0083\u0089\u008e\u0096\u00a1\u00af\u00b4\u00bc\u00c2\u00c7\u00d0"+
		"\u00d7\u00e0\u00e9\u00ee\u00f3\u00f8\u00fb\u0105\u0113\u0118\u0120\u0123"+
		"\u0134\u013f\u0147\u014f\u015f\u0183\u0185\u018d\u0192\u0197\u019f\u01a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}