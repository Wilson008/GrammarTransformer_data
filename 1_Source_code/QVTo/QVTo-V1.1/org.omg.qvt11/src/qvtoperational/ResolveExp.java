/**
 */
package qvtoperational;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolve Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ResolveExp#getCondition <em>Condition</em>}</li>
 *   <li>{@link qvtoperational.ResolveExp#getIsDeferred <em>Is Deferred</em>}</li>
 *   <li>{@link qvtoperational.ResolveExp#getIsInverse <em>Is Inverse</em>}</li>
 *   <li>{@link qvtoperational.ResolveExp#getOne <em>One</em>}</li>
 *   <li>{@link qvtoperational.ResolveExp#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getResolveExp()
 * @model
 * @generated
 */
public interface ResolveExp extends ExpressionGO {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ExpressionGO)
	 * @see qvtoperational.QvtoperationalPackage#getResolveExp_Condition()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionGO getCondition();

	/**
	 * Sets the value of the '{@link qvtoperational.ResolveExp#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ExpressionGO value);

	/**
	 * Returns the value of the '<em><b>Is Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Deferred</em>' attribute.
	 * @see #setIsDeferred(Boolean)
	 * @see qvtoperational.QvtoperationalPackage#getResolveExp_IsDeferred()
	 * @model dataType="PrimitiveTypes.Boolean"
	 * @generated
	 */
	Boolean getIsDeferred();

	/**
	 * Sets the value of the '{@link qvtoperational.ResolveExp#getIsDeferred <em>Is Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deferred</em>' attribute.
	 * @see #getIsDeferred()
	 * @generated
	 */
	void setIsDeferred(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Inverse</em>' attribute.
	 * @see #setIsInverse(Boolean)
	 * @see qvtoperational.QvtoperationalPackage#getResolveExp_IsInverse()
	 * @model dataType="PrimitiveTypes.Boolean"
	 * @generated
	 */
	Boolean getIsInverse();

	/**
	 * Sets the value of the '{@link qvtoperational.ResolveExp#getIsInverse <em>Is Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inverse</em>' attribute.
	 * @see #getIsInverse()
	 * @generated
	 */
	void setIsInverse(Boolean value);

	/**
	 * Returns the value of the '<em><b>One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One</em>' attribute.
	 * @see #setOne(Boolean)
	 * @see qvtoperational.QvtoperationalPackage#getResolveExp_One()
	 * @model dataType="PrimitiveTypes.Boolean"
	 * @generated
	 */
	Boolean getOne();

	/**
	 * Sets the value of the '{@link qvtoperational.ResolveExp#getOne <em>One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One</em>' attribute.
	 * @see #getOne()
	 * @generated
	 */
	void setOne(Boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ExpressionGO)
	 * @see qvtoperational.QvtoperationalPackage#getResolveExp_Target()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionGO getTarget();

	/**
	 * Sets the value of the '{@link qvtoperational.ResolveExp#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ExpressionGO value);

} // ResolveExp
