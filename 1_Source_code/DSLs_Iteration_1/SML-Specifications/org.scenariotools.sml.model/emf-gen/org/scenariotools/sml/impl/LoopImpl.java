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

import org.scenariotools.sml.Condition;
import org.scenariotools.sml.Interaction;
import org.scenariotools.sml.Loop;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.LoopImpl#getBodyInteraction <em>Body Interaction</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.LoopImpl#getLoopCondition <em>Loop Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends InteractionFragmentImpl implements Loop {
	/**
	 * The cached value of the '{@link #getBodyInteraction() <em>Body Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyInteraction()
	 * @generated
	 * @ordered
	 */
	protected Interaction bodyInteraction;

	/**
	 * The cached value of the '{@link #getLoopCondition() <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition loopCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getBodyInteraction() {
		return bodyInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyInteraction(Interaction newBodyInteraction, NotificationChain msgs) {
		Interaction oldBodyInteraction = bodyInteraction;
		bodyInteraction = newBodyInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.LOOP__BODY_INTERACTION, oldBodyInteraction, newBodyInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyInteraction(Interaction newBodyInteraction) {
		if (newBodyInteraction != bodyInteraction) {
			NotificationChain msgs = null;
			if (bodyInteraction != null)
				msgs = ((InternalEObject)bodyInteraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.LOOP__BODY_INTERACTION, null, msgs);
			if (newBodyInteraction != null)
				msgs = ((InternalEObject)newBodyInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.LOOP__BODY_INTERACTION, null, msgs);
			msgs = basicSetBodyInteraction(newBodyInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.LOOP__BODY_INTERACTION, newBodyInteraction, newBodyInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getLoopCondition() {
		return loopCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCondition(Condition newLoopCondition, NotificationChain msgs) {
		Condition oldLoopCondition = loopCondition;
		loopCondition = newLoopCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.LOOP__LOOP_CONDITION, oldLoopCondition, newLoopCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCondition(Condition newLoopCondition) {
		if (newLoopCondition != loopCondition) {
			NotificationChain msgs = null;
			if (loopCondition != null)
				msgs = ((InternalEObject)loopCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.LOOP__LOOP_CONDITION, null, msgs);
			if (newLoopCondition != null)
				msgs = ((InternalEObject)newLoopCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.LOOP__LOOP_CONDITION, null, msgs);
			msgs = basicSetLoopCondition(newLoopCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.LOOP__LOOP_CONDITION, newLoopCondition, newLoopCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.LOOP__BODY_INTERACTION:
				return basicSetBodyInteraction(null, msgs);
			case SmlPackage.LOOP__LOOP_CONDITION:
				return basicSetLoopCondition(null, msgs);
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
			case SmlPackage.LOOP__BODY_INTERACTION:
				return getBodyInteraction();
			case SmlPackage.LOOP__LOOP_CONDITION:
				return getLoopCondition();
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
			case SmlPackage.LOOP__BODY_INTERACTION:
				setBodyInteraction((Interaction)newValue);
				return;
			case SmlPackage.LOOP__LOOP_CONDITION:
				setLoopCondition((Condition)newValue);
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
			case SmlPackage.LOOP__BODY_INTERACTION:
				setBodyInteraction((Interaction)null);
				return;
			case SmlPackage.LOOP__LOOP_CONDITION:
				setLoopCondition((Condition)null);
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
			case SmlPackage.LOOP__BODY_INTERACTION:
				return bodyInteraction != null;
			case SmlPackage.LOOP__LOOP_CONDITION:
				return loopCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopImpl
