/**
 */
package org.xtext.mda.project.browserDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.mda.project.browserDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrowserDSLFactoryImpl extends EFactoryImpl implements BrowserDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BrowserDSLFactory init()
  {
    try
    {
      BrowserDSLFactory theBrowserDSLFactory = (BrowserDSLFactory)EPackage.Registry.INSTANCE.getEFactory(BrowserDSLPackage.eNS_URI);
      if (theBrowserDSLFactory != null)
      {
        return theBrowserDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BrowserDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BrowserDSLPackage.PROGRAM: return createProgram();
      case BrowserDSLPackage.SUBROUTINE: return createSubroutine();
      case BrowserDSLPackage.HEAD: return createHead();
      case BrowserDSLPackage.FUNCTION_REFERENCE: return createFunctionReference();
      case BrowserDSLPackage.VARIABLE_REFERENCE: return createVariableReference();
      case BrowserDSLPackage.FUNCTION_CALL: return createFunctionCall();
      case BrowserDSLPackage.FUNCTION_NAME: return createFunctionName();
      case BrowserDSLPackage.MAIN: return createMain();
      case BrowserDSLPackage.BODY: return createBody();
      case BrowserDSLPackage.INSTRUCTION: return createInstruction();
      case BrowserDSLPackage.CONDITION: return createCondition();
      case BrowserDSLPackage.ACTION_INSTRUCTION: return createActionInstruction();
      case BrowserDSLPackage.VARIABLE_NAME: return createVariableName();
      case BrowserDSLPackage.DECLARATION: return createDeclaration();
      case BrowserDSLPackage.ASSIGNATION: return createAssignation();
      case BrowserDSLPackage.EXPRESSION: return createExpression();
      case BrowserDSLPackage.VARIABLE: return createVariable();
      case BrowserDSLPackage.ACTION_EXPRESSION: return createActionExpression();
      case BrowserDSLPackage.ELEMENT: return createElement();
      case BrowserDSLPackage.CLICKABLE_ELEMENT: return createClickableElement();
      case BrowserDSLPackage.FILLABLE_ELEMENT: return createFillableElement();
      case BrowserDSLPackage.CHECKABLE_ELEMENT: return createCheckableElement();
      case BrowserDSLPackage.CHECKBOX: return createCheckbox();
      case BrowserDSLPackage.LINK: return createLink();
      case BrowserDSLPackage.BUTTON: return createButton();
      case BrowserDSLPackage.IMAGE: return createImage();
      case BrowserDSLPackage.TEXT_FIELD: return createTextField();
      case BrowserDSLPackage.CLICK: return createClick();
      case BrowserDSLPackage.FILL: return createFill();
      case BrowserDSLPackage.CLEAR: return createClear();
      case BrowserDSLPackage.VERIFY: return createVerify();
      case BrowserDSLPackage.EXIST: return createExist();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subroutine createSubroutine()
  {
    SubroutineImpl subroutine = new SubroutineImpl();
    return subroutine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Head createHead()
  {
    HeadImpl head = new HeadImpl();
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionReference createFunctionReference()
  {
    FunctionReferenceImpl functionReference = new FunctionReferenceImpl();
    return functionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionName createFunctionName()
  {
    FunctionNameImpl functionName = new FunctionNameImpl();
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionInstruction createActionInstruction()
  {
    ActionInstructionImpl actionInstruction = new ActionInstructionImpl();
    return actionInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableName createVariableName()
  {
    VariableNameImpl variableName = new VariableNameImpl();
    return variableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignation createAssignation()
  {
    AssignationImpl assignation = new AssignationImpl();
    return assignation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionExpression createActionExpression()
  {
    ActionExpressionImpl actionExpression = new ActionExpressionImpl();
    return actionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClickableElement createClickableElement()
  {
    ClickableElementImpl clickableElement = new ClickableElementImpl();
    return clickableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FillableElement createFillableElement()
  {
    FillableElementImpl fillableElement = new FillableElementImpl();
    return fillableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckableElement createCheckableElement()
  {
    CheckableElementImpl checkableElement = new CheckableElementImpl();
    return checkableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Checkbox createCheckbox()
  {
    CheckboxImpl checkbox = new CheckboxImpl();
    return checkbox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image createImage()
  {
    ImageImpl image = new ImageImpl();
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextField createTextField()
  {
    TextFieldImpl textField = new TextFieldImpl();
    return textField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Click createClick()
  {
    ClickImpl click = new ClickImpl();
    return click;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fill createFill()
  {
    FillImpl fill = new FillImpl();
    return fill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clear createClear()
  {
    ClearImpl clear = new ClearImpl();
    return clear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verify createVerify()
  {
    VerifyImpl verify = new VerifyImpl();
    return verify;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exist createExist()
  {
    ExistImpl exist = new ExistImpl();
    return exist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserDSLPackage getBrowserDSLPackage()
  {
    return (BrowserDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BrowserDSLPackage getPackage()
  {
    return BrowserDSLPackage.eINSTANCE;
  }

} //BrowserDSLFactoryImpl
