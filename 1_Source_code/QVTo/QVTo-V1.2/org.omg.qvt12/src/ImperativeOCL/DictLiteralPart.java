/**
 */
package ImperativeOCL;

import EMOF.Element;

import EssentialOCL.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dict Literal Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.DictLiteralPart#getKey <em>Key</em>}</li>
 *   <li>{@link ImperativeOCL.DictLiteralPart#getValue <em>Value</em>}</li>
 *   <li>{@link ImperativeOCL.DictLiteralPart#getPartOwner <em>Part Owner</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getDictLiteralPart()
 * @model
 * @generated
 */
public interface DictLiteralPart extends Element {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getDictLiteralPart_Key()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='keyOwner'"
	 * @generated
	 */
	OclExpression getKey();

	/**
	 * Sets the value of the '{@link ImperativeOCL.DictLiteralPart#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getDictLiteralPart_Value()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='valOwner'"
	 * @generated
	 */
	OclExpression getValue();

	/**
	 * Sets the value of the '{@link ImperativeOCL.DictLiteralPart#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Part Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ImperativeOCL.DictLiteralExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Owner</em>' container reference.
	 * @see #setPartOwner(DictLiteralExp)
	 * @see ImperativeOCL.ImperativeOCLPackage#getDictLiteralPart_PartOwner()
	 * @see ImperativeOCL.DictLiteralExp#getPart
	 * @model opposite="part" required="true" transient="false"
	 * @generated
	 */
	DictLiteralExp getPartOwner();

	/**
	 * Sets the value of the '{@link ImperativeOCL.DictLiteralPart#getPartOwner <em>Part Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Owner</em>' container reference.
	 * @see #getPartOwner()
	 * @generated
	 */
	void setPartOwner(DictLiteralExp value);

} // DictLiteralPart
