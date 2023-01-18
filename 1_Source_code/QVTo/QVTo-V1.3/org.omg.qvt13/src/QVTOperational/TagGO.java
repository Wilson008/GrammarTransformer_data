/**
 */
package QVTOperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag GO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.TagGO#getTagid <em>Tagid</em>}</li>
 *   <li>{@link QVTOperational.TagGO#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link QVTOperational.TagGO#getTagvalue <em>Tagvalue</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getTagGO()
 * @model
 * @generated
 */
public interface TagGO extends QVTOperational.Module, ImperativeOperation {
	/**
	 * Returns the value of the '<em><b>Tagid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagid</em>' attribute.
	 * @see #setTagid(String)
	 * @see QVTOperational.QVTOperationalPackage#getTagGO_Tagid()
	 * @model required="true"
	 * @generated
	 */
	String getTagid();

	/**
	 * Sets the value of the '{@link QVTOperational.TagGO#getTagid <em>Tagid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagid</em>' attribute.
	 * @see #getTagid()
	 * @generated
	 */
	void setTagid(String value);

	/**
	 * Returns the value of the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #setScoped_identifier(ScopedIdentifier)
	 * @see QVTOperational.QVTOperationalPackage#getTagGO_Scoped_identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScopedIdentifier getScoped_identifier();

	/**
	 * Sets the value of the '{@link QVTOperational.TagGO#getScoped_identifier <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #getScoped_identifier()
	 * @generated
	 */
	void setScoped_identifier(ScopedIdentifier value);

	/**
	 * Returns the value of the '<em><b>Tagvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagvalue</em>' containment reference.
	 * @see #setTagvalue(ExpressionGO)
	 * @see QVTOperational.QVTOperationalPackage#getTagGO_Tagvalue()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionGO getTagvalue();

	/**
	 * Sets the value of the '{@link QVTOperational.TagGO#getTagvalue <em>Tagvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagvalue</em>' containment reference.
	 * @see #getTagvalue()
	 * @generated
	 */
	void setTagvalue(ExpressionGO value);

} // TagGO
