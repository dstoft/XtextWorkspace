/*
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.tut1;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Tut1DslStandaloneSetup extends Tut1DslStandaloneSetupGenerated {

	public static void doSetup() {
		new Tut1DslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
