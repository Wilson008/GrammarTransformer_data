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
package org.scenariotools.sml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.scenariotools.sml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.scenariotools.sml.SmlPackage
 * @generated
 */
public class SmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmlSwitch() {
		if (modelPackage == null) {
			modelPackage = SmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SmlPackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.COLLABORATION: {
				Collaboration collaboration = (Collaboration)theEObject;
				T result = caseCollaboration(collaboration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.CONSTRAINT_BLOCK: {
				ConstraintBlock constraintBlock = (ConstraintBlock)theEObject;
				T result = caseConstraintBlock(constraintBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.INTERACTION_FRAGMENT: {
				InteractionFragment interactionFragment = (InteractionFragment)theEObject;
				T result = caseInteractionFragment(interactionFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseInteractionFragment(interaction);
				if (result == null) result = caseDummyExprClass(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.MODAL_MESSAGE: {
				ModalMessage modalMessage = (ModalMessage)theEObject;
				T result = caseModalMessage(modalMessage);
				if (result == null) result = caseInteractionFragment(modalMessage);
				if (result == null) result = caseMessage(modalMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.ALTERNATIVE: {
				Alternative alternative = (Alternative)theEObject;
				T result = caseAlternative(alternative);
				if (result == null) result = caseInteractionFragment(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.LOOP: {
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseInteractionFragment(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.PARALLEL: {
				Parallel parallel = (Parallel)theEObject;
				T result = caseParallel(parallel);
				if (result == null) result = caseInteractionFragment(parallel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.CONDITION_FRAGMENT: {
				ConditionFragment conditionFragment = (ConditionFragment)theEObject;
				T result = caseConditionFragment(conditionFragment);
				if (result == null) result = caseInteractionFragment(conditionFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.WAIT_CONDITION: {
				WaitCondition waitCondition = (WaitCondition)theEObject;
				T result = caseWaitCondition(waitCondition);
				if (result == null) result = caseConditionFragment(waitCondition);
				if (result == null) result = caseInteractionFragment(waitCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.INTERRUPT_CONDITION: {
				InterruptCondition interruptCondition = (InterruptCondition)theEObject;
				T result = caseInterruptCondition(interruptCondition);
				if (result == null) result = caseConditionFragment(interruptCondition);
				if (result == null) result = caseInteractionFragment(interruptCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.VIOLATION_CONDITION: {
				ViolationCondition violationCondition = (ViolationCondition)theEObject;
				T result = caseViolationCondition(violationCondition);
				if (result == null) result = caseConditionFragment(violationCondition);
				if (result == null) result = caseInteractionFragment(violationCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseConditionFragment(condition);
				if (result == null) result = caseInteractionFragment(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.CONDITION_EXPRESSION: {
				ConditionExpression conditionExpression = (ConditionExpression)theEObject;
				T result = caseConditionExpression(conditionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.VARIABLE_FRAGMENT: {
				VariableFragment variableFragment = (VariableFragment)theEObject;
				T result = caseVariableFragment(variableFragment);
				if (result == null) result = caseInteractionFragment(variableFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.BINDING_CONSTRAINT: {
				BindingConstraint bindingConstraint = (BindingConstraint)theEObject;
				T result = caseBindingConstraint(bindingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.ROLE_BINDING_CONSTRAINT: {
				RoleBindingConstraint roleBindingConstraint = (RoleBindingConstraint)theEObject;
				T result = caseRoleBindingConstraint(roleBindingConstraint);
				if (result == null) result = caseBindingConstraint(roleBindingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.PARAMETER_BINDING: {
				ParameterBinding parameterBinding = (ParameterBinding)theEObject;
				T result = caseParameterBinding(parameterBinding);
				if (result == null) result = caseBindingConstraint(parameterBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.BINDING_EXPRESSION: {
				BindingExpression bindingExpression = (BindingExpression)theEObject;
				T result = caseBindingExpression(bindingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION: {
				FeatureAccessBindingExpression featureAccessBindingExpression = (FeatureAccessBindingExpression)theEObject;
				T result = caseFeatureAccessBindingExpression(featureAccessBindingExpression);
				if (result == null) result = caseBindingExpression(featureAccessBindingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION: {
				ObjectQueryBindingExpression objectQueryBindingExpression = (ObjectQueryBindingExpression)theEObject;
				T result = caseObjectQueryBindingExpression(objectQueryBindingExpression);
				if (result == null) result = caseBindingExpression(objectQueryBindingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.OBJECT_QUERY_VALUE: {
				ObjectQueryValue objectQueryValue = (ObjectQueryValue)theEObject;
				T result = caseObjectQueryValue(objectQueryValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.PARAMETER_EXPRESSION: {
				ParameterExpression parameterExpression = (ParameterExpression)theEObject;
				T result = caseParameterExpression(parameterExpression);
				if (result == null) result = caseBindingExpression(parameterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.WILDCARD_PARAMETER_EXPRESSION: {
				WildcardParameterExpression wildcardParameterExpression = (WildcardParameterExpression)theEObject;
				T result = caseWildcardParameterExpression(wildcardParameterExpression);
				if (result == null) result = caseParameterExpression(wildcardParameterExpression);
				if (result == null) result = caseBindingExpression(wildcardParameterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.VALUE_PARAMETER_EXPRESSION: {
				ValueParameterExpression valueParameterExpression = (ValueParameterExpression)theEObject;
				T result = caseValueParameterExpression(valueParameterExpression);
				if (result == null) result = caseParameterExpression(valueParameterExpression);
				if (result == null) result = caseBindingExpression(valueParameterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.VARIABLE_BINDING_PARAMETER_EXPRESSION: {
				VariableBindingParameterExpression variableBindingParameterExpression = (VariableBindingParameterExpression)theEObject;
				T result = caseVariableBindingParameterExpression(variableBindingParameterExpression);
				if (result == null) result = caseParameterExpression(variableBindingParameterExpression);
				if (result == null) result = caseBindingExpression(variableBindingParameterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.EVENT_PARAMETER_RANGES: {
				EventParameterRanges eventParameterRanges = (EventParameterRanges)theEObject;
				T result = caseEventParameterRanges(eventParameterRanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.RANGES_FOR_PARAMETER: {
				RangesForParameter rangesForParameter = (RangesForParameter)theEObject;
				T result = caseRangesForParameter(rangesForParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.ABSTRACT_RANGES: {
				AbstractRanges abstractRanges = (AbstractRanges)theEObject;
				T result = caseAbstractRanges(abstractRanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.INTEGER_RANGES: {
				IntegerRanges integerRanges = (IntegerRanges)theEObject;
				T result = caseIntegerRanges(integerRanges);
				if (result == null) result = caseAbstractRanges(integerRanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.STRING_RANGES: {
				StringRanges stringRanges = (StringRanges)theEObject;
				T result = caseStringRanges(stringRanges);
				if (result == null) result = caseAbstractRanges(stringRanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.ENUM_RANGES: {
				EnumRanges enumRanges = (EnumRanges)theEObject;
				T result = caseEnumRanges(enumRanges);
				if (result == null) result = caseAbstractRanges(enumRanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.CHANNEL_OPTIONS: {
				ChannelOptions channelOptions = (ChannelOptions)theEObject;
				T result = caseChannelOptions(channelOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.MESSAGE_CHANNEL: {
				MessageChannel messageChannel = (MessageChannel)theEObject;
				T result = caseMessageChannel(messageChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.TIMED_VIOLATION_CONDITION: {
				TimedViolationCondition timedViolationCondition = (TimedViolationCondition)theEObject;
				T result = caseTimedViolationCondition(timedViolationCondition);
				if (result == null) result = caseTimedConditionFragment(timedViolationCondition);
				if (result == null) result = caseInteractionFragment(timedViolationCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.TIMED_INTERRUPT_CONDITION: {
				TimedInterruptCondition timedInterruptCondition = (TimedInterruptCondition)theEObject;
				T result = caseTimedInterruptCondition(timedInterruptCondition);
				if (result == null) result = caseTimedConditionFragment(timedInterruptCondition);
				if (result == null) result = caseInteractionFragment(timedInterruptCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.TIMED_WAIT_CONDITION: {
				TimedWaitCondition timedWaitCondition = (TimedWaitCondition)theEObject;
				T result = caseTimedWaitCondition(timedWaitCondition);
				if (result == null) result = caseTimedConditionFragment(timedWaitCondition);
				if (result == null) result = caseInteractionFragment(timedWaitCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.TIMED_CONDITION_FRAGMENT: {
				TimedConditionFragment timedConditionFragment = (TimedConditionFragment)theEObject;
				T result = caseTimedConditionFragment(timedConditionFragment);
				if (result == null) result = caseInteractionFragment(timedConditionFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.CLOCK_FRAGMENT: {
				ClockFragment clockFragment = (ClockFragment)theEObject;
				T result = caseClockFragment(clockFragment);
				if (result == null) result = caseInteractionFragment(clockFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmlPackage.DUMMY_EXPR_CLASS: {
				DummyExprClass dummyExprClass = (DummyExprClass)theEObject;
				T result = caseDummyExprClass(dummyExprClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaboration(Collaboration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintBlock(ConstraintBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFragment(InteractionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModalMessage(ModalMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallel(Parallel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionFragment(ConditionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitCondition(WaitCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupt Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupt Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptCondition(InterruptCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Violation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Violation Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViolationCondition(ViolationCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionExpression(ConditionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableFragment(VariableFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingConstraint(BindingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Binding Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Binding Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleBindingConstraint(RoleBindingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterBinding(ParameterBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingExpression(BindingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Access Binding Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Access Binding Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureAccessBindingExpression(FeatureAccessBindingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Query Binding Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Query Binding Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectQueryBindingExpression(ObjectQueryBindingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Query Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Query Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectQueryValue(ObjectQueryValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterExpression(ParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wildcard Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wildcard Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWildcardParameterExpression(WildcardParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueParameterExpression(ValueParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Binding Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Binding Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableBindingParameterExpression(VariableBindingParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Parameter Ranges</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Parameter Ranges</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventParameterRanges(EventParameterRanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ranges For Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ranges For Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangesForParameter(RangesForParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Ranges</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Ranges</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRanges(AbstractRanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Ranges</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Ranges</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerRanges(IntegerRanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Ranges</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Ranges</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringRanges(StringRanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Ranges</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Ranges</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumRanges(EnumRanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelOptions(ChannelOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageChannel(MessageChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Violation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Violation Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedViolationCondition(TimedViolationCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Interrupt Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Interrupt Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedInterruptCondition(TimedInterruptCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Wait Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Wait Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedWaitCondition(TimedWaitCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Condition Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Condition Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedConditionFragment(TimedConditionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockFragment(ClockFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dummy Expr Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dummy Expr Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDummyExprClass(DummyExprClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SmlSwitch
