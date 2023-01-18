/**
 */
package ImperativeOCL;

import EMOF.Type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.OrderedTupleType#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getOrderedTupleType()
 * @model
 * @generated
 */
public interface OrderedTupleType extends EMOF.Class {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference list.
	 * The list contents are of type {@link EMOF.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getOrderedTupleType_ElementType()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='eltTuple'"
	 * @generated
	 */
	EList<Type> getElementType();

} // OrderedTupleType
