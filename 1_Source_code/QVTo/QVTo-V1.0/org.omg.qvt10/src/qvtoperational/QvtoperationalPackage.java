/**
 */
package qvtoperational;

import emof.EmofPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see qvtoperational.QvtoperationalFactory
 * @model kind="package"
 * @generated
 */
public interface QvtoperationalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qvtoperational";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.schema.omg.org/spec/QVT/1.0/qvtoperational";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qvtoperational";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QvtoperationalPackage eINSTANCE = qvtoperational.impl.QvtoperationalPackageImpl.init();

	/**
	 * The meta object id for the '{@link qvtoperational.impl.OperationBodyImpl <em>Operation Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.OperationBodyImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getOperationBody()
	 * @generated
	 */
	int OPERATION_BODY = 19;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__TAG = EmofPackage.ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__OPERATION = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__CONTENT = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__VARIABLE = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_OPERATION_COUNT = EmofPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MappingBodyImpl <em>Mapping Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MappingBodyImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingBody()
	 * @generated
	 */
	int MAPPING_BODY = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__TAG = OPERATION_BODY__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__OWNED_COMMENT = OPERATION_BODY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__OPERATION = OPERATION_BODY__OPERATION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__CONTENT = OPERATION_BODY__CONTENT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__VARIABLE = OPERATION_BODY__VARIABLE;

	/**
	 * The feature id for the '<em><b>Init Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__INIT_SECTION = OPERATION_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__END_SECTION = OPERATION_BODY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Population section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__POPULATION_SECTION = OPERATION_BODY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mapping Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_FEATURE_COUNT = OPERATION_BODY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mapping Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_OPERATION_COUNT = OPERATION_BODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ImperativeOperationImpl <em>Imperative Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ImperativeOperationImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getImperativeOperation()
	 * @generated
	 */
	int IMPERATIVE_OPERATION = 12;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__IS_ORDERED = EmofPackage.OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__IS_UNIQUE = EmofPackage.OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__LOWER = EmofPackage.OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__UPPER = EmofPackage.OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__TAG = EmofPackage.OPERATION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__OWNED_COMMENT = EmofPackage.OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__NAME = EmofPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__TYPE = EmofPackage.OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__CLASS = EmofPackage.OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__OWNED_PARAMETER = EmofPackage.OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__RAISED_EXCEPTION = EmofPackage.OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__CONTEXT = EmofPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__RESULT = EmofPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__OVERRIDDEN = EmofPackage.OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__BODY = EmofPackage.OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Imperative Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_FEATURE_COUNT = EmofPackage.OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Imperative Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_OPERATION_COUNT = EmofPackage.OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.HelperImpl <em>Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.HelperImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getHelper()
	 * @generated
	 */
	int HELPER = 1;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__IS_ORDERED = IMPERATIVE_OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__IS_UNIQUE = IMPERATIVE_OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__LOWER = IMPERATIVE_OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__UPPER = IMPERATIVE_OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__TAG = IMPERATIVE_OPERATION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OWNED_COMMENT = IMPERATIVE_OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__NAME = IMPERATIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__TYPE = IMPERATIVE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__CLASS = IMPERATIVE_OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OWNED_PARAMETER = IMPERATIVE_OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__RAISED_EXCEPTION = IMPERATIVE_OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OWNED_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__NESTED_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__URI = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OWNED_TAG = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__ENTRY = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__CONFIG_PROPERTY = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__MODULE_IMPORT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__USED_MODEL_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__IS_BLACKBOX = IMPERATIVE_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OWNED_VARIABLE = IMPERATIVE_OPERATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__IS_QUERY = IMPERATIVE_OPERATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Helper header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__HELPER_HEADER = IMPERATIVE_OPERATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__EXPRESSION = IMPERATIVE_OPERATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Expression block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__EXPRESSION_BLOCK = IMPERATIVE_OPERATION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FEATURE_COUNT = IMPERATIVE_OPERATION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_COUNT = IMPERATIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ExpressionGOImpl <em>Expression GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ExpressionGOImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getExpressionGO()
	 * @generated
	 */
	int EXPRESSION_GO = 74;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_GO__DUMMY_CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Expression GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_GO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_GO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ResolveExpImpl <em>Resolve Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ResolveExpImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getResolveExp()
	 * @generated
	 */
	int RESOLVE_EXP = 2;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__DUMMY_CONTENT = EXPRESSION_GO__DUMMY_CONTENT;

	/**
	 * The feature id for the '<em><b>One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__ONE = EXPRESSION_GO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__IS_INVERSE = EXPRESSION_GO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__IS_DEFERRED = EXPRESSION_GO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__TARGET = EXPRESSION_GO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__CONDITION = EXPRESSION_GO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resolve Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_FEATURE_COUNT = EXPRESSION_GO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Resolve Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_OPERATION_COUNT = EXPRESSION_GO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ResolveInExpImpl <em>Resolve In Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ResolveInExpImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getResolveInExp()
	 * @generated
	 */
	int RESOLVE_IN_EXP = 3;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__DUMMY_CONTENT = RESOLVE_EXP__DUMMY_CONTENT;

	/**
	 * The feature id for the '<em><b>One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__ONE = RESOLVE_EXP__ONE;

	/**
	 * The feature id for the '<em><b>Is Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__IS_INVERSE = RESOLVE_EXP__IS_INVERSE;

	/**
	 * The feature id for the '<em><b>Is Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__IS_DEFERRED = RESOLVE_EXP__IS_DEFERRED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__TARGET = RESOLVE_EXP__TARGET;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__CONDITION = RESOLVE_EXP__CONDITION;

	/**
	 * The feature id for the '<em><b>In Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__IN_MAPPING = RESOLVE_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolve In Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP_FEATURE_COUNT = RESOLVE_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resolve In Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP_OPERATION_COUNT = RESOLVE_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ModuleImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 16;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TAG = EmofPackage.PACKAGE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_COMMENT = EmofPackage.PACKAGE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = EmofPackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_TYPE = EmofPackage.PACKAGE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NESTED_PACKAGE = EmofPackage.PACKAGE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__URI = EmofPackage.PACKAGE__URI;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_TAG = EmofPackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ENTRY = EmofPackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONFIG_PROPERTY = EmofPackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_IMPORT = EmofPackage.PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__USED_MODEL_TYPE = EmofPackage.PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_BLACKBOX = EmofPackage.PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_VARIABLE = EmofPackage.PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = EmofPackage.PACKAGE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = EmofPackage.PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.OperationalTransformationImpl <em>Operational Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.OperationalTransformationImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getOperationalTransformation()
	 * @generated
	 */
	int OPERATIONAL_TRANSFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__TAG = MODULE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_COMMENT = MODULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__IS_BLACKBOX = MODULE__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Intermediate Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__REFINED = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Intermediate Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__RELATION = MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transformation h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H = MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT = MODULE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Operational Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION_FEATURE_COUNT = MODULE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Operational Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.VarParameterImpl <em>Var Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.VarParameterImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getVarParameter()
	 * @generated
	 */
	int VAR_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__IS_ORDERED = EmofPackage.PARAMETER__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__IS_UNIQUE = EmofPackage.PARAMETER__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__LOWER = EmofPackage.PARAMETER__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__UPPER = EmofPackage.PARAMETER__UPPER;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__TAG = EmofPackage.PARAMETER__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__OWNED_COMMENT = EmofPackage.PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__NAME = EmofPackage.PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__TYPE = EmofPackage.PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__OPERATION = EmofPackage.PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__DUMMY_CONTENT = EmofPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__CTX_OWNER = EmofPackage.PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Res Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__RES_OWNER = EmofPackage.PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__KIND = EmofPackage.PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__DECLARATOR = EmofPackage.PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Var Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER_FEATURE_COUNT = EmofPackage.PARAMETER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Var Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER_OPERATION_COUNT = EmofPackage.PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MappingParameterImpl <em>Mapping Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MappingParameterImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingParameter()
	 * @generated
	 */
	int MAPPING_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__IS_ORDERED = VAR_PARAMETER__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__IS_UNIQUE = VAR_PARAMETER__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__LOWER = VAR_PARAMETER__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__UPPER = VAR_PARAMETER__UPPER;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__TAG = VAR_PARAMETER__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__OWNED_COMMENT = VAR_PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__NAME = VAR_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__TYPE = VAR_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__OPERATION = VAR_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__DUMMY_CONTENT = VAR_PARAMETER__DUMMY_CONTENT;

	/**
	 * The feature id for the '<em><b>Ctx Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__CTX_OWNER = VAR_PARAMETER__CTX_OWNER;

	/**
	 * The feature id for the '<em><b>Res Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__RES_OWNER = VAR_PARAMETER__RES_OWNER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__KIND = VAR_PARAMETER__KIND;

	/**
	 * The feature id for the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__DECLARATOR = VAR_PARAMETER__DECLARATOR;

	/**
	 * The feature id for the '<em><b>Refined Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__REFINED_DOMAIN = VAR_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__EXTENT = VAR_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER_FEATURE_COUNT = VAR_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mapping Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER_OPERATION_COUNT = VAR_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MappingOperationImpl <em>Mapping Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MappingOperationImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingOperation()
	 * @generated
	 */
	int MAPPING_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__IS_ORDERED = IMPERATIVE_OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__IS_UNIQUE = IMPERATIVE_OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__LOWER = IMPERATIVE_OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__UPPER = IMPERATIVE_OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__TAG = IMPERATIVE_OPERATION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OWNED_COMMENT = IMPERATIVE_OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__NAME = IMPERATIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__TYPE = IMPERATIVE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__CLASS = IMPERATIVE_OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OWNED_PARAMETER = IMPERATIVE_OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__RAISED_EXCEPTION = IMPERATIVE_OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OWNED_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__NESTED_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__URI = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OWNED_TAG = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__ENTRY = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__CONFIG_PROPERTY = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__MODULE_IMPORT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__USED_MODEL_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__IS_BLACKBOX = IMPERATIVE_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OWNED_VARIABLE = IMPERATIVE_OPERATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Disjunct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__DISJUNCT = IMPERATIVE_OPERATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Refined Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__REFINED_RELATION = IMPERATIVE_OPERATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__MERGED = IMPERATIVE_OPERATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__INHERITED = IMPERATIVE_OPERATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__WHEN = IMPERATIVE_OPERATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__WHERE = IMPERATIVE_OPERATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Mapping full header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__MAPPING_FULL_HEADER = IMPERATIVE_OPERATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Mapping body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__MAPPING_BODY = IMPERATIVE_OPERATION_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Mapping Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_FEATURE_COUNT = IMPERATIVE_OPERATION_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Mapping Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_OPERATION_COUNT = IMPERATIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ImperativeCallExpImpl <em>Imperative Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ImperativeCallExpImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getImperativeCallExp()
	 * @generated
	 */
	int IMPERATIVE_CALL_EXP = 11;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP__DUMMY_CONTENT = EXPRESSION_GO__DUMMY_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP__IS_VIRTUAL = EXPRESSION_GO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imperative Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP_FEATURE_COUNT = EXPRESSION_GO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Imperative Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP_OPERATION_COUNT = EXPRESSION_GO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MappingCallExpImpl <em>Mapping Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MappingCallExpImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingCallExp()
	 * @generated
	 */
	int MAPPING_CALL_EXP = 7;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP__DUMMY_CONTENT = IMPERATIVE_CALL_EXP__DUMMY_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP__IS_VIRTUAL = IMPERATIVE_CALL_EXP__IS_VIRTUAL;

	/**
	 * The feature id for the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP__IS_STRICT = IMPERATIVE_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_FEATURE_COUNT = IMPERATIVE_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mapping Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_OPERATION_COUNT = IMPERATIVE_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ConstructorImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 8;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__IS_ORDERED = IMPERATIVE_OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__IS_UNIQUE = IMPERATIVE_OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__LOWER = IMPERATIVE_OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__UPPER = IMPERATIVE_OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__TAG = IMPERATIVE_OPERATION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OWNED_COMMENT = IMPERATIVE_OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = IMPERATIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__TYPE = IMPERATIVE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CLASS = IMPERATIVE_OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OWNED_PARAMETER = IMPERATIVE_OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__RAISED_EXCEPTION = IMPERATIVE_OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OWNED_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NESTED_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__URI = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OWNED_TAG = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ENTRY = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CONFIG_PROPERTY = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__MODULE_IMPORT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__USED_MODEL_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__IS_BLACKBOX = IMPERATIVE_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OWNED_VARIABLE = IMPERATIVE_OPERATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Constructor header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CONSTRUCTOR_HEADER = IMPERATIVE_OPERATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Expression block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__EXPRESSION_BLOCK = IMPERATIVE_OPERATION_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = IMPERATIVE_OPERATION_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = IMPERATIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ContextualPropertyImpl <em>Contextual Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ContextualPropertyImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getContextualProperty()
	 * @generated
	 */
	int CONTEXTUAL_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__IS_ORDERED = IMPERATIVE_OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__IS_UNIQUE = IMPERATIVE_OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__LOWER = IMPERATIVE_OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__UPPER = IMPERATIVE_OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__TAG = IMPERATIVE_OPERATION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OWNED_COMMENT = IMPERATIVE_OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__NAME = IMPERATIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__TYPE = IMPERATIVE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__CLASS = IMPERATIVE_OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OWNED_PARAMETER = IMPERATIVE_OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__RAISED_EXCEPTION = IMPERATIVE_OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OWNED_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__NESTED_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__URI = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OWNED_TAG = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__ENTRY = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__CONFIG_PROPERTY = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__MODULE_IMPORT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__USED_MODEL_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__IS_BLACKBOX = IMPERATIVE_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OWNED_VARIABLE = IMPERATIVE_OPERATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__INIT_EXPRESSION = IMPERATIVE_OPERATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Property key</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__PROPERTY_KEY = IMPERATIVE_OPERATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__DECLARATOR = IMPERATIVE_OPERATION_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Contextual Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_FEATURE_COUNT = IMPERATIVE_OPERATION_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Contextual Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_OPERATION_COUNT = IMPERATIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.EntryOperationImpl <em>Entry Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.EntryOperationImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getEntryOperation()
	 * @generated
	 */
	int ENTRY_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__IS_ORDERED = IMPERATIVE_OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__IS_UNIQUE = IMPERATIVE_OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__LOWER = IMPERATIVE_OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__UPPER = IMPERATIVE_OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__TAG = IMPERATIVE_OPERATION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OWNED_COMMENT = IMPERATIVE_OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__NAME = IMPERATIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__TYPE = IMPERATIVE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__CLASS = IMPERATIVE_OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OWNED_PARAMETER = IMPERATIVE_OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__RAISED_EXCEPTION = IMPERATIVE_OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OWNED_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__NESTED_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__URI = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OWNED_TAG = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__ENTRY = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__CONFIG_PROPERTY = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__MODULE_IMPORT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__USED_MODEL_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__IS_BLACKBOX = IMPERATIVE_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OWNED_VARIABLE = IMPERATIVE_OPERATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Entry header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__ENTRY_HEADER = IMPERATIVE_OPERATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Expression block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__EXPRESSION_BLOCK = IMPERATIVE_OPERATION_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Entry Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_FEATURE_COUNT = IMPERATIVE_OPERATION_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Entry Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_OPERATION_COUNT = IMPERATIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.LibraryImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 13;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TAG = MODULE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_COMMENT = MODULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__IS_BLACKBOX = MODULE__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Library h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LIBRARY_H = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MODULE_ELEMENT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ModelParameterImpl <em>Model Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ModelParameterImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModelParameter()
	 * @generated
	 */
	int MODEL_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__IS_ORDERED = VAR_PARAMETER__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__IS_UNIQUE = VAR_PARAMETER__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__LOWER = VAR_PARAMETER__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__UPPER = VAR_PARAMETER__UPPER;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__TAG = VAR_PARAMETER__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__OWNED_COMMENT = VAR_PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__NAME = VAR_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__TYPE = VAR_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__OPERATION = VAR_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__DUMMY_CONTENT = VAR_PARAMETER__DUMMY_CONTENT;

	/**
	 * The feature id for the '<em><b>Ctx Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__CTX_OWNER = VAR_PARAMETER__CTX_OWNER;

	/**
	 * The feature id for the '<em><b>Res Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__RES_OWNER = VAR_PARAMETER__RES_OWNER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__KIND = VAR_PARAMETER__KIND;

	/**
	 * The feature id for the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__DECLARATOR = VAR_PARAMETER__DECLARATOR;

	/**
	 * The number of structural features of the '<em>Model Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER_FEATURE_COUNT = VAR_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER_OPERATION_COUNT = VAR_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ModelTypeImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__TAG = EmofPackage.URI_EXTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_COMMENT = EmofPackage.URI_EXTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NAME = EmofPackage.URI_EXTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_TYPE = EmofPackage.URI_EXTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NESTED_PACKAGE = EmofPackage.URI_EXTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__URI = EmofPackage.URI_EXTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_TAG = EmofPackage.URI_EXTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ENTRY = EmofPackage.URI_EXTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CONFIG_PROPERTY = EmofPackage.URI_EXTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__MODULE_IMPORT = EmofPackage.URI_EXTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__USED_MODEL_TYPE = EmofPackage.URI_EXTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__IS_BLACKBOX = EmofPackage.URI_EXTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_VARIABLE = EmofPackage.URI_EXTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__PACKAGE = EmofPackage.URI_EXTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_ATTRIBUTE = EmofPackage.URI_EXTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_OPERATION = EmofPackage.URI_EXTENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__SUPER_CLASS = EmofPackage.URI_EXTENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__IS_ABSTRACT = EmofPackage.URI_EXTENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__METAMODEL = EmofPackage.URI_EXTENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Additional Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ADDITIONAL_CONDITION = EmofPackage.URI_EXTENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Conformance Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CONFORMANCE_KIND = EmofPackage.URI_EXTENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Compliance kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__COMPLIANCE_KIND = EmofPackage.URI_EXTENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Packageref list</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__PACKAGEREF_LIST = EmofPackage.URI_EXTENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Modeltype where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__MODELTYPE_WHERE = EmofPackage.URI_EXTENT_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = EmofPackage.URI_EXTENT_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_OPERATION_COUNT = EmofPackage.URI_EXTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ModuleImportImpl <em>Module Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ModuleImportImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModuleImport()
	 * @generated
	 */
	int MODULE_IMPORT = 17;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__TAG = EmofPackage.ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__BINDING = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__MODULE = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__IMPORTED_MODULE = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__KIND = EmofPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__UNIT = EmofPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__IDENTIFIER = EmofPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Module Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Module Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT_OPERATION_COUNT = EmofPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ConstructorBodyImpl <em>Constructor Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ConstructorBodyImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getConstructorBody()
	 * @generated
	 */
	int CONSTRUCTOR_BODY = 20;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__TAG = OPERATION_BODY__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__OWNED_COMMENT = OPERATION_BODY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__OPERATION = OPERATION_BODY__OPERATION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__CONTENT = OPERATION_BODY__CONTENT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__VARIABLE = OPERATION_BODY__VARIABLE;

	/**
	 * The number of structural features of the '<em>Constructor Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY_FEATURE_COUNT = OPERATION_BODY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructor Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY_OPERATION_COUNT = OPERATION_BODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ObjectExpImpl <em>Object Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ObjectExpImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getObjectExp()
	 * @generated
	 */
	int OBJECT_EXP = 21;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__DUMMY_CONTENT = EXPRESSION_GO__DUMMY_CONTENT;

	/**
	 * The feature id for the '<em><b>Referred Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__REFERRED_OBJECT = EXPRESSION_GO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__BODY = EXPRESSION_GO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_FEATURE_COUNT = EXPRESSION_GO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_OPERATION_COUNT = EXPRESSION_GO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.TopLevelGOImpl <em>Top Level GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.TopLevelGOImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTopLevelGO()
	 * @generated
	 */
	int TOP_LEVEL_GO = 22;

	/**
	 * The feature id for the '<em><b>Unit element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_GO__UNIT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Moduleimport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_GO__MODULEIMPORT = 1;

	/**
	 * The number of structural features of the '<em>Top Level GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_GO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Top Level GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_GO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.UnitRefGOImpl <em>Unit Ref GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.UnitRefGOImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getUnitRefGO()
	 * @generated
	 */
	int UNIT_REF_GO = 23;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_GO__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Unit Ref GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_GO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unit Ref GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_GO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.TagGOImpl <em>Tag GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.TagGOImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTagGO()
	 * @generated
	 */
	int TAG_GO = 24;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__TAG = MODULE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__OWNED_COMMENT = MODULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__IS_BLACKBOX = MODULE__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__IS_ORDERED = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__IS_UNIQUE = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__LOWER = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__UPPER = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__TYPE = MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__CLASS = MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__OWNED_PARAMETER = MODULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__RAISED_EXCEPTION = MODULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__CONTEXT = MODULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__RESULT = MODULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__OVERRIDDEN = MODULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__BODY = MODULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tagid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__TAGID = MODULE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__SCOPED_IDENTIFIER = MODULE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tagvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__TAGVALUE = MODULE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Tag GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO_FEATURE_COUNT = MODULE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Tag GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MetaModelGOImpl <em>Meta Model GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MetaModelGOImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMetaModelGO()
	 * @generated
	 */
	int META_MODEL_GO = 25;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__TAG = MODULE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__OWNED_COMMENT = MODULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__IS_BLACKBOX = MODULE__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Metamodel h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__METAMODEL_H = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__METAMODEL_ELEMENT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meta Model GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Meta Model GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.AccessDeclImpl <em>Access Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.AccessDeclImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getAccessDecl()
	 * @generated
	 */
	int ACCESS_DECL = 26;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__TAG = MODULE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__OWNED_COMMENT = MODULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__IS_BLACKBOX = MODULE__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__IS_ORDERED = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__IS_UNIQUE = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__LOWER = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__UPPER = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__TYPE = MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__CLASS = MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__OWNED_PARAMETER = MODULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__RAISED_EXCEPTION = MODULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__CONTEXT = MODULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__RESULT = MODULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__OVERRIDDEN = MODULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__BODY = MODULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Access usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__ACCESS_USAGE = MODULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Access Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL_FEATURE_COUNT = MODULE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Access Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.TypeDefImpl <em>Type Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.TypeDefImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTypeDef()
	 * @generated
	 */
	int TYPE_DEF = 27;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__TAG = MODULE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__OWNED_COMMENT = MODULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__IS_BLACKBOX = MODULE__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__IS_ORDERED = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__IS_UNIQUE = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__LOWER = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__UPPER = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__TYPE = MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__CLASS = MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__OWNED_PARAMETER = MODULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__RAISED_EXCEPTION = MODULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__CONTEXT = MODULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__RESULT = MODULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__OVERRIDDEN = MODULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__BODY = MODULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Typespec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__TYPESPEC = MODULE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Typedef condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__TYPEDEF_CONDITION = MODULE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_FEATURE_COUNT = MODULE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.TransformationHeaderImpl <em>Transformation Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.TransformationHeaderImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTransformationHeader()
	 * @generated
	 */
	int TRANSFORMATION_HEADER = 28;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_HEADER__QUALIFIER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_HEADER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Transformation signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE = 2;

	/**
	 * The feature id for the '<em><b>Transformation usage refine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE = 3;

	/**
	 * The number of structural features of the '<em>Transformation Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_HEADER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transformation Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.SimpleSignatureImpl <em>Simple Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.SimpleSignatureImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getSimpleSignature()
	 * @generated
	 */
	int SIMPLE_SIGNATURE = 29;

	/**
	 * The feature id for the '<em><b>Param list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIGNATURE__PARAM_LIST = 0;

	/**
	 * The number of structural features of the '<em>Simple Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIGNATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Simple Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.TransformationUsageRefineImpl <em>Transformation Usage Refine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.TransformationUsageRefineImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTransformationUsageRefine()
	 * @generated
	 */
	int TRANSFORMATION_USAGE_REFINE = 30;

	/**
	 * The feature id for the '<em><b>Module usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USAGE_REFINE__MODULE_USAGE = 0;

	/**
	 * The feature id for the '<em><b>Transformation refine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE = 1;

	/**
	 * The number of structural features of the '<em>Transformation Usage Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USAGE_REFINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transformation Usage Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USAGE_REFINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ModuleRefGOImpl <em>Module Ref GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ModuleRefGOImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModuleRefGO()
	 * @generated
	 */
	int MODULE_REF_GO = 31;

	/**
	 * The feature id for the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_GO__SCOPED_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Simple signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_GO__SIMPLE_SIGNATURE = 1;

	/**
	 * The number of structural features of the '<em>Module Ref GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_GO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module Ref GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_GO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ModuleUsageGOImpl <em>Module Usage GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ModuleUsageGOImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModuleUsageGO()
	 * @generated
	 */
	int MODULE_USAGE_GO = 32;

	/**
	 * The feature id for the '<em><b>Access usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_USAGE_GO__ACCESS_USAGE = 0;

	/**
	 * The feature id for the '<em><b>Extends usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_USAGE_GO__EXTENDS_USAGE = 1;

	/**
	 * The number of structural features of the '<em>Module Usage GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_USAGE_GO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module Usage GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_USAGE_GO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.LibraryHeaderImpl <em>Library Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.LibraryHeaderImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getLibraryHeader()
	 * @generated
	 */
	int LIBRARY_HEADER = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HEADER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Library signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HEADER__LIBRARY_SIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Module usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HEADER__MODULE_USAGE = 2;

	/**
	 * The number of structural features of the '<em>Library Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Library Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.AccessUsageImpl <em>Access Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.AccessUsageImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getAccessUsage()
	 * @generated
	 */
	int ACCESS_USAGE = 34;

	/**
	 * The feature id for the '<em><b>Module kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_USAGE__MODULE_KIND = 0;

	/**
	 * The feature id for the '<em><b>Moduleref list</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_USAGE__MODULEREF_LIST = 1;

	/**
	 * The number of structural features of the '<em>Access Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_USAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Access Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ExtendsUsageImpl <em>Extends Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ExtendsUsageImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getExtendsUsage()
	 * @generated
	 */
	int EXTENDS_USAGE = 35;

	/**
	 * The feature id for the '<em><b>Module kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_USAGE__MODULE_KIND = 0;

	/**
	 * The feature id for the '<em><b>Moduleref list</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_USAGE__MODULEREF_LIST = 1;

	/**
	 * The number of structural features of the '<em>Extends Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_USAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extends Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ScopedIdentifierImpl <em>Scoped Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ScopedIdentifierImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getScopedIdentifier()
	 * @generated
	 */
	int SCOPED_IDENTIFIER = 36;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_IDENTIFIER__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Scoped Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_IDENTIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scoped Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ParamListImpl <em>Param List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ParamListImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getParamList()
	 * @generated
	 */
	int PARAM_LIST = 37;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_LIST__PARAM = 0;

	/**
	 * The number of structural features of the '<em>Param List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Param List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ClassifierGOImpl <em>Classifier GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ClassifierGOImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierGO()
	 * @generated
	 */
	int CLASSIFIER_GO = 38;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__IS_ORDERED = IMPERATIVE_OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__IS_UNIQUE = IMPERATIVE_OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__LOWER = IMPERATIVE_OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__UPPER = IMPERATIVE_OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__TAG = IMPERATIVE_OPERATION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OWNED_COMMENT = IMPERATIVE_OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__NAME = IMPERATIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__TYPE = IMPERATIVE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__CLASS = IMPERATIVE_OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OWNED_PARAMETER = IMPERATIVE_OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__RAISED_EXCEPTION = IMPERATIVE_OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OWNED_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__NESTED_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__URI = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OWNED_TAG = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__ENTRY = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__CONFIG_PROPERTY = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__MODULE_IMPORT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__USED_MODEL_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__IS_BLACKBOX = IMPERATIVE_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OWNED_VARIABLE = IMPERATIVE_OPERATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Classifier h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__CLASSIFIER_H = IMPERATIVE_OPERATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Classifier feature list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST = IMPERATIVE_OPERATION_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Classifier GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO_FEATURE_COUNT = IMPERATIVE_OPERATION_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Classifier GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO_OPERATION_COUNT = IMPERATIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.DeclaratorImpl <em>Declarator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.DeclaratorImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getDeclarator()
	 * @generated
	 */
	int DECLARATOR = 39;

	/**
	 * The feature id for the '<em><b>Typespec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR__TYPESPEC = 0;

	/**
	 * The feature id for the '<em><b>Init part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR__INIT_PART = 1;

	/**
	 * The feature id for the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR__SCOPED_IDENTIFIER = 2;

	/**
	 * The number of structural features of the '<em>Declarator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Declarator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.TypeSpecImpl <em>Type Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.TypeSpecImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTypeSpec()
	 * @generated
	 */
	int TYPE_SPEC = 40;

	/**
	 * The feature id for the '<em><b>Type reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__TYPE_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Extent location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__EXTENT_LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Type Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.TypeReferenceImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 41;

	/**
	 * The feature id for the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__SCOPED_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Complex type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__COMPLEX_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ComplexTypeImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Complex type key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__COMPLEX_TYPE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Collection key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__COLLECTION_KEY = 1;

	/**
	 * The feature id for the '<em><b>Typespec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__TYPESPEC = 2;

	/**
	 * The feature id for the '<em><b>Declarator list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__DECLARATOR_LIST = 3;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.DeclaratorListImpl <em>Declarator List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.DeclaratorListImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getDeclaratorList()
	 * @generated
	 */
	int DECLARATOR_LIST = 43;

	/**
	 * The feature id for the '<em><b>Declarator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR_LIST__DECLARATOR = 0;

	/**
	 * The number of structural features of the '<em>Declarator List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Declarator List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.InitPartImpl <em>Init Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.InitPartImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getInitPart()
	 * @generated
	 */
	int INIT_PART = 44;

	/**
	 * The feature id for the '<em><b>Init op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PART__INIT_OP = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PART__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Init Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Init Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ExpressionSemiListImpl <em>Expression Semi List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ExpressionSemiListImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getExpressionSemiList()
	 * @generated
	 */
	int EXPRESSION_SEMI_LIST = 45;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SEMI_LIST__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression Semi List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SEMI_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression Semi List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SEMI_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ExpressionListImpl <em>Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ExpressionListImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getExpressionList()
	 * @generated
	 */
	int EXPRESSION_LIST = 46;

	/**
	 * The feature id for the '<em><b>Expression semi list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__EXPRESSION_SEMI_LIST = 0;

	/**
	 * The number of structural features of the '<em>Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ExpressionBlockImpl <em>Expression Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ExpressionBlockImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getExpressionBlock()
	 * @generated
	 */
	int EXPRESSION_BLOCK = 47;

	/**
	 * The feature id for the '<em><b>Expression list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK__EXPRESSION_LIST = 0;

	/**
	 * The number of structural features of the '<em>Expression Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.PackageRefGOImpl <em>Package Ref GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.PackageRefGOImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getPackageRefGO()
	 * @generated
	 */
	int PACKAGE_REF_GO = 48;

	/**
	 * The feature id for the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REF_GO__SCOPED_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REF_GO__URI = 1;

	/**
	 * The number of structural features of the '<em>Package Ref GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REF_GO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Package Ref GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REF_GO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MetaModelHeaderImpl <em>Meta Model Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MetaModelHeaderImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMetaModelHeader()
	 * @generated
	 */
	int META_MODEL_HEADER = 49;

	/**
	 * The feature id for the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_HEADER__SCOPED_IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Meta Model Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_HEADER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Meta Model Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MetaModelElementImpl <em>Meta Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MetaModelElementImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMetaModelElement()
	 * @generated
	 */
	int META_MODEL_ELEMENT = 50;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__ENUMERATION = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__TAG = 2;

	/**
	 * The number of structural features of the '<em>Meta Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Meta Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.EnumerationGOImpl <em>Enumeration GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.EnumerationGOImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getEnumerationGO()
	 * @generated
	 */
	int ENUMERATION_GO = 51;

	/**
	 * The feature id for the '<em><b>Enumeration h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_GO__ENUMERATION_H = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_GO__IDENTIFIER = 1;

	/**
	 * The number of structural features of the '<em>Enumeration GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_GO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enumeration GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_GO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ClassifierHeaderImpl <em>Classifier Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ClassifierHeaderImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierHeader()
	 * @generated
	 */
	int CLASSIFIER_HEADER = 52;

	/**
	 * The feature id for the '<em><b>Classifier info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_HEADER__CLASSIFIER_INFO = 0;

	/**
	 * The feature id for the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_HEADER__SCOPED_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Classifier extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_HEADER__CLASSIFIER_EXTENSION = 2;

	/**
	 * The number of structural features of the '<em>Classifier Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Classifier Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ClassifierFeatureListImpl <em>Classifier Feature List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ClassifierFeatureListImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierFeatureList()
	 * @generated
	 */
	int CLASSIFIER_FEATURE_LIST = 53;

	/**
	 * The feature id for the '<em><b>Classifier feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_LIST__CLASSIFIER_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Classifier Feature List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Classifier Feature List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ClassifierInfoImpl <em>Classifier Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ClassifierInfoImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierInfo()
	 * @generated
	 */
	int CLASSIFIER_INFO = 54;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_INFO__QUALIFIER = 0;

	/**
	 * The number of structural features of the '<em>Classifier Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_INFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Classifier Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ClassifierExtensionImpl <em>Classifier Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ClassifierExtensionImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierExtension()
	 * @generated
	 */
	int CLASSIFIER_EXTENSION = 55;

	/**
	 * The feature id for the '<em><b>Scoped identifier list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST = 0;

	/**
	 * The number of structural features of the '<em>Classifier Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_EXTENSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Classifier Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ScopedIdentifierListImpl <em>Scoped Identifier List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ScopedIdentifierListImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getScopedIdentifierList()
	 * @generated
	 */
	int SCOPED_IDENTIFIER_LIST = 56;

	/**
	 * The feature id for the '<em><b>Scoped identifier list</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_IDENTIFIER_LIST__SCOPED_IDENTIFIER_LIST = 0;

	/**
	 * The number of structural features of the '<em>Scoped Identifier List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_IDENTIFIER_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scoped Identifier List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_IDENTIFIER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ClassifierFeatureImpl <em>Classifier Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ClassifierFeatureImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierFeature()
	 * @generated
	 */
	int CLASSIFIER_FEATURE = 57;

	/**
	 * The feature id for the '<em><b>Feature qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE__FEATURE_QUALIFIER = 0;

	/**
	 * The feature id for the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE__DECLARATOR = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE__MULTIPLICITY = 2;

	/**
	 * The feature id for the '<em><b>Opposite property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE__OPPOSITE_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Complete signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE__COMPLETE_SIGNATURE = 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE__TAG = 5;

	/**
	 * The number of structural features of the '<em>Classifier Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Classifier Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MultiplicityImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 58;

	/**
	 * The feature id for the '<em><b>Multiplicity range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__MULTIPLICITY_RANGE = 0;

	/**
	 * The number of structural features of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.OppositePropertyImpl <em>Opposite Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.OppositePropertyImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getOppositeProperty()
	 * @generated
	 */
	int OPPOSITE_PROPERTY = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY__MULTIPLICITY = 1;

	/**
	 * The number of structural features of the '<em>Opposite Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Opposite Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.StereotypeQualifierImpl <em>Stereotype Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.StereotypeQualifierImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getStereotypeQualifier()
	 * @generated
	 */
	int STEREOTYPE_QUALIFIER = 60;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_QUALIFIER__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Stereotype Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_QUALIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stereotype Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_QUALIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.FeatureQualifierImpl <em>Feature Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.FeatureQualifierImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getFeatureQualifier()
	 * @generated
	 */
	int FEATURE_QUALIFIER = 61;

	/**
	 * The feature id for the '<em><b>Stereotype qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER = 0;

	/**
	 * The feature id for the '<em><b>Feature key</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_QUALIFIER__FEATURE_KEY = 1;

	/**
	 * The number of structural features of the '<em>Feature Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_QUALIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feature Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_QUALIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.CompleteSignatureImpl <em>Complete Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.CompleteSignatureImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getCompleteSignature()
	 * @generated
	 */
	int COMPLETE_SIGNATURE = 62;

	/**
	 * The feature id for the '<em><b>Simple signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_SIGNATURE__SIMPLE_SIGNATURE = 0;

	/**
	 * The feature id for the '<em><b>Param list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_SIGNATURE__PARAM_LIST = 1;

	/**
	 * The number of structural features of the '<em>Complete Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_SIGNATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Complete Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.EnumerationHeaderImpl <em>Enumeration Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.EnumerationHeaderImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getEnumerationHeader()
	 * @generated
	 */
	int ENUMERATION_HEADER = 63;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_HEADER__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Enumeration Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_HEADER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enumeration Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.HelperInfoImpl <em>Helper Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.HelperInfoImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getHelperInfo()
	 * @generated
	 */
	int HELPER_INFO = 64;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_INFO__QUALIFIER = 0;

	/**
	 * The feature id for the '<em><b>Helper kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_INFO__HELPER_KIND = 1;

	/**
	 * The number of structural features of the '<em>Helper Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Helper Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.HelperHeaderImpl <em>Helper Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.HelperHeaderImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getHelperHeader()
	 * @generated
	 */
	int HELPER_HEADER = 65;

	/**
	 * The feature id for the '<em><b>Helper info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_HEADER__HELPER_INFO = 0;

	/**
	 * The feature id for the '<em><b>Scope identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_HEADER__SCOPE_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Complete signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_HEADER__COMPLETE_SIGNATURE = 2;

	/**
	 * The number of structural features of the '<em>Helper Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Helper Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.ConstructorHeaderImpl <em>Constructor Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.ConstructorHeaderImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getConstructorHeader()
	 * @generated
	 */
	int CONSTRUCTOR_HEADER = 66;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_HEADER__QUALIFIER = 0;

	/**
	 * The feature id for the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Simple signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE = 2;

	/**
	 * The number of structural features of the '<em>Constructor Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constructor Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.EntryHeaderImpl <em>Entry Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.EntryHeaderImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getEntryHeader()
	 * @generated
	 */
	int ENTRY_HEADER = 67;

	/**
	 * The feature id for the '<em><b>Simple signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_HEADER__SIMPLE_SIGNATURE = 0;

	/**
	 * The number of structural features of the '<em>Entry Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_HEADER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entry Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MappingHeaderImpl <em>Mapping Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MappingHeaderImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingHeader()
	 * @generated
	 */
	int MAPPING_HEADER = 68;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_HEADER__QUALIFIER = 0;

	/**
	 * The feature id for the '<em><b>Param direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_HEADER__PARAM_DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_HEADER__SCOPED_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Complete signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_HEADER__COMPLETE_SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Mapping extra</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_HEADER__MAPPING_EXTRA = 4;

	/**
	 * The number of structural features of the '<em>Mapping Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_HEADER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mapping Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MappingFullHeaderImpl <em>Mapping Full Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MappingFullHeaderImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingFullHeader()
	 * @generated
	 */
	int MAPPING_FULL_HEADER = 69;

	/**
	 * The feature id for the '<em><b>Mapping header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FULL_HEADER__MAPPING_HEADER = 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FULL_HEADER__WHEN = 1;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FULL_HEADER__WHERE = 2;

	/**
	 * The number of structural features of the '<em>Mapping Full Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FULL_HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mapping Full Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FULL_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MappingExtraImpl <em>Mapping Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MappingExtraImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingExtra()
	 * @generated
	 */
	int MAPPING_EXTRA = 70;

	/**
	 * The feature id for the '<em><b>Mapping extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_EXTRA__MAPPING_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Mapping refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_EXTRA__MAPPING_REFINEMENT = 1;

	/**
	 * The number of structural features of the '<em>Mapping Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_EXTRA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_EXTRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MappingExtensionImpl <em>Mapping Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MappingExtensionImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingExtension()
	 * @generated
	 */
	int MAPPING_EXTENSION = 71;

	/**
	 * The feature id for the '<em><b>Mapping extension key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_EXTENSION__MAPPING_EXTENSION_KEY = 0;

	/**
	 * The feature id for the '<em><b>Scoped identifier list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST = 1;

	/**
	 * The number of structural features of the '<em>Mapping Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_EXTENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.MappingRefinementImpl <em>Mapping Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.MappingRefinementImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingRefinement()
	 * @generated
	 */
	int MAPPING_REFINEMENT = 72;

	/**
	 * The feature id for the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_REFINEMENT__SCOPED_IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Mapping Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_REFINEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mapping Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_REFINEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.impl.PopulationSectionImpl <em>Population Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.impl.PopulationSectionImpl
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getPopulationSection()
	 * @generated
	 */
	int POPULATION_SECTION = 73;

	/**
	 * The feature id for the '<em><b>Expression list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_SECTION__EXPRESSION_LIST = 0;

	/**
	 * The feature id for the '<em><b>Expression block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_SECTION__EXPRESSION_BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Population Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_SECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Population Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qvtoperational.DirectionKind <em>Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.DirectionKind
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getDirectionKind()
	 * @generated
	 */
	int DIRECTION_KIND = 75;

	/**
	 * The meta object id for the '{@link qvtoperational.ImportKind <em>Import Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.ImportKind
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getImportKind()
	 * @generated
	 */
	int IMPORT_KIND = 76;

	/**
	 * The meta object id for the '{@link qvtoperational.GeneralQualifier <em>General Qualifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.GeneralQualifier
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getGeneralQualifier()
	 * @generated
	 */
	int GENERAL_QUALIFIER = 77;

	/**
	 * The meta object id for the '{@link qvtoperational.ModuleKind <em>Module Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.ModuleKind
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModuleKind()
	 * @generated
	 */
	int MODULE_KIND = 78;

	/**
	 * The meta object id for the '{@link qvtoperational.ComplexTypeKey <em>Complex Type Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.ComplexTypeKey
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getComplexTypeKey()
	 * @generated
	 */
	int COMPLEX_TYPE_KEY = 79;

	/**
	 * The meta object id for the '{@link qvtoperational.FeatureKey <em>Feature Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.FeatureKey
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getFeatureKey()
	 * @generated
	 */
	int FEATURE_KEY = 80;

	/**
	 * The meta object id for the '{@link qvtoperational.PropertyKey <em>Property Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.PropertyKey
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getPropertyKey()
	 * @generated
	 */
	int PROPERTY_KEY = 81;

	/**
	 * The meta object id for the '{@link qvtoperational.HelperKind <em>Helper Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.HelperKind
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getHelperKind()
	 * @generated
	 */
	int HELPER_KIND = 82;

	/**
	 * The meta object id for the '{@link qvtoperational.MappingExtensionKey <em>Mapping Extension Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.MappingExtensionKey
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingExtensionKey()
	 * @generated
	 */
	int MAPPING_EXTENSION_KEY = 83;

	/**
	 * The meta object id for the '{@link qvtoperational.CollectionKey <em>Collection Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvtoperational.CollectionKey
	 * @see qvtoperational.impl.QvtoperationalPackageImpl#getCollectionKey()
	 * @generated
	 */
	int COLLECTION_KEY = 84;


	/**
	 * Returns the meta object for class '{@link qvtoperational.MappingBody <em>Mapping Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Body</em>'.
	 * @see qvtoperational.MappingBody
	 * @generated
	 */
	EClass getMappingBody();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.MappingBody#getInitSection <em>Init Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Section</em>'.
	 * @see qvtoperational.MappingBody#getInitSection()
	 * @see #getMappingBody()
	 * @generated
	 */
	EReference getMappingBody_InitSection();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.MappingBody#getEndSection <em>End Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Section</em>'.
	 * @see qvtoperational.MappingBody#getEndSection()
	 * @see #getMappingBody()
	 * @generated
	 */
	EReference getMappingBody_EndSection();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingBody#getPopulation_section <em>Population section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Population section</em>'.
	 * @see qvtoperational.MappingBody#getPopulation_section()
	 * @see #getMappingBody()
	 * @generated
	 */
	EReference getMappingBody_Population_section();

	/**
	 * Returns the meta object for class '{@link qvtoperational.Helper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper</em>'.
	 * @see qvtoperational.Helper
	 * @generated
	 */
	EClass getHelper();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.Helper#getIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see qvtoperational.Helper#getIsQuery()
	 * @see #getHelper()
	 * @generated
	 */
	EAttribute getHelper_IsQuery();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.Helper#getHelper_header <em>Helper header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Helper header</em>'.
	 * @see qvtoperational.Helper#getHelper_header()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_Helper_header();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.Helper#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see qvtoperational.Helper#getExpression()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.Helper#getExpression_block <em>Expression block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression block</em>'.
	 * @see qvtoperational.Helper#getExpression_block()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_Expression_block();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ResolveExp <em>Resolve Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Exp</em>'.
	 * @see qvtoperational.ResolveExp
	 * @generated
	 */
	EClass getResolveExp();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.ResolveExp#getOne <em>One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One</em>'.
	 * @see qvtoperational.ResolveExp#getOne()
	 * @see #getResolveExp()
	 * @generated
	 */
	EAttribute getResolveExp_One();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.ResolveExp#getIsInverse <em>Is Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inverse</em>'.
	 * @see qvtoperational.ResolveExp#getIsInverse()
	 * @see #getResolveExp()
	 * @generated
	 */
	EAttribute getResolveExp_IsInverse();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.ResolveExp#getIsDeferred <em>Is Deferred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deferred</em>'.
	 * @see qvtoperational.ResolveExp#getIsDeferred()
	 * @see #getResolveExp()
	 * @generated
	 */
	EAttribute getResolveExp_IsDeferred();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ResolveExp#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see qvtoperational.ResolveExp#getTarget()
	 * @see #getResolveExp()
	 * @generated
	 */
	EReference getResolveExp_Target();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ResolveExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see qvtoperational.ResolveExp#getCondition()
	 * @see #getResolveExp()
	 * @generated
	 */
	EReference getResolveExp_Condition();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ResolveInExp <em>Resolve In Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve In Exp</em>'.
	 * @see qvtoperational.ResolveInExp
	 * @generated
	 */
	EClass getResolveInExp();

	/**
	 * Returns the meta object for the reference '{@link qvtoperational.ResolveInExp#getInMapping <em>In Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Mapping</em>'.
	 * @see qvtoperational.ResolveInExp#getInMapping()
	 * @see #getResolveInExp()
	 * @generated
	 */
	EReference getResolveInExp_InMapping();

	/**
	 * Returns the meta object for class '{@link qvtoperational.OperationalTransformation <em>Operational Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Transformation</em>'.
	 * @see qvtoperational.OperationalTransformation
	 * @generated
	 */
	EClass getOperationalTransformation();

	/**
	 * Returns the meta object for the reference list '{@link qvtoperational.OperationalTransformation#getIntermediateClass <em>Intermediate Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intermediate Class</em>'.
	 * @see qvtoperational.OperationalTransformation#getIntermediateClass()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_IntermediateClass();

	/**
	 * Returns the meta object for the reference '{@link qvtoperational.OperationalTransformation#getRefined <em>Refined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined</em>'.
	 * @see qvtoperational.OperationalTransformation#getRefined()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_Refined();

	/**
	 * Returns the meta object for the reference list '{@link qvtoperational.OperationalTransformation#getIntermediateProperty <em>Intermediate Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intermediate Property</em>'.
	 * @see qvtoperational.OperationalTransformation#getIntermediateProperty()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_IntermediateProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.OperationalTransformation#getModelParameter <em>Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Parameter</em>'.
	 * @see qvtoperational.OperationalTransformation#getModelParameter()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_ModelParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.OperationalTransformation#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see qvtoperational.OperationalTransformation#getRelation()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_Relation();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.OperationalTransformation#getTransformation_h <em>Transformation h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation h</em>'.
	 * @see qvtoperational.OperationalTransformation#getTransformation_h()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_Transformation_h();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.OperationalTransformation#getModule_element <em>Module element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module element</em>'.
	 * @see qvtoperational.OperationalTransformation#getModule_element()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_Module_element();

	/**
	 * Returns the meta object for class '{@link qvtoperational.MappingParameter <em>Mapping Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Parameter</em>'.
	 * @see qvtoperational.MappingParameter
	 * @generated
	 */
	EClass getMappingParameter();

	/**
	 * Returns the meta object for the reference '{@link qvtoperational.MappingParameter#getRefinedDomain <em>Refined Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Domain</em>'.
	 * @see qvtoperational.MappingParameter#getRefinedDomain()
	 * @see #getMappingParameter()
	 * @generated
	 */
	EReference getMappingParameter_RefinedDomain();

	/**
	 * Returns the meta object for the reference '{@link qvtoperational.MappingParameter#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extent</em>'.
	 * @see qvtoperational.MappingParameter#getExtent()
	 * @see #getMappingParameter()
	 * @generated
	 */
	EReference getMappingParameter_Extent();

	/**
	 * Returns the meta object for class '{@link qvtoperational.MappingOperation <em>Mapping Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Operation</em>'.
	 * @see qvtoperational.MappingOperation
	 * @generated
	 */
	EClass getMappingOperation();

	/**
	 * Returns the meta object for the reference list '{@link qvtoperational.MappingOperation#getDisjunct <em>Disjunct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disjunct</em>'.
	 * @see qvtoperational.MappingOperation#getDisjunct()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Disjunct();

	/**
	 * Returns the meta object for the reference '{@link qvtoperational.MappingOperation#getRefinedRelation <em>Refined Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Relation</em>'.
	 * @see qvtoperational.MappingOperation#getRefinedRelation()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_RefinedRelation();

	/**
	 * Returns the meta object for the reference list '{@link qvtoperational.MappingOperation#getMerged <em>Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Merged</em>'.
	 * @see qvtoperational.MappingOperation#getMerged()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Merged();

	/**
	 * Returns the meta object for the reference list '{@link qvtoperational.MappingOperation#getInherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited</em>'.
	 * @see qvtoperational.MappingOperation#getInherited()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Inherited();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.MappingOperation#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see qvtoperational.MappingOperation#getWhen()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_When();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.MappingOperation#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Where</em>'.
	 * @see qvtoperational.MappingOperation#getWhere()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Where();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingOperation#getMapping_full_header <em>Mapping full header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping full header</em>'.
	 * @see qvtoperational.MappingOperation#getMapping_full_header()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Mapping_full_header();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingOperation#getMapping_body <em>Mapping body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping body</em>'.
	 * @see qvtoperational.MappingOperation#getMapping_body()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Mapping_body();

	/**
	 * Returns the meta object for class '{@link qvtoperational.MappingCallExp <em>Mapping Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Call Exp</em>'.
	 * @see qvtoperational.MappingCallExp
	 * @generated
	 */
	EClass getMappingCallExp();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.MappingCallExp#getIsStrict <em>Is Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strict</em>'.
	 * @see qvtoperational.MappingCallExp#getIsStrict()
	 * @see #getMappingCallExp()
	 * @generated
	 */
	EAttribute getMappingCallExp_IsStrict();

	/**
	 * Returns the meta object for class '{@link qvtoperational.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see qvtoperational.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.Constructor#getConstructor_header <em>Constructor header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constructor header</em>'.
	 * @see qvtoperational.Constructor#getConstructor_header()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Constructor_header();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.Constructor#getExpression_block <em>Expression block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression block</em>'.
	 * @see qvtoperational.Constructor#getExpression_block()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Expression_block();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ContextualProperty <em>Contextual Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Property</em>'.
	 * @see qvtoperational.ContextualProperty
	 * @generated
	 */
	EClass getContextualProperty();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ContextualProperty#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see qvtoperational.ContextualProperty#getInitExpression()
	 * @see #getContextualProperty()
	 * @generated
	 */
	EReference getContextualProperty_InitExpression();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.ContextualProperty#getProperty_key <em>Property key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property key</em>'.
	 * @see qvtoperational.ContextualProperty#getProperty_key()
	 * @see #getContextualProperty()
	 * @generated
	 */
	EAttribute getContextualProperty_Property_key();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ContextualProperty#getDeclarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declarator</em>'.
	 * @see qvtoperational.ContextualProperty#getDeclarator()
	 * @see #getContextualProperty()
	 * @generated
	 */
	EReference getContextualProperty_Declarator();

	/**
	 * Returns the meta object for class '{@link qvtoperational.EntryOperation <em>Entry Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Operation</em>'.
	 * @see qvtoperational.EntryOperation
	 * @generated
	 */
	EClass getEntryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.EntryOperation#getEntry_header <em>Entry header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry header</em>'.
	 * @see qvtoperational.EntryOperation#getEntry_header()
	 * @see #getEntryOperation()
	 * @generated
	 */
	EReference getEntryOperation_Entry_header();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.EntryOperation#getExpression_block <em>Expression block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression block</em>'.
	 * @see qvtoperational.EntryOperation#getExpression_block()
	 * @see #getEntryOperation()
	 * @generated
	 */
	EReference getEntryOperation_Expression_block();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ImperativeCallExp <em>Imperative Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Call Exp</em>'.
	 * @see qvtoperational.ImperativeCallExp
	 * @generated
	 */
	EClass getImperativeCallExp();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.ImperativeCallExp#getIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see qvtoperational.ImperativeCallExp#getIsVirtual()
	 * @see #getImperativeCallExp()
	 * @generated
	 */
	EAttribute getImperativeCallExp_IsVirtual();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ImperativeOperation <em>Imperative Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Operation</em>'.
	 * @see qvtoperational.ImperativeOperation
	 * @generated
	 */
	EClass getImperativeOperation();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ImperativeOperation#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see qvtoperational.ImperativeOperation#getContext()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.ImperativeOperation#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see qvtoperational.ImperativeOperation#getResult()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Result();

	/**
	 * Returns the meta object for the reference '{@link qvtoperational.ImperativeOperation#getOverridden <em>Overridden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overridden</em>'.
	 * @see qvtoperational.ImperativeOperation#getOverridden()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Overridden();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ImperativeOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see qvtoperational.ImperativeOperation#getBody()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Body();

	/**
	 * Returns the meta object for class '{@link qvtoperational.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see qvtoperational.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.Library#getLibrary_h <em>Library h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library h</em>'.
	 * @see qvtoperational.Library#getLibrary_h()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Library_h();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.Library#getModule_element <em>Module element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module element</em>'.
	 * @see qvtoperational.Library#getModule_element()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Module_element();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ModelParameter <em>Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Parameter</em>'.
	 * @see qvtoperational.ModelParameter
	 * @generated
	 */
	EClass getModelParameter();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see qvtoperational.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the reference list '{@link qvtoperational.ModelType#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metamodel</em>'.
	 * @see qvtoperational.ModelType#getMetamodel()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Metamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.ModelType#getAdditionalCondition <em>Additional Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Condition</em>'.
	 * @see qvtoperational.ModelType#getAdditionalCondition()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_AdditionalCondition();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.ModelType#getConformanceKind <em>Conformance Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conformance Kind</em>'.
	 * @see qvtoperational.ModelType#getConformanceKind()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_ConformanceKind();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.ModelType#getCompliance_kind <em>Compliance kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compliance kind</em>'.
	 * @see qvtoperational.ModelType#getCompliance_kind()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_Compliance_kind();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.ModelType#getPackageref_list <em>Packageref list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packageref list</em>'.
	 * @see qvtoperational.ModelType#getPackageref_list()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Packageref_list();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ModelType#getModeltype_where <em>Modeltype where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modeltype where</em>'.
	 * @see qvtoperational.ModelType#getModeltype_where()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Modeltype_where();

	/**
	 * Returns the meta object for class '{@link qvtoperational.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see qvtoperational.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.Module#getOwnedTag <em>Owned Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Tag</em>'.
	 * @see qvtoperational.Module#getOwnedTag()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_OwnedTag();

	/**
	 * Returns the meta object for the reference '{@link qvtoperational.Module#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry</em>'.
	 * @see qvtoperational.Module#getEntry()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Entry();

	/**
	 * Returns the meta object for the reference list '{@link qvtoperational.Module#getConfigProperty <em>Config Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Config Property</em>'.
	 * @see qvtoperational.Module#getConfigProperty()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ConfigProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.Module#getModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Import</em>'.
	 * @see qvtoperational.Module#getModuleImport()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModuleImport();

	/**
	 * Returns the meta object for the reference list '{@link qvtoperational.Module#getUsedModelType <em>Used Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Model Type</em>'.
	 * @see qvtoperational.Module#getUsedModelType()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_UsedModelType();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.Module#getIsBlackbox <em>Is Blackbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Blackbox</em>'.
	 * @see qvtoperational.Module#getIsBlackbox()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_IsBlackbox();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.Module#getOwnedVariable <em>Owned Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variable</em>'.
	 * @see qvtoperational.Module#getOwnedVariable()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_OwnedVariable();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Import</em>'.
	 * @see qvtoperational.ModuleImport
	 * @generated
	 */
	EClass getModuleImport();

	/**
	 * Returns the meta object for the reference list '{@link qvtoperational.ModuleImport#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding</em>'.
	 * @see qvtoperational.ModuleImport#getBinding()
	 * @see #getModuleImport()
	 * @generated
	 */
	EReference getModuleImport_Binding();

	/**
	 * Returns the meta object for the container reference '{@link qvtoperational.ModuleImport#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see qvtoperational.ModuleImport#getModule()
	 * @see #getModuleImport()
	 * @generated
	 */
	EReference getModuleImport_Module();

	/**
	 * Returns the meta object for the reference '{@link qvtoperational.ModuleImport#getImportedModule <em>Imported Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Module</em>'.
	 * @see qvtoperational.ModuleImport#getImportedModule()
	 * @see #getModuleImport()
	 * @generated
	 */
	EReference getModuleImport_ImportedModule();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.ModuleImport#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see qvtoperational.ModuleImport#getKind()
	 * @see #getModuleImport()
	 * @generated
	 */
	EAttribute getModuleImport_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ModuleImport#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see qvtoperational.ModuleImport#getUnit()
	 * @see #getModuleImport()
	 * @generated
	 */
	EReference getModuleImport_Unit();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.ModuleImport#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see qvtoperational.ModuleImport#getIdentifier()
	 * @see #getModuleImport()
	 * @generated
	 */
	EAttribute getModuleImport_Identifier();

	/**
	 * Returns the meta object for class '{@link qvtoperational.VarParameter <em>Var Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Parameter</em>'.
	 * @see qvtoperational.VarParameter
	 * @generated
	 */
	EClass getVarParameter();

	/**
	 * Returns the meta object for the reference '{@link qvtoperational.VarParameter#getCtxOwner <em>Ctx Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ctx Owner</em>'.
	 * @see qvtoperational.VarParameter#getCtxOwner()
	 * @see #getVarParameter()
	 * @generated
	 */
	EReference getVarParameter_CtxOwner();

	/**
	 * Returns the meta object for the container reference '{@link qvtoperational.VarParameter#getResOwner <em>Res Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Res Owner</em>'.
	 * @see qvtoperational.VarParameter#getResOwner()
	 * @see #getVarParameter()
	 * @generated
	 */
	EReference getVarParameter_ResOwner();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.VarParameter#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see qvtoperational.VarParameter#getKind()
	 * @see #getVarParameter()
	 * @generated
	 */
	EAttribute getVarParameter_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.VarParameter#getDeclarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declarator</em>'.
	 * @see qvtoperational.VarParameter#getDeclarator()
	 * @see #getVarParameter()
	 * @generated
	 */
	EReference getVarParameter_Declarator();

	/**
	 * Returns the meta object for class '{@link qvtoperational.OperationBody <em>Operation Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Body</em>'.
	 * @see qvtoperational.OperationBody
	 * @generated
	 */
	EClass getOperationBody();

	/**
	 * Returns the meta object for the container reference '{@link qvtoperational.OperationBody#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see qvtoperational.OperationBody#getOperation()
	 * @see #getOperationBody()
	 * @generated
	 */
	EReference getOperationBody_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.OperationBody#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see qvtoperational.OperationBody#getContent()
	 * @see #getOperationBody()
	 * @generated
	 */
	EReference getOperationBody_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.OperationBody#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see qvtoperational.OperationBody#getVariable()
	 * @see #getOperationBody()
	 * @generated
	 */
	EReference getOperationBody_Variable();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ConstructorBody <em>Constructor Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Body</em>'.
	 * @see qvtoperational.ConstructorBody
	 * @generated
	 */
	EClass getConstructorBody();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ObjectExp <em>Object Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Exp</em>'.
	 * @see qvtoperational.ObjectExp
	 * @generated
	 */
	EClass getObjectExp();

	/**
	 * Returns the meta object for the reference '{@link qvtoperational.ObjectExp#getReferredObject <em>Referred Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Object</em>'.
	 * @see qvtoperational.ObjectExp#getReferredObject()
	 * @see #getObjectExp()
	 * @generated
	 */
	EReference getObjectExp_ReferredObject();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ObjectExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see qvtoperational.ObjectExp#getBody()
	 * @see #getObjectExp()
	 * @generated
	 */
	EReference getObjectExp_Body();

	/**
	 * Returns the meta object for class '{@link qvtoperational.TopLevelGO <em>Top Level GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level GO</em>'.
	 * @see qvtoperational.TopLevelGO
	 * @generated
	 */
	EClass getTopLevelGO();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.TopLevelGO#getUnit_element <em>Unit element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit element</em>'.
	 * @see qvtoperational.TopLevelGO#getUnit_element()
	 * @see #getTopLevelGO()
	 * @generated
	 */
	EReference getTopLevelGO_Unit_element();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.TopLevelGO#getModuleimport <em>Moduleimport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moduleimport</em>'.
	 * @see qvtoperational.TopLevelGO#getModuleimport()
	 * @see #getTopLevelGO()
	 * @generated
	 */
	EReference getTopLevelGO_Moduleimport();

	/**
	 * Returns the meta object for class '{@link qvtoperational.UnitRefGO <em>Unit Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Ref GO</em>'.
	 * @see qvtoperational.UnitRefGO
	 * @generated
	 */
	EClass getUnitRefGO();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.UnitRefGO#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see qvtoperational.UnitRefGO#getIdentifier()
	 * @see #getUnitRefGO()
	 * @generated
	 */
	EAttribute getUnitRefGO_Identifier();

	/**
	 * Returns the meta object for class '{@link qvtoperational.TagGO <em>Tag GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag GO</em>'.
	 * @see qvtoperational.TagGO
	 * @generated
	 */
	EClass getTagGO();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.TagGO#getTagid <em>Tagid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tagid</em>'.
	 * @see qvtoperational.TagGO#getTagid()
	 * @see #getTagGO()
	 * @generated
	 */
	EAttribute getTagGO_Tagid();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.TagGO#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see qvtoperational.TagGO#getScoped_identifier()
	 * @see #getTagGO()
	 * @generated
	 */
	EReference getTagGO_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.TagGO#getTagvalue <em>Tagvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tagvalue</em>'.
	 * @see qvtoperational.TagGO#getTagvalue()
	 * @see #getTagGO()
	 * @generated
	 */
	EReference getTagGO_Tagvalue();

	/**
	 * Returns the meta object for class '{@link qvtoperational.MetaModelGO <em>Meta Model GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model GO</em>'.
	 * @see qvtoperational.MetaModelGO
	 * @generated
	 */
	EClass getMetaModelGO();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MetaModelGO#getMetamodel_h <em>Metamodel h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metamodel h</em>'.
	 * @see qvtoperational.MetaModelGO#getMetamodel_h()
	 * @see #getMetaModelGO()
	 * @generated
	 */
	EReference getMetaModelGO_Metamodel_h();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.MetaModelGO#getMetamodel_element <em>Metamodel element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodel element</em>'.
	 * @see qvtoperational.MetaModelGO#getMetamodel_element()
	 * @see #getMetaModelGO()
	 * @generated
	 */
	EReference getMetaModelGO_Metamodel_element();

	/**
	 * Returns the meta object for class '{@link qvtoperational.AccessDecl <em>Access Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Decl</em>'.
	 * @see qvtoperational.AccessDecl
	 * @generated
	 */
	EClass getAccessDecl();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.AccessDecl#getAccess_usage <em>Access usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access usage</em>'.
	 * @see qvtoperational.AccessDecl#getAccess_usage()
	 * @see #getAccessDecl()
	 * @generated
	 */
	EReference getAccessDecl_Access_usage();

	/**
	 * Returns the meta object for class '{@link qvtoperational.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Def</em>'.
	 * @see qvtoperational.TypeDef
	 * @generated
	 */
	EClass getTypeDef();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.TypeDef#getTypespec <em>Typespec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typespec</em>'.
	 * @see qvtoperational.TypeDef#getTypespec()
	 * @see #getTypeDef()
	 * @generated
	 */
	EReference getTypeDef_Typespec();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.TypeDef#getTypedef_condition <em>Typedef condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typedef condition</em>'.
	 * @see qvtoperational.TypeDef#getTypedef_condition()
	 * @see #getTypeDef()
	 * @generated
	 */
	EReference getTypeDef_Typedef_condition();

	/**
	 * Returns the meta object for class '{@link qvtoperational.TransformationHeader <em>Transformation Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Header</em>'.
	 * @see qvtoperational.TransformationHeader
	 * @generated
	 */
	EClass getTransformationHeader();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.TransformationHeader#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see qvtoperational.TransformationHeader#getQualifier()
	 * @see #getTransformationHeader()
	 * @generated
	 */
	EAttribute getTransformationHeader_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.TransformationHeader#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qvtoperational.TransformationHeader#getName()
	 * @see #getTransformationHeader()
	 * @generated
	 */
	EAttribute getTransformationHeader_Name();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.TransformationHeader#getTransformation_signature <em>Transformation signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation signature</em>'.
	 * @see qvtoperational.TransformationHeader#getTransformation_signature()
	 * @see #getTransformationHeader()
	 * @generated
	 */
	EReference getTransformationHeader_Transformation_signature();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.TransformationHeader#getTransformation_usage_refine <em>Transformation usage refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation usage refine</em>'.
	 * @see qvtoperational.TransformationHeader#getTransformation_usage_refine()
	 * @see #getTransformationHeader()
	 * @generated
	 */
	EReference getTransformationHeader_Transformation_usage_refine();

	/**
	 * Returns the meta object for class '{@link qvtoperational.SimpleSignature <em>Simple Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Signature</em>'.
	 * @see qvtoperational.SimpleSignature
	 * @generated
	 */
	EClass getSimpleSignature();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.SimpleSignature#getParam_list <em>Param list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param list</em>'.
	 * @see qvtoperational.SimpleSignature#getParam_list()
	 * @see #getSimpleSignature()
	 * @generated
	 */
	EReference getSimpleSignature_Param_list();

	/**
	 * Returns the meta object for class '{@link qvtoperational.TransformationUsageRefine <em>Transformation Usage Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Usage Refine</em>'.
	 * @see qvtoperational.TransformationUsageRefine
	 * @generated
	 */
	EClass getTransformationUsageRefine();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.TransformationUsageRefine#getModule_usage <em>Module usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module usage</em>'.
	 * @see qvtoperational.TransformationUsageRefine#getModule_usage()
	 * @see #getTransformationUsageRefine()
	 * @generated
	 */
	EReference getTransformationUsageRefine_Module_usage();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.TransformationUsageRefine#getTransformation_refine <em>Transformation refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation refine</em>'.
	 * @see qvtoperational.TransformationUsageRefine#getTransformation_refine()
	 * @see #getTransformationUsageRefine()
	 * @generated
	 */
	EReference getTransformationUsageRefine_Transformation_refine();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ModuleRefGO <em>Module Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Ref GO</em>'.
	 * @see qvtoperational.ModuleRefGO
	 * @generated
	 */
	EClass getModuleRefGO();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ModuleRefGO#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see qvtoperational.ModuleRefGO#getScoped_identifier()
	 * @see #getModuleRefGO()
	 * @generated
	 */
	EReference getModuleRefGO_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ModuleRefGO#getSimple_signature <em>Simple signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple signature</em>'.
	 * @see qvtoperational.ModuleRefGO#getSimple_signature()
	 * @see #getModuleRefGO()
	 * @generated
	 */
	EReference getModuleRefGO_Simple_signature();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ModuleUsageGO <em>Module Usage GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Usage GO</em>'.
	 * @see qvtoperational.ModuleUsageGO
	 * @generated
	 */
	EClass getModuleUsageGO();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ModuleUsageGO#getAccess_usage <em>Access usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access usage</em>'.
	 * @see qvtoperational.ModuleUsageGO#getAccess_usage()
	 * @see #getModuleUsageGO()
	 * @generated
	 */
	EReference getModuleUsageGO_Access_usage();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ModuleUsageGO#getExtends_usage <em>Extends usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extends usage</em>'.
	 * @see qvtoperational.ModuleUsageGO#getExtends_usage()
	 * @see #getModuleUsageGO()
	 * @generated
	 */
	EReference getModuleUsageGO_Extends_usage();

	/**
	 * Returns the meta object for class '{@link qvtoperational.LibraryHeader <em>Library Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Header</em>'.
	 * @see qvtoperational.LibraryHeader
	 * @generated
	 */
	EClass getLibraryHeader();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.LibraryHeader#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qvtoperational.LibraryHeader#getName()
	 * @see #getLibraryHeader()
	 * @generated
	 */
	EAttribute getLibraryHeader_Name();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.LibraryHeader#getLibrary_signature <em>Library signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library signature</em>'.
	 * @see qvtoperational.LibraryHeader#getLibrary_signature()
	 * @see #getLibraryHeader()
	 * @generated
	 */
	EReference getLibraryHeader_Library_signature();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.LibraryHeader#getModule_usage <em>Module usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module usage</em>'.
	 * @see qvtoperational.LibraryHeader#getModule_usage()
	 * @see #getLibraryHeader()
	 * @generated
	 */
	EReference getLibraryHeader_Module_usage();

	/**
	 * Returns the meta object for class '{@link qvtoperational.AccessUsage <em>Access Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Usage</em>'.
	 * @see qvtoperational.AccessUsage
	 * @generated
	 */
	EClass getAccessUsage();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.AccessUsage#getModule_kind <em>Module kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module kind</em>'.
	 * @see qvtoperational.AccessUsage#getModule_kind()
	 * @see #getAccessUsage()
	 * @generated
	 */
	EAttribute getAccessUsage_Module_kind();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.AccessUsage#getModuleref_list <em>Moduleref list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moduleref list</em>'.
	 * @see qvtoperational.AccessUsage#getModuleref_list()
	 * @see #getAccessUsage()
	 * @generated
	 */
	EReference getAccessUsage_Moduleref_list();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ExtendsUsage <em>Extends Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extends Usage</em>'.
	 * @see qvtoperational.ExtendsUsage
	 * @generated
	 */
	EClass getExtendsUsage();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.ExtendsUsage#getModule_kind <em>Module kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module kind</em>'.
	 * @see qvtoperational.ExtendsUsage#getModule_kind()
	 * @see #getExtendsUsage()
	 * @generated
	 */
	EAttribute getExtendsUsage_Module_kind();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.ExtendsUsage#getModuleref_list <em>Moduleref list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moduleref list</em>'.
	 * @see qvtoperational.ExtendsUsage#getModuleref_list()
	 * @see #getExtendsUsage()
	 * @generated
	 */
	EReference getExtendsUsage_Moduleref_list();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ScopedIdentifier <em>Scoped Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Identifier</em>'.
	 * @see qvtoperational.ScopedIdentifier
	 * @generated
	 */
	EClass getScopedIdentifier();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.ScopedIdentifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see qvtoperational.ScopedIdentifier#getIdentifier()
	 * @see #getScopedIdentifier()
	 * @generated
	 */
	EAttribute getScopedIdentifier_Identifier();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ParamList <em>Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param List</em>'.
	 * @see qvtoperational.ParamList
	 * @generated
	 */
	EClass getParamList();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.ParamList#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see qvtoperational.ParamList#getParam()
	 * @see #getParamList()
	 * @generated
	 */
	EReference getParamList_Param();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ClassifierGO <em>Classifier GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier GO</em>'.
	 * @see qvtoperational.ClassifierGO
	 * @generated
	 */
	EClass getClassifierGO();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierGO#getClassifier_h <em>Classifier h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier h</em>'.
	 * @see qvtoperational.ClassifierGO#getClassifier_h()
	 * @see #getClassifierGO()
	 * @generated
	 */
	EReference getClassifierGO_Classifier_h();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierGO#getClassifier_feature_list <em>Classifier feature list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier feature list</em>'.
	 * @see qvtoperational.ClassifierGO#getClassifier_feature_list()
	 * @see #getClassifierGO()
	 * @generated
	 */
	EReference getClassifierGO_Classifier_feature_list();

	/**
	 * Returns the meta object for class '{@link qvtoperational.Declarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarator</em>'.
	 * @see qvtoperational.Declarator
	 * @generated
	 */
	EClass getDeclarator();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.Declarator#getTypespec <em>Typespec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typespec</em>'.
	 * @see qvtoperational.Declarator#getTypespec()
	 * @see #getDeclarator()
	 * @generated
	 */
	EReference getDeclarator_Typespec();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.Declarator#getInit_part <em>Init part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init part</em>'.
	 * @see qvtoperational.Declarator#getInit_part()
	 * @see #getDeclarator()
	 * @generated
	 */
	EReference getDeclarator_Init_part();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.Declarator#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see qvtoperational.Declarator#getScoped_identifier()
	 * @see #getDeclarator()
	 * @generated
	 */
	EReference getDeclarator_Scoped_identifier();

	/**
	 * Returns the meta object for class '{@link qvtoperational.TypeSpec <em>Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Spec</em>'.
	 * @see qvtoperational.TypeSpec
	 * @generated
	 */
	EClass getTypeSpec();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.TypeSpec#getType_reference <em>Type reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type reference</em>'.
	 * @see qvtoperational.TypeSpec#getType_reference()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EReference getTypeSpec_Type_reference();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.TypeSpec#getExtent_location <em>Extent location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extent location</em>'.
	 * @see qvtoperational.TypeSpec#getExtent_location()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EAttribute getTypeSpec_Extent_location();

	/**
	 * Returns the meta object for class '{@link qvtoperational.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see qvtoperational.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.TypeReference#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see qvtoperational.TypeReference#getScoped_identifier()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.TypeReference#getComplex_type <em>Complex type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex type</em>'.
	 * @see qvtoperational.TypeReference#getComplex_type()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Complex_type();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see qvtoperational.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.ComplexType#getComplex_type_key <em>Complex type key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complex type key</em>'.
	 * @see qvtoperational.ComplexType#getComplex_type_key()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Complex_type_key();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.ComplexType#getCollection_key <em>Collection key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection key</em>'.
	 * @see qvtoperational.ComplexType#getCollection_key()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Collection_key();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.ComplexType#getTypespec <em>Typespec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typespec</em>'.
	 * @see qvtoperational.ComplexType#getTypespec()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Typespec();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ComplexType#getDeclarator_list <em>Declarator list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declarator list</em>'.
	 * @see qvtoperational.ComplexType#getDeclarator_list()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Declarator_list();

	/**
	 * Returns the meta object for class '{@link qvtoperational.DeclaratorList <em>Declarator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarator List</em>'.
	 * @see qvtoperational.DeclaratorList
	 * @generated
	 */
	EClass getDeclaratorList();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.DeclaratorList#getDeclarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarator</em>'.
	 * @see qvtoperational.DeclaratorList#getDeclarator()
	 * @see #getDeclaratorList()
	 * @generated
	 */
	EReference getDeclaratorList_Declarator();

	/**
	 * Returns the meta object for class '{@link qvtoperational.InitPart <em>Init Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Part</em>'.
	 * @see qvtoperational.InitPart
	 * @generated
	 */
	EClass getInitPart();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.InitPart#getInit_op <em>Init op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init op</em>'.
	 * @see qvtoperational.InitPart#getInit_op()
	 * @see #getInitPart()
	 * @generated
	 */
	EAttribute getInitPart_Init_op();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.InitPart#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see qvtoperational.InitPart#getExpression()
	 * @see #getInitPart()
	 * @generated
	 */
	EReference getInitPart_Expression();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ExpressionSemiList <em>Expression Semi List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Semi List</em>'.
	 * @see qvtoperational.ExpressionSemiList
	 * @generated
	 */
	EClass getExpressionSemiList();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.ExpressionSemiList#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see qvtoperational.ExpressionSemiList#getExpression()
	 * @see #getExpressionSemiList()
	 * @generated
	 */
	EReference getExpressionSemiList_Expression();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression List</em>'.
	 * @see qvtoperational.ExpressionList
	 * @generated
	 */
	EClass getExpressionList();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ExpressionList#getExpression_semi_list <em>Expression semi list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression semi list</em>'.
	 * @see qvtoperational.ExpressionList#getExpression_semi_list()
	 * @see #getExpressionList()
	 * @generated
	 */
	EReference getExpressionList_Expression_semi_list();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ExpressionBlock <em>Expression Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Block</em>'.
	 * @see qvtoperational.ExpressionBlock
	 * @generated
	 */
	EClass getExpressionBlock();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ExpressionBlock#getExpression_list <em>Expression list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression list</em>'.
	 * @see qvtoperational.ExpressionBlock#getExpression_list()
	 * @see #getExpressionBlock()
	 * @generated
	 */
	EReference getExpressionBlock_Expression_list();

	/**
	 * Returns the meta object for class '{@link qvtoperational.PackageRefGO <em>Package Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Ref GO</em>'.
	 * @see qvtoperational.PackageRefGO
	 * @generated
	 */
	EClass getPackageRefGO();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.PackageRefGO#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see qvtoperational.PackageRefGO#getScoped_identifier()
	 * @see #getPackageRefGO()
	 * @generated
	 */
	EReference getPackageRefGO_Scoped_identifier();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.PackageRefGO#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see qvtoperational.PackageRefGO#getUri()
	 * @see #getPackageRefGO()
	 * @generated
	 */
	EAttribute getPackageRefGO_Uri();

	/**
	 * Returns the meta object for class '{@link qvtoperational.MetaModelHeader <em>Meta Model Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model Header</em>'.
	 * @see qvtoperational.MetaModelHeader
	 * @generated
	 */
	EClass getMetaModelHeader();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MetaModelHeader#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see qvtoperational.MetaModelHeader#getScoped_identifier()
	 * @see #getMetaModelHeader()
	 * @generated
	 */
	EReference getMetaModelHeader_Scoped_identifier();

	/**
	 * Returns the meta object for class '{@link qvtoperational.MetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model Element</em>'.
	 * @see qvtoperational.MetaModelElement
	 * @generated
	 */
	EClass getMetaModelElement();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MetaModelElement#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier</em>'.
	 * @see qvtoperational.MetaModelElement#getClassifier()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_Classifier();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MetaModelElement#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration</em>'.
	 * @see qvtoperational.MetaModelElement#getEnumeration()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_Enumeration();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MetaModelElement#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tag</em>'.
	 * @see qvtoperational.MetaModelElement#getTag()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_Tag();

	/**
	 * Returns the meta object for class '{@link qvtoperational.EnumerationGO <em>Enumeration GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration GO</em>'.
	 * @see qvtoperational.EnumerationGO
	 * @generated
	 */
	EClass getEnumerationGO();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.EnumerationGO#getEnumeration_h <em>Enumeration h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration h</em>'.
	 * @see qvtoperational.EnumerationGO#getEnumeration_h()
	 * @see #getEnumerationGO()
	 * @generated
	 */
	EReference getEnumerationGO_Enumeration_h();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.EnumerationGO#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see qvtoperational.EnumerationGO#getIdentifier()
	 * @see #getEnumerationGO()
	 * @generated
	 */
	EAttribute getEnumerationGO_Identifier();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ClassifierHeader <em>Classifier Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Header</em>'.
	 * @see qvtoperational.ClassifierHeader
	 * @generated
	 */
	EClass getClassifierHeader();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierHeader#getClassifier_info <em>Classifier info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier info</em>'.
	 * @see qvtoperational.ClassifierHeader#getClassifier_info()
	 * @see #getClassifierHeader()
	 * @generated
	 */
	EReference getClassifierHeader_Classifier_info();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierHeader#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see qvtoperational.ClassifierHeader#getScoped_identifier()
	 * @see #getClassifierHeader()
	 * @generated
	 */
	EReference getClassifierHeader_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierHeader#getClassifier_extension <em>Classifier extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier extension</em>'.
	 * @see qvtoperational.ClassifierHeader#getClassifier_extension()
	 * @see #getClassifierHeader()
	 * @generated
	 */
	EReference getClassifierHeader_Classifier_extension();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ClassifierFeatureList <em>Classifier Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Feature List</em>'.
	 * @see qvtoperational.ClassifierFeatureList
	 * @generated
	 */
	EClass getClassifierFeatureList();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.ClassifierFeatureList#getClassifier_feature <em>Classifier feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifier feature</em>'.
	 * @see qvtoperational.ClassifierFeatureList#getClassifier_feature()
	 * @see #getClassifierFeatureList()
	 * @generated
	 */
	EReference getClassifierFeatureList_Classifier_feature();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ClassifierInfo <em>Classifier Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Info</em>'.
	 * @see qvtoperational.ClassifierInfo
	 * @generated
	 */
	EClass getClassifierInfo();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.ClassifierInfo#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see qvtoperational.ClassifierInfo#getQualifier()
	 * @see #getClassifierInfo()
	 * @generated
	 */
	EAttribute getClassifierInfo_Qualifier();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ClassifierExtension <em>Classifier Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Extension</em>'.
	 * @see qvtoperational.ClassifierExtension
	 * @generated
	 */
	EClass getClassifierExtension();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierExtension#getScoped_identifier_list <em>Scoped identifier list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier list</em>'.
	 * @see qvtoperational.ClassifierExtension#getScoped_identifier_list()
	 * @see #getClassifierExtension()
	 * @generated
	 */
	EReference getClassifierExtension_Scoped_identifier_list();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ScopedIdentifierList <em>Scoped Identifier List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Identifier List</em>'.
	 * @see qvtoperational.ScopedIdentifierList
	 * @generated
	 */
	EClass getScopedIdentifierList();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.ScopedIdentifierList#getScoped_identifier_list <em>Scoped identifier list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scoped identifier list</em>'.
	 * @see qvtoperational.ScopedIdentifierList#getScoped_identifier_list()
	 * @see #getScopedIdentifierList()
	 * @generated
	 */
	EReference getScopedIdentifierList_Scoped_identifier_list();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ClassifierFeature <em>Classifier Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Feature</em>'.
	 * @see qvtoperational.ClassifierFeature
	 * @generated
	 */
	EClass getClassifierFeature();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierFeature#getFeature_qualifier <em>Feature qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature qualifier</em>'.
	 * @see qvtoperational.ClassifierFeature#getFeature_qualifier()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Feature_qualifier();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierFeature#getDeclarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declarator</em>'.
	 * @see qvtoperational.ClassifierFeature#getDeclarator()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Declarator();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierFeature#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see qvtoperational.ClassifierFeature#getMultiplicity()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Multiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierFeature#getOpposite_property <em>Opposite property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opposite property</em>'.
	 * @see qvtoperational.ClassifierFeature#getOpposite_property()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Opposite_property();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierFeature#getComplete_signature <em>Complete signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complete signature</em>'.
	 * @see qvtoperational.ClassifierFeature#getComplete_signature()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Complete_signature();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ClassifierFeature#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tag</em>'.
	 * @see qvtoperational.ClassifierFeature#getTag()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Tag();

	/**
	 * Returns the meta object for class '{@link qvtoperational.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity</em>'.
	 * @see qvtoperational.Multiplicity
	 * @generated
	 */
	EClass getMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.Multiplicity#getMultiplicity_range <em>Multiplicity range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity range</em>'.
	 * @see qvtoperational.Multiplicity#getMultiplicity_range()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EAttribute getMultiplicity_Multiplicity_range();

	/**
	 * Returns the meta object for class '{@link qvtoperational.OppositeProperty <em>Opposite Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opposite Property</em>'.
	 * @see qvtoperational.OppositeProperty
	 * @generated
	 */
	EClass getOppositeProperty();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.OppositeProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qvtoperational.OppositeProperty#getName()
	 * @see #getOppositeProperty()
	 * @generated
	 */
	EAttribute getOppositeProperty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.OppositeProperty#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see qvtoperational.OppositeProperty#getMultiplicity()
	 * @see #getOppositeProperty()
	 * @generated
	 */
	EReference getOppositeProperty_Multiplicity();

	/**
	 * Returns the meta object for class '{@link qvtoperational.StereotypeQualifier <em>Stereotype Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stereotype Qualifier</em>'.
	 * @see qvtoperational.StereotypeQualifier
	 * @generated
	 */
	EClass getStereotypeQualifier();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.StereotypeQualifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see qvtoperational.StereotypeQualifier#getIdentifier()
	 * @see #getStereotypeQualifier()
	 * @generated
	 */
	EAttribute getStereotypeQualifier_Identifier();

	/**
	 * Returns the meta object for class '{@link qvtoperational.FeatureQualifier <em>Feature Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Qualifier</em>'.
	 * @see qvtoperational.FeatureQualifier
	 * @generated
	 */
	EClass getFeatureQualifier();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.FeatureQualifier#getStereotype_qualifier <em>Stereotype qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stereotype qualifier</em>'.
	 * @see qvtoperational.FeatureQualifier#getStereotype_qualifier()
	 * @see #getFeatureQualifier()
	 * @generated
	 */
	EReference getFeatureQualifier_Stereotype_qualifier();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.FeatureQualifier#getFeature_key <em>Feature key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature key</em>'.
	 * @see qvtoperational.FeatureQualifier#getFeature_key()
	 * @see #getFeatureQualifier()
	 * @generated
	 */
	EAttribute getFeatureQualifier_Feature_key();

	/**
	 * Returns the meta object for class '{@link qvtoperational.CompleteSignature <em>Complete Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complete Signature</em>'.
	 * @see qvtoperational.CompleteSignature
	 * @generated
	 */
	EClass getCompleteSignature();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.CompleteSignature#getSimple_signature <em>Simple signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple signature</em>'.
	 * @see qvtoperational.CompleteSignature#getSimple_signature()
	 * @see #getCompleteSignature()
	 * @generated
	 */
	EReference getCompleteSignature_Simple_signature();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.CompleteSignature#getParam_list <em>Param list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param list</em>'.
	 * @see qvtoperational.CompleteSignature#getParam_list()
	 * @see #getCompleteSignature()
	 * @generated
	 */
	EReference getCompleteSignature_Param_list();

	/**
	 * Returns the meta object for class '{@link qvtoperational.EnumerationHeader <em>Enumeration Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Header</em>'.
	 * @see qvtoperational.EnumerationHeader
	 * @generated
	 */
	EClass getEnumerationHeader();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.EnumerationHeader#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see qvtoperational.EnumerationHeader#getIdentifier()
	 * @see #getEnumerationHeader()
	 * @generated
	 */
	EAttribute getEnumerationHeader_Identifier();

	/**
	 * Returns the meta object for class '{@link qvtoperational.HelperInfo <em>Helper Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Info</em>'.
	 * @see qvtoperational.HelperInfo
	 * @generated
	 */
	EClass getHelperInfo();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.HelperInfo#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see qvtoperational.HelperInfo#getQualifier()
	 * @see #getHelperInfo()
	 * @generated
	 */
	EAttribute getHelperInfo_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.HelperInfo#getHelper_kind <em>Helper kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Helper kind</em>'.
	 * @see qvtoperational.HelperInfo#getHelper_kind()
	 * @see #getHelperInfo()
	 * @generated
	 */
	EAttribute getHelperInfo_Helper_kind();

	/**
	 * Returns the meta object for class '{@link qvtoperational.HelperHeader <em>Helper Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Header</em>'.
	 * @see qvtoperational.HelperHeader
	 * @generated
	 */
	EClass getHelperHeader();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.HelperHeader#getHelper_info <em>Helper info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Helper info</em>'.
	 * @see qvtoperational.HelperHeader#getHelper_info()
	 * @see #getHelperHeader()
	 * @generated
	 */
	EReference getHelperHeader_Helper_info();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.HelperHeader#getScope_identifier <em>Scope identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope identifier</em>'.
	 * @see qvtoperational.HelperHeader#getScope_identifier()
	 * @see #getHelperHeader()
	 * @generated
	 */
	EReference getHelperHeader_Scope_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.HelperHeader#getComplete_signature <em>Complete signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complete signature</em>'.
	 * @see qvtoperational.HelperHeader#getComplete_signature()
	 * @see #getHelperHeader()
	 * @generated
	 */
	EReference getHelperHeader_Complete_signature();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ConstructorHeader <em>Constructor Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Header</em>'.
	 * @see qvtoperational.ConstructorHeader
	 * @generated
	 */
	EClass getConstructorHeader();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.ConstructorHeader#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see qvtoperational.ConstructorHeader#getQualifier()
	 * @see #getConstructorHeader()
	 * @generated
	 */
	EAttribute getConstructorHeader_Qualifier();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ConstructorHeader#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see qvtoperational.ConstructorHeader#getScoped_identifier()
	 * @see #getConstructorHeader()
	 * @generated
	 */
	EReference getConstructorHeader_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.ConstructorHeader#getSimple_signature <em>Simple signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple signature</em>'.
	 * @see qvtoperational.ConstructorHeader#getSimple_signature()
	 * @see #getConstructorHeader()
	 * @generated
	 */
	EReference getConstructorHeader_Simple_signature();

	/**
	 * Returns the meta object for class '{@link qvtoperational.EntryHeader <em>Entry Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Header</em>'.
	 * @see qvtoperational.EntryHeader
	 * @generated
	 */
	EClass getEntryHeader();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.EntryHeader#getSimple_signature <em>Simple signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple signature</em>'.
	 * @see qvtoperational.EntryHeader#getSimple_signature()
	 * @see #getEntryHeader()
	 * @generated
	 */
	EReference getEntryHeader_Simple_signature();

	/**
	 * Returns the meta object for class '{@link qvtoperational.MappingHeader <em>Mapping Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Header</em>'.
	 * @see qvtoperational.MappingHeader
	 * @generated
	 */
	EClass getMappingHeader();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.MappingHeader#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see qvtoperational.MappingHeader#getQualifier()
	 * @see #getMappingHeader()
	 * @generated
	 */
	EAttribute getMappingHeader_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.MappingHeader#getParam_direction <em>Param direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param direction</em>'.
	 * @see qvtoperational.MappingHeader#getParam_direction()
	 * @see #getMappingHeader()
	 * @generated
	 */
	EAttribute getMappingHeader_Param_direction();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingHeader#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see qvtoperational.MappingHeader#getScoped_identifier()
	 * @see #getMappingHeader()
	 * @generated
	 */
	EReference getMappingHeader_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingHeader#getComplete_signature <em>Complete signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complete signature</em>'.
	 * @see qvtoperational.MappingHeader#getComplete_signature()
	 * @see #getMappingHeader()
	 * @generated
	 */
	EReference getMappingHeader_Complete_signature();

	/**
	 * Returns the meta object for the containment reference list '{@link qvtoperational.MappingHeader#getMapping_extra <em>Mapping extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping extra</em>'.
	 * @see qvtoperational.MappingHeader#getMapping_extra()
	 * @see #getMappingHeader()
	 * @generated
	 */
	EReference getMappingHeader_Mapping_extra();

	/**
	 * Returns the meta object for class '{@link qvtoperational.MappingFullHeader <em>Mapping Full Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Full Header</em>'.
	 * @see qvtoperational.MappingFullHeader
	 * @generated
	 */
	EClass getMappingFullHeader();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingFullHeader#getMapping_header <em>Mapping header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping header</em>'.
	 * @see qvtoperational.MappingFullHeader#getMapping_header()
	 * @see #getMappingFullHeader()
	 * @generated
	 */
	EReference getMappingFullHeader_Mapping_header();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingFullHeader#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see qvtoperational.MappingFullHeader#getWhen()
	 * @see #getMappingFullHeader()
	 * @generated
	 */
	EReference getMappingFullHeader_When();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingFullHeader#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see qvtoperational.MappingFullHeader#getWhere()
	 * @see #getMappingFullHeader()
	 * @generated
	 */
	EReference getMappingFullHeader_Where();

	/**
	 * Returns the meta object for class '{@link qvtoperational.MappingExtra <em>Mapping Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Extra</em>'.
	 * @see qvtoperational.MappingExtra
	 * @generated
	 */
	EClass getMappingExtra();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingExtra#getMapping_extension <em>Mapping extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping extension</em>'.
	 * @see qvtoperational.MappingExtra#getMapping_extension()
	 * @see #getMappingExtra()
	 * @generated
	 */
	EReference getMappingExtra_Mapping_extension();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingExtra#getMapping_refinement <em>Mapping refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping refinement</em>'.
	 * @see qvtoperational.MappingExtra#getMapping_refinement()
	 * @see #getMappingExtra()
	 * @generated
	 */
	EReference getMappingExtra_Mapping_refinement();

	/**
	 * Returns the meta object for class '{@link qvtoperational.MappingExtension <em>Mapping Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Extension</em>'.
	 * @see qvtoperational.MappingExtension
	 * @generated
	 */
	EClass getMappingExtension();

	/**
	 * Returns the meta object for the attribute '{@link qvtoperational.MappingExtension#getMapping_extension_key <em>Mapping extension key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping extension key</em>'.
	 * @see qvtoperational.MappingExtension#getMapping_extension_key()
	 * @see #getMappingExtension()
	 * @generated
	 */
	EAttribute getMappingExtension_Mapping_extension_key();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingExtension#getScoped_identifier_list <em>Scoped identifier list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier list</em>'.
	 * @see qvtoperational.MappingExtension#getScoped_identifier_list()
	 * @see #getMappingExtension()
	 * @generated
	 */
	EReference getMappingExtension_Scoped_identifier_list();

	/**
	 * Returns the meta object for class '{@link qvtoperational.MappingRefinement <em>Mapping Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Refinement</em>'.
	 * @see qvtoperational.MappingRefinement
	 * @generated
	 */
	EClass getMappingRefinement();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.MappingRefinement#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see qvtoperational.MappingRefinement#getScoped_identifier()
	 * @see #getMappingRefinement()
	 * @generated
	 */
	EReference getMappingRefinement_Scoped_identifier();

	/**
	 * Returns the meta object for class '{@link qvtoperational.PopulationSection <em>Population Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population Section</em>'.
	 * @see qvtoperational.PopulationSection
	 * @generated
	 */
	EClass getPopulationSection();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.PopulationSection#getExpression_list <em>Expression list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression list</em>'.
	 * @see qvtoperational.PopulationSection#getExpression_list()
	 * @see #getPopulationSection()
	 * @generated
	 */
	EReference getPopulationSection_Expression_list();

	/**
	 * Returns the meta object for the containment reference '{@link qvtoperational.PopulationSection#getExpression_block <em>Expression block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression block</em>'.
	 * @see qvtoperational.PopulationSection#getExpression_block()
	 * @see #getPopulationSection()
	 * @generated
	 */
	EReference getPopulationSection_Expression_block();

	/**
	 * Returns the meta object for class '{@link qvtoperational.ExpressionGO <em>Expression GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression GO</em>'.
	 * @see qvtoperational.ExpressionGO
	 * @generated
	 */
	EClass getExpressionGO();

	/**
	 * Returns the meta object for the attribute list '{@link qvtoperational.ExpressionGO#getDummyContent <em>Dummy Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dummy Content</em>'.
	 * @see qvtoperational.ExpressionGO#getDummyContent()
	 * @see #getExpressionGO()
	 * @generated
	 */
	EAttribute getExpressionGO_DummyContent();

	/**
	 * Returns the meta object for enum '{@link qvtoperational.DirectionKind <em>Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Kind</em>'.
	 * @see qvtoperational.DirectionKind
	 * @generated
	 */
	EEnum getDirectionKind();

	/**
	 * Returns the meta object for enum '{@link qvtoperational.ImportKind <em>Import Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Import Kind</em>'.
	 * @see qvtoperational.ImportKind
	 * @generated
	 */
	EEnum getImportKind();

	/**
	 * Returns the meta object for enum '{@link qvtoperational.GeneralQualifier <em>General Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>General Qualifier</em>'.
	 * @see qvtoperational.GeneralQualifier
	 * @generated
	 */
	EEnum getGeneralQualifier();

	/**
	 * Returns the meta object for enum '{@link qvtoperational.ModuleKind <em>Module Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Kind</em>'.
	 * @see qvtoperational.ModuleKind
	 * @generated
	 */
	EEnum getModuleKind();

	/**
	 * Returns the meta object for enum '{@link qvtoperational.ComplexTypeKey <em>Complex Type Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Complex Type Key</em>'.
	 * @see qvtoperational.ComplexTypeKey
	 * @generated
	 */
	EEnum getComplexTypeKey();

	/**
	 * Returns the meta object for enum '{@link qvtoperational.FeatureKey <em>Feature Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Key</em>'.
	 * @see qvtoperational.FeatureKey
	 * @generated
	 */
	EEnum getFeatureKey();

	/**
	 * Returns the meta object for enum '{@link qvtoperational.PropertyKey <em>Property Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Key</em>'.
	 * @see qvtoperational.PropertyKey
	 * @generated
	 */
	EEnum getPropertyKey();

	/**
	 * Returns the meta object for enum '{@link qvtoperational.HelperKind <em>Helper Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Helper Kind</em>'.
	 * @see qvtoperational.HelperKind
	 * @generated
	 */
	EEnum getHelperKind();

	/**
	 * Returns the meta object for enum '{@link qvtoperational.MappingExtensionKey <em>Mapping Extension Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mapping Extension Key</em>'.
	 * @see qvtoperational.MappingExtensionKey
	 * @generated
	 */
	EEnum getMappingExtensionKey();

	/**
	 * Returns the meta object for enum '{@link qvtoperational.CollectionKey <em>Collection Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Key</em>'.
	 * @see qvtoperational.CollectionKey
	 * @generated
	 */
	EEnum getCollectionKey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QvtoperationalFactory getQvtoperationalFactory();

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
		 * The meta object literal for the '{@link qvtoperational.impl.MappingBodyImpl <em>Mapping Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MappingBodyImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingBody()
		 * @generated
		 */
		EClass MAPPING_BODY = eINSTANCE.getMappingBody();

		/**
		 * The meta object literal for the '<em><b>Init Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_BODY__INIT_SECTION = eINSTANCE.getMappingBody_InitSection();

		/**
		 * The meta object literal for the '<em><b>End Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_BODY__END_SECTION = eINSTANCE.getMappingBody_EndSection();

		/**
		 * The meta object literal for the '<em><b>Population section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_BODY__POPULATION_SECTION = eINSTANCE.getMappingBody_Population_section();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.HelperImpl <em>Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.HelperImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getHelper()
		 * @generated
		 */
		EClass HELPER = eINSTANCE.getHelper();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER__IS_QUERY = eINSTANCE.getHelper_IsQuery();

		/**
		 * The meta object literal for the '<em><b>Helper header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER__HELPER_HEADER = eINSTANCE.getHelper_Helper_header();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER__EXPRESSION = eINSTANCE.getHelper_Expression();

		/**
		 * The meta object literal for the '<em><b>Expression block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER__EXPRESSION_BLOCK = eINSTANCE.getHelper_Expression_block();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ResolveExpImpl <em>Resolve Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ResolveExpImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getResolveExp()
		 * @generated
		 */
		EClass RESOLVE_EXP = eINSTANCE.getResolveExp();

		/**
		 * The meta object literal for the '<em><b>One</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_EXP__ONE = eINSTANCE.getResolveExp_One();

		/**
		 * The meta object literal for the '<em><b>Is Inverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_EXP__IS_INVERSE = eINSTANCE.getResolveExp_IsInverse();

		/**
		 * The meta object literal for the '<em><b>Is Deferred</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_EXP__IS_DEFERRED = eINSTANCE.getResolveExp_IsDeferred();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_EXP__TARGET = eINSTANCE.getResolveExp_Target();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_EXP__CONDITION = eINSTANCE.getResolveExp_Condition();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ResolveInExpImpl <em>Resolve In Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ResolveInExpImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getResolveInExp()
		 * @generated
		 */
		EClass RESOLVE_IN_EXP = eINSTANCE.getResolveInExp();

		/**
		 * The meta object literal for the '<em><b>In Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_IN_EXP__IN_MAPPING = eINSTANCE.getResolveInExp_InMapping();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.OperationalTransformationImpl <em>Operational Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.OperationalTransformationImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getOperationalTransformation()
		 * @generated
		 */
		EClass OPERATIONAL_TRANSFORMATION = eINSTANCE.getOperationalTransformation();

		/**
		 * The meta object literal for the '<em><b>Intermediate Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS = eINSTANCE.getOperationalTransformation_IntermediateClass();

		/**
		 * The meta object literal for the '<em><b>Refined</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__REFINED = eINSTANCE.getOperationalTransformation_Refined();

		/**
		 * The meta object literal for the '<em><b>Intermediate Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY = eINSTANCE.getOperationalTransformation_IntermediateProperty();

		/**
		 * The meta object literal for the '<em><b>Model Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER = eINSTANCE.getOperationalTransformation_ModelParameter();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__RELATION = eINSTANCE.getOperationalTransformation_Relation();

		/**
		 * The meta object literal for the '<em><b>Transformation h</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H = eINSTANCE.getOperationalTransformation_Transformation_h();

		/**
		 * The meta object literal for the '<em><b>Module element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT = eINSTANCE.getOperationalTransformation_Module_element();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MappingParameterImpl <em>Mapping Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MappingParameterImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingParameter()
		 * @generated
		 */
		EClass MAPPING_PARAMETER = eINSTANCE.getMappingParameter();

		/**
		 * The meta object literal for the '<em><b>Refined Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_PARAMETER__REFINED_DOMAIN = eINSTANCE.getMappingParameter_RefinedDomain();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_PARAMETER__EXTENT = eINSTANCE.getMappingParameter_Extent();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MappingOperationImpl <em>Mapping Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MappingOperationImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingOperation()
		 * @generated
		 */
		EClass MAPPING_OPERATION = eINSTANCE.getMappingOperation();

		/**
		 * The meta object literal for the '<em><b>Disjunct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__DISJUNCT = eINSTANCE.getMappingOperation_Disjunct();

		/**
		 * The meta object literal for the '<em><b>Refined Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__REFINED_RELATION = eINSTANCE.getMappingOperation_RefinedRelation();

		/**
		 * The meta object literal for the '<em><b>Merged</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__MERGED = eINSTANCE.getMappingOperation_Merged();

		/**
		 * The meta object literal for the '<em><b>Inherited</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__INHERITED = eINSTANCE.getMappingOperation_Inherited();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__WHEN = eINSTANCE.getMappingOperation_When();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__WHERE = eINSTANCE.getMappingOperation_Where();

		/**
		 * The meta object literal for the '<em><b>Mapping full header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__MAPPING_FULL_HEADER = eINSTANCE.getMappingOperation_Mapping_full_header();

		/**
		 * The meta object literal for the '<em><b>Mapping body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__MAPPING_BODY = eINSTANCE.getMappingOperation_Mapping_body();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MappingCallExpImpl <em>Mapping Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MappingCallExpImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingCallExp()
		 * @generated
		 */
		EClass MAPPING_CALL_EXP = eINSTANCE.getMappingCallExp();

		/**
		 * The meta object literal for the '<em><b>Is Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_CALL_EXP__IS_STRICT = eINSTANCE.getMappingCallExp_IsStrict();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ConstructorImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em><b>Constructor header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR__CONSTRUCTOR_HEADER = eINSTANCE.getConstructor_Constructor_header();

		/**
		 * The meta object literal for the '<em><b>Expression block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR__EXPRESSION_BLOCK = eINSTANCE.getConstructor_Expression_block();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ContextualPropertyImpl <em>Contextual Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ContextualPropertyImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getContextualProperty()
		 * @generated
		 */
		EClass CONTEXTUAL_PROPERTY = eINSTANCE.getContextualProperty();

		/**
		 * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_PROPERTY__INIT_EXPRESSION = eINSTANCE.getContextualProperty_InitExpression();

		/**
		 * The meta object literal for the '<em><b>Property key</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXTUAL_PROPERTY__PROPERTY_KEY = eINSTANCE.getContextualProperty_Property_key();

		/**
		 * The meta object literal for the '<em><b>Declarator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_PROPERTY__DECLARATOR = eINSTANCE.getContextualProperty_Declarator();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.EntryOperationImpl <em>Entry Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.EntryOperationImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getEntryOperation()
		 * @generated
		 */
		EClass ENTRY_OPERATION = eINSTANCE.getEntryOperation();

		/**
		 * The meta object literal for the '<em><b>Entry header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_OPERATION__ENTRY_HEADER = eINSTANCE.getEntryOperation_Entry_header();

		/**
		 * The meta object literal for the '<em><b>Expression block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_OPERATION__EXPRESSION_BLOCK = eINSTANCE.getEntryOperation_Expression_block();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ImperativeCallExpImpl <em>Imperative Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ImperativeCallExpImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getImperativeCallExp()
		 * @generated
		 */
		EClass IMPERATIVE_CALL_EXP = eINSTANCE.getImperativeCallExp();

		/**
		 * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPERATIVE_CALL_EXP__IS_VIRTUAL = eINSTANCE.getImperativeCallExp_IsVirtual();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ImperativeOperationImpl <em>Imperative Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ImperativeOperationImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getImperativeOperation()
		 * @generated
		 */
		EClass IMPERATIVE_OPERATION = eINSTANCE.getImperativeOperation();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__CONTEXT = eINSTANCE.getImperativeOperation_Context();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__RESULT = eINSTANCE.getImperativeOperation_Result();

		/**
		 * The meta object literal for the '<em><b>Overridden</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__OVERRIDDEN = eINSTANCE.getImperativeOperation_Overridden();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__BODY = eINSTANCE.getImperativeOperation_Body();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.LibraryImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Library h</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__LIBRARY_H = eINSTANCE.getLibrary_Library_h();

		/**
		 * The meta object literal for the '<em><b>Module element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__MODULE_ELEMENT = eINSTANCE.getLibrary_Module_element();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ModelParameterImpl <em>Model Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ModelParameterImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModelParameter()
		 * @generated
		 */
		EClass MODEL_PARAMETER = eINSTANCE.getModelParameter();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ModelTypeImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__METAMODEL = eINSTANCE.getModelType_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Additional Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__ADDITIONAL_CONDITION = eINSTANCE.getModelType_AdditionalCondition();

		/**
		 * The meta object literal for the '<em><b>Conformance Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__CONFORMANCE_KIND = eINSTANCE.getModelType_ConformanceKind();

		/**
		 * The meta object literal for the '<em><b>Compliance kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__COMPLIANCE_KIND = eINSTANCE.getModelType_Compliance_kind();

		/**
		 * The meta object literal for the '<em><b>Packageref list</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__PACKAGEREF_LIST = eINSTANCE.getModelType_Packageref_list();

		/**
		 * The meta object literal for the '<em><b>Modeltype where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__MODELTYPE_WHERE = eINSTANCE.getModelType_Modeltype_where();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ModuleImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Owned Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OWNED_TAG = eINSTANCE.getModule_OwnedTag();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ENTRY = eINSTANCE.getModule_Entry();

		/**
		 * The meta object literal for the '<em><b>Config Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CONFIG_PROPERTY = eINSTANCE.getModule_ConfigProperty();

		/**
		 * The meta object literal for the '<em><b>Module Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULE_IMPORT = eINSTANCE.getModule_ModuleImport();

		/**
		 * The meta object literal for the '<em><b>Used Model Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__USED_MODEL_TYPE = eINSTANCE.getModule_UsedModelType();

		/**
		 * The meta object literal for the '<em><b>Is Blackbox</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__IS_BLACKBOX = eINSTANCE.getModule_IsBlackbox();

		/**
		 * The meta object literal for the '<em><b>Owned Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OWNED_VARIABLE = eINSTANCE.getModule_OwnedVariable();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ModuleImportImpl <em>Module Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ModuleImportImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModuleImport()
		 * @generated
		 */
		EClass MODULE_IMPORT = eINSTANCE.getModuleImport();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPORT__BINDING = eINSTANCE.getModuleImport_Binding();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPORT__MODULE = eINSTANCE.getModuleImport_Module();

		/**
		 * The meta object literal for the '<em><b>Imported Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPORT__IMPORTED_MODULE = eINSTANCE.getModuleImport_ImportedModule();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_IMPORT__KIND = eINSTANCE.getModuleImport_Kind();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPORT__UNIT = eINSTANCE.getModuleImport_Unit();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_IMPORT__IDENTIFIER = eINSTANCE.getModuleImport_Identifier();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.VarParameterImpl <em>Var Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.VarParameterImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getVarParameter()
		 * @generated
		 */
		EClass VAR_PARAMETER = eINSTANCE.getVarParameter();

		/**
		 * The meta object literal for the '<em><b>Ctx Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_PARAMETER__CTX_OWNER = eINSTANCE.getVarParameter_CtxOwner();

		/**
		 * The meta object literal for the '<em><b>Res Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_PARAMETER__RES_OWNER = eINSTANCE.getVarParameter_ResOwner();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_PARAMETER__KIND = eINSTANCE.getVarParameter_Kind();

		/**
		 * The meta object literal for the '<em><b>Declarator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_PARAMETER__DECLARATOR = eINSTANCE.getVarParameter_Declarator();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.OperationBodyImpl <em>Operation Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.OperationBodyImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getOperationBody()
		 * @generated
		 */
		EClass OPERATION_BODY = eINSTANCE.getOperationBody();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BODY__OPERATION = eINSTANCE.getOperationBody_Operation();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BODY__CONTENT = eINSTANCE.getOperationBody_Content();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BODY__VARIABLE = eINSTANCE.getOperationBody_Variable();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ConstructorBodyImpl <em>Constructor Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ConstructorBodyImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getConstructorBody()
		 * @generated
		 */
		EClass CONSTRUCTOR_BODY = eINSTANCE.getConstructorBody();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ObjectExpImpl <em>Object Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ObjectExpImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getObjectExp()
		 * @generated
		 */
		EClass OBJECT_EXP = eINSTANCE.getObjectExp();

		/**
		 * The meta object literal for the '<em><b>Referred Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXP__REFERRED_OBJECT = eINSTANCE.getObjectExp_ReferredObject();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXP__BODY = eINSTANCE.getObjectExp_Body();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.TopLevelGOImpl <em>Top Level GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.TopLevelGOImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTopLevelGO()
		 * @generated
		 */
		EClass TOP_LEVEL_GO = eINSTANCE.getTopLevelGO();

		/**
		 * The meta object literal for the '<em><b>Unit element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_LEVEL_GO__UNIT_ELEMENT = eINSTANCE.getTopLevelGO_Unit_element();

		/**
		 * The meta object literal for the '<em><b>Moduleimport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_LEVEL_GO__MODULEIMPORT = eINSTANCE.getTopLevelGO_Moduleimport();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.UnitRefGOImpl <em>Unit Ref GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.UnitRefGOImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getUnitRefGO()
		 * @generated
		 */
		EClass UNIT_REF_GO = eINSTANCE.getUnitRefGO();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_REF_GO__IDENTIFIER = eINSTANCE.getUnitRefGO_Identifier();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.TagGOImpl <em>Tag GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.TagGOImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTagGO()
		 * @generated
		 */
		EClass TAG_GO = eINSTANCE.getTagGO();

		/**
		 * The meta object literal for the '<em><b>Tagid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_GO__TAGID = eINSTANCE.getTagGO_Tagid();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_GO__SCOPED_IDENTIFIER = eINSTANCE.getTagGO_Scoped_identifier();

		/**
		 * The meta object literal for the '<em><b>Tagvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_GO__TAGVALUE = eINSTANCE.getTagGO_Tagvalue();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MetaModelGOImpl <em>Meta Model GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MetaModelGOImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMetaModelGO()
		 * @generated
		 */
		EClass META_MODEL_GO = eINSTANCE.getMetaModelGO();

		/**
		 * The meta object literal for the '<em><b>Metamodel h</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_GO__METAMODEL_H = eINSTANCE.getMetaModelGO_Metamodel_h();

		/**
		 * The meta object literal for the '<em><b>Metamodel element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_GO__METAMODEL_ELEMENT = eINSTANCE.getMetaModelGO_Metamodel_element();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.AccessDeclImpl <em>Access Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.AccessDeclImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getAccessDecl()
		 * @generated
		 */
		EClass ACCESS_DECL = eINSTANCE.getAccessDecl();

		/**
		 * The meta object literal for the '<em><b>Access usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_DECL__ACCESS_USAGE = eINSTANCE.getAccessDecl_Access_usage();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.TypeDefImpl <em>Type Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.TypeDefImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTypeDef()
		 * @generated
		 */
		EClass TYPE_DEF = eINSTANCE.getTypeDef();

		/**
		 * The meta object literal for the '<em><b>Typespec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEF__TYPESPEC = eINSTANCE.getTypeDef_Typespec();

		/**
		 * The meta object literal for the '<em><b>Typedef condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEF__TYPEDEF_CONDITION = eINSTANCE.getTypeDef_Typedef_condition();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.TransformationHeaderImpl <em>Transformation Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.TransformationHeaderImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTransformationHeader()
		 * @generated
		 */
		EClass TRANSFORMATION_HEADER = eINSTANCE.getTransformationHeader();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_HEADER__QUALIFIER = eINSTANCE.getTransformationHeader_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_HEADER__NAME = eINSTANCE.getTransformationHeader_Name();

		/**
		 * The meta object literal for the '<em><b>Transformation signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE = eINSTANCE.getTransformationHeader_Transformation_signature();

		/**
		 * The meta object literal for the '<em><b>Transformation usage refine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE = eINSTANCE.getTransformationHeader_Transformation_usage_refine();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.SimpleSignatureImpl <em>Simple Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.SimpleSignatureImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getSimpleSignature()
		 * @generated
		 */
		EClass SIMPLE_SIGNATURE = eINSTANCE.getSimpleSignature();

		/**
		 * The meta object literal for the '<em><b>Param list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SIGNATURE__PARAM_LIST = eINSTANCE.getSimpleSignature_Param_list();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.TransformationUsageRefineImpl <em>Transformation Usage Refine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.TransformationUsageRefineImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTransformationUsageRefine()
		 * @generated
		 */
		EClass TRANSFORMATION_USAGE_REFINE = eINSTANCE.getTransformationUsageRefine();

		/**
		 * The meta object literal for the '<em><b>Module usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_USAGE_REFINE__MODULE_USAGE = eINSTANCE.getTransformationUsageRefine_Module_usage();

		/**
		 * The meta object literal for the '<em><b>Transformation refine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE = eINSTANCE.getTransformationUsageRefine_Transformation_refine();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ModuleRefGOImpl <em>Module Ref GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ModuleRefGOImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModuleRefGO()
		 * @generated
		 */
		EClass MODULE_REF_GO = eINSTANCE.getModuleRefGO();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_REF_GO__SCOPED_IDENTIFIER = eINSTANCE.getModuleRefGO_Scoped_identifier();

		/**
		 * The meta object literal for the '<em><b>Simple signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_REF_GO__SIMPLE_SIGNATURE = eINSTANCE.getModuleRefGO_Simple_signature();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ModuleUsageGOImpl <em>Module Usage GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ModuleUsageGOImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModuleUsageGO()
		 * @generated
		 */
		EClass MODULE_USAGE_GO = eINSTANCE.getModuleUsageGO();

		/**
		 * The meta object literal for the '<em><b>Access usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_USAGE_GO__ACCESS_USAGE = eINSTANCE.getModuleUsageGO_Access_usage();

		/**
		 * The meta object literal for the '<em><b>Extends usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_USAGE_GO__EXTENDS_USAGE = eINSTANCE.getModuleUsageGO_Extends_usage();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.LibraryHeaderImpl <em>Library Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.LibraryHeaderImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getLibraryHeader()
		 * @generated
		 */
		EClass LIBRARY_HEADER = eINSTANCE.getLibraryHeader();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY_HEADER__NAME = eINSTANCE.getLibraryHeader_Name();

		/**
		 * The meta object literal for the '<em><b>Library signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_HEADER__LIBRARY_SIGNATURE = eINSTANCE.getLibraryHeader_Library_signature();

		/**
		 * The meta object literal for the '<em><b>Module usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_HEADER__MODULE_USAGE = eINSTANCE.getLibraryHeader_Module_usage();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.AccessUsageImpl <em>Access Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.AccessUsageImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getAccessUsage()
		 * @generated
		 */
		EClass ACCESS_USAGE = eINSTANCE.getAccessUsage();

		/**
		 * The meta object literal for the '<em><b>Module kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_USAGE__MODULE_KIND = eINSTANCE.getAccessUsage_Module_kind();

		/**
		 * The meta object literal for the '<em><b>Moduleref list</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_USAGE__MODULEREF_LIST = eINSTANCE.getAccessUsage_Moduleref_list();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ExtendsUsageImpl <em>Extends Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ExtendsUsageImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getExtendsUsage()
		 * @generated
		 */
		EClass EXTENDS_USAGE = eINSTANCE.getExtendsUsage();

		/**
		 * The meta object literal for the '<em><b>Module kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDS_USAGE__MODULE_KIND = eINSTANCE.getExtendsUsage_Module_kind();

		/**
		 * The meta object literal for the '<em><b>Moduleref list</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS_USAGE__MODULEREF_LIST = eINSTANCE.getExtendsUsage_Moduleref_list();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ScopedIdentifierImpl <em>Scoped Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ScopedIdentifierImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getScopedIdentifier()
		 * @generated
		 */
		EClass SCOPED_IDENTIFIER = eINSTANCE.getScopedIdentifier();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPED_IDENTIFIER__IDENTIFIER = eINSTANCE.getScopedIdentifier_Identifier();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ParamListImpl <em>Param List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ParamListImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getParamList()
		 * @generated
		 */
		EClass PARAM_LIST = eINSTANCE.getParamList();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_LIST__PARAM = eINSTANCE.getParamList_Param();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ClassifierGOImpl <em>Classifier GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ClassifierGOImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierGO()
		 * @generated
		 */
		EClass CLASSIFIER_GO = eINSTANCE.getClassifierGO();

		/**
		 * The meta object literal for the '<em><b>Classifier h</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_GO__CLASSIFIER_H = eINSTANCE.getClassifierGO_Classifier_h();

		/**
		 * The meta object literal for the '<em><b>Classifier feature list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST = eINSTANCE.getClassifierGO_Classifier_feature_list();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.DeclaratorImpl <em>Declarator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.DeclaratorImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getDeclarator()
		 * @generated
		 */
		EClass DECLARATOR = eINSTANCE.getDeclarator();

		/**
		 * The meta object literal for the '<em><b>Typespec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATOR__TYPESPEC = eINSTANCE.getDeclarator_Typespec();

		/**
		 * The meta object literal for the '<em><b>Init part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATOR__INIT_PART = eINSTANCE.getDeclarator_Init_part();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATOR__SCOPED_IDENTIFIER = eINSTANCE.getDeclarator_Scoped_identifier();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.TypeSpecImpl <em>Type Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.TypeSpecImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTypeSpec()
		 * @generated
		 */
		EClass TYPE_SPEC = eINSTANCE.getTypeSpec();

		/**
		 * The meta object literal for the '<em><b>Type reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SPEC__TYPE_REFERENCE = eINSTANCE.getTypeSpec_Type_reference();

		/**
		 * The meta object literal for the '<em><b>Extent location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPEC__EXTENT_LOCATION = eINSTANCE.getTypeSpec_Extent_location();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.TypeReferenceImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE__SCOPED_IDENTIFIER = eINSTANCE.getTypeReference_Scoped_identifier();

		/**
		 * The meta object literal for the '<em><b>Complex type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE__COMPLEX_TYPE = eINSTANCE.getTypeReference_Complex_type();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ComplexTypeImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Complex type key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__COMPLEX_TYPE_KEY = eINSTANCE.getComplexType_Complex_type_key();

		/**
		 * The meta object literal for the '<em><b>Collection key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__COLLECTION_KEY = eINSTANCE.getComplexType_Collection_key();

		/**
		 * The meta object literal for the '<em><b>Typespec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__TYPESPEC = eINSTANCE.getComplexType_Typespec();

		/**
		 * The meta object literal for the '<em><b>Declarator list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__DECLARATOR_LIST = eINSTANCE.getComplexType_Declarator_list();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.DeclaratorListImpl <em>Declarator List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.DeclaratorListImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getDeclaratorList()
		 * @generated
		 */
		EClass DECLARATOR_LIST = eINSTANCE.getDeclaratorList();

		/**
		 * The meta object literal for the '<em><b>Declarator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATOR_LIST__DECLARATOR = eINSTANCE.getDeclaratorList_Declarator();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.InitPartImpl <em>Init Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.InitPartImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getInitPart()
		 * @generated
		 */
		EClass INIT_PART = eINSTANCE.getInitPart();

		/**
		 * The meta object literal for the '<em><b>Init op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_PART__INIT_OP = eINSTANCE.getInitPart_Init_op();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_PART__EXPRESSION = eINSTANCE.getInitPart_Expression();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ExpressionSemiListImpl <em>Expression Semi List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ExpressionSemiListImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getExpressionSemiList()
		 * @generated
		 */
		EClass EXPRESSION_SEMI_LIST = eINSTANCE.getExpressionSemiList();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_SEMI_LIST__EXPRESSION = eINSTANCE.getExpressionSemiList_Expression();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ExpressionListImpl <em>Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ExpressionListImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getExpressionList()
		 * @generated
		 */
		EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

		/**
		 * The meta object literal for the '<em><b>Expression semi list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LIST__EXPRESSION_SEMI_LIST = eINSTANCE.getExpressionList_Expression_semi_list();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ExpressionBlockImpl <em>Expression Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ExpressionBlockImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getExpressionBlock()
		 * @generated
		 */
		EClass EXPRESSION_BLOCK = eINSTANCE.getExpressionBlock();

		/**
		 * The meta object literal for the '<em><b>Expression list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_BLOCK__EXPRESSION_LIST = eINSTANCE.getExpressionBlock_Expression_list();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.PackageRefGOImpl <em>Package Ref GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.PackageRefGOImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getPackageRefGO()
		 * @generated
		 */
		EClass PACKAGE_REF_GO = eINSTANCE.getPackageRefGO();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_REF_GO__SCOPED_IDENTIFIER = eINSTANCE.getPackageRefGO_Scoped_identifier();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REF_GO__URI = eINSTANCE.getPackageRefGO_Uri();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MetaModelHeaderImpl <em>Meta Model Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MetaModelHeaderImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMetaModelHeader()
		 * @generated
		 */
		EClass META_MODEL_HEADER = eINSTANCE.getMetaModelHeader();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_HEADER__SCOPED_IDENTIFIER = eINSTANCE.getMetaModelHeader_Scoped_identifier();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MetaModelElementImpl <em>Meta Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MetaModelElementImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMetaModelElement()
		 * @generated
		 */
		EClass META_MODEL_ELEMENT = eINSTANCE.getMetaModelElement();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ELEMENT__CLASSIFIER = eINSTANCE.getMetaModelElement_Classifier();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ELEMENT__ENUMERATION = eINSTANCE.getMetaModelElement_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ELEMENT__TAG = eINSTANCE.getMetaModelElement_Tag();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.EnumerationGOImpl <em>Enumeration GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.EnumerationGOImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getEnumerationGO()
		 * @generated
		 */
		EClass ENUMERATION_GO = eINSTANCE.getEnumerationGO();

		/**
		 * The meta object literal for the '<em><b>Enumeration h</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_GO__ENUMERATION_H = eINSTANCE.getEnumerationGO_Enumeration_h();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_GO__IDENTIFIER = eINSTANCE.getEnumerationGO_Identifier();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ClassifierHeaderImpl <em>Classifier Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ClassifierHeaderImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierHeader()
		 * @generated
		 */
		EClass CLASSIFIER_HEADER = eINSTANCE.getClassifierHeader();

		/**
		 * The meta object literal for the '<em><b>Classifier info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_HEADER__CLASSIFIER_INFO = eINSTANCE.getClassifierHeader_Classifier_info();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_HEADER__SCOPED_IDENTIFIER = eINSTANCE.getClassifierHeader_Scoped_identifier();

		/**
		 * The meta object literal for the '<em><b>Classifier extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_HEADER__CLASSIFIER_EXTENSION = eINSTANCE.getClassifierHeader_Classifier_extension();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ClassifierFeatureListImpl <em>Classifier Feature List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ClassifierFeatureListImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierFeatureList()
		 * @generated
		 */
		EClass CLASSIFIER_FEATURE_LIST = eINSTANCE.getClassifierFeatureList();

		/**
		 * The meta object literal for the '<em><b>Classifier feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_FEATURE_LIST__CLASSIFIER_FEATURE = eINSTANCE.getClassifierFeatureList_Classifier_feature();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ClassifierInfoImpl <em>Classifier Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ClassifierInfoImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierInfo()
		 * @generated
		 */
		EClass CLASSIFIER_INFO = eINSTANCE.getClassifierInfo();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_INFO__QUALIFIER = eINSTANCE.getClassifierInfo_Qualifier();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ClassifierExtensionImpl <em>Classifier Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ClassifierExtensionImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierExtension()
		 * @generated
		 */
		EClass CLASSIFIER_EXTENSION = eINSTANCE.getClassifierExtension();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST = eINSTANCE.getClassifierExtension_Scoped_identifier_list();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ScopedIdentifierListImpl <em>Scoped Identifier List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ScopedIdentifierListImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getScopedIdentifierList()
		 * @generated
		 */
		EClass SCOPED_IDENTIFIER_LIST = eINSTANCE.getScopedIdentifierList();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier list</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPED_IDENTIFIER_LIST__SCOPED_IDENTIFIER_LIST = eINSTANCE.getScopedIdentifierList_Scoped_identifier_list();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ClassifierFeatureImpl <em>Classifier Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ClassifierFeatureImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getClassifierFeature()
		 * @generated
		 */
		EClass CLASSIFIER_FEATURE = eINSTANCE.getClassifierFeature();

		/**
		 * The meta object literal for the '<em><b>Feature qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_FEATURE__FEATURE_QUALIFIER = eINSTANCE.getClassifierFeature_Feature_qualifier();

		/**
		 * The meta object literal for the '<em><b>Declarator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_FEATURE__DECLARATOR = eINSTANCE.getClassifierFeature_Declarator();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_FEATURE__MULTIPLICITY = eINSTANCE.getClassifierFeature_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Opposite property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_FEATURE__OPPOSITE_PROPERTY = eINSTANCE.getClassifierFeature_Opposite_property();

		/**
		 * The meta object literal for the '<em><b>Complete signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_FEATURE__COMPLETE_SIGNATURE = eINSTANCE.getClassifierFeature_Complete_signature();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_FEATURE__TAG = eINSTANCE.getClassifierFeature_Tag();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MultiplicityImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMultiplicity()
		 * @generated
		 */
		EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Multiplicity range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY__MULTIPLICITY_RANGE = eINSTANCE.getMultiplicity_Multiplicity_range();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.OppositePropertyImpl <em>Opposite Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.OppositePropertyImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getOppositeProperty()
		 * @generated
		 */
		EClass OPPOSITE_PROPERTY = eINSTANCE.getOppositeProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPPOSITE_PROPERTY__NAME = eINSTANCE.getOppositeProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPPOSITE_PROPERTY__MULTIPLICITY = eINSTANCE.getOppositeProperty_Multiplicity();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.StereotypeQualifierImpl <em>Stereotype Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.StereotypeQualifierImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getStereotypeQualifier()
		 * @generated
		 */
		EClass STEREOTYPE_QUALIFIER = eINSTANCE.getStereotypeQualifier();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEREOTYPE_QUALIFIER__IDENTIFIER = eINSTANCE.getStereotypeQualifier_Identifier();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.FeatureQualifierImpl <em>Feature Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.FeatureQualifierImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getFeatureQualifier()
		 * @generated
		 */
		EClass FEATURE_QUALIFIER = eINSTANCE.getFeatureQualifier();

		/**
		 * The meta object literal for the '<em><b>Stereotype qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER = eINSTANCE.getFeatureQualifier_Stereotype_qualifier();

		/**
		 * The meta object literal for the '<em><b>Feature key</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_QUALIFIER__FEATURE_KEY = eINSTANCE.getFeatureQualifier_Feature_key();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.CompleteSignatureImpl <em>Complete Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.CompleteSignatureImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getCompleteSignature()
		 * @generated
		 */
		EClass COMPLETE_SIGNATURE = eINSTANCE.getCompleteSignature();

		/**
		 * The meta object literal for the '<em><b>Simple signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_SIGNATURE__SIMPLE_SIGNATURE = eINSTANCE.getCompleteSignature_Simple_signature();

		/**
		 * The meta object literal for the '<em><b>Param list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_SIGNATURE__PARAM_LIST = eINSTANCE.getCompleteSignature_Param_list();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.EnumerationHeaderImpl <em>Enumeration Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.EnumerationHeaderImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getEnumerationHeader()
		 * @generated
		 */
		EClass ENUMERATION_HEADER = eINSTANCE.getEnumerationHeader();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_HEADER__IDENTIFIER = eINSTANCE.getEnumerationHeader_Identifier();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.HelperInfoImpl <em>Helper Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.HelperInfoImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getHelperInfo()
		 * @generated
		 */
		EClass HELPER_INFO = eINSTANCE.getHelperInfo();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_INFO__QUALIFIER = eINSTANCE.getHelperInfo_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Helper kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_INFO__HELPER_KIND = eINSTANCE.getHelperInfo_Helper_kind();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.HelperHeaderImpl <em>Helper Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.HelperHeaderImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getHelperHeader()
		 * @generated
		 */
		EClass HELPER_HEADER = eINSTANCE.getHelperHeader();

		/**
		 * The meta object literal for the '<em><b>Helper info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_HEADER__HELPER_INFO = eINSTANCE.getHelperHeader_Helper_info();

		/**
		 * The meta object literal for the '<em><b>Scope identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_HEADER__SCOPE_IDENTIFIER = eINSTANCE.getHelperHeader_Scope_identifier();

		/**
		 * The meta object literal for the '<em><b>Complete signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_HEADER__COMPLETE_SIGNATURE = eINSTANCE.getHelperHeader_Complete_signature();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ConstructorHeaderImpl <em>Constructor Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ConstructorHeaderImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getConstructorHeader()
		 * @generated
		 */
		EClass CONSTRUCTOR_HEADER = eINSTANCE.getConstructorHeader();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_HEADER__QUALIFIER = eINSTANCE.getConstructorHeader_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER = eINSTANCE.getConstructorHeader_Scoped_identifier();

		/**
		 * The meta object literal for the '<em><b>Simple signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE = eINSTANCE.getConstructorHeader_Simple_signature();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.EntryHeaderImpl <em>Entry Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.EntryHeaderImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getEntryHeader()
		 * @generated
		 */
		EClass ENTRY_HEADER = eINSTANCE.getEntryHeader();

		/**
		 * The meta object literal for the '<em><b>Simple signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_HEADER__SIMPLE_SIGNATURE = eINSTANCE.getEntryHeader_Simple_signature();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MappingHeaderImpl <em>Mapping Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MappingHeaderImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingHeader()
		 * @generated
		 */
		EClass MAPPING_HEADER = eINSTANCE.getMappingHeader();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_HEADER__QUALIFIER = eINSTANCE.getMappingHeader_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Param direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_HEADER__PARAM_DIRECTION = eINSTANCE.getMappingHeader_Param_direction();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_HEADER__SCOPED_IDENTIFIER = eINSTANCE.getMappingHeader_Scoped_identifier();

		/**
		 * The meta object literal for the '<em><b>Complete signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_HEADER__COMPLETE_SIGNATURE = eINSTANCE.getMappingHeader_Complete_signature();

		/**
		 * The meta object literal for the '<em><b>Mapping extra</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_HEADER__MAPPING_EXTRA = eINSTANCE.getMappingHeader_Mapping_extra();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MappingFullHeaderImpl <em>Mapping Full Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MappingFullHeaderImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingFullHeader()
		 * @generated
		 */
		EClass MAPPING_FULL_HEADER = eINSTANCE.getMappingFullHeader();

		/**
		 * The meta object literal for the '<em><b>Mapping header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_FULL_HEADER__MAPPING_HEADER = eINSTANCE.getMappingFullHeader_Mapping_header();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_FULL_HEADER__WHEN = eINSTANCE.getMappingFullHeader_When();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_FULL_HEADER__WHERE = eINSTANCE.getMappingFullHeader_Where();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MappingExtraImpl <em>Mapping Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MappingExtraImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingExtra()
		 * @generated
		 */
		EClass MAPPING_EXTRA = eINSTANCE.getMappingExtra();

		/**
		 * The meta object literal for the '<em><b>Mapping extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_EXTRA__MAPPING_EXTENSION = eINSTANCE.getMappingExtra_Mapping_extension();

		/**
		 * The meta object literal for the '<em><b>Mapping refinement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_EXTRA__MAPPING_REFINEMENT = eINSTANCE.getMappingExtra_Mapping_refinement();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MappingExtensionImpl <em>Mapping Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MappingExtensionImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingExtension()
		 * @generated
		 */
		EClass MAPPING_EXTENSION = eINSTANCE.getMappingExtension();

		/**
		 * The meta object literal for the '<em><b>Mapping extension key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_EXTENSION__MAPPING_EXTENSION_KEY = eINSTANCE.getMappingExtension_Mapping_extension_key();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST = eINSTANCE.getMappingExtension_Scoped_identifier_list();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.MappingRefinementImpl <em>Mapping Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.MappingRefinementImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingRefinement()
		 * @generated
		 */
		EClass MAPPING_REFINEMENT = eINSTANCE.getMappingRefinement();

		/**
		 * The meta object literal for the '<em><b>Scoped identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_REFINEMENT__SCOPED_IDENTIFIER = eINSTANCE.getMappingRefinement_Scoped_identifier();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.PopulationSectionImpl <em>Population Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.PopulationSectionImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getPopulationSection()
		 * @generated
		 */
		EClass POPULATION_SECTION = eINSTANCE.getPopulationSection();

		/**
		 * The meta object literal for the '<em><b>Expression list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION_SECTION__EXPRESSION_LIST = eINSTANCE.getPopulationSection_Expression_list();

		/**
		 * The meta object literal for the '<em><b>Expression block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION_SECTION__EXPRESSION_BLOCK = eINSTANCE.getPopulationSection_Expression_block();

		/**
		 * The meta object literal for the '{@link qvtoperational.impl.ExpressionGOImpl <em>Expression GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.impl.ExpressionGOImpl
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getExpressionGO()
		 * @generated
		 */
		EClass EXPRESSION_GO = eINSTANCE.getExpressionGO();

		/**
		 * The meta object literal for the '<em><b>Dummy Content</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_GO__DUMMY_CONTENT = eINSTANCE.getExpressionGO_DummyContent();

		/**
		 * The meta object literal for the '{@link qvtoperational.DirectionKind <em>Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.DirectionKind
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getDirectionKind()
		 * @generated
		 */
		EEnum DIRECTION_KIND = eINSTANCE.getDirectionKind();

		/**
		 * The meta object literal for the '{@link qvtoperational.ImportKind <em>Import Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.ImportKind
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getImportKind()
		 * @generated
		 */
		EEnum IMPORT_KIND = eINSTANCE.getImportKind();

		/**
		 * The meta object literal for the '{@link qvtoperational.GeneralQualifier <em>General Qualifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.GeneralQualifier
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getGeneralQualifier()
		 * @generated
		 */
		EEnum GENERAL_QUALIFIER = eINSTANCE.getGeneralQualifier();

		/**
		 * The meta object literal for the '{@link qvtoperational.ModuleKind <em>Module Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.ModuleKind
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getModuleKind()
		 * @generated
		 */
		EEnum MODULE_KIND = eINSTANCE.getModuleKind();

		/**
		 * The meta object literal for the '{@link qvtoperational.ComplexTypeKey <em>Complex Type Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.ComplexTypeKey
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getComplexTypeKey()
		 * @generated
		 */
		EEnum COMPLEX_TYPE_KEY = eINSTANCE.getComplexTypeKey();

		/**
		 * The meta object literal for the '{@link qvtoperational.FeatureKey <em>Feature Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.FeatureKey
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getFeatureKey()
		 * @generated
		 */
		EEnum FEATURE_KEY = eINSTANCE.getFeatureKey();

		/**
		 * The meta object literal for the '{@link qvtoperational.PropertyKey <em>Property Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.PropertyKey
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getPropertyKey()
		 * @generated
		 */
		EEnum PROPERTY_KEY = eINSTANCE.getPropertyKey();

		/**
		 * The meta object literal for the '{@link qvtoperational.HelperKind <em>Helper Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.HelperKind
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getHelperKind()
		 * @generated
		 */
		EEnum HELPER_KIND = eINSTANCE.getHelperKind();

		/**
		 * The meta object literal for the '{@link qvtoperational.MappingExtensionKey <em>Mapping Extension Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.MappingExtensionKey
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getMappingExtensionKey()
		 * @generated
		 */
		EEnum MAPPING_EXTENSION_KEY = eINSTANCE.getMappingExtensionKey();

		/**
		 * The meta object literal for the '{@link qvtoperational.CollectionKey <em>Collection Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvtoperational.CollectionKey
		 * @see qvtoperational.impl.QvtoperationalPackageImpl#getCollectionKey()
		 * @generated
		 */
		EEnum COLLECTION_KEY = eINSTANCE.getCollectionKey();

	}

} //QvtoperationalPackage
