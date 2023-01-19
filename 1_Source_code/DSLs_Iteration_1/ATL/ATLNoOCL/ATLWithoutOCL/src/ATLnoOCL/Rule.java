/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.Rule#getOutPattern <em>Out Pattern</em>}</li>
 *   <li>{@link ATLnoOCL.Rule#getActionBlock <em>Action Block</em>}</li>
 *   <li>{@link ATLnoOCL.Rule#getVariables <em>Variables</em>}</li>
 *   <li>{@link ATLnoOCL.Rule#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends ModuleElement {
	/**
	 * Returns the value of the '<em><b>Out Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.OutPattern#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Pattern</em>' containment reference.
	 * @see #setOutPattern(OutPattern)
	 * @see ATLnoOCL.ATLnoOCLPackage#getRule_OutPattern()
	 * @see ATLnoOCL.OutPattern#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	OutPattern getOutPattern();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Rule#getOutPattern <em>Out Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Pattern</em>' containment reference.
	 * @see #getOutPattern()
	 * @generated
	 */
	void setOutPattern(OutPattern value);

	/**
	 * Returns the value of the '<em><b>Action Block</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.ActionBlock#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Block</em>' containment reference.
	 * @see #setActionBlock(ActionBlock)
	 * @see ATLnoOCL.ATLnoOCLPackage#getRule_ActionBlock()
	 * @see ATLnoOCL.ActionBlock#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	ActionBlock getActionBlock();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Rule#getActionBlock <em>Action Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Block</em>' containment reference.
	 * @see #getActionBlock()
	 * @generated
	 */
	void setActionBlock(ActionBlock value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.RuleVariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.RuleVariableDeclaration#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getRule_Variables()
	 * @see ATLnoOCL.RuleVariableDeclaration#getRule
	 * @model opposite="rule" containment="true"
	 * @generated
	 */
	EList<RuleVariableDeclaration> getVariables();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ATLnoOCL.ATLnoOCLPackage#getRule_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Rule
