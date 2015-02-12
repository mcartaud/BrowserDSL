/**
 */
package org.xtext.mda.project.browserDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Click</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mda.project.browserDSL.Click#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage#getClick()
 * @model
 * @generated
 */
public interface Click extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(EObject)
   * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage#getClick_Val()
   * @model containment="true"
   * @generated
   */
  EObject getVal();

  /**
   * Sets the value of the '{@link org.xtext.mda.project.browserDSL.Click#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(EObject value);

} // Click
