/**
 */
package org.xtext.mda.project.browserDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ProgramImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Browser</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__BROWSER = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Subroutines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__SUBROUTINES = 2;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__MAIN = 3;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.SubroutineImpl <em>Subroutine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.SubroutineImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getSubroutine()
   * @generated
   */
  int SUBROUTINE = 1;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBROUTINE__HEAD = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBROUTINE__BODY = 1;

  /**
   * The number of structural features of the '<em>Subroutine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBROUTINE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.SubBodyImpl <em>Sub Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.SubBodyImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getSubBody()
   * @generated
   */
  int SUB_BODY = 2;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BODY__INSTRUCTIONS = 0;

  /**
   * The number of structural features of the '<em>Sub Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.HeadImpl <em>Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.HeadImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getHead()
   * @generated
   */
  int HEAD = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD__NAME_PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FunctionNameImpl <em>Function Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FunctionNameImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFunctionName()
   * @generated
   */
  int FUNCTION_NAME = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Function Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.MainImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getMain()
   * @generated
   */
  int MAIN = 5;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__BODY = 0;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.BodyImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getBody()
   * @generated
   */
  int BODY = 6;

  /**
   * The feature id for the '<em><b>Go</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__GO = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__INSTRUCTIONS = 1;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.CallTypeImpl <em>Call Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.CallTypeImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCallType()
   * @generated
   */
  int CALL_TYPE = 10;

  /**
   * The number of structural features of the '<em>Call Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VariableImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 11;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = CALL_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VariableReferenceImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Var ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__VAR_ID = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FunctionReferenceImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFunctionReference()
   * @generated
   */
  int FUNCTION_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE__FUNCTION_NAME = 0;

  /**
   * The number of structural features of the '<em>Function Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.InstructionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 14;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FunctionCallImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 9;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__FUNCTION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__PARAMETERS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VariableNameImpl <em>Variable Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VariableNameImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableName()
   * @generated
   */
  int VARIABLE_NAME = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.DeclarationImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO__URL = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Go To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.CheckboxImpl <em>Checkbox</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.CheckboxImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckbox()
   * @generated
   */
  int CHECKBOX = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX__ID = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX__ACTION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Checkbox</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.LinkImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getLink()
   * @generated
   */
  int LINK = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__ID = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__ACTION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ButtonImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ID = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ACTION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ImageImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 19;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__ID = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__ACTION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.TextFieldImpl <em>Text Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.TextFieldImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getTextField()
   * @generated
   */
  int TEXT_FIELD = 20;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD__ID = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD__ACTION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Text Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.CheckboxActionImpl <em>Checkbox Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.CheckboxActionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckboxAction()
   * @generated
   */
  int CHECKBOX_ACTION = 21;

  /**
   * The feature id for the '<em><b>Check Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX_ACTION__CHECK_ACTION = 0;

  /**
   * The number of structural features of the '<em>Checkbox Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX_ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.LinkActionImpl <em>Link Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.LinkActionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getLinkAction()
   * @generated
   */
  int LINK_ACTION = 22;

  /**
   * The feature id for the '<em><b>Link Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_ACTION__LINK_ACTION = 0;

  /**
   * The number of structural features of the '<em>Link Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ButtonActionImpl <em>Button Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ButtonActionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getButtonAction()
   * @generated
   */
  int BUTTON_ACTION = 23;

  /**
   * The feature id for the '<em><b>Button Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ACTION__BUTTON_ACTION = 0;

  /**
   * The number of structural features of the '<em>Button Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ImageActionImpl <em>Image Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ImageActionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getImageAction()
   * @generated
   */
  int IMAGE_ACTION = 24;

  /**
   * The feature id for the '<em><b>Image Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ACTION__IMAGE_ACTION = 0;

  /**
   * The number of structural features of the '<em>Image Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.TextActionImpl <em>Text Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.TextActionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getTextAction()
   * @generated
   */
  int TEXT_ACTION = 25;

  /**
   * The feature id for the '<em><b>Taxt Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ACTION__TAXT_ACTION = 0;

  /**
   * The number of structural features of the '<em>Text Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ClickImpl <em>Click</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ClickImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClick()
   * @generated
   */
  int CLICK = 26;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK__VAL = 0;

  /**
   * The number of structural features of the '<em>Click</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.IsCheckImpl <em>Is Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.IsCheckImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getIsCheck()
   * @generated
   */
  int IS_CHECK = 27;

  /**
   * The feature id for the '<em><b>Check Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_CHECK__CHECK_ACTION = CHECKBOX_ACTION__CHECK_ACTION;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_CHECK__VAL = CHECKBOX_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Is Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_CHECK_FEATURE_COUNT = CHECKBOX_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ClearImpl <em>Clear</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ClearImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClear()
   * @generated
   */
  int CLEAR = 28;

  /**
   * The feature id for the '<em><b>Check Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR__CHECK_ACTION = CHECKBOX_ACTION__CHECK_ACTION;

  /**
   * The feature id for the '<em><b>Taxt Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR__TAXT_ACTION = CHECKBOX_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR__VAL = CHECKBOX_ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Clear</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_FEATURE_COUNT = CHECKBOX_ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.CheckValueImpl <em>Check Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.CheckValueImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckValue()
   * @generated
   */
  int CHECK_VALUE = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Check Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FillImpl <em>Fill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FillImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFill()
   * @generated
   */
  int FILL = 30;

  /**
   * The feature id for the '<em><b>Taxt Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__TAXT_ACTION = TEXT_ACTION__TAXT_ACTION;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__VALUE = TEXT_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_FEATURE_COUNT = TEXT_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ValuesImpl <em>Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ValuesImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getValues()
   * @generated
   */
  int VALUES = 31;

  /**
   * The number of structural features of the '<em>Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_FEATURE_COUNT = CALL_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.IntValueImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = VALUES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = VALUES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.StringValueImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 33;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = VALUES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = VALUES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.BooleanValueImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = VALUES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = VALUES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.Boolean <em>Boolean</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.Boolean
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getBoolean()
   * @generated
   */
  int BOOLEAN = 35;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.OpenBrowser <em>Open Browser</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.OpenBrowser
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getOpenBrowser()
   * @generated
   */
  int OPEN_BROWSER = 36;


  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.xtext.mda.project.browserDSL.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Program#getBrowser <em>Browser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Browser</em>'.
   * @see org.xtext.mda.project.browserDSL.Program#getBrowser()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Browser();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Program#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.xtext.mda.project.browserDSL.Program#getVariables()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Program#getSubroutines <em>Subroutines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subroutines</em>'.
   * @see org.xtext.mda.project.browserDSL.Program#getSubroutines()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Subroutines();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Program#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see org.xtext.mda.project.browserDSL.Program#getMain()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Main();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Subroutine <em>Subroutine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subroutine</em>'.
   * @see org.xtext.mda.project.browserDSL.Subroutine
   * @generated
   */
  EClass getSubroutine();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Subroutine#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see org.xtext.mda.project.browserDSL.Subroutine#getHead()
   * @see #getSubroutine()
   * @generated
   */
  EReference getSubroutine_Head();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Subroutine#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.mda.project.browserDSL.Subroutine#getBody()
   * @see #getSubroutine()
   * @generated
   */
  EReference getSubroutine_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.SubBody <em>Sub Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Body</em>'.
   * @see org.xtext.mda.project.browserDSL.SubBody
   * @generated
   */
  EClass getSubBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.SubBody#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see org.xtext.mda.project.browserDSL.SubBody#getInstructions()
   * @see #getSubBody()
   * @generated
   */
  EReference getSubBody_Instructions();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Head</em>'.
   * @see org.xtext.mda.project.browserDSL.Head
   * @generated
   */
  EClass getHead();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Head#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.mda.project.browserDSL.Head#getName()
   * @see #getHead()
   * @generated
   */
  EReference getHead_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Head#getNameParameters <em>Name Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name Parameters</em>'.
   * @see org.xtext.mda.project.browserDSL.Head#getNameParameters()
   * @see #getHead()
   * @generated
   */
  EReference getHead_NameParameters();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.FunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Name</em>'.
   * @see org.xtext.mda.project.browserDSL.FunctionName
   * @generated
   */
  EClass getFunctionName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.FunctionName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mda.project.browserDSL.FunctionName#getName()
   * @see #getFunctionName()
   * @generated
   */
  EAttribute getFunctionName_Name();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Main#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.mda.project.browserDSL.Main#getBody()
   * @see #getMain()
   * @generated
   */
  EReference getMain_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see org.xtext.mda.project.browserDSL.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Body#getGo <em>Go</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Go</em>'.
   * @see org.xtext.mda.project.browserDSL.Body#getGo()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Go();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Body#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see org.xtext.mda.project.browserDSL.Body#getInstructions()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Instructions();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see org.xtext.mda.project.browserDSL.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the reference '{@link org.xtext.mda.project.browserDSL.VariableReference#getVarID <em>Var ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var ID</em>'.
   * @see org.xtext.mda.project.browserDSL.VariableReference#getVarID()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_VarID();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.FunctionReference <em>Function Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Reference</em>'.
   * @see org.xtext.mda.project.browserDSL.FunctionReference
   * @generated
   */
  EClass getFunctionReference();

  /**
   * Returns the meta object for the reference '{@link org.xtext.mda.project.browserDSL.FunctionReference#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function Name</em>'.
   * @see org.xtext.mda.project.browserDSL.FunctionReference#getFunctionName()
   * @see #getFunctionReference()
   * @generated
   */
  EReference getFunctionReference_FunctionName();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see org.xtext.mda.project.browserDSL.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.FunctionCall#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.xtext.mda.project.browserDSL.FunctionCall#getFunction()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Function();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.FunctionCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.mda.project.browserDSL.FunctionCall#getParameters()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.CallType <em>Call Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Type</em>'.
   * @see org.xtext.mda.project.browserDSL.CallType
   * @generated
   */
  EClass getCallType();

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
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.VariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Name</em>'.
   * @see org.xtext.mda.project.browserDSL.VariableName
   * @generated
   */
  EClass getVariableName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.VariableName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mda.project.browserDSL.VariableName#getName()
   * @see #getVariableName()
   * @generated
   */
  EAttribute getVariableName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.xtext.mda.project.browserDSL.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Declaration#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.mda.project.browserDSL.Declaration#getVariable()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Declaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.Declaration#getValue()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see org.xtext.mda.project.browserDSL.Instruction
   * @generated
   */
  EClass getInstruction();

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
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.GoTo#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.xtext.mda.project.browserDSL.GoTo#getUrl()
   * @see #getGoTo()
   * @generated
   */
  EAttribute getGoTo_Url();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Checkbox#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.mda.project.browserDSL.Checkbox#getId()
   * @see #getCheckbox()
   * @generated
   */
  EReference getCheckbox_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Checkbox#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.xtext.mda.project.browserDSL.Checkbox#getAction()
   * @see #getCheckbox()
   * @generated
   */
  EReference getCheckbox_Action();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Link#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.mda.project.browserDSL.Link#getId()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Link#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.xtext.mda.project.browserDSL.Link#getAction()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Action();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Button#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.mda.project.browserDSL.Button#getId()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Button#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.xtext.mda.project.browserDSL.Button#getAction()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Action();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Image#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.mda.project.browserDSL.Image#getId()
   * @see #getImage()
   * @generated
   */
  EReference getImage_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Image#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.xtext.mda.project.browserDSL.Image#getAction()
   * @see #getImage()
   * @generated
   */
  EReference getImage_Action();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.TextField#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.mda.project.browserDSL.TextField#getId()
   * @see #getTextField()
   * @generated
   */
  EReference getTextField_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.TextField#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.xtext.mda.project.browserDSL.TextField#getAction()
   * @see #getTextField()
   * @generated
   */
  EReference getTextField_Action();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.CheckboxAction <em>Checkbox Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Checkbox Action</em>'.
   * @see org.xtext.mda.project.browserDSL.CheckboxAction
   * @generated
   */
  EClass getCheckboxAction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.CheckboxAction#getCheckAction <em>Check Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Check Action</em>'.
   * @see org.xtext.mda.project.browserDSL.CheckboxAction#getCheckAction()
   * @see #getCheckboxAction()
   * @generated
   */
  EReference getCheckboxAction_CheckAction();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.LinkAction <em>Link Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Action</em>'.
   * @see org.xtext.mda.project.browserDSL.LinkAction
   * @generated
   */
  EClass getLinkAction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.LinkAction#getLinkAction <em>Link Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link Action</em>'.
   * @see org.xtext.mda.project.browserDSL.LinkAction#getLinkAction()
   * @see #getLinkAction()
   * @generated
   */
  EReference getLinkAction_LinkAction();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.ButtonAction <em>Button Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Action</em>'.
   * @see org.xtext.mda.project.browserDSL.ButtonAction
   * @generated
   */
  EClass getButtonAction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.ButtonAction#getButtonAction <em>Button Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Button Action</em>'.
   * @see org.xtext.mda.project.browserDSL.ButtonAction#getButtonAction()
   * @see #getButtonAction()
   * @generated
   */
  EReference getButtonAction_ButtonAction();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.ImageAction <em>Image Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image Action</em>'.
   * @see org.xtext.mda.project.browserDSL.ImageAction
   * @generated
   */
  EClass getImageAction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.ImageAction#getImageAction <em>Image Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Image Action</em>'.
   * @see org.xtext.mda.project.browserDSL.ImageAction#getImageAction()
   * @see #getImageAction()
   * @generated
   */
  EReference getImageAction_ImageAction();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.TextAction <em>Text Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Action</em>'.
   * @see org.xtext.mda.project.browserDSL.TextAction
   * @generated
   */
  EClass getTextAction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.TextAction#getTaxtAction <em>Taxt Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Taxt Action</em>'.
   * @see org.xtext.mda.project.browserDSL.TextAction#getTaxtAction()
   * @see #getTextAction()
   * @generated
   */
  EReference getTextAction_TaxtAction();

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
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Click#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.mda.project.browserDSL.Click#getVal()
   * @see #getClick()
   * @generated
   */
  EAttribute getClick_Val();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.IsCheck <em>Is Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Check</em>'.
   * @see org.xtext.mda.project.browserDSL.IsCheck
   * @generated
   */
  EClass getIsCheck();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.IsCheck#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.mda.project.browserDSL.IsCheck#getVal()
   * @see #getIsCheck()
   * @generated
   */
  EAttribute getIsCheck_Val();

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
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Clear#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.mda.project.browserDSL.Clear#getVal()
   * @see #getClear()
   * @generated
   */
  EAttribute getClear_Val();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.CheckValue <em>Check Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Value</em>'.
   * @see org.xtext.mda.project.browserDSL.CheckValue
   * @generated
   */
  EClass getCheckValue();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.CheckValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.CheckValue#getValue()
   * @see #getCheckValue()
   * @generated
   */
  EReference getCheckValue_Value();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Fill#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.Fill#getValue()
   * @see #getFill()
   * @generated
   */
  EReference getFill_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Values <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values</em>'.
   * @see org.xtext.mda.project.browserDSL.Values
   * @generated
   */
  EClass getValues();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see org.xtext.mda.project.browserDSL.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.xtext.mda.project.browserDSL.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see org.xtext.mda.project.browserDSL.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for enum '{@link org.xtext.mda.project.browserDSL.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean</em>'.
   * @see org.xtext.mda.project.browserDSL.Boolean
   * @generated
   */
  EEnum getBoolean();

  /**
   * Returns the meta object for enum '{@link org.xtext.mda.project.browserDSL.OpenBrowser <em>Open Browser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Open Browser</em>'.
   * @see org.xtext.mda.project.browserDSL.OpenBrowser
   * @generated
   */
  EEnum getOpenBrowser();

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
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ProgramImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Browser</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__BROWSER = eINSTANCE.getProgram_Browser();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__VARIABLES = eINSTANCE.getProgram_Variables();

    /**
     * The meta object literal for the '<em><b>Subroutines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__SUBROUTINES = eINSTANCE.getProgram_Subroutines();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__MAIN = eINSTANCE.getProgram_Main();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.SubroutineImpl <em>Subroutine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.SubroutineImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getSubroutine()
     * @generated
     */
    EClass SUBROUTINE = eINSTANCE.getSubroutine();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBROUTINE__HEAD = eINSTANCE.getSubroutine_Head();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBROUTINE__BODY = eINSTANCE.getSubroutine_Body();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.SubBodyImpl <em>Sub Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.SubBodyImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getSubBody()
     * @generated
     */
    EClass SUB_BODY = eINSTANCE.getSubBody();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_BODY__INSTRUCTIONS = eINSTANCE.getSubBody_Instructions();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.HeadImpl <em>Head</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.HeadImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getHead()
     * @generated
     */
    EClass HEAD = eINSTANCE.getHead();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEAD__NAME = eINSTANCE.getHead_Name();

    /**
     * The meta object literal for the '<em><b>Name Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEAD__NAME_PARAMETERS = eINSTANCE.getHead_NameParameters();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.FunctionNameImpl <em>Function Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.FunctionNameImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFunctionName()
     * @generated
     */
    EClass FUNCTION_NAME = eINSTANCE.getFunctionName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_NAME__NAME = eINSTANCE.getFunctionName_Name();

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
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__BODY = eINSTANCE.getMain_Body();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.BodyImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Go</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__GO = eINSTANCE.getBody_Go();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__INSTRUCTIONS = eINSTANCE.getBody_Instructions();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.VariableReferenceImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableReference()
     * @generated
     */
    EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

    /**
     * The meta object literal for the '<em><b>Var ID</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REFERENCE__VAR_ID = eINSTANCE.getVariableReference_VarID();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.FunctionReferenceImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFunctionReference()
     * @generated
     */
    EClass FUNCTION_REFERENCE = eINSTANCE.getFunctionReference();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_REFERENCE__FUNCTION_NAME = eINSTANCE.getFunctionReference_FunctionName();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.FunctionCallImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__FUNCTION = eINSTANCE.getFunctionCall_Function();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__PARAMETERS = eINSTANCE.getFunctionCall_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.CallTypeImpl <em>Call Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.CallTypeImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCallType()
     * @generated
     */
    EClass CALL_TYPE = eINSTANCE.getCallType();

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
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.VariableNameImpl <em>Variable Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.VariableNameImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableName()
     * @generated
     */
    EClass VARIABLE_NAME = eINSTANCE.getVariableName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_NAME__NAME = eINSTANCE.getVariableName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.DeclarationImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__VARIABLE = eINSTANCE.getDeclaration_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__VALUE = eINSTANCE.getDeclaration_Value();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.InstructionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

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
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GO_TO__URL = eINSTANCE.getGoTo_Url();

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
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECKBOX__ID = eINSTANCE.getCheckbox_Id();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECKBOX__ACTION = eINSTANCE.getCheckbox_Action();

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
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__ID = eINSTANCE.getLink_Id();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__ACTION = eINSTANCE.getLink_Action();

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
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__ID = eINSTANCE.getButton_Id();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__ACTION = eINSTANCE.getButton_Action();

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
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE__ID = eINSTANCE.getImage_Id();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE__ACTION = eINSTANCE.getImage_Action();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.TextFieldImpl <em>Text Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.TextFieldImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getTextField()
     * @generated
     */
    EClass TEXT_FIELD = eINSTANCE.getTextField();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_FIELD__ID = eINSTANCE.getTextField_Id();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_FIELD__ACTION = eINSTANCE.getTextField_Action();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.CheckboxActionImpl <em>Checkbox Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.CheckboxActionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckboxAction()
     * @generated
     */
    EClass CHECKBOX_ACTION = eINSTANCE.getCheckboxAction();

    /**
     * The meta object literal for the '<em><b>Check Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECKBOX_ACTION__CHECK_ACTION = eINSTANCE.getCheckboxAction_CheckAction();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.LinkActionImpl <em>Link Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.LinkActionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getLinkAction()
     * @generated
     */
    EClass LINK_ACTION = eINSTANCE.getLinkAction();

    /**
     * The meta object literal for the '<em><b>Link Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_ACTION__LINK_ACTION = eINSTANCE.getLinkAction_LinkAction();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ButtonActionImpl <em>Button Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ButtonActionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getButtonAction()
     * @generated
     */
    EClass BUTTON_ACTION = eINSTANCE.getButtonAction();

    /**
     * The meta object literal for the '<em><b>Button Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON_ACTION__BUTTON_ACTION = eINSTANCE.getButtonAction_ButtonAction();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ImageActionImpl <em>Image Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ImageActionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getImageAction()
     * @generated
     */
    EClass IMAGE_ACTION = eINSTANCE.getImageAction();

    /**
     * The meta object literal for the '<em><b>Image Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_ACTION__IMAGE_ACTION = eINSTANCE.getImageAction_ImageAction();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.TextActionImpl <em>Text Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.TextActionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getTextAction()
     * @generated
     */
    EClass TEXT_ACTION = eINSTANCE.getTextAction();

    /**
     * The meta object literal for the '<em><b>Taxt Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_ACTION__TAXT_ACTION = eINSTANCE.getTextAction_TaxtAction();

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
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLICK__VAL = eINSTANCE.getClick_Val();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.IsCheckImpl <em>Is Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.IsCheckImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getIsCheck()
     * @generated
     */
    EClass IS_CHECK = eINSTANCE.getIsCheck();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_CHECK__VAL = eINSTANCE.getIsCheck_Val();

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
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLEAR__VAL = eINSTANCE.getClear_Val();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.CheckValueImpl <em>Check Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.CheckValueImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckValue()
     * @generated
     */
    EClass CHECK_VALUE = eINSTANCE.getCheckValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_VALUE__VALUE = eINSTANCE.getCheckValue_Value();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__VALUE = eINSTANCE.getFill_Value();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ValuesImpl <em>Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ValuesImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getValues()
     * @generated
     */
    EClass VALUES = eINSTANCE.getValues();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.IntValueImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getIntValue()
     * @generated
     */
    EClass INT_VALUE = eINSTANCE.getIntValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.StringValueImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.BooleanValueImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.Boolean <em>Boolean</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.Boolean
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getBoolean()
     * @generated
     */
    EEnum BOOLEAN = eINSTANCE.getBoolean();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.OpenBrowser <em>Open Browser</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.OpenBrowser
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getOpenBrowser()
     * @generated
     */
    EEnum OPEN_BROWSER = eINSTANCE.getOpenBrowser();

  }

} //BrowserDSLPackage
