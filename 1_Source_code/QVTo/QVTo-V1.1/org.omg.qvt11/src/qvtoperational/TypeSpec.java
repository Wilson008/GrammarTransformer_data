/**
 */
package qvtoperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.TypeSpec#getType_reference <em>Type reference</em>}</li>
 *   <li>{@link qvtoperational.TypeSpec#getExtent_location <em>Extent location</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getTypeSpec()
 * @model
 * @generated
 */
public interface TypeSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Type reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type reference</em>' containment reference.
	 * @see #setType_reference(TypeReference)
	 * @see qvtoperational.QvtoperationalPackage#getTypeSpec_Type_reference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeReference getType_reference();

	/**
	 * Sets the value of the '{@link qvtoperational.TypeSpec#getType_reference <em>Type reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type reference</em>' containment reference.
	 * @see #getType_reference()
	 * @generated
	 */
	void setType_reference(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Extent location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent location</em>' attribute.
	 * @see #setExtent_location(String)
	 * @see qvtoperational.QvtoperationalPackage#getTypeSpec_Extent_location()
	 * @model
	 * @generated
	 */
	String getExtent_location();

	/**
	 * Sets the value of the '{@link qvtoperational.TypeSpec#getExtent_location <em>Extent location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent location</em>' attribute.
	 * @see #getExtent_location()
	 * @generated
	 */
	void setExtent_location(String value);

} // TypeSpec
