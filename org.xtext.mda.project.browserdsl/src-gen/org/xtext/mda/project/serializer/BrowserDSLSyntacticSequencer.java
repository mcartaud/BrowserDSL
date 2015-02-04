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
	protected AbstractElementAlias match_Button_Checkbox_Clear_Click_Exist_Fill_GoTo_Image_Link_TextField_Verify___ExistKeyword_0___CheckboxKeyword_0_or_TextFieldKeyword_0_____or___UrlKeyword_0_or___FillKeyword_0_TextFieldKeyword_0___or_____ClearKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0_______or_____ClickKeyword_0_or_ExistKeyword_0_____ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0____;
	protected AbstractElementAlias match_Button_Checkbox_Clear_Click_Exist_Fill_Image_Link_TextField_Verify___ExistKeyword_0___CheckboxKeyword_0_or_TextFieldKeyword_0_____or_____ClickKeyword_0_or_ExistKeyword_0_____ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_____or_____FillKeyword_0_TextFieldKeyword_0___or_____ClearKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0______;
	protected AbstractElementAlias match_Button_Checkbox_Image_Link_TextField_ButtonKeyword_0_or_CheckboxKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_or_TextFieldKeyword_0;
	protected AbstractElementAlias match_Button_Image_Link_ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0;
	protected AbstractElementAlias match_Checkbox_TextField_CheckboxKeyword_0_or_TextFieldKeyword_0;
	protected AbstractElementAlias match_SubRoutine___STRINGTerminalRuleCall_3_0_CommaSpaceKeyword_3_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BrowserDSLGrammarAccess) access;
		match_Button_Checkbox_Clear_Click_Exist_Fill_GoTo_Image_Link_TextField_Verify___ExistKeyword_0___CheckboxKeyword_0_or_TextFieldKeyword_0_____or___UrlKeyword_0_or___FillKeyword_0_TextFieldKeyword_0___or_____ClearKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0_______or_____ClickKeyword_0_or_ExistKeyword_0_____ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0____ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClearAccess().getClearKeyword_0()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getVerifyKeyword_0())), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFillAccess().getFillKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0())), new TokenAlias(false, false, grammarAccess.getGoToAccess().getUrlKeyword_0())), new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClickAccess().getClickKeyword_0()), new TokenAlias(false, false, grammarAccess.getExistAccess().getExistKeyword_0())), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getButtonAccess().getButtonKeyword_0()), new TokenAlias(false, false, grammarAccess.getImageAccess().getImageKeyword_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getLinkKeyword_0()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getExistAccess().getExistKeyword_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()))));
		match_Button_Checkbox_Clear_Click_Exist_Fill_Image_Link_TextField_Verify___ExistKeyword_0___CheckboxKeyword_0_or_TextFieldKeyword_0_____or_____ClickKeyword_0_or_ExistKeyword_0_____ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_____or_____FillKeyword_0_TextFieldKeyword_0___or_____ClearKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0______ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClearAccess().getClearKeyword_0()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getVerifyKeyword_0())), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFillAccess().getFillKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()))), new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClickAccess().getClickKeyword_0()), new TokenAlias(false, false, grammarAccess.getExistAccess().getExistKeyword_0())), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getButtonAccess().getButtonKeyword_0()), new TokenAlias(false, false, grammarAccess.getImageAccess().getImageKeyword_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getLinkKeyword_0()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getExistAccess().getExistKeyword_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()))));
		match_Button_Checkbox_Image_Link_TextField_ButtonKeyword_0_or_CheckboxKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_or_TextFieldKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getButtonAccess().getButtonKeyword_0()), new TokenAlias(false, false, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()), new TokenAlias(false, false, grammarAccess.getImageAccess().getImageKeyword_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getLinkKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()));
		match_Button_Image_Link_ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getButtonAccess().getButtonKeyword_0()), new TokenAlias(false, false, grammarAccess.getImageAccess().getImageKeyword_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getLinkKeyword_0()));
		match_Checkbox_TextField_CheckboxKeyword_0_or_TextFieldKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()));
		match_SubRoutine___STRINGTerminalRuleCall_3_0_CommaSpaceKeyword_3_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getSubRoutineAccess().getSTRINGTerminalRuleCall_3_0()), new TokenAlias(false, false, grammarAccess.getSubRoutineAccess().getCommaSpaceKeyword_3_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getURLRule())
			return getURLToken(semanticObject, ruleCall, node);
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
	
	/**
	 * terminal URL:
	 *     ('a'..'z')+ '://'  
	 *     (         (
	 *             ('0'..'9')+ '.' ('0'..'9')+ '.' ('0'..'9')+ '.' ('0'..'9')+
	 *         ) |
	 *         (
	 *             ('a'..'z'|'A'..'Z')
	 *             (
	 *                 'a'..'z'|'A'..'Z'|
	 *                 '0'..'9'|
	 *                 '$'|
	 *                 '-'|
	 *                 '_'|
	 *                 (
	 *                     '\\'
	 *                     ('0'..'9'|'a'..'f'|'A'..'F')
	 *                     ('0'..'9'|'a'..'f'|'A'..'F')
	 *                 ) |
	 *                 (
	 *                     '%'
	 *                     ('0'..'9')
	 *                     ('0'..'9')
	 *                 )
	 *             )*
	 *             (
	 *                 '.'
	 *                 ('a'..'z'|'A'..'Z')
	 *                 (
	 *                     'a'..'z'|'A'..'Z'|
	 *                     '0'..'9'|
	 *                     '$'|
	 *                     '-'|
	 *                     '_'|
	 *                     (
	 *                         '\\'
	 *                         ('0'..'9'|'a'..'f'|'A'..'F')
	 *                         ('0'..'9'|'a'..'f'|'A'..'F')
	 *                     ) |
	 *                     (
	 *                         '%'
	 *                         ('0'..'9')
	 *                         ('0'..'9')
	 *                     )
	 *                 )*
	 *             )*
	 *         )
	 *     )
	 *     (':' ('0'..'9')+)?  
	 *     ('/'
	 *         (
	 *             'a'..'z'|'A'..'Z'|
	 *             '0'..'9'|
	 *             '$'|
	 *             '-'|
	 *             '_'|
	 *             '~'|
	 *             '+'|
	 *             '.'|
	 *             (
	 *                 '\\'
	 *                 ('0'..'9'|'a'..'f'|'A'..'F')
	 *                 ('0'..'9'|'a'..'f'|'A'..'F')
	 *             ) |
	 *             (
	 *                 '%'
	 *                 ('0'..'9')
	 *                 ('0'..'9')
	 *             )
	 *         )*
	 *     )*  
	 *     ('?'
	 *         (
	 *             'a'..'z'|'A'..'Z'|
	 *             '0'..'9'|
	 *             '$'|
	 *             '-'|
	 *             '_'|
	 *             '='|
	 *             '&'|
	 *             ';'|
	 *             (
	 *                 '\\'
	 *                 ('0'..'9'|'a'..'f'|'A'..'F')
	 *                 ('0'..'9'|'a'..'f'|'A'..'F')
	 *             ) |
	 *             (
	 *                 '%'
	 *                 ('0'..'9')
	 *                 ('0'..'9')
	 *             )
	 *         )+
	 *  
	 *         ('+'
	 *             (
	 *                 'a'..'z'|'A'..'Z'|
	 *                 '0'..'9'|
	 *                 '$'|
	 *                 '-'|
	 *                 '_'|
	 *                 '='|
	 *                 '&'|
	 *                 ';'|
	 *                 (
	 *                     '\\'
	 *                     ('0'..'9'|'a'..'f'|'A'..'F')
	 *                     ('0'..'9'|'a'..'f'|'A'..'F')
	 *                 ) |
	 *                 (
	 *                     '%'
	 *                     ('0'..'9')
	 *                     ('0'..'9')
	 *                 )
	 *             )+
	 *         )*
	 *     )?;
	 */
	protected String getURLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "://...";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Button_Checkbox_Clear_Click_Exist_Fill_GoTo_Image_Link_TextField_Verify___ExistKeyword_0___CheckboxKeyword_0_or_TextFieldKeyword_0_____or___UrlKeyword_0_or___FillKeyword_0_TextFieldKeyword_0___or_____ClearKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0_______or_____ClickKeyword_0_or_ExistKeyword_0_____ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0____.equals(syntax))
				emit_Button_Checkbox_Clear_Click_Exist_Fill_GoTo_Image_Link_TextField_Verify___ExistKeyword_0___CheckboxKeyword_0_or_TextFieldKeyword_0_____or___UrlKeyword_0_or___FillKeyword_0_TextFieldKeyword_0___or_____ClearKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0_______or_____ClickKeyword_0_or_ExistKeyword_0_____ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Button_Checkbox_Clear_Click_Exist_Fill_Image_Link_TextField_Verify___ExistKeyword_0___CheckboxKeyword_0_or_TextFieldKeyword_0_____or_____ClickKeyword_0_or_ExistKeyword_0_____ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_____or_____FillKeyword_0_TextFieldKeyword_0___or_____ClearKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0______.equals(syntax))
				emit_Button_Checkbox_Clear_Click_Exist_Fill_Image_Link_TextField_Verify___ExistKeyword_0___CheckboxKeyword_0_or_TextFieldKeyword_0_____or_____ClickKeyword_0_or_ExistKeyword_0_____ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_____or_____FillKeyword_0_TextFieldKeyword_0___or_____ClearKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0______(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Button_Checkbox_Image_Link_TextField_ButtonKeyword_0_or_CheckboxKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_or_TextFieldKeyword_0.equals(syntax))
				emit_Button_Checkbox_Image_Link_TextField_ButtonKeyword_0_or_CheckboxKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_or_TextFieldKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Button_Image_Link_ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0.equals(syntax))
				emit_Button_Image_Link_ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Checkbox_TextField_CheckboxKeyword_0_or_TextFieldKeyword_0.equals(syntax))
				emit_Checkbox_TextField_CheckboxKeyword_0_or_TextFieldKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SubRoutine___STRINGTerminalRuleCall_3_0_CommaSpaceKeyword_3_1__a.equals(syntax))
				emit_SubRoutine___STRINGTerminalRuleCall_3_0_CommaSpaceKeyword_3_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (
	     ('url=' | ('fill(' 'textField ') | (('clear(' | 'verify(') ('checkbox ' | 'textField '))) | 
	     ('exist(' ('checkbox ' | 'textField ')) | 
	     (('click(' | 'exist(') ('link ' | 'button ' | 'image '))
	 )
	 */
	protected void emit_Button_Checkbox_Clear_Click_Exist_Fill_GoTo_Image_Link_TextField_Verify___ExistKeyword_0___CheckboxKeyword_0_or_TextFieldKeyword_0_____or___UrlKeyword_0_or___FillKeyword_0_TextFieldKeyword_0___or_____ClearKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0_______or_____ClickKeyword_0_or_ExistKeyword_0_____ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0____(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     (('fill(' 'textField ') | (('clear(' | 'verify(') ('checkbox ' | 'textField '))) | 
	     ('exist(' ('checkbox ' | 'textField ')) | 
	     (('click(' | 'exist(') ('link ' | 'button ' | 'image '))
	 )
	 */
	protected void emit_Button_Checkbox_Clear_Click_Exist_Fill_Image_Link_TextField_Verify___ExistKeyword_0___CheckboxKeyword_0_or_TextFieldKeyword_0_____or_____ClickKeyword_0_or_ExistKeyword_0_____ButtonKeyword_0_or_ImageKeyword_0_or_LinkKeyword_0_____or_____FillKeyword_0_TextFieldKeyword_0___or_____ClearKeyword_0_or_VerifyKeyword_0_____CheckboxKeyword_0_or_TextFieldKeyword_0______(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (STRING ', ')*
	 */
	protected void emit_SubRoutine___STRINGTerminalRuleCall_3_0_CommaSpaceKeyword_3_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
