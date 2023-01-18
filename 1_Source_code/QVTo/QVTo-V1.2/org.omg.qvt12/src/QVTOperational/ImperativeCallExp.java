/**
 */
package QVTOperational;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ImperativeCallExp#getIsVirtual <em>Is Virtual</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getImperativeCallExp()
 * @model
 * @generated
 */
public interface ImperativeCallExp extends ExpressionGO {
	/**
	 * Returns the value of the '<em><b>Is Virtual</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Virtual</em>' attribute.
	 * @see #setIsVirtual(Boolean)
	 * @see QVTOperational.QVTOperationalPackage#getImperativeCallExp_IsVirtual()
	 * @model default="true" dataType="PrimitiveTypes.Boolean"
	 * @generated
	 */
	Boolean getIsVirtual();

	/**
	 * Sets the value of the '{@link QVTOperational.ImperativeCallExp#getIsVirtual <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Virtual</em>' attribute.
	 * @see #getIsVirtual()
	 * @generated
	 */
	void setIsVirtual(Boolean value);

} // ImperativeCallExp
