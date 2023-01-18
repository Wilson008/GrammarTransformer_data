/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveParenthesesInSpecifiedAttr;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Parentheses In Specified Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RemoveParenthesesInSpecifiedAttrImpl extends OptimizationRuleImpl implements RemoveParenthesesInSpecifiedAttr {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveParenthesesInSpecifiedAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_PARENTHESES_IN_SPECIFIED_ATTR;
	}

	public void apply() {
		for (int i = 0; i < grammar.getRules().size(); i++) {
			if (grammar.getRules().get(i).getName() == null)
				continue;
			
			if (!grammar.getRules().get(i).getName().equals(grammarRule))
				continue;
			
			String regexForLeftBracket = "\'\\(\'";
			String regexForRightBracket = "\'\\)\'";
			
			for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
				if (!RegexHelper.doesStringExist(grammar.getRules().get(i).getLines().get(j).getLineContent(), attrName))
					continue;
				
				String strTemp = grammar.getRules().get(i).getLines().get(j).getLineContent();
				strTemp = strTemp.replaceAll(regexForLeftBracket, "");

				grammar.getRules().get(i).getLines().get(j).setLineContent(strTemp.replaceAll(regexForRightBracket, ""));
				
				break;
			}
			
			break;
		}
	}
} //RemoveParenthesesInSpecifiedAttrImpl
