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
	protected AbstractElementAlias match_BinarieExpression_SpaceEqualsSignEqualsSignSpaceKeyword_0_0_or_SpaceGreaterThanSignSpaceKeyword_0_1_or_SpaceLessThanSignSpaceKeyword_0_2;
	protected AbstractElementAlias match_Condition___AllKeyword_1_0_or_AnyKeyword_1_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BrowserDSLGrammarAccess) access;
		match_BinarieExpression_SpaceEqualsSignEqualsSignSpaceKeyword_0_0_or_SpaceGreaterThanSignSpaceKeyword_0_1_or_SpaceLessThanSignSpaceKeyword_0_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBinarieExpressionAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getBinarieExpressionAccess().getSpaceGreaterThanSignSpaceKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getBinarieExpressionAccess().getSpaceLessThanSignSpaceKeyword_0_2()));
		match_Condition___AllKeyword_1_0_or_AnyKeyword_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getConditionAccess().getAllKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getAnyKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_BinarieExpression_SpaceEqualsSignEqualsSignSpaceKeyword_0_0_or_SpaceGreaterThanSignSpaceKeyword_0_1_or_SpaceLessThanSignSpaceKeyword_0_2.equals(syntax))
				emit_BinarieExpression_SpaceEqualsSignEqualsSignSpaceKeyword_0_0_or_SpaceGreaterThanSignSpaceKeyword_0_1_or_SpaceLessThanSignSpaceKeyword_0_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Condition___AllKeyword_1_0_or_AnyKeyword_1_1__q.equals(syntax))
				emit_Condition___AllKeyword_1_0_or_AnyKeyword_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ' == ' | ' > ' | ' < '
	 */
	protected void emit_BinarieExpression_SpaceEqualsSignEqualsSignSpaceKeyword_0_0_or_SpaceGreaterThanSignSpaceKeyword_0_1_or_SpaceLessThanSignSpaceKeyword_0_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('all ' | 'any ')?
	 */
	protected void emit_Condition___AllKeyword_1_0_or_AnyKeyword_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
