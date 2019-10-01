// Generated from simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ID=18, FLOAT=19, ADDITION=20, MULT=21, ALPHA=22, NUM=23, WHITESPACE=24, 
		COMMENT=25, COMMENT2=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"ID", "FLOAT", "ADDITION", "MULT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", 
			"COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'{'", "';'", "'}'", "'if'", "'('", "'||'", "')'", "'then'", 
			"'&&'", "'else'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "FLOAT", "ADDITION", "MULT", 
			"ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public simpleCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleCalc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\7\23j\n\23\f\23\16\23m\13\23\3\24"+
		"\6\24p\n\24\r\24\16\24q\3\24\3\24\6\24v\n\24\r\24\16\24w\5\24z\n\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\6\31\u0085\n\31\r\31\16\31"+
		"\u0086\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u008f\n\32\f\32\16\32\u0092"+
		"\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u009c\n\33\f\33\16"+
		"\33\u009f\13\33\3\33\3\33\3\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\3\2\n\4\2--//\4\2,,\61\61\t\2C\\aa"+
		"c|\u00c7\u00c8\u00da\u00da\u00e7\u00e8\u00fa\u00fa\3\2\62;\5\2\13\f\17"+
		"\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2"+
		"\rB\3\2\2\2\17D\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25N\3\2\2\2\27Q\3\2\2"+
		"\2\31V\3\2\2\2\33Y\3\2\2\2\35\\\3\2\2\2\37^\3\2\2\2!a\3\2\2\2#c\3\2\2"+
		"\2%f\3\2\2\2\'o\3\2\2\2){\3\2\2\2+}\3\2\2\2-\177\3\2\2\2/\u0081\3\2\2"+
		"\2\61\u0084\3\2\2\2\63\u008a\3\2\2\2\65\u0095\3\2\2\2\678\7?\2\28\4\3"+
		"\2\2\29:\7}\2\2:\6\3\2\2\2;<\7=\2\2<\b\3\2\2\2=>\7\177\2\2>\n\3\2\2\2"+
		"?@\7k\2\2@A\7h\2\2A\f\3\2\2\2BC\7*\2\2C\16\3\2\2\2DE\7~\2\2EF\7~\2\2F"+
		"\20\3\2\2\2GH\7+\2\2H\22\3\2\2\2IJ\7v\2\2JK\7j\2\2KL\7g\2\2LM\7p\2\2M"+
		"\24\3\2\2\2NO\7(\2\2OP\7(\2\2P\26\3\2\2\2QR\7g\2\2RS\7n\2\2ST\7u\2\2T"+
		"U\7g\2\2U\30\3\2\2\2VW\7?\2\2WX\7?\2\2X\32\3\2\2\2YZ\7#\2\2Z[\7?\2\2["+
		"\34\3\2\2\2\\]\7@\2\2]\36\3\2\2\2^_\7@\2\2_`\7?\2\2` \3\2\2\2ab\7>\2\2"+
		"b\"\3\2\2\2cd\7>\2\2de\7?\2\2e$\3\2\2\2fk\5-\27\2gj\5-\27\2hj\5/\30\2"+
		"ig\3\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l&\3\2\2\2mk\3\2\2\2"+
		"np\5/\30\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2ry\3\2\2\2su\7\60\2"+
		"\2tv\5/\30\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2ys\3\2\2"+
		"\2yz\3\2\2\2z(\3\2\2\2{|\t\2\2\2|*\3\2\2\2}~\t\3\2\2~,\3\2\2\2\177\u0080"+
		"\t\4\2\2\u0080.\3\2\2\2\u0081\u0082\t\5\2\2\u0082\60\3\2\2\2\u0083\u0085"+
		"\t\6\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\31\2\2\u0089\62\3\2\2"+
		"\2\u008a\u008b\7\61\2\2\u008b\u008c\7\61\2\2\u008c\u0090\3\2\2\2\u008d"+
		"\u008f\n\7\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\b\32\2\2\u0094\64\3\2\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7,\2"+
		"\2\u0097\u009d\3\2\2\2\u0098\u009c\n\b\2\2\u0099\u009a\7,\2\2\u009a\u009c"+
		"\n\t\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\b\33\2\2\u00a4\66\3\2\2\2\f\2ikqwy\u0086\u0090\u009b\u009d\3\b"+
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