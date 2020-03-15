package Model.Parser;
// Generated from pparser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pparserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, COLON=27, EQ=28, STAR=29, NEQ=30, SEMI=31, HASH=32, 
		ARROW=33, VAR=34, NAME=35, NUM=36, COMMENT=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "COLON", "COMMA", "EQ", "DASH", "STAR", "NEQ", "SEMI", "HASH", 
		"ARROW", "VAR", "NAME", "NUM", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Protocol'", "'Types'", "'Knowledge'", "'Actions'", "'Goals'", 
		"'where'", "'['", "']'", "','", "'('", "')'", "'{'", "'}'", "'{|'", "'|}'", 
		"'secret between'", "'weakly authenticates'", "'on'", "'authenticates'", 
		"'Agent'", "'Number'", "'SeqNumber'", "'PublicKey'", "'Symmetric_key'", 
		"'Function'", "'Untyped'", "':'", "'='", "'*'", "'!='", "';'", "'#'", 
		"'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "COLON", "EQ", "STAR", "NEQ", "SEMI", "HASH", "ARROW", 
		"VAR", "NAME", "NUM", "COMMENT", "WS"
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


	public pparserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pparser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0155\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3$\3%\6%\u011f\n%\r%\16%\u0120\3%\7%\u0124\n%\f%\16%\u0127\13%"+
		"\3&\6&\u012a\n&\r&\16&\u012b\3\'\6\'\u012f\n\'\r\'\16\'\u0130\3\'\3\'"+
		"\6\'\u0135\n\'\r\'\16\'\u0136\5\'\u0139\n\'\3\'\3\'\5\'\u013d\n\'\3\'"+
		"\6\'\u0140\n\'\r\'\16\'\u0141\5\'\u0144\n\'\3(\3(\7(\u0148\n(\f(\16(\u014b"+
		"\13(\3(\3(\3)\6)\u0150\n)\r)\16)\u0151\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\2;\36=\2?\37A C!E\"G#I$K%M&"+
		"O\'Q(\3\2\7\4\2C\\c|\6\2\62;C\\aac|\4\2--//\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\2\u015d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		";\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5\\\3\2"+
		"\2\2\7b\3\2\2\2\tl\3\2\2\2\13t\3\2\2\2\rz\3\2\2\2\17\u0080\3\2\2\2\21"+
		"\u0082\3\2\2\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u008a"+
		"\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37\u0091\3\2\2\2!\u0094\3\2"+
		"\2\2#\u00a3\3\2\2\2%\u00b8\3\2\2\2\'\u00bb\3\2\2\2)\u00c9\3\2\2\2+\u00cf"+
		"\3\2\2\2-\u00d6\3\2\2\2/\u00e0\3\2\2\2\61\u00ea\3\2\2\2\63\u00f8\3\2\2"+
		"\2\65\u0101\3\2\2\2\67\u0109\3\2\2\29\u010b\3\2\2\2;\u010d\3\2\2\2=\u010f"+
		"\3\2\2\2?\u0111\3\2\2\2A\u0113\3\2\2\2C\u0116\3\2\2\2E\u0118\3\2\2\2G"+
		"\u011a\3\2\2\2I\u011e\3\2\2\2K\u0129\3\2\2\2M\u012e\3\2\2\2O\u0145\3\2"+
		"\2\2Q\u014f\3\2\2\2ST\7R\2\2TU\7t\2\2UV\7q\2\2VW\7v\2\2WX\7q\2\2XY\7e"+
		"\2\2YZ\7q\2\2Z[\7n\2\2[\4\3\2\2\2\\]\7V\2\2]^\7{\2\2^_\7r\2\2_`\7g\2\2"+
		"`a\7u\2\2a\6\3\2\2\2bc\7M\2\2cd\7p\2\2de\7q\2\2ef\7y\2\2fg\7n\2\2gh\7"+
		"g\2\2hi\7f\2\2ij\7i\2\2jk\7g\2\2k\b\3\2\2\2lm\7C\2\2mn\7e\2\2no\7v\2\2"+
		"op\7k\2\2pq\7q\2\2qr\7p\2\2rs\7u\2\2s\n\3\2\2\2tu\7I\2\2uv\7q\2\2vw\7"+
		"c\2\2wx\7n\2\2xy\7u\2\2y\f\3\2\2\2z{\7y\2\2{|\7j\2\2|}\7g\2\2}~\7t\2\2"+
		"~\177\7g\2\2\177\16\3\2\2\2\u0080\u0081\7]\2\2\u0081\20\3\2\2\2\u0082"+
		"\u0083\7_\2\2\u0083\22\3\2\2\2\u0084\u0085\7.\2\2\u0085\24\3\2\2\2\u0086"+
		"\u0087\7*\2\2\u0087\26\3\2\2\2\u0088\u0089\7+\2\2\u0089\30\3\2\2\2\u008a"+
		"\u008b\7}\2\2\u008b\32\3\2\2\2\u008c\u008d\7\177\2\2\u008d\34\3\2\2\2"+
		"\u008e\u008f\7}\2\2\u008f\u0090\7~\2\2\u0090\36\3\2\2\2\u0091\u0092\7"+
		"~\2\2\u0092\u0093\7\177\2\2\u0093 \3\2\2\2\u0094\u0095\7u\2\2\u0095\u0096"+
		"\7g\2\2\u0096\u0097\7e\2\2\u0097\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009a\7v\2\2\u009a\u009b\7\"\2\2\u009b\u009c\7d\2\2\u009c\u009d\7g\2"+
		"\2\u009d\u009e\7v\2\2\u009e\u009f\7y\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1\u00a2\7p\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7m\2\2\u00a7\u00a8\7n\2\2\u00a8"+
		"\u00a9\7{\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7w\2"+
		"\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7j\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7p\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7e\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7u\2\2"+
		"\u00b7$\3\2\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba&\3\2\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7j\2\2"+
		"\u00bf\u00c0\7g\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3"+
		"\7k\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7\u00c8\7u\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7C\2\2\u00ca"+
		"\u00cb\7i\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2"+
		"\u00ce*\3\2\2\2\u00cf\u00d0\7P\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7o\2"+
		"\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7t\2\2\u00d5,\3\2"+
		"\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7s\2\2\u00d9\u00da"+
		"\7P\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7d\2\2\u00dd"+
		"\u00de\7g\2\2\u00de\u00df\7t\2\2\u00df.\3\2\2\2\u00e0\u00e1\7R\2\2\u00e1"+
		"\u00e2\7w\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7k\2\2"+
		"\u00e5\u00e6\7e\2\2\u00e6\u00e7\7M\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9"+
		"\7{\2\2\u00e9\60\3\2\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec\7{\2\2\u00ec\u00ed"+
		"\7o\2\2\u00ed\u00ee\7o\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7v\2\2\u00f0"+
		"\u00f1\7t\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7a\2\2"+
		"\u00f4\u00f5\7m\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7{\2\2\u00f7\62\3\2"+
		"\2\2\u00f8\u00f9\7H\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc"+
		"\7e\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7p\2\2\u0100\64\3\2\2\2\u0101\u0102\7W\2\2\u0102\u0103\7p\2\2\u0103"+
		"\u0104\7v\2\2\u0104\u0105\7{\2\2\u0105\u0106\7r\2\2\u0106\u0107\7g\2\2"+
		"\u0107\u0108\7f\2\2\u0108\66\3\2\2\2\u0109\u010a\7<\2\2\u010a8\3\2\2\2"+
		"\u010b\u010c\7.\2\2\u010c:\3\2\2\2\u010d\u010e\7?\2\2\u010e<\3\2\2\2\u010f"+
		"\u0110\7/\2\2\u0110>\3\2\2\2\u0111\u0112\7,\2\2\u0112@\3\2\2\2\u0113\u0114"+
		"\7#\2\2\u0114\u0115\7?\2\2\u0115B\3\2\2\2\u0116\u0117\7=\2\2\u0117D\3"+
		"\2\2\2\u0118\u0119\7%\2\2\u0119F\3\2\2\2\u011a\u011b\7/\2\2\u011b\u011c"+
		"\7@\2\2\u011cH\3\2\2\2\u011d\u011f\t\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\3\2\2\2\u0122"+
		"\u0124\t\3\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126J\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a"+
		"\t\3\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012cL\3\2\2\2\u012d\u012f\4\62;\2\u012e\u012d\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0138"+
		"\3\2\2\2\u0132\u0134\7\60\2\2\u0133\u0135\4\62;\2\u0134\u0133\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0132\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0143\3\2\2\2\u013a"+
		"\u013c\7G\2\2\u013b\u013d\t\4\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013f\3\2\2\2\u013e\u0140\4\62;\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2"+
		"\2\2\u0143\u013a\3\2\2\2\u0143\u0144\3\2\2\2\u0144N\3\2\2\2\u0145\u0149"+
		"\7%\2\2\u0146\u0148\n\5\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u014d\b(\2\2\u014dP\3\2\2\2\u014e\u0150\t\6\2\2\u014f\u014e"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\b)\2\2\u0154R\3\2\2\2\20\2\u0120\u0123\u0125"+
		"\u0129\u012b\u0130\u0136\u0138\u013c\u0141\u0143\u0149\u0151\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}