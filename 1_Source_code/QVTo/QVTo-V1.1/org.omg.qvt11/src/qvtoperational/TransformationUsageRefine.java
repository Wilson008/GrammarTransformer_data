/**
 */
package qvtoperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Usage Refine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.TransformationUsageRefine#getModule_usage <em>Module usage</em>}</li>
 *   <li>{@link qvtoperational.TransformationUsageRefine#getTransformation_refine <em>Transformation refine</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getTransformationUsageRefine()
 * @model
 * @generated
 */
public interface TransformationUsageRefine extends EObject {
	/**
	 * Returns the value of the '<em><b>Module usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module usage</em>' containment reference.
	 * @see #setModule_usage(ModuleUsageGO)
	 * @see qvtoperational.QvtoperationalPackage#getTransformationUsageRefine_Module_usage()
	 * @model containment="true"
	 * @generated
	 */
	ModuleUsageGO getModule_usage();

	/**
	 * Sets the value of the '{@link qvtoperational.TransformationUsageRefine#getModule_usage <em>Module usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module usage</em>' containment reference.
	 * @see #getModule_usage()
	 * @generated
	 */
	void setModule_usage(ModuleUsageGO value);

	/**
	 * Returns the value of the '<em><b>Transformation refine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation refine</em>' containment reference.
	 * @see #setTransformation_refine(ModuleRefGO)
	 * @see qvtoperational.QvtoperationalPackage#getTransformationUsageRefine_Transformation_refine()
	 * @model containment="true"
	 * @generated
	 */
	ModuleRefGO getTransformation_refine();

	/**
	 * Sets the value of the '{@link qvtoperational.TransformationUsageRefine#getTransformation_refine <em>Transformation refine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation refine</em>' containment reference.
	 * @see #getTransformation_refine()
	 * @generated
	 */
	void setTransformation_refine(ModuleRefGO value);

} // TransformationUsageRefine
