/**
 */
package QVTOperational;

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
 *   <li>{@link QVTOperational.ContextualProperty#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link QVTOperational.ContextualProperty#getProperty_key <em>Property key</em>}</li>
 *   <li>{@link QVTOperational.ContextualProperty#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getContextualProperty()
 * @model
 * @generated
 */
public interface ContextualProperty extends ImperativeOperation, QVTOperational.Module {
	/**
	 * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Expression</em>' containment reference.
	 * @see #setInitExpression(ExpressionGO)
	 * @see QVTOperational.QVTOperationalPackage#getContextualProperty_InitExpression()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ownerProperty'"
	 * @generated
	 */
	ExpressionGO getInitExpression();

	/**
	 * Sets the value of the '{@link QVTOperational.ContextualProperty#getInitExpression <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expression</em>' containment reference.
	 * @see #getInitExpression()
	 * @generated
	 */
	void setInitExpression(ExpressionGO value);

	/**
	 * Returns the value of the '<em><b>Property key</b></em>' attribute list.
	 * The list contents are of type {@link QVTOperational.PropertyKey}.
	 * The literals are from the enumeration {@link QVTOperational.PropertyKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property key</em>' attribute list.
	 * @see QVTOperational.PropertyKey
	 * @see QVTOperational.QVTOperationalPackage#getContextualProperty_Property_key()
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
	 * @see QVTOperational.QVTOperationalPackage#getContextualProperty_Declarator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Declarator getDeclarator();

	/**
	 * Sets the value of the '{@link QVTOperational.ContextualProperty#getDeclarator <em>Declarator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarator</em>' containment reference.
	 * @see #getDeclarator()
	 * @generated
	 */
	void setDeclarator(Declarator value);

} // ContextualProperty
