/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Extra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.MappingExtra#getMapping_extension <em>Mapping extension</em>}</li>
 *   <li>{@link QVTOperational.MappingExtra#getMapping_refinement <em>Mapping refinement</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getMappingExtra()
 * @model
 * @generated
 */
public interface MappingExtra extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping extension</em>' containment reference.
	 * @see #setMapping_extension(MappingExtension)
	 * @see QVTOperational.QVTOperationalPackage#getMappingExtra_Mapping_extension()
	 * @model containment="true"
	 * @generated
	 */
	MappingExtension getMapping_extension();

	/**
	 * Sets the value of the '{@link QVTOperational.MappingExtra#getMapping_extension <em>Mapping extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping extension</em>' containment reference.
	 * @see #getMapping_extension()
	 * @generated
	 */
	void setMapping_extension(MappingExtension value);

	/**
	 * Returns the value of the '<em><b>Mapping refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping refinement</em>' containment reference.
	 * @see #setMapping_refinement(MappingRefinement)
	 * @see QVTOperational.QVTOperationalPackage#getMappingExtra_Mapping_refinement()
	 * @model containment="true"
	 * @generated
	 */
	MappingRefinement getMapping_refinement();

	/**
	 * Sets the value of the '{@link QVTOperational.MappingExtra#getMapping_refinement <em>Mapping refinement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping refinement</em>' containment reference.
	 * @see #getMapping_refinement()
	 * @generated
	 */
	void setMapping_refinement(MappingRefinement value);

} // MappingExtra
