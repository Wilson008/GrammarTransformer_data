/**
 */
package xcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XNamed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XNamedElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface XNamedElement extends XModelElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xcore.XcorePackage#getXNamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xcore.XNamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // XNamedElement
