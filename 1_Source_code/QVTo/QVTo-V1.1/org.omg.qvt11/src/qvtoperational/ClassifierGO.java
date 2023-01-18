/**
 */
package qvtoperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier GO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ClassifierGO#getClassifier_h <em>Classifier h</em>}</li>
 *   <li>{@link qvtoperational.ClassifierGO#getClassifier_feature_list <em>Classifier feature list</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getClassifierGO()
 * @model
 * @generated
 */
public interface ClassifierGO extends ImperativeOperation, qvtoperational.Module {
	/**
	 * Returns the value of the '<em><b>Classifier h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier h</em>' containment reference.
	 * @see #setClassifier_h(ClassifierHeader)
	 * @see qvtoperational.QvtoperationalPackage#getClassifierGO_Classifier_h()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassifierHeader getClassifier_h();

	/**
	 * Sets the value of the '{@link qvtoperational.ClassifierGO#getClassifier_h <em>Classifier h</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier h</em>' containment reference.
	 * @see #getClassifier_h()
	 * @generated
	 */
	void setClassifier_h(ClassifierHeader value);

	/**
	 * Returns the value of the '<em><b>Classifier feature list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier feature list</em>' containment reference.
	 * @see #setClassifier_feature_list(ClassifierFeatureList)
	 * @see qvtoperational.QvtoperationalPackage#getClassifierGO_Classifier_feature_list()
	 * @model containment="true"
	 * @generated
	 */
	ClassifierFeatureList getClassifier_feature_list();

	/**
	 * Sets the value of the '{@link qvtoperational.ClassifierGO#getClassifier_feature_list <em>Classifier feature list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier feature list</em>' containment reference.
	 * @see #getClassifier_feature_list()
	 * @generated
	 */
	void setClassifier_feature_list(ClassifierFeatureList value);

} // ClassifierGO
