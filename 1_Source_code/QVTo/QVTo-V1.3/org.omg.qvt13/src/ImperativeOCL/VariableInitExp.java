/**
 */
package ImperativeOCL;

import EssentialOCL.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Init Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.VariableInitExp#getReferredVariable <em>Referred Variable</em>}</li>
 *   <li>{@link ImperativeOCL.VariableInitExp#getWithResult <em>With Result</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getVariableInitExp()
 * @model
 * @generated
 */
public interface VariableInitExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Referred Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Variable</em>' containment reference.
	 * @see #setReferredVariable(Variable)
	 * @see ImperativeOCL.ImperativeOCLPackage#getVariableInitExp_ReferredVariable()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='declaration'"
	 * @generated
	 */
	Variable getReferredVariable();

	/**
	 * Sets the value of the '{@link ImperativeOCL.VariableInitExp#getReferredVariable <em>Referred Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Variable</em>' containment reference.
	 * @see #getReferredVariable()
	 * @generated
	 */
	void setReferredVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>With Result</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Result</em>' attribute.
	 * @see #setWithResult(Boolean)
	 * @see ImperativeOCL.ImperativeOCLPackage#getVariableInitExp_WithResult()
	 * @model default="false" dataType="PrimitiveTypes.Boolean"
	 * @generated
	 */
	Boolean getWithResult();

	/**
	 * Sets the value of the '{@link ImperativeOCL.VariableInitExp#getWithResult <em>With Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Result</em>' attribute.
	 * @see #getWithResult()
	 * @generated
	 */
	void setWithResult(Boolean value);

} // VariableInitExp
