/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuoteToRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Parentheses Without Quote To Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuoteToRuleImpl#getPackageType <em>Package Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddParenthesesWithoutQuoteToRuleImpl extends OptimizationRuleImpl implements AddParenthesesWithoutQuoteToRule {
	/**
	 * The default value of the '{@link #getPackageType() <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageType()
	 * @generated
	 * @ordered
	 */
	protected static final PackageKey PACKAGE_TYPE_EDEFAULT = PackageKey.PACKAGE_ONLY;
	/**
	 * The cached value of the '{@link #getPackageType() <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageType()
	 * @generated
	 * @ordered
	 */
	protected PackageKey packageType = PACKAGE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddParenthesesWithoutQuoteToRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageKey getPackageType() {
		return packageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageType(PackageKey newPackageType) {
		PackageKey oldPackageType = packageType;
		packageType = newPackageType == null ? PACKAGE_TYPE_EDEFAULT : newPackageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__PACKAGE_TYPE, oldPackageType, packageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__PACKAGE_TYPE:
				return getPackageType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__PACKAGE_TYPE:
				setPackageType((PackageKey)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__PACKAGE_TYPE:
				setPackageType(PACKAGE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__PACKAGE_TYPE:
				return packageType != PACKAGE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (packageType: ");
		result.append(packageType);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			int lineCount = rule.getLines().size();
			
			if (lineCount >= 2) {
				int startLineNo = -1;
				String secondLineContent = rule.getLines().get(1).getLineContent();
				if (RegexHelper.doesStringExist(secondLineContent, "\\{\\w+\\}"))
					startLineNo = 2;
				else
					startLineNo = 1;
				
				if (lineCount < (startLineNo + 1))
					break;
				
				secondLineContent = rule.getLines().get(startLineNo).getLineContent();
				int numOfWhitespaceIn2nd = StringHelper.getWhitespaceNumAtHead(secondLineContent);
				String coreContentIn2nd = secondLineContent.stripLeading();
				secondLineContent = "(" + coreContentIn2nd;
				secondLineContent = StringHelper.setWhitespaceToString(secondLineContent, numOfWhitespaceIn2nd);
				rule.getLines().get(startLineNo).setLineContent(secondLineContent);
				
				String lastLineContent = rule.getLines().get(lineCount - 1).getLineContent();
				
				// if at least one English letter exist in the last line
				if (RegexHelper.doesStringExist(lastLineContent, "(\\w*)")) {
					Pattern pattern = Pattern.compile("(\\w*)\\;");
					String coreLastLineContent = RegexHelper.getTargetString(lastLineContent, pattern);
					
					if (coreLastLineContent != null) {
						if (packageType == PackageKey.PACKAGE_OPTIONALLY)
							lastLineContent = lastLineContent.replaceAll("\\;", ")?;");
						else if (packageType == PackageKey.PACKAGE_ONE_OR_MORE)
							lastLineContent = lastLineContent.replaceAll("\\;", ")+;");
						else if (packageType == PackageKey.PACKAGE_ZERO_OR_MORE)
							lastLineContent = lastLineContent.replaceAll("\\;", ")*;");
						else
							lastLineContent = lastLineContent.replaceAll("\\;", ");");
					}
				}
				else {
					if (packageType == PackageKey.PACKAGE_OPTIONALLY)
						lastLineContent = lastLineContent.replaceAll("\\;", ")?;");
					else if (packageType == PackageKey.PACKAGE_ONE_OR_MORE)
						lastLineContent = lastLineContent.replaceAll("\\;", ")+;");
					else if (packageType == PackageKey.PACKAGE_ZERO_OR_MORE)
						lastLineContent = lastLineContent.replaceAll("\\;", ")*;");
					else
						lastLineContent = lastLineContent.replaceAll("\\;", ");");
				}
				
				rule.getLines().get(lineCount - 1).setLineContent(lastLineContent);
			}
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //AddParenthesesWithoutQuoteToRuleImpl
