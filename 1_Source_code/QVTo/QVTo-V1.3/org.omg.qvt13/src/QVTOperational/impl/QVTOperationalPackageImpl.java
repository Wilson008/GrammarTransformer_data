/**
 */
package QVTOperational.impl;

import EMOF.EMOFPackage;

import EMOF.impl.EMOFPackageImpl;
import PrimitiveTypes.PrimitiveTypesPackage;

import PrimitiveTypes.impl.PrimitiveTypesPackageImpl;
import QVTOperational.AccessDecl;
import QVTOperational.AccessUsage;
import QVTOperational.ClassifierExtension;
import QVTOperational.ClassifierFeature;
import QVTOperational.ClassifierFeatureList;
import QVTOperational.ClassifierGO;
import QVTOperational.ClassifierHeader;
import QVTOperational.ClassifierInfo;
import QVTOperational.CollectionKey;
import QVTOperational.CompleteSignature;
import QVTOperational.ComplexType;
import QVTOperational.ComplexTypeKey;
import QVTOperational.Constructor;
import QVTOperational.ConstructorBody;
import QVTOperational.ConstructorHeader;
import QVTOperational.ContextualProperty;
import QVTOperational.Declarator;
import QVTOperational.DeclaratorList;
import QVTOperational.DirectionKind;
import QVTOperational.EntryHeader;
import QVTOperational.EntryOperation;
import QVTOperational.EnumerationGO;
import QVTOperational.EnumerationHeader;
import QVTOperational.ExpressionBlock;
import QVTOperational.ExpressionGO;
import QVTOperational.ExpressionList;
import QVTOperational.ExpressionSemiList;
import QVTOperational.ExtendsUsage;
import QVTOperational.FeatureKey;
import QVTOperational.FeatureQualifier;
import QVTOperational.GeneralQualifier;
import QVTOperational.Helper;
import QVTOperational.HelperHeader;
import QVTOperational.HelperInfo;
import QVTOperational.HelperKind;
import QVTOperational.ImperativeCallExp;
import QVTOperational.ImperativeOperation;
import QVTOperational.ImportKind;
import QVTOperational.InitPart;
import QVTOperational.Library;
import QVTOperational.LibraryHeader;
import QVTOperational.MappingBody;
import QVTOperational.MappingCallExp;
import QVTOperational.MappingExtension;
import QVTOperational.MappingExtensionKey;
import QVTOperational.MappingExtra;
import QVTOperational.MappingFullHeader;
import QVTOperational.MappingHeader;
import QVTOperational.MappingOperation;
import QVTOperational.MappingParameter;
import QVTOperational.MappingRefinement;
import QVTOperational.MetaModelElement;
import QVTOperational.MetaModelGO;
import QVTOperational.MetaModelHeader;
import QVTOperational.ModelParameter;
import QVTOperational.ModelType;
import QVTOperational.ModuleImport;
import QVTOperational.ModuleKind;
import QVTOperational.ModuleRefGO;
import QVTOperational.ModuleUsageGO;
import QVTOperational.Multiplicity;
import QVTOperational.ObjectExp;
import QVTOperational.OperationBody;
import QVTOperational.OperationalTransformation;
import QVTOperational.OppositeProperty;
import QVTOperational.PackageRefGO;
import QVTOperational.ParamList;
import QVTOperational.PopulationSection;
import QVTOperational.PropertyKey;
import QVTOperational.QVTOperationalFactory;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.ResolveExp;
import QVTOperational.ResolveInExp;
import QVTOperational.ScopedIdentifier;
import QVTOperational.ScopedIdentifierList;
import QVTOperational.SimpleSignature;
import QVTOperational.StereotypeQualifier;
import QVTOperational.TagGO;
import QVTOperational.TopLevelGO;
import QVTOperational.TransformationHeader;
import QVTOperational.TransformationUsageRefine;
import QVTOperational.TypeDef;
import QVTOperational.TypeReference;
import QVTOperational.TypeSpec;
import QVTOperational.UnitRefGO;
import QVTOperational.VarParameter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTOperationalPackageImpl extends EPackageImpl implements QVTOperationalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextualPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imperativeCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imperativeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveInExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topLevelGOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitRefGOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagGOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelGOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationUsageRefineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleRefGOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleUsageGOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendsUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopedIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierGOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaratorListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionSemiListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageRefGOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationGOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierFeatureListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopedIdentifierListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oppositePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stereotypeQualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureQualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completeSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingFullHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionGOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum importKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generalQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum complexTypeKeyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureKeyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyKeyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum helperKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mappingExtensionKeyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionKeyEEnum = null;

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
	 * @see QVTOperational.QVTOperationalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QVTOperationalPackageImpl() {
		super(eNS_URI, QVTOperationalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QVTOperationalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QVTOperationalPackage init() {
		if (isInited) return (QVTOperationalPackage)EPackage.Registry.INSTANCE.getEPackage(QVTOperationalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQVTOperationalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QVTOperationalPackageImpl theQVTOperationalPackage = registeredQVTOperationalPackage instanceof QVTOperationalPackageImpl ? (QVTOperationalPackageImpl)registeredQVTOperationalPackage : new QVTOperationalPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EMOFPackage.eNS_URI);
		EMOFPackageImpl theEMOFPackage = (EMOFPackageImpl)(registeredPackage instanceof EMOFPackageImpl ? registeredPackage : EMOFPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(registeredPackage instanceof PrimitiveTypesPackageImpl ? registeredPackage : PrimitiveTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theQVTOperationalPackage.createPackageContents();
		theEMOFPackage.createPackageContents();
		thePrimitiveTypesPackage.createPackageContents();

		// Initialize created meta-data
		theQVTOperationalPackage.initializePackageContents();
		theEMOFPackage.initializePackageContents();
		thePrimitiveTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQVTOperationalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QVTOperationalPackage.eNS_URI, theQVTOperationalPackage);
		return theQVTOperationalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructor_Constructor_header() {
		return (EReference)constructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructor_Expression_block() {
		return (EReference)constructorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorBody() {
		return constructorBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextualProperty() {
		return contextualPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextualProperty_InitExpression() {
		return (EReference)contextualPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextualProperty_Property_key() {
		return (EAttribute)contextualPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextualProperty_Declarator() {
		return (EReference)contextualPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryOperation() {
		return entryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryOperation_Entry_header() {
		return (EReference)entryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryOperation_Expression_block() {
		return (EReference)entryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelper() {
		return helperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHelper_IsQuery() {
		return (EAttribute)helperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelper_Helper_header() {
		return (EReference)helperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelper_Expression() {
		return (EReference)helperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelper_Expression_block() {
		return (EReference)helperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImperativeCallExp() {
		return imperativeCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImperativeCallExp_IsVirtual() {
		return (EAttribute)imperativeCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImperativeOperation() {
		return imperativeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeOperation_Body() {
		return (EReference)imperativeOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeOperation_Context() {
		return (EReference)imperativeOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImperativeOperation_IsBlackbox() {
		return (EAttribute)imperativeOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeOperation_Overridden() {
		return (EReference)imperativeOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeOperation_Result() {
		return (EReference)imperativeOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Library_h() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Module_element() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingBody() {
		return mappingBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingBody_EndSection() {
		return (EReference)mappingBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingBody_InitSection() {
		return (EReference)mappingBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingBody_Population_section() {
		return (EReference)mappingBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingCallExp() {
		return mappingCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingCallExp_IsStrict() {
		return (EAttribute)mappingCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingOperation() {
		return mappingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_Disjunct() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_Inherited() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_Merged() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_RefinedRelation() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_When() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_Where() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_Mapping_full_header() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperation_Mapping_body() {
		return (EReference)mappingOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingParameter() {
		return mappingParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingParameter_Extent() {
		return (EReference)mappingParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingParameter_ReferredDomain() {
		return (EReference)mappingParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelParameter() {
		return modelParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelParameter_Module() {
		return (EReference)modelParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelType() {
		return modelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_AdditionalCondition() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_ConformanceKind() {
		return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Metamodel() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_Compliance_kind() {
		return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Packageref_list() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Modeltype_where() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ConfigProperty() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Entry() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ModuleImport() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_OwnedTag() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_OwnedVariable() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_UsedModelType() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleImport() {
		return moduleImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleImport_Binding() {
		return (EReference)moduleImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleImport_ImportedModule() {
		return (EReference)moduleImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleImport_Kind() {
		return (EAttribute)moduleImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleImport_Module() {
		return (EReference)moduleImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleImport_Unit() {
		return (EReference)moduleImportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleImport_Identifier() {
		return (EAttribute)moduleImportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectExp() {
		return objectExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExp_Body() {
		return (EReference)objectExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExp_ReferredObject() {
		return (EReference)objectExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationBody() {
		return operationBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationBody_Content() {
		return (EReference)operationBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationBody_Operation() {
		return (EReference)operationBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationBody_Variable() {
		return (EReference)operationBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalTransformation() {
		return operationalTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_IntermediateClass() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_IntermediateProperty() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_ModelParameter() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_Refined() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_Relation() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_Transformation_h() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalTransformation_Module_element() {
		return (EReference)operationalTransformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolveExp() {
		return resolveExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolveExp_Condition() {
		return (EReference)resolveExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolveExp_IsDeferred() {
		return (EAttribute)resolveExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolveExp_IsInverse() {
		return (EAttribute)resolveExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolveExp_One() {
		return (EAttribute)resolveExpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolveExp_Target() {
		return (EReference)resolveExpEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolveInExp() {
		return resolveInExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolveInExp_InMapping() {
		return (EReference)resolveInExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarParameter() {
		return varParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarParameter_CtxOwner() {
		return (EReference)varParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarParameter_Kind() {
		return (EAttribute)varParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarParameter_ResOwner() {
		return (EReference)varParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarParameter_Declarator() {
		return (EReference)varParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopLevelGO() {
		return topLevelGOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopLevelGO_Unit_element() {
		return (EReference)topLevelGOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopLevelGO_Moduleimport() {
		return (EReference)topLevelGOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitRefGO() {
		return unitRefGOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitRefGO_Identifier() {
		return (EAttribute)unitRefGOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagGO() {
		return tagGOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagGO_Tagid() {
		return (EAttribute)tagGOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagGO_Scoped_identifier() {
		return (EReference)tagGOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagGO_Tagvalue() {
		return (EReference)tagGOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaModelGO() {
		return metaModelGOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelGO_Metamodel_h() {
		return (EReference)metaModelGOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelGO_Metamodel_element() {
		return (EReference)metaModelGOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessDecl() {
		return accessDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessDecl_Access_usage() {
		return (EReference)accessDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDef() {
		return typeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDef_Typespec() {
		return (EReference)typeDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationHeader() {
		return transformationHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationHeader_Qualifier() {
		return (EAttribute)transformationHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationHeader_Name() {
		return (EAttribute)transformationHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationHeader_Transformation_signature() {
		return (EReference)transformationHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationHeader_Transformation_usage_refine() {
		return (EReference)transformationHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSignature() {
		return simpleSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleSignature_Param_list() {
		return (EReference)simpleSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationUsageRefine() {
		return transformationUsageRefineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationUsageRefine_Module_usage() {
		return (EReference)transformationUsageRefineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationUsageRefine_Transformation_refine() {
		return (EReference)transformationUsageRefineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleRefGO() {
		return moduleRefGOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefGO_Scoped_identifier() {
		return (EReference)moduleRefGOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefGO_Simple_signature() {
		return (EReference)moduleRefGOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleUsageGO() {
		return moduleUsageGOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleUsageGO_Access_usage() {
		return (EReference)moduleUsageGOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleUsageGO_Extends_usage() {
		return (EReference)moduleUsageGOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryHeader() {
		return libraryHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryHeader_Name() {
		return (EAttribute)libraryHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryHeader_Library_signature() {
		return (EReference)libraryHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryHeader_Module_usage() {
		return (EReference)libraryHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessUsage() {
		return accessUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessUsage_Module_kind() {
		return (EAttribute)accessUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessUsage_Moduleref_list() {
		return (EReference)accessUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendsUsage() {
		return extendsUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendsUsage_Module_kind() {
		return (EAttribute)extendsUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendsUsage_Moduleref_list() {
		return (EReference)extendsUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopedIdentifier() {
		return scopedIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopedIdentifier_Identifier() {
		return (EAttribute)scopedIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamList() {
		return paramListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamList_Param() {
		return (EReference)paramListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierGO() {
		return classifierGOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierGO_Classifier_h() {
		return (EReference)classifierGOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierGO_Classifier_feature_list() {
		return (EReference)classifierGOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarator() {
		return declaratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarator_Typespec() {
		return (EReference)declaratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarator_Init_part() {
		return (EReference)declaratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarator_Scoped_identifier() {
		return (EReference)declaratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSpec() {
		return typeSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeSpec_Type_reference() {
		return (EReference)typeSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSpec_Extent_location() {
		return (EAttribute)typeSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeReference_Scoped_identifier() {
		return (EReference)typeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeReference_Complex_type() {
		return (EReference)typeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexType() {
		return complexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexType_Complex_type_key() {
		return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexType_Collection_key() {
		return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexType_Typespec() {
		return (EReference)complexTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexType_Declarator_list() {
		return (EReference)complexTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaratorList() {
		return declaratorListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaratorList_Declarator() {
		return (EReference)declaratorListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitPart() {
		return initPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitPart_Init_op() {
		return (EAttribute)initPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitPart_Expression() {
		return (EReference)initPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionSemiList() {
		return expressionSemiListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionSemiList_Expression() {
		return (EReference)expressionSemiListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionList() {
		return expressionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionList_Expression_semi_list() {
		return (EReference)expressionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionBlock() {
		return expressionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionBlock_Expression_list() {
		return (EReference)expressionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageRefGO() {
		return packageRefGOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageRefGO_Scoped_identifier() {
		return (EReference)packageRefGOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRefGO_Uri() {
		return (EAttribute)packageRefGOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaModelHeader() {
		return metaModelHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelHeader_Scoped_identifier() {
		return (EReference)metaModelHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaModelElement() {
		return metaModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelElement_Classifier() {
		return (EReference)metaModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelElement_Enumeration() {
		return (EReference)metaModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelElement_Tag() {
		return (EReference)metaModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationGO() {
		return enumerationGOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationGO_Enumeration_h() {
		return (EReference)enumerationGOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationGO_Identifier() {
		return (EAttribute)enumerationGOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierHeader() {
		return classifierHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierHeader_Classifier_info() {
		return (EReference)classifierHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierHeader_Scoped_identifier() {
		return (EReference)classifierHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierHeader_Classifier_extension() {
		return (EReference)classifierHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierFeatureList() {
		return classifierFeatureListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierFeatureList_Classifier_feature() {
		return (EReference)classifierFeatureListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierInfo() {
		return classifierInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierInfo_Qualifier() {
		return (EAttribute)classifierInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierExtension() {
		return classifierExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierExtension_Scoped_identifier_list() {
		return (EReference)classifierExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopedIdentifierList() {
		return scopedIdentifierListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopedIdentifierList_Scoped_identifier_list() {
		return (EReference)scopedIdentifierListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierFeature() {
		return classifierFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierFeature_Feature_qualifier() {
		return (EReference)classifierFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierFeature_Declarator() {
		return (EReference)classifierFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierFeature_Multiplicity() {
		return (EReference)classifierFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierFeature_Opposite_property() {
		return (EReference)classifierFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierFeature_Complete_signature() {
		return (EReference)classifierFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierFeature_Tag() {
		return (EReference)classifierFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicity() {
		return multiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicity_Multiplicity_range() {
		return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOppositeProperty() {
		return oppositePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOppositeProperty_Name() {
		return (EAttribute)oppositePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOppositeProperty_Multiplicity() {
		return (EReference)oppositePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStereotypeQualifier() {
		return stereotypeQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStereotypeQualifier_Identifier() {
		return (EAttribute)stereotypeQualifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureQualifier() {
		return featureQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureQualifier_Stereotype_qualifier() {
		return (EReference)featureQualifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureQualifier_Feature_key() {
		return (EAttribute)featureQualifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompleteSignature() {
		return completeSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompleteSignature_Simple_signature() {
		return (EReference)completeSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompleteSignature_Param_list() {
		return (EReference)completeSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationHeader() {
		return enumerationHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationHeader_Identifier() {
		return (EAttribute)enumerationHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelperInfo() {
		return helperInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHelperInfo_Qualifier() {
		return (EAttribute)helperInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHelperInfo_Helper_kind() {
		return (EAttribute)helperInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelperHeader() {
		return helperHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelperHeader_Helper_info() {
		return (EReference)helperHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelperHeader_Scope_identifier() {
		return (EReference)helperHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelperHeader_Complete_signature() {
		return (EReference)helperHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorHeader() {
		return constructorHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructorHeader_Qualifier() {
		return (EAttribute)constructorHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorHeader_Scoped_identifier() {
		return (EReference)constructorHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorHeader_Simple_signature() {
		return (EReference)constructorHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryHeader() {
		return entryHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryHeader_Simple_signature() {
		return (EReference)entryHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingHeader() {
		return mappingHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingHeader_Qualifier() {
		return (EAttribute)mappingHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingHeader_Param_direction() {
		return (EAttribute)mappingHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingHeader_Scoped_identifier() {
		return (EReference)mappingHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingHeader_Complete_signature() {
		return (EReference)mappingHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingHeader_Mapping_extra() {
		return (EReference)mappingHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingFullHeader() {
		return mappingFullHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingFullHeader_Mapping_header() {
		return (EReference)mappingFullHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingFullHeader_When() {
		return (EReference)mappingFullHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingFullHeader_Where() {
		return (EReference)mappingFullHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingExtra() {
		return mappingExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingExtra_Mapping_extension() {
		return (EReference)mappingExtraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingExtra_Mapping_refinement() {
		return (EReference)mappingExtraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingExtension() {
		return mappingExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingExtension_Mapping_extension_key() {
		return (EAttribute)mappingExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingExtension_Scoped_identifier_list() {
		return (EReference)mappingExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingRefinement() {
		return mappingRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingRefinement_Scoped_identifier() {
		return (EReference)mappingRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulationSection() {
		return populationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulationSection_Expression_list() {
		return (EReference)populationSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulationSection_Expression_block() {
		return (EReference)populationSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionGO() {
		return expressionGOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionGO_DummyContent() {
		return (EAttribute)expressionGOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionKind() {
		return directionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImportKind() {
		return importKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeneralQualifier() {
		return generalQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModuleKind() {
		return moduleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComplexTypeKey() {
		return complexTypeKeyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeatureKey() {
		return featureKeyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyKey() {
		return propertyKeyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHelperKind() {
		return helperKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMappingExtensionKey() {
		return mappingExtensionKeyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCollectionKey() {
		return collectionKeyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperationalFactory getQVTOperationalFactory() {
		return (QVTOperationalFactory)getEFactoryInstance();
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
		constructorEClass = createEClass(CONSTRUCTOR);
		createEReference(constructorEClass, CONSTRUCTOR__CONSTRUCTOR_HEADER);
		createEReference(constructorEClass, CONSTRUCTOR__EXPRESSION_BLOCK);

		constructorBodyEClass = createEClass(CONSTRUCTOR_BODY);

		contextualPropertyEClass = createEClass(CONTEXTUAL_PROPERTY);
		createEReference(contextualPropertyEClass, CONTEXTUAL_PROPERTY__INIT_EXPRESSION);
		createEAttribute(contextualPropertyEClass, CONTEXTUAL_PROPERTY__PROPERTY_KEY);
		createEReference(contextualPropertyEClass, CONTEXTUAL_PROPERTY__DECLARATOR);

		entryOperationEClass = createEClass(ENTRY_OPERATION);
		createEReference(entryOperationEClass, ENTRY_OPERATION__ENTRY_HEADER);
		createEReference(entryOperationEClass, ENTRY_OPERATION__EXPRESSION_BLOCK);

		helperEClass = createEClass(HELPER);
		createEAttribute(helperEClass, HELPER__IS_QUERY);
		createEReference(helperEClass, HELPER__HELPER_HEADER);
		createEReference(helperEClass, HELPER__EXPRESSION);
		createEReference(helperEClass, HELPER__EXPRESSION_BLOCK);

		imperativeCallExpEClass = createEClass(IMPERATIVE_CALL_EXP);
		createEAttribute(imperativeCallExpEClass, IMPERATIVE_CALL_EXP__IS_VIRTUAL);

		imperativeOperationEClass = createEClass(IMPERATIVE_OPERATION);
		createEReference(imperativeOperationEClass, IMPERATIVE_OPERATION__BODY);
		createEReference(imperativeOperationEClass, IMPERATIVE_OPERATION__CONTEXT);
		createEAttribute(imperativeOperationEClass, IMPERATIVE_OPERATION__IS_BLACKBOX);
		createEReference(imperativeOperationEClass, IMPERATIVE_OPERATION__OVERRIDDEN);
		createEReference(imperativeOperationEClass, IMPERATIVE_OPERATION__RESULT);

		libraryEClass = createEClass(LIBRARY);
		createEReference(libraryEClass, LIBRARY__LIBRARY_H);
		createEReference(libraryEClass, LIBRARY__MODULE_ELEMENT);

		mappingBodyEClass = createEClass(MAPPING_BODY);
		createEReference(mappingBodyEClass, MAPPING_BODY__END_SECTION);
		createEReference(mappingBodyEClass, MAPPING_BODY__INIT_SECTION);
		createEReference(mappingBodyEClass, MAPPING_BODY__POPULATION_SECTION);

		mappingCallExpEClass = createEClass(MAPPING_CALL_EXP);
		createEAttribute(mappingCallExpEClass, MAPPING_CALL_EXP__IS_STRICT);

		mappingOperationEClass = createEClass(MAPPING_OPERATION);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__DISJUNCT);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__INHERITED);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__MERGED);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__REFINED_RELATION);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__WHEN);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__WHERE);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__MAPPING_FULL_HEADER);
		createEReference(mappingOperationEClass, MAPPING_OPERATION__MAPPING_BODY);

		mappingParameterEClass = createEClass(MAPPING_PARAMETER);
		createEReference(mappingParameterEClass, MAPPING_PARAMETER__EXTENT);
		createEReference(mappingParameterEClass, MAPPING_PARAMETER__REFERRED_DOMAIN);

		modelParameterEClass = createEClass(MODEL_PARAMETER);
		createEReference(modelParameterEClass, MODEL_PARAMETER__MODULE);

		modelTypeEClass = createEClass(MODEL_TYPE);
		createEReference(modelTypeEClass, MODEL_TYPE__ADDITIONAL_CONDITION);
		createEAttribute(modelTypeEClass, MODEL_TYPE__CONFORMANCE_KIND);
		createEReference(modelTypeEClass, MODEL_TYPE__METAMODEL);
		createEAttribute(modelTypeEClass, MODEL_TYPE__COMPLIANCE_KIND);
		createEReference(modelTypeEClass, MODEL_TYPE__PACKAGEREF_LIST);
		createEReference(modelTypeEClass, MODEL_TYPE__MODELTYPE_WHERE);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__CONFIG_PROPERTY);
		createEReference(moduleEClass, MODULE__ENTRY);
		createEReference(moduleEClass, MODULE__MODULE_IMPORT);
		createEReference(moduleEClass, MODULE__OWNED_TAG);
		createEReference(moduleEClass, MODULE__OWNED_VARIABLE);
		createEReference(moduleEClass, MODULE__USED_MODEL_TYPE);

		moduleImportEClass = createEClass(MODULE_IMPORT);
		createEReference(moduleImportEClass, MODULE_IMPORT__BINDING);
		createEReference(moduleImportEClass, MODULE_IMPORT__IMPORTED_MODULE);
		createEAttribute(moduleImportEClass, MODULE_IMPORT__KIND);
		createEReference(moduleImportEClass, MODULE_IMPORT__MODULE);
		createEReference(moduleImportEClass, MODULE_IMPORT__UNIT);
		createEAttribute(moduleImportEClass, MODULE_IMPORT__IDENTIFIER);

		objectExpEClass = createEClass(OBJECT_EXP);
		createEReference(objectExpEClass, OBJECT_EXP__BODY);
		createEReference(objectExpEClass, OBJECT_EXP__REFERRED_OBJECT);

		operationBodyEClass = createEClass(OPERATION_BODY);
		createEReference(operationBodyEClass, OPERATION_BODY__CONTENT);
		createEReference(operationBodyEClass, OPERATION_BODY__OPERATION);
		createEReference(operationBodyEClass, OPERATION_BODY__VARIABLE);

		operationalTransformationEClass = createEClass(OPERATIONAL_TRANSFORMATION);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__REFINED);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__RELATION);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H);
		createEReference(operationalTransformationEClass, OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT);

		resolveExpEClass = createEClass(RESOLVE_EXP);
		createEReference(resolveExpEClass, RESOLVE_EXP__CONDITION);
		createEAttribute(resolveExpEClass, RESOLVE_EXP__IS_DEFERRED);
		createEAttribute(resolveExpEClass, RESOLVE_EXP__IS_INVERSE);
		createEAttribute(resolveExpEClass, RESOLVE_EXP__ONE);
		createEReference(resolveExpEClass, RESOLVE_EXP__TARGET);

		resolveInExpEClass = createEClass(RESOLVE_IN_EXP);
		createEReference(resolveInExpEClass, RESOLVE_IN_EXP__IN_MAPPING);

		varParameterEClass = createEClass(VAR_PARAMETER);
		createEReference(varParameterEClass, VAR_PARAMETER__CTX_OWNER);
		createEAttribute(varParameterEClass, VAR_PARAMETER__KIND);
		createEReference(varParameterEClass, VAR_PARAMETER__RES_OWNER);
		createEReference(varParameterEClass, VAR_PARAMETER__DECLARATOR);

		topLevelGOEClass = createEClass(TOP_LEVEL_GO);
		createEReference(topLevelGOEClass, TOP_LEVEL_GO__UNIT_ELEMENT);
		createEReference(topLevelGOEClass, TOP_LEVEL_GO__MODULEIMPORT);

		unitRefGOEClass = createEClass(UNIT_REF_GO);
		createEAttribute(unitRefGOEClass, UNIT_REF_GO__IDENTIFIER);

		tagGOEClass = createEClass(TAG_GO);
		createEAttribute(tagGOEClass, TAG_GO__TAGID);
		createEReference(tagGOEClass, TAG_GO__SCOPED_IDENTIFIER);
		createEReference(tagGOEClass, TAG_GO__TAGVALUE);

		metaModelGOEClass = createEClass(META_MODEL_GO);
		createEReference(metaModelGOEClass, META_MODEL_GO__METAMODEL_H);
		createEReference(metaModelGOEClass, META_MODEL_GO__METAMODEL_ELEMENT);

		accessDeclEClass = createEClass(ACCESS_DECL);
		createEReference(accessDeclEClass, ACCESS_DECL__ACCESS_USAGE);

		typeDefEClass = createEClass(TYPE_DEF);
		createEReference(typeDefEClass, TYPE_DEF__TYPESPEC);

		transformationHeaderEClass = createEClass(TRANSFORMATION_HEADER);
		createEAttribute(transformationHeaderEClass, TRANSFORMATION_HEADER__QUALIFIER);
		createEAttribute(transformationHeaderEClass, TRANSFORMATION_HEADER__NAME);
		createEReference(transformationHeaderEClass, TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE);
		createEReference(transformationHeaderEClass, TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE);

		simpleSignatureEClass = createEClass(SIMPLE_SIGNATURE);
		createEReference(simpleSignatureEClass, SIMPLE_SIGNATURE__PARAM_LIST);

		transformationUsageRefineEClass = createEClass(TRANSFORMATION_USAGE_REFINE);
		createEReference(transformationUsageRefineEClass, TRANSFORMATION_USAGE_REFINE__MODULE_USAGE);
		createEReference(transformationUsageRefineEClass, TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE);

		moduleRefGOEClass = createEClass(MODULE_REF_GO);
		createEReference(moduleRefGOEClass, MODULE_REF_GO__SCOPED_IDENTIFIER);
		createEReference(moduleRefGOEClass, MODULE_REF_GO__SIMPLE_SIGNATURE);

		moduleUsageGOEClass = createEClass(MODULE_USAGE_GO);
		createEReference(moduleUsageGOEClass, MODULE_USAGE_GO__ACCESS_USAGE);
		createEReference(moduleUsageGOEClass, MODULE_USAGE_GO__EXTENDS_USAGE);

		libraryHeaderEClass = createEClass(LIBRARY_HEADER);
		createEAttribute(libraryHeaderEClass, LIBRARY_HEADER__NAME);
		createEReference(libraryHeaderEClass, LIBRARY_HEADER__LIBRARY_SIGNATURE);
		createEReference(libraryHeaderEClass, LIBRARY_HEADER__MODULE_USAGE);

		accessUsageEClass = createEClass(ACCESS_USAGE);
		createEAttribute(accessUsageEClass, ACCESS_USAGE__MODULE_KIND);
		createEReference(accessUsageEClass, ACCESS_USAGE__MODULEREF_LIST);

		extendsUsageEClass = createEClass(EXTENDS_USAGE);
		createEAttribute(extendsUsageEClass, EXTENDS_USAGE__MODULE_KIND);
		createEReference(extendsUsageEClass, EXTENDS_USAGE__MODULEREF_LIST);

		scopedIdentifierEClass = createEClass(SCOPED_IDENTIFIER);
		createEAttribute(scopedIdentifierEClass, SCOPED_IDENTIFIER__IDENTIFIER);

		paramListEClass = createEClass(PARAM_LIST);
		createEReference(paramListEClass, PARAM_LIST__PARAM);

		classifierGOEClass = createEClass(CLASSIFIER_GO);
		createEReference(classifierGOEClass, CLASSIFIER_GO__CLASSIFIER_H);
		createEReference(classifierGOEClass, CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST);

		declaratorEClass = createEClass(DECLARATOR);
		createEReference(declaratorEClass, DECLARATOR__TYPESPEC);
		createEReference(declaratorEClass, DECLARATOR__INIT_PART);
		createEReference(declaratorEClass, DECLARATOR__SCOPED_IDENTIFIER);

		typeSpecEClass = createEClass(TYPE_SPEC);
		createEReference(typeSpecEClass, TYPE_SPEC__TYPE_REFERENCE);
		createEAttribute(typeSpecEClass, TYPE_SPEC__EXTENT_LOCATION);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);
		createEReference(typeReferenceEClass, TYPE_REFERENCE__SCOPED_IDENTIFIER);
		createEReference(typeReferenceEClass, TYPE_REFERENCE__COMPLEX_TYPE);

		complexTypeEClass = createEClass(COMPLEX_TYPE);
		createEAttribute(complexTypeEClass, COMPLEX_TYPE__COMPLEX_TYPE_KEY);
		createEAttribute(complexTypeEClass, COMPLEX_TYPE__COLLECTION_KEY);
		createEReference(complexTypeEClass, COMPLEX_TYPE__TYPESPEC);
		createEReference(complexTypeEClass, COMPLEX_TYPE__DECLARATOR_LIST);

		declaratorListEClass = createEClass(DECLARATOR_LIST);
		createEReference(declaratorListEClass, DECLARATOR_LIST__DECLARATOR);

		initPartEClass = createEClass(INIT_PART);
		createEAttribute(initPartEClass, INIT_PART__INIT_OP);
		createEReference(initPartEClass, INIT_PART__EXPRESSION);

		expressionSemiListEClass = createEClass(EXPRESSION_SEMI_LIST);
		createEReference(expressionSemiListEClass, EXPRESSION_SEMI_LIST__EXPRESSION);

		expressionListEClass = createEClass(EXPRESSION_LIST);
		createEReference(expressionListEClass, EXPRESSION_LIST__EXPRESSION_SEMI_LIST);

		expressionBlockEClass = createEClass(EXPRESSION_BLOCK);
		createEReference(expressionBlockEClass, EXPRESSION_BLOCK__EXPRESSION_LIST);

		packageRefGOEClass = createEClass(PACKAGE_REF_GO);
		createEReference(packageRefGOEClass, PACKAGE_REF_GO__SCOPED_IDENTIFIER);
		createEAttribute(packageRefGOEClass, PACKAGE_REF_GO__URI);

		metaModelHeaderEClass = createEClass(META_MODEL_HEADER);
		createEReference(metaModelHeaderEClass, META_MODEL_HEADER__SCOPED_IDENTIFIER);

		metaModelElementEClass = createEClass(META_MODEL_ELEMENT);
		createEReference(metaModelElementEClass, META_MODEL_ELEMENT__CLASSIFIER);
		createEReference(metaModelElementEClass, META_MODEL_ELEMENT__ENUMERATION);
		createEReference(metaModelElementEClass, META_MODEL_ELEMENT__TAG);

		enumerationGOEClass = createEClass(ENUMERATION_GO);
		createEReference(enumerationGOEClass, ENUMERATION_GO__ENUMERATION_H);
		createEAttribute(enumerationGOEClass, ENUMERATION_GO__IDENTIFIER);

		classifierHeaderEClass = createEClass(CLASSIFIER_HEADER);
		createEReference(classifierHeaderEClass, CLASSIFIER_HEADER__CLASSIFIER_INFO);
		createEReference(classifierHeaderEClass, CLASSIFIER_HEADER__SCOPED_IDENTIFIER);
		createEReference(classifierHeaderEClass, CLASSIFIER_HEADER__CLASSIFIER_EXTENSION);

		classifierFeatureListEClass = createEClass(CLASSIFIER_FEATURE_LIST);
		createEReference(classifierFeatureListEClass, CLASSIFIER_FEATURE_LIST__CLASSIFIER_FEATURE);

		classifierInfoEClass = createEClass(CLASSIFIER_INFO);
		createEAttribute(classifierInfoEClass, CLASSIFIER_INFO__QUALIFIER);

		classifierExtensionEClass = createEClass(CLASSIFIER_EXTENSION);
		createEReference(classifierExtensionEClass, CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST);

		scopedIdentifierListEClass = createEClass(SCOPED_IDENTIFIER_LIST);
		createEReference(scopedIdentifierListEClass, SCOPED_IDENTIFIER_LIST__SCOPED_IDENTIFIER_LIST);

		classifierFeatureEClass = createEClass(CLASSIFIER_FEATURE);
		createEReference(classifierFeatureEClass, CLASSIFIER_FEATURE__FEATURE_QUALIFIER);
		createEReference(classifierFeatureEClass, CLASSIFIER_FEATURE__DECLARATOR);
		createEReference(classifierFeatureEClass, CLASSIFIER_FEATURE__MULTIPLICITY);
		createEReference(classifierFeatureEClass, CLASSIFIER_FEATURE__OPPOSITE_PROPERTY);
		createEReference(classifierFeatureEClass, CLASSIFIER_FEATURE__COMPLETE_SIGNATURE);
		createEReference(classifierFeatureEClass, CLASSIFIER_FEATURE__TAG);

		multiplicityEClass = createEClass(MULTIPLICITY);
		createEAttribute(multiplicityEClass, MULTIPLICITY__MULTIPLICITY_RANGE);

		oppositePropertyEClass = createEClass(OPPOSITE_PROPERTY);
		createEAttribute(oppositePropertyEClass, OPPOSITE_PROPERTY__NAME);
		createEReference(oppositePropertyEClass, OPPOSITE_PROPERTY__MULTIPLICITY);

		stereotypeQualifierEClass = createEClass(STEREOTYPE_QUALIFIER);
		createEAttribute(stereotypeQualifierEClass, STEREOTYPE_QUALIFIER__IDENTIFIER);

		featureQualifierEClass = createEClass(FEATURE_QUALIFIER);
		createEReference(featureQualifierEClass, FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER);
		createEAttribute(featureQualifierEClass, FEATURE_QUALIFIER__FEATURE_KEY);

		completeSignatureEClass = createEClass(COMPLETE_SIGNATURE);
		createEReference(completeSignatureEClass, COMPLETE_SIGNATURE__SIMPLE_SIGNATURE);
		createEReference(completeSignatureEClass, COMPLETE_SIGNATURE__PARAM_LIST);

		enumerationHeaderEClass = createEClass(ENUMERATION_HEADER);
		createEAttribute(enumerationHeaderEClass, ENUMERATION_HEADER__IDENTIFIER);

		helperInfoEClass = createEClass(HELPER_INFO);
		createEAttribute(helperInfoEClass, HELPER_INFO__QUALIFIER);
		createEAttribute(helperInfoEClass, HELPER_INFO__HELPER_KIND);

		helperHeaderEClass = createEClass(HELPER_HEADER);
		createEReference(helperHeaderEClass, HELPER_HEADER__HELPER_INFO);
		createEReference(helperHeaderEClass, HELPER_HEADER__SCOPE_IDENTIFIER);
		createEReference(helperHeaderEClass, HELPER_HEADER__COMPLETE_SIGNATURE);

		constructorHeaderEClass = createEClass(CONSTRUCTOR_HEADER);
		createEAttribute(constructorHeaderEClass, CONSTRUCTOR_HEADER__QUALIFIER);
		createEReference(constructorHeaderEClass, CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER);
		createEReference(constructorHeaderEClass, CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE);

		entryHeaderEClass = createEClass(ENTRY_HEADER);
		createEReference(entryHeaderEClass, ENTRY_HEADER__SIMPLE_SIGNATURE);

		mappingHeaderEClass = createEClass(MAPPING_HEADER);
		createEAttribute(mappingHeaderEClass, MAPPING_HEADER__QUALIFIER);
		createEAttribute(mappingHeaderEClass, MAPPING_HEADER__PARAM_DIRECTION);
		createEReference(mappingHeaderEClass, MAPPING_HEADER__SCOPED_IDENTIFIER);
		createEReference(mappingHeaderEClass, MAPPING_HEADER__COMPLETE_SIGNATURE);
		createEReference(mappingHeaderEClass, MAPPING_HEADER__MAPPING_EXTRA);

		mappingFullHeaderEClass = createEClass(MAPPING_FULL_HEADER);
		createEReference(mappingFullHeaderEClass, MAPPING_FULL_HEADER__MAPPING_HEADER);
		createEReference(mappingFullHeaderEClass, MAPPING_FULL_HEADER__WHEN);
		createEReference(mappingFullHeaderEClass, MAPPING_FULL_HEADER__WHERE);

		mappingExtraEClass = createEClass(MAPPING_EXTRA);
		createEReference(mappingExtraEClass, MAPPING_EXTRA__MAPPING_EXTENSION);
		createEReference(mappingExtraEClass, MAPPING_EXTRA__MAPPING_REFINEMENT);

		mappingExtensionEClass = createEClass(MAPPING_EXTENSION);
		createEAttribute(mappingExtensionEClass, MAPPING_EXTENSION__MAPPING_EXTENSION_KEY);
		createEReference(mappingExtensionEClass, MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST);

		mappingRefinementEClass = createEClass(MAPPING_REFINEMENT);
		createEReference(mappingRefinementEClass, MAPPING_REFINEMENT__SCOPED_IDENTIFIER);

		populationSectionEClass = createEClass(POPULATION_SECTION);
		createEReference(populationSectionEClass, POPULATION_SECTION__EXPRESSION_LIST);
		createEReference(populationSectionEClass, POPULATION_SECTION__EXPRESSION_BLOCK);

		expressionGOEClass = createEClass(EXPRESSION_GO);
		createEAttribute(expressionGOEClass, EXPRESSION_GO__DUMMY_CONTENT);

		// Create enums
		directionKindEEnum = createEEnum(DIRECTION_KIND);
		importKindEEnum = createEEnum(IMPORT_KIND);
		generalQualifierEEnum = createEEnum(GENERAL_QUALIFIER);
		moduleKindEEnum = createEEnum(MODULE_KIND);
		complexTypeKeyEEnum = createEEnum(COMPLEX_TYPE_KEY);
		featureKeyEEnum = createEEnum(FEATURE_KEY);
		propertyKeyEEnum = createEEnum(PROPERTY_KEY);
		helperKindEEnum = createEEnum(HELPER_KIND);
		mappingExtensionKeyEEnum = createEEnum(MAPPING_EXTENSION_KEY);
		collectionKeyEEnum = createEEnum(COLLECTION_KEY);
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
		PrimitiveTypesPackage thePrimitiveTypesPackage = (PrimitiveTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
		EMOFPackage theEMOFPackage = (EMOFPackage)EPackage.Registry.INSTANCE.getEPackage(EMOFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constructorEClass.getESuperTypes().add(this.getImperativeOperation());
		constructorEClass.getESuperTypes().add(this.getModule());
		constructorBodyEClass.getESuperTypes().add(this.getOperationBody());
		contextualPropertyEClass.getESuperTypes().add(this.getImperativeOperation());
		contextualPropertyEClass.getESuperTypes().add(this.getModule());
		entryOperationEClass.getESuperTypes().add(this.getImperativeOperation());
		entryOperationEClass.getESuperTypes().add(this.getModule());
		helperEClass.getESuperTypes().add(this.getImperativeOperation());
		helperEClass.getESuperTypes().add(this.getModule());
		imperativeCallExpEClass.getESuperTypes().add(this.getExpressionGO());
		imperativeOperationEClass.getESuperTypes().add(theEMOFPackage.getOperation());
		libraryEClass.getESuperTypes().add(this.getModule());
		mappingBodyEClass.getESuperTypes().add(this.getOperationBody());
		mappingCallExpEClass.getESuperTypes().add(this.getImperativeCallExp());
		mappingOperationEClass.getESuperTypes().add(this.getImperativeOperation());
		mappingOperationEClass.getESuperTypes().add(this.getModule());
		mappingParameterEClass.getESuperTypes().add(this.getVarParameter());
		modelParameterEClass.getESuperTypes().add(this.getVarParameter());
		modelTypeEClass.getESuperTypes().add(this.getModule());
		moduleEClass.getESuperTypes().add(theEMOFPackage.getPackage());
		moduleImportEClass.getESuperTypes().add(theEMOFPackage.getElement());
		objectExpEClass.getESuperTypes().add(this.getExpressionGO());
		operationBodyEClass.getESuperTypes().add(theEMOFPackage.getElement());
		operationalTransformationEClass.getESuperTypes().add(this.getModule());
		resolveExpEClass.getESuperTypes().add(this.getExpressionGO());
		resolveInExpEClass.getESuperTypes().add(this.getResolveExp());
		varParameterEClass.getESuperTypes().add(this.getExpressionGO());
		varParameterEClass.getESuperTypes().add(theEMOFPackage.getParameter());
		tagGOEClass.getESuperTypes().add(this.getModule());
		tagGOEClass.getESuperTypes().add(this.getImperativeOperation());
		metaModelGOEClass.getESuperTypes().add(this.getModule());
		accessDeclEClass.getESuperTypes().add(this.getModule());
		accessDeclEClass.getESuperTypes().add(this.getImperativeOperation());
		typeDefEClass.getESuperTypes().add(this.getModule());
		typeDefEClass.getESuperTypes().add(this.getImperativeOperation());
		classifierGOEClass.getESuperTypes().add(this.getModule());
		classifierGOEClass.getESuperTypes().add(this.getImperativeOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstructor_Constructor_header(), this.getConstructorHeader(), null, "constructor_header", null, 1, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructor_Expression_block(), this.getExpressionBlock(), null, "expression_block", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorBodyEClass, ConstructorBody.class, "ConstructorBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextualPropertyEClass, ContextualProperty.class, "ContextualProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextualProperty_InitExpression(), this.getExpressionGO(), null, "initExpression", null, 0, 1, ContextualProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextualProperty_Property_key(), this.getPropertyKey(), "property_key", null, 1, -1, ContextualProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextualProperty_Declarator(), this.getDeclarator(), null, "declarator", null, 1, 1, ContextualProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryOperationEClass, EntryOperation.class, "EntryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryOperation_Entry_header(), this.getEntryHeader(), null, "entry_header", null, 1, 1, EntryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryOperation_Expression_block(), this.getExpressionBlock(), null, "expression_block", null, 0, 1, EntryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(helperEClass, Helper.class, "Helper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHelper_IsQuery(), thePrimitiveTypesPackage.getBoolean(), "isQuery", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelper_Helper_header(), this.getHelperHeader(), null, "helper_header", null, 1, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelper_Expression(), this.getExpressionGO(), null, "expression", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelper_Expression_block(), this.getExpressionBlock(), null, "expression_block", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imperativeCallExpEClass, ImperativeCallExp.class, "ImperativeCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImperativeCallExp_IsVirtual(), thePrimitiveTypesPackage.getBoolean(), "isVirtual", "true", 0, 1, ImperativeCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imperativeOperationEClass, ImperativeOperation.class, "ImperativeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImperativeOperation_Body(), this.getOperationBody(), this.getOperationBody_Operation(), "body", null, 0, 1, ImperativeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImperativeOperation_Context(), this.getVarParameter(), this.getVarParameter_CtxOwner(), "context", null, 0, 1, ImperativeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImperativeOperation_IsBlackbox(), thePrimitiveTypesPackage.getBoolean(), "isBlackbox", null, 0, 1, ImperativeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImperativeOperation_Overridden(), this.getImperativeOperation(), null, "overridden", null, 0, 1, ImperativeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImperativeOperation_Result(), this.getVarParameter(), this.getVarParameter_ResOwner(), "result", null, 0, -1, ImperativeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrary_Library_h(), this.getLibraryHeader(), null, "library_h", null, 1, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_Module_element(), this.getImperativeOperation(), null, "module_element", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingBodyEClass, MappingBody.class, "MappingBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingBody_EndSection(), this.getExpressionGO(), null, "endSection", null, 0, -1, MappingBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingBody_InitSection(), this.getExpressionGO(), null, "initSection", null, 0, -1, MappingBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingBody_Population_section(), this.getPopulationSection(), null, "population_section", null, 0, 1, MappingBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingCallExpEClass, MappingCallExp.class, "MappingCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingCallExp_IsStrict(), thePrimitiveTypesPackage.getBoolean(), "isStrict", null, 0, 1, MappingCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingOperationEClass, MappingOperation.class, "MappingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingOperation_Disjunct(), this.getMappingOperation(), null, "disjunct", null, 0, -1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperation_Inherited(), this.getMappingOperation(), null, "inherited", null, 0, -1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperation_Merged(), this.getMappingOperation(), null, "merged", null, 0, -1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperation_RefinedRelation(), this.getExpressionGO(), null, "refinedRelation", null, 0, 1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperation_When(), this.getExpressionGO(), null, "when", null, 0, 1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperation_Where(), this.getExpressionGO(), null, "where", null, 0, 1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperation_Mapping_full_header(), this.getMappingFullHeader(), null, "mapping_full_header", null, 1, 1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperation_Mapping_body(), this.getMappingBody(), null, "mapping_body", null, 0, 1, MappingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingParameterEClass, MappingParameter.class, "MappingParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingParameter_Extent(), this.getModelParameter(), null, "extent", null, 0, 1, MappingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingParameter_ReferredDomain(), this.getExpressionGO(), null, "referredDomain", null, 0, 1, MappingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelParameterEClass, ModelParameter.class, "ModelParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelParameter_Module(), this.getOperationalTransformation(), this.getOperationalTransformation_ModelParameter(), "module", null, 1, 1, ModelParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelType_AdditionalCondition(), this.getExpressionGO(), null, "additionalCondition", null, 0, -1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelType_ConformanceKind(), thePrimitiveTypesPackage.getString(), "conformanceKind", "effective", 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Metamodel(), theEMOFPackage.getPackage(), null, "metamodel", null, 1, -1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelType_Compliance_kind(), ecorePackage.getEString(), "compliance_kind", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Packageref_list(), this.getPackageRefGO(), null, "packageref_list", null, 0, -1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Modeltype_where(), this.getExpressionBlock(), null, "modeltype_where", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, QVTOperational.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_ConfigProperty(), theEMOFPackage.getProperty(), null, "configProperty", null, 0, -1, QVTOperational.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Entry(), this.getEntryOperation(), null, "entry", null, 0, 1, QVTOperational.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ModuleImport(), this.getModuleImport(), this.getModuleImport_Module(), "moduleImport", null, 0, -1, QVTOperational.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_OwnedTag(), theEMOFPackage.getTag(), null, "ownedTag", null, 0, -1, QVTOperational.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_OwnedVariable(), this.getExpressionGO(), null, "ownedVariable", null, 0, -1, QVTOperational.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModule_UsedModelType(), this.getModelType(), null, "usedModelType", null, 0, -1, QVTOperational.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleImportEClass, ModuleImport.class, "ModuleImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleImport_Binding(), this.getModelType(), null, "binding", null, 0, -1, ModuleImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImport_ImportedModule(), this.getModule(), null, "importedModule", null, 1, 1, ModuleImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleImport_Kind(), this.getImportKind(), "kind", "access", 1, 1, ModuleImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImport_Module(), this.getModule(), this.getModule_ModuleImport(), "module", null, 0, 1, ModuleImport.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleImport_Unit(), this.getUnitRefGO(), null, "unit", null, 0, 1, ModuleImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleImport_Identifier(), ecorePackage.getEString(), "identifier", null, 0, -1, ModuleImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectExpEClass, ObjectExp.class, "ObjectExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectExp_Body(), this.getConstructorBody(), null, "body", null, 1, 1, ObjectExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectExp_ReferredObject(), this.getExpressionGO(), null, "referredObject", null, 1, 1, ObjectExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationBodyEClass, OperationBody.class, "OperationBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationBody_Content(), this.getExpressionGO(), null, "content", null, 0, -1, OperationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationBody_Operation(), this.getImperativeOperation(), this.getImperativeOperation_Body(), "operation", null, 0, 1, OperationBody.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationBody_Variable(), this.getExpressionGO(), null, "variable", null, 0, -1, OperationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationalTransformationEClass, OperationalTransformation.class, "OperationalTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalTransformation_IntermediateClass(), theEMOFPackage.getClass_(), null, "intermediateClass", null, 0, -1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalTransformation_IntermediateProperty(), theEMOFPackage.getProperty(), null, "intermediateProperty", null, 0, -1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalTransformation_ModelParameter(), this.getModelParameter(), this.getModelParameter_Module(), "modelParameter", null, 0, -1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalTransformation_Refined(), this.getExpressionGO(), null, "refined", null, 0, 1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalTransformation_Relation(), this.getExpressionGO(), null, "relation", null, 0, -1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalTransformation_Transformation_h(), this.getTransformationHeader(), null, "transformation_h", null, 1, 1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalTransformation_Module_element(), this.getImperativeOperation(), null, "module_element", null, 0, -1, OperationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolveExpEClass, ResolveExp.class, "ResolveExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolveExp_Condition(), this.getExpressionGO(), null, "condition", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveExp_IsDeferred(), thePrimitiveTypesPackage.getBoolean(), "isDeferred", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveExp_IsInverse(), thePrimitiveTypesPackage.getBoolean(), "isInverse", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveExp_One(), thePrimitiveTypesPackage.getBoolean(), "one", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolveExp_Target(), this.getExpressionGO(), null, "target", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolveInExpEClass, ResolveInExp.class, "ResolveInExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolveInExp_InMapping(), this.getMappingOperation(), null, "inMapping", null, 0, 1, ResolveInExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varParameterEClass, VarParameter.class, "VarParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarParameter_CtxOwner(), this.getImperativeOperation(), this.getImperativeOperation_Context(), "ctxOwner", null, 0, 1, VarParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarParameter_Kind(), this.getDirectionKind(), "kind", null, 0, 1, VarParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarParameter_ResOwner(), this.getImperativeOperation(), this.getImperativeOperation_Result(), "resOwner", null, 0, 1, VarParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarParameter_Declarator(), this.getDeclarator(), null, "declarator", null, 1, 1, VarParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topLevelGOEClass, TopLevelGO.class, "TopLevelGO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopLevelGO_Unit_element(), this.getModule(), null, "unit_element", null, 0, -1, TopLevelGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopLevelGO_Moduleimport(), this.getModuleImport(), null, "moduleimport", null, 0, -1, TopLevelGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitRefGOEClass, UnitRefGO.class, "UnitRefGO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitRefGO_Identifier(), ecorePackage.getEString(), "identifier", null, 0, -1, UnitRefGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagGOEClass, TagGO.class, "TagGO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagGO_Tagid(), ecorePackage.getEString(), "tagid", null, 1, 1, TagGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagGO_Scoped_identifier(), this.getScopedIdentifier(), null, "scoped_identifier", null, 1, 1, TagGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagGO_Tagvalue(), this.getExpressionGO(), null, "tagvalue", null, 0, 1, TagGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaModelGOEClass, MetaModelGO.class, "MetaModelGO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaModelGO_Metamodel_h(), this.getMetaModelHeader(), null, "metamodel_h", null, 1, 1, MetaModelGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelGO_Metamodel_element(), this.getMetaModelElement(), null, "metamodel_element", null, 0, -1, MetaModelGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessDeclEClass, AccessDecl.class, "AccessDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessDecl_Access_usage(), this.getAccessUsage(), null, "access_usage", null, 1, 1, AccessDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDef_Typespec(), this.getTypeSpec(), null, "typespec", null, 1, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationHeaderEClass, TransformationHeader.class, "TransformationHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformationHeader_Qualifier(), this.getGeneralQualifier(), "qualifier", null, 0, -1, TransformationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformationHeader_Name(), ecorePackage.getEString(), "name", null, 1, 1, TransformationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationHeader_Transformation_signature(), this.getSimpleSignature(), null, "transformation_signature", null, 1, 1, TransformationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationHeader_Transformation_usage_refine(), this.getTransformationUsageRefine(), null, "transformation_usage_refine", null, 0, 1, TransformationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSignatureEClass, SimpleSignature.class, "SimpleSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleSignature_Param_list(), this.getParamList(), null, "param_list", null, 0, 1, SimpleSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationUsageRefineEClass, TransformationUsageRefine.class, "TransformationUsageRefine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationUsageRefine_Module_usage(), this.getModuleUsageGO(), null, "module_usage", null, 0, 1, TransformationUsageRefine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationUsageRefine_Transformation_refine(), this.getModuleRefGO(), null, "transformation_refine", null, 0, 1, TransformationUsageRefine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleRefGOEClass, ModuleRefGO.class, "ModuleRefGO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleRefGO_Scoped_identifier(), this.getScopedIdentifier(), null, "scoped_identifier", null, 1, 1, ModuleRefGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleRefGO_Simple_signature(), this.getSimpleSignature(), null, "simple_signature", null, 0, 1, ModuleRefGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleUsageGOEClass, ModuleUsageGO.class, "ModuleUsageGO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleUsageGO_Access_usage(), this.getAccessUsage(), null, "access_usage", null, 0, 1, ModuleUsageGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleUsageGO_Extends_usage(), this.getExtendsUsage(), null, "extends_usage", null, 0, 1, ModuleUsageGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryHeaderEClass, LibraryHeader.class, "LibraryHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibraryHeader_Name(), ecorePackage.getEString(), "name", null, 1, 1, LibraryHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryHeader_Library_signature(), this.getSimpleSignature(), null, "library_signature", null, 0, 1, LibraryHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryHeader_Module_usage(), this.getModuleUsageGO(), null, "module_usage", null, 0, 1, LibraryHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessUsageEClass, AccessUsage.class, "AccessUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessUsage_Module_kind(), this.getModuleKind(), "module_kind", null, 0, 1, AccessUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessUsage_Moduleref_list(), this.getModuleRefGO(), null, "moduleref_list", null, 0, -1, AccessUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendsUsageEClass, ExtendsUsage.class, "ExtendsUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendsUsage_Module_kind(), this.getModuleKind(), "module_kind", null, 0, 1, ExtendsUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendsUsage_Moduleref_list(), this.getModuleRefGO(), null, "moduleref_list", null, 0, -1, ExtendsUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopedIdentifierEClass, ScopedIdentifier.class, "ScopedIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScopedIdentifier_Identifier(), ecorePackage.getEString(), "identifier", null, 0, -1, ScopedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramListEClass, ParamList.class, "ParamList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamList_Param(), this.getVarParameter(), null, "param", null, 0, -1, ParamList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierGOEClass, ClassifierGO.class, "ClassifierGO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierGO_Classifier_h(), this.getClassifierHeader(), null, "classifier_h", null, 1, 1, ClassifierGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierGO_Classifier_feature_list(), this.getClassifierFeatureList(), null, "classifier_feature_list", null, 0, 1, ClassifierGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaratorEClass, Declarator.class, "Declarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclarator_Typespec(), this.getTypeSpec(), null, "typespec", null, 1, 1, Declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclarator_Init_part(), this.getInitPart(), null, "init_part", null, 0, 1, Declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclarator_Scoped_identifier(), this.getScopedIdentifier(), null, "scoped_identifier", null, 0, 1, Declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeSpecEClass, TypeSpec.class, "TypeSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeSpec_Type_reference(), this.getTypeReference(), null, "type_reference", null, 1, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSpec_Extent_location(), ecorePackage.getEString(), "extent_location", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeReference_Scoped_identifier(), this.getScopedIdentifier(), null, "scoped_identifier", null, 0, 1, TypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeReference_Complex_type(), this.getComplexType(), null, "complex_type", null, 0, 1, TypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexType_Complex_type_key(), this.getComplexTypeKey(), "complex_type_key", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexType_Collection_key(), this.getCollectionKey(), "collection_key", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexType_Typespec(), this.getTypeSpec(), null, "typespec", null, 0, 2, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexType_Declarator_list(), this.getDeclaratorList(), null, "declarator_list", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaratorListEClass, DeclaratorList.class, "DeclaratorList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaratorList_Declarator(), this.getDeclarator(), null, "declarator", null, 0, -1, DeclaratorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initPartEClass, InitPart.class, "InitPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitPart_Init_op(), ecorePackage.getEString(), "init_op", null, 1, 1, InitPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitPart_Expression(), this.getExpressionGO(), null, "expression", null, 1, 1, InitPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionSemiListEClass, ExpressionSemiList.class, "ExpressionSemiList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionSemiList_Expression(), this.getExpressionGO(), null, "expression", null, 0, -1, ExpressionSemiList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionListEClass, ExpressionList.class, "ExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionList_Expression_semi_list(), this.getExpressionSemiList(), null, "expression_semi_list", null, 1, 1, ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionBlockEClass, ExpressionBlock.class, "ExpressionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionBlock_Expression_list(), this.getExpressionList(), null, "expression_list", null, 0, 1, ExpressionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageRefGOEClass, PackageRefGO.class, "PackageRefGO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageRefGO_Scoped_identifier(), this.getScopedIdentifier(), null, "scoped_identifier", null, 0, 1, PackageRefGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageRefGO_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, PackageRefGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaModelHeaderEClass, MetaModelHeader.class, "MetaModelHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaModelHeader_Scoped_identifier(), this.getScopedIdentifier(), null, "scoped_identifier", null, 1, 1, MetaModelHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaModelElementEClass, MetaModelElement.class, "MetaModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaModelElement_Classifier(), this.getClassifierGO(), null, "classifier", null, 0, 1, MetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelElement_Enumeration(), this.getEnumerationGO(), null, "enumeration", null, 0, 1, MetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelElement_Tag(), this.getTagGO(), null, "tag", null, 0, 1, MetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationGOEClass, EnumerationGO.class, "EnumerationGO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationGO_Enumeration_h(), this.getEnumerationHeader(), null, "enumeration_h", null, 0, 1, EnumerationGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationGO_Identifier(), ecorePackage.getEString(), "identifier", null, 0, -1, EnumerationGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierHeaderEClass, ClassifierHeader.class, "ClassifierHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierHeader_Classifier_info(), this.getClassifierInfo(), null, "classifier_info", null, 1, 1, ClassifierHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierHeader_Scoped_identifier(), this.getScopedIdentifier(), null, "scoped_identifier", null, 1, 1, ClassifierHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierHeader_Classifier_extension(), this.getClassifierExtension(), null, "classifier_extension", null, 0, 1, ClassifierHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierFeatureListEClass, ClassifierFeatureList.class, "ClassifierFeatureList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierFeatureList_Classifier_feature(), this.getClassifierFeature(), null, "classifier_feature", null, 0, -1, ClassifierFeatureList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierInfoEClass, ClassifierInfo.class, "ClassifierInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifierInfo_Qualifier(), this.getGeneralQualifier(), "qualifier", null, 0, -1, ClassifierInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierExtensionEClass, ClassifierExtension.class, "ClassifierExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierExtension_Scoped_identifier_list(), this.getScopedIdentifierList(), null, "scoped_identifier_list", null, 1, 1, ClassifierExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopedIdentifierListEClass, ScopedIdentifierList.class, "ScopedIdentifierList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopedIdentifierList_Scoped_identifier_list(), this.getScopedIdentifier(), null, "scoped_identifier_list", null, 0, -1, ScopedIdentifierList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierFeatureEClass, ClassifierFeature.class, "ClassifierFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierFeature_Feature_qualifier(), this.getFeatureQualifier(), null, "feature_qualifier", null, 0, 1, ClassifierFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierFeature_Declarator(), this.getDeclarator(), null, "declarator", null, 1, 1, ClassifierFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierFeature_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1, ClassifierFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierFeature_Opposite_property(), this.getOppositeProperty(), null, "opposite_property", null, 0, 1, ClassifierFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierFeature_Complete_signature(), this.getCompleteSignature(), null, "complete_signature", null, 0, 1, ClassifierFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierFeature_Tag(), this.getTagGO(), null, "tag", null, 0, 1, ClassifierFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicity_Multiplicity_range(), ecorePackage.getEString(), "multiplicity_range", null, 1, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oppositePropertyEClass, OppositeProperty.class, "OppositeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOppositeProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, OppositeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOppositeProperty_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1, OppositeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stereotypeQualifierEClass, StereotypeQualifier.class, "StereotypeQualifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStereotypeQualifier_Identifier(), ecorePackage.getEString(), "identifier", null, 0, -1, StereotypeQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureQualifierEClass, FeatureQualifier.class, "FeatureQualifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureQualifier_Stereotype_qualifier(), this.getStereotypeQualifier(), null, "stereotype_qualifier", null, 0, 1, FeatureQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureQualifier_Feature_key(), this.getFeatureKey(), "feature_key", null, 0, -1, FeatureQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(completeSignatureEClass, CompleteSignature.class, "CompleteSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompleteSignature_Simple_signature(), this.getSimpleSignature(), null, "simple_signature", null, 1, 1, CompleteSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompleteSignature_Param_list(), this.getParamList(), null, "param_list", null, 0, 1, CompleteSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationHeaderEClass, EnumerationHeader.class, "EnumerationHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationHeader_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EnumerationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(helperInfoEClass, HelperInfo.class, "HelperInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHelperInfo_Qualifier(), this.getGeneralQualifier(), "qualifier", null, 0, -1, HelperInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelperInfo_Helper_kind(), this.getHelperKind(), "helper_kind", null, 0, 1, HelperInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(helperHeaderEClass, HelperHeader.class, "HelperHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHelperHeader_Helper_info(), this.getHelperInfo(), null, "helper_info", null, 1, 1, HelperHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelperHeader_Scope_identifier(), this.getScopedIdentifier(), null, "scope_identifier", null, 1, 1, HelperHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelperHeader_Complete_signature(), this.getCompleteSignature(), null, "complete_signature", null, 1, 1, HelperHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorHeaderEClass, ConstructorHeader.class, "ConstructorHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstructorHeader_Qualifier(), this.getGeneralQualifier(), "qualifier", null, 0, -1, ConstructorHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorHeader_Scoped_identifier(), this.getScopedIdentifier(), null, "scoped_identifier", null, 1, 1, ConstructorHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorHeader_Simple_signature(), this.getSimpleSignature(), null, "simple_signature", null, 1, 1, ConstructorHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryHeaderEClass, EntryHeader.class, "EntryHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryHeader_Simple_signature(), this.getSimpleSignature(), null, "simple_signature", null, 1, 1, EntryHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingHeaderEClass, MappingHeader.class, "MappingHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingHeader_Qualifier(), this.getGeneralQualifier(), "qualifier", null, 0, -1, MappingHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingHeader_Param_direction(), this.getDirectionKind(), "param_direction", null, 0, 1, MappingHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingHeader_Scoped_identifier(), this.getScopedIdentifier(), null, "scoped_identifier", null, 1, 1, MappingHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingHeader_Complete_signature(), this.getCompleteSignature(), null, "complete_signature", null, 1, 1, MappingHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingHeader_Mapping_extra(), this.getMappingExtra(), null, "mapping_extra", null, 0, -1, MappingHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingFullHeaderEClass, MappingFullHeader.class, "MappingFullHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingFullHeader_Mapping_header(), this.getMappingHeader(), null, "mapping_header", null, 1, 1, MappingFullHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingFullHeader_When(), this.getExpressionBlock(), null, "when", null, 0, 1, MappingFullHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingFullHeader_Where(), this.getExpressionBlock(), null, "where", null, 0, 1, MappingFullHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingExtraEClass, MappingExtra.class, "MappingExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingExtra_Mapping_extension(), this.getMappingExtension(), null, "mapping_extension", null, 0, 1, MappingExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingExtra_Mapping_refinement(), this.getMappingRefinement(), null, "mapping_refinement", null, 0, 1, MappingExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingExtensionEClass, MappingExtension.class, "MappingExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingExtension_Mapping_extension_key(), this.getMappingExtensionKey(), "mapping_extension_key", null, 1, 1, MappingExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingExtension_Scoped_identifier_list(), this.getScopedIdentifierList(), null, "scoped_identifier_list", null, 1, 1, MappingExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingRefinementEClass, MappingRefinement.class, "MappingRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingRefinement_Scoped_identifier(), this.getScopedIdentifier(), null, "scoped_identifier", null, 1, 1, MappingRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(populationSectionEClass, PopulationSection.class, "PopulationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPopulationSection_Expression_list(), this.getExpressionList(), null, "expression_list", null, 0, 1, PopulationSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPopulationSection_Expression_block(), this.getExpressionBlock(), null, "expression_block", null, 0, 1, PopulationSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionGOEClass, ExpressionGO.class, "ExpressionGO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionGO_DummyContent(), ecorePackage.getEString(), "dummyContent", null, 0, -1, ExpressionGO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionKindEEnum, DirectionKind.class, "DirectionKind");
		addEEnumLiteral(directionKindEEnum, DirectionKind.IN);
		addEEnumLiteral(directionKindEEnum, DirectionKind.INOUT);
		addEEnumLiteral(directionKindEEnum, DirectionKind.OUT);

		initEEnum(importKindEEnum, ImportKind.class, "ImportKind");
		addEEnumLiteral(importKindEEnum, ImportKind.EXTENSION);
		addEEnumLiteral(importKindEEnum, ImportKind.ACCESS);

		initEEnum(generalQualifierEEnum, GeneralQualifier.class, "GeneralQualifier");
		addEEnumLiteral(generalQualifierEEnum, GeneralQualifier.BLACKBOX);
		addEEnumLiteral(generalQualifierEEnum, GeneralQualifier.ABSTRACT);
		addEEnumLiteral(generalQualifierEEnum, GeneralQualifier.STATIC);

		initEEnum(moduleKindEEnum, ModuleKind.class, "ModuleKind");
		addEEnumLiteral(moduleKindEEnum, ModuleKind.TRANSFORMATION);
		addEEnumLiteral(moduleKindEEnum, ModuleKind.LIBRARY);

		initEEnum(complexTypeKeyEEnum, ComplexTypeKey.class, "ComplexTypeKey");
		addEEnumLiteral(complexTypeKeyEEnum, ComplexTypeKey.COLLECTION);
		addEEnumLiteral(complexTypeKeyEEnum, ComplexTypeKey.SET);
		addEEnumLiteral(complexTypeKeyEEnum, ComplexTypeKey.ORDERED_SET);
		addEEnumLiteral(complexTypeKeyEEnum, ComplexTypeKey.SEQUENCE);
		addEEnumLiteral(complexTypeKeyEEnum, ComplexTypeKey.BAG);
		addEEnumLiteral(complexTypeKeyEEnum, ComplexTypeKey.LIST);
		addEEnumLiteral(complexTypeKeyEEnum, ComplexTypeKey.DICT);
		addEEnumLiteral(complexTypeKeyEEnum, ComplexTypeKey.TUPLE);

		initEEnum(featureKeyEEnum, FeatureKey.class, "FeatureKey");
		addEEnumLiteral(featureKeyEEnum, FeatureKey.COMPOSES);
		addEEnumLiteral(featureKeyEEnum, FeatureKey.REFERENCES);
		addEEnumLiteral(featureKeyEEnum, FeatureKey.READONLY);
		addEEnumLiteral(featureKeyEEnum, FeatureKey.DERIVED);
		addEEnumLiteral(featureKeyEEnum, FeatureKey.STATIC);

		initEEnum(propertyKeyEEnum, PropertyKey.class, "PropertyKey");
		addEEnumLiteral(propertyKeyEEnum, PropertyKey.DERIVED);
		addEEnumLiteral(propertyKeyEEnum, PropertyKey.LITERAL);
		addEEnumLiteral(propertyKeyEEnum, PropertyKey.CONFIGURATION);
		addEEnumLiteral(propertyKeyEEnum, PropertyKey.PROPERTY);

		initEEnum(helperKindEEnum, HelperKind.class, "HelperKind");
		addEEnumLiteral(helperKindEEnum, HelperKind.HELPER);
		addEEnumLiteral(helperKindEEnum, HelperKind.QUERY);

		initEEnum(mappingExtensionKeyEEnum, MappingExtensionKey.class, "MappingExtensionKey");
		addEEnumLiteral(mappingExtensionKeyEEnum, MappingExtensionKey.INHERITS);
		addEEnumLiteral(mappingExtensionKeyEEnum, MappingExtensionKey.MERGES);
		addEEnumLiteral(mappingExtensionKeyEEnum, MappingExtensionKey.DISJUNCTS);

		initEEnum(collectionKeyEEnum, CollectionKey.class, "CollectionKey");
		addEEnumLiteral(collectionKeyEEnum, CollectionKey.COLLECTION);
		addEEnumLiteral(collectionKeyEEnum, CollectionKey.SET);
		addEEnumLiteral(collectionKeyEEnum, CollectionKey.ORDERED_SET);
		addEEnumLiteral(collectionKeyEEnum, CollectionKey.SEQUENCE);
		addEEnumLiteral(collectionKeyEEnum, CollectionKey.BAG);
		addEEnumLiteral(collectionKeyEEnum, CollectionKey.LIST);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";
		addAnnotation
		  (getContextualProperty_InitExpression(),
		   source,
		   new String[] {
			   "body", "ownerProperty"
		   });
		addAnnotation
		  (getImperativeOperation_Overridden(),
		   source,
		   new String[] {
			   "body", "overriding"
		   });
		addAnnotation
		  (getMappingBody_EndSection(),
		   source,
		   new String[] {
			   "body", "endOwner"
		   });
		addAnnotation
		  (getMappingBody_InitSection(),
		   source,
		   new String[] {
			   "body", "initOwner"
		   });
		addAnnotation
		  (getMappingOperation_Disjunct(),
		   source,
		   new String[] {
			   "body", "disjuncter"
		   });
		addAnnotation
		  (getMappingOperation_Inherited(),
		   source,
		   new String[] {
			   "body", "inheriting"
		   });
		addAnnotation
		  (getMappingOperation_Merged(),
		   source,
		   new String[] {
			   "body", "merging"
		   });
		addAnnotation
		  (getMappingOperation_RefinedRelation(),
		   source,
		   new String[] {
			   "body", "refiningOperation"
		   });
		addAnnotation
		  (getMappingOperation_When(),
		   source,
		   new String[] {
			   "body", "whenOwner"
		   });
		addAnnotation
		  (getMappingOperation_Where(),
		   source,
		   new String[] {
			   "body", "whereOwner"
		   });
		addAnnotation
		  (getMappingParameter_Extent(),
		   source,
		   new String[] {
			   "body", "mappingParameter"
		   });
		addAnnotation
		  (getMappingParameter_ReferredDomain(),
		   source,
		   new String[] {
			   "body", "referringParameter"
		   });
		addAnnotation
		  (getModelType_AdditionalCondition(),
		   source,
		   new String[] {
			   "body", "condOwner"
		   });
		addAnnotation
		  (getModelType_Metamodel(),
		   source,
		   new String[] {
			   "body", "modelType"
		   });
		addAnnotation
		  (getModule_ConfigProperty(),
		   source,
		   new String[] {
			   "body", "module"
		   });
		addAnnotation
		  (getModule_Entry(),
		   source,
		   new String[] {
			   "body", "entryContext"
		   });
		addAnnotation
		  (getModule_OwnedTag(),
		   source,
		   new String[] {
			   "body", "owner"
		   });
		addAnnotation
		  (getModule_OwnedVariable(),
		   source,
		   new String[] {
			   "body", "variableOwner"
		   });
		addAnnotation
		  (getModule_UsedModelType(),
		   source,
		   new String[] {
			   "body", "module"
		   });
		addAnnotation
		  (getModuleImport_Binding(),
		   source,
		   new String[] {
			   "body", "moduleImport"
		   });
		addAnnotation
		  (getModuleImport_ImportedModule(),
		   source,
		   new String[] {
			   "body", "importingElement"
		   });
		addAnnotation
		  (getObjectExp_Body(),
		   source,
		   new String[] {
			   "body", "objectExp"
		   });
		addAnnotation
		  (getObjectExp_ReferredObject(),
		   source,
		   new String[] {
			   "body", "objectExpression"
		   });
		addAnnotation
		  (getOperationBody_Content(),
		   source,
		   new String[] {
			   "body", "contentOwner"
		   });
		addAnnotation
		  (getOperationBody_Variable(),
		   source,
		   new String[] {
			   "body", "opBody"
		   });
		addAnnotation
		  (getOperationalTransformation_IntermediateClass(),
		   source,
		   new String[] {
			   "body", "transfClient"
		   });
		addAnnotation
		  (getOperationalTransformation_IntermediateProperty(),
		   source,
		   new String[] {
			   "body", "transfClient"
		   });
		addAnnotation
		  (getOperationalTransformation_Refined(),
		   source,
		   new String[] {
			   "body", "refinement"
		   });
		addAnnotation
		  (getOperationalTransformation_Relation(),
		   source,
		   new String[] {
			   "body", "owner"
		   });
		addAnnotation
		  (getResolveExp_Condition(),
		   source,
		   new String[] {
			   "body", "resolveExp"
		   });
		addAnnotation
		  (getResolveExp_Target(),
		   source,
		   new String[] {
			   "body", "resolveExp"
		   });
		addAnnotation
		  (getResolveInExp_InMapping(),
		   source,
		   new String[] {
			   "body", "resolveExpression"
		   });
	}

} //QVTOperationalPackageImpl
