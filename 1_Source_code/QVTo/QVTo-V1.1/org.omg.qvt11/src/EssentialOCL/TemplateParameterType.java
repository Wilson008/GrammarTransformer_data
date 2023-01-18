/**
 */
package EssentialOCL;

import EMOF.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.TemplateParameterType#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getTemplateParameterType()
 * @model
 * @generated
 */
public interface TemplateParameterType extends Type {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see EssentialOCL.EssentialOCLPackage#getTemplateParameterType_Specification()
	 * @model dataType="PrimitiveTypes.String"
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link EssentialOCL.TemplateParameterType#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

} // TemplateParameterType
