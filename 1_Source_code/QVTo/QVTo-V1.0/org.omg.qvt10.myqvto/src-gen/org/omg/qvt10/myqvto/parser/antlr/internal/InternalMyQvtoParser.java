package org.omg.qvt10.myqvto.parser.antlr.internal;

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
import org.omg.qvt10.myqvto.services.MyQvtoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyQvtoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_MULTIPLICITYRANGE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'from'", "'import'", "','", "'*'", "';'", "'modeltype'", "'uses'", "'where'", "'='", "'{'", "'}'", "'intermediate'", "'tag'", "'typedef'", "'['", "']'", "'('", "')'", "'::'", "':'", "'@'", "':='", "'::='", "'Dict'", "'Tuple'", "'init'", "'end'", "'population'", "'transformation'", "'refines'", "'access'", "'extends'", "'when'", "'mapping'", "'constructor'", "'main'", "'library'", "'metamodel'", "'package'", "'enum'", "'datatype'", "'primitive'", "'exception'", "'class'", "'opposites'", "'~'", "'<<'", "'>>'", "'.'", "'in'", "'inout'", "'out'", "'Collection'", "'Set'", "'OrderedSet'", "'Sequence'", "'Bag'", "'List'", "'blackbox'", "'abstract'", "'static'", "'helper'", "'query'", "'inherits'", "'merges'", "'disjuncts'", "'derived'", "'literal'", "'configuration'", "'property'", "'composes'", "'references'", "'readonly'"
    };
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


        public InternalMyQvtoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyQvtoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyQvtoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyQvto.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private MyQvtoGrammarAccess grammarAccess;

        public InternalMyQvtoParser(TokenStream input, MyQvtoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TopLevelGO";
       	}

       	@Override
       	protected MyQvtoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTopLevelGO"
    // InternalMyQvto.g:71:1: entryRuleTopLevelGO returns [EObject current=null] : iv_ruleTopLevelGO= ruleTopLevelGO EOF ;
    public final EObject entryRuleTopLevelGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelGO = null;


        try {
            // InternalMyQvto.g:71:51: (iv_ruleTopLevelGO= ruleTopLevelGO EOF )
            // InternalMyQvto.g:72:2: iv_ruleTopLevelGO= ruleTopLevelGO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelGORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelGO=ruleTopLevelGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelGO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTopLevelGO"


    // $ANTLR start "ruleTopLevelGO"
    // InternalMyQvto.g:78:1: ruleTopLevelGO returns [EObject current=null] : ( () ( (lv_moduleimport_1_0= ruleModuleImport ) )* ( (lv_unit_element_2_0= ruleModule ) )* ) ;
    public final EObject ruleTopLevelGO() throws RecognitionException {
        EObject current = null;

        EObject lv_moduleimport_1_0 = null;

        EObject lv_unit_element_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:84:2: ( ( () ( (lv_moduleimport_1_0= ruleModuleImport ) )* ( (lv_unit_element_2_0= ruleModule ) )* ) )
            // InternalMyQvto.g:85:2: ( () ( (lv_moduleimport_1_0= ruleModuleImport ) )* ( (lv_unit_element_2_0= ruleModule ) )* )
            {
            // InternalMyQvto.g:85:2: ( () ( (lv_moduleimport_1_0= ruleModuleImport ) )* ( (lv_unit_element_2_0= ruleModule ) )* )
            // InternalMyQvto.g:86:3: () ( (lv_moduleimport_1_0= ruleModuleImport ) )* ( (lv_unit_element_2_0= ruleModule ) )*
            {
            // InternalMyQvto.g:86:3: ()
            // InternalMyQvto.g:87:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTopLevelGOAccess().getTopLevelGOAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:96:3: ( (lv_moduleimport_1_0= ruleModuleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyQvto.g:97:4: (lv_moduleimport_1_0= ruleModuleImport )
            	    {
            	    // InternalMyQvto.g:97:4: (lv_moduleimport_1_0= ruleModuleImport )
            	    // InternalMyQvto.g:98:5: lv_moduleimport_1_0= ruleModuleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTopLevelGOAccess().getModuleimportModuleImportParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_moduleimport_1_0=ruleModuleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTopLevelGORule());
            	      					}
            	      					add(
            	      						current,
            	      						"moduleimport",
            	      						lv_moduleimport_1_0,
            	      						"org.omg.qvt10.myqvto.MyQvto.ModuleImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyQvto.g:115:3: ( (lv_unit_element_2_0= ruleModule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||(LA2_0>=23 && LA2_0<=25)||LA2_0==40||LA2_0==42||(LA2_0>=45 && LA2_0<=50)||(LA2_0>=52 && LA2_0<=55)||(LA2_0>=70 && LA2_0<=74)||(LA2_0>=78 && LA2_0<=81)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyQvto.g:116:4: (lv_unit_element_2_0= ruleModule )
            	    {
            	    // InternalMyQvto.g:116:4: (lv_unit_element_2_0= ruleModule )
            	    // InternalMyQvto.g:117:5: lv_unit_element_2_0= ruleModule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTopLevelGOAccess().getUnit_elementModuleParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_unit_element_2_0=ruleModule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTopLevelGORule());
            	      					}
            	      					add(
            	      						current,
            	      						"unit_element",
            	      						lv_unit_element_2_0,
            	      						"org.omg.qvt10.myqvto.MyQvto.Module");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTopLevelGO"


    // $ANTLR start "entryRuleModule"
    // InternalMyQvto.g:138:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalMyQvto.g:138:47: (iv_ruleModule= ruleModule EOF )
            // InternalMyQvto.g:139:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalMyQvto.g:145:1: ruleModule returns [EObject current=null] : (this_Helper_0= ruleHelper | this_OperationalTransformation_1= ruleOperationalTransformation | this_MappingOperation_2= ruleMappingOperation | this_Constructor_3= ruleConstructor | this_ContextualProperty_4= ruleContextualProperty | this_EntryOperation_5= ruleEntryOperation | this_Library_6= ruleLibrary | this_ModelType_7= ruleModelType | this_TagGO_8= ruleTagGO | this_MetaModelGO_9= ruleMetaModelGO | this_AccessDecl_10= ruleAccessDecl | this_TypeDef_11= ruleTypeDef | this_ClassifierGO_12= ruleClassifierGO ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        EObject this_Helper_0 = null;

        EObject this_OperationalTransformation_1 = null;

        EObject this_MappingOperation_2 = null;

        EObject this_Constructor_3 = null;

        EObject this_ContextualProperty_4 = null;

        EObject this_EntryOperation_5 = null;

        EObject this_Library_6 = null;

        EObject this_ModelType_7 = null;

        EObject this_TagGO_8 = null;

        EObject this_MetaModelGO_9 = null;

        EObject this_AccessDecl_10 = null;

        EObject this_TypeDef_11 = null;

        EObject this_ClassifierGO_12 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:151:2: ( (this_Helper_0= ruleHelper | this_OperationalTransformation_1= ruleOperationalTransformation | this_MappingOperation_2= ruleMappingOperation | this_Constructor_3= ruleConstructor | this_ContextualProperty_4= ruleContextualProperty | this_EntryOperation_5= ruleEntryOperation | this_Library_6= ruleLibrary | this_ModelType_7= ruleModelType | this_TagGO_8= ruleTagGO | this_MetaModelGO_9= ruleMetaModelGO | this_AccessDecl_10= ruleAccessDecl | this_TypeDef_11= ruleTypeDef | this_ClassifierGO_12= ruleClassifierGO ) )
            // InternalMyQvto.g:152:2: (this_Helper_0= ruleHelper | this_OperationalTransformation_1= ruleOperationalTransformation | this_MappingOperation_2= ruleMappingOperation | this_Constructor_3= ruleConstructor | this_ContextualProperty_4= ruleContextualProperty | this_EntryOperation_5= ruleEntryOperation | this_Library_6= ruleLibrary | this_ModelType_7= ruleModelType | this_TagGO_8= ruleTagGO | this_MetaModelGO_9= ruleMetaModelGO | this_AccessDecl_10= ruleAccessDecl | this_TypeDef_11= ruleTypeDef | this_ClassifierGO_12= ruleClassifierGO )
            {
            // InternalMyQvto.g:152:2: (this_Helper_0= ruleHelper | this_OperationalTransformation_1= ruleOperationalTransformation | this_MappingOperation_2= ruleMappingOperation | this_Constructor_3= ruleConstructor | this_ContextualProperty_4= ruleContextualProperty | this_EntryOperation_5= ruleEntryOperation | this_Library_6= ruleLibrary | this_ModelType_7= ruleModelType | this_TagGO_8= ruleTagGO | this_MetaModelGO_9= ruleMetaModelGO | this_AccessDecl_10= ruleAccessDecl | this_TypeDef_11= ruleTypeDef | this_ClassifierGO_12= ruleClassifierGO )
            int alt3=13;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyQvto.g:153:3: this_Helper_0= ruleHelper
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getHelperParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Helper_0=ruleHelper();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Helper_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:165:3: this_OperationalTransformation_1= ruleOperationalTransformation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getOperationalTransformationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OperationalTransformation_1=ruleOperationalTransformation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OperationalTransformation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:177:3: this_MappingOperation_2= ruleMappingOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getMappingOperationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MappingOperation_2=ruleMappingOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MappingOperation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:189:3: this_Constructor_3= ruleConstructor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getConstructorParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Constructor_3=ruleConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Constructor_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyQvto.g:201:3: this_ContextualProperty_4= ruleContextualProperty
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getContextualPropertyParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContextualProperty_4=ruleContextualProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContextualProperty_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyQvto.g:213:3: this_EntryOperation_5= ruleEntryOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getEntryOperationParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EntryOperation_5=ruleEntryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EntryOperation_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMyQvto.g:225:3: this_Library_6= ruleLibrary
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getLibraryParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Library_6=ruleLibrary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Library_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMyQvto.g:237:3: this_ModelType_7= ruleModelType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getModelTypeParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ModelType_7=ruleModelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModelType_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalMyQvto.g:249:3: this_TagGO_8= ruleTagGO
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getTagGOParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TagGO_8=ruleTagGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TagGO_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalMyQvto.g:261:3: this_MetaModelGO_9= ruleMetaModelGO
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getMetaModelGOParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MetaModelGO_9=ruleMetaModelGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MetaModelGO_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalMyQvto.g:273:3: this_AccessDecl_10= ruleAccessDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getAccessDeclParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AccessDecl_10=ruleAccessDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AccessDecl_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalMyQvto.g:285:3: this_TypeDef_11= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getTypeDefParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeDef_11=ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeDef_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalMyQvto.g:297:3: this_ClassifierGO_12= ruleClassifierGO
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getClassifierGOParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassifierGO_12=ruleClassifierGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassifierGO_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleImperativeOperation"
    // InternalMyQvto.g:312:1: entryRuleImperativeOperation returns [EObject current=null] : iv_ruleImperativeOperation= ruleImperativeOperation EOF ;
    public final EObject entryRuleImperativeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeOperation = null;


        try {
            // InternalMyQvto.g:312:60: (iv_ruleImperativeOperation= ruleImperativeOperation EOF )
            // InternalMyQvto.g:313:2: iv_ruleImperativeOperation= ruleImperativeOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImperativeOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImperativeOperation=ruleImperativeOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImperativeOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImperativeOperation"


    // $ANTLR start "ruleImperativeOperation"
    // InternalMyQvto.g:319:1: ruleImperativeOperation returns [EObject current=null] : (this_Helper_0= ruleHelper | this_MappingOperation_1= ruleMappingOperation | this_Constructor_2= ruleConstructor | this_ContextualProperty_3= ruleContextualProperty | this_EntryOperation_4= ruleEntryOperation | this_TagGO_5= ruleTagGO | this_AccessDecl_6= ruleAccessDecl | this_TypeDef_7= ruleTypeDef | this_ClassifierGO_8= ruleClassifierGO ) ;
    public final EObject ruleImperativeOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Helper_0 = null;

        EObject this_MappingOperation_1 = null;

        EObject this_Constructor_2 = null;

        EObject this_ContextualProperty_3 = null;

        EObject this_EntryOperation_4 = null;

        EObject this_TagGO_5 = null;

        EObject this_AccessDecl_6 = null;

        EObject this_TypeDef_7 = null;

        EObject this_ClassifierGO_8 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:325:2: ( (this_Helper_0= ruleHelper | this_MappingOperation_1= ruleMappingOperation | this_Constructor_2= ruleConstructor | this_ContextualProperty_3= ruleContextualProperty | this_EntryOperation_4= ruleEntryOperation | this_TagGO_5= ruleTagGO | this_AccessDecl_6= ruleAccessDecl | this_TypeDef_7= ruleTypeDef | this_ClassifierGO_8= ruleClassifierGO ) )
            // InternalMyQvto.g:326:2: (this_Helper_0= ruleHelper | this_MappingOperation_1= ruleMappingOperation | this_Constructor_2= ruleConstructor | this_ContextualProperty_3= ruleContextualProperty | this_EntryOperation_4= ruleEntryOperation | this_TagGO_5= ruleTagGO | this_AccessDecl_6= ruleAccessDecl | this_TypeDef_7= ruleTypeDef | this_ClassifierGO_8= ruleClassifierGO )
            {
            // InternalMyQvto.g:326:2: (this_Helper_0= ruleHelper | this_MappingOperation_1= ruleMappingOperation | this_Constructor_2= ruleConstructor | this_ContextualProperty_3= ruleContextualProperty | this_EntryOperation_4= ruleEntryOperation | this_TagGO_5= ruleTagGO | this_AccessDecl_6= ruleAccessDecl | this_TypeDef_7= ruleTypeDef | this_ClassifierGO_8= ruleClassifierGO )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMyQvto.g:327:3: this_Helper_0= ruleHelper
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getHelperParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Helper_0=ruleHelper();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Helper_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:339:3: this_MappingOperation_1= ruleMappingOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getMappingOperationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MappingOperation_1=ruleMappingOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MappingOperation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:351:3: this_Constructor_2= ruleConstructor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getConstructorParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Constructor_2=ruleConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Constructor_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:363:3: this_ContextualProperty_3= ruleContextualProperty
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getContextualPropertyParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContextualProperty_3=ruleContextualProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContextualProperty_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyQvto.g:375:3: this_EntryOperation_4= ruleEntryOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getEntryOperationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EntryOperation_4=ruleEntryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EntryOperation_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyQvto.g:387:3: this_TagGO_5= ruleTagGO
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getTagGOParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TagGO_5=ruleTagGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TagGO_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMyQvto.g:399:3: this_AccessDecl_6= ruleAccessDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getAccessDeclParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AccessDecl_6=ruleAccessDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AccessDecl_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMyQvto.g:411:3: this_TypeDef_7= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getTypeDefParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeDef_7=ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeDef_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalMyQvto.g:423:3: this_ClassifierGO_8= ruleClassifierGO
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getClassifierGOParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassifierGO_8=ruleClassifierGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassifierGO_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImperativeOperation"


    // $ANTLR start "entryRuleModuleImport"
    // InternalMyQvto.g:438:1: entryRuleModuleImport returns [EObject current=null] : iv_ruleModuleImport= ruleModuleImport EOF ;
    public final EObject entryRuleModuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleImport = null;


        try {
            // InternalMyQvto.g:438:53: (iv_ruleModuleImport= ruleModuleImport EOF )
            // InternalMyQvto.g:439:2: iv_ruleModuleImport= ruleModuleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModuleImport=ruleModuleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModuleImport"


    // $ANTLR start "ruleModuleImport"
    // InternalMyQvto.g:445:1: ruleModuleImport returns [EObject current=null] : ( (otherlv_0= 'from' ( (lv_unit_1_0= ruleUnitRefGO ) ) otherlv_2= 'import' ( ( ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )* ) | otherlv_6= '*' ) otherlv_7= ';' ) | (otherlv_8= 'import' ( (lv_unit_9_0= ruleUnitRefGO ) ) otherlv_10= ';' ) ) ;
    public final EObject ruleModuleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_identifier_3_0=null;
        Token otherlv_4=null;
        Token lv_identifier_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_unit_1_0 = null;

        EObject lv_unit_9_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:451:2: ( ( (otherlv_0= 'from' ( (lv_unit_1_0= ruleUnitRefGO ) ) otherlv_2= 'import' ( ( ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )* ) | otherlv_6= '*' ) otherlv_7= ';' ) | (otherlv_8= 'import' ( (lv_unit_9_0= ruleUnitRefGO ) ) otherlv_10= ';' ) ) )
            // InternalMyQvto.g:452:2: ( (otherlv_0= 'from' ( (lv_unit_1_0= ruleUnitRefGO ) ) otherlv_2= 'import' ( ( ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )* ) | otherlv_6= '*' ) otherlv_7= ';' ) | (otherlv_8= 'import' ( (lv_unit_9_0= ruleUnitRefGO ) ) otherlv_10= ';' ) )
            {
            // InternalMyQvto.g:452:2: ( (otherlv_0= 'from' ( (lv_unit_1_0= ruleUnitRefGO ) ) otherlv_2= 'import' ( ( ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )* ) | otherlv_6= '*' ) otherlv_7= ';' ) | (otherlv_8= 'import' ( (lv_unit_9_0= ruleUnitRefGO ) ) otherlv_10= ';' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyQvto.g:453:3: (otherlv_0= 'from' ( (lv_unit_1_0= ruleUnitRefGO ) ) otherlv_2= 'import' ( ( ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )* ) | otherlv_6= '*' ) otherlv_7= ';' )
                    {
                    // InternalMyQvto.g:453:3: (otherlv_0= 'from' ( (lv_unit_1_0= ruleUnitRefGO ) ) otherlv_2= 'import' ( ( ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )* ) | otherlv_6= '*' ) otherlv_7= ';' )
                    // InternalMyQvto.g:454:4: otherlv_0= 'from' ( (lv_unit_1_0= ruleUnitRefGO ) ) otherlv_2= 'import' ( ( ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )* ) | otherlv_6= '*' ) otherlv_7= ';'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getModuleImportAccess().getFromKeyword_0_0());
                      			
                    }
                    // InternalMyQvto.g:458:4: ( (lv_unit_1_0= ruleUnitRefGO ) )
                    // InternalMyQvto.g:459:5: (lv_unit_1_0= ruleUnitRefGO )
                    {
                    // InternalMyQvto.g:459:5: (lv_unit_1_0= ruleUnitRefGO )
                    // InternalMyQvto.g:460:6: lv_unit_1_0= ruleUnitRefGO
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModuleImportAccess().getUnitUnitRefGOParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_unit_1_0=ruleUnitRefGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModuleImportRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_1_0,
                      							"org.omg.qvt10.myqvto.MyQvto.UnitRefGO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getModuleImportAccess().getImportKeyword_0_2());
                      			
                    }
                    // InternalMyQvto.g:481:4: ( ( ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )* ) | otherlv_6= '*' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==15) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyQvto.g:482:5: ( ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )* )
                            {
                            // InternalMyQvto.g:482:5: ( ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )* )
                            // InternalMyQvto.g:483:6: ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )*
                            {
                            // InternalMyQvto.g:483:6: ( (lv_identifier_3_0= RULE_ID ) )
                            // InternalMyQvto.g:484:7: (lv_identifier_3_0= RULE_ID )
                            {
                            // InternalMyQvto.g:484:7: (lv_identifier_3_0= RULE_ID )
                            // InternalMyQvto.g:485:8: lv_identifier_3_0= RULE_ID
                            {
                            lv_identifier_3_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_identifier_3_0, grammarAccess.getModuleImportAccess().getIdentifierIDTerminalRuleCall_0_3_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getModuleImportRule());
                              								}
                              								addWithLastConsumed(
                              									current,
                              									"identifier",
                              									lv_identifier_3_0,
                              									"org.eclipse.xtext.common.Terminals.ID");
                              							
                            }

                            }


                            }

                            // InternalMyQvto.g:501:6: (otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==14) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalMyQvto.g:502:7: otherlv_4= ',' ( (lv_identifier_5_0= RULE_ID ) )
                            	    {
                            	    otherlv_4=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getModuleImportAccess().getCommaKeyword_0_3_0_1_0());
                            	      						
                            	    }
                            	    // InternalMyQvto.g:506:7: ( (lv_identifier_5_0= RULE_ID ) )
                            	    // InternalMyQvto.g:507:8: (lv_identifier_5_0= RULE_ID )
                            	    {
                            	    // InternalMyQvto.g:507:8: (lv_identifier_5_0= RULE_ID )
                            	    // InternalMyQvto.g:508:9: lv_identifier_5_0= RULE_ID
                            	    {
                            	    lv_identifier_5_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									newLeafNode(lv_identifier_5_0, grammarAccess.getModuleImportAccess().getIdentifierIDTerminalRuleCall_0_3_0_1_1_0());
                            	      								
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElement(grammarAccess.getModuleImportRule());
                            	      									}
                            	      									addWithLastConsumed(
                            	      										current,
                            	      										"identifier",
                            	      										lv_identifier_5_0,
                            	      										"org.eclipse.xtext.common.Terminals.ID");
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyQvto.g:527:5: otherlv_6= '*'
                            {
                            otherlv_6=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getModuleImportAccess().getAsteriskKeyword_0_3_1());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getModuleImportAccess().getSemicolonKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:538:3: (otherlv_8= 'import' ( (lv_unit_9_0= ruleUnitRefGO ) ) otherlv_10= ';' )
                    {
                    // InternalMyQvto.g:538:3: (otherlv_8= 'import' ( (lv_unit_9_0= ruleUnitRefGO ) ) otherlv_10= ';' )
                    // InternalMyQvto.g:539:4: otherlv_8= 'import' ( (lv_unit_9_0= ruleUnitRefGO ) ) otherlv_10= ';'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getModuleImportAccess().getImportKeyword_1_0());
                      			
                    }
                    // InternalMyQvto.g:543:4: ( (lv_unit_9_0= ruleUnitRefGO ) )
                    // InternalMyQvto.g:544:5: (lv_unit_9_0= ruleUnitRefGO )
                    {
                    // InternalMyQvto.g:544:5: (lv_unit_9_0= ruleUnitRefGO )
                    // InternalMyQvto.g:545:6: lv_unit_9_0= ruleUnitRefGO
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModuleImportAccess().getUnitUnitRefGOParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_unit_9_0=ruleUnitRefGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModuleImportRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_9_0,
                      							"org.omg.qvt10.myqvto.MyQvto.UnitRefGO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getModuleImportAccess().getSemicolonKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModuleImport"


    // $ANTLR start "entryRuleModelType"
    // InternalMyQvto.g:571:1: entryRuleModelType returns [EObject current=null] : iv_ruleModelType= ruleModelType EOF ;
    public final EObject entryRuleModelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelType = null;


        try {
            // InternalMyQvto.g:571:50: (iv_ruleModelType= ruleModelType EOF )
            // InternalMyQvto.g:572:2: iv_ruleModelType= ruleModelType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelType=ruleModelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModelType"


    // $ANTLR start "ruleModelType"
    // InternalMyQvto.g:578:1: ruleModelType returns [EObject current=null] : ( () otherlv_1= 'modeltype' ( (lv_name_2_0= RULE_ID ) ) ( (lv_compliance_kind_3_0= RULE_STRING ) )? otherlv_4= 'uses' ( (lv_packageref_list_5_0= rulePackageRefGO ) ) (otherlv_6= ',' ( (lv_packageref_list_7_0= rulePackageRefGO ) ) )* (otherlv_8= 'where' ( (lv_modeltype_where_9_0= ruleExpressionBlock ) ) )? otherlv_10= ';' ) ;
    public final EObject ruleModelType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_compliance_kind_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_packageref_list_5_0 = null;

        EObject lv_packageref_list_7_0 = null;

        EObject lv_modeltype_where_9_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:584:2: ( ( () otherlv_1= 'modeltype' ( (lv_name_2_0= RULE_ID ) ) ( (lv_compliance_kind_3_0= RULE_STRING ) )? otherlv_4= 'uses' ( (lv_packageref_list_5_0= rulePackageRefGO ) ) (otherlv_6= ',' ( (lv_packageref_list_7_0= rulePackageRefGO ) ) )* (otherlv_8= 'where' ( (lv_modeltype_where_9_0= ruleExpressionBlock ) ) )? otherlv_10= ';' ) )
            // InternalMyQvto.g:585:2: ( () otherlv_1= 'modeltype' ( (lv_name_2_0= RULE_ID ) ) ( (lv_compliance_kind_3_0= RULE_STRING ) )? otherlv_4= 'uses' ( (lv_packageref_list_5_0= rulePackageRefGO ) ) (otherlv_6= ',' ( (lv_packageref_list_7_0= rulePackageRefGO ) ) )* (otherlv_8= 'where' ( (lv_modeltype_where_9_0= ruleExpressionBlock ) ) )? otherlv_10= ';' )
            {
            // InternalMyQvto.g:585:2: ( () otherlv_1= 'modeltype' ( (lv_name_2_0= RULE_ID ) ) ( (lv_compliance_kind_3_0= RULE_STRING ) )? otherlv_4= 'uses' ( (lv_packageref_list_5_0= rulePackageRefGO ) ) (otherlv_6= ',' ( (lv_packageref_list_7_0= rulePackageRefGO ) ) )* (otherlv_8= 'where' ( (lv_modeltype_where_9_0= ruleExpressionBlock ) ) )? otherlv_10= ';' )
            // InternalMyQvto.g:586:3: () otherlv_1= 'modeltype' ( (lv_name_2_0= RULE_ID ) ) ( (lv_compliance_kind_3_0= RULE_STRING ) )? otherlv_4= 'uses' ( (lv_packageref_list_5_0= rulePackageRefGO ) ) (otherlv_6= ',' ( (lv_packageref_list_7_0= rulePackageRefGO ) ) )* (otherlv_8= 'where' ( (lv_modeltype_where_9_0= ruleExpressionBlock ) ) )? otherlv_10= ';'
            {
            // InternalMyQvto.g:586:3: ()
            // InternalMyQvto.g:587:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getModelTypeAccess().getModelTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModelTypeAccess().getModeltypeKeyword_1());
              		
            }
            // InternalMyQvto.g:600:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyQvto.g:601:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyQvto.g:601:4: (lv_name_2_0= RULE_ID )
            // InternalMyQvto.g:602:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getModelTypeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMyQvto.g:618:3: ( (lv_compliance_kind_3_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyQvto.g:619:4: (lv_compliance_kind_3_0= RULE_STRING )
                    {
                    // InternalMyQvto.g:619:4: (lv_compliance_kind_3_0= RULE_STRING )
                    // InternalMyQvto.g:620:5: lv_compliance_kind_3_0= RULE_STRING
                    {
                    lv_compliance_kind_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_compliance_kind_3_0, grammarAccess.getModelTypeAccess().getCompliance_kindSTRINGTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getModelTypeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"compliance_kind",
                      						lv_compliance_kind_3_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getModelTypeAccess().getUsesKeyword_4());
              		
            }
            // InternalMyQvto.g:640:3: ( (lv_packageref_list_5_0= rulePackageRefGO ) )
            // InternalMyQvto.g:641:4: (lv_packageref_list_5_0= rulePackageRefGO )
            {
            // InternalMyQvto.g:641:4: (lv_packageref_list_5_0= rulePackageRefGO )
            // InternalMyQvto.g:642:5: lv_packageref_list_5_0= rulePackageRefGO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelTypeAccess().getPackageref_listPackageRefGOParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_packageref_list_5_0=rulePackageRefGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelTypeRule());
              					}
              					add(
              						current,
              						"packageref_list",
              						lv_packageref_list_5_0,
              						"org.omg.qvt10.myqvto.MyQvto.PackageRefGO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:659:3: (otherlv_6= ',' ( (lv_packageref_list_7_0= rulePackageRefGO ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyQvto.g:660:4: otherlv_6= ',' ( (lv_packageref_list_7_0= rulePackageRefGO ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getModelTypeAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalMyQvto.g:664:4: ( (lv_packageref_list_7_0= rulePackageRefGO ) )
            	    // InternalMyQvto.g:665:5: (lv_packageref_list_7_0= rulePackageRefGO )
            	    {
            	    // InternalMyQvto.g:665:5: (lv_packageref_list_7_0= rulePackageRefGO )
            	    // InternalMyQvto.g:666:6: lv_packageref_list_7_0= rulePackageRefGO
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModelTypeAccess().getPackageref_listPackageRefGOParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_packageref_list_7_0=rulePackageRefGO();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModelTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"packageref_list",
            	      							lv_packageref_list_7_0,
            	      							"org.omg.qvt10.myqvto.MyQvto.PackageRefGO");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMyQvto.g:684:3: (otherlv_8= 'where' ( (lv_modeltype_where_9_0= ruleExpressionBlock ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyQvto.g:685:4: otherlv_8= 'where' ( (lv_modeltype_where_9_0= ruleExpressionBlock ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getModelTypeAccess().getWhereKeyword_7_0());
                      			
                    }
                    // InternalMyQvto.g:689:4: ( (lv_modeltype_where_9_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:690:5: (lv_modeltype_where_9_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:690:5: (lv_modeltype_where_9_0= ruleExpressionBlock )
                    // InternalMyQvto.g:691:6: lv_modeltype_where_9_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModelTypeAccess().getModeltype_whereExpressionBlockParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_modeltype_where_9_0=ruleExpressionBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModelTypeRule());
                      						}
                      						set(
                      							current,
                      							"modeltype_where",
                      							lv_modeltype_where_9_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ExpressionBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getModelTypeAccess().getSemicolonKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModelType"


    // $ANTLR start "entryRuleExpressionGO"
    // InternalMyQvto.g:717:1: entryRuleExpressionGO returns [EObject current=null] : iv_ruleExpressionGO= ruleExpressionGO EOF ;
    public final EObject entryRuleExpressionGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionGO = null;


        try {
            // InternalMyQvto.g:717:53: (iv_ruleExpressionGO= ruleExpressionGO EOF )
            // InternalMyQvto.g:718:2: iv_ruleExpressionGO= ruleExpressionGO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionGORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionGO=ruleExpressionGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionGO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionGO"


    // $ANTLR start "ruleExpressionGO"
    // InternalMyQvto.g:724:1: ruleExpressionGO returns [EObject current=null] : ( () ( (lv_dummyContent_1_0= ruleEString ) )* ) ;
    public final EObject ruleExpressionGO() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dummyContent_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:730:2: ( ( () ( (lv_dummyContent_1_0= ruleEString ) )* ) )
            // InternalMyQvto.g:731:2: ( () ( (lv_dummyContent_1_0= ruleEString ) )* )
            {
            // InternalMyQvto.g:731:2: ( () ( (lv_dummyContent_1_0= ruleEString ) )* )
            // InternalMyQvto.g:732:3: () ( (lv_dummyContent_1_0= ruleEString ) )*
            {
            // InternalMyQvto.g:732:3: ()
            // InternalMyQvto.g:733:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExpressionGOAccess().getExpressionGOAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:742:3: ( (lv_dummyContent_1_0= ruleEString ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyQvto.g:743:4: (lv_dummyContent_1_0= ruleEString )
            	    {
            	    // InternalMyQvto.g:743:4: (lv_dummyContent_1_0= ruleEString )
            	    // InternalMyQvto.g:744:5: lv_dummyContent_1_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getExpressionGOAccess().getDummyContentEStringParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_dummyContent_1_0=ruleEString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getExpressionGORule());
            	      					}
            	      					add(
            	      						current,
            	      						"dummyContent",
            	      						lv_dummyContent_1_0,
            	      						"org.omg.qvt10.myqvto.MyQvto.EString");
            	      					afterParserOrEnumRuleCall();
            	      				
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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionGO"


    // $ANTLR start "entryRuleHelper"
    // InternalMyQvto.g:765:1: entryRuleHelper returns [EObject current=null] : iv_ruleHelper= ruleHelper EOF ;
    public final EObject entryRuleHelper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelper = null;


        try {
            // InternalMyQvto.g:765:47: (iv_ruleHelper= ruleHelper EOF )
            // InternalMyQvto.g:766:2: iv_ruleHelper= ruleHelper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHelperRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHelper=ruleHelper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHelper; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHelper"


    // $ANTLR start "ruleHelper"
    // InternalMyQvto.g:772:1: ruleHelper returns [EObject current=null] : ( ( (lv_helper_header_0_0= ruleHelperHeader ) ) (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) ) ) ;
    public final EObject ruleHelper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_helper_header_0_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_block_5_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:778:2: ( ( ( (lv_helper_header_0_0= ruleHelperHeader ) ) (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) ) ) )
            // InternalMyQvto.g:779:2: ( ( (lv_helper_header_0_0= ruleHelperHeader ) ) (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) ) )
            {
            // InternalMyQvto.g:779:2: ( ( (lv_helper_header_0_0= ruleHelperHeader ) ) (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) ) )
            // InternalMyQvto.g:780:3: ( (lv_helper_header_0_0= ruleHelperHeader ) ) (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) )
            {
            // InternalMyQvto.g:780:3: ( (lv_helper_header_0_0= ruleHelperHeader ) )
            // InternalMyQvto.g:781:4: (lv_helper_header_0_0= ruleHelperHeader )
            {
            // InternalMyQvto.g:781:4: (lv_helper_header_0_0= ruleHelperHeader )
            // InternalMyQvto.g:782:5: lv_helper_header_0_0= ruleHelperHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHelperAccess().getHelper_headerHelperHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_helper_header_0_0=ruleHelperHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHelperRule());
              					}
              					set(
              						current,
              						"helper_header",
              						lv_helper_header_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.HelperHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:799:3: (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt13=1;
                }
                break;
            case 20:
                {
                alt13=2;
                }
                break;
            case 21:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyQvto.g:800:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getHelperAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:805:4: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' )
                    {
                    // InternalMyQvto.g:805:4: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' )
                    // InternalMyQvto.g:806:5: otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getHelperAccess().getEqualsSignKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:810:5: ( (lv_expression_3_0= ruleExpressionGO ) )
                    // InternalMyQvto.g:811:6: (lv_expression_3_0= ruleExpressionGO )
                    {
                    // InternalMyQvto.g:811:6: (lv_expression_3_0= ruleExpressionGO )
                    // InternalMyQvto.g:812:7: lv_expression_3_0= ruleExpressionGO
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getHelperAccess().getExpressionExpressionGOParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_9);
                    lv_expression_3_0=ruleExpressionGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getHelperRule());
                      							}
                      							set(
                      								current,
                      								"expression",
                      								lv_expression_3_0,
                      								"org.omg.qvt10.myqvto.MyQvto.ExpressionGO");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getHelperAccess().getSemicolonKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:835:4: ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? )
                    {
                    // InternalMyQvto.g:835:4: ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? )
                    // InternalMyQvto.g:836:5: ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )?
                    {
                    // InternalMyQvto.g:836:5: ( (lv_expression_block_5_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:837:6: (lv_expression_block_5_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:837:6: (lv_expression_block_5_0= ruleExpressionBlock )
                    // InternalMyQvto.g:838:7: lv_expression_block_5_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getHelperAccess().getExpression_blockExpressionBlockParserRuleCall_1_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_17);
                    lv_expression_block_5_0=ruleExpressionBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getHelperRule());
                      							}
                      							set(
                      								current,
                      								"expression_block",
                      								lv_expression_block_5_0,
                      								"org.omg.qvt10.myqvto.MyQvto.ExpressionBlock");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyQvto.g:855:5: (otherlv_6= ';' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==16) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyQvto.g:856:6: otherlv_6= ';'
                            {
                            otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getHelperAccess().getSemicolonKeyword_1_2_1());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHelper"


    // $ANTLR start "entryRuleOperationalTransformation"
    // InternalMyQvto.g:867:1: entryRuleOperationalTransformation returns [EObject current=null] : iv_ruleOperationalTransformation= ruleOperationalTransformation EOF ;
    public final EObject entryRuleOperationalTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationalTransformation = null;


        try {
            // InternalMyQvto.g:867:66: (iv_ruleOperationalTransformation= ruleOperationalTransformation EOF )
            // InternalMyQvto.g:868:2: iv_ruleOperationalTransformation= ruleOperationalTransformation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationalTransformationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationalTransformation=ruleOperationalTransformation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationalTransformation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationalTransformation"


    // $ANTLR start "ruleOperationalTransformation"
    // InternalMyQvto.g:874:1: ruleOperationalTransformation returns [EObject current=null] : ( ( (lv_transformation_h_0_0= ruleTransformationHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) ;
    public final EObject ruleOperationalTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_transformation_h_0_0 = null;

        EObject lv_module_element_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:880:2: ( ( ( (lv_transformation_h_0_0= ruleTransformationHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) )
            // InternalMyQvto.g:881:2: ( ( (lv_transformation_h_0_0= ruleTransformationHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            {
            // InternalMyQvto.g:881:2: ( ( (lv_transformation_h_0_0= ruleTransformationHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            // InternalMyQvto.g:882:3: ( (lv_transformation_h_0_0= ruleTransformationHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            {
            // InternalMyQvto.g:882:3: ( (lv_transformation_h_0_0= ruleTransformationHeader ) )
            // InternalMyQvto.g:883:4: (lv_transformation_h_0_0= ruleTransformationHeader )
            {
            // InternalMyQvto.g:883:4: (lv_transformation_h_0_0= ruleTransformationHeader )
            // InternalMyQvto.g:884:5: lv_transformation_h_0_0= ruleTransformationHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationalTransformationAccess().getTransformation_hTransformationHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_transformation_h_0_0=ruleTransformationHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationalTransformationRule());
              					}
              					set(
              						current,
              						"transformation_h",
              						lv_transformation_h_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.TransformationHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:901:3: (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            else if ( (LA16_0==21) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyQvto.g:902:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOperationalTransformationAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:907:4: (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    {
                    // InternalMyQvto.g:907:4: (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    // InternalMyQvto.g:908:5: otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )?
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getOperationalTransformationAccess().getLeftCurlyBracketKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:912:5: ( (lv_module_element_3_0= ruleImperativeOperation ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=23 && LA14_0<=25)||LA14_0==42||(LA14_0>=45 && LA14_0<=47)||(LA14_0>=52 && LA14_0<=55)||(LA14_0>=70 && LA14_0<=74)||(LA14_0>=78 && LA14_0<=81)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyQvto.g:913:6: (lv_module_element_3_0= ruleImperativeOperation )
                    	    {
                    	    // InternalMyQvto.g:913:6: (lv_module_element_3_0= ruleImperativeOperation )
                    	    // InternalMyQvto.g:914:7: lv_module_element_3_0= ruleImperativeOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperationalTransformationAccess().getModule_elementImperativeOperationParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_module_element_3_0=ruleImperativeOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperationalTransformationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"module_element",
                    	      								lv_module_element_3_0,
                    	      								"org.omg.qvt10.myqvto.MyQvto.ImperativeOperation");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getOperationalTransformationAccess().getRightCurlyBracketKeyword_1_1_2());
                      				
                    }
                    // InternalMyQvto.g:935:5: (otherlv_5= ';' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==16) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyQvto.g:936:6: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getOperationalTransformationAccess().getSemicolonKeyword_1_1_3());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperationalTransformation"


    // $ANTLR start "entryRuleMappingOperation"
    // InternalMyQvto.g:947:1: entryRuleMappingOperation returns [EObject current=null] : iv_ruleMappingOperation= ruleMappingOperation EOF ;
    public final EObject entryRuleMappingOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingOperation = null;


        try {
            // InternalMyQvto.g:947:57: (iv_ruleMappingOperation= ruleMappingOperation EOF )
            // InternalMyQvto.g:948:2: iv_ruleMappingOperation= ruleMappingOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMappingOperation=ruleMappingOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMappingOperation"


    // $ANTLR start "ruleMappingOperation"
    // InternalMyQvto.g:954:1: ruleMappingOperation returns [EObject current=null] : ( ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) ) ) ;
    public final EObject ruleMappingOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_mapping_full_header_0_0 = null;

        EObject lv_mapping_body_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:960:2: ( ( ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) ) ) )
            // InternalMyQvto.g:961:2: ( ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            {
            // InternalMyQvto.g:961:2: ( ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            // InternalMyQvto.g:962:3: ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) )
            {
            // InternalMyQvto.g:962:3: ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) )
            // InternalMyQvto.g:963:4: (lv_mapping_full_header_0_0= ruleMappingFullHeader )
            {
            // InternalMyQvto.g:963:4: (lv_mapping_full_header_0_0= ruleMappingFullHeader )
            // InternalMyQvto.g:964:5: lv_mapping_full_header_0_0= ruleMappingFullHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingOperationAccess().getMapping_full_headerMappingFullHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_mapping_full_header_0_0=ruleMappingFullHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMappingOperationRule());
              					}
              					set(
              						current,
              						"mapping_full_header",
              						lv_mapping_full_header_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.MappingFullHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:981:3: (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            else if ( (LA18_0==21) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyQvto.g:982:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMappingOperationAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:987:4: (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? )
                    {
                    // InternalMyQvto.g:987:4: (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? )
                    // InternalMyQvto.g:988:5: otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )?
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMappingOperationAccess().getLeftCurlyBracketKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:992:5: ( (lv_mapping_body_3_0= ruleMappingBody ) )
                    // InternalMyQvto.g:993:6: (lv_mapping_body_3_0= ruleMappingBody )
                    {
                    // InternalMyQvto.g:993:6: (lv_mapping_body_3_0= ruleMappingBody )
                    // InternalMyQvto.g:994:7: lv_mapping_body_3_0= ruleMappingBody
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMappingOperationAccess().getMapping_bodyMappingBodyParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_mapping_body_3_0=ruleMappingBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMappingOperationRule());
                      							}
                      							set(
                      								current,
                      								"mapping_body",
                      								lv_mapping_body_3_0,
                      								"org.omg.qvt10.myqvto.MyQvto.MappingBody");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getMappingOperationAccess().getRightCurlyBracketKeyword_1_1_2());
                      				
                    }
                    // InternalMyQvto.g:1015:5: (otherlv_5= ';' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==16) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyQvto.g:1016:6: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getMappingOperationAccess().getSemicolonKeyword_1_1_3());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMappingOperation"


    // $ANTLR start "entryRuleConstructor"
    // InternalMyQvto.g:1027:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalMyQvto.g:1027:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalMyQvto.g:1028:2: iv_ruleConstructor= ruleConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalMyQvto.g:1034:1: ruleConstructor returns [EObject current=null] : ( ( (lv_constructor_header_0_0= ruleConstructorHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_constructor_header_0_0 = null;

        EObject lv_expression_block_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1040:2: ( ( ( (lv_constructor_header_0_0= ruleConstructorHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) ) )
            // InternalMyQvto.g:1041:2: ( ( (lv_constructor_header_0_0= ruleConstructorHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) )
            {
            // InternalMyQvto.g:1041:2: ( ( (lv_constructor_header_0_0= ruleConstructorHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) )
            // InternalMyQvto.g:1042:3: ( (lv_constructor_header_0_0= ruleConstructorHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) )
            {
            // InternalMyQvto.g:1042:3: ( (lv_constructor_header_0_0= ruleConstructorHeader ) )
            // InternalMyQvto.g:1043:4: (lv_constructor_header_0_0= ruleConstructorHeader )
            {
            // InternalMyQvto.g:1043:4: (lv_constructor_header_0_0= ruleConstructorHeader )
            // InternalMyQvto.g:1044:5: lv_constructor_header_0_0= ruleConstructorHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstructorAccess().getConstructor_headerConstructorHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_constructor_header_0_0=ruleConstructorHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstructorRule());
              					}
              					set(
              						current,
              						"constructor_header",
              						lv_constructor_header_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.ConstructorHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1061:3: (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            else if ( (LA20_0==21) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyQvto.g:1062:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1067:4: ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? )
                    {
                    // InternalMyQvto.g:1067:4: ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? )
                    // InternalMyQvto.g:1068:5: ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )?
                    {
                    // InternalMyQvto.g:1068:5: ( (lv_expression_block_2_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:1069:6: (lv_expression_block_2_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:1069:6: (lv_expression_block_2_0= ruleExpressionBlock )
                    // InternalMyQvto.g:1070:7: lv_expression_block_2_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getConstructorAccess().getExpression_blockExpressionBlockParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_17);
                    lv_expression_block_2_0=ruleExpressionBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getConstructorRule());
                      							}
                      							set(
                      								current,
                      								"expression_block",
                      								lv_expression_block_2_0,
                      								"org.omg.qvt10.myqvto.MyQvto.ExpressionBlock");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyQvto.g:1087:5: (otherlv_3= ';' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==16) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMyQvto.g:1088:6: otherlv_3= ';'
                            {
                            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getSemicolonKeyword_1_1_1());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleContextualProperty"
    // InternalMyQvto.g:1099:1: entryRuleContextualProperty returns [EObject current=null] : iv_ruleContextualProperty= ruleContextualProperty EOF ;
    public final EObject entryRuleContextualProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextualProperty = null;


        try {
            // InternalMyQvto.g:1099:59: (iv_ruleContextualProperty= ruleContextualProperty EOF )
            // InternalMyQvto.g:1100:2: iv_ruleContextualProperty= ruleContextualProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextualPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContextualProperty=ruleContextualProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContextualProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContextualProperty"


    // $ANTLR start "ruleContextualProperty"
    // InternalMyQvto.g:1106:1: ruleContextualProperty returns [EObject current=null] : ( (otherlv_0= 'intermediate' )? ( (lv_property_key_1_0= rulePropertyKey ) )+ ( (lv_declarator_2_0= ruleDeclarator ) ) otherlv_3= ';' ) ;
    public final EObject ruleContextualProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_property_key_1_0 = null;

        EObject lv_declarator_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1112:2: ( ( (otherlv_0= 'intermediate' )? ( (lv_property_key_1_0= rulePropertyKey ) )+ ( (lv_declarator_2_0= ruleDeclarator ) ) otherlv_3= ';' ) )
            // InternalMyQvto.g:1113:2: ( (otherlv_0= 'intermediate' )? ( (lv_property_key_1_0= rulePropertyKey ) )+ ( (lv_declarator_2_0= ruleDeclarator ) ) otherlv_3= ';' )
            {
            // InternalMyQvto.g:1113:2: ( (otherlv_0= 'intermediate' )? ( (lv_property_key_1_0= rulePropertyKey ) )+ ( (lv_declarator_2_0= ruleDeclarator ) ) otherlv_3= ';' )
            // InternalMyQvto.g:1114:3: (otherlv_0= 'intermediate' )? ( (lv_property_key_1_0= rulePropertyKey ) )+ ( (lv_declarator_2_0= ruleDeclarator ) ) otherlv_3= ';'
            {
            // InternalMyQvto.g:1114:3: (otherlv_0= 'intermediate' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyQvto.g:1115:4: otherlv_0= 'intermediate'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getContextualPropertyAccess().getIntermediateKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalMyQvto.g:1120:3: ( (lv_property_key_1_0= rulePropertyKey ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=78 && LA22_0<=81)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyQvto.g:1121:4: (lv_property_key_1_0= rulePropertyKey )
            	    {
            	    // InternalMyQvto.g:1121:4: (lv_property_key_1_0= rulePropertyKey )
            	    // InternalMyQvto.g:1122:5: lv_property_key_1_0= rulePropertyKey
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getContextualPropertyAccess().getProperty_keyPropertyKeyEnumRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_property_key_1_0=rulePropertyKey();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getContextualPropertyRule());
            	      					}
            	      					add(
            	      						current,
            	      						"property_key",
            	      						lv_property_key_1_0,
            	      						"org.omg.qvt10.myqvto.MyQvto.PropertyKey");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalMyQvto.g:1139:3: ( (lv_declarator_2_0= ruleDeclarator ) )
            // InternalMyQvto.g:1140:4: (lv_declarator_2_0= ruleDeclarator )
            {
            // InternalMyQvto.g:1140:4: (lv_declarator_2_0= ruleDeclarator )
            // InternalMyQvto.g:1141:5: lv_declarator_2_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContextualPropertyAccess().getDeclaratorDeclaratorParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_declarator_2_0=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContextualPropertyRule());
              					}
              					set(
              						current,
              						"declarator",
              						lv_declarator_2_0,
              						"org.omg.qvt10.myqvto.MyQvto.Declarator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getContextualPropertyAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleContextualProperty"


    // $ANTLR start "entryRuleEntryOperation"
    // InternalMyQvto.g:1166:1: entryRuleEntryOperation returns [EObject current=null] : iv_ruleEntryOperation= ruleEntryOperation EOF ;
    public final EObject entryRuleEntryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryOperation = null;


        try {
            // InternalMyQvto.g:1166:55: (iv_ruleEntryOperation= ruleEntryOperation EOF )
            // InternalMyQvto.g:1167:2: iv_ruleEntryOperation= ruleEntryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntryOperation=ruleEntryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntryOperation"


    // $ANTLR start "ruleEntryOperation"
    // InternalMyQvto.g:1173:1: ruleEntryOperation returns [EObject current=null] : ( ( (lv_entry_header_0_0= ruleEntryHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) ) ;
    public final EObject ruleEntryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entry_header_0_0 = null;

        EObject lv_expression_block_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1179:2: ( ( ( (lv_entry_header_0_0= ruleEntryHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) ) )
            // InternalMyQvto.g:1180:2: ( ( (lv_entry_header_0_0= ruleEntryHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) )
            {
            // InternalMyQvto.g:1180:2: ( ( (lv_entry_header_0_0= ruleEntryHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) )
            // InternalMyQvto.g:1181:3: ( (lv_entry_header_0_0= ruleEntryHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) )
            {
            // InternalMyQvto.g:1181:3: ( (lv_entry_header_0_0= ruleEntryHeader ) )
            // InternalMyQvto.g:1182:4: (lv_entry_header_0_0= ruleEntryHeader )
            {
            // InternalMyQvto.g:1182:4: (lv_entry_header_0_0= ruleEntryHeader )
            // InternalMyQvto.g:1183:5: lv_entry_header_0_0= ruleEntryHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntryOperationAccess().getEntry_headerEntryHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_entry_header_0_0=ruleEntryHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEntryOperationRule());
              					}
              					set(
              						current,
              						"entry_header",
              						lv_entry_header_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.EntryHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1200:3: (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            else if ( (LA24_0==21) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyQvto.g:1201:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEntryOperationAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1206:4: ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? )
                    {
                    // InternalMyQvto.g:1206:4: ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? )
                    // InternalMyQvto.g:1207:5: ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )?
                    {
                    // InternalMyQvto.g:1207:5: ( (lv_expression_block_2_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:1208:6: (lv_expression_block_2_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:1208:6: (lv_expression_block_2_0= ruleExpressionBlock )
                    // InternalMyQvto.g:1209:7: lv_expression_block_2_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getEntryOperationAccess().getExpression_blockExpressionBlockParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_17);
                    lv_expression_block_2_0=ruleExpressionBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getEntryOperationRule());
                      							}
                      							set(
                      								current,
                      								"expression_block",
                      								lv_expression_block_2_0,
                      								"org.omg.qvt10.myqvto.MyQvto.ExpressionBlock");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyQvto.g:1226:5: (otherlv_3= ';' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==16) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMyQvto.g:1227:6: otherlv_3= ';'
                            {
                            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getEntryOperationAccess().getSemicolonKeyword_1_1_1());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntryOperation"


    // $ANTLR start "entryRuleLibrary"
    // InternalMyQvto.g:1238:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalMyQvto.g:1238:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalMyQvto.g:1239:2: iv_ruleLibrary= ruleLibrary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibrary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalMyQvto.g:1245:1: ruleLibrary returns [EObject current=null] : ( ( (lv_library_h_0_0= ruleLibraryHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_library_h_0_0 = null;

        EObject lv_module_element_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1251:2: ( ( ( (lv_library_h_0_0= ruleLibraryHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) )
            // InternalMyQvto.g:1252:2: ( ( (lv_library_h_0_0= ruleLibraryHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            {
            // InternalMyQvto.g:1252:2: ( ( (lv_library_h_0_0= ruleLibraryHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            // InternalMyQvto.g:1253:3: ( (lv_library_h_0_0= ruleLibraryHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            {
            // InternalMyQvto.g:1253:3: ( (lv_library_h_0_0= ruleLibraryHeader ) )
            // InternalMyQvto.g:1254:4: (lv_library_h_0_0= ruleLibraryHeader )
            {
            // InternalMyQvto.g:1254:4: (lv_library_h_0_0= ruleLibraryHeader )
            // InternalMyQvto.g:1255:5: lv_library_h_0_0= ruleLibraryHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLibraryAccess().getLibrary_hLibraryHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_library_h_0_0=ruleLibraryHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLibraryRule());
              					}
              					set(
              						current,
              						"library_h",
              						lv_library_h_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.LibraryHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1272:3: (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            else if ( (LA27_0==21) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyQvto.g:1273:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLibraryAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1278:4: (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    {
                    // InternalMyQvto.g:1278:4: (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    // InternalMyQvto.g:1279:5: otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )?
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:1283:5: ( (lv_module_element_3_0= ruleImperativeOperation ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=23 && LA25_0<=25)||LA25_0==42||(LA25_0>=45 && LA25_0<=47)||(LA25_0>=52 && LA25_0<=55)||(LA25_0>=70 && LA25_0<=74)||(LA25_0>=78 && LA25_0<=81)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMyQvto.g:1284:6: (lv_module_element_3_0= ruleImperativeOperation )
                    	    {
                    	    // InternalMyQvto.g:1284:6: (lv_module_element_3_0= ruleImperativeOperation )
                    	    // InternalMyQvto.g:1285:7: lv_module_element_3_0= ruleImperativeOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLibraryAccess().getModule_elementImperativeOperationParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_module_element_3_0=ruleImperativeOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"module_element",
                    	      								lv_module_element_3_0,
                    	      								"org.omg.qvt10.myqvto.MyQvto.ImperativeOperation");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_1_1_2());
                      				
                    }
                    // InternalMyQvto.g:1306:5: (otherlv_5= ';' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==16) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMyQvto.g:1307:6: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getLibraryAccess().getSemicolonKeyword_1_1_3());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleTagGO"
    // InternalMyQvto.g:1318:1: entryRuleTagGO returns [EObject current=null] : iv_ruleTagGO= ruleTagGO EOF ;
    public final EObject entryRuleTagGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagGO = null;


        try {
            // InternalMyQvto.g:1318:46: (iv_ruleTagGO= ruleTagGO EOF )
            // InternalMyQvto.g:1319:2: iv_ruleTagGO= ruleTagGO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagGORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTagGO=ruleTagGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagGO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTagGO"


    // $ANTLR start "ruleTagGO"
    // InternalMyQvto.g:1325:1: ruleTagGO returns [EObject current=null] : (otherlv_0= 'tag' ( (lv_tagid_1_0= RULE_STRING ) ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleTagGO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tagid_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_scoped_identifier_2_0 = null;

        EObject lv_tagvalue_4_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1331:2: ( (otherlv_0= 'tag' ( (lv_tagid_1_0= RULE_STRING ) ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )? otherlv_5= ';' ) )
            // InternalMyQvto.g:1332:2: (otherlv_0= 'tag' ( (lv_tagid_1_0= RULE_STRING ) ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )? otherlv_5= ';' )
            {
            // InternalMyQvto.g:1332:2: (otherlv_0= 'tag' ( (lv_tagid_1_0= RULE_STRING ) ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )? otherlv_5= ';' )
            // InternalMyQvto.g:1333:3: otherlv_0= 'tag' ( (lv_tagid_1_0= RULE_STRING ) ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTagGOAccess().getTagKeyword_0());
              		
            }
            // InternalMyQvto.g:1337:3: ( (lv_tagid_1_0= RULE_STRING ) )
            // InternalMyQvto.g:1338:4: (lv_tagid_1_0= RULE_STRING )
            {
            // InternalMyQvto.g:1338:4: (lv_tagid_1_0= RULE_STRING )
            // InternalMyQvto.g:1339:5: lv_tagid_1_0= RULE_STRING
            {
            lv_tagid_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_tagid_1_0, grammarAccess.getTagGOAccess().getTagidSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTagGORule());
              					}
              					setWithLastConsumed(
              						current,
              						"tagid",
              						lv_tagid_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            // InternalMyQvto.g:1355:3: ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:1356:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:1356:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            // InternalMyQvto.g:1357:5: lv_scoped_identifier_2_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTagGOAccess().getScoped_identifierScopedIdentifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_scoped_identifier_2_0=ruleScopedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTagGORule());
              					}
              					set(
              						current,
              						"scoped_identifier",
              						lv_scoped_identifier_2_0,
              						"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1374:3: (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyQvto.g:1375:4: otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTagGOAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalMyQvto.g:1379:4: ( (lv_tagvalue_4_0= ruleExpressionGO ) )
                    // InternalMyQvto.g:1380:5: (lv_tagvalue_4_0= ruleExpressionGO )
                    {
                    // InternalMyQvto.g:1380:5: (lv_tagvalue_4_0= ruleExpressionGO )
                    // InternalMyQvto.g:1381:6: lv_tagvalue_4_0= ruleExpressionGO
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTagGOAccess().getTagvalueExpressionGOParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_tagvalue_4_0=ruleExpressionGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTagGORule());
                      						}
                      						set(
                      							current,
                      							"tagvalue",
                      							lv_tagvalue_4_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ExpressionGO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTagGOAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTagGO"


    // $ANTLR start "entryRuleMetaModelGO"
    // InternalMyQvto.g:1407:1: entryRuleMetaModelGO returns [EObject current=null] : iv_ruleMetaModelGO= ruleMetaModelGO EOF ;
    public final EObject entryRuleMetaModelGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModelGO = null;


        try {
            // InternalMyQvto.g:1407:52: (iv_ruleMetaModelGO= ruleMetaModelGO EOF )
            // InternalMyQvto.g:1408:2: iv_ruleMetaModelGO= ruleMetaModelGO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaModelGORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetaModelGO=ruleMetaModelGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaModelGO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetaModelGO"


    // $ANTLR start "ruleMetaModelGO"
    // InternalMyQvto.g:1414:1: ruleMetaModelGO returns [EObject current=null] : ( ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) ;
    public final EObject ruleMetaModelGO() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_metamodel_h_0_0 = null;

        EObject lv_metamodel_element_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1420:2: ( ( ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) )
            // InternalMyQvto.g:1421:2: ( ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            {
            // InternalMyQvto.g:1421:2: ( ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            // InternalMyQvto.g:1422:3: ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            {
            // InternalMyQvto.g:1422:3: ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) )
            // InternalMyQvto.g:1423:4: (lv_metamodel_h_0_0= ruleMetaModelHeader )
            {
            // InternalMyQvto.g:1423:4: (lv_metamodel_h_0_0= ruleMetaModelHeader )
            // InternalMyQvto.g:1424:5: lv_metamodel_h_0_0= ruleMetaModelHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetaModelGOAccess().getMetamodel_hMetaModelHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_metamodel_h_0_0=ruleMetaModelHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMetaModelGORule());
              					}
              					set(
              						current,
              						"metamodel_h",
              						lv_metamodel_h_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.MetaModelHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1441:3: (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            else if ( (LA31_0==21) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyQvto.g:1442:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMetaModelGOAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1447:4: (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    {
                    // InternalMyQvto.g:1447:4: (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    // InternalMyQvto.g:1448:5: otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )?
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMetaModelGOAccess().getLeftCurlyBracketKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:1452:5: ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=23 && LA29_0<=24)||(LA29_0>=51 && LA29_0<=55)||(LA29_0>=70 && LA29_0<=72)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyQvto.g:1453:6: (lv_metamodel_element_3_0= ruleMetaModelElement )
                    	    {
                    	    // InternalMyQvto.g:1453:6: (lv_metamodel_element_3_0= ruleMetaModelElement )
                    	    // InternalMyQvto.g:1454:7: lv_metamodel_element_3_0= ruleMetaModelElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMetaModelGOAccess().getMetamodel_elementMetaModelElementParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_26);
                    	    lv_metamodel_element_3_0=ruleMetaModelElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMetaModelGORule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"metamodel_element",
                    	      								lv_metamodel_element_3_0,
                    	      								"org.omg.qvt10.myqvto.MyQvto.MetaModelElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getMetaModelGOAccess().getRightCurlyBracketKeyword_1_1_2());
                      				
                    }
                    // InternalMyQvto.g:1475:5: (otherlv_5= ';' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==16) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalMyQvto.g:1476:6: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getMetaModelGOAccess().getSemicolonKeyword_1_1_3());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMetaModelGO"


    // $ANTLR start "entryRuleAccessDecl"
    // InternalMyQvto.g:1487:1: entryRuleAccessDecl returns [EObject current=null] : iv_ruleAccessDecl= ruleAccessDecl EOF ;
    public final EObject entryRuleAccessDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessDecl = null;


        try {
            // InternalMyQvto.g:1487:51: (iv_ruleAccessDecl= ruleAccessDecl EOF )
            // InternalMyQvto.g:1488:2: iv_ruleAccessDecl= ruleAccessDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAccessDecl=ruleAccessDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAccessDecl"


    // $ANTLR start "ruleAccessDecl"
    // InternalMyQvto.g:1494:1: ruleAccessDecl returns [EObject current=null] : ( ( (lv_access_usage_0_0= ruleAccessUsage ) ) otherlv_1= ';' ) ;
    public final EObject ruleAccessDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_access_usage_0_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1500:2: ( ( ( (lv_access_usage_0_0= ruleAccessUsage ) ) otherlv_1= ';' ) )
            // InternalMyQvto.g:1501:2: ( ( (lv_access_usage_0_0= ruleAccessUsage ) ) otherlv_1= ';' )
            {
            // InternalMyQvto.g:1501:2: ( ( (lv_access_usage_0_0= ruleAccessUsage ) ) otherlv_1= ';' )
            // InternalMyQvto.g:1502:3: ( (lv_access_usage_0_0= ruleAccessUsage ) ) otherlv_1= ';'
            {
            // InternalMyQvto.g:1502:3: ( (lv_access_usage_0_0= ruleAccessUsage ) )
            // InternalMyQvto.g:1503:4: (lv_access_usage_0_0= ruleAccessUsage )
            {
            // InternalMyQvto.g:1503:4: (lv_access_usage_0_0= ruleAccessUsage )
            // InternalMyQvto.g:1504:5: lv_access_usage_0_0= ruleAccessUsage
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAccessDeclAccess().getAccess_usageAccessUsageParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_access_usage_0_0=ruleAccessUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAccessDeclRule());
              					}
              					set(
              						current,
              						"access_usage",
              						lv_access_usage_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.AccessUsage");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAccessDeclAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAccessDecl"


    // $ANTLR start "entryRuleTypeDef"
    // InternalMyQvto.g:1529:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalMyQvto.g:1529:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalMyQvto.g:1530:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyQvto.g:1536:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typespec_3_0= ruleTypeSpec ) ) (otherlv_4= '[' ( (lv_typedef_condition_5_0= ruleExpressionGO ) ) otherlv_6= ']' )? otherlv_7= ';' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_typespec_3_0 = null;

        EObject lv_typedef_condition_5_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1542:2: ( (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typespec_3_0= ruleTypeSpec ) ) (otherlv_4= '[' ( (lv_typedef_condition_5_0= ruleExpressionGO ) ) otherlv_6= ']' )? otherlv_7= ';' ) )
            // InternalMyQvto.g:1543:2: (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typespec_3_0= ruleTypeSpec ) ) (otherlv_4= '[' ( (lv_typedef_condition_5_0= ruleExpressionGO ) ) otherlv_6= ']' )? otherlv_7= ';' )
            {
            // InternalMyQvto.g:1543:2: (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typespec_3_0= ruleTypeSpec ) ) (otherlv_4= '[' ( (lv_typedef_condition_5_0= ruleExpressionGO ) ) otherlv_6= ']' )? otherlv_7= ';' )
            // InternalMyQvto.g:1544:3: otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typespec_3_0= ruleTypeSpec ) ) (otherlv_4= '[' ( (lv_typedef_condition_5_0= ruleExpressionGO ) ) otherlv_6= ']' )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
              		
            }
            // InternalMyQvto.g:1548:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyQvto.g:1549:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyQvto.g:1549:4: (lv_name_1_0= RULE_ID )
            // InternalMyQvto.g:1550:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTypeDefAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalMyQvto.g:1570:3: ( (lv_typespec_3_0= ruleTypeSpec ) )
            // InternalMyQvto.g:1571:4: (lv_typespec_3_0= ruleTypeSpec )
            {
            // InternalMyQvto.g:1571:4: (lv_typespec_3_0= ruleTypeSpec )
            // InternalMyQvto.g:1572:5: lv_typespec_3_0= ruleTypeSpec
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeDefAccess().getTypespecTypeSpecParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_typespec_3_0=ruleTypeSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeDefRule());
              					}
              					set(
              						current,
              						"typespec",
              						lv_typespec_3_0,
              						"org.omg.qvt10.myqvto.MyQvto.TypeSpec");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1589:3: (otherlv_4= '[' ( (lv_typedef_condition_5_0= ruleExpressionGO ) ) otherlv_6= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyQvto.g:1590:4: otherlv_4= '[' ( (lv_typedef_condition_5_0= ruleExpressionGO ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTypeDefAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    // InternalMyQvto.g:1594:4: ( (lv_typedef_condition_5_0= ruleExpressionGO ) )
                    // InternalMyQvto.g:1595:5: (lv_typedef_condition_5_0= ruleExpressionGO )
                    {
                    // InternalMyQvto.g:1595:5: (lv_typedef_condition_5_0= ruleExpressionGO )
                    // InternalMyQvto.g:1596:6: lv_typedef_condition_5_0= ruleExpressionGO
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeDefAccess().getTypedef_conditionExpressionGOParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_typedef_condition_5_0=ruleExpressionGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      						}
                      						set(
                      							current,
                      							"typedef_condition",
                      							lv_typedef_condition_5_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ExpressionGO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTypeDefAccess().getRightSquareBracketKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTypeDefAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleClassifierGO"
    // InternalMyQvto.g:1626:1: entryRuleClassifierGO returns [EObject current=null] : iv_ruleClassifierGO= ruleClassifierGO EOF ;
    public final EObject entryRuleClassifierGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierGO = null;


        try {
            // InternalMyQvto.g:1626:53: (iv_ruleClassifierGO= ruleClassifierGO EOF )
            // InternalMyQvto.g:1627:2: iv_ruleClassifierGO= ruleClassifierGO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierGORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassifierGO=ruleClassifierGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierGO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassifierGO"


    // $ANTLR start "ruleClassifierGO"
    // InternalMyQvto.g:1633:1: ruleClassifierGO returns [EObject current=null] : ( ( (lv_classifier_h_0_0= ruleClassifierHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) ) ) ;
    public final EObject ruleClassifierGO() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_classifier_h_0_0 = null;

        EObject lv_classifier_feature_list_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1639:2: ( ( ( (lv_classifier_h_0_0= ruleClassifierHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) ) ) )
            // InternalMyQvto.g:1640:2: ( ( (lv_classifier_h_0_0= ruleClassifierHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            {
            // InternalMyQvto.g:1640:2: ( ( (lv_classifier_h_0_0= ruleClassifierHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            // InternalMyQvto.g:1641:3: ( (lv_classifier_h_0_0= ruleClassifierHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) )
            {
            // InternalMyQvto.g:1641:3: ( (lv_classifier_h_0_0= ruleClassifierHeader ) )
            // InternalMyQvto.g:1642:4: (lv_classifier_h_0_0= ruleClassifierHeader )
            {
            // InternalMyQvto.g:1642:4: (lv_classifier_h_0_0= ruleClassifierHeader )
            // InternalMyQvto.g:1643:5: lv_classifier_h_0_0= ruleClassifierHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierGOAccess().getClassifier_hClassifierHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_classifier_h_0_0=ruleClassifierHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassifierGORule());
              					}
              					set(
              						current,
              						"classifier_h",
              						lv_classifier_h_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.ClassifierHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1660:3: (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==16) ) {
                alt35=1;
            }
            else if ( (LA35_0==21) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyQvto.g:1661:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getClassifierGOAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1666:4: (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? )
                    {
                    // InternalMyQvto.g:1666:4: (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? )
                    // InternalMyQvto.g:1667:5: otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )?
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getClassifierGOAccess().getLeftCurlyBracketKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:1671:5: ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==EOF||LA33_0==RULE_ID||LA33_0==24||(LA33_0>=35 && LA33_0<=36)||LA33_0==58||(LA33_0>=64 && LA33_0<=69)||LA33_0==72||LA33_0==78||(LA33_0>=82 && LA33_0<=84)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalMyQvto.g:1672:6: (lv_classifier_feature_list_3_0= ruleClassifierFeatureList )
                            {
                            // InternalMyQvto.g:1672:6: (lv_classifier_feature_list_3_0= ruleClassifierFeatureList )
                            // InternalMyQvto.g:1673:7: lv_classifier_feature_list_3_0= ruleClassifierFeatureList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getClassifierGOAccess().getClassifier_feature_listClassifierFeatureListParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
                            lv_classifier_feature_list_3_0=ruleClassifierFeatureList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getClassifierGORule());
                              							}
                              							set(
                              								current,
                              								"classifier_feature_list",
                              								lv_classifier_feature_list_3_0,
                              								"org.omg.qvt10.myqvto.MyQvto.ClassifierFeatureList");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getClassifierGOAccess().getRightCurlyBracketKeyword_1_1_2());
                      				
                    }
                    // InternalMyQvto.g:1694:5: (otherlv_5= ';' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==16) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalMyQvto.g:1695:6: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getClassifierGOAccess().getSemicolonKeyword_1_1_3());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassifierGO"


    // $ANTLR start "entryRuleEString"
    // InternalMyQvto.g:1706:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyQvto.g:1706:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyQvto.g:1707:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyQvto.g:1713:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyQvto.g:1719:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyQvto.g:1720:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyQvto.g:1720:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyQvto.g:1721:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1729:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePackageRefGO"
    // InternalMyQvto.g:1740:1: entryRulePackageRefGO returns [EObject current=null] : iv_rulePackageRefGO= rulePackageRefGO EOF ;
    public final EObject entryRulePackageRefGO() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageRefGO = null;


        try {
            // InternalMyQvto.g:1740:53: (iv_rulePackageRefGO= rulePackageRefGO EOF )
            // InternalMyQvto.g:1741:2: iv_rulePackageRefGO= rulePackageRefGO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRefGORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageRefGO=rulePackageRefGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageRefGO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageRefGO"


    // $ANTLR start "rulePackageRefGO"
    // InternalMyQvto.g:1747:1: rulePackageRefGO returns [EObject current=null] : ( () ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) ) ) ;
    public final EObject rulePackageRefGO() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_uri_3_0=null;
        Token otherlv_4=null;
        Token lv_uri_5_0=null;
        EObject lv_scoped_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1753:2: ( ( () ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) ) ) )
            // InternalMyQvto.g:1754:2: ( () ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) ) )
            {
            // InternalMyQvto.g:1754:2: ( () ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) ) )
            // InternalMyQvto.g:1755:3: () ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) )
            {
            // InternalMyQvto.g:1755:3: ()
            // InternalMyQvto.g:1756:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPackageRefGOAccess().getPackageRefGOAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:1765:3: ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_STRING) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyQvto.g:1766:4: ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? )
                    {
                    // InternalMyQvto.g:1766:4: ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? )
                    // InternalMyQvto.g:1767:5: ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )?
                    {
                    // InternalMyQvto.g:1767:5: ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
                    // InternalMyQvto.g:1768:6: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
                    {
                    // InternalMyQvto.g:1768:6: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
                    // InternalMyQvto.g:1769:7: lv_scoped_identifier_1_0= ruleScopedIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPackageRefGOAccess().getScoped_identifierScopedIdentifierParserRuleCall_1_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
                    lv_scoped_identifier_1_0=ruleScopedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPackageRefGORule());
                      							}
                      							set(
                      								current,
                      								"scoped_identifier",
                      								lv_scoped_identifier_1_0,
                      								"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyQvto.g:1786:5: (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==28) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalMyQvto.g:1787:6: otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')'
                            {
                            otherlv_2=(Token)match(input,28,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getPackageRefGOAccess().getLeftParenthesisKeyword_1_0_1_0());
                              					
                            }
                            // InternalMyQvto.g:1791:6: ( (lv_uri_3_0= RULE_STRING ) )
                            // InternalMyQvto.g:1792:7: (lv_uri_3_0= RULE_STRING )
                            {
                            // InternalMyQvto.g:1792:7: (lv_uri_3_0= RULE_STRING )
                            // InternalMyQvto.g:1793:8: lv_uri_3_0= RULE_STRING
                            {
                            lv_uri_3_0=(Token)match(input,RULE_STRING,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_uri_3_0, grammarAccess.getPackageRefGOAccess().getUriSTRINGTerminalRuleCall_1_0_1_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getPackageRefGORule());
                              								}
                              								setWithLastConsumed(
                              									current,
                              									"uri",
                              									lv_uri_3_0,
                              									"org.eclipse.xtext.common.Terminals.STRING");
                              							
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getPackageRefGOAccess().getRightParenthesisKeyword_1_0_1_2());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1816:4: ( (lv_uri_5_0= RULE_STRING ) )
                    {
                    // InternalMyQvto.g:1816:4: ( (lv_uri_5_0= RULE_STRING ) )
                    // InternalMyQvto.g:1817:5: (lv_uri_5_0= RULE_STRING )
                    {
                    // InternalMyQvto.g:1817:5: (lv_uri_5_0= RULE_STRING )
                    // InternalMyQvto.g:1818:6: lv_uri_5_0= RULE_STRING
                    {
                    lv_uri_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_uri_5_0, grammarAccess.getPackageRefGOAccess().getUriSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPackageRefGORule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"uri",
                      							lv_uri_5_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePackageRefGO"


    // $ANTLR start "entryRuleExpressionBlock"
    // InternalMyQvto.g:1839:1: entryRuleExpressionBlock returns [EObject current=null] : iv_ruleExpressionBlock= ruleExpressionBlock EOF ;
    public final EObject entryRuleExpressionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBlock = null;


        try {
            // InternalMyQvto.g:1839:56: (iv_ruleExpressionBlock= ruleExpressionBlock EOF )
            // InternalMyQvto.g:1840:2: iv_ruleExpressionBlock= ruleExpressionBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBlock=ruleExpressionBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionBlock"


    // $ANTLR start "ruleExpressionBlock"
    // InternalMyQvto.g:1846:1: ruleExpressionBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expression_list_2_0= ruleExpressionList ) )? otherlv_3= '}' ) ;
    public final EObject ruleExpressionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_list_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1852:2: ( ( () otherlv_1= '{' ( (lv_expression_list_2_0= ruleExpressionList ) )? otherlv_3= '}' ) )
            // InternalMyQvto.g:1853:2: ( () otherlv_1= '{' ( (lv_expression_list_2_0= ruleExpressionList ) )? otherlv_3= '}' )
            {
            // InternalMyQvto.g:1853:2: ( () otherlv_1= '{' ( (lv_expression_list_2_0= ruleExpressionList ) )? otherlv_3= '}' )
            // InternalMyQvto.g:1854:3: () otherlv_1= '{' ( (lv_expression_list_2_0= ruleExpressionList ) )? otherlv_3= '}'
            {
            // InternalMyQvto.g:1854:3: ()
            // InternalMyQvto.g:1855:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExpressionBlockAccess().getExpressionBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpressionBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyQvto.g:1868:3: ( (lv_expression_list_2_0= ruleExpressionList ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_STRING)||LA39_0==14||LA39_0==16) ) {
                alt39=1;
            }
            else if ( (LA39_0==22) ) {
                int LA39_2 = input.LA(2);

                if ( (synpred58_InternalMyQvto()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalMyQvto.g:1869:4: (lv_expression_list_2_0= ruleExpressionList )
                    {
                    // InternalMyQvto.g:1869:4: (lv_expression_list_2_0= ruleExpressionList )
                    // InternalMyQvto.g:1870:5: lv_expression_list_2_0= ruleExpressionList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionBlockAccess().getExpression_listExpressionListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
                    lv_expression_list_2_0=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionBlockRule());
                      					}
                      					set(
                      						current,
                      						"expression_list",
                      						lv_expression_list_2_0,
                      						"org.omg.qvt10.myqvto.MyQvto.ExpressionList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExpressionBlockAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionBlock"


    // $ANTLR start "entryRuleScopedIdentifier"
    // InternalMyQvto.g:1895:1: entryRuleScopedIdentifier returns [EObject current=null] : iv_ruleScopedIdentifier= ruleScopedIdentifier EOF ;
    public final EObject entryRuleScopedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopedIdentifier = null;


        try {
            // InternalMyQvto.g:1895:57: (iv_ruleScopedIdentifier= ruleScopedIdentifier EOF )
            // InternalMyQvto.g:1896:2: iv_ruleScopedIdentifier= ruleScopedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopedIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScopedIdentifier=ruleScopedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopedIdentifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScopedIdentifier"


    // $ANTLR start "ruleScopedIdentifier"
    // InternalMyQvto.g:1902:1: ruleScopedIdentifier returns [EObject current=null] : ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleScopedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token lv_identifier_3_0=null;


        	enterRule();

        try {
            // InternalMyQvto.g:1908:2: ( ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )* ) )
            // InternalMyQvto.g:1909:2: ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )* )
            {
            // InternalMyQvto.g:1909:2: ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )* )
            // InternalMyQvto.g:1910:3: () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )*
            {
            // InternalMyQvto.g:1910:3: ()
            // InternalMyQvto.g:1911:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getScopedIdentifierAccess().getScopedIdentifierAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:1920:3: ( (lv_identifier_1_0= RULE_ID ) )
            // InternalMyQvto.g:1921:4: (lv_identifier_1_0= RULE_ID )
            {
            // InternalMyQvto.g:1921:4: (lv_identifier_1_0= RULE_ID )
            // InternalMyQvto.g:1922:5: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_identifier_1_0, grammarAccess.getScopedIdentifierAccess().getIdentifierIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getScopedIdentifierRule());
              					}
              					addWithLastConsumed(
              						current,
              						"identifier",
              						lv_identifier_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMyQvto.g:1938:3: (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==30) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyQvto.g:1939:4: otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getScopedIdentifierAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:1943:4: ( (lv_identifier_3_0= RULE_ID ) )
            	    // InternalMyQvto.g:1944:5: (lv_identifier_3_0= RULE_ID )
            	    {
            	    // InternalMyQvto.g:1944:5: (lv_identifier_3_0= RULE_ID )
            	    // InternalMyQvto.g:1945:6: lv_identifier_3_0= RULE_ID
            	    {
            	    lv_identifier_3_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_identifier_3_0, grammarAccess.getScopedIdentifierAccess().getIdentifierIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getScopedIdentifierRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"identifier",
            	      							lv_identifier_3_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleScopedIdentifier"


    // $ANTLR start "entryRuleExpressionList"
    // InternalMyQvto.g:1966:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // InternalMyQvto.g:1966:55: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalMyQvto.g:1967:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // InternalMyQvto.g:1973:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) ) (otherlv_1= ';' )? ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_semi_list_0_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1979:2: ( ( ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) ) (otherlv_1= ';' )? ) )
            // InternalMyQvto.g:1980:2: ( ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) ) (otherlv_1= ';' )? )
            {
            // InternalMyQvto.g:1980:2: ( ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) ) (otherlv_1= ';' )? )
            // InternalMyQvto.g:1981:3: ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) ) (otherlv_1= ';' )?
            {
            // InternalMyQvto.g:1981:3: ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) )
            // InternalMyQvto.g:1982:4: (lv_expression_semi_list_0_0= ruleExpressionSemiList )
            {
            // InternalMyQvto.g:1982:4: (lv_expression_semi_list_0_0= ruleExpressionSemiList )
            // InternalMyQvto.g:1983:5: lv_expression_semi_list_0_0= ruleExpressionSemiList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionListAccess().getExpression_semi_listExpressionSemiListParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expression_semi_list_0_0=ruleExpressionSemiList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionListRule());
              					}
              					set(
              						current,
              						"expression_semi_list",
              						lv_expression_semi_list_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.ExpressionSemiList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:2000:3: (otherlv_1= ';' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==16) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyQvto.g:2001:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExpressionListAccess().getSemicolonKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleExpressionSemiList"
    // InternalMyQvto.g:2010:1: entryRuleExpressionSemiList returns [EObject current=null] : iv_ruleExpressionSemiList= ruleExpressionSemiList EOF ;
    public final EObject entryRuleExpressionSemiList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionSemiList = null;


        try {
            // InternalMyQvto.g:2010:59: (iv_ruleExpressionSemiList= ruleExpressionSemiList EOF )
            // InternalMyQvto.g:2011:2: iv_ruleExpressionSemiList= ruleExpressionSemiList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionSemiListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionSemiList=ruleExpressionSemiList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionSemiList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionSemiList"


    // $ANTLR start "ruleExpressionSemiList"
    // InternalMyQvto.g:2017:1: ruleExpressionSemiList returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleExpressionGO ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )* ) ;
    public final EObject ruleExpressionSemiList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2023:2: ( ( () ( (lv_expression_1_0= ruleExpressionGO ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )* ) )
            // InternalMyQvto.g:2024:2: ( () ( (lv_expression_1_0= ruleExpressionGO ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )* )
            {
            // InternalMyQvto.g:2024:2: ( () ( (lv_expression_1_0= ruleExpressionGO ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )* )
            // InternalMyQvto.g:2025:3: () ( (lv_expression_1_0= ruleExpressionGO ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )*
            {
            // InternalMyQvto.g:2025:3: ()
            // InternalMyQvto.g:2026:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExpressionSemiListAccess().getExpressionSemiListAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:2035:3: ( (lv_expression_1_0= ruleExpressionGO ) )
            // InternalMyQvto.g:2036:4: (lv_expression_1_0= ruleExpressionGO )
            {
            // InternalMyQvto.g:2036:4: (lv_expression_1_0= ruleExpressionGO )
            // InternalMyQvto.g:2037:5: lv_expression_1_0= ruleExpressionGO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionSemiListAccess().getExpressionExpressionGOParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_expression_1_0=ruleExpressionGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionSemiListRule());
              					}
              					add(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.ExpressionGO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:2054:3: (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==14) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyQvto.g:2055:4: otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExpressionSemiListAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:2059:4: ( (lv_expression_3_0= ruleExpressionGO ) )
            	    // InternalMyQvto.g:2060:5: (lv_expression_3_0= ruleExpressionGO )
            	    {
            	    // InternalMyQvto.g:2060:5: (lv_expression_3_0= ruleExpressionGO )
            	    // InternalMyQvto.g:2061:6: lv_expression_3_0= ruleExpressionGO
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionSemiListAccess().getExpressionExpressionGOParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_expression_3_0=ruleExpressionGO();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpressionSemiListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expression",
            	      							lv_expression_3_0,
            	      							"org.omg.qvt10.myqvto.MyQvto.ExpressionGO");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionSemiList"


    // $ANTLR start "entryRuleVarParameter"
    // InternalMyQvto.g:2083:1: entryRuleVarParameter returns [EObject current=null] : iv_ruleVarParameter= ruleVarParameter EOF ;
    public final EObject entryRuleVarParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarParameter = null;


        try {
            // InternalMyQvto.g:2083:53: (iv_ruleVarParameter= ruleVarParameter EOF )
            // InternalMyQvto.g:2084:2: iv_ruleVarParameter= ruleVarParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarParameter=ruleVarParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarParameter"


    // $ANTLR start "ruleVarParameter"
    // InternalMyQvto.g:2090:1: ruleVarParameter returns [EObject current=null] : ( ( (lv_kind_0_0= ruleDirectionKind ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ) ;
    public final EObject ruleVarParameter() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        EObject lv_declarator_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2096:2: ( ( ( (lv_kind_0_0= ruleDirectionKind ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ) )
            // InternalMyQvto.g:2097:2: ( ( (lv_kind_0_0= ruleDirectionKind ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) )
            {
            // InternalMyQvto.g:2097:2: ( ( (lv_kind_0_0= ruleDirectionKind ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) )
            // InternalMyQvto.g:2098:3: ( (lv_kind_0_0= ruleDirectionKind ) )? ( (lv_declarator_1_0= ruleDeclarator ) )
            {
            // InternalMyQvto.g:2098:3: ( (lv_kind_0_0= ruleDirectionKind ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=61 && LA43_0<=63)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyQvto.g:2099:4: (lv_kind_0_0= ruleDirectionKind )
                    {
                    // InternalMyQvto.g:2099:4: (lv_kind_0_0= ruleDirectionKind )
                    // InternalMyQvto.g:2100:5: lv_kind_0_0= ruleDirectionKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVarParameterAccess().getKindDirectionKindEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    lv_kind_0_0=ruleDirectionKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVarParameterRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_0_0,
                      						"org.omg.qvt10.myqvto.MyQvto.DirectionKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:2117:3: ( (lv_declarator_1_0= ruleDeclarator ) )
            // InternalMyQvto.g:2118:4: (lv_declarator_1_0= ruleDeclarator )
            {
            // InternalMyQvto.g:2118:4: (lv_declarator_1_0= ruleDeclarator )
            // InternalMyQvto.g:2119:5: lv_declarator_1_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarParameterAccess().getDeclaratorDeclaratorParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_declarator_1_0=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarParameterRule());
              					}
              					set(
              						current,
              						"declarator",
              						lv_declarator_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.Declarator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVarParameter"


    // $ANTLR start "entryRuleDeclarator"
    // InternalMyQvto.g:2140:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // InternalMyQvto.g:2140:51: (iv_ruleDeclarator= ruleDeclarator EOF )
            // InternalMyQvto.g:2141:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclarator=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeclarator"


    // $ANTLR start "ruleDeclarator"
    // InternalMyQvto.g:2147:1: ruleDeclarator returns [EObject current=null] : ( ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? ) | ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? ) ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_typespec_0_0 = null;

        EObject lv_init_part_1_0 = null;

        EObject lv_scoped_identifier_2_0 = null;

        EObject lv_typespec_4_0 = null;

        EObject lv_init_part_5_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2153:2: ( ( ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? ) | ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? ) ) )
            // InternalMyQvto.g:2154:2: ( ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? ) | ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? ) )
            {
            // InternalMyQvto.g:2154:2: ( ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? ) | ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? ) )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalMyQvto.g:2155:3: ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? )
                    {
                    // InternalMyQvto.g:2155:3: ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? )
                    // InternalMyQvto.g:2156:4: ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )?
                    {
                    // InternalMyQvto.g:2156:4: ( (lv_typespec_0_0= ruleTypeSpec ) )
                    // InternalMyQvto.g:2157:5: (lv_typespec_0_0= ruleTypeSpec )
                    {
                    // InternalMyQvto.g:2157:5: (lv_typespec_0_0= ruleTypeSpec )
                    // InternalMyQvto.g:2158:6: lv_typespec_0_0= ruleTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeclaratorAccess().getTypespecTypeSpecParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    lv_typespec_0_0=ruleTypeSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDeclaratorRule());
                      						}
                      						set(
                      							current,
                      							"typespec",
                      							lv_typespec_0_0,
                      							"org.omg.qvt10.myqvto.MyQvto.TypeSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyQvto.g:2175:4: ( (lv_init_part_1_0= ruleInitPart ) )?
                    int alt44=2;
                    alt44 = dfa44.predict(input);
                    switch (alt44) {
                        case 1 :
                            // InternalMyQvto.g:2176:5: (lv_init_part_1_0= ruleInitPart )
                            {
                            // InternalMyQvto.g:2176:5: (lv_init_part_1_0= ruleInitPart )
                            // InternalMyQvto.g:2177:6: lv_init_part_1_0= ruleInitPart
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getDeclaratorAccess().getInit_partInitPartParserRuleCall_0_1_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_init_part_1_0=ruleInitPart();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getDeclaratorRule());
                              						}
                              						set(
                              							current,
                              							"init_part",
                              							lv_init_part_1_0,
                              							"org.omg.qvt10.myqvto.MyQvto.InitPart");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:2196:3: ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? )
                    {
                    // InternalMyQvto.g:2196:3: ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? )
                    // InternalMyQvto.g:2197:4: ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )?
                    {
                    // InternalMyQvto.g:2197:4: ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) )
                    // InternalMyQvto.g:2198:5: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
                    {
                    // InternalMyQvto.g:2198:5: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
                    // InternalMyQvto.g:2199:6: lv_scoped_identifier_2_0= ruleScopedIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeclaratorAccess().getScoped_identifierScopedIdentifierParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_scoped_identifier_2_0=ruleScopedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDeclaratorRule());
                      						}
                      						set(
                      							current,
                      							"scoped_identifier",
                      							lv_scoped_identifier_2_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDeclaratorAccess().getColonKeyword_1_1());
                      			
                    }
                    // InternalMyQvto.g:2220:4: ( (lv_typespec_4_0= ruleTypeSpec ) )
                    // InternalMyQvto.g:2221:5: (lv_typespec_4_0= ruleTypeSpec )
                    {
                    // InternalMyQvto.g:2221:5: (lv_typespec_4_0= ruleTypeSpec )
                    // InternalMyQvto.g:2222:6: lv_typespec_4_0= ruleTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeclaratorAccess().getTypespecTypeSpecParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    lv_typespec_4_0=ruleTypeSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDeclaratorRule());
                      						}
                      						set(
                      							current,
                      							"typespec",
                      							lv_typespec_4_0,
                      							"org.omg.qvt10.myqvto.MyQvto.TypeSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyQvto.g:2239:4: ( (lv_init_part_5_0= ruleInitPart ) )?
                    int alt45=2;
                    alt45 = dfa45.predict(input);
                    switch (alt45) {
                        case 1 :
                            // InternalMyQvto.g:2240:5: (lv_init_part_5_0= ruleInitPart )
                            {
                            // InternalMyQvto.g:2240:5: (lv_init_part_5_0= ruleInitPart )
                            // InternalMyQvto.g:2241:6: lv_init_part_5_0= ruleInitPart
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getDeclaratorAccess().getInit_partInitPartParserRuleCall_1_3_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_init_part_5_0=ruleInitPart();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getDeclaratorRule());
                              						}
                              						set(
                              							current,
                              							"init_part",
                              							lv_init_part_5_0,
                              							"org.omg.qvt10.myqvto.MyQvto.InitPart");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDeclarator"


    // $ANTLR start "entryRuleTypeSpec"
    // InternalMyQvto.g:2263:1: entryRuleTypeSpec returns [EObject current=null] : iv_ruleTypeSpec= ruleTypeSpec EOF ;
    public final EObject entryRuleTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpec = null;


        try {
            // InternalMyQvto.g:2263:49: (iv_ruleTypeSpec= ruleTypeSpec EOF )
            // InternalMyQvto.g:2264:2: iv_ruleTypeSpec= ruleTypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeSpec=ruleTypeSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeSpec"


    // $ANTLR start "ruleTypeSpec"
    // InternalMyQvto.g:2270:1: ruleTypeSpec returns [EObject current=null] : ( ( (lv_type_reference_0_0= ruleTypeReference ) ) (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleTypeSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_extent_location_2_0=null;
        EObject lv_type_reference_0_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2276:2: ( ( ( (lv_type_reference_0_0= ruleTypeReference ) ) (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )? ) )
            // InternalMyQvto.g:2277:2: ( ( (lv_type_reference_0_0= ruleTypeReference ) ) (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )? )
            {
            // InternalMyQvto.g:2277:2: ( ( (lv_type_reference_0_0= ruleTypeReference ) ) (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )? )
            // InternalMyQvto.g:2278:3: ( (lv_type_reference_0_0= ruleTypeReference ) ) (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )?
            {
            // InternalMyQvto.g:2278:3: ( (lv_type_reference_0_0= ruleTypeReference ) )
            // InternalMyQvto.g:2279:4: (lv_type_reference_0_0= ruleTypeReference )
            {
            // InternalMyQvto.g:2279:4: (lv_type_reference_0_0= ruleTypeReference )
            // InternalMyQvto.g:2280:5: lv_type_reference_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeSpecAccess().getType_referenceTypeReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_type_reference_0_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeSpecRule());
              					}
              					set(
              						current,
              						"type_reference",
              						lv_type_reference_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.TypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:2297:3: (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==32) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyQvto.g:2298:4: otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeSpecAccess().getCommercialAtKeyword_1_0());
                      			
                    }
                    // InternalMyQvto.g:2302:4: ( (lv_extent_location_2_0= RULE_ID ) )
                    // InternalMyQvto.g:2303:5: (lv_extent_location_2_0= RULE_ID )
                    {
                    // InternalMyQvto.g:2303:5: (lv_extent_location_2_0= RULE_ID )
                    // InternalMyQvto.g:2304:6: lv_extent_location_2_0= RULE_ID
                    {
                    lv_extent_location_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_extent_location_2_0, grammarAccess.getTypeSpecAccess().getExtent_locationIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeSpecRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"extent_location",
                      							lv_extent_location_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeSpec"


    // $ANTLR start "entryRuleInitPart"
    // InternalMyQvto.g:2325:1: entryRuleInitPart returns [EObject current=null] : iv_ruleInitPart= ruleInitPart EOF ;
    public final EObject entryRuleInitPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitPart = null;


        try {
            // InternalMyQvto.g:2325:49: (iv_ruleInitPart= ruleInitPart EOF )
            // InternalMyQvto.g:2326:2: iv_ruleInitPart= ruleInitPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitPart=ruleInitPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInitPart"


    // $ANTLR start "ruleInitPart"
    // InternalMyQvto.g:2332:1: ruleInitPart returns [EObject current=null] : ( ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) ) ( (lv_expression_1_0= ruleExpressionGO ) ) ) ;
    public final EObject ruleInitPart() throws RecognitionException {
        EObject current = null;

        Token lv_init_op_0_1=null;
        Token lv_init_op_0_2=null;
        Token lv_init_op_0_3=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2338:2: ( ( ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) ) ( (lv_expression_1_0= ruleExpressionGO ) ) ) )
            // InternalMyQvto.g:2339:2: ( ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) ) ( (lv_expression_1_0= ruleExpressionGO ) ) )
            {
            // InternalMyQvto.g:2339:2: ( ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) ) ( (lv_expression_1_0= ruleExpressionGO ) ) )
            // InternalMyQvto.g:2340:3: ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) ) ( (lv_expression_1_0= ruleExpressionGO ) )
            {
            // InternalMyQvto.g:2340:3: ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) )
            // InternalMyQvto.g:2341:4: ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) )
            {
            // InternalMyQvto.g:2341:4: ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) )
            // InternalMyQvto.g:2342:5: (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' )
            {
            // InternalMyQvto.g:2342:5: (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt48=1;
                }
                break;
            case 33:
                {
                alt48=2;
                }
                break;
            case 34:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalMyQvto.g:2343:6: lv_init_op_0_1= '='
                    {
                    lv_init_op_0_1=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_init_op_0_1, grammarAccess.getInitPartAccess().getInit_opEqualsSignKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInitPartRule());
                      						}
                      						setWithLastConsumed(current, "init_op", lv_init_op_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:2354:6: lv_init_op_0_2= ':='
                    {
                    lv_init_op_0_2=(Token)match(input,33,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_init_op_0_2, grammarAccess.getInitPartAccess().getInit_opColonEqualsSignKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInitPartRule());
                      						}
                      						setWithLastConsumed(current, "init_op", lv_init_op_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:2365:6: lv_init_op_0_3= '::='
                    {
                    lv_init_op_0_3=(Token)match(input,34,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_init_op_0_3, grammarAccess.getInitPartAccess().getInit_opColonColonEqualsSignKeyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInitPartRule());
                      						}
                      						setWithLastConsumed(current, "init_op", lv_init_op_0_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalMyQvto.g:2378:3: ( (lv_expression_1_0= ruleExpressionGO ) )
            // InternalMyQvto.g:2379:4: (lv_expression_1_0= ruleExpressionGO )
            {
            // InternalMyQvto.g:2379:4: (lv_expression_1_0= ruleExpressionGO )
            // InternalMyQvto.g:2380:5: lv_expression_1_0= ruleExpressionGO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInitPartAccess().getExpressionExpressionGOParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpressionGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInitPartRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.ExpressionGO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInitPart"


    // $ANTLR start "entryRuleTypeReference"
    // InternalMyQvto.g:2401:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalMyQvto.g:2401:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalMyQvto.g:2402:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalMyQvto.g:2408:1: ruleTypeReference returns [EObject current=null] : ( ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) | ( (lv_complex_type_2_0= ruleComplexType ) ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_scoped_identifier_1_0 = null;

        EObject lv_complex_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2414:2: ( ( ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) | ( (lv_complex_type_2_0= ruleComplexType ) ) ) )
            // InternalMyQvto.g:2415:2: ( ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) | ( (lv_complex_type_2_0= ruleComplexType ) ) )
            {
            // InternalMyQvto.g:2415:2: ( ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) | ( (lv_complex_type_2_0= ruleComplexType ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=35 && LA49_0<=36)||(LA49_0>=64 && LA49_0<=69)) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyQvto.g:2416:3: ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) )
                    {
                    // InternalMyQvto.g:2416:3: ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) )
                    // InternalMyQvto.g:2417:4: () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
                    {
                    // InternalMyQvto.g:2417:4: ()
                    // InternalMyQvto.g:2418:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeReferenceAccess().getTypeReferenceAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyQvto.g:2427:4: ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
                    // InternalMyQvto.g:2428:5: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
                    {
                    // InternalMyQvto.g:2428:5: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
                    // InternalMyQvto.g:2429:6: lv_scoped_identifier_1_0= ruleScopedIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeReferenceAccess().getScoped_identifierScopedIdentifierParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_scoped_identifier_1_0=ruleScopedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
                      						}
                      						set(
                      							current,
                      							"scoped_identifier",
                      							lv_scoped_identifier_1_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:2448:3: ( (lv_complex_type_2_0= ruleComplexType ) )
                    {
                    // InternalMyQvto.g:2448:3: ( (lv_complex_type_2_0= ruleComplexType ) )
                    // InternalMyQvto.g:2449:4: (lv_complex_type_2_0= ruleComplexType )
                    {
                    // InternalMyQvto.g:2449:4: (lv_complex_type_2_0= ruleComplexType )
                    // InternalMyQvto.g:2450:5: lv_complex_type_2_0= ruleComplexType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeReferenceAccess().getComplex_typeComplexTypeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_complex_type_2_0=ruleComplexType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
                      					}
                      					set(
                      						current,
                      						"complex_type",
                      						lv_complex_type_2_0,
                      						"org.omg.qvt10.myqvto.MyQvto.ComplexType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleComplexType"
    // InternalMyQvto.g:2471:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalMyQvto.g:2471:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalMyQvto.g:2472:2: iv_ruleComplexType= ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalMyQvto.g:2478:1: ruleComplexType returns [EObject current=null] : ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) | ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) | (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) | (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' ) ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_complex_type_key_1_0 = null;

        Enumerator lv_collection_key_2_0 = null;

        EObject lv_typespec_4_0 = null;

        EObject lv_typespec_8_0 = null;

        EObject lv_typespec_10_0 = null;

        EObject lv_declarator_list_14_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2484:2: ( ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) | ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) | (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) | (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' ) ) )
            // InternalMyQvto.g:2485:2: ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) | ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) | (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) | (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' ) )
            {
            // InternalMyQvto.g:2485:2: ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) | ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) | (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) | (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' ) )
            int alt50=4;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalMyQvto.g:2486:3: ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) )
                    {
                    // InternalMyQvto.g:2486:3: ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) )
                    // InternalMyQvto.g:2487:4: () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) )
                    {
                    // InternalMyQvto.g:2487:4: ()
                    // InternalMyQvto.g:2488:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getComplexTypeAccess().getComplexTypeAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyQvto.g:2497:4: ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) )
                    // InternalMyQvto.g:2498:5: (lv_complex_type_key_1_0= ruleComplexTypeKey )
                    {
                    // InternalMyQvto.g:2498:5: (lv_complex_type_key_1_0= ruleComplexTypeKey )
                    // InternalMyQvto.g:2499:6: lv_complex_type_key_1_0= ruleComplexTypeKey
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComplexTypeAccess().getComplex_type_keyComplexTypeKeyEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_complex_type_key_1_0=ruleComplexTypeKey();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                      						}
                      						set(
                      							current,
                      							"complex_type_key",
                      							lv_complex_type_key_1_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ComplexTypeKey");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:2518:3: ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' )
                    {
                    // InternalMyQvto.g:2518:3: ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' )
                    // InternalMyQvto.g:2519:4: ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')'
                    {
                    // InternalMyQvto.g:2519:4: ( (lv_collection_key_2_0= ruleCollectionKey ) )
                    // InternalMyQvto.g:2520:5: (lv_collection_key_2_0= ruleCollectionKey )
                    {
                    // InternalMyQvto.g:2520:5: (lv_collection_key_2_0= ruleCollectionKey )
                    // InternalMyQvto.g:2521:6: lv_collection_key_2_0= ruleCollectionKey
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComplexTypeAccess().getCollection_keyCollectionKeyEnumRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
                    lv_collection_key_2_0=ruleCollectionKey();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                      						}
                      						set(
                      							current,
                      							"collection_key",
                      							lv_collection_key_2_0,
                      							"org.omg.qvt10.myqvto.MyQvto.CollectionKey");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComplexTypeAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalMyQvto.g:2542:4: ( (lv_typespec_4_0= ruleTypeSpec ) )
                    // InternalMyQvto.g:2543:5: (lv_typespec_4_0= ruleTypeSpec )
                    {
                    // InternalMyQvto.g:2543:5: (lv_typespec_4_0= ruleTypeSpec )
                    // InternalMyQvto.g:2544:6: lv_typespec_4_0= ruleTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComplexTypeAccess().getTypespecTypeSpecParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_typespec_4_0=ruleTypeSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                      						}
                      						add(
                      							current,
                      							"typespec",
                      							lv_typespec_4_0,
                      							"org.omg.qvt10.myqvto.MyQvto.TypeSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getComplexTypeAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:2567:3: (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' )
                    {
                    // InternalMyQvto.g:2567:3: (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' )
                    // InternalMyQvto.g:2568:4: otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getComplexTypeAccess().getDictKeyword_2_0());
                      			
                    }
                    otherlv_7=(Token)match(input,28,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getComplexTypeAccess().getLeftParenthesisKeyword_2_1());
                      			
                    }
                    // InternalMyQvto.g:2576:4: ( (lv_typespec_8_0= ruleTypeSpec ) )
                    // InternalMyQvto.g:2577:5: (lv_typespec_8_0= ruleTypeSpec )
                    {
                    // InternalMyQvto.g:2577:5: (lv_typespec_8_0= ruleTypeSpec )
                    // InternalMyQvto.g:2578:6: lv_typespec_8_0= ruleTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComplexTypeAccess().getTypespecTypeSpecParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_typespec_8_0=ruleTypeSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                      						}
                      						add(
                      							current,
                      							"typespec",
                      							lv_typespec_8_0,
                      							"org.omg.qvt10.myqvto.MyQvto.TypeSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,14,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getComplexTypeAccess().getCommaKeyword_2_3());
                      			
                    }
                    // InternalMyQvto.g:2599:4: ( (lv_typespec_10_0= ruleTypeSpec ) )
                    // InternalMyQvto.g:2600:5: (lv_typespec_10_0= ruleTypeSpec )
                    {
                    // InternalMyQvto.g:2600:5: (lv_typespec_10_0= ruleTypeSpec )
                    // InternalMyQvto.g:2601:6: lv_typespec_10_0= ruleTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComplexTypeAccess().getTypespecTypeSpecParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_typespec_10_0=ruleTypeSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                      						}
                      						add(
                      							current,
                      							"typespec",
                      							lv_typespec_10_0,
                      							"org.omg.qvt10.myqvto.MyQvto.TypeSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getComplexTypeAccess().getRightParenthesisKeyword_2_5());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:2624:3: (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' )
                    {
                    // InternalMyQvto.g:2624:3: (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' )
                    // InternalMyQvto.g:2625:4: otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')'
                    {
                    otherlv_12=(Token)match(input,36,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getComplexTypeAccess().getTupleKeyword_3_0());
                      			
                    }
                    otherlv_13=(Token)match(input,28,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getComplexTypeAccess().getLeftParenthesisKeyword_3_1());
                      			
                    }
                    // InternalMyQvto.g:2633:4: ( (lv_declarator_list_14_0= ruleDeclaratorList ) )
                    // InternalMyQvto.g:2634:5: (lv_declarator_list_14_0= ruleDeclaratorList )
                    {
                    // InternalMyQvto.g:2634:5: (lv_declarator_list_14_0= ruleDeclaratorList )
                    // InternalMyQvto.g:2635:6: lv_declarator_list_14_0= ruleDeclaratorList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComplexTypeAccess().getDeclarator_listDeclaratorListParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_declarator_list_14_0=ruleDeclaratorList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                      						}
                      						set(
                      							current,
                      							"declarator_list",
                      							lv_declarator_list_14_0,
                      							"org.omg.qvt10.myqvto.MyQvto.DeclaratorList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getComplexTypeAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleDeclaratorList"
    // InternalMyQvto.g:2661:1: entryRuleDeclaratorList returns [EObject current=null] : iv_ruleDeclaratorList= ruleDeclaratorList EOF ;
    public final EObject entryRuleDeclaratorList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaratorList = null;


        try {
            // InternalMyQvto.g:2661:55: (iv_ruleDeclaratorList= ruleDeclaratorList EOF )
            // InternalMyQvto.g:2662:2: iv_ruleDeclaratorList= ruleDeclaratorList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaratorList=ruleDeclaratorList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaratorList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeclaratorList"


    // $ANTLR start "ruleDeclaratorList"
    // InternalMyQvto.g:2668:1: ruleDeclaratorList returns [EObject current=null] : ( () ( (lv_declarator_1_0= ruleDeclarator ) ) (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclaratorList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_declarator_1_0 = null;

        EObject lv_declarator_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2674:2: ( ( () ( (lv_declarator_1_0= ruleDeclarator ) ) (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )* ) )
            // InternalMyQvto.g:2675:2: ( () ( (lv_declarator_1_0= ruleDeclarator ) ) (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )* )
            {
            // InternalMyQvto.g:2675:2: ( () ( (lv_declarator_1_0= ruleDeclarator ) ) (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )* )
            // InternalMyQvto.g:2676:3: () ( (lv_declarator_1_0= ruleDeclarator ) ) (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )*
            {
            // InternalMyQvto.g:2676:3: ()
            // InternalMyQvto.g:2677:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDeclaratorListAccess().getDeclaratorListAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:2686:3: ( (lv_declarator_1_0= ruleDeclarator ) )
            // InternalMyQvto.g:2687:4: (lv_declarator_1_0= ruleDeclarator )
            {
            // InternalMyQvto.g:2687:4: (lv_declarator_1_0= ruleDeclarator )
            // InternalMyQvto.g:2688:5: lv_declarator_1_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeclaratorListAccess().getDeclaratorDeclaratorParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_declarator_1_0=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeclaratorListRule());
              					}
              					add(
              						current,
              						"declarator",
              						lv_declarator_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.Declarator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:2705:3: (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==14) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalMyQvto.g:2706:4: otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDeclaratorListAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:2710:4: ( (lv_declarator_3_0= ruleDeclarator ) )
            	    // InternalMyQvto.g:2711:5: (lv_declarator_3_0= ruleDeclarator )
            	    {
            	    // InternalMyQvto.g:2711:5: (lv_declarator_3_0= ruleDeclarator )
            	    // InternalMyQvto.g:2712:6: lv_declarator_3_0= ruleDeclarator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeclaratorListAccess().getDeclaratorDeclaratorParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_declarator_3_0=ruleDeclarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDeclaratorListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"declarator",
            	      							lv_declarator_3_0,
            	      							"org.omg.qvt10.myqvto.MyQvto.Declarator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDeclaratorList"


    // $ANTLR start "entryRuleHelperHeader"
    // InternalMyQvto.g:2734:1: entryRuleHelperHeader returns [EObject current=null] : iv_ruleHelperHeader= ruleHelperHeader EOF ;
    public final EObject entryRuleHelperHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelperHeader = null;


        try {
            // InternalMyQvto.g:2734:53: (iv_ruleHelperHeader= ruleHelperHeader EOF )
            // InternalMyQvto.g:2735:2: iv_ruleHelperHeader= ruleHelperHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHelperHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHelperHeader=ruleHelperHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHelperHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHelperHeader"


    // $ANTLR start "ruleHelperHeader"
    // InternalMyQvto.g:2741:1: ruleHelperHeader returns [EObject current=null] : ( ( (lv_helper_info_0_0= ruleHelperInfo ) ) ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_2_0= ruleCompleteSignature ) ) ) ;
    public final EObject ruleHelperHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_helper_info_0_0 = null;

        EObject lv_scope_identifier_1_0 = null;

        EObject lv_complete_signature_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2747:2: ( ( ( (lv_helper_info_0_0= ruleHelperInfo ) ) ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_2_0= ruleCompleteSignature ) ) ) )
            // InternalMyQvto.g:2748:2: ( ( (lv_helper_info_0_0= ruleHelperInfo ) ) ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_2_0= ruleCompleteSignature ) ) )
            {
            // InternalMyQvto.g:2748:2: ( ( (lv_helper_info_0_0= ruleHelperInfo ) ) ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_2_0= ruleCompleteSignature ) ) )
            // InternalMyQvto.g:2749:3: ( (lv_helper_info_0_0= ruleHelperInfo ) ) ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_2_0= ruleCompleteSignature ) )
            {
            // InternalMyQvto.g:2749:3: ( (lv_helper_info_0_0= ruleHelperInfo ) )
            // InternalMyQvto.g:2750:4: (lv_helper_info_0_0= ruleHelperInfo )
            {
            // InternalMyQvto.g:2750:4: (lv_helper_info_0_0= ruleHelperInfo )
            // InternalMyQvto.g:2751:5: lv_helper_info_0_0= ruleHelperInfo
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHelperHeaderAccess().getHelper_infoHelperInfoParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_helper_info_0_0=ruleHelperInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHelperHeaderRule());
              					}
              					set(
              						current,
              						"helper_info",
              						lv_helper_info_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.HelperInfo");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:2768:3: ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:2769:4: (lv_scope_identifier_1_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:2769:4: (lv_scope_identifier_1_0= ruleScopedIdentifier )
            // InternalMyQvto.g:2770:5: lv_scope_identifier_1_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHelperHeaderAccess().getScope_identifierScopedIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_scope_identifier_1_0=ruleScopedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHelperHeaderRule());
              					}
              					set(
              						current,
              						"scope_identifier",
              						lv_scope_identifier_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:2787:3: ( (lv_complete_signature_2_0= ruleCompleteSignature ) )
            // InternalMyQvto.g:2788:4: (lv_complete_signature_2_0= ruleCompleteSignature )
            {
            // InternalMyQvto.g:2788:4: (lv_complete_signature_2_0= ruleCompleteSignature )
            // InternalMyQvto.g:2789:5: lv_complete_signature_2_0= ruleCompleteSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHelperHeaderAccess().getComplete_signatureCompleteSignatureParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_complete_signature_2_0=ruleCompleteSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHelperHeaderRule());
              					}
              					set(
              						current,
              						"complete_signature",
              						lv_complete_signature_2_0,
              						"org.omg.qvt10.myqvto.MyQvto.CompleteSignature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHelperHeader"


    // $ANTLR start "entryRuleMappingBody"
    // InternalMyQvto.g:2810:1: entryRuleMappingBody returns [EObject current=null] : iv_ruleMappingBody= ruleMappingBody EOF ;
    public final EObject entryRuleMappingBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingBody = null;


        try {
            // InternalMyQvto.g:2810:52: (iv_ruleMappingBody= ruleMappingBody EOF )
            // InternalMyQvto.g:2811:2: iv_ruleMappingBody= ruleMappingBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMappingBody=ruleMappingBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMappingBody"


    // $ANTLR start "ruleMappingBody"
    // InternalMyQvto.g:2817:1: ruleMappingBody returns [EObject current=null] : ( () (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )? ( (lv_population_section_8_0= rulePopulationSection ) )? (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )? ) ;
    public final EObject ruleMappingBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_initSection_3_0 = null;

        EObject lv_initSection_5_0 = null;

        EObject lv_population_section_8_0 = null;

        EObject lv_endSection_11_0 = null;

        EObject lv_endSection_13_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2823:2: ( ( () (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )? ( (lv_population_section_8_0= rulePopulationSection ) )? (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )? ) )
            // InternalMyQvto.g:2824:2: ( () (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )? ( (lv_population_section_8_0= rulePopulationSection ) )? (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )? )
            {
            // InternalMyQvto.g:2824:2: ( () (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )? ( (lv_population_section_8_0= rulePopulationSection ) )? (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )? )
            // InternalMyQvto.g:2825:3: () (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )? ( (lv_population_section_8_0= rulePopulationSection ) )? (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )?
            {
            // InternalMyQvto.g:2825:3: ()
            // InternalMyQvto.g:2826:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMappingBodyAccess().getMappingBodyAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:2835:3: (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==37) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyQvto.g:2836:4: otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMappingBodyAccess().getInitKeyword_1_0());
                      			
                    }
                    otherlv_2=(Token)match(input,21,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMappingBodyAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    // InternalMyQvto.g:2844:4: ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_STRING)||LA54_0==16) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==22) ) {
                        int LA54_2 = input.LA(2);

                        if ( (synpred76_InternalMyQvto()) ) {
                            alt54=1;
                        }
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalMyQvto.g:2845:5: ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )?
                            {
                            // InternalMyQvto.g:2845:5: ( (lv_initSection_3_0= ruleExpressionGO ) )
                            // InternalMyQvto.g:2846:6: (lv_initSection_3_0= ruleExpressionGO )
                            {
                            // InternalMyQvto.g:2846:6: (lv_initSection_3_0= ruleExpressionGO )
                            // InternalMyQvto.g:2847:7: lv_initSection_3_0= ruleExpressionGO
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMappingBodyAccess().getInitSectionExpressionGOParserRuleCall_1_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_42);
                            lv_initSection_3_0=ruleExpressionGO();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getMappingBodyRule());
                              							}
                              							add(
                              								current,
                              								"initSection",
                              								lv_initSection_3_0,
                              								"org.omg.qvt10.myqvto.MyQvto.ExpressionGO");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalMyQvto.g:2864:5: (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==16) ) {
                                    int LA52_1 = input.LA(2);

                                    if ( (synpred74_InternalMyQvto()) ) {
                                        alt52=1;
                                    }


                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalMyQvto.g:2865:6: otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) )
                            	    {
                            	    otherlv_4=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getMappingBodyAccess().getSemicolonKeyword_1_2_1_0());
                            	      					
                            	    }
                            	    // InternalMyQvto.g:2869:6: ( (lv_initSection_5_0= ruleExpressionGO ) )
                            	    // InternalMyQvto.g:2870:7: (lv_initSection_5_0= ruleExpressionGO )
                            	    {
                            	    // InternalMyQvto.g:2870:7: (lv_initSection_5_0= ruleExpressionGO )
                            	    // InternalMyQvto.g:2871:8: lv_initSection_5_0= ruleExpressionGO
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMappingBodyAccess().getInitSectionExpressionGOParserRuleCall_1_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_42);
                            	    lv_initSection_5_0=ruleExpressionGO();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getMappingBodyRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"initSection",
                            	      									lv_initSection_5_0,
                            	      									"org.omg.qvt10.myqvto.MyQvto.ExpressionGO");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);

                            // InternalMyQvto.g:2889:5: (otherlv_6= ';' )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==16) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // InternalMyQvto.g:2890:6: otherlv_6= ';'
                                    {
                                    otherlv_6=(Token)match(input,16,FOLLOW_21); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_6, grammarAccess.getMappingBodyAccess().getSemicolonKeyword_1_2_2());
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getMappingBodyAccess().getRightCurlyBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalMyQvto.g:2901:3: ( (lv_population_section_8_0= rulePopulationSection ) )?
            int alt56=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                case RULE_STRING:
                case 14:
                case 16:
                case 39:
                    {
                    alt56=1;
                    }
                    break;
                case 38:
                    {
                    int LA56_2 = input.LA(2);

                    if ( (synpred78_InternalMyQvto()) ) {
                        alt56=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA56_3 = input.LA(2);

                    if ( (synpred78_InternalMyQvto()) ) {
                        alt56=1;
                    }
                    }
                    break;
                case EOF:
                    {
                    int LA56_4 = input.LA(2);

                    if ( (synpred78_InternalMyQvto()) ) {
                        alt56=1;
                    }
                    }
                    break;
            }

            switch (alt56) {
                case 1 :
                    // InternalMyQvto.g:2902:4: (lv_population_section_8_0= rulePopulationSection )
                    {
                    // InternalMyQvto.g:2902:4: (lv_population_section_8_0= rulePopulationSection )
                    // InternalMyQvto.g:2903:5: lv_population_section_8_0= rulePopulationSection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMappingBodyAccess().getPopulation_sectionPopulationSectionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_44);
                    lv_population_section_8_0=rulePopulationSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMappingBodyRule());
                      					}
                      					set(
                      						current,
                      						"population_section",
                      						lv_population_section_8_0,
                      						"org.omg.qvt10.myqvto.MyQvto.PopulationSection");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:2920:3: (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==38) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyQvto.g:2921:4: otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}'
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getMappingBodyAccess().getEndKeyword_3_0());
                      			
                    }
                    otherlv_10=(Token)match(input,21,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getMappingBodyAccess().getLeftCurlyBracketKeyword_3_1());
                      			
                    }
                    // InternalMyQvto.g:2929:4: ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_STRING)||LA59_0==16) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==22) ) {
                        int LA59_2 = input.LA(2);

                        if ( (synpred81_InternalMyQvto()) ) {
                            alt59=1;
                        }
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalMyQvto.g:2930:5: ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )?
                            {
                            // InternalMyQvto.g:2930:5: ( (lv_endSection_11_0= ruleExpressionGO ) )
                            // InternalMyQvto.g:2931:6: (lv_endSection_11_0= ruleExpressionGO )
                            {
                            // InternalMyQvto.g:2931:6: (lv_endSection_11_0= ruleExpressionGO )
                            // InternalMyQvto.g:2932:7: lv_endSection_11_0= ruleExpressionGO
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMappingBodyAccess().getEndSectionExpressionGOParserRuleCall_3_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_42);
                            lv_endSection_11_0=ruleExpressionGO();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getMappingBodyRule());
                              							}
                              							add(
                              								current,
                              								"endSection",
                              								lv_endSection_11_0,
                              								"org.omg.qvt10.myqvto.MyQvto.ExpressionGO");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalMyQvto.g:2949:5: (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==16) ) {
                                    int LA57_1 = input.LA(2);

                                    if ( (synpred79_InternalMyQvto()) ) {
                                        alt57=1;
                                    }


                                }


                                switch (alt57) {
                            	case 1 :
                            	    // InternalMyQvto.g:2950:6: otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) )
                            	    {
                            	    otherlv_12=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_12, grammarAccess.getMappingBodyAccess().getSemicolonKeyword_3_2_1_0());
                            	      					
                            	    }
                            	    // InternalMyQvto.g:2954:6: ( (lv_endSection_13_0= ruleExpressionGO ) )
                            	    // InternalMyQvto.g:2955:7: (lv_endSection_13_0= ruleExpressionGO )
                            	    {
                            	    // InternalMyQvto.g:2955:7: (lv_endSection_13_0= ruleExpressionGO )
                            	    // InternalMyQvto.g:2956:8: lv_endSection_13_0= ruleExpressionGO
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMappingBodyAccess().getEndSectionExpressionGOParserRuleCall_3_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_42);
                            	    lv_endSection_13_0=ruleExpressionGO();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getMappingBodyRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"endSection",
                            	      									lv_endSection_13_0,
                            	      									"org.omg.qvt10.myqvto.MyQvto.ExpressionGO");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop57;
                                }
                            } while (true);

                            // InternalMyQvto.g:2974:5: (otherlv_14= ';' )?
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==16) ) {
                                alt58=1;
                            }
                            switch (alt58) {
                                case 1 :
                                    // InternalMyQvto.g:2975:6: otherlv_14= ';'
                                    {
                                    otherlv_14=(Token)match(input,16,FOLLOW_21); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_14, grammarAccess.getMappingBodyAccess().getSemicolonKeyword_3_2_2());
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getMappingBodyAccess().getRightCurlyBracketKeyword_3_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMappingBody"


    // $ANTLR start "entryRulePopulationSection"
    // InternalMyQvto.g:2990:1: entryRulePopulationSection returns [EObject current=null] : iv_rulePopulationSection= rulePopulationSection EOF ;
    public final EObject entryRulePopulationSection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopulationSection = null;


        try {
            // InternalMyQvto.g:2990:58: (iv_rulePopulationSection= rulePopulationSection EOF )
            // InternalMyQvto.g:2991:2: iv_rulePopulationSection= rulePopulationSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPopulationSectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePopulationSection=rulePopulationSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePopulationSection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePopulationSection"


    // $ANTLR start "rulePopulationSection"
    // InternalMyQvto.g:2997:1: rulePopulationSection returns [EObject current=null] : ( ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) ) | (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) ) ) ;
    public final EObject rulePopulationSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expression_list_1_0 = null;

        EObject lv_expression_block_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3003:2: ( ( ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) ) | (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) ) ) )
            // InternalMyQvto.g:3004:2: ( ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) ) | (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) ) )
            {
            // InternalMyQvto.g:3004:2: ( ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) ) | (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==EOF||(LA61_0>=RULE_ID && LA61_0<=RULE_STRING)||LA61_0==14||LA61_0==16||(LA61_0>=19 && LA61_0<=22)||(LA61_0>=26 && LA61_0<=29)||LA61_0==38||LA61_0==41||LA61_0==44||LA61_0==56||(LA61_0>=75 && LA61_0<=77)) ) {
                alt61=1;
            }
            else if ( (LA61_0==39) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyQvto.g:3005:3: ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) )
                    {
                    // InternalMyQvto.g:3005:3: ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) )
                    // InternalMyQvto.g:3006:4: () ( (lv_expression_list_1_0= ruleExpressionList ) )
                    {
                    // InternalMyQvto.g:3006:4: ()
                    // InternalMyQvto.g:3007:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPopulationSectionAccess().getPopulationSectionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyQvto.g:3016:4: ( (lv_expression_list_1_0= ruleExpressionList ) )
                    // InternalMyQvto.g:3017:5: (lv_expression_list_1_0= ruleExpressionList )
                    {
                    // InternalMyQvto.g:3017:5: (lv_expression_list_1_0= ruleExpressionList )
                    // InternalMyQvto.g:3018:6: lv_expression_list_1_0= ruleExpressionList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPopulationSectionAccess().getExpression_listExpressionListParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_list_1_0=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPopulationSectionRule());
                      						}
                      						set(
                      							current,
                      							"expression_list",
                      							lv_expression_list_1_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ExpressionList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:3037:3: (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) )
                    {
                    // InternalMyQvto.g:3037:3: (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) )
                    // InternalMyQvto.g:3038:4: otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPopulationSectionAccess().getPopulationKeyword_1_0());
                      			
                    }
                    // InternalMyQvto.g:3042:4: ( (lv_expression_block_3_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:3043:5: (lv_expression_block_3_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:3043:5: (lv_expression_block_3_0= ruleExpressionBlock )
                    // InternalMyQvto.g:3044:6: lv_expression_block_3_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPopulationSectionAccess().getExpression_blockExpressionBlockParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_block_3_0=ruleExpressionBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPopulationSectionRule());
                      						}
                      						set(
                      							current,
                      							"expression_block",
                      							lv_expression_block_3_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ExpressionBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePopulationSection"


    // $ANTLR start "entryRuleHelperInfo"
    // InternalMyQvto.g:3066:1: entryRuleHelperInfo returns [EObject current=null] : iv_ruleHelperInfo= ruleHelperInfo EOF ;
    public final EObject entryRuleHelperInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelperInfo = null;


        try {
            // InternalMyQvto.g:3066:51: (iv_ruleHelperInfo= ruleHelperInfo EOF )
            // InternalMyQvto.g:3067:2: iv_ruleHelperInfo= ruleHelperInfo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHelperInfoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHelperInfo=ruleHelperInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHelperInfo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHelperInfo"


    // $ANTLR start "ruleHelperInfo"
    // InternalMyQvto.g:3073:1: ruleHelperInfo returns [EObject current=null] : ( () ( (lv_qualifier_1_0= ruleGeneralQualifier ) )* ( (lv_helper_kind_2_0= ruleHelperKind ) ) ) ;
    public final EObject ruleHelperInfo() throws RecognitionException {
        EObject current = null;

        Enumerator lv_qualifier_1_0 = null;

        Enumerator lv_helper_kind_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3079:2: ( ( () ( (lv_qualifier_1_0= ruleGeneralQualifier ) )* ( (lv_helper_kind_2_0= ruleHelperKind ) ) ) )
            // InternalMyQvto.g:3080:2: ( () ( (lv_qualifier_1_0= ruleGeneralQualifier ) )* ( (lv_helper_kind_2_0= ruleHelperKind ) ) )
            {
            // InternalMyQvto.g:3080:2: ( () ( (lv_qualifier_1_0= ruleGeneralQualifier ) )* ( (lv_helper_kind_2_0= ruleHelperKind ) ) )
            // InternalMyQvto.g:3081:3: () ( (lv_qualifier_1_0= ruleGeneralQualifier ) )* ( (lv_helper_kind_2_0= ruleHelperKind ) )
            {
            // InternalMyQvto.g:3081:3: ()
            // InternalMyQvto.g:3082:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHelperInfoAccess().getHelperInfoAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:3091:3: ( (lv_qualifier_1_0= ruleGeneralQualifier ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=70 && LA62_0<=72)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalMyQvto.g:3092:4: (lv_qualifier_1_0= ruleGeneralQualifier )
            	    {
            	    // InternalMyQvto.g:3092:4: (lv_qualifier_1_0= ruleGeneralQualifier )
            	    // InternalMyQvto.g:3093:5: lv_qualifier_1_0= ruleGeneralQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getHelperInfoAccess().getQualifierGeneralQualifierEnumRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_qualifier_1_0=ruleGeneralQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getHelperInfoRule());
            	      					}
            	      					add(
            	      						current,
            	      						"qualifier",
            	      						lv_qualifier_1_0,
            	      						"org.omg.qvt10.myqvto.MyQvto.GeneralQualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // InternalMyQvto.g:3110:3: ( (lv_helper_kind_2_0= ruleHelperKind ) )
            // InternalMyQvto.g:3111:4: (lv_helper_kind_2_0= ruleHelperKind )
            {
            // InternalMyQvto.g:3111:4: (lv_helper_kind_2_0= ruleHelperKind )
            // InternalMyQvto.g:3112:5: lv_helper_kind_2_0= ruleHelperKind
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHelperInfoAccess().getHelper_kindHelperKindEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_helper_kind_2_0=ruleHelperKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHelperInfoRule());
              					}
              					set(
              						current,
              						"helper_kind",
              						lv_helper_kind_2_0,
              						"org.omg.qvt10.myqvto.MyQvto.HelperKind");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHelperInfo"


    // $ANTLR start "entryRuleCompleteSignature"
    // InternalMyQvto.g:3133:1: entryRuleCompleteSignature returns [EObject current=null] : iv_ruleCompleteSignature= ruleCompleteSignature EOF ;
    public final EObject entryRuleCompleteSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteSignature = null;


        try {
            // InternalMyQvto.g:3133:58: (iv_ruleCompleteSignature= ruleCompleteSignature EOF )
            // InternalMyQvto.g:3134:2: iv_ruleCompleteSignature= ruleCompleteSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompleteSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompleteSignature=ruleCompleteSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompleteSignature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompleteSignature"


    // $ANTLR start "ruleCompleteSignature"
    // InternalMyQvto.g:3140:1: ruleCompleteSignature returns [EObject current=null] : ( ( (lv_simple_signature_0_0= ruleSimpleSignature ) ) (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )? ) ;
    public final EObject ruleCompleteSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_simple_signature_0_0 = null;

        EObject lv_param_list_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3146:2: ( ( ( (lv_simple_signature_0_0= ruleSimpleSignature ) ) (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )? ) )
            // InternalMyQvto.g:3147:2: ( ( (lv_simple_signature_0_0= ruleSimpleSignature ) ) (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )? )
            {
            // InternalMyQvto.g:3147:2: ( ( (lv_simple_signature_0_0= ruleSimpleSignature ) ) (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )? )
            // InternalMyQvto.g:3148:3: ( (lv_simple_signature_0_0= ruleSimpleSignature ) ) (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )?
            {
            // InternalMyQvto.g:3148:3: ( (lv_simple_signature_0_0= ruleSimpleSignature ) )
            // InternalMyQvto.g:3149:4: (lv_simple_signature_0_0= ruleSimpleSignature )
            {
            // InternalMyQvto.g:3149:4: (lv_simple_signature_0_0= ruleSimpleSignature )
            // InternalMyQvto.g:3150:5: lv_simple_signature_0_0= ruleSimpleSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompleteSignatureAccess().getSimple_signatureSimpleSignatureParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_simple_signature_0_0=ruleSimpleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompleteSignatureRule());
              					}
              					set(
              						current,
              						"simple_signature",
              						lv_simple_signature_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.SimpleSignature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3167:3: (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==31) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyQvto.g:3168:4: otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCompleteSignatureAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalMyQvto.g:3172:4: ( (lv_param_list_2_0= ruleParamList ) )
                    // InternalMyQvto.g:3173:5: (lv_param_list_2_0= ruleParamList )
                    {
                    // InternalMyQvto.g:3173:5: (lv_param_list_2_0= ruleParamList )
                    // InternalMyQvto.g:3174:6: lv_param_list_2_0= ruleParamList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCompleteSignatureAccess().getParam_listParamListParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_param_list_2_0=ruleParamList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCompleteSignatureRule());
                      						}
                      						set(
                      							current,
                      							"param_list",
                      							lv_param_list_2_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ParamList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompleteSignature"


    // $ANTLR start "entryRuleSimpleSignature"
    // InternalMyQvto.g:3196:1: entryRuleSimpleSignature returns [EObject current=null] : iv_ruleSimpleSignature= ruleSimpleSignature EOF ;
    public final EObject entryRuleSimpleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSignature = null;


        try {
            // InternalMyQvto.g:3196:56: (iv_ruleSimpleSignature= ruleSimpleSignature EOF )
            // InternalMyQvto.g:3197:2: iv_ruleSimpleSignature= ruleSimpleSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleSignature=ruleSimpleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleSignature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleSignature"


    // $ANTLR start "ruleSimpleSignature"
    // InternalMyQvto.g:3203:1: ruleSimpleSignature returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_param_list_2_0= ruleParamList ) )? otherlv_3= ')' ) ;
    public final EObject ruleSimpleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_param_list_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3209:2: ( ( () otherlv_1= '(' ( (lv_param_list_2_0= ruleParamList ) )? otherlv_3= ')' ) )
            // InternalMyQvto.g:3210:2: ( () otherlv_1= '(' ( (lv_param_list_2_0= ruleParamList ) )? otherlv_3= ')' )
            {
            // InternalMyQvto.g:3210:2: ( () otherlv_1= '(' ( (lv_param_list_2_0= ruleParamList ) )? otherlv_3= ')' )
            // InternalMyQvto.g:3211:3: () otherlv_1= '(' ( (lv_param_list_2_0= ruleParamList ) )? otherlv_3= ')'
            {
            // InternalMyQvto.g:3211:3: ()
            // InternalMyQvto.g:3212:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSimpleSignatureAccess().getSimpleSignatureAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSimpleSignatureAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMyQvto.g:3225:3: ( (lv_param_list_2_0= ruleParamList ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID||(LA64_0>=35 && LA64_0<=36)||(LA64_0>=61 && LA64_0<=69)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyQvto.g:3226:4: (lv_param_list_2_0= ruleParamList )
                    {
                    // InternalMyQvto.g:3226:4: (lv_param_list_2_0= ruleParamList )
                    // InternalMyQvto.g:3227:5: lv_param_list_2_0= ruleParamList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleSignatureAccess().getParam_listParamListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    lv_param_list_2_0=ruleParamList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSimpleSignatureRule());
                      					}
                      					set(
                      						current,
                      						"param_list",
                      						lv_param_list_2_0,
                      						"org.omg.qvt10.myqvto.MyQvto.ParamList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSimpleSignatureAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleSignature"


    // $ANTLR start "entryRuleParamList"
    // InternalMyQvto.g:3252:1: entryRuleParamList returns [EObject current=null] : iv_ruleParamList= ruleParamList EOF ;
    public final EObject entryRuleParamList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamList = null;


        try {
            // InternalMyQvto.g:3252:50: (iv_ruleParamList= ruleParamList EOF )
            // InternalMyQvto.g:3253:2: iv_ruleParamList= ruleParamList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParamList=ruleParamList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParamList"


    // $ANTLR start "ruleParamList"
    // InternalMyQvto.g:3259:1: ruleParamList returns [EObject current=null] : ( () ( (lv_param_1_0= ruleVarParameter ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )* ) ;
    public final EObject ruleParamList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_param_1_0 = null;

        EObject lv_param_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3265:2: ( ( () ( (lv_param_1_0= ruleVarParameter ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )* ) )
            // InternalMyQvto.g:3266:2: ( () ( (lv_param_1_0= ruleVarParameter ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )* )
            {
            // InternalMyQvto.g:3266:2: ( () ( (lv_param_1_0= ruleVarParameter ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )* )
            // InternalMyQvto.g:3267:3: () ( (lv_param_1_0= ruleVarParameter ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )*
            {
            // InternalMyQvto.g:3267:3: ()
            // InternalMyQvto.g:3268:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParamListAccess().getParamListAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:3277:3: ( (lv_param_1_0= ruleVarParameter ) )
            // InternalMyQvto.g:3278:4: (lv_param_1_0= ruleVarParameter )
            {
            // InternalMyQvto.g:3278:4: (lv_param_1_0= ruleVarParameter )
            // InternalMyQvto.g:3279:5: lv_param_1_0= ruleVarParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamListAccess().getParamVarParameterParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_param_1_0=ruleVarParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParamListRule());
              					}
              					add(
              						current,
              						"param",
              						lv_param_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.VarParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3296:3: (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==14) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalMyQvto.g:3297:4: otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getParamListAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:3301:4: ( (lv_param_3_0= ruleVarParameter ) )
            	    // InternalMyQvto.g:3302:5: (lv_param_3_0= ruleVarParameter )
            	    {
            	    // InternalMyQvto.g:3302:5: (lv_param_3_0= ruleVarParameter )
            	    // InternalMyQvto.g:3303:6: lv_param_3_0= ruleVarParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParamListAccess().getParamVarParameterParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_param_3_0=ruleVarParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getParamListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"param",
            	      							lv_param_3_0,
            	      							"org.omg.qvt10.myqvto.MyQvto.VarParameter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParamList"


    // $ANTLR start "entryRuleTransformationHeader"
    // InternalMyQvto.g:3325:1: entryRuleTransformationHeader returns [EObject current=null] : iv_ruleTransformationHeader= ruleTransformationHeader EOF ;
    public final EObject entryRuleTransformationHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationHeader = null;


        try {
            // InternalMyQvto.g:3325:61: (iv_ruleTransformationHeader= ruleTransformationHeader EOF )
            // InternalMyQvto.g:3326:2: iv_ruleTransformationHeader= ruleTransformationHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformationHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransformationHeader=ruleTransformationHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformationHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransformationHeader"


    // $ANTLR start "ruleTransformationHeader"
    // InternalMyQvto.g:3332:1: ruleTransformationHeader returns [EObject current=null] : ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'transformation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_transformation_signature_3_0= ruleSimpleSignature ) ) ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )? ) ;
    public final EObject ruleTransformationHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Enumerator lv_qualifier_0_0 = null;

        EObject lv_transformation_signature_3_0 = null;

        EObject lv_transformation_usage_refine_4_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3338:2: ( ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'transformation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_transformation_signature_3_0= ruleSimpleSignature ) ) ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )? ) )
            // InternalMyQvto.g:3339:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'transformation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_transformation_signature_3_0= ruleSimpleSignature ) ) ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )? )
            {
            // InternalMyQvto.g:3339:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'transformation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_transformation_signature_3_0= ruleSimpleSignature ) ) ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )? )
            // InternalMyQvto.g:3340:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'transformation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_transformation_signature_3_0= ruleSimpleSignature ) ) ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )?
            {
            // InternalMyQvto.g:3340:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=70 && LA66_0<=72)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalMyQvto.g:3341:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    {
            	    // InternalMyQvto.g:3341:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    // InternalMyQvto.g:3342:5: lv_qualifier_0_0= ruleGeneralQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTransformationHeaderAccess().getQualifierGeneralQualifierEnumRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_qualifier_0_0=ruleGeneralQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTransformationHeaderRule());
            	      					}
            	      					add(
            	      						current,
            	      						"qualifier",
            	      						lv_qualifier_0_0,
            	      						"org.omg.qvt10.myqvto.MyQvto.GeneralQualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_1=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTransformationHeaderAccess().getTransformationKeyword_1());
              		
            }
            // InternalMyQvto.g:3363:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyQvto.g:3364:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyQvto.g:3364:4: (lv_name_2_0= RULE_ID )
            // InternalMyQvto.g:3365:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getTransformationHeaderAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransformationHeaderRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMyQvto.g:3381:3: ( (lv_transformation_signature_3_0= ruleSimpleSignature ) )
            // InternalMyQvto.g:3382:4: (lv_transformation_signature_3_0= ruleSimpleSignature )
            {
            // InternalMyQvto.g:3382:4: (lv_transformation_signature_3_0= ruleSimpleSignature )
            // InternalMyQvto.g:3383:5: lv_transformation_signature_3_0= ruleSimpleSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransformationHeaderAccess().getTransformation_signatureSimpleSignatureParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_transformation_signature_3_0=ruleSimpleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTransformationHeaderRule());
              					}
              					set(
              						current,
              						"transformation_signature",
              						lv_transformation_signature_3_0,
              						"org.omg.qvt10.myqvto.MyQvto.SimpleSignature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3400:3: ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=41 && LA67_0<=43)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyQvto.g:3401:4: (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine )
                    {
                    // InternalMyQvto.g:3401:4: (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine )
                    // InternalMyQvto.g:3402:5: lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTransformationHeaderAccess().getTransformation_usage_refineTransformationUsageRefineParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_transformation_usage_refine_4_0=ruleTransformationUsageRefine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTransformationHeaderRule());
                      					}
                      					set(
                      						current,
                      						"transformation_usage_refine",
                      						lv_transformation_usage_refine_4_0,
                      						"org.omg.qvt10.myqvto.MyQvto.TransformationUsageRefine");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTransformationHeader"


    // $ANTLR start "entryRuleTransformationUsageRefine"
    // InternalMyQvto.g:3423:1: entryRuleTransformationUsageRefine returns [EObject current=null] : iv_ruleTransformationUsageRefine= ruleTransformationUsageRefine EOF ;
    public final EObject entryRuleTransformationUsageRefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationUsageRefine = null;


        try {
            // InternalMyQvto.g:3423:66: (iv_ruleTransformationUsageRefine= ruleTransformationUsageRefine EOF )
            // InternalMyQvto.g:3424:2: iv_ruleTransformationUsageRefine= ruleTransformationUsageRefine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformationUsageRefineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransformationUsageRefine=ruleTransformationUsageRefine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformationUsageRefine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransformationUsageRefine"


    // $ANTLR start "ruleTransformationUsageRefine"
    // InternalMyQvto.g:3430:1: ruleTransformationUsageRefine returns [EObject current=null] : ( ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) ) | (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) ) ) ;
    public final EObject ruleTransformationUsageRefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_module_usage_1_0 = null;

        EObject lv_transformation_refine_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3436:2: ( ( ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) ) | (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) ) ) )
            // InternalMyQvto.g:3437:2: ( ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) ) | (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) ) )
            {
            // InternalMyQvto.g:3437:2: ( ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) ) | (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=42 && LA68_0<=43)) ) {
                alt68=1;
            }
            else if ( (LA68_0==41) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyQvto.g:3438:3: ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) )
                    {
                    // InternalMyQvto.g:3438:3: ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) )
                    // InternalMyQvto.g:3439:4: () ( (lv_module_usage_1_0= ruleModuleUsageGO ) )
                    {
                    // InternalMyQvto.g:3439:4: ()
                    // InternalMyQvto.g:3440:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTransformationUsageRefineAccess().getTransformationUsageRefineAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyQvto.g:3449:4: ( (lv_module_usage_1_0= ruleModuleUsageGO ) )
                    // InternalMyQvto.g:3450:5: (lv_module_usage_1_0= ruleModuleUsageGO )
                    {
                    // InternalMyQvto.g:3450:5: (lv_module_usage_1_0= ruleModuleUsageGO )
                    // InternalMyQvto.g:3451:6: lv_module_usage_1_0= ruleModuleUsageGO
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransformationUsageRefineAccess().getModule_usageModuleUsageGOParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_module_usage_1_0=ruleModuleUsageGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransformationUsageRefineRule());
                      						}
                      						set(
                      							current,
                      							"module_usage",
                      							lv_module_usage_1_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ModuleUsageGO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:3470:3: (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) )
                    {
                    // InternalMyQvto.g:3470:3: (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) )
                    // InternalMyQvto.g:3471:4: otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTransformationUsageRefineAccess().getRefinesKeyword_1_0());
                      			
                    }
                    // InternalMyQvto.g:3475:4: ( (lv_transformation_refine_3_0= ruleModuleRefGO ) )
                    // InternalMyQvto.g:3476:5: (lv_transformation_refine_3_0= ruleModuleRefGO )
                    {
                    // InternalMyQvto.g:3476:5: (lv_transformation_refine_3_0= ruleModuleRefGO )
                    // InternalMyQvto.g:3477:6: lv_transformation_refine_3_0= ruleModuleRefGO
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransformationUsageRefineAccess().getTransformation_refineModuleRefGOParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_transformation_refine_3_0=ruleModuleRefGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransformationUsageRefineRule());
                      						}
                      						set(
                      							current,
                      							"transformation_refine",
                      							lv_transformation_refine_3_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ModuleRefGO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTransformationUsageRefine"


    // $ANTLR start "entryRuleModuleUsageGO"
    // InternalMyQvto.g:3499:1: entryRuleModuleUsageGO returns [EObject current=null] : iv_ruleModuleUsageGO= ruleModuleUsageGO EOF ;
    public final EObject entryRuleModuleUsageGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleUsageGO = null;


        try {
            // InternalMyQvto.g:3499:54: (iv_ruleModuleUsageGO= ruleModuleUsageGO EOF )
            // InternalMyQvto.g:3500:2: iv_ruleModuleUsageGO= ruleModuleUsageGO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleUsageGORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModuleUsageGO=ruleModuleUsageGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleUsageGO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModuleUsageGO"


    // $ANTLR start "ruleModuleUsageGO"
    // InternalMyQvto.g:3506:1: ruleModuleUsageGO returns [EObject current=null] : ( ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) ) | ( (lv_extends_usage_2_0= ruleExtendsUsage ) ) ) ;
    public final EObject ruleModuleUsageGO() throws RecognitionException {
        EObject current = null;

        EObject lv_access_usage_1_0 = null;

        EObject lv_extends_usage_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3512:2: ( ( ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) ) | ( (lv_extends_usage_2_0= ruleExtendsUsage ) ) ) )
            // InternalMyQvto.g:3513:2: ( ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) ) | ( (lv_extends_usage_2_0= ruleExtendsUsage ) ) )
            {
            // InternalMyQvto.g:3513:2: ( ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) ) | ( (lv_extends_usage_2_0= ruleExtendsUsage ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==42) ) {
                alt69=1;
            }
            else if ( (LA69_0==43) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyQvto.g:3514:3: ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) )
                    {
                    // InternalMyQvto.g:3514:3: ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) )
                    // InternalMyQvto.g:3515:4: () ( (lv_access_usage_1_0= ruleAccessUsage ) )
                    {
                    // InternalMyQvto.g:3515:4: ()
                    // InternalMyQvto.g:3516:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getModuleUsageGOAccess().getModuleUsageGOAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyQvto.g:3525:4: ( (lv_access_usage_1_0= ruleAccessUsage ) )
                    // InternalMyQvto.g:3526:5: (lv_access_usage_1_0= ruleAccessUsage )
                    {
                    // InternalMyQvto.g:3526:5: (lv_access_usage_1_0= ruleAccessUsage )
                    // InternalMyQvto.g:3527:6: lv_access_usage_1_0= ruleAccessUsage
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModuleUsageGOAccess().getAccess_usageAccessUsageParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_access_usage_1_0=ruleAccessUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModuleUsageGORule());
                      						}
                      						set(
                      							current,
                      							"access_usage",
                      							lv_access_usage_1_0,
                      							"org.omg.qvt10.myqvto.MyQvto.AccessUsage");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:3546:3: ( (lv_extends_usage_2_0= ruleExtendsUsage ) )
                    {
                    // InternalMyQvto.g:3546:3: ( (lv_extends_usage_2_0= ruleExtendsUsage ) )
                    // InternalMyQvto.g:3547:4: (lv_extends_usage_2_0= ruleExtendsUsage )
                    {
                    // InternalMyQvto.g:3547:4: (lv_extends_usage_2_0= ruleExtendsUsage )
                    // InternalMyQvto.g:3548:5: lv_extends_usage_2_0= ruleExtendsUsage
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModuleUsageGOAccess().getExtends_usageExtendsUsageParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_extends_usage_2_0=ruleExtendsUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getModuleUsageGORule());
                      					}
                      					set(
                      						current,
                      						"extends_usage",
                      						lv_extends_usage_2_0,
                      						"org.omg.qvt10.myqvto.MyQvto.ExtendsUsage");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModuleUsageGO"


    // $ANTLR start "entryRuleModuleRefGO"
    // InternalMyQvto.g:3569:1: entryRuleModuleRefGO returns [EObject current=null] : iv_ruleModuleRefGO= ruleModuleRefGO EOF ;
    public final EObject entryRuleModuleRefGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleRefGO = null;


        try {
            // InternalMyQvto.g:3569:52: (iv_ruleModuleRefGO= ruleModuleRefGO EOF )
            // InternalMyQvto.g:3570:2: iv_ruleModuleRefGO= ruleModuleRefGO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRefGORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModuleRefGO=ruleModuleRefGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleRefGO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModuleRefGO"


    // $ANTLR start "ruleModuleRefGO"
    // InternalMyQvto.g:3576:1: ruleModuleRefGO returns [EObject current=null] : ( ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_1_0= ruleSimpleSignature ) )? ) ;
    public final EObject ruleModuleRefGO() throws RecognitionException {
        EObject current = null;

        EObject lv_scoped_identifier_0_0 = null;

        EObject lv_simple_signature_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3582:2: ( ( ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_1_0= ruleSimpleSignature ) )? ) )
            // InternalMyQvto.g:3583:2: ( ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_1_0= ruleSimpleSignature ) )? )
            {
            // InternalMyQvto.g:3583:2: ( ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_1_0= ruleSimpleSignature ) )? )
            // InternalMyQvto.g:3584:3: ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_1_0= ruleSimpleSignature ) )?
            {
            // InternalMyQvto.g:3584:3: ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:3585:4: (lv_scoped_identifier_0_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:3585:4: (lv_scoped_identifier_0_0= ruleScopedIdentifier )
            // InternalMyQvto.g:3586:5: lv_scoped_identifier_0_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModuleRefGOAccess().getScoped_identifierScopedIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_scoped_identifier_0_0=ruleScopedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModuleRefGORule());
              					}
              					set(
              						current,
              						"scoped_identifier",
              						lv_scoped_identifier_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3603:3: ( (lv_simple_signature_1_0= ruleSimpleSignature ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==28) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyQvto.g:3604:4: (lv_simple_signature_1_0= ruleSimpleSignature )
                    {
                    // InternalMyQvto.g:3604:4: (lv_simple_signature_1_0= ruleSimpleSignature )
                    // InternalMyQvto.g:3605:5: lv_simple_signature_1_0= ruleSimpleSignature
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModuleRefGOAccess().getSimple_signatureSimpleSignatureParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_simple_signature_1_0=ruleSimpleSignature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getModuleRefGORule());
                      					}
                      					set(
                      						current,
                      						"simple_signature",
                      						lv_simple_signature_1_0,
                      						"org.omg.qvt10.myqvto.MyQvto.SimpleSignature");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModuleRefGO"


    // $ANTLR start "entryRuleAccessUsage"
    // InternalMyQvto.g:3626:1: entryRuleAccessUsage returns [EObject current=null] : iv_ruleAccessUsage= ruleAccessUsage EOF ;
    public final EObject entryRuleAccessUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessUsage = null;


        try {
            // InternalMyQvto.g:3626:52: (iv_ruleAccessUsage= ruleAccessUsage EOF )
            // InternalMyQvto.g:3627:2: iv_ruleAccessUsage= ruleAccessUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAccessUsage=ruleAccessUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessUsage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAccessUsage"


    // $ANTLR start "ruleAccessUsage"
    // InternalMyQvto.g:3633:1: ruleAccessUsage returns [EObject current=null] : ( () otherlv_1= 'access' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* ) ;
    public final EObject ruleAccessUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_module_kind_2_0 = null;

        EObject lv_moduleref_list_3_0 = null;

        EObject lv_moduleref_list_5_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3639:2: ( ( () otherlv_1= 'access' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* ) )
            // InternalMyQvto.g:3640:2: ( () otherlv_1= 'access' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* )
            {
            // InternalMyQvto.g:3640:2: ( () otherlv_1= 'access' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* )
            // InternalMyQvto.g:3641:3: () otherlv_1= 'access' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )*
            {
            // InternalMyQvto.g:3641:3: ()
            // InternalMyQvto.g:3642:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAccessUsageAccess().getAccessUsageAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAccessUsageAccess().getAccessKeyword_1());
              		
            }
            // InternalMyQvto.g:3655:3: ( (lv_module_kind_2_0= ruleModuleKind ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==40||LA71_0==48) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyQvto.g:3656:4: (lv_module_kind_2_0= ruleModuleKind )
                    {
                    // InternalMyQvto.g:3656:4: (lv_module_kind_2_0= ruleModuleKind )
                    // InternalMyQvto.g:3657:5: lv_module_kind_2_0= ruleModuleKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAccessUsageAccess().getModule_kindModuleKindEnumRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_module_kind_2_0=ruleModuleKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAccessUsageRule());
                      					}
                      					set(
                      						current,
                      						"module_kind",
                      						lv_module_kind_2_0,
                      						"org.omg.qvt10.myqvto.MyQvto.ModuleKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:3674:3: ( (lv_moduleref_list_3_0= ruleModuleRefGO ) )
            // InternalMyQvto.g:3675:4: (lv_moduleref_list_3_0= ruleModuleRefGO )
            {
            // InternalMyQvto.g:3675:4: (lv_moduleref_list_3_0= ruleModuleRefGO )
            // InternalMyQvto.g:3676:5: lv_moduleref_list_3_0= ruleModuleRefGO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAccessUsageAccess().getModuleref_listModuleRefGOParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_moduleref_list_3_0=ruleModuleRefGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAccessUsageRule());
              					}
              					add(
              						current,
              						"moduleref_list",
              						lv_moduleref_list_3_0,
              						"org.omg.qvt10.myqvto.MyQvto.ModuleRefGO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3693:3: (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==14) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalMyQvto.g:3694:4: otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getAccessUsageAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalMyQvto.g:3698:4: ( (lv_moduleref_list_5_0= ruleModuleRefGO ) )
            	    // InternalMyQvto.g:3699:5: (lv_moduleref_list_5_0= ruleModuleRefGO )
            	    {
            	    // InternalMyQvto.g:3699:5: (lv_moduleref_list_5_0= ruleModuleRefGO )
            	    // InternalMyQvto.g:3700:6: lv_moduleref_list_5_0= ruleModuleRefGO
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAccessUsageAccess().getModuleref_listModuleRefGOParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_moduleref_list_5_0=ruleModuleRefGO();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAccessUsageRule());
            	      						}
            	      						add(
            	      							current,
            	      							"moduleref_list",
            	      							lv_moduleref_list_5_0,
            	      							"org.omg.qvt10.myqvto.MyQvto.ModuleRefGO");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAccessUsage"


    // $ANTLR start "entryRuleExtendsUsage"
    // InternalMyQvto.g:3722:1: entryRuleExtendsUsage returns [EObject current=null] : iv_ruleExtendsUsage= ruleExtendsUsage EOF ;
    public final EObject entryRuleExtendsUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsUsage = null;


        try {
            // InternalMyQvto.g:3722:53: (iv_ruleExtendsUsage= ruleExtendsUsage EOF )
            // InternalMyQvto.g:3723:2: iv_ruleExtendsUsage= ruleExtendsUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendsUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtendsUsage=ruleExtendsUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendsUsage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExtendsUsage"


    // $ANTLR start "ruleExtendsUsage"
    // InternalMyQvto.g:3729:1: ruleExtendsUsage returns [EObject current=null] : ( () otherlv_1= 'extends' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* ) ;
    public final EObject ruleExtendsUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_module_kind_2_0 = null;

        EObject lv_moduleref_list_3_0 = null;

        EObject lv_moduleref_list_5_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3735:2: ( ( () otherlv_1= 'extends' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* ) )
            // InternalMyQvto.g:3736:2: ( () otherlv_1= 'extends' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* )
            {
            // InternalMyQvto.g:3736:2: ( () otherlv_1= 'extends' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* )
            // InternalMyQvto.g:3737:3: () otherlv_1= 'extends' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )*
            {
            // InternalMyQvto.g:3737:3: ()
            // InternalMyQvto.g:3738:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExtendsUsageAccess().getExtendsUsageAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExtendsUsageAccess().getExtendsKeyword_1());
              		
            }
            // InternalMyQvto.g:3751:3: ( (lv_module_kind_2_0= ruleModuleKind ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==40||LA73_0==48) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalMyQvto.g:3752:4: (lv_module_kind_2_0= ruleModuleKind )
                    {
                    // InternalMyQvto.g:3752:4: (lv_module_kind_2_0= ruleModuleKind )
                    // InternalMyQvto.g:3753:5: lv_module_kind_2_0= ruleModuleKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExtendsUsageAccess().getModule_kindModuleKindEnumRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_module_kind_2_0=ruleModuleKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExtendsUsageRule());
                      					}
                      					set(
                      						current,
                      						"module_kind",
                      						lv_module_kind_2_0,
                      						"org.omg.qvt10.myqvto.MyQvto.ModuleKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:3770:3: ( (lv_moduleref_list_3_0= ruleModuleRefGO ) )
            // InternalMyQvto.g:3771:4: (lv_moduleref_list_3_0= ruleModuleRefGO )
            {
            // InternalMyQvto.g:3771:4: (lv_moduleref_list_3_0= ruleModuleRefGO )
            // InternalMyQvto.g:3772:5: lv_moduleref_list_3_0= ruleModuleRefGO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExtendsUsageAccess().getModuleref_listModuleRefGOParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_moduleref_list_3_0=ruleModuleRefGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExtendsUsageRule());
              					}
              					add(
              						current,
              						"moduleref_list",
              						lv_moduleref_list_3_0,
              						"org.omg.qvt10.myqvto.MyQvto.ModuleRefGO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3789:3: (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==14) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalMyQvto.g:3790:4: otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getExtendsUsageAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalMyQvto.g:3794:4: ( (lv_moduleref_list_5_0= ruleModuleRefGO ) )
            	    // InternalMyQvto.g:3795:5: (lv_moduleref_list_5_0= ruleModuleRefGO )
            	    {
            	    // InternalMyQvto.g:3795:5: (lv_moduleref_list_5_0= ruleModuleRefGO )
            	    // InternalMyQvto.g:3796:6: lv_moduleref_list_5_0= ruleModuleRefGO
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExtendsUsageAccess().getModuleref_listModuleRefGOParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_moduleref_list_5_0=ruleModuleRefGO();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExtendsUsageRule());
            	      						}
            	      						add(
            	      							current,
            	      							"moduleref_list",
            	      							lv_moduleref_list_5_0,
            	      							"org.omg.qvt10.myqvto.MyQvto.ModuleRefGO");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExtendsUsage"


    // $ANTLR start "entryRuleMappingFullHeader"
    // InternalMyQvto.g:3818:1: entryRuleMappingFullHeader returns [EObject current=null] : iv_ruleMappingFullHeader= ruleMappingFullHeader EOF ;
    public final EObject entryRuleMappingFullHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingFullHeader = null;


        try {
            // InternalMyQvto.g:3818:58: (iv_ruleMappingFullHeader= ruleMappingFullHeader EOF )
            // InternalMyQvto.g:3819:2: iv_ruleMappingFullHeader= ruleMappingFullHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingFullHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMappingFullHeader=ruleMappingFullHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingFullHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMappingFullHeader"


    // $ANTLR start "ruleMappingFullHeader"
    // InternalMyQvto.g:3825:1: ruleMappingFullHeader returns [EObject current=null] : ( ( (lv_mapping_header_0_0= ruleMappingHeader ) ) (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )? (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )? ) ;
    public final EObject ruleMappingFullHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mapping_header_0_0 = null;

        EObject lv_when_2_0 = null;

        EObject lv_where_4_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3831:2: ( ( ( (lv_mapping_header_0_0= ruleMappingHeader ) ) (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )? (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )? ) )
            // InternalMyQvto.g:3832:2: ( ( (lv_mapping_header_0_0= ruleMappingHeader ) ) (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )? (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )? )
            {
            // InternalMyQvto.g:3832:2: ( ( (lv_mapping_header_0_0= ruleMappingHeader ) ) (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )? (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )? )
            // InternalMyQvto.g:3833:3: ( (lv_mapping_header_0_0= ruleMappingHeader ) ) (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )? (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )?
            {
            // InternalMyQvto.g:3833:3: ( (lv_mapping_header_0_0= ruleMappingHeader ) )
            // InternalMyQvto.g:3834:4: (lv_mapping_header_0_0= ruleMappingHeader )
            {
            // InternalMyQvto.g:3834:4: (lv_mapping_header_0_0= ruleMappingHeader )
            // InternalMyQvto.g:3835:5: lv_mapping_header_0_0= ruleMappingHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingFullHeaderAccess().getMapping_headerMappingHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_52);
            lv_mapping_header_0_0=ruleMappingHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMappingFullHeaderRule());
              					}
              					set(
              						current,
              						"mapping_header",
              						lv_mapping_header_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.MappingHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3852:3: (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==44) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyQvto.g:3853:4: otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMappingFullHeaderAccess().getWhenKeyword_1_0());
                      			
                    }
                    // InternalMyQvto.g:3857:4: ( (lv_when_2_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:3858:5: (lv_when_2_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:3858:5: (lv_when_2_0= ruleExpressionBlock )
                    // InternalMyQvto.g:3859:6: lv_when_2_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMappingFullHeaderAccess().getWhenExpressionBlockParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
                    lv_when_2_0=ruleExpressionBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMappingFullHeaderRule());
                      						}
                      						set(
                      							current,
                      							"when",
                      							lv_when_2_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ExpressionBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMyQvto.g:3877:3: (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==19) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMyQvto.g:3878:4: otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMappingFullHeaderAccess().getWhereKeyword_2_0());
                      			
                    }
                    // InternalMyQvto.g:3882:4: ( (lv_where_4_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:3883:5: (lv_where_4_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:3883:5: (lv_where_4_0= ruleExpressionBlock )
                    // InternalMyQvto.g:3884:6: lv_where_4_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMappingFullHeaderAccess().getWhereExpressionBlockParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_where_4_0=ruleExpressionBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMappingFullHeaderRule());
                      						}
                      						set(
                      							current,
                      							"where",
                      							lv_where_4_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ExpressionBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMappingFullHeader"


    // $ANTLR start "entryRuleMappingHeader"
    // InternalMyQvto.g:3906:1: entryRuleMappingHeader returns [EObject current=null] : iv_ruleMappingHeader= ruleMappingHeader EOF ;
    public final EObject entryRuleMappingHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingHeader = null;


        try {
            // InternalMyQvto.g:3906:54: (iv_ruleMappingHeader= ruleMappingHeader EOF )
            // InternalMyQvto.g:3907:2: iv_ruleMappingHeader= ruleMappingHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMappingHeader=ruleMappingHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMappingHeader"


    // $ANTLR start "ruleMappingHeader"
    // InternalMyQvto.g:3913:1: ruleMappingHeader returns [EObject current=null] : ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'mapping' ( (lv_param_direction_2_0= ruleDirectionKind ) )? ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ( (lv_mapping_extra_5_0= ruleMappingExtra ) )* ) ;
    public final EObject ruleMappingHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_qualifier_0_0 = null;

        Enumerator lv_param_direction_2_0 = null;

        EObject lv_scoped_identifier_3_0 = null;

        EObject lv_complete_signature_4_0 = null;

        EObject lv_mapping_extra_5_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3919:2: ( ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'mapping' ( (lv_param_direction_2_0= ruleDirectionKind ) )? ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ( (lv_mapping_extra_5_0= ruleMappingExtra ) )* ) )
            // InternalMyQvto.g:3920:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'mapping' ( (lv_param_direction_2_0= ruleDirectionKind ) )? ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ( (lv_mapping_extra_5_0= ruleMappingExtra ) )* )
            {
            // InternalMyQvto.g:3920:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'mapping' ( (lv_param_direction_2_0= ruleDirectionKind ) )? ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ( (lv_mapping_extra_5_0= ruleMappingExtra ) )* )
            // InternalMyQvto.g:3921:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'mapping' ( (lv_param_direction_2_0= ruleDirectionKind ) )? ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ( (lv_mapping_extra_5_0= ruleMappingExtra ) )*
            {
            // InternalMyQvto.g:3921:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=70 && LA77_0<=72)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalMyQvto.g:3922:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    {
            	    // InternalMyQvto.g:3922:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    // InternalMyQvto.g:3923:5: lv_qualifier_0_0= ruleGeneralQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMappingHeaderAccess().getQualifierGeneralQualifierEnumRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_qualifier_0_0=ruleGeneralQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMappingHeaderRule());
            	      					}
            	      					add(
            	      						current,
            	      						"qualifier",
            	      						lv_qualifier_0_0,
            	      						"org.omg.qvt10.myqvto.MyQvto.GeneralQualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_1=(Token)match(input,45,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMappingHeaderAccess().getMappingKeyword_1());
              		
            }
            // InternalMyQvto.g:3944:3: ( (lv_param_direction_2_0= ruleDirectionKind ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=61 && LA78_0<=63)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalMyQvto.g:3945:4: (lv_param_direction_2_0= ruleDirectionKind )
                    {
                    // InternalMyQvto.g:3945:4: (lv_param_direction_2_0= ruleDirectionKind )
                    // InternalMyQvto.g:3946:5: lv_param_direction_2_0= ruleDirectionKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMappingHeaderAccess().getParam_directionDirectionKindEnumRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_param_direction_2_0=ruleDirectionKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMappingHeaderRule());
                      					}
                      					set(
                      						current,
                      						"param_direction",
                      						lv_param_direction_2_0,
                      						"org.omg.qvt10.myqvto.MyQvto.DirectionKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:3963:3: ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:3964:4: (lv_scoped_identifier_3_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:3964:4: (lv_scoped_identifier_3_0= ruleScopedIdentifier )
            // InternalMyQvto.g:3965:5: lv_scoped_identifier_3_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingHeaderAccess().getScoped_identifierScopedIdentifierParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_scoped_identifier_3_0=ruleScopedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMappingHeaderRule());
              					}
              					set(
              						current,
              						"scoped_identifier",
              						lv_scoped_identifier_3_0,
              						"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3982:3: ( (lv_complete_signature_4_0= ruleCompleteSignature ) )
            // InternalMyQvto.g:3983:4: (lv_complete_signature_4_0= ruleCompleteSignature )
            {
            // InternalMyQvto.g:3983:4: (lv_complete_signature_4_0= ruleCompleteSignature )
            // InternalMyQvto.g:3984:5: lv_complete_signature_4_0= ruleCompleteSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingHeaderAccess().getComplete_signatureCompleteSignatureParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_complete_signature_4_0=ruleCompleteSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMappingHeaderRule());
              					}
              					set(
              						current,
              						"complete_signature",
              						lv_complete_signature_4_0,
              						"org.omg.qvt10.myqvto.MyQvto.CompleteSignature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4001:3: ( (lv_mapping_extra_5_0= ruleMappingExtra ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==41||(LA79_0>=75 && LA79_0<=77)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalMyQvto.g:4002:4: (lv_mapping_extra_5_0= ruleMappingExtra )
            	    {
            	    // InternalMyQvto.g:4002:4: (lv_mapping_extra_5_0= ruleMappingExtra )
            	    // InternalMyQvto.g:4003:5: lv_mapping_extra_5_0= ruleMappingExtra
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMappingHeaderAccess().getMapping_extraMappingExtraParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_mapping_extra_5_0=ruleMappingExtra();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMappingHeaderRule());
            	      					}
            	      					add(
            	      						current,
            	      						"mapping_extra",
            	      						lv_mapping_extra_5_0,
            	      						"org.omg.qvt10.myqvto.MyQvto.MappingExtra");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMappingHeader"


    // $ANTLR start "entryRuleMappingExtra"
    // InternalMyQvto.g:4024:1: entryRuleMappingExtra returns [EObject current=null] : iv_ruleMappingExtra= ruleMappingExtra EOF ;
    public final EObject entryRuleMappingExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingExtra = null;


        try {
            // InternalMyQvto.g:4024:53: (iv_ruleMappingExtra= ruleMappingExtra EOF )
            // InternalMyQvto.g:4025:2: iv_ruleMappingExtra= ruleMappingExtra EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingExtraRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMappingExtra=ruleMappingExtra();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingExtra; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMappingExtra"


    // $ANTLR start "ruleMappingExtra"
    // InternalMyQvto.g:4031:1: ruleMappingExtra returns [EObject current=null] : ( ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) ) | ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) ) ) ;
    public final EObject ruleMappingExtra() throws RecognitionException {
        EObject current = null;

        EObject lv_mapping_extension_1_0 = null;

        EObject lv_mapping_refinement_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4037:2: ( ( ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) ) | ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) ) ) )
            // InternalMyQvto.g:4038:2: ( ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) ) | ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) ) )
            {
            // InternalMyQvto.g:4038:2: ( ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) ) | ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=75 && LA80_0<=77)) ) {
                alt80=1;
            }
            else if ( (LA80_0==41) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalMyQvto.g:4039:3: ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) )
                    {
                    // InternalMyQvto.g:4039:3: ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) )
                    // InternalMyQvto.g:4040:4: () ( (lv_mapping_extension_1_0= ruleMappingExtension ) )
                    {
                    // InternalMyQvto.g:4040:4: ()
                    // InternalMyQvto.g:4041:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMappingExtraAccess().getMappingExtraAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyQvto.g:4050:4: ( (lv_mapping_extension_1_0= ruleMappingExtension ) )
                    // InternalMyQvto.g:4051:5: (lv_mapping_extension_1_0= ruleMappingExtension )
                    {
                    // InternalMyQvto.g:4051:5: (lv_mapping_extension_1_0= ruleMappingExtension )
                    // InternalMyQvto.g:4052:6: lv_mapping_extension_1_0= ruleMappingExtension
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMappingExtraAccess().getMapping_extensionMappingExtensionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_mapping_extension_1_0=ruleMappingExtension();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMappingExtraRule());
                      						}
                      						set(
                      							current,
                      							"mapping_extension",
                      							lv_mapping_extension_1_0,
                      							"org.omg.qvt10.myqvto.MyQvto.MappingExtension");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:4071:3: ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) )
                    {
                    // InternalMyQvto.g:4071:3: ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) )
                    // InternalMyQvto.g:4072:4: (lv_mapping_refinement_2_0= ruleMappingRefinement )
                    {
                    // InternalMyQvto.g:4072:4: (lv_mapping_refinement_2_0= ruleMappingRefinement )
                    // InternalMyQvto.g:4073:5: lv_mapping_refinement_2_0= ruleMappingRefinement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMappingExtraAccess().getMapping_refinementMappingRefinementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_mapping_refinement_2_0=ruleMappingRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMappingExtraRule());
                      					}
                      					set(
                      						current,
                      						"mapping_refinement",
                      						lv_mapping_refinement_2_0,
                      						"org.omg.qvt10.myqvto.MyQvto.MappingRefinement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMappingExtra"


    // $ANTLR start "entryRuleMappingExtension"
    // InternalMyQvto.g:4094:1: entryRuleMappingExtension returns [EObject current=null] : iv_ruleMappingExtension= ruleMappingExtension EOF ;
    public final EObject entryRuleMappingExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingExtension = null;


        try {
            // InternalMyQvto.g:4094:57: (iv_ruleMappingExtension= ruleMappingExtension EOF )
            // InternalMyQvto.g:4095:2: iv_ruleMappingExtension= ruleMappingExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingExtensionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMappingExtension=ruleMappingExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingExtension; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMappingExtension"


    // $ANTLR start "ruleMappingExtension"
    // InternalMyQvto.g:4101:1: ruleMappingExtension returns [EObject current=null] : ( ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) ) ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) ) ;
    public final EObject ruleMappingExtension() throws RecognitionException {
        EObject current = null;

        Enumerator lv_mapping_extension_key_0_0 = null;

        EObject lv_scoped_identifier_list_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4107:2: ( ( ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) ) ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) ) )
            // InternalMyQvto.g:4108:2: ( ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) ) ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) )
            {
            // InternalMyQvto.g:4108:2: ( ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) ) ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) )
            // InternalMyQvto.g:4109:3: ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) ) ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) )
            {
            // InternalMyQvto.g:4109:3: ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) )
            // InternalMyQvto.g:4110:4: (lv_mapping_extension_key_0_0= ruleMappingExtensionKey )
            {
            // InternalMyQvto.g:4110:4: (lv_mapping_extension_key_0_0= ruleMappingExtensionKey )
            // InternalMyQvto.g:4111:5: lv_mapping_extension_key_0_0= ruleMappingExtensionKey
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingExtensionAccess().getMapping_extension_keyMappingExtensionKeyEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_mapping_extension_key_0_0=ruleMappingExtensionKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMappingExtensionRule());
              					}
              					set(
              						current,
              						"mapping_extension_key",
              						lv_mapping_extension_key_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.MappingExtensionKey");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4128:3: ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) )
            // InternalMyQvto.g:4129:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList )
            {
            // InternalMyQvto.g:4129:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList )
            // InternalMyQvto.g:4130:5: lv_scoped_identifier_list_1_0= ruleScopedIdentifierList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingExtensionAccess().getScoped_identifier_listScopedIdentifierListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_scoped_identifier_list_1_0=ruleScopedIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMappingExtensionRule());
              					}
              					set(
              						current,
              						"scoped_identifier_list",
              						lv_scoped_identifier_list_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifierList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMappingExtension"


    // $ANTLR start "entryRuleMappingRefinement"
    // InternalMyQvto.g:4151:1: entryRuleMappingRefinement returns [EObject current=null] : iv_ruleMappingRefinement= ruleMappingRefinement EOF ;
    public final EObject entryRuleMappingRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRefinement = null;


        try {
            // InternalMyQvto.g:4151:58: (iv_ruleMappingRefinement= ruleMappingRefinement EOF )
            // InternalMyQvto.g:4152:2: iv_ruleMappingRefinement= ruleMappingRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRefinementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMappingRefinement=ruleMappingRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingRefinement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMappingRefinement"


    // $ANTLR start "ruleMappingRefinement"
    // InternalMyQvto.g:4158:1: ruleMappingRefinement returns [EObject current=null] : (otherlv_0= 'refines' ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) ;
    public final EObject ruleMappingRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_scoped_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4164:2: ( (otherlv_0= 'refines' ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) )
            // InternalMyQvto.g:4165:2: (otherlv_0= 'refines' ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) )
            {
            // InternalMyQvto.g:4165:2: (otherlv_0= 'refines' ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) )
            // InternalMyQvto.g:4166:3: otherlv_0= 'refines' ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMappingRefinementAccess().getRefinesKeyword_0());
              		
            }
            // InternalMyQvto.g:4170:3: ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:4171:4: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:4171:4: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
            // InternalMyQvto.g:4172:5: lv_scoped_identifier_1_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingRefinementAccess().getScoped_identifierScopedIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_scoped_identifier_1_0=ruleScopedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMappingRefinementRule());
              					}
              					set(
              						current,
              						"scoped_identifier",
              						lv_scoped_identifier_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMappingRefinement"


    // $ANTLR start "entryRuleScopedIdentifierList"
    // InternalMyQvto.g:4193:1: entryRuleScopedIdentifierList returns [EObject current=null] : iv_ruleScopedIdentifierList= ruleScopedIdentifierList EOF ;
    public final EObject entryRuleScopedIdentifierList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopedIdentifierList = null;


        try {
            // InternalMyQvto.g:4193:61: (iv_ruleScopedIdentifierList= ruleScopedIdentifierList EOF )
            // InternalMyQvto.g:4194:2: iv_ruleScopedIdentifierList= ruleScopedIdentifierList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopedIdentifierListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScopedIdentifierList=ruleScopedIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopedIdentifierList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScopedIdentifierList"


    // $ANTLR start "ruleScopedIdentifierList"
    // InternalMyQvto.g:4200:1: ruleScopedIdentifierList returns [EObject current=null] : ( () ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) ) (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )* ) ;
    public final EObject ruleScopedIdentifierList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_scoped_identifier_list_1_0 = null;

        EObject lv_scoped_identifier_list_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4206:2: ( ( () ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) ) (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )* ) )
            // InternalMyQvto.g:4207:2: ( () ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) ) (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )* )
            {
            // InternalMyQvto.g:4207:2: ( () ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) ) (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )* )
            // InternalMyQvto.g:4208:3: () ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) ) (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )*
            {
            // InternalMyQvto.g:4208:3: ()
            // InternalMyQvto.g:4209:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getScopedIdentifierListAccess().getScopedIdentifierListAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:4218:3: ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:4219:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:4219:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifier )
            // InternalMyQvto.g:4220:5: lv_scoped_identifier_list_1_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScopedIdentifierListAccess().getScoped_identifier_listScopedIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_scoped_identifier_list_1_0=ruleScopedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getScopedIdentifierListRule());
              					}
              					add(
              						current,
              						"scoped_identifier_list",
              						lv_scoped_identifier_list_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4237:3: (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==14) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalMyQvto.g:4238:4: otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getScopedIdentifierListAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:4242:4: ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) )
            	    // InternalMyQvto.g:4243:5: (lv_scoped_identifier_list_3_0= ruleScopedIdentifier )
            	    {
            	    // InternalMyQvto.g:4243:5: (lv_scoped_identifier_list_3_0= ruleScopedIdentifier )
            	    // InternalMyQvto.g:4244:6: lv_scoped_identifier_list_3_0= ruleScopedIdentifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getScopedIdentifierListAccess().getScoped_identifier_listScopedIdentifierParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_scoped_identifier_list_3_0=ruleScopedIdentifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getScopedIdentifierListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"scoped_identifier_list",
            	      							lv_scoped_identifier_list_3_0,
            	      							"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleScopedIdentifierList"


    // $ANTLR start "entryRuleConstructorHeader"
    // InternalMyQvto.g:4266:1: entryRuleConstructorHeader returns [EObject current=null] : iv_ruleConstructorHeader= ruleConstructorHeader EOF ;
    public final EObject entryRuleConstructorHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorHeader = null;


        try {
            // InternalMyQvto.g:4266:58: (iv_ruleConstructorHeader= ruleConstructorHeader EOF )
            // InternalMyQvto.g:4267:2: iv_ruleConstructorHeader= ruleConstructorHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstructorHeader=ruleConstructorHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructorHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstructorHeader"


    // $ANTLR start "ruleConstructorHeader"
    // InternalMyQvto.g:4273:1: ruleConstructorHeader returns [EObject current=null] : ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'constructor' ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_3_0= ruleSimpleSignature ) ) ) ;
    public final EObject ruleConstructorHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_qualifier_0_0 = null;

        EObject lv_scoped_identifier_2_0 = null;

        EObject lv_simple_signature_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4279:2: ( ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'constructor' ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_3_0= ruleSimpleSignature ) ) ) )
            // InternalMyQvto.g:4280:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'constructor' ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_3_0= ruleSimpleSignature ) ) )
            {
            // InternalMyQvto.g:4280:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'constructor' ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_3_0= ruleSimpleSignature ) ) )
            // InternalMyQvto.g:4281:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'constructor' ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_3_0= ruleSimpleSignature ) )
            {
            // InternalMyQvto.g:4281:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( ((LA82_0>=70 && LA82_0<=72)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalMyQvto.g:4282:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    {
            	    // InternalMyQvto.g:4282:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    // InternalMyQvto.g:4283:5: lv_qualifier_0_0= ruleGeneralQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstructorHeaderAccess().getQualifierGeneralQualifierEnumRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_qualifier_0_0=ruleGeneralQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConstructorHeaderRule());
            	      					}
            	      					add(
            	      						current,
            	      						"qualifier",
            	      						lv_qualifier_0_0,
            	      						"org.omg.qvt10.myqvto.MyQvto.GeneralQualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_1=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstructorHeaderAccess().getConstructorKeyword_1());
              		
            }
            // InternalMyQvto.g:4304:3: ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:4305:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:4305:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            // InternalMyQvto.g:4306:5: lv_scoped_identifier_2_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstructorHeaderAccess().getScoped_identifierScopedIdentifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_scoped_identifier_2_0=ruleScopedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstructorHeaderRule());
              					}
              					set(
              						current,
              						"scoped_identifier",
              						lv_scoped_identifier_2_0,
              						"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4323:3: ( (lv_simple_signature_3_0= ruleSimpleSignature ) )
            // InternalMyQvto.g:4324:4: (lv_simple_signature_3_0= ruleSimpleSignature )
            {
            // InternalMyQvto.g:4324:4: (lv_simple_signature_3_0= ruleSimpleSignature )
            // InternalMyQvto.g:4325:5: lv_simple_signature_3_0= ruleSimpleSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstructorHeaderAccess().getSimple_signatureSimpleSignatureParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_simple_signature_3_0=ruleSimpleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstructorHeaderRule());
              					}
              					set(
              						current,
              						"simple_signature",
              						lv_simple_signature_3_0,
              						"org.omg.qvt10.myqvto.MyQvto.SimpleSignature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstructorHeader"


    // $ANTLR start "entryRuleEntryHeader"
    // InternalMyQvto.g:4346:1: entryRuleEntryHeader returns [EObject current=null] : iv_ruleEntryHeader= ruleEntryHeader EOF ;
    public final EObject entryRuleEntryHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryHeader = null;


        try {
            // InternalMyQvto.g:4346:52: (iv_ruleEntryHeader= ruleEntryHeader EOF )
            // InternalMyQvto.g:4347:2: iv_ruleEntryHeader= ruleEntryHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntryHeader=ruleEntryHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntryHeader"


    // $ANTLR start "ruleEntryHeader"
    // InternalMyQvto.g:4353:1: ruleEntryHeader returns [EObject current=null] : (otherlv_0= 'main' ( (lv_simple_signature_1_0= ruleSimpleSignature ) ) ) ;
    public final EObject ruleEntryHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_simple_signature_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4359:2: ( (otherlv_0= 'main' ( (lv_simple_signature_1_0= ruleSimpleSignature ) ) ) )
            // InternalMyQvto.g:4360:2: (otherlv_0= 'main' ( (lv_simple_signature_1_0= ruleSimpleSignature ) ) )
            {
            // InternalMyQvto.g:4360:2: (otherlv_0= 'main' ( (lv_simple_signature_1_0= ruleSimpleSignature ) ) )
            // InternalMyQvto.g:4361:3: otherlv_0= 'main' ( (lv_simple_signature_1_0= ruleSimpleSignature ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEntryHeaderAccess().getMainKeyword_0());
              		
            }
            // InternalMyQvto.g:4365:3: ( (lv_simple_signature_1_0= ruleSimpleSignature ) )
            // InternalMyQvto.g:4366:4: (lv_simple_signature_1_0= ruleSimpleSignature )
            {
            // InternalMyQvto.g:4366:4: (lv_simple_signature_1_0= ruleSimpleSignature )
            // InternalMyQvto.g:4367:5: lv_simple_signature_1_0= ruleSimpleSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntryHeaderAccess().getSimple_signatureSimpleSignatureParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_simple_signature_1_0=ruleSimpleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEntryHeaderRule());
              					}
              					set(
              						current,
              						"simple_signature",
              						lv_simple_signature_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.SimpleSignature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntryHeader"


    // $ANTLR start "entryRuleLibraryHeader"
    // InternalMyQvto.g:4388:1: entryRuleLibraryHeader returns [EObject current=null] : iv_ruleLibraryHeader= ruleLibraryHeader EOF ;
    public final EObject entryRuleLibraryHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryHeader = null;


        try {
            // InternalMyQvto.g:4388:54: (iv_ruleLibraryHeader= ruleLibraryHeader EOF )
            // InternalMyQvto.g:4389:2: iv_ruleLibraryHeader= ruleLibraryHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLibraryHeader=ruleLibraryHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibraryHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLibraryHeader"


    // $ANTLR start "ruleLibraryHeader"
    // InternalMyQvto.g:4395:1: ruleLibraryHeader returns [EObject current=null] : ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_library_signature_3_0= ruleSimpleSignature ) )? ( (lv_module_usage_4_0= ruleModuleUsageGO ) )? ) ;
    public final EObject ruleLibraryHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_library_signature_3_0 = null;

        EObject lv_module_usage_4_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4401:2: ( ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_library_signature_3_0= ruleSimpleSignature ) )? ( (lv_module_usage_4_0= ruleModuleUsageGO ) )? ) )
            // InternalMyQvto.g:4402:2: ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_library_signature_3_0= ruleSimpleSignature ) )? ( (lv_module_usage_4_0= ruleModuleUsageGO ) )? )
            {
            // InternalMyQvto.g:4402:2: ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_library_signature_3_0= ruleSimpleSignature ) )? ( (lv_module_usage_4_0= ruleModuleUsageGO ) )? )
            // InternalMyQvto.g:4403:3: () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_library_signature_3_0= ruleSimpleSignature ) )? ( (lv_module_usage_4_0= ruleModuleUsageGO ) )?
            {
            // InternalMyQvto.g:4403:3: ()
            // InternalMyQvto.g:4404:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLibraryHeaderAccess().getLibraryHeaderAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLibraryHeaderAccess().getLibraryKeyword_1());
              		
            }
            // InternalMyQvto.g:4417:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyQvto.g:4418:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyQvto.g:4418:4: (lv_name_2_0= RULE_ID )
            // InternalMyQvto.g:4419:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getLibraryHeaderAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLibraryHeaderRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMyQvto.g:4435:3: ( (lv_library_signature_3_0= ruleSimpleSignature ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==28) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMyQvto.g:4436:4: (lv_library_signature_3_0= ruleSimpleSignature )
                    {
                    // InternalMyQvto.g:4436:4: (lv_library_signature_3_0= ruleSimpleSignature )
                    // InternalMyQvto.g:4437:5: lv_library_signature_3_0= ruleSimpleSignature
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLibraryHeaderAccess().getLibrary_signatureSimpleSignatureParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_59);
                    lv_library_signature_3_0=ruleSimpleSignature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLibraryHeaderRule());
                      					}
                      					set(
                      						current,
                      						"library_signature",
                      						lv_library_signature_3_0,
                      						"org.omg.qvt10.myqvto.MyQvto.SimpleSignature");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:4454:3: ( (lv_module_usage_4_0= ruleModuleUsageGO ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=42 && LA84_0<=43)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMyQvto.g:4455:4: (lv_module_usage_4_0= ruleModuleUsageGO )
                    {
                    // InternalMyQvto.g:4455:4: (lv_module_usage_4_0= ruleModuleUsageGO )
                    // InternalMyQvto.g:4456:5: lv_module_usage_4_0= ruleModuleUsageGO
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLibraryHeaderAccess().getModule_usageModuleUsageGOParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_module_usage_4_0=ruleModuleUsageGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLibraryHeaderRule());
                      					}
                      					set(
                      						current,
                      						"module_usage",
                      						lv_module_usage_4_0,
                      						"org.omg.qvt10.myqvto.MyQvto.ModuleUsageGO");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLibraryHeader"


    // $ANTLR start "entryRuleMetaModelHeader"
    // InternalMyQvto.g:4477:1: entryRuleMetaModelHeader returns [EObject current=null] : iv_ruleMetaModelHeader= ruleMetaModelHeader EOF ;
    public final EObject entryRuleMetaModelHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModelHeader = null;


        try {
            // InternalMyQvto.g:4477:56: (iv_ruleMetaModelHeader= ruleMetaModelHeader EOF )
            // InternalMyQvto.g:4478:2: iv_ruleMetaModelHeader= ruleMetaModelHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaModelHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetaModelHeader=ruleMetaModelHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaModelHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetaModelHeader"


    // $ANTLR start "ruleMetaModelHeader"
    // InternalMyQvto.g:4484:1: ruleMetaModelHeader returns [EObject current=null] : ( (otherlv_0= 'metamodel' | otherlv_1= 'package' ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ) ;
    public final EObject ruleMetaModelHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_scoped_identifier_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4490:2: ( ( (otherlv_0= 'metamodel' | otherlv_1= 'package' ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ) )
            // InternalMyQvto.g:4491:2: ( (otherlv_0= 'metamodel' | otherlv_1= 'package' ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) )
            {
            // InternalMyQvto.g:4491:2: ( (otherlv_0= 'metamodel' | otherlv_1= 'package' ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) )
            // InternalMyQvto.g:4492:3: (otherlv_0= 'metamodel' | otherlv_1= 'package' ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) )
            {
            // InternalMyQvto.g:4492:3: (otherlv_0= 'metamodel' | otherlv_1= 'package' )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==49) ) {
                alt85=1;
            }
            else if ( (LA85_0==50) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalMyQvto.g:4493:4: otherlv_0= 'metamodel'
                    {
                    otherlv_0=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getMetaModelHeaderAccess().getMetamodelKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:4498:4: otherlv_1= 'package'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMetaModelHeaderAccess().getPackageKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalMyQvto.g:4503:3: ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:4504:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:4504:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            // InternalMyQvto.g:4505:5: lv_scoped_identifier_2_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetaModelHeaderAccess().getScoped_identifierScopedIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_scoped_identifier_2_0=ruleScopedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMetaModelHeaderRule());
              					}
              					set(
              						current,
              						"scoped_identifier",
              						lv_scoped_identifier_2_0,
              						"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMetaModelHeader"


    // $ANTLR start "entryRuleMetaModelElement"
    // InternalMyQvto.g:4526:1: entryRuleMetaModelElement returns [EObject current=null] : iv_ruleMetaModelElement= ruleMetaModelElement EOF ;
    public final EObject entryRuleMetaModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModelElement = null;


        try {
            // InternalMyQvto.g:4526:57: (iv_ruleMetaModelElement= ruleMetaModelElement EOF )
            // InternalMyQvto.g:4527:2: iv_ruleMetaModelElement= ruleMetaModelElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaModelElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetaModelElement=ruleMetaModelElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaModelElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetaModelElement"


    // $ANTLR start "ruleMetaModelElement"
    // InternalMyQvto.g:4533:1: ruleMetaModelElement returns [EObject current=null] : ( ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) ) | ( (lv_enumeration_2_0= ruleEnumerationGO ) ) | ( (lv_tag_3_0= ruleTagGO ) ) ) ;
    public final EObject ruleMetaModelElement() throws RecognitionException {
        EObject current = null;

        EObject lv_classifier_1_0 = null;

        EObject lv_enumeration_2_0 = null;

        EObject lv_tag_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4539:2: ( ( ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) ) | ( (lv_enumeration_2_0= ruleEnumerationGO ) ) | ( (lv_tag_3_0= ruleTagGO ) ) ) )
            // InternalMyQvto.g:4540:2: ( ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) ) | ( (lv_enumeration_2_0= ruleEnumerationGO ) ) | ( (lv_tag_3_0= ruleTagGO ) ) )
            {
            // InternalMyQvto.g:4540:2: ( ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) ) | ( (lv_enumeration_2_0= ruleEnumerationGO ) ) | ( (lv_tag_3_0= ruleTagGO ) ) )
            int alt86=3;
            switch ( input.LA(1) ) {
            case 23:
            case 52:
            case 53:
            case 54:
            case 55:
            case 70:
            case 71:
            case 72:
                {
                alt86=1;
                }
                break;
            case 51:
                {
                alt86=2;
                }
                break;
            case 24:
                {
                alt86=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalMyQvto.g:4541:3: ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) )
                    {
                    // InternalMyQvto.g:4541:3: ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) )
                    // InternalMyQvto.g:4542:4: () ( (lv_classifier_1_0= ruleClassifierGO ) )
                    {
                    // InternalMyQvto.g:4542:4: ()
                    // InternalMyQvto.g:4543:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMetaModelElementAccess().getMetaModelElementAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyQvto.g:4552:4: ( (lv_classifier_1_0= ruleClassifierGO ) )
                    // InternalMyQvto.g:4553:5: (lv_classifier_1_0= ruleClassifierGO )
                    {
                    // InternalMyQvto.g:4553:5: (lv_classifier_1_0= ruleClassifierGO )
                    // InternalMyQvto.g:4554:6: lv_classifier_1_0= ruleClassifierGO
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMetaModelElementAccess().getClassifierClassifierGOParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_classifier_1_0=ruleClassifierGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMetaModelElementRule());
                      						}
                      						set(
                      							current,
                      							"classifier",
                      							lv_classifier_1_0,
                      							"org.omg.qvt10.myqvto.MyQvto.ClassifierGO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:4573:3: ( (lv_enumeration_2_0= ruleEnumerationGO ) )
                    {
                    // InternalMyQvto.g:4573:3: ( (lv_enumeration_2_0= ruleEnumerationGO ) )
                    // InternalMyQvto.g:4574:4: (lv_enumeration_2_0= ruleEnumerationGO )
                    {
                    // InternalMyQvto.g:4574:4: (lv_enumeration_2_0= ruleEnumerationGO )
                    // InternalMyQvto.g:4575:5: lv_enumeration_2_0= ruleEnumerationGO
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMetaModelElementAccess().getEnumerationEnumerationGOParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_enumeration_2_0=ruleEnumerationGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMetaModelElementRule());
                      					}
                      					set(
                      						current,
                      						"enumeration",
                      						lv_enumeration_2_0,
                      						"org.omg.qvt10.myqvto.MyQvto.EnumerationGO");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:4593:3: ( (lv_tag_3_0= ruleTagGO ) )
                    {
                    // InternalMyQvto.g:4593:3: ( (lv_tag_3_0= ruleTagGO ) )
                    // InternalMyQvto.g:4594:4: (lv_tag_3_0= ruleTagGO )
                    {
                    // InternalMyQvto.g:4594:4: (lv_tag_3_0= ruleTagGO )
                    // InternalMyQvto.g:4595:5: lv_tag_3_0= ruleTagGO
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMetaModelElementAccess().getTagTagGOParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_tag_3_0=ruleTagGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMetaModelElementRule());
                      					}
                      					set(
                      						current,
                      						"tag",
                      						lv_tag_3_0,
                      						"org.omg.qvt10.myqvto.MyQvto.TagGO");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMetaModelElement"


    // $ANTLR start "entryRuleEnumerationGO"
    // InternalMyQvto.g:4616:1: entryRuleEnumerationGO returns [EObject current=null] : iv_ruleEnumerationGO= ruleEnumerationGO EOF ;
    public final EObject entryRuleEnumerationGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationGO = null;


        try {
            // InternalMyQvto.g:4616:54: (iv_ruleEnumerationGO= ruleEnumerationGO EOF )
            // InternalMyQvto.g:4617:2: iv_ruleEnumerationGO= ruleEnumerationGO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationGORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationGO=ruleEnumerationGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationGO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerationGO"


    // $ANTLR start "ruleEnumerationGO"
    // InternalMyQvto.g:4623:1: ruleEnumerationGO returns [EObject current=null] : ( () ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ) ) ;
    public final EObject ruleEnumerationGO() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_enumeration_h_1_0 = null;

        AntlrDatatypeRuleToken lv_identifier_4_0 = null;

        AntlrDatatypeRuleToken lv_identifier_6_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4629:2: ( ( () ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ) ) )
            // InternalMyQvto.g:4630:2: ( () ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ) )
            {
            // InternalMyQvto.g:4630:2: ( () ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ) )
            // InternalMyQvto.g:4631:3: () ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) )
            {
            // InternalMyQvto.g:4631:3: ()
            // InternalMyQvto.g:4632:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnumerationGOAccess().getEnumerationGOAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:4641:3: ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) )
            // InternalMyQvto.g:4642:4: (lv_enumeration_h_1_0= ruleEnumerationHeader )
            {
            // InternalMyQvto.g:4642:4: (lv_enumeration_h_1_0= ruleEnumerationHeader )
            // InternalMyQvto.g:4643:5: lv_enumeration_h_1_0= ruleEnumerationHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumerationGOAccess().getEnumeration_hEnumerationHeaderParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_enumeration_h_1_0=ruleEnumerationHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumerationGORule());
              					}
              					set(
              						current,
              						"enumeration_h",
              						lv_enumeration_h_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.EnumerationHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4660:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==16) ) {
                alt89=1;
            }
            else if ( (LA89_0==21) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalMyQvto.g:4661:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEnumerationGOAccess().getSemicolonKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:4666:4: (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
                    {
                    // InternalMyQvto.g:4666:4: (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
                    // InternalMyQvto.g:4667:5: otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )?
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getEnumerationGOAccess().getLeftCurlyBracketKeyword_2_1_0());
                      				
                    }
                    // InternalMyQvto.g:4671:5: ( (lv_identifier_4_0= ruleEString ) )
                    // InternalMyQvto.g:4672:6: (lv_identifier_4_0= ruleEString )
                    {
                    // InternalMyQvto.g:4672:6: (lv_identifier_4_0= ruleEString )
                    // InternalMyQvto.g:4673:7: lv_identifier_4_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getEnumerationGOAccess().getIdentifierEStringParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_61);
                    lv_identifier_4_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getEnumerationGORule());
                      							}
                      							add(
                      								current,
                      								"identifier",
                      								lv_identifier_4_0,
                      								"org.omg.qvt10.myqvto.MyQvto.EString");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyQvto.g:4690:5: (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==14) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalMyQvto.g:4691:6: otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_60); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_5, grammarAccess.getEnumerationGOAccess().getCommaKeyword_2_1_2_0());
                    	      					
                    	    }
                    	    // InternalMyQvto.g:4695:6: ( (lv_identifier_6_0= ruleEString ) )
                    	    // InternalMyQvto.g:4696:7: (lv_identifier_6_0= ruleEString )
                    	    {
                    	    // InternalMyQvto.g:4696:7: (lv_identifier_6_0= ruleEString )
                    	    // InternalMyQvto.g:4697:8: lv_identifier_6_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getEnumerationGOAccess().getIdentifierEStringParserRuleCall_2_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_61);
                    	    lv_identifier_6_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getEnumerationGORule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"identifier",
                    	      									lv_identifier_6_0,
                    	      									"org.omg.qvt10.myqvto.MyQvto.EString");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getEnumerationGOAccess().getRightCurlyBracketKeyword_2_1_3());
                      				
                    }
                    // InternalMyQvto.g:4719:5: (otherlv_8= ';' )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==16) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalMyQvto.g:4720:6: otherlv_8= ';'
                            {
                            otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getEnumerationGOAccess().getSemicolonKeyword_2_1_4());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumerationGO"


    // $ANTLR start "entryRuleEnumerationHeader"
    // InternalMyQvto.g:4731:1: entryRuleEnumerationHeader returns [EObject current=null] : iv_ruleEnumerationHeader= ruleEnumerationHeader EOF ;
    public final EObject entryRuleEnumerationHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationHeader = null;


        try {
            // InternalMyQvto.g:4731:58: (iv_ruleEnumerationHeader= ruleEnumerationHeader EOF )
            // InternalMyQvto.g:4732:2: iv_ruleEnumerationHeader= ruleEnumerationHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationHeader=ruleEnumerationHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerationHeader"


    // $ANTLR start "ruleEnumerationHeader"
    // InternalMyQvto.g:4738:1: ruleEnumerationHeader returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;


        	enterRule();

        try {
            // InternalMyQvto.g:4744:2: ( (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) ) )
            // InternalMyQvto.g:4745:2: (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) )
            {
            // InternalMyQvto.g:4745:2: (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) )
            // InternalMyQvto.g:4746:3: otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationHeaderAccess().getEnumKeyword_0());
              		
            }
            // InternalMyQvto.g:4750:3: ( (lv_identifier_1_0= RULE_ID ) )
            // InternalMyQvto.g:4751:4: (lv_identifier_1_0= RULE_ID )
            {
            // InternalMyQvto.g:4751:4: (lv_identifier_1_0= RULE_ID )
            // InternalMyQvto.g:4752:5: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_identifier_1_0, grammarAccess.getEnumerationHeaderAccess().getIdentifierIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumerationHeaderRule());
              					}
              					setWithLastConsumed(
              						current,
              						"identifier",
              						lv_identifier_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumerationHeader"


    // $ANTLR start "entryRuleClassifierHeader"
    // InternalMyQvto.g:4772:1: entryRuleClassifierHeader returns [EObject current=null] : iv_ruleClassifierHeader= ruleClassifierHeader EOF ;
    public final EObject entryRuleClassifierHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierHeader = null;


        try {
            // InternalMyQvto.g:4772:57: (iv_ruleClassifierHeader= ruleClassifierHeader EOF )
            // InternalMyQvto.g:4773:2: iv_ruleClassifierHeader= ruleClassifierHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassifierHeader=ruleClassifierHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassifierHeader"


    // $ANTLR start "ruleClassifierHeader"
    // InternalMyQvto.g:4779:1: ruleClassifierHeader returns [EObject current=null] : ( ( (lv_classifier_info_0_0= ruleClassifierInfo ) ) ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )? ) ;
    public final EObject ruleClassifierHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_classifier_info_0_0 = null;

        EObject lv_scoped_identifier_1_0 = null;

        EObject lv_classifier_extension_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4785:2: ( ( ( (lv_classifier_info_0_0= ruleClassifierInfo ) ) ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )? ) )
            // InternalMyQvto.g:4786:2: ( ( (lv_classifier_info_0_0= ruleClassifierInfo ) ) ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )? )
            {
            // InternalMyQvto.g:4786:2: ( ( (lv_classifier_info_0_0= ruleClassifierInfo ) ) ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )? )
            // InternalMyQvto.g:4787:3: ( (lv_classifier_info_0_0= ruleClassifierInfo ) ) ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )?
            {
            // InternalMyQvto.g:4787:3: ( (lv_classifier_info_0_0= ruleClassifierInfo ) )
            // InternalMyQvto.g:4788:4: (lv_classifier_info_0_0= ruleClassifierInfo )
            {
            // InternalMyQvto.g:4788:4: (lv_classifier_info_0_0= ruleClassifierInfo )
            // InternalMyQvto.g:4789:5: lv_classifier_info_0_0= ruleClassifierInfo
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierHeaderAccess().getClassifier_infoClassifierInfoParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_classifier_info_0_0=ruleClassifierInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassifierHeaderRule());
              					}
              					set(
              						current,
              						"classifier_info",
              						lv_classifier_info_0_0,
              						"org.omg.qvt10.myqvto.MyQvto.ClassifierInfo");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4806:3: ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:4807:4: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:4807:4: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
            // InternalMyQvto.g:4808:5: lv_scoped_identifier_1_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierHeaderAccess().getScoped_identifierScopedIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_62);
            lv_scoped_identifier_1_0=ruleScopedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassifierHeaderRule());
              					}
              					set(
              						current,
              						"scoped_identifier",
              						lv_scoped_identifier_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4825:3: ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==43) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalMyQvto.g:4826:4: (lv_classifier_extension_2_0= ruleClassifierExtension )
                    {
                    // InternalMyQvto.g:4826:4: (lv_classifier_extension_2_0= ruleClassifierExtension )
                    // InternalMyQvto.g:4827:5: lv_classifier_extension_2_0= ruleClassifierExtension
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassifierHeaderAccess().getClassifier_extensionClassifierExtensionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_classifier_extension_2_0=ruleClassifierExtension();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassifierHeaderRule());
                      					}
                      					set(
                      						current,
                      						"classifier_extension",
                      						lv_classifier_extension_2_0,
                      						"org.omg.qvt10.myqvto.MyQvto.ClassifierExtension");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassifierHeader"


    // $ANTLR start "entryRuleClassifierFeatureList"
    // InternalMyQvto.g:4848:1: entryRuleClassifierFeatureList returns [EObject current=null] : iv_ruleClassifierFeatureList= ruleClassifierFeatureList EOF ;
    public final EObject entryRuleClassifierFeatureList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierFeatureList = null;


        try {
            // InternalMyQvto.g:4848:62: (iv_ruleClassifierFeatureList= ruleClassifierFeatureList EOF )
            // InternalMyQvto.g:4849:2: iv_ruleClassifierFeatureList= ruleClassifierFeatureList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierFeatureListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassifierFeatureList=ruleClassifierFeatureList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierFeatureList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassifierFeatureList"


    // $ANTLR start "ruleClassifierFeatureList"
    // InternalMyQvto.g:4855:1: ruleClassifierFeatureList returns [EObject current=null] : ( () ( (lv_classifier_feature_1_0= ruleClassifierFeature ) ) (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )* (otherlv_4= ';' )? ) ;
    public final EObject ruleClassifierFeatureList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_classifier_feature_1_0 = null;

        EObject lv_classifier_feature_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4861:2: ( ( () ( (lv_classifier_feature_1_0= ruleClassifierFeature ) ) (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )* (otherlv_4= ';' )? ) )
            // InternalMyQvto.g:4862:2: ( () ( (lv_classifier_feature_1_0= ruleClassifierFeature ) ) (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )* (otherlv_4= ';' )? )
            {
            // InternalMyQvto.g:4862:2: ( () ( (lv_classifier_feature_1_0= ruleClassifierFeature ) ) (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )* (otherlv_4= ';' )? )
            // InternalMyQvto.g:4863:3: () ( (lv_classifier_feature_1_0= ruleClassifierFeature ) ) (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )* (otherlv_4= ';' )?
            {
            // InternalMyQvto.g:4863:3: ()
            // InternalMyQvto.g:4864:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getClassifierFeatureListAccess().getClassifierFeatureListAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:4873:3: ( (lv_classifier_feature_1_0= ruleClassifierFeature ) )
            // InternalMyQvto.g:4874:4: (lv_classifier_feature_1_0= ruleClassifierFeature )
            {
            // InternalMyQvto.g:4874:4: (lv_classifier_feature_1_0= ruleClassifierFeature )
            // InternalMyQvto.g:4875:5: lv_classifier_feature_1_0= ruleClassifierFeature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierFeatureListAccess().getClassifier_featureClassifierFeatureParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_classifier_feature_1_0=ruleClassifierFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassifierFeatureListRule());
              					}
              					add(
              						current,
              						"classifier_feature",
              						lv_classifier_feature_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.ClassifierFeature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4892:3: (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==16) ) {
                    int LA91_1 = input.LA(2);

                    if ( (LA91_1==RULE_ID||LA91_1==24||(LA91_1>=35 && LA91_1<=36)||LA91_1==58||(LA91_1>=64 && LA91_1<=69)||LA91_1==72||LA91_1==78||(LA91_1>=82 && LA91_1<=84)) ) {
                        alt91=1;
                    }


                }


                switch (alt91) {
            	case 1 :
            	    // InternalMyQvto.g:4893:4: otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_63); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getClassifierFeatureListAccess().getSemicolonKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:4897:4: ( (lv_classifier_feature_3_0= ruleClassifierFeature ) )
            	    // InternalMyQvto.g:4898:5: (lv_classifier_feature_3_0= ruleClassifierFeature )
            	    {
            	    // InternalMyQvto.g:4898:5: (lv_classifier_feature_3_0= ruleClassifierFeature )
            	    // InternalMyQvto.g:4899:6: lv_classifier_feature_3_0= ruleClassifierFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getClassifierFeatureListAccess().getClassifier_featureClassifierFeatureParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_classifier_feature_3_0=ruleClassifierFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getClassifierFeatureListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"classifier_feature",
            	      							lv_classifier_feature_3_0,
            	      							"org.omg.qvt10.myqvto.MyQvto.ClassifierFeature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            // InternalMyQvto.g:4917:3: (otherlv_4= ';' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==16) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalMyQvto.g:4918:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getClassifierFeatureListAccess().getSemicolonKeyword_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassifierFeatureList"


    // $ANTLR start "entryRuleClassifierInfo"
    // InternalMyQvto.g:4927:1: entryRuleClassifierInfo returns [EObject current=null] : iv_ruleClassifierInfo= ruleClassifierInfo EOF ;
    public final EObject entryRuleClassifierInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierInfo = null;


        try {
            // InternalMyQvto.g:4927:55: (iv_ruleClassifierInfo= ruleClassifierInfo EOF )
            // InternalMyQvto.g:4928:2: iv_ruleClassifierInfo= ruleClassifierInfo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierInfoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassifierInfo=ruleClassifierInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierInfo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassifierInfo"


    // $ANTLR start "ruleClassifierInfo"
    // InternalMyQvto.g:4934:1: ruleClassifierInfo returns [EObject current=null] : ( ( () otherlv_1= 'datatype' ) | otherlv_2= 'primitive' | otherlv_3= 'exception' | ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' ) ) ;
    public final EObject ruleClassifierInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_qualifier_5_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4940:2: ( ( ( () otherlv_1= 'datatype' ) | otherlv_2= 'primitive' | otherlv_3= 'exception' | ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' ) ) )
            // InternalMyQvto.g:4941:2: ( ( () otherlv_1= 'datatype' ) | otherlv_2= 'primitive' | otherlv_3= 'exception' | ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' ) )
            {
            // InternalMyQvto.g:4941:2: ( ( () otherlv_1= 'datatype' ) | otherlv_2= 'primitive' | otherlv_3= 'exception' | ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' ) )
            int alt95=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt95=1;
                }
                break;
            case 53:
                {
                alt95=2;
                }
                break;
            case 54:
                {
                alt95=3;
                }
                break;
            case 23:
            case 55:
            case 70:
            case 71:
            case 72:
                {
                alt95=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalMyQvto.g:4942:3: ( () otherlv_1= 'datatype' )
                    {
                    // InternalMyQvto.g:4942:3: ( () otherlv_1= 'datatype' )
                    // InternalMyQvto.g:4943:4: () otherlv_1= 'datatype'
                    {
                    // InternalMyQvto.g:4943:4: ()
                    // InternalMyQvto.g:4944:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getClassifierInfoAccess().getClassifierInfoAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getClassifierInfoAccess().getDatatypeKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:4959:3: otherlv_2= 'primitive'
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_2, grammarAccess.getClassifierInfoAccess().getPrimitiveKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:4964:3: otherlv_3= 'exception'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_3, grammarAccess.getClassifierInfoAccess().getExceptionKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:4969:3: ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' )
                    {
                    // InternalMyQvto.g:4969:3: ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' )
                    // InternalMyQvto.g:4970:4: (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class'
                    {
                    // InternalMyQvto.g:4970:4: (otherlv_4= 'intermediate' )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==23) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalMyQvto.g:4971:5: otherlv_4= 'intermediate'
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_64); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getClassifierInfoAccess().getIntermediateKeyword_3_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMyQvto.g:4976:4: ( (lv_qualifier_5_0= ruleGeneralQualifier ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( ((LA94_0>=70 && LA94_0<=72)) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalMyQvto.g:4977:5: (lv_qualifier_5_0= ruleGeneralQualifier )
                    	    {
                    	    // InternalMyQvto.g:4977:5: (lv_qualifier_5_0= ruleGeneralQualifier )
                    	    // InternalMyQvto.g:4978:6: lv_qualifier_5_0= ruleGeneralQualifier
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getClassifierInfoAccess().getQualifierGeneralQualifierEnumRuleCall_3_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_64);
                    	    lv_qualifier_5_0=ruleGeneralQualifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getClassifierInfoRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"qualifier",
                    	      							lv_qualifier_5_0,
                    	      							"org.omg.qvt10.myqvto.MyQvto.GeneralQualifier");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getClassifierInfoAccess().getClassKeyword_3_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassifierInfo"


    // $ANTLR start "entryRuleClassifierExtension"
    // InternalMyQvto.g:5004:1: entryRuleClassifierExtension returns [EObject current=null] : iv_ruleClassifierExtension= ruleClassifierExtension EOF ;
    public final EObject entryRuleClassifierExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierExtension = null;


        try {
            // InternalMyQvto.g:5004:60: (iv_ruleClassifierExtension= ruleClassifierExtension EOF )
            // InternalMyQvto.g:5005:2: iv_ruleClassifierExtension= ruleClassifierExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierExtensionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassifierExtension=ruleClassifierExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierExtension; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassifierExtension"


    // $ANTLR start "ruleClassifierExtension"
    // InternalMyQvto.g:5011:1: ruleClassifierExtension returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) ) ;
    public final EObject ruleClassifierExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_scoped_identifier_list_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:5017:2: ( (otherlv_0= 'extends' ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) ) )
            // InternalMyQvto.g:5018:2: (otherlv_0= 'extends' ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) )
            {
            // InternalMyQvto.g:5018:2: (otherlv_0= 'extends' ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) )
            // InternalMyQvto.g:5019:3: otherlv_0= 'extends' ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClassifierExtensionAccess().getExtendsKeyword_0());
              		
            }
            // InternalMyQvto.g:5023:3: ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) )
            // InternalMyQvto.g:5024:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList )
            {
            // InternalMyQvto.g:5024:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList )
            // InternalMyQvto.g:5025:5: lv_scoped_identifier_list_1_0= ruleScopedIdentifierList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierExtensionAccess().getScoped_identifier_listScopedIdentifierListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_scoped_identifier_list_1_0=ruleScopedIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassifierExtensionRule());
              					}
              					set(
              						current,
              						"scoped_identifier_list",
              						lv_scoped_identifier_list_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.ScopedIdentifierList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassifierExtension"


    // $ANTLR start "entryRuleClassifierFeature"
    // InternalMyQvto.g:5046:1: entryRuleClassifierFeature returns [EObject current=null] : iv_ruleClassifierFeature= ruleClassifierFeature EOF ;
    public final EObject entryRuleClassifierFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierFeature = null;


        try {
            // InternalMyQvto.g:5046:58: (iv_ruleClassifierFeature= ruleClassifierFeature EOF )
            // InternalMyQvto.g:5047:2: iv_ruleClassifierFeature= ruleClassifierFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassifierFeature=ruleClassifierFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassifierFeature"


    // $ANTLR start "ruleClassifierFeature"
    // InternalMyQvto.g:5053:1: ruleClassifierFeature returns [EObject current=null] : ( ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) ) | ( (lv_tag_5_0= ruleTagGO ) ) ) ;
    public final EObject ruleClassifierFeature() throws RecognitionException {
        EObject current = null;

        EObject lv_feature_qualifier_0_0 = null;

        EObject lv_declarator_1_0 = null;

        EObject lv_multiplicity_2_0 = null;

        EObject lv_opposite_property_3_0 = null;

        EObject lv_complete_signature_4_0 = null;

        EObject lv_tag_5_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:5059:2: ( ( ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) ) | ( (lv_tag_5_0= ruleTagGO ) ) ) )
            // InternalMyQvto.g:5060:2: ( ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) ) | ( (lv_tag_5_0= ruleTagGO ) ) )
            {
            // InternalMyQvto.g:5060:2: ( ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) ) | ( (lv_tag_5_0= ruleTagGO ) ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==EOF||LA100_0==RULE_ID||(LA100_0>=35 && LA100_0<=36)||LA100_0==58||(LA100_0>=64 && LA100_0<=69)||LA100_0==72||LA100_0==78||(LA100_0>=82 && LA100_0<=84)) ) {
                alt100=1;
            }
            else if ( (LA100_0==24) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalMyQvto.g:5061:3: ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) )
                    {
                    // InternalMyQvto.g:5061:3: ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) )
                    // InternalMyQvto.g:5062:4: ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) )
                    {
                    // InternalMyQvto.g:5062:4: ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )?
                    int alt96=2;
                    alt96 = dfa96.predict(input);
                    switch (alt96) {
                        case 1 :
                            // InternalMyQvto.g:5063:5: (lv_feature_qualifier_0_0= ruleFeatureQualifier )
                            {
                            // InternalMyQvto.g:5063:5: (lv_feature_qualifier_0_0= ruleFeatureQualifier )
                            // InternalMyQvto.g:5064:6: lv_feature_qualifier_0_0= ruleFeatureQualifier
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getClassifierFeatureAccess().getFeature_qualifierFeatureQualifierParserRuleCall_0_0_0());
                              					
                            }
                            pushFollow(FOLLOW_28);
                            lv_feature_qualifier_0_0=ruleFeatureQualifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getClassifierFeatureRule());
                              						}
                              						set(
                              							current,
                              							"feature_qualifier",
                              							lv_feature_qualifier_0_0,
                              							"org.omg.qvt10.myqvto.MyQvto.FeatureQualifier");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalMyQvto.g:5081:4: ( (lv_declarator_1_0= ruleDeclarator ) )
                    // InternalMyQvto.g:5082:5: (lv_declarator_1_0= ruleDeclarator )
                    {
                    // InternalMyQvto.g:5082:5: (lv_declarator_1_0= ruleDeclarator )
                    // InternalMyQvto.g:5083:6: lv_declarator_1_0= ruleDeclarator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClassifierFeatureAccess().getDeclaratorDeclaratorParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_65);
                    lv_declarator_1_0=ruleDeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getClassifierFeatureRule());
                      						}
                      						set(
                      							current,
                      							"declarator",
                      							lv_declarator_1_0,
                      							"org.omg.qvt10.myqvto.MyQvto.Declarator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyQvto.g:5100:4: ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) )
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==EOF||LA99_0==16||LA99_0==22||LA99_0==26||LA99_0==56) ) {
                        alt99=1;
                    }
                    else if ( (LA99_0==28) ) {
                        alt99=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        throw nvae;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalMyQvto.g:5101:5: ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? )
                            {
                            // InternalMyQvto.g:5101:5: ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? )
                            // InternalMyQvto.g:5102:6: ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )?
                            {
                            // InternalMyQvto.g:5102:6: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( (LA97_0==26) ) {
                                alt97=1;
                            }
                            switch (alt97) {
                                case 1 :
                                    // InternalMyQvto.g:5103:7: (lv_multiplicity_2_0= ruleMultiplicity )
                                    {
                                    // InternalMyQvto.g:5103:7: (lv_multiplicity_2_0= ruleMultiplicity )
                                    // InternalMyQvto.g:5104:8: lv_multiplicity_2_0= ruleMultiplicity
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getClassifierFeatureAccess().getMultiplicityMultiplicityParserRuleCall_0_2_0_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_66);
                                    lv_multiplicity_2_0=ruleMultiplicity();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getClassifierFeatureRule());
                                      								}
                                      								set(
                                      									current,
                                      									"multiplicity",
                                      									lv_multiplicity_2_0,
                                      									"org.omg.qvt10.myqvto.MyQvto.Multiplicity");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }

                            // InternalMyQvto.g:5121:6: ( (lv_opposite_property_3_0= ruleOppositeProperty ) )?
                            int alt98=2;
                            int LA98_0 = input.LA(1);

                            if ( (LA98_0==56) ) {
                                alt98=1;
                            }
                            switch (alt98) {
                                case 1 :
                                    // InternalMyQvto.g:5122:7: (lv_opposite_property_3_0= ruleOppositeProperty )
                                    {
                                    // InternalMyQvto.g:5122:7: (lv_opposite_property_3_0= ruleOppositeProperty )
                                    // InternalMyQvto.g:5123:8: lv_opposite_property_3_0= ruleOppositeProperty
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getClassifierFeatureAccess().getOpposite_propertyOppositePropertyParserRuleCall_0_2_0_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_opposite_property_3_0=ruleOppositeProperty();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getClassifierFeatureRule());
                                      								}
                                      								set(
                                      									current,
                                      									"opposite_property",
                                      									lv_opposite_property_3_0,
                                      									"org.omg.qvt10.myqvto.MyQvto.OppositeProperty");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyQvto.g:5142:5: ( (lv_complete_signature_4_0= ruleCompleteSignature ) )
                            {
                            // InternalMyQvto.g:5142:5: ( (lv_complete_signature_4_0= ruleCompleteSignature ) )
                            // InternalMyQvto.g:5143:6: (lv_complete_signature_4_0= ruleCompleteSignature )
                            {
                            // InternalMyQvto.g:5143:6: (lv_complete_signature_4_0= ruleCompleteSignature )
                            // InternalMyQvto.g:5144:7: lv_complete_signature_4_0= ruleCompleteSignature
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getClassifierFeatureAccess().getComplete_signatureCompleteSignatureParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_complete_signature_4_0=ruleCompleteSignature();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getClassifierFeatureRule());
                              							}
                              							set(
                              								current,
                              								"complete_signature",
                              								lv_complete_signature_4_0,
                              								"org.omg.qvt10.myqvto.MyQvto.CompleteSignature");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5164:3: ( (lv_tag_5_0= ruleTagGO ) )
                    {
                    // InternalMyQvto.g:5164:3: ( (lv_tag_5_0= ruleTagGO ) )
                    // InternalMyQvto.g:5165:4: (lv_tag_5_0= ruleTagGO )
                    {
                    // InternalMyQvto.g:5165:4: (lv_tag_5_0= ruleTagGO )
                    // InternalMyQvto.g:5166:5: lv_tag_5_0= ruleTagGO
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassifierFeatureAccess().getTagTagGOParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_tag_5_0=ruleTagGO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassifierFeatureRule());
                      					}
                      					set(
                      						current,
                      						"tag",
                      						lv_tag_5_0,
                      						"org.omg.qvt10.myqvto.MyQvto.TagGO");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassifierFeature"


    // $ANTLR start "entryRuleFeatureQualifier"
    // InternalMyQvto.g:5187:1: entryRuleFeatureQualifier returns [EObject current=null] : iv_ruleFeatureQualifier= ruleFeatureQualifier EOF ;
    public final EObject entryRuleFeatureQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureQualifier = null;


        try {
            // InternalMyQvto.g:5187:57: (iv_ruleFeatureQualifier= ruleFeatureQualifier EOF )
            // InternalMyQvto.g:5188:2: iv_ruleFeatureQualifier= ruleFeatureQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureQualifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureQualifier=ruleFeatureQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureQualifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureQualifier"


    // $ANTLR start "ruleFeatureQualifier"
    // InternalMyQvto.g:5194:1: ruleFeatureQualifier returns [EObject current=null] : ( () ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )? ( (lv_feature_key_2_0= ruleFeatureKey ) )* ) ;
    public final EObject ruleFeatureQualifier() throws RecognitionException {
        EObject current = null;

        EObject lv_stereotype_qualifier_1_0 = null;

        Enumerator lv_feature_key_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:5200:2: ( ( () ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )? ( (lv_feature_key_2_0= ruleFeatureKey ) )* ) )
            // InternalMyQvto.g:5201:2: ( () ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )? ( (lv_feature_key_2_0= ruleFeatureKey ) )* )
            {
            // InternalMyQvto.g:5201:2: ( () ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )? ( (lv_feature_key_2_0= ruleFeatureKey ) )* )
            // InternalMyQvto.g:5202:3: () ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )? ( (lv_feature_key_2_0= ruleFeatureKey ) )*
            {
            // InternalMyQvto.g:5202:3: ()
            // InternalMyQvto.g:5203:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFeatureQualifierAccess().getFeatureQualifierAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:5212:3: ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==58) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalMyQvto.g:5213:4: (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier )
                    {
                    // InternalMyQvto.g:5213:4: (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier )
                    // InternalMyQvto.g:5214:5: lv_stereotype_qualifier_1_0= ruleStereotypeQualifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureQualifierAccess().getStereotype_qualifierStereotypeQualifierParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_67);
                    lv_stereotype_qualifier_1_0=ruleStereotypeQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFeatureQualifierRule());
                      					}
                      					set(
                      						current,
                      						"stereotype_qualifier",
                      						lv_stereotype_qualifier_1_0,
                      						"org.omg.qvt10.myqvto.MyQvto.StereotypeQualifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:5231:3: ( (lv_feature_key_2_0= ruleFeatureKey ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==72||LA102_0==78||(LA102_0>=82 && LA102_0<=84)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalMyQvto.g:5232:4: (lv_feature_key_2_0= ruleFeatureKey )
            	    {
            	    // InternalMyQvto.g:5232:4: (lv_feature_key_2_0= ruleFeatureKey )
            	    // InternalMyQvto.g:5233:5: lv_feature_key_2_0= ruleFeatureKey
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFeatureQualifierAccess().getFeature_keyFeatureKeyEnumRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_67);
            	    lv_feature_key_2_0=ruleFeatureKey();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFeatureQualifierRule());
            	      					}
            	      					add(
            	      						current,
            	      						"feature_key",
            	      						lv_feature_key_2_0,
            	      						"org.omg.qvt10.myqvto.MyQvto.FeatureKey");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureQualifier"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalMyQvto.g:5254:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalMyQvto.g:5254:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalMyQvto.g:5255:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalMyQvto.g:5261:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) ) otherlv_2= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_multiplicity_range_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5267:2: ( (otherlv_0= '[' ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) ) otherlv_2= ']' ) )
            // InternalMyQvto.g:5268:2: (otherlv_0= '[' ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) ) otherlv_2= ']' )
            {
            // InternalMyQvto.g:5268:2: (otherlv_0= '[' ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) ) otherlv_2= ']' )
            // InternalMyQvto.g:5269:3: otherlv_0= '[' ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMyQvto.g:5273:3: ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) )
            // InternalMyQvto.g:5274:4: (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE )
            {
            // InternalMyQvto.g:5274:4: (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE )
            // InternalMyQvto.g:5275:5: lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE
            {
            lv_multiplicity_range_1_0=(Token)match(input,RULE_MULTIPLICITYRANGE,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_multiplicity_range_1_0, grammarAccess.getMultiplicityAccess().getMultiplicity_rangeMULTIPLICITYRANGETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMultiplicityRule());
              					}
              					setWithLastConsumed(
              						current,
              						"multiplicity_range",
              						lv_multiplicity_range_1_0,
              						"org.omg.qvt10.myqvto.MyQvto.MULTIPLICITYRANGE");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleOppositeProperty"
    // InternalMyQvto.g:5299:1: entryRuleOppositeProperty returns [EObject current=null] : iv_ruleOppositeProperty= ruleOppositeProperty EOF ;
    public final EObject entryRuleOppositeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOppositeProperty = null;


        try {
            // InternalMyQvto.g:5299:57: (iv_ruleOppositeProperty= ruleOppositeProperty EOF )
            // InternalMyQvto.g:5300:2: iv_ruleOppositeProperty= ruleOppositeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOppositePropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOppositeProperty=ruleOppositeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOppositeProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOppositeProperty"


    // $ANTLR start "ruleOppositeProperty"
    // InternalMyQvto.g:5306:1: ruleOppositeProperty returns [EObject current=null] : ( () otherlv_1= 'opposites' (otherlv_2= '~' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ) ;
    public final EObject ruleOppositeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_multiplicity_4_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:5312:2: ( ( () otherlv_1= 'opposites' (otherlv_2= '~' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ) )
            // InternalMyQvto.g:5313:2: ( () otherlv_1= 'opposites' (otherlv_2= '~' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) )? )
            {
            // InternalMyQvto.g:5313:2: ( () otherlv_1= 'opposites' (otherlv_2= '~' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) )? )
            // InternalMyQvto.g:5314:3: () otherlv_1= 'opposites' (otherlv_2= '~' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) )?
            {
            // InternalMyQvto.g:5314:3: ()
            // InternalMyQvto.g:5315:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOppositePropertyAccess().getOppositePropertyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOppositePropertyAccess().getOppositesKeyword_1());
              		
            }
            // InternalMyQvto.g:5328:3: (otherlv_2= '~' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==57) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalMyQvto.g:5329:4: otherlv_2= '~'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOppositePropertyAccess().getTildeKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalMyQvto.g:5334:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyQvto.g:5335:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyQvto.g:5335:4: (lv_name_3_0= RULE_ID )
            // InternalMyQvto.g:5336:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getOppositePropertyAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOppositePropertyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMyQvto.g:5352:3: ( (lv_multiplicity_4_0= ruleMultiplicity ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==26) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalMyQvto.g:5353:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalMyQvto.g:5353:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalMyQvto.g:5354:5: lv_multiplicity_4_0= ruleMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOppositePropertyAccess().getMultiplicityMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_multiplicity_4_0=ruleMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOppositePropertyRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_4_0,
                      						"org.omg.qvt10.myqvto.MyQvto.Multiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOppositeProperty"


    // $ANTLR start "entryRuleStereotypeQualifier"
    // InternalMyQvto.g:5375:1: entryRuleStereotypeQualifier returns [EObject current=null] : iv_ruleStereotypeQualifier= ruleStereotypeQualifier EOF ;
    public final EObject entryRuleStereotypeQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStereotypeQualifier = null;


        try {
            // InternalMyQvto.g:5375:60: (iv_ruleStereotypeQualifier= ruleStereotypeQualifier EOF )
            // InternalMyQvto.g:5376:2: iv_ruleStereotypeQualifier= ruleStereotypeQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStereotypeQualifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStereotypeQualifier=ruleStereotypeQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStereotypeQualifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStereotypeQualifier"


    // $ANTLR start "ruleStereotypeQualifier"
    // InternalMyQvto.g:5382:1: ruleStereotypeQualifier returns [EObject current=null] : ( () otherlv_1= '<<' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )* otherlv_5= '>>' ) ;
    public final EObject ruleStereotypeQualifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_identifier_2_0=null;
        Token otherlv_3=null;
        Token lv_identifier_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5388:2: ( ( () otherlv_1= '<<' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )* otherlv_5= '>>' ) )
            // InternalMyQvto.g:5389:2: ( () otherlv_1= '<<' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )* otherlv_5= '>>' )
            {
            // InternalMyQvto.g:5389:2: ( () otherlv_1= '<<' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )* otherlv_5= '>>' )
            // InternalMyQvto.g:5390:3: () otherlv_1= '<<' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )* otherlv_5= '>>'
            {
            // InternalMyQvto.g:5390:3: ()
            // InternalMyQvto.g:5391:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStereotypeQualifierAccess().getStereotypeQualifierAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStereotypeQualifierAccess().getLessThanSignLessThanSignKeyword_1());
              		
            }
            // InternalMyQvto.g:5404:3: ( (lv_identifier_2_0= RULE_ID ) )
            // InternalMyQvto.g:5405:4: (lv_identifier_2_0= RULE_ID )
            {
            // InternalMyQvto.g:5405:4: (lv_identifier_2_0= RULE_ID )
            // InternalMyQvto.g:5406:5: lv_identifier_2_0= RULE_ID
            {
            lv_identifier_2_0=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_identifier_2_0, grammarAccess.getStereotypeQualifierAccess().getIdentifierIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStereotypeQualifierRule());
              					}
              					addWithLastConsumed(
              						current,
              						"identifier",
              						lv_identifier_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMyQvto.g:5422:3: (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==14) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalMyQvto.g:5423:4: otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getStereotypeQualifierAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalMyQvto.g:5427:4: ( (lv_identifier_4_0= RULE_ID ) )
            	    // InternalMyQvto.g:5428:5: (lv_identifier_4_0= RULE_ID )
            	    {
            	    // InternalMyQvto.g:5428:5: (lv_identifier_4_0= RULE_ID )
            	    // InternalMyQvto.g:5429:6: lv_identifier_4_0= RULE_ID
            	    {
            	    lv_identifier_4_0=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_identifier_4_0, grammarAccess.getStereotypeQualifierAccess().getIdentifierIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getStereotypeQualifierRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"identifier",
            	      							lv_identifier_4_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            otherlv_5=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getStereotypeQualifierAccess().getGreaterThanSignGreaterThanSignKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStereotypeQualifier"


    // $ANTLR start "entryRuleUnitRefGO"
    // InternalMyQvto.g:5454:1: entryRuleUnitRefGO returns [EObject current=null] : iv_ruleUnitRefGO= ruleUnitRefGO EOF ;
    public final EObject entryRuleUnitRefGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitRefGO = null;


        try {
            // InternalMyQvto.g:5454:50: (iv_ruleUnitRefGO= ruleUnitRefGO EOF )
            // InternalMyQvto.g:5455:2: iv_ruleUnitRefGO= ruleUnitRefGO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitRefGORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnitRefGO=ruleUnitRefGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitRefGO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnitRefGO"


    // $ANTLR start "ruleUnitRefGO"
    // InternalMyQvto.g:5461:1: ruleUnitRefGO returns [EObject current=null] : ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleUnitRefGO() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token lv_identifier_3_0=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5467:2: ( ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )* ) )
            // InternalMyQvto.g:5468:2: ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )* )
            {
            // InternalMyQvto.g:5468:2: ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )* )
            // InternalMyQvto.g:5469:3: () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )*
            {
            // InternalMyQvto.g:5469:3: ()
            // InternalMyQvto.g:5470:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnitRefGOAccess().getUnitRefGOAction_0(),
              					current);
              			
            }

            }

            // InternalMyQvto.g:5479:3: ( (lv_identifier_1_0= RULE_ID ) )
            // InternalMyQvto.g:5480:4: (lv_identifier_1_0= RULE_ID )
            {
            // InternalMyQvto.g:5480:4: (lv_identifier_1_0= RULE_ID )
            // InternalMyQvto.g:5481:5: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_identifier_1_0, grammarAccess.getUnitRefGOAccess().getIdentifierIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUnitRefGORule());
              					}
              					addWithLastConsumed(
              						current,
              						"identifier",
              						lv_identifier_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMyQvto.g:5497:3: (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==60) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalMyQvto.g:5498:4: otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,60,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getUnitRefGOAccess().getFullStopKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:5502:4: ( (lv_identifier_3_0= RULE_ID ) )
            	    // InternalMyQvto.g:5503:5: (lv_identifier_3_0= RULE_ID )
            	    {
            	    // InternalMyQvto.g:5503:5: (lv_identifier_3_0= RULE_ID )
            	    // InternalMyQvto.g:5504:6: lv_identifier_3_0= RULE_ID
            	    {
            	    lv_identifier_3_0=(Token)match(input,RULE_ID,FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_identifier_3_0, grammarAccess.getUnitRefGOAccess().getIdentifierIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getUnitRefGORule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"identifier",
            	      							lv_identifier_3_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnitRefGO"


    // $ANTLR start "ruleDirectionKind"
    // InternalMyQvto.g:5525:1: ruleDirectionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'inout' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirectionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5531:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'inout' ) | (enumLiteral_2= 'out' ) ) )
            // InternalMyQvto.g:5532:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'inout' ) | (enumLiteral_2= 'out' ) )
            {
            // InternalMyQvto.g:5532:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'inout' ) | (enumLiteral_2= 'out' ) )
            int alt107=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt107=1;
                }
                break;
            case 62:
                {
                alt107=2;
                }
                break;
            case 63:
                {
                alt107=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalMyQvto.g:5533:3: (enumLiteral_0= 'in' )
                    {
                    // InternalMyQvto.g:5533:3: (enumLiteral_0= 'in' )
                    // InternalMyQvto.g:5534:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionKindAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDirectionKindAccess().getInEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5541:3: (enumLiteral_1= 'inout' )
                    {
                    // InternalMyQvto.g:5541:3: (enumLiteral_1= 'inout' )
                    // InternalMyQvto.g:5542:4: enumLiteral_1= 'inout'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionKindAccess().getInoutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDirectionKindAccess().getInoutEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:5549:3: (enumLiteral_2= 'out' )
                    {
                    // InternalMyQvto.g:5549:3: (enumLiteral_2= 'out' )
                    // InternalMyQvto.g:5550:4: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionKindAccess().getOutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDirectionKindAccess().getOutEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDirectionKind"


    // $ANTLR start "ruleComplexTypeKey"
    // InternalMyQvto.g:5560:1: ruleComplexTypeKey returns [Enumerator current=null] : ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Dict' ) | (enumLiteral_7= 'Tuple' ) ) ;
    public final Enumerator ruleComplexTypeKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5566:2: ( ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Dict' ) | (enumLiteral_7= 'Tuple' ) ) )
            // InternalMyQvto.g:5567:2: ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Dict' ) | (enumLiteral_7= 'Tuple' ) )
            {
            // InternalMyQvto.g:5567:2: ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Dict' ) | (enumLiteral_7= 'Tuple' ) )
            int alt108=8;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt108=1;
                }
                break;
            case 65:
                {
                alt108=2;
                }
                break;
            case 66:
                {
                alt108=3;
                }
                break;
            case 67:
                {
                alt108=4;
                }
                break;
            case 68:
                {
                alt108=5;
                }
                break;
            case 69:
                {
                alt108=6;
                }
                break;
            case 35:
                {
                alt108=7;
                }
                break;
            case 36:
                {
                alt108=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalMyQvto.g:5568:3: (enumLiteral_0= 'Collection' )
                    {
                    // InternalMyQvto.g:5568:3: (enumLiteral_0= 'Collection' )
                    // InternalMyQvto.g:5569:4: enumLiteral_0= 'Collection'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComplexTypeKeyAccess().getCollectionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComplexTypeKeyAccess().getCollectionEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5576:3: (enumLiteral_1= 'Set' )
                    {
                    // InternalMyQvto.g:5576:3: (enumLiteral_1= 'Set' )
                    // InternalMyQvto.g:5577:4: enumLiteral_1= 'Set'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComplexTypeKeyAccess().getSetEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComplexTypeKeyAccess().getSetEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:5584:3: (enumLiteral_2= 'OrderedSet' )
                    {
                    // InternalMyQvto.g:5584:3: (enumLiteral_2= 'OrderedSet' )
                    // InternalMyQvto.g:5585:4: enumLiteral_2= 'OrderedSet'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComplexTypeKeyAccess().getOrderedSetEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComplexTypeKeyAccess().getOrderedSetEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:5592:3: (enumLiteral_3= 'Sequence' )
                    {
                    // InternalMyQvto.g:5592:3: (enumLiteral_3= 'Sequence' )
                    // InternalMyQvto.g:5593:4: enumLiteral_3= 'Sequence'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComplexTypeKeyAccess().getSequenceEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComplexTypeKeyAccess().getSequenceEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyQvto.g:5600:3: (enumLiteral_4= 'Bag' )
                    {
                    // InternalMyQvto.g:5600:3: (enumLiteral_4= 'Bag' )
                    // InternalMyQvto.g:5601:4: enumLiteral_4= 'Bag'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComplexTypeKeyAccess().getBagEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getComplexTypeKeyAccess().getBagEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyQvto.g:5608:3: (enumLiteral_5= 'List' )
                    {
                    // InternalMyQvto.g:5608:3: (enumLiteral_5= 'List' )
                    // InternalMyQvto.g:5609:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComplexTypeKeyAccess().getListEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getComplexTypeKeyAccess().getListEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyQvto.g:5616:3: (enumLiteral_6= 'Dict' )
                    {
                    // InternalMyQvto.g:5616:3: (enumLiteral_6= 'Dict' )
                    // InternalMyQvto.g:5617:4: enumLiteral_6= 'Dict'
                    {
                    enumLiteral_6=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComplexTypeKeyAccess().getDictEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getComplexTypeKeyAccess().getDictEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyQvto.g:5624:3: (enumLiteral_7= 'Tuple' )
                    {
                    // InternalMyQvto.g:5624:3: (enumLiteral_7= 'Tuple' )
                    // InternalMyQvto.g:5625:4: enumLiteral_7= 'Tuple'
                    {
                    enumLiteral_7=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComplexTypeKeyAccess().getTupleEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getComplexTypeKeyAccess().getTupleEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComplexTypeKey"


    // $ANTLR start "ruleCollectionKey"
    // InternalMyQvto.g:5635:1: ruleCollectionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) ) ;
    public final Enumerator ruleCollectionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5641:2: ( ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) ) )
            // InternalMyQvto.g:5642:2: ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) )
            {
            // InternalMyQvto.g:5642:2: ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) )
            int alt109=6;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt109=1;
                }
                break;
            case 65:
                {
                alt109=2;
                }
                break;
            case 66:
                {
                alt109=3;
                }
                break;
            case 67:
                {
                alt109=4;
                }
                break;
            case 68:
                {
                alt109=5;
                }
                break;
            case 69:
                {
                alt109=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalMyQvto.g:5643:3: (enumLiteral_0= 'Collection' )
                    {
                    // InternalMyQvto.g:5643:3: (enumLiteral_0= 'Collection' )
                    // InternalMyQvto.g:5644:4: enumLiteral_0= 'Collection'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCollectionKeyAccess().getCollectionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCollectionKeyAccess().getCollectionEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5651:3: (enumLiteral_1= 'Set' )
                    {
                    // InternalMyQvto.g:5651:3: (enumLiteral_1= 'Set' )
                    // InternalMyQvto.g:5652:4: enumLiteral_1= 'Set'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCollectionKeyAccess().getSetEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCollectionKeyAccess().getSetEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:5659:3: (enumLiteral_2= 'OrderedSet' )
                    {
                    // InternalMyQvto.g:5659:3: (enumLiteral_2= 'OrderedSet' )
                    // InternalMyQvto.g:5660:4: enumLiteral_2= 'OrderedSet'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCollectionKeyAccess().getOrderedSetEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCollectionKeyAccess().getOrderedSetEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:5667:3: (enumLiteral_3= 'Sequence' )
                    {
                    // InternalMyQvto.g:5667:3: (enumLiteral_3= 'Sequence' )
                    // InternalMyQvto.g:5668:4: enumLiteral_3= 'Sequence'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCollectionKeyAccess().getSequenceEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCollectionKeyAccess().getSequenceEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyQvto.g:5675:3: (enumLiteral_4= 'Bag' )
                    {
                    // InternalMyQvto.g:5675:3: (enumLiteral_4= 'Bag' )
                    // InternalMyQvto.g:5676:4: enumLiteral_4= 'Bag'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCollectionKeyAccess().getBagEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCollectionKeyAccess().getBagEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyQvto.g:5683:3: (enumLiteral_5= 'List' )
                    {
                    // InternalMyQvto.g:5683:3: (enumLiteral_5= 'List' )
                    // InternalMyQvto.g:5684:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCollectionKeyAccess().getListEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getCollectionKeyAccess().getListEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionKey"


    // $ANTLR start "ruleGeneralQualifier"
    // InternalMyQvto.g:5694:1: ruleGeneralQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'blackbox' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'static' ) ) ;
    public final Enumerator ruleGeneralQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5700:2: ( ( (enumLiteral_0= 'blackbox' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'static' ) ) )
            // InternalMyQvto.g:5701:2: ( (enumLiteral_0= 'blackbox' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'static' ) )
            {
            // InternalMyQvto.g:5701:2: ( (enumLiteral_0= 'blackbox' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'static' ) )
            int alt110=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt110=1;
                }
                break;
            case 71:
                {
                alt110=2;
                }
                break;
            case 72:
                {
                alt110=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // InternalMyQvto.g:5702:3: (enumLiteral_0= 'blackbox' )
                    {
                    // InternalMyQvto.g:5702:3: (enumLiteral_0= 'blackbox' )
                    // InternalMyQvto.g:5703:4: enumLiteral_0= 'blackbox'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGeneralQualifierAccess().getBlackboxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGeneralQualifierAccess().getBlackboxEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5710:3: (enumLiteral_1= 'abstract' )
                    {
                    // InternalMyQvto.g:5710:3: (enumLiteral_1= 'abstract' )
                    // InternalMyQvto.g:5711:4: enumLiteral_1= 'abstract'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGeneralQualifierAccess().getAbstractEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGeneralQualifierAccess().getAbstractEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:5718:3: (enumLiteral_2= 'static' )
                    {
                    // InternalMyQvto.g:5718:3: (enumLiteral_2= 'static' )
                    // InternalMyQvto.g:5719:4: enumLiteral_2= 'static'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGeneralQualifierAccess().getStaticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGeneralQualifierAccess().getStaticEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGeneralQualifier"


    // $ANTLR start "ruleHelperKind"
    // InternalMyQvto.g:5729:1: ruleHelperKind returns [Enumerator current=null] : ( (enumLiteral_0= 'helper' ) | (enumLiteral_1= 'query' ) ) ;
    public final Enumerator ruleHelperKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5735:2: ( ( (enumLiteral_0= 'helper' ) | (enumLiteral_1= 'query' ) ) )
            // InternalMyQvto.g:5736:2: ( (enumLiteral_0= 'helper' ) | (enumLiteral_1= 'query' ) )
            {
            // InternalMyQvto.g:5736:2: ( (enumLiteral_0= 'helper' ) | (enumLiteral_1= 'query' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==73) ) {
                alt111=1;
            }
            else if ( (LA111_0==74) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalMyQvto.g:5737:3: (enumLiteral_0= 'helper' )
                    {
                    // InternalMyQvto.g:5737:3: (enumLiteral_0= 'helper' )
                    // InternalMyQvto.g:5738:4: enumLiteral_0= 'helper'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHelperKindAccess().getHelperEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getHelperKindAccess().getHelperEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5745:3: (enumLiteral_1= 'query' )
                    {
                    // InternalMyQvto.g:5745:3: (enumLiteral_1= 'query' )
                    // InternalMyQvto.g:5746:4: enumLiteral_1= 'query'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHelperKindAccess().getQueryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getHelperKindAccess().getQueryEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHelperKind"


    // $ANTLR start "ruleModuleKind"
    // InternalMyQvto.g:5756:1: ruleModuleKind returns [Enumerator current=null] : ( (enumLiteral_0= 'transformation' ) | (enumLiteral_1= 'library' ) ) ;
    public final Enumerator ruleModuleKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5762:2: ( ( (enumLiteral_0= 'transformation' ) | (enumLiteral_1= 'library' ) ) )
            // InternalMyQvto.g:5763:2: ( (enumLiteral_0= 'transformation' ) | (enumLiteral_1= 'library' ) )
            {
            // InternalMyQvto.g:5763:2: ( (enumLiteral_0= 'transformation' ) | (enumLiteral_1= 'library' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==40) ) {
                alt112=1;
            }
            else if ( (LA112_0==48) ) {
                alt112=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalMyQvto.g:5764:3: (enumLiteral_0= 'transformation' )
                    {
                    // InternalMyQvto.g:5764:3: (enumLiteral_0= 'transformation' )
                    // InternalMyQvto.g:5765:4: enumLiteral_0= 'transformation'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getModuleKindAccess().getTransformationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getModuleKindAccess().getTransformationEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5772:3: (enumLiteral_1= 'library' )
                    {
                    // InternalMyQvto.g:5772:3: (enumLiteral_1= 'library' )
                    // InternalMyQvto.g:5773:4: enumLiteral_1= 'library'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getModuleKindAccess().getLibraryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getModuleKindAccess().getLibraryEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModuleKind"


    // $ANTLR start "ruleMappingExtensionKey"
    // InternalMyQvto.g:5783:1: ruleMappingExtensionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'inherits' ) | (enumLiteral_1= 'merges' ) | (enumLiteral_2= 'disjuncts' ) ) ;
    public final Enumerator ruleMappingExtensionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5789:2: ( ( (enumLiteral_0= 'inherits' ) | (enumLiteral_1= 'merges' ) | (enumLiteral_2= 'disjuncts' ) ) )
            // InternalMyQvto.g:5790:2: ( (enumLiteral_0= 'inherits' ) | (enumLiteral_1= 'merges' ) | (enumLiteral_2= 'disjuncts' ) )
            {
            // InternalMyQvto.g:5790:2: ( (enumLiteral_0= 'inherits' ) | (enumLiteral_1= 'merges' ) | (enumLiteral_2= 'disjuncts' ) )
            int alt113=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt113=1;
                }
                break;
            case 76:
                {
                alt113=2;
                }
                break;
            case 77:
                {
                alt113=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalMyQvto.g:5791:3: (enumLiteral_0= 'inherits' )
                    {
                    // InternalMyQvto.g:5791:3: (enumLiteral_0= 'inherits' )
                    // InternalMyQvto.g:5792:4: enumLiteral_0= 'inherits'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMappingExtensionKeyAccess().getInheritsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMappingExtensionKeyAccess().getInheritsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5799:3: (enumLiteral_1= 'merges' )
                    {
                    // InternalMyQvto.g:5799:3: (enumLiteral_1= 'merges' )
                    // InternalMyQvto.g:5800:4: enumLiteral_1= 'merges'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMappingExtensionKeyAccess().getMergesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMappingExtensionKeyAccess().getMergesEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:5807:3: (enumLiteral_2= 'disjuncts' )
                    {
                    // InternalMyQvto.g:5807:3: (enumLiteral_2= 'disjuncts' )
                    // InternalMyQvto.g:5808:4: enumLiteral_2= 'disjuncts'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMappingExtensionKeyAccess().getDisjunctsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMappingExtensionKeyAccess().getDisjunctsEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMappingExtensionKey"


    // $ANTLR start "rulePropertyKey"
    // InternalMyQvto.g:5818:1: rulePropertyKey returns [Enumerator current=null] : ( (enumLiteral_0= 'derived' ) | (enumLiteral_1= 'literal' ) | (enumLiteral_2= 'configuration' ) | (enumLiteral_3= 'property' ) ) ;
    public final Enumerator rulePropertyKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5824:2: ( ( (enumLiteral_0= 'derived' ) | (enumLiteral_1= 'literal' ) | (enumLiteral_2= 'configuration' ) | (enumLiteral_3= 'property' ) ) )
            // InternalMyQvto.g:5825:2: ( (enumLiteral_0= 'derived' ) | (enumLiteral_1= 'literal' ) | (enumLiteral_2= 'configuration' ) | (enumLiteral_3= 'property' ) )
            {
            // InternalMyQvto.g:5825:2: ( (enumLiteral_0= 'derived' ) | (enumLiteral_1= 'literal' ) | (enumLiteral_2= 'configuration' ) | (enumLiteral_3= 'property' ) )
            int alt114=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt114=1;
                }
                break;
            case 79:
                {
                alt114=2;
                }
                break;
            case 80:
                {
                alt114=3;
                }
                break;
            case 81:
                {
                alt114=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalMyQvto.g:5826:3: (enumLiteral_0= 'derived' )
                    {
                    // InternalMyQvto.g:5826:3: (enumLiteral_0= 'derived' )
                    // InternalMyQvto.g:5827:4: enumLiteral_0= 'derived'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPropertyKeyAccess().getDerivedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPropertyKeyAccess().getDerivedEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5834:3: (enumLiteral_1= 'literal' )
                    {
                    // InternalMyQvto.g:5834:3: (enumLiteral_1= 'literal' )
                    // InternalMyQvto.g:5835:4: enumLiteral_1= 'literal'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPropertyKeyAccess().getLiteralEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getPropertyKeyAccess().getLiteralEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:5842:3: (enumLiteral_2= 'configuration' )
                    {
                    // InternalMyQvto.g:5842:3: (enumLiteral_2= 'configuration' )
                    // InternalMyQvto.g:5843:4: enumLiteral_2= 'configuration'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPropertyKeyAccess().getConfigurationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getPropertyKeyAccess().getConfigurationEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:5850:3: (enumLiteral_3= 'property' )
                    {
                    // InternalMyQvto.g:5850:3: (enumLiteral_3= 'property' )
                    // InternalMyQvto.g:5851:4: enumLiteral_3= 'property'
                    {
                    enumLiteral_3=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPropertyKeyAccess().getPropertyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getPropertyKeyAccess().getPropertyEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertyKey"


    // $ANTLR start "ruleFeatureKey"
    // InternalMyQvto.g:5861:1: ruleFeatureKey returns [Enumerator current=null] : ( (enumLiteral_0= 'composes' ) | (enumLiteral_1= 'references' ) | (enumLiteral_2= 'readonly' ) | (enumLiteral_3= 'derived' ) | (enumLiteral_4= 'static' ) ) ;
    public final Enumerator ruleFeatureKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5867:2: ( ( (enumLiteral_0= 'composes' ) | (enumLiteral_1= 'references' ) | (enumLiteral_2= 'readonly' ) | (enumLiteral_3= 'derived' ) | (enumLiteral_4= 'static' ) ) )
            // InternalMyQvto.g:5868:2: ( (enumLiteral_0= 'composes' ) | (enumLiteral_1= 'references' ) | (enumLiteral_2= 'readonly' ) | (enumLiteral_3= 'derived' ) | (enumLiteral_4= 'static' ) )
            {
            // InternalMyQvto.g:5868:2: ( (enumLiteral_0= 'composes' ) | (enumLiteral_1= 'references' ) | (enumLiteral_2= 'readonly' ) | (enumLiteral_3= 'derived' ) | (enumLiteral_4= 'static' ) )
            int alt115=5;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt115=1;
                }
                break;
            case 83:
                {
                alt115=2;
                }
                break;
            case 84:
                {
                alt115=3;
                }
                break;
            case 78:
                {
                alt115=4;
                }
                break;
            case 72:
                {
                alt115=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // InternalMyQvto.g:5869:3: (enumLiteral_0= 'composes' )
                    {
                    // InternalMyQvto.g:5869:3: (enumLiteral_0= 'composes' )
                    // InternalMyQvto.g:5870:4: enumLiteral_0= 'composes'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFeatureKeyAccess().getComposesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getFeatureKeyAccess().getComposesEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5877:3: (enumLiteral_1= 'references' )
                    {
                    // InternalMyQvto.g:5877:3: (enumLiteral_1= 'references' )
                    // InternalMyQvto.g:5878:4: enumLiteral_1= 'references'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFeatureKeyAccess().getReferencesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getFeatureKeyAccess().getReferencesEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:5885:3: (enumLiteral_2= 'readonly' )
                    {
                    // InternalMyQvto.g:5885:3: (enumLiteral_2= 'readonly' )
                    // InternalMyQvto.g:5886:4: enumLiteral_2= 'readonly'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFeatureKeyAccess().getReadonlyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getFeatureKeyAccess().getReadonlyEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:5893:3: (enumLiteral_3= 'derived' )
                    {
                    // InternalMyQvto.g:5893:3: (enumLiteral_3= 'derived' )
                    // InternalMyQvto.g:5894:4: enumLiteral_3= 'derived'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFeatureKeyAccess().getDerivedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getFeatureKeyAccess().getDerivedEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyQvto.g:5901:3: (enumLiteral_4= 'static' )
                    {
                    // InternalMyQvto.g:5901:3: (enumLiteral_4= 'static' )
                    // InternalMyQvto.g:5902:4: enumLiteral_4= 'static'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFeatureKeyAccess().getStaticEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getFeatureKeyAccess().getStaticEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureKey"

    // $ANTLR start synpred58_InternalMyQvto
    public final void synpred58_InternalMyQvto_fragment() throws RecognitionException {   
        EObject lv_expression_list_2_0 = null;


        // InternalMyQvto.g:1869:4: ( (lv_expression_list_2_0= ruleExpressionList ) )
        // InternalMyQvto.g:1869:4: (lv_expression_list_2_0= ruleExpressionList )
        {
        // InternalMyQvto.g:1869:4: (lv_expression_list_2_0= ruleExpressionList )
        // InternalMyQvto.g:1870:5: lv_expression_list_2_0= ruleExpressionList
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpressionBlockAccess().getExpression_listExpressionListParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_expression_list_2_0=ruleExpressionList();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred58_InternalMyQvto

    // $ANTLR start synpred63_InternalMyQvto
    public final void synpred63_InternalMyQvto_fragment() throws RecognitionException {   
        EObject lv_init_part_1_0 = null;


        // InternalMyQvto.g:2176:5: ( (lv_init_part_1_0= ruleInitPart ) )
        // InternalMyQvto.g:2176:5: (lv_init_part_1_0= ruleInitPart )
        {
        // InternalMyQvto.g:2176:5: (lv_init_part_1_0= ruleInitPart )
        // InternalMyQvto.g:2177:6: lv_init_part_1_0= ruleInitPart
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDeclaratorAccess().getInit_partInitPartParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_init_part_1_0=ruleInitPart();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred63_InternalMyQvto

    // $ANTLR start synpred65_InternalMyQvto
    public final void synpred65_InternalMyQvto_fragment() throws RecognitionException {   
        EObject lv_init_part_5_0 = null;


        // InternalMyQvto.g:2240:5: ( (lv_init_part_5_0= ruleInitPart ) )
        // InternalMyQvto.g:2240:5: (lv_init_part_5_0= ruleInitPart )
        {
        // InternalMyQvto.g:2240:5: (lv_init_part_5_0= ruleInitPart )
        // InternalMyQvto.g:2241:6: lv_init_part_5_0= ruleInitPart
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDeclaratorAccess().getInit_partInitPartParserRuleCall_1_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_init_part_5_0=ruleInitPart();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred65_InternalMyQvto

    // $ANTLR start synpred70_InternalMyQvto
    public final void synpred70_InternalMyQvto_fragment() throws RecognitionException {   
        Enumerator lv_complex_type_key_1_0 = null;


        // InternalMyQvto.g:2486:3: ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) )
        // InternalMyQvto.g:2486:3: ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) )
        {
        // InternalMyQvto.g:2486:3: ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) )
        // InternalMyQvto.g:2487:4: () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) )
        {
        // InternalMyQvto.g:2487:4: ()
        // InternalMyQvto.g:2488:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMyQvto.g:2497:4: ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) )
        // InternalMyQvto.g:2498:5: (lv_complex_type_key_1_0= ruleComplexTypeKey )
        {
        // InternalMyQvto.g:2498:5: (lv_complex_type_key_1_0= ruleComplexTypeKey )
        // InternalMyQvto.g:2499:6: lv_complex_type_key_1_0= ruleComplexTypeKey
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getComplexTypeAccess().getComplex_type_keyComplexTypeKeyEnumRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_complex_type_key_1_0=ruleComplexTypeKey();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred70_InternalMyQvto

    // $ANTLR start synpred71_InternalMyQvto
    public final void synpred71_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_collection_key_2_0 = null;

        EObject lv_typespec_4_0 = null;


        // InternalMyQvto.g:2518:3: ( ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) )
        // InternalMyQvto.g:2518:3: ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' )
        {
        // InternalMyQvto.g:2518:3: ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' )
        // InternalMyQvto.g:2519:4: ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')'
        {
        // InternalMyQvto.g:2519:4: ( (lv_collection_key_2_0= ruleCollectionKey ) )
        // InternalMyQvto.g:2520:5: (lv_collection_key_2_0= ruleCollectionKey )
        {
        // InternalMyQvto.g:2520:5: (lv_collection_key_2_0= ruleCollectionKey )
        // InternalMyQvto.g:2521:6: lv_collection_key_2_0= ruleCollectionKey
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getComplexTypeAccess().getCollection_keyCollectionKeyEnumRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_40);
        lv_collection_key_2_0=ruleCollectionKey();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_3=(Token)match(input,28,FOLLOW_28); if (state.failed) return ;
        // InternalMyQvto.g:2542:4: ( (lv_typespec_4_0= ruleTypeSpec ) )
        // InternalMyQvto.g:2543:5: (lv_typespec_4_0= ruleTypeSpec )
        {
        // InternalMyQvto.g:2543:5: (lv_typespec_4_0= ruleTypeSpec )
        // InternalMyQvto.g:2544:6: lv_typespec_4_0= ruleTypeSpec
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getComplexTypeAccess().getTypespecTypeSpecParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_33);
        lv_typespec_4_0=ruleTypeSpec();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,29,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred71_InternalMyQvto

    // $ANTLR start synpred72_InternalMyQvto
    public final void synpred72_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_typespec_8_0 = null;

        EObject lv_typespec_10_0 = null;


        // InternalMyQvto.g:2567:3: ( (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) )
        // InternalMyQvto.g:2567:3: (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' )
        {
        // InternalMyQvto.g:2567:3: (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' )
        // InternalMyQvto.g:2568:4: otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')'
        {
        otherlv_6=(Token)match(input,35,FOLLOW_40); if (state.failed) return ;
        otherlv_7=(Token)match(input,28,FOLLOW_28); if (state.failed) return ;
        // InternalMyQvto.g:2576:4: ( (lv_typespec_8_0= ruleTypeSpec ) )
        // InternalMyQvto.g:2577:5: (lv_typespec_8_0= ruleTypeSpec )
        {
        // InternalMyQvto.g:2577:5: (lv_typespec_8_0= ruleTypeSpec )
        // InternalMyQvto.g:2578:6: lv_typespec_8_0= ruleTypeSpec
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getComplexTypeAccess().getTypespecTypeSpecParserRuleCall_2_2_0());
          					
        }
        pushFollow(FOLLOW_41);
        lv_typespec_8_0=ruleTypeSpec();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_9=(Token)match(input,14,FOLLOW_28); if (state.failed) return ;
        // InternalMyQvto.g:2599:4: ( (lv_typespec_10_0= ruleTypeSpec ) )
        // InternalMyQvto.g:2600:5: (lv_typespec_10_0= ruleTypeSpec )
        {
        // InternalMyQvto.g:2600:5: (lv_typespec_10_0= ruleTypeSpec )
        // InternalMyQvto.g:2601:6: lv_typespec_10_0= ruleTypeSpec
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getComplexTypeAccess().getTypespecTypeSpecParserRuleCall_2_4_0());
          					
        }
        pushFollow(FOLLOW_33);
        lv_typespec_10_0=ruleTypeSpec();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,29,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred72_InternalMyQvto

    // $ANTLR start synpred74_InternalMyQvto
    public final void synpred74_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_initSection_5_0 = null;


        // InternalMyQvto.g:2865:6: (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )
        // InternalMyQvto.g:2865:6: otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) )
        {
        otherlv_4=(Token)match(input,16,FOLLOW_12); if (state.failed) return ;
        // InternalMyQvto.g:2869:6: ( (lv_initSection_5_0= ruleExpressionGO ) )
        // InternalMyQvto.g:2870:7: (lv_initSection_5_0= ruleExpressionGO )
        {
        // InternalMyQvto.g:2870:7: (lv_initSection_5_0= ruleExpressionGO )
        // InternalMyQvto.g:2871:8: lv_initSection_5_0= ruleExpressionGO
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMappingBodyAccess().getInitSectionExpressionGOParserRuleCall_1_2_1_1_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_initSection_5_0=ruleExpressionGO();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred74_InternalMyQvto

    // $ANTLR start synpred76_InternalMyQvto
    public final void synpred76_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_initSection_3_0 = null;

        EObject lv_initSection_5_0 = null;


        // InternalMyQvto.g:2845:5: ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )
        // InternalMyQvto.g:2845:5: ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )?
        {
        // InternalMyQvto.g:2845:5: ( (lv_initSection_3_0= ruleExpressionGO ) )
        // InternalMyQvto.g:2846:6: (lv_initSection_3_0= ruleExpressionGO )
        {
        // InternalMyQvto.g:2846:6: (lv_initSection_3_0= ruleExpressionGO )
        // InternalMyQvto.g:2847:7: lv_initSection_3_0= ruleExpressionGO
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getMappingBodyAccess().getInitSectionExpressionGOParserRuleCall_1_2_0_0());
          						
        }
        pushFollow(FOLLOW_17);
        lv_initSection_3_0=ruleExpressionGO();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyQvto.g:2864:5: (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )*
        loop121:
        do {
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==16) ) {
                int LA121_1 = input.LA(2);

                if ( (synpred74_InternalMyQvto()) ) {
                    alt121=1;
                }


            }


            switch (alt121) {
        	case 1 :
        	    // InternalMyQvto.g:2865:6: otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) )
        	    {
        	    otherlv_4=(Token)match(input,16,FOLLOW_12); if (state.failed) return ;
        	    // InternalMyQvto.g:2869:6: ( (lv_initSection_5_0= ruleExpressionGO ) )
        	    // InternalMyQvto.g:2870:7: (lv_initSection_5_0= ruleExpressionGO )
        	    {
        	    // InternalMyQvto.g:2870:7: (lv_initSection_5_0= ruleExpressionGO )
        	    // InternalMyQvto.g:2871:8: lv_initSection_5_0= ruleExpressionGO
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getMappingBodyAccess().getInitSectionExpressionGOParserRuleCall_1_2_1_1_0());
        	      							
        	    }
        	    pushFollow(FOLLOW_17);
        	    lv_initSection_5_0=ruleExpressionGO();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop121;
            }
        } while (true);

        // InternalMyQvto.g:2889:5: (otherlv_6= ';' )?
        int alt122=2;
        int LA122_0 = input.LA(1);

        if ( (LA122_0==16) ) {
            alt122=1;
        }
        switch (alt122) {
            case 1 :
                // InternalMyQvto.g:2890:6: otherlv_6= ';'
                {
                otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred76_InternalMyQvto

    // $ANTLR start synpred78_InternalMyQvto
    public final void synpred78_InternalMyQvto_fragment() throws RecognitionException {   
        EObject lv_population_section_8_0 = null;


        // InternalMyQvto.g:2902:4: ( (lv_population_section_8_0= rulePopulationSection ) )
        // InternalMyQvto.g:2902:4: (lv_population_section_8_0= rulePopulationSection )
        {
        // InternalMyQvto.g:2902:4: (lv_population_section_8_0= rulePopulationSection )
        // InternalMyQvto.g:2903:5: lv_population_section_8_0= rulePopulationSection
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getMappingBodyAccess().getPopulation_sectionPopulationSectionParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_population_section_8_0=rulePopulationSection();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred78_InternalMyQvto

    // $ANTLR start synpred79_InternalMyQvto
    public final void synpred79_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        EObject lv_endSection_13_0 = null;


        // InternalMyQvto.g:2950:6: (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )
        // InternalMyQvto.g:2950:6: otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) )
        {
        otherlv_12=(Token)match(input,16,FOLLOW_12); if (state.failed) return ;
        // InternalMyQvto.g:2954:6: ( (lv_endSection_13_0= ruleExpressionGO ) )
        // InternalMyQvto.g:2955:7: (lv_endSection_13_0= ruleExpressionGO )
        {
        // InternalMyQvto.g:2955:7: (lv_endSection_13_0= ruleExpressionGO )
        // InternalMyQvto.g:2956:8: lv_endSection_13_0= ruleExpressionGO
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMappingBodyAccess().getEndSectionExpressionGOParserRuleCall_3_2_1_1_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_endSection_13_0=ruleExpressionGO();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred79_InternalMyQvto

    // $ANTLR start synpred81_InternalMyQvto
    public final void synpred81_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_endSection_11_0 = null;

        EObject lv_endSection_13_0 = null;


        // InternalMyQvto.g:2930:5: ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )
        // InternalMyQvto.g:2930:5: ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )?
        {
        // InternalMyQvto.g:2930:5: ( (lv_endSection_11_0= ruleExpressionGO ) )
        // InternalMyQvto.g:2931:6: (lv_endSection_11_0= ruleExpressionGO )
        {
        // InternalMyQvto.g:2931:6: (lv_endSection_11_0= ruleExpressionGO )
        // InternalMyQvto.g:2932:7: lv_endSection_11_0= ruleExpressionGO
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getMappingBodyAccess().getEndSectionExpressionGOParserRuleCall_3_2_0_0());
          						
        }
        pushFollow(FOLLOW_17);
        lv_endSection_11_0=ruleExpressionGO();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyQvto.g:2949:5: (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )*
        loop126:
        do {
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==16) ) {
                int LA126_1 = input.LA(2);

                if ( (synpred79_InternalMyQvto()) ) {
                    alt126=1;
                }


            }


            switch (alt126) {
        	case 1 :
        	    // InternalMyQvto.g:2950:6: otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) )
        	    {
        	    otherlv_12=(Token)match(input,16,FOLLOW_12); if (state.failed) return ;
        	    // InternalMyQvto.g:2954:6: ( (lv_endSection_13_0= ruleExpressionGO ) )
        	    // InternalMyQvto.g:2955:7: (lv_endSection_13_0= ruleExpressionGO )
        	    {
        	    // InternalMyQvto.g:2955:7: (lv_endSection_13_0= ruleExpressionGO )
        	    // InternalMyQvto.g:2956:8: lv_endSection_13_0= ruleExpressionGO
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getMappingBodyAccess().getEndSectionExpressionGOParserRuleCall_3_2_1_1_0());
        	      							
        	    }
        	    pushFollow(FOLLOW_17);
        	    lv_endSection_13_0=ruleExpressionGO();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop126;
            }
        } while (true);

        // InternalMyQvto.g:2974:5: (otherlv_14= ';' )?
        int alt127=2;
        int LA127_0 = input.LA(1);

        if ( (LA127_0==16) ) {
            alt127=1;
        }
        switch (alt127) {
            case 1 :
                // InternalMyQvto.g:2975:6: otherlv_14= ';'
                {
                otherlv_14=(Token)match(input,16,FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred81_InternalMyQvto

    // $ANTLR start synpred121_InternalMyQvto
    public final void synpred121_InternalMyQvto_fragment() throws RecognitionException {   
        EObject lv_feature_qualifier_0_0 = null;


        // InternalMyQvto.g:5063:5: ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )
        // InternalMyQvto.g:5063:5: (lv_feature_qualifier_0_0= ruleFeatureQualifier )
        {
        // InternalMyQvto.g:5063:5: (lv_feature_qualifier_0_0= ruleFeatureQualifier )
        // InternalMyQvto.g:5064:6: lv_feature_qualifier_0_0= ruleFeatureQualifier
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getClassifierFeatureAccess().getFeature_qualifierFeatureQualifierParserRuleCall_0_0_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_feature_qualifier_0_0=ruleFeatureQualifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred121_InternalMyQvto

    // Delegated rules

    public final boolean synpred74_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA96 dfa96 = new DFA96(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\21\3\50\4\uffff\1\67\11\uffff";
    static final String dfa_3s = "\1\121\3\112\4\uffff\1\121\11\uffff";
    static final String dfa_4s = "\4\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\14\5\uffff\1\10\1\15\1\20\16\uffff\1\5\1\uffff\1\17\2\uffff\1\6\1\7\1\12\1\13\2\16\1\uffff\4\21\16\uffff\1\1\1\2\1\3\2\4\3\uffff\4\11",
            "\1\5\4\uffff\1\6\1\7\10\uffff\1\21\16\uffff\1\1\1\2\1\3\2\4",
            "\1\5\4\uffff\1\6\1\7\10\uffff\1\21\16\uffff\1\1\1\2\1\3\2\4",
            "\1\5\4\uffff\1\6\1\7\10\uffff\1\21\16\uffff\1\1\1\2\1\3\2\4",
            "",
            "",
            "",
            "",
            "\1\21\16\uffff\3\21\5\uffff\4\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "152:2: (this_Helper_0= ruleHelper | this_OperationalTransformation_1= ruleOperationalTransformation | this_MappingOperation_2= ruleMappingOperation | this_Constructor_3= ruleConstructor | this_ContextualProperty_4= ruleContextualProperty | this_EntryOperation_5= ruleEntryOperation | this_Library_6= ruleLibrary | this_ModelType_7= ruleModelType | this_TagGO_8= ruleTagGO | this_MetaModelGO_9= ruleMetaModelGO | this_AccessDecl_10= ruleAccessDecl | this_TypeDef_11= ruleTypeDef | this_ClassifierGO_12= ruleClassifierGO )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\27\3\55\3\uffff\1\67\6\uffff";
    static final String dfa_9s = "\1\121\3\112\3\uffff\1\121\6\uffff";
    static final String dfa_10s = "\4\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_11s = "\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\7\1\12\1\14\20\uffff\1\13\2\uffff\1\5\1\6\1\11\4\uffff\4\15\16\uffff\1\1\1\2\1\3\2\4\3\uffff\4\10",
            "\1\5\1\6\10\uffff\1\15\16\uffff\1\1\1\2\1\3\2\4",
            "\1\5\1\6\10\uffff\1\15\16\uffff\1\1\1\2\1\3\2\4",
            "\1\5\1\6\10\uffff\1\15\16\uffff\1\1\1\2\1\3\2\4",
            "",
            "",
            "",
            "\1\15\16\uffff\3\15\5\uffff\4\10",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "326:2: (this_Helper_0= ruleHelper | this_MappingOperation_1= ruleMappingOperation | this_Constructor_2= ruleConstructor | this_ContextualProperty_3= ruleContextualProperty | this_EntryOperation_4= ruleEntryOperation | this_TagGO_5= ruleTagGO | this_AccessDecl_6= ruleAccessDecl | this_TypeDef_7= ruleTypeDef | this_ClassifierGO_8= ruleClassifierGO )";
        }
    }
    static final String dfa_13s = "\6\uffff";
    static final String dfa_14s = "\1\uffff\1\2\3\uffff\1\2";
    static final String dfa_15s = "\1\4\1\16\1\uffff\1\4\1\uffff\1\16";
    static final String dfa_16s = "\1\105\1\115\1\uffff\1\4\1\uffff\1\115";
    static final String dfa_17s = "\2\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String dfa_18s = "\6\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\36\uffff\2\2\33\uffff\6\2",
            "\1\2\1\uffff\1\2\2\uffff\4\2\3\uffff\1\2\1\uffff\2\2\1\3\1\4\3\2\6\uffff\1\2\2\uffff\1\2\13\uffff\1\2\22\uffff\3\2",
            "",
            "\1\5",
            "",
            "\1\2\1\uffff\1\2\2\uffff\4\2\3\uffff\1\2\1\uffff\2\2\1\3\1\4\3\2\6\uffff\1\2\2\uffff\1\2\13\uffff\1\2\22\uffff\3\2"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2154:2: ( ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? ) | ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? ) )";
        }
    }
    static final String dfa_20s = "\7\uffff";
    static final String dfa_21s = "\1\3\1\2\2\uffff\2\2\1\uffff";
    static final String dfa_22s = "\1\16\1\4\2\uffff\2\4\1\0";
    static final String dfa_23s = "\2\115\2\uffff\2\115\1\0";
    static final String dfa_24s = "\2\uffff\1\1\1\2\3\uffff";
    static final String dfa_25s = "\6\uffff\1\0}>";
    static final String[] dfa_26s = {
            "\1\3\1\uffff\1\3\2\uffff\1\3\1\1\2\3\3\uffff\1\3\1\uffff\2\3\3\uffff\2\2\6\uffff\1\3\2\uffff\1\3\13\uffff\1\3\22\uffff\3\3",
            "\1\5\1\4\10\uffff\1\2\1\uffff\1\6\2\uffff\4\2\3\uffff\1\2\1\uffff\2\2\13\uffff\1\2\2\uffff\1\2\13\uffff\1\2\22\uffff\3\2",
            "",
            "",
            "\1\5\1\4\10\uffff\1\2\1\uffff\1\6\2\uffff\4\2\3\uffff\1\2\1\uffff\2\2\13\uffff\1\2\2\uffff\1\2\13\uffff\1\2\22\uffff\3\2",
            "\1\5\1\4\10\uffff\1\2\1\uffff\1\6\2\uffff\4\2\3\uffff\1\2\1\uffff\2\2\13\uffff\1\2\2\uffff\1\2\13\uffff\1\2\22\uffff\3\2",
            "\1\uffff"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2175:4: ( (lv_init_part_1_0= ruleInitPart ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalMyQvto()) ) {s = 2;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index44_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2239:4: ( (lv_init_part_5_0= ruleInitPart ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_6 = input.LA(1);

                         
                        int index45_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalMyQvto()) ) {s = 2;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index45_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\15\uffff";
    static final String dfa_28s = "\1\43\10\0\4\uffff";
    static final String dfa_29s = "\1\105\10\0\4\uffff";
    static final String dfa_30s = "\11\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_31s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\4\uffff}>";
    static final String[] dfa_32s = {
            "\1\7\1\10\33\uffff\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "2485:2: ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) | ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) | (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) | (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred71_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_2 = input.LA(1);

                         
                        int index50_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred71_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index50_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_3 = input.LA(1);

                         
                        int index50_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred71_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index50_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_4 = input.LA(1);

                         
                        int index50_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred71_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index50_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_5 = input.LA(1);

                         
                        int index50_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred71_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index50_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_6 = input.LA(1);

                         
                        int index50_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred71_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index50_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_7 = input.LA(1);

                         
                        int index50_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred72_InternalMyQvto()) ) {s = 11;}

                         
                        input.seek(index50_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA50_8 = input.LA(1);

                         
                        int index50_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalMyQvto()) ) {s = 9;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index50_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_33s = "\14\uffff";
    static final String dfa_34s = "\1\4\1\uffff\11\0\1\uffff";
    static final String dfa_35s = "\1\124\1\uffff\11\0\1\uffff";
    static final String dfa_36s = "\1\uffff\1\1\11\uffff\1\2";
    static final String dfa_37s = "\2\uffff\1\6\1\0\1\7\1\1\1\10\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] dfa_38s = {
            "\1\2\36\uffff\1\11\1\12\25\uffff\1\1\5\uffff\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\1\5\uffff\1\1\3\uffff\3\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "5062:4: ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA96_3 = input.LA(1);

                         
                        int index96_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index96_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA96_5 = input.LA(1);

                         
                        int index96_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index96_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA96_7 = input.LA(1);

                         
                        int index96_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index96_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA96_8 = input.LA(1);

                         
                        int index96_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index96_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA96_9 = input.LA(1);

                         
                        int index96_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index96_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA96_10 = input.LA(1);

                         
                        int index96_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index96_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA96_2 = input.LA(1);

                         
                        int index96_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index96_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA96_4 = input.LA(1);

                         
                        int index96_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index96_4);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA96_6 = input.LA(1);

                         
                        int index96_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index96_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 96, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00F7E50003823002L,0x000000000003C7C0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00F7E50003820002L,0x000000000003C7C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000094000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00F7E50003C20000L,0x000000000003C7C0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000E000400030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L,0x000000000003C000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001800800010L,0x000000000003C03FL});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00FFE50003C20000L,0x000000000003C7C0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0400001801400010L,0x00000000001C413FL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000600100002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000C000000032L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007C0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xE000001800000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xE000001820000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000010000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001010000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000100000080002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000200000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xE000000000000010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000020000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000400000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00000C0010000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000404030L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0400001801000010L,0x00000000001C413FL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0080000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0100000014000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C4100L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0800000000004000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x1000000000000002L});

}