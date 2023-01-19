/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.RuleVariableDeclaration#getRule <em>Rule</em>}</li>
 *   <li>{@link ATLnoOCL.RuleVariableDeclaration#getId <em>Id</em>}</li>
 *   <li>{@link ATLnoOCL.RuleVariableDeclaration#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ATLnoOCL.RuleVariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link ATLnoOCL.RuleVariableDeclaration#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link ATLnoOCL.RuleVariableDeclaration#getLetExp <em>Let Exp</em>}</li>
 *   <li>{@link ATLnoOCL.RuleVariableDeclaration#getBaseExp <em>Base Exp</em>}</li>
 *   <li>{@link ATLnoOCL.RuleVariableDeclaration#getVariableExp <em>Variable Exp</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getRuleVariableDeclaration()
 * @model
 * @generated
 */
public interface RuleVariableDeclaration extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.Rule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see ATLnoOCL.ATLnoOCLPackage#getRuleVariableDeclaration_Rule()
	 * @see ATLnoOCL.Rule#getVariables
	 * @model opposite="variables" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link ATLnoOCL.RuleVariableDeclaration#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ATLnoOCL.ATLnoOCLPackage#getRuleVariableDeclaration_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ATLnoOCL.RuleVariableDeclaration#getId <em>Id</em>}' attribute.
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
	 * @see ATLnoOCL.ATLnoOCLPackage#getRuleVariableDeclaration_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ATLnoOCL.RuleVariableDeclaration#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ATLnoOCL.ATLnoOCLPackage#getRuleVariableDeclaration_Type()
	 * @model
	 * @generated
	 */
	OCLDummy getType();

	/**
	 * Sets the value of the '{@link ATLnoOCL.RuleVariableDeclaration#getType <em>Type</em>}' reference.
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
	 * @see ATLnoOCL.ATLnoOCLPackage#getRuleVariableDeclaration_InitExpression()
	 * @model
	 * @generated
	 */
	OCLDummy getInitExpression();

	/**
	 * Sets the value of the '{@link ATLnoOCL.RuleVariableDeclaration#getInitExpression <em>Init Expression</em>}' reference.
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
	 * @see ATLnoOCL.ATLnoOCLPackage#getRuleVariableDeclaration_LetExp()
	 * @model
	 * @generated
	 */
	OCLDummy getLetExp();

	/**
	 * Sets the value of the '{@link ATLnoOCL.RuleVariableDeclaration#getLetExp <em>Let Exp</em>}' reference.
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
	 * @see ATLnoOCL.ATLnoOCLPackage#getRuleVariableDeclaration_BaseExp()
	 * @model
	 * @generated
	 */
	OCLDummy getBaseExp();

	/**
	 * Sets the value of the '{@link ATLnoOCL.RuleVariableDeclaration#getBaseExp <em>Base Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Exp</em>' reference.
	 * @see #getBaseExp()
	 * @generated
	 */
	void setBaseExp(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Variable Exp</b></em>' reference list.
	 * The list contents are of type {@link ATLnoOCL.OCLDummy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Exp</em>' reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getRuleVariableDeclaration_VariableExp()
	 * @model
	 * @generated
	 */
	EList<OCLDummy> getVariableExp();

} // RuleVariableDeclaration
