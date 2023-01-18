/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBracket;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Outermost Bracket</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RemoveOutermostBracketImpl extends OptimizationRuleImpl implements RemoveOutermostBracket {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveOutermostBracketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_OUTERMOST_BRACKET;
	}
	
	@Override
	public void apply() {
		for (int i = 0; i < grammar.getRules().size(); i++) {
			if (grammar.getRules().get(i).getName() == null)
				continue;
			
			if (!grammar.getRules().get(i).getName().equals(grammarRule))
				continue;
			
			String regexForLeftBracket = "(\\t|(    ))\\'\\{\\'(\\r\\n|\\r|\\n)*";
			String regexForRightBracket = "(\\'\\}\\'\\s*\\;)";
			
			for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
				String strTemp = grammar.getRules().get(i).getLines().get(j).getLineContent();
				strTemp = strTemp.replaceAll(regexForLeftBracket, "");

				grammar.getRules().get(i).getLines().get(j).setLineContent(strTemp.replaceAll(regexForRightBracket, ";"));
			}
			
			break;
		}
	}

} //RemoveOutermostBracketImpl
