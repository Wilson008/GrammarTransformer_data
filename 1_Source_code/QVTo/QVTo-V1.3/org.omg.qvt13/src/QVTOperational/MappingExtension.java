/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.MappingExtension#getMapping_extension_key <em>Mapping extension key</em>}</li>
 *   <li>{@link QVTOperational.MappingExtension#getScoped_identifier_list <em>Scoped identifier list</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getMappingExtension()
 * @model
 * @generated
 */
public interface MappingExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping extension key</b></em>' attribute.
	 * The literals are from the enumeration {@link QVTOperational.MappingExtensionKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping extension key</em>' attribute.
	 * @see QVTOperational.MappingExtensionKey
	 * @see #setMapping_extension_key(MappingExtensionKey)
	 * @see QVTOperational.QVTOperationalPackage#getMappingExtension_Mapping_extension_key()
	 * @model required="true"
	 * @generated
	 */
	MappingExtensionKey getMapping_extension_key();

	/**
	 * Sets the value of the '{@link QVTOperational.MappingExtension#getMapping_extension_key <em>Mapping extension key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping extension key</em>' attribute.
	 * @see QVTOperational.MappingExtensionKey
	 * @see #getMapping_extension_key()
	 * @generated
	 */
	void setMapping_extension_key(MappingExtensionKey value);

	/**
	 * Returns the value of the '<em><b>Scoped identifier list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier list</em>' containment reference.
	 * @see #setScoped_identifier_list(ScopedIdentifierList)
	 * @see QVTOperational.QVTOperationalPackage#getMappingExtension_Scoped_identifier_list()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScopedIdentifierList getScoped_identifier_list();

	/**
	 * Sets the value of the '{@link QVTOperational.MappingExtension#getScoped_identifier_list <em>Scoped identifier list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped identifier list</em>' containment reference.
	 * @see #getScoped_identifier_list()
	 * @generated
	 */
	void setScoped_identifier_list(ScopedIdentifierList value);

} // MappingExtension
