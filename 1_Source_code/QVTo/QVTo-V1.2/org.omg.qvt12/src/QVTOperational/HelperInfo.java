/**
 */
package QVTOperational;

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
 *   <li>{@link QVTOperational.HelperInfo#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link QVTOperational.HelperInfo#getHelper_kind <em>Helper kind</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getHelperInfo()
 * @model
 * @generated
 */
public interface HelperInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link QVTOperational.GeneralQualifier}.
	 * The literals are from the enumeration {@link QVTOperational.GeneralQualifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute list.
	 * @see QVTOperational.GeneralQualifier
	 * @see QVTOperational.QVTOperationalPackage#getHelperInfo_Qualifier()
	 * @model
	 * @generated
	 */
	EList<GeneralQualifier> getQualifier();

	/**
	 * Returns the value of the '<em><b>Helper kind</b></em>' attribute.
	 * The literals are from the enumeration {@link QVTOperational.HelperKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper kind</em>' attribute.
	 * @see QVTOperational.HelperKind
	 * @see #setHelper_kind(HelperKind)
	 * @see QVTOperational.QVTOperationalPackage#getHelperInfo_Helper_kind()
	 * @model
	 * @generated
	 */
	HelperKind getHelper_kind();

	/**
	 * Sets the value of the '{@link QVTOperational.HelperInfo#getHelper_kind <em>Helper kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helper kind</em>' attribute.
	 * @see QVTOperational.HelperKind
	 * @see #getHelper_kind()
	 * @generated
	 */
	void setHelper_kind(HelperKind value);

} // HelperInfo
