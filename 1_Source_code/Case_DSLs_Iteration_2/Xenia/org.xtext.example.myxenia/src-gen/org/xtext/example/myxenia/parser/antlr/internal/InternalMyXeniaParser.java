package org.xtext.example.myxenia.parser.antlr.internal;

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
import org.xtext.example.myxenia.services.MyXeniaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyXeniaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'has'", "'pages'", "'['", "','", "']'", "'with'", "':'", "'xml'", "'mode'", "'@'", "'modal'", "'('", "')'", "'info'", "'map'", "'->'", "'development'", "'production'", "'mod'", "'freq'", "'prio'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyXeniaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyXeniaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyXeniaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyXenia.g"; }



     	private MyXeniaGrammarAccess grammarAccess;

        public InternalMyXeniaParser(TokenStream input, MyXeniaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyXeniaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyXenia.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyXenia.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyXenia.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalMyXenia.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_headers_0_0= ruleHeader ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_mapped_entities_2_0= ruleMappedEntity ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_headers_0_0 = null;

        EObject lv_entities_1_0 = null;

        EObject lv_mapped_entities_2_0 = null;



        	enterRule();

        try {
            // InternalMyXenia.g:78:2: ( ( ( (lv_headers_0_0= ruleHeader ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_mapped_entities_2_0= ruleMappedEntity ) )* ) )
            // InternalMyXenia.g:79:2: ( ( (lv_headers_0_0= ruleHeader ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_mapped_entities_2_0= ruleMappedEntity ) )* )
            {
            // InternalMyXenia.g:79:2: ( ( (lv_headers_0_0= ruleHeader ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_mapped_entities_2_0= ruleMappedEntity ) )* )
            // InternalMyXenia.g:80:3: ( (lv_headers_0_0= ruleHeader ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_mapped_entities_2_0= ruleMappedEntity ) )*
            {
            // InternalMyXenia.g:80:3: ( (lv_headers_0_0= ruleHeader ) )
            // InternalMyXenia.g:81:4: (lv_headers_0_0= ruleHeader )
            {
            // InternalMyXenia.g:81:4: (lv_headers_0_0= ruleHeader )
            // InternalMyXenia.g:82:5: lv_headers_0_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getModelAccess().getHeadersHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_headers_0_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"headers",
            						lv_headers_0_0,
            						"org.xtext.example.myxenia.MyXenia.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyXenia.g:99:3: ( (lv_entities_1_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyXenia.g:100:4: (lv_entities_1_0= ruleEntity )
            	    {
            	    // InternalMyXenia.g:100:4: (lv_entities_1_0= ruleEntity )
            	    // InternalMyXenia.g:101:5: lv_entities_1_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_1_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_1_0,
            	    						"org.xtext.example.myxenia.MyXenia.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyXenia.g:118:3: ( (lv_mapped_entities_2_0= ruleMappedEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=25 && LA2_0<=26)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyXenia.g:119:4: (lv_mapped_entities_2_0= ruleMappedEntity )
            	    {
            	    // InternalMyXenia.g:119:4: (lv_mapped_entities_2_0= ruleMappedEntity )
            	    // InternalMyXenia.g:120:5: lv_mapped_entities_2_0= ruleMappedEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMapped_entitiesMappedEntityParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_mapped_entities_2_0=ruleMappedEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mapped_entities",
            	    						lv_mapped_entities_2_0,
            	    						"org.xtext.example.myxenia.MyXenia.MappedEntity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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


    // $ANTLR start "entryRuleHeader"
    // InternalMyXenia.g:141:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalMyXenia.g:141:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalMyXenia.g:142:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalMyXenia.g:148:1: ruleHeader returns [EObject current=null] : (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ']' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_appName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_sites_5_0 = null;

        EObject lv_sites_7_0 = null;



        	enterRule();

        try {
            // InternalMyXenia.g:154:2: ( (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ']' ) )
            // InternalMyXenia.g:155:2: (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ']' )
            {
            // InternalMyXenia.g:155:2: (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ']' )
            // InternalMyXenia.g:156:3: otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getAppKeyword_0());
            		
            // InternalMyXenia.g:160:3: ( (lv_appName_1_0= RULE_ID ) )
            // InternalMyXenia.g:161:4: (lv_appName_1_0= RULE_ID )
            {
            // InternalMyXenia.g:161:4: (lv_appName_1_0= RULE_ID )
            // InternalMyXenia.g:162:5: lv_appName_1_0= RULE_ID
            {
            lv_appName_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_appName_1_0, grammarAccess.getHeaderAccess().getAppNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"appName",
            						lv_appName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getHasKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getPagesKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalMyXenia.g:190:3: ( (lv_sites_5_0= ruleSuperSite ) )
            // InternalMyXenia.g:191:4: (lv_sites_5_0= ruleSuperSite )
            {
            // InternalMyXenia.g:191:4: (lv_sites_5_0= ruleSuperSite )
            // InternalMyXenia.g:192:5: lv_sites_5_0= ruleSuperSite
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getSitesSuperSiteParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_sites_5_0=ruleSuperSite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					add(
            						current,
            						"sites",
            						lv_sites_5_0,
            						"org.xtext.example.myxenia.MyXenia.SuperSite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyXenia.g:209:3: (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyXenia.g:210:4: otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getHeaderAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyXenia.g:214:4: ( (lv_sites_7_0= ruleSuperSite ) )
            	    // InternalMyXenia.g:215:5: (lv_sites_7_0= ruleSuperSite )
            	    {
            	    // InternalMyXenia.g:215:5: (lv_sites_7_0= ruleSuperSite )
            	    // InternalMyXenia.g:216:6: lv_sites_7_0= ruleSuperSite
            	    {

            	    						newCompositeNode(grammarAccess.getHeaderAccess().getSitesSuperSiteParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_sites_7_0=ruleSuperSite();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sites",
            	    							lv_sites_7_0,
            	    							"org.xtext.example.myxenia.MyXenia.SuperSite");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getHeaderAccess().getRightSquareBracketKeyword_7());
            		

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleEntity"
    // InternalMyXenia.g:242:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyXenia.g:242:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyXenia.g:243:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyXenia.g:249:1: ruleEntity returns [EObject current=null] : ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tech_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_mode_8_0 = null;



        	enterRule();

        try {
            // InternalMyXenia.g:255:2: ( ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) ) ) )
            // InternalMyXenia.g:256:2: ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) ) )
            {
            // InternalMyXenia.g:256:2: ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyXenia.g:257:3: (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) )
                    {
                    // InternalMyXenia.g:257:3: (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) )
                    // InternalMyXenia.g:258:4: otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getWithKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getColonKeyword_0_1());
                    			
                    // InternalMyXenia.g:266:4: ( (lv_tech_2_0= RULE_STRING ) )
                    // InternalMyXenia.g:267:5: (lv_tech_2_0= RULE_STRING )
                    {
                    // InternalMyXenia.g:267:5: (lv_tech_2_0= RULE_STRING )
                    // InternalMyXenia.g:268:6: lv_tech_2_0= RULE_STRING
                    {
                    lv_tech_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_tech_2_0, grammarAccess.getEntityAccess().getTechSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tech",
                    							lv_tech_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyXenia.g:286:3: (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) )
                    {
                    // InternalMyXenia.g:286:3: (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) )
                    // InternalMyXenia.g:287:4: otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getXmlKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getColonKeyword_1_1());
                    			
                    // InternalMyXenia.g:295:4: ( (lv_path_5_0= RULE_STRING ) )
                    // InternalMyXenia.g:296:5: (lv_path_5_0= RULE_STRING )
                    {
                    // InternalMyXenia.g:296:5: (lv_path_5_0= RULE_STRING )
                    // InternalMyXenia.g:297:6: lv_path_5_0= RULE_STRING
                    {
                    lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_path_5_0, grammarAccess.getEntityAccess().getPathSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"path",
                    							lv_path_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyXenia.g:315:3: (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) )
                    {
                    // InternalMyXenia.g:315:3: (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) )
                    // InternalMyXenia.g:316:4: otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getModeKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getColonKeyword_2_1());
                    			
                    // InternalMyXenia.g:324:4: ( (lv_mode_8_0= ruleMode ) )
                    // InternalMyXenia.g:325:5: (lv_mode_8_0= ruleMode )
                    {
                    // InternalMyXenia.g:325:5: (lv_mode_8_0= ruleMode )
                    // InternalMyXenia.g:326:6: lv_mode_8_0= ruleMode
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getModeModeEnumRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mode_8_0=ruleMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						set(
                    							current,
                    							"mode",
                    							lv_mode_8_0,
                    							"org.xtext.example.myxenia.MyXenia.Mode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleSuperSite"
    // InternalMyXenia.g:348:1: entryRuleSuperSite returns [EObject current=null] : iv_ruleSuperSite= ruleSuperSite EOF ;
    public final EObject entryRuleSuperSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperSite = null;


        try {
            // InternalMyXenia.g:348:50: (iv_ruleSuperSite= ruleSuperSite EOF )
            // InternalMyXenia.g:349:2: iv_ruleSuperSite= ruleSuperSite EOF
            {
             newCompositeNode(grammarAccess.getSuperSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperSite=ruleSuperSite();

            state._fsp--;

             current =iv_ruleSuperSite; 
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
    // $ANTLR end "entryRuleSuperSite"


    // $ANTLR start "ruleSuperSite"
    // InternalMyXenia.g:355:1: ruleSuperSite returns [EObject current=null] : (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal ) ;
    public final EObject ruleSuperSite() throws RecognitionException {
        EObject current = null;

        EObject this_Site_0 = null;

        EObject this_SiteWithModal_1 = null;



        	enterRule();

        try {
            // InternalMyXenia.g:361:2: ( (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal ) )
            // InternalMyXenia.g:362:2: (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal )
            {
            // InternalMyXenia.g:362:2: (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==EOF||(LA5_2>=15 && LA5_2<=16)||LA5_2==24) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==17) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyXenia.g:363:3: this_Site_0= ruleSite
                    {

                    			newCompositeNode(grammarAccess.getSuperSiteAccess().getSiteParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Site_0=ruleSite();

                    state._fsp--;


                    			current = this_Site_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyXenia.g:372:3: this_SiteWithModal_1= ruleSiteWithModal
                    {

                    			newCompositeNode(grammarAccess.getSuperSiteAccess().getSiteWithModalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SiteWithModal_1=ruleSiteWithModal();

                    state._fsp--;


                    			current = this_SiteWithModal_1;
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
    // $ANTLR end "ruleSuperSite"


    // $ANTLR start "entryRuleSiteWithModal"
    // InternalMyXenia.g:384:1: entryRuleSiteWithModal returns [EObject current=null] : iv_ruleSiteWithModal= ruleSiteWithModal EOF ;
    public final EObject entryRuleSiteWithModal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteWithModal = null;


        try {
            // InternalMyXenia.g:384:54: (iv_ruleSiteWithModal= ruleSiteWithModal EOF )
            // InternalMyXenia.g:385:2: iv_ruleSiteWithModal= ruleSiteWithModal EOF
            {
             newCompositeNode(grammarAccess.getSiteWithModalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiteWithModal=ruleSiteWithModal();

            state._fsp--;

             current =iv_ruleSiteWithModal; 
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
    // $ANTLR end "entryRuleSiteWithModal"


    // $ANTLR start "ruleSiteWithModal"
    // InternalMyXenia.g:391:1: ruleSiteWithModal returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' ) ;
    public final EObject ruleSiteWithModal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_sites_5_0 = null;

        EObject lv_sites_7_0 = null;



        	enterRule();

        try {
            // InternalMyXenia.g:397:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' ) )
            // InternalMyXenia.g:398:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' )
            {
            // InternalMyXenia.g:398:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' )
            // InternalMyXenia.g:399:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSiteWithModalAccess().getCommercialAtKeyword_0());
            		
            // InternalMyXenia.g:403:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyXenia.g:404:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyXenia.g:404:4: (lv_name_1_0= RULE_ID )
            // InternalMyXenia.g:405:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSiteWithModalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteWithModalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSiteWithModalAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getSiteWithModalAccess().getModalKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSiteWithModalAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyXenia.g:433:3: ( (lv_sites_5_0= ruleSuperSite ) )
            // InternalMyXenia.g:434:4: (lv_sites_5_0= ruleSuperSite )
            {
            // InternalMyXenia.g:434:4: (lv_sites_5_0= ruleSuperSite )
            // InternalMyXenia.g:435:5: lv_sites_5_0= ruleSuperSite
            {

            					newCompositeNode(grammarAccess.getSiteWithModalAccess().getSitesSuperSiteParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
            lv_sites_5_0=ruleSuperSite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSiteWithModalRule());
            					}
            					add(
            						current,
            						"sites",
            						lv_sites_5_0,
            						"org.xtext.example.myxenia.MyXenia.SuperSite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyXenia.g:452:3: (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyXenia.g:453:4: otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSiteWithModalAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyXenia.g:457:4: ( (lv_sites_7_0= ruleSuperSite ) )
            	    // InternalMyXenia.g:458:5: (lv_sites_7_0= ruleSuperSite )
            	    {
            	    // InternalMyXenia.g:458:5: (lv_sites_7_0= ruleSuperSite )
            	    // InternalMyXenia.g:459:6: lv_sites_7_0= ruleSuperSite
            	    {

            	    						newCompositeNode(grammarAccess.getSiteWithModalAccess().getSitesSuperSiteParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_sites_7_0=ruleSuperSite();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSiteWithModalRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sites",
            	    							lv_sites_7_0,
            	    							"org.xtext.example.myxenia.MyXenia.SuperSite");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSiteWithModalAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleSiteWithModal"


    // $ANTLR start "entryRuleMappedEntity"
    // InternalMyXenia.g:485:1: entryRuleMappedEntity returns [EObject current=null] : iv_ruleMappedEntity= ruleMappedEntity EOF ;
    public final EObject entryRuleMappedEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappedEntity = null;


        try {
            // InternalMyXenia.g:485:53: (iv_ruleMappedEntity= ruleMappedEntity EOF )
            // InternalMyXenia.g:486:2: iv_ruleMappedEntity= ruleMappedEntity EOF
            {
             newCompositeNode(grammarAccess.getMappedEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappedEntity=ruleMappedEntity();

            state._fsp--;

             current =iv_ruleMappedEntity; 
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
    // $ANTLR end "entryRuleMappedEntity"


    // $ANTLR start "ruleMappedEntity"
    // InternalMyXenia.g:492:1: ruleMappedEntity returns [EObject current=null] : ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) ) ;
    public final EObject ruleMappedEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_infoProps_3_0 = null;

        EObject lv_infoProps_5_0 = null;

        EObject lv_linkedProps_10_0 = null;

        EObject lv_linkedProps_12_0 = null;



        	enterRule();

        try {
            // InternalMyXenia.g:498:2: ( ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) ) )
            // InternalMyXenia.g:499:2: ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) )
            {
            // InternalMyXenia.g:499:2: ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyXenia.g:500:3: (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' )
                    {
                    // InternalMyXenia.g:500:3: (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' )
                    // InternalMyXenia.g:501:4: otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getMappedEntityAccess().getInfoKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getMappedEntityAccess().getColonKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMappedEntityAccess().getLeftSquareBracketKeyword_0_2());
                    			
                    // InternalMyXenia.g:513:4: ( (lv_infoProps_3_0= ruleInfoProperty ) )
                    // InternalMyXenia.g:514:5: (lv_infoProps_3_0= ruleInfoProperty )
                    {
                    // InternalMyXenia.g:514:5: (lv_infoProps_3_0= ruleInfoProperty )
                    // InternalMyXenia.g:515:6: lv_infoProps_3_0= ruleInfoProperty
                    {

                    						newCompositeNode(grammarAccess.getMappedEntityAccess().getInfoPropsInfoPropertyParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_infoProps_3_0=ruleInfoProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappedEntityRule());
                    						}
                    						add(
                    							current,
                    							"infoProps",
                    							lv_infoProps_3_0,
                    							"org.xtext.example.myxenia.MyXenia.InfoProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyXenia.g:532:4: (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyXenia.g:533:5: otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMappedEntityAccess().getCommaKeyword_0_4_0());
                    	    				
                    	    // InternalMyXenia.g:537:5: ( (lv_infoProps_5_0= ruleInfoProperty ) )
                    	    // InternalMyXenia.g:538:6: (lv_infoProps_5_0= ruleInfoProperty )
                    	    {
                    	    // InternalMyXenia.g:538:6: (lv_infoProps_5_0= ruleInfoProperty )
                    	    // InternalMyXenia.g:539:7: lv_infoProps_5_0= ruleInfoProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappedEntityAccess().getInfoPropsInfoPropertyParserRuleCall_0_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_infoProps_5_0=ruleInfoProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappedEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"infoProps",
                    	    								lv_infoProps_5_0,
                    	    								"org.xtext.example.myxenia.MyXenia.InfoProperty");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getMappedEntityAccess().getRightSquareBracketKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyXenia.g:563:3: (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' )
                    {
                    // InternalMyXenia.g:563:3: (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' )
                    // InternalMyXenia.g:564:4: otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getMappedEntityAccess().getMapKeyword_1_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getMappedEntityAccess().getColonKeyword_1_1());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getMappedEntityAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    // InternalMyXenia.g:576:4: ( (lv_linkedProps_10_0= ruleLinkedProperty ) )
                    // InternalMyXenia.g:577:5: (lv_linkedProps_10_0= ruleLinkedProperty )
                    {
                    // InternalMyXenia.g:577:5: (lv_linkedProps_10_0= ruleLinkedProperty )
                    // InternalMyXenia.g:578:6: lv_linkedProps_10_0= ruleLinkedProperty
                    {

                    						newCompositeNode(grammarAccess.getMappedEntityAccess().getLinkedPropsLinkedPropertyParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_linkedProps_10_0=ruleLinkedProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappedEntityRule());
                    						}
                    						add(
                    							current,
                    							"linkedProps",
                    							lv_linkedProps_10_0,
                    							"org.xtext.example.myxenia.MyXenia.LinkedProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyXenia.g:595:4: (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyXenia.g:596:5: otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMappedEntityAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalMyXenia.g:600:5: ( (lv_linkedProps_12_0= ruleLinkedProperty ) )
                    	    // InternalMyXenia.g:601:6: (lv_linkedProps_12_0= ruleLinkedProperty )
                    	    {
                    	    // InternalMyXenia.g:601:6: (lv_linkedProps_12_0= ruleLinkedProperty )
                    	    // InternalMyXenia.g:602:7: lv_linkedProps_12_0= ruleLinkedProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappedEntityAccess().getLinkedPropsLinkedPropertyParserRuleCall_1_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_linkedProps_12_0=ruleLinkedProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappedEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"linkedProps",
                    	    								lv_linkedProps_12_0,
                    	    								"org.xtext.example.myxenia.MyXenia.LinkedProperty");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getMappedEntityAccess().getRightSquareBracketKeyword_1_5());
                    			

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
    // $ANTLR end "ruleMappedEntity"


    // $ANTLR start "entryRuleInfoProperty"
    // InternalMyXenia.g:629:1: entryRuleInfoProperty returns [EObject current=null] : iv_ruleInfoProperty= ruleInfoProperty EOF ;
    public final EObject entryRuleInfoProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoProperty = null;


        try {
            // InternalMyXenia.g:629:53: (iv_ruleInfoProperty= ruleInfoProperty EOF )
            // InternalMyXenia.g:630:2: iv_ruleInfoProperty= ruleInfoProperty EOF
            {
             newCompositeNode(grammarAccess.getInfoPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfoProperty=ruleInfoProperty();

            state._fsp--;

             current =iv_ruleInfoProperty; 
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
    // $ANTLR end "entryRuleInfoProperty"


    // $ANTLR start "ruleInfoProperty"
    // InternalMyXenia.g:636:1: ruleInfoProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* ) ;
    public final EObject ruleInfoProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entities_2_0 = null;

        EObject lv_entities_4_0 = null;



        	enterRule();

        try {
            // InternalMyXenia.g:642:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* ) )
            // InternalMyXenia.g:643:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* )
            {
            // InternalMyXenia.g:643:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* )
            // InternalMyXenia.g:644:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )*
            {
            // InternalMyXenia.g:644:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyXenia.g:645:4: (otherlv_0= RULE_ID )
            {
            // InternalMyXenia.g:645:4: (otherlv_0= RULE_ID )
            // InternalMyXenia.g:646:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfoPropertyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getInfoPropertyAccess().getPageSiteCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInfoPropertyAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMyXenia.g:661:3: ( (lv_entities_2_0= ruleInfoEntity ) )
            // InternalMyXenia.g:662:4: (lv_entities_2_0= ruleInfoEntity )
            {
            // InternalMyXenia.g:662:4: (lv_entities_2_0= ruleInfoEntity )
            // InternalMyXenia.g:663:5: lv_entities_2_0= ruleInfoEntity
            {

            					newCompositeNode(grammarAccess.getInfoPropertyAccess().getEntitiesInfoEntityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_entities_2_0=ruleInfoEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfoPropertyRule());
            					}
            					add(
            						current,
            						"entities",
            						lv_entities_2_0,
            						"org.xtext.example.myxenia.MyXenia.InfoEntity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyXenia.g:680:3: (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    int LA10_1 = input.LA(2);

                    if ( ((LA10_1>=30 && LA10_1<=32)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyXenia.g:681:4: otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getInfoPropertyAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyXenia.g:685:4: ( (lv_entities_4_0= ruleInfoEntity ) )
            	    // InternalMyXenia.g:686:5: (lv_entities_4_0= ruleInfoEntity )
            	    {
            	    // InternalMyXenia.g:686:5: (lv_entities_4_0= ruleInfoEntity )
            	    // InternalMyXenia.g:687:6: lv_entities_4_0= ruleInfoEntity
            	    {

            	    						newCompositeNode(grammarAccess.getInfoPropertyAccess().getEntitiesInfoEntityParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_entities_4_0=ruleInfoEntity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfoPropertyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entities",
            	    							lv_entities_4_0,
            	    							"org.xtext.example.myxenia.MyXenia.InfoEntity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleInfoProperty"


    // $ANTLR start "entryRuleInfoEntity"
    // InternalMyXenia.g:709:1: entryRuleInfoEntity returns [EObject current=null] : iv_ruleInfoEntity= ruleInfoEntity EOF ;
    public final EObject entryRuleInfoEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoEntity = null;


        try {
            // InternalMyXenia.g:709:51: (iv_ruleInfoEntity= ruleInfoEntity EOF )
            // InternalMyXenia.g:710:2: iv_ruleInfoEntity= ruleInfoEntity EOF
            {
             newCompositeNode(grammarAccess.getInfoEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfoEntity=ruleInfoEntity();

            state._fsp--;

             current =iv_ruleInfoEntity; 
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
    // $ANTLR end "entryRuleInfoEntity"


    // $ANTLR start "ruleInfoEntity"
    // InternalMyXenia.g:716:1: ruleInfoEntity returns [EObject current=null] : ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInfoEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_infoValue_2_0=null;
        Enumerator lv_entries_0_0 = null;



        	enterRule();

        try {
            // InternalMyXenia.g:722:2: ( ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) ) )
            // InternalMyXenia.g:723:2: ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) )
            {
            // InternalMyXenia.g:723:2: ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) )
            // InternalMyXenia.g:724:3: ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) )
            {
            // InternalMyXenia.g:724:3: ( (lv_entries_0_0= ruleInfoEntry ) )
            // InternalMyXenia.g:725:4: (lv_entries_0_0= ruleInfoEntry )
            {
            // InternalMyXenia.g:725:4: (lv_entries_0_0= ruleInfoEntry )
            // InternalMyXenia.g:726:5: lv_entries_0_0= ruleInfoEntry
            {

            					newCompositeNode(grammarAccess.getInfoEntityAccess().getEntriesInfoEntryEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_entries_0_0=ruleInfoEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfoEntityRule());
            					}
            					add(
            						current,
            						"entries",
            						lv_entries_0_0,
            						"org.xtext.example.myxenia.MyXenia.InfoEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getInfoEntityAccess().getColonKeyword_1());
            		
            // InternalMyXenia.g:747:3: ( (lv_infoValue_2_0= RULE_STRING ) )
            // InternalMyXenia.g:748:4: (lv_infoValue_2_0= RULE_STRING )
            {
            // InternalMyXenia.g:748:4: (lv_infoValue_2_0= RULE_STRING )
            // InternalMyXenia.g:749:5: lv_infoValue_2_0= RULE_STRING
            {
            lv_infoValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_infoValue_2_0, grammarAccess.getInfoEntityAccess().getInfoValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfoEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"infoValue",
            						lv_infoValue_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleInfoEntity"


    // $ANTLR start "entryRuleSite"
    // InternalMyXenia.g:769:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalMyXenia.g:769:45: (iv_ruleSite= ruleSite EOF )
            // InternalMyXenia.g:770:2: iv_ruleSite= ruleSite EOF
            {
             newCompositeNode(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSite=ruleSite();

            state._fsp--;

             current =iv_ruleSite; 
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
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // InternalMyXenia.g:776:1: ruleSite returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyXenia.g:782:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyXenia.g:783:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyXenia.g:783:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyXenia.g:784:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSiteAccess().getCommercialAtKeyword_0());
            		
            // InternalMyXenia.g:788:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyXenia.g:789:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyXenia.g:789:4: (lv_name_1_0= RULE_ID )
            // InternalMyXenia.g:790:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleLinkedProperty"
    // InternalMyXenia.g:810:1: entryRuleLinkedProperty returns [EObject current=null] : iv_ruleLinkedProperty= ruleLinkedProperty EOF ;
    public final EObject entryRuleLinkedProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedProperty = null;


        try {
            // InternalMyXenia.g:810:55: (iv_ruleLinkedProperty= ruleLinkedProperty EOF )
            // InternalMyXenia.g:811:2: iv_ruleLinkedProperty= ruleLinkedProperty EOF
            {
             newCompositeNode(grammarAccess.getLinkedPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkedProperty=ruleLinkedProperty();

            state._fsp--;

             current =iv_ruleLinkedProperty; 
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
    // $ANTLR end "entryRuleLinkedProperty"


    // $ANTLR start "ruleLinkedProperty"
    // InternalMyXenia.g:817:1: ruleLinkedProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' otherlv_2= '(' ( (lv_page_3_0= ruleRedirectPage ) ) otherlv_4= ')' ) ;
    public final EObject ruleLinkedProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_page_3_0 = null;



        	enterRule();

        try {
            // InternalMyXenia.g:823:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' otherlv_2= '(' ( (lv_page_3_0= ruleRedirectPage ) ) otherlv_4= ')' ) )
            // InternalMyXenia.g:824:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' otherlv_2= '(' ( (lv_page_3_0= ruleRedirectPage ) ) otherlv_4= ')' )
            {
            // InternalMyXenia.g:824:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' otherlv_2= '(' ( (lv_page_3_0= ruleRedirectPage ) ) otherlv_4= ')' )
            // InternalMyXenia.g:825:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' otherlv_2= '(' ( (lv_page_3_0= ruleRedirectPage ) ) otherlv_4= ')'
            {
            // InternalMyXenia.g:825:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyXenia.g:826:4: (otherlv_0= RULE_ID )
            {
            // InternalMyXenia.g:826:4: (otherlv_0= RULE_ID )
            // InternalMyXenia.g:827:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkedPropertyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getLinkedPropertyAccess().getNameSiteCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkedPropertyAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkedPropertyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyXenia.g:846:3: ( (lv_page_3_0= ruleRedirectPage ) )
            // InternalMyXenia.g:847:4: (lv_page_3_0= ruleRedirectPage )
            {
            // InternalMyXenia.g:847:4: (lv_page_3_0= ruleRedirectPage )
            // InternalMyXenia.g:848:5: lv_page_3_0= ruleRedirectPage
            {

            					newCompositeNode(grammarAccess.getLinkedPropertyAccess().getPageRedirectPageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_page_3_0=ruleRedirectPage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkedPropertyRule());
            					}
            					set(
            						current,
            						"page",
            						lv_page_3_0,
            						"org.xtext.example.myxenia.MyXenia.RedirectPage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkedPropertyAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleLinkedProperty"


    // $ANTLR start "entryRuleRedirectPage"
    // InternalMyXenia.g:873:1: entryRuleRedirectPage returns [EObject current=null] : iv_ruleRedirectPage= ruleRedirectPage EOF ;
    public final EObject entryRuleRedirectPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirectPage = null;


        try {
            // InternalMyXenia.g:873:53: (iv_ruleRedirectPage= ruleRedirectPage EOF )
            // InternalMyXenia.g:874:2: iv_ruleRedirectPage= ruleRedirectPage EOF
            {
             newCompositeNode(grammarAccess.getRedirectPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedirectPage=ruleRedirectPage();

            state._fsp--;

             current =iv_ruleRedirectPage; 
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
    // $ANTLR end "entryRuleRedirectPage"


    // $ANTLR start "ruleRedirectPage"
    // InternalMyXenia.g:880:1: ruleRedirectPage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRedirectPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyXenia.g:886:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalMyXenia.g:887:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalMyXenia.g:887:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalMyXenia.g:888:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalMyXenia.g:888:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyXenia.g:889:4: (otherlv_0= RULE_ID )
            {
            // InternalMyXenia.g:889:4: (otherlv_0= RULE_ID )
            // InternalMyXenia.g:890:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRedirectPageRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getRedirectPageAccess().getSiteSiteCrossReference_0_0());
            				

            }


            }

            // InternalMyXenia.g:901:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyXenia.g:902:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRedirectPageAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyXenia.g:906:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalMyXenia.g:907:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMyXenia.g:907:5: (otherlv_2= RULE_ID )
            	    // InternalMyXenia.g:908:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRedirectPageRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    						newLeafNode(otherlv_2, grammarAccess.getRedirectPageAccess().getSiteSiteCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleRedirectPage"


    // $ANTLR start "ruleMode"
    // InternalMyXenia.g:924:1: ruleMode returns [Enumerator current=null] : ( (enumLiteral_0= 'development' ) | (enumLiteral_1= 'production' ) ) ;
    public final Enumerator ruleMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyXenia.g:930:2: ( ( (enumLiteral_0= 'development' ) | (enumLiteral_1= 'production' ) ) )
            // InternalMyXenia.g:931:2: ( (enumLiteral_0= 'development' ) | (enumLiteral_1= 'production' ) )
            {
            // InternalMyXenia.g:931:2: ( (enumLiteral_0= 'development' ) | (enumLiteral_1= 'production' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyXenia.g:932:3: (enumLiteral_0= 'development' )
                    {
                    // InternalMyXenia.g:932:3: (enumLiteral_0= 'development' )
                    // InternalMyXenia.g:933:4: enumLiteral_0= 'development'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getModeAccess().getDEVEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModeAccess().getDEVEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyXenia.g:940:3: (enumLiteral_1= 'production' )
                    {
                    // InternalMyXenia.g:940:3: (enumLiteral_1= 'production' )
                    // InternalMyXenia.g:941:4: enumLiteral_1= 'production'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getModeAccess().getPRODEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModeAccess().getPRODEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMode"


    // $ANTLR start "ruleInfoEntry"
    // InternalMyXenia.g:951:1: ruleInfoEntry returns [Enumerator current=null] : ( (enumLiteral_0= 'mod' ) | (enumLiteral_1= 'freq' ) | (enumLiteral_2= 'prio' ) ) ;
    public final Enumerator ruleInfoEntry() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyXenia.g:957:2: ( ( (enumLiteral_0= 'mod' ) | (enumLiteral_1= 'freq' ) | (enumLiteral_2= 'prio' ) ) )
            // InternalMyXenia.g:958:2: ( (enumLiteral_0= 'mod' ) | (enumLiteral_1= 'freq' ) | (enumLiteral_2= 'prio' ) )
            {
            // InternalMyXenia.g:958:2: ( (enumLiteral_0= 'mod' ) | (enumLiteral_1= 'freq' ) | (enumLiteral_2= 'prio' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyXenia.g:959:3: (enumLiteral_0= 'mod' )
                    {
                    // InternalMyXenia.g:959:3: (enumLiteral_0= 'mod' )
                    // InternalMyXenia.g:960:4: enumLiteral_0= 'mod'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getInfoEntryAccess().getMODEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInfoEntryAccess().getMODEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyXenia.g:967:3: (enumLiteral_1= 'freq' )
                    {
                    // InternalMyXenia.g:967:3: (enumLiteral_1= 'freq' )
                    // InternalMyXenia.g:968:4: enumLiteral_1= 'freq'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getInfoEntryAccess().getFREQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInfoEntryAccess().getFREQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyXenia.g:975:3: (enumLiteral_2= 'prio' )
                    {
                    // InternalMyXenia.g:975:3: (enumLiteral_2= 'prio' )
                    // InternalMyXenia.g:976:4: enumLiteral_2= 'prio'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getInfoEntryAccess().getPRIOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getInfoEntryAccess().getPRIOEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleInfoEntry"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000061A0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});

}