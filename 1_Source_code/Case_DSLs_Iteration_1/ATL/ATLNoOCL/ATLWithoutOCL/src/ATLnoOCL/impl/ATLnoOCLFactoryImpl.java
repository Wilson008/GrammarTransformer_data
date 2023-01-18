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
import ATLnoOCL.LazyMatchedRule;
import ATLnoOCL.Library;
import ATLnoOCL.LibraryRef;
import ATLnoOCL.MatchedRule;
import ATLnoOCL.OCLDummy;
import ATLnoOCL.OutPattern;
import ATLnoOCL.Query;
import ATLnoOCL.Root;
import ATLnoOCL.RuleVariableDeclaration;
import ATLnoOCL.SimpleInPatternElement;
import ATLnoOCL.SimpleOutPatternElement;

import org.eclipse.emf.ecore.EClass;
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
public class ATLnoOCLFactoryImpl extends EFactoryImpl implements ATLnoOCLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ATLnoOCLFactory init() {
		try {
			ATLnoOCLFactory theATLnoOCLFactory = (ATLnoOCLFactory)EPackage.Registry.INSTANCE.getEFactory(ATLnoOCLPackage.eNS_URI);
			if (theATLnoOCLFactory != null) {
				return theATLnoOCLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ATLnoOCLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATLnoOCLFactoryImpl() {
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
			case ATLnoOCLPackage.LIBRARY: return createLibrary();
			case ATLnoOCLPackage.QUERY: return createQuery();
			case ATLnoOCLPackage.MODULE: return createModule();
			case ATLnoOCLPackage.HELPER: return createHelper();
			case ATLnoOCLPackage.MATCHED_RULE: return createMatchedRule();
			case ATLnoOCLPackage.LAZY_MATCHED_RULE: return createLazyMatchedRule();
			case ATLnoOCLPackage.CALLED_RULE: return createCalledRule();
			case ATLnoOCLPackage.IN_PATTERN: return createInPattern();
			case ATLnoOCLPackage.OUT_PATTERN: return createOutPattern();
			case ATLnoOCLPackage.SIMPLE_IN_PATTERN_ELEMENT: return createSimpleInPatternElement();
			case ATLnoOCLPackage.SIMPLE_OUT_PATTERN_ELEMENT: return createSimpleOutPatternElement();
			case ATLnoOCLPackage.FOR_EACH_OUT_PATTERN_ELEMENT: return createForEachOutPatternElement();
			case ATLnoOCLPackage.BINDING: return createBinding();
			case ATLnoOCLPackage.RULE_VARIABLE_DECLARATION: return createRuleVariableDeclaration();
			case ATLnoOCLPackage.LIBRARY_REF: return createLibraryRef();
			case ATLnoOCLPackage.ACTION_BLOCK: return createActionBlock();
			case ATLnoOCLPackage.EXPRESSION_STAT: return createExpressionStat();
			case ATLnoOCLPackage.BINDING_STAT: return createBindingStat();
			case ATLnoOCLPackage.IF_STAT: return createIfStat();
			case ATLnoOCLPackage.FOR_STAT: return createForStat();
			case ATLnoOCLPackage.ROOT: return createRoot();
			case ATLnoOCLPackage.OCL_DUMMY: return createOCLDummy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATLnoOCL.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
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
	public MatchedRule createMatchedRule() {
		MatchedRuleImpl matchedRule = new MatchedRuleImpl();
		return matchedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyMatchedRule createLazyMatchedRule() {
		LazyMatchedRuleImpl lazyMatchedRule = new LazyMatchedRuleImpl();
		return lazyMatchedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledRule createCalledRule() {
		CalledRuleImpl calledRule = new CalledRuleImpl();
		return calledRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPattern createInPattern() {
		InPatternImpl inPattern = new InPatternImpl();
		return inPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPattern createOutPattern() {
		OutPatternImpl outPattern = new OutPatternImpl();
		return outPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleInPatternElement createSimpleInPatternElement() {
		SimpleInPatternElementImpl simpleInPatternElement = new SimpleInPatternElementImpl();
		return simpleInPatternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleOutPatternElement createSimpleOutPatternElement() {
		SimpleOutPatternElementImpl simpleOutPatternElement = new SimpleOutPatternElementImpl();
		return simpleOutPatternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEachOutPatternElement createForEachOutPatternElement() {
		ForEachOutPatternElementImpl forEachOutPatternElement = new ForEachOutPatternElementImpl();
		return forEachOutPatternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleVariableDeclaration createRuleVariableDeclaration() {
		RuleVariableDeclarationImpl ruleVariableDeclaration = new RuleVariableDeclarationImpl();
		return ruleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRef createLibraryRef() {
		LibraryRefImpl libraryRef = new LibraryRefImpl();
		return libraryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBlock createActionBlock() {
		ActionBlockImpl actionBlock = new ActionBlockImpl();
		return actionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStat createExpressionStat() {
		ExpressionStatImpl expressionStat = new ExpressionStatImpl();
		return expressionStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStat createBindingStat() {
		BindingStatImpl bindingStat = new BindingStatImpl();
		return bindingStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStat createIfStat() {
		IfStatImpl ifStat = new IfStatImpl();
		return ifStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForStat createForStat() {
		ForStatImpl forStat = new ForStatImpl();
		return forStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy createOCLDummy() {
		OCLDummyImpl oclDummy = new OCLDummyImpl();
		return oclDummy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATLnoOCLPackage getATLnoOCLPackage() {
		return (ATLnoOCLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ATLnoOCLPackage getPackage() {
		return ATLnoOCLPackage.eINSTANCE;
	}

} //ATLnoOCLFactoryImpl
