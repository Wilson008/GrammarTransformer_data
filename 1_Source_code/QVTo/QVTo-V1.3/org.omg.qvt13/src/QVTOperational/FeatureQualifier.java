/**
 */
package QVTOperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.FeatureQualifier#getStereotype_qualifier <em>Stereotype qualifier</em>}</li>
 *   <li>{@link QVTOperational.FeatureQualifier#getFeature_key <em>Feature key</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getFeatureQualifier()
 * @model
 * @generated
 */
public interface FeatureQualifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Stereotype qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype qualifier</em>' containment reference.
	 * @see #setStereotype_qualifier(StereotypeQualifier)
	 * @see QVTOperational.QVTOperationalPackage#getFeatureQualifier_Stereotype_qualifier()
	 * @model containment="true"
	 * @generated
	 */
	StereotypeQualifier getStereotype_qualifier();

	/**
	 * Sets the value of the '{@link QVTOperational.FeatureQualifier#getStereotype_qualifier <em>Stereotype qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype qualifier</em>' containment reference.
	 * @see #getStereotype_qualifier()
	 * @generated
	 */
	void setStereotype_qualifier(StereotypeQualifier value);

	/**
	 * Returns the value of the '<em><b>Feature key</b></em>' attribute list.
	 * The list contents are of type {@link QVTOperational.FeatureKey}.
	 * The literals are from the enumeration {@link QVTOperational.FeatureKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature key</em>' attribute list.
	 * @see QVTOperational.FeatureKey
	 * @see QVTOperational.QVTOperationalPackage#getFeatureQualifier_Feature_key()
	 * @model
	 * @generated
	 */
	EList<FeatureKey> getFeature_key();

} // FeatureQualifier
