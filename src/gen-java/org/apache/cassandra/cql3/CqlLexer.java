// $ANTLR 3.5.2 /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g 2017-10-13 13:58:19

    package org.apache.cassandra.cql3;

    import org.apache.cassandra.exceptions.SyntaxException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CqlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__170=170;
	public static final int T__171=171;
	public static final int T__172=172;
	public static final int T__173=173;
	public static final int T__174=174;
	public static final int T__175=175;
	public static final int T__176=176;
	public static final int T__177=177;
	public static final int T__178=178;
	public static final int T__179=179;
	public static final int T__180=180;
	public static final int T__181=181;
	public static final int T__182=182;
	public static final int T__183=183;
	public static final int T__184=184;
	public static final int T__185=185;
	public static final int T__186=186;
	public static final int T__187=187;
	public static final int T__188=188;
	public static final int T__189=189;
	public static final int A=4;
	public static final int B=5;
	public static final int BOOLEAN=6;
	public static final int C=7;
	public static final int COMMENT=8;
	public static final int D=9;
	public static final int DIGIT=10;
	public static final int E=11;
	public static final int EXPONENT=12;
	public static final int F=13;
	public static final int FLOAT=14;
	public static final int G=15;
	public static final int H=16;
	public static final int HEX=17;
	public static final int HEXNUMBER=18;
	public static final int I=19;
	public static final int IDENT=20;
	public static final int INTEGER=21;
	public static final int J=22;
	public static final int K=23;
	public static final int K_ADD=24;
	public static final int K_AGGREGATE=25;
	public static final int K_ALL=26;
	public static final int K_ALLOW=27;
	public static final int K_ALTER=28;
	public static final int K_AND=29;
	public static final int K_APPLY=30;
	public static final int K_AS=31;
	public static final int K_ASC=32;
	public static final int K_ASCII=33;
	public static final int K_AUTHORIZE=34;
	public static final int K_BATCH=35;
	public static final int K_BEGIN=36;
	public static final int K_BIGINT=37;
	public static final int K_BLOB=38;
	public static final int K_BOOLEAN=39;
	public static final int K_BY=40;
	public static final int K_CALLED=41;
	public static final int K_CLUSTERING=42;
	public static final int K_COLUMNFAMILY=43;
	public static final int K_COMPACT=44;
	public static final int K_CONTAINS=45;
	public static final int K_COUNT=46;
	public static final int K_COUNTER=47;
	public static final int K_CREATE=48;
	public static final int K_CUSTOM=49;
	public static final int K_DATE=50;
	public static final int K_DECIMAL=51;
	public static final int K_DELETE=52;
	public static final int K_DESC=53;
	public static final int K_DESCRIBE=54;
	public static final int K_DISTINCT=55;
	public static final int K_DOUBLE=56;
	public static final int K_DROP=57;
	public static final int K_ENTRIES=58;
	public static final int K_EXECUTE=59;
	public static final int K_EXISTS=60;
	public static final int K_FILTERING=61;
	public static final int K_FINALFUNC=62;
	public static final int K_FLOAT=63;
	public static final int K_FROM=64;
	public static final int K_FROZEN=65;
	public static final int K_FULL=66;
	public static final int K_FUNCTION=67;
	public static final int K_FUNCTIONS=68;
	public static final int K_GRANT=69;
	public static final int K_IF=70;
	public static final int K_IN=71;
	public static final int K_INDEX=72;
	public static final int K_INET=73;
	public static final int K_INFINITY=74;
	public static final int K_INITCOND=75;
	public static final int K_INPUT=76;
	public static final int K_INSERT=77;
	public static final int K_INT=78;
	public static final int K_INTO=79;
	public static final int K_IS=80;
	public static final int K_JSON=81;
	public static final int K_KEY=82;
	public static final int K_KEYS=83;
	public static final int K_KEYSPACE=84;
	public static final int K_KEYSPACES=85;
	public static final int K_LANGUAGE=86;
	public static final int K_LIMIT=87;
	public static final int K_LIST=88;
	public static final int K_LOGIN=89;
	public static final int K_MAP=90;
	public static final int K_MATERIALIZED=91;
	public static final int K_MODIFY=92;
	public static final int K_NAN=93;
	public static final int K_NOLOGIN=94;
	public static final int K_NORECURSIVE=95;
	public static final int K_NOSUPERUSER=96;
	public static final int K_NOT=97;
	public static final int K_NULL=98;
	public static final int K_OF=99;
	public static final int K_ON=100;
	public static final int K_OPTIONS=101;
	public static final int K_OR=102;
	public static final int K_ORDER=103;
	public static final int K_PASSWORD=104;
	public static final int K_PERMISSION=105;
	public static final int K_PERMISSIONS=106;
	public static final int K_PRIMARY=107;
	public static final int K_RENAME=108;
	public static final int K_REPLACE=109;
	public static final int K_RETURNS=110;
	public static final int K_REVOKE=111;
	public static final int K_ROLE=112;
	public static final int K_ROLES=113;
	public static final int K_SELECT=114;
	public static final int K_SET=115;
	public static final int K_SFUNC=116;
	public static final int K_SMALLINT=117;
	public static final int K_STATIC=118;
	public static final int K_STORAGE=119;
	public static final int K_STYPE=120;
	public static final int K_SUPERUSER=121;
	public static final int K_TEXT=122;
	public static final int K_TIME=123;
	public static final int K_TIMESTAMP=124;
	public static final int K_TIMEUUID=125;
	public static final int K_TINYINT=126;
	public static final int K_TO=127;
	public static final int K_TOKEN=128;
	public static final int K_TRIGGER=129;
	public static final int K_TRUNCATE=130;
	public static final int K_TTL=131;
	public static final int K_TUPLE=132;
	public static final int K_TYPE=133;
	public static final int K_UNLOGGED=134;
	public static final int K_UPDATE=135;
	public static final int K_USE=136;
	public static final int K_USER=137;
	public static final int K_USERS=138;
	public static final int K_USING=139;
	public static final int K_UUID=140;
	public static final int K_VALUES=141;
	public static final int K_VARCHAR=142;
	public static final int K_VARINT=143;
	public static final int K_VIEW=144;
	public static final int K_WHERE=145;
	public static final int K_WITH=146;
	public static final int K_WRITETIME=147;
	public static final int L=148;
	public static final int LETTER=149;
	public static final int M=150;
	public static final int MULTILINE_COMMENT=151;
	public static final int N=152;
	public static final int O=153;
	public static final int P=154;
	public static final int Q=155;
	public static final int QMARK=156;
	public static final int QUOTED_NAME=157;
	public static final int R=158;
	public static final int S=159;
	public static final int STRING_LITERAL=160;
	public static final int T=161;
	public static final int U=162;
	public static final int UUID=163;
	public static final int V=164;
	public static final int W=165;
	public static final int WS=166;
	public static final int X=167;
	public static final int Y=168;
	public static final int Z=169;

	    List<Token> tokens = new ArrayList<Token>();

	    public void emit(Token token)
	    {
	        state.token = token;
	        tokens.add(token);
	    }

	    public Token nextToken()
	    {
	        super.nextToken();
	        if (tokens.size() == 0)
	            return new CommonToken(Token.EOF);
	        return tokens.remove(0);
	    }

	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();

	    public void addErrorListener(ErrorListener listener)
	    {
	        this.listeners.add(listener);
	    }

	    public void removeErrorListener(ErrorListener listener)
	    {
	        this.listeners.remove(listener);
	    }

	    public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, tokenNames, e);
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CqlLexer() {} 
	public CqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g"; }

	// $ANTLR start "T__170"
	public final void mT__170() throws RecognitionException {
		try {
			int _type = T__170;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:48:8: ( '!=' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:48:10: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__170"

	// $ANTLR start "T__171"
	public final void mT__171() throws RecognitionException {
		try {
			int _type = T__171;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:49:8: ( '(' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:49:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__171"

	// $ANTLR start "T__172"
	public final void mT__172() throws RecognitionException {
		try {
			int _type = T__172;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:50:8: ( ')' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:50:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__172"

	// $ANTLR start "T__173"
	public final void mT__173() throws RecognitionException {
		try {
			int _type = T__173;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:51:8: ( '+' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:51:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__173"

	// $ANTLR start "T__174"
	public final void mT__174() throws RecognitionException {
		try {
			int _type = T__174;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:52:8: ( ',' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:52:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__174"

	// $ANTLR start "T__175"
	public final void mT__175() throws RecognitionException {
		try {
			int _type = T__175;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:53:8: ( '-' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:53:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__175"

	// $ANTLR start "T__176"
	public final void mT__176() throws RecognitionException {
		try {
			int _type = T__176;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:54:8: ( '.' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:54:10: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__176"

	// $ANTLR start "T__177"
	public final void mT__177() throws RecognitionException {
		try {
			int _type = T__177;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:55:8: ( ':' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:55:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__177"

	// $ANTLR start "T__178"
	public final void mT__178() throws RecognitionException {
		try {
			int _type = T__178;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:56:8: ( ';' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:56:10: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__178"

	// $ANTLR start "T__179"
	public final void mT__179() throws RecognitionException {
		try {
			int _type = T__179;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:57:8: ( '<' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:57:10: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__179"

	// $ANTLR start "T__180"
	public final void mT__180() throws RecognitionException {
		try {
			int _type = T__180;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:58:8: ( '<=' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:58:10: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__180"

	// $ANTLR start "T__181"
	public final void mT__181() throws RecognitionException {
		try {
			int _type = T__181;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:59:8: ( '=' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:59:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__181"

	// $ANTLR start "T__182"
	public final void mT__182() throws RecognitionException {
		try {
			int _type = T__182;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:60:8: ( '>' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:60:10: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__182"

	// $ANTLR start "T__183"
	public final void mT__183() throws RecognitionException {
		try {
			int _type = T__183;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:61:8: ( '>=' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:61:10: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__183"

	// $ANTLR start "T__184"
	public final void mT__184() throws RecognitionException {
		try {
			int _type = T__184;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:62:8: ( '[' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:62:10: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__184"

	// $ANTLR start "T__185"
	public final void mT__185() throws RecognitionException {
		try {
			int _type = T__185;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:63:8: ( '\\*' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:63:10: '\\*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__185"

	// $ANTLR start "T__186"
	public final void mT__186() throws RecognitionException {
		try {
			int _type = T__186;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:64:8: ( ']' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:64:10: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__186"

	// $ANTLR start "T__187"
	public final void mT__187() throws RecognitionException {
		try {
			int _type = T__187;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:65:8: ( 'expr(' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:65:10: 'expr('
			{
			match("expr("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__187"

	// $ANTLR start "T__188"
	public final void mT__188() throws RecognitionException {
		try {
			int _type = T__188;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:66:8: ( '{' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:66:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__188"

	// $ANTLR start "T__189"
	public final void mT__189() throws RecognitionException {
		try {
			int _type = T__189;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:67:8: ( '}' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:67:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__189"

	// $ANTLR start "K_SELECT"
	public final void mK_SELECT() throws RecognitionException {
		try {
			int _type = K_SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1639:9: ( S E L E C T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1639:16: S E L E C T
			{
			mS(); 

			mE(); 

			mL(); 

			mE(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SELECT"

	// $ANTLR start "K_FROM"
	public final void mK_FROM() throws RecognitionException {
		try {
			int _type = K_FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1640:7: ( F R O M )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1640:16: F R O M
			{
			mF(); 

			mR(); 

			mO(); 

			mM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FROM"

	// $ANTLR start "K_AS"
	public final void mK_AS() throws RecognitionException {
		try {
			int _type = K_AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1641:5: ( A S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1641:16: A S
			{
			mA(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_AS"

	// $ANTLR start "K_WHERE"
	public final void mK_WHERE() throws RecognitionException {
		try {
			int _type = K_WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1642:8: ( W H E R E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1642:16: W H E R E
			{
			mW(); 

			mH(); 

			mE(); 

			mR(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_WHERE"

	// $ANTLR start "K_AND"
	public final void mK_AND() throws RecognitionException {
		try {
			int _type = K_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1643:6: ( A N D )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1643:16: A N D
			{
			mA(); 

			mN(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_AND"

	// $ANTLR start "K_KEY"
	public final void mK_KEY() throws RecognitionException {
		try {
			int _type = K_KEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1644:6: ( K E Y )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1644:16: K E Y
			{
			mK(); 

			mE(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_KEY"

	// $ANTLR start "K_KEYS"
	public final void mK_KEYS() throws RecognitionException {
		try {
			int _type = K_KEYS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1645:7: ( K E Y S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1645:16: K E Y S
			{
			mK(); 

			mE(); 

			mY(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_KEYS"

	// $ANTLR start "K_ENTRIES"
	public final void mK_ENTRIES() throws RecognitionException {
		try {
			int _type = K_ENTRIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1646:10: ( E N T R I E S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1646:16: E N T R I E S
			{
			mE(); 

			mN(); 

			mT(); 

			mR(); 

			mI(); 

			mE(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ENTRIES"

	// $ANTLR start "K_FULL"
	public final void mK_FULL() throws RecognitionException {
		try {
			int _type = K_FULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1647:7: ( F U L L )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1647:16: F U L L
			{
			mF(); 

			mU(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FULL"

	// $ANTLR start "K_INSERT"
	public final void mK_INSERT() throws RecognitionException {
		try {
			int _type = K_INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1648:9: ( I N S E R T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1648:16: I N S E R T
			{
			mI(); 

			mN(); 

			mS(); 

			mE(); 

			mR(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INSERT"

	// $ANTLR start "K_UPDATE"
	public final void mK_UPDATE() throws RecognitionException {
		try {
			int _type = K_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1649:9: ( U P D A T E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1649:16: U P D A T E
			{
			mU(); 

			mP(); 

			mD(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_UPDATE"

	// $ANTLR start "K_WITH"
	public final void mK_WITH() throws RecognitionException {
		try {
			int _type = K_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1650:7: ( W I T H )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1650:16: W I T H
			{
			mW(); 

			mI(); 

			mT(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_WITH"

	// $ANTLR start "K_LIMIT"
	public final void mK_LIMIT() throws RecognitionException {
		try {
			int _type = K_LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1651:8: ( L I M I T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1651:16: L I M I T
			{
			mL(); 

			mI(); 

			mM(); 

			mI(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LIMIT"

	// $ANTLR start "K_USING"
	public final void mK_USING() throws RecognitionException {
		try {
			int _type = K_USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1652:8: ( U S I N G )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1652:16: U S I N G
			{
			mU(); 

			mS(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_USING"

	// $ANTLR start "K_USE"
	public final void mK_USE() throws RecognitionException {
		try {
			int _type = K_USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1653:6: ( U S E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1653:16: U S E
			{
			mU(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_USE"

	// $ANTLR start "K_DISTINCT"
	public final void mK_DISTINCT() throws RecognitionException {
		try {
			int _type = K_DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1654:11: ( D I S T I N C T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1654:16: D I S T I N C T
			{
			mD(); 

			mI(); 

			mS(); 

			mT(); 

			mI(); 

			mN(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DISTINCT"

	// $ANTLR start "K_COUNT"
	public final void mK_COUNT() throws RecognitionException {
		try {
			int _type = K_COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1655:8: ( C O U N T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1655:16: C O U N T
			{
			mC(); 

			mO(); 

			mU(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_COUNT"

	// $ANTLR start "K_SET"
	public final void mK_SET() throws RecognitionException {
		try {
			int _type = K_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1656:6: ( S E T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1656:16: S E T
			{
			mS(); 

			mE(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SET"

	// $ANTLR start "K_BEGIN"
	public final void mK_BEGIN() throws RecognitionException {
		try {
			int _type = K_BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1657:8: ( B E G I N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1657:16: B E G I N
			{
			mB(); 

			mE(); 

			mG(); 

			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BEGIN"

	// $ANTLR start "K_UNLOGGED"
	public final void mK_UNLOGGED() throws RecognitionException {
		try {
			int _type = K_UNLOGGED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1658:11: ( U N L O G G E D )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1658:16: U N L O G G E D
			{
			mU(); 

			mN(); 

			mL(); 

			mO(); 

			mG(); 

			mG(); 

			mE(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_UNLOGGED"

	// $ANTLR start "K_BATCH"
	public final void mK_BATCH() throws RecognitionException {
		try {
			int _type = K_BATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1659:8: ( B A T C H )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1659:16: B A T C H
			{
			mB(); 

			mA(); 

			mT(); 

			mC(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BATCH"

	// $ANTLR start "K_APPLY"
	public final void mK_APPLY() throws RecognitionException {
		try {
			int _type = K_APPLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1660:8: ( A P P L Y )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1660:16: A P P L Y
			{
			mA(); 

			mP(); 

			mP(); 

			mL(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_APPLY"

	// $ANTLR start "K_TRUNCATE"
	public final void mK_TRUNCATE() throws RecognitionException {
		try {
			int _type = K_TRUNCATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1661:11: ( T R U N C A T E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1661:16: T R U N C A T E
			{
			mT(); 

			mR(); 

			mU(); 

			mN(); 

			mC(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TRUNCATE"

	// $ANTLR start "K_DELETE"
	public final void mK_DELETE() throws RecognitionException {
		try {
			int _type = K_DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1662:9: ( D E L E T E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1662:16: D E L E T E
			{
			mD(); 

			mE(); 

			mL(); 

			mE(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DELETE"

	// $ANTLR start "K_IN"
	public final void mK_IN() throws RecognitionException {
		try {
			int _type = K_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1663:5: ( I N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1663:16: I N
			{
			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_IN"

	// $ANTLR start "K_CREATE"
	public final void mK_CREATE() throws RecognitionException {
		try {
			int _type = K_CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1664:9: ( C R E A T E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1664:16: C R E A T E
			{
			mC(); 

			mR(); 

			mE(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CREATE"

	// $ANTLR start "K_KEYSPACE"
	public final void mK_KEYSPACE() throws RecognitionException {
		try {
			int _type = K_KEYSPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1665:11: ( ( K E Y S P A C E | S C H E M A ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1665:16: ( K E Y S P A C E | S C H E M A )
			{
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1665:16: ( K E Y S P A C E | S C H E M A )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='K'||LA1_0=='k') ) {
				alt1=1;
			}
			else if ( (LA1_0=='S'||LA1_0=='s') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1665:18: K E Y S P A C E
					{
					mK(); 

					mE(); 

					mY(); 

					mS(); 

					mP(); 

					mA(); 

					mC(); 

					mE(); 

					}
					break;
				case 2 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1666:20: S C H E M A
					{
					mS(); 

					mC(); 

					mH(); 

					mE(); 

					mM(); 

					mA(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_KEYSPACE"

	// $ANTLR start "K_KEYSPACES"
	public final void mK_KEYSPACES() throws RecognitionException {
		try {
			int _type = K_KEYSPACES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1667:12: ( K E Y S P A C E S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1667:16: K E Y S P A C E S
			{
			mK(); 

			mE(); 

			mY(); 

			mS(); 

			mP(); 

			mA(); 

			mC(); 

			mE(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_KEYSPACES"

	// $ANTLR start "K_COLUMNFAMILY"
	public final void mK_COLUMNFAMILY() throws RecognitionException {
		try {
			int _type = K_COLUMNFAMILY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1668:15: ( ( C O L U M N F A M I L Y | T A B L E ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1668:16: ( C O L U M N F A M I L Y | T A B L E )
			{
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1668:16: ( C O L U M N F A M I L Y | T A B L E )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='C'||LA2_0=='c') ) {
				alt2=1;
			}
			else if ( (LA2_0=='T'||LA2_0=='t') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1668:18: C O L U M N F A M I L Y
					{
					mC(); 

					mO(); 

					mL(); 

					mU(); 

					mM(); 

					mN(); 

					mF(); 

					mA(); 

					mM(); 

					mI(); 

					mL(); 

					mY(); 

					}
					break;
				case 2 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1669:20: T A B L E
					{
					mT(); 

					mA(); 

					mB(); 

					mL(); 

					mE(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_COLUMNFAMILY"

	// $ANTLR start "K_MATERIALIZED"
	public final void mK_MATERIALIZED() throws RecognitionException {
		try {
			int _type = K_MATERIALIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1670:15: ( M A T E R I A L I Z E D )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1670:16: M A T E R I A L I Z E D
			{
			mM(); 

			mA(); 

			mT(); 

			mE(); 

			mR(); 

			mI(); 

			mA(); 

			mL(); 

			mI(); 

			mZ(); 

			mE(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_MATERIALIZED"

	// $ANTLR start "K_VIEW"
	public final void mK_VIEW() throws RecognitionException {
		try {
			int _type = K_VIEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1671:7: ( V I E W )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1671:16: V I E W
			{
			mV(); 

			mI(); 

			mE(); 

			mW(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_VIEW"

	// $ANTLR start "K_INDEX"
	public final void mK_INDEX() throws RecognitionException {
		try {
			int _type = K_INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1672:8: ( I N D E X )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1672:16: I N D E X
			{
			mI(); 

			mN(); 

			mD(); 

			mE(); 

			mX(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INDEX"

	// $ANTLR start "K_CUSTOM"
	public final void mK_CUSTOM() throws RecognitionException {
		try {
			int _type = K_CUSTOM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1673:9: ( C U S T O M )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1673:16: C U S T O M
			{
			mC(); 

			mU(); 

			mS(); 

			mT(); 

			mO(); 

			mM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CUSTOM"

	// $ANTLR start "K_ON"
	public final void mK_ON() throws RecognitionException {
		try {
			int _type = K_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1674:5: ( O N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1674:16: O N
			{
			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ON"

	// $ANTLR start "K_TO"
	public final void mK_TO() throws RecognitionException {
		try {
			int _type = K_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1675:5: ( T O )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1675:16: T O
			{
			mT(); 

			mO(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TO"

	// $ANTLR start "K_DROP"
	public final void mK_DROP() throws RecognitionException {
		try {
			int _type = K_DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1676:7: ( D R O P )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1676:16: D R O P
			{
			mD(); 

			mR(); 

			mO(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DROP"

	// $ANTLR start "K_PRIMARY"
	public final void mK_PRIMARY() throws RecognitionException {
		try {
			int _type = K_PRIMARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1677:10: ( P R I M A R Y )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1677:16: P R I M A R Y
			{
			mP(); 

			mR(); 

			mI(); 

			mM(); 

			mA(); 

			mR(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PRIMARY"

	// $ANTLR start "K_INTO"
	public final void mK_INTO() throws RecognitionException {
		try {
			int _type = K_INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1678:7: ( I N T O )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1678:16: I N T O
			{
			mI(); 

			mN(); 

			mT(); 

			mO(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INTO"

	// $ANTLR start "K_VALUES"
	public final void mK_VALUES() throws RecognitionException {
		try {
			int _type = K_VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1679:9: ( V A L U E S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1679:16: V A L U E S
			{
			mV(); 

			mA(); 

			mL(); 

			mU(); 

			mE(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_VALUES"

	// $ANTLR start "K_TIMESTAMP"
	public final void mK_TIMESTAMP() throws RecognitionException {
		try {
			int _type = K_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1680:12: ( T I M E S T A M P )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1680:16: T I M E S T A M P
			{
			mT(); 

			mI(); 

			mM(); 

			mE(); 

			mS(); 

			mT(); 

			mA(); 

			mM(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TIMESTAMP"

	// $ANTLR start "K_TTL"
	public final void mK_TTL() throws RecognitionException {
		try {
			int _type = K_TTL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1681:6: ( T T L )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1681:16: T T L
			{
			mT(); 

			mT(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TTL"

	// $ANTLR start "K_ALTER"
	public final void mK_ALTER() throws RecognitionException {
		try {
			int _type = K_ALTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1682:8: ( A L T E R )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1682:16: A L T E R
			{
			mA(); 

			mL(); 

			mT(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ALTER"

	// $ANTLR start "K_RENAME"
	public final void mK_RENAME() throws RecognitionException {
		try {
			int _type = K_RENAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1683:9: ( R E N A M E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1683:16: R E N A M E
			{
			mR(); 

			mE(); 

			mN(); 

			mA(); 

			mM(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_RENAME"

	// $ANTLR start "K_ADD"
	public final void mK_ADD() throws RecognitionException {
		try {
			int _type = K_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1684:6: ( A D D )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1684:16: A D D
			{
			mA(); 

			mD(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ADD"

	// $ANTLR start "K_TYPE"
	public final void mK_TYPE() throws RecognitionException {
		try {
			int _type = K_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1685:7: ( T Y P E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1685:16: T Y P E
			{
			mT(); 

			mY(); 

			mP(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TYPE"

	// $ANTLR start "K_COMPACT"
	public final void mK_COMPACT() throws RecognitionException {
		try {
			int _type = K_COMPACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1686:10: ( C O M P A C T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1686:16: C O M P A C T
			{
			mC(); 

			mO(); 

			mM(); 

			mP(); 

			mA(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_COMPACT"

	// $ANTLR start "K_STORAGE"
	public final void mK_STORAGE() throws RecognitionException {
		try {
			int _type = K_STORAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1687:10: ( S T O R A G E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1687:16: S T O R A G E
			{
			mS(); 

			mT(); 

			mO(); 

			mR(); 

			mA(); 

			mG(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_STORAGE"

	// $ANTLR start "K_ORDER"
	public final void mK_ORDER() throws RecognitionException {
		try {
			int _type = K_ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1688:8: ( O R D E R )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1688:16: O R D E R
			{
			mO(); 

			mR(); 

			mD(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ORDER"

	// $ANTLR start "K_BY"
	public final void mK_BY() throws RecognitionException {
		try {
			int _type = K_BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1689:5: ( B Y )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1689:16: B Y
			{
			mB(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BY"

	// $ANTLR start "K_ASC"
	public final void mK_ASC() throws RecognitionException {
		try {
			int _type = K_ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1690:6: ( A S C )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1690:16: A S C
			{
			mA(); 

			mS(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ASC"

	// $ANTLR start "K_DESC"
	public final void mK_DESC() throws RecognitionException {
		try {
			int _type = K_DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1691:7: ( D E S C )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1691:16: D E S C
			{
			mD(); 

			mE(); 

			mS(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DESC"

	// $ANTLR start "K_ALLOW"
	public final void mK_ALLOW() throws RecognitionException {
		try {
			int _type = K_ALLOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1692:8: ( A L L O W )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1692:16: A L L O W
			{
			mA(); 

			mL(); 

			mL(); 

			mO(); 

			mW(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ALLOW"

	// $ANTLR start "K_FILTERING"
	public final void mK_FILTERING() throws RecognitionException {
		try {
			int _type = K_FILTERING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1693:12: ( F I L T E R I N G )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1693:16: F I L T E R I N G
			{
			mF(); 

			mI(); 

			mL(); 

			mT(); 

			mE(); 

			mR(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FILTERING"

	// $ANTLR start "K_IF"
	public final void mK_IF() throws RecognitionException {
		try {
			int _type = K_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1694:5: ( I F )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1694:16: I F
			{
			mI(); 

			mF(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_IF"

	// $ANTLR start "K_IS"
	public final void mK_IS() throws RecognitionException {
		try {
			int _type = K_IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1695:5: ( I S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1695:16: I S
			{
			mI(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_IS"

	// $ANTLR start "K_CONTAINS"
	public final void mK_CONTAINS() throws RecognitionException {
		try {
			int _type = K_CONTAINS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1696:11: ( C O N T A I N S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1696:16: C O N T A I N S
			{
			mC(); 

			mO(); 

			mN(); 

			mT(); 

			mA(); 

			mI(); 

			mN(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CONTAINS"

	// $ANTLR start "K_GRANT"
	public final void mK_GRANT() throws RecognitionException {
		try {
			int _type = K_GRANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1698:8: ( G R A N T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1698:16: G R A N T
			{
			mG(); 

			mR(); 

			mA(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_GRANT"

	// $ANTLR start "K_ALL"
	public final void mK_ALL() throws RecognitionException {
		try {
			int _type = K_ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1699:6: ( A L L )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1699:16: A L L
			{
			mA(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ALL"

	// $ANTLR start "K_PERMISSION"
	public final void mK_PERMISSION() throws RecognitionException {
		try {
			int _type = K_PERMISSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1700:13: ( P E R M I S S I O N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1700:16: P E R M I S S I O N
			{
			mP(); 

			mE(); 

			mR(); 

			mM(); 

			mI(); 

			mS(); 

			mS(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PERMISSION"

	// $ANTLR start "K_PERMISSIONS"
	public final void mK_PERMISSIONS() throws RecognitionException {
		try {
			int _type = K_PERMISSIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1701:14: ( P E R M I S S I O N S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1701:16: P E R M I S S I O N S
			{
			mP(); 

			mE(); 

			mR(); 

			mM(); 

			mI(); 

			mS(); 

			mS(); 

			mI(); 

			mO(); 

			mN(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PERMISSIONS"

	// $ANTLR start "K_OF"
	public final void mK_OF() throws RecognitionException {
		try {
			int _type = K_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1702:5: ( O F )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1702:16: O F
			{
			mO(); 

			mF(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_OF"

	// $ANTLR start "K_REVOKE"
	public final void mK_REVOKE() throws RecognitionException {
		try {
			int _type = K_REVOKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1703:9: ( R E V O K E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1703:16: R E V O K E
			{
			mR(); 

			mE(); 

			mV(); 

			mO(); 

			mK(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_REVOKE"

	// $ANTLR start "K_MODIFY"
	public final void mK_MODIFY() throws RecognitionException {
		try {
			int _type = K_MODIFY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1704:9: ( M O D I F Y )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1704:16: M O D I F Y
			{
			mM(); 

			mO(); 

			mD(); 

			mI(); 

			mF(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_MODIFY"

	// $ANTLR start "K_AUTHORIZE"
	public final void mK_AUTHORIZE() throws RecognitionException {
		try {
			int _type = K_AUTHORIZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1705:12: ( A U T H O R I Z E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1705:16: A U T H O R I Z E
			{
			mA(); 

			mU(); 

			mT(); 

			mH(); 

			mO(); 

			mR(); 

			mI(); 

			mZ(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_AUTHORIZE"

	// $ANTLR start "K_DESCRIBE"
	public final void mK_DESCRIBE() throws RecognitionException {
		try {
			int _type = K_DESCRIBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1706:11: ( D E S C R I B E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1706:16: D E S C R I B E
			{
			mD(); 

			mE(); 

			mS(); 

			mC(); 

			mR(); 

			mI(); 

			mB(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DESCRIBE"

	// $ANTLR start "K_EXECUTE"
	public final void mK_EXECUTE() throws RecognitionException {
		try {
			int _type = K_EXECUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1707:10: ( E X E C U T E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1707:16: E X E C U T E
			{
			mE(); 

			mX(); 

			mE(); 

			mC(); 

			mU(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_EXECUTE"

	// $ANTLR start "K_NORECURSIVE"
	public final void mK_NORECURSIVE() throws RecognitionException {
		try {
			int _type = K_NORECURSIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1708:14: ( N O R E C U R S I V E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1708:16: N O R E C U R S I V E
			{
			mN(); 

			mO(); 

			mR(); 

			mE(); 

			mC(); 

			mU(); 

			mR(); 

			mS(); 

			mI(); 

			mV(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NORECURSIVE"

	// $ANTLR start "K_USER"
	public final void mK_USER() throws RecognitionException {
		try {
			int _type = K_USER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1710:7: ( U S E R )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1710:16: U S E R
			{
			mU(); 

			mS(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_USER"

	// $ANTLR start "K_USERS"
	public final void mK_USERS() throws RecognitionException {
		try {
			int _type = K_USERS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1711:8: ( U S E R S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1711:16: U S E R S
			{
			mU(); 

			mS(); 

			mE(); 

			mR(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_USERS"

	// $ANTLR start "K_ROLE"
	public final void mK_ROLE() throws RecognitionException {
		try {
			int _type = K_ROLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1712:7: ( R O L E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1712:16: R O L E
			{
			mR(); 

			mO(); 

			mL(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ROLE"

	// $ANTLR start "K_ROLES"
	public final void mK_ROLES() throws RecognitionException {
		try {
			int _type = K_ROLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1713:8: ( R O L E S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1713:16: R O L E S
			{
			mR(); 

			mO(); 

			mL(); 

			mE(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ROLES"

	// $ANTLR start "K_SUPERUSER"
	public final void mK_SUPERUSER() throws RecognitionException {
		try {
			int _type = K_SUPERUSER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1714:12: ( S U P E R U S E R )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1714:16: S U P E R U S E R
			{
			mS(); 

			mU(); 

			mP(); 

			mE(); 

			mR(); 

			mU(); 

			mS(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SUPERUSER"

	// $ANTLR start "K_NOSUPERUSER"
	public final void mK_NOSUPERUSER() throws RecognitionException {
		try {
			int _type = K_NOSUPERUSER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1715:14: ( N O S U P E R U S E R )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1715:16: N O S U P E R U S E R
			{
			mN(); 

			mO(); 

			mS(); 

			mU(); 

			mP(); 

			mE(); 

			mR(); 

			mU(); 

			mS(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NOSUPERUSER"

	// $ANTLR start "K_PASSWORD"
	public final void mK_PASSWORD() throws RecognitionException {
		try {
			int _type = K_PASSWORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1716:11: ( P A S S W O R D )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1716:16: P A S S W O R D
			{
			mP(); 

			mA(); 

			mS(); 

			mS(); 

			mW(); 

			mO(); 

			mR(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PASSWORD"

	// $ANTLR start "K_LOGIN"
	public final void mK_LOGIN() throws RecognitionException {
		try {
			int _type = K_LOGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1717:8: ( L O G I N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1717:16: L O G I N
			{
			mL(); 

			mO(); 

			mG(); 

			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LOGIN"

	// $ANTLR start "K_NOLOGIN"
	public final void mK_NOLOGIN() throws RecognitionException {
		try {
			int _type = K_NOLOGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1718:10: ( N O L O G I N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1718:16: N O L O G I N
			{
			mN(); 

			mO(); 

			mL(); 

			mO(); 

			mG(); 

			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NOLOGIN"

	// $ANTLR start "K_OPTIONS"
	public final void mK_OPTIONS() throws RecognitionException {
		try {
			int _type = K_OPTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1719:10: ( O P T I O N S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1719:16: O P T I O N S
			{
			mO(); 

			mP(); 

			mT(); 

			mI(); 

			mO(); 

			mN(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_OPTIONS"

	// $ANTLR start "K_CLUSTERING"
	public final void mK_CLUSTERING() throws RecognitionException {
		try {
			int _type = K_CLUSTERING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1721:13: ( C L U S T E R I N G )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1721:16: C L U S T E R I N G
			{
			mC(); 

			mL(); 

			mU(); 

			mS(); 

			mT(); 

			mE(); 

			mR(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CLUSTERING"

	// $ANTLR start "K_ASCII"
	public final void mK_ASCII() throws RecognitionException {
		try {
			int _type = K_ASCII;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1722:8: ( A S C I I )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1722:16: A S C I I
			{
			mA(); 

			mS(); 

			mC(); 

			mI(); 

			mI(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ASCII"

	// $ANTLR start "K_BIGINT"
	public final void mK_BIGINT() throws RecognitionException {
		try {
			int _type = K_BIGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1723:9: ( B I G I N T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1723:16: B I G I N T
			{
			mB(); 

			mI(); 

			mG(); 

			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BIGINT"

	// $ANTLR start "K_BLOB"
	public final void mK_BLOB() throws RecognitionException {
		try {
			int _type = K_BLOB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1724:7: ( B L O B )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1724:16: B L O B
			{
			mB(); 

			mL(); 

			mO(); 

			mB(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BLOB"

	// $ANTLR start "K_BOOLEAN"
	public final void mK_BOOLEAN() throws RecognitionException {
		try {
			int _type = K_BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1725:10: ( B O O L E A N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1725:16: B O O L E A N
			{
			mB(); 

			mO(); 

			mO(); 

			mL(); 

			mE(); 

			mA(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BOOLEAN"

	// $ANTLR start "K_COUNTER"
	public final void mK_COUNTER() throws RecognitionException {
		try {
			int _type = K_COUNTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1726:10: ( C O U N T E R )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1726:16: C O U N T E R
			{
			mC(); 

			mO(); 

			mU(); 

			mN(); 

			mT(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_COUNTER"

	// $ANTLR start "K_DECIMAL"
	public final void mK_DECIMAL() throws RecognitionException {
		try {
			int _type = K_DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1727:10: ( D E C I M A L )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1727:16: D E C I M A L
			{
			mD(); 

			mE(); 

			mC(); 

			mI(); 

			mM(); 

			mA(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DECIMAL"

	// $ANTLR start "K_DOUBLE"
	public final void mK_DOUBLE() throws RecognitionException {
		try {
			int _type = K_DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1728:9: ( D O U B L E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1728:16: D O U B L E
			{
			mD(); 

			mO(); 

			mU(); 

			mB(); 

			mL(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DOUBLE"

	// $ANTLR start "K_FLOAT"
	public final void mK_FLOAT() throws RecognitionException {
		try {
			int _type = K_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1729:8: ( F L O A T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1729:16: F L O A T
			{
			mF(); 

			mL(); 

			mO(); 

			mA(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FLOAT"

	// $ANTLR start "K_INET"
	public final void mK_INET() throws RecognitionException {
		try {
			int _type = K_INET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1730:7: ( I N E T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1730:16: I N E T
			{
			mI(); 

			mN(); 

			mE(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INET"

	// $ANTLR start "K_INT"
	public final void mK_INT() throws RecognitionException {
		try {
			int _type = K_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1731:6: ( I N T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1731:16: I N T
			{
			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INT"

	// $ANTLR start "K_SMALLINT"
	public final void mK_SMALLINT() throws RecognitionException {
		try {
			int _type = K_SMALLINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1732:11: ( S M A L L I N T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1732:16: S M A L L I N T
			{
			mS(); 

			mM(); 

			mA(); 

			mL(); 

			mL(); 

			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SMALLINT"

	// $ANTLR start "K_TINYINT"
	public final void mK_TINYINT() throws RecognitionException {
		try {
			int _type = K_TINYINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1733:10: ( T I N Y I N T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1733:16: T I N Y I N T
			{
			mT(); 

			mI(); 

			mN(); 

			mY(); 

			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TINYINT"

	// $ANTLR start "K_TEXT"
	public final void mK_TEXT() throws RecognitionException {
		try {
			int _type = K_TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1734:7: ( T E X T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1734:16: T E X T
			{
			mT(); 

			mE(); 

			mX(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TEXT"

	// $ANTLR start "K_UUID"
	public final void mK_UUID() throws RecognitionException {
		try {
			int _type = K_UUID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1735:7: ( U U I D )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1735:16: U U I D
			{
			mU(); 

			mU(); 

			mI(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_UUID"

	// $ANTLR start "K_VARCHAR"
	public final void mK_VARCHAR() throws RecognitionException {
		try {
			int _type = K_VARCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1736:10: ( V A R C H A R )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1736:16: V A R C H A R
			{
			mV(); 

			mA(); 

			mR(); 

			mC(); 

			mH(); 

			mA(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_VARCHAR"

	// $ANTLR start "K_VARINT"
	public final void mK_VARINT() throws RecognitionException {
		try {
			int _type = K_VARINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1737:9: ( V A R I N T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1737:16: V A R I N T
			{
			mV(); 

			mA(); 

			mR(); 

			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_VARINT"

	// $ANTLR start "K_TIMEUUID"
	public final void mK_TIMEUUID() throws RecognitionException {
		try {
			int _type = K_TIMEUUID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1738:11: ( T I M E U U I D )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1738:16: T I M E U U I D
			{
			mT(); 

			mI(); 

			mM(); 

			mE(); 

			mU(); 

			mU(); 

			mI(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TIMEUUID"

	// $ANTLR start "K_TOKEN"
	public final void mK_TOKEN() throws RecognitionException {
		try {
			int _type = K_TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1739:8: ( T O K E N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1739:16: T O K E N
			{
			mT(); 

			mO(); 

			mK(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TOKEN"

	// $ANTLR start "K_WRITETIME"
	public final void mK_WRITETIME() throws RecognitionException {
		try {
			int _type = K_WRITETIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1740:12: ( W R I T E T I M E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1740:16: W R I T E T I M E
			{
			mW(); 

			mR(); 

			mI(); 

			mT(); 

			mE(); 

			mT(); 

			mI(); 

			mM(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_WRITETIME"

	// $ANTLR start "K_DATE"
	public final void mK_DATE() throws RecognitionException {
		try {
			int _type = K_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1741:7: ( D A T E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1741:16: D A T E
			{
			mD(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DATE"

	// $ANTLR start "K_TIME"
	public final void mK_TIME() throws RecognitionException {
		try {
			int _type = K_TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1742:7: ( T I M E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1742:16: T I M E
			{
			mT(); 

			mI(); 

			mM(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TIME"

	// $ANTLR start "K_NULL"
	public final void mK_NULL() throws RecognitionException {
		try {
			int _type = K_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1744:7: ( N U L L )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1744:16: N U L L
			{
			mN(); 

			mU(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NULL"

	// $ANTLR start "K_NOT"
	public final void mK_NOT() throws RecognitionException {
		try {
			int _type = K_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1745:6: ( N O T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1745:16: N O T
			{
			mN(); 

			mO(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NOT"

	// $ANTLR start "K_EXISTS"
	public final void mK_EXISTS() throws RecognitionException {
		try {
			int _type = K_EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1746:9: ( E X I S T S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1746:16: E X I S T S
			{
			mE(); 

			mX(); 

			mI(); 

			mS(); 

			mT(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_EXISTS"

	// $ANTLR start "K_MAP"
	public final void mK_MAP() throws RecognitionException {
		try {
			int _type = K_MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1748:6: ( M A P )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1748:16: M A P
			{
			mM(); 

			mA(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_MAP"

	// $ANTLR start "K_LIST"
	public final void mK_LIST() throws RecognitionException {
		try {
			int _type = K_LIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1749:7: ( L I S T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1749:16: L I S T
			{
			mL(); 

			mI(); 

			mS(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LIST"

	// $ANTLR start "K_NAN"
	public final void mK_NAN() throws RecognitionException {
		try {
			int _type = K_NAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1750:6: ( N A N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1750:16: N A N
			{
			mN(); 

			mA(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NAN"

	// $ANTLR start "K_INFINITY"
	public final void mK_INFINITY() throws RecognitionException {
		try {
			int _type = K_INFINITY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1751:11: ( I N F I N I T Y )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1751:16: I N F I N I T Y
			{
			mI(); 

			mN(); 

			mF(); 

			mI(); 

			mN(); 

			mI(); 

			mT(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INFINITY"

	// $ANTLR start "K_TUPLE"
	public final void mK_TUPLE() throws RecognitionException {
		try {
			int _type = K_TUPLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1752:8: ( T U P L E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1752:16: T U P L E
			{
			mT(); 

			mU(); 

			mP(); 

			mL(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TUPLE"

	// $ANTLR start "K_TRIGGER"
	public final void mK_TRIGGER() throws RecognitionException {
		try {
			int _type = K_TRIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1754:10: ( T R I G G E R )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1754:16: T R I G G E R
			{
			mT(); 

			mR(); 

			mI(); 

			mG(); 

			mG(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TRIGGER"

	// $ANTLR start "K_STATIC"
	public final void mK_STATIC() throws RecognitionException {
		try {
			int _type = K_STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1755:9: ( S T A T I C )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1755:16: S T A T I C
			{
			mS(); 

			mT(); 

			mA(); 

			mT(); 

			mI(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_STATIC"

	// $ANTLR start "K_FROZEN"
	public final void mK_FROZEN() throws RecognitionException {
		try {
			int _type = K_FROZEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1756:9: ( F R O Z E N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1756:16: F R O Z E N
			{
			mF(); 

			mR(); 

			mO(); 

			mZ(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FROZEN"

	// $ANTLR start "K_FUNCTION"
	public final void mK_FUNCTION() throws RecognitionException {
		try {
			int _type = K_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1758:11: ( F U N C T I O N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1758:16: F U N C T I O N
			{
			mF(); 

			mU(); 

			mN(); 

			mC(); 

			mT(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FUNCTION"

	// $ANTLR start "K_FUNCTIONS"
	public final void mK_FUNCTIONS() throws RecognitionException {
		try {
			int _type = K_FUNCTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1759:12: ( F U N C T I O N S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1759:16: F U N C T I O N S
			{
			mF(); 

			mU(); 

			mN(); 

			mC(); 

			mT(); 

			mI(); 

			mO(); 

			mN(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FUNCTIONS"

	// $ANTLR start "K_AGGREGATE"
	public final void mK_AGGREGATE() throws RecognitionException {
		try {
			int _type = K_AGGREGATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1760:12: ( A G G R E G A T E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1760:16: A G G R E G A T E
			{
			mA(); 

			mG(); 

			mG(); 

			mR(); 

			mE(); 

			mG(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_AGGREGATE"

	// $ANTLR start "K_SFUNC"
	public final void mK_SFUNC() throws RecognitionException {
		try {
			int _type = K_SFUNC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1761:8: ( S F U N C )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1761:16: S F U N C
			{
			mS(); 

			mF(); 

			mU(); 

			mN(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SFUNC"

	// $ANTLR start "K_STYPE"
	public final void mK_STYPE() throws RecognitionException {
		try {
			int _type = K_STYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1762:8: ( S T Y P E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1762:16: S T Y P E
			{
			mS(); 

			mT(); 

			mY(); 

			mP(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_STYPE"

	// $ANTLR start "K_FINALFUNC"
	public final void mK_FINALFUNC() throws RecognitionException {
		try {
			int _type = K_FINALFUNC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1763:12: ( F I N A L F U N C )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1763:16: F I N A L F U N C
			{
			mF(); 

			mI(); 

			mN(); 

			mA(); 

			mL(); 

			mF(); 

			mU(); 

			mN(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FINALFUNC"

	// $ANTLR start "K_INITCOND"
	public final void mK_INITCOND() throws RecognitionException {
		try {
			int _type = K_INITCOND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1764:11: ( I N I T C O N D )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1764:16: I N I T C O N D
			{
			mI(); 

			mN(); 

			mI(); 

			mT(); 

			mC(); 

			mO(); 

			mN(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INITCOND"

	// $ANTLR start "K_RETURNS"
	public final void mK_RETURNS() throws RecognitionException {
		try {
			int _type = K_RETURNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1765:10: ( R E T U R N S )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1765:16: R E T U R N S
			{
			mR(); 

			mE(); 

			mT(); 

			mU(); 

			mR(); 

			mN(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_RETURNS"

	// $ANTLR start "K_CALLED"
	public final void mK_CALLED() throws RecognitionException {
		try {
			int _type = K_CALLED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1766:9: ( C A L L E D )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1766:16: C A L L E D
			{
			mC(); 

			mA(); 

			mL(); 

			mL(); 

			mE(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CALLED"

	// $ANTLR start "K_INPUT"
	public final void mK_INPUT() throws RecognitionException {
		try {
			int _type = K_INPUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1767:8: ( I N P U T )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1767:16: I N P U T
			{
			mI(); 

			mN(); 

			mP(); 

			mU(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INPUT"

	// $ANTLR start "K_LANGUAGE"
	public final void mK_LANGUAGE() throws RecognitionException {
		try {
			int _type = K_LANGUAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1768:11: ( L A N G U A G E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1768:16: L A N G U A G E
			{
			mL(); 

			mA(); 

			mN(); 

			mG(); 

			mU(); 

			mA(); 

			mG(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LANGUAGE"

	// $ANTLR start "K_OR"
	public final void mK_OR() throws RecognitionException {
		try {
			int _type = K_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1769:5: ( O R )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1769:16: O R
			{
			mO(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_OR"

	// $ANTLR start "K_REPLACE"
	public final void mK_REPLACE() throws RecognitionException {
		try {
			int _type = K_REPLACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1770:10: ( R E P L A C E )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1770:16: R E P L A C E
			{
			mR(); 

			mE(); 

			mP(); 

			mL(); 

			mA(); 

			mC(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_REPLACE"

	// $ANTLR start "K_JSON"
	public final void mK_JSON() throws RecognitionException {
		try {
			int _type = K_JSON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1772:7: ( J S O N )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1772:16: J S O N
			{
			mJ(); 

			mS(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_JSON"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1775:11: ( ( 'a' | 'A' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "A"

	// $ANTLR start "B"
	public final void mB() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1776:11: ( ( 'b' | 'B' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B"

	// $ANTLR start "C"
	public final void mC() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1777:11: ( ( 'c' | 'C' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "C"

	// $ANTLR start "D"
	public final void mD() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1778:11: ( ( 'd' | 'D' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "D"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1779:11: ( ( 'e' | 'E' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1780:11: ( ( 'f' | 'F' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "F"

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1781:11: ( ( 'g' | 'G' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1782:11: ( ( 'h' | 'H' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "H"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1783:11: ( ( 'i' | 'I' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "I"

	// $ANTLR start "J"
	public final void mJ() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1784:11: ( ( 'j' | 'J' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "J"

	// $ANTLR start "K"
	public final void mK() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1785:11: ( ( 'k' | 'K' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1786:11: ( ( 'l' | 'L' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L"

	// $ANTLR start "M"
	public final void mM() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1787:11: ( ( 'm' | 'M' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "M"

	// $ANTLR start "N"
	public final void mN() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1788:11: ( ( 'n' | 'N' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "N"

	// $ANTLR start "O"
	public final void mO() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1789:11: ( ( 'o' | 'O' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "O"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1790:11: ( ( 'p' | 'P' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P"

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1791:11: ( ( 'q' | 'Q' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Q"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1792:11: ( ( 'r' | 'R' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1793:11: ( ( 's' | 'S' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1794:11: ( ( 't' | 'T' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	// $ANTLR start "U"
	public final void mU() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1795:11: ( ( 'u' | 'U' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "U"

	// $ANTLR start "V"
	public final void mV() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1796:11: ( ( 'v' | 'V' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "V"

	// $ANTLR start "W"
	public final void mW() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1797:11: ( ( 'w' | 'W' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "W"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1798:11: ( ( 'x' | 'X' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1799:11: ( ( 'y' | 'Y' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1800:11: ( ( 'z' | 'Z' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Z"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;


			        StringBuilder txt = new StringBuilder(); // temporary to build pg-style-string
			    
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1807:5: ( ( '\\$' '\\$' ({...}? =>c= . )* '\\$' '\\$' ) | ( '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\'' ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='$') ) {
				alt5=1;
			}
			else if ( (LA5_0=='\'') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1809:7: ( '\\$' '\\$' ({...}? =>c= . )* '\\$' '\\$' )
					{
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1809:7: ( '\\$' '\\$' ({...}? =>c= . )* '\\$' '\\$' )
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1810:9: '\\$' '\\$' ({...}? =>c= . )* '\\$' '\\$'
					{
					match('$'); 
					match('$'); 
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1811:9: ({...}? =>c= . )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0=='$') ) {
							int LA3_1 = input.LA(2);
							if ( (LA3_1=='$') ) {
								int LA3_3 = input.LA(3);
								if ( ((LA3_3 >= '\u0000' && LA3_3 <= '\uFFFF')) && ((  (input.size() - input.index() > 1)
								               && !"$$".equals(input.substring(input.index(), input.index() + 1)) ))) {
									alt3=1;
								}

							}
							else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '#')||(LA3_1 >= '%' && LA3_1 <= '\uFFFF')) && ((  (input.size() - input.index() > 1)
							               && !"$$".equals(input.substring(input.index(), input.index() + 1)) ))) {
								alt3=1;
							}

						}
						else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '#')||(LA3_0 >= '%' && LA3_0 <= '\uFFFF')) && ((  (input.size() - input.index() > 1)
						               && !"$$".equals(input.substring(input.index(), input.index() + 1)) ))) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1812:11: {...}? =>c= .
							{
							if ( !((  (input.size() - input.index() > 1)
							               && !"$$".equals(input.substring(input.index(), input.index() + 1)) )) ) {
								throw new FailedPredicateException(input, "STRING_LITERAL", "  (input.size() - input.index() > 1)\n               && !\"$$\".equals(input.substring(input.index(), input.index() + 1)) ");
							}
							c = input.LA(1);
							matchAny(); 
							 txt.appendCodePoint(c); 
							}
							break;

						default :
							break loop3;
						}
					}

					match('$'); 
					match('$'); 
					}

					}
					break;
				case 2 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1820:7: ( '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\'' )
					{
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1820:7: ( '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\'' )
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1821:9: '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\''
					{
					match('\''); 
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1821:14: (c=~ ( '\\'' ) | '\\'' '\\'' )*
					loop4:
					while (true) {
						int alt4=3;
						int LA4_0 = input.LA(1);
						if ( (LA4_0=='\'') ) {
							int LA4_1 = input.LA(2);
							if ( (LA4_1=='\'') ) {
								alt4=2;
							}

						}
						else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '&')||(LA4_0 >= '(' && LA4_0 <= '\uFFFF')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1821:15: c=~ ( '\\'' )
							{
							c= input.LA(1);
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							 txt.appendCodePoint(c);
							}
							break;
						case 2 :
							// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1821:54: '\\'' '\\''
							{
							match('\''); 
							match('\''); 
							 txt.appendCodePoint('\''); 
							}
							break;

						default :
							break loop4;
						}
					}

					match('\''); 
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
			 setText(txt.toString()); 
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "QUOTED_NAME"
	public final void mQUOTED_NAME() throws RecognitionException {
		try {
			int _type = QUOTED_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			 StringBuilder b = new StringBuilder(); 
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1828:5: ( '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )+ '\\\"' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1828:7: '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )+ '\\\"'
			{
			match('\"'); 
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1828:12: (c=~ ( '\\\"' ) | '\\\"' '\\\"' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\"') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='\"') ) {
						alt6=2;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1828:13: c=~ ( '\\\"' )
					{
					c= input.LA(1);
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					 b.appendCodePoint(c); 
					}
					break;
				case 2 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1828:51: '\\\"' '\\\"'
					{
					match('\"'); 
					match('\"'); 
					 b.appendCodePoint('\"'); 
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
			 setText(b.toString()); 
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTED_NAME"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1832:5: ( '0' .. '9' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1836:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "HEX"
	public final void mHEX() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1840:5: ( ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1844:5: ( E ( '+' | '-' )? ( DIGIT )+ )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1844:7: E ( '+' | '-' )? ( DIGIT )+
			{
			mE(); 

			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1844:9: ( '+' | '-' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='+'||LA7_0=='-') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1844:22: ( DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1848:5: ( ( '-' )? ( DIGIT )+ )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1848:7: ( '-' )? ( DIGIT )+
			{
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1848:7: ( '-' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='-') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1848:7: '-'
					{
					match('-'); 
					}
					break;

			}

			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1848:12: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "QMARK"
	public final void mQMARK() throws RecognitionException {
		try {
			int _type = QMARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1852:5: ( '?' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1852:7: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QMARK"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1860:5: ( INTEGER EXPONENT | INTEGER '.' ( DIGIT )* ( EXPONENT )? )
			int alt13=2;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1860:7: INTEGER EXPONENT
					{
					mINTEGER(); 

					mEXPONENT(); 

					}
					break;
				case 2 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1861:7: INTEGER '.' ( DIGIT )* ( EXPONENT )?
					{
					mINTEGER(); 

					match('.'); 
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1861:19: ( DIGIT )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop11;
						}
					}

					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1861:26: ( EXPONENT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1861:26: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1868:5: ( T R U E | F A L S E )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='T'||LA14_0=='t') ) {
				alt14=1;
			}
			else if ( (LA14_0=='F'||LA14_0=='f') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1868:7: T R U E
					{
					mT(); 

					mR(); 

					mU(); 

					mE(); 

					}
					break;
				case 2 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1868:17: F A L S E
					{
					mF(); 

					mA(); 

					mL(); 

					mS(); 

					mE(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1872:5: ( LETTER ( LETTER | DIGIT | '_' )* )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1872:7: LETTER ( LETTER | DIGIT | '_' )*
			{
			mLETTER(); 

			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1872:14: ( LETTER | DIGIT | '_' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')||(LA15_0 >= 'A' && LA15_0 <= 'Z')||LA15_0=='_'||(LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop15;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "HEXNUMBER"
	public final void mHEXNUMBER() throws RecognitionException {
		try {
			int _type = HEXNUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1876:5: ( '0' X ( HEX )* )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1876:7: '0' X ( HEX )*
			{
			match('0'); 
			mX(); 

			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1876:13: ( HEX )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '0' && LA16_0 <= '9')||(LA16_0 >= 'A' && LA16_0 <= 'F')||(LA16_0 >= 'a' && LA16_0 <= 'f')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEXNUMBER"

	// $ANTLR start "UUID"
	public final void mUUID() throws RecognitionException {
		try {
			int _type = UUID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1880:5: ( HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1880:7: HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX
			{
			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			match('-'); 
			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			match('-'); 
			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			match('-'); 
			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			match('-'); 
			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UUID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1888:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1888:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1888:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '\t' && LA17_0 <= '\n')||LA17_0=='\r'||LA17_0==' ') ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1892:5: ( ( '--' | '//' ) ( . )* ( '\\n' | '\\r' ) )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1892:7: ( '--' | '//' ) ( . )* ( '\\n' | '\\r' )
			{
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1892:7: ( '--' | '//' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='-') ) {
				alt18=1;
			}
			else if ( (LA18_0=='/') ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1892:8: '--'
					{
					match("--"); 

					}
					break;
				case 2 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1892:15: '//'
					{
					match("//"); 

					}
					break;

			}

			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1892:21: ( . )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0=='\n'||LA19_0=='\r') ) {
					alt19=2;
				}
				else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '\f')||(LA19_0 >= '\u000E' && LA19_0 <= '\uFFFF')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1892:21: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop19;
				}
			}

			if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "MULTILINE_COMMENT"
	public final void mMULTILINE_COMMENT() throws RecognitionException {
		try {
			int _type = MULTILINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1896:5: ( '/*' ( . )* '*/' )
			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1896:7: '/*' ( . )* '*/'
			{
			match("/*"); 

			// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1896:12: ( . )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0=='*') ) {
					int LA20_1 = input.LA(2);
					if ( (LA20_1=='/') ) {
						alt20=2;
					}
					else if ( ((LA20_1 >= '\u0000' && LA20_1 <= '.')||(LA20_1 >= '0' && LA20_1 <= '\uFFFF')) ) {
						alt20=1;
					}

				}
				else if ( ((LA20_0 >= '\u0000' && LA20_0 <= ')')||(LA20_0 >= '+' && LA20_0 <= '\uFFFF')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1896:12: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop20;
				}
			}

			match("*/"); 

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTILINE_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:8: ( T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | K_SELECT | K_FROM | K_AS | K_WHERE | K_AND | K_KEY | K_KEYS | K_ENTRIES | K_FULL | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_USE | K_DISTINCT | K_COUNT | K_SET | K_BEGIN | K_UNLOGGED | K_BATCH | K_APPLY | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_KEYSPACES | K_COLUMNFAMILY | K_MATERIALIZED | K_VIEW | K_INDEX | K_CUSTOM | K_ON | K_TO | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_RENAME | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_ALLOW | K_FILTERING | K_IF | K_IS | K_CONTAINS | K_GRANT | K_ALL | K_PERMISSION | K_PERMISSIONS | K_OF | K_REVOKE | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE | K_NORECURSIVE | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TINYINT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | K_WRITETIME | K_DATE | K_TIME | K_NULL | K_NOT | K_EXISTS | K_MAP | K_LIST | K_NAN | K_INFINITY | K_TUPLE | K_TRIGGER | K_STATIC | K_FROZEN | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_CALLED | K_INPUT | K_LANGUAGE | K_OR | K_REPLACE | K_JSON | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | BOOLEAN | IDENT | HEXNUMBER | UUID | WS | COMMENT | MULTILINE_COMMENT )
		int alt21=156;
		alt21 = dfa21.predict(input);
		switch (alt21) {
			case 1 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:10: T__170
				{
				mT__170(); 

				}
				break;
			case 2 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:17: T__171
				{
				mT__171(); 

				}
				break;
			case 3 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:24: T__172
				{
				mT__172(); 

				}
				break;
			case 4 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:31: T__173
				{
				mT__173(); 

				}
				break;
			case 5 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:38: T__174
				{
				mT__174(); 

				}
				break;
			case 6 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:45: T__175
				{
				mT__175(); 

				}
				break;
			case 7 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:52: T__176
				{
				mT__176(); 

				}
				break;
			case 8 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:59: T__177
				{
				mT__177(); 

				}
				break;
			case 9 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:66: T__178
				{
				mT__178(); 

				}
				break;
			case 10 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:73: T__179
				{
				mT__179(); 

				}
				break;
			case 11 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:80: T__180
				{
				mT__180(); 

				}
				break;
			case 12 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:87: T__181
				{
				mT__181(); 

				}
				break;
			case 13 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:94: T__182
				{
				mT__182(); 

				}
				break;
			case 14 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:101: T__183
				{
				mT__183(); 

				}
				break;
			case 15 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:108: T__184
				{
				mT__184(); 

				}
				break;
			case 16 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:115: T__185
				{
				mT__185(); 

				}
				break;
			case 17 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:122: T__186
				{
				mT__186(); 

				}
				break;
			case 18 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:129: T__187
				{
				mT__187(); 

				}
				break;
			case 19 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:136: T__188
				{
				mT__188(); 

				}
				break;
			case 20 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:143: T__189
				{
				mT__189(); 

				}
				break;
			case 21 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:150: K_SELECT
				{
				mK_SELECT(); 

				}
				break;
			case 22 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:159: K_FROM
				{
				mK_FROM(); 

				}
				break;
			case 23 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:166: K_AS
				{
				mK_AS(); 

				}
				break;
			case 24 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:171: K_WHERE
				{
				mK_WHERE(); 

				}
				break;
			case 25 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:179: K_AND
				{
				mK_AND(); 

				}
				break;
			case 26 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:185: K_KEY
				{
				mK_KEY(); 

				}
				break;
			case 27 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:191: K_KEYS
				{
				mK_KEYS(); 

				}
				break;
			case 28 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:198: K_ENTRIES
				{
				mK_ENTRIES(); 

				}
				break;
			case 29 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:208: K_FULL
				{
				mK_FULL(); 

				}
				break;
			case 30 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:215: K_INSERT
				{
				mK_INSERT(); 

				}
				break;
			case 31 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:224: K_UPDATE
				{
				mK_UPDATE(); 

				}
				break;
			case 32 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:233: K_WITH
				{
				mK_WITH(); 

				}
				break;
			case 33 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:240: K_LIMIT
				{
				mK_LIMIT(); 

				}
				break;
			case 34 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:248: K_USING
				{
				mK_USING(); 

				}
				break;
			case 35 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:256: K_USE
				{
				mK_USE(); 

				}
				break;
			case 36 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:262: K_DISTINCT
				{
				mK_DISTINCT(); 

				}
				break;
			case 37 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:273: K_COUNT
				{
				mK_COUNT(); 

				}
				break;
			case 38 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:281: K_SET
				{
				mK_SET(); 

				}
				break;
			case 39 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:287: K_BEGIN
				{
				mK_BEGIN(); 

				}
				break;
			case 40 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:295: K_UNLOGGED
				{
				mK_UNLOGGED(); 

				}
				break;
			case 41 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:306: K_BATCH
				{
				mK_BATCH(); 

				}
				break;
			case 42 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:314: K_APPLY
				{
				mK_APPLY(); 

				}
				break;
			case 43 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:322: K_TRUNCATE
				{
				mK_TRUNCATE(); 

				}
				break;
			case 44 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:333: K_DELETE
				{
				mK_DELETE(); 

				}
				break;
			case 45 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:342: K_IN
				{
				mK_IN(); 

				}
				break;
			case 46 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:347: K_CREATE
				{
				mK_CREATE(); 

				}
				break;
			case 47 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:356: K_KEYSPACE
				{
				mK_KEYSPACE(); 

				}
				break;
			case 48 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:367: K_KEYSPACES
				{
				mK_KEYSPACES(); 

				}
				break;
			case 49 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:379: K_COLUMNFAMILY
				{
				mK_COLUMNFAMILY(); 

				}
				break;
			case 50 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:394: K_MATERIALIZED
				{
				mK_MATERIALIZED(); 

				}
				break;
			case 51 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:409: K_VIEW
				{
				mK_VIEW(); 

				}
				break;
			case 52 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:416: K_INDEX
				{
				mK_INDEX(); 

				}
				break;
			case 53 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:424: K_CUSTOM
				{
				mK_CUSTOM(); 

				}
				break;
			case 54 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:433: K_ON
				{
				mK_ON(); 

				}
				break;
			case 55 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:438: K_TO
				{
				mK_TO(); 

				}
				break;
			case 56 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:443: K_DROP
				{
				mK_DROP(); 

				}
				break;
			case 57 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:450: K_PRIMARY
				{
				mK_PRIMARY(); 

				}
				break;
			case 58 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:460: K_INTO
				{
				mK_INTO(); 

				}
				break;
			case 59 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:467: K_VALUES
				{
				mK_VALUES(); 

				}
				break;
			case 60 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:476: K_TIMESTAMP
				{
				mK_TIMESTAMP(); 

				}
				break;
			case 61 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:488: K_TTL
				{
				mK_TTL(); 

				}
				break;
			case 62 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:494: K_ALTER
				{
				mK_ALTER(); 

				}
				break;
			case 63 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:502: K_RENAME
				{
				mK_RENAME(); 

				}
				break;
			case 64 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:511: K_ADD
				{
				mK_ADD(); 

				}
				break;
			case 65 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:517: K_TYPE
				{
				mK_TYPE(); 

				}
				break;
			case 66 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:524: K_COMPACT
				{
				mK_COMPACT(); 

				}
				break;
			case 67 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:534: K_STORAGE
				{
				mK_STORAGE(); 

				}
				break;
			case 68 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:544: K_ORDER
				{
				mK_ORDER(); 

				}
				break;
			case 69 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:552: K_BY
				{
				mK_BY(); 

				}
				break;
			case 70 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:557: K_ASC
				{
				mK_ASC(); 

				}
				break;
			case 71 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:563: K_DESC
				{
				mK_DESC(); 

				}
				break;
			case 72 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:570: K_ALLOW
				{
				mK_ALLOW(); 

				}
				break;
			case 73 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:578: K_FILTERING
				{
				mK_FILTERING(); 

				}
				break;
			case 74 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:590: K_IF
				{
				mK_IF(); 

				}
				break;
			case 75 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:595: K_IS
				{
				mK_IS(); 

				}
				break;
			case 76 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:600: K_CONTAINS
				{
				mK_CONTAINS(); 

				}
				break;
			case 77 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:611: K_GRANT
				{
				mK_GRANT(); 

				}
				break;
			case 78 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:619: K_ALL
				{
				mK_ALL(); 

				}
				break;
			case 79 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:625: K_PERMISSION
				{
				mK_PERMISSION(); 

				}
				break;
			case 80 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:638: K_PERMISSIONS
				{
				mK_PERMISSIONS(); 

				}
				break;
			case 81 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:652: K_OF
				{
				mK_OF(); 

				}
				break;
			case 82 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:657: K_REVOKE
				{
				mK_REVOKE(); 

				}
				break;
			case 83 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:666: K_MODIFY
				{
				mK_MODIFY(); 

				}
				break;
			case 84 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:675: K_AUTHORIZE
				{
				mK_AUTHORIZE(); 

				}
				break;
			case 85 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:687: K_DESCRIBE
				{
				mK_DESCRIBE(); 

				}
				break;
			case 86 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:698: K_EXECUTE
				{
				mK_EXECUTE(); 

				}
				break;
			case 87 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:708: K_NORECURSIVE
				{
				mK_NORECURSIVE(); 

				}
				break;
			case 88 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:722: K_USER
				{
				mK_USER(); 

				}
				break;
			case 89 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:729: K_USERS
				{
				mK_USERS(); 

				}
				break;
			case 90 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:737: K_ROLE
				{
				mK_ROLE(); 

				}
				break;
			case 91 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:744: K_ROLES
				{
				mK_ROLES(); 

				}
				break;
			case 92 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:752: K_SUPERUSER
				{
				mK_SUPERUSER(); 

				}
				break;
			case 93 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:764: K_NOSUPERUSER
				{
				mK_NOSUPERUSER(); 

				}
				break;
			case 94 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:778: K_PASSWORD
				{
				mK_PASSWORD(); 

				}
				break;
			case 95 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:789: K_LOGIN
				{
				mK_LOGIN(); 

				}
				break;
			case 96 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:797: K_NOLOGIN
				{
				mK_NOLOGIN(); 

				}
				break;
			case 97 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:807: K_OPTIONS
				{
				mK_OPTIONS(); 

				}
				break;
			case 98 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:817: K_CLUSTERING
				{
				mK_CLUSTERING(); 

				}
				break;
			case 99 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:830: K_ASCII
				{
				mK_ASCII(); 

				}
				break;
			case 100 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:838: K_BIGINT
				{
				mK_BIGINT(); 

				}
				break;
			case 101 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:847: K_BLOB
				{
				mK_BLOB(); 

				}
				break;
			case 102 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:854: K_BOOLEAN
				{
				mK_BOOLEAN(); 

				}
				break;
			case 103 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:864: K_COUNTER
				{
				mK_COUNTER(); 

				}
				break;
			case 104 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:874: K_DECIMAL
				{
				mK_DECIMAL(); 

				}
				break;
			case 105 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:884: K_DOUBLE
				{
				mK_DOUBLE(); 

				}
				break;
			case 106 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:893: K_FLOAT
				{
				mK_FLOAT(); 

				}
				break;
			case 107 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:901: K_INET
				{
				mK_INET(); 

				}
				break;
			case 108 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:908: K_INT
				{
				mK_INT(); 

				}
				break;
			case 109 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:914: K_SMALLINT
				{
				mK_SMALLINT(); 

				}
				break;
			case 110 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:925: K_TINYINT
				{
				mK_TINYINT(); 

				}
				break;
			case 111 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:935: K_TEXT
				{
				mK_TEXT(); 

				}
				break;
			case 112 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:942: K_UUID
				{
				mK_UUID(); 

				}
				break;
			case 113 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:949: K_VARCHAR
				{
				mK_VARCHAR(); 

				}
				break;
			case 114 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:959: K_VARINT
				{
				mK_VARINT(); 

				}
				break;
			case 115 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:968: K_TIMEUUID
				{
				mK_TIMEUUID(); 

				}
				break;
			case 116 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:979: K_TOKEN
				{
				mK_TOKEN(); 

				}
				break;
			case 117 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:987: K_WRITETIME
				{
				mK_WRITETIME(); 

				}
				break;
			case 118 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:999: K_DATE
				{
				mK_DATE(); 

				}
				break;
			case 119 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1006: K_TIME
				{
				mK_TIME(); 

				}
				break;
			case 120 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1013: K_NULL
				{
				mK_NULL(); 

				}
				break;
			case 121 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1020: K_NOT
				{
				mK_NOT(); 

				}
				break;
			case 122 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1026: K_EXISTS
				{
				mK_EXISTS(); 

				}
				break;
			case 123 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1035: K_MAP
				{
				mK_MAP(); 

				}
				break;
			case 124 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1041: K_LIST
				{
				mK_LIST(); 

				}
				break;
			case 125 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1048: K_NAN
				{
				mK_NAN(); 

				}
				break;
			case 126 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1054: K_INFINITY
				{
				mK_INFINITY(); 

				}
				break;
			case 127 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1065: K_TUPLE
				{
				mK_TUPLE(); 

				}
				break;
			case 128 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1073: K_TRIGGER
				{
				mK_TRIGGER(); 

				}
				break;
			case 129 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1083: K_STATIC
				{
				mK_STATIC(); 

				}
				break;
			case 130 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1092: K_FROZEN
				{
				mK_FROZEN(); 

				}
				break;
			case 131 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1101: K_FUNCTION
				{
				mK_FUNCTION(); 

				}
				break;
			case 132 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1112: K_FUNCTIONS
				{
				mK_FUNCTIONS(); 

				}
				break;
			case 133 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1124: K_AGGREGATE
				{
				mK_AGGREGATE(); 

				}
				break;
			case 134 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1136: K_SFUNC
				{
				mK_SFUNC(); 

				}
				break;
			case 135 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1144: K_STYPE
				{
				mK_STYPE(); 

				}
				break;
			case 136 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1152: K_FINALFUNC
				{
				mK_FINALFUNC(); 

				}
				break;
			case 137 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1164: K_INITCOND
				{
				mK_INITCOND(); 

				}
				break;
			case 138 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1175: K_RETURNS
				{
				mK_RETURNS(); 

				}
				break;
			case 139 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1185: K_CALLED
				{
				mK_CALLED(); 

				}
				break;
			case 140 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1194: K_INPUT
				{
				mK_INPUT(); 

				}
				break;
			case 141 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1202: K_LANGUAGE
				{
				mK_LANGUAGE(); 

				}
				break;
			case 142 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1213: K_OR
				{
				mK_OR(); 

				}
				break;
			case 143 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1218: K_REPLACE
				{
				mK_REPLACE(); 

				}
				break;
			case 144 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1228: K_JSON
				{
				mK_JSON(); 

				}
				break;
			case 145 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1235: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 146 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1250: QUOTED_NAME
				{
				mQUOTED_NAME(); 

				}
				break;
			case 147 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1262: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 148 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1270: QMARK
				{
				mQMARK(); 

				}
				break;
			case 149 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1276: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 150 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1282: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 151 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1290: IDENT
				{
				mIDENT(); 

				}
				break;
			case 152 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1296: HEXNUMBER
				{
				mHEXNUMBER(); 

				}
				break;
			case 153 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1306: UUID
				{
				mUUID(); 

				}
				break;
			case 154 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1311: WS
				{
				mWS(); 

				}
				break;
			case 155 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1314: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 156 :
				// /Users/shalini/Documents/workSpaceDR/cassandra-3.0.10/src/java/org/apache/cassandra/cql3/Cql.g:1:1322: MULTILINE_COMMENT
				{
				mMULTILINE_COMMENT(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA21 dfa21 = new DFA21(this);
	static final String DFA13_eotS =
		"\5\uffff";
	static final String DFA13_eofS =
		"\5\uffff";
	static final String DFA13_minS =
		"\1\55\1\60\1\56\2\uffff";
	static final String DFA13_maxS =
		"\2\71\1\145\2\uffff";
	static final String DFA13_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA13_specialS =
		"\5\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\1\2\uffff\12\2",
			"\12\2",
			"\1\4\1\uffff\12\2\13\uffff\1\3\37\uffff\1\3",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1859:1: FLOAT : ( INTEGER EXPONENT | INTEGER '.' ( DIGIT )* ( EXPONENT )? );";
		}
	}

	static final String DFA21_eotS =
		"\6\uffff\1\61\3\uffff\1\64\1\uffff\1\66\3\uffff\1\54\2\uffff\25\54\2\uffff"+
		"\1\u0085\2\uffff\1\u0085\4\uffff\1\u0085\4\uffff\17\54\1\u00a1\12\54\1"+
		"\u00ae\1\u00b6\1\u00b7\23\54\1\u00d2\5\54\1\u00d9\11\54\1\u00e7\1\u00e8"+
		"\1\u00ea\13\54\1\uffff\1\u0085\5\uffff\6\54\1\u0105\16\54\1\uffff\1\u0115"+
		"\1\u0117\2\54\1\u011a\1\u011c\5\54\1\u0122\1\uffff\2\54\1\u0126\4\54\2"+
		"\uffff\2\54\1\u012e\27\54\1\uffff\6\54\1\uffff\3\54\1\u0151\4\54\1\u0156"+
		"\4\54\2\uffff\1\54\1\uffff\15\54\1\u016a\1\54\1\u016c\1\54\1\u0085\1\uffff"+
		"\1\u0088\6\54\1\uffff\7\54\1\u017e\1\54\1\u0180\5\54\1\uffff\1\54\1\uffff"+
		"\2\54\1\uffff\1\54\1\uffff\3\54\1\u018d\1\54\1\uffff\1\u018f\2\54\1\uffff"+
		"\1\u0193\1\u0194\5\54\1\uffff\1\u019a\1\54\1\u019d\1\54\1\u019f\4\54\1"+
		"\u01a4\1\54\1\u01a7\1\54\1\u01a9\13\54\1\u01b5\2\54\1\u01b8\3\54\1\u01bc"+
		"\1\54\1\uffff\1\u01c0\1\u01c1\2\54\1\uffff\1\54\1\u01c5\14\54\1\u01d2"+
		"\4\54\1\uffff\1\u01d8\1\uffff\1\u01d9\1\u0085\1\uffff\1\u0088\1\uffff"+
		"\10\54\1\u01e5\2\54\1\u01e8\1\uffff\1\54\1\uffff\3\54\1\u01ed\1\u01b8"+
		"\1\u01ee\1\u01ef\1\u01f0\1\u01f1\2\54\1\u01f4\1\uffff\1\54\1\uffff\2\54"+
		"\1\u01f8\2\uffff\2\54\1\u01fb\1\54\1\u01fd\1\uffff\1\u01fe\1\54\1\uffff"+
		"\1\u0200\1\uffff\1\u0201\3\54\1\uffff\2\54\1\uffff\1\54\1\uffff\1\u0208"+
		"\7\54\1\u0211\1\u0212\1\54\1\uffff\2\54\1\uffff\1\54\1\u0217\1\u0218\1"+
		"\uffff\3\54\2\uffff\1\u021c\2\54\1\uffff\3\54\1\u0222\10\54\1\uffff\1"+
		"\u022b\1\u022c\3\54\2\uffff\1\u0085\1\uffff\1\u0088\1\54\1\u0234\2\54"+
		"\1\u0237\1\u0238\1\54\1\u023a\1\uffff\2\54\1\uffff\1\u023d\3\54\5\uffff"+
		"\2\54\1\uffff\2\54\1\u0245\1\uffff\2\54\1\uffff\1\u0248\2\uffff\1\54\2"+
		"\uffff\2\54\1\u024c\2\54\1\u024f\1\uffff\4\54\1\u0254\1\u0255\1\54\1\u0257"+
		"\2\uffff\1\u0258\3\54\2\uffff\3\54\1\uffff\1\54\1\u0260\1\u0261\1\54\1"+
		"\u0263\1\uffff\4\54\1\u0268\1\u0269\2\54\2\uffff\3\54\1\u0085\1\uffff"+
		"\1\u0088\1\u0272\1\uffff\1\u0273\1\54\2\uffff\1\u0275\1\uffff\2\54\1\uffff"+
		"\7\54\1\uffff\2\54\1\uffff\3\54\1\uffff\1\54\1\u0285\1\uffff\1\u0286\1"+
		"\54\1\u0288\1\54\2\uffff\1\54\2\uffff\1\u028b\1\54\1\u028d\2\54\1\u0290"+
		"\1\54\2\uffff\1\u0292\1\uffff\1\u0293\1\u0294\2\54\2\uffff\1\u0297\1\u0298"+
		"\2\54\1\u029b\1\u0085\1\uffff\1\u0088\2\uffff\1\54\1\uffff\1\54\1\u02a0"+
		"\1\u02a1\5\54\1\u0238\1\u02a9\1\u02aa\1\u02ab\1\u02ac\1\u02ad\1\u02ae"+
		"\2\uffff\1\54\1\uffff\1\u02b0\1\54\1\uffff\1\u02b2\1\uffff\1\54\1\u02b4"+
		"\1\uffff\1\54\3\uffff\1\54\1\u02b7\2\uffff\2\54\1\uffff\1\u0085\1\uffff"+
		"\1\u0088\1\u02bb\2\uffff\1\u02bc\1\u02bd\1\u02be\1\u02bf\1\u02c0\1\u02c1"+
		"\1\u02c2\6\uffff\1\54\1\uffff\1\54\1\uffff\1\u02c5\1\uffff\2\54\1\uffff"+
		"\2\54\11\uffff\1\54\1\u02cc\1\uffff\1\54\1\u02ce\2\54\1\u0088\1\54\1\uffff"+
		"\1\54\1\uffff\1\u02d5\1\u02d6\1\u02d7\1\u0088\1\u0217\1\u02d9\3\uffff"+
		"\1\u0088\1\uffff\1\u0088";
	static final String DFA21_eofS =
		"\u02db\uffff";
	static final String DFA21_minS =
		"\1\11\5\uffff\1\55\3\uffff\1\75\1\uffff\1\75\3\uffff\1\60\2\uffff\1\103"+
		"\2\60\1\110\1\105\1\60\1\106\1\116\1\101\3\60\3\101\1\106\1\101\1\105"+
		"\1\122\1\101\1\123\2\uffff\1\56\2\uffff\1\56\1\uffff\1\52\2\uffff\1\56"+
		"\4\uffff\1\105\1\124\1\105\1\60\1\114\1\110\1\101\1\120\1\101\1\125\1"+
		"\117\2\114\1\117\2\60\1\104\1\120\1\114\1\60\1\124\1\107\1\105\1\124\1"+
		"\111\1\131\3\60\1\104\1\105\1\114\1\111\1\115\1\107\1\116\1\123\1\60\1"+
		"\117\1\125\1\60\1\114\1\105\1\123\1\125\4\60\1\107\2\117\1\111\1\102\1"+
		"\60\1\115\1\114\1\120\1\130\2\120\1\104\1\105\1\114\3\60\1\124\1\111\1"+
		"\122\1\123\1\116\1\114\1\101\2\114\1\116\1\117\1\uffff\1\56\1\53\4\uffff"+
		"\1\162\1\103\1\123\1\122\1\60\1\105\1\60\1\105\1\122\1\124\1\120\1\105"+
		"\1\114\1\116\1\115\1\114\1\103\1\124\2\101\1\123\1\uffff\2\60\1\114\1"+
		"\105\2\60\1\110\2\122\1\110\1\124\1\60\1\uffff\2\105\1\60\1\124\1\111"+
		"\1\124\1\125\2\uffff\1\101\1\116\1\60\1\117\1\104\1\111\1\124\1\111\1"+
		"\107\1\124\1\105\1\103\1\60\1\120\1\102\1\105\1\116\1\125\1\120\1\124"+
		"\1\101\1\124\1\123\1\114\1\111\1\103\1\uffff\1\111\1\102\1\114\1\105\1"+
		"\107\1\114\1\uffff\2\105\1\131\1\60\1\105\1\124\1\114\1\105\1\60\1\111"+
		"\1\127\1\125\1\103\2\uffff\1\105\1\uffff\1\111\2\115\1\123\1\101\1\117"+
		"\1\125\1\114\1\105\1\116\1\105\1\125\1\117\1\60\1\114\1\60\1\116\1\56"+
		"\1\53\1\60\1\50\1\125\1\124\1\111\1\60\1\103\1\uffff\1\115\1\101\1\111"+
		"\1\105\1\122\1\114\1\103\1\60\1\105\1\60\1\124\1\105\1\114\1\124\1\105"+
		"\1\uffff\1\111\1\uffff\1\131\1\122\1\uffff\1\127\1\uffff\1\117\2\105\1"+
		"\60\1\105\1\uffff\1\60\1\122\1\130\1\uffff\2\60\1\116\1\103\2\124\1\107"+
		"\1\uffff\1\60\1\107\1\60\1\124\1\60\1\116\1\125\1\111\1\124\1\60\1\115"+
		"\1\60\1\114\1\60\1\124\1\115\2\101\1\124\1\117\1\124\1\105\1\116\1\110"+
		"\1\116\1\60\1\105\1\103\1\60\1\107\1\105\1\116\1\60\1\111\1\uffff\2\60"+
		"\1\105\1\122\1\uffff\1\106\1\60\1\105\1\110\1\116\1\122\1\117\1\101\1"+
		"\111\1\127\1\115\1\113\1\122\1\101\1\60\1\124\1\103\1\120\1\107\1\uffff"+
		"\1\60\1\uffff\1\60\1\56\1\53\1\60\1\uffff\1\124\1\123\1\105\1\60\1\124"+
		"\1\101\1\107\1\103\1\60\1\125\1\111\1\60\1\uffff\1\116\1\uffff\1\111\1"+
		"\122\1\106\6\60\1\122\1\107\1\60\1\uffff\1\124\1\uffff\1\101\1\124\1\60"+
		"\2\uffff\1\111\1\117\1\60\1\105\1\60\1\uffff\1\60\1\107\1\uffff\1\60\1"+
		"\uffff\1\60\1\101\1\116\1\105\1\uffff\1\111\1\101\1\uffff\1\105\1\uffff"+
		"\1\60\1\116\1\103\1\111\1\105\1\115\1\105\1\104\2\60\1\124\1\uffff\2\101"+
		"\1\uffff\1\105\2\60\1\uffff\1\124\1\125\1\116\2\uffff\1\60\1\111\1\131"+
		"\1\uffff\1\123\1\101\1\124\1\60\1\116\1\122\1\123\1\117\2\105\1\116\1"+
		"\103\1\uffff\2\60\1\125\1\105\1\111\2\uffff\1\56\1\53\1\60\1\105\1\60"+
		"\1\123\3\60\1\105\1\60\1\uffff\1\123\1\116\1\uffff\1\60\1\117\1\111\1"+
		"\125\5\uffff\1\111\1\101\1\uffff\1\111\1\103\1\60\1\uffff\1\124\1\116"+
		"\1\uffff\1\60\2\uffff\1\105\2\uffff\1\107\1\103\1\60\1\102\1\114\1\60"+
		"\1\uffff\1\122\1\106\1\124\1\116\2\60\1\122\1\60\2\uffff\1\60\1\116\1"+
		"\124\1\122\2\uffff\1\101\1\111\1\124\1\uffff\1\101\2\60\1\122\1\60\1\uffff"+
		"\1\123\1\131\1\123\1\122\2\60\1\123\1\105\2\uffff\2\122\1\116\1\56\1\53"+
		"\2\60\1\uffff\2\60\2\uffff\1\60\1\uffff\1\105\1\124\1\uffff\3\116\1\132"+
		"\1\124\1\115\1\105\1\uffff\1\131\1\104\1\uffff\1\104\1\105\1\124\1\uffff"+
		"\1\105\1\60\1\uffff\1\60\1\101\1\60\1\123\2\uffff\1\111\2\uffff\1\60\1"+
		"\105\1\60\1\115\1\104\1\60\1\114\2\uffff\1\60\1\uffff\2\60\1\111\1\104"+
		"\2\uffff\2\60\1\123\1\125\1\60\1\56\1\53\1\60\2\uffff\1\55\1\uffff\1\122"+
		"\2\60\1\107\1\103\3\105\7\60\2\uffff\1\115\1\uffff\1\60\1\116\1\uffff"+
		"\1\60\1\uffff\1\120\1\60\1\uffff\1\111\3\uffff\1\117\1\60\2\uffff\1\111"+
		"\1\123\1\uffff\1\55\1\53\1\55\1\60\2\uffff\7\60\6\uffff\1\111\1\uffff"+
		"\1\107\1\uffff\1\60\1\uffff\1\132\1\116\1\uffff\1\126\1\105\1\60\10\uffff"+
		"\1\114\1\60\1\uffff\1\105\1\60\1\105\1\122\1\60\1\131\1\uffff\1\104\1"+
		"\uffff\6\60\3\uffff\1\60\1\uffff\1\55";
	static final String DFA21_maxS =
		"\1\175\5\uffff\1\71\3\uffff\1\75\1\uffff\1\75\3\uffff\1\170\2\uffff\3"+
		"\165\1\162\1\145\1\170\1\163\1\165\1\157\1\162\1\165\2\171\1\157\1\151"+
		"\2\162\1\157\1\162\1\165\1\163\2\uffff\1\170\2\uffff\1\146\1\uffff\1\57"+
		"\2\uffff\1\145\4\uffff\1\160\1\164\1\151\1\146\1\164\1\150\1\171\1\160"+
		"\1\141\1\165\1\157\2\156\1\157\1\154\1\172\1\144\1\160\1\164\1\146\1\164"+
		"\1\147\1\145\1\164\1\151\1\171\3\172\1\144\1\151\1\154\1\151\1\163\1\147"+
		"\1\156\2\163\1\157\1\165\1\164\1\165\1\145\1\163\1\165\1\154\1\147\1\164"+
		"\1\172\1\147\2\157\1\165\1\142\1\172\1\156\1\154\1\160\1\170\1\160\1\164"+
		"\1\144\1\145\1\162\3\172\1\164\1\151\1\162\1\163\1\166\1\154\1\141\1\164"+
		"\1\154\1\156\1\157\1\uffff\2\146\4\uffff\1\162\1\143\1\163\1\162\1\146"+
		"\1\145\1\172\1\145\1\162\1\164\1\160\1\145\1\154\1\156\1\172\1\154\1\143"+
		"\1\164\2\141\1\163\1\uffff\2\172\1\154\1\145\2\172\1\150\2\162\1\150\1"+
		"\164\1\172\1\uffff\2\145\1\172\1\164\1\151\1\164\1\165\2\uffff\1\141\1"+
		"\156\1\172\1\157\1\144\1\151\1\164\1\151\1\147\1\164\1\145\1\143\1\151"+
		"\1\160\1\142\1\145\1\156\1\165\1\160\1\164\1\141\1\164\1\163\1\154\1\151"+
		"\1\143\1\uffff\1\151\1\142\1\154\1\156\1\147\1\154\1\uffff\2\145\1\171"+
		"\1\172\1\145\1\164\1\154\1\145\1\172\1\151\1\167\1\165\1\151\2\uffff\1"+
		"\145\1\uffff\1\151\2\155\1\163\1\141\1\157\1\165\1\154\1\145\1\156\1\145"+
		"\1\165\1\157\1\172\1\154\1\172\1\156\3\146\1\50\1\165\1\164\1\151\1\146"+
		"\1\143\1\uffff\1\155\1\141\1\151\1\145\1\162\1\154\1\143\1\172\1\145\1"+
		"\172\1\164\1\145\1\154\1\164\1\145\1\uffff\1\151\1\uffff\1\171\1\162\1"+
		"\uffff\1\167\1\uffff\1\157\2\145\1\172\1\145\1\uffff\1\172\1\162\1\170"+
		"\1\uffff\2\172\1\156\1\143\2\164\1\147\1\uffff\1\172\1\147\1\172\1\164"+
		"\1\172\1\156\1\165\1\151\1\164\1\172\1\155\1\172\1\154\1\172\1\164\1\155"+
		"\2\141\1\164\1\157\1\164\1\145\1\156\1\150\1\156\1\172\1\145\1\143\1\172"+
		"\1\147\1\145\1\156\1\172\1\151\1\uffff\2\172\1\145\1\162\1\uffff\1\146"+
		"\1\172\1\145\1\150\1\156\1\162\1\157\1\141\1\151\1\167\1\155\1\153\1\162"+
		"\1\141\1\172\1\164\1\143\1\160\1\147\1\uffff\1\172\1\uffff\1\172\3\146"+
		"\1\uffff\1\164\1\163\1\145\1\146\1\164\1\141\1\147\1\143\1\172\1\165\1"+
		"\151\1\172\1\uffff\1\156\1\uffff\1\151\1\162\1\146\6\172\1\162\1\147\1"+
		"\172\1\uffff\1\164\1\uffff\1\141\1\164\1\172\2\uffff\1\151\1\157\1\172"+
		"\1\145\1\172\1\uffff\1\172\1\147\1\uffff\1\172\1\uffff\1\172\1\141\1\156"+
		"\1\145\1\uffff\1\151\1\141\1\uffff\1\145\1\uffff\1\172\1\156\1\143\1\151"+
		"\1\145\1\155\1\145\1\144\2\172\1\164\1\uffff\2\141\1\uffff\1\145\2\172"+
		"\1\uffff\1\164\1\165\1\156\2\uffff\1\172\1\151\1\171\1\uffff\1\163\1\141"+
		"\1\164\1\172\1\156\1\162\1\163\1\157\2\145\1\156\1\143\1\uffff\2\172\1"+
		"\165\1\145\1\151\2\uffff\3\146\1\145\1\172\1\163\1\146\2\172\1\145\1\172"+
		"\1\uffff\1\163\1\156\1\uffff\1\172\1\157\1\151\1\165\5\uffff\1\151\1\141"+
		"\1\uffff\1\151\1\143\1\172\1\uffff\1\164\1\156\1\uffff\1\172\2\uffff\1"+
		"\145\2\uffff\1\147\1\143\1\172\1\142\1\154\1\172\1\uffff\1\162\1\146\1"+
		"\164\1\156\2\172\1\162\1\172\2\uffff\1\172\1\156\1\164\1\162\2\uffff\1"+
		"\141\1\151\1\164\1\uffff\1\141\2\172\1\162\1\172\1\uffff\1\163\1\171\1"+
		"\163\1\162\2\172\1\163\1\145\2\uffff\2\162\1\156\3\146\1\172\1\uffff\1"+
		"\172\1\146\2\uffff\1\172\1\uffff\1\145\1\164\1\uffff\3\156\1\172\1\164"+
		"\1\155\1\145\1\uffff\1\171\1\144\1\uffff\1\144\1\145\1\164\1\uffff\1\145"+
		"\1\172\1\uffff\1\172\1\141\1\172\1\163\2\uffff\1\151\2\uffff\1\172\1\145"+
		"\1\172\1\155\1\144\1\172\1\154\2\uffff\1\172\1\uffff\2\172\1\151\1\144"+
		"\2\uffff\2\172\1\163\1\165\1\172\3\146\2\uffff\1\55\1\uffff\1\162\2\172"+
		"\1\147\1\143\3\145\7\172\2\uffff\1\155\1\uffff\1\172\1\156\1\uffff\1\172"+
		"\1\uffff\1\160\1\172\1\uffff\1\151\3\uffff\1\157\1\172\2\uffff\1\151\1"+
		"\163\1\uffff\1\145\1\71\1\55\1\172\2\uffff\7\172\6\uffff\1\151\1\uffff"+
		"\1\147\1\uffff\1\172\1\uffff\1\172\1\156\1\uffff\1\166\1\145\1\146\10"+
		"\uffff\1\154\1\172\1\uffff\1\145\1\172\1\145\1\162\1\146\1\171\1\uffff"+
		"\1\144\1\uffff\3\172\1\146\2\172\3\uffff\1\146\1\uffff\1\55";
	static final String DFA21_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\uffff\1\14\1\uffff"+
		"\1\17\1\20\1\21\1\uffff\1\23\1\24\25\uffff\1\u0091\1\u0092\1\uffff\1\u0094"+
		"\1\u0097\1\uffff\1\u009a\1\uffff\1\u009b\1\6\1\uffff\1\13\1\12\1\16\1"+
		"\15\116\uffff\1\u0093\2\uffff\1\u0095\1\u0098\1\u0099\1\u009c\25\uffff"+
		"\1\27\14\uffff\1\55\7\uffff\1\112\1\113\32\uffff\1\105\6\uffff\1\67\15"+
		"\uffff\1\66\1\u008e\1\uffff\1\121\32\uffff\1\46\17\uffff\1\106\1\uffff"+
		"\1\31\2\uffff\1\116\1\uffff\1\100\5\uffff\1\32\3\uffff\1\154\7\uffff\1"+
		"\43\42\uffff\1\75\4\uffff\1\173\23\uffff\1\171\1\uffff\1\175\4\uffff\1"+
		"\22\14\uffff\1\26\1\uffff\1\35\14\uffff\1\40\1\uffff\1\33\3\uffff\1\72"+
		"\1\153\5\uffff\1\130\2\uffff\1\160\1\uffff\1\174\4\uffff\1\107\2\uffff"+
		"\1\70\1\uffff\1\166\13\uffff\1\145\2\uffff\1\u0096\3\uffff\1\167\3\uffff"+
		"\1\101\1\157\3\uffff\1\63\14\uffff\1\132\5\uffff\1\170\1\u0090\13\uffff"+
		"\1\u0087\2\uffff\1\u0086\4\uffff\1\152\1\143\1\52\1\76\1\110\2\uffff\1"+
		"\30\3\uffff\1\64\2\uffff\1\u008c\1\uffff\1\42\1\131\1\uffff\1\41\1\137"+
		"\6\uffff\1\45\10\uffff\1\47\1\51\4\uffff\1\61\1\164\3\uffff\1\177\5\uffff"+
		"\1\104\10\uffff\1\133\1\115\7\uffff\1\172\2\uffff\1\25\1\57\1\uffff\1"+
		"\u0081\2\uffff\1\u0082\7\uffff\1\36\2\uffff\1\37\3\uffff\1\54\2\uffff"+
		"\1\151\4\uffff\1\56\1\65\1\uffff\1\u008b\1\144\7\uffff\1\123\1\73\1\uffff"+
		"\1\162\4\uffff\1\77\1\122\10\uffff\1\126\1\34\1\uffff\1\103\17\uffff\1"+
		"\150\1\147\1\uffff\1\102\2\uffff\1\146\1\uffff\1\u0080\2\uffff\1\156\1"+
		"\uffff\1\161\1\141\1\71\2\uffff\1\u008a\1\u008f\2\uffff\1\140\4\uffff"+
		"\1\155\1\u0083\7\uffff\1\176\1\u0089\1\50\1\u008d\1\44\1\125\1\uffff\1"+
		"\114\1\uffff\1\53\1\uffff\1\163\2\uffff\1\136\3\uffff\1\134\1\u0084\1"+
		"\111\1\u0088\1\124\1\u0085\1\165\1\60\2\uffff\1\74\6\uffff\1\142\1\uffff"+
		"\1\117\6\uffff\1\120\1\127\1\135\1\uffff\1\62\1\uffff";
	static final String DFA21_specialS =
		"\u02db\uffff}>";
	static final String[] DFA21_transitionS = {
			"\2\56\2\uffff\1\56\22\uffff\1\56\1\1\1\51\1\uffff\1\50\2\uffff\1\50\1"+
			"\2\1\3\1\16\1\4\1\5\1\6\1\7\1\57\1\52\11\55\1\10\1\11\1\12\1\13\1\14"+
			"\1\53\1\uffff\1\25\1\36\1\35\1\34\1\30\1\24\1\45\1\54\1\31\1\47\1\27"+
			"\1\33\1\40\1\46\1\42\1\43\1\54\1\44\1\23\1\37\1\32\1\41\1\26\3\54\1\15"+
			"\1\uffff\1\17\3\uffff\1\25\1\36\1\35\1\34\1\20\1\24\1\45\1\54\1\31\1"+
			"\47\1\27\1\33\1\40\1\46\1\42\1\43\1\54\1\44\1\23\1\37\1\32\1\41\1\26"+
			"\3\54\1\21\1\uffff\1\22",
			"",
			"",
			"",
			"",
			"",
			"\1\60\2\uffff\12\62",
			"",
			"",
			"",
			"\1\63",
			"",
			"\1\65",
			"",
			"",
			"",
			"\12\72\7\uffff\6\72\7\uffff\1\70\11\uffff\1\71\10\uffff\6\72\7\uffff"+
			"\1\70\11\uffff\1\67",
			"",
			"",
			"\1\74\1\uffff\1\73\1\100\6\uffff\1\77\6\uffff\1\75\1\76\15\uffff\1\74"+
			"\1\uffff\1\73\1\100\6\uffff\1\77\6\uffff\1\75\1\76",
			"\12\72\7\uffff\1\105\5\72\2\uffff\1\103\2\uffff\1\104\5\uffff\1\101"+
			"\2\uffff\1\102\13\uffff\1\105\5\72\2\uffff\1\103\2\uffff\1\104\5\uffff"+
			"\1\101\2\uffff\1\102",
			"\12\72\7\uffff\3\72\1\112\2\72\1\114\4\uffff\1\111\1\uffff\1\107\1\uffff"+
			"\1\110\2\uffff\1\106\1\uffff\1\113\13\uffff\3\72\1\112\2\72\1\114\4\uffff"+
			"\1\111\1\uffff\1\107\1\uffff\1\110\2\uffff\1\106\1\uffff\1\113",
			"\1\115\1\116\10\uffff\1\117\25\uffff\1\115\1\116\10\uffff\1\117",
			"\1\120\37\uffff\1\120",
			"\12\72\7\uffff\6\72\7\uffff\1\70\11\uffff\1\71\10\uffff\6\72\7\uffff"+
			"\1\70\11\uffff\1\71",
			"\1\122\7\uffff\1\121\4\uffff\1\123\22\uffff\1\122\7\uffff\1\121\4\uffff"+
			"\1\123",
			"\1\126\1\uffff\1\124\2\uffff\1\125\1\uffff\1\127\30\uffff\1\126\1\uffff"+
			"\1\124\2\uffff\1\125\1\uffff\1\127",
			"\1\132\7\uffff\1\130\5\uffff\1\131\21\uffff\1\132\7\uffff\1\130\5\uffff"+
			"\1\131",
			"\12\72\7\uffff\1\137\3\72\1\134\1\72\2\uffff\1\133\5\uffff\1\136\2\uffff"+
			"\1\135\16\uffff\1\137\3\72\1\134\1\72\2\uffff\1\133\5\uffff\1\136\2\uffff"+
			"\1\135",
			"\12\72\7\uffff\1\144\5\72\5\uffff\1\143\2\uffff\1\140\2\uffff\1\141"+
			"\2\uffff\1\142\13\uffff\1\144\5\72\5\uffff\1\143\2\uffff\1\140\2\uffff"+
			"\1\141\2\uffff\1\142",
			"\12\72\7\uffff\1\146\3\72\1\145\1\72\2\uffff\1\150\2\uffff\1\151\2\uffff"+
			"\1\152\11\uffff\1\147\7\uffff\1\146\3\72\1\145\1\72\2\uffff\1\150\2\uffff"+
			"\1\151\2\uffff\1\152\11\uffff\1\147",
			"\1\154\3\uffff\1\161\3\uffff\1\156\5\uffff\1\155\2\uffff\1\153\1\uffff"+
			"\1\157\1\162\3\uffff\1\160\7\uffff\1\154\3\uffff\1\161\3\uffff\1\156"+
			"\5\uffff\1\155\2\uffff\1\153\1\uffff\1\157\1\162\3\uffff\1\160",
			"\1\163\15\uffff\1\164\21\uffff\1\163\15\uffff\1\164",
			"\1\166\7\uffff\1\165\27\uffff\1\166\7\uffff\1\165",
			"\1\171\7\uffff\1\167\1\uffff\1\172\1\uffff\1\170\23\uffff\1\171\7\uffff"+
			"\1\167\1\uffff\1\172\1\uffff\1\170",
			"\1\175\3\uffff\1\174\14\uffff\1\173\16\uffff\1\175\3\uffff\1\174\14"+
			"\uffff\1\173",
			"\1\176\11\uffff\1\177\25\uffff\1\176\11\uffff\1\177",
			"\1\u0080\37\uffff\1\u0080",
			"\1\u0083\15\uffff\1\u0081\5\uffff\1\u0082\13\uffff\1\u0083\15\uffff"+
			"\1\u0081\5\uffff\1\u0082",
			"\1\u0084\37\uffff\1\u0084",
			"",
			"",
			"\1\u0088\1\uffff\12\u0086\7\uffff\4\u008a\1\u0087\1\u008a\21\uffff\1"+
			"\u0089\10\uffff\4\u008a\1\u0087\1\u008a\21\uffff\1\u0089",
			"",
			"",
			"\1\u0088\1\uffff\12\u0086\7\uffff\4\u008a\1\u0087\1\u008a\32\uffff\4"+
			"\u008a\1\u0087\1\u008a",
			"",
			"\1\u008b\4\uffff\1\60",
			"",
			"",
			"\1\u0088\1\uffff\12\62\13\uffff\1\u0088\37\uffff\1\u0088",
			"",
			"",
			"",
			"",
			"\1\u008d\3\uffff\1\u008e\33\uffff\1\u008d\3\uffff\1\u008e\6\uffff\1"+
			"\u008c",
			"\1\u008f\37\uffff\1\u008f",
			"\1\u008d\3\uffff\1\u008e\33\uffff\1\u008d\3\uffff\1\u008e",
			"\12\u0090\7\uffff\6\u0090\32\uffff\6\u0090",
			"\1\u0091\7\uffff\1\u0092\27\uffff\1\u0091\7\uffff\1\u0092",
			"\1\u0093\37\uffff\1\u0093",
			"\1\u0095\15\uffff\1\u0094\11\uffff\1\u0096\7\uffff\1\u0095\15\uffff"+
			"\1\u0094\11\uffff\1\u0096",
			"\1\u0097\37\uffff\1\u0097",
			"\1\u0098\37\uffff\1\u0098",
			"\1\u0099\37\uffff\1\u0099",
			"\1\u009a\37\uffff\1\u009a",
			"\1\u009b\1\uffff\1\u009c\35\uffff\1\u009b\1\uffff\1\u009c",
			"\1\u009d\1\uffff\1\u009e\35\uffff\1\u009d\1\uffff\1\u009e",
			"\1\u009f\37\uffff\1\u009f",
			"\12\u0090\7\uffff\6\u0090\5\uffff\1\u00a0\24\uffff\6\u0090\5\uffff\1"+
			"\u00a0",
			"\12\54\7\uffff\2\54\1\u00a2\27\54\4\uffff\1\54\1\uffff\2\54\1\u00a2"+
			"\27\54",
			"\1\u00a3\37\uffff\1\u00a3",
			"\1\u00a4\37\uffff\1\u00a4",
			"\1\u00a6\7\uffff\1\u00a5\27\uffff\1\u00a6\7\uffff\1\u00a5",
			"\12\u0090\7\uffff\3\u0090\1\u00a7\2\u0090\32\uffff\3\u0090\1\u00a7\2"+
			"\u0090",
			"\1\u00a8\37\uffff\1\u00a8",
			"\1\u00a9\37\uffff\1\u00a9",
			"\1\u00aa\37\uffff\1\u00aa",
			"\1\u00ab\37\uffff\1\u00ab",
			"\1\u00ac\37\uffff\1\u00ac",
			"\1\u00ad\37\uffff\1\u00ad",
			"\12\54\7\uffff\3\54\1\u00b0\1\u00b2\1\u00b3\2\54\1\u00b4\6\54\1\u00b5"+
			"\2\54\1\u00af\1\u00b1\6\54\4\uffff\1\54\1\uffff\3\54\1\u00b0\1\u00b2"+
			"\1\u00b3\2\54\1\u00b4\6\54\1\u00b5\2\54\1\u00af\1\u00b1\6\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00b8\37\uffff\1\u00b8",
			"\1\u00ba\3\uffff\1\u00b9\33\uffff\1\u00ba\3\uffff\1\u00b9",
			"\1\u00bb\37\uffff\1\u00bb",
			"\1\u00bc\37\uffff\1\u00bc",
			"\1\u00bd\5\uffff\1\u00be\31\uffff\1\u00bd\5\uffff\1\u00be",
			"\1\u00bf\37\uffff\1\u00bf",
			"\1\u00c0\37\uffff\1\u00c0",
			"\1\u00c1\37\uffff\1\u00c1",
			"\12\u0090\7\uffff\2\u0090\1\u00c4\3\u0090\5\uffff\1\u00c2\6\uffff\1"+
			"\u00c3\15\uffff\2\u0090\1\u00c4\3\u0090\5\uffff\1\u00c2\6\uffff\1\u00c3",
			"\1\u00c5\37\uffff\1\u00c5",
			"\1\u00c6\37\uffff\1\u00c6",
			"\12\u0090\7\uffff\6\u0090\15\uffff\1\u00c7\14\uffff\6\u0090\15\uffff"+
			"\1\u00c7",
			"\1\u00c9\1\u00ca\1\u00cb\6\uffff\1\u00c8\26\uffff\1\u00c9\1\u00ca\1"+
			"\u00cb\6\uffff\1\u00c8",
			"\1\u00cc\37\uffff\1\u00cc",
			"\1\u00cd\37\uffff\1\u00cd",
			"\1\u00ce\37\uffff\1\u00ce",
			"\12\u0090\7\uffff\6\u0090\5\uffff\1\u00cf\24\uffff\6\u0090\5\uffff\1"+
			"\u00cf",
			"\12\u0090\7\uffff\6\u0090\1\u00d0\31\uffff\6\u0090\1\u00d0",
			"\12\u0090\7\uffff\6\u0090\15\uffff\1\u00d1\14\uffff\6\u0090\15\uffff"+
			"\1\u00d1",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00d3\37\uffff\1\u00d3",
			"\1\u00d4\37\uffff\1\u00d4",
			"\1\u00d5\37\uffff\1\u00d5",
			"\1\u00d7\13\uffff\1\u00d6\23\uffff\1\u00d7\13\uffff\1\u00d6",
			"\1\u00d8\37\uffff\1\u00d8",
			"\12\54\7\uffff\12\54\1\u00da\17\54\4\uffff\1\54\1\uffff\12\54\1\u00da"+
			"\17\54",
			"\1\u00db\1\u00dc\36\uffff\1\u00db\1\u00dc",
			"\1\u00dd\37\uffff\1\u00dd",
			"\1\u00de\37\uffff\1\u00de",
			"\1\u00df\37\uffff\1\u00df",
			"\1\u00e0\37\uffff\1\u00e0",
			"\1\u00e2\3\uffff\1\u00e1\33\uffff\1\u00e2\3\uffff\1\u00e1",
			"\1\u00e3\37\uffff\1\u00e3",
			"\1\u00e4\37\uffff\1\u00e4",
			"\1\u00e5\5\uffff\1\u00e6\31\uffff\1\u00e5\5\uffff\1\u00e6",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\3\54\1\u00e9\26\54\4\uffff\1\54\1\uffff\3\54\1\u00e9"+
			"\26\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00eb\37\uffff\1\u00eb",
			"\1\u00ec\37\uffff\1\u00ec",
			"\1\u00ed\37\uffff\1\u00ed",
			"\1\u00ee\37\uffff\1\u00ee",
			"\1\u00ef\1\uffff\1\u00f2\3\uffff\1\u00f1\1\uffff\1\u00f0\27\uffff\1"+
			"\u00ef\1\uffff\1\u00f2\3\uffff\1\u00f1\1\uffff\1\u00f0",
			"\1\u00f3\37\uffff\1\u00f3",
			"\1\u00f4\37\uffff\1\u00f4",
			"\1\u00f7\5\uffff\1\u00f5\1\u00f6\1\u00f8\27\uffff\1\u00f7\5\uffff\1"+
			"\u00f5\1\u00f6\1\u00f8",
			"\1\u00f9\37\uffff\1\u00f9",
			"\1\u00fa\37\uffff\1\u00fa",
			"\1\u00fb\37\uffff\1\u00fb",
			"",
			"\1\u0088\1\uffff\12\u00fc\7\uffff\4\u008a\1\u00fd\1\u008a\32\uffff\4"+
			"\u008a\1\u00fd\1\u008a",
			"\1\u0088\1\uffff\1\u0088\2\uffff\12\u00fe\7\uffff\6\u008a\32\uffff\6"+
			"\u008a",
			"",
			"",
			"",
			"",
			"\1\u00ff",
			"\1\u0100\37\uffff\1\u0100",
			"\1\u0101\37\uffff\1\u0101",
			"\1\u0102\37\uffff\1\u0102",
			"\12\u0103\7\uffff\6\u0103\32\uffff\6\u0103",
			"\1\u0104\37\uffff\1\u0104",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0106\37\uffff\1\u0106",
			"\1\u0107\37\uffff\1\u0107",
			"\1\u0108\37\uffff\1\u0108",
			"\1\u0109\37\uffff\1\u0109",
			"\1\u010a\37\uffff\1\u010a",
			"\1\u010b\37\uffff\1\u010b",
			"\1\u010c\37\uffff\1\u010c",
			"\1\u010d\14\uffff\1\u010e\22\uffff\1\u010d\14\uffff\1\u010e",
			"\1\u010f\37\uffff\1\u010f",
			"\1\u0110\37\uffff\1\u0110",
			"\1\u0111\37\uffff\1\u0111",
			"\1\u0112\37\uffff\1\u0112",
			"\1\u0113\37\uffff\1\u0113",
			"\1\u0114\37\uffff\1\u0114",
			"",
			"\12\54\7\uffff\10\54\1\u0116\21\54\4\uffff\1\54\1\uffff\10\54\1\u0116"+
			"\21\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0118\37\uffff\1\u0118",
			"\1\u0119\37\uffff\1\u0119",
			"\12\54\7\uffff\16\54\1\u011b\13\54\4\uffff\1\54\1\uffff\16\54\1\u011b"+
			"\13\54",
			"\12\u0103\7\uffff\6\u0103\24\54\4\uffff\1\54\1\uffff\6\u0103\24\54",
			"\1\u011d\37\uffff\1\u011d",
			"\1\u011e\37\uffff\1\u011e",
			"\1\u011f\37\uffff\1\u011f",
			"\1\u0120\37\uffff\1\u0120",
			"\1\u0121\37\uffff\1\u0121",
			"\12\54\7\uffff\22\54\1\u0123\7\54\4\uffff\1\54\1\uffff\22\54\1\u0123"+
			"\7\54",
			"",
			"\1\u0124\37\uffff\1\u0124",
			"\1\u0125\37\uffff\1\u0125",
			"\12\54\7\uffff\16\54\1\u0127\13\54\4\uffff\1\54\1\uffff\16\54\1\u0127"+
			"\13\54",
			"\1\u0128\37\uffff\1\u0128",
			"\1\u0129\37\uffff\1\u0129",
			"\1\u012a\37\uffff\1\u012a",
			"\1\u012b\37\uffff\1\u012b",
			"",
			"",
			"\1\u012c\37\uffff\1\u012c",
			"\1\u012d\37\uffff\1\u012d",
			"\12\54\7\uffff\21\54\1\u012f\10\54\4\uffff\1\54\1\uffff\21\54\1\u012f"+
			"\10\54",
			"\1\u0130\37\uffff\1\u0130",
			"\1\u0131\37\uffff\1\u0131",
			"\1\u0132\37\uffff\1\u0132",
			"\1\u0133\37\uffff\1\u0133",
			"\1\u0134\37\uffff\1\u0134",
			"\1\u0135\37\uffff\1\u0135",
			"\1\u0136\37\uffff\1\u0136",
			"\1\u0137\37\uffff\1\u0137",
			"\1\u0138\37\uffff\1\u0138",
			"\12\u0103\7\uffff\6\u0103\2\uffff\1\u0139\27\uffff\6\u0103\2\uffff\1"+
			"\u0139",
			"\1\u013a\37\uffff\1\u013a",
			"\1\u013b\37\uffff\1\u013b",
			"\1\u013c\37\uffff\1\u013c",
			"\1\u013d\37\uffff\1\u013d",
			"\1\u013e\37\uffff\1\u013e",
			"\1\u013f\37\uffff\1\u013f",
			"\1\u0140\37\uffff\1\u0140",
			"\1\u0141\37\uffff\1\u0141",
			"\1\u0142\37\uffff\1\u0142",
			"\1\u0143\37\uffff\1\u0143",
			"\1\u0144\37\uffff\1\u0144",
			"\1\u0145\37\uffff\1\u0145",
			"\1\u0146\37\uffff\1\u0146",
			"",
			"\1\u0147\37\uffff\1\u0147",
			"\1\u0148\37\uffff\1\u0148",
			"\1\u0149\37\uffff\1\u0149",
			"\1\u014b\10\uffff\1\u014a\26\uffff\1\u014b\10\uffff\1\u014a",
			"\1\u014c\37\uffff\1\u014c",
			"\1\u014d\37\uffff\1\u014d",
			"",
			"\1\u014e\37\uffff\1\u014e",
			"\1\u014f\37\uffff\1\u014f",
			"\1\u0150\37\uffff\1\u0150",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0152\37\uffff\1\u0152",
			"\1\u0153\37\uffff\1\u0153",
			"\1\u0154\37\uffff\1\u0154",
			"\1\u0155\37\uffff\1\u0155",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0157\37\uffff\1\u0157",
			"\1\u0158\37\uffff\1\u0158",
			"\1\u0159\37\uffff\1\u0159",
			"\1\u015a\5\uffff\1\u015b\31\uffff\1\u015a\5\uffff\1\u015b",
			"",
			"",
			"\1\u015c\37\uffff\1\u015c",
			"",
			"\1\u015d\37\uffff\1\u015d",
			"\1\u015e\37\uffff\1\u015e",
			"\1\u015f\37\uffff\1\u015f",
			"\1\u0160\37\uffff\1\u0160",
			"\1\u0161\37\uffff\1\u0161",
			"\1\u0162\37\uffff\1\u0162",
			"\1\u0163\37\uffff\1\u0163",
			"\1\u0164\37\uffff\1\u0164",
			"\1\u0165\37\uffff\1\u0165",
			"\1\u0166\37\uffff\1\u0166",
			"\1\u0167\37\uffff\1\u0167",
			"\1\u0168\37\uffff\1\u0168",
			"\1\u0169\37\uffff\1\u0169",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u016b\37\uffff\1\u016b",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u016d\37\uffff\1\u016d",
			"\1\u0088\1\uffff\12\u016e\7\uffff\4\u008a\1\u016f\1\u008a\32\uffff\4"+
			"\u008a\1\u016f\1\u008a",
			"\1\u0088\1\uffff\1\u0088\2\uffff\12\u0170\7\uffff\6\u008a\32\uffff\6"+
			"\u008a",
			"\12\u0170\7\uffff\6\u008a\32\uffff\6\u008a",
			"\1\u0171",
			"\1\u0172\37\uffff\1\u0172",
			"\1\u0173\37\uffff\1\u0173",
			"\1\u0174\37\uffff\1\u0174",
			"\12\u0175\7\uffff\6\u0175\32\uffff\6\u0175",
			"\1\u0176\37\uffff\1\u0176",
			"",
			"\1\u0177\37\uffff\1\u0177",
			"\1\u0178\37\uffff\1\u0178",
			"\1\u0179\37\uffff\1\u0179",
			"\1\u017a\37\uffff\1\u017a",
			"\1\u017b\37\uffff\1\u017b",
			"\1\u017c\37\uffff\1\u017c",
			"\1\u017d\37\uffff\1\u017d",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u017f\37\uffff\1\u017f",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0181\37\uffff\1\u0181",
			"\1\u0182\37\uffff\1\u0182",
			"\1\u0183\37\uffff\1\u0183",
			"\1\u0184\37\uffff\1\u0184",
			"\1\u0185\37\uffff\1\u0185",
			"",
			"\1\u0186\37\uffff\1\u0186",
			"",
			"\1\u0187\37\uffff\1\u0187",
			"\1\u0188\37\uffff\1\u0188",
			"",
			"\1\u0189\37\uffff\1\u0189",
			"",
			"\1\u018a\37\uffff\1\u018a",
			"\1\u018b\37\uffff\1\u018b",
			"\1\u018c\37\uffff\1\u018c",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u018e\37\uffff\1\u018e",
			"",
			"\12\54\7\uffff\17\54\1\u0190\12\54\4\uffff\1\54\1\uffff\17\54\1\u0190"+
			"\12\54",
			"\1\u0191\37\uffff\1\u0191",
			"\1\u0192\37\uffff\1\u0192",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0195\37\uffff\1\u0195",
			"\1\u0196\37\uffff\1\u0196",
			"\1\u0197\37\uffff\1\u0197",
			"\1\u0198\37\uffff\1\u0198",
			"\1\u0199\37\uffff\1\u0199",
			"",
			"\12\54\7\uffff\22\54\1\u019b\7\54\4\uffff\1\54\1\uffff\22\54\1\u019b"+
			"\7\54",
			"\1\u019c\37\uffff\1\u019c",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u019e\37\uffff\1\u019e",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u01a0\37\uffff\1\u01a0",
			"\1\u01a1\37\uffff\1\u01a1",
			"\1\u01a2\37\uffff\1\u01a2",
			"\1\u01a3\37\uffff\1\u01a3",
			"\12\54\7\uffff\21\54\1\u01a5\10\54\4\uffff\1\54\1\uffff\21\54\1\u01a5"+
			"\10\54",
			"\1\u01a6\37\uffff\1\u01a6",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u01a8\37\uffff\1\u01a8",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u01aa\37\uffff\1\u01aa",
			"\1\u01ab\37\uffff\1\u01ab",
			"\1\u01ac\37\uffff\1\u01ac",
			"\1\u01ad\37\uffff\1\u01ad",
			"\1\u01ae\37\uffff\1\u01ae",
			"\1\u01af\37\uffff\1\u01af",
			"\1\u01b0\37\uffff\1\u01b0",
			"\1\u01b1\37\uffff\1\u01b1",
			"\1\u01b2\37\uffff\1\u01b2",
			"\1\u01b3\37\uffff\1\u01b3",
			"\1\u01b4\37\uffff\1\u01b4",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u01b6\37\uffff\1\u01b6",
			"\1\u01b7\37\uffff\1\u01b7",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u01b9\37\uffff\1\u01b9",
			"\1\u01ba\37\uffff\1\u01ba",
			"\1\u01bb\37\uffff\1\u01bb",
			"\12\54\7\uffff\22\54\1\u01bd\1\54\1\u01be\5\54\4\uffff\1\54\1\uffff"+
			"\22\54\1\u01bd\1\54\1\u01be\5\54",
			"\1\u01bf\37\uffff\1\u01bf",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u01c2\37\uffff\1\u01c2",
			"\1\u01c3\37\uffff\1\u01c3",
			"",
			"\1\u01c4\37\uffff\1\u01c4",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u01c6\37\uffff\1\u01c6",
			"\1\u01c7\37\uffff\1\u01c7",
			"\1\u01c8\37\uffff\1\u01c8",
			"\1\u01c9\37\uffff\1\u01c9",
			"\1\u01ca\37\uffff\1\u01ca",
			"\1\u01cb\37\uffff\1\u01cb",
			"\1\u01cc\37\uffff\1\u01cc",
			"\1\u01cd\37\uffff\1\u01cd",
			"\1\u01ce\37\uffff\1\u01ce",
			"\1\u01cf\37\uffff\1\u01cf",
			"\1\u01d0\37\uffff\1\u01d0",
			"\1\u01d1\37\uffff\1\u01d1",
			"\12\54\7\uffff\22\54\1\u01d3\7\54\4\uffff\1\54\1\uffff\22\54\1\u01d3"+
			"\7\54",
			"\1\u01d4\37\uffff\1\u01d4",
			"\1\u01d5\37\uffff\1\u01d5",
			"\1\u01d6\37\uffff\1\u01d6",
			"\1\u01d7\37\uffff\1\u01d7",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0088\1\uffff\12\u01da\7\uffff\4\u008a\1\u01db\1\u008a\32\uffff\4"+
			"\u008a\1\u01db\1\u008a",
			"\1\u0088\1\uffff\1\u0088\2\uffff\12\u01dc\7\uffff\6\u008a\32\uffff\6"+
			"\u008a",
			"\12\u01dc\7\uffff\6\u008a\32\uffff\6\u008a",
			"",
			"\1\u01dd\37\uffff\1\u01dd",
			"\1\u01de\37\uffff\1\u01de",
			"\1\u01df\37\uffff\1\u01df",
			"\12\u01e0\7\uffff\6\u01e0\32\uffff\6\u01e0",
			"\1\u01e1\37\uffff\1\u01e1",
			"\1\u01e2\37\uffff\1\u01e2",
			"\1\u01e3\37\uffff\1\u01e3",
			"\1\u01e4\37\uffff\1\u01e4",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u01e6\37\uffff\1\u01e6",
			"\1\u01e7\37\uffff\1\u01e7",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u01e9\37\uffff\1\u01e9",
			"",
			"\1\u01ea\37\uffff\1\u01ea",
			"\1\u01eb\37\uffff\1\u01eb",
			"\1\u01ec\37\uffff\1\u01ec",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u01f2\37\uffff\1\u01f2",
			"\1\u01f3\37\uffff\1\u01f3",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u01f5\37\uffff\1\u01f5",
			"",
			"\1\u01f6\37\uffff\1\u01f6",
			"\1\u01f7\37\uffff\1\u01f7",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\1\u01f9\37\uffff\1\u01f9",
			"\1\u01fa\37\uffff\1\u01fa",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u01fc\37\uffff\1\u01fc",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u01ff\37\uffff\1\u01ff",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0202\37\uffff\1\u0202",
			"\1\u0203\37\uffff\1\u0203",
			"\1\u0204\37\uffff\1\u0204",
			"",
			"\1\u0205\37\uffff\1\u0205",
			"\1\u0206\37\uffff\1\u0206",
			"",
			"\1\u0207\37\uffff\1\u0207",
			"",
			"\12\54\7\uffff\4\54\1\u0209\25\54\4\uffff\1\54\1\uffff\4\54\1\u0209"+
			"\25\54",
			"\1\u020a\37\uffff\1\u020a",
			"\1\u020b\37\uffff\1\u020b",
			"\1\u020c\37\uffff\1\u020c",
			"\1\u020d\37\uffff\1\u020d",
			"\1\u020e\37\uffff\1\u020e",
			"\1\u020f\37\uffff\1\u020f",
			"\1\u0210\37\uffff\1\u0210",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0213\37\uffff\1\u0213",
			"",
			"\1\u0214\37\uffff\1\u0214",
			"\1\u0215\37\uffff\1\u0215",
			"",
			"\1\u0216\37\uffff\1\u0216",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u0219\37\uffff\1\u0219",
			"\1\u021a\37\uffff\1\u021a",
			"\1\u021b\37\uffff\1\u021b",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u021d\37\uffff\1\u021d",
			"\1\u021e\37\uffff\1\u021e",
			"",
			"\1\u021f\37\uffff\1\u021f",
			"\1\u0220\37\uffff\1\u0220",
			"\1\u0221\37\uffff\1\u0221",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0223\37\uffff\1\u0223",
			"\1\u0224\37\uffff\1\u0224",
			"\1\u0225\37\uffff\1\u0225",
			"\1\u0226\37\uffff\1\u0226",
			"\1\u0227\37\uffff\1\u0227",
			"\1\u0228\37\uffff\1\u0228",
			"\1\u0229\37\uffff\1\u0229",
			"\1\u022a\37\uffff\1\u022a",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u022d\37\uffff\1\u022d",
			"\1\u022e\37\uffff\1\u022e",
			"\1\u022f\37\uffff\1\u022f",
			"",
			"",
			"\1\u0088\1\uffff\12\u0230\7\uffff\4\u008a\1\u0231\1\u008a\32\uffff\4"+
			"\u008a\1\u0231\1\u008a",
			"\1\u0088\1\uffff\1\u0088\2\uffff\12\u0232\7\uffff\6\u008a\32\uffff\6"+
			"\u008a",
			"\12\u0232\7\uffff\6\u008a\32\uffff\6\u008a",
			"\1\u0233\37\uffff\1\u0233",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0235\37\uffff\1\u0235",
			"\12\u0236\7\uffff\6\u0236\32\uffff\6\u0236",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0239\37\uffff\1\u0239",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u023b\37\uffff\1\u023b",
			"\1\u023c\37\uffff\1\u023c",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u023e\37\uffff\1\u023e",
			"\1\u023f\37\uffff\1\u023f",
			"\1\u0240\37\uffff\1\u0240",
			"",
			"",
			"",
			"",
			"",
			"\1\u0241\37\uffff\1\u0241",
			"\1\u0242\37\uffff\1\u0242",
			"",
			"\1\u0243\37\uffff\1\u0243",
			"\1\u0244\37\uffff\1\u0244",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u0246\37\uffff\1\u0246",
			"\1\u0247\37\uffff\1\u0247",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\1\u0249\37\uffff\1\u0249",
			"",
			"",
			"\1\u024a\37\uffff\1\u024a",
			"\1\u024b\37\uffff\1\u024b",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u024d\37\uffff\1\u024d",
			"\1\u024e\37\uffff\1\u024e",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u0250\37\uffff\1\u0250",
			"\1\u0251\37\uffff\1\u0251",
			"\1\u0252\37\uffff\1\u0252",
			"\1\u0253\37\uffff\1\u0253",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0256\37\uffff\1\u0256",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0259\37\uffff\1\u0259",
			"\1\u025a\37\uffff\1\u025a",
			"\1\u025b\37\uffff\1\u025b",
			"",
			"",
			"\1\u025c\37\uffff\1\u025c",
			"\1\u025d\37\uffff\1\u025d",
			"\1\u025e\37\uffff\1\u025e",
			"",
			"\1\u025f\37\uffff\1\u025f",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0262\37\uffff\1\u0262",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u0264\37\uffff\1\u0264",
			"\1\u0265\37\uffff\1\u0265",
			"\1\u0266\37\uffff\1\u0266",
			"\1\u0267\37\uffff\1\u0267",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u026a\37\uffff\1\u026a",
			"\1\u026b\37\uffff\1\u026b",
			"",
			"",
			"\1\u026c\37\uffff\1\u026c",
			"\1\u026d\37\uffff\1\u026d",
			"\1\u026e\37\uffff\1\u026e",
			"\1\u0088\1\uffff\12\u026f\7\uffff\4\u008a\1\u0270\1\u008a\32\uffff\4"+
			"\u008a\1\u0270\1\u008a",
			"\1\u0088\1\uffff\1\u0088\2\uffff\12\u0271\7\uffff\6\u008a\32\uffff\6"+
			"\u008a",
			"\12\u0271\7\uffff\6\u008a\32\uffff\6\u008a",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\u0274\7\uffff\6\u0274\32\uffff\6\u0274",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u0276\37\uffff\1\u0276",
			"\1\u0277\37\uffff\1\u0277",
			"",
			"\1\u0278\37\uffff\1\u0278",
			"\1\u0279\37\uffff\1\u0279",
			"\1\u027a\37\uffff\1\u027a",
			"\1\u027b\37\uffff\1\u027b",
			"\1\u027c\37\uffff\1\u027c",
			"\1\u027d\37\uffff\1\u027d",
			"\1\u027e\37\uffff\1\u027e",
			"",
			"\1\u027f\37\uffff\1\u027f",
			"\1\u0280\37\uffff\1\u0280",
			"",
			"\1\u0281\37\uffff\1\u0281",
			"\1\u0282\37\uffff\1\u0282",
			"\1\u0283\37\uffff\1\u0283",
			"",
			"\1\u0284\37\uffff\1\u0284",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0287\37\uffff\1\u0287",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0289\37\uffff\1\u0289",
			"",
			"",
			"\1\u028a\37\uffff\1\u028a",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u028c\37\uffff\1\u028c",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u028e\37\uffff\1\u028e",
			"\1\u028f\37\uffff\1\u028f",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0291\37\uffff\1\u0291",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0295\37\uffff\1\u0295",
			"\1\u0296\37\uffff\1\u0296",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0299\37\uffff\1\u0299",
			"\1\u029a\37\uffff\1\u029a",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0088\1\uffff\12\u029c\7\uffff\4\u008a\1\u029d\1\u008a\32\uffff\4"+
			"\u008a\1\u029d\1\u008a",
			"\1\u0088\1\uffff\1\u0088\2\uffff\12\u029e\7\uffff\6\u008a\32\uffff\6"+
			"\u008a",
			"\12\u029e\7\uffff\6\u008a\32\uffff\6\u008a",
			"",
			"",
			"\1\u008a",
			"",
			"\1\u029f\37\uffff\1\u029f",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\22\54\1\u02a2\7\54\4\uffff\1\54\1\uffff\22\54\1\u02a2"+
			"\7\54",
			"\1\u02a3\37\uffff\1\u02a3",
			"\1\u02a4\37\uffff\1\u02a4",
			"\1\u02a5\37\uffff\1\u02a5",
			"\1\u02a6\37\uffff\1\u02a6",
			"\1\u02a7\37\uffff\1\u02a7",
			"\12\54\7\uffff\22\54\1\u02a8\7\54\4\uffff\1\54\1\uffff\22\54\1\u02a8"+
			"\7\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\1\u02af\37\uffff\1\u02af",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u02b1\37\uffff\1\u02b1",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u02b3\37\uffff\1\u02b3",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u02b5\37\uffff\1\u02b5",
			"",
			"",
			"",
			"\1\u02b6\37\uffff\1\u02b6",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\1\u02b8\37\uffff\1\u02b8",
			"\1\u02b9\37\uffff\1\u02b9",
			"",
			"\1\u008a\1\u0088\1\uffff\12\62\13\uffff\1\u0088\37\uffff\1\u0088",
			"\1\u0088\1\uffff\1\u02ba\2\uffff\12\u0088",
			"\1\u008a",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02c3\37\uffff\1\u02c3",
			"",
			"\1\u02c4\37\uffff\1\u02c4",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u02c6\37\uffff\1\u02c6",
			"\1\u02c7\37\uffff\1\u02c7",
			"",
			"\1\u02c8\37\uffff\1\u02c8",
			"\1\u02c9\37\uffff\1\u02c9",
			"\12\u02ca\7\uffff\6\u008a\32\uffff\6\u008a",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02cb\37\uffff\1\u02cb",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u02cd\37\uffff\1\u02cd",
			"\12\54\7\uffff\22\54\1\u02cf\7\54\4\uffff\1\54\1\uffff\22\54\1\u02cf"+
			"\7\54",
			"\1\u02d0\37\uffff\1\u02d0",
			"\1\u02d1\37\uffff\1\u02d1",
			"\12\u02d2\7\uffff\6\u008a\32\uffff\6\u008a",
			"\1\u02d3\37\uffff\1\u02d3",
			"",
			"\1\u02d4\37\uffff\1\u02d4",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\u02d8\7\uffff\6\u008a\32\uffff\6\u008a",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"",
			"\12\u02da\7\uffff\6\u008a\32\uffff\6\u008a",
			"",
			"\1\u008a"
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | K_SELECT | K_FROM | K_AS | K_WHERE | K_AND | K_KEY | K_KEYS | K_ENTRIES | K_FULL | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_USE | K_DISTINCT | K_COUNT | K_SET | K_BEGIN | K_UNLOGGED | K_BATCH | K_APPLY | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_KEYSPACES | K_COLUMNFAMILY | K_MATERIALIZED | K_VIEW | K_INDEX | K_CUSTOM | K_ON | K_TO | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_RENAME | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_ALLOW | K_FILTERING | K_IF | K_IS | K_CONTAINS | K_GRANT | K_ALL | K_PERMISSION | K_PERMISSIONS | K_OF | K_REVOKE | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE | K_NORECURSIVE | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TINYINT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | K_WRITETIME | K_DATE | K_TIME | K_NULL | K_NOT | K_EXISTS | K_MAP | K_LIST | K_NAN | K_INFINITY | K_TUPLE | K_TRIGGER | K_STATIC | K_FROZEN | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_CALLED | K_INPUT | K_LANGUAGE | K_OR | K_REPLACE | K_JSON | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | BOOLEAN | IDENT | HEXNUMBER | UUID | WS | COMMENT | MULTILINE_COMMENT );";
		}
	}

}
