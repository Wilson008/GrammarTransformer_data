/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ExpressionList#getExpression_semi_list <em>Expression semi list</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getExpressionList()
 * @model
 * @generated
 */
public interface ExpressionList extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression semi list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression semi list</em>' containment reference.
	 * @see #setExpression_semi_list(ExpressionSemiList)
	 * @see QVTOperational.QVTOperationalPackage#getExpressionList_Expression_semi_list()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionSemiList getExpression_semi_list();

	/**
	 * Sets the value of the '{@link QVTOperational.ExpressionList#getExpression_semi_list <em>Expression semi list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression semi list</em>' containment reference.
	 * @see #getExpression_semi_list()
	 * @generated
	 */
	void setExpression_semi_list(ExpressionSemiList value);

} // ExpressionList
