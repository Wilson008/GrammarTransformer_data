package org.xtext.example.mydot.parser.antlr.internal;

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
import org.xtext.example.mydot.services.MyDotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_COMPASS_PT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'strict'", "'{'", "'}'", "'='", "'subgraph'", "'['", "','", "']'", "':'", "'graph'", "'digraph'", "'->'", "'--'", "'node'", "'edge'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_COMPASS_PT=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDot.g"; }



     	private MyDotGrammarAccess grammarAccess;

        public InternalMyDotParser(TokenStream input, MyDotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DotAst";
       	}

       	@Override
       	protected MyDotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDotAst"
    // InternalMyDot.g:65:1: entryRuleDotAst returns [EObject current=null] : iv_ruleDotAst= ruleDotAst EOF ;
    public final EObject entryRuleDotAst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotAst = null;


        try {
            // InternalMyDot.g:65:47: (iv_ruleDotAst= ruleDotAst EOF )
            // InternalMyDot.g:66:2: iv_ruleDotAst= ruleDotAst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotAstRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDotAst=ruleDotAst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotAst; 
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
    // $ANTLR end "entryRuleDotAst"


    // $ANTLR start "ruleDotAst"
    // InternalMyDot.g:72:1: ruleDotAst returns [EObject current=null] : ( () ( (lv_graphs_1_0= ruleDotGraph ) )* ) ;
    public final EObject ruleDotAst() throws RecognitionException {
        EObject current = null;

        EObject lv_graphs_1_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:78:2: ( ( () ( (lv_graphs_1_0= ruleDotGraph ) )* ) )
            // InternalMyDot.g:79:2: ( () ( (lv_graphs_1_0= ruleDotGraph ) )* )
            {
            // InternalMyDot.g:79:2: ( () ( (lv_graphs_1_0= ruleDotGraph ) )* )
            // InternalMyDot.g:80:3: () ( (lv_graphs_1_0= ruleDotGraph ) )*
            {
            // InternalMyDot.g:80:3: ()
            // InternalMyDot.g:81:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDotAstAccess().getDotAstAction_0(),
              					current);
              			
            }

            }

            // InternalMyDot.g:87:3: ( (lv_graphs_1_0= ruleDotGraph ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDot.g:88:4: (lv_graphs_1_0= ruleDotGraph )
            	    {
            	    // InternalMyDot.g:88:4: (lv_graphs_1_0= ruleDotGraph )
            	    // InternalMyDot.g:89:5: lv_graphs_1_0= ruleDotGraph
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDotAstAccess().getGraphsDotGraphParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_graphs_1_0=ruleDotGraph();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDotAstRule());
            	      					}
            	      					add(
            	      						current,
            	      						"graphs",
            	      						lv_graphs_1_0,
            	      						"org.xtext.example.mydot.MyDot.DotGraph");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleDotAst"


    // $ANTLR start "entryRuleStmt"
    // InternalMyDot.g:110:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // InternalMyDot.g:110:45: (iv_ruleStmt= ruleStmt EOF )
            // InternalMyDot.g:111:2: iv_ruleStmt= ruleStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStmt=ruleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmt; 
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
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalMyDot.g:117:1: ruleStmt returns [EObject current=null] : ( (this_EdgeStmtNode_0= ruleEdgeStmtNode | this_NodeStmt_1= ruleNodeStmt | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph ) (otherlv_5= ';' )? ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_EdgeStmtNode_0 = null;

        EObject this_NodeStmt_1 = null;

        EObject this_AttrStmt_2 = null;

        EObject this_Attribute_3 = null;

        EObject this_SubgraphOrEdgeStmtSubgraph_4 = null;



        	enterRule();

        try {
            // InternalMyDot.g:123:2: ( ( (this_EdgeStmtNode_0= ruleEdgeStmtNode | this_NodeStmt_1= ruleNodeStmt | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph ) (otherlv_5= ';' )? ) )
            // InternalMyDot.g:124:2: ( (this_EdgeStmtNode_0= ruleEdgeStmtNode | this_NodeStmt_1= ruleNodeStmt | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph ) (otherlv_5= ';' )? )
            {
            // InternalMyDot.g:124:2: ( (this_EdgeStmtNode_0= ruleEdgeStmtNode | this_NodeStmt_1= ruleNodeStmt | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph ) (otherlv_5= ';' )? )
            // InternalMyDot.g:125:3: (this_EdgeStmtNode_0= ruleEdgeStmtNode | this_NodeStmt_1= ruleNodeStmt | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph ) (otherlv_5= ';' )?
            {
            // InternalMyDot.g:125:3: (this_EdgeStmtNode_0= ruleEdgeStmtNode | this_NodeStmt_1= ruleNodeStmt | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDot.g:126:4: this_EdgeStmtNode_0= ruleEdgeStmtNode
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStmtAccess().getEdgeStmtNodeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_EdgeStmtNode_0=ruleEdgeStmtNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_EdgeStmtNode_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDot.g:135:4: this_NodeStmt_1= ruleNodeStmt
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStmtAccess().getNodeStmtParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_NodeStmt_1=ruleNodeStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_NodeStmt_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDot.g:144:4: this_AttrStmt_2= ruleAttrStmt
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStmtAccess().getAttrStmtParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_AttrStmt_2=ruleAttrStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_AttrStmt_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDot.g:153:4: this_Attribute_3= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStmtAccess().getAttributeParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_Attribute_3=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Attribute_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDot.g:162:4: this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStmtAccess().getSubgraphOrEdgeStmtSubgraphParserRuleCall_0_4());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_SubgraphOrEdgeStmtSubgraph_4=ruleSubgraphOrEdgeStmtSubgraph();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SubgraphOrEdgeStmtSubgraph_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMyDot.g:171:3: (otherlv_5= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDot.g:172:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getStmtAccess().getSemicolonKeyword_1());
                      			
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
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleEdgeRhs"
    // InternalMyDot.g:181:1: entryRuleEdgeRhs returns [EObject current=null] : iv_ruleEdgeRhs= ruleEdgeRhs EOF ;
    public final EObject entryRuleEdgeRhs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeRhs = null;


        try {
            // InternalMyDot.g:181:48: (iv_ruleEdgeRhs= ruleEdgeRhs EOF )
            // InternalMyDot.g:182:2: iv_ruleEdgeRhs= ruleEdgeRhs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeRhsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEdgeRhs=ruleEdgeRhs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeRhs; 
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
    // $ANTLR end "entryRuleEdgeRhs"


    // $ANTLR start "ruleEdgeRhs"
    // InternalMyDot.g:188:1: ruleEdgeRhs returns [EObject current=null] : (this_EdgeRhsNode_0= ruleEdgeRhsNode | this_EdgeRhsSubgraph_1= ruleEdgeRhsSubgraph ) ;
    public final EObject ruleEdgeRhs() throws RecognitionException {
        EObject current = null;

        EObject this_EdgeRhsNode_0 = null;

        EObject this_EdgeRhsSubgraph_1 = null;



        	enterRule();

        try {
            // InternalMyDot.g:194:2: ( (this_EdgeRhsNode_0= ruleEdgeRhsNode | this_EdgeRhsSubgraph_1= ruleEdgeRhsSubgraph ) )
            // InternalMyDot.g:195:2: (this_EdgeRhsNode_0= ruleEdgeRhsNode | this_EdgeRhsSubgraph_1= ruleEdgeRhsSubgraph )
            {
            // InternalMyDot.g:195:2: (this_EdgeRhsNode_0= ruleEdgeRhsNode | this_EdgeRhsSubgraph_1= ruleEdgeRhsSubgraph )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else if ( (LA4_1==14||LA4_1==17) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==25) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==14||LA4_2==17) ) {
                    alt4=2;
                }
                else if ( (LA4_2==RULE_ID) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDot.g:196:3: this_EdgeRhsNode_0= ruleEdgeRhsNode
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEdgeRhsAccess().getEdgeRhsNodeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EdgeRhsNode_0=ruleEdgeRhsNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EdgeRhsNode_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDot.g:205:3: this_EdgeRhsSubgraph_1= ruleEdgeRhsSubgraph
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEdgeRhsAccess().getEdgeRhsSubgraphParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EdgeRhsSubgraph_1=ruleEdgeRhsSubgraph();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EdgeRhsSubgraph_1;
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
    // $ANTLR end "ruleEdgeRhs"


    // $ANTLR start "entryRuleDotGraph"
    // InternalMyDot.g:217:1: entryRuleDotGraph returns [EObject current=null] : iv_ruleDotGraph= ruleDotGraph EOF ;
    public final EObject entryRuleDotGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotGraph = null;


        try {
            // InternalMyDot.g:217:49: (iv_ruleDotGraph= ruleDotGraph EOF )
            // InternalMyDot.g:218:2: iv_ruleDotGraph= ruleDotGraph EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotGraphRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDotGraph=ruleDotGraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotGraph; 
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
    // $ANTLR end "entryRuleDotGraph"


    // $ANTLR start "ruleDotGraph"
    // InternalMyDot.g:224:1: ruleDotGraph returns [EObject current=null] : ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_type_2_0= ruleGraphType ) ) ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_stmts_5_0= ruleStmt ) )* otherlv_6= '}' ) ;
    public final EObject ruleDotGraph() throws RecognitionException {
        EObject current = null;

        Token lv_strict_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_stmts_5_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:230:2: ( ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_type_2_0= ruleGraphType ) ) ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_stmts_5_0= ruleStmt ) )* otherlv_6= '}' ) )
            // InternalMyDot.g:231:2: ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_type_2_0= ruleGraphType ) ) ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_stmts_5_0= ruleStmt ) )* otherlv_6= '}' )
            {
            // InternalMyDot.g:231:2: ( () ( (lv_strict_1_0= 'strict' ) )? ( (lv_type_2_0= ruleGraphType ) ) ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_stmts_5_0= ruleStmt ) )* otherlv_6= '}' )
            // InternalMyDot.g:232:3: () ( (lv_strict_1_0= 'strict' ) )? ( (lv_type_2_0= ruleGraphType ) ) ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_stmts_5_0= ruleStmt ) )* otherlv_6= '}'
            {
            // InternalMyDot.g:232:3: ()
            // InternalMyDot.g:233:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDotGraphAccess().getDotGraphAction_0(),
              					current);
              			
            }

            }

            // InternalMyDot.g:239:3: ( (lv_strict_1_0= 'strict' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDot.g:240:4: (lv_strict_1_0= 'strict' )
                    {
                    // InternalMyDot.g:240:4: (lv_strict_1_0= 'strict' )
                    // InternalMyDot.g:241:5: lv_strict_1_0= 'strict'
                    {
                    lv_strict_1_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_strict_1_0, grammarAccess.getDotGraphAccess().getStrictStrictKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDotGraphRule());
                      					}
                      					setWithLastConsumed(current, "strict", lv_strict_1_0 != null, "strict");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyDot.g:253:3: ( (lv_type_2_0= ruleGraphType ) )
            // InternalMyDot.g:254:4: (lv_type_2_0= ruleGraphType )
            {
            // InternalMyDot.g:254:4: (lv_type_2_0= ruleGraphType )
            // InternalMyDot.g:255:5: lv_type_2_0= ruleGraphType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDotGraphAccess().getTypeGraphTypeEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_type_2_0=ruleGraphType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDotGraphRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.example.mydot.MyDot.GraphType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDot.g:272:3: ( (lv_name_3_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDot.g:273:4: (lv_name_3_0= RULE_ID )
                    {
                    // InternalMyDot.g:273:4: (lv_name_3_0= RULE_ID )
                    // InternalMyDot.g:274:5: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_3_0, grammarAccess.getDotGraphAccess().getNameIDTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDotGraphRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_3_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMyDot.g:294:3: ( (lv_stmts_5_0= ruleStmt ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||LA7_0==14||LA7_0==17||LA7_0==22||(LA7_0>=26 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDot.g:295:4: (lv_stmts_5_0= ruleStmt )
            	    {
            	    // InternalMyDot.g:295:4: (lv_stmts_5_0= ruleStmt )
            	    // InternalMyDot.g:296:5: lv_stmts_5_0= ruleStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDotGraphAccess().getStmtsStmtParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_stmts_5_0=ruleStmt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	      					}
            	      					add(
            	      						current,
            	      						"stmts",
            	      						lv_stmts_5_0,
            	      						"org.xtext.example.mydot.MyDot.Stmt");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleDotGraph"


    // $ANTLR start "entryRuleEString"
    // InternalMyDot.g:321:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDot.g:321:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDot.g:322:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDot.g:328:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDot.g:334:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDot.g:335:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDot.g:335:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDot.g:336:3: this_STRING_0= RULE_STRING
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
                    // InternalMyDot.g:344:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEdgeStmtNode"
    // InternalMyDot.g:355:1: entryRuleEdgeStmtNode returns [EObject current=null] : iv_ruleEdgeStmtNode= ruleEdgeStmtNode EOF ;
    public final EObject entryRuleEdgeStmtNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeStmtNode = null;


        try {
            // InternalMyDot.g:355:53: (iv_ruleEdgeStmtNode= ruleEdgeStmtNode EOF )
            // InternalMyDot.g:356:2: iv_ruleEdgeStmtNode= ruleEdgeStmtNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeStmtNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEdgeStmtNode=ruleEdgeStmtNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeStmtNode; 
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
    // $ANTLR end "entryRuleEdgeStmtNode"


    // $ANTLR start "ruleEdgeStmtNode"
    // InternalMyDot.g:362:1: ruleEdgeStmtNode returns [EObject current=null] : ( () ( (lv_node_1_0= ruleNodeId ) ) ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* ) ;
    public final EObject ruleEdgeStmtNode() throws RecognitionException {
        EObject current = null;

        EObject lv_node_1_0 = null;

        EObject lv_edgeRHS_2_0 = null;

        EObject lv_attrLists_3_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:368:2: ( ( () ( (lv_node_1_0= ruleNodeId ) ) ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* ) )
            // InternalMyDot.g:369:2: ( () ( (lv_node_1_0= ruleNodeId ) ) ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )
            {
            // InternalMyDot.g:369:2: ( () ( (lv_node_1_0= ruleNodeId ) ) ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )
            // InternalMyDot.g:370:3: () ( (lv_node_1_0= ruleNodeId ) ) ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )*
            {
            // InternalMyDot.g:370:3: ()
            // InternalMyDot.g:371:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEdgeStmtNodeAccess().getEdgeStmtNodeAction_0(),
              					current);
              			
            }

            }

            // InternalMyDot.g:377:3: ( (lv_node_1_0= ruleNodeId ) )
            // InternalMyDot.g:378:4: (lv_node_1_0= ruleNodeId )
            {
            // InternalMyDot.g:378:4: (lv_node_1_0= ruleNodeId )
            // InternalMyDot.g:379:5: lv_node_1_0= ruleNodeId
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEdgeStmtNodeAccess().getNodeNodeIdParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_node_1_0=ruleNodeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEdgeStmtNodeRule());
              					}
              					set(
              						current,
              						"node",
              						lv_node_1_0,
              						"org.xtext.example.mydot.MyDot.NodeId");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDot.g:396:3: ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=24 && LA9_0<=25)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDot.g:397:4: (lv_edgeRHS_2_0= ruleEdgeRhs )
            	    {
            	    // InternalMyDot.g:397:4: (lv_edgeRHS_2_0= ruleEdgeRhs )
            	    // InternalMyDot.g:398:5: lv_edgeRHS_2_0= ruleEdgeRhs
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSEdgeRhsParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_edgeRHS_2_0=ruleEdgeRhs();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEdgeStmtNodeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"edgeRHS",
            	      						lv_edgeRHS_2_0,
            	      						"org.xtext.example.mydot.MyDot.EdgeRhs");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalMyDot.g:415:3: ( (lv_attrLists_3_0= ruleAttrList ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDot.g:416:4: (lv_attrLists_3_0= ruleAttrList )
            	    {
            	    // InternalMyDot.g:416:4: (lv_attrLists_3_0= ruleAttrList )
            	    // InternalMyDot.g:417:5: lv_attrLists_3_0= ruleAttrList
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEdgeStmtNodeAccess().getAttrListsAttrListParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_attrLists_3_0=ruleAttrList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEdgeStmtNodeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attrLists",
            	      						lv_attrLists_3_0,
            	      						"org.xtext.example.mydot.MyDot.AttrList");
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
    // $ANTLR end "ruleEdgeStmtNode"


    // $ANTLR start "entryRuleNodeStmt"
    // InternalMyDot.g:438:1: entryRuleNodeStmt returns [EObject current=null] : iv_ruleNodeStmt= ruleNodeStmt EOF ;
    public final EObject entryRuleNodeStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStmt = null;


        try {
            // InternalMyDot.g:438:49: (iv_ruleNodeStmt= ruleNodeStmt EOF )
            // InternalMyDot.g:439:2: iv_ruleNodeStmt= ruleNodeStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeStmt=ruleNodeStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeStmt; 
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
    // $ANTLR end "entryRuleNodeStmt"


    // $ANTLR start "ruleNodeStmt"
    // InternalMyDot.g:445:1: ruleNodeStmt returns [EObject current=null] : ( () ( (lv_node_1_0= ruleNodeId ) ) ( (lv_attrLists_2_0= ruleAttrList ) )* ) ;
    public final EObject ruleNodeStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_node_1_0 = null;

        EObject lv_attrLists_2_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:451:2: ( ( () ( (lv_node_1_0= ruleNodeId ) ) ( (lv_attrLists_2_0= ruleAttrList ) )* ) )
            // InternalMyDot.g:452:2: ( () ( (lv_node_1_0= ruleNodeId ) ) ( (lv_attrLists_2_0= ruleAttrList ) )* )
            {
            // InternalMyDot.g:452:2: ( () ( (lv_node_1_0= ruleNodeId ) ) ( (lv_attrLists_2_0= ruleAttrList ) )* )
            // InternalMyDot.g:453:3: () ( (lv_node_1_0= ruleNodeId ) ) ( (lv_attrLists_2_0= ruleAttrList ) )*
            {
            // InternalMyDot.g:453:3: ()
            // InternalMyDot.g:454:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNodeStmtAccess().getNodeStmtAction_0(),
              					current);
              			
            }

            }

            // InternalMyDot.g:460:3: ( (lv_node_1_0= ruleNodeId ) )
            // InternalMyDot.g:461:4: (lv_node_1_0= ruleNodeId )
            {
            // InternalMyDot.g:461:4: (lv_node_1_0= ruleNodeId )
            // InternalMyDot.g:462:5: lv_node_1_0= ruleNodeId
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNodeStmtAccess().getNodeNodeIdParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_node_1_0=ruleNodeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNodeStmtRule());
              					}
              					set(
              						current,
              						"node",
              						lv_node_1_0,
              						"org.xtext.example.mydot.MyDot.NodeId");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDot.g:479:3: ( (lv_attrLists_2_0= ruleAttrList ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDot.g:480:4: (lv_attrLists_2_0= ruleAttrList )
            	    {
            	    // InternalMyDot.g:480:4: (lv_attrLists_2_0= ruleAttrList )
            	    // InternalMyDot.g:481:5: lv_attrLists_2_0= ruleAttrList
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNodeStmtAccess().getAttrListsAttrListParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_attrLists_2_0=ruleAttrList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNodeStmtRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attrLists",
            	      						lv_attrLists_2_0,
            	      						"org.xtext.example.mydot.MyDot.AttrList");
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
    // $ANTLR end "ruleNodeStmt"


    // $ANTLR start "entryRuleAttrStmt"
    // InternalMyDot.g:502:1: entryRuleAttrStmt returns [EObject current=null] : iv_ruleAttrStmt= ruleAttrStmt EOF ;
    public final EObject entryRuleAttrStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrStmt = null;


        try {
            // InternalMyDot.g:502:49: (iv_ruleAttrStmt= ruleAttrStmt EOF )
            // InternalMyDot.g:503:2: iv_ruleAttrStmt= ruleAttrStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttrStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttrStmt=ruleAttrStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttrStmt; 
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
    // $ANTLR end "entryRuleAttrStmt"


    // $ANTLR start "ruleAttrStmt"
    // InternalMyDot.g:509:1: ruleAttrStmt returns [EObject current=null] : ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_attrLists_2_0= ruleAttrList ) )+ ) ;
    public final EObject ruleAttrStmt() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        EObject lv_attrLists_2_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:515:2: ( ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_attrLists_2_0= ruleAttrList ) )+ ) )
            // InternalMyDot.g:516:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_attrLists_2_0= ruleAttrList ) )+ )
            {
            // InternalMyDot.g:516:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_attrLists_2_0= ruleAttrList ) )+ )
            // InternalMyDot.g:517:3: () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_attrLists_2_0= ruleAttrList ) )+
            {
            // InternalMyDot.g:517:3: ()
            // InternalMyDot.g:518:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAttrStmtAccess().getAttrStmtAction_0(),
              					current);
              			
            }

            }

            // InternalMyDot.g:524:3: ( (lv_type_1_0= ruleAttributeType ) )
            // InternalMyDot.g:525:4: (lv_type_1_0= ruleAttributeType )
            {
            // InternalMyDot.g:525:4: (lv_type_1_0= ruleAttributeType )
            // InternalMyDot.g:526:5: lv_type_1_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttrStmtAccess().getTypeAttributeTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_type_1_0=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttrStmtRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"org.xtext.example.mydot.MyDot.AttributeType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDot.g:543:3: ( (lv_attrLists_2_0= ruleAttrList ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDot.g:544:4: (lv_attrLists_2_0= ruleAttrList )
            	    {
            	    // InternalMyDot.g:544:4: (lv_attrLists_2_0= ruleAttrList )
            	    // InternalMyDot.g:545:5: lv_attrLists_2_0= ruleAttrList
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAttrStmtAccess().getAttrListsAttrListParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_attrLists_2_0=ruleAttrList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAttrStmtRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attrLists",
            	      						lv_attrLists_2_0,
            	      						"org.xtext.example.mydot.MyDot.AttrList");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleAttrStmt"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDot.g:566:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDot.g:566:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDot.g:567:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDot.g:573:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:579:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalMyDot.g:580:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalMyDot.g:580:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalMyDot.g:581:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalMyDot.g:581:3: ()
            // InternalMyDot.g:582:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAttributeAccess().getAttributeAction_0(),
              					current);
              			
            }

            }

            // InternalMyDot.g:588:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDot.g:589:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDot.g:589:4: (lv_name_1_0= ruleEString )
            // InternalMyDot.g:590:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.mydot.MyDot.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalMyDot.g:611:3: ( (lv_value_3_0= ruleEString ) )
            // InternalMyDot.g:612:4: (lv_value_3_0= ruleEString )
            {
            // InternalMyDot.g:612:4: (lv_value_3_0= ruleEString )
            // InternalMyDot.g:613:5: lv_value_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getValueEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"org.xtext.example.mydot.MyDot.EString");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleSubgraphOrEdgeStmtSubgraph"
    // InternalMyDot.g:634:1: entryRuleSubgraphOrEdgeStmtSubgraph returns [EObject current=null] : iv_ruleSubgraphOrEdgeStmtSubgraph= ruleSubgraphOrEdgeStmtSubgraph EOF ;
    public final EObject entryRuleSubgraphOrEdgeStmtSubgraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubgraphOrEdgeStmtSubgraph = null;


        try {
            // InternalMyDot.g:634:67: (iv_ruleSubgraphOrEdgeStmtSubgraph= ruleSubgraphOrEdgeStmtSubgraph EOF )
            // InternalMyDot.g:635:2: iv_ruleSubgraphOrEdgeStmtSubgraph= ruleSubgraphOrEdgeStmtSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubgraphOrEdgeStmtSubgraphRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubgraphOrEdgeStmtSubgraph=ruleSubgraphOrEdgeStmtSubgraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubgraphOrEdgeStmtSubgraph; 
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
    // $ANTLR end "entryRuleSubgraphOrEdgeStmtSubgraph"


    // $ANTLR start "ruleSubgraphOrEdgeStmtSubgraph"
    // InternalMyDot.g:641:1: ruleSubgraphOrEdgeStmtSubgraph returns [EObject current=null] : (this_Subgraph_0= ruleSubgraph ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )? ) ;
    public final EObject ruleSubgraphOrEdgeStmtSubgraph() throws RecognitionException {
        EObject current = null;

        EObject this_Subgraph_0 = null;

        EObject lv_edgeRHS_2_0 = null;

        EObject lv_attrLists_3_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:647:2: ( (this_Subgraph_0= ruleSubgraph ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )? ) )
            // InternalMyDot.g:648:2: (this_Subgraph_0= ruleSubgraph ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )? )
            {
            // InternalMyDot.g:648:2: (this_Subgraph_0= ruleSubgraph ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )? )
            // InternalMyDot.g:649:3: this_Subgraph_0= ruleSubgraph ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getSubgraphParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_Subgraph_0=ruleSubgraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Subgraph_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDot.g:657:3: ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=24 && LA15_0<=25)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDot.g:658:4: () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )*
                    {
                    // InternalMyDot.g:658:4: ()
                    // InternalMyDot.g:659:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeStmtSubgraphSubgraphAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyDot.g:665:4: ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=24 && LA13_0<=25)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDot.g:666:5: (lv_edgeRHS_2_0= ruleEdgeRhs )
                    	    {
                    	    // InternalMyDot.g:666:5: (lv_edgeRHS_2_0= ruleEdgeRhs )
                    	    // InternalMyDot.g:667:6: lv_edgeRHS_2_0= ruleEdgeRhs
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSEdgeRhsParserRuleCall_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_edgeRHS_2_0=ruleEdgeRhs();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getSubgraphOrEdgeStmtSubgraphRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"edgeRHS",
                    	      							lv_edgeRHS_2_0,
                    	      							"org.xtext.example.mydot.MyDot.EdgeRhs");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    // InternalMyDot.g:684:4: ( (lv_attrLists_3_0= ruleAttrList ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==18) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDot.g:685:5: (lv_attrLists_3_0= ruleAttrList )
                    	    {
                    	    // InternalMyDot.g:685:5: (lv_attrLists_3_0= ruleAttrList )
                    	    // InternalMyDot.g:686:6: lv_attrLists_3_0= ruleAttrList
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getAttrListsAttrListParserRuleCall_1_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_attrLists_3_0=ruleAttrList();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getSubgraphOrEdgeStmtSubgraphRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"attrLists",
                    	      							lv_attrLists_3_0,
                    	      							"org.xtext.example.mydot.MyDot.AttrList");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


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
    // $ANTLR end "ruleSubgraphOrEdgeStmtSubgraph"


    // $ANTLR start "entryRuleSubgraph"
    // InternalMyDot.g:708:1: entryRuleSubgraph returns [EObject current=null] : iv_ruleSubgraph= ruleSubgraph EOF ;
    public final EObject entryRuleSubgraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubgraph = null;


        try {
            // InternalMyDot.g:708:49: (iv_ruleSubgraph= ruleSubgraph EOF )
            // InternalMyDot.g:709:2: iv_ruleSubgraph= ruleSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubgraphRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubgraph=ruleSubgraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubgraph; 
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
    // $ANTLR end "entryRuleSubgraph"


    // $ANTLR start "ruleSubgraph"
    // InternalMyDot.g:715:1: ruleSubgraph returns [EObject current=null] : ( () (otherlv_1= 'subgraph' ( (lv_name_2_0= RULE_ID ) )? )? otherlv_3= '{' ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= '}' ) ;
    public final EObject ruleSubgraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_stmts_4_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:721:2: ( ( () (otherlv_1= 'subgraph' ( (lv_name_2_0= RULE_ID ) )? )? otherlv_3= '{' ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= '}' ) )
            // InternalMyDot.g:722:2: ( () (otherlv_1= 'subgraph' ( (lv_name_2_0= RULE_ID ) )? )? otherlv_3= '{' ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= '}' )
            {
            // InternalMyDot.g:722:2: ( () (otherlv_1= 'subgraph' ( (lv_name_2_0= RULE_ID ) )? )? otherlv_3= '{' ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= '}' )
            // InternalMyDot.g:723:3: () (otherlv_1= 'subgraph' ( (lv_name_2_0= RULE_ID ) )? )? otherlv_3= '{' ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= '}'
            {
            // InternalMyDot.g:723:3: ()
            // InternalMyDot.g:724:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSubgraphAccess().getSubgraphAction_0(),
              					current);
              			
            }

            }

            // InternalMyDot.g:730:3: (otherlv_1= 'subgraph' ( (lv_name_2_0= RULE_ID ) )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDot.g:731:4: otherlv_1= 'subgraph' ( (lv_name_2_0= RULE_ID ) )?
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSubgraphAccess().getSubgraphKeyword_1_0());
                      			
                    }
                    // InternalMyDot.g:735:4: ( (lv_name_2_0= RULE_ID ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMyDot.g:736:5: (lv_name_2_0= RULE_ID )
                            {
                            // InternalMyDot.g:736:5: (lv_name_2_0= RULE_ID )
                            // InternalMyDot.g:737:6: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_name_2_0, grammarAccess.getSubgraphAccess().getNameIDTerminalRuleCall_1_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getSubgraphRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"name",
                              							lv_name_2_0,
                              							"org.eclipse.xtext.common.Terminals.ID");
                              					
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSubgraphAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalMyDot.g:758:3: ( (lv_stmts_4_0= ruleStmt ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==14||LA18_0==17||LA18_0==22||(LA18_0>=26 && LA18_0<=27)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDot.g:759:4: (lv_stmts_4_0= ruleStmt )
            	    {
            	    // InternalMyDot.g:759:4: (lv_stmts_4_0= ruleStmt )
            	    // InternalMyDot.g:760:5: lv_stmts_4_0= ruleStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSubgraphAccess().getStmtsStmtParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_stmts_4_0=ruleStmt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSubgraphRule());
            	      					}
            	      					add(
            	      						current,
            	      						"stmts",
            	      						lv_stmts_4_0,
            	      						"org.xtext.example.mydot.MyDot.Stmt");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSubgraphAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleSubgraph"


    // $ANTLR start "entryRuleNodeId"
    // InternalMyDot.g:785:1: entryRuleNodeId returns [EObject current=null] : iv_ruleNodeId= ruleNodeId EOF ;
    public final EObject entryRuleNodeId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeId = null;


        try {
            // InternalMyDot.g:785:47: (iv_ruleNodeId= ruleNodeId EOF )
            // InternalMyDot.g:786:2: iv_ruleNodeId= ruleNodeId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeIdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeId=ruleNodeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeId; 
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
    // $ANTLR end "entryRuleNodeId"


    // $ANTLR start "ruleNodeId"
    // InternalMyDot.g:792:1: ruleNodeId returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_port_2_0= rulePort ) )? ) ;
    public final EObject ruleNodeId() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_port_2_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:798:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_port_2_0= rulePort ) )? ) )
            // InternalMyDot.g:799:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_port_2_0= rulePort ) )? )
            {
            // InternalMyDot.g:799:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_port_2_0= rulePort ) )? )
            // InternalMyDot.g:800:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_port_2_0= rulePort ) )?
            {
            // InternalMyDot.g:800:3: ()
            // InternalMyDot.g:801:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNodeIdAccess().getNodeIdAction_0(),
              					current);
              			
            }

            }

            // InternalMyDot.g:807:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDot.g:808:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDot.g:808:4: (lv_name_1_0= RULE_ID )
            // InternalMyDot.g:809:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getNodeIdAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNodeIdRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMyDot.g:825:3: ( (lv_port_2_0= rulePort ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDot.g:826:4: (lv_port_2_0= rulePort )
                    {
                    // InternalMyDot.g:826:4: (lv_port_2_0= rulePort )
                    // InternalMyDot.g:827:5: lv_port_2_0= rulePort
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNodeIdAccess().getPortPortParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_port_2_0=rulePort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNodeIdRule());
                      					}
                      					set(
                      						current,
                      						"port",
                      						lv_port_2_0,
                      						"org.xtext.example.mydot.MyDot.Port");
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
    // $ANTLR end "ruleNodeId"


    // $ANTLR start "entryRuleAttrList"
    // InternalMyDot.g:848:1: entryRuleAttrList returns [EObject current=null] : iv_ruleAttrList= ruleAttrList EOF ;
    public final EObject entryRuleAttrList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrList = null;


        try {
            // InternalMyDot.g:848:49: (iv_ruleAttrList= ruleAttrList EOF )
            // InternalMyDot.g:849:2: iv_ruleAttrList= ruleAttrList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttrListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttrList=ruleAttrList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttrList; 
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
    // $ANTLR end "entryRuleAttrList"


    // $ANTLR start "ruleAttrList"
    // InternalMyDot.g:855:1: ruleAttrList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' | otherlv_4= ';' )? )* otherlv_5= ']' ) ;
    public final EObject ruleAttrList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:861:2: ( ( () otherlv_1= '[' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' | otherlv_4= ';' )? )* otherlv_5= ']' ) )
            // InternalMyDot.g:862:2: ( () otherlv_1= '[' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' | otherlv_4= ';' )? )* otherlv_5= ']' )
            {
            // InternalMyDot.g:862:2: ( () otherlv_1= '[' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' | otherlv_4= ';' )? )* otherlv_5= ']' )
            // InternalMyDot.g:863:3: () otherlv_1= '[' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' | otherlv_4= ';' )? )* otherlv_5= ']'
            {
            // InternalMyDot.g:863:3: ()
            // InternalMyDot.g:864:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAttrListAccess().getAttrListAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttrListAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalMyDot.g:874:3: ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' | otherlv_4= ';' )? )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDot.g:875:4: ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' | otherlv_4= ';' )?
            	    {
            	    // InternalMyDot.g:875:4: ( (lv_attributes_2_0= ruleAttribute ) )
            	    // InternalMyDot.g:876:5: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalMyDot.g:876:5: (lv_attributes_2_0= ruleAttribute )
            	    // InternalMyDot.g:877:6: lv_attributes_2_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAttrListAccess().getAttributesAttributeParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAttrListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"attributes",
            	      							lv_attributes_2_0,
            	      							"org.xtext.example.mydot.MyDot.Attribute");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalMyDot.g:894:4: (otherlv_3= ',' | otherlv_4= ';' )?
            	    int alt20=3;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==19) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==12) ) {
            	        alt20=2;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalMyDot.g:895:5: otherlv_3= ','
            	            {
            	            otherlv_3=(Token)match(input,19,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getAttrListAccess().getCommaKeyword_2_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDot.g:900:5: otherlv_4= ';'
            	            {
            	            otherlv_4=(Token)match(input,12,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_4, grammarAccess.getAttrListAccess().getSemicolonKeyword_2_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAttrListAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleAttrList"


    // $ANTLR start "entryRulePort"
    // InternalMyDot.g:914:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalMyDot.g:914:45: (iv_rulePort= rulePort EOF )
            // InternalMyDot.g:915:2: iv_rulePort= rulePort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalMyDot.g:921:1: rulePort returns [EObject current=null] : ( () otherlv_1= ':' ( ( ( ( RULE_COMPASS_PT ) )=> (lv_compass_pt_2_0= RULE_COMPASS_PT ) ) | ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_compass_pt_6_0= RULE_COMPASS_PT ) ) ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_compass_pt_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_compass_pt_6_0=null;


        	enterRule();

        try {
            // InternalMyDot.g:927:2: ( ( () otherlv_1= ':' ( ( ( ( RULE_COMPASS_PT ) )=> (lv_compass_pt_2_0= RULE_COMPASS_PT ) ) | ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_compass_pt_6_0= RULE_COMPASS_PT ) ) ) ) ) )
            // InternalMyDot.g:928:2: ( () otherlv_1= ':' ( ( ( ( RULE_COMPASS_PT ) )=> (lv_compass_pt_2_0= RULE_COMPASS_PT ) ) | ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_compass_pt_6_0= RULE_COMPASS_PT ) ) ) ) )
            {
            // InternalMyDot.g:928:2: ( () otherlv_1= ':' ( ( ( ( RULE_COMPASS_PT ) )=> (lv_compass_pt_2_0= RULE_COMPASS_PT ) ) | ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_compass_pt_6_0= RULE_COMPASS_PT ) ) ) ) )
            // InternalMyDot.g:929:3: () otherlv_1= ':' ( ( ( ( RULE_COMPASS_PT ) )=> (lv_compass_pt_2_0= RULE_COMPASS_PT ) ) | ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_compass_pt_6_0= RULE_COMPASS_PT ) ) ) )
            {
            // InternalMyDot.g:929:3: ()
            // InternalMyDot.g:930:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPortAccess().getPortAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getColonKeyword_1());
              		
            }
            // InternalMyDot.g:940:3: ( ( ( ( RULE_COMPASS_PT ) )=> (lv_compass_pt_2_0= RULE_COMPASS_PT ) ) | ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_compass_pt_6_0= RULE_COMPASS_PT ) ) ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_COMPASS_PT) && (synpred1_InternalMyDot())) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==EOF||(LA22_2>=RULE_ID && LA22_2<=RULE_STRING)||LA22_2==12||(LA22_2>=14 && LA22_2<=15)||(LA22_2>=17 && LA22_2<=18)||LA22_2==22||(LA22_2>=24 && LA22_2<=27)) ) {
                    alt22=2;
                }
                else if ( (LA22_2==21) ) {
                    alt22=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDot.g:941:4: ( ( ( RULE_COMPASS_PT ) )=> (lv_compass_pt_2_0= RULE_COMPASS_PT ) )
                    {
                    // InternalMyDot.g:941:4: ( ( ( RULE_COMPASS_PT ) )=> (lv_compass_pt_2_0= RULE_COMPASS_PT ) )
                    // InternalMyDot.g:942:5: ( ( RULE_COMPASS_PT ) )=> (lv_compass_pt_2_0= RULE_COMPASS_PT )
                    {
                    // InternalMyDot.g:946:5: (lv_compass_pt_2_0= RULE_COMPASS_PT )
                    // InternalMyDot.g:947:6: lv_compass_pt_2_0= RULE_COMPASS_PT
                    {
                    lv_compass_pt_2_0=(Token)match(input,RULE_COMPASS_PT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_compass_pt_2_0, grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPortRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"compass_pt",
                      							lv_compass_pt_2_0,
                      							"org.xtext.example.mydot.MyDot.COMPASS_PT");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:964:4: ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalMyDot.g:964:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalMyDot.g:965:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalMyDot.g:965:5: (lv_name_3_0= RULE_ID )
                    // InternalMyDot.g:966:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_3_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPortRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_3_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDot.g:983:4: ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_compass_pt_6_0= RULE_COMPASS_PT ) ) )
                    {
                    // InternalMyDot.g:983:4: ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_compass_pt_6_0= RULE_COMPASS_PT ) ) )
                    // InternalMyDot.g:984:5: ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_compass_pt_6_0= RULE_COMPASS_PT ) )
                    {
                    // InternalMyDot.g:984:5: ( (lv_name_4_0= RULE_ID ) )
                    // InternalMyDot.g:985:6: (lv_name_4_0= RULE_ID )
                    {
                    // InternalMyDot.g:985:6: (lv_name_4_0= RULE_ID )
                    // InternalMyDot.g:986:7: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_4_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_2_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getPortRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_4_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getPortAccess().getColonKeyword_2_2_1());
                      				
                    }
                    // InternalMyDot.g:1006:5: ( (lv_compass_pt_6_0= RULE_COMPASS_PT ) )
                    // InternalMyDot.g:1007:6: (lv_compass_pt_6_0= RULE_COMPASS_PT )
                    {
                    // InternalMyDot.g:1007:6: (lv_compass_pt_6_0= RULE_COMPASS_PT )
                    // InternalMyDot.g:1008:7: lv_compass_pt_6_0= RULE_COMPASS_PT
                    {
                    lv_compass_pt_6_0=(Token)match(input,RULE_COMPASS_PT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_compass_pt_6_0, grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_2_2_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getPortRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"compass_pt",
                      								lv_compass_pt_6_0,
                      								"org.xtext.example.mydot.MyDot.COMPASS_PT");
                      						
                    }

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleEdgeRhsNode"
    // InternalMyDot.g:1030:1: entryRuleEdgeRhsNode returns [EObject current=null] : iv_ruleEdgeRhsNode= ruleEdgeRhsNode EOF ;
    public final EObject entryRuleEdgeRhsNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeRhsNode = null;


        try {
            // InternalMyDot.g:1030:52: (iv_ruleEdgeRhsNode= ruleEdgeRhsNode EOF )
            // InternalMyDot.g:1031:2: iv_ruleEdgeRhsNode= ruleEdgeRhsNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeRhsNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEdgeRhsNode=ruleEdgeRhsNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeRhsNode; 
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
    // $ANTLR end "entryRuleEdgeRhsNode"


    // $ANTLR start "ruleEdgeRhsNode"
    // InternalMyDot.g:1037:1: ruleEdgeRhsNode returns [EObject current=null] : ( () ( (lv_op_1_0= ruleEdgeOp ) ) ( (lv_node_2_0= ruleNodeId ) ) ) ;
    public final EObject ruleEdgeRhsNode() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:1043:2: ( ( () ( (lv_op_1_0= ruleEdgeOp ) ) ( (lv_node_2_0= ruleNodeId ) ) ) )
            // InternalMyDot.g:1044:2: ( () ( (lv_op_1_0= ruleEdgeOp ) ) ( (lv_node_2_0= ruleNodeId ) ) )
            {
            // InternalMyDot.g:1044:2: ( () ( (lv_op_1_0= ruleEdgeOp ) ) ( (lv_node_2_0= ruleNodeId ) ) )
            // InternalMyDot.g:1045:3: () ( (lv_op_1_0= ruleEdgeOp ) ) ( (lv_node_2_0= ruleNodeId ) )
            {
            // InternalMyDot.g:1045:3: ()
            // InternalMyDot.g:1046:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEdgeRhsNodeAccess().getEdgeRhsNodeAction_0(),
              					current);
              			
            }

            }

            // InternalMyDot.g:1052:3: ( (lv_op_1_0= ruleEdgeOp ) )
            // InternalMyDot.g:1053:4: (lv_op_1_0= ruleEdgeOp )
            {
            // InternalMyDot.g:1053:4: (lv_op_1_0= ruleEdgeOp )
            // InternalMyDot.g:1054:5: lv_op_1_0= ruleEdgeOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEdgeRhsNodeAccess().getOpEdgeOpEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_op_1_0=ruleEdgeOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEdgeRhsNodeRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"org.xtext.example.mydot.MyDot.EdgeOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDot.g:1071:3: ( (lv_node_2_0= ruleNodeId ) )
            // InternalMyDot.g:1072:4: (lv_node_2_0= ruleNodeId )
            {
            // InternalMyDot.g:1072:4: (lv_node_2_0= ruleNodeId )
            // InternalMyDot.g:1073:5: lv_node_2_0= ruleNodeId
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEdgeRhsNodeAccess().getNodeNodeIdParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_node_2_0=ruleNodeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEdgeRhsNodeRule());
              					}
              					set(
              						current,
              						"node",
              						lv_node_2_0,
              						"org.xtext.example.mydot.MyDot.NodeId");
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
    // $ANTLR end "ruleEdgeRhsNode"


    // $ANTLR start "entryRuleEdgeRhsSubgraph"
    // InternalMyDot.g:1094:1: entryRuleEdgeRhsSubgraph returns [EObject current=null] : iv_ruleEdgeRhsSubgraph= ruleEdgeRhsSubgraph EOF ;
    public final EObject entryRuleEdgeRhsSubgraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeRhsSubgraph = null;


        try {
            // InternalMyDot.g:1094:56: (iv_ruleEdgeRhsSubgraph= ruleEdgeRhsSubgraph EOF )
            // InternalMyDot.g:1095:2: iv_ruleEdgeRhsSubgraph= ruleEdgeRhsSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeRhsSubgraphRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEdgeRhsSubgraph=ruleEdgeRhsSubgraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeRhsSubgraph; 
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
    // $ANTLR end "entryRuleEdgeRhsSubgraph"


    // $ANTLR start "ruleEdgeRhsSubgraph"
    // InternalMyDot.g:1101:1: ruleEdgeRhsSubgraph returns [EObject current=null] : ( () ( (lv_op_1_0= ruleEdgeOp ) ) ( (lv_subgraph_2_0= ruleSubgraph ) ) ) ;
    public final EObject ruleEdgeRhsSubgraph() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_subgraph_2_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:1107:2: ( ( () ( (lv_op_1_0= ruleEdgeOp ) ) ( (lv_subgraph_2_0= ruleSubgraph ) ) ) )
            // InternalMyDot.g:1108:2: ( () ( (lv_op_1_0= ruleEdgeOp ) ) ( (lv_subgraph_2_0= ruleSubgraph ) ) )
            {
            // InternalMyDot.g:1108:2: ( () ( (lv_op_1_0= ruleEdgeOp ) ) ( (lv_subgraph_2_0= ruleSubgraph ) ) )
            // InternalMyDot.g:1109:3: () ( (lv_op_1_0= ruleEdgeOp ) ) ( (lv_subgraph_2_0= ruleSubgraph ) )
            {
            // InternalMyDot.g:1109:3: ()
            // InternalMyDot.g:1110:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEdgeRhsSubgraphAccess().getEdgeRhsSubgraphAction_0(),
              					current);
              			
            }

            }

            // InternalMyDot.g:1116:3: ( (lv_op_1_0= ruleEdgeOp ) )
            // InternalMyDot.g:1117:4: (lv_op_1_0= ruleEdgeOp )
            {
            // InternalMyDot.g:1117:4: (lv_op_1_0= ruleEdgeOp )
            // InternalMyDot.g:1118:5: lv_op_1_0= ruleEdgeOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEdgeRhsSubgraphAccess().getOpEdgeOpEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_op_1_0=ruleEdgeOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEdgeRhsSubgraphRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"org.xtext.example.mydot.MyDot.EdgeOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDot.g:1135:3: ( (lv_subgraph_2_0= ruleSubgraph ) )
            // InternalMyDot.g:1136:4: (lv_subgraph_2_0= ruleSubgraph )
            {
            // InternalMyDot.g:1136:4: (lv_subgraph_2_0= ruleSubgraph )
            // InternalMyDot.g:1137:5: lv_subgraph_2_0= ruleSubgraph
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphSubgraphParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_subgraph_2_0=ruleSubgraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEdgeRhsSubgraphRule());
              					}
              					set(
              						current,
              						"subgraph",
              						lv_subgraph_2_0,
              						"org.xtext.example.mydot.MyDot.Subgraph");
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
    // $ANTLR end "ruleEdgeRhsSubgraph"


    // $ANTLR start "ruleGraphType"
    // InternalMyDot.g:1158:1: ruleGraphType returns [Enumerator current=null] : ( (enumLiteral_0= 'graph' ) | (enumLiteral_1= 'digraph' ) ) ;
    public final Enumerator ruleGraphType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDot.g:1164:2: ( ( (enumLiteral_0= 'graph' ) | (enumLiteral_1= 'digraph' ) ) )
            // InternalMyDot.g:1165:2: ( (enumLiteral_0= 'graph' ) | (enumLiteral_1= 'digraph' ) )
            {
            // InternalMyDot.g:1165:2: ( (enumLiteral_0= 'graph' ) | (enumLiteral_1= 'digraph' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            else if ( (LA23_0==23) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDot.g:1166:3: (enumLiteral_0= 'graph' )
                    {
                    // InternalMyDot.g:1166:3: (enumLiteral_0= 'graph' )
                    // InternalMyDot.g:1167:4: enumLiteral_0= 'graph'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGraphTypeAccess().getGraphEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGraphTypeAccess().getGraphEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:1174:3: (enumLiteral_1= 'digraph' )
                    {
                    // InternalMyDot.g:1174:3: (enumLiteral_1= 'digraph' )
                    // InternalMyDot.g:1175:4: enumLiteral_1= 'digraph'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGraphTypeAccess().getDigraphEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGraphTypeAccess().getDigraphEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGraphType"


    // $ANTLR start "ruleEdgeOp"
    // InternalMyDot.g:1185:1: ruleEdgeOp returns [Enumerator current=null] : ( (enumLiteral_0= '->' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleEdgeOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDot.g:1191:2: ( ( (enumLiteral_0= '->' ) | (enumLiteral_1= '--' ) ) )
            // InternalMyDot.g:1192:2: ( (enumLiteral_0= '->' ) | (enumLiteral_1= '--' ) )
            {
            // InternalMyDot.g:1192:2: ( (enumLiteral_0= '->' ) | (enumLiteral_1= '--' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            else if ( (LA24_0==25) ) {
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
                    // InternalMyDot.g:1193:3: (enumLiteral_0= '->' )
                    {
                    // InternalMyDot.g:1193:3: (enumLiteral_0= '->' )
                    // InternalMyDot.g:1194:4: enumLiteral_0= '->'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEdgeOpAccess().getDirectedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEdgeOpAccess().getDirectedEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:1201:3: (enumLiteral_1= '--' )
                    {
                    // InternalMyDot.g:1201:3: (enumLiteral_1= '--' )
                    // InternalMyDot.g:1202:4: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEdgeOpAccess().getUndirectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEdgeOpAccess().getUndirectedEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleEdgeOp"


    // $ANTLR start "ruleAttributeType"
    // InternalMyDot.g:1212:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'graph' ) | (enumLiteral_1= 'node' ) | (enumLiteral_2= 'edge' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDot.g:1218:2: ( ( (enumLiteral_0= 'graph' ) | (enumLiteral_1= 'node' ) | (enumLiteral_2= 'edge' ) ) )
            // InternalMyDot.g:1219:2: ( (enumLiteral_0= 'graph' ) | (enumLiteral_1= 'node' ) | (enumLiteral_2= 'edge' ) )
            {
            // InternalMyDot.g:1219:2: ( (enumLiteral_0= 'graph' ) | (enumLiteral_1= 'node' ) | (enumLiteral_2= 'edge' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt25=1;
                }
                break;
            case 26:
                {
                alt25=2;
                }
                break;
            case 27:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMyDot.g:1220:3: (enumLiteral_0= 'graph' )
                    {
                    // InternalMyDot.g:1220:3: (enumLiteral_0= 'graph' )
                    // InternalMyDot.g:1221:4: enumLiteral_0= 'graph'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAttributeTypeAccess().getGraphEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getGraphEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:1228:3: (enumLiteral_1= 'node' )
                    {
                    // InternalMyDot.g:1228:3: (enumLiteral_1= 'node' )
                    // InternalMyDot.g:1229:4: enumLiteral_1= 'node'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAttributeTypeAccess().getNodeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getNodeEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDot.g:1236:3: (enumLiteral_2= 'edge' )
                    {
                    // InternalMyDot.g:1236:3: (enumLiteral_2= 'edge' )
                    // InternalMyDot.g:1237:4: enumLiteral_2= 'edge'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAttributeTypeAccess().getEdgeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getEdgeEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleAttributeType"

    // $ANTLR start synpred1_InternalMyDot
    public final void synpred1_InternalMyDot_fragment() throws RecognitionException {   
        // InternalMyDot.g:942:5: ( ( RULE_COMPASS_PT ) )
        // InternalMyDot.g:942:6: ( RULE_COMPASS_PT )
        {
        // InternalMyDot.g:942:6: ( RULE_COMPASS_PT )
        // InternalMyDot.g:943:6: RULE_COMPASS_PT
        {
        match(input,RULE_COMPASS_PT,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalMyDot

    // Delegated rules

    public final boolean synpred1_InternalMyDot() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyDot_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\7\6\uffff\2\7\1\uffff\1\7";
    static final String dfa_3s = "\2\4\3\uffff\1\4\2\uffff\2\4\1\6\1\4";
    static final String dfa_4s = "\2\33\3\uffff\1\6\2\uffff\2\33\1\6\1\33";
    static final String dfa_5s = "\2\uffff\1\3\1\4\1\5\1\uffff\1\1\1\2\4\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\3\10\uffff\1\4\2\uffff\1\4\4\uffff\1\2\3\uffff\2\2",
            "\2\7\6\uffff\1\7\1\uffff\2\7\1\3\2\7\2\uffff\1\5\1\7\1\uffff\2\6\2\7",
            "",
            "",
            "",
            "\1\11\1\uffff\1\10",
            "",
            "",
            "\2\7\6\uffff\1\7\1\uffff\2\7\1\uffff\2\7\3\uffff\1\7\1\uffff\2\6\2\7",
            "\2\7\6\uffff\1\7\1\uffff\2\7\1\uffff\2\7\2\uffff\1\12\1\7\1\uffff\2\6\2\7",
            "\1\13",
            "\2\7\6\uffff\1\7\1\uffff\2\7\1\uffff\2\7\3\uffff\1\7\1\uffff\2\6\2\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "125:3: (this_EdgeStmtNode_0= ruleEdgeStmtNode | this_NodeStmt_1= ruleNodeStmt | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000C02002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000C06010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000C42C030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000181030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C424030L});

}