/**
 */
package qvtoperational;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contextual Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ContextualProperty#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link qvtoperational.ContextualProperty#getProperty_key <em>Property key</em>}</li>
 *   <li>{@link qvtoperational.ContextualProperty#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getContextualProperty()
 * @model
 * @generated
 */
public interface ContextualProperty extends ImperativeOperation, qvtoperational.Module {
	/**
	 * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Expression</em>' containment reference.
	 * @see #setInitExpression(ExpressionGO)
	 * @see qvtoperational.QvtoperationalPackage#getContextualProperty_InitExpression()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionGO getInitExpression();

	/**
	 * Sets the value of the '{@link qvtoperational.ContextualProperty#getInitExpression <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expression</em>' containment reference.
	 * @see #getInitExpression()
	 * @generated
	 */
	void setInitExpression(ExpressionGO value);

	/**
	 * Returns the value of the '<em><b>Property key</b></em>' attribute list.
	 * The list contents are of type {@link qvtoperational.PropertyKey}.
	 * The literals are from the enumeration {@link qvtoperational.PropertyKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property key</em>' attribute list.
	 * @see qvtoperational.PropertyKey
	 * @see qvtoperational.QvtoperationalPackage#getContextualProperty_Property_key()
	 * @model required="true"
	 * @generated
	 */
	EList<PropertyKey> getProperty_key();

	/**
	 * Returns the value of the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarator</em>' containment reference.
	 * @see #setDeclarator(Declarator)
	 * @see qvtoperational.QvtoperationalPackage#getContextualProperty_Declarator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Declarator getDeclarator();

	/**
	 * Sets the value of the '{@link qvtoperational.ContextualProperty#getDeclarator <em>Declarator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarator</em>' containment reference.
	 * @see #getDeclarator()
	 * @generated
	 */
	void setDeclarator(Declarator value);

} // ContextualProperty
