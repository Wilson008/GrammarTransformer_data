/**
 */
package spectra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.BooleanTerm#getRelExpr <em>Rel Expr</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getBooleanTerm()
 * @model
 * @generated
 */
public interface BooleanTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Rel Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Expr</em>' containment reference.
	 * @see #setRelExpr(TemporalExpression)
	 * @see spectra.SpectraPackage#getBooleanTerm_RelExpr()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getRelExpr();

	/**
	 * Sets the value of the '{@link spectra.BooleanTerm#getRelExpr <em>Rel Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Expr</em>' containment reference.
	 * @see #getRelExpr()
	 * @generated
	 */
	void setRelExpr(TemporalExpression value);

} // BooleanTerm
