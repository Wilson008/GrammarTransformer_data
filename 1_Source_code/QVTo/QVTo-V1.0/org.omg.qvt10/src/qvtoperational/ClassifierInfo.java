/**
 */
package qvtoperational;

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
 *   <li>{@link qvtoperational.ClassifierInfo#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getClassifierInfo()
 * @model
 * @generated
 */
public interface ClassifierInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link qvtoperational.GeneralQualifier}.
	 * The literals are from the enumeration {@link qvtoperational.GeneralQualifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute list.
	 * @see qvtoperational.GeneralQualifier
	 * @see qvtoperational.QvtoperationalPackage#getClassifierInfo_Qualifier()
	 * @model
	 * @generated
	 */
	EList<GeneralQualifier> getQualifier();

} // ClassifierInfo
