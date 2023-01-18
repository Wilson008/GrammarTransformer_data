/**
 */
package qvtoperational;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Model GO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.MetaModelGO#getMetamodel_h <em>Metamodel h</em>}</li>
 *   <li>{@link qvtoperational.MetaModelGO#getMetamodel_element <em>Metamodel element</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getMetaModelGO()
 * @model
 * @generated
 */
public interface MetaModelGO extends qvtoperational.Module {
	/**
	 * Returns the value of the '<em><b>Metamodel h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel h</em>' containment reference.
	 * @see #setMetamodel_h(MetaModelHeader)
	 * @see qvtoperational.QvtoperationalPackage#getMetaModelGO_Metamodel_h()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MetaModelHeader getMetamodel_h();

	/**
	 * Sets the value of the '{@link qvtoperational.MetaModelGO#getMetamodel_h <em>Metamodel h</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel h</em>' containment reference.
	 * @see #getMetamodel_h()
	 * @generated
	 */
	void setMetamodel_h(MetaModelHeader value);

	/**
	 * Returns the value of the '<em><b>Metamodel element</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.MetaModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel element</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getMetaModelGO_Metamodel_element()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaModelElement> getMetamodel_element();

} // MetaModelGO
