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
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.Parallel#getParallelInteraction <em>Parallel Interaction</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Parallel Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.Interaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Interaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Interaction</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getParallel_ParallelInteraction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interaction> getParallelInteraction();

} // Parallel
