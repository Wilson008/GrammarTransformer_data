/**
 */
package qvtoperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.MappingHeader#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link qvtoperational.MappingHeader#getParam_direction <em>Param direction</em>}</li>
 *   <li>{@link qvtoperational.MappingHeader#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link qvtoperational.MappingHeader#getComplete_signature <em>Complete signature</em>}</li>
 *   <li>{@link qvtoperational.MappingHeader#getMapping_extra <em>Mapping extra</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getMappingHeader()
 * @model
 * @generated
 */
public interface MappingHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link qvtoperational.GeneralQualifier}.
	 * The literals are from the enumeration {@link qvtoperational.GeneralQualifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute list.
	 * @see qvtoperational.GeneralQualifier
	 * @see qvtoperational.QvtoperationalPackage#getMappingHeader_Qualifier()
	 * @model
	 * @generated
	 */
	EList<GeneralQualifier> getQualifier();

	/**
	 * Returns the value of the '<em><b>Param direction</b></em>' attribute.
	 * The literals are from the enumeration {@link qvtoperational.DirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param direction</em>' attribute.
	 * @see qvtoperational.DirectionKind
	 * @see #setParam_direction(DirectionKind)
	 * @see qvtoperational.QvtoperationalPackage#getMappingHeader_Param_direction()
	 * @model
	 * @generated
	 */
	DirectionKind getParam_direction();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingHeader#getParam_direction <em>Param direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param direction</em>' attribute.
	 * @see qvtoperational.DirectionKind
	 * @see #getParam_direction()
	 * @generated
	 */
	void setParam_direction(DirectionKind value);

	/**
	 * Returns the value of the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #setScoped_identifier(ScopedIdentifier)
	 * @see qvtoperational.QvtoperationalPackage#getMappingHeader_Scoped_identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScopedIdentifier getScoped_identifier();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingHeader#getScoped_identifier <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped identifier</em>' containment reference.
	 * @see #getScoped_identifier()
	 * @generated
	 */
	void setScoped_identifier(ScopedIdentifier value);

	/**
	 * Returns the value of the '<em><b>Complete signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete signature</em>' containment reference.
	 * @see #setComplete_signature(CompleteSignature)
	 * @see qvtoperational.QvtoperationalPackage#getMappingHeader_Complete_signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompleteSignature getComplete_signature();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingHeader#getComplete_signature <em>Complete signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete signature</em>' containment reference.
	 * @see #getComplete_signature()
	 * @generated
	 */
	void setComplete_signature(CompleteSignature value);

	/**
	 * Returns the value of the '<em><b>Mapping extra</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.MappingExtra}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping extra</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getMappingHeader_Mapping_extra()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingExtra> getMapping_extra();

} // MappingHeader
