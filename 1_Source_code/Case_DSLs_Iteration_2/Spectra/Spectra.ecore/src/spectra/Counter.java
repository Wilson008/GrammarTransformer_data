/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.Counter#getRange <em>Range</em>}</li>
 *   <li>{@link spectra.Counter#getInitial <em>Initial</em>}</li>
 *   <li>{@link spectra.Counter#getResetPred <em>Reset Pred</em>}</li>
 *   <li>{@link spectra.Counter#getIncPred <em>Inc Pred</em>}</li>
 *   <li>{@link spectra.Counter#getDecPred <em>Dec Pred</em>}</li>
 *   <li>{@link spectra.Counter#getOverflowMethod <em>Overflow Method</em>}</li>
 *   <li>{@link spectra.Counter#getUnderflowMethod <em>Underflow Method</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getCounter()
 * @model
 * @generated
 */
public interface Counter extends Decl, Referrable {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Subrange)
	 * @see spectra.SpectraPackage#getCounter_Range()
	 * @model containment="true"
	 * @generated
	 */
	Subrange getRange();

	/**
	 * Sets the value of the '{@link spectra.Counter#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Subrange value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference list.
	 * @see spectra.SpectraPackage#getCounter_Initial()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getInitial();

	/**
	 * Returns the value of the '<em><b>Reset Pred</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Pred</em>' containment reference list.
	 * @see spectra.SpectraPackage#getCounter_ResetPred()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getResetPred();

	/**
	 * Returns the value of the '<em><b>Inc Pred</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inc Pred</em>' containment reference list.
	 * @see spectra.SpectraPackage#getCounter_IncPred()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getIncPred();

	/**
	 * Returns the value of the '<em><b>Dec Pred</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dec Pred</em>' containment reference list.
	 * @see spectra.SpectraPackage#getCounter_DecPred()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getDecPred();

	/**
	 * Returns the value of the '<em><b>Overflow Method</b></em>' attribute list.
	 * The list contents are of type {@link spectra.OverflowMethod}.
	 * The literals are from the enumeration {@link spectra.OverflowMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overflow Method</em>' attribute list.
	 * @see spectra.OverflowMethod
	 * @see spectra.SpectraPackage#getCounter_OverflowMethod()
	 * @model unique="false"
	 * @generated
	 */
	EList<OverflowMethod> getOverflowMethod();

	/**
	 * Returns the value of the '<em><b>Underflow Method</b></em>' attribute list.
	 * The list contents are of type {@link spectra.OverflowMethod}.
	 * The literals are from the enumeration {@link spectra.OverflowMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underflow Method</em>' attribute list.
	 * @see spectra.OverflowMethod
	 * @see spectra.SpectraPackage#getCounter_UnderflowMethod()
	 * @model unique="false"
	 * @generated
	 */
	EList<OverflowMethod> getUnderflowMethod();

} // Counter
