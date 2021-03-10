/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.tut1.tut1Dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.tut1.tut1Dsl.Domainmodel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see sdu.mdsd.tut1.tut1Dsl.Tut1DslPackage#getDomainmodel()
 * @model
 * @generated
 */
public interface Domainmodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link sdu.mdsd.tut1.tut1Dsl.AbstractElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see sdu.mdsd.tut1.tut1Dsl.Tut1DslPackage#getDomainmodel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // Domainmodel
