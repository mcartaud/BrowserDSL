/**
 */
package org.xtext.mda.project.browserDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.mda.project.browserDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.mda.project.browserDSL.BrowserDSLPackage
 * @generated
 */
public class BrowserDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BrowserDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BrowserDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BrowserDSLPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.SUBROUTINE:
      {
        Subroutine subroutine = (Subroutine)theEObject;
        T result = caseSubroutine(subroutine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.HEAD:
      {
        Head head = (Head)theEObject;
        T result = caseHead(head);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.FUNCTION_REFERENCE:
      {
        FunctionReference functionReference = (FunctionReference)theEObject;
        T result = caseFunctionReference(functionReference);
        if (result == null) result = caseFunctionCall(functionReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.VARIABLE_REFERENCE:
      {
        VariableReference variableReference = (VariableReference)theEObject;
        T result = caseVariableReference(variableReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.FUNCTION_NAME:
      {
        FunctionName functionName = (FunctionName)theEObject;
        T result = caseFunctionName(functionName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.MAIN:
      {
        Main main = (Main)theEObject;
        T result = caseMain(main);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = caseMain(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.WHILE:
      {
        While while_ = (While)theEObject;
        T result = caseWhile(while_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.ACTION_INSTRUCTION:
      {
        ActionInstruction actionInstruction = (ActionInstruction)theEObject;
        T result = caseActionInstruction(actionInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.VARIABLE_NAME:
      {
        VariableName variableName = (VariableName)theEObject;
        T result = caseVariableName(variableName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.ASSIGNATION:
      {
        Assignation assignation = (Assignation)theEObject;
        T result = caseAssignation(assignation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseCheckbox(variable);
        if (result == null) result = caseLink(variable);
        if (result == null) result = caseButton(variable);
        if (result == null) result = caseImage(variable);
        if (result == null) result = caseTextField(variable);
        if (result == null) result = caseCheckableElement(variable);
        if (result == null) result = caseClickableElement(variable);
        if (result == null) result = caseFillableElement(variable);
        if (result == null) result = caseElement(variable);
        if (result == null) result = caseClear(variable);
        if (result == null) result = caseVerify(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.ACTION_EXPRESSION:
      {
        ActionExpression actionExpression = (ActionExpression)theEObject;
        T result = caseActionExpression(actionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.CLICKABLE_ELEMENT:
      {
        ClickableElement clickableElement = (ClickableElement)theEObject;
        T result = caseClickableElement(clickableElement);
        if (result == null) result = caseElement(clickableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.FILLABLE_ELEMENT:
      {
        FillableElement fillableElement = (FillableElement)theEObject;
        T result = caseFillableElement(fillableElement);
        if (result == null) result = caseElement(fillableElement);
        if (result == null) result = caseClear(fillableElement);
        if (result == null) result = caseVerify(fillableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.CHECKABLE_ELEMENT:
      {
        CheckableElement checkableElement = (CheckableElement)theEObject;
        T result = caseCheckableElement(checkableElement);
        if (result == null) result = caseElement(checkableElement);
        if (result == null) result = caseClear(checkableElement);
        if (result == null) result = caseVerify(checkableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.CHECKBOX:
      {
        Checkbox checkbox = (Checkbox)theEObject;
        T result = caseCheckbox(checkbox);
        if (result == null) result = caseCheckableElement(checkbox);
        if (result == null) result = caseElement(checkbox);
        if (result == null) result = caseClear(checkbox);
        if (result == null) result = caseVerify(checkbox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = caseClickableElement(link);
        if (result == null) result = caseElement(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseClickableElement(button);
        if (result == null) result = caseElement(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.IMAGE:
      {
        Image image = (Image)theEObject;
        T result = caseImage(image);
        if (result == null) result = caseClickableElement(image);
        if (result == null) result = caseElement(image);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.TEXT_FIELD:
      {
        TextField textField = (TextField)theEObject;
        T result = caseTextField(textField);
        if (result == null) result = caseFillableElement(textField);
        if (result == null) result = caseElement(textField);
        if (result == null) result = caseClear(textField);
        if (result == null) result = caseVerify(textField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.TYPE_ELEMENT:
      {
        TypeElement typeElement = (TypeElement)theEObject;
        T result = caseTypeElement(typeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.SELECT:
      {
        Select select = (Select)theEObject;
        T result = caseSelect(select);
        if (result == null) result = caseClear(select);
        if (result == null) result = caseVerify(select);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.CLICK:
      {
        Click click = (Click)theEObject;
        T result = caseClick(click);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.CHECK:
      {
        Check check = (Check)theEObject;
        T result = caseCheck(check);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.FILL:
      {
        Fill fill = (Fill)theEObject;
        T result = caseFill(fill);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.CLEAR:
      {
        Clear clear = (Clear)theEObject;
        T result = caseClear(clear);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.VERIFY:
      {
        Verify verify = (Verify)theEObject;
        T result = caseVerify(verify);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.EXIST:
      {
        Exist exist = (Exist)theEObject;
        T result = caseExist(exist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.GO_TO:
      {
        GoTo goTo = (GoTo)theEObject;
        T result = caseGoTo(goTo);
        if (result == null) result = caseActionInstruction(goTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subroutine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subroutine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubroutine(Subroutine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Head</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Head</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHead(Head object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionReference(FunctionReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableReference(VariableReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionName(FunctionName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMain(Main object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile(While object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionInstruction(ActionInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableName(VariableName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignation(Assignation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionExpression(ActionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clickable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clickable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClickableElement(ClickableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fillable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fillable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFillableElement(FillableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checkable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checkable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckableElement(CheckableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checkbox</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checkbox</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckbox(Checkbox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImage(Image object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextField(TextField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeElement(TypeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelect(Select object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Click</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Click</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClick(Click object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheck(Check object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fill</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fill</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFill(Fill object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clear</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClear(Clear object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verify</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verify</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerify(Verify object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExist(Exist object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Go To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Go To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoTo(GoTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BrowserDSLSwitch
