# Supplemental Material
In this folder, we put the documents according to the sections in the paper:
# 4_Methodology
There are two folders and three files in this folder. The two sub-folders are:

 * `1st_Iteration` Grammar analysis spreadsheets for languages ATL (without OCL), Bibtex, DOT, and SML. 
We compare the orginal grammar and the generated grammar, and list the required optimization operations.
* `2nd_Iteration` Grammar analysis spreadsheets for languages Spectra, Xenia and Xcore.

The three files are:

 1. `1_Candidate_optimization_rules.xlsx` Collected candidate optimization rules from analyzing the grammars of the languages in both iterations. Note that: not all candidate optimization rules will be listed, as e.g., some of them are duplicates.
 1. `2_Mapping_of_rule_candidates_to_rule_variants.xlsx` Mapping of the candidate rule candidates to rule variants which are implemented by a single Java class.
 1. `Metamodel_adaptations_of_the_selected_DSLs_in_the_1st_and_2nd_iteration` List of the metamodel adaptations in the first two iterations.
 
# 6_Solution
Here is only one document in this folder which is the list of classes we used for implementing the optimization rules.

# 7_Evaluation

There are two sub-folders in this folder:

1. `Subsection_7.1_Grammar_Adaptation` 
Includes seven spreadsheets, each of which compares the grammar rules of the transformed grammar and the original grammar, to see if the grammar rule in the original grammar is imitated by the one in transformed grammar.
1. `Subsection_7.2_Support_Evolution`
In this sub-folder, there are three sub-folders:

	1. QVTo grammar analysis: there are four spreadsheets for comparing the original/generated/transformed grammars.
	1. QVTo grammar comparison: there are three spreadsheets for comparing the generated grammars between four versions.
	1. QVTo metamodel adaptation: there are four spreadsheets describing how we did the adaptations in the four versions of the metamodel in details.

There are also two documents:

1. A spreadsheet for comparing the different versions of the QVTo metamodel.
1. A document describing the general rules we followed for adapting the QVTo metamodels.