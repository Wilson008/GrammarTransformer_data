/**
 */
package qvtoperational;

import emof.Operation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ImperativeOperation#getContext <em>Context</em>}</li>
 *   <li>{@link qvtoperational.ImperativeOperation#getResult <em>Result</em>}</li>
 *   <li>{@link qvtoperational.ImperativeOperation#getOverridden <em>Overridden</em>}</li>
 *   <li>{@link qvtoperational.ImperativeOperation#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getImperativeOperation()
 * @model
 * @generated
 */
public interface ImperativeOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(VarParameter)
	 * @see qvtoperational.QvtoperationalPackage#getImperativeOperation_Context()
	 * @model containment="true"
	 * @generated
	 */
	VarParameter getContext();

	/**
	 * Sets the value of the '{@link qvtoperational.ImperativeOperation#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(VarParameter value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.VarParameter}.
	 * It is bidirectional and its opposite is '{@link qvtoperational.VarParameter#getResOwner <em>Res Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getImperativeOperation_Result()
	 * @see qvtoperational.VarParameter#getResOwner
	 * @model opposite="resOwner" containment="true"
	 * @generated
	 */
	EList<VarParameter> getResult();

	/**
	 * Returns the value of the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overridden</em>' reference.
	 * @see #setOverridden(ImperativeOperation)
	 * @see qvtoperational.QvtoperationalPackage#getImperativeOperation_Overridden()
	 * @model
	 * @generated
	 */
	ImperativeOperation getOverridden();

	/**
	 * Sets the value of the '{@link qvtoperational.ImperativeOperation#getOverridden <em>Overridden</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overridden</em>' reference.
	 * @see #getOverridden()
	 * @generated
	 */
	void setOverridden(ImperativeOperation value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qvtoperational.OperationBody#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OperationBody)
	 * @see qvtoperational.QvtoperationalPackage#getImperativeOperation_Body()
	 * @see qvtoperational.OperationBody#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	OperationBody getBody();

	/**
	 * Sets the value of the '{@link qvtoperational.ImperativeOperation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OperationBody value);

} // ImperativeOperation
