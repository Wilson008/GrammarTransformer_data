/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Out Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.SimpleOutPatternElement#getReverseBindings <em>Reverse Bindings</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getSimpleOutPatternElement()
 * @model
 * @generated
 */
public interface SimpleOutPatternElement extends OutPatternElement {
	/**
	 * Returns the value of the '<em><b>Reverse Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.OCLDummy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Bindings</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getSimpleOutPatternElement_ReverseBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLDummy> getReverseBindings();

} // SimpleOutPatternElement
