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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Query Binding Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.ObjectQueryBindingExpression#getQueryClass <em>Query Class</em>}</li>
 *   <li>{@link org.scenariotools.sml.ObjectQueryBindingExpression#getQueryValues <em>Query Values</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getObjectQueryBindingExpression()
 * @model
 * @generated
 */
public interface ObjectQueryBindingExpression extends BindingExpression {
	/**
	 * Returns the value of the '<em><b>Query Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Class</em>' reference.
	 * @see #setQueryClass(EClass)
	 * @see org.scenariotools.sml.SmlPackage#getObjectQueryBindingExpression_QueryClass()
	 * @model
	 * @generated
	 */
	EClass getQueryClass();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.ObjectQueryBindingExpression#getQueryClass <em>Query Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Class</em>' reference.
	 * @see #getQueryClass()
	 * @generated
	 */
	void setQueryClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Query Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.ObjectQueryValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Values</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getObjectQueryBindingExpression_QueryValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectQueryValue> getQueryValues();

} // ObjectQueryBindingExpression
