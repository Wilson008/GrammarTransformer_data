/**
 */
package QVTOperational;

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
 *   <li>{@link QVTOperational.ComplexType#getComplex_type_key <em>Complex type key</em>}</li>
 *   <li>{@link QVTOperational.ComplexType#getCollection_key <em>Collection key</em>}</li>
 *   <li>{@link QVTOperational.ComplexType#getTypespec <em>Typespec</em>}</li>
 *   <li>{@link QVTOperational.ComplexType#getDeclarator_list <em>Declarator list</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends EObject {
	/**
	 * Returns the value of the '<em><b>Complex type key</b></em>' attribute.
	 * The literals are from the enumeration {@link QVTOperational.ComplexTypeKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex type key</em>' attribute.
	 * @see QVTOperational.ComplexTypeKey
	 * @see #setComplex_type_key(ComplexTypeKey)
	 * @see QVTOperational.QVTOperationalPackage#getComplexType_Complex_type_key()
	 * @model
	 * @generated
	 */
	ComplexTypeKey getComplex_type_key();

	/**
	 * Sets the value of the '{@link QVTOperational.ComplexType#getComplex_type_key <em>Complex type key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex type key</em>' attribute.
	 * @see QVTOperational.ComplexTypeKey
	 * @see #getComplex_type_key()
	 * @generated
	 */
	void setComplex_type_key(ComplexTypeKey value);

	/**
	 * Returns the value of the '<em><b>Collection key</b></em>' attribute.
	 * The literals are from the enumeration {@link QVTOperational.CollectionKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection key</em>' attribute.
	 * @see QVTOperational.CollectionKey
	 * @see #setCollection_key(CollectionKey)
	 * @see QVTOperational.QVTOperationalPackage#getComplexType_Collection_key()
	 * @model
	 * @generated
	 */
	CollectionKey getCollection_key();

	/**
	 * Sets the value of the '{@link QVTOperational.ComplexType#getCollection_key <em>Collection key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection key</em>' attribute.
	 * @see QVTOperational.CollectionKey
	 * @see #getCollection_key()
	 * @generated
	 */
	void setCollection_key(CollectionKey value);

	/**
	 * Returns the value of the '<em><b>Typespec</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.TypeSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typespec</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getComplexType_Typespec()
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
	 * @see QVTOperational.QVTOperationalPackage#getComplexType_Declarator_list()
	 * @model containment="true"
	 * @generated
	 */
	DeclaratorList getDeclarator_list();

	/**
	 * Sets the value of the '{@link QVTOperational.ComplexType#getDeclarator_list <em>Declarator list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarator list</em>' containment reference.
	 * @see #getDeclarator_list()
	 * @generated
	 */
	void setDeclarator_list(DeclaratorList value);

} // ComplexType
