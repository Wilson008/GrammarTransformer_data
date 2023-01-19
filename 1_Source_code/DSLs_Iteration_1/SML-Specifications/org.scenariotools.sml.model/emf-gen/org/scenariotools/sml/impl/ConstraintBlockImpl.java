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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.scenariotools.sml.ConstraintBlock;
import org.scenariotools.sml.Message;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.ConstraintBlockImpl#getConsider <em>Consider</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ConstraintBlockImpl#getIgnore <em>Ignore</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ConstraintBlockImpl#getInterrupt <em>Interrupt</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ConstraintBlockImpl#getForbidden <em>Forbidden</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintBlockImpl extends MinimalEObjectImpl.Container implements ConstraintBlock {
	/**
	 * The cached value of the '{@link #getConsider() <em>Consider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsider()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> consider;

	/**
	 * The cached value of the '{@link #getIgnore() <em>Ignore</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnore()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> ignore;

	/**
	 * The cached value of the '{@link #getInterrupt() <em>Interrupt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterrupt()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> interrupt;

	/**
	 * The cached value of the '{@link #getForbidden() <em>Forbidden</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForbidden()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> forbidden;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.CONSTRAINT_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getConsider() {
		if (consider == null) {
			consider = new EObjectContainmentEList<Message>(Message.class, this, SmlPackage.CONSTRAINT_BLOCK__CONSIDER);
		}
		return consider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getIgnore() {
		if (ignore == null) {
			ignore = new EObjectContainmentEList<Message>(Message.class, this, SmlPackage.CONSTRAINT_BLOCK__IGNORE);
		}
		return ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getInterrupt() {
		if (interrupt == null) {
			interrupt = new EObjectContainmentEList<Message>(Message.class, this, SmlPackage.CONSTRAINT_BLOCK__INTERRUPT);
		}
		return interrupt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getForbidden() {
		if (forbidden == null) {
			forbidden = new EObjectContainmentEList<Message>(Message.class, this, SmlPackage.CONSTRAINT_BLOCK__FORBIDDEN);
		}
		return forbidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.CONSTRAINT_BLOCK__CONSIDER:
				return ((InternalEList<?>)getConsider()).basicRemove(otherEnd, msgs);
			case SmlPackage.CONSTRAINT_BLOCK__IGNORE:
				return ((InternalEList<?>)getIgnore()).basicRemove(otherEnd, msgs);
			case SmlPackage.CONSTRAINT_BLOCK__INTERRUPT:
				return ((InternalEList<?>)getInterrupt()).basicRemove(otherEnd, msgs);
			case SmlPackage.CONSTRAINT_BLOCK__FORBIDDEN:
				return ((InternalEList<?>)getForbidden()).basicRemove(otherEnd, msgs);
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
			case SmlPackage.CONSTRAINT_BLOCK__CONSIDER:
				return getConsider();
			case SmlPackage.CONSTRAINT_BLOCK__IGNORE:
				return getIgnore();
			case SmlPackage.CONSTRAINT_BLOCK__INTERRUPT:
				return getInterrupt();
			case SmlPackage.CONSTRAINT_BLOCK__FORBIDDEN:
				return getForbidden();
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
			case SmlPackage.CONSTRAINT_BLOCK__CONSIDER:
				getConsider().clear();
				getConsider().addAll((Collection<? extends Message>)newValue);
				return;
			case SmlPackage.CONSTRAINT_BLOCK__IGNORE:
				getIgnore().clear();
				getIgnore().addAll((Collection<? extends Message>)newValue);
				return;
			case SmlPackage.CONSTRAINT_BLOCK__INTERRUPT:
				getInterrupt().clear();
				getInterrupt().addAll((Collection<? extends Message>)newValue);
				return;
			case SmlPackage.CONSTRAINT_BLOCK__FORBIDDEN:
				getForbidden().clear();
				getForbidden().addAll((Collection<? extends Message>)newValue);
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
			case SmlPackage.CONSTRAINT_BLOCK__CONSIDER:
				getConsider().clear();
				return;
			case SmlPackage.CONSTRAINT_BLOCK__IGNORE:
				getIgnore().clear();
				return;
			case SmlPackage.CONSTRAINT_BLOCK__INTERRUPT:
				getInterrupt().clear();
				return;
			case SmlPackage.CONSTRAINT_BLOCK__FORBIDDEN:
				getForbidden().clear();
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
			case SmlPackage.CONSTRAINT_BLOCK__CONSIDER:
				return consider != null && !consider.isEmpty();
			case SmlPackage.CONSTRAINT_BLOCK__IGNORE:
				return ignore != null && !ignore.isEmpty();
			case SmlPackage.CONSTRAINT_BLOCK__INTERRUPT:
				return interrupt != null && !interrupt.isEmpty();
			case SmlPackage.CONSTRAINT_BLOCK__FORBIDDEN:
				return forbidden != null && !forbidden.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintBlockImpl
