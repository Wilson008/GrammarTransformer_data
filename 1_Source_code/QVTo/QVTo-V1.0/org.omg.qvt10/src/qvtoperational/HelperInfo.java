/**
 */
package qvtoperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.HelperInfo#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link qvtoperational.HelperInfo#getHelper_kind <em>Helper kind</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getHelperInfo()
 * @model
 * @generated
 */
public interface HelperInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link qvtoperational.GeneralQualifier}.
	 * The literals are from the enumeration {@link qvtoperational.GeneralQualifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute list.
	 * @see qvtoperational.GeneralQualifier
	 * @see qvtoperational.QvtoperationalPackage#getHelperInfo_Qualifier()
	 * @model
	 * @generated
	 */
	EList<GeneralQualifier> getQualifier();

	/**
	 * Returns the value of the '<em><b>Helper kind</b></em>' attribute.
	 * The literals are from the enumeration {@link qvtoperational.HelperKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper kind</em>' attribute.
	 * @see qvtoperational.HelperKind
	 * @see #setHelper_kind(HelperKind)
	 * @see qvtoperational.QvtoperationalPackage#getHelperInfo_Helper_kind()
	 * @model
	 * @generated
	 */
	HelperKind getHelper_kind();

	/**
	 * Sets the value of the '{@link qvtoperational.HelperInfo#getHelper_kind <em>Helper kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helper kind</em>' attribute.
	 * @see qvtoperational.HelperKind
	 * @see #getHelper_kind()
	 * @generated
	 */
	void setHelper_kind(HelperKind value);

} // HelperInfo
