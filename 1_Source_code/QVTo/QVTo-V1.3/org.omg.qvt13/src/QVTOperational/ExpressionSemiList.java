/**
 */
package QVTOperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Semi List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ExpressionSemiList#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getExpressionSemiList()
 * @model
 * @generated
 */
public interface ExpressionSemiList extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getExpressionSemiList_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionGO> getExpression();

} // ExpressionSemiList
