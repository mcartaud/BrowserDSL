/*
* generated by Xtext
*/
package org.xtext.mda.project.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class BrowserDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cActionsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cActionsActionParserRuleCall_0 = (RuleCall)cActionsAssignment.eContents().get(0);
		
		//Model:
		//	actions+=Action*;
		public ParserRule getRule() { return rule; }

		//actions+=Action*
		public Assignment getActionsAssignment() { return cActionsAssignment; }

		//Action
		public RuleCall getActionsActionParserRuleCall_0() { return cActionsActionParserRuleCall_0; }
	}

	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Action");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClickParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFillParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cClearParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cVerifyParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cExistParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cGoToParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//Action:
		//	Click | Fill | Clear | Verify | Exist | GoTo;
		public ParserRule getRule() { return rule; }

		//Click | Fill | Clear | Verify | Exist | GoTo
		public Alternatives getAlternatives() { return cAlternatives; }

		//Click
		public RuleCall getClickParserRuleCall_0() { return cClickParserRuleCall_0; }

		//Fill
		public RuleCall getFillParserRuleCall_1() { return cFillParserRuleCall_1; }

		//Clear
		public RuleCall getClearParserRuleCall_2() { return cClearParserRuleCall_2; }

		//Verify
		public RuleCall getVerifyParserRuleCall_3() { return cVerifyParserRuleCall_3; }

		//Exist
		public RuleCall getExistParserRuleCall_4() { return cExistParserRuleCall_4; }

		//GoTo
		public RuleCall getGoToParserRuleCall_5() { return cGoToParserRuleCall_5; }
	}

	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClickableElementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFillableElementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCheckableElementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Element:
		//	ClickableElement | FillableElement | CheckableElement;
		public ParserRule getRule() { return rule; }

		//ClickableElement | FillableElement | CheckableElement
		public Alternatives getAlternatives() { return cAlternatives; }

		//ClickableElement
		public RuleCall getClickableElementParserRuleCall_0() { return cClickableElementParserRuleCall_0; }

		//FillableElement
		public RuleCall getFillableElementParserRuleCall_1() { return cFillableElementParserRuleCall_1; }

		//CheckableElement
		public RuleCall getCheckableElementParserRuleCall_2() { return cCheckableElementParserRuleCall_2; }
	}

	public class ClickableElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClickableElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLinkParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cButtonParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cImageParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ClickableElement:
		//	Link | Button | Image;
		public ParserRule getRule() { return rule; }

		//Link | Button | Image
		public Alternatives getAlternatives() { return cAlternatives; }

		//Link
		public RuleCall getLinkParserRuleCall_0() { return cLinkParserRuleCall_0; }

		//Button
		public RuleCall getButtonParserRuleCall_1() { return cButtonParserRuleCall_1; }

		//Image
		public RuleCall getImageParserRuleCall_2() { return cImageParserRuleCall_2; }
	}

	public class FillableElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FillableElement");
		private final RuleCall cTextFieldParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//FillableElement:
		//	TextField;
		public ParserRule getRule() { return rule; }

		//TextField
		public RuleCall getTextFieldParserRuleCall() { return cTextFieldParserRuleCall; }
	}

	public class CheckableElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CheckableElement");
		private final RuleCall cCheckboxParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//CheckableElement:
		//	Checkbox;
		public ParserRule getRule() { return rule; }

		//Checkbox
		public RuleCall getCheckboxParserRuleCall() { return cCheckboxParserRuleCall; }
	}

	public class ClickElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Click");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClickKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cClickableElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Click:
		//	"click(" ClickableElement ")";
		public ParserRule getRule() { return rule; }

		//"click(" ClickableElement ")"
		public Group getGroup() { return cGroup; }

		//"click("
		public Keyword getClickKeyword_0() { return cClickKeyword_0; }

		//ClickableElement
		public RuleCall getClickableElementParserRuleCall_1() { return cClickableElementParserRuleCall_1; }

		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}

	public class FillElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Fill");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFillKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cFillableElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cValueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cSTRINGTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Fill:
		//	"fill(" FillableElement ", value=" STRING ")";
		public ParserRule getRule() { return rule; }

		//"fill(" FillableElement ", value=" STRING ")"
		public Group getGroup() { return cGroup; }

		//"fill("
		public Keyword getFillKeyword_0() { return cFillKeyword_0; }

		//FillableElement
		public RuleCall getFillableElementParserRuleCall_1() { return cFillableElementParserRuleCall_1; }

		//", value="
		public Keyword getValueKeyword_2() { return cValueKeyword_2; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_3() { return cSTRINGTerminalRuleCall_3; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class ClearElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Clear");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClearKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cFillableElementParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cCheckableElementParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Clear:
		//	"clear(" (FillableElement | CheckableElement) ")";
		public ParserRule getRule() { return rule; }

		//"clear(" (FillableElement | CheckableElement) ")"
		public Group getGroup() { return cGroup; }

		//"clear("
		public Keyword getClearKeyword_0() { return cClearKeyword_0; }

		//FillableElement | CheckableElement
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//FillableElement
		public RuleCall getFillableElementParserRuleCall_1_0() { return cFillableElementParserRuleCall_1_0; }

		//CheckableElement
		public RuleCall getCheckableElementParserRuleCall_1_1() { return cCheckableElementParserRuleCall_1_1; }

		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}

	public class VerifyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Verify");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVerifyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cFillableElementParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cCheckableElementParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Verify:
		//	"verify(" (FillableElement | CheckableElement) ")";
		public ParserRule getRule() { return rule; }

		//"verify(" (FillableElement | CheckableElement) ")"
		public Group getGroup() { return cGroup; }

		//"verify("
		public Keyword getVerifyKeyword_0() { return cVerifyKeyword_0; }

		//FillableElement | CheckableElement
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//FillableElement
		public RuleCall getFillableElementParserRuleCall_1_0() { return cFillableElementParserRuleCall_1_0; }

		//CheckableElement
		public RuleCall getCheckableElementParserRuleCall_1_1() { return cCheckableElementParserRuleCall_1_1; }

		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}

	public class ExistElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Exist");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExistKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Exist:
		//	"exist(" Element ")";
		public ParserRule getRule() { return rule; }

		//"exist(" Element ")"
		public Group getGroup() { return cGroup; }

		//"exist("
		public Keyword getExistKeyword_0() { return cExistKeyword_0; }

		//Element
		public RuleCall getElementParserRuleCall_1() { return cElementParserRuleCall_1; }

		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}

	public class GoToElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GoTo");
		private final RuleCall cUrlParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//GoTo:
		//	Url;
		public ParserRule getRule() { return rule; }

		//Url
		public RuleCall getUrlParserRuleCall() { return cUrlParserRuleCall; }
	}

	public class CheckboxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Checkbox");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCheckboxKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Checkbox:
		//	"checkbox " name=STRING;
		public ParserRule getRule() { return rule; }

		//"checkbox " name=STRING
		public Group getGroup() { return cGroup; }

		//"checkbox "
		public Keyword getCheckboxKeyword_0() { return cCheckboxKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}

	public class LinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Link");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Link:
		//	"link " name=STRING;
		public ParserRule getRule() { return rule; }

		//"link " name=STRING
		public Group getGroup() { return cGroup; }

		//"link "
		public Keyword getLinkKeyword_0() { return cLinkKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}

	public class ButtonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Button");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cButtonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Button:
		//	"button " name=STRING;
		public ParserRule getRule() { return rule; }

		//"button " name=STRING
		public Group getGroup() { return cGroup; }

		//"button "
		public Keyword getButtonKeyword_0() { return cButtonKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}

	public class ImageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Image");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Image:
		//	"image " name=STRING;
		public ParserRule getRule() { return rule; }

		//"image " name=STRING
		public Group getGroup() { return cGroup; }

		//"image "
		public Keyword getImageKeyword_0() { return cImageKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}

	public class TextFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TextField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTextFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//TextField:
		//	"textField " name=STRING;
		public ParserRule getRule() { return rule; }

		//"textField " name=STRING
		public Group getGroup() { return cGroup; }

		//"textField "
		public Keyword getTextFieldKeyword_0() { return cTextFieldKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}

	public class UrlElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Url");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUrlKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Url:
		//	"url " name=STRING;
		public ParserRule getRule() { return rule; }

		//"url " name=STRING
		public Group getGroup() { return cGroup; }

		//"url "
		public Keyword getUrlKeyword_0() { return cUrlKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final ActionElements pAction;
	private final ElementElements pElement;
	private final ClickableElementElements pClickableElement;
	private final FillableElementElements pFillableElement;
	private final CheckableElementElements pCheckableElement;
	private final ClickElements pClick;
	private final FillElements pFill;
	private final ClearElements pClear;
	private final VerifyElements pVerify;
	private final ExistElements pExist;
	private final GoToElements pGoTo;
	private final CheckboxElements pCheckbox;
	private final LinkElements pLink;
	private final ButtonElements pButton;
	private final ImageElements pImage;
	private final TextFieldElements pTextField;
	private final UrlElements pUrl;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BrowserDSLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAction = new ActionElements();
		this.pElement = new ElementElements();
		this.pClickableElement = new ClickableElementElements();
		this.pFillableElement = new FillableElementElements();
		this.pCheckableElement = new CheckableElementElements();
		this.pClick = new ClickElements();
		this.pFill = new FillElements();
		this.pClear = new ClearElements();
		this.pVerify = new VerifyElements();
		this.pExist = new ExistElements();
		this.pGoTo = new GoToElements();
		this.pCheckbox = new CheckboxElements();
		this.pLink = new LinkElements();
		this.pButton = new ButtonElements();
		this.pImage = new ImageElements();
		this.pTextField = new TextFieldElements();
		this.pUrl = new UrlElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.mda.project.BrowserDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	actions+=Action*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Action:
	//	Click | Fill | Clear | Verify | Exist | GoTo;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}

	//Element:
	//	ClickableElement | FillableElement | CheckableElement;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}

	//ClickableElement:
	//	Link | Button | Image;
	public ClickableElementElements getClickableElementAccess() {
		return pClickableElement;
	}
	
	public ParserRule getClickableElementRule() {
		return getClickableElementAccess().getRule();
	}

	//FillableElement:
	//	TextField;
	public FillableElementElements getFillableElementAccess() {
		return pFillableElement;
	}
	
	public ParserRule getFillableElementRule() {
		return getFillableElementAccess().getRule();
	}

	//CheckableElement:
	//	Checkbox;
	public CheckableElementElements getCheckableElementAccess() {
		return pCheckableElement;
	}
	
	public ParserRule getCheckableElementRule() {
		return getCheckableElementAccess().getRule();
	}

	//Click:
	//	"click(" ClickableElement ")";
	public ClickElements getClickAccess() {
		return pClick;
	}
	
	public ParserRule getClickRule() {
		return getClickAccess().getRule();
	}

	//Fill:
	//	"fill(" FillableElement ", value=" STRING ")";
	public FillElements getFillAccess() {
		return pFill;
	}
	
	public ParserRule getFillRule() {
		return getFillAccess().getRule();
	}

	//Clear:
	//	"clear(" (FillableElement | CheckableElement) ")";
	public ClearElements getClearAccess() {
		return pClear;
	}
	
	public ParserRule getClearRule() {
		return getClearAccess().getRule();
	}

	//Verify:
	//	"verify(" (FillableElement | CheckableElement) ")";
	public VerifyElements getVerifyAccess() {
		return pVerify;
	}
	
	public ParserRule getVerifyRule() {
		return getVerifyAccess().getRule();
	}

	//Exist:
	//	"exist(" Element ")";
	public ExistElements getExistAccess() {
		return pExist;
	}
	
	public ParserRule getExistRule() {
		return getExistAccess().getRule();
	}

	//GoTo:
	//	Url;
	public GoToElements getGoToAccess() {
		return pGoTo;
	}
	
	public ParserRule getGoToRule() {
		return getGoToAccess().getRule();
	}

	//Checkbox:
	//	"checkbox " name=STRING;
	public CheckboxElements getCheckboxAccess() {
		return pCheckbox;
	}
	
	public ParserRule getCheckboxRule() {
		return getCheckboxAccess().getRule();
	}

	//Link:
	//	"link " name=STRING;
	public LinkElements getLinkAccess() {
		return pLink;
	}
	
	public ParserRule getLinkRule() {
		return getLinkAccess().getRule();
	}

	//Button:
	//	"button " name=STRING;
	public ButtonElements getButtonAccess() {
		return pButton;
	}
	
	public ParserRule getButtonRule() {
		return getButtonAccess().getRule();
	}

	//Image:
	//	"image " name=STRING;
	public ImageElements getImageAccess() {
		return pImage;
	}
	
	public ParserRule getImageRule() {
		return getImageAccess().getRule();
	}

	//TextField:
	//	"textField " name=STRING;
	public TextFieldElements getTextFieldAccess() {
		return pTextField;
	}
	
	public ParserRule getTextFieldRule() {
		return getTextFieldAccess().getRule();
	}

	//Url:
	//	"url " name=STRING;
	public UrlElements getUrlAccess() {
		return pUrl;
	}
	
	public ParserRule getUrlRule() {
		return getUrlAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
