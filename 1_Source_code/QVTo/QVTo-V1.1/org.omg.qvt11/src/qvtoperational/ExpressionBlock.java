/**
 */
package qvtoperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ExpressionBlock#getExpression_list <em>Expression list</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getExpressionBlock()
 * @model
 * @generated
 */
public interface ExpressionBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression list</em>' containment reference.
	 * @see #setExpression_list(ExpressionList)
	 * @see qvtoperational.QvtoperationalPackage#getExpressionBlock_Expression_list()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionList getExpression_list();

	/**
	 * Sets the value of the '{@link qvtoperational.ExpressionBlock#getExpression_list <em>Expression list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression list</em>' containment reference.
	 * @see #getExpression_list()
	 * @generated
	 */
	void setExpression_list(ExpressionList value);

} // ExpressionBlock
