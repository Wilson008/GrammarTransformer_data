/**
 */
package QVTRelation;

import QVTBase.Pattern;

import QVTTemplate.TemplateExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTRelation.DomainPattern#getRelationDomain <em>Relation Domain</em>}</li>
 *   <li>{@link QVTRelation.DomainPattern#getTemplateExpression <em>Template Expression</em>}</li>
 * </ul>
 *
 * @see QVTRelation.QVTRelationPackage#getDomainPattern()
 * @model
 * @generated
 */
public interface DomainPattern extends Pattern {
	/**
	 * Returns the value of the '<em><b>Relation Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QVTRelation.RelationDomain#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Domain</em>' container reference.
	 * @see #setRelationDomain(RelationDomain)
	 * @see QVTRelation.QVTRelationPackage#getDomainPattern_RelationDomain()
	 * @see QVTRelation.RelationDomain#getPattern
	 * @model opposite="pattern" required="true" transient="false"
	 * @generated
	 */
	RelationDomain getRelationDomain();

	/**
	 * Sets the value of the '{@link QVTRelation.DomainPattern#getRelationDomain <em>Relation Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Domain</em>' container reference.
	 * @see #getRelationDomain()
	 * @generated
	 */
	void setRelationDomain(RelationDomain value);

	/**
	 * Returns the value of the '<em><b>Template Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Expression</em>' containment reference.
	 * @see #setTemplateExpression(TemplateExp)
	 * @see QVTRelation.QVTRelationPackage#getDomainPattern_TemplateExpression()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='domainPattern'"
	 * @generated
	 */
	TemplateExp getTemplateExpression();

	/**
	 * Sets the value of the '{@link QVTRelation.DomainPattern#getTemplateExpression <em>Template Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Expression</em>' containment reference.
	 * @see #getTemplateExpression()
	 * @generated
	 */
	void setTemplateExpression(TemplateExp value);

} // DomainPattern
