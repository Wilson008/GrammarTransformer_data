/**
 */
package qvtoperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ConstructorHeader#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link qvtoperational.ConstructorHeader#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link qvtoperational.ConstructorHeader#getSimple_signature <em>Simple signature</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getConstructorHeader()
 * @model
 * @generated
 */
public interface ConstructorHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link qvtoperational.GeneralQualifier}.
	 * The literals are from the enumeration {@link qvtoperational.GeneralQualifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute list.
	 * @see qvtoperational.GeneralQualifier
	 * @see qvtoperational.QvtoperationalPackage#getConstructorHeader_Qualifier()
	 * @model
	 * @generated
	 */
	EList<GeneralQualifier> getQualifier();

	/**
	 * Returns the value of the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #setScoped_identifier(ScopedIdentifier)
	 * @see qvtoperational.QvtoperationalPackage#getConstructorHeader_Scoped_identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScopedIdentifier getScoped_identifier();

	/**
	 * Sets the value of the '{@link qvtoperational.ConstructorHeader#getScoped_identifier <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #getScoped_identifier()
	 * @generated
	 */
	void setScoped_identifier(ScopedIdentifier value);

	/**
	 * Returns the value of the '<em><b>Simple signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple signature</em>' containment reference.
	 * @see #setSimple_signature(SimpleSignature)
	 * @see qvtoperational.QvtoperationalPackage#getConstructorHeader_Simple_signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleSignature getSimple_signature();

	/**
	 * Sets the value of the '{@link qvtoperational.ConstructorHeader#getSimple_signature <em>Simple signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple signature</em>' containment reference.
	 * @see #getSimple_signature()
	 * @generated
	 */
	void setSimple_signature(SimpleSignature value);

} // ConstructorHeader
