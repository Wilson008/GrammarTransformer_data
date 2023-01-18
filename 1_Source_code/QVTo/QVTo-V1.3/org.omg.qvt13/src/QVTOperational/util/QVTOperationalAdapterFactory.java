/**
 */
package QVTOperational.util;

import EMOF.Element;
import EMOF.MultiplicityElement;
import EMOF.NamedElement;
import EMOF.Operation;
import EMOF.Parameter;
import EMOF.TypedElement;
import QVTOperational.AccessDecl;
import QVTOperational.AccessUsage;
import QVTOperational.ClassifierExtension;
import QVTOperational.ClassifierFeature;
import QVTOperational.ClassifierFeatureList;
import QVTOperational.ClassifierGO;
import QVTOperational.ClassifierHeader;
import QVTOperational.ClassifierInfo;
import QVTOperational.CompleteSignature;
import QVTOperational.ComplexType;
import QVTOperational.Constructor;
import QVTOperational.ConstructorBody;
import QVTOperational.ConstructorHeader;
import QVTOperational.ContextualProperty;
import QVTOperational.Declarator;
import QVTOperational.DeclaratorList;
import QVTOperational.EntryHeader;
import QVTOperational.EntryOperation;
import QVTOperational.EnumerationGO;
import QVTOperational.EnumerationHeader;
import QVTOperational.ExpressionBlock;
import QVTOperational.ExpressionGO;
import QVTOperational.ExpressionList;
import QVTOperational.ExpressionSemiList;
import QVTOperational.ExtendsUsage;
import QVTOperational.FeatureQualifier;
import QVTOperational.Helper;
import QVTOperational.HelperHeader;
import QVTOperational.HelperInfo;
import QVTOperational.ImperativeCallExp;
import QVTOperational.ImperativeOperation;
import QVTOperational.InitPart;
import QVTOperational.Library;
import QVTOperational.LibraryHeader;
import QVTOperational.MappingBody;
import QVTOperational.MappingCallExp;
import QVTOperational.MappingExtension;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see QVTOperational.QVTOperationalPackage
 * @generated
 */
