/**
 */
package QVTOperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.EntryOperation#getEntry_header <em>Entry header</em>}</li>
 *   <li>{@link QVTOperational.EntryOperation#getExpression_block <em>Expression block</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getEntryOperation()
 * @model
 * @generated
 */
public interface EntryOperation extends ImperativeOperation, QVTOperational.Module {
	/**
	 * Returns the value of the '<em><b>Entry header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry header</em>' containment reference.
	 * @see #setEntry_header(EntryHeader)
	 * @see QVTOperational.QVTOperationalPackage#getEntryOperation_Entry_header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntryHeader getEntry_header();

	/**
	 * Sets the value of the '{@link QVTOperational.EntryOperation#getEntry_header <em>Entry header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry header</em>' containment reference.
	 * @see #getEntry_header()
	 * @generated
	 */
	void setEntry_header(EntryHeader value);

	/**
	 * Returns the value of the '<em><b>Expression block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression block</em>' containment reference.
	 * @see #setExpression_block(ExpressionBlock)
	 * @see QVTOperational.QVTOperationalPackage#getEntryOperation_Expression_block()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionBlock getExpression_block();

	/**
	 * Sets the value of the '{@link QVTOperational.EntryOperation#getExpression_block <em>Expression block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression block</em>' containment reference.
	 * @see #getExpression_block()
	 * @generated
	 */
	void setExpression_block(ExpressionBlock value);

} // EntryOperation
