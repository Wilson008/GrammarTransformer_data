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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.scenariotools.sml.Collaboration;
import org.scenariotools.sml.DummyExprClass;
import org.scenariotools.sml.Role;
import org.scenariotools.sml.Scenario;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.CollaborationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.CollaborationImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.CollaborationImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.CollaborationImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.CollaborationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.CollaborationImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborationImpl extends MinimalEObjectImpl.Container implements Collaboration {
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
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<DummyExprClass> imports;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> domains;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> contexts;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.COLLABORATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.COLLABORATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DummyExprClass> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<DummyExprClass>(DummyExprClass.class, this, SmlPackage.COLLABORATION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getDomains() {
		if (domains == null) {
			domains = new EObjectResolvingEList<EPackage>(EPackage.class, this, SmlPackage.COLLABORATION__DOMAINS);
		}
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getContexts() {
		if (contexts == null) {
			contexts = new EObjectResolvingEList<EPackage>(EPackage.class, this, SmlPackage.COLLABORATION__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, SmlPackage.COLLABORATION__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, SmlPackage.COLLABORATION__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.COLLABORATION__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case SmlPackage.COLLABORATION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case SmlPackage.COLLABORATION__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
			case SmlPackage.COLLABORATION__NAME:
				return getName();
			case SmlPackage.COLLABORATION__IMPORTS:
				return getImports();
			case SmlPackage.COLLABORATION__DOMAINS:
				return getDomains();
			case SmlPackage.COLLABORATION__CONTEXTS:
				return getContexts();
			case SmlPackage.COLLABORATION__ROLES:
				return getRoles();
			case SmlPackage.COLLABORATION__SCENARIOS:
				return getScenarios();
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
			case SmlPackage.COLLABORATION__NAME:
				setName((String)newValue);
				return;
			case SmlPackage.COLLABORATION__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends DummyExprClass>)newValue);
				return;
			case SmlPackage.COLLABORATION__DOMAINS:
				getDomains().clear();
				getDomains().addAll((Collection<? extends EPackage>)newValue);
				return;
			case SmlPackage.COLLABORATION__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends EPackage>)newValue);
				return;
			case SmlPackage.COLLABORATION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case SmlPackage.COLLABORATION__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
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
			case SmlPackage.COLLABORATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmlPackage.COLLABORATION__IMPORTS:
				getImports().clear();
				return;
			case SmlPackage.COLLABORATION__DOMAINS:
				getDomains().clear();
				return;
			case SmlPackage.COLLABORATION__CONTEXTS:
				getContexts().clear();
				return;
			case SmlPackage.COLLABORATION__ROLES:
				getRoles().clear();
				return;
			case SmlPackage.COLLABORATION__SCENARIOS:
				getScenarios().clear();
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
			case SmlPackage.COLLABORATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmlPackage.COLLABORATION__IMPORTS:
				return imports != null && !imports.isEmpty();
			case SmlPackage.COLLABORATION__DOMAINS:
				return domains != null && !domains.isEmpty();
			case SmlPackage.COLLABORATION__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case SmlPackage.COLLABORATION__ROLES:
				return roles != null && !roles.isEmpty();
			case SmlPackage.COLLABORATION__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //CollaborationImpl
