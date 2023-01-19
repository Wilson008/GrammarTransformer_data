/**
 */
package xcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XTyped Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XTypedElement#isUnordered <em>Unordered</em>}</li>
 *   <li>{@link xcore.XTypedElement#isUnique <em>Unique</em>}</li>
 *   <li>{@link xcore.XTypedElement#getType <em>Type</em>}</li>
 *   <li>{@link xcore.XTypedElement#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface XTypedElement extends XNamedElement {
	/**
	 * Returns the value of the '<em><b>Unordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unordered</em>' attribute.
	 * @see #setUnordered(boolean)
	 * @see xcore.XcorePackage#getXTypedElement_Unordered()
	 * @model
	 * @generated
	 */
	boolean isUnordered();

	/**
	 * Sets the value of the '{@link xcore.XTypedElement#isUnordered <em>Unordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unordered</em>' attribute.
	 * @see #isUnordered()
	 * @generated
	 */
	void setUnordered(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see xcore.XcorePackage#getXTypedElement_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link xcore.XTypedElement#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(XGenericType)
	 * @see xcore.XcorePackage#getXTypedElement_Type()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	XGenericType getType();

	/**
	 * Sets the value of the '{@link xcore.XTypedElement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(XGenericType value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(int[])
	 * @see xcore.XcorePackage#getXTypedElement_Multiplicity()
	 * @model dataType="xcore.XMultiplicity"
	 * @generated
	 */
	int[] getMultiplicity();

	/**
	 * Sets the value of the '{@link xcore.XTypedElement#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(int[] value);

} // XTypedElement
