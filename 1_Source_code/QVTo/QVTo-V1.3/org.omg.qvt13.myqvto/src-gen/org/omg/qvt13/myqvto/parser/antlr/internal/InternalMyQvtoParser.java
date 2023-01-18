package org.omg.qvt13.myqvto.parser.antlr.internal;

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
import org.omg.qvt13.myqvto.services.MyQvtoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyQvtoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_MULTIPLICITYRANGE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'from'", "'import'", "','", "'*'", "';'", "'modeltype'", "'uses'", "'where'", "'intermediate'", "'='", "'{'", "'}'", "'tag'", "'typedef'", "'main'", "'init'", "'end'", "'population'", "':'", "'@'", "':='", "'::='", "'::'", "'('", "')'", "'Dict'", "'Tuple'", "'constructor'", "'library'", "'access'", "'extends'", "'when'", "'mapping'", "'refines'", "'transformation'", "'metamodel'", "'package'", "'enum'", "'datatype'", "'primitive'", "'exception'", "'class'", "'['", "']'", "'opposites'", "'~'", "'<<'", "'>>'", "'.'", "'in'", "'inout'", "'out'", "'Collection'", "'Set'", "'OrderedSet'", "'Sequence'", "'Bag'", "'List'", "'blackbox'", "'abstract'", "'static'", "'derived'", "'literal'", "'configuration'", "'property'", "'helper'", "'query'", "'inherits'", "'merges'", "'disjuncts'", "'composes'", "'references'", "'readonly'"
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
            	      						"org.omg.qvt13.myqvto.MyQvto.ModuleImport");
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

                if ( (LA2_0==17||LA2_0==20||(LA2_0>=24 && LA2_0<=26)||(LA2_0>=39 && LA2_0<=41)||LA2_0==44||(LA2_0>=46 && LA2_0<=48)||(LA2_0>=50 && LA2_0<=53)||(LA2_0>=70 && LA2_0<=78)) ) {
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
            	      						"org.omg.qvt13.myqvto.MyQvto.Module");
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
    // InternalMyQvto.g:145:1: ruleModule returns [EObject current=null] : (this_Constructor_0= ruleConstructor | this_ContextualProperty_1= ruleContextualProperty | this_EntryOperation_2= ruleEntryOperation | this_Helper_3= ruleHelper | this_Library_4= ruleLibrary | this_MappingOperation_5= ruleMappingOperation | this_ModelType_6= ruleModelType | this_OperationalTransformation_7= ruleOperationalTransformation | this_TagGO_8= ruleTagGO | this_MetaModelGO_9= ruleMetaModelGO | this_AccessDecl_10= ruleAccessDecl | this_TypeDef_11= ruleTypeDef | this_ClassifierGO_12= ruleClassifierGO ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        EObject this_Constructor_0 = null;

        EObject this_ContextualProperty_1 = null;

        EObject this_EntryOperation_2 = null;

        EObject this_Helper_3 = null;

        EObject this_Library_4 = null;

        EObject this_MappingOperation_5 = null;

        EObject this_ModelType_6 = null;

        EObject this_OperationalTransformation_7 = null;

        EObject this_TagGO_8 = null;

        EObject this_MetaModelGO_9 = null;

        EObject this_AccessDecl_10 = null;

        EObject this_TypeDef_11 = null;

        EObject this_ClassifierGO_12 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:151:2: ( (this_Constructor_0= ruleConstructor | this_ContextualProperty_1= ruleContextualProperty | this_EntryOperation_2= ruleEntryOperation | this_Helper_3= ruleHelper | this_Library_4= ruleLibrary | this_MappingOperation_5= ruleMappingOperation | this_ModelType_6= ruleModelType | this_OperationalTransformation_7= ruleOperationalTransformation | this_TagGO_8= ruleTagGO | this_MetaModelGO_9= ruleMetaModelGO | this_AccessDecl_10= ruleAccessDecl | this_TypeDef_11= ruleTypeDef | this_ClassifierGO_12= ruleClassifierGO ) )
            // InternalMyQvto.g:152:2: (this_Constructor_0= ruleConstructor | this_ContextualProperty_1= ruleContextualProperty | this_EntryOperation_2= ruleEntryOperation | this_Helper_3= ruleHelper | this_Library_4= ruleLibrary | this_MappingOperation_5= ruleMappingOperation | this_ModelType_6= ruleModelType | this_OperationalTransformation_7= ruleOperationalTransformation | this_TagGO_8= ruleTagGO | this_MetaModelGO_9= ruleMetaModelGO | this_AccessDecl_10= ruleAccessDecl | this_TypeDef_11= ruleTypeDef | this_ClassifierGO_12= ruleClassifierGO )
            {
            // InternalMyQvto.g:152:2: (this_Constructor_0= ruleConstructor | this_ContextualProperty_1= ruleContextualProperty | this_EntryOperation_2= ruleEntryOperation | this_Helper_3= ruleHelper | this_Library_4= ruleLibrary | this_MappingOperation_5= ruleMappingOperation | this_ModelType_6= ruleModelType | this_OperationalTransformation_7= ruleOperationalTransformation | this_TagGO_8= ruleTagGO | this_MetaModelGO_9= ruleMetaModelGO | this_AccessDecl_10= ruleAccessDecl | this_TypeDef_11= ruleTypeDef | this_ClassifierGO_12= ruleClassifierGO )
            int alt3=13;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyQvto.g:153:3: this_Constructor_0= ruleConstructor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getConstructorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Constructor_0=ruleConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Constructor_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:165:3: this_ContextualProperty_1= ruleContextualProperty
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getContextualPropertyParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContextualProperty_1=ruleContextualProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContextualProperty_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:177:3: this_EntryOperation_2= ruleEntryOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getEntryOperationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EntryOperation_2=ruleEntryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EntryOperation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:189:3: this_Helper_3= ruleHelper
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getHelperParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Helper_3=ruleHelper();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Helper_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyQvto.g:201:3: this_Library_4= ruleLibrary
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getLibraryParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Library_4=ruleLibrary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Library_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyQvto.g:213:3: this_MappingOperation_5= ruleMappingOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getMappingOperationParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MappingOperation_5=ruleMappingOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MappingOperation_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMyQvto.g:225:3: this_ModelType_6= ruleModelType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getModelTypeParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ModelType_6=ruleModelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModelType_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMyQvto.g:237:3: this_OperationalTransformation_7= ruleOperationalTransformation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleAccess().getOperationalTransformationParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OperationalTransformation_7=ruleOperationalTransformation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OperationalTransformation_7;
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
    // InternalMyQvto.g:319:1: ruleImperativeOperation returns [EObject current=null] : (this_Constructor_0= ruleConstructor | this_ContextualProperty_1= ruleContextualProperty | this_EntryOperation_2= ruleEntryOperation | this_Helper_3= ruleHelper | this_MappingOperation_4= ruleMappingOperation | this_TagGO_5= ruleTagGO | this_AccessDecl_6= ruleAccessDecl | this_TypeDef_7= ruleTypeDef | this_ClassifierGO_8= ruleClassifierGO ) ;
    public final EObject ruleImperativeOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Constructor_0 = null;

        EObject this_ContextualProperty_1 = null;

        EObject this_EntryOperation_2 = null;

        EObject this_Helper_3 = null;

        EObject this_MappingOperation_4 = null;

        EObject this_TagGO_5 = null;

        EObject this_AccessDecl_6 = null;

        EObject this_TypeDef_7 = null;

        EObject this_ClassifierGO_8 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:325:2: ( (this_Constructor_0= ruleConstructor | this_ContextualProperty_1= ruleContextualProperty | this_EntryOperation_2= ruleEntryOperation | this_Helper_3= ruleHelper | this_MappingOperation_4= ruleMappingOperation | this_TagGO_5= ruleTagGO | this_AccessDecl_6= ruleAccessDecl | this_TypeDef_7= ruleTypeDef | this_ClassifierGO_8= ruleClassifierGO ) )
            // InternalMyQvto.g:326:2: (this_Constructor_0= ruleConstructor | this_ContextualProperty_1= ruleContextualProperty | this_EntryOperation_2= ruleEntryOperation | this_Helper_3= ruleHelper | this_MappingOperation_4= ruleMappingOperation | this_TagGO_5= ruleTagGO | this_AccessDecl_6= ruleAccessDecl | this_TypeDef_7= ruleTypeDef | this_ClassifierGO_8= ruleClassifierGO )
            {
            // InternalMyQvto.g:326:2: (this_Constructor_0= ruleConstructor | this_ContextualProperty_1= ruleContextualProperty | this_EntryOperation_2= ruleEntryOperation | this_Helper_3= ruleHelper | this_MappingOperation_4= ruleMappingOperation | this_TagGO_5= ruleTagGO | this_AccessDecl_6= ruleAccessDecl | this_TypeDef_7= ruleTypeDef | this_ClassifierGO_8= ruleClassifierGO )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMyQvto.g:327:3: this_Constructor_0= ruleConstructor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getConstructorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Constructor_0=ruleConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Constructor_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:339:3: this_ContextualProperty_1= ruleContextualProperty
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getContextualPropertyParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContextualProperty_1=ruleContextualProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContextualProperty_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:351:3: this_EntryOperation_2= ruleEntryOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getEntryOperationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EntryOperation_2=ruleEntryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EntryOperation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:363:3: this_Helper_3= ruleHelper
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getHelperParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Helper_3=ruleHelper();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Helper_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyQvto.g:375:3: this_MappingOperation_4= ruleMappingOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImperativeOperationAccess().getMappingOperationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MappingOperation_4=ruleMappingOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MappingOperation_4;
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
                      							"org.omg.qvt13.myqvto.MyQvto.UnitRefGO");
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
                      							"org.omg.qvt13.myqvto.MyQvto.UnitRefGO");
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


    // $ANTLR start "entryRuleEntryOperation"
    // InternalMyQvto.g:571:1: entryRuleEntryOperation returns [EObject current=null] : iv_ruleEntryOperation= ruleEntryOperation EOF ;
    public final EObject entryRuleEntryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryOperation = null;


        try {
            // InternalMyQvto.g:571:55: (iv_ruleEntryOperation= ruleEntryOperation EOF )
            // InternalMyQvto.g:572:2: iv_ruleEntryOperation= ruleEntryOperation EOF
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
    // InternalMyQvto.g:578:1: ruleEntryOperation returns [EObject current=null] : ( ( (lv_entry_header_0_0= ruleEntryHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) ) ;
    public final EObject ruleEntryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entry_header_0_0 = null;

        EObject lv_expression_block_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:584:2: ( ( ( (lv_entry_header_0_0= ruleEntryHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) ) )
            // InternalMyQvto.g:585:2: ( ( (lv_entry_header_0_0= ruleEntryHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) )
            {
            // InternalMyQvto.g:585:2: ( ( (lv_entry_header_0_0= ruleEntryHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) )
            // InternalMyQvto.g:586:3: ( (lv_entry_header_0_0= ruleEntryHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) )
            {
            // InternalMyQvto.g:586:3: ( (lv_entry_header_0_0= ruleEntryHeader ) )
            // InternalMyQvto.g:587:4: (lv_entry_header_0_0= ruleEntryHeader )
            {
            // InternalMyQvto.g:587:4: (lv_entry_header_0_0= ruleEntryHeader )
            // InternalMyQvto.g:588:5: lv_entry_header_0_0= ruleEntryHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntryOperationAccess().getEntry_headerEntryHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
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
              						"org.omg.qvt13.myqvto.MyQvto.EntryHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:605:3: (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyQvto.g:606:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEntryOperationAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:611:4: ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? )
                    {
                    // InternalMyQvto.g:611:4: ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? )
                    // InternalMyQvto.g:612:5: ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )?
                    {
                    // InternalMyQvto.g:612:5: ( (lv_expression_block_2_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:613:6: (lv_expression_block_2_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:613:6: (lv_expression_block_2_0= ruleExpressionBlock )
                    // InternalMyQvto.g:614:7: lv_expression_block_2_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getEntryOperationAccess().getExpression_blockExpressionBlockParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
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
                      								"org.omg.qvt13.myqvto.MyQvto.ExpressionBlock");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyQvto.g:631:5: (otherlv_3= ';' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==16) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyQvto.g:632:6: otherlv_3= ';'
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


    // $ANTLR start "entryRuleExpressionGO"
    // InternalMyQvto.g:643:1: entryRuleExpressionGO returns [EObject current=null] : iv_ruleExpressionGO= ruleExpressionGO EOF ;
    public final EObject entryRuleExpressionGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionGO = null;


        try {
            // InternalMyQvto.g:643:53: (iv_ruleExpressionGO= ruleExpressionGO EOF )
            // InternalMyQvto.g:644:2: iv_ruleExpressionGO= ruleExpressionGO EOF
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
    // InternalMyQvto.g:650:1: ruleExpressionGO returns [EObject current=null] : ( () ( (lv_dummyContent_1_0= ruleEString ) )* ) ;
    public final EObject ruleExpressionGO() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dummyContent_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:656:2: ( ( () ( (lv_dummyContent_1_0= ruleEString ) )* ) )
            // InternalMyQvto.g:657:2: ( () ( (lv_dummyContent_1_0= ruleEString ) )* )
            {
            // InternalMyQvto.g:657:2: ( () ( (lv_dummyContent_1_0= ruleEString ) )* )
            // InternalMyQvto.g:658:3: () ( (lv_dummyContent_1_0= ruleEString ) )*
            {
            // InternalMyQvto.g:658:3: ()
            // InternalMyQvto.g:659:4: 
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

            // InternalMyQvto.g:668:3: ( (lv_dummyContent_1_0= ruleEString ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyQvto.g:669:4: (lv_dummyContent_1_0= ruleEString )
            	    {
            	    // InternalMyQvto.g:669:4: (lv_dummyContent_1_0= ruleEString )
            	    // InternalMyQvto.g:670:5: lv_dummyContent_1_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getExpressionGOAccess().getDummyContentEStringParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
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
            	      						"org.omg.qvt13.myqvto.MyQvto.EString");
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


    // $ANTLR start "entryRuleModelType"
    // InternalMyQvto.g:691:1: entryRuleModelType returns [EObject current=null] : iv_ruleModelType= ruleModelType EOF ;
    public final EObject entryRuleModelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelType = null;


        try {
            // InternalMyQvto.g:691:50: (iv_ruleModelType= ruleModelType EOF )
            // InternalMyQvto.g:692:2: iv_ruleModelType= ruleModelType EOF
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
    // InternalMyQvto.g:698:1: ruleModelType returns [EObject current=null] : (otherlv_0= 'modeltype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_compliance_kind_2_0= RULE_STRING ) )? otherlv_3= 'uses' ( (lv_packageref_list_4_0= rulePackageRefGO ) ) (otherlv_5= ',' ( (lv_packageref_list_6_0= rulePackageRefGO ) ) )* (otherlv_7= 'where' ( (lv_modeltype_where_8_0= ruleExpressionBlock ) ) )? otherlv_9= ';' ) ;
    public final EObject ruleModelType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_compliance_kind_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_packageref_list_4_0 = null;

        EObject lv_packageref_list_6_0 = null;

        EObject lv_modeltype_where_8_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:704:2: ( (otherlv_0= 'modeltype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_compliance_kind_2_0= RULE_STRING ) )? otherlv_3= 'uses' ( (lv_packageref_list_4_0= rulePackageRefGO ) ) (otherlv_5= ',' ( (lv_packageref_list_6_0= rulePackageRefGO ) ) )* (otherlv_7= 'where' ( (lv_modeltype_where_8_0= ruleExpressionBlock ) ) )? otherlv_9= ';' ) )
            // InternalMyQvto.g:705:2: (otherlv_0= 'modeltype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_compliance_kind_2_0= RULE_STRING ) )? otherlv_3= 'uses' ( (lv_packageref_list_4_0= rulePackageRefGO ) ) (otherlv_5= ',' ( (lv_packageref_list_6_0= rulePackageRefGO ) ) )* (otherlv_7= 'where' ( (lv_modeltype_where_8_0= ruleExpressionBlock ) ) )? otherlv_9= ';' )
            {
            // InternalMyQvto.g:705:2: (otherlv_0= 'modeltype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_compliance_kind_2_0= RULE_STRING ) )? otherlv_3= 'uses' ( (lv_packageref_list_4_0= rulePackageRefGO ) ) (otherlv_5= ',' ( (lv_packageref_list_6_0= rulePackageRefGO ) ) )* (otherlv_7= 'where' ( (lv_modeltype_where_8_0= ruleExpressionBlock ) ) )? otherlv_9= ';' )
            // InternalMyQvto.g:706:3: otherlv_0= 'modeltype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_compliance_kind_2_0= RULE_STRING ) )? otherlv_3= 'uses' ( (lv_packageref_list_4_0= rulePackageRefGO ) ) (otherlv_5= ',' ( (lv_packageref_list_6_0= rulePackageRefGO ) ) )* (otherlv_7= 'where' ( (lv_modeltype_where_8_0= ruleExpressionBlock ) ) )? otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelTypeAccess().getModeltypeKeyword_0());
              		
            }
            // InternalMyQvto.g:710:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyQvto.g:711:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyQvto.g:711:4: (lv_name_1_0= RULE_ID )
            // InternalMyQvto.g:712:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getModelTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMyQvto.g:728:3: ( (lv_compliance_kind_2_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyQvto.g:729:4: (lv_compliance_kind_2_0= RULE_STRING )
                    {
                    // InternalMyQvto.g:729:4: (lv_compliance_kind_2_0= RULE_STRING )
                    // InternalMyQvto.g:730:5: lv_compliance_kind_2_0= RULE_STRING
                    {
                    lv_compliance_kind_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_compliance_kind_2_0, grammarAccess.getModelTypeAccess().getCompliance_kindSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getModelTypeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"compliance_kind",
                      						lv_compliance_kind_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getModelTypeAccess().getUsesKeyword_3());
              		
            }
            // InternalMyQvto.g:750:3: ( (lv_packageref_list_4_0= rulePackageRefGO ) )
            // InternalMyQvto.g:751:4: (lv_packageref_list_4_0= rulePackageRefGO )
            {
            // InternalMyQvto.g:751:4: (lv_packageref_list_4_0= rulePackageRefGO )
            // InternalMyQvto.g:752:5: lv_packageref_list_4_0= rulePackageRefGO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelTypeAccess().getPackageref_listPackageRefGOParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_packageref_list_4_0=rulePackageRefGO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelTypeRule());
              					}
              					add(
              						current,
              						"packageref_list",
              						lv_packageref_list_4_0,
              						"org.omg.qvt13.myqvto.MyQvto.PackageRefGO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:769:3: (otherlv_5= ',' ( (lv_packageref_list_6_0= rulePackageRefGO ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyQvto.g:770:4: otherlv_5= ',' ( (lv_packageref_list_6_0= rulePackageRefGO ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getModelTypeAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalMyQvto.g:774:4: ( (lv_packageref_list_6_0= rulePackageRefGO ) )
            	    // InternalMyQvto.g:775:5: (lv_packageref_list_6_0= rulePackageRefGO )
            	    {
            	    // InternalMyQvto.g:775:5: (lv_packageref_list_6_0= rulePackageRefGO )
            	    // InternalMyQvto.g:776:6: lv_packageref_list_6_0= rulePackageRefGO
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModelTypeAccess().getPackageref_listPackageRefGOParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_packageref_list_6_0=rulePackageRefGO();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModelTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"packageref_list",
            	      							lv_packageref_list_6_0,
            	      							"org.omg.qvt13.myqvto.MyQvto.PackageRefGO");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalMyQvto.g:794:3: (otherlv_7= 'where' ( (lv_modeltype_where_8_0= ruleExpressionBlock ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyQvto.g:795:4: otherlv_7= 'where' ( (lv_modeltype_where_8_0= ruleExpressionBlock ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getModelTypeAccess().getWhereKeyword_6_0());
                      			
                    }
                    // InternalMyQvto.g:799:4: ( (lv_modeltype_where_8_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:800:5: (lv_modeltype_where_8_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:800:5: (lv_modeltype_where_8_0= ruleExpressionBlock )
                    // InternalMyQvto.g:801:6: lv_modeltype_where_8_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModelTypeAccess().getModeltype_whereExpressionBlockParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_modeltype_where_8_0=ruleExpressionBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModelTypeRule());
                      						}
                      						set(
                      							current,
                      							"modeltype_where",
                      							lv_modeltype_where_8_0,
                      							"org.omg.qvt13.myqvto.MyQvto.ExpressionBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getModelTypeAccess().getSemicolonKeyword_7());
              		
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


    // $ANTLR start "entryRuleConstructor"
    // InternalMyQvto.g:827:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalMyQvto.g:827:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalMyQvto.g:828:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalMyQvto.g:834:1: ruleConstructor returns [EObject current=null] : ( ( (lv_constructor_header_0_0= ruleConstructorHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_constructor_header_0_0 = null;

        EObject lv_expression_block_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:840:2: ( ( ( (lv_constructor_header_0_0= ruleConstructorHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) ) )
            // InternalMyQvto.g:841:2: ( ( (lv_constructor_header_0_0= ruleConstructorHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) )
            {
            // InternalMyQvto.g:841:2: ( ( (lv_constructor_header_0_0= ruleConstructorHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) ) )
            // InternalMyQvto.g:842:3: ( (lv_constructor_header_0_0= ruleConstructorHeader ) ) (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) )
            {
            // InternalMyQvto.g:842:3: ( (lv_constructor_header_0_0= ruleConstructorHeader ) )
            // InternalMyQvto.g:843:4: (lv_constructor_header_0_0= ruleConstructorHeader )
            {
            // InternalMyQvto.g:843:4: (lv_constructor_header_0_0= ruleConstructorHeader )
            // InternalMyQvto.g:844:5: lv_constructor_header_0_0= ruleConstructorHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstructorAccess().getConstructor_headerConstructorHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
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
              						"org.omg.qvt13.myqvto.MyQvto.ConstructorHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:861:3: (otherlv_1= ';' | ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            else if ( (LA15_0==22) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyQvto.g:862:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:867:4: ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? )
                    {
                    // InternalMyQvto.g:867:4: ( ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )? )
                    // InternalMyQvto.g:868:5: ( (lv_expression_block_2_0= ruleExpressionBlock ) ) (otherlv_3= ';' )?
                    {
                    // InternalMyQvto.g:868:5: ( (lv_expression_block_2_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:869:6: (lv_expression_block_2_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:869:6: (lv_expression_block_2_0= ruleExpressionBlock )
                    // InternalMyQvto.g:870:7: lv_expression_block_2_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getConstructorAccess().getExpression_blockExpressionBlockParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
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
                      								"org.omg.qvt13.myqvto.MyQvto.ExpressionBlock");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyQvto.g:887:5: (otherlv_3= ';' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==16) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyQvto.g:888:6: otherlv_3= ';'
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
    // InternalMyQvto.g:899:1: entryRuleContextualProperty returns [EObject current=null] : iv_ruleContextualProperty= ruleContextualProperty EOF ;
    public final EObject entryRuleContextualProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextualProperty = null;


        try {
            // InternalMyQvto.g:899:59: (iv_ruleContextualProperty= ruleContextualProperty EOF )
            // InternalMyQvto.g:900:2: iv_ruleContextualProperty= ruleContextualProperty EOF
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
    // InternalMyQvto.g:906:1: ruleContextualProperty returns [EObject current=null] : ( (otherlv_0= 'intermediate' )? ( (lv_property_key_1_0= rulePropertyKey ) )+ ( (lv_declarator_2_0= ruleDeclarator ) ) otherlv_3= ';' ) ;
    public final EObject ruleContextualProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_property_key_1_0 = null;

        EObject lv_declarator_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:912:2: ( ( (otherlv_0= 'intermediate' )? ( (lv_property_key_1_0= rulePropertyKey ) )+ ( (lv_declarator_2_0= ruleDeclarator ) ) otherlv_3= ';' ) )
            // InternalMyQvto.g:913:2: ( (otherlv_0= 'intermediate' )? ( (lv_property_key_1_0= rulePropertyKey ) )+ ( (lv_declarator_2_0= ruleDeclarator ) ) otherlv_3= ';' )
            {
            // InternalMyQvto.g:913:2: ( (otherlv_0= 'intermediate' )? ( (lv_property_key_1_0= rulePropertyKey ) )+ ( (lv_declarator_2_0= ruleDeclarator ) ) otherlv_3= ';' )
            // InternalMyQvto.g:914:3: (otherlv_0= 'intermediate' )? ( (lv_property_key_1_0= rulePropertyKey ) )+ ( (lv_declarator_2_0= ruleDeclarator ) ) otherlv_3= ';'
            {
            // InternalMyQvto.g:914:3: (otherlv_0= 'intermediate' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyQvto.g:915:4: otherlv_0= 'intermediate'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getContextualPropertyAccess().getIntermediateKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalMyQvto.g:920:3: ( (lv_property_key_1_0= rulePropertyKey ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=73 && LA17_0<=76)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyQvto.g:921:4: (lv_property_key_1_0= rulePropertyKey )
            	    {
            	    // InternalMyQvto.g:921:4: (lv_property_key_1_0= rulePropertyKey )
            	    // InternalMyQvto.g:922:5: lv_property_key_1_0= rulePropertyKey
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getContextualPropertyAccess().getProperty_keyPropertyKeyEnumRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
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
            	      						"org.omg.qvt13.myqvto.MyQvto.PropertyKey");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // InternalMyQvto.g:939:3: ( (lv_declarator_2_0= ruleDeclarator ) )
            // InternalMyQvto.g:940:4: (lv_declarator_2_0= ruleDeclarator )
            {
            // InternalMyQvto.g:940:4: (lv_declarator_2_0= ruleDeclarator )
            // InternalMyQvto.g:941:5: lv_declarator_2_0= ruleDeclarator
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
              						"org.omg.qvt13.myqvto.MyQvto.Declarator");
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


    // $ANTLR start "entryRuleHelper"
    // InternalMyQvto.g:966:1: entryRuleHelper returns [EObject current=null] : iv_ruleHelper= ruleHelper EOF ;
    public final EObject entryRuleHelper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelper = null;


        try {
            // InternalMyQvto.g:966:47: (iv_ruleHelper= ruleHelper EOF )
            // InternalMyQvto.g:967:2: iv_ruleHelper= ruleHelper EOF
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
    // InternalMyQvto.g:973:1: ruleHelper returns [EObject current=null] : ( ( (lv_helper_header_0_0= ruleHelperHeader ) ) (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) ) ) ;
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
            // InternalMyQvto.g:979:2: ( ( ( (lv_helper_header_0_0= ruleHelperHeader ) ) (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) ) ) )
            // InternalMyQvto.g:980:2: ( ( (lv_helper_header_0_0= ruleHelperHeader ) ) (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) ) )
            {
            // InternalMyQvto.g:980:2: ( ( (lv_helper_header_0_0= ruleHelperHeader ) ) (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) ) )
            // InternalMyQvto.g:981:3: ( (lv_helper_header_0_0= ruleHelperHeader ) ) (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) )
            {
            // InternalMyQvto.g:981:3: ( (lv_helper_header_0_0= ruleHelperHeader ) )
            // InternalMyQvto.g:982:4: (lv_helper_header_0_0= ruleHelperHeader )
            {
            // InternalMyQvto.g:982:4: (lv_helper_header_0_0= ruleHelperHeader )
            // InternalMyQvto.g:983:5: lv_helper_header_0_0= ruleHelperHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHelperAccess().getHelper_headerHelperHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
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
              						"org.omg.qvt13.myqvto.MyQvto.HelperHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1000:3: (otherlv_1= ';' | (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' ) | ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt19=1;
                }
                break;
            case 21:
                {
                alt19=2;
                }
                break;
            case 22:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyQvto.g:1001:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getHelperAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1006:4: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' )
                    {
                    // InternalMyQvto.g:1006:4: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';' )
                    // InternalMyQvto.g:1007:5: otherlv_2= '=' ( (lv_expression_3_0= ruleExpressionGO ) ) otherlv_4= ';'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getHelperAccess().getEqualsSignKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:1011:5: ( (lv_expression_3_0= ruleExpressionGO ) )
                    // InternalMyQvto.g:1012:6: (lv_expression_3_0= ruleExpressionGO )
                    {
                    // InternalMyQvto.g:1012:6: (lv_expression_3_0= ruleExpressionGO )
                    // InternalMyQvto.g:1013:7: lv_expression_3_0= ruleExpressionGO
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
                      								"org.omg.qvt13.myqvto.MyQvto.ExpressionGO");
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
                    // InternalMyQvto.g:1036:4: ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? )
                    {
                    // InternalMyQvto.g:1036:4: ( ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )? )
                    // InternalMyQvto.g:1037:5: ( (lv_expression_block_5_0= ruleExpressionBlock ) ) (otherlv_6= ';' )?
                    {
                    // InternalMyQvto.g:1037:5: ( (lv_expression_block_5_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:1038:6: (lv_expression_block_5_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:1038:6: (lv_expression_block_5_0= ruleExpressionBlock )
                    // InternalMyQvto.g:1039:7: lv_expression_block_5_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getHelperAccess().getExpression_blockExpressionBlockParserRuleCall_1_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
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
                      								"org.omg.qvt13.myqvto.MyQvto.ExpressionBlock");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyQvto.g:1056:5: (otherlv_6= ';' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==16) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyQvto.g:1057:6: otherlv_6= ';'
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


    // $ANTLR start "entryRuleLibrary"
    // InternalMyQvto.g:1068:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalMyQvto.g:1068:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalMyQvto.g:1069:2: iv_ruleLibrary= ruleLibrary EOF
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
    // InternalMyQvto.g:1075:1: ruleLibrary returns [EObject current=null] : ( ( (lv_library_h_0_0= ruleLibraryHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) ;
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
            // InternalMyQvto.g:1081:2: ( ( ( (lv_library_h_0_0= ruleLibraryHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) )
            // InternalMyQvto.g:1082:2: ( ( (lv_library_h_0_0= ruleLibraryHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            {
            // InternalMyQvto.g:1082:2: ( ( (lv_library_h_0_0= ruleLibraryHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            // InternalMyQvto.g:1083:3: ( (lv_library_h_0_0= ruleLibraryHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            {
            // InternalMyQvto.g:1083:3: ( (lv_library_h_0_0= ruleLibraryHeader ) )
            // InternalMyQvto.g:1084:4: (lv_library_h_0_0= ruleLibraryHeader )
            {
            // InternalMyQvto.g:1084:4: (lv_library_h_0_0= ruleLibraryHeader )
            // InternalMyQvto.g:1085:5: lv_library_h_0_0= ruleLibraryHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLibraryAccess().getLibrary_hLibraryHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
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
              						"org.omg.qvt13.myqvto.MyQvto.LibraryHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1102:3: (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            else if ( (LA22_0==22) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyQvto.g:1103:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLibraryAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1108:4: (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    {
                    // InternalMyQvto.g:1108:4: (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    // InternalMyQvto.g:1109:5: otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )?
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:1113:5: ( (lv_module_element_3_0= ruleImperativeOperation ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==20||(LA20_0>=24 && LA20_0<=26)||LA20_0==39||LA20_0==41||LA20_0==44||(LA20_0>=50 && LA20_0<=53)||(LA20_0>=70 && LA20_0<=78)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyQvto.g:1114:6: (lv_module_element_3_0= ruleImperativeOperation )
                    	    {
                    	    // InternalMyQvto.g:1114:6: (lv_module_element_3_0= ruleImperativeOperation )
                    	    // InternalMyQvto.g:1115:7: lv_module_element_3_0= ruleImperativeOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLibraryAccess().getModule_elementImperativeOperationParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	      								"org.omg.qvt13.myqvto.MyQvto.ImperativeOperation");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_1_1_2());
                      				
                    }
                    // InternalMyQvto.g:1136:5: (otherlv_5= ';' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==16) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyQvto.g:1137:6: otherlv_5= ';'
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


    // $ANTLR start "entryRuleMappingOperation"
    // InternalMyQvto.g:1148:1: entryRuleMappingOperation returns [EObject current=null] : iv_ruleMappingOperation= ruleMappingOperation EOF ;
    public final EObject entryRuleMappingOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingOperation = null;


        try {
            // InternalMyQvto.g:1148:57: (iv_ruleMappingOperation= ruleMappingOperation EOF )
            // InternalMyQvto.g:1149:2: iv_ruleMappingOperation= ruleMappingOperation EOF
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
    // InternalMyQvto.g:1155:1: ruleMappingOperation returns [EObject current=null] : ( ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) ) ) ;
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
            // InternalMyQvto.g:1161:2: ( ( ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) ) ) )
            // InternalMyQvto.g:1162:2: ( ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            {
            // InternalMyQvto.g:1162:2: ( ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            // InternalMyQvto.g:1163:3: ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) )
            {
            // InternalMyQvto.g:1163:3: ( (lv_mapping_full_header_0_0= ruleMappingFullHeader ) )
            // InternalMyQvto.g:1164:4: (lv_mapping_full_header_0_0= ruleMappingFullHeader )
            {
            // InternalMyQvto.g:1164:4: (lv_mapping_full_header_0_0= ruleMappingFullHeader )
            // InternalMyQvto.g:1165:5: lv_mapping_full_header_0_0= ruleMappingFullHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingOperationAccess().getMapping_full_headerMappingFullHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
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
              						"org.omg.qvt13.myqvto.MyQvto.MappingFullHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1182:3: (otherlv_1= ';' | (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            else if ( (LA24_0==22) ) {
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
                    // InternalMyQvto.g:1183:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMappingOperationAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1188:4: (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? )
                    {
                    // InternalMyQvto.g:1188:4: (otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )? )
                    // InternalMyQvto.g:1189:5: otherlv_2= '{' ( (lv_mapping_body_3_0= ruleMappingBody ) ) otherlv_4= '}' (otherlv_5= ';' )?
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMappingOperationAccess().getLeftCurlyBracketKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:1193:5: ( (lv_mapping_body_3_0= ruleMappingBody ) )
                    // InternalMyQvto.g:1194:6: (lv_mapping_body_3_0= ruleMappingBody )
                    {
                    // InternalMyQvto.g:1194:6: (lv_mapping_body_3_0= ruleMappingBody )
                    // InternalMyQvto.g:1195:7: lv_mapping_body_3_0= ruleMappingBody
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMappingOperationAccess().getMapping_bodyMappingBodyParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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
                      								"org.omg.qvt13.myqvto.MyQvto.MappingBody");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getMappingOperationAccess().getRightCurlyBracketKeyword_1_1_2());
                      				
                    }
                    // InternalMyQvto.g:1216:5: (otherlv_5= ';' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==16) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMyQvto.g:1217:6: otherlv_5= ';'
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


    // $ANTLR start "entryRuleOperationalTransformation"
    // InternalMyQvto.g:1228:1: entryRuleOperationalTransformation returns [EObject current=null] : iv_ruleOperationalTransformation= ruleOperationalTransformation EOF ;
    public final EObject entryRuleOperationalTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationalTransformation = null;


        try {
            // InternalMyQvto.g:1228:66: (iv_ruleOperationalTransformation= ruleOperationalTransformation EOF )
            // InternalMyQvto.g:1229:2: iv_ruleOperationalTransformation= ruleOperationalTransformation EOF
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
    // InternalMyQvto.g:1235:1: ruleOperationalTransformation returns [EObject current=null] : ( ( (lv_transformation_h_0_0= ruleTransformationHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) ;
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
            // InternalMyQvto.g:1241:2: ( ( ( (lv_transformation_h_0_0= ruleTransformationHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) )
            // InternalMyQvto.g:1242:2: ( ( (lv_transformation_h_0_0= ruleTransformationHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            {
            // InternalMyQvto.g:1242:2: ( ( (lv_transformation_h_0_0= ruleTransformationHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            // InternalMyQvto.g:1243:3: ( (lv_transformation_h_0_0= ruleTransformationHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            {
            // InternalMyQvto.g:1243:3: ( (lv_transformation_h_0_0= ruleTransformationHeader ) )
            // InternalMyQvto.g:1244:4: (lv_transformation_h_0_0= ruleTransformationHeader )
            {
            // InternalMyQvto.g:1244:4: (lv_transformation_h_0_0= ruleTransformationHeader )
            // InternalMyQvto.g:1245:5: lv_transformation_h_0_0= ruleTransformationHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationalTransformationAccess().getTransformation_hTransformationHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
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
              						"org.omg.qvt13.myqvto.MyQvto.TransformationHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1262:3: (otherlv_1= ';' | (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            else if ( (LA27_0==22) ) {
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
                    // InternalMyQvto.g:1263:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOperationalTransformationAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1268:4: (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    {
                    // InternalMyQvto.g:1268:4: (otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    // InternalMyQvto.g:1269:5: otherlv_2= '{' ( (lv_module_element_3_0= ruleImperativeOperation ) )* otherlv_4= '}' (otherlv_5= ';' )?
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getOperationalTransformationAccess().getLeftCurlyBracketKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:1273:5: ( (lv_module_element_3_0= ruleImperativeOperation ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==20||(LA25_0>=24 && LA25_0<=26)||LA25_0==39||LA25_0==41||LA25_0==44||(LA25_0>=50 && LA25_0<=53)||(LA25_0>=70 && LA25_0<=78)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMyQvto.g:1274:6: (lv_module_element_3_0= ruleImperativeOperation )
                    	    {
                    	    // InternalMyQvto.g:1274:6: (lv_module_element_3_0= ruleImperativeOperation )
                    	    // InternalMyQvto.g:1275:7: lv_module_element_3_0= ruleImperativeOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperationalTransformationAccess().getModule_elementImperativeOperationParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	      								"org.omg.qvt13.myqvto.MyQvto.ImperativeOperation");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getOperationalTransformationAccess().getRightCurlyBracketKeyword_1_1_2());
                      				
                    }
                    // InternalMyQvto.g:1296:5: (otherlv_5= ';' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==16) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMyQvto.g:1297:6: otherlv_5= ';'
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


    // $ANTLR start "entryRuleTagGO"
    // InternalMyQvto.g:1308:1: entryRuleTagGO returns [EObject current=null] : iv_ruleTagGO= ruleTagGO EOF ;
    public final EObject entryRuleTagGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagGO = null;


        try {
            // InternalMyQvto.g:1308:46: (iv_ruleTagGO= ruleTagGO EOF )
            // InternalMyQvto.g:1309:2: iv_ruleTagGO= ruleTagGO EOF
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
    // InternalMyQvto.g:1315:1: ruleTagGO returns [EObject current=null] : (otherlv_0= 'tag' ( (lv_tagid_1_0= RULE_STRING ) ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )? otherlv_5= ';' ) ;
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
            // InternalMyQvto.g:1321:2: ( (otherlv_0= 'tag' ( (lv_tagid_1_0= RULE_STRING ) ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )? otherlv_5= ';' ) )
            // InternalMyQvto.g:1322:2: (otherlv_0= 'tag' ( (lv_tagid_1_0= RULE_STRING ) ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )? otherlv_5= ';' )
            {
            // InternalMyQvto.g:1322:2: (otherlv_0= 'tag' ( (lv_tagid_1_0= RULE_STRING ) ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )? otherlv_5= ';' )
            // InternalMyQvto.g:1323:3: otherlv_0= 'tag' ( (lv_tagid_1_0= RULE_STRING ) ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTagGOAccess().getTagKeyword_0());
              		
            }
            // InternalMyQvto.g:1327:3: ( (lv_tagid_1_0= RULE_STRING ) )
            // InternalMyQvto.g:1328:4: (lv_tagid_1_0= RULE_STRING )
            {
            // InternalMyQvto.g:1328:4: (lv_tagid_1_0= RULE_STRING )
            // InternalMyQvto.g:1329:5: lv_tagid_1_0= RULE_STRING
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

            // InternalMyQvto.g:1345:3: ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:1346:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:1346:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            // InternalMyQvto.g:1347:5: lv_scoped_identifier_2_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTagGOAccess().getScoped_identifierScopedIdentifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
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
              						"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1364:3: (otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyQvto.g:1365:4: otherlv_3= '=' ( (lv_tagvalue_4_0= ruleExpressionGO ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTagGOAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalMyQvto.g:1369:4: ( (lv_tagvalue_4_0= ruleExpressionGO ) )
                    // InternalMyQvto.g:1370:5: (lv_tagvalue_4_0= ruleExpressionGO )
                    {
                    // InternalMyQvto.g:1370:5: (lv_tagvalue_4_0= ruleExpressionGO )
                    // InternalMyQvto.g:1371:6: lv_tagvalue_4_0= ruleExpressionGO
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
                      							"org.omg.qvt13.myqvto.MyQvto.ExpressionGO");
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
    // InternalMyQvto.g:1397:1: entryRuleMetaModelGO returns [EObject current=null] : iv_ruleMetaModelGO= ruleMetaModelGO EOF ;
    public final EObject entryRuleMetaModelGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModelGO = null;


        try {
            // InternalMyQvto.g:1397:52: (iv_ruleMetaModelGO= ruleMetaModelGO EOF )
            // InternalMyQvto.g:1398:2: iv_ruleMetaModelGO= ruleMetaModelGO EOF
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
    // InternalMyQvto.g:1404:1: ruleMetaModelGO returns [EObject current=null] : ( ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) ;
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
            // InternalMyQvto.g:1410:2: ( ( ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) ) )
            // InternalMyQvto.g:1411:2: ( ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            {
            // InternalMyQvto.g:1411:2: ( ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            // InternalMyQvto.g:1412:3: ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            {
            // InternalMyQvto.g:1412:3: ( (lv_metamodel_h_0_0= ruleMetaModelHeader ) )
            // InternalMyQvto.g:1413:4: (lv_metamodel_h_0_0= ruleMetaModelHeader )
            {
            // InternalMyQvto.g:1413:4: (lv_metamodel_h_0_0= ruleMetaModelHeader )
            // InternalMyQvto.g:1414:5: lv_metamodel_h_0_0= ruleMetaModelHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetaModelGOAccess().getMetamodel_hMetaModelHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
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
              						"org.omg.qvt13.myqvto.MyQvto.MetaModelHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1431:3: (otherlv_1= ';' | (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            else if ( (LA31_0==22) ) {
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
                    // InternalMyQvto.g:1432:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMetaModelGOAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1437:4: (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    {
                    // InternalMyQvto.g:1437:4: (otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )? )
                    // InternalMyQvto.g:1438:5: otherlv_2= '{' ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )* otherlv_4= '}' (otherlv_5= ';' )?
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMetaModelGOAccess().getLeftCurlyBracketKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:1442:5: ( (lv_metamodel_element_3_0= ruleMetaModelElement ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==20||LA29_0==24||(LA29_0>=49 && LA29_0<=53)||(LA29_0>=70 && LA29_0<=72)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyQvto.g:1443:6: (lv_metamodel_element_3_0= ruleMetaModelElement )
                    	    {
                    	    // InternalMyQvto.g:1443:6: (lv_metamodel_element_3_0= ruleMetaModelElement )
                    	    // InternalMyQvto.g:1444:7: lv_metamodel_element_3_0= ruleMetaModelElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMetaModelGOAccess().getMetamodel_elementMetaModelElementParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_25);
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
                    	      								"org.omg.qvt13.myqvto.MyQvto.MetaModelElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getMetaModelGOAccess().getRightCurlyBracketKeyword_1_1_2());
                      				
                    }
                    // InternalMyQvto.g:1465:5: (otherlv_5= ';' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==16) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalMyQvto.g:1466:6: otherlv_5= ';'
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
    // InternalMyQvto.g:1477:1: entryRuleAccessDecl returns [EObject current=null] : iv_ruleAccessDecl= ruleAccessDecl EOF ;
    public final EObject entryRuleAccessDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessDecl = null;


        try {
            // InternalMyQvto.g:1477:51: (iv_ruleAccessDecl= ruleAccessDecl EOF )
            // InternalMyQvto.g:1478:2: iv_ruleAccessDecl= ruleAccessDecl EOF
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
    // InternalMyQvto.g:1484:1: ruleAccessDecl returns [EObject current=null] : ( ( (lv_access_usage_0_0= ruleAccessUsage ) ) otherlv_1= ';' ) ;
    public final EObject ruleAccessDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_access_usage_0_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1490:2: ( ( ( (lv_access_usage_0_0= ruleAccessUsage ) ) otherlv_1= ';' ) )
            // InternalMyQvto.g:1491:2: ( ( (lv_access_usage_0_0= ruleAccessUsage ) ) otherlv_1= ';' )
            {
            // InternalMyQvto.g:1491:2: ( ( (lv_access_usage_0_0= ruleAccessUsage ) ) otherlv_1= ';' )
            // InternalMyQvto.g:1492:3: ( (lv_access_usage_0_0= ruleAccessUsage ) ) otherlv_1= ';'
            {
            // InternalMyQvto.g:1492:3: ( (lv_access_usage_0_0= ruleAccessUsage ) )
            // InternalMyQvto.g:1493:4: (lv_access_usage_0_0= ruleAccessUsage )
            {
            // InternalMyQvto.g:1493:4: (lv_access_usage_0_0= ruleAccessUsage )
            // InternalMyQvto.g:1494:5: lv_access_usage_0_0= ruleAccessUsage
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
              						"org.omg.qvt13.myqvto.MyQvto.AccessUsage");
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
    // InternalMyQvto.g:1519:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalMyQvto.g:1519:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalMyQvto.g:1520:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalMyQvto.g:1526:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typespec_3_0= ruleTypeSpec ) ) otherlv_4= ';' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typespec_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1532:2: ( (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typespec_3_0= ruleTypeSpec ) ) otherlv_4= ';' ) )
            // InternalMyQvto.g:1533:2: (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typespec_3_0= ruleTypeSpec ) ) otherlv_4= ';' )
            {
            // InternalMyQvto.g:1533:2: (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typespec_3_0= ruleTypeSpec ) ) otherlv_4= ';' )
            // InternalMyQvto.g:1534:3: otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typespec_3_0= ruleTypeSpec ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
              		
            }
            // InternalMyQvto.g:1538:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyQvto.g:1539:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyQvto.g:1539:4: (lv_name_1_0= RULE_ID )
            // InternalMyQvto.g:1540:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,21,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTypeDefAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalMyQvto.g:1560:3: ( (lv_typespec_3_0= ruleTypeSpec ) )
            // InternalMyQvto.g:1561:4: (lv_typespec_3_0= ruleTypeSpec )
            {
            // InternalMyQvto.g:1561:4: (lv_typespec_3_0= ruleTypeSpec )
            // InternalMyQvto.g:1562:5: lv_typespec_3_0= ruleTypeSpec
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeDefAccess().getTypespecTypeSpecParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
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
              						"org.omg.qvt13.myqvto.MyQvto.TypeSpec");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTypeDefAccess().getSemicolonKeyword_4());
              		
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
    // InternalMyQvto.g:1587:1: entryRuleClassifierGO returns [EObject current=null] : iv_ruleClassifierGO= ruleClassifierGO EOF ;
    public final EObject entryRuleClassifierGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierGO = null;


        try {
            // InternalMyQvto.g:1587:53: (iv_ruleClassifierGO= ruleClassifierGO EOF )
            // InternalMyQvto.g:1588:2: iv_ruleClassifierGO= ruleClassifierGO EOF
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
    // InternalMyQvto.g:1594:1: ruleClassifierGO returns [EObject current=null] : ( ( (lv_classifier_h_0_0= ruleClassifierHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) ) ) ;
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
            // InternalMyQvto.g:1600:2: ( ( ( (lv_classifier_h_0_0= ruleClassifierHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) ) ) )
            // InternalMyQvto.g:1601:2: ( ( (lv_classifier_h_0_0= ruleClassifierHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            {
            // InternalMyQvto.g:1601:2: ( ( (lv_classifier_h_0_0= ruleClassifierHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) ) )
            // InternalMyQvto.g:1602:3: ( (lv_classifier_h_0_0= ruleClassifierHeader ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) )
            {
            // InternalMyQvto.g:1602:3: ( (lv_classifier_h_0_0= ruleClassifierHeader ) )
            // InternalMyQvto.g:1603:4: (lv_classifier_h_0_0= ruleClassifierHeader )
            {
            // InternalMyQvto.g:1603:4: (lv_classifier_h_0_0= ruleClassifierHeader )
            // InternalMyQvto.g:1604:5: lv_classifier_h_0_0= ruleClassifierHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierGOAccess().getClassifier_hClassifierHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
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
              						"org.omg.qvt13.myqvto.MyQvto.ClassifierHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:1621:3: (otherlv_1= ';' | (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            else if ( (LA34_0==22) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyQvto.g:1622:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getClassifierGOAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:1627:4: (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? )
                    {
                    // InternalMyQvto.g:1627:4: (otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )? )
                    // InternalMyQvto.g:1628:5: otherlv_2= '{' ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )? otherlv_4= '}' (otherlv_5= ';' )?
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getClassifierGOAccess().getLeftCurlyBracketKeyword_1_1_0());
                      				
                    }
                    // InternalMyQvto.g:1632:5: ( (lv_classifier_feature_list_3_0= ruleClassifierFeatureList ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==EOF||LA32_0==RULE_ID||LA32_0==24||(LA32_0>=37 && LA32_0<=38)||LA32_0==58||(LA32_0>=64 && LA32_0<=69)||(LA32_0>=72 && LA32_0<=73)||(LA32_0>=82 && LA32_0<=84)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMyQvto.g:1633:6: (lv_classifier_feature_list_3_0= ruleClassifierFeatureList )
                            {
                            // InternalMyQvto.g:1633:6: (lv_classifier_feature_list_3_0= ruleClassifierFeatureList )
                            // InternalMyQvto.g:1634:7: lv_classifier_feature_list_3_0= ruleClassifierFeatureList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getClassifierGOAccess().getClassifier_feature_listClassifierFeatureListParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_22);
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
                              								"org.omg.qvt13.myqvto.MyQvto.ClassifierFeatureList");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getClassifierGOAccess().getRightCurlyBracketKeyword_1_1_2());
                      				
                    }
                    // InternalMyQvto.g:1655:5: (otherlv_5= ';' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==16) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalMyQvto.g:1656:6: otherlv_5= ';'
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


    // $ANTLR start "entryRuleVarParameter"
    // InternalMyQvto.g:1667:1: entryRuleVarParameter returns [EObject current=null] : iv_ruleVarParameter= ruleVarParameter EOF ;
    public final EObject entryRuleVarParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarParameter = null;


        try {
            // InternalMyQvto.g:1667:53: (iv_ruleVarParameter= ruleVarParameter EOF )
            // InternalMyQvto.g:1668:2: iv_ruleVarParameter= ruleVarParameter EOF
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
    // InternalMyQvto.g:1674:1: ruleVarParameter returns [EObject current=null] : ( ( (lv_kind_0_0= ruleDirectionKind ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ) ;
    public final EObject ruleVarParameter() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        EObject lv_declarator_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1680:2: ( ( ( (lv_kind_0_0= ruleDirectionKind ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ) )
            // InternalMyQvto.g:1681:2: ( ( (lv_kind_0_0= ruleDirectionKind ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) )
            {
            // InternalMyQvto.g:1681:2: ( ( (lv_kind_0_0= ruleDirectionKind ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) )
            // InternalMyQvto.g:1682:3: ( (lv_kind_0_0= ruleDirectionKind ) )? ( (lv_declarator_1_0= ruleDeclarator ) )
            {
            // InternalMyQvto.g:1682:3: ( (lv_kind_0_0= ruleDirectionKind ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=61 && LA35_0<=63)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyQvto.g:1683:4: (lv_kind_0_0= ruleDirectionKind )
                    {
                    // InternalMyQvto.g:1683:4: (lv_kind_0_0= ruleDirectionKind )
                    // InternalMyQvto.g:1684:5: lv_kind_0_0= ruleDirectionKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVarParameterAccess().getKindDirectionKindEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
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
                      						"org.omg.qvt13.myqvto.MyQvto.DirectionKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:1701:3: ( (lv_declarator_1_0= ruleDeclarator ) )
            // InternalMyQvto.g:1702:4: (lv_declarator_1_0= ruleDeclarator )
            {
            // InternalMyQvto.g:1702:4: (lv_declarator_1_0= ruleDeclarator )
            // InternalMyQvto.g:1703:5: lv_declarator_1_0= ruleDeclarator
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
              						"org.omg.qvt13.myqvto.MyQvto.Declarator");
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


    // $ANTLR start "entryRuleEntryHeader"
    // InternalMyQvto.g:1724:1: entryRuleEntryHeader returns [EObject current=null] : iv_ruleEntryHeader= ruleEntryHeader EOF ;
    public final EObject entryRuleEntryHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryHeader = null;


        try {
            // InternalMyQvto.g:1724:52: (iv_ruleEntryHeader= ruleEntryHeader EOF )
            // InternalMyQvto.g:1725:2: iv_ruleEntryHeader= ruleEntryHeader EOF
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
    // InternalMyQvto.g:1731:1: ruleEntryHeader returns [EObject current=null] : (otherlv_0= 'main' ( (lv_simple_signature_1_0= ruleSimpleSignature ) ) ) ;
    public final EObject ruleEntryHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_simple_signature_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1737:2: ( (otherlv_0= 'main' ( (lv_simple_signature_1_0= ruleSimpleSignature ) ) ) )
            // InternalMyQvto.g:1738:2: (otherlv_0= 'main' ( (lv_simple_signature_1_0= ruleSimpleSignature ) ) )
            {
            // InternalMyQvto.g:1738:2: (otherlv_0= 'main' ( (lv_simple_signature_1_0= ruleSimpleSignature ) ) )
            // InternalMyQvto.g:1739:3: otherlv_0= 'main' ( (lv_simple_signature_1_0= ruleSimpleSignature ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEntryHeaderAccess().getMainKeyword_0());
              		
            }
            // InternalMyQvto.g:1743:3: ( (lv_simple_signature_1_0= ruleSimpleSignature ) )
            // InternalMyQvto.g:1744:4: (lv_simple_signature_1_0= ruleSimpleSignature )
            {
            // InternalMyQvto.g:1744:4: (lv_simple_signature_1_0= ruleSimpleSignature )
            // InternalMyQvto.g:1745:5: lv_simple_signature_1_0= ruleSimpleSignature
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
              						"org.omg.qvt13.myqvto.MyQvto.SimpleSignature");
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


    // $ANTLR start "entryRuleExpressionBlock"
    // InternalMyQvto.g:1766:1: entryRuleExpressionBlock returns [EObject current=null] : iv_ruleExpressionBlock= ruleExpressionBlock EOF ;
    public final EObject entryRuleExpressionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBlock = null;


        try {
            // InternalMyQvto.g:1766:56: (iv_ruleExpressionBlock= ruleExpressionBlock EOF )
            // InternalMyQvto.g:1767:2: iv_ruleExpressionBlock= ruleExpressionBlock EOF
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
    // InternalMyQvto.g:1773:1: ruleExpressionBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expression_list_2_0= ruleExpressionList ) )? otherlv_3= '}' ) ;
    public final EObject ruleExpressionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_list_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:1779:2: ( ( () otherlv_1= '{' ( (lv_expression_list_2_0= ruleExpressionList ) )? otherlv_3= '}' ) )
            // InternalMyQvto.g:1780:2: ( () otherlv_1= '{' ( (lv_expression_list_2_0= ruleExpressionList ) )? otherlv_3= '}' )
            {
            // InternalMyQvto.g:1780:2: ( () otherlv_1= '{' ( (lv_expression_list_2_0= ruleExpressionList ) )? otherlv_3= '}' )
            // InternalMyQvto.g:1781:3: () otherlv_1= '{' ( (lv_expression_list_2_0= ruleExpressionList ) )? otherlv_3= '}'
            {
            // InternalMyQvto.g:1781:3: ()
            // InternalMyQvto.g:1782:4: 
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

            otherlv_1=(Token)match(input,22,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpressionBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyQvto.g:1795:3: ( (lv_expression_list_2_0= ruleExpressionList ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_STRING)||LA36_0==14||LA36_0==16) ) {
                alt36=1;
            }
            else if ( (LA36_0==23) ) {
                int LA36_2 = input.LA(2);

                if ( (synpred55_InternalMyQvto()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalMyQvto.g:1796:4: (lv_expression_list_2_0= ruleExpressionList )
                    {
                    // InternalMyQvto.g:1796:4: (lv_expression_list_2_0= ruleExpressionList )
                    // InternalMyQvto.g:1797:5: lv_expression_list_2_0= ruleExpressionList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionBlockAccess().getExpression_listExpressionListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
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
                      						"org.omg.qvt13.myqvto.MyQvto.ExpressionList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMappingBody"
    // InternalMyQvto.g:1822:1: entryRuleMappingBody returns [EObject current=null] : iv_ruleMappingBody= ruleMappingBody EOF ;
    public final EObject entryRuleMappingBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingBody = null;


        try {
            // InternalMyQvto.g:1822:52: (iv_ruleMappingBody= ruleMappingBody EOF )
            // InternalMyQvto.g:1823:2: iv_ruleMappingBody= ruleMappingBody EOF
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
    // InternalMyQvto.g:1829:1: ruleMappingBody returns [EObject current=null] : ( () (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )? ( (lv_population_section_8_0= rulePopulationSection ) )? (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )? ) ;
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
            // InternalMyQvto.g:1835:2: ( ( () (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )? ( (lv_population_section_8_0= rulePopulationSection ) )? (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )? ) )
            // InternalMyQvto.g:1836:2: ( () (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )? ( (lv_population_section_8_0= rulePopulationSection ) )? (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )? )
            {
            // InternalMyQvto.g:1836:2: ( () (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )? ( (lv_population_section_8_0= rulePopulationSection ) )? (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )? )
            // InternalMyQvto.g:1837:3: () (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )? ( (lv_population_section_8_0= rulePopulationSection ) )? (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )?
            {
            // InternalMyQvto.g:1837:3: ()
            // InternalMyQvto.g:1838:4: 
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

            // InternalMyQvto.g:1847:3: (otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyQvto.g:1848:4: otherlv_1= 'init' otherlv_2= '{' ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )? otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMappingBodyAccess().getInitKeyword_1_0());
                      			
                    }
                    otherlv_2=(Token)match(input,22,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMappingBodyAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    // InternalMyQvto.g:1856:4: ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_STRING)||LA39_0==16) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==23) ) {
                        int LA39_2 = input.LA(2);

                        if ( (synpred58_InternalMyQvto()) ) {
                            alt39=1;
                        }
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalMyQvto.g:1857:5: ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )?
                            {
                            // InternalMyQvto.g:1857:5: ( (lv_initSection_3_0= ruleExpressionGO ) )
                            // InternalMyQvto.g:1858:6: (lv_initSection_3_0= ruleExpressionGO )
                            {
                            // InternalMyQvto.g:1858:6: (lv_initSection_3_0= ruleExpressionGO )
                            // InternalMyQvto.g:1859:7: lv_initSection_3_0= ruleExpressionGO
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMappingBodyAccess().getInitSectionExpressionGOParserRuleCall_1_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_32);
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
                              								"org.omg.qvt13.myqvto.MyQvto.ExpressionGO");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalMyQvto.g:1876:5: (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==16) ) {
                                    int LA37_1 = input.LA(2);

                                    if ( (synpred56_InternalMyQvto()) ) {
                                        alt37=1;
                                    }


                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalMyQvto.g:1877:6: otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) )
                            	    {
                            	    otherlv_4=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getMappingBodyAccess().getSemicolonKeyword_1_2_1_0());
                            	      					
                            	    }
                            	    // InternalMyQvto.g:1881:6: ( (lv_initSection_5_0= ruleExpressionGO ) )
                            	    // InternalMyQvto.g:1882:7: (lv_initSection_5_0= ruleExpressionGO )
                            	    {
                            	    // InternalMyQvto.g:1882:7: (lv_initSection_5_0= ruleExpressionGO )
                            	    // InternalMyQvto.g:1883:8: lv_initSection_5_0= ruleExpressionGO
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMappingBodyAccess().getInitSectionExpressionGOParserRuleCall_1_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_32);
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
                            	      									"org.omg.qvt13.myqvto.MyQvto.ExpressionGO");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);

                            // InternalMyQvto.g:1901:5: (otherlv_6= ';' )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==16) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // InternalMyQvto.g:1902:6: otherlv_6= ';'
                                    {
                                    otherlv_6=(Token)match(input,16,FOLLOW_22); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_6, grammarAccess.getMappingBodyAccess().getSemicolonKeyword_1_2_2());
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getMappingBodyAccess().getRightCurlyBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalMyQvto.g:1913:3: ( (lv_population_section_8_0= rulePopulationSection ) )?
            int alt41=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                case RULE_STRING:
                case 14:
                case 16:
                case 29:
                    {
                    alt41=1;
                    }
                    break;
                case 28:
                    {
                    int LA41_2 = input.LA(2);

                    if ( (synpred60_InternalMyQvto()) ) {
                        alt41=1;
                    }
                    }
                    break;
                case 23:
                    {
                    int LA41_3 = input.LA(2);

                    if ( (synpred60_InternalMyQvto()) ) {
                        alt41=1;
                    }
                    }
                    break;
                case EOF:
                    {
                    int LA41_4 = input.LA(2);

                    if ( (synpred60_InternalMyQvto()) ) {
                        alt41=1;
                    }
                    }
                    break;
            }

            switch (alt41) {
                case 1 :
                    // InternalMyQvto.g:1914:4: (lv_population_section_8_0= rulePopulationSection )
                    {
                    // InternalMyQvto.g:1914:4: (lv_population_section_8_0= rulePopulationSection )
                    // InternalMyQvto.g:1915:5: lv_population_section_8_0= rulePopulationSection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMappingBodyAccess().getPopulation_sectionPopulationSectionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_34);
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
                      						"org.omg.qvt13.myqvto.MyQvto.PopulationSection");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:1932:3: (otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyQvto.g:1933:4: otherlv_9= 'end' otherlv_10= '{' ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )? otherlv_15= '}'
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getMappingBodyAccess().getEndKeyword_3_0());
                      			
                    }
                    otherlv_10=(Token)match(input,22,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getMappingBodyAccess().getLeftCurlyBracketKeyword_3_1());
                      			
                    }
                    // InternalMyQvto.g:1941:4: ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||LA44_0==16) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==23) ) {
                        int LA44_2 = input.LA(2);

                        if ( (synpred63_InternalMyQvto()) ) {
                            alt44=1;
                        }
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalMyQvto.g:1942:5: ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )?
                            {
                            // InternalMyQvto.g:1942:5: ( (lv_endSection_11_0= ruleExpressionGO ) )
                            // InternalMyQvto.g:1943:6: (lv_endSection_11_0= ruleExpressionGO )
                            {
                            // InternalMyQvto.g:1943:6: (lv_endSection_11_0= ruleExpressionGO )
                            // InternalMyQvto.g:1944:7: lv_endSection_11_0= ruleExpressionGO
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMappingBodyAccess().getEndSectionExpressionGOParserRuleCall_3_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_32);
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
                              								"org.omg.qvt13.myqvto.MyQvto.ExpressionGO");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalMyQvto.g:1961:5: (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==16) ) {
                                    int LA42_1 = input.LA(2);

                                    if ( (synpred61_InternalMyQvto()) ) {
                                        alt42=1;
                                    }


                                }


                                switch (alt42) {
                            	case 1 :
                            	    // InternalMyQvto.g:1962:6: otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) )
                            	    {
                            	    otherlv_12=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_12, grammarAccess.getMappingBodyAccess().getSemicolonKeyword_3_2_1_0());
                            	      					
                            	    }
                            	    // InternalMyQvto.g:1966:6: ( (lv_endSection_13_0= ruleExpressionGO ) )
                            	    // InternalMyQvto.g:1967:7: (lv_endSection_13_0= ruleExpressionGO )
                            	    {
                            	    // InternalMyQvto.g:1967:7: (lv_endSection_13_0= ruleExpressionGO )
                            	    // InternalMyQvto.g:1968:8: lv_endSection_13_0= ruleExpressionGO
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMappingBodyAccess().getEndSectionExpressionGOParserRuleCall_3_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_32);
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
                            	      									"org.omg.qvt13.myqvto.MyQvto.ExpressionGO");
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

                            // InternalMyQvto.g:1986:5: (otherlv_14= ';' )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==16) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // InternalMyQvto.g:1987:6: otherlv_14= ';'
                                    {
                                    otherlv_14=(Token)match(input,16,FOLLOW_22); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_14, grammarAccess.getMappingBodyAccess().getSemicolonKeyword_3_2_2());
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyQvto.g:2002:1: entryRulePopulationSection returns [EObject current=null] : iv_rulePopulationSection= rulePopulationSection EOF ;
    public final EObject entryRulePopulationSection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopulationSection = null;


        try {
            // InternalMyQvto.g:2002:58: (iv_rulePopulationSection= rulePopulationSection EOF )
            // InternalMyQvto.g:2003:2: iv_rulePopulationSection= rulePopulationSection EOF
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
    // InternalMyQvto.g:2009:1: rulePopulationSection returns [EObject current=null] : ( ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) ) | (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) ) ) ;
    public final EObject rulePopulationSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expression_list_1_0 = null;

        EObject lv_expression_block_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2015:2: ( ( ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) ) | (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) ) ) )
            // InternalMyQvto.g:2016:2: ( ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) ) | (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) ) )
            {
            // InternalMyQvto.g:2016:2: ( ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) ) | (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==EOF||(LA46_0>=RULE_ID && LA46_0<=RULE_STRING)||LA46_0==14||LA46_0==16||LA46_0==19||(LA46_0>=21 && LA46_0<=23)||LA46_0==28||(LA46_0>=35 && LA46_0<=36)||LA46_0==43||LA46_0==45||LA46_0==54||LA46_0==56||(LA46_0>=79 && LA46_0<=81)) ) {
                alt46=1;
            }
            else if ( (LA46_0==29) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyQvto.g:2017:3: ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) )
                    {
                    // InternalMyQvto.g:2017:3: ( () ( (lv_expression_list_1_0= ruleExpressionList ) ) )
                    // InternalMyQvto.g:2018:4: () ( (lv_expression_list_1_0= ruleExpressionList ) )
                    {
                    // InternalMyQvto.g:2018:4: ()
                    // InternalMyQvto.g:2019:5: 
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

                    // InternalMyQvto.g:2028:4: ( (lv_expression_list_1_0= ruleExpressionList ) )
                    // InternalMyQvto.g:2029:5: (lv_expression_list_1_0= ruleExpressionList )
                    {
                    // InternalMyQvto.g:2029:5: (lv_expression_list_1_0= ruleExpressionList )
                    // InternalMyQvto.g:2030:6: lv_expression_list_1_0= ruleExpressionList
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
                      							"org.omg.qvt13.myqvto.MyQvto.ExpressionList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:2049:3: (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) )
                    {
                    // InternalMyQvto.g:2049:3: (otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) ) )
                    // InternalMyQvto.g:2050:4: otherlv_2= 'population' ( (lv_expression_block_3_0= ruleExpressionBlock ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPopulationSectionAccess().getPopulationKeyword_1_0());
                      			
                    }
                    // InternalMyQvto.g:2054:4: ( (lv_expression_block_3_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:2055:5: (lv_expression_block_3_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:2055:5: (lv_expression_block_3_0= ruleExpressionBlock )
                    // InternalMyQvto.g:2056:6: lv_expression_block_3_0= ruleExpressionBlock
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
                      							"org.omg.qvt13.myqvto.MyQvto.ExpressionBlock");
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


    // $ANTLR start "entryRuleExpressionList"
    // InternalMyQvto.g:2078:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // InternalMyQvto.g:2078:55: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalMyQvto.g:2079:2: iv_ruleExpressionList= ruleExpressionList EOF
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
    // InternalMyQvto.g:2085:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) ) (otherlv_1= ';' )? ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_semi_list_0_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2091:2: ( ( ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) ) (otherlv_1= ';' )? ) )
            // InternalMyQvto.g:2092:2: ( ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) ) (otherlv_1= ';' )? )
            {
            // InternalMyQvto.g:2092:2: ( ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) ) (otherlv_1= ';' )? )
            // InternalMyQvto.g:2093:3: ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) ) (otherlv_1= ';' )?
            {
            // InternalMyQvto.g:2093:3: ( (lv_expression_semi_list_0_0= ruleExpressionSemiList ) )
            // InternalMyQvto.g:2094:4: (lv_expression_semi_list_0_0= ruleExpressionSemiList )
            {
            // InternalMyQvto.g:2094:4: (lv_expression_semi_list_0_0= ruleExpressionSemiList )
            // InternalMyQvto.g:2095:5: lv_expression_semi_list_0_0= ruleExpressionSemiList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionListAccess().getExpression_semi_listExpressionSemiListParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
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
              						"org.omg.qvt13.myqvto.MyQvto.ExpressionSemiList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:2112:3: (otherlv_1= ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==16) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyQvto.g:2113:4: otherlv_1= ';'
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
    // InternalMyQvto.g:2122:1: entryRuleExpressionSemiList returns [EObject current=null] : iv_ruleExpressionSemiList= ruleExpressionSemiList EOF ;
    public final EObject entryRuleExpressionSemiList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionSemiList = null;


        try {
            // InternalMyQvto.g:2122:59: (iv_ruleExpressionSemiList= ruleExpressionSemiList EOF )
            // InternalMyQvto.g:2123:2: iv_ruleExpressionSemiList= ruleExpressionSemiList EOF
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
    // InternalMyQvto.g:2129:1: ruleExpressionSemiList returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleExpressionGO ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )* ) ;
    public final EObject ruleExpressionSemiList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2135:2: ( ( () ( (lv_expression_1_0= ruleExpressionGO ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )* ) )
            // InternalMyQvto.g:2136:2: ( () ( (lv_expression_1_0= ruleExpressionGO ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )* )
            {
            // InternalMyQvto.g:2136:2: ( () ( (lv_expression_1_0= ruleExpressionGO ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )* )
            // InternalMyQvto.g:2137:3: () ( (lv_expression_1_0= ruleExpressionGO ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )*
            {
            // InternalMyQvto.g:2137:3: ()
            // InternalMyQvto.g:2138:4: 
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

            // InternalMyQvto.g:2147:3: ( (lv_expression_1_0= ruleExpressionGO ) )
            // InternalMyQvto.g:2148:4: (lv_expression_1_0= ruleExpressionGO )
            {
            // InternalMyQvto.g:2148:4: (lv_expression_1_0= ruleExpressionGO )
            // InternalMyQvto.g:2149:5: lv_expression_1_0= ruleExpressionGO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionSemiListAccess().getExpressionExpressionGOParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
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
              						"org.omg.qvt13.myqvto.MyQvto.ExpressionGO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:2166:3: (otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==14) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMyQvto.g:2167:4: otherlv_2= ',' ( (lv_expression_3_0= ruleExpressionGO ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExpressionSemiListAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:2171:4: ( (lv_expression_3_0= ruleExpressionGO ) )
            	    // InternalMyQvto.g:2172:5: (lv_expression_3_0= ruleExpressionGO )
            	    {
            	    // InternalMyQvto.g:2172:5: (lv_expression_3_0= ruleExpressionGO )
            	    // InternalMyQvto.g:2173:6: lv_expression_3_0= ruleExpressionGO
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionSemiListAccess().getExpressionExpressionGOParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
            	      							"org.omg.qvt13.myqvto.MyQvto.ExpressionGO");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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


    // $ANTLR start "entryRuleEString"
    // InternalMyQvto.g:2195:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyQvto.g:2195:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyQvto.g:2196:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyQvto.g:2202:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyQvto.g:2208:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyQvto.g:2209:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyQvto.g:2209:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_ID) ) {
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
                    // InternalMyQvto.g:2210:3: this_STRING_0= RULE_STRING
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
                    // InternalMyQvto.g:2218:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleDeclarator"
    // InternalMyQvto.g:2229:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // InternalMyQvto.g:2229:51: (iv_ruleDeclarator= ruleDeclarator EOF )
            // InternalMyQvto.g:2230:2: iv_ruleDeclarator= ruleDeclarator EOF
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
    // InternalMyQvto.g:2236:1: ruleDeclarator returns [EObject current=null] : ( ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? ) | ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? ) ) ;
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
            // InternalMyQvto.g:2242:2: ( ( ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? ) | ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? ) ) )
            // InternalMyQvto.g:2243:2: ( ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? ) | ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? ) )
            {
            // InternalMyQvto.g:2243:2: ( ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? ) | ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? ) )
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalMyQvto.g:2244:3: ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? )
                    {
                    // InternalMyQvto.g:2244:3: ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? )
                    // InternalMyQvto.g:2245:4: ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )?
                    {
                    // InternalMyQvto.g:2245:4: ( (lv_typespec_0_0= ruleTypeSpec ) )
                    // InternalMyQvto.g:2246:5: (lv_typespec_0_0= ruleTypeSpec )
                    {
                    // InternalMyQvto.g:2246:5: (lv_typespec_0_0= ruleTypeSpec )
                    // InternalMyQvto.g:2247:6: lv_typespec_0_0= ruleTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeclaratorAccess().getTypespecTypeSpecParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
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
                      							"org.omg.qvt13.myqvto.MyQvto.TypeSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyQvto.g:2264:4: ( (lv_init_part_1_0= ruleInitPart ) )?
                    int alt50=2;
                    alt50 = dfa50.predict(input);
                    switch (alt50) {
                        case 1 :
                            // InternalMyQvto.g:2265:5: (lv_init_part_1_0= ruleInitPart )
                            {
                            // InternalMyQvto.g:2265:5: (lv_init_part_1_0= ruleInitPart )
                            // InternalMyQvto.g:2266:6: lv_init_part_1_0= ruleInitPart
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
                              							"org.omg.qvt13.myqvto.MyQvto.InitPart");
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
                    // InternalMyQvto.g:2285:3: ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? )
                    {
                    // InternalMyQvto.g:2285:3: ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? )
                    // InternalMyQvto.g:2286:4: ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )?
                    {
                    // InternalMyQvto.g:2286:4: ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) )
                    // InternalMyQvto.g:2287:5: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
                    {
                    // InternalMyQvto.g:2287:5: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
                    // InternalMyQvto.g:2288:6: lv_scoped_identifier_2_0= ruleScopedIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeclaratorAccess().getScoped_identifierScopedIdentifierParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
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
                      							"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDeclaratorAccess().getColonKeyword_1_1());
                      			
                    }
                    // InternalMyQvto.g:2309:4: ( (lv_typespec_4_0= ruleTypeSpec ) )
                    // InternalMyQvto.g:2310:5: (lv_typespec_4_0= ruleTypeSpec )
                    {
                    // InternalMyQvto.g:2310:5: (lv_typespec_4_0= ruleTypeSpec )
                    // InternalMyQvto.g:2311:6: lv_typespec_4_0= ruleTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeclaratorAccess().getTypespecTypeSpecParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
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
                      							"org.omg.qvt13.myqvto.MyQvto.TypeSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyQvto.g:2328:4: ( (lv_init_part_5_0= ruleInitPart ) )?
                    int alt51=2;
                    alt51 = dfa51.predict(input);
                    switch (alt51) {
                        case 1 :
                            // InternalMyQvto.g:2329:5: (lv_init_part_5_0= ruleInitPart )
                            {
                            // InternalMyQvto.g:2329:5: (lv_init_part_5_0= ruleInitPart )
                            // InternalMyQvto.g:2330:6: lv_init_part_5_0= ruleInitPart
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
                              							"org.omg.qvt13.myqvto.MyQvto.InitPart");
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
    // InternalMyQvto.g:2352:1: entryRuleTypeSpec returns [EObject current=null] : iv_ruleTypeSpec= ruleTypeSpec EOF ;
    public final EObject entryRuleTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpec = null;


        try {
            // InternalMyQvto.g:2352:49: (iv_ruleTypeSpec= ruleTypeSpec EOF )
            // InternalMyQvto.g:2353:2: iv_ruleTypeSpec= ruleTypeSpec EOF
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
    // InternalMyQvto.g:2359:1: ruleTypeSpec returns [EObject current=null] : ( ( (lv_type_reference_0_0= ruleTypeReference ) ) (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleTypeSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_extent_location_2_0=null;
        EObject lv_type_reference_0_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2365:2: ( ( ( (lv_type_reference_0_0= ruleTypeReference ) ) (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )? ) )
            // InternalMyQvto.g:2366:2: ( ( (lv_type_reference_0_0= ruleTypeReference ) ) (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )? )
            {
            // InternalMyQvto.g:2366:2: ( ( (lv_type_reference_0_0= ruleTypeReference ) ) (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )? )
            // InternalMyQvto.g:2367:3: ( (lv_type_reference_0_0= ruleTypeReference ) ) (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )?
            {
            // InternalMyQvto.g:2367:3: ( (lv_type_reference_0_0= ruleTypeReference ) )
            // InternalMyQvto.g:2368:4: (lv_type_reference_0_0= ruleTypeReference )
            {
            // InternalMyQvto.g:2368:4: (lv_type_reference_0_0= ruleTypeReference )
            // InternalMyQvto.g:2369:5: lv_type_reference_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeSpecAccess().getType_referenceTypeReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_38);
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
              						"org.omg.qvt13.myqvto.MyQvto.TypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:2386:3: (otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==31) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyQvto.g:2387:4: otherlv_1= '@' ( (lv_extent_location_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeSpecAccess().getCommercialAtKeyword_1_0());
                      			
                    }
                    // InternalMyQvto.g:2391:4: ( (lv_extent_location_2_0= RULE_ID ) )
                    // InternalMyQvto.g:2392:5: (lv_extent_location_2_0= RULE_ID )
                    {
                    // InternalMyQvto.g:2392:5: (lv_extent_location_2_0= RULE_ID )
                    // InternalMyQvto.g:2393:6: lv_extent_location_2_0= RULE_ID
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
    // InternalMyQvto.g:2414:1: entryRuleInitPart returns [EObject current=null] : iv_ruleInitPart= ruleInitPart EOF ;
    public final EObject entryRuleInitPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitPart = null;


        try {
            // InternalMyQvto.g:2414:49: (iv_ruleInitPart= ruleInitPart EOF )
            // InternalMyQvto.g:2415:2: iv_ruleInitPart= ruleInitPart EOF
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
    // InternalMyQvto.g:2421:1: ruleInitPart returns [EObject current=null] : ( ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) ) ( (lv_expression_1_0= ruleExpressionGO ) ) ) ;
    public final EObject ruleInitPart() throws RecognitionException {
        EObject current = null;

        Token lv_init_op_0_1=null;
        Token lv_init_op_0_2=null;
        Token lv_init_op_0_3=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2427:2: ( ( ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) ) ( (lv_expression_1_0= ruleExpressionGO ) ) ) )
            // InternalMyQvto.g:2428:2: ( ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) ) ( (lv_expression_1_0= ruleExpressionGO ) ) )
            {
            // InternalMyQvto.g:2428:2: ( ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) ) ( (lv_expression_1_0= ruleExpressionGO ) ) )
            // InternalMyQvto.g:2429:3: ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) ) ( (lv_expression_1_0= ruleExpressionGO ) )
            {
            // InternalMyQvto.g:2429:3: ( ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) ) )
            // InternalMyQvto.g:2430:4: ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) )
            {
            // InternalMyQvto.g:2430:4: ( (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' ) )
            // InternalMyQvto.g:2431:5: (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' )
            {
            // InternalMyQvto.g:2431:5: (lv_init_op_0_1= '=' | lv_init_op_0_2= ':=' | lv_init_op_0_3= '::=' )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt54=1;
                }
                break;
            case 32:
                {
                alt54=2;
                }
                break;
            case 33:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalMyQvto.g:2432:6: lv_init_op_0_1= '='
                    {
                    lv_init_op_0_1=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
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
                    // InternalMyQvto.g:2443:6: lv_init_op_0_2= ':='
                    {
                    lv_init_op_0_2=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
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
                    // InternalMyQvto.g:2454:6: lv_init_op_0_3= '::='
                    {
                    lv_init_op_0_3=(Token)match(input,33,FOLLOW_15); if (state.failed) return current;
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

            // InternalMyQvto.g:2467:3: ( (lv_expression_1_0= ruleExpressionGO ) )
            // InternalMyQvto.g:2468:4: (lv_expression_1_0= ruleExpressionGO )
            {
            // InternalMyQvto.g:2468:4: (lv_expression_1_0= ruleExpressionGO )
            // InternalMyQvto.g:2469:5: lv_expression_1_0= ruleExpressionGO
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
              						"org.omg.qvt13.myqvto.MyQvto.ExpressionGO");
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


    // $ANTLR start "entryRuleScopedIdentifier"
    // InternalMyQvto.g:2490:1: entryRuleScopedIdentifier returns [EObject current=null] : iv_ruleScopedIdentifier= ruleScopedIdentifier EOF ;
    public final EObject entryRuleScopedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopedIdentifier = null;


        try {
            // InternalMyQvto.g:2490:57: (iv_ruleScopedIdentifier= ruleScopedIdentifier EOF )
            // InternalMyQvto.g:2491:2: iv_ruleScopedIdentifier= ruleScopedIdentifier EOF
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
    // InternalMyQvto.g:2497:1: ruleScopedIdentifier returns [EObject current=null] : ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleScopedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token lv_identifier_3_0=null;


        	enterRule();

        try {
            // InternalMyQvto.g:2503:2: ( ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )* ) )
            // InternalMyQvto.g:2504:2: ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )* )
            {
            // InternalMyQvto.g:2504:2: ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )* )
            // InternalMyQvto.g:2505:3: () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )*
            {
            // InternalMyQvto.g:2505:3: ()
            // InternalMyQvto.g:2506:4: 
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

            // InternalMyQvto.g:2515:3: ( (lv_identifier_1_0= RULE_ID ) )
            // InternalMyQvto.g:2516:4: (lv_identifier_1_0= RULE_ID )
            {
            // InternalMyQvto.g:2516:4: (lv_identifier_1_0= RULE_ID )
            // InternalMyQvto.g:2517:5: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
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

            // InternalMyQvto.g:2533:3: (otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==34) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMyQvto.g:2534:4: otherlv_2= '::' ( (lv_identifier_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getScopedIdentifierAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:2538:4: ( (lv_identifier_3_0= RULE_ID ) )
            	    // InternalMyQvto.g:2539:5: (lv_identifier_3_0= RULE_ID )
            	    {
            	    // InternalMyQvto.g:2539:5: (lv_identifier_3_0= RULE_ID )
            	    // InternalMyQvto.g:2540:6: lv_identifier_3_0= RULE_ID
            	    {
            	    lv_identifier_3_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
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
            	    break loop55;
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


    // $ANTLR start "entryRuleTypeReference"
    // InternalMyQvto.g:2561:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalMyQvto.g:2561:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalMyQvto.g:2562:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalMyQvto.g:2568:1: ruleTypeReference returns [EObject current=null] : ( ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) | ( (lv_complex_type_2_0= ruleComplexType ) ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_scoped_identifier_1_0 = null;

        EObject lv_complex_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2574:2: ( ( ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) | ( (lv_complex_type_2_0= ruleComplexType ) ) ) )
            // InternalMyQvto.g:2575:2: ( ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) | ( (lv_complex_type_2_0= ruleComplexType ) ) )
            {
            // InternalMyQvto.g:2575:2: ( ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) | ( (lv_complex_type_2_0= ruleComplexType ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=37 && LA56_0<=38)||(LA56_0>=64 && LA56_0<=69)) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyQvto.g:2576:3: ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) )
                    {
                    // InternalMyQvto.g:2576:3: ( () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) )
                    // InternalMyQvto.g:2577:4: () ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
                    {
                    // InternalMyQvto.g:2577:4: ()
                    // InternalMyQvto.g:2578:5: 
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

                    // InternalMyQvto.g:2587:4: ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
                    // InternalMyQvto.g:2588:5: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
                    {
                    // InternalMyQvto.g:2588:5: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
                    // InternalMyQvto.g:2589:6: lv_scoped_identifier_1_0= ruleScopedIdentifier
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
                      							"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:2608:3: ( (lv_complex_type_2_0= ruleComplexType ) )
                    {
                    // InternalMyQvto.g:2608:3: ( (lv_complex_type_2_0= ruleComplexType ) )
                    // InternalMyQvto.g:2609:4: (lv_complex_type_2_0= ruleComplexType )
                    {
                    // InternalMyQvto.g:2609:4: (lv_complex_type_2_0= ruleComplexType )
                    // InternalMyQvto.g:2610:5: lv_complex_type_2_0= ruleComplexType
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
                      						"org.omg.qvt13.myqvto.MyQvto.ComplexType");
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
    // InternalMyQvto.g:2631:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalMyQvto.g:2631:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalMyQvto.g:2632:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalMyQvto.g:2638:1: ruleComplexType returns [EObject current=null] : ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) | ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) | (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) | (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' ) ) ;
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
            // InternalMyQvto.g:2644:2: ( ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) | ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) | (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) | (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' ) ) )
            // InternalMyQvto.g:2645:2: ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) | ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) | (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) | (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' ) )
            {
            // InternalMyQvto.g:2645:2: ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) | ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) | (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) | (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' ) )
            int alt57=4;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // InternalMyQvto.g:2646:3: ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) )
                    {
                    // InternalMyQvto.g:2646:3: ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) )
                    // InternalMyQvto.g:2647:4: () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) )
                    {
                    // InternalMyQvto.g:2647:4: ()
                    // InternalMyQvto.g:2648:5: 
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

                    // InternalMyQvto.g:2657:4: ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) )
                    // InternalMyQvto.g:2658:5: (lv_complex_type_key_1_0= ruleComplexTypeKey )
                    {
                    // InternalMyQvto.g:2658:5: (lv_complex_type_key_1_0= ruleComplexTypeKey )
                    // InternalMyQvto.g:2659:6: lv_complex_type_key_1_0= ruleComplexTypeKey
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
                      							"org.omg.qvt13.myqvto.MyQvto.ComplexTypeKey");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:2678:3: ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' )
                    {
                    // InternalMyQvto.g:2678:3: ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' )
                    // InternalMyQvto.g:2679:4: ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')'
                    {
                    // InternalMyQvto.g:2679:4: ( (lv_collection_key_2_0= ruleCollectionKey ) )
                    // InternalMyQvto.g:2680:5: (lv_collection_key_2_0= ruleCollectionKey )
                    {
                    // InternalMyQvto.g:2680:5: (lv_collection_key_2_0= ruleCollectionKey )
                    // InternalMyQvto.g:2681:6: lv_collection_key_2_0= ruleCollectionKey
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComplexTypeAccess().getCollection_keyCollectionKeyEnumRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
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
                      							"org.omg.qvt13.myqvto.MyQvto.CollectionKey");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComplexTypeAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalMyQvto.g:2702:4: ( (lv_typespec_4_0= ruleTypeSpec ) )
                    // InternalMyQvto.g:2703:5: (lv_typespec_4_0= ruleTypeSpec )
                    {
                    // InternalMyQvto.g:2703:5: (lv_typespec_4_0= ruleTypeSpec )
                    // InternalMyQvto.g:2704:6: lv_typespec_4_0= ruleTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComplexTypeAccess().getTypespecTypeSpecParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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
                      							"org.omg.qvt13.myqvto.MyQvto.TypeSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getComplexTypeAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:2727:3: (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' )
                    {
                    // InternalMyQvto.g:2727:3: (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' )
                    // InternalMyQvto.g:2728:4: otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getComplexTypeAccess().getDictKeyword_2_0());
                      			
                    }
                    otherlv_7=(Token)match(input,35,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getComplexTypeAccess().getLeftParenthesisKeyword_2_1());
                      			
                    }
                    // InternalMyQvto.g:2736:4: ( (lv_typespec_8_0= ruleTypeSpec ) )
                    // InternalMyQvto.g:2737:5: (lv_typespec_8_0= ruleTypeSpec )
                    {
                    // InternalMyQvto.g:2737:5: (lv_typespec_8_0= ruleTypeSpec )
                    // InternalMyQvto.g:2738:6: lv_typespec_8_0= ruleTypeSpec
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
                      							"org.omg.qvt13.myqvto.MyQvto.TypeSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,14,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getComplexTypeAccess().getCommaKeyword_2_3());
                      			
                    }
                    // InternalMyQvto.g:2759:4: ( (lv_typespec_10_0= ruleTypeSpec ) )
                    // InternalMyQvto.g:2760:5: (lv_typespec_10_0= ruleTypeSpec )
                    {
                    // InternalMyQvto.g:2760:5: (lv_typespec_10_0= ruleTypeSpec )
                    // InternalMyQvto.g:2761:6: lv_typespec_10_0= ruleTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComplexTypeAccess().getTypespecTypeSpecParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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
                      							"org.omg.qvt13.myqvto.MyQvto.TypeSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getComplexTypeAccess().getRightParenthesisKeyword_2_5());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:2784:3: (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' )
                    {
                    // InternalMyQvto.g:2784:3: (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' )
                    // InternalMyQvto.g:2785:4: otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')'
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getComplexTypeAccess().getTupleKeyword_3_0());
                      			
                    }
                    otherlv_13=(Token)match(input,35,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getComplexTypeAccess().getLeftParenthesisKeyword_3_1());
                      			
                    }
                    // InternalMyQvto.g:2793:4: ( (lv_declarator_list_14_0= ruleDeclaratorList ) )
                    // InternalMyQvto.g:2794:5: (lv_declarator_list_14_0= ruleDeclaratorList )
                    {
                    // InternalMyQvto.g:2794:5: (lv_declarator_list_14_0= ruleDeclaratorList )
                    // InternalMyQvto.g:2795:6: lv_declarator_list_14_0= ruleDeclaratorList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComplexTypeAccess().getDeclarator_listDeclaratorListParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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
                      							"org.omg.qvt13.myqvto.MyQvto.DeclaratorList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyQvto.g:2821:1: entryRuleDeclaratorList returns [EObject current=null] : iv_ruleDeclaratorList= ruleDeclaratorList EOF ;
    public final EObject entryRuleDeclaratorList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaratorList = null;


        try {
            // InternalMyQvto.g:2821:55: (iv_ruleDeclaratorList= ruleDeclaratorList EOF )
            // InternalMyQvto.g:2822:2: iv_ruleDeclaratorList= ruleDeclaratorList EOF
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
    // InternalMyQvto.g:2828:1: ruleDeclaratorList returns [EObject current=null] : ( () ( (lv_declarator_1_0= ruleDeclarator ) ) (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclaratorList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_declarator_1_0 = null;

        EObject lv_declarator_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2834:2: ( ( () ( (lv_declarator_1_0= ruleDeclarator ) ) (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )* ) )
            // InternalMyQvto.g:2835:2: ( () ( (lv_declarator_1_0= ruleDeclarator ) ) (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )* )
            {
            // InternalMyQvto.g:2835:2: ( () ( (lv_declarator_1_0= ruleDeclarator ) ) (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )* )
            // InternalMyQvto.g:2836:3: () ( (lv_declarator_1_0= ruleDeclarator ) ) (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )*
            {
            // InternalMyQvto.g:2836:3: ()
            // InternalMyQvto.g:2837:4: 
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

            // InternalMyQvto.g:2846:3: ( (lv_declarator_1_0= ruleDeclarator ) )
            // InternalMyQvto.g:2847:4: (lv_declarator_1_0= ruleDeclarator )
            {
            // InternalMyQvto.g:2847:4: (lv_declarator_1_0= ruleDeclarator )
            // InternalMyQvto.g:2848:5: lv_declarator_1_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeclaratorListAccess().getDeclaratorDeclaratorParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
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
              						"org.omg.qvt13.myqvto.MyQvto.Declarator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:2865:3: (otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==14) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMyQvto.g:2866:4: otherlv_2= ',' ( (lv_declarator_3_0= ruleDeclarator ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDeclaratorListAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:2870:4: ( (lv_declarator_3_0= ruleDeclarator ) )
            	    // InternalMyQvto.g:2871:5: (lv_declarator_3_0= ruleDeclarator )
            	    {
            	    // InternalMyQvto.g:2871:5: (lv_declarator_3_0= ruleDeclarator )
            	    // InternalMyQvto.g:2872:6: lv_declarator_3_0= ruleDeclarator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeclaratorListAccess().getDeclaratorDeclaratorParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
            	      							"org.omg.qvt13.myqvto.MyQvto.Declarator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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


    // $ANTLR start "entryRuleSimpleSignature"
    // InternalMyQvto.g:2894:1: entryRuleSimpleSignature returns [EObject current=null] : iv_ruleSimpleSignature= ruleSimpleSignature EOF ;
    public final EObject entryRuleSimpleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSignature = null;


        try {
            // InternalMyQvto.g:2894:56: (iv_ruleSimpleSignature= ruleSimpleSignature EOF )
            // InternalMyQvto.g:2895:2: iv_ruleSimpleSignature= ruleSimpleSignature EOF
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
    // InternalMyQvto.g:2901:1: ruleSimpleSignature returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_param_list_2_0= ruleParamList ) )? otherlv_3= ')' ) ;
    public final EObject ruleSimpleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_param_list_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2907:2: ( ( () otherlv_1= '(' ( (lv_param_list_2_0= ruleParamList ) )? otherlv_3= ')' ) )
            // InternalMyQvto.g:2908:2: ( () otherlv_1= '(' ( (lv_param_list_2_0= ruleParamList ) )? otherlv_3= ')' )
            {
            // InternalMyQvto.g:2908:2: ( () otherlv_1= '(' ( (lv_param_list_2_0= ruleParamList ) )? otherlv_3= ')' )
            // InternalMyQvto.g:2909:3: () otherlv_1= '(' ( (lv_param_list_2_0= ruleParamList ) )? otherlv_3= ')'
            {
            // InternalMyQvto.g:2909:3: ()
            // InternalMyQvto.g:2910:4: 
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

            otherlv_1=(Token)match(input,35,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSimpleSignatureAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMyQvto.g:2923:3: ( (lv_param_list_2_0= ruleParamList ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||(LA59_0>=37 && LA59_0<=38)||(LA59_0>=61 && LA59_0<=69)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyQvto.g:2924:4: (lv_param_list_2_0= ruleParamList )
                    {
                    // InternalMyQvto.g:2924:4: (lv_param_list_2_0= ruleParamList )
                    // InternalMyQvto.g:2925:5: lv_param_list_2_0= ruleParamList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleSignatureAccess().getParam_listParamListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_40);
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
                      						"org.omg.qvt13.myqvto.MyQvto.ParamList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyQvto.g:2950:1: entryRuleParamList returns [EObject current=null] : iv_ruleParamList= ruleParamList EOF ;
    public final EObject entryRuleParamList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamList = null;


        try {
            // InternalMyQvto.g:2950:50: (iv_ruleParamList= ruleParamList EOF )
            // InternalMyQvto.g:2951:2: iv_ruleParamList= ruleParamList EOF
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
    // InternalMyQvto.g:2957:1: ruleParamList returns [EObject current=null] : ( () ( (lv_param_1_0= ruleVarParameter ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )* ) ;
    public final EObject ruleParamList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_param_1_0 = null;

        EObject lv_param_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:2963:2: ( ( () ( (lv_param_1_0= ruleVarParameter ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )* ) )
            // InternalMyQvto.g:2964:2: ( () ( (lv_param_1_0= ruleVarParameter ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )* )
            {
            // InternalMyQvto.g:2964:2: ( () ( (lv_param_1_0= ruleVarParameter ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )* )
            // InternalMyQvto.g:2965:3: () ( (lv_param_1_0= ruleVarParameter ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )*
            {
            // InternalMyQvto.g:2965:3: ()
            // InternalMyQvto.g:2966:4: 
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

            // InternalMyQvto.g:2975:3: ( (lv_param_1_0= ruleVarParameter ) )
            // InternalMyQvto.g:2976:4: (lv_param_1_0= ruleVarParameter )
            {
            // InternalMyQvto.g:2976:4: (lv_param_1_0= ruleVarParameter )
            // InternalMyQvto.g:2977:5: lv_param_1_0= ruleVarParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamListAccess().getParamVarParameterParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
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
              						"org.omg.qvt13.myqvto.MyQvto.VarParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:2994:3: (otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==14) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalMyQvto.g:2995:4: otherlv_2= ',' ( (lv_param_3_0= ruleVarParameter ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getParamListAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:2999:4: ( (lv_param_3_0= ruleVarParameter ) )
            	    // InternalMyQvto.g:3000:5: (lv_param_3_0= ruleVarParameter )
            	    {
            	    // InternalMyQvto.g:3000:5: (lv_param_3_0= ruleVarParameter )
            	    // InternalMyQvto.g:3001:6: lv_param_3_0= ruleVarParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParamListAccess().getParamVarParameterParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
            	      							"org.omg.qvt13.myqvto.MyQvto.VarParameter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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


    // $ANTLR start "entryRulePackageRefGO"
    // InternalMyQvto.g:3023:1: entryRulePackageRefGO returns [EObject current=null] : iv_rulePackageRefGO= rulePackageRefGO EOF ;
    public final EObject entryRulePackageRefGO() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageRefGO = null;


        try {
            // InternalMyQvto.g:3023:53: (iv_rulePackageRefGO= rulePackageRefGO EOF )
            // InternalMyQvto.g:3024:2: iv_rulePackageRefGO= rulePackageRefGO EOF
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
    // InternalMyQvto.g:3030:1: rulePackageRefGO returns [EObject current=null] : ( () ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) ) ) ;
    public final EObject rulePackageRefGO() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_uri_3_0=null;
        Token otherlv_4=null;
        Token lv_uri_5_0=null;
        EObject lv_scoped_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3036:2: ( ( () ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) ) ) )
            // InternalMyQvto.g:3037:2: ( () ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) ) )
            {
            // InternalMyQvto.g:3037:2: ( () ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) ) )
            // InternalMyQvto.g:3038:3: () ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) )
            {
            // InternalMyQvto.g:3038:3: ()
            // InternalMyQvto.g:3039:4: 
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

            // InternalMyQvto.g:3048:3: ( ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? ) | ( (lv_uri_5_0= RULE_STRING ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_STRING) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyQvto.g:3049:4: ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? )
                    {
                    // InternalMyQvto.g:3049:4: ( ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )? )
                    // InternalMyQvto.g:3050:5: ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )?
                    {
                    // InternalMyQvto.g:3050:5: ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
                    // InternalMyQvto.g:3051:6: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
                    {
                    // InternalMyQvto.g:3051:6: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
                    // InternalMyQvto.g:3052:7: lv_scoped_identifier_1_0= ruleScopedIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPackageRefGOAccess().getScoped_identifierScopedIdentifierParserRuleCall_1_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_44);
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
                      								"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyQvto.g:3069:5: (otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==35) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalMyQvto.g:3070:6: otherlv_2= '(' ( (lv_uri_3_0= RULE_STRING ) ) otherlv_4= ')'
                            {
                            otherlv_2=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getPackageRefGOAccess().getLeftParenthesisKeyword_1_0_1_0());
                              					
                            }
                            // InternalMyQvto.g:3074:6: ( (lv_uri_3_0= RULE_STRING ) )
                            // InternalMyQvto.g:3075:7: (lv_uri_3_0= RULE_STRING )
                            {
                            // InternalMyQvto.g:3075:7: (lv_uri_3_0= RULE_STRING )
                            // InternalMyQvto.g:3076:8: lv_uri_3_0= RULE_STRING
                            {
                            lv_uri_3_0=(Token)match(input,RULE_STRING,FOLLOW_40); if (state.failed) return current;
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

                            otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
                    // InternalMyQvto.g:3099:4: ( (lv_uri_5_0= RULE_STRING ) )
                    {
                    // InternalMyQvto.g:3099:4: ( (lv_uri_5_0= RULE_STRING ) )
                    // InternalMyQvto.g:3100:5: (lv_uri_5_0= RULE_STRING )
                    {
                    // InternalMyQvto.g:3100:5: (lv_uri_5_0= RULE_STRING )
                    // InternalMyQvto.g:3101:6: lv_uri_5_0= RULE_STRING
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


    // $ANTLR start "entryRuleConstructorHeader"
    // InternalMyQvto.g:3122:1: entryRuleConstructorHeader returns [EObject current=null] : iv_ruleConstructorHeader= ruleConstructorHeader EOF ;
    public final EObject entryRuleConstructorHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorHeader = null;


        try {
            // InternalMyQvto.g:3122:58: (iv_ruleConstructorHeader= ruleConstructorHeader EOF )
            // InternalMyQvto.g:3123:2: iv_ruleConstructorHeader= ruleConstructorHeader EOF
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
    // InternalMyQvto.g:3129:1: ruleConstructorHeader returns [EObject current=null] : ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'constructor' ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_3_0= ruleSimpleSignature ) ) ) ;
    public final EObject ruleConstructorHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_qualifier_0_0 = null;

        EObject lv_scoped_identifier_2_0 = null;

        EObject lv_simple_signature_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3135:2: ( ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'constructor' ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_3_0= ruleSimpleSignature ) ) ) )
            // InternalMyQvto.g:3136:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'constructor' ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_3_0= ruleSimpleSignature ) ) )
            {
            // InternalMyQvto.g:3136:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'constructor' ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_3_0= ruleSimpleSignature ) ) )
            // InternalMyQvto.g:3137:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'constructor' ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_3_0= ruleSimpleSignature ) )
            {
            // InternalMyQvto.g:3137:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=70 && LA63_0<=72)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalMyQvto.g:3138:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    {
            	    // InternalMyQvto.g:3138:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    // InternalMyQvto.g:3139:5: lv_qualifier_0_0= ruleGeneralQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstructorHeaderAccess().getQualifierGeneralQualifierEnumRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_45);
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
            	      						"org.omg.qvt13.myqvto.MyQvto.GeneralQualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_1=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstructorHeaderAccess().getConstructorKeyword_1());
              		
            }
            // InternalMyQvto.g:3160:3: ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:3161:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:3161:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            // InternalMyQvto.g:3162:5: lv_scoped_identifier_2_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstructorHeaderAccess().getScoped_identifierScopedIdentifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
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
              						"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3179:3: ( (lv_simple_signature_3_0= ruleSimpleSignature ) )
            // InternalMyQvto.g:3180:4: (lv_simple_signature_3_0= ruleSimpleSignature )
            {
            // InternalMyQvto.g:3180:4: (lv_simple_signature_3_0= ruleSimpleSignature )
            // InternalMyQvto.g:3181:5: lv_simple_signature_3_0= ruleSimpleSignature
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
              						"org.omg.qvt13.myqvto.MyQvto.SimpleSignature");
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


    // $ANTLR start "entryRuleHelperHeader"
    // InternalMyQvto.g:3202:1: entryRuleHelperHeader returns [EObject current=null] : iv_ruleHelperHeader= ruleHelperHeader EOF ;
    public final EObject entryRuleHelperHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelperHeader = null;


        try {
            // InternalMyQvto.g:3202:53: (iv_ruleHelperHeader= ruleHelperHeader EOF )
            // InternalMyQvto.g:3203:2: iv_ruleHelperHeader= ruleHelperHeader EOF
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
    // InternalMyQvto.g:3209:1: ruleHelperHeader returns [EObject current=null] : ( ( (lv_helper_info_0_0= ruleHelperInfo ) ) ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_2_0= ruleCompleteSignature ) ) ) ;
    public final EObject ruleHelperHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_helper_info_0_0 = null;

        EObject lv_scope_identifier_1_0 = null;

        EObject lv_complete_signature_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3215:2: ( ( ( (lv_helper_info_0_0= ruleHelperInfo ) ) ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_2_0= ruleCompleteSignature ) ) ) )
            // InternalMyQvto.g:3216:2: ( ( (lv_helper_info_0_0= ruleHelperInfo ) ) ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_2_0= ruleCompleteSignature ) ) )
            {
            // InternalMyQvto.g:3216:2: ( ( (lv_helper_info_0_0= ruleHelperInfo ) ) ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_2_0= ruleCompleteSignature ) ) )
            // InternalMyQvto.g:3217:3: ( (lv_helper_info_0_0= ruleHelperInfo ) ) ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_2_0= ruleCompleteSignature ) )
            {
            // InternalMyQvto.g:3217:3: ( (lv_helper_info_0_0= ruleHelperInfo ) )
            // InternalMyQvto.g:3218:4: (lv_helper_info_0_0= ruleHelperInfo )
            {
            // InternalMyQvto.g:3218:4: (lv_helper_info_0_0= ruleHelperInfo )
            // InternalMyQvto.g:3219:5: lv_helper_info_0_0= ruleHelperInfo
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
              						"org.omg.qvt13.myqvto.MyQvto.HelperInfo");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3236:3: ( (lv_scope_identifier_1_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:3237:4: (lv_scope_identifier_1_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:3237:4: (lv_scope_identifier_1_0= ruleScopedIdentifier )
            // InternalMyQvto.g:3238:5: lv_scope_identifier_1_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHelperHeaderAccess().getScope_identifierScopedIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_29);
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
              						"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3255:3: ( (lv_complete_signature_2_0= ruleCompleteSignature ) )
            // InternalMyQvto.g:3256:4: (lv_complete_signature_2_0= ruleCompleteSignature )
            {
            // InternalMyQvto.g:3256:4: (lv_complete_signature_2_0= ruleCompleteSignature )
            // InternalMyQvto.g:3257:5: lv_complete_signature_2_0= ruleCompleteSignature
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
              						"org.omg.qvt13.myqvto.MyQvto.CompleteSignature");
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


    // $ANTLR start "entryRuleHelperInfo"
    // InternalMyQvto.g:3278:1: entryRuleHelperInfo returns [EObject current=null] : iv_ruleHelperInfo= ruleHelperInfo EOF ;
    public final EObject entryRuleHelperInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelperInfo = null;


        try {
            // InternalMyQvto.g:3278:51: (iv_ruleHelperInfo= ruleHelperInfo EOF )
            // InternalMyQvto.g:3279:2: iv_ruleHelperInfo= ruleHelperInfo EOF
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
    // InternalMyQvto.g:3285:1: ruleHelperInfo returns [EObject current=null] : ( () ( (lv_qualifier_1_0= ruleGeneralQualifier ) )* ( (lv_helper_kind_2_0= ruleHelperKind ) ) ) ;
    public final EObject ruleHelperInfo() throws RecognitionException {
        EObject current = null;

        Enumerator lv_qualifier_1_0 = null;

        Enumerator lv_helper_kind_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3291:2: ( ( () ( (lv_qualifier_1_0= ruleGeneralQualifier ) )* ( (lv_helper_kind_2_0= ruleHelperKind ) ) ) )
            // InternalMyQvto.g:3292:2: ( () ( (lv_qualifier_1_0= ruleGeneralQualifier ) )* ( (lv_helper_kind_2_0= ruleHelperKind ) ) )
            {
            // InternalMyQvto.g:3292:2: ( () ( (lv_qualifier_1_0= ruleGeneralQualifier ) )* ( (lv_helper_kind_2_0= ruleHelperKind ) ) )
            // InternalMyQvto.g:3293:3: () ( (lv_qualifier_1_0= ruleGeneralQualifier ) )* ( (lv_helper_kind_2_0= ruleHelperKind ) )
            {
            // InternalMyQvto.g:3293:3: ()
            // InternalMyQvto.g:3294:4: 
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

            // InternalMyQvto.g:3303:3: ( (lv_qualifier_1_0= ruleGeneralQualifier ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=70 && LA64_0<=72)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalMyQvto.g:3304:4: (lv_qualifier_1_0= ruleGeneralQualifier )
            	    {
            	    // InternalMyQvto.g:3304:4: (lv_qualifier_1_0= ruleGeneralQualifier )
            	    // InternalMyQvto.g:3305:5: lv_qualifier_1_0= ruleGeneralQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getHelperInfoAccess().getQualifierGeneralQualifierEnumRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
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
            	      						"org.omg.qvt13.myqvto.MyQvto.GeneralQualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // InternalMyQvto.g:3322:3: ( (lv_helper_kind_2_0= ruleHelperKind ) )
            // InternalMyQvto.g:3323:4: (lv_helper_kind_2_0= ruleHelperKind )
            {
            // InternalMyQvto.g:3323:4: (lv_helper_kind_2_0= ruleHelperKind )
            // InternalMyQvto.g:3324:5: lv_helper_kind_2_0= ruleHelperKind
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
              						"org.omg.qvt13.myqvto.MyQvto.HelperKind");
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
    // InternalMyQvto.g:3345:1: entryRuleCompleteSignature returns [EObject current=null] : iv_ruleCompleteSignature= ruleCompleteSignature EOF ;
    public final EObject entryRuleCompleteSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteSignature = null;


        try {
            // InternalMyQvto.g:3345:58: (iv_ruleCompleteSignature= ruleCompleteSignature EOF )
            // InternalMyQvto.g:3346:2: iv_ruleCompleteSignature= ruleCompleteSignature EOF
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
    // InternalMyQvto.g:3352:1: ruleCompleteSignature returns [EObject current=null] : ( ( (lv_simple_signature_0_0= ruleSimpleSignature ) ) (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )? ) ;
    public final EObject ruleCompleteSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_simple_signature_0_0 = null;

        EObject lv_param_list_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3358:2: ( ( ( (lv_simple_signature_0_0= ruleSimpleSignature ) ) (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )? ) )
            // InternalMyQvto.g:3359:2: ( ( (lv_simple_signature_0_0= ruleSimpleSignature ) ) (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )? )
            {
            // InternalMyQvto.g:3359:2: ( ( (lv_simple_signature_0_0= ruleSimpleSignature ) ) (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )? )
            // InternalMyQvto.g:3360:3: ( (lv_simple_signature_0_0= ruleSimpleSignature ) ) (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )?
            {
            // InternalMyQvto.g:3360:3: ( (lv_simple_signature_0_0= ruleSimpleSignature ) )
            // InternalMyQvto.g:3361:4: (lv_simple_signature_0_0= ruleSimpleSignature )
            {
            // InternalMyQvto.g:3361:4: (lv_simple_signature_0_0= ruleSimpleSignature )
            // InternalMyQvto.g:3362:5: lv_simple_signature_0_0= ruleSimpleSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompleteSignatureAccess().getSimple_signatureSimpleSignatureParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_47);
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
              						"org.omg.qvt13.myqvto.MyQvto.SimpleSignature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3379:3: (otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==30) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyQvto.g:3380:4: otherlv_1= ':' ( (lv_param_list_2_0= ruleParamList ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCompleteSignatureAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalMyQvto.g:3384:4: ( (lv_param_list_2_0= ruleParamList ) )
                    // InternalMyQvto.g:3385:5: (lv_param_list_2_0= ruleParamList )
                    {
                    // InternalMyQvto.g:3385:5: (lv_param_list_2_0= ruleParamList )
                    // InternalMyQvto.g:3386:6: lv_param_list_2_0= ruleParamList
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
                      							"org.omg.qvt13.myqvto.MyQvto.ParamList");
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


    // $ANTLR start "entryRuleLibraryHeader"
    // InternalMyQvto.g:3408:1: entryRuleLibraryHeader returns [EObject current=null] : iv_ruleLibraryHeader= ruleLibraryHeader EOF ;
    public final EObject entryRuleLibraryHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryHeader = null;


        try {
            // InternalMyQvto.g:3408:54: (iv_ruleLibraryHeader= ruleLibraryHeader EOF )
            // InternalMyQvto.g:3409:2: iv_ruleLibraryHeader= ruleLibraryHeader EOF
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
    // InternalMyQvto.g:3415:1: ruleLibraryHeader returns [EObject current=null] : ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_library_signature_3_0= ruleSimpleSignature ) )? ( (lv_module_usage_4_0= ruleModuleUsageGO ) )? ) ;
    public final EObject ruleLibraryHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_library_signature_3_0 = null;

        EObject lv_module_usage_4_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3421:2: ( ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_library_signature_3_0= ruleSimpleSignature ) )? ( (lv_module_usage_4_0= ruleModuleUsageGO ) )? ) )
            // InternalMyQvto.g:3422:2: ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_library_signature_3_0= ruleSimpleSignature ) )? ( (lv_module_usage_4_0= ruleModuleUsageGO ) )? )
            {
            // InternalMyQvto.g:3422:2: ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_library_signature_3_0= ruleSimpleSignature ) )? ( (lv_module_usage_4_0= ruleModuleUsageGO ) )? )
            // InternalMyQvto.g:3423:3: () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_library_signature_3_0= ruleSimpleSignature ) )? ( (lv_module_usage_4_0= ruleModuleUsageGO ) )?
            {
            // InternalMyQvto.g:3423:3: ()
            // InternalMyQvto.g:3424:4: 
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

            otherlv_1=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLibraryHeaderAccess().getLibraryKeyword_1());
              		
            }
            // InternalMyQvto.g:3437:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyQvto.g:3438:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyQvto.g:3438:4: (lv_name_2_0= RULE_ID )
            // InternalMyQvto.g:3439:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
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

            // InternalMyQvto.g:3455:3: ( (lv_library_signature_3_0= ruleSimpleSignature ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==35) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyQvto.g:3456:4: (lv_library_signature_3_0= ruleSimpleSignature )
                    {
                    // InternalMyQvto.g:3456:4: (lv_library_signature_3_0= ruleSimpleSignature )
                    // InternalMyQvto.g:3457:5: lv_library_signature_3_0= ruleSimpleSignature
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLibraryHeaderAccess().getLibrary_signatureSimpleSignatureParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_49);
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
                      						"org.omg.qvt13.myqvto.MyQvto.SimpleSignature");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:3474:3: ( (lv_module_usage_4_0= ruleModuleUsageGO ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=41 && LA67_0<=42)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyQvto.g:3475:4: (lv_module_usage_4_0= ruleModuleUsageGO )
                    {
                    // InternalMyQvto.g:3475:4: (lv_module_usage_4_0= ruleModuleUsageGO )
                    // InternalMyQvto.g:3476:5: lv_module_usage_4_0= ruleModuleUsageGO
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
                      						"org.omg.qvt13.myqvto.MyQvto.ModuleUsageGO");
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


    // $ANTLR start "entryRuleModuleUsageGO"
    // InternalMyQvto.g:3497:1: entryRuleModuleUsageGO returns [EObject current=null] : iv_ruleModuleUsageGO= ruleModuleUsageGO EOF ;
    public final EObject entryRuleModuleUsageGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleUsageGO = null;


        try {
            // InternalMyQvto.g:3497:54: (iv_ruleModuleUsageGO= ruleModuleUsageGO EOF )
            // InternalMyQvto.g:3498:2: iv_ruleModuleUsageGO= ruleModuleUsageGO EOF
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
    // InternalMyQvto.g:3504:1: ruleModuleUsageGO returns [EObject current=null] : ( ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) ) | ( (lv_extends_usage_2_0= ruleExtendsUsage ) ) ) ;
    public final EObject ruleModuleUsageGO() throws RecognitionException {
        EObject current = null;

        EObject lv_access_usage_1_0 = null;

        EObject lv_extends_usage_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3510:2: ( ( ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) ) | ( (lv_extends_usage_2_0= ruleExtendsUsage ) ) ) )
            // InternalMyQvto.g:3511:2: ( ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) ) | ( (lv_extends_usage_2_0= ruleExtendsUsage ) ) )
            {
            // InternalMyQvto.g:3511:2: ( ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) ) | ( (lv_extends_usage_2_0= ruleExtendsUsage ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==41) ) {
                alt68=1;
            }
            else if ( (LA68_0==42) ) {
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
                    // InternalMyQvto.g:3512:3: ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) )
                    {
                    // InternalMyQvto.g:3512:3: ( () ( (lv_access_usage_1_0= ruleAccessUsage ) ) )
                    // InternalMyQvto.g:3513:4: () ( (lv_access_usage_1_0= ruleAccessUsage ) )
                    {
                    // InternalMyQvto.g:3513:4: ()
                    // InternalMyQvto.g:3514:5: 
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

                    // InternalMyQvto.g:3523:4: ( (lv_access_usage_1_0= ruleAccessUsage ) )
                    // InternalMyQvto.g:3524:5: (lv_access_usage_1_0= ruleAccessUsage )
                    {
                    // InternalMyQvto.g:3524:5: (lv_access_usage_1_0= ruleAccessUsage )
                    // InternalMyQvto.g:3525:6: lv_access_usage_1_0= ruleAccessUsage
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
                      							"org.omg.qvt13.myqvto.MyQvto.AccessUsage");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:3544:3: ( (lv_extends_usage_2_0= ruleExtendsUsage ) )
                    {
                    // InternalMyQvto.g:3544:3: ( (lv_extends_usage_2_0= ruleExtendsUsage ) )
                    // InternalMyQvto.g:3545:4: (lv_extends_usage_2_0= ruleExtendsUsage )
                    {
                    // InternalMyQvto.g:3545:4: (lv_extends_usage_2_0= ruleExtendsUsage )
                    // InternalMyQvto.g:3546:5: lv_extends_usage_2_0= ruleExtendsUsage
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
                      						"org.omg.qvt13.myqvto.MyQvto.ExtendsUsage");
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


    // $ANTLR start "entryRuleAccessUsage"
    // InternalMyQvto.g:3567:1: entryRuleAccessUsage returns [EObject current=null] : iv_ruleAccessUsage= ruleAccessUsage EOF ;
    public final EObject entryRuleAccessUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessUsage = null;


        try {
            // InternalMyQvto.g:3567:52: (iv_ruleAccessUsage= ruleAccessUsage EOF )
            // InternalMyQvto.g:3568:2: iv_ruleAccessUsage= ruleAccessUsage EOF
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
    // InternalMyQvto.g:3574:1: ruleAccessUsage returns [EObject current=null] : ( () otherlv_1= 'access' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* ) ;
    public final EObject ruleAccessUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_module_kind_2_0 = null;

        EObject lv_moduleref_list_3_0 = null;

        EObject lv_moduleref_list_5_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3580:2: ( ( () otherlv_1= 'access' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* ) )
            // InternalMyQvto.g:3581:2: ( () otherlv_1= 'access' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* )
            {
            // InternalMyQvto.g:3581:2: ( () otherlv_1= 'access' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* )
            // InternalMyQvto.g:3582:3: () otherlv_1= 'access' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )*
            {
            // InternalMyQvto.g:3582:3: ()
            // InternalMyQvto.g:3583:4: 
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

            otherlv_1=(Token)match(input,41,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAccessUsageAccess().getAccessKeyword_1());
              		
            }
            // InternalMyQvto.g:3596:3: ( (lv_module_kind_2_0= ruleModuleKind ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==40||LA69_0==46) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyQvto.g:3597:4: (lv_module_kind_2_0= ruleModuleKind )
                    {
                    // InternalMyQvto.g:3597:4: (lv_module_kind_2_0= ruleModuleKind )
                    // InternalMyQvto.g:3598:5: lv_module_kind_2_0= ruleModuleKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAccessUsageAccess().getModule_kindModuleKindEnumRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_50);
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
                      						"org.omg.qvt13.myqvto.MyQvto.ModuleKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:3615:3: ( (lv_moduleref_list_3_0= ruleModuleRefGO ) )
            // InternalMyQvto.g:3616:4: (lv_moduleref_list_3_0= ruleModuleRefGO )
            {
            // InternalMyQvto.g:3616:4: (lv_moduleref_list_3_0= ruleModuleRefGO )
            // InternalMyQvto.g:3617:5: lv_moduleref_list_3_0= ruleModuleRefGO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAccessUsageAccess().getModuleref_listModuleRefGOParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_35);
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
              						"org.omg.qvt13.myqvto.MyQvto.ModuleRefGO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3634:3: (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==14) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalMyQvto.g:3635:4: otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getAccessUsageAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalMyQvto.g:3639:4: ( (lv_moduleref_list_5_0= ruleModuleRefGO ) )
            	    // InternalMyQvto.g:3640:5: (lv_moduleref_list_5_0= ruleModuleRefGO )
            	    {
            	    // InternalMyQvto.g:3640:5: (lv_moduleref_list_5_0= ruleModuleRefGO )
            	    // InternalMyQvto.g:3641:6: lv_moduleref_list_5_0= ruleModuleRefGO
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAccessUsageAccess().getModuleref_listModuleRefGOParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
            	      							"org.omg.qvt13.myqvto.MyQvto.ModuleRefGO");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
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
    // InternalMyQvto.g:3663:1: entryRuleExtendsUsage returns [EObject current=null] : iv_ruleExtendsUsage= ruleExtendsUsage EOF ;
    public final EObject entryRuleExtendsUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsUsage = null;


        try {
            // InternalMyQvto.g:3663:53: (iv_ruleExtendsUsage= ruleExtendsUsage EOF )
            // InternalMyQvto.g:3664:2: iv_ruleExtendsUsage= ruleExtendsUsage EOF
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
    // InternalMyQvto.g:3670:1: ruleExtendsUsage returns [EObject current=null] : ( () otherlv_1= 'extends' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* ) ;
    public final EObject ruleExtendsUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_module_kind_2_0 = null;

        EObject lv_moduleref_list_3_0 = null;

        EObject lv_moduleref_list_5_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3676:2: ( ( () otherlv_1= 'extends' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* ) )
            // InternalMyQvto.g:3677:2: ( () otherlv_1= 'extends' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* )
            {
            // InternalMyQvto.g:3677:2: ( () otherlv_1= 'extends' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )* )
            // InternalMyQvto.g:3678:3: () otherlv_1= 'extends' ( (lv_module_kind_2_0= ruleModuleKind ) )? ( (lv_moduleref_list_3_0= ruleModuleRefGO ) ) (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )*
            {
            // InternalMyQvto.g:3678:3: ()
            // InternalMyQvto.g:3679:4: 
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

            otherlv_1=(Token)match(input,42,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExtendsUsageAccess().getExtendsKeyword_1());
              		
            }
            // InternalMyQvto.g:3692:3: ( (lv_module_kind_2_0= ruleModuleKind ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==40||LA71_0==46) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyQvto.g:3693:4: (lv_module_kind_2_0= ruleModuleKind )
                    {
                    // InternalMyQvto.g:3693:4: (lv_module_kind_2_0= ruleModuleKind )
                    // InternalMyQvto.g:3694:5: lv_module_kind_2_0= ruleModuleKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExtendsUsageAccess().getModule_kindModuleKindEnumRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_50);
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
                      						"org.omg.qvt13.myqvto.MyQvto.ModuleKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:3711:3: ( (lv_moduleref_list_3_0= ruleModuleRefGO ) )
            // InternalMyQvto.g:3712:4: (lv_moduleref_list_3_0= ruleModuleRefGO )
            {
            // InternalMyQvto.g:3712:4: (lv_moduleref_list_3_0= ruleModuleRefGO )
            // InternalMyQvto.g:3713:5: lv_moduleref_list_3_0= ruleModuleRefGO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExtendsUsageAccess().getModuleref_listModuleRefGOParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_35);
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
              						"org.omg.qvt13.myqvto.MyQvto.ModuleRefGO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3730:3: (otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==14) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalMyQvto.g:3731:4: otherlv_4= ',' ( (lv_moduleref_list_5_0= ruleModuleRefGO ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getExtendsUsageAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalMyQvto.g:3735:4: ( (lv_moduleref_list_5_0= ruleModuleRefGO ) )
            	    // InternalMyQvto.g:3736:5: (lv_moduleref_list_5_0= ruleModuleRefGO )
            	    {
            	    // InternalMyQvto.g:3736:5: (lv_moduleref_list_5_0= ruleModuleRefGO )
            	    // InternalMyQvto.g:3737:6: lv_moduleref_list_5_0= ruleModuleRefGO
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExtendsUsageAccess().getModuleref_listModuleRefGOParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
            	      							"org.omg.qvt13.myqvto.MyQvto.ModuleRefGO");
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
    // $ANTLR end "ruleExtendsUsage"


    // $ANTLR start "entryRuleModuleRefGO"
    // InternalMyQvto.g:3759:1: entryRuleModuleRefGO returns [EObject current=null] : iv_ruleModuleRefGO= ruleModuleRefGO EOF ;
    public final EObject entryRuleModuleRefGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleRefGO = null;


        try {
            // InternalMyQvto.g:3759:52: (iv_ruleModuleRefGO= ruleModuleRefGO EOF )
            // InternalMyQvto.g:3760:2: iv_ruleModuleRefGO= ruleModuleRefGO EOF
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
    // InternalMyQvto.g:3766:1: ruleModuleRefGO returns [EObject current=null] : ( ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_1_0= ruleSimpleSignature ) )? ) ;
    public final EObject ruleModuleRefGO() throws RecognitionException {
        EObject current = null;

        EObject lv_scoped_identifier_0_0 = null;

        EObject lv_simple_signature_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3772:2: ( ( ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_1_0= ruleSimpleSignature ) )? ) )
            // InternalMyQvto.g:3773:2: ( ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_1_0= ruleSimpleSignature ) )? )
            {
            // InternalMyQvto.g:3773:2: ( ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_1_0= ruleSimpleSignature ) )? )
            // InternalMyQvto.g:3774:3: ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) ) ( (lv_simple_signature_1_0= ruleSimpleSignature ) )?
            {
            // InternalMyQvto.g:3774:3: ( (lv_scoped_identifier_0_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:3775:4: (lv_scoped_identifier_0_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:3775:4: (lv_scoped_identifier_0_0= ruleScopedIdentifier )
            // InternalMyQvto.g:3776:5: lv_scoped_identifier_0_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModuleRefGOAccess().getScoped_identifierScopedIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
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
              						"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3793:3: ( (lv_simple_signature_1_0= ruleSimpleSignature ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==35) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalMyQvto.g:3794:4: (lv_simple_signature_1_0= ruleSimpleSignature )
                    {
                    // InternalMyQvto.g:3794:4: (lv_simple_signature_1_0= ruleSimpleSignature )
                    // InternalMyQvto.g:3795:5: lv_simple_signature_1_0= ruleSimpleSignature
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
                      						"org.omg.qvt13.myqvto.MyQvto.SimpleSignature");
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


    // $ANTLR start "entryRuleMappingFullHeader"
    // InternalMyQvto.g:3816:1: entryRuleMappingFullHeader returns [EObject current=null] : iv_ruleMappingFullHeader= ruleMappingFullHeader EOF ;
    public final EObject entryRuleMappingFullHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingFullHeader = null;


        try {
            // InternalMyQvto.g:3816:58: (iv_ruleMappingFullHeader= ruleMappingFullHeader EOF )
            // InternalMyQvto.g:3817:2: iv_ruleMappingFullHeader= ruleMappingFullHeader EOF
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
    // InternalMyQvto.g:3823:1: ruleMappingFullHeader returns [EObject current=null] : ( ( (lv_mapping_header_0_0= ruleMappingHeader ) ) (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )? (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )? ) ;
    public final EObject ruleMappingFullHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mapping_header_0_0 = null;

        EObject lv_when_2_0 = null;

        EObject lv_where_4_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:3829:2: ( ( ( (lv_mapping_header_0_0= ruleMappingHeader ) ) (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )? (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )? ) )
            // InternalMyQvto.g:3830:2: ( ( (lv_mapping_header_0_0= ruleMappingHeader ) ) (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )? (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )? )
            {
            // InternalMyQvto.g:3830:2: ( ( (lv_mapping_header_0_0= ruleMappingHeader ) ) (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )? (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )? )
            // InternalMyQvto.g:3831:3: ( (lv_mapping_header_0_0= ruleMappingHeader ) ) (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )? (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )?
            {
            // InternalMyQvto.g:3831:3: ( (lv_mapping_header_0_0= ruleMappingHeader ) )
            // InternalMyQvto.g:3832:4: (lv_mapping_header_0_0= ruleMappingHeader )
            {
            // InternalMyQvto.g:3832:4: (lv_mapping_header_0_0= ruleMappingHeader )
            // InternalMyQvto.g:3833:5: lv_mapping_header_0_0= ruleMappingHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingFullHeaderAccess().getMapping_headerMappingHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_51);
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
              						"org.omg.qvt13.myqvto.MyQvto.MappingHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3850:3: (otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==43) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMyQvto.g:3851:4: otherlv_1= 'when' ( (lv_when_2_0= ruleExpressionBlock ) )
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMappingFullHeaderAccess().getWhenKeyword_1_0());
                      			
                    }
                    // InternalMyQvto.g:3855:4: ( (lv_when_2_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:3856:5: (lv_when_2_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:3856:5: (lv_when_2_0= ruleExpressionBlock )
                    // InternalMyQvto.g:3857:6: lv_when_2_0= ruleExpressionBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMappingFullHeaderAccess().getWhenExpressionBlockParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
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
                      							"org.omg.qvt13.myqvto.MyQvto.ExpressionBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMyQvto.g:3875:3: (otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==19) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyQvto.g:3876:4: otherlv_3= 'where' ( (lv_where_4_0= ruleExpressionBlock ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMappingFullHeaderAccess().getWhereKeyword_2_0());
                      			
                    }
                    // InternalMyQvto.g:3880:4: ( (lv_where_4_0= ruleExpressionBlock ) )
                    // InternalMyQvto.g:3881:5: (lv_where_4_0= ruleExpressionBlock )
                    {
                    // InternalMyQvto.g:3881:5: (lv_where_4_0= ruleExpressionBlock )
                    // InternalMyQvto.g:3882:6: lv_where_4_0= ruleExpressionBlock
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
                      							"org.omg.qvt13.myqvto.MyQvto.ExpressionBlock");
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
    // InternalMyQvto.g:3904:1: entryRuleMappingHeader returns [EObject current=null] : iv_ruleMappingHeader= ruleMappingHeader EOF ;
    public final EObject entryRuleMappingHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingHeader = null;


        try {
            // InternalMyQvto.g:3904:54: (iv_ruleMappingHeader= ruleMappingHeader EOF )
            // InternalMyQvto.g:3905:2: iv_ruleMappingHeader= ruleMappingHeader EOF
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
    // InternalMyQvto.g:3911:1: ruleMappingHeader returns [EObject current=null] : ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'mapping' ( (lv_param_direction_2_0= ruleDirectionKind ) )? ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ( (lv_mapping_extra_5_0= ruleMappingExtra ) )* ) ;
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
            // InternalMyQvto.g:3917:2: ( ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'mapping' ( (lv_param_direction_2_0= ruleDirectionKind ) )? ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ( (lv_mapping_extra_5_0= ruleMappingExtra ) )* ) )
            // InternalMyQvto.g:3918:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'mapping' ( (lv_param_direction_2_0= ruleDirectionKind ) )? ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ( (lv_mapping_extra_5_0= ruleMappingExtra ) )* )
            {
            // InternalMyQvto.g:3918:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'mapping' ( (lv_param_direction_2_0= ruleDirectionKind ) )? ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ( (lv_mapping_extra_5_0= ruleMappingExtra ) )* )
            // InternalMyQvto.g:3919:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'mapping' ( (lv_param_direction_2_0= ruleDirectionKind ) )? ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) ) ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ( (lv_mapping_extra_5_0= ruleMappingExtra ) )*
            {
            // InternalMyQvto.g:3919:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=70 && LA76_0<=72)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalMyQvto.g:3920:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    {
            	    // InternalMyQvto.g:3920:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    // InternalMyQvto.g:3921:5: lv_qualifier_0_0= ruleGeneralQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMappingHeaderAccess().getQualifierGeneralQualifierEnumRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_53);
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
            	      						"org.omg.qvt13.myqvto.MyQvto.GeneralQualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_1=(Token)match(input,44,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMappingHeaderAccess().getMappingKeyword_1());
              		
            }
            // InternalMyQvto.g:3942:3: ( (lv_param_direction_2_0= ruleDirectionKind ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=61 && LA77_0<=63)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalMyQvto.g:3943:4: (lv_param_direction_2_0= ruleDirectionKind )
                    {
                    // InternalMyQvto.g:3943:4: (lv_param_direction_2_0= ruleDirectionKind )
                    // InternalMyQvto.g:3944:5: lv_param_direction_2_0= ruleDirectionKind
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
                      						"org.omg.qvt13.myqvto.MyQvto.DirectionKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:3961:3: ( (lv_scoped_identifier_3_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:3962:4: (lv_scoped_identifier_3_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:3962:4: (lv_scoped_identifier_3_0= ruleScopedIdentifier )
            // InternalMyQvto.g:3963:5: lv_scoped_identifier_3_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingHeaderAccess().getScoped_identifierScopedIdentifierParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_29);
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
              						"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3980:3: ( (lv_complete_signature_4_0= ruleCompleteSignature ) )
            // InternalMyQvto.g:3981:4: (lv_complete_signature_4_0= ruleCompleteSignature )
            {
            // InternalMyQvto.g:3981:4: (lv_complete_signature_4_0= ruleCompleteSignature )
            // InternalMyQvto.g:3982:5: lv_complete_signature_4_0= ruleCompleteSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingHeaderAccess().getComplete_signatureCompleteSignatureParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_55);
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
              						"org.omg.qvt13.myqvto.MyQvto.CompleteSignature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:3999:3: ( (lv_mapping_extra_5_0= ruleMappingExtra ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==45||(LA78_0>=79 && LA78_0<=81)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalMyQvto.g:4000:4: (lv_mapping_extra_5_0= ruleMappingExtra )
            	    {
            	    // InternalMyQvto.g:4000:4: (lv_mapping_extra_5_0= ruleMappingExtra )
            	    // InternalMyQvto.g:4001:5: lv_mapping_extra_5_0= ruleMappingExtra
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMappingHeaderAccess().getMapping_extraMappingExtraParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_55);
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
            	      						"org.omg.qvt13.myqvto.MyQvto.MappingExtra");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
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
    // InternalMyQvto.g:4022:1: entryRuleMappingExtra returns [EObject current=null] : iv_ruleMappingExtra= ruleMappingExtra EOF ;
    public final EObject entryRuleMappingExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingExtra = null;


        try {
            // InternalMyQvto.g:4022:53: (iv_ruleMappingExtra= ruleMappingExtra EOF )
            // InternalMyQvto.g:4023:2: iv_ruleMappingExtra= ruleMappingExtra EOF
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
    // InternalMyQvto.g:4029:1: ruleMappingExtra returns [EObject current=null] : ( ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) ) | ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) ) ) ;
    public final EObject ruleMappingExtra() throws RecognitionException {
        EObject current = null;

        EObject lv_mapping_extension_1_0 = null;

        EObject lv_mapping_refinement_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4035:2: ( ( ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) ) | ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) ) ) )
            // InternalMyQvto.g:4036:2: ( ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) ) | ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) ) )
            {
            // InternalMyQvto.g:4036:2: ( ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) ) | ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=79 && LA79_0<=81)) ) {
                alt79=1;
            }
            else if ( (LA79_0==45) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalMyQvto.g:4037:3: ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) )
                    {
                    // InternalMyQvto.g:4037:3: ( () ( (lv_mapping_extension_1_0= ruleMappingExtension ) ) )
                    // InternalMyQvto.g:4038:4: () ( (lv_mapping_extension_1_0= ruleMappingExtension ) )
                    {
                    // InternalMyQvto.g:4038:4: ()
                    // InternalMyQvto.g:4039:5: 
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

                    // InternalMyQvto.g:4048:4: ( (lv_mapping_extension_1_0= ruleMappingExtension ) )
                    // InternalMyQvto.g:4049:5: (lv_mapping_extension_1_0= ruleMappingExtension )
                    {
                    // InternalMyQvto.g:4049:5: (lv_mapping_extension_1_0= ruleMappingExtension )
                    // InternalMyQvto.g:4050:6: lv_mapping_extension_1_0= ruleMappingExtension
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
                      							"org.omg.qvt13.myqvto.MyQvto.MappingExtension");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:4069:3: ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) )
                    {
                    // InternalMyQvto.g:4069:3: ( (lv_mapping_refinement_2_0= ruleMappingRefinement ) )
                    // InternalMyQvto.g:4070:4: (lv_mapping_refinement_2_0= ruleMappingRefinement )
                    {
                    // InternalMyQvto.g:4070:4: (lv_mapping_refinement_2_0= ruleMappingRefinement )
                    // InternalMyQvto.g:4071:5: lv_mapping_refinement_2_0= ruleMappingRefinement
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
                      						"org.omg.qvt13.myqvto.MyQvto.MappingRefinement");
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
    // InternalMyQvto.g:4092:1: entryRuleMappingExtension returns [EObject current=null] : iv_ruleMappingExtension= ruleMappingExtension EOF ;
    public final EObject entryRuleMappingExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingExtension = null;


        try {
            // InternalMyQvto.g:4092:57: (iv_ruleMappingExtension= ruleMappingExtension EOF )
            // InternalMyQvto.g:4093:2: iv_ruleMappingExtension= ruleMappingExtension EOF
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
    // InternalMyQvto.g:4099:1: ruleMappingExtension returns [EObject current=null] : ( ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) ) ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) ) ;
    public final EObject ruleMappingExtension() throws RecognitionException {
        EObject current = null;

        Enumerator lv_mapping_extension_key_0_0 = null;

        EObject lv_scoped_identifier_list_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4105:2: ( ( ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) ) ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) ) )
            // InternalMyQvto.g:4106:2: ( ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) ) ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) )
            {
            // InternalMyQvto.g:4106:2: ( ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) ) ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) )
            // InternalMyQvto.g:4107:3: ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) ) ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) )
            {
            // InternalMyQvto.g:4107:3: ( (lv_mapping_extension_key_0_0= ruleMappingExtensionKey ) )
            // InternalMyQvto.g:4108:4: (lv_mapping_extension_key_0_0= ruleMappingExtensionKey )
            {
            // InternalMyQvto.g:4108:4: (lv_mapping_extension_key_0_0= ruleMappingExtensionKey )
            // InternalMyQvto.g:4109:5: lv_mapping_extension_key_0_0= ruleMappingExtensionKey
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
              						"org.omg.qvt13.myqvto.MyQvto.MappingExtensionKey");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4126:3: ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) )
            // InternalMyQvto.g:4127:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList )
            {
            // InternalMyQvto.g:4127:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList )
            // InternalMyQvto.g:4128:5: lv_scoped_identifier_list_1_0= ruleScopedIdentifierList
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
              						"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifierList");
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
    // InternalMyQvto.g:4149:1: entryRuleMappingRefinement returns [EObject current=null] : iv_ruleMappingRefinement= ruleMappingRefinement EOF ;
    public final EObject entryRuleMappingRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRefinement = null;


        try {
            // InternalMyQvto.g:4149:58: (iv_ruleMappingRefinement= ruleMappingRefinement EOF )
            // InternalMyQvto.g:4150:2: iv_ruleMappingRefinement= ruleMappingRefinement EOF
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
    // InternalMyQvto.g:4156:1: ruleMappingRefinement returns [EObject current=null] : (otherlv_0= 'refines' ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) ;
    public final EObject ruleMappingRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_scoped_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4162:2: ( (otherlv_0= 'refines' ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ) )
            // InternalMyQvto.g:4163:2: (otherlv_0= 'refines' ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) )
            {
            // InternalMyQvto.g:4163:2: (otherlv_0= 'refines' ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) )
            // InternalMyQvto.g:4164:3: otherlv_0= 'refines' ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMappingRefinementAccess().getRefinesKeyword_0());
              		
            }
            // InternalMyQvto.g:4168:3: ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:4169:4: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:4169:4: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
            // InternalMyQvto.g:4170:5: lv_scoped_identifier_1_0= ruleScopedIdentifier
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
              						"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
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
    // InternalMyQvto.g:4191:1: entryRuleScopedIdentifierList returns [EObject current=null] : iv_ruleScopedIdentifierList= ruleScopedIdentifierList EOF ;
    public final EObject entryRuleScopedIdentifierList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopedIdentifierList = null;


        try {
            // InternalMyQvto.g:4191:61: (iv_ruleScopedIdentifierList= ruleScopedIdentifierList EOF )
            // InternalMyQvto.g:4192:2: iv_ruleScopedIdentifierList= ruleScopedIdentifierList EOF
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
    // InternalMyQvto.g:4198:1: ruleScopedIdentifierList returns [EObject current=null] : ( () ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) ) (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )* ) ;
    public final EObject ruleScopedIdentifierList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_scoped_identifier_list_1_0 = null;

        EObject lv_scoped_identifier_list_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4204:2: ( ( () ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) ) (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )* ) )
            // InternalMyQvto.g:4205:2: ( () ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) ) (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )* )
            {
            // InternalMyQvto.g:4205:2: ( () ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) ) (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )* )
            // InternalMyQvto.g:4206:3: () ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) ) (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )*
            {
            // InternalMyQvto.g:4206:3: ()
            // InternalMyQvto.g:4207:4: 
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

            // InternalMyQvto.g:4216:3: ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:4217:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:4217:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifier )
            // InternalMyQvto.g:4218:5: lv_scoped_identifier_list_1_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScopedIdentifierListAccess().getScoped_identifier_listScopedIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
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
              						"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4235:3: (otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==14) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalMyQvto.g:4236:4: otherlv_2= ',' ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getScopedIdentifierListAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:4240:4: ( (lv_scoped_identifier_list_3_0= ruleScopedIdentifier ) )
            	    // InternalMyQvto.g:4241:5: (lv_scoped_identifier_list_3_0= ruleScopedIdentifier )
            	    {
            	    // InternalMyQvto.g:4241:5: (lv_scoped_identifier_list_3_0= ruleScopedIdentifier )
            	    // InternalMyQvto.g:4242:6: lv_scoped_identifier_list_3_0= ruleScopedIdentifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getScopedIdentifierListAccess().getScoped_identifier_listScopedIdentifierParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
            	      							"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
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


    // $ANTLR start "entryRuleTransformationHeader"
    // InternalMyQvto.g:4264:1: entryRuleTransformationHeader returns [EObject current=null] : iv_ruleTransformationHeader= ruleTransformationHeader EOF ;
    public final EObject entryRuleTransformationHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationHeader = null;


        try {
            // InternalMyQvto.g:4264:61: (iv_ruleTransformationHeader= ruleTransformationHeader EOF )
            // InternalMyQvto.g:4265:2: iv_ruleTransformationHeader= ruleTransformationHeader EOF
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
    // InternalMyQvto.g:4271:1: ruleTransformationHeader returns [EObject current=null] : ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'transformation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_transformation_signature_3_0= ruleSimpleSignature ) ) ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )? ) ;
    public final EObject ruleTransformationHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Enumerator lv_qualifier_0_0 = null;

        EObject lv_transformation_signature_3_0 = null;

        EObject lv_transformation_usage_refine_4_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4277:2: ( ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'transformation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_transformation_signature_3_0= ruleSimpleSignature ) ) ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )? ) )
            // InternalMyQvto.g:4278:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'transformation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_transformation_signature_3_0= ruleSimpleSignature ) ) ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )? )
            {
            // InternalMyQvto.g:4278:2: ( ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'transformation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_transformation_signature_3_0= ruleSimpleSignature ) ) ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )? )
            // InternalMyQvto.g:4279:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )* otherlv_1= 'transformation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_transformation_signature_3_0= ruleSimpleSignature ) ) ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )?
            {
            // InternalMyQvto.g:4279:3: ( (lv_qualifier_0_0= ruleGeneralQualifier ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( ((LA81_0>=70 && LA81_0<=72)) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalMyQvto.g:4280:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    {
            	    // InternalMyQvto.g:4280:4: (lv_qualifier_0_0= ruleGeneralQualifier )
            	    // InternalMyQvto.g:4281:5: lv_qualifier_0_0= ruleGeneralQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTransformationHeaderAccess().getQualifierGeneralQualifierEnumRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_56);
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
            	      						"org.omg.qvt13.myqvto.MyQvto.GeneralQualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            otherlv_1=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTransformationHeaderAccess().getTransformationKeyword_1());
              		
            }
            // InternalMyQvto.g:4302:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyQvto.g:4303:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyQvto.g:4303:4: (lv_name_2_0= RULE_ID )
            // InternalMyQvto.g:4304:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
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

            // InternalMyQvto.g:4320:3: ( (lv_transformation_signature_3_0= ruleSimpleSignature ) )
            // InternalMyQvto.g:4321:4: (lv_transformation_signature_3_0= ruleSimpleSignature )
            {
            // InternalMyQvto.g:4321:4: (lv_transformation_signature_3_0= ruleSimpleSignature )
            // InternalMyQvto.g:4322:5: lv_transformation_signature_3_0= ruleSimpleSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransformationHeaderAccess().getTransformation_signatureSimpleSignatureParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_57);
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
              						"org.omg.qvt13.myqvto.MyQvto.SimpleSignature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4339:3: ( (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=41 && LA82_0<=42)||LA82_0==45) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalMyQvto.g:4340:4: (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine )
                    {
                    // InternalMyQvto.g:4340:4: (lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine )
                    // InternalMyQvto.g:4341:5: lv_transformation_usage_refine_4_0= ruleTransformationUsageRefine
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
                      						"org.omg.qvt13.myqvto.MyQvto.TransformationUsageRefine");
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
    // InternalMyQvto.g:4362:1: entryRuleTransformationUsageRefine returns [EObject current=null] : iv_ruleTransformationUsageRefine= ruleTransformationUsageRefine EOF ;
    public final EObject entryRuleTransformationUsageRefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationUsageRefine = null;


        try {
            // InternalMyQvto.g:4362:66: (iv_ruleTransformationUsageRefine= ruleTransformationUsageRefine EOF )
            // InternalMyQvto.g:4363:2: iv_ruleTransformationUsageRefine= ruleTransformationUsageRefine EOF
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
    // InternalMyQvto.g:4369:1: ruleTransformationUsageRefine returns [EObject current=null] : ( ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) ) | (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) ) ) ;
    public final EObject ruleTransformationUsageRefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_module_usage_1_0 = null;

        EObject lv_transformation_refine_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4375:2: ( ( ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) ) | (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) ) ) )
            // InternalMyQvto.g:4376:2: ( ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) ) | (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) ) )
            {
            // InternalMyQvto.g:4376:2: ( ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) ) | (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=41 && LA83_0<=42)) ) {
                alt83=1;
            }
            else if ( (LA83_0==45) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalMyQvto.g:4377:3: ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) )
                    {
                    // InternalMyQvto.g:4377:3: ( () ( (lv_module_usage_1_0= ruleModuleUsageGO ) ) )
                    // InternalMyQvto.g:4378:4: () ( (lv_module_usage_1_0= ruleModuleUsageGO ) )
                    {
                    // InternalMyQvto.g:4378:4: ()
                    // InternalMyQvto.g:4379:5: 
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

                    // InternalMyQvto.g:4388:4: ( (lv_module_usage_1_0= ruleModuleUsageGO ) )
                    // InternalMyQvto.g:4389:5: (lv_module_usage_1_0= ruleModuleUsageGO )
                    {
                    // InternalMyQvto.g:4389:5: (lv_module_usage_1_0= ruleModuleUsageGO )
                    // InternalMyQvto.g:4390:6: lv_module_usage_1_0= ruleModuleUsageGO
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
                      							"org.omg.qvt13.myqvto.MyQvto.ModuleUsageGO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:4409:3: (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) )
                    {
                    // InternalMyQvto.g:4409:3: (otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) ) )
                    // InternalMyQvto.g:4410:4: otherlv_2= 'refines' ( (lv_transformation_refine_3_0= ruleModuleRefGO ) )
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTransformationUsageRefineAccess().getRefinesKeyword_1_0());
                      			
                    }
                    // InternalMyQvto.g:4414:4: ( (lv_transformation_refine_3_0= ruleModuleRefGO ) )
                    // InternalMyQvto.g:4415:5: (lv_transformation_refine_3_0= ruleModuleRefGO )
                    {
                    // InternalMyQvto.g:4415:5: (lv_transformation_refine_3_0= ruleModuleRefGO )
                    // InternalMyQvto.g:4416:6: lv_transformation_refine_3_0= ruleModuleRefGO
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
                      							"org.omg.qvt13.myqvto.MyQvto.ModuleRefGO");
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


    // $ANTLR start "entryRuleMetaModelHeader"
    // InternalMyQvto.g:4438:1: entryRuleMetaModelHeader returns [EObject current=null] : iv_ruleMetaModelHeader= ruleMetaModelHeader EOF ;
    public final EObject entryRuleMetaModelHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModelHeader = null;


        try {
            // InternalMyQvto.g:4438:56: (iv_ruleMetaModelHeader= ruleMetaModelHeader EOF )
            // InternalMyQvto.g:4439:2: iv_ruleMetaModelHeader= ruleMetaModelHeader EOF
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
    // InternalMyQvto.g:4445:1: ruleMetaModelHeader returns [EObject current=null] : ( (otherlv_0= 'metamodel' | otherlv_1= 'package' ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ) ;
    public final EObject ruleMetaModelHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_scoped_identifier_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4451:2: ( ( (otherlv_0= 'metamodel' | otherlv_1= 'package' ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) ) )
            // InternalMyQvto.g:4452:2: ( (otherlv_0= 'metamodel' | otherlv_1= 'package' ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) )
            {
            // InternalMyQvto.g:4452:2: ( (otherlv_0= 'metamodel' | otherlv_1= 'package' ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) )
            // InternalMyQvto.g:4453:3: (otherlv_0= 'metamodel' | otherlv_1= 'package' ) ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) )
            {
            // InternalMyQvto.g:4453:3: (otherlv_0= 'metamodel' | otherlv_1= 'package' )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==47) ) {
                alt84=1;
            }
            else if ( (LA84_0==48) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalMyQvto.g:4454:4: otherlv_0= 'metamodel'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getMetaModelHeaderAccess().getMetamodelKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:4459:4: otherlv_1= 'package'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMetaModelHeaderAccess().getPackageKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalMyQvto.g:4464:3: ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:4465:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:4465:4: (lv_scoped_identifier_2_0= ruleScopedIdentifier )
            // InternalMyQvto.g:4466:5: lv_scoped_identifier_2_0= ruleScopedIdentifier
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
              						"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
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
    // InternalMyQvto.g:4487:1: entryRuleMetaModelElement returns [EObject current=null] : iv_ruleMetaModelElement= ruleMetaModelElement EOF ;
    public final EObject entryRuleMetaModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModelElement = null;


        try {
            // InternalMyQvto.g:4487:57: (iv_ruleMetaModelElement= ruleMetaModelElement EOF )
            // InternalMyQvto.g:4488:2: iv_ruleMetaModelElement= ruleMetaModelElement EOF
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
    // InternalMyQvto.g:4494:1: ruleMetaModelElement returns [EObject current=null] : ( ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) ) | ( (lv_enumeration_2_0= ruleEnumerationGO ) ) | ( (lv_tag_3_0= ruleTagGO ) ) ) ;
    public final EObject ruleMetaModelElement() throws RecognitionException {
        EObject current = null;

        EObject lv_classifier_1_0 = null;

        EObject lv_enumeration_2_0 = null;

        EObject lv_tag_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4500:2: ( ( ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) ) | ( (lv_enumeration_2_0= ruleEnumerationGO ) ) | ( (lv_tag_3_0= ruleTagGO ) ) ) )
            // InternalMyQvto.g:4501:2: ( ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) ) | ( (lv_enumeration_2_0= ruleEnumerationGO ) ) | ( (lv_tag_3_0= ruleTagGO ) ) )
            {
            // InternalMyQvto.g:4501:2: ( ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) ) | ( (lv_enumeration_2_0= ruleEnumerationGO ) ) | ( (lv_tag_3_0= ruleTagGO ) ) )
            int alt85=3;
            switch ( input.LA(1) ) {
            case 20:
            case 50:
            case 51:
            case 52:
            case 53:
            case 70:
            case 71:
            case 72:
                {
                alt85=1;
                }
                break;
            case 49:
                {
                alt85=2;
                }
                break;
            case 24:
                {
                alt85=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalMyQvto.g:4502:3: ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) )
                    {
                    // InternalMyQvto.g:4502:3: ( () ( (lv_classifier_1_0= ruleClassifierGO ) ) )
                    // InternalMyQvto.g:4503:4: () ( (lv_classifier_1_0= ruleClassifierGO ) )
                    {
                    // InternalMyQvto.g:4503:4: ()
                    // InternalMyQvto.g:4504:5: 
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

                    // InternalMyQvto.g:4513:4: ( (lv_classifier_1_0= ruleClassifierGO ) )
                    // InternalMyQvto.g:4514:5: (lv_classifier_1_0= ruleClassifierGO )
                    {
                    // InternalMyQvto.g:4514:5: (lv_classifier_1_0= ruleClassifierGO )
                    // InternalMyQvto.g:4515:6: lv_classifier_1_0= ruleClassifierGO
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
                      							"org.omg.qvt13.myqvto.MyQvto.ClassifierGO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:4534:3: ( (lv_enumeration_2_0= ruleEnumerationGO ) )
                    {
                    // InternalMyQvto.g:4534:3: ( (lv_enumeration_2_0= ruleEnumerationGO ) )
                    // InternalMyQvto.g:4535:4: (lv_enumeration_2_0= ruleEnumerationGO )
                    {
                    // InternalMyQvto.g:4535:4: (lv_enumeration_2_0= ruleEnumerationGO )
                    // InternalMyQvto.g:4536:5: lv_enumeration_2_0= ruleEnumerationGO
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
                      						"org.omg.qvt13.myqvto.MyQvto.EnumerationGO");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:4554:3: ( (lv_tag_3_0= ruleTagGO ) )
                    {
                    // InternalMyQvto.g:4554:3: ( (lv_tag_3_0= ruleTagGO ) )
                    // InternalMyQvto.g:4555:4: (lv_tag_3_0= ruleTagGO )
                    {
                    // InternalMyQvto.g:4555:4: (lv_tag_3_0= ruleTagGO )
                    // InternalMyQvto.g:4556:5: lv_tag_3_0= ruleTagGO
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
                      						"org.omg.qvt13.myqvto.MyQvto.TagGO");
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
    // InternalMyQvto.g:4577:1: entryRuleEnumerationGO returns [EObject current=null] : iv_ruleEnumerationGO= ruleEnumerationGO EOF ;
    public final EObject entryRuleEnumerationGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationGO = null;


        try {
            // InternalMyQvto.g:4577:54: (iv_ruleEnumerationGO= ruleEnumerationGO EOF )
            // InternalMyQvto.g:4578:2: iv_ruleEnumerationGO= ruleEnumerationGO EOF
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
    // InternalMyQvto.g:4584:1: ruleEnumerationGO returns [EObject current=null] : ( () ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ) ) ;
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
            // InternalMyQvto.g:4590:2: ( ( () ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ) ) )
            // InternalMyQvto.g:4591:2: ( () ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ) )
            {
            // InternalMyQvto.g:4591:2: ( () ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ) )
            // InternalMyQvto.g:4592:3: () ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) )
            {
            // InternalMyQvto.g:4592:3: ()
            // InternalMyQvto.g:4593:4: 
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

            // InternalMyQvto.g:4602:3: ( (lv_enumeration_h_1_0= ruleEnumerationHeader ) )
            // InternalMyQvto.g:4603:4: (lv_enumeration_h_1_0= ruleEnumerationHeader )
            {
            // InternalMyQvto.g:4603:4: (lv_enumeration_h_1_0= ruleEnumerationHeader )
            // InternalMyQvto.g:4604:5: lv_enumeration_h_1_0= ruleEnumerationHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumerationGOAccess().getEnumeration_hEnumerationHeaderParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
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
              						"org.omg.qvt13.myqvto.MyQvto.EnumerationHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4621:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==16) ) {
                alt88=1;
            }
            else if ( (LA88_0==22) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalMyQvto.g:4622:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEnumerationGOAccess().getSemicolonKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:4627:4: (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
                    {
                    // InternalMyQvto.g:4627:4: (otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
                    // InternalMyQvto.g:4628:5: otherlv_3= '{' ( (lv_identifier_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )* otherlv_7= '}' (otherlv_8= ';' )?
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getEnumerationGOAccess().getLeftCurlyBracketKeyword_2_1_0());
                      				
                    }
                    // InternalMyQvto.g:4632:5: ( (lv_identifier_4_0= ruleEString ) )
                    // InternalMyQvto.g:4633:6: (lv_identifier_4_0= ruleEString )
                    {
                    // InternalMyQvto.g:4633:6: (lv_identifier_4_0= ruleEString )
                    // InternalMyQvto.g:4634:7: lv_identifier_4_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getEnumerationGOAccess().getIdentifierEStringParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_59);
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
                      								"org.omg.qvt13.myqvto.MyQvto.EString");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyQvto.g:4651:5: (otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==14) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalMyQvto.g:4652:6: otherlv_5= ',' ( (lv_identifier_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_58); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_5, grammarAccess.getEnumerationGOAccess().getCommaKeyword_2_1_2_0());
                    	      					
                    	    }
                    	    // InternalMyQvto.g:4656:6: ( (lv_identifier_6_0= ruleEString ) )
                    	    // InternalMyQvto.g:4657:7: (lv_identifier_6_0= ruleEString )
                    	    {
                    	    // InternalMyQvto.g:4657:7: (lv_identifier_6_0= ruleEString )
                    	    // InternalMyQvto.g:4658:8: lv_identifier_6_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getEnumerationGOAccess().getIdentifierEStringParserRuleCall_2_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_59);
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
                    	      									"org.omg.qvt13.myqvto.MyQvto.EString");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getEnumerationGOAccess().getRightCurlyBracketKeyword_2_1_3());
                      				
                    }
                    // InternalMyQvto.g:4680:5: (otherlv_8= ';' )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==16) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalMyQvto.g:4681:6: otherlv_8= ';'
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
    // InternalMyQvto.g:4692:1: entryRuleEnumerationHeader returns [EObject current=null] : iv_ruleEnumerationHeader= ruleEnumerationHeader EOF ;
    public final EObject entryRuleEnumerationHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationHeader = null;


        try {
            // InternalMyQvto.g:4692:58: (iv_ruleEnumerationHeader= ruleEnumerationHeader EOF )
            // InternalMyQvto.g:4693:2: iv_ruleEnumerationHeader= ruleEnumerationHeader EOF
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
    // InternalMyQvto.g:4699:1: ruleEnumerationHeader returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;


        	enterRule();

        try {
            // InternalMyQvto.g:4705:2: ( (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) ) )
            // InternalMyQvto.g:4706:2: (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) )
            {
            // InternalMyQvto.g:4706:2: (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) )
            // InternalMyQvto.g:4707:3: otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationHeaderAccess().getEnumKeyword_0());
              		
            }
            // InternalMyQvto.g:4711:3: ( (lv_identifier_1_0= RULE_ID ) )
            // InternalMyQvto.g:4712:4: (lv_identifier_1_0= RULE_ID )
            {
            // InternalMyQvto.g:4712:4: (lv_identifier_1_0= RULE_ID )
            // InternalMyQvto.g:4713:5: lv_identifier_1_0= RULE_ID
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
    // InternalMyQvto.g:4733:1: entryRuleClassifierHeader returns [EObject current=null] : iv_ruleClassifierHeader= ruleClassifierHeader EOF ;
    public final EObject entryRuleClassifierHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierHeader = null;


        try {
            // InternalMyQvto.g:4733:57: (iv_ruleClassifierHeader= ruleClassifierHeader EOF )
            // InternalMyQvto.g:4734:2: iv_ruleClassifierHeader= ruleClassifierHeader EOF
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
    // InternalMyQvto.g:4740:1: ruleClassifierHeader returns [EObject current=null] : ( ( (lv_classifier_info_0_0= ruleClassifierInfo ) ) ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )? ) ;
    public final EObject ruleClassifierHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_classifier_info_0_0 = null;

        EObject lv_scoped_identifier_1_0 = null;

        EObject lv_classifier_extension_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4746:2: ( ( ( (lv_classifier_info_0_0= ruleClassifierInfo ) ) ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )? ) )
            // InternalMyQvto.g:4747:2: ( ( (lv_classifier_info_0_0= ruleClassifierInfo ) ) ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )? )
            {
            // InternalMyQvto.g:4747:2: ( ( (lv_classifier_info_0_0= ruleClassifierInfo ) ) ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )? )
            // InternalMyQvto.g:4748:3: ( (lv_classifier_info_0_0= ruleClassifierInfo ) ) ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) ) ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )?
            {
            // InternalMyQvto.g:4748:3: ( (lv_classifier_info_0_0= ruleClassifierInfo ) )
            // InternalMyQvto.g:4749:4: (lv_classifier_info_0_0= ruleClassifierInfo )
            {
            // InternalMyQvto.g:4749:4: (lv_classifier_info_0_0= ruleClassifierInfo )
            // InternalMyQvto.g:4750:5: lv_classifier_info_0_0= ruleClassifierInfo
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
              						"org.omg.qvt13.myqvto.MyQvto.ClassifierInfo");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4767:3: ( (lv_scoped_identifier_1_0= ruleScopedIdentifier ) )
            // InternalMyQvto.g:4768:4: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
            {
            // InternalMyQvto.g:4768:4: (lv_scoped_identifier_1_0= ruleScopedIdentifier )
            // InternalMyQvto.g:4769:5: lv_scoped_identifier_1_0= ruleScopedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierHeaderAccess().getScoped_identifierScopedIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_60);
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
              						"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4786:3: ( (lv_classifier_extension_2_0= ruleClassifierExtension ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==42) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalMyQvto.g:4787:4: (lv_classifier_extension_2_0= ruleClassifierExtension )
                    {
                    // InternalMyQvto.g:4787:4: (lv_classifier_extension_2_0= ruleClassifierExtension )
                    // InternalMyQvto.g:4788:5: lv_classifier_extension_2_0= ruleClassifierExtension
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
                      						"org.omg.qvt13.myqvto.MyQvto.ClassifierExtension");
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
    // InternalMyQvto.g:4809:1: entryRuleClassifierFeatureList returns [EObject current=null] : iv_ruleClassifierFeatureList= ruleClassifierFeatureList EOF ;
    public final EObject entryRuleClassifierFeatureList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierFeatureList = null;


        try {
            // InternalMyQvto.g:4809:62: (iv_ruleClassifierFeatureList= ruleClassifierFeatureList EOF )
            // InternalMyQvto.g:4810:2: iv_ruleClassifierFeatureList= ruleClassifierFeatureList EOF
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
    // InternalMyQvto.g:4816:1: ruleClassifierFeatureList returns [EObject current=null] : ( () ( (lv_classifier_feature_1_0= ruleClassifierFeature ) ) (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )* (otherlv_4= ';' )? ) ;
    public final EObject ruleClassifierFeatureList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_classifier_feature_1_0 = null;

        EObject lv_classifier_feature_3_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4822:2: ( ( () ( (lv_classifier_feature_1_0= ruleClassifierFeature ) ) (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )* (otherlv_4= ';' )? ) )
            // InternalMyQvto.g:4823:2: ( () ( (lv_classifier_feature_1_0= ruleClassifierFeature ) ) (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )* (otherlv_4= ';' )? )
            {
            // InternalMyQvto.g:4823:2: ( () ( (lv_classifier_feature_1_0= ruleClassifierFeature ) ) (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )* (otherlv_4= ';' )? )
            // InternalMyQvto.g:4824:3: () ( (lv_classifier_feature_1_0= ruleClassifierFeature ) ) (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )* (otherlv_4= ';' )?
            {
            // InternalMyQvto.g:4824:3: ()
            // InternalMyQvto.g:4825:4: 
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

            // InternalMyQvto.g:4834:3: ( (lv_classifier_feature_1_0= ruleClassifierFeature ) )
            // InternalMyQvto.g:4835:4: (lv_classifier_feature_1_0= ruleClassifierFeature )
            {
            // InternalMyQvto.g:4835:4: (lv_classifier_feature_1_0= ruleClassifierFeature )
            // InternalMyQvto.g:4836:5: lv_classifier_feature_1_0= ruleClassifierFeature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierFeatureListAccess().getClassifier_featureClassifierFeatureParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
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
              						"org.omg.qvt13.myqvto.MyQvto.ClassifierFeature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyQvto.g:4853:3: (otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==16) ) {
                    int LA90_1 = input.LA(2);

                    if ( (LA90_1==RULE_ID||LA90_1==24||(LA90_1>=37 && LA90_1<=38)||LA90_1==58||(LA90_1>=64 && LA90_1<=69)||(LA90_1>=72 && LA90_1<=73)||(LA90_1>=82 && LA90_1<=84)) ) {
                        alt90=1;
                    }


                }


                switch (alt90) {
            	case 1 :
            	    // InternalMyQvto.g:4854:4: otherlv_2= ';' ( (lv_classifier_feature_3_0= ruleClassifierFeature ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getClassifierFeatureListAccess().getSemicolonKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:4858:4: ( (lv_classifier_feature_3_0= ruleClassifierFeature ) )
            	    // InternalMyQvto.g:4859:5: (lv_classifier_feature_3_0= ruleClassifierFeature )
            	    {
            	    // InternalMyQvto.g:4859:5: (lv_classifier_feature_3_0= ruleClassifierFeature )
            	    // InternalMyQvto.g:4860:6: lv_classifier_feature_3_0= ruleClassifierFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getClassifierFeatureListAccess().getClassifier_featureClassifierFeatureParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
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
            	      							"org.omg.qvt13.myqvto.MyQvto.ClassifierFeature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            // InternalMyQvto.g:4878:3: (otherlv_4= ';' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==16) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalMyQvto.g:4879:4: otherlv_4= ';'
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
    // InternalMyQvto.g:4888:1: entryRuleClassifierInfo returns [EObject current=null] : iv_ruleClassifierInfo= ruleClassifierInfo EOF ;
    public final EObject entryRuleClassifierInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierInfo = null;


        try {
            // InternalMyQvto.g:4888:55: (iv_ruleClassifierInfo= ruleClassifierInfo EOF )
            // InternalMyQvto.g:4889:2: iv_ruleClassifierInfo= ruleClassifierInfo EOF
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
    // InternalMyQvto.g:4895:1: ruleClassifierInfo returns [EObject current=null] : ( ( () otherlv_1= 'datatype' ) | otherlv_2= 'primitive' | otherlv_3= 'exception' | ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' ) ) ;
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
            // InternalMyQvto.g:4901:2: ( ( ( () otherlv_1= 'datatype' ) | otherlv_2= 'primitive' | otherlv_3= 'exception' | ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' ) ) )
            // InternalMyQvto.g:4902:2: ( ( () otherlv_1= 'datatype' ) | otherlv_2= 'primitive' | otherlv_3= 'exception' | ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' ) )
            {
            // InternalMyQvto.g:4902:2: ( ( () otherlv_1= 'datatype' ) | otherlv_2= 'primitive' | otherlv_3= 'exception' | ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' ) )
            int alt94=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt94=1;
                }
                break;
            case 51:
                {
                alt94=2;
                }
                break;
            case 52:
                {
                alt94=3;
                }
                break;
            case 20:
            case 53:
            case 70:
            case 71:
            case 72:
                {
                alt94=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalMyQvto.g:4903:3: ( () otherlv_1= 'datatype' )
                    {
                    // InternalMyQvto.g:4903:3: ( () otherlv_1= 'datatype' )
                    // InternalMyQvto.g:4904:4: () otherlv_1= 'datatype'
                    {
                    // InternalMyQvto.g:4904:4: ()
                    // InternalMyQvto.g:4905:5: 
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

                    otherlv_1=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getClassifierInfoAccess().getDatatypeKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:4920:3: otherlv_2= 'primitive'
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_2, grammarAccess.getClassifierInfoAccess().getPrimitiveKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:4925:3: otherlv_3= 'exception'
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_3, grammarAccess.getClassifierInfoAccess().getExceptionKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:4930:3: ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' )
                    {
                    // InternalMyQvto.g:4930:3: ( (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class' )
                    // InternalMyQvto.g:4931:4: (otherlv_4= 'intermediate' )? ( (lv_qualifier_5_0= ruleGeneralQualifier ) )* otherlv_6= 'class'
                    {
                    // InternalMyQvto.g:4931:4: (otherlv_4= 'intermediate' )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==20) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalMyQvto.g:4932:5: otherlv_4= 'intermediate'
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getClassifierInfoAccess().getIntermediateKeyword_3_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMyQvto.g:4937:4: ( (lv_qualifier_5_0= ruleGeneralQualifier ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( ((LA93_0>=70 && LA93_0<=72)) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalMyQvto.g:4938:5: (lv_qualifier_5_0= ruleGeneralQualifier )
                    	    {
                    	    // InternalMyQvto.g:4938:5: (lv_qualifier_5_0= ruleGeneralQualifier )
                    	    // InternalMyQvto.g:4939:6: lv_qualifier_5_0= ruleGeneralQualifier
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getClassifierInfoAccess().getQualifierGeneralQualifierEnumRuleCall_3_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_62);
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
                    	      							"org.omg.qvt13.myqvto.MyQvto.GeneralQualifier");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyQvto.g:4965:1: entryRuleClassifierExtension returns [EObject current=null] : iv_ruleClassifierExtension= ruleClassifierExtension EOF ;
    public final EObject entryRuleClassifierExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierExtension = null;


        try {
            // InternalMyQvto.g:4965:60: (iv_ruleClassifierExtension= ruleClassifierExtension EOF )
            // InternalMyQvto.g:4966:2: iv_ruleClassifierExtension= ruleClassifierExtension EOF
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
    // InternalMyQvto.g:4972:1: ruleClassifierExtension returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) ) ;
    public final EObject ruleClassifierExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_scoped_identifier_list_1_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:4978:2: ( (otherlv_0= 'extends' ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) ) )
            // InternalMyQvto.g:4979:2: (otherlv_0= 'extends' ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) )
            {
            // InternalMyQvto.g:4979:2: (otherlv_0= 'extends' ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) ) )
            // InternalMyQvto.g:4980:3: otherlv_0= 'extends' ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClassifierExtensionAccess().getExtendsKeyword_0());
              		
            }
            // InternalMyQvto.g:4984:3: ( (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList ) )
            // InternalMyQvto.g:4985:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList )
            {
            // InternalMyQvto.g:4985:4: (lv_scoped_identifier_list_1_0= ruleScopedIdentifierList )
            // InternalMyQvto.g:4986:5: lv_scoped_identifier_list_1_0= ruleScopedIdentifierList
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
              						"org.omg.qvt13.myqvto.MyQvto.ScopedIdentifierList");
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
    // InternalMyQvto.g:5007:1: entryRuleClassifierFeature returns [EObject current=null] : iv_ruleClassifierFeature= ruleClassifierFeature EOF ;
    public final EObject entryRuleClassifierFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierFeature = null;


        try {
            // InternalMyQvto.g:5007:58: (iv_ruleClassifierFeature= ruleClassifierFeature EOF )
            // InternalMyQvto.g:5008:2: iv_ruleClassifierFeature= ruleClassifierFeature EOF
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
    // InternalMyQvto.g:5014:1: ruleClassifierFeature returns [EObject current=null] : ( ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) ) | ( (lv_tag_5_0= ruleTagGO ) ) ) ;
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
            // InternalMyQvto.g:5020:2: ( ( ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) ) | ( (lv_tag_5_0= ruleTagGO ) ) ) )
            // InternalMyQvto.g:5021:2: ( ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) ) | ( (lv_tag_5_0= ruleTagGO ) ) )
            {
            // InternalMyQvto.g:5021:2: ( ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) ) | ( (lv_tag_5_0= ruleTagGO ) ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==EOF||LA99_0==RULE_ID||(LA99_0>=37 && LA99_0<=38)||LA99_0==58||(LA99_0>=64 && LA99_0<=69)||(LA99_0>=72 && LA99_0<=73)||(LA99_0>=82 && LA99_0<=84)) ) {
                alt99=1;
            }
            else if ( (LA99_0==24) ) {
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
                    // InternalMyQvto.g:5022:3: ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) )
                    {
                    // InternalMyQvto.g:5022:3: ( ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) ) )
                    // InternalMyQvto.g:5023:4: ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )? ( (lv_declarator_1_0= ruleDeclarator ) ) ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) )
                    {
                    // InternalMyQvto.g:5023:4: ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )?
                    int alt95=2;
                    alt95 = dfa95.predict(input);
                    switch (alt95) {
                        case 1 :
                            // InternalMyQvto.g:5024:5: (lv_feature_qualifier_0_0= ruleFeatureQualifier )
                            {
                            // InternalMyQvto.g:5024:5: (lv_feature_qualifier_0_0= ruleFeatureQualifier )
                            // InternalMyQvto.g:5025:6: lv_feature_qualifier_0_0= ruleFeatureQualifier
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getClassifierFeatureAccess().getFeature_qualifierFeatureQualifierParserRuleCall_0_0_0());
                              					
                            }
                            pushFollow(FOLLOW_27);
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
                              							"org.omg.qvt13.myqvto.MyQvto.FeatureQualifier");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalMyQvto.g:5042:4: ( (lv_declarator_1_0= ruleDeclarator ) )
                    // InternalMyQvto.g:5043:5: (lv_declarator_1_0= ruleDeclarator )
                    {
                    // InternalMyQvto.g:5043:5: (lv_declarator_1_0= ruleDeclarator )
                    // InternalMyQvto.g:5044:6: lv_declarator_1_0= ruleDeclarator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClassifierFeatureAccess().getDeclaratorDeclaratorParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_63);
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
                      							"org.omg.qvt13.myqvto.MyQvto.Declarator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyQvto.g:5061:4: ( ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? ) | ( (lv_complete_signature_4_0= ruleCompleteSignature ) ) )
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==EOF||LA98_0==16||LA98_0==23||LA98_0==54||LA98_0==56) ) {
                        alt98=1;
                    }
                    else if ( (LA98_0==35) ) {
                        alt98=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalMyQvto.g:5062:5: ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? )
                            {
                            // InternalMyQvto.g:5062:5: ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )? )
                            // InternalMyQvto.g:5063:6: ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_opposite_property_3_0= ruleOppositeProperty ) )?
                            {
                            // InternalMyQvto.g:5063:6: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
                            int alt96=2;
                            int LA96_0 = input.LA(1);

                            if ( (LA96_0==54) ) {
                                alt96=1;
                            }
                            switch (alt96) {
                                case 1 :
                                    // InternalMyQvto.g:5064:7: (lv_multiplicity_2_0= ruleMultiplicity )
                                    {
                                    // InternalMyQvto.g:5064:7: (lv_multiplicity_2_0= ruleMultiplicity )
                                    // InternalMyQvto.g:5065:8: lv_multiplicity_2_0= ruleMultiplicity
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getClassifierFeatureAccess().getMultiplicityMultiplicityParserRuleCall_0_2_0_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_64);
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
                                      									"org.omg.qvt13.myqvto.MyQvto.Multiplicity");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }

                            // InternalMyQvto.g:5082:6: ( (lv_opposite_property_3_0= ruleOppositeProperty ) )?
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( (LA97_0==56) ) {
                                alt97=1;
                            }
                            switch (alt97) {
                                case 1 :
                                    // InternalMyQvto.g:5083:7: (lv_opposite_property_3_0= ruleOppositeProperty )
                                    {
                                    // InternalMyQvto.g:5083:7: (lv_opposite_property_3_0= ruleOppositeProperty )
                                    // InternalMyQvto.g:5084:8: lv_opposite_property_3_0= ruleOppositeProperty
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
                                      									"org.omg.qvt13.myqvto.MyQvto.OppositeProperty");
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
                            // InternalMyQvto.g:5103:5: ( (lv_complete_signature_4_0= ruleCompleteSignature ) )
                            {
                            // InternalMyQvto.g:5103:5: ( (lv_complete_signature_4_0= ruleCompleteSignature ) )
                            // InternalMyQvto.g:5104:6: (lv_complete_signature_4_0= ruleCompleteSignature )
                            {
                            // InternalMyQvto.g:5104:6: (lv_complete_signature_4_0= ruleCompleteSignature )
                            // InternalMyQvto.g:5105:7: lv_complete_signature_4_0= ruleCompleteSignature
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
                              								"org.omg.qvt13.myqvto.MyQvto.CompleteSignature");
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
                    // InternalMyQvto.g:5125:3: ( (lv_tag_5_0= ruleTagGO ) )
                    {
                    // InternalMyQvto.g:5125:3: ( (lv_tag_5_0= ruleTagGO ) )
                    // InternalMyQvto.g:5126:4: (lv_tag_5_0= ruleTagGO )
                    {
                    // InternalMyQvto.g:5126:4: (lv_tag_5_0= ruleTagGO )
                    // InternalMyQvto.g:5127:5: lv_tag_5_0= ruleTagGO
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
                      						"org.omg.qvt13.myqvto.MyQvto.TagGO");
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
    // InternalMyQvto.g:5148:1: entryRuleFeatureQualifier returns [EObject current=null] : iv_ruleFeatureQualifier= ruleFeatureQualifier EOF ;
    public final EObject entryRuleFeatureQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureQualifier = null;


        try {
            // InternalMyQvto.g:5148:57: (iv_ruleFeatureQualifier= ruleFeatureQualifier EOF )
            // InternalMyQvto.g:5149:2: iv_ruleFeatureQualifier= ruleFeatureQualifier EOF
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
    // InternalMyQvto.g:5155:1: ruleFeatureQualifier returns [EObject current=null] : ( () ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )? ( (lv_feature_key_2_0= ruleFeatureKey ) )* ) ;
    public final EObject ruleFeatureQualifier() throws RecognitionException {
        EObject current = null;

        EObject lv_stereotype_qualifier_1_0 = null;

        Enumerator lv_feature_key_2_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:5161:2: ( ( () ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )? ( (lv_feature_key_2_0= ruleFeatureKey ) )* ) )
            // InternalMyQvto.g:5162:2: ( () ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )? ( (lv_feature_key_2_0= ruleFeatureKey ) )* )
            {
            // InternalMyQvto.g:5162:2: ( () ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )? ( (lv_feature_key_2_0= ruleFeatureKey ) )* )
            // InternalMyQvto.g:5163:3: () ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )? ( (lv_feature_key_2_0= ruleFeatureKey ) )*
            {
            // InternalMyQvto.g:5163:3: ()
            // InternalMyQvto.g:5164:4: 
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

            // InternalMyQvto.g:5173:3: ( (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==58) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalMyQvto.g:5174:4: (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier )
                    {
                    // InternalMyQvto.g:5174:4: (lv_stereotype_qualifier_1_0= ruleStereotypeQualifier )
                    // InternalMyQvto.g:5175:5: lv_stereotype_qualifier_1_0= ruleStereotypeQualifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureQualifierAccess().getStereotype_qualifierStereotypeQualifierParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_65);
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
                      						"org.omg.qvt13.myqvto.MyQvto.StereotypeQualifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyQvto.g:5192:3: ( (lv_feature_key_2_0= ruleFeatureKey ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( ((LA101_0>=72 && LA101_0<=73)||(LA101_0>=82 && LA101_0<=84)) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalMyQvto.g:5193:4: (lv_feature_key_2_0= ruleFeatureKey )
            	    {
            	    // InternalMyQvto.g:5193:4: (lv_feature_key_2_0= ruleFeatureKey )
            	    // InternalMyQvto.g:5194:5: lv_feature_key_2_0= ruleFeatureKey
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFeatureQualifierAccess().getFeature_keyFeatureKeyEnumRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_65);
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
            	      						"org.omg.qvt13.myqvto.MyQvto.FeatureKey");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
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
    // InternalMyQvto.g:5215:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalMyQvto.g:5215:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalMyQvto.g:5216:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalMyQvto.g:5222:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) ) otherlv_2= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_multiplicity_range_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5228:2: ( (otherlv_0= '[' ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) ) otherlv_2= ']' ) )
            // InternalMyQvto.g:5229:2: (otherlv_0= '[' ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) ) otherlv_2= ']' )
            {
            // InternalMyQvto.g:5229:2: (otherlv_0= '[' ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) ) otherlv_2= ']' )
            // InternalMyQvto.g:5230:3: otherlv_0= '[' ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMyQvto.g:5234:3: ( (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE ) )
            // InternalMyQvto.g:5235:4: (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE )
            {
            // InternalMyQvto.g:5235:4: (lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE )
            // InternalMyQvto.g:5236:5: lv_multiplicity_range_1_0= RULE_MULTIPLICITYRANGE
            {
            lv_multiplicity_range_1_0=(Token)match(input,RULE_MULTIPLICITYRANGE,FOLLOW_67); if (state.failed) return current;
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
              						"org.omg.qvt13.myqvto.MyQvto.MULTIPLICITYRANGE");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyQvto.g:5260:1: entryRuleOppositeProperty returns [EObject current=null] : iv_ruleOppositeProperty= ruleOppositeProperty EOF ;
    public final EObject entryRuleOppositeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOppositeProperty = null;


        try {
            // InternalMyQvto.g:5260:57: (iv_ruleOppositeProperty= ruleOppositeProperty EOF )
            // InternalMyQvto.g:5261:2: iv_ruleOppositeProperty= ruleOppositeProperty EOF
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
    // InternalMyQvto.g:5267:1: ruleOppositeProperty returns [EObject current=null] : ( () otherlv_1= 'opposites' (otherlv_2= '~' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ) ;
    public final EObject ruleOppositeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_multiplicity_4_0 = null;



        	enterRule();

        try {
            // InternalMyQvto.g:5273:2: ( ( () otherlv_1= 'opposites' (otherlv_2= '~' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ) )
            // InternalMyQvto.g:5274:2: ( () otherlv_1= 'opposites' (otherlv_2= '~' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) )? )
            {
            // InternalMyQvto.g:5274:2: ( () otherlv_1= 'opposites' (otherlv_2= '~' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) )? )
            // InternalMyQvto.g:5275:3: () otherlv_1= 'opposites' (otherlv_2= '~' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) )?
            {
            // InternalMyQvto.g:5275:3: ()
            // InternalMyQvto.g:5276:4: 
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

            otherlv_1=(Token)match(input,56,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOppositePropertyAccess().getOppositesKeyword_1());
              		
            }
            // InternalMyQvto.g:5289:3: (otherlv_2= '~' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==57) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalMyQvto.g:5290:4: otherlv_2= '~'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOppositePropertyAccess().getTildeKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalMyQvto.g:5295:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyQvto.g:5296:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyQvto.g:5296:4: (lv_name_3_0= RULE_ID )
            // InternalMyQvto.g:5297:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_69); if (state.failed) return current;
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

            // InternalMyQvto.g:5313:3: ( (lv_multiplicity_4_0= ruleMultiplicity ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==54) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalMyQvto.g:5314:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalMyQvto.g:5314:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalMyQvto.g:5315:5: lv_multiplicity_4_0= ruleMultiplicity
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
                      						"org.omg.qvt13.myqvto.MyQvto.Multiplicity");
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
    // InternalMyQvto.g:5336:1: entryRuleStereotypeQualifier returns [EObject current=null] : iv_ruleStereotypeQualifier= ruleStereotypeQualifier EOF ;
    public final EObject entryRuleStereotypeQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStereotypeQualifier = null;


        try {
            // InternalMyQvto.g:5336:60: (iv_ruleStereotypeQualifier= ruleStereotypeQualifier EOF )
            // InternalMyQvto.g:5337:2: iv_ruleStereotypeQualifier= ruleStereotypeQualifier EOF
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
    // InternalMyQvto.g:5343:1: ruleStereotypeQualifier returns [EObject current=null] : ( () otherlv_1= '<<' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )* otherlv_5= '>>' ) ;
    public final EObject ruleStereotypeQualifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_identifier_2_0=null;
        Token otherlv_3=null;
        Token lv_identifier_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5349:2: ( ( () otherlv_1= '<<' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )* otherlv_5= '>>' ) )
            // InternalMyQvto.g:5350:2: ( () otherlv_1= '<<' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )* otherlv_5= '>>' )
            {
            // InternalMyQvto.g:5350:2: ( () otherlv_1= '<<' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )* otherlv_5= '>>' )
            // InternalMyQvto.g:5351:3: () otherlv_1= '<<' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )* otherlv_5= '>>'
            {
            // InternalMyQvto.g:5351:3: ()
            // InternalMyQvto.g:5352:4: 
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
            // InternalMyQvto.g:5365:3: ( (lv_identifier_2_0= RULE_ID ) )
            // InternalMyQvto.g:5366:4: (lv_identifier_2_0= RULE_ID )
            {
            // InternalMyQvto.g:5366:4: (lv_identifier_2_0= RULE_ID )
            // InternalMyQvto.g:5367:5: lv_identifier_2_0= RULE_ID
            {
            lv_identifier_2_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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

            // InternalMyQvto.g:5383:3: (otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==14) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalMyQvto.g:5384:4: otherlv_3= ',' ( (lv_identifier_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getStereotypeQualifierAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalMyQvto.g:5388:4: ( (lv_identifier_4_0= RULE_ID ) )
            	    // InternalMyQvto.g:5389:5: (lv_identifier_4_0= RULE_ID )
            	    {
            	    // InternalMyQvto.g:5389:5: (lv_identifier_4_0= RULE_ID )
            	    // InternalMyQvto.g:5390:6: lv_identifier_4_0= RULE_ID
            	    {
            	    lv_identifier_4_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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
            	    break loop104;
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
    // InternalMyQvto.g:5415:1: entryRuleUnitRefGO returns [EObject current=null] : iv_ruleUnitRefGO= ruleUnitRefGO EOF ;
    public final EObject entryRuleUnitRefGO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitRefGO = null;


        try {
            // InternalMyQvto.g:5415:50: (iv_ruleUnitRefGO= ruleUnitRefGO EOF )
            // InternalMyQvto.g:5416:2: iv_ruleUnitRefGO= ruleUnitRefGO EOF
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
    // InternalMyQvto.g:5422:1: ruleUnitRefGO returns [EObject current=null] : ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleUnitRefGO() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token lv_identifier_3_0=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5428:2: ( ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )* ) )
            // InternalMyQvto.g:5429:2: ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )* )
            {
            // InternalMyQvto.g:5429:2: ( () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )* )
            // InternalMyQvto.g:5430:3: () ( (lv_identifier_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )*
            {
            // InternalMyQvto.g:5430:3: ()
            // InternalMyQvto.g:5431:4: 
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

            // InternalMyQvto.g:5440:3: ( (lv_identifier_1_0= RULE_ID ) )
            // InternalMyQvto.g:5441:4: (lv_identifier_1_0= RULE_ID )
            {
            // InternalMyQvto.g:5441:4: (lv_identifier_1_0= RULE_ID )
            // InternalMyQvto.g:5442:5: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
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

            // InternalMyQvto.g:5458:3: (otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==60) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalMyQvto.g:5459:4: otherlv_2= '.' ( (lv_identifier_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,60,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getUnitRefGOAccess().getFullStopKeyword_2_0());
            	      			
            	    }
            	    // InternalMyQvto.g:5463:4: ( (lv_identifier_3_0= RULE_ID ) )
            	    // InternalMyQvto.g:5464:5: (lv_identifier_3_0= RULE_ID )
            	    {
            	    // InternalMyQvto.g:5464:5: (lv_identifier_3_0= RULE_ID )
            	    // InternalMyQvto.g:5465:6: lv_identifier_3_0= RULE_ID
            	    {
            	    lv_identifier_3_0=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
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
            	    break loop105;
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
    // InternalMyQvto.g:5486:1: ruleDirectionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'inout' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirectionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5492:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'inout' ) | (enumLiteral_2= 'out' ) ) )
            // InternalMyQvto.g:5493:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'inout' ) | (enumLiteral_2= 'out' ) )
            {
            // InternalMyQvto.g:5493:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'inout' ) | (enumLiteral_2= 'out' ) )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt106=1;
                }
                break;
            case 62:
                {
                alt106=2;
                }
                break;
            case 63:
                {
                alt106=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // InternalMyQvto.g:5494:3: (enumLiteral_0= 'in' )
                    {
                    // InternalMyQvto.g:5494:3: (enumLiteral_0= 'in' )
                    // InternalMyQvto.g:5495:4: enumLiteral_0= 'in'
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
                    // InternalMyQvto.g:5502:3: (enumLiteral_1= 'inout' )
                    {
                    // InternalMyQvto.g:5502:3: (enumLiteral_1= 'inout' )
                    // InternalMyQvto.g:5503:4: enumLiteral_1= 'inout'
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
                    // InternalMyQvto.g:5510:3: (enumLiteral_2= 'out' )
                    {
                    // InternalMyQvto.g:5510:3: (enumLiteral_2= 'out' )
                    // InternalMyQvto.g:5511:4: enumLiteral_2= 'out'
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
    // InternalMyQvto.g:5521:1: ruleComplexTypeKey returns [Enumerator current=null] : ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Dict' ) | (enumLiteral_7= 'Tuple' ) ) ;
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
            // InternalMyQvto.g:5527:2: ( ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Dict' ) | (enumLiteral_7= 'Tuple' ) ) )
            // InternalMyQvto.g:5528:2: ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Dict' ) | (enumLiteral_7= 'Tuple' ) )
            {
            // InternalMyQvto.g:5528:2: ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Dict' ) | (enumLiteral_7= 'Tuple' ) )
            int alt107=8;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt107=1;
                }
                break;
            case 65:
                {
                alt107=2;
                }
                break;
            case 66:
                {
                alt107=3;
                }
                break;
            case 67:
                {
                alt107=4;
                }
                break;
            case 68:
                {
                alt107=5;
                }
                break;
            case 69:
                {
                alt107=6;
                }
                break;
            case 37:
                {
                alt107=7;
                }
                break;
            case 38:
                {
                alt107=8;
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
                    // InternalMyQvto.g:5529:3: (enumLiteral_0= 'Collection' )
                    {
                    // InternalMyQvto.g:5529:3: (enumLiteral_0= 'Collection' )
                    // InternalMyQvto.g:5530:4: enumLiteral_0= 'Collection'
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
                    // InternalMyQvto.g:5537:3: (enumLiteral_1= 'Set' )
                    {
                    // InternalMyQvto.g:5537:3: (enumLiteral_1= 'Set' )
                    // InternalMyQvto.g:5538:4: enumLiteral_1= 'Set'
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
                    // InternalMyQvto.g:5545:3: (enumLiteral_2= 'OrderedSet' )
                    {
                    // InternalMyQvto.g:5545:3: (enumLiteral_2= 'OrderedSet' )
                    // InternalMyQvto.g:5546:4: enumLiteral_2= 'OrderedSet'
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
                    // InternalMyQvto.g:5553:3: (enumLiteral_3= 'Sequence' )
                    {
                    // InternalMyQvto.g:5553:3: (enumLiteral_3= 'Sequence' )
                    // InternalMyQvto.g:5554:4: enumLiteral_3= 'Sequence'
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
                    // InternalMyQvto.g:5561:3: (enumLiteral_4= 'Bag' )
                    {
                    // InternalMyQvto.g:5561:3: (enumLiteral_4= 'Bag' )
                    // InternalMyQvto.g:5562:4: enumLiteral_4= 'Bag'
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
                    // InternalMyQvto.g:5569:3: (enumLiteral_5= 'List' )
                    {
                    // InternalMyQvto.g:5569:3: (enumLiteral_5= 'List' )
                    // InternalMyQvto.g:5570:4: enumLiteral_5= 'List'
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
                    // InternalMyQvto.g:5577:3: (enumLiteral_6= 'Dict' )
                    {
                    // InternalMyQvto.g:5577:3: (enumLiteral_6= 'Dict' )
                    // InternalMyQvto.g:5578:4: enumLiteral_6= 'Dict'
                    {
                    enumLiteral_6=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComplexTypeKeyAccess().getDictEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getComplexTypeKeyAccess().getDictEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyQvto.g:5585:3: (enumLiteral_7= 'Tuple' )
                    {
                    // InternalMyQvto.g:5585:3: (enumLiteral_7= 'Tuple' )
                    // InternalMyQvto.g:5586:4: enumLiteral_7= 'Tuple'
                    {
                    enumLiteral_7=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyQvto.g:5596:1: ruleCollectionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) ) ;
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
            // InternalMyQvto.g:5602:2: ( ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) ) )
            // InternalMyQvto.g:5603:2: ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) )
            {
            // InternalMyQvto.g:5603:2: ( (enumLiteral_0= 'Collection' ) | (enumLiteral_1= 'Set' ) | (enumLiteral_2= 'OrderedSet' ) | (enumLiteral_3= 'Sequence' ) | (enumLiteral_4= 'Bag' ) | (enumLiteral_5= 'List' ) )
            int alt108=6;
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
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalMyQvto.g:5604:3: (enumLiteral_0= 'Collection' )
                    {
                    // InternalMyQvto.g:5604:3: (enumLiteral_0= 'Collection' )
                    // InternalMyQvto.g:5605:4: enumLiteral_0= 'Collection'
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
                    // InternalMyQvto.g:5612:3: (enumLiteral_1= 'Set' )
                    {
                    // InternalMyQvto.g:5612:3: (enumLiteral_1= 'Set' )
                    // InternalMyQvto.g:5613:4: enumLiteral_1= 'Set'
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
                    // InternalMyQvto.g:5620:3: (enumLiteral_2= 'OrderedSet' )
                    {
                    // InternalMyQvto.g:5620:3: (enumLiteral_2= 'OrderedSet' )
                    // InternalMyQvto.g:5621:4: enumLiteral_2= 'OrderedSet'
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
                    // InternalMyQvto.g:5628:3: (enumLiteral_3= 'Sequence' )
                    {
                    // InternalMyQvto.g:5628:3: (enumLiteral_3= 'Sequence' )
                    // InternalMyQvto.g:5629:4: enumLiteral_3= 'Sequence'
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
                    // InternalMyQvto.g:5636:3: (enumLiteral_4= 'Bag' )
                    {
                    // InternalMyQvto.g:5636:3: (enumLiteral_4= 'Bag' )
                    // InternalMyQvto.g:5637:4: enumLiteral_4= 'Bag'
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
                    // InternalMyQvto.g:5644:3: (enumLiteral_5= 'List' )
                    {
                    // InternalMyQvto.g:5644:3: (enumLiteral_5= 'List' )
                    // InternalMyQvto.g:5645:4: enumLiteral_5= 'List'
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
    // InternalMyQvto.g:5655:1: ruleGeneralQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'blackbox' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'static' ) ) ;
    public final Enumerator ruleGeneralQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5661:2: ( ( (enumLiteral_0= 'blackbox' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'static' ) ) )
            // InternalMyQvto.g:5662:2: ( (enumLiteral_0= 'blackbox' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'static' ) )
            {
            // InternalMyQvto.g:5662:2: ( (enumLiteral_0= 'blackbox' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'static' ) )
            int alt109=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt109=1;
                }
                break;
            case 71:
                {
                alt109=2;
                }
                break;
            case 72:
                {
                alt109=3;
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
                    // InternalMyQvto.g:5663:3: (enumLiteral_0= 'blackbox' )
                    {
                    // InternalMyQvto.g:5663:3: (enumLiteral_0= 'blackbox' )
                    // InternalMyQvto.g:5664:4: enumLiteral_0= 'blackbox'
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
                    // InternalMyQvto.g:5671:3: (enumLiteral_1= 'abstract' )
                    {
                    // InternalMyQvto.g:5671:3: (enumLiteral_1= 'abstract' )
                    // InternalMyQvto.g:5672:4: enumLiteral_1= 'abstract'
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
                    // InternalMyQvto.g:5679:3: (enumLiteral_2= 'static' )
                    {
                    // InternalMyQvto.g:5679:3: (enumLiteral_2= 'static' )
                    // InternalMyQvto.g:5680:4: enumLiteral_2= 'static'
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


    // $ANTLR start "rulePropertyKey"
    // InternalMyQvto.g:5690:1: rulePropertyKey returns [Enumerator current=null] : ( (enumLiteral_0= 'derived' ) | (enumLiteral_1= 'literal' ) | (enumLiteral_2= 'configuration' ) | (enumLiteral_3= 'property' ) ) ;
    public final Enumerator rulePropertyKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5696:2: ( ( (enumLiteral_0= 'derived' ) | (enumLiteral_1= 'literal' ) | (enumLiteral_2= 'configuration' ) | (enumLiteral_3= 'property' ) ) )
            // InternalMyQvto.g:5697:2: ( (enumLiteral_0= 'derived' ) | (enumLiteral_1= 'literal' ) | (enumLiteral_2= 'configuration' ) | (enumLiteral_3= 'property' ) )
            {
            // InternalMyQvto.g:5697:2: ( (enumLiteral_0= 'derived' ) | (enumLiteral_1= 'literal' ) | (enumLiteral_2= 'configuration' ) | (enumLiteral_3= 'property' ) )
            int alt110=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt110=1;
                }
                break;
            case 74:
                {
                alt110=2;
                }
                break;
            case 75:
                {
                alt110=3;
                }
                break;
            case 76:
                {
                alt110=4;
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
                    // InternalMyQvto.g:5698:3: (enumLiteral_0= 'derived' )
                    {
                    // InternalMyQvto.g:5698:3: (enumLiteral_0= 'derived' )
                    // InternalMyQvto.g:5699:4: enumLiteral_0= 'derived'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPropertyKeyAccess().getDerivedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPropertyKeyAccess().getDerivedEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5706:3: (enumLiteral_1= 'literal' )
                    {
                    // InternalMyQvto.g:5706:3: (enumLiteral_1= 'literal' )
                    // InternalMyQvto.g:5707:4: enumLiteral_1= 'literal'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPropertyKeyAccess().getLiteralEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getPropertyKeyAccess().getLiteralEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:5714:3: (enumLiteral_2= 'configuration' )
                    {
                    // InternalMyQvto.g:5714:3: (enumLiteral_2= 'configuration' )
                    // InternalMyQvto.g:5715:4: enumLiteral_2= 'configuration'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPropertyKeyAccess().getConfigurationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getPropertyKeyAccess().getConfigurationEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyQvto.g:5722:3: (enumLiteral_3= 'property' )
                    {
                    // InternalMyQvto.g:5722:3: (enumLiteral_3= 'property' )
                    // InternalMyQvto.g:5723:4: enumLiteral_3= 'property'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleHelperKind"
    // InternalMyQvto.g:5733:1: ruleHelperKind returns [Enumerator current=null] : ( (enumLiteral_0= 'helper' ) | (enumLiteral_1= 'query' ) ) ;
    public final Enumerator ruleHelperKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5739:2: ( ( (enumLiteral_0= 'helper' ) | (enumLiteral_1= 'query' ) ) )
            // InternalMyQvto.g:5740:2: ( (enumLiteral_0= 'helper' ) | (enumLiteral_1= 'query' ) )
            {
            // InternalMyQvto.g:5740:2: ( (enumLiteral_0= 'helper' ) | (enumLiteral_1= 'query' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==77) ) {
                alt111=1;
            }
            else if ( (LA111_0==78) ) {
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
                    // InternalMyQvto.g:5741:3: (enumLiteral_0= 'helper' )
                    {
                    // InternalMyQvto.g:5741:3: (enumLiteral_0= 'helper' )
                    // InternalMyQvto.g:5742:4: enumLiteral_0= 'helper'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHelperKindAccess().getHelperEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getHelperKindAccess().getHelperEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5749:3: (enumLiteral_1= 'query' )
                    {
                    // InternalMyQvto.g:5749:3: (enumLiteral_1= 'query' )
                    // InternalMyQvto.g:5750:4: enumLiteral_1= 'query'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyQvto.g:5760:1: ruleModuleKind returns [Enumerator current=null] : ( (enumLiteral_0= 'transformation' ) | (enumLiteral_1= 'library' ) ) ;
    public final Enumerator ruleModuleKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5766:2: ( ( (enumLiteral_0= 'transformation' ) | (enumLiteral_1= 'library' ) ) )
            // InternalMyQvto.g:5767:2: ( (enumLiteral_0= 'transformation' ) | (enumLiteral_1= 'library' ) )
            {
            // InternalMyQvto.g:5767:2: ( (enumLiteral_0= 'transformation' ) | (enumLiteral_1= 'library' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==46) ) {
                alt112=1;
            }
            else if ( (LA112_0==40) ) {
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
                    // InternalMyQvto.g:5768:3: (enumLiteral_0= 'transformation' )
                    {
                    // InternalMyQvto.g:5768:3: (enumLiteral_0= 'transformation' )
                    // InternalMyQvto.g:5769:4: enumLiteral_0= 'transformation'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getModuleKindAccess().getTransformationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getModuleKindAccess().getTransformationEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5776:3: (enumLiteral_1= 'library' )
                    {
                    // InternalMyQvto.g:5776:3: (enumLiteral_1= 'library' )
                    // InternalMyQvto.g:5777:4: enumLiteral_1= 'library'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyQvto.g:5787:1: ruleMappingExtensionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'inherits' ) | (enumLiteral_1= 'merges' ) | (enumLiteral_2= 'disjuncts' ) ) ;
    public final Enumerator ruleMappingExtensionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5793:2: ( ( (enumLiteral_0= 'inherits' ) | (enumLiteral_1= 'merges' ) | (enumLiteral_2= 'disjuncts' ) ) )
            // InternalMyQvto.g:5794:2: ( (enumLiteral_0= 'inherits' ) | (enumLiteral_1= 'merges' ) | (enumLiteral_2= 'disjuncts' ) )
            {
            // InternalMyQvto.g:5794:2: ( (enumLiteral_0= 'inherits' ) | (enumLiteral_1= 'merges' ) | (enumLiteral_2= 'disjuncts' ) )
            int alt113=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt113=1;
                }
                break;
            case 80:
                {
                alt113=2;
                }
                break;
            case 81:
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
                    // InternalMyQvto.g:5795:3: (enumLiteral_0= 'inherits' )
                    {
                    // InternalMyQvto.g:5795:3: (enumLiteral_0= 'inherits' )
                    // InternalMyQvto.g:5796:4: enumLiteral_0= 'inherits'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMappingExtensionKeyAccess().getInheritsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMappingExtensionKeyAccess().getInheritsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyQvto.g:5803:3: (enumLiteral_1= 'merges' )
                    {
                    // InternalMyQvto.g:5803:3: (enumLiteral_1= 'merges' )
                    // InternalMyQvto.g:5804:4: enumLiteral_1= 'merges'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMappingExtensionKeyAccess().getMergesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMappingExtensionKeyAccess().getMergesEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyQvto.g:5811:3: (enumLiteral_2= 'disjuncts' )
                    {
                    // InternalMyQvto.g:5811:3: (enumLiteral_2= 'disjuncts' )
                    // InternalMyQvto.g:5812:4: enumLiteral_2= 'disjuncts'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleFeatureKey"
    // InternalMyQvto.g:5822:1: ruleFeatureKey returns [Enumerator current=null] : ( (enumLiteral_0= 'composes' ) | (enumLiteral_1= 'references' ) | (enumLiteral_2= 'readonly' ) | (enumLiteral_3= 'derived' ) | (enumLiteral_4= 'static' ) ) ;
    public final Enumerator ruleFeatureKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyQvto.g:5828:2: ( ( (enumLiteral_0= 'composes' ) | (enumLiteral_1= 'references' ) | (enumLiteral_2= 'readonly' ) | (enumLiteral_3= 'derived' ) | (enumLiteral_4= 'static' ) ) )
            // InternalMyQvto.g:5829:2: ( (enumLiteral_0= 'composes' ) | (enumLiteral_1= 'references' ) | (enumLiteral_2= 'readonly' ) | (enumLiteral_3= 'derived' ) | (enumLiteral_4= 'static' ) )
            {
            // InternalMyQvto.g:5829:2: ( (enumLiteral_0= 'composes' ) | (enumLiteral_1= 'references' ) | (enumLiteral_2= 'readonly' ) | (enumLiteral_3= 'derived' ) | (enumLiteral_4= 'static' ) )
            int alt114=5;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt114=1;
                }
                break;
            case 83:
                {
                alt114=2;
                }
                break;
            case 84:
                {
                alt114=3;
                }
                break;
            case 73:
                {
                alt114=4;
                }
                break;
            case 72:
                {
                alt114=5;
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
                    // InternalMyQvto.g:5830:3: (enumLiteral_0= 'composes' )
                    {
                    // InternalMyQvto.g:5830:3: (enumLiteral_0= 'composes' )
                    // InternalMyQvto.g:5831:4: enumLiteral_0= 'composes'
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
                    // InternalMyQvto.g:5838:3: (enumLiteral_1= 'references' )
                    {
                    // InternalMyQvto.g:5838:3: (enumLiteral_1= 'references' )
                    // InternalMyQvto.g:5839:4: enumLiteral_1= 'references'
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
                    // InternalMyQvto.g:5846:3: (enumLiteral_2= 'readonly' )
                    {
                    // InternalMyQvto.g:5846:3: (enumLiteral_2= 'readonly' )
                    // InternalMyQvto.g:5847:4: enumLiteral_2= 'readonly'
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
                    // InternalMyQvto.g:5854:3: (enumLiteral_3= 'derived' )
                    {
                    // InternalMyQvto.g:5854:3: (enumLiteral_3= 'derived' )
                    // InternalMyQvto.g:5855:4: enumLiteral_3= 'derived'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFeatureKeyAccess().getDerivedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getFeatureKeyAccess().getDerivedEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyQvto.g:5862:3: (enumLiteral_4= 'static' )
                    {
                    // InternalMyQvto.g:5862:3: (enumLiteral_4= 'static' )
                    // InternalMyQvto.g:5863:4: enumLiteral_4= 'static'
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

    // $ANTLR start synpred55_InternalMyQvto
    public final void synpred55_InternalMyQvto_fragment() throws RecognitionException {   
        EObject lv_expression_list_2_0 = null;


        // InternalMyQvto.g:1796:4: ( (lv_expression_list_2_0= ruleExpressionList ) )
        // InternalMyQvto.g:1796:4: (lv_expression_list_2_0= ruleExpressionList )
        {
        // InternalMyQvto.g:1796:4: (lv_expression_list_2_0= ruleExpressionList )
        // InternalMyQvto.g:1797:5: lv_expression_list_2_0= ruleExpressionList
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
    // $ANTLR end synpred55_InternalMyQvto

    // $ANTLR start synpred56_InternalMyQvto
    public final void synpred56_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_initSection_5_0 = null;


        // InternalMyQvto.g:1877:6: (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )
        // InternalMyQvto.g:1877:6: otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) )
        {
        otherlv_4=(Token)match(input,16,FOLLOW_15); if (state.failed) return ;
        // InternalMyQvto.g:1881:6: ( (lv_initSection_5_0= ruleExpressionGO ) )
        // InternalMyQvto.g:1882:7: (lv_initSection_5_0= ruleExpressionGO )
        {
        // InternalMyQvto.g:1882:7: (lv_initSection_5_0= ruleExpressionGO )
        // InternalMyQvto.g:1883:8: lv_initSection_5_0= ruleExpressionGO
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
    // $ANTLR end synpred56_InternalMyQvto

    // $ANTLR start synpred58_InternalMyQvto
    public final void synpred58_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_initSection_3_0 = null;

        EObject lv_initSection_5_0 = null;


        // InternalMyQvto.g:1857:5: ( ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )? )
        // InternalMyQvto.g:1857:5: ( (lv_initSection_3_0= ruleExpressionGO ) ) (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )* (otherlv_6= ';' )?
        {
        // InternalMyQvto.g:1857:5: ( (lv_initSection_3_0= ruleExpressionGO ) )
        // InternalMyQvto.g:1858:6: (lv_initSection_3_0= ruleExpressionGO )
        {
        // InternalMyQvto.g:1858:6: (lv_initSection_3_0= ruleExpressionGO )
        // InternalMyQvto.g:1859:7: lv_initSection_3_0= ruleExpressionGO
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getMappingBodyAccess().getInitSectionExpressionGOParserRuleCall_1_2_0_0());
          						
        }
        pushFollow(FOLLOW_11);
        lv_initSection_3_0=ruleExpressionGO();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyQvto.g:1876:5: (otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) ) )*
        loop118:
        do {
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==16) ) {
                int LA118_1 = input.LA(2);

                if ( (synpred56_InternalMyQvto()) ) {
                    alt118=1;
                }


            }


            switch (alt118) {
        	case 1 :
        	    // InternalMyQvto.g:1877:6: otherlv_4= ';' ( (lv_initSection_5_0= ruleExpressionGO ) )
        	    {
        	    otherlv_4=(Token)match(input,16,FOLLOW_15); if (state.failed) return ;
        	    // InternalMyQvto.g:1881:6: ( (lv_initSection_5_0= ruleExpressionGO ) )
        	    // InternalMyQvto.g:1882:7: (lv_initSection_5_0= ruleExpressionGO )
        	    {
        	    // InternalMyQvto.g:1882:7: (lv_initSection_5_0= ruleExpressionGO )
        	    // InternalMyQvto.g:1883:8: lv_initSection_5_0= ruleExpressionGO
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getMappingBodyAccess().getInitSectionExpressionGOParserRuleCall_1_2_1_1_0());
        	      							
        	    }
        	    pushFollow(FOLLOW_11);
        	    lv_initSection_5_0=ruleExpressionGO();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop118;
            }
        } while (true);

        // InternalMyQvto.g:1901:5: (otherlv_6= ';' )?
        int alt119=2;
        int LA119_0 = input.LA(1);

        if ( (LA119_0==16) ) {
            alt119=1;
        }
        switch (alt119) {
            case 1 :
                // InternalMyQvto.g:1902:6: otherlv_6= ';'
                {
                otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred58_InternalMyQvto

    // $ANTLR start synpred60_InternalMyQvto
    public final void synpred60_InternalMyQvto_fragment() throws RecognitionException {   
        EObject lv_population_section_8_0 = null;


        // InternalMyQvto.g:1914:4: ( (lv_population_section_8_0= rulePopulationSection ) )
        // InternalMyQvto.g:1914:4: (lv_population_section_8_0= rulePopulationSection )
        {
        // InternalMyQvto.g:1914:4: (lv_population_section_8_0= rulePopulationSection )
        // InternalMyQvto.g:1915:5: lv_population_section_8_0= rulePopulationSection
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
    // $ANTLR end synpred60_InternalMyQvto

    // $ANTLR start synpred61_InternalMyQvto
    public final void synpred61_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        EObject lv_endSection_13_0 = null;


        // InternalMyQvto.g:1962:6: (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )
        // InternalMyQvto.g:1962:6: otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) )
        {
        otherlv_12=(Token)match(input,16,FOLLOW_15); if (state.failed) return ;
        // InternalMyQvto.g:1966:6: ( (lv_endSection_13_0= ruleExpressionGO ) )
        // InternalMyQvto.g:1967:7: (lv_endSection_13_0= ruleExpressionGO )
        {
        // InternalMyQvto.g:1967:7: (lv_endSection_13_0= ruleExpressionGO )
        // InternalMyQvto.g:1968:8: lv_endSection_13_0= ruleExpressionGO
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
    // $ANTLR end synpred61_InternalMyQvto

    // $ANTLR start synpred63_InternalMyQvto
    public final void synpred63_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_endSection_11_0 = null;

        EObject lv_endSection_13_0 = null;


        // InternalMyQvto.g:1942:5: ( ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )? )
        // InternalMyQvto.g:1942:5: ( (lv_endSection_11_0= ruleExpressionGO ) ) (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )* (otherlv_14= ';' )?
        {
        // InternalMyQvto.g:1942:5: ( (lv_endSection_11_0= ruleExpressionGO ) )
        // InternalMyQvto.g:1943:6: (lv_endSection_11_0= ruleExpressionGO )
        {
        // InternalMyQvto.g:1943:6: (lv_endSection_11_0= ruleExpressionGO )
        // InternalMyQvto.g:1944:7: lv_endSection_11_0= ruleExpressionGO
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getMappingBodyAccess().getEndSectionExpressionGOParserRuleCall_3_2_0_0());
          						
        }
        pushFollow(FOLLOW_11);
        lv_endSection_11_0=ruleExpressionGO();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyQvto.g:1961:5: (otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) ) )*
        loop123:
        do {
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==16) ) {
                int LA123_1 = input.LA(2);

                if ( (synpred61_InternalMyQvto()) ) {
                    alt123=1;
                }


            }


            switch (alt123) {
        	case 1 :
        	    // InternalMyQvto.g:1962:6: otherlv_12= ';' ( (lv_endSection_13_0= ruleExpressionGO ) )
        	    {
        	    otherlv_12=(Token)match(input,16,FOLLOW_15); if (state.failed) return ;
        	    // InternalMyQvto.g:1966:6: ( (lv_endSection_13_0= ruleExpressionGO ) )
        	    // InternalMyQvto.g:1967:7: (lv_endSection_13_0= ruleExpressionGO )
        	    {
        	    // InternalMyQvto.g:1967:7: (lv_endSection_13_0= ruleExpressionGO )
        	    // InternalMyQvto.g:1968:8: lv_endSection_13_0= ruleExpressionGO
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getMappingBodyAccess().getEndSectionExpressionGOParserRuleCall_3_2_1_1_0());
        	      							
        	    }
        	    pushFollow(FOLLOW_11);
        	    lv_endSection_13_0=ruleExpressionGO();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop123;
            }
        } while (true);

        // InternalMyQvto.g:1986:5: (otherlv_14= ';' )?
        int alt124=2;
        int LA124_0 = input.LA(1);

        if ( (LA124_0==16) ) {
            alt124=1;
        }
        switch (alt124) {
            case 1 :
                // InternalMyQvto.g:1987:6: otherlv_14= ';'
                {
                otherlv_14=(Token)match(input,16,FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred63_InternalMyQvto

    // $ANTLR start synpred69_InternalMyQvto
    public final void synpred69_InternalMyQvto_fragment() throws RecognitionException {   
        EObject lv_init_part_1_0 = null;


        // InternalMyQvto.g:2265:5: ( (lv_init_part_1_0= ruleInitPart ) )
        // InternalMyQvto.g:2265:5: (lv_init_part_1_0= ruleInitPart )
        {
        // InternalMyQvto.g:2265:5: (lv_init_part_1_0= ruleInitPart )
        // InternalMyQvto.g:2266:6: lv_init_part_1_0= ruleInitPart
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
    // $ANTLR end synpred69_InternalMyQvto

    // $ANTLR start synpred71_InternalMyQvto
    public final void synpred71_InternalMyQvto_fragment() throws RecognitionException {   
        EObject lv_init_part_5_0 = null;


        // InternalMyQvto.g:2329:5: ( (lv_init_part_5_0= ruleInitPart ) )
        // InternalMyQvto.g:2329:5: (lv_init_part_5_0= ruleInitPart )
        {
        // InternalMyQvto.g:2329:5: (lv_init_part_5_0= ruleInitPart )
        // InternalMyQvto.g:2330:6: lv_init_part_5_0= ruleInitPart
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
    // $ANTLR end synpred71_InternalMyQvto

    // $ANTLR start synpred77_InternalMyQvto
    public final void synpred77_InternalMyQvto_fragment() throws RecognitionException {   
        Enumerator lv_complex_type_key_1_0 = null;


        // InternalMyQvto.g:2646:3: ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) )
        // InternalMyQvto.g:2646:3: ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) )
        {
        // InternalMyQvto.g:2646:3: ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) )
        // InternalMyQvto.g:2647:4: () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) )
        {
        // InternalMyQvto.g:2647:4: ()
        // InternalMyQvto.g:2648:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMyQvto.g:2657:4: ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) )
        // InternalMyQvto.g:2658:5: (lv_complex_type_key_1_0= ruleComplexTypeKey )
        {
        // InternalMyQvto.g:2658:5: (lv_complex_type_key_1_0= ruleComplexTypeKey )
        // InternalMyQvto.g:2659:6: lv_complex_type_key_1_0= ruleComplexTypeKey
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
    // $ANTLR end synpred77_InternalMyQvto

    // $ANTLR start synpred78_InternalMyQvto
    public final void synpred78_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_collection_key_2_0 = null;

        EObject lv_typespec_4_0 = null;


        // InternalMyQvto.g:2678:3: ( ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) )
        // InternalMyQvto.g:2678:3: ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' )
        {
        // InternalMyQvto.g:2678:3: ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' )
        // InternalMyQvto.g:2679:4: ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')'
        {
        // InternalMyQvto.g:2679:4: ( (lv_collection_key_2_0= ruleCollectionKey ) )
        // InternalMyQvto.g:2680:5: (lv_collection_key_2_0= ruleCollectionKey )
        {
        // InternalMyQvto.g:2680:5: (lv_collection_key_2_0= ruleCollectionKey )
        // InternalMyQvto.g:2681:6: lv_collection_key_2_0= ruleCollectionKey
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getComplexTypeAccess().getCollection_keyCollectionKeyEnumRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_29);
        lv_collection_key_2_0=ruleCollectionKey();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_3=(Token)match(input,35,FOLLOW_27); if (state.failed) return ;
        // InternalMyQvto.g:2702:4: ( (lv_typespec_4_0= ruleTypeSpec ) )
        // InternalMyQvto.g:2703:5: (lv_typespec_4_0= ruleTypeSpec )
        {
        // InternalMyQvto.g:2703:5: (lv_typespec_4_0= ruleTypeSpec )
        // InternalMyQvto.g:2704:6: lv_typespec_4_0= ruleTypeSpec
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getComplexTypeAccess().getTypespecTypeSpecParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_40);
        lv_typespec_4_0=ruleTypeSpec();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,36,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred78_InternalMyQvto

    // $ANTLR start synpred79_InternalMyQvto
    public final void synpred79_InternalMyQvto_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_typespec_8_0 = null;

        EObject lv_typespec_10_0 = null;


        // InternalMyQvto.g:2727:3: ( (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) )
        // InternalMyQvto.g:2727:3: (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' )
        {
        // InternalMyQvto.g:2727:3: (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' )
        // InternalMyQvto.g:2728:4: otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')'
        {
        otherlv_6=(Token)match(input,37,FOLLOW_29); if (state.failed) return ;
        otherlv_7=(Token)match(input,35,FOLLOW_27); if (state.failed) return ;
        // InternalMyQvto.g:2736:4: ( (lv_typespec_8_0= ruleTypeSpec ) )
        // InternalMyQvto.g:2737:5: (lv_typespec_8_0= ruleTypeSpec )
        {
        // InternalMyQvto.g:2737:5: (lv_typespec_8_0= ruleTypeSpec )
        // InternalMyQvto.g:2738:6: lv_typespec_8_0= ruleTypeSpec
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

        otherlv_9=(Token)match(input,14,FOLLOW_27); if (state.failed) return ;
        // InternalMyQvto.g:2759:4: ( (lv_typespec_10_0= ruleTypeSpec ) )
        // InternalMyQvto.g:2760:5: (lv_typespec_10_0= ruleTypeSpec )
        {
        // InternalMyQvto.g:2760:5: (lv_typespec_10_0= ruleTypeSpec )
        // InternalMyQvto.g:2761:6: lv_typespec_10_0= ruleTypeSpec
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getComplexTypeAccess().getTypespecTypeSpecParserRuleCall_2_4_0());
          					
        }
        pushFollow(FOLLOW_40);
        lv_typespec_10_0=ruleTypeSpec();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,36,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred79_InternalMyQvto

    // $ANTLR start synpred120_InternalMyQvto
    public final void synpred120_InternalMyQvto_fragment() throws RecognitionException {   
        EObject lv_feature_qualifier_0_0 = null;


        // InternalMyQvto.g:5024:5: ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )
        // InternalMyQvto.g:5024:5: (lv_feature_qualifier_0_0= ruleFeatureQualifier )
        {
        // InternalMyQvto.g:5024:5: (lv_feature_qualifier_0_0= ruleFeatureQualifier )
        // InternalMyQvto.g:5025:6: lv_feature_qualifier_0_0= ruleFeatureQualifier
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
    // $ANTLR end synpred120_InternalMyQvto

    // Delegated rules

    public final boolean synpred55_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalMyQvto_fragment(); // can never throw exception
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
    public final boolean synpred77_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalMyQvto_fragment(); // can never throw exception
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
    public final boolean synpred69_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalMyQvto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred120_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_InternalMyQvto_fragment(); // can never throw exception
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
    public final boolean synpred56_InternalMyQvto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalMyQvto_fragment(); // can never throw exception
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
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA95 dfa95 = new DFA95(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\21\3\47\1\uffff\1\65\14\uffff";
    static final String dfa_3s = "\4\116\1\uffff\1\114\14\uffff";
    static final String dfa_4s = "\4\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\2\uffff\1\5\3\uffff\1\15\1\20\1\7\14\uffff\1\4\1\11\1\17\2\uffff\1\12\1\uffff\1\14\2\16\1\uffff\4\21\20\uffff\1\1\1\2\1\3\4\6\2\10",
            "\1\4\4\uffff\1\12\1\uffff\1\14\6\uffff\1\21\20\uffff\1\1\1\2\1\3\4\uffff\2\10",
            "\1\4\4\uffff\1\12\1\uffff\1\14\6\uffff\1\21\20\uffff\1\1\1\2\1\3\4\uffff\2\10",
            "\1\4\4\uffff\1\12\1\uffff\1\14\6\uffff\1\21\20\uffff\1\1\1\2\1\3\4\uffff\2\10",
            "",
            "\1\21\20\uffff\3\21\4\6",
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
            return "152:2: (this_Constructor_0= ruleConstructor | this_ContextualProperty_1= ruleContextualProperty | this_EntryOperation_2= ruleEntryOperation | this_Helper_3= ruleHelper | this_Library_4= ruleLibrary | this_MappingOperation_5= ruleMappingOperation | this_ModelType_6= ruleModelType | this_OperationalTransformation_7= ruleOperationalTransformation | this_TagGO_8= ruleTagGO | this_MetaModelGO_9= ruleMetaModelGO | this_AccessDecl_10= ruleAccessDecl | this_TypeDef_11= ruleTypeDef | this_ClassifierGO_12= ruleClassifierGO )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\24\3\47\1\uffff\1\65\10\uffff";
    static final String dfa_9s = "\4\116\1\uffff\1\114\10\uffff";
    static final String dfa_10s = "\4\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_11s = "\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\5\3\uffff\1\12\1\14\1\7\14\uffff\1\4\1\uffff\1\13\2\uffff\1\11\5\uffff\4\15\20\uffff\1\1\1\2\1\3\4\6\2\10",
            "\1\4\4\uffff\1\11\10\uffff\1\15\20\uffff\1\1\1\2\1\3\4\uffff\2\10",
            "\1\4\4\uffff\1\11\10\uffff\1\15\20\uffff\1\1\1\2\1\3\4\uffff\2\10",
            "\1\4\4\uffff\1\11\10\uffff\1\15\20\uffff\1\1\1\2\1\3\4\uffff\2\10",
            "",
            "\1\15\20\uffff\3\15\4\6",
            "",
            "",
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
            return "326:2: (this_Constructor_0= ruleConstructor | this_ContextualProperty_1= ruleContextualProperty | this_EntryOperation_2= ruleEntryOperation | this_Helper_3= ruleHelper | this_MappingOperation_4= ruleMappingOperation | this_TagGO_5= ruleTagGO | this_AccessDecl_6= ruleAccessDecl | this_TypeDef_7= ruleTypeDef | this_ClassifierGO_8= ruleClassifierGO )";
        }
    }
    static final String dfa_13s = "\6\uffff";
    static final String dfa_14s = "\1\uffff\1\2\3\uffff\1\2";
    static final String dfa_15s = "\1\4\1\16\1\uffff\1\4\1\uffff\1\16";
    static final String dfa_16s = "\1\105\1\121\1\uffff\1\4\1\uffff\1\121";
    static final String dfa_17s = "\2\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String dfa_18s = "\6\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\40\uffff\2\2\31\uffff\6\2",
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\3\2\6\uffff\1\4\3\2\1\3\2\2\6\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff\1\2\26\uffff\3\2",
            "",
            "\1\5",
            "",
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\3\2\6\uffff\1\4\3\2\1\3\2\2\6\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff\1\2\26\uffff\3\2"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2243:2: ( ( ( (lv_typespec_0_0= ruleTypeSpec ) ) ( (lv_init_part_1_0= ruleInitPart ) )? ) | ( ( (lv_scoped_identifier_2_0= ruleScopedIdentifier ) ) otherlv_3= ':' ( (lv_typespec_4_0= ruleTypeSpec ) ) ( (lv_init_part_5_0= ruleInitPart ) )? ) )";
        }
    }
    static final String dfa_20s = "\7\uffff";
    static final String dfa_21s = "\1\3\1\2\2\uffff\2\2\1\uffff";
    static final String dfa_22s = "\1\16\1\4\2\uffff\2\4\1\0";
    static final String dfa_23s = "\2\121\2\uffff\2\121\1\0";
    static final String dfa_24s = "\2\uffff\1\1\1\2\3\uffff";
    static final String dfa_25s = "\6\uffff\1\0}>";
    static final String[] dfa_26s = {
            "\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\1\2\3\10\uffff\2\2\1\uffff\2\3\6\uffff\1\3\1\uffff\1\3\10\uffff\1\3\1\uffff\1\3\26\uffff\3\3",
            "\1\5\1\4\10\uffff\1\2\1\uffff\1\6\2\uffff\1\2\1\uffff\3\2\13\uffff\2\2\6\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff\1\2\26\uffff\3\2",
            "",
            "",
            "\1\5\1\4\10\uffff\1\2\1\uffff\1\6\2\uffff\1\2\1\uffff\3\2\13\uffff\2\2\6\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff\1\2\26\uffff\3\2",
            "\1\5\1\4\10\uffff\1\2\1\uffff\1\6\2\uffff\1\2\1\uffff\3\2\13\uffff\2\2\6\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff\1\2\26\uffff\3\2",
            "\1\uffff"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2264:4: ( (lv_init_part_1_0= ruleInitPart ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_6 = input.LA(1);

                         
                        int index50_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalMyQvto()) ) {s = 2;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index50_6);
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

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2328:4: ( (lv_init_part_5_0= ruleInitPart ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_6 = input.LA(1);

                         
                        int index51_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalMyQvto()) ) {s = 2;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index51_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\15\uffff";
    static final String dfa_28s = "\1\45\10\0\4\uffff";
    static final String dfa_29s = "\1\105\10\0\4\uffff";
    static final String dfa_30s = "\11\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_31s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\4\uffff}>";
    static final String[] dfa_32s = {
            "\1\7\1\10\31\uffff\1\1\1\2\1\3\1\4\1\5\1\6",
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

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "2645:2: ( ( () ( (lv_complex_type_key_1_0= ruleComplexTypeKey ) ) ) | ( ( (lv_collection_key_2_0= ruleCollectionKey ) ) otherlv_3= '(' ( (lv_typespec_4_0= ruleTypeSpec ) ) otherlv_5= ')' ) | (otherlv_6= 'Dict' otherlv_7= '(' ( (lv_typespec_8_0= ruleTypeSpec ) ) otherlv_9= ',' ( (lv_typespec_10_0= ruleTypeSpec ) ) otherlv_11= ')' ) | (otherlv_12= 'Tuple' otherlv_13= '(' ( (lv_declarator_list_14_0= ruleDeclaratorList ) ) otherlv_15= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred78_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred78_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index57_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_3 = input.LA(1);

                         
                        int index57_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred78_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index57_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA57_4 = input.LA(1);

                         
                        int index57_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred78_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index57_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA57_5 = input.LA(1);

                         
                        int index57_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred78_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index57_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA57_6 = input.LA(1);

                         
                        int index57_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred78_InternalMyQvto()) ) {s = 10;}

                         
                        input.seek(index57_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA57_7 = input.LA(1);

                         
                        int index57_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalMyQvto()) ) {s = 9;}

                        else if ( (synpred79_InternalMyQvto()) ) {s = 11;}

                         
                        input.seek(index57_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA57_8 = input.LA(1);

                         
                        int index57_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalMyQvto()) ) {s = 9;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index57_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_33s = "\14\uffff";
    static final String dfa_34s = "\1\4\1\uffff\11\0\1\uffff";
    static final String dfa_35s = "\1\124\1\uffff\11\0\1\uffff";
    static final String dfa_36s = "\1\uffff\1\1\11\uffff\1\2";
    static final String dfa_37s = "\2\uffff\1\4\1\5\1\0\1\6\1\1\1\7\1\10\1\2\1\3\1\uffff}>";
    static final String[] dfa_38s = {
            "\1\2\40\uffff\1\11\1\12\23\uffff\1\1\5\uffff\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\2\1\10\uffff\3\1",
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

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "5023:4: ( (lv_feature_qualifier_0_0= ruleFeatureQualifier ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA95_4 = input.LA(1);

                         
                        int index95_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index95_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA95_6 = input.LA(1);

                         
                        int index95_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index95_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA95_9 = input.LA(1);

                         
                        int index95_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index95_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA95_10 = input.LA(1);

                         
                        int index95_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index95_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA95_2 = input.LA(1);

                         
                        int index95_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index95_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA95_3 = input.LA(1);

                         
                        int index95_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index95_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA95_5 = input.LA(1);

                         
                        int index95_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index95_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA95_7 = input.LA(1);

                         
                        int index95_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index95_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA95_8 = input.LA(1);

                         
                        int index95_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_InternalMyQvto()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index95_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 95, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x003DD38007123002L,0x0000000000007FC0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x003DD38007120002L,0x0000000000007FC0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000094000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006000100010L,0x0000000000001E3FL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000610000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x003DD38007920000L,0x0000000000007FC0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000038800030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x003FD38007920000L,0x0000000000007FC0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000006000000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0400006001800010L,0x00000000001C033FL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000030000032L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000300200002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xE000007000000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xE000006000000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000008000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x00000000000061C0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000060800000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000410000000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000080000080002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000100000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xE000000000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000200000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000400000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000260000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000804030L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400006001000010L,0x00000000001C033FL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0020000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0140000800000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C0300L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0800000000004000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x1000000000000002L});

}