/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Usage GO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ModuleUsageGO#getAccess_usage <em>Access usage</em>}</li>
 *   <li>{@link QVTOperational.ModuleUsageGO#getExtends_usage <em>Extends usage</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getModuleUsageGO()
 * @model
 * @generated
 */
public interface ModuleUsageGO extends EObject {
	/**
	 * Returns the value of the '<em><b>Access usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access usage</em>' containment reference.
	 * @see #setAccess_usage(AccessUsage)
	 * @see QVTOperational.QVTOperationalPackage#getModuleUsageGO_Access_usage()
	 * @model containment="true"
	 * @generated
	 */
	AccessUsage getAccess_usage();

	/**
	 * Sets the value of the '{@link QVTOperational.ModuleUsageGO#getAccess_usage <em>Access usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access usage</em>' containment reference.
	 * @see #getAccess_usage()
	 * @generated
	 */
	void setAccess_usage(AccessUsage value);

	/**
	 * Returns the value of the '<em><b>Extends usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends usage</em>' containment reference.
	 * @see #setExtends_usage(ExtendsUsage)
	 * @see QVTOperational.QVTOperationalPackage#getModuleUsageGO_Extends_usage()
	 * @model containment="true"
	 * @generated
	 */
	ExtendsUsage getExtends_usage();

	/**
	 * Sets the value of the '{@link QVTOperational.ModuleUsageGO#getExtends_usage <em>Extends usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends usage</em>' containment reference.
	 * @see #getExtends_usage()
	 * @generated
	 */
	void setExtends_usage(ExtendsUsage value);

} // ModuleUsageGO
