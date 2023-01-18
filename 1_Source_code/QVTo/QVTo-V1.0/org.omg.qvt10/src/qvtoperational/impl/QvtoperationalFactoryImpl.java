/**
 */
package qvtoperational.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qvtoperational.AccessDecl;
import qvtoperational.AccessUsage;
import qvtoperational.ClassifierExtension;
import qvtoperational.ClassifierFeature;
import qvtoperational.ClassifierFeatureList;
import qvtoperational.ClassifierGO;
import qvtoperational.ClassifierHeader;
import qvtoperational.ClassifierInfo;
import qvtoperational.CollectionKey;
import qvtoperational.CompleteSignature;
import qvtoperational.ComplexType;
import qvtoperational.ComplexTypeKey;
import qvtoperational.Constructor;
import qvtoperational.ConstructorBody;
import qvtoperational.ConstructorHeader;
import qvtoperational.ContextualProperty;
import qvtoperational.Declarator;
import qvtoperational.DeclaratorList;
import qvtoperational.DirectionKind;
import qvtoperational.EntryHeader;
import qvtoperational.EntryOperation;
import qvtoperational.EnumerationGO;
import qvtoperational.EnumerationHeader;
import qvtoperational.ExpressionBlock;
import qvtoperational.ExpressionGO;
import qvtoperational.ExpressionList;
import qvtoperational.ExpressionSemiList;
import qvtoperational.ExtendsUsage;
import qvtoperational.FeatureKey;
import qvtoperational.FeatureQualifier;
import qvtoperational.GeneralQualifier;
import qvtoperational.Helper;
import qvtoperational.HelperHeader;
import qvtoperational.HelperInfo;
import qvtoperational.HelperKind;
import qvtoperational.ImperativeCallExp;
import qvtoperational.ImperativeOperation;
import qvtoperational.ImportKind;
import qvtoperational.InitPart;
import qvtoperational.Library;
import qvtoperational.LibraryHeader;
import qvtoperational.MappingBody;
import qvtoperational.MappingCallExp;
import qvtoperational.MappingExtension;
import qvtoperational.MappingExtensionKey;
import qvtoperational.MappingExtra;
import qvtoperational.MappingFullHeader;
import qvtoperational.MappingHeader;
import qvtoperational.MappingOperation;
import qvtoperational.MappingParameter;
import qvtoperational.MappingRefinement;
import qvtoperational.MetaModelElement;
import qvtoperational.MetaModelGO;
import qvtoperational.MetaModelHeader;
import qvtoperational.ModelParameter;
import qvtoperational.ModelType;
import qvtoperational.ModuleImport;
import qvtoperational.ModuleKind;
import qvtoperational.ModuleRefGO;
import qvtoperational.ModuleUsageGO;
import qvtoperational.Multiplicity;
import qvtoperational.ObjectExp;
import qvtoperational.OperationBody;
import qvtoperational.OperationalTransformation;
import qvtoperational.OppositeProperty;
import qvtoperational.PackageRefGO;
import qvtoperational.ParamList;
import qvtoperational.PopulationSection;
import qvtoperational.PropertyKey;
import qvtoperational.QvtoperationalFactory;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.ResolveExp;
import qvtoperational.ResolveInExp;
import qvtoperational.ScopedIdentifier;
import qvtoperational.ScopedIdentifierList;
import qvtoperational.SimpleSignature;
import qvtoperational.StereotypeQualifier;
import qvtoperational.TagGO;
import qvtoperational.TopLevelGO;
import qvtoperational.TransformationHeader;
import qvtoperational.TransformationUsageRefine;
import qvtoperational.TypeDef;
import qvtoperational.TypeReference;
import qvtoperational.TypeSpec;
import qvtoperational.UnitRefGO;
import qvtoperational.VarParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QvtoperationalFactoryImpl extends EFactoryImpl implements QvtoperationalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QvtoperationalFactory init() {
		try {
			QvtoperationalFactory theQvtoperationalFactory = (QvtoperationalFactory)EPackage.Registry.INSTANCE.getEFactory(QvtoperationalPackage.eNS_URI);
			if (theQvtoperationalFactory != null) {
				return theQvtoperationalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QvtoperationalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvtoperationalFactoryImpl() {
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
			case QvtoperationalPackage.MAPPING_BODY: return createMappingBody();
			case QvtoperationalPackage.HELPER: return createHelper();
			case QvtoperationalPackage.RESOLVE_EXP: return createResolveExp();
			case QvtoperationalPackage.RESOLVE_IN_EXP: return createResolveInExp();
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION: return createOperationalTransformation();
			case QvtoperationalPackage.MAPPING_PARAMETER: return createMappingParameter();
			case QvtoperationalPackage.MAPPING_OPERATION: return createMappingOperation();
			case QvtoperationalPackage.MAPPING_CALL_EXP: return createMappingCallExp();
			case QvtoperationalPackage.CONSTRUCTOR: return createConstructor();
			case QvtoperationalPackage.CONTEXTUAL_PROPERTY: return createContextualProperty();
			case QvtoperationalPackage.ENTRY_OPERATION: return createEntryOperation();
			case QvtoperationalPackage.IMPERATIVE_CALL_EXP: return createImperativeCallExp();
			case QvtoperationalPackage.IMPERATIVE_OPERATION: return createImperativeOperation();
			case QvtoperationalPackage.LIBRARY: return createLibrary();
			case QvtoperationalPackage.MODEL_PARAMETER: return createModelParameter();
			case QvtoperationalPackage.MODEL_TYPE: return createModelType();
			case QvtoperationalPackage.MODULE: return createModule();
			case QvtoperationalPackage.MODULE_IMPORT: return createModuleImport();
			case QvtoperationalPackage.VAR_PARAMETER: return createVarParameter();
			case QvtoperationalPackage.OPERATION_BODY: return createOperationBody();
			case QvtoperationalPackage.CONSTRUCTOR_BODY: return createConstructorBody();
			case QvtoperationalPackage.OBJECT_EXP: return createObjectExp();
			case QvtoperationalPackage.TOP_LEVEL_GO: return createTopLevelGO();
			case QvtoperationalPackage.UNIT_REF_GO: return createUnitRefGO();
			case QvtoperationalPackage.TAG_GO: return createTagGO();
			case QvtoperationalPackage.META_MODEL_GO: return createMetaModelGO();
			case QvtoperationalPackage.ACCESS_DECL: return createAccessDecl();
			case QvtoperationalPackage.TYPE_DEF: return createTypeDef();
			case QvtoperationalPackage.TRANSFORMATION_HEADER: return createTransformationHeader();
			case QvtoperationalPackage.SIMPLE_SIGNATURE: return createSimpleSignature();
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE: return createTransformationUsageRefine();
			case QvtoperationalPackage.MODULE_REF_GO: return createModuleRefGO();
			case QvtoperationalPackage.MODULE_USAGE_GO: return createModuleUsageGO();
			case QvtoperationalPackage.LIBRARY_HEADER: return createLibraryHeader();
			case QvtoperationalPackage.ACCESS_USAGE: return createAccessUsage();
			case QvtoperationalPackage.EXTENDS_USAGE: return createExtendsUsage();
			case QvtoperationalPackage.SCOPED_IDENTIFIER: return createScopedIdentifier();
			case QvtoperationalPackage.PARAM_LIST: return createParamList();
			case QvtoperationalPackage.CLASSIFIER_GO: return createClassifierGO();
			case QvtoperationalPackage.DECLARATOR: return createDeclarator();
			case QvtoperationalPackage.TYPE_SPEC: return createTypeSpec();
			case QvtoperationalPackage.TYPE_REFERENCE: return createTypeReference();
			case QvtoperationalPackage.COMPLEX_TYPE: return createComplexType();
			case QvtoperationalPackage.DECLARATOR_LIST: return createDeclaratorList();
			case QvtoperationalPackage.INIT_PART: return createInitPart();
			case QvtoperationalPackage.EXPRESSION_SEMI_LIST: return createExpressionSemiList();
			case QvtoperationalPackage.EXPRESSION_LIST: return createExpressionList();
			case QvtoperationalPackage.EXPRESSION_BLOCK: return createExpressionBlock();
			case QvtoperationalPackage.PACKAGE_REF_GO: return createPackageRefGO();
			case QvtoperationalPackage.META_MODEL_HEADER: return createMetaModelHeader();
			case QvtoperationalPackage.META_MODEL_ELEMENT: return createMetaModelElement();
			case QvtoperationalPackage.ENUMERATION_GO: return createEnumerationGO();
			case QvtoperationalPackage.CLASSIFIER_HEADER: return createClassifierHeader();
			case QvtoperationalPackage.CLASSIFIER_FEATURE_LIST: return createClassifierFeatureList();
			case QvtoperationalPackage.CLASSIFIER_INFO: return createClassifierInfo();
			case QvtoperationalPackage.CLASSIFIER_EXTENSION: return createClassifierExtension();
			case QvtoperationalPackage.SCOPED_IDENTIFIER_LIST: return createScopedIdentifierList();
			case QvtoperationalPackage.CLASSIFIER_FEATURE: return createClassifierFeature();
			case QvtoperationalPackage.MULTIPLICITY: return createMultiplicity();
			case QvtoperationalPackage.OPPOSITE_PROPERTY: return createOppositeProperty();
			case QvtoperationalPackage.STEREOTYPE_QUALIFIER: return createStereotypeQualifier();
			case QvtoperationalPackage.FEATURE_QUALIFIER: return createFeatureQualifier();
			case QvtoperationalPackage.COMPLETE_SIGNATURE: return createCompleteSignature();
			case QvtoperationalPackage.ENUMERATION_HEADER: return createEnumerationHeader();
			case QvtoperationalPackage.HELPER_INFO: return createHelperInfo();
			case QvtoperationalPackage.HELPER_HEADER: return createHelperHeader();
			case QvtoperationalPackage.CONSTRUCTOR_HEADER: return createConstructorHeader();
			case QvtoperationalPackage.ENTRY_HEADER: return createEntryHeader();
			case QvtoperationalPackage.MAPPING_HEADER: return createMappingHeader();
			case QvtoperationalPackage.MAPPING_FULL_HEADER: return createMappingFullHeader();
			case QvtoperationalPackage.MAPPING_EXTRA: return createMappingExtra();
			case QvtoperationalPackage.MAPPING_EXTENSION: return createMappingExtension();
			case QvtoperationalPackage.MAPPING_REFINEMENT: return createMappingRefinement();
			case QvtoperationalPackage.POPULATION_SECTION: return createPopulationSection();
			case QvtoperationalPackage.EXPRESSION_GO: return createExpressionGO();
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
			case QvtoperationalPackage.DIRECTION_KIND:
				return createDirectionKindFromString(eDataType, initialValue);
			case QvtoperationalPackage.IMPORT_KIND:
				return createImportKindFromString(eDataType, initialValue);
			case QvtoperationalPackage.GENERAL_QUALIFIER:
				return createGeneralQualifierFromString(eDataType, initialValue);
			case QvtoperationalPackage.MODULE_KIND:
				return createModuleKindFromString(eDataType, initialValue);
			case QvtoperationalPackage.COMPLEX_TYPE_KEY:
				return createComplexTypeKeyFromString(eDataType, initialValue);
			case QvtoperationalPackage.FEATURE_KEY:
				return createFeatureKeyFromString(eDataType, initialValue);
			case QvtoperationalPackage.PROPERTY_KEY:
				return createPropertyKeyFromString(eDataType, initialValue);
			case QvtoperationalPackage.HELPER_KIND:
				return createHelperKindFromString(eDataType, initialValue);
			case QvtoperationalPackage.MAPPING_EXTENSION_KEY:
				return createMappingExtensionKeyFromString(eDataType, initialValue);
			case QvtoperationalPackage.COLLECTION_KEY:
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
			case QvtoperationalPackage.DIRECTION_KIND:
				return convertDirectionKindToString(eDataType, instanceValue);
			case QvtoperationalPackage.IMPORT_KIND:
				return convertImportKindToString(eDataType, instanceValue);
			case QvtoperationalPackage.GENERAL_QUALIFIER:
				return convertGeneralQualifierToString(eDataType, instanceValue);
			case QvtoperationalPackage.MODULE_KIND:
				return convertModuleKindToString(eDataType, instanceValue);
			case QvtoperationalPackage.COMPLEX_TYPE_KEY:
				return convertComplexTypeKeyToString(eDataType, instanceValue);
			case QvtoperationalPackage.FEATURE_KEY:
				return convertFeatureKeyToString(eDataType, instanceValue);
			case QvtoperationalPackage.PROPERTY_KEY:
				return convertPropertyKeyToString(eDataType, instanceValue);
			case QvtoperationalPackage.HELPER_KIND:
				return convertHelperKindToString(eDataType, instanceValue);
			case QvtoperationalPackage.MAPPING_EXTENSION_KEY:
				return convertMappingExtensionKeyToString(eDataType, instanceValue);
			case QvtoperationalPackage.COLLECTION_KEY:
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
	public MappingBody createMappingBody() {
		MappingBodyImpl mappingBody = new MappingBodyImpl();
		return mappingBody;
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
	public OperationalTransformation createOperationalTransformation() {
		OperationalTransformationImpl operationalTransformation = new OperationalTransformationImpl();
		return operationalTransformation;
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
	public MappingOperation createMappingOperation() {
		MappingOperationImpl mappingOperation = new MappingOperationImpl();
		return mappingOperation;
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
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
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
	public qvtoperational.Module createModule() {
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
	public VarParameter createVarParameter() {
		VarParameterImpl varParameter = new VarParameterImpl();
		return varParameter;
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
	public ConstructorBody createConstructorBody() {
		ConstructorBodyImpl constructorBody = new ConstructorBodyImpl();
		return constructorBody;
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
	public QvtoperationalPackage getQvtoperationalPackage() {
		return (QvtoperationalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QvtoperationalPackage getPackage() {
		return QvtoperationalPackage.eINSTANCE;
	}

} //QvtoperationalFactoryImpl
