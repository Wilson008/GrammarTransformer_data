/**
 */
package QVTOperational;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.MappingParameter#getExtent <em>Extent</em>}</li>
 *   <li>{@link QVTOperational.MappingParameter#getReferredDomain <em>Referred Domain</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getMappingParameter()
 * @model
 * @generated
 */
public interface MappingParameter extends VarParameter {
	/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' reference.
	 * @see #setExtent(ModelParameter)
	 * @see QVTOperational.QVTOperationalPackage#getMappingParameter_Extent()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='mappingParameter'"
	 * @generated
	 */
	ModelParameter getExtent();

	/**
	 * Sets the value of the '{@link QVTOperational.MappingParameter#getExtent <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(ModelParameter value);

	/**
	 * Returns the value of the '<em><b>Referred Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Domain</em>' reference.
	 * @see #setReferredDomain(ExpressionGO)
	 * @see QVTOperational.QVTOperationalPackage#getMappingParameter_ReferredDomain()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referringParameter'"
	 * @generated
	 */
	ExpressionGO getReferredDomain();

	/**
	 * Sets the value of the '{@link QVTOperational.MappingParameter#getReferredDomain <em>Referred Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Domain</em>' reference.
	 * @see #getReferredDomain()
	 * @generated
	 */
	void setReferredDomain(ExpressionGO value);

} // MappingParameter
