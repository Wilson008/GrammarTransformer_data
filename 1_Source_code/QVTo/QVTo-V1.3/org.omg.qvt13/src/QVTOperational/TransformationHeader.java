/**
 */
package QVTOperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.TransformationHeader#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link QVTOperational.TransformationHeader#getName <em>Name</em>}</li>
 *   <li>{@link QVTOperational.TransformationHeader#getTransformation_signature <em>Transformation signature</em>}</li>
 *   <li>{@link QVTOperational.TransformationHeader#getTransformation_usage_refine <em>Transformation usage refine</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getTransformationHeader()
 * @model
 * @generated
 */
public interface TransformationHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link QVTOperational.GeneralQualifier}.
	 * The literals are from the enumeration {@link QVTOperational.GeneralQualifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute list.
	 * @see QVTOperational.GeneralQualifier
	 * @see QVTOperational.QVTOperationalPackage#getTransformationHeader_Qualifier()
	 * @model
	 * @generated
	 */
	EList<GeneralQualifier> getQualifier();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QVTOperational.QVTOperationalPackage#getTransformationHeader_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QVTOperational.TransformationHeader#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transformation signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation signature</em>' containment reference.
	 * @see #setTransformation_signature(SimpleSignature)
	 * @see QVTOperational.QVTOperationalPackage#getTransformationHeader_Transformation_signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleSignature getTransformation_signature();

	/**
	 * Sets the value of the '{@link QVTOperational.TransformationHeader#getTransformation_signature <em>Transformation signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation signature</em>' containment reference.
	 * @see #getTransformation_signature()
	 * @generated
	 */
	void setTransformation_signature(SimpleSignature value);

	/**
	 * Returns the value of the '<em><b>Transformation usage refine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation usage refine</em>' containment reference.
	 * @see #setTransformation_usage_refine(TransformationUsageRefine)
	 * @see QVTOperational.QVTOperationalPackage#getTransformationHeader_Transformation_usage_refine()
	 * @model containment="true"
	 * @generated
	 */
	TransformationUsageRefine getTransformation_usage_refine();

	/**
	 * Sets the value of the '{@link QVTOperational.TransformationHeader#getTransformation_usage_refine <em>Transformation usage refine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation usage refine</em>' containment reference.
	 * @see #getTransformation_usage_refine()
	 * @generated
	 */
	void setTransformation_usage_refine(TransformationUsageRefine value);

} // TransformationHeader
