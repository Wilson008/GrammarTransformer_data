/**
 */
package qvtoperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.InitPart#getInit_op <em>Init op</em>}</li>
 *   <li>{@link qvtoperational.InitPart#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getInitPart()
 * @model
 * @generated
 */
public interface InitPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Init op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init op</em>' attribute.
	 * @see #setInit_op(String)
	 * @see qvtoperational.QvtoperationalPackage#getInitPart_Init_op()
	 * @model required="true"
	 * @generated
	 */
	String getInit_op();

	/**
	 * Sets the value of the '{@link qvtoperational.InitPart#getInit_op <em>Init op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init op</em>' attribute.
	 * @see #getInit_op()
	 * @generated
	 */
	void setInit_op(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ExpressionGO)
	 * @see qvtoperational.QvtoperationalPackage#getInitPart_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionGO getExpression();

	/**
	 * Sets the value of the '{@link qvtoperational.InitPart#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ExpressionGO value);

} // InitPart
