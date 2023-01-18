/**
 */
package QVTRelation;

import EMOF.Element;

import EssentialOCL.OclExpression;
import EssentialOCL.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Domain Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTRelation.RelationDomainAssignment#getOwner <em>Owner</em>}</li>
 *   <li>{@link QVTRelation.RelationDomainAssignment#getValueExp <em>Value Exp</em>}</li>
 *   <li>{@link QVTRelation.RelationDomainAssignment#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see QVTRelation.QVTRelationPackage#getRelationDomainAssignment()
 * @model
 * @generated
 */
public interface RelationDomainAssignment extends Element {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QVTRelation.RelationDomain#getDefaultAssignment <em>Default Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(RelationDomain)
	 * @see QVTRelation.QVTRelationPackage#getRelationDomainAssignment_Owner()
	 * @see QVTRelation.RelationDomain#getDefaultAssignment
	 * @model opposite="defaultAssignment" required="true" transient="false"
	 * @generated
	 */
	RelationDomain getOwner();

	/**
	 * Sets the value of the '{@link QVTRelation.RelationDomainAssignment#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(RelationDomain value);

	/**
	 * Returns the value of the '<em><b>Value Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Exp</em>' containment reference.
	 * @see #setValueExp(OclExpression)
	 * @see QVTRelation.QVTRelationPackage#getRelationDomainAssignment_ValueExp()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='domainAssignment'"
	 * @generated
	 */
	OclExpression getValueExp();

	/**
	 * Sets the value of the '{@link QVTRelation.RelationDomainAssignment#getValueExp <em>Value Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Exp</em>' containment reference.
	 * @see #getValueExp()
	 * @generated
	 */
	void setValueExp(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see QVTRelation.QVTRelationPackage#getRelationDomainAssignment_Variable()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='domainAssignment'"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link QVTRelation.RelationDomainAssignment#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // RelationDomainAssignment
