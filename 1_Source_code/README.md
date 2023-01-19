# 1_Scoure_code
This folder includes all the source code of the paper:
## Case_DSLs_Iteration_1
This subfolder includes all the emf projects of all the selected languages in the first iteration.
The four languages are: ATL (without OCL), DOT, Bibtex, and SML.
The engineering work here includes:
1, create an EMF project for a language with its metamodel
2, fix ill-formed issues
3, create genmodel from the ecore metamodel
4, generate Xtext grammar from the genmodel
## Case_DSLs_Iteration_2
This subfolder includes all the emf projects of all the selected languages in the second iteration.
The three languages are: Spectra, Xenia and Xcore.
We did the same work with iteration 1 here.
## EAST-ADL
This folder contains the projects of both simplified/full versions of EAST-ADL. 
EAST-ADL is one of the case languages in the evaluation section.
We generate Xtext grammar for both versions of EAST-ADL metamodel.
## QVTo
This folder contains the projects of all the four versions of QVTo (i.e., V1.0, V1.1, V1.2, V1.3).
QVTo is another one of the case languages in the evaluation section.
We generate Xtext grammar for both versions of QVTo metamodel.
## org.bumble.xtext.grammaroptimizer
This folder contains the projects of the GrammarOptimizer and its test cases.
### org.bumble.xtext.grammaroptimizer
In this project, there is a class GrammarOptimizerRunner which is for configuring the GrammarOptimizer.
### org.bumble.xtext.grammaroptimizer.grammarrule
This project is for defining a structure for a single grammar rule.
### org.bumble.xtext.grammaroptimizer.optimizationrule
This project implements all the optimization rules.
### org.bumble.xtext.grammaroptimizer.helper
This project implements some helper methods.
### org.bumble.xtext.grammaroptimizer.test
This is the project for test cases for all the languages. There are two folders: testsources/input and testsources/output. 
We put the generated grammars in the input folder while we got the optimized grammars are from the output folder.