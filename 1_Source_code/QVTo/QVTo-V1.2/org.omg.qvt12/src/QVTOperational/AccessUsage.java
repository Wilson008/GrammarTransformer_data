/**
 */
package QVTOperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.AccessUsage#getModule_kind <em>Module kind</em>}</li>
 *   <li>{@link QVTOperational.AccessUsage#getModuleref_list <em>Moduleref list</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getAccessUsage()
 * @model
 * @generated
 */
public interface AccessUsage extends EObject {
	/**
	 * Returns the value of the '<em><b>Module kind</b></em>' attribute.
	 * The literals are from the enumeration {@link QVTOperational.ModuleKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module kind</em>' attribute.
	 * @see QVTOperational.ModuleKind
	 * @see #setModule_kind(ModuleKind)
	 * @see QVTOperational.QVTOperationalPackage#getAccessUsage_Module_kind()
	 * @model
	 * @generated
	 */
	ModuleKind getModule_kind();

	/**
	 * Sets the value of the '{@link QVTOperational.AccessUsage#getModule_kind <em>Module kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module kind</em>' attribute.
	 * @see QVTOperational.ModuleKind
	 * @see #getModule_kind()
	 * @generated
	 */
	void setModule_kind(ModuleKind value);

	/**
	 * Returns the value of the '<em><b>Moduleref list</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ModuleRefGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moduleref list</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getAccessUsage_Moduleref_list()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleRefGO> getModuleref_list();

} // AccessUsage
