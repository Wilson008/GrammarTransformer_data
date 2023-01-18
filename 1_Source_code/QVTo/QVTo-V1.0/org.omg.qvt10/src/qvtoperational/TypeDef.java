/**
 */
package qvtoperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.TypeDef#getTypespec <em>Typespec</em>}</li>
 *   <li>{@link qvtoperational.TypeDef#getTypedef_condition <em>Typedef condition</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getTypeDef()
 * @model
 * @generated
 */
public interface TypeDef extends qvtoperational.Module, ImperativeOperation {
	/**
	 * Returns the value of the '<em><b>Typespec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typespec</em>' containment reference.
	 * @see #setTypespec(TypeSpec)
	 * @see qvtoperational.QvtoperationalPackage#getTypeDef_Typespec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeSpec getTypespec();

	/**
	 * Sets the value of the '{@link qvtoperational.TypeDef#getTypespec <em>Typespec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typespec</em>' containment reference.
	 * @see #getTypespec()
	 * @generated
	 */
	void setTypespec(TypeSpec value);

	/**
	 * Returns the value of the '<em><b>Typedef condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typedef condition</em>' containment reference.
	 * @see #setTypedef_condition(ExpressionGO)
	 * @see qvtoperational.QvtoperationalPackage#getTypeDef_Typedef_condition()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionGO getTypedef_condition();

	/**
	 * Sets the value of the '{@link qvtoperational.TypeDef#getTypedef_condition <em>Typedef condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typedef condition</em>' containment reference.
	 * @see #getTypedef_condition()
	 * @generated
	 */
	void setTypedef_condition(ExpressionGO value);

} // TypeDef
