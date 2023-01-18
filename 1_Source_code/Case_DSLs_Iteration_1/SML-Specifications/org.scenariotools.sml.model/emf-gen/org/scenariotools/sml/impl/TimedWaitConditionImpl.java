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
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.scenariotools.sml.SmlPackage;
import org.scenariotools.sml.TimedWaitCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Wait Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.TimedWaitConditionImpl#isRequested <em>Requested</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.TimedWaitConditionImpl#isStrict <em>Strict</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedWaitConditionImpl extends TimedConditionFragmentImpl implements TimedWaitCondition {
	/**
	 * The default value of the '{@link #isRequested() <em>Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequested()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUESTED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isRequested() <em>Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequested()
	 * @generated
	 * @ordered
	 */
	protected boolean requested = REQUESTED_EDEFAULT;
	/**
	 * The default value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected boolean strict = STRICT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedWaitConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.TIMED_WAIT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequested() {
		return requested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequested(boolean newRequested) {
		boolean oldRequested = requested;
		requested = newRequested;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.TIMED_WAIT_CONDITION__REQUESTED, oldRequested, requested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrict() {
		return strict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrict(boolean newStrict) {
		boolean oldStrict = strict;
		strict = newStrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.TIMED_WAIT_CONDITION__STRICT, oldStrict, strict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmlPackage.TIMED_WAIT_CONDITION__REQUESTED:
				return isRequested();
			case SmlPackage.TIMED_WAIT_CONDITION__STRICT:
				return isStrict();
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
			case SmlPackage.TIMED_WAIT_CONDITION__REQUESTED:
				setRequested((Boolean)newValue);
				return;
			case SmlPackage.TIMED_WAIT_CONDITION__STRICT:
				setStrict((Boolean)newValue);
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
			case SmlPackage.TIMED_WAIT_CONDITION__REQUESTED:
				setRequested(REQUESTED_EDEFAULT);
				return;
			case SmlPackage.TIMED_WAIT_CONDITION__STRICT:
				setStrict(STRICT_EDEFAULT);
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
			case SmlPackage.TIMED_WAIT_CONDITION__REQUESTED:
				return requested != REQUESTED_EDEFAULT;
			case SmlPackage.TIMED_WAIT_CONDITION__STRICT:
				return strict != STRICT_EDEFAULT;
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
		result.append(" (requested: ");
		result.append(requested);
		result.append(", strict: ");
		result.append(strict);
		result.append(')');
		return result.toString();
	}

} //TimedWaitConditionImpl
