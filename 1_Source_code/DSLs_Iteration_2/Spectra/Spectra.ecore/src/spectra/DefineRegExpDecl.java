/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define Reg Exp Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.DefineRegExpDecl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getDefineRegExpDecl()
 * @model
 * @generated
 */
public interface DefineRegExpDecl extends Referrable {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(RegExp)
	 * @see spectra.SpectraPackage#getDefineRegExpDecl_Exp()
	 * @model containment="true"
	 * @generated
	 */
	RegExp getExp();

	/**
	 * Sets the value of the '{@link spectra.DefineRegExpDecl#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(RegExp value);

} // DefineRegExpDecl
