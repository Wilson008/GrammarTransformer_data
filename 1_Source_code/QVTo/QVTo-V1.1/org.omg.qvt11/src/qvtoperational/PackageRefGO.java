/**
 */
package qvtoperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Ref GO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.PackageRefGO#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link qvtoperational.PackageRefGO#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getPackageRefGO()
 * @model
 * @generated
 */
public interface PackageRefGO extends EObject {
	/**
	 * Returns the value of the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #setScoped_identifier(ScopedIdentifier)
	 * @see qvtoperational.QvtoperationalPackage#getPackageRefGO_Scoped_identifier()
	 * @model containment="true"
	 * @generated
	 */
	ScopedIdentifier getScoped_identifier();

	/**
	 * Sets the value of the '{@link qvtoperational.PackageRefGO#getScoped_identifier <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #getScoped_identifier()
	 * @generated
	 */
	void setScoped_identifier(ScopedIdentifier value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see qvtoperational.QvtoperationalPackage#getPackageRefGO_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link qvtoperational.PackageRefGO#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // PackageRefGO
