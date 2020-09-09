package Model.Parser;

// Generated from pparser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pparserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, COLON=28, EQ=29, STAR=30, NEQ=31, SEMI=32, 
		HASH=33, ARROW=34, VAR=35, NAME=36, NUM=37, COMMENT=38, WS=39;
	public static final int
		RULE_start = 0, RULE_begin = 1, RULE_iknow = 2, RULE_brain = 3, RULE_act = 4, 
		RULE_w2w = 5, RULE_c = 6, RULE_w = 7, RULE_ws = 8, RULE_wai = 9, RULE_m = 10, 
		RULE_norm = 11, RULE_li = 12, RULE_goals = 13, RULE_g = 14, RULE_whattype = 15, 
		RULE_csep = 16, RULE_types = 17;
	public static final String[] ruleNames = {
		"start", "begin", "iknow", "brain", "act", "w2w", "c", "w", "ws", "wai", 
		"m", "norm", "li", "goals", "g", "whattype", "csep", "types"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Protocol'", "'Types'", "'Knowledge'", "'Actions'", "'Goals'", 
		"'where'", "'['", "']'", "','", "'('", "')'", "'{'", "'}'", "'{|'", "'|}'", 
		"'secret between'", "'weakly authenticates'", "'on'", "'authenticates'", 
		"'guessable'", "'Agent'", "'Number'", "'SeqNumber'", "'PublicKey'", "'Symmetric_key'", 
		"'Function'", "'Untyped'", "':'", "'='", "'*'", "'!='", "';'", "'#'", 
		"'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "COLON", "EQ", "STAR", "NEQ", "SEMI", "HASH", 
		"ARROW", "VAR", "NAME", "NUM", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "pparser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pparserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pparserParser.EOF, 0); }
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
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitStart(this);
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				begin();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0) );
			setState(41);
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
	public static class FunKnowledgeContext extends BeginContext {
		public Token title;
		public IknowContext fun;
		public TerminalNode COLON() { return getToken(pparserParser.COLON, 0); }
		public IknowContext iknow() {
			return getRuleContext(IknowContext.class,0);
		}
		public FunKnowledgeContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitFunKnowledge(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunGoalsContext extends BeginContext {
		public Token title;
		public GoalsContext fun;
		public TerminalNode COLON() { return getToken(pparserParser.COLON, 0); }
		public GoalsContext goals() {
			return getRuleContext(GoalsContext.class,0);
		}
		public FunGoalsContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitFunGoals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunTypesContext extends BeginContext {
		public Token title;
		public WhattypeContext fun;
		public TerminalNode COLON() { return getToken(pparserParser.COLON, 0); }
		public WhattypeContext whattype() {
			return getRuleContext(WhattypeContext.class,0);
		}
		public FunTypesContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitFunTypes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunProtocolContext extends BeginContext {
		public Token title;
		public Token n;
		public TerminalNode COLON() { return getToken(pparserParser.COLON, 0); }
		public TerminalNode NAME() { return getToken(pparserParser.NAME, 0); }
		public TerminalNode VAR() { return getToken(pparserParser.VAR, 0); }
		public FunProtocolContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitFunProtocol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunActionsContext extends BeginContext {
		public Token title;
		public ActContext fun;
		public TerminalNode COLON() { return getToken(pparserParser.COLON, 0); }
		public ActContext act() {
			return getRuleContext(ActContext.class,0);
		}
		public FunActionsContext(BeginContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitFunActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_begin);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new FunProtocolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((FunProtocolContext)_localctx).title = match(T__0);
				setState(44);
				match(COLON);
				setState(45);
				((FunProtocolContext)_localctx).n = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==NAME) ) {
					((FunProtocolContext)_localctx).n = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__1:
				_localctx = new FunTypesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				((FunTypesContext)_localctx).title = match(T__1);
				setState(47);
				match(COLON);
				setState(48);
				((FunTypesContext)_localctx).fun = whattype();
				}
				break;
			case T__2:
				_localctx = new FunKnowledgeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				((FunKnowledgeContext)_localctx).title = match(T__2);
				setState(50);
				match(COLON);
				setState(51);
				((FunKnowledgeContext)_localctx).fun = iknow();
				}
				break;
			case T__3:
				_localctx = new FunActionsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				((FunActionsContext)_localctx).title = match(T__3);
				setState(53);
				match(COLON);
				setState(54);
				((FunActionsContext)_localctx).fun = act();
				}
				break;
			case T__4:
				_localctx = new FunGoalsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				((FunGoalsContext)_localctx).title = match(T__4);
				setState(56);
				match(COLON);
				setState(57);
				((FunGoalsContext)_localctx).fun = goals();
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

	public static class IknowContext extends ParserRuleContext {
		public IknowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iknow; }
	 
		public IknowContext() { }
		public void copyFrom(IknowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunBrainWhereContext extends IknowContext {
		public BrainContext b;
		public Token whe;
		public WaiContext wa;
		public BrainContext brain() {
			return getRuleContext(BrainContext.class,0);
		}
		public WaiContext wai() {
			return getRuleContext(WaiContext.class,0);
		}
		public FunBrainWhereContext(IknowContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitFunBrainWhere(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunBrainContext extends IknowContext {
		public BrainContext b;
		public BrainContext brain() {
			return getRuleContext(BrainContext.class,0);
		}
		public FunBrainContext(IknowContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitFunBrain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IknowContext iknow() throws RecognitionException {
		IknowContext _localctx = new IknowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_iknow);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new FunBrainWhereContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((FunBrainWhereContext)_localctx).b = brain();
				setState(61);
				((FunBrainWhereContext)_localctx).whe = match(T__5);
				setState(62);
				((FunBrainWhereContext)_localctx).wa = wai();
				}
				break;
			case 2:
				_localctx = new FunBrainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				((FunBrainContext)_localctx).b = brain();
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

	public static class BrainContext extends ParserRuleContext {
		public BrainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brain; }
	 
		public BrainContext() { }
		public void copyFrom(BrainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BrainWithSemiContext extends BrainContext {
		public Token ag;
		public LiContext knows;
		public BrainContext fun;
		public TerminalNode COLON() { return getToken(pparserParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(pparserParser.SEMI, 0); }
		public TerminalNode VAR() { return getToken(pparserParser.VAR, 0); }
		public LiContext li() {
			return getRuleContext(LiContext.class,0);
		}
		public BrainContext brain() {
			return getRuleContext(BrainContext.class,0);
		}
		public BrainWithSemiContext(BrainContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitBrainWithSemi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BrainOptSemiContext extends BrainContext {
		public Token ag;
		public LiContext knows;
		public TerminalNode COLON() { return getToken(pparserParser.COLON, 0); }
		public TerminalNode VAR() { return getToken(pparserParser.VAR, 0); }
		public LiContext li() {
			return getRuleContext(LiContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pparserParser.SEMI, 0); }
		public BrainOptSemiContext(BrainContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitBrainOptSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrainContext brain() throws RecognitionException {
		BrainContext _localctx = new BrainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_brain);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BrainWithSemiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((BrainWithSemiContext)_localctx).ag = match(VAR);
				setState(68);
				match(COLON);
				setState(69);
				((BrainWithSemiContext)_localctx).knows = li();
				setState(70);
				match(SEMI);
				setState(71);
				((BrainWithSemiContext)_localctx).fun = brain();
				}
				break;
			case 2:
				_localctx = new BrainOptSemiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((BrainOptSemiContext)_localctx).ag = match(VAR);
				setState(74);
				match(COLON);
				setState(75);
				((BrainOptSemiContext)_localctx).knows = li();
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(76);
					match(SEMI);
					}
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
	public static class NotlastActContext extends ActContext {
		public W2wContext fun;
		public MContext mes;
		public ActContext fun2;
		public TerminalNode COLON() { return getToken(pparserParser.COLON, 0); }
		public W2wContext w2w() {
			return getRuleContext(W2wContext.class,0);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public ActContext act() {
			return getRuleContext(ActContext.class,0);
		}
		public NotlastActContext(ActContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitNotlastAct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastActContext extends ActContext {
		public W2wContext fun;
		public MContext mes;
		public TerminalNode COLON() { return getToken(pparserParser.COLON, 0); }
		public W2wContext w2w() {
			return getRuleContext(W2wContext.class,0);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public LastActContext(ActContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitLastAct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActContext act() throws RecognitionException {
		ActContext _localctx = new ActContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_act);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NotlastActContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				((NotlastActContext)_localctx).fun = w2w();
				setState(82);
				match(COLON);
				setState(83);
				((NotlastActContext)_localctx).mes = m(0);
				setState(84);
				((NotlastActContext)_localctx).fun2 = act();
				}
				break;
			case 2:
				_localctx = new LastActContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((LastActContext)_localctx).fun = w2w();
				setState(87);
				match(COLON);
				setState(88);
				((LastActContext)_localctx).mes = m(0);
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
	public static class FunFromToContext extends W2wContext {
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
		public FunFromToContext(W2wContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitFunFromTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final W2wContext w2w() throws RecognitionException {
		W2wContext _localctx = new W2wContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_w2w);
		try {
			_localctx = new FunFromToContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((FunFromToContext)_localctx).from = w();
			setState(93);
			((FunFromToContext)_localctx).arrow = c();
			setState(94);
			((FunFromToContext)_localctx).to = w();
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
		public Token s;
		public Token a;
		public TerminalNode STAR() { return getToken(pparserParser.STAR, 0); }
		public TerminalNode ARROW() { return getToken(pparserParser.ARROW, 0); }
		public StarContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StararrowstarContext extends CContext {
		public Token s1;
		public Token a;
		public Token s2;
		public List<TerminalNode> STAR() { return getTokens(pparserParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(pparserParser.STAR, i);
		}
		public TerminalNode ARROW() { return getToken(pparserParser.ARROW, 0); }
		public StararrowstarContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitStararrowstar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrowstarContext extends CContext {
		public Token a;
		public Token s;
		public TerminalNode ARROW() { return getToken(pparserParser.ARROW, 0); }
		public TerminalNode STAR() { return getToken(pparserParser.STAR, 0); }
		public ArrowstarContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitArrowstar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegularContext extends CContext {
		public Token a;
		public TerminalNode ARROW() { return getToken(pparserParser.ARROW, 0); }
		public RegularContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitRegular(this);
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
				((RegularContext)_localctx).a = match(ARROW);
				}
				break;
			case 2:
				_localctx = new StarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				((StarContext)_localctx).s = match(STAR);
				setState(98);
				((StarContext)_localctx).a = match(ARROW);
				}
				break;
			case 3:
				_localctx = new ArrowstarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				((ArrowstarContext)_localctx).a = match(ARROW);
				setState(100);
				((ArrowstarContext)_localctx).s = match(STAR);
				}
				break;
			case 4:
				_localctx = new StararrowstarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				((StararrowstarContext)_localctx).s1 = match(STAR);
				setState(102);
				((StararrowstarContext)_localctx).a = match(ARROW);
				setState(103);
				((StararrowstarContext)_localctx).s2 = match(STAR);
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
	public static class NormalContext extends WContext {
		public Token v;
		public TerminalNode VAR() { return getToken(pparserParser.VAR, 0); }
		public NormalContext(WContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitNormal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SquareContext extends WContext {
		public Token v;
		public TerminalNode VAR() { return getToken(pparserParser.VAR, 0); }
		public SquareContext(WContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitSquare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SquaremessContext extends WContext {
		public Token v;
		public MContext mes;
		public TerminalNode COLON() { return getToken(pparserParser.COLON, 0); }
		public TerminalNode VAR() { return getToken(pparserParser.VAR, 0); }
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public SquaremessContext(WContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitSquaremess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WContext w() throws RecognitionException {
		WContext _localctx = new WContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_w);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new NormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((NormalContext)_localctx).v = match(VAR);
				}
				break;
			case 2:
				_localctx = new SquareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__6);
				setState(108);
				((SquareContext)_localctx).v = match(VAR);
				setState(109);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new SquaremessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(T__6);
				setState(111);
				((SquaremessContext)_localctx).v = match(VAR);
				setState(112);
				match(COLON);
				setState(113);
				((SquaremessContext)_localctx).mes = m(0);
				setState(114);
				match(T__7);
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

	public static class WsContext extends ParserRuleContext {
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
	 
		public WsContext() { }
		public void copyFrom(WsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WscommaContext extends WsContext {
		public WContext w1;
		public WsContext ws1;
		public WContext w() {
			return getRuleContext(WContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public WscommaContext(WsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitWscomma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WsnocommaContext extends WsContext {
		public WContext w1;
		public WContext w() {
			return getRuleContext(WContext.class,0);
		}
		public WsnocommaContext(WsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitWsnocomma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ws);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new WscommaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((WscommaContext)_localctx).w1 = w();
				setState(119);
				match(T__8);
				setState(120);
				((WscommaContext)_localctx).ws1 = ws();
				}
				break;
			case 2:
				_localctx = new WsnocommaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				((WsnocommaContext)_localctx).w1 = w();
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

	public static class WaiContext extends ParserRuleContext {
		public WaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wai; }
	 
		public WaiContext() { }
		public void copyFrom(WaiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WaimoreContext extends WaiContext {
		public MContext mes1;
		public MContext mes2;
		public WaiContext wa;
		public TerminalNode NEQ() { return getToken(pparserParser.NEQ, 0); }
		public List<MContext> m() {
			return getRuleContexts(MContext.class);
		}
		public MContext m(int i) {
			return getRuleContext(MContext.class,i);
		}
		public WaiContext wai() {
			return getRuleContext(WaiContext.class,0);
		}
		public WaimoreContext(WaiContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitWaimore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WaisingleContext extends WaiContext {
		public MContext mes1;
		public MContext mes2;
		public TerminalNode NEQ() { return getToken(pparserParser.NEQ, 0); }
		public List<MContext> m() {
			return getRuleContexts(MContext.class);
		}
		public MContext m(int i) {
			return getRuleContext(MContext.class,i);
		}
		public WaisingleContext(WaiContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitWaisingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaiContext wai() throws RecognitionException {
		WaiContext _localctx = new WaiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_wai);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new WaisingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((WaisingleContext)_localctx).mes1 = m(0);
				setState(126);
				match(NEQ);
				setState(127);
				((WaisingleContext)_localctx).mes2 = m(0);
				}
				break;
			case 2:
				_localctx = new WaimoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				((WaimoreContext)_localctx).mes1 = m(0);
				setState(130);
				match(NEQ);
				setState(131);
				((WaimoreContext)_localctx).mes2 = m(0);
				setState(132);
				match(T__8);
				setState(133);
				((WaimoreContext)_localctx).wa = wai();
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
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitMnocomma(this);
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
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitMcomma(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_m, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MnocommaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(138);
			((MnocommaContext)_localctx).n = norm();
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new McommaContext(new MContext(_parentctx, _parentState));
					((McommaContext)_localctx).mes1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_m);
					setState(140);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(141);
					match(T__8);
					setState(142);
					((McommaContext)_localctx).mes2 = m(3);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public TerminalNode VAR() { return getToken(pparserParser.VAR, 0); }
		public LiContext li() {
			return getRuleContext(LiContext.class,0);
		}
		public NormfunctionContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitNormfunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormvariableContext extends NormContext {
		public Token v;
		public TerminalNode VAR() { return getToken(pparserParser.VAR, 0); }
		public NormvariableContext(NormContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitNormvariable(this);
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
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitNormenc(this);
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
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitNormparenth(this);
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
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitNormnoenc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormContext norm() throws RecognitionException {
		NormContext _localctx = new NormContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_norm);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new NormfunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((NormfunctionContext)_localctx).v = match(VAR);
				setState(149);
				match(T__9);
				setState(150);
				((NormfunctionContext)_localctx).l = li();
				setState(151);
				match(T__10);
				}
				break;
			case 2:
				_localctx = new NormnoencContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__11);
				setState(154);
				((NormnoencContext)_localctx).mes = m(0);
				setState(155);
				match(T__12);
				setState(156);
				((NormnoencContext)_localctx).n = norm();
				}
				break;
			case 3:
				_localctx = new NormencContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(T__13);
				setState(159);
				((NormencContext)_localctx).mes = m(0);
				setState(160);
				match(T__14);
				setState(161);
				((NormencContext)_localctx).n = norm();
				}
				break;
			case 4:
				_localctx = new NormvariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				((NormvariableContext)_localctx).v = match(VAR);
				}
				break;
			case 5:
				_localctx = new NormparenthContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(T__9);
				setState(165);
				((NormparenthContext)_localctx).mes = m(0);
				setState(166);
				match(T__10);
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
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitLisingle(this);
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
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitLimore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiContext li() throws RecognitionException {
		LiContext _localctx = new LiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_li);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new LimoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				((LimoreContext)_localctx).no = norm();
				setState(171);
				match(T__8);
				setState(172);
				((LimoreContext)_localctx).l = li();
				}
				break;
			case 2:
				_localctx = new LisingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
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

	public static class GoalsContext extends ParserRuleContext {
		public GoalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goals; }
	 
		public GoalsContext() { }
		public void copyFrom(GoalsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GoalssingleContext extends GoalsContext {
		public GContext fun;
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public GoalssingleContext(GoalsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitGoalssingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GoalsmoreContext extends GoalsContext {
		public GContext fun1;
		public GoalsContext fun2;
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public GoalsContext goals() {
			return getRuleContext(GoalsContext.class,0);
		}
		public GoalsmoreContext(GoalsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitGoalsmore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalsContext goals() throws RecognitionException {
		GoalsContext _localctx = new GoalsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_goals);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new GoalsmoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				((GoalsmoreContext)_localctx).fun1 = g();
				setState(178);
				((GoalsmoreContext)_localctx).fun2 = goals();
				}
				break;
			case 2:
				_localctx = new GoalssingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				((GoalssingleContext)_localctx).fun = g();
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

	public static class GContext extends ParserRuleContext {
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
	 
		public GContext() { }
		public void copyFrom(GContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WeaklyauthentContext extends GContext {
		public WContext fun1;
		public WContext fun2;
		public MContext mes;
		public List<WContext> w() {
			return getRuleContexts(WContext.class);
		}
		public WContext w(int i) {
			return getRuleContext(WContext.class,i);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public WeaklyauthentContext(GContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitWeaklyauthent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AuthentContext extends GContext {
		public WContext fun1;
		public WContext fun2;
		public MContext mes;
		public List<WContext> w() {
			return getRuleContexts(WContext.class);
		}
		public WContext w(int i) {
			return getRuleContext(WContext.class,i);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public AuthentContext(GContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitAuthent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GuessablesecretbetweenContext extends GContext {
		public MContext mes;
		public WsContext fun;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public GuessablesecretbetweenContext(GContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitGuessablesecretbetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrowmsgContext extends GContext {
		public W2wContext fun;
		public MContext mes;
		public TerminalNode COLON() { return getToken(pparserParser.COLON, 0); }
		public W2wContext w2w() {
			return getRuleContext(W2wContext.class,0);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public ArrowmsgContext(GContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitArrowmsg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SecretbetweenContext extends GContext {
		public MContext mes;
		public WsContext fun;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public SecretbetweenContext(GContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitSecretbetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_g);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new SecretbetweenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((SecretbetweenContext)_localctx).mes = m(0);
				setState(184);
				match(T__15);
				setState(185);
				((SecretbetweenContext)_localctx).fun = ws();
				}
				break;
			case 2:
				_localctx = new WeaklyauthentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				((WeaklyauthentContext)_localctx).fun1 = w();
				setState(188);
				match(T__16);
				setState(189);
				((WeaklyauthentContext)_localctx).fun2 = w();
				setState(190);
				match(T__17);
				setState(191);
				((WeaklyauthentContext)_localctx).mes = m(0);
				}
				break;
			case 3:
				_localctx = new AuthentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				((AuthentContext)_localctx).fun1 = w();
				setState(194);
				match(T__18);
				setState(195);
				((AuthentContext)_localctx).fun2 = w();
				setState(196);
				match(T__17);
				setState(197);
				((AuthentContext)_localctx).mes = m(0);
				}
				break;
			case 4:
				_localctx = new ArrowmsgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				((ArrowmsgContext)_localctx).fun = w2w();
				setState(200);
				match(COLON);
				setState(201);
				((ArrowmsgContext)_localctx).mes = m(0);
				}
				break;
			case 5:
				_localctx = new GuessablesecretbetweenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				((GuessablesecretbetweenContext)_localctx).mes = m(0);
				setState(204);
				match(T__19);
				setState(205);
				match(T__15);
				setState(206);
				((GuessablesecretbetweenContext)_localctx).fun = ws();
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

	public static class WhattypeContext extends ParserRuleContext {
		public WhattypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whattype; }
	 
		public WhattypeContext() { }
		public void copyFrom(WhattypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypesoptsemiContext extends WhattypeContext {
		public TypesContext type;
		public CsepContext cs;
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public CsepContext csep() {
			return getRuleContext(CsepContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pparserParser.SEMI, 0); }
		public TypesoptsemiContext(WhattypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitTypesoptsemi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypesemiContext extends WhattypeContext {
		public TypesContext type;
		public CsepContext cs;
		public WhattypeContext fun;
		public TerminalNode SEMI() { return getToken(pparserParser.SEMI, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public CsepContext csep() {
			return getRuleContext(CsepContext.class,0);
		}
		public WhattypeContext whattype() {
			return getRuleContext(WhattypeContext.class,0);
		}
		public TypesemiContext(WhattypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitTypesemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhattypeContext whattype() throws RecognitionException {
		WhattypeContext _localctx = new WhattypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whattype);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new TypesoptsemiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((TypesoptsemiContext)_localctx).type = types();
				setState(211);
				((TypesoptsemiContext)_localctx).cs = csep();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(212);
					match(SEMI);
					}
				}

				}
				break;
			case 2:
				_localctx = new TypesemiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				((TypesemiContext)_localctx).type = types();
				setState(216);
				((TypesemiContext)_localctx).cs = csep();
				setState(217);
				match(SEMI);
				setState(218);
				((TypesemiContext)_localctx).fun = whattype();
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

	public static class CsepContext extends ParserRuleContext {
		public CsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csep; }
	 
		public CsepContext() { }
		public void copyFrom(CsepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CsepmoreContext extends CsepContext {
		public Token v;
		public CsepContext fun;
		public TerminalNode VAR() { return getToken(pparserParser.VAR, 0); }
		public CsepContext csep() {
			return getRuleContext(CsepContext.class,0);
		}
		public CsepmoreContext(CsepContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitCsepmore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CsepsingleContext extends CsepContext {
		public Token v;
		public TerminalNode VAR() { return getToken(pparserParser.VAR, 0); }
		public CsepsingleContext(CsepContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitCsepsingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsepContext csep() throws RecognitionException {
		CsepContext _localctx = new CsepContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_csep);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new CsepsingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				((CsepsingleContext)_localctx).v = match(VAR);
				}
				break;
			case 2:
				_localctx = new CsepmoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				((CsepmoreContext)_localctx).v = match(VAR);
				setState(224);
				match(T__8);
				setState(225);
				((CsepmoreContext)_localctx).fun = csep();
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
	public static class SymkContext extends TypesContext {
		public Token t;
		public SymkContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitSymk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncContext extends TypesContext {
		public Token t;
		public FuncContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AgContext extends TypesContext {
		public Token t;
		public AgContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitAg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NuContext extends TypesContext {
		public Token t;
		public NuContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitNu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UntContext extends TypesContext {
		public Token t;
		public UntContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitUnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PkContext extends TypesContext {
		public Token t;
		public PkContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitPk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqContext extends TypesContext {
		public Token t;
		public SeqContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pparserVisitor ) return ((pparserVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_types);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new AgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				((AgContext)_localctx).t = match(T__20);
				}
				break;
			case T__21:
				_localctx = new NuContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((NuContext)_localctx).t = match(T__21);
				}
				break;
			case T__22:
				_localctx = new SeqContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				((SeqContext)_localctx).t = match(T__22);
				}
				break;
			case T__23:
				_localctx = new PkContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				((PkContext)_localctx).t = match(T__23);
				}
				break;
			case T__24:
				_localctx = new SymkContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				((SymkContext)_localctx).t = match(T__24);
				}
				break;
			case T__25:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				((FuncContext)_localctx).t = match(T__25);
				}
				break;
			case T__26:
				_localctx = new UntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				((UntContext)_localctx).t = match(T__26);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return m_sempred((MContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean m_sempred(MContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\4\5\4D\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\5\5R\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bk\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tw\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0092\n\f\f\f\16"+
		"\f\u0095\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00b2"+
		"\n\16\3\17\3\17\3\17\3\17\5\17\u00b8\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\5\21\u00d8\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00df\n\21\3\22\3\22\3\22\3\22\5\22"+
		"\u00e5\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ee\n\23\3\23\2"+
		"\3\26\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2%&\2\u0101"+
		"\2\'\3\2\2\2\4<\3\2\2\2\6C\3\2\2\2\bQ\3\2\2\2\n\\\3\2\2\2\f^\3\2\2\2\16"+
		"j\3\2\2\2\20v\3\2\2\2\22}\3\2\2\2\24\u0089\3\2\2\2\26\u008b\3\2\2\2\30"+
		"\u00aa\3\2\2\2\32\u00b1\3\2\2\2\34\u00b7\3\2\2\2\36\u00d2\3\2\2\2 \u00de"+
		"\3\2\2\2\"\u00e4\3\2\2\2$\u00ed\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\2\2\3,\3\3\2\2\2-.\7\3\2\2./\7\36"+
		"\2\2/=\t\2\2\2\60\61\7\4\2\2\61\62\7\36\2\2\62=\5 \21\2\63\64\7\5\2\2"+
		"\64\65\7\36\2\2\65=\5\6\4\2\66\67\7\6\2\2\678\7\36\2\28=\5\n\6\29:\7\7"+
		"\2\2:;\7\36\2\2;=\5\34\17\2<-\3\2\2\2<\60\3\2\2\2<\63\3\2\2\2<\66\3\2"+
		"\2\2<9\3\2\2\2=\5\3\2\2\2>?\5\b\5\2?@\7\b\2\2@A\5\24\13\2AD\3\2\2\2BD"+
		"\5\b\5\2C>\3\2\2\2CB\3\2\2\2D\7\3\2\2\2EF\7%\2\2FG\7\36\2\2GH\5\32\16"+
		"\2HI\7\"\2\2IJ\5\b\5\2JR\3\2\2\2KL\7%\2\2LM\7\36\2\2MO\5\32\16\2NP\7\""+
		"\2\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QE\3\2\2\2QK\3\2\2\2R\t\3\2\2\2ST\5"+
		"\f\7\2TU\7\36\2\2UV\5\26\f\2VW\5\n\6\2W]\3\2\2\2XY\5\f\7\2YZ\7\36\2\2"+
		"Z[\5\26\f\2[]\3\2\2\2\\S\3\2\2\2\\X\3\2\2\2]\13\3\2\2\2^_\5\20\t\2_`\5"+
		"\16\b\2`a\5\20\t\2a\r\3\2\2\2bk\7$\2\2cd\7 \2\2dk\7$\2\2ef\7$\2\2fk\7"+
		" \2\2gh\7 \2\2hi\7$\2\2ik\7 \2\2jb\3\2\2\2jc\3\2\2\2je\3\2\2\2jg\3\2\2"+
		"\2k\17\3\2\2\2lw\7%\2\2mn\7\t\2\2no\7%\2\2ow\7\n\2\2pq\7\t\2\2qr\7%\2"+
		"\2rs\7\36\2\2st\5\26\f\2tu\7\n\2\2uw\3\2\2\2vl\3\2\2\2vm\3\2\2\2vp\3\2"+
		"\2\2w\21\3\2\2\2xy\5\20\t\2yz\7\13\2\2z{\5\22\n\2{~\3\2\2\2|~\5\20\t\2"+
		"}x\3\2\2\2}|\3\2\2\2~\23\3\2\2\2\177\u0080\5\26\f\2\u0080\u0081\7!\2\2"+
		"\u0081\u0082\5\26\f\2\u0082\u008a\3\2\2\2\u0083\u0084\5\26\f\2\u0084\u0085"+
		"\7!\2\2\u0085\u0086\5\26\f\2\u0086\u0087\7\13\2\2\u0087\u0088\5\24\13"+
		"\2\u0088\u008a\3\2\2\2\u0089\177\3\2\2\2\u0089\u0083\3\2\2\2\u008a\25"+
		"\3\2\2\2\u008b\u008c\b\f\1\2\u008c\u008d\5\30\r\2\u008d\u0093\3\2\2\2"+
		"\u008e\u008f\f\4\2\2\u008f\u0090\7\13\2\2\u0090\u0092\5\26\f\5\u0091\u008e"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\27\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7%\2\2\u0097\u0098\7\f\2\2"+
		"\u0098\u0099\5\32\16\2\u0099\u009a\7\r\2\2\u009a\u00ab\3\2\2\2\u009b\u009c"+
		"\7\16\2\2\u009c\u009d\5\26\f\2\u009d\u009e\7\17\2\2\u009e\u009f\5\30\r"+
		"\2\u009f\u00ab\3\2\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2\5\26\f\2\u00a2"+
		"\u00a3\7\21\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00ab\3\2\2\2\u00a5\u00ab\7"+
		"%\2\2\u00a6\u00a7\7\f\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\7\r\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u0096\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u00a0\3\2"+
		"\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab\31\3\2\2\2\u00ac\u00ad"+
		"\5\30\r\2\u00ad\u00ae\7\13\2\2\u00ae\u00af\5\32\16\2\u00af\u00b2\3\2\2"+
		"\2\u00b0\u00b2\5\30\r\2\u00b1\u00ac\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\33\3\2\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\5\34\17\2\u00b5\u00b8\3"+
		"\2\2\2\u00b6\u00b8\5\36\20\2\u00b7\u00b3\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\35\3\2\2\2\u00b9\u00ba\5\26\f\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\5\22"+
		"\n\2\u00bc\u00d3\3\2\2\2\u00bd\u00be\5\20\t\2\u00be\u00bf\7\23\2\2\u00bf"+
		"\u00c0\5\20\t\2\u00c0\u00c1\7\24\2\2\u00c1\u00c2\5\26\f\2\u00c2\u00d3"+
		"\3\2\2\2\u00c3\u00c4\5\20\t\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6\5\20\t"+
		"\2\u00c6\u00c7\7\24\2\2\u00c7\u00c8\5\26\f\2\u00c8\u00d3\3\2\2\2\u00c9"+
		"\u00ca\5\f\7\2\u00ca\u00cb\7\36\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00d3\3"+
		"\2\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf\7\26\2\2\u00cf\u00d0\7\22\2\2"+
		"\u00d0\u00d1\5\22\n\2\u00d1\u00d3\3\2\2\2\u00d2\u00b9\3\2\2\2\u00d2\u00bd"+
		"\3\2\2\2\u00d2\u00c3\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3"+
		"\37\3\2\2\2\u00d4\u00d5\5$\23\2\u00d5\u00d7\5\"\22\2\u00d6\u00d8\7\"\2"+
		"\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00df\3\2\2\2\u00d9\u00da"+
		"\5$\23\2\u00da\u00db\5\"\22\2\u00db\u00dc\7\"\2\2\u00dc\u00dd\5 \21\2"+
		"\u00dd\u00df\3\2\2\2\u00de\u00d4\3\2\2\2\u00de\u00d9\3\2\2\2\u00df!\3"+
		"\2\2\2\u00e0\u00e5\7%\2\2\u00e1\u00e2\7%\2\2\u00e2\u00e3\7\13\2\2\u00e3"+
		"\u00e5\5\"\22\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5#\3\2\2\2"+
		"\u00e6\u00ee\7\27\2\2\u00e7\u00ee\7\30\2\2\u00e8\u00ee\7\31\2\2\u00e9"+
		"\u00ee\7\32\2\2\u00ea\u00ee\7\33\2\2\u00eb\u00ee\7\34\2\2\u00ec\u00ee"+
		"\7\35\2\2\u00ed\u00e6\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e8\3\2\2\2"+
		"\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee%\3\2\2\2\25)<COQ\\jv}\u0089\u0093\u00aa\u00b1\u00b7\u00d2"+
		"\u00d7\u00de\u00e4\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}