/**
 */
package QVTOperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scoped Identifier List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ScopedIdentifierList#getScoped_identifier_list <em>Scoped identifier list</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getScopedIdentifierList()
 * @model
 * @generated
 */
public interface ScopedIdentifierList extends EObject {
	/**
	 * Returns the value of the '<em><b>Scoped identifier list</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ScopedIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier list</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getScopedIdentifierList_Scoped_identifier_list()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScopedIdentifier> getScoped_identifier_list();

} // ScopedIdentifierList
