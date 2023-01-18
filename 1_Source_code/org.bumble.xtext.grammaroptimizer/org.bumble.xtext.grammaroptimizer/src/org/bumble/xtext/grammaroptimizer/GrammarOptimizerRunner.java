package org.bumble.xtext.grammaroptimizer;

import java.io.File;
import java.io.IOException;

import org.bumble.xtext.grammaroptimizer.helper.IOHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;

public class GrammarOptimizerRunner {
	
	// the following three strings should be customized by user manually
	private static final String LOCAL_REPOSITORY_PATH = "D:\\02.Git Repository\\Pretty-Printer_Language-Analysis\\DOT\\";
	private static final String ECLIPSE_PROJECT_PATH = "org.xtext.example.mydot\\src\\org\\xtext\\example\\mydot\\";
	private static final String LANGUAGE_NAME = "MyDot";
	
	public static String constructFileName() {
		String fileName = null;		
		
		fileName = LOCAL_REPOSITORY_PATH + ECLIPSE_PROJECT_PATH + LANGUAGE_NAME +".xtext";
		
		return fileName;
	}
	
	public static boolean setFileText(String fileName, String strFinal) {
		if (fileName == null)
			return false;

		File output_file = new File(LOCAL_REPOSITORY_PATH + ECLIPSE_PROJECT_PATH + fileName);

		try {
			if (!output_file.exists()) {
				output_file.createNewFile();
			}
			IOHelper.saveFile(output_file, strFinal);
		} catch (IOException e) {
			System.err.printf("Failed to create or write to file %s\n", fileName);
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
	public static void main(String[] args) throws IOException {	
		// instantiate a file
		File xtextFile = new File(constructFileName());
		
		if (!xtextFile.exists()) {
			System.err.printf("[Error] File %s doesn't exist!\n", constructFileName());
			return;
		}
		
		// read whole content from xtext file
		String strRaw;
		try {
			strRaw = IOHelper.readFile(xtextFile);
			
			if (null == strRaw || strRaw.isEmpty()) {
				System.err.printf("[Error] Failed to read string from xtext file.\n");
				return;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.printf("[Error] Failed to read string from xtext file.\n");
			e.printStackTrace();			
			return;
		}
		
		GrammarOptimizer go = new GrammarOptimizer();
		
		// Create table of grammar rules
		if (!go.processGrammar(strRaw)) {
			System.err.println("Failed to create a table!");
			return;
		}
		
		// execute pretty printer rules
		if (!executeOptimization(go)) {
			System.err.println("Failed to optimize the grammar!");
			return;
		}
		
		// splice lines of texts into a complete grammar text
		String strFinal = go.spliceGrammar();
		
		setFileText("MyDot1.xtext", strFinal);
	}
	
	/**
	 * This method is where the users set their goals
	 * */
	public static boolean executeOptimization(GrammarOptimizer go) {
		// optimize grammar rule DotAst
		go.removeKeyword("DotAst", null, null, null);		
		go.removeBraces("DotAst", null, null);		
		go.convert1toStarToStar("DotAst", "graphs");
		go.removeOptionality("DotAst", "graphs");
		
		// optimize grammar rule Stmt
		go.removeRuleCall("Stmt", "Stmt_Impl");
		go.removeRuleCall("Stmt", "EdgeStmtSubgraph");
		go.removeRuleCall("Stmt", "Subgraph");
		go.addParenthesesWithoutQuoteToRule("Stmt", PackageKey.PACKAGE_ONLY);
		go.addSymbolToRule("Stmt", ";");
		go.addOptionalityToSymbol("Stmt", null, ";");
		
		go.changeCalledRule("Stmt", "SubgraphOrEdgeStmtSubgraph_Impl", "SubgraphOrEdgeStmtSubgraph");
		
		go.removeRuleCall("EdgeRhs", "EdgeRhs_Impl");
		
		go.removeKeyword("DotGraph", null, "DotGraph", null);
		go.removeKeyword("DotGraph", null, "type", null);
		go.removeKeyword("DotGraph", null, "stmts", null);
		
		go.removeBracesExceptContainer("DotGraph");
		
		go.removeOptionality("DotGraph", "type");
		go.removeOptionality("DotGraph", "stmts");
		
		go.convert1toStarToStar("DotGraph", "stmts");
		
		go.moveLine("DotGraph", "type", "name", true);
		
		go.changeTypeOfAttr("DotGraph", "name", "EString", "ID");
		
		// add optionality to the attribute name in rule DotGraph
		go.addOptionalityToAttr("DotGraph", "name");
		
		// remove rule EBoolean and Stmt_Impl
		go.removeRule("EBoolean");
		go.removeRule("Stmt_Impl");
		
		// adapt EdgeStmtNode
		go.removeKeyword("EdgeStmtNode", null, null, null);
		
		go.removeBraces("EdgeStmtNode", null, null);
		
		go.removeOptionality("EdgeStmtNode", null);
		
		go.convert1toStarToPlus("EdgeStmtNode", "edgeRHS");

		go.convert1toStarToStar("EdgeStmtNode", "attrLists");
		
		// adapt EdgeStmtSubgraph
		go.removeKeyword("EdgeStmtSubgraph", null, null, null);
		
		go.removeBraces("EdgeStmtSubgraph", null, null);
		
		go.removeOptionality("EdgeStmtSubgraph", null);
		
		go.convert1toStarToPlus("EdgeStmtSubgraph", "edgeRHS");

		go.convert1toStarToStar("EdgeStmtSubgraph", "attrLists");
		
		// adapt NodeStmt
		go.removeKeyword("NodeStmt", null, null, null);
		
		go.removeBraces("NodeStmt", null, null);
		
		go.removeOptionality("NodeStmt", null);
		
		go.convert1toStarToStar("NodeStmt", "attrLists");
		
		// adapt AttrStmt
		go.removeKeyword("AttrStmt", null, null, null);
		
		go.removeBraces("AttrStmt", null, null);
		
		go.removeOptionality("AttrStmt", null);
		
		go.convert1toStarToPlus("AttrStmt", "attrLists");
		
		// adapt Attribute
		go.removeBraces("Attribute", null, null);
		
		go.removeKeyword("Attribute", null, "Attribute", null);
		
		go.removeOptionality("Attribute", "value");
		
		go.renameKeyword("Attribute", "value", "value", "=", null);
		
		go.renameRule("SubgraphOrEdgeStmtSubgraph_Impl", "SubgraphOrEdgeStmtSubgraph_Impl", "SubgraphOrEdgeStmtSubgraph");
		
		go.changeRuleContent("SubgraphOrEdgeStmtSubgraph", "Subgraph ({EdgeStmtSubgraph.subgraph=current}\n    (edgeRHS+=EdgeRhs)+\n    (attrLists+=AttrList)*)?;");
		
		
		// adapt Subgraph
		go.removeKeyword("Subgraph");
		// add optionality to attribute name
		go.addOptionalityToAttr("Subgraph", "name");
		go.addKeywordToLine("Subgraph", "name", "subgraph", true);
		go.changeTypeOfAttr("Subgraph", "name", "EString", "ID");
		go.addParenthesesWithoutQuotes("Subgraph", ScopeKey.SINGLELINE, null, "name", PackageKey.PACKAGE_OPTIONALLY);
		
		go.removeOptionality("Subgraph", "stmts");
		
		go.removeKeyword("Subgraph", "stmts", "stmts", null);
		
		go.removeBraces("Subgraph", "stmts", null);
		
		go.convert1toStarToStar("Subgraph", "stmts");
		
		// adapt NodeId
		go.removeKeyword("NodeId", null, null, null);
		
		go.removeBraces("NodeId", null, null);
		
		go.changeTypeOfAttr("NodeId", "name", "EString", "ID");
		
		go.removeRule("EdgeRhs_Impl");
		
		// adapt AttrList
		go.removeKeyword("AttrList");
		go.removeBracesExceptContainer("AttrList");
		
		go.changeBracesToSquare("AttrList", null);
		
		go.convert1toStarToStar("AttrList", "attributes");
		
		go.removeOptionality("AttrList", "attributes");
		
		go.addSymbolToAttr("AttrList", "attributes", ",", false, null, true, false);
		go.addOptionalityToSymbol("AttrList", "attributes", ",");
		
		// it'd be better if there is a dedicated method for adding alternative symbol to an existing symbol
		go.addAlternativeSymbol("AttrList", "attributes", ",", ";");
		
		// adapt Port
		// change the content of Port to "":" (=> compass_pt=COMPASS_PT | name=ID | name=ID ":" compass_pt=COMPASS_PT);"
		go.changeRuleContent("Port", "{Port}\n    \':\'\n    (=> compass_pt=COMPASS_PT |\n        name=ID |\n        name=ID \":\" compass_pt=COMPASS_PT);");
		
		// adapt EdgeOp
		go.renameKeyword("EdgeOp", null, "directed", "->", null);
		go.renameKeyword("EdgeOp", null, "undirected", "--", null);
		
		// adapt EdgeRhsNode
		go.removeKeyword("EdgeRhsNode", null, null, null);
		
		go.removeBraces("EdgeRhsNode", null, null);
		
		go.removeOptionality("EdgeRhsNode", null);
		
		// adapt EdgeRhsSubgraph
		go.removeKeyword("EdgeRhsSubgraph", null, null, null);
		
		go.removeBraces("EdgeRhsSubgraph", null, null);
		
		go.removeOptionality("EdgeRhsSubgraph", null);
		// add primitive type COMPASS_PT
		go.addTerminalRule("COMPASS_PT", "'n' | 'ne' | 'e' | 'se' | 's' | 'sw' | 'w' | 'nw' | 'c' | '_';", null);
		
		return true;
	}

}
