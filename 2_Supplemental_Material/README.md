# Supplemental Material
In this folder, we put the documents according to the sections in the paper:
# 4_Methodology
There are two folders and three files in this folder. The two sub-folders are:
1, 1st iteration, grammar analysis spreadsheets for languages: ATL (without OCL), Bibtex, DOT, and SML. 
We compare the orginal grammar and the generated grammar, and think of what optimization operations do we need.
2, 2nd iteration, grammar analysis spreadsheets for languages: Spectra, Xenia and Xcore.
The three files are:
1, When we are analyzing the grammars of those selected languages in these two iterations, we collect the candidate optimization rules.
Note that: not all the candidate optimization rules will be identified, as e.g., some of them might be duplicate.
2, Once we have identified optimization rules, we aggregated them into another form with examples which is the preparation of implementation.
3, List of the metamodel adaptations in the first two iterations.
# 6_Solution
Here is only one document in this folder which is the list of classes we used for implementing the optimization rules.
# 7_Evaluation
There are two sub-folders in this folder:
1, Grammar Adaptation
In this folder, we have seven spreadsheets here, each of which is for one selected language. 
In such a spreadsheet, we compare each grammar rules between the optimized grammar and the original grammar, to see if the grammar rule
in the original grammar is imitated by the one in optimized grammar.
2, Support Evolution
In this sub-folder, there are three sub-folders:
1) QVTo grammar analysis: there are four spreadsheets for comparing the original/generated/optimized grammars.
2) QVTo grammar comparison: there are three spreadsheets for comparing the generated grammars between four versions.
3) QVTo metamodel adaptation: there are four spreadsheets describing how we did the adaptations in the four versions of the metamodel in details.
Besides the three sub-folders under the folder "Subsection_7.2_Support_Evolution", there are also two documents:
1) a spreadsheet for comparing the different versions of QVTo metamodel
2) a document describing the general rules we followed for adapting the QVTo metamodels.