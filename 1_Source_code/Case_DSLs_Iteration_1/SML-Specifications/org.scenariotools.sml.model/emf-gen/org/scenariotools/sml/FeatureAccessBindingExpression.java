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
 * A representation of the model object '<em><b>Feature Access Binding Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.FeatureAccessBindingExpression#getFeatureaccess <em>Featureaccess</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getFeatureAccessBindingExpression()
 * @model
 * @generated
 */
public interface FeatureAccessBindingExpression extends BindingExpression {
	/**
	 * Returns the value of the '<em><b>Featureaccess</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featureaccess</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featureaccess</em>' containment reference.
	 * @see #setFeatureaccess(DummyExprClass)
	 * @see org.scenariotools.sml.SmlPackage#getFeatureAccessBindingExpression_Featureaccess()
	 * @model containment="true"
	 * @generated
	 */
	DummyExprClass getFeatureaccess();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.FeatureAccessBindingExpression#getFeatureaccess <em>Featureaccess</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featureaccess</em>' containment reference.
	 * @see #getFeatureaccess()
	 * @generated
	 */
	void setFeatureaccess(DummyExprClass value);

} // FeatureAccessBindingExpression
