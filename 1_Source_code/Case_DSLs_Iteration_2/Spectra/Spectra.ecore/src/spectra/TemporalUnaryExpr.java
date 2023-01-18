/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.TemporalUnaryExpr#getKinds <em>Kinds</em>}</li>
 *   <li>{@link spectra.TemporalUnaryExpr#getTue <em>Tue</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getTemporalUnaryExpr()
 * @model
 * @generated
 */
public interface TemporalUnaryExpr extends TemporalExpression {
	/**
	 * Returns the value of the '<em><b>Kinds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinds</em>' attribute.
	 * @see #setKinds(String)
	 * @see spectra.SpectraPackage#getTemporalUnaryExpr_Kinds()
	 * @model
	 * @generated
	 */
	String getKinds();

	/**
	 * Sets the value of the '{@link spectra.TemporalUnaryExpr#getKinds <em>Kinds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinds</em>' attribute.
	 * @see #getKinds()
	 * @generated
	 */
	void setKinds(String value);

	/**
	 * Returns the value of the '<em><b>Tue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tue</em>' containment reference.
	 * @see #setTue(TemporalExpression)
	 * @see spectra.SpectraPackage#getTemporalUnaryExpr_Tue()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getTue();

	/**
	 * Sets the value of the '{@link spectra.TemporalUnaryExpr#getTue <em>Tue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tue</em>' containment reference.
	 * @see #getTue()
	 * @generated
	 */
	void setTue(TemporalExpression value);

} // TemporalUnaryExpr
