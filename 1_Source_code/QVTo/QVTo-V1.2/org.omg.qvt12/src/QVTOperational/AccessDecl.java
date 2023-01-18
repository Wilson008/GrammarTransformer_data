/**
 */
package QVTOperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.AccessDecl#getAccess_usage <em>Access usage</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getAccessDecl()
 * @model
 * @generated
 */
public interface AccessDecl extends QVTOperational.Module, ImperativeOperation {
	/**
	 * Returns the value of the '<em><b>Access usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access usage</em>' containment reference.
	 * @see #setAccess_usage(AccessUsage)
	 * @see QVTOperational.QVTOperationalPackage#getAccessDecl_Access_usage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AccessUsage getAccess_usage();

	/**
	 * Sets the value of the '{@link QVTOperational.AccessDecl#getAccess_usage <em>Access usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access usage</em>' containment reference.
	 * @see #getAccess_usage()
	 * @generated
	 */
	void setAccess_usage(AccessUsage value);

} // AccessDecl
