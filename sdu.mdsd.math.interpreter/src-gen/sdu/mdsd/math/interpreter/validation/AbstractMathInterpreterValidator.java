/*
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.math.interpreter.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMathInterpreterValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(sdu.mdsd.math.interpreter.mathInterpreter.MathInterpreterPackage.eINSTANCE);
		return result;
	}
}
