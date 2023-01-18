/**
 */
package qvtoperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration GO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.EnumerationGO#getEnumeration_h <em>Enumeration h</em>}</li>
 *   <li>{@link qvtoperational.EnumerationGO#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getEnumerationGO()
 * @model
 * @generated
 */
public interface EnumerationGO extends EObject {
	/**
	 * Returns the value of the '<em><b>Enumeration h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration h</em>' containment reference.
	 * @see #setEnumeration_h(EnumerationHeader)
	 * @see qvtoperational.QvtoperationalPackage#getEnumerationGO_Enumeration_h()
	 * @model containment="true"
	 * @generated
	 */
	EnumerationHeader getEnumeration_h();

	/**
	 * Sets the value of the '{@link qvtoperational.EnumerationGO#getEnumeration_h <em>Enumeration h</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration h</em>' containment reference.
	 * @see #getEnumeration_h()
	 * @generated
	 */
	void setEnumeration_h(EnumerationHeader value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute list.
	 * @see qvtoperational.QvtoperationalPackage#getEnumerationGO_Identifier()
	 * @model
	 * @generated
	 */
	EList<String> getIdentifier();

} // EnumerationGO
