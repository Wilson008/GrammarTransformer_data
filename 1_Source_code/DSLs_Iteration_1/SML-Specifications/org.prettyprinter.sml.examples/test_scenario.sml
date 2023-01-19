// cf. https://bitbucket.org/jgreenyer/scenariotools-sml/src/master/examples/org.scenariotools.sml.examples.test/test_scenario/test_scenario.sml


// specification test_scenario {
Specification test_scenario {
	
	// domain model
	domains (		
		model
	)
	
	//	controllable {
	//		A
	//		B
	//	}	
	controllableEClasses (
		"model.A", 
		"model.B"
	)
	
	// import "../model.ecore" [comment: in the very beginning of the sml model]	
	imports {
		Import {
			importURI "model.ecore"
		}
	}		
	
	// [comment: no counterpart]
	containedCollaborations {
		
		// collaboration test_scenario {
		Collaboration test_scenario {
			
			//	static role A a 
			//	static role B b 
			//	static role Environment env			
			roles {
				static Role a {
					type "model.A"
				},
				static Role b {
					type "model.B"
				},
				static Role env {
					type "model.Environment"
				}
			}
			
			// [comment: no counterpart]
			scenarios {
				
				// guarantee *scenario requirementScenario1* { [comment: mandatory metamodel Boolean attribute optimizeCost optional in original SML grammar]
				optimizeCost Scenario requirementsScenario1 { 
					
					// *guarantee* scenario requirementScenario1 
					kind guarantee
					
					// [comment: no counterpart; mandatory metamodel Double attribute cost optional in original SML grammar]
					cost 1.5
					
					// [comment: no counterpart]
					ownedInteraction Interaction {
						
						// [comment: no counterpart]
						fragments {
							
							// env -> a.opA1()
							ModalMessage {								
								receiver a							
								sender env								
								modelElement "model.A.opA1"   								
							},
							
							// strict urgent a -> b.opB1()
							strict ModalMessage {
								expectationKind urgent
								receiver b							
								sender a 								
								modelElement "model.B.opB1"   								
							},
							
							// strict urgent b -> a.opA2()	
							strict ModalMessage {
								expectationKind urgent 
								receiver a
								sender b
								modelElement "model.A.opA2"
							}
						} 
					}
				}
			}
		}
	} 			
}