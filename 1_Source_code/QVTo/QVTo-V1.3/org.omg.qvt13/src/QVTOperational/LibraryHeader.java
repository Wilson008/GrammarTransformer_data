/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.LibraryHeader#getName <em>Name</em>}</li>
 *   <li>{@link QVTOperational.LibraryHeader#getLibrary_signature <em>Library signature</em>}</li>
 *   <li>{@link QVTOperational.LibraryHeader#getModule_usage <em>Module usage</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getLibraryHeader()
 * @model
 * @generated
 */
public interface LibraryHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QVTOperational.QVTOperationalPackage#getLibraryHeader_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QVTOperational.LibraryHeader#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Library signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library signature</em>' containment reference.
	 * @see #setLibrary_signature(SimpleSignature)
	 * @see QVTOperational.QVTOperationalPackage#getLibraryHeader_Library_signature()
	 * @model containment="true"
	 * @generated
	 */
	SimpleSignature getLibrary_signature();

	/**
	 * Sets the value of the '{@link QVTOperational.LibraryHeader#getLibrary_signature <em>Library signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library signature</em>' containment reference.
	 * @see #getLibrary_signature()
	 * @generated
	 */
	void setLibrary_signature(SimpleSignature value);

	/**
	 * Returns the value of the '<em><b>Module usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module usage</em>' containment reference.
	 * @see #setModule_usage(ModuleUsageGO)
	 * @see QVTOperational.QVTOperationalPackage#getLibraryHeader_Module_usage()
	 * @model containment="true"
	 * @generated
	 */
	ModuleUsageGO getModule_usage();

	/**
	 * Sets the value of the '{@link QVTOperational.LibraryHeader#getModule_usage <em>Module usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module usage</em>' containment reference.
	 * @see #getModule_usage()
	 * @generated
	 */
	void setModule_usage(ModuleUsageGO value);

} // LibraryHeader
