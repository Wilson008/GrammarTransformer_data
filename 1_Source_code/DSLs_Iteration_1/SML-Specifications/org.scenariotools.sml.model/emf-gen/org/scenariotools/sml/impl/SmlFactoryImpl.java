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
package org.scenariotools.sml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.scenariotools.sml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmlFactoryImpl extends EFactoryImpl implements SmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmlFactory init() {
		try {
			SmlFactory theSmlFactory = (SmlFactory)EPackage.Registry.INSTANCE.getEFactory(SmlPackage.eNS_URI);
			if (theSmlFactory != null) {
				return theSmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmlPackage.SPECIFICATION: return createSpecification();
			case SmlPackage.COLLABORATION: return createCollaboration();
			case SmlPackage.ROLE: return createRole();
			case SmlPackage.SCENARIO: return createScenario();
			case SmlPackage.CONSTRAINT_BLOCK: return createConstraintBlock();
			case SmlPackage.INTERACTION: return createInteraction();
			case SmlPackage.MESSAGE: return createMessage();
			case SmlPackage.MODAL_MESSAGE: return createModalMessage();
			case SmlPackage.ALTERNATIVE: return createAlternative();
			case SmlPackage.CASE: return createCase();
			case SmlPackage.LOOP: return createLoop();
			case SmlPackage.PARALLEL: return createParallel();
			case SmlPackage.WAIT_CONDITION: return createWaitCondition();
			case SmlPackage.INTERRUPT_CONDITION: return createInterruptCondition();
			case SmlPackage.VIOLATION_CONDITION: return createViolationCondition();
			case SmlPackage.CONDITION: return createCondition();
			case SmlPackage.CONDITION_EXPRESSION: return createConditionExpression();
			case SmlPackage.VARIABLE_FRAGMENT: return createVariableFragment();
			case SmlPackage.ROLE_BINDING_CONSTRAINT: return createRoleBindingConstraint();
			case SmlPackage.PARAMETER_BINDING: return createParameterBinding();
			case SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION: return createFeatureAccessBindingExpression();
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION: return createObjectQueryBindingExpression();
			case SmlPackage.OBJECT_QUERY_VALUE: return createObjectQueryValue();
			case SmlPackage.PARAMETER_EXPRESSION: return createParameterExpression();
			case SmlPackage.WILDCARD_PARAMETER_EXPRESSION: return createWildcardParameterExpression();
			case SmlPackage.VALUE_PARAMETER_EXPRESSION: return createValueParameterExpression();
			case SmlPackage.VARIABLE_BINDING_PARAMETER_EXPRESSION: return createVariableBindingParameterExpression();
			case SmlPackage.EVENT_PARAMETER_RANGES: return createEventParameterRanges();
			case SmlPackage.RANGES_FOR_PARAMETER: return createRangesForParameter();
			case SmlPackage.INTEGER_RANGES: return createIntegerRanges();
			case SmlPackage.STRING_RANGES: return createStringRanges();
			case SmlPackage.ENUM_RANGES: return createEnumRanges();
			case SmlPackage.CHANNEL_OPTIONS: return createChannelOptions();
			case SmlPackage.MESSAGE_CHANNEL: return createMessageChannel();
			case SmlPackage.TIMED_VIOLATION_CONDITION: return createTimedViolationCondition();
			case SmlPackage.TIMED_INTERRUPT_CONDITION: return createTimedInterruptCondition();
			case SmlPackage.TIMED_WAIT_CONDITION: return createTimedWaitCondition();
			case SmlPackage.CLOCK_FRAGMENT: return createClockFragment();
			case SmlPackage.DUMMY_EXPR_CLASS: return createDummyExprClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SmlPackage.SCENARIO_KIND:
				return createScenarioKindFromString(eDataType, initialValue);
			case SmlPackage.EXPECTATION_KIND:
				return createExpectationKindFromString(eDataType, initialValue);
			case SmlPackage.DUMMY_DATATYPE:
				return createDummyDatatypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SmlPackage.SCENARIO_KIND:
				return convertScenarioKindToString(eDataType, instanceValue);
			case SmlPackage.EXPECTATION_KIND:
				return convertExpectationKindToString(eDataType, instanceValue);
			case SmlPackage.DUMMY_DATATYPE:
				return convertDummyDatatypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintBlock createConstraintBlock() {
		ConstraintBlockImpl constraintBlock = new ConstraintBlockImpl();
		return constraintBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalMessage createModalMessage() {
		ModalMessageImpl modalMessage = new ModalMessageImpl();
		return modalMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitCondition createWaitCondition() {
		WaitConditionImpl waitCondition = new WaitConditionImpl();
		return waitCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptCondition createInterruptCondition() {
		InterruptConditionImpl interruptCondition = new InterruptConditionImpl();
		return interruptCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViolationCondition createViolationCondition() {
		ViolationConditionImpl violationCondition = new ViolationConditionImpl();
		return violationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpression createConditionExpression() {
		ConditionExpressionImpl conditionExpression = new ConditionExpressionImpl();
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableFragment createVariableFragment() {
		VariableFragmentImpl variableFragment = new VariableFragmentImpl();
		return variableFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleBindingConstraint createRoleBindingConstraint() {
		RoleBindingConstraintImpl roleBindingConstraint = new RoleBindingConstraintImpl();
		return roleBindingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBinding createParameterBinding() {
		ParameterBindingImpl parameterBinding = new ParameterBindingImpl();
		return parameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureAccessBindingExpression createFeatureAccessBindingExpression() {
		FeatureAccessBindingExpressionImpl featureAccessBindingExpression = new FeatureAccessBindingExpressionImpl();
		return featureAccessBindingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectQueryBindingExpression createObjectQueryBindingExpression() {
		ObjectQueryBindingExpressionImpl objectQueryBindingExpression = new ObjectQueryBindingExpressionImpl();
		return objectQueryBindingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectQueryValue createObjectQueryValue() {
		ObjectQueryValueImpl objectQueryValue = new ObjectQueryValueImpl();
		return objectQueryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterExpression createParameterExpression() {
		ParameterExpressionImpl parameterExpression = new ParameterExpressionImpl();
		return parameterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WildcardParameterExpression createWildcardParameterExpression() {
		WildcardParameterExpressionImpl wildcardParameterExpression = new WildcardParameterExpressionImpl();
		return wildcardParameterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueParameterExpression createValueParameterExpression() {
		ValueParameterExpressionImpl valueParameterExpression = new ValueParameterExpressionImpl();
		return valueParameterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableBindingParameterExpression createVariableBindingParameterExpression() {
		VariableBindingParameterExpressionImpl variableBindingParameterExpression = new VariableBindingParameterExpressionImpl();
		return variableBindingParameterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventParameterRanges createEventParameterRanges() {
		EventParameterRangesImpl eventParameterRanges = new EventParameterRangesImpl();
		return eventParameterRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangesForParameter createRangesForParameter() {
		RangesForParameterImpl rangesForParameter = new RangesForParameterImpl();
		return rangesForParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerRanges createIntegerRanges() {
		IntegerRangesImpl integerRanges = new IntegerRangesImpl();
		return integerRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringRanges createStringRanges() {
		StringRangesImpl stringRanges = new StringRangesImpl();
		return stringRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumRanges createEnumRanges() {
		EnumRangesImpl enumRanges = new EnumRangesImpl();
		return enumRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelOptions createChannelOptions() {
		ChannelOptionsImpl channelOptions = new ChannelOptionsImpl();
		return channelOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageChannel createMessageChannel() {
		MessageChannelImpl messageChannel = new MessageChannelImpl();
		return messageChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedViolationCondition createTimedViolationCondition() {
		TimedViolationConditionImpl timedViolationCondition = new TimedViolationConditionImpl();
		return timedViolationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedInterruptCondition createTimedInterruptCondition() {
		TimedInterruptConditionImpl timedInterruptCondition = new TimedInterruptConditionImpl();
		return timedInterruptCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedWaitCondition createTimedWaitCondition() {
		TimedWaitConditionImpl timedWaitCondition = new TimedWaitConditionImpl();
		return timedWaitCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockFragment createClockFragment() {
		ClockFragmentImpl clockFragment = new ClockFragmentImpl();
		return clockFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyExprClass createDummyExprClass() {
		DummyExprClassImpl dummyExprClass = new DummyExprClassImpl();
		return dummyExprClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioKind createScenarioKindFromString(EDataType eDataType, String initialValue) {
		ScenarioKind result = ScenarioKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScenarioKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectationKind createExpectationKindFromString(EDataType eDataType, String initialValue) {
		ExpectationKind result = ExpectationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpectationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDummyDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDummyDatatypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmlPackage getSmlPackage() {
		return (SmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmlPackage getPackage() {
		return SmlPackage.eINSTANCE;
	}

} //SmlFactoryImpl
