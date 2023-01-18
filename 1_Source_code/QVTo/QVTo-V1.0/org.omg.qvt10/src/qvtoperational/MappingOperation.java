/**
 */
package qvtoperational;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.MappingOperation#getDisjunct <em>Disjunct</em>}</li>
 *   <li>{@link qvtoperational.MappingOperation#getRefinedRelation <em>Refined Relation</em>}</li>
 *   <li>{@link qvtoperational.MappingOperation#getMerged <em>Merged</em>}</li>
 *   <li>{@link qvtoperational.MappingOperation#getInherited <em>Inherited</em>}</li>
 *   <li>{@link qvtoperational.MappingOperation#getWhen <em>When</em>}</li>
 *   <li>{@link qvtoperational.MappingOperation#getWhere <em>Where</em>}</li>
 *   <li>{@link qvtoperational.MappingOperation#getMapping_full_header <em>Mapping full header</em>}</li>
 *   <li>{@link qvtoperational.MappingOperation#getMapping_body <em>Mapping body</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getMappingOperation()
 * @model
 * @generated
 */
public interface MappingOperation extends ImperativeOperation, qvtoperational.Module {
	/**
	 * Returns the value of the '<em><b>Disjunct</b></em>' reference list.
	 * The list contents are of type {@link qvtoperational.MappingOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjunct</em>' reference list.
	 * @see qvtoperational.QvtoperationalPackage#getMappingOperation_Disjunct()
	 * @model
	 * @generated
	 */
	EList<MappingOperation> getDisjunct();

	/**
	 * Returns the value of the '<em><b>Refined Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Relation</em>' reference.
	 * @see #setRefinedRelation(ExpressionGO)
	 * @see qvtoperational.QvtoperationalPackage#getMappingOperation_RefinedRelation()
	 * @model
	 * @generated
	 */
	ExpressionGO getRefinedRelation();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingOperation#getRefinedRelation <em>Refined Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Relation</em>' reference.
	 * @see #getRefinedRelation()
	 * @generated
	 */
	void setRefinedRelation(ExpressionGO value);

	/**
	 * Returns the value of the '<em><b>Merged</b></em>' reference list.
	 * The list contents are of type {@link qvtoperational.MappingOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged</em>' reference list.
	 * @see qvtoperational.QvtoperationalPackage#getMappingOperation_Merged()
	 * @model
	 * @generated
	 */
	EList<MappingOperation> getMerged();

	/**
	 * Returns the value of the '<em><b>Inherited</b></em>' reference list.
	 * The list contents are of type {@link qvtoperational.MappingOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited</em>' reference list.
	 * @see qvtoperational.QvtoperationalPackage#getMappingOperation_Inherited()
	 * @model
	 * @generated
	 */
	EList<MappingOperation> getInherited();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getMappingOperation_When()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionGO> getWhen();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getMappingOperation_Where()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionGO> getWhere();

	/**
	 * Returns the value of the '<em><b>Mapping full header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping full header</em>' containment reference.
	 * @see #setMapping_full_header(MappingFullHeader)
	 * @see qvtoperational.QvtoperationalPackage#getMappingOperation_Mapping_full_header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MappingFullHeader getMapping_full_header();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingOperation#getMapping_full_header <em>Mapping full header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping full header</em>' containment reference.
	 * @see #getMapping_full_header()
	 * @generated
	 */
	void setMapping_full_header(MappingFullHeader value);

	/**
	 * Returns the value of the '<em><b>Mapping body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping body</em>' containment reference.
	 * @see #setMapping_body(MappingBody)
	 * @see qvtoperational.QvtoperationalPackage#getMappingOperation_Mapping_body()
	 * @model containment="true"
	 * @generated
	 */
	MappingBody getMapping_body();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingOperation#getMapping_body <em>Mapping body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping body</em>' containment reference.
	 * @see #getMapping_body()
	 * @generated
	 */
	void setMapping_body(MappingBody value);

} // MappingOperation
