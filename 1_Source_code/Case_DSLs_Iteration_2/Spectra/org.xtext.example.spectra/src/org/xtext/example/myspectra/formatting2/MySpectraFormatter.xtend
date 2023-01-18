/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.myspectra.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.myspectra.services.MySpectraGrammarAccess
import spectra.Model
import spectra.WeightDef

class MySpectraFormatter extends AbstractFormatter2 {
	
	@Inject extension MySpectraGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (_import : model.imports) {
			_import.format
		}
		for (decl : model.elements) {
			decl.format
		}
	}

	def dispatch void format(WeightDef weightDef, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		weightDef.definition.format
	}
	
	// TODO: implement for Var, TypeDef, Define, DefineRegExp, Counter, Monitor, Pattern, Predicate, LTLGar, LTLAsm, EXGar, TemporalInExpr, TemporalImpExpr, TemporalIffExpr, TemporalOrExpr, TemporalAndExpr, TemporalRelationalExpr, TemporalRemainderExpr, TemporalAdditiveExpr, TemporalMultiplicativeExpr, TemporalBinaryExpr, TemporalUnaryExpr, TemporalPrimaryExpr, QuantifierExpr, RegExp, DefineRegExpDecl, VarDecl, DefineDecl, TypedParam, DomainVarDecl, VarType, Subrange, SizeDefineDecl, DefineArray, BooleanTerm, BinaryRegExp, UnaryRegExp, CompRegExp, PatternParamList, TypedParamList, Trigger
}
