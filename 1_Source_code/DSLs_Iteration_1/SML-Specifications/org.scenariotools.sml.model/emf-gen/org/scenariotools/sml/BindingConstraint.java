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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.BindingConstraint#getBindingExpression <em>Binding Expression</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getBindingConstraint()
 * @model abstract="true"
 * @generated
 */
public interface BindingConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Expression</em>' containment reference.
	 * @see #setBindingExpression(BindingExpression)
	 * @see org.scenariotools.sml.SmlPackage#getBindingConstraint_BindingExpression()
	 * @model containment="true"
	 * @generated
	 */
	BindingExpression getBindingExpression();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.BindingConstraint#getBindingExpression <em>Binding Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Expression</em>' containment reference.
	 * @see #getBindingExpression()
	 * @generated
	 */
	void setBindingExpression(BindingExpression value);

} // BindingConstraint
