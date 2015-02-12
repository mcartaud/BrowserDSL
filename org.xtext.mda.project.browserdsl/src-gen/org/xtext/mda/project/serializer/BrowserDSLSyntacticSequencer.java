package org.xtext.mda.project.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.mda.project.services.BrowserDSLGrammarAccess;

@SuppressWarnings("all")
public class BrowserDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BrowserDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Button_Checkbox_Exist_Image_Link_TextField_Verify___ExistKeyword_0___ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_____or_____ExistKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0____;
	protected AbstractElementAlias match_Button_Checkbox_Image_Link_TextField_ButtonKeyword_0_or_CheckboxKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_or_TextFieldKeyword_0;
	protected AbstractElementAlias match_Button_Image_Link_ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0;
	protected AbstractElementAlias match_Checkbox_TextField_CheckboxKeyword_0_or_TextFieldKeyword_0;
	protected AbstractElementAlias match_Condition___AllKeyword_1_0_or_AnyKeyword_1_1__q;
	protected AbstractElementAlias match_Exist_Verify_ExistKeyword_0_or_VerifyKeyword_0;
	protected AbstractElementAlias match_Expression_SpaceEqualsSignEqualsSignSpaceKeyword_3_0_0_or_SpaceGreaterThanSignSpaceKeyword_3_0_1_or_SpaceLessThanSignSpaceKeyword_3_0_2;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BrowserDSLGrammarAccess) access;
		match_Button_Checkbox_Exist_Image_Link_TextField_Verify___ExistKeyword_0___ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_____or_____ExistKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0____ = new AlternativeAlias(false, false, new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExistAccess().getExistKeyword_0()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getVerifyKeyword_0())), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getExistAccess().getExistKeyword_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getButtonAccess().getButtonKeyword_0()), new TokenAlias(false, false, grammarAccess.getImageAccess().getImageKeyword_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getLinkKeyword_0()))));
		match_Button_Checkbox_Image_Link_TextField_ButtonKeyword_0_or_CheckboxKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_or_TextFieldKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getButtonAccess().getButtonKeyword_0()), new TokenAlias(false, false, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()), new TokenAlias(false, false, grammarAccess.getImageAccess().getImageKeyword_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getLinkKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()));
		match_Button_Image_Link_ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getButtonAccess().getButtonKeyword_0()), new TokenAlias(false, false, grammarAccess.getImageAccess().getImageKeyword_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getLinkKeyword_0()));
		match_Checkbox_TextField_CheckboxKeyword_0_or_TextFieldKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()));
		match_Condition___AllKeyword_1_0_or_AnyKeyword_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getConditionAccess().getAllKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getAnyKeyword_1_1()));
		match_Exist_Verify_ExistKeyword_0_or_VerifyKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExistAccess().getExistKeyword_0()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getVerifyKeyword_0()));
		match_Expression_SpaceEqualsSignEqualsSignSpaceKeyword_3_0_0_or_SpaceGreaterThanSignSpaceKeyword_3_0_1_or_SpaceLessThanSignSpaceKeyword_3_0_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getSpaceGreaterThanSignSpaceKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getSpaceLessThanSignSpaceKeyword_3_0_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Button_Checkbox_Exist_Image_Link_TextField_Verify___ExistKeyword_0___ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_____or_____ExistKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0____.equals(syntax))
				emit_Button_Checkbox_Exist_Image_Link_TextField_Verify___ExistKeyword_0___ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_____or_____ExistKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Button_Checkbox_Image_Link_TextField_ButtonKeyword_0_or_CheckboxKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_or_TextFieldKeyword_0.equals(syntax))
				emit_Button_Checkbox_Image_Link_TextField_ButtonKeyword_0_or_CheckboxKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_or_TextFieldKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Button_Image_Link_ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0.equals(syntax))
				emit_Button_Image_Link_ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Checkbox_TextField_CheckboxKeyword_0_or_TextFieldKeyword_0.equals(syntax))
				emit_Checkbox_TextField_CheckboxKeyword_0_or_TextFieldKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Condition___AllKeyword_1_0_or_AnyKeyword_1_1__q.equals(syntax))
				emit_Condition___AllKeyword_1_0_or_AnyKeyword_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Exist_Verify_ExistKeyword_0_or_VerifyKeyword_0.equals(syntax))
				emit_Exist_Verify_ExistKeyword_0_or_VerifyKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_SpaceEqualsSignEqualsSignSpaceKeyword_3_0_0_or_SpaceGreaterThanSignSpaceKeyword_3_0_1_or_SpaceLessThanSignSpaceKeyword_3_0_2.equals(syntax))
				emit_Expression_SpaceEqualsSignEqualsSignSpaceKeyword_3_0_0_or_SpaceGreaterThanSignSpaceKeyword_3_0_1_or_SpaceLessThanSignSpaceKeyword_3_0_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('exist(' ('link ' | 'button ' | 'image ')) | (('verify(' | 'exist(') ('textField ' | 'checkbox '))
	 */
	protected void emit_Button_Checkbox_Exist_Image_Link_TextField_Verify___ExistKeyword_0___ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_____or_____ExistKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0____(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'link ' | 'button ' | 'image ' | 'textField ' | 'checkbox '
	 */
	protected void emit_Button_Checkbox_Image_Link_TextField_ButtonKeyword_0_or_CheckboxKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_or_TextFieldKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'link ' | 'button ' | 'image '
	 */
	protected void emit_Button_Image_Link_ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'textField ' | 'checkbox '
	 */
	protected void emit_Checkbox_TextField_CheckboxKeyword_0_or_TextFieldKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('all ' | 'any ')?
	 */
	protected void emit_Condition___AllKeyword_1_0_or_AnyKeyword_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'verify(' | 'exist('
	 */
	protected void emit_Exist_Verify_ExistKeyword_0_or_VerifyKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' == ' | ' > ' | ' < '
	 */
	protected void emit_Expression_SpaceEqualsSignEqualsSignSpaceKeyword_3_0_0_or_SpaceGreaterThanSignSpaceKeyword_3_0_1_or_SpaceLessThanSignSpaceKeyword_3_0_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
