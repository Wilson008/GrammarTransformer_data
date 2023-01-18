/**
 */
package EssentialOCL;

import EMOF.DataType;
import EMOF.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.CollectionType#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends DataType {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(Type)
	 * @see EssentialOCL.EssentialOCLPackage#getCollectionType_ElementType()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='collectionType'"
	 * @generated
	 */
	Type getElementType();

	/**
	 * Sets the value of the '{@link EssentialOCL.CollectionType#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Type value);

} // CollectionType
