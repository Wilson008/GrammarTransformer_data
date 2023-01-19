/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Param List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.PatternParamList#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getPatternParamList()
 * @model
 * @generated
 */
public interface PatternParamList extends EObject {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.PatternParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see spectra.SpectraPackage#getPatternParamList_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatternParam> getParams();

} // PatternParamList
