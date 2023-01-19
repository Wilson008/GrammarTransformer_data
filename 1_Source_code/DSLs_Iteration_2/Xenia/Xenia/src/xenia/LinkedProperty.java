/**
 */
package xenia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xenia.LinkedProperty#getName <em>Name</em>}</li>
 *   <li>{@link xenia.LinkedProperty#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see xenia.XeniaPackage#getLinkedProperty()
 * @model
 * @generated
 */
public interface LinkedProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Site)
	 * @see xenia.XeniaPackage#getLinkedProperty_Name()
	 * @model
	 * @generated
	 */
	Site getName();

	/**
	 * Sets the value of the '{@link xenia.LinkedProperty#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Site value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference.
	 * @see #setPage(RedirectPage)
	 * @see xenia.XeniaPackage#getLinkedProperty_Page()
	 * @model containment="true"
	 * @generated
	 */
	RedirectPage getPage();

	/**
	 * Sets the value of the '{@link xenia.LinkedProperty#getPage <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' containment reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(RedirectPage value);

} // LinkedProperty
