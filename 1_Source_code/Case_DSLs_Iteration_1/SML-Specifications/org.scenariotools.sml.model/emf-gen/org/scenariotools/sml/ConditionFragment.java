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
 * A representation of the model object '<em><b>Condition Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.ConditionFragment#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getConditionFragment()
 * @model abstract="true"
 * @generated
 */
public interface ConditionFragment extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expression</em>' containment reference.
	 * @see #setConditionExpression(ConditionExpression)
	 * @see org.scenariotools.sml.SmlPackage#getConditionFragment_ConditionExpression()
	 * @model containment="true"
	 * @generated
	 */
	ConditionExpression getConditionExpression();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.ConditionFragment#getConditionExpression <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' containment reference.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(ConditionExpression value);

} // ConditionFragment
