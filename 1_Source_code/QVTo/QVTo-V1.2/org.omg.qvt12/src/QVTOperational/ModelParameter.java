/**
 */
package QVTOperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ModelParameter#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getModelParameter()
 * @model
 * @generated
 */
public interface ModelParameter extends VarParameter {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QVTOperational.OperationalTransformation#getModelParameter <em>Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(OperationalTransformation)
	 * @see QVTOperational.QVTOperationalPackage#getModelParameter_Module()
	 * @see QVTOperational.OperationalTransformation#getModelParameter
	 * @model opposite="modelParameter" required="true" transient="false"
	 * @generated
	 */
	OperationalTransformation getModule();

	/**
	 * Sets the value of the '{@link QVTOperational.ModelParameter#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(OperationalTransformation value);

} // ModelParameter
