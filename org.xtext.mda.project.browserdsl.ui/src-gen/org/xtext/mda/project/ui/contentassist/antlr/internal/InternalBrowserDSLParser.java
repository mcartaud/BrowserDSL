package org.xtext.mda.project.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.mda.project.services.BrowserDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_URL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'all '", "'any '", "' == '", "' > '", "' < '", "'bool '", "'string '", "'int '", "'checkbox'", "'link'", "'button'", "'image'", "'textField'", "'sub '", "'()'", "'(var '", "')'", "', var '", "'('", "','", "'main '", "'{'", "'}'", "'if '", "'then '", "'else '", "'endif'", "'while ('", "') do '", "' endwhile'", "'var '", "' = '", "';'", "' !'", "'checkbox '", "'link '", "'button '", "'image '", "'textField '", "'select('", "'click('", "');'", "'check('", "'fill('", "', value='", "'clear('", "'verify('", "'exist('", "'goTo('"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int RULE_URL=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBrowserDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBrowserDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBrowserDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g"; }


     
     	private BrowserDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BrowserDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProgram"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:61:1: ( ruleProgram EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:69:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:73:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:74:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:74:1: ( ( rule__Program__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:75:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:76:1: ( rule__Program__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:76:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram94);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleSubroutine"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:88:1: entryRuleSubroutine : ruleSubroutine EOF ;
    public final void entryRuleSubroutine() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:89:1: ( ruleSubroutine EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:90:1: ruleSubroutine EOF
            {
             before(grammarAccess.getSubroutineRule()); 
            pushFollow(FOLLOW_ruleSubroutine_in_entryRuleSubroutine121);
            ruleSubroutine();

            state._fsp--;

             after(grammarAccess.getSubroutineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutine128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubroutine"


    // $ANTLR start "ruleSubroutine"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:97:1: ruleSubroutine : ( ( rule__Subroutine__Group__0 ) ) ;
    public final void ruleSubroutine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:101:2: ( ( ( rule__Subroutine__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:102:1: ( ( rule__Subroutine__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:102:1: ( ( rule__Subroutine__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:103:1: ( rule__Subroutine__Group__0 )
            {
             before(grammarAccess.getSubroutineAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:104:1: ( rule__Subroutine__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:104:2: rule__Subroutine__Group__0
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__0_in_ruleSubroutine154);
            rule__Subroutine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubroutine"


    // $ANTLR start "entryRuleHead"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:116:1: entryRuleHead : ruleHead EOF ;
    public final void entryRuleHead() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:117:1: ( ruleHead EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:118:1: ruleHead EOF
            {
             before(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead181);
            ruleHead();

            state._fsp--;

             after(grammarAccess.getHeadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:125:1: ruleHead : ( ( rule__Head__Alternatives ) ) ;
    public final void ruleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:129:2: ( ( ( rule__Head__Alternatives ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:130:1: ( ( rule__Head__Alternatives ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:130:1: ( ( rule__Head__Alternatives ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:131:1: ( rule__Head__Alternatives )
            {
             before(grammarAccess.getHeadAccess().getAlternatives()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:132:1: ( rule__Head__Alternatives )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:132:2: rule__Head__Alternatives
            {
            pushFollow(FOLLOW_rule__Head__Alternatives_in_ruleHead214);
            rule__Head__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleFunctionReference"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:144:1: entryRuleFunctionReference : ruleFunctionReference EOF ;
    public final void entryRuleFunctionReference() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:145:1: ( ruleFunctionReference EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:146:1: ruleFunctionReference EOF
            {
             before(grammarAccess.getFunctionReferenceRule()); 
            pushFollow(FOLLOW_ruleFunctionReference_in_entryRuleFunctionReference241);
            ruleFunctionReference();

            state._fsp--;

             after(grammarAccess.getFunctionReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionReference248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionReference"


    // $ANTLR start "ruleFunctionReference"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:153:1: ruleFunctionReference : ( ( rule__FunctionReference__FunctionNameAssignment ) ) ;
    public final void ruleFunctionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:157:2: ( ( ( rule__FunctionReference__FunctionNameAssignment ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:158:1: ( ( rule__FunctionReference__FunctionNameAssignment ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:158:1: ( ( rule__FunctionReference__FunctionNameAssignment ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:159:1: ( rule__FunctionReference__FunctionNameAssignment )
            {
             before(grammarAccess.getFunctionReferenceAccess().getFunctionNameAssignment()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:160:1: ( rule__FunctionReference__FunctionNameAssignment )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:160:2: rule__FunctionReference__FunctionNameAssignment
            {
            pushFollow(FOLLOW_rule__FunctionReference__FunctionNameAssignment_in_ruleFunctionReference274);
            rule__FunctionReference__FunctionNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctionReferenceAccess().getFunctionNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionReference"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:172:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:173:1: ( ruleVariableReference EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:174:1: ruleVariableReference EOF
            {
             before(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference301);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getVariableReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:181:1: ruleVariableReference : ( ( rule__VariableReference__VarIDAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:185:2: ( ( ( rule__VariableReference__VarIDAssignment ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:186:1: ( ( rule__VariableReference__VarIDAssignment ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:186:1: ( ( rule__VariableReference__VarIDAssignment ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:187:1: ( rule__VariableReference__VarIDAssignment )
            {
             before(grammarAccess.getVariableReferenceAccess().getVarIDAssignment()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:188:1: ( rule__VariableReference__VarIDAssignment )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:188:2: rule__VariableReference__VarIDAssignment
            {
            pushFollow(FOLLOW_rule__VariableReference__VarIDAssignment_in_ruleVariableReference334);
            rule__VariableReference__VarIDAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableReferenceAccess().getVarIDAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:200:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:201:1: ( ruleFunctionCall EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:202:1: ruleFunctionCall EOF
            {
             before(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall361);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:209:1: ruleFunctionCall : ( ( rule__FunctionCall__Alternatives ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:213:2: ( ( ( rule__FunctionCall__Alternatives ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:214:1: ( ( rule__FunctionCall__Alternatives ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:214:1: ( ( rule__FunctionCall__Alternatives ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:215:1: ( rule__FunctionCall__Alternatives )
            {
             before(grammarAccess.getFunctionCallAccess().getAlternatives()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:216:1: ( rule__FunctionCall__Alternatives )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:216:2: rule__FunctionCall__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionCall__Alternatives_in_ruleFunctionCall394);
            rule__FunctionCall__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleFunctionName"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:228:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:229:1: ( ruleFunctionName EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:230:1: ruleFunctionName EOF
            {
             before(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName421);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:237:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:241:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:242:1: ( ( rule__FunctionName__NameAssignment ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:242:1: ( ( rule__FunctionName__NameAssignment ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:243:1: ( rule__FunctionName__NameAssignment )
            {
             before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:244:1: ( rule__FunctionName__NameAssignment )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:244:2: rule__FunctionName__NameAssignment
            {
            pushFollow(FOLLOW_rule__FunctionName__NameAssignment_in_ruleFunctionName454);
            rule__FunctionName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctionNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleMain"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:256:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:257:1: ( ruleMain EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:258:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain481);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:265:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:269:2: ( ( ( rule__Main__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:270:1: ( ( rule__Main__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:270:1: ( ( rule__Main__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:271:1: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:272:1: ( rule__Main__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:272:2: rule__Main__Group__0
            {
            pushFollow(FOLLOW_rule__Main__Group__0_in_ruleMain514);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleBody"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:284:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:285:1: ( ruleBody EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:286:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody541);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:293:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:297:2: ( ( ( rule__Body__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:298:1: ( ( rule__Body__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:298:1: ( ( rule__Body__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:299:1: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:300:1: ( rule__Body__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:300:2: rule__Body__Group__0
            {
            pushFollow(FOLLOW_rule__Body__Group__0_in_ruleBody574);
            rule__Body__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleInstruction"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:312:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:313:1: ( ruleInstruction EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:314:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction601);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:321:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:325:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:326:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:326:1: ( ( rule__Instruction__Alternatives ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:327:1: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:328:1: ( rule__Instruction__Alternatives )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:328:2: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction634);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleCondition"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:340:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:341:1: ( ruleCondition EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:342:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition661);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:349:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:353:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:354:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:354:1: ( ( rule__Condition__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:355:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:356:1: ( rule__Condition__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:356:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition694);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleWhile"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:368:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:369:1: ( ruleWhile EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:370:1: ruleWhile EOF
            {
             before(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile721);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getWhileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:377:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:381:2: ( ( ( rule__While__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:382:1: ( ( rule__While__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:382:1: ( ( rule__While__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:383:1: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:384:1: ( rule__While__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:384:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_ruleWhile754);
            rule__While__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleActionInstruction"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:396:1: entryRuleActionInstruction : ruleActionInstruction EOF ;
    public final void entryRuleActionInstruction() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:397:1: ( ruleActionInstruction EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:398:1: ruleActionInstruction EOF
            {
             before(grammarAccess.getActionInstructionRule()); 
            pushFollow(FOLLOW_ruleActionInstruction_in_entryRuleActionInstruction781);
            ruleActionInstruction();

            state._fsp--;

             after(grammarAccess.getActionInstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionInstruction788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionInstruction"


    // $ANTLR start "ruleActionInstruction"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:405:1: ruleActionInstruction : ( ( rule__ActionInstruction__Alternatives ) ) ;
    public final void ruleActionInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:409:2: ( ( ( rule__ActionInstruction__Alternatives ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:410:1: ( ( rule__ActionInstruction__Alternatives ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:410:1: ( ( rule__ActionInstruction__Alternatives ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:411:1: ( rule__ActionInstruction__Alternatives )
            {
             before(grammarAccess.getActionInstructionAccess().getAlternatives()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:412:1: ( rule__ActionInstruction__Alternatives )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:412:2: rule__ActionInstruction__Alternatives
            {
            pushFollow(FOLLOW_rule__ActionInstruction__Alternatives_in_ruleActionInstruction814);
            rule__ActionInstruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionInstruction"


    // $ANTLR start "entryRuleVariableName"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:424:1: entryRuleVariableName : ruleVariableName EOF ;
    public final void entryRuleVariableName() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:425:1: ( ruleVariableName EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:426:1: ruleVariableName EOF
            {
             before(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName841);
            ruleVariableName();

            state._fsp--;

             after(grammarAccess.getVariableNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableName"


    // $ANTLR start "ruleVariableName"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:433:1: ruleVariableName : ( ( rule__VariableName__NameAssignment ) ) ;
    public final void ruleVariableName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:437:2: ( ( ( rule__VariableName__NameAssignment ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:438:1: ( ( rule__VariableName__NameAssignment ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:438:1: ( ( rule__VariableName__NameAssignment ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:439:1: ( rule__VariableName__NameAssignment )
            {
             before(grammarAccess.getVariableNameAccess().getNameAssignment()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:440:1: ( rule__VariableName__NameAssignment )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:440:2: rule__VariableName__NameAssignment
            {
            pushFollow(FOLLOW_rule__VariableName__NameAssignment_in_ruleVariableName874);
            rule__VariableName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableName"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:452:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:453:1: ( ruleDeclaration EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:454:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration901);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:461:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:465:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:466:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:466:1: ( ( rule__Declaration__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:467:1: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:468:1: ( rule__Declaration__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:468:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration934);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleAssignation"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:480:1: entryRuleAssignation : ruleAssignation EOF ;
    public final void entryRuleAssignation() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:481:1: ( ruleAssignation EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:482:1: ruleAssignation EOF
            {
             before(grammarAccess.getAssignationRule()); 
            pushFollow(FOLLOW_ruleAssignation_in_entryRuleAssignation961);
            ruleAssignation();

            state._fsp--;

             after(grammarAccess.getAssignationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignation968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignation"


    // $ANTLR start "ruleAssignation"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:489:1: ruleAssignation : ( ( rule__Assignation__Group__0 ) ) ;
    public final void ruleAssignation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:493:2: ( ( ( rule__Assignation__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:494:1: ( ( rule__Assignation__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:494:1: ( ( rule__Assignation__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:495:1: ( rule__Assignation__Group__0 )
            {
             before(grammarAccess.getAssignationAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:496:1: ( rule__Assignation__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:496:2: rule__Assignation__Group__0
            {
            pushFollow(FOLLOW_rule__Assignation__Group__0_in_ruleAssignation994);
            rule__Assignation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignation"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:508:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:509:1: ( ruleExpression EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:510:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1021);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:517:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:521:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:522:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:522:1: ( ( rule__Expression__Alternatives ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:523:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:524:1: ( rule__Expression__Alternatives )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:524:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression1054);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:536:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:537:1: ( ruleType EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:538:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1081);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:545:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:549:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:550:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:550:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:551:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:552:1: ( rule__Type__Alternatives )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:552:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1114);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:564:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:565:1: ( ruleVariable EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:566:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1141);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:573:1: ruleVariable : ( ( rule__Variable__VarAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:577:2: ( ( ( rule__Variable__VarAssignment ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:578:1: ( ( rule__Variable__VarAssignment ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:578:1: ( ( rule__Variable__VarAssignment ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:579:1: ( rule__Variable__VarAssignment )
            {
             before(grammarAccess.getVariableAccess().getVarAssignment()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:580:1: ( rule__Variable__VarAssignment )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:580:2: rule__Variable__VarAssignment
            {
            pushFollow(FOLLOW_rule__Variable__VarAssignment_in_ruleVariable1174);
            rule__Variable__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleActionExpression"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:592:1: entryRuleActionExpression : ruleActionExpression EOF ;
    public final void entryRuleActionExpression() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:593:1: ( ruleActionExpression EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:594:1: ruleActionExpression EOF
            {
             before(grammarAccess.getActionExpressionRule()); 
            pushFollow(FOLLOW_ruleActionExpression_in_entryRuleActionExpression1201);
            ruleActionExpression();

            state._fsp--;

             after(grammarAccess.getActionExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionExpression1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionExpression"


    // $ANTLR start "ruleActionExpression"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:601:1: ruleActionExpression : ( ( rule__ActionExpression__Alternatives ) ) ;
    public final void ruleActionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:605:2: ( ( ( rule__ActionExpression__Alternatives ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:606:1: ( ( rule__ActionExpression__Alternatives ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:606:1: ( ( rule__ActionExpression__Alternatives ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:607:1: ( rule__ActionExpression__Alternatives )
            {
             before(grammarAccess.getActionExpressionAccess().getAlternatives()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:608:1: ( rule__ActionExpression__Alternatives )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:608:2: rule__ActionExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ActionExpression__Alternatives_in_ruleActionExpression1234);
            rule__ActionExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionExpression"


    // $ANTLR start "entryRuleElement"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:620:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:621:1: ( ruleElement EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:622:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement1261);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:629:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:633:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:634:1: ( ( rule__Element__Alternatives ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:634:1: ( ( rule__Element__Alternatives ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:635:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:636:1: ( rule__Element__Alternatives )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:636:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement1294);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleClickableElement"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:648:1: entryRuleClickableElement : ruleClickableElement EOF ;
    public final void entryRuleClickableElement() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:649:1: ( ruleClickableElement EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:650:1: ruleClickableElement EOF
            {
             before(grammarAccess.getClickableElementRule()); 
            pushFollow(FOLLOW_ruleClickableElement_in_entryRuleClickableElement1321);
            ruleClickableElement();

            state._fsp--;

             after(grammarAccess.getClickableElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClickableElement1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClickableElement"


    // $ANTLR start "ruleClickableElement"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:657:1: ruleClickableElement : ( ( rule__ClickableElement__Alternatives ) ) ;
    public final void ruleClickableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:661:2: ( ( ( rule__ClickableElement__Alternatives ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:662:1: ( ( rule__ClickableElement__Alternatives ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:662:1: ( ( rule__ClickableElement__Alternatives ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:663:1: ( rule__ClickableElement__Alternatives )
            {
             before(grammarAccess.getClickableElementAccess().getAlternatives()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:664:1: ( rule__ClickableElement__Alternatives )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:664:2: rule__ClickableElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ClickableElement__Alternatives_in_ruleClickableElement1354);
            rule__ClickableElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClickableElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClickableElement"


    // $ANTLR start "entryRuleFillableElement"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:676:1: entryRuleFillableElement : ruleFillableElement EOF ;
    public final void entryRuleFillableElement() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:677:1: ( ruleFillableElement EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:678:1: ruleFillableElement EOF
            {
             before(grammarAccess.getFillableElementRule()); 
            pushFollow(FOLLOW_ruleFillableElement_in_entryRuleFillableElement1381);
            ruleFillableElement();

            state._fsp--;

             after(grammarAccess.getFillableElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFillableElement1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFillableElement"


    // $ANTLR start "ruleFillableElement"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:685:1: ruleFillableElement : ( ruleTextField ) ;
    public final void ruleFillableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:689:2: ( ( ruleTextField ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:690:1: ( ruleTextField )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:690:1: ( ruleTextField )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:691:1: ruleTextField
            {
             before(grammarAccess.getFillableElementAccess().getTextFieldParserRuleCall()); 
            pushFollow(FOLLOW_ruleTextField_in_ruleFillableElement1414);
            ruleTextField();

            state._fsp--;

             after(grammarAccess.getFillableElementAccess().getTextFieldParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFillableElement"


    // $ANTLR start "entryRuleCheckableElement"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:704:1: entryRuleCheckableElement : ruleCheckableElement EOF ;
    public final void entryRuleCheckableElement() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:705:1: ( ruleCheckableElement EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:706:1: ruleCheckableElement EOF
            {
             before(grammarAccess.getCheckableElementRule()); 
            pushFollow(FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement1440);
            ruleCheckableElement();

            state._fsp--;

             after(grammarAccess.getCheckableElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckableElement1447); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckableElement"


    // $ANTLR start "ruleCheckableElement"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:713:1: ruleCheckableElement : ( ruleCheckbox ) ;
    public final void ruleCheckableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:717:2: ( ( ruleCheckbox ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:718:1: ( ruleCheckbox )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:718:1: ( ruleCheckbox )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:719:1: ruleCheckbox
            {
             before(grammarAccess.getCheckableElementAccess().getCheckboxParserRuleCall()); 
            pushFollow(FOLLOW_ruleCheckbox_in_ruleCheckableElement1473);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getCheckableElementAccess().getCheckboxParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckableElement"


    // $ANTLR start "entryRuleCheckbox"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:732:1: entryRuleCheckbox : ruleCheckbox EOF ;
    public final void entryRuleCheckbox() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:733:1: ( ruleCheckbox EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:734:1: ruleCheckbox EOF
            {
             before(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_ruleCheckbox_in_entryRuleCheckbox1499);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getCheckboxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckbox1506); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:741:1: ruleCheckbox : ( ( rule__Checkbox__Group__0 ) ) ;
    public final void ruleCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:745:2: ( ( ( rule__Checkbox__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:746:1: ( ( rule__Checkbox__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:746:1: ( ( rule__Checkbox__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:747:1: ( rule__Checkbox__Group__0 )
            {
             before(grammarAccess.getCheckboxAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:748:1: ( rule__Checkbox__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:748:2: rule__Checkbox__Group__0
            {
            pushFollow(FOLLOW_rule__Checkbox__Group__0_in_ruleCheckbox1532);
            rule__Checkbox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleLink"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:760:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:761:1: ( ruleLink EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:762:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1559);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1566); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:769:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:773:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:774:1: ( ( rule__Link__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:774:1: ( ( rule__Link__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:775:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:776:1: ( rule__Link__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:776:2: rule__Link__Group__0
            {
            pushFollow(FOLLOW_rule__Link__Group__0_in_ruleLink1592);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleButton"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:788:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:789:1: ( ruleButton EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:790:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton1619);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton1626); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:797:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:801:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:802:1: ( ( rule__Button__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:802:1: ( ( rule__Button__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:803:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:804:1: ( rule__Button__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:804:2: rule__Button__Group__0
            {
            pushFollow(FOLLOW_rule__Button__Group__0_in_ruleButton1652);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleImage"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:816:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:817:1: ( ruleImage EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:818:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage1679);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage1686); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:825:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:829:2: ( ( ( rule__Image__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:830:1: ( ( rule__Image__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:830:1: ( ( rule__Image__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:831:1: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:832:1: ( rule__Image__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:832:2: rule__Image__Group__0
            {
            pushFollow(FOLLOW_rule__Image__Group__0_in_ruleImage1712);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleTextField"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:844:1: entryRuleTextField : ruleTextField EOF ;
    public final void entryRuleTextField() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:845:1: ( ruleTextField EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:846:1: ruleTextField EOF
            {
             before(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_ruleTextField_in_entryRuleTextField1739);
            ruleTextField();

            state._fsp--;

             after(grammarAccess.getTextFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextField1746); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:853:1: ruleTextField : ( ( rule__TextField__Group__0 ) ) ;
    public final void ruleTextField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:857:2: ( ( ( rule__TextField__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:858:1: ( ( rule__TextField__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:858:1: ( ( rule__TextField__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:859:1: ( rule__TextField__Group__0 )
            {
             before(grammarAccess.getTextFieldAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:860:1: ( rule__TextField__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:860:2: rule__TextField__Group__0
            {
            pushFollow(FOLLOW_rule__TextField__Group__0_in_ruleTextField1772);
            rule__TextField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleTypeElement"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:872:1: entryRuleTypeElement : ruleTypeElement EOF ;
    public final void entryRuleTypeElement() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:873:1: ( ruleTypeElement EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:874:1: ruleTypeElement EOF
            {
             before(grammarAccess.getTypeElementRule()); 
            pushFollow(FOLLOW_ruleTypeElement_in_entryRuleTypeElement1799);
            ruleTypeElement();

            state._fsp--;

             after(grammarAccess.getTypeElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeElement1806); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeElement"


    // $ANTLR start "ruleTypeElement"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:881:1: ruleTypeElement : ( ( rule__TypeElement__ElemAssignment ) ) ;
    public final void ruleTypeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:885:2: ( ( ( rule__TypeElement__ElemAssignment ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:886:1: ( ( rule__TypeElement__ElemAssignment ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:886:1: ( ( rule__TypeElement__ElemAssignment ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:887:1: ( rule__TypeElement__ElemAssignment )
            {
             before(grammarAccess.getTypeElementAccess().getElemAssignment()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:888:1: ( rule__TypeElement__ElemAssignment )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:888:2: rule__TypeElement__ElemAssignment
            {
            pushFollow(FOLLOW_rule__TypeElement__ElemAssignment_in_ruleTypeElement1832);
            rule__TypeElement__ElemAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeElementAccess().getElemAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeElement"


    // $ANTLR start "entryRuleSelect"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:900:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:901:1: ( ruleSelect EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:902:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect1859);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect1866); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:909:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:913:2: ( ( ( rule__Select__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:914:1: ( ( rule__Select__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:914:1: ( ( rule__Select__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:915:1: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:916:1: ( rule__Select__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:916:2: rule__Select__Group__0
            {
            pushFollow(FOLLOW_rule__Select__Group__0_in_ruleSelect1892);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleClick"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:928:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:929:1: ( ruleClick EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:930:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_ruleClick_in_entryRuleClick1919);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClick1926); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:937:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:941:2: ( ( ( rule__Click__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:942:1: ( ( rule__Click__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:942:1: ( ( rule__Click__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:943:1: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:944:1: ( rule__Click__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:944:2: rule__Click__Group__0
            {
            pushFollow(FOLLOW_rule__Click__Group__0_in_ruleClick1952);
            rule__Click__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleCheck"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:956:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:957:1: ( ruleCheck EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:958:1: ruleCheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck1979);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck1986); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:965:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:969:2: ( ( ( rule__Check__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:970:1: ( ( rule__Check__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:970:1: ( ( rule__Check__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:971:1: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:972:1: ( rule__Check__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:972:2: rule__Check__Group__0
            {
            pushFollow(FOLLOW_rule__Check__Group__0_in_ruleCheck2012);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleFill"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:984:1: entryRuleFill : ruleFill EOF ;
    public final void entryRuleFill() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:985:1: ( ruleFill EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:986:1: ruleFill EOF
            {
             before(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_ruleFill_in_entryRuleFill2039);
            ruleFill();

            state._fsp--;

             after(grammarAccess.getFillRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFill2046); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:993:1: ruleFill : ( ( rule__Fill__Group__0 ) ) ;
    public final void ruleFill() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:997:2: ( ( ( rule__Fill__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:998:1: ( ( rule__Fill__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:998:1: ( ( rule__Fill__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:999:1: ( rule__Fill__Group__0 )
            {
             before(grammarAccess.getFillAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1000:1: ( rule__Fill__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1000:2: rule__Fill__Group__0
            {
            pushFollow(FOLLOW_rule__Fill__Group__0_in_ruleFill2072);
            rule__Fill__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleClear"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1012:1: entryRuleClear : ruleClear EOF ;
    public final void entryRuleClear() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1013:1: ( ruleClear EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1014:1: ruleClear EOF
            {
             before(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_ruleClear_in_entryRuleClear2099);
            ruleClear();

            state._fsp--;

             after(grammarAccess.getClearRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClear2106); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClear"


    // $ANTLR start "ruleClear"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1021:1: ruleClear : ( ( rule__Clear__Group__0 ) ) ;
    public final void ruleClear() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1025:2: ( ( ( rule__Clear__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1026:1: ( ( rule__Clear__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1026:1: ( ( rule__Clear__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1027:1: ( rule__Clear__Group__0 )
            {
             before(grammarAccess.getClearAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1028:1: ( rule__Clear__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1028:2: rule__Clear__Group__0
            {
            pushFollow(FOLLOW_rule__Clear__Group__0_in_ruleClear2132);
            rule__Clear__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClearAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClear"


    // $ANTLR start "entryRuleVerify"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1040:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1041:1: ( ruleVerify EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1042:1: ruleVerify EOF
            {
             before(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_ruleVerify_in_entryRuleVerify2159);
            ruleVerify();

            state._fsp--;

             after(grammarAccess.getVerifyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerify2166); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1049:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1053:2: ( ( ( rule__Verify__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1054:1: ( ( rule__Verify__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1054:1: ( ( rule__Verify__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1055:1: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1056:1: ( rule__Verify__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1056:2: rule__Verify__Group__0
            {
            pushFollow(FOLLOW_rule__Verify__Group__0_in_ruleVerify2192);
            rule__Verify__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleExist"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1068:1: entryRuleExist : ruleExist EOF ;
    public final void entryRuleExist() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1069:1: ( ruleExist EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1070:1: ruleExist EOF
            {
             before(grammarAccess.getExistRule()); 
            pushFollow(FOLLOW_ruleExist_in_entryRuleExist2219);
            ruleExist();

            state._fsp--;

             after(grammarAccess.getExistRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExist2226); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExist"


    // $ANTLR start "ruleExist"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1077:1: ruleExist : ( ( rule__Exist__Group__0 ) ) ;
    public final void ruleExist() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1081:2: ( ( ( rule__Exist__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1082:1: ( ( rule__Exist__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1082:1: ( ( rule__Exist__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1083:1: ( rule__Exist__Group__0 )
            {
             before(grammarAccess.getExistAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1084:1: ( rule__Exist__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1084:2: rule__Exist__Group__0
            {
            pushFollow(FOLLOW_rule__Exist__Group__0_in_ruleExist2252);
            rule__Exist__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExist"


    // $ANTLR start "entryRuleGoTo"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1096:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1097:1: ( ruleGoTo EOF )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1098:1: ruleGoTo EOF
            {
             before(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_ruleGoTo_in_entryRuleGoTo2279);
            ruleGoTo();

            state._fsp--;

             after(grammarAccess.getGoToRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoTo2286); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1105:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1109:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1110:1: ( ( rule__GoTo__Group__0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1110:1: ( ( rule__GoTo__Group__0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1111:1: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1112:1: ( rule__GoTo__Group__0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1112:2: rule__GoTo__Group__0
            {
            pushFollow(FOLLOW_rule__GoTo__Group__0_in_ruleGoTo2312);
            rule__GoTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "rule__Head__Alternatives"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1124:1: rule__Head__Alternatives : ( ( ( rule__Head__Group_0__0 ) ) | ( ( rule__Head__Group_1__0 ) ) );
    public final void rule__Head__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1128:1: ( ( ( rule__Head__Group_0__0 ) ) | ( ( rule__Head__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==27) ) {
                    alt1=2;
                }
                else if ( (LA1_1==26) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1129:1: ( ( rule__Head__Group_0__0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1129:1: ( ( rule__Head__Group_0__0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1130:1: ( rule__Head__Group_0__0 )
                    {
                     before(grammarAccess.getHeadAccess().getGroup_0()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1131:1: ( rule__Head__Group_0__0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1131:2: rule__Head__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Head__Group_0__0_in_rule__Head__Alternatives2348);
                    rule__Head__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHeadAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1135:6: ( ( rule__Head__Group_1__0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1135:6: ( ( rule__Head__Group_1__0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1136:1: ( rule__Head__Group_1__0 )
                    {
                     before(grammarAccess.getHeadAccess().getGroup_1()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1137:1: ( rule__Head__Group_1__0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1137:2: rule__Head__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Head__Group_1__0_in_rule__Head__Alternatives2366);
                    rule__Head__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHeadAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Alternatives"


    // $ANTLR start "rule__FunctionCall__Alternatives"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1146:1: rule__FunctionCall__Alternatives : ( ( ( rule__FunctionCall__Group_0__0 ) ) | ( ( rule__FunctionCall__Group_1__0 ) ) );
    public final void rule__FunctionCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1150:1: ( ( ( rule__FunctionCall__Group_0__0 ) ) | ( ( rule__FunctionCall__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==30) ) {
                    alt2=2;
                }
                else if ( (LA2_1==26) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1151:1: ( ( rule__FunctionCall__Group_0__0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1151:1: ( ( rule__FunctionCall__Group_0__0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1152:1: ( rule__FunctionCall__Group_0__0 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getGroup_0()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1153:1: ( rule__FunctionCall__Group_0__0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1153:2: rule__FunctionCall__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FunctionCall__Group_0__0_in_rule__FunctionCall__Alternatives2399);
                    rule__FunctionCall__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionCallAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1157:6: ( ( rule__FunctionCall__Group_1__0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1157:6: ( ( rule__FunctionCall__Group_1__0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1158:1: ( rule__FunctionCall__Group_1__0 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getGroup_1()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1159:1: ( rule__FunctionCall__Group_1__0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1159:2: rule__FunctionCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionCall__Group_1__0_in_rule__FunctionCall__Alternatives2417);
                    rule__FunctionCall__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionCallAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Alternatives"


    // $ANTLR start "rule__Instruction__Alternatives"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1168:1: rule__Instruction__Alternatives : ( ( ( rule__Instruction__DecAssignment_0 ) ) | ( ( rule__Instruction__CondAssignment_1 ) ) | ( ( rule__Instruction__WhileAssignment_2 ) ) | ( ( rule__Instruction__ActAssignment_3 ) ) | ( ( rule__Instruction__AssAssignment_4 ) ) | ( ( rule__Instruction__SubAssignment_5 ) ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1172:1: ( ( ( rule__Instruction__DecAssignment_0 ) ) | ( ( rule__Instruction__CondAssignment_1 ) ) | ( ( rule__Instruction__WhileAssignment_2 ) ) | ( ( rule__Instruction__ActAssignment_3 ) ) | ( ( rule__Instruction__AssAssignment_4 ) ) | ( ( rule__Instruction__SubAssignment_5 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            case 52:
            case 54:
            case 55:
            case 57:
            case 60:
                {
                alt3=4;
                }
                break;
            case RULE_ID:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==26||LA3_5==30) ) {
                    alt3=6;
                }
                else if ( (LA3_5==43) ) {
                    alt3=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1173:1: ( ( rule__Instruction__DecAssignment_0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1173:1: ( ( rule__Instruction__DecAssignment_0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1174:1: ( rule__Instruction__DecAssignment_0 )
                    {
                     before(grammarAccess.getInstructionAccess().getDecAssignment_0()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1175:1: ( rule__Instruction__DecAssignment_0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1175:2: rule__Instruction__DecAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Instruction__DecAssignment_0_in_rule__Instruction__Alternatives2450);
                    rule__Instruction__DecAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getDecAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1179:6: ( ( rule__Instruction__CondAssignment_1 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1179:6: ( ( rule__Instruction__CondAssignment_1 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1180:1: ( rule__Instruction__CondAssignment_1 )
                    {
                     before(grammarAccess.getInstructionAccess().getCondAssignment_1()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1181:1: ( rule__Instruction__CondAssignment_1 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1181:2: rule__Instruction__CondAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Instruction__CondAssignment_1_in_rule__Instruction__Alternatives2468);
                    rule__Instruction__CondAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getCondAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1185:6: ( ( rule__Instruction__WhileAssignment_2 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1185:6: ( ( rule__Instruction__WhileAssignment_2 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1186:1: ( rule__Instruction__WhileAssignment_2 )
                    {
                     before(grammarAccess.getInstructionAccess().getWhileAssignment_2()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1187:1: ( rule__Instruction__WhileAssignment_2 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1187:2: rule__Instruction__WhileAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Instruction__WhileAssignment_2_in_rule__Instruction__Alternatives2486);
                    rule__Instruction__WhileAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getWhileAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1191:6: ( ( rule__Instruction__ActAssignment_3 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1191:6: ( ( rule__Instruction__ActAssignment_3 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1192:1: ( rule__Instruction__ActAssignment_3 )
                    {
                     before(grammarAccess.getInstructionAccess().getActAssignment_3()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1193:1: ( rule__Instruction__ActAssignment_3 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1193:2: rule__Instruction__ActAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Instruction__ActAssignment_3_in_rule__Instruction__Alternatives2504);
                    rule__Instruction__ActAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getActAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1197:6: ( ( rule__Instruction__AssAssignment_4 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1197:6: ( ( rule__Instruction__AssAssignment_4 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1198:1: ( rule__Instruction__AssAssignment_4 )
                    {
                     before(grammarAccess.getInstructionAccess().getAssAssignment_4()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1199:1: ( rule__Instruction__AssAssignment_4 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1199:2: rule__Instruction__AssAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Instruction__AssAssignment_4_in_rule__Instruction__Alternatives2522);
                    rule__Instruction__AssAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getAssAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1203:6: ( ( rule__Instruction__SubAssignment_5 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1203:6: ( ( rule__Instruction__SubAssignment_5 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1204:1: ( rule__Instruction__SubAssignment_5 )
                    {
                     before(grammarAccess.getInstructionAccess().getSubAssignment_5()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1205:1: ( rule__Instruction__SubAssignment_5 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1205:2: rule__Instruction__SubAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Instruction__SubAssignment_5_in_rule__Instruction__Alternatives2540);
                    rule__Instruction__SubAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getSubAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1214:1: rule__Condition__Alternatives_1 : ( ( 'all ' ) | ( 'any ' ) );
    public final void rule__Condition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1218:1: ( ( 'all ' ) | ( 'any ' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1219:1: ( 'all ' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1219:1: ( 'all ' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1220:1: 'all '
                    {
                     before(grammarAccess.getConditionAccess().getAllKeyword_1_0()); 
                    match(input,12,FOLLOW_12_in_rule__Condition__Alternatives_12574); 
                     after(grammarAccess.getConditionAccess().getAllKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1227:6: ( 'any ' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1227:6: ( 'any ' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1228:1: 'any '
                    {
                     before(grammarAccess.getConditionAccess().getAnyKeyword_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__Condition__Alternatives_12594); 
                     after(grammarAccess.getConditionAccess().getAnyKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives_1"


    // $ANTLR start "rule__ActionInstruction__Alternatives"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1240:1: rule__ActionInstruction__Alternatives : ( ( ( rule__ActionInstruction__ActionAssignment_0 ) ) | ( ( rule__ActionInstruction__ActionAssignment_1 ) ) | ( ( rule__ActionInstruction__ActionAssignment_2 ) ) | ( ( rule__ActionInstruction__ActionAssignment_3 ) ) | ( ruleGoTo ) );
    public final void rule__ActionInstruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1244:1: ( ( ( rule__ActionInstruction__ActionAssignment_0 ) ) | ( ( rule__ActionInstruction__ActionAssignment_1 ) ) | ( ( rule__ActionInstruction__ActionAssignment_2 ) ) | ( ( rule__ActionInstruction__ActionAssignment_3 ) ) | ( ruleGoTo ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt5=1;
                }
                break;
            case 54:
                {
                alt5=2;
                }
                break;
            case 55:
                {
                alt5=3;
                }
                break;
            case 57:
                {
                alt5=4;
                }
                break;
            case 60:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1245:1: ( ( rule__ActionInstruction__ActionAssignment_0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1245:1: ( ( rule__ActionInstruction__ActionAssignment_0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1246:1: ( rule__ActionInstruction__ActionAssignment_0 )
                    {
                     before(grammarAccess.getActionInstructionAccess().getActionAssignment_0()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1247:1: ( rule__ActionInstruction__ActionAssignment_0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1247:2: rule__ActionInstruction__ActionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ActionInstruction__ActionAssignment_0_in_rule__ActionInstruction__Alternatives2628);
                    rule__ActionInstruction__ActionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionInstructionAccess().getActionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1251:6: ( ( rule__ActionInstruction__ActionAssignment_1 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1251:6: ( ( rule__ActionInstruction__ActionAssignment_1 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1252:1: ( rule__ActionInstruction__ActionAssignment_1 )
                    {
                     before(grammarAccess.getActionInstructionAccess().getActionAssignment_1()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1253:1: ( rule__ActionInstruction__ActionAssignment_1 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1253:2: rule__ActionInstruction__ActionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ActionInstruction__ActionAssignment_1_in_rule__ActionInstruction__Alternatives2646);
                    rule__ActionInstruction__ActionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionInstructionAccess().getActionAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1257:6: ( ( rule__ActionInstruction__ActionAssignment_2 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1257:6: ( ( rule__ActionInstruction__ActionAssignment_2 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1258:1: ( rule__ActionInstruction__ActionAssignment_2 )
                    {
                     before(grammarAccess.getActionInstructionAccess().getActionAssignment_2()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1259:1: ( rule__ActionInstruction__ActionAssignment_2 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1259:2: rule__ActionInstruction__ActionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ActionInstruction__ActionAssignment_2_in_rule__ActionInstruction__Alternatives2664);
                    rule__ActionInstruction__ActionAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionInstructionAccess().getActionAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1263:6: ( ( rule__ActionInstruction__ActionAssignment_3 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1263:6: ( ( rule__ActionInstruction__ActionAssignment_3 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1264:1: ( rule__ActionInstruction__ActionAssignment_3 )
                    {
                     before(grammarAccess.getActionInstructionAccess().getActionAssignment_3()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1265:1: ( rule__ActionInstruction__ActionAssignment_3 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1265:2: rule__ActionInstruction__ActionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ActionInstruction__ActionAssignment_3_in_rule__ActionInstruction__Alternatives2682);
                    rule__ActionInstruction__ActionAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionInstructionAccess().getActionAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1269:6: ( ruleGoTo )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1269:6: ( ruleGoTo )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1270:1: ruleGoTo
                    {
                     before(grammarAccess.getActionInstructionAccess().getGoToParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleGoTo_in_rule__ActionInstruction__Alternatives2700);
                    ruleGoTo();

                    state._fsp--;

                     after(grammarAccess.getActionInstructionAccess().getGoToParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionInstruction__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1280:1: rule__Expression__Alternatives : ( ( ( rule__Expression__TypeAssignment_0 ) ) | ( ( rule__Expression__VarAssignment_1 ) ) | ( ( rule__Expression__ActAssignment_2 ) ) | ( ( rule__Expression__Group_3__0 ) ) | ( ( rule__Expression__Group_4__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1284:1: ( ( ( rule__Expression__TypeAssignment_0 ) ) | ( ( rule__Expression__VarAssignment_1 ) ) | ( ( rule__Expression__ActAssignment_2 ) ) | ( ( rule__Expression__Group_3__0 ) ) | ( ( rule__Expression__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 58:
            case 59:
                {
                alt6=3;
                }
                break;
            case 14:
            case 15:
            case 16:
                {
                alt6=4;
                }
                break;
            case 45:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1285:1: ( ( rule__Expression__TypeAssignment_0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1285:1: ( ( rule__Expression__TypeAssignment_0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1286:1: ( rule__Expression__TypeAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getTypeAssignment_0()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1287:1: ( rule__Expression__TypeAssignment_0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1287:2: rule__Expression__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expression__TypeAssignment_0_in_rule__Expression__Alternatives2732);
                    rule__Expression__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1291:6: ( ( rule__Expression__VarAssignment_1 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1291:6: ( ( rule__Expression__VarAssignment_1 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1292:1: ( rule__Expression__VarAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getVarAssignment_1()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1293:1: ( rule__Expression__VarAssignment_1 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1293:2: rule__Expression__VarAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expression__VarAssignment_1_in_rule__Expression__Alternatives2750);
                    rule__Expression__VarAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getVarAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1297:6: ( ( rule__Expression__ActAssignment_2 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1297:6: ( ( rule__Expression__ActAssignment_2 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1298:1: ( rule__Expression__ActAssignment_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getActAssignment_2()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1299:1: ( rule__Expression__ActAssignment_2 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1299:2: rule__Expression__ActAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Expression__ActAssignment_2_in_rule__Expression__Alternatives2768);
                    rule__Expression__ActAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getActAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1303:6: ( ( rule__Expression__Group_3__0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1303:6: ( ( rule__Expression__Group_3__0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1304:1: ( rule__Expression__Group_3__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_3()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1305:1: ( rule__Expression__Group_3__0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1305:2: rule__Expression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_3__0_in_rule__Expression__Alternatives2786);
                    rule__Expression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1309:6: ( ( rule__Expression__Group_4__0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1309:6: ( ( rule__Expression__Group_4__0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1310:1: ( rule__Expression__Group_4__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_4()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1311:1: ( rule__Expression__Group_4__0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1311:2: rule__Expression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_4__0_in_rule__Expression__Alternatives2804);
                    rule__Expression__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives_3_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1320:1: rule__Expression__Alternatives_3_0 : ( ( ' == ' ) | ( ' > ' ) | ( ' < ' ) );
    public final void rule__Expression__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1324:1: ( ( ' == ' ) | ( ' > ' ) | ( ' < ' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1325:1: ( ' == ' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1325:1: ( ' == ' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1326:1: ' == '
                    {
                     before(grammarAccess.getExpressionAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_3_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Expression__Alternatives_3_02838); 
                     after(grammarAccess.getExpressionAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1333:6: ( ' > ' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1333:6: ( ' > ' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1334:1: ' > '
                    {
                     before(grammarAccess.getExpressionAccess().getSpaceGreaterThanSignSpaceKeyword_3_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Expression__Alternatives_3_02858); 
                     after(grammarAccess.getExpressionAccess().getSpaceGreaterThanSignSpaceKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1341:6: ( ' < ' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1341:6: ( ' < ' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1342:1: ' < '
                    {
                     before(grammarAccess.getExpressionAccess().getSpaceLessThanSignSpaceKeyword_3_0_2()); 
                    match(input,16,FOLLOW_16_in_rule__Expression__Alternatives_3_02878); 
                     after(grammarAccess.getExpressionAccess().getSpaceLessThanSignSpaceKeyword_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives_3_0"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1354:1: rule__Type__Alternatives : ( ( 'bool ' ) | ( 'string ' ) | ( 'int ' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1358:1: ( ( 'bool ' ) | ( 'string ' ) | ( 'int ' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1359:1: ( 'bool ' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1359:1: ( 'bool ' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1360:1: 'bool '
                    {
                     before(grammarAccess.getTypeAccess().getBoolKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__Type__Alternatives2913); 
                     after(grammarAccess.getTypeAccess().getBoolKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1367:6: ( 'string ' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1367:6: ( 'string ' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1368:1: 'string '
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__Type__Alternatives2933); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1375:6: ( 'int ' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1375:6: ( 'int ' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1376:1: 'int '
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_2()); 
                    match(input,19,FOLLOW_19_in_rule__Type__Alternatives2953); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__ActionExpression__Alternatives"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1388:1: rule__ActionExpression__Alternatives : ( ( ( rule__ActionExpression__ExprAssignment_0 ) ) | ( ( rule__ActionExpression__ExprAssignment_1 ) ) );
    public final void rule__ActionExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1392:1: ( ( ( rule__ActionExpression__ExprAssignment_0 ) ) | ( ( rule__ActionExpression__ExprAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==58) ) {
                alt9=1;
            }
            else if ( (LA9_0==59) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1393:1: ( ( rule__ActionExpression__ExprAssignment_0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1393:1: ( ( rule__ActionExpression__ExprAssignment_0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1394:1: ( rule__ActionExpression__ExprAssignment_0 )
                    {
                     before(grammarAccess.getActionExpressionAccess().getExprAssignment_0()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1395:1: ( rule__ActionExpression__ExprAssignment_0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1395:2: rule__ActionExpression__ExprAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ActionExpression__ExprAssignment_0_in_rule__ActionExpression__Alternatives2987);
                    rule__ActionExpression__ExprAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionExpressionAccess().getExprAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1399:6: ( ( rule__ActionExpression__ExprAssignment_1 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1399:6: ( ( rule__ActionExpression__ExprAssignment_1 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1400:1: ( rule__ActionExpression__ExprAssignment_1 )
                    {
                     before(grammarAccess.getActionExpressionAccess().getExprAssignment_1()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1401:1: ( rule__ActionExpression__ExprAssignment_1 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1401:2: rule__ActionExpression__ExprAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ActionExpression__ExprAssignment_1_in_rule__ActionExpression__Alternatives3005);
                    rule__ActionExpression__ExprAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionExpressionAccess().getExprAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression__Alternatives"


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1410:1: rule__Element__Alternatives : ( ( ruleClickableElement ) | ( ruleFillableElement ) | ( ruleCheckableElement ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1414:1: ( ( ruleClickableElement ) | ( ruleFillableElement ) | ( ruleCheckableElement ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 47:
            case 48:
            case 49:
                {
                alt10=1;
                }
                break;
            case 50:
                {
                alt10=2;
                }
                break;
            case 46:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1415:1: ( ruleClickableElement )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1415:1: ( ruleClickableElement )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1416:1: ruleClickableElement
                    {
                     before(grammarAccess.getElementAccess().getClickableElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleClickableElement_in_rule__Element__Alternatives3038);
                    ruleClickableElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getClickableElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1421:6: ( ruleFillableElement )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1421:6: ( ruleFillableElement )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1422:1: ruleFillableElement
                    {
                     before(grammarAccess.getElementAccess().getFillableElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFillableElement_in_rule__Element__Alternatives3055);
                    ruleFillableElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFillableElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1427:6: ( ruleCheckableElement )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1427:6: ( ruleCheckableElement )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1428:1: ruleCheckableElement
                    {
                     before(grammarAccess.getElementAccess().getCheckableElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCheckableElement_in_rule__Element__Alternatives3072);
                    ruleCheckableElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCheckableElementParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__ClickableElement__Alternatives"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1438:1: rule__ClickableElement__Alternatives : ( ( ruleLink ) | ( ruleButton ) | ( ruleImage ) );
    public final void rule__ClickableElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1442:1: ( ( ruleLink ) | ( ruleButton ) | ( ruleImage ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt11=1;
                }
                break;
            case 48:
                {
                alt11=2;
                }
                break;
            case 49:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1443:1: ( ruleLink )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1443:1: ( ruleLink )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1444:1: ruleLink
                    {
                     before(grammarAccess.getClickableElementAccess().getLinkParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLink_in_rule__ClickableElement__Alternatives3104);
                    ruleLink();

                    state._fsp--;

                     after(grammarAccess.getClickableElementAccess().getLinkParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1449:6: ( ruleButton )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1449:6: ( ruleButton )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1450:1: ruleButton
                    {
                     before(grammarAccess.getClickableElementAccess().getButtonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButton_in_rule__ClickableElement__Alternatives3121);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getClickableElementAccess().getButtonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1455:6: ( ruleImage )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1455:6: ( ruleImage )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1456:1: ruleImage
                    {
                     before(grammarAccess.getClickableElementAccess().getImageParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImage_in_rule__ClickableElement__Alternatives3138);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getClickableElementAccess().getImageParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickableElement__Alternatives"


    // $ANTLR start "rule__Checkbox__Alternatives_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1466:1: rule__Checkbox__Alternatives_1 : ( ( ( rule__Checkbox__CheckAssignment_1_0 ) ) | ( ruleVariable ) );
    public final void rule__Checkbox__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1470:1: ( ( ( rule__Checkbox__CheckAssignment_1_0 ) ) | ( ruleVariable ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1471:1: ( ( rule__Checkbox__CheckAssignment_1_0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1471:1: ( ( rule__Checkbox__CheckAssignment_1_0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1472:1: ( rule__Checkbox__CheckAssignment_1_0 )
                    {
                     before(grammarAccess.getCheckboxAccess().getCheckAssignment_1_0()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1473:1: ( rule__Checkbox__CheckAssignment_1_0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1473:2: rule__Checkbox__CheckAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Checkbox__CheckAssignment_1_0_in_rule__Checkbox__Alternatives_13170);
                    rule__Checkbox__CheckAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckboxAccess().getCheckAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1477:6: ( ruleVariable )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1477:6: ( ruleVariable )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1478:1: ruleVariable
                    {
                     before(grammarAccess.getCheckboxAccess().getVariableParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__Checkbox__Alternatives_13188);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getCheckboxAccess().getVariableParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Alternatives_1"


    // $ANTLR start "rule__Link__Alternatives_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1488:1: rule__Link__Alternatives_1 : ( ( ( rule__Link__LinkAssignment_1_0 ) ) | ( ruleVariable ) );
    public final void rule__Link__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1492:1: ( ( ( rule__Link__LinkAssignment_1_0 ) ) | ( ruleVariable ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1493:1: ( ( rule__Link__LinkAssignment_1_0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1493:1: ( ( rule__Link__LinkAssignment_1_0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1494:1: ( rule__Link__LinkAssignment_1_0 )
                    {
                     before(grammarAccess.getLinkAccess().getLinkAssignment_1_0()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1495:1: ( rule__Link__LinkAssignment_1_0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1495:2: rule__Link__LinkAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Link__LinkAssignment_1_0_in_rule__Link__Alternatives_13220);
                    rule__Link__LinkAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkAccess().getLinkAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1499:6: ( ruleVariable )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1499:6: ( ruleVariable )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1500:1: ruleVariable
                    {
                     before(grammarAccess.getLinkAccess().getVariableParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__Link__Alternatives_13238);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getLinkAccess().getVariableParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Alternatives_1"


    // $ANTLR start "rule__Button__Alternatives_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1510:1: rule__Button__Alternatives_1 : ( ( ( rule__Button__ButAssignment_1_0 ) ) | ( ruleVariable ) );
    public final void rule__Button__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1514:1: ( ( ( rule__Button__ButAssignment_1_0 ) ) | ( ruleVariable ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1515:1: ( ( rule__Button__ButAssignment_1_0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1515:1: ( ( rule__Button__ButAssignment_1_0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1516:1: ( rule__Button__ButAssignment_1_0 )
                    {
                     before(grammarAccess.getButtonAccess().getButAssignment_1_0()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1517:1: ( rule__Button__ButAssignment_1_0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1517:2: rule__Button__ButAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Button__ButAssignment_1_0_in_rule__Button__Alternatives_13270);
                    rule__Button__ButAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getButtonAccess().getButAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1521:6: ( ruleVariable )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1521:6: ( ruleVariable )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1522:1: ruleVariable
                    {
                     before(grammarAccess.getButtonAccess().getVariableParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__Button__Alternatives_13288);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getButtonAccess().getVariableParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Alternatives_1"


    // $ANTLR start "rule__Image__Alternatives_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1532:1: rule__Image__Alternatives_1 : ( ( ( rule__Image__ImgAssignment_1_0 ) ) | ( ruleVariable ) );
    public final void rule__Image__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1536:1: ( ( ( rule__Image__ImgAssignment_1_0 ) ) | ( ruleVariable ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1537:1: ( ( rule__Image__ImgAssignment_1_0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1537:1: ( ( rule__Image__ImgAssignment_1_0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1538:1: ( rule__Image__ImgAssignment_1_0 )
                    {
                     before(grammarAccess.getImageAccess().getImgAssignment_1_0()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1539:1: ( rule__Image__ImgAssignment_1_0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1539:2: rule__Image__ImgAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Image__ImgAssignment_1_0_in_rule__Image__Alternatives_13320);
                    rule__Image__ImgAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImageAccess().getImgAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1543:6: ( ruleVariable )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1543:6: ( ruleVariable )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1544:1: ruleVariable
                    {
                     before(grammarAccess.getImageAccess().getVariableParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__Image__Alternatives_13338);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getImageAccess().getVariableParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Alternatives_1"


    // $ANTLR start "rule__TextField__Alternatives_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1554:1: rule__TextField__Alternatives_1 : ( ( ( rule__TextField__TextAssignment_1_0 ) ) | ( ruleVariable ) );
    public final void rule__TextField__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1558:1: ( ( ( rule__TextField__TextAssignment_1_0 ) ) | ( ruleVariable ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1559:1: ( ( rule__TextField__TextAssignment_1_0 ) )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1559:1: ( ( rule__TextField__TextAssignment_1_0 ) )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1560:1: ( rule__TextField__TextAssignment_1_0 )
                    {
                     before(grammarAccess.getTextFieldAccess().getTextAssignment_1_0()); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1561:1: ( rule__TextField__TextAssignment_1_0 )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1561:2: rule__TextField__TextAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__TextField__TextAssignment_1_0_in_rule__TextField__Alternatives_13370);
                    rule__TextField__TextAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextFieldAccess().getTextAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1565:6: ( ruleVariable )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1565:6: ( ruleVariable )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1566:1: ruleVariable
                    {
                     before(grammarAccess.getTextFieldAccess().getVariableParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__TextField__Alternatives_13388);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getTextFieldAccess().getVariableParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Alternatives_1"


    // $ANTLR start "rule__TypeElement__ElemAlternatives_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1576:1: rule__TypeElement__ElemAlternatives_0 : ( ( 'checkbox' ) | ( 'link' ) | ( 'button' ) | ( 'image' ) | ( 'textField' ) );
    public final void rule__TypeElement__ElemAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1580:1: ( ( 'checkbox' ) | ( 'link' ) | ( 'button' ) | ( 'image' ) | ( 'textField' ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt17=1;
                }
                break;
            case 21:
                {
                alt17=2;
                }
                break;
            case 22:
                {
                alt17=3;
                }
                break;
            case 23:
                {
                alt17=4;
                }
                break;
            case 24:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1581:1: ( 'checkbox' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1581:1: ( 'checkbox' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1582:1: 'checkbox'
                    {
                     before(grammarAccess.getTypeElementAccess().getElemCheckboxKeyword_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__TypeElement__ElemAlternatives_03421); 
                     after(grammarAccess.getTypeElementAccess().getElemCheckboxKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1589:6: ( 'link' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1589:6: ( 'link' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1590:1: 'link'
                    {
                     before(grammarAccess.getTypeElementAccess().getElemLinkKeyword_0_1()); 
                    match(input,21,FOLLOW_21_in_rule__TypeElement__ElemAlternatives_03441); 
                     after(grammarAccess.getTypeElementAccess().getElemLinkKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1597:6: ( 'button' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1597:6: ( 'button' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1598:1: 'button'
                    {
                     before(grammarAccess.getTypeElementAccess().getElemButtonKeyword_0_2()); 
                    match(input,22,FOLLOW_22_in_rule__TypeElement__ElemAlternatives_03461); 
                     after(grammarAccess.getTypeElementAccess().getElemButtonKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1605:6: ( 'image' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1605:6: ( 'image' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1606:1: 'image'
                    {
                     before(grammarAccess.getTypeElementAccess().getElemImageKeyword_0_3()); 
                    match(input,23,FOLLOW_23_in_rule__TypeElement__ElemAlternatives_03481); 
                     after(grammarAccess.getTypeElementAccess().getElemImageKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1613:6: ( 'textField' )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1613:6: ( 'textField' )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1614:1: 'textField'
                    {
                     before(grammarAccess.getTypeElementAccess().getElemTextFieldKeyword_0_4()); 
                    match(input,24,FOLLOW_24_in_rule__TypeElement__ElemAlternatives_03501); 
                     after(grammarAccess.getTypeElementAccess().getElemTextFieldKeyword_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeElement__ElemAlternatives_0"


    // $ANTLR start "rule__Click__ValAlternatives_1_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1626:1: rule__Click__ValAlternatives_1_0 : ( ( ruleClickableElement ) | ( ruleSelect ) );
    public final void rule__Click__ValAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1630:1: ( ( ruleClickableElement ) | ( ruleSelect ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=47 && LA18_0<=49)) ) {
                alt18=1;
            }
            else if ( (LA18_0==51) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1631:1: ( ruleClickableElement )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1631:1: ( ruleClickableElement )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1632:1: ruleClickableElement
                    {
                     before(grammarAccess.getClickAccess().getValClickableElementParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleClickableElement_in_rule__Click__ValAlternatives_1_03535);
                    ruleClickableElement();

                    state._fsp--;

                     after(grammarAccess.getClickAccess().getValClickableElementParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1637:6: ( ruleSelect )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1637:6: ( ruleSelect )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1638:1: ruleSelect
                    {
                     before(grammarAccess.getClickAccess().getValSelectParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleSelect_in_rule__Click__ValAlternatives_1_03552);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getClickAccess().getValSelectParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__ValAlternatives_1_0"


    // $ANTLR start "rule__Check__ValAlternatives_1_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1648:1: rule__Check__ValAlternatives_1_0 : ( ( ruleCheckableElement ) | ( ruleSelect ) );
    public final void rule__Check__ValAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1652:1: ( ( ruleCheckableElement ) | ( ruleSelect ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            else if ( (LA19_0==51) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1653:1: ( ruleCheckableElement )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1653:1: ( ruleCheckableElement )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1654:1: ruleCheckableElement
                    {
                     before(grammarAccess.getCheckAccess().getValCheckableElementParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleCheckableElement_in_rule__Check__ValAlternatives_1_03584);
                    ruleCheckableElement();

                    state._fsp--;

                     after(grammarAccess.getCheckAccess().getValCheckableElementParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1659:6: ( ruleSelect )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1659:6: ( ruleSelect )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1660:1: ruleSelect
                    {
                     before(grammarAccess.getCheckAccess().getValSelectParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleSelect_in_rule__Check__ValAlternatives_1_03601);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getCheckAccess().getValSelectParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__ValAlternatives_1_0"


    // $ANTLR start "rule__Fill__ValAlternatives_1_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1670:1: rule__Fill__ValAlternatives_1_0 : ( ( ruleFillableElement ) | ( ruleSelect ) );
    public final void rule__Fill__ValAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1674:1: ( ( ruleFillableElement ) | ( ruleSelect ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==50) ) {
                alt20=1;
            }
            else if ( (LA20_0==51) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1675:1: ( ruleFillableElement )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1675:1: ( ruleFillableElement )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1676:1: ruleFillableElement
                    {
                     before(grammarAccess.getFillAccess().getValFillableElementParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleFillableElement_in_rule__Fill__ValAlternatives_1_03633);
                    ruleFillableElement();

                    state._fsp--;

                     after(grammarAccess.getFillAccess().getValFillableElementParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1681:6: ( ruleSelect )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1681:6: ( ruleSelect )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1682:1: ruleSelect
                    {
                     before(grammarAccess.getFillAccess().getValSelectParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleSelect_in_rule__Fill__ValAlternatives_1_03650);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getFillAccess().getValSelectParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__ValAlternatives_1_0"


    // $ANTLR start "rule__Clear__Alternatives_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1692:1: rule__Clear__Alternatives_1 : ( ( ruleFillableElement ) | ( ruleCheckableElement ) | ( ruleSelect ) );
    public final void rule__Clear__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1696:1: ( ( ruleFillableElement ) | ( ruleCheckableElement ) | ( ruleSelect ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt21=1;
                }
                break;
            case 46:
                {
                alt21=2;
                }
                break;
            case 51:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1697:1: ( ruleFillableElement )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1697:1: ( ruleFillableElement )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1698:1: ruleFillableElement
                    {
                     before(grammarAccess.getClearAccess().getFillableElementParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleFillableElement_in_rule__Clear__Alternatives_13682);
                    ruleFillableElement();

                    state._fsp--;

                     after(grammarAccess.getClearAccess().getFillableElementParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1703:6: ( ruleCheckableElement )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1703:6: ( ruleCheckableElement )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1704:1: ruleCheckableElement
                    {
                     before(grammarAccess.getClearAccess().getCheckableElementParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleCheckableElement_in_rule__Clear__Alternatives_13699);
                    ruleCheckableElement();

                    state._fsp--;

                     after(grammarAccess.getClearAccess().getCheckableElementParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1709:6: ( ruleSelect )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1709:6: ( ruleSelect )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1710:1: ruleSelect
                    {
                     before(grammarAccess.getClearAccess().getSelectParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_ruleSelect_in_rule__Clear__Alternatives_13716);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getClearAccess().getSelectParserRuleCall_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Alternatives_1"


    // $ANTLR start "rule__Verify__Alternatives_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1720:1: rule__Verify__Alternatives_1 : ( ( ruleFillableElement ) | ( ruleCheckableElement ) | ( ruleSelect ) );
    public final void rule__Verify__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1724:1: ( ( ruleFillableElement ) | ( ruleCheckableElement ) | ( ruleSelect ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt22=1;
                }
                break;
            case 46:
                {
                alt22=2;
                }
                break;
            case 51:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1725:1: ( ruleFillableElement )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1725:1: ( ruleFillableElement )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1726:1: ruleFillableElement
                    {
                     before(grammarAccess.getVerifyAccess().getFillableElementParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleFillableElement_in_rule__Verify__Alternatives_13748);
                    ruleFillableElement();

                    state._fsp--;

                     after(grammarAccess.getVerifyAccess().getFillableElementParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1731:6: ( ruleCheckableElement )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1731:6: ( ruleCheckableElement )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1732:1: ruleCheckableElement
                    {
                     before(grammarAccess.getVerifyAccess().getCheckableElementParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleCheckableElement_in_rule__Verify__Alternatives_13765);
                    ruleCheckableElement();

                    state._fsp--;

                     after(grammarAccess.getVerifyAccess().getCheckableElementParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1737:6: ( ruleSelect )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1737:6: ( ruleSelect )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1738:1: ruleSelect
                    {
                     before(grammarAccess.getVerifyAccess().getSelectParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_ruleSelect_in_rule__Verify__Alternatives_13782);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getVerifyAccess().getSelectParserRuleCall_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Alternatives_1"


    // $ANTLR start "rule__Exist__ValAlternatives_1_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1748:1: rule__Exist__ValAlternatives_1_0 : ( ( ruleElement ) | ( ruleSelect ) );
    public final void rule__Exist__ValAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1752:1: ( ( ruleElement ) | ( ruleSelect ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=46 && LA23_0<=50)) ) {
                alt23=1;
            }
            else if ( (LA23_0==51) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1753:1: ( ruleElement )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1753:1: ( ruleElement )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1754:1: ruleElement
                    {
                     before(grammarAccess.getExistAccess().getValElementParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleElement_in_rule__Exist__ValAlternatives_1_03814);
                    ruleElement();

                    state._fsp--;

                     after(grammarAccess.getExistAccess().getValElementParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1759:6: ( ruleSelect )
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1759:6: ( ruleSelect )
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1760:1: ruleSelect
                    {
                     before(grammarAccess.getExistAccess().getValSelectParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleSelect_in_rule__Exist__ValAlternatives_1_03831);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getExistAccess().getValSelectParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exist__ValAlternatives_1_0"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1772:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1776:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1777:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__03861);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__03864);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1784:1: rule__Program__Group__0__Impl : ( ( rule__Program__SubAssignment_0 )* ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1788:1: ( ( ( rule__Program__SubAssignment_0 )* ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1789:1: ( ( rule__Program__SubAssignment_0 )* )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1789:1: ( ( rule__Program__SubAssignment_0 )* )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1790:1: ( rule__Program__SubAssignment_0 )*
            {
             before(grammarAccess.getProgramAccess().getSubAssignment_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1791:1: ( rule__Program__SubAssignment_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1791:2: rule__Program__SubAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Program__SubAssignment_0_in_rule__Program__Group__0__Impl3891);
            	    rule__Program__SubAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getSubAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1801:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1805:1: ( rule__Program__Group__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1806:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__13922);
            rule__Program__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1812:1: rule__Program__Group__1__Impl : ( ( rule__Program__MainAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1816:1: ( ( ( rule__Program__MainAssignment_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1817:1: ( ( rule__Program__MainAssignment_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1817:1: ( ( rule__Program__MainAssignment_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1818:1: ( rule__Program__MainAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getMainAssignment_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1819:1: ( rule__Program__MainAssignment_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1819:2: rule__Program__MainAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__MainAssignment_1_in_rule__Program__Group__1__Impl3949);
            rule__Program__MainAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getMainAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Subroutine__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1833:1: rule__Subroutine__Group__0 : rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1 ;
    public final void rule__Subroutine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1837:1: ( rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1838:2: rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__0__Impl_in_rule__Subroutine__Group__03983);
            rule__Subroutine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__1_in_rule__Subroutine__Group__03986);
            rule__Subroutine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subroutine__Group__0"


    // $ANTLR start "rule__Subroutine__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1845:1: rule__Subroutine__Group__0__Impl : ( 'sub ' ) ;
    public final void rule__Subroutine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1849:1: ( ( 'sub ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1850:1: ( 'sub ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1850:1: ( 'sub ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1851:1: 'sub '
            {
             before(grammarAccess.getSubroutineAccess().getSubKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Subroutine__Group__0__Impl4014); 
             after(grammarAccess.getSubroutineAccess().getSubKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subroutine__Group__0__Impl"


    // $ANTLR start "rule__Subroutine__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1864:1: rule__Subroutine__Group__1 : rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2 ;
    public final void rule__Subroutine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1868:1: ( rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1869:2: rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__1__Impl_in_rule__Subroutine__Group__14045);
            rule__Subroutine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__2_in_rule__Subroutine__Group__14048);
            rule__Subroutine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subroutine__Group__1"


    // $ANTLR start "rule__Subroutine__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1876:1: rule__Subroutine__Group__1__Impl : ( ( rule__Subroutine__HeadAssignment_1 ) ) ;
    public final void rule__Subroutine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1880:1: ( ( ( rule__Subroutine__HeadAssignment_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1881:1: ( ( rule__Subroutine__HeadAssignment_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1881:1: ( ( rule__Subroutine__HeadAssignment_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1882:1: ( rule__Subroutine__HeadAssignment_1 )
            {
             before(grammarAccess.getSubroutineAccess().getHeadAssignment_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1883:1: ( rule__Subroutine__HeadAssignment_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1883:2: rule__Subroutine__HeadAssignment_1
            {
            pushFollow(FOLLOW_rule__Subroutine__HeadAssignment_1_in_rule__Subroutine__Group__1__Impl4075);
            rule__Subroutine__HeadAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineAccess().getHeadAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subroutine__Group__1__Impl"


    // $ANTLR start "rule__Subroutine__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1893:1: rule__Subroutine__Group__2 : rule__Subroutine__Group__2__Impl ;
    public final void rule__Subroutine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1897:1: ( rule__Subroutine__Group__2__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1898:2: rule__Subroutine__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__2__Impl_in_rule__Subroutine__Group__24105);
            rule__Subroutine__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subroutine__Group__2"


    // $ANTLR start "rule__Subroutine__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1904:1: rule__Subroutine__Group__2__Impl : ( ( rule__Subroutine__BodyAssignment_2 ) ) ;
    public final void rule__Subroutine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1908:1: ( ( ( rule__Subroutine__BodyAssignment_2 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1909:1: ( ( rule__Subroutine__BodyAssignment_2 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1909:1: ( ( rule__Subroutine__BodyAssignment_2 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1910:1: ( rule__Subroutine__BodyAssignment_2 )
            {
             before(grammarAccess.getSubroutineAccess().getBodyAssignment_2()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1911:1: ( rule__Subroutine__BodyAssignment_2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1911:2: rule__Subroutine__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__Subroutine__BodyAssignment_2_in_rule__Subroutine__Group__2__Impl4132);
            rule__Subroutine__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subroutine__Group__2__Impl"


    // $ANTLR start "rule__Head__Group_0__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1927:1: rule__Head__Group_0__0 : rule__Head__Group_0__0__Impl rule__Head__Group_0__1 ;
    public final void rule__Head__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1931:1: ( rule__Head__Group_0__0__Impl rule__Head__Group_0__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1932:2: rule__Head__Group_0__0__Impl rule__Head__Group_0__1
            {
            pushFollow(FOLLOW_rule__Head__Group_0__0__Impl_in_rule__Head__Group_0__04168);
            rule__Head__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Head__Group_0__1_in_rule__Head__Group_0__04171);
            rule__Head__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_0__0"


    // $ANTLR start "rule__Head__Group_0__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1939:1: rule__Head__Group_0__0__Impl : ( ( rule__Head__NameAssignment_0_0 ) ) ;
    public final void rule__Head__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1943:1: ( ( ( rule__Head__NameAssignment_0_0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1944:1: ( ( rule__Head__NameAssignment_0_0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1944:1: ( ( rule__Head__NameAssignment_0_0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1945:1: ( rule__Head__NameAssignment_0_0 )
            {
             before(grammarAccess.getHeadAccess().getNameAssignment_0_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1946:1: ( rule__Head__NameAssignment_0_0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1946:2: rule__Head__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Head__NameAssignment_0_0_in_rule__Head__Group_0__0__Impl4198);
            rule__Head__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_0__0__Impl"


    // $ANTLR start "rule__Head__Group_0__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1956:1: rule__Head__Group_0__1 : rule__Head__Group_0__1__Impl ;
    public final void rule__Head__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1960:1: ( rule__Head__Group_0__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1961:2: rule__Head__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Head__Group_0__1__Impl_in_rule__Head__Group_0__14228);
            rule__Head__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_0__1"


    // $ANTLR start "rule__Head__Group_0__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1967:1: rule__Head__Group_0__1__Impl : ( '()' ) ;
    public final void rule__Head__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1971:1: ( ( '()' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1972:1: ( '()' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1972:1: ( '()' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1973:1: '()'
            {
             before(grammarAccess.getHeadAccess().getLeftParenthesisRightParenthesisKeyword_0_1()); 
            match(input,26,FOLLOW_26_in_rule__Head__Group_0__1__Impl4256); 
             after(grammarAccess.getHeadAccess().getLeftParenthesisRightParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_0__1__Impl"


    // $ANTLR start "rule__Head__Group_1__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1990:1: rule__Head__Group_1__0 : rule__Head__Group_1__0__Impl rule__Head__Group_1__1 ;
    public final void rule__Head__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1994:1: ( rule__Head__Group_1__0__Impl rule__Head__Group_1__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1995:2: rule__Head__Group_1__0__Impl rule__Head__Group_1__1
            {
            pushFollow(FOLLOW_rule__Head__Group_1__0__Impl_in_rule__Head__Group_1__04291);
            rule__Head__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Head__Group_1__1_in_rule__Head__Group_1__04294);
            rule__Head__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1__0"


    // $ANTLR start "rule__Head__Group_1__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2002:1: rule__Head__Group_1__0__Impl : ( ( rule__Head__NameAssignment_1_0 ) ) ;
    public final void rule__Head__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2006:1: ( ( ( rule__Head__NameAssignment_1_0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2007:1: ( ( rule__Head__NameAssignment_1_0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2007:1: ( ( rule__Head__NameAssignment_1_0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2008:1: ( rule__Head__NameAssignment_1_0 )
            {
             before(grammarAccess.getHeadAccess().getNameAssignment_1_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2009:1: ( rule__Head__NameAssignment_1_0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2009:2: rule__Head__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Head__NameAssignment_1_0_in_rule__Head__Group_1__0__Impl4321);
            rule__Head__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1__0__Impl"


    // $ANTLR start "rule__Head__Group_1__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2019:1: rule__Head__Group_1__1 : rule__Head__Group_1__1__Impl rule__Head__Group_1__2 ;
    public final void rule__Head__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2023:1: ( rule__Head__Group_1__1__Impl rule__Head__Group_1__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2024:2: rule__Head__Group_1__1__Impl rule__Head__Group_1__2
            {
            pushFollow(FOLLOW_rule__Head__Group_1__1__Impl_in_rule__Head__Group_1__14351);
            rule__Head__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Head__Group_1__2_in_rule__Head__Group_1__14354);
            rule__Head__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1__1"


    // $ANTLR start "rule__Head__Group_1__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2031:1: rule__Head__Group_1__1__Impl : ( '(var ' ) ;
    public final void rule__Head__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2035:1: ( ( '(var ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2036:1: ( '(var ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2036:1: ( '(var ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2037:1: '(var '
            {
             before(grammarAccess.getHeadAccess().getVarKeyword_1_1()); 
            match(input,27,FOLLOW_27_in_rule__Head__Group_1__1__Impl4382); 
             after(grammarAccess.getHeadAccess().getVarKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1__1__Impl"


    // $ANTLR start "rule__Head__Group_1__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2050:1: rule__Head__Group_1__2 : rule__Head__Group_1__2__Impl rule__Head__Group_1__3 ;
    public final void rule__Head__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2054:1: ( rule__Head__Group_1__2__Impl rule__Head__Group_1__3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2055:2: rule__Head__Group_1__2__Impl rule__Head__Group_1__3
            {
            pushFollow(FOLLOW_rule__Head__Group_1__2__Impl_in_rule__Head__Group_1__24413);
            rule__Head__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Head__Group_1__3_in_rule__Head__Group_1__24416);
            rule__Head__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1__2"


    // $ANTLR start "rule__Head__Group_1__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2062:1: rule__Head__Group_1__2__Impl : ( ( rule__Head__VarIdAssignment_1_2 ) ) ;
    public final void rule__Head__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2066:1: ( ( ( rule__Head__VarIdAssignment_1_2 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2067:1: ( ( rule__Head__VarIdAssignment_1_2 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2067:1: ( ( rule__Head__VarIdAssignment_1_2 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2068:1: ( rule__Head__VarIdAssignment_1_2 )
            {
             before(grammarAccess.getHeadAccess().getVarIdAssignment_1_2()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2069:1: ( rule__Head__VarIdAssignment_1_2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2069:2: rule__Head__VarIdAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Head__VarIdAssignment_1_2_in_rule__Head__Group_1__2__Impl4443);
            rule__Head__VarIdAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getVarIdAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1__2__Impl"


    // $ANTLR start "rule__Head__Group_1__3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2079:1: rule__Head__Group_1__3 : rule__Head__Group_1__3__Impl rule__Head__Group_1__4 ;
    public final void rule__Head__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2083:1: ( rule__Head__Group_1__3__Impl rule__Head__Group_1__4 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2084:2: rule__Head__Group_1__3__Impl rule__Head__Group_1__4
            {
            pushFollow(FOLLOW_rule__Head__Group_1__3__Impl_in_rule__Head__Group_1__34473);
            rule__Head__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Head__Group_1__4_in_rule__Head__Group_1__34476);
            rule__Head__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1__3"


    // $ANTLR start "rule__Head__Group_1__3__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2091:1: rule__Head__Group_1__3__Impl : ( ( rule__Head__Group_1_3__0 )* ) ;
    public final void rule__Head__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2095:1: ( ( ( rule__Head__Group_1_3__0 )* ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2096:1: ( ( rule__Head__Group_1_3__0 )* )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2096:1: ( ( rule__Head__Group_1_3__0 )* )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2097:1: ( rule__Head__Group_1_3__0 )*
            {
             before(grammarAccess.getHeadAccess().getGroup_1_3()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2098:1: ( rule__Head__Group_1_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2098:2: rule__Head__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Head__Group_1_3__0_in_rule__Head__Group_1__3__Impl4503);
            	    rule__Head__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getHeadAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1__3__Impl"


    // $ANTLR start "rule__Head__Group_1__4"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2108:1: rule__Head__Group_1__4 : rule__Head__Group_1__4__Impl ;
    public final void rule__Head__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2112:1: ( rule__Head__Group_1__4__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2113:2: rule__Head__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Head__Group_1__4__Impl_in_rule__Head__Group_1__44534);
            rule__Head__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1__4"


    // $ANTLR start "rule__Head__Group_1__4__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2119:1: rule__Head__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Head__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2123:1: ( ( ')' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2124:1: ( ')' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2124:1: ( ')' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2125:1: ')'
            {
             before(grammarAccess.getHeadAccess().getRightParenthesisKeyword_1_4()); 
            match(input,28,FOLLOW_28_in_rule__Head__Group_1__4__Impl4562); 
             after(grammarAccess.getHeadAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1__4__Impl"


    // $ANTLR start "rule__Head__Group_1_3__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2148:1: rule__Head__Group_1_3__0 : rule__Head__Group_1_3__0__Impl rule__Head__Group_1_3__1 ;
    public final void rule__Head__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2152:1: ( rule__Head__Group_1_3__0__Impl rule__Head__Group_1_3__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2153:2: rule__Head__Group_1_3__0__Impl rule__Head__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Head__Group_1_3__0__Impl_in_rule__Head__Group_1_3__04603);
            rule__Head__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Head__Group_1_3__1_in_rule__Head__Group_1_3__04606);
            rule__Head__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1_3__0"


    // $ANTLR start "rule__Head__Group_1_3__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2160:1: rule__Head__Group_1_3__0__Impl : ( ', var ' ) ;
    public final void rule__Head__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2164:1: ( ( ', var ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2165:1: ( ', var ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2165:1: ( ', var ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2166:1: ', var '
            {
             before(grammarAccess.getHeadAccess().getVarKeyword_1_3_0()); 
            match(input,29,FOLLOW_29_in_rule__Head__Group_1_3__0__Impl4634); 
             after(grammarAccess.getHeadAccess().getVarKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1_3__0__Impl"


    // $ANTLR start "rule__Head__Group_1_3__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2179:1: rule__Head__Group_1_3__1 : rule__Head__Group_1_3__1__Impl ;
    public final void rule__Head__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2183:1: ( rule__Head__Group_1_3__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2184:2: rule__Head__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Head__Group_1_3__1__Impl_in_rule__Head__Group_1_3__14665);
            rule__Head__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1_3__1"


    // $ANTLR start "rule__Head__Group_1_3__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2190:1: rule__Head__Group_1_3__1__Impl : ( ( rule__Head__VarIdAssignment_1_3_1 ) ) ;
    public final void rule__Head__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2194:1: ( ( ( rule__Head__VarIdAssignment_1_3_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2195:1: ( ( rule__Head__VarIdAssignment_1_3_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2195:1: ( ( rule__Head__VarIdAssignment_1_3_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2196:1: ( rule__Head__VarIdAssignment_1_3_1 )
            {
             before(grammarAccess.getHeadAccess().getVarIdAssignment_1_3_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2197:1: ( rule__Head__VarIdAssignment_1_3_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2197:2: rule__Head__VarIdAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Head__VarIdAssignment_1_3_1_in_rule__Head__Group_1_3__1__Impl4692);
            rule__Head__VarIdAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getVarIdAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group_1_3__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_0__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2211:1: rule__FunctionCall__Group_0__0 : rule__FunctionCall__Group_0__0__Impl rule__FunctionCall__Group_0__1 ;
    public final void rule__FunctionCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2215:1: ( rule__FunctionCall__Group_0__0__Impl rule__FunctionCall__Group_0__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2216:2: rule__FunctionCall__Group_0__0__Impl rule__FunctionCall__Group_0__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_0__0__Impl_in_rule__FunctionCall__Group_0__04726);
            rule__FunctionCall__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group_0__1_in_rule__FunctionCall__Group_0__04729);
            rule__FunctionCall__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0__0"


    // $ANTLR start "rule__FunctionCall__Group_0__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2223:1: rule__FunctionCall__Group_0__0__Impl : ( ruleFunctionReference ) ;
    public final void rule__FunctionCall__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2227:1: ( ( ruleFunctionReference ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2228:1: ( ruleFunctionReference )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2228:1: ( ruleFunctionReference )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2229:1: ruleFunctionReference
            {
             before(grammarAccess.getFunctionCallAccess().getFunctionReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFunctionReference_in_rule__FunctionCall__Group_0__0__Impl4756);
            ruleFunctionReference();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getFunctionReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_0__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2240:1: rule__FunctionCall__Group_0__1 : rule__FunctionCall__Group_0__1__Impl ;
    public final void rule__FunctionCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2244:1: ( rule__FunctionCall__Group_0__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2245:2: rule__FunctionCall__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_0__1__Impl_in_rule__FunctionCall__Group_0__14785);
            rule__FunctionCall__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0__1"


    // $ANTLR start "rule__FunctionCall__Group_0__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2251:1: rule__FunctionCall__Group_0__1__Impl : ( '()' ) ;
    public final void rule__FunctionCall__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2255:1: ( ( '()' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2256:1: ( '()' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2256:1: ( '()' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2257:1: '()'
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_0_1()); 
            match(input,26,FOLLOW_26_in_rule__FunctionCall__Group_0__1__Impl4813); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2274:1: rule__FunctionCall__Group_1__0 : rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 ;
    public final void rule__FunctionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2278:1: ( rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2279:2: rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_1__0__Impl_in_rule__FunctionCall__Group_1__04848);
            rule__FunctionCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group_1__1_in_rule__FunctionCall__Group_1__04851);
            rule__FunctionCall__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__0"


    // $ANTLR start "rule__FunctionCall__Group_1__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2286:1: rule__FunctionCall__Group_1__0__Impl : ( ruleFunctionReference ) ;
    public final void rule__FunctionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2290:1: ( ( ruleFunctionReference ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2291:1: ( ruleFunctionReference )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2291:1: ( ruleFunctionReference )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2292:1: ruleFunctionReference
            {
             before(grammarAccess.getFunctionCallAccess().getFunctionReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFunctionReference_in_rule__FunctionCall__Group_1__0__Impl4878);
            ruleFunctionReference();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getFunctionReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2303:1: rule__FunctionCall__Group_1__1 : rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 ;
    public final void rule__FunctionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2307:1: ( rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2308:2: rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_1__1__Impl_in_rule__FunctionCall__Group_1__14907);
            rule__FunctionCall__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group_1__2_in_rule__FunctionCall__Group_1__14910);
            rule__FunctionCall__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__1"


    // $ANTLR start "rule__FunctionCall__Group_1__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2315:1: rule__FunctionCall__Group_1__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2319:1: ( ( '(' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2320:1: ( '(' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2320:1: ( '(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2321:1: '('
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__FunctionCall__Group_1__1__Impl4938); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2334:1: rule__FunctionCall__Group_1__2 : rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 ;
    public final void rule__FunctionCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2338:1: ( rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2339:2: rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_1__2__Impl_in_rule__FunctionCall__Group_1__24969);
            rule__FunctionCall__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group_1__3_in_rule__FunctionCall__Group_1__24972);
            rule__FunctionCall__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__2"


    // $ANTLR start "rule__FunctionCall__Group_1__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2346:1: rule__FunctionCall__Group_1__2__Impl : ( ( rule__FunctionCall__VarAssignment_1_2 ) ) ;
    public final void rule__FunctionCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2350:1: ( ( ( rule__FunctionCall__VarAssignment_1_2 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2351:1: ( ( rule__FunctionCall__VarAssignment_1_2 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2351:1: ( ( rule__FunctionCall__VarAssignment_1_2 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2352:1: ( rule__FunctionCall__VarAssignment_1_2 )
            {
             before(grammarAccess.getFunctionCallAccess().getVarAssignment_1_2()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2353:1: ( rule__FunctionCall__VarAssignment_1_2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2353:2: rule__FunctionCall__VarAssignment_1_2
            {
            pushFollow(FOLLOW_rule__FunctionCall__VarAssignment_1_2_in_rule__FunctionCall__Group_1__2__Impl4999);
            rule__FunctionCall__VarAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getVarAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2363:1: rule__FunctionCall__Group_1__3 : rule__FunctionCall__Group_1__3__Impl rule__FunctionCall__Group_1__4 ;
    public final void rule__FunctionCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2367:1: ( rule__FunctionCall__Group_1__3__Impl rule__FunctionCall__Group_1__4 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2368:2: rule__FunctionCall__Group_1__3__Impl rule__FunctionCall__Group_1__4
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_1__3__Impl_in_rule__FunctionCall__Group_1__35029);
            rule__FunctionCall__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group_1__4_in_rule__FunctionCall__Group_1__35032);
            rule__FunctionCall__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__3"


    // $ANTLR start "rule__FunctionCall__Group_1__3__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2375:1: rule__FunctionCall__Group_1__3__Impl : ( ( rule__FunctionCall__Group_1_3__0 )* ) ;
    public final void rule__FunctionCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2379:1: ( ( ( rule__FunctionCall__Group_1_3__0 )* ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2380:1: ( ( rule__FunctionCall__Group_1_3__0 )* )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2380:1: ( ( rule__FunctionCall__Group_1_3__0 )* )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2381:1: ( rule__FunctionCall__Group_1_3__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_1_3()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2382:1: ( rule__FunctionCall__Group_1_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2382:2: rule__FunctionCall__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionCall__Group_1_3__0_in_rule__FunctionCall__Group_1__3__Impl5059);
            	    rule__FunctionCall__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__4"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2392:1: rule__FunctionCall__Group_1__4 : rule__FunctionCall__Group_1__4__Impl ;
    public final void rule__FunctionCall__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2396:1: ( rule__FunctionCall__Group_1__4__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2397:2: rule__FunctionCall__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_1__4__Impl_in_rule__FunctionCall__Group_1__45090);
            rule__FunctionCall__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__4"


    // $ANTLR start "rule__FunctionCall__Group_1__4__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2403:1: rule__FunctionCall__Group_1__4__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2407:1: ( ( ')' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2408:1: ( ')' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2408:1: ( ')' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2409:1: ')'
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_4()); 
            match(input,28,FOLLOW_28_in_rule__FunctionCall__Group_1__4__Impl5118); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__4__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_3__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2432:1: rule__FunctionCall__Group_1_3__0 : rule__FunctionCall__Group_1_3__0__Impl rule__FunctionCall__Group_1_3__1 ;
    public final void rule__FunctionCall__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2436:1: ( rule__FunctionCall__Group_1_3__0__Impl rule__FunctionCall__Group_1_3__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2437:2: rule__FunctionCall__Group_1_3__0__Impl rule__FunctionCall__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_1_3__0__Impl_in_rule__FunctionCall__Group_1_3__05159);
            rule__FunctionCall__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group_1_3__1_in_rule__FunctionCall__Group_1_3__05162);
            rule__FunctionCall__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_3__0"


    // $ANTLR start "rule__FunctionCall__Group_1_3__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2444:1: rule__FunctionCall__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2448:1: ( ( ',' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2449:1: ( ',' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2449:1: ( ',' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2450:1: ','
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_1_3_0()); 
            match(input,31,FOLLOW_31_in_rule__FunctionCall__Group_1_3__0__Impl5190); 
             after(grammarAccess.getFunctionCallAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_3__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_3__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2463:1: rule__FunctionCall__Group_1_3__1 : rule__FunctionCall__Group_1_3__1__Impl ;
    public final void rule__FunctionCall__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2467:1: ( rule__FunctionCall__Group_1_3__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2468:2: rule__FunctionCall__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_1_3__1__Impl_in_rule__FunctionCall__Group_1_3__15221);
            rule__FunctionCall__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_3__1"


    // $ANTLR start "rule__FunctionCall__Group_1_3__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2474:1: rule__FunctionCall__Group_1_3__1__Impl : ( ( rule__FunctionCall__VarAssignment_1_3_1 ) ) ;
    public final void rule__FunctionCall__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2478:1: ( ( ( rule__FunctionCall__VarAssignment_1_3_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2479:1: ( ( rule__FunctionCall__VarAssignment_1_3_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2479:1: ( ( rule__FunctionCall__VarAssignment_1_3_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2480:1: ( rule__FunctionCall__VarAssignment_1_3_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getVarAssignment_1_3_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2481:1: ( rule__FunctionCall__VarAssignment_1_3_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2481:2: rule__FunctionCall__VarAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__FunctionCall__VarAssignment_1_3_1_in_rule__FunctionCall__Group_1_3__1__Impl5248);
            rule__FunctionCall__VarAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getVarAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_3__1__Impl"


    // $ANTLR start "rule__Main__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2495:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2499:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2500:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__05282);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__1_in_rule__Main__Group__05285);
            rule__Main__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2507:1: rule__Main__Group__0__Impl : ( 'main ' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2511:1: ( ( 'main ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2512:1: ( 'main ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2512:1: ( 'main ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2513:1: 'main '
            {
             before(grammarAccess.getMainAccess().getMainKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Main__Group__0__Impl5313); 
             after(grammarAccess.getMainAccess().getMainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2526:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2530:1: ( rule__Main__Group__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2531:2: rule__Main__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__15344);
            rule__Main__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2537:1: rule__Main__Group__1__Impl : ( ruleBody ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2541:1: ( ( ruleBody ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2542:1: ( ruleBody )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2542:1: ( ruleBody )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2543:1: ruleBody
            {
             before(grammarAccess.getMainAccess().getBodyParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleBody_in_rule__Main__Group__1__Impl5371);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getMainAccess().getBodyParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2558:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2562:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2563:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__05404);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__05407);
            rule__Body__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0"


    // $ANTLR start "rule__Body__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2570:1: rule__Body__Group__0__Impl : ( '{' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2574:1: ( ( '{' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2575:1: ( '{' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2575:1: ( '{' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2576:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Body__Group__0__Impl5435); 
             after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0__Impl"


    // $ANTLR start "rule__Body__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2589:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2593:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2594:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__15466);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__15469);
            rule__Body__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1"


    // $ANTLR start "rule__Body__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2601:1: rule__Body__Group__1__Impl : ( ( rule__Body__InstructionsAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2605:1: ( ( ( rule__Body__InstructionsAssignment_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2606:1: ( ( rule__Body__InstructionsAssignment_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2606:1: ( ( rule__Body__InstructionsAssignment_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2607:1: ( rule__Body__InstructionsAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getInstructionsAssignment_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2608:1: ( rule__Body__InstructionsAssignment_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2608:2: rule__Body__InstructionsAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__InstructionsAssignment_1_in_rule__Body__Group__1__Impl5496);
            rule__Body__InstructionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getInstructionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2618:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2622:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2623:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__25526);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__25529);
            rule__Body__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__2"


    // $ANTLR start "rule__Body__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2630:1: rule__Body__Group__2__Impl : ( ( rule__Body__InstructionsAssignment_2 )* ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2634:1: ( ( ( rule__Body__InstructionsAssignment_2 )* ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2635:1: ( ( rule__Body__InstructionsAssignment_2 )* )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2635:1: ( ( rule__Body__InstructionsAssignment_2 )* )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2636:1: ( rule__Body__InstructionsAssignment_2 )*
            {
             before(grammarAccess.getBodyAccess().getInstructionsAssignment_2()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2637:1: ( rule__Body__InstructionsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==35||LA27_0==39||LA27_0==42||LA27_0==52||(LA27_0>=54 && LA27_0<=55)||LA27_0==57||LA27_0==60) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2637:2: rule__Body__InstructionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Body__InstructionsAssignment_2_in_rule__Body__Group__2__Impl5556);
            	    rule__Body__InstructionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getInstructionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__2__Impl"


    // $ANTLR start "rule__Body__Group__3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2647:1: rule__Body__Group__3 : rule__Body__Group__3__Impl ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2651:1: ( rule__Body__Group__3__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2652:2: rule__Body__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__35587);
            rule__Body__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__3"


    // $ANTLR start "rule__Body__Group__3__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2658:1: rule__Body__Group__3__Impl : ( '}' ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2662:1: ( ( '}' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2663:1: ( '}' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2663:1: ( '}' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2664:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Body__Group__3__Impl5615); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2685:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2689:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2690:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05654);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05657);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2697:1: rule__Condition__Group__0__Impl : ( 'if ' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2701:1: ( ( 'if ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2702:1: ( 'if ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2702:1: ( 'if ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2703:1: 'if '
            {
             before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Condition__Group__0__Impl5685); 
             after(grammarAccess.getConditionAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2716:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2720:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2721:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15716);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__15719);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2728:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Alternatives_1 )? ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2732:1: ( ( ( rule__Condition__Alternatives_1 )? ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2733:1: ( ( rule__Condition__Alternatives_1 )? )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2733:1: ( ( rule__Condition__Alternatives_1 )? )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2734:1: ( rule__Condition__Alternatives_1 )?
            {
             before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2735:1: ( rule__Condition__Alternatives_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=12 && LA28_0<=13)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2735:2: rule__Condition__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl5746);
                    rule__Condition__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2745:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2749:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2750:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__25777);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__25780);
            rule__Condition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2757:1: rule__Condition__Group__2__Impl : ( '(' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2761:1: ( ( '(' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2762:1: ( '(' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2762:1: ( '(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2763:1: '('
            {
             before(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Condition__Group__2__Impl5808); 
             after(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2776:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2780:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2781:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__35839);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__4_in_rule__Condition__Group__35842);
            rule__Condition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2788:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__ExpAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2792:1: ( ( ( rule__Condition__ExpAssignment_3 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2793:1: ( ( rule__Condition__ExpAssignment_3 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2793:1: ( ( rule__Condition__ExpAssignment_3 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2794:1: ( rule__Condition__ExpAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getExpAssignment_3()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2795:1: ( rule__Condition__ExpAssignment_3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2795:2: rule__Condition__ExpAssignment_3
            {
            pushFollow(FOLLOW_rule__Condition__ExpAssignment_3_in_rule__Condition__Group__3__Impl5869);
            rule__Condition__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2805:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2809:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2810:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_rule__Condition__Group__4__Impl_in_rule__Condition__Group__45899);
            rule__Condition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__5_in_rule__Condition__Group__45902);
            rule__Condition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2817:1: rule__Condition__Group__4__Impl : ( ')' ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2821:1: ( ( ')' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2822:1: ( ')' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2822:1: ( ')' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2823:1: ')'
            {
             before(grammarAccess.getConditionAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Condition__Group__4__Impl5930); 
             after(grammarAccess.getConditionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__5"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2836:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl rule__Condition__Group__6 ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2840:1: ( rule__Condition__Group__5__Impl rule__Condition__Group__6 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2841:2: rule__Condition__Group__5__Impl rule__Condition__Group__6
            {
            pushFollow(FOLLOW_rule__Condition__Group__5__Impl_in_rule__Condition__Group__55961);
            rule__Condition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__6_in_rule__Condition__Group__55964);
            rule__Condition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5"


    // $ANTLR start "rule__Condition__Group__5__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2848:1: rule__Condition__Group__5__Impl : ( 'then ' ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2852:1: ( ( 'then ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2853:1: ( 'then ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2853:1: ( 'then ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2854:1: 'then '
            {
             before(grammarAccess.getConditionAccess().getThenKeyword_5()); 
            match(input,36,FOLLOW_36_in_rule__Condition__Group__5__Impl5992); 
             after(grammarAccess.getConditionAccess().getThenKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group__6"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2867:1: rule__Condition__Group__6 : rule__Condition__Group__6__Impl rule__Condition__Group__7 ;
    public final void rule__Condition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2871:1: ( rule__Condition__Group__6__Impl rule__Condition__Group__7 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2872:2: rule__Condition__Group__6__Impl rule__Condition__Group__7
            {
            pushFollow(FOLLOW_rule__Condition__Group__6__Impl_in_rule__Condition__Group__66023);
            rule__Condition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__7_in_rule__Condition__Group__66026);
            rule__Condition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__6"


    // $ANTLR start "rule__Condition__Group__6__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2879:1: rule__Condition__Group__6__Impl : ( ( ( rule__Condition__InsAssignment_6 ) ) ( ( rule__Condition__InsAssignment_6 )* ) ) ;
    public final void rule__Condition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2883:1: ( ( ( ( rule__Condition__InsAssignment_6 ) ) ( ( rule__Condition__InsAssignment_6 )* ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2884:1: ( ( ( rule__Condition__InsAssignment_6 ) ) ( ( rule__Condition__InsAssignment_6 )* ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2884:1: ( ( ( rule__Condition__InsAssignment_6 ) ) ( ( rule__Condition__InsAssignment_6 )* ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2885:1: ( ( rule__Condition__InsAssignment_6 ) ) ( ( rule__Condition__InsAssignment_6 )* )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2885:1: ( ( rule__Condition__InsAssignment_6 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2886:1: ( rule__Condition__InsAssignment_6 )
            {
             before(grammarAccess.getConditionAccess().getInsAssignment_6()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2887:1: ( rule__Condition__InsAssignment_6 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2887:2: rule__Condition__InsAssignment_6
            {
            pushFollow(FOLLOW_rule__Condition__InsAssignment_6_in_rule__Condition__Group__6__Impl6055);
            rule__Condition__InsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getInsAssignment_6()); 

            }

            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2890:1: ( ( rule__Condition__InsAssignment_6 )* )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2891:1: ( rule__Condition__InsAssignment_6 )*
            {
             before(grammarAccess.getConditionAccess().getInsAssignment_6()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2892:1: ( rule__Condition__InsAssignment_6 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==35||LA29_0==39||LA29_0==42||LA29_0==52||(LA29_0>=54 && LA29_0<=55)||LA29_0==57||LA29_0==60) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2892:2: rule__Condition__InsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Condition__InsAssignment_6_in_rule__Condition__Group__6__Impl6067);
            	    rule__Condition__InsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getInsAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__6__Impl"


    // $ANTLR start "rule__Condition__Group__7"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2903:1: rule__Condition__Group__7 : rule__Condition__Group__7__Impl rule__Condition__Group__8 ;
    public final void rule__Condition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2907:1: ( rule__Condition__Group__7__Impl rule__Condition__Group__8 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2908:2: rule__Condition__Group__7__Impl rule__Condition__Group__8
            {
            pushFollow(FOLLOW_rule__Condition__Group__7__Impl_in_rule__Condition__Group__76100);
            rule__Condition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__8_in_rule__Condition__Group__76103);
            rule__Condition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__7"


    // $ANTLR start "rule__Condition__Group__7__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2915:1: rule__Condition__Group__7__Impl : ( 'else ' ) ;
    public final void rule__Condition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2919:1: ( ( 'else ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2920:1: ( 'else ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2920:1: ( 'else ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2921:1: 'else '
            {
             before(grammarAccess.getConditionAccess().getElseKeyword_7()); 
            match(input,37,FOLLOW_37_in_rule__Condition__Group__7__Impl6131); 
             after(grammarAccess.getConditionAccess().getElseKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__7__Impl"


    // $ANTLR start "rule__Condition__Group__8"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2934:1: rule__Condition__Group__8 : rule__Condition__Group__8__Impl rule__Condition__Group__9 ;
    public final void rule__Condition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2938:1: ( rule__Condition__Group__8__Impl rule__Condition__Group__9 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2939:2: rule__Condition__Group__8__Impl rule__Condition__Group__9
            {
            pushFollow(FOLLOW_rule__Condition__Group__8__Impl_in_rule__Condition__Group__86162);
            rule__Condition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__9_in_rule__Condition__Group__86165);
            rule__Condition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__8"


    // $ANTLR start "rule__Condition__Group__8__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2946:1: rule__Condition__Group__8__Impl : ( ( ( rule__Condition__Ins2Assignment_8 ) ) ( ( rule__Condition__Ins2Assignment_8 )* ) ) ;
    public final void rule__Condition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2950:1: ( ( ( ( rule__Condition__Ins2Assignment_8 ) ) ( ( rule__Condition__Ins2Assignment_8 )* ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2951:1: ( ( ( rule__Condition__Ins2Assignment_8 ) ) ( ( rule__Condition__Ins2Assignment_8 )* ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2951:1: ( ( ( rule__Condition__Ins2Assignment_8 ) ) ( ( rule__Condition__Ins2Assignment_8 )* ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2952:1: ( ( rule__Condition__Ins2Assignment_8 ) ) ( ( rule__Condition__Ins2Assignment_8 )* )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2952:1: ( ( rule__Condition__Ins2Assignment_8 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2953:1: ( rule__Condition__Ins2Assignment_8 )
            {
             before(grammarAccess.getConditionAccess().getIns2Assignment_8()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2954:1: ( rule__Condition__Ins2Assignment_8 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2954:2: rule__Condition__Ins2Assignment_8
            {
            pushFollow(FOLLOW_rule__Condition__Ins2Assignment_8_in_rule__Condition__Group__8__Impl6194);
            rule__Condition__Ins2Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getIns2Assignment_8()); 

            }

            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2957:1: ( ( rule__Condition__Ins2Assignment_8 )* )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2958:1: ( rule__Condition__Ins2Assignment_8 )*
            {
             before(grammarAccess.getConditionAccess().getIns2Assignment_8()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2959:1: ( rule__Condition__Ins2Assignment_8 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==35||LA30_0==39||LA30_0==42||LA30_0==52||(LA30_0>=54 && LA30_0<=55)||LA30_0==57||LA30_0==60) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2959:2: rule__Condition__Ins2Assignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Condition__Ins2Assignment_8_in_rule__Condition__Group__8__Impl6206);
            	    rule__Condition__Ins2Assignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getIns2Assignment_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__8__Impl"


    // $ANTLR start "rule__Condition__Group__9"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2970:1: rule__Condition__Group__9 : rule__Condition__Group__9__Impl ;
    public final void rule__Condition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2974:1: ( rule__Condition__Group__9__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2975:2: rule__Condition__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__9__Impl_in_rule__Condition__Group__96239);
            rule__Condition__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__9"


    // $ANTLR start "rule__Condition__Group__9__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2981:1: rule__Condition__Group__9__Impl : ( 'endif' ) ;
    public final void rule__Condition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2985:1: ( ( 'endif' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2986:1: ( 'endif' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2986:1: ( 'endif' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:2987:1: 'endif'
            {
             before(grammarAccess.getConditionAccess().getEndifKeyword_9()); 
            match(input,38,FOLLOW_38_in_rule__Condition__Group__9__Impl6267); 
             after(grammarAccess.getConditionAccess().getEndifKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__9__Impl"


    // $ANTLR start "rule__While__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3020:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3024:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3025:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__06318);
            rule__While__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__06321);
            rule__While__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3032:1: rule__While__Group__0__Impl : ( 'while (' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3036:1: ( ( 'while (' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3037:1: ( 'while (' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3037:1: ( 'while (' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3038:1: 'while ('
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__While__Group__0__Impl6349); 
             after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3051:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3055:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3056:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__16380);
            rule__While__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__16383);
            rule__While__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3063:1: rule__While__Group__1__Impl : ( ( rule__While__ExpAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3067:1: ( ( ( rule__While__ExpAssignment_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3068:1: ( ( rule__While__ExpAssignment_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3068:1: ( ( rule__While__ExpAssignment_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3069:1: ( rule__While__ExpAssignment_1 )
            {
             before(grammarAccess.getWhileAccess().getExpAssignment_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3070:1: ( rule__While__ExpAssignment_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3070:2: rule__While__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__While__ExpAssignment_1_in_rule__While__Group__1__Impl6410);
            rule__While__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3080:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3084:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3085:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__26440);
            rule__While__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__26443);
            rule__While__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3092:1: rule__While__Group__2__Impl : ( ') do ' ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3096:1: ( ( ') do ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3097:1: ( ') do ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3097:1: ( ') do ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3098:1: ') do '
            {
             before(grammarAccess.getWhileAccess().getDoKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__While__Group__2__Impl6471); 
             after(grammarAccess.getWhileAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3111:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3115:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3116:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__36502);
            rule__While__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__36505);
            rule__While__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3123:1: rule__While__Group__3__Impl : ( ( ( rule__While__InsAssignment_3 ) ) ( ( rule__While__InsAssignment_3 )* ) ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3127:1: ( ( ( ( rule__While__InsAssignment_3 ) ) ( ( rule__While__InsAssignment_3 )* ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3128:1: ( ( ( rule__While__InsAssignment_3 ) ) ( ( rule__While__InsAssignment_3 )* ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3128:1: ( ( ( rule__While__InsAssignment_3 ) ) ( ( rule__While__InsAssignment_3 )* ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3129:1: ( ( rule__While__InsAssignment_3 ) ) ( ( rule__While__InsAssignment_3 )* )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3129:1: ( ( rule__While__InsAssignment_3 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3130:1: ( rule__While__InsAssignment_3 )
            {
             before(grammarAccess.getWhileAccess().getInsAssignment_3()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3131:1: ( rule__While__InsAssignment_3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3131:2: rule__While__InsAssignment_3
            {
            pushFollow(FOLLOW_rule__While__InsAssignment_3_in_rule__While__Group__3__Impl6534);
            rule__While__InsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getInsAssignment_3()); 

            }

            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3134:1: ( ( rule__While__InsAssignment_3 )* )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3135:1: ( rule__While__InsAssignment_3 )*
            {
             before(grammarAccess.getWhileAccess().getInsAssignment_3()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3136:1: ( rule__While__InsAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==35||LA31_0==39||LA31_0==42||LA31_0==52||(LA31_0>=54 && LA31_0<=55)||LA31_0==57||LA31_0==60) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3136:2: rule__While__InsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__While__InsAssignment_3_in_rule__While__Group__3__Impl6546);
            	    rule__While__InsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getWhileAccess().getInsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__While__Group__4"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3147:1: rule__While__Group__4 : rule__While__Group__4__Impl ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3151:1: ( rule__While__Group__4__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3152:2: rule__While__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__46579);
            rule__While__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4"


    // $ANTLR start "rule__While__Group__4__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3158:1: rule__While__Group__4__Impl : ( ' endwhile' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3162:1: ( ( ' endwhile' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3163:1: ( ' endwhile' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3163:1: ( ' endwhile' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3164:1: ' endwhile'
            {
             before(grammarAccess.getWhileAccess().getEndwhileKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__While__Group__4__Impl6607); 
             after(grammarAccess.getWhileAccess().getEndwhileKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3187:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3191:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3192:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__06648);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__06651);
            rule__Declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3199:1: rule__Declaration__Group__0__Impl : ( 'var ' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3203:1: ( ( 'var ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3204:1: ( 'var ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3204:1: ( 'var ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3205:1: 'var '
            {
             before(grammarAccess.getDeclarationAccess().getVarKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Declaration__Group__0__Impl6679); 
             after(grammarAccess.getDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3218:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3222:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3223:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__16710);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__16713);
            rule__Declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3230:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3234:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3235:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3235:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3236:1: ( rule__Declaration__NameAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3237:1: ( rule__Declaration__NameAssignment_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3237:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl6740);
            rule__Declaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3247:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3251:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3252:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__26770);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__26773);
            rule__Declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3259:1: rule__Declaration__Group__2__Impl : ( ' = ' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3263:1: ( ( ' = ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3264:1: ( ' = ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3264:1: ( ' = ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3265:1: ' = '
            {
             before(grammarAccess.getDeclarationAccess().getSpaceEqualsSignSpaceKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__Declaration__Group__2__Impl6801); 
             after(grammarAccess.getDeclarationAccess().getSpaceEqualsSignSpaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3278:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3282:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3283:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__36832);
            rule__Declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__36835);
            rule__Declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3"


    // $ANTLR start "rule__Declaration__Group__3__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3290:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__ValAssignment_3 ) ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3294:1: ( ( ( rule__Declaration__ValAssignment_3 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3295:1: ( ( rule__Declaration__ValAssignment_3 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3295:1: ( ( rule__Declaration__ValAssignment_3 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3296:1: ( rule__Declaration__ValAssignment_3 )
            {
             before(grammarAccess.getDeclarationAccess().getValAssignment_3()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3297:1: ( rule__Declaration__ValAssignment_3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3297:2: rule__Declaration__ValAssignment_3
            {
            pushFollow(FOLLOW_rule__Declaration__ValAssignment_3_in_rule__Declaration__Group__3__Impl6862);
            rule__Declaration__ValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getValAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3__Impl"


    // $ANTLR start "rule__Declaration__Group__4"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3307:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3311:1: ( rule__Declaration__Group__4__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3312:2: rule__Declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__46892);
            rule__Declaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__4"


    // $ANTLR start "rule__Declaration__Group__4__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3318:1: rule__Declaration__Group__4__Impl : ( ';' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3322:1: ( ( ';' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3323:1: ( ';' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3323:1: ( ';' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3324:1: ';'
            {
             before(grammarAccess.getDeclarationAccess().getSemicolonKeyword_4()); 
            match(input,44,FOLLOW_44_in_rule__Declaration__Group__4__Impl6920); 
             after(grammarAccess.getDeclarationAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__4__Impl"


    // $ANTLR start "rule__Assignation__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3347:1: rule__Assignation__Group__0 : rule__Assignation__Group__0__Impl rule__Assignation__Group__1 ;
    public final void rule__Assignation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3351:1: ( rule__Assignation__Group__0__Impl rule__Assignation__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3352:2: rule__Assignation__Group__0__Impl rule__Assignation__Group__1
            {
            pushFollow(FOLLOW_rule__Assignation__Group__0__Impl_in_rule__Assignation__Group__06961);
            rule__Assignation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignation__Group__1_in_rule__Assignation__Group__06964);
            rule__Assignation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__0"


    // $ANTLR start "rule__Assignation__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3359:1: rule__Assignation__Group__0__Impl : ( ( rule__Assignation__VarAssignment_0 ) ) ;
    public final void rule__Assignation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3363:1: ( ( ( rule__Assignation__VarAssignment_0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3364:1: ( ( rule__Assignation__VarAssignment_0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3364:1: ( ( rule__Assignation__VarAssignment_0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3365:1: ( rule__Assignation__VarAssignment_0 )
            {
             before(grammarAccess.getAssignationAccess().getVarAssignment_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3366:1: ( rule__Assignation__VarAssignment_0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3366:2: rule__Assignation__VarAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignation__VarAssignment_0_in_rule__Assignation__Group__0__Impl6991);
            rule__Assignation__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignationAccess().getVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__0__Impl"


    // $ANTLR start "rule__Assignation__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3376:1: rule__Assignation__Group__1 : rule__Assignation__Group__1__Impl rule__Assignation__Group__2 ;
    public final void rule__Assignation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3380:1: ( rule__Assignation__Group__1__Impl rule__Assignation__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3381:2: rule__Assignation__Group__1__Impl rule__Assignation__Group__2
            {
            pushFollow(FOLLOW_rule__Assignation__Group__1__Impl_in_rule__Assignation__Group__17021);
            rule__Assignation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignation__Group__2_in_rule__Assignation__Group__17024);
            rule__Assignation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__1"


    // $ANTLR start "rule__Assignation__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3388:1: rule__Assignation__Group__1__Impl : ( ' = ' ) ;
    public final void rule__Assignation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3392:1: ( ( ' = ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3393:1: ( ' = ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3393:1: ( ' = ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3394:1: ' = '
            {
             before(grammarAccess.getAssignationAccess().getSpaceEqualsSignSpaceKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__Assignation__Group__1__Impl7052); 
             after(grammarAccess.getAssignationAccess().getSpaceEqualsSignSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__1__Impl"


    // $ANTLR start "rule__Assignation__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3407:1: rule__Assignation__Group__2 : rule__Assignation__Group__2__Impl rule__Assignation__Group__3 ;
    public final void rule__Assignation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3411:1: ( rule__Assignation__Group__2__Impl rule__Assignation__Group__3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3412:2: rule__Assignation__Group__2__Impl rule__Assignation__Group__3
            {
            pushFollow(FOLLOW_rule__Assignation__Group__2__Impl_in_rule__Assignation__Group__27083);
            rule__Assignation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignation__Group__3_in_rule__Assignation__Group__27086);
            rule__Assignation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__2"


    // $ANTLR start "rule__Assignation__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3419:1: rule__Assignation__Group__2__Impl : ( ( rule__Assignation__ExprAssignment_2 ) ) ;
    public final void rule__Assignation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3423:1: ( ( ( rule__Assignation__ExprAssignment_2 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3424:1: ( ( rule__Assignation__ExprAssignment_2 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3424:1: ( ( rule__Assignation__ExprAssignment_2 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3425:1: ( rule__Assignation__ExprAssignment_2 )
            {
             before(grammarAccess.getAssignationAccess().getExprAssignment_2()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3426:1: ( rule__Assignation__ExprAssignment_2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3426:2: rule__Assignation__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignation__ExprAssignment_2_in_rule__Assignation__Group__2__Impl7113);
            rule__Assignation__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignationAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__2__Impl"


    // $ANTLR start "rule__Assignation__Group__3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3436:1: rule__Assignation__Group__3 : rule__Assignation__Group__3__Impl ;
    public final void rule__Assignation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3440:1: ( rule__Assignation__Group__3__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3441:2: rule__Assignation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Assignation__Group__3__Impl_in_rule__Assignation__Group__37143);
            rule__Assignation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__3"


    // $ANTLR start "rule__Assignation__Group__3__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3447:1: rule__Assignation__Group__3__Impl : ( ';' ) ;
    public final void rule__Assignation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3451:1: ( ( ';' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3452:1: ( ';' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3452:1: ( ';' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3453:1: ';'
            {
             before(grammarAccess.getAssignationAccess().getSemicolonKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__Assignation__Group__3__Impl7171); 
             after(grammarAccess.getAssignationAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group_3__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3474:1: rule__Expression__Group_3__0 : rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 ;
    public final void rule__Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3478:1: ( rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3479:2: rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_3__0__Impl_in_rule__Expression__Group_3__07210);
            rule__Expression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_3__1_in_rule__Expression__Group_3__07213);
            rule__Expression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__0"


    // $ANTLR start "rule__Expression__Group_3__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3486:1: rule__Expression__Group_3__0__Impl : ( ( rule__Expression__Alternatives_3_0 ) ) ;
    public final void rule__Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3490:1: ( ( ( rule__Expression__Alternatives_3_0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3491:1: ( ( rule__Expression__Alternatives_3_0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3491:1: ( ( rule__Expression__Alternatives_3_0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3492:1: ( rule__Expression__Alternatives_3_0 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_3_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3493:1: ( rule__Expression__Alternatives_3_0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3493:2: rule__Expression__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_3_0_in_rule__Expression__Group_3__0__Impl7240);
            rule__Expression__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Expression__Group_3__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3503:1: rule__Expression__Group_3__1 : rule__Expression__Group_3__1__Impl rule__Expression__Group_3__2 ;
    public final void rule__Expression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3507:1: ( rule__Expression__Group_3__1__Impl rule__Expression__Group_3__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3508:2: rule__Expression__Group_3__1__Impl rule__Expression__Group_3__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_3__1__Impl_in_rule__Expression__Group_3__17270);
            rule__Expression__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_3__2_in_rule__Expression__Group_3__17273);
            rule__Expression__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__1"


    // $ANTLR start "rule__Expression__Group_3__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3515:1: rule__Expression__Group_3__1__Impl : ( ( rule__Expression__LeftAssignment_3_1 ) ) ;
    public final void rule__Expression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3519:1: ( ( ( rule__Expression__LeftAssignment_3_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3520:1: ( ( rule__Expression__LeftAssignment_3_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3520:1: ( ( rule__Expression__LeftAssignment_3_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3521:1: ( rule__Expression__LeftAssignment_3_1 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_3_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3522:1: ( rule__Expression__LeftAssignment_3_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3522:2: rule__Expression__LeftAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Expression__LeftAssignment_3_1_in_rule__Expression__Group_3__1__Impl7300);
            rule__Expression__LeftAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getLeftAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__1__Impl"


    // $ANTLR start "rule__Expression__Group_3__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3532:1: rule__Expression__Group_3__2 : rule__Expression__Group_3__2__Impl ;
    public final void rule__Expression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3536:1: ( rule__Expression__Group_3__2__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3537:2: rule__Expression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_3__2__Impl_in_rule__Expression__Group_3__27330);
            rule__Expression__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__2"


    // $ANTLR start "rule__Expression__Group_3__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3543:1: rule__Expression__Group_3__2__Impl : ( ( rule__Expression__RightAssignment_3_2 ) ) ;
    public final void rule__Expression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3547:1: ( ( ( rule__Expression__RightAssignment_3_2 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3548:1: ( ( rule__Expression__RightAssignment_3_2 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3548:1: ( ( rule__Expression__RightAssignment_3_2 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3549:1: ( rule__Expression__RightAssignment_3_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_3_2()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3550:1: ( rule__Expression__RightAssignment_3_2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3550:2: rule__Expression__RightAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_3_2_in_rule__Expression__Group_3__2__Impl7357);
            rule__Expression__RightAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__2__Impl"


    // $ANTLR start "rule__Expression__Group_4__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3566:1: rule__Expression__Group_4__0 : rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 ;
    public final void rule__Expression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3570:1: ( rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3571:2: rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_4__0__Impl_in_rule__Expression__Group_4__07393);
            rule__Expression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_4__1_in_rule__Expression__Group_4__07396);
            rule__Expression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__0"


    // $ANTLR start "rule__Expression__Group_4__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3578:1: rule__Expression__Group_4__0__Impl : ( ' !' ) ;
    public final void rule__Expression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3582:1: ( ( ' !' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3583:1: ( ' !' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3583:1: ( ' !' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3584:1: ' !'
            {
             before(grammarAccess.getExpressionAccess().getSpaceExclamationMarkKeyword_4_0()); 
            match(input,45,FOLLOW_45_in_rule__Expression__Group_4__0__Impl7424); 
             after(grammarAccess.getExpressionAccess().getSpaceExclamationMarkKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__0__Impl"


    // $ANTLR start "rule__Expression__Group_4__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3597:1: rule__Expression__Group_4__1 : rule__Expression__Group_4__1__Impl ;
    public final void rule__Expression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3601:1: ( rule__Expression__Group_4__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3602:2: rule__Expression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_4__1__Impl_in_rule__Expression__Group_4__17455);
            rule__Expression__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__1"


    // $ANTLR start "rule__Expression__Group_4__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3608:1: rule__Expression__Group_4__1__Impl : ( ( rule__Expression__ExpAssignment_4_1 ) ) ;
    public final void rule__Expression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3612:1: ( ( ( rule__Expression__ExpAssignment_4_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3613:1: ( ( rule__Expression__ExpAssignment_4_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3613:1: ( ( rule__Expression__ExpAssignment_4_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3614:1: ( rule__Expression__ExpAssignment_4_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpAssignment_4_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3615:1: ( rule__Expression__ExpAssignment_4_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3615:2: rule__Expression__ExpAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Expression__ExpAssignment_4_1_in_rule__Expression__Group_4__1__Impl7482);
            rule__Expression__ExpAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__1__Impl"


    // $ANTLR start "rule__Checkbox__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3629:1: rule__Checkbox__Group__0 : rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 ;
    public final void rule__Checkbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3633:1: ( rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3634:2: rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1
            {
            pushFollow(FOLLOW_rule__Checkbox__Group__0__Impl_in_rule__Checkbox__Group__07516);
            rule__Checkbox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Checkbox__Group__1_in_rule__Checkbox__Group__07519);
            rule__Checkbox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__0"


    // $ANTLR start "rule__Checkbox__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3641:1: rule__Checkbox__Group__0__Impl : ( 'checkbox ' ) ;
    public final void rule__Checkbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3645:1: ( ( 'checkbox ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3646:1: ( 'checkbox ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3646:1: ( 'checkbox ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3647:1: 'checkbox '
            {
             before(grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Checkbox__Group__0__Impl7547); 
             after(grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__0__Impl"


    // $ANTLR start "rule__Checkbox__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3660:1: rule__Checkbox__Group__1 : rule__Checkbox__Group__1__Impl ;
    public final void rule__Checkbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3664:1: ( rule__Checkbox__Group__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3665:2: rule__Checkbox__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Checkbox__Group__1__Impl_in_rule__Checkbox__Group__17578);
            rule__Checkbox__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__1"


    // $ANTLR start "rule__Checkbox__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3671:1: rule__Checkbox__Group__1__Impl : ( ( rule__Checkbox__Alternatives_1 ) ) ;
    public final void rule__Checkbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3675:1: ( ( ( rule__Checkbox__Alternatives_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3676:1: ( ( rule__Checkbox__Alternatives_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3676:1: ( ( rule__Checkbox__Alternatives_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3677:1: ( rule__Checkbox__Alternatives_1 )
            {
             before(grammarAccess.getCheckboxAccess().getAlternatives_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3678:1: ( rule__Checkbox__Alternatives_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3678:2: rule__Checkbox__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Checkbox__Alternatives_1_in_rule__Checkbox__Group__1__Impl7605);
            rule__Checkbox__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3692:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3696:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3697:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__07639);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__07642);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3704:1: rule__Link__Group__0__Impl : ( 'link ' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3708:1: ( ( 'link ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3709:1: ( 'link ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3709:1: ( 'link ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3710:1: 'link '
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Link__Group__0__Impl7670); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3723:1: rule__Link__Group__1 : rule__Link__Group__1__Impl ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3727:1: ( rule__Link__Group__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3728:2: rule__Link__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__17701);
            rule__Link__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3734:1: rule__Link__Group__1__Impl : ( ( rule__Link__Alternatives_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3738:1: ( ( ( rule__Link__Alternatives_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3739:1: ( ( rule__Link__Alternatives_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3739:1: ( ( rule__Link__Alternatives_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3740:1: ( rule__Link__Alternatives_1 )
            {
             before(grammarAccess.getLinkAccess().getAlternatives_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3741:1: ( rule__Link__Alternatives_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3741:2: rule__Link__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Link__Alternatives_1_in_rule__Link__Group__1__Impl7728);
            rule__Link__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3755:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3759:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3760:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__07762);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__1_in_rule__Button__Group__07765);
            rule__Button__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3767:1: rule__Button__Group__0__Impl : ( 'button ' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3771:1: ( ( 'button ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3772:1: ( 'button ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3772:1: ( 'button ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3773:1: 'button '
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Button__Group__0__Impl7793); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3786:1: rule__Button__Group__1 : rule__Button__Group__1__Impl ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3790:1: ( rule__Button__Group__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3791:2: rule__Button__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__17824);
            rule__Button__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3797:1: rule__Button__Group__1__Impl : ( ( rule__Button__Alternatives_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3801:1: ( ( ( rule__Button__Alternatives_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3802:1: ( ( rule__Button__Alternatives_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3802:1: ( ( rule__Button__Alternatives_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3803:1: ( rule__Button__Alternatives_1 )
            {
             before(grammarAccess.getButtonAccess().getAlternatives_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3804:1: ( rule__Button__Alternatives_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3804:2: rule__Button__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Button__Alternatives_1_in_rule__Button__Group__1__Impl7851);
            rule__Button__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3818:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3822:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3823:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__07885);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__1_in_rule__Image__Group__07888);
            rule__Image__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3830:1: rule__Image__Group__0__Impl : ( 'image ' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3834:1: ( ( 'image ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3835:1: ( 'image ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3835:1: ( 'image ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3836:1: 'image '
            {
             before(grammarAccess.getImageAccess().getImageKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__Image__Group__0__Impl7916); 
             after(grammarAccess.getImageAccess().getImageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3849:1: rule__Image__Group__1 : rule__Image__Group__1__Impl ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3853:1: ( rule__Image__Group__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3854:2: rule__Image__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__17947);
            rule__Image__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3860:1: rule__Image__Group__1__Impl : ( ( rule__Image__Alternatives_1 ) ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3864:1: ( ( ( rule__Image__Alternatives_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3865:1: ( ( rule__Image__Alternatives_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3865:1: ( ( rule__Image__Alternatives_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3866:1: ( rule__Image__Alternatives_1 )
            {
             before(grammarAccess.getImageAccess().getAlternatives_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3867:1: ( rule__Image__Alternatives_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3867:2: rule__Image__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Image__Alternatives_1_in_rule__Image__Group__1__Impl7974);
            rule__Image__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__TextField__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3881:1: rule__TextField__Group__0 : rule__TextField__Group__0__Impl rule__TextField__Group__1 ;
    public final void rule__TextField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3885:1: ( rule__TextField__Group__0__Impl rule__TextField__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3886:2: rule__TextField__Group__0__Impl rule__TextField__Group__1
            {
            pushFollow(FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__08008);
            rule__TextField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__08011);
            rule__TextField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0"


    // $ANTLR start "rule__TextField__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3893:1: rule__TextField__Group__0__Impl : ( 'textField ' ) ;
    public final void rule__TextField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3897:1: ( ( 'textField ' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3898:1: ( 'textField ' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3898:1: ( 'textField ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3899:1: 'textField '
            {
             before(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__TextField__Group__0__Impl8039); 
             after(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0__Impl"


    // $ANTLR start "rule__TextField__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3912:1: rule__TextField__Group__1 : rule__TextField__Group__1__Impl ;
    public final void rule__TextField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3916:1: ( rule__TextField__Group__1__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3917:2: rule__TextField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__18070);
            rule__TextField__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1"


    // $ANTLR start "rule__TextField__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3923:1: rule__TextField__Group__1__Impl : ( ( rule__TextField__Alternatives_1 ) ) ;
    public final void rule__TextField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3927:1: ( ( ( rule__TextField__Alternatives_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3928:1: ( ( rule__TextField__Alternatives_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3928:1: ( ( rule__TextField__Alternatives_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3929:1: ( rule__TextField__Alternatives_1 )
            {
             before(grammarAccess.getTextFieldAccess().getAlternatives_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3930:1: ( rule__TextField__Alternatives_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3930:2: rule__TextField__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TextField__Alternatives_1_in_rule__TextField__Group__1__Impl8097);
            rule__TextField__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3944:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3948:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3949:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_rule__Select__Group__0__Impl_in_rule__Select__Group__08131);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__1_in_rule__Select__Group__08134);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3956:1: rule__Select__Group__0__Impl : ( 'select(' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3960:1: ( ( 'select(' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3961:1: ( 'select(' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3961:1: ( 'select(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3962:1: 'select('
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__Select__Group__0__Impl8162); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3975:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3979:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3980:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_rule__Select__Group__1__Impl_in_rule__Select__Group__18193);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__2_in_rule__Select__Group__18196);
            rule__Select__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3987:1: rule__Select__Group__1__Impl : ( ( rule__Select__ValueAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3991:1: ( ( ( rule__Select__ValueAssignment_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3992:1: ( ( rule__Select__ValueAssignment_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3992:1: ( ( rule__Select__ValueAssignment_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3993:1: ( rule__Select__ValueAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getValueAssignment_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3994:1: ( rule__Select__ValueAssignment_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:3994:2: rule__Select__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Select__ValueAssignment_1_in_rule__Select__Group__1__Impl8223);
            rule__Select__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4004:1: rule__Select__Group__2 : rule__Select__Group__2__Impl ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4008:1: ( rule__Select__Group__2__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4009:2: rule__Select__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Select__Group__2__Impl_in_rule__Select__Group__28253);
            rule__Select__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4015:1: rule__Select__Group__2__Impl : ( ')' ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4019:1: ( ( ')' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4020:1: ( ')' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4020:1: ( ')' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4021:1: ')'
            {
             before(grammarAccess.getSelectAccess().getRightParenthesisKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Select__Group__2__Impl8281); 
             after(grammarAccess.getSelectAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4040:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4044:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4045:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_rule__Click__Group__0__Impl_in_rule__Click__Group__08318);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Click__Group__1_in_rule__Click__Group__08321);
            rule__Click__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0"


    // $ANTLR start "rule__Click__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4052:1: rule__Click__Group__0__Impl : ( 'click(' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4056:1: ( ( 'click(' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4057:1: ( 'click(' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4057:1: ( 'click(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4058:1: 'click('
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Click__Group__0__Impl8349); 
             after(grammarAccess.getClickAccess().getClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4071:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4075:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4076:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_rule__Click__Group__1__Impl_in_rule__Click__Group__18380);
            rule__Click__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Click__Group__2_in_rule__Click__Group__18383);
            rule__Click__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1"


    // $ANTLR start "rule__Click__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4083:1: rule__Click__Group__1__Impl : ( ( rule__Click__ValAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4087:1: ( ( ( rule__Click__ValAssignment_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4088:1: ( ( rule__Click__ValAssignment_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4088:1: ( ( rule__Click__ValAssignment_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4089:1: ( rule__Click__ValAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getValAssignment_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4090:1: ( rule__Click__ValAssignment_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4090:2: rule__Click__ValAssignment_1
            {
            pushFollow(FOLLOW_rule__Click__ValAssignment_1_in_rule__Click__Group__1__Impl8410);
            rule__Click__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1__Impl"


    // $ANTLR start "rule__Click__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4100:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4104:1: ( rule__Click__Group__2__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4105:2: rule__Click__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Click__Group__2__Impl_in_rule__Click__Group__28440);
            rule__Click__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2"


    // $ANTLR start "rule__Click__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4111:1: rule__Click__Group__2__Impl : ( ');' ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4115:1: ( ( ');' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4116:1: ( ');' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4116:1: ( ');' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4117:1: ');'
            {
             before(grammarAccess.getClickAccess().getRightParenthesisSemicolonKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__Click__Group__2__Impl8468); 
             after(grammarAccess.getClickAccess().getRightParenthesisSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2__Impl"


    // $ANTLR start "rule__Check__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4136:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4140:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4141:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_rule__Check__Group__0__Impl_in_rule__Check__Group__08505);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Check__Group__1_in_rule__Check__Group__08508);
            rule__Check__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0"


    // $ANTLR start "rule__Check__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4148:1: rule__Check__Group__0__Impl : ( 'check(' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4152:1: ( ( 'check(' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4153:1: ( 'check(' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4153:1: ( 'check(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4154:1: 'check('
            {
             before(grammarAccess.getCheckAccess().getCheckKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__Check__Group__0__Impl8536); 
             after(grammarAccess.getCheckAccess().getCheckKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0__Impl"


    // $ANTLR start "rule__Check__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4167:1: rule__Check__Group__1 : rule__Check__Group__1__Impl rule__Check__Group__2 ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4171:1: ( rule__Check__Group__1__Impl rule__Check__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4172:2: rule__Check__Group__1__Impl rule__Check__Group__2
            {
            pushFollow(FOLLOW_rule__Check__Group__1__Impl_in_rule__Check__Group__18567);
            rule__Check__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Check__Group__2_in_rule__Check__Group__18570);
            rule__Check__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1"


    // $ANTLR start "rule__Check__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4179:1: rule__Check__Group__1__Impl : ( ( rule__Check__ValAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4183:1: ( ( ( rule__Check__ValAssignment_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4184:1: ( ( rule__Check__ValAssignment_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4184:1: ( ( rule__Check__ValAssignment_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4185:1: ( rule__Check__ValAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getValAssignment_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4186:1: ( rule__Check__ValAssignment_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4186:2: rule__Check__ValAssignment_1
            {
            pushFollow(FOLLOW_rule__Check__ValAssignment_1_in_rule__Check__Group__1__Impl8597);
            rule__Check__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1__Impl"


    // $ANTLR start "rule__Check__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4196:1: rule__Check__Group__2 : rule__Check__Group__2__Impl ;
    public final void rule__Check__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4200:1: ( rule__Check__Group__2__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4201:2: rule__Check__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Check__Group__2__Impl_in_rule__Check__Group__28627);
            rule__Check__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__2"


    // $ANTLR start "rule__Check__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4207:1: rule__Check__Group__2__Impl : ( ');' ) ;
    public final void rule__Check__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4211:1: ( ( ');' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4212:1: ( ');' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4212:1: ( ');' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4213:1: ');'
            {
             before(grammarAccess.getCheckAccess().getRightParenthesisSemicolonKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__Check__Group__2__Impl8655); 
             after(grammarAccess.getCheckAccess().getRightParenthesisSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__2__Impl"


    // $ANTLR start "rule__Fill__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4232:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4236:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4237:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
            {
            pushFollow(FOLLOW_rule__Fill__Group__0__Impl_in_rule__Fill__Group__08692);
            rule__Fill__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fill__Group__1_in_rule__Fill__Group__08695);
            rule__Fill__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0"


    // $ANTLR start "rule__Fill__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4244:1: rule__Fill__Group__0__Impl : ( 'fill(' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4248:1: ( ( 'fill(' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4249:1: ( 'fill(' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4249:1: ( 'fill(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4250:1: 'fill('
            {
             before(grammarAccess.getFillAccess().getFillKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__Fill__Group__0__Impl8723); 
             after(grammarAccess.getFillAccess().getFillKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0__Impl"


    // $ANTLR start "rule__Fill__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4263:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl rule__Fill__Group__2 ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4267:1: ( rule__Fill__Group__1__Impl rule__Fill__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4268:2: rule__Fill__Group__1__Impl rule__Fill__Group__2
            {
            pushFollow(FOLLOW_rule__Fill__Group__1__Impl_in_rule__Fill__Group__18754);
            rule__Fill__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fill__Group__2_in_rule__Fill__Group__18757);
            rule__Fill__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1"


    // $ANTLR start "rule__Fill__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4275:1: rule__Fill__Group__1__Impl : ( ( rule__Fill__ValAssignment_1 ) ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4279:1: ( ( ( rule__Fill__ValAssignment_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4280:1: ( ( rule__Fill__ValAssignment_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4280:1: ( ( rule__Fill__ValAssignment_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4281:1: ( rule__Fill__ValAssignment_1 )
            {
             before(grammarAccess.getFillAccess().getValAssignment_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4282:1: ( rule__Fill__ValAssignment_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4282:2: rule__Fill__ValAssignment_1
            {
            pushFollow(FOLLOW_rule__Fill__ValAssignment_1_in_rule__Fill__Group__1__Impl8784);
            rule__Fill__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1__Impl"


    // $ANTLR start "rule__Fill__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4292:1: rule__Fill__Group__2 : rule__Fill__Group__2__Impl rule__Fill__Group__3 ;
    public final void rule__Fill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4296:1: ( rule__Fill__Group__2__Impl rule__Fill__Group__3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4297:2: rule__Fill__Group__2__Impl rule__Fill__Group__3
            {
            pushFollow(FOLLOW_rule__Fill__Group__2__Impl_in_rule__Fill__Group__28814);
            rule__Fill__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fill__Group__3_in_rule__Fill__Group__28817);
            rule__Fill__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2"


    // $ANTLR start "rule__Fill__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4304:1: rule__Fill__Group__2__Impl : ( ', value=' ) ;
    public final void rule__Fill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4308:1: ( ( ', value=' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4309:1: ( ', value=' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4309:1: ( ', value=' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4310:1: ', value='
            {
             before(grammarAccess.getFillAccess().getValueKeyword_2()); 
            match(input,56,FOLLOW_56_in_rule__Fill__Group__2__Impl8845); 
             after(grammarAccess.getFillAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2__Impl"


    // $ANTLR start "rule__Fill__Group__3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4323:1: rule__Fill__Group__3 : rule__Fill__Group__3__Impl rule__Fill__Group__4 ;
    public final void rule__Fill__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4327:1: ( rule__Fill__Group__3__Impl rule__Fill__Group__4 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4328:2: rule__Fill__Group__3__Impl rule__Fill__Group__4
            {
            pushFollow(FOLLOW_rule__Fill__Group__3__Impl_in_rule__Fill__Group__38876);
            rule__Fill__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fill__Group__4_in_rule__Fill__Group__38879);
            rule__Fill__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__3"


    // $ANTLR start "rule__Fill__Group__3__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4335:1: rule__Fill__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Fill__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4339:1: ( ( RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4340:1: ( RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4340:1: ( RULE_STRING )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4341:1: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Fill__Group__3__Impl8906); 
             after(grammarAccess.getFillAccess().getSTRINGTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__3__Impl"


    // $ANTLR start "rule__Fill__Group__4"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4352:1: rule__Fill__Group__4 : rule__Fill__Group__4__Impl ;
    public final void rule__Fill__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4356:1: ( rule__Fill__Group__4__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4357:2: rule__Fill__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Fill__Group__4__Impl_in_rule__Fill__Group__48935);
            rule__Fill__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__4"


    // $ANTLR start "rule__Fill__Group__4__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4363:1: rule__Fill__Group__4__Impl : ( ');' ) ;
    public final void rule__Fill__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4367:1: ( ( ');' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4368:1: ( ');' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4368:1: ( ');' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4369:1: ');'
            {
             before(grammarAccess.getFillAccess().getRightParenthesisSemicolonKeyword_4()); 
            match(input,53,FOLLOW_53_in_rule__Fill__Group__4__Impl8963); 
             after(grammarAccess.getFillAccess().getRightParenthesisSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__4__Impl"


    // $ANTLR start "rule__Clear__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4392:1: rule__Clear__Group__0 : rule__Clear__Group__0__Impl rule__Clear__Group__1 ;
    public final void rule__Clear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4396:1: ( rule__Clear__Group__0__Impl rule__Clear__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4397:2: rule__Clear__Group__0__Impl rule__Clear__Group__1
            {
            pushFollow(FOLLOW_rule__Clear__Group__0__Impl_in_rule__Clear__Group__09004);
            rule__Clear__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Clear__Group__1_in_rule__Clear__Group__09007);
            rule__Clear__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__0"


    // $ANTLR start "rule__Clear__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4404:1: rule__Clear__Group__0__Impl : ( 'clear(' ) ;
    public final void rule__Clear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4408:1: ( ( 'clear(' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4409:1: ( 'clear(' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4409:1: ( 'clear(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4410:1: 'clear('
            {
             before(grammarAccess.getClearAccess().getClearKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__Clear__Group__0__Impl9035); 
             after(grammarAccess.getClearAccess().getClearKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__0__Impl"


    // $ANTLR start "rule__Clear__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4423:1: rule__Clear__Group__1 : rule__Clear__Group__1__Impl rule__Clear__Group__2 ;
    public final void rule__Clear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4427:1: ( rule__Clear__Group__1__Impl rule__Clear__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4428:2: rule__Clear__Group__1__Impl rule__Clear__Group__2
            {
            pushFollow(FOLLOW_rule__Clear__Group__1__Impl_in_rule__Clear__Group__19066);
            rule__Clear__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Clear__Group__2_in_rule__Clear__Group__19069);
            rule__Clear__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__1"


    // $ANTLR start "rule__Clear__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4435:1: rule__Clear__Group__1__Impl : ( ( rule__Clear__Alternatives_1 ) ) ;
    public final void rule__Clear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4439:1: ( ( ( rule__Clear__Alternatives_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4440:1: ( ( rule__Clear__Alternatives_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4440:1: ( ( rule__Clear__Alternatives_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4441:1: ( rule__Clear__Alternatives_1 )
            {
             before(grammarAccess.getClearAccess().getAlternatives_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4442:1: ( rule__Clear__Alternatives_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4442:2: rule__Clear__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Clear__Alternatives_1_in_rule__Clear__Group__1__Impl9096);
            rule__Clear__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getClearAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__1__Impl"


    // $ANTLR start "rule__Clear__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4452:1: rule__Clear__Group__2 : rule__Clear__Group__2__Impl ;
    public final void rule__Clear__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4456:1: ( rule__Clear__Group__2__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4457:2: rule__Clear__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Clear__Group__2__Impl_in_rule__Clear__Group__29126);
            rule__Clear__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__2"


    // $ANTLR start "rule__Clear__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4463:1: rule__Clear__Group__2__Impl : ( ');' ) ;
    public final void rule__Clear__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4467:1: ( ( ');' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4468:1: ( ');' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4468:1: ( ');' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4469:1: ');'
            {
             before(grammarAccess.getClearAccess().getRightParenthesisSemicolonKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__Clear__Group__2__Impl9154); 
             after(grammarAccess.getClearAccess().getRightParenthesisSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__2__Impl"


    // $ANTLR start "rule__Verify__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4488:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4492:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4493:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_rule__Verify__Group__0__Impl_in_rule__Verify__Group__09191);
            rule__Verify__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Verify__Group__1_in_rule__Verify__Group__09194);
            rule__Verify__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0"


    // $ANTLR start "rule__Verify__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4500:1: rule__Verify__Group__0__Impl : ( 'verify(' ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4504:1: ( ( 'verify(' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4505:1: ( 'verify(' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4505:1: ( 'verify(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4506:1: 'verify('
            {
             before(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__Verify__Group__0__Impl9222); 
             after(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0__Impl"


    // $ANTLR start "rule__Verify__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4519:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4523:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4524:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
            {
            pushFollow(FOLLOW_rule__Verify__Group__1__Impl_in_rule__Verify__Group__19253);
            rule__Verify__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Verify__Group__2_in_rule__Verify__Group__19256);
            rule__Verify__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1"


    // $ANTLR start "rule__Verify__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4531:1: rule__Verify__Group__1__Impl : ( ( rule__Verify__Alternatives_1 ) ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4535:1: ( ( ( rule__Verify__Alternatives_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4536:1: ( ( rule__Verify__Alternatives_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4536:1: ( ( rule__Verify__Alternatives_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4537:1: ( rule__Verify__Alternatives_1 )
            {
             before(grammarAccess.getVerifyAccess().getAlternatives_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4538:1: ( rule__Verify__Alternatives_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4538:2: rule__Verify__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Verify__Alternatives_1_in_rule__Verify__Group__1__Impl9283);
            rule__Verify__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1__Impl"


    // $ANTLR start "rule__Verify__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4548:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4552:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4553:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
            {
            pushFollow(FOLLOW_rule__Verify__Group__2__Impl_in_rule__Verify__Group__29313);
            rule__Verify__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Verify__Group__3_in_rule__Verify__Group__29316);
            rule__Verify__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__2"


    // $ANTLR start "rule__Verify__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4560:1: rule__Verify__Group__2__Impl : ( ', value=' ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4564:1: ( ( ', value=' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4565:1: ( ', value=' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4565:1: ( ', value=' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4566:1: ', value='
            {
             before(grammarAccess.getVerifyAccess().getValueKeyword_2()); 
            match(input,56,FOLLOW_56_in_rule__Verify__Group__2__Impl9344); 
             after(grammarAccess.getVerifyAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__2__Impl"


    // $ANTLR start "rule__Verify__Group__3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4579:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl rule__Verify__Group__4 ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4583:1: ( rule__Verify__Group__3__Impl rule__Verify__Group__4 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4584:2: rule__Verify__Group__3__Impl rule__Verify__Group__4
            {
            pushFollow(FOLLOW_rule__Verify__Group__3__Impl_in_rule__Verify__Group__39375);
            rule__Verify__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Verify__Group__4_in_rule__Verify__Group__39378);
            rule__Verify__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__3"


    // $ANTLR start "rule__Verify__Group__3__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4591:1: rule__Verify__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4595:1: ( ( RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4596:1: ( RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4596:1: ( RULE_STRING )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4597:1: RULE_STRING
            {
             before(grammarAccess.getVerifyAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Verify__Group__3__Impl9405); 
             after(grammarAccess.getVerifyAccess().getSTRINGTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__3__Impl"


    // $ANTLR start "rule__Verify__Group__4"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4608:1: rule__Verify__Group__4 : rule__Verify__Group__4__Impl ;
    public final void rule__Verify__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4612:1: ( rule__Verify__Group__4__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4613:2: rule__Verify__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Verify__Group__4__Impl_in_rule__Verify__Group__49434);
            rule__Verify__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__4"


    // $ANTLR start "rule__Verify__Group__4__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4619:1: rule__Verify__Group__4__Impl : ( ');' ) ;
    public final void rule__Verify__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4623:1: ( ( ');' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4624:1: ( ');' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4624:1: ( ');' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4625:1: ');'
            {
             before(grammarAccess.getVerifyAccess().getRightParenthesisSemicolonKeyword_4()); 
            match(input,53,FOLLOW_53_in_rule__Verify__Group__4__Impl9462); 
             after(grammarAccess.getVerifyAccess().getRightParenthesisSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__4__Impl"


    // $ANTLR start "rule__Exist__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4648:1: rule__Exist__Group__0 : rule__Exist__Group__0__Impl rule__Exist__Group__1 ;
    public final void rule__Exist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4652:1: ( rule__Exist__Group__0__Impl rule__Exist__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4653:2: rule__Exist__Group__0__Impl rule__Exist__Group__1
            {
            pushFollow(FOLLOW_rule__Exist__Group__0__Impl_in_rule__Exist__Group__09503);
            rule__Exist__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exist__Group__1_in_rule__Exist__Group__09506);
            rule__Exist__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exist__Group__0"


    // $ANTLR start "rule__Exist__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4660:1: rule__Exist__Group__0__Impl : ( 'exist(' ) ;
    public final void rule__Exist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4664:1: ( ( 'exist(' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4665:1: ( 'exist(' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4665:1: ( 'exist(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4666:1: 'exist('
            {
             before(grammarAccess.getExistAccess().getExistKeyword_0()); 
            match(input,59,FOLLOW_59_in_rule__Exist__Group__0__Impl9534); 
             after(grammarAccess.getExistAccess().getExistKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exist__Group__0__Impl"


    // $ANTLR start "rule__Exist__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4679:1: rule__Exist__Group__1 : rule__Exist__Group__1__Impl rule__Exist__Group__2 ;
    public final void rule__Exist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4683:1: ( rule__Exist__Group__1__Impl rule__Exist__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4684:2: rule__Exist__Group__1__Impl rule__Exist__Group__2
            {
            pushFollow(FOLLOW_rule__Exist__Group__1__Impl_in_rule__Exist__Group__19565);
            rule__Exist__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exist__Group__2_in_rule__Exist__Group__19568);
            rule__Exist__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exist__Group__1"


    // $ANTLR start "rule__Exist__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4691:1: rule__Exist__Group__1__Impl : ( ( rule__Exist__ValAssignment_1 ) ) ;
    public final void rule__Exist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4695:1: ( ( ( rule__Exist__ValAssignment_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4696:1: ( ( rule__Exist__ValAssignment_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4696:1: ( ( rule__Exist__ValAssignment_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4697:1: ( rule__Exist__ValAssignment_1 )
            {
             before(grammarAccess.getExistAccess().getValAssignment_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4698:1: ( rule__Exist__ValAssignment_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4698:2: rule__Exist__ValAssignment_1
            {
            pushFollow(FOLLOW_rule__Exist__ValAssignment_1_in_rule__Exist__Group__1__Impl9595);
            rule__Exist__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExistAccess().getValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exist__Group__1__Impl"


    // $ANTLR start "rule__Exist__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4708:1: rule__Exist__Group__2 : rule__Exist__Group__2__Impl ;
    public final void rule__Exist__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4712:1: ( rule__Exist__Group__2__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4713:2: rule__Exist__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Exist__Group__2__Impl_in_rule__Exist__Group__29625);
            rule__Exist__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exist__Group__2"


    // $ANTLR start "rule__Exist__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4719:1: rule__Exist__Group__2__Impl : ( ');' ) ;
    public final void rule__Exist__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4723:1: ( ( ');' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4724:1: ( ');' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4724:1: ( ');' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4725:1: ');'
            {
             before(grammarAccess.getExistAccess().getRightParenthesisSemicolonKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__Exist__Group__2__Impl9653); 
             after(grammarAccess.getExistAccess().getRightParenthesisSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exist__Group__2__Impl"


    // $ANTLR start "rule__GoTo__Group__0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4744:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4748:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4749:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_rule__GoTo__Group__0__Impl_in_rule__GoTo__Group__09690);
            rule__GoTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GoTo__Group__1_in_rule__GoTo__Group__09693);
            rule__GoTo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0"


    // $ANTLR start "rule__GoTo__Group__0__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4756:1: rule__GoTo__Group__0__Impl : ( 'goTo(' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4760:1: ( ( 'goTo(' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4761:1: ( 'goTo(' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4761:1: ( 'goTo(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4762:1: 'goTo('
            {
             before(grammarAccess.getGoToAccess().getGoToKeyword_0()); 
            match(input,60,FOLLOW_60_in_rule__GoTo__Group__0__Impl9721); 
             after(grammarAccess.getGoToAccess().getGoToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0__Impl"


    // $ANTLR start "rule__GoTo__Group__1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4775:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4779:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4780:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
            {
            pushFollow(FOLLOW_rule__GoTo__Group__1__Impl_in_rule__GoTo__Group__19752);
            rule__GoTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GoTo__Group__2_in_rule__GoTo__Group__19755);
            rule__GoTo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1"


    // $ANTLR start "rule__GoTo__Group__1__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4787:1: rule__GoTo__Group__1__Impl : ( ( rule__GoTo__UrlAssignment_1 ) ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4791:1: ( ( ( rule__GoTo__UrlAssignment_1 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4792:1: ( ( rule__GoTo__UrlAssignment_1 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4792:1: ( ( rule__GoTo__UrlAssignment_1 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4793:1: ( rule__GoTo__UrlAssignment_1 )
            {
             before(grammarAccess.getGoToAccess().getUrlAssignment_1()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4794:1: ( rule__GoTo__UrlAssignment_1 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4794:2: rule__GoTo__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__GoTo__UrlAssignment_1_in_rule__GoTo__Group__1__Impl9782);
            rule__GoTo__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1__Impl"


    // $ANTLR start "rule__GoTo__Group__2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4804:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4808:1: ( rule__GoTo__Group__2__Impl )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4809:2: rule__GoTo__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GoTo__Group__2__Impl_in_rule__GoTo__Group__29812);
            rule__GoTo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2"


    // $ANTLR start "rule__GoTo__Group__2__Impl"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4815:1: rule__GoTo__Group__2__Impl : ( ');' ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4819:1: ( ( ');' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4820:1: ( ');' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4820:1: ( ');' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4821:1: ');'
            {
             before(grammarAccess.getGoToAccess().getRightParenthesisSemicolonKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__GoTo__Group__2__Impl9840); 
             after(grammarAccess.getGoToAccess().getRightParenthesisSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2__Impl"


    // $ANTLR start "rule__Program__SubAssignment_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4841:1: rule__Program__SubAssignment_0 : ( ruleSubroutine ) ;
    public final void rule__Program__SubAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4845:1: ( ( ruleSubroutine ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4846:1: ( ruleSubroutine )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4846:1: ( ruleSubroutine )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4847:1: ruleSubroutine
            {
             before(grammarAccess.getProgramAccess().getSubSubroutineParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSubroutine_in_rule__Program__SubAssignment_09882);
            ruleSubroutine();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getSubSubroutineParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__SubAssignment_0"


    // $ANTLR start "rule__Program__MainAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4856:1: rule__Program__MainAssignment_1 : ( ruleMain ) ;
    public final void rule__Program__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4860:1: ( ( ruleMain ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4861:1: ( ruleMain )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4861:1: ( ruleMain )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4862:1: ruleMain
            {
             before(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMain_in_rule__Program__MainAssignment_19913);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__MainAssignment_1"


    // $ANTLR start "rule__Subroutine__HeadAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4871:1: rule__Subroutine__HeadAssignment_1 : ( ruleHead ) ;
    public final void rule__Subroutine__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4875:1: ( ( ruleHead ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4876:1: ( ruleHead )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4876:1: ( ruleHead )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4877:1: ruleHead
            {
             before(grammarAccess.getSubroutineAccess().getHeadHeadParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHead_in_rule__Subroutine__HeadAssignment_19944);
            ruleHead();

            state._fsp--;

             after(grammarAccess.getSubroutineAccess().getHeadHeadParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subroutine__HeadAssignment_1"


    // $ANTLR start "rule__Subroutine__BodyAssignment_2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4886:1: rule__Subroutine__BodyAssignment_2 : ( ruleBody ) ;
    public final void rule__Subroutine__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4890:1: ( ( ruleBody ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4891:1: ( ruleBody )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4891:1: ( ruleBody )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4892:1: ruleBody
            {
             before(grammarAccess.getSubroutineAccess().getBodyBodyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBody_in_rule__Subroutine__BodyAssignment_29975);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getSubroutineAccess().getBodyBodyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subroutine__BodyAssignment_2"


    // $ANTLR start "rule__Head__NameAssignment_0_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4901:1: rule__Head__NameAssignment_0_0 : ( ruleFunctionName ) ;
    public final void rule__Head__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4905:1: ( ( ruleFunctionName ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4906:1: ( ruleFunctionName )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4906:1: ( ruleFunctionName )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4907:1: ruleFunctionName
            {
             before(grammarAccess.getHeadAccess().getNameFunctionNameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleFunctionName_in_rule__Head__NameAssignment_0_010006);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getHeadAccess().getNameFunctionNameParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__NameAssignment_0_0"


    // $ANTLR start "rule__Head__NameAssignment_1_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4916:1: rule__Head__NameAssignment_1_0 : ( ruleFunctionName ) ;
    public final void rule__Head__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4920:1: ( ( ruleFunctionName ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4921:1: ( ruleFunctionName )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4921:1: ( ruleFunctionName )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4922:1: ruleFunctionName
            {
             before(grammarAccess.getHeadAccess().getNameFunctionNameParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleFunctionName_in_rule__Head__NameAssignment_1_010037);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getHeadAccess().getNameFunctionNameParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__NameAssignment_1_0"


    // $ANTLR start "rule__Head__VarIdAssignment_1_2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4931:1: rule__Head__VarIdAssignment_1_2 : ( ruleVariableName ) ;
    public final void rule__Head__VarIdAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4935:1: ( ( ruleVariableName ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4936:1: ( ruleVariableName )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4936:1: ( ruleVariableName )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4937:1: ruleVariableName
            {
             before(grammarAccess.getHeadAccess().getVarIdVariableNameParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleVariableName_in_rule__Head__VarIdAssignment_1_210068);
            ruleVariableName();

            state._fsp--;

             after(grammarAccess.getHeadAccess().getVarIdVariableNameParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__VarIdAssignment_1_2"


    // $ANTLR start "rule__Head__VarIdAssignment_1_3_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4946:1: rule__Head__VarIdAssignment_1_3_1 : ( ruleVariableName ) ;
    public final void rule__Head__VarIdAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4950:1: ( ( ruleVariableName ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4951:1: ( ruleVariableName )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4951:1: ( ruleVariableName )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4952:1: ruleVariableName
            {
             before(grammarAccess.getHeadAccess().getVarIdVariableNameParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleVariableName_in_rule__Head__VarIdAssignment_1_3_110099);
            ruleVariableName();

            state._fsp--;

             after(grammarAccess.getHeadAccess().getVarIdVariableNameParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__VarIdAssignment_1_3_1"


    // $ANTLR start "rule__FunctionReference__FunctionNameAssignment"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4961:1: rule__FunctionReference__FunctionNameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__FunctionReference__FunctionNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4965:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4966:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4966:1: ( ( RULE_ID ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4967:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionReferenceAccess().getFunctionNameFunctionNameCrossReference_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4968:1: ( RULE_ID )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4969:1: RULE_ID
            {
             before(grammarAccess.getFunctionReferenceAccess().getFunctionNameFunctionNameIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionReference__FunctionNameAssignment10134); 
             after(grammarAccess.getFunctionReferenceAccess().getFunctionNameFunctionNameIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getFunctionReferenceAccess().getFunctionNameFunctionNameCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionReference__FunctionNameAssignment"


    // $ANTLR start "rule__VariableReference__VarIDAssignment"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4980:1: rule__VariableReference__VarIDAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VarIDAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4984:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4985:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4985:1: ( ( RULE_ID ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4986:1: ( RULE_ID )
            {
             before(grammarAccess.getVariableReferenceAccess().getVarIDVariableNameCrossReference_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4987:1: ( RULE_ID )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4988:1: RULE_ID
            {
             before(grammarAccess.getVariableReferenceAccess().getVarIDVariableNameIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableReference__VarIDAssignment10173); 
             after(grammarAccess.getVariableReferenceAccess().getVarIDVariableNameIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableReferenceAccess().getVarIDVariableNameCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__VarIDAssignment"


    // $ANTLR start "rule__FunctionCall__VarAssignment_1_2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4999:1: rule__FunctionCall__VarAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__FunctionCall__VarAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5003:1: ( ( ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5004:1: ( ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5004:1: ( ruleExpression )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5005:1: ruleExpression
            {
             before(grammarAccess.getFunctionCallAccess().getVarExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionCall__VarAssignment_1_210208);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getVarExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__VarAssignment_1_2"


    // $ANTLR start "rule__FunctionCall__VarAssignment_1_3_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5014:1: rule__FunctionCall__VarAssignment_1_3_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__VarAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5018:1: ( ( ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5019:1: ( ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5019:1: ( ruleExpression )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5020:1: ruleExpression
            {
             before(grammarAccess.getFunctionCallAccess().getVarExpressionParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionCall__VarAssignment_1_3_110239);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getVarExpressionParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__VarAssignment_1_3_1"


    // $ANTLR start "rule__FunctionName__NameAssignment"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5029:1: rule__FunctionName__NameAssignment : ( RULE_STRING ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5033:1: ( ( RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5034:1: ( RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5034:1: ( RULE_STRING )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5035:1: RULE_STRING
            {
             before(grammarAccess.getFunctionNameAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionName__NameAssignment10270); 
             after(grammarAccess.getFunctionNameAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionName__NameAssignment"


    // $ANTLR start "rule__Body__InstructionsAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5044:1: rule__Body__InstructionsAssignment_1 : ( ruleInstruction ) ;
    public final void rule__Body__InstructionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5048:1: ( ( ruleInstruction ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5049:1: ( ruleInstruction )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5049:1: ( ruleInstruction )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5050:1: ruleInstruction
            {
             before(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Body__InstructionsAssignment_110301);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__InstructionsAssignment_1"


    // $ANTLR start "rule__Body__InstructionsAssignment_2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5059:1: rule__Body__InstructionsAssignment_2 : ( ruleInstruction ) ;
    public final void rule__Body__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5063:1: ( ( ruleInstruction ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5064:1: ( ruleInstruction )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5064:1: ( ruleInstruction )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5065:1: ruleInstruction
            {
             before(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Body__InstructionsAssignment_210332);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__InstructionsAssignment_2"


    // $ANTLR start "rule__Instruction__DecAssignment_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5074:1: rule__Instruction__DecAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__Instruction__DecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5078:1: ( ( ruleDeclaration ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5079:1: ( ruleDeclaration )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5079:1: ( ruleDeclaration )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5080:1: ruleDeclaration
            {
             before(grammarAccess.getInstructionAccess().getDecDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Instruction__DecAssignment_010363);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getDecDeclarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__DecAssignment_0"


    // $ANTLR start "rule__Instruction__CondAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5089:1: rule__Instruction__CondAssignment_1 : ( ruleCondition ) ;
    public final void rule__Instruction__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5093:1: ( ( ruleCondition ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5094:1: ( ruleCondition )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5094:1: ( ruleCondition )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5095:1: ruleCondition
            {
             before(grammarAccess.getInstructionAccess().getCondConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Instruction__CondAssignment_110394);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getCondConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__CondAssignment_1"


    // $ANTLR start "rule__Instruction__WhileAssignment_2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5104:1: rule__Instruction__WhileAssignment_2 : ( ruleWhile ) ;
    public final void rule__Instruction__WhileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5108:1: ( ( ruleWhile ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5109:1: ( ruleWhile )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5109:1: ( ruleWhile )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5110:1: ruleWhile
            {
             before(grammarAccess.getInstructionAccess().getWhileWhileParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWhile_in_rule__Instruction__WhileAssignment_210425);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getWhileWhileParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__WhileAssignment_2"


    // $ANTLR start "rule__Instruction__ActAssignment_3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5119:1: rule__Instruction__ActAssignment_3 : ( ruleActionInstruction ) ;
    public final void rule__Instruction__ActAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5123:1: ( ( ruleActionInstruction ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5124:1: ( ruleActionInstruction )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5124:1: ( ruleActionInstruction )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5125:1: ruleActionInstruction
            {
             before(grammarAccess.getInstructionAccess().getActActionInstructionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleActionInstruction_in_rule__Instruction__ActAssignment_310456);
            ruleActionInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getActActionInstructionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__ActAssignment_3"


    // $ANTLR start "rule__Instruction__AssAssignment_4"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5134:1: rule__Instruction__AssAssignment_4 : ( ruleAssignation ) ;
    public final void rule__Instruction__AssAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5138:1: ( ( ruleAssignation ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5139:1: ( ruleAssignation )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5139:1: ( ruleAssignation )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5140:1: ruleAssignation
            {
             before(grammarAccess.getInstructionAccess().getAssAssignationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAssignation_in_rule__Instruction__AssAssignment_410487);
            ruleAssignation();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getAssAssignationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__AssAssignment_4"


    // $ANTLR start "rule__Instruction__SubAssignment_5"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5149:1: rule__Instruction__SubAssignment_5 : ( ruleFunctionCall ) ;
    public final void rule__Instruction__SubAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5153:1: ( ( ruleFunctionCall ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5154:1: ( ruleFunctionCall )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5154:1: ( ruleFunctionCall )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5155:1: ruleFunctionCall
            {
             before(grammarAccess.getInstructionAccess().getSubFunctionCallParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_rule__Instruction__SubAssignment_510518);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getSubFunctionCallParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__SubAssignment_5"


    // $ANTLR start "rule__Condition__ExpAssignment_3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5164:1: rule__Condition__ExpAssignment_3 : ( ruleExpression ) ;
    public final void rule__Condition__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5168:1: ( ( ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5169:1: ( ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5169:1: ( ruleExpression )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5170:1: ruleExpression
            {
             before(grammarAccess.getConditionAccess().getExpExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Condition__ExpAssignment_310549);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getExpExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ExpAssignment_3"


    // $ANTLR start "rule__Condition__InsAssignment_6"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5179:1: rule__Condition__InsAssignment_6 : ( ruleInstruction ) ;
    public final void rule__Condition__InsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5183:1: ( ( ruleInstruction ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5184:1: ( ruleInstruction )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5184:1: ( ruleInstruction )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5185:1: ruleInstruction
            {
             before(grammarAccess.getConditionAccess().getInsInstructionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Condition__InsAssignment_610580);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getInsInstructionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__InsAssignment_6"


    // $ANTLR start "rule__Condition__Ins2Assignment_8"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5194:1: rule__Condition__Ins2Assignment_8 : ( ruleInstruction ) ;
    public final void rule__Condition__Ins2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5198:1: ( ( ruleInstruction ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5199:1: ( ruleInstruction )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5199:1: ( ruleInstruction )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5200:1: ruleInstruction
            {
             before(grammarAccess.getConditionAccess().getIns2InstructionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Condition__Ins2Assignment_810611);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getIns2InstructionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Ins2Assignment_8"


    // $ANTLR start "rule__While__ExpAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5209:1: rule__While__ExpAssignment_1 : ( ruleExpression ) ;
    public final void rule__While__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5213:1: ( ( ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5214:1: ( ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5214:1: ( ruleExpression )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5215:1: ruleExpression
            {
             before(grammarAccess.getWhileAccess().getExpExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__While__ExpAssignment_110642);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getExpExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ExpAssignment_1"


    // $ANTLR start "rule__While__InsAssignment_3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5224:1: rule__While__InsAssignment_3 : ( ruleInstruction ) ;
    public final void rule__While__InsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5228:1: ( ( ruleInstruction ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5229:1: ( ruleInstruction )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5229:1: ( ruleInstruction )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5230:1: ruleInstruction
            {
             before(grammarAccess.getWhileAccess().getInsInstructionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__While__InsAssignment_310673);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getInsInstructionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__InsAssignment_3"


    // $ANTLR start "rule__ActionInstruction__ActionAssignment_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5239:1: rule__ActionInstruction__ActionAssignment_0 : ( ruleClick ) ;
    public final void rule__ActionInstruction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5243:1: ( ( ruleClick ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5244:1: ( ruleClick )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5244:1: ( ruleClick )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5245:1: ruleClick
            {
             before(grammarAccess.getActionInstructionAccess().getActionClickParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClick_in_rule__ActionInstruction__ActionAssignment_010704);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getActionInstructionAccess().getActionClickParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionInstruction__ActionAssignment_0"


    // $ANTLR start "rule__ActionInstruction__ActionAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5254:1: rule__ActionInstruction__ActionAssignment_1 : ( ruleCheck ) ;
    public final void rule__ActionInstruction__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5258:1: ( ( ruleCheck ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5259:1: ( ruleCheck )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5259:1: ( ruleCheck )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5260:1: ruleCheck
            {
             before(grammarAccess.getActionInstructionAccess().getActionCheckParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCheck_in_rule__ActionInstruction__ActionAssignment_110735);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getActionInstructionAccess().getActionCheckParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionInstruction__ActionAssignment_1"


    // $ANTLR start "rule__ActionInstruction__ActionAssignment_2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5269:1: rule__ActionInstruction__ActionAssignment_2 : ( ruleFill ) ;
    public final void rule__ActionInstruction__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5273:1: ( ( ruleFill ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5274:1: ( ruleFill )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5274:1: ( ruleFill )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5275:1: ruleFill
            {
             before(grammarAccess.getActionInstructionAccess().getActionFillParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFill_in_rule__ActionInstruction__ActionAssignment_210766);
            ruleFill();

            state._fsp--;

             after(grammarAccess.getActionInstructionAccess().getActionFillParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionInstruction__ActionAssignment_2"


    // $ANTLR start "rule__ActionInstruction__ActionAssignment_3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5284:1: rule__ActionInstruction__ActionAssignment_3 : ( ruleClear ) ;
    public final void rule__ActionInstruction__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5288:1: ( ( ruleClear ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5289:1: ( ruleClear )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5289:1: ( ruleClear )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5290:1: ruleClear
            {
             before(grammarAccess.getActionInstructionAccess().getActionClearParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleClear_in_rule__ActionInstruction__ActionAssignment_310797);
            ruleClear();

            state._fsp--;

             after(grammarAccess.getActionInstructionAccess().getActionClearParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionInstruction__ActionAssignment_3"


    // $ANTLR start "rule__VariableName__NameAssignment"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5299:1: rule__VariableName__NameAssignment : ( RULE_STRING ) ;
    public final void rule__VariableName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5303:1: ( ( RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5304:1: ( RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5304:1: ( RULE_STRING )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5305:1: RULE_STRING
            {
             before(grammarAccess.getVariableNameAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VariableName__NameAssignment10828); 
             after(grammarAccess.getVariableNameAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableName__NameAssignment"


    // $ANTLR start "rule__Declaration__NameAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5314:1: rule__Declaration__NameAssignment_1 : ( ruleVariableName ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5318:1: ( ( ruleVariableName ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5319:1: ( ruleVariableName )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5319:1: ( ruleVariableName )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5320:1: ruleVariableName
            {
             before(grammarAccess.getDeclarationAccess().getNameVariableNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableName_in_rule__Declaration__NameAssignment_110859);
            ruleVariableName();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getNameVariableNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__NameAssignment_1"


    // $ANTLR start "rule__Declaration__ValAssignment_3"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5329:1: rule__Declaration__ValAssignment_3 : ( ruleExpression ) ;
    public final void rule__Declaration__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5333:1: ( ( ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5334:1: ( ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5334:1: ( ruleExpression )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5335:1: ruleExpression
            {
             before(grammarAccess.getDeclarationAccess().getValExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Declaration__ValAssignment_310890);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getValExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ValAssignment_3"


    // $ANTLR start "rule__Assignation__VarAssignment_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5344:1: rule__Assignation__VarAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Assignation__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5348:1: ( ( ruleVariableReference ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5349:1: ( ruleVariableReference )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5349:1: ( ruleVariableReference )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5350:1: ruleVariableReference
            {
             before(grammarAccess.getAssignationAccess().getVarVariableReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVariableReference_in_rule__Assignation__VarAssignment_010921);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getAssignationAccess().getVarVariableReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__VarAssignment_0"


    // $ANTLR start "rule__Assignation__ExprAssignment_2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5359:1: rule__Assignation__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignation__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5363:1: ( ( ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5364:1: ( ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5364:1: ( ruleExpression )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5365:1: ruleExpression
            {
             before(grammarAccess.getAssignationAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignation__ExprAssignment_210952);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssignationAccess().getExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__ExprAssignment_2"


    // $ANTLR start "rule__Expression__TypeAssignment_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5374:1: rule__Expression__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Expression__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5378:1: ( ( ruleType ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5379:1: ( ruleType )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5379:1: ( ruleType )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5380:1: ruleType
            {
             before(grammarAccess.getExpressionAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Expression__TypeAssignment_010983);
            ruleType();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__TypeAssignment_0"


    // $ANTLR start "rule__Expression__VarAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5389:1: rule__Expression__VarAssignment_1 : ( ruleVariable ) ;
    public final void rule__Expression__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5393:1: ( ( ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5394:1: ( ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5394:1: ( ruleVariable )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5395:1: ruleVariable
            {
             before(grammarAccess.getExpressionAccess().getVarVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Expression__VarAssignment_111014);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getVarVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__VarAssignment_1"


    // $ANTLR start "rule__Expression__ActAssignment_2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5404:1: rule__Expression__ActAssignment_2 : ( ruleActionExpression ) ;
    public final void rule__Expression__ActAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5408:1: ( ( ruleActionExpression ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5409:1: ( ruleActionExpression )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5409:1: ( ruleActionExpression )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5410:1: ruleActionExpression
            {
             before(grammarAccess.getExpressionAccess().getActActionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleActionExpression_in_rule__Expression__ActAssignment_211045);
            ruleActionExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getActActionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ActAssignment_2"


    // $ANTLR start "rule__Expression__LeftAssignment_3_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5419:1: rule__Expression__LeftAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Expression__LeftAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5423:1: ( ( ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5424:1: ( ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5424:1: ( ruleExpression )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5425:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getLeftExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__LeftAssignment_3_111076);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLeftExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__LeftAssignment_3_1"


    // $ANTLR start "rule__Expression__RightAssignment_3_2"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5434:1: rule__Expression__RightAssignment_3_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5438:1: ( ( ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5439:1: ( ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5439:1: ( ruleExpression )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5440:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_3_211107);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_3_2"


    // $ANTLR start "rule__Expression__ExpAssignment_4_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5449:1: rule__Expression__ExpAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__Expression__ExpAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5453:1: ( ( ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5454:1: ( ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5454:1: ( ruleExpression )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5455:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getExpExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__ExpAssignment_4_111138);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpAssignment_4_1"


    // $ANTLR start "rule__Variable__VarAssignment"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5464:1: rule__Variable__VarAssignment : ( ruleVariableReference ) ;
    public final void rule__Variable__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5468:1: ( ( ruleVariableReference ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5469:1: ( ruleVariableReference )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5469:1: ( ruleVariableReference )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5470:1: ruleVariableReference
            {
             before(grammarAccess.getVariableAccess().getVarVariableReferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleVariableReference_in_rule__Variable__VarAssignment11169);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getVarVariableReferenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__VarAssignment"


    // $ANTLR start "rule__ActionExpression__ExprAssignment_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5479:1: rule__ActionExpression__ExprAssignment_0 : ( ruleVerify ) ;
    public final void rule__ActionExpression__ExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5483:1: ( ( ruleVerify ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5484:1: ( ruleVerify )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5484:1: ( ruleVerify )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5485:1: ruleVerify
            {
             before(grammarAccess.getActionExpressionAccess().getExprVerifyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVerify_in_rule__ActionExpression__ExprAssignment_011200);
            ruleVerify();

            state._fsp--;

             after(grammarAccess.getActionExpressionAccess().getExprVerifyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression__ExprAssignment_0"


    // $ANTLR start "rule__ActionExpression__ExprAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5494:1: rule__ActionExpression__ExprAssignment_1 : ( ruleExist ) ;
    public final void rule__ActionExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5498:1: ( ( ruleExist ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5499:1: ( ruleExist )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5499:1: ( ruleExist )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5500:1: ruleExist
            {
             before(grammarAccess.getActionExpressionAccess().getExprExistParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExist_in_rule__ActionExpression__ExprAssignment_111231);
            ruleExist();

            state._fsp--;

             after(grammarAccess.getActionExpressionAccess().getExprExistParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression__ExprAssignment_1"


    // $ANTLR start "rule__Checkbox__CheckAssignment_1_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5509:1: rule__Checkbox__CheckAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Checkbox__CheckAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5513:1: ( ( RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5514:1: ( RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5514:1: ( RULE_STRING )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5515:1: RULE_STRING
            {
             before(grammarAccess.getCheckboxAccess().getCheckSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Checkbox__CheckAssignment_1_011262); 
             after(grammarAccess.getCheckboxAccess().getCheckSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__CheckAssignment_1_0"


    // $ANTLR start "rule__Link__LinkAssignment_1_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5524:1: rule__Link__LinkAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Link__LinkAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5528:1: ( ( RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5529:1: ( RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5529:1: ( RULE_STRING )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5530:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getLinkSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__LinkAssignment_1_011293); 
             after(grammarAccess.getLinkAccess().getLinkSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__LinkAssignment_1_0"


    // $ANTLR start "rule__Button__ButAssignment_1_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5539:1: rule__Button__ButAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Button__ButAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5543:1: ( ( RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5544:1: ( RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5544:1: ( RULE_STRING )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5545:1: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getButSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Button__ButAssignment_1_011324); 
             after(grammarAccess.getButtonAccess().getButSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ButAssignment_1_0"


    // $ANTLR start "rule__Image__ImgAssignment_1_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5554:1: rule__Image__ImgAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Image__ImgAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5558:1: ( ( RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5559:1: ( RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5559:1: ( RULE_STRING )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5560:1: RULE_STRING
            {
             before(grammarAccess.getImageAccess().getImgSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Image__ImgAssignment_1_011355); 
             after(grammarAccess.getImageAccess().getImgSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__ImgAssignment_1_0"


    // $ANTLR start "rule__TextField__TextAssignment_1_0"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5569:1: rule__TextField__TextAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__TextField__TextAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5573:1: ( ( RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5574:1: ( RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5574:1: ( RULE_STRING )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5575:1: RULE_STRING
            {
             before(grammarAccess.getTextFieldAccess().getTextSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextField__TextAssignment_1_011386); 
             after(grammarAccess.getTextFieldAccess().getTextSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__TextAssignment_1_0"


    // $ANTLR start "rule__TypeElement__ElemAssignment"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5584:1: rule__TypeElement__ElemAssignment : ( ( rule__TypeElement__ElemAlternatives_0 ) ) ;
    public final void rule__TypeElement__ElemAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5588:1: ( ( ( rule__TypeElement__ElemAlternatives_0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5589:1: ( ( rule__TypeElement__ElemAlternatives_0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5589:1: ( ( rule__TypeElement__ElemAlternatives_0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5590:1: ( rule__TypeElement__ElemAlternatives_0 )
            {
             before(grammarAccess.getTypeElementAccess().getElemAlternatives_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5591:1: ( rule__TypeElement__ElemAlternatives_0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5591:2: rule__TypeElement__ElemAlternatives_0
            {
            pushFollow(FOLLOW_rule__TypeElement__ElemAlternatives_0_in_rule__TypeElement__ElemAssignment11417);
            rule__TypeElement__ElemAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeElementAccess().getElemAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeElement__ElemAssignment"


    // $ANTLR start "rule__Select__ValueAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5600:1: rule__Select__ValueAssignment_1 : ( ruleTypeElement ) ;
    public final void rule__Select__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5604:1: ( ( ruleTypeElement ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5605:1: ( ruleTypeElement )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5605:1: ( ruleTypeElement )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5606:1: ruleTypeElement
            {
             before(grammarAccess.getSelectAccess().getValueTypeElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeElement_in_rule__Select__ValueAssignment_111450);
            ruleTypeElement();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getValueTypeElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ValueAssignment_1"


    // $ANTLR start "rule__Click__ValAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5615:1: rule__Click__ValAssignment_1 : ( ( rule__Click__ValAlternatives_1_0 ) ) ;
    public final void rule__Click__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5619:1: ( ( ( rule__Click__ValAlternatives_1_0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5620:1: ( ( rule__Click__ValAlternatives_1_0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5620:1: ( ( rule__Click__ValAlternatives_1_0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5621:1: ( rule__Click__ValAlternatives_1_0 )
            {
             before(grammarAccess.getClickAccess().getValAlternatives_1_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5622:1: ( rule__Click__ValAlternatives_1_0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5622:2: rule__Click__ValAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Click__ValAlternatives_1_0_in_rule__Click__ValAssignment_111481);
            rule__Click__ValAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getValAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__ValAssignment_1"


    // $ANTLR start "rule__Check__ValAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5631:1: rule__Check__ValAssignment_1 : ( ( rule__Check__ValAlternatives_1_0 ) ) ;
    public final void rule__Check__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5635:1: ( ( ( rule__Check__ValAlternatives_1_0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5636:1: ( ( rule__Check__ValAlternatives_1_0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5636:1: ( ( rule__Check__ValAlternatives_1_0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5637:1: ( rule__Check__ValAlternatives_1_0 )
            {
             before(grammarAccess.getCheckAccess().getValAlternatives_1_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5638:1: ( rule__Check__ValAlternatives_1_0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5638:2: rule__Check__ValAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Check__ValAlternatives_1_0_in_rule__Check__ValAssignment_111514);
            rule__Check__ValAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getValAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__ValAssignment_1"


    // $ANTLR start "rule__Fill__ValAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5647:1: rule__Fill__ValAssignment_1 : ( ( rule__Fill__ValAlternatives_1_0 ) ) ;
    public final void rule__Fill__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5651:1: ( ( ( rule__Fill__ValAlternatives_1_0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5652:1: ( ( rule__Fill__ValAlternatives_1_0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5652:1: ( ( rule__Fill__ValAlternatives_1_0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5653:1: ( rule__Fill__ValAlternatives_1_0 )
            {
             before(grammarAccess.getFillAccess().getValAlternatives_1_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5654:1: ( rule__Fill__ValAlternatives_1_0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5654:2: rule__Fill__ValAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Fill__ValAlternatives_1_0_in_rule__Fill__ValAssignment_111547);
            rule__Fill__ValAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getValAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__ValAssignment_1"


    // $ANTLR start "rule__Exist__ValAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5663:1: rule__Exist__ValAssignment_1 : ( ( rule__Exist__ValAlternatives_1_0 ) ) ;
    public final void rule__Exist__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5667:1: ( ( ( rule__Exist__ValAlternatives_1_0 ) ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5668:1: ( ( rule__Exist__ValAlternatives_1_0 ) )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5668:1: ( ( rule__Exist__ValAlternatives_1_0 ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5669:1: ( rule__Exist__ValAlternatives_1_0 )
            {
             before(grammarAccess.getExistAccess().getValAlternatives_1_0()); 
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5670:1: ( rule__Exist__ValAlternatives_1_0 )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5670:2: rule__Exist__ValAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Exist__ValAlternatives_1_0_in_rule__Exist__ValAssignment_111580);
            rule__Exist__ValAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExistAccess().getValAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exist__ValAssignment_1"


    // $ANTLR start "rule__GoTo__UrlAssignment_1"
    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5679:1: rule__GoTo__UrlAssignment_1 : ( RULE_URL ) ;
    public final void rule__GoTo__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5683:1: ( ( RULE_URL ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5684:1: ( RULE_URL )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5684:1: ( RULE_URL )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:5685:1: RULE_URL
            {
             before(grammarAccess.getGoToAccess().getUrlURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__GoTo__UrlAssignment_111613); 
             after(grammarAccess.getGoToAccess().getUrlURLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__UrlAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__0_in_ruleSubroutine154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Alternatives_in_ruleHead214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_entryRuleFunctionReference241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionReference248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionReference__FunctionNameAssignment_in_ruleFunctionReference274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__VarIDAssignment_in_ruleVariableReference334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Alternatives_in_ruleFunctionCall394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionName__NameAssignment_in_ruleFunctionName454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0_in_ruleMain514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0_in_ruleBody574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionInstruction_in_entryRuleActionInstruction781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionInstruction788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionInstruction__Alternatives_in_ruleActionInstruction814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableName__NameAssignment_in_ruleVariableName874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_entryRuleAssignation961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignation968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group__0_in_ruleAssignation994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__VarAssignment_in_ruleVariable1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_entryRuleActionExpression1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionExpression1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionExpression__Alternatives_in_ruleActionExpression1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_entryRuleClickableElement1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClickableElement1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClickableElement__Alternatives_in_ruleClickableElement1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_entryRuleFillableElement1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFillableElement1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_ruleFillableElement1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckableElement1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_ruleCheckableElement1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_entryRuleCheckbox1499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckbox1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Checkbox__Group__0_in_ruleCheckbox1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage1679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__0_in_ruleImage1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField1739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextField1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__0_in_ruleTextField1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeElement_in_entryRuleTypeElement1799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeElement1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeElement__ElemAssignment_in_ruleTypeElement1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect1859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__0_in_ruleSelect1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_entryRuleClick1919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClick1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__Group__0_in_ruleClick1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck1979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__Group__0_in_ruleCheck2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_entryRuleFill2039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFill2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__0_in_ruleFill2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_entryRuleClear2099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClear2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Clear__Group__0_in_ruleClear2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_entryRuleVerify2159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerify2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Group__0_in_ruleVerify2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_entryRuleExist2219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExist2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exist__Group__0_in_ruleExist2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_entryRuleGoTo2279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoTo2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__Group__0_in_ruleGoTo2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Group_0__0_in_rule__Head__Alternatives2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Group_1__0_in_rule__Head__Alternatives2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_0__0_in_rule__FunctionCall__Alternatives2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1__0_in_rule__FunctionCall__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__DecAssignment_0_in_rule__Instruction__Alternatives2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__CondAssignment_1_in_rule__Instruction__Alternatives2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__WhileAssignment_2_in_rule__Instruction__Alternatives2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__ActAssignment_3_in_rule__Instruction__Alternatives2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__AssAssignment_4_in_rule__Instruction__Alternatives2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__SubAssignment_5_in_rule__Instruction__Alternatives2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Condition__Alternatives_12574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Condition__Alternatives_12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionInstruction__ActionAssignment_0_in_rule__ActionInstruction__Alternatives2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionInstruction__ActionAssignment_1_in_rule__ActionInstruction__Alternatives2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionInstruction__ActionAssignment_2_in_rule__ActionInstruction__Alternatives2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionInstruction__ActionAssignment_3_in_rule__ActionInstruction__Alternatives2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_rule__ActionInstruction__Alternatives2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__TypeAssignment_0_in_rule__Expression__Alternatives2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__VarAssignment_1_in_rule__Expression__Alternatives2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ActAssignment_2_in_rule__Expression__Alternatives2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__0_in_rule__Expression__Alternatives2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_4__0_in_rule__Expression__Alternatives2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Expression__Alternatives_3_02838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Expression__Alternatives_3_02858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Expression__Alternatives_3_02878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Alternatives2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Alternatives2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type__Alternatives2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionExpression__ExprAssignment_0_in_rule__ActionExpression__Alternatives2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionExpression__ExprAssignment_1_in_rule__ActionExpression__Alternatives3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_rule__Element__Alternatives3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_rule__Element__Alternatives3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_rule__Element__Alternatives3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ClickableElement__Alternatives3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_rule__ClickableElement__Alternatives3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_rule__ClickableElement__Alternatives3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Checkbox__CheckAssignment_1_0_in_rule__Checkbox__Alternatives_13170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Checkbox__Alternatives_13188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__LinkAssignment_1_0_in_rule__Link__Alternatives_13220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Link__Alternatives_13238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__ButAssignment_1_0_in_rule__Button__Alternatives_13270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Button__Alternatives_13288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__ImgAssignment_1_0_in_rule__Image__Alternatives_13320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Image__Alternatives_13338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__TextAssignment_1_0_in_rule__TextField__Alternatives_13370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__TextField__Alternatives_13388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeElement__ElemAlternatives_03421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeElement__ElemAlternatives_03441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeElement__ElemAlternatives_03461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeElement__ElemAlternatives_03481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TypeElement__ElemAlternatives_03501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_rule__Click__ValAlternatives_1_03535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_rule__Click__ValAlternatives_1_03552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_rule__Check__ValAlternatives_1_03584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_rule__Check__ValAlternatives_1_03601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_rule__Fill__ValAlternatives_1_03633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_rule__Fill__ValAlternatives_1_03650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_rule__Clear__Alternatives_13682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_rule__Clear__Alternatives_13699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_rule__Clear__Alternatives_13716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_rule__Verify__Alternatives_13748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_rule__Verify__Alternatives_13765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_rule__Verify__Alternatives_13782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Exist__ValAlternatives_1_03814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_rule__Exist__ValAlternatives_1_03831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__03861 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__03864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SubAssignment_0_in_rule__Program__Group__0__Impl3891 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__13922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__MainAssignment_1_in_rule__Program__Group__1__Impl3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__0__Impl_in_rule__Subroutine__Group__03983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__1_in_rule__Subroutine__Group__03986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Subroutine__Group__0__Impl4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__1__Impl_in_rule__Subroutine__Group__14045 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__2_in_rule__Subroutine__Group__14048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__HeadAssignment_1_in_rule__Subroutine__Group__1__Impl4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__2__Impl_in_rule__Subroutine__Group__24105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__BodyAssignment_2_in_rule__Subroutine__Group__2__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Group_0__0__Impl_in_rule__Head__Group_0__04168 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Head__Group_0__1_in_rule__Head__Group_0__04171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__NameAssignment_0_0_in_rule__Head__Group_0__0__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Group_0__1__Impl_in_rule__Head__Group_0__14228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Head__Group_0__1__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Group_1__0__Impl_in_rule__Head__Group_1__04291 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Head__Group_1__1_in_rule__Head__Group_1__04294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__NameAssignment_1_0_in_rule__Head__Group_1__0__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Group_1__1__Impl_in_rule__Head__Group_1__14351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Head__Group_1__2_in_rule__Head__Group_1__14354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Head__Group_1__1__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Group_1__2__Impl_in_rule__Head__Group_1__24413 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Head__Group_1__3_in_rule__Head__Group_1__24416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__VarIdAssignment_1_2_in_rule__Head__Group_1__2__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Group_1__3__Impl_in_rule__Head__Group_1__34473 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Head__Group_1__4_in_rule__Head__Group_1__34476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Group_1_3__0_in_rule__Head__Group_1__3__Impl4503 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Head__Group_1__4__Impl_in_rule__Head__Group_1__44534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Head__Group_1__4__Impl4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Group_1_3__0__Impl_in_rule__Head__Group_1_3__04603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Head__Group_1_3__1_in_rule__Head__Group_1_3__04606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Head__Group_1_3__0__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__Group_1_3__1__Impl_in_rule__Head__Group_1_3__14665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__VarIdAssignment_1_3_1_in_rule__Head__Group_1_3__1__Impl4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_0__0__Impl_in_rule__FunctionCall__Group_0__04726 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_0__1_in_rule__FunctionCall__Group_0__04729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_rule__FunctionCall__Group_0__0__Impl4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_0__1__Impl_in_rule__FunctionCall__Group_0__14785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FunctionCall__Group_0__1__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1__0__Impl_in_rule__FunctionCall__Group_1__04848 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1__1_in_rule__FunctionCall__Group_1__04851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_rule__FunctionCall__Group_1__0__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1__1__Impl_in_rule__FunctionCall__Group_1__14907 = new BitSet(new long[]{0x0C002000000FC020L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1__2_in_rule__FunctionCall__Group_1__14910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionCall__Group_1__1__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1__2__Impl_in_rule__FunctionCall__Group_1__24969 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1__3_in_rule__FunctionCall__Group_1__24972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__VarAssignment_1_2_in_rule__FunctionCall__Group_1__2__Impl4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1__3__Impl_in_rule__FunctionCall__Group_1__35029 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1__4_in_rule__FunctionCall__Group_1__35032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1_3__0_in_rule__FunctionCall__Group_1__3__Impl5059 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1__4__Impl_in_rule__FunctionCall__Group_1__45090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionCall__Group_1__4__Impl5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1_3__0__Impl_in_rule__FunctionCall__Group_1_3__05159 = new BitSet(new long[]{0x0C002000000FC020L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1_3__1_in_rule__FunctionCall__Group_1_3__05162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionCall__Group_1_3__0__Impl5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_1_3__1__Impl_in_rule__FunctionCall__Group_1_3__15221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__VarAssignment_1_3_1_in_rule__FunctionCall__Group_1_3__1__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__05282 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Main__Group__1_in_rule__Main__Group__05285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Main__Group__0__Impl5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__15344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__Main__Group__1__Impl5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__05404 = new BitSet(new long[]{0x12D0048800000020L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__05407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Body__Group__0__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__15466 = new BitSet(new long[]{0x12D0048C00000020L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__15469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__InstructionsAssignment_1_in_rule__Body__Group__1__Impl5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__25526 = new BitSet(new long[]{0x12D0048C00000020L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__25529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__InstructionsAssignment_2_in_rule__Body__Group__2__Impl5556 = new BitSet(new long[]{0x12D0048800000022L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__35587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Body__Group__3__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05654 = new BitSet(new long[]{0x0000000040003000L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Condition__Group__0__Impl5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15716 = new BitSet(new long[]{0x0000000040003000L});
    public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__15719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__25777 = new BitSet(new long[]{0x0C002000000FC020L});
    public static final BitSet FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__25780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Condition__Group__2__Impl5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__35839 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Condition__Group__4_in_rule__Condition__Group__35842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ExpAssignment_3_in_rule__Condition__Group__3__Impl5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__4__Impl_in_rule__Condition__Group__45899 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Condition__Group__5_in_rule__Condition__Group__45902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Condition__Group__4__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__5__Impl_in_rule__Condition__Group__55961 = new BitSet(new long[]{0x12D0048800000020L});
    public static final BitSet FOLLOW_rule__Condition__Group__6_in_rule__Condition__Group__55964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Condition__Group__5__Impl5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__6__Impl_in_rule__Condition__Group__66023 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Condition__Group__7_in_rule__Condition__Group__66026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__InsAssignment_6_in_rule__Condition__Group__6__Impl6055 = new BitSet(new long[]{0x12D0048800000022L});
    public static final BitSet FOLLOW_rule__Condition__InsAssignment_6_in_rule__Condition__Group__6__Impl6067 = new BitSet(new long[]{0x12D0048800000022L});
    public static final BitSet FOLLOW_rule__Condition__Group__7__Impl_in_rule__Condition__Group__76100 = new BitSet(new long[]{0x12D0048800000020L});
    public static final BitSet FOLLOW_rule__Condition__Group__8_in_rule__Condition__Group__76103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Condition__Group__7__Impl6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__8__Impl_in_rule__Condition__Group__86162 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Condition__Group__9_in_rule__Condition__Group__86165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Ins2Assignment_8_in_rule__Condition__Group__8__Impl6194 = new BitSet(new long[]{0x12D0048800000022L});
    public static final BitSet FOLLOW_rule__Condition__Ins2Assignment_8_in_rule__Condition__Group__8__Impl6206 = new BitSet(new long[]{0x12D0048800000022L});
    public static final BitSet FOLLOW_rule__Condition__Group__9__Impl_in_rule__Condition__Group__96239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Condition__Group__9__Impl6267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__06318 = new BitSet(new long[]{0x0C002000000FC020L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__06321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__While__Group__0__Impl6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__16380 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__16383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ExpAssignment_1_in_rule__While__Group__1__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__26440 = new BitSet(new long[]{0x12D0048800000020L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__26443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__While__Group__2__Impl6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__36502 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__36505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__InsAssignment_3_in_rule__While__Group__3__Impl6534 = new BitSet(new long[]{0x12D0048800000022L});
    public static final BitSet FOLLOW_rule__While__InsAssignment_3_in_rule__While__Group__3__Impl6546 = new BitSet(new long[]{0x12D0048800000022L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__46579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__While__Group__4__Impl6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__06648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__06651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Declaration__Group__0__Impl6679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__16710 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__16713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl6740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__26770 = new BitSet(new long[]{0x0C002000000FC020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__26773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Declaration__Group__2__Impl6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__36832 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__36835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ValAssignment_3_in_rule__Declaration__Group__3__Impl6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__46892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Declaration__Group__4__Impl6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group__0__Impl_in_rule__Assignation__Group__06961 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Assignation__Group__1_in_rule__Assignation__Group__06964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__VarAssignment_0_in_rule__Assignation__Group__0__Impl6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group__1__Impl_in_rule__Assignation__Group__17021 = new BitSet(new long[]{0x0C002000000FC020L});
    public static final BitSet FOLLOW_rule__Assignation__Group__2_in_rule__Assignation__Group__17024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Assignation__Group__1__Impl7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group__2__Impl_in_rule__Assignation__Group__27083 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Assignation__Group__3_in_rule__Assignation__Group__27086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__ExprAssignment_2_in_rule__Assignation__Group__2__Impl7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group__3__Impl_in_rule__Assignation__Group__37143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Assignation__Group__3__Impl7171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__0__Impl_in_rule__Expression__Group_3__07210 = new BitSet(new long[]{0x0C002000000FC020L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__1_in_rule__Expression__Group_3__07213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_3_0_in_rule__Expression__Group_3__0__Impl7240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__1__Impl_in_rule__Expression__Group_3__17270 = new BitSet(new long[]{0x0C002000000FC020L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__2_in_rule__Expression__Group_3__17273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__LeftAssignment_3_1_in_rule__Expression__Group_3__1__Impl7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__2__Impl_in_rule__Expression__Group_3__27330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_3_2_in_rule__Expression__Group_3__2__Impl7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_4__0__Impl_in_rule__Expression__Group_4__07393 = new BitSet(new long[]{0x0C002000000FC020L});
    public static final BitSet FOLLOW_rule__Expression__Group_4__1_in_rule__Expression__Group_4__07396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Expression__Group_4__0__Impl7424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_4__1__Impl_in_rule__Expression__Group_4__17455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ExpAssignment_4_1_in_rule__Expression__Group_4__1__Impl7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Checkbox__Group__0__Impl_in_rule__Checkbox__Group__07516 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Checkbox__Group__1_in_rule__Checkbox__Group__07519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Checkbox__Group__0__Impl7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Checkbox__Group__1__Impl_in_rule__Checkbox__Group__17578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Checkbox__Alternatives_1_in_rule__Checkbox__Group__1__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__07639 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__07642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Link__Group__0__Impl7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__17701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Alternatives_1_in_rule__Link__Group__1__Impl7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__07762 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__07765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Button__Group__0__Impl7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__17824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Alternatives_1_in_rule__Button__Group__1__Impl7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__07885 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Image__Group__1_in_rule__Image__Group__07888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Image__Group__0__Impl7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__17947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Alternatives_1_in_rule__Image__Group__1__Impl7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__08008 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__08011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TextField__Group__0__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__18070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Alternatives_1_in_rule__TextField__Group__1__Impl8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__0__Impl_in_rule__Select__Group__08131 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_rule__Select__Group__1_in_rule__Select__Group__08134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Select__Group__0__Impl8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__1__Impl_in_rule__Select__Group__18193 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Select__Group__2_in_rule__Select__Group__18196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__ValueAssignment_1_in_rule__Select__Group__1__Impl8223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__2__Impl_in_rule__Select__Group__28253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Select__Group__2__Impl8281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__Group__0__Impl_in_rule__Click__Group__08318 = new BitSet(new long[]{0x000B800000000000L});
    public static final BitSet FOLLOW_rule__Click__Group__1_in_rule__Click__Group__08321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Click__Group__0__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__Group__1__Impl_in_rule__Click__Group__18380 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Click__Group__2_in_rule__Click__Group__18383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__ValAssignment_1_in_rule__Click__Group__1__Impl8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__Group__2__Impl_in_rule__Click__Group__28440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Click__Group__2__Impl8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__Group__0__Impl_in_rule__Check__Group__08505 = new BitSet(new long[]{0x000BC00000000000L});
    public static final BitSet FOLLOW_rule__Check__Group__1_in_rule__Check__Group__08508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Check__Group__0__Impl8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__Group__1__Impl_in_rule__Check__Group__18567 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Check__Group__2_in_rule__Check__Group__18570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__ValAssignment_1_in_rule__Check__Group__1__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__Group__2__Impl_in_rule__Check__Group__28627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Check__Group__2__Impl8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__0__Impl_in_rule__Fill__Group__08692 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_rule__Fill__Group__1_in_rule__Fill__Group__08695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Fill__Group__0__Impl8723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__1__Impl_in_rule__Fill__Group__18754 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Fill__Group__2_in_rule__Fill__Group__18757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__ValAssignment_1_in_rule__Fill__Group__1__Impl8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__2__Impl_in_rule__Fill__Group__28814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fill__Group__3_in_rule__Fill__Group__28817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Fill__Group__2__Impl8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__3__Impl_in_rule__Fill__Group__38876 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Fill__Group__4_in_rule__Fill__Group__38879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Fill__Group__3__Impl8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__4__Impl_in_rule__Fill__Group__48935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Fill__Group__4__Impl8963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Clear__Group__0__Impl_in_rule__Clear__Group__09004 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_rule__Clear__Group__1_in_rule__Clear__Group__09007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Clear__Group__0__Impl9035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Clear__Group__1__Impl_in_rule__Clear__Group__19066 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Clear__Group__2_in_rule__Clear__Group__19069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Clear__Alternatives_1_in_rule__Clear__Group__1__Impl9096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Clear__Group__2__Impl_in_rule__Clear__Group__29126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Clear__Group__2__Impl9154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Group__0__Impl_in_rule__Verify__Group__09191 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_rule__Verify__Group__1_in_rule__Verify__Group__09194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Verify__Group__0__Impl9222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Group__1__Impl_in_rule__Verify__Group__19253 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Verify__Group__2_in_rule__Verify__Group__19256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Alternatives_1_in_rule__Verify__Group__1__Impl9283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Group__2__Impl_in_rule__Verify__Group__29313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Verify__Group__3_in_rule__Verify__Group__29316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Verify__Group__2__Impl9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Group__3__Impl_in_rule__Verify__Group__39375 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Verify__Group__4_in_rule__Verify__Group__39378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Verify__Group__3__Impl9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Group__4__Impl_in_rule__Verify__Group__49434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Verify__Group__4__Impl9462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exist__Group__0__Impl_in_rule__Exist__Group__09503 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_rule__Exist__Group__1_in_rule__Exist__Group__09506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Exist__Group__0__Impl9534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exist__Group__1__Impl_in_rule__Exist__Group__19565 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Exist__Group__2_in_rule__Exist__Group__19568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exist__ValAssignment_1_in_rule__Exist__Group__1__Impl9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exist__Group__2__Impl_in_rule__Exist__Group__29625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Exist__Group__2__Impl9653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__Group__0__Impl_in_rule__GoTo__Group__09690 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GoTo__Group__1_in_rule__GoTo__Group__09693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__GoTo__Group__0__Impl9721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__Group__1__Impl_in_rule__GoTo__Group__19752 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__GoTo__Group__2_in_rule__GoTo__Group__19755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__UrlAssignment_1_in_rule__GoTo__Group__1__Impl9782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__Group__2__Impl_in_rule__GoTo__Group__29812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__GoTo__Group__2__Impl9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_rule__Program__SubAssignment_09882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__Program__MainAssignment_19913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_rule__Subroutine__HeadAssignment_19944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__Subroutine__BodyAssignment_29975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_rule__Head__NameAssignment_0_010006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_rule__Head__NameAssignment_1_010037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_rule__Head__VarIdAssignment_1_210068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_rule__Head__VarIdAssignment_1_3_110099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionReference__FunctionNameAssignment10134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VarIDAssignment10173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionCall__VarAssignment_1_210208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionCall__VarAssignment_1_3_110239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionName__NameAssignment10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Body__InstructionsAssignment_110301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Body__InstructionsAssignment_210332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Instruction__DecAssignment_010363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Instruction__CondAssignment_110394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__Instruction__WhileAssignment_210425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionInstruction_in_rule__Instruction__ActAssignment_310456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_rule__Instruction__AssAssignment_410487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rule__Instruction__SubAssignment_510518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Condition__ExpAssignment_310549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Condition__InsAssignment_610580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Condition__Ins2Assignment_810611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__While__ExpAssignment_110642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__While__InsAssignment_310673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_rule__ActionInstruction__ActionAssignment_010704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_rule__ActionInstruction__ActionAssignment_110735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_rule__ActionInstruction__ActionAssignment_210766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_rule__ActionInstruction__ActionAssignment_310797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VariableName__NameAssignment10828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_rule__Declaration__NameAssignment_110859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Declaration__ValAssignment_310890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__Assignation__VarAssignment_010921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignation__ExprAssignment_210952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Expression__TypeAssignment_010983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Expression__VarAssignment_111014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_rule__Expression__ActAssignment_211045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__LeftAssignment_3_111076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_3_211107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__ExpAssignment_4_111138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__Variable__VarAssignment11169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_rule__ActionExpression__ExprAssignment_011200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_rule__ActionExpression__ExprAssignment_111231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Checkbox__CheckAssignment_1_011262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__LinkAssignment_1_011293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Button__ButAssignment_1_011324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Image__ImgAssignment_1_011355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextField__TextAssignment_1_011386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeElement__ElemAlternatives_0_in_rule__TypeElement__ElemAssignment11417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeElement_in_rule__Select__ValueAssignment_111450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__ValAlternatives_1_0_in_rule__Click__ValAssignment_111481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__ValAlternatives_1_0_in_rule__Check__ValAssignment_111514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__ValAlternatives_1_0_in_rule__Fill__ValAssignment_111547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exist__ValAlternatives_1_0_in_rule__Exist__ValAssignment_111580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__GoTo__UrlAssignment_111613 = new BitSet(new long[]{0x0000000000000002L});

}