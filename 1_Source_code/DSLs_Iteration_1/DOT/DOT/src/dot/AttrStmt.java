/**
 */
package dot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attr Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dot.AttrStmt#getType <em>Type</em>}</li>
 *   <li>{@link dot.AttrStmt#getAttrLists <em>Attr Lists</em>}</li>
 * </ul>
 *
 * @see dot.DotPackage#getAttrStmt()
 * @model
 * @generated
 */
public interface AttrStmt extends Stmt {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dot.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dot.AttributeType
	 * @see #setType(AttributeType)
	 * @see dot.DotPackage#getAttrStmt_Type()
	 * @model
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link dot.AttrStmt#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dot.AttributeType
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Attr Lists</b></em>' containment reference list.
	 * The list contents are of type {@link dot.AttrList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Lists</em>' containment reference list.
	 * @see dot.DotPackage#getAttrStmt_AttrLists()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttrList> getAttrLists();

} // AttrStmt
