/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matched Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.MatchedRule#getInPattern <em>In Pattern</em>}</li>
 *   <li>{@link ATLnoOCL.MatchedRule#getChildren <em>Children</em>}</li>
 *   <li>{@link ATLnoOCL.MatchedRule#getSuperRule <em>Super Rule</em>}</li>
 *   <li>{@link ATLnoOCL.MatchedRule#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link ATLnoOCL.MatchedRule#isIsRefining <em>Is Refining</em>}</li>
 *   <li>{@link ATLnoOCL.MatchedRule#isIsNoDefault <em>Is No Default</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getMatchedRule()
 * @model
 * @generated
 */
public interface MatchedRule extends Rule {
	/**
	 * Returns the value of the '<em><b>In Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.InPattern#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Pattern</em>' containment reference.
	 * @see #setInPattern(InPattern)
	 * @see ATLnoOCL.ATLnoOCLPackage#getMatchedRule_InPattern()
	 * @see ATLnoOCL.InPattern#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	InPattern getInPattern();

	/**
	 * Sets the value of the '{@link ATLnoOCL.MatchedRule#getInPattern <em>In Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Pattern</em>' containment reference.
	 * @see #getInPattern()
	 * @generated
	 */
	void setInPattern(InPattern value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link ATLnoOCL.MatchedRule}.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.MatchedRule#getSuperRule <em>Super Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getMatchedRule_Children()
	 * @see ATLnoOCL.MatchedRule#getSuperRule
	 * @model opposite="superRule" ordered="false"
	 * @generated
	 */
	EList<MatchedRule> getChildren();

	/**
	 * Returns the value of the '<em><b>Super Rule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.MatchedRule#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Rule</em>' reference.
	 * @see #setSuperRule(MatchedRule)
	 * @see ATLnoOCL.ATLnoOCLPackage#getMatchedRule_SuperRule()
	 * @see ATLnoOCL.MatchedRule#getChildren
	 * @model opposite="children" ordered="false"
	 * @generated
	 */
	MatchedRule getSuperRule();

	/**
	 * Sets the value of the '{@link ATLnoOCL.MatchedRule#getSuperRule <em>Super Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Rule</em>' reference.
	 * @see #getSuperRule()
	 * @generated
	 */
	void setSuperRule(MatchedRule value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see ATLnoOCL.ATLnoOCLPackage#getMatchedRule_IsAbstract()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link ATLnoOCL.MatchedRule#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Refining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Refining</em>' attribute.
	 * @see #setIsRefining(boolean)
	 * @see ATLnoOCL.ATLnoOCLPackage#getMatchedRule_IsRefining()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRefining();

	/**
	 * Sets the value of the '{@link ATLnoOCL.MatchedRule#isIsRefining <em>Is Refining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Refining</em>' attribute.
	 * @see #isIsRefining()
	 * @generated
	 */
	void setIsRefining(boolean value);

	/**
	 * Returns the value of the '<em><b>Is No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is No Default</em>' attribute.
	 * @see #setIsNoDefault(boolean)
	 * @see ATLnoOCL.ATLnoOCLPackage#getMatchedRule_IsNoDefault()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsNoDefault();

	/**
	 * Sets the value of the '{@link ATLnoOCL.MatchedRule#isIsNoDefault <em>Is No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is No Default</em>' attribute.
	 * @see #isIsNoDefault()
	 * @generated
	 */
	void setIsNoDefault(boolean value);

} // MatchedRule
