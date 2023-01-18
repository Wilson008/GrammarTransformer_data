/**
 */
package QVTRelation;

import QVTBase.Transformation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTRelation.RelationalTransformation#getOwnedKey <em>Owned Key</em>}</li>
 * </ul>
 *
 * @see QVTRelation.QVTRelationPackage#getRelationalTransformation()
 * @model
 * @generated
 */
public interface RelationalTransformation extends Transformation {
	/**
	 * Returns the value of the '<em><b>Owned Key</b></em>' containment reference list.
	 * The list contents are of type {@link QVTRelation.Key}.
	 * It is bidirectional and its opposite is '{@link QVTRelation.Key#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Key</em>' containment reference list.
	 * @see QVTRelation.QVTRelationPackage#getRelationalTransformation_OwnedKey()
	 * @see QVTRelation.Key#getTransformation
	 * @model opposite="transformation" containment="true" ordered="false"
	 * @generated
	 */
	EList<Key> getOwnedKey();

} // RelationalTransformation
