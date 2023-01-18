/**
 */
package ImperativeOCL;

import EMOF.Type;

import EssentialOCL.CollectionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.DictionaryType#getKeyType <em>Key Type</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getDictionaryType()
 * @model
 * @generated
 */
public interface DictionaryType extends CollectionType {
	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' reference.
	 * @see #setKeyType(Type)
	 * @see ImperativeOCL.ImperativeOCLPackage#getDictionaryType_KeyType()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='keyDict'"
	 * @generated
	 */
	Type getKeyType();

	/**
	 * Sets the value of the '{@link ImperativeOCL.DictionaryType#getKeyType <em>Key Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' reference.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(Type value);

} // DictionaryType
