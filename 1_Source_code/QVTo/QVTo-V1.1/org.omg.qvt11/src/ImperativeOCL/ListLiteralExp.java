/**
 */
package ImperativeOCL;

import EssentialOCL.LiteralExp;
import EssentialOCL.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.ListLiteralExp#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getListLiteralExp()
 * @model
 * @generated
 */
public interface ListLiteralExp extends LiteralExp {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link EssentialOCL.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getListLiteralExp_Element()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='elementOwner'"
	 * @generated
	 */
	EList<OclExpression> getElement();

} // ListLiteralExp
