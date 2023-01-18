/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.optimizationrule.*;

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
public class OptimizationruleFactoryImpl extends EFactoryImpl implements OptimizationruleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OptimizationruleFactory init() {
		try {
			OptimizationruleFactory theOptimizationruleFactory = (OptimizationruleFactory)EPackage.Registry.INSTANCE.getEFactory(OptimizationrulePackage.eNS_URI);
			if (theOptimizationruleFactory != null) {
				return theOptimizationruleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OptimizationruleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationruleFactoryImpl() {
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
			case OptimizationrulePackage.REMOVE_BRACKET: return createRemoveBracket();
			case OptimizationrulePackage.ADD_KEYWORD_TO_ATTR: return createAddKeywordToAttr();
			case OptimizationrulePackage.ADD_KEYWORD_TO_RULE: return createAddKeywordToRule();
			case OptimizationrulePackage.REMOVE_KEYWORD: return createRemoveKeyword();
			case OptimizationrulePackage.RENAME_KEYWORD: return createRenameKeyword();
			case OptimizationrulePackage.CONVERT1TO_STAR_TO_STAR: return createConvert1toStarToStar();
			case OptimizationrulePackage.CONVERT1TO_STAR_TO_PLUS: return createConvert1toStarToPlus();
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION: return createChangeOptionalAttrToOrRelation();
			case OptimizationrulePackage.REMOVE_XSTAR_ATTR_KEYWORD: return createRemoveXStarAttrKeyword();
			case OptimizationrulePackage.REMOVE_COMMA: return createRemoveComma();
			case OptimizationrulePackage.MOVE_LINE: return createMoveLine();
			case OptimizationrulePackage.REMOVE_RULE: return createRemoveRule();
			case OptimizationrulePackage.CONVERT1_TO_STAR_TO1: return createConvert1ToStarTo1();
			case OptimizationrulePackage.REMOVE_RULE_CALL: return createRemoveRuleCall();
			case OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD: return createAddKeywordAfterKeyword();
			case OptimizationrulePackage.CHANGE_TYPE_OF_ATTR: return createChangeTypeOfAttr();
			case OptimizationrulePackage.ADD_PARENTHESES_TO_ATTR: return createAddParenthesesToAttr();
			case OptimizationrulePackage.REMOVE_PARENTHESES_IN_SPECIFIED_ATTR: return createRemoveParenthesesInSpecifiedAttr();
			case OptimizationrulePackage.ADD_IMPORT: return createAddImport();
			case OptimizationrulePackage.REMOVE_ATTRIBUTE: return createRemoveAttribute();
			case OptimizationrulePackage.CHANGE_ATTR_LINE_CONTENT: return createChangeAttrLineContent();
			case OptimizationrulePackage.RENAME_RULE: return createRenameRule();
			case OptimizationrulePackage.REMOVE_KEYWORDS_OF_ALL_ATTRS: return createRemoveKeywordsOfAllAttrs();
			case OptimizationrulePackage.REMOVE_OPTIONALITY: return createRemoveOptionality();
			case OptimizationrulePackage.CHANGE_BRACKET_TO_PARENTHESES: return createChangeBracketToParentheses();
			case OptimizationrulePackage.CHANGE_BRACKET_TO_SQUARE: return createChangeBracketToSquare();
			case OptimizationrulePackage.CHANGE_BRACKET_TO_ANGLE: return createChangeBracketToAngle();
			case OptimizationrulePackage.REMOVE_OUTERMOST_BRACKET: return createRemoveOutermostBracket();
			case OptimizationrulePackage.CONVERT1TO_STAR_TO1OR_STAR: return createConvert1toStarTo1orStar();
			case OptimizationrulePackage.REMOVE_BRACKET_EXCEPT_OUTERMOST: return createRemoveBracketExceptOutermost();
			case OptimizationrulePackage.REMOVE_CERTAIN_TYPE_FROM_ATTR: return createRemoveCertainTypeFromAttr();
			case OptimizationrulePackage.CHANGE_RULE_CONTENT: return createChangeRuleContent();
			case OptimizationrulePackage.CHANGE_CALLED_RULE: return createChangeCalledRule();
			case OptimizationrulePackage.CHANGE_COMMA_TO_OTHER_SYMBOL: return createChangeCommaToOtherSymbol();
			case OptimizationrulePackage.MOVE_ATTR_TO_AFTER_RULE_KEYWORD: return createMoveAttrToAfterRuleKeyword();
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD: return createAddStringToRuleKeyword();
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_ATTR: return createAddOptionalityToAttr();
			case OptimizationrulePackage.REMOVE_IMPORT: return createRemoveImport();
			case OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD: return createAddAlternativeKeyword();
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_KEYWORD: return createAddOptionalityToKeyword();
			case OptimizationrulePackage.ADD_BRACKET_TO_ATTR: return createAddBracketToAttr();
			case OptimizationrulePackage.KEYWORD_UPPER_TO_LOWER_CASE: return createKeywordUpperToLowerCase();
			case OptimizationrulePackage.KEYWORD_LOWER_TO_UPPER_CASE: return createKeywordLowerToUpperCase();
			case OptimizationrulePackage.ADD_SQUARE_BRACKET_TO_ATTR: return createAddSquareBracketToAttr();
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACKET: return createAddOptionalityToOutermostBracket();
			case OptimizationrulePackage.CHANGE_OUTERMOST_BRACKET_TO_PARENTHESIS: return createChangeOutermostBracketToParenthesis();
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR: return createAddSymbolToAttr();
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE: return createAddPrimitiveType();
			case OptimizationrulePackage.ADD_SYMBOL_TO_RULE: return createAddSymbolToRule();
			case OptimizationrulePackage.ADD_KEYWORD_TO_LINE: return createAddKeywordToLine();
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES: return createAddParenthesesWithoutQuotes();
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_SYMBOL: return createAddOptionalityToSymbol();
			case OptimizationrulePackage.ADD_SYMBOL_TO_LINE: return createAddSymbolToLine();
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE: return createAddSymbolWithoutQuoteToLine();
			case OptimizationrulePackage.CHANGE_ABTO_BAB: return createChangeABtoBAB();
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B: return createCopyAttrAToAttrB();
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y: return createCopyXfromStarToY();
			case OptimizationrulePackage.CONVERT1TO_STAR_TO_TWO: return createConvert1toStarToTwo();
			case OptimizationrulePackage.CHANGE_ATO_OPTIONAL_AOR_A: return createChangeAToOptionalAorA();
			case OptimizationrulePackage.ADD_TERMINAL_RULE: return createAddTerminalRule();
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_LINE: return createAddOptionalityToLine();
			case OptimizationrulePackage.ADD_BRACKET_TO_LINE: return createAddBracketToLine();
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE: return createAddParenthesesWithoutQuoteToRule();
			case OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL: return createAddAlternativeSymbol();
			case OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA: return createChangeABToABorBA();
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD: return createAddSymbolWithoutQuoteToKeyword();
			case OptimizationrulePackage.PACKAGE_ATTRIBUTES: return createPackageAttributes();
			case OptimizationrulePackage.CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTEN: return createChangeBooleanAttrToSpecialPatten();
			case OptimizationrulePackage.CHANGE_ATO_ASEMI_OR_AWITH_BRACKET: return createChangeAToASemiOrAWithBracket();
			case OptimizationrulePackage.CHANGE_RETURNS: return createChangeReturns();
			case OptimizationrulePackage.ADD_ALTERNATIVE_VALUE: return createAddAlternativeValue();
			case OptimizationrulePackage.CHANGE_ATO_AOR_SYMBOL: return createChangeAToAorSymbol();
			case OptimizationrulePackage.ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS: return createAddAlternativeSubClassToAbstractClass();
			case OptimizationrulePackage.ADD_BRACKET_TO_RULE: return createAddBracketToRule();
			case OptimizationrulePackage.REMOVE_LITERAL_FROM_ENUM: return createRemoveLiteralFromEnum();
			case OptimizationrulePackage.CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR: return createConvert0toStarTo0toStaror1toStar();
			case OptimizationrulePackage.REMOVE_ACTION: return createRemoveAction();
			case OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE: return createAddCallToOtherRule();
			case OptimizationrulePackage.SET_AST_PROPERTY: return createSetAstProperty();
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
			case OptimizationrulePackage.SCOPE_KEY:
				return createScopeKeyFromString(eDataType, initialValue);
			case OptimizationrulePackage.PACKAGE_KEY:
				return createPackageKeyFromString(eDataType, initialValue);
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
			case OptimizationrulePackage.SCOPE_KEY:
				return convertScopeKeyToString(eDataType, instanceValue);
			case OptimizationrulePackage.PACKAGE_KEY:
				return convertPackageKeyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveBracket createRemoveBracket() {
		RemoveBracketImpl removeBracket = new RemoveBracketImpl();
		return removeBracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddKeywordToAttr createAddKeywordToAttr() {
		AddKeywordToAttrImpl addKeywordToAttr = new AddKeywordToAttrImpl();
		return addKeywordToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddKeywordToRule createAddKeywordToRule() {
		AddKeywordToRuleImpl addKeywordToRule = new AddKeywordToRuleImpl();
		return addKeywordToRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveKeyword createRemoveKeyword() {
		RemoveKeywordImpl removeKeyword = new RemoveKeywordImpl();
		return removeKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameKeyword createRenameKeyword() {
		RenameKeywordImpl renameKeyword = new RenameKeywordImpl();
		return renameKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert1toStarToStar createConvert1toStarToStar() {
		Convert1toStarToStarImpl convert1toStarToStar = new Convert1toStarToStarImpl();
		return convert1toStarToStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert1toStarToPlus createConvert1toStarToPlus() {
		Convert1toStarToPlusImpl convert1toStarToPlus = new Convert1toStarToPlusImpl();
		return convert1toStarToPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeOptionalAttrToOrRelation createChangeOptionalAttrToOrRelation() {
		ChangeOptionalAttrToOrRelationImpl changeOptionalAttrToOrRelation = new ChangeOptionalAttrToOrRelationImpl();
		return changeOptionalAttrToOrRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveXStarAttrKeyword createRemoveXStarAttrKeyword() {
		RemoveXStarAttrKeywordImpl removeXStarAttrKeyword = new RemoveXStarAttrKeywordImpl();
		return removeXStarAttrKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveComma createRemoveComma() {
		RemoveCommaImpl removeComma = new RemoveCommaImpl();
		return removeComma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveLine createMoveLine() {
		MoveLineImpl moveLine = new MoveLineImpl();
		return moveLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveRule createRemoveRule() {
		RemoveRuleImpl removeRule = new RemoveRuleImpl();
		return removeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert1ToStarTo1 createConvert1ToStarTo1() {
		Convert1ToStarTo1Impl convert1ToStarTo1 = new Convert1ToStarTo1Impl();
		return convert1ToStarTo1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveRuleCall createRemoveRuleCall() {
		RemoveRuleCallImpl removeRuleCall = new RemoveRuleCallImpl();
		return removeRuleCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddKeywordAfterKeyword createAddKeywordAfterKeyword() {
		AddKeywordAfterKeywordImpl addKeywordAfterKeyword = new AddKeywordAfterKeywordImpl();
		return addKeywordAfterKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTypeOfAttr createChangeTypeOfAttr() {
		ChangeTypeOfAttrImpl changeTypeOfAttr = new ChangeTypeOfAttrImpl();
		return changeTypeOfAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddParenthesesToAttr createAddParenthesesToAttr() {
		AddParenthesesToAttrImpl addParenthesesToAttr = new AddParenthesesToAttrImpl();
		return addParenthesesToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveParenthesesInSpecifiedAttr createRemoveParenthesesInSpecifiedAttr() {
		RemoveParenthesesInSpecifiedAttrImpl removeParenthesesInSpecifiedAttr = new RemoveParenthesesInSpecifiedAttrImpl();
		return removeParenthesesInSpecifiedAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddImport createAddImport() {
		AddImportImpl addImport = new AddImportImpl();
		return addImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAttribute createRemoveAttribute() {
		RemoveAttributeImpl removeAttribute = new RemoveAttributeImpl();
		return removeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAttrLineContent createChangeAttrLineContent() {
		ChangeAttrLineContentImpl changeAttrLineContent = new ChangeAttrLineContentImpl();
		return changeAttrLineContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameRule createRenameRule() {
		RenameRuleImpl renameRule = new RenameRuleImpl();
		return renameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveKeywordsOfAllAttrs createRemoveKeywordsOfAllAttrs() {
		RemoveKeywordsOfAllAttrsImpl removeKeywordsOfAllAttrs = new RemoveKeywordsOfAllAttrsImpl();
		return removeKeywordsOfAllAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveOptionality createRemoveOptionality() {
		RemoveOptionalityImpl removeOptionality = new RemoveOptionalityImpl();
		return removeOptionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeBracketToParentheses createChangeBracketToParentheses() {
		ChangeBracketToParenthesesImpl changeBracketToParentheses = new ChangeBracketToParenthesesImpl();
		return changeBracketToParentheses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeBracketToSquare createChangeBracketToSquare() {
		ChangeBracketToSquareImpl changeBracketToSquare = new ChangeBracketToSquareImpl();
		return changeBracketToSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeBracketToAngle createChangeBracketToAngle() {
		ChangeBracketToAngleImpl changeBracketToAngle = new ChangeBracketToAngleImpl();
		return changeBracketToAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveOutermostBracket createRemoveOutermostBracket() {
		RemoveOutermostBracketImpl removeOutermostBracket = new RemoveOutermostBracketImpl();
		return removeOutermostBracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert1toStarTo1orStar createConvert1toStarTo1orStar() {
		Convert1toStarTo1orStarImpl convert1toStarTo1orStar = new Convert1toStarTo1orStarImpl();
		return convert1toStarTo1orStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveBracketExceptOutermost createRemoveBracketExceptOutermost() {
		RemoveBracketExceptOutermostImpl removeBracketExceptOutermost = new RemoveBracketExceptOutermostImpl();
		return removeBracketExceptOutermost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveCertainTypeFromAttr createRemoveCertainTypeFromAttr() {
		RemoveCertainTypeFromAttrImpl removeCertainTypeFromAttr = new RemoveCertainTypeFromAttrImpl();
		return removeCertainTypeFromAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRuleContent createChangeRuleContent() {
		ChangeRuleContentImpl changeRuleContent = new ChangeRuleContentImpl();
		return changeRuleContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeCalledRule createChangeCalledRule() {
		ChangeCalledRuleImpl changeCalledRule = new ChangeCalledRuleImpl();
		return changeCalledRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeCommaToOtherSymbol createChangeCommaToOtherSymbol() {
		ChangeCommaToOtherSymbolImpl changeCommaToOtherSymbol = new ChangeCommaToOtherSymbolImpl();
		return changeCommaToOtherSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveAttrToAfterRuleKeyword createMoveAttrToAfterRuleKeyword() {
		MoveAttrToAfterRuleKeywordImpl moveAttrToAfterRuleKeyword = new MoveAttrToAfterRuleKeywordImpl();
		return moveAttrToAfterRuleKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStringToRuleKeyword createAddStringToRuleKeyword() {
		AddStringToRuleKeywordImpl addStringToRuleKeyword = new AddStringToRuleKeywordImpl();
		return addStringToRuleKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOptionalityToAttr createAddOptionalityToAttr() {
		AddOptionalityToAttrImpl addOptionalityToAttr = new AddOptionalityToAttrImpl();
		return addOptionalityToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveImport createRemoveImport() {
		RemoveImportImpl removeImport = new RemoveImportImpl();
		return removeImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAlternativeKeyword createAddAlternativeKeyword() {
		AddAlternativeKeywordImpl addAlternativeKeyword = new AddAlternativeKeywordImpl();
		return addAlternativeKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOptionalityToKeyword createAddOptionalityToKeyword() {
		AddOptionalityToKeywordImpl addOptionalityToKeyword = new AddOptionalityToKeywordImpl();
		return addOptionalityToKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddBracketToAttr createAddBracketToAttr() {
		AddBracketToAttrImpl addBracketToAttr = new AddBracketToAttrImpl();
		return addBracketToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordUpperToLowerCase createKeywordUpperToLowerCase() {
		KeywordUpperToLowerCaseImpl keywordUpperToLowerCase = new KeywordUpperToLowerCaseImpl();
		return keywordUpperToLowerCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordLowerToUpperCase createKeywordLowerToUpperCase() {
		KeywordLowerToUpperCaseImpl keywordLowerToUpperCase = new KeywordLowerToUpperCaseImpl();
		return keywordLowerToUpperCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSquareBracketToAttr createAddSquareBracketToAttr() {
		AddSquareBracketToAttrImpl addSquareBracketToAttr = new AddSquareBracketToAttrImpl();
		return addSquareBracketToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOptionalityToOutermostBracket createAddOptionalityToOutermostBracket() {
		AddOptionalityToOutermostBracketImpl addOptionalityToOutermostBracket = new AddOptionalityToOutermostBracketImpl();
		return addOptionalityToOutermostBracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeOutermostBracketToParenthesis createChangeOutermostBracketToParenthesis() {
		ChangeOutermostBracketToParenthesisImpl changeOutermostBracketToParenthesis = new ChangeOutermostBracketToParenthesisImpl();
		return changeOutermostBracketToParenthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSymbolToAttr createAddSymbolToAttr() {
		AddSymbolToAttrImpl addSymbolToAttr = new AddSymbolToAttrImpl();
		return addSymbolToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddPrimitiveType createAddPrimitiveType() {
		AddPrimitiveTypeImpl addPrimitiveType = new AddPrimitiveTypeImpl();
		return addPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSymbolToRule createAddSymbolToRule() {
		AddSymbolToRuleImpl addSymbolToRule = new AddSymbolToRuleImpl();
		return addSymbolToRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddKeywordToLine createAddKeywordToLine() {
		AddKeywordToLineImpl addKeywordToLine = new AddKeywordToLineImpl();
		return addKeywordToLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddParenthesesWithoutQuotes createAddParenthesesWithoutQuotes() {
		AddParenthesesWithoutQuotesImpl addParenthesesWithoutQuotes = new AddParenthesesWithoutQuotesImpl();
		return addParenthesesWithoutQuotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOptionalityToSymbol createAddOptionalityToSymbol() {
		AddOptionalityToSymbolImpl addOptionalityToSymbol = new AddOptionalityToSymbolImpl();
		return addOptionalityToSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSymbolToLine createAddSymbolToLine() {
		AddSymbolToLineImpl addSymbolToLine = new AddSymbolToLineImpl();
		return addSymbolToLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSymbolWithoutQuoteToLine createAddSymbolWithoutQuoteToLine() {
		AddSymbolWithoutQuoteToLineImpl addSymbolWithoutQuoteToLine = new AddSymbolWithoutQuoteToLineImpl();
		return addSymbolWithoutQuoteToLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeABtoBAB createChangeABtoBAB() {
		ChangeABtoBABImpl changeABtoBAB = new ChangeABtoBABImpl();
		return changeABtoBAB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyAttrAToAttrB createCopyAttrAToAttrB() {
		CopyAttrAToAttrBImpl copyAttrAToAttrB = new CopyAttrAToAttrBImpl();
		return copyAttrAToAttrB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyXfromStarToY createCopyXfromStarToY() {
		CopyXfromStarToYImpl copyXfromStarToY = new CopyXfromStarToYImpl();
		return copyXfromStarToY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert1toStarToTwo createConvert1toStarToTwo() {
		Convert1toStarToTwoImpl convert1toStarToTwo = new Convert1toStarToTwoImpl();
		return convert1toStarToTwo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAToOptionalAorA createChangeAToOptionalAorA() {
		ChangeAToOptionalAorAImpl changeAToOptionalAorA = new ChangeAToOptionalAorAImpl();
		return changeAToOptionalAorA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddTerminalRule createAddTerminalRule() {
		AddTerminalRuleImpl addTerminalRule = new AddTerminalRuleImpl();
		return addTerminalRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOptionalityToLine createAddOptionalityToLine() {
		AddOptionalityToLineImpl addOptionalityToLine = new AddOptionalityToLineImpl();
		return addOptionalityToLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddBracketToLine createAddBracketToLine() {
		AddBracketToLineImpl addBracketToLine = new AddBracketToLineImpl();
		return addBracketToLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddParenthesesWithoutQuoteToRule createAddParenthesesWithoutQuoteToRule() {
		AddParenthesesWithoutQuoteToRuleImpl addParenthesesWithoutQuoteToRule = new AddParenthesesWithoutQuoteToRuleImpl();
		return addParenthesesWithoutQuoteToRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAlternativeSymbol createAddAlternativeSymbol() {
		AddAlternativeSymbolImpl addAlternativeSymbol = new AddAlternativeSymbolImpl();
		return addAlternativeSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeABToABorBA createChangeABToABorBA() {
		ChangeABToABorBAImpl changeABToABorBA = new ChangeABToABorBAImpl();
		return changeABToABorBA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSymbolWithoutQuoteToKeyword createAddSymbolWithoutQuoteToKeyword() {
		AddSymbolWithoutQuoteToKeywordImpl addSymbolWithoutQuoteToKeyword = new AddSymbolWithoutQuoteToKeywordImpl();
		return addSymbolWithoutQuoteToKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageAttributes createPackageAttributes() {
		PackageAttributesImpl packageAttributes = new PackageAttributesImpl();
		return packageAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeBooleanAttrToSpecialPatten createChangeBooleanAttrToSpecialPatten() {
		ChangeBooleanAttrToSpecialPattenImpl changeBooleanAttrToSpecialPatten = new ChangeBooleanAttrToSpecialPattenImpl();
		return changeBooleanAttrToSpecialPatten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAToASemiOrAWithBracket createChangeAToASemiOrAWithBracket() {
		ChangeAToASemiOrAWithBracketImpl changeAToASemiOrAWithBracket = new ChangeAToASemiOrAWithBracketImpl();
		return changeAToASemiOrAWithBracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeReturns createChangeReturns() {
		ChangeReturnsImpl changeReturns = new ChangeReturnsImpl();
		return changeReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAlternativeValue createAddAlternativeValue() {
		AddAlternativeValueImpl addAlternativeValue = new AddAlternativeValueImpl();
		return addAlternativeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAToAorSymbol createChangeAToAorSymbol() {
		ChangeAToAorSymbolImpl changeAToAorSymbol = new ChangeAToAorSymbolImpl();
		return changeAToAorSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAlternativeSubClassToAbstractClass createAddAlternativeSubClassToAbstractClass() {
		AddAlternativeSubClassToAbstractClassImpl addAlternativeSubClassToAbstractClass = new AddAlternativeSubClassToAbstractClassImpl();
		return addAlternativeSubClassToAbstractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddBracketToRule createAddBracketToRule() {
		AddBracketToRuleImpl addBracketToRule = new AddBracketToRuleImpl();
		return addBracketToRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveLiteralFromEnum createRemoveLiteralFromEnum() {
		RemoveLiteralFromEnumImpl removeLiteralFromEnum = new RemoveLiteralFromEnumImpl();
		return removeLiteralFromEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert0toStarTo0toStaror1toStar createConvert0toStarTo0toStaror1toStar() {
		Convert0toStarTo0toStaror1toStarImpl convert0toStarTo0toStaror1toStar = new Convert0toStarTo0toStaror1toStarImpl();
		return convert0toStarTo0toStaror1toStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAction createRemoveAction() {
		RemoveActionImpl removeAction = new RemoveActionImpl();
		return removeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddCallToOtherRule createAddCallToOtherRule() {
		AddCallToOtherRuleImpl addCallToOtherRule = new AddCallToOtherRuleImpl();
		return addCallToOtherRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAstProperty createSetAstProperty() {
		SetAstPropertyImpl setAstProperty = new SetAstPropertyImpl();
		return setAstProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeKey createScopeKeyFromString(EDataType eDataType, String initialValue) {
		ScopeKey result = ScopeKey.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeKeyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageKey createPackageKeyFromString(EDataType eDataType, String initialValue) {
		PackageKey result = PackageKey.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackageKeyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationrulePackage getOptimizationrulePackage() {
		return (OptimizationrulePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OptimizationrulePackage getPackage() {
		return OptimizationrulePackage.eINSTANCE;
	}

} //OptimizationruleFactoryImpl
