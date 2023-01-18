/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.Monitor#getType <em>Type</em>}</li>
 *   <li>{@link spectra.Monitor#getInitial <em>Initial</em>}</li>
 *   <li>{@link spectra.Monitor#getSafety <em>Safety</em>}</li>
 *   <li>{@link spectra.Monitor#getStateInv <em>State Inv</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getMonitor()
 * @model
 * @generated
 */
public interface Monitor extends Decl, Referrable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(VarType)
	 * @see spectra.SpectraPackage#getMonitor_Type()
	 * @model containment="true"
	 * @generated
	 */
	VarType getType();

	/**
	 * Sets the value of the '{@link spectra.Monitor#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(VarType value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference list.
	 * @see spectra.SpectraPackage#getMonitor_Initial()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getInitial();

	/**
	 * Returns the value of the '<em><b>Safety</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety</em>' containment reference list.
	 * @see spectra.SpectraPackage#getMonitor_Safety()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getSafety();

	/**
	 * Returns the value of the '<em><b>State Inv</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Inv</em>' containment reference list.
	 * @see spectra.SpectraPackage#getMonitor_StateInv()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getStateInv();

} // Monitor
