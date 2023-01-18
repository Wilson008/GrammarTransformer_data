/**
 */
package qvtoperational.util;

import EMOF.Element;
import EMOF.MultiplicityElement;
import EMOF.NamedElement;
import EMOF.Operation;
import EMOF.Parameter;
import EMOF.TypedElement;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import qvtoperational.AccessDecl;
import qvtoperational.AccessUsage;
import qvtoperational.ClassifierExtension;
import qvtoperational.ClassifierFeature;
import qvtoperational.ClassifierFeatureList;
import qvtoperational.ClassifierGO;
import qvtoperational.ClassifierHeader;
import qvtoperational.ClassifierInfo;
import qvtoperational.CompleteSignature;
import qvtoperational.ComplexType;
import qvtoperational.Constructor;
import qvtoperational.ConstructorBody;
import qvtoperational.ConstructorHeader;
import qvtoperational.ContextualProperty;
import qvtoperational.Declarator;
import qvtoperational.DeclaratorList;
import qvtoperational.EntryHeader;
import qvtoperational.EntryOperation;
import qvtoperational.EnumerationGO;
import qvtoperational.EnumerationHeader;
import qvtoperational.ExpressionBlock;
import qvtoperational.ExpressionGO;
import qvtoperational.ExpressionList;
import qvtoperational.ExpressionSemiList;
import qvtoperational.ExtendsUsage;
import qvtoperational.FeatureQualifier;
import qvtoperational.Helper;
import qvtoperational.HelperHeader;
import qvtoperational.HelperInfo;
import qvtoperational.ImperativeCallExp;
import qvtoperational.ImperativeOperation;
import qvtoperational.InitPart;
import qvtoperational.Library;
import qvtoperational.LibraryHeader;
import qvtoperational.MappingBody;
import qvtoperational.MappingCallExp;
import qvtoperational.MappingExtension;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qvtoperational.QvtoperationalPackage
 * @generated
 */
