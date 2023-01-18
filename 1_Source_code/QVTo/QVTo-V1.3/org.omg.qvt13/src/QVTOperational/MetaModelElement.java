/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.MetaModelElement#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link QVTOperational.MetaModelElement#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link QVTOperational.MetaModelElement#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getMetaModelElement()
 * @model
 * @generated
 */
public interface MetaModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference.
	 * @see #setClassifier(ClassifierGO)
	 * @see QVTOperational.QVTOperationalPackage#getMetaModelElement_Classifier()
	 * @model containment="true"
	 * @generated
	 */
	ClassifierGO getClassifier();

	/**
	 * Sets the value of the '{@link QVTOperational.MetaModelElement#getClassifier <em>Classifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' containment reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(ClassifierGO value);

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference.
	 * @see #setEnumeration(EnumerationGO)
	 * @see QVTOperational.QVTOperationalPackage#getMetaModelElement_Enumeration()
	 * @model containment="true"
	 * @generated
	 */
	EnumerationGO getEnumeration();

	/**
	 * Sets the value of the '{@link QVTOperational.MetaModelElement#getEnumeration <em>Enumeration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' containment reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(EnumerationGO value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference.
	 * @see #setTag(TagGO)
	 * @see QVTOperational.QVTOperationalPackage#getMetaModelElement_Tag()
	 * @model containment="true"
	 * @generated
	 */
	TagGO getTag();

	/**
	 * Sets the value of the '{@link QVTOperational.MetaModelElement#getTag <em>Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' containment reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(TagGO value);

} // MetaModelElement
