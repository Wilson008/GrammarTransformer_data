/**
 */
package dot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dot.DotGraph#isStrict <em>Strict</em>}</li>
 *   <li>{@link dot.DotGraph#getType <em>Type</em>}</li>
 *   <li>{@link dot.DotGraph#getName <em>Name</em>}</li>
 *   <li>{@link dot.DotGraph#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see dot.DotPackage#getDotGraph()
 * @model
 * @generated
 */
public interface DotGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strict</em>' attribute.
	 * @see #setStrict(boolean)
	 * @see dot.DotPackage#getDotGraph_Strict()
	 * @model
	 * @generated
	 */
	boolean isStrict();

	/**
	 * Sets the value of the '{@link dot.DotGraph#isStrict <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict</em>' attribute.
	 * @see #isStrict()
	 * @generated
	 */
	void setStrict(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dot.GraphType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dot.GraphType
	 * @see #setType(GraphType)
	 * @see dot.DotPackage#getDotGraph_Type()
	 * @model
	 * @generated
	 */
	GraphType getType();

	/**
	 * Sets the value of the '{@link dot.DotGraph#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dot.GraphType
	 * @see #getType()
	 * @generated
	 */
	void setType(GraphType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dot.DotPackage#getDotGraph_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dot.DotGraph#getName <em>Name</em>}' attribute.
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
	 * @see dot.DotPackage#getDotGraph_Stmts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stmt> getStmts();

} // DotGraph
