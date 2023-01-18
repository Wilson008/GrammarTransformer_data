/**
 */
package ImperativeOCL;

import EssentialOCL.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlink Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.UnlinkExp#getItem <em>Item</em>}</li>
 *   <li>{@link ImperativeOCL.UnlinkExp#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getUnlinkExp()
 * @model
 * @generated
 */
public interface UnlinkExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getUnlinkExp_Item()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='itemUnlink'"
	 * @generated
	 */
	OclExpression getItem();

	/**
	 * Sets the value of the '{@link ImperativeOCL.UnlinkExp#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getUnlinkExp_Target()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='tgtUnlink'"
	 * @generated
	 */
	OclExpression getTarget();

	/**
	 * Sets the value of the '{@link ImperativeOCL.UnlinkExp#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(OclExpression value);

} // UnlinkExp
