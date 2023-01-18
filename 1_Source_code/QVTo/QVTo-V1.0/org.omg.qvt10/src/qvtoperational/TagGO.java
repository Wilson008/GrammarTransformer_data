/**
 */
package qvtoperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag GO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.TagGO#getTagid <em>Tagid</em>}</li>
 *   <li>{@link qvtoperational.TagGO#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link qvtoperational.TagGO#getTagvalue <em>Tagvalue</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getTagGO()
 * @model
 * @generated
 */
public interface TagGO extends qvtoperational.Module, ImperativeOperation {
	/**
	 * Returns the value of the '<em><b>Tagid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagid</em>' attribute.
	 * @see #setTagid(String)
	 * @see qvtoperational.QvtoperationalPackage#getTagGO_Tagid()
	 * @model required="true"
	 * @generated
	 */
	String getTagid();

	/**
	 * Sets the value of the '{@link qvtoperational.TagGO#getTagid <em>Tagid</em>}' attribute.
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
	 * @see qvtoperational.QvtoperationalPackage#getTagGO_Scoped_identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScopedIdentifier getScoped_identifier();

	/**
	 * Sets the value of the '{@link qvtoperational.TagGO#getScoped_identifier <em>Scoped identifier</em>}' containment reference.
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
	 * @see qvtoperational.QvtoperationalPackage#getTagGO_Tagvalue()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionGO getTagvalue();

	/**
	 * Sets the value of the '{@link qvtoperational.TagGO#getTagvalue <em>Tagvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagvalue</em>' containment reference.
	 * @see #getTagvalue()
	 * @generated
	 */
	void setTagvalue(ExpressionGO value);

} // TagGO
