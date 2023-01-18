/**
 */
package ImperativeOCL;

import EssentialOCL.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.BlockExp#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getBlockExp()
 * @model
 * @generated
 */
public interface BlockExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link EssentialOCL.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getBlockExp_Body()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='blockOwner'"
	 * @generated
	 */
	EList<OclExpression> getBody();

} // BlockExp
