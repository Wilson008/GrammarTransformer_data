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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.Interaction#getFragments <em>Fragments</em>}</li>
 *   <li>{@link org.scenariotools.sml.Interaction#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends InteractionFragment, DummyExprClass {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.InteractionFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getInteraction_Fragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragments();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(ConstraintBlock)
	 * @see org.scenariotools.sml.SmlPackage#getInteraction_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	ConstraintBlock getConstraints();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Interaction#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(ConstraintBlock value);

} // Interaction
