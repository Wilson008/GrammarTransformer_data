/**
 */
package QVTOperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.Constructor#getConstructor_header <em>Constructor header</em>}</li>
 *   <li>{@link QVTOperational.Constructor#getExpression_block <em>Expression block</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends ImperativeOperation, QVTOperational.Module {
	/**
	 * Returns the value of the '<em><b>Constructor header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor header</em>' containment reference.
	 * @see #setConstructor_header(ConstructorHeader)
	 * @see QVTOperational.QVTOperationalPackage#getConstructor_Constructor_header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstructorHeader getConstructor_header();

	/**
	 * Sets the value of the '{@link QVTOperational.Constructor#getConstructor_header <em>Constructor header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor header</em>' containment reference.
	 * @see #getConstructor_header()
	 * @generated
	 */
	void setConstructor_header(ConstructorHeader value);

	/**
	 * Returns the value of the '<em><b>Expression block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression block</em>' containment reference.
	 * @see #setExpression_block(ExpressionBlock)
	 * @see QVTOperational.QVTOperationalPackage#getConstructor_Expression_block()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionBlock getExpression_block();

	/**
	 * Sets the value of the '{@link QVTOperational.Constructor#getExpression_block <em>Expression block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression block</em>' containment reference.
	 * @see #getExpression_block()
	 * @generated
	 */
	void setExpression_block(ExpressionBlock value);

} // Constructor
