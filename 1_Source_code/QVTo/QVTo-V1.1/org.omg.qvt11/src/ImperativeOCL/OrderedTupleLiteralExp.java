/**
 */
package ImperativeOCL;

import EssentialOCL.LiteralExp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Tuple Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.OrderedTupleLiteralExp#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getOrderedTupleLiteralExp()
 * @model
 * @generated
 */
public interface OrderedTupleLiteralExp extends LiteralExp {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link ImperativeOCL.OrderedTupleLiteralPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getOrderedTupleLiteralExp_Part()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='partOwner'"
	 * @generated
	 */
	EList<OrderedTupleLiteralPart> getPart();

} // OrderedTupleLiteralExp
