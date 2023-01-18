/**
 */
package qvtoperational;

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
 *   <li>{@link qvtoperational.MetaModelElement#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link qvtoperational.MetaModelElement#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link qvtoperational.MetaModelElement#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getMetaModelElement()
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
	 * @see qvtoperational.QvtoperationalPackage#getMetaModelElement_Classifier()
	 * @model containment="true"
	 * @generated
	 */
	ClassifierGO getClassifier();

	/**
	 * Sets the value of the '{@link qvtoperational.MetaModelElement#getClassifier <em>Classifier</em>}' containment reference.
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
	 * @see qvtoperational.QvtoperationalPackage#getMetaModelElement_Enumeration()
	 * @model containment="true"
	 * @generated
	 */
	EnumerationGO getEnumeration();

	/**
	 * Sets the value of the '{@link qvtoperational.MetaModelElement#getEnumeration <em>Enumeration</em>}' containment reference.
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
	 * @see qvtoperational.QvtoperationalPackage#getMetaModelElement_Tag()
	 * @model containment="true"
	 * @generated
	 */
	TagGO getTag();

	/**
	 * Sets the value of the '{@link qvtoperational.MetaModelElement#getTag <em>Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' containment reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(TagGO value);

} // MetaModelElement
