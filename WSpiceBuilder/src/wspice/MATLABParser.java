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
		RULE_outArgs = 10, RULE_inArgs = 11, RULE_prop = 12, RULE_idRef = 13, 
		RULE_statBlock = 14, RULE_ifStat = 15, RULE_whileStat = 16, RULE_caseStat = 17, 
		RULE_scalarAssignStat = 18, RULE_arrayAssignStat = 19, RULE_stat = 20, 
		RULE_arrayRef = 21, RULE_arrayExpr = 22, RULE_cellExpr = 23, RULE_expr = 24, 
		RULE_exprList = 25, RULE_exprArrayList = 26;
	public static final String[] ruleNames = {
		"fileDecl", "script", "endStat", "endStatNL", "partialFunctionDecl", "functionDecl", 
		"methodDecl", "classDecl", "propBlockDecl", "methodBlockDecl", "outArgs", 
		"inArgs", "prop", "idRef", "statBlock", "ifStat", "whileStat", "caseStat", 
		"scalarAssignStat", "arrayAssignStat", "stat", "arrayRef", "arrayExpr", 
		"cellExpr", "expr", "exprList", "exprArrayList"
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(54);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(55);
					classDecl();
					}
					break;
				}
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==FUNCTION) {
						{
						{
						setState(58);
						functionDecl();
						}
						}
						setState(63);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==FUNCTION) {
						{
						{
						setState(64);
						partialFunctionDecl();
						}
						}
						setState(69);
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
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72);
					partialFunctionDecl();
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FUNCTION );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					statBlock();
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0) );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
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
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(85);
				statBlock();
				}
				}
				setState(90);
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
			setState(91);
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
			setState(94); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(93);
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96); 
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
			setState(98);
			match(FUNCTION);
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(99);
				outArgs();
				}
				break;
			}
			setState(102);
			match(ID);
			setState(104);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(103);
				inArgs();
				}
			}

			setState(106);
			endStat();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(107);
				statBlock();
				}
				}
				setState(112);
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
			setState(113);
			partialFunctionDecl();
			setState(114);
			match(END);
			setState(115);
			endStatNL();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(116);
				match(NL);
				}
				}
				setState(121);
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
			setState(122);
			partialFunctionDecl();
			setState(123);
			match(END);
			setState(124);
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
			setState(126);
			match(CLASSDEF);
			setState(127);
			match(ID);
			setState(128);
			endStat();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROPERTIES || _la==METHODS) {
				{
				setState(131);
				switch (_input.LA(1)) {
				case PROPERTIES:
					{
					setState(129);
					propBlockDecl();
					}
					break;
				case METHODS:
					{
					setState(130);
					methodBlockDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(END);
			setState(139);
			switch (_input.LA(1)) {
			case EOF:
				{
				setState(137);
				match(EOF);
				}
				break;
			case NL:
			case COMMA:
			case SEMI:
				{
				setState(138);
				endStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(141);
				match(NL);
				}
				}
				setState(146);
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
			setState(147);
			match(PROPERTIES);
			setState(148);
			endStat();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(149);
				prop();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(END);
			setState(156);
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
			setState(158);
			match(METHODS);
			setState(159);
			endStat();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(160);
				methodDecl();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(END);
			setState(167);
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
			setState(182);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(ID);
				setState(170);
				match(EQUALS);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(LBRACK);
				setState(172);
				match(ID);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(173);
					match(COMMA);
					setState(174);
					match(ID);
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(RBRACK);
				setState(181);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(LPAREN);
				setState(185);
				match(ID);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(186);
					match(COMMA);
					setState(187);
					match(ID);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(LPAREN);
				setState(195);
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
			setState(198);
			match(ID);
			setState(201);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(199);
				match(EQUALS);
				setState(200);
				expr(0);
				}
			}

			setState(203);
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

	public static class IdRefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MATLABParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MATLABParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MATLABParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MATLABParser.DOT, i);
		}
		public IdRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterIdRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitIdRef(this);
		}
	}

	public final IdRefContext idRef() throws RecognitionException {
		IdRefContext _localctx = new IdRefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_idRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					match(DOT);
					setState(207);
					match(ID);
					}
					} 
				}
				setState(212);
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
			setState(213);
			stat();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << COMMA) | (1L << SEMI))) != 0)) {
				{
				{
				setState(214);
				endStat();
				}
				}
				setState(219);
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
			setState(220);
			match(IF);
			setState(221);
			expr(0);
			setState(222);
			endStat();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(223);
				statBlock();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(229);
				match(ELSEIF);
				setState(230);
				expr(0);
				setState(231);
				endStat();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(232);
					statBlock();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(243);
				match(ELSE);
				setState(245);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << COMMA) | (1L << SEMI))) != 0)) {
					{
					setState(244);
					endStat();
					}
				}

				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(247);
					statBlock();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(255);
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
			setState(257);
			match(WHILE);
			setState(258);
			expr(0);
			setState(259);
			endStat();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(260);
				statBlock();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
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
			setState(268);
			match(SWITCH);
			setState(269);
			expr(0);
			setState(270);
			endStat();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(271);
				match(CASE);
				setState(272);
				expr(0);
				setState(273);
				endStat();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(274);
					statBlock();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(285);
				match(OTHERWISE);
				setState(286);
				endStat();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(287);
					statBlock();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(295);
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

	public static class ScalarAssignStatContext extends ParserRuleContext {
		public IdRefContext idRef() {
			return getRuleContext(IdRefContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(MATLABParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ScalarAssignStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarAssignStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterScalarAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitScalarAssignStat(this);
		}
	}

	public final ScalarAssignStatContext scalarAssignStat() throws RecognitionException {
		ScalarAssignStatContext _localctx = new ScalarAssignStatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scalarAssignStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			idRef();
			setState(298);
			match(EQUALS);
			setState(299);
			expr(0);
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

	public static class ArrayAssignStatContext extends ParserRuleContext {
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(MATLABParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayAssignStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterArrayAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitArrayAssignStat(this);
		}
	}

	public final ArrayAssignStatContext arrayAssignStat() throws RecognitionException {
		ArrayAssignStatContext _localctx = new ArrayAssignStatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayAssignStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			arrayRef();
			setState(302);
			match(EQUALS);
			setState(303);
			expr(0);
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
		public ScalarAssignStatContext scalarAssignStat() {
			return getRuleContext(ScalarAssignStatContext.class,0);
		}
		public ArrayAssignStatContext arrayAssignStat() {
			return getRuleContext(ArrayAssignStatContext.class,0);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 40, RULE_stat);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				scalarAssignStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				arrayAssignStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				ifStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				whileStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				caseStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
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
		public IdRefContext idRef() {
			return getRuleContext(IdRefContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_arrayRef);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				idRef();
				setState(314);
				match(LPAREN);
				setState(315);
				exprArrayList();
				setState(316);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				idRef();
				setState(319);
				match(LPAREN);
				setState(320);
				match(COLON);
				setState(321);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				idRef();
				setState(324);
				match(LPAREN);
				setState(325);
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
		enterRule(_localctx, 44, RULE_arrayExpr);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(LBRACK);
				setState(330);
				exprArrayList();
				setState(331);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(LBRACK);
				setState(334);
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
		enterRule(_localctx, 46, RULE_cellExpr);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(LBRACE);
				setState(338);
				exprArrayList();
				setState(339);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(LBRACE);
				setState(342);
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
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MATLABParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MATLABParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(MATLABParser.NOT, 0); }
		public IdRefContext idRef() {
			return getRuleContext(IdRefContext.class,0);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(346);
				arrayRef();
				}
				break;
			case 2:
				{
				setState(347);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(348);
				expr(17);
				}
				break;
			case 3:
				{
				setState(349);
				idRef();
				}
				break;
			case 4:
				{
				setState(350);
				match(INT);
				}
				break;
			case 5:
				{
				setState(351);
				match(FLOAT);
				}
				break;
			case 6:
				{
				setState(352);
				match(SCI);
				}
				break;
			case 7:
				{
				setState(353);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(354);
				arrayExpr();
				}
				break;
			case 9:
				{
				setState(355);
				cellExpr();
				}
				break;
			case 10:
				{
				setState(356);
				match(LPAREN);
				setState(357);
				expr(0);
				setState(358);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(362);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(363);
						_la = _input.LA(1);
						if ( !(_la==POW || _la==MPOW) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(364);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(366);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MTIMES) | (1L << TIMES) | (1L << RDIVIDE) | (1L << LDIVIDE) | (1L << MRDIVIDE) | (1L << MLDIVIDE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(367);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(368);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(369);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(370);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(371);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(372);
						match(COLON);
						setState(373);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(374);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(375);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALTO) | (1L << NOTEQUALTO) | (1L << GT) | (1L << LT) | (1L << GE) | (1L << LE) | (1L << NOT))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(376);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(377);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(378);
						match(VECAND);
						setState(379);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(380);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(381);
						match(VECOR);
						setState(382);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(383);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(384);
						match(SCALAND);
						setState(385);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(386);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(387);
						match(SCALOR);
						setState(388);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(389);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(390);
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
				setState(395);
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
		enterRule(_localctx, 50, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			expr(0);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(397);
				match(COMMA);
				setState(398);
				expr(0);
				}
				}
				setState(403);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 52, RULE_exprArrayList);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new HcatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				expr(0);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING) | (1L << COMMA))) != 0)) {
					{
					{
					setState(406);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(405);
						match(COMMA);
						}
					}

					setState(408);
					expr(0);
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new VcatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				expr(0);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL || _la==SEMI) {
					{
					{
					setState(415);
					_la = _input.LA(1);
					if ( !(_la==NL || _la==SEMI) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(416);
					expr(0);
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		case 24:
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
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u01ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\5\2;\n\2\3\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\2\7\2D\n\2\f\2\16\2G\13\2\5\2I\n\2\3\2\6\2L\n\2\r\2\16\2M\3\2"+
		"\6\2Q\n\2\r\2\16\2R\3\2\5\2V\n\2\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\4\3\4"+
		"\3\5\6\5a\n\5\r\5\16\5b\3\6\3\6\5\6g\n\6\3\6\3\6\5\6k\n\6\3\6\3\6\7\6"+
		"o\n\6\f\6\16\6r\13\6\3\7\3\7\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u0086\n\t\f\t\16\t\u0089\13\t\3\t\3\t\3"+
		"\t\5\t\u008e\n\t\3\t\7\t\u0091\n\t\f\t\16\t\u0094\13\t\3\n\3\n\3\n\7\n"+
		"\u0099\n\n\f\n\16\n\u009c\13\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00a4\n"+
		"\13\f\13\16\13\u00a7\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00b2\n\f\f\f\16\f\u00b5\13\f\3\f\3\f\5\f\u00b9\n\f\3\r\3\r\3\r\3\r\7"+
		"\r\u00bf\n\r\f\r\16\r\u00c2\13\r\3\r\3\r\3\r\5\r\u00c7\n\r\3\16\3\16\3"+
		"\16\5\16\u00cc\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u00d3\n\17\f\17\16\17"+
		"\u00d6\13\17\3\20\3\20\7\20\u00da\n\20\f\20\16\20\u00dd\13\20\3\21\3\21"+
		"\3\21\3\21\7\21\u00e3\n\21\f\21\16\21\u00e6\13\21\3\21\3\21\3\21\3\21"+
		"\7\21\u00ec\n\21\f\21\16\21\u00ef\13\21\7\21\u00f1\n\21\f\21\16\21\u00f4"+
		"\13\21\3\21\3\21\5\21\u00f8\n\21\3\21\7\21\u00fb\n\21\f\21\16\21\u00fe"+
		"\13\21\5\21\u0100\n\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0108\n\22\f"+
		"\22\16\22\u010b\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u0116\n\23\f\23\16\23\u0119\13\23\7\23\u011b\n\23\f\23\16\23\u011e\13"+
		"\23\3\23\3\23\3\23\7\23\u0123\n\23\f\23\16\23\u0126\13\23\5\23\u0128\n"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u013a\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u014a\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u0152\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u015a\n\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\u016b\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u018a\n\32\f\32\16\32\u018d\13\32\3\33"+
		"\3\33\3\33\7\33\u0192\n\33\f\33\16\33\u0195\13\33\3\34\3\34\5\34\u0199"+
		"\n\34\3\34\7\34\u019c\n\34\f\34\16\34\u019f\13\34\3\34\3\34\3\34\7\34"+
		"\u01a4\n\34\f\34\16\34\u01a7\13\34\5\34\u01a9\n\34\3\34\2\3\62\35\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\n\4\2--\66"+
		"\67\4\2\26\27))\3\2\'(\3\2!&\3\2\26\27\4\2\20\25))\3\2+,\4\2--\67\67\u01d8"+
		"\2U\3\2\2\2\4Z\3\2\2\2\6]\3\2\2\2\b`\3\2\2\2\nd\3\2\2\2\fs\3\2\2\2\16"+
		"|\3\2\2\2\20\u0080\3\2\2\2\22\u0095\3\2\2\2\24\u00a0\3\2\2\2\26\u00b8"+
		"\3\2\2\2\30\u00c6\3\2\2\2\32\u00c8\3\2\2\2\34\u00cf\3\2\2\2\36\u00d7\3"+
		"\2\2\2 \u00de\3\2\2\2\"\u0103\3\2\2\2$\u010e\3\2\2\2&\u012b\3\2\2\2(\u012f"+
		"\3\2\2\2*\u0139\3\2\2\2,\u0149\3\2\2\2.\u0151\3\2\2\2\60\u0159\3\2\2\2"+
		"\62\u016a\3\2\2\2\64\u018e\3\2\2\2\66\u01a8\3\2\2\28;\5\f\7\29;\5\20\t"+
		"\2:8\3\2\2\2:9\3\2\2\2:;\3\2\2\2;H\3\2\2\2<>\5\f\7\2=<\3\2\2\2>A\3\2\2"+
		"\2?=\3\2\2\2?@\3\2\2\2@I\3\2\2\2A?\3\2\2\2BD\5\n\6\2CB\3\2\2\2DG\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2H?\3\2\2\2HE\3\2\2\2IV\3\2\2"+
		"\2JL\5\n\6\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NV\3\2\2\2OQ\5\36"+
		"\20\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TV\7\2\2\3U:\3"+
		"\2\2\2UK\3\2\2\2UP\3\2\2\2UT\3\2\2\2V\3\3\2\2\2WY\5\36\20\2XW\3\2\2\2"+
		"Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\5\3\2\2\2\\Z\3\2\2\2]^\t\2\2\2^\7\3\2"+
		"\2\2_a\7-\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\t\3\2\2\2df\7\3"+
		"\2\2eg\5\26\f\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hj\7\62\2\2ik\5\30\r\2ji"+
		"\3\2\2\2jk\3\2\2\2kl\3\2\2\2lp\5\6\4\2mo\5\36\20\2nm\3\2\2\2or\3\2\2\2"+
		"pn\3\2\2\2pq\3\2\2\2q\13\3\2\2\2rp\3\2\2\2st\5\n\6\2tu\7\7\2\2uy\5\b\5"+
		"\2vx\7-\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\r\3\2\2\2{y\3\2\2"+
		"\2|}\5\n\6\2}~\7\7\2\2~\177\5\6\4\2\177\17\3\2\2\2\u0080\u0081\7\4\2\2"+
		"\u0081\u0082\7\62\2\2\u0082\u0087\5\6\4\2\u0083\u0086\5\22\n\2\u0084\u0086"+
		"\5\24\13\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008d\7\7\2\2\u008b\u008e\7\2\2\3\u008c\u008e\5\6\4\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u0092\3\2\2\2\u008f\u0091\7-"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\21\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\5\2"+
		"\2\u0096\u009a\5\6\4\2\u0097\u0099\5\32\16\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\7\2\2\u009e\u009f\5\6\4\2\u009f"+
		"\23\3\2\2\2\u00a0\u00a1\7\6\2\2\u00a1\u00a5\5\6\4\2\u00a2\u00a4\5\16\b"+
		"\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\7\2\2\u00a9"+
		"\u00aa\5\6\4\2\u00aa\25\3\2\2\2\u00ab\u00ac\7\62\2\2\u00ac\u00b9\7\17"+
		"\2\2\u00ad\u00ae\7 \2\2\u00ae\u00b3\7\62\2\2\u00af\u00b0\7\66\2\2\u00b0"+
		"\u00b2\7\62\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\7\64\2\2\u00b7\u00b9\7\17\2\2\u00b8\u00ab\3\2\2\2\u00b8\u00ad\3"+
		"\2\2\2\u00b9\27\3\2\2\2\u00ba\u00bb\7\35\2\2\u00bb\u00c0\7\62\2\2\u00bc"+
		"\u00bd\7\66\2\2\u00bd\u00bf\7\62\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c7\7\36\2\2\u00c4\u00c5\7\35\2\2\u00c5\u00c7\7"+
		"\36\2\2\u00c6\u00ba\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\31\3\2\2\2\u00c8"+
		"\u00cb\7\62\2\2\u00c9\u00ca\7\17\2\2\u00ca\u00cc\5\62\32\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\5\6\4\2\u00ce"+
		"\33\3\2\2\2\u00cf\u00d4\7\62\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d3\7\62"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\35\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00db\5*\26"+
		"\2\u00d8\u00da\5\6\4\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\37\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\7\b\2\2\u00df\u00e0\5\62\32\2\u00e0\u00e4\5\6\4\2\u00e1\u00e3\5"+
		"\36\20\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00f2\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\t"+
		"\2\2\u00e8\u00e9\5\62\32\2\u00e9\u00ed\5\6\4\2\u00ea\u00ec\5\36\20\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00ff\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\7\n\2\2\u00f6\u00f8\5\6\4\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00fb\5\36"+
		"\20\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u00f5\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\7\2\2\u0102"+
		"!\3\2\2\2\u0103\u0104\7\13\2\2\u0104\u0105\5\62\32\2\u0105\u0109\5\6\4"+
		"\2\u0106\u0108\5\36\20\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010d\7\7\2\2\u010d#\3\2\2\2\u010e\u010f\7\f\2\2\u010f\u0110"+
		"\5\62\32\2\u0110\u011c\5\6\4\2\u0111\u0112\7\r\2\2\u0112\u0113\5\62\32"+
		"\2\u0113\u0117\5\6\4\2\u0114\u0116\5\36\20\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u0111\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0127\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0120\7\16\2\2\u0120\u0124\5\6\4\2\u0121\u0123\5\36\20\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u011f\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\7\2\2\u012a%\3\2\2\2"+
		"\u012b\u012c\5\34\17\2\u012c\u012d\7\17\2\2\u012d\u012e\5\62\32\2\u012e"+
		"\'\3\2\2\2\u012f\u0130\5,\27\2\u0130\u0131\7\17\2\2\u0131\u0132\5\62\32"+
		"\2\u0132)\3\2\2\2\u0133\u013a\5&\24\2\u0134\u013a\5(\25\2\u0135\u013a"+
		"\5 \21\2\u0136\u013a\5\"\22\2\u0137\u013a\5$\23\2\u0138\u013a\5\62\32"+
		"\2\u0139\u0133\3\2\2\2\u0139\u0134\3\2\2\2\u0139\u0135\3\2\2\2\u0139\u0136"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a+\3\2\2\2\u013b"+
		"\u013c\5\34\17\2\u013c\u013d\7\35\2\2\u013d\u013e\5\66\34\2\u013e\u013f"+
		"\7\36\2\2\u013f\u014a\3\2\2\2\u0140\u0141\5\34\17\2\u0141\u0142\7\35\2"+
		"\2\u0142\u0143\7*\2\2\u0143\u0144\7\36\2\2\u0144\u014a\3\2\2\2\u0145\u0146"+
		"\5\34\17\2\u0146\u0147\7\35\2\2\u0147\u0148\7\36\2\2\u0148\u014a\3\2\2"+
		"\2\u0149\u013b\3\2\2\2\u0149\u0140\3\2\2\2\u0149\u0145\3\2\2\2\u014a-"+
		"\3\2\2\2\u014b\u014c\7 \2\2\u014c\u014d\5\66\34\2\u014d\u014e\7\64\2\2"+
		"\u014e\u0152\3\2\2\2\u014f\u0150\7 \2\2\u0150\u0152\7\64\2\2\u0151\u014b"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0152/\3\2\2\2\u0153\u0154\7\37\2\2\u0154"+
		"\u0155\5\66\34\2\u0155\u0156\7\65\2\2\u0156\u015a\3\2\2\2\u0157\u0158"+
		"\7\37\2\2\u0158\u015a\7\65\2\2\u0159\u0153\3\2\2\2\u0159\u0157\3\2\2\2"+
		"\u015a\61\3\2\2\2\u015b\u015c\b\32\1\2\u015c\u016b\5,\27\2\u015d\u015e"+
		"\t\3\2\2\u015e\u016b\5\62\32\23\u015f\u016b\5\34\17\2\u0160\u016b\7/\2"+
		"\2\u0161\u016b\7\60\2\2\u0162\u016b\7\61\2\2\u0163\u016b\7\63\2\2\u0164"+
		"\u016b\5.\30\2\u0165\u016b\5\60\31\2\u0166\u0167\7\35\2\2\u0167\u0168"+
		"\5\62\32\2\u0168\u0169\7\36\2\2\u0169\u016b\3\2\2\2\u016a\u015b\3\2\2"+
		"\2\u016a\u015d\3\2\2\2\u016a\u015f\3\2\2\2\u016a\u0160\3\2\2\2\u016a\u0161"+
		"\3\2\2\2\u016a\u0162\3\2\2\2\u016a\u0163\3\2\2\2\u016a\u0164\3\2\2\2\u016a"+
		"\u0165\3\2\2\2\u016a\u0166\3\2\2\2\u016b\u018b\3\2\2\2\u016c\u016d\f\24"+
		"\2\2\u016d\u016e\t\4\2\2\u016e\u018a\5\62\32\25\u016f\u0170\f\22\2\2\u0170"+
		"\u0171\t\5\2\2\u0171\u018a\5\62\32\23\u0172\u0173\f\21\2\2\u0173\u0174"+
		"\t\6\2\2\u0174\u018a\5\62\32\22\u0175\u0176\f\20\2\2\u0176\u0177\7*\2"+
		"\2\u0177\u018a\5\62\32\21\u0178\u0179\f\17\2\2\u0179\u017a\t\7\2\2\u017a"+
		"\u018a\5\62\32\20\u017b\u017c\f\16\2\2\u017c\u017d\7\31\2\2\u017d\u018a"+
		"\5\62\32\17\u017e\u017f\f\r\2\2\u017f\u0180\7\32\2\2\u0180\u018a\5\62"+
		"\32\16\u0181\u0182\f\f\2\2\u0182\u0183\7\33\2\2\u0183\u018a\5\62\32\r"+
		"\u0184\u0185\f\13\2\2\u0185\u0186\7\34\2\2\u0186\u018a\5\62\32\f\u0187"+
		"\u0188\f\25\2\2\u0188\u018a\t\b\2\2\u0189\u016c\3\2\2\2\u0189\u016f\3"+
		"\2\2\2\u0189\u0172\3\2\2\2\u0189\u0175\3\2\2\2\u0189\u0178\3\2\2\2\u0189"+
		"\u017b\3\2\2\2\u0189\u017e\3\2\2\2\u0189\u0181\3\2\2\2\u0189\u0184\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\63\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0193\5\62\32"+
		"\2\u018f\u0190\7\66\2\2\u0190\u0192\5\62\32\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\65\3\2\2"+
		"\2\u0195\u0193\3\2\2\2\u0196\u019d\5\62\32\2\u0197\u0199\7\66\2\2\u0198"+
		"\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\5\62"+
		"\32\2\u019b\u0198\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01a9\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a5\5\62"+
		"\32\2\u01a1\u01a2\t\t\2\2\u01a2\u01a4\5\62\32\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a9\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a8\u0196\3\2\2\2\u01a8\u01a0\3\2\2\2\u01a9"+
		"\67\3\2\2\2\63:?EHMRUZbfjpy\u0085\u0087\u008d\u0092\u009a\u00a5\u00b3"+
		"\u00b8\u00c0\u00c6\u00cb\u00d4\u00db\u00e4\u00ed\u00f2\u00f7\u00fc\u00ff"+
		"\u0109\u0117\u011c\u0124\u0127\u0139\u0149\u0151\u0159\u016a\u0189\u018b"+
		"\u0193\u0198\u019d\u01a5\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}