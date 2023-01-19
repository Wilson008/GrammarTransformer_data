/**
 */
package ATLnoOCL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.PatternElement#getId <em>Id</em>}</li>
 *   <li>{@link ATLnoOCL.PatternElement#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ATLnoOCL.PatternElement#getType <em>Type</em>}</li>
 *   <li>{@link ATLnoOCL.PatternElement#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link ATLnoOCL.PatternElement#getLetExp <em>Let Exp</em>}</li>
 *   <li>{@link ATLnoOCL.PatternElement#getBaseExp <em>Base Exp</em>}</li>
 *   <li>{@link ATLnoOCL.PatternElement#getVariableExp <em>Variable Exp</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getPatternElement()
 * @model abstract="true"
 * @generated
 */
public interface PatternElement extends LocatedElement {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ATLnoOCL.ATLnoOCLPackage#getPatternElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ATLnoOCL.PatternElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ATLnoOCL.ATLnoOCLPackage#getPatternElement_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ATLnoOCL.PatternElement#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getPatternElement_Type()
	 * @model
	 * @generated
	 */
	OCLDummy getType();

	/**
	 * Sets the value of the '{@link ATLnoOCL.PatternElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Init Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Expression</em>' reference.
	 * @see #setInitExpression(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getPatternElement_InitExpression()
	 * @model
	 * @generated
	 */
	OCLDummy getInitExpression();

	/**
	 * Sets the value of the '{@link ATLnoOCL.PatternElement#getInitExpression <em>Init Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expression</em>' reference.
	 * @see #getInitExpression()
	 * @generated
	 */
	void setInitExpression(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Let Exp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Let Exp</em>' reference.
	 * @see #setLetExp(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getPatternElement_LetExp()
	 * @model
	 * @generated
	 */
	OCLDummy getLetExp();

	/**
	 * Sets the value of the '{@link ATLnoOCL.PatternElement#getLetExp <em>Let Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Let Exp</em>' reference.
	 * @see #getLetExp()
	 * @generated
	 */
	void setLetExp(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Base Exp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Exp</em>' reference.
	 * @see #setBaseExp(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getPatternElement_BaseExp()
	 * @model
	 * @generated
	 */
	OCLDummy getBaseExp();

	/**
	 * Sets the value of the '{@link ATLnoOCL.PatternElement#getBaseExp <em>Base Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Exp</em>' reference.
	 * @see #getBaseExp()
	 * @generated
	 */
	void setBaseExp(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Variable Exp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Exp</em>' reference.
	 * @see #setVariableExp(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getPatternElement_VariableExp()
	 * @model
	 * @generated
	 */
	OCLDummy getVariableExp();

	/**
	 * Sets the value of the '{@link ATLnoOCL.PatternElement#getVariableExp <em>Variable Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Exp</em>' reference.
	 * @see #getVariableExp()
	 * @generated
	 */
	void setVariableExp(OCLDummy value);
} // PatternElement
