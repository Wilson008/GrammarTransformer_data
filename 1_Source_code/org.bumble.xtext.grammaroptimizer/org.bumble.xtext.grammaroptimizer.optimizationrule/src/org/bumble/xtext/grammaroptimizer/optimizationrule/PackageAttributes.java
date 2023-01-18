/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.PackageAttributes#getStartAttr <em>Start Attr</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.PackageAttributes#getEndAttr <em>End Attr</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.PackageAttributes#getPackagetype <em>Packagetype</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getPackageAttributes()
 * @model
 * @generated
 */
public interface PackageAttributes extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Start Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Attr</em>' attribute.
	 * @see #setStartAttr(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getPackageAttributes_StartAttr()
	 * @model
	 * @generated
	 */
	String getStartAttr();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.PackageAttributes#getStartAttr <em>Start Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Attr</em>' attribute.
	 * @see #getStartAttr()
	 * @generated
	 */
	void setStartAttr(String value);

	/**
	 * Returns the value of the '<em><b>End Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Attr</em>' attribute.
	 * @see #setEndAttr(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getPackageAttributes_EndAttr()
	 * @model
	 * @generated
	 */
	String getEndAttr();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.PackageAttributes#getEndAttr <em>End Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Attr</em>' attribute.
	 * @see #getEndAttr()
	 * @generated
	 */
	void setEndAttr(String value);

	/**
	 * Returns the value of the '<em><b>Packagetype</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packagetype</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey
	 * @see #setPackagetype(PackageKey)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getPackageAttributes_Packagetype()
	 * @model
	 * @generated
	 */
	PackageKey getPackagetype();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.PackageAttributes#getPackagetype <em>Packagetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packagetype</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.PackageKey
	 * @see #getPackagetype()
	 * @generated
	 */
	void setPackagetype(PackageKey value);

} // PackageAttributes
