/**
 */
package qvtoperational;

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
 *   <li>{@link qvtoperational.SimpleSignature#getParam_list <em>Param list</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getSimpleSignature()
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
	 * @see qvtoperational.QvtoperationalPackage#getSimpleSignature_Param_list()
	 * @model containment="true"
	 * @generated
	 */
	ParamList getParam_list();

	/**
	 * Sets the value of the '{@link qvtoperational.SimpleSignature#getParam_list <em>Param list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param list</em>' containment reference.
	 * @see #getParam_list()
	 * @generated
	 */
	void setParam_list(ParamList value);

} // SimpleSignature
