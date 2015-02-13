/*
* generated by Xtext
*/
package org.xtext.mda.project.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.mda.project.services.BrowserDSLGrammarAccess;

public class BrowserDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private BrowserDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.mda.project.ui.contentassist.antlr.internal.InternalBrowserDSLParser createParser() {
		org.xtext.mda.project.ui.contentassist.antlr.internal.InternalBrowserDSLParser result = new org.xtext.mda.project.ui.contentassist.antlr.internal.InternalBrowserDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getHeadAccess().getAlternatives(), "rule__Head__Alternatives");
					put(grammarAccess.getFunctionCallAccess().getAlternatives(), "rule__FunctionCall__Alternatives");
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getConditionAccess().getAlternatives_1(), "rule__Condition__Alternatives_1");
					put(grammarAccess.getActionInstructionAccess().getAlternatives(), "rule__ActionInstruction__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives_3_0(), "rule__Expression__Alternatives_3_0");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getActionExpressionAccess().getAlternatives(), "rule__ActionExpression__Alternatives");
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getClickableElementAccess().getAlternatives(), "rule__ClickableElement__Alternatives");
					put(grammarAccess.getCheckboxAccess().getAlternatives_1(), "rule__Checkbox__Alternatives_1");
					put(grammarAccess.getLinkAccess().getAlternatives_1(), "rule__Link__Alternatives_1");
					put(grammarAccess.getButtonAccess().getAlternatives_1(), "rule__Button__Alternatives_1");
					put(grammarAccess.getImageAccess().getAlternatives_1(), "rule__Image__Alternatives_1");
					put(grammarAccess.getTextFieldAccess().getAlternatives_1(), "rule__TextField__Alternatives_1");
					put(grammarAccess.getTypeElementAccess().getElemAlternatives_0(), "rule__TypeElement__ElemAlternatives_0");
					put(grammarAccess.getClickAccess().getValAlternatives_1_0(), "rule__Click__ValAlternatives_1_0");
					put(grammarAccess.getCheckAccess().getValAlternatives_1_0(), "rule__Check__ValAlternatives_1_0");
					put(grammarAccess.getFillAccess().getValAlternatives_1_0(), "rule__Fill__ValAlternatives_1_0");
					put(grammarAccess.getClearAccess().getAlternatives_1(), "rule__Clear__Alternatives_1");
					put(grammarAccess.getVerifyAccess().getAlternatives_1(), "rule__Verify__Alternatives_1");
					put(grammarAccess.getExistAccess().getValAlternatives_1_0(), "rule__Exist__ValAlternatives_1_0");
					put(grammarAccess.getOpenBrowserAccess().getAlternatives(), "rule__OpenBrowser__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getSubroutineAccess().getGroup(), "rule__Subroutine__Group__0");
					put(grammarAccess.getHeadAccess().getGroup_0(), "rule__Head__Group_0__0");
					put(grammarAccess.getHeadAccess().getGroup_1(), "rule__Head__Group_1__0");
					put(grammarAccess.getHeadAccess().getGroup_1_3(), "rule__Head__Group_1_3__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_0(), "rule__FunctionCall__Group_0__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1(), "rule__FunctionCall__Group_1__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1_3(), "rule__FunctionCall__Group_1_3__0");
					put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
					put(grammarAccess.getBodyAccess().getGroup(), "rule__Body__Group__0");
					put(grammarAccess.getBodyAccess().getGroup_4(), "rule__Body__Group_4__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
					put(grammarAccess.getAssignationAccess().getGroup(), "rule__Assignation__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_3(), "rule__Expression__Group_3__0");
					put(grammarAccess.getExpressionAccess().getGroup_4(), "rule__Expression__Group_4__0");
					put(grammarAccess.getCheckboxAccess().getGroup(), "rule__Checkbox__Group__0");
					put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
					put(grammarAccess.getButtonAccess().getGroup(), "rule__Button__Group__0");
					put(grammarAccess.getImageAccess().getGroup(), "rule__Image__Group__0");
					put(grammarAccess.getTextFieldAccess().getGroup(), "rule__TextField__Group__0");
					put(grammarAccess.getSelectAccess().getGroup(), "rule__Select__Group__0");
					put(grammarAccess.getClickAccess().getGroup(), "rule__Click__Group__0");
					put(grammarAccess.getCheckAccess().getGroup(), "rule__Check__Group__0");
					put(grammarAccess.getFillAccess().getGroup(), "rule__Fill__Group__0");
					put(grammarAccess.getClearAccess().getGroup(), "rule__Clear__Group__0");
					put(grammarAccess.getVerifyAccess().getGroup(), "rule__Verify__Group__0");
					put(grammarAccess.getExistAccess().getGroup(), "rule__Exist__Group__0");
					put(grammarAccess.getGoToAccess().getGroup(), "rule__GoTo__Group__0");
					put(grammarAccess.getProgramAccess().getSubAssignment_0(), "rule__Program__SubAssignment_0");
					put(grammarAccess.getProgramAccess().getMainAssignment_1(), "rule__Program__MainAssignment_1");
					put(grammarAccess.getSubroutineAccess().getHeadAssignment_1(), "rule__Subroutine__HeadAssignment_1");
					put(grammarAccess.getSubroutineAccess().getBodyAssignment_2(), "rule__Subroutine__BodyAssignment_2");
					put(grammarAccess.getHeadAccess().getNameAssignment_0_0(), "rule__Head__NameAssignment_0_0");
					put(grammarAccess.getHeadAccess().getNameAssignment_1_0(), "rule__Head__NameAssignment_1_0");
					put(grammarAccess.getHeadAccess().getVarIdAssignment_1_2(), "rule__Head__VarIdAssignment_1_2");
					put(grammarAccess.getHeadAccess().getVarIdAssignment_1_3_1(), "rule__Head__VarIdAssignment_1_3_1");
					put(grammarAccess.getFunctionReferenceAccess().getFunctionNameAssignment(), "rule__FunctionReference__FunctionNameAssignment");
					put(grammarAccess.getVariableReferenceAccess().getVarIDAssignment(), "rule__VariableReference__VarIDAssignment");
					put(grammarAccess.getFunctionCallAccess().getVarAssignment_1_2(), "rule__FunctionCall__VarAssignment_1_2");
					put(grammarAccess.getFunctionCallAccess().getVarAssignment_1_3_1(), "rule__FunctionCall__VarAssignment_1_3_1");
					put(grammarAccess.getFunctionNameAccess().getNameAssignment(), "rule__FunctionName__NameAssignment");
					put(grammarAccess.getBodyAccess().getOpenAssignment_1(), "rule__Body__OpenAssignment_1");
					put(grammarAccess.getBodyAccess().getInstructionsAssignment_3(), "rule__Body__InstructionsAssignment_3");
					put(grammarAccess.getBodyAccess().getInstructionsAssignment_4_1(), "rule__Body__InstructionsAssignment_4_1");
					put(grammarAccess.getInstructionAccess().getDecAssignment_0(), "rule__Instruction__DecAssignment_0");
					put(grammarAccess.getInstructionAccess().getCondAssignment_1(), "rule__Instruction__CondAssignment_1");
					put(grammarAccess.getInstructionAccess().getWhileAssignment_2(), "rule__Instruction__WhileAssignment_2");
					put(grammarAccess.getInstructionAccess().getActAssignment_3(), "rule__Instruction__ActAssignment_3");
					put(grammarAccess.getInstructionAccess().getAssAssignment_4(), "rule__Instruction__AssAssignment_4");
					put(grammarAccess.getInstructionAccess().getSubAssignment_5(), "rule__Instruction__SubAssignment_5");
					put(grammarAccess.getConditionAccess().getExpAssignment_3(), "rule__Condition__ExpAssignment_3");
					put(grammarAccess.getConditionAccess().getInsAssignment_6(), "rule__Condition__InsAssignment_6");
					put(grammarAccess.getConditionAccess().getIns2Assignment_8(), "rule__Condition__Ins2Assignment_8");
					put(grammarAccess.getWhileAccess().getExpAssignment_1(), "rule__While__ExpAssignment_1");
					put(grammarAccess.getWhileAccess().getInsAssignment_3(), "rule__While__InsAssignment_3");
					put(grammarAccess.getActionInstructionAccess().getActionAssignment_0(), "rule__ActionInstruction__ActionAssignment_0");
					put(grammarAccess.getActionInstructionAccess().getActionAssignment_1(), "rule__ActionInstruction__ActionAssignment_1");
					put(grammarAccess.getActionInstructionAccess().getActionAssignment_2(), "rule__ActionInstruction__ActionAssignment_2");
					put(grammarAccess.getActionInstructionAccess().getActionAssignment_3(), "rule__ActionInstruction__ActionAssignment_3");
					put(grammarAccess.getVariableNameAccess().getNameAssignment(), "rule__VariableName__NameAssignment");
					put(grammarAccess.getDeclarationAccess().getNameAssignment_1(), "rule__Declaration__NameAssignment_1");
					put(grammarAccess.getDeclarationAccess().getValAssignment_3(), "rule__Declaration__ValAssignment_3");
					put(grammarAccess.getAssignationAccess().getVarAssignment_0(), "rule__Assignation__VarAssignment_0");
					put(grammarAccess.getAssignationAccess().getExprAssignment_2(), "rule__Assignation__ExprAssignment_2");
					put(grammarAccess.getExpressionAccess().getTypeAssignment_0(), "rule__Expression__TypeAssignment_0");
					put(grammarAccess.getExpressionAccess().getVarAssignment_1(), "rule__Expression__VarAssignment_1");
					put(grammarAccess.getExpressionAccess().getActAssignment_2(), "rule__Expression__ActAssignment_2");
					put(grammarAccess.getExpressionAccess().getLeftAssignment_3_1(), "rule__Expression__LeftAssignment_3_1");
					put(grammarAccess.getExpressionAccess().getRightAssignment_3_2(), "rule__Expression__RightAssignment_3_2");
					put(grammarAccess.getExpressionAccess().getExpAssignment_4_1(), "rule__Expression__ExpAssignment_4_1");
					put(grammarAccess.getVariableAccess().getVarAssignment(), "rule__Variable__VarAssignment");
					put(grammarAccess.getActionExpressionAccess().getExprAssignment_0(), "rule__ActionExpression__ExprAssignment_0");
					put(grammarAccess.getActionExpressionAccess().getExprAssignment_1(), "rule__ActionExpression__ExprAssignment_1");
					put(grammarAccess.getCheckboxAccess().getCheckAssignment_1_0(), "rule__Checkbox__CheckAssignment_1_0");
					put(grammarAccess.getLinkAccess().getLinkAssignment_1_0(), "rule__Link__LinkAssignment_1_0");
					put(grammarAccess.getButtonAccess().getButAssignment_1_0(), "rule__Button__ButAssignment_1_0");
					put(grammarAccess.getImageAccess().getImgAssignment_1_0(), "rule__Image__ImgAssignment_1_0");
					put(grammarAccess.getTextFieldAccess().getTextAssignment_1_0(), "rule__TextField__TextAssignment_1_0");
					put(grammarAccess.getTypeElementAccess().getElemAssignment(), "rule__TypeElement__ElemAssignment");
					put(grammarAccess.getSelectAccess().getValueAssignment_1(), "rule__Select__ValueAssignment_1");
					put(grammarAccess.getClickAccess().getValAssignment_1(), "rule__Click__ValAssignment_1");
					put(grammarAccess.getCheckAccess().getValAssignment_1(), "rule__Check__ValAssignment_1");
					put(grammarAccess.getFillAccess().getValAssignment_1(), "rule__Fill__ValAssignment_1");
					put(grammarAccess.getExistAccess().getValAssignment_1(), "rule__Exist__ValAssignment_1");
					put(grammarAccess.getGoToAccess().getUrlAssignment_1(), "rule__GoTo__UrlAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.mda.project.ui.contentassist.antlr.internal.InternalBrowserDSLParser typedParser = (org.xtext.mda.project.ui.contentassist.antlr.internal.InternalBrowserDSLParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public BrowserDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BrowserDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
