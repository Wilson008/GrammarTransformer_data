/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.ForStat#getIterator <em>Iterator</em>}</li>
 *   <li>{@link ATLnoOCL.ForStat#getCollection <em>Collection</em>}</li>
 *   <li>{@link ATLnoOCL.ForStat#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getForStat()
 * @model
 * @generated
 */
public interface ForStat extends Statement {
	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' containment reference.
	 * @see #setIterator(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getForStat_Iterator()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLDummy getIterator();

	/**
	 * Sets the value of the '{@link ATLnoOCL.ForStat#getIterator <em>Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' containment reference.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getForStat_Collection()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLDummy getCollection();

	/**
	 * Sets the value of the '{@link ATLnoOCL.ForStat#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(OCLDummy value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getForStat_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // ForStat
