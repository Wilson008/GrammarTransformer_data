/**
 */
package ATLnoOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lazy Matched Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.LazyMatchedRule#isIsUnique <em>Is Unique</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getLazyMatchedRule()
 * @model
 * @generated
 */
public interface LazyMatchedRule extends MatchedRule {
	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see ATLnoOCL.ATLnoOCLPackage#getLazyMatchedRule_IsUnique()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link ATLnoOCL.LazyMatchedRule#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

} // LazyMatchedRule
