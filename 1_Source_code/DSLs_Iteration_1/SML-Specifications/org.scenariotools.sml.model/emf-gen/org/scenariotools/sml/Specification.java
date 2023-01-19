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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.Specification#getName <em>Name</em>}</li>
 *   <li>{@link org.scenariotools.sml.Specification#getImports <em>Imports</em>}</li>
 *   <li>{@link org.scenariotools.sml.Specification#getDomains <em>Domains</em>}</li>
 *   <li>{@link org.scenariotools.sml.Specification#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.scenariotools.sml.Specification#getControllableEClasses <em>Controllable EClasses</em>}</li>
 *   <li>{@link org.scenariotools.sml.Specification#getNonSpontaneousOperations <em>Non Spontaneous Operations</em>}</li>
 *   <li>{@link org.scenariotools.sml.Specification#getCollaborations <em>Collaborations</em>}</li>
 *   <li>{@link org.scenariotools.sml.Specification#getContainedCollaborations <em>Contained Collaborations</em>}</li>
 *   <li>{@link org.scenariotools.sml.Specification#getIncludedCollaborations <em>Included Collaborations</em>}</li>
 *   <li>{@link org.scenariotools.sml.Specification#getEventParameterRanges <em>Event Parameter Ranges</em>}</li>
 *   <li>{@link org.scenariotools.sml.Specification#getChannelOptions <em>Channel Options</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.scenariotools.sml.SmlPackage#getSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Specification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Collaborations</b></em>' reference list.
	 * The list contents are of type {@link org.scenariotools.sml.Collaboration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaborations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaborations</em>' reference list.
	 * @see org.scenariotools.sml.SmlPackage#getSpecification_Collaborations()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<Collaboration> getCollaborations();

	/**
	 * Returns the value of the '<em><b>Contained Collaborations</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.Collaboration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Collaborations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Collaborations</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getSpecification_ContainedCollaborations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collaboration> getContainedCollaborations();

	/**
	 * Returns the value of the '<em><b>Included Collaborations</b></em>' reference list.
	 * The list contents are of type {@link org.scenariotools.sml.Collaboration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Collaborations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Collaborations</em>' reference list.
	 * @see org.scenariotools.sml.SmlPackage#getSpecification_IncludedCollaborations()
	 * @model
	 * @generated
	 */
	EList<Collaboration> getIncludedCollaborations();

	/**
	 * Returns the value of the '<em><b>Event Parameter Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.EventParameterRanges}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Parameter Ranges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Parameter Ranges</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getSpecification_EventParameterRanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventParameterRanges> getEventParameterRanges();

	/**
	 * Returns the value of the '<em><b>Channel Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Options</em>' containment reference.
	 * @see #setChannelOptions(ChannelOptions)
	 * @see org.scenariotools.sml.SmlPackage#getSpecification_ChannelOptions()
	 * @model containment="true"
	 * @generated
	 */
	ChannelOptions getChannelOptions();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Specification#getChannelOptions <em>Channel Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Options</em>' containment reference.
	 * @see #getChannelOptions()
	 * @generated
	 */
	void setChannelOptions(ChannelOptions value);

	/**
	 * Returns the value of the '<em><b>Domains</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' reference list.
	 * @see org.scenariotools.sml.SmlPackage#getSpecification_Domains()
	 * @model
	 * @generated
	 */
	EList<EPackage> getDomains();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' reference list.
	 * @see org.scenariotools.sml.SmlPackage#getSpecification_Contexts()
	 * @model
	 * @generated
	 */
	EList<EPackage> getContexts();

	/**
	 * Returns the value of the '<em><b>Controllable EClasses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controllable EClasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllable EClasses</em>' reference list.
	 * @see org.scenariotools.sml.SmlPackage#getSpecification_ControllableEClasses()
	 * @model
	 * @generated
	 */
	EList<EClass> getControllableEClasses();

	/**
	 * Returns the value of the '<em><b>Non Spontaneous Operations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.ETypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Spontaneous Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Spontaneous Operations</em>' reference list.
	 * @see org.scenariotools.sml.SmlPackage#getSpecification_NonSpontaneousOperations()
	 * @model
	 * @generated
	 */
	EList<ETypedElement> getNonSpontaneousOperations();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.DummyExprClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getSpecification_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<DummyExprClass> getImports();

} // Specification
