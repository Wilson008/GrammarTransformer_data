package org.xtext.example.myspectra.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.myspectra.services.MySpectraGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMySpectraParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'imports'", "','", "'}'", "'elements'", "'Import'", "'importURI'", "'Decl'", "'WeightDef'", "'negative'", "'value'", "'definition'", "'Var'", "'kind'", "'var'", "'TypeDef'", "'type'", "'Define'", "'defineList'", "'DefineRegExp'", "'defineRegsList'", "'Counter'", "'overflowMethod'", "'underflowMethod'", "'range'", "'initial'", "'resetPred'", "'incPred'", "'decPred'", "'Monitor'", "'safety'", "'stateInv'", "'Pattern'", "'params'", "'varDeclList'", "'justice'", "'Predicate'", "'body'", "'LTLGar'", "'temporalExpr'", "'trig'", "'LTLAsm'", "'EXGar'", "'regExpPointer'", "'regExp'", "'-'", "'TemporalExpression'", "'not'", "'TemporalInExpr'", "'operator'", "'left'", "'values'", "'TemporalImpExpr'", "'implication'", "'TemporalIffExpr'", "'TemporalOrExpr'", "'TemporalAndExpr'", "'TemporalRelationalExpr'", "'right'", "'TemporalRemainderExpr'", "'TemporalAdditiveExpr'", "'TemporalMultiplicativeExpr'", "'TemporalBinaryExpr'", "'TemporalUnaryExpr'", "'kinds'", "'tue'", "'TemporalPrimaryExpr'", "'predPatt'", "'pointer'", "'regexpPointer'", "'predPattParams'", "'tpe'", "'index'", "'temporalExpression'", "'regexp'", "'Constant'", "'booleanValue'", "'integerValue'", "'QuantifierExpr'", "'domainVar'", "'multi'", "'ValueInRange'", "'int'", "'from'", "'to'", "'const'", "'TypeConstant'", "'PredicateOrPatternReferrable'", "'Referrable'", "'empty'", "'RegExp'", "'val'", "'assrt'", "'DefineRegExpDecl'", "'exp'", "'VarDecl'", "'DefineDecl'", "'simpleExpr'", "'dimensions'", "'innerArray'", "'PatternParam'", "'TypedParam'", "'DomainVarDecl'", "'domainType'", "'VarType'", "'subr'", "'Subrange'", "'SizeDefineDecl'", "'name'", "'arithExp'", "'DefineArray'", "'simpleExprs'", "'innerArrays'", "'BooleanTerm'", "'relExpr'", "'BinaryRegExp'", "'op'", "'kleened'", "'questionMark'", "'plus'", "'haveExactRepetition'", "'haveAtLeast'", "'haveRange'", "'UnaryRegExp'", "'exactRepetition'", "'atLeast'", "'fromDefine'", "'toDefine'", "'CompRegExp'", "'comp'", "'PatternParamList'", "'TypedParamList'", "'Trigger'", "'initPointer'", "'effectPointer'", "'initRegExp'", "'effectRegExp'", "'SYS'", "'ENV'", "'AUX'", "'KEEP'", "'FALSE'", "'MODULO'"
    };
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


        public InternalMySpectraParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMySpectraParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMySpectraParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMySpectra.g"; }



     	private MySpectraGrammarAccess grammarAccess;

        public InternalMySpectraParser(TokenStream input, MySpectraGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MySpectraGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMySpectra.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMySpectra.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMySpectra.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMySpectra.g:72:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'imports' otherlv_5= '{' ( (lv_imports_6_0= ruleImport ) ) (otherlv_7= ',' ( (lv_imports_8_0= ruleImport ) ) )* otherlv_9= '}' )? (otherlv_10= 'elements' otherlv_11= '{' ( (lv_elements_12_0= ruleDecl ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleDecl ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_6_0 = null;

        EObject lv_imports_8_0 = null;

        EObject lv_elements_12_0 = null;

        EObject lv_elements_14_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:78:2: ( ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'imports' otherlv_5= '{' ( (lv_imports_6_0= ruleImport ) ) (otherlv_7= ',' ( (lv_imports_8_0= ruleImport ) ) )* otherlv_9= '}' )? (otherlv_10= 'elements' otherlv_11= '{' ( (lv_elements_12_0= ruleDecl ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleDecl ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMySpectra.g:79:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'imports' otherlv_5= '{' ( (lv_imports_6_0= ruleImport ) ) (otherlv_7= ',' ( (lv_imports_8_0= ruleImport ) ) )* otherlv_9= '}' )? (otherlv_10= 'elements' otherlv_11= '{' ( (lv_elements_12_0= ruleDecl ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleDecl ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMySpectra.g:79:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'imports' otherlv_5= '{' ( (lv_imports_6_0= ruleImport ) ) (otherlv_7= ',' ( (lv_imports_8_0= ruleImport ) ) )* otherlv_9= '}' )? (otherlv_10= 'elements' otherlv_11= '{' ( (lv_elements_12_0= ruleDecl ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleDecl ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMySpectra.g:80:3: () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'imports' otherlv_5= '{' ( (lv_imports_6_0= ruleImport ) ) (otherlv_7= ',' ( (lv_imports_8_0= ruleImport ) ) )* otherlv_9= '}' )? (otherlv_10= 'elements' otherlv_11= '{' ( (lv_elements_12_0= ruleDecl ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleDecl ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalMySpectra.g:80:3: ()
            // InternalMySpectra.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            // InternalMySpectra.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:92:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:114:3: (otherlv_4= 'imports' otherlv_5= '{' ( (lv_imports_6_0= ruleImport ) ) (otherlv_7= ',' ( (lv_imports_8_0= ruleImport ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMySpectra.g:115:4: otherlv_4= 'imports' otherlv_5= '{' ( (lv_imports_6_0= ruleImport ) ) (otherlv_7= ',' ( (lv_imports_8_0= ruleImport ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getImportsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMySpectra.g:123:4: ( (lv_imports_6_0= ruleImport ) )
                    // InternalMySpectra.g:124:5: (lv_imports_6_0= ruleImport )
                    {
                    // InternalMySpectra.g:124:5: (lv_imports_6_0= ruleImport )
                    // InternalMySpectra.g:125:6: lv_imports_6_0= ruleImport
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_imports_6_0=ruleImport();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_6_0,
                    							"org.xtext.example.myspectra.MySpectra.Import");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:142:4: (otherlv_7= ',' ( (lv_imports_8_0= ruleImport ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMySpectra.g:143:5: otherlv_7= ',' ( (lv_imports_8_0= ruleImport ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMySpectra.g:147:5: ( (lv_imports_8_0= ruleImport ) )
                    	    // InternalMySpectra.g:148:6: (lv_imports_8_0= ruleImport )
                    	    {
                    	    // InternalMySpectra.g:148:6: (lv_imports_8_0= ruleImport )
                    	    // InternalMySpectra.g:149:7: lv_imports_8_0= ruleImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_imports_8_0=ruleImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"imports",
                    	    								lv_imports_8_0,
                    	    								"org.xtext.example.myspectra.MySpectra.Import");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:172:3: (otherlv_10= 'elements' otherlv_11= '{' ( (lv_elements_12_0= ruleDecl ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleDecl ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMySpectra.g:173:4: otherlv_10= 'elements' otherlv_11= '{' ( (lv_elements_12_0= ruleDecl ) ) (otherlv_13= ',' ( (lv_elements_14_0= ruleDecl ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getElementsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMySpectra.g:181:4: ( (lv_elements_12_0= ruleDecl ) )
                    // InternalMySpectra.g:182:5: (lv_elements_12_0= ruleDecl )
                    {
                    // InternalMySpectra.g:182:5: (lv_elements_12_0= ruleDecl )
                    // InternalMySpectra.g:183:6: lv_elements_12_0= ruleDecl
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getElementsDeclParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elements_12_0=ruleDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_12_0,
                    							"org.xtext.example.myspectra.MySpectra.Decl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:200:4: (otherlv_13= ',' ( (lv_elements_14_0= ruleDecl ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMySpectra.g:201:5: otherlv_13= ',' ( (lv_elements_14_0= ruleDecl ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMySpectra.g:205:5: ( (lv_elements_14_0= ruleDecl ) )
                    	    // InternalMySpectra.g:206:6: (lv_elements_14_0= ruleDecl )
                    	    {
                    	    // InternalMySpectra.g:206:6: (lv_elements_14_0= ruleDecl )
                    	    // InternalMySpectra.g:207:7: lv_elements_14_0= ruleDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelAccess().getElementsDeclParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_14_0=ruleDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_14_0,
                    	    								"org.xtext.example.myspectra.MySpectra.Decl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDecl"
    // InternalMySpectra.g:238:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalMySpectra.g:238:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalMySpectra.g:239:2: iv_ruleDecl= ruleDecl EOF
            {
             newCompositeNode(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecl=ruleDecl();

            state._fsp--;

             current =iv_ruleDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalMySpectra.g:245:1: ruleDecl returns [EObject current=null] : (this_Decl_Impl_0= ruleDecl_Impl | this_WeightDef_1= ruleWeightDef | this_Var_2= ruleVar | this_TypeDef_3= ruleTypeDef | this_Define_4= ruleDefine | this_DefineRegExp_5= ruleDefineRegExp | this_Counter_6= ruleCounter | this_Monitor_7= ruleMonitor | this_Pattern_8= rulePattern | this_Predicate_9= rulePredicate | this_LTLGar_10= ruleLTLGar | this_LTLAsm_11= ruleLTLAsm | this_EXGar_12= ruleEXGar ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Decl_Impl_0 = null;

        EObject this_WeightDef_1 = null;

        EObject this_Var_2 = null;

        EObject this_TypeDef_3 = null;

        EObject this_Define_4 = null;

        EObject this_DefineRegExp_5 = null;

        EObject this_Counter_6 = null;

        EObject this_Monitor_7 = null;

        EObject this_Pattern_8 = null;

        EObject this_Predicate_9 = null;

        EObject this_LTLGar_10 = null;

        EObject this_LTLAsm_11 = null;

        EObject this_EXGar_12 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:251:2: ( (this_Decl_Impl_0= ruleDecl_Impl | this_WeightDef_1= ruleWeightDef | this_Var_2= ruleVar | this_TypeDef_3= ruleTypeDef | this_Define_4= ruleDefine | this_DefineRegExp_5= ruleDefineRegExp | this_Counter_6= ruleCounter | this_Monitor_7= ruleMonitor | this_Pattern_8= rulePattern | this_Predicate_9= rulePredicate | this_LTLGar_10= ruleLTLGar | this_LTLAsm_11= ruleLTLAsm | this_EXGar_12= ruleEXGar ) )
            // InternalMySpectra.g:252:2: (this_Decl_Impl_0= ruleDecl_Impl | this_WeightDef_1= ruleWeightDef | this_Var_2= ruleVar | this_TypeDef_3= ruleTypeDef | this_Define_4= ruleDefine | this_DefineRegExp_5= ruleDefineRegExp | this_Counter_6= ruleCounter | this_Monitor_7= ruleMonitor | this_Pattern_8= rulePattern | this_Predicate_9= rulePredicate | this_LTLGar_10= ruleLTLGar | this_LTLAsm_11= ruleLTLAsm | this_EXGar_12= ruleEXGar )
            {
            // InternalMySpectra.g:252:2: (this_Decl_Impl_0= ruleDecl_Impl | this_WeightDef_1= ruleWeightDef | this_Var_2= ruleVar | this_TypeDef_3= ruleTypeDef | this_Define_4= ruleDefine | this_DefineRegExp_5= ruleDefineRegExp | this_Counter_6= ruleCounter | this_Monitor_7= ruleMonitor | this_Pattern_8= rulePattern | this_Predicate_9= rulePredicate | this_LTLGar_10= ruleLTLGar | this_LTLAsm_11= ruleLTLAsm | this_EXGar_12= ruleEXGar )
            int alt5=13;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 29:
                {
                alt5=5;
                }
                break;
            case 31:
                {
                alt5=6;
                }
                break;
            case 33:
                {
                alt5=7;
                }
                break;
            case 41:
                {
                alt5=8;
                }
                break;
            case 44:
                {
                alt5=9;
                }
                break;
            case 48:
                {
                alt5=10;
                }
                break;
            case 50:
                {
                alt5=11;
                }
                break;
            case 53:
                {
                alt5=12;
                }
                break;
            case 54:
                {
                alt5=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMySpectra.g:253:3: this_Decl_Impl_0= ruleDecl_Impl
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getDecl_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Decl_Impl_0=ruleDecl_Impl();

                    state._fsp--;


                    			current = this_Decl_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMySpectra.g:262:3: this_WeightDef_1= ruleWeightDef
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getWeightDefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WeightDef_1=ruleWeightDef();

                    state._fsp--;


                    			current = this_WeightDef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMySpectra.g:271:3: this_Var_2= ruleVar
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getVarParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Var_2=ruleVar();

                    state._fsp--;


                    			current = this_Var_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMySpectra.g:280:3: this_TypeDef_3= ruleTypeDef
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getTypeDefParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeDef_3=ruleTypeDef();

                    state._fsp--;


                    			current = this_TypeDef_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMySpectra.g:289:3: this_Define_4= ruleDefine
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getDefineParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Define_4=ruleDefine();

                    state._fsp--;


                    			current = this_Define_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMySpectra.g:298:3: this_DefineRegExp_5= ruleDefineRegExp
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getDefineRegExpParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefineRegExp_5=ruleDefineRegExp();

                    state._fsp--;


                    			current = this_DefineRegExp_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMySpectra.g:307:3: this_Counter_6= ruleCounter
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getCounterParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Counter_6=ruleCounter();

                    state._fsp--;


                    			current = this_Counter_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMySpectra.g:316:3: this_Monitor_7= ruleMonitor
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getMonitorParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Monitor_7=ruleMonitor();

                    state._fsp--;


                    			current = this_Monitor_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMySpectra.g:325:3: this_Pattern_8= rulePattern
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getPatternParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pattern_8=rulePattern();

                    state._fsp--;


                    			current = this_Pattern_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMySpectra.g:334:3: this_Predicate_9= rulePredicate
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getPredicateParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Predicate_9=rulePredicate();

                    state._fsp--;


                    			current = this_Predicate_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMySpectra.g:343:3: this_LTLGar_10= ruleLTLGar
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getLTLGarParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_LTLGar_10=ruleLTLGar();

                    state._fsp--;


                    			current = this_LTLGar_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalMySpectra.g:352:3: this_LTLAsm_11= ruleLTLAsm
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getLTLAsmParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_LTLAsm_11=ruleLTLAsm();

                    state._fsp--;


                    			current = this_LTLAsm_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalMySpectra.g:361:3: this_EXGar_12= ruleEXGar
                    {

                    			newCompositeNode(grammarAccess.getDeclAccess().getEXGarParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_EXGar_12=ruleEXGar();

                    state._fsp--;


                    			current = this_EXGar_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleTemporalExpression"
    // InternalMySpectra.g:373:1: entryRuleTemporalExpression returns [EObject current=null] : iv_ruleTemporalExpression= ruleTemporalExpression EOF ;
    public final EObject entryRuleTemporalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalExpression = null;


        try {
            // InternalMySpectra.g:373:59: (iv_ruleTemporalExpression= ruleTemporalExpression EOF )
            // InternalMySpectra.g:374:2: iv_ruleTemporalExpression= ruleTemporalExpression EOF
            {
             newCompositeNode(grammarAccess.getTemporalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalExpression=ruleTemporalExpression();

            state._fsp--;

             current =iv_ruleTemporalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalExpression"


    // $ANTLR start "ruleTemporalExpression"
    // InternalMySpectra.g:380:1: ruleTemporalExpression returns [EObject current=null] : (this_TemporalExpression_Impl_0= ruleTemporalExpression_Impl | this_TemporalInExpr_1= ruleTemporalInExpr | this_TemporalImpExpr_2= ruleTemporalImpExpr | this_TemporalIffExpr_3= ruleTemporalIffExpr | this_TemporalOrExpr_4= ruleTemporalOrExpr | this_TemporalAndExpr_5= ruleTemporalAndExpr | this_TemporalRelationalExpr_6= ruleTemporalRelationalExpr | this_TemporalRemainderExpr_7= ruleTemporalRemainderExpr | this_TemporalAdditiveExpr_8= ruleTemporalAdditiveExpr | this_TemporalMultiplicativeExpr_9= ruleTemporalMultiplicativeExpr | this_TemporalBinaryExpr_10= ruleTemporalBinaryExpr | this_TemporalUnaryExpr_11= ruleTemporalUnaryExpr | this_TemporalPrimaryExpr_12= ruleTemporalPrimaryExpr | this_Constant_13= ruleConstant | this_QuantifierExpr_14= ruleQuantifierExpr ) ;
    public final EObject ruleTemporalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TemporalExpression_Impl_0 = null;

        EObject this_TemporalInExpr_1 = null;

        EObject this_TemporalImpExpr_2 = null;

        EObject this_TemporalIffExpr_3 = null;

        EObject this_TemporalOrExpr_4 = null;

        EObject this_TemporalAndExpr_5 = null;

        EObject this_TemporalRelationalExpr_6 = null;

        EObject this_TemporalRemainderExpr_7 = null;

        EObject this_TemporalAdditiveExpr_8 = null;

        EObject this_TemporalMultiplicativeExpr_9 = null;

        EObject this_TemporalBinaryExpr_10 = null;

        EObject this_TemporalUnaryExpr_11 = null;

        EObject this_TemporalPrimaryExpr_12 = null;

        EObject this_Constant_13 = null;

        EObject this_QuantifierExpr_14 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:386:2: ( (this_TemporalExpression_Impl_0= ruleTemporalExpression_Impl | this_TemporalInExpr_1= ruleTemporalInExpr | this_TemporalImpExpr_2= ruleTemporalImpExpr | this_TemporalIffExpr_3= ruleTemporalIffExpr | this_TemporalOrExpr_4= ruleTemporalOrExpr | this_TemporalAndExpr_5= ruleTemporalAndExpr | this_TemporalRelationalExpr_6= ruleTemporalRelationalExpr | this_TemporalRemainderExpr_7= ruleTemporalRemainderExpr | this_TemporalAdditiveExpr_8= ruleTemporalAdditiveExpr | this_TemporalMultiplicativeExpr_9= ruleTemporalMultiplicativeExpr | this_TemporalBinaryExpr_10= ruleTemporalBinaryExpr | this_TemporalUnaryExpr_11= ruleTemporalUnaryExpr | this_TemporalPrimaryExpr_12= ruleTemporalPrimaryExpr | this_Constant_13= ruleConstant | this_QuantifierExpr_14= ruleQuantifierExpr ) )
            // InternalMySpectra.g:387:2: (this_TemporalExpression_Impl_0= ruleTemporalExpression_Impl | this_TemporalInExpr_1= ruleTemporalInExpr | this_TemporalImpExpr_2= ruleTemporalImpExpr | this_TemporalIffExpr_3= ruleTemporalIffExpr | this_TemporalOrExpr_4= ruleTemporalOrExpr | this_TemporalAndExpr_5= ruleTemporalAndExpr | this_TemporalRelationalExpr_6= ruleTemporalRelationalExpr | this_TemporalRemainderExpr_7= ruleTemporalRemainderExpr | this_TemporalAdditiveExpr_8= ruleTemporalAdditiveExpr | this_TemporalMultiplicativeExpr_9= ruleTemporalMultiplicativeExpr | this_TemporalBinaryExpr_10= ruleTemporalBinaryExpr | this_TemporalUnaryExpr_11= ruleTemporalUnaryExpr | this_TemporalPrimaryExpr_12= ruleTemporalPrimaryExpr | this_Constant_13= ruleConstant | this_QuantifierExpr_14= ruleQuantifierExpr )
            {
            // InternalMySpectra.g:387:2: (this_TemporalExpression_Impl_0= ruleTemporalExpression_Impl | this_TemporalInExpr_1= ruleTemporalInExpr | this_TemporalImpExpr_2= ruleTemporalImpExpr | this_TemporalIffExpr_3= ruleTemporalIffExpr | this_TemporalOrExpr_4= ruleTemporalOrExpr | this_TemporalAndExpr_5= ruleTemporalAndExpr | this_TemporalRelationalExpr_6= ruleTemporalRelationalExpr | this_TemporalRemainderExpr_7= ruleTemporalRemainderExpr | this_TemporalAdditiveExpr_8= ruleTemporalAdditiveExpr | this_TemporalMultiplicativeExpr_9= ruleTemporalMultiplicativeExpr | this_TemporalBinaryExpr_10= ruleTemporalBinaryExpr | this_TemporalUnaryExpr_11= ruleTemporalUnaryExpr | this_TemporalPrimaryExpr_12= ruleTemporalPrimaryExpr | this_Constant_13= ruleConstant | this_QuantifierExpr_14= ruleQuantifierExpr )
            int alt6=15;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt6=1;
                }
                break;
            case 59:
            case 60:
                {
                alt6=2;
                }
                break;
            case 64:
                {
                alt6=3;
                }
                break;
            case 66:
                {
                alt6=4;
                }
                break;
            case 67:
                {
                alt6=5;
                }
                break;
            case 68:
                {
                alt6=6;
                }
                break;
            case 69:
                {
                alt6=7;
                }
                break;
            case 71:
                {
                alt6=8;
                }
                break;
            case 72:
                {
                alt6=9;
                }
                break;
            case 73:
                {
                alt6=10;
                }
                break;
            case 74:
                {
                alt6=11;
                }
                break;
            case 75:
                {
                alt6=12;
                }
                break;
            case 78:
                {
                alt6=13;
                }
                break;
            case 87:
                {
                alt6=14;
                }
                break;
            case 90:
                {
                alt6=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMySpectra.g:388:3: this_TemporalExpression_Impl_0= ruleTemporalExpression_Impl
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalExpression_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalExpression_Impl_0=ruleTemporalExpression_Impl();

                    state._fsp--;


                    			current = this_TemporalExpression_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMySpectra.g:397:3: this_TemporalInExpr_1= ruleTemporalInExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalInExprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalInExpr_1=ruleTemporalInExpr();

                    state._fsp--;


                    			current = this_TemporalInExpr_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMySpectra.g:406:3: this_TemporalImpExpr_2= ruleTemporalImpExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalImpExprParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalImpExpr_2=ruleTemporalImpExpr();

                    state._fsp--;


                    			current = this_TemporalImpExpr_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMySpectra.g:415:3: this_TemporalIffExpr_3= ruleTemporalIffExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalIffExprParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalIffExpr_3=ruleTemporalIffExpr();

                    state._fsp--;


                    			current = this_TemporalIffExpr_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMySpectra.g:424:3: this_TemporalOrExpr_4= ruleTemporalOrExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalOrExprParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalOrExpr_4=ruleTemporalOrExpr();

                    state._fsp--;


                    			current = this_TemporalOrExpr_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMySpectra.g:433:3: this_TemporalAndExpr_5= ruleTemporalAndExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalAndExprParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalAndExpr_5=ruleTemporalAndExpr();

                    state._fsp--;


                    			current = this_TemporalAndExpr_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMySpectra.g:442:3: this_TemporalRelationalExpr_6= ruleTemporalRelationalExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalRelationalExprParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalRelationalExpr_6=ruleTemporalRelationalExpr();

                    state._fsp--;


                    			current = this_TemporalRelationalExpr_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMySpectra.g:451:3: this_TemporalRemainderExpr_7= ruleTemporalRemainderExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalRemainderExprParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalRemainderExpr_7=ruleTemporalRemainderExpr();

                    state._fsp--;


                    			current = this_TemporalRemainderExpr_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMySpectra.g:460:3: this_TemporalAdditiveExpr_8= ruleTemporalAdditiveExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalAdditiveExprParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalAdditiveExpr_8=ruleTemporalAdditiveExpr();

                    state._fsp--;


                    			current = this_TemporalAdditiveExpr_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMySpectra.g:469:3: this_TemporalMultiplicativeExpr_9= ruleTemporalMultiplicativeExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalMultiplicativeExprParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalMultiplicativeExpr_9=ruleTemporalMultiplicativeExpr();

                    state._fsp--;


                    			current = this_TemporalMultiplicativeExpr_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMySpectra.g:478:3: this_TemporalBinaryExpr_10= ruleTemporalBinaryExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalBinaryExprParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalBinaryExpr_10=ruleTemporalBinaryExpr();

                    state._fsp--;


                    			current = this_TemporalBinaryExpr_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalMySpectra.g:487:3: this_TemporalUnaryExpr_11= ruleTemporalUnaryExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalUnaryExprParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalUnaryExpr_11=ruleTemporalUnaryExpr();

                    state._fsp--;


                    			current = this_TemporalUnaryExpr_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalMySpectra.g:496:3: this_TemporalPrimaryExpr_12= ruleTemporalPrimaryExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getTemporalPrimaryExprParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalPrimaryExpr_12=ruleTemporalPrimaryExpr();

                    state._fsp--;


                    			current = this_TemporalPrimaryExpr_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalMySpectra.g:505:3: this_Constant_13= ruleConstant
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getConstantParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_13=ruleConstant();

                    state._fsp--;


                    			current = this_Constant_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalMySpectra.g:514:3: this_QuantifierExpr_14= ruleQuantifierExpr
                    {

                    			newCompositeNode(grammarAccess.getTemporalExpressionAccess().getQuantifierExprParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuantifierExpr_14=ruleQuantifierExpr();

                    state._fsp--;


                    			current = this_QuantifierExpr_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalExpression"


    // $ANTLR start "entryRuleRegExp"
    // InternalMySpectra.g:526:1: entryRuleRegExp returns [EObject current=null] : iv_ruleRegExp= ruleRegExp EOF ;
    public final EObject entryRuleRegExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegExp = null;


        try {
            // InternalMySpectra.g:526:47: (iv_ruleRegExp= ruleRegExp EOF )
            // InternalMySpectra.g:527:2: iv_ruleRegExp= ruleRegExp EOF
            {
             newCompositeNode(grammarAccess.getRegExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegExp=ruleRegExp();

            state._fsp--;

             current =iv_ruleRegExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegExp"


    // $ANTLR start "ruleRegExp"
    // InternalMySpectra.g:533:1: ruleRegExp returns [EObject current=null] : (this_RegExp_Impl_0= ruleRegExp_Impl | this_BinaryRegExp_1= ruleBinaryRegExp | this_UnaryRegExp_2= ruleUnaryRegExp | this_CompRegExp_3= ruleCompRegExp ) ;
    public final EObject ruleRegExp() throws RecognitionException {
        EObject current = null;

        EObject this_RegExp_Impl_0 = null;

        EObject this_BinaryRegExp_1 = null;

        EObject this_UnaryRegExp_2 = null;

        EObject this_CompRegExp_3 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:539:2: ( (this_RegExp_Impl_0= ruleRegExp_Impl | this_BinaryRegExp_1= ruleBinaryRegExp | this_UnaryRegExp_2= ruleUnaryRegExp | this_CompRegExp_3= ruleCompRegExp ) )
            // InternalMySpectra.g:540:2: (this_RegExp_Impl_0= ruleRegExp_Impl | this_BinaryRegExp_1= ruleBinaryRegExp | this_UnaryRegExp_2= ruleUnaryRegExp | this_CompRegExp_3= ruleCompRegExp )
            {
            // InternalMySpectra.g:540:2: (this_RegExp_Impl_0= ruleRegExp_Impl | this_BinaryRegExp_1= ruleBinaryRegExp | this_UnaryRegExp_2= ruleUnaryRegExp | this_CompRegExp_3= ruleCompRegExp )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 101:
                {
                switch ( input.LA(2) ) {
                case 127:
                    {
                    alt7=2;
                    }
                    break;
                case 102:
                    {
                    alt7=1;
                    }
                    break;
                case 140:
                    {
                    alt7=4;
                    }
                    break;
                case 129:
                case 130:
                case 131:
                case 132:
                case 133:
                case 134:
                case 135:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

                }
                break;
            case 102:
                {
                alt7=1;
                }
                break;
            case 127:
                {
                alt7=2;
                }
                break;
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                {
                alt7=3;
                }
                break;
            case 140:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMySpectra.g:541:3: this_RegExp_Impl_0= ruleRegExp_Impl
                    {

                    			newCompositeNode(grammarAccess.getRegExpAccess().getRegExp_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegExp_Impl_0=ruleRegExp_Impl();

                    state._fsp--;


                    			current = this_RegExp_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMySpectra.g:550:3: this_BinaryRegExp_1= ruleBinaryRegExp
                    {

                    			newCompositeNode(grammarAccess.getRegExpAccess().getBinaryRegExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryRegExp_1=ruleBinaryRegExp();

                    state._fsp--;


                    			current = this_BinaryRegExp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMySpectra.g:559:3: this_UnaryRegExp_2= ruleUnaryRegExp
                    {

                    			newCompositeNode(grammarAccess.getRegExpAccess().getUnaryRegExpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnaryRegExp_2=ruleUnaryRegExp();

                    state._fsp--;


                    			current = this_UnaryRegExp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMySpectra.g:568:3: this_CompRegExp_3= ruleCompRegExp
                    {

                    			newCompositeNode(grammarAccess.getRegExpAccess().getCompRegExpParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompRegExp_3=ruleCompRegExp();

                    state._fsp--;


                    			current = this_CompRegExp_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegExp"


    // $ANTLR start "entryRuleImport"
    // InternalMySpectra.g:580:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMySpectra.g:580:47: (iv_ruleImport= ruleImport EOF )
            // InternalMySpectra.g:581:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMySpectra.g:587:1: ruleImport returns [EObject current=null] : ( () otherlv_1= 'Import' otherlv_2= '{' (otherlv_3= 'importURI' ( (lv_importURI_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_importURI_4_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:593:2: ( ( () otherlv_1= 'Import' otherlv_2= '{' (otherlv_3= 'importURI' ( (lv_importURI_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalMySpectra.g:594:2: ( () otherlv_1= 'Import' otherlv_2= '{' (otherlv_3= 'importURI' ( (lv_importURI_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalMySpectra.g:594:2: ( () otherlv_1= 'Import' otherlv_2= '{' (otherlv_3= 'importURI' ( (lv_importURI_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalMySpectra.g:595:3: () otherlv_1= 'Import' otherlv_2= '{' (otherlv_3= 'importURI' ( (lv_importURI_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalMySpectra.g:595:3: ()
            // InternalMySpectra.g:596:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportAccess().getImportAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:610:3: (otherlv_3= 'importURI' ( (lv_importURI_4_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMySpectra.g:611:4: otherlv_3= 'importURI' ( (lv_importURI_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getImportAccess().getImportURIKeyword_3_0());
                    			
                    // InternalMySpectra.g:615:4: ( (lv_importURI_4_0= ruleEString ) )
                    // InternalMySpectra.g:616:5: (lv_importURI_4_0= ruleEString )
                    {
                    // InternalMySpectra.g:616:5: (lv_importURI_4_0= ruleEString )
                    // InternalMySpectra.g:617:6: lv_importURI_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImportAccess().getImportURIEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_importURI_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportRule());
                    						}
                    						set(
                    							current,
                    							"importURI",
                    							lv_importURI_4_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getImportAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleEString"
    // InternalMySpectra.g:643:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMySpectra.g:643:47: (iv_ruleEString= ruleEString EOF )
            // InternalMySpectra.g:644:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMySpectra.g:650:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMySpectra.g:656:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMySpectra.g:657:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMySpectra.g:657:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMySpectra.g:658:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySpectra.g:666:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDecl_Impl"
    // InternalMySpectra.g:677:1: entryRuleDecl_Impl returns [EObject current=null] : iv_ruleDecl_Impl= ruleDecl_Impl EOF ;
    public final EObject entryRuleDecl_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl_Impl = null;


        try {
            // InternalMySpectra.g:677:50: (iv_ruleDecl_Impl= ruleDecl_Impl EOF )
            // InternalMySpectra.g:678:2: iv_ruleDecl_Impl= ruleDecl_Impl EOF
            {
             newCompositeNode(grammarAccess.getDecl_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecl_Impl=ruleDecl_Impl();

            state._fsp--;

             current =iv_ruleDecl_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecl_Impl"


    // $ANTLR start "ruleDecl_Impl"
    // InternalMySpectra.g:684:1: ruleDecl_Impl returns [EObject current=null] : ( () otherlv_1= 'Decl' ) ;
    public final EObject ruleDecl_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMySpectra.g:690:2: ( ( () otherlv_1= 'Decl' ) )
            // InternalMySpectra.g:691:2: ( () otherlv_1= 'Decl' )
            {
            // InternalMySpectra.g:691:2: ( () otherlv_1= 'Decl' )
            // InternalMySpectra.g:692:3: () otherlv_1= 'Decl'
            {
            // InternalMySpectra.g:692:3: ()
            // InternalMySpectra.g:693:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecl_ImplAccess().getDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDecl_ImplAccess().getDeclKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecl_Impl"


    // $ANTLR start "entryRuleWeightDef"
    // InternalMySpectra.g:707:1: entryRuleWeightDef returns [EObject current=null] : iv_ruleWeightDef= ruleWeightDef EOF ;
    public final EObject entryRuleWeightDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeightDef = null;


        try {
            // InternalMySpectra.g:707:50: (iv_ruleWeightDef= ruleWeightDef EOF )
            // InternalMySpectra.g:708:2: iv_ruleWeightDef= ruleWeightDef EOF
            {
             newCompositeNode(grammarAccess.getWeightDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWeightDef=ruleWeightDef();

            state._fsp--;

             current =iv_ruleWeightDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWeightDef"


    // $ANTLR start "ruleWeightDef"
    // InternalMySpectra.g:714:1: ruleWeightDef returns [EObject current=null] : ( () otherlv_1= 'WeightDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'negative' ( (lv_negative_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )? (otherlv_8= 'definition' ( (lv_definition_9_0= ruleTemporalExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleWeightDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_negative_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;

        EObject lv_definition_9_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:720:2: ( ( () otherlv_1= 'WeightDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'negative' ( (lv_negative_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )? (otherlv_8= 'definition' ( (lv_definition_9_0= ruleTemporalExpression ) ) )? otherlv_10= '}' ) )
            // InternalMySpectra.g:721:2: ( () otherlv_1= 'WeightDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'negative' ( (lv_negative_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )? (otherlv_8= 'definition' ( (lv_definition_9_0= ruleTemporalExpression ) ) )? otherlv_10= '}' )
            {
            // InternalMySpectra.g:721:2: ( () otherlv_1= 'WeightDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'negative' ( (lv_negative_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )? (otherlv_8= 'definition' ( (lv_definition_9_0= ruleTemporalExpression ) ) )? otherlv_10= '}' )
            // InternalMySpectra.g:722:3: () otherlv_1= 'WeightDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'negative' ( (lv_negative_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )? (otherlv_8= 'definition' ( (lv_definition_9_0= ruleTemporalExpression ) ) )? otherlv_10= '}'
            {
            // InternalMySpectra.g:722:3: ()
            // InternalMySpectra.g:723:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWeightDefAccess().getWeightDefAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWeightDefAccess().getWeightDefKeyword_1());
            		
            // InternalMySpectra.g:733:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:734:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:734:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:735:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWeightDefAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWeightDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getWeightDefAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:756:3: (otherlv_4= 'negative' ( (lv_negative_5_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMySpectra.g:757:4: otherlv_4= 'negative' ( (lv_negative_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getWeightDefAccess().getNegativeKeyword_4_0());
                    			
                    // InternalMySpectra.g:761:4: ( (lv_negative_5_0= ruleEString ) )
                    // InternalMySpectra.g:762:5: (lv_negative_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:762:5: (lv_negative_5_0= ruleEString )
                    // InternalMySpectra.g:763:6: lv_negative_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWeightDefAccess().getNegativeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_negative_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWeightDefRule());
                    						}
                    						set(
                    							current,
                    							"negative",
                    							lv_negative_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:781:3: (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMySpectra.g:782:4: otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getWeightDefAccess().getValueKeyword_5_0());
                    			
                    // InternalMySpectra.g:786:4: ( (lv_value_7_0= ruleEInt ) )
                    // InternalMySpectra.g:787:5: (lv_value_7_0= ruleEInt )
                    {
                    // InternalMySpectra.g:787:5: (lv_value_7_0= ruleEInt )
                    // InternalMySpectra.g:788:6: lv_value_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getWeightDefAccess().getValueEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWeightDefRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.xtext.example.myspectra.MySpectra.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:806:3: (otherlv_8= 'definition' ( (lv_definition_9_0= ruleTemporalExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMySpectra.g:807:4: otherlv_8= 'definition' ( (lv_definition_9_0= ruleTemporalExpression ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getWeightDefAccess().getDefinitionKeyword_6_0());
                    			
                    // InternalMySpectra.g:811:4: ( (lv_definition_9_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:812:5: (lv_definition_9_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:812:5: (lv_definition_9_0= ruleTemporalExpression )
                    // InternalMySpectra.g:813:6: lv_definition_9_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getWeightDefAccess().getDefinitionTemporalExpressionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_definition_9_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWeightDefRule());
                    						}
                    						set(
                    							current,
                    							"definition",
                    							lv_definition_9_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getWeightDefAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeightDef"


    // $ANTLR start "entryRuleVar"
    // InternalMySpectra.g:839:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMySpectra.g:839:44: (iv_ruleVar= ruleVar EOF )
            // InternalMySpectra.g:840:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMySpectra.g:846:1: ruleVar returns [EObject current=null] : ( () otherlv_1= 'Var' otherlv_2= '{' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleVarOwner ) ) )? (otherlv_5= 'var' ( (lv_var_6_0= ruleVarDecl ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_kind_4_0 = null;

        EObject lv_var_6_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:852:2: ( ( () otherlv_1= 'Var' otherlv_2= '{' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleVarOwner ) ) )? (otherlv_5= 'var' ( (lv_var_6_0= ruleVarDecl ) ) )? otherlv_7= '}' ) )
            // InternalMySpectra.g:853:2: ( () otherlv_1= 'Var' otherlv_2= '{' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleVarOwner ) ) )? (otherlv_5= 'var' ( (lv_var_6_0= ruleVarDecl ) ) )? otherlv_7= '}' )
            {
            // InternalMySpectra.g:853:2: ( () otherlv_1= 'Var' otherlv_2= '{' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleVarOwner ) ) )? (otherlv_5= 'var' ( (lv_var_6_0= ruleVarDecl ) ) )? otherlv_7= '}' )
            // InternalMySpectra.g:854:3: () otherlv_1= 'Var' otherlv_2= '{' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleVarOwner ) ) )? (otherlv_5= 'var' ( (lv_var_6_0= ruleVarDecl ) ) )? otherlv_7= '}'
            {
            // InternalMySpectra.g:854:3: ()
            // InternalMySpectra.g:855:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarAccess().getVarAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVarAccess().getVarKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getVarAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:869:3: (otherlv_3= 'kind' ( (lv_kind_4_0= ruleVarOwner ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMySpectra.g:870:4: otherlv_3= 'kind' ( (lv_kind_4_0= ruleVarOwner ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getVarAccess().getKindKeyword_3_0());
                    			
                    // InternalMySpectra.g:874:4: ( (lv_kind_4_0= ruleVarOwner ) )
                    // InternalMySpectra.g:875:5: (lv_kind_4_0= ruleVarOwner )
                    {
                    // InternalMySpectra.g:875:5: (lv_kind_4_0= ruleVarOwner )
                    // InternalMySpectra.g:876:6: lv_kind_4_0= ruleVarOwner
                    {

                    						newCompositeNode(grammarAccess.getVarAccess().getKindVarOwnerEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_kind_4_0=ruleVarOwner();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_4_0,
                    							"org.xtext.example.myspectra.MySpectra.VarOwner");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:894:3: (otherlv_5= 'var' ( (lv_var_6_0= ruleVarDecl ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMySpectra.g:895:4: otherlv_5= 'var' ( (lv_var_6_0= ruleVarDecl ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getVarAccess().getVarKeyword_4_0());
                    			
                    // InternalMySpectra.g:899:4: ( (lv_var_6_0= ruleVarDecl ) )
                    // InternalMySpectra.g:900:5: (lv_var_6_0= ruleVarDecl )
                    {
                    // InternalMySpectra.g:900:5: (lv_var_6_0= ruleVarDecl )
                    // InternalMySpectra.g:901:6: lv_var_6_0= ruleVarDecl
                    {

                    						newCompositeNode(grammarAccess.getVarAccess().getVarVarDeclParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_var_6_0=ruleVarDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarRule());
                    						}
                    						set(
                    							current,
                    							"var",
                    							lv_var_6_0,
                    							"org.xtext.example.myspectra.MySpectra.VarDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVarAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleTypeDef"
    // InternalMySpectra.g:927:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalMySpectra.g:927:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalMySpectra.g:928:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalMySpectra.g:934:1: ruleTypeDef returns [EObject current=null] : ( () otherlv_1= 'TypeDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:940:2: ( ( () otherlv_1= 'TypeDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' ) )
            // InternalMySpectra.g:941:2: ( () otherlv_1= 'TypeDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' )
            {
            // InternalMySpectra.g:941:2: ( () otherlv_1= 'TypeDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' )
            // InternalMySpectra.g:942:3: () otherlv_1= 'TypeDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}'
            {
            // InternalMySpectra.g:942:3: ()
            // InternalMySpectra.g:943:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeDefAccess().getTypeDefAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeDefAccess().getTypeDefKeyword_1());
            		
            // InternalMySpectra.g:953:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:954:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:954:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:955:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTypeDefAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:976:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMySpectra.g:977:4: otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getTypeDefAccess().getTypeKeyword_4_0());
                    			
                    // InternalMySpectra.g:981:4: ( (lv_type_5_0= ruleVarType ) )
                    // InternalMySpectra.g:982:5: (lv_type_5_0= ruleVarType )
                    {
                    // InternalMySpectra.g:982:5: (lv_type_5_0= ruleVarType )
                    // InternalMySpectra.g:983:6: lv_type_5_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getTypeDefAccess().getTypeVarTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_5_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.example.myspectra.MySpectra.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleDefine"
    // InternalMySpectra.g:1009:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalMySpectra.g:1009:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalMySpectra.g:1010:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalMySpectra.g:1016:1: ruleDefine returns [EObject current=null] : ( () otherlv_1= 'Define' otherlv_2= '{' (otherlv_3= 'defineList' otherlv_4= '{' ( (lv_defineList_5_0= ruleDefineDecl ) ) (otherlv_6= ',' ( (lv_defineList_7_0= ruleDefineDecl ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_defineList_5_0 = null;

        EObject lv_defineList_7_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:1022:2: ( ( () otherlv_1= 'Define' otherlv_2= '{' (otherlv_3= 'defineList' otherlv_4= '{' ( (lv_defineList_5_0= ruleDefineDecl ) ) (otherlv_6= ',' ( (lv_defineList_7_0= ruleDefineDecl ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalMySpectra.g:1023:2: ( () otherlv_1= 'Define' otherlv_2= '{' (otherlv_3= 'defineList' otherlv_4= '{' ( (lv_defineList_5_0= ruleDefineDecl ) ) (otherlv_6= ',' ( (lv_defineList_7_0= ruleDefineDecl ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalMySpectra.g:1023:2: ( () otherlv_1= 'Define' otherlv_2= '{' (otherlv_3= 'defineList' otherlv_4= '{' ( (lv_defineList_5_0= ruleDefineDecl ) ) (otherlv_6= ',' ( (lv_defineList_7_0= ruleDefineDecl ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalMySpectra.g:1024:3: () otherlv_1= 'Define' otherlv_2= '{' (otherlv_3= 'defineList' otherlv_4= '{' ( (lv_defineList_5_0= ruleDefineDecl ) ) (otherlv_6= ',' ( (lv_defineList_7_0= ruleDefineDecl ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalMySpectra.g:1024:3: ()
            // InternalMySpectra.g:1025:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefineAccess().getDefineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineAccess().getDefineKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getDefineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:1039:3: (otherlv_3= 'defineList' otherlv_4= '{' ( (lv_defineList_5_0= ruleDefineDecl ) ) (otherlv_6= ',' ( (lv_defineList_7_0= ruleDefineDecl ) ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMySpectra.g:1040:4: otherlv_3= 'defineList' otherlv_4= '{' ( (lv_defineList_5_0= ruleDefineDecl ) ) (otherlv_6= ',' ( (lv_defineList_7_0= ruleDefineDecl ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getDefineAccess().getDefineListKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefineAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMySpectra.g:1048:4: ( (lv_defineList_5_0= ruleDefineDecl ) )
                    // InternalMySpectra.g:1049:5: (lv_defineList_5_0= ruleDefineDecl )
                    {
                    // InternalMySpectra.g:1049:5: (lv_defineList_5_0= ruleDefineDecl )
                    // InternalMySpectra.g:1050:6: lv_defineList_5_0= ruleDefineDecl
                    {

                    						newCompositeNode(grammarAccess.getDefineAccess().getDefineListDefineDeclParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_defineList_5_0=ruleDefineDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineRule());
                    						}
                    						add(
                    							current,
                    							"defineList",
                    							lv_defineList_5_0,
                    							"org.xtext.example.myspectra.MySpectra.DefineDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1067:4: (otherlv_6= ',' ( (lv_defineList_7_0= ruleDefineDecl ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMySpectra.g:1068:5: otherlv_6= ',' ( (lv_defineList_7_0= ruleDefineDecl ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDefineAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMySpectra.g:1072:5: ( (lv_defineList_7_0= ruleDefineDecl ) )
                    	    // InternalMySpectra.g:1073:6: (lv_defineList_7_0= ruleDefineDecl )
                    	    {
                    	    // InternalMySpectra.g:1073:6: (lv_defineList_7_0= ruleDefineDecl )
                    	    // InternalMySpectra.g:1074:7: lv_defineList_7_0= ruleDefineDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getDefineAccess().getDefineListDefineDeclParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_defineList_7_0=ruleDefineDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDefineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"defineList",
                    	    								lv_defineList_7_0,
                    	    								"org.xtext.example.myspectra.MySpectra.DefineDecl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getDefineAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDefineAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleDefineRegExp"
    // InternalMySpectra.g:1105:1: entryRuleDefineRegExp returns [EObject current=null] : iv_ruleDefineRegExp= ruleDefineRegExp EOF ;
    public final EObject entryRuleDefineRegExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineRegExp = null;


        try {
            // InternalMySpectra.g:1105:53: (iv_ruleDefineRegExp= ruleDefineRegExp EOF )
            // InternalMySpectra.g:1106:2: iv_ruleDefineRegExp= ruleDefineRegExp EOF
            {
             newCompositeNode(grammarAccess.getDefineRegExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefineRegExp=ruleDefineRegExp();

            state._fsp--;

             current =iv_ruleDefineRegExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefineRegExp"


    // $ANTLR start "ruleDefineRegExp"
    // InternalMySpectra.g:1112:1: ruleDefineRegExp returns [EObject current=null] : ( () otherlv_1= 'DefineRegExp' otherlv_2= '{' (otherlv_3= 'defineRegsList' otherlv_4= '{' ( (lv_defineRegsList_5_0= ruleDefineRegExpDecl ) ) (otherlv_6= ',' ( (lv_defineRegsList_7_0= ruleDefineRegExpDecl ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleDefineRegExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_defineRegsList_5_0 = null;

        EObject lv_defineRegsList_7_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:1118:2: ( ( () otherlv_1= 'DefineRegExp' otherlv_2= '{' (otherlv_3= 'defineRegsList' otherlv_4= '{' ( (lv_defineRegsList_5_0= ruleDefineRegExpDecl ) ) (otherlv_6= ',' ( (lv_defineRegsList_7_0= ruleDefineRegExpDecl ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalMySpectra.g:1119:2: ( () otherlv_1= 'DefineRegExp' otherlv_2= '{' (otherlv_3= 'defineRegsList' otherlv_4= '{' ( (lv_defineRegsList_5_0= ruleDefineRegExpDecl ) ) (otherlv_6= ',' ( (lv_defineRegsList_7_0= ruleDefineRegExpDecl ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalMySpectra.g:1119:2: ( () otherlv_1= 'DefineRegExp' otherlv_2= '{' (otherlv_3= 'defineRegsList' otherlv_4= '{' ( (lv_defineRegsList_5_0= ruleDefineRegExpDecl ) ) (otherlv_6= ',' ( (lv_defineRegsList_7_0= ruleDefineRegExpDecl ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalMySpectra.g:1120:3: () otherlv_1= 'DefineRegExp' otherlv_2= '{' (otherlv_3= 'defineRegsList' otherlv_4= '{' ( (lv_defineRegsList_5_0= ruleDefineRegExpDecl ) ) (otherlv_6= ',' ( (lv_defineRegsList_7_0= ruleDefineRegExpDecl ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalMySpectra.g:1120:3: ()
            // InternalMySpectra.g:1121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefineRegExpAccess().getDefineRegExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineRegExpAccess().getDefineRegExpKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getDefineRegExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:1135:3: (otherlv_3= 'defineRegsList' otherlv_4= '{' ( (lv_defineRegsList_5_0= ruleDefineRegExpDecl ) ) (otherlv_6= ',' ( (lv_defineRegsList_7_0= ruleDefineRegExpDecl ) ) )* otherlv_8= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMySpectra.g:1136:4: otherlv_3= 'defineRegsList' otherlv_4= '{' ( (lv_defineRegsList_5_0= ruleDefineRegExpDecl ) ) (otherlv_6= ',' ( (lv_defineRegsList_7_0= ruleDefineRegExpDecl ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getDefineRegExpAccess().getDefineRegsListKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefineRegExpAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMySpectra.g:1144:4: ( (lv_defineRegsList_5_0= ruleDefineRegExpDecl ) )
                    // InternalMySpectra.g:1145:5: (lv_defineRegsList_5_0= ruleDefineRegExpDecl )
                    {
                    // InternalMySpectra.g:1145:5: (lv_defineRegsList_5_0= ruleDefineRegExpDecl )
                    // InternalMySpectra.g:1146:6: lv_defineRegsList_5_0= ruleDefineRegExpDecl
                    {

                    						newCompositeNode(grammarAccess.getDefineRegExpAccess().getDefineRegsListDefineRegExpDeclParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_defineRegsList_5_0=ruleDefineRegExpDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineRegExpRule());
                    						}
                    						add(
                    							current,
                    							"defineRegsList",
                    							lv_defineRegsList_5_0,
                    							"org.xtext.example.myspectra.MySpectra.DefineRegExpDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1163:4: (otherlv_6= ',' ( (lv_defineRegsList_7_0= ruleDefineRegExpDecl ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMySpectra.g:1164:5: otherlv_6= ',' ( (lv_defineRegsList_7_0= ruleDefineRegExpDecl ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDefineRegExpAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMySpectra.g:1168:5: ( (lv_defineRegsList_7_0= ruleDefineRegExpDecl ) )
                    	    // InternalMySpectra.g:1169:6: (lv_defineRegsList_7_0= ruleDefineRegExpDecl )
                    	    {
                    	    // InternalMySpectra.g:1169:6: (lv_defineRegsList_7_0= ruleDefineRegExpDecl )
                    	    // InternalMySpectra.g:1170:7: lv_defineRegsList_7_0= ruleDefineRegExpDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getDefineRegExpAccess().getDefineRegsListDefineRegExpDeclParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_defineRegsList_7_0=ruleDefineRegExpDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDefineRegExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"defineRegsList",
                    	    								lv_defineRegsList_7_0,
                    	    								"org.xtext.example.myspectra.MySpectra.DefineRegExpDecl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getDefineRegExpAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDefineRegExpAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefineRegExp"


    // $ANTLR start "entryRuleCounter"
    // InternalMySpectra.g:1201:1: entryRuleCounter returns [EObject current=null] : iv_ruleCounter= ruleCounter EOF ;
    public final EObject entryRuleCounter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCounter = null;


        try {
            // InternalMySpectra.g:1201:48: (iv_ruleCounter= ruleCounter EOF )
            // InternalMySpectra.g:1202:2: iv_ruleCounter= ruleCounter EOF
            {
             newCompositeNode(grammarAccess.getCounterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCounter=ruleCounter();

            state._fsp--;

             current =iv_ruleCounter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCounter"


    // $ANTLR start "ruleCounter"
    // InternalMySpectra.g:1208:1: ruleCounter returns [EObject current=null] : ( () otherlv_1= 'Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overflowMethod' otherlv_5= '{' ( (lv_overflowMethod_6_0= ruleOverflowMethod ) ) (otherlv_7= ',' ( (lv_overflowMethod_8_0= ruleOverflowMethod ) ) )* otherlv_9= '}' )? (otherlv_10= 'underflowMethod' otherlv_11= '{' ( (lv_underflowMethod_12_0= ruleOverflowMethod ) ) (otherlv_13= ',' ( (lv_underflowMethod_14_0= ruleOverflowMethod ) ) )* otherlv_15= '}' )? (otherlv_16= 'range' ( (lv_range_17_0= ruleSubrange ) ) )? (otherlv_18= 'initial' otherlv_19= '{' ( (lv_initial_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_initial_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'resetPred' otherlv_25= '{' ( (lv_resetPred_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_resetPred_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )? (otherlv_30= 'incPred' otherlv_31= '{' ( (lv_incPred_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_incPred_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )? (otherlv_36= 'decPred' otherlv_37= '{' ( (lv_decPred_38_0= ruleTemporalExpression ) ) (otherlv_39= ',' ( (lv_decPred_40_0= ruleTemporalExpression ) ) )* otherlv_41= '}' )? otherlv_42= '}' ) ;
    public final EObject ruleCounter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_overflowMethod_6_0 = null;

        Enumerator lv_overflowMethod_8_0 = null;

        Enumerator lv_underflowMethod_12_0 = null;

        Enumerator lv_underflowMethod_14_0 = null;

        EObject lv_range_17_0 = null;

        EObject lv_initial_20_0 = null;

        EObject lv_initial_22_0 = null;

        EObject lv_resetPred_26_0 = null;

        EObject lv_resetPred_28_0 = null;

        EObject lv_incPred_32_0 = null;

        EObject lv_incPred_34_0 = null;

        EObject lv_decPred_38_0 = null;

        EObject lv_decPred_40_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:1214:2: ( ( () otherlv_1= 'Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overflowMethod' otherlv_5= '{' ( (lv_overflowMethod_6_0= ruleOverflowMethod ) ) (otherlv_7= ',' ( (lv_overflowMethod_8_0= ruleOverflowMethod ) ) )* otherlv_9= '}' )? (otherlv_10= 'underflowMethod' otherlv_11= '{' ( (lv_underflowMethod_12_0= ruleOverflowMethod ) ) (otherlv_13= ',' ( (lv_underflowMethod_14_0= ruleOverflowMethod ) ) )* otherlv_15= '}' )? (otherlv_16= 'range' ( (lv_range_17_0= ruleSubrange ) ) )? (otherlv_18= 'initial' otherlv_19= '{' ( (lv_initial_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_initial_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'resetPred' otherlv_25= '{' ( (lv_resetPred_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_resetPred_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )? (otherlv_30= 'incPred' otherlv_31= '{' ( (lv_incPred_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_incPred_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )? (otherlv_36= 'decPred' otherlv_37= '{' ( (lv_decPred_38_0= ruleTemporalExpression ) ) (otherlv_39= ',' ( (lv_decPred_40_0= ruleTemporalExpression ) ) )* otherlv_41= '}' )? otherlv_42= '}' ) )
            // InternalMySpectra.g:1215:2: ( () otherlv_1= 'Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overflowMethod' otherlv_5= '{' ( (lv_overflowMethod_6_0= ruleOverflowMethod ) ) (otherlv_7= ',' ( (lv_overflowMethod_8_0= ruleOverflowMethod ) ) )* otherlv_9= '}' )? (otherlv_10= 'underflowMethod' otherlv_11= '{' ( (lv_underflowMethod_12_0= ruleOverflowMethod ) ) (otherlv_13= ',' ( (lv_underflowMethod_14_0= ruleOverflowMethod ) ) )* otherlv_15= '}' )? (otherlv_16= 'range' ( (lv_range_17_0= ruleSubrange ) ) )? (otherlv_18= 'initial' otherlv_19= '{' ( (lv_initial_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_initial_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'resetPred' otherlv_25= '{' ( (lv_resetPred_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_resetPred_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )? (otherlv_30= 'incPred' otherlv_31= '{' ( (lv_incPred_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_incPred_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )? (otherlv_36= 'decPred' otherlv_37= '{' ( (lv_decPred_38_0= ruleTemporalExpression ) ) (otherlv_39= ',' ( (lv_decPred_40_0= ruleTemporalExpression ) ) )* otherlv_41= '}' )? otherlv_42= '}' )
            {
            // InternalMySpectra.g:1215:2: ( () otherlv_1= 'Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overflowMethod' otherlv_5= '{' ( (lv_overflowMethod_6_0= ruleOverflowMethod ) ) (otherlv_7= ',' ( (lv_overflowMethod_8_0= ruleOverflowMethod ) ) )* otherlv_9= '}' )? (otherlv_10= 'underflowMethod' otherlv_11= '{' ( (lv_underflowMethod_12_0= ruleOverflowMethod ) ) (otherlv_13= ',' ( (lv_underflowMethod_14_0= ruleOverflowMethod ) ) )* otherlv_15= '}' )? (otherlv_16= 'range' ( (lv_range_17_0= ruleSubrange ) ) )? (otherlv_18= 'initial' otherlv_19= '{' ( (lv_initial_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_initial_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'resetPred' otherlv_25= '{' ( (lv_resetPred_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_resetPred_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )? (otherlv_30= 'incPred' otherlv_31= '{' ( (lv_incPred_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_incPred_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )? (otherlv_36= 'decPred' otherlv_37= '{' ( (lv_decPred_38_0= ruleTemporalExpression ) ) (otherlv_39= ',' ( (lv_decPred_40_0= ruleTemporalExpression ) ) )* otherlv_41= '}' )? otherlv_42= '}' )
            // InternalMySpectra.g:1216:3: () otherlv_1= 'Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'overflowMethod' otherlv_5= '{' ( (lv_overflowMethod_6_0= ruleOverflowMethod ) ) (otherlv_7= ',' ( (lv_overflowMethod_8_0= ruleOverflowMethod ) ) )* otherlv_9= '}' )? (otherlv_10= 'underflowMethod' otherlv_11= '{' ( (lv_underflowMethod_12_0= ruleOverflowMethod ) ) (otherlv_13= ',' ( (lv_underflowMethod_14_0= ruleOverflowMethod ) ) )* otherlv_15= '}' )? (otherlv_16= 'range' ( (lv_range_17_0= ruleSubrange ) ) )? (otherlv_18= 'initial' otherlv_19= '{' ( (lv_initial_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_initial_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'resetPred' otherlv_25= '{' ( (lv_resetPred_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_resetPred_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )? (otherlv_30= 'incPred' otherlv_31= '{' ( (lv_incPred_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_incPred_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )? (otherlv_36= 'decPred' otherlv_37= '{' ( (lv_decPred_38_0= ruleTemporalExpression ) ) (otherlv_39= ',' ( (lv_decPred_40_0= ruleTemporalExpression ) ) )* otherlv_41= '}' )? otherlv_42= '}'
            {
            // InternalMySpectra.g:1216:3: ()
            // InternalMySpectra.g:1217:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCounterAccess().getCounterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCounterAccess().getCounterKeyword_1());
            		
            // InternalMySpectra.g:1227:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:1228:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:1228:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:1229:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCounterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCounterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getCounterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:1250:3: (otherlv_4= 'overflowMethod' otherlv_5= '{' ( (lv_overflowMethod_6_0= ruleOverflowMethod ) ) (otherlv_7= ',' ( (lv_overflowMethod_8_0= ruleOverflowMethod ) ) )* otherlv_9= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMySpectra.g:1251:4: otherlv_4= 'overflowMethod' otherlv_5= '{' ( (lv_overflowMethod_6_0= ruleOverflowMethod ) ) (otherlv_7= ',' ( (lv_overflowMethod_8_0= ruleOverflowMethod ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getCounterAccess().getOverflowMethodKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getCounterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMySpectra.g:1259:4: ( (lv_overflowMethod_6_0= ruleOverflowMethod ) )
                    // InternalMySpectra.g:1260:5: (lv_overflowMethod_6_0= ruleOverflowMethod )
                    {
                    // InternalMySpectra.g:1260:5: (lv_overflowMethod_6_0= ruleOverflowMethod )
                    // InternalMySpectra.g:1261:6: lv_overflowMethod_6_0= ruleOverflowMethod
                    {

                    						newCompositeNode(grammarAccess.getCounterAccess().getOverflowMethodOverflowMethodEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_overflowMethod_6_0=ruleOverflowMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCounterRule());
                    						}
                    						add(
                    							current,
                    							"overflowMethod",
                    							lv_overflowMethod_6_0,
                    							"org.xtext.example.myspectra.MySpectra.OverflowMethod");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1278:4: (otherlv_7= ',' ( (lv_overflowMethod_8_0= ruleOverflowMethod ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMySpectra.g:1279:5: otherlv_7= ',' ( (lv_overflowMethod_8_0= ruleOverflowMethod ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCounterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMySpectra.g:1283:5: ( (lv_overflowMethod_8_0= ruleOverflowMethod ) )
                    	    // InternalMySpectra.g:1284:6: (lv_overflowMethod_8_0= ruleOverflowMethod )
                    	    {
                    	    // InternalMySpectra.g:1284:6: (lv_overflowMethod_8_0= ruleOverflowMethod )
                    	    // InternalMySpectra.g:1285:7: lv_overflowMethod_8_0= ruleOverflowMethod
                    	    {

                    	    							newCompositeNode(grammarAccess.getCounterAccess().getOverflowMethodOverflowMethodEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_overflowMethod_8_0=ruleOverflowMethod();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCounterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"overflowMethod",
                    	    								lv_overflowMethod_8_0,
                    	    								"org.xtext.example.myspectra.MySpectra.OverflowMethod");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_9, grammarAccess.getCounterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:1308:3: (otherlv_10= 'underflowMethod' otherlv_11= '{' ( (lv_underflowMethod_12_0= ruleOverflowMethod ) ) (otherlv_13= ',' ( (lv_underflowMethod_14_0= ruleOverflowMethod ) ) )* otherlv_15= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMySpectra.g:1309:4: otherlv_10= 'underflowMethod' otherlv_11= '{' ( (lv_underflowMethod_12_0= ruleOverflowMethod ) ) (otherlv_13= ',' ( (lv_underflowMethod_14_0= ruleOverflowMethod ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getCounterAccess().getUnderflowMethodKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getCounterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMySpectra.g:1317:4: ( (lv_underflowMethod_12_0= ruleOverflowMethod ) )
                    // InternalMySpectra.g:1318:5: (lv_underflowMethod_12_0= ruleOverflowMethod )
                    {
                    // InternalMySpectra.g:1318:5: (lv_underflowMethod_12_0= ruleOverflowMethod )
                    // InternalMySpectra.g:1319:6: lv_underflowMethod_12_0= ruleOverflowMethod
                    {

                    						newCompositeNode(grammarAccess.getCounterAccess().getUnderflowMethodOverflowMethodEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_underflowMethod_12_0=ruleOverflowMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCounterRule());
                    						}
                    						add(
                    							current,
                    							"underflowMethod",
                    							lv_underflowMethod_12_0,
                    							"org.xtext.example.myspectra.MySpectra.OverflowMethod");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1336:4: (otherlv_13= ',' ( (lv_underflowMethod_14_0= ruleOverflowMethod ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMySpectra.g:1337:5: otherlv_13= ',' ( (lv_underflowMethod_14_0= ruleOverflowMethod ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getCounterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMySpectra.g:1341:5: ( (lv_underflowMethod_14_0= ruleOverflowMethod ) )
                    	    // InternalMySpectra.g:1342:6: (lv_underflowMethod_14_0= ruleOverflowMethod )
                    	    {
                    	    // InternalMySpectra.g:1342:6: (lv_underflowMethod_14_0= ruleOverflowMethod )
                    	    // InternalMySpectra.g:1343:7: lv_underflowMethod_14_0= ruleOverflowMethod
                    	    {

                    	    							newCompositeNode(grammarAccess.getCounterAccess().getUnderflowMethodOverflowMethodEnumRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_underflowMethod_14_0=ruleOverflowMethod();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCounterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"underflowMethod",
                    	    								lv_underflowMethod_14_0,
                    	    								"org.xtext.example.myspectra.MySpectra.OverflowMethod");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_15, grammarAccess.getCounterAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:1366:3: (otherlv_16= 'range' ( (lv_range_17_0= ruleSubrange ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMySpectra.g:1367:4: otherlv_16= 'range' ( (lv_range_17_0= ruleSubrange ) )
                    {
                    otherlv_16=(Token)match(input,36,FOLLOW_31); 

                    				newLeafNode(otherlv_16, grammarAccess.getCounterAccess().getRangeKeyword_6_0());
                    			
                    // InternalMySpectra.g:1371:4: ( (lv_range_17_0= ruleSubrange ) )
                    // InternalMySpectra.g:1372:5: (lv_range_17_0= ruleSubrange )
                    {
                    // InternalMySpectra.g:1372:5: (lv_range_17_0= ruleSubrange )
                    // InternalMySpectra.g:1373:6: lv_range_17_0= ruleSubrange
                    {

                    						newCompositeNode(grammarAccess.getCounterAccess().getRangeSubrangeParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_range_17_0=ruleSubrange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCounterRule());
                    						}
                    						set(
                    							current,
                    							"range",
                    							lv_range_17_0,
                    							"org.xtext.example.myspectra.MySpectra.Subrange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:1391:3: (otherlv_18= 'initial' otherlv_19= '{' ( (lv_initial_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_initial_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMySpectra.g:1392:4: otherlv_18= 'initial' otherlv_19= '{' ( (lv_initial_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_initial_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getCounterAccess().getInitialKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_19, grammarAccess.getCounterAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMySpectra.g:1400:4: ( (lv_initial_20_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:1401:5: (lv_initial_20_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:1401:5: (lv_initial_20_0= ruleTemporalExpression )
                    // InternalMySpectra.g:1402:6: lv_initial_20_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getCounterAccess().getInitialTemporalExpressionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_initial_20_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCounterRule());
                    						}
                    						add(
                    							current,
                    							"initial",
                    							lv_initial_20_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1419:4: (otherlv_21= ',' ( (lv_initial_22_0= ruleTemporalExpression ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMySpectra.g:1420:5: otherlv_21= ',' ( (lv_initial_22_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getCounterAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMySpectra.g:1424:5: ( (lv_initial_22_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:1425:6: (lv_initial_22_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:1425:6: (lv_initial_22_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:1426:7: lv_initial_22_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCounterAccess().getInitialTemporalExpressionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_initial_22_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCounterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"initial",
                    	    								lv_initial_22_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_33); 

                    				newLeafNode(otherlv_23, grammarAccess.getCounterAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:1449:3: (otherlv_24= 'resetPred' otherlv_25= '{' ( (lv_resetPred_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_resetPred_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMySpectra.g:1450:4: otherlv_24= 'resetPred' otherlv_25= '{' ( (lv_resetPred_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_resetPred_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getCounterAccess().getResetPredKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getCounterAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMySpectra.g:1458:4: ( (lv_resetPred_26_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:1459:5: (lv_resetPred_26_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:1459:5: (lv_resetPred_26_0= ruleTemporalExpression )
                    // InternalMySpectra.g:1460:6: lv_resetPred_26_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getCounterAccess().getResetPredTemporalExpressionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_resetPred_26_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCounterRule());
                    						}
                    						add(
                    							current,
                    							"resetPred",
                    							lv_resetPred_26_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1477:4: (otherlv_27= ',' ( (lv_resetPred_28_0= ruleTemporalExpression ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMySpectra.g:1478:5: otherlv_27= ',' ( (lv_resetPred_28_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getCounterAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMySpectra.g:1482:5: ( (lv_resetPred_28_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:1483:6: (lv_resetPred_28_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:1483:6: (lv_resetPred_28_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:1484:7: lv_resetPred_28_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCounterAccess().getResetPredTemporalExpressionParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_resetPred_28_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCounterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resetPred",
                    	    								lv_resetPred_28_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,15,FOLLOW_34); 

                    				newLeafNode(otherlv_29, grammarAccess.getCounterAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:1507:3: (otherlv_30= 'incPred' otherlv_31= '{' ( (lv_incPred_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_incPred_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMySpectra.g:1508:4: otherlv_30= 'incPred' otherlv_31= '{' ( (lv_incPred_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_incPred_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_30, grammarAccess.getCounterAccess().getIncPredKeyword_9_0());
                    			
                    otherlv_31=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_31, grammarAccess.getCounterAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMySpectra.g:1516:4: ( (lv_incPred_32_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:1517:5: (lv_incPred_32_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:1517:5: (lv_incPred_32_0= ruleTemporalExpression )
                    // InternalMySpectra.g:1518:6: lv_incPred_32_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getCounterAccess().getIncPredTemporalExpressionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_incPred_32_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCounterRule());
                    						}
                    						add(
                    							current,
                    							"incPred",
                    							lv_incPred_32_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1535:4: (otherlv_33= ',' ( (lv_incPred_34_0= ruleTemporalExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMySpectra.g:1536:5: otherlv_33= ',' ( (lv_incPred_34_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_33=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getCounterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMySpectra.g:1540:5: ( (lv_incPred_34_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:1541:6: (lv_incPred_34_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:1541:6: (lv_incPred_34_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:1542:7: lv_incPred_34_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCounterAccess().getIncPredTemporalExpressionParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_incPred_34_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCounterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"incPred",
                    	    								lv_incPred_34_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,15,FOLLOW_35); 

                    				newLeafNode(otherlv_35, grammarAccess.getCounterAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:1565:3: (otherlv_36= 'decPred' otherlv_37= '{' ( (lv_decPred_38_0= ruleTemporalExpression ) ) (otherlv_39= ',' ( (lv_decPred_40_0= ruleTemporalExpression ) ) )* otherlv_41= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMySpectra.g:1566:4: otherlv_36= 'decPred' otherlv_37= '{' ( (lv_decPred_38_0= ruleTemporalExpression ) ) (otherlv_39= ',' ( (lv_decPred_40_0= ruleTemporalExpression ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_36, grammarAccess.getCounterAccess().getDecPredKeyword_10_0());
                    			
                    otherlv_37=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_37, grammarAccess.getCounterAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMySpectra.g:1574:4: ( (lv_decPred_38_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:1575:5: (lv_decPred_38_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:1575:5: (lv_decPred_38_0= ruleTemporalExpression )
                    // InternalMySpectra.g:1576:6: lv_decPred_38_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getCounterAccess().getDecPredTemporalExpressionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_decPred_38_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCounterRule());
                    						}
                    						add(
                    							current,
                    							"decPred",
                    							lv_decPred_38_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1593:4: (otherlv_39= ',' ( (lv_decPred_40_0= ruleTemporalExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalMySpectra.g:1594:5: otherlv_39= ',' ( (lv_decPred_40_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_39=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getCounterAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalMySpectra.g:1598:5: ( (lv_decPred_40_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:1599:6: (lv_decPred_40_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:1599:6: (lv_decPred_40_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:1600:7: lv_decPred_40_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCounterAccess().getDecPredTemporalExpressionParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_decPred_40_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCounterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"decPred",
                    	    								lv_decPred_40_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_41, grammarAccess.getCounterAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_42=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_42, grammarAccess.getCounterAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCounter"


    // $ANTLR start "entryRuleMonitor"
    // InternalMySpectra.g:1631:1: entryRuleMonitor returns [EObject current=null] : iv_ruleMonitor= ruleMonitor EOF ;
    public final EObject entryRuleMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitor = null;


        try {
            // InternalMySpectra.g:1631:48: (iv_ruleMonitor= ruleMonitor EOF )
            // InternalMySpectra.g:1632:2: iv_ruleMonitor= ruleMonitor EOF
            {
             newCompositeNode(grammarAccess.getMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitor=ruleMonitor();

            state._fsp--;

             current =iv_ruleMonitor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitor"


    // $ANTLR start "ruleMonitor"
    // InternalMySpectra.g:1638:1: ruleMonitor returns [EObject current=null] : ( () otherlv_1= 'Monitor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initial' otherlv_7= '{' ( (lv_initial_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_initial_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )? (otherlv_12= 'safety' otherlv_13= '{' ( (lv_safety_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_safety_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )? (otherlv_18= 'stateInv' otherlv_19= '{' ( (lv_stateInv_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_stateInv_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_initial_8_0 = null;

        EObject lv_initial_10_0 = null;

        EObject lv_safety_14_0 = null;

        EObject lv_safety_16_0 = null;

        EObject lv_stateInv_20_0 = null;

        EObject lv_stateInv_22_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:1644:2: ( ( () otherlv_1= 'Monitor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initial' otherlv_7= '{' ( (lv_initial_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_initial_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )? (otherlv_12= 'safety' otherlv_13= '{' ( (lv_safety_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_safety_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )? (otherlv_18= 'stateInv' otherlv_19= '{' ( (lv_stateInv_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_stateInv_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalMySpectra.g:1645:2: ( () otherlv_1= 'Monitor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initial' otherlv_7= '{' ( (lv_initial_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_initial_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )? (otherlv_12= 'safety' otherlv_13= '{' ( (lv_safety_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_safety_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )? (otherlv_18= 'stateInv' otherlv_19= '{' ( (lv_stateInv_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_stateInv_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalMySpectra.g:1645:2: ( () otherlv_1= 'Monitor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initial' otherlv_7= '{' ( (lv_initial_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_initial_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )? (otherlv_12= 'safety' otherlv_13= '{' ( (lv_safety_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_safety_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )? (otherlv_18= 'stateInv' otherlv_19= '{' ( (lv_stateInv_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_stateInv_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalMySpectra.g:1646:3: () otherlv_1= 'Monitor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initial' otherlv_7= '{' ( (lv_initial_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_initial_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )? (otherlv_12= 'safety' otherlv_13= '{' ( (lv_safety_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_safety_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )? (otherlv_18= 'stateInv' otherlv_19= '{' ( (lv_stateInv_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_stateInv_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalMySpectra.g:1646:3: ()
            // InternalMySpectra.g:1647:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMonitorAccess().getMonitorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMonitorAccess().getMonitorKeyword_1());
            		
            // InternalMySpectra.g:1657:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:1658:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:1658:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:1659:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMonitorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getMonitorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:1680:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMySpectra.g:1681:4: otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getMonitorAccess().getTypeKeyword_4_0());
                    			
                    // InternalMySpectra.g:1685:4: ( (lv_type_5_0= ruleVarType ) )
                    // InternalMySpectra.g:1686:5: (lv_type_5_0= ruleVarType )
                    {
                    // InternalMySpectra.g:1686:5: (lv_type_5_0= ruleVarType )
                    // InternalMySpectra.g:1687:6: lv_type_5_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getMonitorAccess().getTypeVarTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_type_5_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.example.myspectra.MySpectra.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:1705:3: (otherlv_6= 'initial' otherlv_7= '{' ( (lv_initial_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_initial_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMySpectra.g:1706:4: otherlv_6= 'initial' otherlv_7= '{' ( (lv_initial_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_initial_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getMonitorAccess().getInitialKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getMonitorAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMySpectra.g:1714:4: ( (lv_initial_8_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:1715:5: (lv_initial_8_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:1715:5: (lv_initial_8_0= ruleTemporalExpression )
                    // InternalMySpectra.g:1716:6: lv_initial_8_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getMonitorAccess().getInitialTemporalExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_initial_8_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitorRule());
                    						}
                    						add(
                    							current,
                    							"initial",
                    							lv_initial_8_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1733:4: (otherlv_9= ',' ( (lv_initial_10_0= ruleTemporalExpression ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalMySpectra.g:1734:5: otherlv_9= ',' ( (lv_initial_10_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMonitorAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMySpectra.g:1738:5: ( (lv_initial_10_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:1739:6: (lv_initial_10_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:1739:6: (lv_initial_10_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:1740:7: lv_initial_10_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getMonitorAccess().getInitialTemporalExpressionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_initial_10_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMonitorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"initial",
                    	    								lv_initial_10_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_38); 

                    				newLeafNode(otherlv_11, grammarAccess.getMonitorAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:1763:3: (otherlv_12= 'safety' otherlv_13= '{' ( (lv_safety_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_safety_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==42) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMySpectra.g:1764:4: otherlv_12= 'safety' otherlv_13= '{' ( (lv_safety_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_safety_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getMonitorAccess().getSafetyKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getMonitorAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMySpectra.g:1772:4: ( (lv_safety_14_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:1773:5: (lv_safety_14_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:1773:5: (lv_safety_14_0= ruleTemporalExpression )
                    // InternalMySpectra.g:1774:6: lv_safety_14_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getMonitorAccess().getSafetyTemporalExpressionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_safety_14_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitorRule());
                    						}
                    						add(
                    							current,
                    							"safety",
                    							lv_safety_14_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1791:4: (otherlv_15= ',' ( (lv_safety_16_0= ruleTemporalExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalMySpectra.g:1792:5: otherlv_15= ',' ( (lv_safety_16_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getMonitorAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMySpectra.g:1796:5: ( (lv_safety_16_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:1797:6: (lv_safety_16_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:1797:6: (lv_safety_16_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:1798:7: lv_safety_16_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getMonitorAccess().getSafetyTemporalExpressionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_safety_16_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMonitorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"safety",
                    	    								lv_safety_16_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_39); 

                    				newLeafNode(otherlv_17, grammarAccess.getMonitorAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:1821:3: (otherlv_18= 'stateInv' otherlv_19= '{' ( (lv_stateInv_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_stateInv_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMySpectra.g:1822:4: otherlv_18= 'stateInv' otherlv_19= '{' ( (lv_stateInv_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_stateInv_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getMonitorAccess().getStateInvKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_19, grammarAccess.getMonitorAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMySpectra.g:1830:4: ( (lv_stateInv_20_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:1831:5: (lv_stateInv_20_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:1831:5: (lv_stateInv_20_0= ruleTemporalExpression )
                    // InternalMySpectra.g:1832:6: lv_stateInv_20_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getMonitorAccess().getStateInvTemporalExpressionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_stateInv_20_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitorRule());
                    						}
                    						add(
                    							current,
                    							"stateInv",
                    							lv_stateInv_20_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1849:4: (otherlv_21= ',' ( (lv_stateInv_22_0= ruleTemporalExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==14) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalMySpectra.g:1850:5: otherlv_21= ',' ( (lv_stateInv_22_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getMonitorAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMySpectra.g:1854:5: ( (lv_stateInv_22_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:1855:6: (lv_stateInv_22_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:1855:6: (lv_stateInv_22_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:1856:7: lv_stateInv_22_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getMonitorAccess().getStateInvTemporalExpressionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_stateInv_22_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMonitorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"stateInv",
                    	    								lv_stateInv_22_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_23, grammarAccess.getMonitorAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getMonitorAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonitor"


    // $ANTLR start "entryRulePattern"
    // InternalMySpectra.g:1887:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMySpectra.g:1887:48: (iv_rulePattern= rulePattern EOF )
            // InternalMySpectra.g:1888:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalMySpectra.g:1894:1: rulePattern returns [EObject current=null] : ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'params' ( (lv_params_5_0= rulePatternParamList ) ) )? (otherlv_6= 'varDeclList' otherlv_7= '{' ( (lv_varDeclList_8_0= ruleVarDecl ) ) (otherlv_9= ',' ( (lv_varDeclList_10_0= ruleVarDecl ) ) )* otherlv_11= '}' )? (otherlv_12= 'initial' otherlv_13= '{' ( (lv_initial_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_initial_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )? (otherlv_18= 'safety' otherlv_19= '{' ( (lv_safety_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_safety_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'stateInv' otherlv_25= '{' ( (lv_stateInv_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_stateInv_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )? (otherlv_30= 'justice' otherlv_31= '{' ( (lv_justice_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_justice_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_varDeclList_8_0 = null;

        EObject lv_varDeclList_10_0 = null;

        EObject lv_initial_14_0 = null;

        EObject lv_initial_16_0 = null;

        EObject lv_safety_20_0 = null;

        EObject lv_safety_22_0 = null;

        EObject lv_stateInv_26_0 = null;

        EObject lv_stateInv_28_0 = null;

        EObject lv_justice_32_0 = null;

        EObject lv_justice_34_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:1900:2: ( ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'params' ( (lv_params_5_0= rulePatternParamList ) ) )? (otherlv_6= 'varDeclList' otherlv_7= '{' ( (lv_varDeclList_8_0= ruleVarDecl ) ) (otherlv_9= ',' ( (lv_varDeclList_10_0= ruleVarDecl ) ) )* otherlv_11= '}' )? (otherlv_12= 'initial' otherlv_13= '{' ( (lv_initial_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_initial_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )? (otherlv_18= 'safety' otherlv_19= '{' ( (lv_safety_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_safety_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'stateInv' otherlv_25= '{' ( (lv_stateInv_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_stateInv_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )? (otherlv_30= 'justice' otherlv_31= '{' ( (lv_justice_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_justice_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) )
            // InternalMySpectra.g:1901:2: ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'params' ( (lv_params_5_0= rulePatternParamList ) ) )? (otherlv_6= 'varDeclList' otherlv_7= '{' ( (lv_varDeclList_8_0= ruleVarDecl ) ) (otherlv_9= ',' ( (lv_varDeclList_10_0= ruleVarDecl ) ) )* otherlv_11= '}' )? (otherlv_12= 'initial' otherlv_13= '{' ( (lv_initial_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_initial_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )? (otherlv_18= 'safety' otherlv_19= '{' ( (lv_safety_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_safety_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'stateInv' otherlv_25= '{' ( (lv_stateInv_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_stateInv_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )? (otherlv_30= 'justice' otherlv_31= '{' ( (lv_justice_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_justice_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            {
            // InternalMySpectra.g:1901:2: ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'params' ( (lv_params_5_0= rulePatternParamList ) ) )? (otherlv_6= 'varDeclList' otherlv_7= '{' ( (lv_varDeclList_8_0= ruleVarDecl ) ) (otherlv_9= ',' ( (lv_varDeclList_10_0= ruleVarDecl ) ) )* otherlv_11= '}' )? (otherlv_12= 'initial' otherlv_13= '{' ( (lv_initial_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_initial_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )? (otherlv_18= 'safety' otherlv_19= '{' ( (lv_safety_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_safety_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'stateInv' otherlv_25= '{' ( (lv_stateInv_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_stateInv_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )? (otherlv_30= 'justice' otherlv_31= '{' ( (lv_justice_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_justice_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            // InternalMySpectra.g:1902:3: () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'params' ( (lv_params_5_0= rulePatternParamList ) ) )? (otherlv_6= 'varDeclList' otherlv_7= '{' ( (lv_varDeclList_8_0= ruleVarDecl ) ) (otherlv_9= ',' ( (lv_varDeclList_10_0= ruleVarDecl ) ) )* otherlv_11= '}' )? (otherlv_12= 'initial' otherlv_13= '{' ( (lv_initial_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_initial_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )? (otherlv_18= 'safety' otherlv_19= '{' ( (lv_safety_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_safety_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'stateInv' otherlv_25= '{' ( (lv_stateInv_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_stateInv_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )? (otherlv_30= 'justice' otherlv_31= '{' ( (lv_justice_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_justice_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )? otherlv_36= '}'
            {
            // InternalMySpectra.g:1902:3: ()
            // InternalMySpectra.g:1903:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternAccess().getPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getPatternKeyword_1());
            		
            // InternalMySpectra.g:1913:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:1914:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:1914:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:1915:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:1936:3: (otherlv_4= 'params' ( (lv_params_5_0= rulePatternParamList ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMySpectra.g:1937:4: otherlv_4= 'params' ( (lv_params_5_0= rulePatternParamList ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getParamsKeyword_4_0());
                    			
                    // InternalMySpectra.g:1941:4: ( (lv_params_5_0= rulePatternParamList ) )
                    // InternalMySpectra.g:1942:5: (lv_params_5_0= rulePatternParamList )
                    {
                    // InternalMySpectra.g:1942:5: (lv_params_5_0= rulePatternParamList )
                    // InternalMySpectra.g:1943:6: lv_params_5_0= rulePatternParamList
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getParamsPatternParamListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_params_5_0=rulePatternParamList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"params",
                    							lv_params_5_0,
                    							"org.xtext.example.myspectra.MySpectra.PatternParamList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:1961:3: (otherlv_6= 'varDeclList' otherlv_7= '{' ( (lv_varDeclList_8_0= ruleVarDecl ) ) (otherlv_9= ',' ( (lv_varDeclList_10_0= ruleVarDecl ) ) )* otherlv_11= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMySpectra.g:1962:4: otherlv_6= 'varDeclList' otherlv_7= '{' ( (lv_varDeclList_8_0= ruleVarDecl ) ) (otherlv_9= ',' ( (lv_varDeclList_10_0= ruleVarDecl ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getVarDeclListKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMySpectra.g:1970:4: ( (lv_varDeclList_8_0= ruleVarDecl ) )
                    // InternalMySpectra.g:1971:5: (lv_varDeclList_8_0= ruleVarDecl )
                    {
                    // InternalMySpectra.g:1971:5: (lv_varDeclList_8_0= ruleVarDecl )
                    // InternalMySpectra.g:1972:6: lv_varDeclList_8_0= ruleVarDecl
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getVarDeclListVarDeclParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_varDeclList_8_0=ruleVarDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						add(
                    							current,
                    							"varDeclList",
                    							lv_varDeclList_8_0,
                    							"org.xtext.example.myspectra.MySpectra.VarDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:1989:4: (otherlv_9= ',' ( (lv_varDeclList_10_0= ruleVarDecl ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==14) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalMySpectra.g:1990:5: otherlv_9= ',' ( (lv_varDeclList_10_0= ruleVarDecl ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMySpectra.g:1994:5: ( (lv_varDeclList_10_0= ruleVarDecl ) )
                    	    // InternalMySpectra.g:1995:6: (lv_varDeclList_10_0= ruleVarDecl )
                    	    {
                    	    // InternalMySpectra.g:1995:6: (lv_varDeclList_10_0= ruleVarDecl )
                    	    // InternalMySpectra.g:1996:7: lv_varDeclList_10_0= ruleVarDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getVarDeclListVarDeclParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_varDeclList_10_0=ruleVarDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"varDeclList",
                    	    								lv_varDeclList_10_0,
                    	    								"org.xtext.example.myspectra.MySpectra.VarDecl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_43); 

                    				newLeafNode(otherlv_11, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:2019:3: (otherlv_12= 'initial' otherlv_13= '{' ( (lv_initial_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_initial_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMySpectra.g:2020:4: otherlv_12= 'initial' otherlv_13= '{' ( (lv_initial_14_0= ruleTemporalExpression ) ) (otherlv_15= ',' ( (lv_initial_16_0= ruleTemporalExpression ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getInitialKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMySpectra.g:2028:4: ( (lv_initial_14_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:2029:5: (lv_initial_14_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:2029:5: (lv_initial_14_0= ruleTemporalExpression )
                    // InternalMySpectra.g:2030:6: lv_initial_14_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getInitialTemporalExpressionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_initial_14_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						add(
                    							current,
                    							"initial",
                    							lv_initial_14_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:2047:4: (otherlv_15= ',' ( (lv_initial_16_0= ruleTemporalExpression ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalMySpectra.g:2048:5: otherlv_15= ',' ( (lv_initial_16_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMySpectra.g:2052:5: ( (lv_initial_16_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:2053:6: (lv_initial_16_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:2053:6: (lv_initial_16_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:2054:7: lv_initial_16_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getInitialTemporalExpressionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_initial_16_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"initial",
                    	    								lv_initial_16_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_44); 

                    				newLeafNode(otherlv_17, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:2077:3: (otherlv_18= 'safety' otherlv_19= '{' ( (lv_safety_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_safety_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMySpectra.g:2078:4: otherlv_18= 'safety' otherlv_19= '{' ( (lv_safety_20_0= ruleTemporalExpression ) ) (otherlv_21= ',' ( (lv_safety_22_0= ruleTemporalExpression ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getPatternAccess().getSafetyKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_19, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMySpectra.g:2086:4: ( (lv_safety_20_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:2087:5: (lv_safety_20_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:2087:5: (lv_safety_20_0= ruleTemporalExpression )
                    // InternalMySpectra.g:2088:6: lv_safety_20_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getSafetyTemporalExpressionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_safety_20_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						add(
                    							current,
                    							"safety",
                    							lv_safety_20_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:2105:4: (otherlv_21= ',' ( (lv_safety_22_0= ruleTemporalExpression ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalMySpectra.g:2106:5: otherlv_21= ',' ( (lv_safety_22_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getPatternAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMySpectra.g:2110:5: ( (lv_safety_22_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:2111:6: (lv_safety_22_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:2111:6: (lv_safety_22_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:2112:7: lv_safety_22_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getSafetyTemporalExpressionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_safety_22_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"safety",
                    	    								lv_safety_22_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_45); 

                    				newLeafNode(otherlv_23, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:2135:3: (otherlv_24= 'stateInv' otherlv_25= '{' ( (lv_stateInv_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_stateInv_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==43) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMySpectra.g:2136:4: otherlv_24= 'stateInv' otherlv_25= '{' ( (lv_stateInv_26_0= ruleTemporalExpression ) ) (otherlv_27= ',' ( (lv_stateInv_28_0= ruleTemporalExpression ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getPatternAccess().getStateInvKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMySpectra.g:2144:4: ( (lv_stateInv_26_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:2145:5: (lv_stateInv_26_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:2145:5: (lv_stateInv_26_0= ruleTemporalExpression )
                    // InternalMySpectra.g:2146:6: lv_stateInv_26_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getStateInvTemporalExpressionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_stateInv_26_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						add(
                    							current,
                    							"stateInv",
                    							lv_stateInv_26_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:2163:4: (otherlv_27= ',' ( (lv_stateInv_28_0= ruleTemporalExpression ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalMySpectra.g:2164:5: otherlv_27= ',' ( (lv_stateInv_28_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getPatternAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMySpectra.g:2168:5: ( (lv_stateInv_28_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:2169:6: (lv_stateInv_28_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:2169:6: (lv_stateInv_28_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:2170:7: lv_stateInv_28_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getStateInvTemporalExpressionParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_stateInv_28_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"stateInv",
                    	    								lv_stateInv_28_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_29, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:2193:3: (otherlv_30= 'justice' otherlv_31= '{' ( (lv_justice_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_justice_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMySpectra.g:2194:4: otherlv_30= 'justice' otherlv_31= '{' ( (lv_justice_32_0= ruleTemporalExpression ) ) (otherlv_33= ',' ( (lv_justice_34_0= ruleTemporalExpression ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_30, grammarAccess.getPatternAccess().getJusticeKeyword_9_0());
                    			
                    otherlv_31=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_31, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMySpectra.g:2202:4: ( (lv_justice_32_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:2203:5: (lv_justice_32_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:2203:5: (lv_justice_32_0= ruleTemporalExpression )
                    // InternalMySpectra.g:2204:6: lv_justice_32_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getJusticeTemporalExpressionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_justice_32_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						add(
                    							current,
                    							"justice",
                    							lv_justice_32_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:2221:4: (otherlv_33= ',' ( (lv_justice_34_0= ruleTemporalExpression ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMySpectra.g:2222:5: otherlv_33= ',' ( (lv_justice_34_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_33=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getPatternAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMySpectra.g:2226:5: ( (lv_justice_34_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:2227:6: (lv_justice_34_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:2227:6: (lv_justice_34_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:2228:7: lv_justice_34_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getJusticeTemporalExpressionParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_justice_34_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"justice",
                    	    								lv_justice_34_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_35, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_36=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRulePredicate"
    // InternalMySpectra.g:2259:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalMySpectra.g:2259:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalMySpectra.g:2260:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalMySpectra.g:2266:1: rulePredicate returns [EObject current=null] : ( () otherlv_1= 'Predicate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'params' ( (lv_params_5_0= ruleTypedParamList ) ) )? (otherlv_6= 'body' ( (lv_body_7_0= ruleTemporalExpression ) ) )? otherlv_8= '}' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:2272:2: ( ( () otherlv_1= 'Predicate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'params' ( (lv_params_5_0= ruleTypedParamList ) ) )? (otherlv_6= 'body' ( (lv_body_7_0= ruleTemporalExpression ) ) )? otherlv_8= '}' ) )
            // InternalMySpectra.g:2273:2: ( () otherlv_1= 'Predicate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'params' ( (lv_params_5_0= ruleTypedParamList ) ) )? (otherlv_6= 'body' ( (lv_body_7_0= ruleTemporalExpression ) ) )? otherlv_8= '}' )
            {
            // InternalMySpectra.g:2273:2: ( () otherlv_1= 'Predicate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'params' ( (lv_params_5_0= ruleTypedParamList ) ) )? (otherlv_6= 'body' ( (lv_body_7_0= ruleTemporalExpression ) ) )? otherlv_8= '}' )
            // InternalMySpectra.g:2274:3: () otherlv_1= 'Predicate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'params' ( (lv_params_5_0= ruleTypedParamList ) ) )? (otherlv_6= 'body' ( (lv_body_7_0= ruleTemporalExpression ) ) )? otherlv_8= '}'
            {
            // InternalMySpectra.g:2274:3: ()
            // InternalMySpectra.g:2275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredicateAccess().getPredicateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getPredicateKeyword_1());
            		
            // InternalMySpectra.g:2285:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:2286:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:2286:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:2287:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPredicateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getPredicateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:2308:3: (otherlv_4= 'params' ( (lv_params_5_0= ruleTypedParamList ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==45) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMySpectra.g:2309:4: otherlv_4= 'params' ( (lv_params_5_0= ruleTypedParamList ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getPredicateAccess().getParamsKeyword_4_0());
                    			
                    // InternalMySpectra.g:2313:4: ( (lv_params_5_0= ruleTypedParamList ) )
                    // InternalMySpectra.g:2314:5: (lv_params_5_0= ruleTypedParamList )
                    {
                    // InternalMySpectra.g:2314:5: (lv_params_5_0= ruleTypedParamList )
                    // InternalMySpectra.g:2315:6: lv_params_5_0= ruleTypedParamList
                    {

                    						newCompositeNode(grammarAccess.getPredicateAccess().getParamsTypedParamListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_params_5_0=ruleTypedParamList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredicateRule());
                    						}
                    						set(
                    							current,
                    							"params",
                    							lv_params_5_0,
                    							"org.xtext.example.myspectra.MySpectra.TypedParamList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2333:3: (otherlv_6= 'body' ( (lv_body_7_0= ruleTemporalExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==49) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMySpectra.g:2334:4: otherlv_6= 'body' ( (lv_body_7_0= ruleTemporalExpression ) )
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getPredicateAccess().getBodyKeyword_5_0());
                    			
                    // InternalMySpectra.g:2338:4: ( (lv_body_7_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:2339:5: (lv_body_7_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:2339:5: (lv_body_7_0= ruleTemporalExpression )
                    // InternalMySpectra.g:2340:6: lv_body_7_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getPredicateAccess().getBodyTemporalExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_body_7_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredicateRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_7_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPredicateAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleLTLGar"
    // InternalMySpectra.g:2366:1: entryRuleLTLGar returns [EObject current=null] : iv_ruleLTLGar= ruleLTLGar EOF ;
    public final EObject entryRuleLTLGar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTLGar = null;


        try {
            // InternalMySpectra.g:2366:47: (iv_ruleLTLGar= ruleLTLGar EOF )
            // InternalMySpectra.g:2367:2: iv_ruleLTLGar= ruleLTLGar EOF
            {
             newCompositeNode(grammarAccess.getLTLGarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLTLGar=ruleLTLGar();

            state._fsp--;

             current =iv_ruleLTLGar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLTLGar"


    // $ANTLR start "ruleLTLGar"
    // InternalMySpectra.g:2373:1: ruleLTLGar returns [EObject current=null] : ( () otherlv_1= 'LTLGar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )? (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )? (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )? (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )? (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )? (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleLTLGar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_safety_5_0 = null;

        AntlrDatatypeRuleToken lv_stateInv_7_0 = null;

        AntlrDatatypeRuleToken lv_justice_9_0 = null;

        EObject lv_params_11_0 = null;

        EObject lv_temporalExpr_13_0 = null;

        EObject lv_trig_15_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:2379:2: ( ( () otherlv_1= 'LTLGar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )? (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )? (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )? (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )? (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )? (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )? otherlv_16= '}' ) )
            // InternalMySpectra.g:2380:2: ( () otherlv_1= 'LTLGar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )? (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )? (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )? (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )? (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )? (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )? otherlv_16= '}' )
            {
            // InternalMySpectra.g:2380:2: ( () otherlv_1= 'LTLGar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )? (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )? (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )? (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )? (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )? (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )? otherlv_16= '}' )
            // InternalMySpectra.g:2381:3: () otherlv_1= 'LTLGar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )? (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )? (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )? (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )? (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )? (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )? otherlv_16= '}'
            {
            // InternalMySpectra.g:2381:3: ()
            // InternalMySpectra.g:2382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLTLGarAccess().getLTLGarAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLTLGarAccess().getLTLGarKeyword_1());
            		
            // InternalMySpectra.g:2392:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:2393:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:2393:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:2394:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLTLGarAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLTLGarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_3, grammarAccess.getLTLGarAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:2415:3: (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMySpectra.g:2416:4: otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getLTLGarAccess().getSafetyKeyword_4_0());
                    			
                    // InternalMySpectra.g:2420:4: ( (lv_safety_5_0= ruleEString ) )
                    // InternalMySpectra.g:2421:5: (lv_safety_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:2421:5: (lv_safety_5_0= ruleEString )
                    // InternalMySpectra.g:2422:6: lv_safety_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLTLGarAccess().getSafetyEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_safety_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLGarRule());
                    						}
                    						set(
                    							current,
                    							"safety",
                    							lv_safety_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2440:3: (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==43) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMySpectra.g:2441:4: otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getLTLGarAccess().getStateInvKeyword_5_0());
                    			
                    // InternalMySpectra.g:2445:4: ( (lv_stateInv_7_0= ruleEString ) )
                    // InternalMySpectra.g:2446:5: (lv_stateInv_7_0= ruleEString )
                    {
                    // InternalMySpectra.g:2446:5: (lv_stateInv_7_0= ruleEString )
                    // InternalMySpectra.g:2447:6: lv_stateInv_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLTLGarAccess().getStateInvEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_stateInv_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLGarRule());
                    						}
                    						set(
                    							current,
                    							"stateInv",
                    							lv_stateInv_7_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2465:3: (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==47) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMySpectra.g:2466:4: otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLTLGarAccess().getJusticeKeyword_6_0());
                    			
                    // InternalMySpectra.g:2470:4: ( (lv_justice_9_0= ruleEString ) )
                    // InternalMySpectra.g:2471:5: (lv_justice_9_0= ruleEString )
                    {
                    // InternalMySpectra.g:2471:5: (lv_justice_9_0= ruleEString )
                    // InternalMySpectra.g:2472:6: lv_justice_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLTLGarAccess().getJusticeEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_justice_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLGarRule());
                    						}
                    						set(
                    							current,
                    							"justice",
                    							lv_justice_9_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2490:3: (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==45) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMySpectra.g:2491:4: otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) )
                    {
                    otherlv_10=(Token)match(input,45,FOLLOW_48); 

                    				newLeafNode(otherlv_10, grammarAccess.getLTLGarAccess().getParamsKeyword_7_0());
                    			
                    // InternalMySpectra.g:2495:4: ( (lv_params_11_0= ruleTypedParamList ) )
                    // InternalMySpectra.g:2496:5: (lv_params_11_0= ruleTypedParamList )
                    {
                    // InternalMySpectra.g:2496:5: (lv_params_11_0= ruleTypedParamList )
                    // InternalMySpectra.g:2497:6: lv_params_11_0= ruleTypedParamList
                    {

                    						newCompositeNode(grammarAccess.getLTLGarAccess().getParamsTypedParamListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_params_11_0=ruleTypedParamList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLGarRule());
                    						}
                    						set(
                    							current,
                    							"params",
                    							lv_params_11_0,
                    							"org.xtext.example.myspectra.MySpectra.TypedParamList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2515:3: (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==51) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMySpectra.g:2516:4: otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) )
                    {
                    otherlv_12=(Token)match(input,51,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getLTLGarAccess().getTemporalExprKeyword_8_0());
                    			
                    // InternalMySpectra.g:2520:4: ( (lv_temporalExpr_13_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:2521:5: (lv_temporalExpr_13_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:2521:5: (lv_temporalExpr_13_0= ruleTemporalExpression )
                    // InternalMySpectra.g:2522:6: lv_temporalExpr_13_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getLTLGarAccess().getTemporalExprTemporalExpressionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_temporalExpr_13_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLGarRule());
                    						}
                    						set(
                    							current,
                    							"temporalExpr",
                    							lv_temporalExpr_13_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2540:3: (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==52) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMySpectra.g:2541:4: otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) )
                    {
                    otherlv_14=(Token)match(input,52,FOLLOW_56); 

                    				newLeafNode(otherlv_14, grammarAccess.getLTLGarAccess().getTrigKeyword_9_0());
                    			
                    // InternalMySpectra.g:2545:4: ( (lv_trig_15_0= ruleTrigger ) )
                    // InternalMySpectra.g:2546:5: (lv_trig_15_0= ruleTrigger )
                    {
                    // InternalMySpectra.g:2546:5: (lv_trig_15_0= ruleTrigger )
                    // InternalMySpectra.g:2547:6: lv_trig_15_0= ruleTrigger
                    {

                    						newCompositeNode(grammarAccess.getLTLGarAccess().getTrigTriggerParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_trig_15_0=ruleTrigger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLGarRule());
                    						}
                    						set(
                    							current,
                    							"trig",
                    							lv_trig_15_0,
                    							"org.xtext.example.myspectra.MySpectra.Trigger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getLTLGarAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLTLGar"


    // $ANTLR start "entryRuleLTLAsm"
    // InternalMySpectra.g:2573:1: entryRuleLTLAsm returns [EObject current=null] : iv_ruleLTLAsm= ruleLTLAsm EOF ;
    public final EObject entryRuleLTLAsm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTLAsm = null;


        try {
            // InternalMySpectra.g:2573:47: (iv_ruleLTLAsm= ruleLTLAsm EOF )
            // InternalMySpectra.g:2574:2: iv_ruleLTLAsm= ruleLTLAsm EOF
            {
             newCompositeNode(grammarAccess.getLTLAsmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLTLAsm=ruleLTLAsm();

            state._fsp--;

             current =iv_ruleLTLAsm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLTLAsm"


    // $ANTLR start "ruleLTLAsm"
    // InternalMySpectra.g:2580:1: ruleLTLAsm returns [EObject current=null] : ( () otherlv_1= 'LTLAsm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )? (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )? (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )? (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )? (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )? (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleLTLAsm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_safety_5_0 = null;

        AntlrDatatypeRuleToken lv_stateInv_7_0 = null;

        AntlrDatatypeRuleToken lv_justice_9_0 = null;

        EObject lv_params_11_0 = null;

        EObject lv_temporalExpr_13_0 = null;

        EObject lv_trig_15_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:2586:2: ( ( () otherlv_1= 'LTLAsm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )? (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )? (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )? (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )? (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )? (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )? otherlv_16= '}' ) )
            // InternalMySpectra.g:2587:2: ( () otherlv_1= 'LTLAsm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )? (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )? (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )? (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )? (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )? (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )? otherlv_16= '}' )
            {
            // InternalMySpectra.g:2587:2: ( () otherlv_1= 'LTLAsm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )? (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )? (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )? (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )? (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )? (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )? otherlv_16= '}' )
            // InternalMySpectra.g:2588:3: () otherlv_1= 'LTLAsm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )? (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )? (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )? (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )? (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )? (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )? otherlv_16= '}'
            {
            // InternalMySpectra.g:2588:3: ()
            // InternalMySpectra.g:2589:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLTLAsmAccess().getLTLAsmAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLTLAsmAccess().getLTLAsmKeyword_1());
            		
            // InternalMySpectra.g:2599:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:2600:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:2600:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:2601:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLTLAsmAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLTLAsmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_3, grammarAccess.getLTLAsmAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:2622:3: (otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==42) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMySpectra.g:2623:4: otherlv_4= 'safety' ( (lv_safety_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getLTLAsmAccess().getSafetyKeyword_4_0());
                    			
                    // InternalMySpectra.g:2627:4: ( (lv_safety_5_0= ruleEString ) )
                    // InternalMySpectra.g:2628:5: (lv_safety_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:2628:5: (lv_safety_5_0= ruleEString )
                    // InternalMySpectra.g:2629:6: lv_safety_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLTLAsmAccess().getSafetyEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_safety_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLAsmRule());
                    						}
                    						set(
                    							current,
                    							"safety",
                    							lv_safety_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2647:3: (otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMySpectra.g:2648:4: otherlv_6= 'stateInv' ( (lv_stateInv_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getLTLAsmAccess().getStateInvKeyword_5_0());
                    			
                    // InternalMySpectra.g:2652:4: ( (lv_stateInv_7_0= ruleEString ) )
                    // InternalMySpectra.g:2653:5: (lv_stateInv_7_0= ruleEString )
                    {
                    // InternalMySpectra.g:2653:5: (lv_stateInv_7_0= ruleEString )
                    // InternalMySpectra.g:2654:6: lv_stateInv_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLTLAsmAccess().getStateInvEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_stateInv_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLAsmRule());
                    						}
                    						set(
                    							current,
                    							"stateInv",
                    							lv_stateInv_7_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2672:3: (otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==47) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMySpectra.g:2673:4: otherlv_8= 'justice' ( (lv_justice_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLTLAsmAccess().getJusticeKeyword_6_0());
                    			
                    // InternalMySpectra.g:2677:4: ( (lv_justice_9_0= ruleEString ) )
                    // InternalMySpectra.g:2678:5: (lv_justice_9_0= ruleEString )
                    {
                    // InternalMySpectra.g:2678:5: (lv_justice_9_0= ruleEString )
                    // InternalMySpectra.g:2679:6: lv_justice_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLTLAsmAccess().getJusticeEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_justice_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLAsmRule());
                    						}
                    						set(
                    							current,
                    							"justice",
                    							lv_justice_9_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2697:3: (otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==45) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMySpectra.g:2698:4: otherlv_10= 'params' ( (lv_params_11_0= ruleTypedParamList ) )
                    {
                    otherlv_10=(Token)match(input,45,FOLLOW_48); 

                    				newLeafNode(otherlv_10, grammarAccess.getLTLAsmAccess().getParamsKeyword_7_0());
                    			
                    // InternalMySpectra.g:2702:4: ( (lv_params_11_0= ruleTypedParamList ) )
                    // InternalMySpectra.g:2703:5: (lv_params_11_0= ruleTypedParamList )
                    {
                    // InternalMySpectra.g:2703:5: (lv_params_11_0= ruleTypedParamList )
                    // InternalMySpectra.g:2704:6: lv_params_11_0= ruleTypedParamList
                    {

                    						newCompositeNode(grammarAccess.getLTLAsmAccess().getParamsTypedParamListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_params_11_0=ruleTypedParamList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLAsmRule());
                    						}
                    						set(
                    							current,
                    							"params",
                    							lv_params_11_0,
                    							"org.xtext.example.myspectra.MySpectra.TypedParamList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2722:3: (otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==51) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMySpectra.g:2723:4: otherlv_12= 'temporalExpr' ( (lv_temporalExpr_13_0= ruleTemporalExpression ) )
                    {
                    otherlv_12=(Token)match(input,51,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getLTLAsmAccess().getTemporalExprKeyword_8_0());
                    			
                    // InternalMySpectra.g:2727:4: ( (lv_temporalExpr_13_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:2728:5: (lv_temporalExpr_13_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:2728:5: (lv_temporalExpr_13_0= ruleTemporalExpression )
                    // InternalMySpectra.g:2729:6: lv_temporalExpr_13_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getLTLAsmAccess().getTemporalExprTemporalExpressionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_temporalExpr_13_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLAsmRule());
                    						}
                    						set(
                    							current,
                    							"temporalExpr",
                    							lv_temporalExpr_13_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2747:3: (otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==52) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMySpectra.g:2748:4: otherlv_14= 'trig' ( (lv_trig_15_0= ruleTrigger ) )
                    {
                    otherlv_14=(Token)match(input,52,FOLLOW_56); 

                    				newLeafNode(otherlv_14, grammarAccess.getLTLAsmAccess().getTrigKeyword_9_0());
                    			
                    // InternalMySpectra.g:2752:4: ( (lv_trig_15_0= ruleTrigger ) )
                    // InternalMySpectra.g:2753:5: (lv_trig_15_0= ruleTrigger )
                    {
                    // InternalMySpectra.g:2753:5: (lv_trig_15_0= ruleTrigger )
                    // InternalMySpectra.g:2754:6: lv_trig_15_0= ruleTrigger
                    {

                    						newCompositeNode(grammarAccess.getLTLAsmAccess().getTrigTriggerParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_trig_15_0=ruleTrigger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLTLAsmRule());
                    						}
                    						set(
                    							current,
                    							"trig",
                    							lv_trig_15_0,
                    							"org.xtext.example.myspectra.MySpectra.Trigger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getLTLAsmAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLTLAsm"


    // $ANTLR start "entryRuleEXGar"
    // InternalMySpectra.g:2780:1: entryRuleEXGar returns [EObject current=null] : iv_ruleEXGar= ruleEXGar EOF ;
    public final EObject entryRuleEXGar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXGar = null;


        try {
            // InternalMySpectra.g:2780:46: (iv_ruleEXGar= ruleEXGar EOF )
            // InternalMySpectra.g:2781:2: iv_ruleEXGar= ruleEXGar EOF
            {
             newCompositeNode(grammarAccess.getEXGarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEXGar=ruleEXGar();

            state._fsp--;

             current =iv_ruleEXGar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXGar"


    // $ANTLR start "ruleEXGar"
    // InternalMySpectra.g:2787:1: ruleEXGar returns [EObject current=null] : ( () otherlv_1= 'EXGar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'regExpPointer' ( ( ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )? (otherlv_12= 'regExp' ( (lv_regExp_13_0= ruleRegExp ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleEXGar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_regExp_13_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:2793:2: ( ( () otherlv_1= 'EXGar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'regExpPointer' ( ( ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )? (otherlv_12= 'regExp' ( (lv_regExp_13_0= ruleRegExp ) ) )? otherlv_14= '}' ) )
            // InternalMySpectra.g:2794:2: ( () otherlv_1= 'EXGar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'regExpPointer' ( ( ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )? (otherlv_12= 'regExp' ( (lv_regExp_13_0= ruleRegExp ) ) )? otherlv_14= '}' )
            {
            // InternalMySpectra.g:2794:2: ( () otherlv_1= 'EXGar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'regExpPointer' ( ( ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )? (otherlv_12= 'regExp' ( (lv_regExp_13_0= ruleRegExp ) ) )? otherlv_14= '}' )
            // InternalMySpectra.g:2795:3: () otherlv_1= 'EXGar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'regExpPointer' ( ( ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )? (otherlv_12= 'regExp' ( (lv_regExp_13_0= ruleRegExp ) ) )? otherlv_14= '}'
            {
            // InternalMySpectra.g:2795:3: ()
            // InternalMySpectra.g:2796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEXGarAccess().getEXGarAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEXGarAccess().getEXGarKeyword_1());
            		
            // InternalMySpectra.g:2806:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:2807:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:2807:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:2808:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEXGarAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEXGarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getEXGarAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:2829:3: (otherlv_4= 'regExpPointer' ( ( ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==55) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMySpectra.g:2830:4: otherlv_4= 'regExpPointer' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEXGarAccess().getRegExpPointerKeyword_4_0());
                    			
                    // InternalMySpectra.g:2834:4: ( ( ruleEString ) )
                    // InternalMySpectra.g:2835:5: ( ruleEString )
                    {
                    // InternalMySpectra.g:2835:5: ( ruleEString )
                    // InternalMySpectra.g:2836:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEXGarRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEXGarAccess().getRegExpPointerDefineRegExpDeclCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:2851:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==16) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMySpectra.g:2852:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleTemporalExpression ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleTemporalExpression ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEXGarAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getEXGarAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMySpectra.g:2860:4: ( (lv_elements_8_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:2861:5: (lv_elements_8_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:2861:5: (lv_elements_8_0= ruleTemporalExpression )
                    // InternalMySpectra.g:2862:6: lv_elements_8_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getEXGarAccess().getElementsTemporalExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elements_8_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEXGarRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_8_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:2879:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleTemporalExpression ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==14) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalMySpectra.g:2880:5: otherlv_9= ',' ( (lv_elements_10_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEXGarAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMySpectra.g:2884:5: ( (lv_elements_10_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:2885:6: (lv_elements_10_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:2885:6: (lv_elements_10_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:2886:7: lv_elements_10_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getEXGarAccess().getElementsTemporalExpressionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_10_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEXGarRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_10_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_59); 

                    				newLeafNode(otherlv_11, grammarAccess.getEXGarAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:2909:3: (otherlv_12= 'regExp' ( (lv_regExp_13_0= ruleRegExp ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==56) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMySpectra.g:2910:4: otherlv_12= 'regExp' ( (lv_regExp_13_0= ruleRegExp ) )
                    {
                    otherlv_12=(Token)match(input,56,FOLLOW_60); 

                    				newLeafNode(otherlv_12, grammarAccess.getEXGarAccess().getRegExpKeyword_6_0());
                    			
                    // InternalMySpectra.g:2914:4: ( (lv_regExp_13_0= ruleRegExp ) )
                    // InternalMySpectra.g:2915:5: (lv_regExp_13_0= ruleRegExp )
                    {
                    // InternalMySpectra.g:2915:5: (lv_regExp_13_0= ruleRegExp )
                    // InternalMySpectra.g:2916:6: lv_regExp_13_0= ruleRegExp
                    {

                    						newCompositeNode(grammarAccess.getEXGarAccess().getRegExpRegExpParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_regExp_13_0=ruleRegExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEXGarRule());
                    						}
                    						set(
                    							current,
                    							"regExp",
                    							lv_regExp_13_0,
                    							"org.xtext.example.myspectra.MySpectra.RegExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEXGarAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXGar"


    // $ANTLR start "entryRuleEInt"
    // InternalMySpectra.g:2942:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMySpectra.g:2942:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMySpectra.g:2943:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMySpectra.g:2949:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMySpectra.g:2955:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMySpectra.g:2956:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMySpectra.g:2956:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMySpectra.g:2957:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMySpectra.g:2957:3: (kw= '-' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==57) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMySpectra.g:2958:4: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_61); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTemporalExpression_Impl"
    // InternalMySpectra.g:2975:1: entryRuleTemporalExpression_Impl returns [EObject current=null] : iv_ruleTemporalExpression_Impl= ruleTemporalExpression_Impl EOF ;
    public final EObject entryRuleTemporalExpression_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalExpression_Impl = null;


        try {
            // InternalMySpectra.g:2975:64: (iv_ruleTemporalExpression_Impl= ruleTemporalExpression_Impl EOF )
            // InternalMySpectra.g:2976:2: iv_ruleTemporalExpression_Impl= ruleTemporalExpression_Impl EOF
            {
             newCompositeNode(grammarAccess.getTemporalExpression_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalExpression_Impl=ruleTemporalExpression_Impl();

            state._fsp--;

             current =iv_ruleTemporalExpression_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalExpression_Impl"


    // $ANTLR start "ruleTemporalExpression_Impl"
    // InternalMySpectra.g:2982:1: ruleTemporalExpression_Impl returns [EObject current=null] : ( () otherlv_1= 'TemporalExpression' ) ;
    public final EObject ruleTemporalExpression_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMySpectra.g:2988:2: ( ( () otherlv_1= 'TemporalExpression' ) )
            // InternalMySpectra.g:2989:2: ( () otherlv_1= 'TemporalExpression' )
            {
            // InternalMySpectra.g:2989:2: ( () otherlv_1= 'TemporalExpression' )
            // InternalMySpectra.g:2990:3: () otherlv_1= 'TemporalExpression'
            {
            // InternalMySpectra.g:2990:3: ()
            // InternalMySpectra.g:2991:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalExpression_ImplAccess().getTemporalExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalExpression_ImplAccess().getTemporalExpressionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalExpression_Impl"


    // $ANTLR start "entryRuleTemporalInExpr"
    // InternalMySpectra.g:3005:1: entryRuleTemporalInExpr returns [EObject current=null] : iv_ruleTemporalInExpr= ruleTemporalInExpr EOF ;
    public final EObject entryRuleTemporalInExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalInExpr = null;


        try {
            // InternalMySpectra.g:3005:55: (iv_ruleTemporalInExpr= ruleTemporalInExpr EOF )
            // InternalMySpectra.g:3006:2: iv_ruleTemporalInExpr= ruleTemporalInExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalInExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalInExpr=ruleTemporalInExpr();

            state._fsp--;

             current =iv_ruleTemporalInExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalInExpr"


    // $ANTLR start "ruleTemporalInExpr"
    // InternalMySpectra.g:3012:1: ruleTemporalInExpr returns [EObject current=null] : ( () ( (lv_not_1_0= 'not' ) )? otherlv_2= 'TemporalInExpr' otherlv_3= '{' (otherlv_4= 'operator' ( (lv_operator_5_0= ruleEString ) ) )? (otherlv_6= 'left' ( (lv_left_7_0= ruleTemporalExpression ) ) )? (otherlv_8= 'values' otherlv_9= '{' ( (lv_values_10_0= ruleValueInRange ) ) (otherlv_11= ',' ( (lv_values_12_0= ruleValueInRange ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleTemporalInExpr() throws RecognitionException {
        EObject current = null;

        Token lv_not_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_operator_5_0 = null;

        EObject lv_left_7_0 = null;

        EObject lv_values_10_0 = null;

        EObject lv_values_12_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:3018:2: ( ( () ( (lv_not_1_0= 'not' ) )? otherlv_2= 'TemporalInExpr' otherlv_3= '{' (otherlv_4= 'operator' ( (lv_operator_5_0= ruleEString ) ) )? (otherlv_6= 'left' ( (lv_left_7_0= ruleTemporalExpression ) ) )? (otherlv_8= 'values' otherlv_9= '{' ( (lv_values_10_0= ruleValueInRange ) ) (otherlv_11= ',' ( (lv_values_12_0= ruleValueInRange ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalMySpectra.g:3019:2: ( () ( (lv_not_1_0= 'not' ) )? otherlv_2= 'TemporalInExpr' otherlv_3= '{' (otherlv_4= 'operator' ( (lv_operator_5_0= ruleEString ) ) )? (otherlv_6= 'left' ( (lv_left_7_0= ruleTemporalExpression ) ) )? (otherlv_8= 'values' otherlv_9= '{' ( (lv_values_10_0= ruleValueInRange ) ) (otherlv_11= ',' ( (lv_values_12_0= ruleValueInRange ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalMySpectra.g:3019:2: ( () ( (lv_not_1_0= 'not' ) )? otherlv_2= 'TemporalInExpr' otherlv_3= '{' (otherlv_4= 'operator' ( (lv_operator_5_0= ruleEString ) ) )? (otherlv_6= 'left' ( (lv_left_7_0= ruleTemporalExpression ) ) )? (otherlv_8= 'values' otherlv_9= '{' ( (lv_values_10_0= ruleValueInRange ) ) (otherlv_11= ',' ( (lv_values_12_0= ruleValueInRange ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalMySpectra.g:3020:3: () ( (lv_not_1_0= 'not' ) )? otherlv_2= 'TemporalInExpr' otherlv_3= '{' (otherlv_4= 'operator' ( (lv_operator_5_0= ruleEString ) ) )? (otherlv_6= 'left' ( (lv_left_7_0= ruleTemporalExpression ) ) )? (otherlv_8= 'values' otherlv_9= '{' ( (lv_values_10_0= ruleValueInRange ) ) (otherlv_11= ',' ( (lv_values_12_0= ruleValueInRange ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalMySpectra.g:3020:3: ()
            // InternalMySpectra.g:3021:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalInExprAccess().getTemporalInExprAction_0(),
            					current);
            			

            }

            // InternalMySpectra.g:3027:3: ( (lv_not_1_0= 'not' ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==59) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMySpectra.g:3028:4: (lv_not_1_0= 'not' )
                    {
                    // InternalMySpectra.g:3028:4: (lv_not_1_0= 'not' )
                    // InternalMySpectra.g:3029:5: lv_not_1_0= 'not'
                    {
                    lv_not_1_0=(Token)match(input,59,FOLLOW_62); 

                    					newLeafNode(lv_not_1_0, grammarAccess.getTemporalInExprAccess().getNotNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTemporalInExprRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_1_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalInExprAccess().getTemporalInExprKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getTemporalInExprAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:3049:3: (otherlv_4= 'operator' ( (lv_operator_5_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==61) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMySpectra.g:3050:4: otherlv_4= 'operator' ( (lv_operator_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTemporalInExprAccess().getOperatorKeyword_4_0());
                    			
                    // InternalMySpectra.g:3054:4: ( (lv_operator_5_0= ruleEString ) )
                    // InternalMySpectra.g:3055:5: (lv_operator_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:3055:5: (lv_operator_5_0= ruleEString )
                    // InternalMySpectra.g:3056:6: lv_operator_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalInExprAccess().getOperatorEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_operator_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalInExprRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:3074:3: (otherlv_6= 'left' ( (lv_left_7_0= ruleTemporalExpression ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==62) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalMySpectra.g:3075:4: otherlv_6= 'left' ( (lv_left_7_0= ruleTemporalExpression ) )
                    {
                    otherlv_6=(Token)match(input,62,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getTemporalInExprAccess().getLeftKeyword_5_0());
                    			
                    // InternalMySpectra.g:3079:4: ( (lv_left_7_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:3080:5: (lv_left_7_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:3080:5: (lv_left_7_0= ruleTemporalExpression )
                    // InternalMySpectra.g:3081:6: lv_left_7_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalInExprAccess().getLeftTemporalExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_left_7_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalInExprRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_7_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:3099:3: (otherlv_8= 'values' otherlv_9= '{' ( (lv_values_10_0= ruleValueInRange ) ) (otherlv_11= ',' ( (lv_values_12_0= ruleValueInRange ) ) )* otherlv_13= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==63) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMySpectra.g:3100:4: otherlv_8= 'values' otherlv_9= '{' ( (lv_values_10_0= ruleValueInRange ) ) (otherlv_11= ',' ( (lv_values_12_0= ruleValueInRange ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getTemporalInExprAccess().getValuesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_66); 

                    				newLeafNode(otherlv_9, grammarAccess.getTemporalInExprAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMySpectra.g:3108:4: ( (lv_values_10_0= ruleValueInRange ) )
                    // InternalMySpectra.g:3109:5: (lv_values_10_0= ruleValueInRange )
                    {
                    // InternalMySpectra.g:3109:5: (lv_values_10_0= ruleValueInRange )
                    // InternalMySpectra.g:3110:6: lv_values_10_0= ruleValueInRange
                    {

                    						newCompositeNode(grammarAccess.getTemporalInExprAccess().getValuesValueInRangeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_values_10_0=ruleValueInRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalInExprRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_10_0,
                    							"org.xtext.example.myspectra.MySpectra.ValueInRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:3127:4: (otherlv_11= ',' ( (lv_values_12_0= ruleValueInRange ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==14) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalMySpectra.g:3128:5: otherlv_11= ',' ( (lv_values_12_0= ruleValueInRange ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_66); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getTemporalInExprAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMySpectra.g:3132:5: ( (lv_values_12_0= ruleValueInRange ) )
                    	    // InternalMySpectra.g:3133:6: (lv_values_12_0= ruleValueInRange )
                    	    {
                    	    // InternalMySpectra.g:3133:6: (lv_values_12_0= ruleValueInRange )
                    	    // InternalMySpectra.g:3134:7: lv_values_12_0= ruleValueInRange
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalInExprAccess().getValuesValueInRangeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_values_12_0=ruleValueInRange();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalInExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_12_0,
                    	    								"org.xtext.example.myspectra.MySpectra.ValueInRange");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getTemporalInExprAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTemporalInExprAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalInExpr"


    // $ANTLR start "entryRuleTemporalImpExpr"
    // InternalMySpectra.g:3165:1: entryRuleTemporalImpExpr returns [EObject current=null] : iv_ruleTemporalImpExpr= ruleTemporalImpExpr EOF ;
    public final EObject entryRuleTemporalImpExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalImpExpr = null;


        try {
            // InternalMySpectra.g:3165:56: (iv_ruleTemporalImpExpr= ruleTemporalImpExpr EOF )
            // InternalMySpectra.g:3166:2: iv_ruleTemporalImpExpr= ruleTemporalImpExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalImpExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalImpExpr=ruleTemporalImpExpr();

            state._fsp--;

             current =iv_ruleTemporalImpExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalImpExpr"


    // $ANTLR start "ruleTemporalImpExpr"
    // InternalMySpectra.g:3172:1: ruleTemporalImpExpr returns [EObject current=null] : ( () otherlv_1= 'TemporalImpExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'implication' ( (lv_implication_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleTemporalImpExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_operator_4_0 = null;

        EObject lv_left_6_0 = null;

        EObject lv_implication_8_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:3178:2: ( ( () otherlv_1= 'TemporalImpExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'implication' ( (lv_implication_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' ) )
            // InternalMySpectra.g:3179:2: ( () otherlv_1= 'TemporalImpExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'implication' ( (lv_implication_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' )
            {
            // InternalMySpectra.g:3179:2: ( () otherlv_1= 'TemporalImpExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'implication' ( (lv_implication_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' )
            // InternalMySpectra.g:3180:3: () otherlv_1= 'TemporalImpExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'implication' ( (lv_implication_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}'
            {
            // InternalMySpectra.g:3180:3: ()
            // InternalMySpectra.g:3181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalImpExprAccess().getTemporalImpExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalImpExprAccess().getTemporalImpExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalImpExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:3195:3: (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==61) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMySpectra.g:3196:4: otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalImpExprAccess().getOperatorKeyword_3_0());
                    			
                    // InternalMySpectra.g:3200:4: ( (lv_operator_4_0= ruleEString ) )
                    // InternalMySpectra.g:3201:5: (lv_operator_4_0= ruleEString )
                    {
                    // InternalMySpectra.g:3201:5: (lv_operator_4_0= ruleEString )
                    // InternalMySpectra.g:3202:6: lv_operator_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalImpExprAccess().getOperatorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_operator_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalImpExprRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:3220:3: (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==62) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMySpectra.g:3221:4: otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) )
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getTemporalImpExprAccess().getLeftKeyword_4_0());
                    			
                    // InternalMySpectra.g:3225:4: ( (lv_left_6_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:3226:5: (lv_left_6_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:3226:5: (lv_left_6_0= ruleTemporalExpression )
                    // InternalMySpectra.g:3227:6: lv_left_6_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalImpExprAccess().getLeftTemporalExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_left_6_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalImpExprRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_6_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:3245:3: (otherlv_7= 'implication' ( (lv_implication_8_0= ruleTemporalExpression ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==65) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalMySpectra.g:3246:4: otherlv_7= 'implication' ( (lv_implication_8_0= ruleTemporalExpression ) )
                    {
                    otherlv_7=(Token)match(input,65,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getTemporalImpExprAccess().getImplicationKeyword_5_0());
                    			
                    // InternalMySpectra.g:3250:4: ( (lv_implication_8_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:3251:5: (lv_implication_8_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:3251:5: (lv_implication_8_0= ruleTemporalExpression )
                    // InternalMySpectra.g:3252:6: lv_implication_8_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalImpExprAccess().getImplicationTemporalExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_implication_8_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalImpExprRule());
                    						}
                    						set(
                    							current,
                    							"implication",
                    							lv_implication_8_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTemporalImpExprAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalImpExpr"


    // $ANTLR start "entryRuleTemporalIffExpr"
    // InternalMySpectra.g:3278:1: entryRuleTemporalIffExpr returns [EObject current=null] : iv_ruleTemporalIffExpr= ruleTemporalIffExpr EOF ;
    public final EObject entryRuleTemporalIffExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalIffExpr = null;


        try {
            // InternalMySpectra.g:3278:56: (iv_ruleTemporalIffExpr= ruleTemporalIffExpr EOF )
            // InternalMySpectra.g:3279:2: iv_ruleTemporalIffExpr= ruleTemporalIffExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalIffExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalIffExpr=ruleTemporalIffExpr();

            state._fsp--;

             current =iv_ruleTemporalIffExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalIffExpr"


    // $ANTLR start "ruleTemporalIffExpr"
    // InternalMySpectra.g:3285:1: ruleTemporalIffExpr returns [EObject current=null] : ( () otherlv_1= 'TemporalIffExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleTemporalExpression ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleTemporalExpression ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleTemporalIffExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_operator_4_0 = null;

        EObject lv_elements_7_0 = null;

        EObject lv_elements_9_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:3291:2: ( ( () otherlv_1= 'TemporalIffExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleTemporalExpression ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleTemporalExpression ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMySpectra.g:3292:2: ( () otherlv_1= 'TemporalIffExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleTemporalExpression ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleTemporalExpression ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMySpectra.g:3292:2: ( () otherlv_1= 'TemporalIffExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleTemporalExpression ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleTemporalExpression ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMySpectra.g:3293:3: () otherlv_1= 'TemporalIffExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleTemporalExpression ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleTemporalExpression ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMySpectra.g:3293:3: ()
            // InternalMySpectra.g:3294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalIffExprAccess().getTemporalIffExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalIffExprAccess().getTemporalIffExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalIffExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:3308:3: (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==61) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalMySpectra.g:3309:4: otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalIffExprAccess().getOperatorKeyword_3_0());
                    			
                    // InternalMySpectra.g:3313:4: ( (lv_operator_4_0= ruleEString ) )
                    // InternalMySpectra.g:3314:5: (lv_operator_4_0= ruleEString )
                    {
                    // InternalMySpectra.g:3314:5: (lv_operator_4_0= ruleEString )
                    // InternalMySpectra.g:3315:6: lv_operator_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalIffExprAccess().getOperatorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_operator_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalIffExprRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:3333:3: (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleTemporalExpression ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleTemporalExpression ) ) )* otherlv_10= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==16) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalMySpectra.g:3334:4: otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleTemporalExpression ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleTemporalExpression ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getTemporalIffExprAccess().getElementsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getTemporalIffExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMySpectra.g:3342:4: ( (lv_elements_7_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:3343:5: (lv_elements_7_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:3343:5: (lv_elements_7_0= ruleTemporalExpression )
                    // InternalMySpectra.g:3344:6: lv_elements_7_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalIffExprAccess().getElementsTemporalExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elements_7_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalIffExprRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_7_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:3361:4: (otherlv_8= ',' ( (lv_elements_9_0= ruleTemporalExpression ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==14) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalMySpectra.g:3362:5: otherlv_8= ',' ( (lv_elements_9_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTemporalIffExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMySpectra.g:3366:5: ( (lv_elements_9_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:3367:6: (lv_elements_9_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:3367:6: (lv_elements_9_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:3368:7: lv_elements_9_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalIffExprAccess().getElementsTemporalExpressionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_9_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalIffExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_9_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getTemporalIffExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTemporalIffExprAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalIffExpr"


    // $ANTLR start "entryRuleTemporalOrExpr"
    // InternalMySpectra.g:3399:1: entryRuleTemporalOrExpr returns [EObject current=null] : iv_ruleTemporalOrExpr= ruleTemporalOrExpr EOF ;
    public final EObject entryRuleTemporalOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalOrExpr = null;


        try {
            // InternalMySpectra.g:3399:55: (iv_ruleTemporalOrExpr= ruleTemporalOrExpr EOF )
            // InternalMySpectra.g:3400:2: iv_ruleTemporalOrExpr= ruleTemporalOrExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalOrExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalOrExpr=ruleTemporalOrExpr();

            state._fsp--;

             current =iv_ruleTemporalOrExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalOrExpr"


    // $ANTLR start "ruleTemporalOrExpr"
    // InternalMySpectra.g:3406:1: ruleTemporalOrExpr returns [EObject current=null] : ( () otherlv_1= 'TemporalOrExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleTemporalOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_operator_5_0 = null;

        AntlrDatatypeRuleToken lv_operator_7_0 = null;

        EObject lv_elements_11_0 = null;

        EObject lv_elements_13_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:3412:2: ( ( () otherlv_1= 'TemporalOrExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMySpectra.g:3413:2: ( () otherlv_1= 'TemporalOrExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMySpectra.g:3413:2: ( () otherlv_1= 'TemporalOrExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMySpectra.g:3414:3: () otherlv_1= 'TemporalOrExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalMySpectra.g:3414:3: ()
            // InternalMySpectra.g:3415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalOrExprAccess().getTemporalOrExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalOrExprAccess().getTemporalOrExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalOrExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:3429:3: (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==61) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalMySpectra.g:3430:4: otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalOrExprAccess().getOperatorKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTemporalOrExprAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMySpectra.g:3438:4: ( (lv_operator_5_0= ruleEString ) )
                    // InternalMySpectra.g:3439:5: (lv_operator_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:3439:5: (lv_operator_5_0= ruleEString )
                    // InternalMySpectra.g:3440:6: lv_operator_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalOrExprAccess().getOperatorEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_operator_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalOrExprRule());
                    						}
                    						add(
                    							current,
                    							"operator",
                    							lv_operator_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:3457:4: (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==14) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalMySpectra.g:3458:5: otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTemporalOrExprAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMySpectra.g:3462:5: ( (lv_operator_7_0= ruleEString ) )
                    	    // InternalMySpectra.g:3463:6: (lv_operator_7_0= ruleEString )
                    	    {
                    	    // InternalMySpectra.g:3463:6: (lv_operator_7_0= ruleEString )
                    	    // InternalMySpectra.g:3464:7: lv_operator_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalOrExprAccess().getOperatorEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_operator_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalOrExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operator",
                    	    								lv_operator_7_0,
                    	    								"org.xtext.example.myspectra.MySpectra.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getTemporalOrExprAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:3487:3: (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==16) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMySpectra.g:3488:4: otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getTemporalOrExprAccess().getElementsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getTemporalOrExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMySpectra.g:3496:4: ( (lv_elements_11_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:3497:5: (lv_elements_11_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:3497:5: (lv_elements_11_0= ruleTemporalExpression )
                    // InternalMySpectra.g:3498:6: lv_elements_11_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalOrExprAccess().getElementsTemporalExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elements_11_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalOrExprRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_11_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:3515:4: (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==14) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalMySpectra.g:3516:5: otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTemporalOrExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMySpectra.g:3520:5: ( (lv_elements_13_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:3521:6: (lv_elements_13_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:3521:6: (lv_elements_13_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:3522:7: lv_elements_13_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalOrExprAccess().getElementsTemporalExpressionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_13_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalOrExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_13_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getTemporalOrExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTemporalOrExprAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalOrExpr"


    // $ANTLR start "entryRuleTemporalAndExpr"
    // InternalMySpectra.g:3553:1: entryRuleTemporalAndExpr returns [EObject current=null] : iv_ruleTemporalAndExpr= ruleTemporalAndExpr EOF ;
    public final EObject entryRuleTemporalAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalAndExpr = null;


        try {
            // InternalMySpectra.g:3553:56: (iv_ruleTemporalAndExpr= ruleTemporalAndExpr EOF )
            // InternalMySpectra.g:3554:2: iv_ruleTemporalAndExpr= ruleTemporalAndExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalAndExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalAndExpr=ruleTemporalAndExpr();

            state._fsp--;

             current =iv_ruleTemporalAndExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalAndExpr"


    // $ANTLR start "ruleTemporalAndExpr"
    // InternalMySpectra.g:3560:1: ruleTemporalAndExpr returns [EObject current=null] : ( () otherlv_1= 'TemporalAndExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleTemporalAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_operator_5_0 = null;

        AntlrDatatypeRuleToken lv_operator_7_0 = null;

        EObject lv_elements_11_0 = null;

        EObject lv_elements_13_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:3566:2: ( ( () otherlv_1= 'TemporalAndExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMySpectra.g:3567:2: ( () otherlv_1= 'TemporalAndExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMySpectra.g:3567:2: ( () otherlv_1= 'TemporalAndExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMySpectra.g:3568:3: () otherlv_1= 'TemporalAndExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalMySpectra.g:3568:3: ()
            // InternalMySpectra.g:3569:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalAndExprAccess().getTemporalAndExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalAndExprAccess().getTemporalAndExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalAndExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:3583:3: (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==61) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalMySpectra.g:3584:4: otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalAndExprAccess().getOperatorKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTemporalAndExprAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMySpectra.g:3592:4: ( (lv_operator_5_0= ruleEString ) )
                    // InternalMySpectra.g:3593:5: (lv_operator_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:3593:5: (lv_operator_5_0= ruleEString )
                    // InternalMySpectra.g:3594:6: lv_operator_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalAndExprAccess().getOperatorEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_operator_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalAndExprRule());
                    						}
                    						add(
                    							current,
                    							"operator",
                    							lv_operator_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:3611:4: (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==14) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalMySpectra.g:3612:5: otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTemporalAndExprAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMySpectra.g:3616:5: ( (lv_operator_7_0= ruleEString ) )
                    	    // InternalMySpectra.g:3617:6: (lv_operator_7_0= ruleEString )
                    	    {
                    	    // InternalMySpectra.g:3617:6: (lv_operator_7_0= ruleEString )
                    	    // InternalMySpectra.g:3618:7: lv_operator_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalAndExprAccess().getOperatorEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_operator_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalAndExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operator",
                    	    								lv_operator_7_0,
                    	    								"org.xtext.example.myspectra.MySpectra.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getTemporalAndExprAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:3641:3: (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==16) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalMySpectra.g:3642:4: otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getTemporalAndExprAccess().getElementsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getTemporalAndExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMySpectra.g:3650:4: ( (lv_elements_11_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:3651:5: (lv_elements_11_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:3651:5: (lv_elements_11_0= ruleTemporalExpression )
                    // InternalMySpectra.g:3652:6: lv_elements_11_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalAndExprAccess().getElementsTemporalExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elements_11_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalAndExprRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_11_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:3669:4: (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==14) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalMySpectra.g:3670:5: otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTemporalAndExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMySpectra.g:3674:5: ( (lv_elements_13_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:3675:6: (lv_elements_13_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:3675:6: (lv_elements_13_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:3676:7: lv_elements_13_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalAndExprAccess().getElementsTemporalExpressionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_13_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalAndExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_13_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getTemporalAndExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTemporalAndExprAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalAndExpr"


    // $ANTLR start "entryRuleTemporalRelationalExpr"
    // InternalMySpectra.g:3707:1: entryRuleTemporalRelationalExpr returns [EObject current=null] : iv_ruleTemporalRelationalExpr= ruleTemporalRelationalExpr EOF ;
    public final EObject entryRuleTemporalRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalRelationalExpr = null;


        try {
            // InternalMySpectra.g:3707:63: (iv_ruleTemporalRelationalExpr= ruleTemporalRelationalExpr EOF )
            // InternalMySpectra.g:3708:2: iv_ruleTemporalRelationalExpr= ruleTemporalRelationalExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalRelationalExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalRelationalExpr=ruleTemporalRelationalExpr();

            state._fsp--;

             current =iv_ruleTemporalRelationalExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalRelationalExpr"


    // $ANTLR start "ruleTemporalRelationalExpr"
    // InternalMySpectra.g:3714:1: ruleTemporalRelationalExpr returns [EObject current=null] : ( () otherlv_1= 'TemporalRelationalExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleTemporalRelationalExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_operator_4_0 = null;

        EObject lv_left_6_0 = null;

        EObject lv_right_8_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:3720:2: ( ( () otherlv_1= 'TemporalRelationalExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' ) )
            // InternalMySpectra.g:3721:2: ( () otherlv_1= 'TemporalRelationalExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' )
            {
            // InternalMySpectra.g:3721:2: ( () otherlv_1= 'TemporalRelationalExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' )
            // InternalMySpectra.g:3722:3: () otherlv_1= 'TemporalRelationalExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}'
            {
            // InternalMySpectra.g:3722:3: ()
            // InternalMySpectra.g:3723:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalRelationalExprAccess().getTemporalRelationalExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalRelationalExprAccess().getTemporalRelationalExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalRelationalExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:3737:3: (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==61) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalMySpectra.g:3738:4: otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalRelationalExprAccess().getOperatorKeyword_3_0());
                    			
                    // InternalMySpectra.g:3742:4: ( (lv_operator_4_0= ruleEString ) )
                    // InternalMySpectra.g:3743:5: (lv_operator_4_0= ruleEString )
                    {
                    // InternalMySpectra.g:3743:5: (lv_operator_4_0= ruleEString )
                    // InternalMySpectra.g:3744:6: lv_operator_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalRelationalExprAccess().getOperatorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_operator_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalRelationalExprRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:3762:3: (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==62) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalMySpectra.g:3763:4: otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) )
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getTemporalRelationalExprAccess().getLeftKeyword_4_0());
                    			
                    // InternalMySpectra.g:3767:4: ( (lv_left_6_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:3768:5: (lv_left_6_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:3768:5: (lv_left_6_0= ruleTemporalExpression )
                    // InternalMySpectra.g:3769:6: lv_left_6_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalRelationalExprAccess().getLeftTemporalExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_left_6_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalRelationalExprRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_6_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:3787:3: (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==70) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalMySpectra.g:3788:4: otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) )
                    {
                    otherlv_7=(Token)match(input,70,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getTemporalRelationalExprAccess().getRightKeyword_5_0());
                    			
                    // InternalMySpectra.g:3792:4: ( (lv_right_8_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:3793:5: (lv_right_8_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:3793:5: (lv_right_8_0= ruleTemporalExpression )
                    // InternalMySpectra.g:3794:6: lv_right_8_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalRelationalExprAccess().getRightTemporalExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_right_8_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalRelationalExprRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_8_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTemporalRelationalExprAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalRelationalExpr"


    // $ANTLR start "entryRuleTemporalRemainderExpr"
    // InternalMySpectra.g:3820:1: entryRuleTemporalRemainderExpr returns [EObject current=null] : iv_ruleTemporalRemainderExpr= ruleTemporalRemainderExpr EOF ;
    public final EObject entryRuleTemporalRemainderExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalRemainderExpr = null;


        try {
            // InternalMySpectra.g:3820:62: (iv_ruleTemporalRemainderExpr= ruleTemporalRemainderExpr EOF )
            // InternalMySpectra.g:3821:2: iv_ruleTemporalRemainderExpr= ruleTemporalRemainderExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalRemainderExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalRemainderExpr=ruleTemporalRemainderExpr();

            state._fsp--;

             current =iv_ruleTemporalRemainderExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalRemainderExpr"


    // $ANTLR start "ruleTemporalRemainderExpr"
    // InternalMySpectra.g:3827:1: ruleTemporalRemainderExpr returns [EObject current=null] : ( () otherlv_1= 'TemporalRemainderExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleTemporalRemainderExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_operator_4_0 = null;

        EObject lv_left_6_0 = null;

        EObject lv_right_8_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:3833:2: ( ( () otherlv_1= 'TemporalRemainderExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' ) )
            // InternalMySpectra.g:3834:2: ( () otherlv_1= 'TemporalRemainderExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' )
            {
            // InternalMySpectra.g:3834:2: ( () otherlv_1= 'TemporalRemainderExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' )
            // InternalMySpectra.g:3835:3: () otherlv_1= 'TemporalRemainderExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )? (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}'
            {
            // InternalMySpectra.g:3835:3: ()
            // InternalMySpectra.g:3836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalRemainderExprAccess().getTemporalRemainderExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalRemainderExprAccess().getTemporalRemainderExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalRemainderExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:3850:3: (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==61) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalMySpectra.g:3851:4: otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalRemainderExprAccess().getOperatorKeyword_3_0());
                    			
                    // InternalMySpectra.g:3855:4: ( (lv_operator_4_0= ruleEString ) )
                    // InternalMySpectra.g:3856:5: (lv_operator_4_0= ruleEString )
                    {
                    // InternalMySpectra.g:3856:5: (lv_operator_4_0= ruleEString )
                    // InternalMySpectra.g:3857:6: lv_operator_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalRemainderExprAccess().getOperatorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_operator_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalRemainderExprRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:3875:3: (otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==62) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalMySpectra.g:3876:4: otherlv_5= 'left' ( (lv_left_6_0= ruleTemporalExpression ) )
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getTemporalRemainderExprAccess().getLeftKeyword_4_0());
                    			
                    // InternalMySpectra.g:3880:4: ( (lv_left_6_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:3881:5: (lv_left_6_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:3881:5: (lv_left_6_0= ruleTemporalExpression )
                    // InternalMySpectra.g:3882:6: lv_left_6_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalRemainderExprAccess().getLeftTemporalExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_left_6_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalRemainderExprRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_6_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:3900:3: (otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==70) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalMySpectra.g:3901:4: otherlv_7= 'right' ( (lv_right_8_0= ruleTemporalExpression ) )
                    {
                    otherlv_7=(Token)match(input,70,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getTemporalRemainderExprAccess().getRightKeyword_5_0());
                    			
                    // InternalMySpectra.g:3905:4: ( (lv_right_8_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:3906:5: (lv_right_8_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:3906:5: (lv_right_8_0= ruleTemporalExpression )
                    // InternalMySpectra.g:3907:6: lv_right_8_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalRemainderExprAccess().getRightTemporalExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_right_8_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalRemainderExprRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_8_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTemporalRemainderExprAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalRemainderExpr"


    // $ANTLR start "entryRuleTemporalAdditiveExpr"
    // InternalMySpectra.g:3933:1: entryRuleTemporalAdditiveExpr returns [EObject current=null] : iv_ruleTemporalAdditiveExpr= ruleTemporalAdditiveExpr EOF ;
    public final EObject entryRuleTemporalAdditiveExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalAdditiveExpr = null;


        try {
            // InternalMySpectra.g:3933:61: (iv_ruleTemporalAdditiveExpr= ruleTemporalAdditiveExpr EOF )
            // InternalMySpectra.g:3934:2: iv_ruleTemporalAdditiveExpr= ruleTemporalAdditiveExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalAdditiveExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalAdditiveExpr=ruleTemporalAdditiveExpr();

            state._fsp--;

             current =iv_ruleTemporalAdditiveExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalAdditiveExpr"


    // $ANTLR start "ruleTemporalAdditiveExpr"
    // InternalMySpectra.g:3940:1: ruleTemporalAdditiveExpr returns [EObject current=null] : ( () otherlv_1= 'TemporalAdditiveExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleTemporalAdditiveExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_operator_5_0 = null;

        AntlrDatatypeRuleToken lv_operator_7_0 = null;

        EObject lv_elements_11_0 = null;

        EObject lv_elements_13_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:3946:2: ( ( () otherlv_1= 'TemporalAdditiveExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMySpectra.g:3947:2: ( () otherlv_1= 'TemporalAdditiveExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMySpectra.g:3947:2: ( () otherlv_1= 'TemporalAdditiveExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMySpectra.g:3948:3: () otherlv_1= 'TemporalAdditiveExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalMySpectra.g:3948:3: ()
            // InternalMySpectra.g:3949:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalAdditiveExprAccess().getTemporalAdditiveExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalAdditiveExprAccess().getTemporalAdditiveExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalAdditiveExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:3963:3: (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==61) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalMySpectra.g:3964:4: otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalAdditiveExprAccess().getOperatorKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTemporalAdditiveExprAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMySpectra.g:3972:4: ( (lv_operator_5_0= ruleEString ) )
                    // InternalMySpectra.g:3973:5: (lv_operator_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:3973:5: (lv_operator_5_0= ruleEString )
                    // InternalMySpectra.g:3974:6: lv_operator_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalAdditiveExprAccess().getOperatorEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_operator_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalAdditiveExprRule());
                    						}
                    						add(
                    							current,
                    							"operator",
                    							lv_operator_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:3991:4: (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==14) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalMySpectra.g:3992:5: otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTemporalAdditiveExprAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMySpectra.g:3996:5: ( (lv_operator_7_0= ruleEString ) )
                    	    // InternalMySpectra.g:3997:6: (lv_operator_7_0= ruleEString )
                    	    {
                    	    // InternalMySpectra.g:3997:6: (lv_operator_7_0= ruleEString )
                    	    // InternalMySpectra.g:3998:7: lv_operator_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalAdditiveExprAccess().getOperatorEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_operator_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalAdditiveExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operator",
                    	    								lv_operator_7_0,
                    	    								"org.xtext.example.myspectra.MySpectra.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getTemporalAdditiveExprAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:4021:3: (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==16) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalMySpectra.g:4022:4: otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getTemporalAdditiveExprAccess().getElementsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getTemporalAdditiveExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMySpectra.g:4030:4: ( (lv_elements_11_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:4031:5: (lv_elements_11_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:4031:5: (lv_elements_11_0= ruleTemporalExpression )
                    // InternalMySpectra.g:4032:6: lv_elements_11_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalAdditiveExprAccess().getElementsTemporalExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elements_11_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalAdditiveExprRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_11_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:4049:4: (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==14) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalMySpectra.g:4050:5: otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTemporalAdditiveExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMySpectra.g:4054:5: ( (lv_elements_13_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:4055:6: (lv_elements_13_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:4055:6: (lv_elements_13_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:4056:7: lv_elements_13_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalAdditiveExprAccess().getElementsTemporalExpressionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_13_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalAdditiveExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_13_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getTemporalAdditiveExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTemporalAdditiveExprAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalAdditiveExpr"


    // $ANTLR start "entryRuleTemporalMultiplicativeExpr"
    // InternalMySpectra.g:4087:1: entryRuleTemporalMultiplicativeExpr returns [EObject current=null] : iv_ruleTemporalMultiplicativeExpr= ruleTemporalMultiplicativeExpr EOF ;
    public final EObject entryRuleTemporalMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalMultiplicativeExpr = null;


        try {
            // InternalMySpectra.g:4087:67: (iv_ruleTemporalMultiplicativeExpr= ruleTemporalMultiplicativeExpr EOF )
            // InternalMySpectra.g:4088:2: iv_ruleTemporalMultiplicativeExpr= ruleTemporalMultiplicativeExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalMultiplicativeExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalMultiplicativeExpr=ruleTemporalMultiplicativeExpr();

            state._fsp--;

             current =iv_ruleTemporalMultiplicativeExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalMultiplicativeExpr"


    // $ANTLR start "ruleTemporalMultiplicativeExpr"
    // InternalMySpectra.g:4094:1: ruleTemporalMultiplicativeExpr returns [EObject current=null] : ( () otherlv_1= 'TemporalMultiplicativeExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleTemporalMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_operator_5_0 = null;

        AntlrDatatypeRuleToken lv_operator_7_0 = null;

        EObject lv_elements_11_0 = null;

        EObject lv_elements_13_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:4100:2: ( ( () otherlv_1= 'TemporalMultiplicativeExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMySpectra.g:4101:2: ( () otherlv_1= 'TemporalMultiplicativeExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMySpectra.g:4101:2: ( () otherlv_1= 'TemporalMultiplicativeExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMySpectra.g:4102:3: () otherlv_1= 'TemporalMultiplicativeExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalMySpectra.g:4102:3: ()
            // InternalMySpectra.g:4103:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalMultiplicativeExprAccess().getTemporalMultiplicativeExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalMultiplicativeExprAccess().getTemporalMultiplicativeExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalMultiplicativeExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:4117:3: (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==61) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalMySpectra.g:4118:4: otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalMultiplicativeExprAccess().getOperatorKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTemporalMultiplicativeExprAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMySpectra.g:4126:4: ( (lv_operator_5_0= ruleEString ) )
                    // InternalMySpectra.g:4127:5: (lv_operator_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:4127:5: (lv_operator_5_0= ruleEString )
                    // InternalMySpectra.g:4128:6: lv_operator_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalMultiplicativeExprAccess().getOperatorEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_operator_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalMultiplicativeExprRule());
                    						}
                    						add(
                    							current,
                    							"operator",
                    							lv_operator_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:4145:4: (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==14) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalMySpectra.g:4146:5: otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTemporalMultiplicativeExprAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMySpectra.g:4150:5: ( (lv_operator_7_0= ruleEString ) )
                    	    // InternalMySpectra.g:4151:6: (lv_operator_7_0= ruleEString )
                    	    {
                    	    // InternalMySpectra.g:4151:6: (lv_operator_7_0= ruleEString )
                    	    // InternalMySpectra.g:4152:7: lv_operator_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalMultiplicativeExprAccess().getOperatorEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_operator_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalMultiplicativeExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operator",
                    	    								lv_operator_7_0,
                    	    								"org.xtext.example.myspectra.MySpectra.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getTemporalMultiplicativeExprAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:4175:3: (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==16) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalMySpectra.g:4176:4: otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getTemporalMultiplicativeExprAccess().getElementsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getTemporalMultiplicativeExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMySpectra.g:4184:4: ( (lv_elements_11_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:4185:5: (lv_elements_11_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:4185:5: (lv_elements_11_0= ruleTemporalExpression )
                    // InternalMySpectra.g:4186:6: lv_elements_11_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalMultiplicativeExprAccess().getElementsTemporalExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elements_11_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalMultiplicativeExprRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_11_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:4203:4: (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==14) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalMySpectra.g:4204:5: otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTemporalMultiplicativeExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMySpectra.g:4208:5: ( (lv_elements_13_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:4209:6: (lv_elements_13_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:4209:6: (lv_elements_13_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:4210:7: lv_elements_13_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalMultiplicativeExprAccess().getElementsTemporalExpressionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_13_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalMultiplicativeExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_13_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getTemporalMultiplicativeExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTemporalMultiplicativeExprAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalMultiplicativeExpr"


    // $ANTLR start "entryRuleTemporalBinaryExpr"
    // InternalMySpectra.g:4241:1: entryRuleTemporalBinaryExpr returns [EObject current=null] : iv_ruleTemporalBinaryExpr= ruleTemporalBinaryExpr EOF ;
    public final EObject entryRuleTemporalBinaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalBinaryExpr = null;


        try {
            // InternalMySpectra.g:4241:59: (iv_ruleTemporalBinaryExpr= ruleTemporalBinaryExpr EOF )
            // InternalMySpectra.g:4242:2: iv_ruleTemporalBinaryExpr= ruleTemporalBinaryExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalBinaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalBinaryExpr=ruleTemporalBinaryExpr();

            state._fsp--;

             current =iv_ruleTemporalBinaryExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalBinaryExpr"


    // $ANTLR start "ruleTemporalBinaryExpr"
    // InternalMySpectra.g:4248:1: ruleTemporalBinaryExpr returns [EObject current=null] : ( () otherlv_1= 'TemporalBinaryExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleTemporalBinaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_operator_5_0 = null;

        AntlrDatatypeRuleToken lv_operator_7_0 = null;

        EObject lv_elements_11_0 = null;

        EObject lv_elements_13_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:4254:2: ( ( () otherlv_1= 'TemporalBinaryExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMySpectra.g:4255:2: ( () otherlv_1= 'TemporalBinaryExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMySpectra.g:4255:2: ( () otherlv_1= 'TemporalBinaryExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMySpectra.g:4256:3: () otherlv_1= 'TemporalBinaryExpr' otherlv_2= '{' (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalMySpectra.g:4256:3: ()
            // InternalMySpectra.g:4257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalBinaryExprAccess().getTemporalBinaryExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalBinaryExprAccess().getTemporalBinaryExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalBinaryExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:4271:3: (otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==61) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalMySpectra.g:4272:4: otherlv_3= 'operator' otherlv_4= '{' ( (lv_operator_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalBinaryExprAccess().getOperatorKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTemporalBinaryExprAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMySpectra.g:4280:4: ( (lv_operator_5_0= ruleEString ) )
                    // InternalMySpectra.g:4281:5: (lv_operator_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:4281:5: (lv_operator_5_0= ruleEString )
                    // InternalMySpectra.g:4282:6: lv_operator_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalBinaryExprAccess().getOperatorEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_operator_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalBinaryExprRule());
                    						}
                    						add(
                    							current,
                    							"operator",
                    							lv_operator_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:4299:4: (otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==14) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalMySpectra.g:4300:5: otherlv_6= ',' ( (lv_operator_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTemporalBinaryExprAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMySpectra.g:4304:5: ( (lv_operator_7_0= ruleEString ) )
                    	    // InternalMySpectra.g:4305:6: (lv_operator_7_0= ruleEString )
                    	    {
                    	    // InternalMySpectra.g:4305:6: (lv_operator_7_0= ruleEString )
                    	    // InternalMySpectra.g:4306:7: lv_operator_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalBinaryExprAccess().getOperatorEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_operator_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalBinaryExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operator",
                    	    								lv_operator_7_0,
                    	    								"org.xtext.example.myspectra.MySpectra.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getTemporalBinaryExprAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:4329:3: (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==16) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalMySpectra.g:4330:4: otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleTemporalExpression ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getTemporalBinaryExprAccess().getElementsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getTemporalBinaryExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMySpectra.g:4338:4: ( (lv_elements_11_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:4339:5: (lv_elements_11_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:4339:5: (lv_elements_11_0= ruleTemporalExpression )
                    // InternalMySpectra.g:4340:6: lv_elements_11_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalBinaryExprAccess().getElementsTemporalExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elements_11_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalBinaryExprRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_11_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:4357:4: (otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==14) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalMySpectra.g:4358:5: otherlv_12= ',' ( (lv_elements_13_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTemporalBinaryExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMySpectra.g:4362:5: ( (lv_elements_13_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:4363:6: (lv_elements_13_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:4363:6: (lv_elements_13_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:4364:7: lv_elements_13_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalBinaryExprAccess().getElementsTemporalExpressionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_13_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalBinaryExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_13_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getTemporalBinaryExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTemporalBinaryExprAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalBinaryExpr"


    // $ANTLR start "entryRuleTemporalUnaryExpr"
    // InternalMySpectra.g:4395:1: entryRuleTemporalUnaryExpr returns [EObject current=null] : iv_ruleTemporalUnaryExpr= ruleTemporalUnaryExpr EOF ;
    public final EObject entryRuleTemporalUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalUnaryExpr = null;


        try {
            // InternalMySpectra.g:4395:58: (iv_ruleTemporalUnaryExpr= ruleTemporalUnaryExpr EOF )
            // InternalMySpectra.g:4396:2: iv_ruleTemporalUnaryExpr= ruleTemporalUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalUnaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalUnaryExpr=ruleTemporalUnaryExpr();

            state._fsp--;

             current =iv_ruleTemporalUnaryExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalUnaryExpr"


    // $ANTLR start "ruleTemporalUnaryExpr"
    // InternalMySpectra.g:4402:1: ruleTemporalUnaryExpr returns [EObject current=null] : ( () otherlv_1= 'TemporalUnaryExpr' otherlv_2= '{' (otherlv_3= 'kinds' ( (lv_kinds_4_0= ruleEString ) ) )? (otherlv_5= 'tue' ( (lv_tue_6_0= ruleTemporalExpression ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleTemporalUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_kinds_4_0 = null;

        EObject lv_tue_6_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:4408:2: ( ( () otherlv_1= 'TemporalUnaryExpr' otherlv_2= '{' (otherlv_3= 'kinds' ( (lv_kinds_4_0= ruleEString ) ) )? (otherlv_5= 'tue' ( (lv_tue_6_0= ruleTemporalExpression ) ) )? otherlv_7= '}' ) )
            // InternalMySpectra.g:4409:2: ( () otherlv_1= 'TemporalUnaryExpr' otherlv_2= '{' (otherlv_3= 'kinds' ( (lv_kinds_4_0= ruleEString ) ) )? (otherlv_5= 'tue' ( (lv_tue_6_0= ruleTemporalExpression ) ) )? otherlv_7= '}' )
            {
            // InternalMySpectra.g:4409:2: ( () otherlv_1= 'TemporalUnaryExpr' otherlv_2= '{' (otherlv_3= 'kinds' ( (lv_kinds_4_0= ruleEString ) ) )? (otherlv_5= 'tue' ( (lv_tue_6_0= ruleTemporalExpression ) ) )? otherlv_7= '}' )
            // InternalMySpectra.g:4410:3: () otherlv_1= 'TemporalUnaryExpr' otherlv_2= '{' (otherlv_3= 'kinds' ( (lv_kinds_4_0= ruleEString ) ) )? (otherlv_5= 'tue' ( (lv_tue_6_0= ruleTemporalExpression ) ) )? otherlv_7= '}'
            {
            // InternalMySpectra.g:4410:3: ()
            // InternalMySpectra.g:4411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalUnaryExprAccess().getTemporalUnaryExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalUnaryExprAccess().getTemporalUnaryExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalUnaryExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:4425:3: (otherlv_3= 'kinds' ( (lv_kinds_4_0= ruleEString ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==76) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalMySpectra.g:4426:4: otherlv_3= 'kinds' ( (lv_kinds_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalUnaryExprAccess().getKindsKeyword_3_0());
                    			
                    // InternalMySpectra.g:4430:4: ( (lv_kinds_4_0= ruleEString ) )
                    // InternalMySpectra.g:4431:5: (lv_kinds_4_0= ruleEString )
                    {
                    // InternalMySpectra.g:4431:5: (lv_kinds_4_0= ruleEString )
                    // InternalMySpectra.g:4432:6: lv_kinds_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalUnaryExprAccess().getKindsEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_kinds_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalUnaryExprRule());
                    						}
                    						set(
                    							current,
                    							"kinds",
                    							lv_kinds_4_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:4450:3: (otherlv_5= 'tue' ( (lv_tue_6_0= ruleTemporalExpression ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==77) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalMySpectra.g:4451:4: otherlv_5= 'tue' ( (lv_tue_6_0= ruleTemporalExpression ) )
                    {
                    otherlv_5=(Token)match(input,77,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getTemporalUnaryExprAccess().getTueKeyword_4_0());
                    			
                    // InternalMySpectra.g:4455:4: ( (lv_tue_6_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:4456:5: (lv_tue_6_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:4456:5: (lv_tue_6_0= ruleTemporalExpression )
                    // InternalMySpectra.g:4457:6: lv_tue_6_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalUnaryExprAccess().getTueTemporalExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_tue_6_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalUnaryExprRule());
                    						}
                    						set(
                    							current,
                    							"tue",
                    							lv_tue_6_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTemporalUnaryExprAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalUnaryExpr"


    // $ANTLR start "entryRuleTemporalPrimaryExpr"
    // InternalMySpectra.g:4483:1: entryRuleTemporalPrimaryExpr returns [EObject current=null] : iv_ruleTemporalPrimaryExpr= ruleTemporalPrimaryExpr EOF ;
    public final EObject entryRuleTemporalPrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPrimaryExpr = null;


        try {
            // InternalMySpectra.g:4483:60: (iv_ruleTemporalPrimaryExpr= ruleTemporalPrimaryExpr EOF )
            // InternalMySpectra.g:4484:2: iv_ruleTemporalPrimaryExpr= ruleTemporalPrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalPrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalPrimaryExpr=ruleTemporalPrimaryExpr();

            state._fsp--;

             current =iv_ruleTemporalPrimaryExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalPrimaryExpr"


    // $ANTLR start "ruleTemporalPrimaryExpr"
    // InternalMySpectra.g:4490:1: ruleTemporalPrimaryExpr returns [EObject current=null] : ( () otherlv_1= 'TemporalPrimaryExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'predPatt' ( ( ruleEString ) ) )? (otherlv_7= 'pointer' ( ( ruleEString ) ) )? (otherlv_9= 'regexpPointer' ( ( ruleEString ) ) )? (otherlv_11= 'predPattParams' otherlv_12= '{' ( (lv_predPattParams_13_0= ruleTemporalExpression ) ) (otherlv_14= ',' ( (lv_predPattParams_15_0= ruleTemporalExpression ) ) )* otherlv_16= '}' )? (otherlv_17= 'tpe' ( (lv_tpe_18_0= ruleTemporalExpression ) ) )? (otherlv_19= 'index' otherlv_20= '{' ( (lv_index_21_0= ruleTemporalExpression ) ) (otherlv_22= ',' ( (lv_index_23_0= ruleTemporalExpression ) ) )* otherlv_24= '}' )? (otherlv_25= 'temporalExpression' ( (lv_temporalExpression_26_0= ruleTemporalExpression ) ) )? (otherlv_27= 'regexp' ( (lv_regexp_28_0= ruleRegExp ) ) )? otherlv_29= '}' ) ;
    public final EObject ruleTemporalPrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_operator_4_0 = null;

        EObject lv_predPattParams_13_0 = null;

        EObject lv_predPattParams_15_0 = null;

        EObject lv_tpe_18_0 = null;

        EObject lv_index_21_0 = null;

        EObject lv_index_23_0 = null;

        EObject lv_temporalExpression_26_0 = null;

        EObject lv_regexp_28_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:4496:2: ( ( () otherlv_1= 'TemporalPrimaryExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'predPatt' ( ( ruleEString ) ) )? (otherlv_7= 'pointer' ( ( ruleEString ) ) )? (otherlv_9= 'regexpPointer' ( ( ruleEString ) ) )? (otherlv_11= 'predPattParams' otherlv_12= '{' ( (lv_predPattParams_13_0= ruleTemporalExpression ) ) (otherlv_14= ',' ( (lv_predPattParams_15_0= ruleTemporalExpression ) ) )* otherlv_16= '}' )? (otherlv_17= 'tpe' ( (lv_tpe_18_0= ruleTemporalExpression ) ) )? (otherlv_19= 'index' otherlv_20= '{' ( (lv_index_21_0= ruleTemporalExpression ) ) (otherlv_22= ',' ( (lv_index_23_0= ruleTemporalExpression ) ) )* otherlv_24= '}' )? (otherlv_25= 'temporalExpression' ( (lv_temporalExpression_26_0= ruleTemporalExpression ) ) )? (otherlv_27= 'regexp' ( (lv_regexp_28_0= ruleRegExp ) ) )? otherlv_29= '}' ) )
            // InternalMySpectra.g:4497:2: ( () otherlv_1= 'TemporalPrimaryExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'predPatt' ( ( ruleEString ) ) )? (otherlv_7= 'pointer' ( ( ruleEString ) ) )? (otherlv_9= 'regexpPointer' ( ( ruleEString ) ) )? (otherlv_11= 'predPattParams' otherlv_12= '{' ( (lv_predPattParams_13_0= ruleTemporalExpression ) ) (otherlv_14= ',' ( (lv_predPattParams_15_0= ruleTemporalExpression ) ) )* otherlv_16= '}' )? (otherlv_17= 'tpe' ( (lv_tpe_18_0= ruleTemporalExpression ) ) )? (otherlv_19= 'index' otherlv_20= '{' ( (lv_index_21_0= ruleTemporalExpression ) ) (otherlv_22= ',' ( (lv_index_23_0= ruleTemporalExpression ) ) )* otherlv_24= '}' )? (otherlv_25= 'temporalExpression' ( (lv_temporalExpression_26_0= ruleTemporalExpression ) ) )? (otherlv_27= 'regexp' ( (lv_regexp_28_0= ruleRegExp ) ) )? otherlv_29= '}' )
            {
            // InternalMySpectra.g:4497:2: ( () otherlv_1= 'TemporalPrimaryExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'predPatt' ( ( ruleEString ) ) )? (otherlv_7= 'pointer' ( ( ruleEString ) ) )? (otherlv_9= 'regexpPointer' ( ( ruleEString ) ) )? (otherlv_11= 'predPattParams' otherlv_12= '{' ( (lv_predPattParams_13_0= ruleTemporalExpression ) ) (otherlv_14= ',' ( (lv_predPattParams_15_0= ruleTemporalExpression ) ) )* otherlv_16= '}' )? (otherlv_17= 'tpe' ( (lv_tpe_18_0= ruleTemporalExpression ) ) )? (otherlv_19= 'index' otherlv_20= '{' ( (lv_index_21_0= ruleTemporalExpression ) ) (otherlv_22= ',' ( (lv_index_23_0= ruleTemporalExpression ) ) )* otherlv_24= '}' )? (otherlv_25= 'temporalExpression' ( (lv_temporalExpression_26_0= ruleTemporalExpression ) ) )? (otherlv_27= 'regexp' ( (lv_regexp_28_0= ruleRegExp ) ) )? otherlv_29= '}' )
            // InternalMySpectra.g:4498:3: () otherlv_1= 'TemporalPrimaryExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'predPatt' ( ( ruleEString ) ) )? (otherlv_7= 'pointer' ( ( ruleEString ) ) )? (otherlv_9= 'regexpPointer' ( ( ruleEString ) ) )? (otherlv_11= 'predPattParams' otherlv_12= '{' ( (lv_predPattParams_13_0= ruleTemporalExpression ) ) (otherlv_14= ',' ( (lv_predPattParams_15_0= ruleTemporalExpression ) ) )* otherlv_16= '}' )? (otherlv_17= 'tpe' ( (lv_tpe_18_0= ruleTemporalExpression ) ) )? (otherlv_19= 'index' otherlv_20= '{' ( (lv_index_21_0= ruleTemporalExpression ) ) (otherlv_22= ',' ( (lv_index_23_0= ruleTemporalExpression ) ) )* otherlv_24= '}' )? (otherlv_25= 'temporalExpression' ( (lv_temporalExpression_26_0= ruleTemporalExpression ) ) )? (otherlv_27= 'regexp' ( (lv_regexp_28_0= ruleRegExp ) ) )? otherlv_29= '}'
            {
            // InternalMySpectra.g:4498:3: ()
            // InternalMySpectra.g:4499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemporalPrimaryExprAccess().getTemporalPrimaryExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemporalPrimaryExprAccess().getTemporalPrimaryExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getTemporalPrimaryExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:4513:3: (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==61) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalMySpectra.g:4514:4: otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalPrimaryExprAccess().getOperatorKeyword_3_0());
                    			
                    // InternalMySpectra.g:4518:4: ( (lv_operator_4_0= ruleEString ) )
                    // InternalMySpectra.g:4519:5: (lv_operator_4_0= ruleEString )
                    {
                    // InternalMySpectra.g:4519:5: (lv_operator_4_0= ruleEString )
                    // InternalMySpectra.g:4520:6: lv_operator_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTemporalPrimaryExprAccess().getOperatorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_77);
                    lv_operator_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalPrimaryExprRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:4538:3: (otherlv_5= 'predPatt' ( ( ruleEString ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==79) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalMySpectra.g:4539:4: otherlv_5= 'predPatt' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTemporalPrimaryExprAccess().getPredPattKeyword_4_0());
                    			
                    // InternalMySpectra.g:4543:4: ( ( ruleEString ) )
                    // InternalMySpectra.g:4544:5: ( ruleEString )
                    {
                    // InternalMySpectra.g:4544:5: ( ruleEString )
                    // InternalMySpectra.g:4545:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTemporalPrimaryExprRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTemporalPrimaryExprAccess().getPredPattPredicateOrPatternReferrableCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:4560:3: (otherlv_7= 'pointer' ( ( ruleEString ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==80) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalMySpectra.g:4561:4: otherlv_7= 'pointer' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,80,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTemporalPrimaryExprAccess().getPointerKeyword_5_0());
                    			
                    // InternalMySpectra.g:4565:4: ( ( ruleEString ) )
                    // InternalMySpectra.g:4566:5: ( ruleEString )
                    {
                    // InternalMySpectra.g:4566:5: ( ruleEString )
                    // InternalMySpectra.g:4567:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTemporalPrimaryExprRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTemporalPrimaryExprAccess().getPointerReferrableCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:4582:3: (otherlv_9= 'regexpPointer' ( ( ruleEString ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==81) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalMySpectra.g:4583:4: otherlv_9= 'regexpPointer' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,81,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getTemporalPrimaryExprAccess().getRegexpPointerKeyword_6_0());
                    			
                    // InternalMySpectra.g:4587:4: ( ( ruleEString ) )
                    // InternalMySpectra.g:4588:5: ( ruleEString )
                    {
                    // InternalMySpectra.g:4588:5: ( ruleEString )
                    // InternalMySpectra.g:4589:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTemporalPrimaryExprRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTemporalPrimaryExprAccess().getRegexpPointerDefineRegExpDeclCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:4604:3: (otherlv_11= 'predPattParams' otherlv_12= '{' ( (lv_predPattParams_13_0= ruleTemporalExpression ) ) (otherlv_14= ',' ( (lv_predPattParams_15_0= ruleTemporalExpression ) ) )* otherlv_16= '}' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==82) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalMySpectra.g:4605:4: otherlv_11= 'predPattParams' otherlv_12= '{' ( (lv_predPattParams_13_0= ruleTemporalExpression ) ) (otherlv_14= ',' ( (lv_predPattParams_15_0= ruleTemporalExpression ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,82,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getTemporalPrimaryExprAccess().getPredPattParamsKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getTemporalPrimaryExprAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMySpectra.g:4613:4: ( (lv_predPattParams_13_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:4614:5: (lv_predPattParams_13_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:4614:5: (lv_predPattParams_13_0= ruleTemporalExpression )
                    // InternalMySpectra.g:4615:6: lv_predPattParams_13_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalPrimaryExprAccess().getPredPattParamsTemporalExpressionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_predPattParams_13_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalPrimaryExprRule());
                    						}
                    						add(
                    							current,
                    							"predPattParams",
                    							lv_predPattParams_13_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:4632:4: (otherlv_14= ',' ( (lv_predPattParams_15_0= ruleTemporalExpression ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==14) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalMySpectra.g:4633:5: otherlv_14= ',' ( (lv_predPattParams_15_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getTemporalPrimaryExprAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMySpectra.g:4637:5: ( (lv_predPattParams_15_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:4638:6: (lv_predPattParams_15_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:4638:6: (lv_predPattParams_15_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:4639:7: lv_predPattParams_15_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalPrimaryExprAccess().getPredPattParamsTemporalExpressionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_predPattParams_15_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalPrimaryExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"predPattParams",
                    	    								lv_predPattParams_15_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_81); 

                    				newLeafNode(otherlv_16, grammarAccess.getTemporalPrimaryExprAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:4662:3: (otherlv_17= 'tpe' ( (lv_tpe_18_0= ruleTemporalExpression ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==83) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalMySpectra.g:4663:4: otherlv_17= 'tpe' ( (lv_tpe_18_0= ruleTemporalExpression ) )
                    {
                    otherlv_17=(Token)match(input,83,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getTemporalPrimaryExprAccess().getTpeKeyword_8_0());
                    			
                    // InternalMySpectra.g:4667:4: ( (lv_tpe_18_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:4668:5: (lv_tpe_18_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:4668:5: (lv_tpe_18_0= ruleTemporalExpression )
                    // InternalMySpectra.g:4669:6: lv_tpe_18_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalPrimaryExprAccess().getTpeTemporalExpressionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    lv_tpe_18_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalPrimaryExprRule());
                    						}
                    						set(
                    							current,
                    							"tpe",
                    							lv_tpe_18_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:4687:3: (otherlv_19= 'index' otherlv_20= '{' ( (lv_index_21_0= ruleTemporalExpression ) ) (otherlv_22= ',' ( (lv_index_23_0= ruleTemporalExpression ) ) )* otherlv_24= '}' )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==84) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalMySpectra.g:4688:4: otherlv_19= 'index' otherlv_20= '{' ( (lv_index_21_0= ruleTemporalExpression ) ) (otherlv_22= ',' ( (lv_index_23_0= ruleTemporalExpression ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,84,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getTemporalPrimaryExprAccess().getIndexKeyword_9_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_20, grammarAccess.getTemporalPrimaryExprAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMySpectra.g:4696:4: ( (lv_index_21_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:4697:5: (lv_index_21_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:4697:5: (lv_index_21_0= ruleTemporalExpression )
                    // InternalMySpectra.g:4698:6: lv_index_21_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalPrimaryExprAccess().getIndexTemporalExpressionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_index_21_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalPrimaryExprRule());
                    						}
                    						add(
                    							current,
                    							"index",
                    							lv_index_21_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:4715:4: (otherlv_22= ',' ( (lv_index_23_0= ruleTemporalExpression ) ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==14) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // InternalMySpectra.g:4716:5: otherlv_22= ',' ( (lv_index_23_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getTemporalPrimaryExprAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMySpectra.g:4720:5: ( (lv_index_23_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:4721:6: (lv_index_23_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:4721:6: (lv_index_23_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:4722:7: lv_index_23_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemporalPrimaryExprAccess().getIndexTemporalExpressionParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_index_23_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemporalPrimaryExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"index",
                    	    								lv_index_23_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,15,FOLLOW_83); 

                    				newLeafNode(otherlv_24, grammarAccess.getTemporalPrimaryExprAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:4745:3: (otherlv_25= 'temporalExpression' ( (lv_temporalExpression_26_0= ruleTemporalExpression ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==85) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalMySpectra.g:4746:4: otherlv_25= 'temporalExpression' ( (lv_temporalExpression_26_0= ruleTemporalExpression ) )
                    {
                    otherlv_25=(Token)match(input,85,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getTemporalPrimaryExprAccess().getTemporalExpressionKeyword_10_0());
                    			
                    // InternalMySpectra.g:4750:4: ( (lv_temporalExpression_26_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:4751:5: (lv_temporalExpression_26_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:4751:5: (lv_temporalExpression_26_0= ruleTemporalExpression )
                    // InternalMySpectra.g:4752:6: lv_temporalExpression_26_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getTemporalPrimaryExprAccess().getTemporalExpressionTemporalExpressionParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    lv_temporalExpression_26_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalPrimaryExprRule());
                    						}
                    						set(
                    							current,
                    							"temporalExpression",
                    							lv_temporalExpression_26_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:4770:3: (otherlv_27= 'regexp' ( (lv_regexp_28_0= ruleRegExp ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==86) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalMySpectra.g:4771:4: otherlv_27= 'regexp' ( (lv_regexp_28_0= ruleRegExp ) )
                    {
                    otherlv_27=(Token)match(input,86,FOLLOW_60); 

                    				newLeafNode(otherlv_27, grammarAccess.getTemporalPrimaryExprAccess().getRegexpKeyword_11_0());
                    			
                    // InternalMySpectra.g:4775:4: ( (lv_regexp_28_0= ruleRegExp ) )
                    // InternalMySpectra.g:4776:5: (lv_regexp_28_0= ruleRegExp )
                    {
                    // InternalMySpectra.g:4776:5: (lv_regexp_28_0= ruleRegExp )
                    // InternalMySpectra.g:4777:6: lv_regexp_28_0= ruleRegExp
                    {

                    						newCompositeNode(grammarAccess.getTemporalPrimaryExprAccess().getRegexpRegExpParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_regexp_28_0=ruleRegExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalPrimaryExprRule());
                    						}
                    						set(
                    							current,
                    							"regexp",
                    							lv_regexp_28_0,
                    							"org.xtext.example.myspectra.MySpectra.RegExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getTemporalPrimaryExprAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalPrimaryExpr"


    // $ANTLR start "entryRuleConstant"
    // InternalMySpectra.g:4803:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalMySpectra.g:4803:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalMySpectra.g:4804:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalMySpectra.g:4810:1: ruleConstant returns [EObject current=null] : ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'booleanValue' ( (lv_booleanValue_4_0= ruleEString ) ) )? (otherlv_5= 'integerValue' ( (lv_integerValue_6_0= ruleEInt ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_booleanValue_4_0 = null;

        AntlrDatatypeRuleToken lv_integerValue_6_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:4816:2: ( ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'booleanValue' ( (lv_booleanValue_4_0= ruleEString ) ) )? (otherlv_5= 'integerValue' ( (lv_integerValue_6_0= ruleEInt ) ) )? otherlv_7= '}' ) )
            // InternalMySpectra.g:4817:2: ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'booleanValue' ( (lv_booleanValue_4_0= ruleEString ) ) )? (otherlv_5= 'integerValue' ( (lv_integerValue_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            {
            // InternalMySpectra.g:4817:2: ( () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'booleanValue' ( (lv_booleanValue_4_0= ruleEString ) ) )? (otherlv_5= 'integerValue' ( (lv_integerValue_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            // InternalMySpectra.g:4818:3: () otherlv_1= 'Constant' otherlv_2= '{' (otherlv_3= 'booleanValue' ( (lv_booleanValue_4_0= ruleEString ) ) )? (otherlv_5= 'integerValue' ( (lv_integerValue_6_0= ruleEInt ) ) )? otherlv_7= '}'
            {
            // InternalMySpectra.g:4818:3: ()
            // InternalMySpectra.g:4819:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantAccess().getConstantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,87,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstantKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:4833:3: (otherlv_3= 'booleanValue' ( (lv_booleanValue_4_0= ruleEString ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==88) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalMySpectra.g:4834:4: otherlv_3= 'booleanValue' ( (lv_booleanValue_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,88,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getBooleanValueKeyword_3_0());
                    			
                    // InternalMySpectra.g:4838:4: ( (lv_booleanValue_4_0= ruleEString ) )
                    // InternalMySpectra.g:4839:5: (lv_booleanValue_4_0= ruleEString )
                    {
                    // InternalMySpectra.g:4839:5: (lv_booleanValue_4_0= ruleEString )
                    // InternalMySpectra.g:4840:6: lv_booleanValue_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getBooleanValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_86);
                    lv_booleanValue_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"booleanValue",
                    							lv_booleanValue_4_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:4858:3: (otherlv_5= 'integerValue' ( (lv_integerValue_6_0= ruleEInt ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==89) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalMySpectra.g:4859:4: otherlv_5= 'integerValue' ( (lv_integerValue_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,89,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstantAccess().getIntegerValueKeyword_4_0());
                    			
                    // InternalMySpectra.g:4863:4: ( (lv_integerValue_6_0= ruleEInt ) )
                    // InternalMySpectra.g:4864:5: (lv_integerValue_6_0= ruleEInt )
                    {
                    // InternalMySpectra.g:4864:5: (lv_integerValue_6_0= ruleEInt )
                    // InternalMySpectra.g:4865:6: lv_integerValue_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getIntegerValueEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_integerValue_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"integerValue",
                    							lv_integerValue_6_0,
                    							"org.xtext.example.myspectra.MySpectra.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleQuantifierExpr"
    // InternalMySpectra.g:4891:1: entryRuleQuantifierExpr returns [EObject current=null] : iv_ruleQuantifierExpr= ruleQuantifierExpr EOF ;
    public final EObject entryRuleQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifierExpr = null;


        try {
            // InternalMySpectra.g:4891:55: (iv_ruleQuantifierExpr= ruleQuantifierExpr EOF )
            // InternalMySpectra.g:4892:2: iv_ruleQuantifierExpr= ruleQuantifierExpr EOF
            {
             newCompositeNode(grammarAccess.getQuantifierExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantifierExpr=ruleQuantifierExpr();

            state._fsp--;

             current =iv_ruleQuantifierExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantifierExpr"


    // $ANTLR start "ruleQuantifierExpr"
    // InternalMySpectra.g:4898:1: ruleQuantifierExpr returns [EObject current=null] : ( () otherlv_1= 'QuantifierExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'domainVar' ( (lv_domainVar_6_0= ruleDomainVarDecl ) ) )? (otherlv_7= 'temporalExpr' ( (lv_temporalExpr_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleQuantifierExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_operator_4_0 = null;

        EObject lv_domainVar_6_0 = null;

        EObject lv_temporalExpr_8_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:4904:2: ( ( () otherlv_1= 'QuantifierExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'domainVar' ( (lv_domainVar_6_0= ruleDomainVarDecl ) ) )? (otherlv_7= 'temporalExpr' ( (lv_temporalExpr_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' ) )
            // InternalMySpectra.g:4905:2: ( () otherlv_1= 'QuantifierExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'domainVar' ( (lv_domainVar_6_0= ruleDomainVarDecl ) ) )? (otherlv_7= 'temporalExpr' ( (lv_temporalExpr_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' )
            {
            // InternalMySpectra.g:4905:2: ( () otherlv_1= 'QuantifierExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'domainVar' ( (lv_domainVar_6_0= ruleDomainVarDecl ) ) )? (otherlv_7= 'temporalExpr' ( (lv_temporalExpr_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' )
            // InternalMySpectra.g:4906:3: () otherlv_1= 'QuantifierExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )? (otherlv_5= 'domainVar' ( (lv_domainVar_6_0= ruleDomainVarDecl ) ) )? (otherlv_7= 'temporalExpr' ( (lv_temporalExpr_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}'
            {
            // InternalMySpectra.g:4906:3: ()
            // InternalMySpectra.g:4907:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuantifierExprAccess().getQuantifierExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQuantifierExprAccess().getQuantifierExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_87); 

            			newLeafNode(otherlv_2, grammarAccess.getQuantifierExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:4921:3: (otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==61) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalMySpectra.g:4922:4: otherlv_3= 'operator' ( (lv_operator_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuantifierExprAccess().getOperatorKeyword_3_0());
                    			
                    // InternalMySpectra.g:4926:4: ( (lv_operator_4_0= ruleEString ) )
                    // InternalMySpectra.g:4927:5: (lv_operator_4_0= ruleEString )
                    {
                    // InternalMySpectra.g:4927:5: (lv_operator_4_0= ruleEString )
                    // InternalMySpectra.g:4928:6: lv_operator_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQuantifierExprAccess().getOperatorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_88);
                    lv_operator_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuantifierExprRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:4946:3: (otherlv_5= 'domainVar' ( (lv_domainVar_6_0= ruleDomainVarDecl ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==91) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalMySpectra.g:4947:4: otherlv_5= 'domainVar' ( (lv_domainVar_6_0= ruleDomainVarDecl ) )
                    {
                    otherlv_5=(Token)match(input,91,FOLLOW_89); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuantifierExprAccess().getDomainVarKeyword_4_0());
                    			
                    // InternalMySpectra.g:4951:4: ( (lv_domainVar_6_0= ruleDomainVarDecl ) )
                    // InternalMySpectra.g:4952:5: (lv_domainVar_6_0= ruleDomainVarDecl )
                    {
                    // InternalMySpectra.g:4952:5: (lv_domainVar_6_0= ruleDomainVarDecl )
                    // InternalMySpectra.g:4953:6: lv_domainVar_6_0= ruleDomainVarDecl
                    {

                    						newCompositeNode(grammarAccess.getQuantifierExprAccess().getDomainVarDomainVarDeclParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_90);
                    lv_domainVar_6_0=ruleDomainVarDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuantifierExprRule());
                    						}
                    						set(
                    							current,
                    							"domainVar",
                    							lv_domainVar_6_0,
                    							"org.xtext.example.myspectra.MySpectra.DomainVarDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:4971:3: (otherlv_7= 'temporalExpr' ( (lv_temporalExpr_8_0= ruleTemporalExpression ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==51) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalMySpectra.g:4972:4: otherlv_7= 'temporalExpr' ( (lv_temporalExpr_8_0= ruleTemporalExpression ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getQuantifierExprAccess().getTemporalExprKeyword_5_0());
                    			
                    // InternalMySpectra.g:4976:4: ( (lv_temporalExpr_8_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:4977:5: (lv_temporalExpr_8_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:4977:5: (lv_temporalExpr_8_0= ruleTemporalExpression )
                    // InternalMySpectra.g:4978:6: lv_temporalExpr_8_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getQuantifierExprAccess().getTemporalExprTemporalExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_temporalExpr_8_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuantifierExprRule());
                    						}
                    						set(
                    							current,
                    							"temporalExpr",
                    							lv_temporalExpr_8_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getQuantifierExprAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantifierExpr"


    // $ANTLR start "entryRuleValueInRange"
    // InternalMySpectra.g:5004:1: entryRuleValueInRange returns [EObject current=null] : iv_ruleValueInRange= ruleValueInRange EOF ;
    public final EObject entryRuleValueInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueInRange = null;


        try {
            // InternalMySpectra.g:5004:53: (iv_ruleValueInRange= ruleValueInRange EOF )
            // InternalMySpectra.g:5005:2: iv_ruleValueInRange= ruleValueInRange EOF
            {
             newCompositeNode(grammarAccess.getValueInRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueInRange=ruleValueInRange();

            state._fsp--;

             current =iv_ruleValueInRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueInRange"


    // $ANTLR start "ruleValueInRange"
    // InternalMySpectra.g:5011:1: ruleValueInRange returns [EObject current=null] : ( () ( (lv_multi_1_0= 'multi' ) )? otherlv_2= 'ValueInRange' otherlv_3= '{' (otherlv_4= 'int' ( (lv_int_5_0= ruleEInt ) ) )? (otherlv_6= 'from' ( (lv_from_7_0= ruleEInt ) ) )? (otherlv_8= 'to' ( (lv_to_9_0= ruleEInt ) ) )? (otherlv_10= 'booleanValue' ( (lv_booleanValue_11_0= ruleEString ) ) )? (otherlv_12= 'const' ( ( ruleEString ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleValueInRange() throws RecognitionException {
        EObject current = null;

        Token lv_multi_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_int_5_0 = null;

        AntlrDatatypeRuleToken lv_from_7_0 = null;

        AntlrDatatypeRuleToken lv_to_9_0 = null;

        AntlrDatatypeRuleToken lv_booleanValue_11_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:5017:2: ( ( () ( (lv_multi_1_0= 'multi' ) )? otherlv_2= 'ValueInRange' otherlv_3= '{' (otherlv_4= 'int' ( (lv_int_5_0= ruleEInt ) ) )? (otherlv_6= 'from' ( (lv_from_7_0= ruleEInt ) ) )? (otherlv_8= 'to' ( (lv_to_9_0= ruleEInt ) ) )? (otherlv_10= 'booleanValue' ( (lv_booleanValue_11_0= ruleEString ) ) )? (otherlv_12= 'const' ( ( ruleEString ) ) )? otherlv_14= '}' ) )
            // InternalMySpectra.g:5018:2: ( () ( (lv_multi_1_0= 'multi' ) )? otherlv_2= 'ValueInRange' otherlv_3= '{' (otherlv_4= 'int' ( (lv_int_5_0= ruleEInt ) ) )? (otherlv_6= 'from' ( (lv_from_7_0= ruleEInt ) ) )? (otherlv_8= 'to' ( (lv_to_9_0= ruleEInt ) ) )? (otherlv_10= 'booleanValue' ( (lv_booleanValue_11_0= ruleEString ) ) )? (otherlv_12= 'const' ( ( ruleEString ) ) )? otherlv_14= '}' )
            {
            // InternalMySpectra.g:5018:2: ( () ( (lv_multi_1_0= 'multi' ) )? otherlv_2= 'ValueInRange' otherlv_3= '{' (otherlv_4= 'int' ( (lv_int_5_0= ruleEInt ) ) )? (otherlv_6= 'from' ( (lv_from_7_0= ruleEInt ) ) )? (otherlv_8= 'to' ( (lv_to_9_0= ruleEInt ) ) )? (otherlv_10= 'booleanValue' ( (lv_booleanValue_11_0= ruleEString ) ) )? (otherlv_12= 'const' ( ( ruleEString ) ) )? otherlv_14= '}' )
            // InternalMySpectra.g:5019:3: () ( (lv_multi_1_0= 'multi' ) )? otherlv_2= 'ValueInRange' otherlv_3= '{' (otherlv_4= 'int' ( (lv_int_5_0= ruleEInt ) ) )? (otherlv_6= 'from' ( (lv_from_7_0= ruleEInt ) ) )? (otherlv_8= 'to' ( (lv_to_9_0= ruleEInt ) ) )? (otherlv_10= 'booleanValue' ( (lv_booleanValue_11_0= ruleEString ) ) )? (otherlv_12= 'const' ( ( ruleEString ) ) )? otherlv_14= '}'
            {
            // InternalMySpectra.g:5019:3: ()
            // InternalMySpectra.g:5020:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueInRangeAccess().getValueInRangeAction_0(),
            					current);
            			

            }

            // InternalMySpectra.g:5026:3: ( (lv_multi_1_0= 'multi' ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==92) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalMySpectra.g:5027:4: (lv_multi_1_0= 'multi' )
                    {
                    // InternalMySpectra.g:5027:4: (lv_multi_1_0= 'multi' )
                    // InternalMySpectra.g:5028:5: lv_multi_1_0= 'multi'
                    {
                    lv_multi_1_0=(Token)match(input,92,FOLLOW_91); 

                    					newLeafNode(lv_multi_1_0, grammarAccess.getValueInRangeAccess().getMultiMultiKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueInRangeRule());
                    					}
                    					setWithLastConsumed(current, "multi", lv_multi_1_0 != null, "multi");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,93,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getValueInRangeAccess().getValueInRangeKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_92); 

            			newLeafNode(otherlv_3, grammarAccess.getValueInRangeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:5048:3: (otherlv_4= 'int' ( (lv_int_5_0= ruleEInt ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==94) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalMySpectra.g:5049:4: otherlv_4= 'int' ( (lv_int_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,94,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getValueInRangeAccess().getIntKeyword_4_0());
                    			
                    // InternalMySpectra.g:5053:4: ( (lv_int_5_0= ruleEInt ) )
                    // InternalMySpectra.g:5054:5: (lv_int_5_0= ruleEInt )
                    {
                    // InternalMySpectra.g:5054:5: (lv_int_5_0= ruleEInt )
                    // InternalMySpectra.g:5055:6: lv_int_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getValueInRangeAccess().getIntEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_int_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueInRangeRule());
                    						}
                    						set(
                    							current,
                    							"int",
                    							lv_int_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:5073:3: (otherlv_6= 'from' ( (lv_from_7_0= ruleEInt ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==95) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalMySpectra.g:5074:4: otherlv_6= 'from' ( (lv_from_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,95,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getValueInRangeAccess().getFromKeyword_5_0());
                    			
                    // InternalMySpectra.g:5078:4: ( (lv_from_7_0= ruleEInt ) )
                    // InternalMySpectra.g:5079:5: (lv_from_7_0= ruleEInt )
                    {
                    // InternalMySpectra.g:5079:5: (lv_from_7_0= ruleEInt )
                    // InternalMySpectra.g:5080:6: lv_from_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getValueInRangeAccess().getFromEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_from_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueInRangeRule());
                    						}
                    						set(
                    							current,
                    							"from",
                    							lv_from_7_0,
                    							"org.xtext.example.myspectra.MySpectra.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:5098:3: (otherlv_8= 'to' ( (lv_to_9_0= ruleEInt ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==96) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalMySpectra.g:5099:4: otherlv_8= 'to' ( (lv_to_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,96,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getValueInRangeAccess().getToKeyword_6_0());
                    			
                    // InternalMySpectra.g:5103:4: ( (lv_to_9_0= ruleEInt ) )
                    // InternalMySpectra.g:5104:5: (lv_to_9_0= ruleEInt )
                    {
                    // InternalMySpectra.g:5104:5: (lv_to_9_0= ruleEInt )
                    // InternalMySpectra.g:5105:6: lv_to_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getValueInRangeAccess().getToEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_95);
                    lv_to_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueInRangeRule());
                    						}
                    						set(
                    							current,
                    							"to",
                    							lv_to_9_0,
                    							"org.xtext.example.myspectra.MySpectra.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:5123:3: (otherlv_10= 'booleanValue' ( (lv_booleanValue_11_0= ruleEString ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==88) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalMySpectra.g:5124:4: otherlv_10= 'booleanValue' ( (lv_booleanValue_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,88,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getValueInRangeAccess().getBooleanValueKeyword_7_0());
                    			
                    // InternalMySpectra.g:5128:4: ( (lv_booleanValue_11_0= ruleEString ) )
                    // InternalMySpectra.g:5129:5: (lv_booleanValue_11_0= ruleEString )
                    {
                    // InternalMySpectra.g:5129:5: (lv_booleanValue_11_0= ruleEString )
                    // InternalMySpectra.g:5130:6: lv_booleanValue_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValueInRangeAccess().getBooleanValueEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_booleanValue_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueInRangeRule());
                    						}
                    						set(
                    							current,
                    							"booleanValue",
                    							lv_booleanValue_11_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:5148:3: (otherlv_12= 'const' ( ( ruleEString ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==97) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalMySpectra.g:5149:4: otherlv_12= 'const' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,97,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getValueInRangeAccess().getConstKeyword_8_0());
                    			
                    // InternalMySpectra.g:5153:4: ( ( ruleEString ) )
                    // InternalMySpectra.g:5154:5: ( ruleEString )
                    {
                    // InternalMySpectra.g:5154:5: ( ruleEString )
                    // InternalMySpectra.g:5155:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValueInRangeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getValueInRangeAccess().getConstTypeConstantCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getValueInRangeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueInRange"


    // $ANTLR start "entryRuleTypeConstant"
    // InternalMySpectra.g:5178:1: entryRuleTypeConstant returns [EObject current=null] : iv_ruleTypeConstant= ruleTypeConstant EOF ;
    public final EObject entryRuleTypeConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstant = null;


        try {
            // InternalMySpectra.g:5178:53: (iv_ruleTypeConstant= ruleTypeConstant EOF )
            // InternalMySpectra.g:5179:2: iv_ruleTypeConstant= ruleTypeConstant EOF
            {
             newCompositeNode(grammarAccess.getTypeConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeConstant=ruleTypeConstant();

            state._fsp--;

             current =iv_ruleTypeConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeConstant"


    // $ANTLR start "ruleTypeConstant"
    // InternalMySpectra.g:5185:1: ruleTypeConstant returns [EObject current=null] : ( () otherlv_1= 'TypeConstant' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleTypeConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:5191:2: ( ( () otherlv_1= 'TypeConstant' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMySpectra.g:5192:2: ( () otherlv_1= 'TypeConstant' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMySpectra.g:5192:2: ( () otherlv_1= 'TypeConstant' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMySpectra.g:5193:3: () otherlv_1= 'TypeConstant' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMySpectra.g:5193:3: ()
            // InternalMySpectra.g:5194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeConstantAccess().getTypeConstantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeConstantAccess().getTypeConstantKeyword_1());
            		
            // InternalMySpectra.g:5204:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:5205:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:5205:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:5206:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTypeConstantAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeConstantRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeConstant"


    // $ANTLR start "entryRulePredicateOrPatternReferrable_Impl"
    // InternalMySpectra.g:5227:1: entryRulePredicateOrPatternReferrable_Impl returns [EObject current=null] : iv_rulePredicateOrPatternReferrable_Impl= rulePredicateOrPatternReferrable_Impl EOF ;
    public final EObject entryRulePredicateOrPatternReferrable_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateOrPatternReferrable_Impl = null;


        try {
            // InternalMySpectra.g:5227:74: (iv_rulePredicateOrPatternReferrable_Impl= rulePredicateOrPatternReferrable_Impl EOF )
            // InternalMySpectra.g:5228:2: iv_rulePredicateOrPatternReferrable_Impl= rulePredicateOrPatternReferrable_Impl EOF
            {
             newCompositeNode(grammarAccess.getPredicateOrPatternReferrable_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicateOrPatternReferrable_Impl=rulePredicateOrPatternReferrable_Impl();

            state._fsp--;

             current =iv_rulePredicateOrPatternReferrable_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicateOrPatternReferrable_Impl"


    // $ANTLR start "rulePredicateOrPatternReferrable_Impl"
    // InternalMySpectra.g:5234:1: rulePredicateOrPatternReferrable_Impl returns [EObject current=null] : ( () otherlv_1= 'PredicateOrPatternReferrable' ) ;
    public final EObject rulePredicateOrPatternReferrable_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMySpectra.g:5240:2: ( ( () otherlv_1= 'PredicateOrPatternReferrable' ) )
            // InternalMySpectra.g:5241:2: ( () otherlv_1= 'PredicateOrPatternReferrable' )
            {
            // InternalMySpectra.g:5241:2: ( () otherlv_1= 'PredicateOrPatternReferrable' )
            // InternalMySpectra.g:5242:3: () otherlv_1= 'PredicateOrPatternReferrable'
            {
            // InternalMySpectra.g:5242:3: ()
            // InternalMySpectra.g:5243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredicateOrPatternReferrable_ImplAccess().getPredicateOrPatternReferrableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPredicateOrPatternReferrable_ImplAccess().getPredicateOrPatternReferrableKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicateOrPatternReferrable_Impl"


    // $ANTLR start "entryRuleReferrable_Impl"
    // InternalMySpectra.g:5257:1: entryRuleReferrable_Impl returns [EObject current=null] : iv_ruleReferrable_Impl= ruleReferrable_Impl EOF ;
    public final EObject entryRuleReferrable_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferrable_Impl = null;


        try {
            // InternalMySpectra.g:5257:56: (iv_ruleReferrable_Impl= ruleReferrable_Impl EOF )
            // InternalMySpectra.g:5258:2: iv_ruleReferrable_Impl= ruleReferrable_Impl EOF
            {
             newCompositeNode(grammarAccess.getReferrable_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferrable_Impl=ruleReferrable_Impl();

            state._fsp--;

             current =iv_ruleReferrable_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferrable_Impl"


    // $ANTLR start "ruleReferrable_Impl"
    // InternalMySpectra.g:5264:1: ruleReferrable_Impl returns [EObject current=null] : ( () otherlv_1= 'Referrable' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleReferrable_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:5270:2: ( ( () otherlv_1= 'Referrable' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMySpectra.g:5271:2: ( () otherlv_1= 'Referrable' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMySpectra.g:5271:2: ( () otherlv_1= 'Referrable' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMySpectra.g:5272:3: () otherlv_1= 'Referrable' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMySpectra.g:5272:3: ()
            // InternalMySpectra.g:5273:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferrable_ImplAccess().getReferrableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReferrable_ImplAccess().getReferrableKeyword_1());
            		
            // InternalMySpectra.g:5283:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:5284:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:5284:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:5285:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferrable_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferrable_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferrable_Impl"


    // $ANTLR start "entryRuleRegExp_Impl"
    // InternalMySpectra.g:5306:1: entryRuleRegExp_Impl returns [EObject current=null] : iv_ruleRegExp_Impl= ruleRegExp_Impl EOF ;
    public final EObject entryRuleRegExp_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegExp_Impl = null;


        try {
            // InternalMySpectra.g:5306:52: (iv_ruleRegExp_Impl= ruleRegExp_Impl EOF )
            // InternalMySpectra.g:5307:2: iv_ruleRegExp_Impl= ruleRegExp_Impl EOF
            {
             newCompositeNode(grammarAccess.getRegExp_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegExp_Impl=ruleRegExp_Impl();

            state._fsp--;

             current =iv_ruleRegExp_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegExp_Impl"


    // $ANTLR start "ruleRegExp_Impl"
    // InternalMySpectra.g:5313:1: ruleRegExp_Impl returns [EObject current=null] : ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'RegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'assrt' ( (lv_assrt_7_0= ruleBooleanTerm ) ) )? (otherlv_8= 'left' ( (lv_left_9_0= ruleRegExp ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleRegExp_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_empty_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_val_5_0 = null;

        EObject lv_assrt_7_0 = null;

        EObject lv_left_9_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:5319:2: ( ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'RegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'assrt' ( (lv_assrt_7_0= ruleBooleanTerm ) ) )? (otherlv_8= 'left' ( (lv_left_9_0= ruleRegExp ) ) )? otherlv_10= '}' ) )
            // InternalMySpectra.g:5320:2: ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'RegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'assrt' ( (lv_assrt_7_0= ruleBooleanTerm ) ) )? (otherlv_8= 'left' ( (lv_left_9_0= ruleRegExp ) ) )? otherlv_10= '}' )
            {
            // InternalMySpectra.g:5320:2: ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'RegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'assrt' ( (lv_assrt_7_0= ruleBooleanTerm ) ) )? (otherlv_8= 'left' ( (lv_left_9_0= ruleRegExp ) ) )? otherlv_10= '}' )
            // InternalMySpectra.g:5321:3: () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'RegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'assrt' ( (lv_assrt_7_0= ruleBooleanTerm ) ) )? (otherlv_8= 'left' ( (lv_left_9_0= ruleRegExp ) ) )? otherlv_10= '}'
            {
            // InternalMySpectra.g:5321:3: ()
            // InternalMySpectra.g:5322:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegExp_ImplAccess().getRegExpAction_0(),
            					current);
            			

            }

            // InternalMySpectra.g:5328:3: ( (lv_empty_1_0= 'empty' ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==101) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalMySpectra.g:5329:4: (lv_empty_1_0= 'empty' )
                    {
                    // InternalMySpectra.g:5329:4: (lv_empty_1_0= 'empty' )
                    // InternalMySpectra.g:5330:5: lv_empty_1_0= 'empty'
                    {
                    lv_empty_1_0=(Token)match(input,101,FOLLOW_97); 

                    					newLeafNode(lv_empty_1_0, grammarAccess.getRegExp_ImplAccess().getEmptyEmptyKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegExp_ImplRule());
                    					}
                    					setWithLastConsumed(current, "empty", lv_empty_1_0 != null, "empty");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,102,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRegExp_ImplAccess().getRegExpKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_98); 

            			newLeafNode(otherlv_3, grammarAccess.getRegExp_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:5350:3: (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==103) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalMySpectra.g:5351:4: otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,103,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRegExp_ImplAccess().getValKeyword_4_0());
                    			
                    // InternalMySpectra.g:5355:4: ( (lv_val_5_0= ruleEString ) )
                    // InternalMySpectra.g:5356:5: (lv_val_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:5356:5: (lv_val_5_0= ruleEString )
                    // InternalMySpectra.g:5357:6: lv_val_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRegExp_ImplAccess().getValEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_99);
                    lv_val_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegExp_ImplRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:5375:3: (otherlv_6= 'assrt' ( (lv_assrt_7_0= ruleBooleanTerm ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==104) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalMySpectra.g:5376:4: otherlv_6= 'assrt' ( (lv_assrt_7_0= ruleBooleanTerm ) )
                    {
                    otherlv_6=(Token)match(input,104,FOLLOW_100); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegExp_ImplAccess().getAssrtKeyword_5_0());
                    			
                    // InternalMySpectra.g:5380:4: ( (lv_assrt_7_0= ruleBooleanTerm ) )
                    // InternalMySpectra.g:5381:5: (lv_assrt_7_0= ruleBooleanTerm )
                    {
                    // InternalMySpectra.g:5381:5: (lv_assrt_7_0= ruleBooleanTerm )
                    // InternalMySpectra.g:5382:6: lv_assrt_7_0= ruleBooleanTerm
                    {

                    						newCompositeNode(grammarAccess.getRegExp_ImplAccess().getAssrtBooleanTermParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    lv_assrt_7_0=ruleBooleanTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegExp_ImplRule());
                    						}
                    						set(
                    							current,
                    							"assrt",
                    							lv_assrt_7_0,
                    							"org.xtext.example.myspectra.MySpectra.BooleanTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:5400:3: (otherlv_8= 'left' ( (lv_left_9_0= ruleRegExp ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==62) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalMySpectra.g:5401:4: otherlv_8= 'left' ( (lv_left_9_0= ruleRegExp ) )
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_60); 

                    				newLeafNode(otherlv_8, grammarAccess.getRegExp_ImplAccess().getLeftKeyword_6_0());
                    			
                    // InternalMySpectra.g:5405:4: ( (lv_left_9_0= ruleRegExp ) )
                    // InternalMySpectra.g:5406:5: (lv_left_9_0= ruleRegExp )
                    {
                    // InternalMySpectra.g:5406:5: (lv_left_9_0= ruleRegExp )
                    // InternalMySpectra.g:5407:6: lv_left_9_0= ruleRegExp
                    {

                    						newCompositeNode(grammarAccess.getRegExp_ImplAccess().getLeftRegExpParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_left_9_0=ruleRegExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegExp_ImplRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_9_0,
                    							"org.xtext.example.myspectra.MySpectra.RegExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRegExp_ImplAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegExp_Impl"


    // $ANTLR start "entryRuleDefineRegExpDecl"
    // InternalMySpectra.g:5433:1: entryRuleDefineRegExpDecl returns [EObject current=null] : iv_ruleDefineRegExpDecl= ruleDefineRegExpDecl EOF ;
    public final EObject entryRuleDefineRegExpDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineRegExpDecl = null;


        try {
            // InternalMySpectra.g:5433:57: (iv_ruleDefineRegExpDecl= ruleDefineRegExpDecl EOF )
            // InternalMySpectra.g:5434:2: iv_ruleDefineRegExpDecl= ruleDefineRegExpDecl EOF
            {
             newCompositeNode(grammarAccess.getDefineRegExpDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefineRegExpDecl=ruleDefineRegExpDecl();

            state._fsp--;

             current =iv_ruleDefineRegExpDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefineRegExpDecl"


    // $ANTLR start "ruleDefineRegExpDecl"
    // InternalMySpectra.g:5440:1: ruleDefineRegExpDecl returns [EObject current=null] : ( () otherlv_1= 'DefineRegExpDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exp' ( (lv_exp_5_0= ruleRegExp ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleDefineRegExpDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:5446:2: ( ( () otherlv_1= 'DefineRegExpDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exp' ( (lv_exp_5_0= ruleRegExp ) ) )? otherlv_6= '}' ) )
            // InternalMySpectra.g:5447:2: ( () otherlv_1= 'DefineRegExpDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exp' ( (lv_exp_5_0= ruleRegExp ) ) )? otherlv_6= '}' )
            {
            // InternalMySpectra.g:5447:2: ( () otherlv_1= 'DefineRegExpDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exp' ( (lv_exp_5_0= ruleRegExp ) ) )? otherlv_6= '}' )
            // InternalMySpectra.g:5448:3: () otherlv_1= 'DefineRegExpDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exp' ( (lv_exp_5_0= ruleRegExp ) ) )? otherlv_6= '}'
            {
            // InternalMySpectra.g:5448:3: ()
            // InternalMySpectra.g:5449:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefineRegExpDeclAccess().getDefineRegExpDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineRegExpDeclAccess().getDefineRegExpDeclKeyword_1());
            		
            // InternalMySpectra.g:5459:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:5460:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:5460:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:5461:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDefineRegExpDeclAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefineRegExpDeclRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_102); 

            			newLeafNode(otherlv_3, grammarAccess.getDefineRegExpDeclAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:5482:3: (otherlv_4= 'exp' ( (lv_exp_5_0= ruleRegExp ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==106) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalMySpectra.g:5483:4: otherlv_4= 'exp' ( (lv_exp_5_0= ruleRegExp ) )
                    {
                    otherlv_4=(Token)match(input,106,FOLLOW_60); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefineRegExpDeclAccess().getExpKeyword_4_0());
                    			
                    // InternalMySpectra.g:5487:4: ( (lv_exp_5_0= ruleRegExp ) )
                    // InternalMySpectra.g:5488:5: (lv_exp_5_0= ruleRegExp )
                    {
                    // InternalMySpectra.g:5488:5: (lv_exp_5_0= ruleRegExp )
                    // InternalMySpectra.g:5489:6: lv_exp_5_0= ruleRegExp
                    {

                    						newCompositeNode(grammarAccess.getDefineRegExpDeclAccess().getExpRegExpParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_exp_5_0=ruleRegExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineRegExpDeclRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_5_0,
                    							"org.xtext.example.myspectra.MySpectra.RegExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDefineRegExpDeclAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefineRegExpDecl"


    // $ANTLR start "entryRuleVarDecl"
    // InternalMySpectra.g:5515:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalMySpectra.g:5515:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalMySpectra.g:5516:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalMySpectra.g:5522:1: ruleVarDecl returns [EObject current=null] : ( () otherlv_1= 'VarDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:5528:2: ( ( () otherlv_1= 'VarDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' ) )
            // InternalMySpectra.g:5529:2: ( () otherlv_1= 'VarDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' )
            {
            // InternalMySpectra.g:5529:2: ( () otherlv_1= 'VarDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' )
            // InternalMySpectra.g:5530:3: () otherlv_1= 'VarDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}'
            {
            // InternalMySpectra.g:5530:3: ()
            // InternalMySpectra.g:5531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarDeclAccess().getVarDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,107,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVarDeclAccess().getVarDeclKeyword_1());
            		
            // InternalMySpectra.g:5541:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:5542:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:5542:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:5543:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVarDeclAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getVarDeclAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:5564:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==28) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalMySpectra.g:5565:4: otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getVarDeclAccess().getTypeKeyword_4_0());
                    			
                    // InternalMySpectra.g:5569:4: ( (lv_type_5_0= ruleVarType ) )
                    // InternalMySpectra.g:5570:5: (lv_type_5_0= ruleVarType )
                    {
                    // InternalMySpectra.g:5570:5: (lv_type_5_0= ruleVarType )
                    // InternalMySpectra.g:5571:6: lv_type_5_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getVarDeclAccess().getTypeVarTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_5_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.example.myspectra.MySpectra.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVarDeclAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleDefineDecl"
    // InternalMySpectra.g:5597:1: entryRuleDefineDecl returns [EObject current=null] : iv_ruleDefineDecl= ruleDefineDecl EOF ;
    public final EObject entryRuleDefineDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineDecl = null;


        try {
            // InternalMySpectra.g:5597:51: (iv_ruleDefineDecl= ruleDefineDecl EOF )
            // InternalMySpectra.g:5598:2: iv_ruleDefineDecl= ruleDefineDecl EOF
            {
             newCompositeNode(grammarAccess.getDefineDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefineDecl=ruleDefineDecl();

            state._fsp--;

             current =iv_ruleDefineDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefineDecl"


    // $ANTLR start "ruleDefineDecl"
    // InternalMySpectra.g:5604:1: ruleDefineDecl returns [EObject current=null] : ( () otherlv_1= 'DefineDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'simpleExpr' ( (lv_simpleExpr_5_0= ruleTemporalExpression ) ) )? (otherlv_6= 'dimensions' otherlv_7= '{' ( (lv_dimensions_8_0= ruleSizeDefineDecl ) ) (otherlv_9= ',' ( (lv_dimensions_10_0= ruleSizeDefineDecl ) ) )* otherlv_11= '}' )? (otherlv_12= 'innerArray' ( (lv_innerArray_13_0= ruleDefineArray ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleDefineDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_simpleExpr_5_0 = null;

        EObject lv_dimensions_8_0 = null;

        EObject lv_dimensions_10_0 = null;

        EObject lv_innerArray_13_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:5610:2: ( ( () otherlv_1= 'DefineDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'simpleExpr' ( (lv_simpleExpr_5_0= ruleTemporalExpression ) ) )? (otherlv_6= 'dimensions' otherlv_7= '{' ( (lv_dimensions_8_0= ruleSizeDefineDecl ) ) (otherlv_9= ',' ( (lv_dimensions_10_0= ruleSizeDefineDecl ) ) )* otherlv_11= '}' )? (otherlv_12= 'innerArray' ( (lv_innerArray_13_0= ruleDefineArray ) ) )? otherlv_14= '}' ) )
            // InternalMySpectra.g:5611:2: ( () otherlv_1= 'DefineDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'simpleExpr' ( (lv_simpleExpr_5_0= ruleTemporalExpression ) ) )? (otherlv_6= 'dimensions' otherlv_7= '{' ( (lv_dimensions_8_0= ruleSizeDefineDecl ) ) (otherlv_9= ',' ( (lv_dimensions_10_0= ruleSizeDefineDecl ) ) )* otherlv_11= '}' )? (otherlv_12= 'innerArray' ( (lv_innerArray_13_0= ruleDefineArray ) ) )? otherlv_14= '}' )
            {
            // InternalMySpectra.g:5611:2: ( () otherlv_1= 'DefineDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'simpleExpr' ( (lv_simpleExpr_5_0= ruleTemporalExpression ) ) )? (otherlv_6= 'dimensions' otherlv_7= '{' ( (lv_dimensions_8_0= ruleSizeDefineDecl ) ) (otherlv_9= ',' ( (lv_dimensions_10_0= ruleSizeDefineDecl ) ) )* otherlv_11= '}' )? (otherlv_12= 'innerArray' ( (lv_innerArray_13_0= ruleDefineArray ) ) )? otherlv_14= '}' )
            // InternalMySpectra.g:5612:3: () otherlv_1= 'DefineDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'simpleExpr' ( (lv_simpleExpr_5_0= ruleTemporalExpression ) ) )? (otherlv_6= 'dimensions' otherlv_7= '{' ( (lv_dimensions_8_0= ruleSizeDefineDecl ) ) (otherlv_9= ',' ( (lv_dimensions_10_0= ruleSizeDefineDecl ) ) )* otherlv_11= '}' )? (otherlv_12= 'innerArray' ( (lv_innerArray_13_0= ruleDefineArray ) ) )? otherlv_14= '}'
            {
            // InternalMySpectra.g:5612:3: ()
            // InternalMySpectra.g:5613:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefineDeclAccess().getDefineDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,108,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineDeclAccess().getDefineDeclKeyword_1());
            		
            // InternalMySpectra.g:5623:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:5624:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:5624:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:5625:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDefineDeclAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefineDeclRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_103); 

            			newLeafNode(otherlv_3, grammarAccess.getDefineDeclAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:5646:3: (otherlv_4= 'simpleExpr' ( (lv_simpleExpr_5_0= ruleTemporalExpression ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==109) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalMySpectra.g:5647:4: otherlv_4= 'simpleExpr' ( (lv_simpleExpr_5_0= ruleTemporalExpression ) )
                    {
                    otherlv_4=(Token)match(input,109,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefineDeclAccess().getSimpleExprKeyword_4_0());
                    			
                    // InternalMySpectra.g:5651:4: ( (lv_simpleExpr_5_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:5652:5: (lv_simpleExpr_5_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:5652:5: (lv_simpleExpr_5_0= ruleTemporalExpression )
                    // InternalMySpectra.g:5653:6: lv_simpleExpr_5_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getDefineDeclAccess().getSimpleExprTemporalExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_simpleExpr_5_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineDeclRule());
                    						}
                    						set(
                    							current,
                    							"simpleExpr",
                    							lv_simpleExpr_5_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:5671:3: (otherlv_6= 'dimensions' otherlv_7= '{' ( (lv_dimensions_8_0= ruleSizeDefineDecl ) ) (otherlv_9= ',' ( (lv_dimensions_10_0= ruleSizeDefineDecl ) ) )* otherlv_11= '}' )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==110) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalMySpectra.g:5672:4: otherlv_6= 'dimensions' otherlv_7= '{' ( (lv_dimensions_8_0= ruleSizeDefineDecl ) ) (otherlv_9= ',' ( (lv_dimensions_10_0= ruleSizeDefineDecl ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,110,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getDefineDeclAccess().getDimensionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_105); 

                    				newLeafNode(otherlv_7, grammarAccess.getDefineDeclAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMySpectra.g:5680:4: ( (lv_dimensions_8_0= ruleSizeDefineDecl ) )
                    // InternalMySpectra.g:5681:5: (lv_dimensions_8_0= ruleSizeDefineDecl )
                    {
                    // InternalMySpectra.g:5681:5: (lv_dimensions_8_0= ruleSizeDefineDecl )
                    // InternalMySpectra.g:5682:6: lv_dimensions_8_0= ruleSizeDefineDecl
                    {

                    						newCompositeNode(grammarAccess.getDefineDeclAccess().getDimensionsSizeDefineDeclParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_dimensions_8_0=ruleSizeDefineDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineDeclRule());
                    						}
                    						add(
                    							current,
                    							"dimensions",
                    							lv_dimensions_8_0,
                    							"org.xtext.example.myspectra.MySpectra.SizeDefineDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:5699:4: (otherlv_9= ',' ( (lv_dimensions_10_0= ruleSizeDefineDecl ) ) )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==14) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // InternalMySpectra.g:5700:5: otherlv_9= ',' ( (lv_dimensions_10_0= ruleSizeDefineDecl ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_105); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDefineDeclAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMySpectra.g:5704:5: ( (lv_dimensions_10_0= ruleSizeDefineDecl ) )
                    	    // InternalMySpectra.g:5705:6: (lv_dimensions_10_0= ruleSizeDefineDecl )
                    	    {
                    	    // InternalMySpectra.g:5705:6: (lv_dimensions_10_0= ruleSizeDefineDecl )
                    	    // InternalMySpectra.g:5706:7: lv_dimensions_10_0= ruleSizeDefineDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getDefineDeclAccess().getDimensionsSizeDefineDeclParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_dimensions_10_0=ruleSizeDefineDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDefineDeclRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dimensions",
                    	    								lv_dimensions_10_0,
                    	    								"org.xtext.example.myspectra.MySpectra.SizeDefineDecl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_106); 

                    				newLeafNode(otherlv_11, grammarAccess.getDefineDeclAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:5729:3: (otherlv_12= 'innerArray' ( (lv_innerArray_13_0= ruleDefineArray ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==111) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalMySpectra.g:5730:4: otherlv_12= 'innerArray' ( (lv_innerArray_13_0= ruleDefineArray ) )
                    {
                    otherlv_12=(Token)match(input,111,FOLLOW_107); 

                    				newLeafNode(otherlv_12, grammarAccess.getDefineDeclAccess().getInnerArrayKeyword_6_0());
                    			
                    // InternalMySpectra.g:5734:4: ( (lv_innerArray_13_0= ruleDefineArray ) )
                    // InternalMySpectra.g:5735:5: (lv_innerArray_13_0= ruleDefineArray )
                    {
                    // InternalMySpectra.g:5735:5: (lv_innerArray_13_0= ruleDefineArray )
                    // InternalMySpectra.g:5736:6: lv_innerArray_13_0= ruleDefineArray
                    {

                    						newCompositeNode(grammarAccess.getDefineDeclAccess().getInnerArrayDefineArrayParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_innerArray_13_0=ruleDefineArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineDeclRule());
                    						}
                    						set(
                    							current,
                    							"innerArray",
                    							lv_innerArray_13_0,
                    							"org.xtext.example.myspectra.MySpectra.DefineArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDefineDeclAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefineDecl"


    // $ANTLR start "entryRulePatternParam"
    // InternalMySpectra.g:5762:1: entryRulePatternParam returns [EObject current=null] : iv_rulePatternParam= rulePatternParam EOF ;
    public final EObject entryRulePatternParam() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternParam = null;


        try {
            // InternalMySpectra.g:5762:53: (iv_rulePatternParam= rulePatternParam EOF )
            // InternalMySpectra.g:5763:2: iv_rulePatternParam= rulePatternParam EOF
            {
             newCompositeNode(grammarAccess.getPatternParamRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternParam=rulePatternParam();

            state._fsp--;

             current =iv_rulePatternParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternParam"


    // $ANTLR start "rulePatternParam"
    // InternalMySpectra.g:5769:1: rulePatternParam returns [EObject current=null] : ( () otherlv_1= 'PatternParam' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePatternParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:5775:2: ( ( () otherlv_1= 'PatternParam' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMySpectra.g:5776:2: ( () otherlv_1= 'PatternParam' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMySpectra.g:5776:2: ( () otherlv_1= 'PatternParam' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMySpectra.g:5777:3: () otherlv_1= 'PatternParam' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMySpectra.g:5777:3: ()
            // InternalMySpectra.g:5778:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternParamAccess().getPatternParamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,112,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternParamAccess().getPatternParamKeyword_1());
            		
            // InternalMySpectra.g:5788:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:5789:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:5789:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:5790:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPatternParamAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternParamRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternParam"


    // $ANTLR start "entryRuleTypedParam"
    // InternalMySpectra.g:5811:1: entryRuleTypedParam returns [EObject current=null] : iv_ruleTypedParam= ruleTypedParam EOF ;
    public final EObject entryRuleTypedParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedParam = null;


        try {
            // InternalMySpectra.g:5811:51: (iv_ruleTypedParam= ruleTypedParam EOF )
            // InternalMySpectra.g:5812:2: iv_ruleTypedParam= ruleTypedParam EOF
            {
             newCompositeNode(grammarAccess.getTypedParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedParam=ruleTypedParam();

            state._fsp--;

             current =iv_ruleTypedParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedParam"


    // $ANTLR start "ruleTypedParam"
    // InternalMySpectra.g:5818:1: ruleTypedParam returns [EObject current=null] : ( () otherlv_1= 'TypedParam' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleTypedParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:5824:2: ( ( () otherlv_1= 'TypedParam' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' ) )
            // InternalMySpectra.g:5825:2: ( () otherlv_1= 'TypedParam' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' )
            {
            // InternalMySpectra.g:5825:2: ( () otherlv_1= 'TypedParam' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}' )
            // InternalMySpectra.g:5826:3: () otherlv_1= 'TypedParam' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? otherlv_6= '}'
            {
            // InternalMySpectra.g:5826:3: ()
            // InternalMySpectra.g:5827:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypedParamAccess().getTypedParamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,113,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTypedParamAccess().getTypedParamKeyword_1());
            		
            // InternalMySpectra.g:5837:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:5838:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:5838:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:5839:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTypedParamAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedParamRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTypedParamAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:5860:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==28) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalMySpectra.g:5861:4: otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getTypedParamAccess().getTypeKeyword_4_0());
                    			
                    // InternalMySpectra.g:5865:4: ( (lv_type_5_0= ruleVarType ) )
                    // InternalMySpectra.g:5866:5: (lv_type_5_0= ruleVarType )
                    {
                    // InternalMySpectra.g:5866:5: (lv_type_5_0= ruleVarType )
                    // InternalMySpectra.g:5867:6: lv_type_5_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getTypedParamAccess().getTypeVarTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_5_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypedParamRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.example.myspectra.MySpectra.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTypedParamAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedParam"


    // $ANTLR start "entryRuleDomainVarDecl"
    // InternalMySpectra.g:5893:1: entryRuleDomainVarDecl returns [EObject current=null] : iv_ruleDomainVarDecl= ruleDomainVarDecl EOF ;
    public final EObject entryRuleDomainVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainVarDecl = null;


        try {
            // InternalMySpectra.g:5893:54: (iv_ruleDomainVarDecl= ruleDomainVarDecl EOF )
            // InternalMySpectra.g:5894:2: iv_ruleDomainVarDecl= ruleDomainVarDecl EOF
            {
             newCompositeNode(grammarAccess.getDomainVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainVarDecl=ruleDomainVarDecl();

            state._fsp--;

             current =iv_ruleDomainVarDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainVarDecl"


    // $ANTLR start "ruleDomainVarDecl"
    // InternalMySpectra.g:5900:1: ruleDomainVarDecl returns [EObject current=null] : ( () otherlv_1= 'DomainVarDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domainType' ( (lv_domainType_5_0= ruleVarType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleDomainVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_domainType_5_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:5906:2: ( ( () otherlv_1= 'DomainVarDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domainType' ( (lv_domainType_5_0= ruleVarType ) ) )? otherlv_6= '}' ) )
            // InternalMySpectra.g:5907:2: ( () otherlv_1= 'DomainVarDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domainType' ( (lv_domainType_5_0= ruleVarType ) ) )? otherlv_6= '}' )
            {
            // InternalMySpectra.g:5907:2: ( () otherlv_1= 'DomainVarDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domainType' ( (lv_domainType_5_0= ruleVarType ) ) )? otherlv_6= '}' )
            // InternalMySpectra.g:5908:3: () otherlv_1= 'DomainVarDecl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domainType' ( (lv_domainType_5_0= ruleVarType ) ) )? otherlv_6= '}'
            {
            // InternalMySpectra.g:5908:3: ()
            // InternalMySpectra.g:5909:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDomainVarDeclAccess().getDomainVarDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,114,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainVarDeclAccess().getDomainVarDeclKeyword_1());
            		
            // InternalMySpectra.g:5919:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:5920:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:5920:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:5921:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDomainVarDeclAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainVarDeclRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_108); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainVarDeclAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:5942:3: (otherlv_4= 'domainType' ( (lv_domainType_5_0= ruleVarType ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==115) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalMySpectra.g:5943:4: otherlv_4= 'domainType' ( (lv_domainType_5_0= ruleVarType ) )
                    {
                    otherlv_4=(Token)match(input,115,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getDomainVarDeclAccess().getDomainTypeKeyword_4_0());
                    			
                    // InternalMySpectra.g:5947:4: ( (lv_domainType_5_0= ruleVarType ) )
                    // InternalMySpectra.g:5948:5: (lv_domainType_5_0= ruleVarType )
                    {
                    // InternalMySpectra.g:5948:5: (lv_domainType_5_0= ruleVarType )
                    // InternalMySpectra.g:5949:6: lv_domainType_5_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getDomainVarDeclAccess().getDomainTypeVarTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_domainType_5_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDomainVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"domainType",
                    							lv_domainType_5_0,
                    							"org.xtext.example.myspectra.MySpectra.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDomainVarDeclAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainVarDecl"


    // $ANTLR start "entryRuleVarType"
    // InternalMySpectra.g:5975:1: entryRuleVarType returns [EObject current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final EObject entryRuleVarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarType = null;


        try {
            // InternalMySpectra.g:5975:48: (iv_ruleVarType= ruleVarType EOF )
            // InternalMySpectra.g:5976:2: iv_ruleVarType= ruleVarType EOF
            {
             newCompositeNode(grammarAccess.getVarTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarType=ruleVarType();

            state._fsp--;

             current =iv_ruleVarType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // InternalMySpectra.g:5982:1: ruleVarType returns [EObject current=null] : ( () otherlv_1= 'VarType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? (otherlv_6= 'subr' ( (lv_subr_7_0= ruleSubrange ) ) )? (otherlv_8= 'const' otherlv_9= '{' ( (lv_const_10_0= ruleTypeConstant ) ) (otherlv_11= ',' ( (lv_const_12_0= ruleTypeConstant ) ) )* otherlv_13= '}' )? (otherlv_14= 'dimensions' otherlv_15= '{' ( (lv_dimensions_16_0= ruleSizeDefineDecl ) ) (otherlv_17= ',' ( (lv_dimensions_18_0= ruleSizeDefineDecl ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_subr_7_0 = null;

        EObject lv_const_10_0 = null;

        EObject lv_const_12_0 = null;

        EObject lv_dimensions_16_0 = null;

        EObject lv_dimensions_18_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:5988:2: ( ( () otherlv_1= 'VarType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? (otherlv_6= 'subr' ( (lv_subr_7_0= ruleSubrange ) ) )? (otherlv_8= 'const' otherlv_9= '{' ( (lv_const_10_0= ruleTypeConstant ) ) (otherlv_11= ',' ( (lv_const_12_0= ruleTypeConstant ) ) )* otherlv_13= '}' )? (otherlv_14= 'dimensions' otherlv_15= '{' ( (lv_dimensions_16_0= ruleSizeDefineDecl ) ) (otherlv_17= ',' ( (lv_dimensions_18_0= ruleSizeDefineDecl ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalMySpectra.g:5989:2: ( () otherlv_1= 'VarType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? (otherlv_6= 'subr' ( (lv_subr_7_0= ruleSubrange ) ) )? (otherlv_8= 'const' otherlv_9= '{' ( (lv_const_10_0= ruleTypeConstant ) ) (otherlv_11= ',' ( (lv_const_12_0= ruleTypeConstant ) ) )* otherlv_13= '}' )? (otherlv_14= 'dimensions' otherlv_15= '{' ( (lv_dimensions_16_0= ruleSizeDefineDecl ) ) (otherlv_17= ',' ( (lv_dimensions_18_0= ruleSizeDefineDecl ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalMySpectra.g:5989:2: ( () otherlv_1= 'VarType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? (otherlv_6= 'subr' ( (lv_subr_7_0= ruleSubrange ) ) )? (otherlv_8= 'const' otherlv_9= '{' ( (lv_const_10_0= ruleTypeConstant ) ) (otherlv_11= ',' ( (lv_const_12_0= ruleTypeConstant ) ) )* otherlv_13= '}' )? (otherlv_14= 'dimensions' otherlv_15= '{' ( (lv_dimensions_16_0= ruleSizeDefineDecl ) ) (otherlv_17= ',' ( (lv_dimensions_18_0= ruleSizeDefineDecl ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalMySpectra.g:5990:3: () otherlv_1= 'VarType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? (otherlv_6= 'subr' ( (lv_subr_7_0= ruleSubrange ) ) )? (otherlv_8= 'const' otherlv_9= '{' ( (lv_const_10_0= ruleTypeConstant ) ) (otherlv_11= ',' ( (lv_const_12_0= ruleTypeConstant ) ) )* otherlv_13= '}' )? (otherlv_14= 'dimensions' otherlv_15= '{' ( (lv_dimensions_16_0= ruleSizeDefineDecl ) ) (otherlv_17= ',' ( (lv_dimensions_18_0= ruleSizeDefineDecl ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalMySpectra.g:5990:3: ()
            // InternalMySpectra.g:5991:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarTypeAccess().getVarTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,116,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVarTypeAccess().getVarTypeKeyword_1());
            		
            // InternalMySpectra.g:6001:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMySpectra.g:6002:4: (lv_name_2_0= ruleEString )
            {
            // InternalMySpectra.g:6002:4: (lv_name_2_0= ruleEString )
            // InternalMySpectra.g:6003:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVarTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.myspectra.MySpectra.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_109); 

            			newLeafNode(otherlv_3, grammarAccess.getVarTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:6024:3: (otherlv_4= 'type' ( ( ruleEString ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==28) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalMySpectra.g:6025:4: otherlv_4= 'type' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getVarTypeAccess().getTypeKeyword_4_0());
                    			
                    // InternalMySpectra.g:6029:4: ( ( ruleEString ) )
                    // InternalMySpectra.g:6030:5: ( ruleEString )
                    {
                    // InternalMySpectra.g:6030:5: ( ruleEString )
                    // InternalMySpectra.g:6031:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVarTypeAccess().getTypeTypeDefCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_110);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6046:3: (otherlv_6= 'subr' ( (lv_subr_7_0= ruleSubrange ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==117) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalMySpectra.g:6047:4: otherlv_6= 'subr' ( (lv_subr_7_0= ruleSubrange ) )
                    {
                    otherlv_6=(Token)match(input,117,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getVarTypeAccess().getSubrKeyword_5_0());
                    			
                    // InternalMySpectra.g:6051:4: ( (lv_subr_7_0= ruleSubrange ) )
                    // InternalMySpectra.g:6052:5: (lv_subr_7_0= ruleSubrange )
                    {
                    // InternalMySpectra.g:6052:5: (lv_subr_7_0= ruleSubrange )
                    // InternalMySpectra.g:6053:6: lv_subr_7_0= ruleSubrange
                    {

                    						newCompositeNode(grammarAccess.getVarTypeAccess().getSubrSubrangeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_111);
                    lv_subr_7_0=ruleSubrange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarTypeRule());
                    						}
                    						set(
                    							current,
                    							"subr",
                    							lv_subr_7_0,
                    							"org.xtext.example.myspectra.MySpectra.Subrange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6071:3: (otherlv_8= 'const' otherlv_9= '{' ( (lv_const_10_0= ruleTypeConstant ) ) (otherlv_11= ',' ( (lv_const_12_0= ruleTypeConstant ) ) )* otherlv_13= '}' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==97) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalMySpectra.g:6072:4: otherlv_8= 'const' otherlv_9= '{' ( (lv_const_10_0= ruleTypeConstant ) ) (otherlv_11= ',' ( (lv_const_12_0= ruleTypeConstant ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,97,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getVarTypeAccess().getConstKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_112); 

                    				newLeafNode(otherlv_9, grammarAccess.getVarTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMySpectra.g:6080:4: ( (lv_const_10_0= ruleTypeConstant ) )
                    // InternalMySpectra.g:6081:5: (lv_const_10_0= ruleTypeConstant )
                    {
                    // InternalMySpectra.g:6081:5: (lv_const_10_0= ruleTypeConstant )
                    // InternalMySpectra.g:6082:6: lv_const_10_0= ruleTypeConstant
                    {

                    						newCompositeNode(grammarAccess.getVarTypeAccess().getConstTypeConstantParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_const_10_0=ruleTypeConstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarTypeRule());
                    						}
                    						add(
                    							current,
                    							"const",
                    							lv_const_10_0,
                    							"org.xtext.example.myspectra.MySpectra.TypeConstant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:6099:4: (otherlv_11= ',' ( (lv_const_12_0= ruleTypeConstant ) ) )*
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==14) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // InternalMySpectra.g:6100:5: otherlv_11= ',' ( (lv_const_12_0= ruleTypeConstant ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_112); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getVarTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMySpectra.g:6104:5: ( (lv_const_12_0= ruleTypeConstant ) )
                    	    // InternalMySpectra.g:6105:6: (lv_const_12_0= ruleTypeConstant )
                    	    {
                    	    // InternalMySpectra.g:6105:6: (lv_const_12_0= ruleTypeConstant )
                    	    // InternalMySpectra.g:6106:7: lv_const_12_0= ruleTypeConstant
                    	    {

                    	    							newCompositeNode(grammarAccess.getVarTypeAccess().getConstTypeConstantParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_const_12_0=ruleTypeConstant();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVarTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"const",
                    	    								lv_const_12_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TypeConstant");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop145;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_113); 

                    				newLeafNode(otherlv_13, grammarAccess.getVarTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:6129:3: (otherlv_14= 'dimensions' otherlv_15= '{' ( (lv_dimensions_16_0= ruleSizeDefineDecl ) ) (otherlv_17= ',' ( (lv_dimensions_18_0= ruleSizeDefineDecl ) ) )* otherlv_19= '}' )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==110) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalMySpectra.g:6130:4: otherlv_14= 'dimensions' otherlv_15= '{' ( (lv_dimensions_16_0= ruleSizeDefineDecl ) ) (otherlv_17= ',' ( (lv_dimensions_18_0= ruleSizeDefineDecl ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,110,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getVarTypeAccess().getDimensionsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_105); 

                    				newLeafNode(otherlv_15, grammarAccess.getVarTypeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMySpectra.g:6138:4: ( (lv_dimensions_16_0= ruleSizeDefineDecl ) )
                    // InternalMySpectra.g:6139:5: (lv_dimensions_16_0= ruleSizeDefineDecl )
                    {
                    // InternalMySpectra.g:6139:5: (lv_dimensions_16_0= ruleSizeDefineDecl )
                    // InternalMySpectra.g:6140:6: lv_dimensions_16_0= ruleSizeDefineDecl
                    {

                    						newCompositeNode(grammarAccess.getVarTypeAccess().getDimensionsSizeDefineDeclParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_dimensions_16_0=ruleSizeDefineDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarTypeRule());
                    						}
                    						add(
                    							current,
                    							"dimensions",
                    							lv_dimensions_16_0,
                    							"org.xtext.example.myspectra.MySpectra.SizeDefineDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:6157:4: (otherlv_17= ',' ( (lv_dimensions_18_0= ruleSizeDefineDecl ) ) )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==14) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // InternalMySpectra.g:6158:5: otherlv_17= ',' ( (lv_dimensions_18_0= ruleSizeDefineDecl ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_105); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getVarTypeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMySpectra.g:6162:5: ( (lv_dimensions_18_0= ruleSizeDefineDecl ) )
                    	    // InternalMySpectra.g:6163:6: (lv_dimensions_18_0= ruleSizeDefineDecl )
                    	    {
                    	    // InternalMySpectra.g:6163:6: (lv_dimensions_18_0= ruleSizeDefineDecl )
                    	    // InternalMySpectra.g:6164:7: lv_dimensions_18_0= ruleSizeDefineDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getVarTypeAccess().getDimensionsSizeDefineDeclParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_dimensions_18_0=ruleSizeDefineDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVarTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dimensions",
                    	    								lv_dimensions_18_0,
                    	    								"org.xtext.example.myspectra.MySpectra.SizeDefineDecl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_19, grammarAccess.getVarTypeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getVarTypeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleSubrange"
    // InternalMySpectra.g:6195:1: entryRuleSubrange returns [EObject current=null] : iv_ruleSubrange= ruleSubrange EOF ;
    public final EObject entryRuleSubrange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrange = null;


        try {
            // InternalMySpectra.g:6195:49: (iv_ruleSubrange= ruleSubrange EOF )
            // InternalMySpectra.g:6196:2: iv_ruleSubrange= ruleSubrange EOF
            {
             newCompositeNode(grammarAccess.getSubrangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubrange=ruleSubrange();

            state._fsp--;

             current =iv_ruleSubrange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubrange"


    // $ANTLR start "ruleSubrange"
    // InternalMySpectra.g:6202:1: ruleSubrange returns [EObject current=null] : ( () otherlv_1= 'Subrange' otherlv_2= '{' (otherlv_3= 'from' ( (lv_from_4_0= ruleSizeDefineDecl ) ) )? (otherlv_5= 'to' ( (lv_to_6_0= ruleSizeDefineDecl ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleSubrange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_from_4_0 = null;

        EObject lv_to_6_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:6208:2: ( ( () otherlv_1= 'Subrange' otherlv_2= '{' (otherlv_3= 'from' ( (lv_from_4_0= ruleSizeDefineDecl ) ) )? (otherlv_5= 'to' ( (lv_to_6_0= ruleSizeDefineDecl ) ) )? otherlv_7= '}' ) )
            // InternalMySpectra.g:6209:2: ( () otherlv_1= 'Subrange' otherlv_2= '{' (otherlv_3= 'from' ( (lv_from_4_0= ruleSizeDefineDecl ) ) )? (otherlv_5= 'to' ( (lv_to_6_0= ruleSizeDefineDecl ) ) )? otherlv_7= '}' )
            {
            // InternalMySpectra.g:6209:2: ( () otherlv_1= 'Subrange' otherlv_2= '{' (otherlv_3= 'from' ( (lv_from_4_0= ruleSizeDefineDecl ) ) )? (otherlv_5= 'to' ( (lv_to_6_0= ruleSizeDefineDecl ) ) )? otherlv_7= '}' )
            // InternalMySpectra.g:6210:3: () otherlv_1= 'Subrange' otherlv_2= '{' (otherlv_3= 'from' ( (lv_from_4_0= ruleSizeDefineDecl ) ) )? (otherlv_5= 'to' ( (lv_to_6_0= ruleSizeDefineDecl ) ) )? otherlv_7= '}'
            {
            // InternalMySpectra.g:6210:3: ()
            // InternalMySpectra.g:6211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubrangeAccess().getSubrangeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,118,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSubrangeAccess().getSubrangeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_114); 

            			newLeafNode(otherlv_2, grammarAccess.getSubrangeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:6225:3: (otherlv_3= 'from' ( (lv_from_4_0= ruleSizeDefineDecl ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==95) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalMySpectra.g:6226:4: otherlv_3= 'from' ( (lv_from_4_0= ruleSizeDefineDecl ) )
                    {
                    otherlv_3=(Token)match(input,95,FOLLOW_105); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubrangeAccess().getFromKeyword_3_0());
                    			
                    // InternalMySpectra.g:6230:4: ( (lv_from_4_0= ruleSizeDefineDecl ) )
                    // InternalMySpectra.g:6231:5: (lv_from_4_0= ruleSizeDefineDecl )
                    {
                    // InternalMySpectra.g:6231:5: (lv_from_4_0= ruleSizeDefineDecl )
                    // InternalMySpectra.g:6232:6: lv_from_4_0= ruleSizeDefineDecl
                    {

                    						newCompositeNode(grammarAccess.getSubrangeAccess().getFromSizeDefineDeclParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_115);
                    lv_from_4_0=ruleSizeDefineDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrangeRule());
                    						}
                    						set(
                    							current,
                    							"from",
                    							lv_from_4_0,
                    							"org.xtext.example.myspectra.MySpectra.SizeDefineDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6250:3: (otherlv_5= 'to' ( (lv_to_6_0= ruleSizeDefineDecl ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==96) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalMySpectra.g:6251:4: otherlv_5= 'to' ( (lv_to_6_0= ruleSizeDefineDecl ) )
                    {
                    otherlv_5=(Token)match(input,96,FOLLOW_105); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubrangeAccess().getToKeyword_4_0());
                    			
                    // InternalMySpectra.g:6255:4: ( (lv_to_6_0= ruleSizeDefineDecl ) )
                    // InternalMySpectra.g:6256:5: (lv_to_6_0= ruleSizeDefineDecl )
                    {
                    // InternalMySpectra.g:6256:5: (lv_to_6_0= ruleSizeDefineDecl )
                    // InternalMySpectra.g:6257:6: lv_to_6_0= ruleSizeDefineDecl
                    {

                    						newCompositeNode(grammarAccess.getSubrangeAccess().getToSizeDefineDeclParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_to_6_0=ruleSizeDefineDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrangeRule());
                    						}
                    						set(
                    							current,
                    							"to",
                    							lv_to_6_0,
                    							"org.xtext.example.myspectra.MySpectra.SizeDefineDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSubrangeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubrange"


    // $ANTLR start "entryRuleSizeDefineDecl"
    // InternalMySpectra.g:6283:1: entryRuleSizeDefineDecl returns [EObject current=null] : iv_ruleSizeDefineDecl= ruleSizeDefineDecl EOF ;
    public final EObject entryRuleSizeDefineDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeDefineDecl = null;


        try {
            // InternalMySpectra.g:6283:55: (iv_ruleSizeDefineDecl= ruleSizeDefineDecl EOF )
            // InternalMySpectra.g:6284:2: iv_ruleSizeDefineDecl= ruleSizeDefineDecl EOF
            {
             newCompositeNode(grammarAccess.getSizeDefineDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSizeDefineDecl=ruleSizeDefineDecl();

            state._fsp--;

             current =iv_ruleSizeDefineDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSizeDefineDecl"


    // $ANTLR start "ruleSizeDefineDecl"
    // InternalMySpectra.g:6290:1: ruleSizeDefineDecl returns [EObject current=null] : ( () otherlv_1= 'SizeDefineDecl' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'name' ( ( ruleEString ) ) )? (otherlv_7= 'arithExp' ( (lv_arithExp_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleSizeDefineDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_arithExp_8_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:6296:2: ( ( () otherlv_1= 'SizeDefineDecl' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'name' ( ( ruleEString ) ) )? (otherlv_7= 'arithExp' ( (lv_arithExp_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' ) )
            // InternalMySpectra.g:6297:2: ( () otherlv_1= 'SizeDefineDecl' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'name' ( ( ruleEString ) ) )? (otherlv_7= 'arithExp' ( (lv_arithExp_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' )
            {
            // InternalMySpectra.g:6297:2: ( () otherlv_1= 'SizeDefineDecl' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'name' ( ( ruleEString ) ) )? (otherlv_7= 'arithExp' ( (lv_arithExp_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}' )
            // InternalMySpectra.g:6298:3: () otherlv_1= 'SizeDefineDecl' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'name' ( ( ruleEString ) ) )? (otherlv_7= 'arithExp' ( (lv_arithExp_8_0= ruleTemporalExpression ) ) )? otherlv_9= '}'
            {
            // InternalMySpectra.g:6298:3: ()
            // InternalMySpectra.g:6299:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSizeDefineDeclAccess().getSizeDefineDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,119,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeDefineDeclAccess().getSizeDefineDeclKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_116); 

            			newLeafNode(otherlv_2, grammarAccess.getSizeDefineDeclAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:6313:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==22) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalMySpectra.g:6314:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getSizeDefineDeclAccess().getValueKeyword_3_0());
                    			
                    // InternalMySpectra.g:6318:4: ( (lv_value_4_0= ruleEInt ) )
                    // InternalMySpectra.g:6319:5: (lv_value_4_0= ruleEInt )
                    {
                    // InternalMySpectra.g:6319:5: (lv_value_4_0= ruleEInt )
                    // InternalMySpectra.g:6320:6: lv_value_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSizeDefineDeclAccess().getValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_117);
                    lv_value_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSizeDefineDeclRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.myspectra.MySpectra.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6338:3: (otherlv_5= 'name' ( ( ruleEString ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==120) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalMySpectra.g:6339:4: otherlv_5= 'name' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,120,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSizeDefineDeclAccess().getNameKeyword_4_0());
                    			
                    // InternalMySpectra.g:6343:4: ( ( ruleEString ) )
                    // InternalMySpectra.g:6344:5: ( ruleEString )
                    {
                    // InternalMySpectra.g:6344:5: ( ruleEString )
                    // InternalMySpectra.g:6345:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSizeDefineDeclRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSizeDefineDeclAccess().getNameDefineDeclCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_118);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6360:3: (otherlv_7= 'arithExp' ( (lv_arithExp_8_0= ruleTemporalExpression ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==121) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalMySpectra.g:6361:4: otherlv_7= 'arithExp' ( (lv_arithExp_8_0= ruleTemporalExpression ) )
                    {
                    otherlv_7=(Token)match(input,121,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getSizeDefineDeclAccess().getArithExpKeyword_5_0());
                    			
                    // InternalMySpectra.g:6365:4: ( (lv_arithExp_8_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:6366:5: (lv_arithExp_8_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:6366:5: (lv_arithExp_8_0= ruleTemporalExpression )
                    // InternalMySpectra.g:6367:6: lv_arithExp_8_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getSizeDefineDeclAccess().getArithExpTemporalExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_arithExp_8_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSizeDefineDeclRule());
                    						}
                    						set(
                    							current,
                    							"arithExp",
                    							lv_arithExp_8_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSizeDefineDeclAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSizeDefineDecl"


    // $ANTLR start "entryRuleDefineArray"
    // InternalMySpectra.g:6393:1: entryRuleDefineArray returns [EObject current=null] : iv_ruleDefineArray= ruleDefineArray EOF ;
    public final EObject entryRuleDefineArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineArray = null;


        try {
            // InternalMySpectra.g:6393:52: (iv_ruleDefineArray= ruleDefineArray EOF )
            // InternalMySpectra.g:6394:2: iv_ruleDefineArray= ruleDefineArray EOF
            {
             newCompositeNode(grammarAccess.getDefineArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefineArray=ruleDefineArray();

            state._fsp--;

             current =iv_ruleDefineArray; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefineArray"


    // $ANTLR start "ruleDefineArray"
    // InternalMySpectra.g:6400:1: ruleDefineArray returns [EObject current=null] : ( () otherlv_1= 'DefineArray' otherlv_2= '{' (otherlv_3= 'simpleExprs' otherlv_4= '{' ( (lv_simpleExprs_5_0= ruleTemporalExpression ) ) (otherlv_6= ',' ( (lv_simpleExprs_7_0= ruleTemporalExpression ) ) )* otherlv_8= '}' )? (otherlv_9= 'innerArrays' otherlv_10= '{' ( (lv_innerArrays_11_0= ruleDefineArray ) ) (otherlv_12= ',' ( (lv_innerArrays_13_0= ruleDefineArray ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleDefineArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_simpleExprs_5_0 = null;

        EObject lv_simpleExprs_7_0 = null;

        EObject lv_innerArrays_11_0 = null;

        EObject lv_innerArrays_13_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:6406:2: ( ( () otherlv_1= 'DefineArray' otherlv_2= '{' (otherlv_3= 'simpleExprs' otherlv_4= '{' ( (lv_simpleExprs_5_0= ruleTemporalExpression ) ) (otherlv_6= ',' ( (lv_simpleExprs_7_0= ruleTemporalExpression ) ) )* otherlv_8= '}' )? (otherlv_9= 'innerArrays' otherlv_10= '{' ( (lv_innerArrays_11_0= ruleDefineArray ) ) (otherlv_12= ',' ( (lv_innerArrays_13_0= ruleDefineArray ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMySpectra.g:6407:2: ( () otherlv_1= 'DefineArray' otherlv_2= '{' (otherlv_3= 'simpleExprs' otherlv_4= '{' ( (lv_simpleExprs_5_0= ruleTemporalExpression ) ) (otherlv_6= ',' ( (lv_simpleExprs_7_0= ruleTemporalExpression ) ) )* otherlv_8= '}' )? (otherlv_9= 'innerArrays' otherlv_10= '{' ( (lv_innerArrays_11_0= ruleDefineArray ) ) (otherlv_12= ',' ( (lv_innerArrays_13_0= ruleDefineArray ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMySpectra.g:6407:2: ( () otherlv_1= 'DefineArray' otherlv_2= '{' (otherlv_3= 'simpleExprs' otherlv_4= '{' ( (lv_simpleExprs_5_0= ruleTemporalExpression ) ) (otherlv_6= ',' ( (lv_simpleExprs_7_0= ruleTemporalExpression ) ) )* otherlv_8= '}' )? (otherlv_9= 'innerArrays' otherlv_10= '{' ( (lv_innerArrays_11_0= ruleDefineArray ) ) (otherlv_12= ',' ( (lv_innerArrays_13_0= ruleDefineArray ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMySpectra.g:6408:3: () otherlv_1= 'DefineArray' otherlv_2= '{' (otherlv_3= 'simpleExprs' otherlv_4= '{' ( (lv_simpleExprs_5_0= ruleTemporalExpression ) ) (otherlv_6= ',' ( (lv_simpleExprs_7_0= ruleTemporalExpression ) ) )* otherlv_8= '}' )? (otherlv_9= 'innerArrays' otherlv_10= '{' ( (lv_innerArrays_11_0= ruleDefineArray ) ) (otherlv_12= ',' ( (lv_innerArrays_13_0= ruleDefineArray ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalMySpectra.g:6408:3: ()
            // InternalMySpectra.g:6409:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefineArrayAccess().getDefineArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,122,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineArrayAccess().getDefineArrayKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_119); 

            			newLeafNode(otherlv_2, grammarAccess.getDefineArrayAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:6423:3: (otherlv_3= 'simpleExprs' otherlv_4= '{' ( (lv_simpleExprs_5_0= ruleTemporalExpression ) ) (otherlv_6= ',' ( (lv_simpleExprs_7_0= ruleTemporalExpression ) ) )* otherlv_8= '}' )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==123) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalMySpectra.g:6424:4: otherlv_3= 'simpleExprs' otherlv_4= '{' ( (lv_simpleExprs_5_0= ruleTemporalExpression ) ) (otherlv_6= ',' ( (lv_simpleExprs_7_0= ruleTemporalExpression ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,123,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getDefineArrayAccess().getSimpleExprsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefineArrayAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMySpectra.g:6432:4: ( (lv_simpleExprs_5_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:6433:5: (lv_simpleExprs_5_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:6433:5: (lv_simpleExprs_5_0= ruleTemporalExpression )
                    // InternalMySpectra.g:6434:6: lv_simpleExprs_5_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getDefineArrayAccess().getSimpleExprsTemporalExpressionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_simpleExprs_5_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineArrayRule());
                    						}
                    						add(
                    							current,
                    							"simpleExprs",
                    							lv_simpleExprs_5_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:6451:4: (otherlv_6= ',' ( (lv_simpleExprs_7_0= ruleTemporalExpression ) ) )*
                    loop154:
                    do {
                        int alt154=2;
                        int LA154_0 = input.LA(1);

                        if ( (LA154_0==14) ) {
                            alt154=1;
                        }


                        switch (alt154) {
                    	case 1 :
                    	    // InternalMySpectra.g:6452:5: otherlv_6= ',' ( (lv_simpleExprs_7_0= ruleTemporalExpression ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDefineArrayAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMySpectra.g:6456:5: ( (lv_simpleExprs_7_0= ruleTemporalExpression ) )
                    	    // InternalMySpectra.g:6457:6: (lv_simpleExprs_7_0= ruleTemporalExpression )
                    	    {
                    	    // InternalMySpectra.g:6457:6: (lv_simpleExprs_7_0= ruleTemporalExpression )
                    	    // InternalMySpectra.g:6458:7: lv_simpleExprs_7_0= ruleTemporalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getDefineArrayAccess().getSimpleExprsTemporalExpressionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_simpleExprs_7_0=ruleTemporalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDefineArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"simpleExprs",
                    	    								lv_simpleExprs_7_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop154;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_120); 

                    				newLeafNode(otherlv_8, grammarAccess.getDefineArrayAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMySpectra.g:6481:3: (otherlv_9= 'innerArrays' otherlv_10= '{' ( (lv_innerArrays_11_0= ruleDefineArray ) ) (otherlv_12= ',' ( (lv_innerArrays_13_0= ruleDefineArray ) ) )* otherlv_14= '}' )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==124) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalMySpectra.g:6482:4: otherlv_9= 'innerArrays' otherlv_10= '{' ( (lv_innerArrays_11_0= ruleDefineArray ) ) (otherlv_12= ',' ( (lv_innerArrays_13_0= ruleDefineArray ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,124,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getDefineArrayAccess().getInnerArraysKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_107); 

                    				newLeafNode(otherlv_10, grammarAccess.getDefineArrayAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMySpectra.g:6490:4: ( (lv_innerArrays_11_0= ruleDefineArray ) )
                    // InternalMySpectra.g:6491:5: (lv_innerArrays_11_0= ruleDefineArray )
                    {
                    // InternalMySpectra.g:6491:5: (lv_innerArrays_11_0= ruleDefineArray )
                    // InternalMySpectra.g:6492:6: lv_innerArrays_11_0= ruleDefineArray
                    {

                    						newCompositeNode(grammarAccess.getDefineArrayAccess().getInnerArraysDefineArrayParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_innerArrays_11_0=ruleDefineArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineArrayRule());
                    						}
                    						add(
                    							current,
                    							"innerArrays",
                    							lv_innerArrays_11_0,
                    							"org.xtext.example.myspectra.MySpectra.DefineArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:6509:4: (otherlv_12= ',' ( (lv_innerArrays_13_0= ruleDefineArray ) ) )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==14) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // InternalMySpectra.g:6510:5: otherlv_12= ',' ( (lv_innerArrays_13_0= ruleDefineArray ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_107); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDefineArrayAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMySpectra.g:6514:5: ( (lv_innerArrays_13_0= ruleDefineArray ) )
                    	    // InternalMySpectra.g:6515:6: (lv_innerArrays_13_0= ruleDefineArray )
                    	    {
                    	    // InternalMySpectra.g:6515:6: (lv_innerArrays_13_0= ruleDefineArray )
                    	    // InternalMySpectra.g:6516:7: lv_innerArrays_13_0= ruleDefineArray
                    	    {

                    	    							newCompositeNode(grammarAccess.getDefineArrayAccess().getInnerArraysDefineArrayParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_innerArrays_13_0=ruleDefineArray();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDefineArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"innerArrays",
                    	    								lv_innerArrays_13_0,
                    	    								"org.xtext.example.myspectra.MySpectra.DefineArray");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop156;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getDefineArrayAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getDefineArrayAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefineArray"


    // $ANTLR start "entryRuleBooleanTerm"
    // InternalMySpectra.g:6547:1: entryRuleBooleanTerm returns [EObject current=null] : iv_ruleBooleanTerm= ruleBooleanTerm EOF ;
    public final EObject entryRuleBooleanTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanTerm = null;


        try {
            // InternalMySpectra.g:6547:52: (iv_ruleBooleanTerm= ruleBooleanTerm EOF )
            // InternalMySpectra.g:6548:2: iv_ruleBooleanTerm= ruleBooleanTerm EOF
            {
             newCompositeNode(grammarAccess.getBooleanTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanTerm=ruleBooleanTerm();

            state._fsp--;

             current =iv_ruleBooleanTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanTerm"


    // $ANTLR start "ruleBooleanTerm"
    // InternalMySpectra.g:6554:1: ruleBooleanTerm returns [EObject current=null] : ( () otherlv_1= 'BooleanTerm' otherlv_2= '{' (otherlv_3= 'relExpr' ( (lv_relExpr_4_0= ruleTemporalExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleBooleanTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_relExpr_4_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:6560:2: ( ( () otherlv_1= 'BooleanTerm' otherlv_2= '{' (otherlv_3= 'relExpr' ( (lv_relExpr_4_0= ruleTemporalExpression ) ) )? otherlv_5= '}' ) )
            // InternalMySpectra.g:6561:2: ( () otherlv_1= 'BooleanTerm' otherlv_2= '{' (otherlv_3= 'relExpr' ( (lv_relExpr_4_0= ruleTemporalExpression ) ) )? otherlv_5= '}' )
            {
            // InternalMySpectra.g:6561:2: ( () otherlv_1= 'BooleanTerm' otherlv_2= '{' (otherlv_3= 'relExpr' ( (lv_relExpr_4_0= ruleTemporalExpression ) ) )? otherlv_5= '}' )
            // InternalMySpectra.g:6562:3: () otherlv_1= 'BooleanTerm' otherlv_2= '{' (otherlv_3= 'relExpr' ( (lv_relExpr_4_0= ruleTemporalExpression ) ) )? otherlv_5= '}'
            {
            // InternalMySpectra.g:6562:3: ()
            // InternalMySpectra.g:6563:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTermAccess().getBooleanTermAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,125,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanTermAccess().getBooleanTermKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_121); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanTermAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:6577:3: (otherlv_3= 'relExpr' ( (lv_relExpr_4_0= ruleTemporalExpression ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==126) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalMySpectra.g:6578:4: otherlv_3= 'relExpr' ( (lv_relExpr_4_0= ruleTemporalExpression ) )
                    {
                    otherlv_3=(Token)match(input,126,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanTermAccess().getRelExprKeyword_3_0());
                    			
                    // InternalMySpectra.g:6582:4: ( (lv_relExpr_4_0= ruleTemporalExpression ) )
                    // InternalMySpectra.g:6583:5: (lv_relExpr_4_0= ruleTemporalExpression )
                    {
                    // InternalMySpectra.g:6583:5: (lv_relExpr_4_0= ruleTemporalExpression )
                    // InternalMySpectra.g:6584:6: lv_relExpr_4_0= ruleTemporalExpression
                    {

                    						newCompositeNode(grammarAccess.getBooleanTermAccess().getRelExprTemporalExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_relExpr_4_0=ruleTemporalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanTermRule());
                    						}
                    						set(
                    							current,
                    							"relExpr",
                    							lv_relExpr_4_0,
                    							"org.xtext.example.myspectra.MySpectra.TemporalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBooleanTermAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanTerm"


    // $ANTLR start "entryRuleBinaryRegExp"
    // InternalMySpectra.g:6610:1: entryRuleBinaryRegExp returns [EObject current=null] : iv_ruleBinaryRegExp= ruleBinaryRegExp EOF ;
    public final EObject entryRuleBinaryRegExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryRegExp = null;


        try {
            // InternalMySpectra.g:6610:53: (iv_ruleBinaryRegExp= ruleBinaryRegExp EOF )
            // InternalMySpectra.g:6611:2: iv_ruleBinaryRegExp= ruleBinaryRegExp EOF
            {
             newCompositeNode(grammarAccess.getBinaryRegExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryRegExp=ruleBinaryRegExp();

            state._fsp--;

             current =iv_ruleBinaryRegExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryRegExp"


    // $ANTLR start "ruleBinaryRegExp"
    // InternalMySpectra.g:6617:1: ruleBinaryRegExp returns [EObject current=null] : ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'BinaryRegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'op' ( (lv_op_7_0= ruleEString ) ) )? (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )? (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )? (otherlv_12= 'right' ( (lv_right_13_0= ruleRegExp ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleBinaryRegExp() throws RecognitionException {
        EObject current = null;

        Token lv_empty_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_val_5_0 = null;

        AntlrDatatypeRuleToken lv_op_7_0 = null;

        EObject lv_assrt_9_0 = null;

        EObject lv_left_11_0 = null;

        EObject lv_right_13_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:6623:2: ( ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'BinaryRegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'op' ( (lv_op_7_0= ruleEString ) ) )? (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )? (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )? (otherlv_12= 'right' ( (lv_right_13_0= ruleRegExp ) ) )? otherlv_14= '}' ) )
            // InternalMySpectra.g:6624:2: ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'BinaryRegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'op' ( (lv_op_7_0= ruleEString ) ) )? (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )? (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )? (otherlv_12= 'right' ( (lv_right_13_0= ruleRegExp ) ) )? otherlv_14= '}' )
            {
            // InternalMySpectra.g:6624:2: ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'BinaryRegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'op' ( (lv_op_7_0= ruleEString ) ) )? (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )? (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )? (otherlv_12= 'right' ( (lv_right_13_0= ruleRegExp ) ) )? otherlv_14= '}' )
            // InternalMySpectra.g:6625:3: () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'BinaryRegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'op' ( (lv_op_7_0= ruleEString ) ) )? (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )? (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )? (otherlv_12= 'right' ( (lv_right_13_0= ruleRegExp ) ) )? otherlv_14= '}'
            {
            // InternalMySpectra.g:6625:3: ()
            // InternalMySpectra.g:6626:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBinaryRegExpAccess().getBinaryRegExpAction_0(),
            					current);
            			

            }

            // InternalMySpectra.g:6632:3: ( (lv_empty_1_0= 'empty' ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==101) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalMySpectra.g:6633:4: (lv_empty_1_0= 'empty' )
                    {
                    // InternalMySpectra.g:6633:4: (lv_empty_1_0= 'empty' )
                    // InternalMySpectra.g:6634:5: lv_empty_1_0= 'empty'
                    {
                    lv_empty_1_0=(Token)match(input,101,FOLLOW_122); 

                    					newLeafNode(lv_empty_1_0, grammarAccess.getBinaryRegExpAccess().getEmptyEmptyKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinaryRegExpRule());
                    					}
                    					setWithLastConsumed(current, "empty", lv_empty_1_0 != null, "empty");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,127,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBinaryRegExpAccess().getBinaryRegExpKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_123); 

            			newLeafNode(otherlv_3, grammarAccess.getBinaryRegExpAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:6654:3: (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==103) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalMySpectra.g:6655:4: otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,103,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBinaryRegExpAccess().getValKeyword_4_0());
                    			
                    // InternalMySpectra.g:6659:4: ( (lv_val_5_0= ruleEString ) )
                    // InternalMySpectra.g:6660:5: (lv_val_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:6660:5: (lv_val_5_0= ruleEString )
                    // InternalMySpectra.g:6661:6: lv_val_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBinaryRegExpAccess().getValEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    lv_val_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6679:3: (otherlv_6= 'op' ( (lv_op_7_0= ruleEString ) ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==128) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalMySpectra.g:6680:4: otherlv_6= 'op' ( (lv_op_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,128,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getBinaryRegExpAccess().getOpKeyword_5_0());
                    			
                    // InternalMySpectra.g:6684:4: ( (lv_op_7_0= ruleEString ) )
                    // InternalMySpectra.g:6685:5: (lv_op_7_0= ruleEString )
                    {
                    // InternalMySpectra.g:6685:5: (lv_op_7_0= ruleEString )
                    // InternalMySpectra.g:6686:6: lv_op_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBinaryRegExpAccess().getOpEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_125);
                    lv_op_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_7_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6704:3: (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==104) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalMySpectra.g:6705:4: otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) )
                    {
                    otherlv_8=(Token)match(input,104,FOLLOW_100); 

                    				newLeafNode(otherlv_8, grammarAccess.getBinaryRegExpAccess().getAssrtKeyword_6_0());
                    			
                    // InternalMySpectra.g:6709:4: ( (lv_assrt_9_0= ruleBooleanTerm ) )
                    // InternalMySpectra.g:6710:5: (lv_assrt_9_0= ruleBooleanTerm )
                    {
                    // InternalMySpectra.g:6710:5: (lv_assrt_9_0= ruleBooleanTerm )
                    // InternalMySpectra.g:6711:6: lv_assrt_9_0= ruleBooleanTerm
                    {

                    						newCompositeNode(grammarAccess.getBinaryRegExpAccess().getAssrtBooleanTermParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_assrt_9_0=ruleBooleanTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"assrt",
                    							lv_assrt_9_0,
                    							"org.xtext.example.myspectra.MySpectra.BooleanTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6729:3: (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==62) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalMySpectra.g:6730:4: otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) )
                    {
                    otherlv_10=(Token)match(input,62,FOLLOW_60); 

                    				newLeafNode(otherlv_10, grammarAccess.getBinaryRegExpAccess().getLeftKeyword_7_0());
                    			
                    // InternalMySpectra.g:6734:4: ( (lv_left_11_0= ruleRegExp ) )
                    // InternalMySpectra.g:6735:5: (lv_left_11_0= ruleRegExp )
                    {
                    // InternalMySpectra.g:6735:5: (lv_left_11_0= ruleRegExp )
                    // InternalMySpectra.g:6736:6: lv_left_11_0= ruleRegExp
                    {

                    						newCompositeNode(grammarAccess.getBinaryRegExpAccess().getLeftRegExpParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_left_11_0=ruleRegExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_11_0,
                    							"org.xtext.example.myspectra.MySpectra.RegExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6754:3: (otherlv_12= 'right' ( (lv_right_13_0= ruleRegExp ) ) )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==70) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalMySpectra.g:6755:4: otherlv_12= 'right' ( (lv_right_13_0= ruleRegExp ) )
                    {
                    otherlv_12=(Token)match(input,70,FOLLOW_60); 

                    				newLeafNode(otherlv_12, grammarAccess.getBinaryRegExpAccess().getRightKeyword_8_0());
                    			
                    // InternalMySpectra.g:6759:4: ( (lv_right_13_0= ruleRegExp ) )
                    // InternalMySpectra.g:6760:5: (lv_right_13_0= ruleRegExp )
                    {
                    // InternalMySpectra.g:6760:5: (lv_right_13_0= ruleRegExp )
                    // InternalMySpectra.g:6761:6: lv_right_13_0= ruleRegExp
                    {

                    						newCompositeNode(grammarAccess.getBinaryRegExpAccess().getRightRegExpParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_right_13_0=ruleRegExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_13_0,
                    							"org.xtext.example.myspectra.MySpectra.RegExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getBinaryRegExpAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryRegExp"


    // $ANTLR start "entryRuleUnaryRegExp"
    // InternalMySpectra.g:6787:1: entryRuleUnaryRegExp returns [EObject current=null] : iv_ruleUnaryRegExp= ruleUnaryRegExp EOF ;
    public final EObject entryRuleUnaryRegExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryRegExp = null;


        try {
            // InternalMySpectra.g:6787:52: (iv_ruleUnaryRegExp= ruleUnaryRegExp EOF )
            // InternalMySpectra.g:6788:2: iv_ruleUnaryRegExp= ruleUnaryRegExp EOF
            {
             newCompositeNode(grammarAccess.getUnaryRegExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryRegExp=ruleUnaryRegExp();

            state._fsp--;

             current =iv_ruleUnaryRegExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryRegExp"


    // $ANTLR start "ruleUnaryRegExp"
    // InternalMySpectra.g:6794:1: ruleUnaryRegExp returns [EObject current=null] : ( () ( (lv_empty_1_0= 'empty' ) )? ( (lv_kleened_2_0= 'kleened' ) )? ( (lv_questionMark_3_0= 'questionMark' ) )? ( (lv_plus_4_0= 'plus' ) )? ( (lv_haveExactRepetition_5_0= 'haveExactRepetition' ) )? ( (lv_haveAtLeast_6_0= 'haveAtLeast' ) )? ( (lv_haveRange_7_0= 'haveRange' ) )? otherlv_8= 'UnaryRegExp' otherlv_9= '{' (otherlv_10= 'val' ( (lv_val_11_0= ruleEString ) ) )? (otherlv_12= 'exactRepetition' ( (lv_exactRepetition_13_0= ruleEInt ) ) )? (otherlv_14= 'atLeast' ( (lv_atLeast_15_0= ruleEInt ) ) )? (otherlv_16= 'from' ( (lv_from_17_0= ruleEInt ) ) )? (otherlv_18= 'to' ( (lv_to_19_0= ruleEInt ) ) )? (otherlv_20= 'fromDefine' ( ( ruleEString ) ) )? (otherlv_22= 'toDefine' ( ( ruleEString ) ) )? (otherlv_24= 'assrt' ( (lv_assrt_25_0= ruleBooleanTerm ) ) )? (otherlv_26= 'left' ( (lv_left_27_0= ruleRegExp ) ) )? otherlv_28= '}' ) ;
    public final EObject ruleUnaryRegExp() throws RecognitionException {
        EObject current = null;

        Token lv_empty_1_0=null;
        Token lv_kleened_2_0=null;
        Token lv_questionMark_3_0=null;
        Token lv_plus_4_0=null;
        Token lv_haveExactRepetition_5_0=null;
        Token lv_haveAtLeast_6_0=null;
        Token lv_haveRange_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_val_11_0 = null;

        AntlrDatatypeRuleToken lv_exactRepetition_13_0 = null;

        AntlrDatatypeRuleToken lv_atLeast_15_0 = null;

        AntlrDatatypeRuleToken lv_from_17_0 = null;

        AntlrDatatypeRuleToken lv_to_19_0 = null;

        EObject lv_assrt_25_0 = null;

        EObject lv_left_27_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:6800:2: ( ( () ( (lv_empty_1_0= 'empty' ) )? ( (lv_kleened_2_0= 'kleened' ) )? ( (lv_questionMark_3_0= 'questionMark' ) )? ( (lv_plus_4_0= 'plus' ) )? ( (lv_haveExactRepetition_5_0= 'haveExactRepetition' ) )? ( (lv_haveAtLeast_6_0= 'haveAtLeast' ) )? ( (lv_haveRange_7_0= 'haveRange' ) )? otherlv_8= 'UnaryRegExp' otherlv_9= '{' (otherlv_10= 'val' ( (lv_val_11_0= ruleEString ) ) )? (otherlv_12= 'exactRepetition' ( (lv_exactRepetition_13_0= ruleEInt ) ) )? (otherlv_14= 'atLeast' ( (lv_atLeast_15_0= ruleEInt ) ) )? (otherlv_16= 'from' ( (lv_from_17_0= ruleEInt ) ) )? (otherlv_18= 'to' ( (lv_to_19_0= ruleEInt ) ) )? (otherlv_20= 'fromDefine' ( ( ruleEString ) ) )? (otherlv_22= 'toDefine' ( ( ruleEString ) ) )? (otherlv_24= 'assrt' ( (lv_assrt_25_0= ruleBooleanTerm ) ) )? (otherlv_26= 'left' ( (lv_left_27_0= ruleRegExp ) ) )? otherlv_28= '}' ) )
            // InternalMySpectra.g:6801:2: ( () ( (lv_empty_1_0= 'empty' ) )? ( (lv_kleened_2_0= 'kleened' ) )? ( (lv_questionMark_3_0= 'questionMark' ) )? ( (lv_plus_4_0= 'plus' ) )? ( (lv_haveExactRepetition_5_0= 'haveExactRepetition' ) )? ( (lv_haveAtLeast_6_0= 'haveAtLeast' ) )? ( (lv_haveRange_7_0= 'haveRange' ) )? otherlv_8= 'UnaryRegExp' otherlv_9= '{' (otherlv_10= 'val' ( (lv_val_11_0= ruleEString ) ) )? (otherlv_12= 'exactRepetition' ( (lv_exactRepetition_13_0= ruleEInt ) ) )? (otherlv_14= 'atLeast' ( (lv_atLeast_15_0= ruleEInt ) ) )? (otherlv_16= 'from' ( (lv_from_17_0= ruleEInt ) ) )? (otherlv_18= 'to' ( (lv_to_19_0= ruleEInt ) ) )? (otherlv_20= 'fromDefine' ( ( ruleEString ) ) )? (otherlv_22= 'toDefine' ( ( ruleEString ) ) )? (otherlv_24= 'assrt' ( (lv_assrt_25_0= ruleBooleanTerm ) ) )? (otherlv_26= 'left' ( (lv_left_27_0= ruleRegExp ) ) )? otherlv_28= '}' )
            {
            // InternalMySpectra.g:6801:2: ( () ( (lv_empty_1_0= 'empty' ) )? ( (lv_kleened_2_0= 'kleened' ) )? ( (lv_questionMark_3_0= 'questionMark' ) )? ( (lv_plus_4_0= 'plus' ) )? ( (lv_haveExactRepetition_5_0= 'haveExactRepetition' ) )? ( (lv_haveAtLeast_6_0= 'haveAtLeast' ) )? ( (lv_haveRange_7_0= 'haveRange' ) )? otherlv_8= 'UnaryRegExp' otherlv_9= '{' (otherlv_10= 'val' ( (lv_val_11_0= ruleEString ) ) )? (otherlv_12= 'exactRepetition' ( (lv_exactRepetition_13_0= ruleEInt ) ) )? (otherlv_14= 'atLeast' ( (lv_atLeast_15_0= ruleEInt ) ) )? (otherlv_16= 'from' ( (lv_from_17_0= ruleEInt ) ) )? (otherlv_18= 'to' ( (lv_to_19_0= ruleEInt ) ) )? (otherlv_20= 'fromDefine' ( ( ruleEString ) ) )? (otherlv_22= 'toDefine' ( ( ruleEString ) ) )? (otherlv_24= 'assrt' ( (lv_assrt_25_0= ruleBooleanTerm ) ) )? (otherlv_26= 'left' ( (lv_left_27_0= ruleRegExp ) ) )? otherlv_28= '}' )
            // InternalMySpectra.g:6802:3: () ( (lv_empty_1_0= 'empty' ) )? ( (lv_kleened_2_0= 'kleened' ) )? ( (lv_questionMark_3_0= 'questionMark' ) )? ( (lv_plus_4_0= 'plus' ) )? ( (lv_haveExactRepetition_5_0= 'haveExactRepetition' ) )? ( (lv_haveAtLeast_6_0= 'haveAtLeast' ) )? ( (lv_haveRange_7_0= 'haveRange' ) )? otherlv_8= 'UnaryRegExp' otherlv_9= '{' (otherlv_10= 'val' ( (lv_val_11_0= ruleEString ) ) )? (otherlv_12= 'exactRepetition' ( (lv_exactRepetition_13_0= ruleEInt ) ) )? (otherlv_14= 'atLeast' ( (lv_atLeast_15_0= ruleEInt ) ) )? (otherlv_16= 'from' ( (lv_from_17_0= ruleEInt ) ) )? (otherlv_18= 'to' ( (lv_to_19_0= ruleEInt ) ) )? (otherlv_20= 'fromDefine' ( ( ruleEString ) ) )? (otherlv_22= 'toDefine' ( ( ruleEString ) ) )? (otherlv_24= 'assrt' ( (lv_assrt_25_0= ruleBooleanTerm ) ) )? (otherlv_26= 'left' ( (lv_left_27_0= ruleRegExp ) ) )? otherlv_28= '}'
            {
            // InternalMySpectra.g:6802:3: ()
            // InternalMySpectra.g:6803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnaryRegExpAccess().getUnaryRegExpAction_0(),
            					current);
            			

            }

            // InternalMySpectra.g:6809:3: ( (lv_empty_1_0= 'empty' ) )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==101) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // InternalMySpectra.g:6810:4: (lv_empty_1_0= 'empty' )
                    {
                    // InternalMySpectra.g:6810:4: (lv_empty_1_0= 'empty' )
                    // InternalMySpectra.g:6811:5: lv_empty_1_0= 'empty'
                    {
                    lv_empty_1_0=(Token)match(input,101,FOLLOW_126); 

                    					newLeafNode(lv_empty_1_0, grammarAccess.getUnaryRegExpAccess().getEmptyEmptyKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnaryRegExpRule());
                    					}
                    					setWithLastConsumed(current, "empty", lv_empty_1_0 != null, "empty");
                    				

                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6823:3: ( (lv_kleened_2_0= 'kleened' ) )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==129) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalMySpectra.g:6824:4: (lv_kleened_2_0= 'kleened' )
                    {
                    // InternalMySpectra.g:6824:4: (lv_kleened_2_0= 'kleened' )
                    // InternalMySpectra.g:6825:5: lv_kleened_2_0= 'kleened'
                    {
                    lv_kleened_2_0=(Token)match(input,129,FOLLOW_127); 

                    					newLeafNode(lv_kleened_2_0, grammarAccess.getUnaryRegExpAccess().getKleenedKleenedKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnaryRegExpRule());
                    					}
                    					setWithLastConsumed(current, "kleened", lv_kleened_2_0 != null, "kleened");
                    				

                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6837:3: ( (lv_questionMark_3_0= 'questionMark' ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==130) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalMySpectra.g:6838:4: (lv_questionMark_3_0= 'questionMark' )
                    {
                    // InternalMySpectra.g:6838:4: (lv_questionMark_3_0= 'questionMark' )
                    // InternalMySpectra.g:6839:5: lv_questionMark_3_0= 'questionMark'
                    {
                    lv_questionMark_3_0=(Token)match(input,130,FOLLOW_128); 

                    					newLeafNode(lv_questionMark_3_0, grammarAccess.getUnaryRegExpAccess().getQuestionMarkQuestionMarkKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnaryRegExpRule());
                    					}
                    					setWithLastConsumed(current, "questionMark", lv_questionMark_3_0 != null, "questionMark");
                    				

                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6851:3: ( (lv_plus_4_0= 'plus' ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==131) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalMySpectra.g:6852:4: (lv_plus_4_0= 'plus' )
                    {
                    // InternalMySpectra.g:6852:4: (lv_plus_4_0= 'plus' )
                    // InternalMySpectra.g:6853:5: lv_plus_4_0= 'plus'
                    {
                    lv_plus_4_0=(Token)match(input,131,FOLLOW_129); 

                    					newLeafNode(lv_plus_4_0, grammarAccess.getUnaryRegExpAccess().getPlusPlusKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnaryRegExpRule());
                    					}
                    					setWithLastConsumed(current, "plus", lv_plus_4_0 != null, "plus");
                    				

                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6865:3: ( (lv_haveExactRepetition_5_0= 'haveExactRepetition' ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==132) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // InternalMySpectra.g:6866:4: (lv_haveExactRepetition_5_0= 'haveExactRepetition' )
                    {
                    // InternalMySpectra.g:6866:4: (lv_haveExactRepetition_5_0= 'haveExactRepetition' )
                    // InternalMySpectra.g:6867:5: lv_haveExactRepetition_5_0= 'haveExactRepetition'
                    {
                    lv_haveExactRepetition_5_0=(Token)match(input,132,FOLLOW_130); 

                    					newLeafNode(lv_haveExactRepetition_5_0, grammarAccess.getUnaryRegExpAccess().getHaveExactRepetitionHaveExactRepetitionKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnaryRegExpRule());
                    					}
                    					setWithLastConsumed(current, "haveExactRepetition", lv_haveExactRepetition_5_0 != null, "haveExactRepetition");
                    				

                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6879:3: ( (lv_haveAtLeast_6_0= 'haveAtLeast' ) )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==133) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // InternalMySpectra.g:6880:4: (lv_haveAtLeast_6_0= 'haveAtLeast' )
                    {
                    // InternalMySpectra.g:6880:4: (lv_haveAtLeast_6_0= 'haveAtLeast' )
                    // InternalMySpectra.g:6881:5: lv_haveAtLeast_6_0= 'haveAtLeast'
                    {
                    lv_haveAtLeast_6_0=(Token)match(input,133,FOLLOW_131); 

                    					newLeafNode(lv_haveAtLeast_6_0, grammarAccess.getUnaryRegExpAccess().getHaveAtLeastHaveAtLeastKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnaryRegExpRule());
                    					}
                    					setWithLastConsumed(current, "haveAtLeast", lv_haveAtLeast_6_0 != null, "haveAtLeast");
                    				

                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6893:3: ( (lv_haveRange_7_0= 'haveRange' ) )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==134) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // InternalMySpectra.g:6894:4: (lv_haveRange_7_0= 'haveRange' )
                    {
                    // InternalMySpectra.g:6894:4: (lv_haveRange_7_0= 'haveRange' )
                    // InternalMySpectra.g:6895:5: lv_haveRange_7_0= 'haveRange'
                    {
                    lv_haveRange_7_0=(Token)match(input,134,FOLLOW_132); 

                    					newLeafNode(lv_haveRange_7_0, grammarAccess.getUnaryRegExpAccess().getHaveRangeHaveRangeKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnaryRegExpRule());
                    					}
                    					setWithLastConsumed(current, "haveRange", lv_haveRange_7_0 != null, "haveRange");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,135,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getUnaryRegExpAccess().getUnaryRegExpKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_133); 

            			newLeafNode(otherlv_9, grammarAccess.getUnaryRegExpAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMySpectra.g:6915:3: (otherlv_10= 'val' ( (lv_val_11_0= ruleEString ) ) )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==103) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalMySpectra.g:6916:4: otherlv_10= 'val' ( (lv_val_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,103,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getUnaryRegExpAccess().getValKeyword_10_0());
                    			
                    // InternalMySpectra.g:6920:4: ( (lv_val_11_0= ruleEString ) )
                    // InternalMySpectra.g:6921:5: (lv_val_11_0= ruleEString )
                    {
                    // InternalMySpectra.g:6921:5: (lv_val_11_0= ruleEString )
                    // InternalMySpectra.g:6922:6: lv_val_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUnaryRegExpAccess().getValEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_134);
                    lv_val_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_11_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6940:3: (otherlv_12= 'exactRepetition' ( (lv_exactRepetition_13_0= ruleEInt ) ) )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==136) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalMySpectra.g:6941:4: otherlv_12= 'exactRepetition' ( (lv_exactRepetition_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,136,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getUnaryRegExpAccess().getExactRepetitionKeyword_11_0());
                    			
                    // InternalMySpectra.g:6945:4: ( (lv_exactRepetition_13_0= ruleEInt ) )
                    // InternalMySpectra.g:6946:5: (lv_exactRepetition_13_0= ruleEInt )
                    {
                    // InternalMySpectra.g:6946:5: (lv_exactRepetition_13_0= ruleEInt )
                    // InternalMySpectra.g:6947:6: lv_exactRepetition_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUnaryRegExpAccess().getExactRepetitionEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_135);
                    lv_exactRepetition_13_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"exactRepetition",
                    							lv_exactRepetition_13_0,
                    							"org.xtext.example.myspectra.MySpectra.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6965:3: (otherlv_14= 'atLeast' ( (lv_atLeast_15_0= ruleEInt ) ) )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==137) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // InternalMySpectra.g:6966:4: otherlv_14= 'atLeast' ( (lv_atLeast_15_0= ruleEInt ) )
                    {
                    otherlv_14=(Token)match(input,137,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getUnaryRegExpAccess().getAtLeastKeyword_12_0());
                    			
                    // InternalMySpectra.g:6970:4: ( (lv_atLeast_15_0= ruleEInt ) )
                    // InternalMySpectra.g:6971:5: (lv_atLeast_15_0= ruleEInt )
                    {
                    // InternalMySpectra.g:6971:5: (lv_atLeast_15_0= ruleEInt )
                    // InternalMySpectra.g:6972:6: lv_atLeast_15_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUnaryRegExpAccess().getAtLeastEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_136);
                    lv_atLeast_15_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"atLeast",
                    							lv_atLeast_15_0,
                    							"org.xtext.example.myspectra.MySpectra.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:6990:3: (otherlv_16= 'from' ( (lv_from_17_0= ruleEInt ) ) )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==95) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // InternalMySpectra.g:6991:4: otherlv_16= 'from' ( (lv_from_17_0= ruleEInt ) )
                    {
                    otherlv_16=(Token)match(input,95,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getUnaryRegExpAccess().getFromKeyword_13_0());
                    			
                    // InternalMySpectra.g:6995:4: ( (lv_from_17_0= ruleEInt ) )
                    // InternalMySpectra.g:6996:5: (lv_from_17_0= ruleEInt )
                    {
                    // InternalMySpectra.g:6996:5: (lv_from_17_0= ruleEInt )
                    // InternalMySpectra.g:6997:6: lv_from_17_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUnaryRegExpAccess().getFromEIntParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_137);
                    lv_from_17_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"from",
                    							lv_from_17_0,
                    							"org.xtext.example.myspectra.MySpectra.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:7015:3: (otherlv_18= 'to' ( (lv_to_19_0= ruleEInt ) ) )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==96) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // InternalMySpectra.g:7016:4: otherlv_18= 'to' ( (lv_to_19_0= ruleEInt ) )
                    {
                    otherlv_18=(Token)match(input,96,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getUnaryRegExpAccess().getToKeyword_14_0());
                    			
                    // InternalMySpectra.g:7020:4: ( (lv_to_19_0= ruleEInt ) )
                    // InternalMySpectra.g:7021:5: (lv_to_19_0= ruleEInt )
                    {
                    // InternalMySpectra.g:7021:5: (lv_to_19_0= ruleEInt )
                    // InternalMySpectra.g:7022:6: lv_to_19_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUnaryRegExpAccess().getToEIntParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_138);
                    lv_to_19_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"to",
                    							lv_to_19_0,
                    							"org.xtext.example.myspectra.MySpectra.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:7040:3: (otherlv_20= 'fromDefine' ( ( ruleEString ) ) )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==138) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // InternalMySpectra.g:7041:4: otherlv_20= 'fromDefine' ( ( ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,138,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getUnaryRegExpAccess().getFromDefineKeyword_15_0());
                    			
                    // InternalMySpectra.g:7045:4: ( ( ruleEString ) )
                    // InternalMySpectra.g:7046:5: ( ruleEString )
                    {
                    // InternalMySpectra.g:7046:5: ( ruleEString )
                    // InternalMySpectra.g:7047:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryRegExpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnaryRegExpAccess().getFromDefineDefineDeclCrossReference_15_1_0());
                    					
                    pushFollow(FOLLOW_139);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:7062:3: (otherlv_22= 'toDefine' ( ( ruleEString ) ) )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==139) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // InternalMySpectra.g:7063:4: otherlv_22= 'toDefine' ( ( ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,139,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getUnaryRegExpAccess().getToDefineKeyword_16_0());
                    			
                    // InternalMySpectra.g:7067:4: ( ( ruleEString ) )
                    // InternalMySpectra.g:7068:5: ( ruleEString )
                    {
                    // InternalMySpectra.g:7068:5: ( ruleEString )
                    // InternalMySpectra.g:7069:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryRegExpRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnaryRegExpAccess().getToDefineDefineDeclCrossReference_16_1_0());
                    					
                    pushFollow(FOLLOW_99);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:7084:3: (otherlv_24= 'assrt' ( (lv_assrt_25_0= ruleBooleanTerm ) ) )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==104) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // InternalMySpectra.g:7085:4: otherlv_24= 'assrt' ( (lv_assrt_25_0= ruleBooleanTerm ) )
                    {
                    otherlv_24=(Token)match(input,104,FOLLOW_100); 

                    				newLeafNode(otherlv_24, grammarAccess.getUnaryRegExpAccess().getAssrtKeyword_17_0());
                    			
                    // InternalMySpectra.g:7089:4: ( (lv_assrt_25_0= ruleBooleanTerm ) )
                    // InternalMySpectra.g:7090:5: (lv_assrt_25_0= ruleBooleanTerm )
                    {
                    // InternalMySpectra.g:7090:5: (lv_assrt_25_0= ruleBooleanTerm )
                    // InternalMySpectra.g:7091:6: lv_assrt_25_0= ruleBooleanTerm
                    {

                    						newCompositeNode(grammarAccess.getUnaryRegExpAccess().getAssrtBooleanTermParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    lv_assrt_25_0=ruleBooleanTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"assrt",
                    							lv_assrt_25_0,
                    							"org.xtext.example.myspectra.MySpectra.BooleanTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:7109:3: (otherlv_26= 'left' ( (lv_left_27_0= ruleRegExp ) ) )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==62) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // InternalMySpectra.g:7110:4: otherlv_26= 'left' ( (lv_left_27_0= ruleRegExp ) )
                    {
                    otherlv_26=(Token)match(input,62,FOLLOW_60); 

                    				newLeafNode(otherlv_26, grammarAccess.getUnaryRegExpAccess().getLeftKeyword_18_0());
                    			
                    // InternalMySpectra.g:7114:4: ( (lv_left_27_0= ruleRegExp ) )
                    // InternalMySpectra.g:7115:5: (lv_left_27_0= ruleRegExp )
                    {
                    // InternalMySpectra.g:7115:5: (lv_left_27_0= ruleRegExp )
                    // InternalMySpectra.g:7116:6: lv_left_27_0= ruleRegExp
                    {

                    						newCompositeNode(grammarAccess.getUnaryRegExpAccess().getLeftRegExpParserRuleCall_18_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_left_27_0=ruleRegExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryRegExpRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_27_0,
                    							"org.xtext.example.myspectra.MySpectra.RegExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getUnaryRegExpAccess().getRightCurlyBracketKeyword_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryRegExp"


    // $ANTLR start "entryRuleCompRegExp"
    // InternalMySpectra.g:7142:1: entryRuleCompRegExp returns [EObject current=null] : iv_ruleCompRegExp= ruleCompRegExp EOF ;
    public final EObject entryRuleCompRegExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompRegExp = null;


        try {
            // InternalMySpectra.g:7142:51: (iv_ruleCompRegExp= ruleCompRegExp EOF )
            // InternalMySpectra.g:7143:2: iv_ruleCompRegExp= ruleCompRegExp EOF
            {
             newCompositeNode(grammarAccess.getCompRegExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompRegExp=ruleCompRegExp();

            state._fsp--;

             current =iv_ruleCompRegExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompRegExp"


    // $ANTLR start "ruleCompRegExp"
    // InternalMySpectra.g:7149:1: ruleCompRegExp returns [EObject current=null] : ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'CompRegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'comp' ( (lv_comp_7_0= ruleEString ) ) )? (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )? (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleCompRegExp() throws RecognitionException {
        EObject current = null;

        Token lv_empty_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_val_5_0 = null;

        AntlrDatatypeRuleToken lv_comp_7_0 = null;

        EObject lv_assrt_9_0 = null;

        EObject lv_left_11_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:7155:2: ( ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'CompRegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'comp' ( (lv_comp_7_0= ruleEString ) ) )? (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )? (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )? otherlv_12= '}' ) )
            // InternalMySpectra.g:7156:2: ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'CompRegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'comp' ( (lv_comp_7_0= ruleEString ) ) )? (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )? (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )? otherlv_12= '}' )
            {
            // InternalMySpectra.g:7156:2: ( () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'CompRegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'comp' ( (lv_comp_7_0= ruleEString ) ) )? (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )? (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )? otherlv_12= '}' )
            // InternalMySpectra.g:7157:3: () ( (lv_empty_1_0= 'empty' ) )? otherlv_2= 'CompRegExp' otherlv_3= '{' (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )? (otherlv_6= 'comp' ( (lv_comp_7_0= ruleEString ) ) )? (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )? (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )? otherlv_12= '}'
            {
            // InternalMySpectra.g:7157:3: ()
            // InternalMySpectra.g:7158:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompRegExpAccess().getCompRegExpAction_0(),
            					current);
            			

            }

            // InternalMySpectra.g:7164:3: ( (lv_empty_1_0= 'empty' ) )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==101) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // InternalMySpectra.g:7165:4: (lv_empty_1_0= 'empty' )
                    {
                    // InternalMySpectra.g:7165:4: (lv_empty_1_0= 'empty' )
                    // InternalMySpectra.g:7166:5: lv_empty_1_0= 'empty'
                    {
                    lv_empty_1_0=(Token)match(input,101,FOLLOW_140); 

                    					newLeafNode(lv_empty_1_0, grammarAccess.getCompRegExpAccess().getEmptyEmptyKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompRegExpRule());
                    					}
                    					setWithLastConsumed(current, "empty", lv_empty_1_0 != null, "empty");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,140,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCompRegExpAccess().getCompRegExpKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_141); 

            			newLeafNode(otherlv_3, grammarAccess.getCompRegExpAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySpectra.g:7186:3: (otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) ) )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==103) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // InternalMySpectra.g:7187:4: otherlv_4= 'val' ( (lv_val_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,103,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompRegExpAccess().getValKeyword_4_0());
                    			
                    // InternalMySpectra.g:7191:4: ( (lv_val_5_0= ruleEString ) )
                    // InternalMySpectra.g:7192:5: (lv_val_5_0= ruleEString )
                    {
                    // InternalMySpectra.g:7192:5: (lv_val_5_0= ruleEString )
                    // InternalMySpectra.g:7193:6: lv_val_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompRegExpAccess().getValEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_142);
                    lv_val_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompRegExpRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_5_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:7211:3: (otherlv_6= 'comp' ( (lv_comp_7_0= ruleEString ) ) )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==141) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // InternalMySpectra.g:7212:4: otherlv_6= 'comp' ( (lv_comp_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,141,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCompRegExpAccess().getCompKeyword_5_0());
                    			
                    // InternalMySpectra.g:7216:4: ( (lv_comp_7_0= ruleEString ) )
                    // InternalMySpectra.g:7217:5: (lv_comp_7_0= ruleEString )
                    {
                    // InternalMySpectra.g:7217:5: (lv_comp_7_0= ruleEString )
                    // InternalMySpectra.g:7218:6: lv_comp_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompRegExpAccess().getCompEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_99);
                    lv_comp_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompRegExpRule());
                    						}
                    						set(
                    							current,
                    							"comp",
                    							lv_comp_7_0,
                    							"org.xtext.example.myspectra.MySpectra.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:7236:3: (otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) ) )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==104) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // InternalMySpectra.g:7237:4: otherlv_8= 'assrt' ( (lv_assrt_9_0= ruleBooleanTerm ) )
                    {
                    otherlv_8=(Token)match(input,104,FOLLOW_100); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompRegExpAccess().getAssrtKeyword_6_0());
                    			
                    // InternalMySpectra.g:7241:4: ( (lv_assrt_9_0= ruleBooleanTerm ) )
                    // InternalMySpectra.g:7242:5: (lv_assrt_9_0= ruleBooleanTerm )
                    {
                    // InternalMySpectra.g:7242:5: (lv_assrt_9_0= ruleBooleanTerm )
                    // InternalMySpectra.g:7243:6: lv_assrt_9_0= ruleBooleanTerm
                    {

                    						newCompositeNode(grammarAccess.getCompRegExpAccess().getAssrtBooleanTermParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    lv_assrt_9_0=ruleBooleanTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompRegExpRule());
                    						}
                    						set(
                    							current,
                    							"assrt",
                    							lv_assrt_9_0,
                    							"org.xtext.example.myspectra.MySpectra.BooleanTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:7261:3: (otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) ) )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==62) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // InternalMySpectra.g:7262:4: otherlv_10= 'left' ( (lv_left_11_0= ruleRegExp ) )
                    {
                    otherlv_10=(Token)match(input,62,FOLLOW_60); 

                    				newLeafNode(otherlv_10, grammarAccess.getCompRegExpAccess().getLeftKeyword_7_0());
                    			
                    // InternalMySpectra.g:7266:4: ( (lv_left_11_0= ruleRegExp ) )
                    // InternalMySpectra.g:7267:5: (lv_left_11_0= ruleRegExp )
                    {
                    // InternalMySpectra.g:7267:5: (lv_left_11_0= ruleRegExp )
                    // InternalMySpectra.g:7268:6: lv_left_11_0= ruleRegExp
                    {

                    						newCompositeNode(grammarAccess.getCompRegExpAccess().getLeftRegExpParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_left_11_0=ruleRegExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompRegExpRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_11_0,
                    							"org.xtext.example.myspectra.MySpectra.RegExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCompRegExpAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompRegExp"


    // $ANTLR start "entryRulePatternParamList"
    // InternalMySpectra.g:7294:1: entryRulePatternParamList returns [EObject current=null] : iv_rulePatternParamList= rulePatternParamList EOF ;
    public final EObject entryRulePatternParamList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternParamList = null;


        try {
            // InternalMySpectra.g:7294:57: (iv_rulePatternParamList= rulePatternParamList EOF )
            // InternalMySpectra.g:7295:2: iv_rulePatternParamList= rulePatternParamList EOF
            {
             newCompositeNode(grammarAccess.getPatternParamListRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternParamList=rulePatternParamList();

            state._fsp--;

             current =iv_rulePatternParamList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternParamList"


    // $ANTLR start "rulePatternParamList"
    // InternalMySpectra.g:7301:1: rulePatternParamList returns [EObject current=null] : ( () otherlv_1= 'PatternParamList' otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= rulePatternParam ) ) (otherlv_6= ',' ( (lv_params_7_0= rulePatternParam ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulePatternParamList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:7307:2: ( ( () otherlv_1= 'PatternParamList' otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= rulePatternParam ) ) (otherlv_6= ',' ( (lv_params_7_0= rulePatternParam ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalMySpectra.g:7308:2: ( () otherlv_1= 'PatternParamList' otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= rulePatternParam ) ) (otherlv_6= ',' ( (lv_params_7_0= rulePatternParam ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalMySpectra.g:7308:2: ( () otherlv_1= 'PatternParamList' otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= rulePatternParam ) ) (otherlv_6= ',' ( (lv_params_7_0= rulePatternParam ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalMySpectra.g:7309:3: () otherlv_1= 'PatternParamList' otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= rulePatternParam ) ) (otherlv_6= ',' ( (lv_params_7_0= rulePatternParam ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalMySpectra.g:7309:3: ()
            // InternalMySpectra.g:7310:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternParamListAccess().getPatternParamListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,142,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternParamListAccess().getPatternParamListKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_143); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternParamListAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:7324:3: (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= rulePatternParam ) ) (otherlv_6= ',' ( (lv_params_7_0= rulePatternParam ) ) )* otherlv_8= '}' )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==45) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // InternalMySpectra.g:7325:4: otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= rulePatternParam ) ) (otherlv_6= ',' ( (lv_params_7_0= rulePatternParam ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPatternParamListAccess().getParamsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_144); 

                    				newLeafNode(otherlv_4, grammarAccess.getPatternParamListAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMySpectra.g:7333:4: ( (lv_params_5_0= rulePatternParam ) )
                    // InternalMySpectra.g:7334:5: (lv_params_5_0= rulePatternParam )
                    {
                    // InternalMySpectra.g:7334:5: (lv_params_5_0= rulePatternParam )
                    // InternalMySpectra.g:7335:6: lv_params_5_0= rulePatternParam
                    {

                    						newCompositeNode(grammarAccess.getPatternParamListAccess().getParamsPatternParamParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_params_5_0=rulePatternParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternParamListRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_5_0,
                    							"org.xtext.example.myspectra.MySpectra.PatternParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:7352:4: (otherlv_6= ',' ( (lv_params_7_0= rulePatternParam ) ) )*
                    loop186:
                    do {
                        int alt186=2;
                        int LA186_0 = input.LA(1);

                        if ( (LA186_0==14) ) {
                            alt186=1;
                        }


                        switch (alt186) {
                    	case 1 :
                    	    // InternalMySpectra.g:7353:5: otherlv_6= ',' ( (lv_params_7_0= rulePatternParam ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_144); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPatternParamListAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMySpectra.g:7357:5: ( (lv_params_7_0= rulePatternParam ) )
                    	    // InternalMySpectra.g:7358:6: (lv_params_7_0= rulePatternParam )
                    	    {
                    	    // InternalMySpectra.g:7358:6: (lv_params_7_0= rulePatternParam )
                    	    // InternalMySpectra.g:7359:7: lv_params_7_0= rulePatternParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternParamListAccess().getParamsPatternParamParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_params_7_0=rulePatternParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternParamListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_7_0,
                    	    								"org.xtext.example.myspectra.MySpectra.PatternParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop186;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getPatternParamListAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPatternParamListAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternParamList"


    // $ANTLR start "entryRuleTypedParamList"
    // InternalMySpectra.g:7390:1: entryRuleTypedParamList returns [EObject current=null] : iv_ruleTypedParamList= ruleTypedParamList EOF ;
    public final EObject entryRuleTypedParamList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedParamList = null;


        try {
            // InternalMySpectra.g:7390:55: (iv_ruleTypedParamList= ruleTypedParamList EOF )
            // InternalMySpectra.g:7391:2: iv_ruleTypedParamList= ruleTypedParamList EOF
            {
             newCompositeNode(grammarAccess.getTypedParamListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedParamList=ruleTypedParamList();

            state._fsp--;

             current =iv_ruleTypedParamList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedParamList"


    // $ANTLR start "ruleTypedParamList"
    // InternalMySpectra.g:7397:1: ruleTypedParamList returns [EObject current=null] : ( () otherlv_1= 'TypedParamList' otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleTypedParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleTypedParam ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleTypedParamList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:7403:2: ( ( () otherlv_1= 'TypedParamList' otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleTypedParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleTypedParam ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalMySpectra.g:7404:2: ( () otherlv_1= 'TypedParamList' otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleTypedParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleTypedParam ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalMySpectra.g:7404:2: ( () otherlv_1= 'TypedParamList' otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleTypedParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleTypedParam ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalMySpectra.g:7405:3: () otherlv_1= 'TypedParamList' otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleTypedParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleTypedParam ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalMySpectra.g:7405:3: ()
            // InternalMySpectra.g:7406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypedParamListAccess().getTypedParamListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,143,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTypedParamListAccess().getTypedParamListKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_143); 

            			newLeafNode(otherlv_2, grammarAccess.getTypedParamListAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:7420:3: (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleTypedParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleTypedParam ) ) )* otherlv_8= '}' )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==45) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // InternalMySpectra.g:7421:4: otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleTypedParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleTypedParam ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypedParamListAccess().getParamsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_145); 

                    				newLeafNode(otherlv_4, grammarAccess.getTypedParamListAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMySpectra.g:7429:4: ( (lv_params_5_0= ruleTypedParam ) )
                    // InternalMySpectra.g:7430:5: (lv_params_5_0= ruleTypedParam )
                    {
                    // InternalMySpectra.g:7430:5: (lv_params_5_0= ruleTypedParam )
                    // InternalMySpectra.g:7431:6: lv_params_5_0= ruleTypedParam
                    {

                    						newCompositeNode(grammarAccess.getTypedParamListAccess().getParamsTypedParamParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_params_5_0=ruleTypedParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypedParamListRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_5_0,
                    							"org.xtext.example.myspectra.MySpectra.TypedParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMySpectra.g:7448:4: (otherlv_6= ',' ( (lv_params_7_0= ruleTypedParam ) ) )*
                    loop188:
                    do {
                        int alt188=2;
                        int LA188_0 = input.LA(1);

                        if ( (LA188_0==14) ) {
                            alt188=1;
                        }


                        switch (alt188) {
                    	case 1 :
                    	    // InternalMySpectra.g:7449:5: otherlv_6= ',' ( (lv_params_7_0= ruleTypedParam ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_145); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTypedParamListAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMySpectra.g:7453:5: ( (lv_params_7_0= ruleTypedParam ) )
                    	    // InternalMySpectra.g:7454:6: (lv_params_7_0= ruleTypedParam )
                    	    {
                    	    // InternalMySpectra.g:7454:6: (lv_params_7_0= ruleTypedParam )
                    	    // InternalMySpectra.g:7455:7: lv_params_7_0= ruleTypedParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getTypedParamListAccess().getParamsTypedParamParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_params_7_0=ruleTypedParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTypedParamListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_7_0,
                    	    								"org.xtext.example.myspectra.MySpectra.TypedParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop188;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getTypedParamListAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTypedParamListAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedParamList"


    // $ANTLR start "entryRuleTrigger"
    // InternalMySpectra.g:7486:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalMySpectra.g:7486:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalMySpectra.g:7487:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalMySpectra.g:7493:1: ruleTrigger returns [EObject current=null] : ( () otherlv_1= 'Trigger' otherlv_2= '{' (otherlv_3= 'initPointer' ( ( ruleEString ) ) )? (otherlv_5= 'effectPointer' ( ( ruleEString ) ) )? (otherlv_7= 'initRegExp' ( (lv_initRegExp_8_0= ruleRegExp ) ) )? (otherlv_9= 'effectRegExp' ( (lv_effectRegExp_10_0= ruleRegExp ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_initRegExp_8_0 = null;

        EObject lv_effectRegExp_10_0 = null;



        	enterRule();

        try {
            // InternalMySpectra.g:7499:2: ( ( () otherlv_1= 'Trigger' otherlv_2= '{' (otherlv_3= 'initPointer' ( ( ruleEString ) ) )? (otherlv_5= 'effectPointer' ( ( ruleEString ) ) )? (otherlv_7= 'initRegExp' ( (lv_initRegExp_8_0= ruleRegExp ) ) )? (otherlv_9= 'effectRegExp' ( (lv_effectRegExp_10_0= ruleRegExp ) ) )? otherlv_11= '}' ) )
            // InternalMySpectra.g:7500:2: ( () otherlv_1= 'Trigger' otherlv_2= '{' (otherlv_3= 'initPointer' ( ( ruleEString ) ) )? (otherlv_5= 'effectPointer' ( ( ruleEString ) ) )? (otherlv_7= 'initRegExp' ( (lv_initRegExp_8_0= ruleRegExp ) ) )? (otherlv_9= 'effectRegExp' ( (lv_effectRegExp_10_0= ruleRegExp ) ) )? otherlv_11= '}' )
            {
            // InternalMySpectra.g:7500:2: ( () otherlv_1= 'Trigger' otherlv_2= '{' (otherlv_3= 'initPointer' ( ( ruleEString ) ) )? (otherlv_5= 'effectPointer' ( ( ruleEString ) ) )? (otherlv_7= 'initRegExp' ( (lv_initRegExp_8_0= ruleRegExp ) ) )? (otherlv_9= 'effectRegExp' ( (lv_effectRegExp_10_0= ruleRegExp ) ) )? otherlv_11= '}' )
            // InternalMySpectra.g:7501:3: () otherlv_1= 'Trigger' otherlv_2= '{' (otherlv_3= 'initPointer' ( ( ruleEString ) ) )? (otherlv_5= 'effectPointer' ( ( ruleEString ) ) )? (otherlv_7= 'initRegExp' ( (lv_initRegExp_8_0= ruleRegExp ) ) )? (otherlv_9= 'effectRegExp' ( (lv_effectRegExp_10_0= ruleRegExp ) ) )? otherlv_11= '}'
            {
            // InternalMySpectra.g:7501:3: ()
            // InternalMySpectra.g:7502:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriggerAccess().getTriggerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,144,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getTriggerKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_146); 

            			newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySpectra.g:7516:3: (otherlv_3= 'initPointer' ( ( ruleEString ) ) )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==145) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // InternalMySpectra.g:7517:4: otherlv_3= 'initPointer' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,145,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTriggerAccess().getInitPointerKeyword_3_0());
                    			
                    // InternalMySpectra.g:7521:4: ( ( ruleEString ) )
                    // InternalMySpectra.g:7522:5: ( ruleEString )
                    {
                    // InternalMySpectra.g:7522:5: ( ruleEString )
                    // InternalMySpectra.g:7523:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTriggerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTriggerAccess().getInitPointerDefineRegExpDeclCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_147);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:7538:3: (otherlv_5= 'effectPointer' ( ( ruleEString ) ) )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==146) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // InternalMySpectra.g:7539:4: otherlv_5= 'effectPointer' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,146,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTriggerAccess().getEffectPointerKeyword_4_0());
                    			
                    // InternalMySpectra.g:7543:4: ( ( ruleEString ) )
                    // InternalMySpectra.g:7544:5: ( ruleEString )
                    {
                    // InternalMySpectra.g:7544:5: ( ruleEString )
                    // InternalMySpectra.g:7545:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTriggerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTriggerAccess().getEffectPointerDefineRegExpDeclCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_148);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:7560:3: (otherlv_7= 'initRegExp' ( (lv_initRegExp_8_0= ruleRegExp ) ) )?
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( (LA192_0==147) ) {
                alt192=1;
            }
            switch (alt192) {
                case 1 :
                    // InternalMySpectra.g:7561:4: otherlv_7= 'initRegExp' ( (lv_initRegExp_8_0= ruleRegExp ) )
                    {
                    otherlv_7=(Token)match(input,147,FOLLOW_60); 

                    				newLeafNode(otherlv_7, grammarAccess.getTriggerAccess().getInitRegExpKeyword_5_0());
                    			
                    // InternalMySpectra.g:7565:4: ( (lv_initRegExp_8_0= ruleRegExp ) )
                    // InternalMySpectra.g:7566:5: (lv_initRegExp_8_0= ruleRegExp )
                    {
                    // InternalMySpectra.g:7566:5: (lv_initRegExp_8_0= ruleRegExp )
                    // InternalMySpectra.g:7567:6: lv_initRegExp_8_0= ruleRegExp
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getInitRegExpRegExpParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_149);
                    lv_initRegExp_8_0=ruleRegExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriggerRule());
                    						}
                    						set(
                    							current,
                    							"initRegExp",
                    							lv_initRegExp_8_0,
                    							"org.xtext.example.myspectra.MySpectra.RegExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMySpectra.g:7585:3: (otherlv_9= 'effectRegExp' ( (lv_effectRegExp_10_0= ruleRegExp ) ) )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==148) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // InternalMySpectra.g:7586:4: otherlv_9= 'effectRegExp' ( (lv_effectRegExp_10_0= ruleRegExp ) )
                    {
                    otherlv_9=(Token)match(input,148,FOLLOW_60); 

                    				newLeafNode(otherlv_9, grammarAccess.getTriggerAccess().getEffectRegExpKeyword_6_0());
                    			
                    // InternalMySpectra.g:7590:4: ( (lv_effectRegExp_10_0= ruleRegExp ) )
                    // InternalMySpectra.g:7591:5: (lv_effectRegExp_10_0= ruleRegExp )
                    {
                    // InternalMySpectra.g:7591:5: (lv_effectRegExp_10_0= ruleRegExp )
                    // InternalMySpectra.g:7592:6: lv_effectRegExp_10_0= ruleRegExp
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getEffectRegExpRegExpParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_effectRegExp_10_0=ruleRegExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriggerRule());
                    						}
                    						set(
                    							current,
                    							"effectRegExp",
                    							lv_effectRegExp_10_0,
                    							"org.xtext.example.myspectra.MySpectra.RegExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTriggerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "ruleVarOwner"
    // InternalMySpectra.g:7618:1: ruleVarOwner returns [Enumerator current=null] : ( (enumLiteral_0= 'SYS' ) | (enumLiteral_1= 'ENV' ) | (enumLiteral_2= 'AUX' ) ) ;
    public final Enumerator ruleVarOwner() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMySpectra.g:7624:2: ( ( (enumLiteral_0= 'SYS' ) | (enumLiteral_1= 'ENV' ) | (enumLiteral_2= 'AUX' ) ) )
            // InternalMySpectra.g:7625:2: ( (enumLiteral_0= 'SYS' ) | (enumLiteral_1= 'ENV' ) | (enumLiteral_2= 'AUX' ) )
            {
            // InternalMySpectra.g:7625:2: ( (enumLiteral_0= 'SYS' ) | (enumLiteral_1= 'ENV' ) | (enumLiteral_2= 'AUX' ) )
            int alt194=3;
            switch ( input.LA(1) ) {
            case 149:
                {
                alt194=1;
                }
                break;
            case 150:
                {
                alt194=2;
                }
                break;
            case 151:
                {
                alt194=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 194, 0, input);

                throw nvae;
            }

            switch (alt194) {
                case 1 :
                    // InternalMySpectra.g:7626:3: (enumLiteral_0= 'SYS' )
                    {
                    // InternalMySpectra.g:7626:3: (enumLiteral_0= 'SYS' )
                    // InternalMySpectra.g:7627:4: enumLiteral_0= 'SYS'
                    {
                    enumLiteral_0=(Token)match(input,149,FOLLOW_2); 

                    				current = grammarAccess.getVarOwnerAccess().getSYSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVarOwnerAccess().getSYSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMySpectra.g:7634:3: (enumLiteral_1= 'ENV' )
                    {
                    // InternalMySpectra.g:7634:3: (enumLiteral_1= 'ENV' )
                    // InternalMySpectra.g:7635:4: enumLiteral_1= 'ENV'
                    {
                    enumLiteral_1=(Token)match(input,150,FOLLOW_2); 

                    				current = grammarAccess.getVarOwnerAccess().getENVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVarOwnerAccess().getENVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMySpectra.g:7642:3: (enumLiteral_2= 'AUX' )
                    {
                    // InternalMySpectra.g:7642:3: (enumLiteral_2= 'AUX' )
                    // InternalMySpectra.g:7643:4: enumLiteral_2= 'AUX'
                    {
                    enumLiteral_2=(Token)match(input,151,FOLLOW_2); 

                    				current = grammarAccess.getVarOwnerAccess().getAUXEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVarOwnerAccess().getAUXEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarOwner"


    // $ANTLR start "ruleOverflowMethod"
    // InternalMySpectra.g:7653:1: ruleOverflowMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'KEEP' ) | (enumLiteral_1= 'FALSE' ) | (enumLiteral_2= 'MODULO' ) ) ;
    public final Enumerator ruleOverflowMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMySpectra.g:7659:2: ( ( (enumLiteral_0= 'KEEP' ) | (enumLiteral_1= 'FALSE' ) | (enumLiteral_2= 'MODULO' ) ) )
            // InternalMySpectra.g:7660:2: ( (enumLiteral_0= 'KEEP' ) | (enumLiteral_1= 'FALSE' ) | (enumLiteral_2= 'MODULO' ) )
            {
            // InternalMySpectra.g:7660:2: ( (enumLiteral_0= 'KEEP' ) | (enumLiteral_1= 'FALSE' ) | (enumLiteral_2= 'MODULO' ) )
            int alt195=3;
            switch ( input.LA(1) ) {
            case 152:
                {
                alt195=1;
                }
                break;
            case 153:
                {
                alt195=2;
                }
                break;
            case 154:
                {
                alt195=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 195, 0, input);

                throw nvae;
            }

            switch (alt195) {
                case 1 :
                    // InternalMySpectra.g:7661:3: (enumLiteral_0= 'KEEP' )
                    {
                    // InternalMySpectra.g:7661:3: (enumLiteral_0= 'KEEP' )
                    // InternalMySpectra.g:7662:4: enumLiteral_0= 'KEEP'
                    {
                    enumLiteral_0=(Token)match(input,152,FOLLOW_2); 

                    				current = grammarAccess.getOverflowMethodAccess().getKEEPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOverflowMethodAccess().getKEEPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMySpectra.g:7669:3: (enumLiteral_1= 'FALSE' )
                    {
                    // InternalMySpectra.g:7669:3: (enumLiteral_1= 'FALSE' )
                    // InternalMySpectra.g:7670:4: enumLiteral_1= 'FALSE'
                    {
                    enumLiteral_1=(Token)match(input,153,FOLLOW_2); 

                    				current = grammarAccess.getOverflowMethodAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOverflowMethodAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMySpectra.g:7677:3: (enumLiteral_2= 'MODULO' )
                    {
                    // InternalMySpectra.g:7677:3: (enumLiteral_2= 'MODULO' )
                    // InternalMySpectra.g:7678:4: enumLiteral_2= 'MODULO'
                    {
                    enumLiteral_2=(Token)match(input,154,FOLLOW_2); 

                    				current = grammarAccess.getOverflowMethodAccess().getMODULOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOverflowMethodAccess().getMODULOEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOverflowMethod"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00651202A9180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E08000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0200000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x1C00000000000000L,0x0000000004804FBDL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000001FC00008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000001F800008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000001F000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000001E000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000001C000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000018000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000C2010008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000C2000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000EC2000008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000CC2000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00008C2000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00008C0000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000880000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002200000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0018AC0000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0018A80000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0018A00000008000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0018200000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0018000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0180000000018000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000018000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x8000006000000000L,0x00000000000010FEL});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0xE000000000008000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xC000000000008000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x8000000000008000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x6000000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x4000000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x2000000000018000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x6000000000008000L,0x0000000000000040L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x4000000000008000L,0x0000000000000040L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000040L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000008000L,0x0000000000003000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000008000L,0x0000000000002000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x2000000000008000L,0x00000000007F8000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000008000L,0x00000000007F8000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000008000L,0x00000000007F0000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000008000L,0x00000000007E0000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000008000L,0x00000000007C0000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000008000L,0x0000000000780000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000008000L,0x0000000000700000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000008000L,0x0000000000600000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000008000L,0x0000000000400000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000008000L,0x0000000003000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000008000L,0x0000000002000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x2008000000008000L,0x0000000008000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0008000000008000L,0x0000000008000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000008000L,0x00000003C1000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000008000L,0x0000000381000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000008000L,0x0000000301000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000008000L,0x0000000201000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000008000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x4000000000008000L,0x0000018000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x4000000000008000L,0x0000010000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x4000000000008000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000008000L,0x0000040000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000008000L,0x0000E00000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000008000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000008000L,0x0000800000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000008000L,0x0008000000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000010008000L,0x0020400200000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000008000L,0x0020400200000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000008000L,0x0000400200000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000008000L,0x0000400000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000008000L,0x0000000180000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000008000L,0x0000000100000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000408000L,0x0300000000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000008000L,0x0300000000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000008000L,0x0200000000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000008000L,0x1800000000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000008000L,0x1000000000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000008000L,0x4000000000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x4000000000008000L,0x0000018000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x4000000000008000L,0x0000010000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x4000000000008000L,0x0000010000000040L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000FEL});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x4000000000008000L,0x0000018180000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x4000000000008000L,0x0000010180000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x4000000000008000L,0x0000010180000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x4000000000008000L,0x0000010180000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x4000000000008000L,0x0000010100000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x4000000000008000L,0x0000010000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x4000000000008000L,0x0000010000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x4000000000008000L,0x0000018000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x4000000000008000L,0x0000010000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000000000100000L});

}