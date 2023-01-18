/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.myspectra.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.myspectra.services.MySpectraGrammarAccess;
import spectra.Decl;
import spectra.Import;
import spectra.Model;
import spectra.TemporalExpression;
import spectra.WeightDef;

@SuppressWarnings("all")
public class MySpectraFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MySpectraGrammarAccess _mySpectraGrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<Import> _imports = model.getImports();
    for (final Import _import : _imports) {
      document.<Import>format(_import);
    }
    EList<Decl> _elements = model.getElements();
    for (final Decl decl : _elements) {
      document.<Decl>format(decl);
    }
  }
  
  protected void _format(final WeightDef weightDef, @Extension final IFormattableDocument document) {
    document.<TemporalExpression>format(weightDef.getDefinition());
  }
  
  public void format(final Object weightDef, final IFormattableDocument document) {
    if (weightDef instanceof XtextResource) {
      _format((XtextResource)weightDef, document);
      return;
    } else if (weightDef instanceof WeightDef) {
      _format((WeightDef)weightDef, document);
      return;
    } else if (weightDef instanceof Model) {
      _format((Model)weightDef, document);
      return;
    } else if (weightDef instanceof EObject) {
      _format((EObject)weightDef, document);
      return;
    } else if (weightDef == null) {
      _format((Void)null, document);
      return;
    } else if (weightDef != null) {
      _format(weightDef, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(weightDef, document).toString());
    }
  }
}
