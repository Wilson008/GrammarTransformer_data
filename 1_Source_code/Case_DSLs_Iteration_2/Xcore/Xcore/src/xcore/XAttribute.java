/**
 */
package xcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XAttribute#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link xcore.XAttribute#isID <em>ID</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXAttribute()
 * @model
 * @generated
 */
public interface XAttribute extends XStructuralFeature {
	/**
	 * Returns the value of the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Literal</em>' attribute.
	 * @see #setDefaultValueLiteral(String)
	 * @see xcore.XcorePackage#getXAttribute_DefaultValueLiteral()
	 * @model
	 * @generated
	 */
	String getDefaultValueLiteral();

	/**
	 * Sets the value of the '{@link xcore.XAttribute#getDefaultValueLiteral <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Literal</em>' attribute.
	 * @see #getDefaultValueLiteral()
	 * @generated
	 */
	void setDefaultValueLiteral(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(boolean)
	 * @see xcore.XcorePackage#getXAttribute_ID()
	 * @model
	 * @generated
	 */
	boolean isID();

	/**
	 * Sets the value of the '{@link xcore.XAttribute#isID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isID()
	 * @generated
	 */
	void setID(boolean value);

} // XAttribute
