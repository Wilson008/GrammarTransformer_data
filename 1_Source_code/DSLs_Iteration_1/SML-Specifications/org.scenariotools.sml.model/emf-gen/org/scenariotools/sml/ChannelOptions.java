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
package org.scenariotools.sml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.ChannelOptions#isAllMessagesRequireLinks <em>All Messages Require Links</em>}</li>
 *   <li>{@link org.scenariotools.sml.ChannelOptions#getMessageChannels <em>Message Channels</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getChannelOptions()
 * @model
 * @generated
 */
public interface ChannelOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>All Messages Require Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Messages Require Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Messages Require Links</em>' attribute.
	 * @see #setAllMessagesRequireLinks(boolean)
	 * @see org.scenariotools.sml.SmlPackage#getChannelOptions_AllMessagesRequireLinks()
	 * @model
	 * @generated
	 */
	boolean isAllMessagesRequireLinks();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.ChannelOptions#isAllMessagesRequireLinks <em>All Messages Require Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Messages Require Links</em>' attribute.
	 * @see #isAllMessagesRequireLinks()
	 * @generated
	 */
	void setAllMessagesRequireLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>Message Channels</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.MessageChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Channels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Channels</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getChannelOptions_MessageChannels()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageChannel> getMessageChannels();

	/**
	 * <!-- begin-user-doc -->
	 * @return all structural features over which sending a message with the given event is admissible.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<MessageChannel> getChannelsForEvent(ETypedElement event);

} // ChannelOptions
