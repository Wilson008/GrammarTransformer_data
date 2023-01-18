/**
 */
package QVTRelation.impl;

import EssentialOCL.Variable;

import QVTBase.impl.DomainImpl;

import QVTRelation.DomainPattern;
import QVTRelation.QVTRelationPackage;
import QVTRelation.RelationDomain;
import QVTRelation.RelationDomainAssignment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTRelation.impl.RelationDomainImpl#getDefaultAssignment <em>Default Assignment</em>}</li>
 *   <li>{@link QVTRelation.impl.RelationDomainImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link QVTRelation.impl.RelationDomainImpl#getRootVariable <em>Root Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationDomainImpl extends DomainImpl implements RelationDomain {
	/**
	 * The cached value of the '{@link #getDefaultAssignment() <em>Default Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationDomainAssignment> defaultAssignment;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainPattern> pattern;

	/**
	 * The cached value of the '{@link #getRootVariable() <em>Root Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> rootVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTRelationPackage.Literals.RELATION_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationDomainAssignment> getDefaultAssignment() {
		if (defaultAssignment == null) {
			defaultAssignment = new EObjectContainmentWithInverseEList<RelationDomainAssignment>(RelationDomainAssignment.class, this, QVTRelationPackage.RELATION_DOMAIN__DEFAULT_ASSIGNMENT, QVTRelationPackage.RELATION_DOMAIN_ASSIGNMENT__OWNER);
		}
		return defaultAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainPattern> getPattern() {
		if (pattern == null) {
			pattern = new EObjectContainmentWithInverseEList<DomainPattern>(DomainPattern.class, this, QVTRelationPackage.RELATION_DOMAIN__PATTERN, QVTRelationPackage.DOMAIN_PATTERN__RELATION_DOMAIN);
		}
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getRootVariable() {
		if (rootVariable == null) {
			rootVariable = new EObjectResolvingEList<Variable>(Variable.class, this, QVTRelationPackage.RELATION_DOMAIN__ROOT_VARIABLE);
		}
		return rootVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTRelationPackage.RELATION_DOMAIN__DEFAULT_ASSIGNMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDefaultAssignment()).basicAdd(otherEnd, msgs);
			case QVTRelationPackage.RELATION_DOMAIN__PATTERN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPattern()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTRelationPackage.RELATION_DOMAIN__DEFAULT_ASSIGNMENT:
				return ((InternalEList<?>)getDefaultAssignment()).basicRemove(otherEnd, msgs);
			case QVTRelationPackage.RELATION_DOMAIN__PATTERN:
				return ((InternalEList<?>)getPattern()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QVTRelationPackage.RELATION_DOMAIN__DEFAULT_ASSIGNMENT:
				return getDefaultAssignment();
			case QVTRelationPackage.RELATION_DOMAIN__PATTERN:
				return getPattern();
			case QVTRelationPackage.RELATION_DOMAIN__ROOT_VARIABLE:
				return getRootVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QVTRelationPackage.RELATION_DOMAIN__DEFAULT_ASSIGNMENT:
				getDefaultAssignment().clear();
				getDefaultAssignment().addAll((Collection<? extends RelationDomainAssignment>)newValue);
				return;
			case QVTRelationPackage.RELATION_DOMAIN__PATTERN:
				getPattern().clear();
				getPattern().addAll((Collection<? extends DomainPattern>)newValue);
				return;
			case QVTRelationPackage.RELATION_DOMAIN__ROOT_VARIABLE:
				getRootVariable().clear();
				getRootVariable().addAll((Collection<? extends Variable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QVTRelationPackage.RELATION_DOMAIN__DEFAULT_ASSIGNMENT:
				getDefaultAssignment().clear();
				return;
			case QVTRelationPackage.RELATION_DOMAIN__PATTERN:
				getPattern().clear();
				return;
			case QVTRelationPackage.RELATION_DOMAIN__ROOT_VARIABLE:
				getRootVariable().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QVTRelationPackage.RELATION_DOMAIN__DEFAULT_ASSIGNMENT:
				return defaultAssignment != null && !defaultAssignment.isEmpty();
			case QVTRelationPackage.RELATION_DOMAIN__PATTERN:
				return pattern != null && !pattern.isEmpty();
			case QVTRelationPackage.RELATION_DOMAIN__ROOT_VARIABLE:
				return rootVariable != null && !rootVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationDomainImpl
