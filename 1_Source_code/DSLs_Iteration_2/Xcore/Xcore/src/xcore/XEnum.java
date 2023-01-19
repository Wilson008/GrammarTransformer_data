/**
 */
package xcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XEnum#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXEnum()
 * @model
 * @generated
 */
public interface XEnum extends XDataType {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XEnumLiteral}.
	 * It is bidirectional and its opposite is '{@link xcore.XEnumLiteral#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see xcore.XcorePackage#getXEnum_Literals()
	 * @see xcore.XEnumLiteral#getEnum
	 * @model opposite="enum" containment="true"
	 * @generated
	 */
	EList<XEnumLiteral> getLiterals();

} // XEnum
