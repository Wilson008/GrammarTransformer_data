/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.xcore;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class XcoreStandaloneSetup extends XcoreStandaloneSetupGenerated {

	public static void doSetup() {
		new XcoreStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}