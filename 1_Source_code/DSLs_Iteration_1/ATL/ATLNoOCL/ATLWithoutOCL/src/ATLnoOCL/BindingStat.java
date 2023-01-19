/**
 */
package ATLnoOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.BindingStat#getSource <em>Source</em>}</li>
 *   <li>{@link ATLnoOCL.BindingStat#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link ATLnoOCL.BindingStat#isIsAssignment <em>Is Assignment</em>}</li>
 *   <li>{@link ATLnoOCL.BindingStat#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getBindingStat()
 * @model
 * @generated
 */
public interface BindingStat extends Statement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getBindingStat_Source()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLDummy getSource();

	/**
	 * Sets the value of the '{@link ATLnoOCL.BindingStat#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see ATLnoOCL.ATLnoOCLPackage#getBindingStat_PropertyName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link ATLnoOCL.BindingStat#getPropertyName <em>Property Name</em>}' attribute.
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
	 * @see ATLnoOCL.ATLnoOCLPackage#getBindingStat_IsAssignment()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAssignment();

	/**
	 * Sets the value of the '{@link ATLnoOCL.BindingStat#isIsAssignment <em>Is Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Assignment</em>' attribute.
	 * @see #isIsAssignment()
	 * @generated
	 */
	void setIsAssignment(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getBindingStat_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLDummy getValue();

	/**
	 * Sets the value of the '{@link ATLnoOCL.BindingStat#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OCLDummy value);

} // BindingStat
