/**
 */
package spectra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.Import#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see spectra.SpectraPackage#getImport_ImportURI()
	 * @model
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link spectra.Import#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

} // Import