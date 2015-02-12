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
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ProgramImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__SUB = 0;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__MAIN = 1;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
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
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.HeadImpl <em>Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.HeadImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getHead()
   * @generated
   */
  int HEAD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD__NAME = 0;

  /**
   * The feature id for the '<em><b>Var Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD__VAR_ID = 1;

  /**
   * The number of structural features of the '<em>Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FunctionCallImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 5;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FunctionReferenceImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFunctionReference()
   * @generated
   */
  int FUNCTION_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE__FUNCTION_NAME = FUNCTION_CALL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE__VAR = FUNCTION_CALL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE_FEATURE_COUNT = FUNCTION_CALL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VariableReferenceImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 4;

  /**
   * The feature id for the '<em><b>Var ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__VAR_ID = 0;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FunctionNameImpl <em>Function Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FunctionNameImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFunctionName()
   * @generated
   */
  int FUNCTION_NAME = 6;

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
  int MAIN = 7;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.BodyImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getBody()
   * @generated
   */
  int BODY = 8;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__INSTRUCTIONS = MAIN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = MAIN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.InstructionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 9;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__DEC = 0;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__COND = 1;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__WHILE = 2;

  /**
   * The feature id for the '<em><b>Act</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__ACT = 3;

  /**
   * The feature id for the '<em><b>Ass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__ASS = 4;

  /**
   * The feature id for the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__SUB = 5;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ConditionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 10;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__EXP = 0;

  /**
   * The feature id for the '<em><b>Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__INS = 1;

  /**
   * The feature id for the '<em><b>Ins2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__INS2 = 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.WhileImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 11;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__EXP = 0;

  /**
   * The feature id for the '<em><b>Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__INS = 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ActionInstructionImpl <em>Action Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ActionInstructionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getActionInstruction()
   * @generated
   */
  int ACTION_INSTRUCTION = 12;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_INSTRUCTION__ACTION = 0;

  /**
   * The number of structural features of the '<em>Action Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_INSTRUCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VariableNameImpl <em>Variable Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VariableNameImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariableName()
   * @generated
   */
  int VARIABLE_NAME = 13;

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
  int DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VAL = 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.AssignationImpl <em>Assignation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.AssignationImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getAssignation()
   * @generated
   */
  int ASSIGNATION = 15;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION__VAR = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION__EXPR = 1;

  /**
   * The number of structural features of the '<em>Assignation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ExpressionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VAR = 1;

  /**
   * The feature id for the '<em><b>Act</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ACT = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = 3;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 4;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXP = 5;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ElementImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 19;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.CheckableElementImpl <em>Checkable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.CheckableElementImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckableElement()
   * @generated
   */
  int CHECKABLE_ELEMENT = 22;

  /**
   * The number of structural features of the '<em>Checkable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.CheckboxImpl <em>Checkbox</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.CheckboxImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckbox()
   * @generated
   */
  int CHECKBOX = 23;

  /**
   * The feature id for the '<em><b>Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX__CHECK = CHECKABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Checkbox</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX_FEATURE_COUNT = CHECKABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VariableImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 17;

  /**
   * The feature id for the '<em><b>Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__CHECK = CHECKBOX__CHECK;

  /**
   * The feature id for the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__LINK = CHECKBOX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>But</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__BUT = CHECKBOX_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Img</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__IMG = CHECKBOX_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TEXT = CHECKBOX_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VAR = CHECKBOX_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = CHECKBOX_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ActionExpressionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getActionExpression()
   * @generated
   */
  int ACTION_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EXPRESSION__EXPR = 0;

  /**
   * The number of structural features of the '<em>Action Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ClickableElementImpl <em>Clickable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ClickableElementImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClickableElement()
   * @generated
   */
  int CLICKABLE_ELEMENT = 20;

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
  int FILLABLE_ELEMENT = 21;

  /**
   * The number of structural features of the '<em>Fillable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILLABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.LinkImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getLink()
   * @generated
   */
  int LINK = 24;

  /**
   * The feature id for the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__LINK = CLICKABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = CLICKABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ButtonImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 25;

  /**
   * The feature id for the '<em><b>But</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__BUT = CLICKABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = CLICKABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ImageImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 26;

  /**
   * The feature id for the '<em><b>Img</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__IMG = CLICKABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = CLICKABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.TextFieldImpl <em>Text Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.TextFieldImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getTextField()
   * @generated
   */
  int TEXT_FIELD = 27;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD__TEXT = FILLABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD_FEATURE_COUNT = FILLABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.TypeElementImpl <em>Type Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.TypeElementImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getTypeElement()
   * @generated
   */
  int TYPE_ELEMENT = 28;

  /**
   * The feature id for the '<em><b>Elem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ELEMENT__ELEM = 0;

  /**
   * The number of structural features of the '<em>Type Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ClearImpl <em>Clear</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ClearImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClear()
   * @generated
   */
  int CLEAR = 33;

  /**
   * The number of structural features of the '<em>Clear</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.SelectImpl <em>Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.SelectImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getSelect()
   * @generated
   */
  int SELECT = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__VALUE = CLEAR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = CLEAR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ClickImpl <em>Click</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ClickImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClick()
   * @generated
   */
  int CLICK = 30;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
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
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.CheckImpl <em>Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.CheckImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheck()
   * @generated
   */
  int CHECK = 31;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__VAL = 0;

  /**
   * The number of structural features of the '<em>Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FillImpl <em>Fill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FillImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFill()
   * @generated
   */
  int FILL = 32;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__VAL = 0;

  /**
   * The number of structural features of the '<em>Fill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VerifyImpl <em>Verify</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VerifyImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVerify()
   * @generated
   */
  int VERIFY = 34;

  /**
   * The number of structural features of the '<em>Verify</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ExistImpl <em>Exist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ExistImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getExist()
   * @generated
   */
  int EXIST = 35;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIST__VAL = 0;

  /**
   * The number of structural features of the '<em>Exist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.GoToImpl <em>Go To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.GoToImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getGoTo()
   * @generated
   */
  int GO_TO = 36;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO__ACTION = ACTION_INSTRUCTION__ACTION;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO__URL = ACTION_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Go To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO_FEATURE_COUNT = ACTION_INSTRUCTION_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Program#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub</em>'.
   * @see org.xtext.mda.project.browserDSL.Program#getSub()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Sub();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Subroutine#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.xtext.mda.project.browserDSL.Subroutine#getBody()
   * @see #getSubroutine()
   * @generated
   */
  EReference getSubroutine_Body();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Head#getVarId <em>Var Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var Id</em>'.
   * @see org.xtext.mda.project.browserDSL.Head#getVarId()
   * @see #getHead()
   * @generated
   */
  EReference getHead_VarId();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.FunctionReference#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var</em>'.
   * @see org.xtext.mda.project.browserDSL.FunctionReference#getVar()
   * @see #getFunctionReference()
   * @generated
   */
  EReference getFunctionReference_Var();

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
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see org.xtext.mda.project.browserDSL.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

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
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see org.xtext.mda.project.browserDSL.Body
   * @generated
   */
  EClass getBody();

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
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see org.xtext.mda.project.browserDSL.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Instruction#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.xtext.mda.project.browserDSL.Instruction#getDec()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Dec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Instruction#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.xtext.mda.project.browserDSL.Instruction#getCond()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Cond();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Instruction#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see org.xtext.mda.project.browserDSL.Instruction#getWhile()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_While();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Instruction#getAct <em>Act</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Act</em>'.
   * @see org.xtext.mda.project.browserDSL.Instruction#getAct()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Act();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Instruction#getAss <em>Ass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ass</em>'.
   * @see org.xtext.mda.project.browserDSL.Instruction#getAss()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Ass();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Instruction#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub</em>'.
   * @see org.xtext.mda.project.browserDSL.Instruction#getSub()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Sub();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.xtext.mda.project.browserDSL.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Condition#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.mda.project.browserDSL.Condition#getExp()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Exp();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Condition#getIns <em>Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ins</em>'.
   * @see org.xtext.mda.project.browserDSL.Condition#getIns()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Ins();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Condition#getIns2 <em>Ins2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ins2</em>'.
   * @see org.xtext.mda.project.browserDSL.Condition#getIns2()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Ins2();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see org.xtext.mda.project.browserDSL.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.While#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.mda.project.browserDSL.While#getExp()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Exp();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.While#getIns <em>Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ins</em>'.
   * @see org.xtext.mda.project.browserDSL.While#getIns()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Ins();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.ActionInstruction <em>Action Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Instruction</em>'.
   * @see org.xtext.mda.project.browserDSL.ActionInstruction
   * @generated
   */
  EClass getActionInstruction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.ActionInstruction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.xtext.mda.project.browserDSL.ActionInstruction#getAction()
   * @see #getActionInstruction()
   * @generated
   */
  EReference getActionInstruction_Action();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.mda.project.browserDSL.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Declaration#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.xtext.mda.project.browserDSL.Declaration#getVal()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Val();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Assignation <em>Assignation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignation</em>'.
   * @see org.xtext.mda.project.browserDSL.Assignation
   * @generated
   */
  EClass getAssignation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Assignation#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.mda.project.browserDSL.Assignation#getVar()
   * @see #getAssignation()
   * @generated
   */
  EReference getAssignation_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Assignation#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.mda.project.browserDSL.Assignation#getExpr()
   * @see #getAssignation()
   * @generated
   */
  EReference getAssignation_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.mda.project.browserDSL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Expression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.mda.project.browserDSL.Expression#getType()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Expression#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.mda.project.browserDSL.Expression#getVar()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Expression#getAct <em>Act</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Act</em>'.
   * @see org.xtext.mda.project.browserDSL.Expression#getAct()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Act();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.mda.project.browserDSL.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.mda.project.browserDSL.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Expression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.mda.project.browserDSL.Expression#getExp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Exp();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Variable#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.mda.project.browserDSL.Variable#getVar()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Var();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.ActionExpression <em>Action Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Expression</em>'.
   * @see org.xtext.mda.project.browserDSL.ActionExpression
   * @generated
   */
  EClass getActionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.ActionExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.mda.project.browserDSL.ActionExpression#getExpr()
   * @see #getActionExpression()
   * @generated
   */
  EReference getActionExpression_Expr();

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
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Checkbox <em>Checkbox</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Checkbox</em>'.
   * @see org.xtext.mda.project.browserDSL.Checkbox
   * @generated
   */
  EClass getCheckbox();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Checkbox#getCheck <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check</em>'.
   * @see org.xtext.mda.project.browserDSL.Checkbox#getCheck()
   * @see #getCheckbox()
   * @generated
   */
  EAttribute getCheckbox_Check();

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
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Link#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link</em>'.
   * @see org.xtext.mda.project.browserDSL.Link#getLink()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Link();

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
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Button#getBut <em>But</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>But</em>'.
   * @see org.xtext.mda.project.browserDSL.Button#getBut()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_But();

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
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Image#getImg <em>Img</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Img</em>'.
   * @see org.xtext.mda.project.browserDSL.Image#getImg()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Img();

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
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.TextField#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.mda.project.browserDSL.TextField#getText()
   * @see #getTextField()
   * @generated
   */
  EAttribute getTextField_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.TypeElement <em>Type Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Element</em>'.
   * @see org.xtext.mda.project.browserDSL.TypeElement
   * @generated
   */
  EClass getTypeElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.TypeElement#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Elem</em>'.
   * @see org.xtext.mda.project.browserDSL.TypeElement#getElem()
   * @see #getTypeElement()
   * @generated
   */
  EAttribute getTypeElement_Elem();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select</em>'.
   * @see org.xtext.mda.project.browserDSL.Select
   * @generated
   */
  EClass getSelect();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Select#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.Select#getValue()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Value();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Click#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.xtext.mda.project.browserDSL.Click#getVal()
   * @see #getClick()
   * @generated
   */
  EReference getClick_Val();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check</em>'.
   * @see org.xtext.mda.project.browserDSL.Check
   * @generated
   */
  EClass getCheck();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Check#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.xtext.mda.project.browserDSL.Check#getVal()
   * @see #getCheck()
   * @generated
   */
  EReference getCheck_Val();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Fill#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.xtext.mda.project.browserDSL.Fill#getVal()
   * @see #getFill()
   * @generated
   */
  EReference getFill_Val();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Exist#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.xtext.mda.project.browserDSL.Exist#getVal()
   * @see #getExist()
   * @generated
   */
  EReference getExist_Val();

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
     * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__SUB = eINSTANCE.getProgram_Sub();

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
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBROUTINE__BODY = eINSTANCE.getSubroutine_Body();

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
     * The meta object literal for the '<em><b>Var Id</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEAD__VAR_ID = eINSTANCE.getHead_VarId();

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
     * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_REFERENCE__VAR = eINSTANCE.getFunctionReference_Var();

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
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.FunctionCallImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

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
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.BodyImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__INSTRUCTIONS = eINSTANCE.getBody_Instructions();

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
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__DEC = eINSTANCE.getInstruction_Dec();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__COND = eINSTANCE.getInstruction_Cond();

    /**
     * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__WHILE = eINSTANCE.getInstruction_While();

    /**
     * The meta object literal for the '<em><b>Act</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__ACT = eINSTANCE.getInstruction_Act();

    /**
     * The meta object literal for the '<em><b>Ass</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__ASS = eINSTANCE.getInstruction_Ass();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__SUB = eINSTANCE.getInstruction_Sub();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ConditionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__EXP = eINSTANCE.getCondition_Exp();

    /**
     * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__INS = eINSTANCE.getCondition_Ins();

    /**
     * The meta object literal for the '<em><b>Ins2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__INS2 = eINSTANCE.getCondition_Ins2();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.WhileImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__EXP = eINSTANCE.getWhile_Exp();

    /**
     * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__INS = eINSTANCE.getWhile_Ins();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ActionInstructionImpl <em>Action Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ActionInstructionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getActionInstruction()
     * @generated
     */
    EClass ACTION_INSTRUCTION = eINSTANCE.getActionInstruction();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_INSTRUCTION__ACTION = eINSTANCE.getActionInstruction_Action();

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
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__VAL = eINSTANCE.getDeclaration_Val();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.AssignationImpl <em>Assignation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.AssignationImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getAssignation()
     * @generated
     */
    EClass ASSIGNATION = eINSTANCE.getAssignation();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNATION__VAR = eINSTANCE.getAssignation_Var();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNATION__EXPR = eINSTANCE.getAssignation_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ExpressionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__TYPE = eINSTANCE.getExpression_Type();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__VAR = eINSTANCE.getExpression_Var();

    /**
     * The meta object literal for the '<em><b>Act</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__ACT = eINSTANCE.getExpression_Act();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXP = eINSTANCE.getExpression_Exp();

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
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__VAR = eINSTANCE.getVariable_Var();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ActionExpressionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getActionExpression()
     * @generated
     */
    EClass ACTION_EXPRESSION = eINSTANCE.getActionExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_EXPRESSION__EXPR = eINSTANCE.getActionExpression_Expr();

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
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.CheckboxImpl <em>Checkbox</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.CheckboxImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheckbox()
     * @generated
     */
    EClass CHECKBOX = eINSTANCE.getCheckbox();

    /**
     * The meta object literal for the '<em><b>Check</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECKBOX__CHECK = eINSTANCE.getCheckbox_Check();

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
     * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__LINK = eINSTANCE.getLink_Link();

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
     * The meta object literal for the '<em><b>But</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__BUT = eINSTANCE.getButton_But();

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
     * The meta object literal for the '<em><b>Img</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__IMG = eINSTANCE.getImage_Img();

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
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_FIELD__TEXT = eINSTANCE.getTextField_Text();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.TypeElementImpl <em>Type Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.TypeElementImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getTypeElement()
     * @generated
     */
    EClass TYPE_ELEMENT = eINSTANCE.getTypeElement();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ELEMENT__ELEM = eINSTANCE.getTypeElement_Elem();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.SelectImpl <em>Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.SelectImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getSelect()
     * @generated
     */
    EClass SELECT = eINSTANCE.getSelect();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__VALUE = eINSTANCE.getSelect_Value();

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
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLICK__VAL = eINSTANCE.getClick_Val();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.CheckImpl <em>Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.CheckImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheck()
     * @generated
     */
    EClass CHECK = eINSTANCE.getCheck();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK__VAL = eINSTANCE.getCheck_Val();

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
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__VAL = eINSTANCE.getFill_Val();

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
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXIST__VAL = eINSTANCE.getExist_Val();

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

  }

} //BrowserDSLPackage
