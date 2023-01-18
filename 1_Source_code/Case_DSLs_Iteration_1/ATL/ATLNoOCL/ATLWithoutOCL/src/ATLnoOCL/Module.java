/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.Module#isIsRefining <em>Is Refining</em>}</li>
 *   <li>{@link ATLnoOCL.Module#getInModels <em>In Models</em>}</li>
 *   <li>{@link ATLnoOCL.Module#getOutModels <em>Out Models</em>}</li>
 *   <li>{@link ATLnoOCL.Module#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends Unit {
	/**
	 * Returns the value of the '<em><b>Is Refining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Refining</em>' attribute.
	 * @see #setIsRefining(boolean)
	 * @see ATLnoOCL.ATLnoOCLPackage#getModule_IsRefining()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRefining();

	/**
	 * Sets the value of the '{@link ATLnoOCL.Module#isIsRefining <em>Is Refining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Refining</em>' attribute.
	 * @see #isIsRefining()
	 * @generated
	 */
	void setIsRefining(boolean value);

	/**
	 * Returns the value of the '<em><b>In Models</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.OCLDummy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Models</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getModule_InModels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OCLDummy> getInModels();

	/**
	 * Returns the value of the '<em><b>Out Models</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.OCLDummy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Models</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getModule_OutModels()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<OCLDummy> getOutModels();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.ModuleElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getModule_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleElement> getElements();

} // Module
