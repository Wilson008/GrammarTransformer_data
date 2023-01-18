/**
 */
package ImperativeOCL;

import EMOF.Type;

import EssentialOCL.OclExpression;
import EssentialOCL.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.CatchExp#getBody <em>Body</em>}</li>
 *   <li>{@link ImperativeOCL.CatchExp#getException <em>Exception</em>}</li>
 *   <li>{@link ImperativeOCL.CatchExp#getExceptionVariable <em>Exception Variable</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getCatchExp()
 * @model
 * @generated
 */
public interface CatchExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link EssentialOCL.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getCatchExp_Body()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='catchExp'"
	 * @generated
	 */
	EList<OclExpression> getBody();

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference list.
	 * The list contents are of type {@link EMOF.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getCatchExp_Exception()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='catchExp'"
	 * @generated
	 */
	EList<Type> getException();

	/**
	 * Returns the value of the '<em><b>Exception Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Variable</em>' containment reference.
	 * @see #setExceptionVariable(Variable)
	 * @see ImperativeOCL.ImperativeOCLPackage#getCatchExp_ExceptionVariable()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='catchExp'"
	 * @generated
	 */
	Variable getExceptionVariable();

	/**
	 * Sets the value of the '{@link ImperativeOCL.CatchExp#getExceptionVariable <em>Exception Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Variable</em>' containment reference.
	 * @see #getExceptionVariable()
	 * @generated
	 */
	void setExceptionVariable(Variable value);

} // CatchExp
