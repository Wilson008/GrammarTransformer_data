/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.Var#getKind <em>Kind</em>}</li>
 *   <li>{@link spectra.Var#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getVar()
 * @model
 * @generated
 */
public interface Var extends Decl {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link spectra.VarOwner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see spectra.VarOwner
	 * @see #setKind(VarOwner)
	 * @see spectra.SpectraPackage#getVar_Kind()
	 * @model
	 * @generated
	 */
	VarOwner getKind();

	/**
	 * Sets the value of the '{@link spectra.Var#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see spectra.VarOwner
	 * @see #getKind()
	 * @generated
	 */
	void setKind(VarOwner value);

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference.
	 * @see #setVar(VarDecl)
	 * @see spectra.SpectraPackage#getVar_Var()
	 * @model containment="true"
	 * @generated
	 */
	VarDecl getVar();

	/**
	 * Sets the value of the '{@link spectra.Var#getVar <em>Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' containment reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(VarDecl value);

} // Var
