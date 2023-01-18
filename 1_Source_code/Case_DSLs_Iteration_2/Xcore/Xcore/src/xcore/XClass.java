/**
 */
package xcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link xcore.XClass#isInterface <em>Interface</em>}</li>
 *   <li>{@link xcore.XClass#getMembers <em>Members</em>}</li>
 *   <li>{@link xcore.XClass#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXClass()
 * @model
 * @generated
 */
public interface XClass extends XClassifier {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see xcore.XcorePackage#getXClass_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link xcore.XClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see xcore.XcorePackage#getXClass_Interface()
	 * @model
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link xcore.XClass#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XMember}.
	 * It is bidirectional and its opposite is '{@link xcore.XMember#getContainingClass <em>Containing Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see xcore.XcorePackage#getXClass_Members()
	 * @see xcore.XMember#getContainingClass
	 * @model opposite="containingClass" containment="true"
	 * @generated
	 */
	EList<XMember> getMembers();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XGenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' containment reference list.
	 * @see xcore.XcorePackage#getXClass_SuperTypes()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<XGenericType> getSuperTypes();

} // XClass
