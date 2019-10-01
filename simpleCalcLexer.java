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
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, FLOAT=15, ADDITION=16, MULT=17, 
		ALPHA=18, NUM=19, WHITESPACE=20, COMMENT=21, COMMENT2=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "ID", "FLOAT", "ADDITION", "MULT", 
			"ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'{'", "';'", "'}'", "'if'", "'('", "'||'", "')'", "'then'", 
			"'&&'", "'else'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "FLOAT", "ADDITION", "MULT", "ALPHA", "NUM", "WHITESPACE", 
			"COMMENT", "COMMENT2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\7\17X\n\17\f\17\16\17[\13\17\3\20\6\20^\n\20\r\20\16\20"+
		"_\3\20\3\20\6\20d\n\20\r\20\16\20e\5\20h\n\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\6\25s\n\25\r\25\16\25t\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\7\26}\n\26\f\26\16\26\u0080\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\7\27\u008a\n\27\f\27\16\27\u008d\13\27\3\27\3\27\3\27\3\27\3"+
		"\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\n\4\2--//\4\2,,\61\61"+
		"\t\2C\\aac|\u00c7\u00c8\u00da\u00da\u00e7\u00e8\u00fa\u00fa\3\2\62;\5"+
		"\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2\u009b\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3"+
		"\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21?\3\2\2\2\23"+
		"A\3\2\2\2\25F\3\2\2\2\27I\3\2\2\2\31N\3\2\2\2\33Q\3\2\2\2\35T\3\2\2\2"+
		"\37]\3\2\2\2!i\3\2\2\2#k\3\2\2\2%m\3\2\2\2\'o\3\2\2\2)r\3\2\2\2+x\3\2"+
		"\2\2-\u0083\3\2\2\2/\60\7?\2\2\60\4\3\2\2\2\61\62\7}\2\2\62\6\3\2\2\2"+
		"\63\64\7=\2\2\64\b\3\2\2\2\65\66\7\177\2\2\66\n\3\2\2\2\678\7k\2\289\7"+
		"h\2\29\f\3\2\2\2:;\7*\2\2;\16\3\2\2\2<=\7~\2\2=>\7~\2\2>\20\3\2\2\2?@"+
		"\7+\2\2@\22\3\2\2\2AB\7v\2\2BC\7j\2\2CD\7g\2\2DE\7p\2\2E\24\3\2\2\2FG"+
		"\7(\2\2GH\7(\2\2H\26\3\2\2\2IJ\7g\2\2JK\7n\2\2KL\7u\2\2LM\7g\2\2M\30\3"+
		"\2\2\2NO\7?\2\2OP\7?\2\2P\32\3\2\2\2QR\7#\2\2RS\7?\2\2S\34\3\2\2\2TY\5"+
		"%\23\2UX\5%\23\2VX\5\'\24\2WU\3\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ"+
		"\3\2\2\2Z\36\3\2\2\2[Y\3\2\2\2\\^\5\'\24\2]\\\3\2\2\2^_\3\2\2\2_]\3\2"+
		"\2\2_`\3\2\2\2`g\3\2\2\2ac\7\60\2\2bd\5\'\24\2cb\3\2\2\2de\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2fh\3\2\2\2ga\3\2\2\2gh\3\2\2\2h \3\2\2\2ij\t\2\2\2j\""+
		"\3\2\2\2kl\t\3\2\2l$\3\2\2\2mn\t\4\2\2n&\3\2\2\2op\t\5\2\2p(\3\2\2\2q"+
		"s\t\6\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\25\2\2"+
		"w*\3\2\2\2xy\7\61\2\2yz\7\61\2\2z~\3\2\2\2{}\n\7\2\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u0082\b\26\2\2\u0082,\3\2\2\2\u0083\u0084\7\61\2\2\u0084\u0085\7,\2\2"+
		"\u0085\u008b\3\2\2\2\u0086\u008a\n\b\2\2\u0087\u0088\7,\2\2\u0088\u008a"+
		"\n\t\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u008f\7,\2\2\u008f\u0090\7\61\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\b\27\2\2\u0092.\3\2\2\2\f\2WY_egt~\u0089\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}