/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Optionality To Outermost Bracket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBracket#getPackageType <em>Package Type</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddOptionalityToOutermostBracket()
 * @model
 * @generated
 */
public interface AddOptionalityToOutermostBracket extends OptimizationRule {

	/**
	 * Returns the value of the '<em><b>Package Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Type</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey
	 * @see #setPackageType(PackageKey)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddOptionalityToOutermostBracket_PackageType()
	 * @model
	 * @generated
	 */
	PackageKey getPackageType();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBracket#getPackageType <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Type</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey
	 * @see #getPackageType()
	 * @generated
	 */
	void setPackageType(PackageKey value);
} // AddOptionalityToOutermostBracket
