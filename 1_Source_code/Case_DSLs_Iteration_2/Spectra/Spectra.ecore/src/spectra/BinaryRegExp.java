/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Reg Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.BinaryRegExp#getOp <em>Op</em>}</li>
 *   <li>{@link spectra.BinaryRegExp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getBinaryRegExp()
 * @model
 * @generated
 */
public interface BinaryRegExp extends RegExp {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see spectra.SpectraPackage#getBinaryRegExp_Op()
	 * @model
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link spectra.BinaryRegExp#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(RegExp)
	 * @see spectra.SpectraPackage#getBinaryRegExp_Right()
	 * @model containment="true"
	 * @generated
	 */
	RegExp getRight();

	/**
	 * Sets the value of the '{@link spectra.BinaryRegExp#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(RegExp value);

} // BinaryRegExp
