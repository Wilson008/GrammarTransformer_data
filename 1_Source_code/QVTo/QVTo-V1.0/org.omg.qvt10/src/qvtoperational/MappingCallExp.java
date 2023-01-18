/**
 */
package qvtoperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.MappingCallExp#getIsStrict <em>Is Strict</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getMappingCallExp()
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
	 * @see qvtoperational.QvtoperationalPackage#getMappingCallExp_IsStrict()
	 * @model dataType="emof.Boolean"
	 * @generated
	 */
	Boolean getIsStrict();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingCallExp#getIsStrict <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strict</em>' attribute.
	 * @see #getIsStrict()
	 * @generated
	 */
	void setIsStrict(Boolean value);

} // MappingCallExp
