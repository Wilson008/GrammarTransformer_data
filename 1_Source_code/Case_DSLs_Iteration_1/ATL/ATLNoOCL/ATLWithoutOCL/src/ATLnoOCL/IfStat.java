/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.IfStat#getCondition <em>Condition</em>}</li>
 *   <li>{@link ATLnoOCL.IfStat#getThenStatements <em>Then Statements</em>}</li>
 *   <li>{@link ATLnoOCL.IfStat#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getIfStat()
 * @model
 * @generated
 */
public interface IfStat extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getIfStat_Condition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLDummy getCondition();

	/**
	 * Sets the value of the '{@link ATLnoOCL.IfStat#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Then Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Statements</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getIfStat_ThenStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getThenStatements();

	/**
	 * Returns the value of the '<em><b>Else Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statements</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getIfStat_ElseStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getElseStatements();

} // IfStat
