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
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.scenariotools.sml.EventParameterRanges;
import org.scenariotools.sml.RangesForParameter;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Parameter Ranges</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.EventParameterRangesImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.EventParameterRangesImpl#getRangesForParameter <em>Ranges For Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventParameterRangesImpl extends MinimalEObjectImpl.Container implements EventParameterRanges {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected ETypedElement event;

	/**
	 * The cached value of the '{@link #getRangesForParameter() <em>Ranges For Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangesForParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<RangesForParameter> rangesForParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventParameterRangesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.EVENT_PARAMETER_RANGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypedElement getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (ETypedElement)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.EVENT_PARAMETER_RANGES__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypedElement basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(ETypedElement newEvent) {
		ETypedElement oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.EVENT_PARAMETER_RANGES__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RangesForParameter> getRangesForParameter() {
		if (rangesForParameter == null) {
			rangesForParameter = new EObjectContainmentEList<RangesForParameter>(RangesForParameter.class, this, SmlPackage.EVENT_PARAMETER_RANGES__RANGES_FOR_PARAMETER);
		}
		return rangesForParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.EVENT_PARAMETER_RANGES__RANGES_FOR_PARAMETER:
				return ((InternalEList<?>)getRangesForParameter()).basicRemove(otherEnd, msgs);
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
			case SmlPackage.EVENT_PARAMETER_RANGES__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case SmlPackage.EVENT_PARAMETER_RANGES__RANGES_FOR_PARAMETER:
				return getRangesForParameter();
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
			case SmlPackage.EVENT_PARAMETER_RANGES__EVENT:
				setEvent((ETypedElement)newValue);
				return;
			case SmlPackage.EVENT_PARAMETER_RANGES__RANGES_FOR_PARAMETER:
				getRangesForParameter().clear();
				getRangesForParameter().addAll((Collection<? extends RangesForParameter>)newValue);
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
			case SmlPackage.EVENT_PARAMETER_RANGES__EVENT:
				setEvent((ETypedElement)null);
				return;
			case SmlPackage.EVENT_PARAMETER_RANGES__RANGES_FOR_PARAMETER:
				getRangesForParameter().clear();
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
			case SmlPackage.EVENT_PARAMETER_RANGES__EVENT:
				return event != null;
			case SmlPackage.EVENT_PARAMETER_RANGES__RANGES_FOR_PARAMETER:
				return rangesForParameter != null && !rangesForParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventParameterRangesImpl
