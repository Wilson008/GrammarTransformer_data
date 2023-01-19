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
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.Message#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.scenariotools.sml.Message#getSender <em>Sender</em>}</li>
 *   <li>{@link org.scenariotools.sml.Message#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.scenariotools.sml.Message#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.scenariotools.sml.Message#getCollectionModification <em>Collection Modification</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(Role)
	 * @see org.scenariotools.sml.SmlPackage#getMessage_Receiver()
	 * @model
	 * @generated
	 */
	Role getReceiver();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Message#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Role value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(Role)
	 * @see org.scenariotools.sml.SmlPackage#getMessage_Sender()
	 * @model
	 * @generated
	 */
	Role getSender();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Message#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Role value);

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(ETypedElement)
	 * @see org.scenariotools.sml.SmlPackage#getMessage_ModelElement()
	 * @model
	 * @generated
	 */
	ETypedElement getModelElement();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Message#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(ETypedElement value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getMessage_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameters();

	/**
	 * Returns the value of the '<em><b>Collection Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Modification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Modification</em>' attribute.
	 * @see #setCollectionModification(String)
	 * @see org.scenariotools.sml.SmlPackage#getMessage_CollectionModification()
	 * @model dataType="org.scenariotools.sml.DummyDatatype"
	 * @generated
	 */
	String getCollectionModification();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Message#getCollectionModification <em>Collection Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Modification</em>' attribute.
	 * @see #getCollectionModification()
	 * @generated
	 */
	void setCollectionModification(String value);

} // Message
