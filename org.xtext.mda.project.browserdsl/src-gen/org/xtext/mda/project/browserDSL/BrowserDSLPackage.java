/**
 */
package org.xtext.mda.project.browserDSL;

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
 * @see org.xtext.mda.project.browserDSL.BrowserDSLFactory
 * @model kind="package"
 * @generated
 */
public interface BrowserDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "browserDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/mda/project/BrowserDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "browserDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BrowserDSLPackage eINSTANCE = org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ModelImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAIN = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.SubRoutineImpl <em>Sub Routine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.SubRoutineImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getSubRoutine()
   * @generated
   */
  int SUB_ROUTINE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ROUTINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ROUTINE__ACTION = 1;

  /**
   * The number of structural features of the '<em>Sub Routine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ROUTINE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.MainImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getMain()
   * @generated
   */
  int MAIN = 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__ACTIONS = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__ACTION = 1;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ActionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getAction()
   * @generated
   */
  int ACTION = 3;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.SubRoutineCallImpl <em>Sub Routine Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.SubRoutineCallImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getSubRoutineCall()
   * @generated
   */
  int SUB_ROUTINE_CALL = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ROUTINE_CALL__ID = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sub Routine Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ROUTINE_CALL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ListImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getList()
   * @generated
   */
  int LIST = 5;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ExistImpl <em>Exist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ExistImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getExist()
   * @generated
   */
  int EXIST = 14;

  /**
   * The number of structural features of the '<em>Exist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIST_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ElementImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 6;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = EXIST_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ClickableElementImpl <em>Clickable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ClickableElementImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClickableElement()
   * @generated
   */
  int CLICKABLE_ELEMENT = 7;

  /**
   * The number of structural features of the '<em>Clickable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICKABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FillableElementImpl <em>Fillable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FillableElementImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFillableElement()
   * @generated
   */
  int FILLABLE_ELEMENT = 8;

  /**
   * The number of structural features of the '<em>Fillable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILLABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.CheckableElementImpl <em>Checkable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.CheckableElementImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckableElement()
   * @generated
   */
  int CHECKABLE_ELEMENT = 9;

  /**
   * The number of structural features of the '<em>Checkable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ClickImpl <em>Click</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ClickImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClick()
   * @generated
   */
  int CLICK = 10;

  /**
   * The number of structural features of the '<em>Click</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FillImpl <em>Fill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FillImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFill()
   * @generated
   */
  int FILL = 11;

  /**
   * The number of structural features of the '<em>Fill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ClearImpl <em>Clear</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ClearImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClear()
   * @generated
   */
  int CLEAR = 12;

  /**
   * The number of structural features of the '<em>Clear</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VerifyImpl <em>Verify</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VerifyImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVerify()
   * @generated
   */
  int VERIFY = 13;

  /**
   * The number of structural features of the '<em>Verify</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.GoToImpl <em>Go To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.GoToImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getGoTo()
   * @generated
   */
  int GO_TO = 15;

  /**
   * The number of structural features of the '<em>Go To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.CheckboxImpl <em>Checkbox</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.CheckboxImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckbox()
   * @generated
   */
  int CHECKBOX = 20;

  /**
   * The number of structural features of the '<em>Checkbox</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX_FEATURE_COUNT = CHECKABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VariableImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = CHECKBOX_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = CHECKBOX_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VariableStringImpl <em>Variable String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VariableStringImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableString()
   * @generated
   */
  int VARIABLE_STRING = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_STRING__NAME = VARIABLE__NAME;

  /**
   * The number of structural features of the '<em>Variable String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_STRING_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VariableUrlImpl <em>Variable Url</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VariableUrlImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableUrl()
   * @generated
   */
  int VARIABLE_URL = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_URL__NAME = GO_TO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Url</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_URL_FEATURE_COUNT = GO_TO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VariableListImpl <em>Variable List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VariableListImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableList()
   * @generated
   */
  int VARIABLE_LIST = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST__VALUE = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.LinkImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getLink()
   * @generated
   */
  int LINK = 21;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = CLICKABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ButtonImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 22;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = CLICKABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ImageImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 23;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = CLICKABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.TextFieldImpl <em>Text Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.TextFieldImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getTextField()
   * @generated
   */
  int TEXT_FIELD = 24;

  /**
   * The number of structural features of the '<em>Text Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD_FEATURE_COUNT = FILLABLE_ELEMENT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.mda.project.browserDSL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Model#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see org.xtext.mda.project.browserDSL.Model#getMain()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Main();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.SubRoutine <em>Sub Routine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Routine</em>'.
   * @see org.xtext.mda.project.browserDSL.SubRoutine
   * @generated
   */
  EClass getSubRoutine();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.SubRoutine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mda.project.browserDSL.SubRoutine#getName()
   * @see #getSubRoutine()
   * @generated
   */
  EAttribute getSubRoutine_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.SubRoutine#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action</em>'.
   * @see org.xtext.mda.project.browserDSL.SubRoutine#getAction()
   * @see #getSubRoutine()
   * @generated
   */
  EReference getSubRoutine_Action();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see org.xtext.mda.project.browserDSL.Main
   * @generated
   */
  EClass getMain();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Main#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.xtext.mda.project.browserDSL.Main#getActions()
   * @see #getMain()
   * @generated
   */
  EReference getMain_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Main#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action</em>'.
   * @see org.xtext.mda.project.browserDSL.Main#getAction()
   * @see #getMain()
   * @generated
   */
  EReference getMain_Action();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.xtext.mda.project.browserDSL.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.SubRoutineCall <em>Sub Routine Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Routine Call</em>'.
   * @see org.xtext.mda.project.browserDSL.SubRoutineCall
   * @generated
   */
  EClass getSubRoutineCall();

  /**
   * Returns the meta object for the reference '{@link org.xtext.mda.project.browserDSL.SubRoutineCall#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Id</em>'.
   * @see org.xtext.mda.project.browserDSL.SubRoutineCall#getId()
   * @see #getSubRoutineCall()
   * @generated
   */
  EReference getSubRoutineCall_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see org.xtext.mda.project.browserDSL.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.List#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see org.xtext.mda.project.browserDSL.List#getElement()
   * @see #getList()
   * @generated
   */
  EReference getList_Element();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.xtext.mda.project.browserDSL.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.ClickableElement <em>Clickable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clickable Element</em>'.
   * @see org.xtext.mda.project.browserDSL.ClickableElement
   * @generated
   */
  EClass getClickableElement();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.FillableElement <em>Fillable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fillable Element</em>'.
   * @see org.xtext.mda.project.browserDSL.FillableElement
   * @generated
   */
  EClass getFillableElement();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.CheckableElement <em>Checkable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Checkable Element</em>'.
   * @see org.xtext.mda.project.browserDSL.CheckableElement
   * @generated
   */
  EClass getCheckableElement();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Click <em>Click</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Click</em>'.
   * @see org.xtext.mda.project.browserDSL.Click
   * @generated
   */
  EClass getClick();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Fill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fill</em>'.
   * @see org.xtext.mda.project.browserDSL.Fill
   * @generated
   */
  EClass getFill();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Clear <em>Clear</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clear</em>'.
   * @see org.xtext.mda.project.browserDSL.Clear
   * @generated
   */
  EClass getClear();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Verify <em>Verify</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verify</em>'.
   * @see org.xtext.mda.project.browserDSL.Verify
   * @generated
   */
  EClass getVerify();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Exist <em>Exist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exist</em>'.
   * @see org.xtext.mda.project.browserDSL.Exist
   * @generated
   */
  EClass getExist();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.GoTo <em>Go To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Go To</em>'.
   * @see org.xtext.mda.project.browserDSL.GoTo
   * @generated
   */
  EClass getGoTo();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.mda.project.browserDSL.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mda.project.browserDSL.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.VariableString <em>Variable String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable String</em>'.
   * @see org.xtext.mda.project.browserDSL.VariableString
   * @generated
   */
  EClass getVariableString();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.VariableUrl <em>Variable Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Url</em>'.
   * @see org.xtext.mda.project.browserDSL.VariableUrl
   * @generated
   */
  EClass getVariableUrl();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.VariableList <em>Variable List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable List</em>'.
   * @see org.xtext.mda.project.browserDSL.VariableList
   * @generated
   */
  EClass getVariableList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.VariableList#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.VariableList#getValue()
   * @see #getVariableList()
   * @generated
   */
  EReference getVariableList_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Checkbox <em>Checkbox</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Checkbox</em>'.
   * @see org.xtext.mda.project.browserDSL.Checkbox
   * @generated
   */
  EClass getCheckbox();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see org.xtext.mda.project.browserDSL.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see org.xtext.mda.project.browserDSL.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see org.xtext.mda.project.browserDSL.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.TextField <em>Text Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Field</em>'.
   * @see org.xtext.mda.project.browserDSL.TextField
   * @generated
   */
  EClass getTextField();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BrowserDSLFactory getBrowserDSLFactory();

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
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ModelImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAIN = eINSTANCE.getModel_Main();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.SubRoutineImpl <em>Sub Routine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.SubRoutineImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getSubRoutine()
     * @generated
     */
    EClass SUB_ROUTINE = eINSTANCE.getSubRoutine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_ROUTINE__NAME = eINSTANCE.getSubRoutine_Name();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_ROUTINE__ACTION = eINSTANCE.getSubRoutine_Action();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.MainImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__ACTIONS = eINSTANCE.getMain_Actions();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__ACTION = eINSTANCE.getMain_Action();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ActionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.SubRoutineCallImpl <em>Sub Routine Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.SubRoutineCallImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getSubRoutineCall()
     * @generated
     */
    EClass SUB_ROUTINE_CALL = eINSTANCE.getSubRoutineCall();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_ROUTINE_CALL__ID = eINSTANCE.getSubRoutineCall_Id();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ListImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getList()
     * @generated
     */
    EClass LIST = eINSTANCE.getList();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST__ELEMENT = eINSTANCE.getList_Element();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ElementImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ClickableElementImpl <em>Clickable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ClickableElementImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClickableElement()
     * @generated
     */
    EClass CLICKABLE_ELEMENT = eINSTANCE.getClickableElement();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.FillableElementImpl <em>Fillable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.FillableElementImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFillableElement()
     * @generated
     */
    EClass FILLABLE_ELEMENT = eINSTANCE.getFillableElement();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.CheckableElementImpl <em>Checkable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.CheckableElementImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckableElement()
     * @generated
     */
    EClass CHECKABLE_ELEMENT = eINSTANCE.getCheckableElement();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ClickImpl <em>Click</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ClickImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClick()
     * @generated
     */
    EClass CLICK = eINSTANCE.getClick();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.FillImpl <em>Fill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.FillImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFill()
     * @generated
     */
    EClass FILL = eINSTANCE.getFill();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ClearImpl <em>Clear</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ClearImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClear()
     * @generated
     */
    EClass CLEAR = eINSTANCE.getClear();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.VerifyImpl <em>Verify</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.VerifyImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVerify()
     * @generated
     */
    EClass VERIFY = eINSTANCE.getVerify();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ExistImpl <em>Exist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ExistImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getExist()
     * @generated
     */
    EClass EXIST = eINSTANCE.getExist();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.GoToImpl <em>Go To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.GoToImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getGoTo()
     * @generated
     */
    EClass GO_TO = eINSTANCE.getGoTo();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.VariableImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.VariableStringImpl <em>Variable String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.VariableStringImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableString()
     * @generated
     */
    EClass VARIABLE_STRING = eINSTANCE.getVariableString();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.VariableUrlImpl <em>Variable Url</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.VariableUrlImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableUrl()
     * @generated
     */
    EClass VARIABLE_URL = eINSTANCE.getVariableUrl();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.VariableListImpl <em>Variable List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.VariableListImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableList()
     * @generated
     */
    EClass VARIABLE_LIST = eINSTANCE.getVariableList();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_LIST__VALUE = eINSTANCE.getVariableList_Value();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.CheckboxImpl <em>Checkbox</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.CheckboxImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckbox()
     * @generated
     */
    EClass CHECKBOX = eINSTANCE.getCheckbox();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.LinkImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ButtonImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ImageImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.TextFieldImpl <em>Text Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.TextFieldImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getTextField()
     * @generated
     */
    EClass TEXT_FIELD = eINSTANCE.getTextField();

  }

} //BrowserDSLPackage
