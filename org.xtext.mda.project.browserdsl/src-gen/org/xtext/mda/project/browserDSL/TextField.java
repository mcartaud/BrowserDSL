/**
 */
package org.xtext.mda.project.browserDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mda.project.browserDSL.TextField#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.mda.project.browserDSL.TextField#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage#getTextField()
 * @model
 * @generated
 */
public interface TextField extends Instruction
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(CallType)
   * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage#getTextField_Id()
   * @model containment="true"
   * @generated
   */
  CallType getId();

  /**
   * Sets the value of the '{@link org.xtext.mda.project.browserDSL.TextField#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(CallType value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(TextAction)
   * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage#getTextField_Action()
   * @model containment="true"
   * @generated
   */
  TextAction getAction();

  /**
   * Sets the value of the '{@link org.xtext.mda.project.browserDSL.TextField#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(TextAction value);

} // TextField
