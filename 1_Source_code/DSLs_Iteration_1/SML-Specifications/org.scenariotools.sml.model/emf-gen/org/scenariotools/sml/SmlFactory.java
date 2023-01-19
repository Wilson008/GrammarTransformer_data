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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.scenariotools.sml.SmlPackage
 * @generated
 */
public interface SmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmlFactory eINSTANCE = org.scenariotools.sml.impl.SmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	Specification createSpecification();

	/**
	 * Returns a new object of class '<em>Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaboration</em>'.
	 * @generated
	 */
	Collaboration createCollaboration();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Constraint Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Block</em>'.
	 * @generated
	 */
	ConstraintBlock createConstraintBlock();

	/**
	 * Returns a new object of class '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction</em>'.
	 * @generated
	 */
	Interaction createInteraction();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Modal Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modal Message</em>'.
	 * @generated
	 */
	ModalMessage createModalMessage();

	/**
	 * Returns a new object of class '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative</em>'.
	 * @generated
	 */
	Alternative createAlternative();

	/**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
	Case createCase();

	/**
	 * Returns a new object of class '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop</em>'.
	 * @generated
	 */
	Loop createLoop();

	/**
	 * Returns a new object of class '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel</em>'.
	 * @generated
	 */
	Parallel createParallel();

	/**
	 * Returns a new object of class '<em>Wait Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait Condition</em>'.
	 * @generated
	 */
	WaitCondition createWaitCondition();

	/**
	 * Returns a new object of class '<em>Interrupt Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interrupt Condition</em>'.
	 * @generated
	 */
	InterruptCondition createInterruptCondition();

	/**
	 * Returns a new object of class '<em>Violation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Violation Condition</em>'.
	 * @generated
	 */
	ViolationCondition createViolationCondition();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Condition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Expression</em>'.
	 * @generated
	 */
	ConditionExpression createConditionExpression();

	/**
	 * Returns a new object of class '<em>Variable Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Fragment</em>'.
	 * @generated
	 */
	VariableFragment createVariableFragment();

	/**
	 * Returns a new object of class '<em>Role Binding Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Binding Constraint</em>'.
	 * @generated
	 */
	RoleBindingConstraint createRoleBindingConstraint();

	/**
	 * Returns a new object of class '<em>Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Binding</em>'.
	 * @generated
	 */
	ParameterBinding createParameterBinding();

	/**
	 * Returns a new object of class '<em>Feature Access Binding Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Access Binding Expression</em>'.
	 * @generated
	 */
	FeatureAccessBindingExpression createFeatureAccessBindingExpression();

	/**
	 * Returns a new object of class '<em>Object Query Binding Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Query Binding Expression</em>'.
	 * @generated
	 */
	ObjectQueryBindingExpression createObjectQueryBindingExpression();

	/**
	 * Returns a new object of class '<em>Object Query Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Query Value</em>'.
	 * @generated
	 */
	ObjectQueryValue createObjectQueryValue();

	/**
	 * Returns a new object of class '<em>Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Expression</em>'.
	 * @generated
	 */
	ParameterExpression createParameterExpression();

	/**
	 * Returns a new object of class '<em>Wildcard Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wildcard Parameter Expression</em>'.
	 * @generated
	 */
	WildcardParameterExpression createWildcardParameterExpression();

	/**
	 * Returns a new object of class '<em>Value Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Parameter Expression</em>'.
	 * @generated
	 */
	ValueParameterExpression createValueParameterExpression();

	/**
	 * Returns a new object of class '<em>Variable Binding Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Binding Parameter Expression</em>'.
	 * @generated
	 */
	VariableBindingParameterExpression createVariableBindingParameterExpression();

	/**
	 * Returns a new object of class '<em>Event Parameter Ranges</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Parameter Ranges</em>'.
	 * @generated
	 */
	EventParameterRanges createEventParameterRanges();

	/**
	 * Returns a new object of class '<em>Ranges For Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ranges For Parameter</em>'.
	 * @generated
	 */
	RangesForParameter createRangesForParameter();

	/**
	 * Returns a new object of class '<em>Integer Ranges</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Ranges</em>'.
	 * @generated
	 */
	IntegerRanges createIntegerRanges();

	/**
	 * Returns a new object of class '<em>String Ranges</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Ranges</em>'.
	 * @generated
	 */
	StringRanges createStringRanges();

	/**
	 * Returns a new object of class '<em>Enum Ranges</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Ranges</em>'.
	 * @generated
	 */
	EnumRanges createEnumRanges();

	/**
	 * Returns a new object of class '<em>Channel Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Options</em>'.
	 * @generated
	 */
	ChannelOptions createChannelOptions();

	/**
	 * Returns a new object of class '<em>Message Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Channel</em>'.
	 * @generated
	 */
	MessageChannel createMessageChannel();

	/**
	 * Returns a new object of class '<em>Timed Violation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Violation Condition</em>'.
	 * @generated
	 */
	TimedViolationCondition createTimedViolationCondition();

	/**
	 * Returns a new object of class '<em>Timed Interrupt Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Interrupt Condition</em>'.
	 * @generated
	 */
	TimedInterruptCondition createTimedInterruptCondition();

	/**
	 * Returns a new object of class '<em>Timed Wait Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Wait Condition</em>'.
	 * @generated
	 */
	TimedWaitCondition createTimedWaitCondition();

	/**
	 * Returns a new object of class '<em>Clock Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Fragment</em>'.
	 * @generated
	 */
	ClockFragment createClockFragment();

	/**
	 * Returns a new object of class '<em>Dummy Expr Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dummy Expr Class</em>'.
	 * @generated
	 */
	DummyExprClass createDummyExprClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SmlPackage getSmlPackage();

} //SmlFactory
