/**
 */
package QVTOperational;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.Library#getLibrary_h <em>Library h</em>}</li>
 *   <li>{@link QVTOperational.Library#getModule_element <em>Module element</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends QVTOperational.Module {
	/**
	 * Returns the value of the '<em><b>Library h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library h</em>' containment reference.
	 * @see #setLibrary_h(LibraryHeader)
	 * @see QVTOperational.QVTOperationalPackage#getLibrary_Library_h()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LibraryHeader getLibrary_h();

	/**
	 * Sets the value of the '{@link QVTOperational.Library#getLibrary_h <em>Library h</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library h</em>' containment reference.
	 * @see #getLibrary_h()
	 * @generated
	 */
	void setLibrary_h(LibraryHeader value);

	/**
	 * Returns the value of the '<em><b>Module element</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ImperativeOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module element</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getLibrary_Module_element()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImperativeOperation> getModule_element();

} // Library
