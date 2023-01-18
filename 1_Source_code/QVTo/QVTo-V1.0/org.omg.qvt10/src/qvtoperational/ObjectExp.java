/**
 */
package qvtoperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ObjectExp#getReferredObject <em>Referred Object</em>}</li>
 *   <li>{@link qvtoperational.ObjectExp#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getObjectExp()
 * @model
 * @generated
 */
public interface ObjectExp extends ExpressionGO {
	/**
	 * Returns the value of the '<em><b>Referred Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Object</em>' reference.
	 * @see #setReferredObject(ExpressionGO)
	 * @see qvtoperational.QvtoperationalPackage#getObjectExp_ReferredObject()
	 * @model required="true"
	 * @generated
	 */
	ExpressionGO getReferredObject();

	/**
	 * Sets the value of the '{@link qvtoperational.ObjectExp#getReferredObject <em>Referred Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Object</em>' reference.
	 * @see #getReferredObject()
	 * @generated
	 */
	void setReferredObject(ExpressionGO value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ConstructorBody)
	 * @see qvtoperational.QvtoperationalPackage#getObjectExp_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstructorBody getBody();

	/**
	 * Sets the value of the '{@link qvtoperational.ObjectExp#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ConstructorBody value);

} // ObjectExp
