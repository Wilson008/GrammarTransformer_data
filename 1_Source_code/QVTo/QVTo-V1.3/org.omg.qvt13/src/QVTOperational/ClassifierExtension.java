/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ClassifierExtension#getScoped_identifier_list <em>Scoped identifier list</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getClassifierExtension()
 * @model
 * @generated
 */
public interface ClassifierExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>Scoped identifier list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier list</em>' containment reference.
	 * @see #setScoped_identifier_list(ScopedIdentifierList)
	 * @see QVTOperational.QVTOperationalPackage#getClassifierExtension_Scoped_identifier_list()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScopedIdentifierList getScoped_identifier_list();

	/**
	 * Sets the value of the '{@link QVTOperational.ClassifierExtension#getScoped_identifier_list <em>Scoped identifier list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped identifier list</em>' containment reference.
	 * @see #getScoped_identifier_list()
	 * @generated
	 */
	void setScoped_identifier_list(ScopedIdentifierList value);

} // ClassifierExtension
