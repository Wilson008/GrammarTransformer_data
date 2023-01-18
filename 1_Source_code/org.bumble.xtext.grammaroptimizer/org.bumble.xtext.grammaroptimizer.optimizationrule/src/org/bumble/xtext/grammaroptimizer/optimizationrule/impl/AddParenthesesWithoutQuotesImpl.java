/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Parentheses Without Quotes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl#getPackageType <em>Package Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddParenthesesWithoutQuotesImpl extends OptimizationRuleImpl implements AddParenthesesWithoutQuotes {
	/**
	 * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected String keyword = KEYWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeKey SCOPE_EDEFAULT = ScopeKey.SINGLEKEWORD;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected ScopeKey scope = SCOPE_EDEFAULT;

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
	protected AddParenthesesWithoutQuotesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_PARENTHESES_WITHOUT_QUOTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyword(String newKeyword) {
		String oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD, oldKeyword, keyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeKey getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(ScopeKey newScope) {
		ScopeKey oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE, oldScope, scope));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__PACKAGE_TYPE, oldPackageType, packageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD:
				return getKeyword();
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE:
				return getScope();
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__PACKAGE_TYPE:
				return getPackageType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD:
				setKeyword((String)newValue);
				return;
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE:
				setScope((ScopeKey)newValue);
				return;
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__PACKAGE_TYPE:
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
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD:
				setKeyword(KEYWORD_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__PACKAGE_TYPE:
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
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD:
				return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__PACKAGE_TYPE:
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
		result.append(" (keyword: ");
		result.append(keyword);
		result.append(", scope: ");
		result.append(scope);
		result.append(", packageType: ");
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
			
			if (scope.equals(ScopeKey.SINGLEKEWORD)) {
				for (LineEntry line : rule.getLines()) {
					String lineContent = line.getLineContent();
					String regex = "\'" + keyword + "\'";
					if (RegexHelper.doesStringExist(lineContent, regex)) {
						lineContent = lineContent.replaceAll(regex, "('" + keyword + "')");
						line.setLineContent(lineContent);
						break;
					}
				}
			}
			else if (scope.equals(ScopeKey.SINGLELINE)) {				
				for (LineEntry line : rule.getLines()) {
					if (line.getAttrName() == null)
						continue;
					
					if (attrName != null && !attrName.isEmpty()) {
						if (!attrName.equals(line.getAttrName()))
							continue;
					}
					
					String coreContent = line.getLineContent().stripLeading();
					int numOfWhiteSpace = StringHelper.getWhitespaceNumAtHead(line.getLineContent());
					String lineContent = "(" + coreContent + ")";
					if (packageType == PackageKey.PACKAGE_OPTIONALLY)
						lineContent += "?";
					else if (packageType == PackageKey.PACKAGE_ZERO_OR_MORE)
						lineContent += "*";
					else if (packageType == PackageKey.PACKAGE_ONE_OR_MORE)
						lineContent += "+";
					
					lineContent = StringHelper.setWhitespaceToString(lineContent, numOfWhiteSpace);
					line.setLineContent(lineContent);
					
					if (attrName != null && !attrName.isEmpty()) 
						break;
				}
			}
			else {
				
			}
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //AddParenthesesWithoutQuotesImpl
