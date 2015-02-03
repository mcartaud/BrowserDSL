/*
* generated by Xtext
*/
package org.xtext.mda.project.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.mda.project.services.BrowserDSLGrammarAccess;

public class BrowserDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private BrowserDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.mda.project.parser.antlr.internal.InternalBrowserDSLParser createParser(XtextTokenStream stream) {
		return new org.xtext.mda.project.parser.antlr.internal.InternalBrowserDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public BrowserDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BrowserDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
