/**
 */
package QVTOperational.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTOperationalFactoryImpl extends EFactoryImpl implements QVTOperationalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QVTOperationalFactory init() {
		try {
			QVTOperationalFactory theQVTOperationalFactory = (QVTOperationalFactory)EPackage.Registry.INSTANCE.getEFactory(QVTOperationalPackage.eNS_URI);
			if (theQVTOperationalFactory != null) {
				return theQVTOperationalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QVTOperationalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperationalFactoryImpl() {
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
			case QVTOperationalPackage.CONSTRUCTOR: return createConstructor();
			case QVTOperationalPackage.CONSTRUCTOR_BODY: return createConstructorBody();
			case QVTOperationalPackage.CONTEXTUAL_PROPERTY: return createContextualProperty();
			case QVTOperationalPackage.ENTRY_OPERATION: return createEntryOperation();
			case QVTOperationalPackage.HELPER: return createHelper();
			case QVTOperationalPackage.IMPERATIVE_CALL_EXP: return createImperativeCallExp();
			case QVTOperationalPackage.IMPERATIVE_OPERATION: return createImperativeOperation();
			case QVTOperationalPackage.LIBRARY: return createLibrary();
			case QVTOperationalPackage.MAPPING_BODY: return createMappingBody();
			case QVTOperationalPackage.MAPPING_CALL_EXP: return createMappingCallExp();
			case QVTOperationalPackage.MAPPING_OPERATION: return createMappingOperation();
			case QVTOperationalPackage.MAPPING_PARAMETER: return createMappingParameter();
			case QVTOperationalPackage.MODEL_PARAMETER: return createModelParameter();
			case QVTOperationalPackage.MODEL_TYPE: return createModelType();
			case QVTOperationalPackage.MODULE: return createModule();
			case QVTOperationalPackage.MODULE_IMPORT: return createModuleImport();
			case QVTOperationalPackage.OBJECT_EXP: return createObjectExp();
			case QVTOperationalPackage.OPERATION_BODY: return createOperationBody();
			case QVTOperationalPackage.OPERATIONAL_TRANSFORMATION: return createOperationalTransformation();
			case QVTOperationalPackage.RESOLVE_EXP: return createResolveExp();
			case QVTOperationalPackage.RESOLVE_IN_EXP: return createResolveInExp();
			case QVTOperationalPackage.VAR_PARAMETER: return createVarParameter();
			case QVTOperationalPackage.TOP_LEVEL_GO: return createTopLevelGO();
			case QVTOperationalPackage.UNIT_REF_GO: return createUnitRefGO();
			case QVTOperationalPackage.TAG_GO: return createTagGO();
			case QVTOperationalPackage.META_MODEL_GO: return createMetaModelGO();
			case QVTOperationalPackage.ACCESS_DECL: return createAccessDecl();
			case QVTOperationalPackage.TYPE_DEF: return createTypeDef();
			case QVTOperationalPackage.TRANSFORMATION_HEADER: return createTransformationHeader();
			case QVTOperationalPackage.SIMPLE_SIGNATURE: return createSimpleSignature();
			case QVTOperationalPackage.TRANSFORMATION_USAGE_REFINE: return createTransformationUsageRefine();
			case QVTOperationalPackage.MODULE_REF_GO: return createModuleRefGO();
			case QVTOperationalPackage.MODULE_USAGE_GO: return createModuleUsageGO();
			case QVTOperationalPackage.LIBRARY_HEADER: return createLibraryHeader();
			case QVTOperationalPackage.ACCESS_USAGE: return createAccessUsage();
			case QVTOperationalPackage.EXTENDS_USAGE: return createExtendsUsage();
			case QVTOperationalPackage.SCOPED_IDENTIFIER: return createScopedIdentifier();
			case QVTOperationalPackage.PARAM_LIST: return createParamList();
			case QVTOperationalPackage.CLASSIFIER_GO: return createClassifierGO();
			case QVTOperationalPackage.DECLARATOR: return createDeclarator();
			case QVTOperationalPackage.TYPE_SPEC: return createTypeSpec();
			case QVTOperationalPackage.TYPE_REFERENCE: return createTypeReference();
			case QVTOperationalPackage.COMPLEX_TYPE: return createComplexType();
			case QVTOperationalPackage.DECLARATOR_LIST: return createDeclaratorList();
			case QVTOperationalPackage.INIT_PART: return createInitPart();
			case QVTOperationalPackage.EXPRESSION_SEMI_LIST: return createExpressionSemiList();
			case QVTOperationalPackage.EXPRESSION_LIST: return createExpressionList();
			case QVTOperationalPackage.EXPRESSION_BLOCK: return createExpressionBlock();
			case QVTOperationalPackage.PACKAGE_REF_GO: return createPackageRefGO();
			case QVTOperationalPackage.META_MODEL_HEADER: return createMetaModelHeader();
			case QVTOperationalPackage.META_MODEL_ELEMENT: return createMetaModelElement();
			case QVTOperationalPackage.ENUMERATION_GO: return createEnumerationGO();
			case QVTOperationalPackage.CLASSIFIER_HEADER: return createClassifierHeader();
			case QVTOperationalPackage.CLASSIFIER_FEATURE_LIST: return createClassifierFeatureList();
			case QVTOperationalPackage.CLASSIFIER_INFO: return createClassifierInfo();
			case QVTOperationalPackage.CLASSIFIER_EXTENSION: return createClassifierExtension();
			case QVTOperationalPackage.SCOPED_IDENTIFIER_LIST: return createScopedIdentifierList();
			case QVTOperationalPackage.CLASSIFIER_FEATURE: return createClassifierFeature();
			case QVTOperationalPackage.MULTIPLICITY: return createMultiplicity();
			case QVTOperationalPackage.OPPOSITE_PROPERTY: return createOppositeProperty();
			case QVTOperationalPackage.STEREOTYPE_QUALIFIER: return createStereotypeQualifier();
			case QVTOperationalPackage.FEATURE_QUALIFIER: return createFeatureQualifier();
			case QVTOperationalPackage.COMPLETE_SIGNATURE: return createCompleteSignature();
			case QVTOperationalPackage.ENUMERATION_HEADER: return createEnumerationHeader();
			case QVTOperationalPackage.HELPER_INFO: return createHelperInfo();
			case QVTOperationalPackage.HELPER_HEADER: return createHelperHeader();
			case QVTOperationalPackage.CONSTRUCTOR_HEADER: return createConstructorHeader();
			case QVTOperationalPackage.ENTRY_HEADER: return createEntryHeader();
			case QVTOperationalPackage.MAPPING_HEADER: return createMappingHeader();
			case QVTOperationalPackage.MAPPING_FULL_HEADER: return createMappingFullHeader();
			case QVTOperationalPackage.MAPPING_EXTRA: return createMappingExtra();
			case QVTOperationalPackage.MAPPING_EXTENSION: return createMappingExtension();
			case QVTOperationalPackage.MAPPING_REFINEMENT: return createMappingRefinement();
			case QVTOperationalPackage.POPULATION_SECTION: return createPopulationSection();
			case QVTOperationalPackage.EXPRESSION_GO: return createExpressionGO();
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
			case QVTOperationalPackage.DIRECTION_KIND:
				return createDirectionKindFromString(eDataType, initialValue);
			case QVTOperationalPackage.IMPORT_KIND:
				return createImportKindFromString(eDataType, initialValue);
			case QVTOperationalPackage.GENERAL_QUALIFIER:
				return createGeneralQualifierFromString(eDataType, initialValue);
			case QVTOperationalPackage.MODULE_KIND:
				return createModuleKindFromString(eDataType, initialValue);
			case QVTOperationalPackage.COMPLEX_TYPE_KEY:
				return createComplexTypeKeyFromString(eDataType, initialValue);
			case QVTOperationalPackage.FEATURE_KEY:
				return createFeatureKeyFromString(eDataType, initialValue);
			case QVTOperationalPackage.PROPERTY_KEY:
				return createPropertyKeyFromString(eDataType, initialValue);
			case QVTOperationalPackage.HELPER_KIND:
				return createHelperKindFromString(eDataType, initialValue);
			case QVTOperationalPackage.MAPPING_EXTENSION_KEY:
				return createMappingExtensionKeyFromString(eDataType, initialValue);
			case QVTOperationalPackage.COLLECTION_KEY:
				return createCollectionKeyFromString(eDataType, initialValue);
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
			case QVTOperationalPackage.DIRECTION_KIND:
				return convertDirectionKindToString(eDataType, instanceValue);
			case QVTOperationalPackage.IMPORT_KIND:
				return convertImportKindToString(eDataType, instanceValue);
			case QVTOperationalPackage.GENERAL_QUALIFIER:
				return convertGeneralQualifierToString(eDataType, instanceValue);
			case QVTOperationalPackage.MODULE_KIND:
				return convertModuleKindToString(eDataType, instanceValue);
			case QVTOperationalPackage.COMPLEX_TYPE_KEY:
				return convertComplexTypeKeyToString(eDataType, instanceValue);
			case QVTOperationalPackage.FEATURE_KEY:
				return convertFeatureKeyToString(eDataType, instanceValue);
			case QVTOperationalPackage.PROPERTY_KEY:
				return convertPropertyKeyToString(eDataType, instanceValue);
			case QVTOperationalPackage.HELPER_KIND:
				return convertHelperKindToString(eDataType, instanceValue);
			case QVTOperationalPackage.MAPPING_EXTENSION_KEY:
				return convertMappingExtensionKeyToString(eDataType, instanceValue);
			case QVTOperationalPackage.COLLECTION_KEY:
				return convertCollectionKeyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorBody createConstructorBody() {
		ConstructorBodyImpl constructorBody = new ConstructorBodyImpl();
		return constructorBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualProperty createContextualProperty() {
		ContextualPropertyImpl contextualProperty = new ContextualPropertyImpl();
		return contextualProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryOperation createEntryOperation() {
		EntryOperationImpl entryOperation = new EntryOperationImpl();
		return entryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Helper createHelper() {
		HelperImpl helper = new HelperImpl();
		return helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeCallExp createImperativeCallExp() {
		ImperativeCallExpImpl imperativeCallExp = new ImperativeCallExpImpl();
		return imperativeCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOperation createImperativeOperation() {
		ImperativeOperationImpl imperativeOperation = new ImperativeOperationImpl();
		return imperativeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingBody createMappingBody() {
		MappingBodyImpl mappingBody = new MappingBodyImpl();
		return mappingBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingCallExp createMappingCallExp() {
		MappingCallExpImpl mappingCallExp = new MappingCallExpImpl();
		return mappingCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingOperation createMappingOperation() {
		MappingOperationImpl mappingOperation = new MappingOperationImpl();
		return mappingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingParameter createMappingParameter() {
		MappingParameterImpl mappingParameter = new MappingParameterImpl();
		return mappingParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParameter createModelParameter() {
		ModelParameterImpl modelParameter = new ModelParameterImpl();
		return modelParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperational.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleImport createModuleImport() {
		ModuleImportImpl moduleImport = new ModuleImportImpl();
		return moduleImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExp createObjectExp() {
		ObjectExpImpl objectExp = new ObjectExpImpl();
		return objectExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationBody createOperationBody() {
		OperationBodyImpl operationBody = new OperationBodyImpl();
		return operationBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalTransformation createOperationalTransformation() {
		OperationalTransformationImpl operationalTransformation = new OperationalTransformationImpl();
		return operationalTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveExp createResolveExp() {
		ResolveExpImpl resolveExp = new ResolveExpImpl();
		return resolveExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveInExp createResolveInExp() {
		ResolveInExpImpl resolveInExp = new ResolveInExpImpl();
		return resolveInExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarParameter createVarParameter() {
		VarParameterImpl varParameter = new VarParameterImpl();
		return varParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelGO createTopLevelGO() {
		TopLevelGOImpl topLevelGO = new TopLevelGOImpl();
		return topLevelGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitRefGO createUnitRefGO() {
		UnitRefGOImpl unitRefGO = new UnitRefGOImpl();
		return unitRefGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagGO createTagGO() {
		TagGOImpl tagGO = new TagGOImpl();
		return tagGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelGO createMetaModelGO() {
		MetaModelGOImpl metaModelGO = new MetaModelGOImpl();
		return metaModelGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessDecl createAccessDecl() {
		AccessDeclImpl accessDecl = new AccessDeclImpl();
		return accessDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef createTypeDef() {
		TypeDefImpl typeDef = new TypeDefImpl();
		return typeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationHeader createTransformationHeader() {
		TransformationHeaderImpl transformationHeader = new TransformationHeaderImpl();
		return transformationHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSignature createSimpleSignature() {
		SimpleSignatureImpl simpleSignature = new SimpleSignatureImpl();
		return simpleSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationUsageRefine createTransformationUsageRefine() {
		TransformationUsageRefineImpl transformationUsageRefine = new TransformationUsageRefineImpl();
		return transformationUsageRefine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRefGO createModuleRefGO() {
		ModuleRefGOImpl moduleRefGO = new ModuleRefGOImpl();
		return moduleRefGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleUsageGO createModuleUsageGO() {
		ModuleUsageGOImpl moduleUsageGO = new ModuleUsageGOImpl();
		return moduleUsageGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryHeader createLibraryHeader() {
		LibraryHeaderImpl libraryHeader = new LibraryHeaderImpl();
		return libraryHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessUsage createAccessUsage() {
		AccessUsageImpl accessUsage = new AccessUsageImpl();
		return accessUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendsUsage createExtendsUsage() {
		ExtendsUsageImpl extendsUsage = new ExtendsUsageImpl();
		return extendsUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedIdentifier createScopedIdentifier() {
		ScopedIdentifierImpl scopedIdentifier = new ScopedIdentifierImpl();
		return scopedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamList createParamList() {
		ParamListImpl paramList = new ParamListImpl();
		return paramList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierGO createClassifierGO() {
		ClassifierGOImpl classifierGO = new ClassifierGOImpl();
		return classifierGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declarator createDeclarator() {
		DeclaratorImpl declarator = new DeclaratorImpl();
		return declarator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpec createTypeSpec() {
		TypeSpecImpl typeSpec = new TypeSpecImpl();
		return typeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference createTypeReference() {
		TypeReferenceImpl typeReference = new TypeReferenceImpl();
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaratorList createDeclaratorList() {
		DeclaratorListImpl declaratorList = new DeclaratorListImpl();
		return declaratorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitPart createInitPart() {
		InitPartImpl initPart = new InitPartImpl();
		return initPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSemiList createExpressionSemiList() {
		ExpressionSemiListImpl expressionSemiList = new ExpressionSemiListImpl();
		return expressionSemiList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionList createExpressionList() {
		ExpressionListImpl expressionList = new ExpressionListImpl();
		return expressionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBlock createExpressionBlock() {
		ExpressionBlockImpl expressionBlock = new ExpressionBlockImpl();
		return expressionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRefGO createPackageRefGO() {
		PackageRefGOImpl packageRefGO = new PackageRefGOImpl();
		return packageRefGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelHeader createMetaModelHeader() {
		MetaModelHeaderImpl metaModelHeader = new MetaModelHeaderImpl();
		return metaModelHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelElement createMetaModelElement() {
		MetaModelElementImpl metaModelElement = new MetaModelElementImpl();
		return metaModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationGO createEnumerationGO() {
		EnumerationGOImpl enumerationGO = new EnumerationGOImpl();
		return enumerationGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierHeader createClassifierHeader() {
		ClassifierHeaderImpl classifierHeader = new ClassifierHeaderImpl();
		return classifierHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierFeatureList createClassifierFeatureList() {
		ClassifierFeatureListImpl classifierFeatureList = new ClassifierFeatureListImpl();
		return classifierFeatureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierInfo createClassifierInfo() {
		ClassifierInfoImpl classifierInfo = new ClassifierInfoImpl();
		return classifierInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierExtension createClassifierExtension() {
		ClassifierExtensionImpl classifierExtension = new ClassifierExtensionImpl();
		return classifierExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedIdentifierList createScopedIdentifierList() {
		ScopedIdentifierListImpl scopedIdentifierList = new ScopedIdentifierListImpl();
		return scopedIdentifierList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierFeature createClassifierFeature() {
		ClassifierFeatureImpl classifierFeature = new ClassifierFeatureImpl();
		return classifierFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicity() {
		MultiplicityImpl multiplicity = new MultiplicityImpl();
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositeProperty createOppositeProperty() {
		OppositePropertyImpl oppositeProperty = new OppositePropertyImpl();
		return oppositeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StereotypeQualifier createStereotypeQualifier() {
		StereotypeQualifierImpl stereotypeQualifier = new StereotypeQualifierImpl();
		return stereotypeQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureQualifier createFeatureQualifier() {
		FeatureQualifierImpl featureQualifier = new FeatureQualifierImpl();
		return featureQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteSignature createCompleteSignature() {
		CompleteSignatureImpl completeSignature = new CompleteSignatureImpl();
		return completeSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationHeader createEnumerationHeader() {
		EnumerationHeaderImpl enumerationHeader = new EnumerationHeaderImpl();
		return enumerationHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperInfo createHelperInfo() {
		HelperInfoImpl helperInfo = new HelperInfoImpl();
		return helperInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperHeader createHelperHeader() {
		HelperHeaderImpl helperHeader = new HelperHeaderImpl();
		return helperHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorHeader createConstructorHeader() {
		ConstructorHeaderImpl constructorHeader = new ConstructorHeaderImpl();
		return constructorHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryHeader createEntryHeader() {
		EntryHeaderImpl entryHeader = new EntryHeaderImpl();
		return entryHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingHeader createMappingHeader() {
		MappingHeaderImpl mappingHeader = new MappingHeaderImpl();
		return mappingHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFullHeader createMappingFullHeader() {
		MappingFullHeaderImpl mappingFullHeader = new MappingFullHeaderImpl();
		return mappingFullHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingExtra createMappingExtra() {
		MappingExtraImpl mappingExtra = new MappingExtraImpl();
		return mappingExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingExtension createMappingExtension() {
		MappingExtensionImpl mappingExtension = new MappingExtensionImpl();
		return mappingExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRefinement createMappingRefinement() {
		MappingRefinementImpl mappingRefinement = new MappingRefinementImpl();
		return mappingRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationSection createPopulationSection() {
		PopulationSectionImpl populationSection = new PopulationSectionImpl();
		return populationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO createExpressionGO() {
		ExpressionGOImpl expressionGO = new ExpressionGOImpl();
		return expressionGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind createDirectionKindFromString(EDataType eDataType, String initialValue) {
		DirectionKind result = DirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportKind createImportKindFromString(EDataType eDataType, String initialValue) {
		ImportKind result = ImportKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImportKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralQualifier createGeneralQualifierFromString(EDataType eDataType, String initialValue) {
		GeneralQualifier result = GeneralQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneralQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleKind createModuleKindFromString(EDataType eDataType, String initialValue) {
		ModuleKind result = ModuleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeKey createComplexTypeKeyFromString(EDataType eDataType, String initialValue) {
		ComplexTypeKey result = ComplexTypeKey.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComplexTypeKeyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureKey createFeatureKeyFromString(EDataType eDataType, String initialValue) {
		FeatureKey result = FeatureKey.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureKeyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyKey createPropertyKeyFromString(EDataType eDataType, String initialValue) {
		PropertyKey result = PropertyKey.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyKeyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperKind createHelperKindFromString(EDataType eDataType, String initialValue) {
		HelperKind result = HelperKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHelperKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingExtensionKey createMappingExtensionKeyFromString(EDataType eDataType, String initialValue) {
		MappingExtensionKey result = MappingExtensionKey.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingExtensionKeyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKey createCollectionKeyFromString(EDataType eDataType, String initialValue) {
		CollectionKey result = CollectionKey.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionKeyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperationalPackage getQVTOperationalPackage() {
		return (QVTOperationalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QVTOperationalPackage getPackage() {
		return QVTOperationalPackage.eINSTANCE;
	}

} //QVTOperationalFactoryImpl
