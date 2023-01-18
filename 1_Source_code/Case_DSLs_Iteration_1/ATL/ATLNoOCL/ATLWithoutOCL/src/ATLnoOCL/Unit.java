/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.Unit#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link ATLnoOCL.Unit#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getUnit()
 * @model abstract="true"
 * @generated
 */
public interface Unit extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.LibraryRef}.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.LibraryRef#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getUnit_Libraries()
	 * @see ATLnoOCL.LibraryRef#getUnit
	 * @model opposite="unit" containment="true" ordered="false"
	 * @generated
	 */
	EList<LibraryRef> getLibraries();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ATLnoOCL.ATLnoOCLPackage#getUnit_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Unit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Unit