public class QvtoperationalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QvtoperationalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvtoperationalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QvtoperationalPackage.eINSTANCE;
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
	protected QvtoperationalSwitch<Adapter> modelSwitch =
		new QvtoperationalSwitch<Adapter>() {
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
			public Adapter caseModule(qvtoperational.Module object) {
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
	 * Creates a new adapter for an object of class '{@link qvtoperational.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ConstructorBody <em>Constructor Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ConstructorBody
	 * @generated
	 */
	public Adapter createConstructorBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ContextualProperty <em>Contextual Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ContextualProperty
	 * @generated
	 */
	public Adapter createContextualPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.EntryOperation <em>Entry Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.EntryOperation
	 * @generated
	 */
	public Adapter createEntryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.Helper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.Helper
	 * @generated
	 */
	public Adapter createHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ImperativeCallExp <em>Imperative Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ImperativeCallExp
	 * @generated
	 */
	public Adapter createImperativeCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ImperativeOperation <em>Imperative Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ImperativeOperation
	 * @generated
	 */
	public Adapter createImperativeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MappingBody <em>Mapping Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MappingBody
	 * @generated
	 */
	public Adapter createMappingBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MappingCallExp <em>Mapping Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MappingCallExp
	 * @generated
	 */
	public Adapter createMappingCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MappingOperation <em>Mapping Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MappingOperation
	 * @generated
	 */
	public Adapter createMappingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MappingParameter <em>Mapping Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MappingParameter
	 * @generated
	 */
	public Adapter createMappingParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ModelParameter <em>Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ModelParameter
	 * @generated
	 */
	public Adapter createModelParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ModuleImport
	 * @generated
	 */
	public Adapter createModuleImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ObjectExp <em>Object Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ObjectExp
	 * @generated
	 */
	public Adapter createObjectExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.OperationBody <em>Operation Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.OperationBody
	 * @generated
	 */
	public Adapter createOperationBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.OperationalTransformation <em>Operational Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.OperationalTransformation
	 * @generated
	 */
	public Adapter createOperationalTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ResolveExp <em>Resolve Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ResolveExp
	 * @generated
	 */
	public Adapter createResolveExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ResolveInExp <em>Resolve In Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ResolveInExp
	 * @generated
	 */
	public Adapter createResolveInExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.VarParameter <em>Var Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.VarParameter
	 * @generated
	 */
	public Adapter createVarParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.TopLevelGO <em>Top Level GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.TopLevelGO
	 * @generated
	 */
	public Adapter createTopLevelGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.UnitRefGO <em>Unit Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.UnitRefGO
	 * @generated
	 */
	public Adapter createUnitRefGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.TagGO <em>Tag GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.TagGO
	 * @generated
	 */
	public Adapter createTagGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MetaModelGO <em>Meta Model GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MetaModelGO
	 * @generated
	 */
	public Adapter createMetaModelGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.AccessDecl <em>Access Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.AccessDecl
	 * @generated
	 */
	public Adapter createAccessDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.TypeDef
	 * @generated
	 */
	public Adapter createTypeDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.TransformationHeader <em>Transformation Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.TransformationHeader
	 * @generated
	 */
	public Adapter createTransformationHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.SimpleSignature <em>Simple Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.SimpleSignature
	 * @generated
	 */
	public Adapter createSimpleSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.TransformationUsageRefine <em>Transformation Usage Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.TransformationUsageRefine
	 * @generated
	 */
	public Adapter createTransformationUsageRefineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ModuleRefGO <em>Module Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ModuleRefGO
	 * @generated
	 */
	public Adapter createModuleRefGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ModuleUsageGO <em>Module Usage GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ModuleUsageGO
	 * @generated
	 */
	public Adapter createModuleUsageGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.LibraryHeader <em>Library Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.LibraryHeader
	 * @generated
	 */
	public Adapter createLibraryHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.AccessUsage <em>Access Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.AccessUsage
	 * @generated
	 */
	public Adapter createAccessUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ExtendsUsage <em>Extends Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ExtendsUsage
	 * @generated
	 */
	public Adapter createExtendsUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ScopedIdentifier <em>Scoped Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ScopedIdentifier
	 * @generated
	 */
	public Adapter createScopedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ParamList <em>Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ParamList
	 * @generated
	 */
	public Adapter createParamListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ClassifierGO <em>Classifier GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ClassifierGO
	 * @generated
	 */
	public Adapter createClassifierGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.Declarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.Declarator
	 * @generated
	 */
	public Adapter createDeclaratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.TypeSpec <em>Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.TypeSpec
	 * @generated
	 */
	public Adapter createTypeSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.TypeReference
	 * @generated
	 */
	public Adapter createTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ComplexType
	 * @generated
	 */
	public Adapter createComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.DeclaratorList <em>Declarator List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.DeclaratorList
	 * @generated
	 */
	public Adapter createDeclaratorListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.InitPart <em>Init Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.InitPart
	 * @generated
	 */
	public Adapter createInitPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ExpressionSemiList <em>Expression Semi List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ExpressionSemiList
	 * @generated
	 */
	public Adapter createExpressionSemiListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ExpressionList
	 * @generated
	 */
	public Adapter createExpressionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ExpressionBlock <em>Expression Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ExpressionBlock
	 * @generated
	 */
	public Adapter createExpressionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.PackageRefGO <em>Package Ref GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.PackageRefGO
	 * @generated
	 */
	public Adapter createPackageRefGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MetaModelHeader <em>Meta Model Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MetaModelHeader
	 * @generated
	 */
	public Adapter createMetaModelHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MetaModelElement
	 * @generated
	 */
	public Adapter createMetaModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.EnumerationGO <em>Enumeration GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.EnumerationGO
	 * @generated
	 */
	public Adapter createEnumerationGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ClassifierHeader <em>Classifier Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ClassifierHeader
	 * @generated
	 */
	public Adapter createClassifierHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ClassifierFeatureList <em>Classifier Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ClassifierFeatureList
	 * @generated
	 */
	public Adapter createClassifierFeatureListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ClassifierInfo <em>Classifier Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ClassifierInfo
	 * @generated
	 */
	public Adapter createClassifierInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ClassifierExtension <em>Classifier Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ClassifierExtension
	 * @generated
	 */
	public Adapter createClassifierExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ScopedIdentifierList <em>Scoped Identifier List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ScopedIdentifierList
	 * @generated
	 */
	public Adapter createScopedIdentifierListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ClassifierFeature <em>Classifier Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ClassifierFeature
	 * @generated
	 */
	public Adapter createClassifierFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.Multiplicity
	 * @generated
	 */
	public Adapter createMultiplicityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.OppositeProperty <em>Opposite Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.OppositeProperty
	 * @generated
	 */
	public Adapter createOppositePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.StereotypeQualifier <em>Stereotype Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.StereotypeQualifier
	 * @generated
	 */
	public Adapter createStereotypeQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.FeatureQualifier <em>Feature Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.FeatureQualifier
	 * @generated
	 */
	public Adapter createFeatureQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.CompleteSignature <em>Complete Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.CompleteSignature
	 * @generated
	 */
	public Adapter createCompleteSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.EnumerationHeader <em>Enumeration Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.EnumerationHeader
	 * @generated
	 */
	public Adapter createEnumerationHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.HelperInfo <em>Helper Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.HelperInfo
	 * @generated
	 */
	public Adapter createHelperInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.HelperHeader <em>Helper Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.HelperHeader
	 * @generated
	 */
	public Adapter createHelperHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ConstructorHeader <em>Constructor Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ConstructorHeader
	 * @generated
	 */
	public Adapter createConstructorHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.EntryHeader <em>Entry Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.EntryHeader
	 * @generated
	 */
	public Adapter createEntryHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MappingHeader <em>Mapping Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MappingHeader
	 * @generated
	 */
	public Adapter createMappingHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MappingFullHeader <em>Mapping Full Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MappingFullHeader
	 * @generated
	 */
	public Adapter createMappingFullHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MappingExtra <em>Mapping Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MappingExtra
	 * @generated
	 */
	public Adapter createMappingExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MappingExtension <em>Mapping Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MappingExtension
	 * @generated
	 */
	public Adapter createMappingExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.MappingRefinement <em>Mapping Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.MappingRefinement
	 * @generated
	 */
	public Adapter createMappingRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.PopulationSection <em>Population Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.PopulationSection
	 * @generated
	 */
	public Adapter createPopulationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qvtoperational.ExpressionGO <em>Expression GO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qvtoperational.ExpressionGO
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

} //QvtoperationalAdapterFactory
