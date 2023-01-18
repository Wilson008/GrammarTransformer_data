# Project Structure 
## Development Workspace Plugins
- Requires from [SML repository](https://bitbucket.org/jgreenyer/scenariotools-sml/src/master/):
  - <code>org.scenariotools.sml.model</code>
  - <code>org.scenariotools.sml.expressions.model</code>
- <code>org.prettyprinter.sml</code>: The Xtext grammar initially generated from the [SML metamodel](https://bitbucket.org/jgreenyer/scenariotools-sml/src/master/plugins/org.scenariotools.sml.model/model/sml.ecore), which was slightly modified afterwards (see below for the changes)
- <code>org.prettyprinter.sml.ide</code> and <code>org.prettyprinter.sml.ui</code>: Further automatically generated Xtext plugins
## Runtime Projects
- <code>org.prettyprinter.examples</code>: Examples project for the runtime

# Changes to the Grammar and Further Artifacts
## Grammar
- Instead of using the automatically generated, not compiling and buggy import statements...<br>
<code>import "http://www.scenariotools.org/sml" 
import "http://www.eclipse.org/emf/2002/Ecore" as ecore
<br>...we use these ones (cf. https://www.eclipse.org/forums/index.php/t/1084593/): <br><code>
import "platform:/resource/org.scenariotools.sml.model/model/sml.ecore" 
import "platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore"</code>
- Removed all occurrences of <code>ecore::</code> through find/replace. 
Sometimes, this procedure is also necessary for further packages (there seems to be some non-determinism on the generation of the import statements mentioned above).

## org.prettyprinter.sml.formatting2.SMLFormatter.xtend
In the method <code>format</code> after its initial generation by the MWE workflow, we had to change <code>ePackage.eAnnotations</code>, <code>ePackage.eClassifiers</code>, and <code>ePackage.eSubpackages</code> to <code>ePackage.<b>E</b>Annotations</code>, <code>ePackage.<b>E</b>Classifiers</code>, and <code>ePackage.<b>E</b>Subpackages</code>, respectively.
