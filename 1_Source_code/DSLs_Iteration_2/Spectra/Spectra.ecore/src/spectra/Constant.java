/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.Constant#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link spectra.Constant#getIntegerValue <em>Integer Value</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends TemporalExpression {
	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value</em>' attribute.
	 * @see #setBooleanValue(String)
	 * @see spectra.SpectraPackage#getConstant_BooleanValue()
	 * @model
	 * @generated
	 */
	String getBooleanValue();

	/**
	 * Sets the value of the '{@link spectra.Constant#getBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' attribute.
	 * @see #getBooleanValue()
	 * @generated
	 */
	void setBooleanValue(String value);

	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' attribute.
	 * @see #setIntegerValue(int)
	 * @see spectra.SpectraPackage#getConstant_IntegerValue()
	 * @model
	 * @generated
	 */
	int getIntegerValue();

	/**
	 * Sets the value of the '{@link spectra.Constant#getIntegerValue <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' attribute.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(int value);

} // Constant
