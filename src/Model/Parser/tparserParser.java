/*
 * BSD License
 *
 * Open Source Fixedpoint Model-Checker Graphical User Interface version 2019
 *
 * (C) Copyright �lfur J�hann Edvardsson 2019
 * (C) Copyright Veronica Julie Lodskov Hoffmann 2019
 *
 * All Rights Reserved.
 *
*/

package Model.Parser;
// Generated from tparser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tparserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, COLON=33, EQ=34, STAR=35, NEQ=36, SEMI=37, HASH=38, ARROW=39, 
		VAR=40, NUM=41, COMMENT=42, WS=43;
	public static final int
		RULE_start = 0, RULE_begin = 1, RULE_op = 2, RULE_history = 3, RULE_whe = 4, 
		RULE_wheSym = 5, RULE_con = 6, RULE_ikst = 7, RULE_postp = 8, RULE_com = 9, 
		RULE_name = 10, RULE_trace = 11, RULE_act = 12, RULE_w2w = 13, RULE_c = 14, 
		RULE_w = 15, RULE_m = 16, RULE_norm = 17, RULE_li = 18, RULE_ver = 19, 
		RULE_tex = 20;
	public static final String[] ruleNames = {
		"start", "begin", "op", "history", "whe", "wheSym", "con", "ikst", "postp", 
		"com", "name", "trace", "act", "w2w", "c", "w", "m", "norm", "li", "ver", 
		"tex"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Open-Source Fixedpoint Model-Checker version'", "'SUMMARY'", "'BACKEND'", 
		"'COMMENTS'", "'state'", "'postponed'", "'ik'", "'Constraints'", "'where'", 
		"'('", "')'", "'True'", "'False'", "'/'", "'and'", "'or'", "'_'", "'.'", 
		"'-'", "','", "'step'", "'{'", "'}'", "'{|'", "'|}'", "'['", "']'", "'[]'", 
		"'{}'", "'ATTACK'", "'NO'", "'FOUND'", "':'", "'='", "'*'", "'!='", "';'", 
		"'#'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "COLON", "EQ", "STAR", 
		"NEQ", "SEMI", "HASH", "ARROW", "VAR", "NUM", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "tparser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tparserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tparserParser.EOF, 0); }
		public List<BeginContext> begin() {
			return getRuleContexts(BeginContext.class);
		}
		public BeginContext begin(int i) {
			return getRuleContext(BeginContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				begin();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << VAR) | (1L << NUM))) != 0) );
			setState(47);
			match(EOF);
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

	public static class BeginContext extends ParserRuleContext {
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
	 
		public BeginContext() { }
		public void copyFrom(BeginContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunComContext extends BeginContext {
		public Token t;
		public ComContext fun;
		public List<TerminalNode> COLON() { return getTokens(tparserParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(tparserParser.COLON, i);
		}
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(tparserParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(tparserParser.VAR, i);
		}
		public FunComContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFunCom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunConContext extends BeginContext {
		public Token t;
		public ConContext fun;
		public TerminalNode COLON() { return getToken(tparserParser.COLON, 0); }
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public FunConContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFunCon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunOpContext extends BeginContext {
		public OpContext fun;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FunOpContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFunOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunIkContext extends BeginContext {
		public Token t;
		public IkstContext fun;
		public TerminalNode COLON() { return getToken(tparserParser.COLON, 0); }
		public IkstContext ikst() {
			return getRuleContext(IkstContext.class,0);
		}
		public FunIkContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFunIk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunVerContext extends BeginContext {
		public Token t;
		public VerContext fun;
		public VerContext ver() {
			return getRuleContext(VerContext.class,0);
		}
		public FunVerContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFunVer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunHistoryContext extends BeginContext {
		public HistoryContext fun;
		public HistoryContext history() {
			return getRuleContext(HistoryContext.class,0);
		}
		public FunHistoryContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFunHistory(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunVer2Context extends BeginContext {
		public Token t;
		public Token t2;
		public VerContext fun;
		public TerminalNode COLON() { return getToken(tparserParser.COLON, 0); }
		public VerContext ver() {
			return getRuleContext(VerContext.class,0);
		}
		public FunVer2Context(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFunVer2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunWhereContext extends BeginContext {
		public Token t;
		public WheContext fun;
		public WheContext whe() {
			return getRuleContext(WheContext.class,0);
		}
		public FunWhereContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFunWhere(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunPostContext extends BeginContext {
		public Token t;
		public PostpContext fun;
		public TerminalNode COLON() { return getToken(tparserParser.COLON, 0); }
		public PostpContext postp() {
			return getRuleContext(PostpContext.class,0);
		}
		public FunPostContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFunPost(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunSumContext extends BeginContext {
		public Token t;
		public TexContext sum;
		public TerminalNode COLON() { return getToken(tparserParser.COLON, 0); }
		public TexContext tex() {
			return getRuleContext(TexContext.class,0);
		}
		public FunSumContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFunSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_begin);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new FunVerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((FunVerContext)_localctx).t = match(T__0);
				setState(50);
				((FunVerContext)_localctx).fun = ver();
				}
				break;
			case 2:
				_localctx = new FunSumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				((FunSumContext)_localctx).t = match(T__1);
				setState(52);
				match(COLON);
				setState(53);
				((FunSumContext)_localctx).sum = tex(0);
				}
				break;
			case 3:
				_localctx = new FunVer2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				((FunVer2Context)_localctx).t = match(T__2);
				setState(55);
				match(COLON);
				setState(56);
				((FunVer2Context)_localctx).t2 = match(T__0);
				setState(57);
				((FunVer2Context)_localctx).fun = ver();
				}
				break;
			case 4:
				_localctx = new FunComContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				((FunComContext)_localctx).t = match(T__3);
				setState(59);
				match(COLON);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR || _la==VAR) {
					{
					{
					setState(60);
					_la = _input.LA(1);
					if ( !(_la==STAR || _la==VAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(T__4);
				setState(67);
				match(COLON);
				setState(68);
				((FunComContext)_localctx).fun = com();
				}
				break;
			case 5:
				_localctx = new FunPostContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				((FunPostContext)_localctx).t = match(T__5);
				setState(70);
				match(COLON);
				setState(71);
				((FunPostContext)_localctx).fun = postp();
				}
				break;
			case 6:
				_localctx = new FunIkContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72);
					((FunIkContext)_localctx).t = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__4 || _la==T__6) ) {
						((FunIkContext)_localctx).t = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 || _la==T__6 );
				setState(77);
				match(COLON);
				setState(78);
				((FunIkContext)_localctx).fun = ikst();
				}
				break;
			case 7:
				_localctx = new FunConContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				((FunConContext)_localctx).t = match(T__7);
				setState(80);
				match(COLON);
				setState(81);
				((FunConContext)_localctx).fun = con();
				}
				break;
			case 8:
				_localctx = new FunWhereContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				((FunWhereContext)_localctx).t = match(T__8);
				setState(83);
				((FunWhereContext)_localctx).fun = whe();
				}
				break;
			case 9:
				_localctx = new FunHistoryContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				((FunHistoryContext)_localctx).fun = history();
				}
				break;
			case 10:
				_localctx = new FunOpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(85);
				((FunOpContext)_localctx).fun = op();
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	 
		public OpContext() { }
		public void copyFrom(OpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpMoreContext extends OpContext {
		public Token n;
		public ActContext fun;
		public OpContext fun2;
		public TerminalNode NUM() { return getToken(tparserParser.NUM, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public List<ActContext> act() {
			return getRuleContexts(ActContext.class);
		}
		public ActContext act(int i) {
			return getRuleContext(ActContext.class,i);
		}
		public OpMoreContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitOpMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpLastContext extends OpContext {
		public Token n;
		public ActContext fun;
		public TerminalNode NUM() { return getToken(tparserParser.NUM, 0); }
		public List<ActContext> act() {
			return getRuleContexts(ActContext.class);
		}
		public ActContext act(int i) {
			return getRuleContext(ActContext.class,i);
		}
		public OpLastContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitOpLast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_op);
		try {
			int _alt;
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new OpMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__9);
				setState(89);
				((OpMoreContext)_localctx).n = match(NUM);
				setState(90);
				match(T__10);
				setState(92); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(91);
						((OpMoreContext)_localctx).fun = act();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(94); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(96);
				((OpMoreContext)_localctx).fun2 = op();
				}
				break;
			case 2:
				_localctx = new OpLastContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__9);
				setState(99);
				((OpLastContext)_localctx).n = match(NUM);
				setState(100);
				match(T__10);
				setState(102); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(101);
						((OpLastContext)_localctx).fun = act();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(104); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class HistoryContext extends ParserRuleContext {
		public HistoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_history; }
	 
		public HistoryContext() { }
		public void copyFrom(HistoryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HistLastContext extends HistoryContext {
		public ActContext fun;
		public ActContext act() {
			return getRuleContext(ActContext.class,0);
		}
		public HistLastContext(HistoryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitHistLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HistMoreContext extends HistoryContext {
		public ActContext fun;
		public HistoryContext fun2;
		public ActContext act() {
			return getRuleContext(ActContext.class,0);
		}
		public HistoryContext history() {
			return getRuleContext(HistoryContext.class,0);
		}
		public HistMoreContext(HistoryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitHistMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HistoryContext history() throws RecognitionException {
		HistoryContext _localctx = new HistoryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_history);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new HistMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				((HistMoreContext)_localctx).fun = act();
				setState(109);
				((HistMoreContext)_localctx).fun2 = history();
				}
				break;
			case 2:
				_localctx = new HistLastContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((HistLastContext)_localctx).fun = act();
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

	public static class WheContext extends ParserRuleContext {
		public WheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whe; }
	 
		public WheContext() { }
		public void copyFrom(WheContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WheParContext extends WheContext {
		public WheSymContext fun;
		public List<WheSymContext> wheSym() {
			return getRuleContexts(WheSymContext.class);
		}
		public WheSymContext wheSym(int i) {
			return getRuleContext(WheSymContext.class,i);
		}
		public WheParContext(WheContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitWhePar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WheMoreContext extends WheContext {
		public WheSymContext fun1;
		public WheSymContext fun2;
		public WheContext fun3;
		public List<WheSymContext> wheSym() {
			return getRuleContexts(WheSymContext.class);
		}
		public WheSymContext wheSym(int i) {
			return getRuleContext(WheSymContext.class,i);
		}
		public WheContext whe() {
			return getRuleContext(WheContext.class,0);
		}
		public WheMoreContext(WheContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitWheMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WheLastContext extends WheContext {
		public WheSymContext fun;
		public WheSymContext wheSym() {
			return getRuleContext(WheSymContext.class,0);
		}
		public WheLastContext(WheContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitWheLast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WheContext whe() throws RecognitionException {
		WheContext _localctx = new WheContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whe);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new WheMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__9);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << EQ) | (1L << VAR))) != 0)) {
					{
					{
					setState(115);
					((WheMoreContext)_localctx).fun1 = wheSym();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(T__10);
				setState(122);
				((WheMoreContext)_localctx).fun2 = wheSym();
				setState(123);
				((WheMoreContext)_localctx).fun3 = whe();
				}
				break;
			case 2:
				_localctx = new WheParContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__9);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << EQ) | (1L << VAR))) != 0)) {
					{
					{
					setState(126);
					((WheParContext)_localctx).fun = wheSym();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(T__10);
				}
				break;
			case 3:
				_localctx = new WheLastContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				((WheLastContext)_localctx).fun = wheSym();
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

	public static class WheSymContext extends ParserRuleContext {
		public WheSymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wheSym; }
	 
		public WheSymContext() { }
		public void copyFrom(WheSymContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SymEContext extends WheSymContext {
		public Token v;
		public TerminalNode EQ() { return getToken(tparserParser.EQ, 0); }
		public SymEContext(WheSymContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitSymE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymFContext extends WheSymContext {
		public Token v;
		public SymFContext(WheSymContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitSymF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymVContext extends WheSymContext {
		public Token v;
		public TerminalNode VAR() { return getToken(tparserParser.VAR, 0); }
		public SymVContext(WheSymContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitSymV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymSContext extends WheSymContext {
		public Token v;
		public SymSContext(WheSymContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitSymS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymTContext extends WheSymContext {
		public Token v;
		public SymTContext(WheSymContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitSymT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymAContext extends WheSymContext {
		public Token v;
		public SymAContext(WheSymContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitSymA(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymOContext extends WheSymContext {
		public Token v;
		public SymOContext(WheSymContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitSymO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WheSymContext wheSym() throws RecognitionException {
		WheSymContext _localctx = new WheSymContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_wheSym);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new SymTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				((SymTContext)_localctx).v = match(T__11);
				}
				break;
			case T__12:
				_localctx = new SymFContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				((SymFContext)_localctx).v = match(T__12);
				}
				break;
			case VAR:
				_localctx = new SymVContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				((SymVContext)_localctx).v = match(VAR);
				}
				break;
			case T__13:
				_localctx = new SymSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				((SymSContext)_localctx).v = match(T__13);
				}
				break;
			case EQ:
				_localctx = new SymEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				((SymEContext)_localctx).v = match(EQ);
				}
				break;
			case T__14:
				_localctx = new SymAContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				((SymAContext)_localctx).v = match(T__14);
				}
				break;
			case T__15:
				_localctx = new SymOContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				((SymOContext)_localctx).v = match(T__15);
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

	public static class ConContext extends ParserRuleContext {
		public ConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_con; }
	 
		public ConContext() { }
		public void copyFrom(ConContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConMoreContext extends ConContext {
		public MContext mes;
		public ConContext fun;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public ConMoreContext(ConContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitConMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConLastContext extends ConContext {
		public MContext mes;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public ConLastContext(ConContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitConLast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConContext con() throws RecognitionException {
		ConContext _localctx = new ConContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_con);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ConMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((ConMoreContext)_localctx).mes = m(0);
				setState(146);
				((ConMoreContext)_localctx).fun = con();
				}
				break;
			case 2:
				_localctx = new ConLastContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				((ConLastContext)_localctx).mes = m(0);
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

	public static class IkstContext extends ParserRuleContext {
		public IkstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ikst; }
	 
		public IkstContext() { }
		public void copyFrom(IkstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IkMoreContext extends IkstContext {
		public MContext mes;
		public IkstContext fun;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public IkstContext ikst() {
			return getRuleContext(IkstContext.class,0);
		}
		public IkMoreContext(IkstContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitIkMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IkLastContext extends IkstContext {
		public MContext mes;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public IkLastContext(IkstContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitIkLast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IkstContext ikst() throws RecognitionException {
		IkstContext _localctx = new IkstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ikst);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new IkMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((IkMoreContext)_localctx).mes = m(0);
				setState(152);
				((IkMoreContext)_localctx).fun = ikst();
				}
				break;
			case 2:
				_localctx = new IkLastContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				((IkLastContext)_localctx).mes = m(0);
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

	public static class PostpContext extends ParserRuleContext {
		public PostpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postp; }
	 
		public PostpContext() { }
		public void copyFrom(PostpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostMContext extends PostpContext {
		public ComContext mes;
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public PostMContext(PostpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitPostM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostpContext postp() throws RecognitionException {
		PostpContext _localctx = new PostpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_postp);
		try {
			int _alt;
			_localctx = new PostMContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					((PostMContext)_localctx).mes = com();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComMoreContext extends ComContext {
		public MContext mes;
		public ComContext fun;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public ComMoreContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitComMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComLastContext extends ComContext {
		public MContext mes;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public ComLastContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitComLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoStateContext extends ComContext {
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public NoStateContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNoState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_com);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ComMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__4);
				setState(164);
				match(T__16);
				setState(165);
				((ComMoreContext)_localctx).mes = m(0);
				setState(166);
				((ComMoreContext)_localctx).fun = com();
				}
				break;
			case 2:
				_localctx = new ComLastContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__4);
				setState(169);
				match(T__16);
				setState(170);
				((ComLastContext)_localctx).mes = m(0);
				}
				break;
			case 3:
				_localctx = new NoStateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				m(0);
				setState(172);
				com();
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

	public static class NameContext extends ParserRuleContext {
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	 
		public NameContext() { }
		public void copyFrom(NameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameVContext extends NameContext {
		public Token v;
		public TerminalNode VAR() { return getToken(tparserParser.VAR, 0); }
		public NameVContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNameV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameFContext extends NameContext {
		public Token v;
		public List<TerminalNode> VAR() { return getTokens(tparserParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(tparserParser.VAR, i);
		}
		public List<TerminalNode> NUM() { return getTokens(tparserParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(tparserParser.NUM, i);
		}
		public NameFContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNameF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameNContext extends NameContext {
		public Token n;
		public TerminalNode NUM() { return getToken(tparserParser.NUM, 0); }
		public NameNContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNameN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameDotContext extends NameContext {
		public NameContext fun1;
		public NameContext fun2;
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public NameDotContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNameDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		return name(0);
	}

	private NameContext name(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NameContext _localctx = new NameContext(_ctx, _parentState);
		NameContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_name, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new NameVContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(177);
				((NameVContext)_localctx).v = match(VAR);
				}
				break;
			case 2:
				{
				_localctx = new NameNContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				((NameNContext)_localctx).n = match(NUM);
				}
				break;
			case 3:
				{
				_localctx = new NameFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(179);
						((NameFContext)_localctx).v = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__18) | (1L << VAR) | (1L << NUM))) != 0)) ) {
							((NameFContext)_localctx).v = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NameDotContext(new NameContext(_parentctx, _parentState));
					((NameDotContext)_localctx).fun1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_name);
					setState(187);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(188);
					match(T__17);
					setState(189);
					((NameDotContext)_localctx).fun2 = name(5);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class TraceContext extends ParserRuleContext {
		public TraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trace; }
	 
		public TraceContext() { }
		public void copyFrom(TraceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TraceMoreContext extends TraceContext {
		public ActContext fun;
		public TraceContext fun2;
		public ActContext act() {
			return getRuleContext(ActContext.class,0);
		}
		public TraceContext trace() {
			return getRuleContext(TraceContext.class,0);
		}
		public TraceMoreContext(TraceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitTraceMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TraceLastContext extends TraceContext {
		public ActContext fun;
		public ActContext act() {
			return getRuleContext(ActContext.class,0);
		}
		public TraceLastContext(TraceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitTraceLast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraceContext trace() throws RecognitionException {
		TraceContext _localctx = new TraceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_trace);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new TraceMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				((TraceMoreContext)_localctx).fun = act();
				setState(196);
				((TraceMoreContext)_localctx).fun2 = trace();
				}
				break;
			case 2:
				_localctx = new TraceLastContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				((TraceLastContext)_localctx).fun = act();
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

	public static class ActContext extends ParserRuleContext {
		public ActContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act; }
	 
		public ActContext() { }
		public void copyFrom(ActContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AActContext extends ActContext {
		public W2wContext fun;
		public MContext mes;
		public TerminalNode COLON() { return getToken(tparserParser.COLON, 0); }
		public W2wContext w2w() {
			return getRuleContext(W2wContext.class,0);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public AActContext(ActContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitAAct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActContext act() throws RecognitionException {
		ActContext _localctx = new ActContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_act);
		try {
			_localctx = new AActContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((AActContext)_localctx).fun = w2w();
			setState(202);
			match(COLON);
			setState(203);
			((AActContext)_localctx).mes = m(0);
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

	public static class W2wContext extends ParserRuleContext {
		public W2wContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w2w; }
	 
		public W2wContext() { }
		public void copyFrom(W2wContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FromToContext extends W2wContext {
		public WContext from;
		public CContext arrow;
		public WContext to;
		public List<WContext> w() {
			return getRuleContexts(WContext.class);
		}
		public WContext w(int i) {
			return getRuleContext(WContext.class,i);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public FromToContext(W2wContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFromTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final W2wContext w2w() throws RecognitionException {
		W2wContext _localctx = new W2wContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_w2w);
		try {
			_localctx = new FromToContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((FromToContext)_localctx).from = w();
			setState(206);
			((FromToContext)_localctx).arrow = c();
			setState(207);
			((FromToContext)_localctx).to = w();
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

	public static class CContext extends ParserRuleContext {
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
	 
		public CContext() { }
		public void copyFrom(CContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StarContext extends CContext {
		public TerminalNode STAR() { return getToken(tparserParser.STAR, 0); }
		public TerminalNode ARROW() { return getToken(tparserParser.ARROW, 0); }
		public StarContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StararrowstarContext extends CContext {
		public List<TerminalNode> STAR() { return getTokens(tparserParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(tparserParser.STAR, i);
		}
		public TerminalNode ARROW() { return getToken(tparserParser.ARROW, 0); }
		public StararrowstarContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitStararrowstar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrowstarContext extends CContext {
		public TerminalNode ARROW() { return getToken(tparserParser.ARROW, 0); }
		public TerminalNode STAR() { return getToken(tparserParser.STAR, 0); }
		public ArrowstarContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitArrowstar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegularContext extends CContext {
		public TerminalNode ARROW() { return getToken(tparserParser.ARROW, 0); }
		public RegularContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitRegular(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_c);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new RegularContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(ARROW);
				}
				break;
			case 2:
				_localctx = new StarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(STAR);
				setState(211);
				match(ARROW);
				}
				break;
			case 3:
				_localctx = new ArrowstarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(ARROW);
				setState(213);
				match(STAR);
				}
				break;
			case 4:
				_localctx = new StararrowstarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(STAR);
				setState(215);
				match(ARROW);
				setState(216);
				match(STAR);
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

	public static class WContext extends ParserRuleContext {
		public WContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w; }
	 
		public WContext() { }
		public void copyFrom(WContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WVarContext extends WContext {
		public Token v;
		public TerminalNode VAR() { return getToken(tparserParser.VAR, 0); }
		public WVarContext(WContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitWVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WNumContext extends WContext {
		public Token n;
		public TerminalNode NUM() { return getToken(tparserParser.NUM, 0); }
		public WNumContext(WContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitWNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WCommaContext extends WContext {
		public WContext fun1;
		public WContext fun2;
		public List<WContext> w() {
			return getRuleContexts(WContext.class);
		}
		public WContext w(int i) {
			return getRuleContext(WContext.class,i);
		}
		public WCommaContext(WContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitWComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WContext w() throws RecognitionException {
		WContext _localctx = new WContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_w);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new WVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				((WVarContext)_localctx).v = match(VAR);
				}
				break;
			case NUM:
				_localctx = new WNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((WNumContext)_localctx).n = match(NUM);
				}
				break;
			case T__9:
				_localctx = new WCommaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__9);
				setState(222);
				((WCommaContext)_localctx).fun1 = w();
				setState(223);
				match(T__19);
				setState(224);
				((WCommaContext)_localctx).fun2 = w();
				setState(225);
				match(T__10);
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

	public static class MContext extends ParserRuleContext {
		public MContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m; }
	 
		public MContext() { }
		public void copyFrom(MContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LkakseContext extends MContext {
		public TerminalNode NUM() { return getToken(tparserParser.NUM, 0); }
		public LkakseContext(MContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitLkakse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MnocommaContext extends MContext {
		public NormContext n;
		public NormContext norm() {
			return getRuleContext(NormContext.class,0);
		}
		public MnocommaContext(MContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitMnocomma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class McommaContext extends MContext {
		public MContext mes1;
		public MContext mes2;
		public List<MContext> m() {
			return getRuleContexts(MContext.class);
		}
		public MContext m(int i) {
			return getRuleContext(MContext.class,i);
		}
		public McommaContext(MContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitMcomma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MContext m() throws RecognitionException {
		return m(0);
	}

	private MContext m(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MContext _localctx = new MContext(_ctx, _parentState);
		MContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_m, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				{
				_localctx = new LkakseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(230);
				match(T__20);
				setState(231);
				match(NUM);
				}
				break;
			case T__9:
			case T__16:
			case T__19:
			case T__21:
			case T__23:
			case T__25:
			case T__27:
			case T__28:
			case VAR:
			case NUM:
				{
				_localctx = new MnocommaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				((MnocommaContext)_localctx).n = norm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new McommaContext(new MContext(_parentctx, _parentState));
					((McommaContext)_localctx).mes1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_m);
					setState(235);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(236);
					match(T__19);
					setState(237);
					((McommaContext)_localctx).mes2 = m(3);
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class NormContext extends ParserRuleContext {
		public NormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_norm; }
	 
		public NormContext() { }
		public void copyFrom(NormContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormemptyContext extends NormContext {
		public NormemptyContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormempty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormvariableContext extends NormContext {
		public TerminalNode VAR() { return getToken(tparserParser.VAR, 0); }
		public NormvariableContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormvariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormencContext extends NormContext {
		public MContext mes;
		public NormContext n;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public NormContext norm() {
			return getRuleContext(NormContext.class,0);
		}
		public NormencContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormenc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormUnderContext extends NormContext {
		public NormUnderContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormUnder(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormparenthContext extends NormContext {
		public MContext mes;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public NormparenthContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormparenth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormmesContext extends NormContext {
		public MContext mes;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public NormmesContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormmes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormnoencContext extends NormContext {
		public MContext mes;
		public NormContext n;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public NormContext norm() {
			return getRuleContext(NormContext.class,0);
		}
		public NormnoencContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormnoenc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormfunctionContext extends NormContext {
		public Token v;
		public LiContext l;
		public TerminalNode VAR() { return getToken(tparserParser.VAR, 0); }
		public LiContext li() {
			return getRuleContext(LiContext.class,0);
		}
		public NormfunctionContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormfunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormMoreContext extends NormContext {
		public NormContext n;
		public NormContext norm() {
			return getRuleContext(NormContext.class,0);
		}
		public NormMoreContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormcsqContext extends NormContext {
		public NormcsqContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormcsq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormcmesContext extends NormContext {
		public MContext mes;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public NormcmesContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormcmes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormnumContext extends NormContext {
		public TerminalNode NUM() { return getToken(tparserParser.NUM, 0); }
		public NormnumContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormnum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormsqContext extends NormContext {
		public NormsqContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitNormsq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormContext norm() throws RecognitionException {
		NormContext _localctx = new NormContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_norm);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new NormfunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				((NormfunctionContext)_localctx).v = match(VAR);
				setState(244);
				match(T__9);
				setState(245);
				((NormfunctionContext)_localctx).l = li();
				setState(246);
				match(T__10);
				}
				break;
			case 2:
				_localctx = new NormnoencContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__21);
				setState(249);
				((NormnoencContext)_localctx).mes = m(0);
				setState(250);
				match(T__22);
				setState(251);
				((NormnoencContext)_localctx).n = norm();
				}
				break;
			case 3:
				_localctx = new NormencContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(T__23);
				setState(254);
				((NormencContext)_localctx).mes = m(0);
				setState(255);
				match(T__24);
				setState(256);
				((NormencContext)_localctx).n = norm();
				}
				break;
			case 4:
				_localctx = new NormvariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(VAR);
				}
				break;
			case 5:
				_localctx = new NormnumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(NUM);
				}
				break;
			case 6:
				_localctx = new NormMoreContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				match(T__16);
				setState(261);
				((NormMoreContext)_localctx).n = norm();
				}
				break;
			case 7:
				_localctx = new NormUnderContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				match(T__16);
				}
				break;
			case 8:
				_localctx = new NormparenthContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				match(T__9);
				setState(264);
				((NormparenthContext)_localctx).mes = m(0);
				setState(265);
				match(T__10);
				}
				break;
			case 9:
				_localctx = new NormcmesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(267);
				match(T__19);
				setState(268);
				match(T__25);
				setState(269);
				((NormcmesContext)_localctx).mes = m(0);
				setState(270);
				match(T__26);
				}
				break;
			case 10:
				_localctx = new NormmesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(272);
				match(T__25);
				setState(273);
				((NormmesContext)_localctx).mes = m(0);
				setState(274);
				match(T__26);
				}
				break;
			case 11:
				_localctx = new NormcsqContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(276);
				match(T__19);
				setState(277);
				match(T__27);
				}
				break;
			case 12:
				_localctx = new NormsqContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(278);
				match(T__27);
				}
				break;
			case 13:
				_localctx = new NormemptyContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(279);
				match(T__28);
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

	public static class LiContext extends ParserRuleContext {
		public LiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_li; }
	 
		public LiContext() { }
		public void copyFrom(LiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LisingleContext extends LiContext {
		public NormContext no;
		public NormContext norm() {
			return getRuleContext(NormContext.class,0);
		}
		public LisingleContext(LiContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitLisingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LimoreContext extends LiContext {
		public NormContext no;
		public LiContext l;
		public NormContext norm() {
			return getRuleContext(NormContext.class,0);
		}
		public LiContext li() {
			return getRuleContext(LiContext.class,0);
		}
		public LimoreContext(LiContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitLimore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiContext li() throws RecognitionException {
		LiContext _localctx = new LiContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_li);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new LimoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				((LimoreContext)_localctx).no = norm();
				setState(283);
				match(T__19);
				setState(284);
				((LimoreContext)_localctx).l = li();
				}
				break;
			case 2:
				_localctx = new LisingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				((LisingleContext)_localctx).no = norm();
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

	public static class VerContext extends ParserRuleContext {
		public VerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ver; }
	 
		public VerContext() { }
		public void copyFrom(VerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FVerContext extends VerContext {
		public Token n;
		public TerminalNode NUM() { return getToken(tparserParser.NUM, 0); }
		public FVerContext(VerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitFVer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerContext ver() throws RecognitionException {
		VerContext _localctx = new VerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ver);
		try {
			_localctx = new FVerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			((FVerContext)_localctx).n = match(NUM);
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

	public static class TexContext extends ParserRuleContext {
		public TexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tex; }
	 
		public TexContext() { }
		public void copyFrom(TexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TexMoreContext extends TexContext {
		public Token v;
		public TexContext fun;
		public TerminalNode VAR() { return getToken(tparserParser.VAR, 0); }
		public TexContext tex() {
			return getRuleContext(TexContext.class,0);
		}
		public TexMoreContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitTexMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TexNContext extends TexContext {
		public Token v;
		public TexNContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitTexN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TexUContext extends TexContext {
		public TexContext fun;
		public TexContext fun2;
		public List<TexContext> tex() {
			return getRuleContexts(TexContext.class);
		}
		public TexContext tex(int i) {
			return getRuleContext(TexContext.class,i);
		}
		public TexUContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitTexU(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TexFContext extends TexContext {
		public Token v;
		public TexFContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitTexF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TexVContext extends TexContext {
		public Token v;
		public TerminalNode VAR() { return getToken(tparserParser.VAR, 0); }
		public TexVContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitTexV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TexAContext extends TexContext {
		public Token v;
		public TexAContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tparserVisitor ) return ((tparserVisitor<? extends T>)visitor).visitTexA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TexContext tex() throws RecognitionException {
		return tex(0);
	}

	private TexContext tex(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TexContext _localctx = new TexContext(_ctx, _parentState);
		TexContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_tex, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new TexAContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(292);
				((TexAContext)_localctx).v = match(T__29);
				}
				break;
			case 2:
				{
				_localctx = new TexNContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				((TexNContext)_localctx).v = match(T__30);
				}
				break;
			case 3:
				{
				_localctx = new TexFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				((TexFContext)_localctx).v = match(T__31);
				}
				break;
			case 4:
				{
				_localctx = new TexMoreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				((TexMoreContext)_localctx).v = match(VAR);
				setState(296);
				((TexMoreContext)_localctx).fun = tex(2);
				}
				break;
			case 5:
				{
				_localctx = new TexVContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				((TexVContext)_localctx).v = match(VAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TexUContext(new TexContext(_parentctx, _parentState));
					((TexUContext)_localctx).fun = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_tex);
					setState(300);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(301);
					match(T__16);
					setState(302);
					((TexUContext)_localctx).fun2 = tex(7);
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return name_sempred((NameContext)_localctx, predIndex);
		case 16:
			return m_sempred((MContext)_localctx, predIndex);
		case 20:
			return tex_sempred((TexContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean name_sempred(NameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean m_sempred(MContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean tex_sempred(TexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0137\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16\3C"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3L\n\3\r\3\16\3M\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\4\6\4_\n\4\r\4\16\4`\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\6\4i\n\4\r\4\16\4j\5\4m\n\4\3\5\3\5\3\5\3\5\5\5s\n\5"+
		"\3\6\3\6\7\6w\n\6\f\6\16\6z\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0082\n\6"+
		"\f\6\16\6\u0085\13\6\3\6\3\6\5\6\u0089\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0092\n\7\3\b\3\b\3\b\3\b\5\b\u0098\n\b\3\t\3\t\3\t\3\t\5\t\u009e"+
		"\n\t\3\n\7\n\u00a1\n\n\f\n\16\n\u00a4\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b1\n\13\3\f\3\f\3\f\3\f\7\f\u00b7"+
		"\n\f\f\f\16\f\u00ba\13\f\5\f\u00bc\n\f\3\f\3\f\3\f\7\f\u00c1\n\f\f\f\16"+
		"\f\u00c4\13\f\3\r\3\r\3\r\3\r\5\r\u00ca\n\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00dc\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e6\n\21\3\22\3\22\3\22"+
		"\3\22\5\22\u00ec\n\22\3\22\3\22\3\22\7\22\u00f1\n\22\f\22\16\22\u00f4"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011b\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0122\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u012d\n\26\3\26\3\26\3\26\7\26\u0132\n\26\f\26\16\26\u0135"+
		"\13\26\3\26\2\5\26\"*\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*\2\5\4\2%%**\4\2\7\7\t\t\5\2\23\23\25\25*+\2\u015e\2-\3\2\2\2\4X\3\2"+
		"\2\2\6l\3\2\2\2\br\3\2\2\2\n\u0088\3\2\2\2\f\u0091\3\2\2\2\16\u0097\3"+
		"\2\2\2\20\u009d\3\2\2\2\22\u00a2\3\2\2\2\24\u00b0\3\2\2\2\26\u00bb\3\2"+
		"\2\2\30\u00c9\3\2\2\2\32\u00cb\3\2\2\2\34\u00cf\3\2\2\2\36\u00db\3\2\2"+
		"\2 \u00e5\3\2\2\2\"\u00eb\3\2\2\2$\u011a\3\2\2\2&\u0121\3\2\2\2(\u0123"+
		"\3\2\2\2*\u012c\3\2\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60\61\3\2\2\2\61\62\7\2\2\3\62\3\3\2\2\2\63\64\7\3\2\2\64Y\5(\25"+
		"\2\65\66\7\4\2\2\66\67\7#\2\2\67Y\5*\26\289\7\5\2\29:\7#\2\2:;\7\3\2\2"+
		";Y\5(\25\2<=\7\6\2\2=A\7#\2\2>@\t\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2"+
		"AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\7\2\2EF\7#\2\2FY\5\24\13\2GH\7\b\2"+
		"\2HI\7#\2\2IY\5\22\n\2JL\t\3\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2NO\3\2\2\2OP\7#\2\2PY\5\20\t\2QR\7\n\2\2RS\7#\2\2SY\5\16\b\2TU\7\13"+
		"\2\2UY\5\n\6\2VY\5\b\5\2WY\5\6\4\2X\63\3\2\2\2X\65\3\2\2\2X8\3\2\2\2X"+
		"<\3\2\2\2XG\3\2\2\2XK\3\2\2\2XQ\3\2\2\2XT\3\2\2\2XV\3\2\2\2XW\3\2\2\2"+
		"Y\5\3\2\2\2Z[\7\f\2\2[\\\7+\2\2\\^\7\r\2\2]_\5\32\16\2^]\3\2\2\2_`\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5\6\4\2cm\3\2\2\2de\7\f\2\2ef\7+"+
		"\2\2fh\7\r\2\2gi\5\32\16\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3"+
		"\2\2\2lZ\3\2\2\2ld\3\2\2\2m\7\3\2\2\2no\5\32\16\2op\5\b\5\2ps\3\2\2\2"+
		"qs\5\32\16\2rn\3\2\2\2rq\3\2\2\2s\t\3\2\2\2tx\7\f\2\2uw\5\f\7\2vu\3\2"+
		"\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\r\2\2|}\5\f"+
		"\7\2}~\5\n\6\2~\u0089\3\2\2\2\177\u0083\7\f\2\2\u0080\u0082\5\f\7\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0089\7\r\2\2\u0087"+
		"\u0089\5\f\7\2\u0088t\3\2\2\2\u0088\177\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\13\3\2\2\2\u008a\u0092\7\16\2\2\u008b\u0092\7\17\2\2\u008c\u0092\7*\2"+
		"\2\u008d\u0092\7\20\2\2\u008e\u0092\7$\2\2\u008f\u0092\7\21\2\2\u0090"+
		"\u0092\7\22\2\2\u0091\u008a\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u008c\3"+
		"\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\r\3\2\2\2\u0093\u0094\5\"\22\2\u0094\u0095\5\16\b"+
		"\2\u0095\u0098\3\2\2\2\u0096\u0098\5\"\22\2\u0097\u0093\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\17\3\2\2\2\u0099\u009a\5\"\22\2\u009a\u009b\5\20"+
		"\t\2\u009b\u009e\3\2\2\2\u009c\u009e\5\"\22\2\u009d\u0099\3\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\21\3\2\2\2\u009f\u00a1\5\24\13\2\u00a0\u009f\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\23\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\7\23\2"+
		"\2\u00a7\u00a8\5\"\22\2\u00a8\u00a9\5\24\13\2\u00a9\u00b1\3\2\2\2\u00aa"+
		"\u00ab\7\7\2\2\u00ab\u00ac\7\23\2\2\u00ac\u00b1\5\"\22\2\u00ad\u00ae\5"+
		"\"\22\2\u00ae\u00af\5\24\13\2\u00af\u00b1\3\2\2\2\u00b0\u00a5\3\2\2\2"+
		"\u00b0\u00aa\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b3"+
		"\b\f\1\2\u00b3\u00bc\7*\2\2\u00b4\u00bc\7+\2\2\u00b5\u00b7\t\4\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb"+
		"\u00b4\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00c2\3\2\2\2\u00bd\u00be\f\6"+
		"\2\2\u00be\u00bf\7\24\2\2\u00bf\u00c1\5\26\f\7\u00c0\u00bd\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\27\3\2\2"+
		"\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\5\30\r\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00ca\5\32\16\2\u00c9\u00c5\3\2\2\2\u00c9\u00c8\3"+
		"\2\2\2\u00ca\31\3\2\2\2\u00cb\u00cc\5\34\17\2\u00cc\u00cd\7#\2\2\u00cd"+
		"\u00ce\5\"\22\2\u00ce\33\3\2\2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\5\36"+
		"\20\2\u00d1\u00d2\5 \21\2\u00d2\35\3\2\2\2\u00d3\u00dc\7)\2\2\u00d4\u00d5"+
		"\7%\2\2\u00d5\u00dc\7)\2\2\u00d6\u00d7\7)\2\2\u00d7\u00dc\7%\2\2\u00d8"+
		"\u00d9\7%\2\2\u00d9\u00da\7)\2\2\u00da\u00dc\7%\2\2\u00db\u00d3\3\2\2"+
		"\2\u00db\u00d4\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\37"+
		"\3\2\2\2\u00dd\u00e6\7*\2\2\u00de\u00e6\7+\2\2\u00df\u00e0\7\f\2\2\u00e0"+
		"\u00e1\5 \21\2\u00e1\u00e2\7\26\2\2\u00e2\u00e3\5 \21\2\u00e3\u00e4\7"+
		"\r\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5"+
		"\u00df\3\2\2\2\u00e6!\3\2\2\2\u00e7\u00e8\b\22\1\2\u00e8\u00e9\7\27\2"+
		"\2\u00e9\u00ec\7+\2\2\u00ea\u00ec\5$\23\2\u00eb\u00e7\3\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00f2\3\2\2\2\u00ed\u00ee\f\4\2\2\u00ee\u00ef\7\26\2\2"+
		"\u00ef\u00f1\5\"\22\5\u00f0\u00ed\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3#\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f6\7*\2\2\u00f6\u00f7\7\f\2\2\u00f7\u00f8\5&\24\2\u00f8\u00f9\7\r"+
		"\2\2\u00f9\u011b\3\2\2\2\u00fa\u00fb\7\30\2\2\u00fb\u00fc\5\"\22\2\u00fc"+
		"\u00fd\7\31\2\2\u00fd\u00fe\5$\23\2\u00fe\u011b\3\2\2\2\u00ff\u0100\7"+
		"\32\2\2\u0100\u0101\5\"\22\2\u0101\u0102\7\33\2\2\u0102\u0103\5$\23\2"+
		"\u0103\u011b\3\2\2\2\u0104\u011b\7*\2\2\u0105\u011b\7+\2\2\u0106\u0107"+
		"\7\23\2\2\u0107\u011b\5$\23\2\u0108\u011b\7\23\2\2\u0109\u010a\7\f\2\2"+
		"\u010a\u010b\5\"\22\2\u010b\u010c\7\r\2\2\u010c\u011b\3\2\2\2\u010d\u010e"+
		"\7\26\2\2\u010e\u010f\7\34\2\2\u010f\u0110\5\"\22\2\u0110\u0111\7\35\2"+
		"\2\u0111\u011b\3\2\2\2\u0112\u0113\7\34\2\2\u0113\u0114\5\"\22\2\u0114"+
		"\u0115\7\35\2\2\u0115\u011b\3\2\2\2\u0116\u0117\7\26\2\2\u0117\u011b\7"+
		"\36\2\2\u0118\u011b\7\36\2\2\u0119\u011b\7\37\2\2\u011a\u00f5\3\2\2\2"+
		"\u011a\u00fa\3\2\2\2\u011a\u00ff\3\2\2\2\u011a\u0104\3\2\2\2\u011a\u0105"+
		"\3\2\2\2\u011a\u0106\3\2\2\2\u011a\u0108\3\2\2\2\u011a\u0109\3\2\2\2\u011a"+
		"\u010d\3\2\2\2\u011a\u0112\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u0119\3\2\2\2\u011b%\3\2\2\2\u011c\u011d\5$\23\2\u011d\u011e"+
		"\7\26\2\2\u011e\u011f\5&\24\2\u011f\u0122\3\2\2\2\u0120\u0122\5$\23\2"+
		"\u0121\u011c\3\2\2\2\u0121\u0120\3\2\2\2\u0122\'\3\2\2\2\u0123\u0124\7"+
		"+\2\2\u0124)\3\2\2\2\u0125\u0126\b\26\1\2\u0126\u012d\7 \2\2\u0127\u012d"+
		"\7!\2\2\u0128\u012d\7\"\2\2\u0129\u012a\7*\2\2\u012a\u012d\5*\26\4\u012b"+
		"\u012d\7*\2\2\u012c\u0125\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u0128\3\2"+
		"\2\2\u012c\u0129\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u0133\3\2\2\2\u012e"+
		"\u012f\f\b\2\2\u012f\u0130\7\23\2\2\u0130\u0132\5*\26\t\u0131\u012e\3"+
		"\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"+\3\2\2\2\u0135\u0133\3\2\2\2\36/AMX`jlrx\u0083\u0088\u0091\u0097\u009d"+
		"\u00a2\u00b0\u00b8\u00bb\u00c2\u00c9\u00db\u00e5\u00eb\u00f2\u011a\u0121"+
		"\u012c\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}