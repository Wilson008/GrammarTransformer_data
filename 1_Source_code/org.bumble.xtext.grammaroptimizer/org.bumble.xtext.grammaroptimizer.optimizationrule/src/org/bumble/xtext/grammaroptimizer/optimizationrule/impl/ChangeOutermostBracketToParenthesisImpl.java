/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOutermostBracketToParenthesis;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Outermost Bracket To Parenthesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChangeOutermostBracketToParenthesisImpl extends OptimizationRuleImpl implements ChangeOutermostBracketToParenthesis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeOutermostBracketToParenthesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_OUTERMOST_BRACKET_TO_PARENTHESIS;
	}
	
	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammarRule.equals(rule.getName()))
					continue;
			}
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				
				if (RegexHelper.doesStringExist(lineContent, "\'\\{\'") && !RegexHelper.doesStringExist(lineContent, "[a-zA-Z]")) {
					lineContent = lineContent.replaceAll("\'\\{\'", "'('");
				}
				
				if (RegexHelper.doesStringExist(lineContent, "\'\\}\'") && !RegexHelper.doesStringExist(lineContent, "[a-zA-Z]")) {
					lineContent = lineContent.replaceAll("\'\\}\'", "')'");					
				}
				
				line.setLineContent(lineContent);
			}
			
			if (grammarRule != null && !grammarRule.isEmpty())
				break;
		}
	}

} //ChangeOutermostBracketToParenthesisImpl
