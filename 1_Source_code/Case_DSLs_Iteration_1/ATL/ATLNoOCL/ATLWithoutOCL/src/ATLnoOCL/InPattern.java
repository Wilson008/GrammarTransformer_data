/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.InPattern#getElements <em>Elements</em>}</li>
 *   <li>{@link ATLnoOCL.InPattern#getRule <em>Rule</em>}</li>
 *   <li>{@link ATLnoOCL.InPattern#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getInPattern()
 * @model
 * @generated
 */
public interface InPattern extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.InPatternElement}.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.InPatternElement#getInPattern <em>In Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getInPattern_Elements()
	 * @see ATLnoOCL.InPatternElement#getInPattern
	 * @model opposite="inPattern" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<InPatternElement> getElements();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.MatchedRule#getInPattern <em>In Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(MatchedRule)
	 * @see ATLnoOCL.ATLnoOCLPackage#getInPattern_Rule()
	 * @see ATLnoOCL.MatchedRule#getInPattern
	 * @model opposite="inPattern" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MatchedRule getRule();

	/**
	 * Sets the value of the '{@link ATLnoOCL.InPattern#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(MatchedRule value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getInPattern_Filter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OCLDummy getFilter();

	/**
	 * Sets the value of the '{@link ATLnoOCL.InPattern#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(OCLDummy value);

} // InPattern
