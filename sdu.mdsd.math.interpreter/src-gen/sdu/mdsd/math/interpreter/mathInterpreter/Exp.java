/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.math.interpreter.mathInterpreter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.math.interpreter.mathInterpreter.Exp#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see sdu.mdsd.math.interpreter.mathInterpreter.MathInterpreterPackage#getExp()
 * @model
 * @generated
 */
public interface Exp extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Exp)
   * @see sdu.mdsd.math.interpreter.mathInterpreter.MathInterpreterPackage#getExp_Left()
   * @model containment="true"
   * @generated
   */
  Exp getLeft();

  /**
   * Sets the value of the '{@link sdu.mdsd.math.interpreter.mathInterpreter.Exp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Exp value);

} // Exp
