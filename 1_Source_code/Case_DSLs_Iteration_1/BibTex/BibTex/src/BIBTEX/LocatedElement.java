/**
 */
package BIBTEX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Located Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BIBTEX.LocatedElement#getLocation <em>Location</em>}</li>
 *   <li>{@link BIBTEX.LocatedElement#getCommentsBefore <em>Comments Before</em>}</li>
 *   <li>{@link BIBTEX.LocatedElement#getCommentsAfter <em>Comments After</em>}</li>
 * </ul>
 *
 * @see BIBTEX.BIBTEXPackage#getLocatedElement()
 * @model abstract="true"
 * @generated
 */
public interface LocatedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see BIBTEX.BIBTEXPackage#getLocatedElement_Location()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link BIBTEX.LocatedElement#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Comments Before</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments Before</em>' attribute list.
	 * @see BIBTEX.BIBTEXPackage#getLocatedElement_CommentsBefore()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCommentsBefore();

	/**
	 * Returns the value of the '<em><b>Comments After</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments After</em>' attribute list.
	 * @see BIBTEX.BIBTEXPackage#getLocatedElement_CommentsAfter()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCommentsAfter();

} // LocatedElement
