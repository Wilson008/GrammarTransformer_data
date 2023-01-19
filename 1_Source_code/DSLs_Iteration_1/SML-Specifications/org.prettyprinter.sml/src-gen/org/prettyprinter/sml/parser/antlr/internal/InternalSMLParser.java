package org.prettyprinter.sml.parser.antlr.internal;

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
import org.prettyprinter.sml.services.SMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Specification'", "'{'", "'domains'", "'('", "','", "')'", "'contexts'", "'controllableEClasses'", "'nonSpontaneousOperations'", "'includedCollaborations'", "'imports'", "'}'", "'containedCollaborations'", "'eventParameterRanges'", "'channelOptions'", "'DummyExprClass'", "'EPackage'", "'nsURI'", "'nsPrefix'", "'eAnnotations'", "'eClassifiers'", "'eSubpackages'", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'Collaboration'", "'roles'", "'scenarios'", "'EventParameterRanges'", "'event'", "'rangesForParameter'", "'allMessagesRequireLinks'", "'ChannelOptions'", "'messageChannels'", "'Interaction'", "'fragments'", "'constraints'", "'ConstraintBlock'", "'consider'", "'ignore'", "'interrupt'", "'forbidden'", "'strict'", "'monitored'", "'ModalMessage'", "'collectionModification'", "'expectationKind'", "'receiver'", "'sender'", "'modelElement'", "'parameters'", "'Alternative'", "'cases'", "'Loop'", "'bodyInteraction'", "'loopCondition'", "'Parallel'", "'parallelInteraction'", "'requested'", "'WaitCondition'", "'conditionExpression'", "'InterruptCondition'", "'ViolationCondition'", "'Condition'", "'VariableFragment'", "'expression'", "'TimedViolationCondition'", "'timedConditionExpression'", "'TimedInterruptCondition'", "'TimedWaitCondition'", "'ClockFragment'", "'static'", "'multiRole'", "'Role'", "'type'", "'ParameterBinding'", "'bindingExpression'", "'DummyDatatype'", "'true'", "'false'", "'EAnnotation'", "'source'", "'references'", "'details'", "'contents'", "'ETypeParameter'", "'eBounds'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EStringToStringMapEntry'", "'key'", "'value'", "'EObject'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'EEnumLiteral'", "'literal'", "'-'", "'FeatureAccessBindingExpression'", "'featureaccess'", "'ObjectQueryBindingExpression'", "'queryClass'", "'queryValues'", "'ParameterExpression'", "'WildcardParameterExpression'", "'ValueParameterExpression'", "'VariableBindingParameterExpression'", "'variable'", "'ObjectQueryValue'", "'feature'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'changeable'", "'defaultValueLiteral'", "'eType'", "'eGenericType'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'Case'", "'caseInteraction'", "'caseCondition'", "'ConditionExpression'", "'Message'", "'EOperation'", "'eExceptions'", "'eParameters'", "'eGenericExceptions'", "'EParameter'", "'singular'", "'optimizeCost'", "'Scenario'", "'kind'", "'cost'", "'roleBindings'", "'ownedInteraction'", "'RoleBindingConstraint'", "'role'", "'.'", "'E'", "'e'", "'RangesForParameter'", "'parameter'", "'ranges'", "'IntegerRanges'", "'min'", "'max'", "'values'", "'StringRanges'", "'EnumRanges'", "'MessageChannel'", "'channelFeature'", "'none'", "'eventually'", "'urgent'", "'committed'", "'assumption'", "'guarantee'", "'existential'"
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
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
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
    public static final int T__100=100;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__119=119;
    public static final int T__118=118;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__108=108;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__104=104;
    public static final int T__103=103;
    public static final int T__106=106;
    public static final int T__105=105;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__91=91;
    public static final int T__188=188;
    public static final int T__92=92;
    public static final int T__187=187;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__189=189;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__90=90;
    public static final int T__185=185;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__192=192;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalSMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSML.g"; }



     	private SMLGrammarAccess grammarAccess;

        public InternalSMLParser(TokenStream input, SMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Specification";
       	}

       	@Override
       	protected SMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSpecification"
    // InternalSML.g:65:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalSML.g:65:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalSML.g:66:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSML.g:72:1: ruleSpecification returns [EObject current=null] : ( () otherlv_1= 'Specification' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'controllableEClasses' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'nonSpontaneousOperations' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'includedCollaborations' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'imports' otherlv_35= '{' ( (lv_imports_36_0= ruleDummyExprClass ) ) (otherlv_37= ',' ( (lv_imports_38_0= ruleDummyExprClass ) ) )* otherlv_39= '}' )? (otherlv_40= 'containedCollaborations' otherlv_41= '{' ( (lv_containedCollaborations_42_0= ruleCollaboration ) ) (otherlv_43= ',' ( (lv_containedCollaborations_44_0= ruleCollaboration ) ) )* otherlv_45= '}' )? (otherlv_46= 'eventParameterRanges' otherlv_47= '{' ( (lv_eventParameterRanges_48_0= ruleEventParameterRanges ) ) (otherlv_49= ',' ( (lv_eventParameterRanges_50_0= ruleEventParameterRanges ) ) )* otherlv_51= '}' )? (otherlv_52= 'channelOptions' ( (lv_channelOptions_53_0= ruleChannelOptions ) ) )? otherlv_54= '}' ) ;
    public final EObject ruleSpecification() throws RecognitionException {
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_36_0 = null;

        EObject lv_imports_38_0 = null;

        EObject lv_containedCollaborations_42_0 = null;

        EObject lv_containedCollaborations_44_0 = null;

        EObject lv_eventParameterRanges_48_0 = null;

        EObject lv_eventParameterRanges_50_0 = null;

        EObject lv_channelOptions_53_0 = null;



        	enterRule();

        try {
            // InternalSML.g:78:2: ( ( () otherlv_1= 'Specification' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'controllableEClasses' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'nonSpontaneousOperations' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'includedCollaborations' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'imports' otherlv_35= '{' ( (lv_imports_36_0= ruleDummyExprClass ) ) (otherlv_37= ',' ( (lv_imports_38_0= ruleDummyExprClass ) ) )* otherlv_39= '}' )? (otherlv_40= 'containedCollaborations' otherlv_41= '{' ( (lv_containedCollaborations_42_0= ruleCollaboration ) ) (otherlv_43= ',' ( (lv_containedCollaborations_44_0= ruleCollaboration ) ) )* otherlv_45= '}' )? (otherlv_46= 'eventParameterRanges' otherlv_47= '{' ( (lv_eventParameterRanges_48_0= ruleEventParameterRanges ) ) (otherlv_49= ',' ( (lv_eventParameterRanges_50_0= ruleEventParameterRanges ) ) )* otherlv_51= '}' )? (otherlv_52= 'channelOptions' ( (lv_channelOptions_53_0= ruleChannelOptions ) ) )? otherlv_54= '}' ) )
            // InternalSML.g:79:2: ( () otherlv_1= 'Specification' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'controllableEClasses' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'nonSpontaneousOperations' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'includedCollaborations' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'imports' otherlv_35= '{' ( (lv_imports_36_0= ruleDummyExprClass ) ) (otherlv_37= ',' ( (lv_imports_38_0= ruleDummyExprClass ) ) )* otherlv_39= '}' )? (otherlv_40= 'containedCollaborations' otherlv_41= '{' ( (lv_containedCollaborations_42_0= ruleCollaboration ) ) (otherlv_43= ',' ( (lv_containedCollaborations_44_0= ruleCollaboration ) ) )* otherlv_45= '}' )? (otherlv_46= 'eventParameterRanges' otherlv_47= '{' ( (lv_eventParameterRanges_48_0= ruleEventParameterRanges ) ) (otherlv_49= ',' ( (lv_eventParameterRanges_50_0= ruleEventParameterRanges ) ) )* otherlv_51= '}' )? (otherlv_52= 'channelOptions' ( (lv_channelOptions_53_0= ruleChannelOptions ) ) )? otherlv_54= '}' )
            {
            // InternalSML.g:79:2: ( () otherlv_1= 'Specification' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'controllableEClasses' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'nonSpontaneousOperations' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'includedCollaborations' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'imports' otherlv_35= '{' ( (lv_imports_36_0= ruleDummyExprClass ) ) (otherlv_37= ',' ( (lv_imports_38_0= ruleDummyExprClass ) ) )* otherlv_39= '}' )? (otherlv_40= 'containedCollaborations' otherlv_41= '{' ( (lv_containedCollaborations_42_0= ruleCollaboration ) ) (otherlv_43= ',' ( (lv_containedCollaborations_44_0= ruleCollaboration ) ) )* otherlv_45= '}' )? (otherlv_46= 'eventParameterRanges' otherlv_47= '{' ( (lv_eventParameterRanges_48_0= ruleEventParameterRanges ) ) (otherlv_49= ',' ( (lv_eventParameterRanges_50_0= ruleEventParameterRanges ) ) )* otherlv_51= '}' )? (otherlv_52= 'channelOptions' ( (lv_channelOptions_53_0= ruleChannelOptions ) ) )? otherlv_54= '}' )
            // InternalSML.g:80:3: () otherlv_1= 'Specification' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'controllableEClasses' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'nonSpontaneousOperations' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'includedCollaborations' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'imports' otherlv_35= '{' ( (lv_imports_36_0= ruleDummyExprClass ) ) (otherlv_37= ',' ( (lv_imports_38_0= ruleDummyExprClass ) ) )* otherlv_39= '}' )? (otherlv_40= 'containedCollaborations' otherlv_41= '{' ( (lv_containedCollaborations_42_0= ruleCollaboration ) ) (otherlv_43= ',' ( (lv_containedCollaborations_44_0= ruleCollaboration ) ) )* otherlv_45= '}' )? (otherlv_46= 'eventParameterRanges' otherlv_47= '{' ( (lv_eventParameterRanges_48_0= ruleEventParameterRanges ) ) (otherlv_49= ',' ( (lv_eventParameterRanges_50_0= ruleEventParameterRanges ) ) )* otherlv_51= '}' )? (otherlv_52= 'channelOptions' ( (lv_channelOptions_53_0= ruleChannelOptions ) ) )? otherlv_54= '}'
            {
            // InternalSML.g:80:3: ()
            // InternalSML.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpecificationAccess().getSpecificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSpecificationAccess().getSpecificationKeyword_1());
            		
            // InternalSML.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSML.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalSML.g:92:4: (lv_name_2_0= ruleEString )
            // InternalSML.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSML.g:114:3: (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSML.g:115:4: otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getSpecificationAccess().getDomainsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSpecificationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalSML.g:123:4: ( ( ruleEString ) )
                    // InternalSML.g:124:5: ( ruleEString )
                    {
                    // InternalSML.g:124:5: ( ruleEString )
                    // InternalSML.g:125:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpecificationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSpecificationAccess().getDomainsEPackageCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:139:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSML.g:140:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSpecificationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSML.g:144:5: ( ( ruleEString ) )
                    	    // InternalSML.g:145:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:145:6: ( ruleEString )
                    	    // InternalSML.g:146:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSpecificationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSpecificationAccess().getDomainsEPackageCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:166:3: (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSML.g:167:4: otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getSpecificationAccess().getContextsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getSpecificationAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalSML.g:175:4: ( ( ruleEString ) )
                    // InternalSML.g:176:5: ( ruleEString )
                    {
                    // InternalSML.g:176:5: ( ruleEString )
                    // InternalSML.g:177:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpecificationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSpecificationAccess().getContextsEPackageCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:191:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSML.g:192:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSpecificationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSML.g:196:5: ( ( ruleEString ) )
                    	    // InternalSML.g:197:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:197:6: ( ruleEString )
                    	    // InternalSML.g:198:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSpecificationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSpecificationAccess().getContextsEPackageCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:218:3: (otherlv_16= 'controllableEClasses' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSML.g:219:4: otherlv_16= 'controllableEClasses' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getSpecificationAccess().getControllableEClassesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getSpecificationAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalSML.g:227:4: ( ( ruleEString ) )
                    // InternalSML.g:228:5: ( ruleEString )
                    {
                    // InternalSML.g:228:5: ( ruleEString )
                    // InternalSML.g:229:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpecificationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSpecificationAccess().getControllableEClassesEClassCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:243:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSML.g:244:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getSpecificationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSML.g:248:5: ( ( ruleEString ) )
                    	    // InternalSML.g:249:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:249:6: ( ruleEString )
                    	    // InternalSML.g:250:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSpecificationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSpecificationAccess().getControllableEClassesEClassCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:270:3: (otherlv_22= 'nonSpontaneousOperations' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSML.g:271:4: otherlv_22= 'nonSpontaneousOperations' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')'
                    {
                    otherlv_22=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_22, grammarAccess.getSpecificationAccess().getNonSpontaneousOperationsKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getSpecificationAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalSML.g:279:4: ( ( ruleEString ) )
                    // InternalSML.g:280:5: ( ruleEString )
                    {
                    // InternalSML.g:280:5: ( ruleEString )
                    // InternalSML.g:281:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpecificationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSpecificationAccess().getNonSpontaneousOperationsETypedElementCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:295:4: (otherlv_25= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSML.g:296:5: otherlv_25= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_25=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getSpecificationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSML.g:300:5: ( ( ruleEString ) )
                    	    // InternalSML.g:301:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:301:6: ( ruleEString )
                    	    // InternalSML.g:302:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSpecificationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSpecificationAccess().getNonSpontaneousOperationsETypedElementCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_27, grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:322:3: (otherlv_28= 'includedCollaborations' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSML.g:323:4: otherlv_28= 'includedCollaborations' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')'
                    {
                    otherlv_28=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_28, grammarAccess.getSpecificationAccess().getIncludedCollaborationsKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_29, grammarAccess.getSpecificationAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalSML.g:331:4: ( ( ruleEString ) )
                    // InternalSML.g:332:5: ( ruleEString )
                    {
                    // InternalSML.g:332:5: ( ruleEString )
                    // InternalSML.g:333:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpecificationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSpecificationAccess().getIncludedCollaborationsCollaborationCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:347:4: (otherlv_31= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSML.g:348:5: otherlv_31= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_31=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getSpecificationAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSML.g:352:5: ( ( ruleEString ) )
                    	    // InternalSML.g:353:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:353:6: ( ruleEString )
                    	    // InternalSML.g:354:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSpecificationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSpecificationAccess().getIncludedCollaborationsCollaborationCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_33, grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:374:3: (otherlv_34= 'imports' otherlv_35= '{' ( (lv_imports_36_0= ruleDummyExprClass ) ) (otherlv_37= ',' ( (lv_imports_38_0= ruleDummyExprClass ) ) )* otherlv_39= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSML.g:375:4: otherlv_34= 'imports' otherlv_35= '{' ( (lv_imports_36_0= ruleDummyExprClass ) ) (otherlv_37= ',' ( (lv_imports_38_0= ruleDummyExprClass ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getSpecificationAccess().getImportsKeyword_9_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_35, grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalSML.g:383:4: ( (lv_imports_36_0= ruleDummyExprClass ) )
                    // InternalSML.g:384:5: (lv_imports_36_0= ruleDummyExprClass )
                    {
                    // InternalSML.g:384:5: (lv_imports_36_0= ruleDummyExprClass )
                    // InternalSML.g:385:6: lv_imports_36_0= ruleDummyExprClass
                    {

                    						newCompositeNode(grammarAccess.getSpecificationAccess().getImportsDummyExprClassParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_imports_36_0=ruleDummyExprClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_36_0,
                    							"org.prettyprinter.sml.SML.DummyExprClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:402:4: (otherlv_37= ',' ( (lv_imports_38_0= ruleDummyExprClass ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSML.g:403:5: otherlv_37= ',' ( (lv_imports_38_0= ruleDummyExprClass ) )
                    	    {
                    	    otherlv_37=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getSpecificationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalSML.g:407:5: ( (lv_imports_38_0= ruleDummyExprClass ) )
                    	    // InternalSML.g:408:6: (lv_imports_38_0= ruleDummyExprClass )
                    	    {
                    	    // InternalSML.g:408:6: (lv_imports_38_0= ruleDummyExprClass )
                    	    // InternalSML.g:409:7: lv_imports_38_0= ruleDummyExprClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getSpecificationAccess().getImportsDummyExprClassParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_imports_38_0=ruleDummyExprClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"imports",
                    	    								lv_imports_38_0,
                    	    								"org.prettyprinter.sml.SML.DummyExprClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_39, grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:432:3: (otherlv_40= 'containedCollaborations' otherlv_41= '{' ( (lv_containedCollaborations_42_0= ruleCollaboration ) ) (otherlv_43= ',' ( (lv_containedCollaborations_44_0= ruleCollaboration ) ) )* otherlv_45= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSML.g:433:4: otherlv_40= 'containedCollaborations' otherlv_41= '{' ( (lv_containedCollaborations_42_0= ruleCollaboration ) ) (otherlv_43= ',' ( (lv_containedCollaborations_44_0= ruleCollaboration ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getSpecificationAccess().getContainedCollaborationsKeyword_10_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_41, grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalSML.g:441:4: ( (lv_containedCollaborations_42_0= ruleCollaboration ) )
                    // InternalSML.g:442:5: (lv_containedCollaborations_42_0= ruleCollaboration )
                    {
                    // InternalSML.g:442:5: (lv_containedCollaborations_42_0= ruleCollaboration )
                    // InternalSML.g:443:6: lv_containedCollaborations_42_0= ruleCollaboration
                    {

                    						newCompositeNode(grammarAccess.getSpecificationAccess().getContainedCollaborationsCollaborationParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_containedCollaborations_42_0=ruleCollaboration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    						}
                    						add(
                    							current,
                    							"containedCollaborations",
                    							lv_containedCollaborations_42_0,
                    							"org.prettyprinter.sml.SML.Collaboration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:460:4: (otherlv_43= ',' ( (lv_containedCollaborations_44_0= ruleCollaboration ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSML.g:461:5: otherlv_43= ',' ( (lv_containedCollaborations_44_0= ruleCollaboration ) )
                    	    {
                    	    otherlv_43=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getSpecificationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalSML.g:465:5: ( (lv_containedCollaborations_44_0= ruleCollaboration ) )
                    	    // InternalSML.g:466:6: (lv_containedCollaborations_44_0= ruleCollaboration )
                    	    {
                    	    // InternalSML.g:466:6: (lv_containedCollaborations_44_0= ruleCollaboration )
                    	    // InternalSML.g:467:7: lv_containedCollaborations_44_0= ruleCollaboration
                    	    {

                    	    							newCompositeNode(grammarAccess.getSpecificationAccess().getContainedCollaborationsCollaborationParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_containedCollaborations_44_0=ruleCollaboration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containedCollaborations",
                    	    								lv_containedCollaborations_44_0,
                    	    								"org.prettyprinter.sml.SML.Collaboration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_45, grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:490:3: (otherlv_46= 'eventParameterRanges' otherlv_47= '{' ( (lv_eventParameterRanges_48_0= ruleEventParameterRanges ) ) (otherlv_49= ',' ( (lv_eventParameterRanges_50_0= ruleEventParameterRanges ) ) )* otherlv_51= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSML.g:491:4: otherlv_46= 'eventParameterRanges' otherlv_47= '{' ( (lv_eventParameterRanges_48_0= ruleEventParameterRanges ) ) (otherlv_49= ',' ( (lv_eventParameterRanges_50_0= ruleEventParameterRanges ) ) )* otherlv_51= '}'
                    {
                    otherlv_46=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_46, grammarAccess.getSpecificationAccess().getEventParameterRangesKeyword_11_0());
                    			
                    otherlv_47=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_47, grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalSML.g:499:4: ( (lv_eventParameterRanges_48_0= ruleEventParameterRanges ) )
                    // InternalSML.g:500:5: (lv_eventParameterRanges_48_0= ruleEventParameterRanges )
                    {
                    // InternalSML.g:500:5: (lv_eventParameterRanges_48_0= ruleEventParameterRanges )
                    // InternalSML.g:501:6: lv_eventParameterRanges_48_0= ruleEventParameterRanges
                    {

                    						newCompositeNode(grammarAccess.getSpecificationAccess().getEventParameterRangesEventParameterRangesParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eventParameterRanges_48_0=ruleEventParameterRanges();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    						}
                    						add(
                    							current,
                    							"eventParameterRanges",
                    							lv_eventParameterRanges_48_0,
                    							"org.prettyprinter.sml.SML.EventParameterRanges");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:518:4: (otherlv_49= ',' ( (lv_eventParameterRanges_50_0= ruleEventParameterRanges ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalSML.g:519:5: otherlv_49= ',' ( (lv_eventParameterRanges_50_0= ruleEventParameterRanges ) )
                    	    {
                    	    otherlv_49=(Token)match(input,15,FOLLOW_18); 

                    	    					newLeafNode(otherlv_49, grammarAccess.getSpecificationAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalSML.g:523:5: ( (lv_eventParameterRanges_50_0= ruleEventParameterRanges ) )
                    	    // InternalSML.g:524:6: (lv_eventParameterRanges_50_0= ruleEventParameterRanges )
                    	    {
                    	    // InternalSML.g:524:6: (lv_eventParameterRanges_50_0= ruleEventParameterRanges )
                    	    // InternalSML.g:525:7: lv_eventParameterRanges_50_0= ruleEventParameterRanges
                    	    {

                    	    							newCompositeNode(grammarAccess.getSpecificationAccess().getEventParameterRangesEventParameterRangesParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eventParameterRanges_50_0=ruleEventParameterRanges();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eventParameterRanges",
                    	    								lv_eventParameterRanges_50_0,
                    	    								"org.prettyprinter.sml.SML.EventParameterRanges");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_51=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_51, grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:548:3: (otherlv_52= 'channelOptions' ( (lv_channelOptions_53_0= ruleChannelOptions ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSML.g:549:4: otherlv_52= 'channelOptions' ( (lv_channelOptions_53_0= ruleChannelOptions ) )
                    {
                    otherlv_52=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_52, grammarAccess.getSpecificationAccess().getChannelOptionsKeyword_12_0());
                    			
                    // InternalSML.g:553:4: ( (lv_channelOptions_53_0= ruleChannelOptions ) )
                    // InternalSML.g:554:5: (lv_channelOptions_53_0= ruleChannelOptions )
                    {
                    // InternalSML.g:554:5: (lv_channelOptions_53_0= ruleChannelOptions )
                    // InternalSML.g:555:6: lv_channelOptions_53_0= ruleChannelOptions
                    {

                    						newCompositeNode(grammarAccess.getSpecificationAccess().getChannelOptionsChannelOptionsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_channelOptions_53_0=ruleChannelOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    						}
                    						set(
                    							current,
                    							"channelOptions",
                    							lv_channelOptions_53_0,
                    							"org.prettyprinter.sml.SML.ChannelOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_54=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_54, grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleDummyExprClass"
    // InternalSML.g:581:1: entryRuleDummyExprClass returns [EObject current=null] : iv_ruleDummyExprClass= ruleDummyExprClass EOF ;
    public final EObject entryRuleDummyExprClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDummyExprClass = null;


        try {
            // InternalSML.g:581:55: (iv_ruleDummyExprClass= ruleDummyExprClass EOF )
            // InternalSML.g:582:2: iv_ruleDummyExprClass= ruleDummyExprClass EOF
            {
             newCompositeNode(grammarAccess.getDummyExprClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDummyExprClass=ruleDummyExprClass();

            state._fsp--;

             current =iv_ruleDummyExprClass; 
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
    // $ANTLR end "entryRuleDummyExprClass"


    // $ANTLR start "ruleDummyExprClass"
    // InternalSML.g:588:1: ruleDummyExprClass returns [EObject current=null] : (this_DummyExprClass_Impl_0= ruleDummyExprClass_Impl | this_Interaction_1= ruleInteraction ) ;
    public final EObject ruleDummyExprClass() throws RecognitionException {
        EObject current = null;

        EObject this_DummyExprClass_Impl_0 = null;

        EObject this_Interaction_1 = null;



        	enterRule();

        try {
            // InternalSML.g:594:2: ( (this_DummyExprClass_Impl_0= ruleDummyExprClass_Impl | this_Interaction_1= ruleInteraction ) )
            // InternalSML.g:595:2: (this_DummyExprClass_Impl_0= ruleDummyExprClass_Impl | this_Interaction_1= ruleInteraction )
            {
            // InternalSML.g:595:2: (this_DummyExprClass_Impl_0= ruleDummyExprClass_Impl | this_Interaction_1= ruleInteraction )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            else if ( (LA18_0==52) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSML.g:596:3: this_DummyExprClass_Impl_0= ruleDummyExprClass_Impl
                    {

                    			newCompositeNode(grammarAccess.getDummyExprClassAccess().getDummyExprClass_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DummyExprClass_Impl_0=ruleDummyExprClass_Impl();

                    state._fsp--;


                    			current = this_DummyExprClass_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSML.g:605:3: this_Interaction_1= ruleInteraction
                    {

                    			newCompositeNode(grammarAccess.getDummyExprClassAccess().getInteractionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interaction_1=ruleInteraction();

                    state._fsp--;


                    			current = this_Interaction_1;
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
    // $ANTLR end "ruleDummyExprClass"


    // $ANTLR start "entryRuleEClassifier"
    // InternalSML.g:617:1: entryRuleEClassifier returns [EObject current=null] : iv_ruleEClassifier= ruleEClassifier EOF ;
    public final EObject entryRuleEClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassifier = null;


        try {
            // InternalSML.g:617:52: (iv_ruleEClassifier= ruleEClassifier EOF )
            // InternalSML.g:618:2: iv_ruleEClassifier= ruleEClassifier EOF
            {
             newCompositeNode(grammarAccess.getEClassifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEClassifier=ruleEClassifier();

            state._fsp--;

             current =iv_ruleEClassifier; 
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
    // $ANTLR end "entryRuleEClassifier"


    // $ANTLR start "ruleEClassifier"
    // InternalSML.g:624:1: ruleEClassifier returns [EObject current=null] : (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum ) ;
    public final EObject ruleEClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_EClass_0 = null;

        EObject this_EDataType_Impl_1 = null;

        EObject this_EEnum_2 = null;



        	enterRule();

        try {
            // InternalSML.g:630:2: ( (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum ) )
            // InternalSML.g:631:2: (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum )
            {
            // InternalSML.g:631:2: (this_EClass_0= ruleEClass | this_EDataType_Impl_1= ruleEDataType_Impl | this_EEnum_2= ruleEEnum )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 33:
            case 34:
            case 35:
                {
                alt19=1;
                }
                break;
            case 105:
                {
                alt19=2;
                }
                break;
            case 107:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSML.g:632:3: this_EClass_0= ruleEClass
                    {

                    			newCompositeNode(grammarAccess.getEClassifierAccess().getEClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EClass_0=ruleEClass();

                    state._fsp--;


                    			current = this_EClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSML.g:641:3: this_EDataType_Impl_1= ruleEDataType_Impl
                    {

                    			newCompositeNode(grammarAccess.getEClassifierAccess().getEDataType_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EDataType_Impl_1=ruleEDataType_Impl();

                    state._fsp--;


                    			current = this_EDataType_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSML.g:650:3: this_EEnum_2= ruleEEnum
                    {

                    			newCompositeNode(grammarAccess.getEClassifierAccess().getEEnumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EEnum_2=ruleEEnum();

                    state._fsp--;


                    			current = this_EEnum_2;
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
    // $ANTLR end "ruleEClassifier"


    // $ANTLR start "entryRuleEStructuralFeature"
    // InternalSML.g:662:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // InternalSML.g:662:59: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // InternalSML.g:663:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getEStructuralFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEStructuralFeature=ruleEStructuralFeature();

            state._fsp--;

             current =iv_ruleEStructuralFeature; 
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
    // $ANTLR end "entryRuleEStructuralFeature"


    // $ANTLR start "ruleEStructuralFeature"
    // InternalSML.g:669:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;



        	enterRule();

        try {
            // InternalSML.g:675:2: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // InternalSML.g:676:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // InternalSML.g:676:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt20=2;
            switch ( input.LA(1) ) {
            case 134:
                {
                switch ( input.LA(2) ) {
                case 135:
                    {
                    switch ( input.LA(3) ) {
                    case 136:
                        {
                        switch ( input.LA(4) ) {
                        case 137:
                            {
                            int LA20_4 = input.LA(5);

                            if ( ((LA20_4>=148 && LA20_4<=149)) ) {
                                alt20=2;
                            }
                            else if ( ((LA20_4>=138 && LA20_4<=139)) ) {
                                alt20=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 138:
                        case 139:
                            {
                            alt20=1;
                            }
                            break;
                        case 148:
                        case 149:
                            {
                            alt20=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 137:
                        {
                        int LA20_4 = input.LA(4);

                        if ( ((LA20_4>=148 && LA20_4<=149)) ) {
                            alt20=2;
                        }
                        else if ( ((LA20_4>=138 && LA20_4<=139)) ) {
                            alt20=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 138:
                    case 139:
                        {
                        alt20=1;
                        }
                        break;
                    case 148:
                    case 149:
                        {
                        alt20=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 136:
                    {
                    switch ( input.LA(3) ) {
                    case 137:
                        {
                        int LA20_4 = input.LA(4);

                        if ( ((LA20_4>=148 && LA20_4<=149)) ) {
                            alt20=2;
                        }
                        else if ( ((LA20_4>=138 && LA20_4<=139)) ) {
                            alt20=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 138:
                    case 139:
                        {
                        alt20=1;
                        }
                        break;
                    case 148:
                    case 149:
                        {
                        alt20=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 137:
                    {
                    int LA20_4 = input.LA(3);

                    if ( ((LA20_4>=148 && LA20_4<=149)) ) {
                        alt20=2;
                    }
                    else if ( ((LA20_4>=138 && LA20_4<=139)) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 148:
                case 149:
                    {
                    alt20=2;
                    }
                    break;
                case 138:
                case 139:
                    {
                    alt20=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

                }
                break;
            case 135:
                {
                switch ( input.LA(2) ) {
                case 136:
                    {
                    switch ( input.LA(3) ) {
                    case 137:
                        {
                        int LA20_4 = input.LA(4);

                        if ( ((LA20_4>=148 && LA20_4<=149)) ) {
                            alt20=2;
                        }
                        else if ( ((LA20_4>=138 && LA20_4<=139)) ) {
                            alt20=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 138:
                    case 139:
                        {
                        alt20=1;
                        }
                        break;
                    case 148:
                    case 149:
                        {
                        alt20=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 137:
                    {
                    int LA20_4 = input.LA(3);

                    if ( ((LA20_4>=148 && LA20_4<=149)) ) {
                        alt20=2;
                    }
                    else if ( ((LA20_4>=138 && LA20_4<=139)) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 138:
                case 139:
                    {
                    alt20=1;
                    }
                    break;
                case 148:
                case 149:
                    {
                    alt20=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }

                }
                break;
            case 136:
                {
                switch ( input.LA(2) ) {
                case 137:
                    {
                    int LA20_4 = input.LA(3);

                    if ( ((LA20_4>=148 && LA20_4<=149)) ) {
                        alt20=2;
                    }
                    else if ( ((LA20_4>=138 && LA20_4<=139)) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 138:
                case 139:
                    {
                    alt20=1;
                    }
                    break;
                case 148:
                case 149:
                    {
                    alt20=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }

                }
                break;
            case 137:
                {
                int LA20_4 = input.LA(2);

                if ( ((LA20_4>=148 && LA20_4<=149)) ) {
                    alt20=2;
                }
                else if ( ((LA20_4>=138 && LA20_4<=139)) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 4, input);

                    throw nvae;
                }
                }
                break;
            case 138:
            case 139:
                {
                alt20=1;
                }
                break;
            case 148:
            case 149:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalSML.g:677:3: this_EAttribute_0= ruleEAttribute
                    {

                    			newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EAttribute_0=ruleEAttribute();

                    state._fsp--;


                    			current = this_EAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSML.g:686:3: this_EReference_1= ruleEReference
                    {

                    			newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EReference_1=ruleEReference();

                    state._fsp--;


                    			current = this_EReference_1;
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
    // $ANTLR end "ruleEStructuralFeature"


    // $ANTLR start "entryRuleInteractionFragment"
    // InternalSML.g:698:1: entryRuleInteractionFragment returns [EObject current=null] : iv_ruleInteractionFragment= ruleInteractionFragment EOF ;
    public final EObject entryRuleInteractionFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionFragment = null;


        try {
            // InternalSML.g:698:60: (iv_ruleInteractionFragment= ruleInteractionFragment EOF )
            // InternalSML.g:699:2: iv_ruleInteractionFragment= ruleInteractionFragment EOF
            {
             newCompositeNode(grammarAccess.getInteractionFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteractionFragment=ruleInteractionFragment();

            state._fsp--;

             current =iv_ruleInteractionFragment; 
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
    // $ANTLR end "entryRuleInteractionFragment"


    // $ANTLR start "ruleInteractionFragment"
    // InternalSML.g:705:1: ruleInteractionFragment returns [EObject current=null] : (this_Interaction_0= ruleInteraction | this_ModalMessage_1= ruleModalMessage | this_Alternative_2= ruleAlternative | this_Loop_3= ruleLoop | this_Parallel_4= ruleParallel | this_WaitCondition_5= ruleWaitCondition | this_InterruptCondition_6= ruleInterruptCondition | this_ViolationCondition_7= ruleViolationCondition | this_Condition_8= ruleCondition | this_VariableFragment_9= ruleVariableFragment | this_TimedViolationCondition_10= ruleTimedViolationCondition | this_TimedInterruptCondition_11= ruleTimedInterruptCondition | this_TimedWaitCondition_12= ruleTimedWaitCondition | this_ClockFragment_13= ruleClockFragment ) ;
    public final EObject ruleInteractionFragment() throws RecognitionException {
        EObject current = null;

        EObject this_Interaction_0 = null;

        EObject this_ModalMessage_1 = null;

        EObject this_Alternative_2 = null;

        EObject this_Loop_3 = null;

        EObject this_Parallel_4 = null;

        EObject this_WaitCondition_5 = null;

        EObject this_InterruptCondition_6 = null;

        EObject this_ViolationCondition_7 = null;

        EObject this_Condition_8 = null;

        EObject this_VariableFragment_9 = null;

        EObject this_TimedViolationCondition_10 = null;

        EObject this_TimedInterruptCondition_11 = null;

        EObject this_TimedWaitCondition_12 = null;

        EObject this_ClockFragment_13 = null;



        	enterRule();

        try {
            // InternalSML.g:711:2: ( (this_Interaction_0= ruleInteraction | this_ModalMessage_1= ruleModalMessage | this_Alternative_2= ruleAlternative | this_Loop_3= ruleLoop | this_Parallel_4= ruleParallel | this_WaitCondition_5= ruleWaitCondition | this_InterruptCondition_6= ruleInterruptCondition | this_ViolationCondition_7= ruleViolationCondition | this_Condition_8= ruleCondition | this_VariableFragment_9= ruleVariableFragment | this_TimedViolationCondition_10= ruleTimedViolationCondition | this_TimedInterruptCondition_11= ruleTimedInterruptCondition | this_TimedWaitCondition_12= ruleTimedWaitCondition | this_ClockFragment_13= ruleClockFragment ) )
            // InternalSML.g:712:2: (this_Interaction_0= ruleInteraction | this_ModalMessage_1= ruleModalMessage | this_Alternative_2= ruleAlternative | this_Loop_3= ruleLoop | this_Parallel_4= ruleParallel | this_WaitCondition_5= ruleWaitCondition | this_InterruptCondition_6= ruleInterruptCondition | this_ViolationCondition_7= ruleViolationCondition | this_Condition_8= ruleCondition | this_VariableFragment_9= ruleVariableFragment | this_TimedViolationCondition_10= ruleTimedViolationCondition | this_TimedInterruptCondition_11= ruleTimedInterruptCondition | this_TimedWaitCondition_12= ruleTimedWaitCondition | this_ClockFragment_13= ruleClockFragment )
            {
            // InternalSML.g:712:2: (this_Interaction_0= ruleInteraction | this_ModalMessage_1= ruleModalMessage | this_Alternative_2= ruleAlternative | this_Loop_3= ruleLoop | this_Parallel_4= ruleParallel | this_WaitCondition_5= ruleWaitCondition | this_InterruptCondition_6= ruleInterruptCondition | this_ViolationCondition_7= ruleViolationCondition | this_Condition_8= ruleCondition | this_VariableFragment_9= ruleVariableFragment | this_TimedViolationCondition_10= ruleTimedViolationCondition | this_TimedInterruptCondition_11= ruleTimedInterruptCondition | this_TimedWaitCondition_12= ruleTimedWaitCondition | this_ClockFragment_13= ruleClockFragment )
            int alt21=14;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalSML.g:713:3: this_Interaction_0= ruleInteraction
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getInteractionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interaction_0=ruleInteraction();

                    state._fsp--;


                    			current = this_Interaction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSML.g:722:3: this_ModalMessage_1= ruleModalMessage
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getModalMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModalMessage_1=ruleModalMessage();

                    state._fsp--;


                    			current = this_ModalMessage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSML.g:731:3: this_Alternative_2= ruleAlternative
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getAlternativeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Alternative_2=ruleAlternative();

                    state._fsp--;


                    			current = this_Alternative_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSML.g:740:3: this_Loop_3= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_3=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSML.g:749:3: this_Parallel_4= ruleParallel
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getParallelParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parallel_4=ruleParallel();

                    state._fsp--;


                    			current = this_Parallel_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSML.g:758:3: this_WaitCondition_5= ruleWaitCondition
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getWaitConditionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_WaitCondition_5=ruleWaitCondition();

                    state._fsp--;


                    			current = this_WaitCondition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSML.g:767:3: this_InterruptCondition_6= ruleInterruptCondition
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getInterruptConditionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_InterruptCondition_6=ruleInterruptCondition();

                    state._fsp--;


                    			current = this_InterruptCondition_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSML.g:776:3: this_ViolationCondition_7= ruleViolationCondition
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getViolationConditionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ViolationCondition_7=ruleViolationCondition();

                    state._fsp--;


                    			current = this_ViolationCondition_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSML.g:785:3: this_Condition_8= ruleCondition
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getConditionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condition_8=ruleCondition();

                    state._fsp--;


                    			current = this_Condition_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSML.g:794:3: this_VariableFragment_9= ruleVariableFragment
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getVariableFragmentParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableFragment_9=ruleVariableFragment();

                    state._fsp--;


                    			current = this_VariableFragment_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalSML.g:803:3: this_TimedViolationCondition_10= ruleTimedViolationCondition
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getTimedViolationConditionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimedViolationCondition_10=ruleTimedViolationCondition();

                    state._fsp--;


                    			current = this_TimedViolationCondition_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalSML.g:812:3: this_TimedInterruptCondition_11= ruleTimedInterruptCondition
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getTimedInterruptConditionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimedInterruptCondition_11=ruleTimedInterruptCondition();

                    state._fsp--;


                    			current = this_TimedInterruptCondition_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalSML.g:821:3: this_TimedWaitCondition_12= ruleTimedWaitCondition
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getTimedWaitConditionParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimedWaitCondition_12=ruleTimedWaitCondition();

                    state._fsp--;


                    			current = this_TimedWaitCondition_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalSML.g:830:3: this_ClockFragment_13= ruleClockFragment
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getClockFragmentParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClockFragment_13=ruleClockFragment();

                    state._fsp--;


                    			current = this_ClockFragment_13;
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
    // $ANTLR end "ruleInteractionFragment"


    // $ANTLR start "entryRuleMessage"
    // InternalSML.g:842:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalSML.g:842:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalSML.g:843:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalSML.g:849:1: ruleMessage returns [EObject current=null] : (this_Message_Impl_0= ruleMessage_Impl | this_ModalMessage_1= ruleModalMessage ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_Message_Impl_0 = null;

        EObject this_ModalMessage_1 = null;



        	enterRule();

        try {
            // InternalSML.g:855:2: ( (this_Message_Impl_0= ruleMessage_Impl | this_ModalMessage_1= ruleModalMessage ) )
            // InternalSML.g:856:2: (this_Message_Impl_0= ruleMessage_Impl | this_ModalMessage_1= ruleModalMessage )
            {
            // InternalSML.g:856:2: (this_Message_Impl_0= ruleMessage_Impl | this_ModalMessage_1= ruleModalMessage )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==157) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=60 && LA22_0<=62)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSML.g:857:3: this_Message_Impl_0= ruleMessage_Impl
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getMessage_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Message_Impl_0=ruleMessage_Impl();

                    state._fsp--;


                    			current = this_Message_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSML.g:866:3: this_ModalMessage_1= ruleModalMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getModalMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModalMessage_1=ruleModalMessage();

                    state._fsp--;


                    			current = this_ModalMessage_1;
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleBindingExpression"
    // InternalSML.g:878:1: entryRuleBindingExpression returns [EObject current=null] : iv_ruleBindingExpression= ruleBindingExpression EOF ;
    public final EObject entryRuleBindingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingExpression = null;


        try {
            // InternalSML.g:878:58: (iv_ruleBindingExpression= ruleBindingExpression EOF )
            // InternalSML.g:879:2: iv_ruleBindingExpression= ruleBindingExpression EOF
            {
             newCompositeNode(grammarAccess.getBindingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindingExpression=ruleBindingExpression();

            state._fsp--;

             current =iv_ruleBindingExpression; 
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
    // $ANTLR end "entryRuleBindingExpression"


    // $ANTLR start "ruleBindingExpression"
    // InternalSML.g:885:1: ruleBindingExpression returns [EObject current=null] : (this_FeatureAccessBindingExpression_0= ruleFeatureAccessBindingExpression | this_ObjectQueryBindingExpression_1= ruleObjectQueryBindingExpression | this_ParameterExpression_Impl_2= ruleParameterExpression_Impl | this_WildcardParameterExpression_3= ruleWildcardParameterExpression | this_ValueParameterExpression_4= ruleValueParameterExpression | this_VariableBindingParameterExpression_5= ruleVariableBindingParameterExpression ) ;
    public final EObject ruleBindingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureAccessBindingExpression_0 = null;

        EObject this_ObjectQueryBindingExpression_1 = null;

        EObject this_ParameterExpression_Impl_2 = null;

        EObject this_WildcardParameterExpression_3 = null;

        EObject this_ValueParameterExpression_4 = null;

        EObject this_VariableBindingParameterExpression_5 = null;



        	enterRule();

        try {
            // InternalSML.g:891:2: ( (this_FeatureAccessBindingExpression_0= ruleFeatureAccessBindingExpression | this_ObjectQueryBindingExpression_1= ruleObjectQueryBindingExpression | this_ParameterExpression_Impl_2= ruleParameterExpression_Impl | this_WildcardParameterExpression_3= ruleWildcardParameterExpression | this_ValueParameterExpression_4= ruleValueParameterExpression | this_VariableBindingParameterExpression_5= ruleVariableBindingParameterExpression ) )
            // InternalSML.g:892:2: (this_FeatureAccessBindingExpression_0= ruleFeatureAccessBindingExpression | this_ObjectQueryBindingExpression_1= ruleObjectQueryBindingExpression | this_ParameterExpression_Impl_2= ruleParameterExpression_Impl | this_WildcardParameterExpression_3= ruleWildcardParameterExpression | this_ValueParameterExpression_4= ruleValueParameterExpression | this_VariableBindingParameterExpression_5= ruleVariableBindingParameterExpression )
            {
            // InternalSML.g:892:2: (this_FeatureAccessBindingExpression_0= ruleFeatureAccessBindingExpression | this_ObjectQueryBindingExpression_1= ruleObjectQueryBindingExpression | this_ParameterExpression_Impl_2= ruleParameterExpression_Impl | this_WildcardParameterExpression_3= ruleWildcardParameterExpression | this_ValueParameterExpression_4= ruleValueParameterExpression | this_VariableBindingParameterExpression_5= ruleVariableBindingParameterExpression )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 122:
                {
                alt23=1;
                }
                break;
            case 124:
                {
                alt23=2;
                }
                break;
            case 127:
                {
                alt23=3;
                }
                break;
            case 128:
                {
                alt23=4;
                }
                break;
            case 129:
                {
                alt23=5;
                }
                break;
            case 130:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalSML.g:893:3: this_FeatureAccessBindingExpression_0= ruleFeatureAccessBindingExpression
                    {

                    			newCompositeNode(grammarAccess.getBindingExpressionAccess().getFeatureAccessBindingExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureAccessBindingExpression_0=ruleFeatureAccessBindingExpression();

                    state._fsp--;


                    			current = this_FeatureAccessBindingExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSML.g:902:3: this_ObjectQueryBindingExpression_1= ruleObjectQueryBindingExpression
                    {

                    			newCompositeNode(grammarAccess.getBindingExpressionAccess().getObjectQueryBindingExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectQueryBindingExpression_1=ruleObjectQueryBindingExpression();

                    state._fsp--;


                    			current = this_ObjectQueryBindingExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSML.g:911:3: this_ParameterExpression_Impl_2= ruleParameterExpression_Impl
                    {

                    			newCompositeNode(grammarAccess.getBindingExpressionAccess().getParameterExpression_ImplParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterExpression_Impl_2=ruleParameterExpression_Impl();

                    state._fsp--;


                    			current = this_ParameterExpression_Impl_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSML.g:920:3: this_WildcardParameterExpression_3= ruleWildcardParameterExpression
                    {

                    			newCompositeNode(grammarAccess.getBindingExpressionAccess().getWildcardParameterExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WildcardParameterExpression_3=ruleWildcardParameterExpression();

                    state._fsp--;


                    			current = this_WildcardParameterExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSML.g:929:3: this_ValueParameterExpression_4= ruleValueParameterExpression
                    {

                    			newCompositeNode(grammarAccess.getBindingExpressionAccess().getValueParameterExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueParameterExpression_4=ruleValueParameterExpression();

                    state._fsp--;


                    			current = this_ValueParameterExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSML.g:938:3: this_VariableBindingParameterExpression_5= ruleVariableBindingParameterExpression
                    {

                    			newCompositeNode(grammarAccess.getBindingExpressionAccess().getVariableBindingParameterExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableBindingParameterExpression_5=ruleVariableBindingParameterExpression();

                    state._fsp--;


                    			current = this_VariableBindingParameterExpression_5;
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
    // $ANTLR end "ruleBindingExpression"


    // $ANTLR start "entryRuleAbstractRanges"
    // InternalSML.g:950:1: entryRuleAbstractRanges returns [EObject current=null] : iv_ruleAbstractRanges= ruleAbstractRanges EOF ;
    public final EObject entryRuleAbstractRanges() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRanges = null;


        try {
            // InternalSML.g:950:55: (iv_ruleAbstractRanges= ruleAbstractRanges EOF )
            // InternalSML.g:951:2: iv_ruleAbstractRanges= ruleAbstractRanges EOF
            {
             newCompositeNode(grammarAccess.getAbstractRangesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractRanges=ruleAbstractRanges();

            state._fsp--;

             current =iv_ruleAbstractRanges; 
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
    // $ANTLR end "entryRuleAbstractRanges"


    // $ANTLR start "ruleAbstractRanges"
    // InternalSML.g:957:1: ruleAbstractRanges returns [EObject current=null] : (this_IntegerRanges_0= ruleIntegerRanges | this_StringRanges_1= ruleStringRanges | this_EnumRanges_2= ruleEnumRanges ) ;
    public final EObject ruleAbstractRanges() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerRanges_0 = null;

        EObject this_StringRanges_1 = null;

        EObject this_EnumRanges_2 = null;



        	enterRule();

        try {
            // InternalSML.g:963:2: ( (this_IntegerRanges_0= ruleIntegerRanges | this_StringRanges_1= ruleStringRanges | this_EnumRanges_2= ruleEnumRanges ) )
            // InternalSML.g:964:2: (this_IntegerRanges_0= ruleIntegerRanges | this_StringRanges_1= ruleStringRanges | this_EnumRanges_2= ruleEnumRanges )
            {
            // InternalSML.g:964:2: (this_IntegerRanges_0= ruleIntegerRanges | this_StringRanges_1= ruleStringRanges | this_EnumRanges_2= ruleEnumRanges )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 178:
                {
                alt24=1;
                }
                break;
            case 182:
                {
                alt24=2;
                }
                break;
            case 183:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalSML.g:965:3: this_IntegerRanges_0= ruleIntegerRanges
                    {

                    			newCompositeNode(grammarAccess.getAbstractRangesAccess().getIntegerRangesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerRanges_0=ruleIntegerRanges();

                    state._fsp--;


                    			current = this_IntegerRanges_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSML.g:974:3: this_StringRanges_1= ruleStringRanges
                    {

                    			newCompositeNode(grammarAccess.getAbstractRangesAccess().getStringRangesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringRanges_1=ruleStringRanges();

                    state._fsp--;


                    			current = this_StringRanges_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSML.g:983:3: this_EnumRanges_2= ruleEnumRanges
                    {

                    			newCompositeNode(grammarAccess.getAbstractRangesAccess().getEnumRangesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumRanges_2=ruleEnumRanges();

                    state._fsp--;


                    			current = this_EnumRanges_2;
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
    // $ANTLR end "ruleAbstractRanges"


    // $ANTLR start "entryRuleEString"
    // InternalSML.g:995:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSML.g:995:47: (iv_ruleEString= ruleEString EOF )
            // InternalSML.g:996:2: iv_ruleEString= ruleEString EOF
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
    // InternalSML.g:1002:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSML.g:1008:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSML.g:1009:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSML.g:1009:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSML.g:1010:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSML.g:1018:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleDummyExprClass_Impl"
    // InternalSML.g:1029:1: entryRuleDummyExprClass_Impl returns [EObject current=null] : iv_ruleDummyExprClass_Impl= ruleDummyExprClass_Impl EOF ;
    public final EObject entryRuleDummyExprClass_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDummyExprClass_Impl = null;


        try {
            // InternalSML.g:1029:60: (iv_ruleDummyExprClass_Impl= ruleDummyExprClass_Impl EOF )
            // InternalSML.g:1030:2: iv_ruleDummyExprClass_Impl= ruleDummyExprClass_Impl EOF
            {
             newCompositeNode(grammarAccess.getDummyExprClass_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDummyExprClass_Impl=ruleDummyExprClass_Impl();

            state._fsp--;

             current =iv_ruleDummyExprClass_Impl; 
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
    // $ANTLR end "entryRuleDummyExprClass_Impl"


    // $ANTLR start "ruleDummyExprClass_Impl"
    // InternalSML.g:1036:1: ruleDummyExprClass_Impl returns [EObject current=null] : ( () otherlv_1= 'DummyExprClass' ) ;
    public final EObject ruleDummyExprClass_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSML.g:1042:2: ( ( () otherlv_1= 'DummyExprClass' ) )
            // InternalSML.g:1043:2: ( () otherlv_1= 'DummyExprClass' )
            {
            // InternalSML.g:1043:2: ( () otherlv_1= 'DummyExprClass' )
            // InternalSML.g:1044:3: () otherlv_1= 'DummyExprClass'
            {
            // InternalSML.g:1044:3: ()
            // InternalSML.g:1045:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDummyExprClass_ImplAccess().getDummyExprClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDummyExprClass_ImplAccess().getDummyExprClassKeyword_1());
            		

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
    // $ANTLR end "ruleDummyExprClass_Impl"


    // $ANTLR start "entryRuleEPackage"
    // InternalSML.g:1059:1: entryRuleEPackage returns [EObject current=null] : iv_ruleEPackage= ruleEPackage EOF ;
    public final EObject entryRuleEPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackage = null;


        try {
            // InternalSML.g:1059:49: (iv_ruleEPackage= ruleEPackage EOF )
            // InternalSML.g:1060:2: iv_ruleEPackage= ruleEPackage EOF
            {
             newCompositeNode(grammarAccess.getEPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPackage=ruleEPackage();

            state._fsp--;

             current =iv_ruleEPackage; 
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
    // $ANTLR end "entryRuleEPackage"


    // $ANTLR start "ruleEPackage"
    // InternalSML.g:1066:1: ruleEPackage returns [EObject current=null] : ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleEPackage() throws RecognitionException {
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_nsURI_5_0 = null;

        AntlrDatatypeRuleToken lv_nsPrefix_7_0 = null;

        EObject lv_eAnnotations_10_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eClassifiers_16_0 = null;

        EObject lv_eClassifiers_18_0 = null;

        EObject lv_eSubpackages_22_0 = null;

        EObject lv_eSubpackages_24_0 = null;



        	enterRule();

        try {
            // InternalSML.g:1072:2: ( ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalSML.g:1073:2: ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalSML.g:1073:2: ( () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalSML.g:1074:3: () otherlv_1= 'EPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )? (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )? (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            // InternalSML.g:1074:3: ()
            // InternalSML.g:1075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPackageAccess().getEPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEPackageAccess().getEPackageKeyword_1());
            		
            // InternalSML.g:1085:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSML.g:1086:4: (lv_name_2_0= ruleEString )
            {
            // InternalSML.g:1086:4: (lv_name_2_0= ruleEString )
            // InternalSML.g:1087:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEPackageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSML.g:1108:3: (otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSML.g:1109:4: otherlv_4= 'nsURI' ( (lv_nsURI_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEPackageAccess().getNsURIKeyword_4_0());
                    			
                    // InternalSML.g:1113:4: ( (lv_nsURI_5_0= ruleEString ) )
                    // InternalSML.g:1114:5: (lv_nsURI_5_0= ruleEString )
                    {
                    // InternalSML.g:1114:5: (lv_nsURI_5_0= ruleEString )
                    // InternalSML.g:1115:6: lv_nsURI_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEPackageAccess().getNsURIEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_nsURI_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPackageRule());
                    						}
                    						set(
                    							current,
                    							"nsURI",
                    							lv_nsURI_5_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:1133:3: (otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSML.g:1134:4: otherlv_6= 'nsPrefix' ( (lv_nsPrefix_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEPackageAccess().getNsPrefixKeyword_5_0());
                    			
                    // InternalSML.g:1138:4: ( (lv_nsPrefix_7_0= ruleEString ) )
                    // InternalSML.g:1139:5: (lv_nsPrefix_7_0= ruleEString )
                    {
                    // InternalSML.g:1139:5: (lv_nsPrefix_7_0= ruleEString )
                    // InternalSML.g:1140:6: lv_nsPrefix_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEPackageAccess().getNsPrefixEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_nsPrefix_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPackageRule());
                    						}
                    						set(
                    							current,
                    							"nsPrefix",
                    							lv_nsPrefix_7_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:1158:3: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSML.g:1159:4: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEPackageAccess().getEAnnotationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSML.g:1167:4: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // InternalSML.g:1168:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // InternalSML.g:1168:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // InternalSML.g:1169:6: lv_eAnnotations_10_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEPackageAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eAnnotations_10_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPackageRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_10_0,
                    							"org.prettyprinter.sml.SML.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1186:4: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==15) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSML.g:1187:5: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEPackageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSML.g:1191:5: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // InternalSML.g:1192:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // InternalSML.g:1192:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // InternalSML.g:1193:7: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEPackageAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eAnnotations_12_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_12_0,
                    	    								"org.prettyprinter.sml.SML.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,22,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:1216:3: (otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSML.g:1217:4: otherlv_14= 'eClassifiers' otherlv_15= '{' ( (lv_eClassifiers_16_0= ruleEClassifier ) ) (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getEPackageAccess().getEClassifiersKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_15, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSML.g:1225:4: ( (lv_eClassifiers_16_0= ruleEClassifier ) )
                    // InternalSML.g:1226:5: (lv_eClassifiers_16_0= ruleEClassifier )
                    {
                    // InternalSML.g:1226:5: (lv_eClassifiers_16_0= ruleEClassifier )
                    // InternalSML.g:1227:6: lv_eClassifiers_16_0= ruleEClassifier
                    {

                    						newCompositeNode(grammarAccess.getEPackageAccess().getEClassifiersEClassifierParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eClassifiers_16_0=ruleEClassifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPackageRule());
                    						}
                    						add(
                    							current,
                    							"eClassifiers",
                    							lv_eClassifiers_16_0,
                    							"org.prettyprinter.sml.SML.EClassifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1244:4: (otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSML.g:1245:5: otherlv_17= ',' ( (lv_eClassifiers_18_0= ruleEClassifier ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_27); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEPackageAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSML.g:1249:5: ( (lv_eClassifiers_18_0= ruleEClassifier ) )
                    	    // InternalSML.g:1250:6: (lv_eClassifiers_18_0= ruleEClassifier )
                    	    {
                    	    // InternalSML.g:1250:6: (lv_eClassifiers_18_0= ruleEClassifier )
                    	    // InternalSML.g:1251:7: lv_eClassifiers_18_0= ruleEClassifier
                    	    {

                    	    							newCompositeNode(grammarAccess.getEPackageAccess().getEClassifiersEClassifierParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eClassifiers_18_0=ruleEClassifier();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eClassifiers",
                    	    								lv_eClassifiers_18_0,
                    	    								"org.prettyprinter.sml.SML.EClassifier");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,22,FOLLOW_28); 

                    				newLeafNode(otherlv_19, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:1274:3: (otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSML.g:1275:4: otherlv_20= 'eSubpackages' otherlv_21= '{' ( (lv_eSubpackages_22_0= ruleEPackage ) ) (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEPackageAccess().getESubpackagesKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_21, grammarAccess.getEPackageAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalSML.g:1283:4: ( (lv_eSubpackages_22_0= ruleEPackage ) )
                    // InternalSML.g:1284:5: (lv_eSubpackages_22_0= ruleEPackage )
                    {
                    // InternalSML.g:1284:5: (lv_eSubpackages_22_0= ruleEPackage )
                    // InternalSML.g:1285:6: lv_eSubpackages_22_0= ruleEPackage
                    {

                    						newCompositeNode(grammarAccess.getEPackageAccess().getESubpackagesEPackageParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eSubpackages_22_0=ruleEPackage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPackageRule());
                    						}
                    						add(
                    							current,
                    							"eSubpackages",
                    							lv_eSubpackages_22_0,
                    							"org.prettyprinter.sml.SML.EPackage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1302:4: (otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==15) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSML.g:1303:5: otherlv_23= ',' ( (lv_eSubpackages_24_0= ruleEPackage ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_29); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEPackageAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSML.g:1307:5: ( (lv_eSubpackages_24_0= ruleEPackage ) )
                    	    // InternalSML.g:1308:6: (lv_eSubpackages_24_0= ruleEPackage )
                    	    {
                    	    // InternalSML.g:1308:6: (lv_eSubpackages_24_0= ruleEPackage )
                    	    // InternalSML.g:1309:7: lv_eSubpackages_24_0= ruleEPackage
                    	    {

                    	    							newCompositeNode(grammarAccess.getEPackageAccess().getESubpackagesEPackageParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eSubpackages_24_0=ruleEPackage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eSubpackages",
                    	    								lv_eSubpackages_24_0,
                    	    								"org.prettyprinter.sml.SML.EPackage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_25, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getEPackageAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleEPackage"


    // $ANTLR start "entryRuleEClass"
    // InternalSML.g:1340:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // InternalSML.g:1340:47: (iv_ruleEClass= ruleEClass EOF )
            // InternalSML.g:1341:2: iv_ruleEClass= ruleEClass EOF
            {
             newCompositeNode(grammarAccess.getEClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEClass=ruleEClass();

            state._fsp--;

             current =iv_ruleEClass; 
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
    // $ANTLR end "entryRuleEClass"


    // $ANTLR start "ruleEClass"
    // InternalSML.g:1347:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleEClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_interface_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_7_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_9_0 = null;

        EObject lv_eAnnotations_18_0 = null;

        EObject lv_eAnnotations_20_0 = null;

        EObject lv_eTypeParameters_24_0 = null;

        EObject lv_eTypeParameters_26_0 = null;

        EObject lv_eOperations_30_0 = null;

        EObject lv_eOperations_32_0 = null;

        EObject lv_eStructuralFeatures_36_0 = null;

        EObject lv_eStructuralFeatures_38_0 = null;

        EObject lv_eGenericSuperTypes_42_0 = null;

        EObject lv_eGenericSuperTypes_44_0 = null;



        	enterRule();

        try {
            // InternalSML.g:1353:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalSML.g:1354:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalSML.g:1354:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalSML.g:1355:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalSML.g:1355:3: ()
            // InternalSML.g:1356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEClassAccess().getEClassAction_0(),
            					current);
            			

            }

            // InternalSML.g:1362:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSML.g:1363:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalSML.g:1363:4: (lv_abstract_1_0= 'abstract' )
                    // InternalSML.g:1364:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,33,FOLLOW_30); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_1_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:1376:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSML.g:1377:4: (lv_interface_2_0= 'interface' )
                    {
                    // InternalSML.g:1377:4: (lv_interface_2_0= 'interface' )
                    // InternalSML.g:1378:5: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,34,FOLLOW_31); 

                    					newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "interface", lv_interface_2_0 != null, "interface");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
            		
            // InternalSML.g:1394:3: ( (lv_name_4_0= ruleEString ) )
            // InternalSML.g:1395:4: (lv_name_4_0= ruleEString )
            {
            // InternalSML.g:1395:4: (lv_name_4_0= ruleEString )
            // InternalSML.g:1396:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEClassAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSML.g:1417:3: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSML.g:1418:4: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                    			
                    // InternalSML.g:1422:4: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // InternalSML.g:1423:5: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // InternalSML.g:1423:5: (lv_instanceClassName_7_0= ruleEString )
                    // InternalSML.g:1424:6: lv_instanceClassName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_instanceClassName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_7_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:1442:3: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSML.g:1443:4: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                    			
                    // InternalSML.g:1447:4: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // InternalSML.g:1448:5: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // InternalSML.g:1448:5: (lv_instanceTypeName_9_0= ruleEString )
                    // InternalSML.g:1449:6: lv_instanceTypeName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_instanceTypeName_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_9_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:1467:3: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSML.g:1468:4: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalSML.g:1476:4: ( ( ruleEString ) )
                    // InternalSML.g:1477:5: ( ruleEString )
                    {
                    // InternalSML.g:1477:5: ( ruleEString )
                    // InternalSML.g:1478:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1492:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==15) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalSML.g:1493:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSML.g:1497:5: ( ( ruleEString ) )
                    	    // InternalSML.g:1498:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:1498:6: ( ruleEString )
                    	    // InternalSML.g:1499:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_35); 

                    				newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:1519:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSML.g:1520:4: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalSML.g:1528:4: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // InternalSML.g:1529:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // InternalSML.g:1529:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // InternalSML.g:1530:6: lv_eAnnotations_18_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eAnnotations_18_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_18_0,
                    							"org.prettyprinter.sml.SML.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1547:4: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==15) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalSML.g:1548:5: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalSML.g:1552:5: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // InternalSML.g:1553:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // InternalSML.g:1553:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // InternalSML.g:1554:7: lv_eAnnotations_20_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eAnnotations_20_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_20_0,
                    	    								"org.prettyprinter.sml.SML.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,22,FOLLOW_36); 

                    				newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:1577:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSML.g:1578:4: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalSML.g:1586:4: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // InternalSML.g:1587:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // InternalSML.g:1587:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // InternalSML.g:1588:6: lv_eTypeParameters_24_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eTypeParameters_24_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_24_0,
                    							"org.prettyprinter.sml.SML.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1605:4: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==15) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalSML.g:1606:5: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,15,FOLLOW_37); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalSML.g:1610:5: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // InternalSML.g:1611:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // InternalSML.g:1611:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // InternalSML.g:1612:7: lv_eTypeParameters_26_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eTypeParameters_26_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_26_0,
                    	    								"org.prettyprinter.sml.SML.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,22,FOLLOW_38); 

                    				newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:1635:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==40) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSML.g:1636:4: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_39); 

                    				newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalSML.g:1644:4: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // InternalSML.g:1645:5: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // InternalSML.g:1645:5: (lv_eOperations_30_0= ruleEOperation )
                    // InternalSML.g:1646:6: lv_eOperations_30_0= ruleEOperation
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eOperations_30_0=ruleEOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eOperations",
                    							lv_eOperations_30_0,
                    							"org.prettyprinter.sml.SML.EOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1663:4: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==15) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalSML.g:1664:5: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,15,FOLLOW_39); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalSML.g:1668:5: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // InternalSML.g:1669:6: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // InternalSML.g:1669:6: (lv_eOperations_32_0= ruleEOperation )
                    	    // InternalSML.g:1670:7: lv_eOperations_32_0= ruleEOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eOperations_32_0=ruleEOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eOperations",
                    	    								lv_eOperations_32_0,
                    	    								"org.prettyprinter.sml.SML.EOperation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,22,FOLLOW_40); 

                    				newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:1693:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==41) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSML.g:1694:4: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,41,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalSML.g:1702:4: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // InternalSML.g:1703:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // InternalSML.g:1703:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // InternalSML.g:1704:6: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eStructuralFeatures_36_0=ruleEStructuralFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eStructuralFeatures",
                    							lv_eStructuralFeatures_36_0,
                    							"org.prettyprinter.sml.SML.EStructuralFeature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1721:4: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==15) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalSML.g:1722:5: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,15,FOLLOW_41); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalSML.g:1726:5: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // InternalSML.g:1727:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // InternalSML.g:1727:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // InternalSML.g:1728:7: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eStructuralFeatures_38_0=ruleEStructuralFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eStructuralFeatures",
                    	    								lv_eStructuralFeatures_38_0,
                    	    								"org.prettyprinter.sml.SML.EStructuralFeature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,22,FOLLOW_42); 

                    				newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:1751:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSML.g:1752:4: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalSML.g:1760:4: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // InternalSML.g:1761:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // InternalSML.g:1761:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // InternalSML.g:1762:6: lv_eGenericSuperTypes_42_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eGenericSuperTypes_42_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eGenericSuperTypes",
                    							lv_eGenericSuperTypes_42_0,
                    							"org.prettyprinter.sml.SML.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1779:4: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==15) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalSML.g:1780:5: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalSML.g:1784:5: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // InternalSML.g:1785:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // InternalSML.g:1785:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // InternalSML.g:1786:7: lv_eGenericSuperTypes_44_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eGenericSuperTypes_44_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eGenericSuperTypes",
                    	    								lv_eGenericSuperTypes_44_0,
                    	    								"org.prettyprinter.sml.SML.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_45, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_46, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleEClass"


    // $ANTLR start "entryRuleCollaboration"
    // InternalSML.g:1817:1: entryRuleCollaboration returns [EObject current=null] : iv_ruleCollaboration= ruleCollaboration EOF ;
    public final EObject entryRuleCollaboration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollaboration = null;


        try {
            // InternalSML.g:1817:54: (iv_ruleCollaboration= ruleCollaboration EOF )
            // InternalSML.g:1818:2: iv_ruleCollaboration= ruleCollaboration EOF
            {
             newCompositeNode(grammarAccess.getCollaborationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollaboration=ruleCollaboration();

            state._fsp--;

             current =iv_ruleCollaboration; 
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
    // $ANTLR end "entryRuleCollaboration"


    // $ANTLR start "ruleCollaboration"
    // InternalSML.g:1824:1: ruleCollaboration returns [EObject current=null] : ( () otherlv_1= 'Collaboration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'imports' otherlv_17= '{' ( (lv_imports_18_0= ruleDummyExprClass ) ) (otherlv_19= ',' ( (lv_imports_20_0= ruleDummyExprClass ) ) )* otherlv_21= '}' )? (otherlv_22= 'roles' otherlv_23= '{' ( (lv_roles_24_0= ruleRole ) ) (otherlv_25= ',' ( (lv_roles_26_0= ruleRole ) ) )* otherlv_27= '}' )? (otherlv_28= 'scenarios' otherlv_29= '{' ( (lv_scenarios_30_0= ruleScenario ) ) (otherlv_31= ',' ( (lv_scenarios_32_0= ruleScenario ) ) )* otherlv_33= '}' )? otherlv_34= '}' ) ;
    public final EObject ruleCollaboration() throws RecognitionException {
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_18_0 = null;

        EObject lv_imports_20_0 = null;

        EObject lv_roles_24_0 = null;

        EObject lv_roles_26_0 = null;

        EObject lv_scenarios_30_0 = null;

        EObject lv_scenarios_32_0 = null;



        	enterRule();

        try {
            // InternalSML.g:1830:2: ( ( () otherlv_1= 'Collaboration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'imports' otherlv_17= '{' ( (lv_imports_18_0= ruleDummyExprClass ) ) (otherlv_19= ',' ( (lv_imports_20_0= ruleDummyExprClass ) ) )* otherlv_21= '}' )? (otherlv_22= 'roles' otherlv_23= '{' ( (lv_roles_24_0= ruleRole ) ) (otherlv_25= ',' ( (lv_roles_26_0= ruleRole ) ) )* otherlv_27= '}' )? (otherlv_28= 'scenarios' otherlv_29= '{' ( (lv_scenarios_30_0= ruleScenario ) ) (otherlv_31= ',' ( (lv_scenarios_32_0= ruleScenario ) ) )* otherlv_33= '}' )? otherlv_34= '}' ) )
            // InternalSML.g:1831:2: ( () otherlv_1= 'Collaboration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'imports' otherlv_17= '{' ( (lv_imports_18_0= ruleDummyExprClass ) ) (otherlv_19= ',' ( (lv_imports_20_0= ruleDummyExprClass ) ) )* otherlv_21= '}' )? (otherlv_22= 'roles' otherlv_23= '{' ( (lv_roles_24_0= ruleRole ) ) (otherlv_25= ',' ( (lv_roles_26_0= ruleRole ) ) )* otherlv_27= '}' )? (otherlv_28= 'scenarios' otherlv_29= '{' ( (lv_scenarios_30_0= ruleScenario ) ) (otherlv_31= ',' ( (lv_scenarios_32_0= ruleScenario ) ) )* otherlv_33= '}' )? otherlv_34= '}' )
            {
            // InternalSML.g:1831:2: ( () otherlv_1= 'Collaboration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'imports' otherlv_17= '{' ( (lv_imports_18_0= ruleDummyExprClass ) ) (otherlv_19= ',' ( (lv_imports_20_0= ruleDummyExprClass ) ) )* otherlv_21= '}' )? (otherlv_22= 'roles' otherlv_23= '{' ( (lv_roles_24_0= ruleRole ) ) (otherlv_25= ',' ( (lv_roles_26_0= ruleRole ) ) )* otherlv_27= '}' )? (otherlv_28= 'scenarios' otherlv_29= '{' ( (lv_scenarios_30_0= ruleScenario ) ) (otherlv_31= ',' ( (lv_scenarios_32_0= ruleScenario ) ) )* otherlv_33= '}' )? otherlv_34= '}' )
            // InternalSML.g:1832:3: () otherlv_1= 'Collaboration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'imports' otherlv_17= '{' ( (lv_imports_18_0= ruleDummyExprClass ) ) (otherlv_19= ',' ( (lv_imports_20_0= ruleDummyExprClass ) ) )* otherlv_21= '}' )? (otherlv_22= 'roles' otherlv_23= '{' ( (lv_roles_24_0= ruleRole ) ) (otherlv_25= ',' ( (lv_roles_26_0= ruleRole ) ) )* otherlv_27= '}' )? (otherlv_28= 'scenarios' otherlv_29= '{' ( (lv_scenarios_30_0= ruleScenario ) ) (otherlv_31= ',' ( (lv_scenarios_32_0= ruleScenario ) ) )* otherlv_33= '}' )? otherlv_34= '}'
            {
            // InternalSML.g:1832:3: ()
            // InternalSML.g:1833:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCollaborationAccess().getCollaborationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCollaborationAccess().getCollaborationKeyword_1());
            		
            // InternalSML.g:1843:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSML.g:1844:4: (lv_name_2_0= ruleEString )
            {
            // InternalSML.g:1844:4: (lv_name_2_0= ruleEString )
            // InternalSML.g:1845:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollaborationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollaborationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getCollaborationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSML.g:1866:3: (otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==13) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSML.g:1867:4: otherlv_4= 'domains' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getCollaborationAccess().getDomainsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCollaborationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalSML.g:1875:4: ( ( ruleEString ) )
                    // InternalSML.g:1876:5: ( ruleEString )
                    {
                    // InternalSML.g:1876:5: ( ruleEString )
                    // InternalSML.g:1877:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollaborationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCollaborationAccess().getDomainsEPackageCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1891:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==15) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalSML.g:1892:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCollaborationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSML.g:1896:5: ( ( ruleEString ) )
                    	    // InternalSML.g:1897:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:1897:6: ( ruleEString )
                    	    // InternalSML.g:1898:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCollaborationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCollaborationAccess().getDomainsEPackageCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_45); 

                    				newLeafNode(otherlv_9, grammarAccess.getCollaborationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:1918:3: (otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==17) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSML.g:1919:4: otherlv_10= 'contexts' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getCollaborationAccess().getContextsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getCollaborationAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalSML.g:1927:4: ( ( ruleEString ) )
                    // InternalSML.g:1928:5: ( ruleEString )
                    {
                    // InternalSML.g:1928:5: ( ruleEString )
                    // InternalSML.g:1929:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollaborationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCollaborationAccess().getContextsEPackageCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1943:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==15) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalSML.g:1944:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getCollaborationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSML.g:1948:5: ( ( ruleEString ) )
                    	    // InternalSML.g:1949:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:1949:6: ( ruleEString )
                    	    // InternalSML.g:1950:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCollaborationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCollaborationAccess().getContextsEPackageCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_46); 

                    				newLeafNode(otherlv_15, grammarAccess.getCollaborationAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:1970:3: (otherlv_16= 'imports' otherlv_17= '{' ( (lv_imports_18_0= ruleDummyExprClass ) ) (otherlv_19= ',' ( (lv_imports_20_0= ruleDummyExprClass ) ) )* otherlv_21= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==21) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSML.g:1971:4: otherlv_16= 'imports' otherlv_17= '{' ( (lv_imports_18_0= ruleDummyExprClass ) ) (otherlv_19= ',' ( (lv_imports_20_0= ruleDummyExprClass ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getCollaborationAccess().getImportsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getCollaborationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSML.g:1979:4: ( (lv_imports_18_0= ruleDummyExprClass ) )
                    // InternalSML.g:1980:5: (lv_imports_18_0= ruleDummyExprClass )
                    {
                    // InternalSML.g:1980:5: (lv_imports_18_0= ruleDummyExprClass )
                    // InternalSML.g:1981:6: lv_imports_18_0= ruleDummyExprClass
                    {

                    						newCompositeNode(grammarAccess.getCollaborationAccess().getImportsDummyExprClassParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_imports_18_0=ruleDummyExprClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollaborationRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_18_0,
                    							"org.prettyprinter.sml.SML.DummyExprClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:1998:4: (otherlv_19= ',' ( (lv_imports_20_0= ruleDummyExprClass ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==15) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalSML.g:1999:5: otherlv_19= ',' ( (lv_imports_20_0= ruleDummyExprClass ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getCollaborationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSML.g:2003:5: ( (lv_imports_20_0= ruleDummyExprClass ) )
                    	    // InternalSML.g:2004:6: (lv_imports_20_0= ruleDummyExprClass )
                    	    {
                    	    // InternalSML.g:2004:6: (lv_imports_20_0= ruleDummyExprClass )
                    	    // InternalSML.g:2005:7: lv_imports_20_0= ruleDummyExprClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getCollaborationAccess().getImportsDummyExprClassParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_imports_20_0=ruleDummyExprClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCollaborationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"imports",
                    	    								lv_imports_20_0,
                    	    								"org.prettyprinter.sml.SML.DummyExprClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,22,FOLLOW_47); 

                    				newLeafNode(otherlv_21, grammarAccess.getCollaborationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:2028:3: (otherlv_22= 'roles' otherlv_23= '{' ( (lv_roles_24_0= ruleRole ) ) (otherlv_25= ',' ( (lv_roles_26_0= ruleRole ) ) )* otherlv_27= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSML.g:2029:4: otherlv_22= 'roles' otherlv_23= '{' ( (lv_roles_24_0= ruleRole ) ) (otherlv_25= ',' ( (lv_roles_26_0= ruleRole ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getCollaborationAccess().getRolesKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_23, grammarAccess.getCollaborationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSML.g:2037:4: ( (lv_roles_24_0= ruleRole ) )
                    // InternalSML.g:2038:5: (lv_roles_24_0= ruleRole )
                    {
                    // InternalSML.g:2038:5: (lv_roles_24_0= ruleRole )
                    // InternalSML.g:2039:6: lv_roles_24_0= ruleRole
                    {

                    						newCompositeNode(grammarAccess.getCollaborationAccess().getRolesRoleParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_roles_24_0=ruleRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollaborationRule());
                    						}
                    						add(
                    							current,
                    							"roles",
                    							lv_roles_24_0,
                    							"org.prettyprinter.sml.SML.Role");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:2056:4: (otherlv_25= ',' ( (lv_roles_26_0= ruleRole ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==15) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalSML.g:2057:5: otherlv_25= ',' ( (lv_roles_26_0= ruleRole ) )
                    	    {
                    	    otherlv_25=(Token)match(input,15,FOLLOW_48); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getCollaborationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSML.g:2061:5: ( (lv_roles_26_0= ruleRole ) )
                    	    // InternalSML.g:2062:6: (lv_roles_26_0= ruleRole )
                    	    {
                    	    // InternalSML.g:2062:6: (lv_roles_26_0= ruleRole )
                    	    // InternalSML.g:2063:7: lv_roles_26_0= ruleRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getCollaborationAccess().getRolesRoleParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_roles_26_0=ruleRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCollaborationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"roles",
                    	    								lv_roles_26_0,
                    	    								"org.prettyprinter.sml.SML.Role");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,22,FOLLOW_49); 

                    				newLeafNode(otherlv_27, grammarAccess.getCollaborationAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:2086:3: (otherlv_28= 'scenarios' otherlv_29= '{' ( (lv_scenarios_30_0= ruleScenario ) ) (otherlv_31= ',' ( (lv_scenarios_32_0= ruleScenario ) ) )* otherlv_33= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==45) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSML.g:2087:4: otherlv_28= 'scenarios' otherlv_29= '{' ( (lv_scenarios_30_0= ruleScenario ) ) (otherlv_31= ',' ( (lv_scenarios_32_0= ruleScenario ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getCollaborationAccess().getScenariosKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_29, grammarAccess.getCollaborationAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalSML.g:2095:4: ( (lv_scenarios_30_0= ruleScenario ) )
                    // InternalSML.g:2096:5: (lv_scenarios_30_0= ruleScenario )
                    {
                    // InternalSML.g:2096:5: (lv_scenarios_30_0= ruleScenario )
                    // InternalSML.g:2097:6: lv_scenarios_30_0= ruleScenario
                    {

                    						newCompositeNode(grammarAccess.getCollaborationAccess().getScenariosScenarioParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_scenarios_30_0=ruleScenario();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollaborationRule());
                    						}
                    						add(
                    							current,
                    							"scenarios",
                    							lv_scenarios_30_0,
                    							"org.prettyprinter.sml.SML.Scenario");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:2114:4: (otherlv_31= ',' ( (lv_scenarios_32_0= ruleScenario ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==15) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalSML.g:2115:5: otherlv_31= ',' ( (lv_scenarios_32_0= ruleScenario ) )
                    	    {
                    	    otherlv_31=(Token)match(input,15,FOLLOW_50); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getCollaborationAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSML.g:2119:5: ( (lv_scenarios_32_0= ruleScenario ) )
                    	    // InternalSML.g:2120:6: (lv_scenarios_32_0= ruleScenario )
                    	    {
                    	    // InternalSML.g:2120:6: (lv_scenarios_32_0= ruleScenario )
                    	    // InternalSML.g:2121:7: lv_scenarios_32_0= ruleScenario
                    	    {

                    	    							newCompositeNode(grammarAccess.getCollaborationAccess().getScenariosScenarioParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_scenarios_32_0=ruleScenario();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCollaborationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"scenarios",
                    	    								lv_scenarios_32_0,
                    	    								"org.prettyprinter.sml.SML.Scenario");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_33, grammarAccess.getCollaborationAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_34=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_34, grammarAccess.getCollaborationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCollaboration"


    // $ANTLR start "entryRuleEventParameterRanges"
    // InternalSML.g:2152:1: entryRuleEventParameterRanges returns [EObject current=null] : iv_ruleEventParameterRanges= ruleEventParameterRanges EOF ;
    public final EObject entryRuleEventParameterRanges() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventParameterRanges = null;


        try {
            // InternalSML.g:2152:61: (iv_ruleEventParameterRanges= ruleEventParameterRanges EOF )
            // InternalSML.g:2153:2: iv_ruleEventParameterRanges= ruleEventParameterRanges EOF
            {
             newCompositeNode(grammarAccess.getEventParameterRangesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventParameterRanges=ruleEventParameterRanges();

            state._fsp--;

             current =iv_ruleEventParameterRanges; 
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
    // $ANTLR end "entryRuleEventParameterRanges"


    // $ANTLR start "ruleEventParameterRanges"
    // InternalSML.g:2159:1: ruleEventParameterRanges returns [EObject current=null] : ( () otherlv_1= 'EventParameterRanges' otherlv_2= '{' (otherlv_3= 'event' ( ( ruleEString ) ) )? (otherlv_5= 'rangesForParameter' otherlv_6= '{' ( (lv_rangesForParameter_7_0= ruleRangesForParameter ) ) (otherlv_8= ',' ( (lv_rangesForParameter_9_0= ruleRangesForParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleEventParameterRanges() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_rangesForParameter_7_0 = null;

        EObject lv_rangesForParameter_9_0 = null;



        	enterRule();

        try {
            // InternalSML.g:2165:2: ( ( () otherlv_1= 'EventParameterRanges' otherlv_2= '{' (otherlv_3= 'event' ( ( ruleEString ) ) )? (otherlv_5= 'rangesForParameter' otherlv_6= '{' ( (lv_rangesForParameter_7_0= ruleRangesForParameter ) ) (otherlv_8= ',' ( (lv_rangesForParameter_9_0= ruleRangesForParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalSML.g:2166:2: ( () otherlv_1= 'EventParameterRanges' otherlv_2= '{' (otherlv_3= 'event' ( ( ruleEString ) ) )? (otherlv_5= 'rangesForParameter' otherlv_6= '{' ( (lv_rangesForParameter_7_0= ruleRangesForParameter ) ) (otherlv_8= ',' ( (lv_rangesForParameter_9_0= ruleRangesForParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalSML.g:2166:2: ( () otherlv_1= 'EventParameterRanges' otherlv_2= '{' (otherlv_3= 'event' ( ( ruleEString ) ) )? (otherlv_5= 'rangesForParameter' otherlv_6= '{' ( (lv_rangesForParameter_7_0= ruleRangesForParameter ) ) (otherlv_8= ',' ( (lv_rangesForParameter_9_0= ruleRangesForParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalSML.g:2167:3: () otherlv_1= 'EventParameterRanges' otherlv_2= '{' (otherlv_3= 'event' ( ( ruleEString ) ) )? (otherlv_5= 'rangesForParameter' otherlv_6= '{' ( (lv_rangesForParameter_7_0= ruleRangesForParameter ) ) (otherlv_8= ',' ( (lv_rangesForParameter_9_0= ruleRangesForParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalSML.g:2167:3: ()
            // InternalSML.g:2168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventParameterRangesAccess().getEventParameterRangesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEventParameterRangesAccess().getEventParameterRangesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getEventParameterRangesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:2182:3: (otherlv_3= 'event' ( ( ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==47) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSML.g:2183:4: otherlv_3= 'event' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEventParameterRangesAccess().getEventKeyword_3_0());
                    			
                    // InternalSML.g:2187:4: ( ( ruleEString ) )
                    // InternalSML.g:2188:5: ( ruleEString )
                    {
                    // InternalSML.g:2188:5: ( ruleEString )
                    // InternalSML.g:2189:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventParameterRangesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEventParameterRangesAccess().getEventETypedElementCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:2204:3: (otherlv_5= 'rangesForParameter' otherlv_6= '{' ( (lv_rangesForParameter_7_0= ruleRangesForParameter ) ) (otherlv_8= ',' ( (lv_rangesForParameter_9_0= ruleRangesForParameter ) ) )* otherlv_10= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==48) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSML.g:2205:4: otherlv_5= 'rangesForParameter' otherlv_6= '{' ( (lv_rangesForParameter_7_0= ruleRangesForParameter ) ) (otherlv_8= ',' ( (lv_rangesForParameter_9_0= ruleRangesForParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEventParameterRangesAccess().getRangesForParameterKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventParameterRangesAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSML.g:2213:4: ( (lv_rangesForParameter_7_0= ruleRangesForParameter ) )
                    // InternalSML.g:2214:5: (lv_rangesForParameter_7_0= ruleRangesForParameter )
                    {
                    // InternalSML.g:2214:5: (lv_rangesForParameter_7_0= ruleRangesForParameter )
                    // InternalSML.g:2215:6: lv_rangesForParameter_7_0= ruleRangesForParameter
                    {

                    						newCompositeNode(grammarAccess.getEventParameterRangesAccess().getRangesForParameterRangesForParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_rangesForParameter_7_0=ruleRangesForParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventParameterRangesRule());
                    						}
                    						add(
                    							current,
                    							"rangesForParameter",
                    							lv_rangesForParameter_7_0,
                    							"org.prettyprinter.sml.SML.RangesForParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:2232:4: (otherlv_8= ',' ( (lv_rangesForParameter_9_0= ruleRangesForParameter ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==15) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalSML.g:2233:5: otherlv_8= ',' ( (lv_rangesForParameter_9_0= ruleRangesForParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_53); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEventParameterRangesAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSML.g:2237:5: ( (lv_rangesForParameter_9_0= ruleRangesForParameter ) )
                    	    // InternalSML.g:2238:6: (lv_rangesForParameter_9_0= ruleRangesForParameter )
                    	    {
                    	    // InternalSML.g:2238:6: (lv_rangesForParameter_9_0= ruleRangesForParameter )
                    	    // InternalSML.g:2239:7: lv_rangesForParameter_9_0= ruleRangesForParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventParameterRangesAccess().getRangesForParameterRangesForParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_rangesForParameter_9_0=ruleRangesForParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventParameterRangesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rangesForParameter",
                    	    								lv_rangesForParameter_9_0,
                    	    								"org.prettyprinter.sml.SML.RangesForParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventParameterRangesAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEventParameterRangesAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEventParameterRanges"


    // $ANTLR start "entryRuleChannelOptions"
    // InternalSML.g:2270:1: entryRuleChannelOptions returns [EObject current=null] : iv_ruleChannelOptions= ruleChannelOptions EOF ;
    public final EObject entryRuleChannelOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelOptions = null;


        try {
            // InternalSML.g:2270:55: (iv_ruleChannelOptions= ruleChannelOptions EOF )
            // InternalSML.g:2271:2: iv_ruleChannelOptions= ruleChannelOptions EOF
            {
             newCompositeNode(grammarAccess.getChannelOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannelOptions=ruleChannelOptions();

            state._fsp--;

             current =iv_ruleChannelOptions; 
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
    // $ANTLR end "entryRuleChannelOptions"


    // $ANTLR start "ruleChannelOptions"
    // InternalSML.g:2277:1: ruleChannelOptions returns [EObject current=null] : ( () ( (lv_allMessagesRequireLinks_1_0= 'allMessagesRequireLinks' ) )? otherlv_2= 'ChannelOptions' otherlv_3= '{' (otherlv_4= 'messageChannels' otherlv_5= '{' ( (lv_messageChannels_6_0= ruleMessageChannel ) ) (otherlv_7= ',' ( (lv_messageChannels_8_0= ruleMessageChannel ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleChannelOptions() throws RecognitionException {
        EObject current = null;

        Token lv_allMessagesRequireLinks_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_messageChannels_6_0 = null;

        EObject lv_messageChannels_8_0 = null;



        	enterRule();

        try {
            // InternalSML.g:2283:2: ( ( () ( (lv_allMessagesRequireLinks_1_0= 'allMessagesRequireLinks' ) )? otherlv_2= 'ChannelOptions' otherlv_3= '{' (otherlv_4= 'messageChannels' otherlv_5= '{' ( (lv_messageChannels_6_0= ruleMessageChannel ) ) (otherlv_7= ',' ( (lv_messageChannels_8_0= ruleMessageChannel ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalSML.g:2284:2: ( () ( (lv_allMessagesRequireLinks_1_0= 'allMessagesRequireLinks' ) )? otherlv_2= 'ChannelOptions' otherlv_3= '{' (otherlv_4= 'messageChannels' otherlv_5= '{' ( (lv_messageChannels_6_0= ruleMessageChannel ) ) (otherlv_7= ',' ( (lv_messageChannels_8_0= ruleMessageChannel ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalSML.g:2284:2: ( () ( (lv_allMessagesRequireLinks_1_0= 'allMessagesRequireLinks' ) )? otherlv_2= 'ChannelOptions' otherlv_3= '{' (otherlv_4= 'messageChannels' otherlv_5= '{' ( (lv_messageChannels_6_0= ruleMessageChannel ) ) (otherlv_7= ',' ( (lv_messageChannels_8_0= ruleMessageChannel ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalSML.g:2285:3: () ( (lv_allMessagesRequireLinks_1_0= 'allMessagesRequireLinks' ) )? otherlv_2= 'ChannelOptions' otherlv_3= '{' (otherlv_4= 'messageChannels' otherlv_5= '{' ( (lv_messageChannels_6_0= ruleMessageChannel ) ) (otherlv_7= ',' ( (lv_messageChannels_8_0= ruleMessageChannel ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalSML.g:2285:3: ()
            // InternalSML.g:2286:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChannelOptionsAccess().getChannelOptionsAction_0(),
            					current);
            			

            }

            // InternalSML.g:2292:3: ( (lv_allMessagesRequireLinks_1_0= 'allMessagesRequireLinks' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==49) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSML.g:2293:4: (lv_allMessagesRequireLinks_1_0= 'allMessagesRequireLinks' )
                    {
                    // InternalSML.g:2293:4: (lv_allMessagesRequireLinks_1_0= 'allMessagesRequireLinks' )
                    // InternalSML.g:2294:5: lv_allMessagesRequireLinks_1_0= 'allMessagesRequireLinks'
                    {
                    lv_allMessagesRequireLinks_1_0=(Token)match(input,49,FOLLOW_54); 

                    					newLeafNode(lv_allMessagesRequireLinks_1_0, grammarAccess.getChannelOptionsAccess().getAllMessagesRequireLinksAllMessagesRequireLinksKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChannelOptionsRule());
                    					}
                    					setWithLastConsumed(current, "allMessagesRequireLinks", lv_allMessagesRequireLinks_1_0 != null, "allMessagesRequireLinks");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getChannelOptionsAccess().getChannelOptionsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getChannelOptionsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSML.g:2314:3: (otherlv_4= 'messageChannels' otherlv_5= '{' ( (lv_messageChannels_6_0= ruleMessageChannel ) ) (otherlv_7= ',' ( (lv_messageChannels_8_0= ruleMessageChannel ) ) )* otherlv_9= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==51) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSML.g:2315:4: otherlv_4= 'messageChannels' otherlv_5= '{' ( (lv_messageChannels_6_0= ruleMessageChannel ) ) (otherlv_7= ',' ( (lv_messageChannels_8_0= ruleMessageChannel ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getChannelOptionsAccess().getMessageChannelsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_5, grammarAccess.getChannelOptionsAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSML.g:2323:4: ( (lv_messageChannels_6_0= ruleMessageChannel ) )
                    // InternalSML.g:2324:5: (lv_messageChannels_6_0= ruleMessageChannel )
                    {
                    // InternalSML.g:2324:5: (lv_messageChannels_6_0= ruleMessageChannel )
                    // InternalSML.g:2325:6: lv_messageChannels_6_0= ruleMessageChannel
                    {

                    						newCompositeNode(grammarAccess.getChannelOptionsAccess().getMessageChannelsMessageChannelParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_messageChannels_6_0=ruleMessageChannel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChannelOptionsRule());
                    						}
                    						add(
                    							current,
                    							"messageChannels",
                    							lv_messageChannels_6_0,
                    							"org.prettyprinter.sml.SML.MessageChannel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:2342:4: (otherlv_7= ',' ( (lv_messageChannels_8_0= ruleMessageChannel ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==15) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalSML.g:2343:5: otherlv_7= ',' ( (lv_messageChannels_8_0= ruleMessageChannel ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_56); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getChannelOptionsAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSML.g:2347:5: ( (lv_messageChannels_8_0= ruleMessageChannel ) )
                    	    // InternalSML.g:2348:6: (lv_messageChannels_8_0= ruleMessageChannel )
                    	    {
                    	    // InternalSML.g:2348:6: (lv_messageChannels_8_0= ruleMessageChannel )
                    	    // InternalSML.g:2349:7: lv_messageChannels_8_0= ruleMessageChannel
                    	    {

                    	    							newCompositeNode(grammarAccess.getChannelOptionsAccess().getMessageChannelsMessageChannelParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_messageChannels_8_0=ruleMessageChannel();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChannelOptionsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"messageChannels",
                    	    								lv_messageChannels_8_0,
                    	    								"org.prettyprinter.sml.SML.MessageChannel");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getChannelOptionsAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getChannelOptionsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleChannelOptions"


    // $ANTLR start "entryRuleInteraction"
    // InternalSML.g:2380:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalSML.g:2380:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalSML.g:2381:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalSML.g:2387:1: ruleInteraction returns [EObject current=null] : ( () otherlv_1= 'Interaction' otherlv_2= '{' (otherlv_3= 'fragments' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) ) (otherlv_6= ',' ( (lv_fragments_7_0= ruleInteractionFragment ) ) )* otherlv_8= '}' )? (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraintBlock ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_fragments_5_0 = null;

        EObject lv_fragments_7_0 = null;

        EObject lv_constraints_10_0 = null;



        	enterRule();

        try {
            // InternalSML.g:2393:2: ( ( () otherlv_1= 'Interaction' otherlv_2= '{' (otherlv_3= 'fragments' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) ) (otherlv_6= ',' ( (lv_fragments_7_0= ruleInteractionFragment ) ) )* otherlv_8= '}' )? (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraintBlock ) ) )? otherlv_11= '}' ) )
            // InternalSML.g:2394:2: ( () otherlv_1= 'Interaction' otherlv_2= '{' (otherlv_3= 'fragments' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) ) (otherlv_6= ',' ( (lv_fragments_7_0= ruleInteractionFragment ) ) )* otherlv_8= '}' )? (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraintBlock ) ) )? otherlv_11= '}' )
            {
            // InternalSML.g:2394:2: ( () otherlv_1= 'Interaction' otherlv_2= '{' (otherlv_3= 'fragments' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) ) (otherlv_6= ',' ( (lv_fragments_7_0= ruleInteractionFragment ) ) )* otherlv_8= '}' )? (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraintBlock ) ) )? otherlv_11= '}' )
            // InternalSML.g:2395:3: () otherlv_1= 'Interaction' otherlv_2= '{' (otherlv_3= 'fragments' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) ) (otherlv_6= ',' ( (lv_fragments_7_0= ruleInteractionFragment ) ) )* otherlv_8= '}' )? (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraintBlock ) ) )? otherlv_11= '}'
            {
            // InternalSML.g:2395:3: ()
            // InternalSML.g:2396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInteractionAccess().getInteractionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getInteractionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:2410:3: (otherlv_3= 'fragments' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) ) (otherlv_6= ',' ( (lv_fragments_7_0= ruleInteractionFragment ) ) )* otherlv_8= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==53) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSML.g:2411:4: otherlv_3= 'fragments' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) ) (otherlv_6= ',' ( (lv_fragments_7_0= ruleInteractionFragment ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getFragmentsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_58); 

                    				newLeafNode(otherlv_4, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSML.g:2419:4: ( (lv_fragments_5_0= ruleInteractionFragment ) )
                    // InternalSML.g:2420:5: (lv_fragments_5_0= ruleInteractionFragment )
                    {
                    // InternalSML.g:2420:5: (lv_fragments_5_0= ruleInteractionFragment )
                    // InternalSML.g:2421:6: lv_fragments_5_0= ruleInteractionFragment
                    {

                    						newCompositeNode(grammarAccess.getInteractionAccess().getFragmentsInteractionFragmentParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_fragments_5_0=ruleInteractionFragment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInteractionRule());
                    						}
                    						add(
                    							current,
                    							"fragments",
                    							lv_fragments_5_0,
                    							"org.prettyprinter.sml.SML.InteractionFragment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:2438:4: (otherlv_6= ',' ( (lv_fragments_7_0= ruleInteractionFragment ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==15) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalSML.g:2439:5: otherlv_6= ',' ( (lv_fragments_7_0= ruleInteractionFragment ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_58); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getInteractionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSML.g:2443:5: ( (lv_fragments_7_0= ruleInteractionFragment ) )
                    	    // InternalSML.g:2444:6: (lv_fragments_7_0= ruleInteractionFragment )
                    	    {
                    	    // InternalSML.g:2444:6: (lv_fragments_7_0= ruleInteractionFragment )
                    	    // InternalSML.g:2445:7: lv_fragments_7_0= ruleInteractionFragment
                    	    {

                    	    							newCompositeNode(grammarAccess.getInteractionAccess().getFragmentsInteractionFragmentParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_fragments_7_0=ruleInteractionFragment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInteractionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fragments",
                    	    								lv_fragments_7_0,
                    	    								"org.prettyprinter.sml.SML.InteractionFragment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_59); 

                    				newLeafNode(otherlv_8, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:2468:3: (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraintBlock ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==54) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSML.g:2469:4: otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraintBlock ) )
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_60); 

                    				newLeafNode(otherlv_9, grammarAccess.getInteractionAccess().getConstraintsKeyword_4_0());
                    			
                    // InternalSML.g:2473:4: ( (lv_constraints_10_0= ruleConstraintBlock ) )
                    // InternalSML.g:2474:5: (lv_constraints_10_0= ruleConstraintBlock )
                    {
                    // InternalSML.g:2474:5: (lv_constraints_10_0= ruleConstraintBlock )
                    // InternalSML.g:2475:6: lv_constraints_10_0= ruleConstraintBlock
                    {

                    						newCompositeNode(grammarAccess.getInteractionAccess().getConstraintsConstraintBlockParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_constraints_10_0=ruleConstraintBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInteractionRule());
                    						}
                    						set(
                    							current,
                    							"constraints",
                    							lv_constraints_10_0,
                    							"org.prettyprinter.sml.SML.ConstraintBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleConstraintBlock"
    // InternalSML.g:2501:1: entryRuleConstraintBlock returns [EObject current=null] : iv_ruleConstraintBlock= ruleConstraintBlock EOF ;
    public final EObject entryRuleConstraintBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintBlock = null;


        try {
            // InternalSML.g:2501:56: (iv_ruleConstraintBlock= ruleConstraintBlock EOF )
            // InternalSML.g:2502:2: iv_ruleConstraintBlock= ruleConstraintBlock EOF
            {
             newCompositeNode(grammarAccess.getConstraintBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintBlock=ruleConstraintBlock();

            state._fsp--;

             current =iv_ruleConstraintBlock; 
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
    // $ANTLR end "entryRuleConstraintBlock"


    // $ANTLR start "ruleConstraintBlock"
    // InternalSML.g:2508:1: ruleConstraintBlock returns [EObject current=null] : ( () otherlv_1= 'ConstraintBlock' otherlv_2= '{' (otherlv_3= 'consider' otherlv_4= '{' ( (lv_consider_5_0= ruleMessage ) ) (otherlv_6= ',' ( (lv_consider_7_0= ruleMessage ) ) )* otherlv_8= '}' )? (otherlv_9= 'ignore' otherlv_10= '{' ( (lv_ignore_11_0= ruleMessage ) ) (otherlv_12= ',' ( (lv_ignore_13_0= ruleMessage ) ) )* otherlv_14= '}' )? (otherlv_15= 'interrupt' otherlv_16= '{' ( (lv_interrupt_17_0= ruleMessage ) ) (otherlv_18= ',' ( (lv_interrupt_19_0= ruleMessage ) ) )* otherlv_20= '}' )? (otherlv_21= 'forbidden' otherlv_22= '{' ( (lv_forbidden_23_0= ruleMessage ) ) (otherlv_24= ',' ( (lv_forbidden_25_0= ruleMessage ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleConstraintBlock() throws RecognitionException {
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
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_consider_5_0 = null;

        EObject lv_consider_7_0 = null;

        EObject lv_ignore_11_0 = null;

        EObject lv_ignore_13_0 = null;

        EObject lv_interrupt_17_0 = null;

        EObject lv_interrupt_19_0 = null;

        EObject lv_forbidden_23_0 = null;

        EObject lv_forbidden_25_0 = null;



        	enterRule();

        try {
            // InternalSML.g:2514:2: ( ( () otherlv_1= 'ConstraintBlock' otherlv_2= '{' (otherlv_3= 'consider' otherlv_4= '{' ( (lv_consider_5_0= ruleMessage ) ) (otherlv_6= ',' ( (lv_consider_7_0= ruleMessage ) ) )* otherlv_8= '}' )? (otherlv_9= 'ignore' otherlv_10= '{' ( (lv_ignore_11_0= ruleMessage ) ) (otherlv_12= ',' ( (lv_ignore_13_0= ruleMessage ) ) )* otherlv_14= '}' )? (otherlv_15= 'interrupt' otherlv_16= '{' ( (lv_interrupt_17_0= ruleMessage ) ) (otherlv_18= ',' ( (lv_interrupt_19_0= ruleMessage ) ) )* otherlv_20= '}' )? (otherlv_21= 'forbidden' otherlv_22= '{' ( (lv_forbidden_23_0= ruleMessage ) ) (otherlv_24= ',' ( (lv_forbidden_25_0= ruleMessage ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalSML.g:2515:2: ( () otherlv_1= 'ConstraintBlock' otherlv_2= '{' (otherlv_3= 'consider' otherlv_4= '{' ( (lv_consider_5_0= ruleMessage ) ) (otherlv_6= ',' ( (lv_consider_7_0= ruleMessage ) ) )* otherlv_8= '}' )? (otherlv_9= 'ignore' otherlv_10= '{' ( (lv_ignore_11_0= ruleMessage ) ) (otherlv_12= ',' ( (lv_ignore_13_0= ruleMessage ) ) )* otherlv_14= '}' )? (otherlv_15= 'interrupt' otherlv_16= '{' ( (lv_interrupt_17_0= ruleMessage ) ) (otherlv_18= ',' ( (lv_interrupt_19_0= ruleMessage ) ) )* otherlv_20= '}' )? (otherlv_21= 'forbidden' otherlv_22= '{' ( (lv_forbidden_23_0= ruleMessage ) ) (otherlv_24= ',' ( (lv_forbidden_25_0= ruleMessage ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalSML.g:2515:2: ( () otherlv_1= 'ConstraintBlock' otherlv_2= '{' (otherlv_3= 'consider' otherlv_4= '{' ( (lv_consider_5_0= ruleMessage ) ) (otherlv_6= ',' ( (lv_consider_7_0= ruleMessage ) ) )* otherlv_8= '}' )? (otherlv_9= 'ignore' otherlv_10= '{' ( (lv_ignore_11_0= ruleMessage ) ) (otherlv_12= ',' ( (lv_ignore_13_0= ruleMessage ) ) )* otherlv_14= '}' )? (otherlv_15= 'interrupt' otherlv_16= '{' ( (lv_interrupt_17_0= ruleMessage ) ) (otherlv_18= ',' ( (lv_interrupt_19_0= ruleMessage ) ) )* otherlv_20= '}' )? (otherlv_21= 'forbidden' otherlv_22= '{' ( (lv_forbidden_23_0= ruleMessage ) ) (otherlv_24= ',' ( (lv_forbidden_25_0= ruleMessage ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalSML.g:2516:3: () otherlv_1= 'ConstraintBlock' otherlv_2= '{' (otherlv_3= 'consider' otherlv_4= '{' ( (lv_consider_5_0= ruleMessage ) ) (otherlv_6= ',' ( (lv_consider_7_0= ruleMessage ) ) )* otherlv_8= '}' )? (otherlv_9= 'ignore' otherlv_10= '{' ( (lv_ignore_11_0= ruleMessage ) ) (otherlv_12= ',' ( (lv_ignore_13_0= ruleMessage ) ) )* otherlv_14= '}' )? (otherlv_15= 'interrupt' otherlv_16= '{' ( (lv_interrupt_17_0= ruleMessage ) ) (otherlv_18= ',' ( (lv_interrupt_19_0= ruleMessage ) ) )* otherlv_20= '}' )? (otherlv_21= 'forbidden' otherlv_22= '{' ( (lv_forbidden_23_0= ruleMessage ) ) (otherlv_24= ',' ( (lv_forbidden_25_0= ruleMessage ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // InternalSML.g:2516:3: ()
            // InternalSML.g:2517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstraintBlockAccess().getConstraintBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintBlockAccess().getConstraintBlockKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:2531:3: (otherlv_3= 'consider' otherlv_4= '{' ( (lv_consider_5_0= ruleMessage ) ) (otherlv_6= ',' ( (lv_consider_7_0= ruleMessage ) ) )* otherlv_8= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==56) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSML.g:2532:4: otherlv_3= 'consider' otherlv_4= '{' ( (lv_consider_5_0= ruleMessage ) ) (otherlv_6= ',' ( (lv_consider_7_0= ruleMessage ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstraintBlockAccess().getConsiderKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_62); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstraintBlockAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSML.g:2540:4: ( (lv_consider_5_0= ruleMessage ) )
                    // InternalSML.g:2541:5: (lv_consider_5_0= ruleMessage )
                    {
                    // InternalSML.g:2541:5: (lv_consider_5_0= ruleMessage )
                    // InternalSML.g:2542:6: lv_consider_5_0= ruleMessage
                    {

                    						newCompositeNode(grammarAccess.getConstraintBlockAccess().getConsiderMessageParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_consider_5_0=ruleMessage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintBlockRule());
                    						}
                    						add(
                    							current,
                    							"consider",
                    							lv_consider_5_0,
                    							"org.prettyprinter.sml.SML.Message");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:2559:4: (otherlv_6= ',' ( (lv_consider_7_0= ruleMessage ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==15) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalSML.g:2560:5: otherlv_6= ',' ( (lv_consider_7_0= ruleMessage ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_62); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getConstraintBlockAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSML.g:2564:5: ( (lv_consider_7_0= ruleMessage ) )
                    	    // InternalSML.g:2565:6: (lv_consider_7_0= ruleMessage )
                    	    {
                    	    // InternalSML.g:2565:6: (lv_consider_7_0= ruleMessage )
                    	    // InternalSML.g:2566:7: lv_consider_7_0= ruleMessage
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstraintBlockAccess().getConsiderMessageParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_consider_7_0=ruleMessage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstraintBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"consider",
                    	    								lv_consider_7_0,
                    	    								"org.prettyprinter.sml.SML.Message");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_63); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintBlockAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:2589:3: (otherlv_9= 'ignore' otherlv_10= '{' ( (lv_ignore_11_0= ruleMessage ) ) (otherlv_12= ',' ( (lv_ignore_13_0= ruleMessage ) ) )* otherlv_14= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==57) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSML.g:2590:4: otherlv_9= 'ignore' otherlv_10= '{' ( (lv_ignore_11_0= ruleMessage ) ) (otherlv_12= ',' ( (lv_ignore_13_0= ruleMessage ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,57,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getConstraintBlockAccess().getIgnoreKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_62); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintBlockAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSML.g:2598:4: ( (lv_ignore_11_0= ruleMessage ) )
                    // InternalSML.g:2599:5: (lv_ignore_11_0= ruleMessage )
                    {
                    // InternalSML.g:2599:5: (lv_ignore_11_0= ruleMessage )
                    // InternalSML.g:2600:6: lv_ignore_11_0= ruleMessage
                    {

                    						newCompositeNode(grammarAccess.getConstraintBlockAccess().getIgnoreMessageParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_ignore_11_0=ruleMessage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintBlockRule());
                    						}
                    						add(
                    							current,
                    							"ignore",
                    							lv_ignore_11_0,
                    							"org.prettyprinter.sml.SML.Message");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:2617:4: (otherlv_12= ',' ( (lv_ignore_13_0= ruleMessage ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==15) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalSML.g:2618:5: otherlv_12= ',' ( (lv_ignore_13_0= ruleMessage ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_62); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getConstraintBlockAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSML.g:2622:5: ( (lv_ignore_13_0= ruleMessage ) )
                    	    // InternalSML.g:2623:6: (lv_ignore_13_0= ruleMessage )
                    	    {
                    	    // InternalSML.g:2623:6: (lv_ignore_13_0= ruleMessage )
                    	    // InternalSML.g:2624:7: lv_ignore_13_0= ruleMessage
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstraintBlockAccess().getIgnoreMessageParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_ignore_13_0=ruleMessage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstraintBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ignore",
                    	    								lv_ignore_13_0,
                    	    								"org.prettyprinter.sml.SML.Message");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FOLLOW_64); 

                    				newLeafNode(otherlv_14, grammarAccess.getConstraintBlockAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:2647:3: (otherlv_15= 'interrupt' otherlv_16= '{' ( (lv_interrupt_17_0= ruleMessage ) ) (otherlv_18= ',' ( (lv_interrupt_19_0= ruleMessage ) ) )* otherlv_20= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==58) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSML.g:2648:4: otherlv_15= 'interrupt' otherlv_16= '{' ( (lv_interrupt_17_0= ruleMessage ) ) (otherlv_18= ',' ( (lv_interrupt_19_0= ruleMessage ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getConstraintBlockAccess().getInterruptKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_62); 

                    				newLeafNode(otherlv_16, grammarAccess.getConstraintBlockAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSML.g:2656:4: ( (lv_interrupt_17_0= ruleMessage ) )
                    // InternalSML.g:2657:5: (lv_interrupt_17_0= ruleMessage )
                    {
                    // InternalSML.g:2657:5: (lv_interrupt_17_0= ruleMessage )
                    // InternalSML.g:2658:6: lv_interrupt_17_0= ruleMessage
                    {

                    						newCompositeNode(grammarAccess.getConstraintBlockAccess().getInterruptMessageParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_interrupt_17_0=ruleMessage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintBlockRule());
                    						}
                    						add(
                    							current,
                    							"interrupt",
                    							lv_interrupt_17_0,
                    							"org.prettyprinter.sml.SML.Message");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:2675:4: (otherlv_18= ',' ( (lv_interrupt_19_0= ruleMessage ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==15) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalSML.g:2676:5: otherlv_18= ',' ( (lv_interrupt_19_0= ruleMessage ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_62); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getConstraintBlockAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSML.g:2680:5: ( (lv_interrupt_19_0= ruleMessage ) )
                    	    // InternalSML.g:2681:6: (lv_interrupt_19_0= ruleMessage )
                    	    {
                    	    // InternalSML.g:2681:6: (lv_interrupt_19_0= ruleMessage )
                    	    // InternalSML.g:2682:7: lv_interrupt_19_0= ruleMessage
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstraintBlockAccess().getInterruptMessageParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_interrupt_19_0=ruleMessage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstraintBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interrupt",
                    	    								lv_interrupt_19_0,
                    	    								"org.prettyprinter.sml.SML.Message");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FOLLOW_65); 

                    				newLeafNode(otherlv_20, grammarAccess.getConstraintBlockAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:2705:3: (otherlv_21= 'forbidden' otherlv_22= '{' ( (lv_forbidden_23_0= ruleMessage ) ) (otherlv_24= ',' ( (lv_forbidden_25_0= ruleMessage ) ) )* otherlv_26= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==59) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalSML.g:2706:4: otherlv_21= 'forbidden' otherlv_22= '{' ( (lv_forbidden_23_0= ruleMessage ) ) (otherlv_24= ',' ( (lv_forbidden_25_0= ruleMessage ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getConstraintBlockAccess().getForbiddenKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_62); 

                    				newLeafNode(otherlv_22, grammarAccess.getConstraintBlockAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSML.g:2714:4: ( (lv_forbidden_23_0= ruleMessage ) )
                    // InternalSML.g:2715:5: (lv_forbidden_23_0= ruleMessage )
                    {
                    // InternalSML.g:2715:5: (lv_forbidden_23_0= ruleMessage )
                    // InternalSML.g:2716:6: lv_forbidden_23_0= ruleMessage
                    {

                    						newCompositeNode(grammarAccess.getConstraintBlockAccess().getForbiddenMessageParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_forbidden_23_0=ruleMessage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintBlockRule());
                    						}
                    						add(
                    							current,
                    							"forbidden",
                    							lv_forbidden_23_0,
                    							"org.prettyprinter.sml.SML.Message");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:2733:4: (otherlv_24= ',' ( (lv_forbidden_25_0= ruleMessage ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==15) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalSML.g:2734:5: otherlv_24= ',' ( (lv_forbidden_25_0= ruleMessage ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FOLLOW_62); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getConstraintBlockAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSML.g:2738:5: ( (lv_forbidden_25_0= ruleMessage ) )
                    	    // InternalSML.g:2739:6: (lv_forbidden_25_0= ruleMessage )
                    	    {
                    	    // InternalSML.g:2739:6: (lv_forbidden_25_0= ruleMessage )
                    	    // InternalSML.g:2740:7: lv_forbidden_25_0= ruleMessage
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstraintBlockAccess().getForbiddenMessageParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_forbidden_25_0=ruleMessage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstraintBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"forbidden",
                    	    								lv_forbidden_25_0,
                    	    								"org.prettyprinter.sml.SML.Message");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_26, grammarAccess.getConstraintBlockAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getConstraintBlockAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleConstraintBlock"


    // $ANTLR start "entryRuleModalMessage"
    // InternalSML.g:2771:1: entryRuleModalMessage returns [EObject current=null] : iv_ruleModalMessage= ruleModalMessage EOF ;
    public final EObject entryRuleModalMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModalMessage = null;


        try {
            // InternalSML.g:2771:53: (iv_ruleModalMessage= ruleModalMessage EOF )
            // InternalSML.g:2772:2: iv_ruleModalMessage= ruleModalMessage EOF
            {
             newCompositeNode(grammarAccess.getModalMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModalMessage=ruleModalMessage();

            state._fsp--;

             current =iv_ruleModalMessage; 
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
    // $ANTLR end "entryRuleModalMessage"


    // $ANTLR start "ruleModalMessage"
    // InternalSML.g:2778:1: ruleModalMessage returns [EObject current=null] : ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_monitored_2_0= 'monitored' ) )? otherlv_3= 'ModalMessage' otherlv_4= '{' (otherlv_5= 'collectionModification' ( (lv_collectionModification_6_0= ruleDummyDatatype ) ) )? (otherlv_7= 'expectationKind' ( (lv_expectationKind_8_0= ruleExpectationKind ) ) )? (otherlv_9= 'receiver' ( ( ruleEString ) ) )? (otherlv_11= 'sender' ( ( ruleEString ) ) )? (otherlv_13= 'modelElement' ( ( ruleEString ) ) )? (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleParameterBinding ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleParameterBinding ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleModalMessage() throws RecognitionException {
        EObject current = null;

        Token lv_strict_1_0=null;
        Token lv_monitored_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_collectionModification_6_0 = null;

        Enumerator lv_expectationKind_8_0 = null;

        EObject lv_parameters_17_0 = null;

        EObject lv_parameters_19_0 = null;



        	enterRule();

        try {
            // InternalSML.g:2784:2: ( ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_monitored_2_0= 'monitored' ) )? otherlv_3= 'ModalMessage' otherlv_4= '{' (otherlv_5= 'collectionModification' ( (lv_collectionModification_6_0= ruleDummyDatatype ) ) )? (otherlv_7= 'expectationKind' ( (lv_expectationKind_8_0= ruleExpectationKind ) ) )? (otherlv_9= 'receiver' ( ( ruleEString ) ) )? (otherlv_11= 'sender' ( ( ruleEString ) ) )? (otherlv_13= 'modelElement' ( ( ruleEString ) ) )? (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleParameterBinding ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleParameterBinding ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalSML.g:2785:2: ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_monitored_2_0= 'monitored' ) )? otherlv_3= 'ModalMessage' otherlv_4= '{' (otherlv_5= 'collectionModification' ( (lv_collectionModification_6_0= ruleDummyDatatype ) ) )? (otherlv_7= 'expectationKind' ( (lv_expectationKind_8_0= ruleExpectationKind ) ) )? (otherlv_9= 'receiver' ( ( ruleEString ) ) )? (otherlv_11= 'sender' ( ( ruleEString ) ) )? (otherlv_13= 'modelElement' ( ( ruleEString ) ) )? (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleParameterBinding ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleParameterBinding ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalSML.g:2785:2: ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_monitored_2_0= 'monitored' ) )? otherlv_3= 'ModalMessage' otherlv_4= '{' (otherlv_5= 'collectionModification' ( (lv_collectionModification_6_0= ruleDummyDatatype ) ) )? (otherlv_7= 'expectationKind' ( (lv_expectationKind_8_0= ruleExpectationKind ) ) )? (otherlv_9= 'receiver' ( ( ruleEString ) ) )? (otherlv_11= 'sender' ( ( ruleEString ) ) )? (otherlv_13= 'modelElement' ( ( ruleEString ) ) )? (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleParameterBinding ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleParameterBinding ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalSML.g:2786:3: () ( (lv_strict_1_0= 'strict' ) )? ( (lv_monitored_2_0= 'monitored' ) )? otherlv_3= 'ModalMessage' otherlv_4= '{' (otherlv_5= 'collectionModification' ( (lv_collectionModification_6_0= ruleDummyDatatype ) ) )? (otherlv_7= 'expectationKind' ( (lv_expectationKind_8_0= ruleExpectationKind ) ) )? (otherlv_9= 'receiver' ( ( ruleEString ) ) )? (otherlv_11= 'sender' ( ( ruleEString ) ) )? (otherlv_13= 'modelElement' ( ( ruleEString ) ) )? (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleParameterBinding ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleParameterBinding ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalSML.g:2786:3: ()
            // InternalSML.g:2787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModalMessageAccess().getModalMessageAction_0(),
            					current);
            			

            }

            // InternalSML.g:2793:3: ( (lv_strict_1_0= 'strict' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==60) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSML.g:2794:4: (lv_strict_1_0= 'strict' )
                    {
                    // InternalSML.g:2794:4: (lv_strict_1_0= 'strict' )
                    // InternalSML.g:2795:5: lv_strict_1_0= 'strict'
                    {
                    lv_strict_1_0=(Token)match(input,60,FOLLOW_66); 

                    					newLeafNode(lv_strict_1_0, grammarAccess.getModalMessageAccess().getStrictStrictKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModalMessageRule());
                    					}
                    					setWithLastConsumed(current, "strict", lv_strict_1_0 != null, "strict");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:2807:3: ( (lv_monitored_2_0= 'monitored' ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==61) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalSML.g:2808:4: (lv_monitored_2_0= 'monitored' )
                    {
                    // InternalSML.g:2808:4: (lv_monitored_2_0= 'monitored' )
                    // InternalSML.g:2809:5: lv_monitored_2_0= 'monitored'
                    {
                    lv_monitored_2_0=(Token)match(input,61,FOLLOW_67); 

                    					newLeafNode(lv_monitored_2_0, grammarAccess.getModalMessageAccess().getMonitoredMonitoredKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModalMessageRule());
                    					}
                    					setWithLastConsumed(current, "monitored", lv_monitored_2_0 != null, "monitored");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getModalMessageAccess().getModalMessageKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_4, grammarAccess.getModalMessageAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSML.g:2829:3: (otherlv_5= 'collectionModification' ( (lv_collectionModification_6_0= ruleDummyDatatype ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==63) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalSML.g:2830:4: otherlv_5= 'collectionModification' ( (lv_collectionModification_6_0= ruleDummyDatatype ) )
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_69); 

                    				newLeafNode(otherlv_5, grammarAccess.getModalMessageAccess().getCollectionModificationKeyword_5_0());
                    			
                    // InternalSML.g:2834:4: ( (lv_collectionModification_6_0= ruleDummyDatatype ) )
                    // InternalSML.g:2835:5: (lv_collectionModification_6_0= ruleDummyDatatype )
                    {
                    // InternalSML.g:2835:5: (lv_collectionModification_6_0= ruleDummyDatatype )
                    // InternalSML.g:2836:6: lv_collectionModification_6_0= ruleDummyDatatype
                    {

                    						newCompositeNode(grammarAccess.getModalMessageAccess().getCollectionModificationDummyDatatypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    lv_collectionModification_6_0=ruleDummyDatatype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModalMessageRule());
                    						}
                    						set(
                    							current,
                    							"collectionModification",
                    							lv_collectionModification_6_0,
                    							"org.prettyprinter.sml.SML.DummyDatatype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:2854:3: (otherlv_7= 'expectationKind' ( (lv_expectationKind_8_0= ruleExpectationKind ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==64) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalSML.g:2855:4: otherlv_7= 'expectationKind' ( (lv_expectationKind_8_0= ruleExpectationKind ) )
                    {
                    otherlv_7=(Token)match(input,64,FOLLOW_71); 

                    				newLeafNode(otherlv_7, grammarAccess.getModalMessageAccess().getExpectationKindKeyword_6_0());
                    			
                    // InternalSML.g:2859:4: ( (lv_expectationKind_8_0= ruleExpectationKind ) )
                    // InternalSML.g:2860:5: (lv_expectationKind_8_0= ruleExpectationKind )
                    {
                    // InternalSML.g:2860:5: (lv_expectationKind_8_0= ruleExpectationKind )
                    // InternalSML.g:2861:6: lv_expectationKind_8_0= ruleExpectationKind
                    {

                    						newCompositeNode(grammarAccess.getModalMessageAccess().getExpectationKindExpectationKindEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_expectationKind_8_0=ruleExpectationKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModalMessageRule());
                    						}
                    						set(
                    							current,
                    							"expectationKind",
                    							lv_expectationKind_8_0,
                    							"org.prettyprinter.sml.SML.ExpectationKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:2879:3: (otherlv_9= 'receiver' ( ( ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==65) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSML.g:2880:4: otherlv_9= 'receiver' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,65,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getModalMessageAccess().getReceiverKeyword_7_0());
                    			
                    // InternalSML.g:2884:4: ( ( ruleEString ) )
                    // InternalSML.g:2885:5: ( ruleEString )
                    {
                    // InternalSML.g:2885:5: ( ruleEString )
                    // InternalSML.g:2886:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModalMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModalMessageAccess().getReceiverRoleCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:2901:3: (otherlv_11= 'sender' ( ( ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==66) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalSML.g:2902:4: otherlv_11= 'sender' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,66,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getModalMessageAccess().getSenderKeyword_8_0());
                    			
                    // InternalSML.g:2906:4: ( ( ruleEString ) )
                    // InternalSML.g:2907:5: ( ruleEString )
                    {
                    // InternalSML.g:2907:5: ( ruleEString )
                    // InternalSML.g:2908:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModalMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModalMessageAccess().getSenderRoleCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:2923:3: (otherlv_13= 'modelElement' ( ( ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==67) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalSML.g:2924:4: otherlv_13= 'modelElement' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,67,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getModalMessageAccess().getModelElementKeyword_9_0());
                    			
                    // InternalSML.g:2928:4: ( ( ruleEString ) )
                    // InternalSML.g:2929:5: ( ruleEString )
                    {
                    // InternalSML.g:2929:5: ( ruleEString )
                    // InternalSML.g:2930:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModalMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModalMessageAccess().getModelElementETypedElementCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:2945:3: (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleParameterBinding ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleParameterBinding ) ) )* otherlv_20= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==68) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalSML.g:2946:4: otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleParameterBinding ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleParameterBinding ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,68,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getModalMessageAccess().getParametersKeyword_10_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_76); 

                    				newLeafNode(otherlv_16, grammarAccess.getModalMessageAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalSML.g:2954:4: ( (lv_parameters_17_0= ruleParameterBinding ) )
                    // InternalSML.g:2955:5: (lv_parameters_17_0= ruleParameterBinding )
                    {
                    // InternalSML.g:2955:5: (lv_parameters_17_0= ruleParameterBinding )
                    // InternalSML.g:2956:6: lv_parameters_17_0= ruleParameterBinding
                    {

                    						newCompositeNode(grammarAccess.getModalMessageAccess().getParametersParameterBindingParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parameters_17_0=ruleParameterBinding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModalMessageRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_17_0,
                    							"org.prettyprinter.sml.SML.ParameterBinding");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:2973:4: (otherlv_18= ',' ( (lv_parameters_19_0= ruleParameterBinding ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==15) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalSML.g:2974:5: otherlv_18= ',' ( (lv_parameters_19_0= ruleParameterBinding ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_76); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getModalMessageAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalSML.g:2978:5: ( (lv_parameters_19_0= ruleParameterBinding ) )
                    	    // InternalSML.g:2979:6: (lv_parameters_19_0= ruleParameterBinding )
                    	    {
                    	    // InternalSML.g:2979:6: (lv_parameters_19_0= ruleParameterBinding )
                    	    // InternalSML.g:2980:7: lv_parameters_19_0= ruleParameterBinding
                    	    {

                    	    							newCompositeNode(grammarAccess.getModalMessageAccess().getParametersParameterBindingParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_parameters_19_0=ruleParameterBinding();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModalMessageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_19_0,
                    	    								"org.prettyprinter.sml.SML.ParameterBinding");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_20, grammarAccess.getModalMessageAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getModalMessageAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleModalMessage"


    // $ANTLR start "entryRuleAlternative"
    // InternalSML.g:3011:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalSML.g:3011:52: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalSML.g:3012:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalSML.g:3018:1: ruleAlternative returns [EObject current=null] : ( () otherlv_1= 'Alternative' otherlv_2= '{' (otherlv_3= 'cases' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) ) (otherlv_6= ',' ( (lv_cases_7_0= ruleCase ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_cases_5_0 = null;

        EObject lv_cases_7_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3024:2: ( ( () otherlv_1= 'Alternative' otherlv_2= '{' (otherlv_3= 'cases' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) ) (otherlv_6= ',' ( (lv_cases_7_0= ruleCase ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSML.g:3025:2: ( () otherlv_1= 'Alternative' otherlv_2= '{' (otherlv_3= 'cases' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) ) (otherlv_6= ',' ( (lv_cases_7_0= ruleCase ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSML.g:3025:2: ( () otherlv_1= 'Alternative' otherlv_2= '{' (otherlv_3= 'cases' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) ) (otherlv_6= ',' ( (lv_cases_7_0= ruleCase ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSML.g:3026:3: () otherlv_1= 'Alternative' otherlv_2= '{' (otherlv_3= 'cases' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) ) (otherlv_6= ',' ( (lv_cases_7_0= ruleCase ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSML.g:3026:3: ()
            // InternalSML.g:3027:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlternativeAccess().getAlternativeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAlternativeAccess().getAlternativeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:3041:3: (otherlv_3= 'cases' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) ) (otherlv_6= ',' ( (lv_cases_7_0= ruleCase ) ) )* otherlv_8= '}' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==70) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalSML.g:3042:4: otherlv_3= 'cases' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) ) (otherlv_6= ',' ( (lv_cases_7_0= ruleCase ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,70,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlternativeAccess().getCasesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_78); 

                    				newLeafNode(otherlv_4, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSML.g:3050:4: ( (lv_cases_5_0= ruleCase ) )
                    // InternalSML.g:3051:5: (lv_cases_5_0= ruleCase )
                    {
                    // InternalSML.g:3051:5: (lv_cases_5_0= ruleCase )
                    // InternalSML.g:3052:6: lv_cases_5_0= ruleCase
                    {

                    						newCompositeNode(grammarAccess.getAlternativeAccess().getCasesCaseParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_cases_5_0=ruleCase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlternativeRule());
                    						}
                    						add(
                    							current,
                    							"cases",
                    							lv_cases_5_0,
                    							"org.prettyprinter.sml.SML.Case");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:3069:4: (otherlv_6= ',' ( (lv_cases_7_0= ruleCase ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==15) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalSML.g:3070:5: otherlv_6= ',' ( (lv_cases_7_0= ruleCase ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_78); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAlternativeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSML.g:3074:5: ( (lv_cases_7_0= ruleCase ) )
                    	    // InternalSML.g:3075:6: (lv_cases_7_0= ruleCase )
                    	    {
                    	    // InternalSML.g:3075:6: (lv_cases_7_0= ruleCase )
                    	    // InternalSML.g:3076:7: lv_cases_7_0= ruleCase
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlternativeAccess().getCasesCaseParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_cases_7_0=ruleCase();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlternativeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cases",
                    	    								lv_cases_7_0,
                    	    								"org.prettyprinter.sml.SML.Case");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleLoop"
    // InternalSML.g:3107:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalSML.g:3107:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalSML.g:3108:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalSML.g:3114:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'bodyInteraction' ( (lv_bodyInteraction_4_0= ruleInteraction ) ) )? (otherlv_5= 'loopCondition' ( (lv_loopCondition_6_0= ruleCondition ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_bodyInteraction_4_0 = null;

        EObject lv_loopCondition_6_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3120:2: ( ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'bodyInteraction' ( (lv_bodyInteraction_4_0= ruleInteraction ) ) )? (otherlv_5= 'loopCondition' ( (lv_loopCondition_6_0= ruleCondition ) ) )? otherlv_7= '}' ) )
            // InternalSML.g:3121:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'bodyInteraction' ( (lv_bodyInteraction_4_0= ruleInteraction ) ) )? (otherlv_5= 'loopCondition' ( (lv_loopCondition_6_0= ruleCondition ) ) )? otherlv_7= '}' )
            {
            // InternalSML.g:3121:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'bodyInteraction' ( (lv_bodyInteraction_4_0= ruleInteraction ) ) )? (otherlv_5= 'loopCondition' ( (lv_loopCondition_6_0= ruleCondition ) ) )? otherlv_7= '}' )
            // InternalSML.g:3122:3: () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'bodyInteraction' ( (lv_bodyInteraction_4_0= ruleInteraction ) ) )? (otherlv_5= 'loopCondition' ( (lv_loopCondition_6_0= ruleCondition ) ) )? otherlv_7= '}'
            {
            // InternalSML.g:3122:3: ()
            // InternalSML.g:3123:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:3137:3: (otherlv_3= 'bodyInteraction' ( (lv_bodyInteraction_4_0= ruleInteraction ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==72) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalSML.g:3138:4: otherlv_3= 'bodyInteraction' ( (lv_bodyInteraction_4_0= ruleInteraction ) )
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getBodyInteractionKeyword_3_0());
                    			
                    // InternalSML.g:3142:4: ( (lv_bodyInteraction_4_0= ruleInteraction ) )
                    // InternalSML.g:3143:5: (lv_bodyInteraction_4_0= ruleInteraction )
                    {
                    // InternalSML.g:3143:5: (lv_bodyInteraction_4_0= ruleInteraction )
                    // InternalSML.g:3144:6: lv_bodyInteraction_4_0= ruleInteraction
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getBodyInteractionInteractionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    lv_bodyInteraction_4_0=ruleInteraction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						set(
                    							current,
                    							"bodyInteraction",
                    							lv_bodyInteraction_4_0,
                    							"org.prettyprinter.sml.SML.Interaction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:3162:3: (otherlv_5= 'loopCondition' ( (lv_loopCondition_6_0= ruleCondition ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==73) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalSML.g:3163:4: otherlv_5= 'loopCondition' ( (lv_loopCondition_6_0= ruleCondition ) )
                    {
                    otherlv_5=(Token)match(input,73,FOLLOW_81); 

                    				newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getLoopConditionKeyword_4_0());
                    			
                    // InternalSML.g:3167:4: ( (lv_loopCondition_6_0= ruleCondition ) )
                    // InternalSML.g:3168:5: (lv_loopCondition_6_0= ruleCondition )
                    {
                    // InternalSML.g:3168:5: (lv_loopCondition_6_0= ruleCondition )
                    // InternalSML.g:3169:6: lv_loopCondition_6_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getLoopConditionConditionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_loopCondition_6_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						set(
                    							current,
                    							"loopCondition",
                    							lv_loopCondition_6_0,
                    							"org.prettyprinter.sml.SML.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleParallel"
    // InternalSML.g:3195:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // InternalSML.g:3195:49: (iv_ruleParallel= ruleParallel EOF )
            // InternalSML.g:3196:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
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
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // InternalSML.g:3202:1: ruleParallel returns [EObject current=null] : ( () otherlv_1= 'Parallel' otherlv_2= '{' (otherlv_3= 'parallelInteraction' otherlv_4= '{' ( (lv_parallelInteraction_5_0= ruleInteraction ) ) (otherlv_6= ',' ( (lv_parallelInteraction_7_0= ruleInteraction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_parallelInteraction_5_0 = null;

        EObject lv_parallelInteraction_7_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3208:2: ( ( () otherlv_1= 'Parallel' otherlv_2= '{' (otherlv_3= 'parallelInteraction' otherlv_4= '{' ( (lv_parallelInteraction_5_0= ruleInteraction ) ) (otherlv_6= ',' ( (lv_parallelInteraction_7_0= ruleInteraction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSML.g:3209:2: ( () otherlv_1= 'Parallel' otherlv_2= '{' (otherlv_3= 'parallelInteraction' otherlv_4= '{' ( (lv_parallelInteraction_5_0= ruleInteraction ) ) (otherlv_6= ',' ( (lv_parallelInteraction_7_0= ruleInteraction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSML.g:3209:2: ( () otherlv_1= 'Parallel' otherlv_2= '{' (otherlv_3= 'parallelInteraction' otherlv_4= '{' ( (lv_parallelInteraction_5_0= ruleInteraction ) ) (otherlv_6= ',' ( (lv_parallelInteraction_7_0= ruleInteraction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSML.g:3210:3: () otherlv_1= 'Parallel' otherlv_2= '{' (otherlv_3= 'parallelInteraction' otherlv_4= '{' ( (lv_parallelInteraction_5_0= ruleInteraction ) ) (otherlv_6= ',' ( (lv_parallelInteraction_7_0= ruleInteraction ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSML.g:3210:3: ()
            // InternalSML.g:3211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParallelAccess().getParallelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelAccess().getParallelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_82); 

            			newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:3225:3: (otherlv_3= 'parallelInteraction' otherlv_4= '{' ( (lv_parallelInteraction_5_0= ruleInteraction ) ) (otherlv_6= ',' ( (lv_parallelInteraction_7_0= ruleInteraction ) ) )* otherlv_8= '}' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==75) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalSML.g:3226:4: otherlv_3= 'parallelInteraction' otherlv_4= '{' ( (lv_parallelInteraction_5_0= ruleInteraction ) ) (otherlv_6= ',' ( (lv_parallelInteraction_7_0= ruleInteraction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallelAccess().getParallelInteractionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallelAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSML.g:3234:4: ( (lv_parallelInteraction_5_0= ruleInteraction ) )
                    // InternalSML.g:3235:5: (lv_parallelInteraction_5_0= ruleInteraction )
                    {
                    // InternalSML.g:3235:5: (lv_parallelInteraction_5_0= ruleInteraction )
                    // InternalSML.g:3236:6: lv_parallelInteraction_5_0= ruleInteraction
                    {

                    						newCompositeNode(grammarAccess.getParallelAccess().getParallelInteractionInteractionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parallelInteraction_5_0=ruleInteraction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallelRule());
                    						}
                    						add(
                    							current,
                    							"parallelInteraction",
                    							lv_parallelInteraction_5_0,
                    							"org.prettyprinter.sml.SML.Interaction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:3253:4: (otherlv_6= ',' ( (lv_parallelInteraction_7_0= ruleInteraction ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==15) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalSML.g:3254:5: otherlv_6= ',' ( (lv_parallelInteraction_7_0= ruleInteraction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParallelAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSML.g:3258:5: ( (lv_parallelInteraction_7_0= ruleInteraction ) )
                    	    // InternalSML.g:3259:6: (lv_parallelInteraction_7_0= ruleInteraction )
                    	    {
                    	    // InternalSML.g:3259:6: (lv_parallelInteraction_7_0= ruleInteraction )
                    	    // InternalSML.g:3260:7: lv_parallelInteraction_7_0= ruleInteraction
                    	    {

                    	    							newCompositeNode(grammarAccess.getParallelAccess().getParallelInteractionInteractionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_parallelInteraction_7_0=ruleInteraction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParallelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parallelInteraction",
                    	    								lv_parallelInteraction_7_0,
                    	    								"org.prettyprinter.sml.SML.Interaction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallelAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParallelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleWaitCondition"
    // InternalSML.g:3291:1: entryRuleWaitCondition returns [EObject current=null] : iv_ruleWaitCondition= ruleWaitCondition EOF ;
    public final EObject entryRuleWaitCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitCondition = null;


        try {
            // InternalSML.g:3291:54: (iv_ruleWaitCondition= ruleWaitCondition EOF )
            // InternalSML.g:3292:2: iv_ruleWaitCondition= ruleWaitCondition EOF
            {
             newCompositeNode(grammarAccess.getWaitConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaitCondition=ruleWaitCondition();

            state._fsp--;

             current =iv_ruleWaitCondition; 
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
    // $ANTLR end "entryRuleWaitCondition"


    // $ANTLR start "ruleWaitCondition"
    // InternalSML.g:3298:1: ruleWaitCondition returns [EObject current=null] : ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_requested_2_0= 'requested' ) )? otherlv_3= 'WaitCondition' otherlv_4= '{' (otherlv_5= 'conditionExpression' ( (lv_conditionExpression_6_0= ruleConditionExpression ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleWaitCondition() throws RecognitionException {
        EObject current = null;

        Token lv_strict_1_0=null;
        Token lv_requested_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_conditionExpression_6_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3304:2: ( ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_requested_2_0= 'requested' ) )? otherlv_3= 'WaitCondition' otherlv_4= '{' (otherlv_5= 'conditionExpression' ( (lv_conditionExpression_6_0= ruleConditionExpression ) ) )? otherlv_7= '}' ) )
            // InternalSML.g:3305:2: ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_requested_2_0= 'requested' ) )? otherlv_3= 'WaitCondition' otherlv_4= '{' (otherlv_5= 'conditionExpression' ( (lv_conditionExpression_6_0= ruleConditionExpression ) ) )? otherlv_7= '}' )
            {
            // InternalSML.g:3305:2: ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_requested_2_0= 'requested' ) )? otherlv_3= 'WaitCondition' otherlv_4= '{' (otherlv_5= 'conditionExpression' ( (lv_conditionExpression_6_0= ruleConditionExpression ) ) )? otherlv_7= '}' )
            // InternalSML.g:3306:3: () ( (lv_strict_1_0= 'strict' ) )? ( (lv_requested_2_0= 'requested' ) )? otherlv_3= 'WaitCondition' otherlv_4= '{' (otherlv_5= 'conditionExpression' ( (lv_conditionExpression_6_0= ruleConditionExpression ) ) )? otherlv_7= '}'
            {
            // InternalSML.g:3306:3: ()
            // InternalSML.g:3307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWaitConditionAccess().getWaitConditionAction_0(),
            					current);
            			

            }

            // InternalSML.g:3313:3: ( (lv_strict_1_0= 'strict' ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==60) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSML.g:3314:4: (lv_strict_1_0= 'strict' )
                    {
                    // InternalSML.g:3314:4: (lv_strict_1_0= 'strict' )
                    // InternalSML.g:3315:5: lv_strict_1_0= 'strict'
                    {
                    lv_strict_1_0=(Token)match(input,60,FOLLOW_83); 

                    					newLeafNode(lv_strict_1_0, grammarAccess.getWaitConditionAccess().getStrictStrictKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWaitConditionRule());
                    					}
                    					setWithLastConsumed(current, "strict", lv_strict_1_0 != null, "strict");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:3327:3: ( (lv_requested_2_0= 'requested' ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==76) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalSML.g:3328:4: (lv_requested_2_0= 'requested' )
                    {
                    // InternalSML.g:3328:4: (lv_requested_2_0= 'requested' )
                    // InternalSML.g:3329:5: lv_requested_2_0= 'requested'
                    {
                    lv_requested_2_0=(Token)match(input,76,FOLLOW_84); 

                    					newLeafNode(lv_requested_2_0, grammarAccess.getWaitConditionAccess().getRequestedRequestedKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWaitConditionRule());
                    					}
                    					setWithLastConsumed(current, "requested", lv_requested_2_0 != null, "requested");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getWaitConditionAccess().getWaitConditionKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_4, grammarAccess.getWaitConditionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSML.g:3349:3: (otherlv_5= 'conditionExpression' ( (lv_conditionExpression_6_0= ruleConditionExpression ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==78) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSML.g:3350:4: otherlv_5= 'conditionExpression' ( (lv_conditionExpression_6_0= ruleConditionExpression ) )
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_86); 

                    				newLeafNode(otherlv_5, grammarAccess.getWaitConditionAccess().getConditionExpressionKeyword_5_0());
                    			
                    // InternalSML.g:3354:4: ( (lv_conditionExpression_6_0= ruleConditionExpression ) )
                    // InternalSML.g:3355:5: (lv_conditionExpression_6_0= ruleConditionExpression )
                    {
                    // InternalSML.g:3355:5: (lv_conditionExpression_6_0= ruleConditionExpression )
                    // InternalSML.g:3356:6: lv_conditionExpression_6_0= ruleConditionExpression
                    {

                    						newCompositeNode(grammarAccess.getWaitConditionAccess().getConditionExpressionConditionExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_conditionExpression_6_0=ruleConditionExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWaitConditionRule());
                    						}
                    						set(
                    							current,
                    							"conditionExpression",
                    							lv_conditionExpression_6_0,
                    							"org.prettyprinter.sml.SML.ConditionExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getWaitConditionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleWaitCondition"


    // $ANTLR start "entryRuleInterruptCondition"
    // InternalSML.g:3382:1: entryRuleInterruptCondition returns [EObject current=null] : iv_ruleInterruptCondition= ruleInterruptCondition EOF ;
    public final EObject entryRuleInterruptCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterruptCondition = null;


        try {
            // InternalSML.g:3382:59: (iv_ruleInterruptCondition= ruleInterruptCondition EOF )
            // InternalSML.g:3383:2: iv_ruleInterruptCondition= ruleInterruptCondition EOF
            {
             newCompositeNode(grammarAccess.getInterruptConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterruptCondition=ruleInterruptCondition();

            state._fsp--;

             current =iv_ruleInterruptCondition; 
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
    // $ANTLR end "entryRuleInterruptCondition"


    // $ANTLR start "ruleInterruptCondition"
    // InternalSML.g:3389:1: ruleInterruptCondition returns [EObject current=null] : ( () otherlv_1= 'InterruptCondition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleInterruptCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_conditionExpression_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3395:2: ( ( () otherlv_1= 'InterruptCondition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:3396:2: ( () otherlv_1= 'InterruptCondition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:3396:2: ( () otherlv_1= 'InterruptCondition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' )
            // InternalSML.g:3397:3: () otherlv_1= 'InterruptCondition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:3397:3: ()
            // InternalSML.g:3398:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterruptConditionAccess().getInterruptConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInterruptConditionAccess().getInterruptConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getInterruptConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:3412:3: (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==78) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalSML.g:3413:4: otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) )
                    {
                    otherlv_3=(Token)match(input,78,FOLLOW_86); 

                    				newLeafNode(otherlv_3, grammarAccess.getInterruptConditionAccess().getConditionExpressionKeyword_3_0());
                    			
                    // InternalSML.g:3417:4: ( (lv_conditionExpression_4_0= ruleConditionExpression ) )
                    // InternalSML.g:3418:5: (lv_conditionExpression_4_0= ruleConditionExpression )
                    {
                    // InternalSML.g:3418:5: (lv_conditionExpression_4_0= ruleConditionExpression )
                    // InternalSML.g:3419:6: lv_conditionExpression_4_0= ruleConditionExpression
                    {

                    						newCompositeNode(grammarAccess.getInterruptConditionAccess().getConditionExpressionConditionExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_conditionExpression_4_0=ruleConditionExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterruptConditionRule());
                    						}
                    						set(
                    							current,
                    							"conditionExpression",
                    							lv_conditionExpression_4_0,
                    							"org.prettyprinter.sml.SML.ConditionExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInterruptConditionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInterruptCondition"


    // $ANTLR start "entryRuleViolationCondition"
    // InternalSML.g:3445:1: entryRuleViolationCondition returns [EObject current=null] : iv_ruleViolationCondition= ruleViolationCondition EOF ;
    public final EObject entryRuleViolationCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViolationCondition = null;


        try {
            // InternalSML.g:3445:59: (iv_ruleViolationCondition= ruleViolationCondition EOF )
            // InternalSML.g:3446:2: iv_ruleViolationCondition= ruleViolationCondition EOF
            {
             newCompositeNode(grammarAccess.getViolationConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViolationCondition=ruleViolationCondition();

            state._fsp--;

             current =iv_ruleViolationCondition; 
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
    // $ANTLR end "entryRuleViolationCondition"


    // $ANTLR start "ruleViolationCondition"
    // InternalSML.g:3452:1: ruleViolationCondition returns [EObject current=null] : ( () otherlv_1= 'ViolationCondition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleViolationCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_conditionExpression_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3458:2: ( ( () otherlv_1= 'ViolationCondition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:3459:2: ( () otherlv_1= 'ViolationCondition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:3459:2: ( () otherlv_1= 'ViolationCondition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' )
            // InternalSML.g:3460:3: () otherlv_1= 'ViolationCondition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:3460:3: ()
            // InternalSML.g:3461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getViolationConditionAccess().getViolationConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getViolationConditionAccess().getViolationConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getViolationConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:3475:3: (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==78) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalSML.g:3476:4: otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) )
                    {
                    otherlv_3=(Token)match(input,78,FOLLOW_86); 

                    				newLeafNode(otherlv_3, grammarAccess.getViolationConditionAccess().getConditionExpressionKeyword_3_0());
                    			
                    // InternalSML.g:3480:4: ( (lv_conditionExpression_4_0= ruleConditionExpression ) )
                    // InternalSML.g:3481:5: (lv_conditionExpression_4_0= ruleConditionExpression )
                    {
                    // InternalSML.g:3481:5: (lv_conditionExpression_4_0= ruleConditionExpression )
                    // InternalSML.g:3482:6: lv_conditionExpression_4_0= ruleConditionExpression
                    {

                    						newCompositeNode(grammarAccess.getViolationConditionAccess().getConditionExpressionConditionExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_conditionExpression_4_0=ruleConditionExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getViolationConditionRule());
                    						}
                    						set(
                    							current,
                    							"conditionExpression",
                    							lv_conditionExpression_4_0,
                    							"org.prettyprinter.sml.SML.ConditionExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getViolationConditionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleViolationCondition"


    // $ANTLR start "entryRuleCondition"
    // InternalSML.g:3508:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSML.g:3508:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSML.g:3509:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalSML.g:3515:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_conditionExpression_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3521:2: ( ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:3522:2: ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:3522:2: ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}' )
            // InternalSML.g:3523:3: () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:3523:3: ()
            // InternalSML.g:3524:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:3538:3: (otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==78) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalSML.g:3539:4: otherlv_3= 'conditionExpression' ( (lv_conditionExpression_4_0= ruleConditionExpression ) )
                    {
                    otherlv_3=(Token)match(input,78,FOLLOW_86); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getConditionExpressionKeyword_3_0());
                    			
                    // InternalSML.g:3543:4: ( (lv_conditionExpression_4_0= ruleConditionExpression ) )
                    // InternalSML.g:3544:5: (lv_conditionExpression_4_0= ruleConditionExpression )
                    {
                    // InternalSML.g:3544:5: (lv_conditionExpression_4_0= ruleConditionExpression )
                    // InternalSML.g:3545:6: lv_conditionExpression_4_0= ruleConditionExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getConditionExpressionConditionExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_conditionExpression_4_0=ruleConditionExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"conditionExpression",
                    							lv_conditionExpression_4_0,
                    							"org.prettyprinter.sml.SML.ConditionExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleVariableFragment"
    // InternalSML.g:3571:1: entryRuleVariableFragment returns [EObject current=null] : iv_ruleVariableFragment= ruleVariableFragment EOF ;
    public final EObject entryRuleVariableFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableFragment = null;


        try {
            // InternalSML.g:3571:57: (iv_ruleVariableFragment= ruleVariableFragment EOF )
            // InternalSML.g:3572:2: iv_ruleVariableFragment= ruleVariableFragment EOF
            {
             newCompositeNode(grammarAccess.getVariableFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableFragment=ruleVariableFragment();

            state._fsp--;

             current =iv_ruleVariableFragment; 
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
    // $ANTLR end "entryRuleVariableFragment"


    // $ANTLR start "ruleVariableFragment"
    // InternalSML.g:3578:1: ruleVariableFragment returns [EObject current=null] : ( () otherlv_1= 'VariableFragment' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleVariableFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3584:2: ( ( () otherlv_1= 'VariableFragment' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:3585:2: ( () otherlv_1= 'VariableFragment' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:3585:2: ( () otherlv_1= 'VariableFragment' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            // InternalSML.g:3586:3: () otherlv_1= 'VariableFragment' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:3586:3: ()
            // InternalSML.g:3587:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableFragmentAccess().getVariableFragmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableFragmentAccess().getVariableFragmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_87); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableFragmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:3601:3: (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==83) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalSML.g:3602:4: otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) )
                    {
                    otherlv_3=(Token)match(input,83,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableFragmentAccess().getExpressionKeyword_3_0());
                    			
                    // InternalSML.g:3606:4: ( (lv_expression_4_0= ruleDummyExprClass ) )
                    // InternalSML.g:3607:5: (lv_expression_4_0= ruleDummyExprClass )
                    {
                    // InternalSML.g:3607:5: (lv_expression_4_0= ruleDummyExprClass )
                    // InternalSML.g:3608:6: lv_expression_4_0= ruleDummyExprClass
                    {

                    						newCompositeNode(grammarAccess.getVariableFragmentAccess().getExpressionDummyExprClassParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_expression_4_0=ruleDummyExprClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableFragmentRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_4_0,
                    							"org.prettyprinter.sml.SML.DummyExprClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableFragmentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleVariableFragment"


    // $ANTLR start "entryRuleTimedViolationCondition"
    // InternalSML.g:3634:1: entryRuleTimedViolationCondition returns [EObject current=null] : iv_ruleTimedViolationCondition= ruleTimedViolationCondition EOF ;
    public final EObject entryRuleTimedViolationCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimedViolationCondition = null;


        try {
            // InternalSML.g:3634:64: (iv_ruleTimedViolationCondition= ruleTimedViolationCondition EOF )
            // InternalSML.g:3635:2: iv_ruleTimedViolationCondition= ruleTimedViolationCondition EOF
            {
             newCompositeNode(grammarAccess.getTimedViolationConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimedViolationCondition=ruleTimedViolationCondition();

            state._fsp--;

             current =iv_ruleTimedViolationCondition; 
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
    // $ANTLR end "entryRuleTimedViolationCondition"


    // $ANTLR start "ruleTimedViolationCondition"
    // InternalSML.g:3641:1: ruleTimedViolationCondition returns [EObject current=null] : ( () otherlv_1= 'TimedViolationCondition' otherlv_2= '{' (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTimedViolationCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_timedConditionExpression_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3647:2: ( ( () otherlv_1= 'TimedViolationCondition' otherlv_2= '{' (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:3648:2: ( () otherlv_1= 'TimedViolationCondition' otherlv_2= '{' (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:3648:2: ( () otherlv_1= 'TimedViolationCondition' otherlv_2= '{' (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            // InternalSML.g:3649:3: () otherlv_1= 'TimedViolationCondition' otherlv_2= '{' (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:3649:3: ()
            // InternalSML.g:3650:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimedViolationConditionAccess().getTimedViolationConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTimedViolationConditionAccess().getTimedViolationConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_88); 

            			newLeafNode(otherlv_2, grammarAccess.getTimedViolationConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:3664:3: (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==85) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalSML.g:3665:4: otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) )
                    {
                    otherlv_3=(Token)match(input,85,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimedViolationConditionAccess().getTimedConditionExpressionKeyword_3_0());
                    			
                    // InternalSML.g:3669:4: ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) )
                    // InternalSML.g:3670:5: (lv_timedConditionExpression_4_0= ruleDummyExprClass )
                    {
                    // InternalSML.g:3670:5: (lv_timedConditionExpression_4_0= ruleDummyExprClass )
                    // InternalSML.g:3671:6: lv_timedConditionExpression_4_0= ruleDummyExprClass
                    {

                    						newCompositeNode(grammarAccess.getTimedViolationConditionAccess().getTimedConditionExpressionDummyExprClassParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_timedConditionExpression_4_0=ruleDummyExprClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimedViolationConditionRule());
                    						}
                    						set(
                    							current,
                    							"timedConditionExpression",
                    							lv_timedConditionExpression_4_0,
                    							"org.prettyprinter.sml.SML.DummyExprClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTimedViolationConditionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTimedViolationCondition"


    // $ANTLR start "entryRuleTimedInterruptCondition"
    // InternalSML.g:3697:1: entryRuleTimedInterruptCondition returns [EObject current=null] : iv_ruleTimedInterruptCondition= ruleTimedInterruptCondition EOF ;
    public final EObject entryRuleTimedInterruptCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimedInterruptCondition = null;


        try {
            // InternalSML.g:3697:64: (iv_ruleTimedInterruptCondition= ruleTimedInterruptCondition EOF )
            // InternalSML.g:3698:2: iv_ruleTimedInterruptCondition= ruleTimedInterruptCondition EOF
            {
             newCompositeNode(grammarAccess.getTimedInterruptConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimedInterruptCondition=ruleTimedInterruptCondition();

            state._fsp--;

             current =iv_ruleTimedInterruptCondition; 
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
    // $ANTLR end "entryRuleTimedInterruptCondition"


    // $ANTLR start "ruleTimedInterruptCondition"
    // InternalSML.g:3704:1: ruleTimedInterruptCondition returns [EObject current=null] : ( () otherlv_1= 'TimedInterruptCondition' otherlv_2= '{' (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTimedInterruptCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_timedConditionExpression_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3710:2: ( ( () otherlv_1= 'TimedInterruptCondition' otherlv_2= '{' (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:3711:2: ( () otherlv_1= 'TimedInterruptCondition' otherlv_2= '{' (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:3711:2: ( () otherlv_1= 'TimedInterruptCondition' otherlv_2= '{' (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            // InternalSML.g:3712:3: () otherlv_1= 'TimedInterruptCondition' otherlv_2= '{' (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:3712:3: ()
            // InternalSML.g:3713:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimedInterruptConditionAccess().getTimedInterruptConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTimedInterruptConditionAccess().getTimedInterruptConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_88); 

            			newLeafNode(otherlv_2, grammarAccess.getTimedInterruptConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:3727:3: (otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==85) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalSML.g:3728:4: otherlv_3= 'timedConditionExpression' ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) )
                    {
                    otherlv_3=(Token)match(input,85,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimedInterruptConditionAccess().getTimedConditionExpressionKeyword_3_0());
                    			
                    // InternalSML.g:3732:4: ( (lv_timedConditionExpression_4_0= ruleDummyExprClass ) )
                    // InternalSML.g:3733:5: (lv_timedConditionExpression_4_0= ruleDummyExprClass )
                    {
                    // InternalSML.g:3733:5: (lv_timedConditionExpression_4_0= ruleDummyExprClass )
                    // InternalSML.g:3734:6: lv_timedConditionExpression_4_0= ruleDummyExprClass
                    {

                    						newCompositeNode(grammarAccess.getTimedInterruptConditionAccess().getTimedConditionExpressionDummyExprClassParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_timedConditionExpression_4_0=ruleDummyExprClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimedInterruptConditionRule());
                    						}
                    						set(
                    							current,
                    							"timedConditionExpression",
                    							lv_timedConditionExpression_4_0,
                    							"org.prettyprinter.sml.SML.DummyExprClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTimedInterruptConditionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTimedInterruptCondition"


    // $ANTLR start "entryRuleTimedWaitCondition"
    // InternalSML.g:3760:1: entryRuleTimedWaitCondition returns [EObject current=null] : iv_ruleTimedWaitCondition= ruleTimedWaitCondition EOF ;
    public final EObject entryRuleTimedWaitCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimedWaitCondition = null;


        try {
            // InternalSML.g:3760:59: (iv_ruleTimedWaitCondition= ruleTimedWaitCondition EOF )
            // InternalSML.g:3761:2: iv_ruleTimedWaitCondition= ruleTimedWaitCondition EOF
            {
             newCompositeNode(grammarAccess.getTimedWaitConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimedWaitCondition=ruleTimedWaitCondition();

            state._fsp--;

             current =iv_ruleTimedWaitCondition; 
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
    // $ANTLR end "entryRuleTimedWaitCondition"


    // $ANTLR start "ruleTimedWaitCondition"
    // InternalSML.g:3767:1: ruleTimedWaitCondition returns [EObject current=null] : ( () ( (lv_requested_1_0= 'requested' ) )? ( (lv_strict_2_0= 'strict' ) )? otherlv_3= 'TimedWaitCondition' otherlv_4= '{' (otherlv_5= 'timedConditionExpression' ( (lv_timedConditionExpression_6_0= ruleDummyExprClass ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleTimedWaitCondition() throws RecognitionException {
        EObject current = null;

        Token lv_requested_1_0=null;
        Token lv_strict_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_timedConditionExpression_6_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3773:2: ( ( () ( (lv_requested_1_0= 'requested' ) )? ( (lv_strict_2_0= 'strict' ) )? otherlv_3= 'TimedWaitCondition' otherlv_4= '{' (otherlv_5= 'timedConditionExpression' ( (lv_timedConditionExpression_6_0= ruleDummyExprClass ) ) )? otherlv_7= '}' ) )
            // InternalSML.g:3774:2: ( () ( (lv_requested_1_0= 'requested' ) )? ( (lv_strict_2_0= 'strict' ) )? otherlv_3= 'TimedWaitCondition' otherlv_4= '{' (otherlv_5= 'timedConditionExpression' ( (lv_timedConditionExpression_6_0= ruleDummyExprClass ) ) )? otherlv_7= '}' )
            {
            // InternalSML.g:3774:2: ( () ( (lv_requested_1_0= 'requested' ) )? ( (lv_strict_2_0= 'strict' ) )? otherlv_3= 'TimedWaitCondition' otherlv_4= '{' (otherlv_5= 'timedConditionExpression' ( (lv_timedConditionExpression_6_0= ruleDummyExprClass ) ) )? otherlv_7= '}' )
            // InternalSML.g:3775:3: () ( (lv_requested_1_0= 'requested' ) )? ( (lv_strict_2_0= 'strict' ) )? otherlv_3= 'TimedWaitCondition' otherlv_4= '{' (otherlv_5= 'timedConditionExpression' ( (lv_timedConditionExpression_6_0= ruleDummyExprClass ) ) )? otherlv_7= '}'
            {
            // InternalSML.g:3775:3: ()
            // InternalSML.g:3776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimedWaitConditionAccess().getTimedWaitConditionAction_0(),
            					current);
            			

            }

            // InternalSML.g:3782:3: ( (lv_requested_1_0= 'requested' ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==76) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalSML.g:3783:4: (lv_requested_1_0= 'requested' )
                    {
                    // InternalSML.g:3783:4: (lv_requested_1_0= 'requested' )
                    // InternalSML.g:3784:5: lv_requested_1_0= 'requested'
                    {
                    lv_requested_1_0=(Token)match(input,76,FOLLOW_89); 

                    					newLeafNode(lv_requested_1_0, grammarAccess.getTimedWaitConditionAccess().getRequestedRequestedKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimedWaitConditionRule());
                    					}
                    					setWithLastConsumed(current, "requested", lv_requested_1_0 != null, "requested");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:3796:3: ( (lv_strict_2_0= 'strict' ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==60) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalSML.g:3797:4: (lv_strict_2_0= 'strict' )
                    {
                    // InternalSML.g:3797:4: (lv_strict_2_0= 'strict' )
                    // InternalSML.g:3798:5: lv_strict_2_0= 'strict'
                    {
                    lv_strict_2_0=(Token)match(input,60,FOLLOW_90); 

                    					newLeafNode(lv_strict_2_0, grammarAccess.getTimedWaitConditionAccess().getStrictStrictKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimedWaitConditionRule());
                    					}
                    					setWithLastConsumed(current, "strict", lv_strict_2_0 != null, "strict");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,87,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getTimedWaitConditionAccess().getTimedWaitConditionKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_88); 

            			newLeafNode(otherlv_4, grammarAccess.getTimedWaitConditionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSML.g:3818:3: (otherlv_5= 'timedConditionExpression' ( (lv_timedConditionExpression_6_0= ruleDummyExprClass ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==85) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalSML.g:3819:4: otherlv_5= 'timedConditionExpression' ( (lv_timedConditionExpression_6_0= ruleDummyExprClass ) )
                    {
                    otherlv_5=(Token)match(input,85,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getTimedWaitConditionAccess().getTimedConditionExpressionKeyword_5_0());
                    			
                    // InternalSML.g:3823:4: ( (lv_timedConditionExpression_6_0= ruleDummyExprClass ) )
                    // InternalSML.g:3824:5: (lv_timedConditionExpression_6_0= ruleDummyExprClass )
                    {
                    // InternalSML.g:3824:5: (lv_timedConditionExpression_6_0= ruleDummyExprClass )
                    // InternalSML.g:3825:6: lv_timedConditionExpression_6_0= ruleDummyExprClass
                    {

                    						newCompositeNode(grammarAccess.getTimedWaitConditionAccess().getTimedConditionExpressionDummyExprClassParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_timedConditionExpression_6_0=ruleDummyExprClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimedWaitConditionRule());
                    						}
                    						set(
                    							current,
                    							"timedConditionExpression",
                    							lv_timedConditionExpression_6_0,
                    							"org.prettyprinter.sml.SML.DummyExprClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTimedWaitConditionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTimedWaitCondition"


    // $ANTLR start "entryRuleClockFragment"
    // InternalSML.g:3851:1: entryRuleClockFragment returns [EObject current=null] : iv_ruleClockFragment= ruleClockFragment EOF ;
    public final EObject entryRuleClockFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClockFragment = null;


        try {
            // InternalSML.g:3851:54: (iv_ruleClockFragment= ruleClockFragment EOF )
            // InternalSML.g:3852:2: iv_ruleClockFragment= ruleClockFragment EOF
            {
             newCompositeNode(grammarAccess.getClockFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClockFragment=ruleClockFragment();

            state._fsp--;

             current =iv_ruleClockFragment; 
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
    // $ANTLR end "entryRuleClockFragment"


    // $ANTLR start "ruleClockFragment"
    // InternalSML.g:3858:1: ruleClockFragment returns [EObject current=null] : ( () otherlv_1= 'ClockFragment' otherlv_2= '{' (otherlv_3= 'expression' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleClockFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSML.g:3864:2: ( ( () otherlv_1= 'ClockFragment' otherlv_2= '{' (otherlv_3= 'expression' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:3865:2: ( () otherlv_1= 'ClockFragment' otherlv_2= '{' (otherlv_3= 'expression' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:3865:2: ( () otherlv_1= 'ClockFragment' otherlv_2= '{' (otherlv_3= 'expression' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalSML.g:3866:3: () otherlv_1= 'ClockFragment' otherlv_2= '{' (otherlv_3= 'expression' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:3866:3: ()
            // InternalSML.g:3867:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClockFragmentAccess().getClockFragmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,88,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getClockFragmentAccess().getClockFragmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_87); 

            			newLeafNode(otherlv_2, grammarAccess.getClockFragmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:3881:3: (otherlv_3= 'expression' ( ( ruleEString ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==83) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalSML.g:3882:4: otherlv_3= 'expression' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClockFragmentAccess().getExpressionKeyword_3_0());
                    			
                    // InternalSML.g:3886:4: ( ( ruleEString ) )
                    // InternalSML.g:3887:5: ( ruleEString )
                    {
                    // InternalSML.g:3887:5: ( ruleEString )
                    // InternalSML.g:3888:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClockFragmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClockFragmentAccess().getExpressionDummyExprClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClockFragmentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleClockFragment"


    // $ANTLR start "entryRuleRole"
    // InternalSML.g:3911:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSML.g:3911:45: (iv_ruleRole= ruleRole EOF )
            // InternalSML.g:3912:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSML.g:3918:1: ruleRole returns [EObject current=null] : ( () ( (lv_static_1_0= 'static' ) )? ( (lv_multiRole_2_0= 'multiRole' ) )? otherlv_3= 'Role' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_multiRole_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:3924:2: ( ( () ( (lv_static_1_0= 'static' ) )? ( (lv_multiRole_2_0= 'multiRole' ) )? otherlv_3= 'Role' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalSML.g:3925:2: ( () ( (lv_static_1_0= 'static' ) )? ( (lv_multiRole_2_0= 'multiRole' ) )? otherlv_3= 'Role' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalSML.g:3925:2: ( () ( (lv_static_1_0= 'static' ) )? ( (lv_multiRole_2_0= 'multiRole' ) )? otherlv_3= 'Role' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalSML.g:3926:3: () ( (lv_static_1_0= 'static' ) )? ( (lv_multiRole_2_0= 'multiRole' ) )? otherlv_3= 'Role' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalSML.g:3926:3: ()
            // InternalSML.g:3927:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            // InternalSML.g:3933:3: ( (lv_static_1_0= 'static' ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==89) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalSML.g:3934:4: (lv_static_1_0= 'static' )
                    {
                    // InternalSML.g:3934:4: (lv_static_1_0= 'static' )
                    // InternalSML.g:3935:5: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,89,FOLLOW_91); 

                    					newLeafNode(lv_static_1_0, grammarAccess.getRoleAccess().getStaticStaticKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRoleRule());
                    					}
                    					setWithLastConsumed(current, "static", lv_static_1_0 != null, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:3947:3: ( (lv_multiRole_2_0= 'multiRole' ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==90) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalSML.g:3948:4: (lv_multiRole_2_0= 'multiRole' )
                    {
                    // InternalSML.g:3948:4: (lv_multiRole_2_0= 'multiRole' )
                    // InternalSML.g:3949:5: lv_multiRole_2_0= 'multiRole'
                    {
                    lv_multiRole_2_0=(Token)match(input,90,FOLLOW_92); 

                    					newLeafNode(lv_multiRole_2_0, grammarAccess.getRoleAccess().getMultiRoleMultiRoleKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRoleRule());
                    					}
                    					setWithLastConsumed(current, "multiRole", lv_multiRole_2_0 != null, "multiRole");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getRoleKeyword_3());
            		
            // InternalSML.g:3965:3: ( (lv_name_4_0= ruleEString ) )
            // InternalSML.g:3966:4: (lv_name_4_0= ruleEString )
            {
            // InternalSML.g:3966:4: (lv_name_4_0= ruleEString )
            // InternalSML.g:3967:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSML.g:3988:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==92) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalSML.g:3989:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,92,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getTypeKeyword_6_0());
                    			
                    // InternalSML.g:3993:4: ( ( ruleEString ) )
                    // InternalSML.g:3994:5: ( ruleEString )
                    {
                    // InternalSML.g:3994:5: ( ruleEString )
                    // InternalSML.g:3995:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRoleAccess().getTypeEClassifierCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleParameterBinding"
    // InternalSML.g:4018:1: entryRuleParameterBinding returns [EObject current=null] : iv_ruleParameterBinding= ruleParameterBinding EOF ;
    public final EObject entryRuleParameterBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBinding = null;


        try {
            // InternalSML.g:4018:57: (iv_ruleParameterBinding= ruleParameterBinding EOF )
            // InternalSML.g:4019:2: iv_ruleParameterBinding= ruleParameterBinding EOF
            {
             newCompositeNode(grammarAccess.getParameterBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBinding=ruleParameterBinding();

            state._fsp--;

             current =iv_ruleParameterBinding; 
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
    // $ANTLR end "entryRuleParameterBinding"


    // $ANTLR start "ruleParameterBinding"
    // InternalSML.g:4025:1: ruleParameterBinding returns [EObject current=null] : ( () otherlv_1= 'ParameterBinding' otherlv_2= '{' (otherlv_3= 'bindingExpression' ( (lv_bindingExpression_4_0= ruleBindingExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_bindingExpression_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:4031:2: ( ( () otherlv_1= 'ParameterBinding' otherlv_2= '{' (otherlv_3= 'bindingExpression' ( (lv_bindingExpression_4_0= ruleBindingExpression ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:4032:2: ( () otherlv_1= 'ParameterBinding' otherlv_2= '{' (otherlv_3= 'bindingExpression' ( (lv_bindingExpression_4_0= ruleBindingExpression ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:4032:2: ( () otherlv_1= 'ParameterBinding' otherlv_2= '{' (otherlv_3= 'bindingExpression' ( (lv_bindingExpression_4_0= ruleBindingExpression ) ) )? otherlv_5= '}' )
            // InternalSML.g:4033:3: () otherlv_1= 'ParameterBinding' otherlv_2= '{' (otherlv_3= 'bindingExpression' ( (lv_bindingExpression_4_0= ruleBindingExpression ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:4033:3: ()
            // InternalSML.g:4034:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBindingAccess().getParameterBindingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBindingAccess().getParameterBindingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_94); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBindingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:4048:3: (otherlv_3= 'bindingExpression' ( (lv_bindingExpression_4_0= ruleBindingExpression ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==94) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalSML.g:4049:4: otherlv_3= 'bindingExpression' ( (lv_bindingExpression_4_0= ruleBindingExpression ) )
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_95); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBindingAccess().getBindingExpressionKeyword_3_0());
                    			
                    // InternalSML.g:4053:4: ( (lv_bindingExpression_4_0= ruleBindingExpression ) )
                    // InternalSML.g:4054:5: (lv_bindingExpression_4_0= ruleBindingExpression )
                    {
                    // InternalSML.g:4054:5: (lv_bindingExpression_4_0= ruleBindingExpression )
                    // InternalSML.g:4055:6: lv_bindingExpression_4_0= ruleBindingExpression
                    {

                    						newCompositeNode(grammarAccess.getParameterBindingAccess().getBindingExpressionBindingExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_bindingExpression_4_0=ruleBindingExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBindingRule());
                    						}
                    						set(
                    							current,
                    							"bindingExpression",
                    							lv_bindingExpression_4_0,
                    							"org.prettyprinter.sml.SML.BindingExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterBindingAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterBinding"


    // $ANTLR start "entryRuleDummyDatatype"
    // InternalSML.g:4081:1: entryRuleDummyDatatype returns [String current=null] : iv_ruleDummyDatatype= ruleDummyDatatype EOF ;
    public final String entryRuleDummyDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDummyDatatype = null;


        try {
            // InternalSML.g:4081:53: (iv_ruleDummyDatatype= ruleDummyDatatype EOF )
            // InternalSML.g:4082:2: iv_ruleDummyDatatype= ruleDummyDatatype EOF
            {
             newCompositeNode(grammarAccess.getDummyDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDummyDatatype=ruleDummyDatatype();

            state._fsp--;

             current =iv_ruleDummyDatatype.getText(); 
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
    // $ANTLR end "entryRuleDummyDatatype"


    // $ANTLR start "ruleDummyDatatype"
    // InternalSML.g:4088:1: ruleDummyDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DummyDatatype' ;
    public final AntlrDatatypeRuleToken ruleDummyDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSML.g:4094:2: (kw= 'DummyDatatype' )
            // InternalSML.g:4095:2: kw= 'DummyDatatype'
            {
            kw=(Token)match(input,95,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDummyDatatypeAccess().getDummyDatatypeKeyword());
            	

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
    // $ANTLR end "ruleDummyDatatype"


    // $ANTLR start "entryRuleEBoolean"
    // InternalSML.g:4103:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalSML.g:4103:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalSML.g:4104:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalSML.g:4110:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSML.g:4116:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSML.g:4117:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSML.g:4117:2: (kw= 'true' | kw= 'false' )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==96) ) {
                alt109=1;
            }
            else if ( (LA109_0==97) ) {
                alt109=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // InternalSML.g:4118:3: kw= 'true'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSML.g:4124:3: kw= 'false'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEAnnotation"
    // InternalSML.g:4133:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // InternalSML.g:4133:52: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // InternalSML.g:4134:2: iv_ruleEAnnotation= ruleEAnnotation EOF
            {
             newCompositeNode(grammarAccess.getEAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAnnotation=ruleEAnnotation();

            state._fsp--;

             current =iv_ruleEAnnotation; 
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
    // $ANTLR end "entryRuleEAnnotation"


    // $ANTLR start "ruleEAnnotation"
    // InternalSML.g:4140:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleEAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_source_4_0 = null;

        EObject lv_eAnnotations_13_0 = null;

        EObject lv_eAnnotations_15_0 = null;

        EObject lv_details_19_0 = null;

        EObject lv_details_21_0 = null;

        EObject lv_contents_25_0 = null;

        EObject lv_contents_27_0 = null;



        	enterRule();

        try {
            // InternalSML.g:4146:2: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalSML.g:4147:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalSML.g:4147:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalSML.g:4148:3: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // InternalSML.g:4148:3: ()
            // InternalSML.g:4149:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_96); 

            			newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:4163:3: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==99) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalSML.g:4164:4: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,99,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                    			
                    // InternalSML.g:4168:4: ( (lv_source_4_0= ruleEString ) )
                    // InternalSML.g:4169:5: (lv_source_4_0= ruleEString )
                    {
                    // InternalSML.g:4169:5: (lv_source_4_0= ruleEString )
                    // InternalSML.g:4170:6: lv_source_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_97);
                    lv_source_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						set(
                    							current,
                    							"source",
                    							lv_source_4_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:4188:3: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==100) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalSML.g:4189:4: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,100,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalSML.g:4197:4: ( ( ruleEString ) )
                    // InternalSML.g:4198:5: ( ruleEString )
                    {
                    // InternalSML.g:4198:5: ( ruleEString )
                    // InternalSML.g:4199:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAnnotationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:4213:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==15) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalSML.g:4214:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSML.g:4218:5: ( ( ruleEString ) )
                    	    // InternalSML.g:4219:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:4219:6: ( ruleEString )
                    	    // InternalSML.g:4220:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_98); 

                    				newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:4240:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==30) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalSML.g:4241:4: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSML.g:4249:4: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // InternalSML.g:4250:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // InternalSML.g:4250:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // InternalSML.g:4251:6: lv_eAnnotations_13_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eAnnotations_13_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_13_0,
                    							"org.prettyprinter.sml.SML.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:4268:4: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==15) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalSML.g:4269:5: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSML.g:4273:5: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // InternalSML.g:4274:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // InternalSML.g:4274:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // InternalSML.g:4275:7: lv_eAnnotations_15_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eAnnotations_15_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_15_0,
                    	    								"org.prettyprinter.sml.SML.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,22,FOLLOW_99); 

                    				newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:4298:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==101) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalSML.g:4299:4: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,101,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_100); 

                    				newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSML.g:4307:4: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // InternalSML.g:4308:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // InternalSML.g:4308:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // InternalSML.g:4309:6: lv_details_19_0= ruleEStringToStringMapEntry
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_details_19_0=ruleEStringToStringMapEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"details",
                    							lv_details_19_0,
                    							"org.prettyprinter.sml.SML.EStringToStringMapEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:4326:4: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==15) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalSML.g:4327:5: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_100); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSML.g:4331:5: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // InternalSML.g:4332:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // InternalSML.g:4332:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // InternalSML.g:4333:7: lv_details_21_0= ruleEStringToStringMapEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_details_21_0=ruleEStringToStringMapEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"details",
                    	    								lv_details_21_0,
                    	    								"org.prettyprinter.sml.SML.EStringToStringMapEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,22,FOLLOW_101); 

                    				newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:4356:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==102) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalSML.g:4357:4: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,102,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_102); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSML.g:4365:4: ( (lv_contents_25_0= ruleEObject ) )
                    // InternalSML.g:4366:5: (lv_contents_25_0= ruleEObject )
                    {
                    // InternalSML.g:4366:5: (lv_contents_25_0= ruleEObject )
                    // InternalSML.g:4367:6: lv_contents_25_0= ruleEObject
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_contents_25_0=ruleEObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"contents",
                    							lv_contents_25_0,
                    							"org.prettyprinter.sml.SML.EObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:4384:4: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==15) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // InternalSML.g:4385:5: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,15,FOLLOW_102); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSML.g:4389:5: ( (lv_contents_27_0= ruleEObject ) )
                    	    // InternalSML.g:4390:6: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // InternalSML.g:4390:6: (lv_contents_27_0= ruleEObject )
                    	    // InternalSML.g:4391:7: lv_contents_27_0= ruleEObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_contents_27_0=ruleEObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"contents",
                    	    								lv_contents_27_0,
                    	    								"org.prettyprinter.sml.SML.EObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEAnnotation"


    // $ANTLR start "entryRuleETypeParameter"
    // InternalSML.g:4422:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // InternalSML.g:4422:55: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // InternalSML.g:4423:2: iv_ruleETypeParameter= ruleETypeParameter EOF
            {
             newCompositeNode(grammarAccess.getETypeParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETypeParameter=ruleETypeParameter();

            state._fsp--;

             current =iv_ruleETypeParameter; 
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
    // $ANTLR end "entryRuleETypeParameter"


    // $ANTLR start "ruleETypeParameter"
    // InternalSML.g:4429:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleETypeParameter() throws RecognitionException {
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

        EObject lv_eAnnotations_6_0 = null;

        EObject lv_eAnnotations_8_0 = null;

        EObject lv_eBounds_12_0 = null;

        EObject lv_eBounds_14_0 = null;



        	enterRule();

        try {
            // InternalSML.g:4435:2: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalSML.g:4436:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalSML.g:4436:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalSML.g:4437:3: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalSML.g:4437:3: ()
            // InternalSML.g:4438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
            		
            // InternalSML.g:4448:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSML.g:4449:4: (lv_name_2_0= ruleEString )
            {
            // InternalSML.g:4449:4: (lv_name_2_0= ruleEString )
            // InternalSML.g:4450:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getETypeParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETypeParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_103); 

            			newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSML.g:4471:3: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==30) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalSML.g:4472:4: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSML.g:4480:4: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // InternalSML.g:4481:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // InternalSML.g:4481:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // InternalSML.g:4482:6: lv_eAnnotations_6_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eAnnotations_6_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_6_0,
                    							"org.prettyprinter.sml.SML.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:4499:4: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==15) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // InternalSML.g:4500:5: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSML.g:4504:5: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // InternalSML.g:4505:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // InternalSML.g:4505:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // InternalSML.g:4506:7: lv_eAnnotations_8_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eAnnotations_8_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_8_0,
                    	    								"org.prettyprinter.sml.SML.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_104); 

                    				newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:4529:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==104) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalSML.g:4530:4: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,104,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSML.g:4538:4: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // InternalSML.g:4539:5: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // InternalSML.g:4539:5: (lv_eBounds_12_0= ruleEGenericType )
                    // InternalSML.g:4540:6: lv_eBounds_12_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eBounds_12_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    						}
                    						add(
                    							current,
                    							"eBounds",
                    							lv_eBounds_12_0,
                    							"org.prettyprinter.sml.SML.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:4557:4: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==15) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalSML.g:4558:5: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSML.g:4562:5: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // InternalSML.g:4563:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // InternalSML.g:4563:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    // InternalSML.g:4564:7: lv_eBounds_14_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eBounds_14_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eBounds",
                    	    								lv_eBounds_14_0,
                    	    								"org.prettyprinter.sml.SML.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_15, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleETypeParameter"


    // $ANTLR start "entryRuleEDataType_Impl"
    // InternalSML.g:4595:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // InternalSML.g:4595:55: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // InternalSML.g:4596:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
            {
             newCompositeNode(grammarAccess.getEDataType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataType_Impl=ruleEDataType_Impl();

            state._fsp--;

             current =iv_ruleEDataType_Impl; 
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
    // $ANTLR end "entryRuleEDataType_Impl"


    // $ANTLR start "ruleEDataType_Impl"
    // InternalSML.g:4602:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eAnnotations_14_0 = null;

        EObject lv_eTypeParameters_18_0 = null;

        EObject lv_eTypeParameters_20_0 = null;



        	enterRule();

        try {
            // InternalSML.g:4608:2: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalSML.g:4609:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalSML.g:4609:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalSML.g:4610:3: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalSML.g:4610:3: ()
            // InternalSML.g:4611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
            		
            // InternalSML.g:4621:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSML.g:4622:4: (lv_name_2_0= ruleEString )
            {
            // InternalSML.g:4622:4: (lv_name_2_0= ruleEString )
            // InternalSML.g:4623:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEDataType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_105); 

            			newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSML.g:4644:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==36) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalSML.g:4645:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalSML.g:4649:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalSML.g:4650:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalSML.g:4650:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalSML.g:4651:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_106);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_5_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:4669:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==37) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalSML.g:4670:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalSML.g:4674:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalSML.g:4675:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalSML.g:4675:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalSML.g:4676:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_107);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_7_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:4694:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==106) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalSML.g:4695:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,106,FOLLOW_108); 

                    				newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                    			
                    // InternalSML.g:4699:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalSML.g:4700:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalSML.g:4700:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalSML.g:4701:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_109);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"serializable",
                    							lv_serializable_9_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:4719:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==30) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalSML.g:4720:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSML.g:4728:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalSML.g:4729:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalSML.g:4729:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalSML.g:4730:6: lv_eAnnotations_12_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eAnnotations_12_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_12_0,
                    							"org.prettyprinter.sml.SML.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:4747:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==15) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalSML.g:4748:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSML.g:4752:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalSML.g:4753:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalSML.g:4753:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalSML.g:4754:7: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eAnnotations_14_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_14_0,
                    	    								"org.prettyprinter.sml.SML.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_110); 

                    				newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:4777:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==39) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalSML.g:4778:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalSML.g:4786:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalSML.g:4787:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalSML.g:4787:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalSML.g:4788:6: lv_eTypeParameters_18_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eTypeParameters_18_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_18_0,
                    							"org.prettyprinter.sml.SML.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:4805:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==15) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalSML.g:4806:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_37); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSML.g:4810:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalSML.g:4811:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalSML.g:4811:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalSML.g:4812:7: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eTypeParameters_20_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_20_0,
                    	    								"org.prettyprinter.sml.SML.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_21, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleEDataType_Impl"


    // $ANTLR start "entryRuleEEnum"
    // InternalSML.g:4843:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // InternalSML.g:4843:46: (iv_ruleEEnum= ruleEEnum EOF )
            // InternalSML.g:4844:2: iv_ruleEEnum= ruleEEnum EOF
            {
             newCompositeNode(grammarAccess.getEEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEnum=ruleEEnum();

            state._fsp--;

             current =iv_ruleEEnum; 
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
    // $ANTLR end "entryRuleEEnum"


    // $ANTLR start "ruleEEnum"
    // InternalSML.g:4850:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleEEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eAnnotations_14_0 = null;

        EObject lv_eTypeParameters_18_0 = null;

        EObject lv_eTypeParameters_20_0 = null;

        EObject lv_eLiterals_24_0 = null;

        EObject lv_eLiterals_26_0 = null;



        	enterRule();

        try {
            // InternalSML.g:4856:2: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalSML.g:4857:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalSML.g:4857:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalSML.g:4858:3: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalSML.g:4858:3: ()
            // InternalSML.g:4859:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumAccess().getEEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,107,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
            		
            // InternalSML.g:4869:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSML.g:4870:4: (lv_name_2_0= ruleEString )
            {
            // InternalSML.g:4870:4: (lv_name_2_0= ruleEString )
            // InternalSML.g:4871:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEEnumAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEEnumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_111); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSML.g:4892:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==36) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalSML.g:4893:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalSML.g:4897:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalSML.g:4898:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalSML.g:4898:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalSML.g:4899:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_112);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_5_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:4917:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==37) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalSML.g:4918:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalSML.g:4922:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalSML.g:4923:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalSML.g:4923:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalSML.g:4924:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_113);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_7_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:4942:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==106) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalSML.g:4943:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,106,FOLLOW_108); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                    			
                    // InternalSML.g:4947:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalSML.g:4948:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalSML.g:4948:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalSML.g:4949:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_114);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"serializable",
                    							lv_serializable_9_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:4967:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==30) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalSML.g:4968:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSML.g:4976:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalSML.g:4977:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalSML.g:4977:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalSML.g:4978:6: lv_eAnnotations_12_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eAnnotations_12_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_12_0,
                    							"org.prettyprinter.sml.SML.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:4995:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==15) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalSML.g:4996:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSML.g:5000:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalSML.g:5001:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalSML.g:5001:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalSML.g:5002:7: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eAnnotations_14_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_14_0,
                    	    								"org.prettyprinter.sml.SML.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_115); 

                    				newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:5025:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==39) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalSML.g:5026:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalSML.g:5034:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalSML.g:5035:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalSML.g:5035:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalSML.g:5036:6: lv_eTypeParameters_18_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eTypeParameters_18_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_18_0,
                    							"org.prettyprinter.sml.SML.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:5053:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==15) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // InternalSML.g:5054:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_37); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSML.g:5058:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalSML.g:5059:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalSML.g:5059:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalSML.g:5060:7: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eTypeParameters_20_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_20_0,
                    	    								"org.prettyprinter.sml.SML.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,22,FOLLOW_116); 

                    				newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:5083:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==108) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalSML.g:5084:4: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,108,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalSML.g:5092:4: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // InternalSML.g:5093:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // InternalSML.g:5093:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // InternalSML.g:5094:6: lv_eLiterals_24_0= ruleEEnumLiteral
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eLiterals_24_0=ruleEEnumLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eLiterals",
                    							lv_eLiterals_24_0,
                    							"org.prettyprinter.sml.SML.EEnumLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:5111:4: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==15) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // InternalSML.g:5112:5: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,15,FOLLOW_117); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalSML.g:5116:5: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // InternalSML.g:5117:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // InternalSML.g:5117:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // InternalSML.g:5118:7: lv_eLiterals_26_0= ruleEEnumLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eLiterals_26_0=ruleEEnumLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eLiterals",
                    	    								lv_eLiterals_26_0,
                    	    								"org.prettyprinter.sml.SML.EEnumLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_27, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleEEnum"


    // $ANTLR start "entryRuleEStringToStringMapEntry"
    // InternalSML.g:5149:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // InternalSML.g:5149:64: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // InternalSML.g:5150:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEStringToStringMapEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEStringToStringMapEntry=ruleEStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleEStringToStringMapEntry; 
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
    // $ANTLR end "entryRuleEStringToStringMapEntry"


    // $ANTLR start "ruleEStringToStringMapEntry"
    // InternalSML.g:5156:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_key_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalSML.g:5162:2: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalSML.g:5163:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalSML.g:5163:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalSML.g:5164:3: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalSML.g:5164:3: ()
            // InternalSML.g:5165:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,109,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_118); 

            			newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:5179:3: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==110) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalSML.g:5180:4: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,110,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                    			
                    // InternalSML.g:5184:4: ( (lv_key_4_0= ruleEString ) )
                    // InternalSML.g:5185:5: (lv_key_4_0= ruleEString )
                    {
                    // InternalSML.g:5185:5: (lv_key_4_0= ruleEString )
                    // InternalSML.g:5186:6: lv_key_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_119);
                    lv_key_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_4_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:5204:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==111) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalSML.g:5205:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,111,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                    			
                    // InternalSML.g:5209:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalSML.g:5210:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalSML.g:5210:5: (lv_value_6_0= ruleEString )
                    // InternalSML.g:5211:6: lv_value_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_value_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEStringToStringMapEntryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEStringToStringMapEntry"


    // $ANTLR start "entryRuleEObject"
    // InternalSML.g:5237:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // InternalSML.g:5237:48: (iv_ruleEObject= ruleEObject EOF )
            // InternalSML.g:5238:2: iv_ruleEObject= ruleEObject EOF
            {
             newCompositeNode(grammarAccess.getEObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEObject=ruleEObject();

            state._fsp--;

             current =iv_ruleEObject; 
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
    // $ANTLR end "entryRuleEObject"


    // $ANTLR start "ruleEObject"
    // InternalSML.g:5244:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSML.g:5250:2: ( ( () otherlv_1= 'EObject' ) )
            // InternalSML.g:5251:2: ( () otherlv_1= 'EObject' )
            {
            // InternalSML.g:5251:2: ( () otherlv_1= 'EObject' )
            // InternalSML.g:5252:3: () otherlv_1= 'EObject'
            {
            // InternalSML.g:5252:3: ()
            // InternalSML.g:5253:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEObjectAccess().getEObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,112,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEObjectAccess().getEObjectKeyword_1());
            		

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
    // $ANTLR end "ruleEObject"


    // $ANTLR start "entryRuleEGenericType"
    // InternalSML.g:5267:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // InternalSML.g:5267:53: (iv_ruleEGenericType= ruleEGenericType EOF )
            // InternalSML.g:5268:2: iv_ruleEGenericType= ruleEGenericType EOF
            {
             newCompositeNode(grammarAccess.getEGenericTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEGenericType=ruleEGenericType();

            state._fsp--;

             current =iv_ruleEGenericType; 
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
    // $ANTLR end "entryRuleEGenericType"


    // $ANTLR start "ruleEGenericType"
    // InternalSML.g:5274:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleEGenericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_eUpperBound_8_0 = null;

        EObject lv_eTypeArguments_11_0 = null;

        EObject lv_eTypeArguments_13_0 = null;

        EObject lv_eLowerBound_16_0 = null;



        	enterRule();

        try {
            // InternalSML.g:5280:2: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // InternalSML.g:5281:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // InternalSML.g:5281:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // InternalSML.g:5282:3: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // InternalSML.g:5282:3: ()
            // InternalSML.g:5283:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,113,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_120); 

            			newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:5297:3: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==114) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalSML.g:5298:4: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,114,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                    			
                    // InternalSML.g:5302:4: ( ( ruleEString ) )
                    // InternalSML.g:5303:5: ( ruleEString )
                    {
                    // InternalSML.g:5303:5: ( ruleEString )
                    // InternalSML.g:5304:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_121);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:5319:3: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==115) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalSML.g:5320:4: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,115,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                    			
                    // InternalSML.g:5324:4: ( ( ruleEString ) )
                    // InternalSML.g:5325:5: ( ruleEString )
                    {
                    // InternalSML.g:5325:5: ( ruleEString )
                    // InternalSML.g:5326:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_122);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:5341:3: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==116) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalSML.g:5342:4: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,116,FOLLOW_43); 

                    				newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                    			
                    // InternalSML.g:5346:4: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // InternalSML.g:5347:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // InternalSML.g:5347:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    // InternalSML.g:5348:6: lv_eUpperBound_8_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_123);
                    lv_eUpperBound_8_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						set(
                    							current,
                    							"eUpperBound",
                    							lv_eUpperBound_8_0,
                    							"org.prettyprinter.sml.SML.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:5366:3: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==117) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalSML.g:5367:4: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,117,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSML.g:5375:4: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // InternalSML.g:5376:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // InternalSML.g:5376:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // InternalSML.g:5377:6: lv_eTypeArguments_11_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eTypeArguments_11_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						add(
                    							current,
                    							"eTypeArguments",
                    							lv_eTypeArguments_11_0,
                    							"org.prettyprinter.sml.SML.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:5394:4: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==15) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // InternalSML.g:5395:5: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSML.g:5399:5: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // InternalSML.g:5400:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // InternalSML.g:5400:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // InternalSML.g:5401:7: lv_eTypeArguments_13_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eTypeArguments_13_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeArguments",
                    	    								lv_eTypeArguments_13_0,
                    	    								"org.prettyprinter.sml.SML.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FOLLOW_124); 

                    				newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:5424:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==118) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalSML.g:5425:4: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,118,FOLLOW_43); 

                    				newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                    			
                    // InternalSML.g:5429:4: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // InternalSML.g:5430:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // InternalSML.g:5430:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    // InternalSML.g:5431:6: lv_eLowerBound_16_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getELowerBoundEGenericTypeParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_eLowerBound_16_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						set(
                    							current,
                    							"eLowerBound",
                    							lv_eLowerBound_16_0,
                    							"org.prettyprinter.sml.SML.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEGenericType"


    // $ANTLR start "entryRuleEEnumLiteral"
    // InternalSML.g:5457:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // InternalSML.g:5457:53: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // InternalSML.g:5458:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEnumLiteral=ruleEEnumLiteral();

            state._fsp--;

             current =iv_ruleEEnumLiteral; 
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
    // $ANTLR end "entryRuleEEnumLiteral"


    // $ANTLR start "ruleEEnumLiteral"
    // InternalSML.g:5464:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleEEnumLiteral() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_literal_7_0 = null;

        EObject lv_eAnnotations_10_0 = null;

        EObject lv_eAnnotations_12_0 = null;



        	enterRule();

        try {
            // InternalSML.g:5470:2: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalSML.g:5471:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalSML.g:5471:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalSML.g:5472:3: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalSML.g:5472:3: ()
            // InternalSML.g:5473:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,119,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
            		
            // InternalSML.g:5483:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSML.g:5484:4: (lv_name_2_0= ruleEString )
            {
            // InternalSML.g:5484:4: (lv_name_2_0= ruleEString )
            // InternalSML.g:5485:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEEnumLiteralAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_125); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSML.g:5506:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==111) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalSML.g:5507:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,111,FOLLOW_126); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                    			
                    // InternalSML.g:5511:4: ( (lv_value_5_0= ruleEInt ) )
                    // InternalSML.g:5512:5: (lv_value_5_0= ruleEInt )
                    {
                    // InternalSML.g:5512:5: (lv_value_5_0= ruleEInt )
                    // InternalSML.g:5513:6: lv_value_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_127);
                    lv_value_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:5531:3: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==120) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalSML.g:5532:4: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,120,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                    			
                    // InternalSML.g:5536:4: ( (lv_literal_7_0= ruleEString ) )
                    // InternalSML.g:5537:5: (lv_literal_7_0= ruleEString )
                    {
                    // InternalSML.g:5537:5: (lv_literal_7_0= ruleEString )
                    // InternalSML.g:5538:6: lv_literal_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_128);
                    lv_literal_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						set(
                    							current,
                    							"literal",
                    							lv_literal_7_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:5556:3: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==30) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalSML.g:5557:4: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSML.g:5565:4: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // InternalSML.g:5566:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // InternalSML.g:5566:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // InternalSML.g:5567:6: lv_eAnnotations_10_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eAnnotations_10_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_10_0,
                    							"org.prettyprinter.sml.SML.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:5584:4: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==15) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // InternalSML.g:5585:5: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSML.g:5589:5: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // InternalSML.g:5590:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // InternalSML.g:5590:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // InternalSML.g:5591:7: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eAnnotations_12_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_12_0,
                    	    								"org.prettyprinter.sml.SML.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_13, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEEnumLiteral"


    // $ANTLR start "entryRuleEInt"
    // InternalSML.g:5622:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSML.g:5622:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSML.g:5623:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSML.g:5629:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSML.g:5635:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSML.g:5636:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSML.g:5636:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSML.g:5637:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSML.g:5637:3: (kw= '-' )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==121) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalSML.g:5638:4: kw= '-'
                    {
                    kw=(Token)match(input,121,FOLLOW_129); 

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


    // $ANTLR start "entryRuleFeatureAccessBindingExpression"
    // InternalSML.g:5655:1: entryRuleFeatureAccessBindingExpression returns [EObject current=null] : iv_ruleFeatureAccessBindingExpression= ruleFeatureAccessBindingExpression EOF ;
    public final EObject entryRuleFeatureAccessBindingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureAccessBindingExpression = null;


        try {
            // InternalSML.g:5655:71: (iv_ruleFeatureAccessBindingExpression= ruleFeatureAccessBindingExpression EOF )
            // InternalSML.g:5656:2: iv_ruleFeatureAccessBindingExpression= ruleFeatureAccessBindingExpression EOF
            {
             newCompositeNode(grammarAccess.getFeatureAccessBindingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureAccessBindingExpression=ruleFeatureAccessBindingExpression();

            state._fsp--;

             current =iv_ruleFeatureAccessBindingExpression; 
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
    // $ANTLR end "entryRuleFeatureAccessBindingExpression"


    // $ANTLR start "ruleFeatureAccessBindingExpression"
    // InternalSML.g:5662:1: ruleFeatureAccessBindingExpression returns [EObject current=null] : ( () otherlv_1= 'FeatureAccessBindingExpression' otherlv_2= '{' (otherlv_3= 'featureaccess' ( (lv_featureaccess_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleFeatureAccessBindingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_featureaccess_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:5668:2: ( ( () otherlv_1= 'FeatureAccessBindingExpression' otherlv_2= '{' (otherlv_3= 'featureaccess' ( (lv_featureaccess_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:5669:2: ( () otherlv_1= 'FeatureAccessBindingExpression' otherlv_2= '{' (otherlv_3= 'featureaccess' ( (lv_featureaccess_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:5669:2: ( () otherlv_1= 'FeatureAccessBindingExpression' otherlv_2= '{' (otherlv_3= 'featureaccess' ( (lv_featureaccess_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            // InternalSML.g:5670:3: () otherlv_1= 'FeatureAccessBindingExpression' otherlv_2= '{' (otherlv_3= 'featureaccess' ( (lv_featureaccess_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:5670:3: ()
            // InternalSML.g:5671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureAccessBindingExpressionAccess().getFeatureAccessBindingExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,122,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccessBindingExpressionAccess().getFeatureAccessBindingExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_130); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccessBindingExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:5685:3: (otherlv_3= 'featureaccess' ( (lv_featureaccess_4_0= ruleDummyExprClass ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==123) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalSML.g:5686:4: otherlv_3= 'featureaccess' ( (lv_featureaccess_4_0= ruleDummyExprClass ) )
                    {
                    otherlv_3=(Token)match(input,123,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getFeatureAccessBindingExpressionAccess().getFeatureaccessKeyword_3_0());
                    			
                    // InternalSML.g:5690:4: ( (lv_featureaccess_4_0= ruleDummyExprClass ) )
                    // InternalSML.g:5691:5: (lv_featureaccess_4_0= ruleDummyExprClass )
                    {
                    // InternalSML.g:5691:5: (lv_featureaccess_4_0= ruleDummyExprClass )
                    // InternalSML.g:5692:6: lv_featureaccess_4_0= ruleDummyExprClass
                    {

                    						newCompositeNode(grammarAccess.getFeatureAccessBindingExpressionAccess().getFeatureaccessDummyExprClassParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_featureaccess_4_0=ruleDummyExprClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureAccessBindingExpressionRule());
                    						}
                    						set(
                    							current,
                    							"featureaccess",
                    							lv_featureaccess_4_0,
                    							"org.prettyprinter.sml.SML.DummyExprClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFeatureAccessBindingExpressionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleFeatureAccessBindingExpression"


    // $ANTLR start "entryRuleObjectQueryBindingExpression"
    // InternalSML.g:5718:1: entryRuleObjectQueryBindingExpression returns [EObject current=null] : iv_ruleObjectQueryBindingExpression= ruleObjectQueryBindingExpression EOF ;
    public final EObject entryRuleObjectQueryBindingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectQueryBindingExpression = null;


        try {
            // InternalSML.g:5718:69: (iv_ruleObjectQueryBindingExpression= ruleObjectQueryBindingExpression EOF )
            // InternalSML.g:5719:2: iv_ruleObjectQueryBindingExpression= ruleObjectQueryBindingExpression EOF
            {
             newCompositeNode(grammarAccess.getObjectQueryBindingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectQueryBindingExpression=ruleObjectQueryBindingExpression();

            state._fsp--;

             current =iv_ruleObjectQueryBindingExpression; 
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
    // $ANTLR end "entryRuleObjectQueryBindingExpression"


    // $ANTLR start "ruleObjectQueryBindingExpression"
    // InternalSML.g:5725:1: ruleObjectQueryBindingExpression returns [EObject current=null] : ( () otherlv_1= 'ObjectQueryBindingExpression' otherlv_2= '{' (otherlv_3= 'queryClass' ( ( ruleEString ) ) )? (otherlv_5= 'queryValues' otherlv_6= '{' ( (lv_queryValues_7_0= ruleObjectQueryValue ) ) (otherlv_8= ',' ( (lv_queryValues_9_0= ruleObjectQueryValue ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleObjectQueryBindingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_queryValues_7_0 = null;

        EObject lv_queryValues_9_0 = null;



        	enterRule();

        try {
            // InternalSML.g:5731:2: ( ( () otherlv_1= 'ObjectQueryBindingExpression' otherlv_2= '{' (otherlv_3= 'queryClass' ( ( ruleEString ) ) )? (otherlv_5= 'queryValues' otherlv_6= '{' ( (lv_queryValues_7_0= ruleObjectQueryValue ) ) (otherlv_8= ',' ( (lv_queryValues_9_0= ruleObjectQueryValue ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalSML.g:5732:2: ( () otherlv_1= 'ObjectQueryBindingExpression' otherlv_2= '{' (otherlv_3= 'queryClass' ( ( ruleEString ) ) )? (otherlv_5= 'queryValues' otherlv_6= '{' ( (lv_queryValues_7_0= ruleObjectQueryValue ) ) (otherlv_8= ',' ( (lv_queryValues_9_0= ruleObjectQueryValue ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalSML.g:5732:2: ( () otherlv_1= 'ObjectQueryBindingExpression' otherlv_2= '{' (otherlv_3= 'queryClass' ( ( ruleEString ) ) )? (otherlv_5= 'queryValues' otherlv_6= '{' ( (lv_queryValues_7_0= ruleObjectQueryValue ) ) (otherlv_8= ',' ( (lv_queryValues_9_0= ruleObjectQueryValue ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalSML.g:5733:3: () otherlv_1= 'ObjectQueryBindingExpression' otherlv_2= '{' (otherlv_3= 'queryClass' ( ( ruleEString ) ) )? (otherlv_5= 'queryValues' otherlv_6= '{' ( (lv_queryValues_7_0= ruleObjectQueryValue ) ) (otherlv_8= ',' ( (lv_queryValues_9_0= ruleObjectQueryValue ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalSML.g:5733:3: ()
            // InternalSML.g:5734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectQueryBindingExpressionAccess().getObjectQueryBindingExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,124,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectQueryBindingExpressionAccess().getObjectQueryBindingExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_131); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectQueryBindingExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:5748:3: (otherlv_3= 'queryClass' ( ( ruleEString ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==125) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalSML.g:5749:4: otherlv_3= 'queryClass' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,125,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectQueryBindingExpressionAccess().getQueryClassKeyword_3_0());
                    			
                    // InternalSML.g:5753:4: ( ( ruleEString ) )
                    // InternalSML.g:5754:5: ( ruleEString )
                    {
                    // InternalSML.g:5754:5: ( ruleEString )
                    // InternalSML.g:5755:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectQueryBindingExpressionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getObjectQueryBindingExpressionAccess().getQueryClassEClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_132);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:5770:3: (otherlv_5= 'queryValues' otherlv_6= '{' ( (lv_queryValues_7_0= ruleObjectQueryValue ) ) (otherlv_8= ',' ( (lv_queryValues_9_0= ruleObjectQueryValue ) ) )* otherlv_10= '}' )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==126) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalSML.g:5771:4: otherlv_5= 'queryValues' otherlv_6= '{' ( (lv_queryValues_7_0= ruleObjectQueryValue ) ) (otherlv_8= ',' ( (lv_queryValues_9_0= ruleObjectQueryValue ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,126,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getObjectQueryBindingExpressionAccess().getQueryValuesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_133); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjectQueryBindingExpressionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSML.g:5779:4: ( (lv_queryValues_7_0= ruleObjectQueryValue ) )
                    // InternalSML.g:5780:5: (lv_queryValues_7_0= ruleObjectQueryValue )
                    {
                    // InternalSML.g:5780:5: (lv_queryValues_7_0= ruleObjectQueryValue )
                    // InternalSML.g:5781:6: lv_queryValues_7_0= ruleObjectQueryValue
                    {

                    						newCompositeNode(grammarAccess.getObjectQueryBindingExpressionAccess().getQueryValuesObjectQueryValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_queryValues_7_0=ruleObjectQueryValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectQueryBindingExpressionRule());
                    						}
                    						add(
                    							current,
                    							"queryValues",
                    							lv_queryValues_7_0,
                    							"org.prettyprinter.sml.SML.ObjectQueryValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:5798:4: (otherlv_8= ',' ( (lv_queryValues_9_0= ruleObjectQueryValue ) ) )*
                    loop154:
                    do {
                        int alt154=2;
                        int LA154_0 = input.LA(1);

                        if ( (LA154_0==15) ) {
                            alt154=1;
                        }


                        switch (alt154) {
                    	case 1 :
                    	    // InternalSML.g:5799:5: otherlv_8= ',' ( (lv_queryValues_9_0= ruleObjectQueryValue ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_133); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getObjectQueryBindingExpressionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSML.g:5803:5: ( (lv_queryValues_9_0= ruleObjectQueryValue ) )
                    	    // InternalSML.g:5804:6: (lv_queryValues_9_0= ruleObjectQueryValue )
                    	    {
                    	    // InternalSML.g:5804:6: (lv_queryValues_9_0= ruleObjectQueryValue )
                    	    // InternalSML.g:5805:7: lv_queryValues_9_0= ruleObjectQueryValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectQueryBindingExpressionAccess().getQueryValuesObjectQueryValueParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_queryValues_9_0=ruleObjectQueryValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectQueryBindingExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"queryValues",
                    	    								lv_queryValues_9_0,
                    	    								"org.prettyprinter.sml.SML.ObjectQueryValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop154;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getObjectQueryBindingExpressionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getObjectQueryBindingExpressionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleObjectQueryBindingExpression"


    // $ANTLR start "entryRuleParameterExpression_Impl"
    // InternalSML.g:5836:1: entryRuleParameterExpression_Impl returns [EObject current=null] : iv_ruleParameterExpression_Impl= ruleParameterExpression_Impl EOF ;
    public final EObject entryRuleParameterExpression_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression_Impl = null;


        try {
            // InternalSML.g:5836:65: (iv_ruleParameterExpression_Impl= ruleParameterExpression_Impl EOF )
            // InternalSML.g:5837:2: iv_ruleParameterExpression_Impl= ruleParameterExpression_Impl EOF
            {
             newCompositeNode(grammarAccess.getParameterExpression_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterExpression_Impl=ruleParameterExpression_Impl();

            state._fsp--;

             current =iv_ruleParameterExpression_Impl; 
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
    // $ANTLR end "entryRuleParameterExpression_Impl"


    // $ANTLR start "ruleParameterExpression_Impl"
    // InternalSML.g:5843:1: ruleParameterExpression_Impl returns [EObject current=null] : ( () otherlv_1= 'ParameterExpression' ) ;
    public final EObject ruleParameterExpression_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSML.g:5849:2: ( ( () otherlv_1= 'ParameterExpression' ) )
            // InternalSML.g:5850:2: ( () otherlv_1= 'ParameterExpression' )
            {
            // InternalSML.g:5850:2: ( () otherlv_1= 'ParameterExpression' )
            // InternalSML.g:5851:3: () otherlv_1= 'ParameterExpression'
            {
            // InternalSML.g:5851:3: ()
            // InternalSML.g:5852:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterExpression_ImplAccess().getParameterExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,127,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterExpression_ImplAccess().getParameterExpressionKeyword_1());
            		

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
    // $ANTLR end "ruleParameterExpression_Impl"


    // $ANTLR start "entryRuleWildcardParameterExpression"
    // InternalSML.g:5866:1: entryRuleWildcardParameterExpression returns [EObject current=null] : iv_ruleWildcardParameterExpression= ruleWildcardParameterExpression EOF ;
    public final EObject entryRuleWildcardParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardParameterExpression = null;


        try {
            // InternalSML.g:5866:68: (iv_ruleWildcardParameterExpression= ruleWildcardParameterExpression EOF )
            // InternalSML.g:5867:2: iv_ruleWildcardParameterExpression= ruleWildcardParameterExpression EOF
            {
             newCompositeNode(grammarAccess.getWildcardParameterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWildcardParameterExpression=ruleWildcardParameterExpression();

            state._fsp--;

             current =iv_ruleWildcardParameterExpression; 
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
    // $ANTLR end "entryRuleWildcardParameterExpression"


    // $ANTLR start "ruleWildcardParameterExpression"
    // InternalSML.g:5873:1: ruleWildcardParameterExpression returns [EObject current=null] : ( () otherlv_1= 'WildcardParameterExpression' ) ;
    public final EObject ruleWildcardParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSML.g:5879:2: ( ( () otherlv_1= 'WildcardParameterExpression' ) )
            // InternalSML.g:5880:2: ( () otherlv_1= 'WildcardParameterExpression' )
            {
            // InternalSML.g:5880:2: ( () otherlv_1= 'WildcardParameterExpression' )
            // InternalSML.g:5881:3: () otherlv_1= 'WildcardParameterExpression'
            {
            // InternalSML.g:5881:3: ()
            // InternalSML.g:5882:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWildcardParameterExpressionAccess().getWildcardParameterExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,128,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getWildcardParameterExpressionAccess().getWildcardParameterExpressionKeyword_1());
            		

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
    // $ANTLR end "ruleWildcardParameterExpression"


    // $ANTLR start "entryRuleValueParameterExpression"
    // InternalSML.g:5896:1: entryRuleValueParameterExpression returns [EObject current=null] : iv_ruleValueParameterExpression= ruleValueParameterExpression EOF ;
    public final EObject entryRuleValueParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueParameterExpression = null;


        try {
            // InternalSML.g:5896:65: (iv_ruleValueParameterExpression= ruleValueParameterExpression EOF )
            // InternalSML.g:5897:2: iv_ruleValueParameterExpression= ruleValueParameterExpression EOF
            {
             newCompositeNode(grammarAccess.getValueParameterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueParameterExpression=ruleValueParameterExpression();

            state._fsp--;

             current =iv_ruleValueParameterExpression; 
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
    // $ANTLR end "entryRuleValueParameterExpression"


    // $ANTLR start "ruleValueParameterExpression"
    // InternalSML.g:5903:1: ruleValueParameterExpression returns [EObject current=null] : ( () otherlv_1= 'ValueParameterExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleValueParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:5909:2: ( ( () otherlv_1= 'ValueParameterExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:5910:2: ( () otherlv_1= 'ValueParameterExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:5910:2: ( () otherlv_1= 'ValueParameterExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            // InternalSML.g:5911:3: () otherlv_1= 'ValueParameterExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:5911:3: ()
            // InternalSML.g:5912:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueParameterExpressionAccess().getValueParameterExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,129,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getValueParameterExpressionAccess().getValueParameterExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_119); 

            			newLeafNode(otherlv_2, grammarAccess.getValueParameterExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:5926:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleDummyExprClass ) ) )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==111) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalSML.g:5927:4: otherlv_3= 'value' ( (lv_value_4_0= ruleDummyExprClass ) )
                    {
                    otherlv_3=(Token)match(input,111,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getValueParameterExpressionAccess().getValueKeyword_3_0());
                    			
                    // InternalSML.g:5931:4: ( (lv_value_4_0= ruleDummyExprClass ) )
                    // InternalSML.g:5932:5: (lv_value_4_0= ruleDummyExprClass )
                    {
                    // InternalSML.g:5932:5: (lv_value_4_0= ruleDummyExprClass )
                    // InternalSML.g:5933:6: lv_value_4_0= ruleDummyExprClass
                    {

                    						newCompositeNode(grammarAccess.getValueParameterExpressionAccess().getValueDummyExprClassParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_value_4_0=ruleDummyExprClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueParameterExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.prettyprinter.sml.SML.DummyExprClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getValueParameterExpressionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleValueParameterExpression"


    // $ANTLR start "entryRuleVariableBindingParameterExpression"
    // InternalSML.g:5959:1: entryRuleVariableBindingParameterExpression returns [EObject current=null] : iv_ruleVariableBindingParameterExpression= ruleVariableBindingParameterExpression EOF ;
    public final EObject entryRuleVariableBindingParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBindingParameterExpression = null;


        try {
            // InternalSML.g:5959:75: (iv_ruleVariableBindingParameterExpression= ruleVariableBindingParameterExpression EOF )
            // InternalSML.g:5960:2: iv_ruleVariableBindingParameterExpression= ruleVariableBindingParameterExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableBindingParameterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableBindingParameterExpression=ruleVariableBindingParameterExpression();

            state._fsp--;

             current =iv_ruleVariableBindingParameterExpression; 
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
    // $ANTLR end "entryRuleVariableBindingParameterExpression"


    // $ANTLR start "ruleVariableBindingParameterExpression"
    // InternalSML.g:5966:1: ruleVariableBindingParameterExpression returns [EObject current=null] : ( () otherlv_1= 'VariableBindingParameterExpression' otherlv_2= '{' (otherlv_3= 'variable' ( (lv_variable_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleVariableBindingParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variable_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:5972:2: ( ( () otherlv_1= 'VariableBindingParameterExpression' otherlv_2= '{' (otherlv_3= 'variable' ( (lv_variable_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:5973:2: ( () otherlv_1= 'VariableBindingParameterExpression' otherlv_2= '{' (otherlv_3= 'variable' ( (lv_variable_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:5973:2: ( () otherlv_1= 'VariableBindingParameterExpression' otherlv_2= '{' (otherlv_3= 'variable' ( (lv_variable_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            // InternalSML.g:5974:3: () otherlv_1= 'VariableBindingParameterExpression' otherlv_2= '{' (otherlv_3= 'variable' ( (lv_variable_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:5974:3: ()
            // InternalSML.g:5975:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableBindingParameterExpressionAccess().getVariableBindingParameterExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,130,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableBindingParameterExpressionAccess().getVariableBindingParameterExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_134); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableBindingParameterExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:5989:3: (otherlv_3= 'variable' ( (lv_variable_4_0= ruleDummyExprClass ) ) )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==131) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalSML.g:5990:4: otherlv_3= 'variable' ( (lv_variable_4_0= ruleDummyExprClass ) )
                    {
                    otherlv_3=(Token)match(input,131,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableBindingParameterExpressionAccess().getVariableKeyword_3_0());
                    			
                    // InternalSML.g:5994:4: ( (lv_variable_4_0= ruleDummyExprClass ) )
                    // InternalSML.g:5995:5: (lv_variable_4_0= ruleDummyExprClass )
                    {
                    // InternalSML.g:5995:5: (lv_variable_4_0= ruleDummyExprClass )
                    // InternalSML.g:5996:6: lv_variable_4_0= ruleDummyExprClass
                    {

                    						newCompositeNode(grammarAccess.getVariableBindingParameterExpressionAccess().getVariableDummyExprClassParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_variable_4_0=ruleDummyExprClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableBindingParameterExpressionRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_4_0,
                    							"org.prettyprinter.sml.SML.DummyExprClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableBindingParameterExpressionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleVariableBindingParameterExpression"


    // $ANTLR start "entryRuleObjectQueryValue"
    // InternalSML.g:6022:1: entryRuleObjectQueryValue returns [EObject current=null] : iv_ruleObjectQueryValue= ruleObjectQueryValue EOF ;
    public final EObject entryRuleObjectQueryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectQueryValue = null;


        try {
            // InternalSML.g:6022:57: (iv_ruleObjectQueryValue= ruleObjectQueryValue EOF )
            // InternalSML.g:6023:2: iv_ruleObjectQueryValue= ruleObjectQueryValue EOF
            {
             newCompositeNode(grammarAccess.getObjectQueryValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectQueryValue=ruleObjectQueryValue();

            state._fsp--;

             current =iv_ruleObjectQueryValue; 
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
    // $ANTLR end "entryRuleObjectQueryValue"


    // $ANTLR start "ruleObjectQueryValue"
    // InternalSML.g:6029:1: ruleObjectQueryValue returns [EObject current=null] : ( () otherlv_1= 'ObjectQueryValue' otherlv_2= '{' (otherlv_3= 'feature' ( ( ruleEString ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleDummyExprClass ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleObjectQueryValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalSML.g:6035:2: ( ( () otherlv_1= 'ObjectQueryValue' otherlv_2= '{' (otherlv_3= 'feature' ( ( ruleEString ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleDummyExprClass ) ) )? otherlv_7= '}' ) )
            // InternalSML.g:6036:2: ( () otherlv_1= 'ObjectQueryValue' otherlv_2= '{' (otherlv_3= 'feature' ( ( ruleEString ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleDummyExprClass ) ) )? otherlv_7= '}' )
            {
            // InternalSML.g:6036:2: ( () otherlv_1= 'ObjectQueryValue' otherlv_2= '{' (otherlv_3= 'feature' ( ( ruleEString ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleDummyExprClass ) ) )? otherlv_7= '}' )
            // InternalSML.g:6037:3: () otherlv_1= 'ObjectQueryValue' otherlv_2= '{' (otherlv_3= 'feature' ( ( ruleEString ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleDummyExprClass ) ) )? otherlv_7= '}'
            {
            // InternalSML.g:6037:3: ()
            // InternalSML.g:6038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectQueryValueAccess().getObjectQueryValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,132,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectQueryValueAccess().getObjectQueryValueKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_135); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectQueryValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:6052:3: (otherlv_3= 'feature' ( ( ruleEString ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==133) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalSML.g:6053:4: otherlv_3= 'feature' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,133,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectQueryValueAccess().getFeatureKeyword_3_0());
                    			
                    // InternalSML.g:6057:4: ( ( ruleEString ) )
                    // InternalSML.g:6058:5: ( ruleEString )
                    {
                    // InternalSML.g:6058:5: ( ruleEString )
                    // InternalSML.g:6059:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectQueryValueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getObjectQueryValueAccess().getFeatureEStructuralFeatureCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_87);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6074:3: (otherlv_5= 'expression' ( (lv_expression_6_0= ruleDummyExprClass ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==83) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalSML.g:6075:4: otherlv_5= 'expression' ( (lv_expression_6_0= ruleDummyExprClass ) )
                    {
                    otherlv_5=(Token)match(input,83,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getObjectQueryValueAccess().getExpressionKeyword_4_0());
                    			
                    // InternalSML.g:6079:4: ( (lv_expression_6_0= ruleDummyExprClass ) )
                    // InternalSML.g:6080:5: (lv_expression_6_0= ruleDummyExprClass )
                    {
                    // InternalSML.g:6080:5: (lv_expression_6_0= ruleDummyExprClass )
                    // InternalSML.g:6081:6: lv_expression_6_0= ruleDummyExprClass
                    {

                    						newCompositeNode(grammarAccess.getObjectQueryValueAccess().getExpressionDummyExprClassParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_expression_6_0=ruleDummyExprClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectQueryValueRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"org.prettyprinter.sml.SML.DummyExprClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getObjectQueryValueAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleObjectQueryValue"


    // $ANTLR start "entryRuleEAttribute"
    // InternalSML.g:6107:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // InternalSML.g:6107:51: (iv_ruleEAttribute= ruleEAttribute EOF )
            // InternalSML.g:6108:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
             newCompositeNode(grammarAccess.getEAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;

             current =iv_ruleEAttribute; 
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
    // $ANTLR end "entryRuleEAttribute"


    // $ANTLR start "ruleEAttribute"
    // InternalSML.g:6114:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
    public final EObject ruleEAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_volatile_1_0=null;
        Token lv_transient_2_0=null;
        Token lv_unsettable_3_0=null;
        Token lv_derived_4_0=null;
        Token lv_iD_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_ordered_10_0 = null;

        AntlrDatatypeRuleToken lv_unique_12_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_16_0 = null;

        AntlrDatatypeRuleToken lv_changeable_18_0 = null;

        AntlrDatatypeRuleToken lv_defaultValueLiteral_20_0 = null;

        EObject lv_eAnnotations_25_0 = null;

        EObject lv_eAnnotations_27_0 = null;

        EObject lv_eGenericType_30_0 = null;



        	enterRule();

        try {
            // InternalSML.g:6120:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // InternalSML.g:6121:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // InternalSML.g:6121:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // InternalSML.g:6122:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // InternalSML.g:6122:3: ()
            // InternalSML.g:6123:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
            					current);
            			

            }

            // InternalSML.g:6129:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==134) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalSML.g:6130:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalSML.g:6130:4: (lv_volatile_1_0= 'volatile' )
                    // InternalSML.g:6131:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,134,FOLLOW_136); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "volatile", lv_volatile_1_0 != null, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:6143:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==135) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalSML.g:6144:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalSML.g:6144:4: (lv_transient_2_0= 'transient' )
                    // InternalSML.g:6145:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,135,FOLLOW_137); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "transient", lv_transient_2_0 != null, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:6157:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==136) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalSML.g:6158:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalSML.g:6158:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalSML.g:6159:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,136,FOLLOW_138); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", lv_unsettable_3_0 != null, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:6171:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==137) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalSML.g:6172:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalSML.g:6172:4: (lv_derived_4_0= 'derived' )
                    // InternalSML.g:6173:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,137,FOLLOW_139); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "derived", lv_derived_4_0 != null, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:6185:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==138) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalSML.g:6186:4: (lv_iD_5_0= 'iD' )
                    {
                    // InternalSML.g:6186:4: (lv_iD_5_0= 'iD' )
                    // InternalSML.g:6187:5: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,138,FOLLOW_140); 

                    					newLeafNode(lv_iD_5_0, grammarAccess.getEAttributeAccess().getIDIDKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "iD", lv_iD_5_0 != null, "iD");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,139,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getEAttributeKeyword_6());
            		
            // InternalSML.g:6203:3: ( (lv_name_7_0= ruleEString ) )
            // InternalSML.g:6204:4: (lv_name_7_0= ruleEString )
            {
            // InternalSML.g:6204:4: (lv_name_7_0= ruleEString )
            // InternalSML.g:6205:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEAttributeAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_141); 

            			newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSML.g:6226:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==140) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // InternalSML.g:6227:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,140,FOLLOW_108); 

                    				newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                    			
                    // InternalSML.g:6231:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalSML.g:6232:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalSML.g:6232:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalSML.g:6233:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_142);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_10_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6251:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==141) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalSML.g:6252:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,141,FOLLOW_108); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                    			
                    // InternalSML.g:6256:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalSML.g:6257:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalSML.g:6257:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalSML.g:6258:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_143);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_12_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6276:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==142) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalSML.g:6277:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,142,FOLLOW_126); 

                    				newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalSML.g:6281:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalSML.g:6282:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalSML.g:6282:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalSML.g:6283:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_144);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_14_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6301:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==143) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalSML.g:6302:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,143,FOLLOW_126); 

                    				newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalSML.g:6306:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalSML.g:6307:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalSML.g:6307:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalSML.g:6308:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_145);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_16_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6326:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==144) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // InternalSML.g:6327:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,144,FOLLOW_108); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                    			
                    // InternalSML.g:6331:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalSML.g:6332:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalSML.g:6332:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalSML.g:6333:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_146);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"changeable",
                    							lv_changeable_18_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6351:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==145) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // InternalSML.g:6352:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,145,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalSML.g:6356:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalSML.g:6357:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalSML.g:6357:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalSML.g:6358:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_147);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"defaultValueLiteral",
                    							lv_defaultValueLiteral_20_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6376:3: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==146) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // InternalSML.g:6377:4: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,146,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                    			
                    // InternalSML.g:6381:4: ( ( ruleEString ) )
                    // InternalSML.g:6382:5: ( ruleEString )
                    {
                    // InternalSML.g:6382:5: ( ruleEString )
                    // InternalSML.g:6383:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0());
                    					
                    pushFollow(FOLLOW_148);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6398:3: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==30) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalSML.g:6399:4: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalSML.g:6407:4: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // InternalSML.g:6408:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // InternalSML.g:6408:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // InternalSML.g:6409:6: lv_eAnnotations_25_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eAnnotations_25_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_25_0,
                    							"org.prettyprinter.sml.SML.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:6426:4: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop172:
                    do {
                        int alt172=2;
                        int LA172_0 = input.LA(1);

                        if ( (LA172_0==15) ) {
                            alt172=1;
                        }


                        switch (alt172) {
                    	case 1 :
                    	    // InternalSML.g:6427:5: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalSML.g:6431:5: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // InternalSML.g:6432:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // InternalSML.g:6432:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // InternalSML.g:6433:7: lv_eAnnotations_27_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eAnnotations_27_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_27_0,
                    	    								"org.prettyprinter.sml.SML.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop172;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,22,FOLLOW_149); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:6456:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==147) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // InternalSML.g:6457:4: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,147,FOLLOW_43); 

                    				newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                    			
                    // InternalSML.g:6461:4: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // InternalSML.g:6462:5: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // InternalSML.g:6462:5: (lv_eGenericType_30_0= ruleEGenericType )
                    // InternalSML.g:6463:6: lv_eGenericType_30_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getEGenericTypeEGenericTypeParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_eGenericType_30_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_30_0,
                    							"org.prettyprinter.sml.SML.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleEAttribute"


    // $ANTLR start "entryRuleEReference"
    // InternalSML.g:6489:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // InternalSML.g:6489:51: (iv_ruleEReference= ruleEReference EOF )
            // InternalSML.g:6490:2: iv_ruleEReference= ruleEReference EOF
            {
             newCompositeNode(grammarAccess.getEReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEReference=ruleEReference();

            state._fsp--;

             current =iv_ruleEReference; 
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
    // $ANTLR end "entryRuleEReference"


    // $ANTLR start "ruleEReference"
    // InternalSML.g:6496:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
    public final EObject ruleEReference() throws RecognitionException {
        EObject current = null;

        Token lv_volatile_1_0=null;
        Token lv_transient_2_0=null;
        Token lv_unsettable_3_0=null;
        Token lv_derived_4_0=null;
        Token lv_containment_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_ordered_10_0 = null;

        AntlrDatatypeRuleToken lv_unique_12_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_16_0 = null;

        AntlrDatatypeRuleToken lv_changeable_18_0 = null;

        AntlrDatatypeRuleToken lv_defaultValueLiteral_20_0 = null;

        AntlrDatatypeRuleToken lv_resolveProxies_22_0 = null;

        EObject lv_eAnnotations_35_0 = null;

        EObject lv_eAnnotations_37_0 = null;

        EObject lv_eGenericType_40_0 = null;



        	enterRule();

        try {
            // InternalSML.g:6502:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // InternalSML.g:6503:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // InternalSML.g:6503:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // InternalSML.g:6504:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // InternalSML.g:6504:3: ()
            // InternalSML.g:6505:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
            					current);
            			

            }

            // InternalSML.g:6511:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==134) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // InternalSML.g:6512:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalSML.g:6512:4: (lv_volatile_1_0= 'volatile' )
                    // InternalSML.g:6513:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,134,FOLLOW_150); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "volatile", lv_volatile_1_0 != null, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:6525:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==135) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // InternalSML.g:6526:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalSML.g:6526:4: (lv_transient_2_0= 'transient' )
                    // InternalSML.g:6527:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,135,FOLLOW_151); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "transient", lv_transient_2_0 != null, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:6539:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==136) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // InternalSML.g:6540:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalSML.g:6540:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalSML.g:6541:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,136,FOLLOW_152); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", lv_unsettable_3_0 != null, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:6553:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==137) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // InternalSML.g:6554:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalSML.g:6554:4: (lv_derived_4_0= 'derived' )
                    // InternalSML.g:6555:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,137,FOLLOW_153); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "derived", lv_derived_4_0 != null, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:6567:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==148) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // InternalSML.g:6568:4: (lv_containment_5_0= 'containment' )
                    {
                    // InternalSML.g:6568:4: (lv_containment_5_0= 'containment' )
                    // InternalSML.g:6569:5: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,148,FOLLOW_154); 

                    					newLeafNode(lv_containment_5_0, grammarAccess.getEReferenceAccess().getContainmentContainmentKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "containment", lv_containment_5_0 != null, "containment");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,149,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEReferenceAccess().getEReferenceKeyword_6());
            		
            // InternalSML.g:6585:3: ( (lv_name_7_0= ruleEString ) )
            // InternalSML.g:6586:4: (lv_name_7_0= ruleEString )
            {
            // InternalSML.g:6586:4: (lv_name_7_0= ruleEString )
            // InternalSML.g:6587:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEReferenceAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_155); 

            			newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSML.g:6608:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==140) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // InternalSML.g:6609:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,140,FOLLOW_108); 

                    				newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                    			
                    // InternalSML.g:6613:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalSML.g:6614:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalSML.g:6614:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalSML.g:6615:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_156);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_10_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6633:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==141) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // InternalSML.g:6634:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,141,FOLLOW_108); 

                    				newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                    			
                    // InternalSML.g:6638:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalSML.g:6639:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalSML.g:6639:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalSML.g:6640:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_157);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_12_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6658:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==142) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // InternalSML.g:6659:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,142,FOLLOW_126); 

                    				newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalSML.g:6663:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalSML.g:6664:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalSML.g:6664:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalSML.g:6665:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_158);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_14_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6683:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==143) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // InternalSML.g:6684:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,143,FOLLOW_126); 

                    				newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalSML.g:6688:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalSML.g:6689:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalSML.g:6689:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalSML.g:6690:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_159);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_16_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6708:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==144) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // InternalSML.g:6709:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,144,FOLLOW_108); 

                    				newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                    			
                    // InternalSML.g:6713:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalSML.g:6714:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalSML.g:6714:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalSML.g:6715:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_160);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"changeable",
                    							lv_changeable_18_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6733:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==145) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // InternalSML.g:6734:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,145,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalSML.g:6738:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalSML.g:6739:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalSML.g:6739:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalSML.g:6740:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_161);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"defaultValueLiteral",
                    							lv_defaultValueLiteral_20_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6758:3: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( (LA186_0==150) ) {
                alt186=1;
            }
            switch (alt186) {
                case 1 :
                    // InternalSML.g:6759:4: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,150,FOLLOW_108); 

                    				newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                    			
                    // InternalSML.g:6763:4: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // InternalSML.g:6764:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // InternalSML.g:6764:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    // InternalSML.g:6765:6: lv_resolveProxies_22_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_162);
                    lv_resolveProxies_22_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"resolveProxies",
                    							lv_resolveProxies_22_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6783:3: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==146) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // InternalSML.g:6784:4: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,146,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                    			
                    // InternalSML.g:6788:4: ( ( ruleEString ) )
                    // InternalSML.g:6789:5: ( ruleEString )
                    {
                    // InternalSML.g:6789:5: ( ruleEString )
                    // InternalSML.g:6790:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0());
                    					
                    pushFollow(FOLLOW_163);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6805:3: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( (LA188_0==151) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // InternalSML.g:6806:4: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,151,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                    			
                    // InternalSML.g:6810:4: ( ( ruleEString ) )
                    // InternalSML.g:6811:5: ( ruleEString )
                    {
                    // InternalSML.g:6811:5: ( ruleEString )
                    // InternalSML.g:6812:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0());
                    					
                    pushFollow(FOLLOW_164);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:6827:3: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==152) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // InternalSML.g:6828:4: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,152,FOLLOW_6); 

                    				newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                    			
                    otherlv_28=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                    			
                    // InternalSML.g:6836:4: ( ( ruleEString ) )
                    // InternalSML.g:6837:5: ( ruleEString )
                    {
                    // InternalSML.g:6837:5: ( ruleEString )
                    // InternalSML.g:6838:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:6852:4: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop189:
                    do {
                        int alt189=2;
                        int LA189_0 = input.LA(1);

                        if ( (LA189_0==15) ) {
                            alt189=1;
                        }


                        switch (alt189) {
                    	case 1 :
                    	    // InternalSML.g:6853:5: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalSML.g:6857:5: ( ( ruleEString ) )
                    	    // InternalSML.g:6858:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:6858:6: ( ruleEString )
                    	    // InternalSML.g:6859:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop189;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,16,FOLLOW_148); 

                    				newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:6879:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( (LA192_0==30) ) {
                alt192=1;
            }
            switch (alt192) {
                case 1 :
                    // InternalSML.g:6880:4: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalSML.g:6888:4: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // InternalSML.g:6889:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // InternalSML.g:6889:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // InternalSML.g:6890:6: lv_eAnnotations_35_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eAnnotations_35_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_35_0,
                    							"org.prettyprinter.sml.SML.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:6907:4: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop191:
                    do {
                        int alt191=2;
                        int LA191_0 = input.LA(1);

                        if ( (LA191_0==15) ) {
                            alt191=1;
                        }


                        switch (alt191) {
                    	case 1 :
                    	    // InternalSML.g:6908:5: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalSML.g:6912:5: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // InternalSML.g:6913:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // InternalSML.g:6913:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // InternalSML.g:6914:7: lv_eAnnotations_37_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eAnnotations_37_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_37_0,
                    	    								"org.prettyprinter.sml.SML.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop191;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,22,FOLLOW_149); 

                    				newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:6937:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==147) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // InternalSML.g:6938:4: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,147,FOLLOW_43); 

                    				newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                    			
                    // InternalSML.g:6942:4: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // InternalSML.g:6943:5: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // InternalSML.g:6943:5: (lv_eGenericType_40_0= ruleEGenericType )
                    // InternalSML.g:6944:6: lv_eGenericType_40_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEGenericTypeEGenericTypeParserRuleCall_20_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_eGenericType_40_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_40_0,
                    							"org.prettyprinter.sml.SML.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_41=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_21());
            		

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
    // $ANTLR end "ruleEReference"


    // $ANTLR start "entryRuleCase"
    // InternalSML.g:6970:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalSML.g:6970:45: (iv_ruleCase= ruleCase EOF )
            // InternalSML.g:6971:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalSML.g:6977:1: ruleCase returns [EObject current=null] : ( () otherlv_1= 'Case' otherlv_2= '{' (otherlv_3= 'caseInteraction' ( (lv_caseInteraction_4_0= ruleInteraction ) ) )? (otherlv_5= 'caseCondition' ( (lv_caseCondition_6_0= ruleCondition ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_caseInteraction_4_0 = null;

        EObject lv_caseCondition_6_0 = null;



        	enterRule();

        try {
            // InternalSML.g:6983:2: ( ( () otherlv_1= 'Case' otherlv_2= '{' (otherlv_3= 'caseInteraction' ( (lv_caseInteraction_4_0= ruleInteraction ) ) )? (otherlv_5= 'caseCondition' ( (lv_caseCondition_6_0= ruleCondition ) ) )? otherlv_7= '}' ) )
            // InternalSML.g:6984:2: ( () otherlv_1= 'Case' otherlv_2= '{' (otherlv_3= 'caseInteraction' ( (lv_caseInteraction_4_0= ruleInteraction ) ) )? (otherlv_5= 'caseCondition' ( (lv_caseCondition_6_0= ruleCondition ) ) )? otherlv_7= '}' )
            {
            // InternalSML.g:6984:2: ( () otherlv_1= 'Case' otherlv_2= '{' (otherlv_3= 'caseInteraction' ( (lv_caseInteraction_4_0= ruleInteraction ) ) )? (otherlv_5= 'caseCondition' ( (lv_caseCondition_6_0= ruleCondition ) ) )? otherlv_7= '}' )
            // InternalSML.g:6985:3: () otherlv_1= 'Case' otherlv_2= '{' (otherlv_3= 'caseInteraction' ( (lv_caseInteraction_4_0= ruleInteraction ) ) )? (otherlv_5= 'caseCondition' ( (lv_caseCondition_6_0= ruleCondition ) ) )? otherlv_7= '}'
            {
            // InternalSML.g:6985:3: ()
            // InternalSML.g:6986:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCaseAccess().getCaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,153,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getCaseKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_165); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:7000:3: (otherlv_3= 'caseInteraction' ( (lv_caseInteraction_4_0= ruleInteraction ) ) )?
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( (LA194_0==154) ) {
                alt194=1;
            }
            switch (alt194) {
                case 1 :
                    // InternalSML.g:7001:4: otherlv_3= 'caseInteraction' ( (lv_caseInteraction_4_0= ruleInteraction ) )
                    {
                    otherlv_3=(Token)match(input,154,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getCaseInteractionKeyword_3_0());
                    			
                    // InternalSML.g:7005:4: ( (lv_caseInteraction_4_0= ruleInteraction ) )
                    // InternalSML.g:7006:5: (lv_caseInteraction_4_0= ruleInteraction )
                    {
                    // InternalSML.g:7006:5: (lv_caseInteraction_4_0= ruleInteraction )
                    // InternalSML.g:7007:6: lv_caseInteraction_4_0= ruleInteraction
                    {

                    						newCompositeNode(grammarAccess.getCaseAccess().getCaseInteractionInteractionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_166);
                    lv_caseInteraction_4_0=ruleInteraction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCaseRule());
                    						}
                    						set(
                    							current,
                    							"caseInteraction",
                    							lv_caseInteraction_4_0,
                    							"org.prettyprinter.sml.SML.Interaction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7025:3: (otherlv_5= 'caseCondition' ( (lv_caseCondition_6_0= ruleCondition ) ) )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( (LA195_0==155) ) {
                alt195=1;
            }
            switch (alt195) {
                case 1 :
                    // InternalSML.g:7026:4: otherlv_5= 'caseCondition' ( (lv_caseCondition_6_0= ruleCondition ) )
                    {
                    otherlv_5=(Token)match(input,155,FOLLOW_81); 

                    				newLeafNode(otherlv_5, grammarAccess.getCaseAccess().getCaseConditionKeyword_4_0());
                    			
                    // InternalSML.g:7030:4: ( (lv_caseCondition_6_0= ruleCondition ) )
                    // InternalSML.g:7031:5: (lv_caseCondition_6_0= ruleCondition )
                    {
                    // InternalSML.g:7031:5: (lv_caseCondition_6_0= ruleCondition )
                    // InternalSML.g:7032:6: lv_caseCondition_6_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCaseAccess().getCaseConditionConditionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_caseCondition_6_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCaseRule());
                    						}
                    						set(
                    							current,
                    							"caseCondition",
                    							lv_caseCondition_6_0,
                    							"org.prettyprinter.sml.SML.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCaseAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleConditionExpression"
    // InternalSML.g:7058:1: entryRuleConditionExpression returns [EObject current=null] : iv_ruleConditionExpression= ruleConditionExpression EOF ;
    public final EObject entryRuleConditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionExpression = null;


        try {
            // InternalSML.g:7058:60: (iv_ruleConditionExpression= ruleConditionExpression EOF )
            // InternalSML.g:7059:2: iv_ruleConditionExpression= ruleConditionExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionExpression=ruleConditionExpression();

            state._fsp--;

             current =iv_ruleConditionExpression; 
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
    // $ANTLR end "entryRuleConditionExpression"


    // $ANTLR start "ruleConditionExpression"
    // InternalSML.g:7065:1: ruleConditionExpression returns [EObject current=null] : ( () otherlv_1= 'ConditionExpression' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleConditionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalSML.g:7071:2: ( ( () otherlv_1= 'ConditionExpression' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' ) )
            // InternalSML.g:7072:2: ( () otherlv_1= 'ConditionExpression' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            {
            // InternalSML.g:7072:2: ( () otherlv_1= 'ConditionExpression' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}' )
            // InternalSML.g:7073:3: () otherlv_1= 'ConditionExpression' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )? otherlv_5= '}'
            {
            // InternalSML.g:7073:3: ()
            // InternalSML.g:7074:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionExpressionAccess().getConditionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,156,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionExpressionAccess().getConditionExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_87); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:7088:3: (otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) ) )?
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( (LA196_0==83) ) {
                alt196=1;
            }
            switch (alt196) {
                case 1 :
                    // InternalSML.g:7089:4: otherlv_3= 'expression' ( (lv_expression_4_0= ruleDummyExprClass ) )
                    {
                    otherlv_3=(Token)match(input,83,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionExpressionAccess().getExpressionKeyword_3_0());
                    			
                    // InternalSML.g:7093:4: ( (lv_expression_4_0= ruleDummyExprClass ) )
                    // InternalSML.g:7094:5: (lv_expression_4_0= ruleDummyExprClass )
                    {
                    // InternalSML.g:7094:5: (lv_expression_4_0= ruleDummyExprClass )
                    // InternalSML.g:7095:6: lv_expression_4_0= ruleDummyExprClass
                    {

                    						newCompositeNode(grammarAccess.getConditionExpressionAccess().getExpressionDummyExprClassParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_expression_4_0=ruleDummyExprClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_4_0,
                    							"org.prettyprinter.sml.SML.DummyExprClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionExpressionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleConditionExpression"


    // $ANTLR start "entryRuleMessage_Impl"
    // InternalSML.g:7121:1: entryRuleMessage_Impl returns [EObject current=null] : iv_ruleMessage_Impl= ruleMessage_Impl EOF ;
    public final EObject entryRuleMessage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage_Impl = null;


        try {
            // InternalSML.g:7121:53: (iv_ruleMessage_Impl= ruleMessage_Impl EOF )
            // InternalSML.g:7122:2: iv_ruleMessage_Impl= ruleMessage_Impl EOF
            {
             newCompositeNode(grammarAccess.getMessage_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage_Impl=ruleMessage_Impl();

            state._fsp--;

             current =iv_ruleMessage_Impl; 
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
    // $ANTLR end "entryRuleMessage_Impl"


    // $ANTLR start "ruleMessage_Impl"
    // InternalSML.g:7128:1: ruleMessage_Impl returns [EObject current=null] : ( () otherlv_1= 'Message' otherlv_2= '{' (otherlv_3= 'collectionModification' ( (lv_collectionModification_4_0= ruleDummyDatatype ) ) )? (otherlv_5= 'receiver' ( ( ruleEString ) ) )? (otherlv_7= 'sender' ( ( ruleEString ) ) )? (otherlv_9= 'modelElement' ( ( ruleEString ) ) )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleParameterBinding ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleParameterBinding ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleMessage_Impl() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_collectionModification_4_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_parameters_15_0 = null;



        	enterRule();

        try {
            // InternalSML.g:7134:2: ( ( () otherlv_1= 'Message' otherlv_2= '{' (otherlv_3= 'collectionModification' ( (lv_collectionModification_4_0= ruleDummyDatatype ) ) )? (otherlv_5= 'receiver' ( ( ruleEString ) ) )? (otherlv_7= 'sender' ( ( ruleEString ) ) )? (otherlv_9= 'modelElement' ( ( ruleEString ) ) )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleParameterBinding ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleParameterBinding ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalSML.g:7135:2: ( () otherlv_1= 'Message' otherlv_2= '{' (otherlv_3= 'collectionModification' ( (lv_collectionModification_4_0= ruleDummyDatatype ) ) )? (otherlv_5= 'receiver' ( ( ruleEString ) ) )? (otherlv_7= 'sender' ( ( ruleEString ) ) )? (otherlv_9= 'modelElement' ( ( ruleEString ) ) )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleParameterBinding ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleParameterBinding ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalSML.g:7135:2: ( () otherlv_1= 'Message' otherlv_2= '{' (otherlv_3= 'collectionModification' ( (lv_collectionModification_4_0= ruleDummyDatatype ) ) )? (otherlv_5= 'receiver' ( ( ruleEString ) ) )? (otherlv_7= 'sender' ( ( ruleEString ) ) )? (otherlv_9= 'modelElement' ( ( ruleEString ) ) )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleParameterBinding ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleParameterBinding ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalSML.g:7136:3: () otherlv_1= 'Message' otherlv_2= '{' (otherlv_3= 'collectionModification' ( (lv_collectionModification_4_0= ruleDummyDatatype ) ) )? (otherlv_5= 'receiver' ( ( ruleEString ) ) )? (otherlv_7= 'sender' ( ( ruleEString ) ) )? (otherlv_9= 'modelElement' ( ( ruleEString ) ) )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleParameterBinding ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleParameterBinding ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalSML.g:7136:3: ()
            // InternalSML.g:7137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessage_ImplAccess().getMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,157,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMessage_ImplAccess().getMessageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_167); 

            			newLeafNode(otherlv_2, grammarAccess.getMessage_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:7151:3: (otherlv_3= 'collectionModification' ( (lv_collectionModification_4_0= ruleDummyDatatype ) ) )?
            int alt197=2;
            int LA197_0 = input.LA(1);

            if ( (LA197_0==63) ) {
                alt197=1;
            }
            switch (alt197) {
                case 1 :
                    // InternalSML.g:7152:4: otherlv_3= 'collectionModification' ( (lv_collectionModification_4_0= ruleDummyDatatype ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_69); 

                    				newLeafNode(otherlv_3, grammarAccess.getMessage_ImplAccess().getCollectionModificationKeyword_3_0());
                    			
                    // InternalSML.g:7156:4: ( (lv_collectionModification_4_0= ruleDummyDatatype ) )
                    // InternalSML.g:7157:5: (lv_collectionModification_4_0= ruleDummyDatatype )
                    {
                    // InternalSML.g:7157:5: (lv_collectionModification_4_0= ruleDummyDatatype )
                    // InternalSML.g:7158:6: lv_collectionModification_4_0= ruleDummyDatatype
                    {

                    						newCompositeNode(grammarAccess.getMessage_ImplAccess().getCollectionModificationDummyDatatypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_collectionModification_4_0=ruleDummyDatatype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessage_ImplRule());
                    						}
                    						set(
                    							current,
                    							"collectionModification",
                    							lv_collectionModification_4_0,
                    							"org.prettyprinter.sml.SML.DummyDatatype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7176:3: (otherlv_5= 'receiver' ( ( ruleEString ) ) )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( (LA198_0==65) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // InternalSML.g:7177:4: otherlv_5= 'receiver' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,65,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessage_ImplAccess().getReceiverKeyword_4_0());
                    			
                    // InternalSML.g:7181:4: ( ( ruleEString ) )
                    // InternalSML.g:7182:5: ( ruleEString )
                    {
                    // InternalSML.g:7182:5: ( ruleEString )
                    // InternalSML.g:7183:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessage_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessage_ImplAccess().getReceiverRoleCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7198:3: (otherlv_7= 'sender' ( ( ruleEString ) ) )?
            int alt199=2;
            int LA199_0 = input.LA(1);

            if ( (LA199_0==66) ) {
                alt199=1;
            }
            switch (alt199) {
                case 1 :
                    // InternalSML.g:7199:4: otherlv_7= 'sender' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,66,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getMessage_ImplAccess().getSenderKeyword_5_0());
                    			
                    // InternalSML.g:7203:4: ( ( ruleEString ) )
                    // InternalSML.g:7204:5: ( ruleEString )
                    {
                    // InternalSML.g:7204:5: ( ruleEString )
                    // InternalSML.g:7205:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessage_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessage_ImplAccess().getSenderRoleCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7220:3: (otherlv_9= 'modelElement' ( ( ruleEString ) ) )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==67) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // InternalSML.g:7221:4: otherlv_9= 'modelElement' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,67,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getMessage_ImplAccess().getModelElementKeyword_6_0());
                    			
                    // InternalSML.g:7225:4: ( ( ruleEString ) )
                    // InternalSML.g:7226:5: ( ruleEString )
                    {
                    // InternalSML.g:7226:5: ( ruleEString )
                    // InternalSML.g:7227:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessage_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessage_ImplAccess().getModelElementETypedElementCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7242:3: (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleParameterBinding ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleParameterBinding ) ) )* otherlv_16= '}' )?
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==68) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // InternalSML.g:7243:4: otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleParameterBinding ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleParameterBinding ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,68,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getMessage_ImplAccess().getParametersKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_76); 

                    				newLeafNode(otherlv_12, grammarAccess.getMessage_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSML.g:7251:4: ( (lv_parameters_13_0= ruleParameterBinding ) )
                    // InternalSML.g:7252:5: (lv_parameters_13_0= ruleParameterBinding )
                    {
                    // InternalSML.g:7252:5: (lv_parameters_13_0= ruleParameterBinding )
                    // InternalSML.g:7253:6: lv_parameters_13_0= ruleParameterBinding
                    {

                    						newCompositeNode(grammarAccess.getMessage_ImplAccess().getParametersParameterBindingParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parameters_13_0=ruleParameterBinding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessage_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_13_0,
                    							"org.prettyprinter.sml.SML.ParameterBinding");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:7270:4: (otherlv_14= ',' ( (lv_parameters_15_0= ruleParameterBinding ) ) )*
                    loop201:
                    do {
                        int alt201=2;
                        int LA201_0 = input.LA(1);

                        if ( (LA201_0==15) ) {
                            alt201=1;
                        }


                        switch (alt201) {
                    	case 1 :
                    	    // InternalSML.g:7271:5: otherlv_14= ',' ( (lv_parameters_15_0= ruleParameterBinding ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_76); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getMessage_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSML.g:7275:5: ( (lv_parameters_15_0= ruleParameterBinding ) )
                    	    // InternalSML.g:7276:6: (lv_parameters_15_0= ruleParameterBinding )
                    	    {
                    	    // InternalSML.g:7276:6: (lv_parameters_15_0= ruleParameterBinding )
                    	    // InternalSML.g:7277:7: lv_parameters_15_0= ruleParameterBinding
                    	    {

                    	    							newCompositeNode(grammarAccess.getMessage_ImplAccess().getParametersParameterBindingParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_parameters_15_0=ruleParameterBinding();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMessage_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_15_0,
                    	    								"org.prettyprinter.sml.SML.ParameterBinding");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop201;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_16, grammarAccess.getMessage_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getMessage_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleMessage_Impl"


    // $ANTLR start "entryRuleEOperation"
    // InternalSML.g:7308:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalSML.g:7308:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalSML.g:7309:2: iv_ruleEOperation= ruleEOperation EOF
            {
             newCompositeNode(grammarAccess.getEOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOperation=ruleEOperation();

            state._fsp--;

             current =iv_ruleEOperation; 
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
    // $ANTLR end "entryRuleEOperation"


    // $ANTLR start "ruleEOperation"
    // InternalSML.g:7315:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleEOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ordered_5_0 = null;

        AntlrDatatypeRuleToken lv_unique_7_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_11_0 = null;

        EObject lv_eAnnotations_22_0 = null;

        EObject lv_eAnnotations_24_0 = null;

        EObject lv_eGenericType_27_0 = null;

        EObject lv_eTypeParameters_30_0 = null;

        EObject lv_eTypeParameters_32_0 = null;

        EObject lv_eParameters_36_0 = null;

        EObject lv_eParameters_38_0 = null;

        EObject lv_eGenericExceptions_42_0 = null;

        EObject lv_eGenericExceptions_44_0 = null;



        	enterRule();

        try {
            // InternalSML.g:7321:2: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalSML.g:7322:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalSML.g:7322:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalSML.g:7323:3: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalSML.g:7323:3: ()
            // InternalSML.g:7324:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationAccess().getEOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,158,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
            		
            // InternalSML.g:7334:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSML.g:7335:4: (lv_name_2_0= ruleEString )
            {
            // InternalSML.g:7335:4: (lv_name_2_0= ruleEString )
            // InternalSML.g:7336:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_168); 

            			newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSML.g:7357:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( (LA203_0==140) ) {
                alt203=1;
            }
            switch (alt203) {
                case 1 :
                    // InternalSML.g:7358:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,140,FOLLOW_108); 

                    				newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                    			
                    // InternalSML.g:7362:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalSML.g:7363:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalSML.g:7363:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalSML.g:7364:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_169);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_5_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7382:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt204=2;
            int LA204_0 = input.LA(1);

            if ( (LA204_0==141) ) {
                alt204=1;
            }
            switch (alt204) {
                case 1 :
                    // InternalSML.g:7383:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,141,FOLLOW_108); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                    			
                    // InternalSML.g:7387:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalSML.g:7388:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalSML.g:7388:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalSML.g:7389:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_170);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_7_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7407:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==142) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // InternalSML.g:7408:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,142,FOLLOW_126); 

                    				newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalSML.g:7412:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalSML.g:7413:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalSML.g:7413:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalSML.g:7414:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_171);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_9_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7432:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt206=2;
            int LA206_0 = input.LA(1);

            if ( (LA206_0==143) ) {
                alt206=1;
            }
            switch (alt206) {
                case 1 :
                    // InternalSML.g:7433:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,143,FOLLOW_126); 

                    				newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalSML.g:7437:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalSML.g:7438:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalSML.g:7438:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalSML.g:7439:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_172);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_11_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7457:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( (LA207_0==146) ) {
                alt207=1;
            }
            switch (alt207) {
                case 1 :
                    // InternalSML.g:7458:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,146,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                    			
                    // InternalSML.g:7462:4: ( ( ruleEString ) )
                    // InternalSML.g:7463:5: ( ruleEString )
                    {
                    // InternalSML.g:7463:5: ( ruleEString )
                    // InternalSML.g:7464:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_173);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7479:3: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==159) ) {
                alt209=1;
            }
            switch (alt209) {
                case 1 :
                    // InternalSML.g:7480:4: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,159,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalSML.g:7488:4: ( ( ruleEString ) )
                    // InternalSML.g:7489:5: ( ruleEString )
                    {
                    // InternalSML.g:7489:5: ( ruleEString )
                    // InternalSML.g:7490:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:7504:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop208:
                    do {
                        int alt208=2;
                        int LA208_0 = input.LA(1);

                        if ( (LA208_0==15) ) {
                            alt208=1;
                        }


                        switch (alt208) {
                    	case 1 :
                    	    // InternalSML.g:7505:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalSML.g:7509:5: ( ( ruleEString ) )
                    	    // InternalSML.g:7510:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:7510:6: ( ruleEString )
                    	    // InternalSML.g:7511:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEOperationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop208;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_174); 

                    				newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:7531:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt211=2;
            int LA211_0 = input.LA(1);

            if ( (LA211_0==30) ) {
                alt211=1;
            }
            switch (alt211) {
                case 1 :
                    // InternalSML.g:7532:4: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalSML.g:7540:4: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // InternalSML.g:7541:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // InternalSML.g:7541:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // InternalSML.g:7542:6: lv_eAnnotations_22_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eAnnotations_22_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_22_0,
                    							"org.prettyprinter.sml.SML.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:7559:4: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop210:
                    do {
                        int alt210=2;
                        int LA210_0 = input.LA(1);

                        if ( (LA210_0==15) ) {
                            alt210=1;
                        }


                        switch (alt210) {
                    	case 1 :
                    	    // InternalSML.g:7560:5: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalSML.g:7564:5: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // InternalSML.g:7565:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // InternalSML.g:7565:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // InternalSML.g:7566:7: lv_eAnnotations_24_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eAnnotations_24_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_24_0,
                    	    								"org.prettyprinter.sml.SML.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop210;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,22,FOLLOW_175); 

                    				newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:7589:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt212=2;
            int LA212_0 = input.LA(1);

            if ( (LA212_0==147) ) {
                alt212=1;
            }
            switch (alt212) {
                case 1 :
                    // InternalSML.g:7590:4: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,147,FOLLOW_43); 

                    				newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                    			
                    // InternalSML.g:7594:4: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // InternalSML.g:7595:5: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // InternalSML.g:7595:5: (lv_eGenericType_27_0= ruleEGenericType )
                    // InternalSML.g:7596:6: lv_eGenericType_27_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_176);
                    lv_eGenericType_27_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_27_0,
                    							"org.prettyprinter.sml.SML.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7614:3: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( (LA214_0==39) ) {
                alt214=1;
            }
            switch (alt214) {
                case 1 :
                    // InternalSML.g:7615:4: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalSML.g:7623:4: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // InternalSML.g:7624:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // InternalSML.g:7624:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // InternalSML.g:7625:6: lv_eTypeParameters_30_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eTypeParameters_30_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_30_0,
                    							"org.prettyprinter.sml.SML.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:7642:4: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop213:
                    do {
                        int alt213=2;
                        int LA213_0 = input.LA(1);

                        if ( (LA213_0==15) ) {
                            alt213=1;
                        }


                        switch (alt213) {
                    	case 1 :
                    	    // InternalSML.g:7643:5: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,15,FOLLOW_37); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalSML.g:7647:5: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // InternalSML.g:7648:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // InternalSML.g:7648:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // InternalSML.g:7649:7: lv_eTypeParameters_32_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eTypeParameters_32_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_32_0,
                    	    								"org.prettyprinter.sml.SML.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop213;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,22,FOLLOW_177); 

                    				newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:7672:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt216=2;
            int LA216_0 = input.LA(1);

            if ( (LA216_0==160) ) {
                alt216=1;
            }
            switch (alt216) {
                case 1 :
                    // InternalSML.g:7673:4: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,160,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_178); 

                    				newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalSML.g:7681:4: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // InternalSML.g:7682:5: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // InternalSML.g:7682:5: (lv_eParameters_36_0= ruleEParameter )
                    // InternalSML.g:7683:6: lv_eParameters_36_0= ruleEParameter
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eParameters_36_0=ruleEParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eParameters",
                    							lv_eParameters_36_0,
                    							"org.prettyprinter.sml.SML.EParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:7700:4: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop215:
                    do {
                        int alt215=2;
                        int LA215_0 = input.LA(1);

                        if ( (LA215_0==15) ) {
                            alt215=1;
                        }


                        switch (alt215) {
                    	case 1 :
                    	    // InternalSML.g:7701:5: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,15,FOLLOW_178); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalSML.g:7705:5: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // InternalSML.g:7706:6: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // InternalSML.g:7706:6: (lv_eParameters_38_0= ruleEParameter )
                    	    // InternalSML.g:7707:7: lv_eParameters_38_0= ruleEParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eParameters_38_0=ruleEParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eParameters",
                    	    								lv_eParameters_38_0,
                    	    								"org.prettyprinter.sml.SML.EParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop215;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,22,FOLLOW_179); 

                    				newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:7730:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( (LA218_0==161) ) {
                alt218=1;
            }
            switch (alt218) {
                case 1 :
                    // InternalSML.g:7731:4: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,161,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalSML.g:7739:4: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // InternalSML.g:7740:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // InternalSML.g:7740:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // InternalSML.g:7741:6: lv_eGenericExceptions_42_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eGenericExceptions_42_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eGenericExceptions",
                    							lv_eGenericExceptions_42_0,
                    							"org.prettyprinter.sml.SML.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:7758:4: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop217:
                    do {
                        int alt217=2;
                        int LA217_0 = input.LA(1);

                        if ( (LA217_0==15) ) {
                            alt217=1;
                        }


                        switch (alt217) {
                    	case 1 :
                    	    // InternalSML.g:7759:5: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalSML.g:7763:5: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // InternalSML.g:7764:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // InternalSML.g:7764:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // InternalSML.g:7765:7: lv_eGenericExceptions_44_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eGenericExceptions_44_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eGenericExceptions",
                    	    								lv_eGenericExceptions_44_0,
                    	    								"org.prettyprinter.sml.SML.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop217;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_45, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_46, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleEOperation"


    // $ANTLR start "entryRuleEParameter"
    // InternalSML.g:7796:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalSML.g:7796:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalSML.g:7797:2: iv_ruleEParameter= ruleEParameter EOF
            {
             newCompositeNode(grammarAccess.getEParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;

             current =iv_ruleEParameter; 
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
    // $ANTLR end "entryRuleEParameter"


    // $ANTLR start "ruleEParameter"
    // InternalSML.g:7803:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ordered_5_0 = null;

        AntlrDatatypeRuleToken lv_unique_7_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_11_0 = null;

        EObject lv_eAnnotations_16_0 = null;

        EObject lv_eAnnotations_18_0 = null;

        EObject lv_eGenericType_21_0 = null;



        	enterRule();

        try {
            // InternalSML.g:7809:2: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // InternalSML.g:7810:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // InternalSML.g:7810:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // InternalSML.g:7811:3: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // InternalSML.g:7811:3: ()
            // InternalSML.g:7812:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterAccess().getEParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,162,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
            		
            // InternalSML.g:7822:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSML.g:7823:4: (lv_name_2_0= ruleEString )
            {
            // InternalSML.g:7823:4: (lv_name_2_0= ruleEString )
            // InternalSML.g:7824:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_180); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSML.g:7845:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==140) ) {
                alt219=1;
            }
            switch (alt219) {
                case 1 :
                    // InternalSML.g:7846:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,140,FOLLOW_108); 

                    				newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                    			
                    // InternalSML.g:7850:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalSML.g:7851:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalSML.g:7851:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalSML.g:7852:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_181);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_5_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7870:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt220=2;
            int LA220_0 = input.LA(1);

            if ( (LA220_0==141) ) {
                alt220=1;
            }
            switch (alt220) {
                case 1 :
                    // InternalSML.g:7871:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,141,FOLLOW_108); 

                    				newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                    			
                    // InternalSML.g:7875:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalSML.g:7876:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalSML.g:7876:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalSML.g:7877:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_182);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_7_0,
                    							"org.prettyprinter.sml.SML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7895:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt221=2;
            int LA221_0 = input.LA(1);

            if ( (LA221_0==142) ) {
                alt221=1;
            }
            switch (alt221) {
                case 1 :
                    // InternalSML.g:7896:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,142,FOLLOW_126); 

                    				newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalSML.g:7900:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalSML.g:7901:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalSML.g:7901:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalSML.g:7902:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_183);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_9_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7920:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==143) ) {
                alt222=1;
            }
            switch (alt222) {
                case 1 :
                    // InternalSML.g:7921:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,143,FOLLOW_126); 

                    				newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalSML.g:7925:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalSML.g:7926:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalSML.g:7926:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalSML.g:7927:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_147);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_11_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7945:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt223=2;
            int LA223_0 = input.LA(1);

            if ( (LA223_0==146) ) {
                alt223=1;
            }
            switch (alt223) {
                case 1 :
                    // InternalSML.g:7946:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,146,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                    			
                    // InternalSML.g:7950:4: ( ( ruleEString ) )
                    // InternalSML.g:7951:5: ( ruleEString )
                    {
                    // InternalSML.g:7951:5: ( ruleEString )
                    // InternalSML.g:7952:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_148);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:7967:3: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt225=2;
            int LA225_0 = input.LA(1);

            if ( (LA225_0==30) ) {
                alt225=1;
            }
            switch (alt225) {
                case 1 :
                    // InternalSML.g:7968:4: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalSML.g:7976:4: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // InternalSML.g:7977:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // InternalSML.g:7977:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // InternalSML.g:7978:6: lv_eAnnotations_16_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_eAnnotations_16_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_16_0,
                    							"org.prettyprinter.sml.SML.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:7995:4: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop224:
                    do {
                        int alt224=2;
                        int LA224_0 = input.LA(1);

                        if ( (LA224_0==15) ) {
                            alt224=1;
                        }


                        switch (alt224) {
                    	case 1 :
                    	    // InternalSML.g:7996:5: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalSML.g:8000:5: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // InternalSML.g:8001:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // InternalSML.g:8001:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // InternalSML.g:8002:7: lv_eAnnotations_18_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_eAnnotations_18_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_18_0,
                    	    								"org.prettyprinter.sml.SML.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop224;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,22,FOLLOW_149); 

                    				newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:8025:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==147) ) {
                alt226=1;
            }
            switch (alt226) {
                case 1 :
                    // InternalSML.g:8026:4: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,147,FOLLOW_43); 

                    				newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                    			
                    // InternalSML.g:8030:4: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // InternalSML.g:8031:5: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // InternalSML.g:8031:5: (lv_eGenericType_21_0= ruleEGenericType )
                    // InternalSML.g:8032:6: lv_eGenericType_21_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getEGenericTypeEGenericTypeParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_eGenericType_21_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_21_0,
                    							"org.prettyprinter.sml.SML.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleEParameter"


    // $ANTLR start "entryRuleScenario"
    // InternalSML.g:8058:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalSML.g:8058:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalSML.g:8059:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalSML.g:8065:1: ruleScenario returns [EObject current=null] : ( ( (lv_singular_0_0= 'singular' ) )? ( (lv_optimizeCost_1_0= 'optimizeCost' ) ) otherlv_2= 'Scenario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'kind' ( (lv_kind_6_0= ruleScenarioKind ) ) )? otherlv_7= 'cost' ( (lv_cost_8_0= ruleEDouble ) ) (otherlv_9= 'contexts' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'roleBindings' otherlv_16= '{' ( (lv_roleBindings_17_0= ruleRoleBindingConstraint ) ) (otherlv_18= ',' ( (lv_roleBindings_19_0= ruleRoleBindingConstraint ) ) )* otherlv_20= '}' )? (otherlv_21= 'ownedInteraction' ( (lv_ownedInteraction_22_0= ruleInteraction ) ) )? otherlv_23= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token lv_singular_0_0=null;
        Token lv_optimizeCost_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_cost_8_0 = null;

        EObject lv_roleBindings_17_0 = null;

        EObject lv_roleBindings_19_0 = null;

        EObject lv_ownedInteraction_22_0 = null;



        	enterRule();

        try {
            // InternalSML.g:8071:2: ( ( ( (lv_singular_0_0= 'singular' ) )? ( (lv_optimizeCost_1_0= 'optimizeCost' ) ) otherlv_2= 'Scenario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'kind' ( (lv_kind_6_0= ruleScenarioKind ) ) )? otherlv_7= 'cost' ( (lv_cost_8_0= ruleEDouble ) ) (otherlv_9= 'contexts' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'roleBindings' otherlv_16= '{' ( (lv_roleBindings_17_0= ruleRoleBindingConstraint ) ) (otherlv_18= ',' ( (lv_roleBindings_19_0= ruleRoleBindingConstraint ) ) )* otherlv_20= '}' )? (otherlv_21= 'ownedInteraction' ( (lv_ownedInteraction_22_0= ruleInteraction ) ) )? otherlv_23= '}' ) )
            // InternalSML.g:8072:2: ( ( (lv_singular_0_0= 'singular' ) )? ( (lv_optimizeCost_1_0= 'optimizeCost' ) ) otherlv_2= 'Scenario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'kind' ( (lv_kind_6_0= ruleScenarioKind ) ) )? otherlv_7= 'cost' ( (lv_cost_8_0= ruleEDouble ) ) (otherlv_9= 'contexts' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'roleBindings' otherlv_16= '{' ( (lv_roleBindings_17_0= ruleRoleBindingConstraint ) ) (otherlv_18= ',' ( (lv_roleBindings_19_0= ruleRoleBindingConstraint ) ) )* otherlv_20= '}' )? (otherlv_21= 'ownedInteraction' ( (lv_ownedInteraction_22_0= ruleInteraction ) ) )? otherlv_23= '}' )
            {
            // InternalSML.g:8072:2: ( ( (lv_singular_0_0= 'singular' ) )? ( (lv_optimizeCost_1_0= 'optimizeCost' ) ) otherlv_2= 'Scenario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'kind' ( (lv_kind_6_0= ruleScenarioKind ) ) )? otherlv_7= 'cost' ( (lv_cost_8_0= ruleEDouble ) ) (otherlv_9= 'contexts' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'roleBindings' otherlv_16= '{' ( (lv_roleBindings_17_0= ruleRoleBindingConstraint ) ) (otherlv_18= ',' ( (lv_roleBindings_19_0= ruleRoleBindingConstraint ) ) )* otherlv_20= '}' )? (otherlv_21= 'ownedInteraction' ( (lv_ownedInteraction_22_0= ruleInteraction ) ) )? otherlv_23= '}' )
            // InternalSML.g:8073:3: ( (lv_singular_0_0= 'singular' ) )? ( (lv_optimizeCost_1_0= 'optimizeCost' ) ) otherlv_2= 'Scenario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'kind' ( (lv_kind_6_0= ruleScenarioKind ) ) )? otherlv_7= 'cost' ( (lv_cost_8_0= ruleEDouble ) ) (otherlv_9= 'contexts' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'roleBindings' otherlv_16= '{' ( (lv_roleBindings_17_0= ruleRoleBindingConstraint ) ) (otherlv_18= ',' ( (lv_roleBindings_19_0= ruleRoleBindingConstraint ) ) )* otherlv_20= '}' )? (otherlv_21= 'ownedInteraction' ( (lv_ownedInteraction_22_0= ruleInteraction ) ) )? otherlv_23= '}'
            {
            // InternalSML.g:8073:3: ( (lv_singular_0_0= 'singular' ) )?
            int alt227=2;
            int LA227_0 = input.LA(1);

            if ( (LA227_0==163) ) {
                alt227=1;
            }
            switch (alt227) {
                case 1 :
                    // InternalSML.g:8074:4: (lv_singular_0_0= 'singular' )
                    {
                    // InternalSML.g:8074:4: (lv_singular_0_0= 'singular' )
                    // InternalSML.g:8075:5: lv_singular_0_0= 'singular'
                    {
                    lv_singular_0_0=(Token)match(input,163,FOLLOW_184); 

                    					newLeafNode(lv_singular_0_0, grammarAccess.getScenarioAccess().getSingularSingularKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScenarioRule());
                    					}
                    					setWithLastConsumed(current, "singular", lv_singular_0_0 != null, "singular");
                    				

                    }


                    }
                    break;

            }

            // InternalSML.g:8087:3: ( (lv_optimizeCost_1_0= 'optimizeCost' ) )
            // InternalSML.g:8088:4: (lv_optimizeCost_1_0= 'optimizeCost' )
            {
            // InternalSML.g:8088:4: (lv_optimizeCost_1_0= 'optimizeCost' )
            // InternalSML.g:8089:5: lv_optimizeCost_1_0= 'optimizeCost'
            {
            lv_optimizeCost_1_0=(Token)match(input,164,FOLLOW_185); 

            					newLeafNode(lv_optimizeCost_1_0, grammarAccess.getScenarioAccess().getOptimizeCostOptimizeCostKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(current, "optimizeCost", lv_optimizeCost_1_0 != null, "optimizeCost");
            				

            }


            }

            otherlv_2=(Token)match(input,165,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_2());
            		
            // InternalSML.g:8105:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSML.g:8106:4: (lv_name_3_0= ruleEString )
            {
            // InternalSML.g:8106:4: (lv_name_3_0= ruleEString )
            // InternalSML.g:8107:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.prettyprinter.sml.SML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_186); 

            			newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSML.g:8128:3: (otherlv_5= 'kind' ( (lv_kind_6_0= ruleScenarioKind ) ) )?
            int alt228=2;
            int LA228_0 = input.LA(1);

            if ( (LA228_0==166) ) {
                alt228=1;
            }
            switch (alt228) {
                case 1 :
                    // InternalSML.g:8129:4: otherlv_5= 'kind' ( (lv_kind_6_0= ruleScenarioKind ) )
                    {
                    otherlv_5=(Token)match(input,166,FOLLOW_187); 

                    				newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getKindKeyword_5_0());
                    			
                    // InternalSML.g:8133:4: ( (lv_kind_6_0= ruleScenarioKind ) )
                    // InternalSML.g:8134:5: (lv_kind_6_0= ruleScenarioKind )
                    {
                    // InternalSML.g:8134:5: (lv_kind_6_0= ruleScenarioKind )
                    // InternalSML.g:8135:6: lv_kind_6_0= ruleScenarioKind
                    {

                    						newCompositeNode(grammarAccess.getScenarioAccess().getKindScenarioKindEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_188);
                    lv_kind_6_0=ruleScenarioKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_6_0,
                    							"org.prettyprinter.sml.SML.ScenarioKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,167,FOLLOW_189); 

            			newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getCostKeyword_6());
            		
            // InternalSML.g:8157:3: ( (lv_cost_8_0= ruleEDouble ) )
            // InternalSML.g:8158:4: (lv_cost_8_0= ruleEDouble )
            {
            // InternalSML.g:8158:4: (lv_cost_8_0= ruleEDouble )
            // InternalSML.g:8159:5: lv_cost_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getCostEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_190);
            lv_cost_8_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"cost",
            						lv_cost_8_0,
            						"org.prettyprinter.sml.SML.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSML.g:8176:3: (otherlv_9= 'contexts' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt230=2;
            int LA230_0 = input.LA(1);

            if ( (LA230_0==17) ) {
                alt230=1;
            }
            switch (alt230) {
                case 1 :
                    // InternalSML.g:8177:4: otherlv_9= 'contexts' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getContextsKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getScenarioAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalSML.g:8185:4: ( ( ruleEString ) )
                    // InternalSML.g:8186:5: ( ruleEString )
                    {
                    // InternalSML.g:8186:5: ( ruleEString )
                    // InternalSML.g:8187:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getScenarioAccess().getContextsEClassCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:8201:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop229:
                    do {
                        int alt229=2;
                        int LA229_0 = input.LA(1);

                        if ( (LA229_0==15) ) {
                            alt229=1;
                        }


                        switch (alt229) {
                    	case 1 :
                    	    // InternalSML.g:8202:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getScenarioAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSML.g:8206:5: ( ( ruleEString ) )
                    	    // InternalSML.g:8207:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:8207:6: ( ruleEString )
                    	    // InternalSML.g:8208:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getScenarioRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getScenarioAccess().getContextsEClassCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop229;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_191); 

                    				newLeafNode(otherlv_14, grammarAccess.getScenarioAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:8228:3: (otherlv_15= 'roleBindings' otherlv_16= '{' ( (lv_roleBindings_17_0= ruleRoleBindingConstraint ) ) (otherlv_18= ',' ( (lv_roleBindings_19_0= ruleRoleBindingConstraint ) ) )* otherlv_20= '}' )?
            int alt232=2;
            int LA232_0 = input.LA(1);

            if ( (LA232_0==168) ) {
                alt232=1;
            }
            switch (alt232) {
                case 1 :
                    // InternalSML.g:8229:4: otherlv_15= 'roleBindings' otherlv_16= '{' ( (lv_roleBindings_17_0= ruleRoleBindingConstraint ) ) (otherlv_18= ',' ( (lv_roleBindings_19_0= ruleRoleBindingConstraint ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,168,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getScenarioAccess().getRoleBindingsKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_192); 

                    				newLeafNode(otherlv_16, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalSML.g:8237:4: ( (lv_roleBindings_17_0= ruleRoleBindingConstraint ) )
                    // InternalSML.g:8238:5: (lv_roleBindings_17_0= ruleRoleBindingConstraint )
                    {
                    // InternalSML.g:8238:5: (lv_roleBindings_17_0= ruleRoleBindingConstraint )
                    // InternalSML.g:8239:6: lv_roleBindings_17_0= ruleRoleBindingConstraint
                    {

                    						newCompositeNode(grammarAccess.getScenarioAccess().getRoleBindingsRoleBindingConstraintParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_roleBindings_17_0=ruleRoleBindingConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    						}
                    						add(
                    							current,
                    							"roleBindings",
                    							lv_roleBindings_17_0,
                    							"org.prettyprinter.sml.SML.RoleBindingConstraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:8256:4: (otherlv_18= ',' ( (lv_roleBindings_19_0= ruleRoleBindingConstraint ) ) )*
                    loop231:
                    do {
                        int alt231=2;
                        int LA231_0 = input.LA(1);

                        if ( (LA231_0==15) ) {
                            alt231=1;
                        }


                        switch (alt231) {
                    	case 1 :
                    	    // InternalSML.g:8257:5: otherlv_18= ',' ( (lv_roleBindings_19_0= ruleRoleBindingConstraint ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_192); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getScenarioAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalSML.g:8261:5: ( (lv_roleBindings_19_0= ruleRoleBindingConstraint ) )
                    	    // InternalSML.g:8262:6: (lv_roleBindings_19_0= ruleRoleBindingConstraint )
                    	    {
                    	    // InternalSML.g:8262:6: (lv_roleBindings_19_0= ruleRoleBindingConstraint )
                    	    // InternalSML.g:8263:7: lv_roleBindings_19_0= ruleRoleBindingConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getScenarioAccess().getRoleBindingsRoleBindingConstraintParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_roleBindings_19_0=ruleRoleBindingConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"roleBindings",
                    	    								lv_roleBindings_19_0,
                    	    								"org.prettyprinter.sml.SML.RoleBindingConstraint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop231;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FOLLOW_193); 

                    				newLeafNode(otherlv_20, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalSML.g:8286:3: (otherlv_21= 'ownedInteraction' ( (lv_ownedInteraction_22_0= ruleInteraction ) ) )?
            int alt233=2;
            int LA233_0 = input.LA(1);

            if ( (LA233_0==169) ) {
                alt233=1;
            }
            switch (alt233) {
                case 1 :
                    // InternalSML.g:8287:4: otherlv_21= 'ownedInteraction' ( (lv_ownedInteraction_22_0= ruleInteraction ) )
                    {
                    otherlv_21=(Token)match(input,169,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getScenarioAccess().getOwnedInteractionKeyword_10_0());
                    			
                    // InternalSML.g:8291:4: ( (lv_ownedInteraction_22_0= ruleInteraction ) )
                    // InternalSML.g:8292:5: (lv_ownedInteraction_22_0= ruleInteraction )
                    {
                    // InternalSML.g:8292:5: (lv_ownedInteraction_22_0= ruleInteraction )
                    // InternalSML.g:8293:6: lv_ownedInteraction_22_0= ruleInteraction
                    {

                    						newCompositeNode(grammarAccess.getScenarioAccess().getOwnedInteractionInteractionParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_ownedInteraction_22_0=ruleInteraction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    						}
                    						set(
                    							current,
                    							"ownedInteraction",
                    							lv_ownedInteraction_22_0,
                    							"org.prettyprinter.sml.SML.Interaction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleRoleBindingConstraint"
    // InternalSML.g:8319:1: entryRuleRoleBindingConstraint returns [EObject current=null] : iv_ruleRoleBindingConstraint= ruleRoleBindingConstraint EOF ;
    public final EObject entryRuleRoleBindingConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleBindingConstraint = null;


        try {
            // InternalSML.g:8319:62: (iv_ruleRoleBindingConstraint= ruleRoleBindingConstraint EOF )
            // InternalSML.g:8320:2: iv_ruleRoleBindingConstraint= ruleRoleBindingConstraint EOF
            {
             newCompositeNode(grammarAccess.getRoleBindingConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleBindingConstraint=ruleRoleBindingConstraint();

            state._fsp--;

             current =iv_ruleRoleBindingConstraint; 
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
    // $ANTLR end "entryRuleRoleBindingConstraint"


    // $ANTLR start "ruleRoleBindingConstraint"
    // InternalSML.g:8326:1: ruleRoleBindingConstraint returns [EObject current=null] : ( () otherlv_1= 'RoleBindingConstraint' otherlv_2= '{' (otherlv_3= 'role' ( ( ruleEString ) ) )? (otherlv_5= 'bindingExpression' ( (lv_bindingExpression_6_0= ruleBindingExpression ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRoleBindingConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_bindingExpression_6_0 = null;



        	enterRule();

        try {
            // InternalSML.g:8332:2: ( ( () otherlv_1= 'RoleBindingConstraint' otherlv_2= '{' (otherlv_3= 'role' ( ( ruleEString ) ) )? (otherlv_5= 'bindingExpression' ( (lv_bindingExpression_6_0= ruleBindingExpression ) ) )? otherlv_7= '}' ) )
            // InternalSML.g:8333:2: ( () otherlv_1= 'RoleBindingConstraint' otherlv_2= '{' (otherlv_3= 'role' ( ( ruleEString ) ) )? (otherlv_5= 'bindingExpression' ( (lv_bindingExpression_6_0= ruleBindingExpression ) ) )? otherlv_7= '}' )
            {
            // InternalSML.g:8333:2: ( () otherlv_1= 'RoleBindingConstraint' otherlv_2= '{' (otherlv_3= 'role' ( ( ruleEString ) ) )? (otherlv_5= 'bindingExpression' ( (lv_bindingExpression_6_0= ruleBindingExpression ) ) )? otherlv_7= '}' )
            // InternalSML.g:8334:3: () otherlv_1= 'RoleBindingConstraint' otherlv_2= '{' (otherlv_3= 'role' ( ( ruleEString ) ) )? (otherlv_5= 'bindingExpression' ( (lv_bindingExpression_6_0= ruleBindingExpression ) ) )? otherlv_7= '}'
            {
            // InternalSML.g:8334:3: ()
            // InternalSML.g:8335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleBindingConstraintAccess().getRoleBindingConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,170,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleBindingConstraintAccess().getRoleBindingConstraintKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_194); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleBindingConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:8349:3: (otherlv_3= 'role' ( ( ruleEString ) ) )?
            int alt234=2;
            int LA234_0 = input.LA(1);

            if ( (LA234_0==171) ) {
                alt234=1;
            }
            switch (alt234) {
                case 1 :
                    // InternalSML.g:8350:4: otherlv_3= 'role' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,171,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoleBindingConstraintAccess().getRoleKeyword_3_0());
                    			
                    // InternalSML.g:8354:4: ( ( ruleEString ) )
                    // InternalSML.g:8355:5: ( ruleEString )
                    {
                    // InternalSML.g:8355:5: ( ruleEString )
                    // InternalSML.g:8356:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoleBindingConstraintRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRoleBindingConstraintAccess().getRoleRoleCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:8371:3: (otherlv_5= 'bindingExpression' ( (lv_bindingExpression_6_0= ruleBindingExpression ) ) )?
            int alt235=2;
            int LA235_0 = input.LA(1);

            if ( (LA235_0==94) ) {
                alt235=1;
            }
            switch (alt235) {
                case 1 :
                    // InternalSML.g:8372:4: otherlv_5= 'bindingExpression' ( (lv_bindingExpression_6_0= ruleBindingExpression ) )
                    {
                    otherlv_5=(Token)match(input,94,FOLLOW_95); 

                    				newLeafNode(otherlv_5, grammarAccess.getRoleBindingConstraintAccess().getBindingExpressionKeyword_4_0());
                    			
                    // InternalSML.g:8376:4: ( (lv_bindingExpression_6_0= ruleBindingExpression ) )
                    // InternalSML.g:8377:5: (lv_bindingExpression_6_0= ruleBindingExpression )
                    {
                    // InternalSML.g:8377:5: (lv_bindingExpression_6_0= ruleBindingExpression )
                    // InternalSML.g:8378:6: lv_bindingExpression_6_0= ruleBindingExpression
                    {

                    						newCompositeNode(grammarAccess.getRoleBindingConstraintAccess().getBindingExpressionBindingExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_bindingExpression_6_0=ruleBindingExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleBindingConstraintRule());
                    						}
                    						set(
                    							current,
                    							"bindingExpression",
                    							lv_bindingExpression_6_0,
                    							"org.prettyprinter.sml.SML.BindingExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRoleBindingConstraintAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRoleBindingConstraint"


    // $ANTLR start "entryRuleEDouble"
    // InternalSML.g:8404:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalSML.g:8404:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalSML.g:8405:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalSML.g:8411:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalSML.g:8417:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalSML.g:8418:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalSML.g:8418:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalSML.g:8419:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalSML.g:8419:3: (kw= '-' )?
            int alt236=2;
            int LA236_0 = input.LA(1);

            if ( (LA236_0==121) ) {
                alt236=1;
            }
            switch (alt236) {
                case 1 :
                    // InternalSML.g:8420:4: kw= '-'
                    {
                    kw=(Token)match(input,121,FOLLOW_195); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSML.g:8426:3: (this_INT_1= RULE_INT )?
            int alt237=2;
            int LA237_0 = input.LA(1);

            if ( (LA237_0==RULE_INT) ) {
                alt237=1;
            }
            switch (alt237) {
                case 1 :
                    // InternalSML.g:8427:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_196); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,172,FOLLOW_129); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_197); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalSML.g:8447:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt240=2;
            int LA240_0 = input.LA(1);

            if ( ((LA240_0>=173 && LA240_0<=174)) ) {
                alt240=1;
            }
            switch (alt240) {
                case 1 :
                    // InternalSML.g:8448:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalSML.g:8448:4: (kw= 'E' | kw= 'e' )
                    int alt238=2;
                    int LA238_0 = input.LA(1);

                    if ( (LA238_0==173) ) {
                        alt238=1;
                    }
                    else if ( (LA238_0==174) ) {
                        alt238=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 238, 0, input);

                        throw nvae;
                    }
                    switch (alt238) {
                        case 1 :
                            // InternalSML.g:8449:5: kw= 'E'
                            {
                            kw=(Token)match(input,173,FOLLOW_126); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSML.g:8455:5: kw= 'e'
                            {
                            kw=(Token)match(input,174,FOLLOW_126); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSML.g:8461:4: (kw= '-' )?
                    int alt239=2;
                    int LA239_0 = input.LA(1);

                    if ( (LA239_0==121) ) {
                        alt239=1;
                    }
                    switch (alt239) {
                        case 1 :
                            // InternalSML.g:8462:5: kw= '-'
                            {
                            kw=(Token)match(input,121,FOLLOW_129); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleRangesForParameter"
    // InternalSML.g:8480:1: entryRuleRangesForParameter returns [EObject current=null] : iv_ruleRangesForParameter= ruleRangesForParameter EOF ;
    public final EObject entryRuleRangesForParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangesForParameter = null;


        try {
            // InternalSML.g:8480:59: (iv_ruleRangesForParameter= ruleRangesForParameter EOF )
            // InternalSML.g:8481:2: iv_ruleRangesForParameter= ruleRangesForParameter EOF
            {
             newCompositeNode(grammarAccess.getRangesForParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangesForParameter=ruleRangesForParameter();

            state._fsp--;

             current =iv_ruleRangesForParameter; 
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
    // $ANTLR end "entryRuleRangesForParameter"


    // $ANTLR start "ruleRangesForParameter"
    // InternalSML.g:8487:1: ruleRangesForParameter returns [EObject current=null] : ( () otherlv_1= 'RangesForParameter' otherlv_2= '{' (otherlv_3= 'parameter' ( ( ruleEString ) ) )? (otherlv_5= 'ranges' ( (lv_ranges_6_0= ruleAbstractRanges ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRangesForParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ranges_6_0 = null;



        	enterRule();

        try {
            // InternalSML.g:8493:2: ( ( () otherlv_1= 'RangesForParameter' otherlv_2= '{' (otherlv_3= 'parameter' ( ( ruleEString ) ) )? (otherlv_5= 'ranges' ( (lv_ranges_6_0= ruleAbstractRanges ) ) )? otherlv_7= '}' ) )
            // InternalSML.g:8494:2: ( () otherlv_1= 'RangesForParameter' otherlv_2= '{' (otherlv_3= 'parameter' ( ( ruleEString ) ) )? (otherlv_5= 'ranges' ( (lv_ranges_6_0= ruleAbstractRanges ) ) )? otherlv_7= '}' )
            {
            // InternalSML.g:8494:2: ( () otherlv_1= 'RangesForParameter' otherlv_2= '{' (otherlv_3= 'parameter' ( ( ruleEString ) ) )? (otherlv_5= 'ranges' ( (lv_ranges_6_0= ruleAbstractRanges ) ) )? otherlv_7= '}' )
            // InternalSML.g:8495:3: () otherlv_1= 'RangesForParameter' otherlv_2= '{' (otherlv_3= 'parameter' ( ( ruleEString ) ) )? (otherlv_5= 'ranges' ( (lv_ranges_6_0= ruleAbstractRanges ) ) )? otherlv_7= '}'
            {
            // InternalSML.g:8495:3: ()
            // InternalSML.g:8496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangesForParameterAccess().getRangesForParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,175,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRangesForParameterAccess().getRangesForParameterKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_198); 

            			newLeafNode(otherlv_2, grammarAccess.getRangesForParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:8510:3: (otherlv_3= 'parameter' ( ( ruleEString ) ) )?
            int alt241=2;
            int LA241_0 = input.LA(1);

            if ( (LA241_0==176) ) {
                alt241=1;
            }
            switch (alt241) {
                case 1 :
                    // InternalSML.g:8511:4: otherlv_3= 'parameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,176,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRangesForParameterAccess().getParameterKeyword_3_0());
                    			
                    // InternalSML.g:8515:4: ( ( ruleEString ) )
                    // InternalSML.g:8516:5: ( ruleEString )
                    {
                    // InternalSML.g:8516:5: ( ruleEString )
                    // InternalSML.g:8517:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRangesForParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRangesForParameterAccess().getParameterETypedElementCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_199);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:8532:3: (otherlv_5= 'ranges' ( (lv_ranges_6_0= ruleAbstractRanges ) ) )?
            int alt242=2;
            int LA242_0 = input.LA(1);

            if ( (LA242_0==177) ) {
                alt242=1;
            }
            switch (alt242) {
                case 1 :
                    // InternalSML.g:8533:4: otherlv_5= 'ranges' ( (lv_ranges_6_0= ruleAbstractRanges ) )
                    {
                    otherlv_5=(Token)match(input,177,FOLLOW_200); 

                    				newLeafNode(otherlv_5, grammarAccess.getRangesForParameterAccess().getRangesKeyword_4_0());
                    			
                    // InternalSML.g:8537:4: ( (lv_ranges_6_0= ruleAbstractRanges ) )
                    // InternalSML.g:8538:5: (lv_ranges_6_0= ruleAbstractRanges )
                    {
                    // InternalSML.g:8538:5: (lv_ranges_6_0= ruleAbstractRanges )
                    // InternalSML.g:8539:6: lv_ranges_6_0= ruleAbstractRanges
                    {

                    						newCompositeNode(grammarAccess.getRangesForParameterAccess().getRangesAbstractRangesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_ranges_6_0=ruleAbstractRanges();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangesForParameterRule());
                    						}
                    						set(
                    							current,
                    							"ranges",
                    							lv_ranges_6_0,
                    							"org.prettyprinter.sml.SML.AbstractRanges");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRangesForParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRangesForParameter"


    // $ANTLR start "entryRuleIntegerRanges"
    // InternalSML.g:8565:1: entryRuleIntegerRanges returns [EObject current=null] : iv_ruleIntegerRanges= ruleIntegerRanges EOF ;
    public final EObject entryRuleIntegerRanges() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerRanges = null;


        try {
            // InternalSML.g:8565:54: (iv_ruleIntegerRanges= ruleIntegerRanges EOF )
            // InternalSML.g:8566:2: iv_ruleIntegerRanges= ruleIntegerRanges EOF
            {
             newCompositeNode(grammarAccess.getIntegerRangesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerRanges=ruleIntegerRanges();

            state._fsp--;

             current =iv_ruleIntegerRanges; 
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
    // $ANTLR end "entryRuleIntegerRanges"


    // $ANTLR start "ruleIntegerRanges"
    // InternalSML.g:8572:1: ruleIntegerRanges returns [EObject current=null] : ( () otherlv_1= 'IntegerRanges' otherlv_2= '{' (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'values' otherlv_8= '{' ( (lv_values_9_0= ruleEInt ) ) (otherlv_10= ',' ( (lv_values_11_0= ruleEInt ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleIntegerRanges() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_min_4_0 = null;

        AntlrDatatypeRuleToken lv_max_6_0 = null;

        AntlrDatatypeRuleToken lv_values_9_0 = null;

        AntlrDatatypeRuleToken lv_values_11_0 = null;



        	enterRule();

        try {
            // InternalSML.g:8578:2: ( ( () otherlv_1= 'IntegerRanges' otherlv_2= '{' (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'values' otherlv_8= '{' ( (lv_values_9_0= ruleEInt ) ) (otherlv_10= ',' ( (lv_values_11_0= ruleEInt ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalSML.g:8579:2: ( () otherlv_1= 'IntegerRanges' otherlv_2= '{' (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'values' otherlv_8= '{' ( (lv_values_9_0= ruleEInt ) ) (otherlv_10= ',' ( (lv_values_11_0= ruleEInt ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalSML.g:8579:2: ( () otherlv_1= 'IntegerRanges' otherlv_2= '{' (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'values' otherlv_8= '{' ( (lv_values_9_0= ruleEInt ) ) (otherlv_10= ',' ( (lv_values_11_0= ruleEInt ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalSML.g:8580:3: () otherlv_1= 'IntegerRanges' otherlv_2= '{' (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'values' otherlv_8= '{' ( (lv_values_9_0= ruleEInt ) ) (otherlv_10= ',' ( (lv_values_11_0= ruleEInt ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalSML.g:8580:3: ()
            // InternalSML.g:8581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerRangesAccess().getIntegerRangesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,178,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerRangesAccess().getIntegerRangesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_201); 

            			newLeafNode(otherlv_2, grammarAccess.getIntegerRangesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:8595:3: (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )?
            int alt243=2;
            int LA243_0 = input.LA(1);

            if ( (LA243_0==179) ) {
                alt243=1;
            }
            switch (alt243) {
                case 1 :
                    // InternalSML.g:8596:4: otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,179,FOLLOW_126); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerRangesAccess().getMinKeyword_3_0());
                    			
                    // InternalSML.g:8600:4: ( (lv_min_4_0= ruleEInt ) )
                    // InternalSML.g:8601:5: (lv_min_4_0= ruleEInt )
                    {
                    // InternalSML.g:8601:5: (lv_min_4_0= ruleEInt )
                    // InternalSML.g:8602:6: lv_min_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntegerRangesAccess().getMinEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_202);
                    lv_min_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerRangesRule());
                    						}
                    						set(
                    							current,
                    							"min",
                    							lv_min_4_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:8620:3: (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )?
            int alt244=2;
            int LA244_0 = input.LA(1);

            if ( (LA244_0==180) ) {
                alt244=1;
            }
            switch (alt244) {
                case 1 :
                    // InternalSML.g:8621:4: otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,180,FOLLOW_126); 

                    				newLeafNode(otherlv_5, grammarAccess.getIntegerRangesAccess().getMaxKeyword_4_0());
                    			
                    // InternalSML.g:8625:4: ( (lv_max_6_0= ruleEInt ) )
                    // InternalSML.g:8626:5: (lv_max_6_0= ruleEInt )
                    {
                    // InternalSML.g:8626:5: (lv_max_6_0= ruleEInt )
                    // InternalSML.g:8627:6: lv_max_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntegerRangesAccess().getMaxEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_203);
                    lv_max_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerRangesRule());
                    						}
                    						set(
                    							current,
                    							"max",
                    							lv_max_6_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:8645:3: (otherlv_7= 'values' otherlv_8= '{' ( (lv_values_9_0= ruleEInt ) ) (otherlv_10= ',' ( (lv_values_11_0= ruleEInt ) ) )* otherlv_12= '}' )?
            int alt246=2;
            int LA246_0 = input.LA(1);

            if ( (LA246_0==181) ) {
                alt246=1;
            }
            switch (alt246) {
                case 1 :
                    // InternalSML.g:8646:4: otherlv_7= 'values' otherlv_8= '{' ( (lv_values_9_0= ruleEInt ) ) (otherlv_10= ',' ( (lv_values_11_0= ruleEInt ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,181,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getIntegerRangesAccess().getValuesKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_126); 

                    				newLeafNode(otherlv_8, grammarAccess.getIntegerRangesAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSML.g:8654:4: ( (lv_values_9_0= ruleEInt ) )
                    // InternalSML.g:8655:5: (lv_values_9_0= ruleEInt )
                    {
                    // InternalSML.g:8655:5: (lv_values_9_0= ruleEInt )
                    // InternalSML.g:8656:6: lv_values_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntegerRangesAccess().getValuesEIntParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_values_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerRangesRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_9_0,
                    							"org.prettyprinter.sml.SML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:8673:4: (otherlv_10= ',' ( (lv_values_11_0= ruleEInt ) ) )*
                    loop245:
                    do {
                        int alt245=2;
                        int LA245_0 = input.LA(1);

                        if ( (LA245_0==15) ) {
                            alt245=1;
                        }


                        switch (alt245) {
                    	case 1 :
                    	    // InternalSML.g:8674:5: otherlv_10= ',' ( (lv_values_11_0= ruleEInt ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_126); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getIntegerRangesAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSML.g:8678:5: ( (lv_values_11_0= ruleEInt ) )
                    	    // InternalSML.g:8679:6: (lv_values_11_0= ruleEInt )
                    	    {
                    	    // InternalSML.g:8679:6: (lv_values_11_0= ruleEInt )
                    	    // InternalSML.g:8680:7: lv_values_11_0= ruleEInt
                    	    {

                    	    							newCompositeNode(grammarAccess.getIntegerRangesAccess().getValuesEIntParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_values_11_0=ruleEInt();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIntegerRangesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_11_0,
                    	    								"org.prettyprinter.sml.SML.EInt");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop245;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getIntegerRangesAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getIntegerRangesAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleIntegerRanges"


    // $ANTLR start "entryRuleStringRanges"
    // InternalSML.g:8711:1: entryRuleStringRanges returns [EObject current=null] : iv_ruleStringRanges= ruleStringRanges EOF ;
    public final EObject entryRuleStringRanges() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringRanges = null;


        try {
            // InternalSML.g:8711:53: (iv_ruleStringRanges= ruleStringRanges EOF )
            // InternalSML.g:8712:2: iv_ruleStringRanges= ruleStringRanges EOF
            {
             newCompositeNode(grammarAccess.getStringRangesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringRanges=ruleStringRanges();

            state._fsp--;

             current =iv_ruleStringRanges; 
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
    // $ANTLR end "entryRuleStringRanges"


    // $ANTLR start "ruleStringRanges"
    // InternalSML.g:8718:1: ruleStringRanges returns [EObject current=null] : ( () otherlv_1= 'StringRanges' otherlv_2= '{' (otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleStringRanges() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;



        	enterRule();

        try {
            // InternalSML.g:8724:2: ( ( () otherlv_1= 'StringRanges' otherlv_2= '{' (otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSML.g:8725:2: ( () otherlv_1= 'StringRanges' otherlv_2= '{' (otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSML.g:8725:2: ( () otherlv_1= 'StringRanges' otherlv_2= '{' (otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSML.g:8726:3: () otherlv_1= 'StringRanges' otherlv_2= '{' (otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSML.g:8726:3: ()
            // InternalSML.g:8727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringRangesAccess().getStringRangesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,182,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStringRangesAccess().getStringRangesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_203); 

            			newLeafNode(otherlv_2, grammarAccess.getStringRangesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:8741:3: (otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt248=2;
            int LA248_0 = input.LA(1);

            if ( (LA248_0==181) ) {
                alt248=1;
            }
            switch (alt248) {
                case 1 :
                    // InternalSML.g:8742:4: otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,181,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringRangesAccess().getValuesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getStringRangesAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSML.g:8750:4: ( (lv_values_5_0= ruleEString ) )
                    // InternalSML.g:8751:5: (lv_values_5_0= ruleEString )
                    {
                    // InternalSML.g:8751:5: (lv_values_5_0= ruleEString )
                    // InternalSML.g:8752:6: lv_values_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStringRangesAccess().getValuesEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_values_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringRangesRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_5_0,
                    							"org.prettyprinter.sml.SML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:8769:4: (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )*
                    loop247:
                    do {
                        int alt247=2;
                        int LA247_0 = input.LA(1);

                        if ( (LA247_0==15) ) {
                            alt247=1;
                        }


                        switch (alt247) {
                    	case 1 :
                    	    // InternalSML.g:8770:5: otherlv_6= ',' ( (lv_values_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getStringRangesAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSML.g:8774:5: ( (lv_values_7_0= ruleEString ) )
                    	    // InternalSML.g:8775:6: (lv_values_7_0= ruleEString )
                    	    {
                    	    // InternalSML.g:8775:6: (lv_values_7_0= ruleEString )
                    	    // InternalSML.g:8776:7: lv_values_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getStringRangesAccess().getValuesEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_values_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStringRangesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_7_0,
                    	    								"org.prettyprinter.sml.SML.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop247;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getStringRangesAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getStringRangesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleStringRanges"


    // $ANTLR start "entryRuleEnumRanges"
    // InternalSML.g:8807:1: entryRuleEnumRanges returns [EObject current=null] : iv_ruleEnumRanges= ruleEnumRanges EOF ;
    public final EObject entryRuleEnumRanges() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumRanges = null;


        try {
            // InternalSML.g:8807:51: (iv_ruleEnumRanges= ruleEnumRanges EOF )
            // InternalSML.g:8808:2: iv_ruleEnumRanges= ruleEnumRanges EOF
            {
             newCompositeNode(grammarAccess.getEnumRangesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumRanges=ruleEnumRanges();

            state._fsp--;

             current =iv_ruleEnumRanges; 
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
    // $ANTLR end "entryRuleEnumRanges"


    // $ANTLR start "ruleEnumRanges"
    // InternalSML.g:8814:1: ruleEnumRanges returns [EObject current=null] : ( () otherlv_1= 'EnumRanges' otherlv_2= '{' (otherlv_3= 'values' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) ;
    public final EObject ruleEnumRanges() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalSML.g:8820:2: ( ( () otherlv_1= 'EnumRanges' otherlv_2= '{' (otherlv_3= 'values' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) )
            // InternalSML.g:8821:2: ( () otherlv_1= 'EnumRanges' otherlv_2= '{' (otherlv_3= 'values' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            {
            // InternalSML.g:8821:2: ( () otherlv_1= 'EnumRanges' otherlv_2= '{' (otherlv_3= 'values' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            // InternalSML.g:8822:3: () otherlv_1= 'EnumRanges' otherlv_2= '{' (otherlv_3= 'values' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}'
            {
            // InternalSML.g:8822:3: ()
            // InternalSML.g:8823:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumRangesAccess().getEnumRangesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,183,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumRangesAccess().getEnumRangesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_203); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumRangesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:8837:3: (otherlv_3= 'values' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt250=2;
            int LA250_0 = input.LA(1);

            if ( (LA250_0==181) ) {
                alt250=1;
            }
            switch (alt250) {
                case 1 :
                    // InternalSML.g:8838:4: otherlv_3= 'values' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,181,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumRangesAccess().getValuesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnumRangesAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSML.g:8846:4: ( ( ruleEString ) )
                    // InternalSML.g:8847:5: ( ruleEString )
                    {
                    // InternalSML.g:8847:5: ( ruleEString )
                    // InternalSML.g:8848:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumRangesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEnumRangesAccess().getValuesEEnumLiteralCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSML.g:8862:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop249:
                    do {
                        int alt249=2;
                        int LA249_0 = input.LA(1);

                        if ( (LA249_0==15) ) {
                            alt249=1;
                        }


                        switch (alt249) {
                    	case 1 :
                    	    // InternalSML.g:8863:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEnumRangesAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSML.g:8867:5: ( ( ruleEString ) )
                    	    // InternalSML.g:8868:6: ( ruleEString )
                    	    {
                    	    // InternalSML.g:8868:6: ( ruleEString )
                    	    // InternalSML.g:8869:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEnumRangesRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEnumRangesAccess().getValuesEEnumLiteralCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop249;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnumRangesAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEnumRangesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEnumRanges"


    // $ANTLR start "entryRuleMessageChannel"
    // InternalSML.g:8897:1: entryRuleMessageChannel returns [EObject current=null] : iv_ruleMessageChannel= ruleMessageChannel EOF ;
    public final EObject entryRuleMessageChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageChannel = null;


        try {
            // InternalSML.g:8897:55: (iv_ruleMessageChannel= ruleMessageChannel EOF )
            // InternalSML.g:8898:2: iv_ruleMessageChannel= ruleMessageChannel EOF
            {
             newCompositeNode(grammarAccess.getMessageChannelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageChannel=ruleMessageChannel();

            state._fsp--;

             current =iv_ruleMessageChannel; 
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
    // $ANTLR end "entryRuleMessageChannel"


    // $ANTLR start "ruleMessageChannel"
    // InternalSML.g:8904:1: ruleMessageChannel returns [EObject current=null] : ( () otherlv_1= 'MessageChannel' otherlv_2= '{' (otherlv_3= 'event' ( ( ruleEString ) ) )? (otherlv_5= 'channelFeature' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleMessageChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSML.g:8910:2: ( ( () otherlv_1= 'MessageChannel' otherlv_2= '{' (otherlv_3= 'event' ( ( ruleEString ) ) )? (otherlv_5= 'channelFeature' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalSML.g:8911:2: ( () otherlv_1= 'MessageChannel' otherlv_2= '{' (otherlv_3= 'event' ( ( ruleEString ) ) )? (otherlv_5= 'channelFeature' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalSML.g:8911:2: ( () otherlv_1= 'MessageChannel' otherlv_2= '{' (otherlv_3= 'event' ( ( ruleEString ) ) )? (otherlv_5= 'channelFeature' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalSML.g:8912:3: () otherlv_1= 'MessageChannel' otherlv_2= '{' (otherlv_3= 'event' ( ( ruleEString ) ) )? (otherlv_5= 'channelFeature' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalSML.g:8912:3: ()
            // InternalSML.g:8913:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageChannelAccess().getMessageChannelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,184,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageChannelAccess().getMessageChannelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_204); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageChannelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSML.g:8927:3: (otherlv_3= 'event' ( ( ruleEString ) ) )?
            int alt251=2;
            int LA251_0 = input.LA(1);

            if ( (LA251_0==47) ) {
                alt251=1;
            }
            switch (alt251) {
                case 1 :
                    // InternalSML.g:8928:4: otherlv_3= 'event' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMessageChannelAccess().getEventKeyword_3_0());
                    			
                    // InternalSML.g:8932:4: ( ( ruleEString ) )
                    // InternalSML.g:8933:5: ( ruleEString )
                    {
                    // InternalSML.g:8933:5: ( ruleEString )
                    // InternalSML.g:8934:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageChannelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageChannelAccess().getEventETypedElementCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_205);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSML.g:8949:3: (otherlv_5= 'channelFeature' ( ( ruleEString ) ) )?
            int alt252=2;
            int LA252_0 = input.LA(1);

            if ( (LA252_0==185) ) {
                alt252=1;
            }
            switch (alt252) {
                case 1 :
                    // InternalSML.g:8950:4: otherlv_5= 'channelFeature' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,185,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessageChannelAccess().getChannelFeatureKeyword_4_0());
                    			
                    // InternalSML.g:8954:4: ( ( ruleEString ) )
                    // InternalSML.g:8955:5: ( ruleEString )
                    {
                    // InternalSML.g:8955:5: ( ruleEString )
                    // InternalSML.g:8956:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageChannelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageChannelAccess().getChannelFeatureEStructuralFeatureCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMessageChannelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMessageChannel"


    // $ANTLR start "ruleExpectationKind"
    // InternalSML.g:8979:1: ruleExpectationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'eventually' ) | (enumLiteral_2= 'urgent' ) | (enumLiteral_3= 'requested' ) | (enumLiteral_4= 'committed' ) ) ;
    public final Enumerator ruleExpectationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSML.g:8985:2: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'eventually' ) | (enumLiteral_2= 'urgent' ) | (enumLiteral_3= 'requested' ) | (enumLiteral_4= 'committed' ) ) )
            // InternalSML.g:8986:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'eventually' ) | (enumLiteral_2= 'urgent' ) | (enumLiteral_3= 'requested' ) | (enumLiteral_4= 'committed' ) )
            {
            // InternalSML.g:8986:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'eventually' ) | (enumLiteral_2= 'urgent' ) | (enumLiteral_3= 'requested' ) | (enumLiteral_4= 'committed' ) )
            int alt253=5;
            switch ( input.LA(1) ) {
            case 186:
                {
                alt253=1;
                }
                break;
            case 187:
                {
                alt253=2;
                }
                break;
            case 188:
                {
                alt253=3;
                }
                break;
            case 76:
                {
                alt253=4;
                }
                break;
            case 189:
                {
                alt253=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 253, 0, input);

                throw nvae;
            }

            switch (alt253) {
                case 1 :
                    // InternalSML.g:8987:3: (enumLiteral_0= 'none' )
                    {
                    // InternalSML.g:8987:3: (enumLiteral_0= 'none' )
                    // InternalSML.g:8988:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,186,FOLLOW_2); 

                    				current = grammarAccess.getExpectationKindAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getExpectationKindAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSML.g:8995:3: (enumLiteral_1= 'eventually' )
                    {
                    // InternalSML.g:8995:3: (enumLiteral_1= 'eventually' )
                    // InternalSML.g:8996:4: enumLiteral_1= 'eventually'
                    {
                    enumLiteral_1=(Token)match(input,187,FOLLOW_2); 

                    				current = grammarAccess.getExpectationKindAccess().getEventuallyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getExpectationKindAccess().getEventuallyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSML.g:9003:3: (enumLiteral_2= 'urgent' )
                    {
                    // InternalSML.g:9003:3: (enumLiteral_2= 'urgent' )
                    // InternalSML.g:9004:4: enumLiteral_2= 'urgent'
                    {
                    enumLiteral_2=(Token)match(input,188,FOLLOW_2); 

                    				current = grammarAccess.getExpectationKindAccess().getUrgentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getExpectationKindAccess().getUrgentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSML.g:9011:3: (enumLiteral_3= 'requested' )
                    {
                    // InternalSML.g:9011:3: (enumLiteral_3= 'requested' )
                    // InternalSML.g:9012:4: enumLiteral_3= 'requested'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getExpectationKindAccess().getRequestedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getExpectationKindAccess().getRequestedEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSML.g:9019:3: (enumLiteral_4= 'committed' )
                    {
                    // InternalSML.g:9019:3: (enumLiteral_4= 'committed' )
                    // InternalSML.g:9020:4: enumLiteral_4= 'committed'
                    {
                    enumLiteral_4=(Token)match(input,189,FOLLOW_2); 

                    				current = grammarAccess.getExpectationKindAccess().getCommittedEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getExpectationKindAccess().getCommittedEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleExpectationKind"


    // $ANTLR start "ruleScenarioKind"
    // InternalSML.g:9030:1: ruleScenarioKind returns [Enumerator current=null] : ( (enumLiteral_0= 'assumption' ) | (enumLiteral_1= 'guarantee' ) | (enumLiteral_2= 'existential' ) ) ;
    public final Enumerator ruleScenarioKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSML.g:9036:2: ( ( (enumLiteral_0= 'assumption' ) | (enumLiteral_1= 'guarantee' ) | (enumLiteral_2= 'existential' ) ) )
            // InternalSML.g:9037:2: ( (enumLiteral_0= 'assumption' ) | (enumLiteral_1= 'guarantee' ) | (enumLiteral_2= 'existential' ) )
            {
            // InternalSML.g:9037:2: ( (enumLiteral_0= 'assumption' ) | (enumLiteral_1= 'guarantee' ) | (enumLiteral_2= 'existential' ) )
            int alt254=3;
            switch ( input.LA(1) ) {
            case 190:
                {
                alt254=1;
                }
                break;
            case 191:
                {
                alt254=2;
                }
                break;
            case 192:
                {
                alt254=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 254, 0, input);

                throw nvae;
            }

            switch (alt254) {
                case 1 :
                    // InternalSML.g:9038:3: (enumLiteral_0= 'assumption' )
                    {
                    // InternalSML.g:9038:3: (enumLiteral_0= 'assumption' )
                    // InternalSML.g:9039:4: enumLiteral_0= 'assumption'
                    {
                    enumLiteral_0=(Token)match(input,190,FOLLOW_2); 

                    				current = grammarAccess.getScenarioKindAccess().getAssumptionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getScenarioKindAccess().getAssumptionEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSML.g:9046:3: (enumLiteral_1= 'guarantee' )
                    {
                    // InternalSML.g:9046:3: (enumLiteral_1= 'guarantee' )
                    // InternalSML.g:9047:4: enumLiteral_1= 'guarantee'
                    {
                    enumLiteral_1=(Token)match(input,191,FOLLOW_2); 

                    				current = grammarAccess.getScenarioKindAccess().getGuaranteeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getScenarioKindAccess().getGuaranteeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSML.g:9054:3: (enumLiteral_2= 'existential' )
                    {
                    // InternalSML.g:9054:3: (enumLiteral_2= 'existential' )
                    // InternalSML.g:9055:4: enumLiteral_2= 'existential'
                    {
                    enumLiteral_2=(Token)match(input,192,FOLLOW_2); 

                    				current = grammarAccess.getScenarioKindAccess().getExistentialEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getScenarioKindAccess().getExistentialEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleScenarioKind"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\64\1\uffff\1\75\4\uffff\1\74\11\uffff";
    static final String dfa_3s = "\1\130\1\uffff\1\127\4\uffff\1\127\11\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\7\uffff\1\2\2\3\6\uffff\1\4\1\uffff\1\5\2\uffff\1\6\1\uffff\1\7\1\10\1\uffff\1\11\1\12\1\13\1\14\1\uffff\1\15\1\uffff\1\16\1\17\1\20",
            "",
            "\2\3\15\uffff\2\10\11\uffff\1\17",
            "",
            "",
            "",
            "",
            "\1\17\20\uffff\1\10\11\uffff\1\17",
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

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "712:2: (this_Interaction_0= ruleInteraction | this_ModalMessage_1= ruleModalMessage | this_Alternative_2= ruleAlternative | this_Loop_3= ruleLoop | this_Parallel_4= ruleParallel | this_WaitCondition_5= ruleWaitCondition | this_InterruptCondition_6= ruleInterruptCondition | this_ViolationCondition_7= ruleViolationCondition | this_Condition_8= ruleCondition | this_VariableFragment_9= ruleVariableFragment | this_TimedViolationCondition_10= ruleTimedViolationCondition | this_TimedInterruptCondition_11= ruleTimedInterruptCondition | this_TimedWaitCondition_12= ruleTimedWaitCondition | this_ClockFragment_13= ruleClockFragment )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003FE2000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003FE0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003FC0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0010000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001F0400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001E0400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001C0400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000E00000000L,0x00000A0000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000007F040400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000007E040400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000007C040400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000078040400000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000078000400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000070000400000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000060000400000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000300FC0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000300000622000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000300000620000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000300000600000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000300000400000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x000000000E000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001800000400000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000000400000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0060000000400000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x7010000004000000L,0x0000000001D7B4A0L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0040000000400000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0F00000000400000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x7000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0E00000000400000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0C00000000400000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0800000000400000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x8000000000400000L,0x000000000000001FL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000400000L,0x000000000000001FL});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x3C00000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000400000L,0x000000000000001EL});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000018L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000010L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000040L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000300L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000200L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000800L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000400000L,0x0000000000004000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000400000L,0x0000000000080000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000400000L,0x0000000000200000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x1000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000400000L,0x0000000010000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000400000L,0x0000000040000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x9400000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000040400000L,0x0000007800000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000040400000L,0x0000007000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000040400000L,0x0000006000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000400000L,0x0000006000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000400000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000040400000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000400000L,0x0000010000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x000000B040400000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x000000A040400000L,0x0000040000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000008040400000L,0x0000040000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000008040400000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000008000400000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x000000B040400000L,0x0000140000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x000000A040400000L,0x0000140000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000008040400000L,0x0000140000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000008040400000L,0x0000100000000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000008000400000L,0x0000100000000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000400000L,0x0000100000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000400000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000400000L,0x0000800000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000400000L,0x007C000000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000400000L,0x0078000000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000400000L,0x0070000000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000400000L,0x0060000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000400000L,0x0040000000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000040400000L,0x0100800000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000040L,0x0200000000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000040400000L,0x0100000000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000400000L,0x0800000000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000400000L,0x6000000000000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000400000L,0x4000000000000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000400000L,0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000000FF000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000000FE000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000000FC000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000000F8000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000300380L});
    public static final BitSet FOLLOW_151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000300300L});
    public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000300200L});
    public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_155 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x0000000001CFF000L});
    public static final BitSet FOLLOW_156 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x0000000001CFE000L});
    public static final BitSet FOLLOW_157 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x0000000001CFC000L});
    public static final BitSet FOLLOW_158 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x0000000001CF8000L});
    public static final BitSet FOLLOW_159 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x0000000001CF0000L});
    public static final BitSet FOLLOW_160 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x0000000001CE0000L});
    public static final BitSet FOLLOW_161 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x0000000001CC0000L});
    public static final BitSet FOLLOW_162 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000018C0000L});
    public static final BitSet FOLLOW_163 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x0000000001880000L});
    public static final BitSet FOLLOW_164 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_165 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_166 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_167 = new BitSet(new long[]{0x8000000000400000L,0x000000000000001EL});
    public static final BitSet FOLLOW_168 = new BitSet(new long[]{0x0000008040400000L,0x0000000000000000L,0x00000003800CF000L});
    public static final BitSet FOLLOW_169 = new BitSet(new long[]{0x0000008040400000L,0x0000000000000000L,0x00000003800CE000L});
    public static final BitSet FOLLOW_170 = new BitSet(new long[]{0x0000008040400000L,0x0000000000000000L,0x00000003800CC000L});
    public static final BitSet FOLLOW_171 = new BitSet(new long[]{0x0000008040400000L,0x0000000000000000L,0x00000003800C8000L});
    public static final BitSet FOLLOW_172 = new BitSet(new long[]{0x0000008040400000L,0x0000000000000000L,0x00000003800C0000L});
    public static final BitSet FOLLOW_173 = new BitSet(new long[]{0x0000008040400000L,0x0000000000000000L,0x0000000380080000L});
    public static final BitSet FOLLOW_174 = new BitSet(new long[]{0x0000008040400000L,0x0000000000000000L,0x0000000300080000L});
    public static final BitSet FOLLOW_175 = new BitSet(new long[]{0x0000008000400000L,0x0000000000000000L,0x0000000300080000L});
    public static final BitSet FOLLOW_176 = new BitSet(new long[]{0x0000008000400000L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_177 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_179 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_180 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000000CF000L});
    public static final BitSet FOLLOW_181 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000000CE000L});
    public static final BitSet FOLLOW_182 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000000CC000L});
    public static final BitSet FOLLOW_183 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000000L,0x00000000000C8000L});
    public static final BitSet FOLLOW_184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_189 = new BitSet(new long[]{0x0000000000000040L,0x0200000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_190 = new BitSet(new long[]{0x0000000000420000L,0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_191 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_193 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_194 = new BitSet(new long[]{0x0000000000400000L,0x0000000040000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_195 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_197 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_198 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_199 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00C4000000000000L});
    public static final BitSet FOLLOW_201 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0038000000000000L});
    public static final BitSet FOLLOW_202 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_203 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_204 = new BitSet(new long[]{0x0000800000400000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_205 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0200000000000000L});

}