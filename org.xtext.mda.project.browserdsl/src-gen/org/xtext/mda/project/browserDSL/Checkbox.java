/**
 */
package org.xtext.mda.project.browserDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkbox</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mda.project.browserDSL.Checkbox#getCheck <em>Check</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage#getCheckbox()
 * @model
 * @generated
 */
public interface Checkbox extends CheckableElement
{
  /**
   * Returns the value of the '<em><b>Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check</em>' attribute.
   * @see #setCheck(String)
   * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage#getCheckbox_Check()
   * @model
   * @generated
   */
  String getCheck();

  /**
   * Sets the value of the '{@link org.xtext.mda.project.browserDSL.Checkbox#getCheck <em>Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Check</em>' attribute.
   * @see #getCheck()
   * @generated
   */
  void setCheck(String value);

} // Checkbox
