/**
 */
package QVTOperational;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ObjectExp#getBody <em>Body</em>}</li>
 *   <li>{@link QVTOperational.ObjectExp#getReferredObject <em>Referred Object</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getObjectExp()
 * @model
 * @generated
 */
public interface ObjectExp extends ExpressionGO {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ConstructorBody)
	 * @see QVTOperational.QVTOperationalPackage#getObjectExp_Body()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='objectExp'"
	 * @generated
	 */
	ConstructorBody getBody();

	/**
	 * Sets the value of the '{@link QVTOperational.ObjectExp#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ConstructorBody value);

	/**
	 * Returns the value of the '<em><b>Referred Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Object</em>' reference.
	 * @see #setReferredObject(ExpressionGO)
	 * @see QVTOperational.QVTOperationalPackage#getObjectExp_ReferredObject()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='objectExpression'"
	 * @generated
	 */
	ExpressionGO getReferredObject();

	/**
	 * Sets the value of the '{@link QVTOperational.ObjectExp#getReferredObject <em>Referred Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Object</em>' reference.
	 * @see #getReferredObject()
	 * @generated
	 */
	void setReferredObject(ExpressionGO value);

} // ObjectExp
