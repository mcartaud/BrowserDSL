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
   * The feature id for the '<em><b>Subroutines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__SUBROUTINES = 1;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__MAIN = 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 3;

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
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ExpressionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 16;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VariableImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 19;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.InstructionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 9;

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
  int FUNCTION_CALL = 5;

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
  int BODY = 8;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__INSTRUCTIONS = 0;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__EXPRESSION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instructions If</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__INSTRUCTIONS_IF = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Instructions Else</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__INSTRUCTIONS_ELSE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

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
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__EXPRESSION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

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
   * The number of structural features of the '<em>Action Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

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
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.NotEpressionImpl <em>Not Epression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.NotEpressionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getNotEpression()
   * @generated
   */
  int NOT_EPRESSION = 17;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EPRESSION__EXP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not Epression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.BinarieExpressionImpl <em>Binarie Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.BinarieExpressionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getBinarieExpression()
   * @generated
   */
  int BINARIE_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARIE_EXPRESSION__LEFT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARIE_EXPRESSION__RIGHT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Binarie Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARIE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ActionExpressionImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getActionExpression()
   * @generated
   */
  int ACTION_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EXPRESSION__ELEMENT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ElementImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 21;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ClickableElementImpl <em>Clickable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ClickableElementImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClickableElement()
   * @generated
   */
  int CLICKABLE_ELEMENT = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICKABLE_ELEMENT__VALUE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Clickable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICKABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FillableElementImpl <em>Fillable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FillableElementImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFillableElement()
   * @generated
   */
  int FILLABLE_ELEMENT = 23;

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
  int CHECKABLE_ELEMENT = 24;

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
  int CHECKBOX = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX__VALUE = CHECKABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Checkbox</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX_FEATURE_COUNT = CHECKABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.LinkImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getLink()
   * @generated
   */
  int LINK = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__VALUE = CLICKABLE_ELEMENT__VALUE;

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
  int BUTTON = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__VALUE = CLICKABLE_ELEMENT__VALUE;

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
  int IMAGE = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__VALUE = CLICKABLE_ELEMENT__VALUE;

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
  int TEXT_FIELD = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD__VALUE = FILLABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD_FEATURE_COUNT = FILLABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.SelectImpl <em>Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.SelectImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getSelect()
   * @generated
   */
  int SELECT = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ClickImpl <em>Click</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ClickImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClick()
   * @generated
   */
  int CLICK = 31;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK__ELEMENT = ACTION_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Click</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_FEATURE_COUNT = ACTION_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.CheckImpl <em>Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.CheckImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCheck()
   * @generated
   */
  int CHECK = 32;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__ELEMENT = ACTION_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_FEATURE_COUNT = ACTION_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.FillImpl <em>Fill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.FillImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getFill()
   * @generated
   */
  int FILL = 33;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__ELEMENT = ACTION_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__VALUE = ACTION_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_FEATURE_COUNT = ACTION_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ClearImpl <em>Clear</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ClearImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getClear()
   * @generated
   */
  int CLEAR = 34;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR__ELEMENT = ACTION_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Clear</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_FEATURE_COUNT = ACTION_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.VerifyImpl <em>Verify</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.VerifyImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getVerify()
   * @generated
   */
  int VERIFY = 35;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY__ELEMENT = ACTION_EXPRESSION__ELEMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY__VALUE = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Verify</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.ExistImpl <em>Exist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.ExistImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getExist()
   * @generated
   */
  int EXIST = 36;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIST__ELEMENT = ACTION_EXPRESSION__ELEMENT;

  /**
   * The number of structural features of the '<em>Exist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIST_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.GoToImpl <em>Go To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.GoToImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getGoTo()
   * @generated
   */
  int GO_TO = 37;

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
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.impl.StringValueImpl
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.OpenBrowser <em>Open Browser</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.OpenBrowser
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getOpenBrowser()
   * @generated
   */
  int OPEN_BROWSER = 39;

  /**
   * The meta object id for the '{@link org.xtext.mda.project.browserDSL.TypeElement <em>Type Element</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mda.project.browserDSL.TypeElement
   * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getTypeElement()
   * @generated
   */
  int TYPE_ELEMENT = 40;


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
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.xtext.mda.project.browserDSL.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Condition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.mda.project.browserDSL.Condition#getExpression()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Condition#getInstructionsIf <em>Instructions If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions If</em>'.
   * @see org.xtext.mda.project.browserDSL.Condition#getInstructionsIf()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_InstructionsIf();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.Condition#getInstructionsElse <em>Instructions Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions Else</em>'.
   * @see org.xtext.mda.project.browserDSL.Condition#getInstructionsElse()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_InstructionsElse();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.While#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.mda.project.browserDSL.While#getExpression()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mda.project.browserDSL.While#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see org.xtext.mda.project.browserDSL.While#getInstructions()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Instructions();

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
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.Assignation <em>Assignation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignation</em>'.
   * @see org.xtext.mda.project.browserDSL.Assignation
   * @generated
   */
  EClass getAssignation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Assignation#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.mda.project.browserDSL.Assignation#getVariable()
   * @see #getAssignation()
   * @generated
   */
  EReference getAssignation_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Assignation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.Assignation#getValue()
   * @see #getAssignation()
   * @generated
   */
  EReference getAssignation_Value();

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
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.NotEpression <em>Not Epression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Epression</em>'.
   * @see org.xtext.mda.project.browserDSL.NotEpression
   * @generated
   */
  EClass getNotEpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.NotEpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.mda.project.browserDSL.NotEpression#getExp()
   * @see #getNotEpression()
   * @generated
   */
  EReference getNotEpression_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.BinarieExpression <em>Binarie Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binarie Expression</em>'.
   * @see org.xtext.mda.project.browserDSL.BinarieExpression
   * @generated
   */
  EClass getBinarieExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.BinarieExpression#getLeftExpression <em>Left Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expression</em>'.
   * @see org.xtext.mda.project.browserDSL.BinarieExpression#getLeftExpression()
   * @see #getBinarieExpression()
   * @generated
   */
  EReference getBinarieExpression_LeftExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.BinarieExpression#getRightExpression <em>Right Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expression</em>'.
   * @see org.xtext.mda.project.browserDSL.BinarieExpression#getRightExpression()
   * @see #getBinarieExpression()
   * @generated
   */
  EReference getBinarieExpression_RightExpression();

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
   * Returns the meta object for class '{@link org.xtext.mda.project.browserDSL.ActionExpression <em>Action Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Expression</em>'.
   * @see org.xtext.mda.project.browserDSL.ActionExpression
   * @generated
   */
  EClass getActionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.ActionExpression#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.xtext.mda.project.browserDSL.ActionExpression#getElement()
   * @see #getActionExpression()
   * @generated
   */
  EReference getActionExpression_Element();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.ClickableElement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.ClickableElement#getValue()
   * @see #getClickableElement()
   * @generated
   */
  EReference getClickableElement_Value();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Checkbox#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.Checkbox#getValue()
   * @see #getCheckbox()
   * @generated
   */
  EReference getCheckbox_Value();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.TextField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.TextField#getValue()
   * @see #getTextField()
   * @generated
   */
  EReference getTextField_Value();

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
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Select#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.Select#getValue()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Value();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Click#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.xtext.mda.project.browserDSL.Click#getElement()
   * @see #getClick()
   * @generated
   */
  EReference getClick_Element();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Check#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.xtext.mda.project.browserDSL.Check#getElement()
   * @see #getCheck()
   * @generated
   */
  EReference getCheck_Element();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Fill#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.xtext.mda.project.browserDSL.Fill#getElement()
   * @see #getFill()
   * @generated
   */
  EReference getFill_Element();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Fill#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.Fill#getValue()
   * @see #getFill()
   * @generated
   */
  EAttribute getFill_Value();

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
   * Returns the meta object for the containment reference '{@link org.xtext.mda.project.browserDSL.Clear#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.xtext.mda.project.browserDSL.Clear#getElement()
   * @see #getClear()
   * @generated
   */
  EReference getClear_Element();

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
   * Returns the meta object for the attribute '{@link org.xtext.mda.project.browserDSL.Verify#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.mda.project.browserDSL.Verify#getValue()
   * @see #getVerify()
   * @generated
   */
  EAttribute getVerify_Value();

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
   * Returns the meta object for enum '{@link org.xtext.mda.project.browserDSL.OpenBrowser <em>Open Browser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Open Browser</em>'.
   * @see org.xtext.mda.project.browserDSL.OpenBrowser
   * @generated
   */
  EEnum getOpenBrowser();

  /**
   * Returns the meta object for enum '{@link org.xtext.mda.project.browserDSL.TypeElement <em>Type Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Element</em>'.
   * @see org.xtext.mda.project.browserDSL.TypeElement
   * @generated
   */
  EEnum getTypeElement();

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
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ConditionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

    /**
     * The meta object literal for the '<em><b>Instructions If</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__INSTRUCTIONS_IF = eINSTANCE.getCondition_InstructionsIf();

    /**
     * The meta object literal for the '<em><b>Instructions Else</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__INSTRUCTIONS_ELSE = eINSTANCE.getCondition_InstructionsElse();

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
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__EXPRESSION = eINSTANCE.getWhile_Expression();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__INSTRUCTIONS = eINSTANCE.getWhile_Instructions();

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
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.AssignationImpl <em>Assignation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.AssignationImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getAssignation()
     * @generated
     */
    EClass ASSIGNATION = eINSTANCE.getAssignation();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNATION__VARIABLE = eINSTANCE.getAssignation_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNATION__VALUE = eINSTANCE.getAssignation_Value();

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
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.NotEpressionImpl <em>Not Epression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.NotEpressionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getNotEpression()
     * @generated
     */
    EClass NOT_EPRESSION = eINSTANCE.getNotEpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EPRESSION__EXP = eINSTANCE.getNotEpression_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.BinarieExpressionImpl <em>Binarie Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.BinarieExpressionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getBinarieExpression()
     * @generated
     */
    EClass BINARIE_EXPRESSION = eINSTANCE.getBinarieExpression();

    /**
     * The meta object literal for the '<em><b>Left Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARIE_EXPRESSION__LEFT_EXPRESSION = eINSTANCE.getBinarieExpression_LeftExpression();

    /**
     * The meta object literal for the '<em><b>Right Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARIE_EXPRESSION__RIGHT_EXPRESSION = eINSTANCE.getBinarieExpression_RightExpression();

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
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.impl.ActionExpressionImpl
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getActionExpression()
     * @generated
     */
    EClass ACTION_EXPRESSION = eINSTANCE.getActionExpression();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_EXPRESSION__ELEMENT = eINSTANCE.getActionExpression_Element();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLICKABLE_ELEMENT__VALUE = eINSTANCE.getClickableElement_Value();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECKBOX__VALUE = eINSTANCE.getCheckbox_Value();

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

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_FIELD__VALUE = eINSTANCE.getTextField_Value();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__VALUE = eINSTANCE.getSelect_Value();

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
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLICK__ELEMENT = eINSTANCE.getClick_Element();

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
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK__ELEMENT = eINSTANCE.getCheck_Element();

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
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__ELEMENT = eINSTANCE.getFill_Element();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILL__VALUE = eINSTANCE.getFill_Value();

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
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLEAR__ELEMENT = eINSTANCE.getClear_Element();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFY__VALUE = eINSTANCE.getVerify_Value();

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
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GO_TO__URL = eINSTANCE.getGoTo_Url();

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
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.OpenBrowser <em>Open Browser</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.OpenBrowser
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getOpenBrowser()
     * @generated
     */
    EEnum OPEN_BROWSER = eINSTANCE.getOpenBrowser();

    /**
     * The meta object literal for the '{@link org.xtext.mda.project.browserDSL.TypeElement <em>Type Element</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mda.project.browserDSL.TypeElement
     * @see org.xtext.mda.project.browserDSL.impl.BrowserDSLPackageImpl#getTypeElement()
     * @generated
     */
    EEnum TYPE_ELEMENT = eINSTANCE.getTypeElement();

  }

} //BrowserDSLPackage
