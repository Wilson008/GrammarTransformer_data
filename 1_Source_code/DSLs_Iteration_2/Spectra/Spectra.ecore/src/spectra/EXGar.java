/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EX Gar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.EXGar#getName <em>Name</em>}</li>
 *   <li>{@link spectra.EXGar#getElements <em>Elements</em>}</li>
 *   <li>{@link spectra.EXGar#getRegExpPointer <em>Reg Exp Pointer</em>}</li>
 *   <li>{@link spectra.EXGar#getRegExp <em>Reg Exp</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getEXGar()
 * @model
 * @generated
 */
public interface EXGar extends Decl {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spectra.SpectraPackage#getEXGar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spectra.EXGar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see spectra.SpectraPackage#getEXGar_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getElements();

	/**
	 * Returns the value of the '<em><b>Reg Exp Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Exp Pointer</em>' reference.
	 * @see #setRegExpPointer(DefineRegExpDecl)
	 * @see spectra.SpectraPackage#getEXGar_RegExpPointer()
	 * @model
	 * @generated
	 */
	DefineRegExpDecl getRegExpPointer();

	/**
	 * Sets the value of the '{@link spectra.EXGar#getRegExpPointer <em>Reg Exp Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Exp Pointer</em>' reference.
	 * @see #getRegExpPointer()
	 * @generated
	 */
	void setRegExpPointer(DefineRegExpDecl value);

	/**
	 * Returns the value of the '<em><b>Reg Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Exp</em>' containment reference.
	 * @see #setRegExp(RegExp)
	 * @see spectra.SpectraPackage#getEXGar_RegExp()
	 * @model containment="true"
	 * @generated
	 */
	RegExp getRegExp();

	/**
	 * Sets the value of the '{@link spectra.EXGar#getRegExp <em>Reg Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Exp</em>' containment reference.
	 * @see #getRegExp()
	 * @generated
	 */
	void setRegExp(RegExp value);

} // EXGar
