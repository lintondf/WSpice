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
		ELSE=8, FOR=9, WHILE=10, SWITCH=11, CASE=12, OTHERWISE=13, EQUALS=14, 
		EQUALTO=15, NOTEQUALTO=16, GT=17, LT=18, GE=19, LE=20, PLUS=21, MINUS=22, 
		DOT=23, VECAND=24, VECOR=25, SCALAND=26, SCALOR=27, LPAREN=28, RPAREN=29, 
		LBRACE=30, LBRACK=31, MTIMES=32, TIMES=33, RDIVIDE=34, LDIVIDE=35, MRDIVIDE=36, 
		MLDIVIDE=37, POW=38, MPOW=39, NOT=40, COLON=41, TRANS=42, CTRANS=43, NL=44, 
		COMMENT=45, INT=46, FLOAT=47, SCI=48, ID=49, STRING=50, RBRACK=51, RBRACE=52, 
		COMMA=53, SEMI=54, WS=55;
	public static final int
		RULE_fileDecl = 0, RULE_script = 1, RULE_endStat = 2, RULE_endStatNL = 3, 
		RULE_partialFunctionDecl = 4, RULE_functionDecl = 5, RULE_methodDecl = 6, 
		RULE_classDecl = 7, RULE_propBlockDecl = 8, RULE_methodBlockDecl = 9, 
		RULE_outArgs = 10, RULE_inArgs = 11, RULE_prop = 12, RULE_idRef = 13, 
		RULE_statBlock = 14, RULE_ifStat = 15, RULE_whileStat = 16, RULE_forStat = 17, 
		RULE_caseStat = 18, RULE_scalarAssignStat = 19, RULE_arrayAssignStat = 20, 
		RULE_stat = 21, RULE_arrayRef = 22, RULE_arrayExpr = 23, RULE_cellExpr = 24, 
		RULE_expr = 25, RULE_exprList = 26, RULE_exprArrayList = 27;
	public static final String[] ruleNames = {
		"fileDecl", "script", "endStat", "endStatNL", "partialFunctionDecl", "functionDecl", 
		"methodDecl", "classDecl", "propBlockDecl", "methodBlockDecl", "outArgs", 
		"inArgs", "prop", "idRef", "statBlock", "ifStat", "whileStat", "forStat", 
		"caseStat", "scalarAssignStat", "arrayAssignStat", "stat", "arrayRef", 
		"arrayExpr", "cellExpr", "expr", "exprList", "exprArrayList"
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(56);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(57);
					classDecl();
					}
					break;
				}
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==FUNCTION) {
						{
						{
						setState(60);
						functionDecl();
						}
						}
						setState(65);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==FUNCTION) {
						{
						{
						setState(66);
						partialFunctionDecl();
						}
						}
						setState(71);
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
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					partialFunctionDecl();
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FUNCTION );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					statBlock();
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0) );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
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
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(87);
				statBlock();
				}
				}
				setState(92);
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
			setState(93);
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
			setState(96); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(95);
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98); 
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
			setState(100);
			match(FUNCTION);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(101);
				outArgs();
				}
				break;
			}
			setState(104);
			match(ID);
			setState(106);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(105);
				inArgs();
				}
			}

			setState(108);
			endStat();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(109);
				statBlock();
				}
				}
				setState(114);
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
			setState(115);
			partialFunctionDecl();
			setState(116);
			match(END);
			setState(117);
			endStatNL();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(118);
				match(NL);
				}
				}
				setState(123);
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
			setState(124);
			partialFunctionDecl();
			setState(125);
			match(END);
			setState(126);
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
			setState(128);
			match(CLASSDEF);
			setState(129);
			match(ID);
			setState(130);
			endStat();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROPERTIES || _la==METHODS) {
				{
				setState(133);
				switch (_input.LA(1)) {
				case PROPERTIES:
					{
					setState(131);
					propBlockDecl();
					}
					break;
				case METHODS:
					{
					setState(132);
					methodBlockDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(END);
			setState(141);
			switch (_input.LA(1)) {
			case EOF:
				{
				setState(139);
				match(EOF);
				}
				break;
			case NL:
			case COMMA:
			case SEMI:
				{
				setState(140);
				endStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(143);
				match(NL);
				}
				}
				setState(148);
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
			setState(149);
			match(PROPERTIES);
			setState(150);
			endStat();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(151);
				prop();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(END);
			setState(158);
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
			setState(160);
			match(METHODS);
			setState(161);
			endStat();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(162);
				methodDecl();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(END);
			setState(169);
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
			setState(184);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ID);
				setState(172);
				match(EQUALS);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(LBRACK);
				setState(174);
				match(ID);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(175);
					match(COMMA);
					setState(176);
					match(ID);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				match(RBRACK);
				setState(183);
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(LPAREN);
				setState(187);
				match(ID);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(188);
					match(COMMA);
					setState(189);
					match(ID);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(LPAREN);
				setState(197);
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
			setState(200);
			match(ID);
			setState(203);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(201);
				match(EQUALS);
				setState(202);
				expr(0);
				}
			}

			setState(205);
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
			setState(207);
			match(ID);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(DOT);
					setState(209);
					match(ID);
					}
					} 
				}
				setState(214);
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
			setState(215);
			stat();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << COMMA) | (1L << SEMI))) != 0)) {
				{
				{
				setState(216);
				endStat();
				}
				}
				setState(221);
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
			setState(222);
			match(IF);
			setState(223);
			expr(0);
			setState(224);
			endStat();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(225);
				statBlock();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(231);
				match(ELSEIF);
				setState(232);
				expr(0);
				setState(233);
				endStat();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(234);
					statBlock();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(245);
				match(ELSE);
				setState(247);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << COMMA) | (1L << SEMI))) != 0)) {
					{
					setState(246);
					endStat();
					}
				}

				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(249);
					statBlock();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(257);
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
			setState(259);
			match(WHILE);
			setState(260);
			expr(0);
			setState(261);
			endStat();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(262);
				statBlock();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
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

	public static class ForStatContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MATLABParser.FOR, 0); }
		public IdRefContext idRef() {
			return getRuleContext(IdRefContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(MATLABParser.EQUALS, 0); }
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
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).enterForStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABParserListener ) ((MATLABParserListener)listener).exitForStat(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(FOR);
			setState(271);
			idRef();
			setState(272);
			match(EQUALS);
			setState(273);
			expr(0);
			setState(274);
			endStat();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(275);
				statBlock();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
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
		enterRule(_localctx, 36, RULE_caseStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(SWITCH);
			setState(284);
			expr(0);
			setState(285);
			endStat();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(286);
				match(CASE);
				setState(287);
				expr(0);
				setState(288);
				endStat();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(289);
					statBlock();
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(300);
				match(OTHERWISE);
				setState(301);
				endStat();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(302);
					statBlock();
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(310);
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
		enterRule(_localctx, 38, RULE_scalarAssignStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			idRef();
			setState(313);
			match(EQUALS);
			setState(314);
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
		enterRule(_localctx, 40, RULE_arrayAssignStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			arrayRef();
			setState(317);
			match(EQUALS);
			setState(318);
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
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
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
		enterRule(_localctx, 42, RULE_stat);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				scalarAssignStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				arrayAssignStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				ifStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				forStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				whileStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				caseStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(326);
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
		enterRule(_localctx, 44, RULE_arrayRef);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				idRef();
				setState(330);
				match(LPAREN);
				setState(331);
				exprArrayList();
				setState(332);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				idRef();
				setState(335);
				match(LPAREN);
				setState(336);
				match(COLON);
				setState(337);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				idRef();
				setState(340);
				match(LPAREN);
				setState(341);
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
		enterRule(_localctx, 46, RULE_arrayExpr);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(LBRACK);
				setState(346);
				exprArrayList();
				setState(347);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(LBRACK);
				setState(350);
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
		enterRule(_localctx, 48, RULE_cellExpr);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(LBRACE);
				setState(354);
				exprArrayList();
				setState(355);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(LBRACE);
				setState(358);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(362);
				arrayRef();
				}
				break;
			case 2:
				{
				setState(363);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(364);
				expr(17);
				}
				break;
			case 3:
				{
				setState(365);
				idRef();
				}
				break;
			case 4:
				{
				setState(366);
				match(INT);
				}
				break;
			case 5:
				{
				setState(367);
				match(FLOAT);
				}
				break;
			case 6:
				{
				setState(368);
				match(SCI);
				}
				break;
			case 7:
				{
				setState(369);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(370);
				arrayExpr();
				}
				break;
			case 9:
				{
				setState(371);
				cellExpr();
				}
				break;
			case 10:
				{
				setState(372);
				match(LPAREN);
				setState(373);
				expr(0);
				setState(374);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(407);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(378);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(379);
						_la = _input.LA(1);
						if ( !(_la==POW || _la==MPOW) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(380);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(381);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(382);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MTIMES) | (1L << TIMES) | (1L << RDIVIDE) | (1L << LDIVIDE) | (1L << MRDIVIDE) | (1L << MLDIVIDE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(383);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(384);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(385);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(386);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(387);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(388);
						match(COLON);
						setState(389);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(390);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(391);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALTO) | (1L << NOTEQUALTO) | (1L << GT) | (1L << LT) | (1L << GE) | (1L << LE) | (1L << NOT))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(392);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(393);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(394);
						match(VECAND);
						setState(395);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(396);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(397);
						match(VECOR);
						setState(398);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(399);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(400);
						match(SCALAND);
						setState(401);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(402);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(403);
						match(SCALOR);
						setState(404);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(405);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(406);
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
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 52, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			expr(0);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(413);
				match(COMMA);
				setState(414);
				expr(0);
				}
				}
				setState(419);
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
		enterRule(_localctx, 54, RULE_exprArrayList);
		int _la;
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new HcatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				expr(0);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << SCI) | (1L << ID) | (1L << STRING) | (1L << COMMA))) != 0)) {
					{
					{
					setState(422);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(421);
						match(COMMA);
						}
					}

					setState(424);
					expr(0);
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new VcatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				expr(0);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL || _la==SEMI) {
					{
					{
					setState(431);
					_la = _input.LA(1);
					if ( !(_la==NL || _la==SEMI) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(432);
					expr(0);
					}
					}
					setState(437);
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
		case 25:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u01bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\5\2=\n\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\5\2K\n\2\3\2\6\2N\n\2\r\2"+
		"\16\2O\3\2\6\2S\n\2\r\2\16\2T\3\2\5\2X\n\2\3\3\7\3[\n\3\f\3\16\3^\13\3"+
		"\3\4\3\4\3\5\6\5c\n\5\r\5\16\5d\3\6\3\6\5\6i\n\6\3\6\3\6\5\6m\n\6\3\6"+
		"\3\6\7\6q\n\6\f\6\16\6t\13\6\3\7\3\7\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u0088\n\t\f\t\16\t\u008b\13\t\3"+
		"\t\3\t\3\t\5\t\u0090\n\t\3\t\7\t\u0093\n\t\f\t\16\t\u0096\13\t\3\n\3\n"+
		"\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13"+
		"\u00a6\n\13\f\13\16\13\u00a9\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3\f\3\f\5\f\u00bb\n\f\3\r\3\r\3"+
		"\r\3\r\7\r\u00c1\n\r\f\r\16\r\u00c4\13\r\3\r\3\r\3\r\5\r\u00c9\n\r\3\16"+
		"\3\16\3\16\5\16\u00ce\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u00d5\n\17\f"+
		"\17\16\17\u00d8\13\17\3\20\3\20\7\20\u00dc\n\20\f\20\16\20\u00df\13\20"+
		"\3\21\3\21\3\21\3\21\7\21\u00e5\n\21\f\21\16\21\u00e8\13\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00ee\n\21\f\21\16\21\u00f1\13\21\7\21\u00f3\n\21\f\21"+
		"\16\21\u00f6\13\21\3\21\3\21\5\21\u00fa\n\21\3\21\7\21\u00fd\n\21\f\21"+
		"\16\21\u0100\13\21\5\21\u0102\n\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22"+
		"\u010a\n\22\f\22\16\22\u010d\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u0117\n\23\f\23\16\23\u011a\13\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0125\n\24\f\24\16\24\u0128\13\24\7\24\u012a"+
		"\n\24\f\24\16\24\u012d\13\24\3\24\3\24\3\24\7\24\u0132\n\24\f\24\16\24"+
		"\u0135\13\24\5\24\u0137\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u014a\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u015a"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0162\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u016a\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u017b\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u019a\n\33\f\33"+
		"\16\33\u019d\13\33\3\34\3\34\3\34\7\34\u01a2\n\34\f\34\16\34\u01a5\13"+
		"\34\3\35\3\35\5\35\u01a9\n\35\3\35\7\35\u01ac\n\35\f\35\16\35\u01af\13"+
		"\35\3\35\3\35\3\35\7\35\u01b4\n\35\f\35\16\35\u01b7\13\35\5\35\u01b9\n"+
		"\35\3\35\2\3\64\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668\2\n\4\2..\678\4\2\27\30**\3\2()\3\2\"\'\3\2\27\30\4\2\21\26"+
		"**\3\2,-\4\2..88\u01e9\2W\3\2\2\2\4\\\3\2\2\2\6_\3\2\2\2\bb\3\2\2\2\n"+
		"f\3\2\2\2\fu\3\2\2\2\16~\3\2\2\2\20\u0082\3\2\2\2\22\u0097\3\2\2\2\24"+
		"\u00a2\3\2\2\2\26\u00ba\3\2\2\2\30\u00c8\3\2\2\2\32\u00ca\3\2\2\2\34\u00d1"+
		"\3\2\2\2\36\u00d9\3\2\2\2 \u00e0\3\2\2\2\"\u0105\3\2\2\2$\u0110\3\2\2"+
		"\2&\u011d\3\2\2\2(\u013a\3\2\2\2*\u013e\3\2\2\2,\u0149\3\2\2\2.\u0159"+
		"\3\2\2\2\60\u0161\3\2\2\2\62\u0169\3\2\2\2\64\u017a\3\2\2\2\66\u019e\3"+
		"\2\2\28\u01b8\3\2\2\2:=\5\f\7\2;=\5\20\t\2<:\3\2\2\2<;\3\2\2\2<=\3\2\2"+
		"\2=J\3\2\2\2>@\5\f\7\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BK\3\2\2"+
		"\2CA\3\2\2\2DF\5\n\6\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2JA\3\2\2\2JG\3\2\2\2KX\3\2\2\2LN\5\n\6\2ML\3\2\2\2NO\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2PX\3\2\2\2QS\5\36\20\2RQ\3\2\2\2ST\3\2\2\2TR\3\2"+
		"\2\2TU\3\2\2\2UX\3\2\2\2VX\7\2\2\3W<\3\2\2\2WM\3\2\2\2WR\3\2\2\2WV\3\2"+
		"\2\2X\3\3\2\2\2Y[\5\36\20\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2"+
		"]\5\3\2\2\2^\\\3\2\2\2_`\t\2\2\2`\7\3\2\2\2ac\7.\2\2ba\3\2\2\2cd\3\2\2"+
		"\2db\3\2\2\2de\3\2\2\2e\t\3\2\2\2fh\7\3\2\2gi\5\26\f\2hg\3\2\2\2hi\3\2"+
		"\2\2ij\3\2\2\2jl\7\63\2\2km\5\30\r\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2nr\5"+
		"\6\4\2oq\5\36\20\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\13\3\2\2\2"+
		"tr\3\2\2\2uv\5\n\6\2vw\7\7\2\2w{\5\b\5\2xz\7.\2\2yx\3\2\2\2z}\3\2\2\2"+
		"{y\3\2\2\2{|\3\2\2\2|\r\3\2\2\2}{\3\2\2\2~\177\5\n\6\2\177\u0080\7\7\2"+
		"\2\u0080\u0081\5\6\4\2\u0081\17\3\2\2\2\u0082\u0083\7\4\2\2\u0083\u0084"+
		"\7\63\2\2\u0084\u0089\5\6\4\2\u0085\u0088\5\22\n\2\u0086\u0088\5\24\13"+
		"\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008f\7\7\2\2\u008d\u0090\7\2\2\3\u008e\u0090\5\6\4\2\u008f\u008d\3\2"+
		"\2\2\u008f\u008e\3\2\2\2\u0090\u0094\3\2\2\2\u0091\u0093\7.\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\21\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\5\2\2\u0098\u009c"+
		"\5\6\4\2\u0099\u009b\5\32\16\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a0\7\7\2\2\u00a0\u00a1\5\6\4\2\u00a1\23\3\2\2\2\u00a2"+
		"\u00a3\7\6\2\2\u00a3\u00a7\5\6\4\2\u00a4\u00a6\5\16\b\2\u00a5\u00a4\3"+
		"\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac\5\6"+
		"\4\2\u00ac\25\3\2\2\2\u00ad\u00ae\7\63\2\2\u00ae\u00bb\7\20\2\2\u00af"+
		"\u00b0\7!\2\2\u00b0\u00b5\7\63\2\2\u00b1\u00b2\7\67\2\2\u00b2\u00b4\7"+
		"\63\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\65"+
		"\2\2\u00b9\u00bb\7\20\2\2\u00ba\u00ad\3\2\2\2\u00ba\u00af\3\2\2\2\u00bb"+
		"\27\3\2\2\2\u00bc\u00bd\7\36\2\2\u00bd\u00c2\7\63\2\2\u00be\u00bf\7\67"+
		"\2\2\u00bf\u00c1\7\63\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c9\7\37\2\2\u00c6\u00c7\7\36\2\2\u00c7\u00c9\7\37\2\2\u00c8"+
		"\u00bc\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\31\3\2\2\2\u00ca\u00cd\7\63\2"+
		"\2\u00cb\u00cc\7\20\2\2\u00cc\u00ce\5\64\33\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5\6\4\2\u00d0\33\3\2\2"+
		"\2\u00d1\u00d6\7\63\2\2\u00d2\u00d3\7\31\2\2\u00d3\u00d5\7\63\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\35\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dd\5,\27\2\u00da\u00dc"+
		"\5\6\4\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\37\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\b\2"+
		"\2\u00e1\u00e2\5\64\33\2\u00e2\u00e6\5\6\4\2\u00e3\u00e5\5\36\20\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00f4\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\t\2\2\u00ea"+
		"\u00eb\5\64\33\2\u00eb\u00ef\5\6\4\2\u00ec\u00ee\5\36\20\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00e9\3\2\2\2\u00f3\u00f6\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u0101\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00f9\7\n\2\2\u00f8\u00fa\5\6\4\2\u00f9\u00f8\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fd\5\36\20\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u00f7\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7\7\2\2\u0104!\3\2\2\2"+
		"\u0105\u0106\7\f\2\2\u0106\u0107\5\64\33\2\u0107\u010b\5\6\4\2\u0108\u010a"+
		"\5\36\20\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2"+
		"\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f"+
		"\7\7\2\2\u010f#\3\2\2\2\u0110\u0111\7\13\2\2\u0111\u0112\5\34\17\2\u0112"+
		"\u0113\7\20\2\2\u0113\u0114\5\64\33\2\u0114\u0118\5\6\4\2\u0115\u0117"+
		"\5\36\20\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2"+
		"\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c"+
		"\7\7\2\2\u011c%\3\2\2\2\u011d\u011e\7\r\2\2\u011e\u011f\5\64\33\2\u011f"+
		"\u012b\5\6\4\2\u0120\u0121\7\16\2\2\u0121\u0122\5\64\33\2\u0122\u0126"+
		"\5\6\4\2\u0123\u0125\5\36\20\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\u0120\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u0136\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\17"+
		"\2\2\u012f\u0133\5\6\4\2\u0130\u0132\5\36\20\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u012e\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\7\7\2\2\u0139\'\3\2\2\2\u013a\u013b\5\34\17"+
		"\2\u013b\u013c\7\20\2\2\u013c\u013d\5\64\33\2\u013d)\3\2\2\2\u013e\u013f"+
		"\5.\30\2\u013f\u0140\7\20\2\2\u0140\u0141\5\64\33\2\u0141+\3\2\2\2\u0142"+
		"\u014a\5(\25\2\u0143\u014a\5*\26\2\u0144\u014a\5 \21\2\u0145\u014a\5$"+
		"\23\2\u0146\u014a\5\"\22\2\u0147\u014a\5&\24\2\u0148\u014a\5\64\33\2\u0149"+
		"\u0142\3\2\2\2\u0149\u0143\3\2\2\2\u0149\u0144\3\2\2\2\u0149\u0145\3\2"+
		"\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a"+
		"-\3\2\2\2\u014b\u014c\5\34\17\2\u014c\u014d\7\36\2\2\u014d\u014e\58\35"+
		"\2\u014e\u014f\7\37\2\2\u014f\u015a\3\2\2\2\u0150\u0151\5\34\17\2\u0151"+
		"\u0152\7\36\2\2\u0152\u0153\7+\2\2\u0153\u0154\7\37\2\2\u0154\u015a\3"+
		"\2\2\2\u0155\u0156\5\34\17\2\u0156\u0157\7\36\2\2\u0157\u0158\7\37\2\2"+
		"\u0158\u015a\3\2\2\2\u0159\u014b\3\2\2\2\u0159\u0150\3\2\2\2\u0159\u0155"+
		"\3\2\2\2\u015a/\3\2\2\2\u015b\u015c\7!\2\2\u015c\u015d\58\35\2\u015d\u015e"+
		"\7\65\2\2\u015e\u0162\3\2\2\2\u015f\u0160\7!\2\2\u0160\u0162\7\65\2\2"+
		"\u0161\u015b\3\2\2\2\u0161\u015f\3\2\2\2\u0162\61\3\2\2\2\u0163\u0164"+
		"\7 \2\2\u0164\u0165\58\35\2\u0165\u0166\7\66\2\2\u0166\u016a\3\2\2\2\u0167"+
		"\u0168\7 \2\2\u0168\u016a\7\66\2\2\u0169\u0163\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u016a\63\3\2\2\2\u016b\u016c\b\33\1\2\u016c\u017b\5.\30\2\u016d\u016e"+
		"\t\3\2\2\u016e\u017b\5\64\33\23\u016f\u017b\5\34\17\2\u0170\u017b\7\60"+
		"\2\2\u0171\u017b\7\61\2\2\u0172\u017b\7\62\2\2\u0173\u017b\7\64\2\2\u0174"+
		"\u017b\5\60\31\2\u0175\u017b\5\62\32\2\u0176\u0177\7\36\2\2\u0177\u0178"+
		"\5\64\33\2\u0178\u0179\7\37\2\2\u0179\u017b\3\2\2\2\u017a\u016b\3\2\2"+
		"\2\u017a\u016d\3\2\2\2\u017a\u016f\3\2\2\2\u017a\u0170\3\2\2\2\u017a\u0171"+
		"\3\2\2\2\u017a\u0172\3\2\2\2\u017a\u0173\3\2\2\2\u017a\u0174\3\2\2\2\u017a"+
		"\u0175\3\2\2\2\u017a\u0176\3\2\2\2\u017b\u019b\3\2\2\2\u017c\u017d\f\24"+
		"\2\2\u017d\u017e\t\4\2\2\u017e\u019a\5\64\33\25\u017f\u0180\f\22\2\2\u0180"+
		"\u0181\t\5\2\2\u0181\u019a\5\64\33\23\u0182\u0183\f\21\2\2\u0183\u0184"+
		"\t\6\2\2\u0184\u019a\5\64\33\22\u0185\u0186\f\20\2\2\u0186\u0187\7+\2"+
		"\2\u0187\u019a\5\64\33\21\u0188\u0189\f\17\2\2\u0189\u018a\t\7\2\2\u018a"+
		"\u019a\5\64\33\20\u018b\u018c\f\16\2\2\u018c\u018d\7\32\2\2\u018d\u019a"+
		"\5\64\33\17\u018e\u018f\f\r\2\2\u018f\u0190\7\33\2\2\u0190\u019a\5\64"+
		"\33\16\u0191\u0192\f\f\2\2\u0192\u0193\7\34\2\2\u0193\u019a\5\64\33\r"+
		"\u0194\u0195\f\13\2\2\u0195\u0196\7\35\2\2\u0196\u019a\5\64\33\f\u0197"+
		"\u0198\f\25\2\2\u0198\u019a\t\b\2\2\u0199\u017c\3\2\2\2\u0199\u017f\3"+
		"\2\2\2\u0199\u0182\3\2\2\2\u0199\u0185\3\2\2\2\u0199\u0188\3\2\2\2\u0199"+
		"\u018b\3\2\2\2\u0199\u018e\3\2\2\2\u0199\u0191\3\2\2\2\u0199\u0194\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\65\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a3\5\64\33"+
		"\2\u019f\u01a0\7\67\2\2\u01a0\u01a2\5\64\33\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\67\3\2\2"+
		"\2\u01a5\u01a3\3\2\2\2\u01a6\u01ad\5\64\33\2\u01a7\u01a9\7\67\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\5\64"+
		"\33\2\u01ab\u01a8\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b9\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b5\5\64"+
		"\33\2\u01b1\u01b2\t\t\2\2\u01b2\u01b4\5\64\33\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2"+
		"\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01a6\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b9"+
		"9\3\2\2\2\64<AGJOTW\\dhlr{\u0087\u0089\u008f\u0094\u009c\u00a7\u00b5\u00ba"+
		"\u00c2\u00c8\u00cd\u00d6\u00dd\u00e6\u00ef\u00f4\u00f9\u00fe\u0101\u010b"+
		"\u0118\u0126\u012b\u0133\u0136\u0149\u0159\u0161\u0169\u017a\u0199\u019b"+
		"\u01a3\u01a8\u01ad\u01b5\u01b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}