public class QVTOperationalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QVTOperationalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperationalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QVTOperationalPackage.eINSTANCE;
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
	protected QVTOperationalSwitch<Adapter> modelSwitch =
		new QVTOperationalSwitch<Adapter>() {
			@Override
			public Adapter caseConstructor(Constructor object) {
				return createConstructorAdapter();
			}
			@Override
			public Adapter caseConstructorBody(ConstructorBody object) {
				return createConstructorBodyAdapter();
			}
			@Override
			public Adapter caseContextualProperty(ContextualProperty object) {
				return createContextualPropertyAdapter();
			}
			@Override
			public Adapter caseEntryOperation(EntryOperation object) {
				return createEntryOperationAdapter();
			}
			@Override
			public Adapter caseHelper(Helper object) {
				return createHelperAdapter();
			}
			@Override
			public Adapter caseImperativeCallExp(ImperativeCallExp object) {
				return createImperativeCallExpAdapter();
			}
			@Override
			public Adapter caseImperativeOperation(ImperativeOperation object) {
				return createImperativeOperationAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseMappingBody(MappingBody object) {
				return createMappingBodyAdapter();
			}
			@Override
			public Adapter caseMappingCallExp(MappingCallExp object) {
				return createMappingCallExpAdapter();
			}
			@Override
			public Adapter caseMappingOperation(MappingOperation object) {
				return createMappingOperationAdapter();
			}
			@Override
			public Adapter caseMappingParameter(MappingParameter object) {
				return createMappingParameterAdapter();
			}
			@Override
			public Adapter caseModelParameter(ModelParameter object) {
				return createModelParameterAdapter();
			}
			@Override
			public Adapter caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			@Override
			public Adapter caseModule(QVTOperational.Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseModuleImport(ModuleImport object) {
				return createModuleImportAdapter();
			}
			@Override
			public Adapter caseObjectExp(ObjectExp object) {
				return createObjectExpAdapter();
			}
			@Override
			public Adapter caseOperationBody(OperationBody object) {
				return createOperationBodyAdapter();
			}
			@Override
			public Adapter caseOperationalTransformation(OperationalTransformation object) {
				return createOperationalTransformationAdapter();
			}
			@Override
			public Adapter caseResolveExp(ResolveExp object) {
				return createResolveExpAdapter();
			}
			@Override
			public Adapter caseResolveInExp(ResolveInExp object) {
				return createResolveInExpAdapter();
			}
			@Override
			public Adapter caseVarParameter(VarParameter object) {
				return createVarParameterAdapter();
			}
			@Override
			public Adapter caseTopLevelGO(TopLevelGO object) {
				return createTopLevelGOAdapter();
			}
			@Override
			public Adapter caseUnitRefGO(UnitRefGO object) {
				return createUnitRefGOAdapter();
			}
			@Override
			public Adapter caseTagGO(TagGO object) {
				return createTagGOAdapter();
			}
			@Override
			public Adapter caseMetaModelGO(MetaModelGO object) {
				return createMetaModelGOAdapter();
			}
			@Override
			public Adapter caseAccessDecl(AccessDecl object) {
				return createAccessDeclAdapter();
			}
			@Override
			public Adapter caseTypeDef(TypeDef object) {
				return createTypeDefAdapter();
			}
			@Override
			public Adapter caseTransformationHeader(TransformationHeader object) {
				return createTransformationHeaderAdapter();
			}
			@Override
			public Adapter caseSimpleSignature(SimpleSignature object) {
				return createSimpleSignatureAdapter();
			}
			@Override
			public Adapter caseTransformationUsageRefine(TransformationUsageRefine object) {
				return createTransformationUsageRefineAdapter();
			}
			@Override
			public Adapter caseModuleRefGO(ModuleRefGO object) {
				return createModuleRefGOAdapter();
			}
			@Override
			public Adapter caseModuleUsageGO(ModuleUsageGO object) {
				return createModuleUsageGOAdapter();
			}
			@Override
			public Adapter caseLibraryHeader(LibraryHeader object) {
				return createLibraryHeaderAdapter();
			}
			@Override
			public Adapter caseAccessUsage(AccessUsage object) {
				return createAccessUsageAdapter();
			}
			@Override
			public Adapter caseExtendsUsage(ExtendsUsage object) {
				return createExtendsUsageAdapter();
			}
			@Override
			public Adapter caseScopedIdentifier(ScopedIdentifier object) {
				return createScopedIdentifierAdapter();
			}
			@Override
			public Adapter caseParamList(ParamList object) {
				return createParamListAdapter();
			}
			@Override
			public Adapter caseClassifierGO(ClassifierGO object) {
				return createClassifierGOAdapter();
			}
			@Override
			public Adapter caseDeclarator(Declarator object) {
				return createDeclaratorAdapter();
			}
			@Override
			public Adapter caseTypeSpec(TypeSpec object) {
				return createTypeSpecAdapter();
			}
			@Override
			public Adapter caseTypeReference(TypeReference object) {
				return createTypeReferenceAdapter();
			}
			@Override
			public Adapter caseComplexType(ComplexType object) {
				return createComplexTypeAdapter();
			}
			@Override
			public Adapter caseDeclaratorList(DeclaratorList object) {
				return createDeclaratorListAdapter();
			}
			@Override
			public Adapter caseInitPart(InitPart object) {
				return createInitPartAdapter();
			}
			@Override
			public Adapter caseExpressionSemiList(ExpressionSemiList object) {
				return createExpressionSemiListAdapter();
			}
			@Override
			public Adapter caseExpressionList(ExpressionList object) {
				return createExpressionListAdapter();
			}
			@Override
			public Adapter caseExpressionBlock(ExpressionBlock object) {
				return createExpressionBlockAdapter();
			}
			@Override
			public Adapter casePackageRefGO(PackageRefGO object) {
				return createPackageRefGOAdapter();
			}
			@Override
			public Adapter caseMetaModelHeader(MetaModelHeader object) {
				return createMetaModelHeaderAdapter();
			}
			@Override
			public Adapter caseMetaModelElement(MetaModelElement object) {
				return createMetaModelElementAdapter();
			}
			@Override
			public Adapter caseEnumerationGO(EnumerationGO object) {
				return createEnumerationGOAdapter();
			}
			@Override
			public Adapter caseClassifierHeader(ClassifierHeader object) {
				return createClassifierHeaderAdapter();
			}
			@Override
			public Adapter caseClassifierFeatureList(ClassifierFeatureList object) {
				return createClassifierFeatureListAdapter();
			}
			@Override
			public Adapter caseClassifierInfo(ClassifierInfo object) {
				return createClassifierInfoAdapter();
			}
			@Override
			public Adapter caseClassifierExtension(ClassifierExtension object) {
				return createClassifierExtensionAdapter();
			}
			@Override
			public Adapter caseScopedIdentifierList(ScopedIdentifierList object) {
				return createScopedIdentifierListAdapter();
			}
			@Override
			public Adapter caseClassifierFeature(ClassifierFeature object) {
				return createClassifierFeatureAdapter();
			}
			@Override
			public Adapter caseMultiplicity(Multiplicity object) {
				return createMultiplicityAdapter();
			}
			@Override
			public Adapter caseOppositeProperty(OppositeProperty object) {
				return createOppositePropertyAdapter();
			}
			@Override
			public Adapter caseStereotypeQualifier(StereotypeQualifier object) {
				return createStereotypeQualifierAdapter();
			}
			@Override
			public Adapter caseFeatureQualifier(FeatureQualifier object) {
				return createFeatureQualifierAdapter();
			}
			@Override
			public Adapter caseCompleteSignature(CompleteSignature object) {
				return createCompleteSignatureAdapter();
			}
			@Override
			public Adapter caseEnumerationHeader(EnumerationHeader object) {
				return createEnumerationHeaderAdapter();
			}
			@Override
			public Adapter caseHelperInfo(HelperInfo object) {
				return createHelperInfoAdapter();
			}
			@Override
			public Adapter caseHelperHeader(HelperHeader object) {
				return createHelperHeaderAdapter();
			}
			@Override
			public Adapter caseConstructorHeader(ConstructorHeader object) {
				return createConstructorHeaderAdapter();
			}
			@Override
			public Adapter caseEntryHeader(EntryHeader object) {
				return createEntryHeaderAdapter();
			}
			@Override
			public Adapter caseMappingHeader(MappingHeader object) {
				return createMappingHeaderAdapter();
			}
			@Override
			public Adapter caseMappingFullHeader(MappingFullHeader object) {
				return createMappingFullHeaderAdapter();
			}
			@Override
			public Adapter caseMappingExtra(MappingExtra object) {
				return createMappingExtraAdapter();
			}
			@Override
			public Adapter caseMappingExtension(MappingExtension object) {
				return createMappingExtensionAdapter();
			}
			@Override
			public Adapter caseMappingRefinement(MappingRefinement object) {
				return createMappingRefinementAdapter();
			}
			@Override
			public Adapter casePopulationSection(PopulationSection object) {
				return createPopulationSectionAdapter();
			}
			@Override
			public Adapter caseExpressionGO(ExpressionGO object) {
				return createExpressionGOAdapter();
			}
			@Override
			public Adapter caseObject(EMOF.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter casePackage(EMOF.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
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
	 * Creates a new adapter for an object of class '{@link QVTOperational.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ConstructorBody <em>Constructor Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ConstructorBody
	 * @generated
	 */
	public Adapter createConstructorBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ContextualProperty <em>Contextual Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ContextualProperty
	 * @generated
	 */
	public Adapter createContextualPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.EntryOperation <em>Entry Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.EntryOperation
	 * @generated
	 */
	public Adapter createEntryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.Helper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.Helper
	 * @generated
	 */
	public Adapter createHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ImperativeCallExp <em>Imperative Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ImperativeCallExp
	 * @generated
	 */
	public Adapter createImperativeCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ImperativeOperation <em>Imperative Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ImperativeOperation
	 * @generated
	 */
	public Adapter createImperativeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MappingBody <em>Mapping Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MappingBody
	 * @generated
	 */
	public Adapter createMappingBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MappingCallExp <em>Mapping Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MappingCallExp
	 * @generated
	 */
	public Adapter createMappingCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MappingOperation <em>Mapping Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MappingOperation
	 * @generated
	 */
	public Adapter createMappingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MappingParameter <em>Mapping Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MappingParameter
	 * @generated
	 */
	public Adapter createMappingParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ModelParameter <em>Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ModelParameter
	 * @generated
	 */
	public Adapter createModelParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ModuleImport
	 * @generated
	 */
	public Adapter createModuleImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ObjectExp <em>Object Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ObjectExp
	 * @generated
	 */
	public Adapter createObjectExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.OperationBody <em>Operation Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.OperationBody
	 * @generated
	 */
	public Adapter createOperationBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.OperationalTransformation <em>Operational Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.OperationalTransformation
	 * @generated
	 */
	public Adapter createOperationalTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ResolveExp <em>Resolve Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ResolveExp
	 * @generated
	 */
	public Adapter createResolveExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ResolveInExp <em>Resolve In Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ResolveInExp
	 * @generated
	 */
	public Adapter createResolveInExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.VarParameter <em>Var Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.VarParameter
	 * @generated
	 */
	public Adapter createVarParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.TopLevelGO <em>Top Level GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.TopLevelGO
	 * @generated
	 */
	public Adapter createTopLevelGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.UnitRefGO <em>Unit Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.UnitRefGO
	 * @generated
	 */
	public Adapter createUnitRefGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.TagGO <em>Tag GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.TagGO
	 * @generated
	 */
	public Adapter createTagGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MetaModelGO <em>Meta Model GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MetaModelGO
	 * @generated
	 */
	public Adapter createMetaModelGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.AccessDecl <em>Access Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.AccessDecl
	 * @generated
	 */
	public Adapter createAccessDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.TypeDef
	 * @generated
	 */
	public Adapter createTypeDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.TransformationHeader <em>Transformation Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.TransformationHeader
	 * @generated
	 */
	public Adapter createTransformationHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.SimpleSignature <em>Simple Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.SimpleSignature
	 * @generated
	 */
	public Adapter createSimpleSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.TransformationUsageRefine <em>Transformation Usage Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.TransformationUsageRefine
	 * @generated
	 */
	public Adapter createTransformationUsageRefineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ModuleRefGO <em>Module Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ModuleRefGO
	 * @generated
	 */
	public Adapter createModuleRefGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ModuleUsageGO <em>Module Usage GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ModuleUsageGO
	 * @generated
	 */
	public Adapter createModuleUsageGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.LibraryHeader <em>Library Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.LibraryHeader
	 * @generated
	 */
	public Adapter createLibraryHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.AccessUsage <em>Access Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.AccessUsage
	 * @generated
	 */
	public Adapter createAccessUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ExtendsUsage <em>Extends Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ExtendsUsage
	 * @generated
	 */
	public Adapter createExtendsUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ScopedIdentifier <em>Scoped Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ScopedIdentifier
	 * @generated
	 */
	public Adapter createScopedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ParamList <em>Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ParamList
	 * @generated
	 */
	public Adapter createParamListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ClassifierGO <em>Classifier GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ClassifierGO
	 * @generated
	 */
	public Adapter createClassifierGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.Declarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.Declarator
	 * @generated
	 */
	public Adapter createDeclaratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.TypeSpec <em>Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.TypeSpec
	 * @generated
	 */
	public Adapter createTypeSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.TypeReference
	 * @generated
	 */
	public Adapter createTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ComplexType
	 * @generated
	 */
	public Adapter createComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.DeclaratorList <em>Declarator List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.DeclaratorList
	 * @generated
	 */
	public Adapter createDeclaratorListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.InitPart <em>Init Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.InitPart
	 * @generated
	 */
	public Adapter createInitPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ExpressionSemiList <em>Expression Semi List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ExpressionSemiList
	 * @generated
	 */
	public Adapter createExpressionSemiListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ExpressionList
	 * @generated
	 */
	public Adapter createExpressionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ExpressionBlock <em>Expression Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ExpressionBlock
	 * @generated
	 */
	public Adapter createExpressionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.PackageRefGO <em>Package Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.PackageRefGO
	 * @generated
	 */
	public Adapter createPackageRefGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MetaModelHeader <em>Meta Model Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MetaModelHeader
	 * @generated
	 */
	public Adapter createMetaModelHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MetaModelElement
	 * @generated
	 */
	public Adapter createMetaModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.EnumerationGO <em>Enumeration GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.EnumerationGO
	 * @generated
	 */
	public Adapter createEnumerationGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ClassifierHeader <em>Classifier Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ClassifierHeader
	 * @generated
	 */
	public Adapter createClassifierHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ClassifierFeatureList <em>Classifier Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ClassifierFeatureList
	 * @generated
	 */
	public Adapter createClassifierFeatureListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ClassifierInfo <em>Classifier Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ClassifierInfo
	 * @generated
	 */
	public Adapter createClassifierInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ClassifierExtension <em>Classifier Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ClassifierExtension
	 * @generated
	 */
	public Adapter createClassifierExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ScopedIdentifierList <em>Scoped Identifier List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ScopedIdentifierList
	 * @generated
	 */
	public Adapter createScopedIdentifierListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ClassifierFeature <em>Classifier Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ClassifierFeature
	 * @generated
	 */
	public Adapter createClassifierFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.Multiplicity
	 * @generated
	 */
	public Adapter createMultiplicityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.OppositeProperty <em>Opposite Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.OppositeProperty
	 * @generated
	 */
	public Adapter createOppositePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.StereotypeQualifier <em>Stereotype Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.StereotypeQualifier
	 * @generated
	 */
	public Adapter createStereotypeQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.FeatureQualifier <em>Feature Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.FeatureQualifier
	 * @generated
	 */
	public Adapter createFeatureQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.CompleteSignature <em>Complete Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.CompleteSignature
	 * @generated
	 */
	public Adapter createCompleteSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.EnumerationHeader <em>Enumeration Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.EnumerationHeader
	 * @generated
	 */
	public Adapter createEnumerationHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.HelperInfo <em>Helper Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.HelperInfo
	 * @generated
	 */
	public Adapter createHelperInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.HelperHeader <em>Helper Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.HelperHeader
	 * @generated
	 */
	public Adapter createHelperHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ConstructorHeader <em>Constructor Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ConstructorHeader
	 * @generated
	 */
	public Adapter createConstructorHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.EntryHeader <em>Entry Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.EntryHeader
	 * @generated
	 */
	public Adapter createEntryHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MappingHeader <em>Mapping Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MappingHeader
	 * @generated
	 */
	public Adapter createMappingHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MappingFullHeader <em>Mapping Full Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MappingFullHeader
	 * @generated
	 */
	public Adapter createMappingFullHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MappingExtra <em>Mapping Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MappingExtra
	 * @generated
	 */
	public Adapter createMappingExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MappingExtension <em>Mapping Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MappingExtension
	 * @generated
	 */
	public Adapter createMappingExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.MappingRefinement <em>Mapping Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.MappingRefinement
	 * @generated
	 */
	public Adapter createMappingRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.PopulationSection <em>Population Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.PopulationSection
	 * @generated
	 */
	public Adapter createPopulationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QVTOperational.ExpressionGO <em>Expression GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QVTOperational.ExpressionGO
	 * @generated
	 */
	public Adapter createExpressionGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
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

} //QVTOperationalAdapterFactory
