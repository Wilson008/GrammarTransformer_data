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
import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Parameter Ranges</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.EventParameterRanges#getEvent <em>Event</em>}</li>
 *   <li>{@link org.scenariotools.sml.EventParameterRanges#getRangesForParameter <em>Ranges For Parameter</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getEventParameterRanges()
 * @model
 * @generated
 */
public interface EventParameterRanges extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(ETypedElement)
	 * @see org.scenariotools.sml.SmlPackage#getEventParameterRanges_Event()
	 * @model
	 * @generated
	 */
	ETypedElement getEvent();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.EventParameterRanges#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(ETypedElement value);

	/**
	 * Returns the value of the '<em><b>Ranges For Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.RangesForParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranges For Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranges For Parameter</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getEventParameterRanges_RangesForParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<RangesForParameter> getRangesForParameter();

} // EventParameterRanges
