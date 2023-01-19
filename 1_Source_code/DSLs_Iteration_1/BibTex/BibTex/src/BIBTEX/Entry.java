/**
 */
package BIBTEX;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BIBTEX.Entry#getKey <em>Key</em>}</li>
 *   <li>{@link BIBTEX.Entry#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see BIBTEX.BIBTEXPackage#getEntry()
 * @model abstract="true"
 * @generated
 */
public interface Entry extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see BIBTEX.BIBTEXPackage#getEntry_Key()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link BIBTEX.Entry#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link BIBTEX.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see BIBTEX.BIBTEXPackage#getEntry_Fields()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Field> getFields();

} // Entry
