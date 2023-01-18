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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link org.scenariotools.sml.Scenario#isSingular <em>Singular</em>}</li>
 *   <li>{@link org.scenariotools.sml.Scenario#getKind <em>Kind</em>}</li>
 *   <li>{@link org.scenariotools.sml.Scenario#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.scenariotools.sml.Scenario#getRoleBindings <em>Role Bindings</em>}</li>
 *   <li>{@link org.scenariotools.sml.Scenario#getOwnedInteraction <em>Owned Interaction</em>}</li>
 *   <li>{@link org.scenariotools.sml.Scenario#isOptimizeCost <em>Optimize Cost</em>}</li>
 *   <li>{@link org.scenariotools.sml.Scenario#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see org.scenariotools.sml.SmlPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.scenariotools.sml.SmlPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Singular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singular</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singular</em>' attribute.
	 * @see #setSingular(boolean)
	 * @see org.scenariotools.sml.SmlPackage#getScenario_Singular()
	 * @model
	 * @generated
	 */
	boolean isSingular();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Scenario#isSingular <em>Singular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singular</em>' attribute.
	 * @see #isSingular()
	 * @generated
	 */
	void setSingular(boolean value);

	/**
	 * Returns the value of the '<em><b>Role Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.scenariotools.sml.RoleBindingConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Bindings</em>' containment reference list.
	 * @see org.scenariotools.sml.SmlPackage#getScenario_RoleBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleBindingConstraint> getRoleBindings();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.scenariotools.sml.ScenarioKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.scenariotools.sml.ScenarioKind
	 * @see #setKind(ScenarioKind)
	 * @see org.scenariotools.sml.SmlPackage#getScenario_Kind()
	 * @model
	 * @generated
	 */
	ScenarioKind getKind();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Scenario#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.scenariotools.sml.ScenarioKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ScenarioKind value);

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' reference list.
	 * @see org.scenariotools.sml.SmlPackage#getScenario_Contexts()
	 * @model
	 * @generated
	 */
	EList<EClass> getContexts();

	/**
	 * Returns the value of the '<em><b>Owned Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Interaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Interaction</em>' containment reference.
	 * @see #setOwnedInteraction(Interaction)
	 * @see org.scenariotools.sml.SmlPackage#getScenario_OwnedInteraction()
	 * @model containment="true"
	 * @generated
	 */
	Interaction getOwnedInteraction();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Scenario#getOwnedInteraction <em>Owned Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Interaction</em>' containment reference.
	 * @see #getOwnedInteraction()
	 * @generated
	 */
	void setOwnedInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Optimize Cost</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimize Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimize Cost</em>' attribute.
	 * @see #setOptimizeCost(boolean)
	 * @see org.scenariotools.sml.SmlPackage#getScenario_OptimizeCost()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOptimizeCost();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Scenario#isOptimizeCost <em>Optimize Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimize Cost</em>' attribute.
	 * @see #isOptimizeCost()
	 * @generated
	 */
	void setOptimizeCost(boolean value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see org.scenariotools.sml.SmlPackage#getScenario_Cost()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link org.scenariotools.sml.Scenario#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

} // Scenario
