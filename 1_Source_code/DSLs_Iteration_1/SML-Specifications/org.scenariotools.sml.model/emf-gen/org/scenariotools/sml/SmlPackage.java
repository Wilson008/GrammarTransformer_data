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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.scenariotools.sml.SmlFactory
 * @model kind="package"
 * @generated
 */
public interface SmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.scenariotools.org/sml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmlPackage eINSTANCE = org.scenariotools.sml.impl.SmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.SpecificationImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DOMAINS = 2;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONTEXTS = 3;

	/**
	 * The feature id for the '<em><b>Controllable EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONTROLLABLE_ECLASSES = 4;

	/**
	 * The feature id for the '<em><b>Non Spontaneous Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NON_SPONTANEOUS_OPERATIONS = 5;

	/**
	 * The feature id for the '<em><b>Collaborations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__COLLABORATIONS = 6;

	/**
	 * The feature id for the '<em><b>Contained Collaborations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONTAINED_COLLABORATIONS = 7;

	/**
	 * The feature id for the '<em><b>Included Collaborations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__INCLUDED_COLLABORATIONS = 8;

	/**
	 * The feature id for the '<em><b>Event Parameter Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__EVENT_PARAMETER_RANGES = 9;

	/**
	 * The feature id for the '<em><b>Channel Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CHANNEL_OPTIONS = 10;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.CollaborationImpl <em>Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.CollaborationImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getCollaboration()
	 * @generated
	 */
	int COLLABORATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__DOMAINS = 2;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__CONTEXTS = 3;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__ROLES = 4;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__SCENARIOS = 5;

	/**
	 * The number of structural features of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int COLLABORATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.RoleImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__STATIC = 2;

	/**
	 * The feature id for the '<em><b>Multi Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MULTI_ROLE = 3;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ScenarioImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Singular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SINGULAR = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__KIND = 2;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CONTEXTS = 3;

	/**
	 * The feature id for the '<em><b>Role Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ROLE_BINDINGS = 4;

	/**
	 * The feature id for the '<em><b>Owned Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OWNED_INTERACTION = 5;

	/**
	 * The feature id for the '<em><b>Optimize Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OPTIMIZE_COST = 6;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__COST = 7;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ConstraintBlockImpl <em>Constraint Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ConstraintBlockImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getConstraintBlock()
	 * @generated
	 */
	int CONSTRAINT_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Consider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BLOCK__CONSIDER = 0;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BLOCK__IGNORE = 1;

	/**
	 * The feature id for the '<em><b>Interrupt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BLOCK__INTERRUPT = 2;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BLOCK__FORBIDDEN = 3;

	/**
	 * The number of structural features of the '<em>Constraint Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Constraint Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.InteractionFragmentImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getInteractionFragment()
	 * @generated
	 */
	int INTERACTION_FRAGMENT = 5;

	/**
	 * The number of structural features of the '<em>Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.InteractionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 6;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FRAGMENTS = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__CONSTRAINTS = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.MessageImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 7;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECEIVER = 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SENDER = 1;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MODEL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Collection Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__COLLECTION_MODIFICATION = 4;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ModalMessageImpl <em>Modal Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ModalMessageImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getModalMessage()
	 * @generated
	 */
	int MODAL_MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__RECEIVER = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__SENDER = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__MODEL_ELEMENT = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__PARAMETERS = INTERACTION_FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Collection Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__COLLECTION_MODIFICATION = INTERACTION_FRAGMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__STRICT = INTERACTION_FRAGMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Monitored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__MONITORED = INTERACTION_FRAGMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Expectation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__EXPECTATION_KIND = INTERACTION_FRAGMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Modal Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Modal Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.AlternativeImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 9;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__CASES = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.CaseImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 10;

	/**
	 * The feature id for the '<em><b>Case Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CASE_INTERACTION = 0;

	/**
	 * The feature id for the '<em><b>Case Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CASE_CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.LoopImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 11;

	/**
	 * The feature id for the '<em><b>Body Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY_INTERACTION = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP_CONDITION = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ParallelImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 12;

	/**
	 * The feature id for the '<em><b>Parallel Interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__PARALLEL_INTERACTION = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ConditionFragmentImpl <em>Condition Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ConditionFragmentImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getConditionFragment()
	 * @generated
	 */
	int CONDITION_FRAGMENT = 13;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FRAGMENT__CONDITION_EXPRESSION = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FRAGMENT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FRAGMENT_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.WaitConditionImpl <em>Wait Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.WaitConditionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getWaitCondition()
	 * @generated
	 */
	int WAIT_CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_CONDITION__CONDITION_EXPRESSION = CONDITION_FRAGMENT__CONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_CONDITION__STRICT = CONDITION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_CONDITION__REQUESTED = CONDITION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wait Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_CONDITION_FEATURE_COUNT = CONDITION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Wait Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_CONDITION_OPERATION_COUNT = CONDITION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.InterruptConditionImpl <em>Interrupt Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.InterruptConditionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getInterruptCondition()
	 * @generated
	 */
	int INTERRUPT_CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONDITION__CONDITION_EXPRESSION = CONDITION_FRAGMENT__CONDITION_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Interrupt Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONDITION_FEATURE_COUNT = CONDITION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interrupt Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONDITION_OPERATION_COUNT = CONDITION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ViolationConditionImpl <em>Violation Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ViolationConditionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getViolationCondition()
	 * @generated
	 */
	int VIOLATION_CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_CONDITION__CONDITION_EXPRESSION = CONDITION_FRAGMENT__CONDITION_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Violation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_CONDITION_FEATURE_COUNT = CONDITION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Violation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_CONDITION_OPERATION_COUNT = CONDITION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ConditionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_EXPRESSION = CONDITION_FRAGMENT__CONDITION_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = CONDITION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = CONDITION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ConditionExpressionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getConditionExpression()
	 * @generated
	 */
	int CONDITION_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Condition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.VariableFragmentImpl <em>Variable Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.VariableFragmentImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getVariableFragment()
	 * @generated
	 */
	int VARIABLE_FRAGMENT = 19;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAGMENT__EXPRESSION = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAGMENT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAGMENT_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.BindingConstraintImpl <em>Binding Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.BindingConstraintImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getBindingConstraint()
	 * @generated
	 */
	int BINDING_CONSTRAINT = 20;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONSTRAINT__BINDING_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Binding Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.RoleBindingConstraintImpl <em>Role Binding Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.RoleBindingConstraintImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getRoleBindingConstraint()
	 * @generated
	 */
	int ROLE_BINDING_CONSTRAINT = 21;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_CONSTRAINT__BINDING_EXPRESSION = BINDING_CONSTRAINT__BINDING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_CONSTRAINT__ROLE = BINDING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Binding Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_CONSTRAINT_FEATURE_COUNT = BINDING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Binding Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_CONSTRAINT_OPERATION_COUNT = BINDING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ParameterBindingImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getParameterBinding()
	 * @generated
	 */
	int PARAMETER_BINDING = 22;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__BINDING_EXPRESSION = BINDING_CONSTRAINT__BINDING_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_FEATURE_COUNT = BINDING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_OPERATION_COUNT = BINDING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.BindingExpressionImpl <em>Binding Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.BindingExpressionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getBindingExpression()
	 * @generated
	 */
	int BINDING_EXPRESSION = 23;

	/**
	 * The number of structural features of the '<em>Binding Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Binding Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.FeatureAccessBindingExpressionImpl <em>Feature Access Binding Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.FeatureAccessBindingExpressionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getFeatureAccessBindingExpression()
	 * @generated
	 */
	int FEATURE_ACCESS_BINDING_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Featureaccess</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS = BINDING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Access Binding Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_BINDING_EXPRESSION_FEATURE_COUNT = BINDING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Access Binding Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_BINDING_EXPRESSION_OPERATION_COUNT = BINDING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ObjectQueryBindingExpressionImpl <em>Object Query Binding Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ObjectQueryBindingExpressionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getObjectQueryBindingExpression()
	 * @generated
	 */
	int OBJECT_QUERY_BINDING_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Query Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_QUERY_BINDING_EXPRESSION__QUERY_CLASS = BINDING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_QUERY_BINDING_EXPRESSION__QUERY_VALUES = BINDING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Query Binding Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_QUERY_BINDING_EXPRESSION_FEATURE_COUNT = BINDING_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Query Binding Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_QUERY_BINDING_EXPRESSION_OPERATION_COUNT = BINDING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ObjectQueryValueImpl <em>Object Query Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ObjectQueryValueImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getObjectQueryValue()
	 * @generated
	 */
	int OBJECT_QUERY_VALUE = 26;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_QUERY_VALUE__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_QUERY_VALUE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Object Query Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_QUERY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Object Query Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_QUERY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ParameterExpressionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getParameterExpression()
	 * @generated
	 */
	int PARAMETER_EXPRESSION = 27;

	/**
	 * The number of structural features of the '<em>Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_FEATURE_COUNT = BINDING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_OPERATION_COUNT = BINDING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.WildcardParameterExpressionImpl <em>Wildcard Parameter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.WildcardParameterExpressionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getWildcardParameterExpression()
	 * @generated
	 */
	int WILDCARD_PARAMETER_EXPRESSION = 28;

	/**
	 * The number of structural features of the '<em>Wildcard Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_PARAMETER_EXPRESSION_FEATURE_COUNT = PARAMETER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wildcard Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_PARAMETER_EXPRESSION_OPERATION_COUNT = PARAMETER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ValueParameterExpressionImpl <em>Value Parameter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ValueParameterExpressionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getValueParameterExpression()
	 * @generated
	 */
	int VALUE_PARAMETER_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PARAMETER_EXPRESSION__VALUE = PARAMETER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PARAMETER_EXPRESSION_FEATURE_COUNT = PARAMETER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PARAMETER_EXPRESSION_OPERATION_COUNT = PARAMETER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.VariableBindingParameterExpressionImpl <em>Variable Binding Parameter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.VariableBindingParameterExpressionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getVariableBindingParameterExpression()
	 * @generated
	 */
	int VARIABLE_BINDING_PARAMETER_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING_PARAMETER_EXPRESSION__VARIABLE = PARAMETER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Binding Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING_PARAMETER_EXPRESSION_FEATURE_COUNT = PARAMETER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Binding Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING_PARAMETER_EXPRESSION_OPERATION_COUNT = PARAMETER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.EventParameterRangesImpl <em>Event Parameter Ranges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.EventParameterRangesImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getEventParameterRanges()
	 * @generated
	 */
	int EVENT_PARAMETER_RANGES = 31;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER_RANGES__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Ranges For Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER_RANGES__RANGES_FOR_PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Event Parameter Ranges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER_RANGES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event Parameter Ranges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER_RANGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.RangesForParameterImpl <em>Ranges For Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.RangesForParameterImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getRangesForParameter()
	 * @generated
	 */
	int RANGES_FOR_PARAMETER = 32;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGES_FOR_PARAMETER__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGES_FOR_PARAMETER__RANGES = 1;

	/**
	 * The number of structural features of the '<em>Ranges For Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGES_FOR_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ranges For Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGES_FOR_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.AbstractRangesImpl <em>Abstract Ranges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.AbstractRangesImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getAbstractRanges()
	 * @generated
	 */
	int ABSTRACT_RANGES = 33;

	/**
	 * The number of structural features of the '<em>Abstract Ranges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RANGES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Ranges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RANGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.IntegerRangesImpl <em>Integer Ranges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.IntegerRangesImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getIntegerRanges()
	 * @generated
	 */
	int INTEGER_RANGES = 34;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGES__MIN = ABSTRACT_RANGES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGES__MAX = ABSTRACT_RANGES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGES__VALUES = ABSTRACT_RANGES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Ranges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGES_FEATURE_COUNT = ABSTRACT_RANGES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integer Ranges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGES_OPERATION_COUNT = ABSTRACT_RANGES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.StringRangesImpl <em>String Ranges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.StringRangesImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getStringRanges()
	 * @generated
	 */
	int STRING_RANGES = 35;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGES__VALUES = ABSTRACT_RANGES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Ranges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGES_FEATURE_COUNT = ABSTRACT_RANGES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Ranges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGES_OPERATION_COUNT = ABSTRACT_RANGES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.EnumRangesImpl <em>Enum Ranges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.EnumRangesImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getEnumRanges()
	 * @generated
	 */
	int ENUM_RANGES = 36;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_RANGES__VALUES = ABSTRACT_RANGES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Ranges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_RANGES_FEATURE_COUNT = ABSTRACT_RANGES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Ranges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_RANGES_OPERATION_COUNT = ABSTRACT_RANGES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ChannelOptionsImpl <em>Channel Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ChannelOptionsImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getChannelOptions()
	 * @generated
	 */
	int CHANNEL_OPTIONS = 37;

	/**
	 * The feature id for the '<em><b>All Messages Require Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPTIONS__ALL_MESSAGES_REQUIRE_LINKS = 0;

	/**
	 * The feature id for the '<em><b>Message Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPTIONS__MESSAGE_CHANNELS = 1;

	/**
	 * The number of structural features of the '<em>Channel Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPTIONS_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Channels For Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPTIONS___GET_CHANNELS_FOR_EVENT__ETYPEDELEMENT = 0;

	/**
	 * The number of operations of the '<em>Channel Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPTIONS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.MessageChannelImpl <em>Message Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.MessageChannelImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getMessageChannel()
	 * @generated
	 */
	int MESSAGE_CHANNEL = 38;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHANNEL__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Channel Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHANNEL__CHANNEL_FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Message Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHANNEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.TimedConditionFragmentImpl <em>Timed Condition Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.TimedConditionFragmentImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getTimedConditionFragment()
	 * @generated
	 */
	int TIMED_CONDITION_FRAGMENT = 42;

	/**
	 * The feature id for the '<em><b>Timed Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Condition Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONDITION_FRAGMENT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Condition Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONDITION_FRAGMENT_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.TimedViolationConditionImpl <em>Timed Violation Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.TimedViolationConditionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getTimedViolationCondition()
	 * @generated
	 */
	int TIMED_VIOLATION_CONDITION = 39;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.TimedInterruptConditionImpl <em>Timed Interrupt Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.TimedInterruptConditionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getTimedInterruptCondition()
	 * @generated
	 */
	int TIMED_INTERRUPT_CONDITION = 40;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.TimedWaitConditionImpl <em>Timed Wait Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.TimedWaitConditionImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getTimedWaitCondition()
	 * @generated
	 */
	int TIMED_WAIT_CONDITION = 41;

	/**
	 * The feature id for the '<em><b>Timed Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_VIOLATION_CONDITION__TIMED_CONDITION_EXPRESSION = TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Timed Violation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_VIOLATION_CONDITION_FEATURE_COUNT = TIMED_CONDITION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timed Violation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_VIOLATION_CONDITION_OPERATION_COUNT = TIMED_CONDITION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timed Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INTERRUPT_CONDITION__TIMED_CONDITION_EXPRESSION = TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Timed Interrupt Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INTERRUPT_CONDITION_FEATURE_COUNT = TIMED_CONDITION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timed Interrupt Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INTERRUPT_CONDITION_OPERATION_COUNT = TIMED_CONDITION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timed Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_WAIT_CONDITION__TIMED_CONDITION_EXPRESSION = TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Requested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_WAIT_CONDITION__REQUESTED = TIMED_CONDITION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_WAIT_CONDITION__STRICT = TIMED_CONDITION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timed Wait Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_WAIT_CONDITION_FEATURE_COUNT = TIMED_CONDITION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Timed Wait Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_WAIT_CONDITION_OPERATION_COUNT = TIMED_CONDITION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.ClockFragmentImpl <em>Clock Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.ClockFragmentImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getClockFragment()
	 * @generated
	 */
	int CLOCK_FRAGMENT = 43;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FRAGMENT__EXPRESSION = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FRAGMENT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clock Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FRAGMENT_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.impl.DummyExprClassImpl <em>Dummy Expr Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.impl.DummyExprClassImpl
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getDummyExprClass()
	 * @generated
	 */
	int DUMMY_EXPR_CLASS = 44;

	/**
	 * The number of structural features of the '<em>Dummy Expr Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_EXPR_CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dummy Expr Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_EXPR_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.scenariotools.sml.ScenarioKind <em>Scenario Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.ScenarioKind
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getScenarioKind()
	 * @generated
	 */
	int SCENARIO_KIND = 45;


	/**
	 * The meta object id for the '{@link org.scenariotools.sml.ExpectationKind <em>Expectation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.scenariotools.sml.ExpectationKind
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getExpectationKind()
	 * @generated
	 */
	int EXPECTATION_KIND = 46;

	/**
	 * The meta object id for the '<em>Dummy Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.scenariotools.sml.impl.SmlPackageImpl#getDummyDatatype()
	 * @generated
	 */
	int DUMMY_DATATYPE = 47;

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.scenariotools.sml.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.Specification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.scenariotools.sml.Specification#getName()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.scenariotools.sml.Specification#getCollaborations <em>Collaborations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collaborations</em>'.
	 * @see org.scenariotools.sml.Specification#getCollaborations()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Collaborations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.Specification#getContainedCollaborations <em>Contained Collaborations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Collaborations</em>'.
	 * @see org.scenariotools.sml.Specification#getContainedCollaborations()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_ContainedCollaborations();

	/**
	 * Returns the meta object for the reference list '{@link org.scenariotools.sml.Specification#getIncludedCollaborations <em>Included Collaborations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Collaborations</em>'.
	 * @see org.scenariotools.sml.Specification#getIncludedCollaborations()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_IncludedCollaborations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.Specification#getEventParameterRanges <em>Event Parameter Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Parameter Ranges</em>'.
	 * @see org.scenariotools.sml.Specification#getEventParameterRanges()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_EventParameterRanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.Specification#getChannelOptions <em>Channel Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel Options</em>'.
	 * @see org.scenariotools.sml.Specification#getChannelOptions()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_ChannelOptions();

	/**
	 * Returns the meta object for the reference list '{@link org.scenariotools.sml.Specification#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domains</em>'.
	 * @see org.scenariotools.sml.Specification#getDomains()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Domains();

	/**
	 * Returns the meta object for the reference list '{@link org.scenariotools.sml.Specification#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contexts</em>'.
	 * @see org.scenariotools.sml.Specification#getContexts()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Contexts();

	/**
	 * Returns the meta object for the reference list '{@link org.scenariotools.sml.Specification#getControllableEClasses <em>Controllable EClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controllable EClasses</em>'.
	 * @see org.scenariotools.sml.Specification#getControllableEClasses()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_ControllableEClasses();

	/**
	 * Returns the meta object for the reference list '{@link org.scenariotools.sml.Specification#getNonSpontaneousOperations <em>Non Spontaneous Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Non Spontaneous Operations</em>'.
	 * @see org.scenariotools.sml.Specification#getNonSpontaneousOperations()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_NonSpontaneousOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.Specification#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.scenariotools.sml.Specification#getImports()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Imports();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration</em>'.
	 * @see org.scenariotools.sml.Collaboration
	 * @generated
	 */
	EClass getCollaboration();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.Collaboration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.scenariotools.sml.Collaboration#getName()
	 * @see #getCollaboration()
	 * @generated
	 */
	EAttribute getCollaboration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.Collaboration#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.scenariotools.sml.Collaboration#getImports()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Imports();

	/**
	 * Returns the meta object for the reference list '{@link org.scenariotools.sml.Collaboration#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domains</em>'.
	 * @see org.scenariotools.sml.Collaboration#getDomains()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Domains();

	/**
	 * Returns the meta object for the reference list '{@link org.scenariotools.sml.Collaboration#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contexts</em>'.
	 * @see org.scenariotools.sml.Collaboration#getContexts()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.Collaboration#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.scenariotools.sml.Collaboration#getRoles()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.Collaboration#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see org.scenariotools.sml.Collaboration#getScenarios()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Scenarios();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.scenariotools.sml.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.scenariotools.sml.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.Role#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.scenariotools.sml.Role#getType()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.Role#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.scenariotools.sml.Role#isStatic()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Static();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.Role#isMultiRole <em>Multi Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Role</em>'.
	 * @see org.scenariotools.sml.Role#isMultiRole()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_MultiRole();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.scenariotools.sml.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.scenariotools.sml.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.Scenario#isSingular <em>Singular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singular</em>'.
	 * @see org.scenariotools.sml.Scenario#isSingular()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Singular();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.Scenario#getRoleBindings <em>Role Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Bindings</em>'.
	 * @see org.scenariotools.sml.Scenario#getRoleBindings()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_RoleBindings();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.Scenario#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.scenariotools.sml.Scenario#getKind()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Kind();

	/**
	 * Returns the meta object for the reference list '{@link org.scenariotools.sml.Scenario#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contexts</em>'.
	 * @see org.scenariotools.sml.Scenario#getContexts()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Contexts();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.Scenario#getOwnedInteraction <em>Owned Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Interaction</em>'.
	 * @see org.scenariotools.sml.Scenario#getOwnedInteraction()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_OwnedInteraction();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.Scenario#isOptimizeCost <em>Optimize Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimize Cost</em>'.
	 * @see org.scenariotools.sml.Scenario#isOptimizeCost()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_OptimizeCost();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.Scenario#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.scenariotools.sml.Scenario#getCost()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Cost();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ConstraintBlock <em>Constraint Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Block</em>'.
	 * @see org.scenariotools.sml.ConstraintBlock
	 * @generated
	 */
	EClass getConstraintBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.ConstraintBlock#getConsider <em>Consider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consider</em>'.
	 * @see org.scenariotools.sml.ConstraintBlock#getConsider()
	 * @see #getConstraintBlock()
	 * @generated
	 */
	EReference getConstraintBlock_Consider();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.ConstraintBlock#getIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ignore</em>'.
	 * @see org.scenariotools.sml.ConstraintBlock#getIgnore()
	 * @see #getConstraintBlock()
	 * @generated
	 */
	EReference getConstraintBlock_Ignore();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.ConstraintBlock#getInterrupt <em>Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interrupt</em>'.
	 * @see org.scenariotools.sml.ConstraintBlock#getInterrupt()
	 * @see #getConstraintBlock()
	 * @generated
	 */
	EReference getConstraintBlock_Interrupt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.ConstraintBlock#getForbidden <em>Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forbidden</em>'.
	 * @see org.scenariotools.sml.ConstraintBlock#getForbidden()
	 * @see #getConstraintBlock()
	 * @generated
	 */
	EReference getConstraintBlock_Forbidden();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Fragment</em>'.
	 * @see org.scenariotools.sml.InteractionFragment
	 * @generated
	 */
	EClass getInteractionFragment();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see org.scenariotools.sml.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.Interaction#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see org.scenariotools.sml.Interaction#getFragments()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Fragments();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.Interaction#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see org.scenariotools.sml.Interaction#getConstraints()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Constraints();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.scenariotools.sml.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.Message#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see org.scenariotools.sml.Message#getReceiver()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Receiver();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.Message#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see org.scenariotools.sml.Message#getSender()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Sender();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.Message#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see org.scenariotools.sml.Message#getModelElement()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.Message#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.scenariotools.sml.Message#getParameters()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.Message#getCollectionModification <em>Collection Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Modification</em>'.
	 * @see org.scenariotools.sml.Message#getCollectionModification()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_CollectionModification();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ModalMessage <em>Modal Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modal Message</em>'.
	 * @see org.scenariotools.sml.ModalMessage
	 * @generated
	 */
	EClass getModalMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.ModalMessage#isStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict</em>'.
	 * @see org.scenariotools.sml.ModalMessage#isStrict()
	 * @see #getModalMessage()
	 * @generated
	 */
	EAttribute getModalMessage_Strict();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.ModalMessage#isMonitored <em>Monitored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitored</em>'.
	 * @see org.scenariotools.sml.ModalMessage#isMonitored()
	 * @see #getModalMessage()
	 * @generated
	 */
	EAttribute getModalMessage_Monitored();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.ModalMessage#getExpectationKind <em>Expectation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expectation Kind</em>'.
	 * @see org.scenariotools.sml.ModalMessage#getExpectationKind()
	 * @see #getModalMessage()
	 * @generated
	 */
	EAttribute getModalMessage_ExpectationKind();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see org.scenariotools.sml.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.Alternative#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.scenariotools.sml.Alternative#getCases()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Cases();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see org.scenariotools.sml.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.Case#getCaseInteraction <em>Case Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Interaction</em>'.
	 * @see org.scenariotools.sml.Case#getCaseInteraction()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_CaseInteraction();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.Case#getCaseCondition <em>Case Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Condition</em>'.
	 * @see org.scenariotools.sml.Case#getCaseCondition()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_CaseCondition();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see org.scenariotools.sml.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.Loop#getBodyInteraction <em>Body Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Interaction</em>'.
	 * @see org.scenariotools.sml.Loop#getBodyInteraction()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_BodyInteraction();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.Loop#getLoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Condition</em>'.
	 * @see org.scenariotools.sml.Loop#getLoopCondition()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_LoopCondition();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see org.scenariotools.sml.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.Parallel#getParallelInteraction <em>Parallel Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel Interaction</em>'.
	 * @see org.scenariotools.sml.Parallel#getParallelInteraction()
	 * @see #getParallel()
	 * @generated
	 */
	EReference getParallel_ParallelInteraction();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ConditionFragment <em>Condition Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Fragment</em>'.
	 * @see org.scenariotools.sml.ConditionFragment
	 * @generated
	 */
	EClass getConditionFragment();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.ConditionFragment#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expression</em>'.
	 * @see org.scenariotools.sml.ConditionFragment#getConditionExpression()
	 * @see #getConditionFragment()
	 * @generated
	 */
	EReference getConditionFragment_ConditionExpression();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.WaitCondition <em>Wait Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait Condition</em>'.
	 * @see org.scenariotools.sml.WaitCondition
	 * @generated
	 */
	EClass getWaitCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.WaitCondition#isStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict</em>'.
	 * @see org.scenariotools.sml.WaitCondition#isStrict()
	 * @see #getWaitCondition()
	 * @generated
	 */
	EAttribute getWaitCondition_Strict();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.WaitCondition#isRequested <em>Requested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requested</em>'.
	 * @see org.scenariotools.sml.WaitCondition#isRequested()
	 * @see #getWaitCondition()
	 * @generated
	 */
	EAttribute getWaitCondition_Requested();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.InterruptCondition <em>Interrupt Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt Condition</em>'.
	 * @see org.scenariotools.sml.InterruptCondition
	 * @generated
	 */
	EClass getInterruptCondition();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ViolationCondition <em>Violation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Violation Condition</em>'.
	 * @see org.scenariotools.sml.ViolationCondition
	 * @generated
	 */
	EClass getViolationCondition();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.scenariotools.sml.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Expression</em>'.
	 * @see org.scenariotools.sml.ConditionExpression
	 * @generated
	 */
	EClass getConditionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.ConditionExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.scenariotools.sml.ConditionExpression#getExpression()
	 * @see #getConditionExpression()
	 * @generated
	 */
	EReference getConditionExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.VariableFragment <em>Variable Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Fragment</em>'.
	 * @see org.scenariotools.sml.VariableFragment
	 * @generated
	 */
	EClass getVariableFragment();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.VariableFragment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.scenariotools.sml.VariableFragment#getExpression()
	 * @see #getVariableFragment()
	 * @generated
	 */
	EReference getVariableFragment_Expression();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.BindingConstraint <em>Binding Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Constraint</em>'.
	 * @see org.scenariotools.sml.BindingConstraint
	 * @generated
	 */
	EClass getBindingConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.BindingConstraint#getBindingExpression <em>Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Expression</em>'.
	 * @see org.scenariotools.sml.BindingConstraint#getBindingExpression()
	 * @see #getBindingConstraint()
	 * @generated
	 */
	EReference getBindingConstraint_BindingExpression();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.RoleBindingConstraint <em>Role Binding Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Binding Constraint</em>'.
	 * @see org.scenariotools.sml.RoleBindingConstraint
	 * @generated
	 */
	EClass getRoleBindingConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.RoleBindingConstraint#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.scenariotools.sml.RoleBindingConstraint#getRole()
	 * @see #getRoleBindingConstraint()
	 * @generated
	 */
	EReference getRoleBindingConstraint_Role();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding</em>'.
	 * @see org.scenariotools.sml.ParameterBinding
	 * @generated
	 */
	EClass getParameterBinding();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.BindingExpression <em>Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Expression</em>'.
	 * @see org.scenariotools.sml.BindingExpression
	 * @generated
	 */
	EClass getBindingExpression();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.FeatureAccessBindingExpression <em>Feature Access Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Access Binding Expression</em>'.
	 * @see org.scenariotools.sml.FeatureAccessBindingExpression
	 * @generated
	 */
	EClass getFeatureAccessBindingExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.FeatureAccessBindingExpression#getFeatureaccess <em>Featureaccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Featureaccess</em>'.
	 * @see org.scenariotools.sml.FeatureAccessBindingExpression#getFeatureaccess()
	 * @see #getFeatureAccessBindingExpression()
	 * @generated
	 */
	EReference getFeatureAccessBindingExpression_Featureaccess();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ObjectQueryBindingExpression <em>Object Query Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Query Binding Expression</em>'.
	 * @see org.scenariotools.sml.ObjectQueryBindingExpression
	 * @generated
	 */
	EClass getObjectQueryBindingExpression();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.ObjectQueryBindingExpression#getQueryClass <em>Query Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query Class</em>'.
	 * @see org.scenariotools.sml.ObjectQueryBindingExpression#getQueryClass()
	 * @see #getObjectQueryBindingExpression()
	 * @generated
	 */
	EReference getObjectQueryBindingExpression_QueryClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.ObjectQueryBindingExpression#getQueryValues <em>Query Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Values</em>'.
	 * @see org.scenariotools.sml.ObjectQueryBindingExpression#getQueryValues()
	 * @see #getObjectQueryBindingExpression()
	 * @generated
	 */
	EReference getObjectQueryBindingExpression_QueryValues();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ObjectQueryValue <em>Object Query Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Query Value</em>'.
	 * @see org.scenariotools.sml.ObjectQueryValue
	 * @generated
	 */
	EClass getObjectQueryValue();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.ObjectQueryValue#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.scenariotools.sml.ObjectQueryValue#getFeature()
	 * @see #getObjectQueryValue()
	 * @generated
	 */
	EReference getObjectQueryValue_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.ObjectQueryValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.scenariotools.sml.ObjectQueryValue#getExpression()
	 * @see #getObjectQueryValue()
	 * @generated
	 */
	EReference getObjectQueryValue_Expression();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ParameterExpression <em>Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Expression</em>'.
	 * @see org.scenariotools.sml.ParameterExpression
	 * @generated
	 */
	EClass getParameterExpression();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.WildcardParameterExpression <em>Wildcard Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wildcard Parameter Expression</em>'.
	 * @see org.scenariotools.sml.WildcardParameterExpression
	 * @generated
	 */
	EClass getWildcardParameterExpression();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ValueParameterExpression <em>Value Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Parameter Expression</em>'.
	 * @see org.scenariotools.sml.ValueParameterExpression
	 * @generated
	 */
	EClass getValueParameterExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.ValueParameterExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.scenariotools.sml.ValueParameterExpression#getValue()
	 * @see #getValueParameterExpression()
	 * @generated
	 */
	EReference getValueParameterExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.VariableBindingParameterExpression <em>Variable Binding Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Binding Parameter Expression</em>'.
	 * @see org.scenariotools.sml.VariableBindingParameterExpression
	 * @generated
	 */
	EClass getVariableBindingParameterExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.VariableBindingParameterExpression#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.scenariotools.sml.VariableBindingParameterExpression#getVariable()
	 * @see #getVariableBindingParameterExpression()
	 * @generated
	 */
	EReference getVariableBindingParameterExpression_Variable();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.EventParameterRanges <em>Event Parameter Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Parameter Ranges</em>'.
	 * @see org.scenariotools.sml.EventParameterRanges
	 * @generated
	 */
	EClass getEventParameterRanges();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.EventParameterRanges#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.scenariotools.sml.EventParameterRanges#getEvent()
	 * @see #getEventParameterRanges()
	 * @generated
	 */
	EReference getEventParameterRanges_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.EventParameterRanges#getRangesForParameter <em>Ranges For Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ranges For Parameter</em>'.
	 * @see org.scenariotools.sml.EventParameterRanges#getRangesForParameter()
	 * @see #getEventParameterRanges()
	 * @generated
	 */
	EReference getEventParameterRanges_RangesForParameter();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.RangesForParameter <em>Ranges For Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranges For Parameter</em>'.
	 * @see org.scenariotools.sml.RangesForParameter
	 * @generated
	 */
	EClass getRangesForParameter();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.RangesForParameter#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.scenariotools.sml.RangesForParameter#getParameter()
	 * @see #getRangesForParameter()
	 * @generated
	 */
	EReference getRangesForParameter_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.RangesForParameter#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see org.scenariotools.sml.RangesForParameter#getRanges()
	 * @see #getRangesForParameter()
	 * @generated
	 */
	EReference getRangesForParameter_Ranges();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.AbstractRanges <em>Abstract Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Ranges</em>'.
	 * @see org.scenariotools.sml.AbstractRanges
	 * @generated
	 */
	EClass getAbstractRanges();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.IntegerRanges <em>Integer Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Ranges</em>'.
	 * @see org.scenariotools.sml.IntegerRanges
	 * @generated
	 */
	EClass getIntegerRanges();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.IntegerRanges#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.scenariotools.sml.IntegerRanges#getMin()
	 * @see #getIntegerRanges()
	 * @generated
	 */
	EAttribute getIntegerRanges_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.IntegerRanges#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.scenariotools.sml.IntegerRanges#getMax()
	 * @see #getIntegerRanges()
	 * @generated
	 */
	EAttribute getIntegerRanges_Max();

	/**
	 * Returns the meta object for the attribute list '{@link org.scenariotools.sml.IntegerRanges#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.scenariotools.sml.IntegerRanges#getValues()
	 * @see #getIntegerRanges()
	 * @generated
	 */
	EAttribute getIntegerRanges_Values();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.StringRanges <em>String Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Ranges</em>'.
	 * @see org.scenariotools.sml.StringRanges
	 * @generated
	 */
	EClass getStringRanges();

	/**
	 * Returns the meta object for the attribute list '{@link org.scenariotools.sml.StringRanges#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.scenariotools.sml.StringRanges#getValues()
	 * @see #getStringRanges()
	 * @generated
	 */
	EAttribute getStringRanges_Values();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.EnumRanges <em>Enum Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Ranges</em>'.
	 * @see org.scenariotools.sml.EnumRanges
	 * @generated
	 */
	EClass getEnumRanges();

	/**
	 * Returns the meta object for the reference list '{@link org.scenariotools.sml.EnumRanges#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.scenariotools.sml.EnumRanges#getValues()
	 * @see #getEnumRanges()
	 * @generated
	 */
	EReference getEnumRanges_Values();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ChannelOptions <em>Channel Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Options</em>'.
	 * @see org.scenariotools.sml.ChannelOptions
	 * @generated
	 */
	EClass getChannelOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.ChannelOptions#isAllMessagesRequireLinks <em>All Messages Require Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Messages Require Links</em>'.
	 * @see org.scenariotools.sml.ChannelOptions#isAllMessagesRequireLinks()
	 * @see #getChannelOptions()
	 * @generated
	 */
	EAttribute getChannelOptions_AllMessagesRequireLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.scenariotools.sml.ChannelOptions#getMessageChannels <em>Message Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Channels</em>'.
	 * @see org.scenariotools.sml.ChannelOptions#getMessageChannels()
	 * @see #getChannelOptions()
	 * @generated
	 */
	EReference getChannelOptions_MessageChannels();

	/**
	 * Returns the meta object for the '{@link org.scenariotools.sml.ChannelOptions#getChannelsForEvent(org.eclipse.emf.ecore.ETypedElement) <em>Get Channels For Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Channels For Event</em>' operation.
	 * @see org.scenariotools.sml.ChannelOptions#getChannelsForEvent(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getChannelOptions__GetChannelsForEvent__ETypedElement();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.MessageChannel <em>Message Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Channel</em>'.
	 * @see org.scenariotools.sml.MessageChannel
	 * @generated
	 */
	EClass getMessageChannel();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.MessageChannel#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.scenariotools.sml.MessageChannel#getEvent()
	 * @see #getMessageChannel()
	 * @generated
	 */
	EReference getMessageChannel_Event();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.MessageChannel#getChannelFeature <em>Channel Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel Feature</em>'.
	 * @see org.scenariotools.sml.MessageChannel#getChannelFeature()
	 * @see #getMessageChannel()
	 * @generated
	 */
	EReference getMessageChannel_ChannelFeature();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.TimedViolationCondition <em>Timed Violation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Violation Condition</em>'.
	 * @see org.scenariotools.sml.TimedViolationCondition
	 * @generated
	 */
	EClass getTimedViolationCondition();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.TimedInterruptCondition <em>Timed Interrupt Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Interrupt Condition</em>'.
	 * @see org.scenariotools.sml.TimedInterruptCondition
	 * @generated
	 */
	EClass getTimedInterruptCondition();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.TimedWaitCondition <em>Timed Wait Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Wait Condition</em>'.
	 * @see org.scenariotools.sml.TimedWaitCondition
	 * @generated
	 */
	EClass getTimedWaitCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.TimedWaitCondition#isRequested <em>Requested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requested</em>'.
	 * @see org.scenariotools.sml.TimedWaitCondition#isRequested()
	 * @see #getTimedWaitCondition()
	 * @generated
	 */
	EAttribute getTimedWaitCondition_Requested();

	/**
	 * Returns the meta object for the attribute '{@link org.scenariotools.sml.TimedWaitCondition#isStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict</em>'.
	 * @see org.scenariotools.sml.TimedWaitCondition#isStrict()
	 * @see #getTimedWaitCondition()
	 * @generated
	 */
	EAttribute getTimedWaitCondition_Strict();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.TimedConditionFragment <em>Timed Condition Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Condition Fragment</em>'.
	 * @see org.scenariotools.sml.TimedConditionFragment
	 * @generated
	 */
	EClass getTimedConditionFragment();

	/**
	 * Returns the meta object for the containment reference '{@link org.scenariotools.sml.TimedConditionFragment#getTimedConditionExpression <em>Timed Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timed Condition Expression</em>'.
	 * @see org.scenariotools.sml.TimedConditionFragment#getTimedConditionExpression()
	 * @see #getTimedConditionFragment()
	 * @generated
	 */
	EReference getTimedConditionFragment_TimedConditionExpression();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.ClockFragment <em>Clock Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Fragment</em>'.
	 * @see org.scenariotools.sml.ClockFragment
	 * @generated
	 */
	EClass getClockFragment();

	/**
	 * Returns the meta object for the reference '{@link org.scenariotools.sml.ClockFragment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.scenariotools.sml.ClockFragment#getExpression()
	 * @see #getClockFragment()
	 * @generated
	 */
	EReference getClockFragment_Expression();

	/**
	 * Returns the meta object for class '{@link org.scenariotools.sml.DummyExprClass <em>Dummy Expr Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy Expr Class</em>'.
	 * @see org.scenariotools.sml.DummyExprClass
	 * @generated
	 */
	EClass getDummyExprClass();

	/**
	 * Returns the meta object for enum '{@link org.scenariotools.sml.ScenarioKind <em>Scenario Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scenario Kind</em>'.
	 * @see org.scenariotools.sml.ScenarioKind
	 * @generated
	 */
	EEnum getScenarioKind();

	/**
	 * Returns the meta object for enum '{@link org.scenariotools.sml.ExpectationKind <em>Expectation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expectation Kind</em>'.
	 * @see org.scenariotools.sml.ExpectationKind
	 * @generated
	 */
	EEnum getExpectationKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dummy Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dummy Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getDummyDatatype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmlFactory getSmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.SpecificationImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__NAME = eINSTANCE.getSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Collaborations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__COLLABORATIONS = eINSTANCE.getSpecification_Collaborations();

		/**
		 * The meta object literal for the '<em><b>Contained Collaborations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__CONTAINED_COLLABORATIONS = eINSTANCE.getSpecification_ContainedCollaborations();

		/**
		 * The meta object literal for the '<em><b>Included Collaborations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__INCLUDED_COLLABORATIONS = eINSTANCE.getSpecification_IncludedCollaborations();

		/**
		 * The meta object literal for the '<em><b>Event Parameter Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__EVENT_PARAMETER_RANGES = eINSTANCE.getSpecification_EventParameterRanges();

		/**
		 * The meta object literal for the '<em><b>Channel Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__CHANNEL_OPTIONS = eINSTANCE.getSpecification_ChannelOptions();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__DOMAINS = eINSTANCE.getSpecification_Domains();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__CONTEXTS = eINSTANCE.getSpecification_Contexts();

		/**
		 * The meta object literal for the '<em><b>Controllable EClasses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__CONTROLLABLE_ECLASSES = eINSTANCE.getSpecification_ControllableEClasses();

		/**
		 * The meta object literal for the '<em><b>Non Spontaneous Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__NON_SPONTANEOUS_OPERATIONS = eINSTANCE.getSpecification_NonSpontaneousOperations();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__IMPORTS = eINSTANCE.getSpecification_Imports();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.CollaborationImpl <em>Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.CollaborationImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getCollaboration()
		 * @generated
		 */
		EClass COLLABORATION = eINSTANCE.getCollaboration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION__NAME = eINSTANCE.getCollaboration_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__IMPORTS = eINSTANCE.getCollaboration_Imports();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__DOMAINS = eINSTANCE.getCollaboration_Domains();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__CONTEXTS = eINSTANCE.getCollaboration_Contexts();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__ROLES = eINSTANCE.getCollaboration_Roles();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__SCENARIOS = eINSTANCE.getCollaboration_Scenarios();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.RoleImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__TYPE = eINSTANCE.getRole_Type();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__STATIC = eINSTANCE.getRole_Static();

		/**
		 * The meta object literal for the '<em><b>Multi Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__MULTI_ROLE = eINSTANCE.getRole_MultiRole();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ScenarioImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Singular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__SINGULAR = eINSTANCE.getScenario_Singular();

		/**
		 * The meta object literal for the '<em><b>Role Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ROLE_BINDINGS = eINSTANCE.getScenario_RoleBindings();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__KIND = eINSTANCE.getScenario_Kind();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CONTEXTS = eINSTANCE.getScenario_Contexts();

		/**
		 * The meta object literal for the '<em><b>Owned Interaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__OWNED_INTERACTION = eINSTANCE.getScenario_OwnedInteraction();

		/**
		 * The meta object literal for the '<em><b>Optimize Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__OPTIMIZE_COST = eINSTANCE.getScenario_OptimizeCost();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__COST = eINSTANCE.getScenario_Cost();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ConstraintBlockImpl <em>Constraint Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ConstraintBlockImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getConstraintBlock()
		 * @generated
		 */
		EClass CONSTRAINT_BLOCK = eINSTANCE.getConstraintBlock();

		/**
		 * The meta object literal for the '<em><b>Consider</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_BLOCK__CONSIDER = eINSTANCE.getConstraintBlock_Consider();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_BLOCK__IGNORE = eINSTANCE.getConstraintBlock_Ignore();

		/**
		 * The meta object literal for the '<em><b>Interrupt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_BLOCK__INTERRUPT = eINSTANCE.getConstraintBlock_Interrupt();

		/**
		 * The meta object literal for the '<em><b>Forbidden</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_BLOCK__FORBIDDEN = eINSTANCE.getConstraintBlock_Forbidden();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.InteractionFragmentImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getInteractionFragment()
		 * @generated
		 */
		EClass INTERACTION_FRAGMENT = eINSTANCE.getInteractionFragment();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.InteractionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__FRAGMENTS = eINSTANCE.getInteraction_Fragments();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__CONSTRAINTS = eINSTANCE.getInteraction_Constraints();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.MessageImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__RECEIVER = eINSTANCE.getMessage_Receiver();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SENDER = eINSTANCE.getMessage_Sender();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__MODEL_ELEMENT = eINSTANCE.getMessage_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__PARAMETERS = eINSTANCE.getMessage_Parameters();

		/**
		 * The meta object literal for the '<em><b>Collection Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__COLLECTION_MODIFICATION = eINSTANCE.getMessage_CollectionModification();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ModalMessageImpl <em>Modal Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ModalMessageImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getModalMessage()
		 * @generated
		 */
		EClass MODAL_MESSAGE = eINSTANCE.getModalMessage();

		/**
		 * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL_MESSAGE__STRICT = eINSTANCE.getModalMessage_Strict();

		/**
		 * The meta object literal for the '<em><b>Monitored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL_MESSAGE__MONITORED = eINSTANCE.getModalMessage_Monitored();

		/**
		 * The meta object literal for the '<em><b>Expectation Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL_MESSAGE__EXPECTATION_KIND = eINSTANCE.getModalMessage_ExpectationKind();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.AlternativeImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__CASES = eINSTANCE.getAlternative_Cases();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.CaseImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Case Interaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CASE_INTERACTION = eINSTANCE.getCase_CaseInteraction();

		/**
		 * The meta object literal for the '<em><b>Case Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CASE_CONDITION = eINSTANCE.getCase_CaseCondition();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.LoopImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Body Interaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BODY_INTERACTION = eINSTANCE.getLoop_BodyInteraction();

		/**
		 * The meta object literal for the '<em><b>Loop Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__LOOP_CONDITION = eINSTANCE.getLoop_LoopCondition();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ParallelImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '<em><b>Parallel Interaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL__PARALLEL_INTERACTION = eINSTANCE.getParallel_ParallelInteraction();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ConditionFragmentImpl <em>Condition Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ConditionFragmentImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getConditionFragment()
		 * @generated
		 */
		EClass CONDITION_FRAGMENT = eINSTANCE.getConditionFragment();

		/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_FRAGMENT__CONDITION_EXPRESSION = eINSTANCE.getConditionFragment_ConditionExpression();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.WaitConditionImpl <em>Wait Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.WaitConditionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getWaitCondition()
		 * @generated
		 */
		EClass WAIT_CONDITION = eINSTANCE.getWaitCondition();

		/**
		 * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_CONDITION__STRICT = eINSTANCE.getWaitCondition_Strict();

		/**
		 * The meta object literal for the '<em><b>Requested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_CONDITION__REQUESTED = eINSTANCE.getWaitCondition_Requested();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.InterruptConditionImpl <em>Interrupt Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.InterruptConditionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getInterruptCondition()
		 * @generated
		 */
		EClass INTERRUPT_CONDITION = eINSTANCE.getInterruptCondition();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ViolationConditionImpl <em>Violation Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ViolationConditionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getViolationCondition()
		 * @generated
		 */
		EClass VIOLATION_CONDITION = eINSTANCE.getViolationCondition();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ConditionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ConditionExpressionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getConditionExpression()
		 * @generated
		 */
		EClass CONDITION_EXPRESSION = eINSTANCE.getConditionExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_EXPRESSION__EXPRESSION = eINSTANCE.getConditionExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.VariableFragmentImpl <em>Variable Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.VariableFragmentImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getVariableFragment()
		 * @generated
		 */
		EClass VARIABLE_FRAGMENT = eINSTANCE.getVariableFragment();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_FRAGMENT__EXPRESSION = eINSTANCE.getVariableFragment_Expression();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.BindingConstraintImpl <em>Binding Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.BindingConstraintImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getBindingConstraint()
		 * @generated
		 */
		EClass BINDING_CONSTRAINT = eINSTANCE.getBindingConstraint();

		/**
		 * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_CONSTRAINT__BINDING_EXPRESSION = eINSTANCE.getBindingConstraint_BindingExpression();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.RoleBindingConstraintImpl <em>Role Binding Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.RoleBindingConstraintImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getRoleBindingConstraint()
		 * @generated
		 */
		EClass ROLE_BINDING_CONSTRAINT = eINSTANCE.getRoleBindingConstraint();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_BINDING_CONSTRAINT__ROLE = eINSTANCE.getRoleBindingConstraint_Role();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ParameterBindingImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getParameterBinding()
		 * @generated
		 */
		EClass PARAMETER_BINDING = eINSTANCE.getParameterBinding();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.BindingExpressionImpl <em>Binding Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.BindingExpressionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getBindingExpression()
		 * @generated
		 */
		EClass BINDING_EXPRESSION = eINSTANCE.getBindingExpression();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.FeatureAccessBindingExpressionImpl <em>Feature Access Binding Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.FeatureAccessBindingExpressionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getFeatureAccessBindingExpression()
		 * @generated
		 */
		EClass FEATURE_ACCESS_BINDING_EXPRESSION = eINSTANCE.getFeatureAccessBindingExpression();

		/**
		 * The meta object literal for the '<em><b>Featureaccess</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS = eINSTANCE.getFeatureAccessBindingExpression_Featureaccess();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ObjectQueryBindingExpressionImpl <em>Object Query Binding Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ObjectQueryBindingExpressionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getObjectQueryBindingExpression()
		 * @generated
		 */
		EClass OBJECT_QUERY_BINDING_EXPRESSION = eINSTANCE.getObjectQueryBindingExpression();

		/**
		 * The meta object literal for the '<em><b>Query Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_QUERY_BINDING_EXPRESSION__QUERY_CLASS = eINSTANCE.getObjectQueryBindingExpression_QueryClass();

		/**
		 * The meta object literal for the '<em><b>Query Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_QUERY_BINDING_EXPRESSION__QUERY_VALUES = eINSTANCE.getObjectQueryBindingExpression_QueryValues();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ObjectQueryValueImpl <em>Object Query Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ObjectQueryValueImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getObjectQueryValue()
		 * @generated
		 */
		EClass OBJECT_QUERY_VALUE = eINSTANCE.getObjectQueryValue();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_QUERY_VALUE__FEATURE = eINSTANCE.getObjectQueryValue_Feature();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_QUERY_VALUE__EXPRESSION = eINSTANCE.getObjectQueryValue_Expression();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ParameterExpressionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getParameterExpression()
		 * @generated
		 */
		EClass PARAMETER_EXPRESSION = eINSTANCE.getParameterExpression();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.WildcardParameterExpressionImpl <em>Wildcard Parameter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.WildcardParameterExpressionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getWildcardParameterExpression()
		 * @generated
		 */
		EClass WILDCARD_PARAMETER_EXPRESSION = eINSTANCE.getWildcardParameterExpression();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ValueParameterExpressionImpl <em>Value Parameter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ValueParameterExpressionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getValueParameterExpression()
		 * @generated
		 */
		EClass VALUE_PARAMETER_EXPRESSION = eINSTANCE.getValueParameterExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PARAMETER_EXPRESSION__VALUE = eINSTANCE.getValueParameterExpression_Value();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.VariableBindingParameterExpressionImpl <em>Variable Binding Parameter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.VariableBindingParameterExpressionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getVariableBindingParameterExpression()
		 * @generated
		 */
		EClass VARIABLE_BINDING_PARAMETER_EXPRESSION = eINSTANCE.getVariableBindingParameterExpression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_BINDING_PARAMETER_EXPRESSION__VARIABLE = eINSTANCE.getVariableBindingParameterExpression_Variable();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.EventParameterRangesImpl <em>Event Parameter Ranges</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.EventParameterRangesImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getEventParameterRanges()
		 * @generated
		 */
		EClass EVENT_PARAMETER_RANGES = eINSTANCE.getEventParameterRanges();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_PARAMETER_RANGES__EVENT = eINSTANCE.getEventParameterRanges_Event();

		/**
		 * The meta object literal for the '<em><b>Ranges For Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_PARAMETER_RANGES__RANGES_FOR_PARAMETER = eINSTANCE.getEventParameterRanges_RangesForParameter();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.RangesForParameterImpl <em>Ranges For Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.RangesForParameterImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getRangesForParameter()
		 * @generated
		 */
		EClass RANGES_FOR_PARAMETER = eINSTANCE.getRangesForParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGES_FOR_PARAMETER__PARAMETER = eINSTANCE.getRangesForParameter_Parameter();

		/**
		 * The meta object literal for the '<em><b>Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGES_FOR_PARAMETER__RANGES = eINSTANCE.getRangesForParameter_Ranges();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.AbstractRangesImpl <em>Abstract Ranges</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.AbstractRangesImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getAbstractRanges()
		 * @generated
		 */
		EClass ABSTRACT_RANGES = eINSTANCE.getAbstractRanges();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.IntegerRangesImpl <em>Integer Ranges</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.IntegerRangesImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getIntegerRanges()
		 * @generated
		 */
		EClass INTEGER_RANGES = eINSTANCE.getIntegerRanges();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_RANGES__MIN = eINSTANCE.getIntegerRanges_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_RANGES__MAX = eINSTANCE.getIntegerRanges_Max();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_RANGES__VALUES = eINSTANCE.getIntegerRanges_Values();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.StringRangesImpl <em>String Ranges</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.StringRangesImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getStringRanges()
		 * @generated
		 */
		EClass STRING_RANGES = eINSTANCE.getStringRanges();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_RANGES__VALUES = eINSTANCE.getStringRanges_Values();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.EnumRangesImpl <em>Enum Ranges</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.EnumRangesImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getEnumRanges()
		 * @generated
		 */
		EClass ENUM_RANGES = eINSTANCE.getEnumRanges();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_RANGES__VALUES = eINSTANCE.getEnumRanges_Values();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ChannelOptionsImpl <em>Channel Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ChannelOptionsImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getChannelOptions()
		 * @generated
		 */
		EClass CHANNEL_OPTIONS = eINSTANCE.getChannelOptions();

		/**
		 * The meta object literal for the '<em><b>All Messages Require Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_OPTIONS__ALL_MESSAGES_REQUIRE_LINKS = eINSTANCE.getChannelOptions_AllMessagesRequireLinks();

		/**
		 * The meta object literal for the '<em><b>Message Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_OPTIONS__MESSAGE_CHANNELS = eINSTANCE.getChannelOptions_MessageChannels();

		/**
		 * The meta object literal for the '<em><b>Get Channels For Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHANNEL_OPTIONS___GET_CHANNELS_FOR_EVENT__ETYPEDELEMENT = eINSTANCE.getChannelOptions__GetChannelsForEvent__ETypedElement();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.MessageChannelImpl <em>Message Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.MessageChannelImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getMessageChannel()
		 * @generated
		 */
		EClass MESSAGE_CHANNEL = eINSTANCE.getMessageChannel();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_CHANNEL__EVENT = eINSTANCE.getMessageChannel_Event();

		/**
		 * The meta object literal for the '<em><b>Channel Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_CHANNEL__CHANNEL_FEATURE = eINSTANCE.getMessageChannel_ChannelFeature();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.TimedViolationConditionImpl <em>Timed Violation Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.TimedViolationConditionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getTimedViolationCondition()
		 * @generated
		 */
		EClass TIMED_VIOLATION_CONDITION = eINSTANCE.getTimedViolationCondition();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.TimedInterruptConditionImpl <em>Timed Interrupt Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.TimedInterruptConditionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getTimedInterruptCondition()
		 * @generated
		 */
		EClass TIMED_INTERRUPT_CONDITION = eINSTANCE.getTimedInterruptCondition();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.TimedWaitConditionImpl <em>Timed Wait Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.TimedWaitConditionImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getTimedWaitCondition()
		 * @generated
		 */
		EClass TIMED_WAIT_CONDITION = eINSTANCE.getTimedWaitCondition();

		/**
		 * The meta object literal for the '<em><b>Requested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_WAIT_CONDITION__REQUESTED = eINSTANCE.getTimedWaitCondition_Requested();

		/**
		 * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_WAIT_CONDITION__STRICT = eINSTANCE.getTimedWaitCondition_Strict();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.TimedConditionFragmentImpl <em>Timed Condition Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.TimedConditionFragmentImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getTimedConditionFragment()
		 * @generated
		 */
		EClass TIMED_CONDITION_FRAGMENT = eINSTANCE.getTimedConditionFragment();

		/**
		 * The meta object literal for the '<em><b>Timed Condition Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_CONDITION_FRAGMENT__TIMED_CONDITION_EXPRESSION = eINSTANCE.getTimedConditionFragment_TimedConditionExpression();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.ClockFragmentImpl <em>Clock Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.ClockFragmentImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getClockFragment()
		 * @generated
		 */
		EClass CLOCK_FRAGMENT = eINSTANCE.getClockFragment();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_FRAGMENT__EXPRESSION = eINSTANCE.getClockFragment_Expression();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.impl.DummyExprClassImpl <em>Dummy Expr Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.impl.DummyExprClassImpl
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getDummyExprClass()
		 * @generated
		 */
		EClass DUMMY_EXPR_CLASS = eINSTANCE.getDummyExprClass();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.ScenarioKind <em>Scenario Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.ScenarioKind
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getScenarioKind()
		 * @generated
		 */
		EEnum SCENARIO_KIND = eINSTANCE.getScenarioKind();

		/**
		 * The meta object literal for the '{@link org.scenariotools.sml.ExpectationKind <em>Expectation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.scenariotools.sml.ExpectationKind
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getExpectationKind()
		 * @generated
		 */
		EEnum EXPECTATION_KIND = eINSTANCE.getExpectationKind();

		/**
		 * The meta object literal for the '<em>Dummy Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.scenariotools.sml.impl.SmlPackageImpl#getDummyDatatype()
		 * @generated
		 */
		EDataType DUMMY_DATATYPE = eINSTANCE.getDummyDatatype();

	}

} //SmlPackage
