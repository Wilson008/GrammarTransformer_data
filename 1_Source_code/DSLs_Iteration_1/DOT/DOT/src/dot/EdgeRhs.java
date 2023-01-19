/**
 */
package dot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Rhs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dot.EdgeRhs#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see dot.DotPackage#getEdgeRhs()
 * @model
 * @generated
 */
public interface EdgeRhs extends EObject {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link dot.EdgeOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see dot.EdgeOp
	 * @see #setOp(EdgeOp)
	 * @see dot.DotPackage#getEdgeRhs_Op()
	 * @model
	 * @generated
	 */
	EdgeOp getOp();

	/**
	 * Sets the value of the '{@link dot.EdgeRhs#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see dot.EdgeOp
	 * @see #getOp()
	 * @generated
	 */
	void setOp(EdgeOp value);

} // EdgeRhs
