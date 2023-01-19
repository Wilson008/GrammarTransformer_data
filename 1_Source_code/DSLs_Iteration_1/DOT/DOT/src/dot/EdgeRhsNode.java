/**
 */
package dot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Rhs Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dot.EdgeRhsNode#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see dot.DotPackage#getEdgeRhsNode()
 * @model
 * @generated
 */
public interface EdgeRhsNode extends EdgeRhs {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(NodeId)
	 * @see dot.DotPackage#getEdgeRhsNode_Node()
	 * @model containment="true"
	 * @generated
	 */
	NodeId getNode();

	/**
	 * Sets the value of the '{@link dot.EdgeRhsNode#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(NodeId value);

} // EdgeRhsNode
