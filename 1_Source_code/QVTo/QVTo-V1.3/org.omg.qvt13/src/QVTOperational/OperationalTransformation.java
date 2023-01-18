/**
 */
package QVTOperational;

import EMOF.Property;
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
 *   <li>{@link QVTOperational.OperationalTransformation#getIntermediateClass <em>Intermediate Class</em>}</li>
 *   <li>{@link QVTOperational.OperationalTransformation#getIntermediateProperty <em>Intermediate Property</em>}</li>
 *   <li>{@link QVTOperational.OperationalTransformation#getModelParameter <em>Model Parameter</em>}</li>
 *   <li>{@link QVTOperational.OperationalTransformation#getRefined <em>Refined</em>}</li>
 *   <li>{@link QVTOperational.OperationalTransformation#getRelation <em>Relation</em>}</li>
 *   <li>{@link QVTOperational.OperationalTransformation#getTransformation_h <em>Transformation h</em>}</li>
 *   <li>{@link QVTOperational.OperationalTransformation#getModule_element <em>Module element</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getOperationalTransformation()
 * @model
 * @generated
 */
public interface OperationalTransformation extends QVTOperational.Module {
	/**
	 * Returns the value of the '<em><b>Intermediate Class</b></em>' reference list.
	 * The list contents are of type {@link EMOF.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Class</em>' reference list.
	 * @see QVTOperational.QVTOperationalPackage#getOperationalTransformation_IntermediateClass()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transfClient'"
	 * @generated
	 */
	EList<EMOF.Class> getIntermediateClass();

	/**
	 * Returns the value of the '<em><b>Intermediate Property</b></em>' reference list.
	 * The list contents are of type {@link EMOF.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Property</em>' reference list.
	 * @see QVTOperational.QVTOperationalPackage#getOperationalTransformation_IntermediateProperty()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transfClient'"
	 * @generated
	 */
	EList<Property> getIntermediateProperty();

	/**
	 * Returns the value of the '<em><b>Model Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ModelParameter}.
	 * It is bidirectional and its opposite is '{@link QVTOperational.ModelParameter#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Parameter</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getOperationalTransformation_ModelParameter()
	 * @see QVTOperational.ModelParameter#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<ModelParameter> getModelParameter();

	/**
	 * Returns the value of the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined</em>' reference.
	 * @see #setRefined(ExpressionGO)
	 * @see QVTOperational.QVTOperationalPackage#getOperationalTransformation_Refined()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='refinement'"
	 * @generated
	 */
	ExpressionGO getRefined();

	/**
	 * Sets the value of the '{@link QVTOperational.OperationalTransformation#getRefined <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined</em>' reference.
	 * @see #getRefined()
	 * @generated
	 */
	void setRefined(ExpressionGO value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getOperationalTransformation_Relation()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owner'"
	 * @generated
	 */
	EList<ExpressionGO> getRelation();

	/**
	 * Returns the value of the '<em><b>Transformation h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation h</em>' containment reference.
	 * @see #setTransformation_h(TransformationHeader)
	 * @see QVTOperational.QVTOperationalPackage#getOperationalTransformation_Transformation_h()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TransformationHeader getTransformation_h();

	/**
	 * Sets the value of the '{@link QVTOperational.OperationalTransformation#getTransformation_h <em>Transformation h</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation h</em>' containment reference.
	 * @see #getTransformation_h()
	 * @generated
	 */
	void setTransformation_h(TransformationHeader value);

	/**
	 * Returns the value of the '<em><b>Module element</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ImperativeOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module element</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getOperationalTransformation_Module_element()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImperativeOperation> getModule_element();

} // OperationalTransformation
