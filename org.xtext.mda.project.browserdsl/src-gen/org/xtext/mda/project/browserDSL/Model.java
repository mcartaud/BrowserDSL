/**
 */
package org.xtext.mda.project.browserDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mda.project.browserDSL.Model#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mda.project.browserDSL.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage#getModel_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // Model
