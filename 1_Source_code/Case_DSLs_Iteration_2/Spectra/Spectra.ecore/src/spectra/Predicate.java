/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.Predicate#getName <em>Name</em>}</li>
 *   <li>{@link spectra.Predicate#getParams <em>Params</em>}</li>
 *   <li>{@link spectra.Predicate#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends Decl, PredicateOrPatternReferrable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spectra.SpectraPackage#getPredicate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spectra.Predicate#getName <em>Name</em>}' attribute.
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
	 * @see #setParams(TypedParamList)
	 * @see spectra.SpectraPackage#getPredicate_Params()
	 * @model containment="true"
	 * @generated
	 */
	TypedParamList getParams();

	/**
	 * Sets the value of the '{@link spectra.Predicate#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(TypedParamList value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(TemporalExpression)
	 * @see spectra.SpectraPackage#getPredicate_Body()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getBody();

	/**
	 * Sets the value of the '{@link spectra.Predicate#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(TemporalExpression value);

} // Predicate
