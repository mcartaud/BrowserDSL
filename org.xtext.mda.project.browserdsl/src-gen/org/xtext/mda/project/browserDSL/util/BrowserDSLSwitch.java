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
      case BrowserDSLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.SUB_ROUTINE:
      {
        SubRoutine subRoutine = (SubRoutine)theEObject;
        T result = caseSubRoutine(subRoutine);
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
      case BrowserDSLPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.SUB_ROUTINE_CALL:
      {
        SubRoutineCall subRoutineCall = (SubRoutineCall)theEObject;
        T result = caseSubRoutineCall(subRoutineCall);
        if (result == null) result = caseAction(subRoutineCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = caseExist(element);
        if (result == null) result = caseAction(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.CLICKABLE_ELEMENT:
      {
        ClickableElement clickableElement = (ClickableElement)theEObject;
        T result = caseClickableElement(clickableElement);
        if (result == null) result = caseElement(clickableElement);
        if (result == null) result = caseClick(clickableElement);
        if (result == null) result = caseExist(clickableElement);
        if (result == null) result = caseAction(clickableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.FILLABLE_ELEMENT:
      {
        FillableElement fillableElement = (FillableElement)theEObject;
        T result = caseFillableElement(fillableElement);
        if (result == null) result = caseElement(fillableElement);
        if (result == null) result = caseFill(fillableElement);
        if (result == null) result = caseClear(fillableElement);
        if (result == null) result = caseVerify(fillableElement);
        if (result == null) result = caseExist(fillableElement);
        if (result == null) result = caseAction(fillableElement);
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
        if (result == null) result = caseExist(checkableElement);
        if (result == null) result = caseAction(checkableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.CLICK:
      {
        Click click = (Click)theEObject;
        T result = caseClick(click);
        if (result == null) result = caseAction(click);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.FILL:
      {
        Fill fill = (Fill)theEObject;
        T result = caseFill(fill);
        if (result == null) result = caseAction(fill);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.CLEAR:
      {
        Clear clear = (Clear)theEObject;
        T result = caseClear(clear);
        if (result == null) result = caseAction(clear);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.VERIFY:
      {
        Verify verify = (Verify)theEObject;
        T result = caseVerify(verify);
        if (result == null) result = caseAction(verify);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.EXIST:
      {
        Exist exist = (Exist)theEObject;
        T result = caseExist(exist);
        if (result == null) result = caseAction(exist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.GO_TO:
      {
        GoTo goTo = (GoTo)theEObject;
        T result = caseGoTo(goTo);
        if (result == null) result = caseAction(goTo);
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
        if (result == null) result = caseClick(variable);
        if (result == null) result = caseFill(variable);
        if (result == null) result = caseExist(variable);
        if (result == null) result = caseAction(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.VARIABLE_STRING:
      {
        VariableString variableString = (VariableString)theEObject;
        T result = caseVariableString(variableString);
        if (result == null) result = caseVariable(variableString);
        if (result == null) result = caseCheckbox(variableString);
        if (result == null) result = caseLink(variableString);
        if (result == null) result = caseButton(variableString);
        if (result == null) result = caseImage(variableString);
        if (result == null) result = caseTextField(variableString);
        if (result == null) result = caseCheckableElement(variableString);
        if (result == null) result = caseClickableElement(variableString);
        if (result == null) result = caseFillableElement(variableString);
        if (result == null) result = caseElement(variableString);
        if (result == null) result = caseClear(variableString);
        if (result == null) result = caseVerify(variableString);
        if (result == null) result = caseClick(variableString);
        if (result == null) result = caseFill(variableString);
        if (result == null) result = caseExist(variableString);
        if (result == null) result = caseAction(variableString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.VARIABLE_URL:
      {
        VariableUrl variableUrl = (VariableUrl)theEObject;
        T result = caseVariableUrl(variableUrl);
        if (result == null) result = caseGoTo(variableUrl);
        if (result == null) result = caseVariable(variableUrl);
        if (result == null) result = caseCheckbox(variableUrl);
        if (result == null) result = caseLink(variableUrl);
        if (result == null) result = caseButton(variableUrl);
        if (result == null) result = caseImage(variableUrl);
        if (result == null) result = caseTextField(variableUrl);
        if (result == null) result = caseCheckableElement(variableUrl);
        if (result == null) result = caseClickableElement(variableUrl);
        if (result == null) result = caseFillableElement(variableUrl);
        if (result == null) result = caseElement(variableUrl);
        if (result == null) result = caseClear(variableUrl);
        if (result == null) result = caseVerify(variableUrl);
        if (result == null) result = caseClick(variableUrl);
        if (result == null) result = caseFill(variableUrl);
        if (result == null) result = caseExist(variableUrl);
        if (result == null) result = caseAction(variableUrl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.VARIABLE_LIST:
      {
        VariableList variableList = (VariableList)theEObject;
        T result = caseVariableList(variableList);
        if (result == null) result = caseVariable(variableList);
        if (result == null) result = caseCheckbox(variableList);
        if (result == null) result = caseLink(variableList);
        if (result == null) result = caseButton(variableList);
        if (result == null) result = caseImage(variableList);
        if (result == null) result = caseTextField(variableList);
        if (result == null) result = caseCheckableElement(variableList);
        if (result == null) result = caseClickableElement(variableList);
        if (result == null) result = caseFillableElement(variableList);
        if (result == null) result = caseElement(variableList);
        if (result == null) result = caseClear(variableList);
        if (result == null) result = caseVerify(variableList);
        if (result == null) result = caseClick(variableList);
        if (result == null) result = caseFill(variableList);
        if (result == null) result = caseExist(variableList);
        if (result == null) result = caseAction(variableList);
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
        if (result == null) result = caseExist(checkbox);
        if (result == null) result = caseAction(checkbox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = caseClickableElement(link);
        if (result == null) result = caseElement(link);
        if (result == null) result = caseClick(link);
        if (result == null) result = caseExist(link);
        if (result == null) result = caseAction(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseClickableElement(button);
        if (result == null) result = caseElement(button);
        if (result == null) result = caseClick(button);
        if (result == null) result = caseExist(button);
        if (result == null) result = caseAction(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.IMAGE:
      {
        Image image = (Image)theEObject;
        T result = caseImage(image);
        if (result == null) result = caseClickableElement(image);
        if (result == null) result = caseElement(image);
        if (result == null) result = caseClick(image);
        if (result == null) result = caseExist(image);
        if (result == null) result = caseAction(image);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserDSLPackage.TEXT_FIELD:
      {
        TextField textField = (TextField)theEObject;
        T result = caseTextField(textField);
        if (result == null) result = caseFillableElement(textField);
        if (result == null) result = caseElement(textField);
        if (result == null) result = caseFill(textField);
        if (result == null) result = caseClear(textField);
        if (result == null) result = caseVerify(textField);
        if (result == null) result = caseExist(textField);
        if (result == null) result = caseAction(textField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Routine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Routine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubRoutine(SubRoutine object)
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
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Routine Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Routine Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubRoutineCall(SubRoutineCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
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
   * Returns the result of interpreting the object as an instance of '<em>Variable String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableString(VariableString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Url</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Url</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableUrl(VariableUrl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableList(VariableList object)
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
