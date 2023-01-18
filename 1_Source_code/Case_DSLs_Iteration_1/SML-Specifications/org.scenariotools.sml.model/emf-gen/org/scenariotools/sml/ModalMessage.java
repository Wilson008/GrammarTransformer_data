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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modal Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.ModalMessage#isStrict <em>Strict</em>}</li>
 *   <li>{@link org.scenariotools.sml.ModalMessage#isMonitored <em>Monitored</em>}</li>
 *   <li>{@link org.scenariotools.sml.ModalMessage#getExpectationKind <em>Expectation Kind</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getModalMessage()
 * @model
 * @generated
 */
public interface ModalMessage extends InteractionFragment, Message {
	/**
	 * Returns the value of the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strict</em>' attribute.
	 * @see #setStrict(boolean)
	 * @see org.scenariotools.sml.SmlPackage#getModalMessage_Strict()
	 * @model
	 * @generated
	 */
	boolean isStrict();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.ModalMessage#isStrict <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict</em>' attribute.
	 * @see #isStrict()
	 * @generated
	 */
	void setStrict(boolean value);

	/**
	 * Returns the value of the '<em><b>Monitored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored</em>' attribute.
	 * @see #setMonitored(boolean)
	 * @see org.scenariotools.sml.SmlPackage#getModalMessage_Monitored()
	 * @model
	 * @generated
	 */
	boolean isMonitored();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.ModalMessage#isMonitored <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored</em>' attribute.
	 * @see #isMonitored()
	 * @generated
	 */
	void setMonitored(boolean value);

	/**
	 * Returns the value of the '<em><b>Expectation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.scenariotools.sml.ExpectationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expectation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expectation Kind</em>' attribute.
	 * @see org.scenariotools.sml.ExpectationKind
	 * @see #setExpectationKind(ExpectationKind)
	 * @see org.scenariotools.sml.SmlPackage#getModalMessage_ExpectationKind()
	 * @model
	 * @generated
	 */
	ExpectationKind getExpectationKind();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.ModalMessage#getExpectationKind <em>Expectation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expectation Kind</em>' attribute.
	 * @see org.scenariotools.sml.ExpectationKind
	 * @see #getExpectationKind()
	 * @generated
	 */
	void setExpectationKind(ExpectationKind value);

} // ModalMessage
