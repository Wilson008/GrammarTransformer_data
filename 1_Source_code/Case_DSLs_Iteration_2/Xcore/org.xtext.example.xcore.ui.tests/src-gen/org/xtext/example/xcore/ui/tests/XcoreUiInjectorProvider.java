/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.xcore.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.xcore.ui.internal.XcoreActivator;

public class XcoreUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XcoreActivator.getInstance().getInjector("org.xtext.example.xcore.Xcore");
	}

}