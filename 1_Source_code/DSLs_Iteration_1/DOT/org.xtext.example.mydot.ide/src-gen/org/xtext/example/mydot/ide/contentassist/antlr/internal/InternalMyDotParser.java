package org.xtext.example.mydot.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydot.services.MyDotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDotParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_COMPASS_PT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "';'", "'graph'", "'digraph'", "'->'", "'--'", "'node'", "'edge'", "'{'", "'}'", "'='", "'subgraph'", "'['", "']'", "':'", "'strict'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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

    	public void setGrammarAccess(MyDotGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDotAst"
    // InternalMyDot.g:54:1: entryRuleDotAst : ruleDotAst EOF ;
    public final void entryRuleDotAst() throws RecognitionException {
        try {
            // InternalMyDot.g:55:1: ( ruleDotAst EOF )
            // InternalMyDot.g:56:1: ruleDotAst EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotAstRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDotAst();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotAstRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDotAst"


    // $ANTLR start "ruleDotAst"
    // InternalMyDot.g:63:1: ruleDotAst : ( ( rule__DotAst__Group__0 ) ) ;
    public final void ruleDotAst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:67:2: ( ( ( rule__DotAst__Group__0 ) ) )
            // InternalMyDot.g:68:2: ( ( rule__DotAst__Group__0 ) )
            {
            // InternalMyDot.g:68:2: ( ( rule__DotAst__Group__0 ) )
            // InternalMyDot.g:69:3: ( rule__DotAst__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotAstAccess().getGroup()); 
            }
            // InternalMyDot.g:70:3: ( rule__DotAst__Group__0 )
            // InternalMyDot.g:70:4: rule__DotAst__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DotAst__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotAstAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotAst"


    // $ANTLR start "entryRuleStmt"
    // InternalMyDot.g:79:1: entryRuleStmt : ruleStmt EOF ;
    public final void entryRuleStmt() throws RecognitionException {
        try {
            // InternalMyDot.g:80:1: ( ruleStmt EOF )
            // InternalMyDot.g:81:1: ruleStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalMyDot.g:88:1: ruleStmt : ( ( rule__Stmt__Group__0 ) ) ;
    public final void ruleStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:92:2: ( ( ( rule__Stmt__Group__0 ) ) )
            // InternalMyDot.g:93:2: ( ( rule__Stmt__Group__0 ) )
            {
            // InternalMyDot.g:93:2: ( ( rule__Stmt__Group__0 ) )
            // InternalMyDot.g:94:3: ( rule__Stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtAccess().getGroup()); 
            }
            // InternalMyDot.g:95:3: ( rule__Stmt__Group__0 )
            // InternalMyDot.g:95:4: rule__Stmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleEdgeRhs"
    // InternalMyDot.g:104:1: entryRuleEdgeRhs : ruleEdgeRhs EOF ;
    public final void entryRuleEdgeRhs() throws RecognitionException {
        try {
            // InternalMyDot.g:105:1: ( ruleEdgeRhs EOF )
            // InternalMyDot.g:106:1: ruleEdgeRhs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEdgeRhs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdgeRhs"


    // $ANTLR start "ruleEdgeRhs"
    // InternalMyDot.g:113:1: ruleEdgeRhs : ( ( rule__EdgeRhs__Alternatives ) ) ;
    public final void ruleEdgeRhs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:117:2: ( ( ( rule__EdgeRhs__Alternatives ) ) )
            // InternalMyDot.g:118:2: ( ( rule__EdgeRhs__Alternatives ) )
            {
            // InternalMyDot.g:118:2: ( ( rule__EdgeRhs__Alternatives ) )
            // InternalMyDot.g:119:3: ( rule__EdgeRhs__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsAccess().getAlternatives()); 
            }
            // InternalMyDot.g:120:3: ( rule__EdgeRhs__Alternatives )
            // InternalMyDot.g:120:4: rule__EdgeRhs__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EdgeRhs__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeRhs"


    // $ANTLR start "entryRuleDotGraph"
    // InternalMyDot.g:129:1: entryRuleDotGraph : ruleDotGraph EOF ;
    public final void entryRuleDotGraph() throws RecognitionException {
        try {
            // InternalMyDot.g:130:1: ( ruleDotGraph EOF )
            // InternalMyDot.g:131:1: ruleDotGraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDotGraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDotGraph"


    // $ANTLR start "ruleDotGraph"
    // InternalMyDot.g:138:1: ruleDotGraph : ( ( rule__DotGraph__Group__0 ) ) ;
    public final void ruleDotGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:142:2: ( ( ( rule__DotGraph__Group__0 ) ) )
            // InternalMyDot.g:143:2: ( ( rule__DotGraph__Group__0 ) )
            {
            // InternalMyDot.g:143:2: ( ( rule__DotGraph__Group__0 ) )
            // InternalMyDot.g:144:3: ( rule__DotGraph__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getGroup()); 
            }
            // InternalMyDot.g:145:3: ( rule__DotGraph__Group__0 )
            // InternalMyDot.g:145:4: rule__DotGraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DotGraph__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotGraph"


    // $ANTLR start "entryRuleEString"
    // InternalMyDot.g:154:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDot.g:155:1: ( ruleEString EOF )
            // InternalMyDot.g:156:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDot.g:163:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:167:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDot.g:168:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDot.g:168:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDot.g:169:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalMyDot.g:170:3: ( rule__EString__Alternatives )
            // InternalMyDot.g:170:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEdgeStmtNode"
    // InternalMyDot.g:179:1: entryRuleEdgeStmtNode : ruleEdgeStmtNode EOF ;
    public final void entryRuleEdgeStmtNode() throws RecognitionException {
        try {
            // InternalMyDot.g:180:1: ( ruleEdgeStmtNode EOF )
            // InternalMyDot.g:181:1: ruleEdgeStmtNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEdgeStmtNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdgeStmtNode"


    // $ANTLR start "ruleEdgeStmtNode"
    // InternalMyDot.g:188:1: ruleEdgeStmtNode : ( ( rule__EdgeStmtNode__Group__0 ) ) ;
    public final void ruleEdgeStmtNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:192:2: ( ( ( rule__EdgeStmtNode__Group__0 ) ) )
            // InternalMyDot.g:193:2: ( ( rule__EdgeStmtNode__Group__0 ) )
            {
            // InternalMyDot.g:193:2: ( ( rule__EdgeStmtNode__Group__0 ) )
            // InternalMyDot.g:194:3: ( rule__EdgeStmtNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getGroup()); 
            }
            // InternalMyDot.g:195:3: ( rule__EdgeStmtNode__Group__0 )
            // InternalMyDot.g:195:4: rule__EdgeStmtNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStmtNode__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeStmtNode"


    // $ANTLR start "entryRuleNodeStmt"
    // InternalMyDot.g:204:1: entryRuleNodeStmt : ruleNodeStmt EOF ;
    public final void entryRuleNodeStmt() throws RecognitionException {
        try {
            // InternalMyDot.g:205:1: ( ruleNodeStmt EOF )
            // InternalMyDot.g:206:1: ruleNodeStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNodeStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeStmt"


    // $ANTLR start "ruleNodeStmt"
    // InternalMyDot.g:213:1: ruleNodeStmt : ( ( rule__NodeStmt__Group__0 ) ) ;
    public final void ruleNodeStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:217:2: ( ( ( rule__NodeStmt__Group__0 ) ) )
            // InternalMyDot.g:218:2: ( ( rule__NodeStmt__Group__0 ) )
            {
            // InternalMyDot.g:218:2: ( ( rule__NodeStmt__Group__0 ) )
            // InternalMyDot.g:219:3: ( rule__NodeStmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtAccess().getGroup()); 
            }
            // InternalMyDot.g:220:3: ( rule__NodeStmt__Group__0 )
            // InternalMyDot.g:220:4: rule__NodeStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeStmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeStmt"


    // $ANTLR start "entryRuleAttrStmt"
    // InternalMyDot.g:229:1: entryRuleAttrStmt : ruleAttrStmt EOF ;
    public final void entryRuleAttrStmt() throws RecognitionException {
        try {
            // InternalMyDot.g:230:1: ( ruleAttrStmt EOF )
            // InternalMyDot.g:231:1: ruleAttrStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttrStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttrStmt"


    // $ANTLR start "ruleAttrStmt"
    // InternalMyDot.g:238:1: ruleAttrStmt : ( ( rule__AttrStmt__Group__0 ) ) ;
    public final void ruleAttrStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:242:2: ( ( ( rule__AttrStmt__Group__0 ) ) )
            // InternalMyDot.g:243:2: ( ( rule__AttrStmt__Group__0 ) )
            {
            // InternalMyDot.g:243:2: ( ( rule__AttrStmt__Group__0 ) )
            // InternalMyDot.g:244:3: ( rule__AttrStmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getGroup()); 
            }
            // InternalMyDot.g:245:3: ( rule__AttrStmt__Group__0 )
            // InternalMyDot.g:245:4: rule__AttrStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttrStmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttrStmt"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDot.g:254:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDot.g:255:1: ( ruleAttribute EOF )
            // InternalMyDot.g:256:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDot.g:263:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:267:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDot.g:268:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDot.g:268:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDot.g:269:3: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // InternalMyDot.g:270:3: ( rule__Attribute__Group__0 )
            // InternalMyDot.g:270:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleSubgraphOrEdgeStmtSubgraph"
    // InternalMyDot.g:279:1: entryRuleSubgraphOrEdgeStmtSubgraph : ruleSubgraphOrEdgeStmtSubgraph EOF ;
    public final void entryRuleSubgraphOrEdgeStmtSubgraph() throws RecognitionException {
        try {
            // InternalMyDot.g:280:1: ( ruleSubgraphOrEdgeStmtSubgraph EOF )
            // InternalMyDot.g:281:1: ruleSubgraphOrEdgeStmtSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubgraphOrEdgeStmtSubgraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubgraphOrEdgeStmtSubgraph"


    // $ANTLR start "ruleSubgraphOrEdgeStmtSubgraph"
    // InternalMyDot.g:288:1: ruleSubgraphOrEdgeStmtSubgraph : ( ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 ) ) ;
    public final void ruleSubgraphOrEdgeStmtSubgraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:292:2: ( ( ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 ) ) )
            // InternalMyDot.g:293:2: ( ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 ) )
            {
            // InternalMyDot.g:293:2: ( ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 ) )
            // InternalMyDot.g:294:3: ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getGroup()); 
            }
            // InternalMyDot.g:295:3: ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 )
            // InternalMyDot.g:295:4: rule__SubgraphOrEdgeStmtSubgraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubgraphOrEdgeStmtSubgraph__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubgraphOrEdgeStmtSubgraph"


    // $ANTLR start "entryRuleSubgraph"
    // InternalMyDot.g:304:1: entryRuleSubgraph : ruleSubgraph EOF ;
    public final void entryRuleSubgraph() throws RecognitionException {
        try {
            // InternalMyDot.g:305:1: ( ruleSubgraph EOF )
            // InternalMyDot.g:306:1: ruleSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubgraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubgraph"


    // $ANTLR start "ruleSubgraph"
    // InternalMyDot.g:313:1: ruleSubgraph : ( ( rule__Subgraph__Group__0 ) ) ;
    public final void ruleSubgraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:317:2: ( ( ( rule__Subgraph__Group__0 ) ) )
            // InternalMyDot.g:318:2: ( ( rule__Subgraph__Group__0 ) )
            {
            // InternalMyDot.g:318:2: ( ( rule__Subgraph__Group__0 ) )
            // InternalMyDot.g:319:3: ( rule__Subgraph__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getGroup()); 
            }
            // InternalMyDot.g:320:3: ( rule__Subgraph__Group__0 )
            // InternalMyDot.g:320:4: rule__Subgraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subgraph__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubgraph"


    // $ANTLR start "entryRuleNodeId"
    // InternalMyDot.g:329:1: entryRuleNodeId : ruleNodeId EOF ;
    public final void entryRuleNodeId() throws RecognitionException {
        try {
            // InternalMyDot.g:330:1: ( ruleNodeId EOF )
            // InternalMyDot.g:331:1: ruleNodeId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNodeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeId"


    // $ANTLR start "ruleNodeId"
    // InternalMyDot.g:338:1: ruleNodeId : ( ( rule__NodeId__Group__0 ) ) ;
    public final void ruleNodeId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:342:2: ( ( ( rule__NodeId__Group__0 ) ) )
            // InternalMyDot.g:343:2: ( ( rule__NodeId__Group__0 ) )
            {
            // InternalMyDot.g:343:2: ( ( rule__NodeId__Group__0 ) )
            // InternalMyDot.g:344:3: ( rule__NodeId__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdAccess().getGroup()); 
            }
            // InternalMyDot.g:345:3: ( rule__NodeId__Group__0 )
            // InternalMyDot.g:345:4: rule__NodeId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeId__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeId"


    // $ANTLR start "entryRuleAttrList"
    // InternalMyDot.g:354:1: entryRuleAttrList : ruleAttrList EOF ;
    public final void entryRuleAttrList() throws RecognitionException {
        try {
            // InternalMyDot.g:355:1: ( ruleAttrList EOF )
            // InternalMyDot.g:356:1: ruleAttrList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttrList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttrList"


    // $ANTLR start "ruleAttrList"
    // InternalMyDot.g:363:1: ruleAttrList : ( ( rule__AttrList__Group__0 ) ) ;
    public final void ruleAttrList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:367:2: ( ( ( rule__AttrList__Group__0 ) ) )
            // InternalMyDot.g:368:2: ( ( rule__AttrList__Group__0 ) )
            {
            // InternalMyDot.g:368:2: ( ( rule__AttrList__Group__0 ) )
            // InternalMyDot.g:369:3: ( rule__AttrList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getGroup()); 
            }
            // InternalMyDot.g:370:3: ( rule__AttrList__Group__0 )
            // InternalMyDot.g:370:4: rule__AttrList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttrList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttrList"


    // $ANTLR start "entryRulePort"
    // InternalMyDot.g:379:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalMyDot.g:380:1: ( rulePort EOF )
            // InternalMyDot.g:381:1: rulePort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalMyDot.g:388:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:392:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalMyDot.g:393:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalMyDot.g:393:2: ( ( rule__Port__Group__0 ) )
            // InternalMyDot.g:394:3: ( rule__Port__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getGroup()); 
            }
            // InternalMyDot.g:395:3: ( rule__Port__Group__0 )
            // InternalMyDot.g:395:4: rule__Port__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleEdgeRhsNode"
    // InternalMyDot.g:404:1: entryRuleEdgeRhsNode : ruleEdgeRhsNode EOF ;
    public final void entryRuleEdgeRhsNode() throws RecognitionException {
        try {
            // InternalMyDot.g:405:1: ( ruleEdgeRhsNode EOF )
            // InternalMyDot.g:406:1: ruleEdgeRhsNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEdgeRhsNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdgeRhsNode"


    // $ANTLR start "ruleEdgeRhsNode"
    // InternalMyDot.g:413:1: ruleEdgeRhsNode : ( ( rule__EdgeRhsNode__Group__0 ) ) ;
    public final void ruleEdgeRhsNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:417:2: ( ( ( rule__EdgeRhsNode__Group__0 ) ) )
            // InternalMyDot.g:418:2: ( ( rule__EdgeRhsNode__Group__0 ) )
            {
            // InternalMyDot.g:418:2: ( ( rule__EdgeRhsNode__Group__0 ) )
            // InternalMyDot.g:419:3: ( rule__EdgeRhsNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeAccess().getGroup()); 
            }
            // InternalMyDot.g:420:3: ( rule__EdgeRhsNode__Group__0 )
            // InternalMyDot.g:420:4: rule__EdgeRhsNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeRhsNode__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeRhsNode"


    // $ANTLR start "entryRuleEdgeRhsSubgraph"
    // InternalMyDot.g:429:1: entryRuleEdgeRhsSubgraph : ruleEdgeRhsSubgraph EOF ;
    public final void entryRuleEdgeRhsSubgraph() throws RecognitionException {
        try {
            // InternalMyDot.g:430:1: ( ruleEdgeRhsSubgraph EOF )
            // InternalMyDot.g:431:1: ruleEdgeRhsSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEdgeRhsSubgraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdgeRhsSubgraph"


    // $ANTLR start "ruleEdgeRhsSubgraph"
    // InternalMyDot.g:438:1: ruleEdgeRhsSubgraph : ( ( rule__EdgeRhsSubgraph__Group__0 ) ) ;
    public final void ruleEdgeRhsSubgraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:442:2: ( ( ( rule__EdgeRhsSubgraph__Group__0 ) ) )
            // InternalMyDot.g:443:2: ( ( rule__EdgeRhsSubgraph__Group__0 ) )
            {
            // InternalMyDot.g:443:2: ( ( rule__EdgeRhsSubgraph__Group__0 ) )
            // InternalMyDot.g:444:3: ( rule__EdgeRhsSubgraph__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphAccess().getGroup()); 
            }
            // InternalMyDot.g:445:3: ( rule__EdgeRhsSubgraph__Group__0 )
            // InternalMyDot.g:445:4: rule__EdgeRhsSubgraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeRhsSubgraph__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeRhsSubgraph"


    // $ANTLR start "ruleGraphType"
    // InternalMyDot.g:454:1: ruleGraphType : ( ( rule__GraphType__Alternatives ) ) ;
    public final void ruleGraphType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:458:1: ( ( ( rule__GraphType__Alternatives ) ) )
            // InternalMyDot.g:459:2: ( ( rule__GraphType__Alternatives ) )
            {
            // InternalMyDot.g:459:2: ( ( rule__GraphType__Alternatives ) )
            // InternalMyDot.g:460:3: ( rule__GraphType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphTypeAccess().getAlternatives()); 
            }
            // InternalMyDot.g:461:3: ( rule__GraphType__Alternatives )
            // InternalMyDot.g:461:4: rule__GraphType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphType"


    // $ANTLR start "ruleEdgeOp"
    // InternalMyDot.g:470:1: ruleEdgeOp : ( ( rule__EdgeOp__Alternatives ) ) ;
    public final void ruleEdgeOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:474:1: ( ( ( rule__EdgeOp__Alternatives ) ) )
            // InternalMyDot.g:475:2: ( ( rule__EdgeOp__Alternatives ) )
            {
            // InternalMyDot.g:475:2: ( ( rule__EdgeOp__Alternatives ) )
            // InternalMyDot.g:476:3: ( rule__EdgeOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeOpAccess().getAlternatives()); 
            }
            // InternalMyDot.g:477:3: ( rule__EdgeOp__Alternatives )
            // InternalMyDot.g:477:4: rule__EdgeOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EdgeOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeOpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeOp"


    // $ANTLR start "ruleAttributeType"
    // InternalMyDot.g:486:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:490:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalMyDot.g:491:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalMyDot.g:491:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalMyDot.g:492:3: ( rule__AttributeType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            }
            // InternalMyDot.g:493:3: ( rule__AttributeType__Alternatives )
            // InternalMyDot.g:493:4: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "rule__Stmt__Alternatives_0"
    // InternalMyDot.g:501:1: rule__Stmt__Alternatives_0 : ( ( ruleEdgeStmtNode ) | ( ruleNodeStmt ) | ( ruleAttrStmt ) | ( ruleAttribute ) | ( ruleSubgraphOrEdgeStmtSubgraph ) );
    public final void rule__Stmt__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:505:1: ( ( ruleEdgeStmtNode ) | ( ruleNodeStmt ) | ( ruleAttrStmt ) | ( ruleAttribute ) | ( ruleSubgraphOrEdgeStmtSubgraph ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMyDot.g:506:2: ( ruleEdgeStmtNode )
                    {
                    // InternalMyDot.g:506:2: ( ruleEdgeStmtNode )
                    // InternalMyDot.g:507:3: ruleEdgeStmtNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getEdgeStmtNodeParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEdgeStmtNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getEdgeStmtNodeParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:512:2: ( ruleNodeStmt )
                    {
                    // InternalMyDot.g:512:2: ( ruleNodeStmt )
                    // InternalMyDot.g:513:3: ruleNodeStmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getNodeStmtParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNodeStmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getNodeStmtParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDot.g:518:2: ( ruleAttrStmt )
                    {
                    // InternalMyDot.g:518:2: ( ruleAttrStmt )
                    // InternalMyDot.g:519:3: ruleAttrStmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getAttrStmtParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAttrStmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getAttrStmtParserRuleCall_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDot.g:524:2: ( ruleAttribute )
                    {
                    // InternalMyDot.g:524:2: ( ruleAttribute )
                    // InternalMyDot.g:525:3: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getAttributeParserRuleCall_0_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getAttributeParserRuleCall_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDot.g:530:2: ( ruleSubgraphOrEdgeStmtSubgraph )
                    {
                    // InternalMyDot.g:530:2: ( ruleSubgraphOrEdgeStmtSubgraph )
                    // InternalMyDot.g:531:3: ruleSubgraphOrEdgeStmtSubgraph
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getSubgraphOrEdgeStmtSubgraphParserRuleCall_0_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSubgraphOrEdgeStmtSubgraph();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getSubgraphOrEdgeStmtSubgraphParserRuleCall_0_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Alternatives_0"


    // $ANTLR start "rule__EdgeRhs__Alternatives"
    // InternalMyDot.g:540:1: rule__EdgeRhs__Alternatives : ( ( ruleEdgeRhsNode ) | ( ruleEdgeRhsSubgraph ) );
    public final void rule__EdgeRhs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:544:1: ( ( ruleEdgeRhsNode ) | ( ruleEdgeRhsSubgraph ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=1;
                }
                else if ( (LA2_1==20||LA2_1==23) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==17) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
                    alt2=1;
                }
                else if ( (LA2_2==20||LA2_2==23) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDot.g:545:2: ( ruleEdgeRhsNode )
                    {
                    // InternalMyDot.g:545:2: ( ruleEdgeRhsNode )
                    // InternalMyDot.g:546:3: ruleEdgeRhsNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEdgeRhsAccess().getEdgeRhsNodeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEdgeRhsNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEdgeRhsAccess().getEdgeRhsNodeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:551:2: ( ruleEdgeRhsSubgraph )
                    {
                    // InternalMyDot.g:551:2: ( ruleEdgeRhsSubgraph )
                    // InternalMyDot.g:552:3: ruleEdgeRhsSubgraph
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEdgeRhsAccess().getEdgeRhsSubgraphParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEdgeRhsSubgraph();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEdgeRhsAccess().getEdgeRhsSubgraphParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhs__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDot.g:561:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:565:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDot.g:566:2: ( RULE_STRING )
                    {
                    // InternalMyDot.g:566:2: ( RULE_STRING )
                    // InternalMyDot.g:567:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:572:2: ( RULE_ID )
                    {
                    // InternalMyDot.g:572:2: ( RULE_ID )
                    // InternalMyDot.g:573:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__AttrList__Alternatives_2_1"
    // InternalMyDot.g:582:1: rule__AttrList__Alternatives_2_1 : ( ( ',' ) | ( ';' ) );
    public final void rule__AttrList__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:586:1: ( ( ',' ) | ( ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDot.g:587:2: ( ',' )
                    {
                    // InternalMyDot.g:587:2: ( ',' )
                    // InternalMyDot.g:588:3: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttrListAccess().getCommaKeyword_2_1_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttrListAccess().getCommaKeyword_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:593:2: ( ';' )
                    {
                    // InternalMyDot.g:593:2: ( ';' )
                    // InternalMyDot.g:594:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttrListAccess().getSemicolonKeyword_2_1_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttrListAccess().getSemicolonKeyword_2_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Alternatives_2_1"


    // $ANTLR start "rule__Port__Alternatives_2"
    // InternalMyDot.g:603:1: rule__Port__Alternatives_2 : ( ( ( rule__Port__Compass_ptAssignment_2_0 ) ) | ( ( rule__Port__NameAssignment_2_1 ) ) | ( ( rule__Port__Group_2_2__0 ) ) );
    public final void rule__Port__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:607:1: ( ( ( rule__Port__Compass_ptAssignment_2_0 ) ) | ( ( rule__Port__NameAssignment_2_1 ) ) | ( ( rule__Port__Group_2_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMPASS_PT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||(LA5_2>=RULE_STRING && LA5_2<=RULE_ID)||(LA5_2>=13 && LA5_2<=14)||(LA5_2>=16 && LA5_2<=21)||(LA5_2>=23 && LA5_2<=24)) ) {
                    alt5=2;
                }
                else if ( (LA5_2==26) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDot.g:608:2: ( ( rule__Port__Compass_ptAssignment_2_0 ) )
                    {
                    // InternalMyDot.g:608:2: ( ( rule__Port__Compass_ptAssignment_2_0 ) )
                    // InternalMyDot.g:609:3: ( rule__Port__Compass_ptAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPortAccess().getCompass_ptAssignment_2_0()); 
                    }
                    // InternalMyDot.g:610:3: ( rule__Port__Compass_ptAssignment_2_0 )
                    // InternalMyDot.g:610:4: rule__Port__Compass_ptAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__Compass_ptAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPortAccess().getCompass_ptAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:614:2: ( ( rule__Port__NameAssignment_2_1 ) )
                    {
                    // InternalMyDot.g:614:2: ( ( rule__Port__NameAssignment_2_1 ) )
                    // InternalMyDot.g:615:3: ( rule__Port__NameAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPortAccess().getNameAssignment_2_1()); 
                    }
                    // InternalMyDot.g:616:3: ( rule__Port__NameAssignment_2_1 )
                    // InternalMyDot.g:616:4: rule__Port__NameAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__NameAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPortAccess().getNameAssignment_2_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDot.g:620:2: ( ( rule__Port__Group_2_2__0 ) )
                    {
                    // InternalMyDot.g:620:2: ( ( rule__Port__Group_2_2__0 ) )
                    // InternalMyDot.g:621:3: ( rule__Port__Group_2_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPortAccess().getGroup_2_2()); 
                    }
                    // InternalMyDot.g:622:3: ( rule__Port__Group_2_2__0 )
                    // InternalMyDot.g:622:4: rule__Port__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__Group_2_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPortAccess().getGroup_2_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Alternatives_2"


    // $ANTLR start "rule__GraphType__Alternatives"
    // InternalMyDot.g:630:1: rule__GraphType__Alternatives : ( ( ( 'graph' ) ) | ( ( 'digraph' ) ) );
    public final void rule__GraphType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:634:1: ( ( ( 'graph' ) ) | ( ( 'digraph' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDot.g:635:2: ( ( 'graph' ) )
                    {
                    // InternalMyDot.g:635:2: ( ( 'graph' ) )
                    // InternalMyDot.g:636:3: ( 'graph' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphTypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }
                    // InternalMyDot.g:637:3: ( 'graph' )
                    // InternalMyDot.g:637:4: 'graph'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphTypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:641:2: ( ( 'digraph' ) )
                    {
                    // InternalMyDot.g:641:2: ( ( 'digraph' ) )
                    // InternalMyDot.g:642:3: ( 'digraph' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphTypeAccess().getDigraphEnumLiteralDeclaration_1()); 
                    }
                    // InternalMyDot.g:643:3: ( 'digraph' )
                    // InternalMyDot.g:643:4: 'digraph'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphTypeAccess().getDigraphEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphType__Alternatives"


    // $ANTLR start "rule__EdgeOp__Alternatives"
    // InternalMyDot.g:651:1: rule__EdgeOp__Alternatives : ( ( ( '->' ) ) | ( ( '--' ) ) );
    public final void rule__EdgeOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:655:1: ( ( ( '->' ) ) | ( ( '--' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDot.g:656:2: ( ( '->' ) )
                    {
                    // InternalMyDot.g:656:2: ( ( '->' ) )
                    // InternalMyDot.g:657:3: ( '->' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEdgeOpAccess().getDirectedEnumLiteralDeclaration_0()); 
                    }
                    // InternalMyDot.g:658:3: ( '->' )
                    // InternalMyDot.g:658:4: '->'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEdgeOpAccess().getDirectedEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:662:2: ( ( '--' ) )
                    {
                    // InternalMyDot.g:662:2: ( ( '--' ) )
                    // InternalMyDot.g:663:3: ( '--' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEdgeOpAccess().getUndirectedEnumLiteralDeclaration_1()); 
                    }
                    // InternalMyDot.g:664:3: ( '--' )
                    // InternalMyDot.g:664:4: '--'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEdgeOpAccess().getUndirectedEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeOp__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // InternalMyDot.g:672:1: rule__AttributeType__Alternatives : ( ( ( 'graph' ) ) | ( ( 'node' ) ) | ( ( 'edge' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:676:1: ( ( ( 'graph' ) ) | ( ( 'node' ) ) | ( ( 'edge' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDot.g:677:2: ( ( 'graph' ) )
                    {
                    // InternalMyDot.g:677:2: ( ( 'graph' ) )
                    // InternalMyDot.g:678:3: ( 'graph' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }
                    // InternalMyDot.g:679:3: ( 'graph' )
                    // InternalMyDot.g:679:4: 'graph'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:683:2: ( ( 'node' ) )
                    {
                    // InternalMyDot.g:683:2: ( ( 'node' ) )
                    // InternalMyDot.g:684:3: ( 'node' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getNodeEnumLiteralDeclaration_1()); 
                    }
                    // InternalMyDot.g:685:3: ( 'node' )
                    // InternalMyDot.g:685:4: 'node'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getNodeEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDot.g:689:2: ( ( 'edge' ) )
                    {
                    // InternalMyDot.g:689:2: ( ( 'edge' ) )
                    // InternalMyDot.g:690:3: ( 'edge' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getEdgeEnumLiteralDeclaration_2()); 
                    }
                    // InternalMyDot.g:691:3: ( 'edge' )
                    // InternalMyDot.g:691:4: 'edge'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getEdgeEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__DotAst__Group__0"
    // InternalMyDot.g:699:1: rule__DotAst__Group__0 : rule__DotAst__Group__0__Impl rule__DotAst__Group__1 ;
    public final void rule__DotAst__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:703:1: ( rule__DotAst__Group__0__Impl rule__DotAst__Group__1 )
            // InternalMyDot.g:704:2: rule__DotAst__Group__0__Impl rule__DotAst__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DotAst__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DotAst__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotAst__Group__0"


    // $ANTLR start "rule__DotAst__Group__0__Impl"
    // InternalMyDot.g:711:1: rule__DotAst__Group__0__Impl : ( () ) ;
    public final void rule__DotAst__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:715:1: ( ( () ) )
            // InternalMyDot.g:716:1: ( () )
            {
            // InternalMyDot.g:716:1: ( () )
            // InternalMyDot.g:717:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotAstAccess().getDotAstAction_0()); 
            }
            // InternalMyDot.g:718:2: ()
            // InternalMyDot.g:718:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotAstAccess().getDotAstAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotAst__Group__0__Impl"


    // $ANTLR start "rule__DotAst__Group__1"
    // InternalMyDot.g:726:1: rule__DotAst__Group__1 : rule__DotAst__Group__1__Impl ;
    public final void rule__DotAst__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:730:1: ( rule__DotAst__Group__1__Impl )
            // InternalMyDot.g:731:2: rule__DotAst__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DotAst__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotAst__Group__1"


    // $ANTLR start "rule__DotAst__Group__1__Impl"
    // InternalMyDot.g:737:1: rule__DotAst__Group__1__Impl : ( ( rule__DotAst__GraphsAssignment_1 )* ) ;
    public final void rule__DotAst__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:741:1: ( ( ( rule__DotAst__GraphsAssignment_1 )* ) )
            // InternalMyDot.g:742:1: ( ( rule__DotAst__GraphsAssignment_1 )* )
            {
            // InternalMyDot.g:742:1: ( ( rule__DotAst__GraphsAssignment_1 )* )
            // InternalMyDot.g:743:2: ( rule__DotAst__GraphsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotAstAccess().getGraphsAssignment_1()); 
            }
            // InternalMyDot.g:744:2: ( rule__DotAst__GraphsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=14 && LA9_0<=15)||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDot.g:744:3: rule__DotAst__GraphsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DotAst__GraphsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotAstAccess().getGraphsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotAst__Group__1__Impl"


    // $ANTLR start "rule__Stmt__Group__0"
    // InternalMyDot.g:753:1: rule__Stmt__Group__0 : rule__Stmt__Group__0__Impl rule__Stmt__Group__1 ;
    public final void rule__Stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:757:1: ( rule__Stmt__Group__0__Impl rule__Stmt__Group__1 )
            // InternalMyDot.g:758:2: rule__Stmt__Group__0__Impl rule__Stmt__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Stmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Stmt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__0"


    // $ANTLR start "rule__Stmt__Group__0__Impl"
    // InternalMyDot.g:765:1: rule__Stmt__Group__0__Impl : ( ( rule__Stmt__Alternatives_0 ) ) ;
    public final void rule__Stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:769:1: ( ( ( rule__Stmt__Alternatives_0 ) ) )
            // InternalMyDot.g:770:1: ( ( rule__Stmt__Alternatives_0 ) )
            {
            // InternalMyDot.g:770:1: ( ( rule__Stmt__Alternatives_0 ) )
            // InternalMyDot.g:771:2: ( rule__Stmt__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtAccess().getAlternatives_0()); 
            }
            // InternalMyDot.g:772:2: ( rule__Stmt__Alternatives_0 )
            // InternalMyDot.g:772:3: rule__Stmt__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__0__Impl"


    // $ANTLR start "rule__Stmt__Group__1"
    // InternalMyDot.g:780:1: rule__Stmt__Group__1 : rule__Stmt__Group__1__Impl ;
    public final void rule__Stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:784:1: ( rule__Stmt__Group__1__Impl )
            // InternalMyDot.g:785:2: rule__Stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__1"


    // $ANTLR start "rule__Stmt__Group__1__Impl"
    // InternalMyDot.g:791:1: rule__Stmt__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:795:1: ( ( ( ';' )? ) )
            // InternalMyDot.g:796:1: ( ( ';' )? )
            {
            // InternalMyDot.g:796:1: ( ( ';' )? )
            // InternalMyDot.g:797:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtAccess().getSemicolonKeyword_1()); 
            }
            // InternalMyDot.g:798:2: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDot.g:798:3: ';'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__1__Impl"


    // $ANTLR start "rule__DotGraph__Group__0"
    // InternalMyDot.g:807:1: rule__DotGraph__Group__0 : rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 ;
    public final void rule__DotGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:811:1: ( rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 )
            // InternalMyDot.g:812:2: rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DotGraph__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DotGraph__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__0"


    // $ANTLR start "rule__DotGraph__Group__0__Impl"
    // InternalMyDot.g:819:1: rule__DotGraph__Group__0__Impl : ( () ) ;
    public final void rule__DotGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:823:1: ( ( () ) )
            // InternalMyDot.g:824:1: ( () )
            {
            // InternalMyDot.g:824:1: ( () )
            // InternalMyDot.g:825:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getDotGraphAction_0()); 
            }
            // InternalMyDot.g:826:2: ()
            // InternalMyDot.g:826:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getDotGraphAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__0__Impl"


    // $ANTLR start "rule__DotGraph__Group__1"
    // InternalMyDot.g:834:1: rule__DotGraph__Group__1 : rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 ;
    public final void rule__DotGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:838:1: ( rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 )
            // InternalMyDot.g:839:2: rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DotGraph__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DotGraph__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__1"


    // $ANTLR start "rule__DotGraph__Group__1__Impl"
    // InternalMyDot.g:846:1: rule__DotGraph__Group__1__Impl : ( ( rule__DotGraph__StrictAssignment_1 )? ) ;
    public final void rule__DotGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:850:1: ( ( ( rule__DotGraph__StrictAssignment_1 )? ) )
            // InternalMyDot.g:851:1: ( ( rule__DotGraph__StrictAssignment_1 )? )
            {
            // InternalMyDot.g:851:1: ( ( rule__DotGraph__StrictAssignment_1 )? )
            // InternalMyDot.g:852:2: ( rule__DotGraph__StrictAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getStrictAssignment_1()); 
            }
            // InternalMyDot.g:853:2: ( rule__DotGraph__StrictAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDot.g:853:3: rule__DotGraph__StrictAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DotGraph__StrictAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getStrictAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__1__Impl"


    // $ANTLR start "rule__DotGraph__Group__2"
    // InternalMyDot.g:861:1: rule__DotGraph__Group__2 : rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 ;
    public final void rule__DotGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:865:1: ( rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 )
            // InternalMyDot.g:866:2: rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DotGraph__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DotGraph__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__2"


    // $ANTLR start "rule__DotGraph__Group__2__Impl"
    // InternalMyDot.g:873:1: rule__DotGraph__Group__2__Impl : ( ( rule__DotGraph__TypeAssignment_2 ) ) ;
    public final void rule__DotGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:877:1: ( ( ( rule__DotGraph__TypeAssignment_2 ) ) )
            // InternalMyDot.g:878:1: ( ( rule__DotGraph__TypeAssignment_2 ) )
            {
            // InternalMyDot.g:878:1: ( ( rule__DotGraph__TypeAssignment_2 ) )
            // InternalMyDot.g:879:2: ( rule__DotGraph__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getTypeAssignment_2()); 
            }
            // InternalMyDot.g:880:2: ( rule__DotGraph__TypeAssignment_2 )
            // InternalMyDot.g:880:3: rule__DotGraph__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DotGraph__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__2__Impl"


    // $ANTLR start "rule__DotGraph__Group__3"
    // InternalMyDot.g:888:1: rule__DotGraph__Group__3 : rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 ;
    public final void rule__DotGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:892:1: ( rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 )
            // InternalMyDot.g:893:2: rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DotGraph__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DotGraph__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__3"


    // $ANTLR start "rule__DotGraph__Group__3__Impl"
    // InternalMyDot.g:900:1: rule__DotGraph__Group__3__Impl : ( ( rule__DotGraph__NameAssignment_3 )? ) ;
    public final void rule__DotGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:904:1: ( ( ( rule__DotGraph__NameAssignment_3 )? ) )
            // InternalMyDot.g:905:1: ( ( rule__DotGraph__NameAssignment_3 )? )
            {
            // InternalMyDot.g:905:1: ( ( rule__DotGraph__NameAssignment_3 )? )
            // InternalMyDot.g:906:2: ( rule__DotGraph__NameAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getNameAssignment_3()); 
            }
            // InternalMyDot.g:907:2: ( rule__DotGraph__NameAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDot.g:907:3: rule__DotGraph__NameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DotGraph__NameAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__3__Impl"


    // $ANTLR start "rule__DotGraph__Group__4"
    // InternalMyDot.g:915:1: rule__DotGraph__Group__4 : rule__DotGraph__Group__4__Impl rule__DotGraph__Group__5 ;
    public final void rule__DotGraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:919:1: ( rule__DotGraph__Group__4__Impl rule__DotGraph__Group__5 )
            // InternalMyDot.g:920:2: rule__DotGraph__Group__4__Impl rule__DotGraph__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__DotGraph__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DotGraph__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__4"


    // $ANTLR start "rule__DotGraph__Group__4__Impl"
    // InternalMyDot.g:927:1: rule__DotGraph__Group__4__Impl : ( '{' ) ;
    public final void rule__DotGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:931:1: ( ( '{' ) )
            // InternalMyDot.g:932:1: ( '{' )
            {
            // InternalMyDot.g:932:1: ( '{' )
            // InternalMyDot.g:933:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__4__Impl"


    // $ANTLR start "rule__DotGraph__Group__5"
    // InternalMyDot.g:942:1: rule__DotGraph__Group__5 : rule__DotGraph__Group__5__Impl rule__DotGraph__Group__6 ;
    public final void rule__DotGraph__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:946:1: ( rule__DotGraph__Group__5__Impl rule__DotGraph__Group__6 )
            // InternalMyDot.g:947:2: rule__DotGraph__Group__5__Impl rule__DotGraph__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__DotGraph__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DotGraph__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__5"


    // $ANTLR start "rule__DotGraph__Group__5__Impl"
    // InternalMyDot.g:954:1: rule__DotGraph__Group__5__Impl : ( ( rule__DotGraph__StmtsAssignment_5 )* ) ;
    public final void rule__DotGraph__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:958:1: ( ( ( rule__DotGraph__StmtsAssignment_5 )* ) )
            // InternalMyDot.g:959:1: ( ( rule__DotGraph__StmtsAssignment_5 )* )
            {
            // InternalMyDot.g:959:1: ( ( rule__DotGraph__StmtsAssignment_5 )* )
            // InternalMyDot.g:960:2: ( rule__DotGraph__StmtsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getStmtsAssignment_5()); 
            }
            // InternalMyDot.g:961:2: ( rule__DotGraph__StmtsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||LA13_0==14||(LA13_0>=18 && LA13_0<=20)||LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDot.g:961:3: rule__DotGraph__StmtsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DotGraph__StmtsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getStmtsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__5__Impl"


    // $ANTLR start "rule__DotGraph__Group__6"
    // InternalMyDot.g:969:1: rule__DotGraph__Group__6 : rule__DotGraph__Group__6__Impl ;
    public final void rule__DotGraph__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:973:1: ( rule__DotGraph__Group__6__Impl )
            // InternalMyDot.g:974:2: rule__DotGraph__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DotGraph__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__6"


    // $ANTLR start "rule__DotGraph__Group__6__Impl"
    // InternalMyDot.g:980:1: rule__DotGraph__Group__6__Impl : ( '}' ) ;
    public final void rule__DotGraph__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:984:1: ( ( '}' ) )
            // InternalMyDot.g:985:1: ( '}' )
            {
            // InternalMyDot.g:985:1: ( '}' )
            // InternalMyDot.g:986:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__6__Impl"


    // $ANTLR start "rule__EdgeStmtNode__Group__0"
    // InternalMyDot.g:996:1: rule__EdgeStmtNode__Group__0 : rule__EdgeStmtNode__Group__0__Impl rule__EdgeStmtNode__Group__1 ;
    public final void rule__EdgeStmtNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1000:1: ( rule__EdgeStmtNode__Group__0__Impl rule__EdgeStmtNode__Group__1 )
            // InternalMyDot.g:1001:2: rule__EdgeStmtNode__Group__0__Impl rule__EdgeStmtNode__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EdgeStmtNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EdgeStmtNode__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__0"


    // $ANTLR start "rule__EdgeStmtNode__Group__0__Impl"
    // InternalMyDot.g:1008:1: rule__EdgeStmtNode__Group__0__Impl : ( () ) ;
    public final void rule__EdgeStmtNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1012:1: ( ( () ) )
            // InternalMyDot.g:1013:1: ( () )
            {
            // InternalMyDot.g:1013:1: ( () )
            // InternalMyDot.g:1014:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getEdgeStmtNodeAction_0()); 
            }
            // InternalMyDot.g:1015:2: ()
            // InternalMyDot.g:1015:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getEdgeStmtNodeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__0__Impl"


    // $ANTLR start "rule__EdgeStmtNode__Group__1"
    // InternalMyDot.g:1023:1: rule__EdgeStmtNode__Group__1 : rule__EdgeStmtNode__Group__1__Impl rule__EdgeStmtNode__Group__2 ;
    public final void rule__EdgeStmtNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1027:1: ( rule__EdgeStmtNode__Group__1__Impl rule__EdgeStmtNode__Group__2 )
            // InternalMyDot.g:1028:2: rule__EdgeStmtNode__Group__1__Impl rule__EdgeStmtNode__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EdgeStmtNode__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EdgeStmtNode__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__1"


    // $ANTLR start "rule__EdgeStmtNode__Group__1__Impl"
    // InternalMyDot.g:1035:1: rule__EdgeStmtNode__Group__1__Impl : ( ( rule__EdgeStmtNode__NodeAssignment_1 ) ) ;
    public final void rule__EdgeStmtNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1039:1: ( ( ( rule__EdgeStmtNode__NodeAssignment_1 ) ) )
            // InternalMyDot.g:1040:1: ( ( rule__EdgeStmtNode__NodeAssignment_1 ) )
            {
            // InternalMyDot.g:1040:1: ( ( rule__EdgeStmtNode__NodeAssignment_1 ) )
            // InternalMyDot.g:1041:2: ( rule__EdgeStmtNode__NodeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getNodeAssignment_1()); 
            }
            // InternalMyDot.g:1042:2: ( rule__EdgeStmtNode__NodeAssignment_1 )
            // InternalMyDot.g:1042:3: rule__EdgeStmtNode__NodeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStmtNode__NodeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getNodeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__1__Impl"


    // $ANTLR start "rule__EdgeStmtNode__Group__2"
    // InternalMyDot.g:1050:1: rule__EdgeStmtNode__Group__2 : rule__EdgeStmtNode__Group__2__Impl rule__EdgeStmtNode__Group__3 ;
    public final void rule__EdgeStmtNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1054:1: ( rule__EdgeStmtNode__Group__2__Impl rule__EdgeStmtNode__Group__3 )
            // InternalMyDot.g:1055:2: rule__EdgeStmtNode__Group__2__Impl rule__EdgeStmtNode__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__EdgeStmtNode__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EdgeStmtNode__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__2"


    // $ANTLR start "rule__EdgeStmtNode__Group__2__Impl"
    // InternalMyDot.g:1062:1: rule__EdgeStmtNode__Group__2__Impl : ( ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 ) ) ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 )* ) ) ;
    public final void rule__EdgeStmtNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1066:1: ( ( ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 ) ) ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 )* ) ) )
            // InternalMyDot.g:1067:1: ( ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 ) ) ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 )* ) )
            {
            // InternalMyDot.g:1067:1: ( ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 ) ) ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 )* ) )
            // InternalMyDot.g:1068:2: ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 ) ) ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 )* )
            {
            // InternalMyDot.g:1068:2: ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 ) )
            // InternalMyDot.g:1069:3: ( rule__EdgeStmtNode__EdgeRHSAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSAssignment_2()); 
            }
            // InternalMyDot.g:1070:3: ( rule__EdgeStmtNode__EdgeRHSAssignment_2 )
            // InternalMyDot.g:1070:4: rule__EdgeStmtNode__EdgeRHSAssignment_2
            {
            pushFollow(FOLLOW_12);
            rule__EdgeStmtNode__EdgeRHSAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSAssignment_2()); 
            }

            }

            // InternalMyDot.g:1073:2: ( ( rule__EdgeStmtNode__EdgeRHSAssignment_2 )* )
            // InternalMyDot.g:1074:3: ( rule__EdgeStmtNode__EdgeRHSAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSAssignment_2()); 
            }
            // InternalMyDot.g:1075:3: ( rule__EdgeStmtNode__EdgeRHSAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=16 && LA14_0<=17)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDot.g:1075:4: rule__EdgeStmtNode__EdgeRHSAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EdgeStmtNode__EdgeRHSAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSAssignment_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__2__Impl"


    // $ANTLR start "rule__EdgeStmtNode__Group__3"
    // InternalMyDot.g:1084:1: rule__EdgeStmtNode__Group__3 : rule__EdgeStmtNode__Group__3__Impl ;
    public final void rule__EdgeStmtNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1088:1: ( rule__EdgeStmtNode__Group__3__Impl )
            // InternalMyDot.g:1089:2: rule__EdgeStmtNode__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeStmtNode__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__3"


    // $ANTLR start "rule__EdgeStmtNode__Group__3__Impl"
    // InternalMyDot.g:1095:1: rule__EdgeStmtNode__Group__3__Impl : ( ( rule__EdgeStmtNode__AttrListsAssignment_3 )* ) ;
    public final void rule__EdgeStmtNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1099:1: ( ( ( rule__EdgeStmtNode__AttrListsAssignment_3 )* ) )
            // InternalMyDot.g:1100:1: ( ( rule__EdgeStmtNode__AttrListsAssignment_3 )* )
            {
            // InternalMyDot.g:1100:1: ( ( rule__EdgeStmtNode__AttrListsAssignment_3 )* )
            // InternalMyDot.g:1101:2: ( rule__EdgeStmtNode__AttrListsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getAttrListsAssignment_3()); 
            }
            // InternalMyDot.g:1102:2: ( rule__EdgeStmtNode__AttrListsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDot.g:1102:3: rule__EdgeStmtNode__AttrListsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EdgeStmtNode__AttrListsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getAttrListsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__3__Impl"


    // $ANTLR start "rule__NodeStmt__Group__0"
    // InternalMyDot.g:1111:1: rule__NodeStmt__Group__0 : rule__NodeStmt__Group__0__Impl rule__NodeStmt__Group__1 ;
    public final void rule__NodeStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1115:1: ( rule__NodeStmt__Group__0__Impl rule__NodeStmt__Group__1 )
            // InternalMyDot.g:1116:2: rule__NodeStmt__Group__0__Impl rule__NodeStmt__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NodeStmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeStmt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__Group__0"


    // $ANTLR start "rule__NodeStmt__Group__0__Impl"
    // InternalMyDot.g:1123:1: rule__NodeStmt__Group__0__Impl : ( () ) ;
    public final void rule__NodeStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1127:1: ( ( () ) )
            // InternalMyDot.g:1128:1: ( () )
            {
            // InternalMyDot.g:1128:1: ( () )
            // InternalMyDot.g:1129:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtAccess().getNodeStmtAction_0()); 
            }
            // InternalMyDot.g:1130:2: ()
            // InternalMyDot.g:1130:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtAccess().getNodeStmtAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__Group__0__Impl"


    // $ANTLR start "rule__NodeStmt__Group__1"
    // InternalMyDot.g:1138:1: rule__NodeStmt__Group__1 : rule__NodeStmt__Group__1__Impl rule__NodeStmt__Group__2 ;
    public final void rule__NodeStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1142:1: ( rule__NodeStmt__Group__1__Impl rule__NodeStmt__Group__2 )
            // InternalMyDot.g:1143:2: rule__NodeStmt__Group__1__Impl rule__NodeStmt__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__NodeStmt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeStmt__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__Group__1"


    // $ANTLR start "rule__NodeStmt__Group__1__Impl"
    // InternalMyDot.g:1150:1: rule__NodeStmt__Group__1__Impl : ( ( rule__NodeStmt__NodeAssignment_1 ) ) ;
    public final void rule__NodeStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1154:1: ( ( ( rule__NodeStmt__NodeAssignment_1 ) ) )
            // InternalMyDot.g:1155:1: ( ( rule__NodeStmt__NodeAssignment_1 ) )
            {
            // InternalMyDot.g:1155:1: ( ( rule__NodeStmt__NodeAssignment_1 ) )
            // InternalMyDot.g:1156:2: ( rule__NodeStmt__NodeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtAccess().getNodeAssignment_1()); 
            }
            // InternalMyDot.g:1157:2: ( rule__NodeStmt__NodeAssignment_1 )
            // InternalMyDot.g:1157:3: rule__NodeStmt__NodeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeStmt__NodeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtAccess().getNodeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__Group__1__Impl"


    // $ANTLR start "rule__NodeStmt__Group__2"
    // InternalMyDot.g:1165:1: rule__NodeStmt__Group__2 : rule__NodeStmt__Group__2__Impl ;
    public final void rule__NodeStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1169:1: ( rule__NodeStmt__Group__2__Impl )
            // InternalMyDot.g:1170:2: rule__NodeStmt__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeStmt__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__Group__2"


    // $ANTLR start "rule__NodeStmt__Group__2__Impl"
    // InternalMyDot.g:1176:1: rule__NodeStmt__Group__2__Impl : ( ( rule__NodeStmt__AttrListsAssignment_2 )* ) ;
    public final void rule__NodeStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1180:1: ( ( ( rule__NodeStmt__AttrListsAssignment_2 )* ) )
            // InternalMyDot.g:1181:1: ( ( rule__NodeStmt__AttrListsAssignment_2 )* )
            {
            // InternalMyDot.g:1181:1: ( ( rule__NodeStmt__AttrListsAssignment_2 )* )
            // InternalMyDot.g:1182:2: ( rule__NodeStmt__AttrListsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtAccess().getAttrListsAssignment_2()); 
            }
            // InternalMyDot.g:1183:2: ( rule__NodeStmt__AttrListsAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDot.g:1183:3: rule__NodeStmt__AttrListsAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NodeStmt__AttrListsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtAccess().getAttrListsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__Group__2__Impl"


    // $ANTLR start "rule__AttrStmt__Group__0"
    // InternalMyDot.g:1192:1: rule__AttrStmt__Group__0 : rule__AttrStmt__Group__0__Impl rule__AttrStmt__Group__1 ;
    public final void rule__AttrStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1196:1: ( rule__AttrStmt__Group__0__Impl rule__AttrStmt__Group__1 )
            // InternalMyDot.g:1197:2: rule__AttrStmt__Group__0__Impl rule__AttrStmt__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AttrStmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttrStmt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__Group__0"


    // $ANTLR start "rule__AttrStmt__Group__0__Impl"
    // InternalMyDot.g:1204:1: rule__AttrStmt__Group__0__Impl : ( () ) ;
    public final void rule__AttrStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1208:1: ( ( () ) )
            // InternalMyDot.g:1209:1: ( () )
            {
            // InternalMyDot.g:1209:1: ( () )
            // InternalMyDot.g:1210:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getAttrStmtAction_0()); 
            }
            // InternalMyDot.g:1211:2: ()
            // InternalMyDot.g:1211:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getAttrStmtAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__Group__0__Impl"


    // $ANTLR start "rule__AttrStmt__Group__1"
    // InternalMyDot.g:1219:1: rule__AttrStmt__Group__1 : rule__AttrStmt__Group__1__Impl rule__AttrStmt__Group__2 ;
    public final void rule__AttrStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1223:1: ( rule__AttrStmt__Group__1__Impl rule__AttrStmt__Group__2 )
            // InternalMyDot.g:1224:2: rule__AttrStmt__Group__1__Impl rule__AttrStmt__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__AttrStmt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttrStmt__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__Group__1"


    // $ANTLR start "rule__AttrStmt__Group__1__Impl"
    // InternalMyDot.g:1231:1: rule__AttrStmt__Group__1__Impl : ( ( rule__AttrStmt__TypeAssignment_1 ) ) ;
    public final void rule__AttrStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1235:1: ( ( ( rule__AttrStmt__TypeAssignment_1 ) ) )
            // InternalMyDot.g:1236:1: ( ( rule__AttrStmt__TypeAssignment_1 ) )
            {
            // InternalMyDot.g:1236:1: ( ( rule__AttrStmt__TypeAssignment_1 ) )
            // InternalMyDot.g:1237:2: ( rule__AttrStmt__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getTypeAssignment_1()); 
            }
            // InternalMyDot.g:1238:2: ( rule__AttrStmt__TypeAssignment_1 )
            // InternalMyDot.g:1238:3: rule__AttrStmt__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttrStmt__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__Group__1__Impl"


    // $ANTLR start "rule__AttrStmt__Group__2"
    // InternalMyDot.g:1246:1: rule__AttrStmt__Group__2 : rule__AttrStmt__Group__2__Impl ;
    public final void rule__AttrStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1250:1: ( rule__AttrStmt__Group__2__Impl )
            // InternalMyDot.g:1251:2: rule__AttrStmt__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrStmt__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__Group__2"


    // $ANTLR start "rule__AttrStmt__Group__2__Impl"
    // InternalMyDot.g:1257:1: rule__AttrStmt__Group__2__Impl : ( ( ( rule__AttrStmt__AttrListsAssignment_2 ) ) ( ( rule__AttrStmt__AttrListsAssignment_2 )* ) ) ;
    public final void rule__AttrStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1261:1: ( ( ( ( rule__AttrStmt__AttrListsAssignment_2 ) ) ( ( rule__AttrStmt__AttrListsAssignment_2 )* ) ) )
            // InternalMyDot.g:1262:1: ( ( ( rule__AttrStmt__AttrListsAssignment_2 ) ) ( ( rule__AttrStmt__AttrListsAssignment_2 )* ) )
            {
            // InternalMyDot.g:1262:1: ( ( ( rule__AttrStmt__AttrListsAssignment_2 ) ) ( ( rule__AttrStmt__AttrListsAssignment_2 )* ) )
            // InternalMyDot.g:1263:2: ( ( rule__AttrStmt__AttrListsAssignment_2 ) ) ( ( rule__AttrStmt__AttrListsAssignment_2 )* )
            {
            // InternalMyDot.g:1263:2: ( ( rule__AttrStmt__AttrListsAssignment_2 ) )
            // InternalMyDot.g:1264:3: ( rule__AttrStmt__AttrListsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getAttrListsAssignment_2()); 
            }
            // InternalMyDot.g:1265:3: ( rule__AttrStmt__AttrListsAssignment_2 )
            // InternalMyDot.g:1265:4: rule__AttrStmt__AttrListsAssignment_2
            {
            pushFollow(FOLLOW_13);
            rule__AttrStmt__AttrListsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getAttrListsAssignment_2()); 
            }

            }

            // InternalMyDot.g:1268:2: ( ( rule__AttrStmt__AttrListsAssignment_2 )* )
            // InternalMyDot.g:1269:3: ( rule__AttrStmt__AttrListsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getAttrListsAssignment_2()); 
            }
            // InternalMyDot.g:1270:3: ( rule__AttrStmt__AttrListsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDot.g:1270:4: rule__AttrStmt__AttrListsAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AttrStmt__AttrListsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getAttrListsAssignment_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDot.g:1280:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1284:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDot.g:1285:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDot.g:1292:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1296:1: ( ( () ) )
            // InternalMyDot.g:1297:1: ( () )
            {
            // InternalMyDot.g:1297:1: ( () )
            // InternalMyDot.g:1298:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            }
            // InternalMyDot.g:1299:2: ()
            // InternalMyDot.g:1299:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDot.g:1307:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1311:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDot.g:1312:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDot.g:1319:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1323:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDot.g:1324:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDot.g:1324:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDot.g:1325:2: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // InternalMyDot.g:1326:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDot.g:1326:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDot.g:1334:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1338:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDot.g:1339:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDot.g:1346:1: rule__Attribute__Group__2__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1350:1: ( ( '=' ) )
            // InternalMyDot.g:1351:1: ( '=' )
            {
            // InternalMyDot.g:1351:1: ( '=' )
            // InternalMyDot.g:1352:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalMyDot.g:1361:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1365:1: ( rule__Attribute__Group__3__Impl )
            // InternalMyDot.g:1366:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalMyDot.g:1372:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__ValueAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1376:1: ( ( ( rule__Attribute__ValueAssignment_3 ) ) )
            // InternalMyDot.g:1377:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            {
            // InternalMyDot.g:1377:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            // InternalMyDot.g:1378:2: ( rule__Attribute__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_3()); 
            }
            // InternalMyDot.g:1379:2: ( rule__Attribute__ValueAssignment_3 )
            // InternalMyDot.g:1379:3: rule__Attribute__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group__0"
    // InternalMyDot.g:1388:1: rule__SubgraphOrEdgeStmtSubgraph__Group__0 : rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group__1 ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1392:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group__1 )
            // InternalMyDot.g:1393:2: rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubgraphOrEdgeStmtSubgraph__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group__0"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl"
    // InternalMyDot.g:1400:1: rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl : ( ruleSubgraph ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1404:1: ( ( ruleSubgraph ) )
            // InternalMyDot.g:1405:1: ( ruleSubgraph )
            {
            // InternalMyDot.g:1405:1: ( ruleSubgraph )
            // InternalMyDot.g:1406:2: ruleSubgraph
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getSubgraphParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubgraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getSubgraphParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group__1"
    // InternalMyDot.g:1415:1: rule__SubgraphOrEdgeStmtSubgraph__Group__1 : rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1419:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl )
            // InternalMyDot.g:1420:2: rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group__1"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl"
    // InternalMyDot.g:1426:1: rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl : ( ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )? ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1430:1: ( ( ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )? ) )
            // InternalMyDot.g:1431:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )? )
            {
            // InternalMyDot.g:1431:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )? )
            // InternalMyDot.g:1432:2: ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getGroup_1()); 
            }
            // InternalMyDot.g:1433:2: ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=16 && LA18_0<=17)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDot.g:1433:3: rule__SubgraphOrEdgeStmtSubgraph__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubgraphOrEdgeStmtSubgraph__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__0"
    // InternalMyDot.g:1442:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 : rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__1 ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1446:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__1 )
            // InternalMyDot.g:1447:2: rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubgraphOrEdgeStmtSubgraph__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__0"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl"
    // InternalMyDot.g:1454:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl : ( () ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1458:1: ( ( () ) )
            // InternalMyDot.g:1459:1: ( () )
            {
            // InternalMyDot.g:1459:1: ( () )
            // InternalMyDot.g:1460:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeStmtSubgraphSubgraphAction_1_0()); 
            }
            // InternalMyDot.g:1461:2: ()
            // InternalMyDot.g:1461:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeStmtSubgraphSubgraphAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__1"
    // InternalMyDot.g:1469:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__1 : rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__2 ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1473:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__2 )
            // InternalMyDot.g:1474:2: rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubgraphOrEdgeStmtSubgraph__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__1"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl"
    // InternalMyDot.g:1481:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl : ( ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) ) ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* ) ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1485:1: ( ( ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) ) ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* ) ) )
            // InternalMyDot.g:1486:1: ( ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) ) ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* ) )
            {
            // InternalMyDot.g:1486:1: ( ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) ) ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* ) )
            // InternalMyDot.g:1487:2: ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) ) ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* )
            {
            // InternalMyDot.g:1487:2: ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) )
            // InternalMyDot.g:1488:3: ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSAssignment_1_1()); 
            }
            // InternalMyDot.g:1489:3: ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )
            // InternalMyDot.g:1489:4: rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1
            {
            pushFollow(FOLLOW_12);
            rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSAssignment_1_1()); 
            }

            }

            // InternalMyDot.g:1492:2: ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* )
            // InternalMyDot.g:1493:3: ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSAssignment_1_1()); 
            }
            // InternalMyDot.g:1494:3: ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=16 && LA19_0<=17)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDot.g:1494:4: rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSAssignment_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__2"
    // InternalMyDot.g:1503:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__2 : rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1507:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl )
            // InternalMyDot.g:1508:2: rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__2"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl"
    // InternalMyDot.g:1514:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl : ( ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )* ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1518:1: ( ( ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )* ) )
            // InternalMyDot.g:1519:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )* )
            {
            // InternalMyDot.g:1519:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )* )
            // InternalMyDot.g:1520:2: ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getAttrListsAssignment_1_2()); 
            }
            // InternalMyDot.g:1521:2: ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDot.g:1521:3: rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getAttrListsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl"


    // $ANTLR start "rule__Subgraph__Group__0"
    // InternalMyDot.g:1530:1: rule__Subgraph__Group__0 : rule__Subgraph__Group__0__Impl rule__Subgraph__Group__1 ;
    public final void rule__Subgraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1534:1: ( rule__Subgraph__Group__0__Impl rule__Subgraph__Group__1 )
            // InternalMyDot.g:1535:2: rule__Subgraph__Group__0__Impl rule__Subgraph__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Subgraph__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Subgraph__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__0"


    // $ANTLR start "rule__Subgraph__Group__0__Impl"
    // InternalMyDot.g:1542:1: rule__Subgraph__Group__0__Impl : ( () ) ;
    public final void rule__Subgraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1546:1: ( ( () ) )
            // InternalMyDot.g:1547:1: ( () )
            {
            // InternalMyDot.g:1547:1: ( () )
            // InternalMyDot.g:1548:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getSubgraphAction_0()); 
            }
            // InternalMyDot.g:1549:2: ()
            // InternalMyDot.g:1549:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getSubgraphAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__0__Impl"


    // $ANTLR start "rule__Subgraph__Group__1"
    // InternalMyDot.g:1557:1: rule__Subgraph__Group__1 : rule__Subgraph__Group__1__Impl rule__Subgraph__Group__2 ;
    public final void rule__Subgraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1561:1: ( rule__Subgraph__Group__1__Impl rule__Subgraph__Group__2 )
            // InternalMyDot.g:1562:2: rule__Subgraph__Group__1__Impl rule__Subgraph__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Subgraph__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Subgraph__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__1"


    // $ANTLR start "rule__Subgraph__Group__1__Impl"
    // InternalMyDot.g:1569:1: rule__Subgraph__Group__1__Impl : ( ( rule__Subgraph__Group_1__0 )? ) ;
    public final void rule__Subgraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1573:1: ( ( ( rule__Subgraph__Group_1__0 )? ) )
            // InternalMyDot.g:1574:1: ( ( rule__Subgraph__Group_1__0 )? )
            {
            // InternalMyDot.g:1574:1: ( ( rule__Subgraph__Group_1__0 )? )
            // InternalMyDot.g:1575:2: ( rule__Subgraph__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getGroup_1()); 
            }
            // InternalMyDot.g:1576:2: ( rule__Subgraph__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDot.g:1576:3: rule__Subgraph__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subgraph__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__1__Impl"


    // $ANTLR start "rule__Subgraph__Group__2"
    // InternalMyDot.g:1584:1: rule__Subgraph__Group__2 : rule__Subgraph__Group__2__Impl rule__Subgraph__Group__3 ;
    public final void rule__Subgraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1588:1: ( rule__Subgraph__Group__2__Impl rule__Subgraph__Group__3 )
            // InternalMyDot.g:1589:2: rule__Subgraph__Group__2__Impl rule__Subgraph__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Subgraph__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Subgraph__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__2"


    // $ANTLR start "rule__Subgraph__Group__2__Impl"
    // InternalMyDot.g:1596:1: rule__Subgraph__Group__2__Impl : ( '{' ) ;
    public final void rule__Subgraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1600:1: ( ( '{' ) )
            // InternalMyDot.g:1601:1: ( '{' )
            {
            // InternalMyDot.g:1601:1: ( '{' )
            // InternalMyDot.g:1602:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__2__Impl"


    // $ANTLR start "rule__Subgraph__Group__3"
    // InternalMyDot.g:1611:1: rule__Subgraph__Group__3 : rule__Subgraph__Group__3__Impl rule__Subgraph__Group__4 ;
    public final void rule__Subgraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1615:1: ( rule__Subgraph__Group__3__Impl rule__Subgraph__Group__4 )
            // InternalMyDot.g:1616:2: rule__Subgraph__Group__3__Impl rule__Subgraph__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Subgraph__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Subgraph__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__3"


    // $ANTLR start "rule__Subgraph__Group__3__Impl"
    // InternalMyDot.g:1623:1: rule__Subgraph__Group__3__Impl : ( ( rule__Subgraph__StmtsAssignment_3 )* ) ;
    public final void rule__Subgraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1627:1: ( ( ( rule__Subgraph__StmtsAssignment_3 )* ) )
            // InternalMyDot.g:1628:1: ( ( rule__Subgraph__StmtsAssignment_3 )* )
            {
            // InternalMyDot.g:1628:1: ( ( rule__Subgraph__StmtsAssignment_3 )* )
            // InternalMyDot.g:1629:2: ( rule__Subgraph__StmtsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getStmtsAssignment_3()); 
            }
            // InternalMyDot.g:1630:2: ( rule__Subgraph__StmtsAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||LA22_0==14||(LA22_0>=18 && LA22_0<=20)||LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDot.g:1630:3: rule__Subgraph__StmtsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Subgraph__StmtsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getStmtsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__3__Impl"


    // $ANTLR start "rule__Subgraph__Group__4"
    // InternalMyDot.g:1638:1: rule__Subgraph__Group__4 : rule__Subgraph__Group__4__Impl ;
    public final void rule__Subgraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1642:1: ( rule__Subgraph__Group__4__Impl )
            // InternalMyDot.g:1643:2: rule__Subgraph__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subgraph__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__4"


    // $ANTLR start "rule__Subgraph__Group__4__Impl"
    // InternalMyDot.g:1649:1: rule__Subgraph__Group__4__Impl : ( '}' ) ;
    public final void rule__Subgraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1653:1: ( ( '}' ) )
            // InternalMyDot.g:1654:1: ( '}' )
            {
            // InternalMyDot.g:1654:1: ( '}' )
            // InternalMyDot.g:1655:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__4__Impl"


    // $ANTLR start "rule__Subgraph__Group_1__0"
    // InternalMyDot.g:1665:1: rule__Subgraph__Group_1__0 : rule__Subgraph__Group_1__0__Impl rule__Subgraph__Group_1__1 ;
    public final void rule__Subgraph__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1669:1: ( rule__Subgraph__Group_1__0__Impl rule__Subgraph__Group_1__1 )
            // InternalMyDot.g:1670:2: rule__Subgraph__Group_1__0__Impl rule__Subgraph__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Subgraph__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Subgraph__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group_1__0"


    // $ANTLR start "rule__Subgraph__Group_1__0__Impl"
    // InternalMyDot.g:1677:1: rule__Subgraph__Group_1__0__Impl : ( 'subgraph' ) ;
    public final void rule__Subgraph__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1681:1: ( ( 'subgraph' ) )
            // InternalMyDot.g:1682:1: ( 'subgraph' )
            {
            // InternalMyDot.g:1682:1: ( 'subgraph' )
            // InternalMyDot.g:1683:2: 'subgraph'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getSubgraphKeyword_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getSubgraphKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group_1__0__Impl"


    // $ANTLR start "rule__Subgraph__Group_1__1"
    // InternalMyDot.g:1692:1: rule__Subgraph__Group_1__1 : rule__Subgraph__Group_1__1__Impl ;
    public final void rule__Subgraph__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1696:1: ( rule__Subgraph__Group_1__1__Impl )
            // InternalMyDot.g:1697:2: rule__Subgraph__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subgraph__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group_1__1"


    // $ANTLR start "rule__Subgraph__Group_1__1__Impl"
    // InternalMyDot.g:1703:1: rule__Subgraph__Group_1__1__Impl : ( ( rule__Subgraph__NameAssignment_1_1 )? ) ;
    public final void rule__Subgraph__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1707:1: ( ( ( rule__Subgraph__NameAssignment_1_1 )? ) )
            // InternalMyDot.g:1708:1: ( ( rule__Subgraph__NameAssignment_1_1 )? )
            {
            // InternalMyDot.g:1708:1: ( ( rule__Subgraph__NameAssignment_1_1 )? )
            // InternalMyDot.g:1709:2: ( rule__Subgraph__NameAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getNameAssignment_1_1()); 
            }
            // InternalMyDot.g:1710:2: ( rule__Subgraph__NameAssignment_1_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDot.g:1710:3: rule__Subgraph__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subgraph__NameAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group_1__1__Impl"


    // $ANTLR start "rule__NodeId__Group__0"
    // InternalMyDot.g:1719:1: rule__NodeId__Group__0 : rule__NodeId__Group__0__Impl rule__NodeId__Group__1 ;
    public final void rule__NodeId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1723:1: ( rule__NodeId__Group__0__Impl rule__NodeId__Group__1 )
            // InternalMyDot.g:1724:2: rule__NodeId__Group__0__Impl rule__NodeId__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NodeId__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeId__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__Group__0"


    // $ANTLR start "rule__NodeId__Group__0__Impl"
    // InternalMyDot.g:1731:1: rule__NodeId__Group__0__Impl : ( () ) ;
    public final void rule__NodeId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1735:1: ( ( () ) )
            // InternalMyDot.g:1736:1: ( () )
            {
            // InternalMyDot.g:1736:1: ( () )
            // InternalMyDot.g:1737:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdAccess().getNodeIdAction_0()); 
            }
            // InternalMyDot.g:1738:2: ()
            // InternalMyDot.g:1738:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdAccess().getNodeIdAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__Group__0__Impl"


    // $ANTLR start "rule__NodeId__Group__1"
    // InternalMyDot.g:1746:1: rule__NodeId__Group__1 : rule__NodeId__Group__1__Impl rule__NodeId__Group__2 ;
    public final void rule__NodeId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1750:1: ( rule__NodeId__Group__1__Impl rule__NodeId__Group__2 )
            // InternalMyDot.g:1751:2: rule__NodeId__Group__1__Impl rule__NodeId__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__NodeId__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeId__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__Group__1"


    // $ANTLR start "rule__NodeId__Group__1__Impl"
    // InternalMyDot.g:1758:1: rule__NodeId__Group__1__Impl : ( ( rule__NodeId__NameAssignment_1 ) ) ;
    public final void rule__NodeId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1762:1: ( ( ( rule__NodeId__NameAssignment_1 ) ) )
            // InternalMyDot.g:1763:1: ( ( rule__NodeId__NameAssignment_1 ) )
            {
            // InternalMyDot.g:1763:1: ( ( rule__NodeId__NameAssignment_1 ) )
            // InternalMyDot.g:1764:2: ( rule__NodeId__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdAccess().getNameAssignment_1()); 
            }
            // InternalMyDot.g:1765:2: ( rule__NodeId__NameAssignment_1 )
            // InternalMyDot.g:1765:3: rule__NodeId__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeId__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__Group__1__Impl"


    // $ANTLR start "rule__NodeId__Group__2"
    // InternalMyDot.g:1773:1: rule__NodeId__Group__2 : rule__NodeId__Group__2__Impl ;
    public final void rule__NodeId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1777:1: ( rule__NodeId__Group__2__Impl )
            // InternalMyDot.g:1778:2: rule__NodeId__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeId__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__Group__2"


    // $ANTLR start "rule__NodeId__Group__2__Impl"
    // InternalMyDot.g:1784:1: rule__NodeId__Group__2__Impl : ( ( rule__NodeId__PortAssignment_2 )? ) ;
    public final void rule__NodeId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1788:1: ( ( ( rule__NodeId__PortAssignment_2 )? ) )
            // InternalMyDot.g:1789:1: ( ( rule__NodeId__PortAssignment_2 )? )
            {
            // InternalMyDot.g:1789:1: ( ( rule__NodeId__PortAssignment_2 )? )
            // InternalMyDot.g:1790:2: ( rule__NodeId__PortAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdAccess().getPortAssignment_2()); 
            }
            // InternalMyDot.g:1791:2: ( rule__NodeId__PortAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDot.g:1791:3: rule__NodeId__PortAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeId__PortAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdAccess().getPortAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__Group__2__Impl"


    // $ANTLR start "rule__AttrList__Group__0"
    // InternalMyDot.g:1800:1: rule__AttrList__Group__0 : rule__AttrList__Group__0__Impl rule__AttrList__Group__1 ;
    public final void rule__AttrList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1804:1: ( rule__AttrList__Group__0__Impl rule__AttrList__Group__1 )
            // InternalMyDot.g:1805:2: rule__AttrList__Group__0__Impl rule__AttrList__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__AttrList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttrList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__0"


    // $ANTLR start "rule__AttrList__Group__0__Impl"
    // InternalMyDot.g:1812:1: rule__AttrList__Group__0__Impl : ( () ) ;
    public final void rule__AttrList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1816:1: ( ( () ) )
            // InternalMyDot.g:1817:1: ( () )
            {
            // InternalMyDot.g:1817:1: ( () )
            // InternalMyDot.g:1818:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getAttrListAction_0()); 
            }
            // InternalMyDot.g:1819:2: ()
            // InternalMyDot.g:1819:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getAttrListAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__0__Impl"


    // $ANTLR start "rule__AttrList__Group__1"
    // InternalMyDot.g:1827:1: rule__AttrList__Group__1 : rule__AttrList__Group__1__Impl rule__AttrList__Group__2 ;
    public final void rule__AttrList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1831:1: ( rule__AttrList__Group__1__Impl rule__AttrList__Group__2 )
            // InternalMyDot.g:1832:2: rule__AttrList__Group__1__Impl rule__AttrList__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__AttrList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttrList__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__1"


    // $ANTLR start "rule__AttrList__Group__1__Impl"
    // InternalMyDot.g:1839:1: rule__AttrList__Group__1__Impl : ( '[' ) ;
    public final void rule__AttrList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1843:1: ( ( '[' ) )
            // InternalMyDot.g:1844:1: ( '[' )
            {
            // InternalMyDot.g:1844:1: ( '[' )
            // InternalMyDot.g:1845:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__1__Impl"


    // $ANTLR start "rule__AttrList__Group__2"
    // InternalMyDot.g:1854:1: rule__AttrList__Group__2 : rule__AttrList__Group__2__Impl rule__AttrList__Group__3 ;
    public final void rule__AttrList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1858:1: ( rule__AttrList__Group__2__Impl rule__AttrList__Group__3 )
            // InternalMyDot.g:1859:2: rule__AttrList__Group__2__Impl rule__AttrList__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__AttrList__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttrList__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__2"


    // $ANTLR start "rule__AttrList__Group__2__Impl"
    // InternalMyDot.g:1866:1: rule__AttrList__Group__2__Impl : ( ( rule__AttrList__Group_2__0 )* ) ;
    public final void rule__AttrList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1870:1: ( ( ( rule__AttrList__Group_2__0 )* ) )
            // InternalMyDot.g:1871:1: ( ( rule__AttrList__Group_2__0 )* )
            {
            // InternalMyDot.g:1871:1: ( ( rule__AttrList__Group_2__0 )* )
            // InternalMyDot.g:1872:2: ( rule__AttrList__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getGroup_2()); 
            }
            // InternalMyDot.g:1873:2: ( rule__AttrList__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDot.g:1873:3: rule__AttrList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__AttrList__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__2__Impl"


    // $ANTLR start "rule__AttrList__Group__3"
    // InternalMyDot.g:1881:1: rule__AttrList__Group__3 : rule__AttrList__Group__3__Impl ;
    public final void rule__AttrList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1885:1: ( rule__AttrList__Group__3__Impl )
            // InternalMyDot.g:1886:2: rule__AttrList__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrList__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__3"


    // $ANTLR start "rule__AttrList__Group__3__Impl"
    // InternalMyDot.g:1892:1: rule__AttrList__Group__3__Impl : ( ']' ) ;
    public final void rule__AttrList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1896:1: ( ( ']' ) )
            // InternalMyDot.g:1897:1: ( ']' )
            {
            // InternalMyDot.g:1897:1: ( ']' )
            // InternalMyDot.g:1898:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__3__Impl"


    // $ANTLR start "rule__AttrList__Group_2__0"
    // InternalMyDot.g:1908:1: rule__AttrList__Group_2__0 : rule__AttrList__Group_2__0__Impl rule__AttrList__Group_2__1 ;
    public final void rule__AttrList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1912:1: ( rule__AttrList__Group_2__0__Impl rule__AttrList__Group_2__1 )
            // InternalMyDot.g:1913:2: rule__AttrList__Group_2__0__Impl rule__AttrList__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__AttrList__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttrList__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group_2__0"


    // $ANTLR start "rule__AttrList__Group_2__0__Impl"
    // InternalMyDot.g:1920:1: rule__AttrList__Group_2__0__Impl : ( ( rule__AttrList__AttributesAssignment_2_0 ) ) ;
    public final void rule__AttrList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1924:1: ( ( ( rule__AttrList__AttributesAssignment_2_0 ) ) )
            // InternalMyDot.g:1925:1: ( ( rule__AttrList__AttributesAssignment_2_0 ) )
            {
            // InternalMyDot.g:1925:1: ( ( rule__AttrList__AttributesAssignment_2_0 ) )
            // InternalMyDot.g:1926:2: ( rule__AttrList__AttributesAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getAttributesAssignment_2_0()); 
            }
            // InternalMyDot.g:1927:2: ( rule__AttrList__AttributesAssignment_2_0 )
            // InternalMyDot.g:1927:3: rule__AttrList__AttributesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AttrList__AttributesAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getAttributesAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group_2__0__Impl"


    // $ANTLR start "rule__AttrList__Group_2__1"
    // InternalMyDot.g:1935:1: rule__AttrList__Group_2__1 : rule__AttrList__Group_2__1__Impl ;
    public final void rule__AttrList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1939:1: ( rule__AttrList__Group_2__1__Impl )
            // InternalMyDot.g:1940:2: rule__AttrList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrList__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group_2__1"


    // $ANTLR start "rule__AttrList__Group_2__1__Impl"
    // InternalMyDot.g:1946:1: rule__AttrList__Group_2__1__Impl : ( ( rule__AttrList__Alternatives_2_1 )? ) ;
    public final void rule__AttrList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1950:1: ( ( ( rule__AttrList__Alternatives_2_1 )? ) )
            // InternalMyDot.g:1951:1: ( ( rule__AttrList__Alternatives_2_1 )? )
            {
            // InternalMyDot.g:1951:1: ( ( rule__AttrList__Alternatives_2_1 )? )
            // InternalMyDot.g:1952:2: ( rule__AttrList__Alternatives_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getAlternatives_2_1()); 
            }
            // InternalMyDot.g:1953:2: ( rule__AttrList__Alternatives_2_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=12 && LA26_0<=13)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDot.g:1953:3: rule__AttrList__Alternatives_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttrList__Alternatives_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getAlternatives_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group_2__1__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // InternalMyDot.g:1962:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1966:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalMyDot.g:1967:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Port__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Port__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // InternalMyDot.g:1974:1: rule__Port__Group__0__Impl : ( () ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1978:1: ( ( () ) )
            // InternalMyDot.g:1979:1: ( () )
            {
            // InternalMyDot.g:1979:1: ( () )
            // InternalMyDot.g:1980:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getPortAction_0()); 
            }
            // InternalMyDot.g:1981:2: ()
            // InternalMyDot.g:1981:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getPortAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // InternalMyDot.g:1989:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1993:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalMyDot.g:1994:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Port__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Port__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // InternalMyDot.g:2001:1: rule__Port__Group__1__Impl : ( ':' ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2005:1: ( ( ':' ) )
            // InternalMyDot.g:2006:1: ( ':' )
            {
            // InternalMyDot.g:2006:1: ( ':' )
            // InternalMyDot.g:2007:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getColonKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // InternalMyDot.g:2016:1: rule__Port__Group__2 : rule__Port__Group__2__Impl ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2020:1: ( rule__Port__Group__2__Impl )
            // InternalMyDot.g:2021:2: rule__Port__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // InternalMyDot.g:2027:1: rule__Port__Group__2__Impl : ( ( rule__Port__Alternatives_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2031:1: ( ( ( rule__Port__Alternatives_2 ) ) )
            // InternalMyDot.g:2032:1: ( ( rule__Port__Alternatives_2 ) )
            {
            // InternalMyDot.g:2032:1: ( ( rule__Port__Alternatives_2 ) )
            // InternalMyDot.g:2033:2: ( rule__Port__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getAlternatives_2()); 
            }
            // InternalMyDot.g:2034:2: ( rule__Port__Alternatives_2 )
            // InternalMyDot.g:2034:3: rule__Port__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Port__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Port__Group_2_2__0"
    // InternalMyDot.g:2043:1: rule__Port__Group_2_2__0 : rule__Port__Group_2_2__0__Impl rule__Port__Group_2_2__1 ;
    public final void rule__Port__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2047:1: ( rule__Port__Group_2_2__0__Impl rule__Port__Group_2_2__1 )
            // InternalMyDot.g:2048:2: rule__Port__Group_2_2__0__Impl rule__Port__Group_2_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Port__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Port__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_2_2__0"


    // $ANTLR start "rule__Port__Group_2_2__0__Impl"
    // InternalMyDot.g:2055:1: rule__Port__Group_2_2__0__Impl : ( ( rule__Port__NameAssignment_2_2_0 ) ) ;
    public final void rule__Port__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2059:1: ( ( ( rule__Port__NameAssignment_2_2_0 ) ) )
            // InternalMyDot.g:2060:1: ( ( rule__Port__NameAssignment_2_2_0 ) )
            {
            // InternalMyDot.g:2060:1: ( ( rule__Port__NameAssignment_2_2_0 ) )
            // InternalMyDot.g:2061:2: ( rule__Port__NameAssignment_2_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getNameAssignment_2_2_0()); 
            }
            // InternalMyDot.g:2062:2: ( rule__Port__NameAssignment_2_2_0 )
            // InternalMyDot.g:2062:3: rule__Port__NameAssignment_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Port__NameAssignment_2_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getNameAssignment_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_2_2__0__Impl"


    // $ANTLR start "rule__Port__Group_2_2__1"
    // InternalMyDot.g:2070:1: rule__Port__Group_2_2__1 : rule__Port__Group_2_2__1__Impl rule__Port__Group_2_2__2 ;
    public final void rule__Port__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2074:1: ( rule__Port__Group_2_2__1__Impl rule__Port__Group_2_2__2 )
            // InternalMyDot.g:2075:2: rule__Port__Group_2_2__1__Impl rule__Port__Group_2_2__2
            {
            pushFollow(FOLLOW_23);
            rule__Port__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Port__Group_2_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_2_2__1"


    // $ANTLR start "rule__Port__Group_2_2__1__Impl"
    // InternalMyDot.g:2082:1: rule__Port__Group_2_2__1__Impl : ( ':' ) ;
    public final void rule__Port__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2086:1: ( ( ':' ) )
            // InternalMyDot.g:2087:1: ( ':' )
            {
            // InternalMyDot.g:2087:1: ( ':' )
            // InternalMyDot.g:2088:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getColonKeyword_2_2_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getColonKeyword_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_2_2__1__Impl"


    // $ANTLR start "rule__Port__Group_2_2__2"
    // InternalMyDot.g:2097:1: rule__Port__Group_2_2__2 : rule__Port__Group_2_2__2__Impl ;
    public final void rule__Port__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2101:1: ( rule__Port__Group_2_2__2__Impl )
            // InternalMyDot.g:2102:2: rule__Port__Group_2_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group_2_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_2_2__2"


    // $ANTLR start "rule__Port__Group_2_2__2__Impl"
    // InternalMyDot.g:2108:1: rule__Port__Group_2_2__2__Impl : ( ( rule__Port__Compass_ptAssignment_2_2_2 ) ) ;
    public final void rule__Port__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2112:1: ( ( ( rule__Port__Compass_ptAssignment_2_2_2 ) ) )
            // InternalMyDot.g:2113:1: ( ( rule__Port__Compass_ptAssignment_2_2_2 ) )
            {
            // InternalMyDot.g:2113:1: ( ( rule__Port__Compass_ptAssignment_2_2_2 ) )
            // InternalMyDot.g:2114:2: ( rule__Port__Compass_ptAssignment_2_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getCompass_ptAssignment_2_2_2()); 
            }
            // InternalMyDot.g:2115:2: ( rule__Port__Compass_ptAssignment_2_2_2 )
            // InternalMyDot.g:2115:3: rule__Port__Compass_ptAssignment_2_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Port__Compass_ptAssignment_2_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getCompass_ptAssignment_2_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_2_2__2__Impl"


    // $ANTLR start "rule__EdgeRhsNode__Group__0"
    // InternalMyDot.g:2124:1: rule__EdgeRhsNode__Group__0 : rule__EdgeRhsNode__Group__0__Impl rule__EdgeRhsNode__Group__1 ;
    public final void rule__EdgeRhsNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2128:1: ( rule__EdgeRhsNode__Group__0__Impl rule__EdgeRhsNode__Group__1 )
            // InternalMyDot.g:2129:2: rule__EdgeRhsNode__Group__0__Impl rule__EdgeRhsNode__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EdgeRhsNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EdgeRhsNode__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__Group__0"


    // $ANTLR start "rule__EdgeRhsNode__Group__0__Impl"
    // InternalMyDot.g:2136:1: rule__EdgeRhsNode__Group__0__Impl : ( () ) ;
    public final void rule__EdgeRhsNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2140:1: ( ( () ) )
            // InternalMyDot.g:2141:1: ( () )
            {
            // InternalMyDot.g:2141:1: ( () )
            // InternalMyDot.g:2142:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeAccess().getEdgeRhsNodeAction_0()); 
            }
            // InternalMyDot.g:2143:2: ()
            // InternalMyDot.g:2143:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeAccess().getEdgeRhsNodeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__Group__0__Impl"


    // $ANTLR start "rule__EdgeRhsNode__Group__1"
    // InternalMyDot.g:2151:1: rule__EdgeRhsNode__Group__1 : rule__EdgeRhsNode__Group__1__Impl rule__EdgeRhsNode__Group__2 ;
    public final void rule__EdgeRhsNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2155:1: ( rule__EdgeRhsNode__Group__1__Impl rule__EdgeRhsNode__Group__2 )
            // InternalMyDot.g:2156:2: rule__EdgeRhsNode__Group__1__Impl rule__EdgeRhsNode__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EdgeRhsNode__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EdgeRhsNode__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__Group__1"


    // $ANTLR start "rule__EdgeRhsNode__Group__1__Impl"
    // InternalMyDot.g:2163:1: rule__EdgeRhsNode__Group__1__Impl : ( ( rule__EdgeRhsNode__OpAssignment_1 ) ) ;
    public final void rule__EdgeRhsNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2167:1: ( ( ( rule__EdgeRhsNode__OpAssignment_1 ) ) )
            // InternalMyDot.g:2168:1: ( ( rule__EdgeRhsNode__OpAssignment_1 ) )
            {
            // InternalMyDot.g:2168:1: ( ( rule__EdgeRhsNode__OpAssignment_1 ) )
            // InternalMyDot.g:2169:2: ( rule__EdgeRhsNode__OpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeAccess().getOpAssignment_1()); 
            }
            // InternalMyDot.g:2170:2: ( rule__EdgeRhsNode__OpAssignment_1 )
            // InternalMyDot.g:2170:3: rule__EdgeRhsNode__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EdgeRhsNode__OpAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeAccess().getOpAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__Group__1__Impl"


    // $ANTLR start "rule__EdgeRhsNode__Group__2"
    // InternalMyDot.g:2178:1: rule__EdgeRhsNode__Group__2 : rule__EdgeRhsNode__Group__2__Impl ;
    public final void rule__EdgeRhsNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2182:1: ( rule__EdgeRhsNode__Group__2__Impl )
            // InternalMyDot.g:2183:2: rule__EdgeRhsNode__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeRhsNode__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__Group__2"


    // $ANTLR start "rule__EdgeRhsNode__Group__2__Impl"
    // InternalMyDot.g:2189:1: rule__EdgeRhsNode__Group__2__Impl : ( ( rule__EdgeRhsNode__NodeAssignment_2 ) ) ;
    public final void rule__EdgeRhsNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2193:1: ( ( ( rule__EdgeRhsNode__NodeAssignment_2 ) ) )
            // InternalMyDot.g:2194:1: ( ( rule__EdgeRhsNode__NodeAssignment_2 ) )
            {
            // InternalMyDot.g:2194:1: ( ( rule__EdgeRhsNode__NodeAssignment_2 ) )
            // InternalMyDot.g:2195:2: ( rule__EdgeRhsNode__NodeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeAccess().getNodeAssignment_2()); 
            }
            // InternalMyDot.g:2196:2: ( rule__EdgeRhsNode__NodeAssignment_2 )
            // InternalMyDot.g:2196:3: rule__EdgeRhsNode__NodeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeRhsNode__NodeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeAccess().getNodeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__Group__2__Impl"


    // $ANTLR start "rule__EdgeRhsSubgraph__Group__0"
    // InternalMyDot.g:2205:1: rule__EdgeRhsSubgraph__Group__0 : rule__EdgeRhsSubgraph__Group__0__Impl rule__EdgeRhsSubgraph__Group__1 ;
    public final void rule__EdgeRhsSubgraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2209:1: ( rule__EdgeRhsSubgraph__Group__0__Impl rule__EdgeRhsSubgraph__Group__1 )
            // InternalMyDot.g:2210:2: rule__EdgeRhsSubgraph__Group__0__Impl rule__EdgeRhsSubgraph__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EdgeRhsSubgraph__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EdgeRhsSubgraph__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__Group__0"


    // $ANTLR start "rule__EdgeRhsSubgraph__Group__0__Impl"
    // InternalMyDot.g:2217:1: rule__EdgeRhsSubgraph__Group__0__Impl : ( () ) ;
    public final void rule__EdgeRhsSubgraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2221:1: ( ( () ) )
            // InternalMyDot.g:2222:1: ( () )
            {
            // InternalMyDot.g:2222:1: ( () )
            // InternalMyDot.g:2223:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphAccess().getEdgeRhsSubgraphAction_0()); 
            }
            // InternalMyDot.g:2224:2: ()
            // InternalMyDot.g:2224:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphAccess().getEdgeRhsSubgraphAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__Group__0__Impl"


    // $ANTLR start "rule__EdgeRhsSubgraph__Group__1"
    // InternalMyDot.g:2232:1: rule__EdgeRhsSubgraph__Group__1 : rule__EdgeRhsSubgraph__Group__1__Impl rule__EdgeRhsSubgraph__Group__2 ;
    public final void rule__EdgeRhsSubgraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2236:1: ( rule__EdgeRhsSubgraph__Group__1__Impl rule__EdgeRhsSubgraph__Group__2 )
            // InternalMyDot.g:2237:2: rule__EdgeRhsSubgraph__Group__1__Impl rule__EdgeRhsSubgraph__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EdgeRhsSubgraph__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EdgeRhsSubgraph__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__Group__1"


    // $ANTLR start "rule__EdgeRhsSubgraph__Group__1__Impl"
    // InternalMyDot.g:2244:1: rule__EdgeRhsSubgraph__Group__1__Impl : ( ( rule__EdgeRhsSubgraph__OpAssignment_1 ) ) ;
    public final void rule__EdgeRhsSubgraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2248:1: ( ( ( rule__EdgeRhsSubgraph__OpAssignment_1 ) ) )
            // InternalMyDot.g:2249:1: ( ( rule__EdgeRhsSubgraph__OpAssignment_1 ) )
            {
            // InternalMyDot.g:2249:1: ( ( rule__EdgeRhsSubgraph__OpAssignment_1 ) )
            // InternalMyDot.g:2250:2: ( rule__EdgeRhsSubgraph__OpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphAccess().getOpAssignment_1()); 
            }
            // InternalMyDot.g:2251:2: ( rule__EdgeRhsSubgraph__OpAssignment_1 )
            // InternalMyDot.g:2251:3: rule__EdgeRhsSubgraph__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EdgeRhsSubgraph__OpAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphAccess().getOpAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__Group__1__Impl"


    // $ANTLR start "rule__EdgeRhsSubgraph__Group__2"
    // InternalMyDot.g:2259:1: rule__EdgeRhsSubgraph__Group__2 : rule__EdgeRhsSubgraph__Group__2__Impl ;
    public final void rule__EdgeRhsSubgraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2263:1: ( rule__EdgeRhsSubgraph__Group__2__Impl )
            // InternalMyDot.g:2264:2: rule__EdgeRhsSubgraph__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeRhsSubgraph__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__Group__2"


    // $ANTLR start "rule__EdgeRhsSubgraph__Group__2__Impl"
    // InternalMyDot.g:2270:1: rule__EdgeRhsSubgraph__Group__2__Impl : ( ( rule__EdgeRhsSubgraph__SubgraphAssignment_2 ) ) ;
    public final void rule__EdgeRhsSubgraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2274:1: ( ( ( rule__EdgeRhsSubgraph__SubgraphAssignment_2 ) ) )
            // InternalMyDot.g:2275:1: ( ( rule__EdgeRhsSubgraph__SubgraphAssignment_2 ) )
            {
            // InternalMyDot.g:2275:1: ( ( rule__EdgeRhsSubgraph__SubgraphAssignment_2 ) )
            // InternalMyDot.g:2276:2: ( rule__EdgeRhsSubgraph__SubgraphAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphAssignment_2()); 
            }
            // InternalMyDot.g:2277:2: ( rule__EdgeRhsSubgraph__SubgraphAssignment_2 )
            // InternalMyDot.g:2277:3: rule__EdgeRhsSubgraph__SubgraphAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeRhsSubgraph__SubgraphAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__Group__2__Impl"


    // $ANTLR start "rule__DotAst__GraphsAssignment_1"
    // InternalMyDot.g:2286:1: rule__DotAst__GraphsAssignment_1 : ( ruleDotGraph ) ;
    public final void rule__DotAst__GraphsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2290:1: ( ( ruleDotGraph ) )
            // InternalMyDot.g:2291:2: ( ruleDotGraph )
            {
            // InternalMyDot.g:2291:2: ( ruleDotGraph )
            // InternalMyDot.g:2292:3: ruleDotGraph
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotAstAccess().getGraphsDotGraphParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDotGraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotAstAccess().getGraphsDotGraphParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotAst__GraphsAssignment_1"


    // $ANTLR start "rule__DotGraph__StrictAssignment_1"
    // InternalMyDot.g:2301:1: rule__DotGraph__StrictAssignment_1 : ( ( 'strict' ) ) ;
    public final void rule__DotGraph__StrictAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2305:1: ( ( ( 'strict' ) ) )
            // InternalMyDot.g:2306:2: ( ( 'strict' ) )
            {
            // InternalMyDot.g:2306:2: ( ( 'strict' ) )
            // InternalMyDot.g:2307:3: ( 'strict' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getStrictStrictKeyword_1_0()); 
            }
            // InternalMyDot.g:2308:3: ( 'strict' )
            // InternalMyDot.g:2309:4: 'strict'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getStrictStrictKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getStrictStrictKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getStrictStrictKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__StrictAssignment_1"


    // $ANTLR start "rule__DotGraph__TypeAssignment_2"
    // InternalMyDot.g:2320:1: rule__DotGraph__TypeAssignment_2 : ( ruleGraphType ) ;
    public final void rule__DotGraph__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2324:1: ( ( ruleGraphType ) )
            // InternalMyDot.g:2325:2: ( ruleGraphType )
            {
            // InternalMyDot.g:2325:2: ( ruleGraphType )
            // InternalMyDot.g:2326:3: ruleGraphType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getTypeGraphTypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getTypeGraphTypeEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__TypeAssignment_2"


    // $ANTLR start "rule__DotGraph__NameAssignment_3"
    // InternalMyDot.g:2335:1: rule__DotGraph__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__DotGraph__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2339:1: ( ( RULE_ID ) )
            // InternalMyDot.g:2340:2: ( RULE_ID )
            {
            // InternalMyDot.g:2340:2: ( RULE_ID )
            // InternalMyDot.g:2341:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__NameAssignment_3"


    // $ANTLR start "rule__DotGraph__StmtsAssignment_5"
    // InternalMyDot.g:2350:1: rule__DotGraph__StmtsAssignment_5 : ( ruleStmt ) ;
    public final void rule__DotGraph__StmtsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2354:1: ( ( ruleStmt ) )
            // InternalMyDot.g:2355:2: ( ruleStmt )
            {
            // InternalMyDot.g:2355:2: ( ruleStmt )
            // InternalMyDot.g:2356:3: ruleStmt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getStmtsStmtParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getStmtsStmtParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__StmtsAssignment_5"


    // $ANTLR start "rule__EdgeStmtNode__NodeAssignment_1"
    // InternalMyDot.g:2365:1: rule__EdgeStmtNode__NodeAssignment_1 : ( ruleNodeId ) ;
    public final void rule__EdgeStmtNode__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2369:1: ( ( ruleNodeId ) )
            // InternalMyDot.g:2370:2: ( ruleNodeId )
            {
            // InternalMyDot.g:2370:2: ( ruleNodeId )
            // InternalMyDot.g:2371:3: ruleNodeId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getNodeNodeIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getNodeNodeIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__NodeAssignment_1"


    // $ANTLR start "rule__EdgeStmtNode__EdgeRHSAssignment_2"
    // InternalMyDot.g:2380:1: rule__EdgeStmtNode__EdgeRHSAssignment_2 : ( ruleEdgeRhs ) ;
    public final void rule__EdgeStmtNode__EdgeRHSAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2384:1: ( ( ruleEdgeRhs ) )
            // InternalMyDot.g:2385:2: ( ruleEdgeRhs )
            {
            // InternalMyDot.g:2385:2: ( ruleEdgeRhs )
            // InternalMyDot.g:2386:3: ruleEdgeRhs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSEdgeRhsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEdgeRhs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSEdgeRhsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__EdgeRHSAssignment_2"


    // $ANTLR start "rule__EdgeStmtNode__AttrListsAssignment_3"
    // InternalMyDot.g:2395:1: rule__EdgeStmtNode__AttrListsAssignment_3 : ( ruleAttrList ) ;
    public final void rule__EdgeStmtNode__AttrListsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2399:1: ( ( ruleAttrList ) )
            // InternalMyDot.g:2400:2: ( ruleAttrList )
            {
            // InternalMyDot.g:2400:2: ( ruleAttrList )
            // InternalMyDot.g:2401:3: ruleAttrList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getAttrListsAttrListParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttrList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getAttrListsAttrListParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__AttrListsAssignment_3"


    // $ANTLR start "rule__NodeStmt__NodeAssignment_1"
    // InternalMyDot.g:2410:1: rule__NodeStmt__NodeAssignment_1 : ( ruleNodeId ) ;
    public final void rule__NodeStmt__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2414:1: ( ( ruleNodeId ) )
            // InternalMyDot.g:2415:2: ( ruleNodeId )
            {
            // InternalMyDot.g:2415:2: ( ruleNodeId )
            // InternalMyDot.g:2416:3: ruleNodeId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtAccess().getNodeNodeIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtAccess().getNodeNodeIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__NodeAssignment_1"


    // $ANTLR start "rule__NodeStmt__AttrListsAssignment_2"
    // InternalMyDot.g:2425:1: rule__NodeStmt__AttrListsAssignment_2 : ( ruleAttrList ) ;
    public final void rule__NodeStmt__AttrListsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2429:1: ( ( ruleAttrList ) )
            // InternalMyDot.g:2430:2: ( ruleAttrList )
            {
            // InternalMyDot.g:2430:2: ( ruleAttrList )
            // InternalMyDot.g:2431:3: ruleAttrList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtAccess().getAttrListsAttrListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttrList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtAccess().getAttrListsAttrListParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__AttrListsAssignment_2"


    // $ANTLR start "rule__AttrStmt__TypeAssignment_1"
    // InternalMyDot.g:2440:1: rule__AttrStmt__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__AttrStmt__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2444:1: ( ( ruleAttributeType ) )
            // InternalMyDot.g:2445:2: ( ruleAttributeType )
            {
            // InternalMyDot.g:2445:2: ( ruleAttributeType )
            // InternalMyDot.g:2446:3: ruleAttributeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getTypeAttributeTypeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getTypeAttributeTypeEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__TypeAssignment_1"


    // $ANTLR start "rule__AttrStmt__AttrListsAssignment_2"
    // InternalMyDot.g:2455:1: rule__AttrStmt__AttrListsAssignment_2 : ( ruleAttrList ) ;
    public final void rule__AttrStmt__AttrListsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2459:1: ( ( ruleAttrList ) )
            // InternalMyDot.g:2460:2: ( ruleAttrList )
            {
            // InternalMyDot.g:2460:2: ( ruleAttrList )
            // InternalMyDot.g:2461:3: ruleAttrList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getAttrListsAttrListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttrList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getAttrListsAttrListParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__AttrListsAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDot.g:2470:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2474:1: ( ( ruleEString ) )
            // InternalMyDot.g:2475:2: ( ruleEString )
            {
            // InternalMyDot.g:2475:2: ( ruleEString )
            // InternalMyDot.g:2476:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__ValueAssignment_3"
    // InternalMyDot.g:2485:1: rule__Attribute__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__Attribute__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2489:1: ( ( ruleEString ) )
            // InternalMyDot.g:2490:2: ( ruleEString )
            {
            // InternalMyDot.g:2490:2: ( ruleEString )
            // InternalMyDot.g:2491:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueEStringParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_3"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1"
    // InternalMyDot.g:2500:1: rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 : ( ruleEdgeRhs ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2504:1: ( ( ruleEdgeRhs ) )
            // InternalMyDot.g:2505:2: ( ruleEdgeRhs )
            {
            // InternalMyDot.g:2505:2: ( ruleEdgeRhs )
            // InternalMyDot.g:2506:3: ruleEdgeRhs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSEdgeRhsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEdgeRhs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSEdgeRhsParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2"
    // InternalMyDot.g:2515:1: rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 : ( ruleAttrList ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2519:1: ( ( ruleAttrList ) )
            // InternalMyDot.g:2520:2: ( ruleAttrList )
            {
            // InternalMyDot.g:2520:2: ( ruleAttrList )
            // InternalMyDot.g:2521:3: ruleAttrList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getAttrListsAttrListParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttrList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getAttrListsAttrListParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2"


    // $ANTLR start "rule__Subgraph__NameAssignment_1_1"
    // InternalMyDot.g:2530:1: rule__Subgraph__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Subgraph__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2534:1: ( ( RULE_ID ) )
            // InternalMyDot.g:2535:2: ( RULE_ID )
            {
            // InternalMyDot.g:2535:2: ( RULE_ID )
            // InternalMyDot.g:2536:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getNameIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getNameIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__NameAssignment_1_1"


    // $ANTLR start "rule__Subgraph__StmtsAssignment_3"
    // InternalMyDot.g:2545:1: rule__Subgraph__StmtsAssignment_3 : ( ruleStmt ) ;
    public final void rule__Subgraph__StmtsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2549:1: ( ( ruleStmt ) )
            // InternalMyDot.g:2550:2: ( ruleStmt )
            {
            // InternalMyDot.g:2550:2: ( ruleStmt )
            // InternalMyDot.g:2551:3: ruleStmt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getStmtsStmtParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getStmtsStmtParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__StmtsAssignment_3"


    // $ANTLR start "rule__NodeId__NameAssignment_1"
    // InternalMyDot.g:2560:1: rule__NodeId__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NodeId__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2564:1: ( ( RULE_ID ) )
            // InternalMyDot.g:2565:2: ( RULE_ID )
            {
            // InternalMyDot.g:2565:2: ( RULE_ID )
            // InternalMyDot.g:2566:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__NameAssignment_1"


    // $ANTLR start "rule__NodeId__PortAssignment_2"
    // InternalMyDot.g:2575:1: rule__NodeId__PortAssignment_2 : ( rulePort ) ;
    public final void rule__NodeId__PortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2579:1: ( ( rulePort ) )
            // InternalMyDot.g:2580:2: ( rulePort )
            {
            // InternalMyDot.g:2580:2: ( rulePort )
            // InternalMyDot.g:2581:3: rulePort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdAccess().getPortPortParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdAccess().getPortPortParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__PortAssignment_2"


    // $ANTLR start "rule__AttrList__AttributesAssignment_2_0"
    // InternalMyDot.g:2590:1: rule__AttrList__AttributesAssignment_2_0 : ( ruleAttribute ) ;
    public final void rule__AttrList__AttributesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2594:1: ( ( ruleAttribute ) )
            // InternalMyDot.g:2595:2: ( ruleAttribute )
            {
            // InternalMyDot.g:2595:2: ( ruleAttribute )
            // InternalMyDot.g:2596:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getAttributesAttributeParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getAttributesAttributeParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__AttributesAssignment_2_0"


    // $ANTLR start "rule__Port__Compass_ptAssignment_2_0"
    // InternalMyDot.g:2605:1: rule__Port__Compass_ptAssignment_2_0 : ( RULE_COMPASS_PT ) ;
    public final void rule__Port__Compass_ptAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2609:1: ( ( RULE_COMPASS_PT ) )
            // InternalMyDot.g:2610:2: ( RULE_COMPASS_PT )
            {
            // InternalMyDot.g:2610:2: ( RULE_COMPASS_PT )
            // InternalMyDot.g:2611:3: RULE_COMPASS_PT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_COMPASS_PT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Compass_ptAssignment_2_0"


    // $ANTLR start "rule__Port__NameAssignment_2_1"
    // InternalMyDot.g:2620:1: rule__Port__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2624:1: ( ( RULE_ID ) )
            // InternalMyDot.g:2625:2: ( RULE_ID )
            {
            // InternalMyDot.g:2625:2: ( RULE_ID )
            // InternalMyDot.g:2626:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NameAssignment_2_1"


    // $ANTLR start "rule__Port__NameAssignment_2_2_0"
    // InternalMyDot.g:2635:1: rule__Port__NameAssignment_2_2_0 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2639:1: ( ( RULE_ID ) )
            // InternalMyDot.g:2640:2: ( RULE_ID )
            {
            // InternalMyDot.g:2640:2: ( RULE_ID )
            // InternalMyDot.g:2641:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NameAssignment_2_2_0"


    // $ANTLR start "rule__Port__Compass_ptAssignment_2_2_2"
    // InternalMyDot.g:2650:1: rule__Port__Compass_ptAssignment_2_2_2 : ( RULE_COMPASS_PT ) ;
    public final void rule__Port__Compass_ptAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2654:1: ( ( RULE_COMPASS_PT ) )
            // InternalMyDot.g:2655:2: ( RULE_COMPASS_PT )
            {
            // InternalMyDot.g:2655:2: ( RULE_COMPASS_PT )
            // InternalMyDot.g:2656:3: RULE_COMPASS_PT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_2_2_2_0()); 
            }
            match(input,RULE_COMPASS_PT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_2_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Compass_ptAssignment_2_2_2"


    // $ANTLR start "rule__EdgeRhsNode__OpAssignment_1"
    // InternalMyDot.g:2665:1: rule__EdgeRhsNode__OpAssignment_1 : ( ruleEdgeOp ) ;
    public final void rule__EdgeRhsNode__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2669:1: ( ( ruleEdgeOp ) )
            // InternalMyDot.g:2670:2: ( ruleEdgeOp )
            {
            // InternalMyDot.g:2670:2: ( ruleEdgeOp )
            // InternalMyDot.g:2671:3: ruleEdgeOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeAccess().getOpEdgeOpEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEdgeOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeAccess().getOpEdgeOpEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__OpAssignment_1"


    // $ANTLR start "rule__EdgeRhsNode__NodeAssignment_2"
    // InternalMyDot.g:2680:1: rule__EdgeRhsNode__NodeAssignment_2 : ( ruleNodeId ) ;
    public final void rule__EdgeRhsNode__NodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2684:1: ( ( ruleNodeId ) )
            // InternalMyDot.g:2685:2: ( ruleNodeId )
            {
            // InternalMyDot.g:2685:2: ( ruleNodeId )
            // InternalMyDot.g:2686:3: ruleNodeId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeAccess().getNodeNodeIdParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeAccess().getNodeNodeIdParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__NodeAssignment_2"


    // $ANTLR start "rule__EdgeRhsSubgraph__OpAssignment_1"
    // InternalMyDot.g:2695:1: rule__EdgeRhsSubgraph__OpAssignment_1 : ( ruleEdgeOp ) ;
    public final void rule__EdgeRhsSubgraph__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2699:1: ( ( ruleEdgeOp ) )
            // InternalMyDot.g:2700:2: ( ruleEdgeOp )
            {
            // InternalMyDot.g:2700:2: ( ruleEdgeOp )
            // InternalMyDot.g:2701:3: ruleEdgeOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphAccess().getOpEdgeOpEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEdgeOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphAccess().getOpEdgeOpEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__OpAssignment_1"


    // $ANTLR start "rule__EdgeRhsSubgraph__SubgraphAssignment_2"
    // InternalMyDot.g:2710:1: rule__EdgeRhsSubgraph__SubgraphAssignment_2 : ( ruleSubgraph ) ;
    public final void rule__EdgeRhsSubgraph__SubgraphAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:2714:1: ( ( ruleSubgraph ) )
            // InternalMyDot.g:2715:2: ( ruleSubgraph )
            {
            // InternalMyDot.g:2715:2: ( ruleSubgraph )
            // InternalMyDot.g:2716:3: ruleSubgraph
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphSubgraphParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubgraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphSubgraphParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__SubgraphAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\6\6\uffff\2\6\1\uffff\1\6";
    static final String dfa_3s = "\2\4\3\uffff\1\5\2\uffff\2\4\1\6\1\4";
    static final String dfa_4s = "\1\27\1\32\3\uffff\1\6\2\uffff\1\30\1\32\1\6\1\30";
    static final String dfa_5s = "\2\uffff\1\3\1\4\1\5\1\uffff\1\2\1\1\4\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\10\uffff\1\2\3\uffff\2\2\1\4\2\uffff\1\4",
            "\2\6\7\uffff\2\6\1\uffff\2\7\4\6\1\3\2\6\1\uffff\1\5",
            "",
            "",
            "",
            "\1\11\1\10",
            "",
            "",
            "\2\6\7\uffff\2\6\1\uffff\2\7\4\6\1\uffff\2\6",
            "\2\6\7\uffff\2\6\1\uffff\2\7\4\6\1\uffff\2\6\1\uffff\1\12",
            "\1\13",
            "\2\6\7\uffff\2\6\1\uffff\2\7\4\6\1\uffff\2\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "501:1: rule__Stmt__Alternatives_0 : ( ( ruleEdgeStmtNode ) | ( ruleNodeStmt ) | ( ruleAttrStmt ) | ( ruleAttribute ) | ( ruleSubgraphOrEdgeStmtSubgraph ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000800C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000800C002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000BC4030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000009C4032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000009C4030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});

}