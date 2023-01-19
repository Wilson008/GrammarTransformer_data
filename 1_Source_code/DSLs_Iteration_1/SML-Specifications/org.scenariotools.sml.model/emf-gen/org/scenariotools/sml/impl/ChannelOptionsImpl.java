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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.scenariotools.sml.ChannelOptions;
import org.scenariotools.sml.MessageChannel;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.ChannelOptionsImpl#isAllMessagesRequireLinks <em>All Messages Require Links</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ChannelOptionsImpl#getMessageChannels <em>Message Channels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelOptionsImpl extends MinimalEObjectImpl.Container implements ChannelOptions {
	/**
	 * The default value of the '{@link #isAllMessagesRequireLinks() <em>All Messages Require Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllMessagesRequireLinks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_MESSAGES_REQUIRE_LINKS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllMessagesRequireLinks() <em>All Messages Require Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllMessagesRequireLinks()
	 * @generated
	 * @ordered
	 */
	protected boolean allMessagesRequireLinks = ALL_MESSAGES_REQUIRE_LINKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageChannels() <em>Message Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageChannel> messageChannels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.CHANNEL_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllMessagesRequireLinks() {
		return allMessagesRequireLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllMessagesRequireLinks(boolean newAllMessagesRequireLinks) {
		boolean oldAllMessagesRequireLinks = allMessagesRequireLinks;
		allMessagesRequireLinks = newAllMessagesRequireLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.CHANNEL_OPTIONS__ALL_MESSAGES_REQUIRE_LINKS, oldAllMessagesRequireLinks, allMessagesRequireLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageChannel> getMessageChannels() {
		if (messageChannels == null) {
			messageChannels = new EObjectContainmentEList<MessageChannel>(MessageChannel.class, this, SmlPackage.CHANNEL_OPTIONS__MESSAGE_CHANNELS);
		}
		return messageChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<MessageChannel> getChannelsForEvent(ETypedElement event) {
		EList<MessageChannel> result  = new BasicEList<MessageChannel>();
		for(MessageChannel c : getMessageChannels()) {
			if(event == c.getEvent())
				result.add(c);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.CHANNEL_OPTIONS__MESSAGE_CHANNELS:
				return ((InternalEList<?>)getMessageChannels()).basicRemove(otherEnd, msgs);
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
			case SmlPackage.CHANNEL_OPTIONS__ALL_MESSAGES_REQUIRE_LINKS:
				return isAllMessagesRequireLinks();
			case SmlPackage.CHANNEL_OPTIONS__MESSAGE_CHANNELS:
				return getMessageChannels();
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
			case SmlPackage.CHANNEL_OPTIONS__ALL_MESSAGES_REQUIRE_LINKS:
				setAllMessagesRequireLinks((Boolean)newValue);
				return;
			case SmlPackage.CHANNEL_OPTIONS__MESSAGE_CHANNELS:
				getMessageChannels().clear();
				getMessageChannels().addAll((Collection<? extends MessageChannel>)newValue);
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
			case SmlPackage.CHANNEL_OPTIONS__ALL_MESSAGES_REQUIRE_LINKS:
				setAllMessagesRequireLinks(ALL_MESSAGES_REQUIRE_LINKS_EDEFAULT);
				return;
			case SmlPackage.CHANNEL_OPTIONS__MESSAGE_CHANNELS:
				getMessageChannels().clear();
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
			case SmlPackage.CHANNEL_OPTIONS__ALL_MESSAGES_REQUIRE_LINKS:
				return allMessagesRequireLinks != ALL_MESSAGES_REQUIRE_LINKS_EDEFAULT;
			case SmlPackage.CHANNEL_OPTIONS__MESSAGE_CHANNELS:
				return messageChannels != null && !messageChannels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SmlPackage.CHANNEL_OPTIONS___GET_CHANNELS_FOR_EVENT__ETYPEDELEMENT:
				return getChannelsForEvent((ETypedElement)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (allMessagesRequireLinks: ");
		result.append(allMessagesRequireLinks);
		result.append(')');
		return result.toString();
	}

} //ChannelOptionsImpl
