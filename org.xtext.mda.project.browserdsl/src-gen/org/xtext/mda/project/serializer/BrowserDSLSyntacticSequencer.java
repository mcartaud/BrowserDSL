package org.xtext.mda.project.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.mda.project.services.BrowserDSLGrammarAccess;

@SuppressWarnings("all")
public class BrowserDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BrowserDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Clear_Exist_Fill_Verify_ClearKeyword_0_0_or_ExistKeyword_0_or_FillKeyword_0_or_VerifyKeyword_0_0;
	protected AbstractElementAlias match_Click_Exist_ClickKeyword_0_or_ExistKeyword_0;
	protected AbstractElementAlias match_Exist_ExistKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BrowserDSLGrammarAccess) access;
		match_Clear_Exist_Fill_Verify_ClearKeyword_0_0_or_ExistKeyword_0_or_FillKeyword_0_or_VerifyKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClearAccess().getClearKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getExistAccess().getExistKeyword_0()), new TokenAlias(false, false, grammarAccess.getFillAccess().getFillKeyword_0()), new TokenAlias(false, false, grammarAccess.getVerifyAccess().getVerifyKeyword_0_0()));
		match_Click_Exist_ClickKeyword_0_or_ExistKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClickAccess().getClickKeyword_0()), new TokenAlias(false, false, grammarAccess.getExistAccess().getExistKeyword_0()));
		match_Exist_ExistKeyword_0_q = new TokenAlias(false, true, grammarAccess.getExistAccess().getExistKeyword_0());
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
			if(match_Clear_Exist_Fill_Verify_ClearKeyword_0_0_or_ExistKeyword_0_or_FillKeyword_0_or_VerifyKeyword_0_0.equals(syntax))
				emit_Clear_Exist_Fill_Verify_ClearKeyword_0_0_or_ExistKeyword_0_or_FillKeyword_0_or_VerifyKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Click_Exist_ClickKeyword_0_or_ExistKeyword_0.equals(syntax))
				emit_Click_Exist_ClickKeyword_0_or_ExistKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Exist_ExistKeyword_0_q.equals(syntax))
				emit_Exist_ExistKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'fill(' | 'clear(' | 'verify(' | 'exist('
	 */
	protected void emit_Clear_Exist_Fill_Verify_ClearKeyword_0_0_or_ExistKeyword_0_or_FillKeyword_0_or_VerifyKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'click(' | 'exist('
	 */
	protected void emit_Click_Exist_ClickKeyword_0_or_ExistKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'exist('?
	 */
	protected void emit_Exist_ExistKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
