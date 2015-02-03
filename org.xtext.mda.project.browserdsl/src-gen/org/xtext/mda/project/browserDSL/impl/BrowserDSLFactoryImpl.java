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
      case BrowserDSLPackage.MODEL: return createModel();
      case BrowserDSLPackage.ACTION: return createAction();
      case BrowserDSLPackage.ELEMENT: return createElement();
      case BrowserDSLPackage.CLICKABLE_ELEMENT: return createClickableElement();
      case BrowserDSLPackage.FILLABLE_ELEMENT: return createFillableElement();
      case BrowserDSLPackage.CHECKABLE_ELEMENT: return createCheckableElement();
      case BrowserDSLPackage.CLICK: return createClick();
      case BrowserDSLPackage.FILL: return createFill();
      case BrowserDSLPackage.CLEAR: return createClear();
      case BrowserDSLPackage.VERIFY: return createVerify();
      case BrowserDSLPackage.EXIST: return createExist();
      case BrowserDSLPackage.GO_TO: return createGoTo();
      case BrowserDSLPackage.CHECKBOX: return createCheckbox();
      case BrowserDSLPackage.LINK: return createLink();
      case BrowserDSLPackage.BUTTON: return createButton();
      case BrowserDSLPackage.IMAGE: return createImage();
      case BrowserDSLPackage.TEXT_FIELD: return createTextField();
      case BrowserDSLPackage.URL: return createUrl();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
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
  public GoTo createGoTo()
  {
    GoToImpl goTo = new GoToImpl();
    return goTo;
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
  public Url createUrl()
  {
    UrlImpl url = new UrlImpl();
    return url;
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
