/**
 * Copyright (c) 2016 Joel Greenyer and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * ScenarioTools-URL: www.scenariotools.org
 *    
 * Contributors:
 *     ScenarioTools Team - Initial API and implementation
 */
package org.scenariotools.sml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.scenariotools.sml.Interaction;
import org.scenariotools.sml.RoleBindingConstraint;
import org.scenariotools.sml.Scenario;
import org.scenariotools.sml.ScenarioKind;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ScenarioImpl#isSingular <em>Singular</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ScenarioImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ScenarioImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ScenarioImpl#getRoleBindings <em>Role Bindings</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ScenarioImpl#getOwnedInteraction <em>Owned Interaction</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ScenarioImpl#isOptimizeCost <em>Optimize Cost</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ScenarioImpl#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isSingular() <em>Singular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingular()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGULAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingular() <em>Singular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingular()
	 * @generated
	 * @ordered
	 */
	protected boolean singular = SINGULAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ScenarioKind KIND_EDEFAULT = ScenarioKind.ASSUMPTION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ScenarioKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> contexts;

	/**
	 * The cached value of the '{@link #getRoleBindings() <em>Role Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleBindingConstraint> roleBindings;

	/**
	 * The cached value of the '{@link #getOwnedInteraction() <em>Owned Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInteraction()
	 * @generated
	 * @ordered
	 */
	protected Interaction ownedInteraction;

	/**
	 * The default value of the '{@link #isOptimizeCost() <em>Optimize Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptimizeCost()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIMIZE_COST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptimizeCost() <em>Optimize Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptimizeCost()
	 * @generated
	 * @ordered
	 */
	protected boolean optimizeCost = OPTIMIZE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingular() {
		return singular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingular(boolean newSingular) {
		boolean oldSingular = singular;
		singular = newSingular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SCENARIO__SINGULAR, oldSingular, singular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleBindingConstraint> getRoleBindings() {
		if (roleBindings == null) {
			roleBindings = new EObjectContainmentEList<RoleBindingConstraint>(RoleBindingConstraint.class, this, SmlPackage.SCENARIO__ROLE_BINDINGS);
		}
		return roleBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ScenarioKind newKind) {
		ScenarioKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SCENARIO__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getContexts() {
		if (contexts == null) {
			contexts = new EObjectResolvingEList<EClass>(EClass.class, this, SmlPackage.SCENARIO__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getOwnedInteraction() {
		return ownedInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedInteraction(Interaction newOwnedInteraction, NotificationChain msgs) {
		Interaction oldOwnedInteraction = ownedInteraction;
		ownedInteraction = newOwnedInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.SCENARIO__OWNED_INTERACTION, oldOwnedInteraction, newOwnedInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedInteraction(Interaction newOwnedInteraction) {
		if (newOwnedInteraction != ownedInteraction) {
			NotificationChain msgs = null;
			if (ownedInteraction != null)
				msgs = ((InternalEObject)ownedInteraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.SCENARIO__OWNED_INTERACTION, null, msgs);
			if (newOwnedInteraction != null)
				msgs = ((InternalEObject)newOwnedInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.SCENARIO__OWNED_INTERACTION, null, msgs);
			msgs = basicSetOwnedInteraction(newOwnedInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SCENARIO__OWNED_INTERACTION, newOwnedInteraction, newOwnedInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptimizeCost() {
		return optimizeCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimizeCost(boolean newOptimizeCost) {
		boolean oldOptimizeCost = optimizeCost;
		optimizeCost = newOptimizeCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SCENARIO__OPTIMIZE_COST, oldOptimizeCost, optimizeCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost) {
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SCENARIO__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.SCENARIO__ROLE_BINDINGS:
				return ((InternalEList<?>)getRoleBindings()).basicRemove(otherEnd, msgs);
			case SmlPackage.SCENARIO__OWNED_INTERACTION:
				return basicSetOwnedInteraction(null, msgs);
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
			case SmlPackage.SCENARIO__NAME:
				return getName();
			case SmlPackage.SCENARIO__SINGULAR:
				return isSingular();
			case SmlPackage.SCENARIO__KIND:
				return getKind();
			case SmlPackage.SCENARIO__CONTEXTS:
				return getContexts();
			case SmlPackage.SCENARIO__ROLE_BINDINGS:
				return getRoleBindings();
			case SmlPackage.SCENARIO__OWNED_INTERACTION:
				return getOwnedInteraction();
			case SmlPackage.SCENARIO__OPTIMIZE_COST:
				return isOptimizeCost();
			case SmlPackage.SCENARIO__COST:
				return getCost();
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
			case SmlPackage.SCENARIO__NAME:
				setName((String)newValue);
				return;
			case SmlPackage.SCENARIO__SINGULAR:
				setSingular((Boolean)newValue);
				return;
			case SmlPackage.SCENARIO__KIND:
				setKind((ScenarioKind)newValue);
				return;
			case SmlPackage.SCENARIO__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends EClass>)newValue);
				return;
			case SmlPackage.SCENARIO__ROLE_BINDINGS:
				getRoleBindings().clear();
				getRoleBindings().addAll((Collection<? extends RoleBindingConstraint>)newValue);
				return;
			case SmlPackage.SCENARIO__OWNED_INTERACTION:
				setOwnedInteraction((Interaction)newValue);
				return;
			case SmlPackage.SCENARIO__OPTIMIZE_COST:
				setOptimizeCost((Boolean)newValue);
				return;
			case SmlPackage.SCENARIO__COST:
				setCost((Double)newValue);
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
			case SmlPackage.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmlPackage.SCENARIO__SINGULAR:
				setSingular(SINGULAR_EDEFAULT);
				return;
			case SmlPackage.SCENARIO__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case SmlPackage.SCENARIO__CONTEXTS:
				getContexts().clear();
				return;
			case SmlPackage.SCENARIO__ROLE_BINDINGS:
				getRoleBindings().clear();
				return;
			case SmlPackage.SCENARIO__OWNED_INTERACTION:
				setOwnedInteraction((Interaction)null);
				return;
			case SmlPackage.SCENARIO__OPTIMIZE_COST:
				setOptimizeCost(OPTIMIZE_COST_EDEFAULT);
				return;
			case SmlPackage.SCENARIO__COST:
				setCost(COST_EDEFAULT);
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
			case SmlPackage.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmlPackage.SCENARIO__SINGULAR:
				return singular != SINGULAR_EDEFAULT;
			case SmlPackage.SCENARIO__KIND:
				return kind != KIND_EDEFAULT;
			case SmlPackage.SCENARIO__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case SmlPackage.SCENARIO__ROLE_BINDINGS:
				return roleBindings != null && !roleBindings.isEmpty();
			case SmlPackage.SCENARIO__OWNED_INTERACTION:
				return ownedInteraction != null;
			case SmlPackage.SCENARIO__OPTIMIZE_COST:
				return optimizeCost != OPTIMIZE_COST_EDEFAULT;
			case SmlPackage.SCENARIO__COST:
				return cost != COST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", singular: ");
		result.append(singular);
		result.append(", kind: ");
		result.append(kind);
		result.append(", optimizeCost: ");
		result.append(optimizeCost);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
