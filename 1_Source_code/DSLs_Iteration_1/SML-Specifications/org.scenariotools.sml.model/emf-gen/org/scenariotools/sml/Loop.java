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
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.Loop#getBodyInteraction <em>Body Interaction</em>}</li>
 *   <li>{@link org.scenariotools.sml.Loop#getLoopCondition <em>Loop Condition</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Body Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Interaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Interaction</em>' containment reference.
	 * @see #setBodyInteraction(Interaction)
	 * @see org.scenariotools.sml.SmlPackage#getLoop_BodyInteraction()
	 * @model containment="true"
	 * @generated
	 */
	Interaction getBodyInteraction();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Loop#getBodyInteraction <em>Body Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Interaction</em>' containment reference.
	 * @see #getBodyInteraction()
	 * @generated
	 */
	void setBodyInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Condition</em>' containment reference.
	 * @see #setLoopCondition(Condition)
	 * @see org.scenariotools.sml.SmlPackage#getLoop_LoopCondition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getLoopCondition();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Loop#getLoopCondition <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Condition</em>' containment reference.
	 * @see #getLoopCondition()
	 * @generated
	 */
	void setLoopCondition(Condition value);

} // Loop
