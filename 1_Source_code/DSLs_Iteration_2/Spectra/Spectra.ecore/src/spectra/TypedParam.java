/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.TypedParam#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getTypedParam()
 * @model
 * @generated
 */
public interface TypedParam extends Referrable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(VarType)
	 * @see spectra.SpectraPackage#getTypedParam_Type()
	 * @model containment="true"
	 * @generated
	 */
	VarType getType();

	/**
	 * Sets the value of the '{@link spectra.TypedParam#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(VarType value);

} // TypedParam
