/**
 */
package qvtoperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.CompleteSignature#getSimple_signature <em>Simple signature</em>}</li>
 *   <li>{@link qvtoperational.CompleteSignature#getParam_list <em>Param list</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getCompleteSignature()
 * @model
 * @generated
 */
public interface CompleteSignature extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple signature</em>' containment reference.
	 * @see #setSimple_signature(SimpleSignature)
	 * @see qvtoperational.QvtoperationalPackage#getCompleteSignature_Simple_signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleSignature getSimple_signature();

	/**
	 * Sets the value of the '{@link qvtoperational.CompleteSignature#getSimple_signature <em>Simple signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple signature</em>' containment reference.
	 * @see #getSimple_signature()
	 * @generated
	 */
	void setSimple_signature(SimpleSignature value);

	/**
	 * Returns the value of the '<em><b>Param list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param list</em>' containment reference.
	 * @see #setParam_list(ParamList)
	 * @see qvtoperational.QvtoperationalPackage#getCompleteSignature_Param_list()
	 * @model containment="true"
	 * @generated
	 */
	ParamList getParam_list();

	/**
	 * Sets the value of the '{@link qvtoperational.CompleteSignature#getParam_list <em>Param list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param list</em>' containment reference.
	 * @see #getParam_list()
	 * @generated
	 */
	void setParam_list(ParamList value);

} // CompleteSignature
