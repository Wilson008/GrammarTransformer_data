/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Ref GO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ModuleRefGO#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link QVTOperational.ModuleRefGO#getSimple_signature <em>Simple signature</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getModuleRefGO()
 * @model
 * @generated
 */
public interface ModuleRefGO extends EObject {
	/**
	 * Returns the value of the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #setScoped_identifier(ScopedIdentifier)
	 * @see QVTOperational.QVTOperationalPackage#getModuleRefGO_Scoped_identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScopedIdentifier getScoped_identifier();

	/**
	 * Sets the value of the '{@link QVTOperational.ModuleRefGO#getScoped_identifier <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #getScoped_identifier()
	 * @generated
	 */
	void setScoped_identifier(ScopedIdentifier value);

	/**
	 * Returns the value of the '<em><b>Simple signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple signature</em>' containment reference.
	 * @see #setSimple_signature(SimpleSignature)
	 * @see QVTOperational.QVTOperationalPackage#getModuleRefGO_Simple_signature()
	 * @model containment="true"
	 * @generated
	 */
	SimpleSignature getSimple_signature();

	/**
	 * Sets the value of the '{@link QVTOperational.ModuleRefGO#getSimple_signature <em>Simple signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple signature</em>' containment reference.
	 * @see #getSimple_signature()
	 * @generated
	 */
	void setSimple_signature(SimpleSignature value);

} // ModuleRefGO
