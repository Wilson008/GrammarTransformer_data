/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Primary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.TemporalPrimaryExpr#getPredPatt <em>Pred Patt</em>}</li>
 *   <li>{@link spectra.TemporalPrimaryExpr#getPredPattParams <em>Pred Patt Params</em>}</li>
 *   <li>{@link spectra.TemporalPrimaryExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link spectra.TemporalPrimaryExpr#getTpe <em>Tpe</em>}</li>
 *   <li>{@link spectra.TemporalPrimaryExpr#getPointer <em>Pointer</em>}</li>
 *   <li>{@link spectra.TemporalPrimaryExpr#getIndex <em>Index</em>}</li>
 *   <li>{@link spectra.TemporalPrimaryExpr#getTemporalExpression <em>Temporal Expression</em>}</li>
 *   <li>{@link spectra.TemporalPrimaryExpr#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link spectra.TemporalPrimaryExpr#getRegexpPointer <em>Regexp Pointer</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getTemporalPrimaryExpr()
 * @model
 * @generated
 */
public interface TemporalPrimaryExpr extends TemporalExpression {
	/**
	 * Returns the value of the '<em><b>Pred Patt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred Patt</em>' reference.
	 * @see #setPredPatt(PredicateOrPatternReferrable)
	 * @see spectra.SpectraPackage#getTemporalPrimaryExpr_PredPatt()
	 * @model
	 * @generated
	 */
	PredicateOrPatternReferrable getPredPatt();

	/**
	 * Sets the value of the '{@link spectra.TemporalPrimaryExpr#getPredPatt <em>Pred Patt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pred Patt</em>' reference.
	 * @see #getPredPatt()
	 * @generated
	 */
	void setPredPatt(PredicateOrPatternReferrable value);

	/**
	 * Returns the value of the '<em><b>Pred Patt Params</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred Patt Params</em>' containment reference list.
	 * @see spectra.SpectraPackage#getTemporalPrimaryExpr_PredPattParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getPredPattParams();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see spectra.SpectraPackage#getTemporalPrimaryExpr_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link spectra.TemporalPrimaryExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Tpe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tpe</em>' containment reference.
	 * @see #setTpe(TemporalExpression)
	 * @see spectra.SpectraPackage#getTemporalPrimaryExpr_Tpe()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getTpe();

	/**
	 * Sets the value of the '{@link spectra.TemporalPrimaryExpr#getTpe <em>Tpe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tpe</em>' containment reference.
	 * @see #getTpe()
	 * @generated
	 */
	void setTpe(TemporalExpression value);

	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer</em>' reference.
	 * @see #setPointer(Referrable)
	 * @see spectra.SpectraPackage#getTemporalPrimaryExpr_Pointer()
	 * @model
	 * @generated
	 */
	Referrable getPointer();

	/**
	 * Sets the value of the '{@link spectra.TemporalPrimaryExpr#getPointer <em>Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer</em>' reference.
	 * @see #getPointer()
	 * @generated
	 */
	void setPointer(Referrable value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see spectra.SpectraPackage#getTemporalPrimaryExpr_Index()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getIndex();

	/**
	 * Returns the value of the '<em><b>Temporal Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Expression</em>' containment reference.
	 * @see #setTemporalExpression(TemporalExpression)
	 * @see spectra.SpectraPackage#getTemporalPrimaryExpr_TemporalExpression()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getTemporalExpression();

	/**
	 * Sets the value of the '{@link spectra.TemporalPrimaryExpr#getTemporalExpression <em>Temporal Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Expression</em>' containment reference.
	 * @see #getTemporalExpression()
	 * @generated
	 */
	void setTemporalExpression(TemporalExpression value);

	/**
	 * Returns the value of the '<em><b>Regexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regexp</em>' containment reference.
	 * @see #setRegexp(RegExp)
	 * @see spectra.SpectraPackage#getTemporalPrimaryExpr_Regexp()
	 * @model containment="true"
	 * @generated
	 */
	RegExp getRegexp();

	/**
	 * Sets the value of the '{@link spectra.TemporalPrimaryExpr#getRegexp <em>Regexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regexp</em>' containment reference.
	 * @see #getRegexp()
	 * @generated
	 */
	void setRegexp(RegExp value);

	/**
	 * Returns the value of the '<em><b>Regexp Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regexp Pointer</em>' reference.
	 * @see #setRegexpPointer(DefineRegExpDecl)
	 * @see spectra.SpectraPackage#getTemporalPrimaryExpr_RegexpPointer()
	 * @model
	 * @generated
	 */
	DefineRegExpDecl getRegexpPointer();

	/**
	 * Sets the value of the '{@link spectra.TemporalPrimaryExpr#getRegexpPointer <em>Regexp Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regexp Pointer</em>' reference.
	 * @see #getRegexpPointer()
	 * @generated
	 */
	void setRegexpPointer(DefineRegExpDecl value);

} // TemporalPrimaryExpr
