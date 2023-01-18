/**
 */
package EMOF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EMOF.Parameter#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see EMOF.EMOFPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypedElement, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link EMOF.Operation#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see EMOF.EMOFPackage#getParameter_Operation()
	 * @see EMOF.Operation#getOwnedParameter
	 * @model opposite="ownedParameter" resolveProxies="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link EMOF.Parameter#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Parameter
