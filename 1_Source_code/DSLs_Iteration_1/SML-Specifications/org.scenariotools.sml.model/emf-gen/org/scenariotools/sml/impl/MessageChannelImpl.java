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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.scenariotools.sml.MessageChannel;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.MessageChannelImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.MessageChannelImpl#getChannelFeature <em>Channel Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageChannelImpl extends MinimalEObjectImpl.Container implements MessageChannel {
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
	 * The cached value of the '{@link #getChannelFeature() <em>Channel Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature channelFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.MESSAGE_CHANNEL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.MESSAGE_CHANNEL__EVENT, oldEvent, event));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.MESSAGE_CHANNEL__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getChannelFeature() {
		if (channelFeature != null && channelFeature.eIsProxy()) {
			InternalEObject oldChannelFeature = (InternalEObject)channelFeature;
			channelFeature = (EStructuralFeature)eResolveProxy(oldChannelFeature);
			if (channelFeature != oldChannelFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.MESSAGE_CHANNEL__CHANNEL_FEATURE, oldChannelFeature, channelFeature));
			}
		}
		return channelFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetChannelFeature() {
		return channelFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelFeature(EStructuralFeature newChannelFeature) {
		EStructuralFeature oldChannelFeature = channelFeature;
		channelFeature = newChannelFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.MESSAGE_CHANNEL__CHANNEL_FEATURE, oldChannelFeature, channelFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmlPackage.MESSAGE_CHANNEL__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case SmlPackage.MESSAGE_CHANNEL__CHANNEL_FEATURE:
				if (resolve) return getChannelFeature();
				return basicGetChannelFeature();
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
			case SmlPackage.MESSAGE_CHANNEL__EVENT:
				setEvent((ETypedElement)newValue);
				return;
			case SmlPackage.MESSAGE_CHANNEL__CHANNEL_FEATURE:
				setChannelFeature((EStructuralFeature)newValue);
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
			case SmlPackage.MESSAGE_CHANNEL__EVENT:
				setEvent((ETypedElement)null);
				return;
			case SmlPackage.MESSAGE_CHANNEL__CHANNEL_FEATURE:
				setChannelFeature((EStructuralFeature)null);
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
			case SmlPackage.MESSAGE_CHANNEL__EVENT:
				return event != null;
			case SmlPackage.MESSAGE_CHANNEL__CHANNEL_FEATURE:
				return channelFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageChannelImpl
