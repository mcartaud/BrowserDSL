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
import org.xtext.mda.project.browserDSL.ActionExpression;
import org.xtext.mda.project.browserDSL.ActionInstruction;
import org.xtext.mda.project.browserDSL.Assignation;
import org.xtext.mda.project.browserDSL.Body;
import org.xtext.mda.project.browserDSL.BrowserDSLPackage;
import org.xtext.mda.project.browserDSL.Button;
import org.xtext.mda.project.browserDSL.Check;
import org.xtext.mda.project.browserDSL.Checkbox;
import org.xtext.mda.project.browserDSL.Click;
import org.xtext.mda.project.browserDSL.Condition;
import org.xtext.mda.project.browserDSL.Declaration;
import org.xtext.mda.project.browserDSL.Exist;
import org.xtext.mda.project.browserDSL.Expression;
import org.xtext.mda.project.browserDSL.Fill;
import org.xtext.mda.project.browserDSL.FunctionName;
import org.xtext.mda.project.browserDSL.FunctionReference;
import org.xtext.mda.project.browserDSL.GoTo;
import org.xtext.mda.project.browserDSL.Head;
import org.xtext.mda.project.browserDSL.Image;
import org.xtext.mda.project.browserDSL.Instruction;
import org.xtext.mda.project.browserDSL.Link;
import org.xtext.mda.project.browserDSL.Program;
import org.xtext.mda.project.browserDSL.Select;
import org.xtext.mda.project.browserDSL.Subroutine;
import org.xtext.mda.project.browserDSL.TextField;
import org.xtext.mda.project.browserDSL.TypeElement;
import org.xtext.mda.project.browserDSL.Variable;
import org.xtext.mda.project.browserDSL.VariableName;
import org.xtext.mda.project.browserDSL.VariableReference;
import org.xtext.mda.project.browserDSL.While;
import org.xtext.mda.project.services.BrowserDSLGrammarAccess;

@SuppressWarnings("all")
public class BrowserDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BrowserDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BrowserDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BrowserDSLPackage.ACTION_EXPRESSION:
				if(context == grammarAccess.getActionExpressionRule()) {
					sequence_ActionExpression(context, (ActionExpression) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.ACTION_INSTRUCTION:
				if(context == grammarAccess.getActionInstructionRule()) {
					sequence_ActionInstruction(context, (ActionInstruction) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.ASSIGNATION:
				if(context == grammarAccess.getAssignationRule()) {
					sequence_Assignation(context, (Assignation) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.BODY:
				if(context == grammarAccess.getBodyRule() ||
				   context == grammarAccess.getMainRule()) {
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
				if(context == grammarAccess.getCheckRule()) {
					sequence_Check(context, (Check) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CHECKBOX:
				if(context == grammarAccess.getCheckableElementRule() ||
				   context == grammarAccess.getCheckboxRule() ||
				   context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getVerifyRule()) {
					sequence_Checkbox(context, (Checkbox) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CLICK:
				if(context == grammarAccess.getClickRule()) {
					sequence_Click(context, (Click) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CONDITION:
				if(context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.EXIST:
				if(context == grammarAccess.getExistRule()) {
					sequence_Exist(context, (Exist) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.FILL:
				if(context == grammarAccess.getFillRule()) {
					sequence_Fill(context, (Fill) semanticObject); 
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
				if(context == grammarAccess.getFunctionCallRule() ||
				   context == grammarAccess.getFunctionReferenceRule()) {
					sequence_FunctionReference(context, (FunctionReference) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.GO_TO:
				if(context == grammarAccess.getActionInstructionRule() ||
				   context == grammarAccess.getGoToRule()) {
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
			case BrowserDSLPackage.INSTRUCTION:
				if(context == grammarAccess.getInstructionRule()) {
					sequence_Instruction(context, (Instruction) semanticObject); 
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
			case BrowserDSLPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.SELECT:
				if(context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getSelectRule() ||
				   context == grammarAccess.getVerifyRule()) {
					sequence_Select(context, (Select) semanticObject); 
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
				if(context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getFillableElementRule() ||
				   context == grammarAccess.getTextFieldRule() ||
				   context == grammarAccess.getVerifyRule()) {
					sequence_TextField(context, (TextField) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.TYPE_ELEMENT:
				if(context == grammarAccess.getTypeElementRule()) {
					sequence_TypeElement(context, (TypeElement) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.VARIABLE:
				if(context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getCheckableElementRule() ||
				   context == grammarAccess.getCheckboxRule() ||
				   context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getClickableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getFillableElementRule() ||
				   context == grammarAccess.getImageRule() ||
				   context == grammarAccess.getLinkRule() ||
				   context == grammarAccess.getTextFieldRule() ||
				   context == grammarAccess.getVariableRule() ||
				   context == grammarAccess.getVerifyRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
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
				if(context == grammarAccess.getVariableReferenceRule()) {
					sequence_VariableReference(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.WHILE:
				if(context == grammarAccess.getWhileRule()) {
					sequence_While(context, (While) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (expr=Verify | expr=Exist)
	 */
	protected void sequence_ActionExpression(EObject context, ActionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (action=Click | action=Check | action=Fill | action=Clear)
	 */
	protected void sequence_ActionInstruction(EObject context, ActionInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=VariableReference expr=Expression)
	 */
	protected void sequence_Assignation(EObject context, Assignation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.ASSIGNATION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.ASSIGNATION__VAR));
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.ASSIGNATION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.ASSIGNATION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignationAccess().getVarVariableReferenceParserRuleCall_0_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getAssignationAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
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
	 *     but=STRING
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.BUTTON__BUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.BUTTON__BUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getButtonAccess().getButSTRINGTerminalRuleCall_1_0_0(), semanticObject.getBut());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (val=CheckableElement | val=Select)
	 */
	protected void sequence_Check(EObject context, Check semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     check=STRING
	 */
	protected void sequence_Checkbox(EObject context, Checkbox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.CHECKBOX__CHECK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.CHECKBOX__CHECK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckboxAccess().getCheckSTRINGTerminalRuleCall_1_0_0(), semanticObject.getCheck());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (val=ClickableElement | val=Select)
	 */
	protected void sequence_Click(EObject context, Click semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp=Expression ins+=Instruction+ ins2+=Instruction+)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=VariableName val=Expression)
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.DECLARATION__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.DECLARATION__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclarationAccess().getNameVariableNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeclarationAccess().getValExpressionParserRuleCall_3_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (val=Element | val=Select)
	 */
	protected void sequence_Exist(EObject context, Exist semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type | var=Variable | act=ActionExpression | (left=Expression right=Expression) | exp=Expression)
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (val=FillableElement | val=Select)
	 */
	protected void sequence_Fill(EObject context, Fill semanticObject) {
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
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     url=URL
	 */
	protected void sequence_GoTo(EObject context, GoTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FunctionName | (name=FunctionName varId+=VariableName varId+=VariableName*))
	 */
	protected void sequence_Head(EObject context, Head semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     img=STRING
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.IMAGE__IMG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.IMAGE__IMG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImageAccess().getImgSTRINGTerminalRuleCall_1_0_0(), semanticObject.getImg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         dec=Declaration | 
	 *         cond=Condition | 
	 *         while=While | 
	 *         act=ActionInstruction | 
	 *         ass=Assignation | 
	 *         sub=FunctionCall
	 *     )
	 */
	protected void sequence_Instruction(EObject context, Instruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     link=STRING
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.LINK__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.LINK__LINK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLinkAccess().getLinkSTRINGTerminalRuleCall_1_0_0(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sub+=Subroutine* main=Main)
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
		feeder.accept(grammarAccess.getSelectAccess().getValueTypeElementParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=Head body+=Body)
	 */
	protected void sequence_Subroutine(EObject context, Subroutine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_TextField(EObject context, TextField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.TEXT_FIELD__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.TEXT_FIELD__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextFieldAccess().getTextSTRINGTerminalRuleCall_1_0_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elem='checkbox' | elem='link' | elem='button' | elem='image' | elem='textField')
	 */
	protected void sequence_TypeElement(EObject context, TypeElement semanticObject) {
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
	 *     var=VariableReference
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp=Expression ins+=Instruction+)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
