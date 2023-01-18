/**
 */
package xcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XClassifier#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link xcore.XClassifier#getPackage <em>Package</em>}</li>
 *   <li>{@link xcore.XClassifier#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXClassifier()
 * @model abstract="true"
 * @generated
 */
public interface XClassifier extends XNamedElement {
	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' containment reference.
	 * @see #setInstanceType(JvmTypeReference)
	 * @see xcore.XcorePackage#getXClassifier_InstanceType()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getInstanceType();

	/**
	 * Sets the value of the '{@link xcore.XClassifier#getInstanceType <em>Instance Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' containment reference.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xcore.XPackage#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see xcore.XcorePackage#getXClassifier_Package()
	 * @see xcore.XPackage#getClassifiers
	 * @model opposite="classifiers" changeable="false"
	 * @generated
	 */
	XPackage getPackage();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see xcore.XcorePackage#getXClassifier_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<XTypeParameter> getTypeParameters();

} // XClassifier
