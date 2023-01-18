/**
 */
package qvtoperational;

import emof.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.OperationBody#getOperation <em>Operation</em>}</li>
 *   <li>{@link qvtoperational.OperationBody#getContent <em>Content</em>}</li>
 *   <li>{@link qvtoperational.OperationBody#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getOperationBody()
 * @model
 * @generated
 */
public interface OperationBody extends Element {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qvtoperational.ImperativeOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(ImperativeOperation)
	 * @see qvtoperational.QvtoperationalPackage#getOperationBody_Operation()
	 * @see qvtoperational.ImperativeOperation#getBody
	 * @model opposite="body"
	 * @generated
	 */
	ImperativeOperation getOperation();

	/**
	 * Sets the value of the '{@link qvtoperational.OperationBody#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ImperativeOperation value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getOperationBody_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionGO> getContent();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getOperationBody_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionGO> getVariable();

} // OperationBody
