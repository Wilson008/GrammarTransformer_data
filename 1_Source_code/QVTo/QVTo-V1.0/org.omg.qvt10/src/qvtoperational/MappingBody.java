/**
 */
package qvtoperational;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.MappingBody#getInitSection <em>Init Section</em>}</li>
 *   <li>{@link qvtoperational.MappingBody#getEndSection <em>End Section</em>}</li>
 *   <li>{@link qvtoperational.MappingBody#getPopulation_section <em>Population section</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getMappingBody()
 * @model
 * @generated
 */
public interface MappingBody extends OperationBody {
	/**
	 * Returns the value of the '<em><b>Init Section</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Section</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getMappingBody_InitSection()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionGO> getInitSection();

	/**
	 * Returns the value of the '<em><b>End Section</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Section</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getMappingBody_EndSection()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionGO> getEndSection();

	/**
	 * Returns the value of the '<em><b>Population section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population section</em>' containment reference.
	 * @see #setPopulation_section(PopulationSection)
	 * @see qvtoperational.QvtoperationalPackage#getMappingBody_Population_section()
	 * @model containment="true"
	 * @generated
	 */
	PopulationSection getPopulation_section();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingBody#getPopulation_section <em>Population section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population section</em>' containment reference.
	 * @see #getPopulation_section()
	 * @generated
	 */
	void setPopulation_section(PopulationSection value);

} // MappingBody
