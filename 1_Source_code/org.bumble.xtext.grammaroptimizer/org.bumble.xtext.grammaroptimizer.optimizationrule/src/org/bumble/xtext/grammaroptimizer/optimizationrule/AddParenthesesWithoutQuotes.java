/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Parentheses Without Quotes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getScope <em>Scope</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getPackageType <em>Package Type</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddParenthesesWithoutQuotes()
 * @model
 * @generated
 */
public interface AddParenthesesWithoutQuotes extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute.
	 * @see #setKeyword(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddParenthesesWithoutQuotes_Keyword()
	 * @model
	 * @generated
	 */
	String getKeyword();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getKeyword <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' attribute.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey
	 * @see #setScope(ScopeKey)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddParenthesesWithoutQuotes_Scope()
	 * @model
	 * @generated
	 */
	ScopeKey getScope();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ScopeKey value);

	/**
	 * Returns the value of the '<em><b>Package Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Type</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey
	 * @see #setPackageType(PackageKey)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddParenthesesWithoutQuotes_PackageType()
	 * @model
	 * @generated
	 */
	PackageKey getPackageType();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getPackageType <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Type</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey
	 * @see #getPackageType()
	 * @generated
	 */
	void setPackageType(PackageKey value);

} // AddParenthesesWithoutQuotes
