package org.bumble.xtext.grammaroptimizer.test;

import org.bumble.xtext.grammaroptimizer.GrammarOptimizer;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracketToSquare;
import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerFactory;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracket;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracketExceptOutermost;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBracket;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BracketRuleTest {
	@Test
	public void testRemoveAllBracketsInGrammar() {
		GrammarOptimizer go = new GrammarOptimizer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		RemoveBracket removeBrackets = GrammaroptimizerFactory.eINSTANCE.createRemoveBracket();
		removeBrackets.setGrammar(go.getGrammar());
		removeBrackets.setGrammarRule(null);
		removeBrackets.setAttrName(null);
		removeBrackets.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_001.txt", false);

		// compare text
		Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
	}
	
	@Test
	public void testRemoveOnlyRuleBrackets() {
		GrammarOptimizer go = new GrammarOptimizer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		RemoveOutermostBracket removeOutermostBracket = GrammaroptimizerFactory.eINSTANCE.createRemoveOutermostBracket();
		removeOutermostBracket.setGrammar(go.getGrammar());
		removeOutermostBracket.setGrammarRule("AttrList");
		removeOutermostBracket.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_002.txt", false);

		// compare text
		Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
	}
	
	@Test
	public void testRemoveBracketsInAttrs() {
		GrammarOptimizer go = new GrammarOptimizer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		RemoveBracketExceptOutermost removeBracketExceptOutermost = GrammaroptimizerFactory.eINSTANCE.createRemoveBracketExceptOutermost();
		removeBracketExceptOutermost.setGrammar(go.getGrammar());
		removeBracketExceptOutermost.setGrammarRule("AttrList");
		removeBracketExceptOutermost.setAttrName(null);
		removeBracketExceptOutermost.apply();
		
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_003.txt", false);

		// compare text
		Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
	}
	
	/**
	 * Remove the brackets from all the attributes except the outermost brackets
	 * from all the rules within the grammar.
	 * */
	@Test
	public void testRemoveAllBracketInAttrs() {
		GrammarOptimizer go = new GrammarOptimizer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		RemoveBracketExceptOutermost removeBracketExceptOutermost = GrammaroptimizerFactory.eINSTANCE.createRemoveBracketExceptOutermost();
		removeBracketExceptOutermost.setGrammar(go.getGrammar());
		removeBracketExceptOutermost.setGrammarRule(null);
		removeBracketExceptOutermost.setAttrName(null);
		removeBracketExceptOutermost.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_004.txt", false);

		// compare text
		Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
	}
	
	@Test
	public void testRemoveBracketsInSpecifiedAttr() {
		GrammarOptimizer go = new GrammarOptimizer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		RemoveBracket removeBrackets = GrammaroptimizerFactory.eINSTANCE.createRemoveBracket();
		removeBrackets.setGrammar(go.getGrammar());
		removeBrackets.setGrammarRule("EdgeStmtNode");
		removeBrackets.setAttrName("edgeRHS");
		removeBrackets.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_005.txt", false);

		// compare text
		Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
	}
	
	@Test
	public void testChangeBracketToSquareForAll() {
		GrammarOptimizer go = new GrammarOptimizer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		ChangeBracketToSquare changeBracketToSquare = GrammaroptimizerFactory.eINSTANCE.createChangeBracketToSquare();
		changeBracketToSquare.setGrammar(go.getGrammar());
		changeBracketToSquare.setGrammarRule(null);
		changeBracketToSquare.setAttrName(null);
		changeBracketToSquare.apply();
		
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_006.txt", false);

		// compare text
		Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
	}
	
	@Test
	public void testChangeRuleBracketToSquare() {
		GrammarOptimizer go = new GrammarOptimizer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		ChangeBracketToSquare changeBracketToSquare = GrammaroptimizerFactory.eINSTANCE.createChangeBracketToSquare();
		changeBracketToSquare.setGrammar(go.getGrammar());
		changeBracketToSquare.setGrammarRule("DotAst");
		changeBracketToSquare.setAttrName(null);
		changeBracketToSquare.apply();
		
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_007.txt", false);

		// compare text
		Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
	}
	
	@Test
	public void testChangeAttrBracketToSquare() {
		GrammarOptimizer go = new GrammarOptimizer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		ChangeBracketToSquare changeBracketToSquare = GrammaroptimizerFactory.eINSTANCE.createChangeBracketToSquare();
		changeBracketToSquare.setGrammar(go.getGrammar());
		changeBracketToSquare.setGrammarRule("EdgeStmtNode");
		changeBracketToSquare.setAttrName("attrLists");
		changeBracketToSquare.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_008.txt", false);

		// compare text
		Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
	}
}
