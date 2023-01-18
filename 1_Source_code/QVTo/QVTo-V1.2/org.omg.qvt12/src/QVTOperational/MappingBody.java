/**
 */
package QVTOperational;

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
 *   <li>{@link QVTOperational.MappingBody#getEndSection <em>End Section</em>}</li>
 *   <li>{@link QVTOperational.MappingBody#getInitSection <em>Init Section</em>}</li>
 *   <li>{@link QVTOperational.MappingBody#getPopulation_section <em>Population section</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getMappingBody()
 * @model
 * @generated
 */
public interface MappingBody extends OperationBody {
	/**
	 * Returns the value of the '<em><b>End Section</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Section</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getMappingBody_EndSection()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='endOwner'"
	 * @generated
	 */
	EList<ExpressionGO> getEndSection();

	/**
	 * Returns the value of the '<em><b>Init Section</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Section</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getMappingBody_InitSection()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='initOwner'"
	 * @generated
	 */
	EList<ExpressionGO> getInitSection();

	/**
	 * Returns the value of the '<em><b>Population section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population section</em>' containment reference.
	 * @see #setPopulation_section(PopulationSection)
	 * @see QVTOperational.QVTOperationalPackage#getMappingBody_Population_section()
	 * @model containment="true"
	 * @generated
	 */
	PopulationSection getPopulation_section();

	/**
	 * Sets the value of the '{@link QVTOperational.MappingBody#getPopulation_section <em>Population section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population section</em>' containment reference.
	 * @see #getPopulation_section()
	 * @generated
	 */
	void setPopulation_section(PopulationSection value);

} // MappingBody
