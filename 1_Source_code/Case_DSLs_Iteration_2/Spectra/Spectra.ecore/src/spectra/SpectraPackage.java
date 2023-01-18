/**
 */
package spectra;

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
 * @see spectra.SpectraFactory
 * @model kind="package"
 * @generated
 */
public interface SpectraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spectra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smlab.cs.tau.ac.il/syntech/Spectra";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spectra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpectraPackage eINSTANCE = spectra.impl.SpectraPackageImpl.init();

	/**
	 * The meta object id for the '{@link spectra.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.ModelImpl
	 * @see spectra.impl.SpectraPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.ImportImpl
	 * @see spectra.impl.SpectraPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.DeclImpl <em>Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.DeclImpl
	 * @see spectra.impl.SpectraPackageImpl#getDecl()
	 * @generated
	 */
	int DECL = 2;

	/**
	 * The number of structural features of the '<em>Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.WeightDefImpl <em>Weight Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.WeightDefImpl
	 * @see spectra.impl.SpectraPackageImpl#getWeightDef()
	 * @generated
	 */
	int WEIGHT_DEF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_DEF__NAME = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_DEF__NEGATIVE = DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_DEF__VALUE = DECL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_DEF__DEFINITION = DECL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Weight Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_DEF_FEATURE_COUNT = DECL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Weight Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_DEF_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.VarImpl
	 * @see spectra.impl.SpectraPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__KIND = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__VAR = DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = DECL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TypeDefImpl <em>Type Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TypeDefImpl
	 * @see spectra.impl.SpectraPackageImpl#getTypeDef()
	 * @generated
	 */
	int TYPE_DEF = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__NAME = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__TYPE = DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_FEATURE_COUNT = DECL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.ReferrableImpl <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.ReferrableImpl
	 * @see spectra.impl.SpectraPackageImpl#getReferrable()
	 * @generated
	 */
	int REFERRABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.VarDeclImpl <em>Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.VarDeclImpl
	 * @see spectra.impl.SpectraPackageImpl#getVarDecl()
	 * @generated
	 */
	int VAR_DECL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__NAME = REFERRABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL__TYPE = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECL_OPERATION_COUNT = REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TypeConstantImpl <em>Type Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TypeConstantImpl
	 * @see spectra.impl.SpectraPackageImpl#getTypeConstant()
	 * @generated
	 */
	int TYPE_CONSTANT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONSTANT__NAME = REFERRABLE__NAME;

	/**
	 * The number of structural features of the '<em>Type Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONSTANT_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONSTANT_OPERATION_COUNT = REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.DefineImpl <em>Define</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.DefineImpl
	 * @see spectra.impl.SpectraPackageImpl#getDefine()
	 * @generated
	 */
	int DEFINE = 9;

	/**
	 * The feature id for the '<em><b>Define List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE__DEFINE_LIST = DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Define</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_FEATURE_COUNT = DECL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Define</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.DefineDeclImpl <em>Define Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.DefineDeclImpl
	 * @see spectra.impl.SpectraPackageImpl#getDefineDecl()
	 * @generated
	 */
	int DEFINE_DECL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_DECL__NAME = REFERRABLE__NAME;

	/**
	 * The feature id for the '<em><b>Simple Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_DECL__SIMPLE_EXPR = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_DECL__DIMENSIONS = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inner Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_DECL__INNER_ARRAY = REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Define Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_DECL_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Define Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_DECL_OPERATION_COUNT = REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.DefineArrayImpl <em>Define Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.DefineArrayImpl
	 * @see spectra.impl.SpectraPackageImpl#getDefineArray()
	 * @generated
	 */
	int DEFINE_ARRAY = 11;

	/**
	 * The feature id for the '<em><b>Simple Exprs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_ARRAY__SIMPLE_EXPRS = 0;

	/**
	 * The feature id for the '<em><b>Inner Arrays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_ARRAY__INNER_ARRAYS = 1;

	/**
	 * The number of structural features of the '<em>Define Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_ARRAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Define Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.DefineRegExpImpl <em>Define Reg Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.DefineRegExpImpl
	 * @see spectra.impl.SpectraPackageImpl#getDefineRegExp()
	 * @generated
	 */
	int DEFINE_REG_EXP = 12;

	/**
	 * The feature id for the '<em><b>Define Regs List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_REG_EXP__DEFINE_REGS_LIST = DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Define Reg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_REG_EXP_FEATURE_COUNT = DECL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Define Reg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_REG_EXP_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.DefineRegExpDeclImpl <em>Define Reg Exp Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.DefineRegExpDeclImpl
	 * @see spectra.impl.SpectraPackageImpl#getDefineRegExpDecl()
	 * @generated
	 */
	int DEFINE_REG_EXP_DECL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_REG_EXP_DECL__NAME = REFERRABLE__NAME;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_REG_EXP_DECL__EXP = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Define Reg Exp Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_REG_EXP_DECL_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Define Reg Exp Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_REG_EXP_DECL_OPERATION_COUNT = REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.PatternParamListImpl <em>Pattern Param List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.PatternParamListImpl
	 * @see spectra.impl.SpectraPackageImpl#getPatternParamList()
	 * @generated
	 */
	int PATTERN_PARAM_LIST = 14;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAM_LIST__PARAMS = 0;

	/**
	 * The number of structural features of the '<em>Pattern Param List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAM_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pattern Param List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAM_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.PatternParamImpl <em>Pattern Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.PatternParamImpl
	 * @see spectra.impl.SpectraPackageImpl#getPatternParam()
	 * @generated
	 */
	int PATTERN_PARAM = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAM__NAME = REFERRABLE__NAME;

	/**
	 * The number of structural features of the '<em>Pattern Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAM_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pattern Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAM_OPERATION_COUNT = REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TypedParamListImpl <em>Typed Param List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TypedParamListImpl
	 * @see spectra.impl.SpectraPackageImpl#getTypedParamList()
	 * @generated
	 */
	int TYPED_PARAM_LIST = 16;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAM_LIST__PARAMS = 0;

	/**
	 * The number of structural features of the '<em>Typed Param List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAM_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Typed Param List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAM_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TypedParamImpl <em>Typed Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TypedParamImpl
	 * @see spectra.impl.SpectraPackageImpl#getTypedParam()
	 * @generated
	 */
	int TYPED_PARAM = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAM__NAME = REFERRABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAM__TYPE = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAM_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAM_OPERATION_COUNT = REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.CounterImpl
	 * @see spectra.impl.SpectraPackageImpl#getCounter()
	 * @generated
	 */
	int COUNTER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__NAME = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__RANGE = DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__INITIAL = DECL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reset Pred</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__RESET_PRED = DECL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inc Pred</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__INC_PRED = DECL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dec Pred</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__DEC_PRED = DECL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Overflow Method</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__OVERFLOW_METHOD = DECL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Underflow Method</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__UNDERFLOW_METHOD = DECL_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_FEATURE_COUNT = DECL_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.MonitorImpl <em>Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.MonitorImpl
	 * @see spectra.impl.SpectraPackageImpl#getMonitor()
	 * @generated
	 */
	int MONITOR = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__NAME = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TYPE = DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__INITIAL = DECL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Safety</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__SAFETY = DECL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State Inv</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__STATE_INV = DECL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_FEATURE_COUNT = DECL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.PatternImpl
	 * @see spectra.impl.SpectraPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PARAMS = DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var Decl List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__VAR_DECL_LIST = DECL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__INITIAL = DECL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Safety</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__SAFETY = DECL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>State Inv</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__STATE_INV = DECL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Justice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__JUSTICE = DECL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = DECL_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.PredicateImpl
	 * @see spectra.impl.SpectraPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NAME = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__PARAMS = DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__BODY = DECL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = DECL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.VarTypeImpl <em>Var Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.VarTypeImpl
	 * @see spectra.impl.SpectraPackageImpl#getVarType()
	 * @generated
	 */
	int VAR_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__SUBR = 1;

	/**
	 * The feature id for the '<em><b>Const</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__CONST = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__DIMENSIONS = 4;

	/**
	 * The number of structural features of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.LTLGarImpl <em>LTL Gar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.LTLGarImpl
	 * @see spectra.impl.SpectraPackageImpl#getLTLGar()
	 * @generated
	 */
	int LTL_GAR = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_GAR__NAME = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_GAR__PARAMS = DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_GAR__SAFETY = DECL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Inv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_GAR__STATE_INV = DECL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Justice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_GAR__JUSTICE = DECL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Temporal Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_GAR__TEMPORAL_EXPR = DECL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Trig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_GAR__TRIG = DECL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>LTL Gar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_GAR_FEATURE_COUNT = DECL_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>LTL Gar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_GAR_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.LTLAsmImpl <em>LTL Asm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.LTLAsmImpl
	 * @see spectra.impl.SpectraPackageImpl#getLTLAsm()
	 * @generated
	 */
	int LTL_ASM = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_ASM__NAME = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_ASM__PARAMS = DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_ASM__SAFETY = DECL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Inv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_ASM__STATE_INV = DECL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Justice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_ASM__JUSTICE = DECL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Temporal Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_ASM__TEMPORAL_EXPR = DECL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Trig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_ASM__TRIG = DECL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>LTL Asm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_ASM_FEATURE_COUNT = DECL_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>LTL Asm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_ASM_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.EXGarImpl <em>EX Gar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.EXGarImpl
	 * @see spectra.impl.SpectraPackageImpl#getEXGar()
	 * @generated
	 */
	int EX_GAR = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GAR__NAME = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GAR__ELEMENTS = DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reg Exp Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GAR__REG_EXP_POINTER = DECL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reg Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GAR__REG_EXP = DECL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EX Gar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GAR_FEATURE_COUNT = DECL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>EX Gar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GAR_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalExpressionImpl <em>Temporal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalExpressionImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalExpression()
	 * @generated
	 */
	int TEMPORAL_EXPRESSION = 26;

	/**
	 * The number of structural features of the '<em>Temporal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Temporal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.PredicateOrPatternReferrableImpl <em>Predicate Or Pattern Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.PredicateOrPatternReferrableImpl
	 * @see spectra.impl.SpectraPackageImpl#getPredicateOrPatternReferrable()
	 * @generated
	 */
	int PREDICATE_OR_PATTERN_REFERRABLE = 27;

	/**
	 * The number of structural features of the '<em>Predicate Or Pattern Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OR_PATTERN_REFERRABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Predicate Or Pattern Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OR_PATTERN_REFERRABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.SubrangeImpl <em>Subrange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.SubrangeImpl
	 * @see spectra.impl.SpectraPackageImpl#getSubrange()
	 * @generated
	 */
	int SUBRANGE = 28;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE__TO = 1;

	/**
	 * The number of structural features of the '<em>Subrange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subrange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TriggerImpl
	 * @see spectra.impl.SpectraPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 29;

	/**
	 * The feature id for the '<em><b>Init Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__INIT_POINTER = 0;

	/**
	 * The feature id for the '<em><b>Init Reg Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__INIT_REG_EXP = 1;

	/**
	 * The feature id for the '<em><b>Effect Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EFFECT_POINTER = 2;

	/**
	 * The feature id for the '<em><b>Effect Reg Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EFFECT_REG_EXP = 3;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.RegExpImpl <em>Reg Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.RegExpImpl
	 * @see spectra.impl.SpectraPackageImpl#getRegExp()
	 * @generated
	 */
	int REG_EXP = 30;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_EXP__VAL = 0;

	/**
	 * The feature id for the '<em><b>Assrt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_EXP__ASSRT = 1;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_EXP__EMPTY = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_EXP__LEFT = 3;

	/**
	 * The number of structural features of the '<em>Reg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_EXP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Reg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_EXP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.BooleanTermImpl <em>Boolean Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.BooleanTermImpl
	 * @see spectra.impl.SpectraPackageImpl#getBooleanTerm()
	 * @generated
	 */
	int BOOLEAN_TERM = 31;

	/**
	 * The feature id for the '<em><b>Rel Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TERM__REL_EXPR = 0;

	/**
	 * The number of structural features of the '<em>Boolean Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TERM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Boolean Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.ValueInRangeImpl <em>Value In Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.ValueInRangeImpl
	 * @see spectra.impl.SpectraPackageImpl#getValueInRange()
	 * @generated
	 */
	int VALUE_IN_RANGE = 32;

	/**
	 * The feature id for the '<em><b>Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_IN_RANGE__CONST = 0;

	/**
	 * The feature id for the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_IN_RANGE__INT = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_IN_RANGE__FROM = 2;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_IN_RANGE__MULTI = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_IN_RANGE__TO = 4;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_IN_RANGE__BOOLEAN_VALUE = 5;

	/**
	 * The number of structural features of the '<em>Value In Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_IN_RANGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Value In Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_IN_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.DomainVarDeclImpl <em>Domain Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.DomainVarDeclImpl
	 * @see spectra.impl.SpectraPackageImpl#getDomainVarDecl()
	 * @generated
	 */
	int DOMAIN_VAR_DECL = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VAR_DECL__NAME = REFERRABLE__NAME;

	/**
	 * The feature id for the '<em><b>Domain Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VAR_DECL__DOMAIN_TYPE = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VAR_DECL_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VAR_DECL_OPERATION_COUNT = REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.SizeDefineDeclImpl <em>Size Define Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.SizeDefineDeclImpl
	 * @see spectra.impl.SpectraPackageImpl#getSizeDefineDecl()
	 * @generated
	 */
	int SIZE_DEFINE_DECL = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_DEFINE_DECL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_DEFINE_DECL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Arith Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_DEFINE_DECL__ARITH_EXP = 2;

	/**
	 * The number of structural features of the '<em>Size Define Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_DEFINE_DECL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Size Define Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_DEFINE_DECL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalInExprImpl <em>Temporal In Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalInExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalInExpr()
	 * @generated
	 */
	int TEMPORAL_IN_EXPR = 35;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IN_EXPR__LEFT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IN_EXPR__NOT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IN_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IN_EXPR__VALUES = TEMPORAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Temporal In Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IN_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Temporal In Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IN_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalImpExprImpl <em>Temporal Imp Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalImpExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalImpExpr()
	 * @generated
	 */
	int TEMPORAL_IMP_EXPR = 36;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IMP_EXPR__LEFT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IMP_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IMP_EXPR__IMPLICATION = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Temporal Imp Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IMP_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Temporal Imp Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IMP_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalIffExprImpl <em>Temporal Iff Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalIffExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalIffExpr()
	 * @generated
	 */
	int TEMPORAL_IFF_EXPR = 37;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IFF_EXPR__ELEMENTS = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IFF_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Iff Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IFF_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal Iff Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_IFF_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalOrExprImpl <em>Temporal Or Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalOrExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalOrExpr()
	 * @generated
	 */
	int TEMPORAL_OR_EXPR = 38;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OR_EXPR__ELEMENTS = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OR_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Or Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OR_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal Or Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OR_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalAndExprImpl <em>Temporal And Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalAndExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalAndExpr()
	 * @generated
	 */
	int TEMPORAL_AND_EXPR = 39;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_AND_EXPR__ELEMENTS = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_AND_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal And Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_AND_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal And Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_AND_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalRelationalExprImpl <em>Temporal Relational Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalRelationalExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalRelationalExpr()
	 * @generated
	 */
	int TEMPORAL_RELATIONAL_EXPR = 40;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RELATIONAL_EXPR__LEFT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RELATIONAL_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RELATIONAL_EXPR__RIGHT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Temporal Relational Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RELATIONAL_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Temporal Relational Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RELATIONAL_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalRemainderExprImpl <em>Temporal Remainder Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalRemainderExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalRemainderExpr()
	 * @generated
	 */
	int TEMPORAL_REMAINDER_EXPR = 41;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REMAINDER_EXPR__LEFT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REMAINDER_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REMAINDER_EXPR__RIGHT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Temporal Remainder Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REMAINDER_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Temporal Remainder Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_REMAINDER_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalAdditiveExprImpl <em>Temporal Additive Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalAdditiveExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalAdditiveExpr()
	 * @generated
	 */
	int TEMPORAL_ADDITIVE_EXPR = 42;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_ADDITIVE_EXPR__ELEMENTS = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_ADDITIVE_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Additive Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_ADDITIVE_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal Additive Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_ADDITIVE_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalMultiplicativeExprImpl <em>Temporal Multiplicative Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalMultiplicativeExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalMultiplicativeExpr()
	 * @generated
	 */
	int TEMPORAL_MULTIPLICATIVE_EXPR = 43;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_MULTIPLICATIVE_EXPR__ELEMENTS = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_MULTIPLICATIVE_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Multiplicative Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_MULTIPLICATIVE_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal Multiplicative Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_MULTIPLICATIVE_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalBinaryExprImpl <em>Temporal Binary Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalBinaryExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalBinaryExpr()
	 * @generated
	 */
	int TEMPORAL_BINARY_EXPR = 44;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_BINARY_EXPR__ELEMENTS = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_BINARY_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Binary Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_BINARY_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal Binary Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_BINARY_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalUnaryExprImpl <em>Temporal Unary Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalUnaryExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalUnaryExpr()
	 * @generated
	 */
	int TEMPORAL_UNARY_EXPR = 45;

	/**
	 * The feature id for the '<em><b>Kinds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_UNARY_EXPR__KINDS = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_UNARY_EXPR__TUE = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Unary Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_UNARY_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal Unary Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_UNARY_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.TemporalPrimaryExprImpl <em>Temporal Primary Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.TemporalPrimaryExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getTemporalPrimaryExpr()
	 * @generated
	 */
	int TEMPORAL_PRIMARY_EXPR = 46;

	/**
	 * The feature id for the '<em><b>Pred Patt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRIMARY_EXPR__PRED_PATT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pred Patt Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRIMARY_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tpe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRIMARY_EXPR__TPE = TEMPORAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRIMARY_EXPR__POINTER = TEMPORAL_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRIMARY_EXPR__INDEX = TEMPORAL_EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Temporal Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION = TEMPORAL_EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRIMARY_EXPR__REGEXP = TEMPORAL_EXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Regexp Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRIMARY_EXPR__REGEXP_POINTER = TEMPORAL_EXPRESSION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Temporal Primary Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRIMARY_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Temporal Primary Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRIMARY_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.ConstantImpl
	 * @see spectra.impl.SpectraPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 47;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__BOOLEAN_VALUE = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__INTEGER_VALUE = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.BinaryRegExpImpl <em>Binary Reg Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.BinaryRegExpImpl
	 * @see spectra.impl.SpectraPackageImpl#getBinaryRegExp()
	 * @generated
	 */
	int BINARY_REG_EXP = 48;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REG_EXP__VAL = REG_EXP__VAL;

	/**
	 * The feature id for the '<em><b>Assrt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REG_EXP__ASSRT = REG_EXP__ASSRT;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REG_EXP__EMPTY = REG_EXP__EMPTY;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REG_EXP__LEFT = REG_EXP__LEFT;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REG_EXP__OP = REG_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REG_EXP__RIGHT = REG_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Reg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REG_EXP_FEATURE_COUNT = REG_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Reg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REG_EXP_OPERATION_COUNT = REG_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.UnaryRegExpImpl <em>Unary Reg Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.UnaryRegExpImpl
	 * @see spectra.impl.SpectraPackageImpl#getUnaryRegExp()
	 * @generated
	 */
	int UNARY_REG_EXP = 49;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__VAL = REG_EXP__VAL;

	/**
	 * The feature id for the '<em><b>Assrt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__ASSRT = REG_EXP__ASSRT;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__EMPTY = REG_EXP__EMPTY;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__LEFT = REG_EXP__LEFT;

	/**
	 * The feature id for the '<em><b>Kleened</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__KLEENED = REG_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Question Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__QUESTION_MARK = REG_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Plus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__PLUS = REG_EXP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Have Exact Repetition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__HAVE_EXACT_REPETITION = REG_EXP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exact Repetition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__EXACT_REPETITION = REG_EXP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Have At Least</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__HAVE_AT_LEAST = REG_EXP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>At Least</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__AT_LEAST = REG_EXP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Have Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__HAVE_RANGE = REG_EXP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__FROM = REG_EXP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>From Define</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__FROM_DEFINE = REG_EXP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__TO = REG_EXP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>To Define</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP__TO_DEFINE = REG_EXP_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Unary Reg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP_FEATURE_COUNT = REG_EXP_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Unary Reg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_REG_EXP_OPERATION_COUNT = REG_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.CompRegExpImpl <em>Comp Reg Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.CompRegExpImpl
	 * @see spectra.impl.SpectraPackageImpl#getCompRegExp()
	 * @generated
	 */
	int COMP_REG_EXP = 50;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_REG_EXP__VAL = REG_EXP__VAL;

	/**
	 * The feature id for the '<em><b>Assrt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_REG_EXP__ASSRT = REG_EXP__ASSRT;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_REG_EXP__EMPTY = REG_EXP__EMPTY;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_REG_EXP__LEFT = REG_EXP__LEFT;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_REG_EXP__COMP = REG_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comp Reg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_REG_EXP_FEATURE_COUNT = REG_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comp Reg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_REG_EXP_OPERATION_COUNT = REG_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.impl.QuantifierExprImpl <em>Quantifier Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.impl.QuantifierExprImpl
	 * @see spectra.impl.SpectraPackageImpl#getQuantifierExpr()
	 * @generated
	 */
	int QUANTIFIER_EXPR = 51;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR__OPERATOR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR__DOMAIN_VAR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR__TEMPORAL_EXPR = TEMPORAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantifier Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Quantifier Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spectra.VarOwner <em>Var Owner</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.VarOwner
	 * @see spectra.impl.SpectraPackageImpl#getVarOwner()
	 * @generated
	 */
	int VAR_OWNER = 52;

	/**
	 * The meta object id for the '{@link spectra.OverflowMethod <em>Overflow Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spectra.OverflowMethod
	 * @see spectra.impl.SpectraPackageImpl#getOverflowMethod()
	 * @generated
	 */
	int OVERFLOW_METHOD = 53;


	/**
	 * Returns the meta object for class '{@link spectra.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see spectra.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Model#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see spectra.Model#getImports()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Imports();

	/**
	 * Returns the meta object for the attribute '{@link spectra.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spectra.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see spectra.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for class '{@link spectra.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see spectra.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link spectra.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see spectra.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link spectra.Decl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decl</em>'.
	 * @see spectra.Decl
	 * @generated
	 */
	EClass getDecl();

	/**
	 * Returns the meta object for class '{@link spectra.WeightDef <em>Weight Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weight Def</em>'.
	 * @see spectra.WeightDef
	 * @generated
	 */
	EClass getWeightDef();

	/**
	 * Returns the meta object for the attribute '{@link spectra.WeightDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spectra.WeightDef#getName()
	 * @see #getWeightDef()
	 * @generated
	 */
	EAttribute getWeightDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link spectra.WeightDef#getNegative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative</em>'.
	 * @see spectra.WeightDef#getNegative()
	 * @see #getWeightDef()
	 * @generated
	 */
	EAttribute getWeightDef_Negative();

	/**
	 * Returns the meta object for the attribute '{@link spectra.WeightDef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see spectra.WeightDef#getValue()
	 * @see #getWeightDef()
	 * @generated
	 */
	EAttribute getWeightDef_Value();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.WeightDef#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see spectra.WeightDef#getDefinition()
	 * @see #getWeightDef()
	 * @generated
	 */
	EReference getWeightDef_Definition();

	/**
	 * Returns the meta object for class '{@link spectra.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see spectra.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for the attribute '{@link spectra.Var#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see spectra.Var#getKind()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.Var#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see spectra.Var#getVar()
	 * @see #getVar()
	 * @generated
	 */
	EReference getVar_Var();

	/**
	 * Returns the meta object for class '{@link spectra.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Def</em>'.
	 * @see spectra.TypeDef
	 * @generated
	 */
	EClass getTypeDef();

	/**
	 * Returns the meta object for the attribute '{@link spectra.TypeDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spectra.TypeDef#getName()
	 * @see #getTypeDef()
	 * @generated
	 */
	EAttribute getTypeDef_Name();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TypeDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see spectra.TypeDef#getType()
	 * @see #getTypeDef()
	 * @generated
	 */
	EReference getTypeDef_Type();

	/**
	 * Returns the meta object for class '{@link spectra.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Decl</em>'.
	 * @see spectra.VarDecl
	 * @generated
	 */
	EClass getVarDecl();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.VarDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see spectra.VarDecl#getType()
	 * @see #getVarDecl()
	 * @generated
	 */
	EReference getVarDecl_Type();

	/**
	 * Returns the meta object for class '{@link spectra.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see spectra.Referrable
	 * @generated
	 */
	EClass getReferrable();

	/**
	 * Returns the meta object for the attribute '{@link spectra.Referrable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spectra.Referrable#getName()
	 * @see #getReferrable()
	 * @generated
	 */
	EAttribute getReferrable_Name();

	/**
	 * Returns the meta object for class '{@link spectra.TypeConstant <em>Type Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Constant</em>'.
	 * @see spectra.TypeConstant
	 * @generated
	 */
	EClass getTypeConstant();

	/**
	 * Returns the meta object for class '{@link spectra.Define <em>Define</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define</em>'.
	 * @see spectra.Define
	 * @generated
	 */
	EClass getDefine();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Define#getDefineList <em>Define List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Define List</em>'.
	 * @see spectra.Define#getDefineList()
	 * @see #getDefine()
	 * @generated
	 */
	EReference getDefine_DefineList();

	/**
	 * Returns the meta object for class '{@link spectra.DefineDecl <em>Define Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define Decl</em>'.
	 * @see spectra.DefineDecl
	 * @generated
	 */
	EClass getDefineDecl();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.DefineDecl#getSimpleExpr <em>Simple Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Expr</em>'.
	 * @see spectra.DefineDecl#getSimpleExpr()
	 * @see #getDefineDecl()
	 * @generated
	 */
	EReference getDefineDecl_SimpleExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.DefineDecl#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see spectra.DefineDecl#getDimensions()
	 * @see #getDefineDecl()
	 * @generated
	 */
	EReference getDefineDecl_Dimensions();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.DefineDecl#getInnerArray <em>Inner Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner Array</em>'.
	 * @see spectra.DefineDecl#getInnerArray()
	 * @see #getDefineDecl()
	 * @generated
	 */
	EReference getDefineDecl_InnerArray();

	/**
	 * Returns the meta object for class '{@link spectra.DefineArray <em>Define Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define Array</em>'.
	 * @see spectra.DefineArray
	 * @generated
	 */
	EClass getDefineArray();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.DefineArray#getSimpleExprs <em>Simple Exprs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Exprs</em>'.
	 * @see spectra.DefineArray#getSimpleExprs()
	 * @see #getDefineArray()
	 * @generated
	 */
	EReference getDefineArray_SimpleExprs();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.DefineArray#getInnerArrays <em>Inner Arrays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Arrays</em>'.
	 * @see spectra.DefineArray#getInnerArrays()
	 * @see #getDefineArray()
	 * @generated
	 */
	EReference getDefineArray_InnerArrays();

	/**
	 * Returns the meta object for class '{@link spectra.DefineRegExp <em>Define Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define Reg Exp</em>'.
	 * @see spectra.DefineRegExp
	 * @generated
	 */
	EClass getDefineRegExp();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.DefineRegExp#getDefineRegsList <em>Define Regs List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Define Regs List</em>'.
	 * @see spectra.DefineRegExp#getDefineRegsList()
	 * @see #getDefineRegExp()
	 * @generated
	 */
	EReference getDefineRegExp_DefineRegsList();

	/**
	 * Returns the meta object for class '{@link spectra.DefineRegExpDecl <em>Define Reg Exp Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define Reg Exp Decl</em>'.
	 * @see spectra.DefineRegExpDecl
	 * @generated
	 */
	EClass getDefineRegExpDecl();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.DefineRegExpDecl#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see spectra.DefineRegExpDecl#getExp()
	 * @see #getDefineRegExpDecl()
	 * @generated
	 */
	EReference getDefineRegExpDecl_Exp();

	/**
	 * Returns the meta object for class '{@link spectra.PatternParamList <em>Pattern Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Param List</em>'.
	 * @see spectra.PatternParamList
	 * @generated
	 */
	EClass getPatternParamList();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.PatternParamList#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see spectra.PatternParamList#getParams()
	 * @see #getPatternParamList()
	 * @generated
	 */
	EReference getPatternParamList_Params();

	/**
	 * Returns the meta object for class '{@link spectra.PatternParam <em>Pattern Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Param</em>'.
	 * @see spectra.PatternParam
	 * @generated
	 */
	EClass getPatternParam();

	/**
	 * Returns the meta object for class '{@link spectra.TypedParamList <em>Typed Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Param List</em>'.
	 * @see spectra.TypedParamList
	 * @generated
	 */
	EClass getTypedParamList();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.TypedParamList#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see spectra.TypedParamList#getParams()
	 * @see #getTypedParamList()
	 * @generated
	 */
	EReference getTypedParamList_Params();

	/**
	 * Returns the meta object for class '{@link spectra.TypedParam <em>Typed Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Param</em>'.
	 * @see spectra.TypedParam
	 * @generated
	 */
	EClass getTypedParam();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TypedParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see spectra.TypedParam#getType()
	 * @see #getTypedParam()
	 * @generated
	 */
	EReference getTypedParam_Type();

	/**
	 * Returns the meta object for class '{@link spectra.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see spectra.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.Counter#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see spectra.Counter#getRange()
	 * @see #getCounter()
	 * @generated
	 */
	EReference getCounter_Range();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Counter#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial</em>'.
	 * @see spectra.Counter#getInitial()
	 * @see #getCounter()
	 * @generated
	 */
	EReference getCounter_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Counter#getResetPred <em>Reset Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reset Pred</em>'.
	 * @see spectra.Counter#getResetPred()
	 * @see #getCounter()
	 * @generated
	 */
	EReference getCounter_ResetPred();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Counter#getIncPred <em>Inc Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inc Pred</em>'.
	 * @see spectra.Counter#getIncPred()
	 * @see #getCounter()
	 * @generated
	 */
	EReference getCounter_IncPred();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Counter#getDecPred <em>Dec Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dec Pred</em>'.
	 * @see spectra.Counter#getDecPred()
	 * @see #getCounter()
	 * @generated
	 */
	EReference getCounter_DecPred();

	/**
	 * Returns the meta object for the attribute list '{@link spectra.Counter#getOverflowMethod <em>Overflow Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Overflow Method</em>'.
	 * @see spectra.Counter#getOverflowMethod()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_OverflowMethod();

	/**
	 * Returns the meta object for the attribute list '{@link spectra.Counter#getUnderflowMethod <em>Underflow Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Underflow Method</em>'.
	 * @see spectra.Counter#getUnderflowMethod()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_UnderflowMethod();

	/**
	 * Returns the meta object for class '{@link spectra.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor</em>'.
	 * @see spectra.Monitor
	 * @generated
	 */
	EClass getMonitor();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.Monitor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see spectra.Monitor#getType()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Monitor#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial</em>'.
	 * @see spectra.Monitor#getInitial()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Monitor#getSafety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Safety</em>'.
	 * @see spectra.Monitor#getSafety()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_Safety();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Monitor#getStateInv <em>State Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Inv</em>'.
	 * @see spectra.Monitor#getStateInv()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_StateInv();

	/**
	 * Returns the meta object for class '{@link spectra.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see spectra.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the attribute '{@link spectra.Pattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spectra.Pattern#getName()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Name();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.Pattern#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see spectra.Pattern#getParams()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Params();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Pattern#getVarDeclList <em>Var Decl List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var Decl List</em>'.
	 * @see spectra.Pattern#getVarDeclList()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_VarDeclList();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Pattern#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial</em>'.
	 * @see spectra.Pattern#getInitial()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Pattern#getSafety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Safety</em>'.
	 * @see spectra.Pattern#getSafety()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Safety();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Pattern#getStateInv <em>State Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Inv</em>'.
	 * @see spectra.Pattern#getStateInv()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_StateInv();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.Pattern#getJustice <em>Justice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Justice</em>'.
	 * @see spectra.Pattern#getJustice()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Justice();

	/**
	 * Returns the meta object for class '{@link spectra.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see spectra.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the attribute '{@link spectra.Predicate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spectra.Predicate#getName()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_Name();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.Predicate#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see spectra.Predicate#getParams()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Params();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.Predicate#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see spectra.Predicate#getBody()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Body();

	/**
	 * Returns the meta object for class '{@link spectra.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Type</em>'.
	 * @see spectra.VarType
	 * @generated
	 */
	EClass getVarType();

	/**
	 * Returns the meta object for the attribute '{@link spectra.VarType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spectra.VarType#getName()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.VarType#getSubr <em>Subr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subr</em>'.
	 * @see spectra.VarType#getSubr()
	 * @see #getVarType()
	 * @generated
	 */
	EReference getVarType_Subr();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.VarType#getConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Const</em>'.
	 * @see spectra.VarType#getConst()
	 * @see #getVarType()
	 * @generated
	 */
	EReference getVarType_Const();

	/**
	 * Returns the meta object for the reference '{@link spectra.VarType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see spectra.VarType#getType()
	 * @see #getVarType()
	 * @generated
	 */
	EReference getVarType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.VarType#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see spectra.VarType#getDimensions()
	 * @see #getVarType()
	 * @generated
	 */
	EReference getVarType_Dimensions();

	/**
	 * Returns the meta object for class '{@link spectra.LTLGar <em>LTL Gar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTL Gar</em>'.
	 * @see spectra.LTLGar
	 * @generated
	 */
	EClass getLTLGar();

	/**
	 * Returns the meta object for the attribute '{@link spectra.LTLGar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spectra.LTLGar#getName()
	 * @see #getLTLGar()
	 * @generated
	 */
	EAttribute getLTLGar_Name();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.LTLGar#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see spectra.LTLGar#getParams()
	 * @see #getLTLGar()
	 * @generated
	 */
	EReference getLTLGar_Params();

	/**
	 * Returns the meta object for the attribute '{@link spectra.LTLGar#getSafety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety</em>'.
	 * @see spectra.LTLGar#getSafety()
	 * @see #getLTLGar()
	 * @generated
	 */
	EAttribute getLTLGar_Safety();

	/**
	 * Returns the meta object for the attribute '{@link spectra.LTLGar#getStateInv <em>State Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Inv</em>'.
	 * @see spectra.LTLGar#getStateInv()
	 * @see #getLTLGar()
	 * @generated
	 */
	EAttribute getLTLGar_StateInv();

	/**
	 * Returns the meta object for the attribute '{@link spectra.LTLGar#getJustice <em>Justice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justice</em>'.
	 * @see spectra.LTLGar#getJustice()
	 * @see #getLTLGar()
	 * @generated
	 */
	EAttribute getLTLGar_Justice();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.LTLGar#getTemporalExpr <em>Temporal Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Expr</em>'.
	 * @see spectra.LTLGar#getTemporalExpr()
	 * @see #getLTLGar()
	 * @generated
	 */
	EReference getLTLGar_TemporalExpr();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.LTLGar#getTrig <em>Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trig</em>'.
	 * @see spectra.LTLGar#getTrig()
	 * @see #getLTLGar()
	 * @generated
	 */
	EReference getLTLGar_Trig();

	/**
	 * Returns the meta object for class '{@link spectra.LTLAsm <em>LTL Asm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTL Asm</em>'.
	 * @see spectra.LTLAsm
	 * @generated
	 */
	EClass getLTLAsm();

	/**
	 * Returns the meta object for the attribute '{@link spectra.LTLAsm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spectra.LTLAsm#getName()
	 * @see #getLTLAsm()
	 * @generated
	 */
	EAttribute getLTLAsm_Name();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.LTLAsm#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see spectra.LTLAsm#getParams()
	 * @see #getLTLAsm()
	 * @generated
	 */
	EReference getLTLAsm_Params();

	/**
	 * Returns the meta object for the attribute '{@link spectra.LTLAsm#getSafety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety</em>'.
	 * @see spectra.LTLAsm#getSafety()
	 * @see #getLTLAsm()
	 * @generated
	 */
	EAttribute getLTLAsm_Safety();

	/**
	 * Returns the meta object for the attribute '{@link spectra.LTLAsm#getStateInv <em>State Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Inv</em>'.
	 * @see spectra.LTLAsm#getStateInv()
	 * @see #getLTLAsm()
	 * @generated
	 */
	EAttribute getLTLAsm_StateInv();

	/**
	 * Returns the meta object for the attribute '{@link spectra.LTLAsm#getJustice <em>Justice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justice</em>'.
	 * @see spectra.LTLAsm#getJustice()
	 * @see #getLTLAsm()
	 * @generated
	 */
	EAttribute getLTLAsm_Justice();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.LTLAsm#getTemporalExpr <em>Temporal Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Expr</em>'.
	 * @see spectra.LTLAsm#getTemporalExpr()
	 * @see #getLTLAsm()
	 * @generated
	 */
	EReference getLTLAsm_TemporalExpr();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.LTLAsm#getTrig <em>Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trig</em>'.
	 * @see spectra.LTLAsm#getTrig()
	 * @see #getLTLAsm()
	 * @generated
	 */
	EReference getLTLAsm_Trig();

	/**
	 * Returns the meta object for class '{@link spectra.EXGar <em>EX Gar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EX Gar</em>'.
	 * @see spectra.EXGar
	 * @generated
	 */
	EClass getEXGar();

	/**
	 * Returns the meta object for the attribute '{@link spectra.EXGar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spectra.EXGar#getName()
	 * @see #getEXGar()
	 * @generated
	 */
	EAttribute getEXGar_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.EXGar#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see spectra.EXGar#getElements()
	 * @see #getEXGar()
	 * @generated
	 */
	EReference getEXGar_Elements();

	/**
	 * Returns the meta object for the reference '{@link spectra.EXGar#getRegExpPointer <em>Reg Exp Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reg Exp Pointer</em>'.
	 * @see spectra.EXGar#getRegExpPointer()
	 * @see #getEXGar()
	 * @generated
	 */
	EReference getEXGar_RegExpPointer();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.EXGar#getRegExp <em>Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reg Exp</em>'.
	 * @see spectra.EXGar#getRegExp()
	 * @see #getEXGar()
	 * @generated
	 */
	EReference getEXGar_RegExp();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalExpression <em>Temporal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Expression</em>'.
	 * @see spectra.TemporalExpression
	 * @generated
	 */
	EClass getTemporalExpression();

	/**
	 * Returns the meta object for class '{@link spectra.PredicateOrPatternReferrable <em>Predicate Or Pattern Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Or Pattern Referrable</em>'.
	 * @see spectra.PredicateOrPatternReferrable
	 * @generated
	 */
	EClass getPredicateOrPatternReferrable();

	/**
	 * Returns the meta object for class '{@link spectra.Subrange <em>Subrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrange</em>'.
	 * @see spectra.Subrange
	 * @generated
	 */
	EClass getSubrange();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.Subrange#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see spectra.Subrange#getFrom()
	 * @see #getSubrange()
	 * @generated
	 */
	EReference getSubrange_From();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.Subrange#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see spectra.Subrange#getTo()
	 * @see #getSubrange()
	 * @generated
	 */
	EReference getSubrange_To();

	/**
	 * Returns the meta object for class '{@link spectra.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see spectra.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference '{@link spectra.Trigger#getInitPointer <em>Init Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init Pointer</em>'.
	 * @see spectra.Trigger#getInitPointer()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_InitPointer();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.Trigger#getInitRegExp <em>Init Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Reg Exp</em>'.
	 * @see spectra.Trigger#getInitRegExp()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_InitRegExp();

	/**
	 * Returns the meta object for the reference '{@link spectra.Trigger#getEffectPointer <em>Effect Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effect Pointer</em>'.
	 * @see spectra.Trigger#getEffectPointer()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_EffectPointer();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.Trigger#getEffectRegExp <em>Effect Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect Reg Exp</em>'.
	 * @see spectra.Trigger#getEffectRegExp()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_EffectRegExp();

	/**
	 * Returns the meta object for class '{@link spectra.RegExp <em>Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reg Exp</em>'.
	 * @see spectra.RegExp
	 * @generated
	 */
	EClass getRegExp();

	/**
	 * Returns the meta object for the attribute '{@link spectra.RegExp#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see spectra.RegExp#getVal()
	 * @see #getRegExp()
	 * @generated
	 */
	EAttribute getRegExp_Val();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.RegExp#getAssrt <em>Assrt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assrt</em>'.
	 * @see spectra.RegExp#getAssrt()
	 * @see #getRegExp()
	 * @generated
	 */
	EReference getRegExp_Assrt();

	/**
	 * Returns the meta object for the attribute '{@link spectra.RegExp#isEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty</em>'.
	 * @see spectra.RegExp#isEmpty()
	 * @see #getRegExp()
	 * @generated
	 */
	EAttribute getRegExp_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.RegExp#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see spectra.RegExp#getLeft()
	 * @see #getRegExp()
	 * @generated
	 */
	EReference getRegExp_Left();

	/**
	 * Returns the meta object for class '{@link spectra.BooleanTerm <em>Boolean Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Term</em>'.
	 * @see spectra.BooleanTerm
	 * @generated
	 */
	EClass getBooleanTerm();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.BooleanTerm#getRelExpr <em>Rel Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rel Expr</em>'.
	 * @see spectra.BooleanTerm#getRelExpr()
	 * @see #getBooleanTerm()
	 * @generated
	 */
	EReference getBooleanTerm_RelExpr();

	/**
	 * Returns the meta object for class '{@link spectra.ValueInRange <em>Value In Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value In Range</em>'.
	 * @see spectra.ValueInRange
	 * @generated
	 */
	EClass getValueInRange();

	/**
	 * Returns the meta object for the reference '{@link spectra.ValueInRange#getConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Const</em>'.
	 * @see spectra.ValueInRange#getConst()
	 * @see #getValueInRange()
	 * @generated
	 */
	EReference getValueInRange_Const();

	/**
	 * Returns the meta object for the attribute '{@link spectra.ValueInRange#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int</em>'.
	 * @see spectra.ValueInRange#getInt()
	 * @see #getValueInRange()
	 * @generated
	 */
	EAttribute getValueInRange_Int();

	/**
	 * Returns the meta object for the attribute '{@link spectra.ValueInRange#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see spectra.ValueInRange#getFrom()
	 * @see #getValueInRange()
	 * @generated
	 */
	EAttribute getValueInRange_From();

	/**
	 * Returns the meta object for the attribute '{@link spectra.ValueInRange#isMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see spectra.ValueInRange#isMulti()
	 * @see #getValueInRange()
	 * @generated
	 */
	EAttribute getValueInRange_Multi();

	/**
	 * Returns the meta object for the attribute '{@link spectra.ValueInRange#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see spectra.ValueInRange#getTo()
	 * @see #getValueInRange()
	 * @generated
	 */
	EAttribute getValueInRange_To();

	/**
	 * Returns the meta object for the attribute '{@link spectra.ValueInRange#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see spectra.ValueInRange#getBooleanValue()
	 * @see #getValueInRange()
	 * @generated
	 */
	EAttribute getValueInRange_BooleanValue();

	/**
	 * Returns the meta object for class '{@link spectra.DomainVarDecl <em>Domain Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Var Decl</em>'.
	 * @see spectra.DomainVarDecl
	 * @generated
	 */
	EClass getDomainVarDecl();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.DomainVarDecl#getDomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Type</em>'.
	 * @see spectra.DomainVarDecl#getDomainType()
	 * @see #getDomainVarDecl()
	 * @generated
	 */
	EReference getDomainVarDecl_DomainType();

	/**
	 * Returns the meta object for class '{@link spectra.SizeDefineDecl <em>Size Define Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Define Decl</em>'.
	 * @see spectra.SizeDefineDecl
	 * @generated
	 */
	EClass getSizeDefineDecl();

	/**
	 * Returns the meta object for the attribute '{@link spectra.SizeDefineDecl#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see spectra.SizeDefineDecl#getValue()
	 * @see #getSizeDefineDecl()
	 * @generated
	 */
	EAttribute getSizeDefineDecl_Value();

	/**
	 * Returns the meta object for the reference '{@link spectra.SizeDefineDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see spectra.SizeDefineDecl#getName()
	 * @see #getSizeDefineDecl()
	 * @generated
	 */
	EReference getSizeDefineDecl_Name();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.SizeDefineDecl#getArithExp <em>Arith Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arith Exp</em>'.
	 * @see spectra.SizeDefineDecl#getArithExp()
	 * @see #getSizeDefineDecl()
	 * @generated
	 */
	EReference getSizeDefineDecl_ArithExp();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalInExpr <em>Temporal In Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal In Expr</em>'.
	 * @see spectra.TemporalInExpr
	 * @generated
	 */
	EClass getTemporalInExpr();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TemporalInExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see spectra.TemporalInExpr#getLeft()
	 * @see #getTemporalInExpr()
	 * @generated
	 */
	EReference getTemporalInExpr_Left();

	/**
	 * Returns the meta object for the attribute '{@link spectra.TemporalInExpr#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see spectra.TemporalInExpr#isNot()
	 * @see #getTemporalInExpr()
	 * @generated
	 */
	EAttribute getTemporalInExpr_Not();

	/**
	 * Returns the meta object for the attribute '{@link spectra.TemporalInExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see spectra.TemporalInExpr#getOperator()
	 * @see #getTemporalInExpr()
	 * @generated
	 */
	EAttribute getTemporalInExpr_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.TemporalInExpr#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see spectra.TemporalInExpr#getValues()
	 * @see #getTemporalInExpr()
	 * @generated
	 */
	EReference getTemporalInExpr_Values();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalImpExpr <em>Temporal Imp Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Imp Expr</em>'.
	 * @see spectra.TemporalImpExpr
	 * @generated
	 */
	EClass getTemporalImpExpr();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TemporalImpExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see spectra.TemporalImpExpr#getLeft()
	 * @see #getTemporalImpExpr()
	 * @generated
	 */
	EReference getTemporalImpExpr_Left();

	/**
	 * Returns the meta object for the attribute '{@link spectra.TemporalImpExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see spectra.TemporalImpExpr#getOperator()
	 * @see #getTemporalImpExpr()
	 * @generated
	 */
	EAttribute getTemporalImpExpr_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TemporalImpExpr#getImplication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implication</em>'.
	 * @see spectra.TemporalImpExpr#getImplication()
	 * @see #getTemporalImpExpr()
	 * @generated
	 */
	EReference getTemporalImpExpr_Implication();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalIffExpr <em>Temporal Iff Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Iff Expr</em>'.
	 * @see spectra.TemporalIffExpr
	 * @generated
	 */
	EClass getTemporalIffExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.TemporalIffExpr#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see spectra.TemporalIffExpr#getElements()
	 * @see #getTemporalIffExpr()
	 * @generated
	 */
	EReference getTemporalIffExpr_Elements();

	/**
	 * Returns the meta object for the attribute '{@link spectra.TemporalIffExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see spectra.TemporalIffExpr#getOperator()
	 * @see #getTemporalIffExpr()
	 * @generated
	 */
	EAttribute getTemporalIffExpr_Operator();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalOrExpr <em>Temporal Or Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Or Expr</em>'.
	 * @see spectra.TemporalOrExpr
	 * @generated
	 */
	EClass getTemporalOrExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.TemporalOrExpr#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see spectra.TemporalOrExpr#getElements()
	 * @see #getTemporalOrExpr()
	 * @generated
	 */
	EReference getTemporalOrExpr_Elements();

	/**
	 * Returns the meta object for the attribute list '{@link spectra.TemporalOrExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operator</em>'.
	 * @see spectra.TemporalOrExpr#getOperator()
	 * @see #getTemporalOrExpr()
	 * @generated
	 */
	EAttribute getTemporalOrExpr_Operator();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalAndExpr <em>Temporal And Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal And Expr</em>'.
	 * @see spectra.TemporalAndExpr
	 * @generated
	 */
	EClass getTemporalAndExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.TemporalAndExpr#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see spectra.TemporalAndExpr#getElements()
	 * @see #getTemporalAndExpr()
	 * @generated
	 */
	EReference getTemporalAndExpr_Elements();

	/**
	 * Returns the meta object for the attribute list '{@link spectra.TemporalAndExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operator</em>'.
	 * @see spectra.TemporalAndExpr#getOperator()
	 * @see #getTemporalAndExpr()
	 * @generated
	 */
	EAttribute getTemporalAndExpr_Operator();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalRelationalExpr <em>Temporal Relational Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Relational Expr</em>'.
	 * @see spectra.TemporalRelationalExpr
	 * @generated
	 */
	EClass getTemporalRelationalExpr();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TemporalRelationalExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see spectra.TemporalRelationalExpr#getLeft()
	 * @see #getTemporalRelationalExpr()
	 * @generated
	 */
	EReference getTemporalRelationalExpr_Left();

	/**
	 * Returns the meta object for the attribute '{@link spectra.TemporalRelationalExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see spectra.TemporalRelationalExpr#getOperator()
	 * @see #getTemporalRelationalExpr()
	 * @generated
	 */
	EAttribute getTemporalRelationalExpr_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TemporalRelationalExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see spectra.TemporalRelationalExpr#getRight()
	 * @see #getTemporalRelationalExpr()
	 * @generated
	 */
	EReference getTemporalRelationalExpr_Right();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalRemainderExpr <em>Temporal Remainder Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Remainder Expr</em>'.
	 * @see spectra.TemporalRemainderExpr
	 * @generated
	 */
	EClass getTemporalRemainderExpr();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TemporalRemainderExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see spectra.TemporalRemainderExpr#getLeft()
	 * @see #getTemporalRemainderExpr()
	 * @generated
	 */
	EReference getTemporalRemainderExpr_Left();

	/**
	 * Returns the meta object for the attribute '{@link spectra.TemporalRemainderExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see spectra.TemporalRemainderExpr#getOperator()
	 * @see #getTemporalRemainderExpr()
	 * @generated
	 */
	EAttribute getTemporalRemainderExpr_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TemporalRemainderExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see spectra.TemporalRemainderExpr#getRight()
	 * @see #getTemporalRemainderExpr()
	 * @generated
	 */
	EReference getTemporalRemainderExpr_Right();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalAdditiveExpr <em>Temporal Additive Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Additive Expr</em>'.
	 * @see spectra.TemporalAdditiveExpr
	 * @generated
	 */
	EClass getTemporalAdditiveExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.TemporalAdditiveExpr#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see spectra.TemporalAdditiveExpr#getElements()
	 * @see #getTemporalAdditiveExpr()
	 * @generated
	 */
	EReference getTemporalAdditiveExpr_Elements();

	/**
	 * Returns the meta object for the attribute list '{@link spectra.TemporalAdditiveExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operator</em>'.
	 * @see spectra.TemporalAdditiveExpr#getOperator()
	 * @see #getTemporalAdditiveExpr()
	 * @generated
	 */
	EAttribute getTemporalAdditiveExpr_Operator();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalMultiplicativeExpr <em>Temporal Multiplicative Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Multiplicative Expr</em>'.
	 * @see spectra.TemporalMultiplicativeExpr
	 * @generated
	 */
	EClass getTemporalMultiplicativeExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.TemporalMultiplicativeExpr#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see spectra.TemporalMultiplicativeExpr#getElements()
	 * @see #getTemporalMultiplicativeExpr()
	 * @generated
	 */
	EReference getTemporalMultiplicativeExpr_Elements();

	/**
	 * Returns the meta object for the attribute list '{@link spectra.TemporalMultiplicativeExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operator</em>'.
	 * @see spectra.TemporalMultiplicativeExpr#getOperator()
	 * @see #getTemporalMultiplicativeExpr()
	 * @generated
	 */
	EAttribute getTemporalMultiplicativeExpr_Operator();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalBinaryExpr <em>Temporal Binary Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Binary Expr</em>'.
	 * @see spectra.TemporalBinaryExpr
	 * @generated
	 */
	EClass getTemporalBinaryExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.TemporalBinaryExpr#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see spectra.TemporalBinaryExpr#getElements()
	 * @see #getTemporalBinaryExpr()
	 * @generated
	 */
	EReference getTemporalBinaryExpr_Elements();

	/**
	 * Returns the meta object for the attribute list '{@link spectra.TemporalBinaryExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operator</em>'.
	 * @see spectra.TemporalBinaryExpr#getOperator()
	 * @see #getTemporalBinaryExpr()
	 * @generated
	 */
	EAttribute getTemporalBinaryExpr_Operator();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalUnaryExpr <em>Temporal Unary Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Unary Expr</em>'.
	 * @see spectra.TemporalUnaryExpr
	 * @generated
	 */
	EClass getTemporalUnaryExpr();

	/**
	 * Returns the meta object for the attribute '{@link spectra.TemporalUnaryExpr#getKinds <em>Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kinds</em>'.
	 * @see spectra.TemporalUnaryExpr#getKinds()
	 * @see #getTemporalUnaryExpr()
	 * @generated
	 */
	EAttribute getTemporalUnaryExpr_Kinds();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TemporalUnaryExpr#getTue <em>Tue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tue</em>'.
	 * @see spectra.TemporalUnaryExpr#getTue()
	 * @see #getTemporalUnaryExpr()
	 * @generated
	 */
	EReference getTemporalUnaryExpr_Tue();

	/**
	 * Returns the meta object for class '{@link spectra.TemporalPrimaryExpr <em>Temporal Primary Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Primary Expr</em>'.
	 * @see spectra.TemporalPrimaryExpr
	 * @generated
	 */
	EClass getTemporalPrimaryExpr();

	/**
	 * Returns the meta object for the reference '{@link spectra.TemporalPrimaryExpr#getPredPatt <em>Pred Patt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pred Patt</em>'.
	 * @see spectra.TemporalPrimaryExpr#getPredPatt()
	 * @see #getTemporalPrimaryExpr()
	 * @generated
	 */
	EReference getTemporalPrimaryExpr_PredPatt();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.TemporalPrimaryExpr#getPredPattParams <em>Pred Patt Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pred Patt Params</em>'.
	 * @see spectra.TemporalPrimaryExpr#getPredPattParams()
	 * @see #getTemporalPrimaryExpr()
	 * @generated
	 */
	EReference getTemporalPrimaryExpr_PredPattParams();

	/**
	 * Returns the meta object for the attribute '{@link spectra.TemporalPrimaryExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see spectra.TemporalPrimaryExpr#getOperator()
	 * @see #getTemporalPrimaryExpr()
	 * @generated
	 */
	EAttribute getTemporalPrimaryExpr_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TemporalPrimaryExpr#getTpe <em>Tpe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tpe</em>'.
	 * @see spectra.TemporalPrimaryExpr#getTpe()
	 * @see #getTemporalPrimaryExpr()
	 * @generated
	 */
	EReference getTemporalPrimaryExpr_Tpe();

	/**
	 * Returns the meta object for the reference '{@link spectra.TemporalPrimaryExpr#getPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pointer</em>'.
	 * @see spectra.TemporalPrimaryExpr#getPointer()
	 * @see #getTemporalPrimaryExpr()
	 * @generated
	 */
	EReference getTemporalPrimaryExpr_Pointer();

	/**
	 * Returns the meta object for the containment reference list '{@link spectra.TemporalPrimaryExpr#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see spectra.TemporalPrimaryExpr#getIndex()
	 * @see #getTemporalPrimaryExpr()
	 * @generated
	 */
	EReference getTemporalPrimaryExpr_Index();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TemporalPrimaryExpr#getTemporalExpression <em>Temporal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Expression</em>'.
	 * @see spectra.TemporalPrimaryExpr#getTemporalExpression()
	 * @see #getTemporalPrimaryExpr()
	 * @generated
	 */
	EReference getTemporalPrimaryExpr_TemporalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.TemporalPrimaryExpr#getRegexp <em>Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regexp</em>'.
	 * @see spectra.TemporalPrimaryExpr#getRegexp()
	 * @see #getTemporalPrimaryExpr()
	 * @generated
	 */
	EReference getTemporalPrimaryExpr_Regexp();

	/**
	 * Returns the meta object for the reference '{@link spectra.TemporalPrimaryExpr#getRegexpPointer <em>Regexp Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regexp Pointer</em>'.
	 * @see spectra.TemporalPrimaryExpr#getRegexpPointer()
	 * @see #getTemporalPrimaryExpr()
	 * @generated
	 */
	EReference getTemporalPrimaryExpr_RegexpPointer();

	/**
	 * Returns the meta object for class '{@link spectra.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see spectra.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link spectra.Constant#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see spectra.Constant#getBooleanValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_BooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link spectra.Constant#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Value</em>'.
	 * @see spectra.Constant#getIntegerValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_IntegerValue();

	/**
	 * Returns the meta object for class '{@link spectra.BinaryRegExp <em>Binary Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Reg Exp</em>'.
	 * @see spectra.BinaryRegExp
	 * @generated
	 */
	EClass getBinaryRegExp();

	/**
	 * Returns the meta object for the attribute '{@link spectra.BinaryRegExp#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see spectra.BinaryRegExp#getOp()
	 * @see #getBinaryRegExp()
	 * @generated
	 */
	EAttribute getBinaryRegExp_Op();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.BinaryRegExp#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see spectra.BinaryRegExp#getRight()
	 * @see #getBinaryRegExp()
	 * @generated
	 */
	EReference getBinaryRegExp_Right();

	/**
	 * Returns the meta object for class '{@link spectra.UnaryRegExp <em>Unary Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Reg Exp</em>'.
	 * @see spectra.UnaryRegExp
	 * @generated
	 */
	EClass getUnaryRegExp();

	/**
	 * Returns the meta object for the attribute '{@link spectra.UnaryRegExp#isKleened <em>Kleened</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kleened</em>'.
	 * @see spectra.UnaryRegExp#isKleened()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EAttribute getUnaryRegExp_Kleened();

	/**
	 * Returns the meta object for the attribute '{@link spectra.UnaryRegExp#isQuestionMark <em>Question Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Mark</em>'.
	 * @see spectra.UnaryRegExp#isQuestionMark()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EAttribute getUnaryRegExp_QuestionMark();

	/**
	 * Returns the meta object for the attribute '{@link spectra.UnaryRegExp#isPlus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plus</em>'.
	 * @see spectra.UnaryRegExp#isPlus()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EAttribute getUnaryRegExp_Plus();

	/**
	 * Returns the meta object for the attribute '{@link spectra.UnaryRegExp#isHaveExactRepetition <em>Have Exact Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Have Exact Repetition</em>'.
	 * @see spectra.UnaryRegExp#isHaveExactRepetition()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EAttribute getUnaryRegExp_HaveExactRepetition();

	/**
	 * Returns the meta object for the attribute '{@link spectra.UnaryRegExp#getExactRepetition <em>Exact Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exact Repetition</em>'.
	 * @see spectra.UnaryRegExp#getExactRepetition()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EAttribute getUnaryRegExp_ExactRepetition();

	/**
	 * Returns the meta object for the attribute '{@link spectra.UnaryRegExp#isHaveAtLeast <em>Have At Least</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Have At Least</em>'.
	 * @see spectra.UnaryRegExp#isHaveAtLeast()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EAttribute getUnaryRegExp_HaveAtLeast();

	/**
	 * Returns the meta object for the attribute '{@link spectra.UnaryRegExp#getAtLeast <em>At Least</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At Least</em>'.
	 * @see spectra.UnaryRegExp#getAtLeast()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EAttribute getUnaryRegExp_AtLeast();

	/**
	 * Returns the meta object for the attribute '{@link spectra.UnaryRegExp#isHaveRange <em>Have Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Have Range</em>'.
	 * @see spectra.UnaryRegExp#isHaveRange()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EAttribute getUnaryRegExp_HaveRange();

	/**
	 * Returns the meta object for the attribute '{@link spectra.UnaryRegExp#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see spectra.UnaryRegExp#getFrom()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EAttribute getUnaryRegExp_From();

	/**
	 * Returns the meta object for the reference '{@link spectra.UnaryRegExp#getFromDefine <em>From Define</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Define</em>'.
	 * @see spectra.UnaryRegExp#getFromDefine()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EReference getUnaryRegExp_FromDefine();

	/**
	 * Returns the meta object for the attribute '{@link spectra.UnaryRegExp#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see spectra.UnaryRegExp#getTo()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EAttribute getUnaryRegExp_To();

	/**
	 * Returns the meta object for the reference '{@link spectra.UnaryRegExp#getToDefine <em>To Define</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Define</em>'.
	 * @see spectra.UnaryRegExp#getToDefine()
	 * @see #getUnaryRegExp()
	 * @generated
	 */
	EReference getUnaryRegExp_ToDefine();

	/**
	 * Returns the meta object for class '{@link spectra.CompRegExp <em>Comp Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Reg Exp</em>'.
	 * @see spectra.CompRegExp
	 * @generated
	 */
	EClass getCompRegExp();

	/**
	 * Returns the meta object for the attribute '{@link spectra.CompRegExp#getComp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp</em>'.
	 * @see spectra.CompRegExp#getComp()
	 * @see #getCompRegExp()
	 * @generated
	 */
	EAttribute getCompRegExp_Comp();

	/**
	 * Returns the meta object for class '{@link spectra.QuantifierExpr <em>Quantifier Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantifier Expr</em>'.
	 * @see spectra.QuantifierExpr
	 * @generated
	 */
	EClass getQuantifierExpr();

	/**
	 * Returns the meta object for the attribute '{@link spectra.QuantifierExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see spectra.QuantifierExpr#getOperator()
	 * @see #getQuantifierExpr()
	 * @generated
	 */
	EAttribute getQuantifierExpr_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.QuantifierExpr#getDomainVar <em>Domain Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Var</em>'.
	 * @see spectra.QuantifierExpr#getDomainVar()
	 * @see #getQuantifierExpr()
	 * @generated
	 */
	EReference getQuantifierExpr_DomainVar();

	/**
	 * Returns the meta object for the containment reference '{@link spectra.QuantifierExpr#getTemporalExpr <em>Temporal Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Expr</em>'.
	 * @see spectra.QuantifierExpr#getTemporalExpr()
	 * @see #getQuantifierExpr()
	 * @generated
	 */
	EReference getQuantifierExpr_TemporalExpr();

	/**
	 * Returns the meta object for enum '{@link spectra.VarOwner <em>Var Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Var Owner</em>'.
	 * @see spectra.VarOwner
	 * @generated
	 */
	EEnum getVarOwner();

	/**
	 * Returns the meta object for enum '{@link spectra.OverflowMethod <em>Overflow Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Overflow Method</em>'.
	 * @see spectra.OverflowMethod
	 * @generated
	 */
	EEnum getOverflowMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpectraFactory getSpectraFactory();

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
		 * The meta object literal for the '{@link spectra.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.ModelImpl
		 * @see spectra.impl.SpectraPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '{@link spectra.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.ImportImpl
		 * @see spectra.impl.SpectraPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '{@link spectra.impl.DeclImpl <em>Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.DeclImpl
		 * @see spectra.impl.SpectraPackageImpl#getDecl()
		 * @generated
		 */
		EClass DECL = eINSTANCE.getDecl();

		/**
		 * The meta object literal for the '{@link spectra.impl.WeightDefImpl <em>Weight Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.WeightDefImpl
		 * @see spectra.impl.SpectraPackageImpl#getWeightDef()
		 * @generated
		 */
		EClass WEIGHT_DEF = eINSTANCE.getWeightDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIGHT_DEF__NAME = eINSTANCE.getWeightDef_Name();

		/**
		 * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIGHT_DEF__NEGATIVE = eINSTANCE.getWeightDef_Negative();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIGHT_DEF__VALUE = eINSTANCE.getWeightDef_Value();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEIGHT_DEF__DEFINITION = eINSTANCE.getWeightDef_Definition();

		/**
		 * The meta object literal for the '{@link spectra.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.VarImpl
		 * @see spectra.impl.SpectraPackageImpl#getVar()
		 * @generated
		 */
		EClass VAR = eINSTANCE.getVar();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__KIND = eINSTANCE.getVar_Kind();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR__VAR = eINSTANCE.getVar_Var();

		/**
		 * The meta object literal for the '{@link spectra.impl.TypeDefImpl <em>Type Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TypeDefImpl
		 * @see spectra.impl.SpectraPackageImpl#getTypeDef()
		 * @generated
		 */
		EClass TYPE_DEF = eINSTANCE.getTypeDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEF__NAME = eINSTANCE.getTypeDef_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEF__TYPE = eINSTANCE.getTypeDef_Type();

		/**
		 * The meta object literal for the '{@link spectra.impl.VarDeclImpl <em>Var Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.VarDeclImpl
		 * @see spectra.impl.SpectraPackageImpl#getVarDecl()
		 * @generated
		 */
		EClass VAR_DECL = eINSTANCE.getVarDecl();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECL__TYPE = eINSTANCE.getVarDecl_Type();

		/**
		 * The meta object literal for the '{@link spectra.impl.ReferrableImpl <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.ReferrableImpl
		 * @see spectra.impl.SpectraPackageImpl#getReferrable()
		 * @generated
		 */
		EClass REFERRABLE = eINSTANCE.getReferrable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERRABLE__NAME = eINSTANCE.getReferrable_Name();

		/**
		 * The meta object literal for the '{@link spectra.impl.TypeConstantImpl <em>Type Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TypeConstantImpl
		 * @see spectra.impl.SpectraPackageImpl#getTypeConstant()
		 * @generated
		 */
		EClass TYPE_CONSTANT = eINSTANCE.getTypeConstant();

		/**
		 * The meta object literal for the '{@link spectra.impl.DefineImpl <em>Define</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.DefineImpl
		 * @see spectra.impl.SpectraPackageImpl#getDefine()
		 * @generated
		 */
		EClass DEFINE = eINSTANCE.getDefine();

		/**
		 * The meta object literal for the '<em><b>Define List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE__DEFINE_LIST = eINSTANCE.getDefine_DefineList();

		/**
		 * The meta object literal for the '{@link spectra.impl.DefineDeclImpl <em>Define Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.DefineDeclImpl
		 * @see spectra.impl.SpectraPackageImpl#getDefineDecl()
		 * @generated
		 */
		EClass DEFINE_DECL = eINSTANCE.getDefineDecl();

		/**
		 * The meta object literal for the '<em><b>Simple Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE_DECL__SIMPLE_EXPR = eINSTANCE.getDefineDecl_SimpleExpr();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE_DECL__DIMENSIONS = eINSTANCE.getDefineDecl_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Inner Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE_DECL__INNER_ARRAY = eINSTANCE.getDefineDecl_InnerArray();

		/**
		 * The meta object literal for the '{@link spectra.impl.DefineArrayImpl <em>Define Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.DefineArrayImpl
		 * @see spectra.impl.SpectraPackageImpl#getDefineArray()
		 * @generated
		 */
		EClass DEFINE_ARRAY = eINSTANCE.getDefineArray();

		/**
		 * The meta object literal for the '<em><b>Simple Exprs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE_ARRAY__SIMPLE_EXPRS = eINSTANCE.getDefineArray_SimpleExprs();

		/**
		 * The meta object literal for the '<em><b>Inner Arrays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE_ARRAY__INNER_ARRAYS = eINSTANCE.getDefineArray_InnerArrays();

		/**
		 * The meta object literal for the '{@link spectra.impl.DefineRegExpImpl <em>Define Reg Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.DefineRegExpImpl
		 * @see spectra.impl.SpectraPackageImpl#getDefineRegExp()
		 * @generated
		 */
		EClass DEFINE_REG_EXP = eINSTANCE.getDefineRegExp();

		/**
		 * The meta object literal for the '<em><b>Define Regs List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE_REG_EXP__DEFINE_REGS_LIST = eINSTANCE.getDefineRegExp_DefineRegsList();

		/**
		 * The meta object literal for the '{@link spectra.impl.DefineRegExpDeclImpl <em>Define Reg Exp Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.DefineRegExpDeclImpl
		 * @see spectra.impl.SpectraPackageImpl#getDefineRegExpDecl()
		 * @generated
		 */
		EClass DEFINE_REG_EXP_DECL = eINSTANCE.getDefineRegExpDecl();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE_REG_EXP_DECL__EXP = eINSTANCE.getDefineRegExpDecl_Exp();

		/**
		 * The meta object literal for the '{@link spectra.impl.PatternParamListImpl <em>Pattern Param List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.PatternParamListImpl
		 * @see spectra.impl.SpectraPackageImpl#getPatternParamList()
		 * @generated
		 */
		EClass PATTERN_PARAM_LIST = eINSTANCE.getPatternParamList();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_PARAM_LIST__PARAMS = eINSTANCE.getPatternParamList_Params();

		/**
		 * The meta object literal for the '{@link spectra.impl.PatternParamImpl <em>Pattern Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.PatternParamImpl
		 * @see spectra.impl.SpectraPackageImpl#getPatternParam()
		 * @generated
		 */
		EClass PATTERN_PARAM = eINSTANCE.getPatternParam();

		/**
		 * The meta object literal for the '{@link spectra.impl.TypedParamListImpl <em>Typed Param List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TypedParamListImpl
		 * @see spectra.impl.SpectraPackageImpl#getTypedParamList()
		 * @generated
		 */
		EClass TYPED_PARAM_LIST = eINSTANCE.getTypedParamList();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_PARAM_LIST__PARAMS = eINSTANCE.getTypedParamList_Params();

		/**
		 * The meta object literal for the '{@link spectra.impl.TypedParamImpl <em>Typed Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TypedParamImpl
		 * @see spectra.impl.SpectraPackageImpl#getTypedParam()
		 * @generated
		 */
		EClass TYPED_PARAM = eINSTANCE.getTypedParam();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_PARAM__TYPE = eINSTANCE.getTypedParam_Type();

		/**
		 * The meta object literal for the '{@link spectra.impl.CounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.CounterImpl
		 * @see spectra.impl.SpectraPackageImpl#getCounter()
		 * @generated
		 */
		EClass COUNTER = eINSTANCE.getCounter();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTER__RANGE = eINSTANCE.getCounter_Range();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTER__INITIAL = eINSTANCE.getCounter_Initial();

		/**
		 * The meta object literal for the '<em><b>Reset Pred</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTER__RESET_PRED = eINSTANCE.getCounter_ResetPred();

		/**
		 * The meta object literal for the '<em><b>Inc Pred</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTER__INC_PRED = eINSTANCE.getCounter_IncPred();

		/**
		 * The meta object literal for the '<em><b>Dec Pred</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTER__DEC_PRED = eINSTANCE.getCounter_DecPred();

		/**
		 * The meta object literal for the '<em><b>Overflow Method</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__OVERFLOW_METHOD = eINSTANCE.getCounter_OverflowMethod();

		/**
		 * The meta object literal for the '<em><b>Underflow Method</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__UNDERFLOW_METHOD = eINSTANCE.getCounter_UnderflowMethod();

		/**
		 * The meta object literal for the '{@link spectra.impl.MonitorImpl <em>Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.MonitorImpl
		 * @see spectra.impl.SpectraPackageImpl#getMonitor()
		 * @generated
		 */
		EClass MONITOR = eINSTANCE.getMonitor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__TYPE = eINSTANCE.getMonitor_Type();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__INITIAL = eINSTANCE.getMonitor_Initial();

		/**
		 * The meta object literal for the '<em><b>Safety</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__SAFETY = eINSTANCE.getMonitor_Safety();

		/**
		 * The meta object literal for the '<em><b>State Inv</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__STATE_INV = eINSTANCE.getMonitor_StateInv();

		/**
		 * The meta object literal for the '{@link spectra.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.PatternImpl
		 * @see spectra.impl.SpectraPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__PARAMS = eINSTANCE.getPattern_Params();

		/**
		 * The meta object literal for the '<em><b>Var Decl List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__VAR_DECL_LIST = eINSTANCE.getPattern_VarDeclList();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__INITIAL = eINSTANCE.getPattern_Initial();

		/**
		 * The meta object literal for the '<em><b>Safety</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__SAFETY = eINSTANCE.getPattern_Safety();

		/**
		 * The meta object literal for the '<em><b>State Inv</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__STATE_INV = eINSTANCE.getPattern_StateInv();

		/**
		 * The meta object literal for the '<em><b>Justice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__JUSTICE = eINSTANCE.getPattern_Justice();

		/**
		 * The meta object literal for the '{@link spectra.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.PredicateImpl
		 * @see spectra.impl.SpectraPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__NAME = eINSTANCE.getPredicate_Name();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__PARAMS = eINSTANCE.getPredicate_Params();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__BODY = eINSTANCE.getPredicate_Body();

		/**
		 * The meta object literal for the '{@link spectra.impl.VarTypeImpl <em>Var Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.VarTypeImpl
		 * @see spectra.impl.SpectraPackageImpl#getVarType()
		 * @generated
		 */
		EClass VAR_TYPE = eINSTANCE.getVarType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__NAME = eINSTANCE.getVarType_Name();

		/**
		 * The meta object literal for the '<em><b>Subr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_TYPE__SUBR = eINSTANCE.getVarType_Subr();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_TYPE__CONST = eINSTANCE.getVarType_Const();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_TYPE__TYPE = eINSTANCE.getVarType_Type();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_TYPE__DIMENSIONS = eINSTANCE.getVarType_Dimensions();

		/**
		 * The meta object literal for the '{@link spectra.impl.LTLGarImpl <em>LTL Gar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.LTLGarImpl
		 * @see spectra.impl.SpectraPackageImpl#getLTLGar()
		 * @generated
		 */
		EClass LTL_GAR = eINSTANCE.getLTLGar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTL_GAR__NAME = eINSTANCE.getLTLGar_Name();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_GAR__PARAMS = eINSTANCE.getLTLGar_Params();

		/**
		 * The meta object literal for the '<em><b>Safety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTL_GAR__SAFETY = eINSTANCE.getLTLGar_Safety();

		/**
		 * The meta object literal for the '<em><b>State Inv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTL_GAR__STATE_INV = eINSTANCE.getLTLGar_StateInv();

		/**
		 * The meta object literal for the '<em><b>Justice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTL_GAR__JUSTICE = eINSTANCE.getLTLGar_Justice();

		/**
		 * The meta object literal for the '<em><b>Temporal Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_GAR__TEMPORAL_EXPR = eINSTANCE.getLTLGar_TemporalExpr();

		/**
		 * The meta object literal for the '<em><b>Trig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_GAR__TRIG = eINSTANCE.getLTLGar_Trig();

		/**
		 * The meta object literal for the '{@link spectra.impl.LTLAsmImpl <em>LTL Asm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.LTLAsmImpl
		 * @see spectra.impl.SpectraPackageImpl#getLTLAsm()
		 * @generated
		 */
		EClass LTL_ASM = eINSTANCE.getLTLAsm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTL_ASM__NAME = eINSTANCE.getLTLAsm_Name();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_ASM__PARAMS = eINSTANCE.getLTLAsm_Params();

		/**
		 * The meta object literal for the '<em><b>Safety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTL_ASM__SAFETY = eINSTANCE.getLTLAsm_Safety();

		/**
		 * The meta object literal for the '<em><b>State Inv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTL_ASM__STATE_INV = eINSTANCE.getLTLAsm_StateInv();

		/**
		 * The meta object literal for the '<em><b>Justice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTL_ASM__JUSTICE = eINSTANCE.getLTLAsm_Justice();

		/**
		 * The meta object literal for the '<em><b>Temporal Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_ASM__TEMPORAL_EXPR = eINSTANCE.getLTLAsm_TemporalExpr();

		/**
		 * The meta object literal for the '<em><b>Trig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_ASM__TRIG = eINSTANCE.getLTLAsm_Trig();

		/**
		 * The meta object literal for the '{@link spectra.impl.EXGarImpl <em>EX Gar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.EXGarImpl
		 * @see spectra.impl.SpectraPackageImpl#getEXGar()
		 * @generated
		 */
		EClass EX_GAR = eINSTANCE.getEXGar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EX_GAR__NAME = eINSTANCE.getEXGar_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_GAR__ELEMENTS = eINSTANCE.getEXGar_Elements();

		/**
		 * The meta object literal for the '<em><b>Reg Exp Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_GAR__REG_EXP_POINTER = eINSTANCE.getEXGar_RegExpPointer();

		/**
		 * The meta object literal for the '<em><b>Reg Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_GAR__REG_EXP = eINSTANCE.getEXGar_RegExp();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalExpressionImpl <em>Temporal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalExpressionImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalExpression()
		 * @generated
		 */
		EClass TEMPORAL_EXPRESSION = eINSTANCE.getTemporalExpression();

		/**
		 * The meta object literal for the '{@link spectra.impl.PredicateOrPatternReferrableImpl <em>Predicate Or Pattern Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.PredicateOrPatternReferrableImpl
		 * @see spectra.impl.SpectraPackageImpl#getPredicateOrPatternReferrable()
		 * @generated
		 */
		EClass PREDICATE_OR_PATTERN_REFERRABLE = eINSTANCE.getPredicateOrPatternReferrable();

		/**
		 * The meta object literal for the '{@link spectra.impl.SubrangeImpl <em>Subrange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.SubrangeImpl
		 * @see spectra.impl.SpectraPackageImpl#getSubrange()
		 * @generated
		 */
		EClass SUBRANGE = eINSTANCE.getSubrange();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE__FROM = eINSTANCE.getSubrange_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE__TO = eINSTANCE.getSubrange_To();

		/**
		 * The meta object literal for the '{@link spectra.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TriggerImpl
		 * @see spectra.impl.SpectraPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Init Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__INIT_POINTER = eINSTANCE.getTrigger_InitPointer();

		/**
		 * The meta object literal for the '<em><b>Init Reg Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__INIT_REG_EXP = eINSTANCE.getTrigger_InitRegExp();

		/**
		 * The meta object literal for the '<em><b>Effect Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__EFFECT_POINTER = eINSTANCE.getTrigger_EffectPointer();

		/**
		 * The meta object literal for the '<em><b>Effect Reg Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__EFFECT_REG_EXP = eINSTANCE.getTrigger_EffectRegExp();

		/**
		 * The meta object literal for the '{@link spectra.impl.RegExpImpl <em>Reg Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.RegExpImpl
		 * @see spectra.impl.SpectraPackageImpl#getRegExp()
		 * @generated
		 */
		EClass REG_EXP = eINSTANCE.getRegExp();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REG_EXP__VAL = eINSTANCE.getRegExp_Val();

		/**
		 * The meta object literal for the '<em><b>Assrt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REG_EXP__ASSRT = eINSTANCE.getRegExp_Assrt();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REG_EXP__EMPTY = eINSTANCE.getRegExp_Empty();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REG_EXP__LEFT = eINSTANCE.getRegExp_Left();

		/**
		 * The meta object literal for the '{@link spectra.impl.BooleanTermImpl <em>Boolean Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.BooleanTermImpl
		 * @see spectra.impl.SpectraPackageImpl#getBooleanTerm()
		 * @generated
		 */
		EClass BOOLEAN_TERM = eINSTANCE.getBooleanTerm();

		/**
		 * The meta object literal for the '<em><b>Rel Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_TERM__REL_EXPR = eINSTANCE.getBooleanTerm_RelExpr();

		/**
		 * The meta object literal for the '{@link spectra.impl.ValueInRangeImpl <em>Value In Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.ValueInRangeImpl
		 * @see spectra.impl.SpectraPackageImpl#getValueInRange()
		 * @generated
		 */
		EClass VALUE_IN_RANGE = eINSTANCE.getValueInRange();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_IN_RANGE__CONST = eINSTANCE.getValueInRange_Const();

		/**
		 * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_IN_RANGE__INT = eINSTANCE.getValueInRange_Int();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_IN_RANGE__FROM = eINSTANCE.getValueInRange_From();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_IN_RANGE__MULTI = eINSTANCE.getValueInRange_Multi();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_IN_RANGE__TO = eINSTANCE.getValueInRange_To();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_IN_RANGE__BOOLEAN_VALUE = eINSTANCE.getValueInRange_BooleanValue();

		/**
		 * The meta object literal for the '{@link spectra.impl.DomainVarDeclImpl <em>Domain Var Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.DomainVarDeclImpl
		 * @see spectra.impl.SpectraPackageImpl#getDomainVarDecl()
		 * @generated
		 */
		EClass DOMAIN_VAR_DECL = eINSTANCE.getDomainVarDecl();

		/**
		 * The meta object literal for the '<em><b>Domain Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_VAR_DECL__DOMAIN_TYPE = eINSTANCE.getDomainVarDecl_DomainType();

		/**
		 * The meta object literal for the '{@link spectra.impl.SizeDefineDeclImpl <em>Size Define Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.SizeDefineDeclImpl
		 * @see spectra.impl.SpectraPackageImpl#getSizeDefineDecl()
		 * @generated
		 */
		EClass SIZE_DEFINE_DECL = eINSTANCE.getSizeDefineDecl();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_DEFINE_DECL__VALUE = eINSTANCE.getSizeDefineDecl_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIZE_DEFINE_DECL__NAME = eINSTANCE.getSizeDefineDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Arith Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIZE_DEFINE_DECL__ARITH_EXP = eINSTANCE.getSizeDefineDecl_ArithExp();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalInExprImpl <em>Temporal In Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalInExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalInExpr()
		 * @generated
		 */
		EClass TEMPORAL_IN_EXPR = eINSTANCE.getTemporalInExpr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_IN_EXPR__LEFT = eINSTANCE.getTemporalInExpr_Left();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_IN_EXPR__NOT = eINSTANCE.getTemporalInExpr_Not();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_IN_EXPR__OPERATOR = eINSTANCE.getTemporalInExpr_Operator();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_IN_EXPR__VALUES = eINSTANCE.getTemporalInExpr_Values();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalImpExprImpl <em>Temporal Imp Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalImpExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalImpExpr()
		 * @generated
		 */
		EClass TEMPORAL_IMP_EXPR = eINSTANCE.getTemporalImpExpr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_IMP_EXPR__LEFT = eINSTANCE.getTemporalImpExpr_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_IMP_EXPR__OPERATOR = eINSTANCE.getTemporalImpExpr_Operator();

		/**
		 * The meta object literal for the '<em><b>Implication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_IMP_EXPR__IMPLICATION = eINSTANCE.getTemporalImpExpr_Implication();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalIffExprImpl <em>Temporal Iff Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalIffExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalIffExpr()
		 * @generated
		 */
		EClass TEMPORAL_IFF_EXPR = eINSTANCE.getTemporalIffExpr();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_IFF_EXPR__ELEMENTS = eINSTANCE.getTemporalIffExpr_Elements();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_IFF_EXPR__OPERATOR = eINSTANCE.getTemporalIffExpr_Operator();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalOrExprImpl <em>Temporal Or Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalOrExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalOrExpr()
		 * @generated
		 */
		EClass TEMPORAL_OR_EXPR = eINSTANCE.getTemporalOrExpr();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_OR_EXPR__ELEMENTS = eINSTANCE.getTemporalOrExpr_Elements();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_OR_EXPR__OPERATOR = eINSTANCE.getTemporalOrExpr_Operator();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalAndExprImpl <em>Temporal And Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalAndExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalAndExpr()
		 * @generated
		 */
		EClass TEMPORAL_AND_EXPR = eINSTANCE.getTemporalAndExpr();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_AND_EXPR__ELEMENTS = eINSTANCE.getTemporalAndExpr_Elements();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_AND_EXPR__OPERATOR = eINSTANCE.getTemporalAndExpr_Operator();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalRelationalExprImpl <em>Temporal Relational Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalRelationalExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalRelationalExpr()
		 * @generated
		 */
		EClass TEMPORAL_RELATIONAL_EXPR = eINSTANCE.getTemporalRelationalExpr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_RELATIONAL_EXPR__LEFT = eINSTANCE.getTemporalRelationalExpr_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_RELATIONAL_EXPR__OPERATOR = eINSTANCE.getTemporalRelationalExpr_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_RELATIONAL_EXPR__RIGHT = eINSTANCE.getTemporalRelationalExpr_Right();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalRemainderExprImpl <em>Temporal Remainder Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalRemainderExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalRemainderExpr()
		 * @generated
		 */
		EClass TEMPORAL_REMAINDER_EXPR = eINSTANCE.getTemporalRemainderExpr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_REMAINDER_EXPR__LEFT = eINSTANCE.getTemporalRemainderExpr_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_REMAINDER_EXPR__OPERATOR = eINSTANCE.getTemporalRemainderExpr_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_REMAINDER_EXPR__RIGHT = eINSTANCE.getTemporalRemainderExpr_Right();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalAdditiveExprImpl <em>Temporal Additive Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalAdditiveExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalAdditiveExpr()
		 * @generated
		 */
		EClass TEMPORAL_ADDITIVE_EXPR = eINSTANCE.getTemporalAdditiveExpr();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_ADDITIVE_EXPR__ELEMENTS = eINSTANCE.getTemporalAdditiveExpr_Elements();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_ADDITIVE_EXPR__OPERATOR = eINSTANCE.getTemporalAdditiveExpr_Operator();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalMultiplicativeExprImpl <em>Temporal Multiplicative Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalMultiplicativeExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalMultiplicativeExpr()
		 * @generated
		 */
		EClass TEMPORAL_MULTIPLICATIVE_EXPR = eINSTANCE.getTemporalMultiplicativeExpr();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_MULTIPLICATIVE_EXPR__ELEMENTS = eINSTANCE.getTemporalMultiplicativeExpr_Elements();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_MULTIPLICATIVE_EXPR__OPERATOR = eINSTANCE.getTemporalMultiplicativeExpr_Operator();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalBinaryExprImpl <em>Temporal Binary Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalBinaryExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalBinaryExpr()
		 * @generated
		 */
		EClass TEMPORAL_BINARY_EXPR = eINSTANCE.getTemporalBinaryExpr();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_BINARY_EXPR__ELEMENTS = eINSTANCE.getTemporalBinaryExpr_Elements();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_BINARY_EXPR__OPERATOR = eINSTANCE.getTemporalBinaryExpr_Operator();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalUnaryExprImpl <em>Temporal Unary Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalUnaryExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalUnaryExpr()
		 * @generated
		 */
		EClass TEMPORAL_UNARY_EXPR = eINSTANCE.getTemporalUnaryExpr();

		/**
		 * The meta object literal for the '<em><b>Kinds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_UNARY_EXPR__KINDS = eINSTANCE.getTemporalUnaryExpr_Kinds();

		/**
		 * The meta object literal for the '<em><b>Tue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_UNARY_EXPR__TUE = eINSTANCE.getTemporalUnaryExpr_Tue();

		/**
		 * The meta object literal for the '{@link spectra.impl.TemporalPrimaryExprImpl <em>Temporal Primary Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.TemporalPrimaryExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getTemporalPrimaryExpr()
		 * @generated
		 */
		EClass TEMPORAL_PRIMARY_EXPR = eINSTANCE.getTemporalPrimaryExpr();

		/**
		 * The meta object literal for the '<em><b>Pred Patt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PRIMARY_EXPR__PRED_PATT = eINSTANCE.getTemporalPrimaryExpr_PredPatt();

		/**
		 * The meta object literal for the '<em><b>Pred Patt Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS = eINSTANCE.getTemporalPrimaryExpr_PredPattParams();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_PRIMARY_EXPR__OPERATOR = eINSTANCE.getTemporalPrimaryExpr_Operator();

		/**
		 * The meta object literal for the '<em><b>Tpe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PRIMARY_EXPR__TPE = eINSTANCE.getTemporalPrimaryExpr_Tpe();

		/**
		 * The meta object literal for the '<em><b>Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PRIMARY_EXPR__POINTER = eINSTANCE.getTemporalPrimaryExpr_Pointer();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PRIMARY_EXPR__INDEX = eINSTANCE.getTemporalPrimaryExpr_Index();

		/**
		 * The meta object literal for the '<em><b>Temporal Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION = eINSTANCE.getTemporalPrimaryExpr_TemporalExpression();

		/**
		 * The meta object literal for the '<em><b>Regexp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PRIMARY_EXPR__REGEXP = eINSTANCE.getTemporalPrimaryExpr_Regexp();

		/**
		 * The meta object literal for the '<em><b>Regexp Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PRIMARY_EXPR__REGEXP_POINTER = eINSTANCE.getTemporalPrimaryExpr_RegexpPointer();

		/**
		 * The meta object literal for the '{@link spectra.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.ConstantImpl
		 * @see spectra.impl.SpectraPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__BOOLEAN_VALUE = eINSTANCE.getConstant_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__INTEGER_VALUE = eINSTANCE.getConstant_IntegerValue();

		/**
		 * The meta object literal for the '{@link spectra.impl.BinaryRegExpImpl <em>Binary Reg Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.BinaryRegExpImpl
		 * @see spectra.impl.SpectraPackageImpl#getBinaryRegExp()
		 * @generated
		 */
		EClass BINARY_REG_EXP = eINSTANCE.getBinaryRegExp();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_REG_EXP__OP = eINSTANCE.getBinaryRegExp_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_REG_EXP__RIGHT = eINSTANCE.getBinaryRegExp_Right();

		/**
		 * The meta object literal for the '{@link spectra.impl.UnaryRegExpImpl <em>Unary Reg Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.UnaryRegExpImpl
		 * @see spectra.impl.SpectraPackageImpl#getUnaryRegExp()
		 * @generated
		 */
		EClass UNARY_REG_EXP = eINSTANCE.getUnaryRegExp();

		/**
		 * The meta object literal for the '<em><b>Kleened</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_REG_EXP__KLEENED = eINSTANCE.getUnaryRegExp_Kleened();

		/**
		 * The meta object literal for the '<em><b>Question Mark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_REG_EXP__QUESTION_MARK = eINSTANCE.getUnaryRegExp_QuestionMark();

		/**
		 * The meta object literal for the '<em><b>Plus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_REG_EXP__PLUS = eINSTANCE.getUnaryRegExp_Plus();

		/**
		 * The meta object literal for the '<em><b>Have Exact Repetition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_REG_EXP__HAVE_EXACT_REPETITION = eINSTANCE.getUnaryRegExp_HaveExactRepetition();

		/**
		 * The meta object literal for the '<em><b>Exact Repetition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_REG_EXP__EXACT_REPETITION = eINSTANCE.getUnaryRegExp_ExactRepetition();

		/**
		 * The meta object literal for the '<em><b>Have At Least</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_REG_EXP__HAVE_AT_LEAST = eINSTANCE.getUnaryRegExp_HaveAtLeast();

		/**
		 * The meta object literal for the '<em><b>At Least</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_REG_EXP__AT_LEAST = eINSTANCE.getUnaryRegExp_AtLeast();

		/**
		 * The meta object literal for the '<em><b>Have Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_REG_EXP__HAVE_RANGE = eINSTANCE.getUnaryRegExp_HaveRange();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_REG_EXP__FROM = eINSTANCE.getUnaryRegExp_From();

		/**
		 * The meta object literal for the '<em><b>From Define</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_REG_EXP__FROM_DEFINE = eINSTANCE.getUnaryRegExp_FromDefine();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_REG_EXP__TO = eINSTANCE.getUnaryRegExp_To();

		/**
		 * The meta object literal for the '<em><b>To Define</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_REG_EXP__TO_DEFINE = eINSTANCE.getUnaryRegExp_ToDefine();

		/**
		 * The meta object literal for the '{@link spectra.impl.CompRegExpImpl <em>Comp Reg Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.CompRegExpImpl
		 * @see spectra.impl.SpectraPackageImpl#getCompRegExp()
		 * @generated
		 */
		EClass COMP_REG_EXP = eINSTANCE.getCompRegExp();

		/**
		 * The meta object literal for the '<em><b>Comp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP_REG_EXP__COMP = eINSTANCE.getCompRegExp_Comp();

		/**
		 * The meta object literal for the '{@link spectra.impl.QuantifierExprImpl <em>Quantifier Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.impl.QuantifierExprImpl
		 * @see spectra.impl.SpectraPackageImpl#getQuantifierExpr()
		 * @generated
		 */
		EClass QUANTIFIER_EXPR = eINSTANCE.getQuantifierExpr();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIER_EXPR__OPERATOR = eINSTANCE.getQuantifierExpr_Operator();

		/**
		 * The meta object literal for the '<em><b>Domain Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER_EXPR__DOMAIN_VAR = eINSTANCE.getQuantifierExpr_DomainVar();

		/**
		 * The meta object literal for the '<em><b>Temporal Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER_EXPR__TEMPORAL_EXPR = eINSTANCE.getQuantifierExpr_TemporalExpr();

		/**
		 * The meta object literal for the '{@link spectra.VarOwner <em>Var Owner</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.VarOwner
		 * @see spectra.impl.SpectraPackageImpl#getVarOwner()
		 * @generated
		 */
		EEnum VAR_OWNER = eINSTANCE.getVarOwner();

		/**
		 * The meta object literal for the '{@link spectra.OverflowMethod <em>Overflow Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spectra.OverflowMethod
		 * @see spectra.impl.SpectraPackageImpl#getOverflowMethod()
		 * @generated
		 */
		EEnum OVERFLOW_METHOD = eINSTANCE.getOverflowMethod();

	}

} //SpectraPackage
