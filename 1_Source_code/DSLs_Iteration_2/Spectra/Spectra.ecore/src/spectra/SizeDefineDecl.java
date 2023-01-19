/**
 */
package spectra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Define Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.SizeDefineDecl#getValue <em>Value</em>}</li>
 *   <li>{@link spectra.SizeDefineDecl#getName <em>Name</em>}</li>
 *   <li>{@link spectra.SizeDefineDecl#getArithExp <em>Arith Exp</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getSizeDefineDecl()
 * @model
 * @generated
 */
public interface SizeDefineDecl extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see spectra.SpectraPackage#getSizeDefineDecl_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link spectra.SizeDefineDecl#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(DefineDecl)
	 * @see spectra.SpectraPackage#getSizeDefineDecl_Name()
	 * @model
	 * @generated
	 */
	DefineDecl getName();

	/**
	 * Sets the value of the '{@link spectra.SizeDefineDecl#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(DefineDecl value);

	/**
	 * Returns the value of the '<em><b>Arith Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arith Exp</em>' containment reference.
	 * @see #setArithExp(TemporalExpression)
	 * @see spectra.SpectraPackage#getSizeDefineDecl_ArithExp()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getArithExp();

	/**
	 * Sets the value of the '{@link spectra.SizeDefineDecl#getArithExp <em>Arith Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arith Exp</em>' containment reference.
	 * @see #getArithExp()
	 * @generated
	 */
	void setArithExp(TemporalExpression value);

} // SizeDefineDecl
