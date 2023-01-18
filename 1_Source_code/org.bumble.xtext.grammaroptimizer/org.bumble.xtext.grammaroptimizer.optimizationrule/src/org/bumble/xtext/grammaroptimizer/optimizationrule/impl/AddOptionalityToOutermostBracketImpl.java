/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBracket;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Optionality To Outermost Bracket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToOutermostBracketImpl#getPackageType <em>Package Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddOptionalityToOutermostBracketImpl extends OptimizationRuleImpl implements AddOptionalityToOutermostBracket {
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
	protected AddOptionalityToOutermostBracketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_OPTIONALITY_TO_OUTERMOST_BRACKET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACKET__PACKAGE_TYPE, oldPackageType, packageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACKET__PACKAGE_TYPE:
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
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACKET__PACKAGE_TYPE:
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
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACKET__PACKAGE_TYPE:
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
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACKET__PACKAGE_TYPE:
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
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammarRule.equals(rule.getName()))
					continue;
			}
			
			if (packageType == PackageKey.PACKAGE_OPTIONALLY) {
				// if all the attributes are optional
				if (RegexHelper.areAttributesOptional(rule)) {
					for (LineEntry line : rule.getLines()) {
						String lineContent = line.getLineContent();
						
						if (RegexHelper.doesStringExist(lineContent, "\'\\{\'") && !RegexHelper.doesStringExist(lineContent, "[a-zA-Z]")) {
							lineContent = lineContent.replaceAll("\'\\{\'", "('{'");
						}
						
						if (RegexHelper.doesStringExist(lineContent, "\'\\}\'") && !RegexHelper.doesStringExist(lineContent, "[a-zA-Z]")) {
							lineContent = lineContent.replaceAll("\'\\}\'", "'}')?");
						}
						
						line.setLineContent(lineContent);
					}
				}
			}
			else {
				for (LineEntry line : rule.getLines()) {
					String lineContent = line.getLineContent();
					
					if (RegexHelper.doesStringExist(lineContent, "\'\\{\'") && !RegexHelper.doesStringExist(lineContent, "[a-zA-Z]")) {
						lineContent = lineContent.replaceAll("\'\\{\'", "('{'");
					}
					
					if (RegexHelper.doesStringExist(lineContent, "\'\\}\'") && !RegexHelper.doesStringExist(lineContent, "[a-zA-Z]")) {
						if (packageType == PackageKey.PACKAGE_ZERO_OR_MORE)
							lineContent = lineContent.replaceAll("\'\\}\'", "'}')*");
						else if (packageType == PackageKey.PACKAGE_ONE_OR_MORE)
							lineContent = lineContent.replaceAll("\'\\}\'", "'}')+");
						else 
							lineContent = lineContent.replaceAll("\'\\}\'", "'}')");
					}
					
					line.setLineContent(lineContent);
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty())
				break;
		}
	}

} //AddOptionalityToOutermostBracketImpl
