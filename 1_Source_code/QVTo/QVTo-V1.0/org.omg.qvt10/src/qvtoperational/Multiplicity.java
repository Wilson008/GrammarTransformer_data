/**
 */
package qvtoperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.Multiplicity#getMultiplicity_range <em>Multiplicity range</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicity range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity range</em>' attribute.
	 * @see #setMultiplicity_range(String)
	 * @see qvtoperational.QvtoperationalPackage#getMultiplicity_Multiplicity_range()
	 * @model required="true"
	 * @generated
	 */
	String getMultiplicity_range();

	/**
	 * Sets the value of the '{@link qvtoperational.Multiplicity#getMultiplicity_range <em>Multiplicity range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity range</em>' attribute.
	 * @see #getMultiplicity_range()
	 * @generated
	 */
	void setMultiplicity_range(String value);

} // Multiplicity
