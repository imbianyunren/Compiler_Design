// $ANTLR 3.5.2 myLexer.g 2022-03-25 19:09:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ANTI_SLASH=5;
	public static final int ASTERISK=6;
	public static final int BREAK=7;
	public static final int CASE=8;
	public static final int CHAR_TYPE=9;
	public static final int COLON=10;
	public static final int COMMA=11;
	public static final int COMMENT1=12;
	public static final int COMMENT2=13;
	public static final int CONST_TYPE=14;
	public static final int CONTINUE=15;
	public static final int DEC_NUM=16;
	public static final int DEFAULT=17;
	public static final int DEFINE=18;
	public static final int DIGIT=19;
	public static final int DOLLAR=20;
	public static final int DOUBLE_TYPE=21;
	public static final int DQUOTATION=22;
	public static final int EEOF=23;
	public static final int ELSE=24;
	public static final int ELSE_IF=25;
	public static final int EQ_OP=26;
	public static final int FLOAT_NUM=27;
	public static final int FLOAT_NUM1=28;
	public static final int FLOAT_NUM2=29;
	public static final int FLOAT_NUM3=30;
	public static final int FLOAT_TYPE=31;
	public static final int FOR=32;
	public static final int GE_OP=33;
	public static final int HASHTAG=34;
	public static final int HEADER=35;
	public static final int ID=36;
	public static final int IF=37;
	public static final int INCLUDE=38;
	public static final int INT_TYPE=39;
	public static final int LCURLY=40;
	public static final int LESS=41;
	public static final int LETTER=42;
	public static final int LE_OP=43;
	public static final int LONG_TYPE=44;
	public static final int LPAREN=45;
	public static final int LSHIFT_OP=46;
	public static final int LSQUARE=47;
	public static final int MAIN_=48;
	public static final int MINUS=49;
	public static final int MM_OP=50;
	public static final int MOD=51;
	public static final int MOREE=52;
	public static final int NEW_LINE=53;
	public static final int NE_OP=54;
	public static final int NULL=55;
	public static final int OR=56;
	public static final int PLUS=57;
	public static final int POW=58;
	public static final int PP_OP=59;
	public static final int PRINTF=60;
	public static final int RCURLY=61;
	public static final int RETURNN=62;
	public static final int RPAREN=63;
	public static final int RSHIFT_OP=64;
	public static final int RSQUARE=65;
	public static final int SCANF=66;
	public static final int SEMICOLON=67;
	public static final int SIGNED=68;
	public static final int SINGLE_EQ=69;
	public static final int SIZEOF=70;
	public static final int SLASH=71;
	public static final int SPECIAL=72;
	public static final int SQUOTATION=73;
	public static final int STRING=74;
	public static final int STRUCT=75;
	public static final int SWITCH=76;
	public static final int TILDE=77;
	public static final int UNSIGNED=78;
	public static final int VOID_TYPE=79;
	public static final int WHILE_=80;
	public static final int WS=81;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myLexer() {} 
	public myLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myLexer.g"; }

	// $ANTLR start "DEFINE"
	public final void mDEFINE() throws RecognitionException {
		try {
			int _type = DEFINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:10:8: ( '#define' )
			// myLexer.g:10:10: '#define'
			{
			match("#define"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFINE"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:11:11: ( '#include' )
			// myLexer.g:11:13: '#include'
			{
			match("#include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "HEADER"
	public final void mHEADER() throws RecognitionException {
		try {
			int _type = HEADER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:12:8: ( ( LETTER )* '.h' )
			// myLexer.g:12:9: ( LETTER )* '.h'
			{
			// myLexer.g:12:9: ( LETTER )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myLexer.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop1;
				}
			}

			match(".h"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEADER"

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:15:11: ( 'int' )
			// myLexer.g:15:13: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:16:11: ( 'char' )
			// myLexer.g:16:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:17:11: ( 'void' )
			// myLexer.g:17:13: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:18:11: ( 'float' )
			// myLexer.g:18:13: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:19:13: ( 'double' )
			// myLexer.g:19:15: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:20:11: ( 'long' )
			// myLexer.g:20:13: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "CONST_TYPE"
	public final void mCONST_TYPE() throws RecognitionException {
		try {
			int _type = CONST_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:21:12: ( 'const' )
			// myLexer.g:21:14: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST_TYPE"

	// $ANTLR start "SIGNED"
	public final void mSIGNED() throws RecognitionException {
		try {
			int _type = SIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:22:8: ( 'signed' )
			// myLexer.g:22:10: 'signed'
			{
			match("signed"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGNED"

	// $ANTLR start "UNSIGNED"
	public final void mUNSIGNED() throws RecognitionException {
		try {
			int _type = UNSIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:23:10: ( 'unsigned' )
			// myLexer.g:23:12: 'unsigned'
			{
			match("unsigned"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNSIGNED"

	// $ANTLR start "STRUCT"
	public final void mSTRUCT() throws RecognitionException {
		try {
			int _type = STRUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:24:8: ( 'struct' )
			// myLexer.g:24:10: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUCT"

	// $ANTLR start "EEOF"
	public final void mEEOF() throws RecognitionException {
		try {
			int _type = EEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:26:6: ( 'EOF' )
			// myLexer.g:26:8: 'EOF'
			{
			match("EOF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EEOF"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:27:6: ( 'NULL' )
			// myLexer.g:27:8: 'NULL'
			{
			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:30:5: ( 'for' )
			// myLexer.g:30:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:31:10: ( 'continue' )
			// myLexer.g:31:12: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "WHILE_"
	public final void mWHILE_() throws RecognitionException {
		try {
			int _type = WHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:32:11: ( 'while' )
			// myLexer.g:32:13: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:33:11: ( 'switch' )
			// myLexer.g:33:13: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:34:11: ( 'case' )
			// myLexer.g:34:13: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:35:11: ( 'break' )
			// myLexer.g:35:13: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:36:11: ( 'default' )
			// myLexer.g:36:13: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:37:11: ( 'if' )
			// myLexer.g:37:13: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE_IF"
	public final void mELSE_IF() throws RecognitionException {
		try {
			int _type = ELSE_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:38:11: ( 'elseif' )
			// myLexer.g:38:13: 'elseif'
			{
			match("elseif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE_IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:39:11: ( 'else' )
			// myLexer.g:39:13: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "RETURNN"
	public final void mRETURNN() throws RecognitionException {
		try {
			int _type = RETURNN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:42:12: ( 'return' )
			// myLexer.g:42:14: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURNN"

	// $ANTLR start "SCANF"
	public final void mSCANF() throws RecognitionException {
		try {
			int _type = SCANF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:43:7: ( 'scanf(' ( options {greedy=false; } : . )* ')' )
			// myLexer.g:43:9: 'scanf(' ( options {greedy=false; } : . )* ')'
			{
			match("scanf("); 

			// myLexer.g:43:17: ( options {greedy=false; } : . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==')') ) {
					alt2=2;
				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '(')||(LA2_0 >= '*' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myLexer.g:43:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
			}

			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCANF"

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:44:8: ( 'printf(' ( options {greedy=false; } : . )* ')' ';' )
			// myLexer.g:44:10: 'printf(' ( options {greedy=false; } : . )* ')' ';'
			{
			match("printf("); 

			// myLexer.g:44:19: ( options {greedy=false; } : . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==')') ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1==';') ) {
						alt3=2;
					}
					else if ( ((LA3_1 >= '\u0000' && LA3_1 <= ':')||(LA3_1 >= '<' && LA3_1 <= '\uFFFF')) ) {
						alt3=1;
					}

				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '(')||(LA3_0 >= '*' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myLexer.g:44:44: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop3;
				}
			}

			match(')'); 
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "SIZEOF"
	public final void mSIZEOF() throws RecognitionException {
		try {
			int _type = SIZEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:45:7: ( 'sizeof(' ( options {greedy=false; } : . )* ')' )
			// myLexer.g:45:9: 'sizeof(' ( options {greedy=false; } : . )* ')'
			{
			match("sizeof("); 

			// myLexer.g:45:18: ( options {greedy=false; } : . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==')') ) {
					alt4=2;
				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '(')||(LA4_0 >= '*' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myLexer.g:45:43: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop4;
				}
			}

			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIZEOF"

	// $ANTLR start "MAIN_"
	public final void mMAIN_() throws RecognitionException {
		try {
			int _type = MAIN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:46:11: ( 'main(' ( options {greedy=false; } : . )* ')' )
			// myLexer.g:46:13: 'main(' ( options {greedy=false; } : . )* ')'
			{
			match("main("); 

			// myLexer.g:46:20: ( options {greedy=false; } : . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==')') ) {
					alt5=2;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '(')||(LA5_0 >= '*' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myLexer.g:46:45: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
				}
			}

			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN_"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:52:5: ( '+' )
			// myLexer.g:52:7: '+'
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
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:53:6: ( '-' )
			// myLexer.g:53:8: '-'
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
	// $ANTLR end "MINUS"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:54:4: ( '%' )
			// myLexer.g:54:6: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "POW"
	public final void mPOW() throws RecognitionException {
		try {
			int _type = POW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:55:4: ( '^' )
			// myLexer.g:55:6: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POW"

	// $ANTLR start "SINGLE_EQ"
	public final void mSINGLE_EQ() throws RecognitionException {
		try {
			int _type = SINGLE_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:56:11: ( '=' )
			// myLexer.g:56:13: '='
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
	// $ANTLR end "SINGLE_EQ"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:57:7: ( '==' )
			// myLexer.g:57:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:58:7: ( '<=' )
			// myLexer.g:58:9: '<='
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
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:59:7: ( '>=' )
			// myLexer.g:59:9: '>='
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
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:60:7: ( '!=' )
			// myLexer.g:60:9: '!='
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
	// $ANTLR end "NE_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:61:7: ( '++' )
			// myLexer.g:61:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:62:7: ( '--' )
			// myLexer.g:62:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:63:11: ( '<<' )
			// myLexer.g:63:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:64:11: ( '>>' )
			// myLexer.g:64:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:65:8: ( '(' )
			// myLexer.g:65:10: '('
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
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:66:8: ( ')' )
			// myLexer.g:66:10: ')'
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
	// $ANTLR end "RPAREN"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:67:9: ( '[' )
			// myLexer.g:67:11: '['
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
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:68:9: ( ']' )
			// myLexer.g:68:11: ']'
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
	// $ANTLR end "RSQUARE"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:69:8: ( '{' )
			// myLexer.g:69:10: '{'
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
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:70:8: ( '}' )
			// myLexer.g:70:10: '}'
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
	// $ANTLR end "RCURLY"

	// $ANTLR start "LESS"
	public final void mLESS() throws RecognitionException {
		try {
			int _type = LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:71:6: ( '<' )
			// myLexer.g:71:8: '<'
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
	// $ANTLR end "LESS"

	// $ANTLR start "MOREE"
	public final void mMOREE() throws RecognitionException {
		try {
			int _type = MOREE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:72:7: ( '>' )
			// myLexer.g:72:9: '>'
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
	// $ANTLR end "MOREE"

	// $ANTLR start "SQUOTATION"
	public final void mSQUOTATION() throws RecognitionException {
		try {
			int _type = SQUOTATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:73:12: ( '\\'' )
			// myLexer.g:73:14: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQUOTATION"

	// $ANTLR start "DQUOTATION"
	public final void mDQUOTATION() throws RecognitionException {
		try {
			int _type = DQUOTATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:74:12: ( '\"' )
			// myLexer.g:74:14: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DQUOTATION"

	// $ANTLR start "HASHTAG"
	public final void mHASHTAG() throws RecognitionException {
		try {
			int _type = HASHTAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:75:9: ( '#' )
			// myLexer.g:75:11: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASHTAG"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:76:7: ( '/' )
			// myLexer.g:76:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASH"

	// $ANTLR start "ANTI_SLASH"
	public final void mANTI_SLASH() throws RecognitionException {
		try {
			int _type = ANTI_SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:77:12: ( '\\\\' )
			// myLexer.g:77:14: '\\\\'
			{
			match('\\'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANTI_SLASH"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:78:5: ( '&&' | '&' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='&') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='&') ) {
					alt6=1;
				}

				else {
					alt6=2;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// myLexer.g:78:7: '&&'
					{
					match("&&"); 

					}
					break;
				case 2 :
					// myLexer.g:78:14: '&'
					{
					match('&'); 
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
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:79:4: ( '||' | '|' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='|') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='|') ) {
					alt7=1;
				}

				else {
					alt7=2;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// myLexer.g:79:6: '||'
					{
					match("||"); 

					}
					break;
				case 2 :
					// myLexer.g:79:13: '|'
					{
					match('|'); 
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
	// $ANTLR end "OR"

	// $ANTLR start "ASTERISK"
	public final void mASTERISK() throws RecognitionException {
		try {
			int _type = ASTERISK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:80:10: ( '*' )
			// myLexer.g:80:12: '*'
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
	// $ANTLR end "ASTERISK"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:81:7: ( '~' )
			// myLexer.g:81:8: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:82:8: ( '$' )
			// myLexer.g:82:10: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:83:10: ( ';' )
			// myLexer.g:83:12: ';'
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
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:84:6: ( ':' )
			// myLexer.g:84:8: ':'
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
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:85:6: ( ',' )
			// myLexer.g:85:8: ','
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
	// $ANTLR end "COMMA"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:88:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// myLexer.g:88:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// myLexer.g:88:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='0') ) {
				alt9=1;
			}
			else if ( ((LA9_0 >= '1' && LA9_0 <= '9')) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// myLexer.g:88:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// myLexer.g:88:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// myLexer.g:88:28: ( DIGIT )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// myLexer.g:
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
							break loop8;
						}
					}

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
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:90:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// myLexer.g:90:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myLexer.g:90:14: ( LETTER | DIGIT )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myLexer.g:
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
					break loop10;
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
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:92:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// myLexer.g:92:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// myLexer.g:92:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// myLexer.g:92:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

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
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// myLexer.g:93:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// myLexer.g:93:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// myLexer.g:93:22: ( DIGIT )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// myLexer.g:
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
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match('.'); 
			// myLexer.g:93:33: ( DIGIT )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// myLexer.g:
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
					break loop13;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// myLexer.g:94:20: ( '.' ( DIGIT )+ )
			// myLexer.g:94:22: '.' ( DIGIT )+
			{
			match('.'); 
			// myLexer.g:94:25: ( DIGIT )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// myLexer.g:
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
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// myLexer.g:95:20: ( ( DIGIT )+ )
			// myLexer.g:95:22: ( DIGIT )+
			{
			// myLexer.g:95:22: ( DIGIT )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// myLexer.g:
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
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:97:8: ( '\"' ( options {greedy=false; } : . )* '\"' )
			// myLexer.g:97:10: '\"' ( options {greedy=false; } : . )* '\"'
			{
			match('\"'); 
			// myLexer.g:97:13: ( options {greedy=false; } : . )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\"') ) {
					alt16=2;
				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '\uFFFF')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// myLexer.g:97:38: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop16;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:100:10: ( '//' ( . )* '\\n' )
			// myLexer.g:100:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// myLexer.g:100:16: ( . )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='\n') ) {
					alt17=2;
				}
				else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\uFFFF')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// myLexer.g:100:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop17;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:101:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// myLexer.g:101:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// myLexer.g:101:17: ( options {greedy=false; } : . )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0=='*') ) {
					int LA18_1 = input.LA(2);
					if ( (LA18_1=='/') ) {
						alt18=2;
					}
					else if ( ((LA18_1 >= '\u0000' && LA18_1 <= '.')||(LA18_1 >= '0' && LA18_1 <= '\uFFFF')) ) {
						alt18=1;
					}

				}
				else if ( ((LA18_0 >= '\u0000' && LA18_0 <= ')')||(LA18_0 >= '+' && LA18_0 <= '\uFFFF')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// myLexer.g:101:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop18;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:103:9: ( '\\n' )
			// myLexer.g:103:11: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// myLexer.g:105:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// myLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// myLexer.g:106:16: ( '0' .. '9' )
			// myLexer.g:
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

	// $ANTLR start "SPECIAL"
	public final void mSPECIAL() throws RecognitionException {
		try {
			// myLexer.g:107:18: ( '!' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
			// myLexer.g:
			{
			if ( (input.LA(1) >= '!' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= '@')||(input.LA(1) >= '[' && input.LA(1) <= '`')||(input.LA(1) >= '{' && input.LA(1) <= '~') ) {
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
	// $ANTLR end "SPECIAL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:109:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// myLexer.g:109:7: ( ' ' | '\\r' | '\\t' )+
			{
			// myLexer.g:109:7: ( ' ' | '\\r' | '\\t' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0=='\t'||LA19_0=='\r'||LA19_0==' ') ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// myLexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// myLexer.g:1:8: ( DEFINE | INCLUDE | HEADER | INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONG_TYPE | CONST_TYPE | SIGNED | UNSIGNED | STRUCT | EEOF | NULL | FOR | CONTINUE | WHILE_ | SWITCH | CASE | BREAK | DEFAULT | IF | ELSE_IF | ELSE | RETURNN | SCANF | PRINTF | SIZEOF | MAIN_ | PLUS | MINUS | MOD | POW | SINGLE_EQ | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | LESS | MOREE | SQUOTATION | DQUOTATION | HASHTAG | SLASH | ANTI_SLASH | AND | OR | ASTERISK | TILDE | DOLLAR | SEMICOLON | COLON | COMMA | DEC_NUM | ID | FLOAT_NUM | STRING | COMMENT1 | COMMENT2 | NEW_LINE | WS )
		int alt20=72;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// myLexer.g:1:10: DEFINE
				{
				mDEFINE(); 

				}
				break;
			case 2 :
				// myLexer.g:1:17: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 3 :
				// myLexer.g:1:25: HEADER
				{
				mHEADER(); 

				}
				break;
			case 4 :
				// myLexer.g:1:32: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 5 :
				// myLexer.g:1:41: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 6 :
				// myLexer.g:1:51: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 7 :
				// myLexer.g:1:61: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 8 :
				// myLexer.g:1:72: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 9 :
				// myLexer.g:1:84: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 10 :
				// myLexer.g:1:94: CONST_TYPE
				{
				mCONST_TYPE(); 

				}
				break;
			case 11 :
				// myLexer.g:1:105: SIGNED
				{
				mSIGNED(); 

				}
				break;
			case 12 :
				// myLexer.g:1:112: UNSIGNED
				{
				mUNSIGNED(); 

				}
				break;
			case 13 :
				// myLexer.g:1:121: STRUCT
				{
				mSTRUCT(); 

				}
				break;
			case 14 :
				// myLexer.g:1:128: EEOF
				{
				mEEOF(); 

				}
				break;
			case 15 :
				// myLexer.g:1:133: NULL
				{
				mNULL(); 

				}
				break;
			case 16 :
				// myLexer.g:1:138: FOR
				{
				mFOR(); 

				}
				break;
			case 17 :
				// myLexer.g:1:142: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 18 :
				// myLexer.g:1:151: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 19 :
				// myLexer.g:1:158: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 20 :
				// myLexer.g:1:165: CASE
				{
				mCASE(); 

				}
				break;
			case 21 :
				// myLexer.g:1:170: BREAK
				{
				mBREAK(); 

				}
				break;
			case 22 :
				// myLexer.g:1:176: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 23 :
				// myLexer.g:1:184: IF
				{
				mIF(); 

				}
				break;
			case 24 :
				// myLexer.g:1:187: ELSE_IF
				{
				mELSE_IF(); 

				}
				break;
			case 25 :
				// myLexer.g:1:195: ELSE
				{
				mELSE(); 

				}
				break;
			case 26 :
				// myLexer.g:1:200: RETURNN
				{
				mRETURNN(); 

				}
				break;
			case 27 :
				// myLexer.g:1:208: SCANF
				{
				mSCANF(); 

				}
				break;
			case 28 :
				// myLexer.g:1:214: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 29 :
				// myLexer.g:1:221: SIZEOF
				{
				mSIZEOF(); 

				}
				break;
			case 30 :
				// myLexer.g:1:228: MAIN_
				{
				mMAIN_(); 

				}
				break;
			case 31 :
				// myLexer.g:1:234: PLUS
				{
				mPLUS(); 

				}
				break;
			case 32 :
				// myLexer.g:1:239: MINUS
				{
				mMINUS(); 

				}
				break;
			case 33 :
				// myLexer.g:1:245: MOD
				{
				mMOD(); 

				}
				break;
			case 34 :
				// myLexer.g:1:249: POW
				{
				mPOW(); 

				}
				break;
			case 35 :
				// myLexer.g:1:253: SINGLE_EQ
				{
				mSINGLE_EQ(); 

				}
				break;
			case 36 :
				// myLexer.g:1:263: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 37 :
				// myLexer.g:1:269: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 38 :
				// myLexer.g:1:275: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 39 :
				// myLexer.g:1:281: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 40 :
				// myLexer.g:1:287: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 41 :
				// myLexer.g:1:293: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 42 :
				// myLexer.g:1:299: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 43 :
				// myLexer.g:1:309: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 44 :
				// myLexer.g:1:319: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 45 :
				// myLexer.g:1:326: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 46 :
				// myLexer.g:1:333: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 47 :
				// myLexer.g:1:341: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 48 :
				// myLexer.g:1:349: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 49 :
				// myLexer.g:1:356: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 50 :
				// myLexer.g:1:363: LESS
				{
				mLESS(); 

				}
				break;
			case 51 :
				// myLexer.g:1:368: MOREE
				{
				mMOREE(); 

				}
				break;
			case 52 :
				// myLexer.g:1:374: SQUOTATION
				{
				mSQUOTATION(); 

				}
				break;
			case 53 :
				// myLexer.g:1:385: DQUOTATION
				{
				mDQUOTATION(); 

				}
				break;
			case 54 :
				// myLexer.g:1:396: HASHTAG
				{
				mHASHTAG(); 

				}
				break;
			case 55 :
				// myLexer.g:1:404: SLASH
				{
				mSLASH(); 

				}
				break;
			case 56 :
				// myLexer.g:1:410: ANTI_SLASH
				{
				mANTI_SLASH(); 

				}
				break;
			case 57 :
				// myLexer.g:1:421: AND
				{
				mAND(); 

				}
				break;
			case 58 :
				// myLexer.g:1:425: OR
				{
				mOR(); 

				}
				break;
			case 59 :
				// myLexer.g:1:428: ASTERISK
				{
				mASTERISK(); 

				}
				break;
			case 60 :
				// myLexer.g:1:437: TILDE
				{
				mTILDE(); 

				}
				break;
			case 61 :
				// myLexer.g:1:443: DOLLAR
				{
				mDOLLAR(); 

				}
				break;
			case 62 :
				// myLexer.g:1:450: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 63 :
				// myLexer.g:1:460: COLON
				{
				mCOLON(); 

				}
				break;
			case 64 :
				// myLexer.g:1:466: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 65 :
				// myLexer.g:1:472: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 66 :
				// myLexer.g:1:480: ID
				{
				mID(); 

				}
				break;
			case 67 :
				// myLexer.g:1:483: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 68 :
				// myLexer.g:1:493: STRING
				{
				mSTRING(); 

				}
				break;
			case 69 :
				// myLexer.g:1:500: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 70 :
				// myLexer.g:1:509: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 71 :
				// myLexer.g:1:518: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 72 :
				// myLexer.g:1:527: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA20 dfa20 = new DFA20(this);
	static final String DFA11_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA11_eofS =
		"\5\uffff";
	static final String DFA11_minS =
		"\2\56\3\uffff";
	static final String DFA11_maxS =
		"\2\71\3\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA11_specialS =
		"\5\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "92:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA20_eotS =
		"\1\uffff\1\64\1\71\1\uffff\20\71\1\122\1\124\2\uffff\1\126\1\131\1\134"+
		"\10\uffff\1\135\1\141\11\uffff\2\142\5\uffff\1\71\1\145\1\uffff\1\71\2"+
		"\uffff\26\71\22\uffff\1\142\1\175\1\uffff\5\71\1\u0084\11\71\1\u008e\7"+
		"\71\1\uffff\1\u0096\2\71\1\u0099\1\u009a\1\71\1\uffff\2\71\1\u009e\6\71"+
		"\1\uffff\1\u00a5\2\71\1\u00a9\3\71\1\uffff\1\u00ad\1\71\2\uffff\1\u00af"+
		"\2\71\1\uffff\6\71\1\uffff\1\u00b8\1\u00b9\1\71\1\uffff\2\71\2\uffff\1"+
		"\71\1\uffff\1\u00be\1\71\1\u00c0\1\71\1\u00c2\1\u00c3\1\uffff\1\71\2\uffff"+
		"\1\u00c5\1\u00c6\2\71\1\uffff\1\u00c9\4\uffff\1\71\3\uffff\1\u00cb\1\uffff"+
		"\1\u00cc\2\uffff";
	static final String DFA20_eofS =
		"\u00cd\uffff";
	static final String DFA20_minS =
		"\1\11\1\144\1\56\1\60\20\56\1\53\1\55\2\uffff\1\75\1\74\1\75\10\uffff"+
		"\1\0\1\52\11\uffff\2\56\5\uffff\2\56\1\uffff\1\56\2\uffff\26\56\22\uffff"+
		"\2\56\1\uffff\27\56\1\uffff\6\56\1\uffff\11\56\1\uffff\6\56\1\50\1\uffff"+
		"\2\56\2\uffff\3\56\1\uffff\4\56\1\50\1\56\1\uffff\3\56\1\uffff\2\56\2"+
		"\uffff\1\56\1\uffff\3\56\1\50\2\56\1\uffff\1\56\2\uffff\2\56\1\50\1\56"+
		"\1\uffff\1\56\4\uffff\1\56\3\uffff\1\56\1\uffff\1\56\2\uffff";
	static final String DFA20_maxS =
		"\1\176\1\151\1\172\1\150\20\172\1\53\1\55\2\uffff\2\75\1\76\10\uffff\1"+
		"\uffff\1\57\11\uffff\2\71\5\uffff\2\172\1\uffff\1\172\2\uffff\26\172\22"+
		"\uffff\1\71\1\172\1\uffff\27\172\1\uffff\6\172\1\uffff\11\172\1\uffff"+
		"\7\172\1\uffff\2\172\2\uffff\3\172\1\uffff\6\172\1\uffff\3\172\1\uffff"+
		"\2\172\2\uffff\1\172\1\uffff\6\172\1\uffff\1\172\2\uffff\4\172\1\uffff"+
		"\1\172\4\uffff\1\172\3\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA20_acceptS =
		"\26\uffff\1\41\1\42\3\uffff\1\47\1\54\1\55\1\56\1\57\1\60\1\61\1\64\2"+
		"\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\2\uffff\1\107\1\110"+
		"\1\1\1\2\1\66\2\uffff\1\3\1\uffff\1\102\1\103\26\uffff\1\50\1\37\1\51"+
		"\1\40\1\44\1\43\1\45\1\52\1\62\1\46\1\53\1\63\1\65\1\104\1\105\1\106\1"+
		"\67\1\101\2\uffff\1\27\27\uffff\1\4\6\uffff\1\20\11\uffff\1\16\7\uffff"+
		"\1\5\2\uffff\1\24\1\6\3\uffff\1\11\6\uffff\1\17\3\uffff\1\31\2\uffff\1"+
		"\36\1\12\1\uffff\1\7\6\uffff\1\33\1\uffff\1\22\1\25\4\uffff\1\10\1\uffff"+
		"\1\13\1\35\1\15\1\23\1\uffff\1\30\1\32\1\34\1\uffff\1\26\1\uffff\1\21"+
		"\1\14";
	static final String DFA20_specialS =
		"\43\uffff\1\0\u00a9\uffff}>";
	static final String[] DFA20_transitionS = {
			"\1\61\1\60\2\uffff\1\61\22\uffff\1\61\1\33\1\43\1\1\1\52\1\26\1\46\1"+
			"\42\1\34\1\35\1\50\1\24\1\55\1\25\1\3\1\44\1\56\11\57\1\54\1\53\1\31"+
			"\1\30\1\32\2\uffff\4\23\1\13\10\23\1\14\14\23\1\36\1\45\1\37\1\27\1\23"+
			"\1\uffff\1\23\1\16\1\4\1\7\1\17\1\6\2\23\1\2\2\23\1\10\1\22\2\23\1\21"+
			"\1\23\1\20\1\11\1\23\1\12\1\5\1\15\3\23\1\40\1\47\1\41\1\51",
			"\1\62\4\uffff\1\63",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\66\7\70\1\65\14\70",
			"\12\72\56\uffff\1\67",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\1\75\6\70\1\73\6\70\1\74\13"+
			"\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\76\13\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\77\2\70\1\100\13\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\102\11\70\1\101\13"+
			"\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\103\13\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\107\5\70\1\104\12\70"+
			"\1\105\2\70\1\106\3\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\110\14\70",
			"\1\67\22\uffff\16\70\1\111\13\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\24\70\1\112\5\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\7\70\1\113\22\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\114\10\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\115\16\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\116\25\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\117\10\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\1\120\31\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\121",
			"\1\123",
			"",
			"",
			"\1\125",
			"\1\130\1\127",
			"\1\132\1\133",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\0\136",
			"\1\140\4\uffff\1\137",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\72\1\uffff\12\72",
			"\1\72\1\uffff\12\143",
			"",
			"",
			"",
			"",
			"",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\144\6\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\1\146\31\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\147\14\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\150\7\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\151\21\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\152\13\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\153\10\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\154\5\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\155\24\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\156\14\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\157\22\70\1\160",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\161\10\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\162\21\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\1\163\31\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\164\7\70",
			"\1\67\22\uffff\5\70\1\165\24\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\13\70\1\166\16\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\167\21\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\170\25\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\171\7\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\172\6\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\173\21\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\174\21\70",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\72\1\uffff\12\143",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\176\10\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\177\1\u0080\6\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0081\25\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u0082\26\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\1\u0083\31\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\1\70\1\u0085\30\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\1\u0086\31\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u0087\23\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u0088\14\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0089\25\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u008a\5\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u008b\6\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u008c\14\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u008d\21\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\13\70\1\u008f\16\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u0090\16\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\1\u0091\31\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0092\25\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u0093\5\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u0094\14\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u0095\14\70",
			"",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u0097\6\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u0098\21\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u009b\6\70",
			"",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u009c\16\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u009d\5\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u009f\25\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u00a0\13\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00a1\27\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00a2\27\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\u00a3\24\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u00a4\23\70",
			"",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00a6\25\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\12\70\1\u00a7\17\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u00a8"+
			"\21\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00aa\10\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00ab\6\70",
			"\1\u00ac\5\uffff\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u00ae\14\70",
			"",
			"",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00b0\25\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00b1\16\70",
			"",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u00b2\26\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\u00b3\24\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00b4\6\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\7\70\1\u00b5\22\70",
			"\1\u00b6\5\uffff\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u00b7\14\70",
			"",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\u00ba\24\70",
			"",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u00bb\14\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\u00bc\24\70",
			"",
			"",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00bd\5\70",
			"",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00bf\6\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u00c1\5\uffff\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00c4\25\70",
			"",
			"",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u00c7\5\uffff\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00c8\25\70",
			"",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"",
			"",
			"",
			"\1\67\22\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u00ca\26\70",
			"",
			"",
			"",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\67\1\uffff\12\71\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( DEFINE | INCLUDE | HEADER | INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONG_TYPE | CONST_TYPE | SIGNED | UNSIGNED | STRUCT | EEOF | NULL | FOR | CONTINUE | WHILE_ | SWITCH | CASE | BREAK | DEFAULT | IF | ELSE_IF | ELSE | RETURNN | SCANF | PRINTF | SIZEOF | MAIN_ | PLUS | MINUS | MOD | POW | SINGLE_EQ | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | LESS | MOREE | SQUOTATION | DQUOTATION | HASHTAG | SLASH | ANTI_SLASH | AND | OR | ASTERISK | TILDE | DOLLAR | SEMICOLON | COLON | COMMA | DEC_NUM | ID | FLOAT_NUM | STRING | COMMENT1 | COMMENT2 | NEW_LINE | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA20_35 = input.LA(1);
						s = -1;
						if ( ((LA20_35 >= '\u0000' && LA20_35 <= '\uFFFF')) ) {s = 94;}
						else s = 93;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 20, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
