/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.SimpleSignature#getParam_list <em>Param list</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getSimpleSignature()
 * @model
 * @generated
 */
public interface SimpleSignature extends EObject {
	/**
	 * Returns the value of the '<em><b>Param list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param list</em>' containment reference.
	 * @see #setParam_list(ParamList)
	 * @see QVTOperational.QVTOperationalPackage#getSimpleSignature_Param_list()
	 * @model containment="true"
	 * @generated
	 */
	ParamList getParam_list();

	/**
	 * Sets the value of the '{@link QVTOperational.SimpleSignature#getParam_list <em>Param list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param list</em>' containment reference.
	 * @see #getParam_list()
	 * @generated
	 */
	void setParam_list(ParamList value);

} // SimpleSignature
