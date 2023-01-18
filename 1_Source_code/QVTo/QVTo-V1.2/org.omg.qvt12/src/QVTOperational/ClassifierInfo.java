/**
 */
package QVTOperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ClassifierInfo#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getClassifierInfo()
 * @model
 * @generated
 */
public interface ClassifierInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link QVTOperational.GeneralQualifier}.
	 * The literals are from the enumeration {@link QVTOperational.GeneralQualifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute list.
	 * @see QVTOperational.GeneralQualifier
	 * @see QVTOperational.QVTOperationalPackage#getClassifierInfo_Qualifier()
	 * @model
	 * @generated
	 */
	EList<GeneralQualifier> getQualifier();

} // ClassifierInfo
