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
// Generated from aparser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aparserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, COLON=28, EQ=29, STAR=30, NEQ=31, SEMI=32, 
		HASH=33, ARROW=34, VAR=35, NUM=36, COMMENT=37, WS=38;
	public static final int
		RULE_start = 0, RULE_begin = 1, RULE_name = 2, RULE_trace = 3, RULE_act = 4, 
		RULE_w2w = 5, RULE_c = 6, RULE_w = 7, RULE_m = 8, RULE_norm = 9, RULE_li = 10, 
		RULE_stat = 11, RULE_types = 12, RULE_ver = 13, RULE_tex = 14;
	public static final String[] ruleNames = {
		"start", "begin", "name", "trace", "act", "w2w", "c", "w", "m", "norm", 
		"li", "stat", "types", "ver", "tex"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Open-Source Fixedpoint Model-Checker version'", "'INPUT'", "'SUMMARY'", 
		"'GOAL'", "'DETAILS'", "'BACKEND'", "'STATISTICS'", "'ATTACK TRACE'", 
		"'.'", "'_'", "'-'", "'\\'", "'/'", "'('", "','", "')'", "'{'", "'}'", 
		"'{|'", "'|}'", "'TIME'", "'parseTime'", "'visitedNodes'", "'depth'", 
		"'ATTACK'", "'NO'", "'FOUND'", "':'", "'='", "'*'", "'!='", "';'", "'#'", 
		"'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "COLON", "EQ", "STAR", "NEQ", "SEMI", "HASH", 
		"ARROW", "VAR", "NUM", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "aparser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public aparserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(aparserParser.EOF, 0); }
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitStart(this);
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				begin();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) );
			setState(35);
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
	public static class FunInContext extends BeginContext {
		public Token t;
		public NameContext fun;
		public TerminalNode COLON() { return getToken(aparserParser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FunInContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitFunIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunGoalContext extends BeginContext {
		public Token t;
		public TexContext fun;
		public TerminalNode COLON() { return getToken(aparserParser.COLON, 0); }
		public TexContext tex() {
			return getRuleContext(TexContext.class,0);
		}
		public FunGoalContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitFunGoal(this);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitFunVer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunDetContext extends BeginContext {
		public Token t;
		public TexContext fun;
		public TerminalNode COLON() { return getToken(aparserParser.COLON, 0); }
		public TexContext tex() {
			return getRuleContext(TexContext.class,0);
		}
		public FunDetContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitFunDet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunBackContext extends BeginContext {
		public Token t;
		public Token t2;
		public VerContext fun;
		public TerminalNode COLON() { return getToken(aparserParser.COLON, 0); }
		public VerContext ver() {
			return getRuleContext(VerContext.class,0);
		}
		public FunBackContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitFunBack(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunStatContext extends BeginContext {
		public Token t;
		public StatContext fun;
		public TerminalNode COLON() { return getToken(aparserParser.COLON, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public FunStatContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitFunStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunTraceContext extends BeginContext {
		public Token t;
		public TraceContext fun;
		public TerminalNode COLON() { return getToken(aparserParser.COLON, 0); }
		public TraceContext trace() {
			return getRuleContext(TraceContext.class,0);
		}
		public FunTraceContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitFunTrace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunSumContext extends BeginContext {
		public Token t;
		public TexContext fun;
		public TerminalNode COLON() { return getToken(aparserParser.COLON, 0); }
		public TexContext tex() {
			return getRuleContext(TexContext.class,0);
		}
		public FunSumContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitFunSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_begin);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new FunVerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((FunVerContext)_localctx).t = match(T__0);
				setState(38);
				((FunVerContext)_localctx).fun = ver();
				}
				break;
			case T__1:
				_localctx = new FunInContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				((FunInContext)_localctx).t = match(T__1);
				setState(40);
				match(COLON);
				setState(41);
				((FunInContext)_localctx).fun = name(0);
				}
				break;
			case T__2:
				_localctx = new FunSumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				((FunSumContext)_localctx).t = match(T__2);
				setState(43);
				match(COLON);
				setState(44);
				((FunSumContext)_localctx).fun = tex(0);
				}
				break;
			case T__3:
				_localctx = new FunGoalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				((FunGoalContext)_localctx).t = match(T__3);
				setState(46);
				match(COLON);
				setState(47);
				((FunGoalContext)_localctx).fun = tex(0);
				}
				break;
			case T__4:
				_localctx = new FunDetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				((FunDetContext)_localctx).t = match(T__4);
				setState(49);
				match(COLON);
				setState(50);
				((FunDetContext)_localctx).fun = tex(0);
				}
				break;
			case T__5:
				_localctx = new FunBackContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				((FunBackContext)_localctx).t = match(T__5);
				setState(52);
				match(COLON);
				setState(53);
				((FunBackContext)_localctx).t2 = match(T__0);
				setState(54);
				((FunBackContext)_localctx).fun = ver();
				}
				break;
			case T__6:
				_localctx = new FunStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				((FunStatContext)_localctx).t = match(T__6);
				setState(56);
				match(COLON);
				setState(57);
				((FunStatContext)_localctx).fun = stat();
				}
				break;
			case T__7:
				_localctx = new FunTraceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				((FunTraceContext)_localctx).t = match(T__7);
				setState(59);
				match(COLON);
				setState(60);
				((FunTraceContext)_localctx).fun = trace();
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
		public Token var;
		public TerminalNode VAR() { return getToken(aparserParser.VAR, 0); }
		public NameVContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNameV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameFContext extends NameContext {
		public Token v;
		public List<TerminalNode> VAR() { return getTokens(aparserParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(aparserParser.VAR, i);
		}
		public List<TerminalNode> NUM() { return getTokens(aparserParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(aparserParser.NUM, i);
		}
		public List<TerminalNode> COLON() { return getTokens(aparserParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(aparserParser.COLON, i);
		}
		public NameFContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNameF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameNContext extends NameContext {
		public Token n;
		public TerminalNode NUM() { return getToken(aparserParser.NUM, 0); }
		public NameNContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNameN(this);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNameDot(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_name, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new NameVContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(64);
				((NameVContext)_localctx).var = match(VAR);
				}
				break;
			case 2:
				{
				_localctx = new NameNContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				((NameNContext)_localctx).n = match(NUM);
				}
				break;
			case 3:
				{
				_localctx = new NameFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(66);
						((NameFContext)_localctx).v = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << COLON) | (1L << VAR) | (1L << NUM))) != 0)) ) {
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
					setState(71);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NameDotContext(new NameContext(_parentctx, _parentState));
					((NameDotContext)_localctx).fun1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_name);
					setState(74);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(75);
					match(T__8);
					setState(76);
					((NameDotContext)_localctx).fun2 = name(5);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTraceMore(this);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTraceLast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraceContext trace() throws RecognitionException {
		TraceContext _localctx = new TraceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_trace);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new TraceMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				((TraceMoreContext)_localctx).fun = act();
				setState(83);
				((TraceMoreContext)_localctx).fun2 = trace();
				}
				break;
			case 2:
				_localctx = new TraceLastContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
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
		public TerminalNode COLON() { return getToken(aparserParser.COLON, 0); }
		public W2wContext w2w() {
			return getRuleContext(W2wContext.class,0);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public AActContext(ActContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitAAct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActContext act() throws RecognitionException {
		ActContext _localctx = new ActContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_act);
		try {
			_localctx = new AActContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((AActContext)_localctx).fun = w2w();
			setState(89);
			match(COLON);
			setState(90);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitFromTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final W2wContext w2w() throws RecognitionException {
		W2wContext _localctx = new W2wContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_w2w);
		try {
			_localctx = new FromToContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((FromToContext)_localctx).from = w();
			setState(93);
			((FromToContext)_localctx).arrow = c();
			setState(94);
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
		public TerminalNode STAR() { return getToken(aparserParser.STAR, 0); }
		public TerminalNode ARROW() { return getToken(aparserParser.ARROW, 0); }
		public StarContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StararrowstarContext extends CContext {
		public List<TerminalNode> STAR() { return getTokens(aparserParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(aparserParser.STAR, i);
		}
		public TerminalNode ARROW() { return getToken(aparserParser.ARROW, 0); }
		public StararrowstarContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitStararrowstar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrowstarContext extends CContext {
		public TerminalNode ARROW() { return getToken(aparserParser.ARROW, 0); }
		public TerminalNode STAR() { return getToken(aparserParser.STAR, 0); }
		public ArrowstarContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitArrowstar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegularContext extends CContext {
		public TerminalNode ARROW() { return getToken(aparserParser.ARROW, 0); }
		public RegularContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitRegular(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_c);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new RegularContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(ARROW);
				}
				break;
			case 2:
				_localctx = new StarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(STAR);
				setState(98);
				match(ARROW);
				}
				break;
			case 3:
				_localctx = new ArrowstarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(ARROW);
				setState(100);
				match(STAR);
				}
				break;
			case 4:
				_localctx = new StararrowstarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(STAR);
				setState(102);
				match(ARROW);
				setState(103);
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
		public TerminalNode VAR() { return getToken(aparserParser.VAR, 0); }
		public WVarContext(WContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitWVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WNumContext extends WContext {
		public Token n;
		public TerminalNode NUM() { return getToken(aparserParser.NUM, 0); }
		public WNumContext(WContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitWNum(this);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitWComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WContext w() throws RecognitionException {
		WContext _localctx = new WContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_w);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new WVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((WVarContext)_localctx).v = match(VAR);
				}
				break;
			case NUM:
				_localctx = new WNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				((WNumContext)_localctx).n = match(NUM);
				}
				break;
			case T__13:
				_localctx = new WCommaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__13);
				setState(109);
				((WCommaContext)_localctx).fun1 = w();
				setState(110);
				match(T__14);
				setState(111);
				((WCommaContext)_localctx).fun2 = w();
				setState(112);
				match(T__15);
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
	public static class MnocommaContext extends MContext {
		public NormContext n;
		public NormContext norm() {
			return getRuleContext(NormContext.class,0);
		}
		public MnocommaContext(MContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitMnocomma(this);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitMcomma(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_m, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MnocommaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(117);
			((MnocommaContext)_localctx).n = norm();
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new McommaContext(new MContext(_parentctx, _parentState));
					((McommaContext)_localctx).mes1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_m);
					setState(119);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(120);
					match(T__14);
					setState(121);
					((McommaContext)_localctx).mes2 = m(3);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class NormfunctionContext extends NormContext {
		public Token v;
		public LiContext l;
		public TerminalNode VAR() { return getToken(aparserParser.VAR, 0); }
		public LiContext li() {
			return getRuleContext(LiContext.class,0);
		}
		public NormfunctionContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNormfunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormvariableContext extends NormContext {
		public Token v;
		public TerminalNode VAR() { return getToken(aparserParser.VAR, 0); }
		public NormvariableContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNormvariable(this);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNormMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormnumContext extends NormContext {
		public Token n;
		public TerminalNode NUM() { return getToken(aparserParser.NUM, 0); }
		public NormnumContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNormnum(this);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNormenc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormUnderContext extends NormContext {
		public NormUnderContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNormUnder(this);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNormparenth(this);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitNormnoenc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormContext norm() throws RecognitionException {
		NormContext _localctx = new NormContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_norm);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new NormfunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				((NormfunctionContext)_localctx).v = match(VAR);
				setState(128);
				match(T__13);
				setState(129);
				((NormfunctionContext)_localctx).l = li();
				setState(130);
				match(T__15);
				}
				break;
			case 2:
				_localctx = new NormnoencContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__16);
				setState(133);
				((NormnoencContext)_localctx).mes = m(0);
				setState(134);
				match(T__17);
				setState(135);
				((NormnoencContext)_localctx).n = norm();
				}
				break;
			case 3:
				_localctx = new NormencContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__18);
				setState(138);
				((NormencContext)_localctx).mes = m(0);
				setState(139);
				match(T__19);
				setState(140);
				((NormencContext)_localctx).n = norm();
				}
				break;
			case 4:
				_localctx = new NormvariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				((NormvariableContext)_localctx).v = match(VAR);
				}
				break;
			case 5:
				_localctx = new NormnumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				((NormnumContext)_localctx).n = match(NUM);
				}
				break;
			case 6:
				_localctx = new NormMoreContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				match(T__9);
				setState(145);
				((NormMoreContext)_localctx).n = norm();
				}
				break;
			case 7:
				_localctx = new NormUnderContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				match(T__9);
				}
				break;
			case 8:
				_localctx = new NormparenthContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				match(T__13);
				setState(148);
				((NormparenthContext)_localctx).mes = m(0);
				setState(149);
				match(T__15);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitLisingle(this);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitLimore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiContext li() throws RecognitionException {
		LiContext _localctx = new LiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_li);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new LimoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((LimoreContext)_localctx).no = norm();
				setState(154);
				match(T__14);
				setState(155);
				((LimoreContext)_localctx).l = li();
				}
				break;
			case 2:
				_localctx = new LisingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatStatContext extends StatContext {
		public TypesContext fun;
		public Token n;
		public Token v;
		public StatContext fun2;
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode NUM() { return getToken(aparserParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(aparserParser.VAR, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public StatStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitStatStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatBothContext extends StatContext {
		public TypesContext fun;
		public Token n;
		public Token v;
		public StatContext fun2;
		public TerminalNode COLON() { return getToken(aparserParser.COLON, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode NUM() { return getToken(aparserParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(aparserParser.VAR, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public StatBothContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitStatBoth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatColContext extends StatContext {
		public TypesContext fun;
		public Token n;
		public Token v;
		public TerminalNode COLON() { return getToken(aparserParser.COLON, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode NUM() { return getToken(aparserParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(aparserParser.VAR, 0); }
		public StatColContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitStatCol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatNeitherContext extends StatContext {
		public TypesContext fun;
		public Token n;
		public Token v;
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode NUM() { return getToken(aparserParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(aparserParser.VAR, 0); }
		public StatNeitherContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitStatNeither(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stat);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new StatBothContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((StatBothContext)_localctx).fun = types();
				setState(161);
				match(COLON);
				setState(162);
				((StatBothContext)_localctx).n = match(NUM);
				setState(163);
				((StatBothContext)_localctx).v = match(VAR);
				setState(164);
				((StatBothContext)_localctx).fun2 = stat();
				}
				break;
			case 2:
				_localctx = new StatStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				((StatStatContext)_localctx).fun = types();
				setState(167);
				((StatStatContext)_localctx).n = match(NUM);
				setState(168);
				((StatStatContext)_localctx).v = match(VAR);
				setState(169);
				((StatStatContext)_localctx).fun2 = stat();
				}
				break;
			case 3:
				_localctx = new StatNeitherContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				((StatNeitherContext)_localctx).fun = types();
				setState(172);
				((StatNeitherContext)_localctx).n = match(NUM);
				setState(173);
				((StatNeitherContext)_localctx).v = match(VAR);
				}
				break;
			case 4:
				_localctx = new StatColContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				((StatColContext)_localctx).fun = types();
				setState(176);
				match(COLON);
				setState(177);
				((StatColContext)_localctx).n = match(NUM);
				setState(178);
				((StatColContext)_localctx).v = match(VAR);
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

	public static class TypesContext extends ParserRuleContext {
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	 
		public TypesContext() { }
		public void copyFrom(TypesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypesVContext extends TypesContext {
		public TypesVContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTypesV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypesTContext extends TypesContext {
		public TypesTContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTypesT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypesDContext extends TypesContext {
		public TypesDContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTypesD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypesPContext extends TypesContext {
		public TypesPContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTypesP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_types);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new TypesTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new TypesPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new TypesVContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new TypesDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(T__23);
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
		public TerminalNode NUM() { return getToken(aparserParser.NUM, 0); }
		public FVerContext(VerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitFVer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerContext ver() throws RecognitionException {
		VerContext _localctx = new VerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ver);
		try {
			_localctx = new FVerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		public TerminalNode VAR() { return getToken(aparserParser.VAR, 0); }
		public TexContext tex() {
			return getRuleContext(TexContext.class,0);
		}
		public TexMoreContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTexMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TexNContext extends TexContext {
		public Token v;
		public TexNContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTexN(this);
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
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTexU(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TexFContext extends TexContext {
		public Token v;
		public TexFContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTexF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TexVContext extends TexContext {
		public Token v;
		public TerminalNode VAR() { return getToken(aparserParser.VAR, 0); }
		public TexVContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTexV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TexAContext extends TexContext {
		public Token v;
		public TexAContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aparserVisitor ) return ((aparserVisitor<? extends T>)visitor).visitTexA(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_tex, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new TexAContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(191);
				((TexAContext)_localctx).v = match(T__24);
				}
				break;
			case 2:
				{
				_localctx = new TexNContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				((TexNContext)_localctx).v = match(T__25);
				}
				break;
			case 3:
				{
				_localctx = new TexFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				((TexFContext)_localctx).v = match(T__26);
				}
				break;
			case 4:
				{
				_localctx = new TexMoreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				((TexMoreContext)_localctx).v = match(VAR);
				setState(195);
				((TexMoreContext)_localctx).fun = tex(2);
				}
				break;
			case 5:
				{
				_localctx = new TexVContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				((TexVContext)_localctx).v = match(VAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TexUContext(new TexContext(_parentctx, _parentState));
					((TexUContext)_localctx).fun = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_tex);
					setState(199);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(200);
					match(T__9);
					setState(201);
					((TexUContext)_localctx).fun2 = tex(7);
					}
					} 
				}
				setState(206);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return name_sempred((NameContext)_localctx, predIndex);
		case 8:
			return m_sempred((MContext)_localctx, predIndex);
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4\3\4\3\4\3\4\7\4F\n"+
		"\4\f\4\16\4I\13\4\5\4K\n\4\3\4\3\4\3\4\7\4P\n\4\f\4\16\4S\13\4\3\5\3\5"+
		"\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bk\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tu\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u009a\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00a1"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00b7\n\r\3\16\3\16\3\16\3\16\5\16\u00bd\n\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c8\n\20\3\20\3\20\3\20"+
		"\7\20\u00cd\n\20\f\20\16\20\u00d0\13\20\3\20\2\5\6\22\36\21\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36\2\3\5\2\f\17\36\36%&\2\u00e8\2!\3\2\2\2"+
		"\4?\3\2\2\2\6J\3\2\2\2\bX\3\2\2\2\nZ\3\2\2\2\f^\3\2\2\2\16j\3\2\2\2\20"+
		"t\3\2\2\2\22v\3\2\2\2\24\u0099\3\2\2\2\26\u00a0\3\2\2\2\30\u00b6\3\2\2"+
		"\2\32\u00bc\3\2\2\2\34\u00be\3\2\2\2\36\u00c7\3\2\2\2 \"\5\4\3\2! \3\2"+
		"\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\'("+
		"\7\3\2\2(@\5\34\17\2)*\7\4\2\2*+\7\36\2\2+@\5\6\4\2,-\7\5\2\2-.\7\36\2"+
		"\2.@\5\36\20\2/\60\7\6\2\2\60\61\7\36\2\2\61@\5\36\20\2\62\63\7\7\2\2"+
		"\63\64\7\36\2\2\64@\5\36\20\2\65\66\7\b\2\2\66\67\7\36\2\2\678\7\3\2\2"+
		"8@\5\34\17\29:\7\t\2\2:;\7\36\2\2;@\5\30\r\2<=\7\n\2\2=>\7\36\2\2>@\5"+
		"\b\5\2?\'\3\2\2\2?)\3\2\2\2?,\3\2\2\2?/\3\2\2\2?\62\3\2\2\2?\65\3\2\2"+
		"\2?9\3\2\2\2?<\3\2\2\2@\5\3\2\2\2AB\b\4\1\2BK\7%\2\2CK\7&\2\2DF\t\2\2"+
		"\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2JA\3\2\2"+
		"\2JC\3\2\2\2JG\3\2\2\2KQ\3\2\2\2LM\f\6\2\2MN\7\13\2\2NP\5\6\4\7OL\3\2"+
		"\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\7\3\2\2\2SQ\3\2\2\2TU\5\n\6\2UV\5"+
		"\b\5\2VY\3\2\2\2WY\5\n\6\2XT\3\2\2\2XW\3\2\2\2Y\t\3\2\2\2Z[\5\f\7\2[\\"+
		"\7\36\2\2\\]\5\22\n\2]\13\3\2\2\2^_\5\20\t\2_`\5\16\b\2`a\5\20\t\2a\r"+
		"\3\2\2\2bk\7$\2\2cd\7 \2\2dk\7$\2\2ef\7$\2\2fk\7 \2\2gh\7 \2\2hi\7$\2"+
		"\2ik\7 \2\2jb\3\2\2\2jc\3\2\2\2je\3\2\2\2jg\3\2\2\2k\17\3\2\2\2lu\7%\2"+
		"\2mu\7&\2\2no\7\20\2\2op\5\20\t\2pq\7\21\2\2qr\5\20\t\2rs\7\22\2\2su\3"+
		"\2\2\2tl\3\2\2\2tm\3\2\2\2tn\3\2\2\2u\21\3\2\2\2vw\b\n\1\2wx\5\24\13\2"+
		"x~\3\2\2\2yz\f\4\2\2z{\7\21\2\2{}\5\22\n\5|y\3\2\2\2}\u0080\3\2\2\2~|"+
		"\3\2\2\2~\177\3\2\2\2\177\23\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7%\2\2"+
		"\u0082\u0083\7\20\2\2\u0083\u0084\5\26\f\2\u0084\u0085\7\22\2\2\u0085"+
		"\u009a\3\2\2\2\u0086\u0087\7\23\2\2\u0087\u0088\5\22\n\2\u0088\u0089\7"+
		"\24\2\2\u0089\u008a\5\24\13\2\u008a\u009a\3\2\2\2\u008b\u008c\7\25\2\2"+
		"\u008c\u008d\5\22\n\2\u008d\u008e\7\26\2\2\u008e\u008f\5\24\13\2\u008f"+
		"\u009a\3\2\2\2\u0090\u009a\7%\2\2\u0091\u009a\7&\2\2\u0092\u0093\7\f\2"+
		"\2\u0093\u009a\5\24\13\2\u0094\u009a\7\f\2\2\u0095\u0096\7\20\2\2\u0096"+
		"\u0097\5\22\n\2\u0097\u0098\7\22\2\2\u0098\u009a\3\2\2\2\u0099\u0081\3"+
		"\2\2\2\u0099\u0086\3\2\2\2\u0099\u008b\3\2\2\2\u0099\u0090\3\2\2\2\u0099"+
		"\u0091\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2"+
		"\2\2\u009a\25\3\2\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\21\2\2\u009d"+
		"\u009e\5\26\f\2\u009e\u00a1\3\2\2\2\u009f\u00a1\5\24\13\2\u00a0\u009b"+
		"\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\5\32\16\2\u00a3"+
		"\u00a4\7\36\2\2\u00a4\u00a5\7&\2\2\u00a5\u00a6\7%\2\2\u00a6\u00a7\5\30"+
		"\r\2\u00a7\u00b7\3\2\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa\7&\2\2\u00aa"+
		"\u00ab\7%\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00b7\3\2\2\2\u00ad\u00ae\5\32"+
		"\16\2\u00ae\u00af\7&\2\2\u00af\u00b0\7%\2\2\u00b0\u00b7\3\2\2\2\u00b1"+
		"\u00b2\5\32\16\2\u00b2\u00b3\7\36\2\2\u00b3\u00b4\7&\2\2\u00b4\u00b5\7"+
		"%\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00a2\3\2\2\2\u00b6\u00a8\3\2\2\2\u00b6"+
		"\u00ad\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00bd\7\27\2"+
		"\2\u00b9\u00bd\7\30\2\2\u00ba\u00bd\7\31\2\2\u00bb\u00bd\7\32\2\2\u00bc"+
		"\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\33\3\2\2\2\u00be\u00bf\7&\2\2\u00bf\35\3\2\2\2\u00c0\u00c1"+
		"\b\20\1\2\u00c1\u00c8\7\33\2\2\u00c2\u00c8\7\34\2\2\u00c3\u00c8\7\35\2"+
		"\2\u00c4\u00c5\7%\2\2\u00c5\u00c8\5\36\20\4\u00c6\u00c8\7%\2\2\u00c7\u00c0"+
		"\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00ce\3\2\2\2\u00c9\u00ca\f\b\2\2\u00ca\u00cb\7\f"+
		"\2\2\u00cb\u00cd\5\36\20\t\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\37\3\2\2\2\u00d0\u00ce\3\2\2"+
		"\2\21#?GJQXjt~\u0099\u00a0\u00b6\u00bc\u00c7\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}