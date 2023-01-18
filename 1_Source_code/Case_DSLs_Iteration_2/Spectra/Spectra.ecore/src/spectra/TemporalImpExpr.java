/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Imp Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.TemporalImpExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link spectra.TemporalImpExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link spectra.TemporalImpExpr#getImplication <em>Implication</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getTemporalImpExpr()
 * @model
 * @generated
 */
public interface TemporalImpExpr extends TemporalExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(TemporalExpression)
	 * @see spectra.SpectraPackage#getTemporalImpExpr_Left()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getLeft();

	/**
	 * Sets the value of the '{@link spectra.TemporalImpExpr#getLeft <em>Left</em>}' containment reference.
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
	 * @see spectra.SpectraPackage#getTemporalImpExpr_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link spectra.TemporalImpExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Implication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implication</em>' containment reference.
	 * @see #setImplication(TemporalExpression)
	 * @see spectra.SpectraPackage#getTemporalImpExpr_Implication()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getImplication();

	/**
	 * Sets the value of the '{@link spectra.TemporalImpExpr#getImplication <em>Implication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implication</em>' containment reference.
	 * @see #getImplication()
	 * @generated
	 */
	void setImplication(TemporalExpression value);

} // TemporalImpExpr
