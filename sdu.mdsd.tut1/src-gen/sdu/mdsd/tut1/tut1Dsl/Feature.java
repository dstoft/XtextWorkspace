/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.tut1.tut1Dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.tut1.tut1Dsl.Feature#isMany <em>Many</em>}</li>
 *   <li>{@link sdu.mdsd.tut1.tut1Dsl.Feature#getName <em>Name</em>}</li>
 *   <li>{@link sdu.mdsd.tut1.tut1Dsl.Feature#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sdu.mdsd.tut1.tut1Dsl.Tut1DslPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(boolean)
   * @see sdu.mdsd.tut1.tut1Dsl.Tut1DslPackage#getFeature_Many()
   * @model
   * @generated
   */
  boolean isMany();

  /**
   * Sets the value of the '{@link sdu.mdsd.tut1.tut1Dsl.Feature#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #isMany()
   * @generated
   */
  void setMany(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sdu.mdsd.tut1.tut1Dsl.Tut1DslPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sdu.mdsd.tut1.tut1Dsl.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see sdu.mdsd.tut1.tut1Dsl.Tut1DslPackage#getFeature_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link sdu.mdsd.tut1.tut1Dsl.Feature#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Feature
