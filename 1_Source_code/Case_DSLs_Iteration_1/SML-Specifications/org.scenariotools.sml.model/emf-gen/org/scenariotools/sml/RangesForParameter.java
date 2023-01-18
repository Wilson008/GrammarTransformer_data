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
import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranges For Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.RangesForParameter#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.scenariotools.sml.RangesForParameter#getRanges <em>Ranges</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getRangesForParameter()
 * @model
 * @generated
 */
public interface RangesForParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ETypedElement)
	 * @see org.scenariotools.sml.SmlPackage#getRangesForParameter_Parameter()
	 * @model
	 * @generated
	 */
	ETypedElement getParameter();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.RangesForParameter#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ETypedElement value);

	/**
	 * Returns the value of the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranges</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranges</em>' containment reference.
	 * @see #setRanges(AbstractRanges)
	 * @see org.scenariotools.sml.SmlPackage#getRangesForParameter_Ranges()
	 * @model containment="true"
	 * @generated
	 */
	AbstractRanges getRanges();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.RangesForParameter#getRanges <em>Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranges</em>' containment reference.
	 * @see #getRanges()
	 * @generated
	 */
	void setRanges(AbstractRanges value);

} // RangesForParameter
