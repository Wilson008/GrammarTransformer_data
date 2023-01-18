/**
 */
package qvtoperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Feature List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ClassifierFeatureList#getClassifier_feature <em>Classifier feature</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getClassifierFeatureList()
 * @model
 * @generated
 */
public interface ClassifierFeatureList extends EObject {
	/**
	 * Returns the value of the '<em><b>Classifier feature</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ClassifierFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier feature</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getClassifierFeatureList_Classifier_feature()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassifierFeature> getClassifier_feature();

} // ClassifierFeatureList
