/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Called Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.CalledRule#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ATLnoOCL.CalledRule#isIsEntrypoint <em>Is Entrypoint</em>}</li>
 *   <li>{@link ATLnoOCL.CalledRule#isIsEndpoint <em>Is Endpoint</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getCalledRule()
 * @model
 * @generated
 */
public interface CalledRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.OCLDummy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getCalledRule_Parameters()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OCLDummy> getParameters();

	/**
	 * Returns the value of the '<em><b>Is Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Entrypoint</em>' attribute.
	 * @see #setIsEntrypoint(boolean)
	 * @see ATLnoOCL.ATLnoOCLPackage#getCalledRule_IsEntrypoint()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsEntrypoint();

	/**
	 * Sets the value of the '{@link ATLnoOCL.CalledRule#isIsEntrypoint <em>Is Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entrypoint</em>' attribute.
	 * @see #isIsEntrypoint()
	 * @generated
	 */
	void setIsEntrypoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Endpoint</em>' attribute.
	 * @see #setIsEndpoint(boolean)
	 * @see ATLnoOCL.ATLnoOCLPackage#getCalledRule_IsEndpoint()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsEndpoint();

	/**
	 * Sets the value of the '{@link ATLnoOCL.CalledRule#isIsEndpoint <em>Is Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Endpoint</em>' attribute.
	 * @see #isIsEndpoint()
	 * @generated
	 */
	void setIsEndpoint(boolean value);

} // CalledRule
