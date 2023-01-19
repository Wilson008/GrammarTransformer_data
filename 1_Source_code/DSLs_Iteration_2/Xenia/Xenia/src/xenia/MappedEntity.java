/**
 */
package xenia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xenia.MappedEntity#getInfoProps <em>Info Props</em>}</li>
 *   <li>{@link xenia.MappedEntity#getLinkedProps <em>Linked Props</em>}</li>
 * </ul>
 *
 * @see xenia.XeniaPackage#getMappedEntity()
 * @model
 * @generated
 */
public interface MappedEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Info Props</b></em>' containment reference list.
	 * The list contents are of type {@link xenia.InfoProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Props</em>' containment reference list.
	 * @see xenia.XeniaPackage#getMappedEntity_InfoProps()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfoProperty> getInfoProps();

	/**
	 * Returns the value of the '<em><b>Linked Props</b></em>' containment reference list.
	 * The list contents are of type {@link xenia.LinkedProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Props</em>' containment reference list.
	 * @see xenia.XeniaPackage#getMappedEntity_LinkedProps()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkedProperty> getLinkedProps();

} // MappedEntity
