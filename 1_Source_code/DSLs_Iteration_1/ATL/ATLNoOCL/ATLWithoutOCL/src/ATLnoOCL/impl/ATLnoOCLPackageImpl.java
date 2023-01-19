/**
 */
package ATLnoOCL.impl;

import ATLnoOCL.ATLnoOCLFactory;
import ATLnoOCL.ATLnoOCLPackage;
import ATLnoOCL.ActionBlock;
import ATLnoOCL.Binding;
import ATLnoOCL.BindingStat;
import ATLnoOCL.CalledRule;
import ATLnoOCL.ExpressionStat;
import ATLnoOCL.ForEachOutPatternElement;
import ATLnoOCL.ForStat;
import ATLnoOCL.Helper;
import ATLnoOCL.IfStat;
import ATLnoOCL.InPattern;
import ATLnoOCL.InPatternElement;
import ATLnoOCL.LazyMatchedRule;
import ATLnoOCL.Library;
import ATLnoOCL.LibraryRef;
import ATLnoOCL.LocatedElement;
import ATLnoOCL.MatchedRule;
import ATLnoOCL.ModuleElement;
import ATLnoOCL.OCLDummy;
import ATLnoOCL.OutPattern;
import ATLnoOCL.OutPatternElement;
import ATLnoOCL.PatternElement;
import ATLnoOCL.Query;
import ATLnoOCL.Root;
import ATLnoOCL.Rule;
import ATLnoOCL.RuleVariableDeclaration;
import ATLnoOCL.SimpleInPatternElement;
import ATLnoOCL.SimpleOutPatternElement;
import ATLnoOCL.Statement;
import ATLnoOCL.Unit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ATLnoOCLPackageImpl extends EPackageImpl implements ATLnoOCLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

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
	private EClass queryEClass = null;

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
	private EClass moduleElementEClass = null;

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
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchedRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lazyMatchedRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calledRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inPatternElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleInPatternElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outPatternElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleOutPatternElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEachOutPatternElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclDummyEClass = null;

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
	 * @see ATLnoOCL.ATLnoOCLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ATLnoOCLPackageImpl() {
		super(eNS_URI, ATLnoOCLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ATLnoOCLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ATLnoOCLPackage init() {
		if (isInited) return (ATLnoOCLPackage)EPackage.Registry.INSTANCE.getEPackage(ATLnoOCLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredATLnoOCLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ATLnoOCLPackageImpl theATLnoOCLPackage = registeredATLnoOCLPackage instanceof ATLnoOCLPackageImpl ? (ATLnoOCLPackageImpl)registeredATLnoOCLPackage : new ATLnoOCLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theATLnoOCLPackage.createPackageContents();

		// Initialize created meta-data
		theATLnoOCLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theATLnoOCLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ATLnoOCLPackage.eNS_URI, theATLnoOCLPackage);
		return theATLnoOCLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocatedElement() {
		return locatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatedElement_Location() {
		return (EAttribute)locatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatedElement_CommentsBefore() {
		return (EAttribute)locatedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatedElement_CommentsAfter() {
		return (EAttribute)locatedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Libraries() {
		return (EReference)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Name() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(1);
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
	public EReference getLibrary_Helpers() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Body() {
		return (EReference)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Helpers() {
		return (EReference)queryEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getModule_IsRefining() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_InModels() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_OutModels() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Elements() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleElement() {
		return moduleElementEClass;
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
	public EReference getHelper_Query() {
		return (EReference)helperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelper_Library() {
		return (EReference)helperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelper_Definition() {
		return (EReference)helperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_OutPattern() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_ActionBlock() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Variables() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchedRule() {
		return matchedRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedRule_InPattern() {
		return (EReference)matchedRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedRule_Children() {
		return (EReference)matchedRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedRule_SuperRule() {
		return (EReference)matchedRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchedRule_IsAbstract() {
		return (EAttribute)matchedRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchedRule_IsRefining() {
		return (EAttribute)matchedRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchedRule_IsNoDefault() {
		return (EAttribute)matchedRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLazyMatchedRule() {
		return lazyMatchedRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLazyMatchedRule_IsUnique() {
		return (EAttribute)lazyMatchedRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalledRule() {
		return calledRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalledRule_Parameters() {
		return (EReference)calledRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalledRule_IsEntrypoint() {
		return (EAttribute)calledRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalledRule_IsEndpoint() {
		return (EAttribute)calledRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInPattern() {
		return inPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInPattern_Elements() {
		return (EReference)inPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInPattern_Rule() {
		return (EReference)inPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInPattern_Filter() {
		return (EReference)inPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutPattern() {
		return outPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutPattern_Rule() {
		return (EReference)outPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutPattern_Elements() {
		return (EReference)outPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternElement() {
		return patternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternElement_Id() {
		return (EAttribute)patternElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternElement_VarName() {
		return (EAttribute)patternElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternElement_Type() {
		return (EReference)patternElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternElement_InitExpression() {
		return (EReference)patternElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternElement_LetExp() {
		return (EReference)patternElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternElement_BaseExp() {
		return (EReference)patternElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternElement_VariableExp() {
		return (EReference)patternElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInPatternElement() {
		return inPatternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInPatternElement_MapsTo() {
		return (EReference)inPatternElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInPatternElement_InPattern() {
		return (EReference)inPatternElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInPatternElement_Models() {
		return (EReference)inPatternElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleInPatternElement() {
		return simpleInPatternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutPatternElement() {
		return outPatternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutPatternElement_OutPattern() {
		return (EReference)outPatternElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutPatternElement_SourceElement() {
		return (EReference)outPatternElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutPatternElement_Bindings() {
		return (EReference)outPatternElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutPatternElement_Model() {
		return (EReference)outPatternElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleOutPatternElement() {
		return simpleOutPatternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleOutPatternElement_ReverseBindings() {
		return (EReference)simpleOutPatternElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForEachOutPatternElement() {
		return forEachOutPatternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachOutPatternElement_Collection() {
		return (EReference)forEachOutPatternElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachOutPatternElement_Iterator() {
		return (EReference)forEachOutPatternElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Value() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_OutPatternElement() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_PropertyName() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_IsAssignment() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleVariableDeclaration() {
		return ruleVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleVariableDeclaration_Rule() {
		return (EReference)ruleVariableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleVariableDeclaration_Id() {
		return (EAttribute)ruleVariableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleVariableDeclaration_VarName() {
		return (EAttribute)ruleVariableDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleVariableDeclaration_Type() {
		return (EReference)ruleVariableDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleVariableDeclaration_InitExpression() {
		return (EReference)ruleVariableDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleVariableDeclaration_LetExp() {
		return (EReference)ruleVariableDeclarationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleVariableDeclaration_BaseExp() {
		return (EReference)ruleVariableDeclarationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleVariableDeclaration_VariableExp() {
		return (EReference)ruleVariableDeclarationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryRef() {
		return libraryRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryRef_Unit() {
		return (EReference)libraryRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryRef_Name() {
		return (EAttribute)libraryRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionBlock() {
		return actionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBlock_Rule() {
		return (EReference)actionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBlock_Statements() {
		return (EReference)actionBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionStat() {
		return expressionStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionStat_Expression() {
		return (EReference)expressionStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingStat() {
		return bindingStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingStat_Source() {
		return (EReference)bindingStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingStat_PropertyName() {
		return (EAttribute)bindingStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingStat_IsAssignment() {
		return (EAttribute)bindingStatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingStat_Value() {
		return (EReference)bindingStatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStat() {
		return ifStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStat_Condition() {
		return (EReference)ifStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStat_ThenStatements() {
		return (EReference)ifStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStat_ElseStatements() {
		return (EReference)ifStatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForStat() {
		return forStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStat_Iterator() {
		return (EReference)forStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStat_Collection() {
		return (EReference)forStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStat_Statements() {
		return (EReference)forStatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Unit() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLDummy() {
		return oclDummyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATLnoOCLFactory getATLnoOCLFactory() {
		return (ATLnoOCLFactory)getEFactoryInstance();
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
		locatedElementEClass = createEClass(LOCATED_ELEMENT);
		createEAttribute(locatedElementEClass, LOCATED_ELEMENT__LOCATION);
		createEAttribute(locatedElementEClass, LOCATED_ELEMENT__COMMENTS_BEFORE);
		createEAttribute(locatedElementEClass, LOCATED_ELEMENT__COMMENTS_AFTER);

		unitEClass = createEClass(UNIT);
		createEReference(unitEClass, UNIT__LIBRARIES);
		createEAttribute(unitEClass, UNIT__NAME);

		libraryEClass = createEClass(LIBRARY);
		createEReference(libraryEClass, LIBRARY__HELPERS);

		queryEClass = createEClass(QUERY);
		createEReference(queryEClass, QUERY__BODY);
		createEReference(queryEClass, QUERY__HELPERS);

		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__IS_REFINING);
		createEReference(moduleEClass, MODULE__IN_MODELS);
		createEReference(moduleEClass, MODULE__OUT_MODELS);
		createEReference(moduleEClass, MODULE__ELEMENTS);

		moduleElementEClass = createEClass(MODULE_ELEMENT);

		helperEClass = createEClass(HELPER);
		createEReference(helperEClass, HELPER__QUERY);
		createEReference(helperEClass, HELPER__LIBRARY);
		createEReference(helperEClass, HELPER__DEFINITION);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__OUT_PATTERN);
		createEReference(ruleEClass, RULE__ACTION_BLOCK);
		createEReference(ruleEClass, RULE__VARIABLES);
		createEAttribute(ruleEClass, RULE__NAME);

		matchedRuleEClass = createEClass(MATCHED_RULE);
		createEReference(matchedRuleEClass, MATCHED_RULE__IN_PATTERN);
		createEReference(matchedRuleEClass, MATCHED_RULE__CHILDREN);
		createEReference(matchedRuleEClass, MATCHED_RULE__SUPER_RULE);
		createEAttribute(matchedRuleEClass, MATCHED_RULE__IS_ABSTRACT);
		createEAttribute(matchedRuleEClass, MATCHED_RULE__IS_REFINING);
		createEAttribute(matchedRuleEClass, MATCHED_RULE__IS_NO_DEFAULT);

		lazyMatchedRuleEClass = createEClass(LAZY_MATCHED_RULE);
		createEAttribute(lazyMatchedRuleEClass, LAZY_MATCHED_RULE__IS_UNIQUE);

		calledRuleEClass = createEClass(CALLED_RULE);
		createEReference(calledRuleEClass, CALLED_RULE__PARAMETERS);
		createEAttribute(calledRuleEClass, CALLED_RULE__IS_ENTRYPOINT);
		createEAttribute(calledRuleEClass, CALLED_RULE__IS_ENDPOINT);

		inPatternEClass = createEClass(IN_PATTERN);
		createEReference(inPatternEClass, IN_PATTERN__ELEMENTS);
		createEReference(inPatternEClass, IN_PATTERN__RULE);
		createEReference(inPatternEClass, IN_PATTERN__FILTER);

		outPatternEClass = createEClass(OUT_PATTERN);
		createEReference(outPatternEClass, OUT_PATTERN__RULE);
		createEReference(outPatternEClass, OUT_PATTERN__ELEMENTS);

		patternElementEClass = createEClass(PATTERN_ELEMENT);
		createEAttribute(patternElementEClass, PATTERN_ELEMENT__ID);
		createEAttribute(patternElementEClass, PATTERN_ELEMENT__VAR_NAME);
		createEReference(patternElementEClass, PATTERN_ELEMENT__TYPE);
		createEReference(patternElementEClass, PATTERN_ELEMENT__INIT_EXPRESSION);
		createEReference(patternElementEClass, PATTERN_ELEMENT__LET_EXP);
		createEReference(patternElementEClass, PATTERN_ELEMENT__BASE_EXP);
		createEReference(patternElementEClass, PATTERN_ELEMENT__VARIABLE_EXP);

		inPatternElementEClass = createEClass(IN_PATTERN_ELEMENT);
		createEReference(inPatternElementEClass, IN_PATTERN_ELEMENT__MAPS_TO);
		createEReference(inPatternElementEClass, IN_PATTERN_ELEMENT__IN_PATTERN);
		createEReference(inPatternElementEClass, IN_PATTERN_ELEMENT__MODELS);

		simpleInPatternElementEClass = createEClass(SIMPLE_IN_PATTERN_ELEMENT);

		outPatternElementEClass = createEClass(OUT_PATTERN_ELEMENT);
		createEReference(outPatternElementEClass, OUT_PATTERN_ELEMENT__OUT_PATTERN);
		createEReference(outPatternElementEClass, OUT_PATTERN_ELEMENT__SOURCE_ELEMENT);
		createEReference(outPatternElementEClass, OUT_PATTERN_ELEMENT__BINDINGS);
		createEReference(outPatternElementEClass, OUT_PATTERN_ELEMENT__MODEL);

		simpleOutPatternElementEClass = createEClass(SIMPLE_OUT_PATTERN_ELEMENT);
		createEReference(simpleOutPatternElementEClass, SIMPLE_OUT_PATTERN_ELEMENT__REVERSE_BINDINGS);

		forEachOutPatternElementEClass = createEClass(FOR_EACH_OUT_PATTERN_ELEMENT);
		createEReference(forEachOutPatternElementEClass, FOR_EACH_OUT_PATTERN_ELEMENT__COLLECTION);
		createEReference(forEachOutPatternElementEClass, FOR_EACH_OUT_PATTERN_ELEMENT__ITERATOR);

		bindingEClass = createEClass(BINDING);
		createEReference(bindingEClass, BINDING__VALUE);
		createEReference(bindingEClass, BINDING__OUT_PATTERN_ELEMENT);
		createEAttribute(bindingEClass, BINDING__PROPERTY_NAME);
		createEAttribute(bindingEClass, BINDING__IS_ASSIGNMENT);

		ruleVariableDeclarationEClass = createEClass(RULE_VARIABLE_DECLARATION);
		createEReference(ruleVariableDeclarationEClass, RULE_VARIABLE_DECLARATION__RULE);
		createEAttribute(ruleVariableDeclarationEClass, RULE_VARIABLE_DECLARATION__ID);
		createEAttribute(ruleVariableDeclarationEClass, RULE_VARIABLE_DECLARATION__VAR_NAME);
		createEReference(ruleVariableDeclarationEClass, RULE_VARIABLE_DECLARATION__TYPE);
		createEReference(ruleVariableDeclarationEClass, RULE_VARIABLE_DECLARATION__INIT_EXPRESSION);
		createEReference(ruleVariableDeclarationEClass, RULE_VARIABLE_DECLARATION__LET_EXP);
		createEReference(ruleVariableDeclarationEClass, RULE_VARIABLE_DECLARATION__BASE_EXP);
		createEReference(ruleVariableDeclarationEClass, RULE_VARIABLE_DECLARATION__VARIABLE_EXP);

		libraryRefEClass = createEClass(LIBRARY_REF);
		createEReference(libraryRefEClass, LIBRARY_REF__UNIT);
		createEAttribute(libraryRefEClass, LIBRARY_REF__NAME);

		actionBlockEClass = createEClass(ACTION_BLOCK);
		createEReference(actionBlockEClass, ACTION_BLOCK__RULE);
		createEReference(actionBlockEClass, ACTION_BLOCK__STATEMENTS);

		statementEClass = createEClass(STATEMENT);

		expressionStatEClass = createEClass(EXPRESSION_STAT);
		createEReference(expressionStatEClass, EXPRESSION_STAT__EXPRESSION);

		bindingStatEClass = createEClass(BINDING_STAT);
		createEReference(bindingStatEClass, BINDING_STAT__SOURCE);
		createEAttribute(bindingStatEClass, BINDING_STAT__PROPERTY_NAME);
		createEAttribute(bindingStatEClass, BINDING_STAT__IS_ASSIGNMENT);
		createEReference(bindingStatEClass, BINDING_STAT__VALUE);

		ifStatEClass = createEClass(IF_STAT);
		createEReference(ifStatEClass, IF_STAT__CONDITION);
		createEReference(ifStatEClass, IF_STAT__THEN_STATEMENTS);
		createEReference(ifStatEClass, IF_STAT__ELSE_STATEMENTS);

		forStatEClass = createEClass(FOR_STAT);
		createEReference(forStatEClass, FOR_STAT__ITERATOR);
		createEReference(forStatEClass, FOR_STAT__COLLECTION);
		createEReference(forStatEClass, FOR_STAT__STATEMENTS);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__UNIT);

		oclDummyEClass = createEClass(OCL_DUMMY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unitEClass.getESuperTypes().add(this.getLocatedElement());
		libraryEClass.getESuperTypes().add(this.getUnit());
		queryEClass.getESuperTypes().add(this.getUnit());
		moduleEClass.getESuperTypes().add(this.getUnit());
		moduleElementEClass.getESuperTypes().add(this.getLocatedElement());
		helperEClass.getESuperTypes().add(this.getModuleElement());
		ruleEClass.getESuperTypes().add(this.getModuleElement());
		matchedRuleEClass.getESuperTypes().add(this.getRule());
		lazyMatchedRuleEClass.getESuperTypes().add(this.getMatchedRule());
		calledRuleEClass.getESuperTypes().add(this.getRule());
		inPatternEClass.getESuperTypes().add(this.getLocatedElement());
		outPatternEClass.getESuperTypes().add(this.getLocatedElement());
		patternElementEClass.getESuperTypes().add(this.getLocatedElement());
		inPatternElementEClass.getESuperTypes().add(this.getPatternElement());
		simpleInPatternElementEClass.getESuperTypes().add(this.getInPatternElement());
		outPatternElementEClass.getESuperTypes().add(this.getPatternElement());
		simpleOutPatternElementEClass.getESuperTypes().add(this.getOutPatternElement());
		forEachOutPatternElementEClass.getESuperTypes().add(this.getOutPatternElement());
		bindingEClass.getESuperTypes().add(this.getLocatedElement());
		ruleVariableDeclarationEClass.getESuperTypes().add(this.getLocatedElement());
		libraryRefEClass.getESuperTypes().add(this.getLocatedElement());
		actionBlockEClass.getESuperTypes().add(this.getLocatedElement());
		statementEClass.getESuperTypes().add(this.getLocatedElement());
		expressionStatEClass.getESuperTypes().add(this.getStatement());
		bindingStatEClass.getESuperTypes().add(this.getStatement());
		ifStatEClass.getESuperTypes().add(this.getStatement());
		forStatEClass.getESuperTypes().add(this.getStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(locatedElementEClass, LocatedElement.class, "LocatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocatedElement_Location(), ecorePackage.getEString(), "location", null, 0, 1, LocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocatedElement_CommentsBefore(), ecorePackage.getEString(), "commentsBefore", null, 0, -1, LocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocatedElement_CommentsAfter(), ecorePackage.getEString(), "commentsAfter", null, 0, -1, LocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnit_Libraries(), this.getLibraryRef(), this.getLibraryRef_Unit(), "libraries", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnit_Name(), ecorePackage.getEString(), "name", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrary_Helpers(), this.getHelper(), this.getHelper_Library(), "helpers", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuery_Body(), this.getOCLDummy(), null, "body", null, 1, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQuery_Helpers(), this.getHelper(), this.getHelper_Query(), "helpers", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, ATLnoOCL.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModule_IsRefining(), ecorePackage.getEBoolean(), "isRefining", null, 1, 1, ATLnoOCL.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModule_InModels(), this.getOCLDummy(), null, "inModels", null, 1, -1, ATLnoOCL.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_OutModels(), this.getOCLDummy(), null, "outModels", null, 1, -1, ATLnoOCL.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModule_Elements(), this.getModuleElement(), null, "elements", null, 0, -1, ATLnoOCL.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleElementEClass, ModuleElement.class, "ModuleElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(helperEClass, Helper.class, "Helper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHelper_Query(), this.getQuery(), this.getQuery_Helpers(), "query", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHelper_Library(), this.getLibrary(), this.getLibrary_Helpers(), "library", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHelper_Definition(), this.getOCLDummy(), null, "definition", null, 1, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_OutPattern(), this.getOutPattern(), this.getOutPattern_Rule(), "outPattern", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_ActionBlock(), this.getActionBlock(), this.getActionBlock_Rule(), "actionBlock", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_Variables(), this.getRuleVariableDeclaration(), this.getRuleVariableDeclaration_Rule(), "variables", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(matchedRuleEClass, MatchedRule.class, "MatchedRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchedRule_InPattern(), this.getInPattern(), this.getInPattern_Rule(), "inPattern", null, 0, 1, MatchedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMatchedRule_Children(), this.getMatchedRule(), this.getMatchedRule_SuperRule(), "children", null, 0, -1, MatchedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMatchedRule_SuperRule(), this.getMatchedRule(), this.getMatchedRule_Children(), "superRule", null, 0, 1, MatchedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMatchedRule_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 1, 1, MatchedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMatchedRule_IsRefining(), ecorePackage.getEBoolean(), "isRefining", null, 1, 1, MatchedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMatchedRule_IsNoDefault(), ecorePackage.getEBoolean(), "isNoDefault", null, 1, 1, MatchedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lazyMatchedRuleEClass, LazyMatchedRule.class, "LazyMatchedRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLazyMatchedRule_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 1, 1, LazyMatchedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(calledRuleEClass, CalledRule.class, "CalledRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalledRule_Parameters(), this.getOCLDummy(), null, "parameters", null, 0, -1, CalledRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCalledRule_IsEntrypoint(), ecorePackage.getEBoolean(), "isEntrypoint", null, 1, 1, CalledRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCalledRule_IsEndpoint(), ecorePackage.getEBoolean(), "isEndpoint", null, 1, 1, CalledRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inPatternEClass, InPattern.class, "InPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInPattern_Elements(), this.getInPatternElement(), this.getInPatternElement_InPattern(), "elements", null, 1, -1, InPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInPattern_Rule(), this.getMatchedRule(), this.getMatchedRule_InPattern(), "rule", null, 1, 1, InPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInPattern_Filter(), this.getOCLDummy(), null, "filter", null, 0, 1, InPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(outPatternEClass, OutPattern.class, "OutPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutPattern_Rule(), this.getRule(), this.getRule_OutPattern(), "rule", null, 1, 1, OutPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutPattern_Elements(), this.getOutPatternElement(), this.getOutPatternElement_OutPattern(), "elements", null, 1, -1, OutPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternElementEClass, PatternElement.class, "PatternElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternElement_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternElement_Type(), this.getOCLDummy(), null, "type", null, 0, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternElement_InitExpression(), this.getOCLDummy(), null, "initExpression", null, 0, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternElement_LetExp(), this.getOCLDummy(), null, "letExp", null, 0, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternElement_BaseExp(), this.getOCLDummy(), null, "baseExp", null, 0, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternElement_VariableExp(), this.getOCLDummy(), null, "variableExp", null, 0, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inPatternElementEClass, InPatternElement.class, "InPatternElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInPatternElement_MapsTo(), this.getOutPatternElement(), this.getOutPatternElement_SourceElement(), "mapsTo", null, 1, 1, InPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInPatternElement_InPattern(), this.getInPattern(), this.getInPattern_Elements(), "inPattern", null, 1, 1, InPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInPatternElement_Models(), this.getOCLDummy(), null, "models", null, 0, -1, InPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(simpleInPatternElementEClass, SimpleInPatternElement.class, "SimpleInPatternElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outPatternElementEClass, OutPatternElement.class, "OutPatternElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutPatternElement_OutPattern(), this.getOutPattern(), this.getOutPattern_Elements(), "outPattern", null, 1, 1, OutPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutPatternElement_SourceElement(), this.getInPatternElement(), this.getInPatternElement_MapsTo(), "sourceElement", null, 0, 1, OutPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutPatternElement_Bindings(), this.getBinding(), this.getBinding_OutPatternElement(), "bindings", null, 0, -1, OutPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutPatternElement_Model(), this.getOCLDummy(), null, "model", null, 0, 1, OutPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(simpleOutPatternElementEClass, SimpleOutPatternElement.class, "SimpleOutPatternElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleOutPatternElement_ReverseBindings(), this.getOCLDummy(), null, "reverseBindings", null, 0, -1, SimpleOutPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEachOutPatternElementEClass, ForEachOutPatternElement.class, "ForEachOutPatternElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForEachOutPatternElement_Collection(), this.getOCLDummy(), null, "collection", null, 1, 1, ForEachOutPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getForEachOutPatternElement_Iterator(), this.getOCLDummy(), null, "iterator", null, 1, 1, ForEachOutPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_Value(), this.getOCLDummy(), null, "value", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBinding_OutPatternElement(), this.getOutPatternElement(), this.getOutPatternElement_Bindings(), "outPatternElement", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBinding_PropertyName(), ecorePackage.getEString(), "propertyName", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBinding_IsAssignment(), ecorePackage.getEBoolean(), "isAssignment", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ruleVariableDeclarationEClass, RuleVariableDeclaration.class, "RuleVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleVariableDeclaration_Rule(), this.getRule(), this.getRule_Variables(), "rule", null, 1, 1, RuleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRuleVariableDeclaration_Id(), ecorePackage.getEString(), "id", null, 0, 1, RuleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleVariableDeclaration_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, RuleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleVariableDeclaration_Type(), this.getOCLDummy(), null, "type", null, 0, 1, RuleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleVariableDeclaration_InitExpression(), this.getOCLDummy(), null, "initExpression", null, 0, 1, RuleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleVariableDeclaration_LetExp(), this.getOCLDummy(), null, "letExp", null, 0, 1, RuleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleVariableDeclaration_BaseExp(), this.getOCLDummy(), null, "baseExp", null, 0, 1, RuleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleVariableDeclaration_VariableExp(), this.getOCLDummy(), null, "variableExp", null, 0, -1, RuleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryRefEClass, LibraryRef.class, "LibraryRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibraryRef_Unit(), this.getUnit(), this.getUnit_Libraries(), "unit", null, 1, 1, LibraryRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLibraryRef_Name(), ecorePackage.getEString(), "name", null, 1, 1, LibraryRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionBlockEClass, ActionBlock.class, "ActionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionBlock_Rule(), this.getRule(), this.getRule_ActionBlock(), "rule", null, 1, 1, ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActionBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1, ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionStatEClass, ExpressionStat.class, "ExpressionStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionStat_Expression(), this.getOCLDummy(), null, "expression", null, 1, 1, ExpressionStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bindingStatEClass, BindingStat.class, "BindingStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingStat_Source(), this.getOCLDummy(), null, "source", null, 1, 1, BindingStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBindingStat_PropertyName(), ecorePackage.getEString(), "propertyName", null, 1, 1, BindingStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBindingStat_IsAssignment(), ecorePackage.getEBoolean(), "isAssignment", null, 1, 1, BindingStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBindingStat_Value(), this.getOCLDummy(), null, "value", null, 1, 1, BindingStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ifStatEClass, IfStat.class, "IfStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStat_Condition(), this.getOCLDummy(), null, "condition", null, 1, 1, IfStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIfStat_ThenStatements(), this.getStatement(), null, "thenStatements", null, 0, -1, IfStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStat_ElseStatements(), this.getStatement(), null, "elseStatements", null, 0, -1, IfStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forStatEClass, ForStat.class, "ForStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForStat_Iterator(), this.getOCLDummy(), null, "iterator", null, 1, 1, ForStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getForStat_Collection(), this.getOCLDummy(), null, "collection", null, 1, 1, ForStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getForStat_Statements(), this.getStatement(), null, "statements", null, 0, -1, ForStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Unit(), this.getUnit(), null, "unit", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclDummyEClass, OCLDummy.class, "OCLDummy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ATLnoOCLPackageImpl
