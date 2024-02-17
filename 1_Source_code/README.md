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
## org.bumble.xtext.grammartransformer
This folder contains the projects of the GrammarTransformer and its test cases.
### org.bumble.xtext.grammartransformer
In this project, there are two classes:
1. one is called GrammarOptimizerRunner which is for configuring the GrammarTransformer.
2. another one is called GrammarTransformer which 
### org.bumble.xtext.grammartransformer.grammarrule
This project is for defining a structure for a single grammar rule. This structure will be frequently used in the implementation.
### org.bumble.xtext.grammartransformer.transformationrule
This project implements all the transformation rules. The implementation details are all in the public method apply().
### org.bumble.xtext.grammartransformer.helper
This project implements some helper methods which assist the implementation.
### org.bumble.xtext.grammartransformer.test
This is the project for test cases for all the languages. There are two folders: testsources/input and testsources/output. 
We put the generated grammars in the input folder while we got the transformed grammars are from the output folder.
We do the experiments in this test project. When the test project runs, it will do as follows:
1. it will read the generated grammar from the files in the input folder, and then 
2. the test cases will call the public method apply() of the transformation rules to optimize the generated grammar. This will get an transformed grammar. The project will then
3. read the grammars from the files in the output folder, we name this grammars as target grammar. then
4. there will be an assert method to compare the transformed and the target grammar. They should be the same. Otherwise the project runs into error.

#### The test cases are in the following source code files:
1. AdaptingATLNoOCLTest.java which is for testing the transformation on the generated grammar of ATL (without OCL part).
2. AdaptingMyBibtexTest.java which is for testing the transformation on the generated grammar of Bibtex.
3. AdaptingMyDotTest.java which is for testing the transformation on the generated grammar of DOT.
4. OptimizeSMLTest.java which is for testing the transformation on the generated grammar of SML.
5. AdaptingMyXeniaTest.java which is for testing the transformation on the generated grammar of Xenia.
6. AdaptingXcoreTest.java which is for testing the transformation on the generated grammar of Xcore.
7. AdaptingSpectraTest.java which is for testing the transformation on the generated grammar of Spectra.
8. AdaptingEastAdlSimplifiedTest.java which is for testing the transformation on the generated grammar of the simplified version of version 2.2 of EAST-ADL.
9. AdaptingEastAdlFullTest.java which is for testing the transformation on the generated grammar of the full version 2.2 of EAST-ADL.
10. AdaptingQVToV1.x.java test the transformation on the generated grammars of those four versions of QVTo.
