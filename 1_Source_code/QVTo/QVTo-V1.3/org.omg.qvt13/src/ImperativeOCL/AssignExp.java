/**
 */
package ImperativeOCL;

import EssentialOCL.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.AssignExp#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link ImperativeOCL.AssignExp#getIsReset <em>Is Reset</em>}</li>
 *   <li>{@link ImperativeOCL.AssignExp#getLeft <em>Left</em>}</li>
 *   <li>{@link ImperativeOCL.AssignExp#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getAssignExp()
 * @model
 * @generated
 */
public interface AssignExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getAssignExp_DefaultValue()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='defaultOwner'"
	 * @generated
	 */
	OclExpression getDefaultValue();

	/**
	 * Sets the value of the '{@link ImperativeOCL.AssignExp#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Is Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reset</em>' attribute.
	 * @see #setIsReset(Boolean)
	 * @see ImperativeOCL.ImperativeOCLPackage#getAssignExp_IsReset()
	 * @model dataType="PrimitiveTypes.Boolean"
	 * @generated
	 */
	Boolean getIsReset();

	/**
	 * Sets the value of the '{@link ImperativeOCL.AssignExp#getIsReset <em>Is Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reset</em>' attribute.
	 * @see #getIsReset()
	 * @generated
	 */
	void setIsReset(Boolean value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getAssignExp_Left()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='leftOwner'"
	 * @generated
	 */
	OclExpression getLeft();

	/**
	 * Sets the value of the '{@link ImperativeOCL.AssignExp#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link EssentialOCL.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getAssignExp_Value()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='valueOwner'"
	 * @generated
	 */
	EList<OclExpression> getValue();

} // AssignExp
