/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.Declarator#getTypespec <em>Typespec</em>}</li>
 *   <li>{@link QVTOperational.Declarator#getInit_part <em>Init part</em>}</li>
 *   <li>{@link QVTOperational.Declarator#getScoped_identifier <em>Scoped identifier</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getDeclarator()
 * @model
 * @generated
 */
public interface Declarator extends EObject {
	/**
	 * Returns the value of the '<em><b>Typespec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typespec</em>' containment reference.
	 * @see #setTypespec(TypeSpec)
	 * @see QVTOperational.QVTOperationalPackage#getDeclarator_Typespec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeSpec getTypespec();

	/**
	 * Sets the value of the '{@link QVTOperational.Declarator#getTypespec <em>Typespec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typespec</em>' containment reference.
	 * @see #getTypespec()
	 * @generated
	 */
	void setTypespec(TypeSpec value);

	/**
	 * Returns the value of the '<em><b>Init part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init part</em>' containment reference.
	 * @see #setInit_part(InitPart)
	 * @see QVTOperational.QVTOperationalPackage#getDeclarator_Init_part()
	 * @model containment="true"
	 * @generated
	 */
	InitPart getInit_part();

	/**
	 * Sets the value of the '{@link QVTOperational.Declarator#getInit_part <em>Init part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init part</em>' containment reference.
	 * @see #getInit_part()
	 * @generated
	 */
	void setInit_part(InitPart value);

	/**
	 * Returns the value of the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #setScoped_identifier(ScopedIdentifier)
	 * @see QVTOperational.QVTOperationalPackage#getDeclarator_Scoped_identifier()
	 * @model containment="true"
	 * @generated
	 */
	ScopedIdentifier getScoped_identifier();

	/**
	 * Sets the value of the '{@link QVTOperational.Declarator#getScoped_identifier <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #getScoped_identifier()
	 * @generated
	 */
	void setScoped_identifier(ScopedIdentifier value);

} // Declarator
