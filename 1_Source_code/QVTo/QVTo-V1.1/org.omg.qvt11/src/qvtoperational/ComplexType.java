/**
 */
package qvtoperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ComplexType#getComplex_type_key <em>Complex type key</em>}</li>
 *   <li>{@link qvtoperational.ComplexType#getCollection_key <em>Collection key</em>}</li>
 *   <li>{@link qvtoperational.ComplexType#getTypespec <em>Typespec</em>}</li>
 *   <li>{@link qvtoperational.ComplexType#getDeclarator_list <em>Declarator list</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends EObject {
	/**
	 * Returns the value of the '<em><b>Complex type key</b></em>' attribute.
	 * The literals are from the enumeration {@link qvtoperational.ComplexTypeKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex type key</em>' attribute.
	 * @see qvtoperational.ComplexTypeKey
	 * @see #setComplex_type_key(ComplexTypeKey)
	 * @see qvtoperational.QvtoperationalPackage#getComplexType_Complex_type_key()
	 * @model
	 * @generated
	 */
	ComplexTypeKey getComplex_type_key();

	/**
	 * Sets the value of the '{@link qvtoperational.ComplexType#getComplex_type_key <em>Complex type key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex type key</em>' attribute.
	 * @see qvtoperational.ComplexTypeKey
	 * @see #getComplex_type_key()
	 * @generated
	 */
	void setComplex_type_key(ComplexTypeKey value);

	/**
	 * Returns the value of the '<em><b>Collection key</b></em>' attribute.
	 * The literals are from the enumeration {@link qvtoperational.CollectionKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection key</em>' attribute.
	 * @see qvtoperational.CollectionKey
	 * @see #setCollection_key(CollectionKey)
	 * @see qvtoperational.QvtoperationalPackage#getComplexType_Collection_key()
	 * @model
	 * @generated
	 */
	CollectionKey getCollection_key();

	/**
	 * Sets the value of the '{@link qvtoperational.ComplexType#getCollection_key <em>Collection key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection key</em>' attribute.
	 * @see qvtoperational.CollectionKey
	 * @see #getCollection_key()
	 * @generated
	 */
	void setCollection_key(CollectionKey value);

	/**
	 * Returns the value of the '<em><b>Typespec</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.TypeSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typespec</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getComplexType_Typespec()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<TypeSpec> getTypespec();

	/**
	 * Returns the value of the '<em><b>Declarator list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarator list</em>' containment reference.
	 * @see #setDeclarator_list(DeclaratorList)
	 * @see qvtoperational.QvtoperationalPackage#getComplexType_Declarator_list()
	 * @model containment="true"
	 * @generated
	 */
	DeclaratorList getDeclarator_list();

	/**
	 * Sets the value of the '{@link qvtoperational.ComplexType#getDeclarator_list <em>Declarator list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarator list</em>' containment reference.
	 * @see #getDeclarator_list()
	 * @generated
	 */
	void setDeclarator_list(DeclaratorList value);

} // ComplexType
