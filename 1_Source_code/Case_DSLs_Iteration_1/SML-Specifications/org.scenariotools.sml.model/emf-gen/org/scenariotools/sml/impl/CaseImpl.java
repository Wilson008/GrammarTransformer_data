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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.scenariotools.sml.Case;
import org.scenariotools.sml.Condition;
import org.scenariotools.sml.Interaction;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.CaseImpl#getCaseInteraction <em>Case Interaction</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.CaseImpl#getCaseCondition <em>Case Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseImpl extends MinimalEObjectImpl.Container implements Case {
	/**
	 * The cached value of the '{@link #getCaseInteraction() <em>Case Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseInteraction()
	 * @generated
	 * @ordered
	 */
	protected Interaction caseInteraction;

	/**
	 * The cached value of the '{@link #getCaseCondition() <em>Case Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition caseCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getCaseInteraction() {
		return caseInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseInteraction(Interaction newCaseInteraction, NotificationChain msgs) {
		Interaction oldCaseInteraction = caseInteraction;
		caseInteraction = newCaseInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.CASE__CASE_INTERACTION, oldCaseInteraction, newCaseInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseInteraction(Interaction newCaseInteraction) {
		if (newCaseInteraction != caseInteraction) {
			NotificationChain msgs = null;
			if (caseInteraction != null)
				msgs = ((InternalEObject)caseInteraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.CASE__CASE_INTERACTION, null, msgs);
			if (newCaseInteraction != null)
				msgs = ((InternalEObject)newCaseInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.CASE__CASE_INTERACTION, null, msgs);
			msgs = basicSetCaseInteraction(newCaseInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.CASE__CASE_INTERACTION, newCaseInteraction, newCaseInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCaseCondition() {
		return caseCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseCondition(Condition newCaseCondition, NotificationChain msgs) {
		Condition oldCaseCondition = caseCondition;
		caseCondition = newCaseCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.CASE__CASE_CONDITION, oldCaseCondition, newCaseCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseCondition(Condition newCaseCondition) {
		if (newCaseCondition != caseCondition) {
			NotificationChain msgs = null;
			if (caseCondition != null)
				msgs = ((InternalEObject)caseCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.CASE__CASE_CONDITION, null, msgs);
			if (newCaseCondition != null)
				msgs = ((InternalEObject)newCaseCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.CASE__CASE_CONDITION, null, msgs);
			msgs = basicSetCaseCondition(newCaseCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.CASE__CASE_CONDITION, newCaseCondition, newCaseCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.CASE__CASE_INTERACTION:
				return basicSetCaseInteraction(null, msgs);
			case SmlPackage.CASE__CASE_CONDITION:
				return basicSetCaseCondition(null, msgs);
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
			case SmlPackage.CASE__CASE_INTERACTION:
				return getCaseInteraction();
			case SmlPackage.CASE__CASE_CONDITION:
				return getCaseCondition();
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
			case SmlPackage.CASE__CASE_INTERACTION:
				setCaseInteraction((Interaction)newValue);
				return;
			case SmlPackage.CASE__CASE_CONDITION:
				setCaseCondition((Condition)newValue);
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
			case SmlPackage.CASE__CASE_INTERACTION:
				setCaseInteraction((Interaction)null);
				return;
			case SmlPackage.CASE__CASE_CONDITION:
				setCaseCondition((Condition)null);
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
			case SmlPackage.CASE__CASE_INTERACTION:
				return caseInteraction != null;
			case SmlPackage.CASE__CASE_CONDITION:
				return caseCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //CaseImpl
