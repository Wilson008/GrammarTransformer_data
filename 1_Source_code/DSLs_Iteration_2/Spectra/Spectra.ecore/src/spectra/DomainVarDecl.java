/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.DomainVarDecl#getDomainType <em>Domain Type</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getDomainVarDecl()
 * @model
 * @generated
 */
public interface DomainVarDecl extends Referrable {
	/**
	 * Returns the value of the '<em><b>Domain Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Type</em>' containment reference.
	 * @see #setDomainType(VarType)
	 * @see spectra.SpectraPackage#getDomainVarDecl_DomainType()
	 * @model containment="true"
	 * @generated
	 */
	VarType getDomainType();

	/**
	 * Sets the value of the '{@link spectra.DomainVarDecl#getDomainType <em>Domain Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Type</em>' containment reference.
	 * @see #getDomainType()
	 * @generated
	 */
	void setDomainType(VarType value);

} // DomainVarDecl
