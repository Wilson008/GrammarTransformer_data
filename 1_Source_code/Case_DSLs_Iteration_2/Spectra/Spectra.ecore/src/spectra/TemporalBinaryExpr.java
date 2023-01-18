/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Binary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.TemporalBinaryExpr#getElements <em>Elements</em>}</li>
 *   <li>{@link spectra.TemporalBinaryExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getTemporalBinaryExpr()
 * @model
 * @generated
 */
public interface TemporalBinaryExpr extends TemporalExpression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see spectra.SpectraPackage#getTemporalBinaryExpr_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getElements();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute list.
	 * @see spectra.SpectraPackage#getTemporalBinaryExpr_Operator()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getOperator();

} // TemporalBinaryExpr
