/**
 */
package qvtoperational;

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
 *   <li>{@link qvtoperational.TopLevelGO#getUnit_element <em>Unit element</em>}</li>
 *   <li>{@link qvtoperational.TopLevelGO#getModuleimport <em>Moduleimport</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getTopLevelGO()
 * @model
 * @generated
 */
public interface TopLevelGO extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit element</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit element</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getTopLevelGO_Unit_element()
	 * @model containment="true"
	 * @generated
	 */
	EList<qvtoperational.Module> getUnit_element();

	/**
	 * Returns the value of the '<em><b>Moduleimport</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ModuleImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moduleimport</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getTopLevelGO_Moduleimport()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleImport> getModuleimport();

} // TopLevelGO
