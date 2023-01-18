/**
 */
package QVTOperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ParamList#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getParamList()
 * @model
 * @generated
 */
public interface ParamList extends EObject {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.VarParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getParamList_Param()
	 * @model containment="true"
	 * @generated
	 */
	EList<VarParameter> getParam();

} // ParamList
