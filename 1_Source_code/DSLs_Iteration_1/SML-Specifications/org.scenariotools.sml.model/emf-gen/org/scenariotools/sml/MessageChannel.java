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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.MessageChannel#getEvent <em>Event</em>}</li>
 *   <li>{@link org.scenariotools.sml.MessageChannel#getChannelFeature <em>Channel Feature</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getMessageChannel()
 * @model
 * @generated
 */
public interface MessageChannel extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(ETypedElement)
	 * @see org.scenariotools.sml.SmlPackage#getMessageChannel_Event()
	 * @model
	 * @generated
	 */
	ETypedElement getEvent();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.MessageChannel#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(ETypedElement value);

	/**
	 * Returns the value of the '<em><b>Channel Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Feature</em>' reference.
	 * @see #setChannelFeature(EStructuralFeature)
	 * @see org.scenariotools.sml.SmlPackage#getMessageChannel_ChannelFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getChannelFeature();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.MessageChannel#getChannelFeature <em>Channel Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Feature</em>' reference.
	 * @see #getChannelFeature()
	 * @generated
	 */
	void setChannelFeature(EStructuralFeature value);

} // MessageChannel
