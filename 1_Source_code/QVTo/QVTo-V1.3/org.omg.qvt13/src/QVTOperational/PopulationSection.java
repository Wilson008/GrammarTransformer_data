/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.PopulationSection#getExpression_list <em>Expression list</em>}</li>
 *   <li>{@link QVTOperational.PopulationSection#getExpression_block <em>Expression block</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getPopulationSection()
 * @model
 * @generated
 */
public interface PopulationSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression list</em>' containment reference.
	 * @see #setExpression_list(ExpressionList)
	 * @see QVTOperational.QVTOperationalPackage#getPopulationSection_Expression_list()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionList getExpression_list();

	/**
	 * Sets the value of the '{@link QVTOperational.PopulationSection#getExpression_list <em>Expression list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression list</em>' containment reference.
	 * @see #getExpression_list()
	 * @generated
	 */
	void setExpression_list(ExpressionList value);

	/**
	 * Returns the value of the '<em><b>Expression block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression block</em>' containment reference.
	 * @see #setExpression_block(ExpressionBlock)
	 * @see QVTOperational.QVTOperationalPackage#getPopulationSection_Expression_block()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionBlock getExpression_block();

	/**
	 * Sets the value of the '{@link QVTOperational.PopulationSection#getExpression_block <em>Expression block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression block</em>' containment reference.
	 * @see #getExpression_block()
	 * @generated
	 */
	void setExpression_block(ExpressionBlock value);

} // PopulationSection
