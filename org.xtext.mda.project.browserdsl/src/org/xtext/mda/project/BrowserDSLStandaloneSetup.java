/*
* generated by Xtext
*/
package org.xtext.mda.project;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BrowserDSLStandaloneSetup extends BrowserDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new BrowserDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

