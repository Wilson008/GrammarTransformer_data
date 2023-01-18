/**
 */
package QVTOperational;

import EMOF.EMOFPackage;
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
 * @see QVTOperational.QVTOperationalFactory
 * @model kind="package"
 * @generated
 */
public interface QVTOperationalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QVTOperational";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/QVT/1.2/qvtoperational";

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
	QVTOperationalPackage eINSTANCE = QVTOperational.impl.QVTOperationalPackageImpl.init();

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ImperativeOperationImpl <em>Imperative Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ImperativeOperationImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getImperativeOperation()
	 * @generated
	 */
	int IMPERATIVE_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__OWNED_COMMENT = EMOFPackage.OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__NAME = EMOFPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__TYPE = EMOFPackage.OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__IS_ORDERED = EMOFPackage.OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__IS_UNIQUE = EMOFPackage.OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__LOWER = EMOFPackage.OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__UPPER = EMOFPackage.OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__CLASS = EMOFPackage.OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__OWNED_PARAMETER = EMOFPackage.OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__RAISED_EXCEPTION = EMOFPackage.OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__BODY = EMOFPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__CONTEXT = EMOFPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__IS_BLACKBOX = EMOFPackage.OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__OVERRIDDEN = EMOFPackage.OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__RESULT = EMOFPackage.OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Imperative Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_FEATURE_COUNT = EMOFPackage.OPERATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION___CONTAINER = EMOFPackage.OPERATION___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION___EQUALS__OBJECT = EMOFPackage.OPERATION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION___GET__PROPERTY = EMOFPackage.OPERATION___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION___GET_META_CLASS = EMOFPackage.OPERATION___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION___IS_SET__PROPERTY = EMOFPackage.OPERATION___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION___SET__PROPERTY_OBJECT = EMOFPackage.OPERATION___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION___UNSET__PROPERTY = EMOFPackage.OPERATION___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Imperative Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_OPERATION_COUNT = EMOFPackage.OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ConstructorImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 0;

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
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__IS_BLACKBOX = IMPERATIVE_OPERATION__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NESTED_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NESTING_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OWNED_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__URI = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CONFIG_PROPERTY = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ENTRY = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__MODULE_IMPORT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OWNED_TAG = IMPERATIVE_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OWNED_VARIABLE = IMPERATIVE_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__USED_MODEL_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 9;

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
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___CONTAINER = IMPERATIVE_OPERATION___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___EQUALS__OBJECT = IMPERATIVE_OPERATION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___GET__PROPERTY = IMPERATIVE_OPERATION___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___GET_META_CLASS = IMPERATIVE_OPERATION___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___IS_SET__PROPERTY = IMPERATIVE_OPERATION___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___SET__PROPERTY_OBJECT = IMPERATIVE_OPERATION___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___UNSET__PROPERTY = IMPERATIVE_OPERATION___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = IMPERATIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.OperationBodyImpl <em>Operation Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.OperationBodyImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getOperationBody()
	 * @generated
	 */
	int OPERATION_BODY = 17;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__OWNED_COMMENT = EMOFPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__CONTENT = EMOFPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__OPERATION = EMOFPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__VARIABLE = EMOFPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_FEATURE_COUNT = EMOFPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY___CONTAINER = EMOFPackage.ELEMENT___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY___EQUALS__OBJECT = EMOFPackage.ELEMENT___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY___GET__PROPERTY = EMOFPackage.ELEMENT___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY___GET_META_CLASS = EMOFPackage.ELEMENT___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY___IS_SET__PROPERTY = EMOFPackage.ELEMENT___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY___SET__PROPERTY_OBJECT = EMOFPackage.ELEMENT___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY___UNSET__PROPERTY = EMOFPackage.ELEMENT___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Operation Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_OPERATION_COUNT = EMOFPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ConstructorBodyImpl <em>Constructor Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ConstructorBodyImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getConstructorBody()
	 * @generated
	 */
	int CONSTRUCTOR_BODY = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__OWNED_COMMENT = OPERATION_BODY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__CONTENT = OPERATION_BODY__CONTENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__OPERATION = OPERATION_BODY__OPERATION;

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
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY___CONTAINER = OPERATION_BODY___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY___EQUALS__OBJECT = OPERATION_BODY___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY___GET__PROPERTY = OPERATION_BODY___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY___GET_META_CLASS = OPERATION_BODY___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY___IS_SET__PROPERTY = OPERATION_BODY___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY___SET__PROPERTY_OBJECT = OPERATION_BODY___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY___UNSET__PROPERTY = OPERATION_BODY___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Constructor Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY_OPERATION_COUNT = OPERATION_BODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ContextualPropertyImpl <em>Contextual Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ContextualPropertyImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getContextualProperty()
	 * @generated
	 */
	int CONTEXTUAL_PROPERTY = 2;

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
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__IS_BLACKBOX = IMPERATIVE_OPERATION__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__NESTED_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__NESTING_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OWNED_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__URI = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__CONFIG_PROPERTY = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__ENTRY = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__MODULE_IMPORT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OWNED_TAG = IMPERATIVE_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OWNED_VARIABLE = IMPERATIVE_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__USED_MODEL_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 9;

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
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY___CONTAINER = IMPERATIVE_OPERATION___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY___EQUALS__OBJECT = IMPERATIVE_OPERATION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY___GET__PROPERTY = IMPERATIVE_OPERATION___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY___GET_META_CLASS = IMPERATIVE_OPERATION___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY___IS_SET__PROPERTY = IMPERATIVE_OPERATION___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY___SET__PROPERTY_OBJECT = IMPERATIVE_OPERATION___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY___UNSET__PROPERTY = IMPERATIVE_OPERATION___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Contextual Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_OPERATION_COUNT = IMPERATIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.EntryOperationImpl <em>Entry Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.EntryOperationImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getEntryOperation()
	 * @generated
	 */
	int ENTRY_OPERATION = 3;

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
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__IS_BLACKBOX = IMPERATIVE_OPERATION__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__NESTED_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__NESTING_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OWNED_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__URI = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__CONFIG_PROPERTY = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__ENTRY = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__MODULE_IMPORT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OWNED_TAG = IMPERATIVE_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OWNED_VARIABLE = IMPERATIVE_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__USED_MODEL_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 9;

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
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION___CONTAINER = IMPERATIVE_OPERATION___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION___EQUALS__OBJECT = IMPERATIVE_OPERATION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION___GET__PROPERTY = IMPERATIVE_OPERATION___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION___GET_META_CLASS = IMPERATIVE_OPERATION___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION___IS_SET__PROPERTY = IMPERATIVE_OPERATION___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION___SET__PROPERTY_OBJECT = IMPERATIVE_OPERATION___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION___UNSET__PROPERTY = IMPERATIVE_OPERATION___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Entry Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_OPERATION_COUNT = IMPERATIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.HelperImpl <em>Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.HelperImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getHelper()
	 * @generated
	 */
	int HELPER = 4;

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
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__IS_BLACKBOX = IMPERATIVE_OPERATION__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__NESTED_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__NESTING_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OWNED_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__URI = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__CONFIG_PROPERTY = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__ENTRY = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__MODULE_IMPORT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OWNED_TAG = IMPERATIVE_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OWNED_VARIABLE = IMPERATIVE_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__USED_MODEL_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 9;

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
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER___CONTAINER = IMPERATIVE_OPERATION___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER___EQUALS__OBJECT = IMPERATIVE_OPERATION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER___GET__PROPERTY = IMPERATIVE_OPERATION___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER___GET_META_CLASS = IMPERATIVE_OPERATION___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER___IS_SET__PROPERTY = IMPERATIVE_OPERATION___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER___SET__PROPERTY_OBJECT = IMPERATIVE_OPERATION___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER___UNSET__PROPERTY = IMPERATIVE_OPERATION___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_COUNT = IMPERATIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ImperativeCallExpImpl <em>Imperative Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ImperativeCallExpImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getImperativeCallExp()
	 * @generated
	 */
	int IMPERATIVE_CALL_EXP = 5;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ModuleImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 14;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.LibraryImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 7;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MappingBodyImpl <em>Mapping Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MappingBodyImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingBody()
	 * @generated
	 */
	int MAPPING_BODY = 8;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MappingCallExpImpl <em>Mapping Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MappingCallExpImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingCallExp()
	 * @generated
	 */
	int MAPPING_CALL_EXP = 9;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MappingOperationImpl <em>Mapping Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MappingOperationImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingOperation()
	 * @generated
	 */
	int MAPPING_OPERATION = 10;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.VarParameterImpl <em>Var Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.VarParameterImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getVarParameter()
	 * @generated
	 */
	int VAR_PARAMETER = 21;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MappingParameterImpl <em>Mapping Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MappingParameterImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingParameter()
	 * @generated
	 */
	int MAPPING_PARAMETER = 11;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ModelParameterImpl <em>Model Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ModelParameterImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModelParameter()
	 * @generated
	 */
	int MODEL_PARAMETER = 12;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ModelTypeImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 13;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ModuleImportImpl <em>Module Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ModuleImportImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModuleImport()
	 * @generated
	 */
	int MODULE_IMPORT = 15;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ObjectExpImpl <em>Object Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ObjectExpImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getObjectExp()
	 * @generated
	 */
	int OBJECT_EXP = 16;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.OperationalTransformationImpl <em>Operational Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.OperationalTransformationImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getOperationalTransformation()
	 * @generated
	 */
	int OPERATIONAL_TRANSFORMATION = 18;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ResolveExpImpl <em>Resolve Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ResolveExpImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getResolveExp()
	 * @generated
	 */
	int RESOLVE_EXP = 19;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ResolveInExpImpl <em>Resolve In Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ResolveInExpImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getResolveInExp()
	 * @generated
	 */
	int RESOLVE_IN_EXP = 20;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.TopLevelGOImpl <em>Top Level GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.TopLevelGOImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTopLevelGO()
	 * @generated
	 */
	int TOP_LEVEL_GO = 22;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.UnitRefGOImpl <em>Unit Ref GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.UnitRefGOImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getUnitRefGO()
	 * @generated
	 */
	int UNIT_REF_GO = 23;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.TagGOImpl <em>Tag GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.TagGOImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTagGO()
	 * @generated
	 */
	int TAG_GO = 24;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MetaModelGOImpl <em>Meta Model GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MetaModelGOImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMetaModelGO()
	 * @generated
	 */
	int META_MODEL_GO = 25;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.AccessDeclImpl <em>Access Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.AccessDeclImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getAccessDecl()
	 * @generated
	 */
	int ACCESS_DECL = 26;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.TypeDefImpl <em>Type Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.TypeDefImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTypeDef()
	 * @generated
	 */
	int TYPE_DEF = 27;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.TransformationHeaderImpl <em>Transformation Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.TransformationHeaderImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTransformationHeader()
	 * @generated
	 */
	int TRANSFORMATION_HEADER = 28;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.SimpleSignatureImpl <em>Simple Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.SimpleSignatureImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getSimpleSignature()
	 * @generated
	 */
	int SIMPLE_SIGNATURE = 29;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.TransformationUsageRefineImpl <em>Transformation Usage Refine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.TransformationUsageRefineImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTransformationUsageRefine()
	 * @generated
	 */
	int TRANSFORMATION_USAGE_REFINE = 30;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ModuleRefGOImpl <em>Module Ref GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ModuleRefGOImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModuleRefGO()
	 * @generated
	 */
	int MODULE_REF_GO = 31;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ModuleUsageGOImpl <em>Module Usage GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ModuleUsageGOImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModuleUsageGO()
	 * @generated
	 */
	int MODULE_USAGE_GO = 32;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.LibraryHeaderImpl <em>Library Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.LibraryHeaderImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getLibraryHeader()
	 * @generated
	 */
	int LIBRARY_HEADER = 33;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.AccessUsageImpl <em>Access Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.AccessUsageImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getAccessUsage()
	 * @generated
	 */
	int ACCESS_USAGE = 34;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ExtendsUsageImpl <em>Extends Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ExtendsUsageImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getExtendsUsage()
	 * @generated
	 */
	int EXTENDS_USAGE = 35;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ScopedIdentifierImpl <em>Scoped Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ScopedIdentifierImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getScopedIdentifier()
	 * @generated
	 */
	int SCOPED_IDENTIFIER = 36;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ParamListImpl <em>Param List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ParamListImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getParamList()
	 * @generated
	 */
	int PARAM_LIST = 37;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ClassifierGOImpl <em>Classifier GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ClassifierGOImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierGO()
	 * @generated
	 */
	int CLASSIFIER_GO = 38;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.DeclaratorImpl <em>Declarator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.DeclaratorImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getDeclarator()
	 * @generated
	 */
	int DECLARATOR = 39;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.TypeSpecImpl <em>Type Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.TypeSpecImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTypeSpec()
	 * @generated
	 */
	int TYPE_SPEC = 40;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.TypeReferenceImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 41;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ComplexTypeImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 42;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.DeclaratorListImpl <em>Declarator List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.DeclaratorListImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getDeclaratorList()
	 * @generated
	 */
	int DECLARATOR_LIST = 43;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.InitPartImpl <em>Init Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.InitPartImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getInitPart()
	 * @generated
	 */
	int INIT_PART = 44;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ExpressionSemiListImpl <em>Expression Semi List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ExpressionSemiListImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getExpressionSemiList()
	 * @generated
	 */
	int EXPRESSION_SEMI_LIST = 45;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ExpressionListImpl <em>Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ExpressionListImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getExpressionList()
	 * @generated
	 */
	int EXPRESSION_LIST = 46;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ExpressionBlockImpl <em>Expression Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ExpressionBlockImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getExpressionBlock()
	 * @generated
	 */
	int EXPRESSION_BLOCK = 47;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.PackageRefGOImpl <em>Package Ref GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.PackageRefGOImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getPackageRefGO()
	 * @generated
	 */
	int PACKAGE_REF_GO = 48;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MetaModelHeaderImpl <em>Meta Model Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MetaModelHeaderImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMetaModelHeader()
	 * @generated
	 */
	int META_MODEL_HEADER = 49;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MetaModelElementImpl <em>Meta Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MetaModelElementImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMetaModelElement()
	 * @generated
	 */
	int META_MODEL_ELEMENT = 50;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.EnumerationGOImpl <em>Enumeration GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.EnumerationGOImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getEnumerationGO()
	 * @generated
	 */
	int ENUMERATION_GO = 51;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ClassifierHeaderImpl <em>Classifier Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ClassifierHeaderImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierHeader()
	 * @generated
	 */
	int CLASSIFIER_HEADER = 52;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ClassifierFeatureListImpl <em>Classifier Feature List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ClassifierFeatureListImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierFeatureList()
	 * @generated
	 */
	int CLASSIFIER_FEATURE_LIST = 53;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ClassifierInfoImpl <em>Classifier Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ClassifierInfoImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierInfo()
	 * @generated
	 */
	int CLASSIFIER_INFO = 54;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ClassifierExtensionImpl <em>Classifier Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ClassifierExtensionImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierExtension()
	 * @generated
	 */
	int CLASSIFIER_EXTENSION = 55;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ScopedIdentifierListImpl <em>Scoped Identifier List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ScopedIdentifierListImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getScopedIdentifierList()
	 * @generated
	 */
	int SCOPED_IDENTIFIER_LIST = 56;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ClassifierFeatureImpl <em>Classifier Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ClassifierFeatureImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierFeature()
	 * @generated
	 */
	int CLASSIFIER_FEATURE = 57;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MultiplicityImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 58;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.OppositePropertyImpl <em>Opposite Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.OppositePropertyImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getOppositeProperty()
	 * @generated
	 */
	int OPPOSITE_PROPERTY = 59;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.StereotypeQualifierImpl <em>Stereotype Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.StereotypeQualifierImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getStereotypeQualifier()
	 * @generated
	 */
	int STEREOTYPE_QUALIFIER = 60;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.FeatureQualifierImpl <em>Feature Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.FeatureQualifierImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getFeatureQualifier()
	 * @generated
	 */
	int FEATURE_QUALIFIER = 61;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.CompleteSignatureImpl <em>Complete Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.CompleteSignatureImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getCompleteSignature()
	 * @generated
	 */
	int COMPLETE_SIGNATURE = 62;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.EnumerationHeaderImpl <em>Enumeration Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.EnumerationHeaderImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getEnumerationHeader()
	 * @generated
	 */
	int ENUMERATION_HEADER = 63;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.HelperInfoImpl <em>Helper Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.HelperInfoImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getHelperInfo()
	 * @generated
	 */
	int HELPER_INFO = 64;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.HelperHeaderImpl <em>Helper Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.HelperHeaderImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getHelperHeader()
	 * @generated
	 */
	int HELPER_HEADER = 65;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ConstructorHeaderImpl <em>Constructor Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ConstructorHeaderImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getConstructorHeader()
	 * @generated
	 */
	int CONSTRUCTOR_HEADER = 66;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.EntryHeaderImpl <em>Entry Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.EntryHeaderImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getEntryHeader()
	 * @generated
	 */
	int ENTRY_HEADER = 67;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MappingHeaderImpl <em>Mapping Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MappingHeaderImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingHeader()
	 * @generated
	 */
	int MAPPING_HEADER = 68;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MappingFullHeaderImpl <em>Mapping Full Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MappingFullHeaderImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingFullHeader()
	 * @generated
	 */
	int MAPPING_FULL_HEADER = 69;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MappingExtraImpl <em>Mapping Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MappingExtraImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingExtra()
	 * @generated
	 */
	int MAPPING_EXTRA = 70;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MappingExtensionImpl <em>Mapping Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MappingExtensionImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingExtension()
	 * @generated
	 */
	int MAPPING_EXTENSION = 71;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.MappingRefinementImpl <em>Mapping Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.MappingRefinementImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingRefinement()
	 * @generated
	 */
	int MAPPING_REFINEMENT = 72;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.PopulationSectionImpl <em>Population Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.PopulationSectionImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getPopulationSection()
	 * @generated
	 */
	int POPULATION_SECTION = 73;

	/**
	 * The meta object id for the '{@link QVTOperational.impl.ExpressionGOImpl <em>Expression GO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.impl.ExpressionGOImpl
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getExpressionGO()
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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_COMMENT = EMOFPackage.PACKAGE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = EMOFPackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NESTED_PACKAGE = EMOFPackage.PACKAGE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NESTING_PACKAGE = EMOFPackage.PACKAGE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_TYPE = EMOFPackage.PACKAGE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__URI = EMOFPackage.PACKAGE__URI;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONFIG_PROPERTY = EMOFPackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ENTRY = EMOFPackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_IMPORT = EMOFPackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_TAG = EMOFPackage.PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_VARIABLE = EMOFPackage.PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__USED_MODEL_TYPE = EMOFPackage.PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = EMOFPackage.PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___CONTAINER = EMOFPackage.PACKAGE___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___EQUALS__OBJECT = EMOFPackage.PACKAGE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___GET__PROPERTY = EMOFPackage.PACKAGE___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___GET_META_CLASS = EMOFPackage.PACKAGE___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___IS_SET__PROPERTY = EMOFPackage.PACKAGE___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___SET__PROPERTY_OBJECT = EMOFPackage.PACKAGE___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___UNSET__PROPERTY = EMOFPackage.PACKAGE___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = EMOFPackage.PACKAGE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NESTING_PACKAGE = MODULE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

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
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY___CONTAINER = MODULE___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY___EQUALS__OBJECT = MODULE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY___GET__PROPERTY = MODULE___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY___GET_META_CLASS = MODULE___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY___IS_SET__PROPERTY = MODULE___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY___SET__PROPERTY_OBJECT = MODULE___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY___UNSET__PROPERTY = MODULE___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__OWNED_COMMENT = OPERATION_BODY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__CONTENT = OPERATION_BODY__CONTENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__OPERATION = OPERATION_BODY__OPERATION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__VARIABLE = OPERATION_BODY__VARIABLE;

	/**
	 * The feature id for the '<em><b>End Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__END_SECTION = OPERATION_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__INIT_SECTION = OPERATION_BODY_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY___CONTAINER = OPERATION_BODY___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY___EQUALS__OBJECT = OPERATION_BODY___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY___GET__PROPERTY = OPERATION_BODY___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY___GET_META_CLASS = OPERATION_BODY___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY___IS_SET__PROPERTY = OPERATION_BODY___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY___SET__PROPERTY_OBJECT = OPERATION_BODY___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY___UNSET__PROPERTY = OPERATION_BODY___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Mapping Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_OPERATION_COUNT = OPERATION_BODY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__IS_BLACKBOX = IMPERATIVE_OPERATION__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__NESTED_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__NESTING_PACKAGE = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OWNED_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__URI = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__CONFIG_PROPERTY = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__ENTRY = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__MODULE_IMPORT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OWNED_TAG = IMPERATIVE_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OWNED_VARIABLE = IMPERATIVE_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__USED_MODEL_TYPE = IMPERATIVE_OPERATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Disjunct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__DISJUNCT = IMPERATIVE_OPERATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__INHERITED = IMPERATIVE_OPERATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__MERGED = IMPERATIVE_OPERATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Refined Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__REFINED_RELATION = IMPERATIVE_OPERATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__WHEN = IMPERATIVE_OPERATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
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
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION___CONTAINER = IMPERATIVE_OPERATION___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION___EQUALS__OBJECT = IMPERATIVE_OPERATION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION___GET__PROPERTY = IMPERATIVE_OPERATION___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION___GET_META_CLASS = IMPERATIVE_OPERATION___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION___IS_SET__PROPERTY = IMPERATIVE_OPERATION___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION___SET__PROPERTY_OBJECT = IMPERATIVE_OPERATION___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION___UNSET__PROPERTY = IMPERATIVE_OPERATION___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Mapping Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_OPERATION_COUNT = IMPERATIVE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__DUMMY_CONTENT = EXPRESSION_GO__DUMMY_CONTENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__OWNED_COMMENT = EXPRESSION_GO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__NAME = EXPRESSION_GO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__TYPE = EXPRESSION_GO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__IS_ORDERED = EXPRESSION_GO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__IS_UNIQUE = EXPRESSION_GO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__LOWER = EXPRESSION_GO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__UPPER = EXPRESSION_GO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__OPERATION = EXPRESSION_GO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ctx Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__CTX_OWNER = EXPRESSION_GO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__KIND = EXPRESSION_GO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Res Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__RES_OWNER = EXPRESSION_GO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__DECLARATOR = EXPRESSION_GO_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Var Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER_FEATURE_COUNT = EXPRESSION_GO_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER___CONTAINER = EXPRESSION_GO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER___EQUALS__OBJECT = EXPRESSION_GO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER___GET__PROPERTY = EXPRESSION_GO_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER___GET_META_CLASS = EXPRESSION_GO_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER___IS_SET__PROPERTY = EXPRESSION_GO_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER___SET__PROPERTY_OBJECT = EXPRESSION_GO_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER___UNSET__PROPERTY = EXPRESSION_GO_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Var Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER_OPERATION_COUNT = EXPRESSION_GO_OPERATION_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__DUMMY_CONTENT = VAR_PARAMETER__DUMMY_CONTENT;

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
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__OPERATION = VAR_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Ctx Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__CTX_OWNER = VAR_PARAMETER__CTX_OWNER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__KIND = VAR_PARAMETER__KIND;

	/**
	 * The feature id for the '<em><b>Res Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__RES_OWNER = VAR_PARAMETER__RES_OWNER;

	/**
	 * The feature id for the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__DECLARATOR = VAR_PARAMETER__DECLARATOR;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__EXTENT = VAR_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__REFERRED_DOMAIN = VAR_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER_FEATURE_COUNT = VAR_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER___CONTAINER = VAR_PARAMETER___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER___EQUALS__OBJECT = VAR_PARAMETER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER___GET__PROPERTY = VAR_PARAMETER___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER___GET_META_CLASS = VAR_PARAMETER___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER___IS_SET__PROPERTY = VAR_PARAMETER___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER___SET__PROPERTY_OBJECT = VAR_PARAMETER___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER___UNSET__PROPERTY = VAR_PARAMETER___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Mapping Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER_OPERATION_COUNT = VAR_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__DUMMY_CONTENT = VAR_PARAMETER__DUMMY_CONTENT;

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
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__OPERATION = VAR_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Ctx Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__CTX_OWNER = VAR_PARAMETER__CTX_OWNER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__KIND = VAR_PARAMETER__KIND;

	/**
	 * The feature id for the '<em><b>Res Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__RES_OWNER = VAR_PARAMETER__RES_OWNER;

	/**
	 * The feature id for the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__DECLARATOR = VAR_PARAMETER__DECLARATOR;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__MODULE = VAR_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER_FEATURE_COUNT = VAR_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER___CONTAINER = VAR_PARAMETER___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER___EQUALS__OBJECT = VAR_PARAMETER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER___GET__PROPERTY = VAR_PARAMETER___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER___GET_META_CLASS = VAR_PARAMETER___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER___IS_SET__PROPERTY = VAR_PARAMETER___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER___SET__PROPERTY_OBJECT = VAR_PARAMETER___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER___UNSET__PROPERTY = VAR_PARAMETER___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Model Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER_OPERATION_COUNT = VAR_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_COMMENT = MODULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NESTING_PACKAGE = MODULE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Additional Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ADDITIONAL_CONDITION = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conformance Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CONFORMANCE_KIND = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__METAMODEL = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compliance kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__COMPLIANCE_KIND = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Packageref list</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__PACKAGEREF_LIST = MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modeltype where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__MODELTYPE_WHERE = MODULE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE___CONTAINER = MODULE___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE___EQUALS__OBJECT = MODULE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE___GET__PROPERTY = MODULE___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE___GET_META_CLASS = MODULE___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE___IS_SET__PROPERTY = MODULE___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE___SET__PROPERTY_OBJECT = MODULE___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE___UNSET__PROPERTY = MODULE___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__OWNED_COMMENT = EMOFPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__BINDING = EMOFPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__IMPORTED_MODULE = EMOFPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__KIND = EMOFPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__MODULE = EMOFPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__UNIT = EMOFPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__IDENTIFIER = EMOFPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Module Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT_FEATURE_COUNT = EMOFPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT___CONTAINER = EMOFPackage.ELEMENT___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT___EQUALS__OBJECT = EMOFPackage.ELEMENT___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT___GET__PROPERTY = EMOFPackage.ELEMENT___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT___GET_META_CLASS = EMOFPackage.ELEMENT___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT___IS_SET__PROPERTY = EMOFPackage.ELEMENT___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT___SET__PROPERTY_OBJECT = EMOFPackage.ELEMENT___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT___UNSET__PROPERTY = EMOFPackage.ELEMENT___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Module Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT_OPERATION_COUNT = EMOFPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__DUMMY_CONTENT = EXPRESSION_GO__DUMMY_CONTENT;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__BODY = EXPRESSION_GO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__REFERRED_OBJECT = EXPRESSION_GO_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__NESTING_PACKAGE = MODULE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Intermediate Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intermediate Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__REFINED = MODULE_FEATURE_COUNT + 3;

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
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION___CONTAINER = MODULE___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION___EQUALS__OBJECT = MODULE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION___GET__PROPERTY = MODULE___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION___GET_META_CLASS = MODULE___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION___IS_SET__PROPERTY = MODULE___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION___SET__PROPERTY_OBJECT = MODULE___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION___UNSET__PROPERTY = MODULE___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Operational Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__DUMMY_CONTENT = EXPRESSION_GO__DUMMY_CONTENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__CONDITION = EXPRESSION_GO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__IS_DEFERRED = EXPRESSION_GO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__IS_INVERSE = EXPRESSION_GO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__ONE = EXPRESSION_GO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__TARGET = EXPRESSION_GO_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Dummy Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__DUMMY_CONTENT = RESOLVE_EXP__DUMMY_CONTENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__CONDITION = RESOLVE_EXP__CONDITION;

	/**
	 * The feature id for the '<em><b>Is Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__IS_DEFERRED = RESOLVE_EXP__IS_DEFERRED;

	/**
	 * The feature id for the '<em><b>Is Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__IS_INVERSE = RESOLVE_EXP__IS_INVERSE;

	/**
	 * The feature id for the '<em><b>One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__ONE = RESOLVE_EXP__ONE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__TARGET = RESOLVE_EXP__TARGET;

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
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__NESTING_PACKAGE = MODULE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__TYPE = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__IS_ORDERED = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__IS_UNIQUE = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__LOWER = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__UPPER = MODULE_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__BODY = MODULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__CONTEXT = MODULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__IS_BLACKBOX = MODULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__OVERRIDDEN = MODULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__RESULT = MODULE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tagid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__TAGID = MODULE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Scoped identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__SCOPED_IDENTIFIER = MODULE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Tagvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO__TAGVALUE = MODULE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Tag GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO_FEATURE_COUNT = MODULE_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO___CONTAINER = MODULE___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO___EQUALS__OBJECT = MODULE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO___GET__PROPERTY = MODULE___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO___GET_META_CLASS = MODULE___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO___IS_SET__PROPERTY = MODULE___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO___SET__PROPERTY_OBJECT = MODULE___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO___UNSET__PROPERTY = MODULE___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Tag GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GO_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__NESTING_PACKAGE = MODULE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

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
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO___CONTAINER = MODULE___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO___EQUALS__OBJECT = MODULE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO___GET__PROPERTY = MODULE___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO___GET_META_CLASS = MODULE___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO___IS_SET__PROPERTY = MODULE___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO___SET__PROPERTY_OBJECT = MODULE___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO___UNSET__PROPERTY = MODULE___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Meta Model GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_GO_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__NESTING_PACKAGE = MODULE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__TYPE = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__IS_ORDERED = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__IS_UNIQUE = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__LOWER = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__UPPER = MODULE_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__BODY = MODULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__CONTEXT = MODULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__IS_BLACKBOX = MODULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__OVERRIDDEN = MODULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__RESULT = MODULE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Access usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL__ACCESS_USAGE = MODULE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Access Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL_FEATURE_COUNT = MODULE_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL___CONTAINER = MODULE___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL___EQUALS__OBJECT = MODULE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL___GET__PROPERTY = MODULE___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL___GET_META_CLASS = MODULE___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL___IS_SET__PROPERTY = MODULE___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL___SET__PROPERTY_OBJECT = MODULE___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL___UNSET__PROPERTY = MODULE___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Access Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECL_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__NESTING_PACKAGE = MODULE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__TYPE = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__IS_ORDERED = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__IS_UNIQUE = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__LOWER = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__UPPER = MODULE_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__BODY = MODULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__CONTEXT = MODULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__IS_BLACKBOX = MODULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__OVERRIDDEN = MODULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__RESULT = MODULE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Typespec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__TYPESPEC = MODULE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Typedef condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__TYPEDEF_CONDITION = MODULE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_FEATURE_COUNT = MODULE_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF___CONTAINER = MODULE___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF___EQUALS__OBJECT = MODULE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF___GET__PROPERTY = MODULE___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF___GET_META_CLASS = MODULE___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF___IS_SET__PROPERTY = MODULE___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF___SET__PROPERTY_OBJECT = MODULE___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF___UNSET__PROPERTY = MODULE___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OWNED_COMMENT = MODULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__NESTING_PACKAGE = MODULE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__TYPE = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__IS_ORDERED = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__IS_UNIQUE = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__LOWER = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__UPPER = MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__CLASS = MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OWNED_PARAMETER = MODULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__RAISED_EXCEPTION = MODULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__BODY = MODULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__CONTEXT = MODULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__IS_BLACKBOX = MODULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__OVERRIDDEN = MODULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__RESULT = MODULE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Classifier h</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__CLASSIFIER_H = MODULE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Classifier feature list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST = MODULE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Classifier GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO_FEATURE_COUNT = MODULE_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO___CONTAINER = MODULE___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO___EQUALS__OBJECT = MODULE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO___GET__PROPERTY = MODULE___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO___GET_META_CLASS = MODULE___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO___IS_SET__PROPERTY = MODULE___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO___SET__PROPERTY_OBJECT = MODULE___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO___UNSET__PROPERTY = MODULE___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Classifier GO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_GO_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link QVTOperational.DirectionKind <em>Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.DirectionKind
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getDirectionKind()
	 * @generated
	 */
	int DIRECTION_KIND = 75;

	/**
	 * The meta object id for the '{@link QVTOperational.ImportKind <em>Import Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.ImportKind
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getImportKind()
	 * @generated
	 */
	int IMPORT_KIND = 76;

	/**
	 * The meta object id for the '{@link QVTOperational.GeneralQualifier <em>General Qualifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.GeneralQualifier
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getGeneralQualifier()
	 * @generated
	 */
	int GENERAL_QUALIFIER = 77;

	/**
	 * The meta object id for the '{@link QVTOperational.ModuleKind <em>Module Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.ModuleKind
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModuleKind()
	 * @generated
	 */
	int MODULE_KIND = 78;

	/**
	 * The meta object id for the '{@link QVTOperational.ComplexTypeKey <em>Complex Type Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.ComplexTypeKey
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getComplexTypeKey()
	 * @generated
	 */
	int COMPLEX_TYPE_KEY = 79;

	/**
	 * The meta object id for the '{@link QVTOperational.FeatureKey <em>Feature Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.FeatureKey
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getFeatureKey()
	 * @generated
	 */
	int FEATURE_KEY = 80;

	/**
	 * The meta object id for the '{@link QVTOperational.PropertyKey <em>Property Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.PropertyKey
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getPropertyKey()
	 * @generated
	 */
	int PROPERTY_KEY = 81;

	/**
	 * The meta object id for the '{@link QVTOperational.HelperKind <em>Helper Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.HelperKind
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getHelperKind()
	 * @generated
	 */
	int HELPER_KIND = 82;

	/**
	 * The meta object id for the '{@link QVTOperational.MappingExtensionKey <em>Mapping Extension Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.MappingExtensionKey
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingExtensionKey()
	 * @generated
	 */
	int MAPPING_EXTENSION_KEY = 83;

	/**
	 * The meta object id for the '{@link QVTOperational.CollectionKey <em>Collection Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTOperational.CollectionKey
	 * @see QVTOperational.impl.QVTOperationalPackageImpl#getCollectionKey()
	 * @generated
	 */
	int COLLECTION_KEY = 84;


	/**
	 * Returns the meta object for class '{@link QVTOperational.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see QVTOperational.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.Constructor#getConstructor_header <em>Constructor header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constructor header</em>'.
	 * @see QVTOperational.Constructor#getConstructor_header()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Constructor_header();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.Constructor#getExpression_block <em>Expression block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression block</em>'.
	 * @see QVTOperational.Constructor#getExpression_block()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Expression_block();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ConstructorBody <em>Constructor Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Body</em>'.
	 * @see QVTOperational.ConstructorBody
	 * @generated
	 */
	EClass getConstructorBody();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ContextualProperty <em>Contextual Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Property</em>'.
	 * @see QVTOperational.ContextualProperty
	 * @generated
	 */
	EClass getContextualProperty();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ContextualProperty#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see QVTOperational.ContextualProperty#getInitExpression()
	 * @see #getContextualProperty()
	 * @generated
	 */
	EReference getContextualProperty_InitExpression();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.ContextualProperty#getProperty_key <em>Property key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property key</em>'.
	 * @see QVTOperational.ContextualProperty#getProperty_key()
	 * @see #getContextualProperty()
	 * @generated
	 */
	EAttribute getContextualProperty_Property_key();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ContextualProperty#getDeclarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declarator</em>'.
	 * @see QVTOperational.ContextualProperty#getDeclarator()
	 * @see #getContextualProperty()
	 * @generated
	 */
	EReference getContextualProperty_Declarator();

	/**
	 * Returns the meta object for class '{@link QVTOperational.EntryOperation <em>Entry Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Operation</em>'.
	 * @see QVTOperational.EntryOperation
	 * @generated
	 */
	EClass getEntryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.EntryOperation#getEntry_header <em>Entry header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry header</em>'.
	 * @see QVTOperational.EntryOperation#getEntry_header()
	 * @see #getEntryOperation()
	 * @generated
	 */
	EReference getEntryOperation_Entry_header();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.EntryOperation#getExpression_block <em>Expression block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression block</em>'.
	 * @see QVTOperational.EntryOperation#getExpression_block()
	 * @see #getEntryOperation()
	 * @generated
	 */
	EReference getEntryOperation_Expression_block();

	/**
	 * Returns the meta object for class '{@link QVTOperational.Helper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper</em>'.
	 * @see QVTOperational.Helper
	 * @generated
	 */
	EClass getHelper();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.Helper#getIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see QVTOperational.Helper#getIsQuery()
	 * @see #getHelper()
	 * @generated
	 */
	EAttribute getHelper_IsQuery();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.Helper#getHelper_header <em>Helper header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Helper header</em>'.
	 * @see QVTOperational.Helper#getHelper_header()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_Helper_header();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.Helper#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see QVTOperational.Helper#getExpression()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.Helper#getExpression_block <em>Expression block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression block</em>'.
	 * @see QVTOperational.Helper#getExpression_block()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_Expression_block();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ImperativeCallExp <em>Imperative Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Call Exp</em>'.
	 * @see QVTOperational.ImperativeCallExp
	 * @generated
	 */
	EClass getImperativeCallExp();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.ImperativeCallExp#getIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see QVTOperational.ImperativeCallExp#getIsVirtual()
	 * @see #getImperativeCallExp()
	 * @generated
	 */
	EAttribute getImperativeCallExp_IsVirtual();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ImperativeOperation <em>Imperative Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Operation</em>'.
	 * @see QVTOperational.ImperativeOperation
	 * @generated
	 */
	EClass getImperativeOperation();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ImperativeOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see QVTOperational.ImperativeOperation#getBody()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Body();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ImperativeOperation#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see QVTOperational.ImperativeOperation#getContext()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Context();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.ImperativeOperation#getIsBlackbox <em>Is Blackbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Blackbox</em>'.
	 * @see QVTOperational.ImperativeOperation#getIsBlackbox()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EAttribute getImperativeOperation_IsBlackbox();

	/**
	 * Returns the meta object for the reference '{@link QVTOperational.ImperativeOperation#getOverridden <em>Overridden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overridden</em>'.
	 * @see QVTOperational.ImperativeOperation#getOverridden()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Overridden();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.ImperativeOperation#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see QVTOperational.ImperativeOperation#getResult()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Result();

	/**
	 * Returns the meta object for class '{@link QVTOperational.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see QVTOperational.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.Library#getLibrary_h <em>Library h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library h</em>'.
	 * @see QVTOperational.Library#getLibrary_h()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Library_h();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.Library#getModule_element <em>Module element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module element</em>'.
	 * @see QVTOperational.Library#getModule_element()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Module_element();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MappingBody <em>Mapping Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Body</em>'.
	 * @see QVTOperational.MappingBody
	 * @generated
	 */
	EClass getMappingBody();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.MappingBody#getEndSection <em>End Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Section</em>'.
	 * @see QVTOperational.MappingBody#getEndSection()
	 * @see #getMappingBody()
	 * @generated
	 */
	EReference getMappingBody_EndSection();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.MappingBody#getInitSection <em>Init Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Section</em>'.
	 * @see QVTOperational.MappingBody#getInitSection()
	 * @see #getMappingBody()
	 * @generated
	 */
	EReference getMappingBody_InitSection();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingBody#getPopulation_section <em>Population section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Population section</em>'.
	 * @see QVTOperational.MappingBody#getPopulation_section()
	 * @see #getMappingBody()
	 * @generated
	 */
	EReference getMappingBody_Population_section();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MappingCallExp <em>Mapping Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Call Exp</em>'.
	 * @see QVTOperational.MappingCallExp
	 * @generated
	 */
	EClass getMappingCallExp();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.MappingCallExp#getIsStrict <em>Is Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strict</em>'.
	 * @see QVTOperational.MappingCallExp#getIsStrict()
	 * @see #getMappingCallExp()
	 * @generated
	 */
	EAttribute getMappingCallExp_IsStrict();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MappingOperation <em>Mapping Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Operation</em>'.
	 * @see QVTOperational.MappingOperation
	 * @generated
	 */
	EClass getMappingOperation();

	/**
	 * Returns the meta object for the reference list '{@link QVTOperational.MappingOperation#getDisjunct <em>Disjunct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disjunct</em>'.
	 * @see QVTOperational.MappingOperation#getDisjunct()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Disjunct();

	/**
	 * Returns the meta object for the reference list '{@link QVTOperational.MappingOperation#getInherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited</em>'.
	 * @see QVTOperational.MappingOperation#getInherited()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Inherited();

	/**
	 * Returns the meta object for the reference list '{@link QVTOperational.MappingOperation#getMerged <em>Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Merged</em>'.
	 * @see QVTOperational.MappingOperation#getMerged()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Merged();

	/**
	 * Returns the meta object for the reference '{@link QVTOperational.MappingOperation#getRefinedRelation <em>Refined Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Relation</em>'.
	 * @see QVTOperational.MappingOperation#getRefinedRelation()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_RefinedRelation();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingOperation#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see QVTOperational.MappingOperation#getWhen()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_When();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingOperation#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see QVTOperational.MappingOperation#getWhere()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Where();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingOperation#getMapping_full_header <em>Mapping full header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping full header</em>'.
	 * @see QVTOperational.MappingOperation#getMapping_full_header()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Mapping_full_header();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingOperation#getMapping_body <em>Mapping body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping body</em>'.
	 * @see QVTOperational.MappingOperation#getMapping_body()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Mapping_body();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MappingParameter <em>Mapping Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Parameter</em>'.
	 * @see QVTOperational.MappingParameter
	 * @generated
	 */
	EClass getMappingParameter();

	/**
	 * Returns the meta object for the reference '{@link QVTOperational.MappingParameter#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extent</em>'.
	 * @see QVTOperational.MappingParameter#getExtent()
	 * @see #getMappingParameter()
	 * @generated
	 */
	EReference getMappingParameter_Extent();

	/**
	 * Returns the meta object for the reference '{@link QVTOperational.MappingParameter#getReferredDomain <em>Referred Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Domain</em>'.
	 * @see QVTOperational.MappingParameter#getReferredDomain()
	 * @see #getMappingParameter()
	 * @generated
	 */
	EReference getMappingParameter_ReferredDomain();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ModelParameter <em>Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Parameter</em>'.
	 * @see QVTOperational.ModelParameter
	 * @generated
	 */
	EClass getModelParameter();

	/**
	 * Returns the meta object for the container reference '{@link QVTOperational.ModelParameter#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see QVTOperational.ModelParameter#getModule()
	 * @see #getModelParameter()
	 * @generated
	 */
	EReference getModelParameter_Module();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see QVTOperational.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.ModelType#getAdditionalCondition <em>Additional Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Condition</em>'.
	 * @see QVTOperational.ModelType#getAdditionalCondition()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_AdditionalCondition();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.ModelType#getConformanceKind <em>Conformance Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conformance Kind</em>'.
	 * @see QVTOperational.ModelType#getConformanceKind()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_ConformanceKind();

	/**
	 * Returns the meta object for the reference list '{@link QVTOperational.ModelType#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metamodel</em>'.
	 * @see QVTOperational.ModelType#getMetamodel()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Metamodel();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.ModelType#getCompliance_kind <em>Compliance kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compliance kind</em>'.
	 * @see QVTOperational.ModelType#getCompliance_kind()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_Compliance_kind();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.ModelType#getPackageref_list <em>Packageref list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packageref list</em>'.
	 * @see QVTOperational.ModelType#getPackageref_list()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Packageref_list();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ModelType#getModeltype_where <em>Modeltype where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modeltype where</em>'.
	 * @see QVTOperational.ModelType#getModeltype_where()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Modeltype_where();

	/**
	 * Returns the meta object for class '{@link QVTOperational.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see QVTOperational.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference list '{@link QVTOperational.Module#getConfigProperty <em>Config Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Config Property</em>'.
	 * @see QVTOperational.Module#getConfigProperty()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ConfigProperty();

	/**
	 * Returns the meta object for the reference '{@link QVTOperational.Module#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry</em>'.
	 * @see QVTOperational.Module#getEntry()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Entry();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.Module#getModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Import</em>'.
	 * @see QVTOperational.Module#getModuleImport()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModuleImport();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.Module#getOwnedTag <em>Owned Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Tag</em>'.
	 * @see QVTOperational.Module#getOwnedTag()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_OwnedTag();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.Module#getOwnedVariable <em>Owned Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variable</em>'.
	 * @see QVTOperational.Module#getOwnedVariable()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_OwnedVariable();

	/**
	 * Returns the meta object for the reference list '{@link QVTOperational.Module#getUsedModelType <em>Used Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Model Type</em>'.
	 * @see QVTOperational.Module#getUsedModelType()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_UsedModelType();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Import</em>'.
	 * @see QVTOperational.ModuleImport
	 * @generated
	 */
	EClass getModuleImport();

	/**
	 * Returns the meta object for the reference list '{@link QVTOperational.ModuleImport#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding</em>'.
	 * @see QVTOperational.ModuleImport#getBinding()
	 * @see #getModuleImport()
	 * @generated
	 */
	EReference getModuleImport_Binding();

	/**
	 * Returns the meta object for the reference '{@link QVTOperational.ModuleImport#getImportedModule <em>Imported Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Module</em>'.
	 * @see QVTOperational.ModuleImport#getImportedModule()
	 * @see #getModuleImport()
	 * @generated
	 */
	EReference getModuleImport_ImportedModule();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.ModuleImport#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see QVTOperational.ModuleImport#getKind()
	 * @see #getModuleImport()
	 * @generated
	 */
	EAttribute getModuleImport_Kind();

	/**
	 * Returns the meta object for the container reference '{@link QVTOperational.ModuleImport#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see QVTOperational.ModuleImport#getModule()
	 * @see #getModuleImport()
	 * @generated
	 */
	EReference getModuleImport_Module();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ModuleImport#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see QVTOperational.ModuleImport#getUnit()
	 * @see #getModuleImport()
	 * @generated
	 */
	EReference getModuleImport_Unit();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.ModuleImport#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see QVTOperational.ModuleImport#getIdentifier()
	 * @see #getModuleImport()
	 * @generated
	 */
	EAttribute getModuleImport_Identifier();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ObjectExp <em>Object Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Exp</em>'.
	 * @see QVTOperational.ObjectExp
	 * @generated
	 */
	EClass getObjectExp();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ObjectExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see QVTOperational.ObjectExp#getBody()
	 * @see #getObjectExp()
	 * @generated
	 */
	EReference getObjectExp_Body();

	/**
	 * Returns the meta object for the reference '{@link QVTOperational.ObjectExp#getReferredObject <em>Referred Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Object</em>'.
	 * @see QVTOperational.ObjectExp#getReferredObject()
	 * @see #getObjectExp()
	 * @generated
	 */
	EReference getObjectExp_ReferredObject();

	/**
	 * Returns the meta object for class '{@link QVTOperational.OperationBody <em>Operation Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Body</em>'.
	 * @see QVTOperational.OperationBody
	 * @generated
	 */
	EClass getOperationBody();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.OperationBody#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see QVTOperational.OperationBody#getContent()
	 * @see #getOperationBody()
	 * @generated
	 */
	EReference getOperationBody_Content();

	/**
	 * Returns the meta object for the container reference '{@link QVTOperational.OperationBody#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see QVTOperational.OperationBody#getOperation()
	 * @see #getOperationBody()
	 * @generated
	 */
	EReference getOperationBody_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.OperationBody#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see QVTOperational.OperationBody#getVariable()
	 * @see #getOperationBody()
	 * @generated
	 */
	EReference getOperationBody_Variable();

	/**
	 * Returns the meta object for class '{@link QVTOperational.OperationalTransformation <em>Operational Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Transformation</em>'.
	 * @see QVTOperational.OperationalTransformation
	 * @generated
	 */
	EClass getOperationalTransformation();

	/**
	 * Returns the meta object for the reference list '{@link QVTOperational.OperationalTransformation#getIntermediateClass <em>Intermediate Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intermediate Class</em>'.
	 * @see QVTOperational.OperationalTransformation#getIntermediateClass()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_IntermediateClass();

	/**
	 * Returns the meta object for the reference list '{@link QVTOperational.OperationalTransformation#getIntermediateProperty <em>Intermediate Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intermediate Property</em>'.
	 * @see QVTOperational.OperationalTransformation#getIntermediateProperty()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_IntermediateProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.OperationalTransformation#getModelParameter <em>Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Parameter</em>'.
	 * @see QVTOperational.OperationalTransformation#getModelParameter()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_ModelParameter();

	/**
	 * Returns the meta object for the reference '{@link QVTOperational.OperationalTransformation#getRefined <em>Refined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined</em>'.
	 * @see QVTOperational.OperationalTransformation#getRefined()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_Refined();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.OperationalTransformation#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see QVTOperational.OperationalTransformation#getRelation()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_Relation();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.OperationalTransformation#getTransformation_h <em>Transformation h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation h</em>'.
	 * @see QVTOperational.OperationalTransformation#getTransformation_h()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_Transformation_h();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.OperationalTransformation#getModule_element <em>Module element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module element</em>'.
	 * @see QVTOperational.OperationalTransformation#getModule_element()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_Module_element();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ResolveExp <em>Resolve Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Exp</em>'.
	 * @see QVTOperational.ResolveExp
	 * @generated
	 */
	EClass getResolveExp();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ResolveExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see QVTOperational.ResolveExp#getCondition()
	 * @see #getResolveExp()
	 * @generated
	 */
	EReference getResolveExp_Condition();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.ResolveExp#getIsDeferred <em>Is Deferred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deferred</em>'.
	 * @see QVTOperational.ResolveExp#getIsDeferred()
	 * @see #getResolveExp()
	 * @generated
	 */
	EAttribute getResolveExp_IsDeferred();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.ResolveExp#getIsInverse <em>Is Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inverse</em>'.
	 * @see QVTOperational.ResolveExp#getIsInverse()
	 * @see #getResolveExp()
	 * @generated
	 */
	EAttribute getResolveExp_IsInverse();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.ResolveExp#getOne <em>One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One</em>'.
	 * @see QVTOperational.ResolveExp#getOne()
	 * @see #getResolveExp()
	 * @generated
	 */
	EAttribute getResolveExp_One();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ResolveExp#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see QVTOperational.ResolveExp#getTarget()
	 * @see #getResolveExp()
	 * @generated
	 */
	EReference getResolveExp_Target();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ResolveInExp <em>Resolve In Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve In Exp</em>'.
	 * @see QVTOperational.ResolveInExp
	 * @generated
	 */
	EClass getResolveInExp();

	/**
	 * Returns the meta object for the reference '{@link QVTOperational.ResolveInExp#getInMapping <em>In Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Mapping</em>'.
	 * @see QVTOperational.ResolveInExp#getInMapping()
	 * @see #getResolveInExp()
	 * @generated
	 */
	EReference getResolveInExp_InMapping();

	/**
	 * Returns the meta object for class '{@link QVTOperational.VarParameter <em>Var Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Parameter</em>'.
	 * @see QVTOperational.VarParameter
	 * @generated
	 */
	EClass getVarParameter();

	/**
	 * Returns the meta object for the container reference '{@link QVTOperational.VarParameter#getCtxOwner <em>Ctx Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ctx Owner</em>'.
	 * @see QVTOperational.VarParameter#getCtxOwner()
	 * @see #getVarParameter()
	 * @generated
	 */
	EReference getVarParameter_CtxOwner();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.VarParameter#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see QVTOperational.VarParameter#getKind()
	 * @see #getVarParameter()
	 * @generated
	 */
	EAttribute getVarParameter_Kind();

	/**
	 * Returns the meta object for the container reference '{@link QVTOperational.VarParameter#getResOwner <em>Res Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Res Owner</em>'.
	 * @see QVTOperational.VarParameter#getResOwner()
	 * @see #getVarParameter()
	 * @generated
	 */
	EReference getVarParameter_ResOwner();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.VarParameter#getDeclarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declarator</em>'.
	 * @see QVTOperational.VarParameter#getDeclarator()
	 * @see #getVarParameter()
	 * @generated
	 */
	EReference getVarParameter_Declarator();

	/**
	 * Returns the meta object for class '{@link QVTOperational.TopLevelGO <em>Top Level GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level GO</em>'.
	 * @see QVTOperational.TopLevelGO
	 * @generated
	 */
	EClass getTopLevelGO();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.TopLevelGO#getUnit_element <em>Unit element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit element</em>'.
	 * @see QVTOperational.TopLevelGO#getUnit_element()
	 * @see #getTopLevelGO()
	 * @generated
	 */
	EReference getTopLevelGO_Unit_element();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.TopLevelGO#getModuleimport <em>Moduleimport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moduleimport</em>'.
	 * @see QVTOperational.TopLevelGO#getModuleimport()
	 * @see #getTopLevelGO()
	 * @generated
	 */
	EReference getTopLevelGO_Moduleimport();

	/**
	 * Returns the meta object for class '{@link QVTOperational.UnitRefGO <em>Unit Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Ref GO</em>'.
	 * @see QVTOperational.UnitRefGO
	 * @generated
	 */
	EClass getUnitRefGO();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.UnitRefGO#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see QVTOperational.UnitRefGO#getIdentifier()
	 * @see #getUnitRefGO()
	 * @generated
	 */
	EAttribute getUnitRefGO_Identifier();

	/**
	 * Returns the meta object for class '{@link QVTOperational.TagGO <em>Tag GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag GO</em>'.
	 * @see QVTOperational.TagGO
	 * @generated
	 */
	EClass getTagGO();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.TagGO#getTagid <em>Tagid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tagid</em>'.
	 * @see QVTOperational.TagGO#getTagid()
	 * @see #getTagGO()
	 * @generated
	 */
	EAttribute getTagGO_Tagid();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.TagGO#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see QVTOperational.TagGO#getScoped_identifier()
	 * @see #getTagGO()
	 * @generated
	 */
	EReference getTagGO_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.TagGO#getTagvalue <em>Tagvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tagvalue</em>'.
	 * @see QVTOperational.TagGO#getTagvalue()
	 * @see #getTagGO()
	 * @generated
	 */
	EReference getTagGO_Tagvalue();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MetaModelGO <em>Meta Model GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model GO</em>'.
	 * @see QVTOperational.MetaModelGO
	 * @generated
	 */
	EClass getMetaModelGO();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MetaModelGO#getMetamodel_h <em>Metamodel h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metamodel h</em>'.
	 * @see QVTOperational.MetaModelGO#getMetamodel_h()
	 * @see #getMetaModelGO()
	 * @generated
	 */
	EReference getMetaModelGO_Metamodel_h();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.MetaModelGO#getMetamodel_element <em>Metamodel element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodel element</em>'.
	 * @see QVTOperational.MetaModelGO#getMetamodel_element()
	 * @see #getMetaModelGO()
	 * @generated
	 */
	EReference getMetaModelGO_Metamodel_element();

	/**
	 * Returns the meta object for class '{@link QVTOperational.AccessDecl <em>Access Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Decl</em>'.
	 * @see QVTOperational.AccessDecl
	 * @generated
	 */
	EClass getAccessDecl();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.AccessDecl#getAccess_usage <em>Access usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access usage</em>'.
	 * @see QVTOperational.AccessDecl#getAccess_usage()
	 * @see #getAccessDecl()
	 * @generated
	 */
	EReference getAccessDecl_Access_usage();

	/**
	 * Returns the meta object for class '{@link QVTOperational.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Def</em>'.
	 * @see QVTOperational.TypeDef
	 * @generated
	 */
	EClass getTypeDef();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.TypeDef#getTypespec <em>Typespec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typespec</em>'.
	 * @see QVTOperational.TypeDef#getTypespec()
	 * @see #getTypeDef()
	 * @generated
	 */
	EReference getTypeDef_Typespec();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.TypeDef#getTypedef_condition <em>Typedef condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typedef condition</em>'.
	 * @see QVTOperational.TypeDef#getTypedef_condition()
	 * @see #getTypeDef()
	 * @generated
	 */
	EReference getTypeDef_Typedef_condition();

	/**
	 * Returns the meta object for class '{@link QVTOperational.TransformationHeader <em>Transformation Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Header</em>'.
	 * @see QVTOperational.TransformationHeader
	 * @generated
	 */
	EClass getTransformationHeader();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.TransformationHeader#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see QVTOperational.TransformationHeader#getQualifier()
	 * @see #getTransformationHeader()
	 * @generated
	 */
	EAttribute getTransformationHeader_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.TransformationHeader#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QVTOperational.TransformationHeader#getName()
	 * @see #getTransformationHeader()
	 * @generated
	 */
	EAttribute getTransformationHeader_Name();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.TransformationHeader#getTransformation_signature <em>Transformation signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation signature</em>'.
	 * @see QVTOperational.TransformationHeader#getTransformation_signature()
	 * @see #getTransformationHeader()
	 * @generated
	 */
	EReference getTransformationHeader_Transformation_signature();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.TransformationHeader#getTransformation_usage_refine <em>Transformation usage refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation usage refine</em>'.
	 * @see QVTOperational.TransformationHeader#getTransformation_usage_refine()
	 * @see #getTransformationHeader()
	 * @generated
	 */
	EReference getTransformationHeader_Transformation_usage_refine();

	/**
	 * Returns the meta object for class '{@link QVTOperational.SimpleSignature <em>Simple Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Signature</em>'.
	 * @see QVTOperational.SimpleSignature
	 * @generated
	 */
	EClass getSimpleSignature();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.SimpleSignature#getParam_list <em>Param list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param list</em>'.
	 * @see QVTOperational.SimpleSignature#getParam_list()
	 * @see #getSimpleSignature()
	 * @generated
	 */
	EReference getSimpleSignature_Param_list();

	/**
	 * Returns the meta object for class '{@link QVTOperational.TransformationUsageRefine <em>Transformation Usage Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Usage Refine</em>'.
	 * @see QVTOperational.TransformationUsageRefine
	 * @generated
	 */
	EClass getTransformationUsageRefine();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.TransformationUsageRefine#getModule_usage <em>Module usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module usage</em>'.
	 * @see QVTOperational.TransformationUsageRefine#getModule_usage()
	 * @see #getTransformationUsageRefine()
	 * @generated
	 */
	EReference getTransformationUsageRefine_Module_usage();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.TransformationUsageRefine#getTransformation_refine <em>Transformation refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation refine</em>'.
	 * @see QVTOperational.TransformationUsageRefine#getTransformation_refine()
	 * @see #getTransformationUsageRefine()
	 * @generated
	 */
	EReference getTransformationUsageRefine_Transformation_refine();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ModuleRefGO <em>Module Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Ref GO</em>'.
	 * @see QVTOperational.ModuleRefGO
	 * @generated
	 */
	EClass getModuleRefGO();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ModuleRefGO#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see QVTOperational.ModuleRefGO#getScoped_identifier()
	 * @see #getModuleRefGO()
	 * @generated
	 */
	EReference getModuleRefGO_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ModuleRefGO#getSimple_signature <em>Simple signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple signature</em>'.
	 * @see QVTOperational.ModuleRefGO#getSimple_signature()
	 * @see #getModuleRefGO()
	 * @generated
	 */
	EReference getModuleRefGO_Simple_signature();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ModuleUsageGO <em>Module Usage GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Usage GO</em>'.
	 * @see QVTOperational.ModuleUsageGO
	 * @generated
	 */
	EClass getModuleUsageGO();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ModuleUsageGO#getAccess_usage <em>Access usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access usage</em>'.
	 * @see QVTOperational.ModuleUsageGO#getAccess_usage()
	 * @see #getModuleUsageGO()
	 * @generated
	 */
	EReference getModuleUsageGO_Access_usage();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ModuleUsageGO#getExtends_usage <em>Extends usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extends usage</em>'.
	 * @see QVTOperational.ModuleUsageGO#getExtends_usage()
	 * @see #getModuleUsageGO()
	 * @generated
	 */
	EReference getModuleUsageGO_Extends_usage();

	/**
	 * Returns the meta object for class '{@link QVTOperational.LibraryHeader <em>Library Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Header</em>'.
	 * @see QVTOperational.LibraryHeader
	 * @generated
	 */
	EClass getLibraryHeader();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.LibraryHeader#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QVTOperational.LibraryHeader#getName()
	 * @see #getLibraryHeader()
	 * @generated
	 */
	EAttribute getLibraryHeader_Name();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.LibraryHeader#getLibrary_signature <em>Library signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library signature</em>'.
	 * @see QVTOperational.LibraryHeader#getLibrary_signature()
	 * @see #getLibraryHeader()
	 * @generated
	 */
	EReference getLibraryHeader_Library_signature();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.LibraryHeader#getModule_usage <em>Module usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module usage</em>'.
	 * @see QVTOperational.LibraryHeader#getModule_usage()
	 * @see #getLibraryHeader()
	 * @generated
	 */
	EReference getLibraryHeader_Module_usage();

	/**
	 * Returns the meta object for class '{@link QVTOperational.AccessUsage <em>Access Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Usage</em>'.
	 * @see QVTOperational.AccessUsage
	 * @generated
	 */
	EClass getAccessUsage();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.AccessUsage#getModule_kind <em>Module kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module kind</em>'.
	 * @see QVTOperational.AccessUsage#getModule_kind()
	 * @see #getAccessUsage()
	 * @generated
	 */
	EAttribute getAccessUsage_Module_kind();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.AccessUsage#getModuleref_list <em>Moduleref list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moduleref list</em>'.
	 * @see QVTOperational.AccessUsage#getModuleref_list()
	 * @see #getAccessUsage()
	 * @generated
	 */
	EReference getAccessUsage_Moduleref_list();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ExtendsUsage <em>Extends Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extends Usage</em>'.
	 * @see QVTOperational.ExtendsUsage
	 * @generated
	 */
	EClass getExtendsUsage();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.ExtendsUsage#getModule_kind <em>Module kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module kind</em>'.
	 * @see QVTOperational.ExtendsUsage#getModule_kind()
	 * @see #getExtendsUsage()
	 * @generated
	 */
	EAttribute getExtendsUsage_Module_kind();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.ExtendsUsage#getModuleref_list <em>Moduleref list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moduleref list</em>'.
	 * @see QVTOperational.ExtendsUsage#getModuleref_list()
	 * @see #getExtendsUsage()
	 * @generated
	 */
	EReference getExtendsUsage_Moduleref_list();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ScopedIdentifier <em>Scoped Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Identifier</em>'.
	 * @see QVTOperational.ScopedIdentifier
	 * @generated
	 */
	EClass getScopedIdentifier();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.ScopedIdentifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see QVTOperational.ScopedIdentifier#getIdentifier()
	 * @see #getScopedIdentifier()
	 * @generated
	 */
	EAttribute getScopedIdentifier_Identifier();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ParamList <em>Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param List</em>'.
	 * @see QVTOperational.ParamList
	 * @generated
	 */
	EClass getParamList();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.ParamList#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see QVTOperational.ParamList#getParam()
	 * @see #getParamList()
	 * @generated
	 */
	EReference getParamList_Param();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ClassifierGO <em>Classifier GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier GO</em>'.
	 * @see QVTOperational.ClassifierGO
	 * @generated
	 */
	EClass getClassifierGO();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierGO#getClassifier_h <em>Classifier h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier h</em>'.
	 * @see QVTOperational.ClassifierGO#getClassifier_h()
	 * @see #getClassifierGO()
	 * @generated
	 */
	EReference getClassifierGO_Classifier_h();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierGO#getClassifier_feature_list <em>Classifier feature list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier feature list</em>'.
	 * @see QVTOperational.ClassifierGO#getClassifier_feature_list()
	 * @see #getClassifierGO()
	 * @generated
	 */
	EReference getClassifierGO_Classifier_feature_list();

	/**
	 * Returns the meta object for class '{@link QVTOperational.Declarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarator</em>'.
	 * @see QVTOperational.Declarator
	 * @generated
	 */
	EClass getDeclarator();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.Declarator#getTypespec <em>Typespec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typespec</em>'.
	 * @see QVTOperational.Declarator#getTypespec()
	 * @see #getDeclarator()
	 * @generated
	 */
	EReference getDeclarator_Typespec();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.Declarator#getInit_part <em>Init part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init part</em>'.
	 * @see QVTOperational.Declarator#getInit_part()
	 * @see #getDeclarator()
	 * @generated
	 */
	EReference getDeclarator_Init_part();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.Declarator#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see QVTOperational.Declarator#getScoped_identifier()
	 * @see #getDeclarator()
	 * @generated
	 */
	EReference getDeclarator_Scoped_identifier();

	/**
	 * Returns the meta object for class '{@link QVTOperational.TypeSpec <em>Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Spec</em>'.
	 * @see QVTOperational.TypeSpec
	 * @generated
	 */
	EClass getTypeSpec();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.TypeSpec#getType_reference <em>Type reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type reference</em>'.
	 * @see QVTOperational.TypeSpec#getType_reference()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EReference getTypeSpec_Type_reference();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.TypeSpec#getExtent_location <em>Extent location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extent location</em>'.
	 * @see QVTOperational.TypeSpec#getExtent_location()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EAttribute getTypeSpec_Extent_location();

	/**
	 * Returns the meta object for class '{@link QVTOperational.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see QVTOperational.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.TypeReference#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see QVTOperational.TypeReference#getScoped_identifier()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.TypeReference#getComplex_type <em>Complex type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex type</em>'.
	 * @see QVTOperational.TypeReference#getComplex_type()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Complex_type();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see QVTOperational.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.ComplexType#getComplex_type_key <em>Complex type key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complex type key</em>'.
	 * @see QVTOperational.ComplexType#getComplex_type_key()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Complex_type_key();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.ComplexType#getCollection_key <em>Collection key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection key</em>'.
	 * @see QVTOperational.ComplexType#getCollection_key()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Collection_key();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.ComplexType#getTypespec <em>Typespec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typespec</em>'.
	 * @see QVTOperational.ComplexType#getTypespec()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Typespec();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ComplexType#getDeclarator_list <em>Declarator list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declarator list</em>'.
	 * @see QVTOperational.ComplexType#getDeclarator_list()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Declarator_list();

	/**
	 * Returns the meta object for class '{@link QVTOperational.DeclaratorList <em>Declarator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarator List</em>'.
	 * @see QVTOperational.DeclaratorList
	 * @generated
	 */
	EClass getDeclaratorList();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.DeclaratorList#getDeclarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarator</em>'.
	 * @see QVTOperational.DeclaratorList#getDeclarator()
	 * @see #getDeclaratorList()
	 * @generated
	 */
	EReference getDeclaratorList_Declarator();

	/**
	 * Returns the meta object for class '{@link QVTOperational.InitPart <em>Init Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Part</em>'.
	 * @see QVTOperational.InitPart
	 * @generated
	 */
	EClass getInitPart();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.InitPart#getInit_op <em>Init op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init op</em>'.
	 * @see QVTOperational.InitPart#getInit_op()
	 * @see #getInitPart()
	 * @generated
	 */
	EAttribute getInitPart_Init_op();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.InitPart#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see QVTOperational.InitPart#getExpression()
	 * @see #getInitPart()
	 * @generated
	 */
	EReference getInitPart_Expression();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ExpressionSemiList <em>Expression Semi List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Semi List</em>'.
	 * @see QVTOperational.ExpressionSemiList
	 * @generated
	 */
	EClass getExpressionSemiList();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.ExpressionSemiList#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see QVTOperational.ExpressionSemiList#getExpression()
	 * @see #getExpressionSemiList()
	 * @generated
	 */
	EReference getExpressionSemiList_Expression();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression List</em>'.
	 * @see QVTOperational.ExpressionList
	 * @generated
	 */
	EClass getExpressionList();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ExpressionList#getExpression_semi_list <em>Expression semi list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression semi list</em>'.
	 * @see QVTOperational.ExpressionList#getExpression_semi_list()
	 * @see #getExpressionList()
	 * @generated
	 */
	EReference getExpressionList_Expression_semi_list();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ExpressionBlock <em>Expression Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Block</em>'.
	 * @see QVTOperational.ExpressionBlock
	 * @generated
	 */
	EClass getExpressionBlock();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ExpressionBlock#getExpression_list <em>Expression list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression list</em>'.
	 * @see QVTOperational.ExpressionBlock#getExpression_list()
	 * @see #getExpressionBlock()
	 * @generated
	 */
	EReference getExpressionBlock_Expression_list();

	/**
	 * Returns the meta object for class '{@link QVTOperational.PackageRefGO <em>Package Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Ref GO</em>'.
	 * @see QVTOperational.PackageRefGO
	 * @generated
	 */
	EClass getPackageRefGO();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.PackageRefGO#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see QVTOperational.PackageRefGO#getScoped_identifier()
	 * @see #getPackageRefGO()
	 * @generated
	 */
	EReference getPackageRefGO_Scoped_identifier();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.PackageRefGO#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see QVTOperational.PackageRefGO#getUri()
	 * @see #getPackageRefGO()
	 * @generated
	 */
	EAttribute getPackageRefGO_Uri();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MetaModelHeader <em>Meta Model Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model Header</em>'.
	 * @see QVTOperational.MetaModelHeader
	 * @generated
	 */
	EClass getMetaModelHeader();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MetaModelHeader#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see QVTOperational.MetaModelHeader#getScoped_identifier()
	 * @see #getMetaModelHeader()
	 * @generated
	 */
	EReference getMetaModelHeader_Scoped_identifier();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model Element</em>'.
	 * @see QVTOperational.MetaModelElement
	 * @generated
	 */
	EClass getMetaModelElement();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MetaModelElement#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier</em>'.
	 * @see QVTOperational.MetaModelElement#getClassifier()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_Classifier();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MetaModelElement#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration</em>'.
	 * @see QVTOperational.MetaModelElement#getEnumeration()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_Enumeration();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MetaModelElement#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tag</em>'.
	 * @see QVTOperational.MetaModelElement#getTag()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_Tag();

	/**
	 * Returns the meta object for class '{@link QVTOperational.EnumerationGO <em>Enumeration GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration GO</em>'.
	 * @see QVTOperational.EnumerationGO
	 * @generated
	 */
	EClass getEnumerationGO();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.EnumerationGO#getEnumeration_h <em>Enumeration h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration h</em>'.
	 * @see QVTOperational.EnumerationGO#getEnumeration_h()
	 * @see #getEnumerationGO()
	 * @generated
	 */
	EReference getEnumerationGO_Enumeration_h();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.EnumerationGO#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see QVTOperational.EnumerationGO#getIdentifier()
	 * @see #getEnumerationGO()
	 * @generated
	 */
	EAttribute getEnumerationGO_Identifier();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ClassifierHeader <em>Classifier Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Header</em>'.
	 * @see QVTOperational.ClassifierHeader
	 * @generated
	 */
	EClass getClassifierHeader();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierHeader#getClassifier_info <em>Classifier info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier info</em>'.
	 * @see QVTOperational.ClassifierHeader#getClassifier_info()
	 * @see #getClassifierHeader()
	 * @generated
	 */
	EReference getClassifierHeader_Classifier_info();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierHeader#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see QVTOperational.ClassifierHeader#getScoped_identifier()
	 * @see #getClassifierHeader()
	 * @generated
	 */
	EReference getClassifierHeader_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierHeader#getClassifier_extension <em>Classifier extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier extension</em>'.
	 * @see QVTOperational.ClassifierHeader#getClassifier_extension()
	 * @see #getClassifierHeader()
	 * @generated
	 */
	EReference getClassifierHeader_Classifier_extension();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ClassifierFeatureList <em>Classifier Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Feature List</em>'.
	 * @see QVTOperational.ClassifierFeatureList
	 * @generated
	 */
	EClass getClassifierFeatureList();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.ClassifierFeatureList#getClassifier_feature <em>Classifier feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifier feature</em>'.
	 * @see QVTOperational.ClassifierFeatureList#getClassifier_feature()
	 * @see #getClassifierFeatureList()
	 * @generated
	 */
	EReference getClassifierFeatureList_Classifier_feature();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ClassifierInfo <em>Classifier Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Info</em>'.
	 * @see QVTOperational.ClassifierInfo
	 * @generated
	 */
	EClass getClassifierInfo();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.ClassifierInfo#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see QVTOperational.ClassifierInfo#getQualifier()
	 * @see #getClassifierInfo()
	 * @generated
	 */
	EAttribute getClassifierInfo_Qualifier();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ClassifierExtension <em>Classifier Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Extension</em>'.
	 * @see QVTOperational.ClassifierExtension
	 * @generated
	 */
	EClass getClassifierExtension();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierExtension#getScoped_identifier_list <em>Scoped identifier list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier list</em>'.
	 * @see QVTOperational.ClassifierExtension#getScoped_identifier_list()
	 * @see #getClassifierExtension()
	 * @generated
	 */
	EReference getClassifierExtension_Scoped_identifier_list();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ScopedIdentifierList <em>Scoped Identifier List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Identifier List</em>'.
	 * @see QVTOperational.ScopedIdentifierList
	 * @generated
	 */
	EClass getScopedIdentifierList();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.ScopedIdentifierList#getScoped_identifier_list <em>Scoped identifier list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scoped identifier list</em>'.
	 * @see QVTOperational.ScopedIdentifierList#getScoped_identifier_list()
	 * @see #getScopedIdentifierList()
	 * @generated
	 */
	EReference getScopedIdentifierList_Scoped_identifier_list();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ClassifierFeature <em>Classifier Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Feature</em>'.
	 * @see QVTOperational.ClassifierFeature
	 * @generated
	 */
	EClass getClassifierFeature();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierFeature#getFeature_qualifier <em>Feature qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature qualifier</em>'.
	 * @see QVTOperational.ClassifierFeature#getFeature_qualifier()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Feature_qualifier();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierFeature#getDeclarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declarator</em>'.
	 * @see QVTOperational.ClassifierFeature#getDeclarator()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Declarator();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierFeature#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see QVTOperational.ClassifierFeature#getMultiplicity()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Multiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierFeature#getOpposite_property <em>Opposite property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opposite property</em>'.
	 * @see QVTOperational.ClassifierFeature#getOpposite_property()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Opposite_property();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierFeature#getComplete_signature <em>Complete signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complete signature</em>'.
	 * @see QVTOperational.ClassifierFeature#getComplete_signature()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Complete_signature();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ClassifierFeature#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tag</em>'.
	 * @see QVTOperational.ClassifierFeature#getTag()
	 * @see #getClassifierFeature()
	 * @generated
	 */
	EReference getClassifierFeature_Tag();

	/**
	 * Returns the meta object for class '{@link QVTOperational.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity</em>'.
	 * @see QVTOperational.Multiplicity
	 * @generated
	 */
	EClass getMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.Multiplicity#getMultiplicity_range <em>Multiplicity range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity range</em>'.
	 * @see QVTOperational.Multiplicity#getMultiplicity_range()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EAttribute getMultiplicity_Multiplicity_range();

	/**
	 * Returns the meta object for class '{@link QVTOperational.OppositeProperty <em>Opposite Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opposite Property</em>'.
	 * @see QVTOperational.OppositeProperty
	 * @generated
	 */
	EClass getOppositeProperty();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.OppositeProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QVTOperational.OppositeProperty#getName()
	 * @see #getOppositeProperty()
	 * @generated
	 */
	EAttribute getOppositeProperty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.OppositeProperty#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see QVTOperational.OppositeProperty#getMultiplicity()
	 * @see #getOppositeProperty()
	 * @generated
	 */
	EReference getOppositeProperty_Multiplicity();

	/**
	 * Returns the meta object for class '{@link QVTOperational.StereotypeQualifier <em>Stereotype Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stereotype Qualifier</em>'.
	 * @see QVTOperational.StereotypeQualifier
	 * @generated
	 */
	EClass getStereotypeQualifier();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.StereotypeQualifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see QVTOperational.StereotypeQualifier#getIdentifier()
	 * @see #getStereotypeQualifier()
	 * @generated
	 */
	EAttribute getStereotypeQualifier_Identifier();

	/**
	 * Returns the meta object for class '{@link QVTOperational.FeatureQualifier <em>Feature Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Qualifier</em>'.
	 * @see QVTOperational.FeatureQualifier
	 * @generated
	 */
	EClass getFeatureQualifier();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.FeatureQualifier#getStereotype_qualifier <em>Stereotype qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stereotype qualifier</em>'.
	 * @see QVTOperational.FeatureQualifier#getStereotype_qualifier()
	 * @see #getFeatureQualifier()
	 * @generated
	 */
	EReference getFeatureQualifier_Stereotype_qualifier();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.FeatureQualifier#getFeature_key <em>Feature key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature key</em>'.
	 * @see QVTOperational.FeatureQualifier#getFeature_key()
	 * @see #getFeatureQualifier()
	 * @generated
	 */
	EAttribute getFeatureQualifier_Feature_key();

	/**
	 * Returns the meta object for class '{@link QVTOperational.CompleteSignature <em>Complete Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complete Signature</em>'.
	 * @see QVTOperational.CompleteSignature
	 * @generated
	 */
	EClass getCompleteSignature();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.CompleteSignature#getSimple_signature <em>Simple signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple signature</em>'.
	 * @see QVTOperational.CompleteSignature#getSimple_signature()
	 * @see #getCompleteSignature()
	 * @generated
	 */
	EReference getCompleteSignature_Simple_signature();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.CompleteSignature#getParam_list <em>Param list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param list</em>'.
	 * @see QVTOperational.CompleteSignature#getParam_list()
	 * @see #getCompleteSignature()
	 * @generated
	 */
	EReference getCompleteSignature_Param_list();

	/**
	 * Returns the meta object for class '{@link QVTOperational.EnumerationHeader <em>Enumeration Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Header</em>'.
	 * @see QVTOperational.EnumerationHeader
	 * @generated
	 */
	EClass getEnumerationHeader();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.EnumerationHeader#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see QVTOperational.EnumerationHeader#getIdentifier()
	 * @see #getEnumerationHeader()
	 * @generated
	 */
	EAttribute getEnumerationHeader_Identifier();

	/**
	 * Returns the meta object for class '{@link QVTOperational.HelperInfo <em>Helper Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Info</em>'.
	 * @see QVTOperational.HelperInfo
	 * @generated
	 */
	EClass getHelperInfo();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.HelperInfo#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see QVTOperational.HelperInfo#getQualifier()
	 * @see #getHelperInfo()
	 * @generated
	 */
	EAttribute getHelperInfo_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.HelperInfo#getHelper_kind <em>Helper kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Helper kind</em>'.
	 * @see QVTOperational.HelperInfo#getHelper_kind()
	 * @see #getHelperInfo()
	 * @generated
	 */
	EAttribute getHelperInfo_Helper_kind();

	/**
	 * Returns the meta object for class '{@link QVTOperational.HelperHeader <em>Helper Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Header</em>'.
	 * @see QVTOperational.HelperHeader
	 * @generated
	 */
	EClass getHelperHeader();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.HelperHeader#getHelper_info <em>Helper info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Helper info</em>'.
	 * @see QVTOperational.HelperHeader#getHelper_info()
	 * @see #getHelperHeader()
	 * @generated
	 */
	EReference getHelperHeader_Helper_info();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.HelperHeader#getScope_identifier <em>Scope identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope identifier</em>'.
	 * @see QVTOperational.HelperHeader#getScope_identifier()
	 * @see #getHelperHeader()
	 * @generated
	 */
	EReference getHelperHeader_Scope_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.HelperHeader#getComplete_signature <em>Complete signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complete signature</em>'.
	 * @see QVTOperational.HelperHeader#getComplete_signature()
	 * @see #getHelperHeader()
	 * @generated
	 */
	EReference getHelperHeader_Complete_signature();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ConstructorHeader <em>Constructor Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Header</em>'.
	 * @see QVTOperational.ConstructorHeader
	 * @generated
	 */
	EClass getConstructorHeader();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.ConstructorHeader#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see QVTOperational.ConstructorHeader#getQualifier()
	 * @see #getConstructorHeader()
	 * @generated
	 */
	EAttribute getConstructorHeader_Qualifier();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ConstructorHeader#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see QVTOperational.ConstructorHeader#getScoped_identifier()
	 * @see #getConstructorHeader()
	 * @generated
	 */
	EReference getConstructorHeader_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.ConstructorHeader#getSimple_signature <em>Simple signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple signature</em>'.
	 * @see QVTOperational.ConstructorHeader#getSimple_signature()
	 * @see #getConstructorHeader()
	 * @generated
	 */
	EReference getConstructorHeader_Simple_signature();

	/**
	 * Returns the meta object for class '{@link QVTOperational.EntryHeader <em>Entry Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Header</em>'.
	 * @see QVTOperational.EntryHeader
	 * @generated
	 */
	EClass getEntryHeader();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.EntryHeader#getSimple_signature <em>Simple signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple signature</em>'.
	 * @see QVTOperational.EntryHeader#getSimple_signature()
	 * @see #getEntryHeader()
	 * @generated
	 */
	EReference getEntryHeader_Simple_signature();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MappingHeader <em>Mapping Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Header</em>'.
	 * @see QVTOperational.MappingHeader
	 * @generated
	 */
	EClass getMappingHeader();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.MappingHeader#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see QVTOperational.MappingHeader#getQualifier()
	 * @see #getMappingHeader()
	 * @generated
	 */
	EAttribute getMappingHeader_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.MappingHeader#getParam_direction <em>Param direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param direction</em>'.
	 * @see QVTOperational.MappingHeader#getParam_direction()
	 * @see #getMappingHeader()
	 * @generated
	 */
	EAttribute getMappingHeader_Param_direction();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingHeader#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see QVTOperational.MappingHeader#getScoped_identifier()
	 * @see #getMappingHeader()
	 * @generated
	 */
	EReference getMappingHeader_Scoped_identifier();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingHeader#getComplete_signature <em>Complete signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complete signature</em>'.
	 * @see QVTOperational.MappingHeader#getComplete_signature()
	 * @see #getMappingHeader()
	 * @generated
	 */
	EReference getMappingHeader_Complete_signature();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTOperational.MappingHeader#getMapping_extra <em>Mapping extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping extra</em>'.
	 * @see QVTOperational.MappingHeader#getMapping_extra()
	 * @see #getMappingHeader()
	 * @generated
	 */
	EReference getMappingHeader_Mapping_extra();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MappingFullHeader <em>Mapping Full Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Full Header</em>'.
	 * @see QVTOperational.MappingFullHeader
	 * @generated
	 */
	EClass getMappingFullHeader();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingFullHeader#getMapping_header <em>Mapping header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping header</em>'.
	 * @see QVTOperational.MappingFullHeader#getMapping_header()
	 * @see #getMappingFullHeader()
	 * @generated
	 */
	EReference getMappingFullHeader_Mapping_header();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingFullHeader#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see QVTOperational.MappingFullHeader#getWhen()
	 * @see #getMappingFullHeader()
	 * @generated
	 */
	EReference getMappingFullHeader_When();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingFullHeader#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see QVTOperational.MappingFullHeader#getWhere()
	 * @see #getMappingFullHeader()
	 * @generated
	 */
	EReference getMappingFullHeader_Where();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MappingExtra <em>Mapping Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Extra</em>'.
	 * @see QVTOperational.MappingExtra
	 * @generated
	 */
	EClass getMappingExtra();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingExtra#getMapping_extension <em>Mapping extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping extension</em>'.
	 * @see QVTOperational.MappingExtra#getMapping_extension()
	 * @see #getMappingExtra()
	 * @generated
	 */
	EReference getMappingExtra_Mapping_extension();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingExtra#getMapping_refinement <em>Mapping refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping refinement</em>'.
	 * @see QVTOperational.MappingExtra#getMapping_refinement()
	 * @see #getMappingExtra()
	 * @generated
	 */
	EReference getMappingExtra_Mapping_refinement();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MappingExtension <em>Mapping Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Extension</em>'.
	 * @see QVTOperational.MappingExtension
	 * @generated
	 */
	EClass getMappingExtension();

	/**
	 * Returns the meta object for the attribute '{@link QVTOperational.MappingExtension#getMapping_extension_key <em>Mapping extension key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping extension key</em>'.
	 * @see QVTOperational.MappingExtension#getMapping_extension_key()
	 * @see #getMappingExtension()
	 * @generated
	 */
	EAttribute getMappingExtension_Mapping_extension_key();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingExtension#getScoped_identifier_list <em>Scoped identifier list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier list</em>'.
	 * @see QVTOperational.MappingExtension#getScoped_identifier_list()
	 * @see #getMappingExtension()
	 * @generated
	 */
	EReference getMappingExtension_Scoped_identifier_list();

	/**
	 * Returns the meta object for class '{@link QVTOperational.MappingRefinement <em>Mapping Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Refinement</em>'.
	 * @see QVTOperational.MappingRefinement
	 * @generated
	 */
	EClass getMappingRefinement();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.MappingRefinement#getScoped_identifier <em>Scoped identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped identifier</em>'.
	 * @see QVTOperational.MappingRefinement#getScoped_identifier()
	 * @see #getMappingRefinement()
	 * @generated
	 */
	EReference getMappingRefinement_Scoped_identifier();

	/**
	 * Returns the meta object for class '{@link QVTOperational.PopulationSection <em>Population Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population Section</em>'.
	 * @see QVTOperational.PopulationSection
	 * @generated
	 */
	EClass getPopulationSection();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.PopulationSection#getExpression_list <em>Expression list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression list</em>'.
	 * @see QVTOperational.PopulationSection#getExpression_list()
	 * @see #getPopulationSection()
	 * @generated
	 */
	EReference getPopulationSection_Expression_list();

	/**
	 * Returns the meta object for the containment reference '{@link QVTOperational.PopulationSection#getExpression_block <em>Expression block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression block</em>'.
	 * @see QVTOperational.PopulationSection#getExpression_block()
	 * @see #getPopulationSection()
	 * @generated
	 */
	EReference getPopulationSection_Expression_block();

	/**
	 * Returns the meta object for class '{@link QVTOperational.ExpressionGO <em>Expression GO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression GO</em>'.
	 * @see QVTOperational.ExpressionGO
	 * @generated
	 */
	EClass getExpressionGO();

	/**
	 * Returns the meta object for the attribute list '{@link QVTOperational.ExpressionGO#getDummyContent <em>Dummy Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dummy Content</em>'.
	 * @see QVTOperational.ExpressionGO#getDummyContent()
	 * @see #getExpressionGO()
	 * @generated
	 */
	EAttribute getExpressionGO_DummyContent();

	/**
	 * Returns the meta object for enum '{@link QVTOperational.DirectionKind <em>Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Kind</em>'.
	 * @see QVTOperational.DirectionKind
	 * @generated
	 */
	EEnum getDirectionKind();

	/**
	 * Returns the meta object for enum '{@link QVTOperational.ImportKind <em>Import Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Import Kind</em>'.
	 * @see QVTOperational.ImportKind
	 * @generated
	 */
	EEnum getImportKind();

	/**
	 * Returns the meta object for enum '{@link QVTOperational.GeneralQualifier <em>General Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>General Qualifier</em>'.
	 * @see QVTOperational.GeneralQualifier
	 * @generated
	 */
	EEnum getGeneralQualifier();

	/**
	 * Returns the meta object for enum '{@link QVTOperational.ModuleKind <em>Module Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Kind</em>'.
	 * @see QVTOperational.ModuleKind
	 * @generated
	 */
	EEnum getModuleKind();

	/**
	 * Returns the meta object for enum '{@link QVTOperational.ComplexTypeKey <em>Complex Type Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Complex Type Key</em>'.
	 * @see QVTOperational.ComplexTypeKey
	 * @generated
	 */
	EEnum getComplexTypeKey();

	/**
	 * Returns the meta object for enum '{@link QVTOperational.FeatureKey <em>Feature Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Key</em>'.
	 * @see QVTOperational.FeatureKey
	 * @generated
	 */
	EEnum getFeatureKey();

	/**
	 * Returns the meta object for enum '{@link QVTOperational.PropertyKey <em>Property Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Key</em>'.
	 * @see QVTOperational.PropertyKey
	 * @generated
	 */
	EEnum getPropertyKey();

	/**
	 * Returns the meta object for enum '{@link QVTOperational.HelperKind <em>Helper Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Helper Kind</em>'.
	 * @see QVTOperational.HelperKind
	 * @generated
	 */
	EEnum getHelperKind();

	/**
	 * Returns the meta object for enum '{@link QVTOperational.MappingExtensionKey <em>Mapping Extension Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mapping Extension Key</em>'.
	 * @see QVTOperational.MappingExtensionKey
	 * @generated
	 */
	EEnum getMappingExtensionKey();

	/**
	 * Returns the meta object for enum '{@link QVTOperational.CollectionKey <em>Collection Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Key</em>'.
	 * @see QVTOperational.CollectionKey
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
	QVTOperationalFactory getQVTOperationalFactory();

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
		 * The meta object literal for the '{@link QVTOperational.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ConstructorImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getConstructor()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ConstructorBodyImpl <em>Constructor Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ConstructorBodyImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getConstructorBody()
		 * @generated
		 */
		EClass CONSTRUCTOR_BODY = eINSTANCE.getConstructorBody();

		/**
		 * The meta object literal for the '{@link QVTOperational.impl.ContextualPropertyImpl <em>Contextual Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ContextualPropertyImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getContextualProperty()
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
		 * The meta object literal for the '{@link QVTOperational.impl.EntryOperationImpl <em>Entry Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.EntryOperationImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getEntryOperation()
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
		 * The meta object literal for the '{@link QVTOperational.impl.HelperImpl <em>Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.HelperImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getHelper()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ImperativeCallExpImpl <em>Imperative Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ImperativeCallExpImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getImperativeCallExp()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ImperativeOperationImpl <em>Imperative Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ImperativeOperationImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getImperativeOperation()
		 * @generated
		 */
		EClass IMPERATIVE_OPERATION = eINSTANCE.getImperativeOperation();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__BODY = eINSTANCE.getImperativeOperation_Body();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__CONTEXT = eINSTANCE.getImperativeOperation_Context();

		/**
		 * The meta object literal for the '<em><b>Is Blackbox</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPERATIVE_OPERATION__IS_BLACKBOX = eINSTANCE.getImperativeOperation_IsBlackbox();

		/**
		 * The meta object literal for the '<em><b>Overridden</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__OVERRIDDEN = eINSTANCE.getImperativeOperation_Overridden();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__RESULT = eINSTANCE.getImperativeOperation_Result();

		/**
		 * The meta object literal for the '{@link QVTOperational.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.LibraryImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getLibrary()
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
		 * The meta object literal for the '{@link QVTOperational.impl.MappingBodyImpl <em>Mapping Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MappingBodyImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingBody()
		 * @generated
		 */
		EClass MAPPING_BODY = eINSTANCE.getMappingBody();

		/**
		 * The meta object literal for the '<em><b>End Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_BODY__END_SECTION = eINSTANCE.getMappingBody_EndSection();

		/**
		 * The meta object literal for the '<em><b>Init Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_BODY__INIT_SECTION = eINSTANCE.getMappingBody_InitSection();

		/**
		 * The meta object literal for the '<em><b>Population section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_BODY__POPULATION_SECTION = eINSTANCE.getMappingBody_Population_section();

		/**
		 * The meta object literal for the '{@link QVTOperational.impl.MappingCallExpImpl <em>Mapping Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MappingCallExpImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingCallExp()
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
		 * The meta object literal for the '{@link QVTOperational.impl.MappingOperationImpl <em>Mapping Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MappingOperationImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingOperation()
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
		 * The meta object literal for the '<em><b>Inherited</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__INHERITED = eINSTANCE.getMappingOperation_Inherited();

		/**
		 * The meta object literal for the '<em><b>Merged</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__MERGED = eINSTANCE.getMappingOperation_Merged();

		/**
		 * The meta object literal for the '<em><b>Refined Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__REFINED_RELATION = eINSTANCE.getMappingOperation_RefinedRelation();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__WHEN = eINSTANCE.getMappingOperation_When();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
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
		 * The meta object literal for the '{@link QVTOperational.impl.MappingParameterImpl <em>Mapping Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MappingParameterImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingParameter()
		 * @generated
		 */
		EClass MAPPING_PARAMETER = eINSTANCE.getMappingParameter();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_PARAMETER__EXTENT = eINSTANCE.getMappingParameter_Extent();

		/**
		 * The meta object literal for the '<em><b>Referred Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_PARAMETER__REFERRED_DOMAIN = eINSTANCE.getMappingParameter_ReferredDomain();

		/**
		 * The meta object literal for the '{@link QVTOperational.impl.ModelParameterImpl <em>Model Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ModelParameterImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModelParameter()
		 * @generated
		 */
		EClass MODEL_PARAMETER = eINSTANCE.getModelParameter();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PARAMETER__MODULE = eINSTANCE.getModelParameter_Module();

		/**
		 * The meta object literal for the '{@link QVTOperational.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ModelTypeImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

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
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__METAMODEL = eINSTANCE.getModelType_Metamodel();

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
		 * The meta object literal for the '{@link QVTOperational.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ModuleImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Config Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CONFIG_PROPERTY = eINSTANCE.getModule_ConfigProperty();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ENTRY = eINSTANCE.getModule_Entry();

		/**
		 * The meta object literal for the '<em><b>Module Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULE_IMPORT = eINSTANCE.getModule_ModuleImport();

		/**
		 * The meta object literal for the '<em><b>Owned Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OWNED_TAG = eINSTANCE.getModule_OwnedTag();

		/**
		 * The meta object literal for the '<em><b>Owned Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OWNED_VARIABLE = eINSTANCE.getModule_OwnedVariable();

		/**
		 * The meta object literal for the '<em><b>Used Model Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__USED_MODEL_TYPE = eINSTANCE.getModule_UsedModelType();

		/**
		 * The meta object literal for the '{@link QVTOperational.impl.ModuleImportImpl <em>Module Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ModuleImportImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModuleImport()
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
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPORT__MODULE = eINSTANCE.getModuleImport_Module();

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
		 * The meta object literal for the '{@link QVTOperational.impl.ObjectExpImpl <em>Object Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ObjectExpImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getObjectExp()
		 * @generated
		 */
		EClass OBJECT_EXP = eINSTANCE.getObjectExp();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXP__BODY = eINSTANCE.getObjectExp_Body();

		/**
		 * The meta object literal for the '<em><b>Referred Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXP__REFERRED_OBJECT = eINSTANCE.getObjectExp_ReferredObject();

		/**
		 * The meta object literal for the '{@link QVTOperational.impl.OperationBodyImpl <em>Operation Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.OperationBodyImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getOperationBody()
		 * @generated
		 */
		EClass OPERATION_BODY = eINSTANCE.getOperationBody();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BODY__CONTENT = eINSTANCE.getOperationBody_Content();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BODY__OPERATION = eINSTANCE.getOperationBody_Operation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BODY__VARIABLE = eINSTANCE.getOperationBody_Variable();

		/**
		 * The meta object literal for the '{@link QVTOperational.impl.OperationalTransformationImpl <em>Operational Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.OperationalTransformationImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getOperationalTransformation()
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
		 * The meta object literal for the '<em><b>Refined</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__REFINED = eINSTANCE.getOperationalTransformation_Refined();

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
		 * The meta object literal for the '{@link QVTOperational.impl.ResolveExpImpl <em>Resolve Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ResolveExpImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getResolveExp()
		 * @generated
		 */
		EClass RESOLVE_EXP = eINSTANCE.getResolveExp();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_EXP__CONDITION = eINSTANCE.getResolveExp_Condition();

		/**
		 * The meta object literal for the '<em><b>Is Deferred</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_EXP__IS_DEFERRED = eINSTANCE.getResolveExp_IsDeferred();

		/**
		 * The meta object literal for the '<em><b>Is Inverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_EXP__IS_INVERSE = eINSTANCE.getResolveExp_IsInverse();

		/**
		 * The meta object literal for the '<em><b>One</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_EXP__ONE = eINSTANCE.getResolveExp_One();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_EXP__TARGET = eINSTANCE.getResolveExp_Target();

		/**
		 * The meta object literal for the '{@link QVTOperational.impl.ResolveInExpImpl <em>Resolve In Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ResolveInExpImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getResolveInExp()
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
		 * The meta object literal for the '{@link QVTOperational.impl.VarParameterImpl <em>Var Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.VarParameterImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getVarParameter()
		 * @generated
		 */
		EClass VAR_PARAMETER = eINSTANCE.getVarParameter();

		/**
		 * The meta object literal for the '<em><b>Ctx Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_PARAMETER__CTX_OWNER = eINSTANCE.getVarParameter_CtxOwner();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_PARAMETER__KIND = eINSTANCE.getVarParameter_Kind();

		/**
		 * The meta object literal for the '<em><b>Res Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_PARAMETER__RES_OWNER = eINSTANCE.getVarParameter_ResOwner();

		/**
		 * The meta object literal for the '<em><b>Declarator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_PARAMETER__DECLARATOR = eINSTANCE.getVarParameter_Declarator();

		/**
		 * The meta object literal for the '{@link QVTOperational.impl.TopLevelGOImpl <em>Top Level GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.TopLevelGOImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTopLevelGO()
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
		 * The meta object literal for the '{@link QVTOperational.impl.UnitRefGOImpl <em>Unit Ref GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.UnitRefGOImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getUnitRefGO()
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
		 * The meta object literal for the '{@link QVTOperational.impl.TagGOImpl <em>Tag GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.TagGOImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTagGO()
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
		 * The meta object literal for the '{@link QVTOperational.impl.MetaModelGOImpl <em>Meta Model GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MetaModelGOImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMetaModelGO()
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
		 * The meta object literal for the '{@link QVTOperational.impl.AccessDeclImpl <em>Access Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.AccessDeclImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getAccessDecl()
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
		 * The meta object literal for the '{@link QVTOperational.impl.TypeDefImpl <em>Type Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.TypeDefImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTypeDef()
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
		 * The meta object literal for the '{@link QVTOperational.impl.TransformationHeaderImpl <em>Transformation Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.TransformationHeaderImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTransformationHeader()
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
		 * The meta object literal for the '{@link QVTOperational.impl.SimpleSignatureImpl <em>Simple Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.SimpleSignatureImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getSimpleSignature()
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
		 * The meta object literal for the '{@link QVTOperational.impl.TransformationUsageRefineImpl <em>Transformation Usage Refine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.TransformationUsageRefineImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTransformationUsageRefine()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ModuleRefGOImpl <em>Module Ref GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ModuleRefGOImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModuleRefGO()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ModuleUsageGOImpl <em>Module Usage GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ModuleUsageGOImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModuleUsageGO()
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
		 * The meta object literal for the '{@link QVTOperational.impl.LibraryHeaderImpl <em>Library Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.LibraryHeaderImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getLibraryHeader()
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
		 * The meta object literal for the '{@link QVTOperational.impl.AccessUsageImpl <em>Access Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.AccessUsageImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getAccessUsage()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ExtendsUsageImpl <em>Extends Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ExtendsUsageImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getExtendsUsage()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ScopedIdentifierImpl <em>Scoped Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ScopedIdentifierImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getScopedIdentifier()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ParamListImpl <em>Param List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ParamListImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getParamList()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ClassifierGOImpl <em>Classifier GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ClassifierGOImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierGO()
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
		 * The meta object literal for the '{@link QVTOperational.impl.DeclaratorImpl <em>Declarator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.DeclaratorImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getDeclarator()
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
		 * The meta object literal for the '{@link QVTOperational.impl.TypeSpecImpl <em>Type Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.TypeSpecImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTypeSpec()
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
		 * The meta object literal for the '{@link QVTOperational.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.TypeReferenceImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getTypeReference()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ComplexTypeImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getComplexType()
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
		 * The meta object literal for the '{@link QVTOperational.impl.DeclaratorListImpl <em>Declarator List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.DeclaratorListImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getDeclaratorList()
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
		 * The meta object literal for the '{@link QVTOperational.impl.InitPartImpl <em>Init Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.InitPartImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getInitPart()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ExpressionSemiListImpl <em>Expression Semi List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ExpressionSemiListImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getExpressionSemiList()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ExpressionListImpl <em>Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ExpressionListImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getExpressionList()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ExpressionBlockImpl <em>Expression Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ExpressionBlockImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getExpressionBlock()
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
		 * The meta object literal for the '{@link QVTOperational.impl.PackageRefGOImpl <em>Package Ref GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.PackageRefGOImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getPackageRefGO()
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
		 * The meta object literal for the '{@link QVTOperational.impl.MetaModelHeaderImpl <em>Meta Model Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MetaModelHeaderImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMetaModelHeader()
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
		 * The meta object literal for the '{@link QVTOperational.impl.MetaModelElementImpl <em>Meta Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MetaModelElementImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMetaModelElement()
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
		 * The meta object literal for the '{@link QVTOperational.impl.EnumerationGOImpl <em>Enumeration GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.EnumerationGOImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getEnumerationGO()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ClassifierHeaderImpl <em>Classifier Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ClassifierHeaderImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierHeader()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ClassifierFeatureListImpl <em>Classifier Feature List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ClassifierFeatureListImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierFeatureList()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ClassifierInfoImpl <em>Classifier Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ClassifierInfoImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierInfo()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ClassifierExtensionImpl <em>Classifier Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ClassifierExtensionImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierExtension()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ScopedIdentifierListImpl <em>Scoped Identifier List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ScopedIdentifierListImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getScopedIdentifierList()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ClassifierFeatureImpl <em>Classifier Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ClassifierFeatureImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getClassifierFeature()
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
		 * The meta object literal for the '{@link QVTOperational.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MultiplicityImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMultiplicity()
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
		 * The meta object literal for the '{@link QVTOperational.impl.OppositePropertyImpl <em>Opposite Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.OppositePropertyImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getOppositeProperty()
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
		 * The meta object literal for the '{@link QVTOperational.impl.StereotypeQualifierImpl <em>Stereotype Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.StereotypeQualifierImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getStereotypeQualifier()
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
		 * The meta object literal for the '{@link QVTOperational.impl.FeatureQualifierImpl <em>Feature Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.FeatureQualifierImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getFeatureQualifier()
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
		 * The meta object literal for the '{@link QVTOperational.impl.CompleteSignatureImpl <em>Complete Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.CompleteSignatureImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getCompleteSignature()
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
		 * The meta object literal for the '{@link QVTOperational.impl.EnumerationHeaderImpl <em>Enumeration Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.EnumerationHeaderImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getEnumerationHeader()
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
		 * The meta object literal for the '{@link QVTOperational.impl.HelperInfoImpl <em>Helper Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.HelperInfoImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getHelperInfo()
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
		 * The meta object literal for the '{@link QVTOperational.impl.HelperHeaderImpl <em>Helper Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.HelperHeaderImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getHelperHeader()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ConstructorHeaderImpl <em>Constructor Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ConstructorHeaderImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getConstructorHeader()
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
		 * The meta object literal for the '{@link QVTOperational.impl.EntryHeaderImpl <em>Entry Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.EntryHeaderImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getEntryHeader()
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
		 * The meta object literal for the '{@link QVTOperational.impl.MappingHeaderImpl <em>Mapping Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MappingHeaderImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingHeader()
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
		 * The meta object literal for the '{@link QVTOperational.impl.MappingFullHeaderImpl <em>Mapping Full Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MappingFullHeaderImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingFullHeader()
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
		 * The meta object literal for the '{@link QVTOperational.impl.MappingExtraImpl <em>Mapping Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MappingExtraImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingExtra()
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
		 * The meta object literal for the '{@link QVTOperational.impl.MappingExtensionImpl <em>Mapping Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MappingExtensionImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingExtension()
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
		 * The meta object literal for the '{@link QVTOperational.impl.MappingRefinementImpl <em>Mapping Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.MappingRefinementImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingRefinement()
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
		 * The meta object literal for the '{@link QVTOperational.impl.PopulationSectionImpl <em>Population Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.PopulationSectionImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getPopulationSection()
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
		 * The meta object literal for the '{@link QVTOperational.impl.ExpressionGOImpl <em>Expression GO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.impl.ExpressionGOImpl
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getExpressionGO()
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
		 * The meta object literal for the '{@link QVTOperational.DirectionKind <em>Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.DirectionKind
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getDirectionKind()
		 * @generated
		 */
		EEnum DIRECTION_KIND = eINSTANCE.getDirectionKind();

		/**
		 * The meta object literal for the '{@link QVTOperational.ImportKind <em>Import Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.ImportKind
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getImportKind()
		 * @generated
		 */
		EEnum IMPORT_KIND = eINSTANCE.getImportKind();

		/**
		 * The meta object literal for the '{@link QVTOperational.GeneralQualifier <em>General Qualifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.GeneralQualifier
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getGeneralQualifier()
		 * @generated
		 */
		EEnum GENERAL_QUALIFIER = eINSTANCE.getGeneralQualifier();

		/**
		 * The meta object literal for the '{@link QVTOperational.ModuleKind <em>Module Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.ModuleKind
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getModuleKind()
		 * @generated
		 */
		EEnum MODULE_KIND = eINSTANCE.getModuleKind();

		/**
		 * The meta object literal for the '{@link QVTOperational.ComplexTypeKey <em>Complex Type Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.ComplexTypeKey
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getComplexTypeKey()
		 * @generated
		 */
		EEnum COMPLEX_TYPE_KEY = eINSTANCE.getComplexTypeKey();

		/**
		 * The meta object literal for the '{@link QVTOperational.FeatureKey <em>Feature Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.FeatureKey
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getFeatureKey()
		 * @generated
		 */
		EEnum FEATURE_KEY = eINSTANCE.getFeatureKey();

		/**
		 * The meta object literal for the '{@link QVTOperational.PropertyKey <em>Property Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.PropertyKey
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getPropertyKey()
		 * @generated
		 */
		EEnum PROPERTY_KEY = eINSTANCE.getPropertyKey();

		/**
		 * The meta object literal for the '{@link QVTOperational.HelperKind <em>Helper Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.HelperKind
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getHelperKind()
		 * @generated
		 */
		EEnum HELPER_KIND = eINSTANCE.getHelperKind();

		/**
		 * The meta object literal for the '{@link QVTOperational.MappingExtensionKey <em>Mapping Extension Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.MappingExtensionKey
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getMappingExtensionKey()
		 * @generated
		 */
		EEnum MAPPING_EXTENSION_KEY = eINSTANCE.getMappingExtensionKey();

		/**
		 * The meta object literal for the '{@link QVTOperational.CollectionKey <em>Collection Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTOperational.CollectionKey
		 * @see QVTOperational.impl.QVTOperationalPackageImpl#getCollectionKey()
		 * @generated
		 */
		EEnum COLLECTION_KEY = eINSTANCE.getCollectionKey();

	}

} //QVTOperationalPackage
