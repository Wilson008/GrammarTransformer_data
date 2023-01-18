/**
 */
package ImperativeOCL;

import EssentialOCL.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.ReturnExp#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getReturnExp()
 * @model
 * @generated
 */
public interface ReturnExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getReturnExp_Value()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='returnExp'"
	 * @generated
	 */
	OclExpression getValue();

	/**
	 * Sets the value of the '{@link ImperativeOCL.ReturnExp#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OclExpression value);

} // ReturnExp
