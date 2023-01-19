/**
 */
package ATLnoOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.LibraryRef#getUnit <em>Unit</em>}</li>
 *   <li>{@link ATLnoOCL.LibraryRef#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getLibraryRef()
 * @model
 * @generated
 */
public interface LibraryRef extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.Unit#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' container reference.
	 * @see #setUnit(Unit)
	 * @see ATLnoOCL.ATLnoOCLPackage#getLibraryRef_Unit()
	 * @see ATLnoOCL.Unit#getLibraries
	 * @model opposite="libraries" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link ATLnoOCL.LibraryRef#getUnit <em>Unit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' container reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ATLnoOCL.ATLnoOCLPackage#getLibraryRef_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ATLnoOCL.LibraryRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LibraryRef
