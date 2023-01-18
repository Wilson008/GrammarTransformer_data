/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.OutPattern#getRule <em>Rule</em>}</li>
 *   <li>{@link ATLnoOCL.OutPattern#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getOutPattern()
 * @model
 * @generated
 */
public interface OutPattern extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.Rule#getOutPattern <em>Out Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see ATLnoOCL.ATLnoOCLPackage#getOutPattern_Rule()
	 * @see ATLnoOCL.Rule#getOutPattern
	 * @model opposite="outPattern" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link ATLnoOCL.OutPattern#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.OutPatternElement}.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.OutPatternElement#getOutPattern <em>Out Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getOutPattern_Elements()
	 * @see ATLnoOCL.OutPatternElement#getOutPattern
	 * @model opposite="outPattern" containment="true" required="true"
	 * @generated
	 */
	EList<OutPatternElement> getElements();

} // OutPattern
