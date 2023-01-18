/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.EntryHeader#getSimple_signature <em>Simple signature</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getEntryHeader()
 * @model
 * @generated
 */
public interface EntryHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple signature</em>' containment reference.
	 * @see #setSimple_signature(SimpleSignature)
	 * @see QVTOperational.QVTOperationalPackage#getEntryHeader_Simple_signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleSignature getSimple_signature();

	/**
	 * Sets the value of the '{@link QVTOperational.EntryHeader#getSimple_signature <em>Simple signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple signature</em>' containment reference.
	 * @see #getSimple_signature()
	 * @generated
	 */
	void setSimple_signature(SimpleSignature value);

} // EntryHeader
