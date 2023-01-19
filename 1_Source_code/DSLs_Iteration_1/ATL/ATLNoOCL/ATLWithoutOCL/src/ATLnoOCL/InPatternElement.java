/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.InPatternElement#getMapsTo <em>Maps To</em>}</li>
 *   <li>{@link ATLnoOCL.InPatternElement#getInPattern <em>In Pattern</em>}</li>
 *   <li>{@link ATLnoOCL.InPatternElement#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getInPatternElement()
 * @model abstract="true"
 * @generated
 */
public interface InPatternElement extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Maps To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.OutPatternElement#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps To</em>' reference.
	 * @see #setMapsTo(OutPatternElement)
	 * @see ATLnoOCL.ATLnoOCLPackage#getInPatternElement_MapsTo()
	 * @see ATLnoOCL.OutPatternElement#getSourceElement
	 * @model opposite="sourceElement" required="true" ordered="false"
	 * @generated
	 */
	OutPatternElement getMapsTo();

	/**
	 * Sets the value of the '{@link ATLnoOCL.InPatternElement#getMapsTo <em>Maps To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps To</em>' reference.
	 * @see #getMapsTo()
	 * @generated
	 */
	void setMapsTo(OutPatternElement value);

	/**
	 * Returns the value of the '<em><b>In Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.InPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Pattern</em>' container reference.
	 * @see #setInPattern(InPattern)
	 * @see ATLnoOCL.ATLnoOCLPackage#getInPatternElement_InPattern()
	 * @see ATLnoOCL.InPattern#getElements
	 * @model opposite="elements" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InPattern getInPattern();

	/**
	 * Sets the value of the '{@link ATLnoOCL.InPatternElement#getInPattern <em>In Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Pattern</em>' container reference.
	 * @see #getInPattern()
	 * @generated
	 */
	void setInPattern(InPattern value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' reference list.
	 * The list contents are of type {@link ATLnoOCL.OCLDummy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getInPatternElement_Models()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OCLDummy> getModels();

} // InPatternElement
