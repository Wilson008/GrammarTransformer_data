/**
 */
package xenia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xenia.Header#getAppName <em>App Name</em>}</li>
 *   <li>{@link xenia.Header#getSites <em>Sites</em>}</li>
 * </ul>
 *
 * @see xenia.XeniaPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {
	/**
	 * Returns the value of the '<em><b>App Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Name</em>' attribute.
	 * @see #setAppName(String)
	 * @see xenia.XeniaPackage#getHeader_AppName()
	 * @model
	 * @generated
	 */
	String getAppName();

	/**
	 * Sets the value of the '{@link xenia.Header#getAppName <em>App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Name</em>' attribute.
	 * @see #getAppName()
	 * @generated
	 */
	void setAppName(String value);

	/**
	 * Returns the value of the '<em><b>Sites</b></em>' containment reference list.
	 * The list contents are of type {@link xenia.SuperSite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sites</em>' containment reference list.
	 * @see xenia.XeniaPackage#getHeader_Sites()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperSite> getSites();

} // Header
