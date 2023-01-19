package org.xtext.example.myspectra.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMySpectraLexer extends Lexer {
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__154=154;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalMySpectraLexer() {;} 
    public InternalMySpectraLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMySpectraLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMySpectra.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:11:7: ( 'Model' )
            // InternalMySpectra.g:11:9: 'Model'
            {
            match("Model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:12:7: ( '{' )
            // InternalMySpectra.g:12:9: '{'
            {
            match('{'); 

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
            // InternalMySpectra.g:13:7: ( 'imports' )
            // InternalMySpectra.g:13:9: 'imports'
            {
            match("imports"); 


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
            // InternalMySpectra.g:14:7: ( ',' )
            // InternalMySpectra.g:14:9: ','
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
            // InternalMySpectra.g:15:7: ( '}' )
            // InternalMySpectra.g:15:9: '}'
            {
            match('}'); 

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
            // InternalMySpectra.g:16:7: ( 'elements' )
            // InternalMySpectra.g:16:9: 'elements'
            {
            match("elements"); 


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
            // InternalMySpectra.g:17:7: ( 'Import' )
            // InternalMySpectra.g:17:9: 'Import'
            {
            match("Import"); 


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
            // InternalMySpectra.g:18:7: ( 'importURI' )
            // InternalMySpectra.g:18:9: 'importURI'
            {
            match("importURI"); 


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
            // InternalMySpectra.g:19:7: ( 'Decl' )
            // InternalMySpectra.g:19:9: 'Decl'
            {
            match("Decl"); 


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
            // InternalMySpectra.g:20:7: ( 'WeightDef' )
            // InternalMySpectra.g:20:9: 'WeightDef'
            {
            match("WeightDef"); 


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
            // InternalMySpectra.g:21:7: ( 'negative' )
            // InternalMySpectra.g:21:9: 'negative'
            {
            match("negative"); 


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
            // InternalMySpectra.g:22:7: ( 'value' )
            // InternalMySpectra.g:22:9: 'value'
            {
            match("value"); 


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
            // InternalMySpectra.g:23:7: ( 'definition' )
            // InternalMySpectra.g:23:9: 'definition'
            {
            match("definition"); 


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
            // InternalMySpectra.g:24:7: ( 'Var' )
            // InternalMySpectra.g:24:9: 'Var'
            {
            match("Var"); 


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
            // InternalMySpectra.g:25:7: ( 'kind' )
            // InternalMySpectra.g:25:9: 'kind'
            {
            match("kind"); 


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
            // InternalMySpectra.g:26:7: ( 'var' )
            // InternalMySpectra.g:26:9: 'var'
            {
            match("var"); 


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
            // InternalMySpectra.g:27:7: ( 'TypeDef' )
            // InternalMySpectra.g:27:9: 'TypeDef'
            {
            match("TypeDef"); 


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
            // InternalMySpectra.g:28:7: ( 'type' )
            // InternalMySpectra.g:28:9: 'type'
            {
            match("type"); 


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
            // InternalMySpectra.g:29:7: ( 'Define' )
            // InternalMySpectra.g:29:9: 'Define'
            {
            match("Define"); 


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
            // InternalMySpectra.g:30:7: ( 'defineList' )
            // InternalMySpectra.g:30:9: 'defineList'
            {
            match("defineList"); 


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
            // InternalMySpectra.g:31:7: ( 'DefineRegExp' )
            // InternalMySpectra.g:31:9: 'DefineRegExp'
            {
            match("DefineRegExp"); 


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
            // InternalMySpectra.g:32:7: ( 'defineRegsList' )
            // InternalMySpectra.g:32:9: 'defineRegsList'
            {
            match("defineRegsList"); 


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
            // InternalMySpectra.g:33:7: ( 'Counter' )
            // InternalMySpectra.g:33:9: 'Counter'
            {
            match("Counter"); 


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
            // InternalMySpectra.g:34:7: ( 'overflowMethod' )
            // InternalMySpectra.g:34:9: 'overflowMethod'
            {
            match("overflowMethod"); 


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
            // InternalMySpectra.g:35:7: ( 'underflowMethod' )
            // InternalMySpectra.g:35:9: 'underflowMethod'
            {
            match("underflowMethod"); 


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
            // InternalMySpectra.g:36:7: ( 'range' )
            // InternalMySpectra.g:36:9: 'range'
            {
            match("range"); 


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
            // InternalMySpectra.g:37:7: ( 'initial' )
            // InternalMySpectra.g:37:9: 'initial'
            {
            match("initial"); 


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
            // InternalMySpectra.g:38:7: ( 'resetPred' )
            // InternalMySpectra.g:38:9: 'resetPred'
            {
            match("resetPred"); 


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
            // InternalMySpectra.g:39:7: ( 'incPred' )
            // InternalMySpectra.g:39:9: 'incPred'
            {
            match("incPred"); 


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
            // InternalMySpectra.g:40:7: ( 'decPred' )
            // InternalMySpectra.g:40:9: 'decPred'
            {
            match("decPred"); 


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
            // InternalMySpectra.g:41:7: ( 'Monitor' )
            // InternalMySpectra.g:41:9: 'Monitor'
            {
            match("Monitor"); 


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
            // InternalMySpectra.g:42:7: ( 'safety' )
            // InternalMySpectra.g:42:9: 'safety'
            {
            match("safety"); 


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
            // InternalMySpectra.g:43:7: ( 'stateInv' )
            // InternalMySpectra.g:43:9: 'stateInv'
            {
            match("stateInv"); 


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
            // InternalMySpectra.g:44:7: ( 'Pattern' )
            // InternalMySpectra.g:44:9: 'Pattern'
            {
            match("Pattern"); 


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
            // InternalMySpectra.g:45:7: ( 'params' )
            // InternalMySpectra.g:45:9: 'params'
            {
            match("params"); 


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
            // InternalMySpectra.g:46:7: ( 'varDeclList' )
            // InternalMySpectra.g:46:9: 'varDeclList'
            {
            match("varDeclList"); 


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
            // InternalMySpectra.g:47:7: ( 'justice' )
            // InternalMySpectra.g:47:9: 'justice'
            {
            match("justice"); 


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
            // InternalMySpectra.g:48:7: ( 'Predicate' )
            // InternalMySpectra.g:48:9: 'Predicate'
            {
            match("Predicate"); 


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
            // InternalMySpectra.g:49:7: ( 'body' )
            // InternalMySpectra.g:49:9: 'body'
            {
            match("body"); 


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
            // InternalMySpectra.g:50:7: ( 'LTLGar' )
            // InternalMySpectra.g:50:9: 'LTLGar'
            {
            match("LTLGar"); 


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
            // InternalMySpectra.g:51:7: ( 'temporalExpr' )
            // InternalMySpectra.g:51:9: 'temporalExpr'
            {
            match("temporalExpr"); 


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
            // InternalMySpectra.g:52:7: ( 'trig' )
            // InternalMySpectra.g:52:9: 'trig'
            {
            match("trig"); 


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
            // InternalMySpectra.g:53:7: ( 'LTLAsm' )
            // InternalMySpectra.g:53:9: 'LTLAsm'
            {
            match("LTLAsm"); 


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
            // InternalMySpectra.g:54:7: ( 'EXGar' )
            // InternalMySpectra.g:54:9: 'EXGar'
            {
            match("EXGar"); 


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
            // InternalMySpectra.g:55:7: ( 'regExpPointer' )
            // InternalMySpectra.g:55:9: 'regExpPointer'
            {
            match("regExpPointer"); 


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
            // InternalMySpectra.g:56:7: ( 'regExp' )
            // InternalMySpectra.g:56:9: 'regExp'
            {
            match("regExp"); 


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
            // InternalMySpectra.g:57:7: ( '-' )
            // InternalMySpectra.g:57:9: '-'
            {
            match('-'); 

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
            // InternalMySpectra.g:58:7: ( 'TemporalExpression' )
            // InternalMySpectra.g:58:9: 'TemporalExpression'
            {
            match("TemporalExpression"); 


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
            // InternalMySpectra.g:59:7: ( 'not' )
            // InternalMySpectra.g:59:9: 'not'
            {
            match("not"); 


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
            // InternalMySpectra.g:60:7: ( 'TemporalInExpr' )
            // InternalMySpectra.g:60:9: 'TemporalInExpr'
            {
            match("TemporalInExpr"); 


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
            // InternalMySpectra.g:61:7: ( 'operator' )
            // InternalMySpectra.g:61:9: 'operator'
            {
            match("operator"); 


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
            // InternalMySpectra.g:62:7: ( 'left' )
            // InternalMySpectra.g:62:9: 'left'
            {
            match("left"); 


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
            // InternalMySpectra.g:63:7: ( 'values' )
            // InternalMySpectra.g:63:9: 'values'
            {
            match("values"); 


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
            // InternalMySpectra.g:64:7: ( 'TemporalImpExpr' )
            // InternalMySpectra.g:64:9: 'TemporalImpExpr'
            {
            match("TemporalImpExpr"); 


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
            // InternalMySpectra.g:65:7: ( 'implication' )
            // InternalMySpectra.g:65:9: 'implication'
            {
            match("implication"); 


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
            // InternalMySpectra.g:66:7: ( 'TemporalIffExpr' )
            // InternalMySpectra.g:66:9: 'TemporalIffExpr'
            {
            match("TemporalIffExpr"); 


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
            // InternalMySpectra.g:67:7: ( 'TemporalOrExpr' )
            // InternalMySpectra.g:67:9: 'TemporalOrExpr'
            {
            match("TemporalOrExpr"); 


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
            // InternalMySpectra.g:68:7: ( 'TemporalAndExpr' )
            // InternalMySpectra.g:68:9: 'TemporalAndExpr'
            {
            match("TemporalAndExpr"); 


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
            // InternalMySpectra.g:69:7: ( 'TemporalRelationalExpr' )
            // InternalMySpectra.g:69:9: 'TemporalRelationalExpr'
            {
            match("TemporalRelationalExpr"); 


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
            // InternalMySpectra.g:70:7: ( 'right' )
            // InternalMySpectra.g:70:9: 'right'
            {
            match("right"); 


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
            // InternalMySpectra.g:71:7: ( 'TemporalRemainderExpr' )
            // InternalMySpectra.g:71:9: 'TemporalRemainderExpr'
            {
            match("TemporalRemainderExpr"); 


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
            // InternalMySpectra.g:72:7: ( 'TemporalAdditiveExpr' )
            // InternalMySpectra.g:72:9: 'TemporalAdditiveExpr'
            {
            match("TemporalAdditiveExpr"); 


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
            // InternalMySpectra.g:73:7: ( 'TemporalMultiplicativeExpr' )
            // InternalMySpectra.g:73:9: 'TemporalMultiplicativeExpr'
            {
            match("TemporalMultiplicativeExpr"); 


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
            // InternalMySpectra.g:74:7: ( 'TemporalBinaryExpr' )
            // InternalMySpectra.g:74:9: 'TemporalBinaryExpr'
            {
            match("TemporalBinaryExpr"); 


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
            // InternalMySpectra.g:75:7: ( 'TemporalUnaryExpr' )
            // InternalMySpectra.g:75:9: 'TemporalUnaryExpr'
            {
            match("TemporalUnaryExpr"); 


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
            // InternalMySpectra.g:76:7: ( 'kinds' )
            // InternalMySpectra.g:76:9: 'kinds'
            {
            match("kinds"); 


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
            // InternalMySpectra.g:77:7: ( 'tue' )
            // InternalMySpectra.g:77:9: 'tue'
            {
            match("tue"); 


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
            // InternalMySpectra.g:78:7: ( 'TemporalPrimaryExpr' )
            // InternalMySpectra.g:78:9: 'TemporalPrimaryExpr'
            {
            match("TemporalPrimaryExpr"); 


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
            // InternalMySpectra.g:79:7: ( 'predPatt' )
            // InternalMySpectra.g:79:9: 'predPatt'
            {
            match("predPatt"); 


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
            // InternalMySpectra.g:80:7: ( 'pointer' )
            // InternalMySpectra.g:80:9: 'pointer'
            {
            match("pointer"); 


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
            // InternalMySpectra.g:81:7: ( 'regexpPointer' )
            // InternalMySpectra.g:81:9: 'regexpPointer'
            {
            match("regexpPointer"); 


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
            // InternalMySpectra.g:82:7: ( 'predPattParams' )
            // InternalMySpectra.g:82:9: 'predPattParams'
            {
            match("predPattParams"); 


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
            // InternalMySpectra.g:83:7: ( 'tpe' )
            // InternalMySpectra.g:83:9: 'tpe'
            {
            match("tpe"); 


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
            // InternalMySpectra.g:84:7: ( 'index' )
            // InternalMySpectra.g:84:9: 'index'
            {
            match("index"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:85:7: ( 'temporalExpression' )
            // InternalMySpectra.g:85:9: 'temporalExpression'
            {
            match("temporalExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:86:7: ( 'regexp' )
            // InternalMySpectra.g:86:9: 'regexp'
            {
            match("regexp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:87:7: ( 'Constant' )
            // InternalMySpectra.g:87:9: 'Constant'
            {
            match("Constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:88:7: ( 'booleanValue' )
            // InternalMySpectra.g:88:9: 'booleanValue'
            {
            match("booleanValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:89:7: ( 'integerValue' )
            // InternalMySpectra.g:89:9: 'integerValue'
            {
            match("integerValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:90:7: ( 'QuantifierExpr' )
            // InternalMySpectra.g:90:9: 'QuantifierExpr'
            {
            match("QuantifierExpr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:91:7: ( 'domainVar' )
            // InternalMySpectra.g:91:9: 'domainVar'
            {
            match("domainVar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:92:7: ( 'multi' )
            // InternalMySpectra.g:92:9: 'multi'
            {
            match("multi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:93:7: ( 'ValueInRange' )
            // InternalMySpectra.g:93:9: 'ValueInRange'
            {
            match("ValueInRange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:94:7: ( 'int' )
            // InternalMySpectra.g:94:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:95:7: ( 'from' )
            // InternalMySpectra.g:95:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:96:7: ( 'to' )
            // InternalMySpectra.g:96:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:97:7: ( 'const' )
            // InternalMySpectra.g:97:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:98:7: ( 'TypeConstant' )
            // InternalMySpectra.g:98:9: 'TypeConstant'
            {
            match("TypeConstant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:99:7: ( 'PredicateOrPatternReferrable' )
            // InternalMySpectra.g:99:9: 'PredicateOrPatternReferrable'
            {
            match("PredicateOrPatternReferrable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:100:8: ( 'Referrable' )
            // InternalMySpectra.g:100:10: 'Referrable'
            {
            match("Referrable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:101:8: ( 'empty' )
            // InternalMySpectra.g:101:10: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:102:8: ( 'RegExp' )
            // InternalMySpectra.g:102:10: 'RegExp'
            {
            match("RegExp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:103:8: ( 'val' )
            // InternalMySpectra.g:103:10: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:104:8: ( 'assrt' )
            // InternalMySpectra.g:104:10: 'assrt'
            {
            match("assrt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:105:8: ( 'DefineRegExpDecl' )
            // InternalMySpectra.g:105:10: 'DefineRegExpDecl'
            {
            match("DefineRegExpDecl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:106:8: ( 'exp' )
            // InternalMySpectra.g:106:10: 'exp'
            {
            match("exp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:107:8: ( 'VarDecl' )
            // InternalMySpectra.g:107:10: 'VarDecl'
            {
            match("VarDecl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:108:8: ( 'DefineDecl' )
            // InternalMySpectra.g:108:10: 'DefineDecl'
            {
            match("DefineDecl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:109:8: ( 'simpleExpr' )
            // InternalMySpectra.g:109:10: 'simpleExpr'
            {
            match("simpleExpr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:110:8: ( 'dimensions' )
            // InternalMySpectra.g:110:10: 'dimensions'
            {
            match("dimensions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:111:8: ( 'innerArray' )
            // InternalMySpectra.g:111:10: 'innerArray'
            {
            match("innerArray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:112:8: ( 'PatternParam' )
            // InternalMySpectra.g:112:10: 'PatternParam'
            {
            match("PatternParam"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:113:8: ( 'TypedParam' )
            // InternalMySpectra.g:113:10: 'TypedParam'
            {
            match("TypedParam"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:114:8: ( 'DomainVarDecl' )
            // InternalMySpectra.g:114:10: 'DomainVarDecl'
            {
            match("DomainVarDecl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:115:8: ( 'domainType' )
            // InternalMySpectra.g:115:10: 'domainType'
            {
            match("domainType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:116:8: ( 'VarType' )
            // InternalMySpectra.g:116:10: 'VarType'
            {
            match("VarType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:117:8: ( 'subr' )
            // InternalMySpectra.g:117:10: 'subr'
            {
            match("subr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:118:8: ( 'Subrange' )
            // InternalMySpectra.g:118:10: 'Subrange'
            {
            match("Subrange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:119:8: ( 'SizeDefineDecl' )
            // InternalMySpectra.g:119:10: 'SizeDefineDecl'
            {
            match("SizeDefineDecl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:120:8: ( 'name' )
            // InternalMySpectra.g:120:10: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:121:8: ( 'arithExp' )
            // InternalMySpectra.g:121:10: 'arithExp'
            {
            match("arithExp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:122:8: ( 'DefineArray' )
            // InternalMySpectra.g:122:10: 'DefineArray'
            {
            match("DefineArray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:123:8: ( 'simpleExprs' )
            // InternalMySpectra.g:123:10: 'simpleExprs'
            {
            match("simpleExprs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:124:8: ( 'innerArrays' )
            // InternalMySpectra.g:124:10: 'innerArrays'
            {
            match("innerArrays"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:125:8: ( 'BooleanTerm' )
            // InternalMySpectra.g:125:10: 'BooleanTerm'
            {
            match("BooleanTerm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:126:8: ( 'relExpr' )
            // InternalMySpectra.g:126:10: 'relExpr'
            {
            match("relExpr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:127:8: ( 'BinaryRegExp' )
            // InternalMySpectra.g:127:10: 'BinaryRegExp'
            {
            match("BinaryRegExp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:128:8: ( 'op' )
            // InternalMySpectra.g:128:10: 'op'
            {
            match("op"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:129:8: ( 'kleened' )
            // InternalMySpectra.g:129:10: 'kleened'
            {
            match("kleened"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:130:8: ( 'questionMark' )
            // InternalMySpectra.g:130:10: 'questionMark'
            {
            match("questionMark"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:131:8: ( 'plus' )
            // InternalMySpectra.g:131:10: 'plus'
            {
            match("plus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:132:8: ( 'haveExactRepetition' )
            // InternalMySpectra.g:132:10: 'haveExactRepetition'
            {
            match("haveExactRepetition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:133:8: ( 'haveAtLeast' )
            // InternalMySpectra.g:133:10: 'haveAtLeast'
            {
            match("haveAtLeast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:134:8: ( 'haveRange' )
            // InternalMySpectra.g:134:10: 'haveRange'
            {
            match("haveRange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:135:8: ( 'UnaryRegExp' )
            // InternalMySpectra.g:135:10: 'UnaryRegExp'
            {
            match("UnaryRegExp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:136:8: ( 'exactRepetition' )
            // InternalMySpectra.g:136:10: 'exactRepetition'
            {
            match("exactRepetition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:137:8: ( 'atLeast' )
            // InternalMySpectra.g:137:10: 'atLeast'
            {
            match("atLeast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:138:8: ( 'fromDefine' )
            // InternalMySpectra.g:138:10: 'fromDefine'
            {
            match("fromDefine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:139:8: ( 'toDefine' )
            // InternalMySpectra.g:139:10: 'toDefine'
            {
            match("toDefine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:140:8: ( 'CompRegExp' )
            // InternalMySpectra.g:140:10: 'CompRegExp'
            {
            match("CompRegExp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:141:8: ( 'comp' )
            // InternalMySpectra.g:141:10: 'comp'
            {
            match("comp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:142:8: ( 'PatternParamList' )
            // InternalMySpectra.g:142:10: 'PatternParamList'
            {
            match("PatternParamList"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:143:8: ( 'TypedParamList' )
            // InternalMySpectra.g:143:10: 'TypedParamList'
            {
            match("TypedParamList"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:144:8: ( 'Trigger' )
            // InternalMySpectra.g:144:10: 'Trigger'
            {
            match("Trigger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:145:8: ( 'initPointer' )
            // InternalMySpectra.g:145:10: 'initPointer'
            {
            match("initPointer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:146:8: ( 'effectPointer' )
            // InternalMySpectra.g:146:10: 'effectPointer'
            {
            match("effectPointer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:147:8: ( 'initRegExp' )
            // InternalMySpectra.g:147:10: 'initRegExp'
            {
            match("initRegExp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:148:8: ( 'effectRegExp' )
            // InternalMySpectra.g:148:10: 'effectRegExp'
            {
            match("effectRegExp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:149:8: ( 'SYS' )
            // InternalMySpectra.g:149:10: 'SYS'
            {
            match("SYS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:150:8: ( 'ENV' )
            // InternalMySpectra.g:150:10: 'ENV'
            {
            match("ENV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:151:8: ( 'AUX' )
            // InternalMySpectra.g:151:10: 'AUX'
            {
            match("AUX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:152:8: ( 'KEEP' )
            // InternalMySpectra.g:152:10: 'KEEP'
            {
            match("KEEP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:153:8: ( 'FALSE' )
            // InternalMySpectra.g:153:10: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:154:8: ( 'MODULO' )
            // InternalMySpectra.g:154:10: 'MODULO'
            {
            match("MODULO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:7687:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMySpectra.g:7687:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMySpectra.g:7687:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMySpectra.g:7687:11: '^'
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

            // InternalMySpectra.g:7687:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMySpectra.g:
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
            	    break loop2;
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
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMySpectra.g:7689:10: ( ( '0' .. '9' )+ )
            // InternalMySpectra.g:7689:12: ( '0' .. '9' )+
            {
            // InternalMySpectra.g:7689:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMySpectra.g:7689:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
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
            // InternalMySpectra.g:7691:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMySpectra.g:7691:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMySpectra.g:7691:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMySpectra.g:7691:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMySpectra.g:7691:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMySpectra.g:7691:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMySpectra.g:7691:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMySpectra.g:7691:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMySpectra.g:7691:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMySpectra.g:7691:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMySpectra.g:7691:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalMySpectra.g:7693:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMySpectra.g:7693:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMySpectra.g:7693:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMySpectra.g:7693:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalMySpectra.g:7695:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMySpectra.g:7695:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMySpectra.g:7695:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMySpectra.g:7695:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalMySpectra.g:7695:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMySpectra.g:7695:41: ( '\\r' )? '\\n'
                    {
                    // InternalMySpectra.g:7695:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMySpectra.g:7695:41: '\\r'
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
            // InternalMySpectra.g:7697:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMySpectra.g:7697:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMySpectra.g:7697:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMySpectra.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalMySpectra.g:7699:16: ( . )
            // InternalMySpectra.g:7699:18: .
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
        // InternalMySpectra.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=151;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMySpectra.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalMySpectra.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalMySpectra.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalMySpectra.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalMySpectra.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalMySpectra.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalMySpectra.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalMySpectra.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalMySpectra.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalMySpectra.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalMySpectra.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalMySpectra.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalMySpectra.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalMySpectra.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalMySpectra.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalMySpectra.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalMySpectra.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalMySpectra.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalMySpectra.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalMySpectra.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalMySpectra.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalMySpectra.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalMySpectra.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalMySpectra.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalMySpectra.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalMySpectra.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalMySpectra.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalMySpectra.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalMySpectra.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalMySpectra.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalMySpectra.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalMySpectra.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalMySpectra.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalMySpectra.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalMySpectra.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalMySpectra.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalMySpectra.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalMySpectra.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalMySpectra.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalMySpectra.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalMySpectra.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalMySpectra.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalMySpectra.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalMySpectra.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalMySpectra.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalMySpectra.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalMySpectra.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalMySpectra.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalMySpectra.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalMySpectra.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalMySpectra.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalMySpectra.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalMySpectra.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalMySpectra.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalMySpectra.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalMySpectra.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalMySpectra.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalMySpectra.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalMySpectra.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalMySpectra.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalMySpectra.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalMySpectra.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalMySpectra.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalMySpectra.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalMySpectra.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalMySpectra.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalMySpectra.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalMySpectra.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalMySpectra.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalMySpectra.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalMySpectra.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalMySpectra.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // InternalMySpectra.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // InternalMySpectra.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // InternalMySpectra.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // InternalMySpectra.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // InternalMySpectra.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // InternalMySpectra.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // InternalMySpectra.g:1:478: T__89
                {
                mT__89(); 

                }
                break;
            case 80 :
                // InternalMySpectra.g:1:484: T__90
                {
                mT__90(); 

                }
                break;
            case 81 :
                // InternalMySpectra.g:1:490: T__91
                {
                mT__91(); 

                }
                break;
            case 82 :
                // InternalMySpectra.g:1:496: T__92
                {
                mT__92(); 

                }
                break;
            case 83 :
                // InternalMySpectra.g:1:502: T__93
                {
                mT__93(); 

                }
                break;
            case 84 :
                // InternalMySpectra.g:1:508: T__94
                {
                mT__94(); 

                }
                break;
            case 85 :
                // InternalMySpectra.g:1:514: T__95
                {
                mT__95(); 

                }
                break;
            case 86 :
                // InternalMySpectra.g:1:520: T__96
                {
                mT__96(); 

                }
                break;
            case 87 :
                // InternalMySpectra.g:1:526: T__97
                {
                mT__97(); 

                }
                break;
            case 88 :
                // InternalMySpectra.g:1:532: T__98
                {
                mT__98(); 

                }
                break;
            case 89 :
                // InternalMySpectra.g:1:538: T__99
                {
                mT__99(); 

                }
                break;
            case 90 :
                // InternalMySpectra.g:1:544: T__100
                {
                mT__100(); 

                }
                break;
            case 91 :
                // InternalMySpectra.g:1:551: T__101
                {
                mT__101(); 

                }
                break;
            case 92 :
                // InternalMySpectra.g:1:558: T__102
                {
                mT__102(); 

                }
                break;
            case 93 :
                // InternalMySpectra.g:1:565: T__103
                {
                mT__103(); 

                }
                break;
            case 94 :
                // InternalMySpectra.g:1:572: T__104
                {
                mT__104(); 

                }
                break;
            case 95 :
                // InternalMySpectra.g:1:579: T__105
                {
                mT__105(); 

                }
                break;
            case 96 :
                // InternalMySpectra.g:1:586: T__106
                {
                mT__106(); 

                }
                break;
            case 97 :
                // InternalMySpectra.g:1:593: T__107
                {
                mT__107(); 

                }
                break;
            case 98 :
                // InternalMySpectra.g:1:600: T__108
                {
                mT__108(); 

                }
                break;
            case 99 :
                // InternalMySpectra.g:1:607: T__109
                {
                mT__109(); 

                }
                break;
            case 100 :
                // InternalMySpectra.g:1:614: T__110
                {
                mT__110(); 

                }
                break;
            case 101 :
                // InternalMySpectra.g:1:621: T__111
                {
                mT__111(); 

                }
                break;
            case 102 :
                // InternalMySpectra.g:1:628: T__112
                {
                mT__112(); 

                }
                break;
            case 103 :
                // InternalMySpectra.g:1:635: T__113
                {
                mT__113(); 

                }
                break;
            case 104 :
                // InternalMySpectra.g:1:642: T__114
                {
                mT__114(); 

                }
                break;
            case 105 :
                // InternalMySpectra.g:1:649: T__115
                {
                mT__115(); 

                }
                break;
            case 106 :
                // InternalMySpectra.g:1:656: T__116
                {
                mT__116(); 

                }
                break;
            case 107 :
                // InternalMySpectra.g:1:663: T__117
                {
                mT__117(); 

                }
                break;
            case 108 :
                // InternalMySpectra.g:1:670: T__118
                {
                mT__118(); 

                }
                break;
            case 109 :
                // InternalMySpectra.g:1:677: T__119
                {
                mT__119(); 

                }
                break;
            case 110 :
                // InternalMySpectra.g:1:684: T__120
                {
                mT__120(); 

                }
                break;
            case 111 :
                // InternalMySpectra.g:1:691: T__121
                {
                mT__121(); 

                }
                break;
            case 112 :
                // InternalMySpectra.g:1:698: T__122
                {
                mT__122(); 

                }
                break;
            case 113 :
                // InternalMySpectra.g:1:705: T__123
                {
                mT__123(); 

                }
                break;
            case 114 :
                // InternalMySpectra.g:1:712: T__124
                {
                mT__124(); 

                }
                break;
            case 115 :
                // InternalMySpectra.g:1:719: T__125
                {
                mT__125(); 

                }
                break;
            case 116 :
                // InternalMySpectra.g:1:726: T__126
                {
                mT__126(); 

                }
                break;
            case 117 :
                // InternalMySpectra.g:1:733: T__127
                {
                mT__127(); 

                }
                break;
            case 118 :
                // InternalMySpectra.g:1:740: T__128
                {
                mT__128(); 

                }
                break;
            case 119 :
                // InternalMySpectra.g:1:747: T__129
                {
                mT__129(); 

                }
                break;
            case 120 :
                // InternalMySpectra.g:1:754: T__130
                {
                mT__130(); 

                }
                break;
            case 121 :
                // InternalMySpectra.g:1:761: T__131
                {
                mT__131(); 

                }
                break;
            case 122 :
                // InternalMySpectra.g:1:768: T__132
                {
                mT__132(); 

                }
                break;
            case 123 :
                // InternalMySpectra.g:1:775: T__133
                {
                mT__133(); 

                }
                break;
            case 124 :
                // InternalMySpectra.g:1:782: T__134
                {
                mT__134(); 

                }
                break;
            case 125 :
                // InternalMySpectra.g:1:789: T__135
                {
                mT__135(); 

                }
                break;
            case 126 :
                // InternalMySpectra.g:1:796: T__136
                {
                mT__136(); 

                }
                break;
            case 127 :
                // InternalMySpectra.g:1:803: T__137
                {
                mT__137(); 

                }
                break;
            case 128 :
                // InternalMySpectra.g:1:810: T__138
                {
                mT__138(); 

                }
                break;
            case 129 :
                // InternalMySpectra.g:1:817: T__139
                {
                mT__139(); 

                }
                break;
            case 130 :
                // InternalMySpectra.g:1:824: T__140
                {
                mT__140(); 

                }
                break;
            case 131 :
                // InternalMySpectra.g:1:831: T__141
                {
                mT__141(); 

                }
                break;
            case 132 :
                // InternalMySpectra.g:1:838: T__142
                {
                mT__142(); 

                }
                break;
            case 133 :
                // InternalMySpectra.g:1:845: T__143
                {
                mT__143(); 

                }
                break;
            case 134 :
                // InternalMySpectra.g:1:852: T__144
                {
                mT__144(); 

                }
                break;
            case 135 :
                // InternalMySpectra.g:1:859: T__145
                {
                mT__145(); 

                }
                break;
            case 136 :
                // InternalMySpectra.g:1:866: T__146
                {
                mT__146(); 

                }
                break;
            case 137 :
                // InternalMySpectra.g:1:873: T__147
                {
                mT__147(); 

                }
                break;
            case 138 :
                // InternalMySpectra.g:1:880: T__148
                {
                mT__148(); 

                }
                break;
            case 139 :
                // InternalMySpectra.g:1:887: T__149
                {
                mT__149(); 

                }
                break;
            case 140 :
                // InternalMySpectra.g:1:894: T__150
                {
                mT__150(); 

                }
                break;
            case 141 :
                // InternalMySpectra.g:1:901: T__151
                {
                mT__151(); 

                }
                break;
            case 142 :
                // InternalMySpectra.g:1:908: T__152
                {
                mT__152(); 

                }
                break;
            case 143 :
                // InternalMySpectra.g:1:915: T__153
                {
                mT__153(); 

                }
                break;
            case 144 :
                // InternalMySpectra.g:1:922: T__154
                {
                mT__154(); 

                }
                break;
            case 145 :
                // InternalMySpectra.g:1:929: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 146 :
                // InternalMySpectra.g:1:937: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 147 :
                // InternalMySpectra.g:1:946: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 148 :
                // InternalMySpectra.g:1:958: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 149 :
                // InternalMySpectra.g:1:974: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 150 :
                // InternalMySpectra.g:1:990: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 151 :
                // InternalMySpectra.g:1:998: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\66\1\uffff\1\66\2\uffff\26\66\1\uffff\17\66\1\63\2\uffff\3\63\2\uffff\2\66\2\uffff\2\66\2\uffff\32\66\1\u00b0\2\66\1\u00b6\23\66\1\uffff\24\66\5\uffff\7\66\1\u00ec\3\66\1\u00f0\10\66\1\u00f9\1\66\1\u00fc\1\u00fe\4\66\1\u0105\11\66\1\u010f\1\u0110\1\66\1\uffff\5\66\1\uffff\25\66\1\u012e\15\66\1\u013c\5\66\1\u0142\13\66\1\uffff\3\66\1\uffff\3\66\1\u0156\4\66\1\uffff\1\u015b\1\66\1\uffff\1\66\1\uffff\6\66\1\uffff\1\66\1\u0166\4\66\1\u016d\1\66\1\u016f\2\uffff\20\66\1\u0180\5\66\1\u0186\1\66\1\u0188\4\66\1\uffff\1\u018d\2\66\1\u0191\1\66\1\u0193\7\66\1\uffff\5\66\1\uffff\1\u01a2\1\66\1\u01a4\10\66\1\u01ad\3\66\1\u01b1\3\66\1\uffff\4\66\1\uffff\1\u01ba\10\66\1\u01c4\1\uffff\6\66\1\uffff\1\66\1\uffff\7\66\1\u01d3\4\66\1\u01d8\3\66\1\uffff\5\66\1\uffff\1\66\1\uffff\3\66\1\u01e5\1\uffff\1\66\1\u01e7\1\66\1\uffff\1\u01e9\1\uffff\2\66\1\u01ec\13\66\1\uffff\1\u01f8\1\uffff\1\66\1\u01fa\6\66\1\uffff\3\66\1\uffff\2\66\1\u0208\1\u020c\3\66\1\u0210\1\uffff\11\66\1\uffff\16\66\1\uffff\1\66\1\u022c\1\u022e\1\66\1\uffff\1\u0230\4\66\1\u0235\4\66\1\u023a\1\u023b\1\uffff\1\66\1\uffff\1\66\1\uffff\1\66\1\u023f\1\uffff\13\66\1\uffff\1\u024b\1\uffff\1\u024c\2\66\1\u024f\2\66\1\u0252\6\66\1\uffff\3\66\1\uffff\3\66\1\uffff\4\66\1\u0263\3\66\1\u0267\1\u0268\1\66\1\u026a\1\u026b\3\66\1\u026f\2\66\1\u0272\7\66\1\uffff\1\66\1\uffff\1\u027b\1\uffff\2\66\1\u027f\1\66\1\uffff\1\66\1\u0282\1\u0283\1\66\2\uffff\3\66\1\uffff\1\66\1\u0289\11\66\2\uffff\2\66\1\uffff\2\66\1\uffff\2\66\1\u0299\10\66\1\u02a2\4\66\1\uffff\3\66\2\uffff\1\66\2\uffff\3\66\1\uffff\1\66\1\u02b7\1\uffff\1\u02b8\2\66\1\u02bb\4\66\1\uffff\1\u02c0\2\66\1\uffff\1\66\1\u02c5\2\uffff\4\66\1\u02ca\1\uffff\1\u02cb\10\66\1\u02d4\5\66\1\uffff\7\66\1\u02e1\1\uffff\4\66\1\u02e6\17\66\2\uffff\2\66\1\uffff\1\66\1\u02fc\2\66\1\uffff\2\66\1\u0302\1\66\1\uffff\4\66\2\uffff\6\66\1\u030e\1\66\1\uffff\2\66\1\u0312\1\66\1\u0315\4\66\1\u031a\2\66\1\uffff\1\66\1\u031e\1\u031f\1\66\1\uffff\1\u0321\1\u0322\2\66\1\u0326\15\66\1\u0335\2\66\1\uffff\2\66\1\u033b\2\66\1\uffff\3\66\1\u0341\1\u0342\6\66\1\uffff\1\66\1\u034a\1\u034b\1\uffff\1\66\1\u034d\1\uffff\4\66\1\uffff\1\u0352\1\66\1\u0354\2\uffff\1\66\2\uffff\3\66\1\uffff\16\66\1\uffff\4\66\1\u036b\1\uffff\5\66\2\uffff\1\66\1\u0372\3\66\1\u0376\1\u0377\2\uffff\1\u0378\1\uffff\2\66\1\u037b\1\u037d\1\uffff\1\66\1\uffff\1\66\1\u0380\1\u0381\16\66\1\u0391\4\66\1\uffff\1\u0397\2\66\1\u039a\2\66\1\uffff\1\u039d\1\u039e\1\66\3\uffff\1\66\1\u03a1\1\uffff\1\66\1\uffff\1\u03a3\1\66\2\uffff\17\66\1\uffff\2\66\1\u03b6\1\u03b7\1\66\1\uffff\2\66\1\uffff\2\66\2\uffff\2\66\1\uffff\1\66\1\uffff\1\u03c0\1\u03c1\1\66\1\u03c3\2\66\1\u03c6\11\66\1\u03d0\1\66\2\uffff\2\66\1\u03d4\1\u03d5\1\u03d6\1\66\1\u03d8\1\66\2\uffff\1\66\1\uffff\1\u03db\1\u03dc\1\uffff\1\u03dd\10\66\1\uffff\1\u03e6\2\66\3\uffff\1\66\1\uffff\1\u03ea\1\66\3\uffff\10\66\1\uffff\1\u03f4\2\66\1\uffff\6\66\1\u03fd\2\66\1\uffff\2\66\1\u0402\4\66\1\u0407\1\uffff\1\66\1\u0409\2\66\1\uffff\4\66\1\uffff\1\u0410\1\uffff\1\66\1\u0412\1\u0413\3\66\1\uffff\1\66\2\uffff\1\66\1\u0419\2\66\1\u041c\1\uffff\2\66\1\uffff\6\66\1\u0425\1\66\1\uffff\1\66\1\u0428\1\uffff";
    static final String DFA12_eofS =
        "\u0429\uffff";
    static final String DFA12_minS =
        "\1\0\1\117\1\uffff\1\155\2\uffff\1\146\1\155\2\145\2\141\1\145\1\141\1\151\2\145\1\157\1\160\1\156\4\141\1\165\1\157\1\124\1\116\1\uffff\1\145\2\165\1\162\1\157\1\145\1\162\1\131\1\151\1\165\1\141\1\156\1\125\1\105\2\101\2\uffff\2\0\1\52\2\uffff\1\144\1\104\2\uffff\1\160\1\143\2\uffff\1\145\1\160\1\141\1\146\1\160\1\143\1\155\1\151\1\147\1\164\1\155\1\154\1\143\2\155\1\154\1\156\1\145\1\160\1\155\1\151\1\160\1\155\1\151\2\145\1\60\1\155\1\145\1\60\1\144\1\156\2\147\1\146\1\141\1\155\1\142\1\164\1\145\1\162\1\145\1\151\1\165\1\163\1\144\1\114\1\107\1\126\1\uffff\1\146\1\141\1\154\1\157\1\155\1\146\1\163\1\151\1\114\1\142\1\172\1\123\1\157\1\156\1\145\1\166\1\141\1\130\1\105\1\114\5\uffff\1\145\1\151\1\125\1\154\1\164\1\120\1\145\1\60\1\145\1\155\1\164\1\60\1\143\1\145\1\157\1\154\1\151\1\141\1\147\1\141\1\60\1\145\2\60\1\151\1\120\1\141\1\145\1\60\1\165\1\144\2\145\1\160\1\147\1\145\1\160\1\147\2\60\1\145\1\uffff\1\156\1\163\1\160\2\162\1\uffff\1\145\1\147\1\145\2\105\1\150\1\145\1\164\1\160\1\162\1\164\1\144\1\141\1\144\1\156\1\163\1\164\1\171\1\154\1\101\1\141\1\60\1\164\1\156\1\164\1\155\1\163\1\160\1\145\1\105\1\162\1\164\1\145\1\162\1\145\1\60\1\154\1\141\1\163\1\145\1\162\1\60\1\120\1\123\1\154\1\164\1\114\1\162\1\151\1\120\1\162\1\170\1\147\1\uffff\1\162\1\145\1\171\1\uffff\1\164\1\143\1\162\1\60\1\156\1\151\1\150\1\164\1\uffff\1\60\1\145\1\uffff\1\145\1\uffff\1\156\1\162\1\151\1\156\1\145\1\171\1\uffff\1\145\1\60\1\156\1\103\1\157\1\147\1\60\1\157\1\60\2\uffff\1\146\2\164\1\122\1\146\1\141\1\162\1\145\1\164\3\170\2\164\1\145\1\154\1\60\1\145\1\151\1\155\1\120\1\164\1\60\1\151\1\60\1\145\1\141\1\163\1\162\1\uffff\1\60\1\164\1\151\1\60\1\164\1\60\1\162\1\170\1\164\1\150\2\141\1\104\1\uffff\1\145\1\162\1\164\1\101\1\171\1\uffff\1\60\1\105\1\60\1\157\1\117\1\164\1\143\1\141\1\157\2\145\1\60\1\145\1\101\1\156\1\60\1\122\2\164\1\uffff\1\145\1\156\1\164\1\151\1\uffff\1\60\1\143\2\145\1\156\1\163\1\143\1\160\1\111\1\60\1\uffff\2\145\1\157\1\120\1\162\1\145\1\uffff\1\162\1\uffff\1\151\1\145\1\141\1\145\1\154\1\164\1\146\1\60\1\120\3\160\1\60\1\171\1\111\1\145\1\uffff\1\162\1\143\1\163\1\141\1\145\1\uffff\1\143\1\uffff\1\141\1\162\1\155\1\60\1\uffff\1\151\1\60\1\145\1\uffff\1\60\1\uffff\1\162\1\160\1\60\1\105\1\163\1\156\1\145\1\141\1\171\1\151\1\170\1\164\1\141\1\122\1\uffff\1\60\1\uffff\1\162\1\60\1\125\1\141\1\154\1\151\1\147\1\144\1\uffff\2\162\1\164\1\uffff\1\145\1\120\2\60\1\126\1\104\1\166\1\60\1\uffff\1\154\1\164\1\114\1\144\1\124\1\151\1\154\1\145\1\156\1\uffff\1\144\1\146\1\156\2\141\1\162\1\141\1\156\1\162\1\156\1\147\2\157\1\154\1\uffff\1\162\2\60\1\162\1\uffff\1\60\1\156\1\105\1\156\1\141\1\60\1\164\1\162\1\145\1\156\2\60\1\uffff\1\146\1\uffff\1\146\1\uffff\1\141\1\60\1\uffff\1\170\1\164\1\147\1\146\1\156\1\122\1\157\1\141\1\114\1\156\1\145\1\uffff\1\60\1\uffff\1\60\1\122\1\164\1\60\1\156\1\105\1\60\1\126\1\162\1\163\1\160\1\157\1\145\1\uffff\2\145\1\162\1\uffff\1\141\2\145\1\uffff\1\114\2\151\1\145\1\60\1\141\1\171\1\157\2\60\1\122\2\60\1\163\1\162\1\154\1\60\1\154\1\145\1\60\1\164\1\105\1\167\1\162\1\157\1\145\1\157\1\uffff\1\157\1\uffff\1\60\1\uffff\1\166\1\170\1\60\1\164\1\uffff\1\164\2\60\1\126\2\uffff\2\151\1\142\1\uffff\1\160\1\60\1\145\1\151\1\124\1\145\1\156\1\143\1\145\2\147\2\uffff\1\111\1\151\1\uffff\1\164\1\170\1\uffff\2\141\1\60\1\145\1\151\2\147\1\143\2\162\1\146\1\60\1\151\1\157\1\163\1\147\1\uffff\1\162\1\160\1\156\2\uffff\1\141\2\uffff\1\164\1\141\1\101\1\uffff\1\105\1\60\1\uffff\1\60\1\170\1\115\1\60\1\167\1\144\2\151\1\uffff\1\60\1\160\1\141\1\uffff\1\145\1\60\2\uffff\1\141\1\145\1\156\1\154\1\60\1\uffff\1\60\1\156\1\145\1\147\1\115\1\164\1\141\1\145\1\105\1\60\1\157\1\145\1\160\1\154\1\171\1\uffff\1\164\1\156\2\105\1\154\1\141\1\104\1\60\1\uffff\1\163\1\156\1\164\1\163\1\60\1\145\1\163\1\156\1\141\1\155\1\170\1\146\1\162\1\144\1\145\1\165\1\151\1\156\1\162\1\170\2\uffff\1\160\1\145\1\uffff\1\115\1\60\2\156\1\uffff\2\162\1\60\1\141\1\uffff\1\154\1\162\2\145\2\uffff\1\145\1\162\1\105\1\141\1\122\1\163\1\60\1\170\1\uffff\1\156\1\162\1\60\1\165\1\60\1\151\1\164\2\170\1\60\1\171\1\145\1\uffff\1\164\2\60\1\114\1\uffff\2\60\1\147\1\156\1\60\1\160\1\105\1\160\1\146\1\105\2\144\2\154\1\156\1\141\1\151\1\160\1\60\1\164\1\145\1\uffff\2\164\1\60\1\141\1\162\1\uffff\1\162\1\165\1\105\2\60\1\104\1\155\1\170\1\162\1\145\1\164\1\uffff\1\160\2\60\1\uffff\1\145\1\60\1\uffff\1\164\1\145\2\160\1\uffff\1\60\1\143\1\60\2\uffff\1\151\2\uffff\1\145\1\164\1\151\1\uffff\1\162\1\170\2\105\1\170\1\105\1\151\2\141\1\164\1\141\1\162\1\155\1\162\1\uffff\1\150\1\164\2\145\1\60\1\uffff\1\155\1\120\1\141\1\145\1\170\2\uffff\1\145\1\60\1\160\1\153\1\160\2\60\2\uffff\1\60\1\uffff\1\151\1\162\2\60\1\uffff\1\154\1\uffff\1\163\2\60\1\163\1\145\1\160\2\170\1\160\1\170\2\164\2\151\1\162\1\171\1\141\1\60\1\157\1\150\2\162\1\uffff\1\60\1\141\1\155\1\60\1\160\1\143\1\uffff\2\60\1\145\3\uffff\1\157\1\60\1\uffff\1\145\1\uffff\1\60\1\164\2\uffff\1\164\1\163\1\162\2\160\1\162\1\160\2\151\1\156\1\160\1\171\1\105\1\162\1\163\1\uffff\1\144\1\157\2\60\1\151\1\uffff\1\164\1\163\1\uffff\1\162\1\154\2\uffff\1\164\1\156\1\uffff\1\143\1\uffff\2\60\1\163\1\60\2\162\1\60\1\162\1\166\1\157\1\144\1\154\1\105\1\170\1\171\1\163\1\60\1\144\2\uffff\1\163\1\164\3\60\1\151\1\60\1\154\2\uffff\1\151\1\uffff\2\60\1\uffff\1\60\1\145\1\156\1\145\1\151\1\170\1\160\1\105\1\151\1\uffff\1\60\1\164\1\145\3\uffff\1\164\1\uffff\1\60\1\157\3\uffff\1\105\1\141\1\162\1\143\1\160\1\162\1\170\1\157\1\uffff\1\60\1\162\1\151\1\uffff\1\156\1\170\1\154\1\105\1\141\1\162\1\60\1\160\1\156\1\uffff\1\156\1\157\1\60\1\160\1\105\1\170\1\164\1\60\1\uffff\1\162\1\60\1\122\1\156\1\uffff\1\162\1\170\1\160\1\151\1\uffff\1\60\1\uffff\1\145\2\60\1\160\1\162\1\166\1\uffff\1\146\2\uffff\1\162\1\60\2\145\1\60\1\uffff\1\105\1\162\1\uffff\1\170\1\162\1\160\1\141\1\162\1\142\1\60\1\154\1\uffff\1\145\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\uffff\1\156\2\uffff\1\170\1\155\1\157\1\145\1\157\1\141\1\157\1\141\1\154\2\171\1\157\1\166\1\156\1\151\1\165\2\162\1\165\1\157\1\124\1\130\1\uffff\1\145\2\165\1\162\1\157\1\145\1\164\1\165\1\157\1\165\1\141\1\156\1\125\1\105\1\101\1\172\2\uffff\2\uffff\1\57\2\uffff\1\156\1\104\2\uffff\1\160\1\164\2\uffff\1\145\2\160\1\146\1\160\1\146\1\155\1\151\1\147\1\164\1\155\1\162\1\146\2\155\1\162\1\156\1\145\1\160\1\155\1\151\1\160\1\155\1\151\2\145\1\172\1\165\1\145\1\172\1\144\1\156\1\163\1\147\1\146\1\141\1\155\1\142\1\164\1\145\1\162\1\145\1\151\1\165\1\163\1\157\1\114\1\107\1\126\1\uffff\1\146\1\141\1\154\1\157\1\156\1\147\1\163\1\151\1\114\1\142\1\172\1\123\1\157\1\156\1\145\1\166\1\141\1\130\1\105\1\114\5\uffff\1\145\1\151\1\125\1\157\1\164\1\120\1\145\1\172\1\145\1\155\1\164\1\172\1\143\1\145\1\157\1\154\1\151\1\141\1\147\1\141\1\172\1\145\2\172\1\151\1\120\1\141\1\145\1\172\1\165\1\144\2\145\1\160\1\147\1\145\1\160\1\147\2\172\1\145\1\uffff\1\156\1\163\1\160\2\162\1\uffff\1\145\1\147\2\145\1\105\1\150\1\145\1\164\1\160\1\162\1\164\1\144\1\141\1\144\1\156\1\163\1\164\1\171\1\154\1\107\1\141\1\172\1\164\1\156\1\164\1\155\1\163\1\160\1\145\1\105\1\162\1\164\1\145\1\162\1\145\1\172\1\154\1\141\1\163\1\145\1\162\1\172\1\120\1\123\1\154\1\164\1\114\1\162\2\151\1\162\1\170\1\147\1\uffff\1\162\1\145\1\171\1\uffff\1\164\1\143\1\162\1\172\1\156\1\151\1\150\1\164\1\uffff\1\172\1\145\1\uffff\1\145\1\uffff\1\156\1\162\1\151\1\156\1\145\1\171\1\uffff\1\145\1\172\1\156\1\144\1\157\1\147\1\172\1\157\1\172\2\uffff\1\146\2\164\1\122\1\146\1\141\1\162\1\145\1\164\3\170\2\164\1\145\1\154\1\172\1\145\1\151\1\155\1\120\1\164\1\172\1\151\1\172\1\145\1\141\1\163\1\162\1\uffff\1\172\1\164\1\151\1\172\1\164\1\172\1\162\1\170\1\164\1\150\2\141\1\104\1\uffff\1\145\1\162\1\164\1\122\1\171\1\uffff\1\172\1\105\1\172\1\157\1\117\1\164\1\143\1\141\1\157\2\145\1\172\1\145\1\101\1\156\1\172\1\122\2\164\1\uffff\1\145\1\156\1\164\1\151\1\uffff\1\172\1\143\1\151\1\145\1\156\1\163\1\143\1\160\1\111\1\172\1\uffff\2\145\1\157\1\120\1\162\1\145\1\uffff\1\162\1\uffff\1\151\1\145\1\141\1\145\1\154\1\164\1\146\1\172\1\120\3\160\1\172\1\171\1\111\1\145\1\uffff\1\162\1\143\1\163\1\141\1\145\1\uffff\1\143\1\uffff\1\141\1\162\1\155\1\172\1\uffff\1\151\1\172\1\145\1\uffff\1\172\1\uffff\1\162\1\160\1\172\1\105\1\163\1\156\1\145\1\141\1\171\1\151\1\170\1\164\1\141\1\122\1\uffff\1\172\1\uffff\1\162\1\172\1\163\1\141\1\154\1\151\1\147\1\144\1\uffff\2\162\1\164\1\uffff\1\145\1\122\2\172\1\126\1\104\1\166\1\172\1\uffff\1\154\1\164\1\122\1\144\1\126\1\151\1\154\1\145\1\156\1\uffff\1\144\1\146\1\156\2\141\1\162\1\141\1\156\1\162\1\156\1\147\2\157\1\154\1\uffff\1\162\2\172\1\162\1\uffff\1\172\1\156\1\105\1\156\1\141\1\172\1\164\1\162\1\145\1\156\2\172\1\uffff\1\146\1\uffff\1\146\1\uffff\1\141\1\172\1\uffff\1\170\1\164\1\147\1\146\1\156\1\122\1\157\1\141\1\114\1\156\1\145\1\uffff\1\172\1\uffff\1\172\1\122\1\164\1\172\1\156\1\105\1\172\1\126\1\162\1\163\1\160\1\157\1\145\1\uffff\2\145\1\162\1\uffff\1\141\2\145\1\uffff\1\114\2\151\1\145\1\172\1\141\1\171\1\157\2\172\1\122\2\172\1\163\1\162\1\154\1\172\1\154\1\145\1\172\1\164\1\105\1\167\1\162\1\157\1\145\1\157\1\uffff\1\157\1\uffff\1\172\1\uffff\1\166\1\170\1\172\1\164\1\uffff\1\164\2\172\1\126\2\uffff\2\151\1\142\1\uffff\1\160\1\172\1\145\1\151\1\124\1\145\1\156\1\143\1\145\2\147\2\uffff\1\111\1\151\1\uffff\1\164\1\170\1\uffff\2\141\1\172\1\145\1\151\2\147\1\143\2\162\1\146\1\172\1\151\1\157\1\163\1\147\1\uffff\1\162\1\160\1\156\2\uffff\1\141\2\uffff\1\164\1\141\1\125\1\uffff\1\105\1\172\1\uffff\1\172\1\170\1\115\1\172\1\167\1\144\2\151\1\uffff\1\172\1\160\1\141\1\uffff\1\145\1\172\2\uffff\1\141\1\145\1\156\1\154\1\172\1\uffff\1\172\1\156\1\145\1\147\1\115\1\164\1\141\1\145\1\105\1\172\1\157\1\145\1\160\1\154\1\171\1\uffff\1\164\1\156\2\105\1\154\1\141\1\104\1\172\1\uffff\1\163\1\156\1\164\1\163\1\172\1\145\1\163\1\156\1\141\1\155\1\170\1\156\1\162\1\156\1\145\1\165\1\151\1\156\1\162\1\170\2\uffff\1\160\1\145\1\uffff\1\115\1\172\2\156\1\uffff\2\162\1\172\1\141\1\uffff\1\154\1\162\2\145\2\uffff\1\145\1\162\1\105\1\141\1\122\1\163\1\172\1\170\1\uffff\1\156\1\162\1\172\1\165\1\172\1\151\1\164\2\170\1\172\1\171\1\145\1\uffff\1\164\2\172\1\114\1\uffff\2\172\1\147\1\156\1\172\1\160\1\105\1\160\1\146\1\105\2\144\1\155\1\154\1\156\1\141\1\151\1\160\1\172\1\164\1\145\1\uffff\2\164\1\172\1\141\1\162\1\uffff\1\162\1\165\1\105\2\172\1\104\1\155\1\170\1\162\1\145\1\164\1\uffff\1\160\2\172\1\uffff\1\145\1\172\1\uffff\1\164\1\145\2\160\1\uffff\1\172\1\143\1\172\2\uffff\1\151\2\uffff\1\145\1\164\1\151\1\uffff\1\162\1\170\2\105\1\170\1\105\1\151\2\141\1\164\1\141\1\162\1\155\1\162\1\uffff\1\150\1\164\2\145\1\172\1\uffff\1\155\1\120\1\141\1\145\1\170\2\uffff\1\145\1\172\1\160\1\153\1\160\2\172\2\uffff\1\172\1\uffff\1\151\1\162\2\172\1\uffff\1\154\1\uffff\1\163\2\172\1\163\1\145\1\160\2\170\1\160\1\170\2\164\2\151\1\162\1\171\1\141\1\172\1\157\1\150\2\162\1\uffff\1\172\1\141\1\155\1\172\1\160\1\143\1\uffff\2\172\1\145\3\uffff\1\157\1\172\1\uffff\1\145\1\uffff\1\172\1\164\2\uffff\1\164\1\163\1\162\2\160\1\162\1\160\2\151\1\156\1\160\1\171\1\105\1\162\1\163\1\uffff\1\144\1\157\2\172\1\151\1\uffff\1\164\1\163\1\uffff\1\162\1\154\2\uffff\1\164\1\156\1\uffff\1\143\1\uffff\2\172\1\163\1\172\2\162\1\172\1\162\1\166\1\157\1\144\1\154\1\105\1\170\1\171\1\163\1\172\1\144\2\uffff\1\163\1\164\3\172\1\151\1\172\1\154\2\uffff\1\151\1\uffff\2\172\1\uffff\1\172\1\145\1\156\1\145\1\151\1\170\1\160\1\105\1\151\1\uffff\1\172\1\164\1\145\3\uffff\1\164\1\uffff\1\172\1\157\3\uffff\1\105\1\141\1\162\1\143\1\160\1\162\1\170\1\157\1\uffff\1\172\1\162\1\151\1\uffff\1\156\1\170\1\154\1\105\1\141\1\162\1\172\1\160\1\156\1\uffff\1\156\1\157\1\172\1\160\1\105\1\170\1\164\1\172\1\uffff\1\162\1\172\1\122\1\156\1\uffff\1\162\1\170\1\160\1\151\1\uffff\1\172\1\uffff\1\145\2\172\1\160\1\162\1\166\1\uffff\1\146\2\uffff\1\162\1\172\2\145\1\172\1\uffff\1\105\1\162\1\uffff\1\170\1\162\1\160\1\141\1\162\1\142\1\172\1\154\1\uffff\1\145\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\26\uffff\1\57\20\uffff\1\u0091\1\u0092\3\uffff\1\u0096\1\u0097\2\uffff\1\u0091\1\2\2\uffff\1\4\1\5\61\uffff\1\57\24\uffff\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\51\uffff\1\126\5\uffff\1\166\65\uffff\1\124\3\uffff\1\140\10\uffff\1\61\2\uffff\1\135\1\uffff\1\20\6\uffff\1\16\11\uffff\1\103\1\111\35\uffff\1\u008c\15\uffff\1\u008b\5\uffff\1\u008d\23\uffff\1\11\4\uffff\1\156\12\uffff\1\17\6\uffff\1\22\1\uffff\1\52\20\uffff\1\153\5\uffff\1\171\1\uffff\1\47\4\uffff\1\64\3\uffff\1\125\1\uffff\1\u0083\16\uffff\1\u008e\1\uffff\1\1\10\uffff\1\112\3\uffff\1\133\10\uffff\1\14\11\uffff\1\102\16\uffff\1\32\4\uffff\1\74\14\uffff\1\54\1\uffff\1\122\1\uffff\1\127\2\uffff\1\136\13\uffff\1\u008f\1\uffff\1\u0090\15\uffff\1\7\3\uffff\1\23\3\uffff\1\65\33\uffff\1\56\1\uffff\1\114\1\uffff\1\40\4\uffff\1\43\4\uffff\1\50\1\53\3\uffff\1\134\13\uffff\1\37\1\3\2\uffff\1\33\2\uffff\1\35\20\uffff\1\36\3\uffff\1\141\1\152\1\uffff\1\167\1\21\3\uffff\1\u0086\2\uffff\1\27\10\uffff\1\164\3\uffff\1\42\2\uffff\1\106\1\45\5\uffff\1\177\17\uffff\1\6\10\uffff\1\13\24\uffff\1\u0081\1\115\2\uffff\1\63\4\uffff\1\41\4\uffff\1\105\4\uffff\1\157\1\154\10\uffff\1\10\14\uffff\1\12\4\uffff\1\121\25\uffff\1\34\5\uffff\1\46\13\uffff\1\174\3\uffff\1\u0089\2\uffff\1\145\4\uffff\1\142\3\uffff\1\15\1\24\1\uffff\1\151\1\144\3\uffff\1\147\16\uffff\1\u0082\5\uffff\1\143\5\uffff\1\u0080\1\132\7\uffff\1\67\1\u0087\1\uffff\1\162\4\uffff\1\160\1\uffff\1\44\26\uffff\1\161\6\uffff\1\163\3\uffff\1\173\1\175\1\117\2\uffff\1\u008a\1\uffff\1\25\2\uffff\1\123\1\130\17\uffff\1\51\5\uffff\1\146\2\uffff\1\116\2\uffff\1\165\1\170\2\uffff\1\u0088\1\uffff\1\150\22\uffff\1\55\1\107\10\uffff\1\26\1\u0085\1\uffff\1\62\2\uffff\1\71\11\uffff\1\30\3\uffff\1\110\1\120\1\155\1\uffff\1\176\2\uffff\1\66\1\70\1\72\10\uffff\1\31\3\uffff\1\137\11\uffff\1\u0084\10\uffff\1\101\4\uffff\1\60\4\uffff\1\100\1\uffff\1\113\6\uffff\1\104\1\uffff\1\172\1\76\5\uffff\1\75\2\uffff\1\73\10\uffff\1\77\2\uffff\1\131";
    static final String DFA12_specialS =
        "\1\0\56\uffff\1\1\1\2\u03f8\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\63\2\62\2\63\1\62\22\63\1\62\1\63\1\57\4\63\1\60\4\63\1\4\1\34\1\63\1\61\12\56\7\63\1\51\1\45\1\21\1\10\1\33\1\53\2\55\1\7\1\55\1\52\1\32\1\1\2\55\1\26\1\36\1\42\1\44\1\17\1\50\1\15\1\11\3\55\3\63\1\54\1\55\1\63\1\43\1\31\1\41\1\14\1\6\1\40\1\55\1\47\1\3\1\30\1\16\1\35\1\37\1\12\1\22\1\27\1\46\1\24\1\25\1\20\1\23\1\13\4\55\1\2\1\63\1\5\uff82\63",
            "\1\65\37\uffff\1\64",
            "",
            "\1\70\1\71",
            "",
            "",
            "\1\77\5\uffff\1\74\1\75\12\uffff\1\76",
            "\1\100",
            "\1\101\11\uffff\1\102",
            "\1\103",
            "\1\106\3\uffff\1\104\11\uffff\1\105",
            "\1\107",
            "\1\110\3\uffff\1\112\5\uffff\1\111",
            "\1\113",
            "\1\114\2\uffff\1\115",
            "\1\117\14\uffff\1\120\6\uffff\1\116",
            "\1\122\11\uffff\1\126\1\125\1\uffff\1\123\2\uffff\1\124\3\uffff\1\121",
            "\1\127",
            "\1\131\5\uffff\1\130",
            "\1\132",
            "\1\133\3\uffff\1\134\3\uffff\1\135",
            "\1\136\7\uffff\1\140\12\uffff\1\137\1\141",
            "\1\142\20\uffff\1\143",
            "\1\144\12\uffff\1\147\2\uffff\1\146\2\uffff\1\145",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\154\11\uffff\1\153",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\165\1\164\1\166",
            "\1\171\17\uffff\1\170\13\uffff\1\167",
            "\1\173\5\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\0\u0083",
            "\0\u0083",
            "\1\u0084\4\uffff\1\u0085",
            "",
            "",
            "\1\u0087\11\uffff\1\u0088",
            "\1\u0089",
            "",
            "",
            "\1\u008a",
            "\1\u008c\1\u008d\4\uffff\1\u008b\4\uffff\1\u008f\5\uffff\1\u008e",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0093\16\uffff\1\u0092",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\2\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d\5\uffff\1\u009e",
            "\1\u00a0\2\uffff\1\u009f",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a4\5\uffff\1\u00a3",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\66\7\uffff\3\66\1\u00af\26\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00b3\1\u00b2\6\uffff\1\u00b1",
            "\1\u00b4",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00b5\25\66",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00ba\4\uffff\1\u00bb\6\uffff\1\u00b9",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8\12\uffff\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d2\1\u00d1",
            "\1\u00d3\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e7\2\uffff\1\u00e6",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00eb\25\66",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00fa",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u00fb\5\66",
            "\12\66\7\uffff\3\66\1\u00fd\26\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\12\66\7\uffff\3\66\1\u0103\17\66\1\u0104\6\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0111",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a\37\uffff\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
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
            "\1\u012c\5\uffff\1\u012b",
            "\1\u012d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014b\1\uffff\1\u014c\26\uffff\1\u014a",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u015c",
            "",
            "\1\u015d",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "",
            "\1\u0164",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u0165\7\66",
            "\1\u0167",
            "\1\u0169\1\u0168\37\uffff\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u016e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0187",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u018e",
            "\1\u018f",
            "\12\66\7\uffff\3\66\1\u0190\26\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0192",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019f\3\uffff\1\u019e\14\uffff\1\u01a0",
            "\1\u01a1",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01a3",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u01b9\7\66",
            "\1\u01bb",
            "\1\u01bd\3\uffff\1\u01bc",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "",
            "\1\u01cb",
            "",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "",
            "\1\u01e1",
            "",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01e6",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01e8",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01ea",
            "\1\u01eb",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01f9",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01fc\35\uffff\1\u01fb",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "",
            "\1\u0205",
            "\1\u0206\1\uffff\1\u0207",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\1\u020b\2\66\1\u020a\15\66\1\u0209\10\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213\5\uffff\1\u0214",
            "\1\u0215",
            "\1\u0217\1\uffff\1\u0216",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "",
            "\1\u022a",
            "\12\66\7\uffff\17\66\1\u022b\12\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\17\66\1\u022d\12\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u022f",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u023c",
            "",
            "\1\u023d",
            "",
            "\1\u023e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u024d",
            "\1\u024e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0250",
            "\1\u0251",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0269",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0270",
            "\1\u0271",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "",
            "\1\u027a",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u027c",
            "\1\u027d",
            "\12\66\7\uffff\17\66\1\u027e\12\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0280",
            "",
            "\1\u0281",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0284",
            "",
            "",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "",
            "\1\u0288",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "",
            "",
            "\1\u0293",
            "\1\u0294",
            "",
            "\1\u0295",
            "\1\u0296",
            "",
            "\1\u0297",
            "\1\u0298",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "",
            "",
            "\1\u02aa",
            "",
            "",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02b0\1\u02b3\2\uffff\1\u02ad\3\uffff\1\u02ae\3\uffff\1\u02b2\1\uffff\1\u02af\1\u02b5\1\uffff\1\u02b1\2\uffff\1\u02b4",
            "",
            "\1\u02b6",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02b9",
            "\1\u02ba",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02c1",
            "\1\u02c2",
            "",
            "\1\u02c3",
            "\12\66\7\uffff\17\66\1\u02c4\12\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ef\6\uffff\1\u02ee\1\u02ed",
            "\1\u02f0",
            "\1\u02f2\11\uffff\1\u02f1",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "",
            "",
            "\1\u02f9",
            "\1\u02fa",
            "",
            "\1\u02fb",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02fd",
            "\1\u02fe",
            "",
            "\1\u02ff",
            "\1\u0300",
            "\12\66\7\uffff\16\66\1\u0301\13\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0303",
            "",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "",
            "",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u030f",
            "",
            "\1\u0310",
            "\1\u0311",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0313",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u0314\7\66",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u031b",
            "\1\u031c",
            "",
            "\1\u031d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0320",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0323",
            "\1\u0324",
            "\12\66\7\uffff\13\66\1\u0325\16\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0336",
            "\1\u0337",
            "",
            "\1\u0338",
            "\1\u0339",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u033a\7\66",
            "\1\u033c",
            "\1\u033d",
            "",
            "\1\u033e",
            "\1\u033f",
            "\1\u0340",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\1\u0348",
            "",
            "\1\u0349",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u034c",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u034e",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0353",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u0355",
            "",
            "",
            "\1\u0356",
            "\1\u0357",
            "\1\u0358",
            "",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "\1\u0364",
            "\1\u0365",
            "\1\u0366",
            "",
            "\1\u0367",
            "\1\u0368",
            "\1\u0369",
            "\1\u036a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u036c",
            "\1\u036d",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "",
            "",
            "\1\u0371",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0379",
            "\1\u037a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\3\66\1\u037c\26\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u037e",
            "",
            "\1\u037f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\1\u0387",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "\1\u038d",
            "\1\u038e",
            "\1\u038f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0390\25\66",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0395",
            "",
            "\12\66\7\uffff\13\66\1\u0396\16\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0398",
            "\1\u0399",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u039b",
            "\1\u039c",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u039f",
            "",
            "",
            "",
            "\1\u03a0",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u03a2",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03a4",
            "",
            "",
            "\1\u03a5",
            "\1\u03a6",
            "\1\u03a7",
            "\1\u03a8",
            "\1\u03a9",
            "\1\u03aa",
            "\1\u03ab",
            "\1\u03ac",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "\1\u03b0",
            "\1\u03b1",
            "\1\u03b2",
            "\1\u03b3",
            "",
            "\1\u03b4",
            "\1\u03b5",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03b8",
            "",
            "\1\u03b9",
            "\1\u03ba",
            "",
            "\1\u03bb",
            "\1\u03bc",
            "",
            "",
            "\1\u03bd",
            "\1\u03be",
            "",
            "\1\u03bf",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03c2",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03c4",
            "\1\u03c5",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03c7",
            "\1\u03c8",
            "\1\u03c9",
            "\1\u03ca",
            "\1\u03cb",
            "\1\u03cc",
            "\1\u03cd",
            "\1\u03ce",
            "\1\u03cf",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03d1",
            "",
            "",
            "\1\u03d2",
            "\1\u03d3",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03d7",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03d9",
            "",
            "",
            "\1\u03da",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03de",
            "\1\u03df",
            "\1\u03e0",
            "\1\u03e1",
            "\1\u03e2",
            "\1\u03e3",
            "\1\u03e4",
            "\1\u03e5",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03e7",
            "\1\u03e8",
            "",
            "",
            "",
            "\1\u03e9",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03eb",
            "",
            "",
            "",
            "\1\u03ec",
            "\1\u03ed",
            "\1\u03ee",
            "\1\u03ef",
            "\1\u03f0",
            "\1\u03f1",
            "\1\u03f2",
            "\1\u03f3",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03f5",
            "\1\u03f6",
            "",
            "\1\u03f7",
            "\1\u03f8",
            "\1\u03f9",
            "\1\u03fa",
            "\1\u03fb",
            "\1\u03fc",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03fe",
            "\1\u03ff",
            "",
            "\1\u0400",
            "\1\u0401",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0403",
            "\1\u0404",
            "\1\u0405",
            "\1\u0406",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0408",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u040a",
            "\1\u040b",
            "",
            "\1\u040c",
            "\1\u040d",
            "\1\u040e",
            "\1\u040f",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0411",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0414",
            "\1\u0415",
            "\1\u0416",
            "",
            "\1\u0417",
            "",
            "",
            "\1\u0418",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u041a",
            "\1\u041b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u041d",
            "\1\u041e",
            "",
            "\1\u041f",
            "\1\u0420",
            "\1\u0421",
            "\1\u0422",
            "\1\u0423",
            "\1\u0424",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0426",
            "",
            "\1\u0427",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='M') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='i') ) {s = 3;}

                        else if ( (LA12_0==',') ) {s = 4;}

                        else if ( (LA12_0=='}') ) {s = 5;}

                        else if ( (LA12_0=='e') ) {s = 6;}

                        else if ( (LA12_0=='I') ) {s = 7;}

                        else if ( (LA12_0=='D') ) {s = 8;}

                        else if ( (LA12_0=='W') ) {s = 9;}

                        else if ( (LA12_0=='n') ) {s = 10;}

                        else if ( (LA12_0=='v') ) {s = 11;}

                        else if ( (LA12_0=='d') ) {s = 12;}

                        else if ( (LA12_0=='V') ) {s = 13;}

                        else if ( (LA12_0=='k') ) {s = 14;}

                        else if ( (LA12_0=='T') ) {s = 15;}

                        else if ( (LA12_0=='t') ) {s = 16;}

                        else if ( (LA12_0=='C') ) {s = 17;}

                        else if ( (LA12_0=='o') ) {s = 18;}

                        else if ( (LA12_0=='u') ) {s = 19;}

                        else if ( (LA12_0=='r') ) {s = 20;}

                        else if ( (LA12_0=='s') ) {s = 21;}

                        else if ( (LA12_0=='P') ) {s = 22;}

                        else if ( (LA12_0=='p') ) {s = 23;}

                        else if ( (LA12_0=='j') ) {s = 24;}

                        else if ( (LA12_0=='b') ) {s = 25;}

                        else if ( (LA12_0=='L') ) {s = 26;}

                        else if ( (LA12_0=='E') ) {s = 27;}

                        else if ( (LA12_0=='-') ) {s = 28;}

                        else if ( (LA12_0=='l') ) {s = 29;}

                        else if ( (LA12_0=='Q') ) {s = 30;}

                        else if ( (LA12_0=='m') ) {s = 31;}

                        else if ( (LA12_0=='f') ) {s = 32;}

                        else if ( (LA12_0=='c') ) {s = 33;}

                        else if ( (LA12_0=='R') ) {s = 34;}

                        else if ( (LA12_0=='a') ) {s = 35;}

                        else if ( (LA12_0=='S') ) {s = 36;}

                        else if ( (LA12_0=='B') ) {s = 37;}

                        else if ( (LA12_0=='q') ) {s = 38;}

                        else if ( (LA12_0=='h') ) {s = 39;}

                        else if ( (LA12_0=='U') ) {s = 40;}

                        else if ( (LA12_0=='A') ) {s = 41;}

                        else if ( (LA12_0=='K') ) {s = 42;}

                        else if ( (LA12_0=='F') ) {s = 43;}

                        else if ( (LA12_0=='^') ) {s = 44;}

                        else if ( ((LA12_0>='G' && LA12_0<='H')||LA12_0=='J'||(LA12_0>='N' && LA12_0<='O')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='g'||(LA12_0>='w' && LA12_0<='z')) ) {s = 45;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 46;}

                        else if ( (LA12_0=='\"') ) {s = 47;}

                        else if ( (LA12_0=='\'') ) {s = 48;}

                        else if ( (LA12_0=='/') ) {s = 49;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 50;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0=='.'||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_47 = input.LA(1);

                        s = -1;
                        if ( ((LA12_47>='\u0000' && LA12_47<='\uFFFF')) ) {s = 131;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_48 = input.LA(1);

                        s = -1;
                        if ( ((LA12_48>='\u0000' && LA12_48<='\uFFFF')) ) {s = 131;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}