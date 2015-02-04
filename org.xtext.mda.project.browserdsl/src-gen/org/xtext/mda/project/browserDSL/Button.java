/**
 */
package org.xtext.mda.project.browserDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mda.project.browserDSL.Button#getBut <em>But</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends ClickableElement
{
  /**
   * Returns the value of the '<em><b>But</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>But</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>But</em>' attribute.
   * @see #setBut(String)
   * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage#getButton_But()
   * @model
   * @generated
   */
  String getBut();

  /**
   * Sets the value of the '{@link org.xtext.mda.project.browserDSL.Button#getBut <em>But</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>But</em>' attribute.
   * @see #getBut()
   * @generated
   */
  void setBut(String value);

} // Button
