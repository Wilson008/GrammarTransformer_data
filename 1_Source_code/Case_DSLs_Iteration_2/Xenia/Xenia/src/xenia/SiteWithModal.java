/**
 */
package xenia;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site With Modal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xenia.SiteWithModal#getSites <em>Sites</em>}</li>
 * </ul>
 *
 * @see xenia.XeniaPackage#getSiteWithModal()
 * @model
 * @generated
 */
public interface SiteWithModal extends SuperSite {
	/**
	 * Returns the value of the '<em><b>Sites</b></em>' containment reference list.
	 * The list contents are of type {@link xenia.SuperSite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sites</em>' containment reference list.
	 * @see xenia.XeniaPackage#getSiteWithModal_Sites()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperSite> getSites();

} // SiteWithModal
