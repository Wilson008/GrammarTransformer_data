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
 * A representation of the model object '<em><b>Wait Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.WaitCondition#isStrict <em>Strict</em>}</li>
 *   <li>{@link org.scenariotools.sml.WaitCondition#isRequested <em>Requested</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getWaitCondition()
 * @model
 * @generated
 */
public interface WaitCondition extends ConditionFragment {
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
	 * @see org.scenariotools.sml.SmlPackage#getWaitCondition_Strict()
	 * @model
	 * @generated
	 */
	boolean isStrict();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.WaitCondition#isStrict <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict</em>' attribute.
	 * @see #isStrict()
	 * @generated
	 */
	void setStrict(boolean value);

	/**
	 * Returns the value of the '<em><b>Requested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested</em>' attribute.
	 * @see #setRequested(boolean)
	 * @see org.scenariotools.sml.SmlPackage#getWaitCondition_Requested()
	 * @model
	 * @generated
	 */
	boolean isRequested();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.WaitCondition#isRequested <em>Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested</em>' attribute.
	 * @see #isRequested()
	 * @generated
	 */
	void setRequested(boolean value);

} // WaitCondition
