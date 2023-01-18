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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.scenariotools.sml.DummyExprClass;
import org.scenariotools.sml.SmlPackage;
import org.scenariotools.sml.TimedConditionFragment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Condition Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.TimedConditionFragmentImpl#getTimedConditionExpression <em>Timed Condition Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TimedConditionFragmentImpl extends InteractionFragmentImpl implements TimedConditionFragment {
	/**
	 * The cached value of the '{@link #getTimedConditionExpression() <em>Timed Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimedConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected DummyExprClass timedConditionExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedConditionFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.TIMED_CONDITION_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyExprClass getTimedConditionExpression() {
		return timedConditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimedConditionExpression(DummyExprClass newTimedConditionExpression, NotificationChain msgs) {
		DummyExprClass oldTimedConditionExpression = timedConditionExpression;
		timedConditionExpression = newTimedConditionExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION, oldTimedConditionExpression, newTimedConditionExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimedConditionExpression(DummyExprClass newTimedConditionExpression) {
		if (newTimedConditionExpression != timedConditionExpression) {
			NotificationChain msgs = null;
			if (timedConditionExpression != null)
				msgs = ((InternalEObject)timedConditionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION, null, msgs);
			if (newTimedConditionExpression != null)
				msgs = ((InternalEObject)newTimedConditionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION, null, msgs);
			msgs = basicSetTimedConditionExpression(newTimedConditionExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION, newTimedConditionExpression, newTimedConditionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION:
				return basicSetTimedConditionExpression(null, msgs);
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
			case SmlPackage.TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION:
				return getTimedConditionExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmlPackage.TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION:
				setTimedConditionExpression((DummyExprClass)newValue);
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
			case SmlPackage.TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION:
				setTimedConditionExpression((DummyExprClass)null);
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
			case SmlPackage.TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION:
				return timedConditionExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //TimedConditionFragmentImpl
