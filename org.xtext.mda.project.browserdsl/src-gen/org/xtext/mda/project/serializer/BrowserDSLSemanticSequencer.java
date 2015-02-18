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
import org.xtext.mda.project.browserDSL.Body;
import org.xtext.mda.project.browserDSL.BooleanValue;
import org.xtext.mda.project.browserDSL.BrowserDSLPackage;
import org.xtext.mda.project.browserDSL.Button;
import org.xtext.mda.project.browserDSL.ButtonAction;
import org.xtext.mda.project.browserDSL.CheckValue;
import org.xtext.mda.project.browserDSL.Checkbox;
import org.xtext.mda.project.browserDSL.CheckboxAction;
import org.xtext.mda.project.browserDSL.Clear;
import org.xtext.mda.project.browserDSL.Click;
import org.xtext.mda.project.browserDSL.Declaration;
import org.xtext.mda.project.browserDSL.Fill;
import org.xtext.mda.project.browserDSL.FunctionCall;
import org.xtext.mda.project.browserDSL.FunctionName;
import org.xtext.mda.project.browserDSL.FunctionReference;
import org.xtext.mda.project.browserDSL.GoTo;
import org.xtext.mda.project.browserDSL.Head;
import org.xtext.mda.project.browserDSL.Image;
import org.xtext.mda.project.browserDSL.ImageAction;
import org.xtext.mda.project.browserDSL.IntValue;
import org.xtext.mda.project.browserDSL.IsCheck;
import org.xtext.mda.project.browserDSL.Link;
import org.xtext.mda.project.browserDSL.LinkAction;
import org.xtext.mda.project.browserDSL.Main;
import org.xtext.mda.project.browserDSL.Program;
import org.xtext.mda.project.browserDSL.StringValue;
import org.xtext.mda.project.browserDSL.SubBody;
import org.xtext.mda.project.browserDSL.Subroutine;
import org.xtext.mda.project.browserDSL.TextAction;
import org.xtext.mda.project.browserDSL.TextField;
import org.xtext.mda.project.browserDSL.VariableName;
import org.xtext.mda.project.browserDSL.VariableReference;
import org.xtext.mda.project.services.BrowserDSLGrammarAccess;

