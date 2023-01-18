/**
 */
package ImperativeOCL;

import EMOF.Type;

import EssentialOCL.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typedef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.Typedef#getBase <em>Base</em>}</li>
 *   <li>{@link ImperativeOCL.Typedef#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getTypedef()
 * @model
 * @generated
 */
public interface Typedef extends EMOF.Class {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Type)
	 * @see ImperativeOCL.ImperativeOCLPackage#getTypedef_Base()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedef'"
	 * @generated
	 */
	Type getBase();

	/**
	 * Sets the value of the '{@link ImperativeOCL.Typedef#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Type value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getTypedef_Condition()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedef'"
	 * @generated
	 */
	OclExpression getCondition();

	/**
	 * Sets the value of the '{@link ImperativeOCL.Typedef#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(OclExpression value);

} // Typedef
