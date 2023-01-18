/**
 */
package xcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XType Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XTypeParameter#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXTypeParameter()
 * @model
 * @generated
 */
public interface XTypeParameter extends XNamedElement {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XGenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference list.
	 * @see xcore.XcorePackage#getXTypeParameter_Bounds()
	 * @model containment="true"
	 * @generated
	 */
	EList<XGenericType> getBounds();

} // XTypeParameter
