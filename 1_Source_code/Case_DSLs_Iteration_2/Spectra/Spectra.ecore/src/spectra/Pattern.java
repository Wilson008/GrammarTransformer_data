/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link spectra.Pattern#getParams <em>Params</em>}</li>
 *   <li>{@link spectra.Pattern#getVarDeclList <em>Var Decl List</em>}</li>
 *   <li>{@link spectra.Pattern#getInitial <em>Initial</em>}</li>
 *   <li>{@link spectra.Pattern#getSafety <em>Safety</em>}</li>
 *   <li>{@link spectra.Pattern#getStateInv <em>State Inv</em>}</li>
 *   <li>{@link spectra.Pattern#getJustice <em>Justice</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends Decl, PredicateOrPatternReferrable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spectra.SpectraPackage#getPattern_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spectra.Pattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(PatternParamList)
	 * @see spectra.SpectraPackage#getPattern_Params()
	 * @model containment="true"
	 * @generated
	 */
	PatternParamList getParams();

	/**
	 * Sets the value of the '{@link spectra.Pattern#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(PatternParamList value);

	/**
	 * Returns the value of the '<em><b>Var Decl List</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.VarDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Decl List</em>' containment reference list.
	 * @see spectra.SpectraPackage#getPattern_VarDeclList()
	 * @model containment="true"
	 * @generated
	 */
	EList<VarDecl> getVarDeclList();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference list.
	 * @see spectra.SpectraPackage#getPattern_Initial()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getInitial();

	/**
	 * Returns the value of the '<em><b>Safety</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety</em>' containment reference list.
	 * @see spectra.SpectraPackage#getPattern_Safety()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getSafety();

	/**
	 * Returns the value of the '<em><b>State Inv</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Inv</em>' containment reference list.
	 * @see spectra.SpectraPackage#getPattern_StateInv()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getStateInv();

	/**
	 * Returns the value of the '<em><b>Justice</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justice</em>' containment reference list.
	 * @see spectra.SpectraPackage#getPattern_Justice()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getJustice();

} // Pattern
