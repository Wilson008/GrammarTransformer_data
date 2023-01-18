/**
 */
package ImperativeOCL;

import EssentialOCL.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.SwitchExp#getAlternativePart <em>Alternative Part</em>}</li>
 *   <li>{@link ImperativeOCL.SwitchExp#getElsePart <em>Else Part</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getSwitchExp()
 * @model
 * @generated
 */
public interface SwitchExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Alternative Part</b></em>' containment reference list.
	 * The list contents are of type {@link ImperativeOCL.AltExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Part</em>' containment reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getSwitchExp_AlternativePart()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='altOwner'"
	 * @generated
	 */
	EList<AltExp> getAlternativePart();

	/**
	 * Returns the value of the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Part</em>' containment reference.
	 * @see #setElsePart(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getSwitchExp_ElsePart()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='elsePartOwner'"
	 * @generated
	 */
	OclExpression getElsePart();

	/**
	 * Sets the value of the '{@link ImperativeOCL.SwitchExp#getElsePart <em>Else Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Part</em>' containment reference.
	 * @see #getElsePart()
	 * @generated
	 */
	void setElsePart(OclExpression value);

} // SwitchExp
