/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ClassifierHeader#getClassifier_info <em>Classifier info</em>}</li>
 *   <li>{@link QVTOperational.ClassifierHeader#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link QVTOperational.ClassifierHeader#getClassifier_extension <em>Classifier extension</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getClassifierHeader()
 * @model
 * @generated
 */
public interface ClassifierHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Classifier info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier info</em>' containment reference.
	 * @see #setClassifier_info(ClassifierInfo)
	 * @see QVTOperational.QVTOperationalPackage#getClassifierHeader_Classifier_info()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassifierInfo getClassifier_info();

	/**
	 * Sets the value of the '{@link QVTOperational.ClassifierHeader#getClassifier_info <em>Classifier info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier info</em>' containment reference.
	 * @see #getClassifier_info()
	 * @generated
	 */
	void setClassifier_info(ClassifierInfo value);

	/**
	 * Returns the value of the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #setScoped_identifier(ScopedIdentifier)
	 * @see QVTOperational.QVTOperationalPackage#getClassifierHeader_Scoped_identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScopedIdentifier getScoped_identifier();

	/**
	 * Sets the value of the '{@link QVTOperational.ClassifierHeader#getScoped_identifier <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #getScoped_identifier()
	 * @generated
	 */
	void setScoped_identifier(ScopedIdentifier value);

	/**
	 * Returns the value of the '<em><b>Classifier extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier extension</em>' containment reference.
	 * @see #setClassifier_extension(ClassifierExtension)
	 * @see QVTOperational.QVTOperationalPackage#getClassifierHeader_Classifier_extension()
	 * @model containment="true"
	 * @generated
	 */
	ClassifierExtension getClassifier_extension();

	/**
	 * Sets the value of the '{@link QVTOperational.ClassifierHeader#getClassifier_extension <em>Classifier extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier extension</em>' containment reference.
	 * @see #getClassifier_extension()
	 * @generated
	 */
	void setClassifier_extension(ClassifierExtension value);

} // ClassifierHeader
