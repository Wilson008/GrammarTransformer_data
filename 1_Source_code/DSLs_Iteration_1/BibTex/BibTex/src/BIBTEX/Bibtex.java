/**
 */
package BIBTEX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bibtex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BIBTEX.Bibtex#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see BIBTEX.BIBTEXPackage#getBibtex()
 * @model
 * @generated
 */
public interface Bibtex extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link BIBTEX.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see BIBTEX.BIBTEXPackage#getBibtex_Entries()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Entry> getEntries();

} // Bibtex
