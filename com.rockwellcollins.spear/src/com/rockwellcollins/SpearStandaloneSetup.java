/*
 * generated by Xtext
 */
package com.rockwellcollins;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SpearStandaloneSetup extends SpearStandaloneSetupGenerated{

	public static void doSetup() {
		new SpearStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

