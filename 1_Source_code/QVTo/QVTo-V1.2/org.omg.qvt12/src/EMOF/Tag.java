/**
 */
package EMOF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EMOF.Tag#getElement <em>Element</em>}</li>
 *   <li>{@link EMOF.Tag#getName <em>Name</em>}</li>
 *   <li>{@link EMOF.Tag#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see EMOF.EMOFPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Element {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link EMOF.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference list.
	 * @see EMOF.EMOFPackage#getTag_Element()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='tag'"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see EMOF.EMOFPackage#getTag_Name()
	 * @model dataType="PrimitiveTypes.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link EMOF.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see EMOF.EMOFPackage#getTag_Value()
	 * @model dataType="PrimitiveTypes.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link EMOF.Tag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Tag
