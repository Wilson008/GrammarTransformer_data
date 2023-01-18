/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.util;

import org.bumble.xtext.grammaroptimizer.optimizationrule.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage
 * @generated
 */
public class OptimizationruleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OptimizationrulePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationruleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OptimizationrulePackage.eINSTANCE;
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
	protected OptimizationruleSwitch<Adapter> modelSwitch =
		new OptimizationruleSwitch<Adapter>() {
			@Override
			public Adapter caseOptimizationRule(OptimizationRule object) {
				return createOptimizationRuleAdapter();
			}
			@Override
			public Adapter caseRemoveBracket(RemoveBracket object) {
				return createRemoveBracketAdapter();
			}
			@Override
			public Adapter caseAddKeywordToAttr(AddKeywordToAttr object) {
				return createAddKeywordToAttrAdapter();
			}
			@Override
			public Adapter caseAddKeywordToRule(AddKeywordToRule object) {
				return createAddKeywordToRuleAdapter();
			}
			@Override
			public Adapter caseRemoveKeyword(RemoveKeyword object) {
				return createRemoveKeywordAdapter();
			}
			@Override
			public Adapter caseRenameKeyword(RenameKeyword object) {
				return createRenameKeywordAdapter();
			}
			@Override
			public Adapter caseConvert1toStarToStar(Convert1toStarToStar object) {
				return createConvert1toStarToStarAdapter();
			}
			@Override
			public Adapter caseConvert1toStarToPlus(Convert1toStarToPlus object) {
				return createConvert1toStarToPlusAdapter();
			}
			@Override
			public Adapter caseChangeOptionalAttrToOrRelation(ChangeOptionalAttrToOrRelation object) {
				return createChangeOptionalAttrToOrRelationAdapter();
			}
			@Override
			public Adapter caseRemoveXStarAttrKeyword(RemoveXStarAttrKeyword object) {
				return createRemoveXStarAttrKeywordAdapter();
			}
			@Override
			public Adapter caseRemoveComma(RemoveComma object) {
				return createRemoveCommaAdapter();
			}
			@Override
			public Adapter caseMoveLine(MoveLine object) {
				return createMoveLineAdapter();
			}
			@Override
			public Adapter caseRemoveRule(RemoveRule object) {
				return createRemoveRuleAdapter();
			}
			@Override
			public Adapter caseConvert1ToStarTo1(Convert1ToStarTo1 object) {
				return createConvert1ToStarTo1Adapter();
			}
			@Override
			public Adapter caseRemoveRuleCall(RemoveRuleCall object) {
				return createRemoveRuleCallAdapter();
			}
			@Override
			public Adapter caseAddKeywordAfterKeyword(AddKeywordAfterKeyword object) {
				return createAddKeywordAfterKeywordAdapter();
			}
			@Override
			public Adapter caseChangeTypeOfAttr(ChangeTypeOfAttr object) {
				return createChangeTypeOfAttrAdapter();
			}
			@Override
			public Adapter caseAddParenthesesToAttr(AddParenthesesToAttr object) {
				return createAddParenthesesToAttrAdapter();
			}
			@Override
			public Adapter caseRemoveParenthesesInSpecifiedAttr(RemoveParenthesesInSpecifiedAttr object) {
				return createRemoveParenthesesInSpecifiedAttrAdapter();
			}
			@Override
			public Adapter caseAddImport(AddImport object) {
				return createAddImportAdapter();
			}
			@Override
			public Adapter caseRemoveAttribute(RemoveAttribute object) {
				return createRemoveAttributeAdapter();
			}
			@Override
			public Adapter caseChangeAttrLineContent(ChangeAttrLineContent object) {
				return createChangeAttrLineContentAdapter();
			}
			@Override
			public Adapter caseRenameRule(RenameRule object) {
				return createRenameRuleAdapter();
			}
			@Override
			public Adapter caseRemoveKeywordsOfAllAttrs(RemoveKeywordsOfAllAttrs object) {
				return createRemoveKeywordsOfAllAttrsAdapter();
			}
			@Override
			public Adapter caseRemoveOptionality(RemoveOptionality object) {
				return createRemoveOptionalityAdapter();
			}
			@Override
			public Adapter caseChangeBracketToParentheses(ChangeBracketToParentheses object) {
				return createChangeBracketToParenthesesAdapter();
			}
			@Override
			public Adapter caseChangeBracketToSquare(ChangeBracketToSquare object) {
				return createChangeBracketToSquareAdapter();
			}
			@Override
			public Adapter caseChangeBracketToAngle(ChangeBracketToAngle object) {
				return createChangeBracketToAngleAdapter();
			}
			@Override
			public Adapter caseRemoveOutermostBracket(RemoveOutermostBracket object) {
				return createRemoveOutermostBracketAdapter();
			}
			@Override
			public Adapter caseConvert1toStarTo1orStar(Convert1toStarTo1orStar object) {
				return createConvert1toStarTo1orStarAdapter();
			}
			@Override
			public Adapter caseRemoveBracketExceptOutermost(RemoveBracketExceptOutermost object) {
				return createRemoveBracketExceptOutermostAdapter();
			}
			@Override
			public Adapter caseRemoveCertainTypeFromAttr(RemoveCertainTypeFromAttr object) {
				return createRemoveCertainTypeFromAttrAdapter();
			}
			@Override
			public Adapter caseChangeRuleContent(ChangeRuleContent object) {
				return createChangeRuleContentAdapter();
			}
			@Override
			public Adapter caseChangeCalledRule(ChangeCalledRule object) {
				return createChangeCalledRuleAdapter();
			}
			@Override
			public Adapter caseChangeCommaToOtherSymbol(ChangeCommaToOtherSymbol object) {
				return createChangeCommaToOtherSymbolAdapter();
			}
			@Override
			public Adapter caseMoveAttrToAfterRuleKeyword(MoveAttrToAfterRuleKeyword object) {
				return createMoveAttrToAfterRuleKeywordAdapter();
			}
			@Override
			public Adapter caseAddStringToRuleKeyword(AddStringToRuleKeyword object) {
				return createAddStringToRuleKeywordAdapter();
			}
			@Override
			public Adapter caseAddOptionalityToAttr(AddOptionalityToAttr object) {
				return createAddOptionalityToAttrAdapter();
			}
			@Override
			public Adapter caseRemoveImport(RemoveImport object) {
				return createRemoveImportAdapter();
			}
			@Override
			public Adapter caseAddAlternativeKeyword(AddAlternativeKeyword object) {
				return createAddAlternativeKeywordAdapter();
			}
			@Override
			public Adapter caseAddOptionalityToKeyword(AddOptionalityToKeyword object) {
				return createAddOptionalityToKeywordAdapter();
			}
			@Override
			public Adapter caseAddBracketToAttr(AddBracketToAttr object) {
				return createAddBracketToAttrAdapter();
			}
			@Override
			public Adapter caseKeywordUpperToLowerCase(KeywordUpperToLowerCase object) {
				return createKeywordUpperToLowerCaseAdapter();
			}
			@Override
			public Adapter caseKeywordLowerToUpperCase(KeywordLowerToUpperCase object) {
				return createKeywordLowerToUpperCaseAdapter();
			}
			@Override
			public Adapter caseAddSquareBracketToAttr(AddSquareBracketToAttr object) {
				return createAddSquareBracketToAttrAdapter();
			}
			@Override
			public Adapter caseAddOptionalityToOutermostBracket(AddOptionalityToOutermostBracket object) {
				return createAddOptionalityToOutermostBracketAdapter();
			}
			@Override
			public Adapter caseChangeOutermostBracketToParenthesis(ChangeOutermostBracketToParenthesis object) {
				return createChangeOutermostBracketToParenthesisAdapter();
			}
			@Override
			public Adapter caseAddSymbolToAttr(AddSymbolToAttr object) {
				return createAddSymbolToAttrAdapter();
			}
			@Override
			public Adapter caseAddPrimitiveType(AddPrimitiveType object) {
				return createAddPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAddSymbolToRule(AddSymbolToRule object) {
				return createAddSymbolToRuleAdapter();
			}
			@Override
			public Adapter caseAddKeywordToLine(AddKeywordToLine object) {
				return createAddKeywordToLineAdapter();
			}
			@Override
			public Adapter caseAddParenthesesWithoutQuotes(AddParenthesesWithoutQuotes object) {
				return createAddParenthesesWithoutQuotesAdapter();
			}
			@Override
			public Adapter caseAddOptionalityToSymbol(AddOptionalityToSymbol object) {
				return createAddOptionalityToSymbolAdapter();
			}
			@Override
			public Adapter caseAddSymbolToLine(AddSymbolToLine object) {
				return createAddSymbolToLineAdapter();
			}
			@Override
			public Adapter caseAddSymbolWithoutQuoteToLine(AddSymbolWithoutQuoteToLine object) {
				return createAddSymbolWithoutQuoteToLineAdapter();
			}
			@Override
			public Adapter caseChangeABtoBAB(ChangeABtoBAB object) {
				return createChangeABtoBABAdapter();
			}
			@Override
			public Adapter caseCopyAttrAToAttrB(CopyAttrAToAttrB object) {
				return createCopyAttrAToAttrBAdapter();
			}
			@Override
			public Adapter caseCopyXfromStarToY(CopyXfromStarToY object) {
				return createCopyXfromStarToYAdapter();
			}
			@Override
			public Adapter caseConvert1toStarToTwo(Convert1toStarToTwo object) {
				return createConvert1toStarToTwoAdapter();
			}
			@Override
			public Adapter caseChangeAToOptionalAorA(ChangeAToOptionalAorA object) {
				return createChangeAToOptionalAorAAdapter();
			}
			@Override
			public Adapter caseAddTerminalRule(AddTerminalRule object) {
				return createAddTerminalRuleAdapter();
			}
			@Override
			public Adapter caseAddOptionalityToLine(AddOptionalityToLine object) {
				return createAddOptionalityToLineAdapter();
			}
			@Override
			public Adapter caseAddBracketToLine(AddBracketToLine object) {
				return createAddBracketToLineAdapter();
			}
			@Override
			public Adapter caseAddParenthesesWithoutQuoteToRule(AddParenthesesWithoutQuoteToRule object) {
				return createAddParenthesesWithoutQuoteToRuleAdapter();
			}
			@Override
			public Adapter caseAddAlternativeSymbol(AddAlternativeSymbol object) {
				return createAddAlternativeSymbolAdapter();
			}
			@Override
			public Adapter caseChangeABToABorBA(ChangeABToABorBA object) {
				return createChangeABToABorBAAdapter();
			}
			@Override
			public Adapter caseAddSymbolWithoutQuoteToKeyword(AddSymbolWithoutQuoteToKeyword object) {
				return createAddSymbolWithoutQuoteToKeywordAdapter();
			}
			@Override
			public Adapter casePackageAttributes(PackageAttributes object) {
				return createPackageAttributesAdapter();
			}
			@Override
			public Adapter caseChangeBooleanAttrToSpecialPatten(ChangeBooleanAttrToSpecialPatten object) {
				return createChangeBooleanAttrToSpecialPattenAdapter();
			}
			@Override
			public Adapter caseChangeAToASemiOrAWithBracket(ChangeAToASemiOrAWithBracket object) {
				return createChangeAToASemiOrAWithBracketAdapter();
			}
			@Override
			public Adapter caseChangeReturns(ChangeReturns object) {
				return createChangeReturnsAdapter();
			}
			@Override
			public Adapter caseAddAlternativeValue(AddAlternativeValue object) {
				return createAddAlternativeValueAdapter();
			}
			@Override
			public Adapter caseChangeAToAorSymbol(ChangeAToAorSymbol object) {
				return createChangeAToAorSymbolAdapter();
			}
			@Override
			public Adapter caseAddAlternativeSubClassToAbstractClass(AddAlternativeSubClassToAbstractClass object) {
				return createAddAlternativeSubClassToAbstractClassAdapter();
			}
			@Override
			public Adapter caseAddBracketToRule(AddBracketToRule object) {
				return createAddBracketToRuleAdapter();
			}
			@Override
			public Adapter caseRemoveLiteralFromEnum(RemoveLiteralFromEnum object) {
				return createRemoveLiteralFromEnumAdapter();
			}
			@Override
			public Adapter caseConvert0toStarTo0toStaror1toStar(Convert0toStarTo0toStaror1toStar object) {
				return createConvert0toStarTo0toStaror1toStarAdapter();
			}
			@Override
			public Adapter caseRemoveAction(RemoveAction object) {
				return createRemoveActionAdapter();
			}
			@Override
			public Adapter caseAddCallToOtherRule(AddCallToOtherRule object) {
				return createAddCallToOtherRuleAdapter();
			}
			@Override
			public Adapter caseSetAstProperty(SetAstProperty object) {
				return createSetAstPropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule <em>Optimization Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule
	 * @generated
	 */
	public Adapter createOptimizationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracket <em>Remove Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracket
	 * @generated
	 */
	public Adapter createRemoveBracketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr <em>Add Keyword To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr
	 * @generated
	 */
	public Adapter createAddKeywordToAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToRule <em>Add Keyword To Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToRule
	 * @generated
	 */
	public Adapter createAddKeywordToRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword <em>Remove Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword
	 * @generated
	 */
	public Adapter createRemoveKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword <em>Rename Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword
	 * @generated
	 */
	public Adapter createRenameKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToStar <em>Convert1to Star To Star</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToStar
	 * @generated
	 */
	public Adapter createConvert1toStarToStarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToPlus <em>Convert1to Star To Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToPlus
	 * @generated
	 */
	public Adapter createConvert1toStarToPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation <em>Change Optional Attr To Or Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation
	 * @generated
	 */
	public Adapter createChangeOptionalAttrToOrRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveXStarAttrKeyword <em>Remove XStar Attr Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveXStarAttrKeyword
	 * @generated
	 */
	public Adapter createRemoveXStarAttrKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveComma <em>Remove Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveComma
	 * @generated
	 */
	public Adapter createRemoveCommaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine <em>Move Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine
	 * @generated
	 */
	public Adapter createMoveLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRule <em>Remove Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRule
	 * @generated
	 */
	public Adapter createRemoveRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1ToStarTo1 <em>Convert1 To Star To1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1ToStarTo1
	 * @generated
	 */
	public Adapter createConvert1ToStarTo1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRuleCall <em>Remove Rule Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRuleCall
	 * @generated
	 */
	public Adapter createRemoveRuleCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordAfterKeyword <em>Add Keyword After Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordAfterKeyword
	 * @generated
	 */
	public Adapter createAddKeywordAfterKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr <em>Change Type Of Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr
	 * @generated
	 */
	public Adapter createChangeTypeOfAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesToAttr <em>Add Parentheses To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesToAttr
	 * @generated
	 */
	public Adapter createAddParenthesesToAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveParenthesesInSpecifiedAttr <em>Remove Parentheses In Specified Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveParenthesesInSpecifiedAttr
	 * @generated
	 */
	public Adapter createRemoveParenthesesInSpecifiedAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport <em>Add Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport
	 * @generated
	 */
	public Adapter createAddImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttribute <em>Remove Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttribute
	 * @generated
	 */
	public Adapter createRemoveAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttrLineContent <em>Change Attr Line Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttrLineContent
	 * @generated
	 */
	public Adapter createChangeAttrLineContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameRule <em>Rename Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RenameRule
	 * @generated
	 */
	public Adapter createRenameRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeywordsOfAllAttrs <em>Remove Keywords Of All Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeywordsOfAllAttrs
	 * @generated
	 */
	public Adapter createRemoveKeywordsOfAllAttrsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOptionality <em>Remove Optionality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOptionality
	 * @generated
	 */
	public Adapter createRemoveOptionalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracketToParentheses <em>Change Bracket To Parentheses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracketToParentheses
	 * @generated
	 */
	public Adapter createChangeBracketToParenthesesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracketToSquare <em>Change Bracket To Square</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracketToSquare
	 * @generated
	 */
	public Adapter createChangeBracketToSquareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracketToAngle <em>Change Bracket To Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracketToAngle
	 * @generated
	 */
	public Adapter createChangeBracketToAngleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBracket <em>Remove Outermost Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBracket
	 * @generated
	 */
	public Adapter createRemoveOutermostBracketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarTo1orStar <em>Convert1to Star To1or Star</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarTo1orStar
	 * @generated
	 */
	public Adapter createConvert1toStarTo1orStarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracketExceptOutermost <em>Remove Bracket Except Outermost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracketExceptOutermost
	 * @generated
	 */
	public Adapter createRemoveBracketExceptOutermostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr <em>Remove Certain Type From Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr
	 * @generated
	 */
	public Adapter createRemoveCertainTypeFromAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleContent <em>Change Rule Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleContent
	 * @generated
	 */
	public Adapter createChangeRuleContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule <em>Change Called Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule
	 * @generated
	 */
	public Adapter createChangeCalledRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCommaToOtherSymbol <em>Change Comma To Other Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCommaToOtherSymbol
	 * @generated
	 */
	public Adapter createChangeCommaToOtherSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword <em>Move Attr To After Rule Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword
	 * @generated
	 */
	public Adapter createMoveAttrToAfterRuleKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword <em>Add String To Rule Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword
	 * @generated
	 */
	public Adapter createAddStringToRuleKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToAttr <em>Add Optionality To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToAttr
	 * @generated
	 */
	public Adapter createAddOptionalityToAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveImport <em>Remove Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveImport
	 * @generated
	 */
	public Adapter createRemoveImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword <em>Add Alternative Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword
	 * @generated
	 */
	public Adapter createAddAlternativeKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToKeyword <em>Add Optionality To Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToKeyword
	 * @generated
	 */
	public Adapter createAddOptionalityToKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracketToAttr <em>Add Bracket To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracketToAttr
	 * @generated
	 */
	public Adapter createAddBracketToAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordUpperToLowerCase <em>Keyword Upper To Lower Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordUpperToLowerCase
	 * @generated
	 */
	public Adapter createKeywordUpperToLowerCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordLowerToUpperCase <em>Keyword Lower To Upper Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordLowerToUpperCase
	 * @generated
	 */
	public Adapter createKeywordLowerToUpperCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSquareBracketToAttr <em>Add Square Bracket To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSquareBracketToAttr
	 * @generated
	 */
	public Adapter createAddSquareBracketToAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBracket <em>Add Optionality To Outermost Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBracket
	 * @generated
	 */
	public Adapter createAddOptionalityToOutermostBracketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOutermostBracketToParenthesis <em>Change Outermost Bracket To Parenthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOutermostBracketToParenthesis
	 * @generated
	 */
	public Adapter createChangeOutermostBracketToParenthesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr <em>Add Symbol To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr
	 * @generated
	 */
	public Adapter createAddSymbolToAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType <em>Add Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType
	 * @generated
	 */
	public Adapter createAddPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToRule <em>Add Symbol To Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToRule
	 * @generated
	 */
	public Adapter createAddSymbolToRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToLine <em>Add Keyword To Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToLine
	 * @generated
	 */
	public Adapter createAddKeywordToLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes <em>Add Parentheses Without Quotes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes
	 * @generated
	 */
	public Adapter createAddParenthesesWithoutQuotesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToSymbol <em>Add Optionality To Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToSymbol
	 * @generated
	 */
	public Adapter createAddOptionalityToSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToLine <em>Add Symbol To Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToLine
	 * @generated
	 */
	public Adapter createAddSymbolToLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine <em>Add Symbol Without Quote To Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine
	 * @generated
	 */
	public Adapter createAddSymbolWithoutQuoteToLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABtoBAB <em>Change ABto BAB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABtoBAB
	 * @generated
	 */
	public Adapter createChangeABtoBABAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB <em>Copy Attr ATo Attr B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB
	 * @generated
	 */
	public Adapter createCopyAttrAToAttrBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY <em>Copy Xfrom Star To Y</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY
	 * @generated
	 */
	public Adapter createCopyXfromStarToYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToTwo <em>Convert1to Star To Two</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToTwo
	 * @generated
	 */
	public Adapter createConvert1toStarToTwoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToOptionalAorA <em>Change ATo Optional Aor A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToOptionalAorA
	 * @generated
	 */
	public Adapter createChangeAToOptionalAorAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddTerminalRule <em>Add Terminal Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddTerminalRule
	 * @generated
	 */
	public Adapter createAddTerminalRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToLine <em>Add Optionality To Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToLine
	 * @generated
	 */
	public Adapter createAddOptionalityToLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracketToLine <em>Add Bracket To Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracketToLine
	 * @generated
	 */
	public Adapter createAddBracketToLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuoteToRule <em>Add Parentheses Without Quote To Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuoteToRule
	 * @generated
	 */
	public Adapter createAddParenthesesWithoutQuoteToRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol <em>Add Alternative Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol
	 * @generated
	 */
	public Adapter createAddAlternativeSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABToABorBA <em>Change AB To ABor BA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABToABorBA
	 * @generated
	 */
	public Adapter createChangeABToABorBAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword <em>Add Symbol Without Quote To Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword
	 * @generated
	 */
	public Adapter createAddSymbolWithoutQuoteToKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.PackageAttributes <em>Package Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.PackageAttributes
	 * @generated
	 */
	public Adapter createPackageAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBooleanAttrToSpecialPatten <em>Change Boolean Attr To Special Patten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBooleanAttrToSpecialPatten
	 * @generated
	 */
	public Adapter createChangeBooleanAttrToSpecialPattenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToASemiOrAWithBracket <em>Change ATo ASemi Or AWith Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToASemiOrAWithBracket
	 * @generated
	 */
	public Adapter createChangeAToASemiOrAWithBracketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeReturns <em>Change Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeReturns
	 * @generated
	 */
	public Adapter createChangeReturnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue <em>Add Alternative Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue
	 * @generated
	 */
	public Adapter createAddAlternativeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToAorSymbol <em>Change ATo Aor Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToAorSymbol
	 * @generated
	 */
	public Adapter createChangeAToAorSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSubClassToAbstractClass <em>Add Alternative Sub Class To Abstract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSubClassToAbstractClass
	 * @generated
	 */
	public Adapter createAddAlternativeSubClassToAbstractClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracketToRule <em>Add Bracket To Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracketToRule
	 * @generated
	 */
	public Adapter createAddBracketToRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveLiteralFromEnum <em>Remove Literal From Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveLiteralFromEnum
	 * @generated
	 */
	public Adapter createRemoveLiteralFromEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert0toStarTo0toStaror1toStar <em>Convert0to Star To0to Staror1to Star</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert0toStarTo0toStaror1toStar
	 * @generated
	 */
	public Adapter createConvert0toStarTo0toStaror1toStarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAction <em>Remove Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAction
	 * @generated
	 */
	public Adapter createRemoveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule <em>Add Call To Other Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule
	 * @generated
	 */
	public Adapter createAddCallToOtherRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty <em>Set Ast Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty
	 * @generated
	 */
	public Adapter createSetAstPropertyAdapter() {
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

} //OptimizationruleAdapterFactory
