/**
 */
package ImperativeOCL;

import EssentialOCL.OclExpression;
import EssentialOCL.OperationCallExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.LogExp#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getLogExp()
 * @model
 * @generated
 */
public interface LogExp extends OperationCallExp, ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getLogExp_Condition()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='logOwner'"
	 * @generated
	 */
	OclExpression getCondition();

	/**
	 * Sets the value of the '{@link ImperativeOCL.LogExp#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(OclExpression value);

} // LogExp
