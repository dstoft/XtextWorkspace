/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.math.interpreter.mathInterpreter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sdu.mdsd.math.interpreter.mathInterpreter.MathInterpreterFactory
 * @model kind="package"
 * @generated
 */
public interface MathInterpreterPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mathInterpreter";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mdsd.sdu/math/interpreter/MathInterpreter";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mathInterpreter";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MathInterpreterPackage eINSTANCE = sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl.init();

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.MathExpImpl <em>Math Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathExpImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getMathExp()
   * @generated
   */
  int MATH_EXP = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP__EXP = 0;

  /**
   * The number of structural features of the '<em>Math Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.ExpImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getExp()
   * @generated
   */
  int EXP = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__LEFT = 0;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.ExpOpImpl <em>Exp Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.ExpOpImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getExpOp()
   * @generated
   */
  int EXP_OP = 2;

  /**
   * The number of structural features of the '<em>Exp Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_OP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.FactorOpImpl <em>Factor Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.FactorOpImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getFactorOp()
   * @generated
   */
  int FACTOR_OP = 3;

  /**
   * The number of structural features of the '<em>Factor Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_OP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.ParenthesisImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getParenthesis()
   * @generated
   */
  int PARENTHESIS = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS__EXP = EXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parenthesis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.NumberImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__VALUE = EXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.BasicExpImpl <em>Basic Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.BasicExpImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getBasicExp()
   * @generated
   */
  int BASIC_EXP = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXP__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXP__OPERATOR = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXP__RIGHT = EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Basic Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.PlusImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 7;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXP_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MinusImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 8;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXP_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.FactorExpImpl <em>Factor Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.FactorExpImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getFactorExp()
   * @generated
   */
  int FACTOR_EXP = 9;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_EXP__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_EXP__OPERATOR = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_EXP__RIGHT = EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Factor Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.MultImpl <em>Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MultImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getMult()
   * @generated
   */
  int MULT = 10;

  /**
   * The number of structural features of the '<em>Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_FEATURE_COUNT = FACTOR_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.DivImpl
   * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getDiv()
   * @generated
   */
  int DIV = 11;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = FACTOR_OP_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.MathExp <em>Math Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Math Exp</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.MathExp
   * @generated
   */
  EClass getMathExp();

  /**
   * Returns the meta object for the containment reference '{@link sdu.mdsd.math.interpreter.mathInterpreter.MathExp#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.MathExp#getExp()
   * @see #getMathExp()
   * @generated
   */
  EReference getMathExp_Exp();

  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.Exp
   * @generated
   */
  EClass getExp();

  /**
   * Returns the meta object for the containment reference '{@link sdu.mdsd.math.interpreter.mathInterpreter.Exp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.Exp#getLeft()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Left();

  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.ExpOp <em>Exp Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp Op</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.ExpOp
   * @generated
   */
  EClass getExpOp();

  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.FactorOp <em>Factor Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor Op</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.FactorOp
   * @generated
   */
  EClass getFactorOp();

  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.Parenthesis <em>Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesis</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.Parenthesis
   * @generated
   */
  EClass getParenthesis();

  /**
   * Returns the meta object for the containment reference '{@link sdu.mdsd.math.interpreter.mathInterpreter.Parenthesis#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.Parenthesis#getExp()
   * @see #getParenthesis()
   * @generated
   */
  EReference getParenthesis_Exp();

  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for the attribute '{@link sdu.mdsd.math.interpreter.mathInterpreter.Number#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.Number#getValue()
   * @see #getNumber()
   * @generated
   */
  EAttribute getNumber_Value();

  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.BasicExp <em>Basic Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Exp</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.BasicExp
   * @generated
   */
  EClass getBasicExp();

  /**
   * Returns the meta object for the containment reference '{@link sdu.mdsd.math.interpreter.mathInterpreter.BasicExp#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.BasicExp#getOperator()
   * @see #getBasicExp()
   * @generated
   */
  EReference getBasicExp_Operator();

  /**
   * Returns the meta object for the containment reference '{@link sdu.mdsd.math.interpreter.mathInterpreter.BasicExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.BasicExp#getRight()
   * @see #getBasicExp()
   * @generated
   */
  EReference getBasicExp_Right();

  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.FactorExp <em>Factor Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor Exp</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.FactorExp
   * @generated
   */
  EClass getFactorExp();

  /**
   * Returns the meta object for the containment reference '{@link sdu.mdsd.math.interpreter.mathInterpreter.FactorExp#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.FactorExp#getOperator()
   * @see #getFactorExp()
   * @generated
   */
  EReference getFactorExp_Operator();

  /**
   * Returns the meta object for the containment reference '{@link sdu.mdsd.math.interpreter.mathInterpreter.FactorExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.FactorExp#getRight()
   * @see #getFactorExp()
   * @generated
   */
  EReference getFactorExp_Right();

  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.Mult <em>Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mult</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.Mult
   * @generated
   */
  EClass getMult();

  /**
   * Returns the meta object for class '{@link sdu.mdsd.math.interpreter.mathInterpreter.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see sdu.mdsd.math.interpreter.mathInterpreter.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MathInterpreterFactory getMathInterpreterFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.MathExpImpl <em>Math Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathExpImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getMathExp()
     * @generated
     */
    EClass MATH_EXP = eINSTANCE.getMathExp();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATH_EXP__EXP = eINSTANCE.getMathExp_Exp();

    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.ExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.ExpImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getExp()
     * @generated
     */
    EClass EXP = eINSTANCE.getExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__LEFT = eINSTANCE.getExp_Left();

    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.ExpOpImpl <em>Exp Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.ExpOpImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getExpOp()
     * @generated
     */
    EClass EXP_OP = eINSTANCE.getExpOp();

    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.FactorOpImpl <em>Factor Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.FactorOpImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getFactorOp()
     * @generated
     */
    EClass FACTOR_OP = eINSTANCE.getFactorOp();

    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.ParenthesisImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getParenthesis()
     * @generated
     */
    EClass PARENTHESIS = eINSTANCE.getParenthesis();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIS__EXP = eINSTANCE.getParenthesis_Exp();

    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.NumberImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getNumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getNumber();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.BasicExpImpl <em>Basic Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.BasicExpImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getBasicExp()
     * @generated
     */
    EClass BASIC_EXP = eINSTANCE.getBasicExp();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_EXP__OPERATOR = eINSTANCE.getBasicExp_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_EXP__RIGHT = eINSTANCE.getBasicExp_Right();

    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.PlusImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MinusImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.FactorExpImpl <em>Factor Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.FactorExpImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getFactorExp()
     * @generated
     */
    EClass FACTOR_EXP = eINSTANCE.getFactorExp();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR_EXP__OPERATOR = eINSTANCE.getFactorExp_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR_EXP__RIGHT = eINSTANCE.getFactorExp_Right();

    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.MultImpl <em>Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MultImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getMult()
     * @generated
     */
    EClass MULT = eINSTANCE.getMult();

    /**
     * The meta object literal for the '{@link sdu.mdsd.math.interpreter.mathInterpreter.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.DivImpl
     * @see sdu.mdsd.math.interpreter.mathInterpreter.impl.MathInterpreterPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

  }

} //MathInterpreterPackage
