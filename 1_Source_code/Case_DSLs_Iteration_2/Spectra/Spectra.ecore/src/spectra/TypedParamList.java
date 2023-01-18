/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Param List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.TypedParamList#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getTypedParamList()
 * @model
 * @generated
 */
public interface TypedParamList extends EObject {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TypedParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see spectra.SpectraPackage#getTypedParamList_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedParam> getParams();

} // TypedParamList
