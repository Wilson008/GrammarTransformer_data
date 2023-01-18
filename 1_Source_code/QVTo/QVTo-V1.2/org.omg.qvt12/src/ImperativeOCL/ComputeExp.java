/**
 */
package ImperativeOCL;

import EssentialOCL.OclExpression;
import EssentialOCL.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.ComputeExp#getBody <em>Body</em>}</li>
 *   <li>{@link ImperativeOCL.ComputeExp#getReturnedElement <em>Returned Element</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getComputeExp()
 * @model
 * @generated
 */
public interface ComputeExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getComputeExp_Body()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='computeOwner'"
	 * @generated
	 */
	OclExpression getBody();

	/**
	 * Sets the value of the '{@link ImperativeOCL.ComputeExp#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Returned Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returned Element</em>' containment reference.
	 * @see #setReturnedElement(Variable)
	 * @see ImperativeOCL.ImperativeOCLPackage#getComputeExp_ReturnedElement()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='computeOwner'"
	 * @generated
	 */
	Variable getReturnedElement();

	/**
	 * Sets the value of the '{@link ImperativeOCL.ComputeExp#getReturnedElement <em>Returned Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned Element</em>' containment reference.
	 * @see #getReturnedElement()
	 * @generated
	 */
	void setReturnedElement(Variable value);

} // ComputeExp
