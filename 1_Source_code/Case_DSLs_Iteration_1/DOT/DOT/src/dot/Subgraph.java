/**
 */
package dot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subgraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dot.Subgraph#getName <em>Name</em>}</li>
 *   <li>{@link dot.Subgraph#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see dot.DotPackage#getSubgraph()
 * @model
 * @generated
 */
public interface Subgraph extends SubgraphOrEdgeStmtSubgraph {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dot.DotPackage#getSubgraph_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dot.Subgraph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
	 * The list contents are of type {@link dot.Stmt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stmts</em>' containment reference list.
	 * @see dot.DotPackage#getSubgraph_Stmts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stmt> getStmts();

} // Subgraph
