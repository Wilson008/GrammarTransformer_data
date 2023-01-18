/**
 */
package qvtoperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.HelperHeader#getHelper_info <em>Helper info</em>}</li>
 *   <li>{@link qvtoperational.HelperHeader#getScope_identifier <em>Scope identifier</em>}</li>
 *   <li>{@link qvtoperational.HelperHeader#getComplete_signature <em>Complete signature</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getHelperHeader()
 * @model
 * @generated
 */
public interface HelperHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Helper info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper info</em>' containment reference.
	 * @see #setHelper_info(HelperInfo)
	 * @see qvtoperational.QvtoperationalPackage#getHelperHeader_Helper_info()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HelperInfo getHelper_info();

	/**
	 * Sets the value of the '{@link qvtoperational.HelperHeader#getHelper_info <em>Helper info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helper info</em>' containment reference.
	 * @see #getHelper_info()
	 * @generated
	 */
	void setHelper_info(HelperInfo value);

	/**
	 * Returns the value of the '<em><b>Scope identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope identifier</em>' containment reference.
	 * @see #setScope_identifier(ScopedIdentifier)
	 * @see qvtoperational.QvtoperationalPackage#getHelperHeader_Scope_identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScopedIdentifier getScope_identifier();

	/**
	 * Sets the value of the '{@link qvtoperational.HelperHeader#getScope_identifier <em>Scope identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope identifier</em>' containment reference.
	 * @see #getScope_identifier()
	 * @generated
	 */
	void setScope_identifier(ScopedIdentifier value);

	/**
	 * Returns the value of the '<em><b>Complete signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete signature</em>' containment reference.
	 * @see #setComplete_signature(CompleteSignature)
	 * @see qvtoperational.QvtoperationalPackage#getHelperHeader_Complete_signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompleteSignature getComplete_signature();

	/**
	 * Sets the value of the '{@link qvtoperational.HelperHeader#getComplete_signature <em>Complete signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete signature</em>' containment reference.
	 * @see #getComplete_signature()
	 * @generated
	 */
	void setComplete_signature(CompleteSignature value);

} // HelperHeader