@SuppressWarnings("all")
public class BrowserDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BrowserDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BrowserDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BrowserDSLPackage.BODY:
				if(context == grammarAccess.getBodyRule()) {
					sequence_Body(context, (Body) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.BOOLEAN_VALUE:
				if(context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getCallTypeRule() ||
				   context == grammarAccess.getValuesRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.BUTTON:
				if(context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Button(context, (Button) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.BUTTON_ACTION:
				if(context == grammarAccess.getButtonActionRule()) {
					sequence_ButtonAction(context, (ButtonAction) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CHECK_VALUE:
				if(context == grammarAccess.getCheckValueRule()) {
					sequence_CheckValue(context, (CheckValue) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CHECKBOX:
				if(context == grammarAccess.getCheckboxRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Checkbox(context, (Checkbox) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CHECKBOX_ACTION:
				if(context == grammarAccess.getCheckboxActionRule()) {
					sequence_CheckboxAction(context, (CheckboxAction) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CLEAR:
				if(context == grammarAccess.getCheckboxActionRule() ||
				   context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getTextActionRule()) {
					sequence_Clear(context, (Clear) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CLICK:
				if(context == grammarAccess.getClickRule()) {
					sequence_Click(context, (Click) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.FILL:
				if(context == grammarAccess.getFillRule() ||
				   context == grammarAccess.getTextActionRule()) {
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
				if(context == grammarAccess.getGoToRule() ||
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
				if(context == grammarAccess.getImageRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.IMAGE_ACTION:
				if(context == grammarAccess.getImageActionRule()) {
					sequence_ImageAction(context, (ImageAction) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.INT_VALUE:
				if(context == grammarAccess.getCallTypeRule() ||
				   context == grammarAccess.getIntValueRule() ||
				   context == grammarAccess.getValuesRule()) {
					sequence_IntValue(context, (IntValue) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.IS_CHECK:
				if(context == grammarAccess.getCheckboxActionRule() ||
				   context == grammarAccess.getIsCheckRule()) {
					sequence_IsCheck(context, (IsCheck) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.LINK:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLinkRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.LINK_ACTION:
				if(context == grammarAccess.getLinkActionRule()) {
					sequence_LinkAction(context, (LinkAction) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.MAIN:
				if(context == grammarAccess.getMainRule()) {
					sequence_Main(context, (Main) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.STRING_VALUE:
				if(context == grammarAccess.getCallTypeRule() ||
				   context == grammarAccess.getStringValueRule() ||
				   context == grammarAccess.getValuesRule()) {
					sequence_StringValue(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.SUB_BODY:
				if(context == grammarAccess.getSubBodyRule()) {
					sequence_SubBody(context, (SubBody) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.SUBROUTINE:
				if(context == grammarAccess.getSubroutineRule()) {
					sequence_Subroutine(context, (Subroutine) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.TEXT_ACTION:
				if(context == grammarAccess.getTextActionRule()) {
					sequence_TextAction(context, (TextAction) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.TEXT_FIELD:
				if(context == grammarAccess.getInstructionRule() ||
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
				if(context == grammarAccess.getCallTypeRule() ||
				   context == grammarAccess.getVariableRule() ||
				   context == grammarAccess.getVariableReferenceRule()) {
					sequence_VariableReference(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (go=GoTo instructions+=Instruction instructions+=Instruction*)
	 */
	protected void sequence_Body(EObject context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Boolean
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueBooleanEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ButtonAction=Click
	 */
	protected void sequence_ButtonAction(EObject context, ButtonAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.BUTTON_ACTION__BUTTON_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.BUTTON_ACTION__BUTTON_ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getButtonActionAccess().getButtonActionClickParserRuleCall_0(), semanticObject.getButtonAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((id=Values | id=Variable) action=ButtonAction)
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=Variable | value=Values)
	 */
	protected void sequence_CheckValue(EObject context, CheckValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     checkAction=Click
	 */
	protected void sequence_CheckboxAction(EObject context, CheckboxAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.CHECKBOX_ACTION__CHECK_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.CHECKBOX_ACTION__CHECK_ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckboxActionAccess().getCheckActionClickParserRuleCall_0_0(), semanticObject.getCheckAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((id=Values | id=Variable) action=CheckboxAction)
	 */
	protected void sequence_Checkbox(EObject context, Checkbox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val='.clear()'
	 */
	protected void sequence_Clear(EObject context, Clear semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val='.click()'
	 */
	protected void sequence_Click(EObject context, Click semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.CLICK__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.CLICK__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClickAccess().getValClickKeyword_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableName value=Values)
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.DECLARATION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.DECLARATION__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.DECLARATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclarationAccess().getVariableVariableNameParserRuleCall_1_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getDeclarationAccess().getValueValuesParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=Variable | value=Values)
	 */
	protected void sequence_Fill(EObject context, Fill semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (function=FunctionReference | (function=FunctionReference parameters+=CallType parameters+=CallType*))
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
	 *     ImageAction=Click
	 */
	protected void sequence_ImageAction(EObject context, ImageAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.IMAGE_ACTION__IMAGE_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.IMAGE_ACTION__IMAGE_ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImageActionAccess().getImageActionClickParserRuleCall_0(), semanticObject.getImageAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((id=Values | id=Variable) action=ImageAction)
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntValue(EObject context, IntValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.INT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     val=Boolean
	 */
	protected void sequence_IsCheck(EObject context, IsCheck semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     linkAction=Click
	 */
	protected void sequence_LinkAction(EObject context, LinkAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.LINK_ACTION__LINK_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.LINK_ACTION__LINK_ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLinkActionAccess().getLinkActionClickParserRuleCall_0(), semanticObject.getLinkAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((id=Values | id=Variable) action=LinkAction)
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
	 *     (browser=OpenBrowser variables+=Declaration* subroutines+=Subroutine* main=Main)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (instructions+=Instruction instructions+=Instruction*)
	 */
	protected void sequence_SubBody(EObject context, SubBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (head=Head body=SubBody)
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
		feeder.accept(grammarAccess.getSubroutineAccess().getBodySubBodyParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     taxtAction=CheckValue
	 */
	protected void sequence_TextAction(EObject context, TextAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.TEXT_ACTION__TAXT_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.TEXT_ACTION__TAXT_ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextActionAccess().getTaxtActionCheckValueParserRuleCall_0_0(), semanticObject.getTaxtAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((id=Values | id=Variable) action=TextAction)
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
}
