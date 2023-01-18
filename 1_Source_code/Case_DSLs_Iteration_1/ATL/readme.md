# Project Structure 
## ATL
The metamodel basis for both the originally generated and optimized Xtext grammar (see below for changes from the original Zoo metamodel), including generated model code.
## original
Contains all plugins for the originally generated Xtext grammar.
## optimized
TODO: Contains all plugins for the optimized Xtext grammar

# Changes to the Original Zoo Metamodel
The [original ATL Zoo metamodel](https://github.com/atlanmod/atlantic-zoo/blob/main/AtlantEcore/ATL.ecore) (including also OCL) looks as follows:
<img src="originalMM.png" width="300">


The following changes were made to make the metamodel work with EMF and Xtext:
- Primitive datatypes without instance type name were erroneous and at the same time superfluous, so we just used the <code>EString</code>, <code>EInteger</code>  and <code>EBoolean</code> as types in the EReferences.
  - Thereby also the superordinate package <code>PrimitiveTypes</code> was removed. 
- Removed bidirectional references:
  - <code>ModuleElement#module:Module</code>
  - <code>Paramter#operation:Operation</code>

- Introduction of a new root element: The root element of the metamodel is the abstract class <code>Unit</code>, which has three subclasses <code>Library</code>, <code>Query</code>, and <code>Module</code>. This constellation causes Xtext to not generate any rule calls from the root rule of the grammar to the rules generated for the subclasses. Therefore, we introduced a new root element, the class <code>Root</code> which has a containment reference to <code>Unit</code>.

Furthermore, there are superfluous language elements that are not used in ATL. 
However, we did not remove them in the metamodel but let the GrammarOptimizer remove calls to the corresponding production rules or let it remove unused attribute assignments. 

The resulting metamodel that we used for the language analysis looks as follows:<br>
<img src="resultingMM.png" width="400">


