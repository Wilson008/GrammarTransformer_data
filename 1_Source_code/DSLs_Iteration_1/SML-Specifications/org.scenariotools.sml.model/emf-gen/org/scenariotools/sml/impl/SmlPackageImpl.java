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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.scenariotools.sml.AbstractRanges;
import org.scenariotools.sml.Alternative;
import org.scenariotools.sml.BindingConstraint;
import org.scenariotools.sml.BindingExpression;
import org.scenariotools.sml.Case;
import org.scenariotools.sml.ChannelOptions;
import org.scenariotools.sml.ClockFragment;
import org.scenariotools.sml.Collaboration;
import org.scenariotools.sml.Condition;
import org.scenariotools.sml.ConditionExpression;
import org.scenariotools.sml.ConditionFragment;
import org.scenariotools.sml.ConstraintBlock;
import org.scenariotools.sml.DummyExprClass;
import org.scenariotools.sml.EnumRanges;
import org.scenariotools.sml.EventParameterRanges;
import org.scenariotools.sml.ExpectationKind;
import org.scenariotools.sml.FeatureAccessBindingExpression;
import org.scenariotools.sml.IntegerRanges;
import org.scenariotools.sml.Interaction;
import org.scenariotools.sml.InteractionFragment;
import org.scenariotools.sml.InterruptCondition;
import org.scenariotools.sml.Loop;
import org.scenariotools.sml.Message;
import org.scenariotools.sml.MessageChannel;
import org.scenariotools.sml.ModalMessage;
import org.scenariotools.sml.ObjectQueryBindingExpression;
import org.scenariotools.sml.ObjectQueryValue;
import org.scenariotools.sml.Parallel;
import org.scenariotools.sml.ParameterBinding;
import org.scenariotools.sml.ParameterExpression;
import org.scenariotools.sml.RangesForParameter;
import org.scenariotools.sml.Role;
import org.scenariotools.sml.RoleBindingConstraint;
import org.scenariotools.sml.Scenario;
import org.scenariotools.sml.ScenarioKind;
import org.scenariotools.sml.SmlFactory;
import org.scenariotools.sml.SmlPackage;
import org.scenariotools.sml.Specification;
import org.scenariotools.sml.StringRanges;
import org.scenariotools.sml.TimedConditionFragment;
import org.scenariotools.sml.TimedInterruptCondition;
import org.scenariotools.sml.TimedViolationCondition;
import org.scenariotools.sml.TimedWaitCondition;
import org.scenariotools.sml.ValueParameterExpression;
import org.scenariotools.sml.VariableBindingParameterExpression;
import org.scenariotools.sml.VariableFragment;
import org.scenariotools.sml.ViolationCondition;
import org.scenariotools.sml.WaitCondition;
import org.scenariotools.sml.WildcardParameterExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmlPackageImpl extends EPackageImpl implements SmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass violationConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleBindingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureAccessBindingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectQueryBindingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectQueryValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wildcardParameterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueParameterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableBindingParameterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventParameterRangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangesForParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerRangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringRangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumRangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedViolationConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedInterruptConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedWaitConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedConditionFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyExprClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scenarioKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expectationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dummyDatatypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.scenariotools.sml.SmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmlPackageImpl() {
		super(eNS_URI, SmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmlPackage init() {
		if (isInited) return (SmlPackage)EPackage.Registry.INSTANCE.getEPackage(SmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SmlPackageImpl theSmlPackage = registeredSmlPackage instanceof SmlPackageImpl ? (SmlPackageImpl)registeredSmlPackage : new SmlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSmlPackage.createPackageContents();

		// Initialize created meta-data
		theSmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmlPackage.eNS_URI, theSmlPackage);
		return theSmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Name() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Collaborations() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_ContainedCollaborations() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_IncludedCollaborations() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_EventParameterRanges() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_ChannelOptions() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Domains() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Contexts() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_ControllableEClasses() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_NonSpontaneousOperations() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Imports() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaboration() {
		return collaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaboration_Name() {
		return (EAttribute)collaborationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Imports() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Domains() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Contexts() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Roles() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Scenarios() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Type() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Static() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_MultiRole() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Name() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Singular() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_RoleBindings() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Kind() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Contexts() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_OwnedInteraction() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_OptimizeCost() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Cost() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintBlock() {
		return constraintBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintBlock_Consider() {
		return (EReference)constraintBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintBlock_Ignore() {
		return (EReference)constraintBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintBlock_Interrupt() {
		return (EReference)constraintBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintBlock_Forbidden() {
		return (EReference)constraintBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFragment() {
		return interactionFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Fragments() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Constraints() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Receiver() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Sender() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_ModelElement() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Parameters() {
		return (EReference)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_CollectionModification() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalMessage() {
		return modalMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalMessage_Strict() {
		return (EAttribute)modalMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalMessage_Monitored() {
		return (EAttribute)modalMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalMessage_ExpectationKind() {
		return (EAttribute)modalMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternative() {
		return alternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternative_Cases() {
		return (EReference)alternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_CaseInteraction() {
		return (EReference)caseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_CaseCondition() {
		return (EReference)caseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_BodyInteraction() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_LoopCondition() {
		return (EReference)loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallel_ParallelInteraction() {
		return (EReference)parallelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionFragment() {
		return conditionFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionFragment_ConditionExpression() {
		return (EReference)conditionFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaitCondition() {
		return waitConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitCondition_Strict() {
		return (EAttribute)waitConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitCondition_Requested() {
		return (EAttribute)waitConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptCondition() {
		return interruptConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViolationCondition() {
		return violationConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionExpression() {
		return conditionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionExpression_Expression() {
		return (EReference)conditionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableFragment() {
		return variableFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableFragment_Expression() {
		return (EReference)variableFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingConstraint() {
		return bindingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingConstraint_BindingExpression() {
		return (EReference)bindingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleBindingConstraint() {
		return roleBindingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBindingConstraint_Role() {
		return (EReference)roleBindingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterBinding() {
		return parameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingExpression() {
		return bindingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureAccessBindingExpression() {
		return featureAccessBindingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureAccessBindingExpression_Featureaccess() {
		return (EReference)featureAccessBindingExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectQueryBindingExpression() {
		return objectQueryBindingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectQueryBindingExpression_QueryClass() {
		return (EReference)objectQueryBindingExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectQueryBindingExpression_QueryValues() {
		return (EReference)objectQueryBindingExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectQueryValue() {
		return objectQueryValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectQueryValue_Feature() {
		return (EReference)objectQueryValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectQueryValue_Expression() {
		return (EReference)objectQueryValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterExpression() {
		return parameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWildcardParameterExpression() {
		return wildcardParameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueParameterExpression() {
		return valueParameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueParameterExpression_Value() {
		return (EReference)valueParameterExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableBindingParameterExpression() {
		return variableBindingParameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableBindingParameterExpression_Variable() {
		return (EReference)variableBindingParameterExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventParameterRanges() {
		return eventParameterRangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventParameterRanges_Event() {
		return (EReference)eventParameterRangesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventParameterRanges_RangesForParameter() {
		return (EReference)eventParameterRangesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangesForParameter() {
		return rangesForParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangesForParameter_Parameter() {
		return (EReference)rangesForParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangesForParameter_Ranges() {
		return (EReference)rangesForParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRanges() {
		return abstractRangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerRanges() {
		return integerRangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerRanges_Min() {
		return (EAttribute)integerRangesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerRanges_Max() {
		return (EAttribute)integerRangesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerRanges_Values() {
		return (EAttribute)integerRangesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringRanges() {
		return stringRangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringRanges_Values() {
		return (EAttribute)stringRangesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumRanges() {
		return enumRangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumRanges_Values() {
		return (EReference)enumRangesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelOptions() {
		return channelOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelOptions_AllMessagesRequireLinks() {
		return (EAttribute)channelOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelOptions_MessageChannels() {
		return (EReference)channelOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChannelOptions__GetChannelsForEvent__ETypedElement() {
		return channelOptionsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageChannel() {
		return messageChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageChannel_Event() {
		return (EReference)messageChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageChannel_ChannelFeature() {
		return (EReference)messageChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedViolationCondition() {
		return timedViolationConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedInterruptCondition() {
		return timedInterruptConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedWaitCondition() {
		return timedWaitConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedWaitCondition_Requested() {
		return (EAttribute)timedWaitConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedWaitCondition_Strict() {
		return (EAttribute)timedWaitConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedConditionFragment() {
		return timedConditionFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedConditionFragment_TimedConditionExpression() {
		return (EReference)timedConditionFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockFragment() {
		return clockFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockFragment_Expression() {
		return (EReference)clockFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDummyExprClass() {
		return dummyExprClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScenarioKind() {
		return scenarioKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpectationKind() {
		return expectationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDummyDatatype() {
		return dummyDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmlFactory getSmlFactory() {
		return (SmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		specificationEClass = createEClass(SPECIFICATION);
		createEAttribute(specificationEClass, SPECIFICATION__NAME);
		createEReference(specificationEClass, SPECIFICATION__IMPORTS);
		createEReference(specificationEClass, SPECIFICATION__DOMAINS);
		createEReference(specificationEClass, SPECIFICATION__CONTEXTS);
		createEReference(specificationEClass, SPECIFICATION__CONTROLLABLE_ECLASSES);
		createEReference(specificationEClass, SPECIFICATION__NON_SPONTANEOUS_OPERATIONS);
		createEReference(specificationEClass, SPECIFICATION__COLLABORATIONS);
		createEReference(specificationEClass, SPECIFICATION__CONTAINED_COLLABORATIONS);
		createEReference(specificationEClass, SPECIFICATION__INCLUDED_COLLABORATIONS);
		createEReference(specificationEClass, SPECIFICATION__EVENT_PARAMETER_RANGES);
		createEReference(specificationEClass, SPECIFICATION__CHANNEL_OPTIONS);

		collaborationEClass = createEClass(COLLABORATION);
		createEAttribute(collaborationEClass, COLLABORATION__NAME);
		createEReference(collaborationEClass, COLLABORATION__IMPORTS);
		createEReference(collaborationEClass, COLLABORATION__DOMAINS);
		createEReference(collaborationEClass, COLLABORATION__CONTEXTS);
		createEReference(collaborationEClass, COLLABORATION__ROLES);
		createEReference(collaborationEClass, COLLABORATION__SCENARIOS);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEReference(roleEClass, ROLE__TYPE);
		createEAttribute(roleEClass, ROLE__STATIC);
		createEAttribute(roleEClass, ROLE__MULTI_ROLE);

		scenarioEClass = createEClass(SCENARIO);
		createEAttribute(scenarioEClass, SCENARIO__NAME);
		createEAttribute(scenarioEClass, SCENARIO__SINGULAR);
		createEAttribute(scenarioEClass, SCENARIO__KIND);
		createEReference(scenarioEClass, SCENARIO__CONTEXTS);
		createEReference(scenarioEClass, SCENARIO__ROLE_BINDINGS);
		createEReference(scenarioEClass, SCENARIO__OWNED_INTERACTION);
		createEAttribute(scenarioEClass, SCENARIO__OPTIMIZE_COST);
		createEAttribute(scenarioEClass, SCENARIO__COST);

		constraintBlockEClass = createEClass(CONSTRAINT_BLOCK);
		createEReference(constraintBlockEClass, CONSTRAINT_BLOCK__CONSIDER);
		createEReference(constraintBlockEClass, CONSTRAINT_BLOCK__IGNORE);
		createEReference(constraintBlockEClass, CONSTRAINT_BLOCK__INTERRUPT);
		createEReference(constraintBlockEClass, CONSTRAINT_BLOCK__FORBIDDEN);

		interactionFragmentEClass = createEClass(INTERACTION_FRAGMENT);

		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__FRAGMENTS);
		createEReference(interactionEClass, INTERACTION__CONSTRAINTS);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__RECEIVER);
		createEReference(messageEClass, MESSAGE__SENDER);
		createEReference(messageEClass, MESSAGE__MODEL_ELEMENT);
		createEReference(messageEClass, MESSAGE__PARAMETERS);
		createEAttribute(messageEClass, MESSAGE__COLLECTION_MODIFICATION);

		modalMessageEClass = createEClass(MODAL_MESSAGE);
		createEAttribute(modalMessageEClass, MODAL_MESSAGE__STRICT);
		createEAttribute(modalMessageEClass, MODAL_MESSAGE__MONITORED);
		createEAttribute(modalMessageEClass, MODAL_MESSAGE__EXPECTATION_KIND);

		alternativeEClass = createEClass(ALTERNATIVE);
		createEReference(alternativeEClass, ALTERNATIVE__CASES);

		caseEClass = createEClass(CASE);
		createEReference(caseEClass, CASE__CASE_INTERACTION);
		createEReference(caseEClass, CASE__CASE_CONDITION);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__BODY_INTERACTION);
		createEReference(loopEClass, LOOP__LOOP_CONDITION);

		parallelEClass = createEClass(PARALLEL);
		createEReference(parallelEClass, PARALLEL__PARALLEL_INTERACTION);

		conditionFragmentEClass = createEClass(CONDITION_FRAGMENT);
		createEReference(conditionFragmentEClass, CONDITION_FRAGMENT__CONDITION_EXPRESSION);

		waitConditionEClass = createEClass(WAIT_CONDITION);
		createEAttribute(waitConditionEClass, WAIT_CONDITION__STRICT);
		createEAttribute(waitConditionEClass, WAIT_CONDITION__REQUESTED);

		interruptConditionEClass = createEClass(INTERRUPT_CONDITION);

		violationConditionEClass = createEClass(VIOLATION_CONDITION);

		conditionEClass = createEClass(CONDITION);

		conditionExpressionEClass = createEClass(CONDITION_EXPRESSION);
		createEReference(conditionExpressionEClass, CONDITION_EXPRESSION__EXPRESSION);

		variableFragmentEClass = createEClass(VARIABLE_FRAGMENT);
		createEReference(variableFragmentEClass, VARIABLE_FRAGMENT__EXPRESSION);

		bindingConstraintEClass = createEClass(BINDING_CONSTRAINT);
		createEReference(bindingConstraintEClass, BINDING_CONSTRAINT__BINDING_EXPRESSION);

		roleBindingConstraintEClass = createEClass(ROLE_BINDING_CONSTRAINT);
		createEReference(roleBindingConstraintEClass, ROLE_BINDING_CONSTRAINT__ROLE);

		parameterBindingEClass = createEClass(PARAMETER_BINDING);

		bindingExpressionEClass = createEClass(BINDING_EXPRESSION);

		featureAccessBindingExpressionEClass = createEClass(FEATURE_ACCESS_BINDING_EXPRESSION);
		createEReference(featureAccessBindingExpressionEClass, FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS);

		objectQueryBindingExpressionEClass = createEClass(OBJECT_QUERY_BINDING_EXPRESSION);
		createEReference(objectQueryBindingExpressionEClass, OBJECT_QUERY_BINDING_EXPRESSION__QUERY_CLASS);
		createEReference(objectQueryBindingExpressionEClass, OBJECT_QUERY_BINDING_EXPRESSION__QUERY_VALUES);

		objectQueryValueEClass = createEClass(OBJECT_QUERY_VALUE);
		createEReference(objectQueryValueEClass, OBJECT_QUERY_VALUE__FEATURE);
		createEReference(objectQueryValueEClass, OBJECT_QUERY_VALUE__EXPRESSION);

		parameterExpressionEClass = createEClass(PARAMETER_EXPRESSION);

		wildcardParameterExpressionEClass = createEClass(WILDCARD_PARAMETER_EXPRESSION);

		valueParameterExpressionEClass = createEClass(VALUE_PARAMETER_EXPRESSION);
		createEReference(valueParameterExpressionEClass, VALUE_PARAMETER_EXPRESSION__VALUE);

		variableBindingParameterExpressionEClass = createEClass(VARIABLE_BINDING_PARAMETER_EXPRESSION);
		createEReference(variableBindingParameterExpressionEClass, VARIABLE_BINDING_PARAMETER_EXPRESSION__VARIABLE);

		eventParameterRangesEClass = createEClass(EVENT_PARAMETER_RANGES);
		createEReference(eventParameterRangesEClass, EVENT_PARAMETER_RANGES__EVENT);
		createEReference(eventParameterRangesEClass, EVENT_PARAMETER_RANGES__RANGES_FOR_PARAMETER);

		rangesForParameterEClass = createEClass(RANGES_FOR_PARAMETER);
		createEReference(rangesForParameterEClass, RANGES_FOR_PARAMETER__PARAMETER);
		createEReference(rangesForParameterEClass, RANGES_FOR_PARAMETER__RANGES);

		abstractRangesEClass = createEClass(ABSTRACT_RANGES);

		integerRangesEClass = createEClass(INTEGER_RANGES);
		createEAttribute(integerRangesEClass, INTEGER_RANGES__MIN);
		createEAttribute(integerRangesEClass, INTEGER_RANGES__MAX);
		createEAttribute(integerRangesEClass, INTEGER_RANGES__VALUES);

		stringRangesEClass = createEClass(STRING_RANGES);
		createEAttribute(stringRangesEClass, STRING_RANGES__VALUES);

		enumRangesEClass = createEClass(ENUM_RANGES);
		createEReference(enumRangesEClass, ENUM_RANGES__VALUES);

		channelOptionsEClass = createEClass(CHANNEL_OPTIONS);
		createEAttribute(channelOptionsEClass, CHANNEL_OPTIONS__ALL_MESSAGES_REQUIRE_LINKS);
		createEReference(channelOptionsEClass, CHANNEL_OPTIONS__MESSAGE_CHANNELS);
		createEOperation(channelOptionsEClass, CHANNEL_OPTIONS___GET_CHANNELS_FOR_EVENT__ETYPEDELEMENT);

		messageChannelEClass = createEClass(MESSAGE_CHANNEL);
		createEReference(messageChannelEClass, MESSAGE_CHANNEL__EVENT);
		createEReference(messageChannelEClass, MESSAGE_CHANNEL__CHANNEL_FEATURE);

		timedViolationConditionEClass = createEClass(TIMED_VIOLATION_CONDITION);

		timedInterruptConditionEClass = createEClass(TIMED_INTERRUPT_CONDITION);

		timedWaitConditionEClass = createEClass(TIMED_WAIT_CONDITION);
		createEAttribute(timedWaitConditionEClass, TIMED_WAIT_CONDITION__REQUESTED);
		createEAttribute(timedWaitConditionEClass, TIMED_WAIT_CONDITION__STRICT);

		timedConditionFragmentEClass = createEClass(TIMED_CONDITION_FRAGMENT);
		createEReference(timedConditionFragmentEClass, TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION);

		clockFragmentEClass = createEClass(CLOCK_FRAGMENT);
		createEReference(clockFragmentEClass, CLOCK_FRAGMENT__EXPRESSION);

		dummyExprClassEClass = createEClass(DUMMY_EXPR_CLASS);

		// Create enums
		scenarioKindEEnum = createEEnum(SCENARIO_KIND);
		expectationKindEEnum = createEEnum(EXPECTATION_KIND);

		// Create data types
		dummyDatatypeEDataType = createEDataType(DUMMY_DATATYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interactionEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionEClass.getESuperTypes().add(this.getDummyExprClass());
		modalMessageEClass.getESuperTypes().add(this.getInteractionFragment());
		modalMessageEClass.getESuperTypes().add(this.getMessage());
		alternativeEClass.getESuperTypes().add(this.getInteractionFragment());
		loopEClass.getESuperTypes().add(this.getInteractionFragment());
		parallelEClass.getESuperTypes().add(this.getInteractionFragment());
		conditionFragmentEClass.getESuperTypes().add(this.getInteractionFragment());
		waitConditionEClass.getESuperTypes().add(this.getConditionFragment());
		interruptConditionEClass.getESuperTypes().add(this.getConditionFragment());
		violationConditionEClass.getESuperTypes().add(this.getConditionFragment());
		conditionEClass.getESuperTypes().add(this.getConditionFragment());
		variableFragmentEClass.getESuperTypes().add(this.getInteractionFragment());
		roleBindingConstraintEClass.getESuperTypes().add(this.getBindingConstraint());
		parameterBindingEClass.getESuperTypes().add(this.getBindingConstraint());
		featureAccessBindingExpressionEClass.getESuperTypes().add(this.getBindingExpression());
		objectQueryBindingExpressionEClass.getESuperTypes().add(this.getBindingExpression());
		parameterExpressionEClass.getESuperTypes().add(this.getBindingExpression());
		wildcardParameterExpressionEClass.getESuperTypes().add(this.getParameterExpression());
		valueParameterExpressionEClass.getESuperTypes().add(this.getParameterExpression());
		variableBindingParameterExpressionEClass.getESuperTypes().add(this.getParameterExpression());
		integerRangesEClass.getESuperTypes().add(this.getAbstractRanges());
		stringRangesEClass.getESuperTypes().add(this.getAbstractRanges());
		enumRangesEClass.getESuperTypes().add(this.getAbstractRanges());
		timedViolationConditionEClass.getESuperTypes().add(this.getTimedConditionFragment());
		timedInterruptConditionEClass.getESuperTypes().add(this.getTimedConditionFragment());
		timedWaitConditionEClass.getESuperTypes().add(this.getTimedConditionFragment());
		timedConditionFragmentEClass.getESuperTypes().add(this.getInteractionFragment());
		clockFragmentEClass.getESuperTypes().add(this.getInteractionFragment());

		// Initialize classes, features, and operations; add parameters
		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecification_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Imports(), this.getDummyExprClass(), null, "imports", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Domains(), theEcorePackage.getEPackage(), null, "domains", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Contexts(), theEcorePackage.getEPackage(), null, "contexts", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_ControllableEClasses(), theEcorePackage.getEClass(), null, "controllableEClasses", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_NonSpontaneousOperations(), theEcorePackage.getETypedElement(), null, "nonSpontaneousOperations", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Collaborations(), this.getCollaboration(), null, "collaborations", null, 0, -1, Specification.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_ContainedCollaborations(), this.getCollaboration(), null, "containedCollaborations", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_IncludedCollaborations(), this.getCollaboration(), null, "includedCollaborations", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_EventParameterRanges(), this.getEventParameterRanges(), null, "eventParameterRanges", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_ChannelOptions(), this.getChannelOptions(), null, "channelOptions", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborationEClass, Collaboration.class, "Collaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollaboration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaboration_Imports(), this.getDummyExprClass(), null, "imports", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaboration_Domains(), theEcorePackage.getEPackage(), null, "domains", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaboration_Contexts(), theEcorePackage.getEPackage(), null, "contexts", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaboration_Roles(), this.getRole(), null, "roles", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaboration_Scenarios(), this.getScenario(), null, "scenarios", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Type(), theEcorePackage.getEClassifier(), null, "type", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Static(), theEcorePackage.getEBoolean(), "static", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_MultiRole(), theEcorePackage.getEBoolean(), "multiRole", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenario_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Singular(), theEcorePackage.getEBoolean(), "singular", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Kind(), this.getScenarioKind(), "kind", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Contexts(), theEcorePackage.getEClass(), null, "contexts", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_RoleBindings(), this.getRoleBindingConstraint(), null, "roleBindings", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_OwnedInteraction(), this.getInteraction(), null, "ownedInteraction", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_OptimizeCost(), ecorePackage.getEBoolean(), "optimizeCost", "false", 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Cost(), ecorePackage.getEDouble(), "cost", "0.0", 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintBlockEClass, ConstraintBlock.class, "ConstraintBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintBlock_Consider(), this.getMessage(), null, "consider", null, 0, -1, ConstraintBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraintBlock_Ignore(), this.getMessage(), null, "ignore", null, 0, -1, ConstraintBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraintBlock_Interrupt(), this.getMessage(), null, "interrupt", null, 0, -1, ConstraintBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraintBlock_Forbidden(), this.getMessage(), null, "forbidden", null, 0, -1, ConstraintBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interactionFragmentEClass, InteractionFragment.class, "InteractionFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction_Fragments(), this.getInteractionFragment(), null, "fragments", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_Constraints(), this.getConstraintBlock(), null, "constraints", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Receiver(), this.getRole(), null, "receiver", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Sender(), this.getRole(), null, "sender", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_ModelElement(), theEcorePackage.getETypedElement(), null, "modelElement", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Parameters(), this.getParameterBinding(), null, "parameters", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_CollectionModification(), this.getDummyDatatype(), "collectionModification", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalMessageEClass, ModalMessage.class, "ModalMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModalMessage_Strict(), theEcorePackage.getEBoolean(), "strict", null, 0, 1, ModalMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModalMessage_Monitored(), theEcorePackage.getEBoolean(), "monitored", null, 0, 1, ModalMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModalMessage_ExpectationKind(), this.getExpectationKind(), "expectationKind", null, 0, 1, ModalMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternative_Cases(), this.getCase(), null, "cases", null, 0, -1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase_CaseInteraction(), this.getInteraction(), null, "caseInteraction", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_CaseCondition(), this.getCondition(), null, "caseCondition", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_BodyInteraction(), this.getInteraction(), null, "bodyInteraction", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_LoopCondition(), this.getCondition(), null, "loopCondition", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallel_ParallelInteraction(), this.getInteraction(), null, "parallelInteraction", null, 0, -1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionFragmentEClass, ConditionFragment.class, "ConditionFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionFragment_ConditionExpression(), this.getConditionExpression(), null, "conditionExpression", null, 0, 1, ConditionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitConditionEClass, WaitCondition.class, "WaitCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWaitCondition_Strict(), theEcorePackage.getEBoolean(), "strict", null, 0, 1, WaitCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaitCondition_Requested(), theEcorePackage.getEBoolean(), "requested", null, 0, 1, WaitCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptConditionEClass, InterruptCondition.class, "InterruptCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(violationConditionEClass, ViolationCondition.class, "ViolationCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionExpressionEClass, ConditionExpression.class, "ConditionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionExpression_Expression(), this.getDummyExprClass(), null, "expression", null, 0, 1, ConditionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableFragmentEClass, VariableFragment.class, "VariableFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableFragment_Expression(), this.getDummyExprClass(), null, "expression", null, 0, 1, VariableFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingConstraintEClass, BindingConstraint.class, "BindingConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingConstraint_BindingExpression(), this.getBindingExpression(), null, "bindingExpression", null, 0, 1, BindingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleBindingConstraintEClass, RoleBindingConstraint.class, "RoleBindingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleBindingConstraint_Role(), this.getRole(), null, "role", null, 0, 1, RoleBindingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterBindingEClass, ParameterBinding.class, "ParameterBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingExpressionEClass, BindingExpression.class, "BindingExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureAccessBindingExpressionEClass, FeatureAccessBindingExpression.class, "FeatureAccessBindingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureAccessBindingExpression_Featureaccess(), this.getDummyExprClass(), null, "featureaccess", null, 0, 1, FeatureAccessBindingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectQueryBindingExpressionEClass, ObjectQueryBindingExpression.class, "ObjectQueryBindingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectQueryBindingExpression_QueryClass(), theEcorePackage.getEClass(), null, "queryClass", null, 0, 1, ObjectQueryBindingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectQueryBindingExpression_QueryValues(), this.getObjectQueryValue(), null, "queryValues", null, 0, -1, ObjectQueryBindingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectQueryValueEClass, ObjectQueryValue.class, "ObjectQueryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectQueryValue_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, ObjectQueryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectQueryValue_Expression(), this.getDummyExprClass(), null, "expression", null, 0, 1, ObjectQueryValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterExpressionEClass, ParameterExpression.class, "ParameterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wildcardParameterExpressionEClass, WildcardParameterExpression.class, "WildcardParameterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueParameterExpressionEClass, ValueParameterExpression.class, "ValueParameterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueParameterExpression_Value(), this.getDummyExprClass(), null, "value", null, 0, 1, ValueParameterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableBindingParameterExpressionEClass, VariableBindingParameterExpression.class, "VariableBindingParameterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableBindingParameterExpression_Variable(), this.getDummyExprClass(), null, "variable", null, 0, 1, VariableBindingParameterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventParameterRangesEClass, EventParameterRanges.class, "EventParameterRanges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventParameterRanges_Event(), theEcorePackage.getETypedElement(), null, "event", null, 0, 1, EventParameterRanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventParameterRanges_RangesForParameter(), this.getRangesForParameter(), null, "rangesForParameter", null, 0, -1, EventParameterRanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangesForParameterEClass, RangesForParameter.class, "RangesForParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangesForParameter_Parameter(), theEcorePackage.getETypedElement(), null, "parameter", null, 0, 1, RangesForParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRangesForParameter_Ranges(), this.getAbstractRanges(), null, "ranges", null, 0, 1, RangesForParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRangesEClass, AbstractRanges.class, "AbstractRanges", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerRangesEClass, IntegerRanges.class, "IntegerRanges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerRanges_Min(), theEcorePackage.getEInt(), "min", null, 0, 1, IntegerRanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerRanges_Max(), theEcorePackage.getEInt(), "max", null, 0, 1, IntegerRanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerRanges_Values(), theEcorePackage.getEInt(), "values", null, 0, -1, IntegerRanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringRangesEClass, StringRanges.class, "StringRanges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringRanges_Values(), theEcorePackage.getEString(), "values", null, 0, -1, StringRanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumRangesEClass, EnumRanges.class, "EnumRanges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumRanges_Values(), theEcorePackage.getEEnumLiteral(), null, "values", null, 0, -1, EnumRanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelOptionsEClass, ChannelOptions.class, "ChannelOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelOptions_AllMessagesRequireLinks(), theEcorePackage.getEBoolean(), "allMessagesRequireLinks", null, 0, 1, ChannelOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelOptions_MessageChannels(), this.getMessageChannel(), null, "messageChannels", null, 0, -1, ChannelOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getChannelOptions__GetChannelsForEvent__ETypedElement(), this.getMessageChannel(), "getChannelsForEvent", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageChannelEClass, MessageChannel.class, "MessageChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageChannel_Event(), theEcorePackage.getETypedElement(), null, "event", null, 0, 1, MessageChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageChannel_ChannelFeature(), theEcorePackage.getEStructuralFeature(), null, "channelFeature", null, 0, 1, MessageChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedViolationConditionEClass, TimedViolationCondition.class, "TimedViolationCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timedInterruptConditionEClass, TimedInterruptCondition.class, "TimedInterruptCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timedWaitConditionEClass, TimedWaitCondition.class, "TimedWaitCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedWaitCondition_Requested(), ecorePackage.getEBoolean(), "requested", null, 0, 1, TimedWaitCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedWaitCondition_Strict(), ecorePackage.getEBoolean(), "strict", null, 0, 1, TimedWaitCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedConditionFragmentEClass, TimedConditionFragment.class, "TimedConditionFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedConditionFragment_TimedConditionExpression(), this.getDummyExprClass(), null, "timedConditionExpression", null, 0, 1, TimedConditionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockFragmentEClass, ClockFragment.class, "ClockFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockFragment_Expression(), this.getDummyExprClass(), null, "expression", null, 0, 1, ClockFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dummyExprClassEClass, DummyExprClass.class, "DummyExprClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(scenarioKindEEnum, ScenarioKind.class, "ScenarioKind");
		addEEnumLiteral(scenarioKindEEnum, ScenarioKind.ASSUMPTION);
		addEEnumLiteral(scenarioKindEEnum, ScenarioKind.GUARANTEE);
		addEEnumLiteral(scenarioKindEEnum, ScenarioKind.EXISTENTIAL);

		initEEnum(expectationKindEEnum, ExpectationKind.class, "ExpectationKind");
		addEEnumLiteral(expectationKindEEnum, ExpectationKind.NONE);
		addEEnumLiteral(expectationKindEEnum, ExpectationKind.EVENTUALLY);
		addEEnumLiteral(expectationKindEEnum, ExpectationKind.URGENT);
		addEEnumLiteral(expectationKindEEnum, ExpectationKind.REQUESTED);
		addEEnumLiteral(expectationKindEEnum, ExpectationKind.COMMITTED);

		// Initialize data types
		initEDataType(dummyDatatypeEDataType, String.class, "DummyDatatype", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SmlPackageImpl
