/**
 */
package QVTOperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level GO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.TopLevelGO#getUnit_element <em>Unit element</em>}</li>
 *   <li>{@link QVTOperational.TopLevelGO#getModuleimport <em>Moduleimport</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getTopLevelGO()
 * @model
 * @generated
 */
public interface TopLevelGO extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit element</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit element</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getTopLevelGO_Unit_element()
	 * @model containment="true"
	 * @generated
	 */
	EList<QVTOperational.Module> getUnit_element();

	/**
	 * Returns the value of the '<em><b>Moduleimport</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ModuleImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moduleimport</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getTopLevelGO_Moduleimport()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleImport> getModuleimport();

} // TopLevelGO
