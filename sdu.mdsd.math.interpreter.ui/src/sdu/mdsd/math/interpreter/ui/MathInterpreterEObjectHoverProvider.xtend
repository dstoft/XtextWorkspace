package sdu.mdsd.math.interpreter.ui

import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.emf.ecore.EObject
import sdu.mdsd.math.interpreter.mathInterpreter.MathExp
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension sdu.mdsd.math.interpreter.generator.MathInterpreterGenerator.staticCompute
import org.eclipse.emf.ecore.util.Diagnostician

//import static extension sdu.mdsd.math.interpreter.generator.MathInterpreterGenerator.staticDisplay

class MathInterpreterEObjectHoverProvider extends DefaultEObjectHoverProvider {
//	@Inject extension MathInterpreterTypeComputer
//	@Inject extension MathInterpreter
	override getHoverInfoAsHtml(EObject o) {
		if (o instanceof MathExp && o.programHasNoError) {
		val exp = o as MathExp
		return '''
		<p>
		type : <b>int</b> <br>
		value : <b>«exp.staticCompute.toString»</b>
		</p>
		'''
		} else
		return super.getHoverInfoAsHtml(o)
	}
	def programHasNoError(EObject o) {
		Diagnostician.INSTANCE.validate(o.rootContainer).
		children.empty
	}
}