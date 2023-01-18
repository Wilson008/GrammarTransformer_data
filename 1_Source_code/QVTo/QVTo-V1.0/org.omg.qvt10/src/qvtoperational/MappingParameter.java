/**
 */
package qvtoperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.MappingParameter#getRefinedDomain <em>Refined Domain</em>}</li>
 *   <li>{@link qvtoperational.MappingParameter#getExtent <em>Extent</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getMappingParameter()
 * @model
 * @generated
 */
public interface MappingParameter extends VarParameter {
	/**
	 * Returns the value of the '<em><b>Refined Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Domain</em>' reference.
	 * @see #setRefinedDomain(ExpressionGO)
	 * @see qvtoperational.QvtoperationalPackage#getMappingParameter_RefinedDomain()
	 * @model
	 * @generated
	 */
	ExpressionGO getRefinedDomain();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingParameter#getRefinedDomain <em>Refined Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Domain</em>' reference.
	 * @see #getRefinedDomain()
	 * @generated
	 */
	void setRefinedDomain(ExpressionGO value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' reference.
	 * @see #setExtent(ModelParameter)
	 * @see qvtoperational.QvtoperationalPackage#getMappingParameter_Extent()
	 * @model
	 * @generated
	 */
	ModelParameter getExtent();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingParameter#getExtent <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(ModelParameter value);

} // MappingParameter
