/**
 */
package QVTOperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scoped Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ScopedIdentifier#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getScopedIdentifier()
 * @model
 * @generated
 */
public interface ScopedIdentifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute list.
	 * @see QVTOperational.QVTOperationalPackage#getScopedIdentifier_Identifier()
	 * @model
	 * @generated
	 */
	EList<String> getIdentifier();

} // ScopedIdentifier
