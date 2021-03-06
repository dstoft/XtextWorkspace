/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.tut1.tut1Dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.tut1.tut1Dsl.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link sdu.mdsd.tut1.tut1Dsl.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see sdu.mdsd.tut1.tut1Dsl.Tut1DslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Type
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Entity)
   * @see sdu.mdsd.tut1.tut1Dsl.Tut1DslPackage#getEntity_SuperType()
   * @model
   * @generated
   */
  Entity getSuperType();

  /**
   * Sets the value of the '{@link sdu.mdsd.tut1.tut1Dsl.Entity#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Entity value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link sdu.mdsd.tut1.tut1Dsl.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see sdu.mdsd.tut1.tut1Dsl.Tut1DslPackage#getEntity_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Entity
