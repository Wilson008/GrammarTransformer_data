/**
 */
package QVTRelation;

import EssentialOCL.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTRelation.RelationCallExp#getArgument <em>Argument</em>}</li>
 *   <li>{@link QVTRelation.RelationCallExp#getReferredRelation <em>Referred Relation</em>}</li>
 * </ul>
 *
 * @see QVTRelation.QVTRelationPackage#getRelationCallExp()
 * @model
 * @generated
 */
public interface RelationCallExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link EssentialOCL.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see QVTRelation.QVTRelationPackage#getRelationCallExp_Argument()
	 * @model containment="true" lower="2"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='relationCallExp'"
	 * @generated
	 */
	EList<OclExpression> getArgument();

	/**
	 * Returns the value of the '<em><b>Referred Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Relation</em>' reference.
	 * @see #setReferredRelation(Relation)
	 * @see QVTRelation.QVTRelationPackage#getRelationCallExp_ReferredRelation()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='relationCallExp'"
	 * @generated
	 */
	Relation getReferredRelation();

	/**
	 * Sets the value of the '{@link QVTRelation.RelationCallExp#getReferredRelation <em>Referred Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Relation</em>' reference.
	 * @see #getReferredRelation()
	 * @generated
	 */
	void setReferredRelation(Relation value);

} // RelationCallExp
