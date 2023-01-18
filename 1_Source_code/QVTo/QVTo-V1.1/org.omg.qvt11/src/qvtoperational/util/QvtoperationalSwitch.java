/**
 */
package qvtoperational.util;

import EMOF.Element;
import EMOF.MultiplicityElement;
import EMOF.NamedElement;
import EMOF.Operation;
import EMOF.Parameter;
import EMOF.TypedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see qvtoperational.QvtoperationalPackage
 * @generated
 */
public class QvtoperationalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QvtoperationalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvtoperationalSwitch() {
		if (modelPackage == null) {
			modelPackage = QvtoperationalPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QvtoperationalPackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T result = caseConstructor(constructor);
				if (result == null) result = caseImperativeOperation(constructor);
				if (result == null) result = caseModule(constructor);
				if (result == null) result = caseOperation(constructor);
				if (result == null) result = casePackage(constructor);
				if (result == null) result = caseTypedElement(constructor);
				if (result == null) result = caseMultiplicityElement(constructor);
				if (result == null) result = caseNamedElement(constructor);
				if (result == null) result = caseElement(constructor);
				if (result == null) result = caseObject(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.CONSTRUCTOR_BODY: {
				ConstructorBody constructorBody = (ConstructorBody)theEObject;
				T result = caseConstructorBody(constructorBody);
				if (result == null) result = caseOperationBody(constructorBody);
				if (result == null) result = caseElement(constructorBody);
				if (result == null) result = caseObject(constructorBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.CONTEXTUAL_PROPERTY: {
				ContextualProperty contextualProperty = (ContextualProperty)theEObject;
				T result = caseContextualProperty(contextualProperty);
				if (result == null) result = caseImperativeOperation(contextualProperty);
				if (result == null) result = caseModule(contextualProperty);
				if (result == null) result = caseOperation(contextualProperty);
				if (result == null) result = casePackage(contextualProperty);
				if (result == null) result = caseTypedElement(contextualProperty);
				if (result == null) result = caseMultiplicityElement(contextualProperty);
				if (result == null) result = caseNamedElement(contextualProperty);
				if (result == null) result = caseElement(contextualProperty);
				if (result == null) result = caseObject(contextualProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.ENTRY_OPERATION: {
				EntryOperation entryOperation = (EntryOperation)theEObject;
				T result = caseEntryOperation(entryOperation);
				if (result == null) result = caseImperativeOperation(entryOperation);
				if (result == null) result = caseModule(entryOperation);
				if (result == null) result = caseOperation(entryOperation);
				if (result == null) result = casePackage(entryOperation);
				if (result == null) result = caseTypedElement(entryOperation);
				if (result == null) result = caseMultiplicityElement(entryOperation);
				if (result == null) result = caseNamedElement(entryOperation);
				if (result == null) result = caseElement(entryOperation);
				if (result == null) result = caseObject(entryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.HELPER: {
				Helper helper = (Helper)theEObject;
				T result = caseHelper(helper);
				if (result == null) result = caseImperativeOperation(helper);
				if (result == null) result = caseModule(helper);
				if (result == null) result = caseOperation(helper);
				if (result == null) result = casePackage(helper);
				if (result == null) result = caseTypedElement(helper);
				if (result == null) result = caseMultiplicityElement(helper);
				if (result == null) result = caseNamedElement(helper);
				if (result == null) result = caseElement(helper);
				if (result == null) result = caseObject(helper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.IMPERATIVE_CALL_EXP: {
				ImperativeCallExp imperativeCallExp = (ImperativeCallExp)theEObject;
				T result = caseImperativeCallExp(imperativeCallExp);
				if (result == null) result = caseExpressionGO(imperativeCallExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.IMPERATIVE_OPERATION: {
				ImperativeOperation imperativeOperation = (ImperativeOperation)theEObject;
				T result = caseImperativeOperation(imperativeOperation);
				if (result == null) result = caseOperation(imperativeOperation);
				if (result == null) result = caseTypedElement(imperativeOperation);
				if (result == null) result = caseMultiplicityElement(imperativeOperation);
				if (result == null) result = caseNamedElement(imperativeOperation);
				if (result == null) result = caseElement(imperativeOperation);
				if (result == null) result = caseObject(imperativeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseModule(library);
				if (result == null) result = casePackage(library);
				if (result == null) result = caseNamedElement(library);
				if (result == null) result = caseElement(library);
				if (result == null) result = caseObject(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MAPPING_BODY: {
				MappingBody mappingBody = (MappingBody)theEObject;
				T result = caseMappingBody(mappingBody);
				if (result == null) result = caseOperationBody(mappingBody);
				if (result == null) result = caseElement(mappingBody);
				if (result == null) result = caseObject(mappingBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MAPPING_CALL_EXP: {
				MappingCallExp mappingCallExp = (MappingCallExp)theEObject;
				T result = caseMappingCallExp(mappingCallExp);
				if (result == null) result = caseImperativeCallExp(mappingCallExp);
				if (result == null) result = caseExpressionGO(mappingCallExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MAPPING_OPERATION: {
				MappingOperation mappingOperation = (MappingOperation)theEObject;
				T result = caseMappingOperation(mappingOperation);
				if (result == null) result = caseImperativeOperation(mappingOperation);
				if (result == null) result = caseModule(mappingOperation);
				if (result == null) result = caseOperation(mappingOperation);
				if (result == null) result = casePackage(mappingOperation);
				if (result == null) result = caseTypedElement(mappingOperation);
				if (result == null) result = caseMultiplicityElement(mappingOperation);
				if (result == null) result = caseNamedElement(mappingOperation);
				if (result == null) result = caseElement(mappingOperation);
				if (result == null) result = caseObject(mappingOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MAPPING_PARAMETER: {
				MappingParameter mappingParameter = (MappingParameter)theEObject;
				T result = caseMappingParameter(mappingParameter);
				if (result == null) result = caseVarParameter(mappingParameter);
				if (result == null) result = caseParameter(mappingParameter);
				if (result == null) result = caseExpressionGO(mappingParameter);
				if (result == null) result = caseTypedElement(mappingParameter);
				if (result == null) result = caseMultiplicityElement(mappingParameter);
				if (result == null) result = caseNamedElement(mappingParameter);
				if (result == null) result = caseElement(mappingParameter);
				if (result == null) result = caseObject(mappingParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MODEL_PARAMETER: {
				ModelParameter modelParameter = (ModelParameter)theEObject;
				T result = caseModelParameter(modelParameter);
				if (result == null) result = caseVarParameter(modelParameter);
				if (result == null) result = caseParameter(modelParameter);
				if (result == null) result = caseExpressionGO(modelParameter);
				if (result == null) result = caseTypedElement(modelParameter);
				if (result == null) result = caseMultiplicityElement(modelParameter);
				if (result == null) result = caseNamedElement(modelParameter);
				if (result == null) result = caseElement(modelParameter);
				if (result == null) result = caseObject(modelParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				T result = caseModelType(modelType);
				if (result == null) result = caseModule(modelType);
				if (result == null) result = casePackage(modelType);
				if (result == null) result = caseNamedElement(modelType);
				if (result == null) result = caseElement(modelType);
				if (result == null) result = caseObject(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MODULE: {
				qvtoperational.Module module = (qvtoperational.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = casePackage(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = caseElement(module);
				if (result == null) result = caseObject(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MODULE_IMPORT: {
				ModuleImport moduleImport = (ModuleImport)theEObject;
				T result = caseModuleImport(moduleImport);
				if (result == null) result = caseElement(moduleImport);
				if (result == null) result = caseObject(moduleImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.OBJECT_EXP: {
				ObjectExp objectExp = (ObjectExp)theEObject;
				T result = caseObjectExp(objectExp);
				if (result == null) result = caseExpressionGO(objectExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.OPERATION_BODY: {
				OperationBody operationBody = (OperationBody)theEObject;
				T result = caseOperationBody(operationBody);
				if (result == null) result = caseElement(operationBody);
				if (result == null) result = caseObject(operationBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION: {
				OperationalTransformation operationalTransformation = (OperationalTransformation)theEObject;
				T result = caseOperationalTransformation(operationalTransformation);
				if (result == null) result = caseModule(operationalTransformation);
				if (result == null) result = casePackage(operationalTransformation);
				if (result == null) result = caseNamedElement(operationalTransformation);
				if (result == null) result = caseElement(operationalTransformation);
				if (result == null) result = caseObject(operationalTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.RESOLVE_EXP: {
				ResolveExp resolveExp = (ResolveExp)theEObject;
				T result = caseResolveExp(resolveExp);
				if (result == null) result = caseExpressionGO(resolveExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.RESOLVE_IN_EXP: {
				ResolveInExp resolveInExp = (ResolveInExp)theEObject;
				T result = caseResolveInExp(resolveInExp);
				if (result == null) result = caseResolveExp(resolveInExp);
				if (result == null) result = caseExpressionGO(resolveInExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.VAR_PARAMETER: {
				VarParameter varParameter = (VarParameter)theEObject;
				T result = caseVarParameter(varParameter);
				if (result == null) result = caseParameter(varParameter);
				if (result == null) result = caseExpressionGO(varParameter);
				if (result == null) result = caseTypedElement(varParameter);
				if (result == null) result = caseMultiplicityElement(varParameter);
				if (result == null) result = caseNamedElement(varParameter);
				if (result == null) result = caseElement(varParameter);
				if (result == null) result = caseObject(varParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.TOP_LEVEL_GO: {
				TopLevelGO topLevelGO = (TopLevelGO)theEObject;
				T result = caseTopLevelGO(topLevelGO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.UNIT_REF_GO: {
				UnitRefGO unitRefGO = (UnitRefGO)theEObject;
				T result = caseUnitRefGO(unitRefGO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.TAG_GO: {
				TagGO tagGO = (TagGO)theEObject;
				T result = caseTagGO(tagGO);
				if (result == null) result = caseModule(tagGO);
				if (result == null) result = caseImperativeOperation(tagGO);
				if (result == null) result = casePackage(tagGO);
				if (result == null) result = caseOperation(tagGO);
				if (result == null) result = caseTypedElement(tagGO);
				if (result == null) result = caseMultiplicityElement(tagGO);
				if (result == null) result = caseNamedElement(tagGO);
				if (result == null) result = caseElement(tagGO);
				if (result == null) result = caseObject(tagGO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.META_MODEL_GO: {
				MetaModelGO metaModelGO = (MetaModelGO)theEObject;
				T result = caseMetaModelGO(metaModelGO);
				if (result == null) result = caseModule(metaModelGO);
				if (result == null) result = casePackage(metaModelGO);
				if (result == null) result = caseNamedElement(metaModelGO);
				if (result == null) result = caseElement(metaModelGO);
				if (result == null) result = caseObject(metaModelGO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.ACCESS_DECL: {
				AccessDecl accessDecl = (AccessDecl)theEObject;
				T result = caseAccessDecl(accessDecl);
				if (result == null) result = caseModule(accessDecl);
				if (result == null) result = caseImperativeOperation(accessDecl);
				if (result == null) result = casePackage(accessDecl);
				if (result == null) result = caseOperation(accessDecl);
				if (result == null) result = caseTypedElement(accessDecl);
				if (result == null) result = caseMultiplicityElement(accessDecl);
				if (result == null) result = caseNamedElement(accessDecl);
				if (result == null) result = caseElement(accessDecl);
				if (result == null) result = caseObject(accessDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.TYPE_DEF: {
				TypeDef typeDef = (TypeDef)theEObject;
				T result = caseTypeDef(typeDef);
				if (result == null) result = caseModule(typeDef);
				if (result == null) result = caseImperativeOperation(typeDef);
				if (result == null) result = casePackage(typeDef);
				if (result == null) result = caseOperation(typeDef);
				if (result == null) result = caseTypedElement(typeDef);
				if (result == null) result = caseMultiplicityElement(typeDef);
				if (result == null) result = caseNamedElement(typeDef);
				if (result == null) result = caseElement(typeDef);
				if (result == null) result = caseObject(typeDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.TRANSFORMATION_HEADER: {
				TransformationHeader transformationHeader = (TransformationHeader)theEObject;
				T result = caseTransformationHeader(transformationHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.SIMPLE_SIGNATURE: {
				SimpleSignature simpleSignature = (SimpleSignature)theEObject;
				T result = caseSimpleSignature(simpleSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE: {
				TransformationUsageRefine transformationUsageRefine = (TransformationUsageRefine)theEObject;
				T result = caseTransformationUsageRefine(transformationUsageRefine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MODULE_REF_GO: {
				ModuleRefGO moduleRefGO = (ModuleRefGO)theEObject;
				T result = caseModuleRefGO(moduleRefGO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MODULE_USAGE_GO: {
				ModuleUsageGO moduleUsageGO = (ModuleUsageGO)theEObject;
				T result = caseModuleUsageGO(moduleUsageGO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.LIBRARY_HEADER: {
				LibraryHeader libraryHeader = (LibraryHeader)theEObject;
				T result = caseLibraryHeader(libraryHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.ACCESS_USAGE: {
				AccessUsage accessUsage = (AccessUsage)theEObject;
				T result = caseAccessUsage(accessUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.EXTENDS_USAGE: {
				ExtendsUsage extendsUsage = (ExtendsUsage)theEObject;
				T result = caseExtendsUsage(extendsUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.SCOPED_IDENTIFIER: {
				ScopedIdentifier scopedIdentifier = (ScopedIdentifier)theEObject;
				T result = caseScopedIdentifier(scopedIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.PARAM_LIST: {
				ParamList paramList = (ParamList)theEObject;
				T result = caseParamList(paramList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.CLASSIFIER_GO: {
				ClassifierGO classifierGO = (ClassifierGO)theEObject;
				T result = caseClassifierGO(classifierGO);
				if (result == null) result = caseImperativeOperation(classifierGO);
				if (result == null) result = caseModule(classifierGO);
				if (result == null) result = caseOperation(classifierGO);
				if (result == null) result = casePackage(classifierGO);
				if (result == null) result = caseTypedElement(classifierGO);
				if (result == null) result = caseMultiplicityElement(classifierGO);
				if (result == null) result = caseNamedElement(classifierGO);
				if (result == null) result = caseElement(classifierGO);
				if (result == null) result = caseObject(classifierGO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.DECLARATOR: {
				Declarator declarator = (Declarator)theEObject;
				T result = caseDeclarator(declarator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.TYPE_SPEC: {
				TypeSpec typeSpec = (TypeSpec)theEObject;
				T result = caseTypeSpec(typeSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T result = caseTypeReference(typeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.COMPLEX_TYPE: {
				ComplexType complexType = (ComplexType)theEObject;
				T result = caseComplexType(complexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.DECLARATOR_LIST: {
				DeclaratorList declaratorList = (DeclaratorList)theEObject;
				T result = caseDeclaratorList(declaratorList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.INIT_PART: {
				InitPart initPart = (InitPart)theEObject;
				T result = caseInitPart(initPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.EXPRESSION_SEMI_LIST: {
				ExpressionSemiList expressionSemiList = (ExpressionSemiList)theEObject;
				T result = caseExpressionSemiList(expressionSemiList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.EXPRESSION_LIST: {
				ExpressionList expressionList = (ExpressionList)theEObject;
				T result = caseExpressionList(expressionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.EXPRESSION_BLOCK: {
				ExpressionBlock expressionBlock = (ExpressionBlock)theEObject;
				T result = caseExpressionBlock(expressionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.PACKAGE_REF_GO: {
				PackageRefGO packageRefGO = (PackageRefGO)theEObject;
				T result = casePackageRefGO(packageRefGO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.META_MODEL_HEADER: {
				MetaModelHeader metaModelHeader = (MetaModelHeader)theEObject;
				T result = caseMetaModelHeader(metaModelHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.META_MODEL_ELEMENT: {
				MetaModelElement metaModelElement = (MetaModelElement)theEObject;
				T result = caseMetaModelElement(metaModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.ENUMERATION_GO: {
				EnumerationGO enumerationGO = (EnumerationGO)theEObject;
				T result = caseEnumerationGO(enumerationGO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.CLASSIFIER_HEADER: {
				ClassifierHeader classifierHeader = (ClassifierHeader)theEObject;
				T result = caseClassifierHeader(classifierHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.CLASSIFIER_FEATURE_LIST: {
				ClassifierFeatureList classifierFeatureList = (ClassifierFeatureList)theEObject;
				T result = caseClassifierFeatureList(classifierFeatureList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.CLASSIFIER_INFO: {
				ClassifierInfo classifierInfo = (ClassifierInfo)theEObject;
				T result = caseClassifierInfo(classifierInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.CLASSIFIER_EXTENSION: {
				ClassifierExtension classifierExtension = (ClassifierExtension)theEObject;
				T result = caseClassifierExtension(classifierExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.SCOPED_IDENTIFIER_LIST: {
				ScopedIdentifierList scopedIdentifierList = (ScopedIdentifierList)theEObject;
				T result = caseScopedIdentifierList(scopedIdentifierList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.CLASSIFIER_FEATURE: {
				ClassifierFeature classifierFeature = (ClassifierFeature)theEObject;
				T result = caseClassifierFeature(classifierFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MULTIPLICITY: {
				Multiplicity multiplicity = (Multiplicity)theEObject;
				T result = caseMultiplicity(multiplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.OPPOSITE_PROPERTY: {
				OppositeProperty oppositeProperty = (OppositeProperty)theEObject;
				T result = caseOppositeProperty(oppositeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.STEREOTYPE_QUALIFIER: {
				StereotypeQualifier stereotypeQualifier = (StereotypeQualifier)theEObject;
				T result = caseStereotypeQualifier(stereotypeQualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.FEATURE_QUALIFIER: {
				FeatureQualifier featureQualifier = (FeatureQualifier)theEObject;
				T result = caseFeatureQualifier(featureQualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.COMPLETE_SIGNATURE: {
				CompleteSignature completeSignature = (CompleteSignature)theEObject;
				T result = caseCompleteSignature(completeSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.ENUMERATION_HEADER: {
				EnumerationHeader enumerationHeader = (EnumerationHeader)theEObject;
				T result = caseEnumerationHeader(enumerationHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.HELPER_INFO: {
				HelperInfo helperInfo = (HelperInfo)theEObject;
				T result = caseHelperInfo(helperInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.HELPER_HEADER: {
				HelperHeader helperHeader = (HelperHeader)theEObject;
				T result = caseHelperHeader(helperHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.CONSTRUCTOR_HEADER: {
				ConstructorHeader constructorHeader = (ConstructorHeader)theEObject;
				T result = caseConstructorHeader(constructorHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.ENTRY_HEADER: {
				EntryHeader entryHeader = (EntryHeader)theEObject;
				T result = caseEntryHeader(entryHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MAPPING_HEADER: {
				MappingHeader mappingHeader = (MappingHeader)theEObject;
				T result = caseMappingHeader(mappingHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MAPPING_FULL_HEADER: {
				MappingFullHeader mappingFullHeader = (MappingFullHeader)theEObject;
				T result = caseMappingFullHeader(mappingFullHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MAPPING_EXTRA: {
				MappingExtra mappingExtra = (MappingExtra)theEObject;
				T result = caseMappingExtra(mappingExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MAPPING_EXTENSION: {
				MappingExtension mappingExtension = (MappingExtension)theEObject;
				T result = caseMappingExtension(mappingExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.MAPPING_REFINEMENT: {
				MappingRefinement mappingRefinement = (MappingRefinement)theEObject;
				T result = caseMappingRefinement(mappingRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.POPULATION_SECTION: {
				PopulationSection populationSection = (PopulationSection)theEObject;
				T result = casePopulationSection(populationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalPackage.EXPRESSION_GO: {
				ExpressionGO expressionGO = (ExpressionGO)theEObject;
				T result = caseExpressionGO(expressionGO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorBody(ConstructorBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contextual Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contextual Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextualProperty(ContextualProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryOperation(EntryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelper(Helper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imperative Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imperative Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImperativeCallExp(ImperativeCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imperative Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imperative Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImperativeOperation(ImperativeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingBody(MappingBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Call Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingCallExp(MappingCallExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingOperation(MappingOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingParameter(MappingParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelParameter(ModelParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(qvtoperational.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleImport(ModuleImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectExp(ObjectExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationBody(OperationBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalTransformation(OperationalTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolve Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolveExp(ResolveExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolve In Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve In Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolveInExp(ResolveInExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarParameter(VarParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Level GO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Level GO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopLevelGO(TopLevelGO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Ref GO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Ref GO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitRefGO(UnitRefGO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag GO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag GO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagGO(TagGO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model GO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model GO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaModelGO(MetaModelGO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessDecl(AccessDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDef(TypeDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationHeader(TransformationHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSignature(SimpleSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Usage Refine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Usage Refine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationUsageRefine(TransformationUsageRefine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Ref GO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Ref GO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleRefGO(ModuleRefGO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Usage GO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Usage GO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleUsageGO(ModuleUsageGO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryHeader(LibraryHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessUsage(AccessUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extends Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extends Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendsUsage(ExtendsUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopedIdentifier(ScopedIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamList(ParamList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier GO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier GO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierGO(ClassifierGO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declarator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declarator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarator(Declarator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSpec(TypeSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexType(ComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declarator List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declarator List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaratorList(DeclaratorList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitPart(InitPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Semi List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Semi List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionSemiList(ExpressionSemiList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionList(ExpressionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionBlock(ExpressionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Ref GO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Ref GO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageRefGO(PackageRefGO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaModelHeader(MetaModelHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaModelElement(MetaModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration GO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration GO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationGO(EnumerationGO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierHeader(ClassifierHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Feature List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Feature List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierFeatureList(ClassifierFeatureList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierInfo(ClassifierInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierExtension(ClassifierExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Identifier List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Identifier List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopedIdentifierList(ScopedIdentifierList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierFeature(ClassifierFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicity(Multiplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opposite Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opposite Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOppositeProperty(OppositeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypeQualifier(StereotypeQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureQualifier(FeatureQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complete Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complete Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompleteSignature(CompleteSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationHeader(EnumerationHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelperInfo(HelperInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelperHeader(HelperHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorHeader(ConstructorHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryHeader(EntryHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingHeader(MappingHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Full Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Full Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingFullHeader(MappingFullHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingExtra(MappingExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingExtension(MappingExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingRefinement(MappingRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Population Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Population Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopulationSection(PopulationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression GO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression GO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionGO(ExpressionGO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(EMOF.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(EMOF.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QvtoperationalSwitch
