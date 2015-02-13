package org.xtext.mda.project.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.mda.project.browserDSL.Assignation;
import org.xtext.mda.project.browserDSL.BinarieExpression;
import org.xtext.mda.project.browserDSL.Body;
import org.xtext.mda.project.browserDSL.BrowserDSLPackage;
import org.xtext.mda.project.browserDSL.Button;
import org.xtext.mda.project.browserDSL.Check;
import org.xtext.mda.project.browserDSL.Checkbox;
import org.xtext.mda.project.browserDSL.Clear;
import org.xtext.mda.project.browserDSL.Click;
import org.xtext.mda.project.browserDSL.Condition;
import org.xtext.mda.project.browserDSL.Declaration;
import org.xtext.mda.project.browserDSL.Exist;
import org.xtext.mda.project.browserDSL.Fill;
import org.xtext.mda.project.browserDSL.FunctionCall;
import org.xtext.mda.project.browserDSL.FunctionName;
import org.xtext.mda.project.browserDSL.FunctionReference;
import org.xtext.mda.project.browserDSL.GoTo;
import org.xtext.mda.project.browserDSL.Head;
import org.xtext.mda.project.browserDSL.Image;
import org.xtext.mda.project.browserDSL.Link;
import org.xtext.mda.project.browserDSL.Main;
import org.xtext.mda.project.browserDSL.NotEpression;
import org.xtext.mda.project.browserDSL.Program;
import org.xtext.mda.project.browserDSL.Select;
import org.xtext.mda.project.browserDSL.StringValue;
import org.xtext.mda.project.browserDSL.Subroutine;
import org.xtext.mda.project.browserDSL.TextField;
import org.xtext.mda.project.browserDSL.VariableName;
import org.xtext.mda.project.browserDSL.VariableReference;
import org.xtext.mda.project.browserDSL.Verify;
import org.xtext.mda.project.browserDSL.While;
import org.xtext.mda.project.services.BrowserDSLGrammarAccess;

@SuppressWarnings("all")
public class BrowserDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BrowserDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BrowserDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BrowserDSLPackage.ASSIGNATION:
				if(context == grammarAccess.getAssignationRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Assignation(context, (Assignation) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.BINARIE_EXPRESSION:
				if(context == grammarAccess.getBinarieExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_BinarieExpression(context, (BinarieExpression) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.BODY:
				if(context == grammarAccess.getBodyRule()) {
					sequence_Body(context, (Body) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.BUTTON:
				if(context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getClickableElementRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_Button(context, (Button) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CHECK:
				if(context == grammarAccess.getActionInstructionRule() ||
				   context == grammarAccess.getCheckRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Check(context, (Check) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CHECKBOX:
				if(context == grammarAccess.getCheckableElementRule() ||
				   context == grammarAccess.getCheckboxRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_Checkbox(context, (Checkbox) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CLEAR:
				if(context == grammarAccess.getActionInstructionRule() ||
				   context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Clear(context, (Clear) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CLICK:
				if(context == grammarAccess.getActionInstructionRule() ||
				   context == grammarAccess.getClickRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Click(context, (Click) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CONDITION:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.EXIST:
				if(context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getExistRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_Exist(context, (Exist) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.FILL:
				if(context == grammarAccess.getActionInstructionRule() ||
				   context == grammarAccess.getFillRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Fill(context, (Fill) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.FUNCTION_CALL:
				if(context == grammarAccess.getFunctionCallRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.FUNCTION_NAME:
				if(context == grammarAccess.getFunctionNameRule()) {
					sequence_FunctionName(context, (FunctionName) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.FUNCTION_REFERENCE:
				if(context == grammarAccess.getFunctionReferenceRule()) {
					sequence_FunctionReference(context, (FunctionReference) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.GO_TO:
				if(context == grammarAccess.getActionInstructionRule() ||
				   context == grammarAccess.getGoToRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_GoTo(context, (GoTo) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.HEAD:
				if(context == grammarAccess.getHeadRule()) {
					sequence_Head(context, (Head) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.IMAGE:
				if(context == grammarAccess.getClickableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getImageRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.LINK:
				if(context == grammarAccess.getClickableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getLinkRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.MAIN:
				if(context == grammarAccess.getMainRule()) {
					sequence_Main(context, (Main) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.NOT_EPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNotEpressionRule()) {
					sequence_NotEpression(context, (NotEpression) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.SELECT:
				if(context == grammarAccess.getSelectRule()) {
					sequence_Select(context, (Select) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.STRING_VALUE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getStringValueRule()) {
					sequence_StringValue(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.SUBROUTINE:
				if(context == grammarAccess.getSubroutineRule()) {
					sequence_Subroutine(context, (Subroutine) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.TEXT_FIELD:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getFillableElementRule() ||
				   context == grammarAccess.getTextFieldRule()) {
					sequence_TextField(context, (TextField) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.VARIABLE_NAME:
				if(context == grammarAccess.getVariableNameRule()) {
					sequence_VariableName(context, (VariableName) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.VARIABLE_REFERENCE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getVariableRule() ||
				   context == grammarAccess.getVariableReferenceRule()) {
					sequence_VariableReference(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.VERIFY:
				if(context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getVerifyRule()) {
					sequence_Verify(context, (Verify) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.WHILE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getWhileRule()) {
					sequence_While(context, (While) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (variable=VariableReference value=Expression)
	 */
	protected void sequence_Assignation(EObject context, Assignation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.ASSIGNATION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.ASSIGNATION__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.ASSIGNATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.ASSIGNATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignationAccess().getVariableVariableReferenceParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAssignationAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpression=Expression rightExpression=Expression)
	 */
	protected void sequence_BinarieExpression(EObject context, BinarieExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.BINARIE_EXPRESSION__LEFT_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.BINARIE_EXPRESSION__LEFT_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.BINARIE_EXPRESSION__RIGHT_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.BINARIE_EXPRESSION__RIGHT_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBinarieExpressionAccess().getLeftExpressionExpressionParserRuleCall_1_0(), semanticObject.getLeftExpression());
		feeder.accept(grammarAccess.getBinarieExpressionAccess().getRightExpressionExpressionParserRuleCall_2_0(), semanticObject.getRightExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (instructions+=Instruction instructions+=Instruction*)
	 */
	protected void sequence_Body(EObject context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=StringValue | value=Variable)
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element=CheckableElement | element=Select | element=Variable)
	 */
	protected void sequence_Check(EObject context, Check semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=StringValue | value=Variable)
	 */
	protected void sequence_Checkbox(EObject context, Checkbox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element=FillableElement | element=CheckableElement | element=Select | element=Variable)
	 */
	protected void sequence_Clear(EObject context, Clear semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element=ClickableElement | element=Select | element=Variable)
	 */
	protected void sequence_Click(EObject context, Click semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression instructionsIf+=Instruction+ instructionsElse+=Instruction*)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableName (value=Expression | value=Element))
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element=Element | element=Select | element=Variable)
	 */
	protected void sequence_Exist(EObject context, Exist semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((element=FillableElement | element=Select | element=Variable) value=STRING)
	 */
	protected void sequence_Fill(EObject context, Fill semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (function=FunctionReference | (function=FunctionReference parameters+=Expression parameters+=Expression*))
	 */
	protected void sequence_FunctionCall(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_FunctionName(EObject context, FunctionName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.FUNCTION_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.FUNCTION_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionNameAccess().getNameSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     functionName=[FunctionName|ID]
	 */
	protected void sequence_FunctionReference(EObject context, FunctionReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.FUNCTION_REFERENCE__FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.FUNCTION_REFERENCE__FUNCTION_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionReferenceAccess().getFunctionNameFunctionNameIDTerminalRuleCall_0_1(), semanticObject.getFunctionName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     url=URL
	 */
	protected void sequence_GoTo(EObject context, GoTo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.GO_TO__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.GO_TO__URL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGoToAccess().getUrlURLTerminalRuleCall_1_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=FunctionName | (name=FunctionName nameParameters+=VariableName nameParameters+=VariableName*))
	 */
	protected void sequence_Head(EObject context, Head semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=StringValue | value=Variable)
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=StringValue | value=Variable)
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     body=Body
	 */
	protected void sequence_Main(EObject context, Main semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.MAIN__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.MAIN__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMainAccess().getBodyBodyParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expression
	 */
	protected void sequence_NotEpression(EObject context, NotEpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.NOT_EPRESSION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.NOT_EPRESSION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNotEpressionAccess().getExpExpressionParserRuleCall_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (browser=OpenBrowser subroutines+=Subroutine* main=Main)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=TypeElement
	 */
	protected void sequence_Select(EObject context, Select semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.SELECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.SELECT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectAccess().getValueTypeElementEnumRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringValue(EObject context, StringValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.STRING_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=Head body=Body)
	 */
	protected void sequence_Subroutine(EObject context, Subroutine semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.SUBROUTINE__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.SUBROUTINE__HEAD));
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.SUBROUTINE__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.SUBROUTINE__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubroutineAccess().getHeadHeadParserRuleCall_1_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getSubroutineAccess().getBodyBodyParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=StringValue | value=Variable)
	 */
	protected void sequence_TextField(EObject context, TextField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_VariableName(EObject context, VariableName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.VARIABLE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.VARIABLE_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableNameAccess().getNameSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     varID=[VariableName|ID]
	 */
	protected void sequence_VariableReference(EObject context, VariableReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.VARIABLE_REFERENCE__VAR_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.VARIABLE_REFERENCE__VAR_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableReferenceAccess().getVarIDVariableNameIDTerminalRuleCall_0_1(), semanticObject.getVarID());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((element=FillableElement | element=CheckableElement | element=Select | element=Variable) value=STRING)
	 */
	protected void sequence_Verify(EObject context, Verify semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression instructions+=Instruction+)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
