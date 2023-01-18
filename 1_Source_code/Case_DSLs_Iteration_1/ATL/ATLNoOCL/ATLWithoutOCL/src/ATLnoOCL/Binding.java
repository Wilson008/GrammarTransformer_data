/**
 */
package ATLnoOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.Binding#getValue <em>Value</em>}</li>
 *   <li>{@link ATLnoOCL.Binding#getOutPatternElement <em>Out Pattern Element</em>}</li>
 *   <li>{@link ATLnoOCL.Binding#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link ATLnoOCL.Binding#isIsAssignment <em>Is Assignment</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getBinding_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLDummy getValue();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Binding#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Out Pattern Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.OutPatternElement#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Pattern Element</em>' container reference.
	 * @see #setOutPatternElement(OutPatternElement)
	 * @see ATLnoOCL.ATLnoOCLPackage#getBinding_OutPatternElement()
	 * @see ATLnoOCL.OutPatternElement#getBindings
	 * @model opposite="bindings" required="true" transient="false" ordered="false"
	 * @generated
	 */
	OutPatternElement getOutPatternElement();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Binding#getOutPatternElement <em>Out Pattern Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Pattern Element</em>' container reference.
	 * @see #getOutPatternElement()
	 * @generated
	 */
	void setOutPatternElement(OutPatternElement value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see ATLnoOCL.ATLnoOCLPackage#getBinding_PropertyName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Binding#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Is Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Assignment</em>' attribute.
	 * @see #setIsAssignment(boolean)
	 * @see ATLnoOCL.ATLnoOCLPackage#getBinding_IsAssignment()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAssignment();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Binding#isIsAssignment <em>Is Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Assignment</em>' attribute.
	 * @see #isIsAssignment()
	 * @generated
	 */
	void setIsAssignment(boolean value);

} // Binding
