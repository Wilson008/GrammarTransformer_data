/**
 */
package qvtoperational;

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
 *   <li>{@link qvtoperational.FeatureQualifier#getStereotype_qualifier <em>Stereotype qualifier</em>}</li>
 *   <li>{@link qvtoperational.FeatureQualifier#getFeature_key <em>Feature key</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getFeatureQualifier()
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
	 * @see qvtoperational.QvtoperationalPackage#getFeatureQualifier_Stereotype_qualifier()
	 * @model containment="true"
	 * @generated
	 */
	StereotypeQualifier getStereotype_qualifier();

	/**
	 * Sets the value of the '{@link qvtoperational.FeatureQualifier#getStereotype_qualifier <em>Stereotype qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype qualifier</em>' containment reference.
	 * @see #getStereotype_qualifier()
	 * @generated
	 */
	void setStereotype_qualifier(StereotypeQualifier value);

	/**
	 * Returns the value of the '<em><b>Feature key</b></em>' attribute list.
	 * The list contents are of type {@link qvtoperational.FeatureKey}.
	 * The literals are from the enumeration {@link qvtoperational.FeatureKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature key</em>' attribute list.
	 * @see qvtoperational.FeatureKey
	 * @see qvtoperational.QvtoperationalPackage#getFeatureQualifier_Feature_key()
	 * @model
	 * @generated
	 */
	EList<FeatureKey> getFeature_key();

} // FeatureQualifier
