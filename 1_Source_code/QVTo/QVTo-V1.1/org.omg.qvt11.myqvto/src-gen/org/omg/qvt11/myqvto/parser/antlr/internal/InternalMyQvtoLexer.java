package org.omg.qvt11.myqvto.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyQvtoLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_MULTIPLICITYRANGE=6;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyQvtoLexer() {;} 
    public InternalMyQvtoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyQvtoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyQvto.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:11:7: ( 'from' )
            // InternalMyQvto.g:11:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:12:7: ( 'import' )
            // InternalMyQvto.g:12:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:13:7: ( ',' )
            // InternalMyQvto.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:14:7: ( '*' )
            // InternalMyQvto.g:14:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:15:7: ( ';' )
            // InternalMyQvto.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:16:7: ( 'modeltype' )
            // InternalMyQvto.g:16:9: 'modeltype'
            {
            match("modeltype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:17:7: ( 'uses' )
            // InternalMyQvto.g:17:9: 'uses'
            {
            match("uses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:18:7: ( 'where' )
            // InternalMyQvto.g:18:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:19:7: ( 'intermediate' )
            // InternalMyQvto.g:19:9: 'intermediate'
            {
            match("intermediate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:20:7: ( '=' )
            // InternalMyQvto.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:21:7: ( '{' )
            // InternalMyQvto.g:21:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:22:7: ( '}' )
            // InternalMyQvto.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:23:7: ( 'tag' )
            // InternalMyQvto.g:23:9: 'tag'
            {
            match("tag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:24:7: ( 'typedef' )
            // InternalMyQvto.g:24:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:25:7: ( '[' )
            // InternalMyQvto.g:25:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:26:7: ( ']' )
            // InternalMyQvto.g:26:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:27:7: ( 'main' )
            // InternalMyQvto.g:27:9: 'main'
            {
            match("main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:28:7: ( 'init' )
            // InternalMyQvto.g:28:9: 'init'
            {
            match("init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:29:7: ( 'end' )
            // InternalMyQvto.g:29:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:30:7: ( 'population' )
            // InternalMyQvto.g:30:9: 'population'
            {
            match("population"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:31:7: ( ':' )
            // InternalMyQvto.g:31:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:32:7: ( '@' )
            // InternalMyQvto.g:32:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:33:7: ( ':=' )
            // InternalMyQvto.g:33:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:34:7: ( '::=' )
            // InternalMyQvto.g:34:9: '::='
            {
            match("::="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:35:7: ( '::' )
            // InternalMyQvto.g:35:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:36:7: ( '(' )
            // InternalMyQvto.g:36:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:37:7: ( ')' )
            // InternalMyQvto.g:37:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:38:7: ( 'Dict' )
            // InternalMyQvto.g:38:9: 'Dict'
            {
            match("Dict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:39:7: ( 'Tuple' )
            // InternalMyQvto.g:39:9: 'Tuple'
            {
            match("Tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:40:7: ( 'constructor' )
            // InternalMyQvto.g:40:9: 'constructor'
            {
            match("constructor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:41:7: ( 'library' )
            // InternalMyQvto.g:41:9: 'library'
            {
            match("library"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:42:7: ( 'access' )
            // InternalMyQvto.g:42:9: 'access'
            {
            match("access"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:43:7: ( 'extends' )
            // InternalMyQvto.g:43:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:44:7: ( 'when' )
            // InternalMyQvto.g:44:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:45:7: ( 'mapping' )
            // InternalMyQvto.g:45:9: 'mapping'
            {
            match("mapping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:46:7: ( 'refines' )
            // InternalMyQvto.g:46:9: 'refines'
            {
            match("refines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:47:7: ( 'transformation' )
            // InternalMyQvto.g:47:9: 'transformation'
            {
            match("transformation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:48:7: ( 'metamodel' )
            // InternalMyQvto.g:48:9: 'metamodel'
            {
            match("metamodel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:49:7: ( 'package' )
            // InternalMyQvto.g:49:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:50:7: ( 'enum' )
            // InternalMyQvto.g:50:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:51:7: ( 'datatype' )
            // InternalMyQvto.g:51:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:52:7: ( 'primitive' )
            // InternalMyQvto.g:52:9: 'primitive'
            {
            match("primitive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:53:7: ( 'exception' )
            // InternalMyQvto.g:53:9: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:54:7: ( 'class' )
            // InternalMyQvto.g:54:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:55:7: ( 'opposites' )
            // InternalMyQvto.g:55:9: 'opposites'
            {
            match("opposites"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:56:7: ( '~' )
            // InternalMyQvto.g:56:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:57:7: ( '<<' )
            // InternalMyQvto.g:57:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:58:7: ( '>>' )
            // InternalMyQvto.g:58:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:59:7: ( '.' )
            // InternalMyQvto.g:59:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:60:7: ( 'in' )
            // InternalMyQvto.g:60:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:61:7: ( 'inout' )
            // InternalMyQvto.g:61:9: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:62:7: ( 'out' )
            // InternalMyQvto.g:62:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:63:7: ( 'Collection' )
            // InternalMyQvto.g:63:9: 'Collection'
            {
            match("Collection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:64:7: ( 'Set' )
            // InternalMyQvto.g:64:9: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:65:7: ( 'OrderedSet' )
            // InternalMyQvto.g:65:9: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:66:7: ( 'Sequence' )
            // InternalMyQvto.g:66:9: 'Sequence'
            {
            match("Sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:67:7: ( 'Bag' )
            // InternalMyQvto.g:67:9: 'Bag'
            {
            match("Bag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:68:7: ( 'List' )
            // InternalMyQvto.g:68:9: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:69:7: ( 'blackbox' )
            // InternalMyQvto.g:69:9: 'blackbox'
            {
            match("blackbox"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:70:7: ( 'abstract' )
            // InternalMyQvto.g:70:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:71:7: ( 'static' )
            // InternalMyQvto.g:71:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:72:7: ( 'derived' )
            // InternalMyQvto.g:72:9: 'derived'
            {
            match("derived"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:73:7: ( 'literal' )
            // InternalMyQvto.g:73:9: 'literal'
            {
            match("literal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:74:7: ( 'configuration' )
            // InternalMyQvto.g:74:9: 'configuration'
            {
            match("configuration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:75:7: ( 'property' )
            // InternalMyQvto.g:75:9: 'property'
            {
            match("property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:76:7: ( 'helper' )
            // InternalMyQvto.g:76:9: 'helper'
            {
            match("helper"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:77:7: ( 'query' )
            // InternalMyQvto.g:77:9: 'query'
            {
            match("query"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:78:7: ( 'inherits' )
            // InternalMyQvto.g:78:9: 'inherits'
            {
            match("inherits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:79:7: ( 'merges' )
            // InternalMyQvto.g:79:9: 'merges'
            {
            match("merges"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:80:7: ( 'disjuncts' )
            // InternalMyQvto.g:80:9: 'disjuncts'
            {
            match("disjuncts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:81:7: ( 'composes' )
            // InternalMyQvto.g:81:9: 'composes'
            {
            match("composes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:82:7: ( 'references' )
            // InternalMyQvto.g:82:9: 'references'
            {
            match("references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:83:7: ( 'readonly' )
            // InternalMyQvto.g:83:9: 'readonly'
            {
            match("readonly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "RULE_MULTIPLICITYRANGE"
    public final void mRULE_MULTIPLICITYRANGE() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLICITYRANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:5901:24: ( ( RULE_INT | '*' | RULE_INT '...' RULE_INT | RULE_INT '...' '*' ) )
            // InternalMyQvto.g:5901:26: ( RULE_INT | '*' | RULE_INT '...' RULE_INT | RULE_INT '...' '*' )
            {
            // InternalMyQvto.g:5901:26: ( RULE_INT | '*' | RULE_INT '...' RULE_INT | RULE_INT '...' '*' )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMyQvto.g:5901:27: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5901:36: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:5901:40: RULE_INT '...' RULE_INT
                    {
                    mRULE_INT(); 
                    match("..."); 

                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:5901:64: RULE_INT '...' '*'
                    {
                    mRULE_INT(); 
                    match("..."); 

                    match('*'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLICITYRANGE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:5903:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyQvto.g:5903:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyQvto.g:5903:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyQvto.g:5903:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyQvto.g:5903:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyQvto.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalMyQvto.g:5905:19: ( ( '0' .. '9' )+ )
            // InternalMyQvto.g:5905:21: ( '0' .. '9' )+
            {
            // InternalMyQvto.g:5905:21: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyQvto.g:5905:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:5907:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyQvto.g:5907:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyQvto.g:5907:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyQvto.g:5907:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyQvto.g:5907:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyQvto.g:5907:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyQvto.g:5907:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5907:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyQvto.g:5907:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyQvto.g:5907:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyQvto.g:5907:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:5909:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyQvto.g:5909:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyQvto.g:5909:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyQvto.g:5909:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:5911:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyQvto.g:5911:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyQvto.g:5911:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyQvto.g:5911:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMyQvto.g:5911:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyQvto.g:5911:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyQvto.g:5911:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyQvto.g:5911:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:5913:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyQvto.g:5913:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyQvto.g:5913:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyQvto.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyQvto.g:5915:16: ( . )
            // InternalMyQvto.g:5915:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyQvto.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | RULE_MULTIPLICITYRANGE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=80;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMyQvto.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalMyQvto.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalMyQvto.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalMyQvto.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalMyQvto.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalMyQvto.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalMyQvto.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalMyQvto.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalMyQvto.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalMyQvto.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalMyQvto.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalMyQvto.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalMyQvto.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalMyQvto.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalMyQvto.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalMyQvto.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalMyQvto.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalMyQvto.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalMyQvto.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalMyQvto.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalMyQvto.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalMyQvto.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalMyQvto.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalMyQvto.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalMyQvto.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalMyQvto.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalMyQvto.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalMyQvto.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalMyQvto.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalMyQvto.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalMyQvto.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalMyQvto.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalMyQvto.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalMyQvto.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalMyQvto.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalMyQvto.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalMyQvto.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalMyQvto.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalMyQvto.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalMyQvto.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalMyQvto.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalMyQvto.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalMyQvto.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalMyQvto.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalMyQvto.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalMyQvto.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalMyQvto.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalMyQvto.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalMyQvto.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalMyQvto.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalMyQvto.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalMyQvto.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalMyQvto.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalMyQvto.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalMyQvto.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalMyQvto.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalMyQvto.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // InternalMyQvto.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // InternalMyQvto.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // InternalMyQvto.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // InternalMyQvto.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // InternalMyQvto.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // InternalMyQvto.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // InternalMyQvto.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // InternalMyQvto.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // InternalMyQvto.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // InternalMyQvto.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // InternalMyQvto.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // InternalMyQvto.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // InternalMyQvto.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // InternalMyQvto.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // InternalMyQvto.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // InternalMyQvto.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // InternalMyQvto.g:1:448: RULE_MULTIPLICITYRANGE
                {
                mRULE_MULTIPLICITYRANGE(); 

                }
                break;
            case 75 :
                // InternalMyQvto.g:1:471: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 76 :
                // InternalMyQvto.g:1:479: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 77 :
                // InternalMyQvto.g:1:491: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 78 :
                // InternalMyQvto.g:1:507: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 79 :
                // InternalMyQvto.g:1:523: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 80 :
                // InternalMyQvto.g:1:531: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA1_eotS =
        "\1\uffff\1\3\7\uffff";
    static final String DFA1_eofS =
        "\11\uffff";
    static final String DFA1_minS =
        "\1\52\1\56\2\uffff\2\56\1\52\2\uffff";
    static final String DFA1_maxS =
        "\2\71\2\uffff\2\56\1\71\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\1\3\uffff\1\4\1\3";
    static final String DFA1_specialS =
        "\11\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\5\uffff\12\1",
            "\1\4\1\uffff\12\1",
            "",
            "",
            "\1\5",
            "\1\6",
            "\1\7\5\uffff\12\10",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "5901:26: ( RULE_INT | '*' | RULE_INT '...' RULE_INT | RULE_INT '...' '*' )";
        }
    }
    static final String DFA13_eotS =
        "\1\uffff\2\63\3\uffff\3\63\3\uffff\1\63\2\uffff\2\63\1\115\3\uffff\10\63\1\uffff\2\61\1\uffff\11\63\1\uffff\1\61\1\uffff\3\61\2\uffff\1\63\1\uffff\1\63\1\166\3\uffff\5\63\3\uffff\3\63\2\uffff\5\63\1\uffff\1\u008a\4\uffff\15\63\4\uffff\11\63\5\uffff\6\63\1\uffff\7\63\1\u00b3\2\63\1\u00b6\7\63\2\uffff\17\63\1\u00cf\1\63\1\u00d1\2\63\1\u00d4\5\63\1\u00da\2\63\1\u00dd\3\63\1\u00e1\3\63\1\u00e5\1\63\1\u00e7\1\uffff\2\63\1\uffff\1\u00ea\6\63\1\u00f1\20\63\1\uffff\1\63\1\uffff\2\63\1\uffff\1\u0105\4\63\1\uffff\2\63\1\uffff\1\u010c\2\63\1\uffff\3\63\1\uffff\1\u0112\1\uffff\2\63\1\uffff\6\63\1\uffff\1\u011b\3\63\1\u011f\16\63\1\uffff\3\63\1\u0131\1\u0132\1\63\1\uffff\4\63\1\u0138\1\uffff\10\63\1\uffff\3\63\1\uffff\2\63\1\u0146\14\63\1\u0153\1\u0154\2\uffff\3\63\1\u0158\1\63\1\uffff\1\u015a\1\63\1\u015c\2\63\1\u015f\5\63\1\u0165\1\u0166\1\uffff\1\63\1\u0168\3\63\1\u016c\6\63\2\uffff\1\63\1\u0174\1\63\1\uffff\1\63\1\uffff\1\63\1\uffff\2\63\1\uffff\1\63\1\u017b\2\63\1\u017e\2\uffff\1\u017f\1\uffff\1\63\1\u0181\1\u0182\1\uffff\3\63\1\u0186\1\63\1\u0188\1\63\1\uffff\1\u018a\1\u018b\1\63\1\u018d\1\63\1\u018f\1\uffff\2\63\2\uffff\1\63\2\uffff\1\u0193\1\u0194\1\63\1\uffff\1\63\1\uffff\1\63\2\uffff\1\63\1\uffff\1\u0199\1\uffff\2\63\1\u019c\2\uffff\1\u019d\1\u019e\2\63\1\uffff\1\u01a1\1\63\3\uffff\1\u01a3\1\63\1\uffff\1\63\1\uffff\1\63\1\u01a7\1\u01a8\2\uffff";
    static final String DFA13_eofS =
        "\u01a9\uffff";
    static final String DFA13_minS =
        "\1\0\1\162\1\155\3\uffff\1\141\1\163\1\150\3\uffff\1\141\2\uffff\1\156\1\141\1\72\3\uffff\1\151\1\165\1\154\1\151\1\142\1\145\1\141\1\160\1\uffff\1\74\1\76\1\uffff\1\157\1\145\1\162\1\141\1\151\1\154\1\164\1\145\1\165\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\157\1\uffff\1\160\1\60\3\uffff\1\144\1\151\1\162\2\145\3\uffff\1\147\1\160\1\141\2\uffff\1\144\1\143\1\160\1\143\1\151\1\uffff\1\75\4\uffff\1\143\1\160\1\155\1\141\1\142\1\143\1\163\1\141\1\164\1\162\1\163\1\160\1\164\4\uffff\1\154\1\161\1\144\1\147\1\163\2\141\1\154\1\145\5\uffff\1\155\1\157\1\145\1\164\1\165\1\145\1\uffff\1\145\1\156\1\160\1\141\1\147\1\163\1\156\1\60\1\145\1\156\1\60\1\155\2\145\1\165\1\153\1\155\1\160\2\uffff\1\164\1\154\1\146\1\160\1\163\1\162\2\145\1\164\1\145\1\144\1\141\1\151\1\152\1\157\1\60\1\154\1\60\1\165\1\145\1\60\1\164\1\143\1\164\1\160\1\162\1\60\2\162\1\60\1\164\1\162\1\154\1\60\1\151\1\155\1\145\1\60\1\145\1\60\1\uffff\1\144\1\163\1\uffff\1\60\1\156\1\160\1\154\1\141\1\151\1\145\1\60\1\145\1\164\1\151\1\157\1\163\1\141\1\162\1\163\1\162\1\156\1\162\1\157\1\164\1\166\1\165\1\163\1\uffff\1\145\1\uffff\1\145\1\162\1\uffff\1\60\1\153\1\151\1\145\1\171\1\uffff\1\164\1\155\1\uffff\1\60\1\151\1\164\1\uffff\1\156\1\157\1\163\1\uffff\1\60\1\uffff\1\145\1\146\1\uffff\1\144\1\164\1\141\1\147\1\164\1\162\1\uffff\1\60\1\162\1\147\1\163\1\60\1\162\1\141\1\163\1\141\2\145\1\156\1\171\1\145\1\156\1\151\1\143\1\156\1\145\1\uffff\1\142\1\143\1\162\2\60\1\145\1\uffff\1\164\1\171\1\147\1\144\1\60\1\uffff\1\146\1\157\1\163\1\151\1\164\1\145\1\151\1\164\1\uffff\2\165\1\145\1\uffff\1\171\1\154\1\60\1\143\1\163\1\156\1\154\1\160\1\144\1\143\2\164\1\143\1\144\1\157\2\60\2\uffff\1\144\1\163\1\160\1\60\1\145\1\uffff\1\60\1\162\1\60\1\157\1\151\1\60\1\166\1\171\1\143\1\162\1\163\2\60\1\uffff\1\164\1\60\1\143\1\171\1\145\1\60\1\164\1\145\1\151\1\145\1\123\1\170\2\uffff\1\151\1\60\1\145\1\uffff\1\154\1\uffff\1\155\1\uffff\1\156\1\157\1\uffff\1\145\1\60\1\164\1\141\1\60\2\uffff\1\60\1\uffff\1\145\2\60\1\uffff\2\163\1\157\1\60\1\145\1\60\1\141\1\uffff\2\60\1\141\1\60\1\156\1\60\1\uffff\1\157\1\164\2\uffff\1\163\2\uffff\2\60\1\156\1\uffff\1\164\1\uffff\1\164\2\uffff\1\164\1\uffff\1\60\1\uffff\1\162\1\151\1\60\2\uffff\2\60\1\145\1\151\1\uffff\1\60\1\157\3\uffff\1\60\1\157\1\uffff\1\156\1\uffff\1\156\2\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\162\1\156\3\uffff\1\157\1\163\1\150\3\uffff\1\171\2\uffff\1\170\1\162\1\75\3\uffff\1\151\1\165\1\157\1\151\1\143\1\145\1\151\1\165\1\uffff\1\74\1\76\1\uffff\1\157\1\145\1\162\1\141\1\151\1\154\1\164\1\145\1\165\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\157\1\uffff\1\160\1\172\3\uffff\1\144\1\160\1\164\2\145\3\uffff\1\147\1\160\1\141\2\uffff\1\165\1\164\1\160\1\143\1\157\1\uffff\1\75\4\uffff\1\143\1\160\1\156\1\141\1\164\1\143\1\163\1\146\1\164\1\162\1\163\1\160\1\164\4\uffff\1\154\1\164\1\144\1\147\1\163\2\141\1\154\1\145\5\uffff\1\155\1\157\1\145\1\164\1\165\1\145\1\uffff\1\145\1\156\1\160\1\141\1\147\1\163\1\162\1\172\1\145\1\156\1\172\1\155\2\145\1\165\1\153\1\155\1\160\2\uffff\1\164\1\154\1\163\1\160\1\163\1\162\2\145\1\164\1\151\1\144\1\141\1\151\1\152\1\157\1\172\1\154\1\172\1\165\1\145\1\172\1\164\1\143\1\164\1\160\1\162\1\172\2\162\1\172\1\164\1\162\1\154\1\172\1\151\1\155\1\145\1\172\1\145\1\172\1\uffff\1\144\1\163\1\uffff\1\172\1\156\1\160\1\154\1\141\1\151\1\145\1\172\1\145\1\164\1\151\1\157\1\163\1\141\1\162\1\163\1\162\1\156\1\162\1\157\1\164\1\166\1\165\1\163\1\uffff\1\145\1\uffff\1\145\1\162\1\uffff\1\172\1\153\1\151\1\145\1\171\1\uffff\1\164\1\155\1\uffff\1\172\1\151\1\164\1\uffff\1\156\1\157\1\163\1\uffff\1\172\1\uffff\1\145\1\146\1\uffff\1\144\1\164\1\141\1\147\1\164\1\162\1\uffff\1\172\1\162\1\147\1\163\1\172\1\162\1\141\1\163\1\141\2\145\1\156\1\171\1\145\1\156\1\151\1\143\1\156\1\145\1\uffff\1\142\1\143\1\162\2\172\1\145\1\uffff\1\164\1\171\1\147\1\144\1\172\1\uffff\1\146\1\157\1\163\1\151\1\164\1\145\1\151\1\164\1\uffff\2\165\1\145\1\uffff\1\171\1\154\1\172\1\143\1\163\1\156\1\154\1\160\1\144\1\143\2\164\1\143\1\144\1\157\2\172\2\uffff\1\144\1\163\1\160\1\172\1\145\1\uffff\1\172\1\162\1\172\1\157\1\151\1\172\1\166\1\171\1\143\1\162\1\163\2\172\1\uffff\1\164\1\172\1\143\1\171\1\145\1\172\1\164\1\145\1\151\1\145\1\123\1\170\2\uffff\1\151\1\172\1\145\1\uffff\1\154\1\uffff\1\155\1\uffff\1\156\1\157\1\uffff\1\145\1\172\1\164\1\141\1\172\2\uffff\1\172\1\uffff\1\145\2\172\1\uffff\2\163\1\157\1\172\1\145\1\172\1\141\1\uffff\2\172\1\141\1\172\1\156\1\172\1\uffff\1\157\1\164\2\uffff\1\163\2\uffff\2\172\1\156\1\uffff\1\164\1\uffff\1\164\2\uffff\1\164\1\uffff\1\172\1\uffff\1\162\1\151\1\172\2\uffff\2\172\1\145\1\151\1\uffff\1\172\1\157\3\uffff\1\172\1\157\1\uffff\1\156\1\uffff\1\156\2\172\2\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\1\5\3\uffff\1\12\1\13\1\14\1\uffff\1\17\1\20\3\uffff\1\26\1\32\1\33\10\uffff\1\56\2\uffff\1\61\11\uffff\1\112\1\uffff\1\113\3\uffff\1\117\1\120\1\uffff\1\113\2\uffff\1\3\1\4\1\5\5\uffff\1\12\1\13\1\14\3\uffff\1\17\1\20\5\uffff\1\27\1\uffff\1\25\1\26\1\32\1\33\15\uffff\1\56\1\57\1\60\1\61\11\uffff\1\112\1\114\1\115\1\116\1\117\6\uffff\1\62\22\uffff\1\30\1\31\50\uffff\1\15\2\uffff\1\23\30\uffff\1\64\1\uffff\1\66\2\uffff\1\71\5\uffff\1\1\2\uffff\1\22\3\uffff\1\21\3\uffff\1\7\1\uffff\1\42\2\uffff\1\50\6\uffff\1\34\23\uffff\1\72\6\uffff\1\63\5\uffff\1\10\10\uffff\1\35\3\uffff\1\54\21\uffff\1\103\1\2\5\uffff\1\105\15\uffff\1\40\14\uffff\1\75\1\102\3\uffff\1\43\1\uffff\1\16\1\uffff\1\41\2\uffff\1\47\5\uffff\1\37\1\77\1\uffff\1\44\3\uffff\1\76\7\uffff\1\104\6\uffff\1\101\2\uffff\1\107\1\74\1\uffff\1\111\1\51\3\uffff\1\70\1\uffff\1\73\1\uffff\1\6\1\46\1\uffff\1\53\1\uffff\1\52\3\uffff\1\106\1\55\4\uffff\1\24\2\uffff\1\110\1\65\1\67\2\uffff\1\36\1\uffff\1\11\3\uffff\1\100\1\45";
    static final String DFA13_specialS =
        "\1\2\54\uffff\1\0\1\1\u017a\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\61\1\55\4\61\1\56\1\23\1\24\1\4\1\61\1\3\1\61\1\40\1\57\12\52\1\21\1\5\1\36\1\11\1\37\1\61\1\22\1\54\1\44\1\41\1\25\7\54\1\45\2\54\1\43\3\54\1\42\1\26\6\54\1\15\1\61\1\16\1\53\1\54\1\61\1\31\1\46\1\27\1\33\1\17\1\1\1\54\1\50\1\2\2\54\1\30\1\6\1\54\1\34\1\20\1\51\1\32\1\47\1\14\1\7\1\54\1\10\3\54\1\12\1\61\1\13\1\35\uff81\61",
            "\1\62",
            "\1\64\1\65",
            "",
            "",
            "",
            "\1\72\3\uffff\1\73\11\uffff\1\71",
            "\1\74",
            "\1\75",
            "",
            "",
            "",
            "\1\101\20\uffff\1\103\6\uffff\1\102",
            "",
            "",
            "\1\106\11\uffff\1\107",
            "\1\111\15\uffff\1\110\2\uffff\1\112",
            "\1\114\2\uffff\1\113",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\124\2\uffff\1\123",
            "\1\125",
            "\1\127\1\126",
            "\1\130",
            "\1\131\3\uffff\1\132\3\uffff\1\133",
            "\1\134\4\uffff\1\135",
            "",
            "\1\137",
            "\1\140",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\0\154",
            "\0\154",
            "\1\155\4\uffff\1\156",
            "",
            "",
            "\1\160",
            "",
            "\1\161",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\165\1\163\5\63\1\164\4\63\1\162\6\63",
            "",
            "",
            "",
            "\1\167",
            "\1\170\6\uffff\1\171",
            "\1\173\1\uffff\1\172",
            "\1\174",
            "\1\175",
            "",
            "",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "",
            "\1\u0081\20\uffff\1\u0082",
            "\1\u0084\20\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087\5\uffff\1\u0088",
            "",
            "\1\u0089",
            "",
            "",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008e\1\u008d",
            "\1\u008f",
            "\1\u0090\21\uffff\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0095\4\uffff\1\u0094",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "",
            "",
            "\1\u009b",
            "\1\u009d\2\uffff\1\u009c",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b2\3\uffff\1\u00b1",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b4",
            "\1\u00b5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c1\14\uffff\1\u00c0",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c9\3\uffff\1\u00c8",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d2",
            "\1\u00d3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00db",
            "\1\u00dc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0159",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u015b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u015d",
            "\1\u015e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0167",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "",
            "",
            "\1\u0173",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0175",
            "",
            "\1\u0176",
            "",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "",
            "\1\u017a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u017c",
            "\1\u017d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0180",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0187",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0189",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u018c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u018e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0190",
            "\1\u0191",
            "",
            "",
            "\1\u0192",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0195",
            "",
            "\1\u0196",
            "",
            "\1\u0197",
            "",
            "",
            "\1\u0198",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u019a",
            "\1\u019b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u019f",
            "\1\u01a0",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01a2",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01a4",
            "",
            "\1\u01a5",
            "",
            "\1\u01a6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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

    class DFA13 extends DFA {

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
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | RULE_MULTIPLICITYRANGE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_45 = input.LA(1);

                        s = -1;
                        if ( ((LA13_45>='\u0000' && LA13_45<='\uFFFF')) ) {s = 108;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_46 = input.LA(1);

                        s = -1;
                        if ( ((LA13_46>='\u0000' && LA13_46<='\uFFFF')) ) {s = 108;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='f') ) {s = 1;}

                        else if ( (LA13_0=='i') ) {s = 2;}

                        else if ( (LA13_0==',') ) {s = 3;}

                        else if ( (LA13_0=='*') ) {s = 4;}

                        else if ( (LA13_0==';') ) {s = 5;}

                        else if ( (LA13_0=='m') ) {s = 6;}

                        else if ( (LA13_0=='u') ) {s = 7;}

                        else if ( (LA13_0=='w') ) {s = 8;}

                        else if ( (LA13_0=='=') ) {s = 9;}

                        else if ( (LA13_0=='{') ) {s = 10;}

                        else if ( (LA13_0=='}') ) {s = 11;}

                        else if ( (LA13_0=='t') ) {s = 12;}

                        else if ( (LA13_0=='[') ) {s = 13;}

                        else if ( (LA13_0==']') ) {s = 14;}

                        else if ( (LA13_0=='e') ) {s = 15;}

                        else if ( (LA13_0=='p') ) {s = 16;}

                        else if ( (LA13_0==':') ) {s = 17;}

                        else if ( (LA13_0=='@') ) {s = 18;}

                        else if ( (LA13_0=='(') ) {s = 19;}

                        else if ( (LA13_0==')') ) {s = 20;}

                        else if ( (LA13_0=='D') ) {s = 21;}

                        else if ( (LA13_0=='T') ) {s = 22;}

                        else if ( (LA13_0=='c') ) {s = 23;}

                        else if ( (LA13_0=='l') ) {s = 24;}

                        else if ( (LA13_0=='a') ) {s = 25;}

                        else if ( (LA13_0=='r') ) {s = 26;}

                        else if ( (LA13_0=='d') ) {s = 27;}

                        else if ( (LA13_0=='o') ) {s = 28;}

                        else if ( (LA13_0=='~') ) {s = 29;}

                        else if ( (LA13_0=='<') ) {s = 30;}

                        else if ( (LA13_0=='>') ) {s = 31;}

                        else if ( (LA13_0=='.') ) {s = 32;}

                        else if ( (LA13_0=='C') ) {s = 33;}

                        else if ( (LA13_0=='S') ) {s = 34;}

                        else if ( (LA13_0=='O') ) {s = 35;}

                        else if ( (LA13_0=='B') ) {s = 36;}

                        else if ( (LA13_0=='L') ) {s = 37;}

                        else if ( (LA13_0=='b') ) {s = 38;}

                        else if ( (LA13_0=='s') ) {s = 39;}

                        else if ( (LA13_0=='h') ) {s = 40;}

                        else if ( (LA13_0=='q') ) {s = 41;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 42;}

                        else if ( (LA13_0=='^') ) {s = 43;}

                        else if ( (LA13_0=='A'||(LA13_0>='E' && LA13_0<='K')||(LA13_0>='M' && LA13_0<='N')||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='g'||(LA13_0>='j' && LA13_0<='k')||LA13_0=='n'||LA13_0=='v'||(LA13_0>='x' && LA13_0<='z')) ) {s = 44;}

                        else if ( (LA13_0=='\"') ) {s = 45;}

                        else if ( (LA13_0=='\'') ) {s = 46;}

                        else if ( (LA13_0=='/') ) {s = 47;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 48;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||LA13_0=='+'||LA13_0=='-'||LA13_0=='?'||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='\u007F' && LA13_0<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}