/**
 */
package xenia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redirect Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xenia.RedirectPage#getSite <em>Site</em>}</li>
 * </ul>
 *
 * @see xenia.XeniaPackage#getRedirectPage()
 * @model
 * @generated
 */
public interface RedirectPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Site</b></em>' reference list.
	 * The list contents are of type {@link xenia.Site}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' reference list.
	 * @see xenia.XeniaPackage#getRedirectPage_Site()
	 * @model
	 * @generated
	 */
	EList<Site> getSite();

} // RedirectPage
