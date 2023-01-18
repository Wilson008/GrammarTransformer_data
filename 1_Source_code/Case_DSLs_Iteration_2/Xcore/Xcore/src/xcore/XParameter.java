/**
 */
package xcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XParameter#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXParameter()
 * @model
 * @generated
 */
public interface XParameter extends XTypedElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xcore.XOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see xcore.XcorePackage#getXParameter_Operation()
	 * @see xcore.XOperation#getParameters
	 * @model opposite="parameters" resolveProxies="false" changeable="false"
	 * @generated
	 */
	XOperation getOperation();

} // XParameter
