/**
 */
package xcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XMember#getContainingClass <em>Containing Class</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXMember()
 * @model abstract="true"
 * @generated
 */
public interface XMember extends XTypedElement {
	/**
	 * Returns the value of the '<em><b>Containing Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xcore.XClass#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Class</em>' container reference.
	 * @see xcore.XcorePackage#getXMember_ContainingClass()
	 * @see xcore.XClass#getMembers
	 * @model opposite="members" resolveProxies="false" changeable="false"
	 * @generated
	 */
	XClass getContainingClass();

} // XMember
