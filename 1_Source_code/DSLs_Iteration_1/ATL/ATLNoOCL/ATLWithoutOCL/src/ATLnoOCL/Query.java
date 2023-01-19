/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.Query#getBody <em>Body</em>}</li>
 *   <li>{@link ATLnoOCL.Query#getHelpers <em>Helpers</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends Unit {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getQuery_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLDummy getBody();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Query#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Helpers</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.Helper}.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.Helper#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helpers</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getQuery_Helpers()
	 * @see ATLnoOCL.Helper#getQuery
	 * @model opposite="query" containment="true"
	 * @generated
	 */
	EList<Helper> getHelpers();

} // Query
