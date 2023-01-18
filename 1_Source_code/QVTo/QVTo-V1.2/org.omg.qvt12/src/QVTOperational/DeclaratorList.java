/**
 */
package QVTOperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarator List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.DeclaratorList#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getDeclaratorList()
 * @model
 * @generated
 */
public interface DeclaratorList extends EObject {
	/**
	 * Returns the value of the '<em><b>Declarator</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.Declarator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarator</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getDeclaratorList_Declarator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declarator> getDeclarator();

} // DeclaratorList
