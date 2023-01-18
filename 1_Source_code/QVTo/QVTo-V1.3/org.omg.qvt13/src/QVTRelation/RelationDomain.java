/**
 */
package QVTRelation;

import EssentialOCL.Variable;

import QVTBase.Domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTRelation.RelationDomain#getDefaultAssignment <em>Default Assignment</em>}</li>
 *   <li>{@link QVTRelation.RelationDomain#getPattern <em>Pattern</em>}</li>
 *   <li>{@link QVTRelation.RelationDomain#getRootVariable <em>Root Variable</em>}</li>
 * </ul>
 *
 * @see QVTRelation.QVTRelationPackage#getRelationDomain()
 * @model
 * @generated
 */
public interface RelationDomain extends Domain {
	/**
	 * Returns the value of the '<em><b>Default Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link QVTRelation.RelationDomainAssignment}.
	 * It is bidirectional and its opposite is '{@link QVTRelation.RelationDomainAssignment#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Assignment</em>' containment reference list.
	 * @see QVTRelation.QVTRelationPackage#getRelationDomain_DefaultAssignment()
	 * @see QVTRelation.RelationDomainAssignment#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<RelationDomainAssignment> getDefaultAssignment();

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link QVTRelation.DomainPattern}.
	 * It is bidirectional and its opposite is '{@link QVTRelation.DomainPattern#getRelationDomain <em>Relation Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference list.
	 * @see QVTRelation.QVTRelationPackage#getRelationDomain_Pattern()
	 * @see QVTRelation.DomainPattern#getRelationDomain
	 * @model opposite="relationDomain" containment="true"
	 * @generated
	 */
	EList<DomainPattern> getPattern();

	/**
	 * Returns the value of the '<em><b>Root Variable</b></em>' reference list.
	 * The list contents are of type {@link EssentialOCL.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Variable</em>' reference list.
	 * @see QVTRelation.QVTRelationPackage#getRelationDomain_RootVariable()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='relationDomain'"
	 * @generated
	 */
	EList<Variable> getRootVariable();

} // RelationDomain
