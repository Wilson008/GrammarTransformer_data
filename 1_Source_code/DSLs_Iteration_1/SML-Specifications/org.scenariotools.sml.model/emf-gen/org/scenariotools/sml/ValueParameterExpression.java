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
 * A representation of the model object '<em><b>Value Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.ValueParameterExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getValueParameterExpression()
 * @model
 * @generated
 */
public interface ValueParameterExpression extends ParameterExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DummyExprClass)
	 * @see org.scenariotools.sml.SmlPackage#getValueParameterExpression_Value()
	 * @model containment="true"
	 * @generated
	 */
	DummyExprClass getValue();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.ValueParameterExpression#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DummyExprClass value);

} // ValueParameterExpression
