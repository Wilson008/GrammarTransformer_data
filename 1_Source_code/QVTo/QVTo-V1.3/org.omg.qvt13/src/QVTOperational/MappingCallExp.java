/**
 */
package QVTOperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.MappingCallExp#getIsStrict <em>Is Strict</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getMappingCallExp()
 * @model
 * @generated
 */
public interface MappingCallExp extends ImperativeCallExp {
	/**
	 * Returns the value of the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strict</em>' attribute.
	 * @see #setIsStrict(Boolean)
	 * @see QVTOperational.QVTOperationalPackage#getMappingCallExp_IsStrict()
	 * @model dataType="PrimitiveTypes.Boolean"
	 * @generated
	 */
	Boolean getIsStrict();

	/**
	 * Sets the value of the '{@link QVTOperational.MappingCallExp#getIsStrict <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strict</em>' attribute.
	 * @see #getIsStrict()
	 * @generated
	 */
	void setIsStrict(Boolean value);

} // MappingCallExp
