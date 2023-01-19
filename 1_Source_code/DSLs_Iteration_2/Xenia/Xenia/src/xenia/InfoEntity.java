/**
 */
package xenia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xenia.InfoEntity#getEntries <em>Entries</em>}</li>
 *   <li>{@link xenia.InfoEntity#getInfoValue <em>Info Value</em>}</li>
 * </ul>
 *
 * @see xenia.XeniaPackage#getInfoEntity()
 * @model
 * @generated
 */
public interface InfoEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' attribute list.
	 * The list contents are of type {@link xenia.InfoEntry}.
	 * The literals are from the enumeration {@link xenia.InfoEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' attribute list.
	 * @see xenia.InfoEntry
	 * @see xenia.XeniaPackage#getInfoEntity_Entries()
	 * @model unique="false"
	 * @generated
	 */
	EList<InfoEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Info Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Value</em>' attribute.
	 * @see #setInfoValue(String)
	 * @see xenia.XeniaPackage#getInfoEntity_InfoValue()
	 * @model
	 * @generated
	 */
	String getInfoValue();

	/**
	 * Sets the value of the '{@link xenia.InfoEntity#getInfoValue <em>Info Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Value</em>' attribute.
	 * @see #getInfoValue()
	 * @generated
	 */
	void setInfoValue(String value);

} // InfoEntity
