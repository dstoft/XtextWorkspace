/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.math.interpreter.mathInterpreter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sdu.mdsd.math.interpreter.mathInterpreter.BasicExp;
import sdu.mdsd.math.interpreter.mathInterpreter.Div;
import sdu.mdsd.math.interpreter.mathInterpreter.Exp;
import sdu.mdsd.math.interpreter.mathInterpreter.ExpOp;
import sdu.mdsd.math.interpreter.mathInterpreter.FactorExp;
import sdu.mdsd.math.interpreter.mathInterpreter.FactorOp;
import sdu.mdsd.math.interpreter.mathInterpreter.MathExp;
import sdu.mdsd.math.interpreter.mathInterpreter.MathInterpreterFactory;
import sdu.mdsd.math.interpreter.mathInterpreter.MathInterpreterPackage;
import sdu.mdsd.math.interpreter.mathInterpreter.Minus;
import sdu.mdsd.math.interpreter.mathInterpreter.Mult;
import sdu.mdsd.math.interpreter.mathInterpreter.Parenthesis;
import sdu.mdsd.math.interpreter.mathInterpreter.Plus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathInterpreterFactoryImpl extends EFactoryImpl implements MathInterpreterFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MathInterpreterFactory init()
  {
    try
    {
      MathInterpreterFactory theMathInterpreterFactory = (MathInterpreterFactory)EPackage.Registry.INSTANCE.getEFactory(MathInterpreterPackage.eNS_URI);
      if (theMathInterpreterFactory != null)
      {
        return theMathInterpreterFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MathInterpreterFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathInterpreterFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MathInterpreterPackage.MATH_EXP: return createMathExp();
      case MathInterpreterPackage.EXP: return createExp();
      case MathInterpreterPackage.EXP_OP: return createExpOp();
      case MathInterpreterPackage.FACTOR_OP: return createFactorOp();
      case MathInterpreterPackage.PARENTHESIS: return createParenthesis();
      case MathInterpreterPackage.NUMBER: return createNumber();
      case MathInterpreterPackage.BASIC_EXP: return createBasicExp();
      case MathInterpreterPackage.PLUS: return createPlus();
      case MathInterpreterPackage.MINUS: return createMinus();
      case MathInterpreterPackage.FACTOR_EXP: return createFactorExp();
      case MathInterpreterPackage.MULT: return createMult();
      case MathInterpreterPackage.DIV: return createDiv();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathExp createMathExp()
  {
    MathExpImpl mathExp = new MathExpImpl();
    return mathExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exp createExp()
  {
    ExpImpl exp = new ExpImpl();
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpOp createExpOp()
  {
    ExpOpImpl expOp = new ExpOpImpl();
    return expOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FactorOp createFactorOp()
  {
    FactorOpImpl factorOp = new FactorOpImpl();
    return factorOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parenthesis createParenthesis()
  {
    ParenthesisImpl parenthesis = new ParenthesisImpl();
    return parenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public sdu.mdsd.math.interpreter.mathInterpreter.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BasicExp createBasicExp()
  {
    BasicExpImpl basicExp = new BasicExpImpl();
    return basicExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FactorExp createFactorExp()
  {
    FactorExpImpl factorExp = new FactorExpImpl();
    return factorExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathInterpreterPackage getMathInterpreterPackage()
  {
    return (MathInterpreterPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MathInterpreterPackage getPackage()
  {
    return MathInterpreterPackage.eINSTANCE;
  }

} //MathInterpreterFactoryImpl
