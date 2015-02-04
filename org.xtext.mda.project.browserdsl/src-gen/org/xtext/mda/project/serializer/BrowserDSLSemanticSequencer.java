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
import org.xtext.mda.project.browserDSL.BrowserDSLPackage;
import org.xtext.mda.project.browserDSL.List;
import org.xtext.mda.project.browserDSL.Main;
import org.xtext.mda.project.browserDSL.Model;
import org.xtext.mda.project.browserDSL.SubRoutine;
import org.xtext.mda.project.browserDSL.SubRoutineCall;
import org.xtext.mda.project.browserDSL.VariableList;
import org.xtext.mda.project.browserDSL.VariableString;
import org.xtext.mda.project.browserDSL.VariableUrl;
import org.xtext.mda.project.services.BrowserDSLGrammarAccess;

@SuppressWarnings("all")
public class BrowserDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BrowserDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BrowserDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BrowserDSLPackage.LIST:
				if(context == grammarAccess.getListRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.MAIN:
				if(context == grammarAccess.getMainRule()) {
					sequence_Main(context, (Main) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.SUB_ROUTINE:
				if(context == grammarAccess.getSubRoutineRule()) {
					sequence_SubRoutine(context, (SubRoutine) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.SUB_ROUTINE_CALL:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getSubRoutineCallRule()) {
					sequence_SubRoutineCall(context, (SubRoutineCall) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.VARIABLE_LIST:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getCheckableElementRule() ||
				   context == grammarAccess.getCheckboxRule() ||
				   context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getClickRule() ||
				   context == grammarAccess.getClickableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getExistRule() ||
				   context == grammarAccess.getFillRule() ||
				   context == grammarAccess.getFillableElementRule() ||
				   context == grammarAccess.getImageRule() ||
				   context == grammarAccess.getLinkRule() ||
				   context == grammarAccess.getTextFieldRule() ||
				   context == grammarAccess.getVariableRule() ||
				   context == grammarAccess.getVariableListRule() ||
				   context == grammarAccess.getVerifyRule()) {
					sequence_VariableList(context, (VariableList) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.VARIABLE_STRING:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getCheckableElementRule() ||
				   context == grammarAccess.getCheckboxRule() ||
				   context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getClickRule() ||
				   context == grammarAccess.getClickableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getExistRule() ||
				   context == grammarAccess.getFillRule() ||
				   context == grammarAccess.getFillableElementRule() ||
				   context == grammarAccess.getImageRule() ||
				   context == grammarAccess.getLinkRule() ||
				   context == grammarAccess.getTextFieldRule() ||
				   context == grammarAccess.getVariableRule() ||
				   context == grammarAccess.getVariableStringRule() ||
				   context == grammarAccess.getVerifyRule()) {
					sequence_VariableString(context, (VariableString) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.VARIABLE_URL:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getCheckableElementRule() ||
				   context == grammarAccess.getCheckboxRule() ||
				   context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getClickRule() ||
				   context == grammarAccess.getClickableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getExistRule() ||
				   context == grammarAccess.getFillRule() ||
				   context == grammarAccess.getFillableElementRule() ||
				   context == grammarAccess.getGoToRule() ||
				   context == grammarAccess.getImageRule() ||
				   context == grammarAccess.getLinkRule() ||
				   context == grammarAccess.getTextFieldRule() ||
				   context == grammarAccess.getVariableRule() ||
				   context == grammarAccess.getVariableUrlRule() ||
				   context == grammarAccess.getVerifyRule()) {
					sequence_VariableUrl(context, (VariableUrl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (element+=Element element+=Element*)
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (actions+=Action action+=Action*)
	 */
	protected void sequence_Main(EObject context, Main semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     main=Main
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.MODEL__MAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.MODEL__MAIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getMainMainParserRuleCall_0_0(), semanticObject.getMain());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id=[SubRoutine|ID]
	 */
	protected void sequence_SubRoutineCall(EObject context, SubRoutineCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.SUB_ROUTINE_CALL__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.SUB_ROUTINE_CALL__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubRoutineCallAccess().getIdSubRoutineIDTerminalRuleCall_0_1(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING action+=Action action+=Action*)
	 */
	protected void sequence_SubRoutine(EObject context, SubRoutine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING value=List)
	 */
	protected void sequence_VariableList(EObject context, VariableList semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.VARIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.VARIABLE_LIST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.VARIABLE_LIST__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableListAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableListAccess().getValueListParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_VariableString(EObject context, VariableString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.VARIABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableStringAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_VariableUrl(EObject context, VariableUrl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.VARIABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableUrlAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
