/**
 */
package qvtoperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Model Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.MetaModelHeader#getScoped_identifier <em>Scoped identifier</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getMetaModelHeader()
 * @model
 * @generated
 */
public interface MetaModelHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #setScoped_identifier(ScopedIdentifier)
	 * @see qvtoperational.QvtoperationalPackage#getMetaModelHeader_Scoped_identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScopedIdentifier getScoped_identifier();

	/**
	 * Sets the value of the '{@link qvtoperational.MetaModelHeader#getScoped_identifier <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #getScoped_identifier()
	 * @generated
	 */
	void setScoped_identifier(ScopedIdentifier value);

} // MetaModelHeader
