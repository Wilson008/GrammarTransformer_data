/**
 */
package ImperativeOCL;

import EMOF.Type;

import EssentialOCL.OclExpression;

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
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='tryExpression'"
	 * @generated
	 */
	EList<Type> getException();

} // CatchExp
