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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.ConstraintBlock#getConsider <em>Consider</em>}</li>
 *   <li>{@link org.scenariotools.sml.ConstraintBlock#getIgnore <em>Ignore</em>}</li>
 *   <li>{@link org.scenariotools.sml.ConstraintBlock#getInterrupt <em>Interrupt</em>}</li>
 *   <li>{@link org.scenariotools.sml.ConstraintBlock#getForbidden <em>Forbidden</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getConstraintBlock()
 * @model
 * @generated
 */
public interface ConstraintBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Consider</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consider</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consider</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getConstraintBlock_Consider()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Message> getConsider();

	/**
	 * Returns the value of the '<em><b>Ignore</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getConstraintBlock_Ignore()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Message> getIgnore();

	/**
	 * Returns the value of the '<em><b>Interrupt</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupt</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getConstraintBlock_Interrupt()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Message> getInterrupt();

	/**
	 * Returns the value of the '<em><b>Forbidden</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forbidden</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forbidden</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getConstraintBlock_Forbidden()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Message> getForbidden();

} // ConstraintBlock
