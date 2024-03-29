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
		T__17=18, T__18=19, T__19=20, ID=21, FLOAT=22, ADDITION=23, MULT=24, ALPHA=25, 
		NUM=26, WHITESPACE=27, COMMENT=28, COMMENT2=29;
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
			"T__17", "T__18", "T__19", "ID", "FLOAT", "ADDITION", "MULT", "ALPHA", 
			"NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'{'", "';'", "'}'", "'while'", "'('", "')'", "'do'", "'if'", 
			"'then'", "'else'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'!'", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "ID", "FLOAT", 
			"ADDITION", "MULT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00b6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\7\26{\n\26\f\26\16"+
		"\26~\13\26\3\27\6\27\u0081\n\27\r\27\16\27\u0082\3\27\3\27\6\27\u0087"+
		"\n\27\r\27\16\27\u0088\5\27\u008b\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\6\34\u0096\n\34\r\34\16\34\u0097\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\7\35\u00a0\n\35\f\35\16\35\u00a3\13\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u00ad\n\36\f\36\16\36\u00b0\13\36\3\36\3\36\3\36"+
		"\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37\3\2\n\4\2--//\4\2,,\61\61\t\2C\\aac|\u00c7\u00c8\u00da"+
		"\u00da\u00e7\u00e8\u00fa\u00fa\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2"+
		",,\3\2\61\61\2\u00be\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2"+
		"\13E\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23R\3\2\2\2\25U\3\2\2"+
		"\2\27Z\3\2\2\2\31_\3\2\2\2\33b\3\2\2\2\35e\3\2\2\2\37g\3\2\2\2!j\3\2\2"+
		"\2#l\3\2\2\2%o\3\2\2\2\'q\3\2\2\2)t\3\2\2\2+w\3\2\2\2-\u0080\3\2\2\2/"+
		"\u008c\3\2\2\2\61\u008e\3\2\2\2\63\u0090\3\2\2\2\65\u0092\3\2\2\2\67\u0095"+
		"\3\2\2\29\u009b\3\2\2\2;\u00a6\3\2\2\2=>\7?\2\2>\4\3\2\2\2?@\7}\2\2@\6"+
		"\3\2\2\2AB\7=\2\2B\b\3\2\2\2CD\7\177\2\2D\n\3\2\2\2EF\7y\2\2FG\7j\2\2"+
		"GH\7k\2\2HI\7n\2\2IJ\7g\2\2J\f\3\2\2\2KL\7*\2\2L\16\3\2\2\2MN\7+\2\2N"+
		"\20\3\2\2\2OP\7f\2\2PQ\7q\2\2Q\22\3\2\2\2RS\7k\2\2ST\7h\2\2T\24\3\2\2"+
		"\2UV\7v\2\2VW\7j\2\2WX\7g\2\2XY\7p\2\2Y\26\3\2\2\2Z[\7g\2\2[\\\7n\2\2"+
		"\\]\7u\2\2]^\7g\2\2^\30\3\2\2\2_`\7?\2\2`a\7?\2\2a\32\3\2\2\2bc\7#\2\2"+
		"cd\7?\2\2d\34\3\2\2\2ef\7@\2\2f\36\3\2\2\2gh\7@\2\2hi\7?\2\2i \3\2\2\2"+
		"jk\7>\2\2k\"\3\2\2\2lm\7>\2\2mn\7?\2\2n$\3\2\2\2op\7#\2\2p&\3\2\2\2qr"+
		"\7(\2\2rs\7(\2\2s(\3\2\2\2tu\7~\2\2uv\7~\2\2v*\3\2\2\2w|\5\63\32\2x{\5"+
		"\63\32\2y{\5\65\33\2zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"},\3\2\2\2~|\3\2\2\2\177\u0081\5\65\33\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008a\3\2\2\2\u0084"+
		"\u0086\7\60\2\2\u0085\u0087\5\65\33\2\u0086\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0084\3\2\2\2\u008a\u008b\3\2\2\2\u008b.\3\2\2\2\u008c\u008d\t\2\2\2"+
		"\u008d\60\3\2\2\2\u008e\u008f\t\3\2\2\u008f\62\3\2\2\2\u0090\u0091\t\4"+
		"\2\2\u0091\64\3\2\2\2\u0092\u0093\t\5\2\2\u0093\66\3\2\2\2\u0094\u0096"+
		"\t\6\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\34\2\2\u009a8\3\2\2\2"+
		"\u009b\u009c\7\61\2\2\u009c\u009d\7\61\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0"+
		"\n\7\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\b\35"+
		"\2\2\u00a5:\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\7,\2\2\u00a8\u00ae"+
		"\3\2\2\2\u00a9\u00ad\n\b\2\2\u00aa\u00ab\7,\2\2\u00ab\u00ad\n\t\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b2\7,\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\36"+
		"\2\2\u00b5<\3\2\2\2\f\2z|\u0082\u0088\u008a\u0097\u00a1\u00ac\u00ae\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}