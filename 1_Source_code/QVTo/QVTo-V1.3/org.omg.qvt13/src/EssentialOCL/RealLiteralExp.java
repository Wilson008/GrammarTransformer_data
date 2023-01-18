/**
 */
package EssentialOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.RealLiteralExp#getRealSymbol <em>Real Symbol</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getRealLiteralExp()
 * @model
 * @generated
 */
public interface RealLiteralExp extends NumericLiteralExp {
	/**
	 * Returns the value of the '<em><b>Real Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Symbol</em>' attribute.
	 * @see #setRealSymbol(Float)
	 * @see EssentialOCL.EssentialOCLPackage#getRealLiteralExp_RealSymbol()
	 * @model dataType="PrimitiveTypes.Real"
	 * @generated
	 */
	Float getRealSymbol();

	/**
	 * Sets the value of the '{@link EssentialOCL.RealLiteralExp#getRealSymbol <em>Real Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Symbol</em>' attribute.
	 * @see #getRealSymbol()
	 * @generated
	 */
	void setRealSymbol(Float value);

} // RealLiteralExp
