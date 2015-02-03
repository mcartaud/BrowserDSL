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
import org.xtext.mda.project.browserDSL.Button;
import org.xtext.mda.project.browserDSL.Checkbox;
import org.xtext.mda.project.browserDSL.Image;
import org.xtext.mda.project.browserDSL.Link;
import org.xtext.mda.project.browserDSL.Model;
import org.xtext.mda.project.browserDSL.TextField;
import org.xtext.mda.project.browserDSL.Url;
import org.xtext.mda.project.services.BrowserDSLGrammarAccess;

@SuppressWarnings("all")
public class BrowserDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BrowserDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BrowserDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BrowserDSLPackage.BUTTON:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getClickRule() ||
				   context == grammarAccess.getClickableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getExistRule()) {
					sequence_Button(context, (Button) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.CHECKBOX:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getCheckableElementRule() ||
				   context == grammarAccess.getCheckboxRule() ||
				   context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getExistRule() ||
				   context == grammarAccess.getVerifyRule()) {
					sequence_Checkbox(context, (Checkbox) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.IMAGE:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getClickRule() ||
				   context == grammarAccess.getClickableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getExistRule() ||
				   context == grammarAccess.getImageRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.LINK:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getClickRule() ||
				   context == grammarAccess.getClickableElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getExistRule() ||
				   context == grammarAccess.getLinkRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.TEXT_FIELD:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getExistRule() ||
				   context == grammarAccess.getFillRule() ||
				   context == grammarAccess.getFillableElementRule() ||
				   context == grammarAccess.getTextFieldRule() ||
				   context == grammarAccess.getVerifyRule()) {
					sequence_TextField(context, (TextField) semanticObject); 
					return; 
				}
				else break;
			case BrowserDSLPackage.URL:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getGoToRule() ||
				   context == grammarAccess.getUrlRule()) {
					sequence_Url(context, (Url) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.CLICKABLE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.CLICKABLE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getButtonAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Checkbox(EObject context, Checkbox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.CHECKBOX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.CHECKBOX__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckboxAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.CLICKABLE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.CLICKABLE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImageAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.CLICKABLE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.CLICKABLE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLinkAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     actions+=Action*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_TextField(EObject context, TextField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.TEXT_FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.TEXT_FIELD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextFieldAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Url(EObject context, Url semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserDSLPackage.Literals.URL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserDSLPackage.Literals.URL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUrlAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
