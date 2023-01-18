/**
 */
package qvtoperational;

import emof.Property;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.OperationalTransformation#getIntermediateClass <em>Intermediate Class</em>}</li>
 *   <li>{@link qvtoperational.OperationalTransformation#getRefined <em>Refined</em>}</li>
 *   <li>{@link qvtoperational.OperationalTransformation#getIntermediateProperty <em>Intermediate Property</em>}</li>
 *   <li>{@link qvtoperational.OperationalTransformation#getModelParameter <em>Model Parameter</em>}</li>
 *   <li>{@link qvtoperational.OperationalTransformation#getRelation <em>Relation</em>}</li>
 *   <li>{@link qvtoperational.OperationalTransformation#getTransformation_h <em>Transformation h</em>}</li>
 *   <li>{@link qvtoperational.OperationalTransformation#getModule_element <em>Module element</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getOperationalTransformation()
 * @model
 * @generated
 */
public interface OperationalTransformation extends qvtoperational.Module {
	/**
	 * Returns the value of the '<em><b>Intermediate Class</b></em>' reference list.
	 * The list contents are of type {@link emof.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Class</em>' reference list.
	 * @see qvtoperational.QvtoperationalPackage#getOperationalTransformation_IntermediateClass()
	 * @model
	 * @generated
	 */
	EList<emof.Class> getIntermediateClass();

	/**
	 * Returns the value of the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined</em>' reference.
	 * @see #setRefined(ExpressionGO)
	 * @see qvtoperational.QvtoperationalPackage#getOperationalTransformation_Refined()
	 * @model
	 * @generated
	 */
	ExpressionGO getRefined();

	/**
	 * Sets the value of the '{@link qvtoperational.OperationalTransformation#getRefined <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined</em>' reference.
	 * @see #getRefined()
	 * @generated
	 */
	void setRefined(ExpressionGO value);

	/**
	 * Returns the value of the '<em><b>Intermediate Property</b></em>' reference list.
	 * The list contents are of type {@link emof.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Property</em>' reference list.
	 * @see qvtoperational.QvtoperationalPackage#getOperationalTransformation_IntermediateProperty()
	 * @model
	 * @generated
	 */
	EList<Property> getIntermediateProperty();

	/**
	 * Returns the value of the '<em><b>Model Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ModelParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Parameter</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getOperationalTransformation_ModelParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelParameter> getModelParameter();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getOperationalTransformation_Relation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionGO> getRelation();

	/**
	 * Returns the value of the '<em><b>Transformation h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation h</em>' containment reference.
	 * @see #setTransformation_h(TransformationHeader)
	 * @see qvtoperational.QvtoperationalPackage#getOperationalTransformation_Transformation_h()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TransformationHeader getTransformation_h();

	/**
	 * Sets the value of the '{@link qvtoperational.OperationalTransformation#getTransformation_h <em>Transformation h</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation h</em>' containment reference.
	 * @see #getTransformation_h()
	 * @generated
	 */
	void setTransformation_h(TransformationHeader value);

	/**
	 * Returns the value of the '<em><b>Module element</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ImperativeOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module element</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getOperationalTransformation_Module_element()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImperativeOperation> getModule_element();

} // OperationalTransformation
