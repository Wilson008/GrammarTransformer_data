/**
 */
package ATLnoOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.Helper#getQuery <em>Query</em>}</li>
 *   <li>{@link ATLnoOCL.Helper#getLibrary <em>Library</em>}</li>
 *   <li>{@link ATLnoOCL.Helper#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getHelper()
 * @model
 * @generated
 */
public interface Helper extends ModuleElement {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.Query#getHelpers <em>Helpers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' container reference.
	 * @see #setQuery(Query)
	 * @see ATLnoOCL.ATLnoOCLPackage#getHelper_Query()
	 * @see ATLnoOCL.Query#getHelpers
	 * @model opposite="helpers" transient="false" ordered="false"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Helper#getQuery <em>Query</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' container reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.Library#getHelpers <em>Helpers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(Library)
	 * @see ATLnoOCL.ATLnoOCLPackage#getHelper_Library()
	 * @see ATLnoOCL.Library#getHelpers
	 * @model opposite="helpers" transient="false" ordered="false"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Helper#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getHelper_Definition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLDummy getDefinition();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Helper#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(OCLDummy value);

} // Helper
