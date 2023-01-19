/**
 */
package ATLnoOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Out Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.ForEachOutPatternElement#getCollection <em>Collection</em>}</li>
 *   <li>{@link ATLnoOCL.ForEachOutPatternElement#getIterator <em>Iterator</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getForEachOutPatternElement()
 * @model
 * @generated
 */
public interface ForEachOutPatternElement extends OutPatternElement {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getForEachOutPatternElement_Collection()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLDummy getCollection();

	/**
	 * Sets the value of the '{@link ATLnoOCL.ForEachOutPatternElement#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' containment reference.
	 * @see #setIterator(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getForEachOutPatternElement_Iterator()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLDummy getIterator();

	/**
	 * Sets the value of the '{@link ATLnoOCL.ForEachOutPatternElement#getIterator <em>Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' containment reference.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(OCLDummy value);

} // ForEachOutPatternElement
