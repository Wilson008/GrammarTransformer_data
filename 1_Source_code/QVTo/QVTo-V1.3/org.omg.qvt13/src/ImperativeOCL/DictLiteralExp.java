/**
 */
package ImperativeOCL;

import EssentialOCL.LiteralExp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dict Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.DictLiteralExp#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getDictLiteralExp()
 * @model
 * @generated
 */
public interface DictLiteralExp extends LiteralExp {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link ImperativeOCL.DictLiteralPart}.
	 * It is bidirectional and its opposite is '{@link ImperativeOCL.DictLiteralPart#getPartOwner <em>Part Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getDictLiteralExp_Part()
	 * @see ImperativeOCL.DictLiteralPart#getPartOwner
	 * @model opposite="partOwner" containment="true" ordered="false"
	 * @generated
	 */
	EList<DictLiteralPart> getPart();

} // DictLiteralExp
