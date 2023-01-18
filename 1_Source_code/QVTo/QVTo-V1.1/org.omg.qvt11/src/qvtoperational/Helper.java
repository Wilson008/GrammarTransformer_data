/**
 */
package qvtoperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.Helper#getIsQuery <em>Is Query</em>}</li>
 *   <li>{@link qvtoperational.Helper#getHelper_header <em>Helper header</em>}</li>
 *   <li>{@link qvtoperational.Helper#getExpression <em>Expression</em>}</li>
 *   <li>{@link qvtoperational.Helper#getExpression_block <em>Expression block</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getHelper()
 * @model
 * @generated
 */
public interface Helper extends ImperativeOperation, qvtoperational.Module {
	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(Boolean)
	 * @see qvtoperational.QvtoperationalPackage#getHelper_IsQuery()
	 * @model dataType="PrimitiveTypes.Boolean"
	 * @generated
	 */
	Boolean getIsQuery();

	/**
	 * Sets the value of the '{@link qvtoperational.Helper#getIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #getIsQuery()
	 * @generated
	 */
	void setIsQuery(Boolean value);

	/**
	 * Returns the value of the '<em><b>Helper header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper header</em>' containment reference.
	 * @see #setHelper_header(HelperHeader)
	 * @see qvtoperational.QvtoperationalPackage#getHelper_Helper_header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HelperHeader getHelper_header();

	/**
	 * Sets the value of the '{@link qvtoperational.Helper#getHelper_header <em>Helper header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helper header</em>' containment reference.
	 * @see #getHelper_header()
	 * @generated
	 */
	void setHelper_header(HelperHeader value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ExpressionGO)
	 * @see qvtoperational.QvtoperationalPackage#getHelper_Expression()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionGO getExpression();

	/**
	 * Sets the value of the '{@link qvtoperational.Helper#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ExpressionGO value);

	/**
	 * Returns the value of the '<em><b>Expression block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression block</em>' containment reference.
	 * @see #setExpression_block(ExpressionBlock)
	 * @see qvtoperational.QvtoperationalPackage#getHelper_Expression_block()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionBlock getExpression_block();

	/**
	 * Sets the value of the '{@link qvtoperational.Helper#getExpression_block <em>Expression block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression block</em>' containment reference.
	 * @see #getExpression_block()
	 * @generated
	 */
	void setExpression_block(ExpressionBlock value);

} // Helper
