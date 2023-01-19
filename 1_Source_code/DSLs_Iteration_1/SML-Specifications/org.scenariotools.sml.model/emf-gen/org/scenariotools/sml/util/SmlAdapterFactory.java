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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.scenariotools.sml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.scenariotools.sml.SmlPackage
 * @generated
 */
public class SmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmlSwitch<Adapter> modelSwitch =
		new SmlSwitch<Adapter>() {
			@Override
			public Adapter caseSpecification(Specification object) {
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseCollaboration(Collaboration object) {
				return createCollaborationAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseConstraintBlock(ConstraintBlock object) {
				return createConstraintBlockAdapter();
			}
			@Override
			public Adapter caseInteractionFragment(InteractionFragment object) {
				return createInteractionFragmentAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseModalMessage(ModalMessage object) {
				return createModalMessageAdapter();
			}
			@Override
			public Adapter caseAlternative(Alternative object) {
				return createAlternativeAdapter();
			}
			@Override
			public Adapter caseCase(Case object) {
				return createCaseAdapter();
			}
			@Override
			public Adapter caseLoop(Loop object) {
				return createLoopAdapter();
			}
			@Override
			public Adapter caseParallel(Parallel object) {
				return createParallelAdapter();
			}
			@Override
			public Adapter caseConditionFragment(ConditionFragment object) {
				return createConditionFragmentAdapter();
			}
			@Override
			public Adapter caseWaitCondition(WaitCondition object) {
				return createWaitConditionAdapter();
			}
			@Override
			public Adapter caseInterruptCondition(InterruptCondition object) {
				return createInterruptConditionAdapter();
			}
			@Override
			public Adapter caseViolationCondition(ViolationCondition object) {
				return createViolationConditionAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseConditionExpression(ConditionExpression object) {
				return createConditionExpressionAdapter();
			}
			@Override
			public Adapter caseVariableFragment(VariableFragment object) {
				return createVariableFragmentAdapter();
			}
			@Override
			public Adapter caseBindingConstraint(BindingConstraint object) {
				return createBindingConstraintAdapter();
			}
			@Override
			public Adapter caseRoleBindingConstraint(RoleBindingConstraint object) {
				return createRoleBindingConstraintAdapter();
			}
			@Override
			public Adapter caseParameterBinding(ParameterBinding object) {
				return createParameterBindingAdapter();
			}
			@Override
			public Adapter caseBindingExpression(BindingExpression object) {
				return createBindingExpressionAdapter();
			}
			@Override
			public Adapter caseFeatureAccessBindingExpression(FeatureAccessBindingExpression object) {
				return createFeatureAccessBindingExpressionAdapter();
			}
			@Override
			public Adapter caseObjectQueryBindingExpression(ObjectQueryBindingExpression object) {
				return createObjectQueryBindingExpressionAdapter();
			}
			@Override
			public Adapter caseObjectQueryValue(ObjectQueryValue object) {
				return createObjectQueryValueAdapter();
			}
			@Override
			public Adapter caseParameterExpression(ParameterExpression object) {
				return createParameterExpressionAdapter();
			}
			@Override
			public Adapter caseWildcardParameterExpression(WildcardParameterExpression object) {
				return createWildcardParameterExpressionAdapter();
			}
			@Override
			public Adapter caseValueParameterExpression(ValueParameterExpression object) {
				return createValueParameterExpressionAdapter();
			}
			@Override
			public Adapter caseVariableBindingParameterExpression(VariableBindingParameterExpression object) {
				return createVariableBindingParameterExpressionAdapter();
			}
			@Override
			public Adapter caseEventParameterRanges(EventParameterRanges object) {
				return createEventParameterRangesAdapter();
			}
			@Override
			public Adapter caseRangesForParameter(RangesForParameter object) {
				return createRangesForParameterAdapter();
			}
			@Override
			public Adapter caseAbstractRanges(AbstractRanges object) {
				return createAbstractRangesAdapter();
			}
			@Override
			public Adapter caseIntegerRanges(IntegerRanges object) {
				return createIntegerRangesAdapter();
			}
			@Override
			public Adapter caseStringRanges(StringRanges object) {
				return createStringRangesAdapter();
			}
			@Override
			public Adapter caseEnumRanges(EnumRanges object) {
				return createEnumRangesAdapter();
			}
			@Override
			public Adapter caseChannelOptions(ChannelOptions object) {
				return createChannelOptionsAdapter();
			}
			@Override
			public Adapter caseMessageChannel(MessageChannel object) {
				return createMessageChannelAdapter();
			}
			@Override
			public Adapter caseTimedViolationCondition(TimedViolationCondition object) {
				return createTimedViolationConditionAdapter();
			}
			@Override
			public Adapter caseTimedInterruptCondition(TimedInterruptCondition object) {
				return createTimedInterruptConditionAdapter();
			}
			@Override
			public Adapter caseTimedWaitCondition(TimedWaitCondition object) {
				return createTimedWaitConditionAdapter();
			}
			@Override
			public Adapter caseTimedConditionFragment(TimedConditionFragment object) {
				return createTimedConditionFragmentAdapter();
			}
			@Override
			public Adapter caseClockFragment(ClockFragment object) {
				return createClockFragmentAdapter();
			}
			@Override
			public Adapter caseDummyExprClass(DummyExprClass object) {
				return createDummyExprClassAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.Collaboration
	 * @generated
	 */
	public Adapter createCollaborationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ConstraintBlock <em>Constraint Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ConstraintBlock
	 * @generated
	 */
	public Adapter createConstraintBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.InteractionFragment
	 * @generated
	 */
	public Adapter createInteractionFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ModalMessage <em>Modal Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ModalMessage
	 * @generated
	 */
	public Adapter createModalMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.Alternative
	 * @generated
	 */
	public Adapter createAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.Case
	 * @generated
	 */
	public Adapter createCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.Parallel
	 * @generated
	 */
	public Adapter createParallelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ConditionFragment <em>Condition Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ConditionFragment
	 * @generated
	 */
	public Adapter createConditionFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.WaitCondition <em>Wait Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.WaitCondition
	 * @generated
	 */
	public Adapter createWaitConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.InterruptCondition <em>Interrupt Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.InterruptCondition
	 * @generated
	 */
	public Adapter createInterruptConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ViolationCondition <em>Violation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ViolationCondition
	 * @generated
	 */
	public Adapter createViolationConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ConditionExpression
	 * @generated
	 */
	public Adapter createConditionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.VariableFragment <em>Variable Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.VariableFragment
	 * @generated
	 */
	public Adapter createVariableFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.BindingConstraint <em>Binding Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.BindingConstraint
	 * @generated
	 */
	public Adapter createBindingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.RoleBindingConstraint <em>Role Binding Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.RoleBindingConstraint
	 * @generated
	 */
	public Adapter createRoleBindingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ParameterBinding
	 * @generated
	 */
	public Adapter createParameterBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.BindingExpression <em>Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.BindingExpression
	 * @generated
	 */
	public Adapter createBindingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.FeatureAccessBindingExpression <em>Feature Access Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.FeatureAccessBindingExpression
	 * @generated
	 */
	public Adapter createFeatureAccessBindingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ObjectQueryBindingExpression <em>Object Query Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ObjectQueryBindingExpression
	 * @generated
	 */
	public Adapter createObjectQueryBindingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ObjectQueryValue <em>Object Query Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ObjectQueryValue
	 * @generated
	 */
	public Adapter createObjectQueryValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ParameterExpression <em>Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ParameterExpression
	 * @generated
	 */
	public Adapter createParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.WildcardParameterExpression <em>Wildcard Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.WildcardParameterExpression
	 * @generated
	 */
	public Adapter createWildcardParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ValueParameterExpression <em>Value Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ValueParameterExpression
	 * @generated
	 */
	public Adapter createValueParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.VariableBindingParameterExpression <em>Variable Binding Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.VariableBindingParameterExpression
	 * @generated
	 */
	public Adapter createVariableBindingParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.EventParameterRanges <em>Event Parameter Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.EventParameterRanges
	 * @generated
	 */
	public Adapter createEventParameterRangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.RangesForParameter <em>Ranges For Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.RangesForParameter
	 * @generated
	 */
	public Adapter createRangesForParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.AbstractRanges <em>Abstract Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.AbstractRanges
	 * @generated
	 */
	public Adapter createAbstractRangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.IntegerRanges <em>Integer Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.IntegerRanges
	 * @generated
	 */
	public Adapter createIntegerRangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.StringRanges <em>String Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.StringRanges
	 * @generated
	 */
	public Adapter createStringRangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.EnumRanges <em>Enum Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.EnumRanges
	 * @generated
	 */
	public Adapter createEnumRangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ChannelOptions <em>Channel Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ChannelOptions
	 * @generated
	 */
	public Adapter createChannelOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.MessageChannel <em>Message Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.MessageChannel
	 * @generated
	 */
	public Adapter createMessageChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.TimedViolationCondition <em>Timed Violation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.TimedViolationCondition
	 * @generated
	 */
	public Adapter createTimedViolationConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.TimedInterruptCondition <em>Timed Interrupt Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.TimedInterruptCondition
	 * @generated
	 */
	public Adapter createTimedInterruptConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.TimedWaitCondition <em>Timed Wait Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.TimedWaitCondition
	 * @generated
	 */
	public Adapter createTimedWaitConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.TimedConditionFragment <em>Timed Condition Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.TimedConditionFragment
	 * @generated
	 */
	public Adapter createTimedConditionFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.ClockFragment <em>Clock Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.ClockFragment
	 * @generated
	 */
	public Adapter createClockFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.scenariotools.sml.DummyExprClass <em>Dummy Expr Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scenariotools.sml.DummyExprClass
	 * @generated
	 */
	public Adapter createDummyExprClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SmlAdapterFactory
