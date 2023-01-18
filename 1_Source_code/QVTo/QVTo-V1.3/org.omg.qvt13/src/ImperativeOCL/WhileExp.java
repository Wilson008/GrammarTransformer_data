/**
 */
package ImperativeOCL;

import EssentialOCL.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.WhileExp#getBody <em>Body</em>}</li>
 *   <li>{@link ImperativeOCL.WhileExp#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getWhileExp()
 * @model
 * @generated
 */
public interface WhileExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getWhileExp_Body()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='whileOwner'"
	 * @generated
	 */
	OclExpression getBody();

	/**
	 * Sets the value of the '{@link ImperativeOCL.WhileExp#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getWhileExp_Condition()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='whileExpression'"
	 * @generated
	 */
	OclExpression getCondition();

	/**
	 * Sets the value of the '{@link ImperativeOCL.WhileExp#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(OclExpression value);

} // WhileExp
