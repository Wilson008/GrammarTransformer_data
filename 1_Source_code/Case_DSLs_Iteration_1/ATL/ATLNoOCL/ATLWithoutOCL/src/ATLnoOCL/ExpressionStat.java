/**
 */
package ATLnoOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.ExpressionStat#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getExpressionStat()
 * @model
 * @generated
 */
public interface ExpressionStat extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getExpressionStat_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLDummy getExpression();

	/**
	 * Sets the value of the '{@link ATLnoOCL.ExpressionStat#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(OCLDummy value);

} // ExpressionStat
