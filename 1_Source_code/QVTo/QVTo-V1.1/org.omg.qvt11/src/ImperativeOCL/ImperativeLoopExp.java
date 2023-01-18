/**
 */
package ImperativeOCL;

import EssentialOCL.LoopExp;
import EssentialOCL.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Loop Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.ImperativeLoopExp#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getImperativeLoopExp()
 * @model abstract="true"
 * @generated
 */
public interface ImperativeLoopExp extends LoopExp, ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getImperativeLoopExp_Condition()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='loopCondOwner'"
	 * @generated
	 */
	OclExpression getCondition();

	/**
	 * Sets the value of the '{@link ImperativeOCL.ImperativeLoopExp#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(OclExpression value);

} // ImperativeLoopExp
