/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.TypeReference#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link QVTOperational.TypeReference#getComplex_type <em>Complex type</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #setScoped_identifier(ScopedIdentifier)
	 * @see QVTOperational.QVTOperationalPackage#getTypeReference_Scoped_identifier()
	 * @model containment="true"
	 * @generated
	 */
	ScopedIdentifier getScoped_identifier();

	/**
	 * Sets the value of the '{@link QVTOperational.TypeReference#getScoped_identifier <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #getScoped_identifier()
	 * @generated
	 */
	void setScoped_identifier(ScopedIdentifier value);

	/**
	 * Returns the value of the '<em><b>Complex type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex type</em>' containment reference.
	 * @see #setComplex_type(ComplexType)
	 * @see QVTOperational.QVTOperationalPackage#getTypeReference_Complex_type()
	 * @model containment="true"
	 * @generated
	 */
	ComplexType getComplex_type();

	/**
	 * Sets the value of the '{@link QVTOperational.TypeReference#getComplex_type <em>Complex type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex type</em>' containment reference.
	 * @see #getComplex_type()
	 * @generated
	 */
	void setComplex_type(ComplexType value);

} // TypeReference
