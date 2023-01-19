/**
 */
package dot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Stmt Subgraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dot.EdgeStmtSubgraph#getSubgraph <em>Subgraph</em>}</li>
 *   <li>{@link dot.EdgeStmtSubgraph#getEdgeRHS <em>Edge RHS</em>}</li>
 *   <li>{@link dot.EdgeStmtSubgraph#getAttrLists <em>Attr Lists</em>}</li>
 * </ul>
 *
 * @see dot.DotPackage#getEdgeStmtSubgraph()
 * @model
 * @generated
 */
public interface EdgeStmtSubgraph extends SubgraphOrEdgeStmtSubgraph {
	/**
	 * Returns the value of the '<em><b>Subgraph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgraph</em>' containment reference.
	 * @see #setSubgraph(Subgraph)
	 * @see dot.DotPackage#getEdgeStmtSubgraph_Subgraph()
	 * @model containment="true"
	 * @generated
	 */
	Subgraph getSubgraph();

	/**
	 * Sets the value of the '{@link dot.EdgeStmtSubgraph#getSubgraph <em>Subgraph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subgraph</em>' containment reference.
	 * @see #getSubgraph()
	 * @generated
	 */
	void setSubgraph(Subgraph value);

	/**
	 * Returns the value of the '<em><b>Edge RHS</b></em>' containment reference list.
	 * The list contents are of type {@link dot.EdgeRhs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge RHS</em>' containment reference list.
	 * @see dot.DotPackage#getEdgeStmtSubgraph_EdgeRHS()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdgeRhs> getEdgeRHS();

	/**
	 * Returns the value of the '<em><b>Attr Lists</b></em>' containment reference list.
	 * The list contents are of type {@link dot.AttrList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Lists</em>' containment reference list.
	 * @see dot.DotPackage#getEdgeStmtSubgraph_AttrLists()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttrList> getAttrLists();

} // EdgeStmtSubgraph
