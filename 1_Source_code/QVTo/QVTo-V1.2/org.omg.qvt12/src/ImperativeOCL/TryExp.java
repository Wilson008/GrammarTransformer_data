/**
 */
package ImperativeOCL;

import EssentialOCL.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.TryExp#getExceptClause <em>Except Clause</em>}</li>
 *   <li>{@link ImperativeOCL.TryExp#getTryBody <em>Try Body</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getTryExp()
 * @model
 * @generated
 */
public interface TryExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Except Clause</b></em>' containment reference list.
	 * The list contents are of type {@link ImperativeOCL.CatchExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Except Clause</em>' containment reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getTryExp_ExceptClause()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exceptOwner'"
	 * @generated
	 */
	EList<CatchExp> getExceptClause();

	/**
	 * Returns the value of the '<em><b>Try Body</b></em>' containment reference list.
	 * The list contents are of type {@link EssentialOCL.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Try Body</em>' containment reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getTryExp_TryBody()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='tryBodyOwner'"
	 * @generated
	 */
	EList<OclExpression> getTryBody();

} // TryExp
