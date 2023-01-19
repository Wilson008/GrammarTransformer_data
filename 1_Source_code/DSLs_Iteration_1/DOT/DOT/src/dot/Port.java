/**
 */
package dot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dot.Port#getCompass_pt <em>Compass pt</em>}</li>
 *   <li>{@link dot.Port#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dot.DotPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Compass pt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compass pt</em>' attribute.
	 * @see #setCompass_pt(String)
	 * @see dot.DotPackage#getPort_Compass_pt()
	 * @model
	 * @generated
	 */
	String getCompass_pt();

	/**
	 * Sets the value of the '{@link dot.Port#getCompass_pt <em>Compass pt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compass pt</em>' attribute.
	 * @see #getCompass_pt()
	 * @generated
	 */
	void setCompass_pt(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dot.DotPackage#getPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dot.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Port
