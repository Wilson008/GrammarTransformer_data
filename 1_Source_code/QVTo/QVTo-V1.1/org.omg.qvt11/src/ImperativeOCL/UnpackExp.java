/**
 */
package ImperativeOCL;

import EssentialOCL.OclExpression;
import EssentialOCL.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unpack Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.UnpackExp#getSource <em>Source</em>}</li>
 *   <li>{@link ImperativeOCL.UnpackExp#getTargetVariable <em>Target Variable</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getUnpackExp()
 * @model
 * @generated
 */
public interface UnpackExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getUnpackExp_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getSource();

	/**
	 * Sets the value of the '{@link ImperativeOCL.UnpackExp#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Target Variable</b></em>' reference list.
	 * The list contents are of type {@link EssentialOCL.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variable</em>' reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getUnpackExp_TargetVariable()
	 * @model required="true"
	 * @generated
	 */
	EList<Variable> getTargetVariable();

} // UnpackExp
