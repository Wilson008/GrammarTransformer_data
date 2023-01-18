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
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.Case#getCaseInteraction <em>Case Interaction</em>}</li>
 *   <li>{@link org.scenariotools.sml.Case#getCaseCondition <em>Case Condition</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends EObject {
	/**
	 * Returns the value of the '<em><b>Case Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Interaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Interaction</em>' containment reference.
	 * @see #setCaseInteraction(Interaction)
	 * @see org.scenariotools.sml.SmlPackage#getCase_CaseInteraction()
	 * @model containment="true"
	 * @generated
	 */
	Interaction getCaseInteraction();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Case#getCaseInteraction <em>Case Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Interaction</em>' containment reference.
	 * @see #getCaseInteraction()
	 * @generated
	 */
	void setCaseInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Case Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Condition</em>' containment reference.
	 * @see #setCaseCondition(Condition)
	 * @see org.scenariotools.sml.SmlPackage#getCase_CaseCondition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCaseCondition();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Case#getCaseCondition <em>Case Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Condition</em>' containment reference.
	 * @see #getCaseCondition()
	 * @generated
	 */
	void setCaseCondition(Condition value);

} // Case
