// Generated from C:/Users/amr25/Desktop/Compilers/src\Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INHERITS=1, CLASS=2, IF=3, THEN=4, ELSE=5, FI=6, WHILE=7, LOOP=8, POOL=9, 
		LET=10, IN=11, CASE=12, OF=13, ESAC=14, ISVOID=15, NOT=16, NEW=17, TRUE=18, 
		FALSE=19, INTEGER=20, LITERAL=21, TYPE=22, ID=23, ASSIGN_OPERATOR=24, 
		CASE_ARROW=25, EQUAL=26, SMALLER_THAN=27, BIGGER_THAN=28, LESS_THAN_OR_EQUAL=29, 
		PLUS=30, MINUS=31, DIVIDED=32, MULTIPLY=33, INTEGER_NEGATIVE=34, WHITESPACE=35, 
		NEWLINE=36, OPEN_COMMENT=37, CLOSE_COMMENT=38, COMMENT=39, ONE_LINE_COMMENT=40, 
		OPEN_CURLY=41, CLOSE_CURLY=42, OPENP_RANSIS=43, CLOSE_PRANSIS=44, OPEN_SQUARE=45, 
		CLOSE_SQUARE=46, SEMICOLUN=47, COLUN=48, COMMA=49, DOT=50, AT=51, ERROR=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INHERITS", "CLASS", "IF", "THEN", "ELSE", "FI", "WHILE", "LOOP", "POOL", 
			"LET", "IN", "CASE", "OF", "ESAC", "ISVOID", "NOT", "NEW", "TRUE", "FALSE", 
			"INTEGER", "LITERAL", "TYPE", "ID", "ASSIGN_OPERATOR", "CASE_ARROW", 
			"EQUAL", "SMALLER_THAN", "BIGGER_THAN", "LESS_THAN_OR_EQUAL", "PLUS", 
			"MINUS", "DIVIDED", "MULTIPLY", "INTEGER_NEGATIVE", "WHITESPACE", "NEWLINE", 
			"OPEN_COMMENT", "CLOSE_COMMENT", "COMMENT", "ONE_LINE_COMMENT", "OPEN_CURLY", 
			"CLOSE_CURLY", "OPENP_RANSIS", "CLOSE_PRANSIS", "OPEN_SQUARE", "CLOSE_SQUARE", 
			"SEMICOLUN", "COLUN", "COMMA", "DOT", "AT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inherits'", "'class'", "'if'", "'then'", "'else'", "'fi'", "'while'", 
			"'loop'", "'pool'", "'let'", "'in'", "'case'", "'of'", "'esac'", "'isvoid'", 
			"'not'", "'new'", "'true'", "'false'", null, null, null, null, "'<-'", 
			"'=>'", "'='", "'<'", "'>'", "'<='", "'+'", "'-'", "'/'", "'*'", "'~'", 
			null, null, "'(*'", "'*)'", null, null, "'{'", "'}'", "'('", "')'", "'['", 
			"']'", "';'", "':'", "','", "'.'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INHERITS", "CLASS", "IF", "THEN", "ELSE", "FI", "WHILE", "LOOP", 
			"POOL", "LET", "IN", "CASE", "OF", "ESAC", "ISVOID", "NOT", "NEW", "TRUE", 
			"FALSE", "INTEGER", "LITERAL", "TYPE", "ID", "ASSIGN_OPERATOR", "CASE_ARROW", 
			"EQUAL", "SMALLER_THAN", "BIGGER_THAN", "LESS_THAN_OR_EQUAL", "PLUS", 
			"MINUS", "DIVIDED", "MULTIPLY", "INTEGER_NEGATIVE", "WHITESPACE", "NEWLINE", 
			"OPEN_COMMENT", "CLOSE_COMMENT", "COMMENT", "ONE_LINE_COMMENT", "OPEN_CURLY", 
			"CLOSE_CURLY", "OPENP_RANSIS", "CLOSE_PRANSIS", "OPEN_SQUARE", "CLOSE_SQUARE", 
			"SEMICOLUN", "COLUN", "COMMA", "DOT", "AT", "ERROR"
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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cool.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0142\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\6\25\u00ca\n\25\r\25\16\25\u00cb\3\26\3\26\7\26\u00d0\n"+
		"\26\f\26\16\26\u00d3\13\26\3\26\3\26\3\27\3\27\7\27\u00d9\n\27\f\27\16"+
		"\27\u00dc\13\27\3\30\3\30\7\30\u00e0\n\30\f\30\16\30\u00e3\13\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\5%\u0103\n%\3%\3%"+
		"\5%\u0107\n%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\7(\u0114\n(\f(\16(\u0117"+
		"\13(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u0121\n)\f)\16)\u0124\13)\3)\5)\u0127"+
		"\n)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\u0115\2\66\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\t\3\2\62;\13\2\"#%\'--/"+
		"\60\62<B\\^^``c|\3\2C\\\6\2\62;C\\aac|\4\2C\\c|\4\2\13\13\"\"\3\2\f\f"+
		"\2\u014b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2"+
		"\5t\3\2\2\2\7z\3\2\2\2\t}\3\2\2\2\13\u0082\3\2\2\2\r\u0087\3\2\2\2\17"+
		"\u008a\3\2\2\2\21\u0090\3\2\2\2\23\u0095\3\2\2\2\25\u009a\3\2\2\2\27\u009e"+
		"\3\2\2\2\31\u00a1\3\2\2\2\33\u00a6\3\2\2\2\35\u00a9\3\2\2\2\37\u00ae\3"+
		"\2\2\2!\u00b5\3\2\2\2#\u00b9\3\2\2\2%\u00bd\3\2\2\2\'\u00c2\3\2\2\2)\u00c9"+
		"\3\2\2\2+\u00cd\3\2\2\2-\u00d6\3\2\2\2/\u00dd\3\2\2\2\61\u00e4\3\2\2\2"+
		"\63\u00e7\3\2\2\2\65\u00ea\3\2\2\2\67\u00ec\3\2\2\29\u00ee\3\2\2\2;\u00f0"+
		"\3\2\2\2=\u00f3\3\2\2\2?\u00f5\3\2\2\2A\u00f7\3\2\2\2C\u00f9\3\2\2\2E"+
		"\u00fb\3\2\2\2G\u00fd\3\2\2\2I\u0106\3\2\2\2K\u010a\3\2\2\2M\u010d\3\2"+
		"\2\2O\u0110\3\2\2\2Q\u011c\3\2\2\2S\u012a\3\2\2\2U\u012c\3\2\2\2W\u012e"+
		"\3\2\2\2Y\u0130\3\2\2\2[\u0132\3\2\2\2]\u0134\3\2\2\2_\u0136\3\2\2\2a"+
		"\u0138\3\2\2\2c\u013a\3\2\2\2e\u013c\3\2\2\2g\u013e\3\2\2\2i\u0140\3\2"+
		"\2\2kl\7k\2\2lm\7p\2\2mn\7j\2\2no\7g\2\2op\7t\2\2pq\7k\2\2qr\7v\2\2rs"+
		"\7u\2\2s\4\3\2\2\2tu\7e\2\2uv\7n\2\2vw\7c\2\2wx\7u\2\2xy\7u\2\2y\6\3\2"+
		"\2\2z{\7k\2\2{|\7h\2\2|\b\3\2\2\2}~\7v\2\2~\177\7j\2\2\177\u0080\7g\2"+
		"\2\u0080\u0081\7p\2\2\u0081\n\3\2\2\2\u0082\u0083\7g\2\2\u0083\u0084\7"+
		"n\2\2\u0084\u0085\7u\2\2\u0085\u0086\7g\2\2\u0086\f\3\2\2\2\u0087\u0088"+
		"\7h\2\2\u0088\u0089\7k\2\2\u0089\16\3\2\2\2\u008a\u008b\7y\2\2\u008b\u008c"+
		"\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f"+
		"\20\3\2\2\2\u0090\u0091\7n\2\2\u0091\u0092\7q\2\2\u0092\u0093\7q\2\2\u0093"+
		"\u0094\7r\2\2\u0094\22\3\2\2\2\u0095\u0096\7r\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0098\7q\2\2\u0098\u0099\7n\2\2\u0099\24\3\2\2\2\u009a\u009b\7n\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7v\2\2\u009d\26\3\2\2\2\u009e\u009f\7k\2\2\u009f"+
		"\u00a0\7p\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7e\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7u\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7k\2\2"+
		"\u00b3\u00b4\7f\2\2\u00b4 \3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7q\2"+
		"\2\u00b7\u00b8\7v\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7"+
		"g\2\2\u00bb\u00bc\7y\2\2\u00bc$\3\2\2\2\u00bd\u00be\7v\2\2\u00be\u00bf"+
		"\7t\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7g\2\2\u00c1&\3\2\2\2\u00c2\u00c3"+
		"\7h\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7u\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7(\3\2\2\2\u00c8\u00ca\t\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc*\3\2\2\2"+
		"\u00cd\u00d1\7$\2\2\u00ce\u00d0\t\3\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d5\7$\2\2\u00d5,\3\2\2\2\u00d6\u00da\t\4\2\2\u00d7"+
		"\u00d9\t\5\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db.\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e1"+
		"\t\6\2\2\u00de\u00e0\t\5\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\60\3\2\2\2\u00e3\u00e1\3\2\2"+
		"\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\7/\2\2\u00e6\62\3\2\2\2\u00e7\u00e8"+
		"\7?\2\2\u00e8\u00e9\7@\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb\66"+
		"\3\2\2\2\u00ec\u00ed\7>\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef:\3"+
		"\2\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f2\7?\2\2\u00f2<\3\2\2\2\u00f3\u00f4"+
		"\7-\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7/\2\2\u00f6@\3\2\2\2\u00f7\u00f8\7"+
		"\61\2\2\u00f8B\3\2\2\2\u00f9\u00fa\7,\2\2\u00faD\3\2\2\2\u00fb\u00fc\7"+
		"\u0080\2\2\u00fcF\3\2\2\2\u00fd\u00fe\t\7\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\b$\2\2\u0100H\3\2\2\2\u0101\u0103\7\17\2\2\u0102\u0101\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\7\f\2\2\u0105\u0107"+
		"\7\17\2\2\u0106\u0102\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u0109\b%\2\2\u0109J\3\2\2\2\u010a\u010b\7*\2\2\u010b\u010c\7,\2"+
		"\2\u010cL\3\2\2\2\u010d\u010e\7,\2\2\u010e\u010f\7+\2\2\u010fN\3\2\2\2"+
		"\u0110\u0115\5K&\2\u0111\u0114\5O(\2\u0112\u0114\13\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\5M"+
		"\'\2\u0119\u011a\3\2\2\2\u011a\u011b\b(\2\2\u011bP\3\2\2\2\u011c\u011d"+
		"\7/\2\2\u011d\u011e\7/\2\2\u011e\u0122\3\2\2\2\u011f\u0121\n\b\2\2\u0120"+
		"\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\7\f\2\2\u0126"+
		"\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b)"+
		"\2\2\u0129R\3\2\2\2\u012a\u012b\7}\2\2\u012bT\3\2\2\2\u012c\u012d\7\177"+
		"\2\2\u012dV\3\2\2\2\u012e\u012f\7*\2\2\u012fX\3\2\2\2\u0130\u0131\7+\2"+
		"\2\u0131Z\3\2\2\2\u0132\u0133\7]\2\2\u0133\\\3\2\2\2\u0134\u0135\7_\2"+
		"\2\u0135^\3\2\2\2\u0136\u0137\7=\2\2\u0137`\3\2\2\2\u0138\u0139\7<\2\2"+
		"\u0139b\3\2\2\2\u013a\u013b\7.\2\2\u013bd\3\2\2\2\u013c\u013d\7\60\2\2"+
		"\u013df\3\2\2\2\u013e\u013f\7B\2\2\u013fh\3\2\2\2\u0140\u0141\13\2\2\2"+
		"\u0141j\3\2\2\2\16\2\u00cb\u00cf\u00d1\u00da\u00e1\u0102\u0106\u0113\u0115"+
		"\u0122\u0126\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}