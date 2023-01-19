/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Relational Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.TemporalRelationalExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link spectra.TemporalRelationalExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link spectra.TemporalRelationalExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getTemporalRelationalExpr()
 * @model
 * @generated
 */
public interface TemporalRelationalExpr extends TemporalExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(TemporalExpression)
	 * @see spectra.SpectraPackage#getTemporalRelationalExpr_Left()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getLeft();

	/**
	 * Sets the value of the '{@link spectra.TemporalRelationalExpr#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(TemporalExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see spectra.SpectraPackage#getTemporalRelationalExpr_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link spectra.TemporalRelationalExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(TemporalExpression)
	 * @see spectra.SpectraPackage#getTemporalRelationalExpr_Right()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getRight();

	/**
	 * Sets the value of the '{@link spectra.TemporalRelationalExpr#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(TemporalExpression value);

} // TemporalRelationalExpr
