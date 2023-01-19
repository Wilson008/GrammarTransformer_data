/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.Library#getHelpers <em>Helpers</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends Unit {
	/**
	 * Returns the value of the '<em><b>Helpers</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.Helper}.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.Helper#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helpers</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getLibrary_Helpers()
	 * @see ATLnoOCL.Helper#getLibrary
	 * @model opposite="library" containment="true"
	 * @generated
	 */
	EList<Helper> getHelpers();

} // Library
